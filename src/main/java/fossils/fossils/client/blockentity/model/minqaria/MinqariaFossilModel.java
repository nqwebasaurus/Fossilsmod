package fossils.fossils.client.blockentity.model.minqaria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MinqariaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
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
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public MinqariaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
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
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck = this.neck6.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.heads = this.neck7.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -44.6978F, 4.6869F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(85, 45).mirror().addBox(-0.2171F, 2.6005F, 0.7544F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 45).addBox(5.7829F, 2.6005F, 0.7544F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7829F, -2.1205F, 6.6377F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(62, 31).mirror().addBox(-4.0F, 2.6F, 1.8F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 31).addBox(1.0F, 2.6F, 1.8F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0114F, -2.0615F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 70).mirror().addBox(-3.916F, -0.1946F, 2.4166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.407F, -5.3935F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1F, 1.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 103).addBox(0.073F, 4.6326F, 2.0547F, 0.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(96, 103).addBox(-0.027F, 4.6326F, 2.0547F, 0.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.6316F, 5.0419F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 122).addBox(0.094F, 4.6296F, -0.1333F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 122).addBox(-0.006F, 4.6296F, -0.1333F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.5316F, -2.8581F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(86, 70).addBox(-0.084F, -0.1946F, 2.4166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.407F, -5.3935F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 47).addBox(0.0F, -0.3183F, 0.0773F, 0.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4802F, -2.7602F, 0.0087F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7829F, -0.4483F, 3.3621F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(83, 35).addBox(-0.578F, -0.8931F, 0.1411F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2761F, 5.1647F, -4.077F, -0.3736F, -0.1912F, -0.0169F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(103, 111).addBox(-0.578F, -1.3024F, 3.03F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2761F, 5.1647F, -4.077F, -0.5045F, -0.1912F, -0.0169F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(100, 84).addBox(-0.578F, -0.8274F, -0.8642F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2761F, 5.1647F, -4.077F, -0.3823F, -0.1912F, -0.0169F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(146, 59).addBox(-1.871F, 3.2755F, 3.1307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, 0.5653F, 0.2899F, -0.0768F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 137).addBox(-1.871F, 2.8793F, -2.3225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, 1.4904F, 0.2899F, -0.0768F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(146, 67).addBox(-1.871F, 4.6901F, 2.7891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(55, 146).addBox(-1.871F, 3.7348F, 2.8093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, 0.6526F, 0.2899F, -0.0768F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(132, 61).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1537F, 2.8216F, 1.6444F, -0.0857F, 0.1966F, -0.0726F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(127, 32).addBox(-0.5635F, -1.2766F, -4.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, 0.4815F, 0.1966F, -0.0726F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 109).addBox(-1.4997F, 0.546F, -0.0523F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, -0.0066F, 0.199F, -0.0656F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(118, 78).addBox(-0.75F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5751F, -0.8195F, 1.478F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(68, 90).addBox(-1.4997F, -0.3634F, -0.7461F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, -0.1985F, 0.199F, -0.0656F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(127, 75).addBox(-1.871F, 0.2917F, 3.2203F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, -0.0542F, 0.2899F, -0.0768F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 88).addBox(-0.65F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2829F, 0.1797F, 1.4953F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(93, 12).addBox(-0.3881F, -0.0094F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2169F, -1.7503F, 1.0969F, -0.237F, 0.08F, -0.0349F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(100, 91).addBox(-0.5F, -0.7F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2182F, -0.5057F, -2.561F, -0.4542F, -0.1308F, 0.0057F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(110, 65).addBox(-0.3486F, -0.0973F, -0.1173F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.186F, -2.6442F, -3.8732F, -0.1138F, -0.1308F, 0.0057F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(118, 31).addBox(-0.633F, 0.0039F, -2.9347F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5088F, -2.3294F, -6.8844F, 0.3554F, -0.1255F, 0.0374F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(124, 83).addBox(-0.5389F, -1.091F, -2.1005F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0988F, -1.5357F, -4.6239F, 0.1286F, -0.1255F, 0.0374F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(55, 82).addBox(-0.0253F, -0.8655F, -0.3423F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0988F, -0.5357F, -9.0239F, 0.0718F, -0.1255F, 0.0374F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(55, 90).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.13F, 4.8099F, -8.0287F, 0.254F, -0.1301F, -0.0149F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(132, 16).addBox(-0.5F, -2.225F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6622F, 5.5194F, -11.2455F, -1.1248F, -0.1301F, -0.0149F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(42, 140).addBox(-0.5F, -2.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 140).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6579F, 2.9099F, -11.5095F, -1.6833F, -0.1301F, -0.0149F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(127, 70).addBox(-0.5F, -0.875F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4534F, 2.5881F, -9.9829F, -2.1371F, -0.1301F, -0.0149F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(70, 124).addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1398F, 2.5978F, -6.9948F, -0.3248F, -0.1273F, 0.0307F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(11, 115).addBox(-0.5F, -1.4F, -1.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4108F, 2.8311F, -9.1679F, -0.5866F, -0.1273F, 0.0307F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(77, 27).addBox(-0.5F, -0.05F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5128F, 1.018F, -9.5291F, 0.2947F, -0.1273F, 0.0307F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(26, 102).addBox(-0.5F, 0.375F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F))
				.texOffs(107, 22).addBox(-0.5F, -0.925F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0549F, 3.7223F, -5.6467F, -0.0375F, -0.1241F, 0.0417F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(134, 115).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.6121F, 15.4776F, 12.8729F, -1.0388F, -0.0324F, 0.0187F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(127, 80).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.6294F, 16.1741F, 13.7789F, -1.7195F, -0.0324F, 0.0187F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(101, 65).addBox(-1.1885F, -1.2703F, 5.145F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1667F, 10.3398F, 9.1692F, -0.8439F, 0.0123F, -0.0345F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(100, 77).addBox(-0.843F, -0.0825F, -0.0352F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1667F, 10.8398F, 9.8942F, -0.6686F, -0.0287F, 0.0064F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(13, 99).addBox(-0.843F, -0.2082F, -0.6171F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1667F, 10.8398F, 9.8942F, -0.6512F, -0.0287F, 0.0064F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(86, 62).addBox(0.7527F, -0.3687F, -0.2797F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1667F, 8.2398F, 4.5942F, -0.5225F, -0.2886F, 0.044F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(87, 4).addBox(0.7527F, -0.6902F, -0.2492F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.1667F, 8.2398F, 4.5942F, -0.5574F, -0.2886F, 0.044F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(37, 75).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6219F, 7.5537F, 2.8459F, -1.788F, -0.1565F, -0.0511F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(61, 98).addBox(-0.226F, -1.2843F, -10.0355F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5851F, 11.7566F, 8.5446F, -0.5663F, -0.1565F, -0.0511F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(97, 70).addBox(-0.5F, -0.675F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6989F, 6.4549F, 2.9772F, -0.7583F, -0.1565F, -0.0511F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(127, 27).addBox(-0.6618F, -3.4073F, -1.4283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0001F, 6.4473F, -0.6588F, -1.1567F, -0.1321F, -0.0532F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(133, 44).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6674F, 6.065F, 2.9198F, -1.4165F, -0.2615F, -0.0405F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(70, 112).addBox(-0.5F, -0.7F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6674F, 6.065F, 2.9198F, -1.2419F, -0.2615F, -0.0405F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(20, 127).addBox(-0.7829F, 0.0081F, 0.0812F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.8441F, -2.8808F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(62, 17).addBox(-0.7829F, -1.2919F, -2.0938F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7829F, -0.4483F, 3.3621F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(83, 35).mirror().addBox(-0.422F, -0.8931F, 0.1411F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2761F, 5.1647F, -4.077F, -0.3736F, 0.1912F, 0.0169F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(103, 111).mirror().addBox(-0.422F, -1.3024F, 3.03F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2761F, 5.1647F, -4.077F, -0.5045F, 0.1912F, 0.0169F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(100, 84).mirror().addBox(-0.422F, -0.8274F, -0.8642F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2761F, 5.1647F, -4.077F, -0.3823F, 0.1912F, 0.0169F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(146, 59).mirror().addBox(0.871F, 3.2755F, 3.1307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, 0.5653F, -0.2899F, 0.0768F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(20, 137).mirror().addBox(0.871F, 2.8793F, -2.3225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, 1.4904F, -0.2899F, 0.0768F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(146, 67).mirror().addBox(0.871F, 4.6901F, 2.7891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(55, 146).mirror().addBox(0.871F, 3.7348F, 2.8093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, 0.6526F, -0.2899F, 0.0768F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(132, 61).mirror().addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1537F, 2.8216F, 1.6444F, -0.0857F, -0.1966F, 0.0726F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(127, 32).mirror().addBox(-0.4365F, -1.2766F, -4.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0091F, 6.5452F, 0.4815F, -0.1966F, 0.0726F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(40, 109).mirror().addBox(0.4997F, 0.546F, -0.0523F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, -0.0066F, -0.199F, 0.0656F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(118, 78).mirror().addBox(-0.25F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5751F, -0.8195F, 1.478F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(68, 90).mirror().addBox(0.4997F, -0.3634F, -0.7461F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, -0.1985F, -0.199F, 0.0656F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(127, 75).mirror().addBox(0.871F, 0.2917F, 3.2203F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, -0.0542F, -0.2899F, 0.0768F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.35F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2829F, 0.1797F, 1.4953F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(93, 12).mirror().addBox(-0.6119F, -0.0094F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2169F, -1.7503F, 1.0969F, -0.237F, -0.08F, 0.0349F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(100, 91).mirror().addBox(-0.5F, -0.7F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2182F, -0.5057F, -2.561F, -0.4542F, 0.1308F, -0.0057F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(110, 65).mirror().addBox(-0.6514F, -0.0973F, -0.1173F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.186F, -2.6442F, -3.8732F, -0.1138F, 0.1308F, -0.0057F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(118, 31).mirror().addBox(-0.367F, 0.0039F, -2.9347F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5088F, -2.3294F, -6.8844F, 0.3554F, 0.1255F, -0.0374F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(124, 83).mirror().addBox(-0.4611F, -1.091F, -2.1005F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -1.5357F, -4.6239F, 0.1286F, 0.1255F, -0.0374F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-0.9747F, -0.8655F, -0.3423F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -0.5357F, -9.0239F, 0.0718F, 0.1255F, -0.0374F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(55, 90).mirror().addBox(-0.5F, -1.5F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.13F, 4.8099F, -8.0287F, 0.254F, 0.1301F, 0.0149F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(132, 16).mirror().addBox(-0.5F, -2.225F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6622F, 5.5194F, -11.2455F, -1.1248F, 0.1301F, 0.0149F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(42, 140).mirror().addBox(-0.5F, -2.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(30, 140).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6579F, 2.9099F, -11.5095F, -1.6833F, 0.1301F, 0.0149F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(127, 70).mirror().addBox(-0.5F, -0.875F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4534F, 2.5881F, -9.9829F, -2.1371F, 0.1301F, 0.0149F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 124).mirror().addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1398F, 2.5978F, -6.9948F, -0.3248F, 0.1273F, -0.0307F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(11, 115).mirror().addBox(-0.5F, -1.4F, -1.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4108F, 2.8311F, -9.1679F, -0.5866F, 0.1273F, -0.0307F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(77, 27).mirror().addBox(-0.5F, -0.05F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5128F, 1.018F, -9.5291F, 0.2947F, 0.1273F, -0.0307F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(26, 102).mirror().addBox(-0.5F, 0.375F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(107, 22).mirror().addBox(-0.5F, -0.925F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0549F, 3.7223F, -5.6467F, -0.0375F, 0.1241F, -0.0417F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(134, 115).mirror().addBox(-0.5F, -1.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.6121F, 15.4776F, 12.8729F, -1.0388F, 0.0324F, -0.0187F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(127, 80).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.6294F, 16.1741F, 13.7789F, -1.7195F, 0.0324F, -0.0187F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(101, 65).mirror().addBox(0.1885F, -1.2703F, 5.145F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.1667F, 10.3398F, 9.1692F, -0.8439F, -0.0123F, 0.0345F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(100, 77).mirror().addBox(-0.157F, -0.0825F, -0.0352F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.1667F, 10.8398F, 9.8942F, -0.6686F, 0.0287F, -0.0064F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(13, 99).mirror().addBox(-0.157F, -0.2082F, -0.6171F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.1667F, 10.8398F, 9.8942F, -0.6512F, 0.0287F, -0.0064F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-1.7527F, -0.3687F, -0.2797F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1667F, 8.2398F, 4.5942F, -0.5225F, 0.2886F, -0.044F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(87, 4).mirror().addBox(-1.7527F, -0.6902F, -0.2492F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.1667F, 8.2398F, 4.5942F, -0.5574F, 0.2886F, -0.044F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(37, 75).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6219F, 7.5537F, 2.8459F, -1.788F, 0.1565F, 0.0511F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(61, 98).mirror().addBox(-0.774F, -1.2843F, -10.0355F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5851F, 11.7566F, 8.5446F, -0.5663F, 0.1565F, 0.0511F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(97, 70).mirror().addBox(-0.5F, -0.675F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6989F, 6.4549F, 2.9772F, -0.7583F, 0.1565F, 0.0511F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(127, 27).mirror().addBox(-0.3382F, -3.4073F, -1.4283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0001F, 6.4473F, -0.6588F, -1.1567F, 0.1321F, 0.0532F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(133, 44).mirror().addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6674F, 6.065F, 2.9198F, -1.4165F, 0.2615F, 0.0405F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(70, 112).mirror().addBox(-0.5F, -0.7F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6674F, 6.065F, 2.9198F, -1.2419F, 0.2615F, 0.0405F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(20, 127).mirror().addBox(-0.2171F, 0.0081F, 0.0812F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8441F, -2.8808F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-0.2171F, -1.2919F, -2.0938F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 2.679F, 3.9145F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(70, 118).addBox(-0.5F, 0.0303F, -3.024F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.7886F, 2.1073F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(74, 98).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7144F, 2.1034F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(107, 29).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.6448F, 0.6533F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(39, 94).addBox(-1.5F, -2.8619F, -3.3279F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 1.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(37, 79).addBox(-1.0F, -0.1F, -2.4F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3597F, 1.3388F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(98, 25).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1036F, -1.0393F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(116, 50).addBox(-1.0F, -2.2F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(70, 82).addBox(-1.5F, -3.2145F, -0.5366F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.2715F, 1.2866F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(101, 58).addBox(-1.5F, -1.5F, -1.65F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 15.6902F, -0.0748F, -0.3578F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.6046F, 0.4945F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(114, 111).addBox(-0.5F, -5.7F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 6.6354F, -0.5005F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(132, 56).addBox(0.55F, -2.0931F, -1.8712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.15F, 18.5674F, -1.1373F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(76, 132).addBox(-0.5F, 0.0089F, -1.0311F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 12.9531F, 0.2108F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(65, 114).addBox(-0.5F, -0.0911F, -0.4312F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 4.0354F, -0.0005F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, 0.1398F, -0.1156F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 14.8319F, -1.6984F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(13, 91).addBox(-1.0F, -1.4F, -2.4F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 2.3324F, -0.076F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(107, 91).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 5.7159F, -0.3753F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(111, 118).addBox(-1.0F, -0.871F, -2.0357F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 2.0316F, 2.4313F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(115, 7).addBox(-1.0F, -1.571F, -2.4357F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9F, 3.2021F, 2.431F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(20, 132).addBox(-1.0F, 10.3617F, 2.6861F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 3.1346F, 0.0747F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(19, 75).addBox(-1.0F, 0.7092F, -0.5761F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 3.1346F, 0.0747F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(61, 105).addBox(-1.0F, -6.1313F, -1.9881F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 8.6509F, 1.0234F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(74, 103).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 19.898F, -2.4436F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(62, 39).addBox(-3.0F, -1.4696F, -2.8933F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3064F, 1.3614F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(0, 61).addBox(-3.0F, -1.4F, -5.7F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0935F, -2.8282F, -1.0472F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 2.679F, 3.9145F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(118, 72).addBox(-0.5F, 0.0303F, -3.024F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.7886F, 2.1073F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(126, 36).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7144F, 2.1034F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(20, 109).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.6448F, 0.6533F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(81, 95).addBox(-1.5F, -2.8619F, -3.3279F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 1.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(46, 79).addBox(-1.0F, -0.1F, -2.4F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3597F, 1.3388F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(52, 98).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1036F, -1.0393F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(116, 89).addBox(-1.0F, -2.2F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(85, 80).addBox(-1.5F, -3.2145F, -0.5366F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.2715F, 1.2866F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(39, 102).addBox(-1.5F, -1.5F, -1.65F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 15.6902F, -0.0748F, -0.3578F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.6046F, 0.4945F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(115, 0).addBox(-0.5F, -5.7F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 6.6354F, -0.5005F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 132).addBox(-1.55F, -2.0931F, -1.8712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.15F, 18.5674F, -1.1373F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(81, 132).addBox(-0.5F, 0.0089F, -1.0311F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 12.9531F, 0.2108F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(114, 100).addBox(-0.5F, -0.0911F, -0.4312F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 4.0354F, -0.0005F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(105, 14).addBox(-1.0F, 0.1398F, -0.1156F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 14.8319F, -1.6984F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(26, 94).addBox(-1.0F, -1.4F, -2.4F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 2.3324F, -0.076F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(31, 109).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 5.7159F, -0.3753F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(50, 124).addBox(-1.0F, -0.871F, -2.0357F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 2.0316F, 2.4313F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(115, 36).addBox(-1.0F, -1.571F, -2.4357F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9F, 3.2021F, 2.431F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(132, 21).addBox(-1.0F, 10.3617F, 2.6861F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 3.1346F, 0.0747F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(28, 75).addBox(-1.0F, 0.7092F, -0.5761F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 3.1346F, 0.0747F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(11, 106).addBox(-1.0F, -6.1313F, -1.9881F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 8.6509F, 1.0234F, -0.2443F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(85, 103).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 19.898F, -2.4436F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(44, 72).addBox(-3.0F, -1.4696F, -2.8933F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3064F, 1.2741F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(62, 4).addBox(-3.0F, -1.4F, -5.7F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0935F, -2.8282F, -1.3963F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(48, 49).addBox(-1.0F, -0.6555F, -10.0243F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7114F, -4.2632F, 0.0004F, -0.1312F, -0.0693F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(106, 117).addBox(0.0F, -6.4791F, 0.0071F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2341F, -12.0312F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(101, 117).addBox(0.0F, -5.9437F, -0.0022F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2341F, -15.0312F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(73, 51).addBox(-1.0F, -0.1094F, -0.0631F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0555F, -15.9243F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 119).addBox(0.0F, -5.2901F, -0.9748F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -2.0243F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(84, 118).addBox(0.0F, -5.7647F, -0.0963F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -5.9243F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(45, 116).addBox(0.0F, -6.0576F, -1.0985F, 0.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -7.9243F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(90, 58).mirror().addBox(-3.916F, 0.1054F, -1.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -1.1303F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(140, 104).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -5.0303F, 0.2375F, 0.1419F, -0.9934F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(96, 60).mirror().addBox(-3.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -5.0303F, 0.156F, 0.2286F, -1.4288F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(141, 8).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -5.0303F, 0.2891F, 0.091F, -0.557F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(101, 138).mirror().addBox(-4.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -8.2303F, 0.1266F, 0.0212F, -1.4325F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(137, 65).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -8.2303F, 0.1237F, -0.0341F, -0.9996F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(76, 138).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -8.2303F, 0.1116F, -0.0205F, -0.5633F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-10.8936F, -2.4262F, -0.2666F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -11.0303F, 0.1314F, 0.0558F, -1.4323F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(57, 137).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -11.0303F, 0.1426F, -0.0048F, -0.9999F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(64, 138).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -11.0303F, 0.1411F, -0.0019F, -0.5636F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(136, 124).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5044F, -14.1303F, 0.206F, 0.0244F, -0.5612F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(136, 126).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5044F, -14.1303F, 0.1903F, 0.0465F, -0.9973F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(73, 49).mirror().addBox(-13.8936F, -2.4262F, -0.2666F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5044F, -14.1303F, 0.1533F, 0.1223F, -1.4286F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(90, 58).addBox(-0.084F, 0.1054F, -1.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -1.1303F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(140, 104).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -5.0303F, 0.2375F, -0.1419F, 0.9934F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(96, 60).addBox(2.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -5.0303F, 0.156F, -0.2286F, 1.4288F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(141, 8).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -5.0303F, 0.2891F, -0.091F, 0.557F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(101, 138).addBox(2.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -8.2303F, 0.1266F, -0.0212F, 1.4325F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(137, 65).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -8.2303F, 0.1237F, 0.0341F, 0.9996F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(76, 138).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -8.2303F, 0.1116F, 0.0205F, 0.5633F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(83, 43).addBox(2.8937F, -2.4262F, -0.2666F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -11.0303F, 0.1314F, -0.0558F, 1.4323F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(57, 137).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -11.0303F, 0.1426F, 0.0048F, 0.9999F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(64, 138).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -11.0303F, 0.1411F, 0.0019F, 0.5636F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(136, 124).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5044F, -14.1303F, 0.206F, -0.0244F, 0.5612F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(136, 126).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5044F, -14.1303F, 0.1903F, -0.0465F, 0.9973F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(73, 49).addBox(2.8937F, -2.4262F, -0.2666F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5044F, -14.1303F, 0.1533F, -0.1223F, 1.4286F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7319F, -15.9168F, -0.1538F, -0.0138F, -0.0854F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(79, 118).addBox(0.0F, -5.1855F, 0.0093F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0671F, -2.0483F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(5, 119).addBox(0.0F, -4.5022F, -1.104F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.0671F, -3.6483F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(15, 122).addBox(0.0F, -4.0781F, -1.1018F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.8576F, -6.1134F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(102, 7).addBox(-1.0F, -0.0448F, -3.9381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6612F, -4.6119F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(107, 100).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.325F, 0.2295F, -0.943F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(62, 13).mirror().addBox(-16.8937F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.1986F, 0.3443F, -1.3825F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(95, 2).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.4047F, 0.1342F, -0.5098F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(119, 125).mirror().addBox(-0.1319F, 0.0563F, -0.9982F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 21.2397F, -4.2309F, 0.2019F, -1.2433F, -0.2516F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(125, 92).mirror().addBox(-0.1319F, 0.9644F, 2.8402F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 21.2397F, -4.2309F, 0.516F, -1.2433F, -0.2516F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(124, 88).mirror().addBox(-0.1106F, -0.4371F, -0.9203F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 21.9397F, -4.2309F, 0.1772F, -1.0086F, -0.2241F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(113, 84).mirror().addBox(-0.1106F, 0.5192F, 3.0667F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 21.9397F, -4.2309F, 0.4914F, -1.0086F, -0.2241F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(125, 48).mirror().addBox(-0.6301F, 0.014F, -0.1154F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 21.3397F, -2.9309F, -0.1339F, -0.6534F, 0.2653F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(90, 51).mirror().addBox(-0.6301F, 0.8879F, 2.7417F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 21.3397F, -2.9309F, 0.1803F, -0.6534F, 0.2653F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(124, 52).mirror().addBox(-0.6504F, 0.0679F, -1.4714F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 21.4397F, -3.1309F, -0.0277F, -0.8084F, 0.0059F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(100, 45).mirror().addBox(-0.6504F, 0.8291F, 2.3866F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 21.4397F, -3.1309F, 0.2865F, -0.8084F, 0.0059F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(139, 12).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.8241F, -5.704F, 0.4739F, 0.1524F, -0.4465F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(139, 10).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.8241F, -5.704F, 0.3814F, 0.2746F, -0.8756F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-18.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.8241F, -5.704F, 0.231F, 0.4084F, -1.3172F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(137, 67).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.3683F, 0.251F, -0.896F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(48, 47).mirror().addBox(-19.8937F, -2.4262F, -0.2666F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.2295F, 0.3817F, -1.3348F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(114, 138).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.4523F, 0.1362F, -0.4667F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(95, 2).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.4047F, -0.1342F, 0.5098F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(62, 13).addBox(2.8937F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.1986F, -0.3443F, 1.3825F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(107, 100).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.325F, -0.2295F, 0.943F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, -0.0448F, 2.9619F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0671F, -7.1483F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(119, 125).addBox(-0.8681F, 0.0563F, -0.9982F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 21.2397F, -4.2309F, 0.2019F, 1.2433F, 0.2516F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(125, 92).addBox(-0.8681F, 0.9644F, 2.8402F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 21.2397F, -4.2309F, 0.516F, 1.2433F, 0.2516F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(124, 87).addBox(-0.8894F, -0.4371F, -0.9203F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 21.9397F, -4.2309F, 0.1772F, 1.0086F, 0.2241F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(113, 84).addBox(-0.8894F, 0.5192F, 3.0667F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 21.9397F, -4.2309F, 0.4914F, 1.0086F, 0.2241F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(125, 48).addBox(-0.3699F, 0.014F, -0.1154F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 21.3397F, -2.9309F, -0.1339F, 0.6534F, -0.2653F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(90, 51).addBox(-0.3699F, 0.8879F, 2.7417F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 21.3397F, -2.9309F, 0.1803F, 0.6534F, -0.2653F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(124, 51).addBox(-0.3496F, 0.0679F, -1.4714F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 21.4397F, -3.1309F, -0.0277F, 0.8084F, -0.0059F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(100, 45).addBox(-0.3496F, 0.8291F, 2.3866F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 21.4397F, -3.1309F, 0.2865F, 0.8084F, -0.0059F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(121, 65).addBox(-1.45F, -0.6364F, 3.8651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 20.6269F, -9.7489F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(139, 12).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8241F, -5.704F, 0.4739F, -0.1524F, 0.4465F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(139, 10).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8241F, -5.704F, 0.3814F, -0.2746F, 0.8756F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(62, 0).addBox(2.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8241F, -5.704F, 0.231F, -0.4084F, 1.3172F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(137, 67).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.3683F, -0.251F, 0.896F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(48, 47).addBox(2.8937F, -2.4262F, -0.2666F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.2295F, -0.3817F, 1.3348F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(114, 138).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.4523F, -0.1362F, 0.4667F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(85, 88).addBox(-1.95F, -1.0388F, -1.1405F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 20.6269F, -9.7489F, -0.288F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 4.7444F, -6.939F, -0.0956F, -0.0875F, -0.0031F));

		PartDefinition cube_r208 = chest2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(73, 60).mirror().addBox(-12.729F, -1.955F, -0.2993F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3F, -2.8F, 0.2871F, 0.422F, -1.2847F));

		PartDefinition cube_r209 = chest2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(139, 20).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3F, -2.8F, 0.4356F, 0.2651F, -0.8512F));

		PartDefinition cube_r210 = chest2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(139, 18).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3F, -2.8F, 0.5179F, 0.1223F, -0.4306F));

		PartDefinition cube_r211 = chest2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(139, 16).mirror().addBox(-1.4539F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.4946F, 0.1473F, -0.4068F));

		PartDefinition cube_r212 = chest2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(42, 138).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.403F, 0.2784F, -0.833F));

		PartDefinition cube_r213 = chest2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(62, 15).mirror().addBox(-16.7415F, -1.9518F, -0.3082F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.2498F, 0.4208F, -1.273F));

		PartDefinition cube_r214 = chest2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(139, 14).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.4651F, 0.1501F, -0.4308F));

		PartDefinition cube_r215 = chest2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(30, 138).mirror().addBox(-3.3281F, -0.5952F, -0.3189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.3742F, 0.2689F, -0.8604F));

		PartDefinition cube_r216 = chest2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(62, 2).mirror().addBox(-17.7647F, -1.946F, -0.3189F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.2269F, 0.4003F, -1.3018F));

		PartDefinition cube_r217 = chest2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(73, 60).addBox(2.729F, -1.955F, -0.2993F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -2.8F, 0.2871F, -0.422F, 1.2847F));

		PartDefinition cube_r218 = chest2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(44, 65).addBox(0.0F, -4.3784F, 1.1244F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.143F, -1.7443F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r219 = chest2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(142, 128).addBox(0.0F, -2.1777F, -0.0314F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 4.4153F, -5.3777F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r220 = chest2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(81, 90).addBox(0.0F, -2.8502F, -0.0382F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 3.0153F, -3.8777F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r221 = chest2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(98, 37).addBox(0.0F, -3.0278F, -0.0698F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.443F, -2.4443F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(48, 62).addBox(-1.0F, -0.0865F, -2.1546F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.943F, -3.7443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(139, 20).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -2.8F, 0.4356F, -0.2651F, 0.8512F));

		PartDefinition cube_r224 = chest2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(139, 18).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -2.8F, 0.5179F, -0.1223F, 0.4306F));

		PartDefinition cube_r225 = chest2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(139, 16).addBox(-0.5461F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.4946F, -0.1473F, 0.4068F));

		PartDefinition cube_r226 = chest2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(42, 138).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.403F, -0.2784F, 0.833F));

		PartDefinition cube_r227 = chest2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(62, 15).addBox(2.7415F, -1.9518F, -0.3082F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.2498F, -0.4208F, 1.273F));

		PartDefinition cube_r228 = chest2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(139, 14).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.4651F, -0.1501F, 0.4308F));

		PartDefinition cube_r229 = chest2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(30, 138).addBox(1.3281F, -0.5952F, -0.3189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.3742F, -0.2689F, 0.8604F));

		PartDefinition cube_r230 = chest2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(62, 2).addBox(2.7647F, -1.946F, -0.3189F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.2269F, -0.4003F, 1.3018F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.6509F, -4.2561F, -0.1923F, -0.1745F, 0.0031F));

		PartDefinition cube_r231 = neck4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(116, 96).addBox(0.0F, -0.9999F, -0.0816F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5772F, -4.6376F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r232 = neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(52, 94).addBox(0.0F, -1.691F, -0.0268F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9772F, -2.9376F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(139, 134).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -2.2439F, 0.9098F, 0.4685F, -0.3562F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(139, 112).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -2.2439F, 0.6652F, 0.7334F, -0.7806F));

		PartDefinition cube_r235 = neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(92, 25).mirror().addBox(-3.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -2.2439F, 0.2232F, 0.9281F, -1.3687F));

		PartDefinition cube_r236 = neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(139, 62).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, -0.4439F, 0.6794F, 0.1932F, -0.4051F));

		PartDefinition cube_r237 = neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(139, 60).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, -0.4439F, 0.5599F, 0.3942F, -0.8109F));

		PartDefinition cube_r238 = neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(115, 41).mirror().addBox(-7.729F, -1.955F, -0.2993F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, -0.4439F, 0.346F, 0.5888F, -1.256F));

		PartDefinition cube_r239 = neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(92, 25).addBox(2.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -2.2439F, 0.2232F, -0.9281F, 1.3687F));

		PartDefinition cube_r240 = neck4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(139, 112).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -2.2439F, 0.6652F, -0.7334F, 0.7806F));

		PartDefinition cube_r241 = neck4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(139, 134).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -2.2439F, 0.9098F, -0.4685F, 0.3562F));

		PartDefinition cube_r242 = neck4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(115, 41).addBox(2.729F, -1.955F, -0.2993F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, -0.4439F, 0.346F, -0.5888F, 1.256F));

		PartDefinition cube_r243 = neck4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(139, 60).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, -0.4439F, 0.5599F, -0.3942F, 0.8109F));

		PartDefinition cube_r244 = neck4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(139, 62).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, -0.4439F, 0.6794F, -0.1932F, 0.4051F));

		PartDefinition cube_r245 = neck4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(82, 72).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2511F, -3.739F, 0.3458F, -0.1862F, 0.0811F));

		PartDefinition cube_r246 = neck3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(102, 14).addBox(0.0F, -2.8487F, 4.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 95).addBox(-0.5F, -1.9487F, 2.0661F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9164F, -6.5763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6543F, -3.9538F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(139, 146).addBox(0.0F, -1.0018F, 6.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(97, 77).addBox(0.0F, -1.3018F, 8.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(105, 51).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.6263F, -7.1488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(119, 96).addBox(-0.5F, -3.75F, -0.9206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(119, 108).addBox(0.0F, -1.75F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 128).addBox(0.0F, -3.75F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1838F, -2.8662F, 0.4625F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(120, 118).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(92, 112).addBox(0.0F, -2.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 147).addBox(0.0F, -4.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2939F, 0.002F, -0.5149F, 0.0F, 0.0F));

		PartDefinition neck = neck6.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.6129F, 0.1865F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(146, 112).addBox(0.0F, -1.2F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 19).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1035F, -2.1872F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r249 = neck7.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(136, 34).addBox(0.0F, -1.325F, -0.675F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9377F, -0.8461F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r250 = neck7.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(30, 118).addBox(-0.5F, -0.675F, -1.65F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck7.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2751F, -2.2564F, -0.2167F, -0.0227F, -0.1289F));

		PartDefinition cube_r251 = heads.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(96, 132).addBox(-1.35F, -0.0633F, -0.6183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.85F, 2.9615F, -11.4534F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r252 = heads.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(144, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.7316F, -12.55F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r253 = heads.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(141, 85).addBox(-1.35F, 0.0127F, -1.4458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.85F, 2.9615F, -11.4534F, 0.7461F, 0.0F, 0.0F));

		PartDefinition cube_r254 = heads.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -0.4F, -3.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1403F, -0.9215F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r255 = heads.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(86, 132).addBox(-0.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.7F, -0.6852F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r256 = heads.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(123, 62).addBox(-1.5F, 0.95F, -0.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(55, 79).addBox(-1.5F, 0.275F, -0.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.8459F, -0.174F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r257 = heads.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 113).addBox(-1.0F, -0.7F, -1.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0984F, -1.3448F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r258 = heads.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(26, 91).addBox(-1.5F, -0.625F, -0.45F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.3758F, -0.0572F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r259 = heads.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(81, 112).addBox(-2.0F, 1.3565F, 1.0008F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -3.5735F, -2.5839F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r260 = heads.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(101, 140).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.5372F, -2.2683F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r261 = heads.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(127, 118).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.0F, -4.2469F, -1.8989F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r262 = heads.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(140, 100).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.0F, -5.0214F, -1.6986F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r263 = heads.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(140, 96).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.0F, -5.8206F, -1.7335F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r264 = heads.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(77, 140).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -6.5543F, -2.0525F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r265 = heads.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(15, 143).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -6.9958F, -2.7196F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r266 = heads.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(72, 140).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -7.0307F, -3.5189F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r267 = heads.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(67, 140).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -6.7117F, -4.2525F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r268 = heads.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(62, 140).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -6.2358F, -4.8956F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r269 = heads.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(136, 83).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -5.6555F, -5.4463F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r270 = heads.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(136, 78).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.9808F, -5.8761F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r271 = heads.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(143, 123).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 3.2984F, -12.2901F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r272 = heads.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(57, 143).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.463F, -11.9705F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r273 = heads.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(92, 17).addBox(-0.5F, -2.25F, -3.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.0846F, -8.2169F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r274 = heads.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(50, 118).addBox(-1.5F, -0.1144F, -2.8137F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.0F, -1.2609F, -7.9838F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r275 = heads.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(116, 12).addBox(-1.5F, -0.1144F, -2.9137F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -3.6224F, -6.4794F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r276 = heads.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(51, 110).addBox(-1.5F, -0.0144F, -1.9137F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.0F, -4.1189F, -6.363F, 1.1432F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -1.6735F, -2.7839F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(134, 74).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.9403F, 1.5408F, 3.1136F, -1.1246F, 0.1079F, -0.2084F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(134, 70).addBox(-0.5F, -0.7721F, 0.3058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.172F, 0.2899F, 3.4093F, -1.7791F, 0.1079F, -0.2084F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(141, 48).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1375F, 0.3293F, 3.6463F, -2.3027F, 0.1079F, -0.2084F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(145, 106).addBox(-0.5F, -0.45F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.2593F, -0.0337F, 3.239F, -1.2119F, 0.1079F, -0.2084F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(145, 100).addBox(-0.65F, 0.5678F, -1.3096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.65F, 4.6349F, -8.6696F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(130, 65).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.4745F, -0.6511F, 2.4917F, -0.4593F, 0.1502F, -0.2387F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(113, 44).addBox(-0.5F, -0.8F, -3.225F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.7466F, 1.1221F, -2.7751F, 0.5901F, 0.1046F, -0.1121F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(145, 97).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5669F, 4.5662F, -0.7327F, -0.6376F, 0.0242F, -0.0465F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(125, 129).addBox(-0.5F, -1.475F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6472F, 3.4591F, -1.9066F, -0.0267F, 0.0475F, -0.0221F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(141, 38).addBox(-0.4358F, -1.5995F, 0.6884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.7925F, 3.7036F, -3.7253F, 0.1045F, 0.0516F, -0.0091F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(64, 134).addBox(-1.0358F, -1.7586F, -2.2372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(124, 0).addBox(-1.0358F, -0.7586F, -3.0372F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1539F, 3.7596F, -2.9578F, -0.0907F, 0.1869F, -0.0256F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(134, 88).addBox(-0.975F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9828F, -1.0076F, 1.1455F, -0.5218F, 0.0459F, -0.1065F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(103, 103).addBox(-1.8119F, -1.6082F, -3.2958F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.015F, 0.5283F, 0.5808F, 0.1191F, 0.1366F, -0.1591F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(35, 141).addBox(-0.5F, -1.5F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6266F, 4.7544F, 1.2406F, 0.2519F, 0.0538F, -0.157F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(141, 34).addBox(-0.5F, -0.775F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6266F, 4.7544F, 1.2406F, 0.2083F, 0.0538F, -0.157F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(129, 123).addBox(-1.0213F, -1.1055F, -2.1253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5645F, 1.1326F, 2.63F, -0.4821F, 0.0512F, -0.2097F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(96, 136).addBox(-1.0213F, -0.0805F, -0.7003F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5885F, 1.175F, 1.9995F, -0.2436F, 0.0648F, -0.1591F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(141, 30).addBox(-0.4244F, -0.3109F, -3.0279F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1539F, 3.7596F, -2.9578F, -0.0724F, 0.1525F, 0.127F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(118, 129).addBox(0.0F, -1.05F, -0.925F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 4.3712F, -3.0429F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(91, 136).addBox(-0.482F, -0.9688F, -0.8053F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, -0.6828F, 0.1341F, -0.157F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(145, 94).addBox(-0.482F, 1.0781F, 0.1155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, -1.1976F, 0.1341F, -0.157F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(141, 26).addBox(-0.482F, -0.3361F, 0.0704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, -0.9358F, 0.1341F, -0.157F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(5, 141).addBox(-0.4953F, -1.8301F, 0.0901F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, -0.5519F, 0.1341F, -0.157F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(134, 52).addBox(-0.4971F, -0.4747F, 0.038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.3452F, 3.3783F, -6.0185F, 0.6082F, 0.1493F, -0.037F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(134, 48).addBox(-0.4971F, -0.5803F, -1.9324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.3452F, 3.3783F, -6.0185F, 0.39F, 0.1493F, -0.037F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(123, 113).addBox(-0.4953F, -0.5218F, -1.1931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.293F))
				.texOffs(111, 123).addBox(-0.4953F, -0.3218F, -1.7931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, 0.792F, 0.1341F, -0.157F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(123, 108).addBox(-0.4953F, -0.3943F, -1.207F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F))
				.texOffs(45, 134).addBox(-0.4953F, -0.7943F, -0.507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, 0.9666F, 0.1341F, -0.157F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(145, 45).addBox(-0.4953F, -1.0766F, 0.7218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, 0.7048F, 0.1341F, -0.157F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(145, 42).addBox(-0.4953F, -1.8601F, 0.1617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, -0.0806F, 0.1341F, -0.157F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(31, 145).addBox(-0.4953F, -2.0818F, -0.1626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, -0.5169F, 0.1341F, -0.157F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(3, 145).addBox(-0.482F, -0.5763F, 0.0538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, -0.7351F, 0.1341F, -0.157F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(142, 144).addBox(-0.4239F, 0.3548F, -1.1914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(134, 144).addBox(-0.4239F, -0.0452F, -1.1914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, 2.9611F, 0.1137F, -0.2066F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(129, 144).addBox(-0.4239F, 0.4754F, -1.3937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(124, 144).addBox(-0.4239F, 0.4754F, -1.2187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(119, 144).addBox(-0.4239F, 0.4754F, -0.8187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -3.1039F, 0.1137F, -0.2066F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(114, 144).addBox(-0.4239F, 0.3917F, -0.7171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -2.8421F, 0.1137F, -0.2066F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(141, 4).addBox(-0.4608F, -0.8759F, -0.8068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(141, 0).addBox(-0.4608F, -0.8759F, -1.0068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 144).addBox(-0.4608F, 0.1241F, -0.0568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(92, 144).addBox(-0.4608F, 0.1241F, -0.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -2.1504F, 0.1548F, -0.1709F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(87, 144).addBox(-0.4608F, 0.3525F, -0.2279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -1.557F, 0.1548F, -0.1709F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(82, 144).addBox(-0.4608F, 0.4102F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(72, 144).addBox(-0.4608F, 0.1102F, 0.0262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -1.3825F, 0.1548F, -0.1709F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(77, 144).addBox(-0.4608F, 0.3712F, 0.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(67, 144).addBox(-0.4608F, 0.0712F, 0.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -1.4261F, 0.1548F, -0.1709F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(124, 140).addBox(-0.4608F, -0.6973F, -0.7454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -0.6407F, 0.1548F, -0.1709F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(144, 64).addBox(-0.4608F, 0.2184F, 0.0702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -0.8589F, 0.1548F, -0.1709F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(62, 144).addBox(-0.4608F, -0.9112F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(144, 56).addBox(-0.6358F, -0.9112F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, 0.0138F, 0.1548F, -0.1709F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(86, 136).addBox(-0.4608F, -1.574F, -0.4963F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -0.5534F, 0.1548F, -0.1709F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(69, 129).addBox(-0.4608F, -0.9779F, -1.0409F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1653F, 0.833F, -0.9205F, -0.6843F, 0.1548F, -0.1709F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(50, 144).addBox(-0.482F, 0.578F, -1.5195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, 0.1812F, 0.1341F, -0.157F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(45, 144).addBox(-0.482F, 0.9165F, -1.4003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, -0.1679F, 0.1341F, -0.157F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(40, 144).addBox(-0.4953F, -1.1387F, 0.9733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.8759F, 1.3495F, 0.5792F, 0.2859F, 0.1341F, -0.157F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(119, 140).addBox(-0.5F, -1.975F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.8232F, 3.5308F, 1.041F, -0.4457F, 0.1273F, -0.1479F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(50, 129).addBox(-0.5F, -0.85F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0593F, 2.8822F, -0.0377F, 0.3397F, 0.1273F, -0.1479F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(30, 129).addBox(-0.5F, -1.2F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3818F, 1.8712F, -1.3658F, 1.4742F, 0.1273F, -0.1479F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(111, 128).addBox(-1.025F, -1.0F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.7269F, 1.6973F, -0.2404F, 0.9069F, 0.1273F, -0.1479F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(84, 6).addBox(0.1767F, 0.7643F, -1.1088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(146, 16).addBox(0.1767F, 0.3893F, -1.1088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.65F, 4.6349F, -8.6696F, -0.3758F, 0.5265F, -0.1957F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(146, 13).addBox(-0.5F, -0.255F, -1.1423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.325F, 5.7108F, -8.6304F, -0.5323F, 0.1309F, 0.0F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(13, 146).addBox(-0.5F, -0.4048F, -0.4702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.325F, 5.7108F, -8.6304F, -0.0524F, 0.1309F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(146, 10).addBox(-0.5F, -0.2134F, 0.127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.325F, 5.7108F, -8.6304F, 0.5149F, 0.1309F, 0.0F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(134, 30).addBox(-0.5F, -0.375F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.8376F, 4.8077F, -7.8921F, 1.004F, -0.0156F, -0.3362F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(123, 57).addBox(-1.0053F, -0.0913F, -2.7959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4603F, 2.0939F, -5.5958F, 0.6916F, 0.1408F, -0.0684F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(128, 102).addBox(-0.9413F, -1.0848F, -0.485F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2474F, 1.995F, -2.9104F, 1.0882F, 0.1209F, -0.0844F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(114, 140).addBox(-0.7F, 0.025F, -0.9089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.2154F, -3.3642F, 0.891F, 0.0384F, 0.0475F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(30, 124).addBox(-0.913F, -0.2215F, -2.757F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.5543F, 0.5933F, -3.9294F, 0.8599F, 0.1742F, -0.0376F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(102, 37).addBox(-0.913F, -0.1965F, -0.257F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.123F, 3.4604F, -7.7707F, 0.7552F, 0.1742F, -0.0376F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(126, 96).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.4037F, -1.2073F, -3.1273F, 0.2732F, 0.0926F, -0.0198F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(59, 126).addBox(-1.0F, 0.0F, -0.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.2364F, -1.7503F, -1.2097F, 0.2736F, -0.1091F, -0.0763F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(126, 5).addBox(-0.4566F, 0.4045F, 0.3057F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.213F, -0.0026F, -4.9823F, 0.7286F, 0.143F, -0.0056F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(30, 134).addBox(-0.594F, 0.5073F, -1.116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.65F, 4.6349F, -8.6696F, -0.3176F, 0.5822F, -0.1424F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(26, 144).addBox(-1.1842F, 0.5073F, -0.8357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.65F, 4.6349F, -8.6696F, -0.2693F, 0.1974F, -0.0177F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -1.6735F, -2.7839F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(134, 74).mirror().addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.9403F, 1.5408F, 3.1136F, -1.1246F, -0.1079F, 0.2084F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(134, 70).mirror().addBox(-0.5F, -0.7721F, 0.3058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.172F, 0.2899F, 3.4093F, -1.7791F, -0.1079F, 0.2084F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(141, 48).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.1375F, 0.3293F, 3.6463F, -2.3027F, -0.1079F, 0.2084F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(145, 106).mirror().addBox(-0.5F, -0.45F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.2593F, -0.0337F, 3.239F, -1.2119F, -0.1079F, 0.2084F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(145, 100).mirror().addBox(-0.35F, 0.5678F, -1.3096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.65F, 4.6349F, -8.6696F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(130, 65).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.4745F, -0.6511F, 2.4917F, -0.4593F, -0.1502F, 0.2387F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(113, 44).mirror().addBox(-0.5F, -0.8F, -3.225F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.7466F, 1.1221F, -2.7751F, 0.5901F, -0.1046F, 0.1121F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(145, 97).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5669F, 4.5662F, -0.7327F, -0.6376F, -0.0242F, 0.0465F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(125, 129).mirror().addBox(-0.5F, -1.475F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.6472F, 3.4591F, -1.9066F, -0.0267F, -0.0475F, 0.0221F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(141, 38).mirror().addBox(-0.5642F, -1.5995F, 0.6884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.7925F, 3.7036F, -3.7253F, 0.1045F, -0.0516F, 0.0091F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(64, 134).mirror().addBox(0.0358F, -1.7586F, -2.2372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(124, 0).mirror().addBox(0.0358F, -0.7586F, -3.0372F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1539F, 3.7596F, -2.9578F, -0.0907F, -0.1869F, 0.0256F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(134, 88).mirror().addBox(-0.025F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.9828F, -1.0076F, 1.1455F, -0.5218F, -0.0459F, 0.1065F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(103, 103).mirror().addBox(0.8119F, -1.6082F, -3.2958F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 0.5283F, 0.5808F, 0.1191F, -0.1366F, 0.1591F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(35, 141).mirror().addBox(-0.5F, -1.5F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6266F, 4.7544F, 1.2406F, 0.2519F, -0.0538F, 0.157F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(141, 34).mirror().addBox(-0.5F, -0.775F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6266F, 4.7544F, 1.2406F, 0.2083F, -0.0538F, 0.157F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(129, 123).mirror().addBox(0.0213F, -1.1055F, -2.1253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5645F, 1.1326F, 2.63F, -0.4821F, -0.0512F, 0.2097F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(96, 136).mirror().addBox(0.0213F, -0.0805F, -0.7003F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5885F, 1.175F, 1.9995F, -0.2436F, -0.0648F, 0.1591F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(141, 30).mirror().addBox(0.4244F, -0.3109F, -3.0279F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1539F, 3.7596F, -2.9578F, -0.0724F, -0.1525F, -0.127F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(118, 129).mirror().addBox(0.0F, -1.05F, -0.925F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 4.3712F, -3.0429F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(91, 136).mirror().addBox(-0.518F, -0.9688F, -0.8053F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, -0.6828F, -0.1341F, 0.157F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(145, 94).mirror().addBox(-0.518F, 1.0781F, 0.1155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, -1.1976F, -0.1341F, 0.157F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(141, 26).mirror().addBox(-0.518F, -0.3361F, 0.0704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, -0.9358F, -0.1341F, 0.157F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(5, 141).mirror().addBox(-0.5047F, -1.8301F, 0.0901F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, -0.5519F, -0.1341F, 0.157F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(134, 52).mirror().addBox(-0.5029F, -0.4747F, 0.038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.3452F, 3.3783F, -6.0185F, 0.6082F, -0.1493F, 0.037F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(134, 48).mirror().addBox(-0.5029F, -0.5803F, -1.9324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.3452F, 3.3783F, -6.0185F, 0.39F, -0.1493F, 0.037F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(123, 113).mirror().addBox(-0.5047F, -0.5218F, -1.1931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(111, 123).mirror().addBox(-0.5047F, -0.3218F, -1.7931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, 0.792F, -0.1341F, 0.157F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(123, 108).mirror().addBox(-0.5047F, -0.3943F, -1.207F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(45, 134).mirror().addBox(-0.5047F, -0.7943F, -0.507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, 0.9666F, -0.1341F, 0.157F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(145, 45).mirror().addBox(-0.5047F, -1.0766F, 0.7218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, 0.7048F, -0.1341F, 0.157F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(145, 42).mirror().addBox(-0.5047F, -1.8601F, 0.1617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, -0.0806F, -0.1341F, 0.157F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(31, 145).mirror().addBox(-0.5047F, -2.0818F, -0.1626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, -0.5169F, -0.1341F, 0.157F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(3, 145).mirror().addBox(-0.518F, -0.5763F, 0.0538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, -0.7351F, -0.1341F, 0.157F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(142, 144).mirror().addBox(-0.5761F, 0.3548F, -1.1914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(134, 144).mirror().addBox(-0.5761F, -0.0452F, -1.1914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, 2.9611F, -0.1137F, 0.2066F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(129, 144).mirror().addBox(-0.5761F, 0.4754F, -1.3937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(124, 144).mirror().addBox(-0.5761F, 0.4754F, -1.2187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(119, 144).mirror().addBox(-0.5761F, 0.4754F, -0.8187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -3.1039F, -0.1137F, 0.2066F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(114, 144).mirror().addBox(-0.5761F, 0.3917F, -0.7171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -2.8421F, -0.1137F, 0.2066F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(141, 4).mirror().addBox(-0.5392F, -0.8759F, -0.8068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(141, 0).mirror().addBox(-0.5392F, -0.8759F, -1.0068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 144).mirror().addBox(-0.5392F, 0.1241F, -0.0568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(92, 144).mirror().addBox(-0.5392F, 0.1241F, -0.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -2.1504F, -0.1548F, 0.1709F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(87, 144).mirror().addBox(-0.5392F, 0.3525F, -0.2279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -1.557F, -0.1548F, 0.1709F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(82, 144).mirror().addBox(-0.5392F, 0.4102F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(72, 144).mirror().addBox(-0.5392F, 0.1102F, 0.0262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -1.3825F, -0.1548F, 0.1709F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(77, 144).mirror().addBox(-0.5392F, 0.3712F, 0.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(67, 144).mirror().addBox(-0.5392F, 0.0712F, 0.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -1.4261F, -0.1548F, 0.1709F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(124, 140).mirror().addBox(-0.5392F, -0.6973F, -0.7454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -0.6407F, -0.1548F, 0.1709F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(144, 64).mirror().addBox(-0.5392F, 0.2184F, 0.0702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -0.8589F, -0.1548F, 0.1709F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(62, 144).mirror().addBox(-0.5392F, -0.9112F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(144, 56).mirror().addBox(-0.3642F, -0.9112F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, 0.0138F, -0.1548F, 0.1709F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(86, 136).mirror().addBox(-0.5392F, -1.574F, -0.4963F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -0.5534F, -0.1548F, 0.1709F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(69, 129).mirror().addBox(-0.5392F, -0.9779F, -1.0409F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 0.833F, -0.9205F, -0.6843F, -0.1548F, 0.1709F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(50, 144).mirror().addBox(-0.518F, 0.578F, -1.5195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, 0.1812F, -0.1341F, 0.157F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(45, 144).mirror().addBox(-0.518F, 0.9165F, -1.4003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, -0.1679F, -0.1341F, 0.157F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(40, 144).mirror().addBox(-0.5047F, -1.1387F, 0.9733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.8759F, 1.3495F, 0.5792F, 0.2859F, -0.1341F, 0.157F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(119, 140).mirror().addBox(-0.5F, -1.975F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.8232F, 3.5308F, 1.041F, -0.4457F, -0.1273F, 0.1479F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(50, 129).mirror().addBox(-0.5F, -0.85F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.0593F, 2.8822F, -0.0377F, 0.3397F, -0.1273F, 0.1479F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(30, 129).mirror().addBox(-0.5F, -1.2F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3818F, 1.8712F, -1.3658F, 1.4742F, -0.1273F, 0.1479F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(111, 128).mirror().addBox(0.025F, -1.0F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.7269F, 1.6973F, -0.2404F, 0.9069F, -0.1273F, 0.1479F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(-1.1767F, 0.7643F, -1.1088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(146, 16).mirror().addBox(-1.1767F, 0.3893F, -1.1088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.65F, 4.6349F, -8.6696F, -0.3758F, -0.5265F, 0.1957F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(146, 13).mirror().addBox(-0.5F, -0.255F, -1.1423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.325F, 5.7108F, -8.6304F, -0.5323F, -0.1309F, 0.0F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(13, 146).mirror().addBox(-0.5F, -0.4048F, -0.4702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.325F, 5.7108F, -8.6304F, -0.0524F, -0.1309F, 0.0F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(146, 10).mirror().addBox(-0.5F, -0.2134F, 0.127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.325F, 5.7108F, -8.6304F, 0.5149F, -0.1309F, 0.0F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(134, 30).mirror().addBox(-0.5F, -0.375F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.8376F, 4.8077F, -7.8921F, 1.004F, 0.0156F, 0.3362F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(123, 57).mirror().addBox(0.0053F, -0.0913F, -2.7959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4603F, 2.0939F, -5.5958F, 0.6916F, -0.1408F, 0.0684F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(128, 102).mirror().addBox(-0.0587F, -1.0848F, -0.485F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2474F, 1.995F, -2.9104F, 1.0882F, -0.1209F, 0.0844F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(114, 140).mirror().addBox(-0.3F, 0.025F, -0.9089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -0.2154F, -3.3642F, 0.891F, -0.0384F, -0.0475F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(30, 124).mirror().addBox(-0.087F, -0.2215F, -2.757F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.5543F, 0.5933F, -3.9294F, 0.8599F, -0.1742F, 0.0376F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(102, 37).mirror().addBox(-0.087F, -0.1965F, -0.257F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.123F, 3.4604F, -7.7707F, 0.7552F, -0.1742F, 0.0376F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(126, 96).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.4037F, -1.2073F, -3.1273F, 0.2732F, -0.0926F, 0.0198F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(59, 126).mirror().addBox(0.0F, 0.0F, -0.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(1.2364F, -1.7503F, -1.2097F, 0.2736F, 0.1091F, 0.0763F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(126, 5).mirror().addBox(-0.5434F, 0.4045F, 0.3057F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.213F, -0.0026F, -4.9823F, 0.7286F, -0.143F, 0.0056F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(30, 134).mirror().addBox(-0.406F, 0.5073F, -1.116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.65F, 4.6349F, -8.6696F, -0.3176F, -0.5822F, 0.1424F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(26, 144).mirror().addBox(0.1842F, 0.5073F, -0.8357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.65F, 4.6349F, -8.6696F, -0.2693F, -0.1974F, 0.0177F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6559F, -0.7246F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(6, 131).mirror().addBox(0.3F, -2.2606F, -2.0219F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.1271F, -4.2394F, -0.1309F, -0.1571F, 0.0F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(124, 43).mirror().addBox(0.0F, -0.9616F, -3.2461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.1271F, -4.2394F, -0.1833F, -0.1571F, 0.0F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(146, 31).mirror().addBox(-0.2514F, -2.0378F, -2.2158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.4887F, -0.0175F, 0.0F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(145, 129).mirror().addBox(-0.2764F, -2.153F, -0.4964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.8814F, -0.0175F, 0.0F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(145, 126).mirror().addBox(0.0736F, -2.857F, -3.4573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.5411F, -0.0175F, 0.0F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(145, 109).mirror().addBox(0.1236F, -0.7914F, -4.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(86, 141).mirror().addBox(0.1236F, -0.7914F, -3.5919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, -0.1134F, -0.0175F, 0.0F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(146, 19).mirror().addBox(0.0F, -2.3172F, -2.7463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.1271F, -4.2394F, 0.0349F, -0.1571F, 0.0F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(132, 132).mirror().addBox(0.0124F, -0.4783F, -1.1723F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3465F, -2.8522F, -1.3127F, -0.227F, -0.0165F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(129, 141).mirror().addBox(0.0124F, -0.9045F, -1.8149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3465F, -2.8522F, -0.8764F, -0.227F, -0.0165F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(141, 120).mirror().addBox(0.0124F, -0.2333F, -0.962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3465F, -2.8522F, -1.4873F, -0.227F, -0.0165F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(8, 146).mirror().addBox(0.0F, -2.7876F, -3.2473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.1271F, -4.2394F, 0.2269F, -0.1571F, 0.0F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(141, 117).mirror().addBox(-0.0764F, -1.9321F, -0.4164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.5149F, -0.0175F, 0.0F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(146, 3).mirror().addBox(0.0F, -2.2222F, -1.8892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.1271F, -4.2394F, -0.0175F, -0.1571F, 0.0F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(79, 127).mirror().addBox(0.0F, -2.1192F, -1.1234F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.1271F, -4.2394F, -0.1222F, -0.1571F, 0.0F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(132, 128).mirror().addBox(-0.9464F, -2.3674F, 0.1638F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, -0.5061F, -0.2967F, 0.0F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(141, 114).mirror().addBox(-0.9464F, -1.0406F, 3.4272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, -0.0262F, -0.2967F, 0.0F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(96, 141).mirror().addBox(-0.9464F, 0.3988F, 2.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, 0.4974F, -0.2967F, 0.0F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(141, 91).mirror().addBox(-0.9464F, 2.1427F, 3.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, 0.7592F, -0.2967F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(139, 22).mirror().addBox(0.4F, -2.6913F, -3.3907F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.1271F, -4.2394F, 0.1134F, -0.1571F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(91, 141).mirror().addBox(-0.0764F, -1.4929F, -1.0016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.1047F, -0.0175F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(119, 103).mirror().addBox(0.0F, -1.2927F, -3.7772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.1271F, -4.2394F, -0.0262F, -0.1571F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(114, 134).mirror().addBox(-0.1764F, -1.3404F, -2.0492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.144F, -0.0175F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(141, 77).mirror().addBox(-0.1014F, 0.5067F, -1.8725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, -1.2479F, -0.0175F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(146, 25).mirror().addBox(-0.1014F, 2.2674F, -1.2241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, -1.5184F, -0.0175F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(141, 88).mirror().addBox(0.0736F, -3.7103F, -3.0588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.6807F, -0.0175F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(146, 0).mirror().addBox(-0.1014F, -1.2177F, -3.9384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.0524F, -0.0175F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(146, 51).mirror().addBox(-0.2014F, -3.9444F, -0.595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 1.4312F, -0.0175F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(146, 48).mirror().addBox(-0.2014F, -0.9496F, -3.2966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.0349F, -0.0175F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(146, 37).mirror().addBox(-0.2014F, -1.5142F, -2.5126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.1271F, -7.5394F, 0.2705F, -0.0175F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(132, 111).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.789F, 1.1946F, -0.8087F, -0.0175F, -0.2967F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(132, 107).mirror().addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0433F, 0.6405F, -3.5251F, -0.0262F, -0.1745F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(132, 132).addBox(-1.0124F, -0.4783F, -1.1723F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.7F, -0.3465F, -2.8522F, -1.3127F, 0.227F, 0.0165F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(129, 141).addBox(-1.0124F, -0.9045F, -1.8149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.3465F, -2.8522F, -0.8764F, 0.227F, 0.0165F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(141, 120).addBox(-1.0124F, -0.2333F, -0.962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7F, -0.3465F, -2.8522F, -1.4873F, 0.227F, 0.0165F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(8, 146).addBox(-1.0F, -2.7876F, -3.2473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.425F, 1.1271F, -4.2394F, 0.2269F, 0.1571F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(146, 31).addBox(-0.7486F, -2.0378F, -2.2158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.4887F, 0.0175F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(145, 129).addBox(-0.7236F, -2.153F, -0.4964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.8814F, 0.0175F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(141, 117).addBox(-0.9236F, -1.9321F, -0.4164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.5149F, 0.0175F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(146, 19).addBox(-1.0F, -2.3172F, -2.7463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.425F, 1.1271F, -4.2394F, 0.0349F, 0.1571F, 0.0F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(146, 3).addBox(-1.0F, -2.2222F, -1.8892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.425F, 1.1271F, -4.2394F, -0.0175F, 0.1571F, 0.0F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(79, 127).addBox(-1.0F, -2.1192F, -1.1234F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.425F, 1.1271F, -4.2394F, -0.1222F, 0.1571F, 0.0F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(132, 128).addBox(-0.0536F, -2.3674F, 0.1638F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, -0.5061F, 0.2967F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(141, 114).addBox(-0.0536F, -1.0406F, 3.4272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, -0.0262F, 0.2967F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(96, 141).addBox(-0.0536F, 0.3988F, 2.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, 0.4974F, 0.2967F, 0.0F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(141, 91).addBox(-0.0536F, 2.1427F, 3.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, 0.7592F, 0.2967F, 0.0F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(6, 131).addBox(-0.3F, -2.2606F, -2.0219F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.425F, 1.1271F, -4.2394F, -0.1309F, 0.1571F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(139, 22).addBox(-0.4F, -2.6913F, -3.3907F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.425F, 1.1271F, -4.2394F, 0.1134F, 0.1571F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(91, 141).addBox(-0.9236F, -1.4929F, -1.0016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.1047F, 0.0175F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(119, 103).addBox(-1.0F, -1.2927F, -3.7772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.425F, 1.1271F, -4.2394F, -0.0262F, 0.1571F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(114, 134).addBox(-0.8236F, -1.3404F, -2.0492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.144F, 0.0175F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(141, 77).addBox(-0.8986F, 0.5067F, -1.8725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, -1.2479F, 0.0175F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(146, 25).addBox(-0.8986F, 2.2674F, -1.2241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, -1.5184F, 0.0175F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(145, 126).addBox(-1.0736F, -2.857F, -3.4573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.5411F, 0.0175F, 0.0F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(141, 88).addBox(-1.0736F, -3.7103F, -3.0588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.6807F, 0.0175F, 0.0F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(146, 0).addBox(-0.8986F, -1.2177F, -3.9384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.0524F, 0.0175F, 0.0F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(145, 109).addBox(-1.1236F, -0.7914F, -4.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(86, 141).addBox(-1.1236F, -0.7914F, -3.5919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, -0.1134F, 0.0175F, 0.0F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(146, 51).addBox(-0.7986F, -3.9444F, -0.595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 1.4312F, 0.0175F, 0.0F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(146, 48).addBox(-0.7986F, -0.9496F, -3.2966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.0349F, 0.0175F, 0.0F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(146, 37).addBox(-0.7986F, -1.5142F, -2.5126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.825F, 1.1271F, -7.5394F, 0.2705F, 0.0175F, 0.0F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(132, 111).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.789F, 1.1946F, -0.8087F, -0.0175F, 0.2967F, 0.0F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(124, 43).addBox(-1.0F, -0.9616F, -3.2461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.425F, 1.1271F, -4.2394F, -0.1833F, 0.1571F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(132, 107).addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0433F, 0.6405F, -3.5251F, -0.0262F, 0.1745F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 10.6338F, -3.9997F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r469 = bone2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(114, 58).addBox(0.8837F, -1.1122F, -4.8426F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.3146F, -4.0438F, 1.5077F, 0.144F, 1.1561F));

		PartDefinition cube_r470 = bone2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(125, 12).addBox(-1.2157F, -1.3122F, -1.5822F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.5146F, -4.0438F, 1.4331F, 0.0759F, 0.5009F));

		PartDefinition cube_r471 = bone2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(140, 44).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.1078F, -1.2991F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r472 = bone2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(133, 96).addBox(-0.5F, 3.3302F, -0.6213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r473 = bone2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(92, 115).addBox(-0.5F, 0.3302F, -0.2213F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r474 = bone2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(89, 122).addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.6328F, -2.6832F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r475 = bone2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(118, 25).addBox(-0.5F, -3.2651F, -0.96F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r476 = bone2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5F, -0.0317F, -0.2241F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.605F, -3.5807F, 1.0516F, 0.0F, 0.0F));

		PartDefinition cube_r477 = bone2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(83, 27).addBox(-0.5F, 1.2444F, -0.0313F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.605F, -3.5807F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r478 = bone2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(65, 72).addBox(-0.5F, -1.0F, -2.8F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.4802F, 1.6415F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r479 = bone2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(20, 106).addBox(-0.5F, -0.625F, 1.5939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r480 = bone2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(141, 136).addBox(-0.5F, -0.1551F, 1.5503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r481 = bone2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(134, 141).addBox(-0.5F, 0.4886F, 1.2976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r482 = bone2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(141, 81).addBox(-0.5F, -1.1841F, 1.4328F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r483 = bone2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(77, 17).addBox(-0.5F, -1.7899F, -4.4255F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.9076F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 10.6338F, -3.9997F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r484 = bone3.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(114, 58).mirror().addBox(-1.8837F, -1.1122F, -4.8426F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.3146F, -4.0438F, 1.5077F, -0.144F, -1.1561F));

		PartDefinition cube_r485 = bone3.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(125, 12).mirror().addBox(0.2157F, -1.3122F, -1.5822F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.5146F, -4.0438F, 1.4331F, -0.0759F, -0.5009F));

		PartDefinition cube_r486 = bone3.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(140, 44).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1078F, -1.2991F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r487 = bone3.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(133, 96).mirror().addBox(-0.5F, 3.3302F, -0.6213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r488 = bone3.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(92, 115).mirror().addBox(-0.5F, 0.3302F, -0.2213F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r489 = bone3.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(89, 122).mirror().addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.6328F, -2.6832F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r490 = bone3.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(118, 25).mirror().addBox(-0.5F, -3.2651F, -0.96F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r491 = bone3.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.5F, -0.0317F, -0.2241F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.605F, -3.5807F, 1.0516F, 0.0F, 0.0F));

		PartDefinition cube_r492 = bone3.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(83, 27).mirror().addBox(-0.5F, 1.2444F, -0.0313F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.605F, -3.5807F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r493 = bone3.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(65, 72).mirror().addBox(-0.5F, -1.0F, -2.8F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4802F, 1.6415F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r494 = bone3.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(20, 106).mirror().addBox(-0.5F, -0.625F, 1.5939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r495 = bone3.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(141, 136).mirror().addBox(-0.5F, -0.1551F, 1.5503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r496 = bone3.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(134, 141).mirror().addBox(-0.5F, 0.4886F, 1.2976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r497 = bone3.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(141, 81).mirror().addBox(-0.5F, -1.1841F, 1.4328F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r498 = bone3.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(77, 17).mirror().addBox(-0.5F, -1.7899F, -4.4255F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.9076F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4987F, 20.8003F, -8.2899F, 0.3166F, 0.0663F, -0.0455F));

		PartDefinition cube_r499 = leftArm.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(10, 143).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 7.4558F, 0.6378F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r500 = leftArm.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(52, 140).addBox(-0.5F, 0.2429F, 0.037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 4.9997F, 0.3661F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r501 = leftArm.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(57, 139).addBox(-0.5F, 0.2429F, 0.037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 4.9997F, 0.3661F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r502 = leftArm.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(37, 136).addBox(-0.5F, -2.4618F, -0.2581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 136).addBox(-0.5F, -2.4618F, -0.0581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 4.9997F, 0.3661F, 0.4012F, 0.0043F, 0.0036F));

		PartDefinition cube_r503 = leftArm.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(86, 127).addBox(-0.375F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3893F, -1.2128F, 0.0425F, -2.3335F, -0.3577F, -0.0811F));

		PartDefinition cube_r504 = leftArm.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(121, 134).addBox(-0.3621F, -4.5022F, -0.8335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0263F, 3.8936F, 0.3562F, 0.2019F, -0.456F, -0.1553F));

		PartDefinition cube_r505 = leftArm.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(71, 134).addBox(-0.3621F, -4.8292F, -2.1191F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0263F, 3.8936F, 0.3562F, -0.0599F, -0.456F, -0.1553F));

		PartDefinition cube_r506 = leftArm.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(139, 56).addBox(-0.4621F, -2.2264F, -0.524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 3.8936F, 0.3562F, 0.9F, -0.456F, -0.1553F));

		PartDefinition cube_r507 = leftArm.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(134, 26).addBox(-0.4872F, -2.5717F, -3.1697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0095F, 1.1187F, -0.0305F, -1.0488F, 0.0179F, -0.143F));

		PartDefinition cube_r508 = leftArm.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(136, 39).addBox(-0.4872F, -2.7765F, -0.6481F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0095F, 1.1187F, -0.0305F, -0.4816F, 0.0179F, -0.143F));

		PartDefinition cube_r509 = leftArm.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(136, 5).addBox(-0.4878F, -2.9992F, -0.5554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 3.8936F, 0.3562F, 0.1293F, 0.0179F, -0.0033F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(20, 116).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(113, 72).addBox(-0.5909F, 0.8921F, -1.4717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0143F, 7.2882F, 0.8531F, -0.4461F, 0.8602F, -0.0892F));

		PartDefinition cube_r510 = leftArm2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(101, 127).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(45, 126).addBox(-0.6767F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1158F, 11.0889F, -0.5622F, 0.3049F, 0.3621F, 0.2925F));

		PartDefinition cube_r511 = leftArm3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(146, 28).addBox(11.0848F, 0.8221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-11.4616F, 8.1729F, 10.4465F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r512 = leftArm3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(103, 132).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, -0.951F, -0.5433F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(19, 70).addBox(-0.5945F, 1.0179F, -0.9517F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1321F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4987F, 20.8003F, -8.2899F, 0.5784F, -0.0663F, 0.0455F));

		PartDefinition cube_r513 = rightArm.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(145, 139).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 7.4558F, 0.6378F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r514 = rightArm.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(141, 73).addBox(-0.5F, 0.2429F, 0.037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 4.9997F, 0.3661F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r515 = rightArm.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(141, 69).addBox(-0.5F, 0.2429F, 0.037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 4.9997F, 0.3661F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r516 = rightArm.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(0, 137).addBox(-0.5F, -2.4618F, -0.2581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 136).addBox(-0.5F, -2.4618F, -0.0581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 4.9997F, 0.3661F, 0.4012F, -0.0043F, -0.0036F));

		PartDefinition cube_r517 = rightArm.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(13, 131).addBox(-0.625F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3893F, -1.2128F, 0.0425F, -2.3335F, 0.3577F, 0.0811F));

		PartDefinition cube_r518 = rightArm.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(135, 100).addBox(-0.6379F, -4.5022F, -0.8335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0263F, 3.8936F, 0.3562F, 0.2019F, 0.456F, 0.1553F));

		PartDefinition cube_r519 = rightArm.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(126, 134).addBox(-0.6379F, -4.8292F, -2.1191F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0263F, 3.8936F, 0.3562F, -0.0599F, 0.456F, 0.1553F));

		PartDefinition cube_r520 = rightArm.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(141, 52).addBox(-0.5379F, -2.2264F, -0.524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 3.8936F, 0.3562F, 0.9F, 0.456F, 0.1553F));

		PartDefinition cube_r521 = rightArm.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(134, 92).addBox(-0.5128F, -2.5717F, -3.1697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0095F, 1.1187F, -0.0305F, -1.0488F, -0.0179F, 0.143F));

		PartDefinition cube_r522 = rightArm.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(131, 136).addBox(-0.5128F, -2.7765F, -0.6481F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0095F, 1.1187F, -0.0305F, -0.4816F, -0.0179F, 0.143F));

		PartDefinition cube_r523 = rightArm.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(136, 119).addBox(-0.5122F, -2.9992F, -0.5554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 3.8936F, 0.3562F, 0.1293F, -0.0179F, 0.0033F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(40, 116).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(60, 114).addBox(-0.4091F, 0.8921F, -1.4717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0143F, 7.2882F, 0.8531F, -0.4461F, -0.8602F, 0.0892F));

		PartDefinition cube_r524 = rightArm2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(132, 11).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(127, 19).addBox(-0.3233F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1158F, 11.0889F, -0.5622F, 0.3049F, -0.3621F, -0.2925F));

		PartDefinition cube_r525 = rightArm3.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(146, 34).addBox(-12.0848F, 0.8221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(11.4616F, 8.1729F, 10.4465F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r526 = rightArm3.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(52, 134).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, -0.951F, -0.5433F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(136, 0).addBox(-0.4055F, 1.0179F, -0.9517F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1321F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0549F, 9.322F, 0.0699F, -0.0435F, -0.003F));

		PartDefinition cube_r527 = tail.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(133, 0).addBox(0.0F, -5.5908F, 0.0315F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3599F, 11.9214F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r528 = tail.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(108, 127).addBox(0.0F, -5.8257F, 0.0329F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4599F, 9.9214F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r529 = tail.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(93, 127).addBox(0.0F, -6.4607F, 0.0344F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 7.9214F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r530 = tail.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(42, 127).addBox(0.0F, -6.9956F, 0.0341F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 5.9214F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r531 = tail.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(39, 127).addBox(0.0F, -7.0305F, 0.0338F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 3.9214F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r532 = tail.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(25, 116).addBox(0.0F, -7.2654F, 0.0352F, 0.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6599F, 0.9214F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r533 = tail.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(12, 34).mirror().addBox(-2.0F, -0.1047F, 1.9991F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 34).mirror().addBox(-2.0F, -0.1047F, -0.0009F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4799F, -0.0624F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition cube_r534 = tail.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(12, 34).addBox(0.0F, -0.1047F, 1.9991F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(0.0F, -0.1047F, -0.0009F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4799F, -0.0624F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition cube_r535 = tail.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(31, 17).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3401F, -2.0786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r536 = tail.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(98, 122).addBox(0.0F, -0.6886F, -0.2887F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.56F, 11.5878F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r537 = tail.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(15, 80).addBox(0.0F, -0.2618F, -0.0769F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.56F, 8.5878F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r538 = tail.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(27, 127).addBox(0.0F, -0.4678F, -0.5986F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.249F, 4.0168F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r539 = tail.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(66, 125).addBox(0.0F, 0.0322F, -0.1986F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.56F, 6.1878F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1401F, 12.9214F, -0.1398F, -0.0432F, 0.0061F));

		PartDefinition cube_r540 = tail2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(111, 133).addBox(0.0F, -5.5F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r541 = tail2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(27, 136).addBox(0.0F, -3.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 11.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r542 = tail2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(17, 136).addBox(0.0F, -3.9F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 9.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r543 = tail2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(14, 136).addBox(0.0F, -4.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r544 = tail2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(11, 136).addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r545 = tail2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(70, 105).addBox(0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r546 = tail2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(31, 33).mirror().addBox(-1.7F, 0.0F, 0.0F, 2.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r547 = tail2.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(31, 33).addBox(-0.3F, 0.0F, 0.0F, 2.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r548 = tail2.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(139, 128).addBox(0.0F, -0.0181F, -0.2386F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 11.2858F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r549 = tail2.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(133, 80).addBox(0.0F, -1.3578F, -0.4952F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 9.0858F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r550 = tail2.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(133, 36).addBox(0.0F, -0.4446F, -0.3556F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 6.3868F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r551 = tail2.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(3, 128).addBox(0.0F, -0.2364F, -0.1492F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2199F, 3.2664F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r552 = tail2.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(0, 128).addBox(0.0F, -0.1989F, -0.1464F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4199F, 0.8664F, 0.8552F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, -0.1139F, -0.0867F, 0.0099F));

		PartDefinition cube_r553 = tail3.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(142, 106).addBox(0.0F, -2.4184F, 0.0367F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 12.0F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r554 = tail3.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(106, 142).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r555 = tail3.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(23, 142).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r556 = tail3.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(20, 142).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r557 = tail3.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(0, 142).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r558 = tail3.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(139, 141).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r559 = tail3.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(139, 106).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r560 = tail3.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(142, 139).addBox(0.0F, 1.2F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 141).addBox(0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2919F, 9.8423F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r561 = tail3.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(110, 72).addBox(0.0F, -0.1F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.34F, 7.5956F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r562 = tail3.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(83, 138).addBox(0.0F, -0.5F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2764F, 5.1551F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r563 = tail3.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(49, 138).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0754F, 3.1034F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r564 = tail3.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(108, 136).addBox(0.0F, 0.0523F, -0.1361F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 0.3858F, 0.7767F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(25, 65).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, -0.1223F, -0.0433F, 0.0053F));

		PartDefinition cube_r565 = tail4.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(146, 82).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r566 = tail4.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(146, 78).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r567 = tail4.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(146, 74).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r568 = tail4.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(146, 70).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r569 = tail4.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(36, 145).addBox(0.0F, -0.3606F, -0.1148F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5525F, 5.6858F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r570 = tail4.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(102, 144).addBox(0.0F, -0.3247F, 0.0239F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9525F, 3.3858F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r571 = tail4.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(89, 118).addBox(0.0F, -0.2324F, -0.1146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1525F, 1.2858F, 0.8465F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(67, 62).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0094F, 8.0654F, -0.0526F, -0.0871F, 0.0046F));

		PartDefinition cube_r572 = tail5.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(21, 147).addBox(0.0F, 18.7F, 32.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 119).addBox(0.0F, 17.7F, 30.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5577F, -30.175F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r573 = tail5.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(146, 116).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.589F, 3.4188F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r574 = tail5.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(133, 8).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7756F, 1.1439F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r575 = tail5.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(76, 129).addBox(0.0F, -1.0821F, -0.1145F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r576 = tail5.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(109, 146).addBox(0.0F, -1.2989F, -0.1474F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r577 = tail5.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(146, 90).addBox(0.0F, -1.4156F, -0.0802F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r578 = tail5.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(146, 86).addBox(0.0F, -1.4324F, -0.1131F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition cube_r579 = tail6.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(146, 135).addBox(0.0F, 1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0708F, -0.3206F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r580 = tail6.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(18, 147).addBox(0.0F, -1.3907F, 1.8205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 132).addBox(0.0F, -0.8907F, -0.0795F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0701F, -0.0871F, -0.0061F));

		return LayerDefinition.create(meshdefinition, 152, 152);
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