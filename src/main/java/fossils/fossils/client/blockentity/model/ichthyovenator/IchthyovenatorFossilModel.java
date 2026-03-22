package fossils.fossils.client.blockentity.model.ichthyovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IchthyovenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart bone3;
	private final ModelPart bone5;
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
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public IchthyovenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.bone3 = this.hips.getChild("bone3");
		this.bone5 = this.hips.getChild("bone5");
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
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.head = this.neck9.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.9535F, 3.0731F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(102, 120).addBox(0.0F, -2.625F, -0.375F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -5.2581F, -2.345F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 104).addBox(-0.02F, -6.0F, -0.8F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7581F, 0.0196F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 92).addBox(0.0F, -6.7F, 9.2F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0475F, -6.9294F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 117).addBox(0.01F, -2.5F, -0.4F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2185F, 5.9972F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(55, 117).addBox(0.0F, -5.5F, -0.1F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2713F, 6.2691F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(108, 127).addBox(0.0F, 2.9328F, -0.3049F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.3361F, -1.6659F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(137, 64).addBox(-0.01F, 0.0103F, -1.0024F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.3361F, -1.6659F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(114, 104).addBox(-0.01F, -3.1059F, -0.3941F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8475F, -0.1294F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 113).addBox(0.0F, -3.9329F, -1.9874F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.47F, 2.3122F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(14, 112).addBox(0.01F, -3.8945F, -1.094F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8475F, 0.5706F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(111, 135).addBox(-0.02F, -2.8534F, 1.5935F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 110).addBox(0.02F, -2.8534F, -0.0065F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3676F, 2.8342F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(117, 51).addBox(0.0F, -1.475F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -8.8264F, 4.8848F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(99, 65).addBox(0.01F, -2.5F, -0.5F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0235F, 4.3101F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(117, 74).addBox(0.0F, 0.025F, -1.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7302F, 7.9503F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(107, 141).addBox(-0.01F, -1.8347F, -0.6984F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7185F, 7.5972F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -1.9822F, 0.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(97, 36).addBox(-0.4F, -1.699F, -1.0436F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 1.7488F, -1.0467F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r17 = rightLeg1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(104, 42).addBox(-5.6F, 1.2801F, -0.134F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 9.561F, -0.7537F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r18 = rightLeg1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(44, 108).addBox(-5.1F, -0.029F, 0.0031F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 9.561F, -0.7537F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r19 = rightLeg1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(108, 36).addBox(-5.1F, 0.0034F, 0.0068F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 7.586F, -1.1787F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightLeg1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(133, 11).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.1469F, 0.2671F, -2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r21 = rightLeg1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 128).addBox(-0.5F, -0.4086F, -0.1934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 3.1469F, 0.2671F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r22 = rightLeg1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(99, 76).addBox(-5.1F, 0.0069F, -0.0752F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.586F, -1.1787F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightLeg1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 103).addBox(-1.1F, -0.4F, -2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.2386F, 1.4571F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 11.7974F, 1.7145F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 117).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3F, 0.559F, -1.8079F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(105, 109).addBox(-0.1F, -1.6F, -1.425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, 1.3703F, 0.2605F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(108, 52).addBox(-1.0F, -1.675F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, -0.4616F, -1.4087F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(88, 59).addBox(-0.1F, -0.6F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, -0.6464F, 0.2046F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(112, 116).addBox(-0.1F, -1.0F, -1.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 8.6606F, -0.0562F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(79, 116).addBox(-0.1F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 8.6606F, -0.0562F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 105).addBox(-0.1F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 3.7292F, 0.7691F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(114, 111).addBox(-0.1F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 2.2088F, 0.335F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(9, 87).addBox(-1.1F, -7.0F, -0.525F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 6.6481F, -0.5553F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(105, 114).addBox(-1.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.4F, -0.8519F, 0.6447F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(87, 110).addBox(-1.1F, -0.0365F, -0.9927F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4F, 3.9728F, 0.4937F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(122, 122).addBox(-1.1F, -0.9224F, -0.457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4F, 1.1207F, 0.3146F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(55, 90).addBox(-1.0F, -0.9437F, -0.5675F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6326F, -0.991F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(22, 133).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 4.0435F, -0.5675F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r37 = rightLeg3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 122).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 2.5563F, -0.0675F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(75, 31).addBox(-1.5F, -1.0737F, -2.9804F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.9009F, 0.1707F, 0.096F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(65, 46).addBox(-2.5F, -1.7991F, -4.0436F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7216F, -2.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(86, 98).addBox(-2.6F, -0.7F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.7498F, -1.0903F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(104, 71).addBox(2.6F, 1.2801F, -0.134F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 10.5601F, -0.7101F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(109, 31).addBox(3.1F, -0.029F, 0.0031F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.6F, 10.5601F, -0.7101F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(109, 6).addBox(3.1F, 0.0034F, 0.0068F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 8.5851F, -1.1351F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(135, 89).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.1459F, 0.3107F, -2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(128, 82).addBox(-0.5F, -0.4086F, -0.1934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.1459F, 0.3107F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(35, 100).addBox(3.1F, 0.0069F, -0.0752F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 4.5851F, -1.1351F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(104, 65).addBox(-0.9F, -0.4F, -2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 2.2376F, 1.5007F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 11.7974F, 1.7145F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(33, 117).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, 1.5581F, -1.7642F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(110, 11).addBox(-1.9F, -1.6F, -1.425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, 2.3693F, 0.3041F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(109, 85).addBox(-1.0F, -1.675F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 0.5375F, -1.3651F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(100, 95).addBox(-1.9F, -0.6F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(26, 117).addBox(-1.9F, -1.0F, -1.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(7, 117).addBox(-1.9F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(62, 109).addBox(-1.9F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7282F, 0.8127F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(60, 116).addBox(-1.9F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 3.2079F, 0.3786F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(37, 88).addBox(-0.9F, -7.0F, -0.525F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2F, 7.6472F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(115, 95).addBox(0.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-2.4F, 0.1471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(92, 111).addBox(0.1F, -0.0365F, -0.9927F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4F, 4.9718F, 0.5373F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(123, 31).addBox(0.1F, -0.9224F, -0.457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4F, 2.1197F, 0.3582F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(91, 89).addBox(-2.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6326F, -0.991F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(93, 135).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r58 = leftLeg3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(122, 116).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(77, 9).addBox(-4.5F, -0.0746F, -2.9368F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.9009F, 0.1707F, 0.288F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(67, 52).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7216F, -2.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5986F, -3.8641F, 3.9352F, 0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 99).addBox(-0.5F, -0.2F, -0.075F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2691F, -0.7304F, -0.1F, -0.2872F, -0.0116F, -0.4027F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(81, 81).addBox(-0.5577F, 3.5931F, -7.2175F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9991F, 0.5564F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(17, 83).addBox(-1.2232F, -0.1647F, -0.0157F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.703F, -1.673F, -4.0064F, -0.1607F, -0.0116F, -0.4027F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(19, 64).addBox(-0.6621F, -1.5229F, -7.6388F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6679F, 2.6433F, 4.7372F, -0.0265F, -0.0295F, -0.3607F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(109, 90).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8062F, 3.0331F, -0.4919F, 0.3662F, -0.0295F, -0.3607F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(33, 112).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5174F, -0.1324F, 2.7572F, -0.825F, -0.0351F, -0.3548F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(113, 46).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7127F, 7.6374F, -7.4148F, -1.0215F, 0.0639F, 0.0248F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(103, 25).addBox(-0.9911F, -0.0452F, -0.082F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1474F, 9.8037F, -4.9008F, 2.1492F, -0.0008F, 0.0279F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(60, 125).addBox(-0.5F, -0.9F, -2.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7463F, 7.8458F, -3.8463F, 1.4944F, -0.0199F, 0.0571F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(7, 111).addBox(-0.478F, -4.8257F, -2.0277F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5644F, 10.5343F, -1.2796F, 0.3862F, -0.0199F, 0.0571F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(117, 37).addBox(-0.5318F, 1.6448F, -0.2477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5644F, 10.7343F, -0.2796F, 0.255F, -0.0096F, -0.0507F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(129, 50).addBox(-0.5F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6013F, 12.1214F, -0.109F, 0.5168F, -0.0096F, -0.0507F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(105, 104).addBox(-0.5318F, -0.1948F, 0.0756F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5644F, 10.7343F, -0.2796F, -0.478F, -0.0096F, -0.0507F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(118, 31).addBox(-0.3397F, -0.4407F, -0.5671F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5644F, 8.6343F, -2.7796F, 0.8053F, -0.0118F, 0.0593F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(47, 113).addBox(-0.9737F, -1.1276F, 0.3082F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, -0.4238F, 0.0067F, -0.0503F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(75, 96).addBox(-1.1346F, 2.3476F, -3.4608F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, 0.5668F, 0.0639F, -0.1148F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(47, 81).addBox(-1.1346F, 1.0988F, -8.3212F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, 0.9158F, 0.0639F, -0.1148F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(130, 135).addBox(-1.1346F, -0.367F, -8.0148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, 1.2125F, 0.0639F, -0.1148F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(129, 41).addBox(-1.1346F, 0.8325F, -1.5098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, 0.6453F, 0.0639F, -0.1148F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(137, 115).addBox(-1.1346F, -4.4224F, 6.7307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, -2.4308F, 0.0639F, -0.1148F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(137, 101).addBox(-1.1346F, 2.5635F, 7.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, -1.6193F, 0.0639F, -0.1148F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(103, 31).addBox(-1.1346F, 7.551F, 2.5114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, -0.8339F, 0.0639F, -0.1148F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(55, 125).addBox(-1.1346F, 5.5435F, 0.6462F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, -0.5895F, 0.0639F, -0.1148F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(94, 84).addBox(-1.1346F, 2.7857F, 0.0808F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, -0.4892F, 0.0639F, -0.1148F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(129, 5).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4374F, 5.668F, -9.0748F, -0.0916F, 0.0738F, -0.0344F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(19, 118).addBox(-1.006F, -0.1929F, -0.2239F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0277F, 7.5619F, -8.903F, -0.3757F, 0.0639F, -0.0625F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(40, 113).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.495F, 3.9959F, -9.0289F, 0.0693F, 0.0639F, 0.0248F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(121, 86).addBox(-0.5F, -0.1F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 113).addBox(-0.5F, 0.4F, 0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6446F, 1.9744F, -7.7604F, -0.6288F, 0.0639F, 0.0248F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 111).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0198F, 4.8981F, -2.8018F, 0.0606F, 0.0639F, 0.0248F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(68, 72).addBox(-0.3844F, -0.7139F, -1.8767F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7319F, 3.3547F, -5.6838F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(93, 104).addBox(-0.5F, -1.7F, -0.75F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0252F, 2.0192F, -9.7292F, 2.0986F, -0.2702F, -0.4046F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(26, 99).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3195F, 0.74F, -12.5238F, 2.212F, -0.2702F, -0.4046F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(80, 110).addBox(-0.2054F, -1.861F, -0.3731F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.425F, 0.6209F, -10.8282F, 1.6186F, -0.2702F, -0.4046F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(120, 128).addBox(-0.2054F, -2.4251F, 0.4785F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.425F, 0.6209F, -10.8282F, 1.095F, -0.2702F, -0.4046F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(128, 86).addBox(-0.2054F, -2.8338F, 0.1916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.425F, 0.6209F, -10.8282F, 0.6151F, -0.2702F, -0.4046F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(36, 64).addBox(-0.2F, 0.0871F, -2.0451F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5837F, -2.1179F, -6.5903F, -0.037F, -0.1479F, -0.3361F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(92, 14).addBox(-0.2054F, 0.0141F, -2.9907F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3848F, -2.1594F, -8.6081F, 0.0827F, -0.2702F, -0.4046F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(94, 26).addBox(-0.5F, 0.0F, -2.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0241F, -1.5357F, -3.9556F, -0.2478F, 0.0089F, -0.4028F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5986F, -4.8631F, 3.8915F, 0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r97 = bone5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(-0.5F, -0.2F, -0.075F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2691F, 0.2687F, -0.0564F, -0.2872F, 0.0116F, 0.4027F));

		PartDefinition cube_r98 = bone5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(81, 81).mirror().addBox(-0.4423F, 3.5931F, -7.2175F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r99 = bone5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(17, 83).mirror().addBox(0.2232F, -0.1647F, -0.0157F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -0.6739F, -3.9628F, -0.1607F, 0.0116F, 0.4027F));

		PartDefinition cube_r100 = bone5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(19, 64).mirror().addBox(-0.3379F, -1.5229F, -7.6388F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.6679F, 3.6424F, 4.7808F, -0.0265F, 0.0295F, 0.3607F));

		PartDefinition cube_r101 = bone5.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(109, 90).mirror().addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8062F, 4.0322F, -0.4483F, 0.3662F, 0.0295F, 0.3607F));

		PartDefinition cube_r102 = bone5.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(33, 112).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5174F, 0.8667F, 2.8008F, -0.825F, 0.0351F, 0.3548F));

		PartDefinition cube_r103 = bone5.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(113, 46).mirror().addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7127F, 8.6364F, -7.3712F, -1.0215F, -0.0639F, -0.0248F));

		PartDefinition cube_r104 = bone5.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(103, 25).mirror().addBox(-0.0088F, -0.0452F, -0.082F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1474F, 10.8027F, -4.8572F, 2.1492F, 0.0008F, -0.0279F));

		PartDefinition cube_r105 = bone5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(60, 125).mirror().addBox(-0.5F, -0.9F, -2.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7463F, 8.8448F, -3.8027F, 1.4944F, 0.0199F, -0.0571F));

		PartDefinition cube_r106 = bone5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(7, 111).mirror().addBox(-0.522F, -4.8257F, -2.0277F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 11.5333F, -1.236F, 0.3862F, 0.0199F, -0.0571F));

		PartDefinition cube_r107 = bone5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(117, 37).mirror().addBox(-0.4682F, 1.6448F, -0.2477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 11.7333F, -0.236F, 0.255F, 0.0096F, 0.0507F));

		PartDefinition cube_r108 = bone5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(129, 50).mirror().addBox(-0.5F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6013F, 13.1205F, -0.0654F, 0.5168F, 0.0096F, 0.0507F));

		PartDefinition cube_r109 = bone5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(105, 104).mirror().addBox(-0.4682F, -0.1948F, 0.0756F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 11.7333F, -0.236F, -0.478F, 0.0096F, 0.0507F));

		PartDefinition cube_r110 = bone5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(118, 31).mirror().addBox(-0.6603F, -0.4407F, -0.5671F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 9.6333F, -2.736F, 0.8053F, 0.0118F, -0.0593F));

		PartDefinition cube_r111 = bone5.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(47, 113).mirror().addBox(-0.0263F, -1.1276F, 0.3082F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, -0.4238F, -0.0067F, 0.0503F));

		PartDefinition cube_r112 = bone5.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(75, 96).mirror().addBox(0.1346F, 2.3476F, -3.4608F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, 0.5668F, -0.0639F, 0.1148F));

		PartDefinition cube_r113 = bone5.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(47, 81).mirror().addBox(0.1346F, 1.0988F, -8.3212F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, 0.9158F, -0.0639F, 0.1148F));

		PartDefinition cube_r114 = bone5.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(130, 135).mirror().addBox(0.1346F, -0.367F, -8.0148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, 1.2125F, -0.0639F, 0.1148F));

		PartDefinition cube_r115 = bone5.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(129, 41).mirror().addBox(0.1346F, 0.8325F, -1.5098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, 0.6453F, -0.0639F, 0.1148F));

		PartDefinition cube_r116 = bone5.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(137, 115).mirror().addBox(0.1346F, -4.4224F, 6.7307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, -2.4308F, -0.0639F, 0.1148F));

		PartDefinition cube_r117 = bone5.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(137, 101).mirror().addBox(0.1346F, 2.5635F, 7.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, -1.6193F, -0.0639F, 0.1148F));

		PartDefinition cube_r118 = bone5.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(103, 31).mirror().addBox(0.1346F, 7.551F, 2.5114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, -0.8339F, -0.0639F, 0.1148F));

		PartDefinition cube_r119 = bone5.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(55, 125).mirror().addBox(0.1346F, 5.5435F, 0.6462F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, -0.5895F, -0.0639F, 0.1148F));

		PartDefinition cube_r120 = bone5.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(94, 84).mirror().addBox(0.1346F, 2.7857F, 0.0808F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, -0.4892F, -0.0639F, 0.1148F));

		PartDefinition cube_r121 = bone5.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(129, 5).mirror().addBox(-0.5F, 0.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, 6.6671F, -9.0311F, -0.0916F, -0.0738F, 0.0344F));

		PartDefinition cube_r122 = bone5.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(19, 118).mirror().addBox(0.006F, -0.1929F, -0.2239F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0277F, 8.5609F, -8.8594F, -0.3757F, -0.0639F, 0.0625F));

		PartDefinition cube_r123 = bone5.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(40, 113).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.495F, 4.995F, -8.9852F, 0.0693F, -0.0639F, -0.0248F));

		PartDefinition cube_r124 = bone5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(121, 86).mirror().addBox(-0.5F, -0.1F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 113).mirror().addBox(-0.5F, 0.4F, 0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6446F, 2.9735F, -7.7168F, -0.6288F, -0.0639F, -0.0248F));

		PartDefinition cube_r125 = bone5.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0198F, 5.8972F, -2.7582F, 0.0606F, -0.0639F, -0.0248F));

		PartDefinition cube_r126 = bone5.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(68, 72).mirror().addBox(-0.6156F, -0.7139F, -1.8767F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 4.3537F, -5.6402F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r127 = bone5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(93, 104).mirror().addBox(-0.5F, -1.7F, -0.75F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0252F, 3.0182F, -9.6855F, 2.0986F, 0.2702F, 0.4046F));

		PartDefinition cube_r128 = bone5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(26, 99).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3195F, 1.739F, -12.4801F, 2.212F, 0.2702F, 0.4046F));

		PartDefinition cube_r129 = bone5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-0.7946F, -1.861F, -0.3731F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.6199F, -10.7846F, 1.6186F, 0.2702F, 0.4046F));

		PartDefinition cube_r130 = bone5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(120, 128).mirror().addBox(-0.7946F, -2.4251F, 0.4785F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.6199F, -10.7846F, 1.095F, 0.2702F, 0.4046F));

		PartDefinition cube_r131 = bone5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(128, 86).mirror().addBox(-0.7946F, -2.8338F, 0.1916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.425F, 1.6199F, -10.7846F, 0.6151F, 0.2702F, 0.4046F));

		PartDefinition cube_r132 = bone5.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(36, 64).mirror().addBox(-0.8F, 0.0871F, -2.0451F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5837F, -1.1189F, -6.5467F, -0.037F, 0.1479F, 0.3361F));

		PartDefinition cube_r133 = bone5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-0.7946F, 0.0141F, -2.9907F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3848F, -1.1604F, -8.5644F, 0.0827F, 0.2702F, 0.4046F));

		PartDefinition cube_r134 = bone5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(94, 26).mirror().addBox(-0.5F, 0.0F, -2.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0241F, -0.5367F, -3.9119F, -0.2478F, -0.0089F, 0.4028F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2862F, 7.5002F, -0.2768F, 0.2101F, -0.0592F));

		PartDefinition cube_r135 = tail1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(85, 126).addBox(0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4381F, 8.8381F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail1.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(46, 120).addBox(0.0F, -0.464F, -0.483F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7706F, 1.1245F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(14, 120).addBox(0.5F, -0.7129F, -0.6754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2937F, 4.2236F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(65, 126).addBox(0.5F, 0.3871F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2555F, 6.7132F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(127, 70).addBox(0.5F, -4.7073F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2072F, 7.9365F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(127, 63).addBox(0.5F, -4.8073F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8469F, 5.8484F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(117, 124).addBox(0.5F, -4.7073F, -0.2162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.553F, 4.0613F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(119, 116).addBox(0.5F, -4.8323F, -0.0162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3455F, 1.8703F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(108, 119).addBox(0.5F, -5.3823F, -0.1162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0233F, -0.0402F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1484F, 1.0289F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r145 = tail1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 52).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1484F, 1.0289F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r146 = tail1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(23, 40).addBox(0.0F, -1.9F, -0.9F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.7562F, 1.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.4628F, 8.8422F, 0.1325F, 0.1737F, 0.0173F));

		PartDefinition cube_r147 = tail.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2382F, 1.9544F, 0.1575F, 0.069F, 0.0109F));

		PartDefinition cube_r148 = tail.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(65, 38).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.2382F, 1.9544F, 0.1575F, -0.069F, -0.0109F));

		PartDefinition cube_r149 = tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(58, 11).addBox(0.0F, -1.9F, 8.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.2308F, -7.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(20, 124).addBox(0.0F, 0.0F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.748F, 7.0799F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(5, 126).addBox(0.0F, 0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0636F, 4.7429F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(82, 125).addBox(0.0F, -0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.703F, 2.7675F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(114, 121).addBox(0.5F, -5.7205F, -0.0226F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6518F, 6.7718F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(40, 118).addBox(0.5F, -5.1205F, -0.0226F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6343F, 4.7718F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(79, 125).addBox(0.5F, -4.7823F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.4832F, 2.8025F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(76, 125).addBox(0.5F, -5.4823F, 0.8838F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.7285F, -0.136F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.6624F, 7.8232F, 0.2037F, 0.171F, 0.0351F));

		PartDefinition cube_r157 = tail2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(86, 118).addBox(0.0F, -6.2295F, 0.0466F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 6.946F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(118, 82).addBox(0.0F, -6.1134F, 0.0872F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 4.946F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(67, 118).addBox(0.0F, -5.5553F, -0.9425F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 3.946F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(43, 118).addBox(0.0F, -5.5811F, 0.0684F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(63, 62).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(44, 62).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(127, 121).addBox(0.0F, 0.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3862F, 1.7446F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(127, 115).addBox(0.0F, 0.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1005F, 6.0433F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(32, 74).addBox(0.0F, 0.5F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(36, 72).mirror().addBox(-0.9F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4564F, 0.0304F, 0.0175F, 0.0698F, 0.0012F));

		PartDefinition cube_r166 = tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(36, 72).addBox(-0.1F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4564F, 0.0304F, 0.0175F, -0.0698F, -0.0012F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, -0.0264F, -0.3496F, 0.1692F));

		PartDefinition cube_r167 = tail8.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(54, 27).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail8.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(11, 126).addBox(0.0F, 0.0273F, -0.1207F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4084F, 7.8729F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail8.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(8, 126).addBox(0.0F, -0.2F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4228F, 6.4801F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail8.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(73, 124).addBox(0.0F, -0.3F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4791F, 4.472F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(91, 127).addBox(0.0F, 0.0F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0846F, 1.901F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(70, 124).addBox(0.0F, -0.3F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.1152F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(92, 119).addBox(0.0F, -6.104F, -0.1697F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 6.8984F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail8.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(119, 8).addBox(0.0F, -6.288F, -0.0904F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 4.8984F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail8.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(119, 0).addBox(0.0F, -6.272F, -0.111F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 2.8984F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail8.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(89, 118).addBox(0.0F, -6.2561F, -0.0316F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 0.8984F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, -0.009F, -0.2618F, 0.0023F));

		PartDefinition cube_r177 = tail3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(32, 126).addBox(0.0F, 0.6F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4364F, 6.8875F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(105, 127).addBox(0.0F, 0.3F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2488F, 5.1861F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(98, 124).addBox(0.0F, 0.4F, -0.4F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1036F, 3.2148F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(95, 124).addBox(0.0F, -0.1F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5866F, 1.2549F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(29, 126).addBox(0.0F, -4.7191F, -0.0834F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9252F, 7.9853F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(26, 126).addBox(0.0F, -4.7628F, -0.0984F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9252F, 5.9853F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(23, 126).addBox(0.0F, -4.9628F, -0.1984F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8613F, 4.0447F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(105, 119).addBox(0.0F, -5.4628F, -0.1984F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6769F, 2.0283F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(119, 100).addBox(0.0F, -5.3128F, 0.0016F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, 0.1065F, -0.4363F, -0.0081F));

		PartDefinition cube_r187 = tail9.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(77, 14).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail9.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(127, 127).addBox(0.0F, 0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.152F, 4.4887F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail9.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(127, 133).addBox(0.0F, 0.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3096F, 2.4724F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail9.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(41, 126).addBox(0.0F, -0.1F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5646F, 0.4787F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail9.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(49, 128).addBox(0.0F, -4.225F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5948F, 4.9985F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail9.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(38, 126).addBox(0.0F, -4.575F, 0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4878F, 2.979F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail9.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(35, 126).addBox(0.0F, -4.675F, 0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2753F, 0.9678F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3563F, 5.914F, 0.1881F, -0.2592F, -0.0373F));

		PartDefinition cube_r194 = tail4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(52, 126).addBox(0.0F, -0.9077F, -0.5551F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7749F, 5.2819F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(129, 103).addBox(0.0F, 0.1923F, -0.5551F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6943F, 3.0473F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 134).addBox(0.0F, 0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5518F, 0.9279F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(69, 135).addBox(0.0F, -4.05F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0251F, 5.0092F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(129, 56).addBox(0.0F, -4.125F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.184F, 3.0202F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(101, 128).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.393F, 1.0311F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(32, 80).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(62, 83).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.0557F, -0.2606F, 0.0257F));

		PartDefinition cube_r201 = tail5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 128).addBox(0.0F, -0.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3159F, 3.4355F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(13, 134).addBox(0.0F, -0.1017F, -0.1261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4012F, 0.8369F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(114, 129).addBox(0.0F, -3.625F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5367F, 2.8006F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(111, 129).addBox(0.0F, -3.625F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4872F, 0.8777F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 4.6774F, -0.0832F, -0.2696F, -0.0737F));

		PartDefinition cube_r205 = tail6.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(135, 131).addBox(0.0F, -3.0F, 0.025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1192F, 6.0146F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail6.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(58, 130).addBox(0.0F, -3.5F, -0.075F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1417F, 4.0393F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail6.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(55, 130).addBox(0.0F, -3.9F, -0.025F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3585F, 1.9891F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail6.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(130, 9).addBox(0.0F, -3.8F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1842F, -0.0032F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail6.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(61, 130).addBox(0.0F, -0.5F, -0.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5462F, 1.0503F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail6.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(127, 139).addBox(0.0F, -0.7F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 135).addBox(0.0F, 0.5722F, 1.2432F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3467F, 3.3933F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail6.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(140, 96).addBox(0.0F, -0.0557F, -0.0135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0317F, 6.7623F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1814F, -0.5255F, 0.0351F));

		PartDefinition cube_r212 = tail7.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(142, 54).addBox(0.0F, -0.525F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0486F, 9.9604F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail7.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(142, 51).addBox(0.0F, -1.325F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.357F, 7.9121F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r214 = tail7.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(15, 142).addBox(0.0F, -1.625F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1653F, 5.9213F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r215 = tail7.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(130, 141).addBox(0.0F, -2.025F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0264F, 3.9305F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r216 = tail7.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(111, 140).addBox(0.0F, -2.425F, -0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1485F, 1.9342F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail7.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(82, 137).addBox(0.0F, -3.425F, 0.15F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5157F, -0.3105F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail7.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(142, 44).addBox(0.0F, 0.6F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5642F, 8.4046F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail7.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(141, 107).addBox(0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.756F, 6.0694F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail7.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(59, 141).addBox(0.0F, -0.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.735F, 3.6653F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail7.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(95, 65).addBox(0.0F, -0.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7189F, 1.8269F, 0.8639F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4925F, 8.6858F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(88, 126).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.6339F, -2.1253F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(75, 83).addBox(0.0F, -8.9F, -0.65F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8058F, -5.1582F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(8, 133).addBox(0.02F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -9.7684F, -4.377F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(16, 92).addBox(-0.01F, -8.8F, 0.05F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9016F, -6.1536F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r226 = body.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(100, 104).addBox(-0.01F, -0.1F, -1.95F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6331F, -0.8987F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r227 = body.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(137, 69).addBox(0.0F, -1.8F, -0.45F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -7.6009F, -1.3181F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(18, 142).addBox(0.025F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -10.2543F, -0.7859F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r229 = body.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(142, 0).addBox(-0.01F, -1.7455F, -0.0364F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0847F, -1.1272F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r230 = body.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(111, 121).addBox(0.01F, -4.5F, -0.1F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3309F, -1.2681F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r231 = body.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(127, 10).addBox(0.0F, -4.4F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2057F, -0.3768F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r232 = body.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(77, 0).addBox(-1.0F, 0.0F, 2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r233 = body.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(44, 52).addBox(-2.5F, -5.1922F, 0.0533F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.5328F, -8.3805F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r234 = body.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(126, 17).mirror().addBox(-4.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, -0.0295F, 0.162F, -1.5197F));

		PartDefinition cube_r235 = body.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(133, 9).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.0669F, 0.1506F, -0.9189F));

		PartDefinition cube_r236 = body.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(132, 106).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.1244F, 0.1082F, -0.4809F));

		PartDefinition cube_r237 = body.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(131, 113).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, 0.0583F, 0.0649F, -0.6423F));

		PartDefinition cube_r238 = body.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(126, 17).addBox(2.6881F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, -0.0295F, -0.162F, 1.5197F));

		PartDefinition cube_r239 = body.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(133, 9).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.0669F, -0.1506F, 0.9189F));

		PartDefinition cube_r240 = body.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(132, 106).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.1244F, -0.1082F, 0.4809F));

		PartDefinition cube_r241 = body.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(131, 113).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, 0.0583F, -0.0649F, 0.6423F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(44, 40).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, 0.0409F, 0.1292F, 0.0486F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, -8.8122F, -1.0627F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0807F, -1.9945F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(99, 42).addBox(0.0F, -7.9617F, 0.1386F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -9.195F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(94, 72).addBox(0.0F, -8.6867F, -1.9614F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0437F, -4.0952F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(130, 15).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.2042F, 0.1047F, -0.4074F));

		PartDefinition cube_r246 = body2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(129, 96).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1414F, 0.1809F, -0.8416F));

		PartDefinition cube_r247 = body2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(96, 9).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0147F, 0.2287F, -1.4462F));

		PartDefinition cube_r248 = body2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(67, 58).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0685F, 0.3777F, -1.3502F));

		PartDefinition cube_r249 = body2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(129, 94).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.2723F, 0.2735F, -0.7322F));

		PartDefinition cube_r250 = body2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(129, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.3598F, 0.1358F, -0.3088F));

		PartDefinition cube_r251 = body2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(129, 77).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.2776F, 0.1049F, -0.3536F));

		PartDefinition cube_r252 = body2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(128, 35).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.2089F, 0.2116F, -0.7823F));

		PartDefinition cube_r253 = body2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(81, 22).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0529F, 0.2917F, -1.3902F));

		PartDefinition cube_r254 = body2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(130, 15).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.2042F, -0.1047F, 0.4074F));

		PartDefinition cube_r255 = body2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(29, 15).addBox(-2.5F, -3.9721F, -0.0171F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.26F, -9.8052F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r256 = body2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(129, 96).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1414F, -0.1809F, 0.8416F));

		PartDefinition cube_r257 = body2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(96, 9).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0147F, -0.2287F, 1.4462F));

		PartDefinition cube_r258 = body2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(67, 58).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0685F, -0.3777F, 1.3502F));

		PartDefinition cube_r259 = body2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(129, 94).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.2723F, -0.2735F, 0.7322F));

		PartDefinition cube_r260 = body2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(129, 79).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.3598F, -0.1358F, 0.3088F));

		PartDefinition cube_r261 = body2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(129, 77).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.2776F, -0.1049F, 0.3536F));

		PartDefinition cube_r262 = body2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(128, 35).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.2089F, -0.2116F, 0.7823F));

		PartDefinition cube_r263 = body2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(81, 22).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0529F, -0.2917F, 1.3902F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0088F, -8.9481F, 0.1489F, 0.0863F, 0.0129F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(101, 13).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.0391F, -2.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(25, 30).addBox(0.0F, -7.9525F, -1.1399F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7172F, -0.8517F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(97, 111).addBox(0.0F, -7.1967F, -0.0424F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -3.9368F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(75, 26).addBox(-3.4872F, -0.232F, -0.9012F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 8.3298F, -10.2946F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(82, 70).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.0787F, 0.371F, -1.37F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(130, 74).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.2763F, 0.2626F, -0.7547F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(130, 72).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.3589F, 0.1242F, -0.3325F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(130, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -5.3368F, 0.3137F, 0.0974F, -0.3028F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(130, 68).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -5.3368F, 0.2455F, 0.2197F, -0.7273F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(75, 36).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -5.3368F, 0.0789F, 0.3187F, -1.3352F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(130, 66).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.2956F, 0.1008F, -0.3196F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(130, 64).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.2273F, 0.2153F, -0.7462F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(58, 24).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.0661F, 0.305F, -1.3542F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -1.5368F, 0.0588F, 0.2893F, -1.3024F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(130, 62).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -1.5368F, 0.2123F, 0.2065F, -0.6955F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(130, 19).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -1.5368F, 0.2785F, 0.0989F, -0.2673F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(96, 11).mirror().addBox(-4.7135F, 0.0515F, -0.0508F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0666F, 8.2734F, -10.2355F, -1.1027F, 1.2853F, 0.2095F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(81, 24).mirror().addBox(-6.9407F, 0.2913F, -0.1726F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7307F, 8.4961F, -9.9579F, -0.6956F, 1.2644F, -0.0252F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-9.282F, 0.3989F, -0.3935F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.47F, 8.7722F, -9.8509F, -0.3555F, 1.2022F, -0.3238F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(82, 70).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.0787F, -0.371F, 1.37F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(130, 74).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.2763F, -0.2626F, 0.7547F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(130, 72).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.3589F, -0.1242F, 0.3325F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(49, 120).addBox(0.0F, -5.8926F, -0.1837F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -7.7368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(130, 70).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -5.3368F, 0.3137F, -0.0974F, 0.3028F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(130, 68).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -5.3368F, 0.2455F, -0.2197F, 0.7273F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(75, 36).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -5.3368F, 0.0789F, -0.3187F, 1.3352F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(130, 66).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.2956F, -0.1008F, 0.3196F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(130, 64).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.2273F, -0.2153F, 0.7462F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(58, 24).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.0661F, -0.305F, 1.3542F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(58, 22).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -1.5368F, 0.0588F, -0.2893F, 1.3024F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(130, 62).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -1.5368F, 0.2123F, -0.2065F, 0.6955F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, -2.9608F, -6.0464F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 12.9856F, -2.7324F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(130, 19).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -1.5368F, 0.2785F, -0.0989F, 0.2673F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(69, 109).addBox(0.0F, -6.7926F, -0.1837F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -5.7368F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(96, 11).addBox(-0.2865F, 0.0515F, -0.0508F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0666F, 8.2734F, -10.2355F, -1.1027F, -1.2853F, -0.2095F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(81, 24).addBox(-0.0593F, 0.2913F, -0.1726F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7307F, 8.4961F, -9.9579F, -0.6956F, -1.2644F, 0.0252F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(67, 60).addBox(0.282F, 0.3989F, -0.3935F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.47F, 8.7722F, -9.8509F, -0.3555F, -1.2022F, 0.3238F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 81).addBox(-2.4872F, -0.8453F, -3.4032F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 8.1994F, -11.7204F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(17, 74).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.0609F, -3.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4802F, 7.3165F, -11.311F, 0.5007F, 0.4351F, -0.6994F));

		PartDefinition cube_r303 = leftArm1.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(122, 6).addBox(-0.5F, -0.8F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0477F, -0.3832F, 1.0677F, -0.7581F, -0.7676F, 0.1498F));

		PartDefinition cube_r304 = leftArm1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(137, 127).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.023F, -1.0492F, 0.1714F, 0.5072F, -0.7676F, 0.1498F));

		PartDefinition cube_r305 = leftArm1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(26, 111).addBox(-0.5F, -1.7F, -0.975F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.1473F, -0.7676F, 0.1498F));

		PartDefinition cube_r306 = leftArm1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(5, 122).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r307 = leftArm1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(122, 0).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0774F, 0.354F, 1.2291F, 0.0307F, -0.0797F, -0.032F));

		PartDefinition cube_r308 = leftArm1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(137, 124).addBox(-0.5F, 0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(137, 121).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftArm1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(140, 88).addBox(-0.5F, 0.55F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 118).addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r310 = leftArm1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(27, 133).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, 1.8087F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(122, 10).addBox(-0.8F, -0.4307F, 0.1266F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 0).addBox(-0.8F, 0.5693F, -0.9734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2749F, 6.1941F, 0.9655F, -1.0977F, -0.2465F, 0.1915F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.095F, 3.6959F, 0.9017F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r311 = leftHand.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftHand.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(73, 108).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.4391F, 0.0748F, 0.1578F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4802F, 7.3165F, -11.311F, 0.0045F, 0.1144F, 0.709F));

		PartDefinition cube_r313 = rightArm1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(122, 94).addBox(-0.5F, -0.8F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0477F, -0.3832F, 1.0677F, -0.7581F, 0.7676F, -0.1498F));

		PartDefinition cube_r314 = rightArm1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(41, 141).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.023F, -1.0492F, 0.1714F, 0.5072F, 0.7676F, -0.1498F));

		PartDefinition cube_r315 = rightArm1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(53, 111).addBox(-0.5F, -1.7F, -0.975F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.1473F, 0.7676F, -0.1498F));

		PartDefinition cube_r316 = rightArm1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(122, 59).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r317 = rightArm1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(122, 68).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0774F, 0.354F, 1.2291F, 0.0307F, 0.0797F, 0.032F));

		PartDefinition cube_r318 = rightArm1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(141, 37).addBox(-0.5F, 0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(141, 34).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightArm1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(140, 139).addBox(-0.5F, 0.55F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 136).addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(64, 135).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, 1.8087F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(122, 98).addBox(-0.2F, -0.4307F, 0.1266F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 98).addBox(-0.2F, 0.5693F, -0.9734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2749F, 6.1941F, 0.9655F, -1.0499F, 0.63F, -0.3092F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.095F, 3.6959F, 0.9017F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r321 = rightHand.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(28, 88).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r322 = rightHand.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(108, 95).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.3142F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0286F, 2.4565F, -7.6792F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r323 = bone2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(120, 74).addBox(-0.5F, -0.55F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1559F, -3.7822F, 0.8459F, 0.624F, -0.0172F, -0.0029F));

		PartDefinition cube_r324 = bone2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(136, 38).addBox(-0.5F, -0.15F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1493F, -4.3077F, 1.1389F, -0.6937F, -0.0172F, -0.0029F));

		PartDefinition cube_r325 = bone2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(46, 141).addBox(-0.1914F, -3.8624F, 2.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, -0.1701F, -0.0172F, -0.0029F));

		PartDefinition cube_r326 = bone2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(95, 59).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1942F, -1.8707F, -2.3698F, 0.7287F, -0.0041F, -0.017F));

		PartDefinition cube_r327 = bone2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(130, 90).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5891F, 1.7612F, -4.1827F, 0.0145F, 0.2395F, 0.2828F));

		PartDefinition cube_r328 = bone2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(126, 22).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8225F, 1.2917F, -5.6373F, 1.0181F, 0.2395F, 0.2828F));

		PartDefinition cube_r329 = bone2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(70, 120).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4766F, 0.5863F, -5.0833F, -0.0291F, 0.2395F, 0.2828F));

		PartDefinition cube_r330 = bone2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(136, 35).addBox(0.3984F, 1.5402F, -3.8812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(16, 136).addBox(0.3984F, 0.7402F, -3.1812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, 0.32F, 0.2395F, 0.2828F));

		PartDefinition cube_r331 = bone2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(120, 64).addBox(-0.5F, -0.275F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8007F, 0.7364F, -6.1861F, 1.3672F, 0.2395F, 0.2828F));

		PartDefinition cube_r332 = bone2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(120, 46).addBox(-0.2047F, -0.4524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, 0.925F, -0.0017F, -0.0174F));

		PartDefinition cube_r333 = bone2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(119, 23).addBox(-0.2047F, -0.4524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, 0.7941F, -0.0017F, -0.0174F));

		PartDefinition cube_r334 = bone2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(119, 16).addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0804F, 0.3257F, -3.8229F, 0.9745F, 0.2395F, 0.2828F));

		PartDefinition cube_r335 = bone2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(118, 90).addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0804F, 0.3257F, -3.8229F, 0.669F, 0.2395F, 0.2828F));

		PartDefinition cube_r336 = bone2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(55, 99).addBox(-1.0F, -0.475F, -2.4F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7819F, 3.2781F, -4.2873F, -0.568F, 0.5549F, 0.6721F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0286F, 2.4565F, -7.6792F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r337 = bone4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(120, 74).mirror().addBox(-0.5F, -0.55F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1559F, -3.7822F, 0.8459F, 0.624F, 0.0172F, 0.0029F));

		PartDefinition cube_r338 = bone4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(136, 38).mirror().addBox(-0.5F, -0.15F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1493F, -4.3077F, 1.1389F, -0.6937F, 0.0172F, 0.0029F));

		PartDefinition cube_r339 = bone4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(46, 141).mirror().addBox(-0.8086F, -3.8624F, 2.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, -0.1701F, 0.0172F, 0.0029F));

		PartDefinition cube_r340 = bone4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(95, 59).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1942F, -1.8707F, -2.3698F, 0.7287F, 0.0041F, 0.017F));

		PartDefinition cube_r341 = bone4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(130, 90).mirror().addBox(-0.5F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5891F, 1.7612F, -4.1827F, 0.0145F, -0.2395F, -0.2828F));

		PartDefinition cube_r342 = bone4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(126, 22).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8225F, 1.2917F, -5.6373F, 1.0181F, -0.2395F, -0.2828F));

		PartDefinition cube_r343 = bone4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(70, 120).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4766F, 0.5863F, -5.0833F, -0.0291F, -0.2395F, -0.2828F));

		PartDefinition cube_r344 = bone4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(136, 35).mirror().addBox(-1.3984F, 1.5402F, -3.8812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(16, 136).mirror().addBox(-1.3984F, 0.7402F, -3.1812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, 0.32F, -0.2395F, -0.2828F));

		PartDefinition cube_r345 = bone4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(120, 64).mirror().addBox(-0.5F, -0.275F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 0.7364F, -6.1861F, 1.3672F, -0.2395F, -0.2828F));

		PartDefinition cube_r346 = bone4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(120, 46).mirror().addBox(-0.7953F, -0.4524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, 0.925F, 0.0017F, 0.0174F));

		PartDefinition cube_r347 = bone4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(119, 23).mirror().addBox(-0.7953F, -0.4524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, 0.7941F, 0.0017F, 0.0174F));

		PartDefinition cube_r348 = bone4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(119, 16).mirror().addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0804F, 0.3257F, -3.8229F, 0.9745F, -0.2395F, -0.2828F));

		PartDefinition cube_r349 = bone4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(118, 90).mirror().addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0804F, 0.3257F, -3.8229F, 0.669F, -0.2395F, -0.2828F));

		PartDefinition cube_r350 = bone4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(55, 99).mirror().addBox(0.0F, -0.475F, -2.4F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7819F, 3.2781F, -4.2873F, -0.568F, -0.5549F, -0.6721F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0302F, -8.7672F, -0.2273F, 0.1256F, 0.1495F));

		PartDefinition cube_r351 = neck1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(14, 128).addBox(0.0F, -4.1459F, -0.016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3256F, -2.8971F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r352 = neck1.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(17, 124).addBox(0.0F, -5.5459F, -0.016F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -0.8666F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r353 = neck1.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(94, 34).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.0743F, 0.7203F, -1.5282F));

		PartDefinition cube_r354 = neck1.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(130, 121).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.5058F, 0.5418F, -0.8195F));

		PartDefinition cube_r355 = neck1.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(130, 119).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.6703F, 0.2962F, -0.4226F));

		PartDefinition cube_r356 = neck1.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(130, 117).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.6049F, 0.2275F, -0.3455F));

		PartDefinition cube_r357 = neck1.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(130, 115).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.4697F, 0.454F, -0.7426F));

		PartDefinition cube_r358 = neck1.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(92, 7).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.1143F, 0.6323F, -1.409F));

		PartDefinition cube_r359 = neck1.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(94, 34).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.0743F, -0.7203F, 1.5282F));

		PartDefinition cube_r360 = neck1.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(130, 121).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.5058F, -0.5418F, 0.8195F));

		PartDefinition cube_r361 = neck1.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(130, 119).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.6703F, -0.2962F, 0.4226F));

		PartDefinition cube_r362 = neck1.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(130, 117).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.6049F, -0.2275F, 0.3455F));

		PartDefinition cube_r363 = neck1.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(130, 115).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.4697F, -0.454F, 0.7426F));

		PartDefinition cube_r364 = neck1.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(92, 7).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.1143F, -0.6323F, 1.409F));

		PartDefinition cube_r365 = neck1.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(101, 19).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r366 = neck2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(28, 83).addBox(0.0F, -3.0816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -1.7163F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r367 = neck2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(119, 57).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -1.5629F, -0.0877F, 0.414F, -1.5444F));

		PartDefinition cube_r368 = neck2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(130, 123).mirror().addBox(-1.9081F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -1.5629F, 0.1064F, 0.4098F, -1.0675F));

		PartDefinition cube_r369 = neck2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(119, 57).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -1.5629F, -0.0877F, -0.414F, 1.5444F));

		PartDefinition cube_r370 = neck2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(130, 123).addBox(-0.0919F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -1.5629F, 0.1064F, -0.4098F, 1.0675F));

		PartDefinition cube_r371 = neck2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(84, 104).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3605F, -2.3471F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r372 = neck5.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(99, 53).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r373 = neck5.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(124, 39).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, -0.2198F, 0.7554F, -1.6322F));

		PartDefinition cube_r374 = neck5.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(124, 37).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, 0.2025F, 0.7593F, -1.0274F));

		PartDefinition cube_r375 = neck5.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(130, 127).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1653F, -0.9743F, 0.2025F, 0.7593F, -1.0274F));

		PartDefinition cube_r376 = neck5.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(130, 125).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1653F, -0.9743F, -0.2198F, 0.7554F, -1.6322F));

		PartDefinition cube_r377 = neck5.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(124, 39).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, -0.2198F, -0.7554F, 1.6322F));

		PartDefinition cube_r378 = neck5.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(124, 37).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, 0.2025F, -0.7593F, 1.0274F));

		PartDefinition cube_r379 = neck5.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(130, 127).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1653F, -0.9743F, 0.2025F, -0.7593F, 1.0274F));

		PartDefinition cube_r380 = neck5.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(130, 125).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1653F, -0.9743F, -0.2198F, -0.7554F, 1.6322F));

		PartDefinition cube_r381 = neck5.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(51, 141).addBox(0.0F, -2.3566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r382 = neck5.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(114, 140).addBox(0.0F, -2.4566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r383 = neck4.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(131, 25).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1499F, 1.0891F, -1.5603F));

		PartDefinition cube_r384 = neck4.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(131, 23).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.5977F, 0.9835F, -0.706F));

		PartDefinition cube_r385 = neck4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(131, 21).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1503F, 1.0717F, -1.5606F));

		PartDefinition cube_r386 = neck4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(130, 129).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.5741F, 0.972F, -0.7256F));

		PartDefinition cube_r387 = neck4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(131, 25).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1499F, -1.0891F, 1.5603F));

		PartDefinition cube_r388 = neck4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(131, 23).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.5977F, -0.9835F, 0.706F));

		PartDefinition cube_r389 = neck4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(131, 21).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1503F, -1.0717F, 1.5606F));

		PartDefinition cube_r390 = neck4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(130, 129).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.5741F, -0.972F, 0.7256F));

		PartDefinition cube_r391 = neck4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(68, 141).addBox(0.0F, -1.4677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9211F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r392 = neck4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(42, 136).addBox(0.0F, -1.3677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r393 = neck4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(125, 90).addBox(-0.5F, 1.4F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(88, 52).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4933F, -3.699F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r394 = neck3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(108, 57).mirror().addBox(-3.8424F, 0.0285F, -0.5847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6534F, -1.6609F, 0.1888F, 0.7442F, -1.2191F));

		PartDefinition cube_r395 = neck3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(54, 38).mirror().addBox(-3.8512F, 0.0441F, -0.5366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.5401F, -3.5326F, 0.2757F, 0.7351F, -1.2294F));

		PartDefinition cube_r396 = neck3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(108, 57).addBox(-0.1576F, 0.0285F, -0.5847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.6534F, -1.6609F, 0.1888F, -0.7442F, 1.2191F));

		PartDefinition cube_r397 = neck3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(54, 38).addBox(-0.1487F, 0.0441F, -0.5366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.5401F, -3.5326F, 0.2757F, -0.7351F, 1.2294F));

		PartDefinition cube_r398 = neck3.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(104, 141).addBox(0.5F, -1.6458F, -0.2223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6175F, -2.9228F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r399 = neck3.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(101, 141).addBox(0.5F, -1.269F, -0.9772F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3795F, -0.4528F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r400 = neck3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(44, 89).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7216F, -3.4653F, -0.5328F, 0.2942F, 0.1551F));

		PartDefinition cube_r401 = neck.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(45, 136).addBox(0.5F, -2.0207F, -0.1014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r402 = neck.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(44, 102).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r403 = neck.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(108, 102).mirror().addBox(-3.9539F, 0.0429F, -0.6339F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1099F, -1.5657F, 0.7598F, 1.2477F, -0.8047F));

		PartDefinition cube_r404 = neck.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(108, 102).addBox(-0.0461F, 0.0429F, -0.6339F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1099F, -1.5657F, 0.7598F, -1.2477F, 0.8047F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2688F, -2.783F, 0.1882F, 0.188F, -0.0519F));

		PartDefinition cube_r405 = neck6.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(57, 136).addBox(0.5F, -2.5207F, -0.3013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7433F, -2.7066F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r406 = neck6.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(54, 136).addBox(0.5F, -2.2207F, -0.6014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9797F, -0.3648F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r407 = neck6.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(75, 102).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r408 = neck6.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(110, 21).mirror().addBox(-4.0319F, -0.0281F, -0.4951F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0916F, -0.7067F, 0.4849F, 1.0116F, -1.1053F));

		PartDefinition cube_r409 = neck6.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(119, 108).mirror().addBox(-2.9686F, 0.0576F, -0.5257F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3381F, -2.3727F, 0.5261F, 1.1485F, -1.0288F));

		PartDefinition cube_r410 = neck6.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(110, 21).addBox(0.0319F, -0.0281F, -0.4951F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0916F, -0.7067F, 0.4849F, -1.0116F, 1.1053F));

		PartDefinition cube_r411 = neck6.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(119, 108).addBox(-0.0314F, 0.0576F, -0.5257F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3381F, -2.3727F, 0.5261F, -1.1485F, 1.0288F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1684F, -2.5598F, 0.325F, 0.1663F, -0.081F));

		PartDefinition cube_r412 = neck7.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(85, 137).addBox(0.5F, -2.5207F, -0.8013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.824F, -3.1842F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r413 = neck7.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(60, 136).addBox(0.5F, -2.7207F, -0.8013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8716F, -1.1823F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r414 = neck7.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(80, 89).addBox(0.0F, 1.3815F, -4.2683F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r415 = neck7.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(122, 54).mirror().addBox(-2.9048F, 0.02F, -0.5654F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1766F, -1.424F, 0.4489F, 1.0383F, -1.0462F));

		PartDefinition cube_r416 = neck7.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(120, 78).mirror().addBox(-2.9099F, 0.04F, -0.5911F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6153F, 0.4615F, -3.5976F, 0.5908F, 1.2063F, -0.9344F));

		PartDefinition cube_r417 = neck7.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(122, 54).addBox(-0.0952F, 0.02F, -0.5654F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1766F, -1.424F, 0.4489F, -1.0383F, 1.0462F));

		PartDefinition cube_r418 = neck7.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(120, 78).addBox(-0.0901F, 0.04F, -0.5911F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6153F, 0.4615F, -3.5976F, 0.5908F, -1.2063F, 0.9344F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5926F, -3.9497F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r419 = neck8.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(103, 136).addBox(0.5F, -2.7457F, -0.0013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1372F, -1.9884F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r420 = neck8.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(103, 0).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r421 = neck8.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(120, 80).mirror().addBox(-2.9984F, 0.1486F, -0.8226F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.863F, -1.604F, 0.5208F, 0.9409F, -1.0649F));

		PartDefinition cube_r422 = neck8.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(120, 80).addBox(-0.0016F, 0.1486F, -0.8226F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.863F, -1.604F, 0.5208F, -0.9409F, 1.0649F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2652F, -2.9924F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r423 = neck9.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(93, 139).addBox(0.5F, -2.9207F, -0.3263F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6644F, -4.798F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r424 = neck9.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(137, 96).addBox(0.5F, -2.4207F, -0.0263F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2232F, -2.7571F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r425 = neck9.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(137, 59).addBox(0.5F, -2.8207F, -0.0013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1397F, -1.0829F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r426 = neck9.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(82, 62).addBox(0.0F, 1.3815F, -5.2683F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r427 = neck9.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(99, 134).mirror().addBox(-2.0213F, 0.0829F, -0.5159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.4322F, -4.6198F, 0.5433F, 1.1704F, -0.9957F));

		PartDefinition cube_r428 = neck9.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(133, 17).mirror().addBox(-1.9729F, 0.0704F, -0.4218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.2768F, -2.9151F, 0.5049F, 1.1335F, -1.0481F));

		PartDefinition cube_r429 = neck9.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(121, 20).mirror().addBox(-2.9242F, 0.058F, -0.3278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.3291F, -0.9158F, 0.5176F, 1.0834F, -1.0438F));

		PartDefinition cube_r430 = neck9.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(99, 134).addBox(0.0213F, 0.0829F, -0.5159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.4322F, -4.6198F, 0.5433F, -1.1704F, 0.9957F));

		PartDefinition cube_r431 = neck9.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(133, 17).addBox(-0.0271F, 0.0704F, -0.4218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.2768F, -2.9151F, 0.5049F, -1.1335F, 1.0481F));

		PartDefinition cube_r432 = neck9.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(121, 20).addBox(-0.0758F, 0.058F, -0.3278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.3291F, -0.9158F, 0.5176F, -1.0834F, 1.0438F));

		PartDefinition head = neck9.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7383F, -5.243F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(3, 133).addBox(-0.5F, -1.15F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.0011F, 8.8717F, -16.0847F, 0.4625F, 0.0008F, -0.0028F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(122, 132).addBox(-0.5F, -1.9725F, 0.5779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -0.6261F, -2.1602F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(121, 82).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.2893F, -1.229F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -1.125F, -8.45F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.4514F, -5.2129F, 0.4225F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(137, 56).addBox(-0.5F, -2.1207F, -0.4697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -0.6261F, -2.1602F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(35, 107).addBox(-0.5F, -0.05F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.8215F, -11.2871F, 0.5609F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(138, 11).addBox(-0.503F, -1.7976F, -0.6522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(137, 53).addBox(-0.503F, -1.3976F, -0.6522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, 7.1206F, -16.7727F, -2.9473F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(137, 45).addBox(-0.503F, -0.8227F, -0.1848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 7.1206F, -16.7727F, -1.6557F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(36, 137).addBox(-0.503F, 0.1269F, -0.6173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, 6.6206F, -15.8727F, -0.6172F, 0.0F, 0.0F));

		PartDefinition cube_r442 = head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(64, 97).addBox(-0.5F, -0.2579F, -2.8051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.8282F, -10.2965F, 0.4998F, 0.0F, 0.0F));

		PartDefinition cube_r443 = head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(84, 38).addBox(-0.5F, -0.2079F, -0.8051F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.3056F, -15.9014F, 0.6045F, 0.0F, 0.0F));

		PartDefinition cube_r444 = head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(112, 0).addBox(-0.5F, -1.8087F, -2.1836F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, -1.1007F, -5.7683F, 2.4982F, 0.0F, 0.0F));

		PartDefinition cube_r445 = head.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(133, 27).addBox(-0.5F, -1.7746F, -0.177F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.8112F, -5.4245F, -2.86F, 0.0F, 0.0F));

		PartDefinition cube_r446 = head.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(31, 137).addBox(-0.5F, -0.0246F, -0.927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, -1.1007F, -5.7683F, 2.8821F, 0.0F, 0.0F));

		PartDefinition cube_r447 = head.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(106, 59).addBox(-0.5F, -0.75F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 3.1624F, -2.2934F, 0.6263F, 0.0F, 0.0F));

		PartDefinition cube_r448 = head.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(77, 121).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.7525F, -3.043F, -0.1416F, 0.0F, 0.0F));

		PartDefinition cube_r449 = head.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(58, 121).addBox(-0.5F, -0.6068F, -1.3196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.6007F, -5.6683F, 0.9928F, 0.0F, 0.0F));

		PartDefinition cube_r450 = head.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(53, 72).addBox(-0.5F, -0.5386F, -4.1626F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 0.8993F, -7.2683F, 0.6787F, 0.0F, 0.0F));

		PartDefinition cube_r451 = head.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(0, 40).addBox(-0.9404F, 0.05F, -10.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -1.0378F, -4.4095F, 0.587F, 0.0F, 0.0F));

		PartDefinition cube_r452 = head.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(117, 132).addBox(-1.0F, -0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.514F, -1.3695F, -3.4708F, 0.4125F, 0.0F, 0.0F));

		PartDefinition cube_r453 = head.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(112, 28).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1439F, -0.541F, -0.5649F, 0.0F, 0.0F));

		PartDefinition cube_r454 = head.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(110, 16).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1439F, -0.541F, -0.2158F, 0.0F, 0.0F));

		PartDefinition cube_r455 = head.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(132, 102).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5742F, -2.5089F, 0.2031F, 0.0F, 0.0F));

		PartDefinition cube_r456 = head.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(100, 89).addBox(-2.0F, -0.525F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, -0.0863F, -1.6601F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.626F, 1.2098F, -0.4129F, 0.0F, -0.0087F, -0.001F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(133, 31).addBox(-0.5104F, -0.1745F, -0.7836F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, 2.8375F, 0.232F, -0.1337F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(138, 111).addBox(-0.5125F, -0.2243F, 0.2837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, 1.8693F, 0.2311F, -0.1318F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(130, 138).addBox(-0.5104F, -0.1495F, -0.773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(139, 6).addBox(-0.5104F, -0.8495F, -0.773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, -2.6166F, 0.232F, -0.1337F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(141, 74).addBox(-0.5125F, -1.0042F, -0.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(88, 141).addBox(-0.5125F, -1.0042F, -0.3009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, 1.0839F, 0.2311F, -0.1318F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(138, 130).addBox(-0.5125F, -1.0153F, -0.7897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, 1.3283F, 0.2311F, -0.1318F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(138, 133).addBox(-0.5125F, -1.1371F, -1.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, 1.5552F, 0.2311F, -0.1318F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(139, 3).addBox(-0.5104F, 0.4848F, 0.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, 2.2703F, 0.232F, -0.1337F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(32, 133).addBox(-0.5125F, -1.6425F, -0.4305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, -3.1398F, 0.2311F, -0.1318F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(141, 91).addBox(-0.5104F, -1.0866F, -0.3039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, -2.0581F, 0.232F, -0.1337F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(37, 133).addBox(-0.5311F, -1.6482F, -0.6034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, -2.7936F, 0.2391F, -0.1431F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(16, 139).addBox(-0.5125F, -1.6302F, -0.611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1873F, -0.0671F, -0.6032F, 2.5675F, 0.2311F, -0.1318F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(133, 81).addBox(-0.929F, -0.9774F, 2.5045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5439F, -0.2869F, 0.4948F, 3.1411F, 0.2484F, -0.1324F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(83, 133).addBox(-0.929F, -2.077F, 2.1736F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.5439F, -0.2869F, 0.4948F, 2.8618F, 0.2484F, -0.1324F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(128, 31).addBox(-0.929F, -2.1747F, 1.8054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.5439F, -0.2869F, 0.4948F, 2.4953F, 0.2484F, -0.1324F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(139, 41).addBox(-0.929F, -0.219F, -3.8401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5439F, -0.2869F, 0.4948F, -0.5416F, 0.2484F, -0.1324F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(139, 48).addBox(-0.929F, 2.3145F, -2.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.5439F, -0.2869F, 0.4948F, -1.3794F, 0.2484F, -0.1324F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(63, 139).addBox(-0.879F, -2.1263F, -2.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(72, 139).addBox(-1.054F, -2.1263F, -2.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 122).addBox(-0.929F, -2.4763F, -3.0154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.5439F, -0.2869F, 0.4948F, 0.1216F, 0.2484F, -0.1324F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(77, 139).addBox(-0.929F, -0.1305F, 1.8046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.5439F, -0.2869F, 0.4948F, 2.6698F, 0.2484F, -0.1324F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(99, 83).addBox(-0.5F, -0.9F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3689F, -0.5114F, -0.2683F, -1.5738F, 0.2288F, -0.1235F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(92, 0).addBox(-0.425F, -0.825F, -2.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.3457F, -0.3302F, -4.5716F, 0.7144F, 0.1454F, -0.1094F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(29, 27).addBox(-1.4162F, -0.0794F, -10.0621F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5512F, 0.1F, -6.5264F, 0.5167F, 0.0685F, -0.0736F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(53, 106).addBox(-0.5F, -0.3194F, -1.6278F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.226F, 1.3233F, -1.7911F, -0.6652F, 0.1309F, -0.1309F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(26, 106).addBox(-0.5F, -0.9792F, -1.8796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.226F, 1.3233F, -1.7911F, -1.2761F, 0.1309F, -0.1309F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(5, 106).addBox(-0.5F, 0.0858F, -1.6748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.226F, 1.3233F, -1.7911F, -0.3162F, 0.1309F, -0.1309F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(132, 98).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0953F, 1.2534F, -0.2151F, 1.2953F, 0.2325F, -0.1456F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(113, 64).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1375F, -2.0134F, -2.5689F, -2.8875F, 0.2027F, -0.1165F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(128, 27).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1179F, -1.3907F, 0.6593F, -2.2128F, 0.2325F, -0.1456F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(26, 137).addBox(-0.6805F, 0.0678F, -0.3376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8872F, -2.3418F, -1.3942F, -1.4869F, 0.0737F, 1.1293F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(21, 137).addBox(-0.3602F, 0.0677F, -0.6608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8872F, -2.3418F, -1.3942F, -1.5637F, 0.1114F, 0.3412F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(78, 132).addBox(-0.6213F, -1.5677F, -0.3319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8872F, -2.3418F, -1.3942F, -1.5486F, 0.3135F, 1.1208F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(73, 132).addBox(-0.3298F, -1.5677F, -0.608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8872F, -2.3418F, -1.3942F, -1.7729F, 0.2423F, 0.3421F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(106, 134).addBox(-1.4849F, -6.3092F, -3.94F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -1.4972F, 0.2325F, -0.1456F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(8, 137).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(3, 137).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.076F, -3.531F, -0.6163F, -0.5579F, -0.4395F, 0.6025F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(132, 58).addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.072F, -0.8467F, -3.9517F, -0.949F, 0.1567F, -0.1553F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(121, 27).addBox(-0.5F, -0.2F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.953F, 0.9146F, -4.7287F, -2.1133F, 0.1526F, -0.1313F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(137, 0).addBox(-0.5F, 0.3078F, 0.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.1014F, -0.0461F, -4.8677F, -0.8915F, 0.1526F, -0.1313F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(135, 136).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(-0.9855F, 1.3321F, -5.2931F, 0.0946F, 0.1526F, -0.1313F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(122, 136).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.2445F, 0.5509F, -6.2978F, 1.2378F, 0.1526F, -0.1313F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(132, 54).addBox(-0.5F, -1.6885F, -0.3212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-1.1014F, -0.0461F, -4.8677F, 2.2762F, 0.1526F, -0.1313F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(54, 141).addBox(-0.6104F, -0.8812F, -0.91F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.1014F, -0.5461F, -5.1677F, -2.7019F, 0.148F, -0.1606F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(97, 98).addBox(-0.5F, -0.45F, -1.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4064F, 1.8788F, -8.1363F, 0.4984F, 0.1027F, -0.1587F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(138, 22).addBox(-0.4821F, -0.3118F, -0.9184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(138, 82).addBox(-0.4821F, -0.3118F, -0.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(138, 85).addBox(-0.4821F, -0.3118F, -0.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1194F, 3.7443F, -11.5414F, 0.1775F, 0.0904F, -0.1927F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(138, 25).addBox(-0.5821F, -0.5592F, -0.4777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1194F, 3.7443F, -11.5414F, -1.1839F, 0.0904F, -0.1927F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(138, 28).addBox(-0.4821F, -1.2442F, -0.5961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(138, 31).addBox(-0.4821F, -1.0442F, -0.5961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.1194F, 3.7443F, -11.5414F, -1.2362F, 0.0904F, -0.1927F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(48, 138).addBox(-0.4821F, -0.7746F, -0.2263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1194F, 3.7443F, -11.5414F, -0.9221F, 0.0904F, -0.1927F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(138, 79).addBox(-0.4821F, -1.0658F, -0.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.1194F, 3.7443F, -11.5414F, -0.7126F, 0.0904F, -0.1927F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(88, 138).addBox(-0.4821F, -0.3723F, 0.2415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(106, 138).addBox(-0.4821F, -0.3723F, -0.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.1194F, 3.7443F, -11.5414F, -2.5103F, 0.0904F, -0.1927F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(0, 72).addBox(-0.9935F, -0.1957F, -6.6587F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.988F, 2.2123F, -9.4439F, 0.4759F, 0.1019F, -0.1746F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(138, 19).addBox(-0.9812F, -0.9541F, -0.936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8532F, 5.8084F, -14.8708F, 0.6377F, 0.1957F, -0.0431F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(117, 136).addBox(-0.9812F, -1.2577F, -1.1969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.8532F, 5.8084F, -14.8708F, 1.1613F, 0.1957F, -0.0431F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(138, 14).addBox(-0.9812F, -0.2892F, -1.4156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.8532F, 5.8084F, -14.8708F, 0.6814F, 0.1957F, -0.0431F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(136, 108).addBox(-0.9812F, -1.6383F, -1.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8532F, 5.8084F, -14.8708F, 1.65F, 0.1957F, -0.0431F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(126, 110).addBox(-1.1264F, -2.9018F, -0.2088F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5978F, 5.249F, -12.6449F, 2.0416F, 0.1542F, -0.1629F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(98, 136).addBox(-0.4741F, -1.4248F, -5.0257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 45).addBox(-0.4989F, -1.2274F, -5.426F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 131).addBox(-0.4491F, -0.7998F, -0.5007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 131).addBox(-0.4491F, -0.6498F, -1.3007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1947F, 4.6324F, -10.7019F, 0.5189F, 0.0717F, -0.0856F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(44, 132).addBox(-0.4491F, -1.6569F, -4.6118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1947F, 4.6324F, -10.7019F, 0.5101F, 0.0717F, -0.0856F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(17, 132).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.284F, 5.523F, -13.71F, 0.3618F, 0.0717F, -0.0856F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(132, 0).addBox(-0.4491F, -0.8653F, -0.4457F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2613F, 5.6129F, -12.791F, 0.3443F, 0.0717F, -0.0856F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(136, 93).addBox(-0.7562F, 0.0588F, 4.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1947F, 4.6324F, -10.7019F, 0.5108F, 0.1566F, -0.1474F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(77, 136).addBox(-0.6788F, 0.062F, 3.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(136, 76).addBox(-0.6788F, 0.062F, 2.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 136).addBox(-0.6788F, 0.062F, 1.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1947F, 4.6324F, -10.7019F, 0.5109F, 0.1393F, -0.1499F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(130, 131).addBox(-0.4491F, -0.6936F, 1.0464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1947F, 4.6324F, -10.7019F, 0.6498F, 0.0717F, -0.0856F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(131, 109).addBox(-0.4491F, -0.8316F, 0.2614F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1947F, 4.6324F, -10.7019F, 0.6061F, 0.0717F, -0.0856F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(131, 37).addBox(-0.468F, -0.5701F, -2.0323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1947F, 4.6324F, -10.7019F, 0.3877F, 0.0691F, -0.0992F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(95, 120).addBox(-0.5F, -1.15F, -2.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.067F, 5.382F, -10.8569F, 0.2096F, 0.098F, -0.1766F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(44, 96).addBox(-1.3018F, -1.1732F, 0.0259F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.303F, 5.3309F, -11.3097F, 0.4714F, 0.098F, -0.1766F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(23, 52).addBox(-1.2839F, -1.5798F, -6.2233F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.4216F, 0.1135F, -0.1687F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(81, 72).addBox(-0.5F, -2.1F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6823F, 0.7467F, -2.3575F, 0.0038F, 0.2325F, -0.1456F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.626F, 1.2098F, -0.4129F, 0.0F, 0.0087F, 0.001F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(133, 31).mirror().addBox(-0.4896F, -0.1745F, -0.7836F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, 2.8375F, -0.232F, 0.1337F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(138, 111).mirror().addBox(-0.4875F, -0.2243F, 0.2837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, 1.8693F, -0.2311F, 0.1318F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(130, 138).mirror().addBox(-0.4896F, -0.1495F, -0.773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(139, 6).mirror().addBox(-0.4896F, -0.8495F, -0.773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, -2.6166F, -0.232F, 0.1337F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(141, 74).mirror().addBox(-0.4875F, -1.0042F, -0.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(88, 141).mirror().addBox(-0.4875F, -1.0042F, -0.3009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, 1.0839F, -0.2311F, 0.1318F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(138, 130).mirror().addBox(-0.4875F, -1.0153F, -0.7897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, 1.3283F, -0.2311F, 0.1318F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(138, 133).mirror().addBox(-0.4875F, -1.1371F, -1.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, 1.5552F, -0.2311F, 0.1318F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(139, 3).mirror().addBox(-0.4896F, 0.4848F, 0.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, 2.2703F, -0.232F, 0.1337F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(32, 133).mirror().addBox(-0.4875F, -1.6425F, -0.4305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, -3.1398F, -0.2311F, 0.1318F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(141, 91).mirror().addBox(-0.4896F, -1.0866F, -0.3039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, -2.0581F, -0.232F, 0.1337F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(37, 133).mirror().addBox(-0.4689F, -1.6482F, -0.6034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, -2.7936F, -0.2391F, 0.1431F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(16, 139).mirror().addBox(-0.4875F, -1.6302F, -0.611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1873F, -0.0671F, -0.6032F, 2.5675F, -0.2311F, 0.1318F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(133, 81).mirror().addBox(-0.071F, -0.9774F, 2.5045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5439F, -0.2869F, 0.4948F, 3.1411F, -0.2484F, 0.1324F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(83, 133).mirror().addBox(-0.071F, -2.077F, 2.1736F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.5439F, -0.2869F, 0.4948F, 2.8618F, -0.2484F, 0.1324F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(128, 31).mirror().addBox(-0.071F, -2.1747F, 1.8054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.5439F, -0.2869F, 0.4948F, 2.4953F, -0.2484F, 0.1324F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(139, 41).mirror().addBox(-0.071F, -0.219F, -3.8401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5439F, -0.2869F, 0.4948F, -0.5416F, -0.2484F, 0.1324F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(139, 48).mirror().addBox(-0.071F, 2.3145F, -2.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.5439F, -0.2869F, 0.4948F, -1.3794F, -0.2484F, 0.1324F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(63, 139).mirror().addBox(-0.121F, -2.1263F, -2.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(72, 139).mirror().addBox(0.054F, -2.1263F, -2.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 122).mirror().addBox(-0.071F, -2.4763F, -3.0154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.5439F, -0.2869F, 0.4948F, 0.1216F, -0.2484F, 0.1324F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(77, 139).mirror().addBox(-0.071F, -0.1305F, 1.8046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.5439F, -0.2869F, 0.4948F, 2.6698F, -0.2484F, 0.1324F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(99, 83).mirror().addBox(-0.5F, -0.9F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3689F, -0.5114F, -0.2683F, -1.5738F, -0.2288F, 0.1235F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.575F, -0.825F, -2.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.3457F, -0.3302F, -4.5716F, 0.7144F, -0.1454F, 0.1094F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(29, 27).mirror().addBox(0.4162F, -0.0794F, -10.0621F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5512F, 0.1F, -6.5264F, 0.5167F, -0.0685F, 0.0736F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(53, 106).mirror().addBox(-0.5F, -0.3194F, -1.6278F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.226F, 1.3233F, -1.7911F, -0.6652F, -0.1309F, 0.1309F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(26, 106).mirror().addBox(-0.5F, -0.9792F, -1.8796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.226F, 1.3233F, -1.7911F, -1.2761F, -0.1309F, 0.1309F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(5, 106).mirror().addBox(-0.5F, 0.0858F, -1.6748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.226F, 1.3233F, -1.7911F, -0.3162F, -0.1309F, 0.1309F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(132, 98).mirror().addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0953F, 1.2534F, -0.2151F, 1.2953F, -0.2325F, 0.1456F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(113, 64).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.1375F, -2.0134F, -2.5689F, -2.8875F, -0.2027F, 0.1165F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(128, 27).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1179F, -1.3907F, 0.6593F, -2.2128F, -0.2325F, 0.1456F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(26, 137).mirror().addBox(-0.3195F, 0.0678F, -0.3376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.8872F, -2.3418F, -1.3942F, -1.4869F, -0.0737F, -1.1293F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(21, 137).mirror().addBox(-0.6398F, 0.0677F, -0.6608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.8872F, -2.3418F, -1.3942F, -1.5637F, -0.1114F, -0.3412F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(78, 132).mirror().addBox(-0.3787F, -1.5677F, -0.3319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.8872F, -2.3418F, -1.3942F, -1.5486F, -0.3135F, -1.1208F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(73, 132).mirror().addBox(-0.6702F, -1.5677F, -0.608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.8872F, -2.3418F, -1.3942F, -1.7729F, -0.2423F, -0.3421F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(106, 134).mirror().addBox(0.485F, -6.3092F, -3.94F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -1.4972F, -0.2325F, 0.1456F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(8, 137).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(3, 137).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(1.076F, -3.531F, -0.6163F, -0.5579F, 0.4395F, -0.6025F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(132, 58).mirror().addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.072F, -0.8467F, -3.9517F, -0.949F, -0.1567F, 0.1553F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(121, 27).mirror().addBox(-0.5F, -0.2F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.953F, 0.9146F, -4.7287F, -2.1133F, -0.1526F, 0.1313F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(137, 0).mirror().addBox(-0.5F, 0.3078F, 0.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.1014F, -0.0461F, -4.8677F, -0.8915F, -0.1526F, 0.1313F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(135, 136).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(0.9855F, 1.3321F, -5.2931F, 0.0946F, -0.1526F, 0.1313F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(122, 136).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.2445F, 0.5509F, -6.2978F, 1.2378F, -0.1526F, 0.1313F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(132, 54).mirror().addBox(-0.5F, -1.6885F, -0.3212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(1.1014F, -0.0461F, -4.8677F, 2.2762F, -0.1526F, 0.1313F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(54, 141).mirror().addBox(-0.3896F, -0.8812F, -0.91F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.1014F, -0.5461F, -5.1677F, -2.7019F, -0.148F, 0.1606F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(97, 98).mirror().addBox(-0.5F, -0.45F, -1.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4064F, 1.8788F, -8.1363F, 0.4984F, -0.1027F, 0.1587F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(138, 22).mirror().addBox(-0.5179F, -0.3118F, -0.9184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(138, 82).mirror().addBox(-0.5179F, -0.3118F, -0.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(138, 85).mirror().addBox(-0.5179F, -0.3118F, -0.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1194F, 3.7443F, -11.5414F, 0.1775F, -0.0904F, 0.1927F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(138, 25).mirror().addBox(-0.4179F, -0.5592F, -0.4777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.1194F, 3.7443F, -11.5414F, -1.1839F, -0.0904F, 0.1927F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(138, 28).mirror().addBox(-0.5179F, -1.2442F, -0.5961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(138, 31).mirror().addBox(-0.5179F, -1.0442F, -0.5961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(1.1194F, 3.7443F, -11.5414F, -1.2362F, -0.0904F, 0.1927F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(48, 138).mirror().addBox(-0.5179F, -0.7746F, -0.2263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1194F, 3.7443F, -11.5414F, -0.9221F, -0.0904F, 0.1927F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(138, 79).mirror().addBox(-0.5179F, -1.0658F, -0.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.1194F, 3.7443F, -11.5414F, -0.7126F, -0.0904F, 0.1927F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(88, 138).mirror().addBox(-0.5179F, -0.3723F, 0.2415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(106, 138).mirror().addBox(-0.5179F, -0.3723F, -0.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(1.1194F, 3.7443F, -11.5414F, -2.5103F, -0.0904F, 0.1927F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.0065F, -0.1957F, -6.6587F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.988F, 2.2123F, -9.4439F, 0.4759F, -0.1019F, 0.1746F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(138, 19).mirror().addBox(-0.0188F, -0.9541F, -0.936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8532F, 5.8084F, -14.8708F, 0.6377F, -0.1957F, 0.0431F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(117, 136).mirror().addBox(-0.0188F, -1.2577F, -1.1969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.8532F, 5.8084F, -14.8708F, 1.1613F, -0.1957F, 0.0431F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(138, 14).mirror().addBox(-0.0188F, -0.2892F, -1.4156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.8532F, 5.8084F, -14.8708F, 0.6814F, -0.1957F, 0.0431F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(136, 108).mirror().addBox(-0.0188F, -1.6383F, -1.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8532F, 5.8084F, -14.8708F, 1.65F, -0.1957F, 0.0431F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(126, 110).mirror().addBox(0.1264F, -2.9018F, -0.2088F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.5978F, 5.249F, -12.6449F, 2.0416F, -0.1542F, 0.1629F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(98, 136).mirror().addBox(-0.5259F, -1.4248F, -5.0257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 45).mirror().addBox(-0.5011F, -1.2274F, -5.426F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 131).mirror().addBox(-0.5509F, -0.7998F, -0.5007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 131).mirror().addBox(-0.5509F, -0.6498F, -1.3007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1947F, 4.6324F, -10.7019F, 0.5189F, -0.0717F, 0.0856F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(44, 132).mirror().addBox(-0.5509F, -1.6569F, -4.6118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1947F, 4.6324F, -10.7019F, 0.5101F, -0.0717F, 0.0856F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(17, 132).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.284F, 5.523F, -13.71F, 0.3618F, -0.0717F, 0.0856F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(132, 0).mirror().addBox(-0.5509F, -0.8653F, -0.4457F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2613F, 5.6129F, -12.791F, 0.3443F, -0.0717F, 0.0856F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(136, 93).mirror().addBox(-0.2438F, 0.0588F, 4.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1947F, 4.6324F, -10.7019F, 0.5108F, -0.1566F, 0.1474F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(77, 136).mirror().addBox(-0.3212F, 0.062F, 3.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(136, 76).mirror().addBox(-0.3212F, 0.062F, 2.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 136).mirror().addBox(-0.3212F, 0.062F, 1.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1947F, 4.6324F, -10.7019F, 0.5109F, -0.1393F, 0.1499F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(130, 131).mirror().addBox(-0.5509F, -0.6936F, 1.0464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1947F, 4.6324F, -10.7019F, 0.6498F, -0.0717F, 0.0856F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(131, 109).mirror().addBox(-0.5509F, -0.8316F, 0.2614F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1947F, 4.6324F, -10.7019F, 0.6061F, -0.0717F, 0.0856F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(131, 37).mirror().addBox(-0.532F, -0.5701F, -2.0323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1947F, 4.6324F, -10.7019F, 0.3877F, -0.0691F, 0.0992F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(95, 120).mirror().addBox(-0.5F, -1.15F, -2.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(1.067F, 5.382F, -10.8569F, 0.2096F, -0.098F, 0.1766F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(44, 96).mirror().addBox(0.3018F, -1.1732F, 0.0259F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.303F, 5.3309F, -11.3097F, 0.4714F, -0.098F, 0.1766F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(23, 52).mirror().addBox(0.2839F, -1.5798F, -6.2233F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.4216F, -0.1135F, 0.1687F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(81, 72).mirror().addBox(-0.5F, -2.1F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6823F, 0.7467F, -2.3575F, 0.0038F, -0.2325F, 0.1456F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4281F, -0.0929F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(127, 45).mirror().addBox(-0.5872F, -0.4474F, -0.4425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5538F, 0.8986F, 1.1418F, -2.0508F, -0.1745F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(122, 50).mirror().addBox(-0.9496F, 1.4352F, 4.5519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9278F, -3.4233F, 0.5411F, -0.0349F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(108, 80).mirror().addBox(-0.9496F, -0.314F, 2.3317F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9278F, -3.4233F, 0.192F, -0.0349F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(108, 75).mirror().addBox(-0.1684F, -0.8F, -0.1879F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9278F, -3.4233F, 0.0F, -0.3316F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(140, 71).mirror().addBox(-0.9922F, 1.1199F, -6.6192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.1134F, -0.0346F, -0.0076F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(122, 41).mirror().addBox(-0.9922F, 1.5819F, -5.5826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 115).mirror().addBox(-0.9922F, 0.6069F, -3.6326F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.0261F, -0.0346F, -0.0076F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(122, 104).mirror().addBox(-0.9922F, 1.7298F, -1.4525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, -0.0699F, -0.0346F, -0.0076F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(104, 46).mirror().addBox(-0.8981F, 1.3538F, -3.6795F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.473F, -0.6749F, -3.0836F, -0.1576F, -0.122F, 0.0061F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(88, 134).mirror().addBox(-0.9178F, 1.1371F, -1.3858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.473F, -0.6749F, -3.0836F, 0.0524F, -0.1222F, 0.0F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(115, 69).mirror().addBox(-0.5872F, 0.4634F, -4.0761F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.373F, -0.6749F, 0.1164F, 0.1833F, -0.1745F, 0.0F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(115, 59).mirror().addBox(-0.5872F, 0.4676F, -2.1232F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.373F, -0.6749F, 0.1164F, 0.192F, -0.1745F, 0.0F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(140, 68).mirror().addBox(-0.5872F, 1.0263F, 0.4288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.373F, -0.6749F, 0.1164F, 0.1309F, -0.1745F, 0.0F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(134, 49).mirror().addBox(-0.5872F, -1.4819F, 1.4897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-1.373F, -0.6749F, 0.1164F, -1.4748F, -0.1745F, 0.0F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(140, 65).mirror().addBox(-0.9922F, 0.4954F, -8.4209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.2137F, -0.0346F, -0.0076F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(140, 62).mirror().addBox(-0.9922F, 0.0924F, -7.7373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.2661F, -0.0346F, -0.0076F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(140, 59).mirror().addBox(-0.9922F, -4.5527F, 7.2395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 2.9714F, -0.0346F, -0.0076F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(36, 140).mirror().addBox(-0.9922F, 4.8591F, 7.0488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, -2.2646F, -0.0346F, -0.0076F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(31, 140).mirror().addBox(-0.9922F, 8.1629F, 0.4394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, -1.4356F, -0.0346F, -0.0076F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(26, 140).mirror().addBox(-0.9922F, 2.9556F, -7.6424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, -0.179F, -0.0346F, -0.0076F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(21, 140).mirror().addBox(-0.9922F, 1.1026F, -7.453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.0828F, -0.0346F, -0.0076F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(86, 45).mirror().addBox(-1.0072F, -0.3285F, -6.9035F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.301F, -0.0346F, -0.0076F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(49, 134).mirror().addBox(-0.9922F, -2.0675F, -9.4649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.3054F, -0.0346F, -0.0076F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(134, 41).mirror().addBox(-0.9922F, -0.1774F, -8.6398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.0785F, -0.0346F, -0.0076F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(10, 140).mirror().addBox(-0.9922F, 1.4665F, -7.6493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, -0.0437F, -0.0346F, -0.0076F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(5, 140).mirror().addBox(-0.9922F, -0.4557F, -7.109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 85).mirror().addBox(-0.9922F, -0.8447F, -4.7018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.2181F, -0.0346F, -0.0076F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-0.9922F, -0.6127F, -6.3318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.2268F, -0.0346F, -0.0076F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(134, 4).mirror().addBox(-0.9922F, -0.942F, -5.5191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.253F, -0.0346F, -0.0076F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(135, 139).mirror().addBox(-0.9922F, -0.4048F, -3.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(122, 139).mirror().addBox(-0.9922F, -0.4048F, -3.0822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.1308F, -0.0346F, -0.0076F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(112, 23).mirror().addBox(-0.9922F, -0.0527F, -1.9321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.027F, -0.6749F, -6.6836F, 0.1657F, -0.0346F, -0.0076F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(117, 139).mirror().addBox(-1.0129F, 0.6934F, -2.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.473F, -0.6749F, -3.0836F, 0.7231F, -0.1208F, 0.0152F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(31, 122).mirror().addBox(-1.026F, 1.218F, -2.2935F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.473F, -0.6749F, -3.0836F, 0.0256F, -0.1218F, 0.0077F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(139, 104).mirror().addBox(-1.026F, 1.7525F, -1.239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.473F, -0.6749F, -3.0836F, -0.3409F, -0.1218F, 0.0077F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(96, 139).mirror().addBox(-1.0129F, 1.5791F, -1.1742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.473F, -0.6749F, -3.0836F, -0.0623F, -0.1208F, 0.0152F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(64, 90).mirror().addBox(-0.9178F, -0.3366F, -3.5998F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.473F, -0.6749F, -3.0836F, 0.0698F, -0.1222F, 0.0F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(115, 41).mirror().addBox(-0.5872F, 0.2032F, -2.9614F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.373F, -0.6749F, 0.1164F, -0.192F, -0.1745F, 0.0F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(122, 50).addBox(-0.0504F, 1.4352F, 4.5519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.9278F, -3.4233F, 0.5411F, 0.0349F, 0.0F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(108, 80).addBox(-0.0504F, -0.314F, 2.3317F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.9278F, -3.4233F, 0.192F, 0.0349F, 0.0F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(108, 75).addBox(-0.8316F, -0.8F, -0.1879F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.9278F, -3.4233F, 0.0F, 0.3316F, 0.0F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(140, 71).addBox(-0.0078F, 1.1199F, -6.6192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.1134F, 0.0346F, 0.0076F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(122, 41).addBox(-0.0078F, 1.5819F, -5.5826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 115).addBox(-0.0078F, 0.6069F, -3.6326F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.0261F, 0.0346F, 0.0076F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(122, 104).addBox(-0.0078F, 1.7298F, -1.4525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, -0.0699F, 0.0346F, 0.0076F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(104, 46).addBox(-0.1019F, 1.3538F, -3.6795F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.473F, -0.6749F, -3.0836F, -0.1576F, 0.122F, -0.0061F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(88, 134).addBox(-0.0822F, 1.1371F, -1.3858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.473F, -0.6749F, -3.0836F, 0.0524F, 0.1222F, 0.0F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(115, 69).addBox(-0.4128F, 0.4634F, -4.0761F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.373F, -0.6749F, 0.1164F, 0.1833F, 0.1745F, 0.0F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(115, 59).addBox(-0.4128F, 0.4676F, -2.1232F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.373F, -0.6749F, 0.1164F, 0.192F, 0.1745F, 0.0F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(140, 68).addBox(-0.4128F, 1.0263F, 0.4288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.373F, -0.6749F, 0.1164F, 0.1309F, 0.1745F, 0.0F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(127, 45).addBox(-0.4128F, -0.4474F, -0.4425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5538F, 0.8986F, 1.1418F, -2.0508F, 0.1745F, 0.0F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(134, 49).addBox(-0.4128F, -1.4819F, 1.4897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.373F, -0.6749F, 0.1164F, -1.4748F, 0.1745F, 0.0F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(140, 65).addBox(-0.0078F, 0.4954F, -8.4209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.2137F, 0.0346F, 0.0076F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(140, 62).addBox(-0.0078F, 0.0924F, -7.7373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.2661F, 0.0346F, 0.0076F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(140, 59).addBox(-0.0078F, -4.5527F, 7.2395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 2.9714F, 0.0346F, 0.0076F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(36, 140).addBox(-0.0078F, 4.8591F, 7.0488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, -2.2646F, 0.0346F, 0.0076F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(31, 140).addBox(-0.0078F, 8.1629F, 0.4394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, -1.4356F, 0.0346F, 0.0076F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(26, 140).addBox(-0.0078F, 2.9556F, -7.6424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, -0.179F, 0.0346F, 0.0076F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(21, 140).addBox(-0.0078F, 1.1026F, -7.453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.0828F, 0.0346F, 0.0076F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(86, 45).addBox(0.0072F, -0.3285F, -6.9035F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.301F, 0.0346F, 0.0076F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(49, 134).addBox(-0.0078F, -2.0675F, -9.4649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.3054F, 0.0346F, 0.0076F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(134, 41).addBox(-0.0078F, -0.1774F, -8.6398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.0785F, 0.0346F, 0.0076F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(10, 140).addBox(-0.0078F, 1.4665F, -7.6493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, -0.0437F, 0.0346F, 0.0076F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(5, 140).addBox(-0.0078F, -0.4557F, -7.109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 85).addBox(-0.0078F, -0.8447F, -4.7018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.2181F, 0.0346F, 0.0076F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(0, 140).addBox(-0.0078F, -0.6127F, -6.3318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.2268F, 0.0346F, 0.0076F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(134, 4).addBox(-0.0078F, -0.942F, -5.5191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.253F, 0.0346F, 0.0076F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(135, 139).addBox(-0.0078F, -0.4048F, -3.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(122, 139).addBox(-0.0078F, -0.4048F, -3.0822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.1308F, 0.0346F, 0.0076F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(112, 23).addBox(-0.0078F, -0.0527F, -1.9321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.027F, -0.6749F, -6.6836F, 0.1657F, 0.0346F, 0.0076F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(117, 139).addBox(0.0129F, 0.6934F, -2.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.473F, -0.6749F, -3.0836F, 0.7231F, 0.1208F, -0.0152F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(31, 122).addBox(0.026F, 1.218F, -2.2935F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.473F, -0.6749F, -3.0836F, 0.0256F, 0.1218F, -0.0077F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(139, 104).addBox(0.026F, 1.7525F, -1.239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.473F, -0.6749F, -3.0836F, -0.3409F, 0.1218F, -0.0077F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(96, 139).addBox(0.0129F, 1.5791F, -1.1742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.473F, -0.6749F, -3.0836F, -0.0623F, 0.1208F, -0.0152F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(64, 90).addBox(-0.0822F, -0.3366F, -3.5998F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.473F, -0.6749F, -3.0836F, 0.0698F, 0.1222F, 0.0F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(115, 41).addBox(-0.4128F, 0.2032F, -2.9614F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.373F, -0.6749F, 0.1164F, -0.192F, 0.1745F, 0.0F));

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