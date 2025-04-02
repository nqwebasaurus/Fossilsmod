package fossils.fossils.client.blockentity.model.eremotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EremotheriumFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public EremotheriumFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm3.getChild("leftArm5");
		this.leftArm6 = this.leftArm3.getChild("leftArm6");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm3.getChild("rightArm5");
		this.rightArm6 = this.rightArm3.getChild("rightArm6");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -29.0F, 15.0F, -0.4778F, -0.008F, 0.0302F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(99, 89).mirror().addBox(-0.5227F, -3.8689F, -2.7009F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-8.2867F, -5.2634F, -4.6348F, 0.9601F, 1.0228F, -1.2097F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.1294F, -1.2954F, -1.7092F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4346F, -0.2156F, -2.0553F, -0.6734F, 0.0603F, 0.6418F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 22).mirror().addBox(-0.5227F, -3.6236F, -1.9684F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-8.2867F, -5.2634F, -4.6348F, 0.1224F, 1.0228F, -1.2097F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 55).mirror().addBox(-0.5227F, -3.3484F, -1.7393F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.2867F, -5.2634F, -4.6348F, -0.6456F, 1.0228F, -1.2097F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(97, 44).mirror().addBox(-0.5F, -3.8F, -1.5F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6903F, -5.2471F, -3.4329F, -1.112F, 0.8888F, -0.8896F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-0.5F, -3.6733F, -1.9307F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0186F, -4.2459F, -2.5322F, -0.9171F, 0.4166F, -0.2504F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5F, -3.2681F, -1.592F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.0186F, -4.2459F, -2.5322F, -1.3883F, 0.4166F, -0.2504F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(75, 93).mirror().addBox(-0.823F, -5.0189F, -6.935F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 22).mirror().addBox(1.177F, -5.0189F, -6.935F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.677F, 5.9211F, -0.6342F, -0.7524F, -0.0638F, 0.0596F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 22).mirror().addBox(-1.496F, 3.5485F, 5.8069F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.277F, 8.3211F, 4.5658F, -0.8977F, 0.0779F, -0.4002F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 115).mirror().addBox(-1.496F, 6.3518F, -2.8038F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.277F, 8.3211F, 4.5658F, -0.0425F, 0.0779F, -0.4002F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(124, 99).mirror().addBox(-0.696F, 0.2082F, -3.6916F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.277F, 8.3211F, 4.5658F, 0.109F, 0.1249F, -0.1582F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(81, 119).mirror().addBox(-1.496F, 1.9203F, -3.7612F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.277F, 8.3211F, 4.5658F, 0.132F, 0.0779F, -0.4002F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 107).mirror().addBox(-1.496F, 2.0147F, -1.9405F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.277F, 8.3211F, 4.5658F, 0.0273F, 0.0779F, -0.4002F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-1.496F, 2.6138F, 0.1811F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.277F, 8.3211F, 4.5658F, -0.2694F, 0.0779F, -0.4002F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(-0.696F, -1.1483F, 0.3577F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.277F, 8.3211F, 4.5658F, -0.2925F, 0.1249F, -0.1582F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(49, 37).mirror().addBox(-0.696F, -1.2697F, -0.2727F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.277F, 8.3211F, 4.5658F, 0.6326F, 0.1249F, -0.1582F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(1.3736F, -2.6446F, -2.3415F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.177F, 4.3211F, -0.4342F, 0.6788F, 0.0212F, -0.1733F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(58, 98).mirror().addBox(-0.0814F, -4.0212F, -4.0641F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.277F, 8.5211F, 9.1658F, -0.2253F, 0.3786F, 0.4695F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(34, 37).mirror().addBox(0.3145F, -6.9102F, -3.7371F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.658F, 5.0162F, 9.8797F, 0.9207F, 0.5344F, 0.2594F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(13, 74).mirror().addBox(-1.1F, -1.0F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7747F, -0.3645F, 1.922F, -0.5549F, 0.3494F, 0.3027F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(13, 74).addBox(0.1F, -1.0F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7747F, -0.3645F, 1.922F, -0.5549F, -0.3494F, -0.3027F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -3.2681F, -1.592F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.0186F, -4.2459F, -2.5322F, -1.3883F, -0.4166F, 0.2504F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -3.6733F, -1.9307F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0186F, -4.2459F, -2.5322F, -0.9171F, -0.4166F, 0.2504F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(97, 44).addBox(-0.5F, -3.8F, -1.5F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6903F, -5.2471F, -3.4329F, -1.112F, -0.8888F, 0.8896F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(39, 55).addBox(-0.4773F, -3.3484F, -1.7393F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2867F, -5.2634F, -4.6348F, -0.6456F, -1.0228F, 1.2097F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(31, 22).addBox(-0.4773F, -3.6236F, -1.9684F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(8.2867F, -5.2634F, -4.6348F, 0.1224F, -1.0228F, 1.2097F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(99, 89).addBox(-0.4773F, -3.8689F, -2.7009F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(8.2867F, -5.2634F, -4.6348F, 0.9601F, -1.0228F, 1.2097F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(29, 22).addBox(-4.177F, -5.0189F, -6.935F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(75, 93).addBox(-1.177F, -5.0189F, -6.935F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.677F, 5.9211F, -0.6342F, -0.7524F, 0.0638F, -0.0596F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(78, 0).addBox(-4.8706F, -1.2954F, -1.7092F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4346F, -0.2156F, -2.0553F, -0.6734F, -0.0603F, -0.6418F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-2.3736F, -2.6446F, -2.3415F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.177F, 4.3211F, -0.4342F, 0.6788F, -0.0212F, 0.1733F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(49, 37).addBox(-0.304F, -1.2697F, -0.2727F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.277F, 8.3211F, 4.5658F, 0.6326F, -0.1249F, 0.1582F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(34, 37).addBox(-1.3145F, -6.9102F, -3.7371F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.658F, 5.0162F, 9.8797F, 0.9207F, -0.5344F, -0.2594F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(58, 98).addBox(-0.9186F, -4.0212F, -4.0641F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.277F, 8.5211F, 9.1658F, -0.2253F, -0.3786F, -0.4695F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(20, 98).addBox(-0.304F, -1.1483F, 0.3577F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.277F, 8.3211F, 4.5658F, -0.2925F, -0.1249F, 0.1582F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 93).addBox(0.496F, 2.6138F, 0.1811F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.277F, 8.3211F, 4.5658F, -0.2694F, -0.0779F, 0.4002F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(16, 22).addBox(0.496F, 3.5485F, 5.8069F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.277F, 8.3211F, 4.5658F, -0.8977F, -0.0779F, 0.4002F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(34, 115).addBox(0.496F, 6.3518F, -2.8038F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.277F, 8.3211F, 4.5658F, -0.0425F, -0.0779F, 0.4002F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 107).addBox(0.496F, 2.0147F, -1.9405F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.277F, 8.3211F, 4.5658F, 0.0273F, -0.0779F, 0.4002F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(124, 99).addBox(-0.304F, 0.2082F, -3.6916F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.277F, 8.3211F, 4.5658F, 0.109F, -0.1249F, 0.1582F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(81, 119).addBox(0.496F, 1.9203F, -3.7612F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.277F, 8.3211F, 4.5658F, 0.132F, -0.0779F, 0.4002F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(74, 109).addBox(-0.5F, -3.4153F, 11.283F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(-0.5F, -3.5153F, -2.717F, 1.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0477F, -0.9844F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.2057F, 0.0747F, 2.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, 1.0F, -1.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(28, 90).addBox(0.0F, 1.0F, -0.8F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(65, 64).addBox(-4.0F, -3.0F, -1.5F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 6.5F, -1.4F, -0.6429F, -0.1726F, -0.1341F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(119, 35).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 12.7549F, 0.1985F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(19, 66).addBox(-3.0F, -0.8F, -1.6F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.9929F, 0.3447F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(106, 42).addBox(-2.6544F, -3.5786F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9F, 1.1F, 0.7F, 0.0F, 0.0F, 0.4189F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -1.7F, 1.7F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 86).addBox(-2.0F, -1.7F, -1.3F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(46, 120).addBox(2.0F, -1.7F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 86).addBox(-2.3F, -1.7F, 9.7F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.1F, 3.0F, -0.4162F, 0.0425F, 0.1238F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(37, 77).addBox(-0.0309F, -1.7F, -0.0294F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.6F, 5.6F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r47 = leftLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(88, 54).addBox(-1.0F, -1.7F, 0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.6F, 0.6F, 0.0F, -0.1047F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(57, 0).addBox(-1.5F, -0.6F, 4.1F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(117, 87).addBox(1.4F, -0.5F, -2.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 68).addBox(-0.6F, -0.5F, -0.8F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -3.2F, 12.4F, -1.7396F, -1.0849F, 0.1496F));

		PartDefinition cube_r48 = leftLeg3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(80, 48).addBox(-1.0F, -1.2F, -0.1F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6F, 9.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 1.0F, -1.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(53, 88).addBox(-2.0F, 1.0F, -0.8F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(63, 36).addBox(-1.0F, -3.0F, -1.5F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 6.5F, -1.4F, -0.3374F, 0.1726F, 0.1341F));

		PartDefinition cube_r49 = rightLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(119, 30).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 12.7549F, 0.1985F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 66).addBox(-2.0F, -0.8F, -1.6F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.9929F, 0.3447F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(85, 103).addBox(-0.3456F, -3.5786F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.9F, 1.1F, 0.7F, 0.0F, 0.0F, -0.4189F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(16, 22).addBox(-1.0F, -1.7F, 1.7F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(84, 71).addBox(-2.0F, -1.7F, -1.3F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(119, 6).addBox(-3.0F, -1.7F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 64).addBox(-1.7F, -1.7F, 9.7F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 13.1F, 3.0F, -0.329F, -0.0425F, -0.1238F));

		PartDefinition cube_r52 = rightLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(76, 39).addBox(-0.9691F, -1.7F, -0.0294F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.6F, 5.6F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r53 = rightLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(15, 85).addBox(0.0F, -1.7F, 0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.6F, 0.6F, 0.0F, 0.1047F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(48, 25).addBox(-3.5F, -0.6F, 4.1F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(117, 12).addBox(-3.4F, -0.5F, -2.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(66, 49).addBox(-3.4F, -0.5F, -0.8F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -3.2F, 12.4F, -2.8433F, 1.1735F, -1.3269F));

		PartDefinition cube_r54 = rightLeg3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(78, 33).addBox(-4.0F, -1.2F, -0.1F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, 9.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.25F, -6.6F, -0.218F, -0.0094F, -0.0426F));

		PartDefinition cube_r55 = body4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -6.37F, 4.0731F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(108, 109).addBox(-1.0F, -5.77F, 0.0731F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7243F, -5.3348F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(71, 16).addBox(-1.0F, -0.07F, 0.0731F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.7243F, -5.3348F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(62, 88).mirror().addBox(0.0F, -2.3F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3762F, -2.3285F, -0.2967F, 0.1262F, 0.2573F, 2.1112F));

		PartDefinition cube_r58 = body4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -2.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0979F, -2.7186F, -4.3682F, 0.0787F, 0.2752F, 1.9312F));

		PartDefinition cube_r59 = body4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(62, 88).addBox(0.0F, -2.3F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3762F, -2.3285F, -0.2967F, 0.1262F, -0.2573F, -2.1112F));

		PartDefinition cube_r60 = body4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -2.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0979F, -2.7186F, -4.3682F, 0.0787F, -0.2752F, -1.9312F));

		PartDefinition cube_r61 = body4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(35, 123).mirror().addBox(-0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -3.83F, -6.4721F, 0.0028F, -0.1504F, 1.6577F));

		PartDefinition cube_r62 = body4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(35, 123).addBox(0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -3.83F, -6.4721F, 0.0028F, 0.1504F, -1.6577F));

		PartDefinition cube_r63 = body4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(45, 110).addBox(-1.5F, -1.3061F, 4.0442F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7243F, -12.1348F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -2.43F, -5.2721F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(9, 0).mirror().addBox(0.0026F, -0.7886F, -3.9791F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.5441F, 8.2981F, -2.9758F, 0.2149F, -0.0499F, 0.2382F));

		PartDefinition cube_r65 = body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(113, 45).mirror().addBox(0.0024F, -0.7741F, -3.8801F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0562F, 6.9801F, 0.6356F, 0.337F, 0.0342F, 0.2609F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(120, 62).mirror().addBox(-6.8569F, 5.774F, -1.572F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -1.4F, -1.2F, 0.1448F, 0.0013F, 0.2493F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -1.4F, -1.2F, 0.1286F, -0.0667F, 0.7336F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(86, 110).mirror().addBox(-6.8569F, 5.774F, -1.572F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -2.0F, -5.2F, 0.1448F, 0.0013F, 0.2493F));

		PartDefinition cube_r69 = body3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(53, 117).mirror().addBox(-3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -2.0F, -5.2F, 0.1286F, -0.0667F, 0.7336F));

		PartDefinition cube_r70 = body3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(123, 68).mirror().addBox(-0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -2.0F, -5.2F, 0.0028F, -0.1504F, 1.6577F));

		PartDefinition cube_r71 = body3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(9, 0).addBox(-0.0026F, -0.7886F, -3.9791F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.6975F, 8.2981F, -2.9758F, 0.2149F, 0.0499F, -0.2382F));

		PartDefinition cube_r72 = body3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(86, 110).addBox(6.8569F, 5.774F, -1.572F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.2F, 0.1448F, -0.0013F, -0.2493F));

		PartDefinition cube_r73 = body3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(110, 33).addBox(-1.5F, -1.3061F, 0.1442F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 26).addBox(-1.0F, 0.0939F, -0.0558F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(113, 45).addBox(-0.0024F, -0.7741F, -3.8801F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.2095F, 6.9801F, 0.6356F, 0.337F, -0.0342F, -0.2609F));

		PartDefinition cube_r75 = body3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(120, 62).addBox(6.8569F, 5.774F, -1.572F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -1.2F, 0.1448F, -0.0013F, -0.2493F));

		PartDefinition cube_r76 = body3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 117).addBox(3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -1.2F, 0.1286F, 0.0667F, -0.7336F));

		PartDefinition cube_r77 = body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(53, 117).addBox(3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.2F, 0.1286F, 0.0667F, -0.7336F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(123, 68).addBox(0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.2F, 0.0028F, 0.1504F, -1.6577F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(10, 110).addBox(-1.0F, -6.1061F, 3.9442F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 113).addBox(-1.0F, -4.9061F, -0.0558F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -1.2943F, -6.8627F, -0.3142F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.6443F, -6.8627F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(28, 53).addBox(-1.0F, -4.2014F, -0.1322F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -3.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -3.6874F, -0.0422F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -8.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(15, 6).mirror().addBox(0.033F, 0.0519F, -1.082F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.1734F, 10.9041F, -2.4069F, -0.9356F, -0.1317F, 0.1747F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(75, 73).mirror().addBox(0.0021F, 0.0571F, -0.831F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.9075F, 9.531F, 0.6943F, -1.0772F, -0.0971F, 0.2072F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(5, 108).mirror().addBox(-6.8569F, 5.774F, -1.572F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.6557F, -2.5373F, 0.2294F, -0.0202F, 0.2485F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(117, 69).mirror().addBox(-3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.6557F, -2.5373F, 0.1939F, -0.1249F, 0.7274F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(123, 119).mirror().addBox(-0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.6557F, -2.5373F, -0.005F, -0.2373F, 1.6592F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(103, 107).mirror().addBox(-6.8569F, 5.774F, -1.572F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.9557F, -6.7373F, 0.2802F, -0.0331F, 0.2472F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(71, 117).mirror().addBox(-3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.9557F, -6.7373F, 0.2335F, -0.1596F, 0.7218F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(124, 0).mirror().addBox(-0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.9557F, -6.7373F, -0.0098F, -0.2895F, 1.6605F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(123, 119).addBox(0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.6557F, -2.5373F, -0.005F, 0.2373F, -1.6592F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(117, 69).addBox(3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.6557F, -2.5373F, 0.1939F, 0.1249F, -0.7274F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(75, 73).addBox(-0.0021F, 0.0571F, -0.831F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.9075F, 9.531F, 0.6943F, -1.0772F, 0.0971F, -0.2072F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(5, 108).addBox(6.8569F, 5.774F, -1.572F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.6557F, -2.5373F, 0.2294F, 0.0202F, -0.2485F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(124, 0).addBox(0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.9557F, -6.7373F, -0.0098F, 0.2895F, -1.6605F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(71, 117).addBox(3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.9557F, -6.7373F, 0.2335F, 0.1596F, -0.7218F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(15, 6).addBox(-0.033F, 0.0519F, -1.082F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.1734F, 10.9041F, -2.4069F, -0.9356F, 0.1317F, -0.1747F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(103, 107).addBox(6.8569F, 5.774F, -1.572F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.9557F, -6.7373F, 0.2802F, 0.0331F, -0.2472F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(110, 92).addBox(-1.5F, -2.4F, -7.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(110, 60).addBox(-1.5F, -2.4F, -3.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 37).addBox(-1.0F, -1.0F, -8.9F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -9.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(118, 42).addBox(-1.0F, -3.4765F, 0.1189F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -2.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(106, 118).addBox(-1.0F, -3.3636F, 0.1067F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0F, -6.6F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(69, 98).mirror().addBox(-1.0058F, 0.1262F, -0.1073F, 0.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.7233F, 15.3443F, -2.6373F, -0.5338F, 0.2334F, -1.3769F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-0.0335F, -0.923F, -0.1085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.7062F, 13.0884F, 1.8931F, -0.8009F, -0.3359F, -0.0913F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(29, 105).mirror().addBox(-6.8569F, 5.774F, -1.572F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.7557F, -1.1373F, 0.2461F, -0.0254F, 0.1958F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(117, 78).mirror().addBox(-3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.7557F, -1.1373F, 0.2065F, -0.1372F, 0.6734F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(122, 80).mirror().addBox(-0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.7557F, -1.1373F, -0.0075F, -0.2547F, 1.6075F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(35, 101).mirror().addBox(-6.8569F, 5.774F, -1.572F, 0.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.8443F, -5.1373F, 0.264F, -0.0246F, 0.1256F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(25, 116).mirror().addBox(-3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.8443F, -5.1373F, 0.2229F, -0.1447F, 0.6013F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(20, 122).mirror().addBox(-0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.8443F, -5.1373F, -0.0038F, -0.2722F, 1.5367F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(69, 98).addBox(1.0058F, 0.1262F, -0.1073F, 0.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.7233F, 15.3443F, -2.6373F, -0.5338F, -0.2334F, 1.3769F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(35, 101).addBox(6.8569F, 5.774F, -1.572F, 0.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.8443F, -5.1373F, 0.264F, 0.0246F, -0.1256F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(25, 116).addBox(3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.8443F, -5.1373F, 0.2229F, 0.1447F, -0.6013F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(20, 122).addBox(0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.8443F, -5.1373F, -0.0038F, 0.2722F, -1.5367F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(122, 80).addBox(0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.7557F, -1.1373F, -0.0075F, 0.2547F, -1.6075F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(117, 78).addBox(3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.7557F, -1.1373F, 0.2065F, 0.1372F, -0.6734F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(49, 0).addBox(0.0335F, -0.923F, -0.1085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.7062F, 13.0884F, 1.8931F, -0.8009F, 0.3359F, 0.0913F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(29, 105).addBox(6.8569F, 5.774F, -1.572F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.7557F, -1.1373F, 0.2461F, 0.0254F, -0.1958F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(108, 96).addBox(-1.5F, -1.0401F, -7.1382F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 65).addBox(-1.5F, -1.0401F, -2.6382F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 13).addBox(-1.0F, -0.0401F, -9.1382F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8F, -6.1F, 0.0038F, -0.0435F, -0.0002F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(118, 114).addBox(-1.0F, -3.8653F, 0.013F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9F, -3.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(5, 119).addBox(-1.0F, -4.1644F, 0.1206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.7F, -7.6F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(58, 119).addBox(-1.0F, -4.0065F, 0.1222F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0F, -11.4F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(24, 15).mirror().addBox(-3.0F, -1.0F, -1.3F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1168F, 9.5761F, -13.4675F, 1.0111F, -0.1106F, 0.5186F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-1.5F, -0.7511F, -2.1107F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 74).mirror().addBox(-0.5F, -0.7511F, -2.1107F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2565F, 6.872F, -12.1906F, 0.7725F, -0.2457F, 0.2905F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-1.5F, -1.3466F, -2.3056F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 76).mirror().addBox(-0.5F, -1.3466F, -2.3056F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.2565F, 6.872F, -12.1906F, 1.0518F, -0.2457F, 0.2905F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-0.6562F, -1.2036F, -0.3754F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.7645F, 8.1731F, -13.2949F, 0.8276F, -0.4041F, 0.1189F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(0.9612F, -0.0603F, 1.2067F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 55).mirror().addBox(-0.0388F, -0.5603F, 0.0067F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.9081F, 4.1736F, -11.1003F, 0.4995F, -0.0167F, 0.508F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(45, 103).mirror().addBox(-0.7514F, 0.3395F, 0.3329F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 0.6248F, -0.1469F, 0.3184F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(124, 90).mirror().addBox(-0.7514F, 3.3804F, 5.4418F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 0.8517F, -0.1469F, 0.3184F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(106, 78).mirror().addBox(-0.7514F, -1.8453F, 3.7147F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 0.0838F, -0.1469F, 0.3184F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(92, 106).mirror().addBox(-0.7514F, 5.0938F, 3.1827F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 1.288F, -0.1469F, 0.3184F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(114, 52).mirror().addBox(-0.7514F, 6.9535F, 1.6288F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 1.6022F, -0.1469F, 0.3184F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(106, 85).mirror().addBox(-0.6216F, -1.4633F, -1.9277F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 1.5143F, -0.2457F, 0.3953F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(111, 14).mirror().addBox(-0.6216F, -3.2805F, -0.1731F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 1.523F, -0.2457F, 0.3953F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(90, 2).mirror().addBox(-0.6216F, 0.1798F, -0.7161F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 2.4219F, -0.2457F, 0.3953F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(92, 27).mirror().addBox(-0.6216F, 0.2538F, 0.121F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 1.6016F, -0.2457F, 0.3953F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(100, 23).mirror().addBox(-0.7514F, 3.5601F, 1.8327F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 1.5149F, -0.1469F, 0.3184F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(74, 101).mirror().addBox(-0.6216F, 1.6903F, 0.9893F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 1.6888F, -0.2457F, 0.3953F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(62, 90).mirror().addBox(-0.6216F, -0.1881F, -0.216F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 1.9157F, -0.2457F, 0.3953F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(75, 73).mirror().addBox(-0.6216F, 0.2232F, -2.0129F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 5.1898F, -9.3152F, 1.1042F, -0.2457F, 0.3953F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(106, 85).addBox(-0.3784F, -1.4633F, -1.9277F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 1.5143F, 0.2457F, -0.3953F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(15, 66).addBox(-0.5F, -0.7511F, -2.1107F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 74).addBox(-0.5F, -0.7511F, -2.1107F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2565F, 6.872F, -12.1906F, 0.7725F, 0.2457F, -0.2905F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(24, 15).addBox(-3.0F, -1.0F, -1.3F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1168F, 9.5761F, -13.4675F, 1.0111F, 0.1106F, -0.5186F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(64, 60).addBox(-0.5F, -1.3466F, -2.3056F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 76).addBox(-0.5F, -1.3466F, -2.3056F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.2565F, 6.872F, -12.1906F, 1.0518F, 0.2457F, -0.2905F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(62, 16).addBox(-2.9612F, -0.0603F, 1.2067F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(27, 55).addBox(-0.9612F, -0.5603F, 0.0067F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9081F, 4.1736F, -11.1003F, 0.4995F, 0.0167F, -0.508F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(45, 96).addBox(-0.3438F, -1.2036F, -0.3754F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7645F, 8.1731F, -13.2949F, 0.8276F, 0.4041F, -0.1189F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(111, 14).addBox(-0.3784F, -3.2805F, -0.1731F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 1.523F, 0.2457F, -0.3953F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(75, 73).addBox(-0.3784F, 0.2232F, -2.0129F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 1.1042F, 0.2457F, -0.3953F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(100, 23).addBox(-0.2486F, 3.5601F, 1.8327F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 1.5149F, 0.1469F, -0.3184F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(90, 2).addBox(-0.3784F, 0.1798F, -0.7161F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 2.4219F, 0.2457F, -0.3953F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(62, 90).addBox(-0.3784F, -0.1881F, -0.216F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 1.9157F, 0.2457F, -0.3953F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(92, 27).addBox(-0.3784F, 0.2538F, 0.121F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 1.6016F, 0.2457F, -0.3953F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(74, 101).addBox(-0.3784F, 1.6903F, 0.9893F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 1.6888F, 0.2457F, -0.3953F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(92, 106).addBox(-0.2486F, 5.0938F, 3.1827F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 1.288F, 0.1469F, -0.3184F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(114, 52).addBox(-0.2486F, 6.9535F, 1.6288F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 1.6022F, 0.1469F, -0.3184F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(124, 90).addBox(-0.2486F, 3.3804F, 5.4418F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 0.8517F, 0.1469F, -0.3184F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(106, 78).addBox(-0.2486F, -1.8453F, 3.7147F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 0.0838F, 0.1469F, -0.3184F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(41, 118).mirror().addBox(0.1751F, 0.048F, -0.5659F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9691F, 13.2768F, -8.106F, 0.4247F, 0.2499F, -1.2199F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(81, 109).mirror().addBox(0.163F, 0.0226F, -0.0356F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9233F, 13.8443F, -4.3373F, 0.0203F, 0.2356F, -1.248F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(56, 107).mirror().addBox(-0.032F, 0.0907F, -0.1499F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.6368F, 14.0666F, 0.3469F, -0.3077F, 0.255F, -1.4241F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(118, 121).mirror().addBox(-0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.6557F, -2.3373F, -0.0007F, -0.3062F, 1.3612F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(113, 116).mirror().addBox(-3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.6557F, -2.3373F, 0.2525F, -0.1625F, 0.4221F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(61, 107).mirror().addBox(-0.0694F, -0.0442F, -0.7973F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4368F, 5.4666F, -1.5531F, 0.2893F, -0.0777F, 0.1173F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(66, 110).mirror().addBox(-6.8569F, 5.774F, -1.572F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.6443F, -6.3373F, 0.2971F, -0.0373F, -0.085F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(115, 107).mirror().addBox(-3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.6443F, -6.3373F, 0.2468F, -0.1711F, 0.388F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(88, 120).mirror().addBox(-0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.6443F, -6.3373F, -0.0115F, -0.3069F, 1.3293F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(65, 120).mirror().addBox(-0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 2.1443F, -9.9373F, -0.0148F, -0.3416F, 1.1559F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(17, 115).mirror().addBox(-3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 2.1443F, -9.9373F, 0.2736F, -0.1941F, 0.2086F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(101, 121).mirror().addBox(0.0054F, 0.0464F, -1.8752F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2691F, 9.0768F, -8.106F, 0.3204F, -0.0962F, -0.1118F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(65, 120).addBox(0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 2.1443F, -9.9373F, -0.0148F, 0.3416F, -1.1559F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(17, 115).addBox(3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 2.1443F, -9.9373F, 0.2736F, 0.1941F, -0.2086F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(41, 118).addBox(-0.1751F, 0.048F, -0.5659F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9691F, 13.2768F, -8.106F, 0.4247F, -0.2499F, 1.2199F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(101, 121).addBox(-0.0054F, 0.0464F, -1.8752F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2691F, 9.0768F, -8.106F, 0.3204F, 0.0962F, 0.1118F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(88, 120).addBox(0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.6443F, -6.3373F, -0.0115F, 0.3069F, -1.3293F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(81, 109).addBox(-0.163F, 0.0226F, -0.0356F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9233F, 13.8443F, -4.3373F, 0.0203F, -0.2356F, 1.248F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(66, 110).addBox(6.8569F, 5.774F, -1.572F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.6443F, -6.3373F, 0.2971F, 0.0373F, 0.085F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(115, 107).addBox(3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.6443F, -6.3373F, 0.2468F, 0.1711F, -0.388F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(113, 116).addBox(3.3176F, 2.3486F, -1.5693F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.6557F, -2.3373F, 0.2525F, 0.1625F, -0.4221F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(118, 121).addBox(0.1035F, 0.0751F, -1.5198F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.6557F, -2.3373F, -0.0007F, 0.3062F, -1.3612F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(56, 107).addBox(0.032F, 0.0907F, -0.1499F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.6368F, 14.0666F, 0.3469F, -0.3077F, -0.255F, 1.4241F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(61, 107).addBox(0.0694F, -0.0442F, -0.7973F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4368F, 5.4666F, -1.5531F, 0.2893F, 0.0777F, -0.1173F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(45, 103).addBox(-0.2486F, 0.3395F, 0.3329F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.3F, 5.1898F, -9.3152F, 0.6248F, 0.1469F, -0.3184F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(96, 62).addBox(-2.0F, 2.8F, -5.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(-1.0F, 2.8F, -2.4F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.3773F, -8.2914F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(78, 7).addBox(-1.5F, -2.0F, -2.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(12, 56).addBox(-1.5F, -2.3F, -6.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(107, 23).addBox(-1.5F, -2.2F, -10.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(17, 37).addBox(-1.0F, -0.9F, -13.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(53, 49).addBox(-1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(96, 75).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8906F, 7.8609F, -9.1092F, -0.8875F, 0.5391F, -0.5596F));

		PartDefinition cube_r183 = leftArm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(86, 78).addBox(-0.5F, -0.3F, -5.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 7.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r184 = leftArm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(62, 8).addBox(-2.3F, -1.7F, -2.3F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 12.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(66, 73).addBox(-1.0F, 2.5035F, -0.1472F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 25).addBox(-2.5F, -0.4965F, -0.1472F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 14.4F, 0.7316F, -0.0278F, -0.4777F));

		PartDefinition cube_r185 = leftArm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(76, 119).addBox(-0.8376F, 4.5711F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 114).addBox(-0.8376F, 11.5711F, -0.2F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 103).addBox(0.1624F, -0.4289F, -0.2F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9035F, -1.4472F, 0.0006F, -0.2618F, 0.0826F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(88, 19).addBox(-1.6F, 0.0F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 16.9035F, -0.8472F, 0.0F, 0.0F, 0.1745F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.2164F, 0.0283F, 0.1278F));

		PartDefinition cube_r186 = leftArm4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(41, 37).addBox(-0.2F, 0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5794F, 5.6971F, 0.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition cube_r187 = leftArm4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(97, 10).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 1.9F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r188 = leftArm5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(52, 103).addBox(-0.9F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7606F, 6.3733F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r189 = leftArm5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(9, 101).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 3.7F, 0.2314F, -0.084F, 0.6939F));

		PartDefinition cube_r190 = leftArm6.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(125, 16).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(15, 52).addBox(-1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(43, 15).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8906F, 7.8609F, -9.1092F, -0.9059F, -0.4241F, 0.4113F));

		PartDefinition cube_r191 = rightArm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(23, 83).addBox(-1.5F, -0.3F, -5.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, 7.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r192 = rightArm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(48, 60).addBox(-2.7F, -1.7F, -2.3F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 12.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(57, 71).addBox(-1.0F, 2.5035F, -0.1472F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 57).addBox(-2.5F, -0.4965F, -0.1472F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 14.4F, 0.3639F, 0.1237F, 0.2333F));

		PartDefinition cube_r193 = rightArm2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(12, 119).addBox(-0.1624F, 4.5711F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 0).addBox(-2.1624F, 11.5711F, -0.2F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 101).addBox(-1.1624F, -0.4289F, -0.2F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.9035F, -1.4472F, 0.0006F, 0.2618F, -0.0826F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(86, 85).addBox(-0.4F, 0.0F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 16.9035F, -0.8472F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.211F, -0.056F, -0.2559F));

		PartDefinition cube_r194 = rightArm4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(14, 0).addBox(-0.8F, 0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5794F, 5.6971F, 0.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition cube_r195 = rightArm4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(88, 93).addBox(0.0F, 0.0F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 1.9F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r196 = rightArm5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(81, 101).addBox(-0.1F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7606F, 6.3733F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r197 = rightArm5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(99, 98).addBox(0.0F, 0.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 3.7F, 0.2314F, 0.084F, -0.6939F));

		PartDefinition cube_r198 = rightArm6.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(124, 24).addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9F, -13.6F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r199 = neck3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(119, 94).addBox(-0.5F, -3.6722F, 0.0299F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.1F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r200 = neck3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -1.9974F, 0.0384F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -2.9F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r201 = neck3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(98, 113).mirror().addBox(0.0456F, -0.0905F, -0.1662F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0233F, 4.3443F, 2.7627F, 0.4791F, 0.2483F, -0.8485F));

		PartDefinition cube_r202 = neck3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(93, 121).mirror().addBox(-3.2212F, 2.4812F, -1.0969F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.9557F, -0.2373F, 0.5724F, 0.0796F, 0.1951F));

		PartDefinition cube_r203 = neck3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(30, 121).mirror().addBox(0.064F, 0.0682F, -1.0487F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.9557F, -0.2373F, 0.4149F, -0.399F, 1.0021F));

		PartDefinition cube_r204 = neck3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(98, 113).addBox(-0.0456F, -0.0905F, -0.1662F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0233F, 4.3443F, 2.7627F, 0.4791F, -0.2483F, 0.8485F));

		PartDefinition cube_r205 = neck3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(93, 121).addBox(3.2212F, 2.4812F, -1.0969F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.9557F, -0.2373F, 0.5724F, -0.0796F, -0.1951F));

		PartDefinition cube_r206 = neck3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(30, 121).addBox(-0.064F, 0.0682F, -1.0487F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.9557F, -0.2373F, 0.4149F, 0.399F, -1.0021F));

		PartDefinition cube_r207 = neck3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(82, 11).addBox(-1.0F, -0.1F, -0.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.6F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.9F, 0.2831F, -0.165F, -0.1164F));

		PartDefinition cube_r208 = neck2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(34, 37).addBox(0.0F, -1.0F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2912F, -0.5503F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(54, 14).addBox(0.0F, -1.5861F, 0.0638F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(96, 67).addBox(-1.0F, -1.0F, -3.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -3.1F, 0.0435F, 0.0038F, -0.0872F));

		PartDefinition cube_r211 = neck.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(15, 43).addBox(-1.5F, -0.8F, -0.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5938F, -2.7749F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r212 = neck.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(104, 16).addBox(-0.5F, -0.2134F, -0.6912F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.8F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r213 = neck.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(97, 82).addBox(-1.0F, -0.2258F, 0.1409F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.8F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, -2.3F, -0.3042F, 0.0741F, -0.1684F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(125, 114).mirror().addBox(-2.0F, -1.013F, 0.0267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 11.2F, -4.5F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(125, 114).addBox(1.0F, -1.013F, 0.0267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 11.2F, -4.5F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(101, 55).addBox(-1.0F, -0.4251F, 0.1044F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.6F, -4.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(98, 0).addBox(-1.5F, -0.0357F, -0.0097F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.6F, -4.6F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(8, 74).addBox(-0.5F, 0.0731F, -0.0627F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -4.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(85, 39).addBox(-1.5F, -1.0F, -1.4F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(99, 35).addBox(-1.0F, -1.0F, -1.2F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.5F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(11, 93).addBox(-2.0F, 0.0039F, -2.9788F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.4747F, -0.2337F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(116, 20).addBox(-2.0F, -0.3989F, -0.91F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(38, 70).addBox(-1.0F, 2.6011F, -0.91F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.7991F, -1.7314F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(22, 74).addBox(-2.0F, -1.0F, -0.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 82).addBox(-2.0F, -6.1F, -0.8F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.9991F, -1.5314F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(48, 25).mirror().addBox(-1.5F, -2.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.4371F, 0.2045F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(54, 49).mirror().addBox(-0.6F, -1.4321F, 3.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.318F, 0.0483F, -0.159F, 0.0866F, -0.1226F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.6F, -3.2992F, 0.5479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.318F, 0.0483F, -1.6425F, 0.0866F, -0.1226F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(37, 76).mirror().addBox(-0.6F, -1.986F, -0.7103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.318F, 0.0483F, -2.3756F, 0.0866F, -0.1226F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.6F, -2.2605F, 2.6086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.318F, 0.0483F, -0.5953F, 0.0866F, -0.1226F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(54, 49).addBox(-0.4F, -1.4321F, 3.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 1.318F, 0.0483F, -0.159F, -0.0866F, 0.1226F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(49, 49).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2571F, 1.868F, 3.2388F, -0.5953F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(73, 0).addBox(-0.4F, -2.2605F, 2.6086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0F, 1.318F, 0.0483F, -0.5953F, -0.0866F, 0.1226F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 74).addBox(-0.4F, -3.2992F, 0.5479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 1.318F, 0.0483F, -1.6425F, -0.0866F, 0.1226F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(37, 76).addBox(-0.4F, -1.986F, -0.7103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0F, 1.318F, 0.0483F, -2.3756F, -0.0866F, 0.1226F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(48, 25).addBox(0.5F, -2.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 1.4371F, 0.2045F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(37, 93).addBox(-2.0F, -0.0201F, -3.0306F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.5253F, -0.3337F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(108, 9).addBox(-2.0F, -1.0F, -2.4F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 7.3281F, 0.4418F));

		PartDefinition cube_r236 = leftSygomaticarch.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(107, 27).addBox(-0.5418F, -0.4169F, -3.9129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.405F, 0.2602F, 0.2673F));

		PartDefinition cube_r237 = leftSygomaticarch.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 16).addBox(-0.9707F, 0.7269F, 1.2998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4521F, -0.0317F, -0.1363F, 0.9136F, -0.0007F, 0.1481F));

		PartDefinition cube_r238 = leftSygomaticarch.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(125, 62).addBox(-0.9707F, -0.2681F, 0.0209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4521F, -0.0317F, -0.1363F, 0.3377F, -0.0007F, 0.1481F));

		PartDefinition cube_r239 = leftSygomaticarch.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(125, 85).addBox(-0.0731F, 2.8866F, 2.3317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4521F, -5.2317F, -1.6363F, -0.5479F, -0.087F, 0.1487F));

		PartDefinition cube_r240 = leftSygomaticarch.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(106, 125).addBox(-0.0731F, 3.2076F, -3.3608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4521F, -5.2317F, -1.6363F, 0.5516F, -0.087F, 0.1487F));

		PartDefinition cube_r241 = leftSygomaticarch.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(91, 27).addBox(-0.5969F, 1.5977F, -2.5649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4521F, -5.2317F, -1.6363F, 0.5585F, 0.0F, 0.0175F));

		PartDefinition cube_r242 = leftSygomaticarch.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(23, 84).addBox(-0.5969F, 2.1314F, -0.6204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4521F, -5.2317F, -1.6363F, 0.0873F, 0.0F, 0.0175F));

		PartDefinition cube_r243 = leftSygomaticarch.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(96, 55).addBox(-0.5969F, 0.6558F, -1.2211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4521F, -5.2317F, -1.6363F, 0.1222F, 0.0F, 0.0175F));

		PartDefinition cube_r244 = leftSygomaticarch.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(92, 10).addBox(-0.5969F, -0.413F, -3.0461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4521F, -5.2317F, -1.6363F, 1.0123F, 0.0F, 0.0175F));

		PartDefinition cube_r245 = leftSygomaticarch.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(123, 39).addBox(-1.3669F, -0.1456F, -0.4614F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9479F, -7.7317F, -1.6363F, -0.1833F, 0.0F, -0.4014F));

		PartDefinition cube_r246 = leftSygomaticarch.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(39, 55).addBox(-0.3669F, 1.0826F, -0.6396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9479F, -7.7317F, -1.6363F, 0.0175F, 0.0F, -0.4014F));

		PartDefinition cube_r247 = leftSygomaticarch.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(91, 44).addBox(-0.5969F, 0.1568F, -0.5509F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4521F, -5.2317F, -1.6363F, -0.1571F, 0.0F, 0.0175F));

		PartDefinition cube_r248 = leftSygomaticarch.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(59, 68).addBox(-0.5969F, 0.0418F, -0.9827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4521F, -5.2317F, -1.6363F, -0.1833F, 0.0F, 0.0175F));

		PartDefinition cube_r249 = leftSygomaticarch.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(19, 63).addBox(-0.5969F, 0.0022F, -2.8645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4521F, -5.2317F, -1.6363F, 0.5411F, 0.0F, 0.0175F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 7.3281F, 0.4418F));

		PartDefinition cube_r250 = rightSygomaticarch.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(107, 27).mirror().addBox(-0.4582F, -0.4169F, -3.9129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.405F, -0.2602F, -0.2673F));

		PartDefinition cube_r251 = rightSygomaticarch.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.0293F, 0.7269F, 1.2998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -0.0317F, -0.1363F, 0.9136F, 0.0007F, -0.1481F));

		PartDefinition cube_r252 = rightSygomaticarch.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(125, 62).mirror().addBox(-0.0293F, -0.2681F, 0.0209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -0.0317F, -0.1363F, 0.3377F, 0.0007F, -0.1481F));

		PartDefinition cube_r253 = rightSygomaticarch.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(125, 85).mirror().addBox(-0.9269F, 2.8866F, 2.3317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -5.2317F, -1.6363F, -0.5479F, 0.087F, -0.1487F));

		PartDefinition cube_r254 = rightSygomaticarch.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(106, 125).mirror().addBox(-0.9269F, 3.2076F, -3.3608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -5.2317F, -1.6363F, 0.5516F, 0.087F, -0.1487F));

		PartDefinition cube_r255 = rightSygomaticarch.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(91, 27).mirror().addBox(-0.4031F, 1.5977F, -2.5649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -5.2317F, -1.6363F, 0.5585F, 0.0F, -0.0175F));

		PartDefinition cube_r256 = rightSygomaticarch.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(23, 84).mirror().addBox(-0.4031F, 2.1314F, -0.6204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -5.2317F, -1.6363F, 0.0873F, 0.0F, -0.0175F));

		PartDefinition cube_r257 = rightSygomaticarch.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(96, 55).mirror().addBox(-0.4031F, 0.6558F, -1.2211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -5.2317F, -1.6363F, 0.1222F, 0.0F, -0.0175F));

		PartDefinition cube_r258 = rightSygomaticarch.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(92, 10).mirror().addBox(-0.4031F, -0.413F, -3.0461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -5.2317F, -1.6363F, 1.0123F, 0.0F, -0.0175F));

		PartDefinition cube_r259 = rightSygomaticarch.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(123, 39).mirror().addBox(-0.6331F, -0.1456F, -0.4614F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9479F, -7.7317F, -1.6363F, -0.1833F, 0.0F, 0.4014F));

		PartDefinition cube_r260 = rightSygomaticarch.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(39, 55).mirror().addBox(-0.6331F, 1.0826F, -0.6396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.9479F, -7.7317F, -1.6363F, 0.0175F, 0.0F, 0.4014F));

		PartDefinition cube_r261 = rightSygomaticarch.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(91, 44).mirror().addBox(-0.4031F, 0.1568F, -0.5509F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -5.2317F, -1.6363F, -0.1571F, 0.0F, -0.0175F));

		PartDefinition cube_r262 = rightSygomaticarch.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(59, 68).mirror().addBox(-0.4031F, 0.0418F, -0.9827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -5.2317F, -1.6363F, -0.1833F, 0.0F, -0.0175F));

		PartDefinition cube_r263 = rightSygomaticarch.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(19, 63).mirror().addBox(-0.4031F, 0.0022F, -2.8645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -5.2317F, -1.6363F, 0.5411F, 0.0F, -0.0175F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, -2.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(5, 16).mirror().addBox(-1.0F, 0.0045F, -1.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(39, 15).mirror().addBox(-1.0F, 0.0045F, -0.9553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(5, 16).addBox(1.0F, 0.0045F, -1.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(39, 15).addBox(1.0F, 0.0045F, -0.9553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.5F, 5.2F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(34, 66).mirror().addBox(-1.0F, 0.0349F, -0.0291F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(34, 66).addBox(0.0F, 0.0349F, -0.0291F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 7.4F, 4.4F, -2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(50, 84).mirror().addBox(-1.0F, -0.0808F, -0.0075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 84).addBox(1.0F, -0.0808F, -0.0075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.5F, 5.1F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(120, 76).mirror().addBox(-1.0F, -0.0366F, -1.9549F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(120, 76).addBox(0.0F, -0.0366F, -1.9549F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 9.9F, 1.5F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(112, 37).mirror().addBox(-1.0F, -1.0211F, -0.3034F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(112, 37).addBox(1.0F, -1.0211F, -0.3034F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 7.1F, 1.9F, -2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(12, 13).mirror().addBox(-0.2F, 0.1F, -1.4F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 13).addBox(2.2F, 0.1F, -1.4F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.9236F, 3.0816F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(113, 100).mirror().addBox(-1.0F, -2.0132F, -0.0302F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(113, 100).addBox(1.0F, -2.0132F, -0.0302F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 4.3F, 2.9F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(85, 54).mirror().addBox(-1.0F, -1.9744F, -0.0249F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 54).addBox(1.0F, -1.9744F, -0.0249F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.6F, 2.5F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(125, 44).mirror().addBox(-1.0F, -1.0072F, 0.0186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(125, 44).addBox(2.2F, -1.0072F, 0.0186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.1F, 3.3F, 1.5F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(70, 91).mirror().addBox(-1.0F, -0.9636F, -0.0089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 91).addBox(2.2F, -0.9636F, -0.0089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -1.4932F, 3.7283F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(106, 70).mirror().addBox(-1.0F, -0.0594F, -0.007F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(106, 70).addBox(2.2F, -0.0594F, -0.007F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, 0.0068F, 5.3283F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(124, 10).mirror().addBox(-1.0F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(124, 10).addBox(2.2F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.1F, -0.7932F, 4.6283F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(115, 25).mirror().addBox(-1.0F, -0.0999F, 0.0863F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(115, 25).addBox(2.2F, -0.0999F, 0.0863F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, 0.6F, 2.1F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(106, 103).mirror().addBox(-1.0F, -2.5F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 49).mirror().addBox(-1.0F, -1.7F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(107, 3).mirror().addBox(-1.0F, -0.9F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 103).addBox(2.2F, -2.5F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(106, 49).addBox(2.2F, -1.7F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F))
				.texOffs(107, 3).addBox(2.2F, -0.9F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.4F, -0.8F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(120, 110).addBox(-1.5F, -1.0184F, -0.0328F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.5F, 0.6F, -1.8239F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -0.9067F, -0.1029F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(121, 56).addBox(-0.5F, -3.3067F, -0.1029F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(120, 104).addBox(-0.5F, -3.2067F, 3.8971F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2F, 9.3F, -0.5536F, 0.1115F, -0.0687F));

		PartDefinition cube_r279 = tail.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(12, 84).addBox(-0.5F, 1.9F, 3.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(120, 49).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0933F, -0.1029F, 0.4712F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(72, 16).addBox(-0.5F, -2.9F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 16).addBox(-0.5F, 0.3F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 0).addBox(-0.5F, 0.3F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 55).addBox(-0.5F, 0.3F, 8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 6.9F, 0.2526F, 0.2538F, 0.0647F));

		PartDefinition cube_r280 = tail2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 25).addBox(-0.5F, -1.1F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 49).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 4.5F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r281 = tail2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(52, 68).addBox(-0.5F, -0.4F, 0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.9F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.3155F, 0.2494F, 0.0804F));

		PartDefinition cube_r282 = tail3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(31, 22).addBox(0.0F, 0.3F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 0).addBox(0.0F, -0.2F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -5.5F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r283 = tail3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(16, 13).addBox(0.0F, -1.1F, 5.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(0.0F, -0.7F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 22).addBox(0.0F, -0.5F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3982F, 0.3829F, -0.0349F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 135, 135);
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