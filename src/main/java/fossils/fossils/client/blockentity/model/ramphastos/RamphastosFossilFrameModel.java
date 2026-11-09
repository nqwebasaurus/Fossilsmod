package fossils.fossils.client.blockentity.model.ramphastos;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RamphastosFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot4;
	private final ModelPart leftToes4;
	private final ModelPart leftFoot3;
	private final ModelPart leftToes3;
	private final ModelPart leftFoot5;
	private final ModelPart leftToes5;
	private final ModelPart leftFoot2;
	private final ModelPart leftToes2;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot4;
	private final ModelPart rightToes4;
	private final ModelPart rightFoot3;
	private final ModelPart rightToes3;
	private final ModelPart rightFoot5;
	private final ModelPart rightToes5;
	private final ModelPart rightFoot2;
	private final ModelPart rightToes2;
	private final ModelPart tail;
	private final ModelPart tail2;
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
	private final ModelPart bone4;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck10;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public RamphastosFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot4 = this.leftLeg3.getChild("leftFoot4");
		this.leftToes4 = this.leftFoot4.getChild("leftToes4");
		this.leftFoot3 = this.leftLeg3.getChild("leftFoot3");
		this.leftToes3 = this.leftFoot3.getChild("leftToes3");
		this.leftFoot5 = this.leftLeg3.getChild("leftFoot5");
		this.leftToes5 = this.leftFoot5.getChild("leftToes5");
		this.leftFoot2 = this.leftLeg3.getChild("leftFoot2");
		this.leftToes2 = this.leftFoot2.getChild("leftToes2");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot4 = this.rightLeg3.getChild("rightFoot4");
		this.rightToes4 = this.rightFoot4.getChild("rightToes4");
		this.rightFoot3 = this.rightLeg3.getChild("rightFoot3");
		this.rightToes3 = this.rightFoot3.getChild("rightToes3");
		this.rightFoot5 = this.rightLeg3.getChild("rightFoot5");
		this.rightToes5 = this.rightFoot5.getChild("rightToes5");
		this.rightFoot2 = this.rightLeg3.getChild("rightFoot2");
		this.rightToes2 = this.rightFoot2.getChild("rightToes2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
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
		this.bone4 = this.chest.getChild("bone4");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck10 = this.neck5.getChild("neck10");
		this.neck4 = this.neck10.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.head = this.neck7.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(7.9F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-6.9F, -26.5F, -14.0F, -0.3927F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -9.5F, -0.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-6.9F, -26.5F, -14.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(5.4F, -3.3F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8F, -26.5F, 1.2F, -0.3927F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.3F, -5.5F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.8F, -26.5F, 1.2F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.6825F, 2.5838F, -0.0378F, 0.3924F, -0.0145F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(120, 22).addBox(-0.503F, 0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(120, 22).addBox(-0.503F, 0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.003F, 3.1004F, 4.0726F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.995F, -1.1551F, -0.6585F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -0.551F, -3.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, -0.926F, -5.5424F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.926F, -5.5424F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5523F, 0.3935F, -1.7075F, -0.8721F, -0.2854F, -0.0975F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7669F, 10.8543F, 0.63F, 1.6599F, -0.0447F, 0.1093F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 16.5855F, -3.4221F, -0.48F, 0.0F, 0.0F));

		PartDefinition leftFoot4 = leftLeg3.addOrReplaceChild("leftFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.094F, 9.2758F, -2.3431F, -2.6008F, -0.5649F, 3.0894F));

		PartDefinition leftToes4 = leftFoot4.addOrReplaceChild("leftToes4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0001F, 0.3597F, -3.6549F, -0.3189F, -0.0045F, 0.0003F));

		PartDefinition leftFoot3 = leftLeg3.addOrReplaceChild("leftFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0966F, 9.2401F, -2.3922F, 0.0695F, 0.0037F, 0.1001F));

		PartDefinition leftToes3 = leftFoot3.addOrReplaceChild("leftToes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0002F, 0.3554F, -3.7097F, -0.3354F, 0.0313F, -0.0263F));

		PartDefinition leftFoot5 = leftLeg3.addOrReplaceChild("leftFoot5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7839F, 9.1902F, -2.2696F, 0.0712F, 0.4426F, -0.1115F));

		PartDefinition leftToes5 = leftFoot5.addOrReplaceChild("leftToes5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0001F, 0.2598F, -3.6509F, -0.3014F, -0.0045F, 0.0003F));

		PartDefinition leftFoot2 = leftLeg3.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7495F, 9.3199F, -1.8078F, -2.1678F, 0.1976F, -3.0641F));

		PartDefinition leftToes2 = leftFoot2.addOrReplaceChild("leftToes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0161F, 0.261F, -1.6912F, -0.5894F, -0.0045F, 0.0003F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5523F, 0.3935F, -1.7075F, -0.5667F, 0.2854F, 0.0975F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7669F, 10.8543F, 0.63F, 2.1835F, 0.0447F, -0.1093F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 16.5855F, -3.4221F, -1.9635F, 0.0F, 0.0F));

		PartDefinition rightFoot4 = rightLeg3.addOrReplaceChild("rightFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.094F, 9.2758F, -2.3431F, -2.4699F, 0.5649F, -3.0894F));

		PartDefinition rightToes4 = rightFoot4.addOrReplaceChild("rightToes4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0001F, 0.3597F, -3.6549F, 0.2484F, 0.0045F, -0.0003F));

		PartDefinition rightFoot3 = rightLeg3.addOrReplaceChild("rightFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0966F, 9.2401F, -2.3922F, 0.5495F, -0.0037F, -0.1001F));

		PartDefinition rightToes3 = rightFoot3.addOrReplaceChild("rightToes3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0002F, 0.3554F, -3.7097F, 0.3618F, 0.0045F, -0.0003F));

		PartDefinition rightFoot5 = rightLeg3.addOrReplaceChild("rightFoot5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7839F, 9.1902F, -2.2696F, 0.6384F, -0.4426F, 0.1115F));

		PartDefinition rightToes5 = rightFoot5.addOrReplaceChild("rightToes5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0001F, 0.2598F, -3.6509F, 0.3967F, 0.0045F, -0.0003F));

		PartDefinition rightFoot2 = rightLeg3.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7495F, 9.3199F, -1.8078F, -2.6791F, -0.0525F, 2.9662F));

		PartDefinition rightToes2 = rightFoot2.addOrReplaceChild("rightToes2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0161F, -0.3355F, -1.6257F, -0.1094F, 0.0045F, -0.0003F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(46, 76).addBox(-0.5F, -0.1914F, 0.1377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.0492F, 4.5597F, -0.5934F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 84).addBox(-0.5F, 0.4339F, -0.4136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6459F, 2.8949F, 0.2705F, 0.0F, 0.0F));

		PartDefinition tail5 = tail2.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1776F, 3.0222F, -1.3526F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, -3.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 12).addBox(-0.995F, 0.7244F, -5.0082F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.7508F, -8.5081F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 9).addBox(-0.995F, -0.525F, -4.7F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, 1.0F, -1.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2693F, 1.6498F, -6.5522F, 2.6141F, 0.2118F, 2.4702F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1278F, 12.2867F, -4.835F, 1.1057F, -0.3777F, 2.9713F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1414F, 14.9504F, -4.3747F, -3.056F, -0.1249F, 0.1267F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2693F, 1.6498F, -6.5522F, 2.6141F, -0.2118F, -2.4702F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1278F, 12.2867F, -4.835F, 1.1057F, 0.3777F, -2.9713F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1414F, 14.9504F, -4.3747F, -3.056F, 0.1249F, -0.1267F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0142F, 2.2526F, -7.0035F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0142F, 2.2526F, -7.0035F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8106F, -5.9858F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 38).addBox(-0.5F, -1.0F, 4.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 34).addBox(-0.5F, -1.0F, -0.05F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6216F, -5.4218F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7022F, -4.8982F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(14, 51).addBox(0.005F, -0.2F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 48).addBox(0.005F, -0.2F, -4.55F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.505F, -0.2983F, 0.6012F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck10 = neck5.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.0767F, -3.7314F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck10.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(73, 2).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.1441F, -0.759F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck10.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(71, 0).addBox(-0.995F, -1.1981F, 2.7713F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.005F, -5.2982F, -3.0954F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck4 = neck10.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -2.6F, -1.4F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(75, 40).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1418F, -1.0318F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(73, 38).addBox(-0.995F, -0.9981F, -0.0537F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -2.6938F, -1.7418F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0546F, -1.6298F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 56).addBox(-0.995F, 2.6773F, -2.8317F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -6.0404F, 0.2843F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8096F, 0.9144F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r16 = neck2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 77).addBox(-0.5F, -0.175F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0F, 0.082F, -1.1405F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 77).addBox(-0.5F, -0.1F, -1.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9632F, -3.0167F, 0.7243F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8627F, -2.8626F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r18 = neck.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 46).addBox(-0.995F, 0.7866F, -0.0362F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.7319F, -3.6921F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r19 = neck7.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(45, 35).addBox(-0.995F, 0.8616F, -0.2862F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.6609F, -3.6252F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck7.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2566F, -3.0319F, 0.8889F, 0.1107F, 0.1352F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7F, -9.0781F, -1.1971F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7F, -9.0781F, -1.1971F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.0645F, -0.5763F, 0.2974F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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