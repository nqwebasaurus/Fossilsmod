package fossils.fossils.client.blockentity.model.nanotyrannus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NanotyrannusFossilModel extends SkullModelBase {
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
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public NanotyrannusFossilModel(ModelPart root) {
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
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -37.0344F, -0.2651F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -0.9F, -5.7F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3724F, 1.8478F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.9822F, 0.3974F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.4F, -5.2867F, 5.1549F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(91, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0874F, 0.2013F, -2.0316F, -0.4489F, -0.0321F, -0.4016F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 88).addBox(-0.5827F, 3.7931F, -4.5175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 89).addBox(-0.5827F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(100, 76).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3117F, 2.9478F, -1.8834F, 0.6439F, -0.0327F, -0.4104F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(69, 0).addBox(0.575F, -0.9F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1094F, 3.086F, 0.6268F, -0.0978F, -0.0327F, -0.4104F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(77, 62).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.703F, 2.0261F, 3.1372F, -0.3029F, -0.0391F, -0.4053F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(25, 113).addBox(-0.993F, 1.144F, 2.2778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7319F, 5.3537F, -4.5402F, -0.2357F, -0.0047F, 0.1341F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(82, 45).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4878F, 9.1399F, 0.0436F, -0.7857F, -0.1025F, 0.0354F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 51).addBox(-0.2999F, -0.3161F, 3.4019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7319F, 5.3537F, -4.5402F, -0.6815F, -0.2488F, 0.1877F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(102, 50).addBox(-0.2999F, 2.8251F, 2.6108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7319F, 5.3537F, -4.5402F, -0.0707F, -0.2488F, 0.1877F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(32, 109).addBox(-0.993F, 2.3593F, 1.6333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(11, 74).addBox(-0.993F, 1.3593F, -2.3667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7319F, 5.3537F, -4.5402F, 0.1134F, -0.0047F, 0.1341F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(113, 26).addBox(-1.1131F, 0.9146F, 0.8141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(0, 71).addBox(-1.1131F, -1.0854F, -2.6859F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7319F, 5.3537F, -4.5402F, 0.3315F, -0.0047F, 0.0469F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(27, 109).addBox(-0.993F, 1.9164F, 0.8129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7319F, 5.3537F, -4.5402F, 0.3315F, -0.0047F, 0.1341F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(113, 23).addBox(-0.049F, 0.273F, -0.7971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4402F, 12.5525F, -7.3998F, 0.0261F, -0.0047F, 0.0643F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(108, 32).addBox(-0.049F, -2.1769F, 1.0253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.4402F, 12.5525F, -7.3998F, -2.0247F, -0.0047F, 0.0643F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 100).addBox(-0.049F, -1.9865F, 1.8633F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4402F, 12.5525F, -7.3998F, -1.5447F, -0.0047F, 0.0643F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 92).addBox(-0.049F, -1.5709F, 2.487F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4402F, 12.5525F, -7.3998F, -1.3702F, -0.0047F, 0.0643F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(108, 28).addBox(-0.049F, 3.2727F, 0.9937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4402F, 12.5525F, -7.3998F, -1.0647F, -0.0047F, 0.0643F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(108, 24).addBox(-0.049F, 1.7572F, -0.2458F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4402F, 12.5525F, -7.3998F, -0.7157F, -0.0047F, 0.0643F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 108).addBox(-0.049F, -0.1212F, -0.644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4402F, 12.5525F, -7.3998F, -0.4975F, -0.0047F, 0.0643F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 100).addBox(-0.333F, -0.0282F, -0.3583F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6879F, 8.8089F, -6.1843F, -0.3666F, -0.0047F, 0.2214F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(52, 102).addBox(-0.993F, 1.5802F, -2.2116F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7319F, 5.3537F, -4.5402F, -0.0175F, -0.0047F, 0.1341F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(67, 37).addBox(-1.0094F, -0.0639F, -2.3767F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7319F, 2.7537F, -4.5402F, -0.1921F, -0.0047F, 0.0381F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(93, 45).addBox(-0.5F, -0.7004F, -0.5269F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3992F, 2.8359F, -10.1042F, 1.455F, -0.2676F, -0.5107F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(66, 100).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6033F, 1.8219F, -9.3795F, 0.6259F, -0.2676F, -0.5107F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 102).addBox(-0.5F, 0.1789F, 0.4622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3992F, 2.8359F, -10.1042F, 0.8877F, -0.2676F, -0.5107F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(37, 93).addBox(-2.2903F, -0.6296F, 1.6769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0557F, -0.628F, -8.1309F, -0.7693F, -0.3037F, -0.4681F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(24, 101).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4239F, -0.251F, -8.9279F, 0.531F, -0.3037F, -0.4681F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(88, 61).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2981F, -0.3873F, -7.0678F, 0.2256F, -0.3037F, -0.4681F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 79).addBox(-0.58F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -8.0F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.4F, -5.2867F, 5.1549F));

		PartDefinition cube_r32 = bone5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(91, 87).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0874F, 0.2013F, -2.0316F, -0.4489F, 0.0321F, 0.4016F));

		PartDefinition cube_r33 = bone5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(58, 88).mirror().addBox(-0.4173F, 3.7931F, -4.5175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 89).mirror().addBox(-0.4173F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r34 = bone5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(100, 76).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3117F, 2.9478F, -1.8834F, 0.6439F, 0.0327F, 0.4104F));

		PartDefinition cube_r35 = bone5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-1.575F, -0.9F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1094F, 3.086F, 0.6268F, -0.0978F, 0.0327F, 0.4104F));

		PartDefinition cube_r36 = bone5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(77, 62).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.703F, 2.0261F, 3.1372F, -0.3029F, 0.0391F, 0.4053F));

		PartDefinition cube_r37 = bone5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(25, 113).mirror().addBox(-0.007F, 1.144F, 2.2778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 5.3537F, -4.5402F, -0.2357F, 0.0047F, -0.1341F));

		PartDefinition cube_r38 = bone5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(82, 45).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4878F, 9.1399F, 0.0436F, -0.7857F, 0.1025F, -0.0354F));

		PartDefinition cube_r39 = bone5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(88, 51).mirror().addBox(-0.7001F, -0.3161F, 3.4019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 5.3537F, -4.5402F, -0.6815F, 0.2488F, -0.1877F));

		PartDefinition cube_r40 = bone5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(102, 50).mirror().addBox(-0.7001F, 2.8251F, 2.6108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 5.3537F, -4.5402F, -0.0707F, 0.2488F, -0.1877F));

		PartDefinition cube_r41 = bone5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(32, 109).mirror().addBox(-0.007F, 2.3593F, 1.6333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(11, 74).mirror().addBox(-0.007F, 1.3593F, -2.3667F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 5.3537F, -4.5402F, 0.1134F, 0.0047F, -0.1341F));

		PartDefinition cube_r42 = bone5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(113, 26).mirror().addBox(0.1131F, 0.9146F, 0.8141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(0, 71).mirror().addBox(0.1131F, -1.0854F, -2.6859F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 5.3537F, -4.5402F, 0.3315F, 0.0047F, -0.0469F));

		PartDefinition cube_r43 = bone5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(27, 109).mirror().addBox(-0.007F, 1.9164F, 0.8129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 5.3537F, -4.5402F, 0.3315F, 0.0047F, -0.1341F));

		PartDefinition cube_r44 = bone5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(113, 23).mirror().addBox(-0.9511F, 0.273F, -0.7971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4402F, 12.5525F, -7.3998F, 0.0261F, 0.0047F, -0.0643F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(108, 32).mirror().addBox(-0.9511F, -2.1769F, 1.0253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.4402F, 12.5525F, -7.3998F, -2.0247F, 0.0047F, -0.0643F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(78, 100).mirror().addBox(-0.9511F, -1.9865F, 1.8633F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4402F, 12.5525F, -7.3998F, -1.5447F, 0.0047F, -0.0643F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.9511F, -1.5709F, 2.487F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4402F, 12.5525F, -7.3998F, -1.3702F, 0.0047F, -0.0643F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(108, 28).mirror().addBox(-0.9511F, 3.2727F, 0.9937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4402F, 12.5525F, -7.3998F, -1.0647F, 0.0047F, -0.0643F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(108, 24).mirror().addBox(-0.9511F, 1.7572F, -0.2458F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4402F, 12.5525F, -7.3998F, -0.7157F, 0.0047F, -0.0643F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(22, 108).mirror().addBox(-0.9511F, -0.1212F, -0.644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4402F, 12.5525F, -7.3998F, -0.4975F, 0.0047F, -0.0643F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.667F, -0.0282F, -0.3583F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6879F, 8.8089F, -6.1843F, -0.3666F, 0.0047F, -0.2214F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(52, 102).mirror().addBox(-0.007F, 1.5802F, -2.2116F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 5.3537F, -4.5402F, -0.0175F, 0.0047F, -0.1341F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(67, 37).mirror().addBox(0.0094F, -0.0639F, -2.3767F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 2.7537F, -4.5402F, -0.1921F, 0.0047F, -0.0381F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(93, 45).mirror().addBox(-0.5F, -0.7004F, -0.5269F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3992F, 2.8359F, -10.1042F, 1.455F, 0.2676F, 0.5107F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(66, 100).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6033F, 1.8219F, -9.3795F, 0.6259F, 0.2676F, 0.5107F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(40, 102).mirror().addBox(-0.5F, 0.1789F, 0.4622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3992F, 2.8359F, -10.1042F, 0.8877F, 0.2676F, 0.5107F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(37, 93).mirror().addBox(1.2903F, -0.6296F, 1.6769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0557F, -0.628F, -8.1309F, -0.7693F, 0.3037F, 0.4681F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(24, 101).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4239F, -0.251F, -8.9279F, 0.531F, 0.3037F, 0.4681F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2981F, -0.3873F, -7.0678F, 0.2256F, 0.3037F, 0.4681F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.42F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, -8.0F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(62, 75).addBox(-0.4F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -0.1271F, 0.6862F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(75, 69).addBox(-2.5F, -0.075F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 12.3631F, -1.1369F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(47, 92).addBox(-5.5F, 0.3009F, -0.2005F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 8.9831F, -1.407F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(92, 20).addBox(-5.5F, 0.0293F, 0.0442F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 6.2851F, -1.5601F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(51, 84).addBox(-1.5F, -0.4F, -2.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.9376F, 1.0007F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(102, 66).addBox(-1.7F, 12.6153F, -0.9513F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.0F, 14.349F, 1.5745F, 2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(73, 102).addBox(0.5F, -2.4F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(104, 57).addBox(-1.5F, 0.4073F, -2.5549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2F, 2.5471F, 2.7883F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(84, 76).addBox(-1.5F, -2.807F, -1.2331F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 2.5471F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(108, 36).addBox(0.5F, -4.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.2F, 17.7687F, -1.7911F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(47, 69).addBox(-1.5F, -6.0F, 0.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(69, 21).addBox(-1.5F, -6.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(95, 61).addBox(-2.5F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.1471F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(81, 92).addBox(-2.5F, -0.0365F, 0.0073F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4F, 8.7045F, -1.33F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(35, 98).addBox(-2.5F, -4.2365F, 0.0073F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 8.9039F, -1.3457F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(102, 61).addBox(-2.5F, -0.1725F, -0.457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.1197F, 0.2582F, -0.2967F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(30, 72).addBox(-1.4F, 0.0553F, -0.5239F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.8875F, -0.9873F, -2.138F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(38, 55).addBox(-1.9F, -0.0746F, -3.9368F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 9.69F, 0.1934F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(44, 39).addBox(-2.9F, -0.8F, -5.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.3017F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(73, 76).addBox(-1.6F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.1271F, 0.6862F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(77, 55).addBox(0.5F, -0.075F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 12.3631F, -1.1369F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(93, 14).addBox(4.5F, 0.3009F, -0.2005F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 8.9831F, -1.407F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(93, 8).addBox(4.5F, 0.0293F, 0.0442F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 6.2851F, -1.5601F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(85, 20).addBox(0.5F, -0.4F, -2.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 1.9376F, 1.0007F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(35, 104).addBox(0.7F, 12.6153F, -0.9513F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.0F, 14.349F, 1.5745F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(47, 104).addBox(-1.5F, -2.4F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(62, 104).addBox(0.5F, 0.4073F, -2.5549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, 2.5471F, 2.7883F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(85, 28).addBox(0.5F, -2.807F, -1.2331F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.5471F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(106, 108).addBox(-1.5F, -4.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2F, 17.7687F, -1.7911F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(57, 69).addBox(0.5F, -6.0F, 0.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(52, 69).addBox(0.5F, -6.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(95, 69).addBox(1.5F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.1471F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(86, 92).addBox(1.5F, -0.0365F, 0.0073F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.4F, 8.7045F, -1.33F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(98, 36).addBox(1.5F, -4.2365F, 0.0073F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 8.9039F, -1.3457F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(17, 104).addBox(1.5F, -0.1725F, -0.457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.1197F, 0.2582F, -0.2967F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(37, 72).addBox(-0.6F, 0.0553F, -0.5239F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.8875F, -0.9873F, -0.9599F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(57, 55).addBox(-3.1F, -0.0746F, -3.9368F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 9.69F, 0.1934F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(44, 47).addBox(-2.1F, -0.8F, -5.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.4762F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4285F, 8.5775F, -0.3079F, -0.1248F, 0.0396F));

		PartDefinition cube_r89 = tail1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(44, 93).addBox(0.0F, -0.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0381F, 7.8381F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(73, 113).addBox(0.5F, 2.1871F, 2.4246F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 109).addBox(0.5F, -0.4129F, 0.4246F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 79).addBox(0.5F, -2.0129F, -1.5754F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 2.0709F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 108).addBox(0.5F, -2.7823F, 6.7838F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 76).addBox(0.5F, -2.7823F, 4.7838F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 107).addBox(0.5F, -2.7823F, 2.7838F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 63).addBox(0.5F, -2.7823F, 0.7838F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 104).addBox(0.5F, -2.7823F, -1.2162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9438F, 1.0709F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2516F, 0.0289F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r93 = tail1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2516F, 0.0289F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r94 = tail1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(29, 0).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 0.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.2745F, 8.9514F, 0.0873F, -0.2182F, 0.0F));

		PartDefinition cube_r95 = tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1575F, 0.069F, 0.0109F));

		PartDefinition cube_r96 = tail.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(69, 8).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1575F, -0.069F, -0.0109F));

		PartDefinition cube_r97 = tail.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(21, 50).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(82, 115).addBox(0.0F, 1.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 18).addBox(0.0F, -0.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1364F, 3.7429F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(78, 95).addBox(0.0F, -0.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(106, 112).addBox(0.5F, -1.5823F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 4.7753F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(14, 111).addBox(0.5F, -1.8823F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 2.8025F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(17, 55).addBox(0.5F, -2.0823F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, 0.8174F, 0.0785F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.2126F, -0.1707F, -0.0366F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(79, 115).addBox(0.0F, -1.7311F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 6.0228F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(76, 115).addBox(0.0F, -1.6561F, 4.0684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 75).addBox(0.0F, -1.6061F, 2.0684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, -0.054F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(84, 51).addBox(0.0F, -1.5561F, 0.0684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, -0.054F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(50, 20).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(50, 10).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(115, 85).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 115).addBox(0.0F, 0.8F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 115).addBox(0.0F, 0.4F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3862F, 1.7446F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.9F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4564F, 0.0304F, 0.0175F, 0.0698F, 0.0012F));

		PartDefinition cube_r109 = tail2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 55).addBox(-0.1F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4564F, 0.0304F, 0.0175F, -0.0698F, -0.0012F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(11, 71).addBox(0.0F, -1.7275F, -0.1332F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 79).addBox(0.0F, -1.6525F, 1.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 115).addBox(0.0F, -1.6775F, 3.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 115).addBox(0.0F, -1.7025F, 5.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 115).addBox(0.0F, -1.7025F, 7.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0494F, -0.0944F, 0.1259F));

		PartDefinition cube_r110 = tail8.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1017F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail8.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(51, 116).addBox(0.0F, 1.2F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 116).addBox(0.0F, 0.9F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 116).addBox(0.0F, 0.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 116).addBox(0.0F, 0.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 12).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5345F, -0.0477F, 0.2269F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(95, 36).addBox(0.0F, -1.4968F, 0.898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 115).addBox(0.0F, -1.4968F, 2.898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 116).addBox(0.0F, -1.4968F, 4.898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 18).addBox(0.0F, -1.4968F, 6.898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0033F, -0.1764F, 0.1283F));

		PartDefinition cube_r112 = tail3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(116, 108).addBox(0.0F, 2.3F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 102).addBox(0.0F, 2.0F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 99).addBox(0.0F, 1.8F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 116).addBox(0.0F, 1.5F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7569F, -8.95F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(23, 39).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.1349F, -0.1525F, 0.194F));

		PartDefinition cube_r114 = tail9.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail9.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(28, 116).addBox(0.0F, -0.475F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 116).addBox(0.0F, -0.575F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 66).addBox(0.0F, -0.575F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2579F, 0.5682F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail9.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(8, 117).addBox(0.0F, 3.2F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 117).addBox(0.0F, 2.9F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 111).addBox(0.0F, 2.7F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4958F, -17.7798F, 0.2269F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.0704F, -0.1306F, 0.0092F));

		PartDefinition cube_r117 = tail4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(47, 61).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(69, 14).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.4098F, 6.0596F, -0.2055F, -0.2137F, 0.0442F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 4.6774F, -0.1496F, -0.1295F, 0.0195F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0925F, 7.6858F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, -0.0352F, 0.1308F, -0.0046F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(44, 72).addBox(-0.5F, -3.4105F, -0.1178F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.169F, -1.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(52, 107).addBox(-0.5F, -3.1522F, -0.0114F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4213F, -5.8697F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(3, 108).addBox(-0.5F, -3.2272F, -0.0114F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.369F, -3.8704F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(17, 60).addBox(-1.0F, 0.0F, 2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(15, 69).addBox(-1.0F, -0.9427F, -0.032F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 9.2114F, -14.7384F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(25, 28).addBox(-1.5F, -2.994F, 0.0314F, 5.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 11.4415F, -8.1972F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(107, 47).mirror().addBox(-1.5804F, 0.2718F, -0.4927F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -5.4704F, 0.0553F, 0.0532F, -0.5728F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(104, 102).mirror().addBox(-3.5472F, -0.4216F, -0.4927F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -5.4704F, 0.0276F, 0.0716F, -1.0096F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(97, 74).mirror().addBox(-5.705F, -2.3331F, -0.4927F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -5.4704F, -0.0172F, 0.0748F, -1.6047F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(107, 45).mirror().addBox(-1.6589F, 0.3649F, -0.4781F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.169F, -1.4704F, -0.0693F, -0.01F, -0.8199F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(104, 100).mirror().addBox(-3.6577F, -0.3704F, -0.4781F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.169F, -1.4704F, -0.0585F, -0.0384F, -1.2554F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(107, 43).mirror().addBox(-4.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -3.4704F, -0.0203F, 0.0312F, -1.6747F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(97, 104).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -3.4704F, 0.0006F, 0.0372F, -1.0809F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(107, 41).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -3.4704F, 0.0163F, 0.0335F, -0.6443F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(107, 45).addBox(-0.3411F, 0.3649F, -0.4781F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.169F, -1.4704F, -0.0693F, 0.01F, 0.8199F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(104, 100).addBox(1.6576F, -0.3704F, -0.4781F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.169F, -1.4704F, -0.0585F, 0.0384F, 1.2554F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(97, 74).addBox(2.705F, -2.3331F, -0.4927F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -5.4704F, -0.0172F, -0.0748F, 1.6047F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(104, 102).addBox(1.5472F, -0.4216F, -0.4927F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -5.4704F, 0.0276F, -0.0716F, 1.0096F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(107, 47).addBox(-0.4196F, 0.2718F, -0.4927F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -5.4704F, 0.0553F, -0.0532F, 0.5728F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(107, 43).addBox(2.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -3.4704F, -0.0203F, -0.0312F, 1.6747F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(97, 104).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -3.4704F, 0.0006F, -0.0372F, 1.0809F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(107, 41).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -3.4704F, 0.0163F, -0.0335F, 0.6443F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, -1.1F, -6.1F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, 0.0137F, 0.0879F, -0.0423F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(70, 104).addBox(0.0F, -2.9122F, -0.0627F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0807F, -1.9945F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(70, 110).addBox(0.0F, -2.4117F, 0.0386F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -6.0951F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-9.6254F, -2.3368F, -0.5131F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.15F, -5.6F, 0.0595F, 0.2554F, -1.4408F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(108, 86).mirror().addBox(-3.4833F, -0.4692F, -0.5131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.15F, -5.6F, 0.1932F, 0.1782F, -0.8377F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(107, 61).mirror().addBox(-1.5427F, 0.2016F, -0.5131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.15F, -5.6F, 0.2495F, 0.0809F, -0.4085F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-1.5541F, 0.2263F, -0.5009F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -1.6F, 0.1274F, 0.0624F, -0.4659F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(103, 89).mirror().addBox(-3.5042F, -0.4517F, -0.5009F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -1.6F, 0.0892F, 0.1103F, -0.9013F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(82, 6).mirror().addBox(-7.6525F, -2.334F, -0.5009F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -1.6F, 0.012F, 0.1413F, -1.4988F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(104, 104).mirror().addBox(-1.5464F, 0.2099F, -0.5127F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.15F, -3.6F, 0.1998F, 0.0643F, -0.4296F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(107, 69).mirror().addBox(-3.4902F, -0.4633F, -0.5127F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.15F, -3.6F, 0.1545F, 0.1424F, -0.8613F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(50, 37).mirror().addBox(-9.6344F, -2.3358F, -0.5127F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.15F, -3.6F, 0.048F, 0.2042F, -1.4609F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(107, 61).addBox(-0.4574F, 0.2016F, -0.5131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.15F, -5.6F, 0.2495F, -0.0809F, 0.4085F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(108, 86).addBox(1.4833F, -0.4692F, -0.5131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.15F, -5.6F, 0.1932F, -0.1782F, 0.8377F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(30, 70).addBox(2.6254F, -2.3368F, -0.5131F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.15F, -5.6F, 0.0595F, -0.2554F, 1.4408F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(37, 109).addBox(0.0F, -2.7117F, 0.0386F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -4.0951F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 106).addBox(-0.4458F, 0.2263F, -0.5009F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -1.6F, 0.1274F, -0.0624F, 0.4659F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(50, 30).addBox(-1.5F, -1.9691F, -0.0686F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 10.7054F, -6.368F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(103, 89).addBox(1.5042F, -0.4517F, -0.5009F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -1.6F, 0.0892F, -0.1103F, 0.9013F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(82, 6).addBox(2.6525F, -2.334F, -0.5009F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -1.6F, 0.012F, -0.1413F, 1.4988F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(104, 104).addBox(-0.4536F, 0.2099F, -0.5127F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.15F, -3.6F, 0.1998F, -0.0643F, 0.4296F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(107, 69).addBox(1.4902F, -0.4633F, -0.5127F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.15F, -3.6F, 0.1545F, -0.1424F, 0.8613F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(50, 37).addBox(2.6344F, -2.3358F, -0.5127F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.15F, -3.6F, 0.048F, -0.2042F, 1.4609F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.49F, -5.9469F, 0.1664F, 0.0861F, 0.0144F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(6, 110).addBox(0.0F, -2.1775F, -0.1399F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(58, 84).addBox(0.0F, -1.8717F, -0.0424F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(29, 12).addBox(-3.4872F, -0.7794F, -1.9816F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 8.8907F, -5.1578F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(78, 106).mirror().addBox(-1.5752F, 0.2607F, -0.5392F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -5.4F, 0.2525F, 0.0639F, -0.5521F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(106, 74).mirror().addBox(-3.5378F, -0.4294F, -0.5392F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -5.4F, 0.2031F, 0.164F, -0.9798F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(-6.6928F, -2.3343F, -0.5392F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -5.4F, 0.0761F, 0.2492F, -1.5804F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(40, 106).mirror().addBox(-1.5542F, 0.2255F, -0.5202F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.5F, 0.1695F, 0.0405F, -0.4683F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(106, 22).mirror().addBox(-3.5039F, -0.4525F, -0.5202F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.5F, 0.1368F, 0.1081F, -0.9006F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(74, 35).mirror().addBox(-8.6518F, -2.3345F, -0.5202F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.5F, 0.0528F, 0.1661F, -1.4971F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(-9.6353F, -2.3357F, -0.5121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -1.6F, 0.0385F, 0.1337F, -1.4639F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(22, 106).mirror().addBox(-3.4909F, -0.4627F, -0.5121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -1.6F, 0.1068F, 0.0893F, -0.8683F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(106, 20).mirror().addBox(-1.5467F, 0.2107F, -0.5121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -1.6F, 0.1344F, 0.0359F, -0.4343F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-2.2629F, -0.9439F, -3.8708F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4872F, 7.9907F, -6.8578F, -1.0729F, -0.2437F, 0.4177F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(83, 104).mirror().addBox(-1.6815F, -0.4397F, -0.4054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9595F, 7.9796F, -5.4134F, -0.7626F, 1.0398F, 0.5295F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(86, 74).mirror().addBox(-2.8696F, -0.2414F, -0.1276F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7485F, 8.4519F, -4.9553F, -0.8475F, 1.0764F, -0.2411F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(80, 37).mirror().addBox(-4.8056F, -0.0247F, -0.04F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6616F, 8.7092F, -4.9958F, -0.5347F, 1.1264F, -0.4405F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(78, 106).addBox(-0.4248F, 0.2607F, -0.5392F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -5.4F, 0.2525F, -0.0639F, 0.5521F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(106, 74).addBox(1.5378F, -0.4294F, -0.5392F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -5.4F, 0.2031F, -0.164F, 0.9798F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(88, 67).addBox(2.6928F, -2.3343F, -0.5392F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -5.4F, 0.0761F, -0.2492F, 1.5804F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(40, 106).addBox(-0.4458F, 0.2255F, -0.5202F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.5F, 0.1695F, -0.0405F, 0.4683F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(106, 22).addBox(1.5039F, -0.4525F, -0.5202F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.5F, 0.1368F, -0.1081F, 0.9006F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(74, 35).addBox(2.6518F, -2.3345F, -0.5202F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.5F, 0.0528F, -0.1661F, 1.4971F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(67, 53).addBox(2.6353F, -2.3357F, -0.5121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -1.6F, 0.0385F, -0.1337F, 1.4639F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(22, 106).addBox(1.4909F, -0.4627F, -0.5121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -1.6F, 0.1068F, -0.0893F, 0.8683F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(106, 20).addBox(-0.4533F, 0.2107F, -0.5121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -1.6F, 0.1344F, -0.0359F, 0.4343F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(109, 52).addBox(0.0F, -1.9926F, -0.2837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -5.8F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(67, 46).addBox(0.2629F, -0.9439F, -3.8708F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4872F, 7.9907F, -6.8578F, -1.0729F, 0.2437F, -0.4177F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(83, 104).addBox(-0.3185F, -0.4397F, -0.4054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9595F, 7.9796F, -5.4134F, -0.7626F, -1.0398F, -0.5295F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(86, 74).addBox(-1.1304F, -0.2414F, -0.1276F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7485F, 8.4519F, -4.9553F, -0.8475F, -1.0764F, 0.2411F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(80, 37).addBox(-1.1944F, -0.0247F, -0.04F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6616F, 8.7092F, -4.9958F, -0.5347F, -1.1264F, 0.4405F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(62, 69).addBox(-1.4872F, -0.9439F, -3.9947F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 7.9907F, -6.8578F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(74, 21).addBox(-0.5F, -0.1119F, -3.9679F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.2913F, 5.67F, -6.3201F));

		PartDefinition cube_r195 = bone2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(40, 98).addBox(-0.5F, -0.375F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2196F, -5.2579F, 3.0637F, 0.6208F, -0.0235F, -0.1021F));

		PartDefinition cube_r196 = bone2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(97, 57).addBox(-0.4276F, 0.0302F, -0.1922F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -5.7561F, 2.8854F, 0.996F, -0.0235F, -0.1021F));

		PartDefinition cube_r197 = bone2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(82, 0).addBox(-0.9118F, 0.1857F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7087F, -3.1112F, 0.2614F, 0.7941F, -0.0009F, -0.0174F));

		PartDefinition cube_r198 = bone2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(80, 39).addBox(-0.9118F, 0.1607F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7087F, -3.1112F, 0.2614F, 0.8378F, -0.0009F, -0.0174F));

		PartDefinition cube_r199 = bone2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(88, 56).addBox(-0.9F, -0.1487F, -3.5266F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.7087F, -3.2112F, 0.7364F, 1.2915F, 0.1346F, 0.2175F));

		PartDefinition cube_r200 = bone2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 87).addBox(-0.9F, -0.1487F, -3.3266F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7087F, -3.2112F, 0.7364F, 0.986F, 0.1346F, 0.2175F));

		PartDefinition cube_r201 = bone2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(30, 93).addBox(-0.5F, -0.9F, -0.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5923F, -0.4227F, -1.3737F, 1.0981F, 0.9752F, 0.5835F));

		PartDefinition cube_r202 = bone2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(93, 76).addBox(-0.0516F, -0.2255F, -2.0056F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 0.0F, 0.0F, 0.3214F, 0.9752F, 0.5835F));

		PartDefinition cube_r203 = bone2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(54, 93).addBox(-0.0516F, -1.1317F, -2.051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, 0.0F, 0.0F, 0.0509F, 0.9752F, 0.5835F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.2913F, 5.67F, -6.3201F));

		PartDefinition cube_r204 = bone4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(40, 98).mirror().addBox(-0.5F, -0.375F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2196F, -5.2579F, 3.0637F, 0.6208F, 0.0235F, 0.1021F));

		PartDefinition cube_r205 = bone4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(97, 57).mirror().addBox(-0.5724F, 0.0302F, -0.1922F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -5.7561F, 2.8854F, 0.996F, 0.0235F, 0.1021F));

		PartDefinition cube_r206 = bone4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-0.0882F, 0.1857F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -3.1112F, 0.2614F, 0.7941F, 0.0009F, 0.0174F));

		PartDefinition cube_r207 = bone4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(80, 39).mirror().addBox(-0.0882F, 0.1607F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -3.1112F, 0.2614F, 0.8378F, 0.0009F, 0.0174F));

		PartDefinition cube_r208 = bone4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-0.1F, -0.1487F, -3.5266F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -3.2112F, 0.7364F, 1.2915F, -0.1346F, -0.2175F));

		PartDefinition cube_r209 = bone4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.1F, -0.1487F, -3.3266F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -3.2112F, 0.7364F, 0.986F, -0.1346F, -0.2175F));

		PartDefinition cube_r210 = bone4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(30, 93).mirror().addBox(-0.5F, -0.9F, -0.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5923F, -0.4227F, -1.3737F, 1.0981F, -0.9752F, -0.5835F));

		PartDefinition cube_r211 = bone4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(93, 76).mirror().addBox(-0.9484F, -0.2255F, -2.0056F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, 0.3214F, -0.9752F, -0.5835F));

		PartDefinition cube_r212 = bone4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(54, 93).mirror().addBox(-0.9484F, -1.1317F, -2.051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, 0.0509F, -0.9752F, -0.5835F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2709F, 5.6335F, -6.419F, 0.2226F, 0.1783F, -0.2062F));

		PartDefinition cube_r213 = leftArm1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(7, 106).addBox(-1.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.8893F, 0.2018F, -0.7676F, 0.1498F));

		PartDefinition cube_r214 = leftArm1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(29, 105).addBox(-1.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.8893F, 0.5713F, -0.6678F, 0.2037F));

		PartDefinition cube_r215 = leftArm1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(38, 50).addBox(6.0F, -1.2842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r216 = leftArm1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(47, 98).addBox(-0.5F, -1.4F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.2943F, 0.6372F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(61, 93).addBox(-0.8F, -0.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 93).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2863F, 5.794F, 1.2732F, -1.006F, -0.0704F, 0.0014F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1399F, 4.9447F, 0.2266F, -0.3054F, 0.0F, 0.1745F));

		PartDefinition cube_r217 = leftHand.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(35, 39).addBox(-0.05F, 0.4F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5244F, 0.0672F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftHand.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(12, 93).addBox(0.0F, -2.5F, 0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftHand.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(97, 50).addBox(0.0F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2709F, 5.6335F, -6.419F, 0.4102F, -0.2618F, 0.0F));

		PartDefinition cube_r220 = rightArm1.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(101, 108).addBox(0.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.8893F, 0.2018F, 0.7676F, -0.1498F));

		PartDefinition cube_r221 = rightArm1.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(96, 108).addBox(0.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.8893F, 0.5713F, 0.6678F, -0.2037F));

		PartDefinition cube_r222 = rightArm1.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(103, 84).addBox(-7.0F, -1.2842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r223 = rightArm1.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(12, 101).addBox(-0.5F, -1.4F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.2943F, 0.6372F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(73, 95).addBox(-0.2F, -0.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 93).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2863F, 5.794F, 1.2732F, -0.7882F, -0.0156F, -0.0164F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1399F, 4.9447F, 0.2266F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r224 = rightHand.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(40, 16).addBox(-0.5F, 0.0F, -0.375F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0943F, -0.3002F, 0.2094F, 0.0054F, -0.0256F));

		PartDefinition cube_r225 = rightHand.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(25, 93).addBox(-1.0F, -2.5F, 0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r226 = rightHand.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(30, 98).addBox(-1.0F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4308F, -6.7304F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r227 = neck1.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(47, 88).addBox(0.0F, -1.4709F, -1.016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6932F, -1.0134F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r228 = neck1.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(38, 88).addBox(-0.5F, -0.2F, 3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F))
				.texOffs(82, 87).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.8415F, -5.552F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r229 = neck1.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(92, 106).mirror().addBox(-2.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5474F, -1.3213F, 1.0542F, 0.9677F, -0.3058F));

		PartDefinition cube_r230 = neck1.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(85, 106).mirror().addBox(-3.8295F, -0.8211F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5474F, -1.3213F, 0.3395F, 1.2691F, -1.0847F));

		PartDefinition cube_r231 = neck1.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(92, 106).addBox(0.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5474F, -1.3213F, 1.0542F, -0.9677F, 0.3058F));

		PartDefinition cube_r232 = neck1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(85, 106).addBox(1.8295F, -0.8211F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5474F, -1.3213F, 0.3395F, -1.2691F, 1.0847F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3884F, -2.6199F, 0.3765F, 0.0812F, 0.0321F));

		PartDefinition cube_r233 = neck2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(22, 115).addBox(0.0F, -1.6816F, -0.0991F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3483F, -0.8069F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r234 = neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(90, 104).mirror().addBox(-3.737F, -0.79F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3071F, -0.8534F, -0.0608F, 0.9984F, -1.5262F));

		PartDefinition cube_r235 = neck2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(99, 106).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3071F, -0.8534F, 0.5418F, 0.8879F, -0.794F));

		PartDefinition cube_r236 = neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(90, 104).addBox(1.737F, -0.79F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3071F, -0.8534F, -0.0608F, -0.9984F, 1.5262F));

		PartDefinition cube_r237 = neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(99, 106).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3071F, -0.8534F, 0.5418F, -0.8879F, 0.794F));

		PartDefinition cube_r238 = neck2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(52, 98).addBox(-0.5F, 1.4F, 6.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5911F, -7.8781F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(5, 115).addBox(0.0F, -2.2484F, -1.0231F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0907F, -1.8877F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(59, 100).addBox(-0.5F, 1.4F, 4.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.483F, -5.892F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1827F, -0.9874F, 0.531F, 1.0218F, -0.7689F));

		PartDefinition cube_r241 = neck5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(106, 106).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1827F, -0.9874F, -0.2627F, 1.0861F, -1.6669F));

		PartDefinition cube_r242 = neck5.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(107, 0).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1827F, -0.9874F, 0.531F, -1.0218F, 0.7689F));

		PartDefinition cube_r243 = neck5.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(106, 106).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1827F, -0.9874F, -0.2627F, -1.0861F, 1.6669F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3395F, -1.6947F, -0.3502F, 0.1683F, 0.2448F));

		PartDefinition cube_r244 = neck4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(107, 4).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2657F, -1.9954F, -0.1463F, 1.2113F, -1.557F));

		PartDefinition cube_r245 = neck4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(107, 2).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2657F, -1.9954F, 0.7869F, 1.0553F, -0.5446F));

		PartDefinition cube_r246 = neck4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(107, 4).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2657F, -1.9954F, -0.1463F, -1.2113F, 1.557F));

		PartDefinition cube_r247 = neck4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(107, 2).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2657F, -1.9954F, 0.7869F, -1.0553F, 0.5446F));

		PartDefinition cube_r248 = neck4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(25, 89).addBox(0.0F, -1.1677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9183F, -1.9832F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r249 = neck4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(29, 88).addBox(-0.5F, 1.4F, 1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3153F, -2.7584F, 0.4556F, 0.0706F, 0.0514F));

		PartDefinition cube_r250 = neck3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(113, 97).mirror().addBox(-2.8627F, -0.3478F, -0.617F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2681F, -0.7577F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r251 = neck3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(107, 8).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2681F, -0.7577F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(95, 6).mirror().addBox(-2.8842F, -0.348F, -0.6322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1681F, -2.6577F, 0.0301F, 0.7755F, -1.5857F));

		PartDefinition cube_r253 = neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(107, 6).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1681F, -2.6577F, 0.416F, 0.6757F, -1.0136F));

		PartDefinition cube_r254 = neck3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(113, 97).addBox(1.8627F, -0.3478F, -0.617F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2681F, -0.7577F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r255 = neck3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(107, 8).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2681F, -0.7577F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r256 = neck3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(95, 6).addBox(1.8842F, -0.348F, -0.6322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1681F, -2.6577F, 0.0301F, -0.7755F, 1.5857F));

		PartDefinition cube_r257 = neck3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(107, 6).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1681F, -2.6577F, 0.416F, -0.6757F, 1.0136F));

		PartDefinition cube_r258 = neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(70, 115).addBox(0.5F, -1.3458F, -0.1223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0315F, -2.3346F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(91, 115).addBox(0.5F, -1.869F, 0.0228F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7941F, -0.8495F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(86, 69).addBox(0.0F, 1.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.7315F, 1.3654F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6363F, -2.487F, -0.3871F, 0.1707F, -0.0366F));

		PartDefinition cube_r261 = neck.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(114, 50).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -1.9F, 0.0445F, 1.2946F, -1.6241F));

		PartDefinition cube_r262 = neck.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(107, 10).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -1.9F, 0.9928F, 1.0488F, -0.6141F));

		PartDefinition cube_r263 = neck.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(114, 50).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8F, -1.9F, 0.0445F, -1.2946F, 1.6241F));

		PartDefinition cube_r264 = neck.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(98, 86).addBox(0.5F, -1.1207F, 1.7987F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9952F, -4.7476F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(9, 82).addBox(0.0F, 1.3815F, -4.2683F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3952F, -0.0476F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r266 = neck.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(107, 10).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8F, -1.9F, 0.9928F, -1.0488F, 0.6141F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8341F, -2.7607F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(91, 39).addBox(-1.0F, -0.1055F, -0.0528F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.5F, -0.1471F, -4.7781F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(74, 89).addBox(-1.0F, -0.7873F, -0.03F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 1.0529F, -7.2781F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(17, 100).addBox(-1.0F, 3.1805F, -0.2989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.5F, 0.6279F, -6.3531F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(100, 16).addBox(-1.0F, 0.0078F, -0.0329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 2.4529F, -10.1031F, -0.9817F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(113, 29).addBox(-1.0F, -0.0008F, 0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.5918F, -11.4421F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(96, 112).addBox(-1.0F, 1.8493F, -0.6764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8779F, -9.3031F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(91, 112).addBox(-1.0F, 2.4236F, -2.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 1.8779F, -9.3031F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(86, 112).addBox(0.0F, -0.0103F, -1.407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -2.4865F, -1.7188F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(100, 12).addBox(0.0F, -1.5327F, -1.6271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -2.4865F, -0.7188F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(25, 16).addBox(-1.0F, -0.325F, -6.1F, 2.0F, 1.0F, 10.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.4512F, -4.3177F, 0.3221F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(81, 112).addBox(0.0F, 1.4999F, 0.3188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -2.6865F, -3.0188F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(62, 61).addBox(-1.9404F, -0.025F, -4.025F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -1.9854F, -1.1785F, 0.4692F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(62, 82).addBox(-1.5F, -0.0129F, -1.9968F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9775F, 0.3132F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(40, 84).addBox(-1.5F, -0.0879F, -1.9468F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7355F, -0.2194F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(29, 84).addBox(-1.5F, 0.0016F, -1.9458F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9507F, -1.2308F, 1.3875F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.099F, 0.9282F, -0.4031F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(12, 107).addBox(1.107F, -2.4269F, -2.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.3F, -4.7147F, 0.0363F, -1.2216F, 1.1737F, 2.4784F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(83, 100).addBox(-1.0F, 0.0F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6319F, 1.5861F, -9.5737F, -0.9697F, 0.2558F, 0.1883F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(5, 93).addBox(-1.45F, -2.975F, -0.525F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.016F))
				.texOffs(22, 74).addBox(-1.0F, -2.975F, -0.525F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.1857F, 0.6975F, -6.7183F, -1.0887F, 0.1545F, 0.1185F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(113, 35).addBox(-0.55F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9147F, 2.2895F, -9.8188F, 0.6041F, -0.8271F, 0.7801F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(115, 61).addBox(-0.975F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(60, 115).addBox(-0.475F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1425F, 2.7843F, -10.2571F, 0.6134F, 0.8618F, 1.7258F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(109, 49).addBox(-0.278F, -0.2281F, -0.3116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2198F, 2.9719F, -11.011F, 0.4695F, 0.3066F, 1.3808F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(115, 64).addBox(-0.6719F, -0.235F, -0.3115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2198F, 2.9719F, -11.011F, 0.6004F, 0.7628F, 1.7238F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(113, 32).addBox(-1.0068F, 0.0042F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7296F, 3.6814F, -10.3955F, 0.416F, 0.0802F, 1.2675F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(76, 112).addBox(-0.9568F, -0.9208F, -0.9925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.874F, 4.5872F, -9.9272F, 0.0393F, 0.3914F, -0.0057F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(50, 113).addBox(-0.725F, -0.175F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0669F, 3.5828F, -11.5855F, 0.5186F, 0.2149F, 1.3782F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(45, 113).addBox(-1.175F, -0.175F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0669F, 3.5828F, -11.5855F, 0.5559F, 0.4396F, 1.5205F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(113, 38).addBox(-0.775F, -0.175F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.0669F, 3.5828F, -11.5855F, 0.5647F, 0.4396F, 1.5205F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(60, 112).addBox(-0.7818F, -0.7408F, -1.9528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.874F, 4.5872F, -9.9272F, -0.1464F, 0.5638F, -0.0167F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(113, 105).addBox(-1.0F, 0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8049F, 2.6408F, -9.6355F, 0.1859F, -0.01F, 1.0483F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(30, 113).addBox(-1.0F, 0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9991F, 3.6193F, -9.5659F, 0.1727F, -0.0697F, 1.3749F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(55, 112).addBox(-1.0257F, -1.0363F, -1.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0739F, 4.5872F, -8.9272F, 0.1138F, 0.1481F, 0.0242F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(94, 31).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.092F, 3.3868F, -8.2051F, 0.1439F, 0.091F, -0.1768F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(100, 8).addBox(-1.0052F, -0.9576F, -2.0386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.174F, 4.0872F, -7.0022F, 0.2025F, 0.0601F, -0.0013F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(74, 28).addBox(-1.0205F, -1.9759F, -0.7832F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2187F, 2.8828F, -6.8309F, 0.4472F, 0.2416F, -0.1378F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(100, 4).addBox(-0.4999F, -0.4443F, -1.3641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9072F, -0.1874F, -0.0463F, -0.9545F, -0.036F, -0.012F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(112, 52).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9048F, -1.7645F, -0.5012F, -0.4309F, -0.036F, -0.012F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(9, 88).addBox(-0.4999F, 0.0306F, -2.2636F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.9072F, -0.1874F, -0.0463F, -1.3036F, -0.036F, -0.012F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5F, -0.6F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8032F, 0.8415F, 0.8249F, -1.0856F, -0.0378F, -0.0022F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(103, 36).addBox(-0.5F, -3.025F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 1.8814F, -2.047F, 0.3106F, 0.0058F, -0.002F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(93, 0).addBox(-1.0052F, -3.1658F, -1.9487F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, 0.3144F, 0.2413F, 0.0773F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(40, 112).addBox(-1.0052F, -0.6726F, -0.992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, -0.2092F, 0.2413F, 0.0773F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(20, 112).addBox(-0.6734F, -3.2499F, -1.6811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(112, 15).addBox(-0.8484F, -3.2499F, -1.6811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, 0.2226F, 0.2466F, 0.0875F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(112, 12).addBox(-0.9984F, -2.6353F, -0.2192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, 0.8334F, 0.2466F, 0.0875F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(111, 111).addBox(-0.9984F, -1.2972F, -2.5551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, -0.301F, 0.2466F, 0.0875F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(111, 108).addBox(-0.9984F, -2.7032F, -1.898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(111, 99).addBox(-0.9984F, -3.5993F, -1.4189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, 0.3098F, 0.2466F, 0.0875F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(111, 102).addBox(-0.9984F, -2.4107F, -3.0096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, -0.2138F, 0.2466F, 0.0875F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(113, 82).addBox(-0.9984F, 0.5897F, -2.7059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, -1.5228F, 0.2466F, 0.0875F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(65, 113).addBox(-0.9984F, -1.5903F, -3.2577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, -0.6937F, 0.2466F, 0.0875F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(84, 8).addBox(-0.9535F, -0.5404F, -2.9574F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8934F, 0.6897F, -3.2474F, 0.2739F, 0.2627F, 0.0591F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(102, 54).addBox(-1.0F, -0.725F, -1.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3515F, 0.7745F, -0.1449F, 0.7133F, -0.0362F, -0.004F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(100, 80).addBox(0.0F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8515F, 0.7745F, -0.1449F, 0.4515F, -0.0362F, -0.004F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(5, 103).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.3392F, -1.2839F, -0.031F, -1.1193F, -0.0362F, -0.004F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(102, 71).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3392F, -1.2839F, -0.031F, -0.2903F, -0.0362F, -0.004F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(67, 89).addBox(0.0F, -1.4F, -1.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3293F, -0.4377F, 0.3348F, 0.1897F, -0.0362F, -0.004F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(82, 83).addBox(-1.5F, -0.1F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8561F, -2.9421F, -0.525F, 1.1488F, -0.0374F, 0.0107F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(66, 95).addBox(-1.1195F, -1.8278F, 2.0893F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, 1.9598F, 0.2142F, 0.0969F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(94, 26).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3597F, -2.8807F, -0.6088F, 1.9514F, -0.0212F, 0.0172F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(93, 81).addBox(-0.9519F, -1.8643F, 0.1547F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8934F, 0.6897F, -3.2474F, 2.0559F, 0.2674F, 0.118F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(9, 111).addBox(-0.5581F, 0.3247F, 0.4583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2946F, -0.7566F, -5.1168F, 0.9863F, 0.0694F, 0.398F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(110, 88).addBox(-0.5581F, -0.0835F, 0.4911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2946F, -0.7566F, -5.1168F, 0.7158F, 0.0694F, 0.398F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(99, 20).addBox(-0.6665F, -0.0566F, -1.401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2946F, -0.7566F, -5.1168F, 0.7689F, 0.166F, 0.5033F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(73, 83).addBox(-0.7521F, -0.6244F, -2.7114F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3215F, -0.202F, -4.9558F, 0.5439F, 0.126F, 0.1959F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 114).addBox(-0.6964F, -0.2516F, -0.5578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 108).addBox(-0.6964F, -1.1516F, -1.3578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 108).addBox(-0.6964F, -1.0516F, -2.1578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3739F, 2.5622F, -4.5772F, 0.5121F, 0.1714F, 0.0088F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(89, 34).addBox(-0.6287F, -0.5202F, -1.6092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5247F, 4.6001F, -10.1663F, 0.1939F, 0.4434F, 0.0608F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(108, 82).addBox(-0.5787F, -1.176F, -0.8178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5247F, 4.6001F, -10.1663F, 0.2637F, 0.4434F, 0.0608F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(45, 109).addBox(-0.2084F, -1.413F, -3.119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3901F, 4.3751F, -7.0097F, 0.197F, 0.0657F, 0.0176F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(57, 104).addBox(-0.1084F, -1.5087F, -2.2953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3901F, 4.3751F, -7.0097F, 0.2843F, 0.0657F, 0.0176F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(81, 108).addBox(-0.108F, -1.4351F, -1.4935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3901F, 4.3751F, -7.0097F, 0.3017F, 0.0666F, 0.0087F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(76, 108).addBox(-0.108F, -1.4274F, -0.686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3901F, 4.3751F, -7.0097F, 0.3322F, 0.0666F, 0.0087F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(40, 108).addBox(-0.376F, -1.1444F, -0.485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6908F, 3.8909F, -6.5778F, 0.4248F, 0.1714F, 0.0088F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(82, 14).addBox(-0.8204F, -0.8584F, -2.7722F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3739F, 2.6372F, -4.7022F, 0.5121F, 0.1714F, 0.0088F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(110, 79).addBox(-0.5F, -0.4228F, -0.1352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7824F, 1.563F, -6.282F, -2.0184F, 0.1996F, 0.0162F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(110, 76).addBox(-0.9145F, -1.2095F, -1.7573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.092F, 3.3868F, -8.2051F, -1.1609F, 0.2214F, -0.0835F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(110, 66).addBox(-0.4901F, 0.0409F, -0.7151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.1608F, 0.7523F, -4.5669F, 0.3969F, 0.2003F, 0.054F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(113, 91).addBox(-0.3587F, -2.1028F, -4.4058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.4364F, 1.7259F, -1.1065F, 0.3871F, 0.4129F, 0.1169F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(5, 99).addBox(-0.5384F, 0.1471F, -0.7755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8953F, 1.2457F, -5.9428F, 0.3727F, 0.1996F, 0.0162F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(65, 110).addBox(-0.5807F, -0.7844F, 0.1162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.8953F, 1.2457F, -5.9428F, -0.36F, 0.2563F, 0.0642F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(110, 63).addBox(-0.4901F, -0.4381F, -0.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1608F, 0.7523F, -4.5669F, -0.0831F, 0.2003F, 0.054F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(109, 71).addBox(-0.4901F, -1.0446F, -0.2869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.1608F, 0.7523F, -4.5669F, 0.4842F, 0.2003F, 0.054F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(113, 94).addBox(-0.5807F, -0.5851F, 0.3698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.8953F, 1.2457F, -5.9428F, 0.6872F, 0.2563F, 0.0642F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(109, 57).addBox(-0.5F, -0.5841F, -0.1368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.7824F, 1.563F, -6.282F, 0.6869F, 0.1996F, 0.0162F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.099F, 0.9282F, -0.4031F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(12, 107).mirror().addBox(-2.107F, -2.4269F, -2.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -4.7147F, 0.0363F, -1.2216F, -1.1737F, -2.4784F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(83, 100).mirror().addBox(0.0F, 0.0F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6319F, 1.5861F, -9.5737F, -0.9697F, -0.2558F, -0.1883F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(0.45F, -2.975F, -0.525F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(22, 74).mirror().addBox(0.0F, -2.975F, -0.525F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.1857F, 0.6975F, -6.7183F, -1.0887F, -0.1545F, -0.1185F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(113, 35).mirror().addBox(-0.45F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9147F, 2.2895F, -9.8188F, 0.6041F, 0.8271F, -0.7801F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(115, 61).mirror().addBox(-0.025F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(60, 115).mirror().addBox(-0.525F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1425F, 2.7843F, -10.2571F, 0.6134F, -0.8618F, -1.7258F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(109, 49).mirror().addBox(-0.722F, -0.2281F, -0.3116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2198F, 2.9719F, -11.011F, 0.4695F, -0.3066F, -1.3808F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(115, 64).mirror().addBox(-0.3281F, -0.235F, -0.3115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2198F, 2.9719F, -11.011F, 0.6004F, -0.7628F, -1.7238F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(113, 32).mirror().addBox(0.0068F, 0.0042F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7296F, 3.6814F, -10.3955F, 0.416F, -0.0802F, -1.2675F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(76, 112).mirror().addBox(-0.0432F, -0.9208F, -0.9925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.874F, 4.5872F, -9.9272F, 0.0393F, -0.3914F, 0.0057F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(50, 113).mirror().addBox(-0.275F, -0.175F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0669F, 3.5828F, -11.5855F, 0.5186F, -0.2149F, -1.3782F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(45, 113).mirror().addBox(0.175F, -0.175F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0669F, 3.5828F, -11.5855F, 0.5559F, -0.4396F, -1.5205F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(113, 38).mirror().addBox(-0.225F, -0.175F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.0669F, 3.5828F, -11.5855F, 0.5647F, -0.4396F, -1.5205F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(60, 112).mirror().addBox(-0.2182F, -0.7408F, -1.9528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.874F, 4.5872F, -9.9272F, -0.1464F, -0.5638F, 0.0167F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(113, 105).mirror().addBox(0.0F, 0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8049F, 2.6408F, -9.6355F, 0.1859F, 0.01F, -1.0483F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(30, 113).mirror().addBox(0.0F, 0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9991F, 3.6193F, -9.5659F, 0.1727F, 0.0697F, -1.3749F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(55, 112).mirror().addBox(0.0257F, -1.0363F, -1.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0739F, 4.5872F, -8.9272F, 0.1138F, -0.1481F, -0.0242F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(94, 31).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.092F, 3.3868F, -8.2051F, 0.1439F, -0.091F, 0.1768F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(100, 8).mirror().addBox(0.0052F, -0.9576F, -2.0386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.174F, 4.0872F, -7.0022F, 0.2025F, -0.0601F, 0.0013F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(74, 28).mirror().addBox(0.0205F, -1.9759F, -0.7832F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2187F, 2.8828F, -6.8309F, 0.4472F, -0.2416F, 0.1378F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(100, 4).mirror().addBox(-0.5001F, -0.4443F, -1.3641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9072F, -0.1874F, -0.0463F, -0.9545F, 0.036F, 0.012F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(112, 52).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9048F, -1.7645F, -0.5012F, -0.4309F, 0.036F, 0.012F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(9, 88).mirror().addBox(-0.5001F, 0.0306F, -2.2636F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.9072F, -0.1874F, -0.0463F, -1.3036F, 0.036F, 0.012F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.5F, -0.6F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8032F, 0.8415F, 0.8249F, -1.0856F, 0.0378F, 0.0022F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(103, 36).mirror().addBox(-0.5F, -3.025F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.8814F, -2.047F, 0.3106F, -0.0058F, 0.002F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(0.0052F, -3.1658F, -1.9487F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, 0.3144F, -0.2413F, -0.0773F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(40, 112).mirror().addBox(0.0052F, -0.6726F, -0.992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, -0.2092F, -0.2413F, -0.0773F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(20, 112).mirror().addBox(-0.3266F, -3.2499F, -1.6811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(112, 15).mirror().addBox(-0.1516F, -3.2499F, -1.6811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, 0.2226F, -0.2466F, -0.0875F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(112, 12).mirror().addBox(-0.0016F, -2.6353F, -0.2192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, 0.8334F, -0.2466F, -0.0875F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(111, 111).mirror().addBox(-0.0016F, -1.2972F, -2.5551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, -0.301F, -0.2466F, -0.0875F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(111, 108).mirror().addBox(-0.0016F, -2.7032F, -1.898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(111, 99).mirror().addBox(-0.0016F, -3.5993F, -1.4189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, 0.3098F, -0.2466F, -0.0875F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(111, 102).mirror().addBox(-0.0016F, -2.4107F, -3.0096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, -0.2138F, -0.2466F, -0.0875F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(113, 82).mirror().addBox(-0.0016F, 0.5897F, -2.7059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, -1.5228F, -0.2466F, -0.0875F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(65, 113).mirror().addBox(-0.0016F, -1.5903F, -3.2577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, -0.6937F, -0.2466F, -0.0875F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(84, 8).mirror().addBox(-0.0465F, -0.5404F, -2.9574F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8934F, 0.6897F, -3.2474F, 0.2739F, -0.2627F, -0.0591F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(102, 54).mirror().addBox(-1.0F, -0.725F, -1.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3515F, 0.7745F, -0.1449F, 0.7133F, 0.0362F, 0.004F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(100, 80).mirror().addBox(-1.0F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8515F, 0.7745F, -0.1449F, 0.4515F, 0.0362F, 0.004F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-1.0F, -0.75F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3392F, -1.2839F, -0.031F, -1.1193F, 0.0362F, 0.004F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(102, 71).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3392F, -1.2839F, -0.031F, -0.2903F, 0.0362F, 0.004F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(67, 89).mirror().addBox(-1.0F, -1.4F, -1.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3293F, -0.4377F, 0.3348F, 0.1897F, 0.0362F, 0.004F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-1.5F, -0.1F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8561F, -2.9421F, -0.525F, 1.1488F, 0.0374F, -0.0107F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(66, 95).mirror().addBox(0.1195F, -1.8278F, 2.0893F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, 1.9598F, -0.2142F, -0.0969F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(94, 26).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3597F, -2.8807F, -0.6088F, 1.9514F, 0.0212F, -0.0172F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(93, 81).mirror().addBox(-0.0481F, -1.8643F, 0.1547F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8934F, 0.6897F, -3.2474F, 2.0559F, -0.2674F, -0.118F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(9, 111).mirror().addBox(-0.4419F, 0.3247F, 0.4583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2946F, -0.7566F, -5.1168F, 0.9863F, -0.0694F, -0.398F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(110, 88).mirror().addBox(-0.4419F, -0.0835F, 0.4911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2946F, -0.7566F, -5.1168F, 0.7158F, -0.0694F, -0.398F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(99, 20).mirror().addBox(-0.3335F, -0.0566F, -1.401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2946F, -0.7566F, -5.1168F, 0.7689F, -0.166F, -0.5033F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(73, 83).mirror().addBox(-0.2478F, -0.6244F, -2.7114F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3215F, -0.202F, -4.9558F, 0.5439F, -0.126F, -0.1959F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(-0.3036F, -0.2516F, -0.5578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 108).mirror().addBox(-0.3036F, -1.1516F, -1.3578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 108).mirror().addBox(-0.3036F, -1.0516F, -2.1578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3739F, 2.5622F, -4.5772F, 0.5121F, -0.1714F, -0.0088F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(89, 34).mirror().addBox(-0.3713F, -0.5202F, -1.6092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5247F, 4.6001F, -10.1663F, 0.1939F, -0.4434F, -0.0608F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(108, 82).mirror().addBox(-0.4213F, -1.176F, -0.8178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5247F, 4.6001F, -10.1663F, 0.2637F, -0.4434F, -0.0608F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(45, 109).mirror().addBox(-0.7916F, -1.413F, -3.119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3901F, 4.3751F, -7.0097F, 0.197F, -0.0657F, -0.0176F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(57, 104).mirror().addBox(-0.8916F, -1.5087F, -2.2953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3901F, 4.3751F, -7.0097F, 0.2843F, -0.0657F, -0.0176F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(81, 108).mirror().addBox(-0.892F, -1.4351F, -1.4935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3901F, 4.3751F, -7.0097F, 0.3017F, -0.0666F, -0.0087F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(76, 108).mirror().addBox(-0.892F, -1.4274F, -0.686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3901F, 4.3751F, -7.0097F, 0.3322F, -0.0666F, -0.0087F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(40, 108).mirror().addBox(-0.624F, -1.1444F, -0.485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6908F, 3.8909F, -6.5778F, 0.4248F, -0.1714F, -0.0088F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(82, 14).mirror().addBox(-0.1796F, -0.8584F, -2.7722F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3739F, 2.6372F, -4.7022F, 0.5121F, -0.1714F, -0.0088F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(110, 79).mirror().addBox(-0.5F, -0.4228F, -0.1352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7824F, 1.563F, -6.282F, -2.0184F, -0.1996F, -0.0162F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(110, 76).mirror().addBox(-0.0855F, -1.2095F, -1.7573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.092F, 3.3868F, -8.2051F, -1.1609F, -0.2214F, 0.0835F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(110, 66).mirror().addBox(-0.5099F, 0.0409F, -0.7151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.1608F, 0.7523F, -4.5669F, 0.3969F, -0.2003F, -0.054F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(113, 91).mirror().addBox(-0.6413F, -2.1028F, -4.4058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.4364F, 1.7259F, -1.1065F, 0.3871F, -0.4129F, -0.1169F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(-0.4616F, 0.1471F, -0.7755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8953F, 1.2457F, -5.9428F, 0.3727F, -0.1996F, -0.0162F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(65, 110).mirror().addBox(-0.4193F, -0.7844F, 0.1162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8953F, 1.2457F, -5.9428F, -0.36F, -0.2563F, -0.0642F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(110, 63).mirror().addBox(-0.5099F, -0.4381F, -0.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1608F, 0.7523F, -4.5669F, -0.0831F, -0.2003F, -0.054F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(109, 71).mirror().addBox(-0.5099F, -1.0446F, -0.2869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.1608F, 0.7523F, -4.5669F, 0.4842F, -0.2003F, -0.054F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(113, 94).mirror().addBox(-0.4193F, -0.5851F, 0.3698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.8953F, 1.2457F, -5.9428F, 0.6872F, -0.2563F, -0.0642F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(109, 57).mirror().addBox(-0.5F, -0.5841F, -0.1368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.7824F, 1.563F, -6.282F, 0.6869F, -0.1996F, -0.0162F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9677F, 0.4109F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(114, 9).mirror().addBox(0.0095F, 0.4885F, -1.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(9, 114).mirror().addBox(0.0095F, 0.8385F, -1.8449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false)
				.texOffs(101, 32).mirror().addBox(0.0095F, 0.8385F, -3.7949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, -0.9217F, -5.4368F, -0.3011F, -0.096F, -0.0349F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(55, 115).mirror().addBox(-0.0284F, -0.5173F, -1.4967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 114).mirror().addBox(-0.0284F, -0.5173F, -2.2967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(114, 72).mirror().addBox(-0.0284F, -0.5173F, -3.0967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, -0.9217F, -5.4368F, -0.2662F, -0.096F, -0.0349F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(114, 69).mirror().addBox(-0.0284F, -0.3618F, -3.8837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, -0.9217F, -5.4368F, -0.3098F, -0.096F, -0.0349F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(114, 58).mirror().addBox(0.0039F, -1.4158F, -1.0229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(114, 55).mirror().addBox(0.0039F, -1.3658F, -1.8229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2398F, -1.0217F, -9.2368F, -0.3073F, -0.1658F, -0.0352F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(114, 47).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5061F, -2.5054F, -10.8785F, -0.3771F, -0.1658F, -0.0352F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(114, 44).mirror().addBox(0.0039F, -1.033F, -3.5067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(17, 115).mirror().addBox(0.0718F, -0.6212F, -3.5736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(114, 41).mirror().addBox(0.0718F, -0.5212F, -2.8736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2398F, -1.0217F, -9.2368F, -0.447F, -0.1658F, -0.0352F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(40, 115).mirror().addBox(-0.5F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.2785F, -2.4942F, -11.8244F, -0.8833F, -0.1658F, -0.0352F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(101, 96).mirror().addBox(0.0718F, -0.7348F, -2.0025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.2398F, -1.0217F, -9.2368F, -0.3422F, -0.1658F, -0.0352F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(35, 114).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3216F, -1.1661F, -11.287F, -0.8658F, -0.1658F, -0.0352F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(101, 92).mirror().addBox(0.0718F, -0.1964F, -2.0235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2398F, -1.0217F, -9.2368F, -0.4295F, -0.1658F, -0.0352F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(114, 6).mirror().addBox(0.0095F, 0.9444F, -1.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, -0.9217F, -5.4368F, -0.3883F, -0.096F, -0.0349F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(108, 95).mirror().addBox(0.0426F, 0.8856F, -1.6737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.9398F, -0.9217F, -3.6368F, -0.5192F, -0.2007F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(0.0426F, 0.7248F, -1.1646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.9398F, -0.9217F, -3.6368F, -0.3447F, -0.2007F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(91, 108).mirror().addBox(0.0426F, 0.6246F, -0.7504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.9398F, -0.9217F, -3.6368F, -0.1265F, -0.2007F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(25, 42).mirror().addBox(-0.2555F, 1.3551F, -1.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(86, 108).mirror().addBox(0.0195F, 0.5801F, -1.2085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.9217F, -2.6368F, 0.048F, -0.1222F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(107, 16).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(114, 3).mirror().addBox(-0.5F, -1.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(114, 3).addBox(2.5407F, -1.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(107, 16).addBox(2.5407F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.5204F, 1.5479F, -1.7282F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(107, 12).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9278F, -3.7043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(17, 95).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9278F, -3.7043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(101, 112).mirror().addBox(-0.4805F, -4.1477F, 3.3736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(101, 112).addBox(2.5602F, -4.1477F, 3.3736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.5398F, 0.9155F, -5.0567F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(90, 100).mirror().addBox(-0.5F, -0.575F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(90, 100).addBox(2.5407F, -0.575F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.5204F, 0.3246F, -0.1135F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(100, 46).mirror().addBox(-0.4805F, -0.5972F, 3.9774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(100, 46).addBox(2.5602F, -0.5972F, 3.9774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.5398F, 0.9155F, -5.0567F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(101, 28).mirror().addBox(0.0095F, -0.1014F, -3.8819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, -0.9217F, -5.4368F, -0.2007F, -0.096F, -0.0349F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(0.0095F, -0.4452F, -1.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, -0.9217F, -5.4368F, -0.0262F, -0.096F, -0.0349F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(97, 100).mirror().addBox(0.0426F, -0.2653F, -1.9304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.9398F, -0.9217F, -3.6368F, -0.096F, -0.2007F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(114, 114).mirror().addBox(0.0195F, -0.0958F, -0.9578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.9217F, -2.6368F, -0.1833F, -0.1222F, 0.0F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-0.4805F, -0.0495F, -1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(114, 0).addBox(2.5602F, -0.0495F, -1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5398F, -0.7754F, -1.5936F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(100, 42).mirror().addBox(-0.4805F, -2.7995F, 2.6399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(100, 42).addBox(2.5602F, -2.7995F, 2.6399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.5398F, 0.9155F, -5.0567F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(114, 9).addBox(-1.0095F, 0.4885F, -1.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(9, 114).addBox(-1.0095F, 0.8385F, -1.8449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F))
				.texOffs(101, 32).addBox(-1.0095F, 0.8385F, -3.7949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.5398F, -0.9217F, -5.4368F, -0.3011F, 0.096F, 0.0349F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(55, 115).addBox(-0.9716F, -0.5173F, -1.4967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 114).addBox(-0.9716F, -0.5173F, -2.2967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(114, 72).addBox(-0.9716F, -0.5173F, -3.0967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5398F, -0.9217F, -5.4368F, -0.2662F, 0.096F, 0.0349F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(114, 69).addBox(-0.9716F, -0.3618F, -3.8837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5398F, -0.9217F, -5.4368F, -0.3098F, 0.096F, 0.0349F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(114, 58).addBox(-1.0039F, -1.4158F, -1.0229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(114, 55).addBox(-1.0039F, -1.3658F, -1.8229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2398F, -1.0217F, -9.2368F, -0.3073F, 0.1658F, 0.0352F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(114, 47).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5061F, -2.5054F, -10.8785F, -0.3771F, 0.1658F, 0.0352F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(114, 44).addBox(-1.0039F, -1.033F, -3.5067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 115).addBox(-1.0718F, -0.6212F, -3.5736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(114, 41).addBox(-1.0718F, -0.5212F, -2.8736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.2398F, -1.0217F, -9.2368F, -0.447F, 0.1658F, 0.0352F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(40, 115).addBox(-0.5F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2785F, -2.4942F, -11.8244F, -0.8833F, 0.1658F, 0.0352F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(101, 96).addBox(-1.0718F, -0.7348F, -2.0025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.2398F, -1.0217F, -9.2368F, -0.3422F, 0.1658F, 0.0352F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(35, 114).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3216F, -1.1661F, -11.287F, -0.8658F, 0.1658F, 0.0352F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(101, 92).addBox(-1.0718F, -0.1964F, -2.0235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.2398F, -1.0217F, -9.2368F, -0.4295F, 0.1658F, 0.0352F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(114, 6).addBox(-1.0095F, 0.9444F, -1.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.5398F, -0.9217F, -5.4368F, -0.3883F, 0.096F, 0.0349F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(108, 95).addBox(-1.0426F, 0.8856F, -1.6737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.9398F, -0.9217F, -3.6368F, -0.5192F, 0.2007F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(108, 91).addBox(-1.0426F, 0.7248F, -1.1646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.9398F, -0.9217F, -3.6368F, -0.3447F, 0.2007F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(91, 108).addBox(-1.0426F, 0.6246F, -0.7504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.9398F, -0.9217F, -3.6368F, -0.1265F, 0.2007F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(25, 42).addBox(-0.7445F, 1.3551F, -1.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(86, 108).addBox(-1.0195F, 0.5801F, -1.2085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.0398F, -0.9217F, -2.6368F, 0.048F, 0.1222F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(107, 12).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9278F, -3.7043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(17, 95).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9278F, -3.7043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(101, 28).addBox(-1.0095F, -0.1014F, -3.8819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5398F, -0.9217F, -5.4368F, -0.2007F, 0.096F, 0.0349F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(101, 24).addBox(-1.0095F, -0.4452F, -1.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.5398F, -0.9217F, -5.4368F, -0.0262F, 0.096F, 0.0349F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(97, 100).addBox(-1.0426F, -0.2653F, -1.9304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9398F, -0.9217F, -3.6368F, -0.096F, 0.2007F, 0.0F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(114, 114).addBox(-1.0195F, -0.0958F, -0.9578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0398F, -0.9217F, -2.6368F, -0.1833F, 0.1222F, 0.0F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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