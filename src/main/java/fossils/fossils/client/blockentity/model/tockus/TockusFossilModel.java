package fossils.fossils.client.blockentity.model.tockus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TockusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
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
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public TockusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe3 = this.leftLeg3.getChild("toe3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail2.getChild("tail4");
		this.tail5 = this.tail2.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
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
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.2506F, 7.7398F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(110, 66).addBox(-0.4F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.4707F, -2.944F, -0.6047F, 0.2909F, -0.1957F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 43).addBox(-0.5F, -0.6278F, -4.9675F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.5437F, 1.8286F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 63).addBox(-0.5F, -0.0479F, -0.0075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.5437F, 3.6286F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 99).addBox(-0.5F, -0.6308F, -0.0326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.5437F, 1.8286F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.9801F, -0.6585F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, 0.774F, -4.5424F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 0).addBox(3.5756F, -2.84F, -0.1493F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2838F, -0.9338F, 1.5378F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(23, 8).addBox(3.5756F, -2.84F, -0.4493F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9946F, -0.8226F, 1.1643F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 25).addBox(0.7825F, -3.028F, -1.9449F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.4521F, -0.9196F, 1.7655F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(34, 88).addBox(-1.5F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5093F, -0.8407F, 1.918F, -1.0055F, -0.9313F, 1.5791F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(98, 65).addBox(-1.1088F, -2.8637F, -0.5255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4986F, -0.1313F, 0.9354F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6212F, -2.3441F, 1.5042F, -0.5905F, 0.1223F, 0.8612F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(99, 43).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2824F, -2.6295F, 2.0113F, -0.887F, 0.592F, 0.0565F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(92, 29).addBox(-0.7047F, -3.4021F, -0.8133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9281F, -0.1396F, 0.1682F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(5, 58).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2829F, 2.193F, 7.3882F, -1.3646F, 0.3936F, -0.919F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(28, 102).addBox(-7.412F, -4.0196F, 5.5768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.062F, 0.6309F, -0.4822F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(52, 39).addBox(-1.8265F, -0.4689F, -0.0189F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9657F, 4.6825F, 8.8698F, -0.9646F, 0.1371F, 0.1874F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(99, 39).addBox(1.835F, -0.6681F, 6.2688F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6084F, 1.7415F, 3.8356F, -1.0984F, 0.0703F, 0.4652F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(85, 35).addBox(-0.6473F, -0.8217F, -0.2609F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6084F, 5.8415F, 5.6356F, -1.2326F, 0.2231F, 0.1476F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(110, 63).addBox(0.309F, -1.3205F, 2.4654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9657F, 4.6825F, 8.8698F, -1.2937F, 0.0647F, 0.1921F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(95, 97).addBox(0.309F, 0.4553F, 1.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9657F, 4.6825F, 8.8698F, -0.8138F, 0.0647F, 0.1921F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(98, 47).addBox(0.4354F, -7.6919F, 1.1995F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7129F, 0.158F, 0.0101F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 57).addBox(-0.55F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6342F, 1.6603F, 4.3274F, -0.9719F, 0.3286F, -0.0508F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 92).addBox(-0.525F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2507F, 3.3685F, 6.0658F, -0.8137F, 0.3136F, 0.0405F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(39, 43).addBox(-1.5905F, -0.5427F, -0.4116F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6084F, 1.7415F, 3.9856F, -1.1607F, 0.2881F, -0.1219F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(85, 42).addBox(-0.5F, -2.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2496F, 6.9998F, 8.1879F, -1.0988F, 0.0467F, 0.147F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(106, 43).addBox(-0.5F, -1.6F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4676F, 5.4517F, 7.9515F, -1.4043F, 0.0467F, 0.147F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(106, 39).addBox(-0.7569F, -1.2279F, -2.7484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2206F, 9.9012F, 9.266F, -1.3587F, 0.0831F, 0.1301F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(99, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1468F, 8.1474F, 8.7518F, -2.1441F, 0.0831F, 0.1301F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(110, 84).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9362F, 9.1795F, 7.8505F, -0.7948F, 0.0272F, 0.1518F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 110).addBox(-0.693F, 0.0009F, -0.6521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2206F, 8.7012F, 8.166F, -1.1841F, 0.0831F, 0.1301F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(80, 48).addBox(-0.5795F, -2.0034F, -0.9075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2206F, 7.2012F, 6.566F, -1.4453F, 0.0791F, 0.1378F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(9, 79).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2206F, 6.5012F, 7.066F, -0.9792F, 0.1421F, 0.0125F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 64).addBox(-0.464F, -4.029F, 7.2564F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7895F, 0.072F, 0.2392F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(40, 8).addBox(-0.9328F, -1.9013F, 2.3415F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5288F, 0.3396F, 0.5181F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.774F, -4.5424F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-8.5756F, -2.84F, -0.1493F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2838F, 0.9338F, -1.5378F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(23, 8).mirror().addBox(-8.5756F, -2.84F, -0.4493F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9946F, 0.8226F, -1.1643F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(34, 25).mirror().addBox(-4.7825F, -3.028F, -1.9449F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.4521F, 0.9196F, -1.7655F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(34, 88).mirror().addBox(-0.5F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5093F, -0.8407F, 1.918F, -1.0055F, 0.9313F, -1.5791F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(98, 65).mirror().addBox(0.1089F, -2.8637F, -0.5255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4986F, 0.1313F, -0.9354F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6212F, -2.3441F, 1.5042F, -0.5905F, -0.1223F, -0.8612F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(99, 43).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2824F, -2.6295F, 2.0113F, -0.887F, -0.592F, -0.0565F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(92, 29).mirror().addBox(-0.2953F, -3.4021F, -0.8133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9281F, 0.1396F, -0.1682F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(5, 58).mirror().addBox(-0.5F, 0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2829F, 2.193F, 7.3882F, -1.3646F, -0.3936F, 0.919F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(28, 102).mirror().addBox(6.412F, -4.0196F, 5.5768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.062F, -0.6309F, 0.4822F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(-1.1735F, -0.4689F, -0.0189F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.6825F, 8.8698F, -0.9646F, -0.1371F, -0.1874F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(99, 39).mirror().addBox(-2.835F, -0.6681F, 6.2688F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6084F, 1.7415F, 3.8356F, -1.0984F, -0.0703F, -0.4652F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(85, 35).mirror().addBox(-0.3527F, -0.8217F, -0.2609F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6084F, 5.8415F, 5.6356F, -1.2326F, -0.2231F, -0.1476F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(110, 63).mirror().addBox(-1.309F, -1.3205F, 2.4654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.6825F, 8.8698F, -1.2937F, -0.0647F, -0.1921F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(95, 97).mirror().addBox(-1.309F, 0.4553F, 1.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.6825F, 8.8698F, -0.8138F, -0.0647F, -0.1921F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(98, 47).mirror().addBox(-1.4354F, -7.6919F, 1.1995F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7129F, -0.158F, -0.0101F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(56, 57).mirror().addBox(-0.45F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6342F, 1.6603F, 4.3274F, -0.9719F, -0.3286F, 0.0508F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(30, 92).mirror().addBox(-0.475F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2507F, 3.3685F, 6.0658F, -0.8137F, -0.3136F, -0.0405F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(39, 43).mirror().addBox(0.5905F, -0.5427F, -0.4116F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6084F, 1.7415F, 3.9856F, -1.1607F, -0.2881F, 0.1219F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(85, 42).mirror().addBox(-0.5F, -2.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2496F, 6.9998F, 8.1879F, -1.0988F, -0.0467F, -0.147F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(106, 43).mirror().addBox(-0.5F, -1.6F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4676F, 5.4517F, 7.9515F, -1.4043F, -0.0467F, -0.147F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(106, 39).mirror().addBox(-0.2431F, -1.2279F, -2.7484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2206F, 9.9012F, 9.266F, -1.3587F, -0.0831F, -0.1301F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(99, 29).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1468F, 8.1474F, 8.7518F, -2.1441F, -0.0831F, -0.1301F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(110, 84).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9362F, 9.1795F, 7.8505F, -0.7948F, -0.0272F, -0.1518F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 110).mirror().addBox(-0.307F, 0.0009F, -0.6521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2206F, 8.7012F, 8.166F, -1.1841F, -0.0831F, -0.1301F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(80, 48).mirror().addBox(-0.4205F, -2.0034F, -0.9075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2206F, 7.2012F, 6.566F, -1.4453F, -0.0791F, -0.1378F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 79).mirror().addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2206F, 6.5012F, 7.066F, -0.9792F, -0.1421F, -0.0125F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-3.536F, -4.029F, 7.2564F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7895F, -0.072F, -0.2392F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(40, 8).mirror().addBox(-0.0672F, -1.9013F, 2.3415F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5288F, -0.3396F, -0.5181F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 2.6641F, -0.5099F, -1.0641F, -0.2854F, -0.0975F));

		PartDefinition cube_r64 = leftLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(91, 70).addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 65).addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.9684F, 0.5304F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.9684F, 0.5304F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(25, 88).addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 7.9684F, 0.5304F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(60, 89).addBox(-4.5F, 0.0F, -1.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.5F, 3.3215F, 1.188F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(84, 86).addBox(-4.5F, -5.489F, -0.0711F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 8.6737F, -0.6143F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(90, 54).addBox(-4.5F, -3.5F, -1.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.5F, 3.3737F, 1.1857F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(53, 69).addBox(-1.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 2.8164F, -0.0186F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(89, 48).addBox(-4.5F, 0.275F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.5F, 1.0342F, -0.7779F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(62, 102).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.5F, -0.5507F, -1.0515F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(105, 47).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -1.4377F, -0.5898F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 105).addBox(-4.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -0.5507F, -1.0515F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(61, 77).addBox(-1.5F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -0.2263F, 0.6857F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(55, 13).addBox(-1.7F, 9.0746F, -1.6615F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.3F, 9.2352F, 0.5723F, 1.9794F, 0.0252F, 0.1781F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(77, 30).addBox(0.25F, -1.5F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 79).addBox(-1.75F, -1.5F, -0.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.05F, 1.8629F, -0.6323F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(38, 57).addBox(-2.5F, -7.9356F, 0.2547F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 9.1121F, -2.0756F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(70, 25).addBox(-2.5F, -0.0357F, 0.2797F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.8F, 9.1121F, -2.0756F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(31, 67).addBox(-1.5F, -0.8F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(31, 50).addBox(-2.5F, -7.9751F, -0.9665F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 9.0497F, -0.6949F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(106, 29).addBox(-0.6532F, -0.294F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.325F, 0.9636F, 0.4564F, -0.3576F, 0.0073F, 0.1217F));

		PartDefinition cube_r82 = leftLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(43, 90).addBox(-0.6532F, 1.4677F, -1.2621F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.325F, 0.9636F, 0.4564F, -0.0958F, 0.0073F, 0.1217F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(36, 80).addBox(-1.5F, 4.5554F, -0.8239F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 17.7163F, -3.0676F, -1.5172F, 0.0007F, -0.0102F));

		PartDefinition cube_r83 = leftLeg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 84).addBox(-5.5F, -5.1F, -0.05F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.0F, 4.6554F, -0.7739F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(43, 83).addBox(-5.5F, -5.1F, -0.05F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.6554F, -0.7739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition toe3 = leftLeg3.addOrReplaceChild("toe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5199F, 8.5735F, 0.0243F, 1.6581F, -0.3927F, 0.0F));

		PartDefinition cube_r85 = toe3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(108, 59).addBox(-1.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r86 = toe3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(60, 108).addBox(-0.4805F, 0.0081F, -0.701F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2679F, 2.8518F, 2.1161F, 0.3332F, -0.0787F, 0.0152F));

		PartDefinition cube_r87 = toe3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(50, 108).addBox(-1.5F, 0.3082F, -0.3881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2679F, 1.0768F, 0.6897F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(23, 0).addBox(-2.5F, -1.0F, -3.85F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1659F, 0.3788F, 1.0036F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(19, 13).addBox(-2.5F, -0.4662F, -5.8479F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.541F, -3.6525F, -0.1443F, -0.0045F, 0.0003F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 2.6641F, -0.5099F, -0.8023F, 0.2854F, 0.0975F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(91, 70).mirror().addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 65).mirror().addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.9684F, 0.5304F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.9684F, 0.5304F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(25, 88).mirror().addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.9684F, 0.5304F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(2.5F, 0.0F, -1.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 3.3215F, 1.188F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(2.5F, -5.489F, -0.0711F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 8.6737F, -0.6143F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(90, 54).mirror().addBox(2.5F, -3.5F, -1.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 3.3737F, 1.1857F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(53, 69).mirror().addBox(-0.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.8164F, -0.0186F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(89, 48).mirror().addBox(2.5F, 0.275F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 1.0342F, -0.7779F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(62, 102).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -0.5507F, -1.0515F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(105, 47).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -1.4377F, -0.5898F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(2.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -0.5507F, -1.0515F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(61, 77).mirror().addBox(-0.5F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.2263F, 0.6857F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(55, 13).mirror().addBox(-0.3F, 9.0746F, -1.6615F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 9.2352F, 0.5723F, 2.023F, -0.0252F, -0.1781F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-1.25F, -1.5F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 79).mirror().addBox(-0.25F, -1.5F, -0.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 1.8629F, -0.6323F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(0.5F, -7.9356F, 0.2547F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 9.1121F, -2.0756F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(70, 25).mirror().addBox(0.5F, -0.0357F, 0.2797F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 9.1121F, -2.0756F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(31, 67).mirror().addBox(-1.5F, -0.8F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(31, 50).mirror().addBox(0.5F, -7.9751F, -0.9665F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 9.0497F, -0.6949F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(106, 29).mirror().addBox(-0.3468F, -0.294F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.9636F, 0.4564F, -0.3576F, -0.0073F, -0.1217F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(-0.3468F, 1.4677F, -1.2621F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.9636F, 0.4564F, -0.0958F, -0.0073F, -0.1217F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(36, 80).mirror().addBox(-0.5F, 4.5554F, -0.8239F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 17.7163F, -3.0676F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(3.5F, -5.1F, -0.05F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 4.6554F, -0.7739F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(43, 83).mirror().addBox(3.5F, -5.1F, -0.05F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 4.6554F, -0.7739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5199F, 8.5735F, 0.0243F, 1.4399F, 0.3927F, 0.0F));

		PartDefinition cube_r109 = toe2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(108, 59).mirror().addBox(0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r110 = toe2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(60, 108).mirror().addBox(-0.5195F, 0.0081F, -0.701F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2679F, 2.8518F, 2.1161F, 0.3332F, 0.0787F, -0.0152F));

		PartDefinition cube_r111 = toe2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(50, 108).mirror().addBox(0.5F, 0.3082F, -0.3881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2679F, 1.0768F, 0.6897F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-1.5F, -1.0F, -3.85F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.1659F, 0.3788F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(19, 13).mirror().addBox(-1.5F, -0.4662F, -5.8479F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.541F, -3.6525F, -0.0396F, 0.0045F, -0.0003F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(73, 76).addBox(-0.5F, -0.1056F, 0.0068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(27, 80).addBox(0.0F, -0.7056F, 0.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 4).addBox(0.0F, -0.5056F, 2.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9107F, 5.7892F, -1.1345F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(102, 96).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(81, 0).addBox(0.0F, -0.594F, 1.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3369F, 2.771F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1354F, 2.1702F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(110, 87).addBox(-0.5F, -1.0153F, 0.0197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.0415F, 0.7845F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(100, 4).addBox(-0.5F, -3.8F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3415F, -0.1155F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = tail2.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1354F, 4.8702F));

		PartDefinition cube_r114 = tail4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5F, 0.0603F, -2.0045F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.1415F, -0.2155F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(74, 104).addBox(-0.5F, -0.375F, -1.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(7, 100).addBox(-0.5F, -1.375F, -0.825F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.6415F, 0.3845F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail5 = tail2.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(70, 81).addBox(-1.0F, -0.8F, -2.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9231F, 3.2546F, -1.4399F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(96, 39).addBox(0.0F, -0.7822F, 1.0707F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(12, 73).addBox(0.0F, -0.1301F, -0.018F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(36, 72).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, 0.0855F, -0.0186F, -0.2103F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(26, 106).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, 0.0415F, 0.0252F, -0.7531F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(34, 23).mirror().addBox(-10.2026F, -1.8495F, -0.5143F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, 0.0233F, 0.0426F, -1.2768F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(53, 23).mirror().addBox(-4.8362F, -1.8967F, 5.0032F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, 0.0329F, -0.7862F, -1.3011F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(19, 106).mirror().addBox(-0.9859F, -1.8249F, 5.4083F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, 0.134F, -1.3958F, -1.4097F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(72, 109).mirror().addBox(0.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.202F, -3.9333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-6.4738F, -1.8207F, 2.2248F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.4408F, -0.0185F, -0.5367F, -1.4166F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(85, 40).mirror().addBox(-11.0759F, -1.8207F, 0.4276F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.4408F, -0.0165F, -0.2749F, -1.4216F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(70, 34).mirror().addBox(-7.1962F, -1.8207F, -0.5144F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.4408F, -0.0161F, -0.1441F, -1.4237F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(-2.8122F, -0.4786F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.4408F, -0.0863F, -0.1166F, -0.8963F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(71, 54).mirror().addBox(-0.9428F, 0.0112F, -0.4971F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.4408F, -0.0973F, -0.0739F, -0.3508F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(109, 12).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, 0.0684F, -0.0222F, -0.21F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(60, 106).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, 0.0287F, 0.0133F, -0.7534F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.9859F, -1.8249F, 5.4083F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, 0.1162F, -1.413F, -1.3921F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(-4.8362F, -1.8967F, 5.0032F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, 0.0262F, -0.803F, -1.2963F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(34, 21).mirror().addBox(-10.2026F, -1.8495F, -0.5143F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, 0.0182F, 0.0259F, -1.2769F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(111, 31).mirror().addBox(-0.9094F, -0.1878F, -0.488F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.2408F, -0.043F, -0.0449F, -0.2586F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(107, 20).mirror().addBox(-2.6805F, -0.6317F, -0.512F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.2408F, -0.0548F, -0.0637F, -0.8036F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(100, 10).mirror().addBox(-2.8576F, -1.8577F, 5.3204F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.2408F, -0.0448F, -1.2167F, -1.2875F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(98, 94).mirror().addBox(-6.7359F, -1.9035F, 4.1216F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.2408F, -0.0202F, -0.6934F, -1.3167F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(23, 6).mirror().addBox(-11.0055F, -1.8874F, -0.512F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.2408F, -0.0156F, -0.0826F, -1.3283F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(109, 53).mirror().addBox(0.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 69).mirror().addBox(0.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 40).mirror().addBox(0.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.102F, -2.1333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 77).addBox(4.4738F, -1.8207F, 2.2248F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.4408F, -0.0185F, 0.5367F, 1.4166F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(70, 34).addBox(2.1962F, -1.8207F, -0.5144F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.4408F, -0.0161F, 0.1441F, 1.4237F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(101, 37).addBox(0.8122F, -0.4786F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.4408F, -0.0863F, 0.1166F, 0.8963F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 54).addBox(-0.0572F, 0.0112F, -0.4971F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.4408F, -0.0973F, 0.0739F, 0.3508F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(72, 109).addBox(-1.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.202F, -3.9333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(19, 106).addBox(-1.0141F, -1.8249F, 5.4083F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, 0.134F, 1.3958F, 1.4097F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(53, 23).addBox(1.8362F, -1.8967F, 5.0032F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, 0.0329F, 0.7862F, 1.3011F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(34, 23).addBox(2.2026F, -1.8495F, -0.5143F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, 0.0233F, -0.0426F, 1.2768F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(26, 106).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, 0.0415F, -0.0252F, 0.7531F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(36, 72).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, 0.0855F, 0.0186F, 0.2103F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(109, 12).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, 0.0684F, 0.0222F, 0.21F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(60, 106).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, 0.0287F, -0.0133F, 0.7534F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(45, 106).addBox(-1.0141F, -1.8249F, 5.4083F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, 0.1162F, 1.413F, 1.3921F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(100, 12).addBox(1.8362F, -1.8967F, 5.0032F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, 0.0262F, 0.803F, 1.2963F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(34, 21).addBox(2.2026F, -1.8495F, -0.5143F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, 0.0182F, -0.0259F, 1.2769F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(111, 31).addBox(-0.0907F, -0.1878F, -0.488F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.2408F, -0.043F, 0.0449F, 0.2586F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(107, 20).addBox(0.6805F, -0.6317F, -0.512F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.2408F, -0.0548F, 0.0637F, 0.8036F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(100, 10).addBox(-0.1424F, -1.8577F, 5.3204F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.2408F, -0.0448F, 1.2167F, 1.2875F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(98, 94).addBox(3.7359F, -1.9035F, 4.1216F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.2408F, -0.0202F, 0.6934F, 1.3167F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(23, 6).addBox(2.0055F, -1.8874F, -0.512F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.2408F, -0.0156F, 0.0826F, 1.3283F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(109, 53).addBox(-1.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 69).addBox(-1.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 40).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.102F, -2.1333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(85, 40).addBox(7.0759F, -1.8207F, 0.4276F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.4408F, -0.0165F, 0.2749F, 1.4216F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -0.0506F, -4.0332F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, -2.8702F, -8.7128F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(112, 0).addBox(0.0F, -1.5468F, -1.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(27, 112).addBox(0.0F, -1.1008F, -1.0624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -0.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 112).addBox(0.0F, -1.3924F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(110, 90).mirror().addBox(-1.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.4408F, 0.3954F, 0.1038F, -0.3153F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(107, 94).mirror().addBox(-2.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.4408F, 0.2485F, 0.2882F, -0.8387F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(90, 52).mirror().addBox(-6.4102F, -1.789F, -0.4287F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.4408F, 0.0667F, 0.3727F, -1.386F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(38, 109).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 43).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 50).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, 0.8932F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(5, 48).mirror().addBox(-7.9328F, -1.8576F, 2.105F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.715F, 0.7592F, 0.0281F, -0.1835F, -1.3007F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(105, 92).mirror().addBox(-4.366F, -1.8332F, 4.8445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.715F, 0.7592F, 0.0377F, -0.7504F, -1.3213F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(44, 5).mirror().addBox(-9.3167F, -1.8145F, -0.4043F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.715F, 0.7592F, 0.0278F, 0.1218F, -1.2922F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(107, 14).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.715F, 0.7592F, 0.0851F, 0.0916F, -0.7664F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(109, 102).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.715F, 0.7592F, 0.157F, 0.0158F, -0.2262F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(101, 51).mirror().addBox(-0.423F, -1.9296F, -0.547F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0794F, 7.7862F, -1.3795F, -0.6918F, 0.225F, -1.8981F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-0.2194F, -3.7003F, -0.5317F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0794F, 8.4862F, -0.8795F, -0.933F, 0.2312F, -1.6111F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(45, 98).mirror().addBox(-0.0334F, -4.9785F, -0.7276F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0794F, 9.2862F, -0.3795F, -1.0109F, -0.055F, -1.6242F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(37, 92).mirror().addBox(-0.3177F, -5.7533F, -0.0231F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9958F, 9.937F, -0.1334F, -1.1513F, -0.0882F, -1.6061F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(38, 109).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 43).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 50).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, 0.8932F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 52).addBox(2.4102F, -1.789F, -0.4287F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.4408F, 0.0667F, -0.3727F, 1.386F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(107, 94).addBox(0.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.4408F, 0.2485F, -0.2882F, 0.8387F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(110, 90).addBox(0.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.4408F, 0.3954F, -0.1038F, 0.3153F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(5, 48).addBox(5.9328F, -1.8576F, 2.105F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.715F, 0.7592F, 0.0281F, 0.1835F, 1.3007F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(105, 92).addBox(2.366F, -1.8332F, 4.8445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.715F, 0.7592F, 0.0377F, 0.7504F, 1.3213F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(44, 5).addBox(2.3167F, -1.8145F, -0.4043F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.715F, 0.7592F, 0.0278F, -0.1218F, 1.2922F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(107, 14).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.715F, 0.7592F, 0.0851F, -0.0916F, 0.7664F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(109, 102).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.715F, 0.7592F, 0.157F, -0.0158F, 0.2262F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(106, 111).addBox(-0.5F, 9.6061F, -5.9522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.3981F, -7.6461F, 1.2462F, 0.0F, 0.0F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(101, 51).addBox(-0.577F, -1.9296F, -0.547F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0794F, 7.7862F, -1.3795F, -0.6918F, -0.225F, 1.8981F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(40, 92).addBox(-0.7806F, -3.7003F, -0.5317F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0794F, 8.4862F, -0.8795F, -0.933F, -0.2312F, 1.6111F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(45, 98).addBox(-0.9666F, -4.9785F, -0.7276F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0794F, 9.2862F, -0.3795F, -1.0109F, 0.055F, 1.6242F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(37, 92).addBox(-0.6823F, -5.7533F, -0.0231F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9958F, 9.937F, -0.1334F, -1.1513F, 0.0882F, 1.6061F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(64, 70).addBox(-2.809F, -2.8685F, 2.6438F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.309F, 8.791F, -5.8809F, 0.3124F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(27, 83).addBox(-2.2799F, -0.7266F, 0.9259F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7799F, 11.1468F, -3.2335F, 0.487F, 0.0F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(88, 81).addBox(-2.2799F, 1.549F, 0.9576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7799F, 12.4468F, -3.0335F, 0.8884F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(100, 14).addBox(-0.5F, 0.0482F, 0.0317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.5981F, -0.7461F, 1.4731F, 0.0F, 0.0F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(38, 50).addBox(-0.5F, 3.7997F, -0.7927F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.3981F, -7.6461F, 0.5568F, 0.0F, 0.0F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(97, 54).addBox(-0.5F, -0.1097F, -0.2731F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3981F, -7.6461F, 0.3779F, 0.0F, 0.0F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(75, 90).addBox(-0.5F, -0.8264F, 1.5217F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 5.3981F, -7.6461F, -0.0585F, 0.0F, 0.0F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(49, 50).addBox(-0.5F, 1.8578F, -0.4337F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.3981F, -7.6461F, 0.4651F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(23, 92).addBox(-0.5F, 7.23F, -2.8406F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.3981F, -7.6461F, 0.884F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(71, 48).addBox(-0.5F, 5.4961F, -2.0033F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3981F, -7.6461F, 0.7706F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(98, 90).addBox(-0.5F, 9.1171F, -3.2369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.3981F, -7.6461F, 0.9277F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(98, 75).addBox(-0.5F, 9.7896F, -4.0637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3981F, -7.6461F, 1.0106F, 0.0F, 0.0F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(14, 90).addBox(-1.5F, 0.6211F, 3.6998F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.9346F, -8.0622F, 0.4171F, 0.0F, 0.0F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(19, 21).addBox(-1.0F, -1.3F, -3.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.831F, -1.0494F, -2.4687F, 2.2835F, 0.1091F, 2.1837F));

		PartDefinition cube_r207 = leftArm1.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(79, 81).addBox(-0.8F, 0.4F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.1081F, -0.9832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftArm1.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(35, 101).addBox(-0.5F, -2.0F, -0.325F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(-0.1081F, 8.6922F, -6.1671F, -0.5629F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftArm1.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(62, 95).addBox(0.0F, -0.1204F, -0.4603F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.6081F, 6.5786F, -4.0689F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftArm1.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(96, 105).addBox(0.0F, -0.0905F, -1.3205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.119F))
				.texOffs(55, 84).addBox(0.0F, -0.0905F, -0.7205F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.6081F, 2.8786F, 0.3312F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftArm1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(107, 0).addBox(0.0F, 0.1859F, 0.2737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6081F, 0.3786F, 0.3312F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftArm1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(92, 42).addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 0.0916F, 0.5522F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftArm1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(50, 83).addBox(0.0F, 0.0589F, 0.307F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.6081F, 1.7786F, -1.2688F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftArm1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(48, 97).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 1.2467F, -0.3734F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5618F, 11.4144F, -5.6998F, 0.8519F, -0.1734F, 2.8761F));

		PartDefinition cube_r215 = leftArm2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(56, 74).addBox(-0.4823F, -0.3448F, -0.1201F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0677F, 10.3683F, 0.4464F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftArm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(91, 85).addBox(-0.4823F, -0.4029F, -0.3197F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0677F, 6.5683F, 1.0464F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftArm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(104, 51).addBox(-0.4823F, -0.7538F, -0.2297F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.0677F, 4.3683F, 1.0464F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftArm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(18, 80).addBox(-0.9823F, -2.7409F, 0.2766F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0677F, 2.8683F, 0.8464F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftArm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(65, 25).addBox(-0.5F, -0.1335F, -0.9143F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.05F, 7.8583F, 1.959F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftArm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(98, 69).addBox(-0.5F, -0.2368F, -0.7616F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.05F, 4.3583F, 1.959F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftArm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(40, 98).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 2.5583F, 1.559F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftArm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(40, 104).addBox(-0.4823F, -3.1157F, -0.1113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0677F, 4.3683F, 1.0464F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftArm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.2844F, -0.2397F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0781F, 6.116F, -2.0291F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftArm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(105, 88).addBox(-0.5F, -0.3F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0781F, 17.4718F, -1.1009F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftArm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(85, 53).addBox(-0.5322F, -2.5041F, -0.9946F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 2.95F, -0.7F, -0.1777F, 0.007F, -0.0146F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4274F, 18.3645F, 0.4442F, 2.8259F, -0.2906F, 0.1798F));

		PartDefinition cube_r226 = leftHand.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(27, 54).addBox(0.0F, -0.3F, -1.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3948F, 0.6679F, -1.435F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftHand.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(15, 24).addBox(0.0F, -1.837F, -0.7461F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3948F, 13.356F, -5.0127F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftHand.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(17, 108).addBox(-0.8657F, 0.4572F, -0.9717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1052F, 0.8179F, -1.035F, 0.1656F, 0.0587F, 0.0425F));

		PartDefinition cube_r229 = leftHand.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(7, 89).addBox(-0.8468F, 1.8718F, -1.4994F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.1052F, 0.8179F, -1.035F, -0.0438F, 0.0513F, 0.0512F));

		PartDefinition cube_r230 = leftHand.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(105, 63).addBox(-1.3059F, 4.0931F, 0.3378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1052F, 0.8179F, -1.035F, -0.2395F, 0.0287F, -0.0422F));

		PartDefinition cube_r231 = leftHand.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(104, 79).addBox(-0.5F, -1.0F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4198F, 8.2456F, -2.0092F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftHand.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(5, 50).addBox(-0.5F, -1.0327F, 1.2083F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.3948F, 13.356F, -5.0127F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftHand.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(67, 63).addBox(-1.0F, -0.65F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftHand.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(31, 72).addBox(-1.0F, -0.6117F, -0.3769F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 68).addBox(-1.0F, -0.6117F, -0.9769F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1052F, 0.8179F, -1.035F, -0.2793F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.831F, -1.0494F, -2.4687F, 2.2835F, -0.1091F, -2.1837F));

		PartDefinition cube_r235 = rightArm1.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(79, 81).mirror().addBox(-1.2F, 0.4F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.1081F, -0.9832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightArm1.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(35, 101).mirror().addBox(-0.5F, -2.0F, -0.325F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.116F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 8.6922F, -6.1671F, -0.5629F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightArm1.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(62, 95).mirror().addBox(-1.0F, -0.1204F, -0.4603F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 6.5786F, -4.0689F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightArm1.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(96, 105).mirror().addBox(-1.0F, -0.0905F, -1.3205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.119F)).mirror(false)
				.texOffs(55, 84).mirror().addBox(-1.0F, -0.0905F, -0.7205F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 2.8786F, 0.3312F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightArm1.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-1.0F, 0.1859F, 0.2737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 0.3786F, 0.3312F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightArm1.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(92, 42).mirror().addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 0.0916F, 0.5522F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightArm1.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(50, 83).mirror().addBox(-1.0F, 0.0589F, 0.307F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 1.7786F, -1.2688F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightArm1.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(48, 97).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 1.2467F, -0.3734F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5618F, 11.4144F, -5.6998F, 0.8519F, 0.1734F, -2.8761F));

		PartDefinition cube_r243 = rightArm2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(56, 74).mirror().addBox(-0.5177F, -0.3448F, -0.1201F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 10.3683F, 0.4464F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightArm2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(91, 85).mirror().addBox(-0.5177F, -0.4029F, -0.3197F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 6.5683F, 1.0464F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightArm2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(104, 51).mirror().addBox(-0.5177F, -0.7538F, -0.2297F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 4.3683F, 1.0464F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightArm2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(18, 80).mirror().addBox(-1.0177F, -2.7409F, 0.2766F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 2.8683F, 0.8464F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightArm2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(65, 25).mirror().addBox(-0.5F, -0.1335F, -0.9143F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.05F, 7.8583F, 1.959F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightArm2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(98, 69).mirror().addBox(-0.5F, -0.2368F, -0.7616F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.05F, 4.3583F, 1.959F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightArm2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(40, 98).mirror().addBox(-0.5F, -2.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 2.5583F, 1.559F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightArm2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(40, 104).mirror().addBox(-0.5177F, -3.1157F, -0.1113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 4.3683F, 1.0464F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightArm2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -0.2844F, -0.2397F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0781F, 6.116F, -2.0291F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightArm2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(105, 88).mirror().addBox(-0.5F, -0.3F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.0781F, 17.4718F, -1.1009F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightArm2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(85, 53).mirror().addBox(-0.4678F, -2.5041F, -0.9946F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.95F, -0.7F, -0.1777F, -0.007F, 0.0146F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4274F, 18.3645F, 0.4442F, 2.8259F, 0.2906F, -0.1798F));

		PartDefinition cube_r254 = rightHand.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(27, 54).mirror().addBox(0.0F, -0.3F, -1.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 0.6679F, -1.435F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightHand.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(15, 24).mirror().addBox(0.0F, -1.837F, -0.7461F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 13.356F, -5.0127F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightHand.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(17, 108).mirror().addBox(-0.1343F, 0.4572F, -0.9717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 0.8179F, -1.035F, 0.1656F, -0.0587F, -0.0425F));

		PartDefinition cube_r257 = rightHand.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(7, 89).mirror().addBox(-0.1532F, 1.8718F, -1.4994F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 0.8179F, -1.035F, -0.0438F, -0.0513F, -0.0512F));

		PartDefinition cube_r258 = rightHand.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(105, 63).mirror().addBox(0.3059F, 4.0931F, 0.3378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 0.8179F, -1.035F, -0.2395F, -0.0287F, 0.0422F));

		PartDefinition cube_r259 = rightHand.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-0.5F, -1.0F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4198F, 8.2456F, -2.0092F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r260 = rightHand.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(5, 50).mirror().addBox(-0.5F, -1.0327F, 1.2083F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 13.356F, -5.0127F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightHand.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(67, 63).mirror().addBox(0.0F, -0.65F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r262 = rightHand.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(31, 72).mirror().addBox(0.0F, -0.6117F, -0.3769F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 68).mirror().addBox(0.0F, -0.6117F, -0.9769F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 0.8179F, -1.035F, -0.2793F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0142F, -0.3474F, -2.9035F));

		PartDefinition cube_r263 = bone2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(77, 111).addBox(-0.1816F, 3.0523F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.0484F, 0.7126F, -2.8029F));

		PartDefinition cube_r264 = bone2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(111, 56).addBox(1.9174F, 0.8718F, -0.4461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.4629F, 0.5322F, -1.8729F));

		PartDefinition cube_r265 = bone2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(65, 111).addBox(0.5703F, 0.1345F, -0.4461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.3882F, 0.5863F, -2.0136F));

		PartDefinition cube_r266 = bone2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(45, 108).addBox(-0.1448F, 1.2486F, -0.4461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, -0.0765F, 0.6868F, -2.7703F));

		PartDefinition cube_r267 = bone2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(7, 106).addBox(0.1861F, -1.8131F, 0.0907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6231F, 14.228F, 3.1145F, 0.9483F, 0.0386F, -0.518F));

		PartDefinition cube_r268 = bone2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(55, 109).addBox(-2.7629F, 2.3961F, -0.7745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.9582F, -0.093F, -0.9127F));

		PartDefinition cube_r269 = bone2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(27, 108).addBox(-1.6462F, 1.328F, -0.7745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(108, 33).addBox(-2.2211F, 1.328F, -0.7745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.8971F, -0.4089F, -0.6705F));

		PartDefinition cube_r270 = bone2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(105, 4).addBox(-0.438F, -2.5376F, -0.4876F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4033F, 12.3102F, 1.9456F, 0.5606F, -0.4948F, -0.2897F));

		PartDefinition cube_r271 = bone2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(55, 104).addBox(-1.6383F, -0.9997F, -0.7795F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.5827F, -0.3805F, -0.368F));

		PartDefinition cube_r272 = bone2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(86, 105).addBox(-0.9128F, -0.7184F, -0.5385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.6629F, -0.6422F, -0.4606F));

		PartDefinition cube_r273 = bone2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(102, 104).addBox(-0.2111F, -2.598F, -0.8558F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7052F, 9.6384F, 1.0227F, 0.412F, -0.5036F, -0.2864F));

		PartDefinition cube_r274 = bone2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(105, 73).addBox(-1.1104F, -3.4907F, -0.7541F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.4885F, -0.4039F, -0.3624F));

		PartDefinition cube_r275 = bone2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(22, 108).addBox(0.517F, -3.9503F, -0.6324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.7105F, -0.4343F, -0.7881F));

		PartDefinition cube_r276 = bone2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(12, 107).addBox(-1.0089F, -2.3011F, -0.6324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2431F, 9.9751F, 2.08F, 0.3007F, -0.767F, -0.0924F));

		PartDefinition cube_r277 = bone2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(69, 102).addBox(-0.7726F, -3.7704F, -0.4992F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9712F, 7.5152F, 0.241F, -0.2763F, -1.2312F, 0.3422F));

		PartDefinition cube_r278 = bone2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(91, 92).addBox(0.3681F, -1.7505F, 0.6245F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.0142F, 6.782F, -1.1587F, 0.161F, 0.4454F, 0.285F));

		PartDefinition cube_r279 = bone2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(60, 50).addBox(-0.8727F, -0.2799F, -4.0142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1858F, 2.232F, -0.0587F, 1.3767F, 0.2097F, 0.3278F));

		PartDefinition cube_r280 = bone2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(16, 60).addBox(-0.8727F, -0.3139F, -4.0354F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1858F, 2.232F, -0.0587F, 1.4814F, 0.2097F, 0.3278F));

		PartDefinition cube_r281 = bone2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(65, 37).addBox(2.5955F, -0.5715F, -5.7763F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.1124F, -0.5018F, -0.5458F, 1.1986F, 0.5648F, 0.6784F));

		PartDefinition cube_r282 = bone2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(45, 57).addBox(0.5413F, -0.5715F, -3.7735F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1124F, -0.5018F, -0.5458F, 0.9361F, 0.2142F, 0.0189F));

		PartDefinition cube_r283 = bone2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(77, 25).addBox(-0.7848F, -0.0985F, -2.8181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1858F, -0.168F, -0.5587F, 1.7031F, 0.2153F, 0.1146F));

		PartDefinition cube_r284 = bone2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(26, 43).addBox(0.7279F, -1.8172F, 5.7052F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.2992F, -0.2534F, -0.3014F));

		PartDefinition cube_r285 = bone2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 24).addBox(-0.3248F, -0.4275F, 0.2082F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.0595F, -0.0738F, -0.3229F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.0142F, -0.3474F, -2.9035F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(77, 111).mirror().addBox(-0.8184F, 3.0523F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.0484F, -0.7126F, 2.8029F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(111, 56).mirror().addBox(-2.9174F, 0.8718F, -0.4461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.4629F, -0.5322F, 1.8729F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(65, 111).mirror().addBox(-1.5703F, 0.1345F, -0.4461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.3882F, -0.5863F, 2.0136F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(45, 108).mirror().addBox(-0.8552F, 1.2486F, -0.4461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, -0.0765F, -0.6868F, 2.7703F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(7, 106).mirror().addBox(-1.1861F, -1.8131F, 0.0907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.6231F, 14.228F, 3.1145F, 0.9483F, -0.0386F, 0.518F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(55, 109).mirror().addBox(1.7629F, 2.3961F, -0.7745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.9582F, 0.093F, 0.9127F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(27, 108).mirror().addBox(0.6462F, 1.328F, -0.7745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(108, 33).mirror().addBox(1.2211F, 1.328F, -0.7745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.8971F, 0.4089F, 0.6705F));

		PartDefinition cube_r293 = bone3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(105, 4).mirror().addBox(-0.562F, -2.5376F, -0.4876F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4033F, 12.3102F, 1.9456F, 0.5606F, 0.4948F, 0.2897F));

		PartDefinition cube_r294 = bone3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(55, 104).mirror().addBox(0.6383F, -0.9997F, -0.7795F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.5827F, 0.3805F, 0.368F));

		PartDefinition cube_r295 = bone3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(86, 105).mirror().addBox(-0.0872F, -0.7184F, -0.5385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.6629F, 0.6422F, 0.4606F));

		PartDefinition cube_r296 = bone3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(102, 104).mirror().addBox(-0.7889F, -2.598F, -0.8558F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.7052F, 9.6384F, 1.0227F, 0.412F, 0.5036F, 0.2864F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(105, 73).mirror().addBox(0.1104F, -3.4907F, -0.7541F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.4885F, 0.4039F, 0.3624F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(22, 108).mirror().addBox(-1.517F, -3.9503F, -0.6324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.7105F, 0.4343F, 0.7881F));

		PartDefinition cube_r299 = bone3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(12, 107).mirror().addBox(0.0089F, -2.3011F, -0.6324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2431F, 9.9751F, 2.08F, 0.3007F, 0.767F, 0.0924F));

		PartDefinition cube_r300 = bone3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(69, 102).mirror().addBox(-0.2274F, -3.7704F, -0.4992F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9712F, 7.5152F, 0.241F, -0.2763F, 1.2312F, -0.3422F));

		PartDefinition cube_r301 = bone3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(91, 92).mirror().addBox(-1.3681F, -1.7505F, 0.6245F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(3.0142F, 6.782F, -1.1587F, 0.161F, -0.4454F, -0.285F));

		PartDefinition cube_r302 = bone3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(60, 50).mirror().addBox(-0.1273F, -0.2799F, -4.0142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1858F, 2.232F, -0.0587F, 1.3767F, -0.2097F, -0.3278F));

		PartDefinition cube_r303 = bone3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(16, 60).mirror().addBox(-0.1273F, -0.3139F, -4.0354F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1858F, 2.232F, -0.0587F, 1.4814F, -0.2097F, -0.3278F));

		PartDefinition cube_r304 = bone3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(65, 37).mirror().addBox(-3.5955F, -0.5715F, -5.7763F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.1124F, -0.5018F, -0.5458F, 1.1986F, -0.5648F, -0.6784F));

		PartDefinition cube_r305 = bone3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(45, 57).mirror().addBox(-1.5413F, -0.5715F, -3.7735F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.1124F, -0.5018F, -0.5458F, 0.9361F, -0.2142F, -0.0189F));

		PartDefinition cube_r306 = bone3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(77, 25).mirror().addBox(-0.2152F, -0.0985F, -2.8181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1858F, -0.168F, -0.5587F, 1.7031F, -0.2153F, -0.1146F));

		PartDefinition cube_r307 = bone3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(26, 43).mirror().addBox(-1.7279F, -1.8172F, 5.7052F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.2992F, 0.2534F, 0.3014F));

		PartDefinition cube_r308 = bone3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-0.6752F, -0.4275F, 0.2082F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.0595F, 0.0738F, 0.3229F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.386F, -4.7881F, -0.0366F, 0.1761F, 0.0366F));

		PartDefinition cube_r309 = neck6.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(24, 112).addBox(0.0F, -2.3943F, -5.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 112).addBox(0.0F, -2.3943F, -3.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 35).addBox(-0.5F, -1.9943F, -5.1586F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1032F, -0.0049F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r310 = neck6.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(61, 74).addBox(0.0F, -0.9924F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6484F, -0.2392F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r311 = neck6.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(111, 111).mirror().addBox(-0.8982F, -1.8503F, -7.0308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 7).mirror().addBox(-1.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1882F, 2.8174F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r312 = neck6.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(63, 48).mirror().addBox(-1.7161F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3289F, 2.2473F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r313 = neck6.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(63, 48).addBox(-0.284F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3289F, 2.2473F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition cube_r314 = neck6.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(111, 111).addBox(-0.1018F, -1.8503F, -7.0308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 7).addBox(0.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1882F, 2.8174F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8727F, -3.8428F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r315 = neck5.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(37, 112).addBox(0.0F, -1.5F, -3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 16).addBox(0.0F, -2.7F, -5.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(-0.5F, -1.1F, -5.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -4.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r316 = neck4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -2.0981F, -0.0287F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.6839F, -2.2921F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r317 = neck3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(21, 112).addBox(0.0F, 1.9374F, -0.1567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r318 = neck3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(18, 112).addBox(0.0F, -0.0626F, -0.4567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 68).addBox(-1.0F, 0.0773F, -1.9318F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.5F, -1.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r320 = neck2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(107, 16).addBox(0.0F, 1.0061F, -1.5437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -1.5F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r321 = neck2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(61, 82).addBox(-1.0F, -0.0728F, -1.8396F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.2F, -2.3F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3269F, -2.2657F, 0.2472F, 0.1297F, 0.2098F));

		PartDefinition cube_r322 = neck.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(70, 77).addBox(0.0F, -0.9039F, -0.0513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.7F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r323 = neck.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(13, 35).addBox(-1.0F, -0.1384F, -1.2862F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0545F, -4.3986F, 0.9461F, 0.2097F, 0.2811F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(49, 25).addBox(-3.0F, -0.9989F, -1.9883F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6924F, -1.5185F, 1.357F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(40, 15).addBox(-3.0F, -1.0119F, -1.6437F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, -3.9174F, -1.7935F, 1.8021F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(64, 10).addBox(-3.0F, -1.9268F, -0.7187F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -5.2674F, 0.0565F, 1.261F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(16, 50).addBox(-3.0F, -2.8426F, -1.3683F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.2674F, 0.0565F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(40, 0).addBox(-3.0F, -1.983F, -1.913F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.8193F, 1.4614F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(49, 30).addBox(-3.0F, -0.9815F, -2.0578F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -5.2674F, 0.0565F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(32, 30).addBox(-3.0F, -2.0625F, -2.8382F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -1.8193F, 1.8614F, 0.24F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(15, 30).addBox(-3.0F, -1.0753F, -2.9788F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.8193F, 1.8614F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(16, 85).addBox(-0.5F, -0.05F, -1.725F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.4458F, -3.5023F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(95, 25).addBox(-1.0F, -0.9735F, -1.9444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.051F, -4.2802F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(27, 61).addBox(-1.0F, -2.0735F, -0.0127F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.5F, -2.3678F, -2.7619F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(42, 69).addBox(-1.0F, -1.3F, -0.325F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(-0.5F, -1.6678F, -2.7619F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(53, 7).addBox(-1.0F, -1.0F, -0.0181F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -3.9895F, -4.0435F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(10, 111).addBox(-1.0F, -0.981F, 0.0113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -4.4895F, -4.9435F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(52, 44).addBox(-1.0F, -0.487F, -0.0658F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -4.8895F, -4.6435F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(52, 34).addBox(-2.0F, -0.019F, -3.9995F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -6.2281F, -2.6712F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(63, 44).addBox(-3.0F, -0.0072F, -1.0036F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -6.2281F, -2.6712F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(62, 21).addBox(-2.0F, -0.118F, -2.0155F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.7777F, 1.7838F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(45, 74).addBox(-1.5F, -1.018F, -0.9745F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.0526F, -2.4107F, -0.1702F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(85, 61).addBox(-2.0F, -0.621F, -0.8084F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 0.6473F, -1.1412F, -2.2209F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(82, 92).addBox(-2.0F, -0.5672F, -0.7166F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.2473F, -0.1662F, -1.1737F, 0.0F, 0.0F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(62, 17).addBox(-2.0F, -0.0169F, -2.3647F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -0.3027F, 0.6088F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(62, 13).addBox(-2.0F, -0.0169F, -2.0147F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.3027F, 0.6088F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(55, 0).addBox(-2.0F, -0.0269F, -2.0233F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.0027F, 1.3088F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(7, 84).addBox(-0.5F, -0.0932F, -2.9746F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6492F, -21.4983F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(75, 3).addBox(-0.5F, -0.0477F, -2.9743F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -6.4492F, -19.0983F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(94, 34).addBox(-0.5F, 0.0183F, -2.0348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2492F, -17.1984F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(14, 94).addBox(-0.5F, -0.0248F, -1.999F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -7.7492F, -15.2984F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(93, 20).addBox(-0.5F, -0.035F, -2.0089F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.9492F, -13.2984F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(93, 15).addBox(-0.5F, -0.0563F, -2.0602F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -7.8742F, -11.2483F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(93, 10).addBox(-0.5F, -0.0694F, -2.0018F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.4742F, -9.3483F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(93, 5).addBox(-0.5F, -0.0421F, -2.0264F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -6.7742F, -7.4484F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(79, 107).addBox(-0.5F, -0.066F, -1.0262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.1742F, -6.6483F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(33, 107).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -5.4742F, -6.9234F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(84, 5).addBox(-0.5F, -0.2274F, -0.3307F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.224F, -26.1335F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, -0.0597F, -2.849F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, 0.124F, -24.7335F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(88, 101).addBox(-0.5F, -0.1325F, -0.179F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.099F, -24.7835F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(95, 101).addBox(-0.5F, -0.0284F, 0.0233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.351F, -23.9835F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(64, 4).addBox(-0.5F, -1.2265F, -0.0438F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.1075F, -7.2248F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(100, 18).addBox(-0.5F, -1.0341F, -1.9948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0125F)), PartPose.offsetAndRotation(0.0F, -1.3075F, -7.2248F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -9.7781F, -2.2971F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(111, 28).addBox(-0.6598F, -0.4807F, -0.5539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(32, 111).addBox(-0.6598F, -0.4807F, -1.0539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.1828F, 9.3402F, -0.8632F, -0.3185F, 0.1222F, 0.0F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(84, 110).addBox(-0.6598F, -0.2426F, -0.5389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F))
				.texOffs(110, 75).addBox(-0.6598F, -0.2426F, -1.0389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1828F, 9.3402F, -0.8632F, -0.6152F, 0.1222F, 0.0F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(16, 54).addBox(-0.6598F, -0.4808F, -4.2042F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.1828F, 9.3402F, -0.8632F, -0.2923F, 0.1222F, 0.0F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(82, 66).addBox(-1.1104F, -0.6135F, -2.633F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1828F, 8.3402F, -4.5632F, -0.4735F, 0.0206F, -0.0622F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(109, 25).addBox(-1.0519F, -1.705F, -0.1463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3223F, 6.9914F, -4.893F, 1.0903F, 0.4208F, 0.6841F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(75, 86).addBox(-2.1092F, -0.3252F, 0.9235F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5422F, 3.5877F, -2.5373F, -0.6531F, -0.0626F, 0.0027F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(79, 104).addBox(-2.1092F, 0.018F, -0.0167F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5422F, 3.5877F, -2.5373F, -0.304F, -0.0626F, 0.0027F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(104, 56).addBox(-1.4702F, -0.0509F, 0.0242F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1578F, 3.6877F, -3.5373F, 0.0453F, 0.0596F, 0.0027F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(102, 26).addBox(-1.5F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1578F, 3.6877F, -4.0373F, 0.3071F, 0.0596F, 0.0027F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(86, 25).addBox(-1.1981F, -1.6662F, -1.0881F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.46F, 5.7572F, -3.9422F, 0.7871F, 0.0596F, 0.0027F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(83, 30).addBox(-0.5F, -0.9F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.2F, 5.7761F, -0.1899F, 0.8683F, 0.0F, 0.0F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(82, 71).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 5.7761F, -0.1899F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(74, 100).addBox(1.5F, -0.9495F, -0.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.2F, 9.4627F, 0.1385F, 0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(110, 72).addBox(1.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 9.4627F, -0.4115F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(55, 100).addBox(-0.9247F, -1.1474F, -0.2485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5F, 9.2771F, -20.4363F, 0.5454F, 0.1222F, -0.0524F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(84, 10).addBox(-0.9247F, -1.1474F, -0.2485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 9.2771F, -20.4363F, 0.9381F, 0.1222F, -0.0524F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(101, 59).addBox(-0.8F, -1.0439F, 0.0559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9F, 10.6771F, -21.9363F, 0.7362F, 0.2267F, -0.0533F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(75, 13).addBox(-0.9627F, -0.0265F, 0.078F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6266F, 4.7372F, -18.5103F, 0.5738F, 0.0871F, -0.2081F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(84, 15).addBox(-0.7612F, -0.0703F, -0.6422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8266F, 6.5372F, -19.9103F, 0.8616F, 0.1621F, -0.1308F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(48, 92).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.8266F, 6.9372F, -18.6103F, 0.4689F, 0.1621F, -0.1308F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(67, 92).addBox(-0.5F, -1.0266F, -1.7234F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6319F, 5.9258F, -16.1887F, 0.3491F, 0.1222F, -0.1396F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(73, 70).addBox(-0.5F, -1.0649F, -0.2791F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6319F, 5.9258F, -16.1887F, 0.2225F, 0.1222F, -0.1396F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(21, 74).addBox(-0.575F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2339F, 5.26F, -13.0746F, 0.1241F, 0.1335F, -0.1396F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(21, 102).addBox(-0.5F, -0.275F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5187F, 4.3605F, -13.6791F, 0.2987F, 0.1335F, -0.1396F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 108).addBox(0.1711F, -5.7478F, 1.7843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 6.2039F, -9.8512F, -0.7649F, -0.1036F, -0.6865F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(107, 104).addBox(0.422F, -5.2884F, 1.7426F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 6.2039F, -9.8512F, -0.5666F, -0.2707F, -0.4712F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(94, 60).addBox(0.108F, -4.7716F, 0.9863F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 6.2039F, -9.8512F, -0.3402F, -0.1487F, -0.5319F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(7, 95).addBox(0.1681F, -4.5389F, -0.2751F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 6.2039F, -9.8512F, -0.1948F, -0.0714F, -0.5986F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(55, 95).addBox(-0.9884F, -0.0025F, -0.0657F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.625F, 1.8039F, -10.9512F, -0.0379F, -0.0404F, -0.5054F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(74, 95).addBox(-1.0832F, 0.0183F, 0.0325F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.625F, 2.0039F, -13.0512F, 0.1044F, 0.0855F, -0.4703F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(81, 95).addBox(-0.9653F, -0.0976F, -0.1033F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7F, 2.6289F, -14.8012F, 0.2373F, 0.1572F, -0.3557F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(0, 96).addBox(-0.95F, 0.0183F, -2.0348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 2.5289F, -14.9012F, 0.3568F, 0.1338F, -0.2298F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(36, 74).addBox(-0.9664F, -2.1321F, -4.0643F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1531F, 6.6908F, -8.7216F, -0.096F, 0.1222F, -0.1047F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(56, 63).addBox(-0.5F, -0.375F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1826F, 4.0176F, -10.9573F, 0.0349F, 0.1222F, -0.1047F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(67, 56).addBox(-1.1114F, -2.7501F, 1.6874F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 6.2039F, -9.8512F, -0.2752F, -0.0168F, -0.1041F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(68, 86).addBox(-1.1114F, -2.7307F, -0.2634F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 6.2039F, -9.8512F, -0.2578F, -0.0168F, -0.1041F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(12, 103).addBox(0.0039F, -0.9448F, -1.0583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.0496F, 9.0157F, -0.7487F, -0.6397F, 0.5195F, -0.2556F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(102, 100).addBox(0.0039F, -0.6448F, -1.2583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0496F, 9.0157F, -0.7487F, -0.9451F, 0.5195F, -0.2556F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(21, 67).addBox(-0.6325F, -1.9F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
				.texOffs(13, 66).addBox(-0.1175F, -1.9F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1383F, 7.1007F, -1.6816F, -0.0876F, 0.2644F, 0.026F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -9.7781F, -2.2971F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(111, 28).mirror().addBox(-0.3402F, -0.4807F, -0.5539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(32, 111).mirror().addBox(-0.3402F, -0.4807F, -1.0539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.1828F, 9.3402F, -0.8632F, -0.3185F, -0.1222F, 0.0F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(84, 110).mirror().addBox(-0.3402F, -0.2426F, -0.5389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false)
				.texOffs(110, 75).mirror().addBox(-0.3402F, -0.2426F, -1.0389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1828F, 9.3402F, -0.8632F, -0.6152F, -0.1222F, 0.0F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(16, 54).mirror().addBox(-0.3402F, -0.4808F, -4.2042F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.1828F, 9.3402F, -0.8632F, -0.2923F, -0.1222F, 0.0F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(82, 66).mirror().addBox(0.1104F, -0.6135F, -2.633F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1828F, 8.3402F, -4.5632F, -0.4735F, -0.0206F, 0.0622F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(109, 25).mirror().addBox(0.0519F, -1.705F, -0.1463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3223F, 6.9914F, -4.893F, 1.0903F, -0.4208F, -0.6841F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(75, 86).mirror().addBox(0.1092F, -0.3252F, 0.9235F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5422F, 3.5877F, -2.5373F, -0.6531F, 0.0626F, -0.0027F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(79, 104).mirror().addBox(0.1092F, 0.018F, -0.0167F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5422F, 3.5877F, -2.5373F, -0.304F, 0.0626F, -0.0027F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(104, 56).mirror().addBox(-0.5298F, -0.0509F, 0.0242F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1578F, 3.6877F, -3.5373F, 0.0453F, -0.0596F, -0.0027F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(102, 26).mirror().addBox(-0.5F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1578F, 3.6877F, -4.0373F, 0.3071F, -0.0596F, -0.0027F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(86, 25).mirror().addBox(-0.8019F, -1.6662F, -1.0881F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.46F, 5.7572F, -3.9422F, 0.7871F, -0.0596F, -0.0027F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(83, 30).mirror().addBox(-0.5F, -0.9F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.2F, 5.7761F, -0.1899F, 0.8683F, 0.0F, 0.0F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(82, 71).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.2F, 5.7761F, -0.1899F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(74, 100).mirror().addBox(-2.5F, -0.9495F, -0.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.4627F, 0.1385F, 0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(110, 72).mirror().addBox(-2.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.4627F, -0.4115F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(55, 100).mirror().addBox(-0.0753F, -1.1474F, -0.2485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5F, 9.2771F, -20.4363F, 0.5454F, -0.1222F, 0.0524F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(-0.0753F, -1.1474F, -0.2485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 9.2771F, -20.4363F, 0.9381F, -0.1222F, 0.0524F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(101, 59).mirror().addBox(-0.2F, -1.0439F, 0.0559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9F, 10.6771F, -21.9363F, 0.7362F, -0.2267F, 0.0533F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(75, 13).mirror().addBox(-0.0373F, -0.0265F, 0.078F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.6266F, 4.7372F, -18.5103F, 0.5738F, -0.0871F, 0.2081F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(-0.2388F, -0.0703F, -0.6422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8266F, 6.5372F, -19.9103F, 0.8616F, -0.1621F, 0.1308F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(48, 92).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.8266F, 6.9372F, -18.6103F, 0.4689F, -0.1621F, 0.1308F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(67, 92).mirror().addBox(-0.5F, -1.0266F, -1.7234F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6319F, 5.9258F, -16.1887F, 0.3491F, -0.1222F, 0.1396F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-0.5F, -1.0649F, -0.2791F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.6319F, 5.9258F, -16.1887F, 0.2225F, -0.1222F, 0.1396F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(21, 74).mirror().addBox(-0.425F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2339F, 5.26F, -13.0746F, 0.1241F, -0.1335F, 0.1396F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(21, 102).mirror().addBox(-0.5F, -0.275F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.5187F, 4.3605F, -13.6791F, 0.2987F, -0.1335F, 0.1396F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-1.1711F, -5.7478F, 1.7843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 6.2039F, -9.8512F, -0.7649F, 0.1036F, 0.6865F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(107, 104).mirror().addBox(-1.422F, -5.2884F, 1.7426F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 6.2039F, -9.8512F, -0.5666F, 0.2707F, 0.4712F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-1.108F, -4.7716F, 0.9863F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, 6.2039F, -9.8512F, -0.3402F, 0.1487F, 0.5319F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(7, 95).mirror().addBox(-1.1681F, -4.5389F, -0.2751F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 6.2039F, -9.8512F, -0.1948F, 0.0714F, 0.5986F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(55, 95).mirror().addBox(-0.0116F, -0.0025F, -0.0657F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.625F, 1.8039F, -10.9512F, -0.0379F, 0.0404F, 0.5054F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(74, 95).mirror().addBox(0.0832F, 0.0183F, 0.0325F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.625F, 2.0039F, -13.0512F, 0.1044F, -0.0855F, 0.4703F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(81, 95).mirror().addBox(-0.0347F, -0.0976F, -0.1033F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.7F, 2.6289F, -14.8012F, 0.2373F, -0.1572F, 0.3557F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.05F, 0.0183F, -2.0348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 2.5289F, -14.9012F, 0.3568F, -0.1338F, 0.2298F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(36, 74).mirror().addBox(-0.0336F, -2.1321F, -4.0643F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1531F, 6.6908F, -8.7216F, -0.096F, -0.1222F, 0.1047F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(56, 63).mirror().addBox(-0.5F, -0.375F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1826F, 4.0176F, -10.9573F, 0.0349F, -0.1222F, 0.1047F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(0.1114F, -2.7501F, 1.6874F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, 6.2039F, -9.8512F, -0.2752F, 0.0168F, 0.1041F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(68, 86).mirror().addBox(0.1114F, -2.7307F, -0.2634F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 6.2039F, -9.8512F, -0.2578F, 0.0168F, 0.1041F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(12, 103).mirror().addBox(-1.0039F, -0.9448F, -1.0583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.0496F, 9.0157F, -0.7487F, -0.6397F, -0.5195F, 0.2556F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(102, 100).mirror().addBox(-1.0039F, -0.6448F, -1.2583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0496F, 9.0157F, -0.7487F, -0.9451F, -0.5195F, 0.2556F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(21, 67).mirror().addBox(-1.3675F, -1.9F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(13, 66).mirror().addBox(-0.8825F, -1.9F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1383F, 7.1007F, -1.6816F, -0.0876F, -0.2644F, -0.026F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.1525F, -2.9494F, 0.0094F, 0.0F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(91, 105).mirror().addBox(-0.3913F, 1.0369F, -0.2078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4728F, -0.6792F, 1.1519F, -0.4189F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(67, 107).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4323F, 1.4396F, 1.0082F, -1.2043F, -0.4189F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(110, 4).mirror().addBox(-0.4523F, -0.9354F, -2.0077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(101, 109).mirror().addBox(-0.4523F, -0.9354F, -1.6577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.324F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 3.3286F, -20.8975F, 0.9935F, -0.058F, -0.0047F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(101, 33).mirror().addBox(-0.4284F, -0.5233F, -2.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 3.3286F, -20.8975F, 0.7579F, -0.0597F, -0.0014F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(109, 99).mirror().addBox(-0.4284F, -0.4696F, -0.8347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 3.3286F, -20.8975F, 0.6401F, -0.0597F, -0.0014F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(102, 22).mirror().addBox(-0.4152F, -0.6194F, -1.0696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 3.3286F, -20.8975F, 0.6094F, -0.066F, 0.0157F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(109, 96).mirror().addBox(-0.4206F, -0.4664F, -0.5128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.324F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 3.3286F, -20.8975F, 0.6399F, -0.0671F, 0.0202F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(96, 109).mirror().addBox(-0.4206F, -0.4767F, -0.1738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 3.3286F, -20.8975F, 0.5657F, -0.0671F, 0.0202F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(55, 92).mirror().addBox(-0.4284F, -0.8934F, -1.2973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(91, 109).mirror().addBox(-0.4284F, -0.8934F, -0.8973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 3.3286F, -20.8975F, 0.9586F, -0.0597F, -0.0014F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(109, 81).mirror().addBox(-0.4284F, -0.8744F, -0.5465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(109, 78).mirror().addBox(-0.4284F, -0.8744F, -0.1465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 3.3286F, -20.8975F, 0.8713F, -0.0597F, -0.0014F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(88, 97).mirror().addBox(-0.5F, -0.7703F, -0.9622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1789F, 2.4077F, -20.1034F, 0.7919F, -0.1081F, -0.0597F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(103, 84).mirror().addBox(-0.4994F, -0.5274F, -0.9855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.265F)).mirror(false)
				.texOffs(103, 69).mirror().addBox(-0.4994F, -0.2274F, -0.9855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.1789F, 2.4077F, -20.1034F, 0.5998F, -0.1089F, -0.0577F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(48, 102).mirror().addBox(-0.3952F, -0.3144F, -0.0484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, 1.1078F, -18.0561F, 0.382F, -0.1333F, -0.0839F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(109, 22).mirror().addBox(-0.3952F, -0.7621F, 0.3715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, 1.1078F, -18.0561F, 0.3907F, -0.1333F, -0.0839F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(0.3828F, 0.4334F, 1.6187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.3239F, -3.0003F, -0.1473F, -0.1699F, 0.1255F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-0.1095F, 1.3333F, 2.6237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.3239F, -3.0003F, 0.1472F, 0.0027F, 0.1513F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(0.7854F, -0.027F, 0.221F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.3239F, -3.0003F, -0.4067F, -0.3724F, 0.1812F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(91, 75).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.6258F, 0.3171F, -1.4981F, -0.1222F, -0.1047F, 0.0F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(81, 100).mirror().addBox(-0.5097F, -0.7879F, -0.1152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, 1.1078F, -18.0561F, -2.7064F, -0.0998F, -0.0283F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(76, 66).mirror().addBox(-0.5097F, -0.1865F, -1.0109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, 1.1078F, -18.0561F, -0.9174F, -0.0998F, -0.0283F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(109, 9).mirror().addBox(-0.3952F, -1.0867F, -0.912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, 1.1078F, -18.0561F, -0.9357F, -0.1333F, -0.0839F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(111, 37).mirror().addBox(0.1732F, -0.6852F, -1.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2415F, -0.1654F, -2.0613F, 0.0961F, -0.0475F, 0.0315F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(84, 20).mirror().addBox(0.0506F, -0.4097F, -5.9176F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5387F, -2.6482F, -12.6108F, 0.4953F, -0.1173F, 0.0317F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(76, 54).mirror().addBox(0.0506F, -0.0089F, -2.9475F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5387F, -2.6482F, -12.6108F, 0.3557F, -0.1173F, 0.0317F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-0.1917F, -0.0307F, -2.9407F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4387F, -2.6482F, -9.6108F, 0.0088F, -0.0475F, 0.0315F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(76, 36).mirror().addBox(-0.3531F, 0.0053F, -2.9956F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4387F, -2.0482F, -6.6108F, -0.2094F, -0.0475F, 0.0315F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(-0.5F, -0.6F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4387F, -0.5482F, -4.5108F, -0.3839F, -0.0475F, 0.0315F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(0.1732F, -0.273F, -3.0073F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2415F, -0.1654F, -2.0613F, -0.253F, -0.0475F, 0.0315F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(67, 97).mirror().addBox(0.1764F, 0.2405F, -1.4675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-3.2415F, -0.1654F, -2.0613F, -0.1833F, -0.0524F, 0.0F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(21, 97).mirror().addBox(0.6317F, -0.3017F, -2.0667F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2415F, -1.1654F, -10.7613F, 0.0262F, -0.0524F, 0.0F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(28, 97).mirror().addBox(0.0266F, 1.0089F, -4.4497F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5387F, -2.6482F, -12.6108F, 0.2007F, -0.1222F, 0.0F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(96, 85).mirror().addBox(0.0266F, 1.211F, -2.3507F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-2.5387F, -2.6482F, -12.6108F, 0.1134F, -0.1222F, 0.0F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(76, 60).mirror().addBox(0.5061F, -0.072F, -3.0523F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-3.2415F, -1.1654F, -8.3613F, -0.096F, -0.0524F, 0.0F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(26, 35).mirror().addBox(0.1764F, 0.2579F, -6.4141F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2415F, -0.1654F, -2.0613F, -0.2094F, -0.0524F, 0.0F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(107, 108).mirror().addBox(0.1421F, -0.6181F, -0.3266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2415F, -0.1654F, -2.0613F, -0.1309F, -0.1571F, 0.0F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(97, 80).mirror().addBox(-0.5F, -0.5824F, -0.1987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6644F, -0.0654F, -1.2221F, -0.4363F, -0.2443F, 0.0F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(91, 105).addBox(-0.6087F, 1.0369F, -0.2078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.4728F, -0.6792F, 1.1519F, 0.4189F, 0.0F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(67, 107).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4323F, 1.4396F, 1.0082F, -1.2043F, 0.4189F, 0.0F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(110, 4).addBox(-0.5477F, -0.9354F, -2.0077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(101, 109).addBox(-0.5477F, -0.9354F, -1.6577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.324F)), PartPose.offsetAndRotation(-0.8711F, 3.3286F, -20.8975F, 0.9935F, 0.058F, 0.0047F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5716F, -0.5233F, -2.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.8711F, 3.3286F, -20.8975F, 0.7579F, 0.0597F, 0.0014F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(109, 99).addBox(-0.5716F, -0.4696F, -0.8347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.8711F, 3.3286F, -20.8975F, 0.6401F, 0.0597F, 0.0014F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(102, 22).addBox(-0.5848F, -0.6194F, -1.0696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.8711F, 3.3286F, -20.8975F, 0.6094F, 0.066F, -0.0157F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(109, 96).addBox(-0.5794F, -0.4664F, -0.5128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.324F)), PartPose.offsetAndRotation(-0.8711F, 3.3286F, -20.8975F, 0.6399F, 0.0671F, -0.0202F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(96, 109).addBox(-0.5794F, -0.4767F, -0.1738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.8711F, 3.3286F, -20.8975F, 0.5657F, 0.0671F, -0.0202F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(55, 92).addBox(-0.5716F, -0.8934F, -1.2973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(91, 109).addBox(-0.5716F, -0.8934F, -0.8973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.8711F, 3.3286F, -20.8975F, 0.9586F, 0.0597F, 0.0014F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(109, 81).addBox(-0.5716F, -0.8744F, -0.5465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(109, 78).addBox(-0.5716F, -0.8744F, -0.1465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8711F, 3.3286F, -20.8975F, 0.8713F, 0.0597F, 0.0014F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(88, 97).addBox(-0.5F, -0.7703F, -0.9622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8211F, 2.4077F, -20.1034F, 0.7919F, 0.1081F, 0.0597F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(103, 84).addBox(-0.5006F, -0.5274F, -0.9855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.265F))
				.texOffs(103, 69).addBox(-0.5006F, -0.2274F, -0.9855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.8211F, 2.4077F, -20.1034F, 0.5998F, 0.1089F, 0.0577F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(48, 102).addBox(-0.6048F, -0.3144F, -0.0484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5735F, 1.1078F, -18.0561F, 0.382F, 0.1333F, 0.0839F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(109, 22).addBox(-0.6048F, -0.7621F, 0.3715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5735F, 1.1078F, -18.0561F, 0.3907F, 0.1333F, 0.0839F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(77, 9).addBox(-1.3828F, 0.4334F, 1.6187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.3239F, -3.0003F, -0.1473F, 0.1699F, -0.1255F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(45, 78).addBox(-0.8905F, 1.3333F, 2.6237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.3239F, -3.0003F, 0.1472F, -0.0027F, -0.1513F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(0, 101).addBox(-1.7854F, -0.027F, 0.221F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.3239F, -3.0003F, -0.4067F, 0.3724F, -0.1812F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(91, 75).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6258F, 0.3171F, -1.4981F, -0.1222F, 0.1047F, 0.0F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(81, 100).addBox(-0.4903F, -0.7879F, -0.1152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5735F, 1.1078F, -18.0561F, -2.7064F, 0.0998F, 0.0283F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(76, 66).addBox(-0.4903F, -0.1865F, -1.0109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5735F, 1.1078F, -18.0561F, -0.9174F, 0.0998F, 0.0283F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(109, 9).addBox(-0.6048F, -1.0867F, -0.912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5735F, 1.1078F, -18.0561F, -0.9357F, 0.1333F, 0.0839F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(111, 37).addBox(-1.1732F, -0.6852F, -1.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2415F, -0.1654F, -2.0613F, 0.0961F, 0.0475F, -0.0315F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(84, 20).addBox(-1.0506F, -0.4097F, -5.9176F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5387F, -2.6482F, -12.6108F, 0.4953F, 0.1173F, -0.0317F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(76, 54).addBox(-1.0506F, -0.0089F, -2.9475F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5387F, -2.6482F, -12.6108F, 0.3557F, 0.1173F, -0.0317F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(76, 42).addBox(-0.8083F, -0.0307F, -2.9407F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4387F, -2.6482F, -9.6108F, 0.0088F, 0.0475F, -0.0315F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(76, 36).addBox(-0.6469F, 0.0053F, -2.9956F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4387F, -2.0482F, -6.6108F, -0.2094F, 0.0475F, -0.0315F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(75, 19).addBox(-0.5F, -0.6F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4387F, -0.5482F, -4.5108F, -0.3839F, 0.0475F, -0.0315F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(82, 76).addBox(-1.1732F, -0.273F, -3.0073F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2415F, -0.1654F, -2.0613F, -0.253F, 0.0475F, -0.0315F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(67, 97).addBox(-1.1764F, 0.2405F, -1.4675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(1.2415F, -0.1654F, -2.0613F, -0.1833F, 0.0524F, 0.0F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(21, 97).addBox(-1.6317F, -0.3017F, -2.0667F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2415F, -1.1654F, -10.7613F, 0.0262F, 0.0524F, 0.0F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(28, 97).addBox(-1.0266F, 1.0089F, -4.4497F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5387F, -2.6482F, -12.6108F, 0.2007F, 0.1222F, 0.0F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(96, 85).addBox(-1.0266F, 1.211F, -2.3507F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(0.5387F, -2.6482F, -12.6108F, 0.1134F, 0.1222F, 0.0F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(76, 60).addBox(-1.5061F, -0.072F, -3.0523F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(1.2415F, -1.1654F, -8.3613F, -0.096F, 0.0524F, 0.0F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(26, 35).addBox(-1.1764F, 0.2579F, -6.4141F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2415F, -0.1654F, -2.0613F, -0.2094F, 0.0524F, 0.0F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(107, 108).addBox(-1.1421F, -0.6181F, -0.3266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2415F, -0.1654F, -2.0613F, -0.1309F, 0.1571F, 0.0F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(97, 80).addBox(-0.5F, -0.5824F, -0.1987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6644F, -0.0654F, -1.2221F, -0.4363F, 0.2443F, 0.0F));

		return LayerDefinition.create(meshdefinition, 118, 118);
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