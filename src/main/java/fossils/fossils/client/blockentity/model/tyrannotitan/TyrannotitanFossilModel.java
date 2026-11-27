package fossils.fossils.client.blockentity.model.tyrannotitan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TyrannotitanFossilModel extends SkullModelBase {
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

	public TyrannotitanFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -35.7896F, 0.6285F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 119).addBox(-0.006F, -7.0F, -0.3F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8009F, 8.7506F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 0).addBox(-0.006F, -5.5F, 1.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.006F, -0.8531F, 3.6873F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 48).addBox(-0.006F, -6.5F, -3.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7052F, 0.8108F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2418F, 2.5355F, 3.3177F, -0.1745F, 0.0F, 0.1309F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3668F, -6.7514F, -3.6478F, -0.0038F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 63).addBox(-0.5827F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6795F, -9.3082F, 5.4213F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(89, 49).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4738F, -8.9996F, 0.7077F, -0.0823F, -0.0321F, -0.4016F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 13).addBox(-0.7F, -2.0F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0322F, -5.5023F, 3.9963F, 0.4217F, -0.0686F, -0.3307F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(121, 34).addBox(-0.5F, -1.55F, -2.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4313F, -4.3378F, 5.2052F, -1.4766F, -0.0327F, -0.4104F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(145, 28).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.144F, -5.4498F, 6.874F, 2.2104F, -0.0391F, -0.4053F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(128, 95).addBox(-0.5F, -1.1F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.911F, -7.0927F, 8.3309F, 1.1196F, -0.0391F, -0.4053F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(127, 44).addBox(-0.5F, -0.1F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2538F, -8.0617F, 6.6152F, 1.1196F, -0.0391F, -0.4053F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(110, 90).addBox(-0.5F, -0.125F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2797F, -8.3228F, 4.5926F, -0.2767F, -0.0391F, -0.4053F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(120, 50).addBox(-0.6999F, -0.7022F, -0.3939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4182F, 8.9144F, 10.7932F, -0.7798F, -0.0068F, -0.1155F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(126, 50).addBox(-1.1581F, 3.4843F, 0.0361F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 3.6667F, 5.8561F, 0.5728F, -0.0068F, -0.1155F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(133, 39).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1623F, 8.4083F, 10.7085F, 1.0091F, -0.0094F, -0.1134F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 98).addBox(-1.2253F, -0.2179F, -0.8278F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 1.0667F, 3.3561F, 0.791F, -0.0094F, -0.1134F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(134, 110).addBox(-1.6492F, -5.1094F, -1.2359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 1.0611F, -0.0597F, 0.1639F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(85, 141).addBox(-1.6492F, -5.227F, 0.0616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 1.3229F, -0.0597F, 0.1639F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(126, 89).addBox(-1.6492F, -7.714F, -0.0681F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 1.1483F, -0.0597F, 0.1639F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(136, 84).addBox(-1.3476F, -6.5347F, -4.632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 0.0441F, -0.0624F, 0.0919F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(125, 59).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0233F, -1.0042F, 1.7237F, -0.2222F, -0.0654F, 0.1618F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(136, 76).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0233F, -1.0042F, 1.7237F, 0.1705F, -0.0654F, 0.1618F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(126, 70).addBox(-1.6985F, -6.8976F, -1.7203F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 2.9667F, 5.9561F, 0.6505F, -0.0654F, 0.1618F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(126, 16).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2347F, -3.816F, 1.239F, 1.1165F, 0.0639F, 0.0248F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 107).addBox(-0.5F, -1.6F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2212F, -2.6954F, 1.4626F, 0.6366F, 0.0639F, 0.0248F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, -1.95F, -2.05F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0177F, -0.9237F, -2.4993F, -1.3182F, 0.0639F, 0.0248F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(126, 83).addBox(-1.5896F, -0.8157F, 7.7925F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(120, 117).addBox(-1.5896F, -2.6157F, 7.2925F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -1.3884F, 0.0696F, -0.1649F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(81, 132).addBox(-1.5896F, 6.0978F, 3.007F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -0.6903F, 0.0696F, -0.1649F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(15, 48).addBox(-1.6411F, 3.3768F, 6.4335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -1.1266F, 0.0696F, -0.1649F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(120, 144).addBox(-1.6411F, 4.043F, 8.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -1.432F, 0.0696F, -0.1649F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(141, 83).addBox(-1.6411F, 2.3463F, 9.0634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -1.6066F, 0.0696F, -0.1649F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(97, 141).addBox(-1.6797F, 2.7266F, 8.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -1.4665F, 0.0639F, -0.1672F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(128, 35).addBox(-1.6797F, -8.5549F, 0.7072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -2.601F, 0.0639F, -0.1672F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(112, 34).addBox(-1.6797F, -8.938F, 0.7914F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -2.8192F, 0.0639F, -0.1672F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(145, 103).addBox(-1.6797F, 2.5924F, 8.3565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -1.3793F, 0.0639F, -0.1672F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(133, 99).addBox(-1.5896F, 4.2589F, 1.7375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -0.4983F, 0.0696F, -0.1649F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(99, 132).addBox(-1.5896F, 5.4892F, 0.5057F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, -0.2103F, 0.0696F, -0.1649F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(123, 65).addBox(-1.5581F, 3.9379F, -6.8711F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2869F, 5.4819F, -4.5141F, 0.9229F, 0.0905F, -0.1545F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(36, 122).addBox(-0.7482F, -3.6494F, 0.0295F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2869F, 10.9819F, -5.3141F, -0.1421F, 0.0984F, -0.1496F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(99, 125).addBox(-0.4105F, -4.704F, -0.7328F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2869F, 12.3819F, -3.9141F, -0.0201F, 0.1036F, -0.1461F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(94, 130).addBox(-1.0983F, 1.1596F, 1.5912F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2869F, -1.3181F, -5.6141F, -0.1666F, 0.0673F, 0.0127F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 110).addBox(-1.2414F, -11.372F, -0.9504F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.2869F, 12.3819F, -3.9141F, -0.0614F, 0.0607F, 0.0319F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(117, 78).addBox(-1.0983F, -0.0534F, -0.2941F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2869F, -1.3181F, -5.6141F, 0.1388F, 0.0673F, 0.0127F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(33, 87).addBox(-1.2972F, -8.8112F, 0.7572F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2869F, 10.9819F, -5.3141F, 0.0957F, 0.0617F, 0.0297F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(17, 116).addBox(-1.0644F, -7.7146F, 2.6018F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2524F, 5.2239F, -5.9479F, 0.1827F, 0.0647F, 0.0226F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(15, 123).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0545F, -3.9386F, -2.8245F, 0.0257F, 0.0639F, 0.0248F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(21, 38).addBox(-0.5F, -1.15F, 0.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0059F, -4.6424F, -4.0425F, -0.6288F, 0.0639F, 0.0248F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(48, 83).addBox(-0.3844F, -0.3139F, -1.6767F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0524F, -5.1544F, -1.5189F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(121, 95).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.7046F, -6.1417F, -6.2915F, 1.5097F, -0.3289F, -0.3595F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(89, 132).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5217F, -5.3171F, -4.9401F, 2.1118F, -0.3289F, -0.3595F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(141, 80).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5217F, -5.3171F, -4.9401F, 0.9774F, -0.3289F, -0.3595F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(133, 22).addBox(-0.5F, 0.5F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.14F, -6.0973F, -7.4399F, 2.1118F, -0.3289F, -0.3595F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(29, 122).addBox(-0.5F, -1.225F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3771F, -7.6907F, -4.9214F, 1.0385F, -0.3289F, -0.3595F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(80, 137).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1F, -9.6257F, -4.9331F, 0.8465F, -0.3289F, -0.3595F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(106, 107).addBox(0.0F, -2.1F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0305F, -9.2855F, -2.1144F, 1.4973F, -0.1207F, -0.3698F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(46, 134).addBox(0.1F, -0.075F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.284F, -9.5695F, -3.2537F, 0.2343F, -0.3037F, -0.3808F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(88, 100).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4292F, -8.8839F, 0.839F, -0.1871F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2418F, 2.5355F, 3.3177F, -0.1745F, 0.0F, -0.1309F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3668F, -6.7514F, -3.6478F, -0.0038F, 0.0321F, 0.4016F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(36, 63).mirror().addBox(-0.4173F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -9.3082F, 5.4213F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(89, 49).mirror().addBox(-0.5F, 0.1F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4738F, -8.9996F, 0.7077F, -0.0823F, 0.0321F, 0.4016F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(90, 13).mirror().addBox(-0.3F, -2.0F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0322F, -5.5023F, 3.9963F, 0.4217F, 0.0686F, 0.3307F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(121, 34).mirror().addBox(-0.5F, -1.55F, -2.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4313F, -4.3378F, 5.2052F, -1.4766F, 0.0327F, 0.4104F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(145, 28).mirror().addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.144F, -5.4498F, 6.874F, 2.2104F, 0.0391F, 0.4053F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(128, 95).mirror().addBox(-0.5F, -1.1F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.911F, -7.0927F, 8.3309F, 1.1196F, 0.0391F, 0.4053F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(127, 44).mirror().addBox(-0.5F, -0.1F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2538F, -8.0617F, 6.6152F, 1.1196F, 0.0391F, 0.4053F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(110, 90).mirror().addBox(-0.5F, -0.125F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2797F, -8.3228F, 4.5926F, -0.2767F, 0.0391F, 0.4053F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(120, 50).mirror().addBox(-0.3001F, -0.7022F, -0.3939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4182F, 8.9144F, 10.7932F, -0.7798F, 0.0068F, 0.1155F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(126, 50).mirror().addBox(0.1581F, 3.4843F, 0.0361F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 3.6667F, 5.8561F, 0.5728F, 0.0068F, 0.1155F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(133, 39).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1623F, 8.4083F, 10.7085F, 1.0091F, 0.0094F, 0.1134F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(0.2253F, -0.2179F, -0.8278F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 1.0667F, 3.3561F, 0.791F, 0.0094F, 0.1134F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(134, 110).mirror().addBox(0.6492F, -5.1094F, -1.2359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 2.9667F, 5.9561F, 1.0611F, 0.0597F, -0.1639F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(85, 141).mirror().addBox(0.6492F, -5.227F, 0.0616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 2.9667F, 5.9561F, 1.3229F, 0.0597F, -0.1639F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(126, 89).mirror().addBox(0.6492F, -7.714F, -0.0681F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 2.9667F, 5.9561F, 1.1483F, 0.0597F, -0.1639F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(136, 84).mirror().addBox(0.3476F, -6.5347F, -4.632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 2.9667F, 5.9561F, 0.0441F, 0.0624F, -0.0919F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(125, 59).mirror().addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0233F, -1.0042F, 1.7237F, -0.2222F, 0.0654F, -0.1618F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(136, 76).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0233F, -1.0042F, 1.7237F, 0.1705F, 0.0654F, -0.1618F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(126, 70).mirror().addBox(0.6985F, -6.8976F, -1.7203F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 2.9667F, 5.9561F, 0.6505F, 0.0654F, -0.1618F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(126, 16).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2347F, -3.816F, 1.239F, 1.1165F, -0.0639F, -0.0248F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(53, 107).mirror().addBox(-0.5F, -1.6F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2212F, -2.6954F, 1.4626F, 0.6366F, -0.0639F, -0.0248F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.5F, -1.95F, -2.05F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0177F, -0.9237F, -2.4993F, -1.3182F, -0.0639F, -0.0248F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(126, 83).mirror().addBox(0.5896F, -0.8157F, 7.7925F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(120, 117).mirror().addBox(0.5896F, -2.6157F, 7.2925F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -1.3884F, -0.0696F, 0.1649F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(81, 132).mirror().addBox(0.5896F, 6.0978F, 3.007F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -0.6903F, -0.0696F, 0.1649F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(0.6411F, 3.3768F, 6.4335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -1.1266F, -0.0696F, 0.1649F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(120, 144).mirror().addBox(0.6411F, 4.043F, 8.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -1.432F, -0.0696F, 0.1649F));

		PartDefinition cube_r86 = bone5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(141, 83).mirror().addBox(0.6411F, 2.3463F, 9.0634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -1.6066F, -0.0696F, 0.1649F));

		PartDefinition cube_r87 = bone5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(97, 141).mirror().addBox(0.6797F, 2.7266F, 8.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -1.4665F, -0.0639F, 0.1672F));

		PartDefinition cube_r88 = bone5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(128, 35).mirror().addBox(0.6797F, -8.5549F, 0.7072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -2.601F, -0.0639F, 0.1672F));

		PartDefinition cube_r89 = bone5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(112, 34).mirror().addBox(0.6797F, -8.938F, 0.7914F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -2.8192F, -0.0639F, 0.1672F));

		PartDefinition cube_r90 = bone5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(145, 103).mirror().addBox(0.6797F, 2.5924F, 8.3565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -1.3793F, -0.0639F, 0.1672F));

		PartDefinition cube_r91 = bone5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(133, 99).mirror().addBox(0.5896F, 4.2589F, 1.7375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -0.4983F, -0.0696F, 0.1649F));

		PartDefinition cube_r92 = bone5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 132).mirror().addBox(0.5896F, 5.4892F, 0.5057F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, -0.2103F, -0.0696F, 0.1649F));

		PartDefinition cube_r93 = bone5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(123, 65).mirror().addBox(0.5581F, 3.9379F, -6.8711F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 5.4819F, -4.5141F, 0.9229F, -0.0905F, 0.1545F));

		PartDefinition cube_r94 = bone5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(36, 122).mirror().addBox(-0.2518F, -3.6494F, 0.0295F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 10.9819F, -5.3141F, -0.1421F, -0.0984F, 0.1496F));

		PartDefinition cube_r95 = bone5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(99, 125).mirror().addBox(-0.5895F, -4.704F, -0.7328F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 12.3819F, -3.9141F, -0.0201F, -0.1036F, 0.1461F));

		PartDefinition cube_r96 = bone5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(94, 130).mirror().addBox(0.0983F, 1.1596F, 1.5912F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, -1.3181F, -5.6141F, -0.1666F, -0.0673F, -0.0127F));

		PartDefinition cube_r97 = bone5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(0.2414F, -11.372F, -0.9504F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 12.3819F, -3.9141F, -0.0614F, -0.0607F, -0.0319F));

		PartDefinition cube_r98 = bone5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(117, 78).mirror().addBox(0.0983F, -0.0534F, -0.2941F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, -1.3181F, -5.6141F, 0.1388F, -0.0673F, -0.0127F));

		PartDefinition cube_r99 = bone5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(33, 87).mirror().addBox(0.2972F, -8.8112F, 0.7572F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 10.9819F, -5.3141F, 0.0957F, -0.0617F, -0.0297F));

		PartDefinition cube_r100 = bone5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(17, 116).mirror().addBox(0.0644F, -7.7146F, 2.6018F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2524F, 5.2239F, -5.9479F, 0.1827F, -0.0647F, -0.0226F));

		PartDefinition cube_r101 = bone5.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(15, 123).mirror().addBox(-0.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0545F, -3.9386F, -2.8245F, 0.0257F, -0.0639F, -0.0248F));

		PartDefinition cube_r102 = bone5.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(21, 38).mirror().addBox(-0.5F, -1.15F, 0.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0059F, -4.6424F, -4.0425F, -0.6288F, -0.0639F, -0.0248F));

		PartDefinition cube_r103 = bone5.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(48, 83).mirror().addBox(-0.6156F, -0.3139F, -1.6767F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0524F, -5.1544F, -1.5189F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r104 = bone5.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(121, 95).mirror().addBox(-0.5F, -0.3F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7046F, -6.1417F, -6.2915F, 1.5097F, 0.3289F, 0.3595F));

		PartDefinition cube_r105 = bone5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(89, 132).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5217F, -5.3171F, -4.9401F, 2.1118F, 0.3289F, 0.3595F));

		PartDefinition cube_r106 = bone5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(141, 80).mirror().addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5217F, -5.3171F, -4.9401F, 0.9774F, 0.3289F, 0.3595F));

		PartDefinition cube_r107 = bone5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(133, 22).mirror().addBox(-0.5F, 0.5F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.14F, -6.0973F, -7.4399F, 2.1118F, 0.3289F, 0.3595F));

		PartDefinition cube_r108 = bone5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(29, 122).mirror().addBox(-0.5F, -1.225F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.3771F, -7.6907F, -4.9214F, 1.0385F, 0.3289F, 0.3595F));

		PartDefinition cube_r109 = bone5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(80, 137).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1F, -9.6257F, -4.9331F, 0.8465F, 0.3289F, 0.3595F));

		PartDefinition cube_r110 = bone5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(106, 107).mirror().addBox(-1.0F, -2.1F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.0305F, -9.2855F, -2.1144F, 1.4973F, 0.1207F, 0.3698F));

		PartDefinition cube_r111 = bone5.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(46, 134).mirror().addBox(-1.1F, -0.075F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.284F, -9.5695F, -3.2537F, 0.2343F, 0.3037F, 0.3808F));

		PartDefinition cube_r112 = bone5.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(88, 100).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4292F, -8.8839F, 0.839F, -0.1871F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.1272F, 3.0792F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(98, 74).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 14.3131F, -1.8377F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(117, 85).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, 15.2267F, -2.2445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(117, 24).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 15.7779F, -4.167F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(97, 0).addBox(-5.1F, -2.0807F, -2.518F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 13.7054F, -2.3045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(53, 119).addBox(-5.1F, -2.532F, 0.2317F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 12.2777F, -3.7694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(110, 28).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 11.0305F, -4.6621F, 2.9758F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(128, 10).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 10.0624F, -4.4117F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(13, 81).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 2.5212F, -1.7413F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(60, 140).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.6355F, -0.552F, -3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(135, 94).addBox(-0.5F, -0.5365F, -0.2292F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 4.6355F, -0.552F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(69, 111).addBox(-5.1F, -2.0863F, -1.9195F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(22, 87).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1302F, 0.171F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(86, 42).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 2.0207F, -2.3915F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(53, 114).addBox(-1.0F, 0.7F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 1.0127F, -1.0785F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 16.3939F, -3.066F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(81, 119).addBox(-1.1F, 1.5764F, -0.6545F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(126, 21).addBox(-1.1F, -0.8465F, -1.0797F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(73, 94).addBox(-1.0F, 0.1F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 1.1606F, -0.8554F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(106, 23).addBox(-1.0F, -0.425F, -0.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(100, 61).addBox(-0.1F, -0.5F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(106, 85).addBox(-0.1F, -1.175F, -2.875F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(66, 106).addBox(-0.1F, -0.5F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(127, 110).addBox(-1.1F, 8.9387F, 1.5893F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(10, 113).addBox(-1.1F, 6.1996F, -0.2091F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(111, 59).addBox(-1.0F, -3.0F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3F, 6.6262F, -0.2001F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(125, 117).addBox(-1.1F, -1.1916F, 0.5297F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(59, 85).addBox(-1.1F, -0.8318F, 0.0813F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(109, 125).addBox(-1.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.0471F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(62, 125).addBox(-1.1F, -0.009F, -0.9593F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4F, 7.8674F, 0.2497F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(10, 120).addBox(-1.1F, -0.209F, -0.1593F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.0197F, -0.0418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(11, 93).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightLeg3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(26, 140).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r143 = rightLeg3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(131, 84).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(69, 12).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(21, 46).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.1272F, 3.0792F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftLeg1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(112, 39).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 14.3131F, -1.8377F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftLeg1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(32, 118).addBox(-0.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0F, 15.2267F, -2.2445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftLeg1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(117, 101).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 15.7779F, -4.167F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftLeg1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(98, 68).addBox(3.1F, -2.0807F, -2.518F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 13.7054F, -2.3045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftLeg1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(60, 119).addBox(3.1F, -2.532F, 0.2317F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 12.2777F, -3.7694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftLeg1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(110, 42).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 11.0305F, -4.6621F, 2.9758F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftLeg1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 128).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 10.0624F, -4.4117F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftLeg1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(39, 83).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 2.5212F, -1.7413F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftLeg1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(120, 140).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.6355F, -0.552F, -3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftLeg1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(124, 135).addBox(-0.5F, -0.5365F, -0.2292F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.6355F, -0.552F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftLeg1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(76, 111).addBox(3.1F, -2.0863F, -1.9195F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftLeg1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(87, 68).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.1302F, 0.171F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftLeg1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(87, 61).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 2.0207F, -2.3915F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftLeg1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(83, 114).addBox(-1.0F, 0.7F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.0127F, -1.0785F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 16.3939F, -3.066F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftLeg2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(119, 89).addBox(-0.9F, 1.5764F, -0.6545F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftLeg2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(126, 26).addBox(-0.9F, -0.8465F, -1.0797F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r160 = leftLeg2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(86, 94).addBox(-1.0F, 0.1F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.1606F, -0.8554F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftLeg2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(106, 54).addBox(-1.0F, -0.425F, -0.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftLeg2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(66, 100).addBox(-1.9F, -0.5F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftLeg2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(106, 102).addBox(-1.9F, -1.175F, -2.875F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftLeg2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(77, 106).addBox(-1.9F, -0.5F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftLeg2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(128, 31).addBox(-0.9F, 8.9387F, 1.5893F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftLeg2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(113, 113).addBox(-0.9F, 6.1996F, -0.2091F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftLeg2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(62, 111).addBox(-1.0F, -3.0F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3F, 6.6262F, -0.2001F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftLeg2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(126, 0).addBox(-0.9F, -1.1916F, 0.5297F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftLeg2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(66, 85).addBox(-0.9F, -0.8318F, 0.0813F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftLeg2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(125, 122).addBox(0.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.0471F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftLeg2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(81, 125).addBox(0.1F, -0.009F, -0.9593F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4F, 7.8674F, 0.2497F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftLeg2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(24, 120).addBox(0.1F, -0.209F, -0.1593F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.0197F, -0.0418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(48, 93).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftLeg3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(35, 140).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r174 = leftLeg3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(104, 131).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(69, 18).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(44, 46).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.3017F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1626F, 8.8231F, -0.2978F, 0.0834F, -0.0256F));

		PartDefinition cube_r175 = tail1.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(32, 135).addBox(0.0F, -0.6F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2878F, 8.5295F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail1.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(40, 140).addBox(0.5F, -0.1129F, -0.1754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2512F, 3.8174F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail1.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(114, 135).addBox(0.5F, 0.2871F, -0.8754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.096F, 5.5805F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail1.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(29, 102).addBox(0.5F, -7.2573F, -1.1162F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1588F, 6.7807F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail1.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(15, 102).addBox(0.5F, -7.3073F, -1.0162F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5208F, 3.7257F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail1.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(53, 53).mirror().addBox(-2.3F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0111F, -0.1038F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r181 = tail1.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(53, 53).addBox(-0.7F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0111F, -0.1038F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r182 = tail1.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(29, 12).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.4998F, 8.6946F, 0.0356F, 0.1305F, 0.0103F));

		PartDefinition cube_r183 = tail.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-2.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition cube_r184 = tail.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(65, 0).addBox(0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition cube_r185 = tail.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(19, 63).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(57, 134).addBox(0.0F, -0.3F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3858F, 7.2538F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(54, 134).addBox(0.0F, 0.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(51, 134).addBox(0.0F, 0.3F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(88, 119).addBox(0.5F, -6.7073F, -0.0162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 4.7753F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(50, 115).addBox(0.5F, -7.1823F, -0.0162F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 2.8025F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(10, 102).addBox(0.5F, -7.3073F, -1.0162F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, 0.8174F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.8411F, 6.5801F, 0.0965F, 0.0864F, 0.0122F));

		PartDefinition cube_r192 = tail2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(74, 134).addBox(0.0F, -4.9561F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5576F, 6.0228F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(71, 134).addBox(0.0F, -5.4561F, 0.0684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3746F, 3.9307F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(25, 105).addBox(0.0F, -5.9061F, -0.1316F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2177F, 2.1376F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(91, 123).addBox(0.0F, -6.2811F, 0.0684F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.026F, -0.054F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(15, 53).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(50, 35).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.826F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(68, 134).addBox(0.0F, -0.7F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0829F, 2.6141F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(44, 95).addBox(0.0F, -1.5F, 0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6847F, 6.9508F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(65, 134).addBox(0.0F, -0.3F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8489F, 4.297F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-1.6F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, 0.9261F, 1.0278F, 0.0175F, 0.0262F, 0.0005F));

		PartDefinition cube_r201 = tail2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 63).addBox(-0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5302F, 0.9261F, 1.0278F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6224F, 8.1476F, -0.0349F, 0.0873F, 0.0008F));

		PartDefinition cube_r202 = tail8.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(53, 61).mirror().addBox(-1.4F, 0.0F, -1.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r203 = tail8.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-1.3F, 0.0F, 0.9F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3334F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r204 = tail8.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(67, 45).addBox(-0.7F, 0.0F, 0.9F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3334F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r205 = tail8.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(53, 61).addBox(-0.6F, 0.0F, -1.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r206 = tail8.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(29, 24).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1017F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail8.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(145, 53).addBox(0.0F, -0.7624F, -0.4967F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 8.89F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail8.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(143, 68).addBox(0.0F, 0.1188F, -0.2484F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 5.89F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail8.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(112, 142).addBox(0.0F, 0.0396F, -0.7495F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 3.89F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail8.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(117, 135).addBox(0.0F, -0.7F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2632F, 1.244F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail8.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(31, 142).addBox(0.0F, -2.5462F, -0.0313F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 7.8984F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r212 = tail8.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(22, 142).addBox(0.0F, -2.5811F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 5.8984F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail8.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(117, 141).addBox(0.0F, -2.8561F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 3.9984F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r214 = tail8.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(53, 102).addBox(0.0F, -3.1061F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 1.8984F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r215 = tail8.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(29, 96).addBox(0.0F, -3.7561F, -0.0316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, -0.1016F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0964F, -0.0869F, -0.0084F));

		PartDefinition cube_r216 = tail3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(115, 146).addBox(0.0F, -2.1128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 6.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(146, 97).addBox(0.0F, -2.0628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 4.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(39, 146).addBox(0.0F, -2.0628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 2.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 107).addBox(0.0F, -2.0128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 0.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(106, 28).addBox(0.0F, 2.6F, 3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 49).addBox(0.0F, 1.5F, 1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 86).addBox(0.0F, -0.3F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r222 = tail3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 38).addBox(0.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r223 = tail3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(29, 35).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.114F, -0.1306F, 0.0092F));

		PartDefinition cube_r224 = tail9.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(72, 69).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r225 = tail9.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(23, 147).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 4.0517F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r226 = tail9.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(20, 147).addBox(0.0F, -1.725F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 2.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r227 = tail9.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(147, 3).addBox(0.0F, 6.5F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 147).addBox(0.0F, 5.2F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 146).addBox(0.0F, 3.8F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r228 = tail9.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(146, 134).addBox(0.0F, -1.625F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 0.0827F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition cube_r229 = tail4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(58, 147).addBox(0.0F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 4.0293F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r230 = tail4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(35, 147).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 2.0305F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r231 = tail4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(32, 147).addBox(0.0F, -1.4F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r232 = tail4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(29, 147).addBox(0.0F, -0.45F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 147).addBox(0.0F, -1.85F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r233 = tail4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(15, 73).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(75, 77).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.1663F, -0.0866F, 0.0107F));

		PartDefinition cube_r234 = tail5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(86, 147).addBox(0.0F, -1.1909F, 0.0159F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4698F, 3.7774F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r235 = tail5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(83, 147).addBox(0.0F, -1.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 61).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2698F, -0.2226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r236 = tail5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(35, 137).addBox(0.0F, 4.35F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 113).addBox(0.0F, 1.75F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r237 = tail5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(123, 70).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4277F, 2.9853F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(34, 53).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5056F, 5.6774F, -0.1418F, -0.1728F, 0.0245F));

		PartDefinition cube_r238 = tail6.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(65, 12).addBox(0.0F, 8.05F, 12.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 147).addBox(0.0F, 6.75F, 10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 147).addBox(0.0F, 5.45F, 8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1693F, -8.5969F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r239 = tail6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(95, 147).addBox(0.0F, -1.6909F, 7.9159F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 147).addBox(0.0F, -1.6909F, 5.9159F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 19).addBox(0.0F, -1.4909F, 3.9159F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 137).addBox(0.0F, -1.2909F, 1.9159F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0359F, -1.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.2288F, -0.1275F, 0.0296F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(74, 53).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0223F, 5.9976F, -0.1715F, -0.2581F, 0.0442F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(112, 96).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(105, 74).addBox(-0.003F, -8.4508F, -4.8856F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, -0.2708F, 0.042F, -0.0117F));

		PartDefinition cube_r240 = body.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(5, 109).addBox(-0.503F, -6.9272F, -2.0364F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3533F, -5.8465F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r241 = body.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(20, 105).addBox(-0.503F, -7.3522F, -0.0364F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1091F, -1.8541F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r242 = body.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(50, 15).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r243 = body.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 15).addBox(-3.5F, -2.4874F, 9.4548F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.3059F, -15.2503F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r244 = body.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(139, 134).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.0443F, 0.0544F, -0.6431F));

		PartDefinition cube_r245 = body.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(135, 37).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.0171F, 0.068F, -1.0801F));

		PartDefinition cube_r246 = body.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(126, 76).mirror().addBox(-5.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, -0.0239F, 0.0659F, -1.6748F));

		PartDefinition cube_r247 = body.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(139, 136).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0674F, -0.0295F, -0.6445F));

		PartDefinition cube_r248 = body.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(116, 11).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0094F, -0.0729F, -1.6749F));

		PartDefinition cube_r249 = body.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(135, 56).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0486F, -0.0552F, -1.0805F));

		PartDefinition cube_r250 = body.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(139, 138).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.1088F, 0.1001F, -0.4825F));

		PartDefinition cube_r251 = body.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.0562F, 0.1367F, -0.9204F));

		PartDefinition cube_r252 = body.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(103, 11).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, -0.0304F, 0.1446F, -1.5199F));

		PartDefinition cube_r253 = body.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(103, 11).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, -0.0304F, -0.1446F, 1.5199F));

		PartDefinition cube_r254 = body.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 140).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.0562F, -0.1367F, 0.9204F));

		PartDefinition cube_r255 = body.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(139, 138).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.1088F, -0.1001F, 0.4825F));

		PartDefinition cube_r256 = body.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(135, 56).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0486F, 0.0552F, 1.0805F));

		PartDefinition cube_r257 = body.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(116, 11).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0094F, 0.0729F, 1.6749F));

		PartDefinition cube_r258 = body.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(139, 136).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0674F, 0.0295F, 0.6445F));

		PartDefinition cube_r259 = body.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(126, 76).addBox(2.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, -0.0239F, -0.0659F, 1.6748F));

		PartDefinition cube_r260 = body.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(135, 37).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.0171F, -0.068F, 1.0801F));

		PartDefinition cube_r261 = body.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(139, 134).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.0443F, -0.0544F, 0.6431F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -0.0002F, -9.1192F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4765F, -7.7702F, 0.1048F, 0.0434F, 0.0046F));

		PartDefinition cube_r262 = body2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(39, 102).addBox(0.0F, -7.1122F, -1.0627F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0104F, -2.0137F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r263 = body2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(34, 102).addBox(0.0F, -6.6117F, -0.8614F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1006F, -8.2142F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r264 = body2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(5, 98).addBox(0.0F, -7.1367F, -0.9614F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -5.1143F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r265 = body2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -5.0192F, 0.0338F, 0.1886F, -1.3948F));

		PartDefinition cube_r266 = body2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -5.0192F, 0.134F, 0.1373F, -0.7953F));

		PartDefinition cube_r267 = body2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(117, 105).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -5.0192F, 0.1792F, 0.0682F, -0.3621F));

		PartDefinition cube_r268 = body2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(136, 88).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -8.0192F, 0.2595F, 0.1034F, -0.3208F));

		PartDefinition cube_r269 = body2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(137, 66).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -8.0192F, 0.1928F, 0.2028F, -0.751F));

		PartDefinition cube_r270 = body2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(65, 8).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9498F, -8.0192F, 0.0447F, 0.2754F, -1.3579F));

		PartDefinition cube_r271 = body2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(89, 57).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9998F, -2.0192F, -0.0037F, 0.0814F, -1.449F));

		PartDefinition cube_r272 = body2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(85, 137).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9998F, -2.0192F, 0.0425F, 0.0696F, -0.854F));

		PartDefinition cube_r273 = body2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(99, 137).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9998F, -2.0192F, 0.0679F, 0.0451F, -0.4176F));

		PartDefinition cube_r274 = body2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(99, 137).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9998F, -2.0192F, 0.0679F, -0.0451F, 0.4176F));

		PartDefinition cube_r275 = body2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 27).addBox(-3.5F, -3.1079F, 0.0001F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.7824F, -7.4801F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r276 = body2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(85, 137).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9998F, -2.0192F, 0.0425F, -0.0696F, 0.854F));

		PartDefinition cube_r277 = body2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(89, 57).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9998F, -2.0192F, -0.0037F, -0.0814F, 1.449F));

		PartDefinition cube_r278 = body2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(65, 8).addBox(2.6881F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -8.0192F, 0.0447F, -0.2754F, 1.3579F));

		PartDefinition cube_r279 = body2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(137, 66).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -8.0192F, 0.1928F, -0.2028F, 0.751F));

		PartDefinition cube_r280 = body2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(136, 88).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -8.0192F, 0.2595F, -0.1034F, 0.3208F));

		PartDefinition cube_r281 = body2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(117, 105).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -5.0192F, 0.1792F, -0.0682F, 0.3621F));

		PartDefinition cube_r282 = body2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(45, 73).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -5.0192F, 0.134F, -0.1373F, 0.7953F));

		PartDefinition cube_r283 = body2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(69, 24).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9498F, -5.0192F, 0.0338F, -0.1886F, 1.3948F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2537F, -9.0204F, 0.1572F, 0.0431F, 0.0068F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(124, 78).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9391F, -1.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(36, 129).addBox(0.0F, -6.0525F, -0.1399F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -1.8368F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(5, 129).addBox(0.0F, -5.7217F, -0.0424F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -3.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(22, 83).addBox(-4.9578F, -0.9216F, -1.7306F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-6.9409F, -0.1894F, -0.7739F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9578F, 13.4683F, -5.8159F, -0.2353F, 1.0334F, -0.1288F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(101, 19).mirror().addBox(-5.449F, 0.2806F, -1.2942F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9578F, 13.4683F, -5.8159F, -0.1787F, 1.0207F, 0.489F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(71, 28).mirror().addBox(-1.7145F, -0.6734F, -6.0021F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9578F, 13.4683F, -5.8159F, -0.7488F, -0.3643F, 0.3198F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 138).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.1436F, 0.0612F, -0.2781F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(138, 22).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.1045F, 0.116F, -0.7128F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(65, 10).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.0214F, 0.1545F, -1.3106F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.0469F, 0.2197F, -1.3592F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(138, 24).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.1625F, 0.1557F, -0.7582F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(138, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.2125F, 0.0731F, -0.3268F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(22, 81).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.0658F, 0.25F, -1.3913F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(138, 41).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.1952F, 0.1703F, -0.7894F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(138, 48).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.2481F, 0.0729F, -0.3607F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(138, 50).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.2946F, 0.0961F, -0.4443F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(138, 52).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.2284F, 0.2107F, -0.8707F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(90, 21).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.0698F, 0.3018F, -1.4777F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(90, 21).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.0698F, -0.3018F, 1.4777F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(138, 52).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.2284F, -0.2107F, 0.8707F));

		PartDefinition cube_r305 = chest.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(138, 50).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.2946F, -0.0961F, 0.4443F));

		PartDefinition cube_r306 = chest.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(86, 128).addBox(0.0F, -5.4927F, -0.2837F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -7.7368F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r307 = chest.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(138, 48).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.2481F, -0.0729F, 0.3607F));

		PartDefinition cube_r308 = chest.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(138, 41).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.1952F, -0.1703F, 0.7894F));

		PartDefinition cube_r309 = chest.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(22, 81).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.0658F, -0.25F, 1.3913F));

		PartDefinition cube_r310 = chest.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(138, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.2125F, -0.0731F, 0.3268F));

		PartDefinition cube_r311 = chest.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(138, 24).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.1625F, -0.1557F, 0.7582F));

		PartDefinition cube_r312 = chest.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(71, 26).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.0469F, -0.2197F, 1.3592F));

		PartDefinition cube_r313 = chest.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(65, 10).addBox(2.6881F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.0214F, -0.1545F, 1.3106F));

		PartDefinition cube_r314 = chest.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(138, 22).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.1045F, -0.116F, 0.7128F));

		PartDefinition cube_r315 = chest.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(53, 69).addBox(-3.0F, -2.1F, 0.4F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.9375F, -4.1355F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r316 = chest.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 138).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.1436F, -0.0612F, 0.2781F));

		PartDefinition cube_r317 = chest.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(24, 128).addBox(0.0F, -5.6927F, -0.2837F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -5.7368F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r318 = chest.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(71, 28).addBox(-0.2855F, -0.6734F, -6.0021F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, -0.7488F, 0.3643F, -0.3198F));

		PartDefinition cube_r319 = chest.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(101, 19).addBox(0.449F, 0.2806F, -1.2942F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, -0.1787F, -1.0207F, -0.489F));

		PartDefinition cube_r320 = chest.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(89, 59).addBox(-0.0591F, -0.1894F, -0.7739F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, -0.2353F, -1.0334F, 0.1288F));

		PartDefinition cube_r321 = chest.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(90, 7).addBox(-2.9578F, -0.6734F, -5.632F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r322 = chest.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1609F, -2.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5169F, 5.4655F, -5.0356F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r323 = bone2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(124, 131).addBox(-0.5F, -0.6F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5557F, 0.7735F, -3.539F, -1.4616F, -0.0083F, -0.0153F));

		PartDefinition cube_r324 = bone2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(142, 4).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5557F, 0.7735F, -3.539F, -0.6763F, -0.0083F, -0.0153F));

		PartDefinition cube_r325 = bone2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(145, 50).addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5435F, 0.9091F, -1.8327F, -0.1963F, -0.0083F, -0.0153F));

		PartDefinition cube_r326 = bone2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5F, 0.2F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(115, 107).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4998F, -1.5165F, -1.0482F, 0.9556F, -0.0083F, -0.0153F));

		PartDefinition cube_r327 = bone2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(117, 19).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4526F, -3.1124F, 1.6815F, 0.9207F, -0.0083F, -0.0153F));

		PartDefinition cube_r328 = bone2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(117, 54).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4151F, -5.2161F, 2.3126F, 0.5891F, -0.0083F, -0.0153F));

		PartDefinition cube_r329 = bone2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(8, 132).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4487F, -3.7717F, 0.9297F, 0.8073F, -0.0083F, -0.0153F));

		PartDefinition cube_r330 = bone2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(41, 115).addBox(-0.5F, -2.3F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5087F, -0.0001F, 0.6811F, 0.8509F, -0.0083F, -0.0153F));

		PartDefinition cube_r331 = bone2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(84, 85).addBox(-0.1317F, 2.5826F, -2.2852F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.0351F, 0.5144F, 1.282F));

		PartDefinition cube_r332 = bone2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(99, 42).addBox(-1.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.159F, 0.4925F, 0.8837F));

		PartDefinition cube_r333 = bone2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(121, 11).addBox(-1.0673F, -1.4729F, -2.4494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 1.0191F, 0.4925F, 0.8837F));

		PartDefinition cube_r334 = bone2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(118, 59).addBox(-1.0673F, -0.8336F, -1.9078F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 1.2372F, 0.4925F, 0.8837F));

		PartDefinition cube_r335 = bone2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(94, 136).addBox(-0.5F, -1.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5078F, 1.6944F, -1.9808F, 1.1F, 0.2124F, 0.1427F));

		PartDefinition cube_r336 = bone2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(138, 68).addBox(0.6244F, -0.8239F, -4.5891F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.441F, -0.0947F, 1.8677F, 0.4019F, 0.2124F, 0.1427F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5169F, 5.4655F, -5.0356F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r337 = bone4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(124, 131).mirror().addBox(-0.5F, -0.6F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5557F, 0.7735F, -3.539F, -1.4616F, 0.0083F, 0.0153F));

		PartDefinition cube_r338 = bone4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(142, 4).mirror().addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5557F, 0.7735F, -3.539F, -0.6763F, 0.0083F, 0.0153F));

		PartDefinition cube_r339 = bone4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(145, 50).mirror().addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5435F, 0.9091F, -1.8327F, -0.1963F, 0.0083F, 0.0153F));

		PartDefinition cube_r340 = bone4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(117, 0).mirror().addBox(-0.5F, 0.2F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 107).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4998F, -1.5165F, -1.0482F, 0.9556F, 0.0083F, 0.0153F));

		PartDefinition cube_r341 = bone4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(117, 19).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4526F, -3.1124F, 1.6815F, 0.9207F, 0.0083F, 0.0153F));

		PartDefinition cube_r342 = bone4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(117, 54).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4151F, -5.2161F, 2.3126F, 0.5891F, 0.0083F, 0.0153F));

		PartDefinition cube_r343 = bone4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(8, 132).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4487F, -3.7717F, 0.9297F, 0.8073F, 0.0083F, 0.0153F));

		PartDefinition cube_r344 = bone4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(41, 115).mirror().addBox(-0.5F, -2.3F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5087F, -0.0001F, 0.6811F, 0.8509F, 0.0083F, 0.0153F));

		PartDefinition cube_r345 = bone4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(84, 85).mirror().addBox(-0.8683F, 2.5826F, -2.2852F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.0351F, -0.5144F, -1.282F));

		PartDefinition cube_r346 = bone4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(99, 42).mirror().addBox(0.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.159F, -0.4925F, -0.8837F));

		PartDefinition cube_r347 = bone4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(121, 11).mirror().addBox(0.0673F, -1.4729F, -2.4494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 1.0191F, -0.4925F, -0.8837F));

		PartDefinition cube_r348 = bone4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(118, 59).mirror().addBox(0.0673F, -0.8336F, -1.9078F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 1.2372F, -0.4925F, -0.8837F));

		PartDefinition cube_r349 = bone4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(94, 136).mirror().addBox(-0.5F, -1.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5078F, 1.6944F, -1.9808F, 1.1F, -0.2124F, -0.1427F));

		PartDefinition cube_r350 = bone4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(138, 68).mirror().addBox(-1.6244F, -0.8239F, -4.5891F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.441F, -0.0947F, 1.8677F, 0.4019F, -0.2124F, -0.1427F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4388F, 8.9589F, -7.4685F, 0.148F, 0.5739F, -0.3271F));

		PartDefinition cube_r351 = leftArm1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(143, 73).addBox(-0.2F, 0.075F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3037F, 0.0186F, 0.0504F, -0.1045F, -0.2207F, -0.0253F));

		PartDefinition cube_r352 = leftArm1.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(142, 62).addBox(-0.2F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3037F, 0.0186F, 0.0504F, -0.8463F, -0.2207F, -0.0253F));

		PartDefinition cube_r353 = leftArm1.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(138, 99).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r354 = leftArm1.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(138, 90).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r355 = leftArm1.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(138, 72).addBox(6.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2F, 1.1847F, -1.6107F, -0.4204F, -0.0786F, -0.067F));

		PartDefinition cube_r356 = leftArm1.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(109, 134).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3F, 3.5346F, 0.1087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(116, 129).addBox(-0.8F, -1.5307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 135).addBox(-0.8F, -0.4307F, -1.5734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.594F, 5.4514F, -0.8193F, -1.9553F, -0.9675F, 0.6625F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0484F, 2.5843F, 0.3278F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r357 = leftHand.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(20, 96).addBox(0.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r358 = leftHand.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(67, 119).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4388F, 8.9589F, -7.4685F, 0.4502F, 0.0248F, 0.0463F));

		PartDefinition cube_r359 = rightArm1.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(144, 113).addBox(-0.8F, 0.075F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3037F, 0.0186F, 0.0504F, -0.1045F, 0.2207F, 0.0253F));

		PartDefinition cube_r360 = rightArm1.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(144, 110).addBox(-0.8F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3037F, 0.0186F, 0.0504F, -0.8463F, 0.2207F, 0.0253F));

		PartDefinition cube_r361 = rightArm1.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(140, 12).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r362 = rightArm1.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(140, 8).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r363 = rightArm1.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(140, 0).addBox(-7.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2F, 1.1847F, -1.6107F, -0.4204F, 0.0786F, 0.067F));

		PartDefinition cube_r364 = rightArm1.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(135, 32).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3F, 3.5346F, 0.1087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(131, 78).addBox(-0.2F, -1.5307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 136).addBox(-0.2F, -0.4307F, -1.5734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.594F, 5.4514F, -0.8193F, -1.2278F, 0.4822F, 0.1526F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0484F, 2.5843F, 0.3278F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r365 = rightHand.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(97, 23).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightHand.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(74, 119).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8698F, -7.7672F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r367 = neck1.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(121, 129).addBox(0.0F, -5.1459F, -0.016F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r368 = neck1.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0549F, 0.9381F, -1.6998F));

		PartDefinition cube_r369 = neck1.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(138, 54).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.6804F, 0.7081F, -0.8741F));

		PartDefinition cube_r370 = neck1.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(138, 103).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.8756F, 0.3979F, -0.5097F));

		PartDefinition cube_r371 = neck1.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(138, 103).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.8756F, -0.3979F, 0.5097F));

		PartDefinition cube_r372 = neck1.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(138, 54).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.6804F, -0.7081F, 0.8741F));

		PartDefinition cube_r373 = neck1.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(60, 75).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0549F, -0.9381F, 1.6998F));

		PartDefinition cube_r374 = neck1.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(88, 108).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3415F, 0.0822F, 0.0292F));

		PartDefinition cube_r375 = neck2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(77, 134).addBox(0.0F, -4.7816F, -0.0991F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(138, 105).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.2054F, 0.5609F, -1.0212F));

		PartDefinition cube_r377 = neck2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(107, 21).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0822F, 0.5885F, -1.5418F));

		PartDefinition cube_r378 = neck2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(107, 21).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0822F, -0.5885F, 1.5418F));

		PartDefinition cube_r379 = neck2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(138, 105).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.2054F, -0.5609F, 1.0212F));

		PartDefinition cube_r380 = neck2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(111, 48).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3605F, -2.3471F, -0.3134F, 0.1795F, -0.0124F));

		PartDefinition cube_r381 = neck5.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(112, 13).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r382 = neck5.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(131, 108).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, -0.2704F, 1.1208F, -1.6737F));

		PartDefinition cube_r383 = neck5.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(140, 20).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, 0.581F, 1.0455F, -0.7259F));

		PartDefinition cube_r384 = neck5.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(138, 130).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, 0.463F, 0.9843F, -0.8263F));

		PartDefinition cube_r385 = neck5.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(126, 56).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, -0.2529F, 1.0339F, -1.6583F));

		PartDefinition cube_r386 = neck5.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(126, 56).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, -0.2529F, -1.0339F, 1.6583F));

		PartDefinition cube_r387 = neck5.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(138, 130).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, 0.463F, -0.9843F, 0.8263F));

		PartDefinition cube_r388 = neck5.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(140, 20).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, 0.581F, -1.0455F, 0.7259F));

		PartDefinition cube_r389 = neck5.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(131, 108).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, -0.2704F, -1.1208F, 1.6737F));

		PartDefinition cube_r390 = neck5.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(99, 117).addBox(0.0F, -4.9566F, -1.1491F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r391 = neck5.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(62, 132).addBox(0.0F, -4.6566F, -0.1491F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, 0.1134F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.1747F, 0.043F, -0.0076F));

		PartDefinition cube_r392 = neck4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(138, 132).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r393 = neck4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(139, 43).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r394 = neck4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(44, 139).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.508F, 0.9362F, -0.7795F));

		PartDefinition cube_r395 = neck4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(139, 45).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1513F, 1.0193F, -1.5615F));

		PartDefinition cube_r396 = neck4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(139, 45).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1513F, -1.0193F, 1.5615F));

		PartDefinition cube_r397 = neck4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(44, 139).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.508F, -0.9362F, 0.7795F));

		PartDefinition cube_r398 = neck4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(139, 43).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r399 = neck4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(138, 132).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r400 = neck4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(118, 65).addBox(0.0F, -3.7677F, -0.0582F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r401 = neck4.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(33, 95).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.4116F, 0.2639F, 0.15F));

		PartDefinition cube_r402 = neck3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(139, 58).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r403 = neck3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(139, 60).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r404 = neck3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(139, 60).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r405 = neck3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(139, 58).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r406 = neck3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(94, 123).addBox(0.5F, -3.469F, -0.9772F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r407 = neck3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(95, 85).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.3475F, 0.2346F, 0.0063F));

		PartDefinition cube_r408 = neck.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(85, 139).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r409 = neck.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(99, 139).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r410 = neck.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(99, 139).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r411 = neck.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(104, 124).addBox(0.5F, -3.8207F, -0.2013F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r412 = neck.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(44, 109).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r413 = neck.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(85, 139).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.1657F, 0.0072F, -0.043F));

		PartDefinition cube_r414 = neck6.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(106, 59).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0783F, -0.876F, 1.5935F));

		PartDefinition cube_r415 = neck6.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(23, 136).addBox(0.0F, -2.0F, -0.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4134F, 0.3277F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r416 = neck6.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(143, 98).addBox(0.5F, -1.3207F, 0.0987F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0375F, -1.2498F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r417 = neck6.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(109, 67).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r418 = neck6.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(106, 139).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8032F, -2.394F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(99, 98).addBox(-2.0F, -0.831F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F))
				.texOffs(97, 32).addBox(-2.0F, -1.1311F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -1.4099F, -2.6888F, -1.7322F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(104, 113).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -1.4768F, -2.8128F, -1.549F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(103, 6).addBox(-1.5F, -0.038F, -0.1197F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.3269F, -5.7461F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(97, 102).addBox(-1.0F, 0.0045F, 0.0259F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1269F, -7.6461F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(0, 132).addBox(-0.5025F, 1.9137F, -0.3688F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 1.9828F, -16.0754F, 1.8719F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(146, 68).addBox(-0.5025F, -0.2021F, 1.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0025F, 1.9828F, -16.0754F, 0.5192F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(92, 23).addBox(-0.5025F, -1.0232F, -0.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 1.9828F, -16.0754F, -0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(100, 54).addBox(-0.5025F, -1.0206F, -0.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0025F, 2.7328F, -16.7254F, -0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(83, 111).addBox(-0.4975F, 0.7508F, -1.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 2.8078F, -15.5504F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(92, 114).addBox(-0.4975F, -1.0373F, -0.0093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, 3.6578F, -17.1504F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(99, 92).addBox(-0.5F, -0.8428F, -4.0384F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -1.5891F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(74, 130).addBox(-0.5F, -0.7792F, -0.8971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -1.5891F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(67, 130).addBox(-0.5F, 0.1824F, -0.598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -1.5891F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(84, 0).addBox(-0.4975F, -0.9556F, -0.0606F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.0025F, 4.5634F, -16.1651F, -0.0706F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(60, 77).addBox(-0.5F, -0.7815F, -1.5833F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.6767F, -9.6946F, 0.0254F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(50, 26).addBox(-1.5F, -1.5078F, 3.5018F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.6767F, -9.6946F, -0.1317F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(95, 144).addBox(-0.5F, 0.4061F, 0.2489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -1.5891F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(86, 37).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3061F, -1.2927F, 0.0722F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(45, 75).addBox(-2.5F, 1.1371F, -3.1968F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2775F, 1.3132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(90, 81).addBox(-1.5F, -1.025F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.998F, -0.3737F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(90, 77).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0075F, -0.3968F, 0.9512F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.4011F, 7.8848F, -15.7879F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(140, 94).addBox(-6.7335F, 5.3151F, 0.3407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(92, 140).addBox(-6.7335F, 5.3151F, 0.7407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 2.8491F, 1.1384F, 0.0631F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(72, 61).addBox(-1.8961F, -0.8593F, 0.576F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7928F, -3.4031F, -0.4705F, -0.0903F, 0.0596F, 0.0221F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(145, 16).addBox(-0.6755F, 0.8293F, 2.708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4848F, -7.7297F, 4.5241F, -2.322F, -0.0533F, 0.5163F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(15, 145).addBox(-0.6755F, 2.1327F, -0.9053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4848F, -7.7297F, 4.5241F, -1.0567F, -0.0533F, 0.5163F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(145, 13).addBox(-0.6755F, 1.618F, -1.3022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4848F, -7.7297F, 4.5241F, -0.8821F, -0.0533F, 0.5163F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(145, 0).addBox(-0.6755F, 0.9541F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4848F, -7.7297F, 4.5241F, -1.1876F, -0.0533F, 0.5163F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(0, 145).addBox(-0.6755F, 0.2068F, -0.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4848F, -7.7297F, 4.5241F, -0.9258F, -0.0533F, 0.5163F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(140, 144).addBox(-0.6755F, -0.2595F, -0.694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4848F, -7.7297F, 4.5241F, -1.5192F, -0.0533F, 0.5163F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(135, 144).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5098F, -8.2024F, 4.9535F, -1.1612F, -0.0837F, 0.5175F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(145, 22).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1402F, -9.266F, 8.2054F, 1.4282F, 0.0198F, 0.5264F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(10, 145).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7859F, -8.6664F, 7.9458F, 0.381F, 0.0198F, 0.5264F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(145, 7).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9867F, -9.0541F, 6.8824F, 1.6027F, 0.0198F, 0.5264F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(131, 72).addBox(-0.5F, -0.4F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7394F, -8.6323F, 6.7799F, 0.4246F, 0.0198F, 0.5264F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(5, 145).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5687F, -8.3351F, 5.6404F, 1.5591F, 0.0198F, 0.5264F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(74, 125).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.3279F, -9.5964F, 9.4552F, 0.6207F, 0.1134F, 0.4736F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(67, 125).addBox(-0.6225F, -0.302F, -0.8332F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.0213F, -8.5815F, 10.0415F, 1.8425F, 0.1134F, 0.4736F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(130, 144).addBox(-0.575F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0634F, -10.0061F, 12.0115F, 1.837F, 0.2373F, 0.4727F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(140, 16).addBox(-0.55F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.0634F, -10.0061F, 12.0115F, 2.3169F, 0.2373F, 0.4727F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(139, 126).addBox(-1.5032F, 0.8519F, -3.0926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.9295F, -3.0229F, 0.1684F, 0.507F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(111, 120).addBox(-0.5F, -1.0F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.5802F, -8.3986F, 13.5055F, -1.7952F, 0.2202F, 0.4908F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(131, 68).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9948F, -2.3186F, 17.1993F, 1.7406F, 0.0318F, -0.0201F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(139, 122).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.005F, -2.528F, 17.6532F, 0.6934F, 0.0318F, -0.0201F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(90, 144).addBox(-1.4022F, -1.8522F, -0.5318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7928F, -3.3031F, -1.2705F, -0.4105F, 0.0696F, -0.0352F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(141, 76).addBox(-1.3811F, -2.0041F, -0.1712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7928F, -3.4031F, -0.4705F, -0.323F, 0.075F, -0.007F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(146, 58).addBox(-1.4492F, -0.0624F, 0.0029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7928F, -3.3031F, -1.2705F, 1.6585F, 0.0749F, 0.0075F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(13, 136).addBox(-1.3811F, -2.9357F, 0.7914F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7928F, -3.4031F, -0.4705F, -0.2357F, 0.075F, -0.007F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(57, 99).addBox(-1.3772F, -3.6394F, 1.6579F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7928F, -3.4031F, -0.4705F, -0.0656F, 0.075F, -0.007F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(139, 118).addBox(-1.4463F, -0.0446F, -0.055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7928F, -5.2031F, -0.9705F, 0.8551F, 0.0736F, -0.0169F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(135, 9).addBox(-0.7F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0169F)), PartPose.offsetAndRotation(0.9989F, -8.829F, 11.4864F, -1.5486F, 0.1745F, 0.0038F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(32, 113).addBox(-1.4361F, 0.3467F, 6.2956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.3407F, 0.075F, 0.0062F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(73, 85).addBox(-1.4361F, -0.2493F, 3.1353F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.2535F, 0.075F, 0.0062F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(69, 35).addBox(-1.4611F, -0.3111F, 0.8339F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7928F, -6.4031F, 0.2295F, 0.2531F, 0.0744F, -0.013F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(119, 39).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0194F, -7.0682F, 1.305F, 1.8327F, 0.075F, -0.0091F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(53, 141).addBox(-1.3861F, -0.208F, 0.9835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7928F, -5.9031F, -0.3705F, 0.5237F, 0.075F, -0.0091F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(48, 141).addBox(-1.3861F, -0.0341F, 0.0047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7928F, -5.9031F, -0.3705F, 0.6983F, 0.075F, -0.0091F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(80, 141).addBox(-1.2817F, -1.1373F, -0.4777F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7928F, -3.2031F, -0.6705F, 0.0354F, 0.0747F, 0.01F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(43, 141).addBox(-1.2317F, -0.537F, 0.4902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7928F, -3.2031F, -0.6705F, 0.0877F, 0.0747F, 0.01F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(134, 44).addBox(-1.2317F, -0.1458F, 1.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7928F, -3.2031F, -0.6705F, 0.175F, 0.0747F, 0.01F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(70, 141).addBox(-1.3808F, 0.4717F, 2.3104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7928F, -3.2031F, -0.6705F, 0.2361F, 0.0747F, 0.01F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(75, 141).addBox(-1.3808F, 0.7398F, 3.2183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -3.2031F, -0.6705F, 0.3059F, 0.0747F, 0.01F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(12, 141).addBox(-1.3808F, 1.7751F, 4.1312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(140, 140).addBox(-1.3808F, 2.2751F, 8.7312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(135, 140).addBox(-1.3808F, 2.4751F, 7.5312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(130, 140).addBox(-1.3808F, 2.0751F, 6.3312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 140).addBox(-1.3808F, 1.8751F, 5.1312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -3.2031F, -0.6705F, 0.3495F, 0.0747F, 0.01F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(44, 102).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3201F, -2.5543F, 5.6649F, 0.0703F, 0.0747F, 0.011F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(48, 125).addBox(-0.5F, -0.675F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3594F, -3.8135F, 6.0699F, -0.1305F, 0.075F, 0.0062F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(86, 28).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6994F, -4.7674F, 9.3351F, 0.0438F, 0.2026F, -0.0241F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(129, 135).addBox(-0.5568F, 0.627F, 1.5456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.4942F, 0.3117F, -0.0303F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5568F, 0.2771F, -2.7378F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.276F, 0.3117F, -0.0303F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(0, 125).addBox(-0.5568F, -1.7445F, 2.7402F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, -0.1203F, 0.3117F, -0.0303F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(85, 144).addBox(-0.9803F, -6.2676F, -0.0821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(139, 114).addBox(-0.9803F, -6.2676F, -1.0821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3678F, -2.7031F, 12.5295F, -0.8208F, 0.0302F, -0.0049F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(132, 126).addBox(-2.7974F, -0.2296F, -5.8793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -1.922F, 0.0694F, 0.3678F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(130, 64).addBox(-0.3587F, -0.6048F, 0.4218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(2.1123F, -8.9584F, 14.6347F, -0.8434F, 0.155F, 0.3434F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(127, 114).addBox(-0.3587F, -0.8113F, -0.2453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.1123F, -8.9584F, 14.6347F, -1.847F, 0.155F, 0.3434F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(118, 124).addBox(-2.9058F, -1.9057F, -5.5883F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.3678F, -3.2031F, 12.5295F, -1.436F, 0.2419F, 0.3451F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(55, 130).addBox(-0.9315F, -5.5116F, 0.4477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3678F, -2.7031F, 12.5295F, -0.0013F, 0.0318F, -0.0201F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(124, 105).addBox(-0.9186F, -6.3474F, -1.7912F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3678F, -2.7031F, 12.5295F, -0.6121F, 0.0318F, -0.0201F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(25, 113).addBox(-0.9542F, -3.2482F, 2.9389F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3678F, -2.7031F, 12.5295F, 0.3129F, 0.0318F, -0.0201F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(0, 119).addBox(-0.5F, -3.025F, -0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9881F, -2.2998F, 14.6301F, -0.1583F, 0.0318F, -0.0201F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(48, 130).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.9917F, -5.9722F, 14.9486F, -1.1401F, 0.0318F, -0.0201F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(68, 145).addBox(-0.8723F, 1.9634F, 0.9203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3678F, -2.6031F, 12.9295F, 1.5128F, 0.0318F, -0.0201F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(144, 119).addBox(-0.8723F, 1.2968F, 2.0864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -2.6031F, 12.9295F, 1.0765F, 0.0318F, -0.0201F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(145, 131).addBox(-0.8723F, -1.2244F, 2.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3678F, -2.6031F, 12.9295F, 0.3784F, 0.0318F, -0.0201F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(144, 116).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0434F, -5.1537F, 16.0566F, -0.887F, 0.0318F, -0.0201F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(131, 104).addBox(-0.8736F, 1.457F, 0.949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -2.6031F, 12.9295F, 1.5041F, 0.0318F, -0.0201F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(140, 107).addBox(-0.8933F, -2.5628F, -1.0487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3678F, -2.6031F, 12.9295F, -1.0965F, 0.0318F, -0.0201F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(144, 65).addBox(-0.5F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9629F, -6.9918F, 14.7991F, 0.3347F, 0.0318F, -0.0201F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(130, 5).addBox(-0.5F, -0.45F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9683F, -5.6223F, 14.1014F, -1.6288F, 0.0318F, -0.0201F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(58, 144).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.9521F, -6.6139F, 14.2199F, -0.9743F, 0.0318F, -0.0201F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(139, 110).addBox(-0.8758F, -4.8586F, 0.0935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3678F, -2.6031F, 12.9295F, -0.2761F, 0.0318F, -0.0201F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(65, 141).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9893F, -4.2147F, 13.8722F, 2.1019F, 0.0318F, -0.0201F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(146, 76).addBox(-1.1713F, 0.1051F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8428F, -6.4031F, 0.2295F, 0.8827F, 0.0656F, 0.0252F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(146, 82).addBox(-1.1746F, -0.0416F, -1.1455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8428F, -6.4031F, 0.2295F, 2.065F, 0.0628F, 0.0268F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(146, 88).addBox(-1.1746F, 0.3265F, 0.7946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F))
				.texOffs(146, 85).addBox(-1.1746F, 0.3265F, 0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.8428F, -6.4031F, 0.2295F, 0.7473F, 0.0628F, 0.0268F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(121, 16).addBox(-1.1713F, -0.9014F, -1.9366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8428F, -6.4031F, 0.2295F, -2.6516F, 0.0656F, 0.0252F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(146, 79).addBox(-1.1713F, 0.2774F, -0.949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.8428F, -6.4031F, 0.2295F, 2.1044F, 0.0656F, 0.0252F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(145, 25).addBox(-1.7041F, 8.7483F, -0.6338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.8178F, -5.8531F, -0.4705F, 1.4755F, 0.1274F, 0.0062F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(48, 145).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.8423F, -4.2997F, 9.2746F, 2.4616F, 0.1274F, 0.0062F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(104, 118).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8365F, -6.4612F, 9.1237F, 2.959F, 0.1274F, 0.0062F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(144, 125).addBox(-1.7041F, 9.4475F, 0.6534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 1.6413F, 0.1274F, 0.0062F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(145, 10).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9078F, -8.7656F, 9.5687F, 2.9503F, 0.1274F, 0.0062F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(29, 127).addBox(-1.7041F, 9.1475F, 0.2034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8178F, -5.8531F, -0.4705F, 1.6413F, 0.1274F, 0.0062F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(140, 30).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6531F, -8.5164F, 7.5922F, -2.7395F, 0.1274F, 0.0062F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(114, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7791F, -8.6986F, 8.5674F, -1.3868F, 0.1274F, 0.0062F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(131, 90).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4807F, -7.8998F, 6.3234F, -1.1076F, 0.1274F, 0.0062F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(140, 26).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3749F, -7.305F, 5.5264F, -2.5038F, 0.1274F, 0.0062F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(15, 132).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3773F, -6.5979F, 5.5327F, 2.3831F, 0.1274F, 0.0062F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(145, 143).addBox(-0.5F, 0.0F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2636F, -5.4156F, 4.702F, 1.4668F, 0.1274F, 0.0062F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(146, 43).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3474F, -5.7031F, 5.3425F, 1.205F, 0.1274F, 0.0062F));

		PartDefinition cube_r526 = leftFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(120, 45).addBox(-1.7041F, -8.838F, -2.4205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8178F, -5.8531F, -0.4705F, -1.7883F, 0.1274F, 0.0062F));

		PartDefinition cube_r527 = leftFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(125, 127).addBox(-1.7041F, -6.8696F, -3.0253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8178F, -5.8531F, -0.4705F, -1.8755F, 0.1274F, 0.0062F));

		PartDefinition cube_r528 = leftFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(102, 141).addBox(-0.6685F, -0.3327F, -0.9133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 144).addBox(-0.8935F, -0.3327F, -0.9133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, 1.5812F, 0.3521F, -0.0148F));

		PartDefinition cube_r529 = leftFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(125, 144).addBox(-0.9187F, -0.2242F, 0.1908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, -0.8012F, 0.3521F, -0.0148F));

		PartDefinition cube_r530 = leftFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(145, 47).addBox(-0.9187F, 0.0835F, -0.5563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, 1.2932F, 0.3521F, -0.0148F));

		PartDefinition cube_r531 = leftFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(105, 144).addBox(-0.973F, 1.6747F, -2.1775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, 0.6874F, 0.3233F, -0.0553F));

		PartDefinition cube_r532 = leftFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(25, 144).addBox(-0.973F, 1.7705F, -0.8222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, 0.0329F, 0.3233F, -0.0553F));

		PartDefinition cube_r533 = leftFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(144, 122).addBox(-0.973F, 0.2649F, -3.6822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, 1.3158F, 0.3233F, -0.0553F));

		PartDefinition cube_r534 = leftFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(145, 37).addBox(-0.973F, -3.2118F, -2.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(145, 34).addBox(-0.973F, -3.2118F, -3.0519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, 2.3193F, 0.3233F, -0.0553F));

		PartDefinition cube_r535 = leftFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(145, 140).addBox(-0.973F, -0.9876F, 0.7085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, -2.1313F, 0.3233F, -0.0553F));

		PartDefinition cube_r536 = leftFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(43, 145).addBox(-0.973F, -1.0689F, -3.0998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F))
				.texOffs(145, 40).addBox(-0.973F, -1.0689F, -3.2998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, 1.5339F, 0.3233F, -0.0553F));

		PartDefinition cube_r537 = leftFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(145, 31).addBox(-0.973F, -2.4893F, -0.6374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, 2.7993F, 0.3233F, -0.0553F));

		PartDefinition cube_r538 = leftFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(140, 34).addBox(-0.9187F, -0.4154F, 0.1193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, -1.4644F, 0.3521F, -0.0148F));

		PartDefinition cube_r539 = leftFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(143, 91).addBox(-0.9187F, -0.4522F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0782F, -8.3494F, 11.9323F, -0.426F, 0.3521F, -0.0148F));

		PartDefinition cube_r540 = leftFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(110, 73).addBox(-0.9542F, -5.0625F, 0.071F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.3678F, -2.7031F, 12.5295F, -0.1233F, 0.0313F, -0.0185F));

		PartDefinition cube_r541 = leftFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(97, 109).addBox(-0.9542F, -5.0625F, 0.071F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3678F, -2.7031F, 12.5295F, -0.2106F, 0.0313F, -0.0185F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.4011F, 7.8848F, -15.7879F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(140, 94).mirror().addBox(5.7335F, 5.3151F, 0.3407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(92, 140).mirror().addBox(5.7335F, 5.3151F, 0.7407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 2.8491F, -1.1384F, -0.0631F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(0.8961F, -0.8593F, 0.576F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.4031F, -0.4705F, -0.0903F, -0.0596F, -0.0221F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(145, 16).mirror().addBox(-0.3245F, 0.8293F, 2.708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4848F, -7.7297F, 4.5241F, -2.322F, 0.0533F, -0.5163F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(15, 145).mirror().addBox(-0.3245F, 2.1327F, -0.9053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4848F, -7.7297F, 4.5241F, -1.0567F, 0.0533F, -0.5163F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(145, 13).mirror().addBox(-0.3245F, 1.618F, -1.3022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4848F, -7.7297F, 4.5241F, -0.8821F, 0.0533F, -0.5163F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(145, 0).mirror().addBox(-0.3245F, 0.9541F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4848F, -7.7297F, 4.5241F, -1.1876F, 0.0533F, -0.5163F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(0, 145).mirror().addBox(-0.3245F, 0.2068F, -0.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4848F, -7.7297F, 4.5241F, -0.9258F, 0.0533F, -0.5163F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(140, 144).mirror().addBox(-0.3245F, -0.2595F, -0.694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4848F, -7.7297F, 4.5241F, -1.5192F, 0.0533F, -0.5163F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(135, 144).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5098F, -8.2024F, 4.9535F, -1.1612F, 0.0837F, -0.5175F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(145, 22).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.1402F, -9.266F, 8.2054F, 1.4282F, -0.0198F, -0.5264F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(10, 145).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7859F, -8.6664F, 7.9458F, 0.381F, -0.0198F, -0.5264F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(145, 7).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, -9.0541F, 6.8824F, 1.6027F, -0.0198F, -0.5264F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(131, 72).mirror().addBox(-0.5F, -0.4F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7394F, -8.6323F, 6.7799F, 0.4246F, -0.0198F, -0.5264F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(5, 145).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5687F, -8.3351F, 5.6404F, 1.5591F, -0.0198F, -0.5264F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(74, 125).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.3279F, -9.5964F, 9.4552F, 0.6207F, -0.1134F, -0.4736F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(67, 125).mirror().addBox(-0.3775F, -0.302F, -0.8332F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.0213F, -8.5815F, 10.0415F, 1.8425F, -0.1134F, -0.4736F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(130, 144).mirror().addBox(-0.425F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0634F, -10.0061F, 12.0115F, 1.837F, -0.2373F, -0.4727F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(140, 16).mirror().addBox(-0.45F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.0634F, -10.0061F, 12.0115F, 2.3169F, -0.2373F, -0.4727F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(139, 126).mirror().addBox(0.5032F, 0.8519F, -3.0926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.9295F, -3.0229F, -0.1684F, -0.507F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(111, 120).mirror().addBox(-0.5F, -1.0F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.5802F, -8.3986F, 13.5055F, -1.7952F, -0.2202F, -0.4908F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(131, 68).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9948F, -2.3186F, 17.1993F, 1.7406F, -0.0318F, 0.0201F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(139, 122).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.005F, -2.528F, 17.6532F, 0.6934F, -0.0318F, 0.0201F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(90, 144).mirror().addBox(0.4021F, -1.8522F, -0.5318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.3031F, -1.2705F, -0.4105F, -0.0696F, 0.0352F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(141, 76).mirror().addBox(0.3811F, -2.0041F, -0.1712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.4031F, -0.4705F, -0.323F, -0.075F, 0.007F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(146, 58).mirror().addBox(0.4492F, -0.0624F, 0.0029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.3031F, -1.2705F, 1.6585F, -0.0749F, -0.0075F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(13, 136).mirror().addBox(0.3811F, -2.9357F, 0.7914F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.4031F, -0.4705F, -0.2357F, -0.075F, 0.007F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(57, 99).mirror().addBox(0.3772F, -3.6394F, 1.6579F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.4031F, -0.4705F, -0.0656F, -0.075F, 0.007F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(139, 118).mirror().addBox(0.4463F, -0.0446F, -0.055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -5.2031F, -0.9705F, 0.8551F, -0.0736F, 0.0169F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(135, 9).mirror().addBox(-0.3F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0169F)).mirror(false), PartPose.offsetAndRotation(-0.9989F, -8.829F, 11.4864F, -1.5486F, -0.1745F, -0.0038F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(32, 113).mirror().addBox(0.4361F, 0.3467F, 6.2956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.3407F, -0.075F, -0.0062F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(73, 85).mirror().addBox(0.4361F, -0.2493F, 3.1353F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.2535F, -0.075F, -0.0062F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(0.4611F, -0.3111F, 0.8339F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -6.4031F, 0.2295F, 0.2531F, -0.0744F, 0.013F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(119, 39).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0194F, -7.0682F, 1.305F, 1.8327F, -0.075F, 0.0091F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(53, 141).mirror().addBox(0.3861F, -0.208F, 0.9835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -5.9031F, -0.3705F, 0.5237F, -0.075F, 0.0091F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(48, 141).mirror().addBox(0.3861F, -0.0341F, 0.0047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -5.9031F, -0.3705F, 0.6983F, -0.075F, 0.0091F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(80, 141).mirror().addBox(0.2817F, -1.1373F, -0.4777F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.2031F, -0.6705F, 0.0354F, -0.0747F, -0.01F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(43, 141).mirror().addBox(0.2317F, -0.537F, 0.4902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.2031F, -0.6705F, 0.0877F, -0.0747F, -0.01F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(134, 44).mirror().addBox(0.2317F, -0.1458F, 1.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.2031F, -0.6705F, 0.175F, -0.0747F, -0.01F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(70, 141).mirror().addBox(0.3808F, 0.4717F, 2.3104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.2031F, -0.6705F, 0.2361F, -0.0747F, -0.01F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(75, 141).mirror().addBox(0.3808F, 0.7398F, 3.2183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -3.2031F, -0.6705F, 0.3059F, -0.0747F, -0.01F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(12, 141).mirror().addBox(0.3808F, 1.7751F, 4.1312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(140, 140).mirror().addBox(0.3808F, 2.2751F, 8.7312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(135, 140).mirror().addBox(0.3808F, 2.4751F, 7.5312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(130, 140).mirror().addBox(0.3808F, 2.0751F, 6.3312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 140).mirror().addBox(0.3808F, 1.8751F, 5.1312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -3.2031F, -0.6705F, 0.3495F, -0.0747F, -0.01F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(44, 102).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3201F, -2.5543F, 5.6649F, 0.0703F, -0.0747F, -0.011F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(48, 125).mirror().addBox(-0.5F, -0.675F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3594F, -3.8135F, 6.0699F, -0.1305F, -0.075F, -0.0062F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(86, 28).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6994F, -4.7674F, 9.3351F, 0.0438F, -0.2026F, 0.0241F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(129, 135).mirror().addBox(-0.4432F, 0.627F, 1.5456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.4942F, -0.3117F, 0.0303F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.4432F, 0.2771F, -2.7378F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.276F, -0.3117F, 0.0303F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-0.4432F, -1.7445F, 2.7402F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, -0.1203F, -0.3117F, 0.0303F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(85, 144).mirror().addBox(-0.0197F, -6.2676F, -0.0821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(139, 114).mirror().addBox(-0.0197F, -6.2676F, -1.0821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.7031F, 12.5295F, -0.8208F, -0.0302F, 0.0049F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(132, 126).mirror().addBox(1.7974F, -0.2296F, -5.8793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -1.922F, -0.0694F, -0.3678F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(130, 64).mirror().addBox(-0.6413F, -0.6048F, 0.4218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)).mirror(false), PartPose.offsetAndRotation(-2.1123F, -8.9584F, 14.6347F, -0.8434F, -0.155F, -0.3434F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(127, 114).mirror().addBox(-0.6413F, -0.8113F, -0.2453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.1123F, -8.9584F, 14.6347F, -1.847F, -0.155F, -0.3434F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(118, 124).mirror().addBox(1.9058F, -1.9057F, -5.5883F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -3.2031F, 12.5295F, -1.436F, -0.2419F, -0.3451F));

		PartDefinition cube_r594 = rightFace.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(55, 130).mirror().addBox(-0.0685F, -5.5116F, 0.4477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.7031F, 12.5295F, -0.0013F, -0.0318F, 0.0201F));

		PartDefinition cube_r595 = rightFace.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(124, 105).mirror().addBox(-0.0814F, -6.3474F, -1.7912F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.7031F, 12.5295F, -0.6121F, -0.0318F, 0.0201F));

		PartDefinition cube_r596 = rightFace.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(25, 113).mirror().addBox(-0.0458F, -3.2482F, 2.9389F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.7031F, 12.5295F, 0.3129F, -0.0318F, 0.0201F));

		PartDefinition cube_r597 = rightFace.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(-0.5F, -3.025F, -0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9881F, -2.2998F, 14.6301F, -0.1583F, -0.0318F, 0.0201F));

		PartDefinition cube_r598 = rightFace.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(48, 130).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9917F, -5.9722F, 14.9486F, -1.1401F, -0.0318F, 0.0201F));

		PartDefinition cube_r599 = rightFace.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(68, 145).mirror().addBox(-0.1277F, 1.9634F, 0.9203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.6031F, 12.9295F, 1.5128F, -0.0318F, 0.0201F));

		PartDefinition cube_r600 = rightFace.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(144, 119).mirror().addBox(-0.1277F, 1.2968F, 2.0864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.6031F, 12.9295F, 1.0765F, -0.0318F, 0.0201F));

		PartDefinition cube_r601 = rightFace.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(145, 131).mirror().addBox(-0.1277F, -1.2244F, 2.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.6031F, 12.9295F, 0.3784F, -0.0318F, 0.0201F));

		PartDefinition cube_r602 = rightFace.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(144, 116).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0434F, -5.1537F, 16.0566F, -0.887F, -0.0318F, 0.0201F));

		PartDefinition cube_r603 = rightFace.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(131, 104).mirror().addBox(-0.1264F, 1.457F, 0.949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.6031F, 12.9295F, 1.5041F, -0.0318F, 0.0201F));

		PartDefinition cube_r604 = rightFace.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(140, 107).mirror().addBox(-0.1067F, -2.5628F, -1.0487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.6031F, 12.9295F, -1.0965F, -0.0318F, 0.0201F));

		PartDefinition cube_r605 = rightFace.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(144, 65).mirror().addBox(-0.5F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9629F, -6.9918F, 14.7991F, 0.3347F, -0.0318F, 0.0201F));

		PartDefinition cube_r606 = rightFace.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(130, 5).mirror().addBox(-0.5F, -0.45F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9683F, -5.6223F, 14.1014F, -1.6288F, -0.0318F, 0.0201F));

		PartDefinition cube_r607 = rightFace.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(58, 144).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9521F, -6.6139F, 14.2199F, -0.9743F, -0.0318F, 0.0201F));

		PartDefinition cube_r608 = rightFace.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(139, 110).mirror().addBox(-0.1242F, -4.8586F, 0.0935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.6031F, 12.9295F, -0.2761F, -0.0318F, 0.0201F));

		PartDefinition cube_r609 = rightFace.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(65, 141).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9893F, -4.2147F, 13.8722F, 2.1019F, -0.0318F, 0.0201F));

		PartDefinition cube_r610 = rightFace.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(146, 76).mirror().addBox(0.1713F, 0.1051F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8428F, -6.4031F, 0.2295F, 0.8827F, -0.0656F, -0.0252F));

		PartDefinition cube_r611 = rightFace.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(146, 82).mirror().addBox(0.1746F, -0.0416F, -1.1455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8428F, -6.4031F, 0.2295F, 2.065F, -0.0628F, -0.0268F));

		PartDefinition cube_r612 = rightFace.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(146, 88).mirror().addBox(0.1746F, 0.3265F, 0.7946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false)
				.texOffs(146, 85).mirror().addBox(0.1746F, 0.3265F, 0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.8428F, -6.4031F, 0.2295F, 0.7473F, -0.0628F, -0.0268F));

		PartDefinition cube_r613 = rightFace.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(121, 16).mirror().addBox(0.1713F, -0.9014F, -1.9366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8428F, -6.4031F, 0.2295F, -2.6516F, -0.0656F, -0.0252F));

		PartDefinition cube_r614 = rightFace.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(146, 79).mirror().addBox(0.1713F, 0.2774F, -0.949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.8428F, -6.4031F, 0.2295F, 2.1044F, -0.0656F, -0.0252F));

		PartDefinition cube_r615 = rightFace.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(145, 25).mirror().addBox(0.7041F, 8.7483F, -0.6338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.8178F, -5.8531F, -0.4705F, 1.4755F, -0.1274F, -0.0062F));

		PartDefinition cube_r616 = rightFace.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(48, 145).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.8423F, -4.2997F, 9.2746F, 2.4616F, -0.1274F, -0.0062F));

		PartDefinition cube_r617 = rightFace.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(104, 118).mirror().addBox(-0.5F, -1.2F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8365F, -6.4612F, 9.1237F, 2.959F, -0.1274F, -0.0062F));

		PartDefinition cube_r618 = rightFace.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(144, 125).mirror().addBox(0.7041F, 9.4475F, 0.6534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 1.6413F, -0.1274F, -0.0062F));

		PartDefinition cube_r619 = rightFace.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(145, 10).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9078F, -8.7656F, 9.5687F, 2.9503F, -0.1274F, -0.0062F));

		PartDefinition cube_r620 = rightFace.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(29, 127).mirror().addBox(0.7041F, 9.1475F, 0.2034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8178F, -5.8531F, -0.4705F, 1.6413F, -0.1274F, -0.0062F));

		PartDefinition cube_r621 = rightFace.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(140, 30).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6531F, -8.5164F, 7.5922F, -2.7395F, -0.1274F, -0.0062F));

		PartDefinition cube_r622 = rightFace.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(114, 6).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7791F, -8.6986F, 8.5674F, -1.3868F, -0.1274F, -0.0062F));

		PartDefinition cube_r623 = rightFace.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(131, 90).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4807F, -7.8998F, 6.3234F, -1.1076F, -0.1274F, -0.0062F));

		PartDefinition cube_r624 = rightFace.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(140, 26).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3749F, -7.305F, 5.5264F, -2.5038F, -0.1274F, -0.0062F));

		PartDefinition cube_r625 = rightFace.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(15, 132).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3773F, -6.5979F, 5.5327F, 2.3831F, -0.1274F, -0.0062F));

		PartDefinition cube_r626 = rightFace.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(145, 143).mirror().addBox(-0.5F, 0.0F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2636F, -5.4156F, 4.702F, 1.4668F, -0.1274F, -0.0062F));

		PartDefinition cube_r627 = rightFace.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(146, 43).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3474F, -5.7031F, 5.3425F, 1.205F, -0.1274F, -0.0062F));

		PartDefinition cube_r628 = rightFace.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(120, 45).mirror().addBox(0.7041F, -8.838F, -2.4205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8178F, -5.8531F, -0.4705F, -1.7883F, -0.1274F, -0.0062F));

		PartDefinition cube_r629 = rightFace.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(125, 127).mirror().addBox(0.7041F, -6.8696F, -3.0253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8178F, -5.8531F, -0.4705F, -1.8755F, -0.1274F, -0.0062F));

		PartDefinition cube_r630 = rightFace.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(102, 141).mirror().addBox(-0.3315F, -0.3327F, -0.9133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(34, 144).mirror().addBox(-0.1065F, -0.3327F, -0.9133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, 1.5812F, -0.3521F, 0.0148F));

		PartDefinition cube_r631 = rightFace.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(125, 144).mirror().addBox(-0.0813F, -0.2242F, 0.1908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, -0.8012F, -0.3521F, 0.0148F));

		PartDefinition cube_r632 = rightFace.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(145, 47).mirror().addBox(-0.0813F, 0.0835F, -0.5563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, 1.2932F, -0.3521F, 0.0148F));

		PartDefinition cube_r633 = rightFace.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(105, 144).mirror().addBox(-0.027F, 1.6747F, -2.1775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, 0.6874F, -0.3233F, 0.0553F));

		PartDefinition cube_r634 = rightFace.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(25, 144).mirror().addBox(-0.027F, 1.7705F, -0.8222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, 0.0329F, -0.3233F, 0.0553F));

		PartDefinition cube_r635 = rightFace.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(144, 122).mirror().addBox(-0.027F, 0.2649F, -3.6822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, 1.3158F, -0.3233F, 0.0553F));

		PartDefinition cube_r636 = rightFace.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(145, 37).mirror().addBox(-0.027F, -3.2118F, -2.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(145, 34).mirror().addBox(-0.027F, -3.2118F, -3.0519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, 2.3193F, -0.3233F, 0.0553F));

		PartDefinition cube_r637 = rightFace.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(145, 140).mirror().addBox(-0.027F, -0.9876F, 0.7085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, -2.1313F, -0.3233F, 0.0553F));

		PartDefinition cube_r638 = rightFace.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(43, 145).mirror().addBox(-0.027F, -1.0689F, -3.0998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(145, 40).mirror().addBox(-0.027F, -1.0689F, -3.2998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, 1.5339F, -0.3233F, 0.0553F));

		PartDefinition cube_r639 = rightFace.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(145, 31).mirror().addBox(-0.027F, -2.4893F, -0.6374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, 2.7993F, -0.3233F, 0.0553F));

		PartDefinition cube_r640 = rightFace.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(140, 34).mirror().addBox(-0.0813F, -0.4154F, 0.1193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, -1.4644F, -0.3521F, 0.0148F));

		PartDefinition cube_r641 = rightFace.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(143, 91).mirror().addBox(-0.0813F, -0.4522F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0782F, -8.3494F, 11.9323F, -0.426F, -0.3521F, 0.0148F));

		PartDefinition cube_r642 = rightFace.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(110, 73).mirror().addBox(-0.0458F, -5.0625F, 0.071F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.7031F, 12.5295F, -0.1233F, -0.0313F, 0.0185F));

		PartDefinition cube_r643 = rightFace.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(97, 109).mirror().addBox(-0.0458F, -5.0625F, 0.071F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3678F, -2.7031F, 12.5295F, -0.2106F, -0.0313F, 0.0185F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6486F, 1.6875F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(133, 0).mirror().addBox(-0.4F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, -0.0343F, -0.0523F, -0.0349F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(7, 141).mirror().addBox(-0.4F, 0.3423F, -3.0261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, -0.3223F, -0.0523F, -0.0349F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(100, 144).mirror().addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2202F, -0.4196F, -2.0279F, 0.8995F, -0.0523F, -0.0349F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(109, 130).mirror().addBox(-0.4F, 2.9115F, -0.4276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, -1.6313F, -0.0523F, -0.0349F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(18, 136).mirror().addBox(-1.0761F, -0.7823F, -4.6919F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, 0.02F, -0.2268F, -0.0703F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(117, 73).mirror().addBox(-1.3011F, 1.8955F, -8.472F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, 0.0723F, -0.2268F, -0.0703F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(92, 117).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9722F, -0.9177F, -4.6869F, 0.2119F, -0.2268F, -0.0703F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(41, 120).mirror().addBox(-0.5621F, -1.0896F, -1.5159F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, 0.2113F, -0.1395F, -0.0701F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(101, 13).mirror().addBox(-0.4F, -0.0077F, -2.9603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, 0.2275F, -0.0523F, -0.0349F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(101, 36).mirror().addBox(-0.4F, 0.155F, -3.1302F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, 0.3933F, -0.0523F, -0.0349F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(17, 141).mirror().addBox(-0.4F, -0.7647F, -4.3058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, 0.4544F, -0.0523F, -0.0349F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(133, 14).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0746F, 2.7224F, -3.1361F, 1.9747F, -0.2268F, -0.0703F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(131, 131).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8457F, 3.0921F, -4.0127F, 1.8787F, -0.2268F, -0.0703F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(41, 126).mirror().addBox(-0.5519F, 0.9335F, 1.1834F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.8007F, -0.1226F, -0.0686F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(136, 80).mirror().addBox(-0.2447F, 6.0446F, 1.5601F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.6954F, -0.07F, -0.0695F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(27, 135).mirror().addBox(-0.2447F, 7.1927F, 0.5626F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.5645F, -0.07F, -0.0695F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(137, 62).mirror().addBox(-0.2447F, 9.678F, 0.7706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.643F, -0.07F, -0.0695F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(107, 141).mirror().addBox(-0.2447F, -0.9725F, 10.7574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0179F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -3.0829F, -0.07F, -0.0695F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(0, 142).mirror().addBox(-0.2447F, -2.2692F, 9.9908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, 3.0781F, -0.07F, -0.0695F));

		PartDefinition cube_r663 = jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(110, 81).mirror().addBox(-0.2447F, 0.159F, 9.3082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -2.9957F, -0.07F, -0.0695F));

		PartDefinition cube_r664 = jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(137, 4).mirror().addBox(-0.2447F, 8.0647F, 0.5951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.6256F, -0.07F, -0.0695F));

		PartDefinition cube_r665 = jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(39, 135).mirror().addBox(-0.2447F, 5.7224F, -0.7524F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.4685F, -0.07F, -0.0695F));

		PartDefinition cube_r666 = jaw.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(132, 58).mirror().addBox(-0.2447F, 5.5259F, -1.5479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 128).mirror().addBox(-0.2447F, 6.5259F, -1.4479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 114).mirror().addBox(-0.3189F, 4.3175F, -1.3552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.5034F, -0.07F, -0.0695F));

		PartDefinition cube_r667 = jaw.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(27, 131).mirror().addBox(-0.2447F, 8.4768F, -0.1016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 131).mirror().addBox(-0.2447F, 9.4768F, -0.0516F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(131, 48).mirror().addBox(-0.2447F, 10.4768F, 0.0484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.6779F, -0.07F, -0.0695F));

		PartDefinition cube_r668 = jaw.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(131, 52).mirror().addBox(-0.2447F, 7.534F, -1.063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.5907F, -0.07F, -0.0695F));

		PartDefinition cube_r669 = jaw.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(119, 28).mirror().addBox(-0.5707F, 2.9248F, 1.1224F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.7876F, -0.1226F, -0.0686F));

		PartDefinition cube_r670 = jaw.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(135, 27).mirror().addBox(-0.5707F, 2.7684F, -1.1495F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.3949F, -0.1226F, -0.0686F));

		PartDefinition cube_r671 = jaw.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(100, 48).mirror().addBox(-0.5707F, 0.0427F, -6.8138F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, 0.0712F, -0.1226F, -0.0686F));

		PartDefinition cube_r672 = jaw.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(120, 112).mirror().addBox(-0.5519F, -3.1774F, -1.0669F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, 1.6856F, -0.1226F, -0.0686F));

		PartDefinition cube_r673 = jaw.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(133, 18).mirror().addBox(-0.4F, 2.4916F, -1.0136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, -1.0466F, -0.0523F, -0.0349F));

		PartDefinition cube_r674 = jaw.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(126, 100).mirror().addBox(-0.4F, -0.597F, 0.7234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.4204F, -0.1873F, 0.0341F, -2.469F, -0.0523F, -0.0349F));

		PartDefinition cube_r675 = jaw.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(123, 5).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r676 = jaw.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(55, 125).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r677 = jaw.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(126, 39).mirror().addBox(-0.5519F, -0.6855F, 1.0459F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2612F, 0.4818F, -7.0573F, -1.6785F, -0.1226F, -0.0686F));

		PartDefinition cube_r678 = jaw.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(53, 145).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6107F, 3.3794F, -4.9412F, -2.9646F, -0.2268F, -0.0703F));

		PartDefinition cube_r679 = jaw.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(77, 100).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3775F, 3.5395F, -5.9004F, -1.5247F, -0.2268F, -0.0703F));

		PartDefinition cube_r680 = jaw.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(63, 145).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4912F, -0.2347F, -6.5578F, -1.2629F, -0.2268F, -0.0703F));

		PartDefinition cube_r681 = jaw.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(132, 118).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3615F, 2.6495F, -7.2408F, 0.3341F, -0.2268F, -0.0703F));

		PartDefinition cube_r682 = jaw.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(132, 122).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.714F, 2.1812F, -5.86F, 0.7268F, -0.2268F, -0.0703F));

		PartDefinition cube_r683 = jaw.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(145, 106).mirror().addBox(-0.5F, -1.0F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 145).mirror().addBox(-0.5F, -1.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.7034F, 2.5899F, -5.7813F, -1.1931F, -0.2268F, -0.0703F));

		PartDefinition cube_r684 = jaw.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(145, 128).mirror().addBox(-0.5F, -0.35F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(78, 145).mirror().addBox(-0.5F, -0.95F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.9512F, 1.6649F, -4.9916F, -1.3676F, -0.2268F, -0.0703F));

		PartDefinition cube_r685 = jaw.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(145, 94).mirror().addBox(-0.5F, -0.35F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.0577F, 1.5322F, -4.572F, -0.9749F, -0.2268F, -0.0703F));

		PartDefinition cube_r686 = jaw.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(55, 125).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r687 = jaw.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(123, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r688 = jaw.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(126, 100).addBox(-0.6F, -0.597F, 0.7234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, -2.469F, 0.0523F, 0.0349F));

		PartDefinition cube_r689 = jaw.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(133, 18).addBox(-0.6F, 2.4916F, -1.0136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, -1.0466F, 0.0523F, 0.0349F));

		PartDefinition cube_r690 = jaw.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(120, 112).addBox(-0.4481F, -3.1774F, -1.0669F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, 1.6856F, 0.1226F, 0.0686F));

		PartDefinition cube_r691 = jaw.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(100, 48).addBox(-0.4293F, 0.0427F, -6.8138F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, 0.0712F, 0.1226F, 0.0686F));

		PartDefinition cube_r692 = jaw.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(135, 27).addBox(-0.4293F, 2.7684F, -1.1495F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.3949F, 0.1226F, 0.0686F));

		PartDefinition cube_r693 = jaw.addOrReplaceChild("cube_r693", CubeListBuilder.create().texOffs(119, 28).addBox(-0.4293F, 2.9248F, 1.1224F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.7876F, 0.1226F, 0.0686F));

		PartDefinition cube_r694 = jaw.addOrReplaceChild("cube_r694", CubeListBuilder.create().texOffs(131, 52).addBox(-0.7553F, 7.534F, -1.063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.5907F, 0.07F, 0.0695F));

		PartDefinition cube_r695 = jaw.addOrReplaceChild("cube_r695", CubeListBuilder.create().texOffs(131, 48).addBox(-0.7553F, 10.4768F, 0.0484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 131).addBox(-0.7553F, 9.4768F, -0.0516F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(27, 131).addBox(-0.7553F, 8.4768F, -0.1016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.6779F, 0.07F, 0.0695F));

		PartDefinition cube_r696 = jaw.addOrReplaceChild("cube_r696", CubeListBuilder.create().texOffs(10, 128).addBox(-0.7553F, 6.5259F, -1.4479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 114).addBox(-0.6811F, 4.3175F, -1.3552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 58).addBox(-0.7553F, 5.5259F, -1.5479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.5034F, 0.07F, 0.0695F));

		PartDefinition cube_r697 = jaw.addOrReplaceChild("cube_r697", CubeListBuilder.create().texOffs(39, 135).addBox(-0.7553F, 5.7224F, -0.7524F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.4685F, 0.07F, 0.0695F));

		PartDefinition cube_r698 = jaw.addOrReplaceChild("cube_r698", CubeListBuilder.create().texOffs(137, 4).addBox(-0.7553F, 8.0647F, 0.5951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.6256F, 0.07F, 0.0695F));

		PartDefinition cube_r699 = jaw.addOrReplaceChild("cube_r699", CubeListBuilder.create().texOffs(110, 81).addBox(-0.7553F, 0.159F, 9.3082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -2.9957F, 0.07F, 0.0695F));

		PartDefinition cube_r700 = jaw.addOrReplaceChild("cube_r700", CubeListBuilder.create().texOffs(0, 142).addBox(-0.7553F, -2.2692F, 9.9908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, 3.0781F, 0.07F, 0.0695F));

		PartDefinition cube_r701 = jaw.addOrReplaceChild("cube_r701", CubeListBuilder.create().texOffs(107, 141).addBox(-0.7553F, -0.9725F, 10.7574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0179F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -3.0829F, 0.07F, 0.0695F));

		PartDefinition cube_r702 = jaw.addOrReplaceChild("cube_r702", CubeListBuilder.create().texOffs(137, 62).addBox(-0.7553F, 9.678F, 0.7706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.643F, 0.07F, 0.0695F));

		PartDefinition cube_r703 = jaw.addOrReplaceChild("cube_r703", CubeListBuilder.create().texOffs(27, 135).addBox(-0.7553F, 7.1927F, 0.5626F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.5645F, 0.07F, 0.0695F));

		PartDefinition cube_r704 = jaw.addOrReplaceChild("cube_r704", CubeListBuilder.create().texOffs(136, 80).addBox(-0.7553F, 6.0446F, 1.5601F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.6954F, 0.07F, 0.0695F));

		PartDefinition cube_r705 = jaw.addOrReplaceChild("cube_r705", CubeListBuilder.create().texOffs(126, 39).addBox(-0.4481F, -0.6855F, 1.0459F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.6785F, 0.1226F, 0.0686F));

		PartDefinition cube_r706 = jaw.addOrReplaceChild("cube_r706", CubeListBuilder.create().texOffs(41, 126).addBox(-0.4481F, 0.9335F, 1.1834F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, -1.8007F, 0.1226F, 0.0686F));

		PartDefinition cube_r707 = jaw.addOrReplaceChild("cube_r707", CubeListBuilder.create().texOffs(63, 145).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4912F, -0.2347F, -6.5578F, -1.2629F, 0.2268F, 0.0703F));

		PartDefinition cube_r708 = jaw.addOrReplaceChild("cube_r708", CubeListBuilder.create().texOffs(77, 100).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3775F, 3.5395F, -5.9004F, -1.5247F, 0.2268F, 0.0703F));

		PartDefinition cube_r709 = jaw.addOrReplaceChild("cube_r709", CubeListBuilder.create().texOffs(53, 145).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6107F, 3.3794F, -4.9412F, -2.9646F, 0.2268F, 0.0703F));

		PartDefinition cube_r710 = jaw.addOrReplaceChild("cube_r710", CubeListBuilder.create().texOffs(131, 131).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8457F, 3.0921F, -4.0127F, 1.8787F, 0.2268F, 0.0703F));

		PartDefinition cube_r711 = jaw.addOrReplaceChild("cube_r711", CubeListBuilder.create().texOffs(133, 14).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0746F, 2.7224F, -3.1361F, 1.9747F, 0.2268F, 0.0703F));

		PartDefinition cube_r712 = jaw.addOrReplaceChild("cube_r712", CubeListBuilder.create().texOffs(17, 141).addBox(-0.6F, -0.7647F, -4.3058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, 0.4544F, 0.0523F, 0.0349F));

		PartDefinition cube_r713 = jaw.addOrReplaceChild("cube_r713", CubeListBuilder.create().texOffs(101, 36).addBox(-0.6F, 0.155F, -3.1302F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, 0.3933F, 0.0523F, 0.0349F));

		PartDefinition cube_r714 = jaw.addOrReplaceChild("cube_r714", CubeListBuilder.create().texOffs(101, 13).addBox(-0.6F, -0.0077F, -2.9603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, 0.2275F, 0.0523F, 0.0349F));

		PartDefinition cube_r715 = jaw.addOrReplaceChild("cube_r715", CubeListBuilder.create().texOffs(41, 120).addBox(-0.4378F, -1.0896F, -1.5159F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2612F, 0.4818F, -7.0573F, 0.2113F, 0.1395F, 0.0701F));

		PartDefinition cube_r716 = jaw.addOrReplaceChild("cube_r716", CubeListBuilder.create().texOffs(92, 117).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9722F, -0.9177F, -4.6869F, 0.2119F, 0.2268F, 0.0703F));

		PartDefinition cube_r717 = jaw.addOrReplaceChild("cube_r717", CubeListBuilder.create().texOffs(132, 122).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.714F, 2.1812F, -5.86F, 0.7268F, 0.2268F, 0.0703F));

		PartDefinition cube_r718 = jaw.addOrReplaceChild("cube_r718", CubeListBuilder.create().texOffs(132, 118).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.3615F, 2.6495F, -7.2408F, 0.3341F, 0.2268F, 0.0703F));

		PartDefinition cube_r719 = jaw.addOrReplaceChild("cube_r719", CubeListBuilder.create().texOffs(145, 94).addBox(-0.5F, -0.35F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.0577F, 1.5322F, -4.572F, -0.9749F, 0.2268F, 0.0703F));

		PartDefinition cube_r720 = jaw.addOrReplaceChild("cube_r720", CubeListBuilder.create().texOffs(78, 145).addBox(-0.5F, -0.95F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(145, 128).addBox(-0.5F, -0.35F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9512F, 1.6649F, -4.9916F, -1.3676F, 0.2268F, 0.0703F));

		PartDefinition cube_r721 = jaw.addOrReplaceChild("cube_r721", CubeListBuilder.create().texOffs(73, 145).addBox(-0.5F, -1.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(145, 106).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7034F, 2.5899F, -5.7813F, -1.1931F, 0.2268F, 0.0703F));

		PartDefinition cube_r722 = jaw.addOrReplaceChild("cube_r722", CubeListBuilder.create().texOffs(117, 73).addBox(0.3011F, 1.8955F, -8.472F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, 0.0723F, 0.2268F, 0.0703F));

		PartDefinition cube_r723 = jaw.addOrReplaceChild("cube_r723", CubeListBuilder.create().texOffs(18, 136).addBox(0.0761F, -0.7823F, -4.6919F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, 0.02F, 0.2268F, 0.0703F));

		PartDefinition cube_r724 = jaw.addOrReplaceChild("cube_r724", CubeListBuilder.create().texOffs(109, 130).addBox(-0.6F, 2.9115F, -0.4276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, -1.6313F, 0.0523F, 0.0349F));

		PartDefinition cube_r725 = jaw.addOrReplaceChild("cube_r725", CubeListBuilder.create().texOffs(100, 144).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2202F, -0.4196F, -2.0279F, 0.8995F, 0.0523F, 0.0349F));

		PartDefinition cube_r726 = jaw.addOrReplaceChild("cube_r726", CubeListBuilder.create().texOffs(7, 141).addBox(-0.6F, 0.3423F, -3.0261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, -0.3223F, 0.0523F, 0.0349F));

		PartDefinition cube_r727 = jaw.addOrReplaceChild("cube_r727", CubeListBuilder.create().texOffs(133, 0).addBox(-0.6F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4204F, -0.1873F, 0.0341F, -0.0343F, 0.0523F, 0.0349F));

		return LayerDefinition.create(meshdefinition, 153, 153);
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