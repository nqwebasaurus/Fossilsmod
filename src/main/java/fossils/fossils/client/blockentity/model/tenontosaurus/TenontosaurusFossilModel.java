package fossils.fossils.client.blockentity.model.tenontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TenontosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
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

	public TenontosaurusFossilModel(ModelPart root) {
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
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(2.5F, -2.2845F, -2.7352F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(52, 0).addBox(0.5F, -1.2845F, -2.7352F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(52, 0).mirror().addBox(-2.5F, -1.2845F, -2.7352F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-3.5F, -2.2845F, -2.7352F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(77, 61).addBox(0.0F, -3.7846F, -4.8086F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.5F, -1.0F, 0.1298F, 0.017F, -0.1298F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(59, 75).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0502F, 3.6438F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 65).addBox(0.0F, -1.1F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 76).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7973F, -0.3061F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 56).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7846F, -2.3086F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 51).mirror().addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 51).addBox(5.5F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.7675F, -3.0796F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 28).mirror().addBox(-0.5F, 0.0191F, -0.0015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 28).addBox(5.5F, 0.0191F, -0.0015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.8675F, -4.8796F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 61).mirror().addBox(-0.5F, -0.9676F, -2.4447F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(61, 61).addBox(5.5F, -0.9676F, -2.4447F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.0F, 2.7675F, -4.2796F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 4).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.6155F, -2.7352F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 60).mirror().addBox(-0.3F, -0.6308F, -0.3814F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.1675F, -2.7796F, -0.288F, 0.3316F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 51).mirror().addBox(-0.3F, -1.1784F, 2.06F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.1675F, -2.7796F, -0.5149F, 0.3316F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(0.0F, -2.7413F, 2.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.1734F, 0.7701F, -1.4661F, 0.3665F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(0.0F, -0.5376F, 5.822F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.1734F, 0.7701F, -0.6458F, 0.3665F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(29, 73).mirror().addBox(0.0F, -3.2487F, 0.6363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.1734F, 0.7701F, -2.0769F, 0.3665F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(35, 39).mirror().addBox(0.0F, 0.0667F, 2.7394F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.1734F, 0.7701F, -0.5411F, 0.3665F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(0.0F, -0.9744F, -1.2948F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.1734F, 0.7701F, -1.0123F, 0.3665F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 48).mirror().addBox(0.0F, 0.1045F, -0.3769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.1734F, 0.7701F, -0.4102F, 0.3665F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(63, 30).mirror().addBox(0.0F, -0.4377F, -0.1136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.1734F, 0.7701F, -0.7156F, 0.3665F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(0.0F, 0.6453F, 0.1602F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.6902F, 0.0266F, 0.3491F, -0.1571F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(51, 35).mirror().addBox(0.0F, -1.3838F, -3.4503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.3845F, -2.5352F, 0.7505F, 0.1745F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(0.0F, -3.3131F, -2.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.3845F, -2.5352F, 1.4486F, 0.1745F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(65, 57).mirror().addBox(0.0F, -0.8966F, -1.7852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.3845F, -2.5352F, 0.4538F, 0.1745F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(69, 23).mirror().addBox(0.0F, -0.1222F, -1.8709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.3845F, -2.5352F, 0.1047F, 0.1745F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(0.0F, -0.5448F, -0.0119F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.6902F, 0.0266F, 0.4887F, -0.1571F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(0.0F, -1.9126F, 0.6527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.6902F, 0.0266F, -0.4712F, -0.1571F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(73, 59).addBox(-1.0F, -3.3131F, -2.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -1.3845F, -2.5352F, 1.4486F, -0.1745F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 35).addBox(-1.0F, -1.3838F, -3.4503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5F, -1.3845F, -2.5352F, 0.7505F, -0.1745F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(19, 51).addBox(-0.7F, -1.1784F, 2.06F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2F, 2.1675F, -2.7796F, -0.5149F, -0.3316F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(46, 60).addBox(-0.7F, -0.6308F, -0.3814F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(3.2F, 2.1675F, -2.7796F, -0.288F, -0.3316F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(69, 23).addBox(-1.0F, -0.1222F, -1.8709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -1.3845F, -2.5352F, 0.1047F, -0.1745F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(65, 57).addBox(-1.0F, -0.8966F, -1.7852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5F, -1.3845F, -2.5352F, 0.4538F, -0.1745F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(64, 18).addBox(-1.0F, 0.6453F, 0.1602F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5F, -1.6902F, 0.0266F, 0.3491F, 0.1571F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(9, 44).addBox(-1.0F, -1.9126F, 0.6527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5F, -1.6902F, 0.0266F, -0.4712F, 0.1571F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(5, 67).addBox(-1.0F, -0.5448F, -0.0119F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -1.6902F, 0.0266F, 0.4887F, 0.1571F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -0.5376F, 5.822F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.1734F, 0.7701F, -0.6458F, -0.3665F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(58, 6).addBox(-1.0F, -2.7413F, 2.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.3F, 1.1734F, 0.7701F, -1.4661F, -0.3665F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(29, 73).addBox(-1.0F, -3.2487F, 0.6363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.1734F, 0.7701F, -2.0769F, -0.3665F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(35, 39).addBox(-1.0F, 0.0667F, 2.7394F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3F, 1.1734F, 0.7701F, -0.5411F, -0.3665F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(41, 48).addBox(-1.0F, 0.1045F, -0.3769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 1.1734F, 0.7701F, -0.4102F, -0.3665F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(60, 6).addBox(-1.0F, -0.9744F, -1.2948F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.1734F, 0.7701F, -1.0123F, -0.3665F, 0.0F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(63, 30).addBox(-1.0F, -0.4377F, -0.1136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.3F, 1.1734F, 0.7701F, -0.7156F, -0.3665F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.6155F, -2.7352F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -1.2F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, -0.5F, -0.7F, -0.5603F, 0.0934F, 0.1476F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(7, 15).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7868F, -0.4312F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(56, 22).addBox(-1.0F, -5.9811F, -0.287F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(66, 4).addBox(-1.0F, -2.9811F, -0.087F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.7F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(62, 66).addBox(-1.0F, 1.1007F, -0.0786F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(13, 57).addBox(-1.9F, 2.1354F, -1.2811F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 54).addBox(-1.9F, 0.1354F, -1.4811F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 45).addBox(-1.9F, 8.1354F, -1.4811F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, -0.9F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(37, 54).addBox(-0.5F, -5.0F, -0.4F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.1354F, -0.7811F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(30, 17).addBox(-1.5F, 0.1F, -0.7F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.0354F, -0.1811F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(44, 14).addBox(-0.4F, -1.5F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, 4.6F, -1.2F, -0.0274F, -0.1041F, 0.5141F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(45, 39).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -0.4F, 0.4276F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(45, 48).addBox(-2.0F, -0.3F, -3.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, -0.5F, -0.7F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(7, 0).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7868F, -0.4312F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 54).addBox(-1.0F, -5.9811F, -0.287F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(34, 31).addBox(-1.0F, -2.9811F, -0.087F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(58, 35).addBox(-1.0F, -0.7F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(34, 40).addBox(-1.0F, 1.1007F, -0.0786F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(42, 54).addBox(-0.1F, 2.1354F, -1.2811F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 58).addBox(-0.1F, 0.1354F, -1.4811F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 16).addBox(-0.1F, 8.1354F, -1.4811F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, -0.9F, 1.2122F, 0.0776F, 0.2041F));

		PartDefinition cube_r52 = rightLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(32, 54).addBox(-0.5F, -5.0F, -0.4F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.1354F, -0.7811F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, 0.1F, -0.7F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.0354F, -0.1811F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(26, 40).addBox(-0.6F, -1.5F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, 4.6F, -1.2F, -0.0274F, 0.1041F, -0.5141F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(44, 29).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -0.4F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(28, 48).addBox(-2.0F, -0.3F, -3.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2681F, -3.0504F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, 0.8F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(33, 75).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 8).addBox(0.0F, -1.8F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 65).addBox(0.0F, -2.7F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 4.8F, 0.0966F, 0.13F, 0.0164F));

		PartDefinition cube_r54 = tail.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(68, 73).addBox(0.0F, -1.0F, 4.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 73).addBox(0.0F, -0.4F, 6.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 73).addBox(0.0F, -1.4F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 17).addBox(0.0F, -1.7F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7F, 2.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(69, 65).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4007F, 11.2424F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(59, 69).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9678F, 13.195F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(15, 4).addBox(0.0F, -1.0F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0267F, 0.9167F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(20, 72).addBox(0.0F, -3.7F, 8.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 72).addBox(0.0F, -4.1F, 6.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 72).addBox(0.0F, -4.4F, 4.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 72).addBox(0.0F, -4.4F, 2.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 72).addBox(0.0F, -4.4F, 0.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 0).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 5.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 14.9F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition cube_r59 = tail2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(39, 78).addBox(0.0F, 2.0F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 9).addBox(0.0F, 0.6F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 58).addBox(0.0F, 0.2F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 73).addBox(0.0F, -0.2F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 73).addBox(0.0F, -0.7F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 66).addBox(0.0F, -1.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5468F, 0.2528F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(29, 76).addBox(0.0F, -1.4F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 40).addBox(0.0F, -1.4F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 74).addBox(0.0F, -1.4F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 74).addBox(0.0F, -1.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7115F, 5.5496F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 73).addBox(0.0F, -1.5F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8214F, 3.4525F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r62 = tail2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(17, 72).addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1513F, 1.4398F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 17).addBox(-0.5F, -0.0288F, -0.0996F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.9F, 0.0964F, 0.0869F, 0.0084F));

		PartDefinition cube_r64 = tail3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(79, 38).addBox(0.0F, -1.3F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 0).addBox(0.0F, -1.4F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 29).addBox(0.0F, -1.5F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 39).addBox(0.0F, -1.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 0).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 1.4004F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(78, 65).addBox(0.0F, -1.05F, 4.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 78).addBox(0.0F, -1.35F, 2.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 78).addBox(0.0F, -1.65F, 0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 78).addBox(0.0F, -1.95F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 50).addBox(0.0F, -2.15F, -3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.444F, 4.9783F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(16, 18).addBox(-0.5F, -0.6928F, 0.3405F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F))
				.texOffs(31, 79).addBox(0.0F, -1.5928F, 1.3405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 21).addBox(0.0F, -1.4928F, 3.3405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 79).addBox(0.0F, -1.4928F, 5.3405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 78).addBox(0.0F, -1.3928F, 7.3405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 32).addBox(0.0F, -1.1928F, 9.3405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6282F, 9.495F, 0.035F, 0.0872F, 0.0031F));

		PartDefinition cube_r66 = tail4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(9, 59).addBox(0.0F, -0.1F, 3.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 60).addBox(0.0F, -0.5F, 1.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 59).addBox(0.0F, -0.9F, -0.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 63).addBox(0.0F, -1.2F, -2.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 78).addBox(0.0F, -2.4F, -4.25F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8115F, 5.9737F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(16, 4).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3072F, 11.2405F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9F, 11.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0076F, 0.0869F, 0.0876F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(77, 73).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5876F, -1.257F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(76, 77).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1454F, -3.2177F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(78, 3).addBox(0.0F, -1.1F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7264F, -11.0915F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(78, 7).addBox(0.0F, -1.9667F, -2.1256F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 78).addBox(0.0F, -1.8667F, -4.1256F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 78).addBox(0.0F, -1.7667F, -6.1256F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -5.4F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(17, 40).addBox(-0.5F, -0.3537F, -6.0286F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -5.4F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(22, 23).mirror().addBox(-2.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.943F, -1.0557F, 0.2669F, 0.1401F, -1.1087F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.943F, -1.0557F, 0.3148F, 0.0771F, -0.6742F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(71, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.643F, -3.0557F, 0.5237F, 0.1693F, -0.5961F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(71, 43).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.643F, -3.0557F, 0.4209F, 0.3104F, -1.0217F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(62, 71).mirror().addBox(-5.1021F, -2.3689F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.243F, -4.8557F, 0.2753F, 0.5237F, -1.263F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(69, 71).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.243F, -4.8557F, 0.4713F, 0.3615F, -0.8131F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(4, 72).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.243F, -4.8557F, 0.5892F, 0.1964F, -0.3922F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(43, 22).mirror().addBox(-9.1021F, -2.3689F, -0.3751F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.257F, -8.8557F, 0.2877F, 0.5569F, -1.2566F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.057F, -6.8557F, 0.2941F, 0.5735F, -1.2531F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(11, 71).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.057F, -6.8557F, 0.5103F, 0.3993F, -0.7986F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 63).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.057F, -6.8557F, 0.6387F, 0.2162F, -0.382F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 19).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.257F, -8.8557F, 0.4972F, 0.3868F, -0.8037F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(70, 57).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.257F, -8.8557F, 0.6222F, 0.2096F, -0.3855F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(15, 2).mirror().addBox(-10.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.757F, -10.8557F, 0.2941F, 0.5735F, -1.2531F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(69, 49).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.757F, -10.8557F, 0.5103F, 0.3993F, -0.7986F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 17).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.757F, -10.8557F, 0.6387F, 0.2162F, -0.382F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(22, 23).addBox(1.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.943F, -1.0557F, 0.2669F, -0.1401F, 1.1087F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(30, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.943F, -1.0557F, 0.3148F, -0.0771F, 0.6742F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(71, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.643F, -3.0557F, 0.5237F, -0.1693F, 0.5961F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(71, 43).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.643F, -3.0557F, 0.4209F, -0.3104F, 1.0217F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(70, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.757F, -10.8557F, 0.6387F, -0.2162F, 0.382F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(69, 49).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.757F, -10.8557F, 0.5103F, -0.3993F, 0.7986F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(15, 2).addBox(3.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.757F, -10.8557F, 0.2941F, -0.5735F, 1.2531F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 57).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.257F, -8.8557F, 0.6222F, -0.2096F, 0.3855F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(70, 19).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.257F, -8.8557F, 0.4972F, -0.3868F, 0.8037F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(43, 22).addBox(3.1021F, -2.3689F, -0.3751F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.257F, -8.8557F, 0.2877F, -0.5569F, 1.2566F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 9).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.057F, -6.8557F, 0.2941F, -0.5735F, 1.2531F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(11, 71).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.057F, -6.8557F, 0.5103F, -0.3993F, 0.7986F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(70, 63).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.057F, -6.8557F, 0.6387F, -0.2162F, 0.382F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(62, 71).addBox(3.1021F, -2.3689F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.243F, -4.8557F, 0.2753F, -0.5237F, 1.263F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(69, 71).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.243F, -4.8557F, 0.4713F, -0.3615F, 0.8131F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(4, 72).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.243F, -4.8557F, 0.5892F, -0.1964F, 0.3922F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.0392F, -5.9576F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.4F, 0.1484F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -12.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(13, 31).mirror().addBox(0.0F, -0.0087F, -0.45F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 7.2643F, -0.0835F, 0.0998F, -0.8373F, 0.1605F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(23, 31).mirror().addBox(0.0F, -0.0087F, -0.45F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 7.2643F, -0.0835F, 0.1187F, -0.6636F, 0.184F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(9, 49).mirror().addBox(-0.5F, -0.0087F, -0.75F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 7.2643F, -0.0835F, 0.1468F, -1.0972F, 0.1039F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(26, 40).mirror().addBox(-0.5F, -0.0087F, -0.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 7.2643F, -0.8835F, 0.4554F, -1.2582F, -0.0792F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(55, 59).mirror().addBox(-2.0F, -0.9498F, 0.117F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 59).addBox(-1.0F, -0.9498F, 0.117F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.7F, -2.5F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-2.0F, 0.527F, 0.6196F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 21).addBox(0.0F, 0.527F, 0.6196F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -5.6F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(30, 1).mirror().addBox(0.3F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7133F, 5.5087F, -6.2236F, 1.134F, -0.5866F, -0.8092F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(65, 11).mirror().addBox(-1.4548F, -1.9324F, -3.7256F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 1.585F, -2.2282F, 0.9035F, -0.2813F, -0.1905F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(34, 29).mirror().addBox(-0.6725F, -1.655F, -3.0731F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 1.585F, -2.2282F, 0.7592F, 0.0F, 0.0873F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(23, 31).addBox(-1.0F, -0.0087F, -0.45F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 7.2643F, -0.0835F, 0.1187F, 0.6636F, -0.184F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(13, 31).addBox(-1.0F, -0.0087F, -0.45F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 7.2643F, -0.0835F, 0.0998F, 0.8373F, -0.1605F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(9, 49).addBox(-0.5F, -0.0087F, -0.75F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 7.2643F, -0.0835F, 0.1468F, 1.0972F, -0.1039F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -0.0087F, -0.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 7.2643F, -0.8835F, 0.4554F, 1.2582F, 0.0792F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(22, 78).addBox(0.0F, -1.8767F, -2.0176F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6F, 0.7F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(25, 78).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3074F, -2.8518F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(36, 78).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7602F, -4.4529F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-10.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.543F, -0.6557F, 0.2941F, 0.5735F, -1.2531F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.543F, -0.6557F, 0.5103F, 0.3993F, -0.7986F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(52, 45).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.743F, -2.3557F, 0.5103F, 0.3993F, -0.7986F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(67, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.543F, -0.6557F, 0.6387F, 0.2162F, -0.382F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(60, 11).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.743F, -2.3557F, 0.6387F, 0.2162F, -0.382F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(30, 13).mirror().addBox(-9.1021F, -2.3689F, -0.3751F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.743F, -2.3557F, 0.2941F, 0.5735F, -1.2531F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(43, 24).mirror().addBox(-8.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.057F, -3.9557F, 0.3074F, 0.6066F, -1.2458F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(23, 49).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.057F, -3.9557F, 0.537F, 0.4242F, -0.7879F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.057F, -3.9557F, 0.672F, 0.2291F, -0.3747F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(52, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.057F, -3.9557F, 0.672F, -0.2291F, 0.3747F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(23, 49).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.057F, -3.9557F, 0.537F, -0.4242F, 0.7879F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(43, 24).addBox(3.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.057F, -3.9557F, 0.3074F, -0.6066F, 1.2458F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(60, 11).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.743F, -2.3557F, 0.6387F, -0.2162F, 0.382F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(52, 45).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.743F, -2.3557F, 0.5103F, -0.3993F, 0.7986F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(30, 13).addBox(3.1021F, -2.3689F, -0.3751F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.743F, -2.3557F, 0.2941F, -0.5735F, 1.2531F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(67, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.543F, -0.6557F, 0.6387F, -0.2162F, 0.382F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(15, 0).addBox(3.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.543F, -0.6557F, 0.2941F, -0.5735F, 1.2531F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(69, 30).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.543F, -0.6557F, 0.5103F, -0.3993F, 0.7986F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(52, 69).addBox(-0.3275F, -1.2616F, 1.8138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7275F, 1.585F, -2.2282F, 0.4451F, 0.0F, -0.0873F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(30, 1).addBox(-1.3F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7133F, 5.5087F, -6.2236F, 1.134F, 0.5866F, 0.8092F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(65, 11).addBox(0.4548F, -1.9324F, -3.7256F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7275F, 1.585F, -2.2282F, 0.9035F, 0.2813F, 0.1905F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(34, 29).addBox(-0.3275F, -1.655F, -3.0731F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7275F, 1.585F, -2.2282F, 0.7592F, 0.0F, -0.0873F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(43, 0).addBox(-0.5F, -0.37F, -5.8614F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.6F, 0.7F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(72, 32).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 54).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, 5.2F, -3.3F, 0.8335F, 0.2975F, -0.4347F));

		PartDefinition cube_r144 = leftArm.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftArm.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6491F, 0.6993F, -0.2799F, -0.2269F, -0.48F, 0.0F));

		PartDefinition cube_r146 = leftArm.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(70, 9).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8569F, 2.648F, -0.679F, 0.8465F, -0.48F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(47, 65).addBox(0.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(42, 64).addBox(0.0F, 0.0F, -1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 5.6F, 1.4F, -1.3715F, 0.4881F, -0.1995F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(23, 31).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -1.5F, 0.1855F, 0.3435F, 0.0631F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(62, 50).addBox(-0.5F, -0.5F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 2.5F, 0.0F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(10, 73).addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0294F, 0.3F, 1.749F, 1.1781F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(70, 0).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 40).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 5.2F, -3.3F, 0.8555F, -0.1996F, 0.3451F));

		PartDefinition cube_r147 = rightArm.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 42).addBox(0.0F, -0.1F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightArm.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(18, 49).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6491F, 0.6993F, -0.2799F, -0.2269F, 0.48F, 0.0F));

		PartDefinition cube_r149 = rightArm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(22, 17).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8569F, 2.648F, -0.679F, 0.8465F, 0.48F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(26, 63).addBox(-1.0F, 0.0F, -1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 5.6F, 1.4F, -1.3211F, -0.3497F, 0.1757F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -1.5F, 0.0518F, -0.3854F, 0.3081F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(15, 23).addBox(-1.5F, -0.5F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(73, 4).addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0294F, 0.3F, 1.749F, 1.1781F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -3.9F, 0.4251F, 0.2559F, 0.0592F));

		PartDefinition cube_r150 = neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5337F, -3.7604F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.7421F, -0.1281F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8887F, -1.9934F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(43, 13).addBox(-0.5F, -1.3F, -3.1F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3113F, -2.4934F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(15, 10).mirror().addBox(-6.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.043F, -3.9557F, 0.2753F, 0.5237F, -1.5422F));

		PartDefinition cube_r154 = neck3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(9, 42).mirror().addBox(-8.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.043F, -1.9557F, 0.235F, 0.4069F, -1.3683F));

		PartDefinition cube_r155 = neck3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(14, 44).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.043F, -1.9557F, 0.3842F, 0.2716F, -0.9276F));

		PartDefinition cube_r156 = neck3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.043F, -1.9557F, 0.4751F, 0.1485F, -0.4991F));

		PartDefinition cube_r157 = neck3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.043F, -3.9557F, 0.4713F, 0.3615F, -1.0924F));

		PartDefinition cube_r158 = neck3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(30, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.043F, -3.9557F, 0.5892F, 0.1964F, -0.6714F));

		PartDefinition cube_r159 = neck3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(15, 10).addBox(3.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.043F, -3.9557F, 0.2753F, -0.5237F, 1.5422F));

		PartDefinition cube_r160 = neck3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.043F, -3.9557F, 0.5892F, -0.1964F, 0.6714F));

		PartDefinition cube_r161 = neck3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(30, 8).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.043F, -3.9557F, 0.4713F, -0.3615F, 1.0924F));

		PartDefinition cube_r162 = neck3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(9, 42).addBox(3.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.043F, -1.9557F, 0.235F, -0.4069F, 1.3683F));

		PartDefinition cube_r163 = neck3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(14, 44).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.043F, -1.9557F, 0.3842F, -0.2716F, 0.9276F));

		PartDefinition cube_r164 = neck3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.043F, -1.9557F, 0.4751F, -0.1485F, 0.4991F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9887F, -4.9934F, -0.3302F, 0.3027F, -0.0594F));

		PartDefinition cube_r165 = neck2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(53, 26).addBox(0.0F, 0.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 28).addBox(0.0F, 0.3F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 9).addBox(-0.5F, 1.0F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2F, -3.7F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r166 = neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-2.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2484F, -1.4167F, 0.4215F, 0.5229F, -1.0652F));

		PartDefinition cube_r167 = neck2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(72, 27).mirror().addBox(-1.9485F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.169F, -3.2586F, 0.4561F, 0.6012F, -1.0218F));

		PartDefinition cube_r168 = neck2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(72, 27).addBox(-0.0515F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.169F, -3.2586F, 0.4561F, -0.6012F, 1.0218F));

		PartDefinition cube_r169 = neck2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(72, 45).addBox(0.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2484F, -1.4167F, 0.4215F, -0.5229F, 1.0652F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -4.3F, 0.1282F, 0.5988F, 0.1582F));

		PartDefinition cube_r170 = neck.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(58, 50).mirror().addBox(-0.9485F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2059F, -0.6875F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition cube_r171 = neck.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(27, 54).mirror().addBox(-0.8728F, -0.0348F, -0.3654F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2931F, -2.6856F, 0.4645F, 0.8777F, -1.033F));

		PartDefinition cube_r172 = neck.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(27, 54).addBox(-0.1272F, -0.0348F, -0.3654F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2931F, -2.6856F, 0.4645F, -0.8777F, 1.033F));

		PartDefinition cube_r173 = neck.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(58, 50).addBox(-0.0515F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2059F, -0.6875F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r174 = neck.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, 0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 21).addBox(0.0F, 0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 17).addBox(-0.5F, 1.0F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.3F, -0.1571F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -3.0F, 0.4494F, 0.1581F, -0.2103F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(79, 43).mirror().addBox(0.1F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 43).addBox(0.9F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5464F, -4.6F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(42, 79).mirror().addBox(0.0F, -0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 79).addBox(1.0F, -0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7628F, -3.6237F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(42, 76).addBox(-0.6F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.7464F, -5.5F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(51, 73).mirror().addBox(-0.5F, -0.1319F, -0.5598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(51, 73).addBox(0.74F, -0.1319F, -0.5598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.62F, -1.2094F, -0.5951F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(22, 4).mirror().addBox(-0.7F, -0.7F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(22, 4).addBox(1.14F, -0.7F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.72F, -0.0688F, -0.979F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(76, 24).mirror().addBox(-0.5F, -0.5218F, -0.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(76, 24).addBox(0.94F, -0.5218F, -0.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.72F, -0.5894F, -2.3847F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-0.82F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 73).mirror().addBox(-0.71F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 77).mirror().addBox(-0.5F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 38).addBox(1.26F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(42, 73).addBox(1.15F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 77).addBox(0.94F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.72F, -0.5894F, -2.3847F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(67, 45).addBox(0.14F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.32F, -0.5994F, -5.0939F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(67, 35).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(67, 35).addBox(0.14F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.32F, -0.5994F, -5.0939F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 47).addBox(0.54F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.52F, -0.0962F, -3.6865F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 0).addBox(0.54F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.52F, 0.1493F, -3.8858F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(62, 40).mirror().addBox(-0.5F, -1.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 40).addBox(-0.1F, -1.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7464F, -3.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(61, 0).addBox(0.1F, -0.8732F, -1.1536F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-1.1F, 1.1464F, -5.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(76, 35).mirror().addBox(-1.2F, -0.0078F, 0.0528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(76, 35).addBox(0.2F, -0.0078F, 0.0528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0536F, -0.3F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-1.2F, 0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6091F, -0.5786F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(-0.5F, -1.8349F, -1.2681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 13).addBox(0.9F, -1.8349F, -1.2681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.0987F, -2.0853F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(12, 67).mirror().addBox(-0.5F, -1.3F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(12, 67).addBox(0.9F, -1.3F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, 0.3987F, -1.3853F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(31, 66).mirror().addBox(-0.5F, -1.1F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(31, 66).addBox(0.9F, -1.1F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, 0.3987F, -1.3853F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(77, 15).addBox(-0.5F, -0.0752F, -0.0479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5464F, -6.6F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(76, 29).addBox(0.2F, 0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.6091F, -0.5786F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(68, 39).addBox(-0.5F, 0.6F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3536F, -3.1F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(74, 53).addBox(-0.5F, 0.0114F, -1.3751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(50, 76).addBox(-0.5F, 0.0114F, -0.9751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0536F, -5.1F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(76, 70).addBox(-0.5F, -0.0669F, -1.0162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3536F, -4.1F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(77, 18).addBox(-0.5F, -0.0018F, -1.0191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.4536F, -3.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(19, 68).addBox(-1.0F, -0.0337F, 0.0012F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3536F, -1.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(53, 64).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3536F, -3.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8464F, -1.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(77, 12).addBox(-0.5F, -1.3624F, -0.9145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.4392F, -4.8616F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.6F, -1.43F, -1.8421F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 73).addBox(0.6F, -1.43F, -1.8421F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0392F, -2.0616F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(6, 62).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0003F)).mirror(false)
				.texOffs(6, 62).addBox(-0.1F, -0.6F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.6393F, -3.4893F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(17, 63).addBox(-0.1F, -0.6F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, 0.6393F, -3.4893F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(11, 77).mirror().addBox(-1.2F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 77).addBox(0.2F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0442F, -1.2163F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(63, 25).mirror().addBox(-1.2F, -0.2F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(63, 25).addBox(0.2F, -0.2F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1392F, 0.9384F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(74, 21).addBox(-0.8F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.7057F, -4.4921F, 0.0349F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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