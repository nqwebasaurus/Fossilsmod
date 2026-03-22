package fossils.fossils.client.blockentity.model.concavenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ConcavenatorFossilModel extends SkullModelBase {
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

	public ConcavenatorFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -35.4397F, -0.7136F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 136).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.9638F, -2.6037F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 108).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9249F, -3.7307F, -1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 121).addBox(-0.003F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2173F, -4.492F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(126, 52).addBox(0.006F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.1978F, -4.7704F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(107, 70).addBox(-0.006F, 0.0F, -1.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.4991F, -3.1982F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 113).addBox(0.003F, -4.8F, -1.6F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1458F, -2.1716F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 107).addBox(0.0F, 0.0128F, -0.0041F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -5.4719F, -2.0112F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(121, 108).addBox(0.003F, -2.0F, -1.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -3.9295F, -0.6429F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(56, 126).addBox(0.0F, 2.4F, -1.525F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 126).addBox(-0.003F, 2.4F, -2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 79).addBox(0.0F, 2.4F, -7.9F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6645F, 8.5319F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 136).addBox(0.003F, -0.05F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 136).addBox(-0.006F, -0.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6483F, 6.1455F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(89, 107).addBox(-0.006F, 0.0F, -0.6F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9782F, 4.2744F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(120, 116).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1818F, -3.5476F, -0.1655F, -0.1026F, -0.638F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(120, 114).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1818F, -3.5476F, -0.1068F, -0.1628F, -1.0741F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(120, 116).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1818F, -3.5476F, -0.1655F, 0.1026F, 0.638F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(120, 114).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1818F, -3.5476F, -0.1068F, 0.1628F, 1.0741F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -1.9822F, 0.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9651F, 3.8865F, 0.6954F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(106, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4941F, -8.4392F, 2.7366F, -0.3092F, -0.0321F, -0.4016F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(41, 63).addBox(-0.5827F, 3.7931F, -7.2175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(106, 21).addBox(-0.5827F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5815F, -8.6405F, 5.3682F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(27, 85).addBox(-0.5F, -2.1F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0658F, -4.8347F, 3.9432F, 0.513F, -0.0327F, -0.4104F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(65, 78).addBox(-0.5F, -0.9F, -3.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2469F, -5.4364F, 5.3715F, 0.3123F, -0.0327F, -0.4104F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(104, 6).addBox(-0.5F, -0.925F, -2.575F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6082F, -6.1131F, 6.6109F, 0.02F, -0.0391F, -0.4053F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8785F, -6.6144F, 7.9054F, -0.3727F, -0.0391F, -0.4053F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(134, 118).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4114F, -2.8996F, 2.5354F, 0.2875F, 0.0639F, 0.0248F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(90, 134).addBox(-0.4989F, -1.0215F, -0.7609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0722F, 5.1913F, 8.4376F, 0.5797F, 0.0329F, -0.1205F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 135).addBox(-0.4989F, -0.2114F, -0.9001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0722F, 5.1913F, 8.4376F, 0.0561F, 0.0329F, -0.1205F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(118, 32).addBox(-0.4989F, -0.0486F, -1.5134F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0722F, 5.1913F, 8.4376F, 0.4488F, 0.0329F, -0.1205F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(134, 79).addBox(-0.5018F, 0.0504F, -0.0563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(134, 27).addBox(-0.5018F, -0.3496F, -0.0813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0722F, 5.1913F, 8.4376F, 0.8851F, 0.0329F, -0.1205F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(15, 134).addBox(-0.5048F, -0.8216F, -0.0282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0722F, 5.1913F, 8.4376F, 1.3651F, 0.0258F, -0.1107F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(88, 118).addBox(0.0214F, -0.5431F, -1.518F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8624F, 1.4941F, 6.1014F, 0.756F, -0.0084F, -0.1135F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(69, 129).addBox(-1.1984F, -1.6984F, -1.7288F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9376F, -1.1059F, 3.9014F, 1.2444F, -0.0583F, 0.1644F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 130).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1566F, -0.2826F, 2.807F, 2.0725F, 0.0029F, 0.198F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(118, 53).addBox(-0.5F, -2.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.021F, 0.4146F, 3.8552F, 0.6772F, -0.0583F, 0.1644F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(112, 75).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4114F, -2.5996F, 3.7354F, 0.5929F, 0.0639F, 0.0248F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(112, 70).addBox(-0.5F, -3.4F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2704F, 0.866F, 2.8754F, 0.0693F, 0.0639F, 0.0248F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 112).addBox(-0.5F, -1.725F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0457F, 0.5049F, -0.1179F, -1.1437F, 0.0639F, 0.0248F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(121, 45).addBox(-0.5F, -2.0F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5065F, 8.6893F, -0.6927F, -1.5902F, 0.0864F, -0.1568F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(64, 129).addBox(0.1069F, 3.3632F, 2.2821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.873F, 4.2163F, -1.3279F, -0.8484F, 0.0864F, -0.1568F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(10, 134).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 134).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5612F, 10.085F, -2.5857F, -1.5029F, 0.0864F, -0.1568F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(61, 112).addBox(-0.5F, -4.4F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5367F, 9.6482F, -2.0772F, -1.3284F, 0.0864F, -0.1568F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(59, 129).addBox(0.1069F, 0.0007F, -0.853F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3283F, 7.741F, -1.4705F, -0.3772F, 0.0864F, -0.1568F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(93, 120).addBox(-0.5F, -1.0F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2172F, 7.4402F, -1.7403F, 0.0679F, 0.0864F, -0.1568F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(43, 129).addBox(0.1069F, 2.7917F, -2.06F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.873F, 4.2163F, -1.3279F, 0.3733F, 0.0864F, -0.1568F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(120, 59).addBox(0.1069F, 0.0637F, -0.4551F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.873F, 4.7163F, -1.4279F, -0.1328F, 0.0864F, -0.1568F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(25, 120).addBox(-0.5F, -0.9F, 0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1683F, 0.8971F, -1.8829F, 0.017F, 0.0639F, 0.0248F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(111, 91).addBox(-0.5F, -1.0F, -1.05F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.073F, 1.0663F, -0.3279F, -0.1575F, 0.0639F, 0.0248F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(106, 0).addBox(-0.5F, -0.075F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0174F, -2.046F, -2.6915F, 0.3486F, 0.0639F, 0.0248F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(105, 80).addBox(-0.5F, -1.3F, -0.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0921F, -3.7748F, -2.1956F, -0.2797F, 0.0639F, 0.0248F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(78, 52).addBox(-0.3844F, -0.3139F, -1.3767F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1504F, -4.2868F, 0.328F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(32, 129).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5035F, -5.8692F, -4.6478F, 1.7527F, -0.3037F, -0.3808F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 121).addBox(-0.5F, -1.5583F, -0.9931F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1185F, -6.0456F, -3.7164F, 2.5818F, -0.3037F, -0.3808F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(111, 56).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1151F, -7.6967F, -4.9826F, 1.7702F, -0.3037F, -0.3808F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(27, 129).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -8.5206F, -4.8195F, 1.4124F, -0.3037F, -0.3808F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(5, 118).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9503F, -9.0304F, -4.0902F, 0.6532F, -0.3037F, -0.3808F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(105, 74).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6003F, -9.039F, -2.1745F, 0.1208F, -0.3037F, -0.3808F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 88).addBox(-0.58F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5815F, -9.3405F, -3.2318F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9651F, 5.1809F, 0.312F, -0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(106, 40).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.4941F, -9.7336F, 3.12F, -0.3092F, 0.0321F, 0.4016F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(41, 63).mirror().addBox(-0.4173F, 3.7931F, -7.2175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 21).mirror().addBox(-0.4173F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -9.9349F, 5.7516F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(27, 85).mirror().addBox(-0.5F, -2.1F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0658F, -6.1291F, 4.3266F, 0.513F, 0.0327F, 0.4104F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(65, 78).mirror().addBox(-0.5F, -0.9F, -3.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2469F, -6.7308F, 5.7549F, 0.3123F, 0.0327F, 0.4104F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(104, 6).mirror().addBox(-0.5F, -0.925F, -2.575F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6082F, -7.4075F, 6.9943F, 0.02F, 0.0391F, 0.4053F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8785F, -7.9088F, 8.2888F, -0.3727F, 0.0391F, 0.4053F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(134, 118).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4114F, -4.194F, 2.9188F, 0.2875F, -0.0639F, -0.0248F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(90, 134).mirror().addBox(-0.5011F, -1.0215F, -0.7609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0722F, 3.8969F, 8.8211F, 0.5797F, -0.0329F, 0.1205F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(48, 135).mirror().addBox(-0.5011F, -0.2114F, -0.9001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0722F, 3.8969F, 8.8211F, 0.0561F, -0.0329F, 0.1205F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(118, 32).mirror().addBox(-0.5011F, -0.0486F, -1.5134F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0722F, 3.8969F, 8.8211F, 0.4488F, -0.0329F, 0.1205F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(134, 79).mirror().addBox(-0.4982F, 0.0504F, -0.0563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(134, 27).mirror().addBox(-0.4982F, -0.3496F, -0.0813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0722F, 3.8969F, 8.8211F, 0.8851F, -0.0329F, 0.1205F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(15, 134).mirror().addBox(-0.4952F, -0.8216F, -0.0282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0722F, 3.8969F, 8.8211F, 1.3651F, -0.0258F, 0.1107F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(88, 118).mirror().addBox(-1.0214F, -0.5431F, -1.518F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8624F, 0.1997F, 6.4848F, 0.756F, 0.0084F, 0.1135F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 129).mirror().addBox(0.1984F, -1.6984F, -1.7288F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9376F, -2.4003F, 4.2848F, 1.2444F, 0.0583F, -0.1644F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1566F, -1.577F, 3.1905F, 2.0725F, -0.0029F, -0.198F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(118, 53).mirror().addBox(-0.5F, -2.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.021F, -0.8798F, 4.2386F, 0.6772F, 0.0583F, -0.1644F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(112, 75).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4114F, -3.894F, 4.1189F, 0.5929F, -0.0639F, -0.0248F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(112, 70).mirror().addBox(-0.5F, -3.4F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, -0.4284F, 3.2589F, 0.0693F, -0.0639F, -0.0248F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(66, 112).mirror().addBox(-0.5F, -1.725F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0457F, -0.7895F, 0.2655F, -1.1437F, -0.0639F, -0.0248F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(121, 45).mirror().addBox(-0.5F, -2.0F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5065F, 7.3949F, -0.3093F, -1.5902F, -0.0864F, 0.1568F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(64, 129).mirror().addBox(-1.1069F, 3.3632F, 2.2821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.873F, 2.9219F, -0.9445F, -0.8484F, -0.0864F, 0.1568F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(10, 134).mirror().addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 134).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5612F, 8.7906F, -2.2023F, -1.5029F, -0.0864F, 0.1568F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(61, 112).mirror().addBox(-0.5F, -4.4F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5367F, 8.3538F, -1.6938F, -1.3284F, -0.0864F, 0.1568F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(59, 129).mirror().addBox(-1.1069F, 0.0007F, -0.853F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3283F, 6.4466F, -1.0871F, -0.3772F, -0.0864F, 0.1568F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(93, 120).mirror().addBox(-0.5F, -1.0F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2172F, 6.1458F, -1.3569F, 0.0679F, -0.0864F, 0.1568F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(43, 129).mirror().addBox(-1.1069F, 2.7917F, -2.06F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.873F, 2.9219F, -0.9445F, 0.3733F, -0.0864F, 0.1568F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(120, 59).mirror().addBox(-1.1069F, 0.0637F, -0.4551F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.873F, 3.4219F, -1.0445F, -0.1328F, -0.0864F, 0.1568F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(25, 120).mirror().addBox(-0.5F, -0.9F, 0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1683F, -0.3973F, -1.4995F, 0.017F, -0.0639F, -0.0248F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(111, 91).mirror().addBox(-0.5F, -1.0F, -1.05F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, -0.2281F, 0.0555F, -0.1575F, -0.0639F, -0.0248F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-0.5F, -0.075F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0174F, -3.3404F, -2.3081F, 0.3486F, -0.0639F, -0.0248F));

		PartDefinition cube_r86 = bone5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(105, 80).mirror().addBox(-0.5F, -1.3F, -0.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0921F, -5.0692F, -1.8122F, -0.2797F, -0.0639F, -0.0248F));

		PartDefinition cube_r87 = bone5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(78, 52).mirror().addBox(-0.6156F, -0.3139F, -1.3767F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1504F, -5.5812F, 0.7115F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r88 = bone5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(32, 129).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5035F, -7.1636F, -4.2644F, 1.7527F, 0.3037F, 0.3808F));

		PartDefinition cube_r89 = bone5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(55, 121).mirror().addBox(-0.5F, -1.5583F, -0.9931F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1185F, -7.34F, -3.333F, 2.5818F, 0.3037F, 0.3808F));

		PartDefinition cube_r90 = bone5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(111, 56).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1151F, -8.9911F, -4.5992F, 1.7702F, 0.3037F, 0.3808F));

		PartDefinition cube_r91 = bone5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(27, 129).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, -9.815F, -4.4361F, 1.4124F, 0.3037F, 0.3808F));

		PartDefinition cube_r92 = bone5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(5, 118).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9503F, -10.3248F, -3.7068F, 0.6532F, 0.3037F, 0.3808F));

		PartDefinition cube_r93 = bone5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.6003F, -10.3334F, -1.7911F, 0.1208F, 0.3037F, 0.3808F));

		PartDefinition cube_r94 = bone5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(45, 88).mirror().addBox(-0.42F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -10.6349F, -2.8484F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.7345F, 0.9092F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(76, 65).addBox(-0.6F, -0.8957F, -1.8902F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 12.615F, -1.0005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(110, 15).addBox(-5.1F, -1.0964F, 0.0676F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(109, 101).addBox(-5.1F, -1.0964F, -0.7324F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 6.5851F, -2.0601F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(43, 120).addBox(-5.1F, -1.3057F, -1.443F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(117, 15).addBox(-5.1F, -2.0057F, -0.643F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 11.6054F, -0.7045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(106, 109).addBox(-5.1F, -1.132F, 0.1317F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 40).addBox(-5.1F, -1.732F, -0.6683F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 9.5777F, -2.2694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(70, 121).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.3288F, -0.5542F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(120, 19).addBox(-0.5F, -0.0085F, -0.9934F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 3.529F, 0.3176F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(9, 97).addBox(-5.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(104, 95).addBox(-5.1F, -4.0863F, -0.0195F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 5.5302F, -2.7348F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(90, 17).addBox(-1.5F, -1.0F, -1.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1302F, 0.171F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(97, 0).addBox(-1.1F, -1.725F, -3.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.5376F, 1.2007F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 14.1401F, -1.4099F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(23, 105).addBox(0.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(111, 32).addBox(0.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(88, 28).addBox(-0.1F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(66, 117).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(87, 85).addBox(-0.1F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(76, 90).addBox(-0.1F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(65, 90).addBox(-0.1F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(102, 102).addBox(-0.1F, 1.5F, -0.85F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(38, 85).addBox(-0.1F, -8.4F, -1.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 16.4611F, -0.1532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(27, 97).addBox(-0.1F, -6.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(23, 111).addBox(-0.1F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7195F, 0.6129F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(34, 62).addBox(-1.1F, -6.6F, -0.525F, 2.0F, 15.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(36, 110).addBox(-1.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.2471F, 0.2883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(22, 69).addBox(-1.1F, -0.209F, -0.1593F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.2197F, -0.3418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(18, 85).addBox(-1.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.3025F, -1.9263F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(22, 129).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r120 = rightLeg3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 118).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(52, 32).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.9009F, 0.1707F, -0.0087F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(46, 46).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.0154F, 1.1222F, -0.7135F, 0.209F, -0.0629F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 85).addBox(-2.4F, -0.8957F, -1.8902F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 13.3342F, -1.2135F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(113, 0).addBox(3.1F, -1.0964F, 0.0676F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(112, 80).addBox(3.1F, -1.0964F, -0.7324F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 7.3042F, -2.2731F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(120, 97).addBox(3.1F, -1.3057F, -1.443F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(112, 118).addBox(3.1F, -2.0057F, -0.643F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 12.3245F, -0.9175F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 113).addBox(3.1F, -1.132F, 0.1317F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 99).addBox(3.1F, -1.732F, -0.6683F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.6F, 10.2969F, -2.4824F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(121, 85).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.0479F, -0.7672F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(50, 121).addBox(-0.5F, -0.0085F, -0.9934F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.2481F, 0.1046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(98, 74).addBox(3.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 4.1405F, 0.4157F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(61, 106).addBox(3.1F, -4.0863F, -0.0195F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 6.2493F, -2.9478F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(87, 91).addBox(-1.5F, -1.0F, -1.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.8493F, -0.042F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(97, 22).addBox(-0.9F, -1.725F, -3.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 2.2567F, 0.9877F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.1401F, -1.4099F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(68, 106).addBox(-2.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.2F, 4.2488F, -0.9352F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(113, 10).addBox(-2.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 4.2488F, -0.9352F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(54, 89).addBox(-1.9F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, 0.577F, -2.4658F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(33, 119).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 0.1216F, -1.736F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(89, 48).addBox(-1.9F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 1.0717F, 0.0352F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(27, 92).addBox(-1.9F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.9495F, 1.6843F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(7, 92).addBox(-1.9F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 1.0717F, 0.0352F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(104, 33).addBox(-1.9F, 1.5F, -0.85F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.2F, 10.3788F, -0.2255F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 86).addBox(-1.9F, -8.4F, -1.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 17.1803F, -0.3662F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(98, 82).addBox(-1.9F, -6.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2F, 10.3788F, -0.2255F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(7, 113).addBox(-1.9F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 5.4386F, 0.3999F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftLeg2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 69).addBox(-0.9F, -6.6F, -0.525F, 2.0F, 15.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 8.3663F, -0.7247F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftLeg2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(113, 5).addBox(0.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.9663F, 0.0753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftLeg2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(27, 69).addBox(0.1F, -0.209F, -0.1593F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.9388F, -0.5548F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(87, 70).addBox(-2.0F, 0.7745F, -0.7369F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.3025F, -1.9263F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftLeg3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(129, 118).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.7616F, -0.7369F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r146 = leftLeg3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(60, 119).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 4.2745F, -0.2369F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(19, 56).addBox(-4.5F, 0.6445F, -4.1498F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.9009F, 0.1707F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(21, 49).addBox(-3.5F, -0.0809F, -4.213F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4044F, 7.6708F, -0.2715F, 0.0841F, -0.0234F));

		PartDefinition cube_r147 = tail1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(119, 118).addBox(0.0F, -0.2F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2878F, 9.5295F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(22, 120).addBox(0.5F, -0.0129F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1058F, 2.4434F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(113, 37).addBox(0.5F, -0.0129F, -0.1754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8299F, 4.2583F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(30, 114).addBox(0.5F, 0.2871F, -0.8754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.096F, 6.5805F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(33, 108).addBox(0.5F, -5.9823F, -1.1162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 107).addBox(0.5F, -6.2823F, 0.8838F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1457F, 7.7808F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(14, 107).addBox(0.5F, -6.2073F, -0.4162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5051F, 5.1259F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(135, 56).addBox(0.004F, 0.0F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3444F, 0.8185F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(136, 50).addBox(0.0F, -2.7F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 135).addBox(-0.006F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2601F, 3.5248F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(19, 120).addBox(0.5F, -4.0323F, -0.3162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 119).addBox(0.497F, -4.0323F, -0.8162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2471F, 2.7357F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(41, 56).addBox(0.5F, -3.9823F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5695F, -0.2885F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(27, 27).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0111F, 0.8962F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r158 = tail1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(27, 27).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0111F, 0.8962F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r159 = tail1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(27, 14).addBox(0.0F, -1.9F, -0.9F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, 0.9382F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(75, 106).addBox(-1.0F, -7.2335F, 4.7591F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4998F, 9.6946F, 0.1051F, 0.0868F, 0.0091F));

		PartDefinition cube_r160 = tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1575F, 0.069F, 0.0109F));

		PartDefinition cube_r161 = tail.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(73, 30).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1575F, -0.069F, -0.0109F));

		PartDefinition cube_r162 = tail.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(44, 53).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(75, 121).addBox(0.0F, 1.0F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.548F, 6.0799F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 119).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(10, 118).addBox(0.0F, 0.4F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(30, 105).addBox(0.5F, -5.7823F, -0.0162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 2.8025F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(79, 99).addBox(0.5F, -5.9823F, -0.0162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, 0.8174F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(119, 76).addBox(0.0F, -5.2561F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 6.0228F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(119, 69).addBox(0.0F, -5.3561F, 0.0684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 3.9307F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(113, 106).addBox(0.0F, -5.4061F, -0.1316F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 2.1376F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(57, 113).addBox(0.0F, -5.4811F, 0.0684F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, -0.054F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(50, 12).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 50).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(30, 122).addBox(0.0F, 0.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.018F, 1.9009F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(23, 100).addBox(0.0F, 1.2F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0009F, 5.4187F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(122, 24).addBox(0.0F, 0.3F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(61, 53).mirror().addBox(-0.9F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4564F, 0.0304F, 0.0175F, 0.0698F, 0.0012F));

		PartDefinition cube_r177 = tail2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(61, 53).addBox(-0.1F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4564F, 0.0304F, 0.0175F, -0.0698F, -0.0012F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, -0.0087F, -0.0436F, 0.0004F));

		PartDefinition cube_r178 = tail8.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail8.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(135, 89).addBox(0.0F, 3.7F, 3.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 135).addBox(0.0F, 2.4F, 1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 129).addBox(0.0F, 0.1F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 2.89F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail8.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(75, 127).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.837F, 0.6886F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail8.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(81, 126).addBox(0.0F, -3.3061F, -0.0316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9911F, 7.9218F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail8.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(122, 75).addBox(0.0F, -3.9811F, -0.0316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 5.8983F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail8.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(122, 69).addBox(0.0F, -4.1561F, -0.1316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 3.9983F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail8.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(81, 119).addBox(0.0F, -4.4061F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 1.8983F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail8.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(78, 119).addBox(0.0F, -4.5561F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, -0.1016F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0088F, -0.1309F, -0.0011F));

		PartDefinition cube_r186 = tail3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(101, 6).addBox(0.0F, -2.1128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 6.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(130, 19).addBox(0.0F, -2.3628F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 4.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(130, 4).addBox(0.0F, -2.6628F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 2.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(117, 129).addBox(0.0F, -2.9128F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 0.8963F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(120, 135).addBox(0.0F, 2.2F, 3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 102).addBox(0.0F, 0.9F, 1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 98).addBox(0.0F, -0.4F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(25, 38).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r192 = tail9.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(69, 38).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail9.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(114, 53).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 4.0517F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail9.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(107, 91).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5231F, 2.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail9.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(135, 129).addBox(0.0F, 6.2F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 125).addBox(0.0F, 4.8F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 121).addBox(0.0F, 3.3F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail9.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(107, 56).addBox(0.0F, -1.425F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 0.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.1232F, -0.1299F, -0.016F));

		PartDefinition cube_r197 = tail4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(5, 136).addBox(0.0F, -0.725F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 4.0293F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(135, 133).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 2.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(112, 126).addBox(0.0F, -0.9F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(65, 136).addBox(0.0F, 0.25F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 136).addBox(0.0F, -1.25F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(56, 70).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(69, 10).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(136, 14).addBox(0.0F, -1.1948F, -0.2226F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 40).addBox(0.0F, -1.1698F, 1.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.132F, -0.1298F, 0.0172F));

		PartDefinition cube_r202 = tail5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(136, 53).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5698F, 3.7774F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(136, 82).addBox(0.0F, 4.15F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 136).addBox(0.0F, 2.85F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 136).addBox(0.0F, 1.55F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(20, 136).addBox(0.0F, -0.575F, -0.0013F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 136).addBox(0.0F, -0.525F, 1.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 136).addBox(0.0F, -0.425F, 3.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5056F, 5.6774F, -0.1519F, -0.2157F, 0.0328F));

		PartDefinition cube_r204 = tail6.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(83, 136).addBox(0.0F, 5.45F, 8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1693F, -8.5969F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(52, 22).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1848F, -0.1287F, 0.024F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 8.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(34, 97).addBox(0.0F, -8.1076F, -1.6178F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(83, 95).addBox(-0.503F, -9.8088F, -1.4292F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8982F, -0.7256F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(74, 132).addBox(-0.497F, -9.8182F, 1.3263F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8982F, -0.7256F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(20, 107).addBox(-0.497F, -1.0022F, -0.9864F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.7842F, -2.8232F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(13, 120).addBox(-0.506F, -0.0022F, -0.9864F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -11.7688F, -2.4309F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(109, 106).addBox(-0.497F, -4.8022F, 0.0136F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 120).addBox(-0.5F, -4.0022F, 0.0136F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -7.2816F, -4.407F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(136, 47).addBox(-0.506F, -0.0522F, 0.1886F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 136).addBox(-0.497F, -0.0522F, -0.0114F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.6994F, -5.7526F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(136, 44).addBox(-0.5F, -1.2522F, -0.0114F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 41).addBox(-0.503F, -1.0522F, -0.0114F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.6302F, -6.2974F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(16, 120).addBox(-0.494F, -3.4522F, -0.1114F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2312F, -6.1678F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(40, 135).addBox(0.009F, -0.775F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.7356F, -5.2613F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(78, 126).addBox(-0.503F, -2.9522F, -1.7114F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 39).addBox(-0.503F, -5.9522F, -0.2114F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3515F, -3.8709F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(7, 69).addBox(-1.0F, 0.0F, 2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -5.0018F, -0.0296F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.7434F, -8.2032F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(126, 48).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -1.4704F, -0.1233F, -0.0713F, -0.6417F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(125, 62).mirror().addBox(-4.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -1.4704F, -0.0021F, -0.1424F, -1.6757F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(121, 50).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -1.4704F, -0.0817F, -0.1167F, -1.0776F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -5.3704F, -0.0401F, -0.0471F, -1.5204F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(125, 27).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -5.3704F, -0.0596F, -0.0167F, -0.9274F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(125, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -5.3704F, -0.061F, 0.01F, -0.4919F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(73, 36).mirror().addBox(-6.74F, -2.3355F, -0.4915F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.4704F, -0.0076F, -0.0903F, -1.675F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(88, 34).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.4704F, -0.0569F, -0.0706F, -1.08F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(119, 83).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.4704F, -0.0813F, -0.0399F, -0.644F));

		PartDefinition cube_r226 = body.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(86, 6).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -5.3704F, -0.0401F, 0.0471F, 1.5204F));

		PartDefinition cube_r227 = body.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(125, 27).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -5.3704F, -0.0596F, 0.0167F, 0.9274F));

		PartDefinition cube_r228 = body.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(125, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -5.3704F, -0.061F, -0.01F, 0.4919F));

		PartDefinition cube_r229 = body.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(121, 50).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -1.4704F, -0.0817F, 0.1167F, 1.0776F));

		PartDefinition cube_r230 = body.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(125, 62).addBox(2.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -1.4704F, -0.0021F, 0.1424F, 1.6757F));

		PartDefinition cube_r231 = body.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(126, 48).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -1.4704F, -0.1233F, 0.0713F, 0.6417F));

		PartDefinition cube_r232 = body.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(73, 36).addBox(2.74F, -2.3355F, -0.4915F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.4704F, -0.0076F, 0.0903F, 1.675F));

		PartDefinition cube_r233 = body.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(88, 34).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.4704F, -0.0569F, 0.0706F, 1.08F));

		PartDefinition cube_r234 = body.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(119, 83).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.4704F, -0.0813F, 0.0399F, 0.644F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(9, 105).addBox(0.0F, -3.8122F, -0.0627F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0895F, -2.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(56, 63).addBox(0.0F, -2.9117F, 0.1386F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -9.195F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(83, 112).addBox(0.0F, -3.4367F, 0.0386F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -6.0951F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(122, 120).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, -0.0198F, 0.006F, -0.4198F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(122, 118).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, -0.0205F, -0.0029F, -0.8561F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, -0.0154F, -0.0139F, -1.4494F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(69, 18).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0259F, 0.19F, -1.3622F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(112, 122).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.1284F, 0.1429F, -0.7621F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(122, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.1764F, 0.0755F, -0.3282F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(122, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0975F, 0.0371F, -0.3664F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(121, 112).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0728F, 0.0748F, -0.8018F));

		PartDefinition cube_r246 = body2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(31, 12).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0184F, 0.1027F, -1.397F));

		PartDefinition cube_r247 = body2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(122, 120).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, -0.0198F, -0.006F, 0.4198F));

		PartDefinition cube_r248 = body2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 29).addBox(-2.5F, -4.0429F, -0.018F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.047F, -8.0356F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r249 = body2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(122, 118).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, -0.0205F, 0.0029F, 0.8561F));

		PartDefinition cube_r250 = body2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(52, 10).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, -0.0154F, 0.0139F, 1.4494F));

		PartDefinition cube_r251 = body2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(69, 18).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0259F, -0.19F, 1.3622F));

		PartDefinition cube_r252 = body2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(112, 122).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.1284F, -0.1429F, 0.7621F));

		PartDefinition cube_r253 = body2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(122, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.1764F, -0.0755F, 0.3282F));

		PartDefinition cube_r254 = body2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(122, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0975F, -0.0371F, 0.3664F));

		PartDefinition cube_r255 = body2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(121, 112).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0728F, -0.0748F, 0.8018F));

		PartDefinition cube_r256 = body2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(31, 12).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0184F, -0.1027F, 1.397F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1394F, -7.9567F, 0.0884F, 0.1298F, 0.0172F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(18, 94).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.0391F, -3.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(44, 107).addBox(0.0F, -3.0525F, -0.1399F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -3.8368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(130, 32).addBox(0.0F, -2.9967F, -0.0424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -5.9368F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(76, 61).addBox(-3.4872F, -0.6399F, -2.005F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 10.3298F, -8.5946F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -9.3368F, 0.075F, 0.3539F, -1.476F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(123, 66).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -9.3368F, 0.2632F, 0.2506F, -0.8627F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(123, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -9.3368F, 0.3422F, 0.1185F, -0.4392F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(43, 123).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.2808F, 0.0852F, -0.3581F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(123, 42).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.2202F, 0.1951F, -0.7849F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(69, 50).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.0723F, 0.2844F, -1.3896F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(123, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -5.4368F, 0.2457F, 0.0842F, -0.3242F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(123, 38).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -5.4368F, 0.1882F, 0.1796F, -0.7539F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(69, 46).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -5.4368F, 0.0545F, 0.2538F, -1.3574F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -2.9368F, 0.0214F, 0.1545F, -1.3106F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(123, 36).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -2.9368F, 0.1045F, 0.116F, -0.7128F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(33, 123).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -2.9368F, 0.1436F, 0.0612F, -0.2781F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(41, 72).mirror().addBox(-3.1325F, -0.3668F, -5.5414F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4872F, 10.3298F, -8.5946F, -0.6137F, -0.4024F, 0.2692F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-3.7F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0506F, 9.7747F, -9.1648F, -0.7281F, 1.2149F, 0.4977F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(85, 43).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7986F, 10.2171F, -8.6985F, -0.4339F, 1.129F, 0.1209F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(70, 48).mirror().addBox(-7.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4626F, 10.413F, -8.7276F, -0.0273F, 1.1414F, 0.035F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(71, 8).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -9.3368F, 0.075F, -0.3539F, 1.476F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(123, 66).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -9.3368F, 0.2632F, -0.2506F, 0.8627F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(123, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -9.3368F, 0.3422F, -0.1185F, 0.4392F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(123, 52).addBox(0.0F, -3.0926F, -0.2837F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -9.7368F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(43, 123).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.2808F, -0.0852F, 0.3581F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(123, 42).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.2202F, -0.1951F, 0.7849F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(69, 50).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.0723F, -0.2844F, 1.3896F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(123, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -5.4368F, 0.2457F, -0.0842F, 0.3242F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(123, 38).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -5.4368F, 0.1882F, -0.1796F, 0.7539F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(69, 46).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -5.4368F, 0.0545F, -0.2538F, 1.3574F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(69, 20).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -2.9368F, 0.0214F, -0.1545F, 1.3106F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(123, 36).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -2.9368F, 0.1045F, -0.116F, 0.7128F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(46, 38).addBox(-3.0F, -4.1861F, -5.4237F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.1828F, -2.2135F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(33, 123).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -2.9368F, 0.1436F, -0.0612F, 0.2781F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(122, 122).addBox(0.0F, -3.0926F, -0.2837F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -7.7368F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(41, 72).addBox(1.1325F, -0.3668F, -5.5414F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4872F, 10.3298F, -8.5946F, -0.6137F, 0.4024F, -0.2692F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(89, 8).addBox(-0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0506F, 9.7747F, -9.1648F, -0.7281F, -1.2149F, -0.4977F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(85, 43).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7986F, 10.2171F, -8.6985F, -0.4339F, -1.129F, -0.1209F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(70, 48).addBox(0.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4626F, 10.413F, -8.7276F, -0.0273F, -1.1414F, -0.035F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(32, 79).addBox(-1.4872F, -0.3668F, -5.8781F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 10.3298F, -8.5946F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(61, 61).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.0609F, -4.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1377F, 3.3086F, -8.3303F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r298 = bone2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(71, 70).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4144F, -3.9797F, 5.2571F, 0.5978F, -0.0171F, -0.0036F));

		PartDefinition cube_r299 = bone2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(97, 133).addBox(-0.5F, 0.4F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4063F, -5.4348F, 5.4204F, 0.3098F, -0.0171F, -0.0036F));

		PartDefinition cube_r300 = bone2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(133, 86).addBox(-0.9118F, -0.0393F, 4.9497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 78).addBox(-0.9118F, -0.0393F, -0.0503F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9035F, -1.7205F, -0.0094F, 0.6327F, -0.0033F, -0.0171F));

		PartDefinition cube_r301 = bone2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(87, 79).addBox(-0.9118F, 0.1607F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 1.1178F, -2.8345F, 0.8378F, -0.0009F, -0.0174F));

		PartDefinition cube_r302 = bone2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(85, 133).addBox(-0.425F, -1.05F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0982F, 2.9226F, -2.5249F, 1.0297F, 0.1346F, 0.2175F));

		PartDefinition cube_r303 = bone2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 97).addBox(-0.1317F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.4194F, 0.6401F, 1.071F));

		PartDefinition cube_r304 = bone2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(86, 102).addBox(-1.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.6093F, 0.4662F, 0.7137F));

		PartDefinition cube_r305 = bone2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(116, 104).addBox(-1.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.1325F, 0.4662F, 0.7137F));

		PartDefinition cube_r306 = bone2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(94, 109).addBox(-1.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.787F, 0.4662F, 0.7137F));

		PartDefinition cube_r307 = bone2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(133, 76).addBox(-0.8F, -0.1487F, -1.3266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 1.0178F, -2.3595F, 0.8289F, 0.1346F, 0.2175F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1377F, 3.3086F, -8.3303F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r308 = bone4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(-0.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4144F, -3.9797F, 5.2571F, 0.5978F, 0.0171F, 0.0036F));

		PartDefinition cube_r309 = bone4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(97, 133).mirror().addBox(-0.5F, 0.4F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4063F, -5.4348F, 5.4204F, 0.3098F, 0.0171F, 0.0036F));

		PartDefinition cube_r310 = bone4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(133, 86).mirror().addBox(-0.0882F, -0.0393F, 4.9497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 78).mirror().addBox(-0.0882F, -0.0393F, -0.0503F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9035F, -1.7205F, -0.0094F, 0.6327F, 0.0033F, 0.0171F));

		PartDefinition cube_r311 = bone4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(-0.0882F, 0.1607F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 1.1178F, -2.8345F, 0.8378F, 0.0009F, 0.0174F));

		PartDefinition cube_r312 = bone4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(85, 133).mirror().addBox(-0.575F, -1.05F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0982F, 2.9226F, -2.5249F, 1.0297F, -0.1346F, -0.2175F));

		PartDefinition cube_r313 = bone4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.8683F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.4194F, -0.6401F, -1.071F));

		PartDefinition cube_r314 = bone4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(86, 102).mirror().addBox(0.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.6093F, -0.4662F, -0.7137F));

		PartDefinition cube_r315 = bone4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(116, 104).mirror().addBox(0.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.1325F, -0.4662F, -0.7137F));

		PartDefinition cube_r316 = bone4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(94, 109).mirror().addBox(0.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.787F, -0.4662F, -0.7137F));

		PartDefinition cube_r317 = bone4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(133, 76).mirror().addBox(-0.2F, -0.1487F, -1.3266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 1.0178F, -2.3595F, 0.8289F, -0.1346F, -0.2175F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8243F, 7.8423F, -13.5635F, -0.1779F, 0.2236F, -0.2669F));

		PartDefinition cube_r318 = leftArm1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(129, 29).addBox(-0.2F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6037F, -0.4814F, 1.7504F, -0.2354F, -0.2207F, -0.0253F));

		PartDefinition cube_r319 = leftArm1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(125, 133).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 133).addBox(-0.5F, -1.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r320 = leftArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(5, 129).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r321 = leftArm1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(120, 128).addBox(6.0F, -1.0842F, 0.6838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r322 = leftArm1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(107, 133).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r323 = leftArm1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(102, 133).addBox(-0.5F, 0.0F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r324 = leftArm1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(73, 115).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, 1.8087F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(101, 109).addBox(-0.8F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 108).addBox(-0.8F, -0.4307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2622F, 6.6163F, 0.5896F, -1.2246F, 0.0156F, 0.0164F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3159F, 3.9465F, 0.2145F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r325 = leftHand.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(56, 78).addBox(0.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r326 = leftHand.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(95, 102).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.4001F, 0.0341F, 0.0804F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5603F, 9.0285F, -11.8167F, 0.9338F, -0.2618F, 0.0F));

		PartDefinition cube_r327 = rightArm1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(129, 80).addBox(-0.8F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6037F, -0.4814F, 1.7504F, -0.2354F, 0.2207F, 0.0253F));

		PartDefinition cube_r328 = rightArm1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(35, 135).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 23).addBox(-0.5F, -1.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r329 = rightArm1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(112, 129).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r330 = rightArm1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(89, 129).addBox(-7.0F, -1.0842F, 0.6838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r331 = rightArm1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(135, 9).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightArm1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(130, 134).addBox(-0.5F, 0.0F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightArm1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(102, 118).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, 1.8087F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(78, 112).addBox(-0.2F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 118).addBox(-0.2F, -0.4307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2622F, 6.6163F, 0.5896F, -1.3029F, 0.1208F, -0.0136F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3159F, 3.9465F, 0.2145F, -0.0843F, -0.0226F, -0.4354F));

		PartDefinition cube_r334 = rightHand.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(78, 78).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightHand.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(37, 103).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.5755F, -0.0238F, -0.0366F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0302F, -9.7672F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r336 = neck1.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(37, 130).addBox(0.0F, -3.1459F, -0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r337 = neck1.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(123, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.6775F, 0.2848F, -0.5763F));

		PartDefinition cube_r338 = neck1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(123, 89).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.5183F, 0.5339F, -0.9689F));

		PartDefinition cube_r339 = neck1.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(90, 45).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.092F, 0.7213F, -1.6723F));

		PartDefinition cube_r340 = neck1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(123, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.6775F, -0.2848F, 0.5763F));

		PartDefinition cube_r341 = neck1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(123, 89).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.5183F, -0.5339F, 0.9689F));

		PartDefinition cube_r342 = neck1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(90, 45).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.092F, -0.7213F, 1.6723F));

		PartDefinition cube_r343 = neck1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(95, 10).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(56, 132).addBox(0.0F, -2.3816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r345 = neck2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(111, 61).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0877F, 0.414F, -1.5444F));

		PartDefinition cube_r346 = neck2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(123, 93).mirror().addBox(-1.9081F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.1064F, 0.4098F, -1.0675F));

		PartDefinition cube_r347 = neck2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(111, 61).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0877F, -0.414F, 1.5444F));

		PartDefinition cube_r348 = neck2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(123, 93).addBox(-0.0919F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.1064F, -0.4098F, 1.0675F));

		PartDefinition cube_r349 = neck2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(98, 54).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.4422F, 0.158F, -0.0744F));

		PartDefinition cube_r350 = neck5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(95, 34).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r351 = neck5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(111, 98).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, -0.2529F, 1.0339F, -1.6583F));

		PartDefinition cube_r352 = neck5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(123, 100).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, 0.463F, 0.9843F, -0.8263F));

		PartDefinition cube_r353 = neck5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(123, 95).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, 0.5555F, 1.0338F, -0.7479F));

		PartDefinition cube_r354 = neck5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(111, 63).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, -0.2664F, 1.1034F, -1.6702F));

		PartDefinition cube_r355 = neck5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(111, 98).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, -0.2529F, -1.0339F, 1.6583F));

		PartDefinition cube_r356 = neck5.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(123, 100).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, 0.463F, -0.9843F, 0.8263F));

		PartDefinition cube_r357 = neck5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(123, 95).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, 0.5555F, -1.0338F, 0.7479F));

		PartDefinition cube_r358 = neck5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(111, 63).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, -0.2664F, -1.1034F, 1.6702F));

		PartDefinition cube_r359 = neck5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(40, 130).addBox(0.0F, -3.3566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r360 = neck5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(130, 37).addBox(0.0F, -2.7566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.3169F, 0.0374F, -0.0088F));

		PartDefinition cube_r361 = neck4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1513F, 1.0193F, -1.5615F));

		PartDefinition cube_r362 = neck4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(123, 106).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.508F, 0.9362F, -0.7795F));

		PartDefinition cube_r363 = neck4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(123, 104).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r364 = neck4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(123, 102).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r365 = neck4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 124).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1513F, -1.0193F, 1.5615F));

		PartDefinition cube_r366 = neck4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(123, 106).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.508F, -0.9362F, 0.7795F));

		PartDefinition cube_r367 = neck4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(123, 104).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r368 = neck4.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(123, 102).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r369 = neck4.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(130, 64).addBox(0.0F, -2.5677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9211F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r370 = neck4.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(48, 130).addBox(0.0F, -2.2677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r371 = neck4.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(84, 10).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.0993F, 0.216F, 0.0308F));

		PartDefinition cube_r372 = neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(101, 124).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(124, 17).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(126, 87).mirror().addBox(-3.8842F, -0.348F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.0326F, 0.6359F, -1.584F));

		PartDefinition cube_r375 = neck3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(124, 15).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.3293F, 0.5553F, -1.0638F));

		PartDefinition cube_r376 = neck3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(101, 124).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r377 = neck3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(124, 17).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r378 = neck3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(126, 87).addBox(1.8842F, -0.348F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.0326F, -0.6359F, 1.584F));

		PartDefinition cube_r379 = neck3.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(124, 15).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.3293F, -0.5553F, 1.0638F));

		PartDefinition cube_r380 = neck3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(78, 108).addBox(0.5F, -2.0458F, -0.0223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6988F, -3.1055F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r381 = neck3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(130, 69).addBox(0.5F, -1.969F, 0.0228F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r382 = neck3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(84, 36).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7216F, -3.4653F, -0.6562F, 0.1138F, -0.0415F));

		PartDefinition cube_r383 = neck.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r384 = neck.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(108, 124).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r385 = neck.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(125, 0).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r386 = neck.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(117, 134).addBox(0.5F, -2.0207F, -0.1014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r387 = neck.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(54, 95).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r388 = neck.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(108, 124).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.4229F, 0.0149F, 0.1743F));

		PartDefinition cube_r389 = neck6.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(126, 56).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7212F, -2.921F, 0.951F, 1.0334F, -0.6502F));

		PartDefinition cube_r390 = neck6.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(132, 12).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7212F, -2.921F, 0.0491F, 1.2685F, -1.6196F));

		PartDefinition cube_r391 = neck6.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(95, 114).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0783F, 0.876F, -1.5935F));

		PartDefinition cube_r392 = neck6.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(125, 2).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.5254F, 0.741F, -0.9857F));

		PartDefinition cube_r393 = neck6.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(132, 12).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7212F, -2.921F, 0.0491F, -1.2685F, 1.6196F));

		PartDefinition cube_r394 = neck6.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(126, 56).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7212F, -2.921F, 0.951F, -1.0334F, 0.6502F));

		PartDefinition cube_r395 = neck6.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(95, 114).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0783F, -0.876F, 1.5935F));

		PartDefinition cube_r396 = neck6.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(77, 132).addBox(0.5F, -1.4207F, -0.8013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8073F, -3.0699F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r397 = neck6.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(130, 74).addBox(0.5F, -2.7207F, -0.1014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8129F, -1.9928F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r398 = neck6.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(95, 96).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.7584F, -3.0746F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r399 = neck6.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(63, 95).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r400 = neck6.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(125, 2).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create().texOffs(15, 131).addBox(-0.5F, 5.2586F, -14.4917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0383F, -4.1274F, 0.0092F, 0.1128F, 0.1097F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(61, 101).addBox(-1.0F, -2.0055F, -0.0028F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.1211F, -5.3228F, -1.6013F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(99, 28).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.1308F, -5.2938F, -1.1912F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(104, 11).addBox(-1.0F, 0.0F, 0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -0.6897F, -7.1813F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(98, 90).addBox(-1.0F, -0.159F, 0.0456F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0686F, -8.0256F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(115, 28).addBox(-0.5F, 3.7426F, -0.0671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.9686F, -9.5256F, -0.9643F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(115, 24).addBox(-0.5F, 2.7933F, -0.0425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.9686F, -9.5256F, -0.973F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(107, 46).addBox(-0.5F, 0.8565F, -0.0447F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.9686F, -9.5256F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(113, 114).addBox(-0.5F, -0.0297F, -0.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.9686F, -9.5256F, -1.0341F, 0.0F, 0.0F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(131, 42).addBox(-1.0F, 0.0078F, 0.0171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 3.5894F, -13.455F, -0.7374F, 0.0F, 0.0F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(131, 14).addBox(-0.5F, 0.0169F, -0.0026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3398F, -14.1058F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(80, 132).addBox(-0.5F, -0.0162F, -0.8985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1693F, -4.8532F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(95, 116).addBox(-0.5F, -0.0162F, -1.9985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3957F, -2.8661F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(106, 114).addBox(-0.5F, -0.8162F, -1.6985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0271F, -1.9365F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(88, 114).addBox(-0.5F, -0.5134F, -0.9974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0271F, -1.9365F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -0.3F, -3.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.7589F, -10.6403F, 0.2523F, 0.0F, 0.0F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(71, 22).addBox(-0.5F, -0.3F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.1016F, -7.8696F, 0.2261F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(17, 62).addBox(-1.5F, -0.025F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.1688F, -5.0472F, 0.0778F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(72, 95).addBox(-1.5F, -1.0F, -1.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.2008F, -0.3251F, 0.3657F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(125, 72).addBox(-0.5F, -0.3832F, -0.5307F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0271F, -1.9365F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(89, 65).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1061F, -2.2947F, 0.0198F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(86, 22).addBox(-1.5F, 0.4371F, -3.5968F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9775F, 0.3132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(96, 70).addBox(-0.5F, -1.525F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(93, 61).addBox(-0.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5066F, -0.9117F, 1.1781F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-1.099F, 1.0098F, -5.7129F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(12, 127).addBox(-0.6F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(70, 125).addBox(-0.6F, -0.9F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4997F, -1.6639F, 3.7479F, 2.8239F, 1.3136F, 0.2761F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(71, 0).addBox(-1.7109F, -0.7839F, -6.3858F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.2084F, 0.0788F, 0.0537F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(133, 38).addBox(-1.4553F, -6.0502F, -6.5539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.7379F, 0.0549F, 0.1505F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(45, 102).addBox(-1.4553F, -5.4287F, -6.1805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.6331F, 0.0549F, 0.1505F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(86, 96).addBox(-1.3715F, -5.2083F, -3.5713F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.5642F, 0.065F, 0.1402F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(54, 108).addBox(-1.3715F, -1.2711F, 3.0859F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 2.0041F, 0.065F, 0.1402F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(125, 126).addBox(-1.3715F, 3.1291F, -0.7004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, -2.909F, 0.065F, 0.1402F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(114, 85).addBox(-1.3715F, 1.5668F, -4.4956F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, -1.9927F, 0.065F, 0.1402F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(114, 49).addBox(-1.0145F, -1.1891F, 1.4783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8439F, 3.1273F, 3.0888F, 0.075F, -0.0349F, -0.0175F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(10, 131).addBox(-0.9093F, -1.5383F, -9.9043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(54, 101).addBox(-0.9093F, -3.9373F, -3.5796F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.3075F, 0.1049F, 0.0336F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(130, 128).addBox(-0.9093F, 0.713F, -9.6677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.0631F, 0.1049F, 0.0336F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(130, 125).addBox(-0.9093F, -0.0417F, -8.9537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.1504F, 0.1049F, 0.0336F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(97, 126).addBox(-0.9093F, -2.0844F, -8.0526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.2813F, 0.1049F, 0.0336F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(125, 68).addBox(-0.9093F, -2.6987F, -7.0184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.3685F, 0.1049F, 0.0336F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(89, 54).addBox(-0.9093F, -2.4276F, -6.4896F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.1591F, 0.1049F, 0.0336F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(102, 126).addBox(-0.9093F, -8.7201F, -4.9295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 1.2063F, 0.1049F, 0.0336F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(65, 125).addBox(-0.9093F, -6.8502F, -6.6749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.8572F, 0.1049F, 0.0336F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(108, 27).addBox(-0.9093F, -4.6576F, -1.5231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.3336F, 0.1049F, 0.0336F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(45, 96).addBox(-0.9093F, -4.8513F, -3.6912F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.5082F, 0.1049F, 0.0336F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(7, 85).addBox(-0.9093F, -5.1546F, -7.2543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.5954F, 0.1049F, 0.0336F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(127, 97).addBox(-0.9093F, 0.1531F, -10.3597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.2027F, 0.1049F, 0.0336F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(60, 125).addBox(-0.9093F, -0.5719F, -9.4097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 2.8773F, 1.0888F, 0.2027F, 0.1049F, 0.0336F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(125, 58).addBox(-0.9093F, -0.6943F, -8.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 2.8773F, 1.0888F, 0.2551F, 0.1049F, 0.0336F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(43, 125).addBox(-0.9093F, -0.9101F, -7.4485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 2.8773F, 1.0888F, 0.3075F, 0.1049F, 0.0336F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(33, 125).addBox(-0.9093F, -1.209F, -6.4695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 2.8773F, 1.0888F, 0.3947F, 0.1049F, 0.0336F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(125, 32).addBox(-0.9093F, -1.6673F, -5.4549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 2.8773F, 1.0888F, 0.4558F, 0.1049F, 0.0336F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(25, 125).addBox(-0.9093F, -1.9369F, -4.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 2.8773F, 1.0888F, 0.5256F, 0.1049F, 0.0336F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(125, 23).addBox(-0.9093F, -1.8323F, -3.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 130).addBox(-0.9093F, -0.8323F, -2.3986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 2.8773F, 1.0888F, 0.5693F, 0.1049F, 0.0336F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(100, 47).addBox(-0.9093F, -3.7358F, -1.9104F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.2115F, 0.1049F, 0.0336F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(48, 114).addBox(-0.8948F, -4.6624F, -0.0327F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.2531F, -0.0349F, 0.0F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(38, 95).addBox(-0.5F, -2.475F, -0.825F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3356F, 0.6343F, 1.7943F, 0.0087F, 0.0524F, 0.0F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(130, 122).addBox(-0.9399F, -4.6508F, -0.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8439F, 3.1273F, 3.0888F, -0.5236F, -0.0349F, -0.0175F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(59, 133).addBox(-0.4276F, 0.5783F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.4043F, -1.6294F, 2.6252F, -1.4476F, -0.0792F, 0.3553F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(133, 64).addBox(-0.2933F, -1.58F, -0.9094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.4043F, -1.6294F, 2.6252F, -1.9633F, 0.0114F, 0.3754F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(17, 127).addBox(-0.3301F, -1.032F, -0.6512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.4043F, -1.6294F, 2.6252F, -1.6572F, 0.0507F, 0.3713F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(64, 133).addBox(-0.8368F, 0.5783F, -0.3985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.4043F, -1.6294F, 2.6252F, -1.5398F, -0.1431F, 1.1433F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(133, 67).addBox(-0.8001F, -1.58F, -0.5772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.4043F, -1.6294F, 2.6252F, -1.8571F, 0.2726F, 1.0886F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(127, 114).addBox(-0.6509F, -1.032F, -0.3633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.4043F, -1.6294F, 2.6252F, -1.5994F, 0.096F, 1.1227F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(114, 45).addBox(-0.5F, -0.45F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3442F, -1.5322F, 2.4638F, -0.0087F, -0.0349F, -0.0175F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(126, 83).addBox(-0.5F, -0.9F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(125, 19).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3128F, -0.7924F, 3.7321F, -0.3578F, -0.0349F, -0.0175F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(125, 8).addBox(-0.5F, -0.725F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2838F, -0.5246F, 4.6952F, -0.7069F, -0.0349F, -0.0175F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(43, 114).addBox(-0.9399F, -3.5792F, 2.0765F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8439F, 3.1273F, 3.0888F, 0.3927F, -0.0349F, -0.0175F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(7, 125).addBox(-0.5F, -2.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3365F, 2.9953F, 4.9447F, 0.2618F, -0.0349F, -0.0175F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(120, 132).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3819F, 2.3514F, 4.4738F, -0.8858F, -0.0349F, -0.0175F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(132, 115).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4119F, 2.1217F, 3.5011F, -0.2313F, -0.0349F, -0.0175F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(132, 112).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3961F, 1.1229F, 3.4531F, 0.048F, -0.0349F, -0.0175F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(125, 4).addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3594F, 0.1811F, 4.0338F, -0.1091F, -0.0349F, -0.0175F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(132, 95).addBox(-0.5F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3658F, 0.959F, 4.2399F, 1.7017F, -0.0349F, -0.0175F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(107, 130).addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3658F, 0.959F, 4.2399F, 1.8326F, -0.0349F, -0.0175F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(43, 133).addBox(-0.7343F, -6.0006F, -7.4082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(130, 103).addBox(-0.7343F, -6.0006F, -6.7082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.7351F, 0.1049F, 0.0336F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(30, 133).addBox(-0.8447F, -0.7209F, -4.3708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, -0.1114F, 0.1049F, 0.0336F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(102, 130).addBox(-0.8447F, -4.2659F, -1.1938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 1.023F, 0.1049F, 0.0336F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(130, 100).addBox(-0.8447F, -0.1328F, -3.8837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, -1.3157F, 0.1049F, 0.0336F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(133, 35).addBox(-0.8447F, -3.0093F, -1.9478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, -0.0765F, 0.1049F, 0.0336F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(97, 130).addBox(-0.8447F, -2.8177F, -1.4897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.1416F, 0.1049F, 0.0336F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(133, 32).addBox(-0.5F, -1.0F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(130, 92).addBox(-0.5F, -1.0F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3344F, 1.0733F, 0.3921F, 1.2499F, 0.1049F, 0.0336F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(130, 89).addBox(-0.8447F, 0.6127F, 1.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, -2.8865F, 0.1049F, 0.0336F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(113, 20).addBox(-0.8447F, 2.0521F, -2.3436F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, -1.4466F, 0.1049F, 0.0336F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(87, 124).addBox(-0.8447F, -1.3522F, -3.9131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, -0.2074F, 0.1049F, 0.0336F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(104, 60).addBox(-0.8447F, -4.0762F, -1.291F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.7612F, 0.1049F, 0.0336F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(130, 58).addBox(-0.8447F, -1.5312F, 2.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 1.7823F, 0.1049F, 0.0336F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(25, 133).addBox(-0.4606F, -6.0956F, 1.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(130, 24).addBox(-0.6355F, -6.0956F, 1.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0439F, 0.6273F, 7.5888F, 1.7453F, 0.0524F, 0.0F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(107, 126).addBox(-0.5F, -1.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.5634F, -0.4827F, 2.4457F, 2.8798F, 0.0524F, 0.0F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(133, 3).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5441F, -1.1923F, 2.0768F, 0.48F, 0.0524F, 0.0F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(126, 108).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5817F, 1.332F, 2.8329F, 0.2088F, 0.0281F, -0.0442F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(133, 20).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6057F, 2.0705F, 2.5265F, 1.1775F, 0.0281F, -0.0442F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(116, 100).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.5607F, 1.6196F, 1.635F, 1.7447F, 0.0281F, -0.0442F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(20, 133).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5253F, 1.1474F, 1.1195F, 2.3992F, 0.0281F, -0.0442F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(133, 17).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.4866F, 0.3604F, 0.9811F, -2.9677F, 0.0281F, -0.0442F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(133, 6).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4986F, -0.1939F, 1.2104F, -1.9635F, 0.0524F, 0.0F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(5, 133).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.4941F, -0.5844F, 1.1239F, -1.3526F, 0.0524F, 0.0F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(130, 9).addBox(-0.5F, -0.525F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5277F, -0.8261F, 1.7656F, -0.2182F, 0.0524F, 0.0F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(16, 100).addBox(-0.9399F, -3.9952F, -0.1253F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8439F, 3.1273F, 3.0888F, 0.0872F, -0.0356F, -0.0159F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(1.099F, 1.0098F, -5.7129F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(12, 127).mirror().addBox(-0.4F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(70, 125).mirror().addBox(-0.4F, -0.9F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4997F, -1.6639F, 3.7479F, 2.8239F, -1.3136F, -0.2761F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(0.7109F, -0.7839F, -6.3858F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.2084F, -0.0788F, -0.0537F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(133, 38).mirror().addBox(0.4553F, -6.0502F, -6.5539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.7379F, -0.0549F, -0.1505F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(45, 102).mirror().addBox(0.4553F, -5.4287F, -6.1805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.6331F, -0.0549F, -0.1505F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(86, 96).mirror().addBox(0.3715F, -5.2083F, -3.5713F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.5642F, -0.065F, -0.1402F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(54, 108).mirror().addBox(0.3715F, -1.2711F, 3.0859F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 2.0041F, -0.065F, -0.1402F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(125, 126).mirror().addBox(0.3715F, 3.1291F, -0.7004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, -2.909F, -0.065F, -0.1402F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(114, 85).mirror().addBox(0.3715F, 1.5668F, -4.4956F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, -1.9927F, -0.065F, -0.1402F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(114, 49).mirror().addBox(0.0145F, -1.1891F, 1.4783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8439F, 3.1273F, 3.0888F, 0.075F, 0.0349F, 0.0175F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(10, 131).mirror().addBox(-0.0907F, -1.5383F, -9.9043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(54, 101).mirror().addBox(-0.0907F, -3.9373F, -3.5796F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.3075F, -0.1049F, -0.0336F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(130, 128).mirror().addBox(-0.0907F, 0.713F, -9.6677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.0631F, -0.1049F, -0.0336F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(130, 125).mirror().addBox(-0.0907F, -0.0417F, -8.9537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.1504F, -0.1049F, -0.0336F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(97, 126).mirror().addBox(-0.0907F, -2.0844F, -8.0526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.2813F, -0.1049F, -0.0336F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(125, 68).mirror().addBox(-0.0907F, -2.6987F, -7.0184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.3685F, -0.1049F, -0.0336F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(89, 54).mirror().addBox(-0.0907F, -2.4276F, -6.4896F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.1591F, -0.1049F, -0.0336F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(102, 126).mirror().addBox(-0.0907F, -8.7201F, -4.9295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 1.2063F, -0.1049F, -0.0336F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(65, 125).mirror().addBox(-0.0907F, -6.8502F, -6.6749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.8572F, -0.1049F, -0.0336F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(108, 27).mirror().addBox(-0.0907F, -4.6576F, -1.5231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.3336F, -0.1049F, -0.0336F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-0.0907F, -4.8513F, -3.6912F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.5082F, -0.1049F, -0.0336F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(7, 85).mirror().addBox(-0.0907F, -5.1546F, -7.2543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.5954F, -0.1049F, -0.0336F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(127, 97).mirror().addBox(-0.0907F, 0.1531F, -10.3597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.2027F, -0.1049F, -0.0336F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(60, 125).mirror().addBox(-0.0907F, -0.5719F, -9.4097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 2.8773F, 1.0888F, 0.2027F, -0.1049F, -0.0336F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(125, 58).mirror().addBox(-0.0907F, -0.6943F, -8.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 2.8773F, 1.0888F, 0.2551F, -0.1049F, -0.0336F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(43, 125).mirror().addBox(-0.0907F, -0.9101F, -7.4485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 2.8773F, 1.0888F, 0.3075F, -0.1049F, -0.0336F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(33, 125).mirror().addBox(-0.0907F, -1.209F, -6.4695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 2.8773F, 1.0888F, 0.3947F, -0.1049F, -0.0336F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(125, 32).mirror().addBox(-0.0907F, -1.6673F, -5.4549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 2.8773F, 1.0888F, 0.4558F, -0.1049F, -0.0336F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(25, 125).mirror().addBox(-0.0907F, -1.9369F, -4.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 2.8773F, 1.0888F, 0.5256F, -0.1049F, -0.0336F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(125, 23).mirror().addBox(-0.0907F, -1.8323F, -3.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 130).mirror().addBox(-0.0907F, -0.8323F, -2.3986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 2.8773F, 1.0888F, 0.5693F, -0.1049F, -0.0336F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(100, 47).mirror().addBox(-0.0907F, -3.7358F, -1.9104F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.2115F, -0.1049F, -0.0336F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(48, 114).mirror().addBox(-0.1052F, -4.6624F, -0.0327F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.2531F, 0.0349F, 0.0F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(38, 95).mirror().addBox(-0.5F, -2.475F, -0.825F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3356F, 0.6343F, 1.7943F, 0.0087F, -0.0524F, 0.0F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(130, 122).mirror().addBox(-0.0601F, -4.6508F, -0.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8439F, 3.1273F, 3.0888F, -0.5236F, 0.0349F, 0.0175F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(59, 133).mirror().addBox(-0.5724F, 0.5783F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.4043F, -1.6294F, 2.6252F, -1.4476F, 0.0792F, -0.3553F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(133, 64).mirror().addBox(-0.7067F, -1.58F, -0.9094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.4043F, -1.6294F, 2.6252F, -1.9633F, -0.0114F, -0.3754F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(17, 127).mirror().addBox(-0.6699F, -1.032F, -0.6512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.4043F, -1.6294F, 2.6252F, -1.6572F, -0.0507F, -0.3713F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(64, 133).mirror().addBox(-0.1632F, 0.5783F, -0.3985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.4043F, -1.6294F, 2.6252F, -1.5398F, 0.1431F, -1.1433F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(133, 67).mirror().addBox(-0.1999F, -1.58F, -0.5772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.4043F, -1.6294F, 2.6252F, -1.8571F, -0.2726F, -1.0886F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(127, 114).mirror().addBox(-0.3491F, -1.032F, -0.3633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.4043F, -1.6294F, 2.6252F, -1.5994F, -0.096F, -1.1227F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(114, 45).mirror().addBox(-0.5F, -0.45F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3442F, -1.5322F, 2.4638F, -0.0087F, 0.0349F, 0.0175F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(126, 83).mirror().addBox(-0.5F, -0.9F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(125, 19).mirror().addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3128F, -0.7924F, 3.7321F, -0.3578F, 0.0349F, 0.0175F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(125, 8).mirror().addBox(-0.5F, -0.725F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2838F, -0.5246F, 4.6952F, -0.7069F, 0.0349F, 0.0175F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(43, 114).mirror().addBox(-0.0601F, -3.5792F, 2.0765F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8439F, 3.1273F, 3.0888F, 0.3927F, 0.0349F, 0.0175F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(7, 125).mirror().addBox(-0.5F, -2.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3365F, 2.9953F, 4.9447F, 0.2618F, 0.0349F, 0.0175F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(120, 132).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3819F, 2.3514F, 4.4738F, -0.8858F, 0.0349F, 0.0175F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(132, 115).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4119F, 2.1217F, 3.5011F, -0.2313F, 0.0349F, 0.0175F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(132, 112).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3961F, 1.1229F, 3.4531F, 0.048F, 0.0349F, 0.0175F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(125, 4).mirror().addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3594F, 0.1811F, 4.0338F, -0.1091F, 0.0349F, 0.0175F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(132, 95).mirror().addBox(-0.5F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3658F, 0.959F, 4.2399F, 1.7017F, 0.0349F, 0.0175F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(107, 130).mirror().addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3658F, 0.959F, 4.2399F, 1.8326F, 0.0349F, 0.0175F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(43, 133).mirror().addBox(-0.2657F, -6.0006F, -7.4082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(130, 103).mirror().addBox(-0.2657F, -6.0006F, -6.7082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.7351F, -0.1049F, -0.0336F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(30, 133).mirror().addBox(-0.1553F, -0.7209F, -4.3708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, -0.1114F, -0.1049F, -0.0336F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(102, 130).mirror().addBox(-0.1553F, -4.2659F, -1.1938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 1.023F, -0.1049F, -0.0336F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(130, 100).mirror().addBox(-0.1553F, -0.1328F, -3.8837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, -1.3157F, -0.1049F, -0.0336F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(133, 35).mirror().addBox(-0.1553F, -3.0093F, -1.9478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, -0.0765F, -0.1049F, -0.0336F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(97, 130).mirror().addBox(-0.1553F, -2.8177F, -1.4897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.1416F, -0.1049F, -0.0336F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(133, 32).mirror().addBox(-0.5F, -1.0F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(130, 92).mirror().addBox(-0.5F, -1.0F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3344F, 1.0733F, 0.3921F, 1.2499F, -0.1049F, -0.0336F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(130, 89).mirror().addBox(-0.1553F, 0.6127F, 1.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, -2.8865F, -0.1049F, -0.0336F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(113, 20).mirror().addBox(-0.1553F, 2.0521F, -2.3436F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, -1.4466F, -0.1049F, -0.0336F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(87, 124).mirror().addBox(-0.1553F, -1.3522F, -3.9131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, -0.2074F, -0.1049F, -0.0336F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(104, 60).mirror().addBox(-0.1553F, -4.0762F, -1.291F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.7612F, -0.1049F, -0.0336F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(130, 58).mirror().addBox(-0.1553F, -1.5312F, 2.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 1.7823F, -0.1049F, -0.0336F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(25, 133).mirror().addBox(-0.5395F, -6.0956F, 1.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(130, 24).mirror().addBox(-0.3644F, -6.0956F, 1.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.0439F, 0.6273F, 7.5888F, 1.7453F, -0.0524F, 0.0F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(107, 126).mirror().addBox(-0.5F, -1.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-2.5634F, -0.4827F, 2.4457F, 2.8798F, -0.0524F, 0.0F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(133, 3).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.5441F, -1.1923F, 2.0768F, 0.48F, -0.0524F, 0.0F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(126, 108).mirror().addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.5817F, 1.332F, 2.8329F, 0.2088F, -0.0281F, 0.0442F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(133, 20).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6057F, 2.0705F, 2.5265F, 1.1775F, -0.0281F, 0.0442F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(116, 100).mirror().addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.5607F, 1.6196F, 1.635F, 1.7447F, -0.0281F, 0.0442F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(20, 133).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5253F, 1.1474F, 1.1195F, 2.3992F, -0.0281F, 0.0442F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(133, 17).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4866F, 0.3604F, 0.9811F, -2.9677F, -0.0281F, 0.0442F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(133, 6).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4986F, -0.1939F, 1.2104F, -1.9635F, -0.0524F, 0.0F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(5, 133).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4941F, -0.5844F, 1.1239F, -1.3526F, -0.0524F, 0.0F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(130, 9).mirror().addBox(-0.5F, -0.525F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5277F, -0.8261F, 1.7656F, -0.2182F, -0.0524F, 0.0F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(16, 100).mirror().addBox(-0.0601F, -3.9952F, -0.1253F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8439F, 3.1273F, 3.0888F, 0.0872F, 0.0356F, 0.0159F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.719F, 0.645F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(133, 73).mirror().addBox(-1.134F, -2.275F, -2.9162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false)
				.texOffs(133, 70).mirror().addBox(-1.134F, -1.975F, -2.9162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3796F, 0.463F, -11.558F, 0.21F, -0.0477F, 0.0107F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(109, 65).mirror().addBox(0.2F, 0.2313F, -3.7411F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 65).addBox(2.2407F, 0.2313F, -3.7411F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(84, 128).mirror().addBox(0.2F, -0.4076F, -3.5612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(84, 128).addBox(2.2407F, -0.4076F, -3.5612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(69, 133).mirror().addBox(0.2F, -0.3871F, -0.4811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(100, 65).mirror().addBox(0.2F, -0.3871F, -3.0811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(69, 133).addBox(2.2407F, -0.3871F, -0.4811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F))
				.texOffs(100, 65).addBox(2.2407F, -0.3871F, -3.0811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(116, 93).mirror().addBox(0.2F, -0.1092F, -2.9442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(116, 93).addBox(2.2407F, -0.1092F, -2.9442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(107, 86).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.1043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(82, 107).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.1043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(132, 61).mirror().addBox(-1.134F, -0.9087F, -2.9663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.3796F, 0.463F, -11.558F, -0.1914F, -0.0477F, 0.0107F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(116, 89).mirror().addBox(-1.134F, -0.9775F, -2.0753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(0.3796F, 0.463F, -11.558F, -0.1565F, -0.0477F, 0.0107F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(101, 16).mirror().addBox(-0.8348F, -0.287F, -3.7991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.463F, -7.9581F, -0.192F, -0.1353F, 0.0F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(116, 65).mirror().addBox(-0.8348F, -0.1069F, -1.7266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.463F, -7.9581F, -0.3142F, -0.1353F, 0.0F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(107, 51).mirror().addBox(-1.0748F, -0.3318F, -1.2593F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.463F, -6.358F, -0.5149F, -0.1571F, 0.0F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(48, 126).mirror().addBox(0.2F, 1.1422F, -6.4323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(48, 126).addBox(2.2407F, 1.1422F, -6.4323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(120, 10).mirror().addBox(0.2F, -0.0493F, -5.5886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(120, 5).mirror().addBox(0.2F, -0.0493F, -4.6136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(120, 10).addBox(2.2407F, -0.0493F, -5.5886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(120, 5).addBox(2.2407F, -0.0493F, -4.6136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(126, 44).mirror().addBox(0.2F, 0.4534F, -3.9786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(126, 44).addBox(2.2407F, 0.4534F, -3.9786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(116, 41).mirror().addBox(0.2F, -0.5155F, -0.9192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(116, 41).addBox(2.2407F, -0.5155F, -0.9192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(51, 132).mirror().addBox(-0.8348F, -0.8796F, -0.9735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.463F, -7.9581F, -0.0131F, -0.1353F, 0.0F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(132, 0).mirror().addBox(-1.134F, -1.0788F, -2.9613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3796F, 0.463F, -11.558F, -0.1652F, -0.0477F, 0.0107F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(116, 37).mirror().addBox(-1.134F, -1.1208F, -2.0984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3796F, 0.463F, -11.558F, -0.1478F, -0.0477F, 0.0107F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(21, 116).mirror().addBox(-0.8348F, -0.7095F, -3.7923F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.463F, -7.9581F, -0.1134F, -0.1353F, 0.0F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(130, 131).mirror().addBox(-1.1365F, -1.7759F, -3.3469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(38, 126).mirror().addBox(-1.1365F, -2.1759F, -2.3469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 126).mirror().addBox(-1.1365F, -2.1759F, -1.3469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3796F, 0.463F, -11.558F, -0.2051F, -0.048F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(125, 122).mirror().addBox(-0.6311F, -1.6048F, -3.9473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6203F, 0.463F, -7.9581F, -0.1614F, -0.1353F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(115, 125).mirror().addBox(-0.6311F, -1.55F, -2.9079F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6203F, 0.463F, -7.9581F, -0.1091F, -0.1353F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(131, 109).mirror().addBox(-0.6311F, -1.5801F, -1.86F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(131, 106).mirror().addBox(-0.6311F, -1.4801F, -0.86F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6203F, 0.463F, -7.9581F, -0.0567F, -0.1353F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(131, 83).mirror().addBox(-0.8348F, -0.8292F, -1.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.463F, -7.9581F, -0.0567F, -0.1353F, 0.0F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(14, 116).mirror().addBox(-1.0748F, -0.9911F, -1.6817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.463F, -6.358F, 0.0742F, -0.1571F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(92, 125).mirror().addBox(0.2F, -1.8396F, -6.4267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 125).addBox(2.2407F, -1.8396F, -6.4267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(131, 53).mirror().addBox(0.175F, -0.0553F, -4.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(131, 50).mirror().addBox(0.175F, -0.0553F, -4.8225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(131, 53).addBox(2.2657F, -0.0553F, -4.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(131, 50).addBox(2.2657F, -0.0553F, -4.8225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(0.2F, -1.2636F, -5.5841F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(120, 0).addBox(2.2407F, -1.2636F, -5.5841F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(125, 76).mirror().addBox(0.2F, -0.6152F, -4.7086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(125, 76).addBox(2.2407F, -0.6152F, -4.7086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(131, 45).mirror().addBox(0.2F, -0.0357F, -2.7729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(131, 45).addBox(2.2407F, -0.0357F, -2.7729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(36, 115).mirror().addBox(0.2F, -0.2403F, -1.8933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(36, 115).addBox(2.2407F, -0.2403F, -1.8933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.142F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(107, 86).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.1043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(82, 107).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.1043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(133, 73).addBox(0.1339F, -2.275F, -2.9162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F))
				.texOffs(133, 70).addBox(0.1339F, -1.975F, -2.9162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3796F, 0.463F, -11.558F, 0.21F, 0.0477F, -0.0107F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(132, 61).addBox(0.1339F, -0.9087F, -2.9663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-0.3796F, 0.463F, -11.558F, -0.1914F, 0.0477F, -0.0107F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(116, 89).addBox(0.1339F, -0.9775F, -2.0753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-0.3796F, 0.463F, -11.558F, -0.1565F, 0.0477F, -0.0107F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(101, 16).addBox(-0.1653F, -0.287F, -3.7991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.4204F, 0.463F, -7.9581F, -0.192F, 0.1353F, 0.0F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(116, 65).addBox(-0.1653F, -0.1069F, -1.7266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(0.4204F, 0.463F, -7.9581F, -0.3142F, 0.1353F, 0.0F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(107, 51).addBox(0.0748F, -0.3318F, -1.2593F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.4204F, 0.463F, -6.358F, -0.5149F, 0.1571F, 0.0F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(51, 132).addBox(-0.1653F, -0.8796F, -0.9735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4204F, 0.463F, -7.9581F, -0.0131F, 0.1353F, 0.0F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(132, 0).addBox(0.1339F, -1.0788F, -2.9613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3796F, 0.463F, -11.558F, -0.1652F, 0.0477F, -0.0107F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(116, 37).addBox(0.1339F, -1.1208F, -2.0984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3796F, 0.463F, -11.558F, -0.1478F, 0.0477F, -0.0107F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(21, 116).addBox(-0.1653F, -0.7095F, -3.7923F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4204F, 0.463F, -7.9581F, -0.1134F, 0.1353F, 0.0F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(130, 131).addBox(0.1365F, -1.7759F, -3.3469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 126).addBox(0.1365F, -2.1759F, -2.3469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 126).addBox(0.1365F, -2.1759F, -1.3469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3796F, 0.463F, -11.558F, -0.2051F, 0.048F, 0.0F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(125, 122).addBox(-0.3689F, -1.6048F, -3.9473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6203F, 0.463F, -7.9581F, -0.1614F, 0.1353F, 0.0F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(115, 125).addBox(-0.3689F, -1.55F, -2.9079F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6203F, 0.463F, -7.9581F, -0.1091F, 0.1353F, 0.0F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(131, 109).addBox(-0.3689F, -1.5801F, -1.86F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(131, 106).addBox(-0.3689F, -1.4801F, -0.86F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6203F, 0.463F, -7.9581F, -0.0567F, 0.1353F, 0.0F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(131, 83).addBox(-0.1653F, -0.8292F, -1.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4204F, 0.463F, -7.9581F, -0.0567F, 0.1353F, 0.0F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(14, 116).addBox(0.0748F, -0.9911F, -1.6817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4204F, 0.463F, -6.358F, 0.0742F, 0.1571F, 0.0F));

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