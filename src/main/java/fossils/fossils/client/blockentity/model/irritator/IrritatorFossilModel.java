package fossils.fossils.client.blockentity.model.irritator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IrritatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart tail1;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail9;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public IrritatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone4 = this.hips.getChild("bone4");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.tail1 = this.hips.getChild("tail1");
		this.tail = this.tail1.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail9 = this.tail3.getChild("tail9");
		this.tail4 = this.tail9.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.bone = this.tail1.getChild("bone");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.head = this.neck7.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.7654F, 4.5418F, -0.2283F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 91).addBox(0.0F, -7.2F, -1.8F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1458F, -2.3716F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 69).addBox(-0.003F, -0.2F, -4.0F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.5759F, 1.7568F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 48).addBox(0.0F, 0.0F, 0.075F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.8033F, 1.6727F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(120, 58).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2318F, -3.2726F, 0.1712F, 0.1479F, -0.6302F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(120, 58).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2318F, -3.2726F, 0.1712F, -0.1479F, 0.6302F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.9822F, 0.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2422F, -3.6881F, 5.9463F, 0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 97).addBox(-1.2232F, -0.337F, 1.9624F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.703F, -0.6739F, -3.9628F, -0.261F, -0.0116F, -0.4027F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5827F, 4.0931F, -7.8175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(97, 63).addBox(-1.2232F, -0.1647F, -0.0157F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.703F, -0.6739F, -3.9628F, -0.1738F, -0.0116F, -0.4027F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(84, 72).addBox(-0.35F, -0.2F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6473F, 3.8058F, -0.825F, 0.2517F, -0.0665F, -0.4191F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 22).addBox(-0.9939F, 3.3192F, -2.6092F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.703F, -0.0739F, -0.4628F, -0.0332F, -0.0692F, -0.4044F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 108).addBox(-0.5F, -0.7F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0679F, 2.4424F, 1.5308F, 0.3462F, -0.0749F, -0.3985F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 91).addBox(-0.9892F, 0.0349F, -0.0409F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.703F, -0.0739F, -0.4628F, -0.5265F, -0.0749F, -0.3985F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(115, 119).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6456F, 8.3493F, -6.6495F, -1.2833F, 0.0639F, 0.0248F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(115, 8).addBox(-0.478F, -4.4044F, 0.1688F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5644F, 10.2833F, -1.236F, 1.0407F, -0.0199F, 0.0571F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(115, 44).addBox(-0.478F, -4.8257F, -0.9276F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5644F, 10.2833F, -1.236F, 0.3862F, -0.0199F, 0.0571F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(108, 109).addBox(-0.1175F, 2.0359F, 0.277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1644F, 10.6833F, -0.436F, 0.0458F, -0.0199F, -0.0476F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(80, 119).addBox(-0.1175F, 0.8273F, -0.3331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1644F, 10.6833F, -0.436F, 0.3513F, -0.0199F, -0.0476F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(115, 97).addBox(-0.1175F, 0.0413F, -0.6215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1644F, 10.6833F, -0.436F, 0.7003F, -0.0199F, -0.0476F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(93, 115).addBox(-0.478F, -2.0908F, -0.3076F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5644F, 10.2833F, -1.236F, 0.7352F, -0.0199F, 0.0571F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(115, 114).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5027F, 9.9609F, -8.2594F, -0.812F, 0.0639F, 0.0248F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(126, 88).addBox(-0.0049F, 0.4308F, -5.813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.2027F, 12.5609F, -9.8594F, 0.7762F, 0.0639F, -0.1672F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(110, 40).addBox(-0.0049F, 3.1456F, -4.3188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2027F, 12.5609F, -9.8594F, 0.2526F, 0.0639F, -0.1672F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(120, 22).addBox(-0.0049F, 2.8308F, -1.7722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2027F, 12.5609F, -9.8594F, -0.1837F, 0.0639F, -0.1672F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(86, 118).addBox(-0.0049F, 2.9108F, -0.6301F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2027F, 12.5609F, -9.8594F, -0.5764F, 0.0639F, -0.1672F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(24, 116).addBox(-0.0049F, -0.0704F, -0.834F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2027F, 12.5609F, -9.8594F, -0.5066F, 0.0639F, -0.1672F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(14, 116).addBox(-0.1137F, -0.1179F, -0.808F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1027F, 9.9609F, -8.4594F, -0.5066F, 0.0639F, -0.1148F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(19, 120).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5912F, 8.0718F, -7.6087F, -0.3321F, 0.0639F, 0.0248F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 107).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6196F, 5.8735F, -8.0168F, -0.2797F, 0.0639F, 0.0248F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(106, 35).addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6777F, 6.1849F, -6.9875F, -0.6724F, 0.0639F, 0.0248F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(101, 102).addBox(-0.3844F, 0.6861F, 0.4233F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7319F, 4.3537F, -5.0402F, 0.0693F, 0.0639F, 0.0248F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(15, 75).addBox(-0.3844F, -0.3139F, -1.8767F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7319F, 4.3537F, -5.0402F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(6, 119).addBox(-0.5F, -1.6583F, -0.4431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(88, 104).addBox(-0.5F, -2.6583F, -1.4431F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 2.4509F, -0.3037F, -0.3808F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(125, 22).addBox(-0.5F, -1.8392F, -1.9698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(118, 107).addBox(-0.5F, -1.8392F, -0.9698F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 1.7964F, -0.3037F, -0.3808F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(104, 77).addBox(-0.5F, -1.7844F, -0.4469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 1.5346F, -0.3037F, -0.3808F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(89, 26).addBox(-0.5F, -2.3219F, 0.4529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 1.011F, -0.3037F, -0.3808F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(36, 58).addBox(-0.5F, -2.7304F, 0.2166F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 0.531F, -0.3037F, -0.3808F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5F, -2.9698F, 0.3392F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 0.2256F, -0.3037F, -0.3808F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 87).addBox(-1.2498F, -0.0363F, 0.0482F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.703F, -0.6739F, -6.9628F, 0.0402F, 0.0089F, -0.4028F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2422F, -3.6881F, 5.9463F, 0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(73, 97).mirror().addBox(0.2232F, -0.337F, 1.9624F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -0.6739F, -3.9628F, -0.261F, 0.0116F, 0.4027F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.4173F, 4.0931F, -7.8175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(97, 63).mirror().addBox(0.2232F, -0.1647F, -0.0157F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -0.6739F, -3.9628F, -0.1738F, 0.0116F, 0.4027F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(84, 72).mirror().addBox(-0.65F, -0.2F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6473F, 3.8058F, -0.825F, 0.2517F, 0.0665F, 0.4191F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(67, 22).mirror().addBox(-0.0061F, 3.3192F, -2.6092F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -0.0739F, -0.4628F, -0.0332F, 0.0692F, 0.4044F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(72, 108).mirror().addBox(-0.5F, -0.7F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0679F, 2.4424F, 1.5308F, 0.3462F, 0.0749F, 0.3985F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(46, 91).mirror().addBox(-0.0108F, 0.0349F, -0.0409F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -0.0739F, -0.4628F, -0.5265F, 0.0749F, 0.3985F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(115, 119).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6456F, 8.3493F, -6.6495F, -1.2833F, -0.0639F, -0.0248F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(115, 8).mirror().addBox(-0.522F, -4.4044F, 0.1688F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 10.2833F, -1.236F, 1.0407F, 0.0199F, -0.0571F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(115, 44).mirror().addBox(-0.522F, -4.8257F, -0.9276F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 10.2833F, -1.236F, 0.3862F, 0.0199F, -0.0571F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(108, 109).mirror().addBox(-0.8824F, 2.0359F, 0.277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1644F, 10.6833F, -0.436F, 0.0458F, 0.0199F, 0.0476F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(80, 119).mirror().addBox(-0.8824F, 0.8273F, -0.3331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1644F, 10.6833F, -0.436F, 0.3513F, 0.0199F, 0.0476F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(115, 97).mirror().addBox(-0.8824F, 0.0413F, -0.6215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1644F, 10.6833F, -0.436F, 0.7003F, 0.0199F, 0.0476F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 115).mirror().addBox(-0.522F, -2.0908F, -0.3076F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 10.2833F, -1.236F, 0.7352F, 0.0199F, -0.0571F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(115, 114).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5027F, 9.9609F, -8.2594F, -0.812F, -0.0639F, -0.0248F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(126, 88).mirror().addBox(-0.9951F, 0.4308F, -5.813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.2027F, 12.5609F, -9.8594F, 0.7762F, -0.0639F, 0.1672F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(110, 40).mirror().addBox(-0.9951F, 3.1456F, -4.3188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2027F, 12.5609F, -9.8594F, 0.2526F, -0.0639F, 0.1672F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(120, 22).mirror().addBox(-0.9951F, 2.8308F, -1.7722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2027F, 12.5609F, -9.8594F, -0.1837F, -0.0639F, 0.1672F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(86, 118).mirror().addBox(-0.9951F, 2.9108F, -0.6301F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2027F, 12.5609F, -9.8594F, -0.5764F, -0.0639F, 0.1672F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(24, 116).mirror().addBox(-0.9951F, -0.0704F, -0.834F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2027F, 12.5609F, -9.8594F, -0.5066F, -0.0639F, 0.1672F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(14, 116).mirror().addBox(-0.8863F, -0.1179F, -0.808F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1027F, 9.9609F, -8.4594F, -0.5066F, -0.0639F, 0.1148F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(19, 120).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5912F, 8.0718F, -7.6087F, -0.3321F, -0.0639F, -0.0248F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(44, 107).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6196F, 5.8735F, -8.0168F, -0.2797F, -0.0639F, -0.0248F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(106, 35).mirror().addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6777F, 6.1849F, -6.9875F, -0.6724F, -0.0639F, -0.0248F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(101, 102).mirror().addBox(-0.6156F, 0.6861F, 0.4233F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 4.3537F, -5.0402F, 0.0693F, -0.0639F, -0.0248F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.6156F, -0.3139F, -1.8767F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 4.3537F, -5.0402F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(6, 119).mirror().addBox(-0.5F, -1.6583F, -0.4431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(88, 104).mirror().addBox(-0.5F, -2.6583F, -1.4431F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 2.4509F, 0.3037F, 0.3808F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(125, 22).mirror().addBox(-0.5F, -1.8392F, -1.9698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(118, 107).mirror().addBox(-0.5F, -1.8392F, -0.9698F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 1.7964F, 0.3037F, 0.3808F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(104, 77).mirror().addBox(-0.5F, -1.7844F, -0.4469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 1.5346F, 0.3037F, 0.3808F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(89, 26).mirror().addBox(-0.5F, -2.3219F, 0.4529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 1.011F, 0.3037F, 0.3808F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(36, 58).mirror().addBox(-0.5F, -2.7304F, 0.2166F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 0.531F, 0.3037F, 0.3808F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-0.5F, -2.9698F, 0.3392F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 0.2256F, 0.3037F, 0.3808F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(0.2499F, -0.0363F, 0.0482F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -0.6739F, -6.9628F, 0.0402F, -0.0089F, 0.4028F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(9, 84).addBox(-0.4F, -0.7F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 2.285F, 1.441F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(95, 37).addBox(-5.6F, 1.2801F, -0.134F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 10.5601F, -0.7101F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(79, 109).addBox(-5.1F, 0.0034F, 0.6068F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(110, 51).addBox(-5.1F, 0.0034F, 0.0068F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 8.5851F, -1.1351F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(116, 0).addBox(-5.1F, 0.6412F, -0.4417F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.6F, 10.5601F, -0.7101F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(74, 113).addBox(-1.0F, -1.5F, 0.175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 10.927F, 0.8556F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(109, 0).addBox(-5.1F, 0.021F, 0.0531F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 10.5601F, -0.7101F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(52, 123).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.1459F, 0.3107F, -2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(6, 123).addBox(-0.5F, -0.4086F, -0.1934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 4.1459F, 0.3107F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(30, 99).addBox(-5.1F, 0.0069F, 0.6248F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(103, 15).addBox(-5.1F, 0.0069F, -0.0752F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 4.5851F, -1.1351F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(94, 57).addBox(-1.1F, -0.4F, -2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 2.2376F, 1.5007F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 11.7974F, 1.7145F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(105, 94).addBox(0.9F, -2.225F, -0.15F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(108, 113).addBox(-0.1F, -1.6F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, 2.3693F, 0.3041F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(104, 65).addBox(-0.1F, -1.6F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1421F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(103, 21).addBox(-1.0F, -0.675F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 0.5374F, -1.3651F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(101, 53).addBox(-0.1F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(51, 107).addBox(-0.1F, -1.0F, -1.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(108, 6).addBox(-0.1F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(101, 46).addBox(-0.1F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7282F, 0.8127F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(107, 82).addBox(-0.1F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 3.2079F, 0.3786F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(39, 75).addBox(-1.1F, -7.0F, -0.525F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 7.6472F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(108, 99).addBox(-1.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.4F, 0.1471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(9, 76).addBox(-1.1F, -0.0365F, -0.9927F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4F, 4.9718F, 0.5374F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(81, 113).addBox(-1.1F, -0.9225F, -0.457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4F, 2.1197F, 0.3582F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(26, 82).addBox(-1.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6326F, -0.991F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(120, 8).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r96 = rightLeg3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(25, 110).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(36, 64).addBox(-1.5F, -0.0746F, -2.9368F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.9009F, 0.1707F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(55, 48).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7216F, -2.9319F, -0.0399F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(84, 36).addBox(-2.6F, -0.7F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 2.285F, 1.441F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(9, 97).addBox(2.6F, 1.2801F, -0.134F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 10.5601F, -0.7101F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(110, 15).addBox(3.1F, 0.0034F, 0.6068F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(86, 110).addBox(3.1F, 0.0034F, 0.0068F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 8.5851F, -1.1351F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(116, 85).addBox(3.1F, 0.6412F, -0.4417F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.6F, 10.5601F, -0.7101F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(101, 113).addBox(-1.0F, -1.5F, 0.175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 10.927F, 0.8556F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(37, 109).addBox(3.1F, 0.021F, 0.0531F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.6F, 10.5601F, -0.7101F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(123, 60).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.1459F, 0.3107F, -2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(57, 123).addBox(-0.5F, -0.4086F, -0.1934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.1459F, 0.3107F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 101).addBox(3.1F, 0.0069F, 0.6248F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(37, 103).addBox(3.1F, 0.0069F, -0.0752F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 4.5851F, -1.1351F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(95, 31).addBox(-0.9F, -0.4F, -2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 2.2376F, 1.5007F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 11.7974F, 1.7145F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 106).addBox(-2.9F, -2.225F, -0.15F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(114, 67).addBox(-1.9F, -1.6F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, 2.3693F, 0.3041F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(72, 104).addBox(-1.9F, -1.6F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2F, -0.1421F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(104, 61).addBox(-1.0F, -0.675F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 0.5374F, -1.3651F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(104, 31).addBox(-1.9F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(58, 107).addBox(-1.9F, -1.0F, -1.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(108, 46).addBox(-1.9F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(94, 102).addBox(-1.9F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7282F, 0.8127F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 108).addBox(-1.9F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 3.2079F, 0.3786F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(82, 18).addBox(-0.9F, -7.0F, -0.525F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2F, 7.6472F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(101, 108).addBox(0.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-2.4F, 0.1471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(25, 102).addBox(0.1F, -0.0365F, -0.9927F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4F, 4.9718F, 0.5374F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(19, 114).addBox(0.1F, -0.9225F, -0.457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4F, 2.1197F, 0.3582F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(46, 82).addBox(-2.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6326F, -0.991F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(120, 44).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r120 = leftLeg3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(30, 111).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(65, 37).addBox(-4.5F, -0.0746F, -2.9368F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.9009F, 0.1707F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(55, 54).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7216F, -2.9319F, -0.2144F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2862F, 7.5002F, -0.2651F, 0.1704F, -0.0381F));

		PartDefinition cube_r121 = tail1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(3, 117).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4381F, 8.8381F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r122 = tail1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(103, 128).addBox(0.0F, -2.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7706F, 3.1245F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r123 = tail1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(103, 117).addBox(0.5F, -0.4129F, -0.6754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2937F, 4.2236F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 117).addBox(0.5F, -0.1129F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2555F, 6.7132F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r125 = tail1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(85, 46).addBox(0.5F, -7.5073F, -0.2162F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6576F, 6.0586F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(89, 15).addBox(0.5F, -7.7323F, -0.0162F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4066F, 2.8685F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(82, 84).addBox(0.5F, -7.8823F, -1.2162F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2653F, 1.074F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(21, 37).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1484F, 1.0289F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r129 = tail1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(21, 37).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1484F, 1.0289F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r130 = tail1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, -1.9F, -0.9F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.7562F, 1.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5126F, 8.8379F, 0.0542F, 0.2972F, 0.0837F));

		PartDefinition cube_r131 = tail.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 60).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2382F, 1.9544F, 0.1575F, 0.069F, 0.0109F));

		PartDefinition cube_r132 = tail.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(71, 66).addBox(0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(70, 60).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.2382F, 1.9544F, 0.1575F, -0.069F, -0.0109F));

		PartDefinition cube_r133 = tail.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 48).addBox(0.0F, -1.9F, 8.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.2308F, -7.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(115, 107).addBox(0.0F, 0.1F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.748F, 7.0799F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r135 = tail.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(15, 59).addBox(0.0F, 0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0636F, 4.7429F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(53, 116).addBox(0.0F, -0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.703F, 2.7675F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(111, 69).addBox(0.5F, -5.5073F, -0.0162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6867F, 6.7705F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(98, 109).addBox(0.5F, -5.4073F, -0.0162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.8262F, 4.7753F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(16, 101).addBox(0.5F, -5.5823F, -0.0162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.4832F, 2.8024F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(39, 93).addBox(0.5F, -6.7823F, -0.1162F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.7285F, -0.136F, -0.1833F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.6624F, 7.8232F, 0.1158F, 0.1724F, 0.0276F));

		PartDefinition cube_r141 = tail2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(62, 116).addBox(0.0F, -6.0811F, 5.9684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 116).addBox(0.0F, -5.7811F, 3.9684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 116).addBox(0.0F, -5.4811F, 1.9684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 116).addBox(0.0F, -5.1811F, 0.0684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(50, 10).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(48, 25).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(59, 116).addBox(0.0F, 0.1F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3862F, 1.7446F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(106, 117).addBox(0.0F, -0.8F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1005F, 6.0433F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(56, 116).addBox(0.0F, -0.2F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-0.9F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4564F, 0.0304F, 0.0175F, 0.0698F, 0.0012F));

		PartDefinition cube_r147 = tail2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(19, 58).addBox(-0.1F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4564F, 0.0304F, 0.0175F, -0.0698F, -0.0012F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, -0.0426F, 0.218F, 0.0097F));

		PartDefinition cube_r148 = tail8.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(44, 37).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail8.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(47, 131).addBox(0.0F, 1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2907F, 7.9722F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail8.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(91, 120).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0617F, 6.0009F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail8.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(62, 123).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0245F, 3.9397F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail8.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(99, 122).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0846F, 1.901F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail8.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(109, 117).addBox(0.0F, -0.7F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.1152F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail8.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(73, 91).addBox(0.0F, -5.6561F, 5.4684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 91).addBox(0.0F, -5.3561F, 3.6684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 91).addBox(0.0F, -4.9561F, 1.7684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 91).addBox(0.0F, -4.5561F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 0.8984F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, -0.0888F, 0.2615F, -0.0117F));

		PartDefinition cube_r155 = tail3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(100, 131).addBox(0.0F, 0.8F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4364F, 6.8875F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(132, 116).addBox(0.0F, 0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2488F, 5.1861F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(33, 131).addBox(0.0F, 0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1036F, 3.2148F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(30, 131).addBox(0.0F, 0.5F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1338F, 0.8613F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(132, 112).addBox(0.0F, -2.5628F, 1.9016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 112).addBox(0.0F, -2.2628F, -0.0984F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9252F, 5.9853F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(132, 112).addBox(0.0F, -2.4628F, -0.1984F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8613F, 4.0447F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(132, 112).addBox(0.0F, -2.7628F, -0.1984F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6769F, 2.0283F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(132, 112).addBox(0.0F, -2.9128F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(21, 47).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0732F, 0.3047F, -0.022F));

		PartDefinition cube_r164 = tail9.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(69, 8).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail9.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(95, 10).addBox(0.0F, 0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.152F, 4.4886F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail9.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(133, 60).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3096F, 2.4724F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail9.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(58, 133).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5646F, 0.4787F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail9.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(133, 56).addBox(0.0F, -3.175F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 56).addBox(0.0F, -2.575F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4878F, 2.979F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail9.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(133, 56).addBox(0.0F, -2.375F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2753F, 0.9678F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.1271F, 0.3507F, 0.0273F));

		PartDefinition cube_r170 = tail4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(106, 133).addBox(0.0F, 2.5923F, 5.4449F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 83).addBox(0.0F, 1.6923F, 3.4449F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 105).addBox(0.0F, 1.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5331F, -1.4219F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(36, 48).addBox(0.0F, -2.875F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0251F, 5.0092F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(36, 48).addBox(0.0F, -2.875F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 48).addBox(0.0F, -2.775F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.393F, 1.0311F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(69, 79).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.1577F, 0.3451F, -0.0537F));

		PartDefinition cube_r174 = tail5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(94, 63).addBox(0.0F, 4.1F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 15).addBox(0.0F, 3.3983F, 7.4739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.186F, -7.6132F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(115, 133).addBox(0.0F, -2.325F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 133).addBox(0.0F, -2.425F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4872F, 0.8777F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5056F, 4.6774F, -0.064F, 0.3048F, -0.0192F));

		PartDefinition cube_r176 = tail6.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(119, 133).addBox(0.0F, -1.4F, 1.925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 133).addBox(0.0F, -1.4F, -0.075F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1417F, 4.0393F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail6.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(119, 133).addBox(0.0F, -1.9F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3585F, 1.9891F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail6.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(119, 133).addBox(0.0F, -1.9F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1842F, -0.0033F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail6.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(112, 133).addBox(0.0F, 4.9F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6916F, -12.2905F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(25, 25).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1443F, 0.4323F, -0.0608F));

		PartDefinition cube_r180 = tail7.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(125, 134).addBox(0.0F, -1.025F, 0.15F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5157F, -0.3105F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4925F, 8.6858F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(20, 84).addBox(-0.5F, -7.0105F, -1.1178F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.169F, -1.7704F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(77, 86).addBox(-0.5F, -6.6522F, -0.0114F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4213F, -5.8697F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(15, 66).addBox(-1.0F, 0.0F, 2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 15).addBox(-2.5F, -5.3966F, 0.0332F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.9299F, -8.8184F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(97, 70).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, -0.017F, 0.3886F, -1.5163F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(24, 122).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.2116F, 0.3289F, -0.8843F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(122, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.3297F, 0.2102F, -0.4481F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(122, 14).mirror().addBox(-4.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, -0.0483F, 0.2916F, -1.6792F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(119, 94).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, 0.1272F, 0.2674F, -1.0616F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(122, 12).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, 0.2286F, 0.1888F, -0.6206F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(97, 70).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, -0.017F, -0.3886F, 1.5163F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(24, 122).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.2116F, -0.3289F, 0.8843F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(122, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.3297F, -0.2102F, 0.4481F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(122, 14).addBox(2.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, -0.0483F, -0.2916F, 1.6792F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(119, 94).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, 0.1272F, -0.2674F, 1.0616F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(122, 12).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, 0.2286F, -0.1888F, 0.6206F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, -0.0273F, -0.0899F, -0.0845F));

		PartDefinition cube_r197 = body2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(20, 96).addBox(0.0F, -6.2122F, -1.0627F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0807F, -1.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(44, 98).addBox(0.0F, -5.9617F, 0.1386F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -9.195F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(49, 98).addBox(0.0F, -6.0867F, 0.0386F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -6.0951F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(122, 52).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.4327F, 0.198F, -0.3728F));

		PartDefinition cube_r201 = body2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(122, 42).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.3145F, 0.3597F, -0.7951F));

		PartDefinition cube_r202 = body2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(84, 13).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0485F, 0.471F, -1.4345F));

		PartDefinition cube_r203 = body2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(27, 12).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0988F, 0.4967F, -1.3374F));

		PartDefinition cube_r204 = body2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(119, 88).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.369F, 0.3539F, -0.7023F));

		PartDefinition cube_r205 = body2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(118, 111).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.4779F, 0.172F, -0.2907F));

		PartDefinition cube_r206 = body2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(120, 98).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.477F, 0.1749F, -0.3257F));

		PartDefinition cube_r207 = body2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(120, 96).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.3669F, 0.3563F, -0.7378F));

		PartDefinition cube_r208 = body2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(65, 46).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0954F, 0.4974F, -1.3738F));

		PartDefinition cube_r209 = body2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(122, 52).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.4327F, -0.198F, 0.3728F));

		PartDefinition cube_r210 = body2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(25, 15).addBox(-2.5F, -3.8283F, -4.8351F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.6692F, -3.2399F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r211 = body2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(122, 42).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.3145F, -0.3597F, 0.7951F));

		PartDefinition cube_r212 = body2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(84, 13).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0485F, -0.471F, 1.4345F));

		PartDefinition cube_r213 = body2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(27, 12).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0988F, -0.4967F, 1.3374F));

		PartDefinition cube_r214 = body2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(119, 88).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.369F, -0.3539F, 0.7023F));

		PartDefinition cube_r215 = body2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(118, 111).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.4779F, -0.172F, 0.2907F));

		PartDefinition cube_r216 = body2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(120, 98).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.477F, -0.1749F, 0.3257F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(120, 96).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.3669F, -0.3563F, 0.7378F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(65, 46).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0954F, -0.4974F, 1.3738F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0088F, -8.9481F, 0.1263F, -0.0812F, -0.0541F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(64, 92).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.0391F, -2.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(19, 106).addBox(0.0F, -6.1525F, -1.1399F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7172F, -0.8517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(47, 112).addBox(0.0F, -5.9967F, -0.0424F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -3.9368F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(67, 30).addBox(-3.4872F, -0.7794F, -1.9816F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 10.7298F, -8.0946F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(69, 16).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.075F, 0.3539F, -1.3713F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(120, 117).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.2632F, 0.2506F, -0.758F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(120, 115).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.3422F, 0.1185F, -0.3345F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(120, 113).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -5.3368F, 0.3137F, 0.0974F, -0.3028F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(120, 104).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -5.3368F, 0.2455F, 0.2197F, -0.7273F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(65, 44).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -5.3368F, 0.0789F, 0.3187F, -1.3352F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(120, 102).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.2789F, 0.0953F, -0.3212F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(120, 100).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.2142F, 0.2035F, -0.749F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(50, 20).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.0622F, 0.2879F, -1.3553F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(48, 35).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -1.5368F, 0.0685F, 0.323F, -1.2994F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(119, 92).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -1.5368F, 0.2398F, 0.2288F, -0.6895F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(119, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -1.5368F, 0.3123F, 0.108F, -0.2638F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(69, 18).mirror().addBox(-4.7815F, -0.4397F, -0.4054F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4119F, 10.1588F, -8.822F, -0.7025F, 1.1791F, 0.6823F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(-6.5696F, -0.2414F, -0.1276F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3485F, 10.2909F, -7.8921F, -0.7817F, 1.1451F, -0.0401F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(65, 42).mirror().addBox(-8.8056F, -0.0247F, -0.44F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5955F, 10.6757F, -7.9836F, -0.256F, 1.2147F, -0.1442F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(69, 16).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.075F, -0.3539F, 1.3713F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(120, 117).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.2632F, -0.2506F, 0.758F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(120, 115).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.3422F, -0.1185F, 0.3345F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(22, 106).addBox(0.0F, -5.6927F, -0.1837F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -7.7368F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(120, 113).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -5.3368F, 0.3137F, -0.0974F, 0.3028F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(120, 104).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -5.3368F, 0.2455F, -0.2197F, 0.7273F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(65, 44).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -5.3368F, 0.0789F, -0.3187F, 1.3352F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(120, 102).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.2789F, -0.0953F, 0.3212F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(120, 100).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.2142F, -0.2035F, 0.749F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(50, 20).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.0622F, -0.2879F, 1.3553F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(48, 35).addBox(2.6881F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -1.5368F, 0.0685F, -0.323F, 1.2994F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(119, 92).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -1.5368F, 0.2398F, -0.2288F, 0.6895F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 26).addBox(-3.0F, -4.7465F, -6.7348F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.1828F, -1.2135F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(119, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -1.5368F, 0.3123F, -0.108F, 0.2638F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(44, 112).addBox(0.0F, -6.0926F, -0.1837F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -5.7368F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(69, 18).addBox(-0.2185F, -0.4397F, -0.4054F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4119F, 10.1588F, -8.822F, -0.7025F, -1.1791F, -0.6823F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(50, 22).addBox(-0.4304F, -0.2414F, -0.1276F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3485F, 10.2909F, -7.8921F, -0.7817F, -1.1451F, 0.0401F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(65, 42).addBox(-0.1944F, -0.0247F, -0.44F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5955F, 10.6757F, -7.9836F, -0.256F, -1.2147F, 0.1442F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(30, 69).addBox(-2.4872F, -0.9439F, -3.9947F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 9.8298F, -9.7946F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(55, 60).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.0609F, -3.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5377F, 3.8697F, -5.4002F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r258 = bone2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(84, 7).addBox(-0.5F, -0.8F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1686F, -4.0175F, -0.0452F, 0.8422F, -0.0165F, -0.0058F));

		PartDefinition cube_r259 = bone2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(127, 103).addBox(-0.5F, -0.9F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(127, 47).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1489F, -5.5317F, 0.619F, 0.0044F, -0.0165F, -0.0058F));

		PartDefinition cube_r260 = bone2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(71, 72).addBox(-0.048F, -1.0197F, 0.2856F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2453F, -1.7543F, -1.7017F, 1.0428F, -0.0011F, -0.0174F));

		PartDefinition cube_r261 = bone2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(29, 117).addBox(-0.9745F, 0.9351F, -0.829F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6983F, -0.7359F, -3.1758F, -0.0767F, 0.1876F, 0.319F));

		PartDefinition cube_r262 = bone2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(34, 117).addBox(-0.9745F, -0.7425F, -3.5566F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6983F, -0.7359F, -3.1758F, 0.7523F, 0.1876F, 0.319F));

		PartDefinition cube_r263 = bone2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(112, 127).addBox(-0.9745F, 0.6368F, -2.6041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6983F, -0.7359F, -3.1758F, 0.2287F, 0.1876F, 0.319F));

		PartDefinition cube_r264 = bone2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(127, 113).addBox(-0.9745F, 0.9501F, -2.6525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 127).addBox(-0.9745F, 0.1501F, -1.9525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6983F, -0.7359F, -3.1758F, 0.4905F, 0.1876F, 0.319F));

		PartDefinition cube_r265 = bone2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(7, 111).addBox(-0.0467F, -1.0293F, -1.6167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2453F, -1.7543F, -1.7017F, 0.9686F, 0.0014F, -0.0174F));

		PartDefinition cube_r266 = bone2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(113, 31).addBox(-0.9745F, -0.4016F, -1.9298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6983F, -0.7359F, -3.1758F, 1.0141F, 0.1876F, 0.319F));

		PartDefinition cube_r267 = bone2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(55, 90).addBox(-1.0F, -0.375F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7819F, 3.2781F, -4.2873F, -0.9171F, 0.5549F, 0.6721F));

		PartDefinition cube_r268 = bone2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(9, 90).addBox(-1.0F, -0.675F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7819F, 3.2781F, -4.2873F, -0.3935F, 0.5549F, 0.6721F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5377F, 3.8697F, -5.4002F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r269 = bone5.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(84, 7).mirror().addBox(-0.5F, -0.8F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, -4.0175F, -0.0452F, 0.8422F, 0.0165F, 0.0058F));

		PartDefinition cube_r270 = bone5.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(127, 103).mirror().addBox(-0.5F, -0.9F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(127, 47).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1489F, -5.5317F, 0.619F, 0.0044F, 0.0165F, 0.0058F));

		PartDefinition cube_r271 = bone5.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(71, 72).mirror().addBox(-0.952F, -1.0197F, 0.2856F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2453F, -1.7543F, -1.7017F, 1.0428F, 0.0011F, 0.0174F));

		PartDefinition cube_r272 = bone5.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(29, 117).mirror().addBox(-0.0255F, 0.9351F, -0.829F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6983F, -0.7359F, -3.1758F, -0.0767F, -0.1876F, -0.319F));

		PartDefinition cube_r273 = bone5.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(34, 117).mirror().addBox(-0.0255F, -0.7425F, -3.5566F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6983F, -0.7359F, -3.1758F, 0.7523F, -0.1876F, -0.319F));

		PartDefinition cube_r274 = bone5.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(112, 127).mirror().addBox(-0.0255F, 0.6368F, -2.6041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6983F, -0.7359F, -3.1758F, 0.2287F, -0.1876F, -0.319F));

		PartDefinition cube_r275 = bone5.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(127, 113).mirror().addBox(-0.0255F, 0.9501F, -2.6525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 127).mirror().addBox(-0.0255F, 0.1501F, -1.9525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6983F, -0.7359F, -3.1758F, 0.4905F, -0.1876F, -0.319F));

		PartDefinition cube_r276 = bone5.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(7, 111).mirror().addBox(-0.9533F, -1.0293F, -1.6167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2453F, -1.7543F, -1.7017F, 0.9686F, -0.0014F, 0.0174F));

		PartDefinition cube_r277 = bone5.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(113, 31).mirror().addBox(-0.0255F, -0.4016F, -1.9298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6983F, -0.7359F, -3.1758F, 1.0141F, -0.1876F, -0.319F));

		PartDefinition cube_r278 = bone5.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(55, 90).mirror().addBox(0.0F, -0.375F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7819F, 3.2781F, -4.2873F, -0.9171F, -0.5549F, -0.6721F));

		PartDefinition cube_r279 = bone5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(9, 90).mirror().addBox(0.0F, -0.675F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.7819F, 3.2781F, -4.2873F, -0.3935F, -0.5549F, -0.6721F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9631F, 8.7841F, -9.9543F, 0.3734F, -0.0085F, -1.098F));

		PartDefinition cube_r280 = leftArm1.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(113, 35).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0477F, -0.3832F, 1.0677F, -0.7581F, -0.7676F, 0.1498F));

		PartDefinition cube_r281 = leftArm1.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(85, 129).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.023F, -1.0492F, 0.1714F, 0.3763F, -0.7676F, 0.1498F));

		PartDefinition cube_r282 = leftArm1.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(117, 49).addBox(-0.5F, -1.7F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.2782F, -0.7676F, 0.1498F));

		PartDefinition cube_r283 = leftArm1.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(117, 39).addBox(-0.5F, -1.7F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.1473F, -0.7676F, 0.1498F));

		PartDefinition cube_r284 = leftArm1.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(35, 113).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r285 = leftArm1.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(80, 123).addBox(6.0F, -1.0842F, 0.1338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r286 = leftArm1.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(130, 22).addBox(-0.5F, 0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(0, 131).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftArm1.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(130, 109).addBox(-0.5F, 0.55F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 130).addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftArm1.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(85, 122).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, 1.8087F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftArm1.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(123, 74).addBox(-0.5F, -1.9F, 0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.2943F, 0.6372F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(93, 109).addBox(-0.8F, -0.4307F, 0.1266F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 117).addBox(-0.8F, 0.5693F, -0.9734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2749F, 6.1941F, 0.9655F, -0.9937F, -0.6463F, 0.6831F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.095F, 3.6959F, 0.9017F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r290 = leftHand.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 76).addBox(0.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftHand.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(80, 97).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.7941F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9631F, 8.7841F, -9.9543F, -0.5789F, -0.0967F, 0.9245F));

		PartDefinition cube_r292 = rightArm1.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(113, 63).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0477F, -0.3832F, 1.0677F, -0.7581F, 0.7676F, -0.1498F));

		PartDefinition cube_r293 = rightArm1.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(130, 5).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.023F, -1.0492F, 0.1714F, 0.3763F, 0.7676F, -0.1498F));

		PartDefinition cube_r294 = rightArm1.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(70, 117).addBox(-0.5F, -1.7F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.2782F, 0.7676F, -0.1498F));

		PartDefinition cube_r295 = rightArm1.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(65, 117).addBox(-0.5F, -1.7F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.1473F, 0.7676F, -0.1498F));

		PartDefinition cube_r296 = rightArm1.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(113, 59).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r297 = rightArm1.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(117, 123).addBox(-7.0F, -1.0842F, 0.1338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r298 = rightArm1.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(130, 25).addBox(-0.5F, 0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(25, 131).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightArm1.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(111, 130).addBox(-0.5F, 0.55F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 131).addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightArm1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(94, 122).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, 1.8087F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightArm1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(112, 123).addBox(-0.5F, -1.9F, 0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.2943F, 0.6372F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(14, 110).addBox(-0.2F, -0.4307F, 0.1266F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 117).addBox(-0.2F, 0.5693F, -0.9734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2749F, 6.1941F, 0.9655F, -0.7167F, 0.7098F, -0.4167F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.095F, 3.6959F, 0.9017F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r302 = rightHand.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(76, 48).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightHand.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(87, 97).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.5322F, 0.0079F, 0.0429F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0302F, -8.7672F, -0.3853F, -0.0809F, 0.0328F));

		PartDefinition cube_r304 = neck1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(11, 119).addBox(0.0F, -3.9459F, -0.016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3256F, -2.8971F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r305 = neck1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(50, 112).addBox(0.0F, -5.1459F, -0.016F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -0.8666F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r306 = neck1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(122, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.851F, 0.385F, -0.4493F));

		PartDefinition cube_r307 = neck1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(122, 38).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.6586F, 0.6879F, -0.8182F));

		PartDefinition cube_r308 = neck1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(107, 87).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.0604F, 0.9121F, -1.6256F));

		PartDefinition cube_r309 = neck1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(121, 66).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.7759F, 0.2831F, -0.3022F));

		PartDefinition cube_r310 = neck1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(120, 119).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.622F, 0.5673F, -0.668F));

		PartDefinition cube_r311 = neck1.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.1547F, 0.8042F, -1.3824F));

		PartDefinition cube_r312 = neck1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(107, 87).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.0604F, -0.9121F, 1.6256F));

		PartDefinition cube_r313 = neck1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(122, 38).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.6586F, -0.6879F, 0.8182F));

		PartDefinition cube_r314 = neck1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(122, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.851F, -0.385F, 0.4493F));

		PartDefinition cube_r315 = neck1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(121, 66).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.7759F, -0.2831F, 0.3022F));

		PartDefinition cube_r316 = neck1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(120, 119).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.622F, -0.5673F, 0.668F));

		PartDefinition cube_r317 = neck1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(73, 34).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.1547F, -0.8042F, 1.3824F));

		PartDefinition cube_r318 = neck1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(112, 117).addBox(0.0F, -2.9816F, -0.0991F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -1.7163F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r320 = neck2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -1.5629F, -0.0839F, 0.5361F, -1.5427F));

		PartDefinition cube_r321 = neck2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(121, 68).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -1.5629F, 0.174F, 0.516F, -1.0373F));

		PartDefinition cube_r322 = neck2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(73, 20).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -1.5629F, -0.0839F, -0.5361F, 1.5427F));

		PartDefinition cube_r323 = neck2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(121, 68).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -1.5629F, 0.174F, -0.516F, 1.0373F));

		PartDefinition cube_r324 = neck2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(30, 93).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3605F, -2.3471F, -0.1703F, -0.1364F, -0.0205F));

		PartDefinition cube_r325 = neck5.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(94, 15).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r326 = neck5.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(121, 72).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, -0.2355F, 0.9121F, -1.6439F));

		PartDefinition cube_r327 = neck5.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(121, 70).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, 0.3314F, 0.89F, -0.9325F));

		PartDefinition cube_r328 = neck5.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(123, 64).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1653F, -0.9743F, 0.2025F, 0.7593F, -1.0274F));

		PartDefinition cube_r329 = neck5.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(123, 0).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1653F, -0.9743F, -0.2198F, 0.7554F, -1.6322F));

		PartDefinition cube_r330 = neck5.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(121, 72).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, -0.2355F, -0.9121F, 1.6439F));

		PartDefinition cube_r331 = neck5.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(121, 70).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, 0.3314F, -0.89F, 0.9325F));

		PartDefinition cube_r332 = neck5.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(123, 64).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1653F, -0.9743F, 0.2025F, -0.7593F, 1.0274F));

		PartDefinition cube_r333 = neck5.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(123, 0).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1653F, -0.9743F, -0.2198F, -0.7554F, 1.6322F));

		PartDefinition cube_r334 = neck5.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(51, 127).addBox(0.0F, -2.9566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r335 = neck5.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(77, 129).addBox(0.0F, -2.4566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, 0.096F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r336 = neck4.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(109, 4).mirror().addBox(-2.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1499F, 1.0891F, -1.5603F));

		PartDefinition cube_r337 = neck4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(121, 81).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.5977F, 0.9835F, -0.706F));

		PartDefinition cube_r338 = neck4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(-2.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r339 = neck4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(118, 79).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r340 = neck4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(109, 4).addBox(1.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1499F, -1.0891F, 1.5603F));

		PartDefinition cube_r341 = neck4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(121, 81).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.5977F, -0.9835F, 0.706F));

		PartDefinition cube_r342 = neck4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(30, 91).addBox(1.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r343 = neck4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(118, 79).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r344 = neck4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(86, 42).addBox(0.0F, -1.9677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r345 = neck4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(35, 82).addBox(0.0F, -1.9677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(82, 0).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7757F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r347 = neck3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(120, 121).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r348 = neck3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(121, 83).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.416F, 0.6757F, -1.0136F));

		PartDefinition cube_r349 = neck3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(120, 121).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r350 = neck3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(121, 83).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.416F, -0.6757F, 1.0136F));

		PartDefinition cube_r351 = neck3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(133, 68).addBox(0.5F, -0.7458F, -1.1223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6168F, -1.9379F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r352 = neck3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(132, 99).addBox(0.5F, -1.469F, -0.9772F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3795F, -0.4528F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r353 = neck3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(55, 83).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7216F, -3.4653F, -0.4059F, -0.1901F, -0.1068F));

		PartDefinition cube_r354 = neck.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(122, 3).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.8154F, 0.9709F, -0.7645F));

		PartDefinition cube_r355 = neck.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(133, 72).addBox(0.5F, -1.2207F, -0.1014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r356 = neck.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(96, 90).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r357 = neck.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(122, 3).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.8154F, -0.9709F, 0.7645F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.1645F, -0.0955F, -0.1585F));

		PartDefinition cube_r358 = neck6.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(122, 5).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.6767F, 0.8813F, -0.8756F));

		PartDefinition cube_r359 = neck6.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(133, 81).addBox(0.5F, -1.3207F, -0.3013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7433F, -2.7066F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r360 = neck6.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(54, 127).addBox(0.5F, -0.6207F, 3.7987F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.074F, -4.6686F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r361 = neck6.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(55, 97).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r362 = neck6.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(122, 5).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.6767F, -0.8813F, 0.8756F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2222F, -2.6726F, 0.1326F, -0.1241F, -0.0374F));

		PartDefinition cube_r363 = neck7.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(31, 122).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.6594F, 0.8679F, -0.8888F));

		PartDefinition cube_r364 = neck7.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(80, 133).addBox(0.5F, -0.3207F, 2.7986F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.074F, -4.6685F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r365 = neck7.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(96, 96).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r366 = neck7.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(31, 122).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.6594F, -0.8679F, 0.8888F));

		PartDefinition head = neck7.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3431F, -2.7268F, 0.0055F, -0.0937F, 0.0271F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(127, 100).addBox(-0.5F, -0.996F, -0.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.3973F, -15.3754F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(37, 126).addBox(-0.5F, -0.996F, 0.0119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4531F, -15.095F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(127, 97).addBox(-0.5F, 0.2597F, -0.6901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.7723F, -14.9754F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(128, 84).addBox(-0.5F, 0.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(128, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7813F, -1.5241F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(127, 94).addBox(-0.5F, -0.6949F, -1.4649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1717F, -0.9315F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(111, 77).addBox(-0.5F, 0.1793F, -1.0136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1717F, -0.9315F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(26, 75).addBox(-0.5F, -1.7F, -4.65F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.0F, 6.1834F, -10.4011F, 0.5315F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -2.275F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.4514F, -4.8129F, 0.4006F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(56, 69).addBox(-1.0F, -2.075F, -3.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.1402F, -1.8291F, 0.1039F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(80, 127).addBox(-0.5F, -0.4587F, -0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1717F, -0.9315F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(84, 30).addBox(-1.4404F, 0.0F, -4.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9404F, 3.8182F, -11.6363F, 0.6394F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(131, 90).addBox(-1.4404F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 6.7674F, -15.6107F, -0.2856F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(131, 87).addBox(-1.4404F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9404F, 6.2781F, -15.2634F, 0.9536F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(42, 131).addBox(-1.4404F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 5.8348F, -14.8591F, 0.8314F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(87, 84).addBox(-1.4404F, -0.2F, -3.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9404F, 3.8546F, -11.8826F, 0.587F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(7, 101).addBox(-1.4404F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 2.2313F, -9.8516F, 0.6743F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(126, 131).addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.916F, -3.0997F, 1.9571F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(95, 131).addBox(-1.0F, -0.45F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5F, -1.5191F, -3.8518F, 0.9099F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(86, 114).addBox(-1.4404F, -0.7F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, -0.5748F, -4.7674F, 0.6481F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(114, 81).addBox(-1.4404F, -0.7F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9404F, 0.3288F, -6.0878F, 0.6001F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(101, 41).addBox(-1.4404F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 1.2991F, -8.5513F, 0.5652F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(114, 71).addBox(-1.4404F, -0.45F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 87).addBox(-1.4404F, 0.0F, -3.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9404F, 1.546F, -8.4665F, 0.6219F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(60, 112).addBox(-0.9404F, 0.0F, -3.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(63, 103).addBox(-1.4404F, 0.0F, -1.975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -0.6111F, -5.098F, 0.5696F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(90, 52).addBox(-1.9404F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -1.5696F, -3.3427F, 0.4998F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(103, 57).addBox(-2.4404F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9404F, -1.7122F, -2.4034F, -0.1809F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(54, 103).addBox(-2.4404F, 0.025F, -1.775F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9404F, -1.857F, -1.6163F, 0.1507F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(90, 47).addBox(-2.5F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 0.9137F, -1.2601F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(95, 6).addBox(-2.5F, -0.45F, -0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 1.096F, -0.4249F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(82, 79).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5038F, -0.237F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(95, 27).addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2738F, -1.1619F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(90, 42).addBox(-1.5F, 0.0F, -1.975F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.4933F, -1.441F, 0.733F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-1.599F, 0.3098F, -6.7129F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(90, 126).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.1846F, -1.1948F, 6.4031F, 1.3769F, 1.0023F, -1.1591F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(115, 4).addBox(-1.1733F, 0.8314F, -1.7462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 0.0726F, 0.1047F, -0.0175F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(7, 115).addBox(-1.1261F, -1.3086F, -1.0662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -0.4309F, 0.1008F, 0.0041F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(106, 25).addBox(-0.925F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.0282F, -0.9565F, 1.7011F, 0.5734F, 0.0996F, 0.0297F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(66, 86).addBox(-1.1703F, -2.0202F, -6.0458F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.6044F, 0.0511F, 0.0566F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(56, 76).addBox(-0.4F, -0.5F, -2.475F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8099F, 4.1762F, -4.9095F, 0.6224F, 0.0655F, 0.0665F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(67, 113).addBox(-1.0761F, 0.7045F, 0.3375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -0.9545F, 0.1008F, 0.0041F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(94, 21).addBox(-1.0987F, -1.4971F, -2.2021F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 1.3502F, 0.1047F, -0.0175F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(129, 16).addBox(-1.0987F, -2.1568F, 2.7016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 2.1356F, 0.1047F, -0.0175F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(117, 127).addBox(-1.0987F, 1.7714F, 1.7218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -3.0568F, 0.1047F, -0.0175F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(127, 116).addBox(-1.0987F, 1.4993F, -2.1428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -1.7914F, 0.1047F, -0.0175F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(57, 130).addBox(-1.0987F, -0.3254F, -2.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -1.0496F, 0.1047F, -0.0175F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(119, 18).addBox(-1.0987F, -1.9759F, -0.0609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 0.8266F, 0.1047F, -0.0175F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(85, 58).addBox(-1.0987F, -2.1082F, -3.6491F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(127, 119).addBox(-1.0987F, 1.3215F, -3.6142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 0.0848F, 0.1047F, -0.0175F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(125, 110).addBox(-1.0987F, 1.1847F, -1.7524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 0.4775F, 0.1047F, -0.0175F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(127, 122).addBox(-0.929F, -2.2787F, -2.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 0.0412F, 0.1047F, -0.0175F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(131, 131).addBox(-0.929F, 0.1695F, 1.8046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 2.6766F, 0.1047F, -0.0175F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(118, 75).addBox(-0.929F, -1.8747F, 1.8304F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 2.5021F, 0.1047F, -0.0175F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(123, 106).addBox(-0.929F, -2.077F, 2.1736F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 2.8686F, 0.1047F, -0.0175F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(65, 122).addBox(-0.9443F, -1.7576F, 0.6476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -2.7877F, 0.1127F, -0.0285F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(117, 13).addBox(-0.9268F, -2.0254F, 0.1385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 2.8422F, 0.1057F, -0.0194F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(80, 130).addBox(-0.9268F, -0.0444F, 0.4772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(130, 78).addBox(-0.9268F, -0.7444F, 0.4772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -2.6119F, 0.1057F, -0.0194F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(15, 131).addBox(-0.9268F, -0.335F, 0.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -2.0534F, 0.1057F, -0.0194F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(5, 127).addBox(-0.9268F, -0.7282F, 0.3479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 2.275F, 0.1057F, -0.0194F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(10, 131).addBox(-0.929F, -1.466F, 0.1041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 1.8738F, 0.1047F, -0.0175F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(19, 128).addBox(-0.929F, -1.7552F, -1.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(10, 128).addBox(-0.929F, -1.7552F, -1.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 1.0884F, 0.1047F, -0.0175F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(129, 53).addBox(-0.929F, -1.9872F, -1.5833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 1.3327F, 0.1047F, -0.0175F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(126, 91).addBox(-0.929F, -2.2625F, -1.8333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 1.5596F, 0.1047F, -0.0175F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(11, 125).addBox(-0.8028F, 0.2614F, -1.3537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(107, 124).addBox(-0.8028F, 0.5614F, -1.3537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -1.1195F, 0.1047F, -0.0175F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(125, 7).addBox(-0.8028F, 0.5805F, 1.031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -2.5157F, 0.1047F, -0.0175F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(123, 85).addBox(-0.8028F, -2.5991F, 0.739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 2.2839F, 0.1047F, -0.0175F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(30, 66).addBox(-0.8028F, -2.1402F, -2.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.8877F, 0.1047F, -0.0175F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(125, 25).addBox(-0.8028F, 2.4223F, -2.4709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -0.5609F, 0.1047F, -0.0175F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(85, 126).addBox(-0.8028F, 3.0813F, -2.5277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -0.5435F, 0.1047F, -0.0175F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(125, 44).addBox(-0.6529F, 1.5889F, -8.6077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(125, 34).addBox(-0.6529F, 1.5889F, -8.5077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(125, 31).addBox(-0.6529F, 1.5889F, -8.1077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.1895F, 0.1047F, -0.0175F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(128, 69).addBox(-0.6529F, 6.9394F, -2.0235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -0.91F, 0.1047F, -0.0175F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(128, 66).addBox(-0.6529F, 6.1061F, -3.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -0.7006F, 0.1047F, -0.0175F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(128, 61).addBox(-0.6529F, 6.6477F, 0.0784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(42, 128).addBox(-0.6529F, 6.8477F, 0.0784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -1.2242F, 0.1047F, -0.0175F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(128, 72).addBox(-0.6529F, 1.2901F, 7.9857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(128, 58).addBox(-0.6529F, 1.2901F, 7.6107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -2.4983F, 0.1047F, -0.0175F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(32, 128).addBox(-0.7529F, 7.3572F, -0.2172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -1.1718F, 0.1047F, -0.0175F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(130, 43).addBox(-0.8028F, 3.0142F, 1.0249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -1.3987F, 0.1047F, -0.0175F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(27, 128).addBox(-0.8028F, -0.553F, 2.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, -2.5506F, 0.1047F, -0.0175F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(122, 123).addBox(-0.8028F, -3.049F, 0.8703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(115, 102).addBox(-0.8028F, -3.049F, 0.6703F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 2.5719F, 0.1047F, -0.0175F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(0, 128).addBox(-0.929F, -2.697F, 0.0495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 2.5719F, 0.1047F, -0.0175F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(122, 48).addBox(-0.929F, -2.1774F, 0.7045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(38, 122).addBox(-0.929F, -0.9774F, 2.5045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -3.1353F, 0.1047F, -0.0175F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(129, 37).addBox(-0.929F, 2.3145F, -2.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -1.3725F, 0.1047F, -0.0175F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(127, 125).addBox(-0.929F, -0.219F, -3.8401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -0.5348F, 0.1047F, -0.0175F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(129, 50).addBox(-0.879F, -2.1263F, -2.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(129, 40).addBox(-1.054F, -2.1263F, -2.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 127).addBox(-0.929F, -2.4763F, -3.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, 0.1285F, 0.1047F, -0.0175F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(95, 72).addBox(-0.9725F, -1.75F, -6.0721F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.5822F, 0.1047F, -0.0175F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(86, 66).addBox(-0.9725F, -1.818F, -3.0408F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(95, 78).addBox(-0.9725F, -1.8443F, -9.0016F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F))
				.texOffs(128, 75).addBox(-0.9725F, -0.6009F, -12.0291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.5997F, 0.1047F, -0.0175F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(14, 121).addBox(-0.9725F, -1.3706F, -1.0953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(87, 90).addBox(-0.9725F, -0.3706F, -3.0453F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.0848F, 0.1047F, -0.0175F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(39, 117).addBox(-0.9725F, -11.9256F, 1.2267F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 2.2141F, 0.1047F, -0.0175F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(37, 129).addBox(-0.9751F, -10.9254F, 5.9824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 2.6414F, 0.106F, -0.0199F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(72, 129).addBox(-0.9751F, -12.8277F, 1.2767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(129, 19).addBox(-0.9751F, -12.8277F, 1.1267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 2.2487F, 0.106F, -0.0199F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(122, 127).addBox(-0.9725F, -12.0742F, 0.3068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 2.1792F, 0.1047F, -0.0175F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(90, 129).addBox(-0.9725F, -10.5578F, -4.3913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 1.7429F, 0.1047F, -0.0175F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(50, 132).addBox(-0.9725F, 0.3233F, -10.4493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(5, 130).addBox(-0.9725F, -0.4766F, -9.7993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(102, 124).addBox(-0.9725F, 0.3233F, -12.7993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 18).addBox(-0.9725F, 0.4733F, -10.3993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 130).addBox(-0.9725F, 1.1233F, -4.7993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 132).addBox(-0.9725F, 1.1233F, -5.5993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(19, 124).addBox(-0.9725F, 0.1233F, -6.3993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 54).addBox(-0.9725F, 0.3233F, -7.1993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(43, 124).addBox(-0.9725F, 0.3233F, -7.9993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(32, 124).addBox(-0.9725F, 0.2734F, -8.7993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(27, 124).addBox(-0.9725F, 0.3483F, -9.5993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 46).addBox(-0.9725F, 0.3233F, -9.7243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(99, 10).addBox(-0.9725F, 0.3233F, -8.7993F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.4775F, 0.1047F, -0.0175F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(75, 122).addBox(-1.0225F, 2.8839F, -12.8071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.2594F, 0.1047F, -0.0175F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(120, 26).addBox(-0.9725F, 2.6096F, -10.507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.2332F, 0.1047F, -0.0175F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(93, 0).addBox(-0.9725F, -0.0747F, -5.7615F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2439F, 0.6273F, 2.8888F, 0.3728F, 0.1047F, -0.0175F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(65, 107).addBox(-1.0987F, 0.7572F, -2.2664F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7439F, 0.6273F, 6.3888F, -0.0897F, 0.1047F, -0.0175F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(1.599F, 0.3098F, -6.7129F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(90, 126).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.1846F, -1.1948F, 6.4031F, 1.3769F, -1.0023F, 1.1591F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(115, 4).mirror().addBox(0.1733F, 0.8314F, -1.7462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 0.0726F, -0.1047F, 0.0175F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(7, 115).mirror().addBox(0.1261F, -1.3086F, -1.0662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -0.4309F, -0.1008F, -0.0041F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(106, 25).mirror().addBox(-0.075F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.0282F, -0.9565F, 1.7011F, 0.5734F, -0.0996F, -0.0297F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(66, 86).mirror().addBox(0.1703F, -2.0202F, -6.0458F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.6044F, -0.0511F, -0.0566F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(56, 76).mirror().addBox(-0.6F, -0.5F, -2.475F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8099F, 4.1762F, -4.9095F, 0.6224F, -0.0655F, -0.0665F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(67, 113).mirror().addBox(0.0761F, 0.7045F, 0.3375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -0.9545F, -0.1008F, -0.0041F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(94, 21).mirror().addBox(0.0987F, -1.4971F, -2.2021F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 1.3502F, -0.1047F, 0.0175F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(129, 16).mirror().addBox(0.0987F, -2.1568F, 2.7016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 2.1356F, -0.1047F, 0.0175F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(117, 127).mirror().addBox(0.0987F, 1.7714F, 1.7218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -3.0568F, -0.1047F, 0.0175F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(127, 116).mirror().addBox(0.0987F, 1.4993F, -2.1428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -1.7914F, -0.1047F, 0.0175F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(57, 130).mirror().addBox(0.0987F, -0.3254F, -2.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -1.0496F, -0.1047F, 0.0175F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(119, 18).mirror().addBox(0.0987F, -1.9759F, -0.0609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 0.8266F, -0.1047F, 0.0175F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(0.0987F, -2.1082F, -3.6491F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 119).mirror().addBox(0.0987F, 1.3215F, -3.6142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 0.0848F, -0.1047F, 0.0175F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(125, 110).mirror().addBox(0.0987F, 1.1847F, -1.7524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 0.4775F, -0.1047F, 0.0175F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(127, 122).mirror().addBox(-0.071F, -2.2787F, -2.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 0.0412F, -0.1047F, 0.0175F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(131, 131).mirror().addBox(-0.071F, 0.1695F, 1.8046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 2.6766F, -0.1047F, 0.0175F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(118, 75).mirror().addBox(-0.071F, -1.8747F, 1.8304F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 2.5021F, -0.1047F, 0.0175F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(123, 106).mirror().addBox(-0.071F, -2.077F, 2.1736F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 2.8686F, -0.1047F, 0.0175F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(65, 122).mirror().addBox(-0.0557F, -1.7576F, 0.6476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -2.7877F, -0.1127F, 0.0285F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(117, 13).mirror().addBox(-0.0732F, -2.0254F, 0.1385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 2.8422F, -0.1057F, 0.0194F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(80, 130).mirror().addBox(-0.0732F, -0.0444F, 0.4772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(130, 78).mirror().addBox(-0.0732F, -0.7444F, 0.4772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -2.6119F, -0.1057F, 0.0194F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(15, 131).mirror().addBox(-0.0732F, -0.335F, 0.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -2.0534F, -0.1057F, 0.0194F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(5, 127).mirror().addBox(-0.0732F, -0.7282F, 0.3479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 2.275F, -0.1057F, 0.0194F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(10, 131).mirror().addBox(-0.071F, -1.466F, 0.1041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 1.8738F, -0.1047F, 0.0175F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(19, 128).mirror().addBox(-0.071F, -1.7552F, -1.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(10, 128).mirror().addBox(-0.071F, -1.7552F, -1.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 1.0884F, -0.1047F, 0.0175F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(129, 53).mirror().addBox(-0.071F, -1.9872F, -1.5833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 1.3327F, -0.1047F, 0.0175F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(126, 91).mirror().addBox(-0.071F, -2.2625F, -1.8333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 1.5596F, -0.1047F, 0.0175F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(11, 125).mirror().addBox(-0.1972F, 0.2614F, -1.3537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(107, 124).mirror().addBox(-0.1972F, 0.5614F, -1.3537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -1.1195F, -0.1047F, 0.0175F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(125, 7).mirror().addBox(-0.1972F, 0.5805F, 1.031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -2.5157F, -0.1047F, 0.0175F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(123, 85).mirror().addBox(-0.1972F, -2.5991F, 0.739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 2.2839F, -0.1047F, 0.0175F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(30, 66).mirror().addBox(-0.1972F, -2.1402F, -2.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.8877F, -0.1047F, 0.0175F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(125, 25).mirror().addBox(-0.1972F, 2.4223F, -2.4709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -0.5609F, -0.1047F, 0.0175F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(85, 126).mirror().addBox(-0.1972F, 3.0813F, -2.5277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -0.5435F, -0.1047F, 0.0175F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(125, 44).mirror().addBox(-0.3471F, 1.5889F, -8.6077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(125, 34).mirror().addBox(-0.3471F, 1.5889F, -8.5077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(125, 31).mirror().addBox(-0.3471F, 1.5889F, -8.1077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.1895F, -0.1047F, 0.0175F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(128, 69).mirror().addBox(-0.3471F, 6.9394F, -2.0235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -0.91F, -0.1047F, 0.0175F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(128, 66).mirror().addBox(-0.3471F, 6.1061F, -3.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -0.7006F, -0.1047F, 0.0175F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(128, 61).mirror().addBox(-0.3471F, 6.6477F, 0.0784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 128).mirror().addBox(-0.3471F, 6.8477F, 0.0784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -1.2242F, -0.1047F, 0.0175F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(128, 72).mirror().addBox(-0.3471F, 1.2901F, 7.9857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(128, 58).mirror().addBox(-0.3471F, 1.2901F, 7.6107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -2.4983F, -0.1047F, 0.0175F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(32, 128).mirror().addBox(-0.2471F, 7.3572F, -0.2172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -1.1718F, -0.1047F, 0.0175F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(130, 43).mirror().addBox(-0.1972F, 3.0142F, 1.0249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -1.3987F, -0.1047F, 0.0175F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(27, 128).mirror().addBox(-0.1972F, -0.553F, 2.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, -2.5506F, -0.1047F, 0.0175F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(122, 123).mirror().addBox(-0.1972F, -3.049F, 0.8703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(115, 102).mirror().addBox(-0.1972F, -3.049F, 0.6703F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 2.5719F, -0.1047F, 0.0175F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(0, 128).mirror().addBox(-0.071F, -2.697F, 0.0495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 2.5719F, -0.1047F, 0.0175F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(122, 48).mirror().addBox(-0.071F, -2.1774F, 0.7045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(38, 122).mirror().addBox(-0.071F, -0.9774F, 2.5045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -3.1353F, -0.1047F, 0.0175F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(129, 37).mirror().addBox(-0.071F, 2.3145F, -2.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -1.3725F, -0.1047F, 0.0175F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(127, 125).mirror().addBox(-0.071F, -0.219F, -3.8401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -0.5348F, -0.1047F, 0.0175F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(129, 50).mirror().addBox(-0.121F, -2.1263F, -2.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(129, 40).mirror().addBox(0.054F, -2.1263F, -2.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 127).mirror().addBox(-0.071F, -2.4763F, -3.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, 0.1285F, -0.1047F, 0.0175F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(95, 72).mirror().addBox(-0.0275F, -1.75F, -6.0721F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.5822F, -0.1047F, 0.0175F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(86, 66).mirror().addBox(-0.0275F, -1.818F, -3.0408F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(95, 78).mirror().addBox(-0.0275F, -1.8443F, -9.0016F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(128, 75).mirror().addBox(-0.0275F, -0.6009F, -12.0291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.5997F, -0.1047F, 0.0175F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(14, 121).mirror().addBox(-0.0275F, -1.3706F, -1.0953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(87, 90).mirror().addBox(-0.0275F, -0.3706F, -3.0453F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.0848F, -0.1047F, 0.0175F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(39, 117).mirror().addBox(-0.0275F, -11.9256F, 1.2267F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 2.2141F, -0.1047F, 0.0175F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(37, 129).mirror().addBox(-0.0249F, -10.9254F, 5.9824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 2.6414F, -0.106F, 0.0199F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(72, 129).mirror().addBox(-0.0249F, -12.8277F, 1.2767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(129, 19).mirror().addBox(-0.0249F, -12.8277F, 1.1267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 2.2487F, -0.106F, 0.0199F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(122, 127).mirror().addBox(-0.0275F, -12.0742F, 0.3068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 2.1792F, -0.1047F, 0.0175F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(90, 129).mirror().addBox(-0.0275F, -10.5578F, -4.3913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 1.7429F, -0.1047F, 0.0175F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(50, 132).mirror().addBox(-0.0275F, 0.3233F, -10.4493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(5, 130).mirror().addBox(-0.0275F, -0.4766F, -9.7993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(102, 124).mirror().addBox(-0.0275F, 0.3233F, -12.7993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 18).mirror().addBox(-0.0275F, 0.4733F, -10.3993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 130).mirror().addBox(-0.0275F, 1.1233F, -4.7993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 132).mirror().addBox(-0.0275F, 1.1233F, -5.5993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(19, 124).mirror().addBox(-0.0275F, 0.1233F, -6.3993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 54).mirror().addBox(-0.0275F, 0.3233F, -7.1993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(43, 124).mirror().addBox(-0.0275F, 0.3233F, -7.9993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(32, 124).mirror().addBox(-0.0275F, 0.2734F, -8.7993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 124).mirror().addBox(-0.0275F, 0.3483F, -9.5993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 46).mirror().addBox(-0.0275F, 0.3233F, -9.7243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(99, 10).mirror().addBox(-0.0275F, 0.3233F, -8.7993F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.4775F, -0.1047F, 0.0175F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(75, 122).mirror().addBox(0.0225F, 2.8839F, -12.8071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.2594F, -0.1047F, 0.0175F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(120, 26).mirror().addBox(-0.0275F, 2.6096F, -10.507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.2332F, -0.1047F, 0.0175F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.0275F, -0.0747F, -5.7615F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2439F, 0.6273F, 2.8888F, 0.3728F, -0.1047F, 0.0175F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(65, 107).mirror().addBox(0.0987F, 0.7572F, -2.2664F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 0.6273F, 6.3888F, -0.0897F, -0.1047F, 0.0175F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4221F, -0.3622F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(113, 27).mirror().addBox(-0.9496F, 1.4352F, 4.5519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7278F, -3.4233F, 0.5411F, -0.0349F, 0.0F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(98, 84).mirror().addBox(-0.9496F, -0.314F, 2.3317F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7278F, -3.4233F, 0.192F, -0.0349F, 0.0F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(64, 98).mirror().addBox(-0.1684F, -0.8F, -0.1879F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7278F, -3.4233F, 0.0F, -0.3316F, 0.0F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(75, 126).mirror().addBox(-0.5F, 0.5912F, -13.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.0262F, -0.0873F, 0.0F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.5F, 1.6125F, -11.9979F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 89).mirror().addBox(-0.5F, 0.6375F, -10.0479F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.0611F, -0.0873F, 0.0F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(112, 89).mirror().addBox(-0.5F, 2.0301F, -7.9752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.1134F, -0.0873F, 0.0F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(120, 34).mirror().addBox(-0.5F, 0.8438F, -6.1523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(120, 30).mirror().addBox(-0.5F, 0.8438F, -5.5773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.0785F, -0.0873F, 0.0F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(81, 104).mirror().addBox(-0.5F, 0.432F, -4.8304F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.0087F, -0.0873F, 0.0F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(53, 112).mirror().addBox(-0.5F, 0.7551F, -3.3297F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.2269F, -0.0873F, 0.0F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(130, 31).mirror().addBox(-0.5F, 1.1754F, -1.4939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0154F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.6545F, -0.0873F, 0.0F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(98, 128).mirror().addBox(-0.5F, 1.1811F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0148F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.1658F, -0.0873F, 0.0F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(128, 106).mirror().addBox(-0.5F, -0.416F, 0.6521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -2.3911F, -0.0873F, 0.0F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(70, 126).mirror().addBox(-0.5F, 0.5445F, 0.5579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -1.1257F, -0.0873F, 0.0F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(130, 28).mirror().addBox(-0.5F, 1.1974F, -0.0698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.4276F, -0.0873F, 0.0F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(65, 126).mirror().addBox(-0.5F, 1.1144F, -1.6233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.0349F, -0.0873F, 0.0F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(127, 128).mirror().addBox(-0.5F, -0.6712F, -14.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.1265F, -0.0873F, 0.0F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(132, 96).mirror().addBox(-0.5F, -1.4027F, -13.9761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.1789F, -0.0873F, 0.0F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(125, 78).mirror().addBox(-0.5F, -5.8343F, 13.5256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 2.8842F, -0.0873F, 0.0F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(116, 130).mirror().addBox(-0.5F, 9.6623F, 11.3017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -2.3518F, -0.0873F, 0.0F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(125, 28).mirror().addBox(-0.5F, 14.5435F, -0.2287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -1.5228F, -0.0873F, 0.0F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(129, 2).mirror().addBox(-0.5F, 4.292F, -13.9171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.2662F, -0.0873F, 0.0F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(130, 34).mirror().addBox(-0.5F, 0.7694F, -13.8598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.0044F, -0.0873F, 0.0F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(132, 93).mirror().addBox(-0.5F, -1.7158F, -12.9708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.1876F, -0.0873F, 0.0F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(112, 93).mirror().addBox(-0.5F, -2.5485F, -11.8952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.2574F, -0.0873F, 0.0F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(129, 13).mirror().addBox(-0.5F, -9.0237F, -14.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.6109F, -0.0873F, 0.0F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(70, 122).mirror().addBox(-0.5F, -3.8064F, -15.6402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.2182F, -0.0873F, 0.0F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(44, 120).mirror().addBox(-0.5F, -0.4826F, -15.048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.0087F, -0.0873F, 0.0F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(129, 10).mirror().addBox(-0.5F, 1.9445F, -14.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.1309F, -0.0873F, 0.0F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(90, 132).mirror().addBox(-0.5F, -1.6499F, -13.4123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 124).mirror().addBox(-0.5F, -2.0388F, -11.0052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.1309F, -0.0873F, 0.0F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(85, 132).mirror().addBox(-0.5F, -1.8617F, -12.6245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.1396F, -0.0873F, 0.0F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(119, 54).mirror().addBox(-0.5F, -2.3554F, -11.7769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(108, 11).mirror().addBox(-0.5F, -1.6336F, -10.1324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.1658F, -0.0873F, 0.0F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(72, 132).mirror().addBox(-0.5F, -1.045F, -10.2656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 132).mirror().addBox(-0.5F, -1.045F, -9.4656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(104, 72).mirror().addBox(-0.5F, -0.9153F, -8.2893F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.0785F, -0.0873F, 0.0F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(36, 132).mirror().addBox(-0.625F, -3.7518F, -4.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.8988F, -0.0873F, 0.0F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(113, 23).mirror().addBox(-0.625F, -0.2304F, -6.9512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(62, 129).mirror().addBox(-0.625F, 0.0696F, -5.9512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(108, 104).mirror().addBox(-0.5F, -1.1351F, -6.3251F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.1134F, -0.0873F, 0.0F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(67, 129).mirror().addBox(-0.625F, 2.1021F, -6.0151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.2531F, -0.0873F, 0.0F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(7, 106).mirror().addBox(-0.5F, 0.4062F, -4.4362F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.2356F, -0.0873F, 0.0F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(112, 19).mirror().addBox(-0.5F, 0.6572F, -2.4253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, -0.3403F, -0.0873F, 0.0F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(112, 55).mirror().addBox(-0.5F, 0.1791F, -3.6906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4204F, -0.4521F, 1.3718F, 0.1178F, -0.0873F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(112, 55).addBox(-0.5F, 0.1791F, -3.6906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.1178F, 0.0873F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(113, 27).addBox(-0.0504F, 1.4352F, 4.5519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.7278F, -3.4233F, 0.5411F, 0.0349F, 0.0F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(98, 84).addBox(-0.0504F, -0.314F, 2.3317F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.7278F, -3.4233F, 0.192F, 0.0349F, 0.0F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(64, 98).addBox(-0.8316F, -0.8F, -0.1879F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.7278F, -3.4233F, 0.0F, 0.3316F, 0.0F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(75, 126).addBox(-0.5F, 0.5912F, -13.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.0262F, 0.0873F, 0.0F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(0, 113).addBox(-0.5F, 1.6125F, -11.9979F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(105, 89).addBox(-0.5F, 0.6375F, -10.0479F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.0611F, 0.0873F, 0.0F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(112, 89).addBox(-0.5F, 2.0301F, -7.9752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.1134F, 0.0873F, 0.0F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(120, 34).addBox(-0.5F, 0.8438F, -6.1523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(120, 30).addBox(-0.5F, 0.8438F, -5.5773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.0785F, 0.0873F, 0.0F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(81, 104).addBox(-0.5F, 0.432F, -4.8304F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.0087F, 0.0873F, 0.0F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(53, 112).addBox(-0.5F, 0.7551F, -3.3297F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.2269F, 0.0873F, 0.0F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(130, 31).addBox(-0.5F, 1.1754F, -1.4939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0154F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.6545F, 0.0873F, 0.0F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(98, 128).addBox(-0.5F, 1.1811F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0148F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.1658F, 0.0873F, 0.0F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(128, 106).addBox(-0.5F, -0.416F, 0.6521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -2.3911F, 0.0873F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(70, 126).addBox(-0.5F, 0.5445F, 0.5579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -1.1257F, 0.0873F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(130, 28).addBox(-0.5F, 1.1974F, -0.0698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.4276F, 0.0873F, 0.0F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(65, 126).addBox(-0.5F, 1.1144F, -1.6233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.0349F, 0.0873F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(127, 128).addBox(-0.5F, -0.6712F, -14.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.1265F, 0.0873F, 0.0F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(132, 96).addBox(-0.5F, -1.4027F, -13.9761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.1789F, 0.0873F, 0.0F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(125, 78).addBox(-0.5F, -5.8343F, 13.5256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 2.8842F, 0.0873F, 0.0F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(116, 130).addBox(-0.5F, 9.6623F, 11.3017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -2.3518F, 0.0873F, 0.0F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(125, 28).addBox(-0.5F, 14.5435F, -0.2287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -1.5228F, 0.0873F, 0.0F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(129, 2).addBox(-0.5F, 4.292F, -13.9171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.2662F, 0.0873F, 0.0F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(130, 34).addBox(-0.5F, 0.7694F, -13.8598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.0044F, 0.0873F, 0.0F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(132, 93).addBox(-0.5F, -1.7158F, -12.9708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.1876F, 0.0873F, 0.0F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(112, 93).addBox(-0.5F, -2.5485F, -11.8952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.2574F, 0.0873F, 0.0F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(129, 13).addBox(-0.5F, -9.0237F, -14.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.6109F, 0.0873F, 0.0F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(70, 122).addBox(-0.5F, -3.8064F, -15.6402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.2182F, 0.0873F, 0.0F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(44, 120).addBox(-0.5F, -0.4826F, -15.048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.0087F, 0.0873F, 0.0F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(129, 10).addBox(-0.5F, 1.9445F, -14.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.1309F, 0.0873F, 0.0F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(90, 132).addBox(-0.5F, -1.6499F, -13.4123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 124).addBox(-0.5F, -2.0388F, -11.0052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.1309F, 0.0873F, 0.0F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(85, 132).addBox(-0.5F, -1.8617F, -12.6245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.1396F, 0.0873F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(119, 54).addBox(-0.5F, -2.3554F, -11.7769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 11).addBox(-0.5F, -1.6336F, -10.1324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.1658F, 0.0873F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(72, 132).addBox(-0.5F, -1.045F, -10.2656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(67, 132).addBox(-0.5F, -1.045F, -9.4656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.0436F, 0.0873F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(104, 72).addBox(-0.5F, -0.9153F, -8.2893F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.0785F, 0.0873F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(36, 132).addBox(-0.375F, -3.7518F, -4.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.8988F, 0.0873F, 0.0F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(113, 23).addBox(-0.375F, -0.2304F, -6.9512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(62, 129).addBox(-0.375F, 0.0696F, -5.9512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(108, 104).addBox(-0.5F, -1.1351F, -6.3251F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, 0.1134F, 0.0873F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(67, 129).addBox(-0.375F, 2.1021F, -6.0151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.2531F, 0.0873F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(7, 106).addBox(-0.5F, 0.4062F, -4.4362F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.2356F, 0.0873F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(112, 19).addBox(-0.5F, 0.6572F, -2.4253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4204F, -0.4521F, 1.3718F, -0.3403F, 0.0873F, 0.0F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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