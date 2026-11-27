package fossils.fossils.client.blockentity.model.carcharodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CarcharodontosaurusFossilModel extends SkullModelBase {
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

	public CarcharodontosaurusFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.4396F, 0.6285F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 28).addBox(-0.006F, -6.9256F, -0.2044F, 0.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7051F, -0.9892F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 106).addBox(-0.503F, -6.6168F, -1.0272F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2893F, -1.9564F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2317F, 2.6125F, 2.8481F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(108, 103).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3668F, -6.7514F, -3.6478F, -0.0038F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 73).addBox(-0.5827F, 4.4931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6795F, -9.3081F, 5.4213F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4738F, -8.9996F, 0.7077F, -0.0823F, -0.0321F, -0.4016F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(75, 91).addBox(-0.5F, -2.3F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.079F, -4.7219F, 3.2357F, 0.2908F, -0.0686F, -0.3307F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(104, 17).addBox(-0.5F, -1.6F, -1.8F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4042F, -4.3553F, 5.7548F, -1.6512F, -0.0327F, -0.4104F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 143).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4505F, -6.0584F, 8.2448F, 1.6432F, -0.0391F, -0.4053F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(136, 110).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1216F, -5.3533F, 7.6268F, 2.4722F, -0.0391F, -0.4053F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 115).addBox(-0.5F, -1.1F, -3.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -7.121F, 8.4873F, 0.7705F, -0.0391F, -0.4053F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(112, 121).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.4409F, -8.6881F, 4.6961F, -1.5857F, -0.0391F, -0.4053F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 120).addBox(-0.5F, -0.1F, -2.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2538F, -8.0617F, 6.6152F, -0.2767F, -0.0391F, -0.4053F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(32, 113).addBox(-0.5F, -0.1F, -3.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2833F, -8.1195F, 6.7248F, 0.9887F, -0.0391F, -0.4053F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 148).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2638F, 8.3135F, 10.3846F, 2.5352F, 0.0133F, -0.115F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 148).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3321F, 8.805F, 11.2528F, 1.0517F, 0.0133F, -0.115F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(147, 134).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3548F, 8.8857F, 12.2492F, -0.0828F, 0.0133F, -0.115F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(15, 143).addBox(-1.2464F, -0.2885F, 11.1178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1108F, 1.3732F, 2.6884F, -0.6064F, 0.0133F, -0.115F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(78, 142).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0392F, 6.4437F, 9.2124F, 0.659F, 0.0146F, -0.1162F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(47, 141).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0102F, 5.9059F, 9.9382F, 1.0429F, 0.0104F, -0.1133F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(109, 134).addBox(-0.5F, -1.5F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1361F, 7.1034F, 10.9052F, 0.9207F, 0.0104F, -0.1133F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(22, 104).addBox(-1.0235F, -0.0885F, -0.7227F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1108F, 1.3732F, 2.6884F, 0.9644F, 0.0104F, -0.1133F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(145, 99).addBox(-0.5F, -1.0F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(145, 96).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7072F, 3.5254F, 2.7502F, 0.4066F, -0.0597F, 0.1639F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(129, 122).addBox(-1.6492F, -3.1094F, -1.4359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3116F, 3.4667F, 5.3561F, 1.0611F, -0.0597F, 0.1639F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(52, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3247F, 1.5629F, 1.7953F, 1.1483F, -0.0597F, 0.1639F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(113, 109).addBox(-0.5F, -2.3F, -1.4F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0773F, 0.6285F, 0.2621F, 1.7592F, -0.0597F, 0.1639F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(141, 122).addBox(-0.5F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0124F, -0.5575F, 1.4187F, 0.3387F, -0.1146F, 0.1466F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(31, 129).addBox(-1.6985F, -6.8976F, -1.6203F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3116F, 3.4667F, 5.3561F, 0.6505F, -0.0654F, 0.1618F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(64, 84).addBox(-0.5F, -2.35F, -1.55F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0177F, -0.4237F, -3.0993F, -1.8854F, 0.0639F, 0.0248F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(119, 129).addBox(-1.2468F, -1.3574F, 5.1346F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 127).addBox(-1.2468F, -3.1574F, 4.9346F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2869F, 7.1819F, -5.7141F, -1.2847F, 0.0864F, -0.1568F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(134, 105).addBox(-1.2468F, 3.96F, 1.7788F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2869F, 7.1819F, -5.7141F, -0.5866F, 0.0864F, -0.1568F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(15, 138).addBox(-1.2983F, 2.321F, 4.5859F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2869F, 7.1819F, -5.7141F, -1.0229F, 0.0864F, -0.1568F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(142, 134).addBox(-1.2582F, 2.9249F, 5.845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2869F, 7.1819F, -5.7141F, -1.3284F, 0.0864F, -0.1568F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(142, 87).addBox(-1.2582F, 1.6767F, 6.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2869F, 7.1819F, -5.7141F, -1.5029F, 0.0864F, -0.1568F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(118, 147).addBox(-1.2864F, 1.6968F, 6.1159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2869F, 7.1819F, -5.7141F, -1.3629F, 0.0809F, -0.1597F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(94, 147).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(147, 87).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6571F, 12.7001F, -1.7444F, -0.9266F, 0.0809F, -0.1597F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(86, 147).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6103F, 12.031F, -1.0027F, -2.4101F, 0.0809F, -0.1597F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(111, 54).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7094F, 13.5356F, -2.7459F, -2.8465F, 0.0809F, -0.1597F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 148).addBox(-1.2864F, 1.3468F, 5.9351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2869F, 7.1819F, -5.7141F, -1.2757F, 0.0809F, -0.1597F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(47, 136).addBox(-1.2467F, 2.3188F, 0.7634F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2869F, 7.6819F, -5.7141F, -0.3946F, 0.0864F, -0.1568F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(129, 134).addBox(-1.2468F, 3.3807F, 0.2186F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2869F, 7.1819F, -5.7141F, -0.1066F, 0.0864F, -0.1568F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(138, 30).addBox(-1.2407F, 2.7863F, -4.077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2869F, 7.1819F, -5.7141F, 1.027F, 0.1061F, -0.1443F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(26, 124).addBox(-1.1796F, -0.2707F, -0.2049F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2869F, 7.6819F, -5.7141F, -0.0379F, 0.1135F, -0.1386F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(15, 127).addBox(-1.1741F, -0.02F, 0.0215F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2869F, 7.6819F, -5.7141F, 0.0842F, 0.1182F, -0.1345F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(134, 48).addBox(-1.1131F, 1.0279F, 1.7714F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2869F, -1.2181F, -6.4141F, -0.2191F, 0.0679F, 0.0092F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(21, 116).addBox(-0.9239F, 2.0775F, 1.8026F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.2869F, -1.2181F, -6.4141F, -0.1138F, 0.0622F, 0.0287F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(113, 41).addBox(-1.113F, -0.1248F, -0.0827F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2869F, -1.2181F, -6.4141F, 0.0863F, 0.0679F, 0.0092F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(119, 121).addBox(-0.966F, 3.3775F, 0.1116F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2869F, -1.2181F, -6.4141F, 0.0432F, 0.0632F, 0.0265F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(124, 96).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0545F, -3.9386F, -2.8245F, 0.0257F, 0.0639F, 0.0248F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(108, 95).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2128F, -1.2976F, -6.5794F, -0.4106F, 0.0639F, 0.0248F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(61, 30).addBox(-0.3844F, -0.3139F, -1.6767F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0524F, -4.6544F, -2.1189F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(118, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0084F, -6.1101F, -7.151F, 1.4661F, -0.3289F, -0.3595F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(91, 120).addBox(-0.5F, -2.2F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5217F, -5.3171F, -4.9401F, 1.7628F, -0.3289F, -0.3595F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(147, 0).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5217F, -5.3171F, -4.9401F, 0.9774F, -0.3289F, -0.3595F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 119).addBox(0.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0753F, -9.5114F, -2.8103F, 2.8737F, -0.0936F, -0.3718F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(50, 119).addBox(0.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.7763F, -9.7343F, -4.7753F, 3.0912F, -0.1808F, -0.3673F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(124, 36).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5494F, -9.5708F, -6.4238F, 1.8675F, -0.3289F, -0.3595F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(124, 31).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2923F, -8.1435F, -5.6579F, 1.4312F, -0.3289F, -0.3595F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(32, 118).addBox(-0.5F, -1.225F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.402F, -8.1643F, -5.3783F, 1.0385F, -0.3289F, -0.3595F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(42, 98).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4292F, -8.8839F, 0.839F, -0.1871F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2317F, 2.6125F, 2.8481F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(108, 103).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3668F, -6.7514F, -3.6478F, -0.0038F, 0.0321F, 0.4016F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(25, 73).mirror().addBox(-0.4173F, 4.4931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -9.3081F, 5.4213F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.5F, 0.1F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4738F, -8.9996F, 0.7077F, -0.0823F, 0.0321F, 0.4016F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(75, 91).mirror().addBox(-0.5F, -2.3F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.079F, -4.7219F, 3.2357F, 0.2908F, 0.0686F, 0.3307F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(104, 17).mirror().addBox(-0.5F, -1.6F, -1.8F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4042F, -4.3553F, 5.7548F, -1.6512F, 0.0327F, 0.4104F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(30, 143).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4505F, -6.0584F, 8.2448F, 1.6432F, 0.0391F, 0.4053F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(136, 110).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1216F, -5.3533F, 7.6268F, 2.4722F, 0.0391F, 0.4053F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-0.5F, -1.1F, -3.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9233F, -7.121F, 8.4873F, 0.7705F, 0.0391F, 0.4053F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(112, 121).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.4409F, -8.6881F, 4.6961F, -1.5857F, 0.0391F, 0.4053F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(105, 120).mirror().addBox(-0.5F, -0.1F, -2.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2538F, -8.0617F, 6.6152F, -0.2767F, 0.0391F, 0.4053F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(32, 113).mirror().addBox(-0.5F, -0.1F, -3.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.2833F, -8.1195F, 6.7248F, 0.9887F, 0.0391F, 0.4053F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(5, 148).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2638F, 8.3135F, 10.3846F, 2.5352F, -0.0133F, 0.115F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 148).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3321F, 8.805F, 11.2528F, 1.0517F, -0.0133F, 0.115F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(147, 134).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3548F, 8.8857F, 12.2492F, -0.0828F, -0.0133F, 0.115F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(15, 143).mirror().addBox(0.2464F, -0.2885F, 11.1178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1108F, 1.3732F, 2.6884F, -0.6064F, -0.0133F, 0.115F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(78, 142).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0392F, 6.4437F, 9.2124F, 0.659F, -0.0146F, 0.1162F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(47, 141).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0102F, 5.9059F, 9.9382F, 1.0429F, -0.0104F, 0.1133F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(109, 134).mirror().addBox(-0.5F, -1.5F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1361F, 7.1034F, 10.9052F, 0.9207F, -0.0104F, 0.1133F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(22, 104).mirror().addBox(0.0235F, -0.0885F, -0.7227F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1108F, 1.3732F, 2.6884F, 0.9644F, -0.0104F, 0.1133F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(145, 99).mirror().addBox(-0.5F, -1.0F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(145, 96).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7072F, 3.5254F, 2.7502F, 0.4066F, 0.0597F, -0.1639F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(129, 122).mirror().addBox(0.6492F, -3.1094F, -1.4359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 3.4667F, 5.3561F, 1.0611F, 0.0597F, -0.1639F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(52, 141).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3247F, 1.5629F, 1.7953F, 1.1483F, 0.0597F, -0.1639F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(113, 109).mirror().addBox(-0.5F, -2.3F, -1.4F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0773F, 0.6285F, 0.2621F, 1.7592F, 0.0597F, -0.1639F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(141, 122).mirror().addBox(-0.5F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0124F, -0.5575F, 1.4187F, 0.3387F, 0.1146F, -0.1466F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(31, 129).mirror().addBox(0.6985F, -6.8976F, -1.6203F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3116F, 3.4667F, 5.3561F, 0.6505F, 0.0654F, -0.1618F));

		PartDefinition cube_r86 = bone5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 84).mirror().addBox(-0.5F, -2.35F, -1.55F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0177F, -0.4237F, -3.0993F, -1.8854F, -0.0639F, -0.0248F));

		PartDefinition cube_r87 = bone5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(119, 129).mirror().addBox(0.2468F, -1.3574F, 5.1346F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 127).mirror().addBox(0.2468F, -3.1574F, 4.9346F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.1819F, -5.7141F, -1.2847F, -0.0864F, 0.1568F));

		PartDefinition cube_r88 = bone5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(134, 105).mirror().addBox(0.2468F, 3.96F, 1.7788F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.1819F, -5.7141F, -0.5866F, -0.0864F, 0.1568F));

		PartDefinition cube_r89 = bone5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(15, 138).mirror().addBox(0.2983F, 2.321F, 4.5859F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.1819F, -5.7141F, -1.0229F, -0.0864F, 0.1568F));

		PartDefinition cube_r90 = bone5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(142, 134).mirror().addBox(0.2582F, 2.9249F, 5.845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.1819F, -5.7141F, -1.3284F, -0.0864F, 0.1568F));

		PartDefinition cube_r91 = bone5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(142, 87).mirror().addBox(0.2582F, 1.6767F, 6.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.1819F, -5.7141F, -1.5029F, -0.0864F, 0.1568F));

		PartDefinition cube_r92 = bone5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(118, 147).mirror().addBox(0.2864F, 1.6968F, 6.1159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.1819F, -5.7141F, -1.3629F, -0.0809F, 0.1597F));

		PartDefinition cube_r93 = bone5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(94, 147).mirror().addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(147, 87).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6571F, 12.7001F, -1.7444F, -0.9266F, -0.0809F, 0.1597F));

		PartDefinition cube_r94 = bone5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(86, 147).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6103F, 12.031F, -1.0027F, -2.4101F, -0.0809F, 0.1597F));

		PartDefinition cube_r95 = bone5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(111, 54).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7094F, 13.5356F, -2.7459F, -2.8465F, -0.0809F, 0.1597F));

		PartDefinition cube_r96 = bone5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(10, 148).mirror().addBox(0.2864F, 1.3468F, 5.9351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.1819F, -5.7141F, -1.2757F, -0.0809F, 0.1597F));

		PartDefinition cube_r97 = bone5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(47, 136).mirror().addBox(0.2467F, 2.3188F, 0.7634F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.6819F, -5.7141F, -0.3946F, -0.0864F, 0.1568F));

		PartDefinition cube_r98 = bone5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(129, 134).mirror().addBox(0.2468F, 3.3807F, 0.2186F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.1819F, -5.7141F, -0.1066F, -0.0864F, 0.1568F));

		PartDefinition cube_r99 = bone5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(138, 30).mirror().addBox(0.2407F, 2.7863F, -4.077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.1819F, -5.7141F, 1.027F, -0.1061F, 0.1443F));

		PartDefinition cube_r100 = bone5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(26, 124).mirror().addBox(0.1796F, -0.2707F, -0.2049F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.6819F, -5.7141F, -0.0379F, -0.1135F, 0.1386F));

		PartDefinition cube_r101 = bone5.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(15, 127).mirror().addBox(0.1741F, -0.02F, 0.0215F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, 7.6819F, -5.7141F, 0.0842F, -0.1182F, 0.1345F));

		PartDefinition cube_r102 = bone5.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(134, 48).mirror().addBox(0.1131F, 1.0279F, 1.7714F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, -1.2181F, -6.4141F, -0.2191F, -0.0679F, -0.0092F));

		PartDefinition cube_r103 = bone5.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(21, 116).mirror().addBox(-0.0761F, 2.0775F, 1.8026F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, -1.2181F, -6.4141F, -0.1138F, -0.0622F, -0.0287F));

		PartDefinition cube_r104 = bone5.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(113, 41).mirror().addBox(0.113F, -0.1248F, -0.0827F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, -1.2181F, -6.4141F, 0.0863F, -0.0679F, -0.0092F));

		PartDefinition cube_r105 = bone5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(119, 121).mirror().addBox(-0.034F, 3.3775F, 0.1116F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2869F, -1.2181F, -6.4141F, 0.0432F, -0.0632F, -0.0265F));

		PartDefinition cube_r106 = bone5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(124, 96).mirror().addBox(-0.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0545F, -3.9386F, -2.8245F, 0.0257F, -0.0639F, -0.0248F));

		PartDefinition cube_r107 = bone5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(108, 95).mirror().addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.2128F, -1.2976F, -6.5794F, -0.4106F, -0.0639F, -0.0248F));

		PartDefinition cube_r108 = bone5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(61, 30).mirror().addBox(-0.6156F, -0.3139F, -1.6767F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0524F, -4.6544F, -2.1189F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r109 = bone5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(118, 5).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0084F, -6.1101F, -7.151F, 1.4661F, 0.3289F, 0.3595F));

		PartDefinition cube_r110 = bone5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(91, 120).mirror().addBox(-0.5F, -2.2F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5217F, -5.3171F, -4.9401F, 1.7628F, 0.3289F, 0.3595F));

		PartDefinition cube_r111 = bone5.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(147, 0).mirror().addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5217F, -5.3171F, -4.9401F, 0.9774F, 0.3289F, 0.3595F));

		PartDefinition cube_r112 = bone5.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(84, 119).mirror().addBox(-1.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.0753F, -9.5114F, -2.8103F, 2.8737F, 0.0936F, 0.3718F));

		PartDefinition cube_r113 = bone5.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 119).mirror().addBox(-1.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.7763F, -9.7343F, -4.7753F, 3.0912F, 0.1808F, 0.3673F));

		PartDefinition cube_r114 = bone5.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(124, 36).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5494F, -9.5708F, -6.4238F, 1.8675F, 0.3289F, 0.3595F));

		PartDefinition cube_r115 = bone5.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(124, 31).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2923F, -8.1435F, -5.6579F, 1.4312F, 0.3289F, 0.3595F));

		PartDefinition cube_r116 = bone5.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(32, 118).mirror().addBox(-0.5F, -1.225F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.402F, -8.1643F, -5.3783F, 1.0385F, 0.3289F, 0.3595F));

		PartDefinition cube_r117 = bone5.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4292F, -8.8839F, 0.839F, -0.1871F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.6765F, 1.5338F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(133, 66).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 14.3131F, -1.8377F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(120, 17).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, 15.2267F, -2.2445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(115, 37).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 15.778F, -4.167F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(86, 97).addBox(-5.1F, -1.9807F, -2.918F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 13.7054F, -2.3045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 120).addBox(-5.1F, -2.532F, 0.2317F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 12.2777F, -3.7694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 108).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 11.0305F, -4.6621F, 2.8885F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(129, 17).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 10.0624F, -4.4117F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(15, 77).addBox(-1.0F, -9.0F, 0.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 10.0624F, -4.4117F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(141, 68).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.5355F, -0.852F, 3.098F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(25, 137).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 4.5355F, -0.852F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(9, 109).addBox(-5.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 85).addBox(-1.5F, -1.6F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1302F, 0.171F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(75, 84).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 2.0207F, -2.3915F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg1.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(115, 32).addBox(-1.0F, 0.7F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 1.0127F, -1.0785F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 16.9292F, -3.1251F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(62, 121).addBox(-1.1F, 1.5765F, -0.6545F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(127, 51).addBox(-1.1F, -0.8465F, -1.0797F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(93, 48).addBox(-1.0F, 0.1F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 1.1606F, -0.8554F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(74, 106).addBox(-1.0F, -0.425F, -0.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(51, 98).addBox(-0.1F, -0.5F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(104, 36).addBox(-0.1F, -1.175F, -2.875F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(29, 23).addBox(-0.1F, -0.5F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(129, 69).addBox(-1.1F, 8.9387F, 1.5893F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(9, 117).addBox(-1.1F, 6.1996F, -0.2091F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(113, 16).addBox(-1.0F, -3.0F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3F, 6.6262F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightLeg2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(38, 127).addBox(-1.1F, -1.1916F, 0.5297F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightLeg2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(50, 84).addBox(-1.1F, -0.8318F, 0.0813F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightLeg2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(31, 124).addBox(-1.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.0471F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightLeg2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(74, 127).addBox(-1.1F, -0.009F, -0.9593F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4F, 7.8674F, 0.2497F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightLeg2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(16, 119).addBox(-1.1F, -0.209F, -0.1593F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.0197F, -0.0418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(95, 17).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightLeg3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(138, 34).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r148 = rightLeg3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(124, 129).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(61, 42).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 0.7592F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 52).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.738F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.6765F, 1.5338F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftLeg1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(135, 88).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 14.3131F, -1.8377F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftLeg1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(120, 69).addBox(-0.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0F, 15.2267F, -2.2445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftLeg1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(120, 27).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 15.778F, -4.167F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftLeg1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(97, 97).addBox(3.1F, -1.9807F, -2.918F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 13.7054F, -2.3045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftLeg1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(120, 11).addBox(3.1F, -2.532F, 0.2317F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 12.2777F, -3.7694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftLeg1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(108, 79).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 11.0305F, -4.6621F, 2.8885F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftLeg1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(129, 26).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 10.0624F, -4.4117F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftLeg1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(24, 83).addBox(-1.0F, -9.0F, 0.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 10.0624F, -4.4117F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftLeg1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(141, 109).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.5355F, -0.852F, 3.098F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftLeg1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(137, 134).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.5355F, -0.852F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftLeg1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(58, 112).addBox(3.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r160 = leftLeg1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(91, 30).addBox(-1.5F, -1.6F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.1302F, 0.171F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftLeg1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(88, 90).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 2.0207F, -2.3915F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftLeg1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(117, 80).addBox(-1.0F, 0.7F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.0127F, -1.0785F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 16.9292F, -3.1251F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftLeg2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(76, 121).addBox(-0.9F, 1.5765F, -0.6545F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftLeg2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(62, 127).addBox(-0.9F, -0.8465F, -1.0797F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftLeg2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(94, 11).addBox(-1.0F, 0.1F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.1606F, -0.8554F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftLeg2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(107, 11).addBox(-1.0F, -0.425F, -0.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftLeg2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(97, 103).addBox(-1.9F, -0.5F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftLeg2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(106, 64).addBox(-1.9F, -1.175F, -2.875F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftLeg2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(106, 59).addBox(-1.9F, -0.5F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftLeg2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(129, 110).addBox(-0.9F, 8.9387F, 1.5893F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftLeg2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(117, 99).addBox(-0.9F, 6.1996F, -0.2091F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftLeg2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(113, 24).addBox(-1.0F, -3.0F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3F, 6.6262F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftLeg2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(127, 46).addBox(-0.9F, -1.1916F, 0.5297F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftLeg2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(57, 84).addBox(-0.9F, -0.8318F, 0.0813F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftLeg2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(124, 91).addBox(0.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.0471F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftLeg2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(109, 127).addBox(0.1F, -0.009F, -0.9593F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4F, 7.8674F, 0.2497F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftLeg2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(57, 120).addBox(0.1F, -0.209F, -0.1593F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.0197F, -0.0418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(24, 95).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftLeg3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(141, 40).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r179 = leftLeg3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(114, 133).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(0, 67).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 2.4609F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(52, 13).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1626F, 8.8231F, -0.22F, 0.1278F, -0.0285F));

		PartDefinition cube_r180 = tail1.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(3, 131).addBox(0.0F, -0.3F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2878F, 8.5295F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail1.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(34, 136).addBox(0.5F, -0.4364F, -0.6107F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2512F, 1.2174F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail1.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(87, 135).addBox(0.5F, -0.1129F, -0.1754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2512F, 3.8174F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail1.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(46, 122).addBox(0.5F, -0.6138F, -0.4761F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.404F, 5.5805F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail1.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(79, 111).addBox(0.5F, -5.6919F, -0.1183F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1588F, 5.7807F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail1.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(106, 48).addBox(0.5F, -6.7846F, -0.2721F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9208F, 0.0257F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail1.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(16, 109).addBox(0.5F, -6.2941F, -0.0226F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5208F, 2.7257F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail1.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-2.3F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0111F, -0.1038F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r188 = tail1.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 59).addBox(-0.7F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0111F, -0.1038F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r189 = tail1.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(19, 28).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.4998F, 8.6946F, 0.0528F, 0.1307F, 0.0069F));

		PartDefinition cube_r190 = tail.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(61, 58).mirror().addBox(-2.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition cube_r191 = tail.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(61, 58).addBox(0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition cube_r192 = tail.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(61, 48).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(134, 134).addBox(0.0F, -0.3F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3858F, 7.2538F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 131).addBox(0.0F, 0.1F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(129, 126).addBox(0.0F, 0.4F, -0.3F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(75, 13).addBox(0.5F, -4.4073F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 4.7753F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(79, 127).addBox(0.5F, -4.8823F, -0.0162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 2.8025F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(27, 115).addBox(0.5F, -5.3073F, -1.0162F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, 0.8174F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.8411F, 6.5801F, 0.1936F, 0.1285F, 0.0251F));

		PartDefinition cube_r199 = tail2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(105, 142).addBox(0.0F, -3.0561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5576F, 6.0228F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(125, 140).addBox(0.0F, -3.3561F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3746F, 3.9307F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(62, 138).addBox(0.0F, -3.7061F, -0.1316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2177F, 2.1376F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(135, 81).addBox(0.0F, -4.0811F, 0.0684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.026F, -0.054F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(42, 55).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(23, 55).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.826F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(79, 135).addBox(0.0F, -0.7F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0829F, 2.6141F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(12, 138).addBox(0.0F, -1.9F, 0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6847F, 6.9508F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(31, 135).addBox(0.0F, -0.4F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8489F, 4.297F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(21, 65).mirror().addBox(-1.6F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, 0.9261F, 1.0278F, 0.0175F, 0.0262F, 0.0005F));

		PartDefinition cube_r208 = tail2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(21, 65).addBox(-0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5302F, 0.9261F, 1.0278F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6224F, 8.1476F, -0.0087F, -0.0436F, 0.0004F));

		PartDefinition cube_r209 = tail8.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(40, 65).mirror().addBox(-1.4F, 0.0F, -1.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r210 = tail8.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(59, 66).mirror().addBox(-1.3F, 0.0F, 0.9F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3334F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r211 = tail8.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(59, 66).addBox(-0.7F, 0.0F, 0.9F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3334F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r212 = tail8.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(40, 65).addBox(-0.6F, 0.0F, -1.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r213 = tail8.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(40, 23).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1017F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r214 = tail8.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(11, 85).addBox(0.0F, -0.5624F, -0.4967F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 8.89F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r215 = tail8.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(83, 144).addBox(0.0F, -0.6812F, -0.2484F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 5.89F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r216 = tail8.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(68, 144).addBox(0.0F, -0.4604F, -0.7495F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 3.89F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail8.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(65, 138).addBox(0.0F, -1.3F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2632F, 1.244F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail8.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(65, 144).addBox(0.0F, -2.4462F, -0.0313F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 7.8984F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail8.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 144).addBox(0.0F, -2.3811F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 5.8984F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail8.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(131, 143).addBox(0.0F, -2.4561F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 3.9984F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail8.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(128, 143).addBox(0.0F, -2.4061F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 1.8984F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r222 = tail8.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(143, 33).addBox(0.0F, -2.4561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, -0.1016F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition cube_r223 = tail3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(59, 148).addBox(0.0F, -2.1128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 6.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r224 = tail3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(56, 148).addBox(0.0F, -2.0628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 4.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r225 = tail3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(53, 148).addBox(0.0F, -2.0628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 2.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r226 = tail3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(50, 148).addBox(0.0F, -2.0128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 0.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r227 = tail3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(104, 147).addBox(0.0F, 2.6F, 3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 112).addBox(0.0F, 1.2F, 1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 69).addBox(0.0F, -0.3F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r228 = tail3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(40, 45).mirror().addBox(-1.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r229 = tail3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(40, 45).addBox(0.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r230 = tail3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(40, 34).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0715F, -0.2176F, 0.0155F));

		PartDefinition cube_r231 = tail9.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(57, 76).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r232 = tail9.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(129, 148).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 4.0517F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r233 = tail9.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(126, 148).addBox(0.0F, -1.725F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 2.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r234 = tail9.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(123, 148).addBox(0.0F, 6.7F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 149).addBox(0.0F, 5.2F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 148).addBox(0.0F, 3.8F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r235 = tail9.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(107, 148).addBox(0.0F, -1.625F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 0.0827F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.1268F, -0.0746F, -0.0454F));

		PartDefinition cube_r236 = tail4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(15, 149).addBox(0.0F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 4.0293F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r237 = tail4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(141, 148).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 2.0305F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r238 = tail4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(138, 148).addBox(0.0F, -1.4F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r239 = tail4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(135, 148).addBox(0.0F, -0.45F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 148).addBox(0.0F, -1.65F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r240 = tail4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(72, 76).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.0886F, -0.1739F, 0.0154F));

		PartDefinition cube_r241 = tail5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(62, 149).addBox(0.0F, -1.1909F, 0.0159F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4698F, 3.7774F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r242 = tail5.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(30, 149).addBox(0.0F, -1.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 149).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2698F, -0.2226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r243 = tail5.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(24, 149).addBox(0.0F, 3.75F, 6.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 149).addBox(0.0F, 0.95F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r244 = tail5.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(21, 149).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4277F, 2.9853F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(61, 20).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 5.6774F, -0.1584F, -0.1293F, 0.0206F));

		PartDefinition cube_r245 = tail6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(71, 149).addBox(0.0F, 8.35F, 12.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 4).addBox(0.0F, 7.05F, 10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 149).addBox(0.0F, 4.85F, 8.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1693F, -8.5969F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r246 = tail6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(54, 125).addBox(0.0F, -1.6909F, 7.9159F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 91).addBox(0.0F, -1.6909F, 5.9159F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 106).addBox(0.0F, -1.4909F, 3.9159F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 7).addBox(0.0F, -1.2909F, 1.9159F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0359F, -1.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(78, 48).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1828F, -0.3006F, 0.0547F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(78, 66).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0223F, 5.9976F, -0.1535F, -0.2589F, 0.0396F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(115, 94).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.0715F, -0.2176F, 0.0155F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(41, 106).addBox(-0.003F, -8.4508F, -5.8856F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, 0.035F, -0.0872F, -0.0031F));

		PartDefinition cube_r247 = body.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(74, 111).addBox(-0.503F, -6.7702F, -0.0405F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3533F, -8.8465F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r248 = body.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(69, 105).addBox(-0.503F, -7.2522F, -1.0364F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1091F, -1.8541F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r249 = body.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(19, 40).addBox(-1.0F, 0.0F, 0.9F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r250 = body.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(27, 0).addBox(-3.5F, -5.9874F, 0.0548F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.9348F, -7.8776F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r251 = body.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(140, 38).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -4.9704F, 0.0443F, 0.0544F, -0.6431F));

		PartDefinition cube_r252 = body.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(80, 74).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -4.9704F, 0.0171F, 0.068F, -1.0801F));

		PartDefinition cube_r253 = body.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(131, 38).mirror().addBox(-5.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -4.9704F, -0.0239F, 0.0659F, -1.6748F));

		PartDefinition cube_r254 = body.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(140, 66).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -1.9704F, -0.0674F, -0.0295F, -0.6445F));

		PartDefinition cube_r255 = body.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(146, 111).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -1.9704F, -0.0094F, -0.0729F, -1.6749F));

		PartDefinition cube_r256 = body.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(100, 79).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -1.9704F, -0.0486F, -0.0552F, -1.0805F));

		PartDefinition cube_r257 = body.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(140, 103).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -7.9704F, 0.1088F, 0.1001F, -0.4825F));

		PartDefinition cube_r258 = body.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(141, 12).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -7.9704F, 0.0562F, 0.1367F, -0.9204F));

		PartDefinition cube_r259 = body.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(108, 86).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -7.9704F, -0.0304F, 0.1446F, -1.5199F));

		PartDefinition cube_r260 = body.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(108, 86).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -7.9704F, -0.0304F, -0.1446F, 1.5199F));

		PartDefinition cube_r261 = body.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(141, 12).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -7.9704F, 0.0562F, -0.1367F, 0.9204F));

		PartDefinition cube_r262 = body.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(140, 103).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -7.9704F, 0.1088F, -0.1001F, 0.4825F));

		PartDefinition cube_r263 = body.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(100, 79).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -1.9704F, -0.0486F, 0.0552F, 1.0805F));

		PartDefinition cube_r264 = body.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(146, 111).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -1.9704F, -0.0094F, 0.0729F, 1.6749F));

		PartDefinition cube_r265 = body.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(140, 66).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -1.9704F, -0.0674F, 0.0295F, 0.6445F));

		PartDefinition cube_r266 = body.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(131, 38).addBox(2.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -4.9704F, -0.0239F, -0.0659F, 1.6748F));

		PartDefinition cube_r267 = body.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(80, 74).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -4.9704F, 0.0171F, -0.068F, 1.0801F));

		PartDefinition cube_r268 = body.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(140, 38).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -4.9704F, 0.0443F, -0.0544F, 0.6431F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, 0.0208F, -7.9194F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6515F, -8.9733F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r269 = body2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 109).addBox(0.0F, -6.6122F, -2.0627F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0313F, -0.8139F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r270 = body2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(27, 104).addBox(0.0F, -6.4117F, -1.8614F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1216F, -7.0144F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r271 = body2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(44, 88).addBox(0.0F, -6.5367F, -1.9614F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0945F, -3.9145F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r272 = body2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(57, 74).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9708F, -4.8194F, 0.0338F, 0.1886F, -1.3948F));

		PartDefinition cube_r273 = body2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(101, 95).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9708F, -4.8194F, 0.134F, 0.1373F, -0.7953F));

		PartDefinition cube_r274 = body2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(68, 138).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9708F, -4.8194F, 0.1792F, 0.0682F, -0.3621F));

		PartDefinition cube_r275 = body2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(138, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9708F, -7.8194F, 0.2595F, 0.1034F, -0.3208F));

		PartDefinition cube_r276 = body2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(138, 83).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9708F, -7.8194F, 0.1928F, 0.2028F, -0.751F));

		PartDefinition cube_r277 = body2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(54, 11).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9708F, -7.8194F, 0.0447F, 0.2754F, -1.3579F));

		PartDefinition cube_r278 = body2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(80, 26).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0208F, -1.8194F, -0.0037F, 0.0814F, -1.449F));

		PartDefinition cube_r279 = body2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(138, 85).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0208F, -1.8194F, 0.0425F, 0.0696F, -0.854F));

		PartDefinition cube_r280 = body2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(138, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0208F, -1.8194F, 0.0679F, 0.0451F, -0.4176F));

		PartDefinition cube_r281 = body2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(138, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0208F, -1.8194F, 0.0679F, -0.0451F, 0.4176F));

		PartDefinition cube_r282 = body2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(0, 15).addBox(-3.5F, -5.1079F, 0.0001F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.8033F, -6.2803F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r283 = body2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(138, 85).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0208F, -1.8194F, 0.0425F, -0.0696F, 0.854F));

		PartDefinition cube_r284 = body2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(80, 26).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0208F, -1.8194F, -0.0037F, -0.0814F, 1.449F));

		PartDefinition cube_r285 = body2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(54, 11).addBox(2.6881F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9708F, -7.8194F, 0.0447F, -0.2754F, 1.3579F));

		PartDefinition cube_r286 = body2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(138, 83).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9708F, -7.8194F, 0.1928F, -0.2028F, 0.751F));

		PartDefinition cube_r287 = body2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(138, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9708F, -7.8194F, 0.2595F, -0.1034F, 0.3208F));

		PartDefinition cube_r288 = body2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(68, 138).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9708F, -4.8194F, 0.1792F, -0.0682F, 0.3621F));

		PartDefinition cube_r289 = body2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(101, 95).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9708F, -4.8194F, 0.134F, -0.1373F, 0.7953F));

		PartDefinition cube_r290 = body2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(57, 74).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9708F, -4.8194F, 0.0338F, -0.1886F, 1.3948F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2747F, -7.8206F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(124, 101).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9391F, -1.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(90, 109).addBox(0.0F, -6.7217F, -0.0424F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -3.9368F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(33, 84).addBox(-4.9578F, -0.9216F, -1.7306F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(23, 52).mirror().addBox(-6.9409F, -0.1894F, -0.7739F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9578F, 13.4683F, -5.8159F, 0.074F, 0.9798F, 0.2701F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(-5.149F, 0.2806F, -1.2942F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9578F, 13.4683F, -5.8159F, 0.1357F, 0.805F, 0.8525F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(80, 56).mirror().addBox(-1.7145F, -0.6734F, -6.0021F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9578F, 13.4683F, -5.8159F, -0.7488F, -0.3643F, 0.3198F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(138, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -2.9368F, 0.1856F, 0.0731F, -0.2753F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(138, 95).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -2.9368F, 0.1378F, 0.1445F, -0.7085F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -2.9368F, 0.0328F, 0.1967F, -1.3086F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(80, 28).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.0658F, 0.25F, -1.3913F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(138, 101).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.1952F, 0.1703F, -0.7894F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(138, 114).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.2481F, 0.0729F, -0.3607F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(138, 116).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.2946F, 0.0961F, -0.4443F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(138, 118).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.2284F, 0.2107F, -0.8707F));

		PartDefinition cube_r305 = chest.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(90, 5).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.0698F, 0.3018F, -1.4777F));

		PartDefinition cube_r306 = chest.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(90, 5).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.0698F, -0.3018F, 1.4777F));

		PartDefinition cube_r307 = chest.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(138, 118).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.2284F, -0.2107F, 0.8707F));

		PartDefinition cube_r308 = chest.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(138, 116).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.2946F, -0.0961F, 0.4443F));

		PartDefinition cube_r309 = chest.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(6, 131).addBox(0.0F, -5.9926F, -0.2837F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -7.7368F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r310 = chest.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(138, 114).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.2481F, -0.0729F, 0.3607F));

		PartDefinition cube_r311 = chest.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(138, 101).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.1952F, -0.1703F, 0.7894F));

		PartDefinition cube_r312 = chest.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(80, 28).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.0658F, -0.25F, 1.3913F));

		PartDefinition cube_r313 = chest.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 73).addBox(2.6881F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -2.9368F, 0.0328F, -0.1967F, 1.3086F));

		PartDefinition cube_r314 = chest.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(138, 95).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -2.9368F, 0.1378F, -0.1445F, 0.7085F));

		PartDefinition cube_r315 = chest.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 45).addBox(-3.0F, -3.1F, 0.4F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.9375F, -4.1355F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r316 = chest.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(138, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -2.9368F, 0.1856F, -0.0731F, 0.2753F));

		PartDefinition cube_r317 = chest.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(12, 124).addBox(0.0F, -6.6927F, -0.2837F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -5.7368F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r318 = chest.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(80, 56).addBox(-0.2855F, -0.6734F, -6.0021F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, -0.7488F, 0.3643F, -0.3198F));

		PartDefinition cube_r319 = chest.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(80, 63).addBox(0.149F, 0.2806F, -1.2942F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, 0.1357F, -0.805F, -0.8525F));

		PartDefinition cube_r320 = chest.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(23, 52).addBox(-0.0591F, -0.1894F, -0.7739F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, 0.074F, -0.9798F, -0.2701F));

		PartDefinition cube_r321 = chest.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(93, 63).addBox(-2.9578F, -0.6734F, -5.632F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9578F, 13.4683F, -5.8159F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r322 = chest.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(76, 30).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1609F, -2.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7841F, 7.0483F, -5.503F, -0.2099F, 0.0981F, -0.1959F));

		PartDefinition cube_r323 = bone2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(12, 134).addBox(-0.474F, -0.1276F, -0.7713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4846F, 0.7589F, -4.1672F, -1.5403F, 0.0609F, 0.3165F));

		PartDefinition cube_r324 = bone2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(131, 34).addBox(-0.474F, -0.4804F, -1.2952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4846F, 0.7589F, -4.1672F, -0.8858F, 0.0609F, 0.3165F));

		PartDefinition cube_r325 = bone2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(131, 30).addBox(-0.474F, -0.7876F, -0.7005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4846F, 0.7589F, -4.1672F, -0.3185F, 0.0609F, 0.3165F));

		PartDefinition cube_r326 = bone2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(86, 144).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5499F, 0.8316F, -2.7349F, 0.3273F, -0.0083F, -0.0153F));

		PartDefinition cube_r327 = bone2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(65, 116).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5274F, 0.1699F, -1.2604F, 0.8684F, -0.0083F, -0.0153F));

		PartDefinition cube_r328 = bone2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(116, 0).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4998F, -1.5165F, -1.0482F, 0.8335F, -0.0083F, -0.0153F));

		PartDefinition cube_r329 = bone2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(87, 74).addBox(-0.5F, -0.65F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4526F, -3.1123F, 1.6815F, 0.9207F, -0.0083F, -0.0153F));

		PartDefinition cube_r330 = bone2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(11, 89).addBox(-0.5F, 0.4F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(104, 115).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4151F, -5.2161F, 2.3126F, 0.7636F, -0.0083F, -0.0153F));

		PartDefinition cube_r331 = bone2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(130, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4487F, -3.7717F, 0.9297F, 0.8073F, -0.0083F, -0.0153F));

		PartDefinition cube_r332 = bone2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(95, 115).addBox(-0.5F, -2.3F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5087F, -0.0001F, 0.6811F, 0.8509F, -0.0083F, -0.0153F));

		PartDefinition cube_r333 = bone2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(64, 93).addBox(-1.0673F, 1.7238F, -2.2852F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.081F, 0.3428F, 1.1599F));

		PartDefinition cube_r334 = bone2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(124, 117).addBox(-1.0673F, -1.4729F, -2.4494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 1.0971F, 0.3428F, 1.1599F));

		PartDefinition cube_r335 = bone2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(121, 85).addBox(-1.0673F, -0.8336F, -1.9078F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 1.3152F, 0.3428F, 1.1599F));

		PartDefinition cube_r336 = bone2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(136, 54).addBox(-0.3F, -1.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5078F, 1.6944F, -1.9808F, 1.1F, 0.2124F, 0.1427F));

		PartDefinition cube_r337 = bone2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(82, 138).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5078F, 1.6944F, -1.9808F, 0.3925F, -0.0293F, 0.0412F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7841F, 7.0483F, -5.503F, -0.2099F, -0.0981F, 0.1959F));

		PartDefinition cube_r338 = bone4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(12, 134).mirror().addBox(-0.526F, -0.1276F, -0.7713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4846F, 0.7589F, -4.1672F, -1.5403F, -0.0609F, -0.3165F));

		PartDefinition cube_r339 = bone4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(131, 34).mirror().addBox(-0.526F, -0.4804F, -1.2952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4846F, 0.7589F, -4.1672F, -0.8858F, -0.0609F, -0.3165F));

		PartDefinition cube_r340 = bone4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(131, 30).mirror().addBox(-0.526F, -0.7876F, -0.7005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4846F, 0.7589F, -4.1672F, -0.3185F, -0.0609F, -0.3165F));

		PartDefinition cube_r341 = bone4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(86, 144).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5499F, 0.8316F, -2.7349F, 0.3273F, 0.0083F, 0.0153F));

		PartDefinition cube_r342 = bone4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(65, 116).mirror().addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5274F, 0.1699F, -1.2604F, 0.8684F, 0.0083F, 0.0153F));

		PartDefinition cube_r343 = bone4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4998F, -1.5165F, -1.0482F, 0.8335F, 0.0083F, 0.0153F));

		PartDefinition cube_r344 = bone4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-0.5F, -0.65F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4526F, -3.1123F, 1.6815F, 0.9207F, 0.0083F, 0.0153F));

		PartDefinition cube_r345 = bone4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(11, 89).mirror().addBox(-0.5F, 0.4F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 115).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4151F, -5.2161F, 2.3126F, 0.7636F, 0.0083F, 0.0153F));

		PartDefinition cube_r346 = bone4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(130, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4487F, -3.7717F, 0.9297F, 0.8073F, 0.0083F, 0.0153F));

		PartDefinition cube_r347 = bone4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(95, 115).mirror().addBox(-0.5F, -2.3F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5087F, -0.0001F, 0.6811F, 0.8509F, 0.0083F, 0.0153F));

		PartDefinition cube_r348 = bone4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(64, 93).mirror().addBox(0.0673F, 1.7238F, -2.2852F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.081F, -0.3428F, -1.1599F));

		PartDefinition cube_r349 = bone4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(124, 117).mirror().addBox(0.0673F, -1.4729F, -2.4494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 1.0971F, -0.3428F, -1.1599F));

		PartDefinition cube_r350 = bone4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(121, 85).mirror().addBox(0.0673F, -0.8336F, -1.9078F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 1.3152F, -0.3428F, -1.1599F));

		PartDefinition cube_r351 = bone4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(136, 54).mirror().addBox(-0.7F, -1.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5078F, 1.6944F, -1.9808F, 1.1F, -0.2124F, -0.1427F));

		PartDefinition cube_r352 = bone4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(82, 138).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5078F, 1.6944F, -1.9808F, 0.3925F, 0.0293F, -0.0412F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6306F, 10.0865F, -7.8581F, 1.0843F, 0.3281F, -0.2276F));

		PartDefinition cube_r353 = leftArm1.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(147, 36).addBox(-0.2F, 0.075F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3037F, 0.0186F, 0.0503F, -0.1045F, -0.2207F, -0.0253F));

		PartDefinition cube_r354 = leftArm1.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(99, 147).addBox(-0.2F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3037F, 0.0186F, 0.0503F, -0.8463F, -0.2207F, -0.0253F));

		PartDefinition cube_r355 = leftArm1.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(142, 0).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r356 = leftArm1.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(139, 141).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r357 = leftArm1.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(134, 141).addBox(6.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2F, 1.1847F, -1.6107F, -0.4204F, -0.0786F, -0.067F));

		PartDefinition cube_r358 = leftArm1.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(52, 136).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3F, 3.5346F, 0.1087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(26, 131).addBox(-0.8F, -1.5307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 135).addBox(-0.8F, -0.4307F, -1.5734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4978F, 5.1567F, -0.8819F, -0.9191F, 0.0156F, 0.0164F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0484F, 2.5843F, 0.3278F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r359 = leftHand.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(95, 39).addBox(0.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r360 = leftHand.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(98, 120).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6306F, 10.0865F, -7.8581F, 1.1653F, -0.2368F, -0.1128F));

		PartDefinition cube_r361 = rightArm1.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(147, 64).addBox(-0.8F, 0.075F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3037F, 0.0186F, 0.0503F, -0.1045F, 0.2207F, 0.0253F));

		PartDefinition cube_r362 = rightArm1.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(113, 147).addBox(-0.8F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3037F, 0.0186F, 0.0503F, -0.8463F, 0.2207F, 0.0253F));

		PartDefinition cube_r363 = rightArm1.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(73, 142).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r364 = rightArm1.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(25, 142).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r365 = rightArm1.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(20, 142).addBox(-7.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2F, 1.1847F, -1.6107F, -0.4204F, 0.0786F, 0.067F));

		PartDefinition cube_r366 = rightArm1.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(57, 136).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3F, 3.5346F, 0.1087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(82, 132).addBox(-0.2F, -1.5307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 136).addBox(-0.2F, -0.4307F, -1.5734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4978F, 5.1567F, -0.8819F, -1.3555F, -0.0156F, -0.0164F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0484F, 2.5843F, 0.3278F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r367 = rightHand.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(33, 97).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightHand.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(120, 106).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8698F, -7.7672F, -0.549F, 0.1344F, -0.0312F));

		PartDefinition cube_r369 = neck1.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(9, 131).addBox(0.0F, -5.3459F, -0.016F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r370 = neck1.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0549F, 0.9381F, -1.6998F));

		PartDefinition cube_r371 = neck1.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(138, 120).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.6804F, 0.7081F, -0.8741F));

		PartDefinition cube_r372 = neck1.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 139).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.8756F, 0.3979F, -0.5097F));

		PartDefinition cube_r373 = neck1.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(0, 139).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.8756F, -0.3979F, 0.5097F));

		PartDefinition cube_r374 = neck1.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(138, 120).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.6804F, -0.7081F, 0.8741F));

		PartDefinition cube_r375 = neck1.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(52, 20).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0549F, -0.9381F, 1.6998F));

		PartDefinition cube_r376 = neck1.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(109, 5).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3956F, 0.145F, 0.1068F));

		PartDefinition cube_r377 = neck2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(105, 135).addBox(0.0F, -4.6816F, -0.0991F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r378 = neck2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(139, 48).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.2054F, 0.5609F, -1.0212F));

		PartDefinition cube_r379 = neck2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0822F, 0.5885F, -1.5418F));

		PartDefinition cube_r380 = neck2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(95, 61).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0822F, -0.5885F, 1.5418F));

		PartDefinition cube_r381 = neck2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(139, 48).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.2054F, -0.5609F, 1.0212F));

		PartDefinition cube_r382 = neck2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(95, 109).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.3481F, 0.1938F, 0.0215F));

		PartDefinition cube_r383 = neck5.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(112, 88).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r384 = neck5.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(131, 103).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, -0.2704F, 1.1208F, -1.6737F));

		PartDefinition cube_r385 = neck5.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(83, 142).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, 0.581F, 1.0455F, -0.7259F));

		PartDefinition cube_r386 = neck5.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(139, 50).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, 0.463F, 0.9843F, -0.8263F));

		PartDefinition cube_r387 = neck5.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(127, 56).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, -0.2529F, 1.0339F, -1.6583F));

		PartDefinition cube_r388 = neck5.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(127, 56).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, -0.2529F, -1.0339F, 1.6583F));

		PartDefinition cube_r389 = neck5.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(139, 50).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, 0.463F, -0.9843F, 0.8263F));

		PartDefinition cube_r390 = neck5.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(83, 142).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, 0.581F, -1.0455F, 0.7259F));

		PartDefinition cube_r391 = neck5.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(131, 103).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, -0.2704F, -1.1208F, 1.6737F));

		PartDefinition cube_r392 = neck5.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(124, 122).addBox(0.0F, -4.2566F, -1.1491F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r393 = neck5.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(76, 134).addBox(0.0F, -4.5566F, -0.1491F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, 0.1134F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.1358F, 0.206F, 0.1888F));

		PartDefinition cube_r394 = neck4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(139, 52).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r395 = neck4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(139, 105).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r396 = neck4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(139, 107).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.508F, 0.9362F, -0.7795F));

		PartDefinition cube_r397 = neck4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(108, 139).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1513F, 1.0193F, -1.5615F));

		PartDefinition cube_r398 = neck4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(108, 139).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1513F, -1.0193F, 1.5615F));

		PartDefinition cube_r399 = neck4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(139, 107).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.508F, -0.9362F, 0.7795F));

		PartDefinition cube_r400 = neck4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(139, 105).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r401 = neck4.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(139, 52).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r402 = neck4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(125, 0).addBox(0.0F, -2.7677F, -0.0582F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r403 = neck4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(95, 54).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7757F, 0.3664F, 0.2659F, 0.0615F));

		PartDefinition cube_r404 = neck3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(139, 126).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r405 = neck3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(139, 128).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r406 = neck3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(139, 128).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r407 = neck3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(139, 126).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r408 = neck3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(21, 125).addBox(0.5F, -3.069F, -0.9772F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r409 = neck3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(11, 96).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.1737F, -0.0075F, -0.044F));

		PartDefinition cube_r410 = neck.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(139, 132).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r411 = neck.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(139, 130).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r412 = neck.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(139, 132).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r413 = neck.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(49, 125).addBox(0.5F, -3.3207F, -0.2014F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r414 = neck.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(104, 109).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r415 = neck.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(139, 130).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r416 = neck6.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(120, 73).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0783F, -0.876F, 1.5935F));

		PartDefinition cube_r417 = neck6.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(7, 139).addBox(0.0F, -2.0F, -0.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4135F, 0.3277F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r418 = neck6.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(91, 144).addBox(0.5F, -2.0207F, -0.5013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.503F, -1.0375F, -1.2498F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r419 = neck6.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(111, 48).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0315F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r420 = neck6.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(137, 139).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2529F, -3.1136F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(62, 101).addBox(-2.0F, -0.831F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F))
				.texOffs(99, 26).addBox(-2.0F, -1.1311F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -1.1099F, -2.1888F, -1.7322F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(117, 59).addBox(-1.5F, -4.0279F, -1.1012F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -0.263F, -6.3407F, -1.6188F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(105, 0).addBox(-1.5F, -1.2717F, -0.9571F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -0.263F, -6.3407F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(32, 106).addBox(-1.0F, 0.5984F, -0.9942F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.263F, -6.3407F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(20, 132).addBox(-0.5025F, 0.9858F, -0.7871F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0065F, 1.2206F, -15.493F, 1.8544F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(145, 84).addBox(-0.5025F, 0.0055F, 0.008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0065F, 1.2206F, -15.493F, 0.5018F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(145, 81).addBox(-0.5025F, -0.9914F, 0.0067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0065F, 1.7957F, -16.293F, -0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(76, 39).addBox(-0.5025F, -0.9629F, 0.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0065F, 2.6457F, -16.768F, -0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(145, 78).addBox(-0.4975F, 0.7508F, -1.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 2.8078F, -15.5504F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(145, 75).addBox(-0.4975F, -1.0373F, -0.0093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, 3.6578F, -17.1504F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(75, 100).addBox(-0.5F, -0.8428F, -4.0384F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6649F, -1.8891F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(50, 132).addBox(-0.5F, -0.7792F, -0.8971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6649F, -1.8891F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(43, 132).addBox(-0.5F, 0.1824F, -0.798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6649F, -1.8891F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(100, 73).addBox(-0.4975F, -0.9556F, -0.1606F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.0025F, 4.5634F, -16.1651F, -0.1142F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(80, 18).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 5.0132F, -12.3702F, 0.0778F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(29, 13).addBox(-1.5F, -1.5078F, 3.0018F, 3.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.6767F, -9.6946F, -0.1317F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(145, 72).addBox(-0.5F, 0.4061F, 0.2489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6649F, -1.8891F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(90, 0).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0061F, -0.7927F, 0.0722F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(79, 10).addBox(-2.5F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6185F, 0.7748F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(94, 7).addBox(-1.5F, -1.025F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.6979F, 0.1263F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(93, 69).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7075F, 0.1032F, 0.9512F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.4011F, 7.8848F, -15.7879F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(57, 141).addBox(-6.4335F, 5.1151F, 0.3407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(141, 54).addBox(-6.4335F, 5.1151F, 0.7407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 2.8491F, 1.1384F, 0.0631F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(141, 26).addBox(-0.7966F, 4.4556F, -3.4534F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, -0.8416F, 0.0387F, 0.2297F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(145, 113).addBox(-0.7966F, -1.7212F, -5.368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 0.3802F, 0.0387F, 0.2297F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(108, 145).addBox(-0.7966F, -2.7931F, -4.2737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 0.642F, 0.0387F, 0.2297F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(134, 21).addBox(-0.7966F, -4.1474F, -0.8521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 1.7764F, 0.0387F, 0.2297F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(127, 21).addBox(-0.7966F, -3.8686F, 0.265F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 2.1691F, 0.0387F, 0.2297F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(141, 22).addBox(-0.7966F, -0.5107F, 1.5305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, -2.8923F, 0.0387F, 0.2297F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(141, 18).addBox(-0.7966F, -0.2675F, 0.7487F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, -2.7178F, 0.0387F, 0.2297F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(134, 12).addBox(-0.7966F, 0.235F, -1.4271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, -1.4524F, 0.0387F, 0.2297F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(141, 14).addBox(-0.7966F, -1.5157F, -0.3775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 0.2929F, 0.0387F, 0.2297F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(145, 61).addBox(-0.7966F, 0.0665F, 0.6372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 1.5146F, 0.0387F, 0.2297F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(95, 126).addBox(-0.8086F, -1.5709F, 0.6048F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 0.008F, 0.1322F, 0.1768F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(88, 126).addBox(-0.8086F, 1.757F, -0.8703F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 1.8406F, 0.1322F, 0.1768F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(145, 58).addBox(-1.1971F, 3.3916F, 0.1447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 1.8351F, 0.2561F, 0.1756F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(126, 78).addBox(-1.1721F, 1.5816F, -4.7873F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.8369F, -8.1152F, 7.6663F, 2.7514F, 0.2561F, 0.1756F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(127, 41).addBox(-0.6F, -1.0F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.9196F, -8.5887F, 13.5526F, -1.7465F, 0.3852F, 0.1897F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(36, 132).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1948F, -2.3186F, 17.8993F, 1.7406F, 0.0318F, -0.0201F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(141, 4).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.205F, -2.528F, 18.3532F, 0.6934F, 0.0318F, -0.0201F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(148, 29).addBox(-1.4022F, -1.8522F, -0.5318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7928F, -3.3031F, -1.2705F, -0.4105F, 0.0696F, -0.0352F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(0, 141).addBox(-1.3811F, -1.8791F, -0.1712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7928F, -3.4031F, -0.4705F, -0.323F, 0.075F, -0.007F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(148, 10).addBox(-1.4492F, -0.0624F, 0.0029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7928F, -3.3031F, -1.2705F, 1.6585F, 0.0749F, 0.0075F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(136, 16).addBox(-1.3811F, -2.7857F, 0.8914F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(100, 135).addBox(-1.3811F, -2.7857F, 0.7914F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.7928F, -3.4031F, -0.4705F, -0.2357F, 0.075F, -0.007F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(99, 81).addBox(-0.5F, -4.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2769F, -2.5284F, 4.2929F, -0.0699F, 0.075F, -0.007F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(111, 75).addBox(-1.4463F, -0.0446F, -0.055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7928F, -5.2031F, -0.9705F, 1.1169F, 0.0736F, -0.0169F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(95, 135).addBox(-0.7F, -2.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0169F)), PartPose.offsetAndRotation(0.9989F, -8.829F, 11.4864F, -1.601F, 0.1745F, 0.0038F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(41, 117).addBox(-1.4361F, 0.3467F, 6.2956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.3407F, 0.075F, 0.0062F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(88, 81).addBox(-1.4361F, -0.2493F, 3.1353F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 0.2535F, 0.075F, 0.0062F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(73, 0).addBox(-1.4611F, -0.3111F, 0.8339F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7928F, -6.4031F, 0.2295F, 0.2531F, 0.0744F, -0.013F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(120, 21).addBox(-0.5F, -0.125F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0194F, -7.0682F, 1.305F, 1.8327F, 0.075F, -0.0091F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(126, 73).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1087F, -6.0481F, -0.5239F, 0.5674F, 0.075F, -0.0091F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(120, 140).addBox(-1.2817F, -0.9373F, -0.4777F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7928F, -3.1031F, -0.6705F, 0.0354F, 0.0747F, 0.01F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(115, 140).addBox(-1.2317F, -0.637F, 0.4902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7928F, -3.1031F, -0.6705F, 0.0877F, 0.0747F, 0.01F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(100, 140).addBox(-1.2317F, -0.1458F, 1.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7928F, -3.1031F, -0.6705F, 0.175F, 0.0747F, 0.01F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(95, 140).addBox(-1.3808F, 0.2717F, 2.3104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7928F, -3.1031F, -0.6705F, 0.2361F, 0.0747F, 0.01F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(90, 140).addBox(-1.3808F, 0.8398F, 3.2183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -3.1031F, -0.6705F, 0.3059F, 0.0747F, 0.01F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(140, 77).addBox(-1.3808F, 1.4751F, 4.1312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 145).addBox(-1.3808F, 2.7751F, 8.7312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(140, 73).addBox(-1.3808F, 1.7751F, 7.5312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 140).addBox(-1.3808F, 1.7751F, 6.3312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(136, 69).addBox(-1.3808F, 1.5751F, 5.1312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8678F, -3.1031F, -0.6705F, 0.3495F, 0.0747F, 0.01F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(60, 105).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4431F, -4.454F, 7.031F, 0.1139F, 0.0747F, 0.011F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(126, 64).addBox(-0.5F, -1.0F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.266F, -3.6481F, 4.8413F, 0.1749F, 0.075F, 0.0062F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(33, 88).addBox(-0.5F, -2.25F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6994F, -4.7674F, 9.3351F, -0.0871F, 0.2026F, -0.0241F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(42, 73).addBox(-0.5568F, 0.327F, -3.1544F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.4942F, 0.3117F, -0.0303F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(82, 39).addBox(-0.5568F, 0.2771F, -2.9128F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, 1.276F, 0.3117F, -0.0303F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(50, 145).addBox(-0.5568F, 2.4555F, 2.7402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 9.6295F, -0.1203F, 0.3117F, -0.0303F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(146, 128).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1953F, -8.0631F, 16.9781F, 3.0626F, 0.0302F, -0.0049F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(146, 125).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2225F, -7.4611F, 17.7761F, -2.2171F, 0.0302F, -0.0049F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(146, 122).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(146, 108).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2173F, -6.736F, 17.4857F, -1.2571F, 0.0302F, -0.0049F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(131, 118).addBox(-0.4562F, -0.1049F, -0.853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(2.1893F, -8.1856F, 15.5339F, -2.0039F, 0.1005F, 0.3608F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(131, 114).addBox(-0.5F, -0.175F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(2.4821F, -8.7217F, 16.2509F, -0.8181F, 0.0944F, 0.364F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(45, 145).addBox(-0.4587F, -0.7296F, -0.8502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.1893F, -8.2606F, 15.5339F, -1.682F, 0.0944F, 0.364F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(126, 59).addBox(-0.3858F, 0.1587F, -1.0996F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.1893F, -8.1856F, 15.5339F, -1.5213F, 0.2706F, 0.3235F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(141, 44).addBox(-0.9315F, -6.1116F, 1.1477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5678F, -2.7031F, 12.5295F, -0.0013F, 0.0318F, -0.0201F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(0, 126).addBox(-0.9186F, -6.3474F, -1.7912F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5678F, -2.7031F, 12.5295F, -0.6121F, 0.0318F, -0.0201F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(51, 111).addBox(-0.9542F, -4.2482F, 2.9389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5678F, -2.7031F, 13.2295F, 0.3129F, 0.0318F, -0.0201F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(51, 104).addBox(-0.5F, -3.0F, -0.65F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1881F, -2.2998F, 14.6301F, -0.0536F, 0.0318F, -0.0201F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(102, 131).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.1917F, -5.7722F, 15.3486F, -1.1401F, 0.0318F, -0.0201F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(145, 116).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(140, 62).addBox(-0.5F, -2.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2764F, -3.1444F, 16.3516F, 1.4256F, 0.0318F, -0.0201F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(40, 145).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2705F, -3.8961F, 16.643F, 0.7274F, 0.0318F, -0.0201F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(145, 119).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2624F, -4.7424F, 16.9203F, 2.2982F, 0.0318F, -0.0201F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(123, 145).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(35, 145).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2434F, -4.9537F, 16.4566F, 0.9456F, 0.0318F, -0.0201F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(10, 145).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2434F, -4.9537F, 16.4566F, -0.887F, 0.0318F, -0.0201F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(146, 105).addBox(-0.5F, -0.425F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1516F, -7.4806F, 15.2771F, 1.4256F, 0.0318F, -0.0201F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(146, 131).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1332F, -6.3093F, 13.9593F, -0.3372F, 0.0318F, -0.0201F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(131, 99).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1626F, -4.3359F, 13.6355F, -1.7335F, 0.0318F, -0.0201F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(76, 146).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.1521F, -6.4139F, 14.6199F, -0.9743F, 0.0318F, -0.0201F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(42, 136).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1728F, -6.2079F, 15.1416F, -0.1016F, 0.0318F, -0.0201F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(42, 141).addBox(-0.5F, -0.375F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1893F, -4.0147F, 14.2722F, 2.1019F, 0.0318F, -0.0201F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(5, 145).addBox(-1.1713F, 0.1051F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.7928F, -6.2031F, -0.0705F, 0.8827F, 0.0656F, 0.0252F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(40, 148).addBox(-1.1746F, -0.0416F, -1.1455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7928F, -6.2031F, -0.0705F, 2.065F, 0.0628F, 0.0268F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(0, 145).addBox(-1.1746F, 0.3265F, 0.7946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F))
				.texOffs(144, 143).addBox(-1.1746F, 0.3265F, 0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.7928F, -6.2031F, -0.0705F, 0.7473F, 0.0628F, 0.0268F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(45, 148).addBox(-1.1713F, -0.9014F, -1.9366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7928F, -6.2031F, -0.0705F, -2.6516F, 0.0656F, 0.0252F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(35, 148).addBox(-1.1713F, 0.2774F, -0.949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.7928F, -6.2031F, -0.0705F, 2.1044F, 0.0656F, 0.0252F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(144, 140).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.0209F, -4.5881F, 9.9548F, 2.9416F, 0.1274F, 0.0062F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(104, 41).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0924F, -4.8529F, 10.4999F, 3.0114F, 0.1274F, 0.0062F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(144, 137).addBox(-1.7041F, 9.4475F, 0.6534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8678F, -6.4031F, 0.2295F, 1.6413F, 0.1274F, 0.0062F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(118, 144).addBox(-0.5F, -0.8F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9078F, -8.7656F, 8.8687F, 2.9503F, 0.1274F, 0.0062F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(146, 4).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0343F, -8.8436F, 9.8533F, -1.8232F, 0.1274F, 0.0062F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(139, 145).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9073F, -8.835F, 8.8615F, -3.1322F, 0.1274F, 0.0062F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(131, 95).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7806F, -8.6959F, 7.8793F, 1.7111F, 0.1274F, 0.0062F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(140, 58).addBox(-0.5F, -2.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6531F, -8.5164F, 6.8922F, -2.7395F, 0.1274F, 0.0062F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(113, 116).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7791F, -8.6986F, 7.8674F, -1.2119F, 0.127F, 0.0118F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(95, 131).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4858F, -7.8103F, 5.6677F, -1.1948F, 0.1274F, 0.0062F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(129, 139).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3749F, -7.305F, 4.8265F, -2.6086F, 0.1274F, 0.0062F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(131, 91).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3773F, -6.5979F, 4.8327F, 2.3831F, 0.1274F, 0.0062F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(113, 144).addBox(-0.5F, 0.0F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2636F, -5.4156F, 4.002F, 1.4668F, 0.1274F, 0.0062F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(99, 144).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3474F, -5.7031F, 4.6425F, 1.205F, 0.1274F, 0.0062F));

		PartDefinition cube_r526 = leftFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(134, 145).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9395F, -3.8011F, 9.3576F, -3.0536F, 0.1274F, 0.0062F));

		PartDefinition cube_r527 = leftFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(122, 112).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.789F, -6.31F, 8.0604F, -1.8755F, 0.1274F, 0.0062F));

		PartDefinition cube_r528 = leftFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(39, 122).addBox(-1.7041F, -8.838F, -2.4205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8178F, -5.8531F, -1.1705F, -1.7883F, 0.1274F, 0.0062F));

		PartDefinition cube_r529 = leftFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(127, 106).addBox(-1.7041F, -6.8696F, -3.0252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8178F, -5.8531F, -1.1705F, -1.8755F, 0.1274F, 0.0062F));

		PartDefinition cube_r530 = leftFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(94, 144).addBox(-0.6685F, -0.3327F, -1.2133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(71, 146).addBox(-0.8935F, -0.3327F, -1.2133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3032F, -8.7494F, 12.5823F, 1.5812F, 0.3521F, -0.0148F));

		PartDefinition cube_r531 = leftFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(146, 68).addBox(-0.5F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.0179F, -8.0571F, 12.992F, -1.3685F, 0.3521F, -0.0148F));

		PartDefinition cube_r532 = leftFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(146, 55).addBox(-0.9187F, 0.2835F, -1.0563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.3032F, -8.7494F, 12.5823F, 1.2932F, 0.3521F, -0.0148F));

		PartDefinition cube_r533 = leftFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(146, 52).addBox(-0.5F, -0.675F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.0337F, -5.985F, 12.8118F, 0.1202F, 0.3233F, -0.0553F));

		PartDefinition cube_r534 = leftFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(146, 49).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.903F, -6.4439F, 12.4981F, 0.382F, 0.3233F, -0.0553F));

		PartDefinition cube_r535 = leftFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(146, 46).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0018F, -5.5165F, 12.6393F, 1.2285F, 0.3233F, -0.0553F));

		PartDefinition cube_r536 = leftFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(146, 43).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.8277F, -5.4424F, 12.1082F, 1.7957F, 0.3233F, -0.0553F));

		PartDefinition cube_r537 = leftFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(144, 146).addBox(-0.5F, -1.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F))
				.texOffs(146, 40).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.9815F, -5.0106F, 12.4954F, 2.6248F, 0.3233F, -0.0553F));

		PartDefinition cube_r538 = leftFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(146, 33).addBox(-0.973F, -0.9876F, 0.7085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3032F, -8.7494F, 12.5823F, -2.1313F, 0.3233F, -0.0553F));

		PartDefinition cube_r539 = leftFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(30, 146).addBox(-0.5F, -0.55F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.7872F, -6.1398F, 12.1026F, 1.3594F, 0.3233F, -0.0553F));

		PartDefinition cube_r540 = leftFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(146, 26).addBox(-0.5F, -0.55F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.7959F, -5.9401F, 12.0956F, 1.9266F, 0.3233F, -0.0553F));

		PartDefinition cube_r541 = leftFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(25, 146).addBox(-0.973F, -2.4893F, -0.6374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.3032F, -8.7494F, 12.5823F, 2.7993F, 0.3233F, -0.0553F));

		PartDefinition cube_r542 = leftFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(88, 131).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.9131F, -8.1189F, 12.7095F, -1.9444F, 0.3521F, -0.0148F));

		PartDefinition cube_r543 = leftFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(146, 23).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9791F, -8.281F, 12.8956F, -0.9496F, 0.3521F, -0.0148F));

		PartDefinition cube_r544 = leftFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(117, 75).addBox(-0.975F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.608F, -2.4083F, 12.971F, 1.1712F, 0.3123F, -0.117F));

		PartDefinition cube_r545 = leftFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(64, 132).addBox(-0.5F, -4.975F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(83, 125).addBox(-0.5F, -4.975F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.169F, -2.3338F, 14.0901F, -0.0797F, 0.0313F, -0.0185F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.4011F, 7.8848F, -15.7879F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(57, 141).mirror().addBox(5.4335F, 5.1151F, 0.3407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(141, 54).mirror().addBox(5.4335F, 5.1151F, 0.7407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 2.8491F, -1.1384F, -0.0631F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(141, 26).mirror().addBox(-0.2034F, 4.4556F, -3.4534F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, -0.8416F, -0.0387F, -0.2297F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(145, 113).mirror().addBox(-0.2034F, -1.7212F, -5.368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 0.3802F, -0.0387F, -0.2297F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(108, 145).mirror().addBox(-0.2034F, -2.7931F, -4.2737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 0.642F, -0.0387F, -0.2297F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(134, 21).mirror().addBox(-0.2034F, -4.1474F, -0.8521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 1.7764F, -0.0387F, -0.2297F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(127, 21).mirror().addBox(-0.2034F, -3.8686F, 0.265F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 2.1691F, -0.0387F, -0.2297F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(141, 22).mirror().addBox(-0.2034F, -0.5107F, 1.5305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, -2.8923F, -0.0387F, -0.2297F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(141, 18).mirror().addBox(-0.2034F, -0.2675F, 0.7487F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, -2.7178F, -0.0387F, -0.2297F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(134, 12).mirror().addBox(-0.2034F, 0.235F, -1.4271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, -1.4524F, -0.0387F, -0.2297F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(141, 14).mirror().addBox(-0.2034F, -1.5157F, -0.3775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 0.2929F, -0.0387F, -0.2297F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(145, 61).mirror().addBox(-0.2034F, 0.0665F, 0.6372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 1.5146F, -0.0387F, -0.2297F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(95, 126).mirror().addBox(-0.1914F, -1.5709F, 0.6048F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 0.008F, -0.1322F, -0.1768F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(88, 126).mirror().addBox(-0.1914F, 1.757F, -0.8703F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 1.8406F, -0.1322F, -0.1768F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(145, 58).mirror().addBox(0.1971F, 3.3916F, 0.1447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 1.8351F, -0.2561F, -0.1756F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(126, 78).mirror().addBox(0.1721F, 1.5816F, -4.7873F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, -8.1152F, 7.6663F, 2.7514F, -0.2561F, -0.1756F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(127, 41).mirror().addBox(-0.4F, -1.0F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.9196F, -8.5887F, 13.5526F, -1.7465F, -0.3852F, -0.1897F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(36, 132).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1948F, -2.3186F, 17.8993F, 1.7406F, -0.0318F, 0.0201F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(141, 4).mirror().addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.205F, -2.528F, 18.3532F, 0.6934F, -0.0318F, 0.0201F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(148, 29).mirror().addBox(0.4021F, -1.8522F, -0.5318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.3031F, -1.2705F, -0.4105F, -0.0696F, 0.0352F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(0, 141).mirror().addBox(0.3811F, -1.8791F, -0.1712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.4031F, -0.4705F, -0.323F, -0.075F, 0.007F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(148, 10).mirror().addBox(0.4492F, -0.0624F, 0.0029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.3031F, -1.2705F, 1.6585F, -0.0749F, -0.0075F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(136, 16).mirror().addBox(0.3811F, -2.7857F, 0.8914F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(100, 135).mirror().addBox(0.3811F, -2.7857F, 0.7914F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.4031F, -0.4705F, -0.2357F, -0.075F, 0.007F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(99, 81).mirror().addBox(-0.5F, -4.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2769F, -2.5284F, 4.2929F, -0.0699F, -0.075F, 0.007F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(111, 75).mirror().addBox(0.4463F, -0.0446F, -0.055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -5.2031F, -0.9705F, 1.1169F, -0.0736F, 0.0169F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(95, 135).mirror().addBox(-0.3F, -2.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0169F)).mirror(false), PartPose.offsetAndRotation(-0.9989F, -8.829F, 11.4864F, -1.601F, -0.1745F, -0.0038F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(41, 117).mirror().addBox(0.4361F, 0.3467F, 6.2956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.3407F, -0.075F, -0.0062F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(88, 81).mirror().addBox(0.4361F, -0.2493F, 3.1353F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 0.2535F, -0.075F, -0.0062F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(0.4611F, -0.3111F, 0.8339F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -6.4031F, 0.2295F, 0.2531F, -0.0744F, 0.013F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(120, 21).mirror().addBox(-0.5F, -0.125F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0194F, -7.0682F, 1.305F, 1.8327F, -0.075F, 0.0091F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(126, 73).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1087F, -6.0481F, -0.5239F, 0.5674F, -0.075F, 0.0091F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(120, 140).mirror().addBox(0.2817F, -0.9373F, -0.4777F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.1031F, -0.6705F, 0.0354F, -0.0747F, -0.01F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(115, 140).mirror().addBox(0.2317F, -0.637F, 0.4902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.1031F, -0.6705F, 0.0877F, -0.0747F, -0.01F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(100, 140).mirror().addBox(0.2317F, -0.1458F, 1.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.1031F, -0.6705F, 0.175F, -0.0747F, -0.01F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(95, 140).mirror().addBox(0.3808F, 0.2717F, 2.3104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -3.1031F, -0.6705F, 0.2361F, -0.0747F, -0.01F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(90, 140).mirror().addBox(0.3808F, 0.8398F, 3.2183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -3.1031F, -0.6705F, 0.3059F, -0.0747F, -0.01F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(140, 77).mirror().addBox(0.3808F, 1.4751F, 4.1312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 145).mirror().addBox(0.3808F, 2.7751F, 8.7312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(140, 73).mirror().addBox(0.3808F, 1.7751F, 7.5312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 140).mirror().addBox(0.3808F, 1.7751F, 6.3312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(136, 69).mirror().addBox(0.3808F, 1.5751F, 5.1312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -3.1031F, -0.6705F, 0.3495F, -0.0747F, -0.01F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(60, 105).mirror().addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4431F, -4.454F, 7.031F, 0.1139F, -0.0747F, -0.011F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(126, 64).mirror().addBox(-0.5F, -1.0F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.266F, -3.6481F, 4.8413F, 0.1749F, -0.075F, -0.0062F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(33, 88).mirror().addBox(-0.5F, -2.25F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6994F, -4.7674F, 9.3351F, -0.0871F, -0.2026F, 0.0241F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(42, 73).mirror().addBox(-0.4432F, 0.327F, -3.1544F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.4942F, -0.3117F, 0.0303F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-0.4432F, 0.2771F, -2.9128F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, 1.276F, -0.3117F, 0.0303F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(50, 145).mirror().addBox(-0.4432F, 2.4555F, 2.7402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 9.6295F, -0.1203F, -0.3117F, 0.0303F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(146, 128).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1953F, -8.0631F, 16.9781F, 3.0626F, -0.0302F, 0.0049F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(146, 125).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2225F, -7.4611F, 17.7761F, -2.2171F, -0.0302F, 0.0049F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(146, 122).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(146, 108).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2173F, -6.736F, 17.4857F, -1.2571F, -0.0302F, 0.0049F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(131, 118).mirror().addBox(-0.5438F, -0.1049F, -0.853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, -8.1856F, 15.5339F, -2.0039F, -0.1005F, -0.3608F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(131, 114).mirror().addBox(-0.5F, -0.175F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)).mirror(false), PartPose.offsetAndRotation(-2.4821F, -8.7217F, 16.2509F, -0.8181F, -0.0944F, -0.364F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(45, 145).mirror().addBox(-0.5413F, -0.7296F, -0.8502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, -8.2606F, 15.5339F, -1.682F, -0.0944F, -0.364F));

		PartDefinition cube_r594 = rightFace.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(126, 59).mirror().addBox(-0.6142F, 0.1587F, -1.0996F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, -8.1856F, 15.5339F, -1.5213F, -0.2706F, -0.3235F));

		PartDefinition cube_r595 = rightFace.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(141, 44).mirror().addBox(-0.0685F, -6.1116F, 1.1477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5678F, -2.7031F, 12.5295F, -0.0013F, -0.0318F, 0.0201F));

		PartDefinition cube_r596 = rightFace.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(0, 126).mirror().addBox(-0.0814F, -6.3474F, -1.7912F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5678F, -2.7031F, 12.5295F, -0.6121F, -0.0318F, 0.0201F));

		PartDefinition cube_r597 = rightFace.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(51, 111).mirror().addBox(-0.0458F, -4.2482F, 2.9389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5678F, -2.7031F, 13.2295F, 0.3129F, -0.0318F, 0.0201F));

		PartDefinition cube_r598 = rightFace.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(51, 104).mirror().addBox(-0.5F, -3.0F, -0.65F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1881F, -2.2998F, 14.6301F, -0.0536F, -0.0318F, 0.0201F));

		PartDefinition cube_r599 = rightFace.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(102, 131).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1917F, -5.7722F, 15.3486F, -1.1401F, -0.0318F, 0.0201F));

		PartDefinition cube_r600 = rightFace.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(145, 116).mirror().addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(140, 62).mirror().addBox(-0.5F, -2.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2764F, -3.1444F, 16.3516F, 1.4256F, -0.0318F, 0.0201F));

		PartDefinition cube_r601 = rightFace.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(40, 145).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2705F, -3.8961F, 16.643F, 0.7274F, -0.0318F, 0.0201F));

		PartDefinition cube_r602 = rightFace.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(145, 119).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2624F, -4.7424F, 16.9203F, 2.2982F, -0.0318F, 0.0201F));

		PartDefinition cube_r603 = rightFace.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(123, 145).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(35, 145).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2434F, -4.9537F, 16.4566F, 0.9456F, -0.0318F, 0.0201F));

		PartDefinition cube_r604 = rightFace.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(10, 145).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2434F, -4.9537F, 16.4566F, -0.887F, -0.0318F, 0.0201F));

		PartDefinition cube_r605 = rightFace.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(146, 105).mirror().addBox(-0.5F, -0.425F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1516F, -7.4806F, 15.2771F, 1.4256F, -0.0318F, 0.0201F));

		PartDefinition cube_r606 = rightFace.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(146, 131).mirror().addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1332F, -6.3093F, 13.9593F, -0.3372F, -0.0318F, 0.0201F));

		PartDefinition cube_r607 = rightFace.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(131, 99).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1626F, -4.3359F, 13.6355F, -1.7335F, -0.0318F, 0.0201F));

		PartDefinition cube_r608 = rightFace.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(76, 146).mirror().addBox(-0.5F, -1.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1521F, -6.4139F, 14.6199F, -0.9743F, -0.0318F, 0.0201F));

		PartDefinition cube_r609 = rightFace.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(42, 136).mirror().addBox(-0.5F, -1.0F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1728F, -6.2079F, 15.1416F, -0.1016F, -0.0318F, 0.0201F));

		PartDefinition cube_r610 = rightFace.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(42, 141).mirror().addBox(-0.5F, -0.375F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, -4.0147F, 14.2722F, 2.1019F, -0.0318F, 0.0201F));

		PartDefinition cube_r611 = rightFace.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(5, 145).mirror().addBox(0.1713F, 0.1051F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -6.2031F, -0.0705F, 0.8827F, -0.0656F, -0.0252F));

		PartDefinition cube_r612 = rightFace.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(40, 148).mirror().addBox(0.1746F, -0.0416F, -1.1455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -6.2031F, -0.0705F, 2.065F, -0.0628F, -0.0268F));

		PartDefinition cube_r613 = rightFace.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(0, 145).mirror().addBox(0.1746F, 0.3265F, 0.7946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false)
				.texOffs(144, 143).mirror().addBox(0.1746F, 0.3265F, 0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -6.2031F, -0.0705F, 0.7473F, -0.0628F, -0.0268F));

		PartDefinition cube_r614 = rightFace.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(45, 148).mirror().addBox(0.1713F, -0.9014F, -1.9366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -6.2031F, -0.0705F, -2.6516F, -0.0656F, -0.0252F));

		PartDefinition cube_r615 = rightFace.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(35, 148).mirror().addBox(0.1713F, 0.2774F, -0.949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, -6.2031F, -0.0705F, 2.1044F, -0.0656F, -0.0252F));

		PartDefinition cube_r616 = rightFace.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(144, 140).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-1.0209F, -4.5881F, 9.9548F, 2.9416F, -0.1274F, -0.0062F));

		PartDefinition cube_r617 = rightFace.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(104, 41).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0924F, -4.8529F, 10.4999F, 3.0114F, -0.1274F, -0.0062F));

		PartDefinition cube_r618 = rightFace.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(144, 137).mirror().addBox(0.7041F, 9.4475F, 0.6534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8678F, -6.4031F, 0.2295F, 1.6413F, -0.1274F, -0.0062F));

		PartDefinition cube_r619 = rightFace.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(118, 144).mirror().addBox(-0.5F, -0.8F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9078F, -8.7656F, 8.8687F, 2.9503F, -0.1274F, -0.0062F));

		PartDefinition cube_r620 = rightFace.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(146, 4).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0343F, -8.8436F, 9.8533F, -1.8232F, -0.1274F, -0.0062F));

		PartDefinition cube_r621 = rightFace.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(139, 145).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9073F, -8.835F, 8.8615F, -3.1322F, -0.1274F, -0.0062F));

		PartDefinition cube_r622 = rightFace.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(131, 95).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7806F, -8.6959F, 7.8793F, 1.7111F, -0.1274F, -0.0062F));

		PartDefinition cube_r623 = rightFace.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(140, 58).mirror().addBox(-0.5F, -2.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6531F, -8.5164F, 6.8922F, -2.7395F, -0.1274F, -0.0062F));

		PartDefinition cube_r624 = rightFace.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(113, 116).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7791F, -8.6986F, 7.8674F, -1.2119F, -0.127F, -0.0118F));

		PartDefinition cube_r625 = rightFace.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(95, 131).mirror().addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4858F, -7.8103F, 5.6677F, -1.1948F, -0.1274F, -0.0062F));

		PartDefinition cube_r626 = rightFace.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(129, 139).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3749F, -7.305F, 4.8265F, -2.6086F, -0.1274F, -0.0062F));

		PartDefinition cube_r627 = rightFace.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(131, 91).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3773F, -6.5979F, 4.8327F, 2.3831F, -0.1274F, -0.0062F));

		PartDefinition cube_r628 = rightFace.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(113, 144).mirror().addBox(-0.5F, 0.0F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2636F, -5.4156F, 4.002F, 1.4668F, -0.1274F, -0.0062F));

		PartDefinition cube_r629 = rightFace.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(99, 144).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3474F, -5.7031F, 4.6425F, 1.205F, -0.1274F, -0.0062F));

		PartDefinition cube_r630 = rightFace.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(134, 145).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9395F, -3.8011F, 9.3576F, -3.0536F, -0.1274F, -0.0062F));

		PartDefinition cube_r631 = rightFace.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(122, 112).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.789F, -6.31F, 8.0604F, -1.8755F, -0.1274F, -0.0062F));

		PartDefinition cube_r632 = rightFace.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(39, 122).mirror().addBox(0.7041F, -8.838F, -2.4205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8178F, -5.8531F, -1.1705F, -1.7883F, -0.1274F, -0.0062F));

		PartDefinition cube_r633 = rightFace.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(127, 106).mirror().addBox(0.7041F, -6.8696F, -3.0252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8178F, -5.8531F, -1.1705F, -1.8755F, -0.1274F, -0.0062F));

		PartDefinition cube_r634 = rightFace.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(94, 144).mirror().addBox(-0.3315F, -0.3327F, -1.2133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(71, 146).mirror().addBox(-0.1065F, -0.3327F, -1.2133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3032F, -8.7494F, 12.5823F, 1.5812F, -0.3521F, 0.0148F));

		PartDefinition cube_r635 = rightFace.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(146, 68).mirror().addBox(-0.5F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.0179F, -8.0571F, 12.992F, -1.3685F, -0.3521F, 0.0148F));

		PartDefinition cube_r636 = rightFace.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(146, 55).mirror().addBox(-0.0813F, 0.2835F, -1.0563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.3032F, -8.7494F, 12.5823F, 1.2932F, -0.3521F, 0.0148F));

		PartDefinition cube_r637 = rightFace.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(146, 52).mirror().addBox(-0.5F, -0.675F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.0337F, -5.985F, 12.8118F, 0.1202F, -0.3233F, 0.0553F));

		PartDefinition cube_r638 = rightFace.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(146, 49).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.903F, -6.4439F, 12.4981F, 0.382F, -0.3233F, 0.0553F));

		PartDefinition cube_r639 = rightFace.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(146, 46).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0018F, -5.5165F, 12.6393F, 1.2285F, -0.3233F, 0.0553F));

		PartDefinition cube_r640 = rightFace.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(146, 43).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.8277F, -5.4424F, 12.1082F, 1.7957F, -0.3233F, 0.0553F));

		PartDefinition cube_r641 = rightFace.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(144, 146).mirror().addBox(-0.5F, -1.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(146, 40).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.9815F, -5.0106F, 12.4954F, 2.6248F, -0.3233F, 0.0553F));

		PartDefinition cube_r642 = rightFace.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(146, 33).mirror().addBox(-0.027F, -0.9876F, 0.7085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3032F, -8.7494F, 12.5823F, -2.1313F, -0.3233F, 0.0553F));

		PartDefinition cube_r643 = rightFace.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(30, 146).mirror().addBox(-0.5F, -0.55F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-1.7872F, -6.1398F, 12.1026F, 1.3594F, -0.3233F, 0.0553F));

		PartDefinition cube_r644 = rightFace.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(146, 26).mirror().addBox(-0.5F, -0.55F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-1.7959F, -5.9401F, 12.0956F, 1.9266F, -0.3233F, 0.0553F));

		PartDefinition cube_r645 = rightFace.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(25, 146).mirror().addBox(-0.027F, -2.4893F, -0.6374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-2.3032F, -8.7494F, 12.5823F, 2.7993F, -0.3233F, 0.0553F));

		PartDefinition cube_r646 = rightFace.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(88, 131).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.9131F, -8.1189F, 12.7095F, -1.9444F, -0.3521F, 0.0148F));

		PartDefinition cube_r647 = rightFace.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(146, 23).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9791F, -8.281F, 12.8956F, -0.9496F, -0.3521F, 0.0148F));

		PartDefinition cube_r648 = rightFace.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(117, 75).mirror().addBox(-0.025F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.608F, -2.4083F, 12.971F, 1.1712F, -0.3123F, 0.117F));

		PartDefinition cube_r649 = rightFace.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(64, 132).mirror().addBox(-0.5F, -4.975F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(83, 125).mirror().addBox(-0.5F, -4.975F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.169F, -2.3338F, 14.0901F, -0.0797F, -0.0313F, 0.0185F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.8126F, 2.1882F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(57, 132).mirror().addBox(-0.3948F, -0.0034F, -1.9002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -0.0325F, -0.1047F, -0.0351F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(141, 8).mirror().addBox(-0.3956F, 0.087F, -2.8418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -0.2332F, -0.1047F, -0.0351F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(145, 90).mirror().addBox(-0.3615F, -1.8374F, -1.238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 1.2512F, -0.0895F, -0.0509F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(132, 126).mirror().addBox(-0.3956F, 2.8103F, -0.4087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -1.6294F, -0.1047F, -0.0351F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(119, 135).mirror().addBox(-1.0587F, -0.7056F, -4.5948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 0.0238F, -0.2791F, -0.0713F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(145, 93).mirror().addBox(-1.1261F, 3.94F, -6.6089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -0.1443F, -0.2486F, -0.0707F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(128, 83).mirror().addBox(-1.1261F, 1.7858F, -7.7483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 0.1175F, -0.2486F, -0.0707F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(120, 41).mirror().addBox(-1.0587F, -1.1912F, -6.5003F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 0.1285F, -0.2791F, -0.0713F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(120, 47).mirror().addBox(-0.5014F, -1.191F, -8.6884F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(136, 25).mirror().addBox(-0.5261F, -1.1923F, -7.4848F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 0.1277F, -0.1918F, -0.0707F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(101, 89).mirror().addBox(-0.3948F, 0.0148F, -2.8631F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 0.2293F, -0.1047F, -0.0351F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.3948F, 0.1932F, -3.038F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 0.3951F, -0.1047F, -0.0351F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(124, 135).mirror().addBox(-0.3948F, -1.0709F, -4.5161F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 0.4562F, -0.1047F, -0.0351F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(132, 130).mirror().addBox(-1.0536F, -5.2301F, -2.1531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 1.9785F, -0.2791F, -0.0713F));

		PartDefinition cube_r663 = jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(133, 58).mirror().addBox(-1.0536F, -6.0526F, -2.4052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 1.9262F, -0.2791F, -0.0713F));

		PartDefinition cube_r664 = jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(136, 122).mirror().addBox(-1.0536F, -2.9167F, 5.8162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -2.8735F, -0.2791F, -0.0713F));

		PartDefinition cube_r665 = jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(102, 30).mirror().addBox(-1.0536F, 6.0286F, 0.3166F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -1.5208F, -0.2791F, -0.0713F));

		PartDefinition cube_r666 = jaw.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(102, 126).mirror().addBox(-1.1561F, -0.0561F, 0.1966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -7.9659F, -1.8879F, -0.1226F, -0.0686F));

		PartDefinition cube_r667 = jaw.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(111, 69).mirror().addBox(-0.3611F, 5.4562F, 3.8442F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -1.9367F, -0.1748F, -0.0691F));

		PartDefinition cube_r668 = jaw.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(114, 127).mirror().addBox(-0.7166F, 0.4437F, 0.2751F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -1.6268F, -0.0526F, -0.0694F));

		PartDefinition cube_r669 = jaw.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(137, 0).mirror().addBox(-0.7166F, 5.9649F, -0.0829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -1.6442F, -0.0526F, -0.0694F));

		PartDefinition cube_r670 = jaw.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(143, 30).mirror().addBox(-0.7166F, -0.836F, 7.0146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0179F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -3.0841F, -0.0526F, -0.0694F));

		PartDefinition cube_r671 = jaw.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(11, 103).mirror().addBox(-0.7166F, -0.6382F, 3.9877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -3.0405F, -0.0526F, -0.0694F));

		PartDefinition cube_r672 = jaw.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(108, 141).mirror().addBox(-0.7166F, 4.2687F, -0.7099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -1.5395F, -0.0526F, -0.0694F));

		PartDefinition cube_r673 = jaw.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(7, 124).mirror().addBox(-0.8091F, -0.1833F, -1.5153F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -1.346F, -0.0744F, -0.0695F));

		PartDefinition cube_r674 = jaw.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(134, 44).mirror().addBox(-0.7138F, 1.7033F, -2.1762F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 73).mirror().addBox(-0.7138F, 2.7033F, -2.0762F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -1.5046F, -0.0526F, -0.0694F));

		PartDefinition cube_r675 = jaw.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(133, 62).mirror().addBox(-0.9769F, 3.1823F, -2.2648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -7.9659F, -1.5034F, -0.07F, -0.0695F));

		PartDefinition cube_r676 = jaw.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(69, 134).mirror().addBox(-0.7138F, 4.8388F, -1.1826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 77).mirror().addBox(-0.7138F, 5.8388F, -1.3326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(134, 4).mirror().addBox(-0.7138F, 6.8388F, -1.1326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -1.6792F, -0.0526F, -0.0694F));

		PartDefinition cube_r677 = jaw.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(54, 128).mirror().addBox(-0.7138F, 3.7895F, -1.8217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -1.5919F, -0.0526F, -0.0694F));

		PartDefinition cube_r678 = jaw.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(69, 121).mirror().addBox(-0.8448F, -0.6459F, -0.5606F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, -1.7888F, -0.1051F, -0.0684F));

		PartDefinition cube_r679 = jaw.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(147, 102).mirror().addBox(-1.208F, 1.7281F, -1.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -7.9659F, -1.4806F, -0.1443F, -0.0688F));

		PartDefinition cube_r680 = jaw.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(86, 103).mirror().addBox(-0.8448F, -0.6692F, -2.9973F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -10.6659F, 0.07F, -0.1051F, -0.0684F));

		PartDefinition cube_r681 = jaw.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(120, 53).mirror().addBox(-1.1561F, -1.9003F, -0.2339F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.3204F, 1.3127F, -7.9659F, 1.6594F, -0.1226F, -0.0686F));

		PartDefinition cube_r682 = jaw.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(117, 64).mirror().addBox(-0.3948F, 2.787F, -1.5348F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -0.9924F, -0.1047F, -0.0351F));

		PartDefinition cube_r683 = jaw.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(134, 8).mirror().addBox(-0.3948F, -0.5181F, 0.6827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -2.2927F, -0.1047F, -0.0351F));

		PartDefinition cube_r684 = jaw.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(127, 7).mirror().addBox(-0.4972F, -0.6183F, -1.577F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2278F, -3.6043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r685 = jaw.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(127, 12).mirror().addBox(-0.7543F, -0.208F, 1.1052F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2278F, -3.6043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r686 = jaw.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(134, 40).mirror().addBox(-0.3948F, 0.1447F, 1.218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -2.0309F, -0.1047F, -0.0351F));

		PartDefinition cube_r687 = jaw.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(20, 138).mirror().addBox(-1.0536F, 4.4602F, -6.1284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -0.2991F, -0.2791F, -0.0713F));

		PartDefinition cube_r688 = jaw.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(146, 7).mirror().addBox(-1.1261F, 6.0377F, 2.2751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -1.4533F, -0.2486F, -0.0707F));

		PartDefinition cube_r689 = jaw.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(146, 14).mirror().addBox(-1.1261F, -2.1452F, 5.877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -2.8495F, -0.2486F, -0.0707F));

		PartDefinition cube_r690 = jaw.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(15, 146).mirror().addBox(-1.1261F, -6.5806F, -0.2278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 2.1683F, -0.2486F, -0.0707F));

		PartDefinition cube_r691 = jaw.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(37, 141).mirror().addBox(-1.1261F, -6.6163F, -0.6022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 2.0374F, -0.2486F, -0.0707F));

		PartDefinition cube_r692 = jaw.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(146, 17).mirror().addBox(-1.1261F, -4.297F, -4.803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 1.252F, -0.2486F, -0.0707F));

		PartDefinition cube_r693 = jaw.addOrReplaceChild("cube_r693", CubeListBuilder.create().texOffs(128, 87).mirror().addBox(-0.6226F, 4.9996F, -7.0463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, -0.3674F, -0.1789F, -0.0696F));

		PartDefinition cube_r694 = jaw.addOrReplaceChild("cube_r694", CubeListBuilder.create().texOffs(20, 146).mirror().addBox(-0.6226F, -6.7548F, -5.512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 1.3342F, -0.1789F, -0.0696F));

		PartDefinition cube_r695 = jaw.addOrReplaceChild("cube_r695", CubeListBuilder.create().texOffs(146, 20).mirror().addBox(-0.6226F, -6.5695F, 5.3328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.1873F, 0.4341F, 2.7305F, -0.1789F, -0.0696F));

		PartDefinition cube_r696 = jaw.addOrReplaceChild("cube_r696", CubeListBuilder.create().texOffs(127, 12).addBox(0.7543F, -0.208F, 1.1052F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2278F, -3.6043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r697 = jaw.addOrReplaceChild("cube_r697", CubeListBuilder.create().texOffs(127, 7).addBox(0.4972F, -0.6183F, -1.577F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2278F, -3.6043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r698 = jaw.addOrReplaceChild("cube_r698", CubeListBuilder.create().texOffs(134, 40).addBox(-0.6052F, 0.1447F, 1.218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -2.0309F, 0.1047F, 0.0351F));

		PartDefinition cube_r699 = jaw.addOrReplaceChild("cube_r699", CubeListBuilder.create().texOffs(134, 8).addBox(-0.6052F, -0.5181F, 0.6827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -2.2927F, 0.1047F, 0.0351F));

		PartDefinition cube_r700 = jaw.addOrReplaceChild("cube_r700", CubeListBuilder.create().texOffs(117, 64).addBox(-0.6052F, 2.787F, -1.5348F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -0.9924F, 0.1047F, 0.0351F));

		PartDefinition cube_r701 = jaw.addOrReplaceChild("cube_r701", CubeListBuilder.create().texOffs(120, 53).addBox(0.1561F, -1.9003F, -0.2339F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -7.9659F, 1.6594F, 0.1226F, 0.0686F));

		PartDefinition cube_r702 = jaw.addOrReplaceChild("cube_r702", CubeListBuilder.create().texOffs(86, 103).addBox(-0.1552F, -0.6692F, -2.9973F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, 0.07F, 0.1051F, 0.0684F));

		PartDefinition cube_r703 = jaw.addOrReplaceChild("cube_r703", CubeListBuilder.create().texOffs(147, 102).addBox(0.208F, 1.7281F, -1.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -7.9659F, -1.4806F, 0.1443F, 0.0688F));

		PartDefinition cube_r704 = jaw.addOrReplaceChild("cube_r704", CubeListBuilder.create().texOffs(69, 121).addBox(-0.1552F, -0.6459F, -0.5606F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -1.7888F, 0.1051F, 0.0684F));

		PartDefinition cube_r705 = jaw.addOrReplaceChild("cube_r705", CubeListBuilder.create().texOffs(54, 128).addBox(-0.2862F, 3.7895F, -1.8217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -1.5919F, 0.0526F, 0.0694F));

		PartDefinition cube_r706 = jaw.addOrReplaceChild("cube_r706", CubeListBuilder.create().texOffs(134, 4).addBox(-0.2862F, 6.8388F, -1.1326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 77).addBox(-0.2862F, 5.8388F, -1.3326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 134).addBox(-0.2862F, 4.8388F, -1.1826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -1.6792F, 0.0526F, 0.0694F));

		PartDefinition cube_r707 = jaw.addOrReplaceChild("cube_r707", CubeListBuilder.create().texOffs(133, 73).addBox(-0.2862F, 2.7033F, -2.0762F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(134, 44).addBox(-0.2862F, 1.7033F, -2.1762F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -1.5046F, 0.0526F, 0.0694F));

		PartDefinition cube_r708 = jaw.addOrReplaceChild("cube_r708", CubeListBuilder.create().texOffs(133, 62).addBox(-0.0231F, 3.1823F, -2.2648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -7.9659F, -1.5034F, 0.07F, 0.0695F));

		PartDefinition cube_r709 = jaw.addOrReplaceChild("cube_r709", CubeListBuilder.create().texOffs(7, 124).addBox(-0.1909F, -0.1833F, -1.5153F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -1.346F, 0.0744F, 0.0695F));

		PartDefinition cube_r710 = jaw.addOrReplaceChild("cube_r710", CubeListBuilder.create().texOffs(108, 141).addBox(-0.2834F, 4.2687F, -0.7099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -1.5395F, 0.0526F, 0.0694F));

		PartDefinition cube_r711 = jaw.addOrReplaceChild("cube_r711", CubeListBuilder.create().texOffs(11, 103).addBox(-0.2834F, -0.6382F, 3.9877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -3.0405F, 0.0526F, 0.0694F));

		PartDefinition cube_r712 = jaw.addOrReplaceChild("cube_r712", CubeListBuilder.create().texOffs(143, 30).addBox(-0.2834F, -0.836F, 7.0146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0179F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -3.0841F, 0.0526F, 0.0694F));

		PartDefinition cube_r713 = jaw.addOrReplaceChild("cube_r713", CubeListBuilder.create().texOffs(137, 0).addBox(-0.2834F, 5.9649F, -0.0829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -1.6442F, 0.0526F, 0.0694F));

		PartDefinition cube_r714 = jaw.addOrReplaceChild("cube_r714", CubeListBuilder.create().texOffs(114, 127).addBox(-0.2834F, 0.4437F, 0.2751F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -10.6659F, -1.6268F, 0.0526F, 0.0694F));

		PartDefinition cube_r715 = jaw.addOrReplaceChild("cube_r715", CubeListBuilder.create().texOffs(111, 69).addBox(-0.6389F, 5.4562F, 3.8442F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -1.9367F, 0.1748F, 0.0691F));

		PartDefinition cube_r716 = jaw.addOrReplaceChild("cube_r716", CubeListBuilder.create().texOffs(102, 126).addBox(0.1561F, -0.0561F, 0.1966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3204F, 1.3127F, -7.9659F, -1.8879F, 0.1226F, 0.0686F));

		PartDefinition cube_r717 = jaw.addOrReplaceChild("cube_r717", CubeListBuilder.create().texOffs(20, 138).addBox(0.0536F, 4.4602F, -6.1284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -0.2991F, 0.2791F, 0.0713F));

		PartDefinition cube_r718 = jaw.addOrReplaceChild("cube_r718", CubeListBuilder.create().texOffs(102, 30).addBox(0.0536F, 6.0286F, 0.3166F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -1.5208F, 0.2791F, 0.0713F));

		PartDefinition cube_r719 = jaw.addOrReplaceChild("cube_r719", CubeListBuilder.create().texOffs(136, 122).addBox(0.0536F, -2.9167F, 5.8162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -2.8735F, 0.2791F, 0.0713F));

		PartDefinition cube_r720 = jaw.addOrReplaceChild("cube_r720", CubeListBuilder.create().texOffs(133, 58).addBox(0.0536F, -6.0526F, -2.4052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 1.9262F, 0.2791F, 0.0713F));

		PartDefinition cube_r721 = jaw.addOrReplaceChild("cube_r721", CubeListBuilder.create().texOffs(132, 130).addBox(0.0536F, -5.2301F, -2.1531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 1.9785F, 0.2791F, 0.0713F));

		PartDefinition cube_r722 = jaw.addOrReplaceChild("cube_r722", CubeListBuilder.create().texOffs(124, 135).addBox(-0.6052F, -1.0709F, -4.5161F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 0.4562F, 0.1047F, 0.0351F));

		PartDefinition cube_r723 = jaw.addOrReplaceChild("cube_r723", CubeListBuilder.create().texOffs(0, 102).addBox(-0.6052F, 0.1932F, -3.038F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 0.3951F, 0.1047F, 0.0351F));

		PartDefinition cube_r724 = jaw.addOrReplaceChild("cube_r724", CubeListBuilder.create().texOffs(101, 89).addBox(-0.6052F, 0.0148F, -2.8631F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 0.2293F, 0.1047F, 0.0351F));

		PartDefinition cube_r725 = jaw.addOrReplaceChild("cube_r725", CubeListBuilder.create().texOffs(136, 25).addBox(-0.4739F, -1.1923F, -7.4848F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(120, 47).addBox(-0.4986F, -1.191F, -8.6884F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 0.1277F, 0.1918F, 0.0707F));

		PartDefinition cube_r726 = jaw.addOrReplaceChild("cube_r726", CubeListBuilder.create().texOffs(120, 41).addBox(0.0587F, -1.1912F, -6.5003F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 0.1285F, 0.2791F, 0.0713F));

		PartDefinition cube_r727 = jaw.addOrReplaceChild("cube_r727", CubeListBuilder.create().texOffs(128, 87).addBox(-0.3774F, 4.9996F, -7.0463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -0.3674F, 0.1789F, 0.0696F));

		PartDefinition cube_r728 = jaw.addOrReplaceChild("cube_r728", CubeListBuilder.create().texOffs(128, 83).addBox(0.1261F, 1.7858F, -7.7483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 0.1175F, 0.2486F, 0.0707F));

		PartDefinition cube_r729 = jaw.addOrReplaceChild("cube_r729", CubeListBuilder.create().texOffs(37, 141).addBox(0.1261F, -6.6163F, -0.6022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 2.0374F, 0.2486F, 0.0707F));

		PartDefinition cube_r730 = jaw.addOrReplaceChild("cube_r730", CubeListBuilder.create().texOffs(146, 17).addBox(0.1261F, -4.297F, -4.803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 1.252F, 0.2486F, 0.0707F));

		PartDefinition cube_r731 = jaw.addOrReplaceChild("cube_r731", CubeListBuilder.create().texOffs(15, 146).addBox(0.1261F, -6.5806F, -0.2278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 2.1683F, 0.2486F, 0.0707F));

		PartDefinition cube_r732 = jaw.addOrReplaceChild("cube_r732", CubeListBuilder.create().texOffs(146, 14).addBox(0.1261F, -2.1452F, 5.877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -2.8495F, 0.2486F, 0.0707F));

		PartDefinition cube_r733 = jaw.addOrReplaceChild("cube_r733", CubeListBuilder.create().texOffs(146, 7).addBox(0.1261F, 6.0377F, 2.2751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -1.4533F, 0.2486F, 0.0707F));

		PartDefinition cube_r734 = jaw.addOrReplaceChild("cube_r734", CubeListBuilder.create().texOffs(146, 20).addBox(-0.3774F, -6.5695F, 5.3328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 2.7305F, 0.1789F, 0.0696F));

		PartDefinition cube_r735 = jaw.addOrReplaceChild("cube_r735", CubeListBuilder.create().texOffs(20, 146).addBox(-0.3774F, -6.7548F, -5.512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 1.3342F, 0.1789F, 0.0696F));

		PartDefinition cube_r736 = jaw.addOrReplaceChild("cube_r736", CubeListBuilder.create().texOffs(145, 93).addBox(0.1261F, 3.94F, -6.6089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -0.1443F, 0.2486F, 0.0707F));

		PartDefinition cube_r737 = jaw.addOrReplaceChild("cube_r737", CubeListBuilder.create().texOffs(119, 135).addBox(0.0587F, -0.7056F, -4.5948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 0.0238F, 0.2791F, 0.0713F));

		PartDefinition cube_r738 = jaw.addOrReplaceChild("cube_r738", CubeListBuilder.create().texOffs(132, 126).addBox(-0.6044F, 2.8103F, -0.4087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -1.6294F, 0.1047F, 0.0351F));

		PartDefinition cube_r739 = jaw.addOrReplaceChild("cube_r739", CubeListBuilder.create().texOffs(145, 90).addBox(-0.6385F, -1.8374F, -1.238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, 1.2512F, 0.0895F, 0.0509F));

		PartDefinition cube_r740 = jaw.addOrReplaceChild("cube_r740", CubeListBuilder.create().texOffs(141, 8).addBox(-0.6044F, 0.087F, -2.8418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -0.2332F, 0.1047F, 0.0351F));

		PartDefinition cube_r741 = jaw.addOrReplaceChild("cube_r741", CubeListBuilder.create().texOffs(57, 132).addBox(-0.6052F, -0.0034F, -1.9002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.7203F, -0.1873F, 0.4341F, -0.0325F, 0.1047F, 0.0351F));

		return LayerDefinition.create(meshdefinition, 155, 155);
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