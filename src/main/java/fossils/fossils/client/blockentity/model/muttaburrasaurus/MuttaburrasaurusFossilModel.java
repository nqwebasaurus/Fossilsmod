package fossils.fossils.client.blockentity.model.muttaburrasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MuttaburrasaurusFossilModel extends SkullModelBase {
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
	private final ModelPart leftArm4;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public MuttaburrasaurusFossilModel(ModelPart root) {
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
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(19, 81).addBox(3.0F, -2.9627F, 3.4783F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(19, 81).mirror().addBox(-4.0F, -2.9627F, 3.4783F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -33.0F, -8.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, -0.0475F, -13.0541F, 0.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7F, 9.3F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 66).addBox(0.0F, -3.7604F, 0.0633F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, 9.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(76, 44).mirror().addBox(-0.2906F, -0.7545F, 2.8944F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7704F, 5.9745F, 5.0829F, -1.2717F, 0.2168F, 0.0625F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 61).mirror().addBox(-0.2906F, -0.2472F, -0.0098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7704F, 5.9745F, 5.0829F, -1.0971F, 0.2168F, 0.0625F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 58).mirror().addBox(-3.0F, 0.5F, 3.8F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 24).mirror().addBox(-4.0F, -0.2F, 4.9F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 24).addBox(3.0F, -0.2F, 4.9F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.005F))
				.texOffs(30, 58).addBox(1.0F, 0.5F, 3.8F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.0F, -5.2F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 26).mirror().addBox(0.4F, -1.4928F, -0.7952F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1F, -2.2F, 5.0F, -0.4378F, 0.2862F, -0.1314F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(-5.0F, -0.0717F, -0.0584F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(81, 63).mirror().addBox(-4.0F, -0.0717F, -0.0584F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(49, 82).addBox(4.0F, -0.0717F, -0.0584F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(81, 63).addBox(3.0F, -0.0717F, -0.0584F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -5.7F, 3.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(0.0F, -0.7437F, -3.9851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -5.5867F, 0.0422F, 0.1254F, -0.2252F, -0.0281F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-5.0F, -0.1176F, 0.0813F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 50).mirror().addBox(-4.0F, 0.8824F, 0.0813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 51).addBox(3.0F, -0.1176F, 0.0813F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(83, 50).addBox(3.0F, 0.8824F, 0.0813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2F, -0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(21, 26).mirror().addBox(0.0F, 0.2932F, -0.3798F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.372F, 2.0624F, -0.9662F, 0.2168F, -0.4088F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 58).mirror().addBox(0.0F, -1.5083F, -1.8338F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.372F, 2.0624F, -1.4113F, 0.2168F, -0.4088F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(0.0F, -0.479F, 0.4589F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.372F, 2.0624F, -1.0971F, 0.2168F, -0.4088F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 48).mirror().addBox(-0.4241F, -0.3892F, -0.0241F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 3.8F, 1.7F, -1.0123F, 0.0F, -0.1396F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(41, 60).mirror().addBox(0.0F, -0.7986F, -0.1279F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.3F, -2.5F, -0.8378F, 0.0F, -0.4363F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(83, 41).mirror().addBox(-4.0F, -0.0534F, -0.1117F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 41).addBox(3.0F, -0.0534F, -0.1117F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(51, 68).mirror().addBox(-4.0F, 0.371F, -5.0046F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(51, 68).addBox(3.0F, 0.371F, -5.0046F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(8, 24).mirror().addBox(-4.0F, -1.0765F, -1.9801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 24).addBox(3.0F, -1.0765F, -1.9801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, 8.3F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 28).mirror().addBox(-4.0F, -0.0092F, -1.0523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(30, 28).addBox(3.0F, -0.0092F, -1.0523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.8F, 7.3F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-4.0F, -1.9809F, -0.099F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 35).addBox(3.0F, -1.9809F, -0.099F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, 3.8F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(71, 73).mirror().addBox(-4.0F, -1.7367F, -0.5175F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 73).addBox(3.0F, -1.7367F, -0.5175F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -3.5F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 83).mirror().addBox(-4.0F, -0.9878F, -0.2179F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(58, 83).addBox(3.0F, -0.9878F, -0.2179F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -4.0F, -6.3F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(76, 83).mirror().addBox(-4.0F, 0.0599F, -3.0112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 83).addBox(3.0F, 0.0599F, -3.0112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9F, -4.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(38, 75).mirror().addBox(-4.0F, -0.1176F, -3.9187F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(38, 75).addBox(3.0F, -0.1176F, -3.9187F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.2F, -0.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(82, 26).addBox(-1.4F, -1.4928F, -0.7952F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1F, -2.2F, 5.0F, -0.4378F, -0.2862F, 0.1314F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(76, 51).addBox(-1.0F, -0.7437F, -3.9851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.5867F, 0.0422F, 0.1254F, 0.2252F, 0.0281F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(42, 48).addBox(-0.5759F, -0.3892F, -0.0241F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 3.8F, 1.7F, -1.0123F, 0.0F, 0.1396F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(41, 60).addBox(-1.0F, -0.7986F, -0.1279F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0F, 0.3F, -2.5F, -0.8378F, 0.0F, 0.4363F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(76, 44).addBox(-0.7094F, -0.7545F, 2.8944F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7704F, 5.9745F, 5.0829F, -1.2717F, -0.2168F, -0.0625F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(21, 26).addBox(-1.0F, 0.2932F, -0.3798F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.372F, 2.0624F, -0.9662F, -0.2168F, 0.4088F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 58).addBox(-1.0F, -1.5083F, -1.8338F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.372F, 2.0624F, -1.4113F, -0.2168F, 0.4088F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(17, 61).addBox(-0.7094F, -0.2472F, -0.0098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7704F, 5.9745F, 5.0829F, -1.0971F, -0.2168F, -0.0625F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0F, -0.479F, 0.4589F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 1.372F, 2.0624F, -1.0971F, -0.2168F, 0.4088F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, -1.2F, 0.6F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(60, 15).addBox(-0.5F, 0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6954F, 0.2628F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(64, 68).addBox(-1.0F, -6.5811F, -1.287F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.4086F, -1.306F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 68).addBox(-1.0F, -6.8476F, -0.0348F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3086F, -1.506F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(67, 48).addBox(-1.0F, -0.3134F, -4.0706F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 12.7925F, 3.2956F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(38, 68).addBox(-1.0F, 4.3F, -1.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.7925F, -0.3044F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(81, 6).addBox(-1.0F, -4.0119F, -0.2197F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.3086F, -0.506F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(24, 67).addBox(-1.9F, 2.4544F, 0.0932F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-1.9F, -0.0456F, -1.1068F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(79, 77).addBox(-1.9F, 13.4544F, -0.4068F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.7086F, 1.594F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -7.4F, -0.6F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 7.4567F, 1.0234F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(5, 78).addBox(-1.9F, -5.1F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 7.5544F, 0.0932F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(73, 29).addBox(-1.5F, 0.1F, -1.7F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 15.9544F, 1.2932F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(49, 89).addBox(-0.4F, -1.5F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, 4.6F, -1.2F, -0.0274F, -0.1041F, 0.5141F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(0, 61).addBox(-2.0F, -1.0319F, -3.2504F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -0.4F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(59, 34).addBox(-2.0F, -1.3F, -3.2F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, -1.2F, 0.6F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(33, 53).addBox(-0.5F, 0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6954F, 0.2628F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(41, 48).addBox(-1.0F, -6.5811F, -1.287F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.4086F, -1.306F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -6.8476F, -0.0348F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3086F, -1.506F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 8).addBox(-1.0F, -0.3134F, -4.0706F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 12.7925F, 3.2956F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(25, 46).addBox(-1.0F, 4.3F, -1.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.7925F, -0.3044F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(12, 10).addBox(-1.0F, -4.0119F, -0.2197F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.3086F, -0.506F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(15, 67).addBox(-0.1F, 2.4544F, 0.0932F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 34).addBox(-0.1F, -0.0456F, -1.1068F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(78, 71).addBox(-0.1F, 13.4544F, -0.4068F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.7086F, 1.594F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(33, 67).addBox(-0.5F, -7.4F, -0.6F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 7.4567F, 1.0234F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(12, 0).addBox(-0.1F, -5.1F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 7.5544F, 0.0932F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(70, 7).addBox(-1.5F, 0.1F, -1.7F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 15.9544F, 1.2932F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 58).addBox(-0.6F, -1.5F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, 4.6F, -1.2F, -0.0274F, 0.1041F, -0.5141F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(60, 0).addBox(-2.0F, -1.0319F, -3.2504F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -0.4F, 0.5585F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(59, 22).addBox(-2.0F, -1.3F, -3.2F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -5.3F, -0.0003F, 0.0869F, -0.0076F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(3, 92).addBox(0.0F, -3.7203F, 0.0422F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -9.0F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(6, 92).addBox(0.0F, -4.0118F, 1.993F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 92).addBox(0.0F, -3.7118F, -0.007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -12.9F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -0.0084F, 0.0128F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, -13.9F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(73, 91).addBox(0.0F, -3.2316F, 0.0853F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.1F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(82, 91).addBox(0.0F, -3.5631F, -0.0289F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(85, 91).addBox(0.0F, -3.6031F, -0.0198F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, -4.5F, -6.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 48).addBox(-1.0F, -1.0F, -6.4F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 26).mirror().addBox(-12.2411F, -3.6315F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4884F, -12.1856F, 0.106F, 0.3148F, -1.3271F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(87, 62).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4884F, -12.1856F, 0.2765F, 0.1855F, -0.6635F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(90, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4884F, -12.1856F, 0.329F, 0.0425F, -0.2111F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(90, 66).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0884F, -10.2856F, 0.3116F, 0.0403F, -0.2642F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(87, 64).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0884F, -10.2856F, 0.2616F, 0.1759F, -0.7186F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(-10.2411F, -3.6315F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0884F, -10.2856F, 0.1001F, 0.2983F, -1.3812F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(90, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3116F, -8.2856F, 0.3116F, 0.0403F, -0.2816F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(87, 77).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3116F, -8.2856F, 0.2616F, 0.1759F, -0.736F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 29).mirror().addBox(-7.2411F, -3.6315F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3116F, -8.2856F, 0.1001F, 0.2983F, -1.3987F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(11, 38).mirror().addBox(-2.782F, -0.908F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0116F, -0.5856F, -0.1298F, -0.0887F, -1.1025F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(90, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0116F, -0.5856F, -0.1558F, -0.0204F, -0.6355F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(88, 4).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4116F, -2.5856F, 0.0144F, 0.0099F, -0.9162F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(88, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4116F, -2.5856F, 0.0173F, 0.0023F, -0.445F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4116F, -4.5856F, 0.1153F, 0.0789F, -0.8594F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4116F, -4.5856F, 0.1384F, 0.0182F, -0.3914F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-5.2411F, -3.6315F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4116F, -6.5856F, 0.0826F, 0.2487F, -1.4907F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(88, 26).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4116F, -6.5856F, 0.2173F, 0.1471F, -0.8304F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4116F, -6.5856F, 0.2597F, 0.0338F, -0.3708F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(90, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0116F, -0.5856F, -0.1558F, 0.0204F, 0.6355F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(11, 38).addBox(1.782F, -0.908F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0116F, -0.5856F, -0.1298F, 0.0887F, 1.1025F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(88, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4116F, -2.5856F, 0.0173F, -0.0023F, 0.445F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(88, 4).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4116F, -2.5856F, 0.0144F, -0.0099F, 0.9162F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(91, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4116F, -4.5856F, 0.1384F, -0.0182F, 0.3914F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(88, 6).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4116F, -4.5856F, 0.1153F, -0.0789F, 0.8594F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(90, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4884F, -12.1856F, 0.329F, -0.0425F, 0.2111F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(87, 62).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4884F, -12.1856F, 0.2765F, -0.1855F, 0.6635F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(30, 26).addBox(3.2411F, -3.6315F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4884F, -12.1856F, 0.106F, -0.3148F, 1.3271F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 16).addBox(3.2411F, -3.6315F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0884F, -10.2856F, 0.1001F, -0.2983F, 1.3812F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(87, 64).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0884F, -10.2856F, 0.2616F, -0.1759F, 0.7186F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(90, 66).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0884F, -10.2856F, 0.3116F, -0.0403F, 0.2642F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(59, 29).addBox(3.2411F, -3.6315F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3116F, -8.2856F, 0.1001F, -0.2983F, 1.3987F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(87, 77).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3116F, -8.2856F, 0.2616F, -0.1759F, 0.736F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(90, 79).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3116F, -8.2856F, 0.3116F, -0.0403F, 0.2816F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(91, 28).addBox(3.2411F, -3.6315F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4116F, -6.5856F, 0.0826F, -0.2487F, 1.4907F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(88, 26).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4116F, -6.5856F, 0.2173F, -0.1471F, 0.8304F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(91, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4116F, -6.5856F, 0.2597F, -0.0338F, 0.3708F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -13.7F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(12, 92).addBox(0.0F, -6.1522F, 7.615F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 92).addBox(0.0F, -5.4522F, 5.715F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 92).addBox(0.0F, -4.6522F, 3.815F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 95).addBox(0.0F, -3.6522F, 1.915F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 95).addBox(0.0F, -3.0522F, 0.015F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2F, -8.6F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(27, 46).mirror().addBox(-0.5F, -0.042F, -0.2389F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.0076F, -6.692F, 0.1113F, -0.8271F, -0.0531F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(43, 34).mirror().addBox(-0.5F, -0.042F, -0.7389F, 1.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.0076F, -6.692F, 0.0933F, -0.7056F, -0.0929F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.042F, -0.0389F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.0076F, -6.692F, 0.0901F, -0.8801F, 0.0142F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-0.5F, -0.042F, -0.3389F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.0076F, -6.692F, 0.0641F, -1.0279F, 0.0874F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -1.6877F, -2.9571F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2F, 7.7F, -9.6F, 0.8539F, -0.5497F, -0.54F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-1.0F, -0.4019F, -0.1129F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(35, 82).addBox(10.4F, -0.4019F, -0.1129F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.2F, 3.3F, -4.9F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(49, 75).mirror().addBox(-1.0F, -0.0811F, 0.4207F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(49, 75).addBox(10.4F, -0.0811F, 0.4207F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-5.2F, 3.3F, -5.3F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(92, 43).mirror().addBox(-1.0F, -2.0584F, -0.9758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 43).addBox(10.4F, -2.0584F, -0.9758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2F, 0.8F, -1.6F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(58, 58).mirror().addBox(-1.0F, -0.9F, -9.7F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 58).addBox(10.4F, -0.9F, -9.7F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2F, 1.6F, -2.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(45, 13).mirror().addBox(-11.2411F, -3.6315F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9884F, -7.7856F, 0.168F, 0.4797F, -1.3031F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(90, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9884F, -7.7856F, 0.5023F, 0.0648F, -0.2019F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(19, 87).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9884F, -7.7856F, 0.4276F, 0.2794F, -0.6287F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-12.2411F, -3.6315F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1884F, -5.8856F, 0.1431F, 0.4136F, -1.2789F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(87, 35).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1884F, -5.8856F, 0.3669F, 0.2417F, -0.6094F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1884F, -5.8856F, 0.4331F, 0.0552F, -0.1711F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(25, 18).mirror().addBox(-13.2411F, -3.6315F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4884F, -4.0856F, 0.1304F, 0.3807F, -1.2315F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(87, 48).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4884F, -4.0856F, 0.3365F, 0.2232F, -0.5641F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(90, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4884F, -4.0856F, 0.3983F, 0.051F, -0.1206F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(21, 24).mirror().addBox(-14.2411F, -3.6315F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8884F, -2.1856F, 0.1242F, 0.3643F, -1.2337F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(49, 87).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8884F, -2.1856F, 0.3214F, 0.2138F, -0.5673F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8884F, -2.1856F, 0.381F, 0.0489F, -0.1215F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(25, 20).mirror().addBox(-13.2411F, -3.6315F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1884F, -0.2856F, 0.1181F, 0.3478F, -1.2882F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(87, 60).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1884F, -0.2856F, 0.3064F, 0.2044F, -0.6228F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(90, 37).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1884F, -0.2856F, 0.3637F, 0.0468F, -0.1747F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(19, 87).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9884F, -7.7856F, 0.4276F, -0.2794F, 0.6287F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(90, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9884F, -7.7856F, 0.5023F, -0.0648F, 0.2019F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(45, 13).addBox(3.2411F, -3.6315F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9884F, -7.7856F, 0.168F, -0.4797F, 1.3031F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(90, 14).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1884F, -5.8856F, 0.4331F, -0.0552F, 0.1711F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(87, 35).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1884F, -5.8856F, 0.3669F, -0.2417F, 0.6094F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 20).addBox(3.2411F, -3.6315F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1884F, -5.8856F, 0.1431F, -0.4136F, 1.2789F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(90, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4884F, -4.0856F, 0.3983F, -0.051F, 0.1206F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(87, 48).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4884F, -4.0856F, 0.3365F, -0.2232F, 0.5641F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(25, 18).addBox(3.2411F, -3.6315F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4884F, -4.0856F, 0.1304F, -0.3807F, 1.2315F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(90, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8884F, -2.1856F, 0.381F, -0.0489F, 0.1215F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(49, 87).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8884F, -2.1856F, 0.3214F, -0.2138F, 0.5673F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(21, 24).addBox(3.2411F, -3.6315F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8884F, -2.1856F, 0.1242F, -0.3643F, 1.2337F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(90, 37).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1884F, -0.2856F, 0.3637F, -0.0468F, 0.1747F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(87, 60).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1884F, -0.2856F, 0.3064F, -0.2044F, 0.6228F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(25, 20).addBox(3.2411F, -3.6315F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1884F, -0.2856F, 0.1181F, -0.3478F, 1.2882F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.6877F, -2.9571F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2F, 7.7F, -9.6F, 0.8539F, 0.5497F, 0.54F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(27, 46).addBox(-0.5F, -0.042F, -0.2389F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.0076F, -6.692F, 0.1113F, 0.8271F, 0.0531F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(43, 34).addBox(-0.5F, -0.042F, -0.7389F, 1.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.0076F, -6.692F, 0.0933F, 0.7056F, 0.0929F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.042F, -0.0389F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.0076F, -6.692F, 0.0901F, 0.8801F, -0.0142F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(19, 58).addBox(-0.5F, -0.042F, -0.3389F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.0076F, -6.692F, 0.0641F, 1.0279F, -0.0874F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(21, 34).addBox(-1.0F, -0.9999F, 0.063F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7983F, -10.5342F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(59, 41).addBox(-2.0F, -0.5F, -2.7F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.4983F, -10.8342F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -0.9F, -7.7F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -2.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(59, 68).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1F, 11.2F, -7.9F, 1.0787F, 0.473F, -0.4867F));

		PartDefinition cube_r142 = leftArm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(44, 82).addBox(-1.0F, -6.6775F, -0.161F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 8.4F, 2.2F, 0.4518F, 0.0185F, -0.0103F));

		PartDefinition cube_r143 = leftArm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(21, 26).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6491F, 0.6993F, -0.9799F, -0.2269F, -0.48F, 0.0F));

		PartDefinition cube_r144 = leftArm.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(56, 75).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8569F, 2.648F, -1.379F, 0.8465F, -0.48F, 0.0F));

		PartDefinition cube_r145 = leftArm.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -0.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.6F, -0.5F, -0.086F, -0.0124F, 0.0087F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(51, 18).addBox(-0.262F, 0.108F, 0.2542F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(14, 81).addBox(-0.262F, 0.108F, -0.8458F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 8.9F, 2.5F, -1.4403F, 0.5682F, 0.0691F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(55, 48).addBox(-1.1578F, 0.0F, -0.3394F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.638F, 9.008F, -0.4458F, 0.2562F, 0.2955F, 0.2874F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(84, 0).addBox(0.0F, -0.5F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6578F, 3.0F, -0.2394F, 0.0F, 0.0F, 1.5708F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(51, 34).addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6284F, 0.3F, 1.5096F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(13, 61).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.1F, 11.2F, -7.9F, 0.999F, -0.2503F, 0.3401F));

		PartDefinition cube_r146 = rightArm.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(28, 81).addBox(0.0F, -6.6775F, -0.161F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 8.4F, 2.2F, 0.4518F, -0.0185F, 0.0103F));

		PartDefinition cube_r147 = rightArm.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6491F, 0.6993F, -0.9799F, -0.2269F, 0.48F, 0.0F));

		PartDefinition cube_r148 = rightArm.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(41, 60).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8569F, 2.648F, -1.379F, 0.8465F, 0.48F, 0.0F));

		PartDefinition cube_r149 = rightArm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(25, 0).addBox(0.0F, -0.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.6F, -0.5F, -0.086F, 0.0124F, -0.0087F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(14, 43).addBox(-0.738F, 0.108F, 0.2542F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(71, 80).addBox(-0.738F, 0.108F, -0.8458F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 8.9F, 2.5F, -1.3975F, -0.2786F, 0.038F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(0, 10).addBox(0.1578F, 0.0F, -0.3394F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.638F, 9.008F, -0.4458F, 0.2562F, -0.2955F, -0.2874F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(47, 68).addBox(-2.0F, -0.5F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6578F, 3.0F, -0.2394F, 0.0F, 0.0F, -1.5708F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(34, 8).addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6284F, 0.3F, 1.5096F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2F, -9.2F, -0.0863F, -0.0876F, -0.0076F));

		PartDefinition cube_r150 = neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(21, 96).addBox(0.0F, -3.0298F, 0.0013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(59, 22).addBox(0.0F, -2.0404F, 0.0392F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(76, 57).addBox(-1.0F, -2.0637F, 0.0065F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.6F, -2.6F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(59, 34).addBox(0.0F, -1.9F, -1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 41).addBox(0.0F, -1.6F, -3.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 13).addBox(-1.0F, -0.5F, -5.6F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r154 = neck3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(81, 13).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2116F, -8.0856F, 0.4024F, 0.7306F, -1.0556F));

		PartDefinition cube_r155 = neck3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(89, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0116F, -6.0856F, 0.4008F, 0.4309F, -0.5749F));

		PartDefinition cube_r156 = neck3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(89, 75).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0116F, -6.0856F, 0.1497F, 0.5623F, -1.0917F));

		PartDefinition cube_r157 = neck3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(89, 88).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3884F, -4.0856F, 0.3776F, 0.3355F, -0.5703F));

		PartDefinition cube_r158 = neck3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3884F, -4.0856F, 0.1811F, 0.4683F, -1.0629F));

		PartDefinition cube_r159 = neck3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-7.2411F, -3.6315F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3884F, -2.3856F, 0.2258F, 0.6994F, -1.5344F));

		PartDefinition cube_r160 = neck3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(85, 69).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3884F, -2.3856F, 0.6159F, 0.4186F, -0.8276F));

		PartDefinition cube_r161 = neck3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3884F, -2.3856F, 0.7205F, 0.1228F, -0.4449F));

		PartDefinition cube_r162 = neck3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(90, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1884F, -0.3856F, 0.5877F, 0.082F, -0.2831F));

		PartDefinition cube_r163 = neck3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-9.2411F, -3.6315F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1884F, -0.3856F, 0.1951F, 0.5633F, -1.3771F));

		PartDefinition cube_r164 = neck3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(86, 71).mirror().addBox(-4.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1884F, -0.3856F, 0.5019F, 0.3298F, -0.694F));

		PartDefinition cube_r165 = neck3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(81, 13).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2116F, -8.0856F, 0.4024F, -0.7306F, 1.0556F));

		PartDefinition cube_r166 = neck3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(89, 75).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0116F, -6.0856F, 0.1497F, -0.5623F, 1.0917F));

		PartDefinition cube_r167 = neck3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(89, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0116F, -6.0856F, 0.4008F, -0.4309F, 0.5749F));

		PartDefinition cube_r168 = neck3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(83, 46).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3884F, -4.0856F, 0.1811F, -0.4683F, 1.0629F));

		PartDefinition cube_r169 = neck3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(89, 88).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3884F, -4.0856F, 0.3776F, -0.3355F, 0.5703F));

		PartDefinition cube_r170 = neck3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3884F, -2.3856F, 0.7205F, -0.1228F, 0.4449F));

		PartDefinition cube_r171 = neck3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(85, 69).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3884F, -2.3856F, 0.6159F, -0.4186F, 0.8276F));

		PartDefinition cube_r172 = neck3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 38).addBox(3.2411F, -3.6315F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3884F, -2.3856F, 0.2258F, -0.6994F, 1.5344F));

		PartDefinition cube_r173 = neck3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(90, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1884F, -0.3856F, 0.5877F, -0.082F, 0.2831F));

		PartDefinition cube_r174 = neck3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 36).addBox(3.2411F, -3.6315F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1884F, -0.3856F, 0.1951F, -0.5633F, 1.3771F));

		PartDefinition cube_r175 = neck3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(86, 71).addBox(1.782F, -0.908F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1884F, -0.3856F, 0.5019F, -0.3298F, 0.694F));

		PartDefinition cube_r176 = neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(60, 0).addBox(0.0F, -1.1549F, -0.0933F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -8.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -8.3F, 0.1204F, -0.2685F, -0.0126F));

		PartDefinition cube_r177 = neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -1.4323F, 6.0703F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 48).addBox(-0.5F, -1.6323F, 4.0703F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 75).addBox(-0.5F, -1.6323F, 2.0703F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 71).addBox(-0.5F, -1.1323F, 0.0703F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 46).addBox(-1.0F, -0.1323F, 0.0703F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -5.0F, -6.2F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r178 = neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0116F, -3.2856F, 0.2778F, 0.6312F, -1.2672F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2116F, -4.9856F, 0.2864F, 0.7144F, -1.2364F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(7, 86).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2116F, -6.4856F, 0.2864F, 0.7144F, -1.2364F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(72, 24).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8116F, -1.5856F, 0.3636F, 0.6092F, -1.118F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(7, 86).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.2116F, -6.4856F, 0.2864F, -0.7144F, 1.2364F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(89, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2116F, -4.9856F, 0.2864F, -0.7144F, 1.2364F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(89, 50).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0116F, -3.2856F, 0.2778F, -0.6312F, 1.2672F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(72, 24).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8116F, -1.5856F, 0.3636F, -0.6092F, 1.118F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.5F, -6.0F, -0.3614F, -0.3976F, -0.2565F));

		PartDefinition cube_r186 = neck.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(30, 58).addBox(-0.5F, -3.0F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(77, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -4.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(85, 83).addBox(-1.5F, -2.0F, -1.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -3.5F, -0.07F, 0.0593F, 0.1113F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(32, 92).mirror().addBox(-2.0F, -0.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 92).addBox(0.0F, -0.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -0.3F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(60, 7).addBox(-1.0F, -0.9591F, -1.0496F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -2.3F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(42, 28).addBox(-1.0F, -0.9591F, -0.0496F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -2.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(89, 40).addBox(-1.0F, -1.0455F, -1.0092F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -6.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(72, 38).addBox(-1.0F, -0.5538F, -0.6398F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F))
				.texOffs(72, 65).addBox(-1.0F, -0.9538F, -0.5398F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.4F, -6.4F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 86).addBox(-1.0F, 0.0339F, -4.0241F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(45, 75).addBox(-1.0F, 0.0339F, -1.0241F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 88).addBox(-1.0F, 0.0339F, -2.0241F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.1F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(96, 35).mirror().addBox(-1.52F, -0.9595F, -0.1332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9F, 1.7072F, -8.5552F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(96, 11).mirror().addBox(-2.05F, 0.5F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.0F, -1.3F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(96, 2).mirror().addBox(-1.51F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7928F, -2.1552F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(93, 32).mirror().addBox(-1.44F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(92, 52).mirror().addBox(-1.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 89).mirror().addBox(-1.23F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0928F, -3.5552F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(64, 88).mirror().addBox(0.0F, -0.3168F, -2.1379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, -3.0F, 0.2694F, -0.2359F, -0.0644F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(88, 92).mirror().addBox(0.0658F, -0.0337F, -1.1452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.7126F, -8.7029F, 2.3195F, 0.2213F, 0.141F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(88, 92).addBox(-1.0658F, -0.0337F, -1.1452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.7126F, -8.7029F, 2.3195F, -0.2213F, -0.141F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(76, 26).addBox(-1.5F, -0.0223F, -1.7211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 60).addBox(-1.0F, -0.0223F, -1.0211F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.0F, -9.0F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(8, 51).addBox(-0.5F, -0.0561F, -1.0054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -8.6F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(7, 88).addBox(-0.5F, -0.059F, -1.9903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2F, -7.1F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(24, 96).addBox(-0.5F, 0.9183F, -1.995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 92).addBox(-0.5F, -0.0817F, -0.995F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -6.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(33, 88).addBox(-1.0F, 0.0268F, -0.9375F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(64, 88).addBox(-1.0F, -0.3168F, -2.1379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5F, -3.0F, 0.2694F, 0.2359F, 0.0644F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(86, 20).addBox(-1.0F, -0.0183F, -1.0076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, -1.4F, -3.2F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(96, 2).addBox(0.51F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, -0.7928F, -2.1552F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(29, 96).mirror().addBox(-1.52F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9F, 1.7072F, -8.1552F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(29, 96).addBox(0.52F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9F, 1.7072F, -8.1552F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(96, 35).addBox(0.52F, -0.9595F, -0.1332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9F, 1.7072F, -8.5552F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(92, 52).addBox(0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 32).addBox(0.44F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(95, 89).addBox(0.23F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.2F, -0.0928F, -3.5552F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(96, 11).addBox(1.05F, 0.5F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 77).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -2.0F, -1.3F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(93, 57).addBox(1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0F, -0.3F, 0.5934F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(84, 55).addBox(0.4F, 0.2441F, -2.5085F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(84, 55).mirror().addBox(-1.4F, 0.2441F, -2.5085F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2F, -0.6F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(30, 34).mirror().addBox(-1.0F, -1.4983F, -1.3389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(30, 34).addBox(0.8F, -1.4983F, -1.3389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4F, -0.7559F, -0.7085F, 2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-1.0F, 0.1722F, -0.0132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 0).addBox(0.8F, 0.1722F, -0.0132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.3559F, -3.0085F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(19, 89).mirror().addBox(-1.4F, -0.0414F, -1.0018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(19, 89).addBox(0.4F, -0.0414F, -1.0018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.5559F, -1.4085F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(55, 82).addBox(0.8F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4F, 1.2441F, 0.4915F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(-1.0F, -0.0955F, 2.9474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(84, 15).addBox(0.8F, -0.0955F, 2.9474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(50, 60).addBox(-0.6F, -0.0955F, -0.0526F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.9559F, -5.9085F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(81, 20).mirror().addBox(-0.9F, -0.3955F, -0.6526F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 20).addBox(0.9F, -0.3955F, -0.6526F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9559F, -5.9085F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(64, 83).addBox(-1.0F, -0.01F, -1.102F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0005F))
				.texOffs(82, 88).addBox(-1.0F, -0.41F, -1.102F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4559F, -7.2085F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(84, 31).addBox(-1.0F, -1.0439F, -1.5785F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0559F, -6.2085F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(72, 18).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.2441F, -2.5085F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(23, 29).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 9.6F, -0.3193F, 0.2909F, -0.0945F));

		PartDefinition cube_r223 = tail.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(76, 88).addBox(0.0F, -0.3054F, -0.43F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 13.7F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r224 = tail.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(13, 28).addBox(0.0F, -0.4926F, -0.6491F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 11.6F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r225 = tail.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(19, 43).addBox(0.0F, 1.0356F, 1.2474F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 18).addBox(0.0F, 0.0356F, -0.7526F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 6.9F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r226 = tail.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(40, 88).addBox(0.0F, -0.254F, -0.8875F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 4.5F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r227 = tail.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(79, 88).addBox(0.0F, 0.0088F, -0.2005F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 1.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r228 = tail.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(46, 91).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 68).addBox(0.0F, -4.0F, 12.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 80).addBox(0.0F, -4.0F, 10.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 89).addBox(0.0F, -4.0F, 8.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 90).addBox(0.0F, -3.9F, 6.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 91).addBox(0.0F, -3.8F, 3.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 91).addBox(0.0F, -3.7F, 2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 13.9F, 0.0699F, 0.0435F, 0.003F));

		PartDefinition cube_r229 = tail2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(34, 46).addBox(0.0F, -2.4252F, 3.7944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 47).addBox(0.0F, -2.2252F, 1.7944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 94).addBox(0.0F, -2.1252F, -0.0056F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 9.2F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r230 = tail2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(52, 94).addBox(0.0F, -3.6F, 6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 83).addBox(0.0F, -3.3F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 18).addBox(0.0F, -3.1F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 95).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r231 = tail2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(66, 92).addBox(0.0F, 2.6712F, 9.2886F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 92).addBox(0.0F, 2.3712F, 7.2886F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 92).addBox(0.0F, 0.9712F, 5.2886F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 92).addBox(0.0F, 0.7712F, 3.2886F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 92).addBox(0.0F, 0.1712F, 1.2886F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 92).addBox(0.0F, -0.0288F, -0.7114F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 4.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r232 = tail2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(26, 89).addBox(0.0F, -0.6404F, -0.6575F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 2.3F, 0.3665F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(42, 18).addBox(-0.5F, -0.5005F, -0.0218F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 15.0F, 0.0464F, -0.3487F, -0.0159F));

		PartDefinition cube_r233 = tail3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(50, 60).addBox(0.0F, -3.2F, 11.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 61).addBox(0.0F, -2.9F, 9.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 29).addBox(0.0F, -2.6F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 57).addBox(0.0F, -2.3F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(0.0F, -2.1F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 43).addBox(0.0F, -1.8F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 46).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5005F, -0.0218F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r234 = tail3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(19, 51).addBox(0.0F, 6.8712F, 21.2886F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 29).addBox(0.0F, 6.4712F, 19.2886F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 8).addBox(0.0F, 5.1712F, 17.2886F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 34).addBox(0.0F, 4.8712F, 15.2886F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 34).addBox(0.0F, 4.3712F, 13.2886F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 44).addBox(0.0F, 4.0712F, 11.2886F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4995F, -10.5218F, 0.3316F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 22.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1005F, 13.9782F, -0.0371F, -0.3488F, 0.0127F));

		PartDefinition cube_r235 = tail4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(19, 17).addBox(0.0F, 7.7712F, 25.2886F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, 9.3712F, 31.2886F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(0.0F, 8.8712F, 29.2886F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 48).addBox(0.0F, 8.2712F, 27.2886F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).addBox(0.0F, 7.3712F, 23.2886F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -24.5F, 0.3316F, 0.0F, 0.0F));

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