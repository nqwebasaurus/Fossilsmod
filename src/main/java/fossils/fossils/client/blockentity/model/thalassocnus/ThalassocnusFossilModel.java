package fossils.fossils.client.blockentity.model.thalassocnus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThalassocnusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body5;
	private final ModelPart body2;
	private final ModelPart body;
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
	private final ModelPart tail9;
	private final ModelPart tail3;
	private final ModelPart tail10;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public ThalassocnusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body5 = this.body3.getChild("body5");
		this.body2 = this.body5.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body6 = this.body.getChild("body6");
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
		this.tail9 = this.tail2.getChild("tail9");
		this.tail3 = this.tail9.getChild("tail3");
		this.tail10 = this.tail3.getChild("tail10");
		this.tail4 = this.tail10.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.3F, 15.0F, 0.4385F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 121).addBox(-0.5F, -0.3153F, 8.183F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-0.5F, -0.6153F, -1.817F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0477F, -0.9844F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(81, 99).addBox(-0.5F, -4.0153F, -1.017F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5404F, -5.4903F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(136, 85).mirror().addBox(0.4F, -0.5F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 133).mirror().addBox(0.4F, -0.5F, 1.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 133).mirror().addBox(0.4F, -0.5F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3707F, -1.5031F, -4.1508F, 0.0517F, 0.5239F, 1.6703F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(116, 128).mirror().addBox(0.6F, -0.5F, -0.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3711F, -2.5706F, -5.9145F, -0.0841F, 0.2973F, 1.6582F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(136, 85).addBox(-0.4F, -0.5F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 133).addBox(-0.4F, -0.5F, 1.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 133).addBox(-0.4F, -0.5F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3707F, -1.5031F, -4.1508F, 0.0517F, -0.5239F, -1.6703F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(116, 128).addBox(-0.6F, -0.5F, -0.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3711F, -2.5706F, -5.9145F, -0.0841F, -0.2973F, -1.6582F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.2057F, 0.0747F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.277F, 6.3211F, -1.8342F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(61, 83).addBox(-2.2301F, 1.9243F, -4.3254F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0223F, -8.3843F, 0.8023F, -0.3624F, -0.4796F, -0.0525F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 91).addBox(-2.2301F, -0.4757F, -2.5254F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0223F, -8.3843F, 0.8023F, -0.7114F, -0.4796F, -0.0525F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 98).addBox(-0.9495F, -0.0477F, -2.0634F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.505F, -10.3147F, -1.1636F, -0.6131F, -0.4684F, -0.0552F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 90).addBox(-2.0804F, -0.4722F, -2.9389F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.505F, -10.3147F, -1.1636F, -0.736F, -1.0784F, 0.3995F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(85, 83).addBox(-3.5002F, -2.8457F, -7.152F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.17F, -10.1147F, -0.0636F, -0.3117F, -1.2691F, 0.7281F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(43, 90).addBox(-3.5002F, -7.022F, -6.2112F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.17F, -10.1147F, -0.0636F, 0.4563F, -1.2691F, 0.7281F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(72, 31).addBox(-3.5002F, -9.2959F, -3.0143F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.17F, -10.1147F, -0.0636F, 1.294F, -1.2691F, 0.7281F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(122, 96).addBox(-1.1F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2255F, 1.3145F, 1.2343F, 0.0151F, 0.6213F, 0.2503F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(107, 42).addBox(-0.55F, -0.075F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4408F, -0.7457F, 3.1623F, 0.0123F, -0.0768F, 0.2406F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(36, 90).addBox(-0.55F, -2.375F, -1.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5474F, -3.5674F, -0.5742F, 0.7105F, -0.0768F, 0.2406F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(51, 53).addBox(-1.3145F, -6.9102F, -3.7371F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6191F, -3.3049F, 5.3138F, 0.8614F, -0.547F, -0.2289F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(20, 90).addBox(-1.0852F, 0.0672F, -2.9429F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9395F, -3.2984F, 5.3713F, 0.1748F, -0.5389F, -0.1969F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 107).addBox(-0.6131F, 0.0051F, -0.0545F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.315F, 0.6119F, 3.3492F, -0.0541F, -0.5447F, 0.353F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(36, 104).addBox(-0.6131F, 0.0051F, -2.0545F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9395F, 0.6015F, 5.8713F, -0.185F, -0.5447F, 0.353F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(114, 81).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.4494F, 5.3164F, 5.052F, -1.1421F, -0.4195F, 0.5146F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(83, 32).addBox(-0.8158F, -0.2404F, 0.0972F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F))
				.texOffs(96, 27).addBox(-0.8158F, 0.2596F, 0.0972F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3571F, 3.8286F, 0.1173F, 1.4991F, 0.3456F, 0.407F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(18, 133).addBox(-0.9889F, -2.1033F, 0.3614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 130).addBox(-0.9889F, -2.1033F, -0.2386F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.6395F, 5.6015F, 0.6713F, 0.2879F, 0.278F, 0.3441F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 106).addBox(0.5727F, 4.3954F, -4.3805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(105, 83).addBox(0.5727F, 5.0954F, -4.3805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9395F, 0.3015F, 5.8713F, -0.1641F, 0.089F, 0.343F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(116, 77).addBox(0.0853F, 3.6248F, -1.3966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9395F, 0.6015F, 5.8713F, -0.444F, -0.4195F, 0.5146F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.277F, 6.3211F, -1.8342F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(61, 83).mirror().addBox(1.2301F, 1.9243F, -4.3254F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0223F, -8.3843F, 0.8023F, -0.3624F, 0.4796F, 0.0525F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(61, 91).mirror().addBox(1.2301F, -0.4757F, -2.5254F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0223F, -8.3843F, 0.8023F, -0.7114F, 0.4796F, 0.0525F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(-0.0505F, -0.0477F, -2.0634F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.505F, -10.3147F, -1.1636F, -0.6131F, 0.4684F, 0.0552F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(29, 90).mirror().addBox(1.0804F, -0.4722F, -2.9389F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.505F, -10.3147F, -1.1636F, -0.736F, 1.0784F, -0.3995F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(2.5002F, -2.8457F, -7.152F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.17F, -10.1147F, -0.0636F, -0.3117F, 1.2691F, -0.7281F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(2.5002F, -7.022F, -6.2112F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.17F, -10.1147F, -0.0636F, 0.4563F, 1.2691F, -0.7281F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 31).mirror().addBox(2.5002F, -9.2959F, -3.0143F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.17F, -10.1147F, -0.0636F, 1.294F, 1.2691F, -0.7281F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(122, 96).mirror().addBox(0.1F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2255F, 1.3145F, 1.2343F, 0.0151F, -0.6213F, -0.2503F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(107, 42).mirror().addBox(-0.45F, -0.075F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4408F, -0.7457F, 3.1623F, 0.0123F, 0.0768F, -0.2406F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(36, 90).mirror().addBox(-0.45F, -2.375F, -1.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5474F, -3.5674F, -0.5742F, 0.7105F, 0.0768F, -0.2406F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(0.3145F, -6.9102F, -3.7371F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6191F, -3.3049F, 5.3138F, 0.8614F, 0.547F, 0.2289F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(0.0852F, 0.0672F, -2.9429F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9395F, -3.2984F, 5.3713F, 0.1748F, 0.5389F, 0.1969F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(78, 107).mirror().addBox(-0.3869F, 0.0051F, -0.0545F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.315F, 0.6119F, 3.3492F, -0.0541F, 0.5447F, -0.353F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(36, 104).mirror().addBox(-0.3869F, 0.0051F, -2.0545F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9395F, 0.6015F, 5.8713F, -0.185F, 0.5447F, -0.353F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(114, 81).mirror().addBox(-0.5F, 0.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.4494F, 5.3164F, 5.052F, -1.1421F, 0.4195F, -0.5146F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(83, 32).mirror().addBox(-0.1842F, -0.2404F, 0.0972F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(96, 27).mirror().addBox(-0.1842F, 0.2596F, 0.0972F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3571F, 3.8286F, 0.1173F, 1.4991F, -0.3456F, -0.407F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(18, 133).mirror().addBox(-0.0111F, -2.1033F, 0.3614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(123, 130).mirror().addBox(-0.0111F, -2.1033F, -0.2386F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.6395F, 5.6015F, 0.6713F, 0.2879F, -0.278F, -0.3441F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-1.5727F, 4.3954F, -4.3805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 83).mirror().addBox(-1.5727F, 5.0954F, -4.3805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9395F, 0.3015F, 5.8713F, -0.1641F, -0.089F, -0.343F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(116, 77).mirror().addBox(-1.0853F, 3.6248F, -1.3966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9395F, 0.6015F, 5.8713F, -0.444F, 0.4195F, -0.5146F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(41, 60).addBox(0.6886F, 3.5622F, -2.4669F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(88, 51).addBox(2.1886F, 3.5622F, -2.2669F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1349F, 7.0171F, 1.5445F, -0.0756F, -0.1726F, -0.1341F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(32, 111).addBox(-1.6F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1886F, 15.3171F, -2.2684F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(87, 18).addBox(-3.0F, -0.2F, -0.4F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3886F, 12.5551F, -2.1223F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(83, 39).addBox(-3.0F, -0.2F, -0.3F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3886F, 12.5551F, -2.1223F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(121, 12).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.4901F, 0.5578F, -1.7669F, 0.0F, 0.0F, 0.4189F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(114, 42).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.3506F, 2.5529F, -1.7669F, 0.0F, 0.0F, 0.0698F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(111, 18).addBox(-2.6544F, -1.5786F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0886F, 3.5622F, -1.7669F, 0.0F, 0.0F, 0.6807F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(98, 63).addBox(-1.5F, -1.35F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1886F, 1.1476F, -3.1909F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(59, 69).addBox(-2.5F, -4.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1886F, 3.5622F, -0.467F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(17, 46).addBox(-2.0F, -0.5F, 5.7F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7591F, 15.4939F, 1.6892F, 0.2383F, 0.0425F, 0.1238F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(85, 91).addBox(-5.285F, 1.4446F, 8.6921F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.985F, -0.4F, 1.694F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(69, 133).addBox(-1.0995F, -1.7143F, -0.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.485F, -0.4F, 1.694F, 1.1345F, 0.0262F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(64, 133).addBox(-1.0995F, -0.9007F, -1.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.485F, -0.4F, 1.694F, 0.2618F, 0.0262F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(121, 82).addBox(-1.0995F, -0.9138F, -1.9483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.485F, -0.4F, 1.694F, -0.4363F, 0.0262F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(133, 82).addBox(-1.0995F, 7.8945F, -8.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.485F, -0.4F, 1.694F, 2.33F, 0.0262F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(133, 79).addBox(-1.0995F, 9.965F, 2.1804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.485F, -0.4F, 1.694F, 1.3701F, 0.0262F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(74, 133).addBox(-1.0995F, 3.1104F, 8.987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.485F, -0.4F, 1.694F, 0.4102F, 0.0262F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(122, 113).addBox(-1.0995F, -3.628F, 9.5266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.485F, -0.4F, 1.694F, -0.288F, 0.0262F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0995F, -1.5037F, 4.8696F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.485F, -0.4F, 1.694F, -0.0698F, 0.0262F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(70, 44).addBox(-1.0995F, -0.8994F, 0.0104F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.485F, -0.4F, 1.694F, 0.0524F, 0.0262F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5F, 5.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(84, 0).addBox(-1.5F, -0.3F, -0.6F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5839F, -1.4433F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(72, 83).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.591F, -0.9237F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 89).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1514F, 1.7152F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(69, 0).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, 5.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(21, 18).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, 5.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(42, 28).addBox(0.0F, -0.525F, 4.1F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(96, 33).addBox(0.4F, -0.5F, 1.2F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(106, 107).addBox(0.1F, -3.3901F, 9.8811F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -3.2F, 12.4F, -1.7396F, -1.0849F, 0.1496F));

		PartDefinition cube_r70 = leftLeg3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(127, 94).addBox(-0.4F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.5099F, 11.3811F, 0.245F, 0.1205F, 0.2522F));

		PartDefinition cube_r71 = leftLeg3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(52, 77).addBox(-0.4F, -3.3F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5099F, 11.3811F, 0.2174F, -0.0189F, 0.0852F));

		PartDefinition cube_r72 = leftLeg3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(83, 45).addBox(0.5F, -1.275F, -0.3F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.675F, 9.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(69, 104).addBox(-0.3F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.5F, 0.2F, 0.0F, -0.2182F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(50, 65).addBox(-2.9497F, 3.2188F, 0.8018F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(13, 89).addBox(-4.4497F, 3.2188F, 1.0018F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.1349F, 5.3171F, -1.2805F, -0.4683F, 0.1726F, 0.1341F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(113, 111).addBox(-0.4F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.4497F, 14.9737F, 1.0003F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(89, 13).addBox(-1.0F, -0.2F, -0.4F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.6497F, 12.2117F, 1.1464F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(39, 84).addBox(-1.0F, -0.2F, -0.3F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6497F, 12.2117F, 1.1464F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(125, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-5.7512F, 0.2143F, 1.5018F, 0.0F, 0.0F, -0.4189F));

		PartDefinition cube_r78 = rightLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(114, 46).addBox(0.0F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-5.6117F, 2.2095F, 1.5018F, 0.0F, 0.0F, -0.0698F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(113, 107).addBox(-0.3456F, -1.5786F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.3497F, 3.2188F, 1.5018F, 0.0F, 0.0F, -0.6807F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(98, 78).addBox(-1.5F, -1.35F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.4497F, 0.8042F, 0.0778F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(13, 82).addBox(-1.5F, -4.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4497F, 3.2188F, 2.8018F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(17, 53).addBox(-1.0F, -0.5F, 5.7F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.0202F, 15.1505F, 4.9579F, -0.1981F, -0.0425F, -0.1238F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(96, 23).addBox(1.285F, 1.4446F, 8.6921F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.985F, -0.4F, 1.694F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(136, 49).addBox(0.0994F, -1.7143F, -0.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 1.694F, 1.1345F, -0.0262F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(136, 46).addBox(0.0994F, -0.9007F, -1.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 1.694F, 0.2618F, -0.0262F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(125, 32).addBox(0.0994F, -0.9138F, -1.9483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 1.694F, -0.4363F, -0.0262F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(136, 43).addBox(0.0994F, 7.8945F, -8.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 1.694F, 2.33F, -0.0262F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(136, 40).addBox(0.0994F, 9.965F, 2.1804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 1.694F, 1.3701F, -0.0262F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(18, 136).addBox(0.0994F, 3.1104F, 8.987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 1.694F, 0.4102F, -0.0262F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(125, 28).addBox(0.0994F, -3.628F, 9.5266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 1.694F, -0.288F, -0.0262F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(26, 83).addBox(0.0994F, -1.5037F, 4.8696F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 1.694F, -0.0698F, -0.0262F, 0.0F));

		PartDefinition cube_r91 = rightLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(83, 25).addBox(0.0994F, -0.8994F, 0.0104F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 1.694F, 0.0524F, -0.0262F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(34, 53).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.5F, 5.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(85, 71).addBox(-1.5F, -0.3F, -0.6F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5839F, -1.4433F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(85, 65).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.591F, -0.9237F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(72, 89).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1514F, 1.7152F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(13, 69).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 5.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(21, 27).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 5.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(38, 45).addBox(-3.0F, -0.525F, 4.1F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(96, 39).addBox(-2.4F, -0.5F, 1.2F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(109, 74).addBox(-1.1F, -3.3901F, 9.8811F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -3.2F, 12.4F, -1.7396F, 1.0849F, -0.1496F));

		PartDefinition cube_r98 = rightLeg3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(75, 128).addBox(-0.6F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.5099F, 11.3811F, 0.245F, -0.1205F, -0.2522F));

		PartDefinition cube_r99 = rightLeg3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(99, 110).addBox(-0.6F, -3.3F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.5099F, 11.3811F, 0.2174F, 0.0189F, -0.0852F));

		PartDefinition cube_r100 = rightLeg3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(85, 77).addBox(-3.5F, -1.275F, -0.3F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.675F, 9.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(60, 105).addBox(-0.7F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 0.5F, 0.2F, 0.0F, 0.2182F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2544F, -6.6999F, 0.0F, 0.0436F, -0.0019F));

		PartDefinition cube_r102 = body4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(60, 118).addBox(-1.0F, -4.07F, -0.227F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1089F, -1.3385F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(7, 122).addBox(-1.0F, -3.37F, 0.073F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7243F, -5.3349F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(117, 96).addBox(-1.0F, -3.77F, 2.073F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7243F, -5.3349F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(82, 136).mirror().addBox(-3.0027F, 1.9235F, -0.5581F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7233F, -2.2267F, -4.7331F, -0.0329F, 0.0462F, 0.2451F));

		PartDefinition cube_r106 = body4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(79, 136).mirror().addBox(-1.7482F, 1.108F, -0.5581F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7233F, -2.2267F, -4.7331F, -0.0074F, 0.0563F, 0.7343F));

		PartDefinition cube_r107 = body4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(76, 136).mirror().addBox(-0.1783F, 0.074F, -0.5116F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7233F, -2.2267F, -4.7331F, 0.0186F, 0.0322F, 1.6568F));

		PartDefinition cube_r108 = body4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(87, 128).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0513F, -0.9007F, -1.2061F, -0.11F, 0.2851F, 1.568F));

		PartDefinition cube_r109 = body4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(80, 131).mirror().addBox(0.2F, -0.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2622F, -1.6979F, -3.0619F, -0.0408F, 0.2859F, 1.6589F));

		PartDefinition cube_r110 = body4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(76, 136).addBox(0.1783F, 0.074F, -0.5116F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7233F, -2.2267F, -4.7331F, 0.0186F, -0.0322F, -1.6568F));

		PartDefinition cube_r111 = body4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(79, 136).addBox(1.7482F, 1.108F, -0.5581F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7233F, -2.2267F, -4.7331F, -0.0074F, -0.0563F, -0.7343F));

		PartDefinition cube_r112 = body4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(82, 136).addBox(3.0027F, 1.9235F, -0.5581F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7233F, -2.2267F, -4.7331F, -0.0329F, -0.0462F, -0.2451F));

		PartDefinition cube_r113 = body4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(42, 10).addBox(-1.0F, -0.07F, 0.073F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.7243F, -5.3349F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(87, 128).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0513F, -0.9007F, -1.2061F, -0.11F, -0.2851F, -1.568F));

		PartDefinition cube_r115 = body4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(80, 131).addBox(-0.2F, -0.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2622F, -1.6979F, -3.0619F, -0.0408F, -0.2859F, -1.6589F));

		PartDefinition cube_r116 = body4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(14, 116).addBox(-1.5F, -1.4602F, 3.0964F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 59).addBox(-1.5F, -1.0061F, 5.0442F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7243F, -12.1349F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -2.43F, -5.2721F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(32, 115).addBox(-1.5F, -0.6061F, 0.0442F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.0943F, -5.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(19, 122).addBox(-1.0F, -3.2406F, -0.2547F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.4413F, -3.7432F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(79, 118).addBox(-1.0F, -3.6061F, -0.2558F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.163F, -1.7627F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(123, 125).addBox(-1.0F, -2.9061F, -0.0558F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -1.0943F, -5.8627F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(136, 73).mirror().addBox(-0.0925F, 1.0702F, -0.5274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8467F, -0.8968F, -1.461F, -0.0003F, -0.1852F, 1.6582F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(30, 118).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8467F, -0.8968F, -1.461F, 0.1547F, -0.09F, 0.7316F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(16, 100).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8467F, -0.8968F, -1.461F, 0.1786F, -0.0073F, 0.2492F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(73, 136).mirror().addBox(-0.0925F, 1.0702F, -0.5274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3467F, -1.1968F, -3.461F, -0.0003F, -0.1852F, 1.6582F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(84, 118).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3467F, -1.1968F, -3.461F, 0.1547F, -0.09F, 0.7316F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(88, 115).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3467F, -1.1968F, -3.461F, 0.1786F, -0.0073F, 0.2492F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(119, 132).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -1.4968F, -5.261F, 0.0013F, -0.1678F, 1.6579F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(118, 8).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -1.4968F, -5.261F, 0.1416F, -0.0783F, 0.7327F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(57, 111).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -1.4968F, -5.261F, 0.1617F, -0.003F, 0.2493F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(57, 111).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4968F, -5.261F, 0.1617F, 0.003F, -0.2493F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(118, 8).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4968F, -5.261F, 0.1416F, 0.0783F, -0.7327F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(119, 132).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4968F, -5.261F, 0.0013F, 0.1678F, -1.6579F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(88, 115).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1968F, -3.461F, 0.1786F, 0.0073F, -0.2492F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(84, 118).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1968F, -3.461F, 0.1547F, 0.09F, -0.7316F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(73, 136).addBox(0.0925F, 1.0702F, -0.5274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1968F, -3.461F, -0.0003F, 0.1852F, -1.6582F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(16, 100).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8968F, -1.461F, 0.1786F, 0.0073F, -0.2492F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(30, 118).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8968F, -1.461F, 0.1547F, 0.09F, -0.7316F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(136, 73).addBox(0.0925F, 1.0702F, -0.5274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8968F, -1.461F, -0.0003F, 0.1852F, -1.6582F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, 0.0939F, -0.0558F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body5 = body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.2411F, -6.9487F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(43, 98).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.0557F, -2.4123F, 0.2401F, 0.0221F, 0.2485F));

		PartDefinition cube_r141 = body5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(65, 118).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.0557F, -2.4123F, 0.2231F, -0.0923F, 0.7242F));

		PartDefinition cube_r142 = body5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(83, 131).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.0557F, -2.4123F, 0.0398F, -0.2409F, 1.6486F));

		PartDefinition cube_r143 = body5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(64, 136).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.2557F, -0.3123F, -0.0018F, -0.2026F, 1.6585F));

		PartDefinition cube_r144 = body5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(49, 98).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.2557F, -0.3123F, 0.1677F, -0.1017F, 0.7303F));

		PartDefinition cube_r145 = body5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(88, 99).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.2557F, -0.3123F, 0.1955F, -0.0116F, 0.2491F));

		PartDefinition cube_r146 = body5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(83, 131).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.0557F, -2.4123F, -0.005F, 0.2373F, -1.6592F));

		PartDefinition cube_r147 = body5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(65, 118).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.0557F, -2.4123F, 0.1939F, 0.1249F, -0.7274F));

		PartDefinition cube_r148 = body5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(43, 98).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.0557F, -2.4123F, 0.2294F, 0.0202F, -0.2485F));

		PartDefinition cube_r149 = body5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(88, 99).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.2557F, -0.3123F, 0.1955F, 0.0116F, -0.2491F));

		PartDefinition cube_r150 = body5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(72, 76).addBox(-1.0F, -1.0F, -3.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(116, 36).addBox(-1.5F, -1.6F, -2.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 115).addBox(-1.5F, -1.6F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(24, 122).addBox(-1.0F, -3.4014F, 0.0678F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8407F, -2.9843F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(128, 80).addBox(-1.0F, -3.1014F, -0.0322F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8896F, -0.8308F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(64, 136).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.2557F, -0.3123F, -0.0018F, 0.2026F, -1.6585F));

		PartDefinition cube_r154 = body5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(49, 98).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.2557F, -0.3123F, 0.1677F, 0.1017F, -0.7303F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, -3.8751F, 0.1136F, 0.0434F, 0.0049F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(53, 122).addBox(-1.0F, -3.1874F, -0.3422F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5071F, -4.6216F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(48, 122).addBox(-1.0F, -3.2874F, -0.2422F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5212F, -2.8723F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(113, 118).addBox(-1.0F, -3.3874F, -0.1422F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -0.9027F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(115, 50).addBox(-1.5F, -2.0F, -6.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 33).addBox(-1.5F, -2.0F, -10.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 30).addBox(-1.5F, -2.0F, -8.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 5.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(133, 0).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.854F, -4.4372F, 0.0058F, -0.1156F, 1.6573F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(33, 118).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.854F, -4.4372F, 0.1027F, -0.0433F, 0.735F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(46, 98).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.854F, -4.4372F, 0.111F, 0.0099F, 0.2491F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 133).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.154F, -2.4372F, 0.0043F, -0.133F, 1.6575F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(123, 42).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.154F, -2.4372F, 0.1157F, -0.055F, 0.7344F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.154F, -2.4372F, 0.1279F, 0.0056F, 0.2493F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(136, 64).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.154F, -0.5372F, 0.0013F, -0.1678F, 1.6579F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(122, 105).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.154F, -0.5372F, 0.1416F, -0.0783F, 0.7327F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(57, 93).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.154F, -0.5372F, 0.1617F, -0.003F, 0.2493F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(57, 93).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.154F, -0.5372F, 0.1617F, 0.003F, -0.2493F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(122, 105).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.154F, -0.5372F, 0.1416F, 0.0783F, -0.7327F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(136, 64).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.154F, -0.5372F, 0.0013F, 0.1678F, -1.6579F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(98, 0).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.154F, -2.4372F, 0.1279F, -0.0056F, -0.2493F));

		PartDefinition cube_r172 = body2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(123, 42).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.154F, -2.4372F, 0.1157F, 0.055F, -0.7344F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 133).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.154F, -2.4372F, 0.0043F, 0.133F, -1.6575F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(46, 98).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.854F, -4.4372F, 0.111F, -0.0099F, -0.2491F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(33, 118).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.854F, -4.4372F, 0.1027F, 0.0433F, -0.735F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(133, 0).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.854F, -4.4372F, 0.0058F, 0.1156F, -1.6573F));

		PartDefinition cube_r177 = body2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, -1.0F, -8.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1989F, -5.0852F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(122, 53).addBox(-1.0F, -3.1015F, -0.2561F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8395F, -3.4547F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(14, 119).addBox(-1.0F, -3.1765F, 0.0189F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2136F, -1.8212F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(116, 27).addBox(-1.5F, -1.0401F, -4.1382F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 115).addBox(-1.5F, -1.0401F, -2.1382F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 69).addBox(-1.0F, -0.0401F, -4.1382F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(6, 133).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.445F, -3.252F, -0.0098F, -0.2895F, 1.6605F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(39, 118).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.445F, -3.252F, 0.2335F, -0.1596F, 0.7218F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(76, 114).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.445F, -3.252F, 0.2802F, -0.0331F, 0.2472F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(3, 133).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.155F, -1.352F, -0.0082F, -0.2721F, 1.66F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(36, 118).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.155F, -1.352F, 0.2203F, -0.1481F, 0.7238F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(91, 99).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.155F, -1.352F, 0.2632F, -0.0288F, 0.2477F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(91, 99).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.155F, -1.352F, 0.2632F, 0.0288F, -0.2477F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(36, 118).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.155F, -1.352F, 0.2203F, 0.1481F, -0.7238F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(3, 133).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.155F, -1.352F, -0.0082F, 0.2721F, -1.66F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(76, 114).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.445F, -3.252F, 0.2802F, 0.0331F, -0.2472F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(39, 118).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.445F, -3.252F, 0.2335F, 0.1596F, -0.7218F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(6, 133).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.445F, -3.252F, -0.0098F, 0.2895F, -1.6605F));

		PartDefinition body6 = body.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9F, -3.4F));

		PartDefinition cube_r193 = body6.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(133, 8).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.755F, -1.652F, -0.0098F, -0.2895F, 1.6605F));

		PartDefinition cube_r194 = body6.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(42, 118).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.755F, -1.652F, 0.2335F, -0.1596F, 0.7218F));

		PartDefinition cube_r195 = body6.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(91, 115).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.755F, -1.652F, 0.2802F, -0.0331F, 0.2472F));

		PartDefinition cube_r196 = body6.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(91, 115).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4233F, -0.755F, -1.652F, 0.2802F, 0.0331F, -0.2472F));

		PartDefinition cube_r197 = body6.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(42, 118).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4233F, -0.755F, -1.652F, 0.2335F, 0.1596F, -0.7218F));

		PartDefinition cube_r198 = body6.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(133, 8).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4233F, -0.755F, -1.652F, -0.0098F, 0.2895F, -1.6605F));

		PartDefinition cube_r199 = body6.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(95, 57).addBox(-1.0F, -0.0401F, -7.1382F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(79, 115).addBox(-1.5F, -1.0401F, -6.1382F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 3.6F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body6.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(118, 118).addBox(-1.0F, -2.8636F, 0.0067F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2696F, -2.1448F, 0.0262F, 0.0F, 0.0F));

		PartDefinition chest = body6.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2035F, -2.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(127, 52).addBox(-1.0F, -2.6653F, -0.587F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0064F, -2.3457F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(39, 126).addBox(-1.0F, -2.8653F, -0.087F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4338F, -0.9738F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 13).addBox(-2.0F, -3.2F, -1.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(59, 24).addBox(-1.0F, -3.2F, 1.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.3773F, -6.2914F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(116, 39).addBox(-1.5F, -1.9F, -4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 115).addBox(-1.5F, -1.9F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 77).addBox(-1.0F, -0.9F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, 1.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(12, 133).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, 0.6415F, -2.452F, -0.0208F, -0.4025F, 1.6642F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(123, 74).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, 0.6415F, -2.452F, 0.321F, -0.2339F, 0.7046F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(34, 46).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, 0.6415F, -2.452F, 0.3903F, -0.0606F, 0.242F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(9, 133).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.1585F, -0.652F, -0.0156F, -0.3503F, 1.6623F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(120, 124).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.1585F, -0.652F, 0.2803F, -0.1998F, 0.7134F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(123, 66).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.1585F, -0.652F, 0.3394F, -0.048F, 0.2448F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(123, 66).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -0.1585F, -0.652F, 0.3394F, 0.048F, -0.2448F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(120, 124).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -0.1585F, -0.652F, 0.2803F, 0.1998F, -0.7134F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(9, 133).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -0.1585F, -0.652F, -0.0156F, 0.3503F, -1.6623F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(34, 46).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, 0.6415F, -2.452F, 0.3903F, 0.0606F, -0.242F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(123, 74).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, 0.6415F, -2.452F, 0.321F, 0.2339F, -0.7046F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(12, 133).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, 0.6415F, -2.452F, -0.0208F, 0.4025F, -1.6642F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0851F, -3.6861F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r217 = chest2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(94, 127).addBox(-1.0F, -2.8644F, -0.5794F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4493F, -2.2815F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r218 = chest2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(34, 126).addBox(-1.0F, -2.8644F, -0.0795F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2546F, -0.8657F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r219 = chest2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(115, 102).addBox(-1.5F, -1.9F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 6).addBox(-1.0F, -0.9F, -9.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.9F, 4.8F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r220 = chest2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(15, 133).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5436F, -0.4659F, -0.0272F, -0.4633F, 1.6669F));

		PartDefinition cube_r221 = chest2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(45, 118).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5436F, -0.4659F, 0.3693F, -0.2732F, 0.6925F));

		PartDefinition cube_r222 = chest2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(90, 128).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5436F, -0.4659F, 0.4498F, -0.0751F, 0.238F));

		PartDefinition cube_r223 = chest2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(90, 128).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5436F, -0.4659F, 0.4498F, 0.0751F, -0.238F));

		PartDefinition cube_r224 = chest2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(45, 118).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5436F, -0.4659F, 0.3693F, 0.2732F, -0.6925F));

		PartDefinition cube_r225 = chest2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(15, 133).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5436F, -0.4659F, -0.0272F, 0.4633F, -1.6669F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0705F, -3.0326F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r226 = neck3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(111, 128).addBox(-0.5F, -1.1722F, 0.0299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r227 = neck3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -0.1F, 1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2195F, -2.6473F, -0.0732F, 0.3047F, -0.022F));

		PartDefinition cube_r228 = neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(78, 104).addBox(0.0F, -0.8F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8444F, -1.3313F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(85, 107).addBox(0.0F, -0.8861F, 0.0638F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.3F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r230 = neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(74, 18).addBox(-1.0F, -1.0F, -3.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9626F, -3.942F, -0.2707F, 0.2279F, 0.0319F));

		PartDefinition cube_r231 = neck.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(59, 31).addBox(-1.5F, -0.3F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9938F, -2.8749F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r232 = neck.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 116).addBox(-0.5F, -1.4134F, -1.2912F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.9F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r233 = neck.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(107, 37).addBox(-1.0F, -0.7258F, -2.5341F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6428F, -2.5474F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r234 = neck.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(127, 136).addBox(0.0F, -0.6361F, -2.0862F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9626F, 0.642F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, -0.2258F, 0.1409F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.9F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(125, 102).addBox(-0.5F, 8.5252F, -3.0914F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.85F, -3.6397F, -0.8681F, 0.3674F, -0.0235F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(52, 83).addBox(-0.5F, -5.0251F, 0.1043F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 7.6F, -4.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(128, 5).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 9.6216F, -4.699F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(127, 99).addBox(-0.5F, 0.2981F, 0.0123F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(127, 16).addBox(-0.5F, -0.1019F, 0.0123F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.3275F, -4.8018F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(14, 112).addBox(-0.5F, -0.0019F, 0.0123F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 7.3349F, -4.9236F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(112, 4).addBox(-0.5F, -0.0019F, 0.0123F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 6.3396F, -4.8278F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(112, 0).addBox(-0.5F, -0.0019F, 0.0123F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 5.542F, -4.8906F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(109, 8).addBox(-0.5F, -0.0019F, 0.0123F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.5439F, -4.8033F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(88, 62).addBox(0.0F, -0.0019F, 0.0123F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 2.5591F, -4.6297F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(81, 95).addBox(-2.5F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.4042F, -1.8849F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(69, 100).addBox(-2.5F, 0.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.1618F, -1.4476F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(72, 40).addBox(-2.5F, 0.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.1531F, -0.9477F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(12, 129).addBox(-1.0F, -1.2489F, -0.135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, 12.3012F, -3.0543F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(131, 91).mirror().addBox(-0.6F, -1.4321F, 3.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.318F, -0.9517F, -0.159F, 0.0866F, -0.1226F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-0.6F, -2.2604F, 2.6086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.318F, -0.9517F, -0.5953F, 0.0866F, -0.1226F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(131, 85).mirror().addBox(-0.6F, -3.2992F, 0.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.318F, -0.9517F, -1.6425F, 0.0866F, -0.1226F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(128, 125).mirror().addBox(-0.6F, -1.986F, -0.7103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.925F, 1.443F, 0.1483F, -2.3756F, 0.0866F, -0.1226F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(126, 42).mirror().addBox(-1.5F, -2.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(126, 42).addBox(0.55F, -2.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.025F, 1.562F, 0.3045F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(131, 91).addBox(-0.4F, -1.4321F, 3.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 1.318F, -0.9517F, -0.159F, -0.0866F, 0.1226F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(131, 88).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2571F, 1.868F, 2.2388F, -0.5953F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 129).addBox(-0.4F, -2.2604F, 2.6086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0F, 1.318F, -0.9517F, -0.5953F, -0.0866F, 0.1226F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(131, 85).addBox(-0.4F, -3.2992F, 0.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 1.318F, -0.9517F, -1.6425F, -0.0866F, 0.1226F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(128, 125).addBox(-0.4F, -1.986F, -0.7103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.925F, 1.443F, 0.1483F, -2.3756F, -0.0866F, 0.1226F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(96, 45).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.5097F, -1.8594F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(101, 0).addBox(-1.0F, -0.5F, -1.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.491F, 0.225F, -2.3374F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(27, 100).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.491F, 0.6889F, -3.9105F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(100, 18).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.491F, 1.5877F, -4.3489F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(41, 111).addBox(-1.5F, -1.2F, -0.075F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.938F, -1.4423F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(101, 4).addBox(0.0F, 2.0F, -1.175F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.491F, -0.0109F, -2.6681F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(96, 135).addBox(-0.6177F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(91, 135).addBox(-0.6177F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1177F, 13.3355F, -2.9824F, -0.4786F, -0.0357F, -0.0253F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 7.3281F, 0.4418F));

		PartDefinition cube_r265 = leftSygomaticarch.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(135, 13).addBox(-0.675F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7085F, -0.1669F, -4.2734F, -0.3741F, 0.2018F, 2.4886F));

		PartDefinition cube_r266 = leftSygomaticarch.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(131, 44).addBox(-0.55F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.4479F, 4.7591F, -3.086F, -0.0871F, 0.0046F, 0.0522F));

		PartDefinition cube_r267 = leftSygomaticarch.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(135, 37).addBox(-0.7F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9479F, -4.1895F, -4.6535F, -0.1585F, 0.0735F, 0.4305F));

		PartDefinition cube_r268 = leftSygomaticarch.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(125, 107).addBox(-0.6F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.2479F, 1.2971F, -3.0332F, 0.0F, 0.0F, 0.0349F));

		PartDefinition cube_r269 = leftSygomaticarch.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(135, 34).addBox(-0.8827F, -0.9867F, -1.1157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2723F, -3.341F, -4.3454F, -0.2348F, 0.7279F, 0.2436F));

		PartDefinition cube_r270 = leftSygomaticarch.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(128, 13).addBox(-1.8368F, -0.9867F, -1.0471F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2723F, -3.341F, -4.3454F, -0.476F, 1.1821F, -0.0437F));

		PartDefinition cube_r271 = leftSygomaticarch.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(131, 48).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9479F, -2.7865F, -5.2764F, -0.0569F, 0.6973F, -0.0366F));

		PartDefinition cube_r272 = leftSygomaticarch.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(44, 128).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3051F, -2.7531F, -4.5111F, -0.0769F, 0.9673F, -0.0634F));

		PartDefinition cube_r273 = leftSygomaticarch.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(58, 128).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3051F, -2.7531F, -4.5111F, -0.1301F, 1.2278F, -0.1226F));

		PartDefinition cube_r274 = leftSygomaticarch.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(59, 135).addBox(-0.475F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(135, 61).addBox(-0.475F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.5397F, 5.5785F, -2.8565F, -0.4743F, -0.0757F, -0.1029F));

		PartDefinition cube_r275 = leftSygomaticarch.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(49, 131).addBox(-1.0F, -0.0019F, 0.0123F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9479F, -1.7861F, -5.3324F, 0.1024F, 0.6955F, 0.0657F));

		PartDefinition cube_r276 = leftSygomaticarch.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(51, 128).addBox(-2.0F, -0.0019F, -0.9877F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3051F, -1.8462F, -4.5687F, 0.1561F, 1.0419F, 0.1351F));

		PartDefinition cube_r277 = leftSygomaticarch.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(128, 0).addBox(-1.0F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9479F, 1.7947F, -5.1757F, 0.0879F, 0.6526F, 0.0535F));

		PartDefinition cube_r278 = leftSygomaticarch.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(128, 8).addBox(-1.0F, -2.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3391F, 1.7394F, -4.3842F, 0.2017F, 1.2151F, 0.1894F));

		PartDefinition cube_r279 = leftSygomaticarch.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(19, 128).addBox(-1.0F, -2.5F, -1.125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5786F, 1.6935F, -3.7281F, -1.2549F, 1.5227F, -1.2526F));

		PartDefinition cube_r280 = leftSygomaticarch.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(50, 117).addBox(-0.5F, -1.05F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.2138F, 1.762F, -3.8678F, 0.7847F, -0.0336F, -0.082F));

		PartDefinition cube_r281 = leftSygomaticarch.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(34, 135).addBox(-0.4138F, -0.7268F, -0.8214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3147F, 2.845F, -3.2093F, 0.6854F, -0.1451F, 0.0529F));

		PartDefinition cube_r282 = leftSygomaticarch.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(131, 40).addBox(-0.4138F, -1.0322F, -0.7541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-2.3147F, 2.845F, -3.2093F, 0.2927F, -0.1451F, 0.0529F));

		PartDefinition cube_r283 = leftSygomaticarch.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(7, 128).addBox(-0.4138F, -0.2322F, -0.5291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2854F, 2.3462F, -3.1906F, 0.0311F, -0.2463F, 0.0682F));

		PartDefinition cube_r284 = leftSygomaticarch.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(44, 131).addBox(-0.4138F, 0.4624F, -0.6455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3147F, 2.845F, -3.2093F, 0.1181F, -0.1451F, 0.0529F));

		PartDefinition cube_r285 = leftSygomaticarch.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(135, 5).addBox(-0.6F, 0.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6432F, -0.5491F, -4.3415F, -0.3238F, -0.7245F, 1.0542F));

		PartDefinition cube_r286 = leftSygomaticarch.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(122, 134).addBox(-1.0F, -0.5F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7156F, -0.0925F, -4.1512F, 0.4923F, -0.6341F, -0.1502F));

		PartDefinition cube_r287 = leftSygomaticarch.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(114, 134).addBox(-0.9F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8885F, -0.4187F, -3.4344F, 0.3948F, -0.1427F, 0.0982F));

		PartDefinition cube_r288 = leftSygomaticarch.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(118, 62).addBox(-0.5418F, -0.4169F, -1.8629F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.8F, -2.4F, 0.4594F, 0.538F, 0.4057F));

		PartDefinition cube_r289 = leftSygomaticarch.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(134, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0296F, -1.1969F, -0.9639F, -0.5263F, -0.0007F, 0.1481F));

		PartDefinition cube_r290 = leftSygomaticarch.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(134, 113).addBox(-1.0003F, -0.0315F, -0.0287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5485F, -2.1942F, -4.5439F, 2.1032F, 0.2168F, -0.0397F));

		PartDefinition cube_r291 = leftSygomaticarch.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(134, 110).addBox(-0.9503F, -0.8978F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6079F, -2.0111F, -3.2253F, 2.3079F, 0.1029F, 0.1489F));

		PartDefinition cube_r292 = leftSygomaticarch.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(103, 134).addBox(-0.9503F, -0.8324F, -0.6636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6079F, -2.0111F, -3.2253F, 2.7006F, 0.1029F, 0.1489F));

		PartDefinition cube_r293 = leftSygomaticarch.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(134, 97).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1916F, -2.2776F, -2.1614F, -3.0745F, -0.0007F, 0.1481F));

		PartDefinition cube_r294 = leftSygomaticarch.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(86, 134).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0636F, -1.4217F, -1.6855F, -2.228F, -0.0007F, 0.1481F));

		PartDefinition cube_r295 = leftSygomaticarch.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(133, 133).addBox(-0.5F, 0.375F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0184F, -1.1224F, -0.8342F, -1.6607F, -0.0007F, 0.1481F));

		PartDefinition cube_r296 = leftSygomaticarch.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(132, 28).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0848F, -1.5694F, -0.4658F, 0.3464F, -0.0007F, 0.1481F));

		PartDefinition cube_r297 = leftSygomaticarch.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(133, 130).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0135F, -1.096F, 0.5438F, 2.7898F, -0.0007F, 0.1481F));

		PartDefinition cube_r298 = leftSygomaticarch.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(128, 133).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0594F, -0.6037F, -0.3235F, -2.6207F, -0.0007F, 0.1481F));

		PartDefinition cube_r299 = leftSygomaticarch.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(133, 127).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1027F, -0.3087F, -1.2781F, -1.268F, -0.0007F, 0.1481F));

		PartDefinition cube_r300 = leftSygomaticarch.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(132, 25).addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1145F, -0.225F, -2.2745F, 0.0846F, -0.0007F, 0.1481F));

		PartDefinition cube_r301 = leftSygomaticarch.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(132, 22).addBox(-0.0731F, 2.8866F, 3.3317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4521F, -6.0317F, -4.0363F, -0.5479F, -0.087F, 0.1487F));

		PartDefinition cube_r302 = leftSygomaticarch.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(135, 58).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8717F, -5.9795F, -3.7759F, -1.0872F, 0.8522F, -0.9502F));

		PartDefinition cube_r303 = leftSygomaticarch.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(49, 135).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4451F, -6.4614F, -4.4385F, -0.7215F, 0.4897F, -0.3809F));

		PartDefinition cube_r304 = leftSygomaticarch.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(135, 55).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8577F, -5.2199F, -4.1012F, -0.8194F, 0.9795F, -0.7333F));

		PartDefinition cube_r305 = leftSygomaticarch.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(44, 135).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4389F, -5.5481F, -4.8459F, -0.5006F, 0.5571F, -0.2883F));

		PartDefinition cube_r306 = leftSygomaticarch.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(54, 135).addBox(-1.0F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9389F, -5.021F, -4.0961F, -0.7616F, 1.1599F, -0.7184F));

		PartDefinition cube_r307 = leftSygomaticarch.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(39, 135).addBox(-1.0F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4389F, -5.2598F, -4.9286F, -0.3197F, 0.5014F, -0.1578F));

		PartDefinition cube_r308 = leftSygomaticarch.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(34, 131).addBox(-0.7F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0157F, -0.3259F, -3.6571F, -0.0936F, 0.0174F, -0.0889F));

		PartDefinition cube_r309 = leftSygomaticarch.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(39, 131).addBox(-1.0F, -0.0769F, -0.9877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6536F, -1.763F, -4.3306F, 0.1141F, 1.2372F, 0.0183F));

		PartDefinition cube_r310 = leftSygomaticarch.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(104, 127).addBox(-1.3F, 0.1F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7625F, -5.356F, -2.6452F, -0.3411F, 0.1665F, 0.0424F));

		PartDefinition cube_r311 = leftSygomaticarch.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(118, 22).addBox(-1.3669F, -0.1456F, -0.4614F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9479F, -6.7317F, -2.4363F, -0.1833F, 0.0F, -0.4014F));

		PartDefinition cube_r312 = leftSygomaticarch.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(29, 135).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5296F, -4.614F, -3.075F, -0.1897F, 0.0299F, -0.125F));

		PartDefinition cube_r313 = leftSygomaticarch.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(132, 19).addBox(-0.9828F, 0.0052F, -0.4665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2859F, -5.4013F, -2.7308F, -0.4189F, 0.0F, -0.2793F));

		PartDefinition cube_r314 = leftSygomaticarch.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(50, 111).addBox(-0.225F, -2.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4479F, 0.671F, -1.9732F, -0.2268F, 0.0079F, 0.034F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 7.3281F, 0.4418F));

		PartDefinition cube_r315 = rightSygomaticarch.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(135, 13).mirror().addBox(-0.325F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7085F, -0.1669F, -4.2734F, -0.3741F, -0.2018F, -2.4886F));

		PartDefinition cube_r316 = rightSygomaticarch.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(131, 44).mirror().addBox(-0.45F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.4479F, 4.7591F, -3.086F, -0.0871F, -0.0046F, -0.0522F));

		PartDefinition cube_r317 = rightSygomaticarch.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(135, 37).mirror().addBox(-0.3F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9479F, -4.1895F, -4.6535F, -0.1585F, -0.0735F, -0.4305F));

		PartDefinition cube_r318 = rightSygomaticarch.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(125, 107).mirror().addBox(-0.4F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.2479F, 1.2971F, -3.0332F, 0.0F, 0.0F, -0.0349F));

		PartDefinition cube_r319 = rightSygomaticarch.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(135, 34).mirror().addBox(-0.1173F, -0.9867F, -1.1157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.2723F, -3.341F, -4.3454F, -0.2348F, -0.7279F, -0.2436F));

		PartDefinition cube_r320 = rightSygomaticarch.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(128, 13).mirror().addBox(-0.1632F, -0.9867F, -1.0471F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.2723F, -3.341F, -4.3454F, -0.476F, -1.1821F, 0.0437F));

		PartDefinition cube_r321 = rightSygomaticarch.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(131, 48).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9479F, -2.7865F, -5.2764F, -0.0569F, -0.6973F, 0.0366F));

		PartDefinition cube_r322 = rightSygomaticarch.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(44, 128).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3051F, -2.7531F, -4.5111F, -0.0769F, -0.9673F, 0.0634F));

		PartDefinition cube_r323 = rightSygomaticarch.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(58, 128).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3051F, -2.7531F, -4.5111F, -0.1301F, -1.2278F, 0.1226F));

		PartDefinition cube_r324 = rightSygomaticarch.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(59, 135).mirror().addBox(-0.525F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(135, 61).mirror().addBox(-0.525F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.5397F, 5.5785F, -2.8565F, -0.4743F, 0.0757F, 0.1029F));

		PartDefinition cube_r325 = rightSygomaticarch.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(49, 131).mirror().addBox(0.0F, -0.0019F, 0.0123F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9479F, -1.7861F, -5.3324F, 0.1024F, -0.6955F, -0.0657F));

		PartDefinition cube_r326 = rightSygomaticarch.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(51, 128).mirror().addBox(0.0F, -0.0019F, -0.9877F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3051F, -1.8462F, -4.5687F, 0.1561F, -1.0419F, -0.1351F));

		PartDefinition cube_r327 = rightSygomaticarch.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(0.0F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9479F, 1.7947F, -5.1757F, 0.0879F, -0.6526F, -0.0535F));

		PartDefinition cube_r328 = rightSygomaticarch.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(128, 8).mirror().addBox(0.0F, -2.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3391F, 1.7394F, -4.3842F, 0.2017F, -1.2151F, -0.1894F));

		PartDefinition cube_r329 = rightSygomaticarch.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(19, 128).mirror().addBox(0.0F, -2.5F, -1.125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5786F, 1.6935F, -3.7281F, -1.2549F, -1.5227F, 1.2526F));

		PartDefinition cube_r330 = rightSygomaticarch.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(50, 117).mirror().addBox(-0.5F, -1.05F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.2138F, 1.762F, -3.8678F, 0.7847F, 0.0336F, 0.082F));

		PartDefinition cube_r331 = rightSygomaticarch.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(34, 135).mirror().addBox(-0.5862F, -0.7268F, -0.8214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3147F, 2.845F, -3.2093F, 0.6854F, 0.1451F, -0.0529F));

		PartDefinition cube_r332 = rightSygomaticarch.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(131, 40).mirror().addBox(-0.5862F, -1.0322F, -0.7541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(2.3147F, 2.845F, -3.2093F, 0.2927F, 0.1451F, -0.0529F));

		PartDefinition cube_r333 = rightSygomaticarch.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(7, 128).mirror().addBox(-0.5862F, -0.2322F, -0.5291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2854F, 2.3462F, -3.1906F, 0.0311F, 0.2463F, -0.0682F));

		PartDefinition cube_r334 = rightSygomaticarch.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(44, 131).mirror().addBox(-0.5862F, 0.4624F, -0.6455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3147F, 2.845F, -3.2093F, 0.1181F, 0.1451F, -0.0529F));

		PartDefinition cube_r335 = rightSygomaticarch.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(135, 5).mirror().addBox(-0.4F, 0.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.6432F, -0.5491F, -4.3415F, -0.3238F, 0.7245F, -1.0542F));

		PartDefinition cube_r336 = rightSygomaticarch.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(122, 134).mirror().addBox(0.0F, -0.5F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7156F, -0.0925F, -4.1512F, 0.4923F, 0.6341F, 0.1502F));

		PartDefinition cube_r337 = rightSygomaticarch.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(114, 134).mirror().addBox(-0.1F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8885F, -0.4187F, -3.4344F, 0.3948F, 0.1427F, -0.0982F));

		PartDefinition cube_r338 = rightSygomaticarch.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(118, 62).mirror().addBox(-0.4582F, -0.4169F, -1.8629F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, -2.4F, 0.4594F, -0.538F, -0.4057F));

		PartDefinition cube_r339 = rightSygomaticarch.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(134, 16).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0296F, -1.1969F, -0.9639F, -0.5263F, 0.0007F, -0.1481F));

		PartDefinition cube_r340 = rightSygomaticarch.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(134, 113).mirror().addBox(0.0003F, -0.0315F, -0.0287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, -2.1942F, -4.5439F, 2.1032F, -0.2168F, 0.0397F));

		PartDefinition cube_r341 = rightSygomaticarch.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(134, 110).mirror().addBox(-0.0497F, -0.8978F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6079F, -2.0111F, -3.2253F, 2.3079F, -0.1029F, -0.1489F));

		PartDefinition cube_r342 = rightSygomaticarch.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(103, 134).mirror().addBox(-0.0497F, -0.8324F, -0.6636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6079F, -2.0111F, -3.2253F, 2.7006F, -0.1029F, -0.1489F));

		PartDefinition cube_r343 = rightSygomaticarch.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(134, 97).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1916F, -2.2776F, -2.1614F, -3.0745F, 0.0007F, -0.1481F));

		PartDefinition cube_r344 = rightSygomaticarch.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(86, 134).mirror().addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0636F, -1.4217F, -1.6855F, -2.228F, 0.0007F, -0.1481F));

		PartDefinition cube_r345 = rightSygomaticarch.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(133, 133).mirror().addBox(-0.5F, 0.375F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0184F, -1.1224F, -0.8342F, -1.6607F, 0.0007F, -0.1481F));

		PartDefinition cube_r346 = rightSygomaticarch.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(132, 28).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0848F, -1.5694F, -0.4658F, 0.3464F, 0.0007F, -0.1481F));

		PartDefinition cube_r347 = rightSygomaticarch.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(133, 130).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0135F, -1.096F, 0.5438F, 2.7898F, 0.0007F, -0.1481F));

		PartDefinition cube_r348 = rightSygomaticarch.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(128, 133).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0594F, -0.6037F, -0.3235F, -2.6207F, 0.0007F, -0.1481F));

		PartDefinition cube_r349 = rightSygomaticarch.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(133, 127).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1027F, -0.3087F, -1.2781F, -1.268F, 0.0007F, -0.1481F));

		PartDefinition cube_r350 = rightSygomaticarch.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(132, 25).mirror().addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1145F, -0.225F, -2.2745F, 0.0846F, 0.0007F, -0.1481F));

		PartDefinition cube_r351 = rightSygomaticarch.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(132, 22).mirror().addBox(-0.9269F, 2.8866F, 3.3317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -6.0317F, -4.0363F, -0.5479F, 0.087F, -0.1487F));

		PartDefinition cube_r352 = rightSygomaticarch.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(135, 58).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8717F, -5.9795F, -3.7759F, -1.0872F, -0.8522F, 0.9502F));

		PartDefinition cube_r353 = rightSygomaticarch.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(49, 135).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4451F, -6.4614F, -4.4385F, -0.7215F, -0.4897F, 0.3809F));

		PartDefinition cube_r354 = rightSygomaticarch.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(135, 55).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8577F, -5.2199F, -4.1012F, -0.8194F, -0.9795F, 0.7333F));

		PartDefinition cube_r355 = rightSygomaticarch.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(44, 135).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4389F, -5.5481F, -4.8459F, -0.5006F, -0.5571F, 0.2883F));

		PartDefinition cube_r356 = rightSygomaticarch.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(54, 135).mirror().addBox(0.0F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9389F, -5.021F, -4.0961F, -0.7616F, -1.1599F, 0.7184F));

		PartDefinition cube_r357 = rightSygomaticarch.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(39, 135).mirror().addBox(0.0F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4389F, -5.2598F, -4.9286F, -0.3197F, -0.5014F, 0.1578F));

		PartDefinition cube_r358 = rightSygomaticarch.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(34, 131).mirror().addBox(-0.3F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0157F, -0.3259F, -3.6571F, -0.0936F, -0.0174F, 0.0889F));

		PartDefinition cube_r359 = rightSygomaticarch.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(39, 131).mirror().addBox(0.0F, -0.0769F, -0.9877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.6536F, -1.763F, -4.3306F, 0.1141F, -1.2372F, -0.0183F));

		PartDefinition cube_r360 = rightSygomaticarch.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(104, 127).mirror().addBox(-0.7F, 0.1F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7625F, -5.356F, -2.6452F, -0.3411F, -0.1665F, -0.0424F));

		PartDefinition cube_r361 = rightSygomaticarch.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(118, 22).mirror().addBox(-0.6331F, -0.1456F, -0.4614F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9479F, -6.7317F, -2.4363F, -0.1833F, 0.0F, 0.4014F));

		PartDefinition cube_r362 = rightSygomaticarch.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(29, 135).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5296F, -4.614F, -3.075F, -0.1897F, -0.0299F, 0.125F));

		PartDefinition cube_r363 = rightSygomaticarch.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(132, 19).mirror().addBox(-0.0172F, 0.0052F, -0.4665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2859F, -5.4013F, -2.7308F, -0.4189F, 0.0F, 0.2793F));

		PartDefinition cube_r364 = rightSygomaticarch.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(50, 111).mirror().addBox(-0.775F, -2.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4479F, 0.671F, -1.9732F, -0.2268F, -0.0079F, -0.034F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8826F, -1.9015F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(136, 0).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.3312F, 11.0657F, 0.9467F, -1.5708F, 0.0F, 0.0349F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(135, 119).mirror().addBox(-0.55F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3724F, 10.5958F, 0.9467F, -1.5708F, 0.0F, 0.4712F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(113, 124).mirror().addBox(-0.5F, -0.4535F, -0.1899F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 9.3144F, 0.9932F, -1.5708F, 0.0F, 0.2094F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(124, 90).mirror().addBox(-0.5F, -0.6493F, -0.2229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 9.3144F, 0.9932F, -1.7017F, 0.0F, 0.2094F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(87, 124).mirror().addBox(0.0474F, -0.672F, -0.3024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 6.4F, 1.2F, -1.6319F, 0.0F, -0.2967F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(124, 86).mirror().addBox(-0.1F, -0.1259F, -1.8034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 9.3579F, 1.4397F, -1.8326F, 0.0F, -0.2094F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(75, 124).mirror().addBox(-0.1F, -0.1105F, -1.8006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 9.3579F, 1.4397F, -1.6755F, 0.0F, -0.2094F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(123, 121).mirror().addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(123, 121).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 9.458F, 1.4397F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(135, 116).mirror().addBox(0.0474F, -0.2386F, -0.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(108, 135).mirror().addBox(0.0474F, -0.2386F, 0.3685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 6.4F, 1.2F, -1.2741F, 0.0F, -0.2967F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(135, 106).mirror().addBox(0.0474F, -1.234F, -0.5056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 6.4F, 1.2F, -1.9635F, 0.0F, -0.2967F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(54, 131).mirror().addBox(0.0F, 1.6532F, -0.018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, 0.2269F, 0.0F, -0.1047F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(24, 128).mirror().addBox(0.0F, 0.9F, 1.0962F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, -0.2531F, 0.0F, -0.1047F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(135, 103).mirror().addBox(0.0F, -1.8517F, 0.3323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, -1.6057F, 0.0F, -0.1047F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(135, 100).mirror().addBox(0.0F, 1.7497F, -1.6074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, -0.5323F, 0.0F, -0.1047F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(132, 94).mirror().addBox(0.0F, -1.6425F, 3.4059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, -1.5272F, 0.0F, -0.1047F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(93, 132).mirror().addBox(0.0474F, -1.2634F, 0.2977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 6.4F, 1.2F, -2.0682F, 0.0F, -0.2967F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(121, 8).mirror().addBox(0.0243F, -1.8474F, -0.1614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 4.2F, 1.2F, -1.8239F, 0.0F, -0.192F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(121, 4).mirror().addBox(-1.0F, -0.4F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(121, 4).addBox(-1.0F, -0.4F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 9.2774F, 1.157F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(121, 0).mirror().addBox(0.0203F, -0.8086F, -0.0707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 4.2F, 1.2F, -1.6319F, 0.0F, -0.192F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(107, 32).mirror().addBox(-0.325F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1499F, 4.303F, 0.6863F, -1.7453F, 0.003F, -0.1748F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(107, 27).mirror().addBox(0.0203F, -0.5005F, -0.7601F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 4.2F, 1.2F, -1.7191F, 0.0F, -0.192F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(0.0F, 1.5565F, -1.2147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, -0.3229F, 0.0F, -0.1047F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(120, 16).mirror().addBox(0.0F, -1.1778F, -1.4834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, -1.789F, 0.0F, -0.1047F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(70, 94).mirror().addBox(0.0F, -1.1743F, -0.24F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, -1.7453F, 0.0F, -0.1047F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(106, 119).mirror().addBox(0.0F, -1.7359F, -1.2748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, -1.3875F, 0.0F, -0.1047F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(132, 52).mirror().addBox(0.0F, -0.051F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, 0.2356F, 0.0F, -0.1047F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(16, 107).mirror().addBox(0.0F, 0.3251F, -1.5603F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 102).mirror().addBox(0.0F, 1.1251F, -1.2853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(132, 31).mirror().addBox(0.0F, 1.9251F, -2.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.2F, 1.2F, -0.6545F, 0.0F, -0.1047F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(132, 94).addBox(-1.0F, -1.6425F, 3.4059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, -1.5272F, 0.0F, 0.1047F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(135, 106).addBox(-1.0474F, -1.234F, -0.5056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3F, 6.4F, 1.2F, -1.9635F, 0.0F, 0.2967F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(93, 132).addBox(-1.0474F, -1.2634F, 0.2977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.3F, 6.4F, 1.2F, -2.0682F, 0.0F, 0.2967F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(121, 8).addBox(-1.0243F, -1.8474F, -0.1614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 4.2F, 1.2F, -1.8239F, 0.0F, 0.192F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(75, 124).addBox(-0.9F, -0.1105F, -1.8006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4F, 9.3579F, 1.4397F, -1.6755F, 0.0F, 0.2094F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(124, 86).addBox(-0.9F, -0.1259F, -1.8034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 9.3579F, 1.4397F, -1.8326F, 0.0F, 0.2094F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(124, 90).addBox(-0.5F, -0.6493F, -0.2229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 9.3144F, 0.9932F, -1.7017F, 0.0F, -0.2094F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(136, 0).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3312F, 11.0657F, 0.9467F, -1.5708F, 0.0F, -0.0349F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(135, 119).addBox(-0.45F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3724F, 10.5958F, 0.9467F, -1.5708F, 0.0F, -0.4712F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(113, 124).addBox(-0.5F, -0.4535F, -0.1899F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1F, 9.3144F, 0.9932F, -1.5708F, 0.0F, -0.2094F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(68, 124).addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 10.8495F, 1.1467F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(58, 124).addBox(0.0F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.5F, 9.3495F, 0.6467F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(87, 124).addBox(-1.0474F, -0.672F, -0.3024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 6.4F, 1.2F, -1.6319F, 0.0F, 0.2967F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(121, 0).addBox(-1.0203F, -0.8086F, -0.0707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7F, 4.2F, 1.2F, -1.6319F, 0.0F, 0.192F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(107, 32).addBox(-0.675F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1499F, 4.303F, 0.6863F, -1.7453F, -0.003F, 0.1748F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(135, 116).addBox(-1.0474F, -0.2386F, -0.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(108, 135).addBox(-1.0474F, -0.2386F, 0.3685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3F, 6.4F, 1.2F, -1.2741F, 0.0F, 0.2967F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(107, 27).addBox(-1.0203F, -0.5005F, -0.7601F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7F, 4.2F, 1.2F, -1.7191F, 0.0F, 0.192F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(0, 121).addBox(-1.0F, 1.5565F, -1.2147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, -0.3229F, 0.0F, 0.1047F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(120, 16).addBox(-1.0F, -1.1778F, -1.4834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, -1.789F, 0.0F, 0.1047F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(70, 94).addBox(-1.0F, -1.1743F, -0.24F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, -1.7453F, 0.0F, 0.1047F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(54, 131).addBox(-1.0F, 1.6532F, -0.018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, 0.2269F, 0.0F, 0.1047F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(24, 128).addBox(-1.0F, 0.9F, 1.0962F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, -0.2531F, 0.0F, 0.1047F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(135, 103).addBox(-1.0F, -1.8517F, 0.3323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, -1.6057F, 0.0F, 0.1047F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(106, 119).addBox(-1.0F, -1.7359F, -1.2748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, -1.3875F, 0.0F, 0.1047F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(132, 52).addBox(-1.0F, -0.051F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, 0.2356F, 0.0F, 0.1047F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(16, 107).addBox(-1.0F, 0.3251F, -1.5603F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(106, 102).addBox(-1.0F, 1.1251F, -1.2853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F))
				.texOffs(132, 31).addBox(-1.0F, 1.9251F, -2.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, -0.6545F, 0.0F, 0.1047F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(135, 100).addBox(-1.0F, 1.7497F, -1.6074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.2F, 1.2F, -0.5323F, 0.0F, 0.1047F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9775F, 2.3985F, -0.7656F, -0.0232F, 0.2166F, -0.1339F));

		PartDefinition cube_r419 = bone2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(94, 116).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4897F, -3.7977F, 3.5296F, -1.7582F, 0.2457F, -0.3953F));

		PartDefinition cube_r420 = bone2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(116, 72).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4001F, -2.234F, 4.4032F, -1.1037F, 0.2457F, -0.3953F));

		PartDefinition cube_r421 = bone2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(99, 96).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8661F, -0.5192F, 3.4854F, -0.4928F, 0.2457F, -0.3953F));

		PartDefinition cube_r422 = bone2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(99, 90).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6691F, 0.7683F, 0.7829F, 0.3799F, 0.2457F, -0.3953F));

		PartDefinition cube_r423 = bone2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(96, 83).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1063F, -0.2785F, -0.4633F, 1.7761F, 0.2457F, -0.3953F));

		PartDefinition cube_r424 = bone2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(38, 36).addBox(-0.3F, 0.0F, -8.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4286F, 1.9483F, -4.3814F, -2.4206F, 0.0618F, -0.2056F));

		PartDefinition cube_r425 = bone2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(23, 117).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5827F, 2.4567F, -2.128F, -2.2731F, 0.2457F, -0.3953F));

		PartDefinition cube_r426 = bone2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(7, 117).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1993F, 2.7966F, -4.0613F, -1.4877F, 0.2457F, -0.3953F));

		PartDefinition cube_r427 = bone2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(106, 114).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0597F, 0.5976F, -5.318F, -0.3096F, 0.2457F, -0.3953F));

		PartDefinition cube_r428 = bone2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(0, 100).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2072F, -0.727F, -3.8268F, 0.694F, 0.2457F, -0.3953F));

		PartDefinition cube_r429 = bone2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(116, 67).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7439F, -2.5017F, -3.077F, 1.174F, 0.2457F, -0.3953F));

		PartDefinition cube_r430 = bone2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(28, 60).addBox(-0.3784F, 0.1798F, -0.7161F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4219F, 0.2457F, -0.3953F));

		PartDefinition cube_r431 = bone2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(0, 67).addBox(-0.3784F, -0.1881F, -0.216F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9157F, 0.2457F, -0.3953F));

		PartDefinition cube_r432 = bone2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(15, 60).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.8435F, -4.7855F, 0.0636F, 1.1216F, 0.2457F, -0.3953F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9775F, 2.3985F, -0.7656F, -0.0232F, -0.2166F, 0.1339F));

		PartDefinition cube_r433 = bone3.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(94, 116).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4897F, -3.7977F, 3.5296F, -1.7582F, -0.2457F, 0.3953F));

		PartDefinition cube_r434 = bone3.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(116, 72).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4001F, -2.234F, 4.4032F, -1.1037F, -0.2457F, 0.3953F));

		PartDefinition cube_r435 = bone3.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(99, 96).mirror().addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8661F, -0.5192F, 3.4854F, -0.4928F, -0.2457F, 0.3953F));

		PartDefinition cube_r436 = bone3.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(99, 90).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6691F, 0.7683F, 0.7829F, 0.3799F, -0.2457F, 0.3953F));

		PartDefinition cube_r437 = bone3.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(96, 83).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1063F, -0.2785F, -0.4633F, 1.7761F, -0.2457F, 0.3953F));

		PartDefinition cube_r438 = bone3.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(38, 36).mirror().addBox(-0.7F, 0.0F, -8.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4286F, 1.9483F, -4.3814F, -2.4206F, -0.0618F, 0.2056F));

		PartDefinition cube_r439 = bone3.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(23, 117).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5827F, 2.4567F, -2.128F, -2.2731F, -0.2457F, 0.3953F));

		PartDefinition cube_r440 = bone3.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(7, 117).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1993F, 2.7966F, -4.0613F, -1.4877F, -0.2457F, 0.3953F));

		PartDefinition cube_r441 = bone3.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(106, 114).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.0597F, 0.5976F, -5.318F, -0.3096F, -0.2457F, 0.3953F));

		PartDefinition cube_r442 = bone3.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.2072F, -0.727F, -3.8268F, 0.694F, -0.2457F, 0.3953F));

		PartDefinition cube_r443 = bone3.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(116, 67).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7439F, -2.5017F, -3.077F, 1.174F, -0.2457F, 0.3953F));

		PartDefinition cube_r444 = bone3.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-0.6216F, 0.1798F, -0.7161F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4219F, -0.2457F, 0.3953F));

		PartDefinition cube_r445 = bone3.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.6216F, -0.1881F, -0.216F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9157F, -0.2457F, 0.3953F));

		PartDefinition cube_r446 = bone3.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(15, 60).mirror().addBox(-0.5F, 0.0F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.8435F, -4.7855F, 0.0636F, 1.1216F, -0.2457F, 0.3953F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(35, 0).addBox(-1.2F, -0.7F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.1089F, 5.7158F, -4.6131F, -1.3921F, 0.3328F, -0.3103F));

		PartDefinition cube_r447 = leftArm.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(98, 68).addBox(-1.0F, -0.4F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.5041F, 0.5966F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r448 = leftArm.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(60, 111).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 0.0649F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r449 = leftArm.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(106, 50).addBox(-1.0F, -0.8F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 0.0649F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r450 = leftArm.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(57, 36).addBox(-0.5014F, -0.3286F, -2.7839F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1215F, -0.0105F, 4.3213F, -0.0873F, 0.052F, -0.0076F));

		PartDefinition cube_r451 = leftArm.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(59, 8).addBox(-0.9195F, -0.5F, -2.7601F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2805F, 0.2F, 4.7601F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r452 = leftArm.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(108, 93).addBox(-1.2F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(108, 88).addBox(-0.5F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1128F, -0.9727F, 1.6424F, -0.3054F, 0.0873F, 0.0F));

		PartDefinition cube_r453 = leftArm.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(106, 123).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.35F, -1.5452F, 3.5213F, -0.6545F, 0.0873F, 0.0F));

		PartDefinition cube_r454 = leftArm.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(99, 123).addBox(-0.9F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0267F, -0.9F, 2.6274F, 0.2618F, 0.0873F, 0.0F));

		PartDefinition cube_r455 = leftArm.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(42, 19).addBox(-0.5F, -0.6895F, -3.7005F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1215F, -0.0105F, 4.3213F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r456 = leftArm.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(85, 110).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -0.0755F, 8.1713F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r457 = leftArm.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(41, 72).addBox(-1.2F, -2.0F, -4.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 12.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0686F, -0.6775F, 10.6941F, 0.5803F, -0.2518F, 0.1449F));

		PartDefinition cube_r458 = leftArm2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(94, 107).addBox(-0.8376F, -0.0289F, -1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0636F, 7.8576F, -0.4771F, 0.1751F, -0.2618F, 0.0826F));

		PartDefinition cube_r459 = leftArm2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(125, 36).addBox(-0.8376F, 3.1711F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 0.9035F, -1.4472F, 0.0006F, -0.2618F, 0.0826F));

		PartDefinition cube_r460 = leftArm2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(101, 116).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1508F, 10.4738F, -1.7901F, -0.043F, -0.2618F, 0.0826F));

		PartDefinition cube_r461 = leftArm2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(52, 93).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4273F, 5.5479F, -2.4234F, 0.1315F, -0.2618F, 0.0826F));

		PartDefinition cube_r462 = leftArm2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(131, 73).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4871F, 4.5532F, -2.3399F, 1.4841F, -0.2618F, 0.0826F));

		PartDefinition cube_r463 = leftArm2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(133, 124).addBox(-0.8376F, -1.0289F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.652F, 3.8932F, -1.4454F, 2.5313F, -0.2618F, 0.0826F));

		PartDefinition cube_r464 = leftArm2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(99, 127).addBox(-0.8376F, -2.7289F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.652F, 3.8932F, -1.4454F, -0.043F, -0.2618F, 0.0826F));

		PartDefinition cube_r465 = leftArm2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(29, 126).addBox(-0.8376F, -2.8289F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.652F, 3.8932F, -1.4454F, -0.3485F, -0.2618F, 0.0826F));

		PartDefinition cube_r466 = leftArm2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(75, 65).addBox(-2.0F, -0.9586F, -0.1515F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -0.4965F, 0.1528F, 0.7854F, 0.0F, 0.0349F));

		PartDefinition cube_r467 = leftArm2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(9, 100).addBox(-2.0F, 8.923F, -1.1747F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -0.4965F, 0.1528F, 0.1309F, 0.0F, 0.0349F));

		PartDefinition cube_r468 = leftArm2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(123, 117).addBox(-2.0F, 1.6246F, -1.0218F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -0.4965F, 0.1528F, 0.288F, 0.0F, 0.0349F));

		PartDefinition cube_r469 = leftArm2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(117, 86).addBox(-2.0F, -1.0456F, -0.179F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 110).addBox(-2.0F, -2.0456F, 0.521F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.4965F, 0.1528F, -0.1745F, 0.0F, 0.0349F));

		PartDefinition cube_r470 = leftArm2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(35, 10).addBox(-2.0F, 3.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4965F, 0.1528F, 0.0F, 0.0F, 0.0349F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(62, 53).addBox(-1.6F, 0.2F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5463F, 14.733F, -0.8162F, -0.0385F, -0.2148F, 0.3968F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4923F, 2.6871F, -0.008F, 0.32F, -1.4315F, 0.32F));

		PartDefinition cube_r471 = leftArm4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(74, 25).addBox(-3.4F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5089F, 3.1492F, 0.4F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r472 = leftArm5.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(106, 55).addBox(-0.6F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm7 = leftArm3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, 0.5236F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0268F, 2.7441F, 2.898F, 0.2314F, -0.084F, 0.6939F));

		PartDefinition cube_r473 = leftArm6.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(38, 100).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm8 = leftArm3.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1755F, 1.0282F, -0.318F, -0.5512F, 0.0723F, -0.2053F));

		PartDefinition cube_r474 = leftArm8.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(29, 131).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(19, 36).addBox(0.2F, -0.7F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-7.1089F, 5.7158F, -4.6131F, -0.8262F, -0.326F, 0.4631F));

		PartDefinition cube_r475 = rightArm.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(98, 73).addBox(-1.0F, -0.4F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.5041F, 0.5966F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r476 = rightArm.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(113, 55).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 0.0649F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r477 = rightArm.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(109, 62).addBox(-1.0F, -0.8F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 0.0649F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r478 = rightArm.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(0, 59).addBox(-0.4986F, -0.3286F, -2.7839F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1215F, -0.0105F, 4.3213F, -0.0873F, -0.052F, 0.0076F));

		PartDefinition cube_r479 = rightArm.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(59, 16).addBox(-0.0805F, -0.5F, -2.7601F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2805F, 0.2F, 4.7601F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r480 = rightArm.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(109, 22).addBox(0.2F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(109, 13).addBox(-0.5F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1128F, -0.9727F, 1.6424F, -0.3054F, -0.0873F, 0.0F));

		PartDefinition cube_r481 = rightArm.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(12, 125).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.35F, -1.5452F, 3.5213F, -0.6545F, -0.0873F, 0.0F));

		PartDefinition cube_r482 = rightArm.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(0, 125).addBox(-0.1F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0267F, -0.9F, 2.6274F, 0.2618F, -0.0873F, 0.0F));

		PartDefinition cube_r483 = rightArm.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.6895F, -3.7005F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1215F, -0.0105F, 4.3213F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r484 = rightArm.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(0, 111).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, -0.0755F, 8.1713F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r485 = rightArm.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(49, 106).addBox(-0.8F, -2.0F, -4.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 12.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0686F, -0.6775F, 10.6941F, 0.1577F, 0.3027F, -0.412F));

		PartDefinition cube_r486 = rightArm2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(9, 108).addBox(-0.1624F, -0.0289F, -1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0636F, 7.8576F, -0.4771F, 0.1751F, 0.2618F, -0.0826F));

		PartDefinition cube_r487 = rightArm2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(125, 59).addBox(-0.1624F, 3.1711F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 0.9035F, -1.4472F, 0.0006F, 0.2618F, -0.0826F));

		PartDefinition cube_r488 = rightArm2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(69, 117).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1508F, 10.4738F, -1.7901F, -0.043F, 0.2618F, -0.0826F));

		PartDefinition cube_r489 = rightArm2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(94, 95).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4273F, 5.5479F, -2.4234F, 0.1315F, 0.2618F, -0.0826F));

		PartDefinition cube_r490 = rightArm2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(131, 76).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4871F, 4.5532F, -2.3399F, 1.4841F, 0.2618F, -0.0826F));

		PartDefinition cube_r491 = rightArm2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(136, 8).addBox(-0.1624F, -1.0289F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.652F, 3.8932F, -1.4454F, 2.5313F, 0.2618F, -0.0826F));

		PartDefinition cube_r492 = rightArm2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(70, 128).addBox(-0.1624F, -2.7289F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.652F, 3.8932F, -1.4454F, -0.043F, 0.2618F, -0.0826F));

		PartDefinition cube_r493 = rightArm2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(65, 128).addBox(-0.1624F, -2.8289F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.652F, 3.8932F, -1.4454F, -0.3485F, 0.2618F, -0.0826F));

		PartDefinition cube_r494 = rightArm2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(108, 98).addBox(0.0F, -0.9586F, -0.1515F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -0.4965F, 0.1528F, 0.7854F, 0.0F, -0.0349F));

		PartDefinition cube_r495 = rightArm2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(99, 102).addBox(0.0F, 8.923F, -1.1747F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -0.4965F, 0.1528F, 0.1309F, 0.0F, -0.0349F));

		PartDefinition cube_r496 = rightArm2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(125, 20).addBox(0.0F, 1.6246F, -1.0218F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -0.4965F, 0.1528F, 0.288F, 0.0F, -0.0349F));

		PartDefinition cube_r497 = rightArm2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(117, 91).addBox(0.0F, -1.0456F, -0.179F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 110).addBox(0.0F, -2.0456F, 0.521F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -0.4965F, 0.1528F, -0.1745F, 0.0F, -0.0349F));

		PartDefinition cube_r498 = rightArm2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(102, 8).addBox(0.0F, 3.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.4965F, 0.1528F, 0.0F, 0.0F, -0.0349F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(28, 68).addBox(-0.4F, 0.2F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5463F, 14.733F, -0.8162F, -0.0193F, 0.2173F, -0.3075F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4923F, 2.6871F, -0.008F, 0.32F, 1.4315F, -0.32F));

		PartDefinition cube_r499 = rightArm4.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(27, 104).addBox(0.4F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5089F, 3.1492F, 0.4F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r500 = rightArm5.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(109, 67).addBox(-0.4F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm7 = rightArm3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, -0.5236F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0268F, 2.7441F, 2.898F, 0.2314F, 0.084F, -0.6939F));

		PartDefinition cube_r501 = rightArm6.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(59, 131).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm8 = rightArm3.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1755F, 1.0282F, -0.318F, -0.5512F, -0.0723F, 0.2053F));

		PartDefinition cube_r502 = rightArm8.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(131, 65).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(59, 76).addBox(-1.0F, -0.9067F, -0.1029F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.4153F, 6.252F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r503 = tail.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(126, 70).addBox(-0.5F, 0.2F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 65).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0933F, -0.1029F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r504 = tail.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(130, 36).addBox(-0.5F, -1.85F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8195F, 1.8952F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r505 = tail.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(126, 47).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9067F, -0.1029F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(13, 75).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1933F, 3.8971F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r506 = tail8.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(82, 126).addBox(-0.5F, 0.8F, 6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 75).addBox(-0.5F, 0.4F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.0F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r507 = tail8.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(130, 61).addBox(-0.5F, -1.85F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 57).addBox(-0.5F, -1.85F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0128F, -2.0019F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(55, 45).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(130, 106).addBox(-0.5F, 0.7878F, 4.0489F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1456F, 4.0016F, 0.0089F, -0.1745F, -0.0015F));

		PartDefinition cube_r508 = tail2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(130, 102).addBox(-0.5F, -1.1F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 69).addBox(-0.5F, -1.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8537F, 2.1077F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r509 = tail2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(104, 130).addBox(-0.5F, 0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6427F, 2.3925F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r510 = tail2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(128, 129).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r511 = tail2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(129, 112).addBox(-0.5F, -1.275F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail9 = tail2.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(75, 51).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0532F, -0.1743F, 0.0092F));

		PartDefinition cube_r512 = tail9.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(109, 132).addBox(-0.5F, -0.8F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 132).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.963F, 1.0177F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r513 = tail9.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(130, 120).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6063F, 3.4854F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r514 = tail9.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(130, 116).addBox(-0.5F, 0.1F, 1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8156F, -0.5091F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(87, 6).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1072F, -0.217F, 0.0232F));

		PartDefinition cube_r515 = tail3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(67, 136).addBox(0.0F, -1.2F, 2.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3982F, 0.3829F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r516 = tail3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(59, 65).addBox(0.0F, -0.1F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5337F, 1.4137F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r517 = tail3.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(19, 119).addBox(0.0F, -0.5F, -0.45F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1036F, 1.226F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail10 = tail3.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(60, 99).addBox(-0.5F, -2.3982F, 3.4171F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.3982F, 0.3829F));

		PartDefinition cube_r518 = tail10.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(136, 69).addBox(0.0F, -1.4F, 4.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail4 = tail10.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(62, 61).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9949F, 6.3901F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition cube_r519 = tail4.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(136, 89).addBox(0.0F, -0.7F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 59).addBox(0.0F, -0.5F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9982F, 0.5829F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r520 = tail4.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(70, 136).addBox(0.0F, -1.3F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9982F, 0.5829F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(75, 58).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0138F, 4.9732F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(26, 76).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.1724F, -0.3051F, 0.0138F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(95, 51).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.2185F, -0.1816F, 0.1359F));

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