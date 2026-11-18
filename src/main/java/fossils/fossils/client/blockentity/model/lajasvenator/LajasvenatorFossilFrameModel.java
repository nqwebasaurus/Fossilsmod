package fossils.fossils.client.blockentity.model.lajasvenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LajasvenatorFossilFrameModel extends SkullModelBase {
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

	public LajasvenatorFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(0.7F, -33.0F, 4.1F, 1.0F, 33.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(0.0258F, -3.0417F, -0.45F, 1.0F, 31.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(8.7742F, -27.9583F, -26.35F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.1F, -5.7F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.867F, -25.5588F, -26.8282F, -0.4331F, 0.0552F, 1.6896F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(0.2F, -4.2F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2F, -32.1F, 4.5F, 0.0F, 0.0F, 1.789F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0419F, -32.9418F, 2.2344F, -0.0602F, 0.0106F, 0.1742F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 24).addBox(-0.425F, -1.0322F, 12.5974F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 13).addBox(-0.425F, -1.0322F, 0.8974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.883F, 5.2613F, 0.7254F, -0.1309F, 0.0F, 0.1309F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.883F, 5.2613F, 0.7254F, -0.1309F, 0.0F, -0.1309F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 1.3094F, 2.8117F, 0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 14.5929F, -1.8106F, 1.4085F, -0.1073F, 0.0778F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.2185F, -1.0452F, -0.7069F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 7.9806F, 0.3806F, 1.1694F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.2144F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 1.3094F, 2.8117F, -0.7767F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.5929F, -1.8106F, 0.9277F, -0.016F, 0.0045F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.2185F, -1.0452F, -0.8814F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 7.9806F, 0.3806F, 1.3515F, 0.199F, -0.0573F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.5198F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1626F, 8.8231F, -0.22F, -0.1278F, 0.0285F));

		PartDefinition cube_r5 = tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 0).addBox(0.075F, -0.9F, -0.05F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.4998F, 8.6946F, 0.1492F, -0.1302F, -0.0138F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(6, 67).addBox(0.025F, -0.9F, 15.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 61).addBox(0.025F, -0.9F, 8.575F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.2633F, -0.1289F, -0.0229F));

		PartDefinition cube_r7 = tail2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 6).addBox(-0.5F, -0.9F, 7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(51, -1).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 6).addBox(-0.5F, -0.6F, 7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4434F, 0.0461F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.1749F, -0.1308F, -0.0057F));

		PartDefinition cube_r8 = tail8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 34).addBox(-0.5F, -1.2F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, -0.0792F, -0.1305F, 0.0103F));

		PartDefinition cube_r9 = tail3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 48).addBox(-0.5F, 0.8F, 8.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 40).addBox(-0.5F, 0.8F, -0.125F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0699F, -0.0435F, 0.003F));

		PartDefinition cube_r10 = tail9.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 72).addBox(-0.5F, 0.8F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0094F, 0.3927F, 0.0036F));

		PartDefinition cube_r11 = tail4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(76, 5).addBox(-0.5F, 0.7F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(71, 0).addBox(-0.5F, 0.7F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(77, 16).addBox(-0.5F, 0.1302F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.0975F, 0.1737F, -0.0169F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(54, 24).addBox(-0.5F, 0.625F, -0.2013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 5.6774F, -0.1523F, 0.3484F, -0.0222F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(56, 10).addBox(-0.5F, 0.675F, -0.3763F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 17).addBox(-0.5F, 0.675F, 7.3237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1535F, 0.2589F, -0.0396F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, 0.625F, -0.0013F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.1506F, 0.1726F, -0.0261F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, 0.0532F, -0.1743F, -0.0092F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 45).addBox(-1.0F, 1.025F, 1.6F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.05F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4511F, -7.7965F, -0.0177F, -0.1745F, 0.0031F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0676F, -9.0649F, 0.1402F, -0.0864F, -0.0122F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(113, 52).addBox(-0.5F, -1.1641F, 1.1055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(112, 51).addBox(-0.5F, -1.1641F, -0.5945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.1141F, -1.9868F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 68).addBox(-0.5F, 0.9131F, -6.2179F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0141F, -2.0868F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3431F, 5.7255F, -6.9862F, -0.2077F, 0.0719F, -0.2068F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3431F, 5.7255F, -6.9862F, -0.2077F, -0.0719F, 0.2068F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4201F, 7.6662F, -12.5215F, 1.1956F, 0.2618F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7286F, 7.2054F, -0.7153F, -1.05F, 0.0156F, 0.0164F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3323F, 4.3662F, 1.122F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4201F, 7.6662F, -12.5215F, 0.8029F, -0.2618F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7286F, 7.2054F, -0.7153F, -1.05F, -0.0156F, -0.0164F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3323F, 4.3662F, 1.122F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0448F, -7.8172F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(100, 56).addBox(-0.5F, 0.35F, 2.825F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3555F, -0.2874F, -0.1049F));

		PartDefinition cube_r16 = neck2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(100, 72).addBox(-0.5F, 2.45F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4778F, -2.5803F, -0.2701F, -0.3006F, 0.0547F));

		PartDefinition cube_r17 = neck5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(105, 19).addBox(-0.5F, 2.4F, 5.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 17).addBox(-0.5F, 2.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.489F, 0.0402F, -0.0171F));

		PartDefinition cube_r18 = neck4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(58, 91).addBox(-0.475F, -1.0F, 4.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 91).addBox(-0.475F, -1.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 88).addBox(-0.475F, -1.0F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1089F, 0.1998F, -4.4014F, -0.1213F, -0.0592F, -0.1247F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.0617F, -0.211F, -0.1429F));

		PartDefinition cube_r19 = neck3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(75, 89).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9147F, -3.7459F, -0.4773F, -0.0311F, 0.0156F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.4955F, -0.0946F, 0.1004F));

		PartDefinition cube_r20 = neck.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(62, 101).addBox(0.0F, 2.3315F, -3.0683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.2395F, -0.1376F, 0.0208F));

		PartDefinition cube_r21 = neck6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(18, 102).addBox(-0.5F, 1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.863F, -2.08F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r22 = neck6.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(113, 84).addBox(0.0F, 2.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.81F, -4.4471F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.501F, 0.6098F, -1.2129F, 0.0F, -0.0174F, 0.0015F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.501F, 0.6098F, -1.2129F, 0.0F, 0.0174F, -0.0015F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0516F, 0.8826F, 0.6458F, 0.0F, 0.0F));

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