package fossils.fossils.client.blockentity.model.eoabelisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EoabelisaurusFossilModel extends SkullModelBase {
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

	public EoabelisaurusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.5305F, -0.2428F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(97, 100).addBox(0.0F, -1.1F, -0.825F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6645F, 8.5319F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 26).addBox(-0.006F, -2.6F, -9.7F, 0.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.18F, 7.705F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1569F, 4.8325F, 2.5957F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(61, 49).addBox(-0.5827F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5815F, -11.0433F, 5.3786F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(41, 77).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6085F, -11.2718F, 0.797F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 84).addBox(-0.5F, -2.0F, -2.925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0658F, -7.2375F, 3.9535F, 0.3385F, -0.0327F, -0.4104F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 56).addBox(-0.5F, -1.55F, -2.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2469F, -7.8392F, 5.3819F, -0.124F, -0.0327F, -0.4104F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.336F, -10.4049F, 4.6757F, -0.4076F, -0.0391F, -0.4053F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(135, 120).addBox(-0.0039F, 0.1156F, -0.6453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6025F, 3.7791F, 6.4809F, 0.3776F, 0.0065F, -0.1456F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 139).addBox(-0.0039F, 1.611F, 0.2007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6025F, 3.7791F, 6.4809F, -0.1023F, 0.0065F, -0.1456F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(140, 69).addBox(-0.0039F, 0.5942F, -2.6148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6025F, 3.7791F, 6.4809F, 1.2503F, 0.0065F, -0.1456F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 138).addBox(-0.0039F, 2.0563F, -0.1938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6025F, 3.7791F, 6.4809F, 0.2904F, 0.0065F, -0.1456F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 139).addBox(-0.0068F, 1.0483F, 1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6025F, 3.7791F, 6.4809F, -0.0151F, 0.0065F, -0.1456F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(140, 111).addBox(-0.0068F, 2.0931F, -0.6563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(10, 139).addBox(-0.0068F, 1.6931F, -0.6813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6025F, 3.7791F, 6.4809F, 0.7267F, 0.0065F, -0.1456F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(140, 129).addBox(0.016F, 0.9779F, -0.9252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6025F, 3.7791F, 6.4809F, 0.8573F, 0.001F, -0.1348F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(111, 35).addBox(-1.0554F, -0.0825F, -1.1369F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3975F, -0.6209F, 4.3809F, 0.5537F, -0.0332F, -0.0274F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 128).addBox(-1.142F, -4.1362F, 0.0262F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3975F, 0.6791F, 4.3809F, 0.978F, 0.015F, 0.1679F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(13, 135).addBox(-1.0435F, -2.481F, 3.188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3975F, 0.6791F, 4.3809F, 1.9129F, 0.0808F, 0.1913F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(14, 124).addBox(-1.1811F, -4.8067F, -0.6426F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3975F, 0.6791F, 4.3809F, 0.48F, 0.0091F, 0.1668F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(21, 112).addBox(-0.5F, -2.5F, -1.625F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3114F, -4.5025F, 2.4458F, 0.2002F, 0.0639F, 0.0248F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(78, 67).addBox(-0.5F, -0.925F, -3.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2192F, -3.4306F, 1.4198F, -0.1488F, 0.0639F, 0.0248F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(15, 77).addBox(-0.5F, -5.05F, -3.55F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1457F, -0.6979F, -2.5076F, -1.4491F, 0.0639F, 0.0248F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(132, 100).addBox(-0.0057F, 0.1978F, -0.4137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4063F, 6.1025F, -8.9821F, -0.5373F, 0.0125F, -0.1261F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(77, 138).addBox(-0.0057F, 0.2012F, 1.9107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4063F, 6.1025F, -8.9821F, -1.759F, 0.0125F, -0.1261F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(111, 131).addBox(-0.0057F, -1.3103F, 1.8588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4063F, 6.1025F, -8.9821F, -1.6717F, 0.0125F, -0.1261F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(135, 104).addBox(-0.0057F, -0.0721F, -0.4181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4063F, 6.1025F, -8.9821F, -0.4151F, 0.0125F, -0.1261F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(129, 50).addBox(-0.0057F, -1.0349F, 0.3662F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4063F, 6.1025F, -8.9821F, -0.3627F, 0.0125F, -0.1261F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(67, 135).addBox(-0.0057F, 0.0572F, 0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4063F, 6.1025F, -8.9821F, -0.0573F, 0.0125F, -0.1261F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(97, 110).addBox(-0.6216F, 0.3233F, 0.081F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1313F, 0.5025F, -6.1821F, -0.432F, 0.0063F, -0.0566F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(128, 28).addBox(-0.626F, -0.6609F, -0.1112F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1313F, 0.5025F, -6.1821F, -0.5628F, 0.0021F, -0.056F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(78, 124).addBox(-0.6216F, 2.3207F, -0.3149F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1313F, 0.5025F, -6.1821F, -0.4756F, 0.0063F, -0.0566F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(5, 129).addBox(-0.5F, -1.5F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1451F, 0.0265F, -5.6453F, -0.368F, 0.0682F, -0.0069F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(128, 128).addBox(-0.639F, 2.6247F, 1.957F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.023F, -4.5435F, -4.7582F, -0.6298F, 0.0682F, -0.0069F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(89, 114).addBox(-0.5F, -1.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.038F, -1.7875F, -4.4974F, -0.1498F, 0.0683F, -0.0057F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 101).addBox(-0.5F, -2.65F, -0.075F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0079F, -5.3776F, -4.0852F, -0.4979F, 0.0639F, 0.0248F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(71, 0).addBox(-0.3844F, -1.3639F, -1.6767F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0504F, -5.8896F, -1.5616F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(132, 61).addBox(-0.9819F, -2.4083F, -3.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0809F, -12.1882F, -5.794F, 1.6842F, -0.3289F, -0.3595F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(101, 21).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.3045F, -6.1956F, -4.8501F, 0.7156F, -0.3289F, -0.3595F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(119, 11).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7568F, -6.7916F, -6.7049F, 1.3701F, -0.3289F, -0.3595F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(49, 113).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5431F, -8.4397F, -7.8175F, 2.1991F, -0.3289F, -0.3595F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(116, 38).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2831F, -10.4866F, -6.5088F, 0.733F, -0.3289F, -0.3595F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(63, 106).addBox(-0.9819F, -0.014F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0849F, -11.0775F, -4.6044F, 0.3578F, -0.3289F, -0.3595F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(21, 99).addBox(0.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.186F, -11.4047F, -2.2964F, 0.3216F, -0.3037F, -0.3808F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(70, 91).addBox(-0.58F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5815F, -11.7433F, -3.2214F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1569F, 2.4297F, 2.6061F, -0.0873F, 0.0F, -0.1309F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(61, 49).mirror().addBox(-0.4173F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -8.6405F, 5.3682F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(41, 77).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6085F, -8.869F, 0.7867F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(61, 84).mirror().addBox(-0.5F, -2.0F, -2.925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0658F, -4.8347F, 3.9432F, 0.3385F, 0.0327F, 0.4104F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(80, 56).mirror().addBox(-0.5F, -1.55F, -2.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2469F, -5.4363F, 5.3715F, -0.124F, 0.0327F, 0.4104F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(90, 21).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.336F, -8.0021F, 4.6653F, -0.4076F, 0.0391F, 0.4053F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(135, 120).mirror().addBox(-0.9961F, 0.1156F, -0.6453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.6025F, 6.1819F, 6.4705F, 0.3776F, -0.0065F, 0.1456F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 139).mirror().addBox(-0.9961F, 1.611F, 0.2007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6025F, 6.1819F, 6.4705F, -0.1023F, -0.0065F, 0.1456F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(140, 69).mirror().addBox(-0.9961F, 0.5942F, -2.6148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.6025F, 6.1819F, 6.4705F, 1.2503F, -0.0065F, 0.1456F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 138).mirror().addBox(-0.9961F, 2.0563F, -0.1938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6025F, 6.1819F, 6.4705F, 0.2904F, -0.0065F, 0.1456F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(42, 139).mirror().addBox(-0.9932F, 1.0483F, 1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6025F, 6.1819F, 6.4705F, -0.0151F, -0.0065F, 0.1456F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(140, 111).mirror().addBox(-0.9932F, 2.0931F, -0.6563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(10, 139).mirror().addBox(-0.9932F, 1.6931F, -0.6813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6025F, 6.1819F, 6.4705F, 0.7267F, -0.0065F, 0.1456F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(140, 129).mirror().addBox(-1.016F, 0.9779F, -0.9252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6025F, 6.1819F, 6.4705F, 0.8573F, -0.001F, 0.1348F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(111, 35).mirror().addBox(0.0554F, -0.0825F, -1.1369F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3975F, 1.7819F, 4.3705F, 0.5537F, 0.0332F, 0.0274F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(33, 128).mirror().addBox(0.142F, -4.1362F, 0.0262F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3975F, 3.0819F, 4.3705F, 0.978F, -0.015F, -0.1679F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(13, 135).mirror().addBox(0.0435F, -2.481F, 3.188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3975F, 3.0819F, 4.3705F, 1.9129F, -0.0808F, -0.1913F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(14, 124).mirror().addBox(0.1811F, -4.8067F, -0.6426F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3975F, 3.0819F, 4.3705F, 0.48F, -0.0091F, -0.1668F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(21, 112).mirror().addBox(-0.5F, -2.5F, -1.625F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3114F, -2.0996F, 2.4354F, 0.2002F, -0.0639F, -0.0248F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-0.5F, -0.925F, -3.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2192F, -1.0278F, 1.4095F, -0.1488F, -0.0639F, -0.0248F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.5F, -5.05F, -3.55F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1457F, 1.7049F, -2.5179F, -1.4491F, -0.0639F, -0.0248F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(132, 100).mirror().addBox(-0.9943F, 0.1978F, -0.4137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4063F, 8.5053F, -8.9925F, -0.5373F, -0.0125F, 0.1261F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(77, 138).mirror().addBox(-0.9943F, 0.2012F, 1.9107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4063F, 8.5053F, -8.9925F, -1.759F, -0.0125F, 0.1261F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(111, 131).mirror().addBox(-0.9943F, -1.3103F, 1.8588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4063F, 8.5053F, -8.9925F, -1.6717F, -0.0125F, 0.1261F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(135, 104).mirror().addBox(-0.9943F, -0.0721F, -0.4181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4063F, 8.5053F, -8.9925F, -0.4151F, -0.0125F, 0.1261F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(129, 50).mirror().addBox(-0.9943F, -1.0349F, 0.3662F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4063F, 8.5053F, -8.9925F, -0.3627F, -0.0125F, 0.1261F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(67, 135).mirror().addBox(-0.9943F, 0.0572F, 0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4063F, 8.5053F, -8.9925F, -0.0573F, -0.0125F, 0.1261F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(97, 110).mirror().addBox(-0.3784F, 0.3233F, 0.081F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1313F, 2.9053F, -6.1925F, -0.432F, -0.0063F, 0.0566F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(128, 28).mirror().addBox(-0.374F, -0.6609F, -0.1112F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1313F, 2.9053F, -6.1925F, -0.5628F, -0.0021F, 0.056F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(78, 124).mirror().addBox(-0.3784F, 2.3207F, -0.3149F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1313F, 2.9053F, -6.1925F, -0.4756F, -0.0063F, 0.0566F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(5, 129).mirror().addBox(-0.5F, -1.5F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1451F, 2.4293F, -5.6557F, -0.368F, -0.0682F, 0.0069F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(128, 128).mirror().addBox(-0.361F, 2.6247F, 1.957F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.023F, -2.1406F, -4.7686F, -0.6298F, -0.0682F, 0.0069F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(89, 114).mirror().addBox(-0.5F, -1.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.038F, 0.6153F, -4.5078F, -0.1498F, -0.0683F, 0.0057F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(76, 101).mirror().addBox(-0.5F, -2.65F, -0.075F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0079F, -2.9748F, -4.0956F, -0.4979F, -0.0639F, -0.0248F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.6156F, -1.3639F, -1.6767F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0504F, -3.4868F, -1.572F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(132, 61).mirror().addBox(-0.0181F, -2.4083F, -3.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0809F, -9.7854F, -5.8043F, 1.6842F, 0.3289F, 0.3595F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(101, 21).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3045F, -3.7928F, -4.8605F, 0.7156F, 0.3289F, 0.3595F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(119, 11).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7568F, -4.3887F, -6.7153F, 1.3701F, 0.3289F, 0.3595F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(49, 113).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5431F, -6.0369F, -7.8278F, 2.1991F, 0.3289F, 0.3595F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(116, 38).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2831F, -8.0838F, -6.5192F, 0.733F, 0.3289F, 0.3595F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(63, 106).mirror().addBox(-0.0181F, -0.014F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0849F, -8.6747F, -4.6147F, 0.3578F, 0.3289F, 0.3595F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(21, 99).mirror().addBox(-1.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.186F, -9.0019F, -2.3068F, 0.3216F, 0.3037F, 0.3808F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 91).mirror().addBox(-0.42F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -9.3405F, -3.2318F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.2435F, 2.7532F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(84, 9).addBox(-0.6F, 0.6043F, -3.5902F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 12.615F, -1.4005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(96, 72).addBox(-1.0F, -4.025F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 9.6016F, -3.6557F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(125, 109).addBox(-5.1F, -0.0057F, -2.643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.6F, 11.6054F, -1.1045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(109, 84).addBox(-1.0F, -0.375F, -0.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 14.7481F, -3.9569F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(70, 116).addBox(-5.1F, 0.868F, 0.1317F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 10.6777F, -3.0694F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(104, 59).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 11.5296F, -4.0027F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(114, 79).addBox(-5.1F, 0.868F, -0.9183F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.6F, 10.6777F, -3.0694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(135, 124).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.1355F, -0.927F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(26, 130).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 4.0808F, 0.0106F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(58, 99).addBox(-5.1F, -3.4113F, 0.1555F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 5.5302F, -2.7348F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(94, 88).addBox(-1.5F, -1.0F, -2.15F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(72, 84).addBox(-1.5F, -1.2F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1302F, 0.171F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(105, 78).addBox(-1.0F, -0.3F, -1.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 0.9952F, -1.4782F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 106).addBox(-1.3F, 3.6597F, -0.4625F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, 15.9647F, -2.6164F, 1.0273F, -0.0118F, -0.0173F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(119, 21).addBox(-1.0F, -4.175F, -0.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 5.395F, 0.6271F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(14, 107).addBox(0.9F, -2.4F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(40, 92).addBox(-0.1F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1421F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(123, 120).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(95, 30).addBox(-0.1F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(100, 36).addBox(-0.1F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(99, 11).addBox(-0.1F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(123, 116).addBox(-1.0F, 0.0F, -0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3F, 12.9605F, -1.2277F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(38, 129).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 15.3383F, -0.9639F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(33, 92).addBox(-1.0F, -4.2F, -0.675F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 11.5497F, -0.5248F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 3.0118F, 0.0352F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(51, 93).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.3F, 8.2096F, 1.0129F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(113, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.3F, 4.2315F, 1.431F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(120, 43).addBox(-1.1F, -0.1475F, -0.6125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.2472F, 1.1883F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(28, 124).addBox(-1.1F, -0.034F, -1.0843F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 9.7739F, 0.1303F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(52, 126).addBox(-1.1F, -1.034F, -0.0093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 5.5841F, -0.9914F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(140, 114).addBox(-1.1F, -0.034F, 0.0157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 4.697F, -0.5297F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(96, 118).addBox(-1.1F, -0.034F, 0.0157F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4F, 4.697F, -0.5297F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(92, 129).addBox(-1.1F, -0.334F, -0.1593F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.2197F, 0.5582F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(84, 0).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.387F, -1.5451F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(18, 131).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r118 = rightLeg3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(35, 122).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(67, 14).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 1.3134F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(48, 0).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.6071F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.2435F, 2.7532F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(26, 85).addBox(-2.4F, 0.6043F, -3.5902F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 12.615F, -1.4005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(96, 79).addBox(-1.0F, -4.025F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 9.6016F, -3.6557F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(126, 13).addBox(3.1F, -0.0057F, -2.643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.6F, 11.6054F, -1.1045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(110, 23).addBox(-1.0F, -0.375F, -0.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 14.7481F, -3.9569F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(109, 118).addBox(3.1F, 0.868F, 0.1317F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 10.6777F, -3.0694F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(30, 108).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 11.5296F, -4.0027F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(82, 114).addBox(3.1F, 0.868F, -0.9183F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.6F, 10.6777F, -3.0694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 136).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.1355F, -0.927F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(45, 130).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.0808F, 0.0106F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(67, 99).addBox(3.1F, -3.4113F, 0.1555F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 5.5302F, -2.7348F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(94, 94).addBox(-1.5F, -1.0F, -2.15F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(83, 88).addBox(-1.5F, -1.2F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.1302F, 0.171F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(105, 88).addBox(-1.0F, -0.3F, -1.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 0.9952F, -1.4782F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(106, 27).addBox(-0.7F, 3.6597F, -0.4625F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0F, 15.9647F, -2.6164F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(77, 119).addBox(-1.0F, -4.175F, -0.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 5.395F, 0.6271F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(75, 109).addBox(-2.9F, -2.4F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(93, 0).addBox(-1.9F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, -0.1421F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(124, 5).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(79, 95).addBox(-1.9F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(100, 41).addBox(-1.9F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(99, 16).addBox(-1.9F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 124).addBox(-1.0F, 0.0F, -0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.3F, 12.9605F, -1.2277F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(129, 47).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 15.3383F, -0.9639F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(93, 39).addBox(-1.0F, -4.2F, -0.675F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 11.5497F, -0.5248F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(120, 26).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 3.0118F, 0.0352F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftLeg2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(9, 96).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.3F, 8.2096F, 1.0129F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftLeg2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(113, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.3F, 4.2315F, 1.431F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftLeg2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(120, 58).addBox(0.1F, -0.1475F, -0.6125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.2472F, 1.1883F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftLeg2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(73, 124).addBox(0.1F, -0.034F, -1.0843F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 9.7739F, 0.1303F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftLeg2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(99, 126).addBox(0.1F, -1.034F, -0.0093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 5.5841F, -0.9914F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftLeg2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(140, 117).addBox(0.1F, -0.034F, 0.0157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 4.697F, -0.5297F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftLeg2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(84, 119).addBox(0.1F, -0.034F, 0.0157F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4F, 4.697F, -0.5297F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftLeg2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(106, 129).addBox(0.1F, -0.334F, -0.1593F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.2197F, 0.5582F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(52, 84).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.387F, -1.5451F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftLeg3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(131, 83).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r151 = leftLeg3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(108, 123).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(67, 20).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(48, 7).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4299F, 8.8594F, -0.3153F, 0.083F, -0.027F));

		PartDefinition cube_r152 = tail1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(128, 75).addBox(0.0F, -0.2F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.555F, 8.5659F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(52, 141).addBox(0.5F, 0.9871F, -0.5754F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.373F, 1.4798F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(82, 134).addBox(0.5F, 0.3649F, -0.4708F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0972F, 3.8947F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(10, 129).addBox(0.5F, 0.5871F, -0.8754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1712F, 5.6169F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(83, 126).addBox(0.5F, -5.6573F, -0.1162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8915F, 6.8171F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(16, 96).addBox(0.5F, -6.2073F, 0.5838F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2379F, 3.1623F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(83, 101).addBox(0.497F, -6.4323F, -1.0162F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9798F, 1.7721F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(61, 33).mirror().addBox(-2.3F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2784F, -0.0675F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r160 = tail1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(61, 33).addBox(-0.7F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2784F, -0.0675F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r161 = tail1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(27, 12).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1829F, -0.0254F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.2326F, 8.731F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r162 = tail.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(61, 59).mirror().addBox(-2.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition cube_r163 = tail.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(61, 59).addBox(0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition cube_r164 = tail.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 66).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(102, 130).addBox(0.0F, 0.7826F, -1.1093F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.548F, 7.3799F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(69, 128).addBox(0.0F, -0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(66, 128).addBox(0.0F, 0.2F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(86, 126).addBox(0.5F, -4.5073F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 5.7753F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(89, 124).addBox(0.5F, -4.5073F, -0.0162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 3.7753F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(113, 123).addBox(0.5F, -4.9823F, -0.0162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(38, 59).addBox(0.5F, -5.3073F, -0.0162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1408F, 0.1296F, 0.0183F));

		PartDefinition cube_r172 = tail2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(9, 90).addBox(0.0F, -3.7561F, -0.0316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(133, 28).addBox(0.0F, -3.8561F, 0.0684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(133, 8).addBox(0.0F, -3.9061F, -0.1316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(132, 104).addBox(0.0F, -4.0811F, 0.0684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(42, 48).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(89, 132).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6829F, 2.6141F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(58, 93).addBox(0.0F, -0.5F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1561F, 6.7976F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(23, 131).addBox(0.0F, 0.1F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4489F, 4.297F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(61, 41).mirror().addBox(-1.6F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, -0.4738F, 1.0278F, 0.0175F, 0.0262F, 0.0005F));

		PartDefinition cube_r181 = tail2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(61, 41).addBox(-0.4F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5302F, -0.4738F, 1.0278F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.1141F, 0.2181F, 0.0058F));

		PartDefinition cube_r182 = tail8.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(19, 37).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail8.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(90, 95).addBox(0.0F, -1.0627F, 0.3434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5306F, 10.8325F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail8.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(7, 134).addBox(0.0F, 0.5F, 1.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 34).addBox(0.0F, -0.3F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.574F, 6.2087F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail8.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(34, 133).addBox(0.0F, -0.8F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4137F, 3.6504F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail8.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(31, 133).addBox(0.0F, -0.7F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4458F, 1.482F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail8.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(85, 139).addBox(0.0F, -2.4811F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 6.8984F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail8.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(68, 139).addBox(0.0F, -2.6561F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 4.9984F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail8.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(107, 138).addBox(0.0F, -2.9061F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 2.8984F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail8.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(89, 138).addBox(0.0F, -3.0561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 0.8984F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0268F, 0.2181F, 0.0058F));

		PartDefinition cube_r191 = tail3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(141, 31).addBox(0.0F, -1.4128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 27).addBox(0.0F, -1.9128F, 2.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 5.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(141, 23).addBox(0.0F, -1.4628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 3.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(141, 15).addBox(0.0F, -1.5628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 1.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(141, 6).addBox(0.0F, -1.7128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(79, 91).addBox(0.0F, 3.7586F, 4.8543F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 140).addBox(0.0F, 2.7586F, 2.8543F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 139).addBox(0.0F, 0.7586F, 0.8543F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(40, 37).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition cube_r197 = tail9.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail9.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(30, 99).addBox(0.0F, -0.65F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 5.0517F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail9.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(21, 96).addBox(0.0F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5231F, 3.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail9.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(141, 39).addBox(0.0F, 6.3F, 8.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 35).addBox(0.0F, 5.0F, 6.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail9.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(93, 6).addBox(0.0F, -1.025F, -0.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 1.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(73, 121).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 3.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(103, 27).addBox(0.0F, -0.4F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(141, 47).addBox(0.0F, -0.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(141, 43).addBox(0.0F, -1.95F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(53, 76).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(26, 77).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, 0.0358F, 0.218F, 0.0077F));

		PartDefinition cube_r207 = tail5.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(19, 56).addBox(0.0F, 2.75F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 136).addBox(0.0F, 1.55F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(42, 58).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5056F, 5.6774F, 0.2037F, -0.171F, -0.0351F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(19, 59).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.1355F, -0.2595F, -0.035F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(82, 32).addBox(-0.5F, -0.075F, -0.2263F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.1865F, -0.4728F, -0.0857F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0657F, 7.5894F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -3.0022F, 0.0263F, -0.0872F, -0.0023F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(44, 105).addBox(-0.503F, -6.3022F, -1.0364F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2678F, -3.949F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(39, 105).addBox(-0.503F, -6.3022F, -2.0364F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3725F, -5.9463F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(9, 105).addBox(-0.503F, -6.4522F, -0.0364F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1283F, -1.9539F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(23, 48).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.6882F, -9.8702F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(19, 26).addBox(-2.5F, -4.9018F, 0.1704F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.9558F, -10.1453F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(92, 134).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3632F, -4.0702F, 0.0513F, 0.0597F, -0.6427F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(132, 65).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3632F, -4.0702F, 0.0212F, 0.0757F, -1.0798F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(33, 90).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3632F, -4.0702F, -0.0248F, 0.0746F, -1.6749F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(131, 87).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1382F, -1.0702F, -0.0255F, 0.002F, -0.6451F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(132, 55).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1382F, -1.0702F, -0.024F, -0.009F, -1.0813F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(134, 132).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4882F, -7.0702F, 0.0468F, 0.0676F, -0.4877F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(134, 134).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4882F, -7.0702F, 0.0139F, 0.081F, -0.925F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4882F, -7.0702F, -0.0339F, 0.0749F, -1.5203F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(100, 70).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4882F, -7.0702F, -0.0339F, -0.0749F, 1.5203F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(134, 134).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4882F, -7.0702F, 0.0139F, -0.081F, 0.925F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(134, 132).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4882F, -7.0702F, 0.0468F, -0.0676F, 0.4877F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(132, 55).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1382F, -1.0702F, -0.024F, 0.009F, 1.0813F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(131, 87).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1382F, -1.0702F, -0.0255F, -0.002F, 0.6451F));

		PartDefinition cube_r226 = body.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(33, 90).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3632F, -4.0702F, -0.0248F, -0.0746F, 1.6749F));

		PartDefinition cube_r227 = body.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(132, 65).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3632F, -4.0702F, 0.0212F, -0.0757F, 1.0798F));

		PartDefinition cube_r228 = body.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(92, 134).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3632F, -4.0702F, 0.0513F, -0.0597F, 0.6427F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -1.0808F, -9.0002F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4132F, -7.9702F, 0.0541F, -0.1285F, -0.0503F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(70, 106).addBox(0.0F, -5.8122F, -1.0627F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0703F, -1.8946F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(128, 82).addBox(0.0F, -4.5117F, 0.0386F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9904F, -7.9957F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(58, 106).addBox(0.0F, -5.1367F, 0.0386F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9286F, -5.9922F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1308F, -4.9002F, 0.0401F, 0.223F, -1.3935F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(88, 30).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1308F, -4.9002F, 0.1588F, 0.1622F, -0.7916F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(130, 94).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1308F, -4.9002F, 0.2119F, 0.0805F, -0.3597F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(132, 110).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2308F, -7.5002F, 0.2762F, 0.1089F, -0.3191F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(133, 14).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2308F, -7.5002F, 0.2059F, 0.2147F, -0.7483F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2308F, -7.5002F, 0.0485F, 0.2924F, -1.3568F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(27, 24).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0808F, -1.9002F, 0.0038F, 0.1421F, -1.4482F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(133, 20).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0808F, -1.9002F, 0.0829F, 0.1155F, -0.8503F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(133, 22).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0808F, -1.9002F, 0.1239F, 0.0698F, -0.4144F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(133, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0808F, -1.9002F, 0.1239F, -0.0698F, 0.4144F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 15).addBox(-2.5F, -4.0429F, -5.918F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.434F, -2.1181F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(133, 20).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0808F, -1.9002F, 0.0829F, -0.1155F, 0.8503F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(27, 24).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0808F, -1.9002F, 0.0038F, -0.1421F, 1.4482F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(67, 28).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2308F, -7.5002F, 0.0485F, -0.2924F, 1.3568F));

		PartDefinition cube_r246 = body2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(133, 14).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2308F, -7.5002F, 0.2059F, -0.2147F, 0.7483F));

		PartDefinition cube_r247 = body2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(132, 110).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2308F, -7.5002F, 0.2762F, -0.1089F, 0.3191F));

		PartDefinition cube_r248 = body2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(130, 94).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1308F, -4.9002F, 0.2119F, -0.0805F, 0.3597F));

		PartDefinition cube_r249 = body2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(88, 30).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1308F, -4.9002F, 0.1588F, -0.1622F, 0.7916F));

		PartDefinition cube_r250 = body2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 44).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1308F, -4.9002F, 0.0401F, -0.223F, 1.3935F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0104F, -8.8483F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(116, 112).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1001F, -1.9386F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(128, 133).addBox(0.0F, -3.9525F, -0.0399F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8685F, -0.9392F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(86, 133).addBox(0.0F, -3.2967F, -0.0424F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9575F, -2.8402F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(44, 33).addBox(-4.9595F, 0.1454F, -1.4401F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9595F, 9.5359F, -5.1516F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(88, 28).mirror().addBox(-6.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4626F, 10.574F, -5.1748F, 0.0551F, 1.1091F, 0.1453F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(96, 86).mirror().addBox(-4.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.841F, 10.3783F, -5.0466F, -0.2093F, 1.0848F, 0.4062F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(121, 95).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9587F, 9.9549F, -5.8668F, -0.5414F, 1.0704F, 0.7183F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(78, 49).mirror().addBox(-1.5322F, 0.3608F, -5.6557F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9595F, 9.5359F, -5.1516F, -0.6592F, -0.3904F, 0.2867F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(133, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1499F, -0.5386F, 0.1941F, 0.0755F, -0.2747F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(133, 67).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1499F, -0.5386F, 0.1445F, 0.1502F, -0.7075F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(67, 26).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1499F, -0.5386F, 0.0352F, 0.2051F, -1.3082F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(67, 30).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0999F, -2.4386F, 0.0507F, 0.2367F, -1.3583F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(133, 69).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0999F, -2.4386F, 0.1753F, 0.1677F, -0.7561F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(133, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0999F, -2.4386F, 0.2291F, 0.0787F, -0.3255F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1001F, -4.3386F, 0.069F, 0.2672F, -1.3904F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(133, 73).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1001F, -4.3386F, 0.2077F, 0.1827F, -0.7872F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(133, 89).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1001F, -4.3386F, 0.2645F, 0.0791F, -0.3595F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(133, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2001F, -6.3386F, 0.4061F, 0.1479F, -0.4307F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(121, 133).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2001F, -6.3386F, 0.3108F, 0.3034F, -0.8497F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(100, 46).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2001F, -6.3386F, 0.0822F, 0.4234F, -1.4733F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(100, 46).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2001F, -6.3386F, 0.0822F, -0.4234F, 1.4733F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(121, 133).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2001F, -6.3386F, 0.3108F, -0.3034F, 0.8497F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(133, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2001F, -6.3386F, 0.4061F, -0.1479F, 0.4307F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(98, 139).addBox(0.0F, -2.4926F, 0.7663F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5999F, -7.7386F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(133, 89).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1001F, -4.3386F, 0.2645F, -0.0791F, 0.3595F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(133, 73).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1001F, -4.3386F, 0.2077F, -0.1827F, 0.7872F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 46).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1001F, -4.3386F, 0.069F, -0.2672F, 1.3904F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(133, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0999F, -2.4386F, 0.2291F, -0.0787F, 0.3255F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(133, 69).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0999F, -2.4386F, 0.1753F, -0.1677F, 0.7561F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(67, 30).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0999F, -2.4386F, 0.0507F, -0.2367F, 1.3583F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(67, 26).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1499F, -0.5386F, 0.0352F, -0.2051F, 1.3082F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(133, 67).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1499F, -0.5386F, 0.1445F, -0.1502F, 0.7075F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, -0.65F, -2.875F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 11.2217F, -1.8031F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(133, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1499F, -0.5386F, 0.1941F, -0.0755F, 0.2747F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(95, 139).addBox(0.0F, -2.4927F, -0.0587F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9311F, -4.8497F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(78, 49).addBox(-0.4678F, 0.3608F, -5.6557F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, 9.5359F, -5.1516F, -0.6592F, 0.3904F, -0.2867F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(121, 95).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9587F, 9.9549F, -5.8668F, -0.5414F, -1.0704F, -0.7183F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(96, 86).addBox(-0.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.841F, 10.3783F, -5.0466F, -0.2093F, -1.0848F, -0.4062F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(88, 28).addBox(0.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4626F, 10.574F, -5.1748F, 0.0551F, -1.1091F, -0.1453F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 84).addBox(-2.9595F, 0.3608F, -5.2405F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9595F, 9.5359F, -5.1516F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(38, 68).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.9999F, -2.0386F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8438F, 5.0682F, -2.6529F, -0.3844F, 0.0981F, -0.1959F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(61, 67).addBox(-0.9453F, -1.1885F, 0.6157F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 1.0604F, -0.0148F, -0.0092F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(121, 80).addBox(-0.9453F, -4.1253F, 5.2137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 0.6589F, -0.0148F, -0.0092F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(110, 139).addBox(-0.5F, -0.375F, 2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(139, 108).addBox(-0.5F, -0.075F, 2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4342F, -5.7598F, 1.1594F, 1.3744F, 0.0027F, -0.0172F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(47, 119).addBox(-0.8945F, -0.7104F, -2.0572F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9296F, 0.8161F, -3.423F, -0.4008F, 0.0889F, 0.2888F));

		PartDefinition cube_r296 = bone2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(80, 41).addBox(-0.8945F, -3.6719F, -0.5247F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9296F, 0.8161F, -3.423F, -3.0625F, 0.0889F, 0.2888F));

		PartDefinition cube_r297 = bone2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 90).addBox(-0.8945F, -1.3664F, 0.1017F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9296F, 0.8161F, -3.423F, -1.8407F, 0.0889F, 0.2888F));

		PartDefinition cube_r298 = bone2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(118, 98).addBox(-0.8945F, 1.1192F, -1.8665F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9296F, 0.8161F, -3.423F, -1.2735F, 0.0889F, 0.2888F));

		PartDefinition cube_r299 = bone2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(118, 64).addBox(-0.8945F, -1.2247F, -1.0885F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9296F, 0.8161F, -3.423F, 0.1228F, 0.0889F, 0.2888F));

		PartDefinition cube_r300 = bone2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(21, 106).addBox(-0.9433F, 0.011F, -4.447F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F))
				.texOffs(127, 0).addBox(-0.9433F, 0.011F, -2.047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9175F, -3.0336F, -1.4546F, 0.8508F, 0.0027F, -0.0172F));

		PartDefinition cube_r301 = bone2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(48, 14).addBox(-0.9433F, -1.789F, -0.147F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 1.1126F, 0.0027F, -0.0172F));

		PartDefinition cube_r302 = bone2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(93, 49).addBox(-0.8861F, -1.1959F, 0.7464F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 2.6178F, -2.4595F, 1.0646F, 0.003F, -0.0172F));

		PartDefinition cube_r303 = bone2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(49, 108).addBox(-1.0673F, 1.7238F, -2.2851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0819F, 4.9781F, -4.8873F, -0.0852F, 0.3426F, 1.3523F));

		PartDefinition cube_r304 = bone2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(116, 126).addBox(-1.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0819F, 4.9781F, -4.8873F, 0.6565F, 0.3426F, 1.3523F));

		PartDefinition cube_r305 = bone2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(117, 6).addBox(-1.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0819F, 4.9781F, -4.8873F, 1.311F, 0.3426F, 1.3523F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8438F, 5.0682F, -2.6529F, -0.3844F, -0.0981F, 0.1959F));

		PartDefinition cube_r306 = bone4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(61, 67).mirror().addBox(-0.0547F, -1.1885F, 0.6157F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 1.0604F, 0.0148F, 0.0092F));

		PartDefinition cube_r307 = bone4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(121, 80).mirror().addBox(-0.0547F, -4.1253F, 5.2137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 0.6589F, 0.0148F, 0.0092F));

		PartDefinition cube_r308 = bone4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(110, 139).mirror().addBox(-0.5F, -0.375F, 2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(139, 108).mirror().addBox(-0.5F, -0.075F, 2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4342F, -5.7598F, 1.1594F, 1.3744F, -0.0027F, 0.0172F));

		PartDefinition cube_r309 = bone4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(47, 119).mirror().addBox(-0.1055F, -0.7104F, -2.0572F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9296F, 0.8161F, -3.423F, -0.4008F, -0.0889F, -0.2888F));

		PartDefinition cube_r310 = bone4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(80, 41).mirror().addBox(-0.1055F, -3.6719F, -0.5247F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9296F, 0.8161F, -3.423F, -3.0625F, -0.0889F, -0.2888F));

		PartDefinition cube_r311 = bone4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.1055F, -1.3664F, 0.1017F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9296F, 0.8161F, -3.423F, -1.8407F, -0.0889F, -0.2888F));

		PartDefinition cube_r312 = bone4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(118, 98).mirror().addBox(-0.1055F, 1.1192F, -1.8665F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9296F, 0.8161F, -3.423F, -1.2735F, -0.0889F, -0.2888F));

		PartDefinition cube_r313 = bone4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(118, 64).mirror().addBox(-0.1055F, -1.2247F, -1.0885F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9296F, 0.8161F, -3.423F, 0.1228F, -0.0889F, -0.2888F));

		PartDefinition cube_r314 = bone4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(21, 106).mirror().addBox(-0.0567F, 0.011F, -4.447F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(127, 0).mirror().addBox(-0.0567F, 0.011F, -2.047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9175F, -3.0336F, -1.4546F, 0.8508F, -0.0027F, 0.0172F));

		PartDefinition cube_r315 = bone4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(48, 14).mirror().addBox(-0.0567F, -1.789F, -0.147F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 1.1126F, -0.0027F, 0.0172F));

		PartDefinition cube_r316 = bone4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(93, 49).mirror().addBox(-0.1139F, -1.1959F, 0.7464F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 2.6178F, -2.4595F, 1.0646F, -0.003F, 0.0172F));

		PartDefinition cube_r317 = bone4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(49, 108).mirror().addBox(0.0673F, 1.7238F, -2.2851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0819F, 4.9781F, -4.8873F, -0.0852F, -0.3426F, -1.3523F));

		PartDefinition cube_r318 = bone4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(116, 126).mirror().addBox(0.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0819F, 4.9781F, -4.8873F, 0.6565F, -0.3426F, -1.3523F));

		PartDefinition cube_r319 = bone4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(117, 6).mirror().addBox(0.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0819F, 4.9781F, -4.8873F, 1.311F, -0.3426F, -1.3523F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4174F, 7.8081F, -6.6196F, 1.0422F, 0.1287F, -0.1151F));

		PartDefinition cube_r320 = leftArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(7, 115).addBox(6.0F, -0.8092F, 0.0838F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 1.2847F, -1.5107F, 0.1032F, -0.0786F, -0.067F));

		PartDefinition cube_r321 = leftArm1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(38, 132).addBox(-0.5F, 0.0F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6327F, 0.1215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r322 = leftArm1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(20, 139).addBox(-0.5F, 2.55F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.9413F, -0.2535F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r323 = leftArm1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(47, 124).addBox(-0.5F, -2.5F, -0.225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.0833F, -0.6626F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r324 = leftArm1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(35, 115).addBox(-0.5F, -1.9F, -0.575F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.6346F, 0.2087F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r325 = leftArm1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(40, 115).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9966F, 1.4861F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r326 = leftArm1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(128, 33).addBox(-0.5F, -2.9F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.6346F, 0.2087F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(127, 56).addBox(-0.8F, 0.4693F, -0.9734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2634F, 7.4523F, -0.6849F, -1.1266F, 0.2132F, 0.1095F));

		PartDefinition cube_r327 = leftArm2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(68, 121).addBox(6.5F, -4.3F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.3F, 3.9693F, 1.1266F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3235F, 4.8036F, 0.1164F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r328 = leftHand.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(28, 119).addBox(0.0F, -2.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -0.9F, 0.0785F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4174F, 7.8081F, -6.6196F, 0.3005F, -0.1287F, 0.1151F));

		PartDefinition cube_r329 = rightArm1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(116, 33).addBox(-7.0F, -0.8092F, 0.0838F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 1.2847F, -1.5107F, 0.1032F, 0.0786F, 0.067F));

		PartDefinition cube_r330 = rightArm1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(132, 57).addBox(-0.5F, 0.0F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6327F, 0.1215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightArm1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(139, 54).addBox(-0.5F, 2.55F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.9413F, -0.2535F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightArm1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(61, 124).addBox(-0.5F, -2.5F, -0.225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.0833F, -0.6626F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightArm1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(56, 115).addBox(-0.5F, -1.9F, -0.575F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.6346F, 0.2087F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightArm1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(115, 53).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9966F, 1.4861F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightArm1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(128, 38).addBox(-0.5F, -2.9F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.6346F, 0.2087F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(0, 128).addBox(-0.2F, 0.4693F, -0.9734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2634F, 7.4523F, -0.6849F, -1.1266F, -0.2132F, -0.1095F));

		PartDefinition cube_r336 = rightArm2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(121, 69).addBox(-7.5F, -4.3F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3F, 3.9693F, 1.1266F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3235F, 4.8036F, 0.1164F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r337 = rightHand.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(61, 119).addBox(-1.0F, -2.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -0.9F, 0.0785F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0309F, -7.769F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r338 = neck1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(131, 133).addBox(0.0F, -2.5459F, -0.1161F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1762F, -1.2844F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r339 = neck1.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0692F, -0.6696F, -0.0139F, 1.1536F, -1.7597F));

		PartDefinition cube_r340 = neck1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(133, 128).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0692F, -0.6696F, 0.8962F, 0.865F, -0.7205F));

		PartDefinition cube_r341 = neck1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(133, 130).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0692F, -0.6696F, 1.0921F, 0.4957F, -0.4158F));

		PartDefinition cube_r342 = neck1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(133, 130).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0692F, -0.6696F, 1.0921F, -0.4957F, 0.4158F));

		PartDefinition cube_r343 = neck1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(133, 128).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0692F, -0.6696F, 0.8962F, -0.865F, 0.7205F));

		PartDefinition cube_r344 = neck1.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(80, 64).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0692F, -0.6696F, -0.0139F, -1.1536F, 1.7597F));

		PartDefinition cube_r345 = neck1.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(105, 94).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(5, 140).addBox(0.0F, -2.2816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r347 = neck2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.3961F, 0.7764F, -0.9021F));

		PartDefinition cube_r348 = neck2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-5.737F, -0.79F, -0.4755F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0708F, 0.8501F, -1.5342F));

		PartDefinition cube_r349 = neck2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(82, 39).addBox(1.737F, -0.79F, -0.4755F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0708F, -0.8501F, 1.5342F));

		PartDefinition cube_r350 = neck2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(0, 134).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.3961F, -0.7764F, 0.9021F));

		PartDefinition cube_r351 = neck2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(106, 52).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6644F, -3.0471F, -0.4385F, -0.1264F, 0.0341F));

		PartDefinition cube_r352 = neck5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(30, 102).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.1576F, -5.7288F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r353 = neck5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(134, 0).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8919F, -0.7242F, -0.3307F, 1.2852F, -1.7302F));

		PartDefinition cube_r354 = neck5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(134, 2).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8919F, -0.7242F, 0.8805F, 1.1391F, -0.4593F));

		PartDefinition cube_r355 = neck5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(134, 24).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8919F, -2.7242F, 0.581F, 1.0455F, -0.7259F));

		PartDefinition cube_r356 = neck5.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(134, 24).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8919F, -2.7242F, 0.581F, -1.0455F, 0.7259F));

		PartDefinition cube_r357 = neck5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(134, 2).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8919F, -0.7242F, 0.8805F, -1.1391F, 0.4593F));

		PartDefinition cube_r358 = neck5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(134, 0).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8919F, -0.7242F, -0.3307F, -1.2852F, 1.7302F));

		PartDefinition cube_r359 = neck5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(55, 141).addBox(0.0F, -2.4566F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.788F, -2.6913F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r360 = neck5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(120, 139).addBox(0.0F, -2.3566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0664F, -0.7108F, 0.0087F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2641F, -2.5314F, 0.2214F, -0.1704F, -0.0381F));

		PartDefinition cube_r361 = neck4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(134, 26).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r362 = neck4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(134, 42).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.5513F, 0.9603F, -0.7443F));

		PartDefinition cube_r363 = neck4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(134, 42).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.5513F, -0.9603F, 0.7443F));

		PartDefinition cube_r364 = neck4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(134, 26).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r365 = neck4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(126, 139).addBox(0.0F, -1.4677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r366 = neck4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(123, 139).addBox(0.0F, -1.6677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r367 = neck4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(39, 85).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7757F, 0.6622F, -0.343F, -0.1951F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(134, 44).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.3293F, 0.5553F, -1.0638F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(50, 134).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(50, 134).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r371 = neck3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(134, 44).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.3293F, -0.5553F, 1.0638F));

		PartDefinition cube_r372 = neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(71, 141).addBox(0.5F, -1.6458F, -0.0223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6988F, -3.1055F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(129, 139).addBox(0.5F, -1.669F, 0.0228F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(88, 14).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4682F, -3.2726F, -0.4417F, -0.0562F, -0.1183F));

		PartDefinition cube_r375 = neck.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(74, 141).addBox(0.5F, -1.7207F, -0.1013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0805F, -1.6753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(49, 102).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.703F, 0.2452F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r377 = neck.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(134, 50).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1921F, -1.4072F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r378 = neck.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(134, 50).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1921F, -1.4072F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9209F, -2.2362F, 0.0804F, -0.2175F, -0.0174F));

		PartDefinition cube_r379 = neck6.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(141, 75).addBox(0.5F, -0.6207F, -1.8013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 139).addBox(0.5F, -1.5207F, -0.1013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -1.0498F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r380 = neck6.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(102, 100).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r381 = neck6.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(134, 52).mirror().addBox(-2.0182F, 0.5591F, -0.1457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.5254F, 0.741F, -0.9857F));

		PartDefinition cube_r382 = neck6.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(134, 52).addBox(0.0182F, 0.5591F, -0.1457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1696F, -1.2074F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(118, 84).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.5F, -1.3189F, -4.137F, -2.5613F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(97, 6).addBox(-1.0F, -0.1055F, -0.2278F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(-0.5F, -1.1159F, -2.2397F, -1.5577F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(93, 59).addBox(-1.0F, -0.2224F, -0.0355F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(-0.5F, -1.0769F, -4.3211F, -1.3308F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(104, 48).addBox(-1.5F, -0.1874F, 0.1201F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -0.7769F, -6.2211F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(109, 64).addBox(-1.0F, -0.1474F, 0.173F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.5519F, -7.1711F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(102, 117).addBox(-0.513F, 2.9589F, -0.2661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.013F, 1.41F, -11.4897F, -0.9817F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(125, 101).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 2.3416F, -13.2867F, -1.0952F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(125, 97).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 2.8469F, -14.1194F, -1.0254F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(111, 106).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.8974F, -12.4169F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(118, 103).addBox(-1.0F, -3.15F, -0.225F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5229F, -9.7823F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(105, 134).addBox(-0.5F, -0.375F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4151F, -10.9881F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(77, 134).addBox(-0.5F, -2.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5936F, -11.2293F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(92, 125).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.6952F, -9.7293F, -1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(102, 138).addBox(-0.495F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 4.8F, -16.2748F, -0.5629F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(92, 136).addBox(-0.495F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 5.76F, -16.5546F, -0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 140).addBox(-0.5F, -0.9913F, -0.0155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.725F, -16.2762F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(140, 123).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7637F, -16.5519F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(125, 63).addBox(-0.5F, -0.7845F, -2.1384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6732F, -4.6401F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(40, 125).addBox(-0.5F, -0.7716F, -0.9007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6732F, -4.6401F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(7, 125).addBox(-0.5F, -0.0165F, -0.7563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6732F, -4.6401F, 1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(17, 69).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.3923F, -9.5034F, 0.165F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(83, 82).addBox(-0.9F, 1.0F, -3.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.6017F, -6.8696F, 0.2697F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(44, 24).addBox(-2.0F, -1.025F, -7.05F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.094F, 1.1459F, 0.1825F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(72, 134).addBox(-0.5F, 0.0128F, 0.169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6732F, -4.6401F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(83, 75).addBox(-1.5F, 0.4371F, -3.1968F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2775F, -0.2868F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(93, 55).addBox(-1.5F, -0.2F, -1.975F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(71, 10).addBox(-1.5F, -0.5F, -1.975F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0075F, -1.9968F, 0.9512F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9338F, 0.4149F, -6.7129F, 0.0F, 0.0436F, -0.0873F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(131, 79).addBox(-4.7499F, -2.448F, -1.8158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(131, 75).addBox(-4.7499F, -2.448F, -1.4158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 2.8491F, 1.1384F, 0.098F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(7, 125).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.3024F, -2.3751F, 1.5971F, 1.6632F, 0.8095F, 0.4667F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(68, 76).addBox(-1.8617F, -1.0966F, -5.3736F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.2113F, 0.1311F, 0.054F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(128, 89).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7889F, -0.8594F, -1.6973F, -1.2016F, 0.2173F, -0.5171F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(123, 37).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7896F, -0.2636F, -3.0384F, -1.0993F, 0.5009F, -0.404F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(123, 31).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7896F, -0.2636F, -3.0384F, -0.9093F, 0.1389F, 0.1755F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(63, 113).addBox(-2.6339F, -4.1968F, 3.68F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 2.0879F, 0.0316F, 0.3178F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(28, 113).addBox(-2.8081F, -1.3086F, 3.602F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 2.0525F, -0.0226F, 0.3105F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(7, 120).addBox(-2.6503F, 2.085F, 2.7335F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 2.4697F, 0.1122F, 0.318F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(18, 135).addBox(-0.4646F, -0.8159F, -0.1613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3802F, -0.434F, 0.2785F, -2.867F, -0.0777F, 0.2283F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(43, 135).addBox(-0.4646F, -0.7845F, -0.8941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3802F, -0.434F, 0.2785F, -2.6924F, -0.0777F, 0.2283F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(117, 16).addBox(-0.4739F, -1.8386F, -1.4993F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.3802F, -0.434F, 0.2785F, -1.8594F, -0.1391F, 0.2514F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(19, 127).addBox(-1.0346F, 4.3106F, 5.4656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.075F, -0.0349F, 0.0175F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(140, 120).addBox(-1.0557F, -2.0113F, -9.9447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.3092F, 0.1572F, 0.0339F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(54, 122).addBox(-1.0557F, -0.4525F, -9.9176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.1522F, 0.1572F, 0.0339F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(100, 64).addBox(-1.0689F, 0.3944F, -9.0047F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, -0.0747F, 0.1572F, 0.0339F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(105, 72).addBox(-1.0709F, -6.307F, -1.451F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 1.6488F, 0.1572F, 0.0339F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(113, 58).addBox(-1.0709F, -2.9113F, -4.544F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.3834F, 0.1572F, 0.0339F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(57, 134).addBox(-1.0567F, -10.0668F, -1.2565F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 1.5571F, 0.1572F, 0.0339F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(132, 96).addBox(-0.9667F, -9.6888F, -2.7149F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 1.319F, 0.1665F, 0.0771F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(104, 0).addBox(-1.0739F, -5.7541F, -1.7338F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.5099F, 0.1572F, 0.0339F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(24, 90).addBox(-1.2568F, -4.8285F, 2.8275F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 1.9949F, 0.1256F, 0.0574F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(40, 98).addBox(-1.2487F, -6.7489F, 3.5745F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 2.1719F, 0.1361F, 0.0767F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(131, 16).addBox(-0.9667F, -8.7312F, -4.5491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 1.0136F, 0.1665F, 0.0771F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(37, 136).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7764F, 7.0886F, -8.6935F, 0.3708F, 0.1484F, 0.1314F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(136, 28).addBox(-0.3997F, -1.7358F, -3.7783F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2411F, 6.636F, -4.4365F, 0.3754F, 0.1357F, 0.1642F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(135, 116).addBox(-0.3997F, -0.9962F, -2.8589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2411F, 6.636F, -4.4365F, 0.3842F, 0.1357F, 0.1642F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(50, 130).addBox(-0.4497F, -0.69F, -1.846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2411F, 6.636F, -4.4365F, 0.4365F, 0.1357F, 0.1642F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(130, 124).addBox(-0.4497F, -0.2845F, -0.9507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(121, 135).addBox(-0.4497F, -0.0384F, 0.9744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2411F, 6.636F, -4.4365F, 0.5238F, 0.1357F, 0.1642F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(110, 135).addBox(-0.4497F, -0.348F, 0.0177F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2411F, 6.636F, -4.4365F, 0.454F, 0.1357F, 0.1642F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(136, 16).addBox(-0.4497F, 0.0998F, 1.9234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(140, 139).addBox(-0.4497F, 0.6998F, 3.7234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(136, 8).addBox(-0.4497F, 0.0998F, 2.9234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2411F, 6.636F, -4.4365F, 0.5674F, 0.1357F, 0.1642F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(91, 64).addBox(-1.0739F, -4.1036F, -2.546F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.4576F, 0.1572F, 0.0339F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5F, -0.575F, -1.275F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3126F, -0.0248F, -0.3625F, 0.4296F, 0.1049F, 0.0336F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(53, 68).addBox(-0.2421F, -5.2089F, -2.1383F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5564F, 5.1961F, 1.4542F, 0.1242F, 0.1049F, 0.0336F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(32, 69).addBox(-1.2842F, 0.295F, 0.5132F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.056F, -0.0668F, -0.0231F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(90, 100).addBox(-0.1387F, -6.1239F, -1.6071F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5564F, 5.1961F, 1.4542F, 0.0525F, 0.1753F, -0.0103F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(140, 90).addBox(-1.06F, -4.0072F, -2.5358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, -2.0944F, -0.0349F, 0.0175F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(140, 87).addBox(-1.06F, -3.4839F, 3.2246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, -0.7854F, -0.0349F, 0.0175F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(102, 111).addBox(-1.0888F, 0.0324F, -0.0523F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.384F, -0.0175F, 0.0173F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(0, 119).addBox(-1.06F, -0.7359F, 1.8387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, -0.0087F, -0.0349F, 0.0175F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(61, 91).addBox(-0.5F, -2.1F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, 1.0332F, 3.3367F, -0.672F, -0.0349F, 0.0175F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(123, 128).addBox(-1.06F, 0.902F, 3.5047F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.2182F, -0.0349F, 0.0175F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(13, 130).addBox(-1.06F, 3.1591F, 2.3322F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.5672F, -0.0349F, 0.0175F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(126, 67).addBox(-1.06F, -1.2125F, 6.1331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, -0.637F, -0.0349F, 0.0175F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(126, 9).addBox(-1.06F, -3.2581F, 5.8884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(125, 105).addBox(-1.06F, -3.0581F, 5.8884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, -0.9861F, -0.0349F, 0.0175F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(109, 112).addBox(-1.06F, 3.887F, 2.3111F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.2793F, -0.0349F, 0.0175F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(114, 88).addBox(-0.9566F, -1.9046F, 3.7103F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, -0.9294F, -0.0349F, 0.0175F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(40, 120).addBox(-0.9566F, 3.4653F, 2.6129F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.0305F, -0.0349F, 0.0175F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(101, 122).addBox(-0.9566F, 0.8987F, 5.1888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, -0.4494F, -0.0349F, 0.0175F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(115, 138).addBox(-0.9566F, 5.9778F, 1.568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.5105F, -0.0349F, 0.0175F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(14, 119).addBox(-0.9566F, 2.0209F, 0.9891F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.2836F, -0.0349F, 0.0175F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(136, 46).addBox(-0.9566F, 3.9478F, 1.1624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.24F, -0.0349F, 0.0175F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(140, 105).addBox(-0.9165F, 2.3751F, 0.1299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 1.1563F, -0.0349F, 0.0175F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(140, 102).addBox(-0.9165F, 0.4367F, 1.5937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.1963F, -0.0349F, 0.0175F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(126, 71).addBox(-0.9165F, 0.5373F, 1.6513F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(140, 72).addBox(-0.9165F, -0.0627F, 1.6513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, -0.1091F, -0.0349F, 0.0175F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(123, 112).addBox(-0.9566F, 2.3229F, -3.2617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 1.8326F, -0.0349F, 0.0175F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(136, 81).addBox(-0.6972F, 3.971F, -8.6706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, -0.5668F, 0.1721F, 0.036F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(136, 78).addBox(-0.6972F, -5.4686F, -8.0042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(136, 75).addBox(-0.6972F, -5.4686F, -7.3542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.4804F, 0.1721F, 0.036F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(48, 136).addBox(-0.6972F, -7.8615F, -3.8498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.9603F, 0.1721F, 0.036F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(77, 116).addBox(-0.6972F, -8.2638F, -3.4818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 1.0912F, 0.1721F, 0.036F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(97, 136).addBox(-0.6972F, -8.1678F, 3.3877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(136, 84).addBox(-0.6972F, -8.6678F, 3.3877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 1.9639F, 0.1721F, 0.036F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(89, 119).addBox(-1.0393F, -2.9563F, -3.4961F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(110, 11).addBox(-1.0393F, -1.9563F, -4.8961F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, -0.0049F, 0.1572F, 0.0339F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(116, 122).addBox(-1.0393F, -2.8411F, -4.612F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.1696F, 0.1572F, 0.0339F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(102, 106).addBox(-1.0393F, -5.1736F, -1.5147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 0.9114F, 0.1572F, 0.0339F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(127, 24).addBox(-1.0393F, -2.6081F, 2.7086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(127, 43).addBox(-1.0393F, -2.2081F, 2.7086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 1.6968F, 0.1572F, 0.0339F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(26, 135).addBox(-1.0393F, 1.4515F, 1.6802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 3.0145F, 0.1572F, 0.0339F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(47, 139).addBox(-1.0393F, 1.7633F, 2.6645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1436F, 5.1961F, 0.1542F, 2.7003F, 0.1572F, 0.0339F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(25, 139).addBox(-0.4567F, -0.5627F, 0.9867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 139).addBox(-0.7067F, -0.5627F, 0.9867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0687F, 1.4812F, 0.7367F, 1.7924F, 0.1744F, 0.042F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(139, 136).addBox(-0.4942F, -0.3864F, 0.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.0784F, 0.0057F, 0.3422F, 0.8045F, 0.1308F, 0.0417F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(139, 63).addBox(-0.5F, -0.5796F, -0.1448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(58, 139).addBox(-0.5F, -0.5796F, -0.4448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0809F, -0.5501F, 0.1026F, 0.6266F, 0.0961F, 0.0937F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(111, 100).addBox(-0.6176F, -1.7237F, -0.8977F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0687F, 1.4812F, 0.7367F, 0.2066F, 0.1522F, -0.0038F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(35, 140).addBox(-0.6069F, -0.552F, 0.7182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(140, 20).addBox(-0.6069F, -1.052F, 0.6181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0687F, 1.4812F, 0.7367F, -1.2968F, 0.1744F, 0.042F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(141, 0).addBox(-0.6069F, 1.1761F, 0.358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0687F, 1.4812F, 0.7367F, 0.0558F, 0.1744F, 0.042F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(140, 126).addBox(-0.6069F, 1.0567F, -2.3367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0687F, 1.4812F, 0.7367F, 1.2339F, 0.1744F, 0.042F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(126, 20).addBox(-0.6069F, -1.3649F, -2.2773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0687F, 1.4812F, 0.7367F, 2.2375F, 0.1744F, 0.042F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(140, 12).addBox(-0.6069F, -0.7422F, 0.2532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0687F, 1.4812F, 0.7367F, -2.6931F, 0.1744F, 0.042F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(123, 124).addBox(-0.4942F, 0.0407F, -0.1898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0784F, 0.0057F, 0.3422F, -1.4295F, 0.1308F, 0.0417F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(135, 139).addBox(-0.5F, -0.1892F, -0.6895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0809F, -0.5501F, 0.1026F, -0.1762F, 0.0961F, 0.0937F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(13, 89).addBox(-1.0489F, 1.3131F, -6.0863F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 1.4835F, -0.0356F, 0.019F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(110, 16).addBox(-1.0489F, 2.8524F, 1.0316F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5103F, -1.2233F, 0.8399F, 0.2618F, -0.0356F, 0.019F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9338F, 0.4149F, -6.7129F, 0.0F, -0.0436F, 0.0873F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(131, 79).mirror().addBox(3.7499F, -2.448F, -1.8158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(131, 75).mirror().addBox(3.7499F, -2.448F, -1.4158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 2.8491F, -1.1384F, -0.098F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(7, 125).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.3024F, -2.3751F, 1.5971F, 1.6632F, -0.8095F, -0.4667F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(68, 76).mirror().addBox(0.8617F, -1.0966F, -5.3736F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.2113F, -0.1311F, -0.054F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(128, 89).mirror().addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7889F, -0.8594F, -1.6973F, -1.2016F, -0.2173F, 0.5171F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(123, 37).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7896F, -0.2636F, -3.0384F, -1.0993F, -0.5009F, 0.404F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(123, 31).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7896F, -0.2636F, -3.0384F, -0.9093F, -0.1389F, -0.1755F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(63, 113).mirror().addBox(1.6339F, -4.1968F, 3.68F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 2.0879F, -0.0316F, -0.3178F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(28, 113).mirror().addBox(1.8081F, -1.3086F, 3.602F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 2.0525F, 0.0226F, -0.3105F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(7, 120).mirror().addBox(1.6503F, 2.085F, 2.7335F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 2.4697F, -0.1122F, -0.318F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(18, 135).mirror().addBox(-0.5354F, -0.8159F, -0.1613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.3802F, -0.434F, 0.2785F, -2.867F, 0.0777F, -0.2283F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(43, 135).mirror().addBox(-0.5354F, -0.7845F, -0.8941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.3802F, -0.434F, 0.2785F, -2.6924F, 0.0777F, -0.2283F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(117, 16).mirror().addBox(-0.526F, -1.8386F, -1.4993F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(0.3802F, -0.434F, 0.2785F, -1.8594F, 0.1391F, -0.2514F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(19, 127).mirror().addBox(0.0346F, 4.3106F, 5.4656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.075F, 0.0349F, -0.0175F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(140, 120).mirror().addBox(0.0557F, -2.0113F, -9.9447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.3092F, -0.1572F, -0.0339F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(54, 122).mirror().addBox(0.0557F, -0.4525F, -9.9176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.1522F, -0.1572F, -0.0339F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(100, 64).mirror().addBox(0.0689F, 0.3944F, -9.0047F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, -0.0747F, -0.1572F, -0.0339F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(105, 72).mirror().addBox(0.0709F, -6.307F, -1.451F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 1.6488F, -0.1572F, -0.0339F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(113, 58).mirror().addBox(0.0709F, -2.9113F, -4.544F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.3834F, -0.1572F, -0.0339F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(57, 134).mirror().addBox(0.0567F, -10.0668F, -1.2565F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 1.5571F, -0.1572F, -0.0339F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(132, 96).mirror().addBox(-0.0333F, -9.6888F, -2.7149F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 1.319F, -0.1665F, -0.0771F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(0.0739F, -5.7541F, -1.7338F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.5099F, -0.1572F, -0.0339F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(24, 90).mirror().addBox(0.2568F, -4.8285F, 2.8275F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 1.9949F, -0.1256F, -0.0574F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(40, 98).mirror().addBox(0.2487F, -6.7489F, 3.5745F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 2.1719F, -0.1361F, -0.0767F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(131, 16).mirror().addBox(-0.0333F, -8.7312F, -4.5491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 1.0136F, -0.1665F, -0.0771F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(37, 136).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.7764F, 7.0886F, -8.6935F, 0.3708F, -0.1484F, -0.1314F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(136, 28).mirror().addBox(-0.6003F, -1.7358F, -3.7783F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2411F, 6.636F, -4.4365F, 0.3754F, -0.1357F, -0.1642F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(135, 116).mirror().addBox(-0.6003F, -0.9962F, -2.8589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2411F, 6.636F, -4.4365F, 0.3842F, -0.1357F, -0.1642F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(50, 130).mirror().addBox(-0.5503F, -0.69F, -1.846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2411F, 6.636F, -4.4365F, 0.4365F, -0.1357F, -0.1642F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(130, 124).mirror().addBox(-0.5503F, -0.2845F, -0.9507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(121, 135).mirror().addBox(-0.5503F, -0.0384F, 0.9744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2411F, 6.636F, -4.4365F, 0.5238F, -0.1357F, -0.1642F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(110, 135).mirror().addBox(-0.5503F, -0.348F, 0.0177F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2411F, 6.636F, -4.4365F, 0.454F, -0.1357F, -0.1642F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(136, 16).mirror().addBox(-0.5503F, 0.0998F, 1.9234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(140, 139).mirror().addBox(-0.5503F, 0.6998F, 3.7234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(136, 8).mirror().addBox(-0.5503F, 0.0998F, 2.9234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2411F, 6.636F, -4.4365F, 0.5674F, -0.1357F, -0.1642F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(91, 64).mirror().addBox(0.0739F, -4.1036F, -2.546F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.4576F, -0.1572F, -0.0339F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.5F, -0.575F, -1.275F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3126F, -0.0248F, -0.3625F, 0.4296F, -0.1049F, -0.0336F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(53, 68).mirror().addBox(-0.7579F, -5.2089F, -2.1383F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5564F, 5.1961F, 1.4542F, 0.1242F, -0.1049F, -0.0336F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(32, 69).mirror().addBox(0.2842F, 0.295F, 0.5132F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.056F, 0.0668F, 0.0231F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(90, 100).mirror().addBox(-0.8613F, -6.1239F, -1.6071F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5564F, 5.1961F, 1.4542F, 0.0525F, -0.1753F, 0.0103F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(140, 90).mirror().addBox(0.06F, -4.0072F, -2.5358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, -2.0944F, 0.0349F, -0.0175F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(140, 87).mirror().addBox(0.06F, -3.4839F, 3.2246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, -0.7854F, 0.0349F, -0.0175F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(102, 111).mirror().addBox(0.0888F, 0.0324F, -0.0523F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.384F, 0.0175F, -0.0173F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(0.06F, -0.7359F, 1.8387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, -0.0087F, 0.0349F, -0.0175F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(61, 91).mirror().addBox(-0.5F, -2.1F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1767F, 1.0332F, 3.3367F, -0.672F, 0.0349F, -0.0175F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(123, 128).mirror().addBox(0.06F, 0.902F, 3.5047F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.2182F, 0.0349F, -0.0175F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(13, 130).mirror().addBox(0.06F, 3.1591F, 2.3322F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.5672F, 0.0349F, -0.0175F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(126, 67).mirror().addBox(0.06F, -1.2125F, 6.1331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, -0.637F, 0.0349F, -0.0175F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(126, 9).mirror().addBox(0.06F, -3.2581F, 5.8884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(125, 105).mirror().addBox(0.06F, -3.0581F, 5.8884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, -0.9861F, 0.0349F, -0.0175F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(109, 112).mirror().addBox(0.06F, 3.887F, 2.3111F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.2793F, 0.0349F, -0.0175F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(114, 88).mirror().addBox(-0.0434F, -1.9046F, 3.7103F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, -0.9294F, 0.0349F, -0.0175F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(40, 120).mirror().addBox(-0.0434F, 3.4653F, 2.6129F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.0305F, 0.0349F, -0.0175F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(101, 122).mirror().addBox(-0.0434F, 0.8987F, 5.1888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, -0.4494F, 0.0349F, -0.0175F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(115, 138).mirror().addBox(-0.0434F, 5.9778F, 1.568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.5105F, 0.0349F, -0.0175F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(14, 119).mirror().addBox(-0.0434F, 2.0209F, 0.9891F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.2836F, 0.0349F, -0.0175F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(136, 46).mirror().addBox(-0.0434F, 3.9478F, 1.1624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.24F, 0.0349F, -0.0175F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(140, 105).mirror().addBox(-0.0835F, 2.3751F, 0.1299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 1.1563F, 0.0349F, -0.0175F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(140, 102).mirror().addBox(-0.0835F, 0.4367F, 1.5937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.1963F, 0.0349F, -0.0175F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(126, 71).mirror().addBox(-0.0835F, 0.5373F, 1.6513F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(140, 72).mirror().addBox(-0.0835F, -0.0627F, 1.6513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, -0.1091F, 0.0349F, -0.0175F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(123, 112).mirror().addBox(-0.0434F, 2.3229F, -3.2617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 1.8326F, 0.0349F, -0.0175F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(136, 81).mirror().addBox(-0.3028F, 3.971F, -8.6706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, -0.5668F, -0.1721F, -0.036F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(136, 78).mirror().addBox(-0.3028F, -5.4686F, -8.0042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(136, 75).mirror().addBox(-0.3028F, -5.4686F, -7.3542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.4804F, -0.1721F, -0.036F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(48, 136).mirror().addBox(-0.3028F, -7.8615F, -3.8498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.9603F, -0.1721F, -0.036F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(77, 116).mirror().addBox(-0.3028F, -8.2638F, -3.4818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 1.0912F, -0.1721F, -0.036F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(97, 136).mirror().addBox(-0.3028F, -8.1678F, 3.3877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(136, 84).mirror().addBox(-0.3028F, -8.6678F, 3.3877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 1.9639F, -0.1721F, -0.036F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(89, 119).mirror().addBox(0.0393F, -2.9563F, -3.4961F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(110, 11).mirror().addBox(0.0393F, -1.9563F, -4.8961F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, -0.0049F, -0.1572F, -0.0339F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(116, 122).mirror().addBox(0.0393F, -2.8411F, -4.612F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.1696F, -0.1572F, -0.0339F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(102, 106).mirror().addBox(0.0393F, -5.1736F, -1.5147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 0.9114F, -0.1572F, -0.0339F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(127, 24).mirror().addBox(0.0393F, -2.6081F, 2.7086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(127, 43).mirror().addBox(0.0393F, -2.2081F, 2.7086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 1.6968F, -0.1572F, -0.0339F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(26, 135).mirror().addBox(0.0393F, 1.4515F, 1.6802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 3.0145F, -0.1572F, -0.0339F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(47, 139).mirror().addBox(0.0393F, 1.7633F, 2.6645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1436F, 5.1961F, 0.1542F, 2.7003F, -0.1572F, -0.0339F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(25, 139).mirror().addBox(-0.5433F, -0.5627F, 0.9867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 139).mirror().addBox(-0.2933F, -0.5627F, 0.9867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0687F, 1.4812F, 0.7367F, 1.7924F, -0.1744F, -0.042F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(139, 136).mirror().addBox(-0.5058F, -0.3864F, 0.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.0784F, 0.0057F, 0.3422F, 0.8045F, -0.1308F, -0.0417F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(139, 63).mirror().addBox(-0.5F, -0.5796F, -0.1448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(58, 139).mirror().addBox(-0.5F, -0.5796F, -0.4448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0809F, -0.5501F, 0.1026F, 0.6266F, -0.0961F, -0.0937F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(111, 100).mirror().addBox(-0.3824F, -1.7237F, -0.8977F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0687F, 1.4812F, 0.7367F, 0.2066F, -0.1522F, 0.0038F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(35, 140).mirror().addBox(-0.3931F, -0.552F, 0.7182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(140, 20).mirror().addBox(-0.3931F, -1.052F, 0.6181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0687F, 1.4812F, 0.7367F, -1.2968F, -0.1744F, -0.042F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(141, 0).mirror().addBox(-0.3931F, 1.1761F, 0.358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.0687F, 1.4812F, 0.7367F, 0.0558F, -0.1744F, -0.042F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(140, 126).mirror().addBox(-0.3931F, 1.0567F, -2.3367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0687F, 1.4812F, 0.7367F, 1.2339F, -0.1744F, -0.042F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(126, 20).mirror().addBox(-0.3931F, -1.3649F, -2.2773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0687F, 1.4812F, 0.7367F, 2.2375F, -0.1744F, -0.042F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(140, 12).mirror().addBox(-0.3931F, -0.7422F, 0.2532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0687F, 1.4812F, 0.7367F, -2.6931F, -0.1744F, -0.042F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(123, 124).mirror().addBox(-0.5058F, 0.0407F, -0.1898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0784F, 0.0057F, 0.3422F, -1.4295F, -0.1308F, -0.0417F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(135, 139).mirror().addBox(-0.5F, -0.1892F, -0.6895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0809F, -0.5501F, 0.1026F, -0.1762F, -0.0961F, -0.0937F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(13, 89).mirror().addBox(0.0489F, 1.3131F, -6.0863F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 1.4835F, 0.0356F, -0.019F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(110, 16).mirror().addBox(0.0489F, 2.8524F, 1.0316F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -1.2233F, 0.8399F, 0.2618F, 0.0356F, -0.019F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4883F, 1.8185F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(114, 93).mirror().addBox(0.0F, -0.6187F, -4.0452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.2967F, -0.0175F, 0.0F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(116, 130).mirror().addBox(0.0103F, -1.3554F, -2.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, 0.2618F, -0.0175F, 0.0F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(77, 130).mirror().addBox(0.003F, -1.0001F, -6.9729F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.2269F, -0.0175F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(114, 74).mirror().addBox(0.01F, -0.679F, -6.024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.2793F, -0.0175F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(122, 52).mirror().addBox(-0.025F, 0.2327F, -8.1174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(137, 57).mirror().addBox(-0.025F, 0.2327F, -6.1674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.192F, -0.0175F, 0.0F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(113, 43).mirror().addBox(-1.2134F, -2.4709F, -9.4769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.0268F, -0.1745F, 0.035F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(-1.6532F, -2.2684F, -10.847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.0463F, -0.2235F, 0.0234F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(21, 123).mirror().addBox(-0.6686F, -2.6464F, -2.2795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, -0.1714F, -0.2051F, 0.0341F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(131, 4).mirror().addBox(-0.4983F, -0.9416F, -3.3073F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6374F, -2.9059F, -13.9767F, -0.4927F, -0.1312F, 0.0542F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(136, 4).mirror().addBox(-0.4384F, -3.443F, -7.9936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1953F, 0.963F, -11.4581F, -0.4045F, -0.1138F, 0.0541F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(121, 87).mirror().addBox(-0.6818F, -2.2957F, -4.4537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, -0.3204F, -0.2051F, 0.0389F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(118, 108).mirror().addBox(-0.4272F, -1.2283F, -6.6319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, -0.566F, -0.1092F, 0.0638F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(95, 36).mirror().addBox(-0.4272F, -1.1072F, -7.496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, -0.5834F, -0.1092F, 0.0638F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(30, 139).mirror().addBox(-0.6984F, -2.6058F, 0.0827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, 0.1209F, -0.2051F, 0.0341F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(121, 91).mirror().addBox(0.0F, -0.913F, -1.991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, 0.2269F, -0.0175F, 0.0F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(122, 48).mirror().addBox(0.0F, -0.8371F, -1.9337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, 0.5236F, -0.0175F, 0.0F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(97, 130).mirror().addBox(-0.0027F, 0.3114F, -5.2012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0183F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.1571F, -0.0175F, 0.0F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(14, 114).mirror().addBox(-0.0027F, 0.6226F, -7.0236F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.2182F, -0.0175F, 0.0F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(130, 112).mirror().addBox(-1.2262F, 1.7733F, -8.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.3846F, -0.1745F, 0.035F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(130, 120).mirror().addBox(-1.2262F, 2.9542F, -8.6203F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0156F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.5329F, -0.1745F, 0.035F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(114, 69).mirror().addBox(-1.6783F, 1.5251F, -10.7496F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.3736F, -0.2235F, 0.0234F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(121, 76).mirror().addBox(-0.6686F, -1.618F, -1.516F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, -0.3198F, -0.2051F, 0.0341F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(88, 109).mirror().addBox(-0.6818F, -1.6612F, -4.4242F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, -0.2943F, -0.2051F, 0.0389F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(140, 66).mirror().addBox(-0.3388F, -0.6725F, -5.4696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, -0.5136F, -0.1092F, 0.0638F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(137, 93).mirror().addBox(-0.4272F, -5.7113F, -5.704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(137, 96).mirror().addBox(-0.4272F, -6.3113F, -5.704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.1953F, 0.963F, -11.4581F, 0.1845F, -0.1092F, 0.0638F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(137, 99).mirror().addBox(-0.4272F, -2.1853F, -8.2797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-1.1953F, 0.963F, -11.4581F, -0.47F, -0.1092F, 0.0638F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(116, 117).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0278F, -5.4043F, -0.1828F, -0.3006F, 0.0547F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(21, 118).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0278F, -5.4043F, 0.1175F, -0.084F, 0.0813F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(82, 111).mirror().addBox(0.0F, -2.1607F, -0.9317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, 1.0123F, -0.0175F, 0.0F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(108, 6).mirror().addBox(0.003F, 6.8342F, -1.604F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -1.7104F, -0.0175F, 0.0F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(115, 48).mirror().addBox(0.0103F, -4.7022F, -1.0059F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, 1.7017F, -0.0175F, 0.0F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(130, 116).mirror().addBox(-0.0027F, 1.2207F, -7.7192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, -0.3054F, -0.0175F, 0.0F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(91, 72).mirror().addBox(-0.6686F, -2.218F, -0.516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, -0.321F, -0.24F, 0.0344F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(53, 138).mirror().addBox(-0.3388F, -6.3361F, -1.1324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, 0.9089F, -0.1092F, 0.0638F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(137, 60).mirror().addBox(-0.3388F, -2.2198F, 6.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.0703F, 0.963F, -11.4581F, 2.3051F, -0.1092F, 0.0638F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(116, 134).mirror().addBox(-0.4272F, -7.8203F, -0.1358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-1.1953F, 0.963F, -11.4581F, 0.9263F, -0.1092F, 0.0638F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(134, 136).mirror().addBox(-0.025F, -4.9311F, -2.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, 1.117F, -0.0175F, 0.0F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(135, 112).mirror().addBox(-0.025F, -6.6701F, -0.4575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, 1.597F, -0.0175F, 0.0F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(124, 16).mirror().addBox(-0.025F, -3.4857F, 5.7052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.6704F, 0.963F, -0.0581F, 2.6878F, -0.0175F, 0.0F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(55, 130).mirror().addBox(-0.4983F, -0.7947F, -2.449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 130).mirror().addBox(-0.4983F, -0.8947F, -1.649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 130).mirror().addBox(-0.4983F, -0.8947F, -0.849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6374F, -2.9059F, -13.9767F, -0.58F, -0.1312F, 0.0542F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(136, 32).mirror().addBox(-0.5F, -0.65F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(136, 36).mirror().addBox(-0.5F, -0.85F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(141, 3).mirror().addBox(-0.5F, -0.85F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9897F, -2.0156F, -12.6096F, -0.451F, -0.166F, 0.0545F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(62, 135).mirror().addBox(-0.5F, -0.9765F, -0.9124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9897F, -2.0156F, -12.6096F, -0.3987F, -0.166F, 0.0545F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(21, 118).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0278F, -5.4043F, 0.1175F, 0.084F, -0.0813F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(116, 117).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0278F, -5.4043F, -0.1828F, 0.3006F, -0.0547F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(116, 134).addBox(-0.5728F, -7.8203F, -0.1358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(1.1953F, 0.963F, -11.4581F, 0.9263F, 0.1092F, -0.0638F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(137, 99).addBox(-0.5728F, -2.1853F, -8.2797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(1.1953F, 0.963F, -11.4581F, -0.47F, 0.1092F, -0.0638F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(137, 96).addBox(-0.5728F, -6.3113F, -5.704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(137, 93).addBox(-0.5728F, -5.7113F, -5.704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1953F, 0.963F, -11.4581F, 0.1845F, 0.1092F, -0.0638F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(137, 60).addBox(-0.6612F, -2.2198F, 6.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, 2.3051F, 0.1092F, -0.0638F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(53, 138).addBox(-0.6612F, -6.3361F, -1.1324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, 0.9089F, 0.1092F, -0.0638F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(140, 66).addBox(-0.6612F, -0.6725F, -5.4696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, -0.5136F, 0.1092F, -0.0638F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(88, 109).addBox(-0.3182F, -1.6612F, -4.4242F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, -0.2943F, 0.2051F, -0.0389F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(91, 72).addBox(-0.3314F, -2.218F, -0.516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, -0.321F, 0.24F, -0.0344F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(121, 76).addBox(-0.3314F, -1.618F, -1.516F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, -0.3198F, 0.2051F, -0.0341F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(114, 69).addBox(0.6783F, 1.5251F, -10.7496F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.3736F, 0.2235F, -0.0234F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(130, 120).addBox(0.2262F, 2.9542F, -8.6203F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0156F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.5329F, 0.1745F, -0.035F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(130, 112).addBox(0.2262F, 1.7733F, -8.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.3846F, 0.1745F, -0.035F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(130, 116).addBox(-0.9973F, 1.2207F, -7.7192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.3054F, 0.0175F, 0.0F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(14, 114).addBox(-0.9973F, 0.6226F, -7.0236F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.2182F, 0.0175F, 0.0F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(97, 130).addBox(-0.9973F, 0.3114F, -5.2012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0183F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.1571F, 0.0175F, 0.0F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(122, 48).addBox(-1.0F, -0.8371F, -1.9337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, 0.5236F, 0.0175F, 0.0F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(121, 91).addBox(-1.0F, -0.913F, -1.991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, 0.2269F, 0.0175F, 0.0F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(30, 139).addBox(-0.3016F, -2.6058F, 0.0827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, 0.1209F, 0.2051F, -0.0341F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(95, 36).addBox(-0.5728F, -1.1072F, -7.496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, -0.5834F, 0.1092F, -0.0638F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(118, 108).addBox(-0.5728F, -1.2283F, -6.6319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, -0.566F, 0.1092F, -0.0638F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(121, 87).addBox(-0.3182F, -2.2957F, -4.4537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, -0.3204F, 0.2051F, -0.0389F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(136, 4).addBox(-0.5616F, -3.443F, -7.9936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1953F, 0.963F, -11.4581F, -0.4045F, 0.1138F, -0.0541F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(141, 3).addBox(-0.5F, -0.85F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(136, 36).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(136, 32).addBox(-0.5F, -0.65F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9897F, -2.0156F, -12.6096F, -0.451F, 0.166F, -0.0545F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(62, 135).addBox(-0.5F, -0.9765F, -0.9124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9897F, -2.0156F, -12.6096F, -0.3987F, 0.166F, -0.0545F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(72, 130).addBox(-0.5017F, -0.8947F, -0.849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 130).addBox(-0.5017F, -0.8947F, -1.649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 130).addBox(-0.5017F, -0.7947F, -2.449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6374F, -2.9059F, -13.9767F, -0.58F, 0.1312F, -0.0542F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(131, 4).addBox(-0.5017F, -0.9416F, -3.3073F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6374F, -2.9059F, -13.9767F, -0.4927F, 0.1312F, -0.0542F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(21, 123).addBox(-0.3314F, -2.6464F, -2.2795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0703F, 0.963F, -11.4581F, -0.1714F, 0.2051F, -0.0341F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(0, 114).addBox(0.6532F, -2.2684F, -10.847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.0463F, 0.2235F, -0.0234F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(113, 43).addBox(0.2134F, -2.4709F, -9.4769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.0268F, 0.1745F, -0.035F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(124, 16).addBox(-0.975F, -3.4857F, 5.7052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, 2.6878F, 0.0175F, 0.0F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(135, 112).addBox(-0.975F, -6.6701F, -0.4575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, 1.597F, 0.0175F, 0.0F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(134, 136).addBox(-0.975F, -4.9311F, -2.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, 1.117F, 0.0175F, 0.0F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(137, 57).addBox(-0.975F, 0.2327F, -6.1674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(122, 52).addBox(-0.975F, 0.2327F, -8.1174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.192F, 0.0175F, 0.0F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(114, 74).addBox(-1.01F, -0.679F, -6.024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.2793F, 0.0175F, 0.0F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(108, 6).addBox(-1.003F, 6.8342F, -1.604F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -1.7104F, 0.0175F, 0.0F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(77, 130).addBox(-1.003F, -1.0001F, -6.9729F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.2269F, 0.0175F, 0.0F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(115, 48).addBox(-1.0103F, -4.7022F, -1.0059F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, 1.7017F, 0.0175F, 0.0F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(116, 130).addBox(-1.0103F, -1.3554F, -2.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, 0.2618F, 0.0175F, 0.0F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(82, 111).addBox(-1.0F, -2.1607F, -0.9317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, 1.0123F, 0.0175F, 0.0F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(114, 93).addBox(-1.0F, -0.6187F, -4.0452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6704F, 0.963F, -0.0581F, -0.2967F, 0.0175F, 0.0F));

		return LayerDefinition.create(meshdefinition, 147, 147);
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