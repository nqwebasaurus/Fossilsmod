package fossils.fossils.client.blockentity.model.agapornis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AgapornisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart leftFoot4;
	private final ModelPart leftToes4;
	private final ModelPart leftFoot2;
	private final ModelPart leftToes2;
	private final ModelPart leftFoot3;
	private final ModelPart leftToes3;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart rightFoot4;
	private final ModelPart rightToes4;
	private final ModelPart rightFoot2;
	private final ModelPart rightToes2;
	private final ModelPart rightFoot3;
	private final ModelPart rightToes3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck10;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart beak;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart kineticMaxillae;
	private final ModelPart kineticMaxillae2;
	private final ModelPart kineticMaxillae3;
	private final ModelPart kineticMaxillae4;
	private final ModelPart kineticMaxillae5;
	private final ModelPart kineticMaxillae6;
	private final ModelPart jaw;

	public AgapornisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.leftFoot4 = this.leftLeg3.getChild("leftFoot4");
		this.leftToes4 = this.leftFoot4.getChild("leftToes4");
		this.leftFoot2 = this.leftLeg3.getChild("leftFoot2");
		this.leftToes2 = this.leftFoot2.getChild("leftToes2");
		this.leftFoot3 = this.leftLeg3.getChild("leftFoot3");
		this.leftToes3 = this.leftFoot3.getChild("leftToes3");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.rightFoot4 = this.rightLeg3.getChild("rightFoot4");
		this.rightToes4 = this.rightFoot4.getChild("rightToes4");
		this.rightFoot2 = this.rightLeg3.getChild("rightFoot2");
		this.rightToes2 = this.rightFoot2.getChild("rightToes2");
		this.rightFoot3 = this.rightLeg3.getChild("rightFoot3");
		this.rightToes3 = this.rightFoot3.getChild("rightToes3");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail2.getChild("tail4");
		this.tail5 = this.tail2.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck10 = this.neck5.getChild("neck10");
		this.neck4 = this.neck10.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.beak = this.head.getChild("beak");
		this.leftBeak = this.beak.getChild("leftBeak");
		this.rightBeak = this.beak.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.kineticMaxillae = this.head.getChild("kineticMaxillae");
		this.kineticMaxillae2 = this.kineticMaxillae.getChild("kineticMaxillae2");
		this.kineticMaxillae3 = this.kineticMaxillae.getChild("kineticMaxillae3");
		this.kineticMaxillae4 = this.head.getChild("kineticMaxillae4");
		this.kineticMaxillae5 = this.kineticMaxillae4.getChild("kineticMaxillae5");
		this.kineticMaxillae6 = this.kineticMaxillae4.getChild("kineticMaxillae6");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -30.7571F, 5.2609F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 5).addBox(-0.5F, -0.0479F, -0.0075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.5436F, 3.6286F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(108, 105).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.002F, 3.9188F, 4.6267F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(108, 101).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.002F, 2.7012F, 3.04F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(112, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7896F, -1.8565F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, 0.175F, -6.05F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.5812F, 3.1705F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.9801F, 0.3415F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, 1.774F, -4.5424F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(101, 105).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2797F, 2.2093F, 8.5651F, -0.8723F, -0.8127F, 1.3543F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(11, 70).addBox(-0.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1464F, 0.7858F, 6.5143F, -1.1162F, -0.962F, 1.6642F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 59).addBox(-4.1F, 0.3F, -0.075F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4818F, 3.0218F, 8.5122F, -0.9169F, -0.9203F, 1.2303F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(83, 51).addBox(-1.3397F, -0.9869F, 1.2129F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9947F, -0.374F, 1.6081F, -1.209F, -0.9045F, 1.6381F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(110, 41).addBox(-0.4018F, -0.9869F, 0.762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9947F, -0.374F, 1.6081F, -2.0102F, -0.8779F, 2.6351F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(83, 37).addBox(-0.154F, -0.9869F, -0.1525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9947F, -0.374F, 1.6081F, -2.2745F, -0.7104F, 3.0023F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 29).addBox(0.0544F, -0.9935F, -0.2196F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9947F, -0.374F, 1.6081F, -1.0909F, -0.9971F, 1.5759F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 116).addBox(-0.1F, -0.5F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9065F, 4.3127F, 9.8055F, -1.0595F, 0.6241F, -0.1993F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 80).addBox(-0.875F, -1.1F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9065F, 4.5127F, 9.1055F, -1.6409F, 0.7816F, -1.1041F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(59, 118).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0919F, 5.808F, 10.9895F, -1.0776F, 0.3917F, -0.2357F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(117, 15).addBox(0.1735F, -0.4689F, -0.1188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9657F, 4.4825F, 9.5698F, -0.9646F, 0.1371F, 0.1874F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(106, 4).addBox(-0.5F, -1.5F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(20, 77).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9154F, 3.5823F, 5.0198F, -0.9195F, 0.3286F, -0.0508F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(96, 67).addBox(-0.525F, -1.1F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2507F, 3.3685F, 6.0658F, -0.8137F, 0.3136F, 0.0405F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 105).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3293F, 9.3689F, 9.6194F, -1.267F, 0.0217F, 0.3683F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(105, 14).addBox(-0.8F, -0.7721F, 1.3998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6965F, 7.1867F, 7.2384F, -0.9236F, 0.0632F, 0.2348F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(105, 10).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6965F, 7.1867F, 7.2384F, -0.941F, 0.0632F, 0.2348F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 105).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5872F, 5.8663F, 6.3415F, -0.9633F, 0.19F, 0.048F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(49, 102).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.549F, 4.3449F, 5.7637F, -1.0156F, 0.19F, 0.048F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(84, 112).addBox(-0.5F, -1.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1673F, 7.9853F, 9.5348F, -2.6435F, 0.0467F, 0.147F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.2908F, 7.4089F, 10.3425F, -1.3432F, 0.0467F, 0.147F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(118, 48).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2494F, 7.2618F, 9.0059F, -0.9418F, 0.0467F, 0.147F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(115, 97).addBox(-1.0F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 64).addBox(-1.0F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.0205F, 4.9083F, 7.2406F, -0.8817F, 0.1817F, -0.0143F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(64, 118).addBox(-0.5F, -1.8F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(88, 0).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2494F, 7.2618F, 9.0059F, -0.9505F, 0.0467F, 0.147F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(117, 12).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.092F, 4.1647F, 5.9637F, -1.1101F, 0.1421F, 0.0125F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(76, 72).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2699F, 3.5858F, 8.8876F, -0.6994F, 0.1001F, 0.2726F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(63, 98).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.734F, 8.6864F, -0.6895F, -0.3613F, -0.5584F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(112, 14).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3542F, -2.0377F, 2.7792F, -0.3753F, -0.3613F, -0.5584F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(65, 62).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3967F, 0.2397F, 6.0673F, -0.4975F, -0.3613F, -0.5584F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(16, 83).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.8629F, 7.4653F, -0.515F, -0.3613F, -0.5584F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.774F, -4.5424F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(101, 105).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2797F, 2.2093F, 8.5651F, -0.8723F, 0.8127F, -1.3543F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(11, 70).mirror().addBox(-2.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1464F, 0.7858F, 6.5143F, -1.1162F, 0.962F, -1.6642F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(0.1F, 0.3F, -0.075F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4818F, 3.0218F, 8.5122F, -0.9169F, 0.9203F, -1.2303F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(83, 51).mirror().addBox(-0.6603F, -0.9869F, 1.2129F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9947F, -0.374F, 1.6081F, -1.209F, 0.9045F, -1.6381F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(110, 41).mirror().addBox(-1.5982F, -0.9869F, 0.762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9947F, -0.374F, 1.6081F, -2.0102F, 0.8779F, -2.6351F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-1.846F, -0.9869F, -0.1525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9947F, -0.374F, 1.6081F, -2.2745F, 0.7104F, -3.0023F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(53, 29).mirror().addBox(-5.0544F, -0.9935F, -0.2196F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9947F, -0.374F, 1.6081F, -1.0909F, 0.9971F, -1.5759F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(81, 116).mirror().addBox(-0.9F, -0.5F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9065F, 4.3127F, 9.8055F, -1.0595F, -0.6241F, 0.1993F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-1.125F, -1.1F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9065F, 4.5127F, 9.1055F, -1.6409F, -0.7816F, 1.1041F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(59, 118).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0919F, 5.808F, 10.9895F, -1.0776F, -0.3917F, 0.2357F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(117, 15).mirror().addBox(-1.1735F, -0.4689F, -0.1188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.4825F, 9.5698F, -0.9646F, -0.1371F, -0.1874F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(106, 4).mirror().addBox(-0.5F, -1.5F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(20, 77).mirror().addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9154F, 3.5823F, 5.0198F, -0.9195F, -0.3286F, 0.0508F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(96, 67).mirror().addBox(-0.475F, -1.1F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2507F, 3.3685F, 6.0658F, -0.8137F, -0.3136F, -0.0405F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(36, 105).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3293F, 9.3689F, 9.6194F, -1.267F, -0.0217F, -0.3683F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(105, 14).mirror().addBox(-0.2F, -0.7721F, 1.3998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6965F, 7.1867F, 7.2384F, -0.9236F, -0.0632F, -0.2348F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(105, 10).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6965F, 7.1867F, 7.2384F, -0.941F, -0.0632F, -0.2348F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(7, 105).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5872F, 5.8663F, 6.3415F, -0.9633F, -0.19F, -0.048F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.549F, 4.3449F, 5.7637F, -1.0156F, -0.19F, -0.048F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(84, 112).mirror().addBox(-0.5F, -1.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1673F, 7.9853F, 9.5348F, -2.6435F, -0.0467F, -0.147F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2908F, 7.4089F, 10.3425F, -1.3432F, -0.0467F, -0.147F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(118, 48).mirror().addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2494F, 7.2618F, 9.0059F, -0.9418F, -0.0467F, -0.147F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(115, 97).mirror().addBox(0.0F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 64).mirror().addBox(0.0F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0205F, 4.9083F, 7.2406F, -0.8817F, -0.1817F, 0.0143F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(64, 118).mirror().addBox(-0.5F, -1.8F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(88, 0).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2494F, 7.2618F, 9.0059F, -0.9505F, -0.0467F, -0.147F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(117, 12).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.092F, 4.1647F, 5.9637F, -1.1101F, -0.1421F, -0.0125F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(76, 72).mirror().addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2699F, 3.5858F, 8.8876F, -0.6994F, -0.1001F, -0.2726F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(63, 98).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.734F, 8.6864F, -0.6895F, 0.3613F, 0.5584F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(112, 14).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3542F, -2.0377F, 2.7792F, -0.3753F, 0.3613F, 0.5584F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3967F, 0.2397F, 6.0673F, -0.4975F, 0.3613F, 0.5584F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(16, 83).mirror().addBox(0.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8629F, 7.4653F, -0.515F, 0.3613F, 0.5584F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9045F, 3.8744F, 0.8937F, -1.4645F, -0.2768F, -0.0071F));

		PartDefinition cube_r65 = leftLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(117, 22).addBox(-1.2F, -0.667F, -1.0746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 117).addBox(0.2F, -0.667F, -1.0746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.1684F, 2.1304F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(115, 106).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.0578F, 1.6916F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(115, 61).addBox(-0.5F, -0.2F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 8.871F, 1.4307F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(14, 103).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -0.1573F, 0.3585F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(104, 116).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 8.7391F, 0.5176F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(70, 105).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 6.8029F, 0.0169F, 1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(78, 89).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.8285F, -0.3747F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(94, 102).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 2.8164F, -0.1186F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(56, 87).addBox(-3.5F, 0.35F, -1.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.0F, 1.0342F, -0.8779F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(115, 87).addBox(-3.5F, 0.125F, -1.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.0F, -0.5507F, -1.0515F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(120, 63).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -1.2035F, -0.6636F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(120, 60).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6709F, -0.1997F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(110, 79).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.0989F, 1.259F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(109, 116).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(116, 54).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -1.0989F, 1.259F, -0.6632F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3016F, 9.4409F, 2.948F, 2.0589F, -0.0514F, 0.1358F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(115, 36).addBox(-0.85F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.15F, 13.0301F, -2.5498F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(120, 43).addBox(-0.85F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.15F, 15.4507F, -2.2814F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(120, 51).addBox(-0.85F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.15F, 15.8217F, -2.875F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(120, 37).addBox(-0.85F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.15F, 15.4507F, -2.2814F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(39, 115).addBox(-0.85F, -0.875F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.15F, 14.6469F, -3.0751F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(34, 87).addBox(-0.85F, -0.15F, -0.15F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.15F, 8.0787F, -1.8539F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(83, 0).addBox(-0.85F, -8.8289F, -0.177F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.15F, 8.0621F, -1.8239F, -0.1571F, 0.0F, 0.0262F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(56, 110).addBox(-0.85F, -8.7993F, -1.7474F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.15F, 8.0621F, -1.8239F, -0.4189F, 0.0F, 0.0262F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(51, 110).addBox(-0.2F, -8.8345F, -1.6676F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5F, 8.0617F, -1.9112F, -0.4189F, 0.0F, -0.0262F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(73, 82).addBox(-0.2F, -8.8422F, -0.0908F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 8.0617F, -1.9112F, -0.1571F, 0.0F, -0.0262F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 15.8415F, -3.6594F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -1.0F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.6479F, -0.1874F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(11, 83).addBox(0.0F, -1.7F, -1.275F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.5439F, 0.3491F, -0.2967F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(70, 24).addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 7.3911F, -2.3025F, -0.0626F, -0.2178F, 0.0135F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.1662F, -5.8479F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, -0.0045F, 0.0003F));

		PartDefinition leftFoot4 = leftLeg3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(70, 40).addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 7.3911F, -2.3025F, -3.0679F, -0.3484F, 3.1194F));

		PartDefinition leftToes4 = leftFoot4.addOrReplaceChild("leftToes4", CubeListBuilder.create().texOffs(56, 55).addBox(-0.5F, -0.1662F, -4.8479F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, -0.0045F, 0.0003F));

		PartDefinition leftFoot2 = leftLeg3.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.383F, 7.399F, -2.1734F, -0.0642F, 0.3136F, -0.0198F));

		PartDefinition leftToes2 = leftFoot2.addOrReplaceChild("leftToes2", CubeListBuilder.create().texOffs(72, 6).addBox(-0.5F, -0.1662F, -3.8479F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, -0.0045F, 0.0003F));

		PartDefinition leftFoot3 = leftLeg3.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.383F, 7.399F, -2.1734F, -3.0716F, 0.0784F, -3.1368F));

		PartDefinition leftToes3 = leftFoot3.addOrReplaceChild("leftToes3", CubeListBuilder.create().texOffs(87, 83).addBox(-0.5F, -0.1662F, -2.8479F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, -0.0045F, 0.0003F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9045F, 3.8744F, 0.8937F, -1.3085F, 0.2854F, 0.0975F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(117, 22).mirror().addBox(0.2F, -0.667F, -1.0746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 117).mirror().addBox(-1.2F, -0.667F, -1.0746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.1684F, 2.1304F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(115, 106).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.0578F, 1.6916F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(115, 61).mirror().addBox(-0.5F, -0.2F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.871F, 1.4307F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(14, 103).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1573F, 0.3585F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(104, 116).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.7391F, 0.5176F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(70, 105).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.8029F, 0.0169F, 1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(78, 89).mirror().addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.8285F, -0.3747F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(94, 102).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.8164F, -0.1186F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(56, 87).mirror().addBox(2.5F, 0.35F, -1.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.0342F, -0.8779F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(115, 87).mirror().addBox(2.5F, 0.125F, -1.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -0.5507F, -1.0515F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(120, 63).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2035F, -0.6636F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(120, 60).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6709F, -0.1997F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(110, 79).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0989F, 1.259F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(109, 116).mirror().addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(116, 54).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0989F, 1.259F, -0.6632F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3016F, 9.4409F, 2.948F, 2.1898F, 0.0514F, -0.1358F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(115, 36).mirror().addBox(-0.15F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 13.0301F, -2.5498F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(120, 43).mirror().addBox(-0.15F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 15.4507F, -2.2814F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(120, 51).mirror().addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 15.8217F, -2.875F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(120, 37).mirror().addBox(-0.15F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 15.4507F, -2.2814F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(39, 115).mirror().addBox(-0.15F, -0.875F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 14.6469F, -3.0751F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(34, 87).mirror().addBox(-0.15F, -0.15F, -0.15F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 8.0787F, -1.8539F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.15F, -8.8289F, -0.177F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 8.0621F, -1.8239F, -0.1571F, 0.0F, -0.0262F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(56, 110).mirror().addBox(-0.15F, -8.7993F, -1.7474F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 8.0621F, -1.8239F, -0.4189F, 0.0F, -0.0262F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(51, 110).mirror().addBox(-0.8F, -8.8345F, -1.6676F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5F, 8.0617F, -1.9112F, -0.4189F, 0.0F, 0.0262F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(73, 82).mirror().addBox(-0.8F, -8.8422F, -0.0908F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 8.0617F, -1.9112F, -0.1571F, 0.0F, 0.0262F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 15.8415F, -3.6594F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.5F, -1.0F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6479F, -0.1874F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(11, 83).mirror().addBox(-1.0F, -1.7F, -1.275F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5439F, 0.3491F, -0.2967F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 7.3911F, -2.3025F, -0.0626F, 0.2178F, -0.0135F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -0.1662F, -5.8479F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.1705F, 0.0045F, -0.0003F));

		PartDefinition rightFoot4 = rightLeg3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(70, 40).mirror().addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 7.3911F, -2.3025F, -2.7188F, 0.3484F, -3.1194F));

		PartDefinition rightToes4 = rightFoot4.addOrReplaceChild("rightToes4", CubeListBuilder.create().texOffs(56, 55).mirror().addBox(-0.5F, -0.1662F, -4.8479F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, 0.0045F, -0.0003F));

		PartDefinition rightFoot2 = rightLeg3.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.383F, 7.399F, -2.1734F, -0.0642F, -0.3136F, 0.0198F));

		PartDefinition rightToes2 = rightFoot2.addOrReplaceChild("rightToes2", CubeListBuilder.create().texOffs(72, 6).mirror().addBox(-0.5F, -0.1662F, -3.8479F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.2142F, 0.0045F, -0.0003F));

		PartDefinition rightFoot3 = rightLeg3.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.383F, 7.399F, -2.1734F, -2.7225F, -0.0784F, 3.1368F));

		PartDefinition rightToes3 = rightFoot3.addOrReplaceChild("rightToes3", CubeListBuilder.create().texOffs(87, 83).mirror().addBox(-0.5F, -0.1662F, -2.8479F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, 0.0045F, -0.0003F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(103, 24).addBox(-0.5F, -0.1056F, 0.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5912F, 5.6257F, -0.5411F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 64).addBox(0.0F, -0.594F, 1.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3595F, 1.6942F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1354F, 2.1702F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(54, 115).addBox(-0.5F, -1.9F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3415F, -0.1155F, -0.6545F, 0.0F, 0.0F));

		PartDefinition tail4 = tail2.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1354F, 4.8702F));

		PartDefinition cube_r118 = tail4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(120, 83).addBox(-0.5F, 0.1103F, -1.9045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.1415F, -0.2155F, -0.5672F, 0.0F, 0.0F));

		PartDefinition tail5 = tail2.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9231F, 3.2546F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail5.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(110, 25).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(110, 22).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.5F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6585F, -3.2168F, 0.113F, 0.0073F, 0.0091F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(30, 93).addBox(0.0F, -0.9822F, -0.5043F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6983F, -1.3421F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(83, 94).addBox(0.0F, -0.9822F, 0.0957F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9293F, -3.518F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(117, 25).mirror().addBox(0.0F, -0.2F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 80).mirror().addBox(0.0F, 0.1F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.6021F, -3.8333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(76, 22).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -3.0408F, 0.3245F, 0.0324F, -0.2087F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 74).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -3.0408F, 0.2222F, 0.1911F, -0.7335F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-14.2026F, -1.8495F, -0.5143F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -3.0408F, 0.0962F, 0.2761F, -1.2651F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(27, 2).mirror().addBox(-14.2026F, -1.8494F, -0.5143F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.3408F, 0.1017F, 0.2928F, -1.2636F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(88, 81).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.3408F, 0.2354F, 0.2027F, -0.7309F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.3408F, 0.3415F, 0.0361F, -0.2081F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(120, 80).addBox(-1.0F, 0.1F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 25).addBox(-1.0F, -0.2F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6021F, -3.8333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(51, 80).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.3408F, 0.3415F, -0.0361F, 0.2081F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(88, 81).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.3408F, 0.2354F, -0.2027F, 0.7309F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(27, 2).addBox(2.2026F, -1.8494F, -0.5143F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.3408F, 0.1017F, -0.2928F, 1.2636F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(76, 22).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -3.0408F, 0.3245F, -0.0324F, 0.2087F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(57, 74).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -3.0408F, 0.2222F, -0.1911F, 0.7335F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(27, 0).addBox(2.2026F, -1.8495F, -0.5143F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -3.0408F, 0.0962F, -0.2761F, 1.2651F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(59, 0).addBox(-1.0F, -0.0506F, -0.0332F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -4.5F, -0.3578F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -2.1021F, -4.5333F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(120, 100).addBox(-0.5F, -1.3506F, -1.0332F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.455F, -3.7156F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(120, 96).addBox(-0.5F, -1.3506F, -1.0332F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7545F, -1.8423F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(120, 86).addBox(-0.5F, -1.1506F, -1.0332F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0021F, 0.0333F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(39, 62).addBox(-1.0F, -0.0506F, -5.0332F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.0021F, 0.0333F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(89, 115).mirror().addBox(0.0F, -0.4F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, 1.6F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(21, 20).mirror().addBox(-14.2026F, -1.8494F, -0.5143F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.4129F, -0.5075F, 0.0591F, 0.1595F, -1.2732F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(69, 60).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.4129F, -0.5075F, 0.131F, 0.1086F, -0.7471F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.4129F, -0.5075F, 0.2049F, 0.007F, -0.211F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(103, 44).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.1129F, -2.3075F, 0.222F, 0.0106F, -0.2109F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(110, 95).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.1129F, -2.3075F, 0.1439F, 0.1204F, -0.7457F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(21, 22).mirror().addBox(-14.2026F, -1.8495F, -0.5143F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.1129F, -2.3075F, 0.0643F, 0.1762F, -1.2723F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.6129F, -4.2075F, 0.2391F, 0.0143F, -0.2106F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(96, 91).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.6129F, -4.2075F, 0.1568F, 0.1323F, -0.744F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(38, 35).mirror().addBox(-12.2026F, -1.8495F, -0.5143F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.6129F, -4.2075F, 0.0695F, 0.1928F, -1.2713F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(115, 90).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 66).mirror().addBox(0.0F, 0.0F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1F, -0.2F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(120, 66).addBox(-1.0F, 0.0F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 90).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.2F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(38, 35).addBox(2.2026F, -1.8495F, -0.5143F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6129F, -4.2075F, 0.0695F, -0.1928F, 1.2713F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(96, 91).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6129F, -4.2075F, 0.1568F, -0.1323F, 0.744F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(104, 79).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6129F, -4.2075F, 0.2391F, -0.0143F, 0.2106F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(21, 22).addBox(2.2026F, -1.8495F, -0.5143F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1129F, -2.3075F, 0.0643F, -0.1762F, 1.2723F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(110, 95).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1129F, -2.3075F, 0.1439F, -0.1204F, 0.7457F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(103, 44).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1129F, -2.3075F, 0.222F, -0.0106F, 0.2109F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(59, 17).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4129F, -0.5075F, 0.2049F, -0.007F, 0.211F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(69, 60).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4129F, -0.5075F, 0.131F, -0.1086F, 0.7471F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(21, 20).addBox(2.2026F, -1.8494F, -0.5143F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4129F, -0.5075F, 0.0591F, -0.1595F, 1.2732F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(89, 115).addBox(-1.0F, -0.4F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.6F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.7417F, -4.7248F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(44, 93).addBox(0.0F, -1.1468F, -0.4375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3721F, -1.3209F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(35, 70).addBox(0.0F, -1.6924F, -0.0881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.8F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(23, 101).mirror().addBox(-0.2363F, -6.7919F, 0.5829F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.147F, 12.4719F, -1.3727F, -0.9193F, -0.4792F, -1.7349F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-0.6444F, -7.0059F, 0.3267F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7356F, 10.986F, -2.4978F, -0.9048F, -0.428F, -1.7466F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(91, 108).mirror().addBox(-0.3949F, -5.1665F, 0.0872F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5753F, 10.4904F, -2.7364F, -0.8447F, -0.1605F, -1.7425F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(19, 103).mirror().addBox(0.2575F, -5.116F, -0.1989F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5853F, 10.2398F, -4.4676F, -0.8697F, -0.0032F, -1.6483F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(120, 46).mirror().addBox(-1.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.265F, -1.3658F, 0.056F, -0.011F, -0.2439F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(113, 7).mirror().addBox(-2.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.265F, -1.3658F, 0.0122F, 0.0165F, -0.7878F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-10.4102F, -1.789F, -0.4287F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.265F, -1.3658F, 0.0023F, 0.0204F, -1.3115F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(71, 115).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 84).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -0.4345F, 0.7932F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(113, 52).mirror().addBox(-2.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.465F, -3.3658F, 0.0683F, 0.0835F, -0.8723F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(119, 117).mirror().addBox(-1.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.465F, -3.3658F, 0.1385F, 0.0174F, -0.3309F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(113, 109).mirror().addBox(-4.4102F, -1.789F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.465F, -3.3658F, 0.0173F, 0.1064F, -1.3978F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(26, 101).mirror().addBox(-0.4363F, -7.3919F, 0.0829F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7721F, 13.0932F, -0.0751F, -0.9717F, -0.4792F, -1.7349F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(115, 84).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 115).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -0.4345F, 0.7932F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(113, 109).addBox(2.4102F, -1.789F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.465F, -3.3658F, 0.0173F, -0.1064F, 1.3978F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(119, 117).addBox(0.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.465F, -3.3658F, 0.1385F, -0.0174F, 0.3309F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(113, 52).addBox(0.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.465F, -3.3658F, 0.0683F, -0.0835F, 0.8723F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(51, 53).addBox(2.4102F, -1.789F, -0.4287F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.265F, -1.3658F, 0.0023F, -0.0204F, 1.3115F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(113, 7).addBox(0.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.265F, -1.3658F, 0.0122F, -0.0165F, 0.7878F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(120, 46).addBox(0.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.265F, -1.3658F, 0.056F, 0.011F, 0.2439F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(19, 103).addBox(-1.2575F, -5.116F, -0.1989F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5853F, 10.2398F, -4.4676F, -0.8697F, 0.0032F, 1.6483F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(91, 108).addBox(-0.6051F, -5.1665F, 0.0872F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5753F, 10.4904F, -2.7364F, -0.8447F, 0.1605F, 1.7425F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(7, 84).addBox(-0.3556F, -7.0059F, 0.3267F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7356F, 10.986F, -2.4978F, -0.9048F, 0.428F, 1.7466F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(26, 101).addBox(-0.5637F, -7.3919F, 0.0829F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7721F, 13.0932F, -0.0751F, -0.9717F, 0.4792F, 1.7349F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(23, 101).addBox(-0.7637F, -6.7919F, 0.5829F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.147F, 12.4719F, -1.3727F, -0.9193F, 0.4792F, 1.7349F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(36, 101).addBox(-2.0853F, -4.3597F, -0.1385F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5853F, 10.2398F, -4.4676F, 0.8142F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(87, 60).addBox(-2.0853F, -4.2355F, -2.4807F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5853F, 10.2398F, -4.4676F, 0.5088F, 0.0F, 0.0F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(15, 42).addBox(-2.0853F, -4.0294F, -3.3191F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5853F, 10.2398F, -4.4676F, -0.3115F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(16, 98).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.2848F, -9.573F, -1.0446F, 0.0F, 0.0F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(98, 14).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.1975F, -11.3527F, -1.0969F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(103, 85).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.0131F, -11.9312F, -0.617F, 0.0F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(103, 81).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 11.0119F, -11.9809F, -0.0497F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(56, 92).addBox(-2.0853F, -0.8266F, -7.5075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5853F, 10.2398F, -4.4676F, 0.2121F, 0.0F, 0.0F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(38, 37).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.2934F, -9.8072F, 0.692F, 0.0F, 0.0F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(87, 11).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 18.778F, 3.8231F, 0.2644F, 0.0F, 0.0F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(120, 77).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 19.7739F, 3.9128F, 1.6607F, 0.0F, 0.0F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(120, 57).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 20.3848F, 3.1211F, 0.6571F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(49, 115).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 20.3438F, 2.1219F, -0.041F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(89, 17).addBox(-0.5F, -0.65F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.5762F, 1.569F, -0.521F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(11, 75).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 19.5749F, -0.7779F, -0.2592F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(40, 85).addBox(-0.5F, -5.0F, -0.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.9795F, -2.2629F, -0.3813F, 0.0F, 0.0F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 18.817F, -3.2496F, -0.1632F, 0.0F, 0.0F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(38, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.8565F, -6.7362F, 1.0586F, 0.0F, 0.0F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(23, 36).addBox(-2.0853F, -1.5019F, -6.5335F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5853F, 10.2398F, -4.4676F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(92, 51).addBox(-3.0853F, -3.7271F, -2.5679F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5853F, 10.2398F, -4.4676F, -0.4555F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(30, 54).addBox(-1.0F, -1.3F, -3.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1F, -1.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7902F, -0.4959F, -5.1416F, 2.0146F, 0.4768F, 0.8498F));

		PartDefinition cube_r210 = leftArm1.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(47, 92).addBox(-0.8F, 0.0F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.1081F, -0.0832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftArm1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(101, 109).addBox(-0.5F, -1.4F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.09F))
				.texOffs(74, 118).addBox(-0.5F, 0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(69, 118).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 8.1183F, -3.1682F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftArm1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(75, 98).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1081F, 4.6115F, 0.3021F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftArm1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(70, 98).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.1081F, 4.6115F, 0.3021F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftArm1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(17, 109).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1081F, 2.5128F, 0.1794F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftArm1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(30, 96).addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 0.9916F, 0.5522F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftArm1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(12, 109).addBox(-0.5F, -0.6F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 2.1467F, -0.3734F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2504F, 9.8584F, -2.3818F, 1.4038F, -0.0562F, -2.8289F));

		PartDefinition cube_r217 = leftArm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(110, 36).addBox(-0.5F, -0.3F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.05F, 1.8311F, -0.3084F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftArm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(115, 44).addBox(-0.5F, -1.9F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(44, 115).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.05F, 1.4338F, 0.8284F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftArm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(44, 97).addBox(-0.5F, -0.2F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(97, 0).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.05F, 7.1089F, 0.4254F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftArm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(46, 110).addBox(-0.5F, -0.1F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(41, 110).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.05F, 4.2337F, 0.8039F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftArm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(29, 110).addBox(-0.5F, -2.8F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.05F, 4.1272F, 0.0548F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftArm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(39, 93).addBox(-0.4719F, 5.3536F, -0.798F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 0.25F, -0.8F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftArm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(25, 93).addBox(-0.5693F, -0.1933F, -0.2839F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 0.25F, -0.8F, -0.1952F, 0.0067F, -0.0147F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1959F, 11.6492F, -1.9199F, 2.301F, -0.549F, 0.7797F));

		PartDefinition cube_r224 = leftHand.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(24, 70).addBox(-1.0F, -0.65F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.6052F, 0.9179F, -1.035F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftHand.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(25, 83).addBox(-0.5F, -0.1612F, -0.2194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1052F, 3.5122F, -5.7339F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftHand.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(115, 57).addBox(-1.0F, 0.2388F, 0.5806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6052F, 1.7929F, -3.035F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftHand.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(34, 114).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1052F, 4.0221F, -4.1508F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftHand.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(110, 57).addBox(-1.0F, -0.5612F, 0.3806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 109).addBox(-1.0F, -0.5612F, -0.2194F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6052F, 1.7929F, -3.035F, -1.0036F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7902F, -0.4959F, -5.1416F, 2.0754F, -0.4996F, -0.746F));

		PartDefinition cube_r229 = rightArm1.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(47, 92).mirror().addBox(-1.2F, 0.0F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.1081F, -0.0832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightArm1.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(101, 109).mirror().addBox(-0.5F, -1.4F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(74, 118).mirror().addBox(-0.5F, 0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(69, 118).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 8.1183F, -3.1682F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightArm1.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(75, 98).mirror().addBox(-0.5F, -0.1F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 4.6115F, 0.3021F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightArm1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(70, 98).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 4.6115F, 0.3021F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightArm1.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(17, 109).mirror().addBox(-0.5F, -1.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 2.5128F, 0.1794F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightArm1.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(30, 96).mirror().addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 0.9916F, 0.5522F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightArm1.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(12, 109).mirror().addBox(-0.5F, -0.6F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 2.1467F, -0.3734F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2504F, 9.8584F, -2.3818F, 1.142F, 0.0562F, 2.8289F));

		PartDefinition cube_r236 = rightArm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(110, 36).mirror().addBox(-0.5F, -0.3F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.8311F, -0.3084F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightArm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(115, 44).mirror().addBox(-0.5F, -1.9F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(44, 115).mirror().addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.4338F, 0.8284F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightArm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(44, 97).mirror().addBox(-0.5F, -0.2F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(97, 0).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.05F, 7.1089F, 0.4254F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightArm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(46, 110).mirror().addBox(-0.5F, -0.1F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(41, 110).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.05F, 4.2337F, 0.8039F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightArm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(29, 110).mirror().addBox(-0.5F, -2.8F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.05F, 4.1272F, 0.0548F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightArm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(39, 93).mirror().addBox(-0.5281F, 5.3536F, -0.798F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.25F, -0.8F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightArm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(25, 93).mirror().addBox(-0.4307F, -0.1933F, -0.2839F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.25F, -0.8F, -0.1952F, -0.0067F, 0.0147F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1959F, 11.6492F, -1.9199F, 2.8947F, 0.3156F, -0.0856F));

		PartDefinition cube_r243 = rightHand.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(24, 70).mirror().addBox(0.0F, -0.65F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 0.9179F, -1.035F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightHand.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(25, 83).mirror().addBox(-0.5F, -0.1612F, -0.2194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 3.5122F, -5.7339F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightHand.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(115, 57).mirror().addBox(0.0F, 0.2388F, 0.5806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 1.7929F, -3.035F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightHand.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(34, 114).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 4.0221F, -4.1508F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightHand.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(110, 57).mirror().addBox(0.0F, -0.5612F, 0.3806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 109).mirror().addBox(0.0F, -0.5612F, -0.2194F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 1.7929F, -3.035F, -1.0036F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0142F, -0.2474F, -5.0035F));

		PartDefinition cube_r248 = bone2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(104, 75).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.4112F, 13.0825F, 1.4252F, 0.9014F, -0.3049F, -0.2885F));

		PartDefinition cube_r249 = bone2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(98, 72).addBox(-3.0F, -0.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1382F, 15.0267F, 8.1164F, 0.3524F, -0.9684F, 0.3819F));

		PartDefinition cube_r250 = bone2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(108, 97).addBox(-2.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6972F, 16.5639F, 8.4664F, 0.0677F, -0.9745F, 0.6794F));

		PartDefinition cube_r251 = bone2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(87, 104).addBox(4.3237F, -2.1032F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5096F, 14.3549F, 2.8691F, -0.1282F, -0.9592F, 1.2246F));

		PartDefinition cube_r252 = bone2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(84, 108).addBox(0.0F, 4.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(93, 55).addBox(0.0F, 2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(103, 93).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5096F, 14.3549F, 2.8691F, 0.9269F, -0.3218F, -0.2694F));

		PartDefinition cube_r253 = bone2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(103, 36).addBox(-3.0316F, -0.3206F, -1.4299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2802F, 10.1588F, 2.3056F, 0.7007F, -0.2999F, -0.2937F));

		PartDefinition cube_r254 = bone2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(79, 111).addBox(1.9309F, -0.0451F, -0.1768F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5096F, 14.3549F, 2.8691F, 0.9269F, -0.4031F, -0.3304F));

		PartDefinition cube_r255 = bone2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(111, 74).addBox(1.9778F, -0.035F, -0.1716F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4112F, 13.0825F, 1.4252F, 0.9193F, -0.3826F, -0.3543F));

		PartDefinition cube_r256 = bone2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(110, 91).addBox(-0.625F, -1.825F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.278F, 11.9785F, 2.4231F, 0.7275F, -0.3765F, -0.3608F));

		PartDefinition cube_r257 = bone2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(5, 115).addBox(2.8328F, -0.0994F, -0.3568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.5096F, 14.3549F, 2.8691F, 0.9432F, -0.4425F, -0.4152F));

		PartDefinition cube_r258 = bone2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(99, 114).addBox(2.6603F, 2.1155F, -0.3568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5096F, 14.3549F, 2.8691F, 0.965F, -0.3713F, -0.4702F));

		PartDefinition cube_r259 = bone2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(27, 115).addBox(2.7044F, 2.7496F, -0.3568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(94, 114).addBox(2.7044F, 0.7996F, -0.3568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5096F, 14.3549F, 2.8691F, 0.999F, -0.1969F, -0.5912F));

		PartDefinition cube_r260 = bone2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(114, 70).addBox(2.5652F, 0.3333F, -0.3975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4112F, 13.0825F, 1.4252F, 0.9941F, -0.3148F, -0.5213F));

		PartDefinition cube_r261 = bone2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(66, 114).addBox(-0.5737F, -0.3793F, -1.2376F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2802F, 10.1588F, 2.3056F, 0.7409F, -0.4881F, -0.3954F));

		PartDefinition cube_r262 = bone2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(89, 72).addBox(-1.6141F, -4.1713F, -1.463F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2802F, 10.1088F, 2.2556F, 0.6201F, -0.0895F, -0.625F));

		PartDefinition cube_r263 = bone2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 97).addBox(-3.0581F, -3.0801F, -1.463F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2802F, 10.1088F, 2.2556F, 0.5532F, -0.309F, -0.292F));

		PartDefinition cube_r264 = bone2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(69, 109).addBox(-1.069F, -3.0844F, -1.5089F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2802F, 10.1088F, 2.2556F, 0.5423F, -0.2656F, -0.2417F));

		PartDefinition cube_r265 = bone2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(43, 104).addBox(-0.8569F, -4.437F, -1.3001F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2802F, 10.1088F, 2.2556F, 0.575F, -0.3731F, -0.2449F));

		PartDefinition cube_r266 = bone2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(108, 48).addBox(-0.6069F, -4.087F, -1.3001F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2802F, 10.1088F, 2.2556F, 0.53F, -0.5733F, -0.2165F));

		PartDefinition cube_r267 = bone2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(43, 55).addBox(-0.8722F, -0.4412F, -0.1676F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3096F, 6.9472F, -0.3697F, 1.6037F, 0.1768F, 0.26F));

		PartDefinition cube_r268 = bone2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 102).addBox(-0.9F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.482F, 2.7974F, -3.5743F, 1.2658F, 0.2509F, 0.9998F));

		PartDefinition cube_r269 = bone2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(103, 89).addBox(-0.9F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2048F, 1.6842F, -2.9664F, 1.2204F, 0.1804F, 0.7884F));

		PartDefinition cube_r270 = bone2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(16, 89).addBox(-0.1F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3204F, -1.0307F, -1.9196F, 1.1792F, -0.0268F, 0.2672F));

		PartDefinition cube_r271 = bone2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(101, 97).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4216F, -1.2255F, -1.1837F, 1.0245F, 0.1589F, 0.5639F));

		PartDefinition cube_r272 = bone2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(87, 67).addBox(0.0543F, -1.0635F, 4.3718F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3096F, 6.9472F, -0.3697F, 1.44F, 0.1813F, 0.0483F));

		PartDefinition cube_r273 = bone2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(92, 46).addBox(0.0543F, 0.2117F, 4.3057F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3096F, 6.9472F, -0.3697F, 1.7193F, 0.1813F, 0.0483F));

		PartDefinition cube_r274 = bone2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(52, 62).addBox(-0.3666F, -0.4352F, 0.3118F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, -0.7F, -0.2F, -0.0961F, -0.2054F, -0.8702F));

		PartDefinition cube_r275 = bone2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(15, 60).addBox(0.5952F, -1.6014F, 4.7618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(116, 74).addBox(0.5952F, -2.1149F, 4.9266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, -0.7F, -0.2F, -0.3346F, -0.3879F, -0.8351F));

		PartDefinition cube_r276 = bone2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(76, 12).addBox(0.5952F, -2.8704F, 5.5998F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, -0.7F, -0.2F, -0.4655F, -0.3879F, -0.8351F));

		PartDefinition cube_r277 = bone2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(56, 102).addBox(-0.3829F, -0.9585F, 3.7276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, -0.7F, -0.2F, -0.106F, -0.2067F, -0.866F));

		PartDefinition cube_r278 = bone2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(35, 74).addBox(-0.3829F, -0.5636F, -0.1927F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, -0.7F, -0.2F, -0.0013F, -0.2067F, -0.866F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.0142F, -0.2474F, -5.0035F));

		PartDefinition cube_r279 = bone3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(104, 75).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.4112F, 13.0825F, 1.4252F, 0.9014F, 0.3049F, 0.2885F));

		PartDefinition cube_r280 = bone3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(98, 72).mirror().addBox(0.0F, -0.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1382F, 15.0267F, 8.1164F, 0.3524F, 0.9684F, -0.3819F));

		PartDefinition cube_r281 = bone3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(108, 97).mirror().addBox(0.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6972F, 16.5639F, 8.4664F, 0.0677F, 0.9745F, -0.6794F));

		PartDefinition cube_r282 = bone3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(87, 104).mirror().addBox(-6.3237F, -2.1032F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5096F, 14.3549F, 2.8691F, -0.1282F, 0.9592F, -1.2246F));

		PartDefinition cube_r283 = bone3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(84, 108).mirror().addBox(-2.0F, 4.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(93, 55).mirror().addBox(-3.0F, 2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(103, 93).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.5096F, 14.3549F, 2.8691F, 0.9269F, 0.3218F, 0.2694F));

		PartDefinition cube_r284 = bone3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(103, 36).mirror().addBox(1.0316F, -0.3206F, -1.4299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2802F, 10.1588F, 2.3056F, 0.7007F, 0.2999F, 0.2937F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(79, 111).mirror().addBox(-2.9309F, -0.0451F, -0.1768F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5096F, 14.3549F, 2.8691F, 0.9269F, 0.4031F, 0.3304F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(111, 74).mirror().addBox(-2.9778F, -0.035F, -0.1716F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4112F, 13.0825F, 1.4252F, 0.9193F, 0.3826F, 0.3543F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(110, 91).mirror().addBox(-0.375F, -1.825F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.278F, 11.9785F, 2.4231F, 0.7275F, 0.3765F, 0.3608F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(5, 115).mirror().addBox(-3.8328F, -0.0994F, -0.3568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(3.5096F, 14.3549F, 2.8691F, 0.9432F, 0.4425F, 0.4152F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(99, 114).mirror().addBox(-3.6603F, 2.1155F, -0.3568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5096F, 14.3549F, 2.8691F, 0.965F, 0.3713F, 0.4702F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(27, 115).mirror().addBox(-3.7044F, 2.7496F, -0.3568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(94, 114).mirror().addBox(-3.7044F, 0.7996F, -0.3568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5096F, 14.3549F, 2.8691F, 0.999F, 0.1969F, 0.5912F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(114, 70).mirror().addBox(-3.5652F, 0.3333F, -0.3975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4112F, 13.0825F, 1.4252F, 0.9941F, 0.3148F, 0.5213F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(66, 114).mirror().addBox(-0.4263F, -0.3793F, -1.2376F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2802F, 10.1588F, 2.3056F, 0.7409F, 0.4881F, 0.3954F));

		PartDefinition cube_r293 = bone3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(89, 72).mirror().addBox(-1.3859F, -4.1713F, -1.463F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2802F, 10.1088F, 2.2556F, 0.6201F, 0.0895F, 0.625F));

		PartDefinition cube_r294 = bone3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(1.0581F, -3.0801F, -1.463F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2802F, 10.1088F, 2.2556F, 0.5532F, 0.309F, 0.292F));

		PartDefinition cube_r295 = bone3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(69, 109).mirror().addBox(0.069F, -3.0844F, -1.5089F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2802F, 10.1088F, 2.2556F, 0.5423F, 0.2656F, 0.2417F));

		PartDefinition cube_r296 = bone3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(43, 104).mirror().addBox(-0.1431F, -4.437F, -1.3001F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2802F, 10.1088F, 2.2556F, 0.575F, 0.3731F, 0.2449F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(108, 48).mirror().addBox(-0.3931F, -4.087F, -1.3001F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2802F, 10.1088F, 2.2556F, 0.53F, 0.5733F, 0.2165F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(43, 55).mirror().addBox(-0.1278F, -0.4412F, -0.1676F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3096F, 6.9472F, -0.3697F, 1.6037F, -0.1768F, -0.26F));

		PartDefinition cube_r299 = bone3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.1F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.482F, 2.7974F, -3.5743F, 1.2658F, -0.2509F, -0.9998F));

		PartDefinition cube_r300 = bone3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(103, 89).mirror().addBox(-0.1F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2048F, 1.6842F, -2.9664F, 1.2204F, -0.1804F, -0.7884F));

		PartDefinition cube_r301 = bone3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(16, 89).mirror().addBox(-0.9F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3204F, -1.0307F, -1.9196F, 1.1792F, 0.0268F, -0.2672F));

		PartDefinition cube_r302 = bone3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(101, 97).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4216F, -1.2255F, -1.1837F, 1.0245F, -0.1589F, -0.5639F));

		PartDefinition cube_r303 = bone3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(87, 67).mirror().addBox(-1.0543F, -1.0635F, 4.3718F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3096F, 6.9472F, -0.3697F, 1.44F, -0.1813F, -0.0483F));

		PartDefinition cube_r304 = bone3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(92, 46).mirror().addBox(-1.0543F, 0.2117F, 4.3057F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3096F, 6.9472F, -0.3697F, 1.7193F, -0.1813F, -0.0483F));

		PartDefinition cube_r305 = bone3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(52, 62).mirror().addBox(-0.6334F, -0.4352F, 0.3118F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7F, -0.2F, -0.0961F, 0.2054F, 0.8702F));

		PartDefinition cube_r306 = bone3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(15, 60).mirror().addBox(-1.5952F, -1.6014F, 4.7618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(116, 74).mirror().addBox(-1.5952F, -2.1149F, 4.9266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7F, -0.2F, -0.3346F, 0.3879F, 0.8351F));

		PartDefinition cube_r307 = bone3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-1.5952F, -2.8704F, 5.5998F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7F, -0.2F, -0.4655F, 0.3879F, 0.8351F));

		PartDefinition cube_r308 = bone3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(56, 102).mirror().addBox(-0.6171F, -0.9585F, 3.7276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7F, -0.2F, -0.106F, 0.2067F, 0.866F));

		PartDefinition cube_r309 = bone3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(35, 74).mirror().addBox(-0.6171F, -0.5636F, -0.1927F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7F, -0.2F, -0.0013F, 0.2067F, 0.866F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.314F, -4.8881F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r310 = neck6.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(99, 24).addBox(0.0F, -2.7943F, -3.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 74).addBox(-0.5F, -1.9943F, -4.1586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1032F, -0.0049F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r311 = neck6.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(31, 77).addBox(0.0F, -1.4924F, -0.1881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6485F, -0.2392F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r312 = neck6.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(106, 8).mirror().addBox(-1.7161F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3289F, 2.2473F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r313 = neck6.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(94, 31).mirror().addBox(-1.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1882F, 2.8174F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r314 = neck6.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(106, 8).addBox(-0.284F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3289F, 2.2473F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition cube_r315 = neck6.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(94, 31).addBox(0.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1882F, 2.8174F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6061F, -3.2693F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r316 = neck5.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(103, 28).addBox(0.495F, -1.9F, -1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 40).addBox(0.0F, -1.1F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.495F, 0.2488F, 0.165F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck10 = neck5.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.8469F, -1.9102F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r317 = neck10.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(103, 58).addBox(-1.0F, -2.0981F, 3.9713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(102, 4).addBox(-0.5F, -2.7981F, 3.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -4.5252F, -3.9896F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck4 = neck10.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.7098F, -0.9657F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r318 = neck4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(66, 111).addBox(-0.505F, -1.505F, -2.005F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 62).addBox(-1.005F, -1.005F, -2.005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.505F, 0.0329F, -0.0422F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6887F, -1.085F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(94, 110).addBox(-1.009F, -3.9959F, -2.4505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.514F, 1.3393F, 2.8668F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0003F, -0.3771F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r320 = neck2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(61, 111).addBox(-1.009F, -4.5862F, -5.3856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.509F, -1.9223F, 5.6368F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9787F, -0.7141F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r321 = neck.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(88, 76).addBox(-1.009F, 5.2783F, -8.5572F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.514F, -4.1824F, 6.5523F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.588F, -2.8944F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r322 = neck7.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(63, 103).addBox(-1.009F, 1.3104F, -12.0048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.511F, 0.599F, 10.1226F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.625F, -4.95F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r323 = neck8.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(120, 90).addBox(-0.509F, -0.3593F, -13.0177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.511F, 5.1627F, 14.305F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r324 = neck8.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(117, 40).addBox(-1.009F, -4.4269F, -12.3081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.511F, 5.1627F, 14.305F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6632F, 3.2092F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(0, 20).addBox(-3.5F, -3.6F, -1.0F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.002F, -2.7564F, -1.5111F, 0.8334F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(99, 19).addBox(-0.5F, -1.4F, -5.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.159F))
				.texOffs(21, 8).addBox(-0.5F, -2.3F, -3.9F, 1.0F, 4.0F, 7.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.002F, -6.7099F, -6.0759F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -3.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.002F, -0.5767F, -5.2107F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(65, 87).addBox(-0.5F, -3.9F, -0.8F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.002F, -1.5379F, -5.933F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(21, 24).addBox(-0.5F, -5.5F, -6.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.002F, -0.8758F, -7.6452F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(32, 118).addBox(-1.009F, -17.8912F, -5.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(29, 101).addBox(-1.009F, -16.3545F, 8.9925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(74, 111).addBox(-1.009F, -9.4329F, 15.2156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(9, 93).addBox(-1.009F, -19.7962F, 1.2933F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(62, 82).addBox(-2.009F, -17.4894F, -1.3318F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(118, 18).addBox(0.5229F, -13.5401F, 12.8985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, 0.5492F, -0.1118F, -0.0682F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(15, 118).addBox(2.3038F, -13.5401F, 13.4261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, 0.5609F, -0.2231F, -0.1381F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(10, 118).addBox(-1.009F, -13.5652F, 13.5453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(118, 3).addBox(-1.009F, -13.5652F, 12.9453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, 0.5454F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(83, 29).addBox(-2.009F, -16.2783F, 3.3468F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, -0.1702F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(53, 37).addBox(-3.009F, 1.4964F, -16.2641F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, -2.2209F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(70, 52).addBox(-3.009F, -13.9277F, -10.4022F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, -1.1737F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(27, 4).addBox(-2.009F, -17.394F, -2.7365F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(53, 43).addBox(-3.5F, -2.0F, 0.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.002F, -3.2533F, 2.0094F, 1.7671F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(68, 37).addBox(-3.5F, 0.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.502F, -9.789F, -5.4126F, -1.4792F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(81, 43).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.002F, -8.0194F, -11.0833F, -2.4391F, 0.0F, 0.0F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(81, 40).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.002F, -8.5231F, -10.2195F, -1.0428F, 0.0F, 0.0F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(78, 34).addBox(-2.5F, 0.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.002F, -8.9098F, -9.2973F, 0.3971F, 0.0F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(76, 18).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.502F, -9.5196F, -7.3925F, 1.8806F, 0.0F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(11, 67).addBox(-3.5F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.502F, -9.6975F, -6.4085F, -2.9627F, 0.0F, 0.0F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(61, 34).addBox(-3.5F, 0.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.002F, -9.7672F, -4.4129F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.0F, -6.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.002F, -9.6583F, -3.4188F, 1.4617F, 0.0F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(34, 47).addBox(-3.5F, -5.0F, 0.0F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.002F, -9.4207F, -2.4475F, 2.9016F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 36).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.002F, -9.0179F, -1.5322F, -1.9853F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(51, 47).addBox(-3.5F, 0.0F, -1.0F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.002F, -8.4623F, -0.7007F, -0.589F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(38, 14).addBox(-3.5F, -1.0F, -3.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.002F, -7.7708F, 0.0217F, 0.8072F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(53, 24).addBox(-3.5F, -3.0F, 0.0F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.002F, -6.9644F, 0.613F, 2.2035F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(38, 9).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.002F, -6.1095F, 1.1317F, -2.5962F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(48, 19).addBox(-3.5F, 0.0F, -1.0F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.002F, -5.1942F, 1.5345F, -1.1563F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(38, 4).addBox(-3.5F, -1.0F, -3.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.002F, -4.2341F, 1.8143F, 0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 30).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.002F, -1.2918F, 1.6192F, 2.9452F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(59, 14).addBox(-3.5F, 0.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.002F, -0.3949F, 1.1769F, -2.0289F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(15, 47).addBox(-4.009F, -12.3254F, -13.9554F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.511F, 13.7354F, -8.5793F, -1.3744F, 0.0F, 0.0F));

		PartDefinition beak = head.addOrReplaceChild("beak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.498F, -6.9442F, -11.6425F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r362 = beak.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(69, 55).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 1.41F, -4.4743F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r363 = beak.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(106, 18).addBox(0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 7.834F, -6.0279F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r364 = beak.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(91, 118).addBox(0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 6.8704F, -6.2951F, -2.8711F, 0.0F, 0.0F));

		PartDefinition cube_r365 = beak.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(86, 118).addBox(0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.8717F, -6.3474F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r366 = beak.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(87, 99).addBox(0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 3.8866F, -6.1037F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r367 = beak.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(81, 46).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.9595F, -5.7291F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r368 = beak.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(80, 98).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.1353F, -5.1627F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r369 = beak.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(90, 22).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.7943F, -3.6863F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r370 = beak.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(74, 94).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2208F, -1.9631F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r371 = beak.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(109, 0).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.5298F, -1.012F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r372 = beak.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(70, 30).addBox(-1.5F, -0.5F, -0.275F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftBeak = beak.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offset(3.9653F, 3.8113F, 0.1643F));

		PartDefinition cube_r373 = leftBeak.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(109, 54).addBox(-2.0F, -3.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(107, 70).addBox(-2.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2694F, 1.5386F, -3.7166F, 2.345F, 0.3266F, 0.5928F));

		PartDefinition cube_r374 = leftBeak.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(62, 107).addBox(-0.55F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.23F, 4.3839F, -5.4422F, -1.4722F, 0.3865F, 0.3243F));

		PartDefinition cube_r375 = leftBeak.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(117, 9).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-2.7313F, 3.1027F, -5.0293F, -2.3002F, 0.6508F, 0.2335F));

		PartDefinition cube_r376 = leftBeak.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(0, 117).addBox(-0.9691F, -1.749F, -0.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(114, 116).addBox(-0.9691F, -1.5491F, 0.5365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(116, 111).addBox(-0.9691F, -1.5491F, -0.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(94, 106).addBox(-0.9691F, -0.749F, -0.0635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.2F, 2.6F, -4.0F, 2.3598F, 0.6508F, 0.2335F));

		PartDefinition cube_r377 = leftBeak.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(101, 119).addBox(-1.0F, -0.0526F, 3.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 119).addBox(-1.0F, -0.0526F, 2.8318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0821F, 0.0217F, -6.2557F, -1.3243F, 0.1678F, 0.2168F));

		PartDefinition cube_r378 = leftBeak.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(120, 34).addBox(-0.6F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.3034F, -3.3246F, -3.4002F, -2.1683F, 0.8721F, 0.6715F));

		PartDefinition cube_r379 = leftBeak.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(79, 119).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4653F, -3.017F, -3.8506F, -2.4042F, 0.4672F, 0.3517F));

		PartDefinition cube_r380 = leftBeak.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(119, 70).addBox(-0.925F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9288F, -3.6859F, -1.5422F, -1.1875F, 0.8248F, 0.3283F));

		PartDefinition cube_r381 = leftBeak.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(52, 119).addBox(-0.875F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4653F, -3.5565F, -1.9729F, -1.1869F, 0.7517F, 0.2563F));

		PartDefinition cube_r382 = leftBeak.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 113).addBox(-0.9F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5711F, -2.7634F, -1.0512F, -0.4477F, 0.2503F, -0.3427F));

		PartDefinition cube_r383 = leftBeak.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(110, 66).addBox(-0.9357F, -1.99F, -0.4851F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, 2.0F, -3.1F, 0.9393F, 0.5049F, 0.0541F));

		PartDefinition cube_r384 = leftBeak.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(107, 32).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7956F, 0.5651F, -4.5457F, 2.7444F, 0.5646F, 0.1541F));

		PartDefinition cube_r385 = leftBeak.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(107, 28).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-3.1653F, 5.3783F, -5.2909F, 1.9678F, -0.0612F, 0.1448F));

		PartDefinition cube_r386 = leftBeak.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(42, 119).addBox(-1.0F, -0.662F, 1.9669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0821F, 0.0217F, -6.2557F, -1.5337F, 0.1678F, 0.2168F));

		PartDefinition cube_r387 = leftBeak.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(37, 119).addBox(-1.0F, -0.8695F, 0.9915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0821F, 0.0217F, -6.2557F, -1.6384F, 0.1678F, 0.2168F));

		PartDefinition cube_r388 = leftBeak.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(119, 31).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0821F, 0.0217F, -6.2557F, -1.7693F, 0.1678F, 0.2168F));

		PartDefinition cube_r389 = leftBeak.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(119, 28).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8933F, -0.8922F, -5.8965F, -1.942F, 0.1392F, 0.1497F));

		PartDefinition cube_r390 = leftBeak.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(27, 119).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.7423F, -1.6939F, -5.318F, -2.1927F, 0.1201F, 0.1006F));

		PartDefinition cube_r391 = leftBeak.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(5, 119).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6044F, -2.4073F, -4.631F, -2.334F, 0.1099F, 0.0863F));

		PartDefinition cube_r392 = leftBeak.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(96, 118).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.4653F, -3.017F, -3.8506F, -2.4736F, 0.1099F, 0.0863F));

		PartDefinition cube_r393 = leftBeak.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(110, 87).addBox(-0.9691F, -0.865F, 1.3176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.2F, 2.6F, -4.0F, -2.8675F, 0.6508F, 0.2335F));

		PartDefinition cube_r394 = leftBeak.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(111, 112).addBox(-0.9691F, -0.7073F, 1.2398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2F, 2.6F, -4.0F, 3.0667F, 0.6508F, 0.2335F));

		PartDefinition cube_r395 = leftBeak.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(94, 27).addBox(-1.9107F, -0.2279F, 1.5267F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, 2.0F, -3.1F, 2.8753F, 0.5646F, 0.1541F));

		PartDefinition cube_r396 = leftBeak.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(16, 94).addBox(-1.9237F, -1.7788F, 0.5131F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7627F, -0.5303F, -2.8066F, 2.5565F, 0.3738F, -0.1803F));

		PartDefinition cube_r397 = leftBeak.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 92).addBox(-1.9237F, 0.0622F, -0.2497F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7627F, -0.5303F, -2.8066F, -2.505F, 0.3738F, -0.1803F));

		PartDefinition cube_r398 = leftBeak.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(68, 47).addBox(-3.9237F, -0.8278F, -1.7491F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7627F, -0.5303F, -2.8066F, -1.5887F, 0.3738F, -0.1803F));

		PartDefinition cube_r399 = leftBeak.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(55, 106).addBox(-0.9107F, -1.4859F, -0.0166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.6F, 2.0F, -3.1F, 2.2121F, 0.5646F, 0.1541F));

		PartDefinition cube_r400 = leftBeak.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(116, 0).addBox(-0.9107F, -0.89F, -0.0851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 2.0F, -3.1F, 2.1248F, 0.5646F, 0.1541F));

		PartDefinition cube_r401 = leftBeak.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(110, 83).addBox(-0.7504F, -3.4094F, -3.0999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9552F, 0.3051F, -0.1061F));

		PartDefinition cube_r402 = leftBeak.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(100, 31).addBox(-0.7777F, -2.0273F, -1.3647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-0.7627F, -0.5303F, -2.4066F, -1.0552F, 0.3223F, -0.1769F));

		PartDefinition cube_r403 = leftBeak.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(106, 112).addBox(-0.7777F, -2.5662F, 0.5629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7627F, -0.5303F, -2.4066F, -0.1825F, 0.3223F, -0.1769F));

		PartDefinition cube_r404 = leftBeak.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(7, 100).addBox(-0.7504F, -1.9852F, -2.0125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3879F, 0.3051F, -0.1061F));

		PartDefinition cube_r405 = leftBeak.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(91, 33).addBox(-0.7F, -0.8F, 0.2F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.4653F, 0.871F, -2.6431F, 2.2945F, 0.0045F, 0.2929F));

		PartDefinition cube_r406 = leftBeak.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(97, 76).addBox(-0.7504F, -2.4261F, -3.3189F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6061F, 0.3051F, -0.1061F));

		PartDefinition rightBeak = beak.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offset(-2.9693F, 3.8113F, 0.1643F));

		PartDefinition cube_r407 = rightBeak.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(109, 54).mirror().addBox(0.0F, -3.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(107, 70).mirror().addBox(0.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.2694F, 1.5386F, -3.7166F, 2.345F, -0.3266F, -0.5928F));

		PartDefinition cube_r408 = rightBeak.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(62, 107).mirror().addBox(-0.45F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.23F, 4.3839F, -5.4422F, -1.4722F, -0.3865F, -0.3243F));

		PartDefinition cube_r409 = rightBeak.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(117, 9).mirror().addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(2.7313F, 3.1027F, -5.0293F, -2.3002F, -0.6508F, -0.2335F));

		PartDefinition cube_r410 = rightBeak.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-0.0309F, -1.749F, -0.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(114, 116).mirror().addBox(-0.0309F, -1.5491F, 0.5365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(116, 111).mirror().addBox(-0.0309F, -1.5491F, -0.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(94, 106).mirror().addBox(-0.0309F, -0.749F, -0.0635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.2F, 2.6F, -4.0F, 2.3598F, -0.6508F, -0.2335F));

		PartDefinition cube_r411 = rightBeak.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(101, 119).mirror().addBox(0.0F, -0.0526F, 3.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 119).mirror().addBox(0.0F, -0.0526F, 2.8318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.0821F, 0.0217F, -6.2557F, -1.3243F, -0.1678F, -0.2168F));

		PartDefinition cube_r412 = rightBeak.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(120, 34).mirror().addBox(-0.4F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.3034F, -3.3246F, -3.4002F, -2.1683F, -0.8721F, -0.6715F));

		PartDefinition cube_r413 = rightBeak.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(79, 119).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.4653F, -3.017F, -3.8506F, -2.4042F, -0.4672F, -0.3517F));

		PartDefinition cube_r414 = rightBeak.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(119, 70).mirror().addBox(-0.075F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9288F, -3.6859F, -1.5422F, -1.1875F, -0.8248F, -0.3283F));

		PartDefinition cube_r415 = rightBeak.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(52, 119).mirror().addBox(-0.125F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4653F, -3.5565F, -1.9729F, -1.1869F, -0.7517F, -0.2563F));

		PartDefinition cube_r416 = rightBeak.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.1F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.5711F, -2.7634F, -1.0512F, -0.4477F, -0.2503F, 0.3427F));

		PartDefinition cube_r417 = rightBeak.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(110, 66).mirror().addBox(-0.0643F, -1.99F, -0.4851F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.6F, 2.0F, -3.1F, 0.9393F, -0.5049F, -0.0541F));

		PartDefinition cube_r418 = rightBeak.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(107, 32).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7956F, 0.5651F, -4.5457F, 2.7444F, -0.5646F, -0.1541F));

		PartDefinition cube_r419 = rightBeak.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(107, 28).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(3.1653F, 5.3783F, -5.2909F, 1.9678F, 0.0612F, -0.1448F));

		PartDefinition cube_r420 = rightBeak.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(42, 119).mirror().addBox(0.0F, -0.662F, 1.9669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0821F, 0.0217F, -6.2557F, -1.5337F, -0.1678F, -0.2168F));

		PartDefinition cube_r421 = rightBeak.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(37, 119).mirror().addBox(0.0F, -0.8695F, 0.9915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.0821F, 0.0217F, -6.2557F, -1.6384F, -0.1678F, -0.2168F));

		PartDefinition cube_r422 = rightBeak.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(119, 31).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0821F, 0.0217F, -6.2557F, -1.7693F, -0.1678F, -0.2168F));

		PartDefinition cube_r423 = rightBeak.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(119, 28).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.8933F, -0.8922F, -5.8965F, -1.942F, -0.1392F, -0.1497F));

		PartDefinition cube_r424 = rightBeak.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(27, 119).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.7423F, -1.6939F, -5.318F, -2.1927F, -0.1201F, -0.1006F));

		PartDefinition cube_r425 = rightBeak.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(5, 119).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.6044F, -2.4073F, -4.631F, -2.334F, -0.1099F, -0.0863F));

		PartDefinition cube_r426 = rightBeak.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(96, 118).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.4653F, -3.017F, -3.8506F, -2.4736F, -0.1099F, -0.0863F));

		PartDefinition cube_r427 = rightBeak.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(110, 87).mirror().addBox(-0.0309F, -0.865F, 1.3176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.2F, 2.6F, -4.0F, -2.8675F, -0.6508F, -0.2335F));

		PartDefinition cube_r428 = rightBeak.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(111, 112).mirror().addBox(-0.0309F, -0.7073F, 1.2398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2F, 2.6F, -4.0F, 3.0667F, -0.6508F, -0.2335F));

		PartDefinition cube_r429 = rightBeak.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(94, 27).mirror().addBox(-0.0893F, -0.2279F, 1.5267F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.6F, 2.0F, -3.1F, 2.8753F, -0.5646F, -0.1541F));

		PartDefinition cube_r430 = rightBeak.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(16, 94).mirror().addBox(-0.0763F, -1.7788F, 0.5131F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.7627F, -0.5303F, -2.8066F, 2.5565F, -0.3738F, 0.1803F));

		PartDefinition cube_r431 = rightBeak.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.0763F, 0.0622F, -0.2497F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7627F, -0.5303F, -2.8066F, -2.505F, -0.3738F, 0.1803F));

		PartDefinition cube_r432 = rightBeak.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(68, 47).mirror().addBox(-0.0763F, -0.8278F, -1.7491F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.7627F, -0.5303F, -2.8066F, -1.5887F, -0.3738F, 0.1803F));

		PartDefinition cube_r433 = rightBeak.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(55, 106).mirror().addBox(-0.0893F, -1.4859F, -0.0166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.6F, 2.0F, -3.1F, 2.2121F, -0.5646F, -0.1541F));

		PartDefinition cube_r434 = rightBeak.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.0893F, -0.89F, -0.0851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6F, 2.0F, -3.1F, 2.1248F, -0.5646F, -0.1541F));

		PartDefinition cube_r435 = rightBeak.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(110, 83).mirror().addBox(-0.2496F, -3.4094F, -3.0999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9552F, -0.3051F, 0.1061F));

		PartDefinition cube_r436 = rightBeak.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(100, 31).mirror().addBox(-0.2224F, -2.0273F, -1.3647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(0.7627F, -0.5303F, -2.4066F, -1.0552F, -0.3223F, 0.1769F));

		PartDefinition cube_r437 = rightBeak.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(106, 112).mirror().addBox(-0.2224F, -2.5662F, 0.5629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.7627F, -0.5303F, -2.4066F, -0.1825F, -0.3223F, 0.1769F));

		PartDefinition cube_r438 = rightBeak.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(7, 100).mirror().addBox(-0.2496F, -1.9852F, -2.0125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3879F, -0.3051F, 0.1061F));

		PartDefinition cube_r439 = rightBeak.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(91, 33).mirror().addBox(-2.3F, -0.8F, 0.2F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(3.4653F, 0.871F, -2.6431F, 2.2945F, -0.0045F, -0.2929F));

		PartDefinition cube_r440 = rightBeak.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(97, 76).mirror().addBox(-0.2496F, -2.4261F, -3.3189F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6061F, -0.3051F, 0.1061F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7F, -13.3781F, -1.7971F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(115, 67).addBox(-0.8F, -0.1699F, -2.4322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 115).addBox(-0.8F, -0.1699F, -1.8323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.802F, 9.5366F, -2.8943F, 0.3534F, -0.192F, -0.0873F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(113, 18).addBox(-0.7353F, -1.5753F, -0.4481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(113, 3).addBox(-0.7353F, -1.7503F, -0.9731F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.502F, 5.9958F, -9.4289F, 2.9714F, 0.0F, -0.1571F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(114, 32).addBox(-0.7353F, -2.7998F, 0.191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(22, 113).addBox(-0.7353F, -3.1854F, -0.1845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.502F, 5.9958F, -9.4289F, -2.7882F, 0.0F, -0.1571F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(111, 119).addBox(-0.7353F, -3.1237F, 0.7302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.502F, 5.9958F, -9.4289F, -2.57F, 0.0F, -0.1571F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(114, 28).addBox(-0.7353F, -4.1282F, 1.5385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.502F, 5.9958F, -9.4289F, -2.2646F, 0.0F, -0.1571F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(17, 114).addBox(-0.7353F, -4.6915F, 2.741F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.502F, 5.9958F, -9.4289F, -1.9155F, 0.0F, -0.1571F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(12, 114).addBox(-0.7353F, -5.0896F, 2.1673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(106, 119).addBox(-0.7353F, -5.4896F, 2.1673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.502F, 5.9958F, -9.4289F, -2.0377F, 0.0F, -0.1571F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(113, 48).addBox(-0.7353F, -4.2296F, 1.0407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.502F, 5.9958F, -9.4289F, -2.3431F, 0.0F, -0.1571F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(96, 10).addBox(-1.5F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9557F, 5.2865F, -8.5516F, -2.5069F, -0.2989F, -0.1903F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(28, 61).addBox(-1.0F, -1.5F, -4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.198F, 13.4234F, -2.0487F, -2.1131F, 0.4237F, 0.7111F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(94, 93).addBox(-1.5F, -0.8F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9557F, 5.2865F, -8.5516F, -2.4083F, -0.2641F, -0.231F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(65, 94).addBox(-1.5F, -0.6F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8436F, 4.6226F, -7.3203F, -2.743F, -0.0772F, -0.0407F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(94, 42).addBox(-1.5F, -0.8F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8436F, 4.6226F, -7.3203F, -2.6557F, -0.0772F, -0.0407F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(82, 55).addBox(-1.5F, -0.3F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.055F, 4.4074F, -5.4772F, -2.8792F, 0.1395F, -0.022F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(51, 82).addBox(-1.5F, -0.8F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.055F, 4.4074F, -5.4772F, -3.0492F, 0.1303F, 0.012F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(94, 63).addBox(-1.5F, -0.0227F, -1.1776F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3231F, 4.4119F, -4.3698F, -3.1086F, 0.273F, -0.0253F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(94, 59).addBox(-1.5F, -0.407F, -0.9519F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F))
				.texOffs(94, 38).addBox(-1.5F, -1.007F, -0.9519F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3231F, 4.4119F, -4.3698F, 2.9128F, 0.273F, -0.0253F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(52, 69).addBox(-3.5F, -0.2F, -0.3F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.502F, 6.0446F, -3.2579F, 2.4042F, 0.0F, 0.0F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(39, 69).addBox(-3.5F, -0.2F, -0.4F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.502F, 6.9668F, -2.8711F, 1.9679F, 0.0F, 0.0F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(101, 46).addBox(-0.8F, -0.5094F, -1.374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.802F, 9.5366F, -2.8943F, 0.6589F, -0.192F, -0.0873F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(65, 69).addBox(-0.9825F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
				.texOffs(81, 22).addBox(-0.5175F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6034F, 7.341F, -6.0235F, -0.1137F, 0.3427F, -0.0738F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7F, -13.3781F, -1.7971F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(115, 67).mirror().addBox(-0.2F, -0.1699F, -2.4322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 115).mirror().addBox(-0.2F, -0.1699F, -1.8323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.802F, 9.5366F, -2.8943F, 0.3534F, 0.192F, 0.0873F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(113, 18).mirror().addBox(-0.2647F, -1.5753F, -0.4481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(113, 3).mirror().addBox(-0.2647F, -1.7503F, -0.9731F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 5.9958F, -9.4289F, 2.9714F, 0.0F, 0.1571F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(114, 32).mirror().addBox(-0.2647F, -2.7998F, 0.191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(22, 113).mirror().addBox(-0.2647F, -3.1854F, -0.1845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 5.9958F, -9.4289F, -2.7882F, 0.0F, 0.1571F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(111, 119).mirror().addBox(-0.2647F, -3.1237F, 0.7302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 5.9958F, -9.4289F, -2.57F, 0.0F, 0.1571F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(114, 28).mirror().addBox(-0.2647F, -4.1282F, 1.5385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 5.9958F, -9.4289F, -2.2646F, 0.0F, 0.1571F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(17, 114).mirror().addBox(-0.2647F, -4.6915F, 2.741F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 5.9958F, -9.4289F, -1.9155F, 0.0F, 0.1571F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(12, 114).mirror().addBox(-0.2647F, -5.0896F, 2.1673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(106, 119).mirror().addBox(-0.2647F, -5.4896F, 2.1673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 5.9958F, -9.4289F, -2.0377F, 0.0F, 0.1571F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(113, 48).mirror().addBox(-0.2647F, -4.2296F, 1.0407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 5.9958F, -9.4289F, -2.3431F, 0.0F, 0.1571F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(96, 10).mirror().addBox(-0.5F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9557F, 5.2865F, -8.5516F, -2.5069F, 0.2989F, 0.1903F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(28, 61).mirror().addBox(0.0F, -1.5F, -4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.198F, 13.4234F, -2.0487F, -2.1131F, -0.4237F, -0.7111F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(94, 93).mirror().addBox(-0.5F, -0.8F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9557F, 5.2865F, -8.5516F, -2.4083F, 0.2641F, 0.231F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(65, 94).mirror().addBox(-0.5F, -0.6F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8436F, 4.6226F, -7.3203F, -2.743F, 0.0772F, 0.0407F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(94, 42).mirror().addBox(-0.5F, -0.8F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8436F, 4.6226F, -7.3203F, -2.6557F, 0.0772F, 0.0407F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(82, 55).mirror().addBox(-0.5F, -0.3F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.055F, 4.4074F, -5.4772F, -2.8792F, -0.1395F, 0.022F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(51, 82).mirror().addBox(-0.5F, -0.8F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.055F, 4.4074F, -5.4772F, -3.0492F, -0.1303F, -0.012F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(94, 63).mirror().addBox(-0.5F, -0.0227F, -1.1776F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3231F, 4.4119F, -4.3698F, -3.1086F, -0.273F, 0.0253F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(94, 59).mirror().addBox(-0.5F, -0.407F, -0.9519F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(94, 38).mirror().addBox(-0.5F, -1.007F, -0.9519F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3231F, 4.4119F, -4.3698F, 2.9128F, -0.273F, 0.0253F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(52, 69).mirror().addBox(-0.5F, -0.2F, -0.3F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 6.0446F, -3.2579F, 2.4042F, 0.0F, 0.0F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(39, 69).mirror().addBox(-0.5F, -0.2F, -0.4F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 6.9668F, -2.8711F, 1.9679F, 0.0F, 0.0F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(101, 46).mirror().addBox(-0.2F, -0.5094F, -1.374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.802F, 9.5366F, -2.8943F, 0.6589F, 0.192F, 0.0873F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(65, 69).mirror().addBox(-1.0175F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(81, 22).mirror().addBox(-0.4825F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6034F, 7.341F, -6.0235F, -0.1137F, -0.3427F, 0.0738F));

		PartDefinition kineticMaxillae = head.addOrReplaceChild("kineticMaxillae", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9687F, -3.4498F, -4.0832F, -0.3491F, -0.0349F, -0.0873F));

		PartDefinition cube_r483 = kineticMaxillae.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(76, 60).addBox(-0.3752F, -0.5054F, -3.6282F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(-0.0803F, 3.1126F, -0.8456F, -1.817F, 0.3295F, -0.0235F));

		PartDefinition cube_r484 = kineticMaxillae.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(57, 76).addBox(-0.3752F, -1.0216F, -3.6062F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0803F, 3.1126F, -0.8456F, -1.7298F, 0.3295F, -0.0235F));

		PartDefinition cube_r485 = kineticMaxillae.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(48, 106).addBox(-0.3752F, -1.397F, -1.9434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0803F, 3.1126F, -0.8456F, -1.3982F, 0.3295F, -0.0235F));

		PartDefinition cube_r486 = kineticMaxillae.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(117, 93).addBox(-0.3752F, -0.8062F, 0.2716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(-0.0803F, 3.1126F, -0.8456F, -0.159F, 0.3295F, -0.0235F));

		PartDefinition cube_r487 = kineticMaxillae.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(94, 97).addBox(-0.3682F, -0.9167F, -0.961F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-0.0803F, 3.1126F, -0.8456F, -0.8047F, 0.3295F, -0.0235F));

		PartDefinition kineticMaxillae2 = kineticMaxillae.addOrReplaceChild("kineticMaxillae2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4928F, 3.2024F, -0.2909F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r488 = kineticMaxillae2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(59, 7).addBox(-0.5477F, -0.4027F, -8.6871F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4928F, -0.1024F, -0.8091F, -0.5255F, 0.0089F, -0.0649F));

		PartDefinition cube_r489 = kineticMaxillae2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(0, 78).addBox(-0.2356F, -0.5742F, -4.2682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.244F)), PartPose.offsetAndRotation(-0.4928F, -0.1024F, -0.8091F, -0.4769F, 0.1201F, -0.0224F));

		PartDefinition cube_r490 = kineticMaxillae2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(29, 106).addBox(-0.5F, -0.75F, -0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.3F, -0.2F, -1.4F, -0.3199F, 0.1201F, -0.0224F));

		PartDefinition kineticMaxillae3 = kineticMaxillae.addOrReplaceChild("kineticMaxillae3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.357F, 2.9465F, -1.8431F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r491 = kineticMaxillae3.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(68, 76).addBox(-0.5F, -0.25F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.26F))
				.texOffs(76, 66).addBox(-0.5F, 0.2F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.9063F, -3.5708F, -5.2122F, -0.3255F, 0.3202F, -0.0823F));

		PartDefinition cube_r492 = kineticMaxillae3.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(65, 17).addBox(-0.5F, -0.1F, -1.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5626F, -1.1595F, -1.7726F, -1.5472F, 0.3202F, -0.0823F));

		PartDefinition cube_r493 = kineticMaxillae3.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(25, 87).addBox(-0.5F, 0.2F, -1.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-0.5626F, -1.1595F, -1.7726F, -1.2418F, 0.3202F, -0.0823F));

		PartDefinition cube_r494 = kineticMaxillae3.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(78, 83).addBox(-0.5F, -0.7F, -3.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5626F, -1.1595F, -1.7726F, -0.6745F, 0.3202F, -0.0823F));

		PartDefinition cube_r495 = kineticMaxillae3.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(15, 52).addBox(-0.3682F, -0.4036F, -5.7472F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.7349F, 0.3295F, -0.0235F));

		PartDefinition kineticMaxillae4 = head.addOrReplaceChild("kineticMaxillae4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9687F, -3.4498F, -4.0832F, -0.3491F, 0.0349F, 0.0873F));

		PartDefinition cube_r496 = kineticMaxillae4.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(76, 60).mirror().addBox(-0.6248F, -0.5054F, -3.6282F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(0.0803F, 3.1126F, -0.8456F, -1.817F, -0.3295F, 0.0235F));

		PartDefinition cube_r497 = kineticMaxillae4.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(57, 76).mirror().addBox(-0.6248F, -1.0216F, -3.6062F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.0803F, 3.1126F, -0.8456F, -1.7298F, -0.3295F, 0.0235F));

		PartDefinition cube_r498 = kineticMaxillae4.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(48, 106).mirror().addBox(-0.6248F, -1.397F, -1.9434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0803F, 3.1126F, -0.8456F, -1.3982F, -0.3295F, 0.0235F));

		PartDefinition cube_r499 = kineticMaxillae4.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(117, 93).mirror().addBox(-0.6248F, -0.8062F, 0.2716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(0.0803F, 3.1126F, -0.8456F, -0.159F, -0.3295F, 0.0235F));

		PartDefinition cube_r500 = kineticMaxillae4.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(94, 97).mirror().addBox(-0.6318F, -0.9167F, -0.961F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(0.0803F, 3.1126F, -0.8456F, -0.8047F, -0.3295F, 0.0235F));

		PartDefinition kineticMaxillae5 = kineticMaxillae4.addOrReplaceChild("kineticMaxillae5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4928F, 3.2024F, -0.2909F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r501 = kineticMaxillae5.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(59, 7).mirror().addBox(-0.4523F, -0.4027F, -8.6871F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4928F, -0.1024F, -0.8091F, -0.5255F, -0.0089F, 0.0649F));

		PartDefinition cube_r502 = kineticMaxillae5.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.7644F, -0.5742F, -4.2682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.244F)).mirror(false), PartPose.offsetAndRotation(0.4928F, -0.1024F, -0.8091F, -0.4769F, -0.1201F, 0.0224F));

		PartDefinition cube_r503 = kineticMaxillae5.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(29, 106).mirror().addBox(-0.5F, -0.75F, -0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.2F, -1.4F, -0.3199F, -0.1201F, 0.0224F));

		PartDefinition kineticMaxillae6 = kineticMaxillae4.addOrReplaceChild("kineticMaxillae6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.357F, 2.9465F, -1.8431F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r504 = kineticMaxillae6.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(68, 76).mirror().addBox(-0.5F, -0.25F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.26F)).mirror(false)
				.texOffs(76, 66).mirror().addBox(-0.5F, 0.2F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.9063F, -3.5708F, -5.2122F, -0.3255F, -0.3202F, 0.0823F));

		PartDefinition cube_r505 = kineticMaxillae6.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(65, 17).mirror().addBox(-0.5F, -0.1F, -1.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.5626F, -1.1595F, -1.7726F, -1.5472F, -0.3202F, 0.0823F));

		PartDefinition cube_r506 = kineticMaxillae6.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.5F, 0.2F, -1.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(0.5626F, -1.1595F, -1.7726F, -1.2418F, -0.3202F, 0.0823F));

		PartDefinition cube_r507 = kineticMaxillae6.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(-0.5F, -0.7F, -3.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5626F, -1.1595F, -1.7726F, -0.6745F, -0.3202F, 0.0823F));

		PartDefinition cube_r508 = kineticMaxillae6.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(15, 52).mirror().addBox(-0.6318F, -0.4036F, -5.7472F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.7349F, -0.3295F, 0.0235F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.6081F, -5.142F, 0.1229F, 0.0F, 0.0F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(103, 66).mirror().addBox(-1.4074F, -13.4735F, -3.3106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.511F, 14.3966F, -5.9024F, -0.5886F, -0.3354F, 0.2444F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(87, 88).mirror().addBox(-2.4987F, -12.1757F, 5.7679F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.511F, 14.3966F, -5.9024F, -0.0254F, 0.0289F, 0.1486F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(80, 103).mirror().addBox(-1.4241F, -13.5119F, 1.027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.511F, 14.3966F, -5.9024F, -0.3224F, -0.1456F, 0.153F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(101, 101).mirror().addBox(0.1242F, -0.156F, -1.5913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.3317F, 0.8258F, 0.3881F, 0.8864F, -0.1222F, -0.139F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(76, 115).mirror().addBox(-0.455F, -0.5485F, -0.4774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, 0.8914F, -0.2618F, -0.0352F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(101, 50).mirror().addBox(0.1242F, -0.3273F, -2.6533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.3317F, 0.8258F, 0.3881F, 2.1082F, -0.1222F, -0.139F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(47, 87).mirror().addBox(0.1242F, -1.7374F, -3.0319F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3317F, 0.8258F, 0.3881F, 2.6929F, -0.1222F, -0.139F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(96, 81).mirror().addBox(-0.455F, -1.6597F, 0.0409F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, 2.8287F, -0.2618F, -0.0352F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(115, 78).mirror().addBox(-0.455F, -0.6634F, -1.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, -0.374F, -0.2618F, -0.0352F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(49, 97).mirror().addBox(-0.455F, -1.7299F, 1.9818F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, 2.7938F, -0.2618F, -0.0352F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(115, 81).mirror().addBox(-0.455F, -0.1194F, -1.931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, -0.854F, -0.2618F, -0.0352F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(96, 86).mirror().addBox(-0.455F, 1.8057F, -0.6946F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, -2.1193F, -0.2618F, -0.0352F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(79, 76).mirror().addBox(-0.455F, 3.7307F, -1.0236F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, -2.032F, -0.2618F, -0.0352F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(31, 80).mirror().addBox(-0.455F, -1.1954F, 3.9735F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, 2.9247F, -0.2618F, -0.0352F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(115, 100).mirror().addBox(-0.455F, 1.4561F, 6.3496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, 2.8985F, -0.2618F, -0.0352F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(102, 54).mirror().addBox(-0.455F, -5.3356F, 4.4227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, 1.9822F, -0.2618F, -0.0352F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(87, 93).mirror().addBox(-0.455F, 1.7717F, 5.8758F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, -2.8785F, -0.2618F, -0.0352F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(56, 97).mirror().addBox(-0.455F, -0.0385F, 7.0904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, 2.8811F, -0.2618F, -0.0352F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(115, 103).mirror().addBox(-0.455F, -7.0178F, 6.0901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, 1.9648F, -0.2618F, -0.0352F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(110, 62).mirror().addBox(-0.455F, -9.6491F, -3.5326F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, 0.9176F, -0.2618F, -0.0352F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(119, 114).mirror().addBox(0.0689F, -2.6085F, -2.5596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8376F, 1.3045F, -8.6384F, -0.5983F, -0.5408F, -0.0397F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(36, 109).mirror().addBox(-0.455F, 3.628F, 6.3936F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7317F, 0.8258F, 0.3881F, -2.6167F, -0.2618F, -0.0352F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(106, 109).mirror().addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8987F, 1.2838F, -8.1473F, -1.6379F, -0.2671F, -0.1073F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(97, 7).mirror().addBox(0.0689F, -1.0603F, -1.0275F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8376F, 1.3045F, -8.6384F, -0.2929F, -0.5408F, -0.0397F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(0.0689F, -2.0292F, 0.0154F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8376F, 1.3045F, -8.6384F, 1.2343F, -0.5408F, -0.0397F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(116, 119).mirror().addBox(0.0689F, -0.3372F, 2.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 6).mirror().addBox(-0.1311F, -0.5372F, 2.801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.8376F, 1.3045F, -8.6384F, 2.6306F, -0.5408F, -0.0397F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(0.0689F, 1.968F, -0.2022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8376F, 1.3045F, -8.6384F, -2.5618F, -0.5408F, -0.0397F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(77, 107).mirror().addBox(0.0689F, -1.6635F, -2.8145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8376F, 1.3045F, -8.6384F, -0.7292F, -0.5408F, -0.0397F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(20, 120).mirror().addBox(-0.1311F, 1.7027F, 1.5839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.8376F, 1.3045F, -8.6384F, -2.9108F, -0.5408F, -0.0397F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(108, 44).mirror().addBox(-0.5F, -0.225F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0609F, -0.6553F, -8.9552F, -0.2492F, -0.5408F, -0.0397F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(22, 110).mirror().addBox(-1.0F, -0.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2662F, 0.6399F, -7.1322F, -1.4067F, 0.1299F, -0.0454F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(102, 54).addBox(-0.545F, -5.3356F, 4.4227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, 1.9822F, 0.2618F, 0.0352F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(115, 100).addBox(-0.545F, 1.4561F, 6.3496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, 2.8985F, 0.2618F, 0.0352F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(79, 76).addBox(-0.545F, 3.7307F, -1.0236F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, -2.032F, 0.2618F, 0.0352F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(96, 86).addBox(-0.545F, 1.8057F, -0.6946F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, -2.1193F, 0.2618F, 0.0352F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(115, 81).addBox(-0.545F, -0.1194F, -1.931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, -0.854F, 0.2618F, 0.0352F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(115, 78).addBox(-0.545F, -0.6634F, -1.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, -0.374F, 0.2618F, 0.0352F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(76, 115).addBox(-0.545F, -0.5485F, -0.4774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, 0.8914F, 0.2618F, 0.0352F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(119, 114).addBox(-1.0689F, -2.6085F, -2.5596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8376F, 1.3045F, -8.6384F, -0.5983F, 0.5408F, 0.0397F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(110, 62).addBox(-0.545F, -9.6491F, -3.5326F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, 0.9176F, 0.2618F, 0.0352F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(115, 103).addBox(-0.545F, -7.0178F, 6.0901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, 1.9648F, 0.2618F, 0.0352F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(56, 97).addBox(-0.545F, -0.0385F, 7.0904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, 2.8811F, 0.2618F, 0.0352F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(108, 44).addBox(-0.5F, -0.225F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0609F, -0.6553F, -8.9552F, -0.2492F, 0.5408F, 0.0397F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(77, 107).addBox(-1.0689F, -1.6635F, -2.8145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8376F, 1.3045F, -8.6384F, -0.7292F, 0.5408F, 0.0397F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(0, 120).addBox(-1.0689F, 1.968F, -0.2022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8376F, 1.3045F, -8.6384F, -2.5618F, 0.5408F, 0.0397F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(20, 120).addBox(-0.8689F, 1.7027F, 1.5839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8376F, 1.3045F, -8.6384F, -2.9108F, 0.5408F, 0.0397F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(120, 6).addBox(-0.8689F, -0.5372F, 2.801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(116, 119).addBox(-1.0689F, -0.3372F, 2.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8376F, 1.3045F, -8.6384F, 2.6306F, 0.5408F, 0.0397F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(0, 110).addBox(-2.0689F, -2.0292F, 0.0154F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8376F, 1.3045F, -8.6384F, 1.2343F, 0.5408F, 0.0397F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(97, 7).addBox(-3.0689F, -1.0603F, -1.0275F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8376F, 1.3045F, -8.6384F, -0.2929F, 0.5408F, 0.0397F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(22, 110).addBox(-1.0F, -0.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7338F, 0.6399F, -7.1322F, -1.4067F, -0.1299F, 0.0454F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(106, 109).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8987F, 1.2838F, -8.1473F, -1.6379F, 0.2671F, 0.1073F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(36, 109).addBox(-0.545F, 3.628F, 6.3936F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, -2.6167F, 0.2618F, 0.0352F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(87, 93).addBox(-0.545F, 1.7717F, 5.8758F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, -2.8785F, 0.2618F, 0.0352F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(31, 80).addBox(-0.545F, -1.1954F, 3.9735F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, 2.9247F, 0.2618F, 0.0352F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(49, 97).addBox(-0.545F, -1.7299F, 1.9818F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, 2.7938F, 0.2618F, 0.0352F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(96, 81).addBox(-0.545F, -1.6597F, 0.0409F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.7317F, 0.8258F, 0.3881F, 2.8287F, 0.2618F, 0.0352F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(47, 87).addBox(-1.1242F, -1.7374F, -3.0319F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3317F, 0.8258F, 0.3881F, 2.6929F, 0.1222F, 0.139F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(101, 50).addBox(-1.1242F, -0.3273F, -2.6533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.3317F, 0.8258F, 0.3881F, 2.1082F, 0.1222F, 0.139F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(101, 101).addBox(-1.1242F, -0.156F, -1.5913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.3317F, 0.8258F, 0.3881F, 0.8864F, 0.1222F, 0.139F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(80, 103).addBox(0.4241F, -13.5119F, 1.027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.489F, 14.3966F, -5.9024F, -0.3224F, 0.1456F, -0.153F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(87, 88).addBox(1.4987F, -12.1757F, 5.7679F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.489F, 14.3966F, -5.9024F, -0.0254F, -0.0289F, -0.1486F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(103, 66).addBox(0.4074F, -13.4735F, -3.3106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.489F, 14.3966F, -5.9024F, -0.5886F, 0.3354F, -0.2444F));

		return LayerDefinition.create(meshdefinition, 125, 125);
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