package fossils.fossils.client.blockentity.model.acrocanthosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcrocanthosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone5;
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
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
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
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public AcrocanthosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone5 = this.hips.getChild("bone5");
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
		this.tail10 = this.tail7.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.bone = this.tail1.getChild("bone");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
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
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.6845F, -0.2961F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.006F, -10.7F, -3.0F, 0.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7051F, 0.8108F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1827F, 2.9846F, 2.21F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(108, 38).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3668F, -6.7515F, -3.6478F, -0.0038F, -0.0321F, -0.4016F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 20).addBox(-0.5827F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6795F, -9.3082F, 5.4213F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(86, 8).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4738F, -8.9996F, 0.7077F, -0.1696F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(49, 86).addBox(-0.5F, -1.7F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0322F, -5.5023F, 3.9963F, 0.3385F, -0.0327F, -0.4104F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(122, 5).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4313F, -4.3378F, 5.2051F, -0.8221F, -0.0327F, -0.4104F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 115).addBox(-0.5F, -1.1F, -2.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3449F, -6.104F, 5.4246F, 0.0942F, -0.0327F, -0.4104F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(87, 137).addBox(-0.5F, -0.9F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.144F, -5.4497F, 6.874F, 1.7304F, -0.0391F, -0.4053F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 126).addBox(-0.5F, -0.6F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.911F, -7.0927F, 8.3309F, 1.1196F, -0.0391F, -0.4053F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(126, 37).addBox(-0.5F, 0.9F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2538F, -8.0617F, 6.6152F, 1.1196F, -0.0391F, -0.4053F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 91).addBox(-0.5F, 0.075F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2797F, -8.3228F, 4.5926F, -0.1458F, -0.0391F, -0.4053F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(128, 142).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4577F, 6.375F, 8.3123F, -1.5305F, -0.0028F, -0.1157F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(52, 141).addBox(-1.0246F, 2.312F, 5.579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3116F, 0.4667F, 3.9561F, -0.4833F, -0.0028F, -0.1157F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(79, 141).addBox(-1.0246F, 3.4779F, -0.3617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.1667F, 5.1562F, 0.6075F, -0.0028F, -0.1157F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(42, 142).addBox(-0.5F, 1.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 73).addBox(-0.5F, 0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1542F, 5.3964F, 6.9461F, 1.262F, -0.0055F, -0.1136F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(30, 115).addBox(-1.0128F, -3.4771F, -1.1311F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 0.8256F, -0.0055F, -0.1136F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(103, 133).addBox(-1.6492F, -5.1094F, -1.2359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 1.0611F, -0.0597F, 0.1639F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(140, 84).addBox(-1.6492F, -5.227F, 0.0616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 1.3229F, -0.0597F, 0.1639F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 94).addBox(-1.6492F, -7.714F, -0.0681F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 1.1483F, -0.0597F, 0.1639F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(133, 76).addBox(-1.3476F, -6.5347F, -4.632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 0.0441F, -0.0624F, 0.0919F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(122, 16).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0233F, -1.0042F, 1.7237F, -0.2222F, -0.0654F, 0.1618F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 133).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0233F, -1.0042F, 1.7237F, 0.1705F, -0.0654F, 0.1618F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(114, 124).addBox(-1.6985F, -6.8976F, -1.7203F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 0.6505F, -0.0654F, 0.1618F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(124, 10).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2347F, -3.816F, 1.239F, 1.1165F, 0.0639F, 0.0248F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(61, 102).addBox(-0.5F, -1.6F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2212F, -2.6954F, 1.4626F, 0.6366F, 0.0639F, 0.0248F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(81, 79).addBox(-0.5F, -1.95F, -2.05F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0177F, -0.9237F, -2.4993F, -1.3182F, 0.0639F, 0.0248F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(59, 125).addBox(-1.1138F, -1.6965F, 5.1068F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(5, 122).addBox(-1.1138F, -3.4965F, 4.6068F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, -1.5607F, 0.0401F, -0.1744F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(32, 130).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3549F, 9.8627F, -8.1773F, -0.8626F, 0.0401F, -0.1744F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(71, 132).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4421F, 10.7024F, -8.3827F, -1.2989F, 0.0401F, -0.1744F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(142, 119).addBox(-1.1653F, 3.2802F, 5.6079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, -1.6043F, 0.0401F, -0.1744F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(47, 141).addBox(-1.1653F, 2.0677F, 6.2507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, -1.7789F, 0.0401F, -0.1744F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(37, 141).addBox(-1.1953F, 2.0606F, 5.8913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, -1.6387F, 0.034F, -0.1756F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(129, 15).addBox(-1.1953F, -6.3482F, -1.0566F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, -2.7732F, 0.034F, -0.1756F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(106, 12).addBox(-1.1953F, -6.4019F, -0.453F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, -2.9913F, 0.034F, -0.1756F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(142, 116).addBox(-1.1953F, 1.6896F, 5.6796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, -1.5515F, 0.034F, -0.1756F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(27, 130).addBox(-1.1138F, -0.6415F, -0.5708F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6847F, 7.7668F, -6.3308F, -0.6706F, 0.0401F, -0.1744F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(38, 50).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.379F, 9.5822F, -6.3745F, -0.3826F, 0.0401F, -0.1744F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(108, 119).addBox(-1.1193F, 2.5525F, -4.4007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, 0.7501F, 0.0624F, -0.1677F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(119, 62).addBox(-1.0906F, -0.9803F, 0.1521F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, -0.4014F, 0.0566F, -0.1698F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(124, 46).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0448F, 7.2544F, -5.1727F, -0.3141F, 0.0566F, -0.1698F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(132, 118).addBox(-1.1695F, -5.3464F, 0.8314F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, -0.1666F, 0.0673F, 0.0127F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(119, 50).addBox(-0.5F, -4.9F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.291F, 5.2034F, -4.0591F, -0.3586F, 0.0673F, 0.0127F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 111).addBox(-1.1694F, -3.6769F, -0.886F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.408F, 2.0823F, -4.233F, 0.2261F, 0.0673F, 0.0127F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(85, 118).addBox(-1.1695F, -4.1769F, 0.114F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2869F, 4.2819F, -5.6141F, -0.1666F, 0.0673F, 0.0127F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(94, 113).addBox(-1.0644F, -7.7146F, 2.6019F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, 0.1827F, 0.0647F, 0.0226F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(101, 119).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0545F, -3.9386F, -2.8245F, 0.0257F, 0.0639F, 0.0248F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(106, 24).addBox(-0.5F, -1.15F, 0.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0059F, -4.6424F, -4.0425F, -0.6288F, 0.0639F, 0.0248F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 80).addBox(-0.3844F, -0.3139F, -1.6767F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0524F, -5.1544F, -1.5189F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(119, 92).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.7046F, -6.1417F, -6.2915F, 1.2479F, -0.3289F, -0.3595F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(132, 113).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 132).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.14F, -6.0973F, -7.4399F, 2.1118F, -0.3289F, -0.3595F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(119, 57).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.227F, -8.4296F, -7.3399F, 1.7802F, -0.3289F, -0.3595F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(120, 123).addBox(-0.9819F, 0.011F, -1.9676F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2232F, -9.4231F, -5.6371F, 0.5847F, -0.3289F, -0.3595F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 109).addBox(0.0F, -0.1F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7648F, -9.2654F, -4.0966F, 1.6282F, -0.1207F, -0.3698F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(115, 6).addBox(0.1F, 0.225F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.284F, -9.5695F, -3.2537F, 0.2343F, -0.3037F, -0.3808F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(101, 79).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4292F, -8.8839F, 0.839F, -0.1871F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1827F, 5.2342F, 2.2492F, -0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(108, 38).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3668F, -9.0011F, -3.687F, -0.0038F, 0.0321F, 0.4016F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(63, 20).mirror().addBox(-0.4173F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -11.5578F, 5.3821F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4738F, -11.2492F, 0.6685F, -0.1696F, 0.0321F, 0.4016F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(49, 86).mirror().addBox(-0.5F, -1.7F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0322F, -7.752F, 3.957F, 0.3385F, 0.0327F, 0.4104F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(122, 5).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4313F, -6.5875F, 5.1659F, -0.8221F, 0.0327F, 0.4104F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(44, 115).mirror().addBox(-0.5F, -1.1F, -2.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3449F, -8.3536F, 5.3854F, 0.0942F, 0.0327F, 0.4104F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(87, 137).mirror().addBox(-0.5F, -0.9F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.144F, -7.6994F, 6.8348F, 1.7304F, 0.0391F, 0.4053F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(39, 126).mirror().addBox(-0.5F, -0.6F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.911F, -9.3423F, 8.2916F, 1.1196F, 0.0391F, 0.4053F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(126, 37).mirror().addBox(-0.5F, 0.9F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2538F, -10.3114F, 6.576F, 1.1196F, 0.0391F, 0.4053F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(26, 91).mirror().addBox(-0.5F, 0.075F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2797F, -10.5724F, 4.5533F, -0.1458F, 0.0391F, 0.4053F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(128, 142).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4577F, 4.1253F, 8.2731F, -1.5305F, 0.0028F, 0.1157F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(52, 141).mirror().addBox(0.0246F, 2.312F, 5.579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, -1.7829F, 3.9169F, -0.4833F, 0.0028F, 0.1157F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(79, 141).mirror().addBox(0.0246F, 3.4779F, -0.3617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, -0.0829F, 5.1169F, 0.6075F, 0.0028F, 0.1157F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(42, 142).mirror().addBox(-0.5F, 1.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 73).mirror().addBox(-0.5F, 0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1542F, 3.1467F, 6.9068F, 1.262F, 0.0055F, 0.1136F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(30, 115).mirror().addBox(0.0128F, -3.4771F, -1.1311F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 0.7171F, 5.9169F, 0.8256F, 0.0055F, 0.1136F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(103, 133).mirror().addBox(0.6492F, -5.1094F, -1.2359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 0.7171F, 5.9169F, 1.0611F, 0.0597F, -0.1639F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(140, 84).mirror().addBox(0.6492F, -5.227F, 0.0616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 0.7171F, 5.9169F, 1.3229F, 0.0597F, -0.1639F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(54, 94).mirror().addBox(0.6492F, -7.714F, -0.0681F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 0.7171F, 5.9169F, 1.1483F, 0.0597F, -0.1639F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(133, 76).mirror().addBox(0.3476F, -6.5347F, -4.632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 0.7171F, 5.9169F, 0.0441F, 0.0624F, -0.0919F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(122, 16).mirror().addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0233F, -3.2538F, 1.6844F, -0.2222F, 0.0654F, -0.1618F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(64, 133).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0233F, -3.2538F, 1.6844F, 0.1705F, 0.0654F, -0.1618F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(114, 124).mirror().addBox(0.6985F, -6.8976F, -1.7203F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 0.7171F, 5.9169F, 0.6505F, 0.0654F, -0.1618F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(124, 10).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2347F, -6.0656F, 1.1997F, 1.1165F, -0.0639F, -0.0248F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(61, 102).mirror().addBox(-0.5F, -1.6F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2212F, -4.9451F, 1.4233F, 0.6366F, -0.0639F, -0.0248F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(81, 79).mirror().addBox(-0.5F, -1.95F, -2.05F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0177F, -3.1734F, -2.5386F, -1.3182F, -0.0639F, -0.0248F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(59, 125).mirror().addBox(0.1138F, -1.6965F, 5.1068F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(5, 122).mirror().addBox(0.1138F, -3.4965F, 4.6068F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, -1.5607F, -0.0401F, 0.1744F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(32, 130).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3549F, 7.613F, -8.2166F, -0.8626F, -0.0401F, 0.1744F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(71, 132).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4421F, 8.4527F, -8.422F, -1.2989F, -0.0401F, 0.1744F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(142, 119).mirror().addBox(0.1653F, 3.2802F, 5.6079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, -1.6043F, -0.0401F, 0.1744F));

		PartDefinition cube_r86 = bone5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(47, 141).mirror().addBox(0.1653F, 2.0677F, 6.2507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, -1.7789F, -0.0401F, 0.1744F));

		PartDefinition cube_r87 = bone5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(37, 141).mirror().addBox(0.1953F, 2.0606F, 5.8913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, -1.6387F, -0.034F, 0.1756F));

		PartDefinition cube_r88 = bone5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(129, 15).mirror().addBox(0.1953F, -6.3482F, -1.0566F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, -2.7732F, -0.034F, 0.1756F));

		PartDefinition cube_r89 = bone5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(106, 12).mirror().addBox(0.1953F, -6.4019F, -0.453F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, -2.9913F, -0.034F, 0.1756F));

		PartDefinition cube_r90 = bone5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(142, 116).mirror().addBox(0.1953F, 1.6896F, 5.6796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, -1.5515F, -0.034F, 0.1756F));

		PartDefinition cube_r91 = bone5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(27, 130).mirror().addBox(0.1138F, -0.6415F, -0.5708F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6847F, 5.5172F, -6.37F, -0.6706F, -0.0401F, 0.1744F));

		PartDefinition cube_r92 = bone5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(38, 50).mirror().addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.379F, 7.3326F, -6.4137F, -0.3826F, -0.0401F, 0.1744F));

		PartDefinition cube_r93 = bone5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(108, 119).mirror().addBox(0.1193F, 2.5525F, -4.4007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, 0.7501F, -0.0624F, 0.1677F));

		PartDefinition cube_r94 = bone5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(119, 62).mirror().addBox(0.0906F, -0.9803F, 0.1521F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, -0.4014F, -0.0566F, 0.1698F));

		PartDefinition cube_r95 = bone5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(124, 46).mirror().addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0448F, 5.0047F, -5.212F, -0.3141F, -0.0566F, 0.1698F));

		PartDefinition cube_r96 = bone5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(132, 118).mirror().addBox(0.1695F, -5.3464F, 0.8314F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, -0.1666F, -0.0673F, -0.0127F));

		PartDefinition cube_r97 = bone5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(119, 50).mirror().addBox(-0.5F, -4.9F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.291F, 2.9538F, -4.0983F, -0.3586F, -0.0673F, -0.0127F));

		PartDefinition cube_r98 = bone5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(0.1694F, -3.6769F, -0.886F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.408F, -0.1673F, -4.2722F, 0.2261F, -0.0673F, -0.0127F));

		PartDefinition cube_r99 = bone5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 118).mirror().addBox(0.1695F, -4.1769F, 0.114F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 2.0322F, -5.6533F, -0.1666F, -0.0673F, -0.0127F));

		PartDefinition cube_r100 = bone5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(94, 113).mirror().addBox(0.0644F, -7.7146F, 2.6019F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 2.9742F, -5.9872F, 0.1827F, -0.0647F, -0.0226F));

		PartDefinition cube_r101 = bone5.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(101, 119).mirror().addBox(-0.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0545F, -6.1882F, -2.8638F, 0.0257F, -0.0639F, -0.0248F));

		PartDefinition cube_r102 = bone5.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(106, 24).mirror().addBox(-0.5F, -1.15F, 0.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0059F, -6.8921F, -4.0817F, -0.6288F, -0.0639F, -0.0248F));

		PartDefinition cube_r103 = bone5.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.6156F, -0.3139F, -1.6767F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0524F, -7.4041F, -1.5581F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r104 = bone5.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(119, 92).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7046F, -8.3914F, -6.3308F, 1.2479F, 0.3289F, 0.3595F));

		PartDefinition cube_r105 = bone5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(132, 113).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 132).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.14F, -8.347F, -7.4792F, 2.1118F, 0.3289F, 0.3595F));

		PartDefinition cube_r106 = bone5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(119, 57).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.227F, -10.6793F, -7.3791F, 1.7802F, 0.3289F, 0.3595F));

		PartDefinition cube_r107 = bone5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(120, 123).mirror().addBox(-0.0181F, 0.011F, -1.9676F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2232F, -11.6727F, -5.6763F, 0.5847F, 0.3289F, 0.3595F));

		PartDefinition cube_r108 = bone5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(32, 109).mirror().addBox(-1.0F, -0.1F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.7648F, -11.515F, -4.1359F, 1.6282F, 0.1207F, 0.3698F));

		PartDefinition cube_r109 = bone5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(115, 6).mirror().addBox(-1.1F, 0.225F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.284F, -11.8192F, -3.293F, 0.2343F, 0.3037F, 0.3808F));

		PartDefinition cube_r110 = bone5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(101, 79).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4292F, -11.1336F, 0.7998F, -0.1871F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.0295F, 1.4821F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(127, 73).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 12.9131F, -1.8377F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(115, 106).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, 13.8267F, -2.2445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(115, 12).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 14.3779F, -4.167F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(98, 54).addBox(-1.0F, -7.9F, -1.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 9.6208F, -2.2666F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(97, 40).addBox(-5.1F, -2.0807F, -2.518F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 12.3054F, -2.3045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(46, 126).addBox(-5.1F, -2.532F, 0.2317F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 12.2777F, -3.7694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(42, 130).addBox(-1.0F, -1.0F, 0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 10.1078F, -4.2797F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(54, 100).addBox(-1.0F, -8.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 10.1078F, -4.2797F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(20, 120).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 10.1078F, -4.2797F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(93, 133).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.3355F, -0.552F, -3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(37, 130).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 4.3355F, -0.552F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(61, 109).addBox(-5.1F, -2.0863F, -1.9195F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(70, 92).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1301F, 0.171F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(82, 28).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 2.0207F, -2.3915F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(113, 22).addBox(-1.0F, 0.7F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 1.0127F, -1.0785F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 14.6801F, -2.9149F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(115, 110).addBox(-1.1F, 1.5765F, -0.6545F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(65, 124).addBox(-1.1F, -0.8465F, -1.0797F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(85, 88).addBox(-1.0F, 0.1F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 1.1606F, -0.8554F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(105, 52).addBox(-1.0F, -0.425F, -0.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(88, 101).addBox(-0.1F, -0.5F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(70, 105).addBox(-0.1F, -1.175F, -2.875F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(105, 62).addBox(-0.1F, -0.5F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(129, 19).addBox(-1.1F, 8.9387F, 1.5893F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 111).addBox(-1.1F, 6.1996F, -0.2091F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(68, 110).addBox(-1.0F, -3.0F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3F, 6.6262F, -0.2001F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(122, 26).addBox(-1.1F, -1.1916F, 0.5297F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(30, 77).addBox(-1.1F, -0.8318F, 0.0813F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(124, 62).addBox(-1.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.0471F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(122, 69).addBox(-1.1F, -0.009F, -0.9593F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4F, 7.8674F, 0.2497F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 118).addBox(-1.1F, -0.209F, -0.1593F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.0197F, -0.0418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(97, 8).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightLeg3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(137, 80).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r142 = rightLeg3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(5, 129).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(55, 65).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 0.192F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(48, 2).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.0295F, 1.4821F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftLeg1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(17, 130).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 12.9131F, -1.8377F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftLeg1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(117, 79).addBox(-0.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0F, 13.8267F, -2.2445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftLeg1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(117, 37).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 14.3779F, -4.167F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftLeg1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(98, 64).addBox(-1.0F, -7.9F, -1.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 9.6208F, -2.2666F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftLeg1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(9, 100).addBox(3.1F, -2.0807F, -2.518F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 12.3054F, -2.3045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftLeg1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(129, 4).addBox(3.1F, -2.532F, 0.2317F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 12.2777F, -3.7694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftLeg1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(126, 131).addBox(-1.0F, -1.0F, 0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 10.1078F, -4.2797F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftLeg1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(81, 101).addBox(-1.0F, -8.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 10.1078F, -4.2797F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftLeg1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(122, 21).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 10.1078F, -4.2797F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftLeg1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(98, 133).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.3355F, -0.552F, -3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftLeg1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(131, 101).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.3355F, -0.552F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftLeg1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(53, 110).addBox(3.1F, -2.0863F, -1.9195F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftLeg1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(37, 96).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.1301F, 0.171F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftLeg1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(85, 70).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 2.0207F, -2.3915F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftLeg1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(113, 27).addBox(-1.0F, 0.7F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.0127F, -1.0785F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.6801F, -2.9149F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftLeg2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(117, 99).addBox(-0.9F, 1.5765F, -0.6545F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftLeg2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(107, 124).addBox(-0.9F, -0.8465F, -1.0797F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r160 = leftLeg2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(90, 2).addBox(-1.0F, 0.1F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.1606F, -0.8554F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftLeg2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(105, 57).addBox(-1.0F, -0.425F, -0.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftLeg2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(103, 0).addBox(-1.9F, -0.5F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftLeg2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 106).addBox(-1.9F, -1.175F, -2.875F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftLeg2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(105, 67).addBox(-1.9F, -0.5F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftLeg2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(129, 23).addBox(-0.9F, 8.9387F, 1.5893F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftLeg2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(20, 113).addBox(-0.9F, 6.1996F, -0.2091F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftLeg2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(110, 79).addBox(-1.0F, -3.0F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3F, 6.6262F, -0.2001F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftLeg2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(72, 123).addBox(-0.9F, -1.1916F, 0.5297F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftLeg2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(37, 81).addBox(-0.9F, -0.8318F, 0.0813F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftLeg2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(124, 102).addBox(0.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.0471F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftLeg2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(27, 123).addBox(0.1F, -0.009F, -0.9593F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4F, 7.8674F, 0.2497F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftLeg2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(51, 118).addBox(0.1F, -0.209F, -0.1593F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.0197F, -0.0418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(26, 98).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftLeg3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(82, 137).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r174 = leftLeg3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(129, 45).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(67, 48).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 0.4974F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(44, 48).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.5635F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1626F, 8.8231F, -0.3255F, 0.1241F, -0.0417F));

		PartDefinition cube_r175 = tail1.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(131, 8).addBox(0.0F, -0.6F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2878F, 8.5295F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail1.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(34, 137).addBox(0.5F, -1.4129F, -2.1754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8299F, 3.2583F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail1.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(134, 86).addBox(0.5F, 0.5871F, -0.1754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8299F, 3.2583F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail1.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(116, 130).addBox(0.5F, 0.2871F, -0.8754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.096F, 5.5805F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail1.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(27, 113).addBox(0.5F, -7.6573F, -1.1162F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 115).addBox(0.5F, -7.5573F, 0.8838F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1588F, 6.7807F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail1.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(49, 94).addBox(0.5F, -8.5073F, -1.0162F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5208F, 3.7257F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail1.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(93, 54).addBox(0.497F, -8.8323F, -2.0162F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2471F, 1.7357F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail1.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(38, 55).mirror().addBox(-2.3F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0111F, -0.1038F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r183 = tail1.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(38, 55).addBox(-0.7F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0111F, -0.1038F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r184 = tail1.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(21, 27).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.4998F, 8.6946F, 0.044F, 0.0869F, 0.0076F));

		PartDefinition cube_r185 = tail.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(63, 30).mirror().addBox(-2.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition cube_r186 = tail.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(63, 30).addBox(0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition cube_r187 = tail.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(38, 63).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(76, 132).addBox(0.0F, -0.3F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3858F, 7.2538F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(137, 84).addBox(0.0F, 0.4F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(26, 85).addBox(0.0F, 0.6F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(56, 118).addBox(0.5F, -6.0073F, -0.0162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 4.7753F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(35, 115).addBox(0.5F, -6.5823F, -0.0162F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 2.8025F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(41, 109).addBox(0.5F, -7.0073F, -0.0162F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, 0.8174F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1747F, 0.043F, 0.0076F));

		PartDefinition cube_r194 = tail2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(110, 129).addBox(0.0F, -5.0561F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 6.0228F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(79, 127).addBox(0.0F, -5.0561F, 0.0684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 3.9307F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(23, 100).addBox(0.0F, -5.1061F, -0.1316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 2.1376F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(24, 125).addBox(0.0F, -5.3811F, 0.0684F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, -0.054F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(59, 55).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(10, 134).addBox(0.0F, -0.7F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6829F, 2.6142F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(134, 8).addBox(0.0F, -1.2F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2847F, 6.9508F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(133, 131).addBox(0.0F, -0.3F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4489F, 4.2971F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-1.6F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, -0.4738F, 1.0278F, 0.0175F, 0.0262F, 0.0005F));

		PartDefinition cube_r203 = tail2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(19, 60).addBox(-0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5302F, -0.4738F, 1.0278F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0786F, -0.0435F, -0.0034F));

		PartDefinition cube_r204 = tail8.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-1.4F, 0.0F, -1.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r205 = tail8.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-1.3F, 0.0F, 0.9F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3334F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r206 = tail8.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(65, 38).addBox(-0.7F, 0.0F, 0.9F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3334F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r207 = tail8.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(65, 38).addBox(-0.6F, 0.0F, -1.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r208 = tail8.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(23, 39).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail8.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(34, 143).addBox(0.0F, -0.7624F, -0.4967F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 8.89F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail8.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(48, 121).addBox(0.0F, 0.1188F, -0.2483F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 5.89F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail8.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(49, 81).addBox(0.0F, 0.0396F, -0.7495F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 3.89F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r212 = tail8.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(11, 80).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2632F, 1.244F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail8.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(61, 131).addBox(0.0F, -4.4462F, -0.0313F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 7.8984F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r214 = tail8.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(113, 130).addBox(0.0F, -4.3811F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 5.8984F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r215 = tail8.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(85, 130).addBox(0.0F, -4.4561F, -0.1316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 3.9984F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r216 = tail8.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(82, 130).addBox(0.0F, -4.4061F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 1.8984F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail8.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(49, 130).addBox(0.0F, -4.4561F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, -0.1016F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0964F, -0.0869F, -0.0084F));

		PartDefinition cube_r218 = tail3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(79, 134).addBox(0.0F, -3.7128F, 0.0016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 6.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(134, 66).addBox(0.0F, -3.7628F, 0.0016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 4.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(134, 45).addBox(0.0F, -3.8628F, 0.0016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 2.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(13, 134).addBox(0.0F, -4.0128F, 0.0016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 0.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r222 = tail3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(87, 141).addBox(0.0F, 2.3F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 141).addBox(0.0F, 1.3F, 1.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 139).addBox(0.0F, -0.1F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r223 = tail3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-1.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r224 = tail3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(44, 38).addBox(0.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r225 = tail3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(42, 27).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r226 = tail9.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(70, 71).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r227 = tail9.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(96, 141).addBox(0.0F, -2.75F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 4.0517F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r228 = tail9.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(93, 141).addBox(0.0F, -3.025F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 2.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r229 = tail9.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(46, 103).addBox(0.0F, 7.3F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 145).addBox(0.0F, 5.8F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 141).addBox(0.0F, 3.8F, 5.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r230 = tail9.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(134, 80).addBox(0.0F, -3.025F, -0.025F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 0.0827F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r231 = tail4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(141, 102).addBox(0.0F, -2.125F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 4.0293F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r232 = tail4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(102, 141).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 2.0305F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r233 = tail4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(99, 141).addBox(0.0F, -2.5F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r234 = tail4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(17, 121).addBox(0.0F, 0.35F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 83).addBox(0.0F, -1.05F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r235 = tail4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(55, 71).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.1445F, -0.2592F, 0.0373F));

		PartDefinition cube_r236 = tail5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(15, 145).addBox(0.0F, -1.6909F, 0.016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4698F, 3.7774F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r237 = tail5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(27, 145).addBox(0.0F, -2.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 145).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2698F, -0.2226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r238 = tail5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(143, 144).addBox(0.0F, 3.75F, 6.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 46).addBox(0.0F, 1.45F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r239 = tail5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(30, 144).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4277F, 2.9853F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(19, 50).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 5.6774F, -0.1445F, -0.2592F, 0.0373F));

		PartDefinition cube_r240 = tail6.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(119, 69).addBox(0.0F, 8.35F, 12.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 41).addBox(0.0F, 6.95F, 10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 74).addBox(0.0F, 5.85F, 8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1693F, -8.5969F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r241 = tail6.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(145, 38).addBox(0.0F, -1.8909F, 7.916F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 32).addBox(0.0F, -1.8909F, 5.916F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 145).addBox(0.0F, -1.7909F, 3.916F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 145).addBox(0.0F, -1.6909F, 1.916F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0359F, -1.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(38, 73).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1772F, 0.1719F, -0.0306F));

		PartDefinition cube_r242 = tail7.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(145, 29).addBox(0.0F, 10.65F, 16.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 122).addBox(0.0F, 9.65F, 14.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1693F, -16.4969F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r243 = tail7.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(57, 145).addBox(0.0F, -0.4774F, 0.0009F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0803F, 2.0101F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r244 = tail7.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(42, 145).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0803F, 0.5101F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(15, 77).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0223F, 5.9976F, -0.1554F, 0.302F, -0.0466F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(70, 99).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.1787F, 0.2148F, -0.0385F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 85).addBox(-0.003F, -12.6508F, -4.8856F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, -0.0524F, 0.0436F, -0.0023F));

		PartDefinition cube_r245 = body.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(16, 85).addBox(-0.503F, -11.1272F, -2.0364F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3533F, -5.8465F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r246 = body.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(11, 85).addBox(-0.503F, -11.5522F, -0.0364F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1091F, -1.8541F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r247 = body.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r248 = body.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 39).addBox(-3.5F, -2.5F, -1.5F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4895F, -5.9428F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r249 = body.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(137, 8).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.0024F, 0.023F, -0.6447F));

		PartDefinition cube_r250 = body.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(103, 99).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, -0.0076F, 0.0218F, -1.0812F));

		PartDefinition cube_r251 = body.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(113, 77).mirror().addBox(-6.74F, -2.3355F, -0.4915F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, -0.0185F, 0.0139F, -1.6746F));

		PartDefinition cube_r252 = body.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(137, 10).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.1093F, -0.0609F, -0.6426F));

		PartDefinition cube_r253 = body.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(124, 107).mirror().addBox(-5.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.004F, -0.125F, -1.6754F));

		PartDefinition cube_r254 = body.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(105, 72).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0734F, -0.1013F, -1.0785F));

		PartDefinition cube_r255 = body.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(137, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.0623F, 0.0757F, -0.4866F));

		PartDefinition cube_r256 = body.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(27, 137).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.0244F, 0.095F, -0.9241F));

		PartDefinition cube_r257 = body.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(88, 52).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, -0.033F, 0.0923F, -1.5202F));

		PartDefinition cube_r258 = body.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(88, 52).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, -0.033F, -0.0923F, 1.5202F));

		PartDefinition cube_r259 = body.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(27, 137).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.0244F, -0.095F, 0.9241F));

		PartDefinition cube_r260 = body.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(137, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.0623F, -0.0757F, 0.4866F));

		PartDefinition cube_r261 = body.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(105, 72).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0734F, 0.1013F, 1.0785F));

		PartDefinition cube_r262 = body.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(124, 107).addBox(2.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.004F, 0.125F, 1.6754F));

		PartDefinition cube_r263 = body.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(137, 10).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.1093F, 0.0609F, 0.6426F));

		PartDefinition cube_r264 = body.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(113, 77).addBox(2.74F, -2.3355F, -0.4915F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, -0.0185F, -0.0139F, 1.6746F));

		PartDefinition cube_r265 = body.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(103, 99).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, -0.0076F, -0.0218F, 1.0812F));

		PartDefinition cube_r266 = body.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(137, 8).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.0024F, -0.023F, 0.6447F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.0002F, -9.1192F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4765F, -7.7702F, 0.1489F, 0.0863F, 0.0129F));

		PartDefinition cube_r267 = body2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(44, 81).addBox(0.0F, -10.9122F, -1.0627F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0104F, -2.0137F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r268 = body2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 88).addBox(0.0F, -10.1117F, -0.8614F, 0.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1006F, -8.2142F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r269 = body2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(60, 86).addBox(0.0F, -10.7367F, -0.9614F, 0.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -5.1143F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r270 = body2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -5.0192F, 0.0338F, 0.1886F, -1.3948F));

		PartDefinition cube_r271 = body2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(133, 106).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -5.0192F, 0.134F, 0.1373F, -0.7953F));

		PartDefinition cube_r272 = body2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(134, 72).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -5.0192F, 0.1792F, 0.0682F, -0.3621F));

		PartDefinition cube_r273 = body2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(134, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -8.0192F, 0.2595F, 0.1034F, -0.3208F));

		PartDefinition cube_r274 = body2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(134, 123).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -8.0192F, 0.1928F, 0.2028F, -0.751F));

		PartDefinition cube_r275 = body2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-14.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -8.0192F, 0.0447F, 0.2754F, -1.3579F));

		PartDefinition cube_r276 = body2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9998F, -2.0192F, -0.008F, 0.0468F, -1.4493F));

		PartDefinition cube_r277 = body2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(124, 134).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9998F, -2.0192F, 0.0196F, 0.0432F, -0.8553F));

		PartDefinition cube_r278 = body2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(134, 125).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9998F, -2.0192F, 0.036F, 0.0309F, -0.4188F));

		PartDefinition cube_r279 = body2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(134, 125).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9998F, -2.0192F, 0.036F, -0.0309F, 0.4188F));

		PartDefinition cube_r280 = body2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(21, 15).addBox(-3.5F, -1.4555F, -5.2635F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.5458F, -3.2995F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r281 = body2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(124, 134).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9998F, -2.0192F, 0.0196F, -0.0432F, 0.8553F));

		PartDefinition cube_r282 = body2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(0, 36).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9998F, -2.0192F, -0.008F, -0.0468F, 1.4493F));

		PartDefinition cube_r283 = body2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(50, 18).addBox(2.6881F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -8.0192F, 0.0447F, -0.2754F, 1.3579F));

		PartDefinition cube_r284 = body2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(134, 123).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -8.0192F, 0.1928F, -0.2028F, 0.751F));

		PartDefinition cube_r285 = body2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(134, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -8.0192F, 0.2595F, -0.1034F, 0.3208F));

		PartDefinition cube_r286 = body2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(134, 72).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -5.0192F, 0.1792F, -0.0682F, 0.3621F));

		PartDefinition cube_r287 = body2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(133, 106).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -5.0192F, 0.134F, -0.1373F, 0.7953F));

		PartDefinition cube_r288 = body2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 70).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -5.0192F, 0.0338F, -0.1886F, 1.3948F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2537F, -9.0204F, 0.0613F, -0.0871F, -0.0053F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(120, 83).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9391F, -1.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(20, 100).addBox(0.0F, -9.5525F, -0.1399F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -1.8368F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(82, 111).addBox(0.0F, -8.7217F, -0.0424F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -3.9368F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(77, 16).addBox(-4.9578F, 0.381F, -1.2175F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9578F, 12.4683F, -5.8159F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-6.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6566F, 13.5622F, -5.1723F, 0.1884F, 1.0215F, 0.2353F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(90, 46).mirror().addBox(-4.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.131F, 13.3086F, -5.4692F, 0.131F, 0.8933F, 0.7434F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(53, 79).mirror().addBox(-1.421F, 0.574F, -5.4383F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9578F, 12.4683F, -5.8159F, -0.5214F, -0.424F, 0.2321F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(134, 127).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.2447F, 0.0896F, -0.2705F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(134, 129).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.185F, 0.1841F, -0.7008F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-15.6882F, -2.8327F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.0492F, 0.2557F, -1.305F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(65, 46).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.0622F, 0.2879F, -1.3553F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.2142F, 0.2035F, -0.749F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(135, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.2789F, 0.0953F, -0.3212F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.0789F, 0.3187F, -1.3876F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(27, 135).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.2455F, 0.2197F, -0.7796F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(135, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.3137F, 0.0974F, -0.3551F));

		PartDefinition cube_r305 = chest.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(135, 33).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.3582F, 0.1259F, -0.4373F));

		PartDefinition cube_r306 = chest.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(34, 135).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.275F, 0.2638F, -0.8597F));

		PartDefinition cube_r307 = chest.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 77).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.0768F, 0.3713F, -1.4754F));

		PartDefinition cube_r308 = chest.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(85, 77).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.0768F, -0.3713F, 1.4754F));

		PartDefinition cube_r309 = chest.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(34, 135).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.275F, -0.2638F, 0.8597F));

		PartDefinition cube_r310 = chest.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(135, 33).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.3582F, -0.1259F, 0.4373F));

		PartDefinition cube_r311 = chest.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(116, 50).addBox(0.0F, -7.7927F, -0.2837F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -7.7368F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r312 = chest.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(135, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.3137F, -0.0974F, 0.3551F));

		PartDefinition cube_r313 = chest.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(27, 135).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.2455F, -0.2197F, 0.7796F));

		PartDefinition cube_r314 = chest.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 34).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.0789F, -0.3187F, 1.3876F));

		PartDefinition cube_r315 = chest.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(135, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.2789F, -0.0953F, 0.3212F));

		PartDefinition cube_r316 = chest.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(135, 0).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.2142F, -0.2035F, 0.749F));

		PartDefinition cube_r317 = chest.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(65, 46).addBox(2.6881F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.0622F, -0.2879F, 1.3553F));

		PartDefinition cube_r318 = chest.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(48, 0).addBox(2.6881F, -2.8327F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.0492F, -0.2557F, 1.305F));

		PartDefinition cube_r319 = chest.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(134, 129).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.185F, -0.1841F, 0.7008F));

		PartDefinition cube_r320 = chest.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(71, 2).addBox(-3.0F, 0.6117F, -7.416F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.8118F, 4.1957F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r321 = chest.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(134, 127).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.2447F, -0.0896F, 0.2705F));

		PartDefinition cube_r322 = chest.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(7, 111).addBox(0.0F, -8.3926F, -0.2837F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -5.7368F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r323 = chest.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(53, 79).addBox(-0.579F, 0.574F, -5.4383F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9578F, 12.4683F, -5.8159F, -0.5214F, 0.424F, -0.2321F));

		PartDefinition cube_r324 = chest.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(90, 46).addBox(-0.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.131F, 13.3086F, -5.4692F, 0.131F, -0.8933F, -0.7434F));

		PartDefinition cube_r325 = chest.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(77, 0).addBox(-1.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6566F, 13.5622F, -5.1723F, 0.1884F, -1.0215F, -0.2353F));

		PartDefinition cube_r326 = chest.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(84, 40).addBox(-2.9578F, 0.574F, -4.9964F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9578F, 12.4683F, -5.8159F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r327 = chest.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(23, 68).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1609F, -2.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5554F, 6.4552F, -6.61F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r328 = bone2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(143, 60).addBox(-0.5F, -0.6F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5557F, 1.9735F, -3.039F, -1.4616F, -0.0083F, -0.0153F));

		PartDefinition cube_r329 = bone2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(143, 57).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5557F, 1.9735F, -3.039F, -0.6763F, -0.0083F, -0.0153F));

		PartDefinition cube_r330 = bone2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(143, 54).addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5435F, 2.1091F, -1.3327F, -0.1963F, -0.0083F, -0.0153F));

		PartDefinition cube_r331 = bone2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(143, 51).addBox(-0.5F, -0.4F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5278F, 1.6174F, -0.3438F, 0.3709F, -0.0083F, -0.0153F));

		PartDefinition cube_r332 = bone2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(78, 62).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4576F, -1.0552F, 3.1589F, 1.0254F, -0.0083F, -0.0153F));

		PartDefinition cube_r333 = bone2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(131, 61).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3507F, -6.9961F, 5.0453F, -0.3883F, -0.0083F, -0.0153F));

		PartDefinition cube_r334 = bone2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(143, 76).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3434F, -6.9307F, 6.0431F, -0.0654F, -0.0083F, -0.0153F));

		PartDefinition cube_r335 = bone2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(143, 63).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3535F, -6.0339F, 6.4854F, 0.4582F, -0.0083F, -0.0153F));

		PartDefinition cube_r336 = bone2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(96, 129).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3879F, -4.4744F, 5.2337F, 0.8945F, -0.0083F, -0.0153F));

		PartDefinition cube_r337 = bone2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(85, 113).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5087F, 1.1999F, 1.1811F, 0.8509F, -0.0083F, -0.0153F));

		PartDefinition cube_r338 = bone2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(143, 96).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5264F, 1.9537F, 0.4401F, -2.3779F, -0.0083F, -0.0153F));

		PartDefinition cube_r339 = bone2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(143, 93).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5422F, 2.5449F, -0.3662F, -0.9381F, -0.0083F, -0.0153F));

		PartDefinition cube_r340 = bone2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(143, 90).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.555F, 2.8662F, -1.3131F, 0.3273F, -0.0083F, -0.0153F));

		PartDefinition cube_r341 = bone2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(113, 72).addBox(-0.4437F, -1.5801F, -4.0401F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.441F, 1.1053F, 2.3677F, 0.5891F, -0.0083F, -0.0153F));

		PartDefinition cube_r342 = bone2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(143, 20).addBox(0.5946F, -0.5401F, -4.8678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.441F, 1.1053F, 2.3677F, 0.3713F, 0.2389F, 0.0907F));

		PartDefinition cube_r343 = bone2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(106, 6).addBox(-0.1317F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.0351F, 0.5144F, 1.282F));

		PartDefinition cube_r344 = bone2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(111, 87).addBox(-1.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.159F, 0.4925F, 0.8837F));

		PartDefinition cube_r345 = bone2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(120, 88).addBox(-1.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.5827F, 0.4925F, 0.8837F));

		PartDefinition cube_r346 = bone2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(90, 120).addBox(-1.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 1.2372F, 0.4925F, 0.8837F));

		PartDefinition cube_r347 = bone2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(143, 17).addBox(0.6244F, -1.0239F, -4.9891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.441F, 1.1053F, 2.3677F, 0.4019F, 0.2124F, 0.1427F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5554F, 6.4552F, -6.61F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r348 = bone4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(143, 60).mirror().addBox(-0.5F, -0.6F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5557F, 1.9735F, -3.039F, -1.4616F, 0.0083F, 0.0153F));

		PartDefinition cube_r349 = bone4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(143, 57).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5557F, 1.9735F, -3.039F, -0.6763F, 0.0083F, 0.0153F));

		PartDefinition cube_r350 = bone4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(143, 54).mirror().addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5435F, 2.1091F, -1.3327F, -0.1963F, 0.0083F, 0.0153F));

		PartDefinition cube_r351 = bone4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(143, 51).mirror().addBox(-0.5F, -0.4F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5278F, 1.6174F, -0.3438F, 0.3709F, 0.0083F, 0.0153F));

		PartDefinition cube_r352 = bone4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, -1.0552F, 3.1589F, 1.0254F, 0.0083F, 0.0153F));

		PartDefinition cube_r353 = bone4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(131, 61).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3507F, -6.9961F, 5.0453F, -0.3883F, 0.0083F, 0.0153F));

		PartDefinition cube_r354 = bone4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(143, 76).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3434F, -6.9307F, 6.0431F, -0.0654F, 0.0083F, 0.0153F));

		PartDefinition cube_r355 = bone4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(143, 63).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3535F, -6.0339F, 6.4854F, 0.4582F, 0.0083F, 0.0153F));

		PartDefinition cube_r356 = bone4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(96, 129).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3879F, -4.4744F, 5.2337F, 0.8945F, 0.0083F, 0.0153F));

		PartDefinition cube_r357 = bone4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(85, 113).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5087F, 1.1999F, 1.1811F, 0.8509F, 0.0083F, 0.0153F));

		PartDefinition cube_r358 = bone4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(143, 96).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5264F, 1.9537F, 0.4401F, -2.3779F, 0.0083F, 0.0153F));

		PartDefinition cube_r359 = bone4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(143, 93).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5422F, 2.5449F, -0.3662F, -0.9381F, 0.0083F, 0.0153F));

		PartDefinition cube_r360 = bone4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(143, 90).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.555F, 2.8662F, -1.3131F, 0.3273F, 0.0083F, 0.0153F));

		PartDefinition cube_r361 = bone4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(113, 72).mirror().addBox(-0.5563F, -1.5801F, -4.0401F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.441F, 1.1053F, 2.3677F, 0.5891F, 0.0083F, 0.0153F));

		PartDefinition cube_r362 = bone4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(143, 20).mirror().addBox(-1.5946F, -0.5401F, -4.8678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.441F, 1.1053F, 2.3677F, 0.3713F, -0.2389F, -0.0907F));

		PartDefinition cube_r363 = bone4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(106, 6).mirror().addBox(-0.8683F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.0351F, -0.5144F, -1.282F));

		PartDefinition cube_r364 = bone4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(111, 87).mirror().addBox(0.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.159F, -0.4925F, -0.8837F));

		PartDefinition cube_r365 = bone4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(120, 88).mirror().addBox(0.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.5827F, -0.4925F, -0.8837F));

		PartDefinition cube_r366 = bone4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(90, 120).mirror().addBox(0.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 1.2372F, -0.4925F, -0.8837F));

		PartDefinition cube_r367 = bone4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(143, 17).mirror().addBox(-1.6244F, -1.0239F, -4.9891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.441F, 1.1053F, 2.3677F, 0.4019F, -0.2124F, -0.1427F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4521F, 10.6037F, -9.0593F, 0.8179F, 0.3634F, -0.2297F));

		PartDefinition cube_r368 = leftArm1.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(142, 42).addBox(-0.2F, 0.075F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3037F, 0.0186F, 0.0503F, -0.1045F, -0.2207F, -0.0253F));

		PartDefinition cube_r369 = leftArm1.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(112, 141).addBox(-0.2F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3037F, 0.0186F, 0.0503F, -0.8463F, -0.2207F, -0.0253F));

		PartDefinition cube_r370 = leftArm1.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(136, 14).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r371 = leftArm1.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(136, 4).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r372 = leftArm1.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(135, 40).addBox(6.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2F, 1.1847F, -1.6107F, -0.4204F, -0.0786F, -0.067F));

		PartDefinition cube_r373 = leftArm1.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(141, 107).addBox(-0.5F, -0.425F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3F, 3.8414F, -0.3535F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r374 = leftArm1.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(5, 135).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3F, 3.5346F, 0.1087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(0, 126).addBox(-0.8F, -1.5307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 133).addBox(-0.8F, -0.4307F, -1.5734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5845F, 5.336F, -1.548F, -1.2246F, 0.0156F, 0.0164F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0484F, 2.5843F, 0.3278F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r375 = leftHand.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(92, 79).addBox(0.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r376 = leftHand.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(108, 113).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4521F, 10.6037F, -9.0593F, 1.1548F, -0.1327F, 0.1795F));

		PartDefinition cube_r377 = rightArm1.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(142, 110).addBox(-0.8F, 0.075F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3037F, 0.0186F, 0.0503F, -0.1045F, 0.2207F, 0.0253F));

		PartDefinition cube_r378 = rightArm1.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(142, 80).addBox(-0.8F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3037F, 0.0186F, 0.0503F, -0.8463F, 0.2207F, 0.0253F));

		PartDefinition cube_r379 = rightArm1.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(64, 137).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r380 = rightArm1.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(52, 137).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r381 = rightArm1.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(47, 137).addBox(-7.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2F, 1.1847F, -1.6107F, -0.4204F, 0.0786F, 0.067F));

		PartDefinition cube_r382 = rightArm1.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(72, 142).addBox(-0.5F, -0.425F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3F, 3.8414F, -0.3535F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r383 = rightArm1.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(137, 44).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3F, 3.5346F, 0.1087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(53, 127).addBox(-0.2F, -1.5307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 35).addBox(-0.2F, -0.4307F, -1.5734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5845F, 5.336F, -1.548F, -1.2246F, -0.0156F, -0.0164F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0484F, 2.5843F, 0.3278F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r384 = rightHand.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(0, 97).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r385 = rightHand.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(114, 0).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8698F, -7.7672F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r386 = neck1.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(116, 60).addBox(0.0F, -7.0459F, -0.016F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r387 = neck1.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0549F, 0.9381F, -1.6998F));

		PartDefinition cube_r388 = neck1.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(136, 18).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.6804F, 0.7081F, -0.8741F));

		PartDefinition cube_r389 = neck1.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(136, 20).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.8756F, 0.3979F, -0.5097F));

		PartDefinition cube_r390 = neck1.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(136, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.8756F, -0.3979F, 0.5097F));

		PartDefinition cube_r391 = neck1.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(136, 18).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.6804F, -0.7081F, 0.8741F));

		PartDefinition cube_r392 = neck1.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(94, 0).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0549F, -0.9381F, 1.6998F));

		PartDefinition cube_r393 = neck1.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(23, 107).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.387F, -0.1213F, -0.0493F));

		PartDefinition cube_r394 = neck2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(97, 120).addBox(0.0F, -6.1816F, -0.0991F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r395 = neck2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(136, 22).mirror().addBox(-1.9081F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.2054F, 0.5609F, -1.0212F));

		PartDefinition cube_r396 = neck2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(94, 17).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0822F, 0.5885F, -1.5418F));

		PartDefinition cube_r397 = neck2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(94, 17).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0822F, -0.5885F, 1.5418F));

		PartDefinition cube_r398 = neck2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(136, 22).addBox(-0.0919F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.2054F, -0.5609F, 1.0212F));

		PartDefinition cube_r399 = neck2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(11, 106).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.3124F, -0.055F, -0.0281F));

		PartDefinition cube_r400 = neck5.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(88, 107).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r401 = neck5.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(99, 38).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, -0.2704F, 1.1208F, -1.6737F));

		PartDefinition cube_r402 = neck5.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(136, 24).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, 0.581F, 1.0455F, -0.7259F));

		PartDefinition cube_r403 = neck5.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(136, 26).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, 0.463F, 0.9843F, -0.8263F));

		PartDefinition cube_r404 = neck5.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(124, 67).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, -0.2529F, 1.0339F, -1.6583F));

		PartDefinition cube_r405 = neck5.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(124, 67).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, -0.2529F, -1.0339F, 1.6583F));

		PartDefinition cube_r406 = neck5.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(136, 26).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, 0.463F, -0.9843F, 0.8263F));

		PartDefinition cube_r407 = neck5.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(136, 24).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, 0.581F, -1.0455F, 0.7259F));

		PartDefinition cube_r408 = neck5.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(99, 38).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, -0.2704F, -1.1208F, 1.6737F));

		PartDefinition cube_r409 = neck5.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(10, 112).addBox(0.0F, -5.9566F, -1.1491F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r410 = neck5.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(79, 118).addBox(0.0F, -5.8566F, -0.1491F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, 0.1134F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.083F, -0.1364F, -0.0205F));

		PartDefinition cube_r411 = neck4.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(136, 28).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r412 = neck4.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(136, 51).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r413 = neck4.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(136, 53).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.508F, 0.9362F, -0.7795F));

		PartDefinition cube_r414 = neck4.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(136, 60).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1513F, 1.0193F, -1.5615F));

		PartDefinition cube_r415 = neck4.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(136, 60).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1513F, -1.0193F, 1.5615F));

		PartDefinition cube_r416 = neck4.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(136, 53).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.508F, -0.9362F, 0.7795F));

		PartDefinition cube_r417 = neck4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(136, 51).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r418 = neck4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(136, 28).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r419 = neck4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(15, 112).addBox(0.0F, -4.7677F, -0.0582F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9211F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r420 = neck4.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(93, 20).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.5219F, -0.1028F, -0.1577F));

		PartDefinition cube_r421 = neck3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(136, 62).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r422 = neck3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(136, 64).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r423 = neck3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(136, 64).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r424 = neck3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(136, 62).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r425 = neck3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(115, 116).addBox(0.5F, -4.469F, -0.9772F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r426 = neck3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(81, 94).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.2768F, -0.2101F, 0.0592F));

		PartDefinition cube_r427 = neck.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(136, 96).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r428 = neck.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(136, 98).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r429 = neck.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(136, 98).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r430 = neck.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(60, 117).addBox(0.5F, -3.9207F, -0.2014F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r431 = neck.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(97, 107).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r432 = neck.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(136, 96).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.1672F, -0.1291F, -0.0217F));

		PartDefinition cube_r433 = neck6.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(136, 100).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.5254F, 0.741F, -0.9857F));

		PartDefinition cube_r434 = neck6.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0783F, 0.876F, -1.5935F));

		PartDefinition cube_r435 = neck6.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(71, 16).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0783F, -0.876F, 1.5935F));

		PartDefinition cube_r436 = neck6.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(129, 136).addBox(0.5F, -2.8207F, 0.8986F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -3.0498F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r437 = neck6.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(142, 30).addBox(0.5F, -1.6207F, -0.0014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -3.0498F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r438 = neck6.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(58, 131).addBox(0.5F, -3.6207F, -0.0014F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -1.0498F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r439 = neck6.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(92, 94).addBox(0.0F, 1.3815F, -4.2683F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r440 = neck6.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(136, 100).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5086F, -3.6306F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(99, 34).addBox(-2.0F, -0.831F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F))
				.texOffs(98, 88).addBox(-2.0F, -1.1311F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -1.4099F, -2.6888F, -1.7322F, 0.0F, 0.0F));

		PartDefinition cube_r442 = head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(113, 17).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.4768F, -2.8128F, -1.549F, 0.0F, 0.0F));

		PartDefinition cube_r443 = head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(102, 74).addBox(-1.5F, -0.038F, -0.1197F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.3269F, -5.7461F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r444 = head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(104, 17).addBox(-1.0F, 0.0045F, 0.0259F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1269F, -7.6461F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r445 = head.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(97, 137).addBox(-0.5025F, 0.0035F, -1.0106F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 0.3905F, -12.6819F, 1.8195F, 0.0F, 0.0F));

		PartDefinition cube_r446 = head.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(62, 144).addBox(-0.5025F, -0.0264F, 0.02F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0025F, 0.8828F, -13.5754F, 0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r447 = head.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(93, 67).addBox(-0.5025F, -1.0232F, -0.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 1.4828F, -14.3754F, -0.9381F, 0.0F, 0.0F));

		PartDefinition cube_r448 = head.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(138, 90).addBox(-0.5025F, -1.0206F, -0.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0025F, 2.2328F, -15.0254F, -0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r449 = head.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(137, 48).addBox(-0.4975F, 0.7508F, -1.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 2.3078F, -13.8504F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r450 = head.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(137, 120).addBox(-0.4975F, -1.0373F, -0.0093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, 3.1578F, -15.4504F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r451 = head.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(127, 123).addBox(-0.5F, -0.7928F, -2.1384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -2.0891F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r452 = head.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(127, 88).addBox(-0.5F, -0.7792F, -0.8971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -2.0891F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r453 = head.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(127, 84).addBox(-0.5F, 0.1824F, -0.598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -2.0891F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r454 = head.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(50, 20).addBox(-0.4975F, -0.9556F, -0.0606F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.0025F, 4.0634F, -14.4651F, 0.0603F, 0.0F, 0.0F));

		PartDefinition cube_r455 = head.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(99, 101).addBox(-0.5F, -0.9815F, -0.2833F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.7767F, -9.6946F, 0.0254F, 0.0F, 0.0F));

		PartDefinition cube_r456 = head.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(50, 9).addBox(-1.5F, -1.5078F, 3.5018F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.7767F, -9.6946F, -0.1317F, 0.0F, 0.0F));

		PartDefinition cube_r457 = head.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(5, 142).addBox(-0.5F, 0.4061F, 0.2489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -2.0891F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r458 = head.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(84, 35).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3061F, -1.2927F, 0.0722F, 0.0F, 0.0F));

		PartDefinition cube_r459 = head.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(78, 54).addBox(-2.5F, 0.4371F, -3.3968F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2775F, 1.3132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r460 = head.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(70, 88).addBox(-1.5F, -1.025F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.998F, -0.3737F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r461 = head.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(88, 48).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0075F, -0.3968F, 0.9512F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.4011F, 7.8848F, -15.7879F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(69, 137).addBox(-6.2335F, 5.3151F, 0.5407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(137, 66).addBox(-6.2335F, 5.3151F, 0.9407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 2.8491F, 1.1384F, 0.0631F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(71, 8).addBox(-1.867F, 1.8305F, 1.3566F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.0845F, 0.0549F, 0.0322F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(95, 27).addBox(-0.6956F, -1.7825F, -6.4487F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5664F, -8.3947F, 10.7542F, 0.3947F, -0.059F, 0.5237F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(41, 121).addBox(-0.3397F, -1.4631F, -2.7297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5664F, -8.3947F, 10.7542F, 0.2647F, 0.0299F, 0.4891F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(121, 32).addBox(-0.2394F, -1.9788F, -0.3326F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.5664F, -8.3947F, 10.7542F, 2.0076F, 0.0733F, 0.4809F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(143, 26).addBox(-1.4789F, 1.274F, 1.873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.9598F, 0.1968F, 0.4898F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(142, 0).addBox(-1.4789F, 1.771F, 1.4535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 2.178F, 0.1968F, 0.4898F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(17, 125).addBox(-1.4789F, 1.6772F, -1.5796F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 2.7889F, 0.1968F, 0.4898F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(10, 121).addBox(-1.5032F, 0.8519F, -3.0926F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, -3.0229F, 0.1684F, 0.507F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(15, 72).addBox(-0.9F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.8107F, -8.4149F, 12.2481F, -1.7079F, 0.2202F, 0.4908F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(127, 80).addBox(-1.0288F, -1.3587F, 2.9738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -0.092F, 0.0318F, -0.0201F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(141, 135).addBox(-1.507F, 0.5641F, 0.6726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, -0.428F, 0.069F, -0.0364F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(138, 76).addBox(-1.44F, 0.4355F, 1.2035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, -0.148F, 0.075F, 0.0062F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(115, 144).addBox(-1.44F, -0.151F, -2.6975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 1.641F, 0.075F, 0.0062F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(42, 133).addBox(-1.44F, -0.3855F, 1.9482F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, -0.0607F, 0.075F, 0.0062F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(121, 0).addBox(-1.4361F, 1.0699F, 2.3662F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.1095F, 0.075F, 0.0062F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(133, 56).addBox(-1.4889F, 0.791F, -0.4243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.9076F, 0.0744F, -0.013F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(131, 96).addBox(-0.7F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0169F)), PartPose.offsetAndRotation(0.9989F, -8.829F, 11.4864F, -1.5486F, 0.1745F, 0.0038F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(112, 32).addBox(-1.4361F, 0.3467F, 6.2956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.3407F, 0.075F, 0.0062F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(0, 90).addBox(-1.4361F, -0.2493F, 3.1353F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.2535F, 0.075F, 0.0062F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(127, 69).addBox(-1.4361F, 2.1574F, -2.2854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 1.9988F, 0.075F, 0.0062F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(80, 20).addBox(-1.4611F, -0.3111F, 2.8339F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.2531F, 0.0744F, -0.013F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(42, 138).addBox(-1.4611F, 0.3096F, 1.834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.4712F, 0.0744F, -0.013F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(138, 35).addBox(-1.4611F, 0.6234F, 0.7524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.6458F, 0.0744F, -0.013F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(74, 138).addBox(-1.312F, 1.6859F, 0.1438F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.0354F, 0.0747F, 0.01F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(137, 116).addBox(-1.262F, 2.2157F, 0.9945F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.0877F, 0.0747F, 0.01F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(52, 133).addBox(-1.262F, 2.5423F, 1.7038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.175F, 0.0747F, 0.01F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(138, 55).addBox(-1.4111F, 2.8742F, 2.4761F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.2361F, 0.0747F, 0.01F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(57, 138).addBox(-1.4111F, 3.1482F, 3.223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.3059F, 0.0747F, 0.01F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(21, 138).addBox(-1.4111F, 3.3816F, 4.0353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(16, 138).addBox(-1.4111F, 3.5816F, 6.2353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(118, 137).addBox(-1.4111F, 3.5816F, 5.0353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.3495F, 0.0747F, 0.01F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(103, 92).addBox(-1.4225F, -0.6678F, 6.2803F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.0005F, 0.0747F, 0.011F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(106, 107).addBox(-1.4361F, 1.1382F, 4.0544F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.1313F, 0.075F, 0.0062F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(112, 92).addBox(-2.5358F, -1.767F, 7.8772F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.0002F, 0.2026F, -0.0241F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(22, 133).addBox(-0.5568F, 0.627F, 1.8456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.4942F, 0.3117F, -0.0303F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(68, 79).addBox(-0.5568F, 0.1771F, -2.2378F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.276F, 0.3117F, -0.0303F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(120, 116).addBox(-0.5568F, -2.2445F, 2.7402F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, -0.1203F, 0.3117F, -0.0303F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(142, 45).addBox(-0.9803F, -6.2676F, -0.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(136, 108).addBox(-0.9803F, -6.2676F, -1.0821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -0.8208F, 0.0302F, -0.0049F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(144, 10).addBox(-2.7974F, -0.2296F, -5.8793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -1.922F, 0.0694F, 0.3678F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(126, 92).addBox(-2.8376F, -5.8636F, -1.5326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -0.6948F, 0.1006F, 0.3624F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(138, 93).addBox(-2.8376F, -1.9886F, -5.7307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -1.6984F, 0.1006F, 0.3624F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(107, 140).addBox(-2.9058F, -1.9057F, -5.5883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -1.436F, 0.2419F, 0.3451F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(126, 76).addBox(-0.9315F, -5.5116F, 0.4477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -0.0013F, 0.0318F, -0.0201F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(108, 136).addBox(-0.9186F, -6.3474F, -0.7912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -0.6121F, 0.0318F, -0.0201F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(119, 132).addBox(-0.9542F, -2.2482F, 3.3389F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, 0.3129F, 0.0318F, -0.0201F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(110, 99).addBox(-0.9542F, -3.7803F, 2.0598F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, 0.0598F, 0.0318F, -0.0201F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(126, 57).addBox(-0.8723F, -3.1144F, -4.0986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -1.4455F, 0.0318F, -0.0201F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(140, 39).addBox(-0.8723F, 1.9634F, 0.9203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, 1.5128F, 0.0318F, -0.0201F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(132, 139).addBox(-0.8723F, 1.2968F, 2.0864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, 1.0765F, 0.0318F, -0.0201F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(37, 144).addBox(-0.8723F, -1.2244F, 2.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, 0.3784F, 0.0318F, -0.0201F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(142, 113).addBox(-0.8723F, -3.9328F, -1.885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -1.1052F, 0.0318F, -0.0201F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(124, 53).addBox(-0.8736F, 1.457F, 0.949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, 1.5041F, 0.0318F, -0.0201F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(10, 140).addBox(-0.8933F, -2.5628F, -1.0487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -1.0965F, 0.0318F, -0.0201F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(137, 139).addBox(-0.8758F, -2.8382F, 4.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, 0.5965F, 0.0318F, -0.0201F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(141, 132).addBox(-0.8758F, -5.4221F, 1.7953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -0.0143F, 0.0318F, -0.0201F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(5, 139).addBox(-0.8758F, -1.2319F, -3.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -1.8033F, 0.0318F, -0.0201F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(136, 102).addBox(-0.8758F, -5.6964F, -0.4163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -0.407F, 0.0318F, -0.0201F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(141, 129).addBox(-0.8758F, -4.8586F, 0.6935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -0.2761F, 0.0318F, -0.0201F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(102, 137).addBox(-0.8758F, 1.0127F, 1.5692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, 1.6219F, 0.0318F, -0.0201F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(141, 14).addBox(-1.2362F, 0.8891F, 0.1272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.8303F, 0.0668F, 0.0217F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(110, 144).addBox(-1.2366F, 0.8246F, -1.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 2.0126F, 0.0641F, 0.0235F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(77, 144).addBox(-1.2366F, 1.0204F, 1.6098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F))
				.texOffs(67, 144).addBox(-1.2366F, 1.0204F, 1.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.6948F, 0.0641F, 0.0235F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(52, 144).addBox(-1.2362F, -1.3904F, -2.8047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, -2.704F, 0.0668F, 0.0217F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(144, 102).addBox(-1.2362F, 1.1234F, -1.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 2.052F, 0.0668F, 0.0217F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(10, 143).addBox(-1.7041F, 8.2483F, -0.5588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 1.4755F, 0.1274F, 0.0062F));

		PartDefinition cube_r526 = leftFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(122, 143).addBox(-1.7041F, 3.7829F, -8.359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 2.5663F, 0.1274F, 0.0062F));

		PartDefinition cube_r527 = leftFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(92, 137).addBox(-1.7041F, 2.8969F, -9.2054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 2.7845F, 0.1274F, 0.0062F));

		PartDefinition cube_r528 = leftFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(142, 138).addBox(-1.7041F, 9.4475F, 0.6534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(141, 4).addBox(-1.7041F, 9.1475F, 0.6534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 1.6413F, 0.1274F, 0.0062F));

		PartDefinition cube_r529 = leftFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(122, 110).addBox(-1.7041F, -9.2015F, 1.1424F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, -1.1948F, 0.1274F, 0.0062F));

		PartDefinition cube_r530 = leftFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(0, 141).addBox(-1.7041F, -2.7657F, -7.0745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, -2.6784F, 0.1274F, 0.0062F));

		PartDefinition cube_r531 = leftFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(141, 70).addBox(-1.7041F, 4.5484F, -4.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 2.2522F, 0.1274F, 0.0062F));

		PartDefinition cube_r532 = leftFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(0, 144).addBox(-1.7041F, 4.7955F, 1.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 1.1614F, 0.1274F, 0.0062F));

		PartDefinition cube_r533 = leftFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(124, 97).addBox(-1.7041F, -8.838F, -2.4205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, -1.7883F, 0.1274F, 0.0062F));

		PartDefinition cube_r534 = leftFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(10, 126).addBox(-1.7041F, -6.8696F, -3.0252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, -1.8755F, 0.1274F, 0.0062F));

		PartDefinition cube_r535 = leftFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(62, 141).addBox(-0.1852F, 2.3678F, 1.0127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(141, 126).addBox(-0.4102F, 2.3678F, 1.0127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.5817F, 0.3172F, -0.0146F));

		PartDefinition cube_r536 = leftFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(133, 142).addBox(-0.4353F, -2.4449F, 2.0465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, -0.2334F, 0.3172F, -0.0146F));

		PartDefinition cube_r537 = leftFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(105, 143).addBox(-0.4353F, 1.9366F, 2.0795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.2937F, 0.3172F, -0.0146F));

		PartDefinition cube_r538 = leftFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(141, 123).addBox(-0.3646F, -0.1192F, 2.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 0.035F, 0.2884F, -0.0547F));

		PartDefinition cube_r539 = leftFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(138, 142).addBox(-0.3646F, 2.2942F, -0.7399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.3178F, 0.2884F, -0.0547F));

		PartDefinition cube_r540 = leftFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(129, 27).addBox(-0.3646F, 1.9525F, -2.2134F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.6232F, 0.2884F, -0.0547F));

		PartDefinition cube_r541 = leftFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(47, 144).addBox(-0.3646F, -0.8935F, -2.7173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, -2.8274F, 0.2884F, -0.0547F));

		PartDefinition cube_r542 = leftFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(143, 23).addBox(-0.3646F, -0.2723F, -2.6055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 3.1067F, 0.2884F, -0.0547F));

		PartDefinition cube_r543 = leftFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(143, 99).addBox(-0.3646F, 1.2731F, -1.9261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 2.077F, 0.2884F, -0.0547F));

		PartDefinition cube_r544 = leftFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(125, 115).addBox(-0.4353F, -3.221F, -1.6305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, -1.4639F, 0.3172F, -0.0146F));

		PartDefinition cube_r545 = leftFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(117, 141).addBox(-0.4353F, -3.333F, 0.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, -0.4254F, 0.3172F, -0.0146F));

		PartDefinition cube_r546 = leftFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(46, 107).addBox(-0.9542F, -5.0625F, 0.071F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -0.0797F, 0.0313F, -0.0185F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.4011F, 7.8848F, -15.7879F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(69, 137).mirror().addBox(5.2335F, 5.3151F, 0.5407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(137, 66).mirror().addBox(5.2335F, 5.3151F, 0.9407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 2.8491F, -1.1384F, -0.0631F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(0.867F, 1.8305F, 1.3566F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.0845F, -0.0549F, -0.0322F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(95, 27).mirror().addBox(-0.3044F, -1.7825F, -6.4487F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5664F, -8.3947F, 10.7542F, 0.3947F, 0.059F, -0.5237F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(41, 121).mirror().addBox(-0.6603F, -1.4631F, -2.7297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5664F, -8.3947F, 10.7542F, 0.2647F, -0.0299F, -0.4891F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(121, 32).mirror().addBox(-0.7606F, -1.9788F, -0.3326F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-0.5664F, -8.3947F, 10.7542F, 2.0076F, -0.0733F, -0.4809F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(143, 26).mirror().addBox(0.4789F, 1.274F, 1.873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.9598F, -0.1968F, -0.4898F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(142, 0).mirror().addBox(0.4789F, 1.771F, 1.4535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 2.178F, -0.1968F, -0.4898F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(17, 125).mirror().addBox(0.4789F, 1.6772F, -1.5796F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 2.7889F, -0.1968F, -0.4898F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(10, 121).mirror().addBox(0.5032F, 0.8519F, -3.0926F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, -3.0229F, -0.1684F, -0.507F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(15, 72).mirror().addBox(-0.1F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.8107F, -8.4149F, 12.2481F, -1.7079F, -0.2202F, -0.4908F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(127, 80).mirror().addBox(0.0288F, -1.3587F, 2.9738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -0.092F, -0.0318F, 0.0201F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(141, 135).mirror().addBox(0.507F, 0.5641F, 0.6726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, -0.428F, -0.069F, 0.0364F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(138, 76).mirror().addBox(0.44F, 0.4355F, 1.2035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, -0.148F, -0.075F, -0.0062F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(115, 144).mirror().addBox(0.44F, -0.151F, -2.6975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 1.641F, -0.075F, -0.0062F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(42, 133).mirror().addBox(0.44F, -0.3855F, 1.9482F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, -0.0607F, -0.075F, -0.0062F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(121, 0).mirror().addBox(0.4361F, 1.0699F, 2.3662F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.1095F, -0.075F, -0.0062F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(133, 56).mirror().addBox(0.4889F, 0.791F, -0.4243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.9076F, -0.0744F, 0.013F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(131, 96).mirror().addBox(-0.3F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0169F)).mirror(false), PartPose.offsetAndRotation(-0.9989F, -8.829F, 11.4864F, -1.5486F, -0.1745F, -0.0038F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(112, 32).mirror().addBox(0.4361F, 0.3467F, 6.2956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.3407F, -0.075F, -0.0062F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(0.4361F, -0.2493F, 3.1353F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.2535F, -0.075F, -0.0062F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(127, 69).mirror().addBox(0.4361F, 2.1574F, -2.2854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 1.9988F, -0.075F, -0.0062F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(0.4611F, -0.3111F, 2.8339F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.2531F, -0.0744F, 0.013F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(42, 138).mirror().addBox(0.4611F, 0.3096F, 1.834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.4712F, -0.0744F, 0.013F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(138, 35).mirror().addBox(0.4611F, 0.6234F, 0.7524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.6458F, -0.0744F, 0.013F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(74, 138).mirror().addBox(0.312F, 1.6859F, 0.1438F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.0354F, -0.0747F, -0.01F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(137, 116).mirror().addBox(0.262F, 2.2157F, 0.9945F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.0877F, -0.0747F, -0.01F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(52, 133).mirror().addBox(0.262F, 2.5423F, 1.7038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.175F, -0.0747F, -0.01F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(138, 55).mirror().addBox(0.4111F, 2.8742F, 2.4761F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.2361F, -0.0747F, -0.01F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(57, 138).mirror().addBox(0.4111F, 3.1482F, 3.223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.3059F, -0.0747F, -0.01F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(21, 138).mirror().addBox(0.4111F, 3.3816F, 4.0353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(16, 138).mirror().addBox(0.4111F, 3.5816F, 6.2353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(118, 137).mirror().addBox(0.4111F, 3.5816F, 5.0353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.3495F, -0.0747F, -0.01F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(103, 92).mirror().addBox(0.4225F, -0.6678F, 6.2803F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.0005F, -0.0747F, -0.011F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(106, 107).mirror().addBox(0.4361F, 1.1382F, 4.0544F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.1313F, -0.075F, -0.0062F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(112, 92).mirror().addBox(1.5358F, -1.767F, 7.8772F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.0002F, -0.2026F, 0.0241F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(22, 133).mirror().addBox(-0.4432F, 0.627F, 1.8456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.4942F, -0.3117F, 0.0303F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(68, 79).mirror().addBox(-0.4432F, 0.1771F, -2.2378F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.276F, -0.3117F, 0.0303F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(120, 116).mirror().addBox(-0.4432F, -2.2445F, 2.7402F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, -0.1203F, -0.3117F, 0.0303F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(142, 45).mirror().addBox(-0.0197F, -6.2676F, -0.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(136, 108).mirror().addBox(-0.0197F, -6.2676F, -1.0821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -0.8208F, -0.0302F, 0.0049F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(144, 10).mirror().addBox(1.7974F, -0.2296F, -5.8793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.123F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -1.922F, -0.0694F, -0.3678F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(126, 92).mirror().addBox(1.8376F, -5.8636F, -1.5326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -0.6948F, -0.1006F, -0.3624F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(138, 93).mirror().addBox(1.8376F, -1.9886F, -5.7307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -1.6984F, -0.1006F, -0.3624F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(107, 140).mirror().addBox(1.9058F, -1.9057F, -5.5883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -1.436F, -0.2419F, -0.3451F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(126, 76).mirror().addBox(-0.0685F, -5.5116F, 0.4477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -0.0013F, -0.0318F, 0.0201F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(108, 136).mirror().addBox(-0.0814F, -6.3474F, -0.7912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -0.6121F, -0.0318F, 0.0201F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(119, 132).mirror().addBox(-0.0458F, -2.2482F, 3.3389F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, 0.3129F, -0.0318F, 0.0201F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(110, 99).mirror().addBox(-0.0458F, -3.7803F, 2.0598F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, 0.0598F, -0.0318F, 0.0201F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(126, 57).mirror().addBox(-0.1277F, -3.1144F, -4.0986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -1.4455F, -0.0318F, 0.0201F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(140, 39).mirror().addBox(-0.1277F, 1.9634F, 0.9203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, 1.5128F, -0.0318F, 0.0201F));

		PartDefinition cube_r594 = rightFace.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(132, 139).mirror().addBox(-0.1277F, 1.2968F, 2.0864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, 1.0765F, -0.0318F, 0.0201F));

		PartDefinition cube_r595 = rightFace.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(37, 144).mirror().addBox(-0.1277F, -1.2244F, 2.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, 0.3784F, -0.0318F, 0.0201F));

		PartDefinition cube_r596 = rightFace.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(142, 113).mirror().addBox(-0.1277F, -3.9328F, -1.885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -1.1052F, -0.0318F, 0.0201F));

		PartDefinition cube_r597 = rightFace.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(124, 53).mirror().addBox(-0.1264F, 1.457F, 0.949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, 1.5041F, -0.0318F, 0.0201F));

		PartDefinition cube_r598 = rightFace.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(10, 140).mirror().addBox(-0.1067F, -2.5628F, -1.0487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -1.0965F, -0.0318F, 0.0201F));

		PartDefinition cube_r599 = rightFace.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(137, 139).mirror().addBox(-0.1242F, -2.8382F, 4.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, 0.5965F, -0.0318F, 0.0201F));

		PartDefinition cube_r600 = rightFace.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(141, 132).mirror().addBox(-0.1242F, -5.4221F, 1.7953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -0.0143F, -0.0318F, 0.0201F));

		PartDefinition cube_r601 = rightFace.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(5, 139).mirror().addBox(-0.1242F, -1.2319F, -3.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -1.8033F, -0.0318F, 0.0201F));

		PartDefinition cube_r602 = rightFace.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(136, 102).mirror().addBox(-0.1242F, -5.6964F, -0.4163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -0.407F, -0.0318F, 0.0201F));

		PartDefinition cube_r603 = rightFace.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(141, 129).mirror().addBox(-0.1242F, -4.8586F, 0.6935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -0.2761F, -0.0318F, 0.0201F));

		PartDefinition cube_r604 = rightFace.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(102, 137).mirror().addBox(-0.1242F, 1.0127F, 1.5692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, 1.6219F, -0.0318F, 0.0201F));

		PartDefinition cube_r605 = rightFace.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(141, 14).mirror().addBox(0.2362F, 0.8891F, 0.1272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.8303F, -0.0668F, -0.0217F));

		PartDefinition cube_r606 = rightFace.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(110, 144).mirror().addBox(0.2366F, 0.8246F, -1.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 2.0126F, -0.0641F, -0.0235F));

		PartDefinition cube_r607 = rightFace.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(77, 144).mirror().addBox(0.2366F, 1.0204F, 1.6098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false)
				.texOffs(67, 144).mirror().addBox(0.2366F, 1.0204F, 1.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.6948F, -0.0641F, -0.0235F));

		PartDefinition cube_r608 = rightFace.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(52, 144).mirror().addBox(0.2362F, -1.3904F, -2.8047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, -2.704F, -0.0668F, -0.0217F));

		PartDefinition cube_r609 = rightFace.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(144, 102).mirror().addBox(0.2362F, 1.1234F, -1.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 2.052F, -0.0668F, -0.0217F));

		PartDefinition cube_r610 = rightFace.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(10, 143).mirror().addBox(0.7041F, 8.2483F, -0.5588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 1.4755F, -0.1274F, -0.0062F));

		PartDefinition cube_r611 = rightFace.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(122, 143).mirror().addBox(0.7041F, 3.7829F, -8.359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 2.5663F, -0.1274F, -0.0062F));

		PartDefinition cube_r612 = rightFace.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(92, 137).mirror().addBox(0.7041F, 2.8969F, -9.2054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 2.7845F, -0.1274F, -0.0062F));

		PartDefinition cube_r613 = rightFace.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(142, 138).mirror().addBox(0.7041F, 9.4475F, 0.6534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(141, 4).mirror().addBox(0.7041F, 9.1475F, 0.6534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 1.6413F, -0.1274F, -0.0062F));

		PartDefinition cube_r614 = rightFace.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(122, 110).mirror().addBox(0.7041F, -9.2015F, 1.1424F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, -1.1948F, -0.1274F, -0.0062F));

		PartDefinition cube_r615 = rightFace.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(0, 141).mirror().addBox(0.7041F, -2.7657F, -7.0745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, -2.6784F, -0.1274F, -0.0062F));

		PartDefinition cube_r616 = rightFace.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(141, 70).mirror().addBox(0.7041F, 4.5484F, -4.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 2.2522F, -0.1274F, -0.0062F));

		PartDefinition cube_r617 = rightFace.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(0, 144).mirror().addBox(0.7041F, 4.7955F, 1.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 1.1614F, -0.1274F, -0.0062F));

		PartDefinition cube_r618 = rightFace.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(124, 97).mirror().addBox(0.7041F, -8.838F, -2.4205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, -1.7883F, -0.1274F, -0.0062F));

		PartDefinition cube_r619 = rightFace.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(10, 126).mirror().addBox(0.7041F, -6.8696F, -3.0252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, -1.8755F, -0.1274F, -0.0062F));

		PartDefinition cube_r620 = rightFace.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(62, 141).mirror().addBox(-0.8148F, 2.3678F, 1.0127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(141, 126).mirror().addBox(-0.5898F, 2.3678F, 1.0127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.5817F, -0.3172F, 0.0146F));

		PartDefinition cube_r621 = rightFace.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(133, 142).mirror().addBox(-0.5647F, -2.4449F, 2.0465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, -0.2334F, -0.3172F, 0.0146F));

		PartDefinition cube_r622 = rightFace.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(105, 143).mirror().addBox(-0.5647F, 1.9366F, 2.0795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.2937F, -0.3172F, 0.0146F));

		PartDefinition cube_r623 = rightFace.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(141, 123).mirror().addBox(-0.6354F, -0.1192F, 2.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 0.035F, -0.2884F, 0.0547F));

		PartDefinition cube_r624 = rightFace.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(138, 142).mirror().addBox(-0.6354F, 2.2942F, -0.7399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.3178F, -0.2884F, 0.0547F));

		PartDefinition cube_r625 = rightFace.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(129, 27).mirror().addBox(-0.6354F, 1.9525F, -2.2134F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.6232F, -0.2884F, 0.0547F));

		PartDefinition cube_r626 = rightFace.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(47, 144).mirror().addBox(-0.6354F, -0.8935F, -2.7173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, -2.8274F, -0.2884F, 0.0547F));

		PartDefinition cube_r627 = rightFace.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(143, 23).mirror().addBox(-0.6354F, -0.2723F, -2.6055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 3.1067F, -0.2884F, 0.0547F));

		PartDefinition cube_r628 = rightFace.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(143, 99).mirror().addBox(-0.6354F, 1.2731F, -1.9261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 2.077F, -0.2884F, 0.0547F));

		PartDefinition cube_r629 = rightFace.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(125, 115).mirror().addBox(-0.5647F, -3.221F, -1.6305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, -1.4639F, -0.3172F, 0.0146F));

		PartDefinition cube_r630 = rightFace.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(117, 141).mirror().addBox(-0.5647F, -3.333F, 0.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, -0.4254F, -0.3172F, 0.0146F));

		PartDefinition cube_r631 = rightFace.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(46, 107).mirror().addBox(-0.0458F, -5.0625F, 0.071F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -0.0797F, -0.0313F, 0.0185F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3926F, 1.8175F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(10, 130).mirror().addBox(-0.4F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, -0.0343F, -0.0523F, -0.0349F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(124, 136).mirror().addBox(-0.4F, 0.2423F, -3.0261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, -0.3223F, -0.0523F, -0.0349F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(65, 118).mirror().addBox(-1.0761F, -0.7823F, -5.1919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 0.02F, -0.2268F, -0.0703F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(64, 129).mirror().addBox(-1.3011F, 1.051F, -6.4573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 0.1596F, -0.2268F, -0.0703F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(140, 87).mirror().addBox(-1.361F, -1.0555F, -4.6587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 0.6012F, -0.2225F, -0.1089F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(26, 139).mirror().addBox(-1.361F, -5.2656F, -0.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 2.1284F, -0.2225F, -0.1089F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(144, 7).mirror().addBox(-1.3011F, 3.3674F, 4.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(143, 35).mirror().addBox(-1.3011F, 3.8674F, 4.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, -2.1181F, -0.2268F, -0.0703F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(101, 113).mirror().addBox(-1.0761F, -0.8729F, -7.1827F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 0.0374F, -0.2268F, -0.0703F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(114, 44).mirror().addBox(-0.7263F, -0.0664F, -8.0039F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, -0.0917F, -0.1744F, -0.1054F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(35, 103).mirror().addBox(-0.4F, -0.0077F, -2.9603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 0.2275F, -0.0523F, -0.0349F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(103, 46).mirror().addBox(-0.4F, 0.355F, -3.1302F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 0.3933F, -0.0523F, -0.0349F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(137, 112).mirror().addBox(-0.4F, -0.5647F, -4.3058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 0.4544F, -0.0523F, -0.0349F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(32, 125).mirror().addBox(-1.0761F, 3.211F, 5.0042F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, -2.2664F, -0.2268F, -0.0703F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(82, 125).mirror().addBox(-0.9267F, -0.7558F, -0.045F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -2.0164F, -0.1574F, -0.1038F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(136, 131).mirror().addBox(-0.8262F, 3.3399F, 0.0615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.6057F, -0.1048F, -0.1046F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(133, 92).mirror().addBox(-0.8262F, 5.3512F, -0.5501F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.4922F, -0.1048F, -0.1046F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(136, 135).mirror().addBox(-0.8262F, 6.8434F, -0.0553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.6406F, -0.1048F, -0.1046F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(15, 142).mirror().addBox(-0.8262F, 4.0506F, 6.2218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -2.5133F, -0.1048F, -0.1046F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(89, 125).mirror().addBox(-0.8262F, 0.3518F, 6.362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -2.9932F, -0.1048F, -0.1046F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(-0.8262F, 5.216F, -0.1813F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.6231F, -0.1048F, -0.1046F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(131, 51).mirror().addBox(-0.8262F, 2.7873F, -1.0736F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.4661F, -0.1048F, -0.1046F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(20, 142).mirror().addBox(-0.8262F, 2.6038F, -1.5713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(127, 127).mirror().addBox(-0.8262F, 3.6038F, -1.8713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.501F, -0.1048F, -0.1046F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-0.8262F, 5.6726F, -1.026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 31).mirror().addBox(-0.8262F, 6.6726F, -0.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 41).mirror().addBox(-0.8262F, 7.6726F, -0.876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.6755F, -0.1048F, -0.1046F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(72, 128).mirror().addBox(-0.8262F, 4.6599F, -1.5394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.5882F, -0.1048F, -0.1046F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(113, 137).mirror().addBox(-0.9267F, 1.3223F, 0.6518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.7852F, -0.1574F, -0.1038F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(25, 142).mirror().addBox(-0.9267F, 1.9705F, -1.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, -1.2354F, -0.1574F, -0.1038F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(89, 129).mirror().addBox(-0.4F, 2.4916F, -0.8136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, -1.0466F, -0.0523F, -0.0349F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(125, 119).mirror().addBox(-0.4F, -0.797F, 0.7234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, -2.469F, -0.0523F, -0.0349F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(100, 124).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(121, 41).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(88, 133).mirror().addBox(-1.0761F, -4.1277F, 4.5652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 3.0568F, -0.2268F, -0.0703F));

		PartDefinition cube_r663 = jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(103, 129).mirror().addBox(-1.0761F, -4.9375F, -1.8732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 1.9224F, -0.2268F, -0.0703F));

		PartDefinition cube_r664 = jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(129, 109).mirror().addBox(-1.0761F, -5.6475F, -2.5015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 1.7915F, -0.2268F, -0.0703F));

		PartDefinition cube_r665 = jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(119, 128).mirror().addBox(-0.4F, 2.9115F, -0.5276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, -1.6313F, -0.0523F, -0.0349F));

		PartDefinition cube_r666 = jaw.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(142, 48).mirror().addBox(-0.4F, -2.0136F, -1.3304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 1.2049F, -0.0523F, -0.0349F));

		PartDefinition cube_r667 = jaw.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(57, 142).mirror().addBox(-0.8262F, -1.468F, 7.149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, 3.0805F, -0.1048F, -0.1046F));

		PartDefinition cube_r668 = jaw.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(37, 137).mirror().addBox(-0.9267F, -1.1601F, -2.3759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(142, 66).mirror().addBox(-0.9267F, -0.3601F, -2.8759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, 0.0736F, -0.1574F, -0.1038F));

		PartDefinition cube_r669 = jaw.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(72, 118).mirror().addBox(-0.9267F, -1.5408F, -1.0262F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.7204F, -0.1873F, -7.8659F, 1.5135F, -0.1574F, -0.1038F));

		PartDefinition cube_r670 = jaw.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(123, 140).mirror().addBox(-1.0761F, 4.5149F, 4.2344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(67, 141).mirror().addBox(-1.0761F, 4.7149F, 4.2344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, -1.8737F, -0.2268F, -0.0703F));

		PartDefinition cube_r671 = jaw.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(143, 141).mirror().addBox(-1.3011F, 1.5705F, -6.872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.3203F, -0.1873F, 0.0341F, 0.0723F, -0.2268F, -0.0703F));

		PartDefinition cube_r672 = jaw.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(121, 41).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r673 = jaw.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(100, 124).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r674 = jaw.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(125, 119).addBox(-0.6F, -0.797F, 0.7234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, -2.469F, 0.0523F, 0.0349F));

		PartDefinition cube_r675 = jaw.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(89, 129).addBox(-0.6F, 2.4916F, -0.8136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, -1.0466F, 0.0523F, 0.0349F));

		PartDefinition cube_r676 = jaw.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(72, 118).addBox(-0.0733F, -1.5408F, -1.0262F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, 1.5135F, 0.1574F, 0.1038F));

		PartDefinition cube_r677 = jaw.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(142, 66).addBox(-0.0733F, -0.3601F, -2.8759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(37, 137).addBox(-0.0733F, -1.1601F, -2.3759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, 0.0736F, 0.1574F, 0.1038F));

		PartDefinition cube_r678 = jaw.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(25, 142).addBox(-0.0733F, 1.9705F, -1.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.2354F, 0.1574F, 0.1038F));

		PartDefinition cube_r679 = jaw.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(113, 137).addBox(-0.0733F, 1.3223F, 0.6518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.7852F, 0.1574F, 0.1038F));

		PartDefinition cube_r680 = jaw.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(72, 128).addBox(-0.1738F, 4.6599F, -1.5394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.5882F, 0.1048F, 0.1046F));

		PartDefinition cube_r681 = jaw.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(128, 41).addBox(-0.1738F, 7.6726F, -0.876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 31).addBox(-0.1738F, 6.6726F, -0.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 0).addBox(-0.1738F, 5.6726F, -1.026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.6755F, 0.1048F, 0.1046F));

		PartDefinition cube_r682 = jaw.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(127, 127).addBox(-0.1738F, 3.6038F, -1.8713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 142).addBox(-0.1738F, 2.6038F, -1.5713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.501F, 0.1048F, 0.1046F));

		PartDefinition cube_r683 = jaw.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(131, 51).addBox(-0.1738F, 2.7873F, -1.0736F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.4661F, 0.1048F, 0.1046F));

		PartDefinition cube_r684 = jaw.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(0, 137).addBox(-0.1738F, 5.216F, -0.1813F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.6231F, 0.1048F, 0.1046F));

		PartDefinition cube_r685 = jaw.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(89, 125).addBox(-0.1738F, 0.3518F, 6.362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -2.9932F, 0.1048F, 0.1046F));

		PartDefinition cube_r686 = jaw.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(57, 142).addBox(-0.1738F, -1.468F, 7.149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, 3.0805F, 0.1048F, 0.1046F));

		PartDefinition cube_r687 = jaw.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(15, 142).addBox(-0.1738F, 4.0506F, 6.2218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -2.5133F, 0.1048F, 0.1046F));

		PartDefinition cube_r688 = jaw.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(136, 135).addBox(-0.1738F, 6.8434F, -0.0553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.6406F, 0.1048F, 0.1046F));

		PartDefinition cube_r689 = jaw.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(133, 92).addBox(-0.1738F, 5.3512F, -0.5501F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.4922F, 0.1048F, 0.1046F));

		PartDefinition cube_r690 = jaw.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(136, 131).addBox(-0.1738F, 3.3399F, 0.0615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -1.6057F, 0.1048F, 0.1046F));

		PartDefinition cube_r691 = jaw.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(82, 125).addBox(-0.0733F, -0.7558F, -0.045F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7204F, -0.1873F, -7.8659F, -2.0164F, 0.1574F, 0.1038F));

		PartDefinition cube_r692 = jaw.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(32, 125).addBox(0.0761F, 3.211F, 5.0042F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, -2.2664F, 0.2268F, 0.0703F));

		PartDefinition cube_r693 = jaw.addOrReplaceChild("cube_r693", CubeListBuilder.create().texOffs(67, 141).addBox(0.0761F, 4.7149F, 4.2344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(123, 140).addBox(0.0761F, 4.5149F, 4.2344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, -1.8737F, 0.2268F, 0.0703F));

		PartDefinition cube_r694 = jaw.addOrReplaceChild("cube_r694", CubeListBuilder.create().texOffs(88, 133).addBox(0.0761F, -4.1277F, 4.5652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 3.0568F, 0.2268F, 0.0703F));

		PartDefinition cube_r695 = jaw.addOrReplaceChild("cube_r695", CubeListBuilder.create().texOffs(129, 109).addBox(0.0761F, -5.6475F, -2.5015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 1.7915F, 0.2268F, 0.0703F));

		PartDefinition cube_r696 = jaw.addOrReplaceChild("cube_r696", CubeListBuilder.create().texOffs(103, 129).addBox(0.0761F, -4.9375F, -1.8732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 1.9224F, 0.2268F, 0.0703F));

		PartDefinition cube_r697 = jaw.addOrReplaceChild("cube_r697", CubeListBuilder.create().texOffs(137, 112).addBox(-0.6F, -0.5647F, -4.3058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 0.4544F, 0.0523F, 0.0349F));

		PartDefinition cube_r698 = jaw.addOrReplaceChild("cube_r698", CubeListBuilder.create().texOffs(103, 46).addBox(-0.6F, 0.355F, -3.1302F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 0.3933F, 0.0523F, 0.0349F));

		PartDefinition cube_r699 = jaw.addOrReplaceChild("cube_r699", CubeListBuilder.create().texOffs(35, 103).addBox(-0.6F, -0.0077F, -2.9603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 0.2275F, 0.0523F, 0.0349F));

		PartDefinition cube_r700 = jaw.addOrReplaceChild("cube_r700", CubeListBuilder.create().texOffs(114, 44).addBox(-0.2737F, -0.0664F, -8.0039F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, -0.0917F, 0.1744F, 0.1054F));

		PartDefinition cube_r701 = jaw.addOrReplaceChild("cube_r701", CubeListBuilder.create().texOffs(101, 113).addBox(0.0761F, -0.8729F, -7.1827F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 0.0374F, 0.2268F, 0.0703F));

		PartDefinition cube_r702 = jaw.addOrReplaceChild("cube_r702", CubeListBuilder.create().texOffs(143, 35).addBox(0.3011F, 3.8674F, 4.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(144, 7).addBox(0.3011F, 3.3674F, 4.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, -2.1181F, 0.2268F, 0.0703F));

		PartDefinition cube_r703 = jaw.addOrReplaceChild("cube_r703", CubeListBuilder.create().texOffs(26, 139).addBox(0.361F, -5.2656F, -0.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 2.1284F, 0.2225F, 0.1089F));

		PartDefinition cube_r704 = jaw.addOrReplaceChild("cube_r704", CubeListBuilder.create().texOffs(140, 87).addBox(0.361F, -1.0555F, -4.6587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 0.6012F, 0.2225F, 0.1089F));

		PartDefinition cube_r705 = jaw.addOrReplaceChild("cube_r705", CubeListBuilder.create().texOffs(143, 141).addBox(0.3011F, 1.5705F, -6.872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 0.0723F, 0.2268F, 0.0703F));

		PartDefinition cube_r706 = jaw.addOrReplaceChild("cube_r706", CubeListBuilder.create().texOffs(64, 129).addBox(0.3011F, 1.051F, -6.4573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 0.1596F, 0.2268F, 0.0703F));

		PartDefinition cube_r707 = jaw.addOrReplaceChild("cube_r707", CubeListBuilder.create().texOffs(65, 118).addBox(0.0761F, -0.7823F, -5.1919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 0.02F, 0.2268F, 0.0703F));

		PartDefinition cube_r708 = jaw.addOrReplaceChild("cube_r708", CubeListBuilder.create().texOffs(119, 128).addBox(-0.6F, 2.9115F, -0.5276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, -1.6313F, 0.0523F, 0.0349F));

		PartDefinition cube_r709 = jaw.addOrReplaceChild("cube_r709", CubeListBuilder.create().texOffs(142, 48).addBox(-0.6F, -2.0136F, -1.3304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, 1.2049F, 0.0523F, 0.0349F));

		PartDefinition cube_r710 = jaw.addOrReplaceChild("cube_r710", CubeListBuilder.create().texOffs(124, 136).addBox(-0.6F, 0.2423F, -3.0261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, -0.3223F, 0.0523F, 0.0349F));

		PartDefinition cube_r711 = jaw.addOrReplaceChild("cube_r711", CubeListBuilder.create().texOffs(10, 130).addBox(-0.6F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.3203F, -0.1873F, 0.0341F, -0.0343F, 0.0523F, 0.0349F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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