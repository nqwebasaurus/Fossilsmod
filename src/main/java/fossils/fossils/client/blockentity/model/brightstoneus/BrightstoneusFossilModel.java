package fossils.fossils.client.blockentity.model.brightstoneus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BrightstoneusFossilModel extends SkullModelBase {
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

	public BrightstoneusFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0F, 6.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(112, 18).mirror().addBox(0.0212F, -1.0805F, 3.4966F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 101).mirror().addBox(-0.0791F, -0.2757F, -0.1129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 7.7555F, 8.5878F, -0.8453F, 0.2471F, -0.0953F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(0.0F, 0.2305F, -7.9063F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -4.1799F, -2.4011F, 0.2618F, 0.1309F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(0.0F, -1.0052F, -7.9648F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(15, 81).mirror().addBox(0.0F, 2.9005F, -6.0953F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -4.1799F, -2.4011F, 0.4189F, 0.1309F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 116).mirror().addBox(0.0F, -2.0686F, 1.189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -2.6922F, 3.2373F, -0.4887F, -0.2094F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-5.0F, -0.0249F, 0.0025F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 0).addBox(2.0F, -0.0249F, 0.0025F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -5.1F, -2.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(115, 115).mirror().addBox(0.0F, -1.583F, -0.2122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -2.6922F, 3.2373F, -0.1396F, -0.2094F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(-0.0791F, -0.2765F, -0.0699F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 7.7555F, 8.5878F, -0.7057F, 0.2471F, -0.0953F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(101, 19).mirror().addBox(-0.5F, -0.2092F, 5.0099F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.2555F, 1.5878F, -0.6458F, 0.2967F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(113, 64).mirror().addBox(-0.5F, 1.9936F, -1.4226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.2555F, 1.5878F, 0.5061F, 0.2967F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.5F, -0.9299F, -4.8279F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 88).addBox(6.5F, -0.9299F, -4.8279F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.5F, 3.7374F, 2.7965F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(-0.5F, -0.6945F, -2.9892F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.5889F, -2.9982F, -0.5585F, 0.3316F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(-0.5F, -0.8281F, 3.5928F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.5889F, -2.9982F, -0.5934F, 0.3316F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 90).mirror().addBox(-0.5F, -0.6374F, 0.0619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.2555F, 1.5878F, -0.733F, 0.2967F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(0.0F, 6.9951F, -2.5534F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -4.1799F, -2.4011F, -0.6807F, 0.1309F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(80, 54).mirror().addBox(0.0F, 4.8779F, -6.7295F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -4.1799F, -2.4011F, -0.2269F, 0.1309F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(-3.0F, 1.0F, 2.2F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 61).mirror().addBox(-4.0F, 0.0F, 3.2F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 34).addBox(1.0F, 1.0F, 2.2F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(50, 61).addBox(3.0F, 0.0F, 3.2F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(84, 85).mirror().addBox(0.0F, 0.7891F, -1.4974F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -2.6922F, 3.2373F, 0.2793F, -0.2094F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 107).mirror().addBox(0.0F, 0.0983F, -2.0064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -4.1799F, -2.4011F, -0.1222F, 0.1309F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(105, 6).mirror().addBox(0.0F, -0.9972F, -0.4214F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -2.6922F, 3.2373F, -0.0175F, -0.2094F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(60, 10).addBox(-1.0F, 0.2305F, -7.9063F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.1799F, -2.4011F, 0.2618F, -0.1309F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, -1.0052F, -7.9648F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(15, 81).addBox(-1.0F, 2.9005F, -6.0953F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.1799F, -2.4011F, 0.4189F, -0.1309F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 116).addBox(-1.0F, -2.0686F, 1.189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.6922F, 3.2373F, -0.4887F, 0.2094F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(115, 115).addBox(-1.0F, -1.583F, -0.2122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.6922F, 3.2373F, -0.1396F, 0.2094F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(112, 18).addBox(-1.0212F, -1.0805F, 3.4966F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(65, 101).addBox(-0.9209F, -0.2757F, -0.1129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 7.7555F, 8.5878F, -0.8453F, -0.2471F, 0.0953F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(101, 25).addBox(-0.9209F, -0.2765F, -0.0699F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8F, 7.7555F, 8.5878F, -0.7057F, -0.2471F, 0.0953F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(101, 19).addBox(-0.5F, -0.2092F, 5.0099F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.2555F, 1.5878F, -0.6458F, -0.2967F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(113, 64).addBox(-0.5F, 1.9936F, -1.4226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.2555F, 1.5878F, 0.5061F, -0.2967F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(63, 61).addBox(-0.5F, -0.6945F, -2.9892F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, 2.5889F, -2.9982F, -0.5585F, -0.3316F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(60, 20).addBox(-0.5F, -0.8281F, 3.5928F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, 2.5889F, -2.9982F, -0.5934F, -0.3316F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(13, 90).addBox(-0.5F, -0.6374F, 0.0619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5F, 2.2555F, 1.5878F, -0.733F, -0.2967F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(80, 63).addBox(-1.0F, 6.9951F, -2.5534F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0F, -4.1799F, -2.4011F, -0.6807F, -0.1309F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(80, 54).addBox(-1.0F, 4.8779F, -6.7295F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.0F, -4.1799F, -2.4011F, -0.2269F, -0.1309F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(84, 85).addBox(-1.0F, 0.7891F, -1.4974F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0F, -2.6922F, 3.2373F, 0.2793F, 0.2094F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(90, 107).addBox(-1.0F, 0.0983F, -2.0064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.0F, -4.1799F, -2.4011F, -0.1222F, -0.1309F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(105, 6).addBox(-1.0F, -0.9972F, -0.4214F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.0F, -2.6922F, 3.2373F, -0.0175F, 0.2094F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(79, 116).addBox(0.0F, -6.0382F, 0.7324F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8202F, 8.2033F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(88, 116).addBox(0.0F, -5.7382F, 0.5324F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9202F, 6.4033F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(29, 48).addBox(0.0F, -0.9F, -5.5F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.9202F, 2.2033F, -0.1658F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 1.0F, 0.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(75, 38).addBox(-0.5F, -9.7343F, -6.3198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4372F, 6.7917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(92, 46).addBox(-1.0F, -5.4F, -1.4F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(92, 20).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(69, 87).addBox(-1.0F, -10.7937F, -6.8715F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(81, 103).addBox(-1.0F, -8.799F, -6.8693F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.6652F, 4.9178F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(79, 8).addBox(-1.9F, -0.2745F, -2.1999F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.3652F, 0.7178F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(81, 110).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(110, 38).addBox(-0.5F, 7.2F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(42, 95).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 94).addBox(-1.0F, -1.5F, -1.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 14.0271F, -0.7882F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(9, 109).addBox(-1.9F, -15.0978F, 4.4681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(51, 74).addBox(-1.9F, -11.735F, 0.4314F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(91, 92).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.0475F, -0.9467F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(75, 31).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(17, 74).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0696F, -2.9933F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 1.0F, 0.1F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(43, 117).addBox(-0.5F, -9.7343F, -6.3198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4372F, 6.7917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(94, 6).addBox(-1.0F, -5.4F, -1.4F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(82, 92).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(43, 88).addBox(-1.0F, -10.7937F, -6.8715F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(47, 104).addBox(-1.0F, -8.799F, -6.8693F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.6652F, 4.9178F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(69, 79).addBox(-0.1F, -0.2745F, -2.1999F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.3652F, 0.7178F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(108, 111).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(52, 111).addBox(-0.5F, 7.2F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(60, 99).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -1.5F, -1.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 14.0271F, -0.7882F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 111).addBox(-0.1F, -15.0978F, 4.4681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(60, 79).addBox(-0.1F, -11.735F, 0.4314F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(26, 93).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.0475F, -0.9467F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(75, 47).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(34, 74).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, -0.6317F, -10.0364F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.9F, -5.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(119, 19).mirror().addBox(-3.4868F, -0.9855F, 0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2253F, -5.2921F, -0.1745F, -0.3615F, -0.9179F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(119, 32).mirror().addBox(-1.8203F, -0.2603F, 0.366F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2253F, -5.2921F, -0.2925F, -0.1964F, -0.4969F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(97, 90).mirror().addBox(-3.7437F, -2.3667F, 0.4744F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2253F, -5.2921F, 0.0025F, -0.3998F, -1.3867F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(119, 34).mirror().addBox(-3.6627F, -0.9506F, -0.4436F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3104F, -6.517F, 0.0441F, -0.1069F, -0.9529F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(119, 27).mirror().addBox(-1.9078F, -0.1678F, -0.5606F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3104F, -6.517F, 0.0089F, -0.0531F, -0.5185F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(122, 68).mirror().addBox(-3.9178F, -2.4095F, -0.4436F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3104F, -6.517F, 0.0852F, -0.0783F, -1.3902F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(123, 15).mirror().addBox(-3.7963F, -2.4154F, -0.2415F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4439F, -8.6229F, 0.1154F, 0.0312F, -1.3745F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(119, 21).mirror().addBox(-3.5551F, -1.0073F, -0.2415F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4439F, -8.6229F, 0.1178F, -0.0204F, -0.9412F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(107, 4).mirror().addBox(-1.8466F, -0.2615F, -0.3529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4439F, -8.6229F, 0.112F, -0.0056F, -0.5051F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(114, 119).mirror().addBox(-4.7687F, -2.4519F, -0.3047F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7439F, -10.1229F, 0.1277F, 0.0372F, -1.3051F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(118, 2).mirror().addBox(-3.5455F, -1.052F, -0.3047F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7439F, -10.1229F, 0.1315F, -0.0201F, -0.8725F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(119, 25).mirror().addBox(-1.8527F, -0.3069F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7439F, -10.1229F, 0.1246F, -0.0111F, -0.4362F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(83, 29).mirror().addBox(-5.6294F, -2.4729F, -0.0767F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4998F, -12.3153F, 0.1592F, 0.1553F, -1.2847F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(119, 17).mirror().addBox(-3.4282F, -1.13F, -0.0767F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4998F, -12.3153F, 0.2095F, 0.0741F, -0.853F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(120, 66).mirror().addBox(-1.7931F, -0.4237F, -0.1823F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4998F, -12.3153F, 0.235F, 0.0413F, -0.4172F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(120, 78).mirror().addBox(-3.6079F, -0.9716F, -0.1202F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.9439F, -14.3229F, 0.2899F, 0.1666F, -0.8608F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(120, 64).mirror().addBox(-1.887F, -0.2053F, -0.2348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.9439F, -14.3229F, 0.3466F, 0.0916F, -0.4272F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(99, 82).mirror().addBox(-7.8592F, -2.4053F, -0.1202F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.9439F, -14.3229F, 0.1937F, 0.2728F, -1.2949F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(115, 62).mirror().addBox(-3.7362F, -0.8983F, -0.3587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3439F, -15.9229F, 0.3365F, 0.2193F, -0.8519F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(119, 23).mirror().addBox(-1.9578F, -0.0884F, -0.4797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3439F, -15.9229F, 0.4106F, 0.1203F, -0.4204F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-10.0065F, -2.3932F, -0.3587F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3439F, -15.9229F, 0.2139F, 0.3399F, -1.2888F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(120, 74).mirror().addBox(-1.9547F, -0.1149F, -0.5689F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.9439F, -17.7229F, 0.4751F, 0.1485F, -0.3769F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(120, 72).mirror().addBox(-3.7278F, -0.9223F, -0.4482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.9439F, -17.7229F, 0.3842F, 0.2716F, -0.8054F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(79, 16).mirror().addBox(-10.9888F, -2.4114F, -0.4482F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.9439F, -17.7229F, 0.235F, 0.4069F, -1.2462F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(119, 19).addBox(1.4868F, -0.9855F, 0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2253F, -5.2921F, -0.1745F, 0.3615F, 0.9179F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(119, 32).addBox(-0.1797F, -0.2603F, 0.366F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2253F, -5.2921F, -0.2925F, 0.1964F, 0.4969F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(97, 90).addBox(2.7437F, -2.3667F, 0.4744F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2253F, -5.2921F, 0.0025F, 0.3998F, 1.3867F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(119, 34).addBox(1.6627F, -0.9506F, -0.4436F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3104F, -6.517F, 0.0441F, 0.1069F, 0.9529F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(119, 27).addBox(-0.0922F, -0.1678F, -0.5606F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3104F, -6.517F, 0.0089F, 0.0531F, 0.5185F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(122, 68).addBox(2.9178F, -2.4095F, -0.4436F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3104F, -6.517F, 0.0852F, 0.0783F, 1.3902F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(123, 15).addBox(2.7963F, -2.4154F, -0.2415F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4439F, -8.6229F, 0.1154F, -0.0312F, 1.3745F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(119, 21).addBox(1.5551F, -1.0073F, -0.2415F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4439F, -8.6229F, 0.1178F, 0.0204F, 0.9412F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(107, 4).addBox(-0.1534F, -0.2615F, -0.3529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4439F, -8.6229F, 0.112F, 0.0056F, 0.5051F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(114, 119).addBox(2.7687F, -2.4519F, -0.3047F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7439F, -10.1229F, 0.1277F, -0.0372F, 1.3051F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(118, 2).addBox(1.5455F, -1.052F, -0.3047F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7439F, -10.1229F, 0.1315F, 0.0201F, 0.8725F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(119, 25).addBox(-0.1473F, -0.3069F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7439F, -10.1229F, 0.1246F, 0.0111F, 0.4362F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(83, 29).addBox(2.6294F, -2.4729F, -0.0767F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4998F, -12.3153F, 0.1592F, -0.1553F, 1.2847F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(119, 17).addBox(1.4282F, -1.13F, -0.0767F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4998F, -12.3153F, 0.2095F, -0.0741F, 0.853F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(120, 66).addBox(-0.2069F, -0.4237F, -0.1823F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4998F, -12.3153F, 0.235F, -0.0413F, 0.4172F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(120, 78).addBox(1.6079F, -0.9716F, -0.1202F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9439F, -14.3229F, 0.2899F, -0.1666F, 0.8608F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(120, 64).addBox(-0.113F, -0.2053F, -0.2348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9439F, -14.3229F, 0.3466F, -0.0916F, 0.4272F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(99, 82).addBox(2.8592F, -2.4053F, -0.1202F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9439F, -14.3229F, 0.1937F, -0.2728F, 1.2949F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(115, 62).addBox(1.7362F, -0.8983F, -0.3587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3439F, -15.9229F, 0.3365F, -0.2193F, 0.8519F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(119, 23).addBox(-0.0422F, -0.0884F, -0.4797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3439F, -15.9229F, 0.4106F, -0.1203F, 0.4204F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(92, 31).addBox(3.0065F, -2.3932F, -0.3587F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3439F, -15.9229F, 0.2139F, -0.3399F, 1.2888F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(120, 74).addBox(-0.0453F, -0.1149F, -0.5689F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9439F, -17.7229F, 0.4751F, -0.1485F, 0.3769F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(120, 72).addBox(1.7278F, -0.9223F, -0.4482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9439F, -17.7229F, 0.3842F, -0.2716F, 0.8054F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(79, 16).addBox(2.9888F, -2.4114F, -0.4482F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9439F, -17.7229F, 0.235F, -0.4069F, 1.2462F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 48).addBox(-1.0F, 0.0F, -10.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6317F, -10.0364F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(70, 117).addBox(0.01F, -4.0449F, 0.0356F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3032F, -10.9856F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(67, 117).addBox(0.01F, -4.5967F, -0.0328F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4206F, -12.81F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(56, 117).addBox(0.01F, -4.8561F, -0.0186F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9783F, -14.7666F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(53, 117).addBox(0.01F, -0.1216F, -0.4715F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1317F, -17.2302F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(33, 117).addBox(0.01F, -4.1469F, -0.0669F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6032F, -8.9856F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(27, 117).addBox(0.01F, -4.6397F, -0.5012F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4814F, -6.5932F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(105, 112).addBox(0.01F, -5.1045F, -0.1008F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -0.901F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(102, 112).addBox(0.01F, -5.0693F, -0.0073F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -3.001F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(56, 104).addBox(0.01F, 2.919F, -1.5715F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2928F, -3.101F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(30, 117).addBox(0.0F, 4.5009F, -0.5146F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7088F, -21.3319F, 0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2681F, -19.2277F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(17, 65).addBox(-1.0F, 0.0855F, 0.0911F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0199F, -4.8724F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(117, 37).addBox(0.01F, -4.945F, -0.009F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1027F, -0.8792F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(117, 77).addBox(0.0F, -4.9168F, 0.0023F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1119F, -2.3853F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(117, 70).addBox(0.0F, -4.6473F, -0.0044F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4092F, -3.8814F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(8, 119).addBox(0.0F, -3.6345F, -0.025F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7092F, -5.4814F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(56, 88).addBox(0.0F, -2.5418F, 0.4287F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5141F, -7.072F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(60, 74).addBox(0.0F, -1.6427F, -0.3142F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4141F, -7.972F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(93, 60).mirror().addBox(0.069F, -2.4225F, -2.9904F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1F, 13.2879F, -7.2018F, 1.3619F, -0.4451F, -1.1132F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(107, 96).mirror().addBox(0.0F, -1.4836F, -1.9712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 11.2879F, -7.2018F, 1.1355F, -0.2296F, -0.4552F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(95, 70).mirror().addBox(-6.0F, -0.065F, -4.0162F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 70).addBox(5.0F, -0.065F, -4.0162F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5199F, -5.6724F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-6.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 79).addBox(5.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.6199F, -5.5724F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(120, 107).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.8768F, -7.2281F, 0.5621F, 0.4511F, -0.6902F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(120, 38).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.8768F, -7.2281F, 0.7044F, 0.2446F, -0.2799F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(79, 18).mirror().addBox(-11.1021F, -2.3689F, -0.3751F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.8768F, -7.2281F, 0.3178F, 0.6407F, -1.1525F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(60, 29).mirror().addBox(-13.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.3768F, -6.0281F, 0.2993F, 0.5905F, -1.1805F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(120, 36).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.3768F, -6.0281F, 0.6549F, 0.2238F, -0.3087F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(120, 109).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.3768F, -6.0281F, 0.5227F, 0.4127F, -0.724F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(120, 103).mirror().addBox(-3.7544F, -0.849F, -0.0165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.0768F, -4.8281F, 0.4699F, 0.3628F, -0.7613F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(120, 105).mirror().addBox(-1.9751F, -0.0313F, -0.1387F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.0768F, -4.8281F, 0.5885F, 0.1981F, -0.34F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(35, 16).mirror().addBox(-14.0438F, -2.3561F, -0.0165F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.0768F, -4.8281F, 0.2733F, 0.5242F, -1.2117F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(36, 120).mirror().addBox(-1.9494F, -0.098F, -0.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8768F, -3.4281F, 0.5392F, 0.1784F, -0.3317F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(119, 84).mirror().addBox(-3.6955F, -0.8972F, 0.1042F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8768F, -3.4281F, 0.4315F, 0.325F, -0.7567F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(54, 43).mirror().addBox(-14.9701F, -2.3749F, 0.1042F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8768F, -3.4281F, 0.2549F, 0.4745F, -1.2029F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(120, 76).mirror().addBox(-1.9308F, -0.1705F, -0.4074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6553F, -1.5387F, 0.4894F, 0.16F, -0.34F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(120, 82).mirror().addBox(-3.6728F, -0.9606F, -0.2893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6553F, -1.5387F, 0.3927F, 0.288F, -0.7683F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(35, 14).mirror().addBox(-13.9228F, -2.4228F, -0.2893F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6553F, -1.5387F, 0.2355F, 0.4252F, -1.2113F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(120, 80).mirror().addBox(-1.9143F, -0.1826F, -0.2012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.641F, -0.175F, 0.4572F, 0.1458F, -0.3622F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(118, 0).mirror().addBox(-3.6399F, -0.9619F, -0.0847F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.641F, -0.175F, 0.3687F, 0.2617F, -0.7922F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(54, 45).mirror().addBox(-12.8924F, -2.4101F, -0.0847F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.641F, -0.175F, 0.225F, 0.3915F, -1.2328F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(77, 20).mirror().addBox(-6.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(77, 20).addBox(5.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 7.6199F, -5.5724F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(110, 84).mirror().addBox(-0.3283F, 0.0202F, 0.8169F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 16.0924F, -3.155F, -0.3731F, -1.0127F, 0.489F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(11, 104).mirror().addBox(-0.3283F, 1.1819F, 3.6265F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 16.0924F, -3.155F, -0.0589F, -1.0127F, 0.489F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(56, 93).mirror().addBox(-0.3283F, 1.1819F, 3.6265F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 16.0924F, -3.155F, 0.0566F, -0.8334F, 0.3446F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(47, 95).mirror().addBox(-0.3283F, 0.0202F, 0.8169F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 16.0924F, -3.155F, -0.2575F, -0.8334F, 0.3446F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(80, 72).mirror().addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 16.1924F, -3.155F, -0.6016F, -1.1915F, 0.8888F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(93, 54).mirror().addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 16.1924F, -3.155F, -1.6232F, -1.3989F, 2.0629F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(22, 108).mirror().addBox(-0.75F, -0.7837F, 0.0237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 15.5797F, -5.473F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(103, 45).mirror().addBox(-1.25F, -0.5F, -3.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 45).addBox(1.15F, -0.5F, -3.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 15.4797F, -4.973F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(93, 60).addBox(-1.069F, -2.4225F, -2.9904F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.1F, 13.2879F, -7.2018F, 1.3619F, 0.4451F, 1.1132F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(107, 96).addBox(-1.0F, -1.4836F, -1.9712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 11.2879F, -7.2018F, 1.1355F, 0.2296F, 0.4552F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(120, 107).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.8768F, -7.2281F, 0.5621F, -0.4511F, 0.6902F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(120, 38).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.8768F, -7.2281F, 0.7044F, -0.2446F, 0.2799F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(79, 18).addBox(3.1021F, -2.3689F, -0.3751F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.8768F, -7.2281F, 0.3178F, -0.6407F, 1.1525F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(60, 29).addBox(3.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.3768F, -6.0281F, 0.2993F, -0.5905F, 1.1805F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(120, 36).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.3768F, -6.0281F, 0.6549F, -0.2238F, 0.3087F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(120, 109).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.3768F, -6.0281F, 0.5227F, -0.4127F, 0.724F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(120, 103).addBox(1.7544F, -0.849F, -0.0165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0768F, -4.8281F, 0.4699F, -0.3628F, 0.7613F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(120, 105).addBox(-0.0249F, -0.0313F, -0.1387F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0768F, -4.8281F, 0.5885F, -0.1981F, 0.34F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(35, 16).addBox(3.0438F, -2.3561F, -0.0165F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0768F, -4.8281F, 0.2733F, -0.5242F, 1.2117F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(36, 120).addBox(-0.0506F, -0.098F, -0.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.8768F, -3.4281F, 0.5392F, -0.1784F, 0.3317F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(119, 84).addBox(1.6955F, -0.8972F, 0.1042F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.8768F, -3.4281F, 0.4315F, -0.325F, 0.7567F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(54, 43).addBox(2.9701F, -2.3749F, 0.1042F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.8768F, -3.4281F, 0.2549F, -0.4745F, 1.2029F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(120, 76).addBox(-0.0692F, -0.1705F, -0.4074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6553F, -1.5387F, 0.4894F, -0.16F, 0.34F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(120, 82).addBox(1.6728F, -0.9606F, -0.2893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6553F, -1.5387F, 0.3927F, -0.288F, 0.7683F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(35, 14).addBox(2.9228F, -2.4228F, -0.2893F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6553F, -1.5387F, 0.2355F, -0.4252F, 1.2113F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(120, 80).addBox(-0.0857F, -0.1826F, -0.2012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.641F, -0.175F, 0.4572F, -0.1458F, 0.3622F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(118, 0).addBox(1.6399F, -0.9619F, -0.0847F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.641F, -0.175F, 0.3687F, -0.2617F, 0.7922F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(54, 45).addBox(2.8924F, -2.4101F, -0.0847F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.641F, -0.175F, 0.225F, -0.3915F, 1.2328F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(110, 84).addBox(-0.6717F, 0.0202F, 0.8169F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 16.0924F, -3.155F, -0.3731F, 1.0127F, -0.489F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(11, 104).addBox(-0.6717F, 1.1819F, 3.6265F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 16.0924F, -3.155F, -0.0589F, 1.0127F, -0.489F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(56, 93).addBox(-0.6717F, 1.1819F, 3.6265F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 16.0924F, -3.155F, 0.0566F, 0.8334F, -0.3446F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(47, 95).addBox(-0.6717F, 0.0202F, 0.8169F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 16.0924F, -3.155F, -0.2575F, 0.8334F, -0.3446F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(80, 72).addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 16.1924F, -3.155F, -0.6016F, 1.1915F, -0.8888F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(93, 54).addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 16.1924F, -3.155F, -1.6232F, 1.3989F, -2.0629F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(22, 108).addBox(-0.25F, -0.7837F, 0.0237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 15.5797F, -5.473F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(63, 70).addBox(-1.0F, -1.1F, -9.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6199F, -1.8724F, 0.8029F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6F, 13.9199F, -5.6724F, 0.9626F, 0.1337F, -0.2037F));

		PartDefinition cube_r180 = leftArm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(112, 32).addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftArm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(40, 108).addBox(0.0419F, -15.7734F, -7.7275F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftArm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(121, 4).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r183 = leftArm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 117).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, 1.6683F, -0.3971F, -0.06F, -0.4743F, -0.0768F));

		PartDefinition cube_r184 = leftArm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(74, 112).addBox(-0.2622F, -0.0365F, -0.1809F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6168F, 3.2178F, -1.1103F, 0.5073F, -0.4743F, -0.0768F));

		PartDefinition cube_r185 = leftArm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(75, 54).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(37, 93).addBox(-0.5909F, -0.1079F, -0.2717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(76, 101).addBox(-0.5909F, 1.8921F, -1.3717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2155F, 9.2874F, 2.0638F, -1.5066F, 0.3913F, 0.0705F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(43, 81).addBox(-0.508F, -0.0675F, -1.0751F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0583F, 10.7999F, -0.2572F, 0.3603F, 0.3165F, 0.1985F));

		PartDefinition cube_r186 = leftArm3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(22, 113).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.008F, 0.0807F, -1.0948F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftArm3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(88, 112).addBox(12.3545F, -3.1239F, -11.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(118, 12).addBox(-0.5945F, -0.2848F, -0.5127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0365F, 0.3564F, 0.6637F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6F, 13.9199F, -5.6724F, 0.2441F, -0.1742F, 0.1089F));

		PartDefinition cube_r188 = rightArm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(67, 112).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r189 = rightArm.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(108, 103).addBox(-1.0419F, -15.7734F, -7.7275F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightArm.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(121, 8).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r191 = rightArm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(22, 117).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, 1.6683F, -0.3971F, -0.06F, 0.4743F, 0.0768F));

		PartDefinition cube_r192 = rightArm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(112, 77).addBox(-0.7378F, -0.0365F, -0.1809F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6168F, 3.2178F, -1.1103F, 0.5073F, 0.4743F, 0.0768F));

		PartDefinition cube_r193 = rightArm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(62, 112).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(94, 33).addBox(-0.4091F, -0.1079F, -0.2717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(102, 96).addBox(-0.4091F, 1.8921F, -1.3717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2155F, 9.2874F, 2.0638F, -0.7649F, -0.3913F, -0.0705F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(33, 106).addBox(-0.492F, -0.0675F, -1.0751F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0583F, 10.7999F, -0.2572F, 0.4476F, -0.3165F, -0.1985F));

		PartDefinition cube_r194 = rightArm3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(29, 113).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.008F, 0.0807F, -1.0948F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r195 = rightArm3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(95, 112).addBox(-13.3545F, -3.1239F, -11.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(14, 118).addBox(-0.4055F, -0.2848F, -0.5127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0365F, 0.3564F, 0.6637F, 0.48F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.8199F, -8.1724F, -0.1096F, -0.3135F, -0.0498F));

		PartDefinition cube_r196 = neck4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(112, 124).addBox(0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 100).addBox(0.0F, -2.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 113).addBox(0.0F, -3.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.1F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r197 = neck4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(105, 12).mirror().addBox(-1.3065F, -0.2198F, -1.1788F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -3.8557F, 1.1167F, 0.7449F, -0.2594F));

		PartDefinition cube_r198 = neck4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(113, 68).mirror().addBox(-4.1346F, -0.7551F, -1.0988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -3.8557F, 0.7107F, 1.056F, -0.7673F));

		PartDefinition cube_r199 = neck4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(120, 70).mirror().addBox(-1.937F, -0.096F, -0.8625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4438F, -2.5481F, 1.0886F, 0.5033F, -0.2372F));

		PartDefinition cube_r200 = neck4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(106, 58).mirror().addBox(-4.738F, -0.9017F, -0.7421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4438F, -2.5481F, 0.851F, 0.8274F, -0.6142F));

		PartDefinition cube_r201 = neck4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(121, 29).mirror().addBox(-3.7153F, -1.0607F, -0.9724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.157F, -0.3557F, 0.7952F, 0.5349F, -0.6657F));

		PartDefinition cube_r202 = neck4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(119, 86).mirror().addBox(-1.9685F, -0.253F, -1.0931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.157F, -0.3557F, 0.9329F, 0.2454F, -0.3106F));

		PartDefinition cube_r203 = neck4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(60, 31).mirror().addBox(-8.9189F, -2.5315F, -0.9724F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.157F, -0.3557F, 0.5154F, 0.8061F, -1.1073F));

		PartDefinition cube_r204 = neck4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(105, 12).addBox(0.3065F, -0.2198F, -1.1788F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -3.8557F, 1.1167F, -0.7449F, 0.2594F));

		PartDefinition cube_r205 = neck4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(113, 68).addBox(1.1346F, -0.7551F, -1.0988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -3.8557F, 0.7107F, -1.056F, 0.7673F));

		PartDefinition cube_r206 = neck4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(120, 70).addBox(-0.063F, -0.096F, -0.8625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4438F, -2.5481F, 1.0886F, -0.5033F, 0.2372F));

		PartDefinition cube_r207 = neck4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(106, 58).addBox(1.738F, -0.9017F, -0.7421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4438F, -2.5481F, 0.851F, -0.8274F, 0.6142F));

		PartDefinition cube_r208 = neck4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(121, 29).addBox(1.7153F, -1.0607F, -0.9724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.157F, -0.3557F, 0.7952F, -0.5349F, 0.6657F));

		PartDefinition cube_r209 = neck4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(119, 86).addBox(-0.0315F, -0.253F, -1.0931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.157F, -0.3557F, 0.9329F, -0.2454F, 0.3106F));

		PartDefinition cube_r210 = neck4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(60, 31).addBox(2.9189F, -2.5315F, -0.9724F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.157F, -0.3557F, 0.5154F, -0.8061F, 1.1073F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8F, -4.3F, -0.0555F, -0.4412F, -0.0555F));

		PartDefinition cube_r211 = neck3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(11, 97).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5477F, -3.8023F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4523F, -3.3023F, -0.148F, -0.596F, -0.1155F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(34, 65).addBox(-0.5F, -0.022F, -0.04F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.9F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -4.7F, 0.3365F, -0.6699F, -0.2139F));

		PartDefinition cube_r213 = neck.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(81, 38).addBox(-0.5F, 0.2F, -1.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -3.4F, 0.3413F, -0.2043F, -0.1677F));

		PartDefinition cube_r214 = heads.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(106, 74).addBox(-1.5F, -0.9193F, 0.0072F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, -9.9F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r215 = heads.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(106, 54).addBox(-1.5F, -0.5811F, -0.222F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.4F, -11.4F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r216 = heads.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(117, 52).addBox(-1.0F, -0.0216F, -0.9642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, -11.8F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r217 = heads.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(114, 8).addBox(-1.1F, -0.0558F, -1.3124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.6F, -7.8F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r218 = heads.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(22, 123).addBox(-1.1F, -0.0039F, 0.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6F, 2.6F, -9.8F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r219 = heads.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(114, 4).addBox(-1.1F, -0.025F, 0.0369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 4.3F, -10.9F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r220 = heads.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(117, 55).mirror().addBox(-1.0F, -0.965F, -1.0348F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(117, 55).addBox(-0.4F, -0.965F, -1.0348F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 5.554F, -8.9637F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r221 = heads.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(94, 0).addBox(-0.4F, -0.5F, -1.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3F, 4.354F, -8.1637F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r222 = heads.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(28, 81).mirror().addBox(-1.0F, -0.6223F, -6.9617F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 111).mirror().addBox(-1.01F, -0.63F, -6.5617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 111).addBox(0.61F, -0.63F, -6.5617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 81).addBox(-0.4F, -0.6223F, -6.9617F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.8F, -5.2F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r223 = heads.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(102, 64).mirror().addBox(-1.3F, -0.7F, -1.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(102, 64).addBox(-0.1F, -0.7F, -1.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.6924F, -6.3465F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r224 = heads.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(99, 107).mirror().addBox(-0.2F, 0.0251F, -2.5923F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(112, 29).addBox(-0.9F, 0.0251F, 0.4077F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(99, 107).addBox(0.4F, 0.0251F, -2.5923F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, 0.1F, -5.9F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r225 = heads.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(102, 90).mirror().addBox(-0.2F, -0.0714F, -4.0328F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(102, 90).addBox(0.4F, -0.0714F, -4.0328F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, 1.7F, -7.9F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r226 = heads.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(14, 123).mirror().addBox(-0.2F, 0.0482F, -0.9844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(14, 123).addBox(0.4F, 0.0482F, -0.9844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, 5.2F, -11.5F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r227 = heads.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(123, 12).mirror().addBox(-0.2F, -0.0308F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(123, 12).addBox(0.4F, -0.0308F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6F, 4.3F, -10.9F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r228 = heads.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(28, 88).addBox(-2.0F, -1.0408F, -0.3507F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.5F, -4.8F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r229 = heads.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(115, 58).mirror().addBox(-0.55F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 58).addBox(0.15F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 4.091F, -9.7034F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r230 = heads.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(120, 40).mirror().addBox(-1.43F, -0.0621F, -0.3578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.1477F, -2.438F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r231 = heads.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(73, 123).mirror().addBox(-1.43F, -0.0308F, -1.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.4523F, -3.138F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r232 = heads.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(62, 123).mirror().addBox(-1.43F, 0.0179F, -0.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.8523F, -2.238F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r233 = heads.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(27, 124).mirror().addBox(-1.43F, 0.1101F, -0.8944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4523F, -4.538F, 2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r234 = heads.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(7, 115).mirror().addBox(-1.43F, 0.0474F, -2.0011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.2523F, -4.038F, -2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r235 = heads.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(124, 44).mirror().addBox(-1.43F, -0.0014F, -1.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6477F, -4.338F, 2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r236 = heads.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(113, 107).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.979F, -0.7086F, -3.8732F, 0.6209F, -0.2494F, -0.0804F));

		PartDefinition cube_r237 = heads.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(62, 119).mirror().addBox(-1.43F, -0.1406F, -0.0608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.1477F, -3.438F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r238 = heads.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(124, 47).mirror().addBox(-1.29F, 5.4F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(114, 100).mirror().addBox(-1.45F, 5.4F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -6.1477F, -3.038F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r239 = heads.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(124, 50).mirror().addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(124, 50).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.92F, -2.1501F, -1.2074F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r240 = heads.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(124, 53).mirror().addBox(-0.5F, -1.7193F, -0.0021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 124).mirror().addBox(-0.5F, -1.0193F, -0.0021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.52F, -1.6265F, -1.7007F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r241 = heads.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(120, 92).mirror().addBox(-0.5F, -0.5193F, 0.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(124, 50).mirror().addBox(-0.5F, -1.5193F, 0.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.52F, -0.1265F, -1.7007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r242 = heads.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(120, 88).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.52F, -0.8265F, -0.8007F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r243 = heads.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(84, 79).addBox(-1.5F, 0.1777F, -3.5617F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -5.2F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r244 = heads.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(73, 119).mirror().addBox(0.0F, -1.0362F, 0.0292F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 119).addBox(2.6F, -1.0362F, 0.0292F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 3.381F, -4.4503F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r245 = heads.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(112, 24).mirror().addBox(-1.3F, -0.7284F, 0.1587F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 24).addBox(1.3F, -0.7284F, 0.1587F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, -7.5F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r246 = heads.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(47, 99).addBox(-1.5F, -0.9881F, -0.1504F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2F, -4.8F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r247 = heads.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(99, 33).addBox(-1.5F, -0.3284F, 0.0587F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -7.8F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r248 = heads.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(48, 117).mirror().addBox(-2.5F, -2.9469F, -0.953F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(48, 117).addBox(0.5F, -2.9469F, -0.953F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.9F, 1.6F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r249 = heads.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(114, 96).mirror().addBox(-2.0F, 0.1169F, -0.0103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(114, 96).addBox(1.0F, 0.1169F, -0.0103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.8F, 1.6F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r250 = heads.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(122, 116).mirror().addBox(-2.0F, -0.0383F, 0.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(122, 116).addBox(1.0F, -0.0383F, 0.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.6F, -0.2F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r251 = heads.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(-2.0F, 0.0362F, -0.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(0, 123).addBox(1.0F, 0.0362F, -0.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.8F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r252 = heads.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(107, 0).addBox(-1.0F, -0.0401F, -2.0245F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.6F, -3.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r253 = heads.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(106, 70).addBox(-1.0F, -0.0485F, -1.9558F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -2.3F, -1.2F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r254 = heads.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(17, 62).addBox(-2.0F, 0.0226F, -1.1241F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.7F, -0.1F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r255 = heads.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(111, 12).addBox(1.0F, 0.0402F, -0.1756F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.4F, -1.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r256 = heads.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(124, 53).addBox(-0.5F, -1.7193F, -0.0021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 124).addBox(-0.5F, -1.0193F, -0.0021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.52F, -1.6265F, -1.7007F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r257 = heads.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(124, 50).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 50).addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.92F, -2.1501F, -1.2074F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r258 = heads.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(124, 50).addBox(-0.5F, -1.5193F, 0.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 92).addBox(-0.5F, -0.5193F, 0.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.52F, -0.1265F, -1.7007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r259 = heads.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(120, 88).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.52F, -0.8265F, -0.8007F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r260 = heads.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(124, 47).addBox(0.29F, 5.4F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(114, 100).addBox(-0.55F, 5.4F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -6.1477F, -3.038F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r261 = heads.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(124, 44).addBox(0.43F, -0.0014F, -1.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.6477F, -4.338F, 2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r262 = heads.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(27, 124).addBox(0.43F, 0.1101F, -0.8944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, 0.4523F, -4.538F, 2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r263 = heads.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(7, 115).addBox(0.43F, 0.0474F, -2.0011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6F, 1.2523F, -4.038F, -2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r264 = heads.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(73, 123).addBox(0.43F, -0.0308F, -1.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 1.4523F, -3.138F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r265 = heads.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(62, 123).addBox(0.43F, 0.0179F, -0.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8523F, -2.238F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r266 = heads.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(120, 40).addBox(0.43F, -0.0621F, -0.3578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, -1.1477F, -2.438F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r267 = heads.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(62, 119).addBox(0.43F, -0.1406F, -0.0608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, -1.1477F, -3.438F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r268 = heads.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(102, 60).addBox(-2.0F, -0.9987F, -2.0229F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.0F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r269 = heads.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(98, 14).addBox(-2.0F, -2.0024F, -1.9669F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.5F, -0.9F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r270 = heads.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(103, 50).addBox(-2.0F, -2.0024F, 0.0331F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, -0.9F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r271 = heads.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 71).addBox(-2.0F, -1.0F, -3.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.007F))
				.texOffs(97, 85).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r272 = heads.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(113, 107).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.979F, -0.7086F, -3.8732F, 0.6209F, 0.2494F, 0.0804F));

		PartDefinition cube_r273 = heads.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(99, 77).addBox(-2.0F, -0.071F, 0.0341F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2F, -5.9F, 0.5323F, 0.0F, 0.0F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(91, 101).addBox(0.9F, -0.0981F, -4.0843F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(91, 101).mirror().addBox(-1.9F, -0.0981F, -4.0843F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8878F, 0.9945F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(113, 92).mirror().addBox(-1.0F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(113, 92).addBox(1.8F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9F, -0.7968F, -2.6512F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(113, 103).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(113, 103).addBox(2.3F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.4F, -1.9629F, -2.6316F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(41, 122).mirror().addBox(-1.0F, -0.0247F, -0.5398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 122).addBox(1.8F, -0.0247F, -0.5398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -1.3F, -1.7F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(113, 88).mirror().addBox(-1.0F, -0.1F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(113, 88).addBox(1.8F, -0.1F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -0.1F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(36, 122).mirror().addBox(-1.0F, -0.9F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(65, 107).mirror().addBox(-1.0F, -0.8F, -4.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 122).addBox(1.8F, -0.9F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(65, 107).addBox(1.8F, -0.8F, -4.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(46, 122).mirror().addBox(-1.0F, -1.0419F, 0.0111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 122).addBox(1.8F, -1.0419F, 0.0111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.8F, 0.9F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(119, 121).mirror().addBox(-1.0F, -0.9999F, -0.0843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 121).addBox(1.8F, -0.9999F, -0.0843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.9F, 0.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(99, 38).mirror().addBox(-0.8F, -0.7336F, -3.9052F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 38).addBox(2.4F, -0.7336F, -3.9052F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -0.4F, -4.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-1.0F, -0.3336F, -4.0052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 102).addBox(1.6F, -0.3336F, -4.0052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8F, -0.4F, -4.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(114, 48).mirror().addBox(-1.0F, -0.0701F, 0.1709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1F, -10.2F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(114, 44).mirror().addBox(-1.0F, -0.0231F, -1.9139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1F, -10.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(78, 124).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1425F, -12.4591F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.5F, -0.9575F, -1.4591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6F, -10.9F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(22, 102).mirror().addBox(-1.0F, -0.9876F, -3.7639F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 102).addBox(1.6F, -0.9876F, -3.7639F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 0.7F, -5.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(114, 121).mirror().addBox(-1.0F, -1.0283F, -0.8849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 121).addBox(1.6F, -1.0283F, -0.8849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 0.9F, -4.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(67, 124).mirror().addBox(-0.5F, -0.9858F, -0.9346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(67, 124).addBox(1.1F, -0.9858F, -0.9346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8F, 2.0993F, -11.3106F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.5F, -0.6F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 108).addBox(1.1F, -0.6F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8F, 0.8993F, -9.0106F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(114, 48).addBox(0.0F, -0.0701F, 0.1709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 0.1F, -10.2F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(114, 44).addBox(0.0F, -0.0231F, -1.9139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1F, -10.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(78, 124).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1425F, -12.4591F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(0, 113).addBox(-0.5F, -0.9575F, -1.4591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6F, -10.9F, 0.0F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -0.8209F, 0.0402F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7F, 9.4F, -0.2303F, 0.17F, -0.0396F));

		PartDefinition cube_r295 = tail.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(94, 116).addBox(0.0F, 1.4F, 5.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 116).addBox(0.0F, -0.1F, 3.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 116).addBox(0.0F, -1.3F, 1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 109).addBox(0.0F, -3.0F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.299F, 6.8066F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r296 = tail.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(56, 124).addBox(0.0F, -1.5F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1625F, 3.0385F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r297 = tail.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(5, 119).addBox(0.0F, -4.9449F, -0.0568F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7411F, 11.2436F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r298 = tail.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(82, 116).addBox(0.0F, -5.3635F, 0.001F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7411F, 9.1436F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r299 = tail.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(97, 116).addBox(0.0F, -7.0382F, 6.2324F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 112).addBox(0.0F, -7.0382F, 4.2324F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 109).addBox(0.0F, -6.9382F, 2.2324F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 49).addBox(0.0F, -6.7382F, 0.2324F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7411F, 0.7436F, -0.2007F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 18).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2209F, 13.0402F, 0.0274F, 0.3053F, 0.0083F));

		PartDefinition cube_r300 = tail2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(89, 124).addBox(0.0F, -2.3892F, 3.806F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 96).addBox(0.0F, -2.1892F, 1.906F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 124).addBox(0.0F, -1.9892F, -0.094F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 8.0557F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r301 = tail2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(121, 96).addBox(0.0F, -2.5238F, 0.0027F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 6.0557F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r302 = tail2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(59, 121).addBox(0.0F, -4.6228F, 3.6852F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 44).addBox(0.0F, -4.5228F, 1.7852F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 118).addBox(0.0F, -4.4228F, -0.0148F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 0.0557F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r303 = tail2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(11, 119).addBox(0.0F, -1.0F, 1.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 120).addBox(0.0F, -2.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, 10.8858F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r304 = tail2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(103, 120).addBox(0.0F, -1.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6236F, 8.3868F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r305 = tail2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(111, 117).addBox(0.0F, 4.5F, 9.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 117).addBox(0.0F, 3.2F, 7.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5199F, -6.2336F, 0.672F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(29, 34).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0226F, 12.8013F, 0.1595F, 0.1724F, 0.0276F));

		PartDefinition cube_r306 = tail3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(122, 111).addBox(0.0F, 4.1F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 58).addBox(0.0F, 2.9F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 97).addBox(0.0F, 1.7F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 124).addBox(0.0F, 0.9F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -2.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r307 = tail3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(121, 124).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1822F, 9.3698F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r308 = tail3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(118, 124).addBox(0.0F, -0.9707F, 3.8528F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 124).addBox(0.0F, -0.8707F, 1.8528F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 124).addBox(0.0F, -0.7707F, -0.1472F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 3.0491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r309 = tail3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(92, 124).addBox(0.0F, -1.0819F, -0.3259F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 1.3491F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0096F, 10.9005F, 0.0968F, -0.1303F, -0.0126F));

		PartDefinition cube_r310 = tail4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(115, 124).addBox(0.0F, 11.2F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 124).addBox(0.0F, 9.4F, 17.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 124).addBox(0.0F, 8.5F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 102).addBox(0.0F, 7.4F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -13.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r311 = tail4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(25, 58).addBox(0.0F, 6.4F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5429F, -13.0147F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.0504F, -0.523F, 0.0252F));

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