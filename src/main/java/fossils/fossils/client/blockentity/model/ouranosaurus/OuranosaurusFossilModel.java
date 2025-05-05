package fossils.fossils.client.blockentity.model.ouranosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OuranosaurusFossilModel extends SkullModelBase {
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

	public OuranosaurusFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0F, -3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(93, 80).mirror().addBox(-0.0791F, -1.2757F, 3.8871F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 31).mirror().addBox(-0.0791F, -0.2757F, -0.1129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 7.7555F, 8.5878F, -0.8727F, 0.4189F, -0.1745F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.0791F, -0.2765F, -0.0699F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 7.7555F, 8.5878F, -0.733F, 0.4189F, -0.1745F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 20).mirror().addBox(-0.5F, -0.2092F, 5.0099F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.2555F, 1.5878F, -0.6458F, 0.2967F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-0.5F, 1.9936F, -1.4226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.2555F, 1.5878F, 0.5061F, 0.2967F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 74).mirror().addBox(-0.5F, -0.6374F, 0.0619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.2555F, 1.5878F, -0.733F, 0.2967F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(72, 64).mirror().addBox(-0.5F, -0.9299F, -4.8279F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(72, 64).addBox(8.5F, -0.9299F, -4.8279F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.5F, 3.7374F, 2.7965F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 45).mirror().addBox(-0.5F, -0.8281F, 3.5928F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.5889F, -2.9982F, -0.5934F, 0.3316F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 54).mirror().addBox(-0.5F, -0.6945F, -2.9892F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.5889F, -2.9982F, -0.5585F, 0.3316F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(0.0F, 6.9951F, -2.5534F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -4.1799F, -2.4011F, -0.6807F, 0.1309F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(0.0F, 4.8779F, -6.7295F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -4.1799F, -2.4011F, -0.2269F, 0.1309F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 20).mirror().addBox(0.0F, 2.9005F, -6.0953F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 50).mirror().addBox(0.0F, -1.0052F, -7.9648F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -4.1799F, -2.4011F, 0.4189F, 0.1309F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(68, 72).mirror().addBox(0.0F, 0.7891F, -1.4974F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.6922F, 3.2373F, 0.2793F, -0.2094F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(98, 77).mirror().addBox(0.0F, -2.0686F, 1.189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.6922F, 3.2373F, -0.4887F, -0.2094F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(98, 84).mirror().addBox(0.0F, -1.583F, -0.2122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.6922F, 3.2373F, -0.1396F, -0.2094F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 20).mirror().addBox(0.0F, -0.9972F, -0.4214F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.6922F, 3.2373F, -0.0175F, -0.2094F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(88, 50).mirror().addBox(0.0F, 0.0983F, -2.0064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -4.1799F, -2.4011F, -0.1222F, 0.1309F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 13).mirror().addBox(0.0F, 0.2305F, -7.9063F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -4.1799F, -2.4011F, 0.2618F, 0.1309F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 66).mirror().addBox(-5.0F, -0.0249F, 0.0025F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 66).addBox(4.0F, -0.0249F, 0.0025F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1F, -2.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.0F, 0.0F, 3.2F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 43).mirror().addBox(-4.0F, 1.0F, 2.2F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 43).addBox(1.0F, 1.0F, 2.2F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(4.0F, 0.0F, 3.2F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 13).addBox(-1.0F, 0.2305F, -7.9063F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -4.1799F, -2.4011F, 0.2618F, -0.1309F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(11, 50).addBox(-1.0F, -1.0052F, -7.9648F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(18, 20).addBox(-1.0F, 2.9005F, -6.0953F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -4.1799F, -2.4011F, 0.4189F, -0.1309F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(98, 77).addBox(-1.0F, -2.0686F, 1.189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.6922F, 3.2373F, -0.4887F, 0.2094F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(98, 84).addBox(-1.0F, -1.583F, -0.2122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.6922F, 3.2373F, -0.1396F, 0.2094F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(93, 80).addBox(-0.9209F, -1.2757F, 3.8871F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 31).addBox(-0.9209F, -0.2757F, -0.1129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 7.7555F, 8.5878F, -0.8727F, -0.4189F, 0.1745F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(81, 0).addBox(-0.9209F, -0.2765F, -0.0699F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8F, 7.7555F, 8.5878F, -0.733F, -0.4189F, 0.1745F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(34, 20).addBox(-0.5F, -0.2092F, 5.0099F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 2.2555F, 1.5878F, -0.6458F, -0.2967F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(91, 31).addBox(-0.5F, 1.9936F, -1.4226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 2.2555F, 1.5878F, 0.5061F, -0.2967F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(40, 54).addBox(-0.5F, -0.6945F, -2.9892F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5F, 2.5889F, -2.9982F, -0.5585F, -0.3316F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(51, 45).addBox(-0.5F, -0.8281F, 3.5928F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5F, 2.5889F, -2.9982F, -0.5934F, -0.3316F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(43, 74).addBox(-0.5F, -0.6374F, 0.0619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.5F, 2.2555F, 1.5878F, -0.733F, -0.2967F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 6.9951F, -2.5534F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, -4.1799F, -2.4011F, -0.6807F, -0.1309F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 4.8779F, -6.7295F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, -4.1799F, -2.4011F, -0.2269F, -0.1309F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 72).addBox(-1.0F, 0.7891F, -1.4974F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, -2.6922F, 3.2373F, 0.2793F, 0.2094F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(88, 50).addBox(-1.0F, 0.0983F, -2.0064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.0F, -4.1799F, -2.4011F, -0.1222F, -0.1309F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(86, 20).addBox(-1.0F, -0.9972F, -0.4214F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, -2.6922F, 3.2373F, -0.0175F, 0.2094F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 86).addBox(-0.01F, -9.7382F, -0.3676F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8202F, 8.2033F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(65, 86).addBox(0.0F, -9.7382F, -0.0676F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8202F, 8.2033F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(18, 86).addBox(-0.01F, -9.7382F, -0.3676F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9202F, 6.4033F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(68, 87).addBox(0.0F, -9.7382F, -0.0676F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9202F, 6.4033F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -4.9F, -4.5F, 0.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.9202F, 2.2033F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(84, 101).addBox(0.0F, 0.8753F, -0.3379F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 101).addBox(0.01F, 0.8753F, -0.0379F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1432F, -3.4275F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(54, 84).addBox(0.0F, -2.8681F, -0.7829F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2432F, -2.9275F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(72, 8).addBox(-0.01F, -2.9439F, -1.0441F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2432F, -2.9275F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(41, 52).addBox(0.01F, -5.7835F, -1.4813F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2432F, -2.9275F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 1.0F, 0.1F, -0.0086F, 0.0015F, 0.1745F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -9.7343F, -6.3198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4372F, 6.7917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(78, 23).addBox(-1.0F, -5.4F, -1.4F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 75).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(71, 57).addBox(-1.0F, -10.7937F, -6.8715F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(87, 6).addBox(-1.0F, -8.799F, -6.8693F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.6652F, 4.9178F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(58, 69).addBox(-1.9F, -0.2745F, -2.1999F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.3652F, 0.7178F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(92, 73).addBox(-0.5F, 7.2F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(46, 81).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(67, 80).addBox(-1.0F, -1.5F, -1.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 14.0271F, -0.7882F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(92, 89).addBox(-1.9F, -15.0978F, 4.4681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(39, 63).addBox(-1.9F, -11.735F, 0.4314F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(25, 76).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.0475F, -0.9467F, -0.7777F, -0.1231F, -0.124F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(61, 39).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(13, 60).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 1.0F, 0.1F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -9.7343F, -6.3198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4372F, 6.7917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 77).addBox(-1.0F, -5.4F, -1.4F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(7, 75).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 46).addBox(-1.0F, -10.7937F, -6.8715F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -8.799F, -6.8693F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.6652F, 4.9178F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(9, 67).addBox(-0.1F, -0.2745F, -2.1999F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.3652F, 0.7178F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(61, 46).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(54, 91).addBox(-0.5F, 7.2F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(41, 81).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(80, 53).addBox(-1.0F, -1.5F, -1.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 14.0271F, -0.7882F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(91, 62).addBox(-0.1F, -15.0978F, 4.4681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 63).addBox(-0.1F, -11.735F, 0.4314F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(76, 8).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.0475F, -0.9467F, -1.1795F, 0.0042F, 0.0102F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(61, 25).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.8029F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(59, 9).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0696F, -2.9933F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 37).addBox(-1.0F, -1.4F, -7.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.0F, -8.0F, 0.0436F, -0.0019F, 0.0436F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-3.7437F, -2.3667F, 0.4744F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.643F, -1.1557F, 0.0025F, -0.3998F, -1.3867F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(103, 76).mirror().addBox(-3.4868F, -0.9855F, 0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.643F, -1.1557F, -0.1745F, -0.3615F, -0.9179F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(103, 69).mirror().addBox(-1.8203F, -0.2603F, 0.366F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.643F, -1.1557F, -0.2925F, -0.1964F, -0.4969F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(103, 83).mirror().addBox(-1.9078F, -0.1678F, -0.5606F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4579F, -2.2806F, -0.1905F, -0.1637F, -0.4968F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-3.6627F, -0.9506F, -0.4436F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4579F, -2.2806F, -0.0923F, -0.2904F, -0.9258F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(66, 32).mirror().addBox(-3.9178F, -2.4095F, -0.4436F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4579F, -2.2806F, 0.0429F, -0.3014F, -1.3822F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-0.9093F, -2.2254F, 6.7549F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.0725F, -0.1828F, -1.3713F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(103, 102).mirror().addBox(-0.8583F, -2.0552F, 6.7549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, -0.0125F, -0.1961F, -0.9271F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(103, 100).mirror().addBox(-0.2775F, -2.2447F, 6.7832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, -0.0797F, -0.1104F, -0.4939F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(104, 6).mirror().addBox(-1.0771F, -1.1429F, 5.2425F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.0771F, -0.0332F, -0.4352F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(104, 13).mirror().addBox(-2.1398F, -1.4097F, 5.2824F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.0978F, -0.0601F, -0.8711F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(104, 64).mirror().addBox(-3.3436F, -2.1819F, 5.2824F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.114F, -0.0133F, -1.3053F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-5.6294F, -2.4729F, -0.0767F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3315F, -8.1789F, 0.1297F, 0.0548F, -1.2878F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(104, 71).mirror().addBox(-3.4282F, -1.13F, -0.0767F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3315F, -8.1789F, 0.1407F, -0.0049F, -0.8554F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(104, 66).mirror().addBox(-1.7931F, -0.4237F, -0.1823F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3315F, -8.1789F, 0.1393F, -0.0012F, -0.4191F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(104, 73).mirror().addBox(-1.7905F, -0.136F, 1.6296F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.283F, 0.0625F, -0.4321F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(104, 87).mirror().addBox(-3.4328F, -0.8428F, 1.7352F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.2441F, 0.1135F, -0.8672F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(18, 29).mirror().addBox(-7.755F, -2.2146F, 1.7352F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.1743F, 0.2056F, -1.2995F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(10, 41).mirror().addBox(-10.0065F, -2.3932F, -0.3587F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.1937F, 0.2728F, -1.2949F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(104, 91).mirror().addBox(-3.7362F, -0.8983F, -0.3587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.2899F, 0.1666F, -0.8608F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(104, 89).mirror().addBox(-1.9578F, -0.0884F, -0.4797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1756F, -11.9865F, 0.3466F, 0.0916F, -0.4272F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(10, 37).mirror().addBox(-10.9888F, -2.4114F, -0.4482F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8756F, -13.7865F, 0.2057F, 0.324F, -1.2566F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(104, 95).mirror().addBox(-3.7278F, -0.9223F, -0.4482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8756F, -13.7865F, 0.3225F, 0.2082F, -0.8201F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(104, 97).mirror().addBox(-1.9547F, -0.1149F, -0.5689F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8756F, -13.7865F, 0.3934F, 0.116F, -0.3877F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(103, 76).addBox(1.4868F, -0.9855F, 0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.643F, -1.1557F, -0.1745F, 0.3615F, 0.9179F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(103, 69).addBox(-0.1797F, -0.2603F, 0.366F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.643F, -1.1557F, -0.2925F, 0.1964F, 0.4969F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(56, 43).addBox(2.7437F, -2.3667F, 0.4744F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.643F, -1.1557F, 0.0025F, 0.3998F, 1.3867F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(103, 93).addBox(1.6627F, -0.9506F, -0.4436F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4579F, -2.2806F, -0.0923F, 0.2904F, 0.9258F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(103, 83).addBox(-0.0922F, -0.1678F, -0.5606F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4579F, -2.2806F, -0.1905F, 0.1637F, 0.4968F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(66, 32).addBox(2.9178F, -2.4095F, -0.4436F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4579F, -2.2806F, 0.0429F, 0.3014F, 1.3822F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(71, 64).addBox(-0.0907F, -2.2254F, 6.7549F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.0725F, 0.1828F, 1.3713F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(103, 102).addBox(-1.1417F, -2.0552F, 6.7549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, -0.0125F, 0.1961F, 0.9271F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(103, 100).addBox(-1.7225F, -2.2447F, 6.7832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, -0.0797F, 0.1104F, 0.4939F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(104, 64).addBox(1.3436F, -2.1819F, 5.2824F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.114F, 0.0133F, 1.3053F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(104, 13).addBox(0.1398F, -1.4097F, 5.2824F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.0978F, 0.0601F, 0.8711F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(104, 6).addBox(-0.9229F, -1.1429F, 5.2425F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.0771F, 0.0332F, 0.4352F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 41).addBox(2.6294F, -2.4729F, -0.0767F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3315F, -8.1789F, 0.1297F, -0.0548F, 1.2878F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(104, 71).addBox(1.4282F, -1.13F, -0.0767F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3315F, -8.1789F, 0.1407F, 0.0049F, 0.8554F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(104, 66).addBox(-0.2069F, -0.4237F, -0.1823F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3315F, -8.1789F, 0.1393F, 0.0012F, 0.4191F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(104, 87).addBox(1.4328F, -0.8428F, 1.7352F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.2441F, -0.1135F, 0.8672F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(104, 73).addBox(-0.2095F, -0.136F, 1.6296F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.283F, -0.0625F, 0.4321F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(18, 29).addBox(2.755F, -2.2146F, 1.7352F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.1743F, -0.2056F, 1.2995F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(104, 91).addBox(1.7362F, -0.8983F, -0.3587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.2899F, -0.1666F, 0.8608F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(104, 89).addBox(-0.0422F, -0.0884F, -0.4797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.3466F, -0.0916F, 0.4272F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(10, 41).addBox(3.0065F, -2.3932F, -0.3587F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1756F, -11.9865F, 0.1937F, -0.2728F, 1.2949F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(104, 97).addBox(-0.0453F, -0.1149F, -0.5689F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8756F, -13.7865F, 0.3934F, -0.116F, 0.3877F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(104, 95).addBox(1.7278F, -0.9223F, -0.4482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8756F, -13.7865F, 0.3225F, -0.2082F, 0.8201F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(10, 37).addBox(2.9888F, -2.4114F, -0.4482F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8756F, -13.7865F, 0.2057F, -0.324F, 1.2566F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, -10.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -7.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(95, 95).addBox(0.0F, 1.5381F, -0.2654F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6715F, -8.1492F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(100, 101).addBox(0.01F, 1.5479F, 0.1821F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6715F, -8.1492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(44, 101).addBox(0.0F, -3.2239F, -0.03F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6715F, -8.1492F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(92, 95).addBox(-0.01F, -3.2081F, -0.6684F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6715F, -8.1492F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(49, 95).addBox(0.01F, -6.1059F, -0.8669F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6715F, -8.1492F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(6, 97).addBox(0.0F, 1.5141F, -0.2411F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4477F, -10.6736F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(102, 0).addBox(0.01F, 1.5248F, 0.2072F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4477F, -10.6736F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(47, 101).addBox(0.0F, -3.2438F, -0.0023F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4477F, -10.6736F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(3, 96).addBox(-0.01F, -3.225F, -0.6388F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4477F, -10.6736F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(95, 53).addBox(0.01F, -6.1243F, -0.8382F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4477F, -10.6736F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(12, 97).addBox(0.0F, 0.2646F, -0.086F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.7899F, -13.2302F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(102, 7).addBox(0.01F, 1.2751F, 0.2926F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7899F, -13.2302F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(96, 6).addBox(0.01F, -6.3554F, -0.7108F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7899F, -13.2302F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(9, 97).addBox(-0.01F, -0.1204F, -0.0869F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7899F, -14.7302F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 101).addBox(0.0F, -3.4813F, 0.1129F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7899F, -13.2302F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(28, 102).addBox(0.01F, -0.1216F, -0.9715F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8999F, -14.1938F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(101, 63).addBox(0.0F, -0.1514F, -0.9988F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.4999F, -15.7938F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(102, 14).addBox(0.0F, -0.055F, 0.0559F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7999F, -15.1938F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(54, 97).addBox(-0.01F, -1.8527F, -0.8342F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5999F, -16.0938F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(29, 96).addBox(0.01F, -4.7288F, -0.9909F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5999F, -16.0938F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(96, 66).addBox(0.0F, -5.9565F, -0.4887F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2771F, -18.3955F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, 0.0381F, -0.1654F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3715F, -5.8492F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(68, 100).addBox(0.01F, 0.4479F, 0.0821F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3715F, -5.8492F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(103, 29).addBox(0.0F, -3.2239F, -0.03F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3715F, -5.8492F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(74, 23).addBox(-0.01F, -3.2081F, -0.2684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3715F, -5.8492F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(57, 66).addBox(0.01F, -2.9966F, -1.8976F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.5715F, -5.1492F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(62, 57).addBox(0.01F, -5.2779F, -0.8198F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.9497F, -3.5568F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(70, 16).addBox(-0.01F, -2.4383F, -0.3826F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.9497F, -3.5568F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(103, 21).addBox(0.0F, -2.4464F, -0.0631F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.9497F, -3.5568F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(60, 100).addBox(0.01F, 1.2237F, 0.144F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.9497F, -3.5568F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(81, 100).addBox(0.0F, 0.8112F, -0.0764F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.9497F, -3.5568F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(33, 61).addBox(0.0F, -3.1905F, -1.0504F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0611F, -0.7646F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 90).addBox(-0.01F, -0.3509F, -1.0132F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0611F, -0.7646F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(38, 90).addBox(0.01F, -0.281F, -0.8715F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0611F, -0.0646F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(87, 101).addBox(0.01F, -0.1811F, -1.2672F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 94).addBox(0.0F, -0.1811F, -0.9672F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.3611F, 2.8354F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(100, 20).addBox(0.0F, -0.281F, -0.8715F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2611F, 2.8354F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(76, 71).addBox(-0.01F, -0.3509F, -0.6132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2611F, 2.1354F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 54).addBox(0.01F, -3.1905F, -1.0504F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2611F, 2.1354F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(31, 102).addBox(-0.01F, 0.0253F, 0.0346F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7771F, -20.1955F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(71, 89).addBox(0.0F, -0.0991F, -1.0146F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.4771F, -18.2955F, 0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -18.0F, 0.0455F, 0.0416F, 0.0455F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(51, 57).addBox(-1.0F, 0.0855F, 0.0911F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.0F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(74, 102).addBox(0.0F, -0.2033F, -0.0106F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9514F, -1.5854F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(3, 104).addBox(-0.01F, -0.2027F, -0.086F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0514F, -3.7854F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(48, 64).addBox(0.01F, -2.5F, -0.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.5514F, -4.4854F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(101, 70).addBox(0.01F, -5.0607F, -0.2226F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4225F, 0.5933F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(103, 55).addBox(0.0F, -3.4195F, -0.9662F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4225F, -0.8067F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(51, 81).addBox(0.0F, -5.2735F, -0.2422F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.4079F, -5.0129F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(20, 0).addBox(0.01F, -0.9656F, -2.0543F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.3079F, -8.6129F, 2.6965F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 90).addBox(-0.01F, -4.0F, -0.6F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.8504F, -5.7586F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(57, 97).addBox(-0.01F, -6.092F, -0.0107F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9106F, -5.609F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(32, 85).addBox(0.0F, -4.2744F, -0.2468F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4106F, -6.809F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(77, 102).addBox(-0.01F, -3.7351F, -0.5027F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3106F, -8.009F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(83, 89).addBox(0.0F, -3.7744F, -0.3468F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3106F, -8.009F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(79, 90).addBox(0.0F, -7.0427F, 1.3858F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 98).addBox(0.0F, -5.0427F, -0.3142F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7943F, -6.0996F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(79, 83).mirror().addBox(-0.3283F, 0.0202F, 0.8169F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 14.4725F, -1.2826F, -0.2575F, -0.8334F, 0.3446F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(76, 71).mirror().addBox(-0.3283F, 1.1819F, 3.6265F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 14.4725F, -1.2826F, 0.0566F, -0.8334F, 0.3446F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(76, 17).mirror().addBox(-0.3283F, 1.1819F, 3.6265F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 14.4725F, -1.2826F, -0.0589F, -1.0127F, 0.489F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(34, 43).mirror().addBox(-0.3283F, 0.0202F, 0.8169F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 14.4725F, -1.2826F, -0.3731F, -1.0127F, 0.489F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(67, 16).mirror().addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.5725F, -1.2826F, -0.6016F, -1.1915F, 0.8888F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.5725F, -1.2826F, -1.6232F, -1.3989F, 2.0629F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(89, 26).mirror().addBox(-0.75F, -0.7837F, 0.0237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 13.9598F, -3.6005F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-1.25F, -0.5F, -3.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 16).addBox(1.15F, -0.5F, -3.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 13.8598F, -3.1005F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(0.069F, -2.4225F, -2.9904F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1F, 11.668F, -5.3294F, 1.3619F, -0.4451F, -1.1132F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(51, 43).mirror().addBox(0.0F, -1.4836F, -1.9712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 9.668F, -5.3294F, 1.1355F, -0.2296F, -0.4552F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(80, 60).mirror().addBox(-6.0F, -0.065F, -4.0162F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 60).addBox(5.0F, -0.065F, -4.0162F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.9F, -3.8F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(62, 48).mirror().addBox(-6.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(62, 48).addBox(5.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.0F, -3.7F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(36, 0).addBox(-1.069F, -2.4225F, -2.9904F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.1F, 11.668F, -5.3294F, 1.3619F, 0.4451F, 1.1132F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(51, 43).addBox(-1.0F, -1.4836F, -1.9712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 9.668F, -5.3294F, 1.1355F, 0.2296F, 0.4552F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(51, 2).mirror().addBox(-12.8924F, -2.4101F, -0.0847F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0789F, 1.8974F, 0.2126F, 0.3586F, -1.2373F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(103, 62).mirror().addBox(-3.6399F, -0.9619F, -0.0847F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0789F, 1.8974F, 0.3435F, 0.2368F, -0.7984F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(103, 37).mirror().addBox(-1.9143F, -0.1826F, -0.2012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0789F, 1.8974F, 0.4242F, 0.1333F, -0.3668F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(48, 23).mirror().addBox(-13.9228F, -2.4228F, -0.2893F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0354F, 0.3337F, 0.2355F, 0.4252F, -1.2113F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(84, 73).mirror().addBox(-3.6728F, -0.9606F, -0.2893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0354F, 0.3337F, 0.3927F, 0.288F, -0.7683F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(100, 81).mirror().addBox(-1.9308F, -0.1705F, -0.4074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0354F, 0.3337F, 0.4894F, 0.16F, -0.34F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(18, 18).mirror().addBox(-14.9701F, -2.3749F, 0.1042F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.257F, -1.5557F, 0.2549F, 0.4745F, -1.2029F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-3.6955F, -0.8972F, 0.1042F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.257F, -1.5557F, 0.4315F, 0.325F, -0.7567F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(84, 50).mirror().addBox(-1.9494F, -0.098F, -0.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.257F, -1.5557F, 0.5392F, 0.1784F, -0.3317F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(103, 104).mirror().addBox(-3.7544F, -0.849F, -0.0165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -2.9557F, 0.4699F, 0.3628F, -0.7613F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-14.0438F, -2.3561F, -0.0165F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -2.9557F, 0.2733F, 0.5242F, -1.2117F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(10, 34).mirror().addBox(-1.9751F, -0.0313F, -0.1387F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -2.9557F, 0.5885F, 0.1981F, -0.34F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(-13.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.757F, -4.1557F, 0.2993F, 0.5905F, -1.1805F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(105, 15).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.757F, -4.1557F, 0.5227F, 0.4127F, -0.724F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(41, 77).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.757F, -4.1557F, 0.6549F, 0.2238F, -0.3087F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(10, 39).mirror().addBox(-11.1021F, -2.3689F, -0.3751F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.257F, -5.3557F, 0.3178F, 0.6407F, -1.1525F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.257F, -5.3557F, 0.7044F, 0.2446F, -0.2799F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(105, 10).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.257F, -5.3557F, 0.5621F, 0.4511F, -0.6902F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(105, 10).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.257F, -5.3557F, 0.5621F, -0.4511F, 0.6902F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.257F, -5.3557F, 0.7044F, -0.2446F, 0.2799F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(10, 39).addBox(3.1021F, -2.3689F, -0.3751F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.257F, -5.3557F, 0.3178F, -0.6407F, 1.1525F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(51, 4).addBox(3.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.757F, -4.1557F, 0.2993F, -0.5905F, 1.1805F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(41, 77).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.757F, -4.1557F, 0.6549F, -0.2238F, 0.3087F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(105, 15).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.757F, -4.1557F, 0.5227F, -0.4127F, 0.724F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(103, 104).addBox(1.7544F, -0.849F, -0.0165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -2.9557F, 0.4699F, -0.3628F, 0.7613F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(10, 34).addBox(-0.0249F, -0.0313F, -0.1387F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -2.9557F, 0.5885F, -0.1981F, 0.34F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(51, 0).addBox(3.0438F, -2.3561F, -0.0165F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -2.9557F, 0.2733F, -0.5242F, 1.2117F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(84, 50).addBox(-0.0506F, -0.098F, -0.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.257F, -1.5557F, 0.5392F, -0.1784F, 0.3317F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(80, 67).addBox(1.6955F, -0.8972F, 0.1042F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.257F, -1.5557F, 0.4315F, -0.325F, 0.7567F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(18, 18).addBox(2.9701F, -2.3749F, 0.1042F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.257F, -1.5557F, 0.2549F, -0.4745F, 1.2029F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(100, 81).addBox(-0.0692F, -0.1705F, -0.4074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0354F, 0.3337F, 0.4894F, -0.16F, 0.34F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(84, 73).addBox(1.6728F, -0.9606F, -0.2893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0354F, 0.3337F, 0.3927F, -0.288F, 0.7683F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(48, 23).addBox(2.9228F, -2.4228F, -0.2893F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0354F, 0.3337F, 0.2355F, -0.4252F, 1.2113F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(103, 37).addBox(-0.0857F, -0.1826F, -0.2012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0789F, 1.8974F, 0.4242F, -0.1333F, 0.3668F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(103, 62).addBox(1.6399F, -0.9619F, -0.0847F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0789F, 1.8974F, 0.3435F, -0.2368F, 0.7984F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(51, 2).addBox(2.8924F, -2.4101F, -0.0847F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0789F, 1.8974F, 0.2126F, -0.3586F, 1.2373F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(62, 60).addBox(5.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.0F, -3.7F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(34, 43).addBox(-0.6717F, 0.0202F, 0.8169F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 14.4725F, -1.2826F, -0.3731F, 1.0127F, -0.489F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(76, 17).addBox(-0.6717F, 1.1819F, 3.6265F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 14.4725F, -1.2826F, -0.0589F, 1.0127F, -0.489F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(76, 71).addBox(-0.6717F, 1.1819F, 3.6265F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 14.4725F, -1.2826F, 0.0566F, 0.8334F, -0.3446F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(79, 83).addBox(-0.6717F, 0.0202F, 0.8169F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 14.4725F, -1.2826F, -0.2575F, 0.8334F, -0.3446F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(67, 16).addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 14.5725F, -1.2826F, -0.6016F, 1.1915F, -0.8888F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(76, 77).addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 14.5725F, -1.2826F, -1.6232F, 1.3989F, -2.0629F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(89, 26).addBox(-0.25F, -0.7837F, 0.0237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 13.9598F, -3.6005F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(30, 52).addBox(-1.0F, -1.1F, -9.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8029F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6F, 12.3F, -3.8F, 0.8106F, 0.276F, -0.307F));

		PartDefinition cube_r223 = leftArm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(61, 32).addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftArm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(21, 91).addBox(0.0419F, -15.7734F, -7.7275F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftArm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(59, 25).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r226 = leftArm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(99, 88).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, 1.6683F, -0.3971F, -0.06F, -0.4743F, -0.0768F));

		PartDefinition cube_r227 = leftArm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(95, 20).addBox(-0.2622F, -0.0365F, -0.1809F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6168F, 3.2178F, -1.1103F, 0.5073F, -0.4743F, -0.0768F));

		PartDefinition cube_r228 = leftArm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(94, 13).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(36, 77).addBox(-0.5909F, -0.1079F, -0.2717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(10, 86).addBox(-0.5909F, 1.8921F, -1.3717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2155F, 9.2874F, 2.0638F, -1.4148F, 0.5902F, -0.0909F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(50, 29).addBox(-0.508F, -0.0675F, -1.0751F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0583F, 10.7999F, -0.2572F, 0.3228F, 0.2204F, 0.5468F));

		PartDefinition cube_r229 = leftArm3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(81, 31).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.008F, 0.0807F, -1.0948F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftArm3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(50, 57).addBox(12.3545F, -3.1239F, -11.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(68, 70).addBox(-0.5945F, -0.2848F, -0.5127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0365F, 0.3564F, 0.6637F, 1.1781F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6F, 12.3F, -3.8F, 0.3743F, -0.276F, 0.307F));

		PartDefinition cube_r231 = rightArm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(8, 0).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightArm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(74, 90).addBox(-1.0419F, -15.7734F, -7.7275F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightArm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(22, 50).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r234 = rightArm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(63, 99).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, 1.6683F, -0.3971F, -0.06F, 0.4743F, 0.0768F));

		PartDefinition cube_r235 = rightArm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(44, 94).addBox(-0.7378F, -0.0365F, -0.1809F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6168F, 3.2178F, -1.1103F, 0.5073F, 0.4743F, 0.0768F));

		PartDefinition cube_r236 = rightArm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(26, 91).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(0, 77).addBox(-0.4091F, -0.1079F, -0.2717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(5, 86).addBox(-0.4091F, 1.8921F, -1.3717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2155F, 9.2874F, 2.0638F, -1.4584F, -0.5902F, 0.0909F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(48, 13).addBox(-0.492F, -0.0675F, -1.0751F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0583F, 10.7999F, -0.2572F, 0.3401F, -0.192F, -0.6311F));

		PartDefinition cube_r237 = rightArm3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(74, 38).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.008F, 0.0807F, -1.0948F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightArm3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(11, 54).addBox(-13.3545F, -3.1239F, -11.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(28, 0).addBox(-0.4055F, -0.2848F, -0.5127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0365F, 0.3564F, 0.6637F, 1.1781F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offset(0.0F, 6.2F, -6.3F));

		PartDefinition cube_r239 = neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 0).addBox(0.0F, -2.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 42).addBox(0.0F, -3.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.1F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-8.9189F, -2.5315F, -0.9724F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.157F, -0.3557F, 0.5154F, 0.8061F, -1.1073F));

		PartDefinition cube_r241 = neck4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(105, 8).mirror().addBox(-3.7153F, -1.0607F, -0.9724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.157F, -0.3557F, 0.7952F, 0.5349F, -0.6657F));

		PartDefinition cube_r242 = neck4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(-1.9685F, -0.253F, -1.0931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.157F, -0.3557F, 0.9329F, 0.2454F, -0.3106F));

		PartDefinition cube_r243 = neck4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(65, 57).mirror().addBox(-4.738F, -0.9017F, -0.7421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4438F, -2.5481F, 0.851F, 0.8274F, -0.6142F));

		PartDefinition cube_r244 = neck4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-1.937F, -0.096F, -0.8625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4438F, -2.5481F, 1.0886F, 0.5033F, -0.2372F));

		PartDefinition cube_r245 = neck4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-4.1346F, -0.7551F, -1.0988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -3.8557F, 0.7107F, 1.056F, -0.7673F));

		PartDefinition cube_r246 = neck4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-1.3065F, -0.2198F, -1.1788F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -3.8557F, 1.1167F, 0.7449F, -0.2594F));

		PartDefinition cube_r247 = neck4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(30, 50).addBox(0.3065F, -0.2198F, -1.1788F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -3.8557F, 1.1167F, -0.7449F, 0.2594F));

		PartDefinition cube_r248 = neck4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(60, 6).addBox(1.1346F, -0.7551F, -1.0988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -3.8557F, 0.7107F, -1.056F, 0.7673F));

		PartDefinition cube_r249 = neck4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(44, 52).addBox(-0.063F, -0.096F, -0.8625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4438F, -2.5481F, 1.0886F, -0.5033F, 0.2372F));

		PartDefinition cube_r250 = neck4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(65, 57).addBox(1.738F, -0.9017F, -0.7421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4438F, -2.5481F, 0.851F, -0.8274F, 0.6142F));

		PartDefinition cube_r251 = neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(105, 8).addBox(1.7153F, -1.0607F, -0.9724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.157F, -0.3557F, 0.7952F, -0.5349F, 0.6657F));

		PartDefinition cube_r252 = neck4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(66, 46).addBox(-0.0315F, -0.253F, -1.0931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.157F, -0.3557F, 0.9329F, -0.2454F, 0.3106F));

		PartDefinition cube_r253 = neck4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 13).addBox(2.9189F, -2.5315F, -0.9724F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.157F, -0.3557F, 0.5154F, -0.8061F, 1.1073F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8F, -3.7F, -0.0324F, 0.1794F, 0.1247F));

		PartDefinition cube_r254 = neck3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(83, 13).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -4.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -3.9F, 0.0176F, 0.2633F, 0.1206F));

		PartDefinition cube_r255 = neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(24, 61).addBox(-0.5F, -0.022F, -0.04F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.9F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -4.7F, 0.0816F, -0.1135F, -0.1764F));

		PartDefinition cube_r256 = neck.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(22, 50).addBox(-0.5F, 0.2F, -1.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -3.4F, -0.1944F, -0.0836F, -0.0732F));

		PartDefinition cube_r257 = heads.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(35, 15).addBox(-1.5F, -0.9193F, 0.0072F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, -9.9F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r258 = heads.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(51, 6).addBox(-1.5F, -0.5811F, -0.222F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.4F, -11.4F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r259 = heads.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(19, 43).addBox(-1.0F, -0.0734F, -1.8529F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -11.4F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r260 = heads.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(50, 29).mirror().addBox(-0.2F, -0.0687F, -8.051F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 29).addBox(0.4F, -0.0687F, -8.051F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -6.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r261 = heads.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(78, 38).mirror().addBox(-1.0F, -0.4223F, -7.5617F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(78, 38).addBox(-0.4F, -0.4223F, -7.5617F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(70, 2).mirror().addBox(-1.5F, -0.4223F, -3.5617F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 2).addBox(-0.9F, -0.4223F, -3.5617F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.8F, -5.2F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r262 = heads.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(98, 33).mirror().addBox(-0.5F, -0.4145F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.5545F, -7.5965F, 0.716F, -0.1456F, -0.1256F));

		PartDefinition cube_r263 = heads.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(74, 98).mirror().addBox(-0.12F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.0833F, -7.8372F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r264 = heads.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(84, 77).mirror().addBox(-1.3F, -0.7F, -1.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 77).addBox(-0.1F, -0.7F, -1.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.0924F, -6.3465F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r265 = heads.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(106, 42).mirror().addBox(0.0F, -0.0687F, -0.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(106, 42).addBox(1.2F, -0.0687F, -0.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, -0.4F, -6.0F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r266 = heads.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(0.0F, -0.0248F, 0.0957F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 57).addBox(1.2F, -0.0248F, 0.0957F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -1.2F, -5.7F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r267 = heads.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.979F, -0.7086F, -3.8732F, 0.3155F, -0.2494F, -0.0804F));

		PartDefinition cube_r268 = heads.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(51, 74).mirror().addBox(-1.43F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 78).mirror().addBox(-1.45F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 39).mirror().addBox(-1.63F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.1477F, -3.038F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r269 = heads.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(26, 20).mirror().addBox(-1.42F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4285F, -1.1589F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r270 = heads.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(93, 42).mirror().addBox(-2.0F, -0.0598F, 0.0244F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(93, 42).addBox(1.0F, -0.0598F, 0.0244F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.4F, -1.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r271 = heads.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(106, 45).mirror().addBox(-1.1F, -0.01F, -0.0776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 45).addBox(1.1F, -0.01F, -0.0776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 54).addBox(-1.5F, 0.0035F, 0.0224F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.8F, -1.8F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r272 = heads.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(34, 29).addBox(-2.0F, -0.9408F, 0.0493F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.5F, -4.8F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r273 = heads.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(98, 33).addBox(-0.5F, -0.4145F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 2.5545F, -7.5965F, 0.716F, 0.1456F, 0.1256F));

		PartDefinition cube_r274 = heads.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(24, 70).mirror().addBox(-1.5F, -1.0284F, 0.0587F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(19, 67).mirror().addBox(-1.3F, -0.7284F, 0.1587F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 67).addBox(1.9F, -0.7284F, 0.1587F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(24, 70).addBox(-0.9F, -1.0284F, 0.0587F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, 3.9F, -7.8F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r275 = heads.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(18, 20).mirror().addBox(0.0F, -0.2F, -1.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 20).addBox(3.2F, -0.2F, -1.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 1.781F, -3.7503F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r276 = heads.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(8, 18).mirror().addBox(-2.5F, -0.5875F, -0.0163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(8, 18).addBox(0.5F, -0.5875F, -0.0163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.7F, -0.2F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r277 = heads.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(26, 20).addBox(0.42F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4285F, -1.1589F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r278 = heads.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(74, 98).addBox(-0.88F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 2.0833F, -7.8372F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r279 = heads.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(105, 39).addBox(0.63F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(105, 78).addBox(0.45F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 74).addBox(0.43F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1477F, -3.038F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r280 = heads.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(20, 9).addBox(-2.0F, -0.9987F, -2.0229F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.0F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r281 = heads.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -1.0024F, -1.9669F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.0F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r282 = heads.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(34, 37).addBox(-2.0F, -0.9364F, -0.8865F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -0.3F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r283 = heads.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(69, 32).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(80, 44).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r284 = heads.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(98, 37).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.979F, -0.7086F, -3.8732F, 0.3155F, 0.2494F, 0.0804F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(87, 37).mirror().addBox(-1.0F, -0.4F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(87, 37).addBox(1.8F, -0.4F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9F, -0.7968F, -2.5512F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(77, 53).mirror().addBox(-1.0F, -0.1247F, -0.5398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 53).addBox(1.8F, -0.1247F, -0.5398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -1.3F, -1.6F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(94, 48).mirror().addBox(-1.0F, -0.1F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(94, 48).addBox(1.8F, -0.1F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(30, 52).mirror().addBox(-1.0F, -0.9F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(21, 85).mirror().addBox(-1.0F, -0.5F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 85).mirror().addBox(-1.0F, -0.1F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(30, 52).addBox(1.8F, -0.9F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(21, 85).addBox(1.8F, -0.5F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(54, 85).addBox(1.8F, -0.1F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(93, 35).mirror().addBox(-1.0F, -0.9999F, -0.0843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 35).addBox(1.8F, -0.9999F, -0.0843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.9F, 0.0F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(75, 79).mirror().addBox(-1.0F, -0.0336F, -5.0052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 83).mirror().addBox(-1.3F, -0.2336F, -3.9052F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 83).mirror().addBox(-1.5F, -0.0336F, -4.0052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(75, 79).addBox(0.6F, -0.0336F, -5.0052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 83).addBox(1.9F, -0.2336F, -3.9052F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(84, 83).addBox(1.1F, -0.0336F, -4.0052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, -0.4F, -4.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(97, 59).mirror().addBox(-1.0F, 0.0299F, -0.0291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1F, -10.2F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(91, 68).mirror().addBox(-1.0F, -0.055F, -0.0327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.7F, -11.0F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(96, 29).mirror().addBox(-0.5F, -0.9575F, -1.6591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.6F, -10.9F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(105, 34).mirror().addBox(-1.0F, -0.952F, -0.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.4F, -9.9F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(84, 67).mirror().addBox(-1.0F, -1.0283F, -3.8832F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 25).mirror().addBox(-0.5F, -1.0283F, -5.8832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(84, 67).addBox(1.6F, -1.0283F, -3.8832F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(98, 25).addBox(1.1F, -1.0283F, -5.8832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8F, 1.0F, -4.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(97, 59).addBox(0.0F, 0.0299F, -0.0291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 0.1F, -10.2F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(91, 68).addBox(0.0F, -0.055F, -0.0327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.7F, -11.0F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(96, 29).addBox(-0.5F, -0.9575F, -1.6591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.6F, -10.9F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(105, 34).addBox(0.0F, -0.952F, -0.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 1.4F, -9.9F, 0.192F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -0.6F, 1.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.1F, 8.5F, -0.15F, -0.1285F, 0.0251F));

		PartDefinition cube_r300 = tail.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(59, 16).addBox(-0.01F, -0.2F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.155F, 13.0977F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r301 = tail.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(34, 100).addBox(0.0F, -5.8907F, -0.0329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.509F, 12.4509F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r302 = tail.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(41, 94).addBox(0.0F, -6.3907F, 1.3671F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.409F, 12.4509F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r303 = tail.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(61, 39).addBox(-0.01F, -0.2F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.755F, 11.5977F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r304 = tail.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(37, 100).addBox(0.0F, -5.8907F, -0.0329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.109F, 10.9509F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r305 = tail.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(100, 41).addBox(0.0F, -1.6F, -0.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.109F, 11.6509F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r306 = tail.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(35, 70).addBox(-0.01F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.555F, 9.3977F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r307 = tail.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(106, 53).addBox(-0.01F, -0.9F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0608F, 7.8384F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r308 = tail.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(100, 51).addBox(0.0F, -2.2F, -0.3F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.109F, 9.6509F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r309 = tail.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(15, 99).addBox(0.0F, -3.9601F, -0.322F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1634F, 7.1626F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r310 = tail.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(9, 105).addBox(-0.01F, -1.7F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9608F, 5.8384F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r311 = tail.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(12, 105).addBox(0.0F, -4.0707F, -0.8919F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7202F, 5.8033F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r312 = tail.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(18, 99).addBox(-0.01F, -0.0139F, -1.0837F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7202F, 6.0033F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r313 = tail.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(99, 0).addBox(0.0F, 1.4F, 5.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 12).addBox(0.0F, -0.1F, 3.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 94).addBox(0.0F, -1.3F, 1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 63).addBox(0.0F, -3.0F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5199F, 7.7664F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r314 = tail.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(106, 48).addBox(0.0F, -1.5F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3834F, 3.9983F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r315 = tail.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(89, 89).addBox(0.0F, -9.7382F, -0.0676F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5202F, 1.7033F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r316 = tail.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(86, 89).addBox(-0.01F, -9.7382F, -0.3676F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5202F, 1.7033F, -0.1658F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(18, 21).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 14.0F, -0.0348F, -0.1309F, -0.0011F));

		PartDefinition cube_r317 = tail2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(63, 105).addBox(0.0F, -4.9F, 3.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 103).addBox(0.0F, -4.2F, 1.4F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 41).addBox(0.0F, -3.1F, -0.7F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4758F, 8.4512F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r318 = tail2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(103, 48).addBox(0.0F, -4.5F, 2.9F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 99).addBox(0.0F, -4.0F, 1.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 91).addBox(0.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3918F, 2.9557F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r319 = tail2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(93, 103).addBox(0.0F, -1.0F, 1.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 0).addBox(0.0F, -2.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, 10.8858F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r320 = tail2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(6, 105).addBox(0.0F, -1.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6236F, 8.3868F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r321 = tail2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(90, 102).addBox(0.0F, 4.5F, 9.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 102).addBox(0.0F, 3.2F, 7.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5199F, -6.2336F, 0.672F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(36, 29).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 13.0F, 0.1598F, 0.2167F, 0.0251F));

		PartDefinition cube_r322 = tail3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(103, 106).addBox(0.0F, -7.0819F, 7.9741F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 106).addBox(0.0F, -6.1819F, 5.9741F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 107).addBox(0.0F, -5.2819F, 3.9741F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 105).addBox(0.0F, -4.5819F, 1.9741F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 105).addBox(0.0F, -3.5819F, -0.0259F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 1.3491F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r323 = tail3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(26, 60).addBox(0.0F, 6.4F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 17).addBox(0.0F, 4.1F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 22).addBox(0.0F, 2.9F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 106).addBox(0.0F, 1.7F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 27).addBox(0.0F, 0.9F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -2.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(34, 15).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.1573F, 0.5643F, 0.061F));

		PartDefinition cube_r324 = tail4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(76, 17).addBox(0.0F, -10.6819F, 15.9741F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 79).addBox(0.0F, -9.6819F, 13.9741F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 85).addBox(0.0F, -8.7819F, 11.9741F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 106).addBox(0.0F, -7.9819F, 9.9741F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, -9.6509F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r325 = tail4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(40, 43).addBox(0.0F, 11.2F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 20).addBox(0.0F, 9.4F, 17.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 20).addBox(0.0F, 8.5F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 42).addBox(0.0F, 7.4F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -13.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.3551F, 0.2577F, 0.0465F));

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