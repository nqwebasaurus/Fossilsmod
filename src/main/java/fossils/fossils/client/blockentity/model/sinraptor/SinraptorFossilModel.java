package fossils.fossils.client.blockentity.model.sinraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SinraptorFossilModel extends SkullModelBase {
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

	public SinraptorFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -37.1341F, 0.6698F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 95).addBox(0.0F, -6.0F, -1.8F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1458F, -2.3716F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 88).addBox(-0.003F, 0.0F, -3.0F, 0.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.88F, 1.6382F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 8).addBox(0.0F, 0.0F, -7.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6645F, 8.5319F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(122, 39).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2318F, -3.2726F, 0.0171F, 0.068F, -1.0801F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(126, 58).mirror().addBox(-4.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2318F, -3.2726F, -0.0239F, 0.0659F, -1.6748F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(126, 49).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2318F, -3.2726F, 0.0443F, 0.0544F, -0.6431F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(126, 49).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2318F, -3.2726F, 0.0443F, -0.0544F, 0.6431F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(126, 58).addBox(2.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2318F, -3.2726F, -0.0239F, -0.0659F, 1.6748F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(122, 39).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2318F, -3.2726F, 0.0171F, -0.068F, 1.0801F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -1.9822F, 0.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, -4.8866F, 8.1549F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(106, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0874F, 0.2013F, -2.0316F, -0.3092F, -0.0321F, -0.4016F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 66).addBox(-0.5827F, 3.7931F, -7.8175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(106, 21).addBox(-0.5827F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6473F, 3.8058F, -0.8251F, 0.513F, -0.0327F, -0.4104F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(75, 73).addBox(-0.5F, -1.4F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3346F, 3.2041F, 0.6033F, 0.1203F, -0.0327F, -0.4104F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 126).addBox(-0.5F, -0.925F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9733F, 2.5274F, 1.8427F, -0.1982F, -0.0391F, -0.4053F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 92).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.703F, 2.0261F, 3.1372F, -0.3727F, -0.0391F, -0.4053F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(57, 131).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9929F, 5.7409F, -2.2328F, 0.2875F, 0.0639F, 0.0248F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(131, 55).addBox(-0.0208F, 3.2567F, 0.5512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7191F, 10.7346F, 0.1332F, 0.2765F, -0.0047F, -0.1248F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(33, 131).addBox(-0.0208F, 2.8876F, 2.4387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7191F, 10.7346F, 0.1332F, -0.2471F, -0.0047F, -0.1248F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 117).addBox(-0.0208F, 4.2848F, 0.4717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7191F, 10.7346F, 0.1332F, 0.1456F, -0.0047F, -0.1248F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(134, 101).addBox(-0.0208F, 4.8248F, -0.0356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(134, 95).addBox(-0.0208F, 4.4248F, -0.0356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7191F, 10.7346F, 0.1332F, 0.582F, -0.0047F, -0.1248F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(21, 131).addBox(0.0026F, 3.4892F, -0.4229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7191F, 10.7346F, 0.1332F, 0.669F, -0.0063F, -0.119F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(121, 47).addBox(0.0214F, 0.5234F, -0.7273F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(114, 60).addBox(0.0214F, -0.5431F, -1.018F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7191F, 10.7346F, 0.1332F, 0.756F, -0.0084F, -0.1135F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(112, 93).addBox(0.0214F, 0.0259F, -0.2799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7191F, 10.7346F, 0.1332F, 0.3633F, -0.0084F, -0.1135F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(92, 115).addBox(-1.1984F, -0.0223F, -1.0424F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5191F, 8.1346F, -2.0668F, 0.8517F, -0.0583F, 0.1644F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(124, 52).addBox(-1.1984F, -1.6984F, -2.5288F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5191F, 8.1346F, -2.0668F, 1.2444F, -0.0583F, 0.1644F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(115, 76).addBox(-1.1984F, -1.0259F, -1.8403F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5191F, 8.1346F, -2.0668F, 0.939F, -0.0583F, 0.1644F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(107, 50).addBox(-0.5F, -3.4F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8519F, 9.2065F, -3.0928F, 0.0693F, 0.0639F, 0.0248F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(85, 130).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5358F, 9.0704F, -8.0861F, -1.1437F, 0.0639F, 0.0248F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(86, 121).addBox(0.1069F, 3.3632F, 3.4071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7085F, 13.2318F, -9.8961F, -0.9866F, 0.0639F, -0.1672F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(131, 60).addBox(0.1069F, 2.8605F, 6.0987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7085F, 13.2318F, -9.8961F, -1.5014F, 0.0639F, -0.1672F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(26, 122).addBox(0.1069F, 1.811F, 4.9522F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7085F, 13.2318F, -9.8961F, -1.2047F, 0.0639F, -0.1672F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(81, 121).addBox(0.1069F, 3.5007F, -0.153F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7085F, 13.2318F, -9.8961F, -0.3757F, 0.0639F, -0.1672F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(110, 124).addBox(0.1069F, 3.2917F, -2.46F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7085F, 13.2318F, -9.8961F, 0.2352F, 0.0639F, -0.1672F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(97, 116).addBox(0.1069F, 0.0637F, -0.4551F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7085F, 13.2318F, -9.8961F, -0.2884F, 0.0639F, -0.1672F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 132).addBox(-0.5F, -0.45F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4179F, 9.2627F, -9.8545F, 0.4533F, 0.0639F, 0.0248F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(124, 95).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4132F, 9.4626F, -9.8511F, -0.0179F, 0.0639F, 0.0248F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(21, 112).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5085F, 9.6318F, -8.2961F, -0.2884F, 0.0639F, 0.0248F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 107).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5431F, 6.1208F, -9.1155F, -0.3583F, 0.0639F, 0.0248F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(106, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6736F, 4.8657F, -7.5638F, -0.8906F, 0.0639F, 0.0248F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(17, 66).addBox(-0.3844F, -0.3139F, -2.3767F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7319F, 4.3537F, -5.0402F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(124, 103).addBox(-0.5F, -1.6583F, -0.4431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(116, 53).addBox(-0.5F, -2.6583F, -1.4431F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 2.4509F, -0.3037F, -0.3808F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(10, 131).addBox(-0.5F, -1.8392F, -1.9698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(0, 126).addBox(-0.5F, -1.8392F, -0.9698F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 1.7964F, -0.3037F, -0.3808F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(14, 112).addBox(-0.5F, -1.7844F, -0.4469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 1.5346F, -0.3037F, -0.3808F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(47, 128).addBox(-0.5F, -2.3219F, 0.4529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 1.011F, -0.3037F, -0.3808F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(73, 118).addBox(-0.5F, -2.7304F, 0.2166F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 0.531F, -0.3037F, -0.3808F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 108).addBox(-0.5F, -2.9698F, 0.3392F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.5949F, -8.4846F, 0.2256F, -0.3037F, -0.3808F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(89, 51).addBox(-0.58F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -8.0F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -4.8866F, 8.1549F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(106, 5).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0874F, 0.2013F, -2.0316F, -0.3092F, 0.0321F, 0.4016F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(30, 66).mirror().addBox(-0.4173F, 3.7931F, -7.8175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 21).mirror().addBox(-0.4173F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(117, 105).mirror().addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6473F, 3.8058F, -0.8251F, 0.513F, 0.0327F, 0.4104F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(75, 73).mirror().addBox(-0.5F, -1.4F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3346F, 3.2041F, 0.6033F, 0.1203F, 0.0327F, 0.4104F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(42, 126).mirror().addBox(-0.5F, -0.925F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9733F, 2.5274F, 1.8427F, -0.1982F, 0.0391F, 0.4053F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(68, 92).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.703F, 2.0261F, 3.1372F, -0.3727F, 0.0391F, 0.4053F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(57, 131).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9929F, 5.7409F, -2.2328F, 0.2875F, -0.0639F, -0.0248F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(131, 55).mirror().addBox(-0.9792F, 3.2567F, 0.5512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7191F, 10.7346F, 0.1332F, 0.2765F, 0.0047F, 0.1248F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(33, 131).mirror().addBox(-0.9792F, 2.8876F, 2.4387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7191F, 10.7346F, 0.1332F, -0.2471F, 0.0047F, 0.1248F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-0.9792F, 4.2848F, 0.4717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7191F, 10.7346F, 0.1332F, 0.1456F, 0.0047F, 0.1248F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(134, 101).mirror().addBox(-0.9792F, 4.8248F, -0.0356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(134, 95).mirror().addBox(-0.9792F, 4.4248F, -0.0356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7191F, 10.7346F, 0.1332F, 0.582F, 0.0047F, 0.1248F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(21, 131).mirror().addBox(-1.0026F, 3.4892F, -0.4229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7191F, 10.7346F, 0.1332F, 0.669F, 0.0063F, 0.119F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(121, 47).mirror().addBox(-1.0214F, 0.5234F, -0.7273F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(114, 60).mirror().addBox(-1.0214F, -0.5431F, -1.018F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7191F, 10.7346F, 0.1332F, 0.756F, 0.0084F, 0.1135F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(112, 93).mirror().addBox(-1.0214F, 0.0259F, -0.2799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7191F, 10.7346F, 0.1332F, 0.3633F, 0.0084F, 0.1135F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(92, 115).mirror().addBox(0.1984F, -0.0223F, -1.0424F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5191F, 8.1346F, -2.0668F, 0.8517F, 0.0583F, -0.1644F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(124, 52).mirror().addBox(0.1984F, -1.6984F, -2.5288F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5191F, 8.1346F, -2.0668F, 1.2444F, 0.0583F, -0.1644F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(115, 76).mirror().addBox(0.1984F, -1.0259F, -1.8403F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5191F, 8.1346F, -2.0668F, 0.939F, 0.0583F, -0.1644F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(107, 50).mirror().addBox(-0.5F, -3.4F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8519F, 9.2065F, -3.0928F, 0.0693F, -0.0639F, -0.0248F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(85, 130).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5358F, 9.0704F, -8.0861F, -1.1437F, -0.0639F, -0.0248F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(86, 121).mirror().addBox(-1.1069F, 3.3632F, 3.4071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7085F, 13.2318F, -9.8961F, -0.9866F, -0.0639F, 0.1672F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(131, 60).mirror().addBox(-1.1069F, 2.8605F, 6.0987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7085F, 13.2318F, -9.8961F, -1.5014F, -0.0639F, 0.1672F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(26, 122).mirror().addBox(-1.1069F, 1.811F, 4.9522F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7085F, 13.2318F, -9.8961F, -1.2047F, -0.0639F, 0.1672F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(81, 121).mirror().addBox(-1.1069F, 3.5007F, -0.153F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7085F, 13.2318F, -9.8961F, -0.3757F, -0.0639F, 0.1672F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(110, 124).mirror().addBox(-1.1069F, 3.2917F, -2.46F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7085F, 13.2318F, -9.8961F, 0.2352F, -0.0639F, 0.1672F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(97, 116).mirror().addBox(-1.1069F, 0.0637F, -0.4551F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7085F, 13.2318F, -9.8961F, -0.2884F, -0.0639F, 0.1672F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(15, 132).mirror().addBox(-0.5F, -0.45F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4179F, 9.2627F, -9.8545F, 0.4533F, -0.0639F, -0.0248F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(124, 95).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4132F, 9.4626F, -9.8511F, -0.0179F, -0.0639F, -0.0248F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(21, 112).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5085F, 9.6318F, -8.2961F, -0.2884F, -0.0639F, -0.0248F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(26, 107).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5431F, 6.1208F, -9.1155F, -0.3583F, -0.0639F, -0.0248F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(106, 82).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6736F, 4.8657F, -7.5638F, -0.8906F, -0.0639F, -0.0248F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(17, 66).mirror().addBox(-0.6156F, -0.3139F, -2.3767F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 4.3537F, -5.0402F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(124, 103).mirror().addBox(-0.5F, -1.6583F, -0.4431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(116, 53).mirror().addBox(-0.5F, -2.6583F, -1.4431F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 2.4509F, 0.3037F, 0.3808F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(10, 131).mirror().addBox(-0.5F, -1.8392F, -1.9698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(0, 126).mirror().addBox(-0.5F, -1.8392F, -0.9698F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 1.7964F, 0.3037F, 0.3808F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(14, 112).mirror().addBox(-0.5F, -1.7844F, -0.4469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 1.5346F, 0.3037F, 0.3808F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(47, 128).mirror().addBox(-0.5F, -2.3219F, 0.4529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 1.011F, 0.3037F, 0.3808F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(73, 118).mirror().addBox(-0.5F, -2.7304F, 0.2166F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 0.531F, 0.3037F, 0.3808F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(66, 108).mirror().addBox(-0.5F, -2.9698F, 0.3392F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5949F, -8.4846F, 0.2256F, 0.3037F, 0.3808F));

		PartDefinition cube_r86 = bone5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(89, 51).mirror().addBox(-0.42F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, -8.0F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(57, 81).addBox(-0.4F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 1.442F, 2.2793F, -0.3676F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(88, 73).addBox(-0.6F, 0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 13.015F, -1.2005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(113, 5).addBox(-5.1F, 0.1099F, 0.5781F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(113, 21).addBox(-5.1F, 0.1099F, -0.0219F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 6.9851F, -2.2601F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(122, 36).addBox(-5.1F, 0.0099F, -1.9219F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(120, 71).addBox(-5.1F, 0.0099F, -1.0219F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 12.0054F, -0.9045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(112, 16).addBox(-5.1F, 0.1099F, 0.5781F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 105).addBox(-5.1F, -0.4901F, -0.0219F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 9.9777F, -2.4694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(129, 51).addBox(0.9F, 0.225F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 6.31F, -0.1391F, -3.0892F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(129, 36).addBox(0.9F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 6.31F, -0.1391F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(104, 43).addBox(-5.1F, -0.0707F, -0.9558F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.8214F, 0.4287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(106, 72).addBox(-5.1F, -0.9707F, 0.0441F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 4.1851F, -1.4601F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(97, 21).addBox(-1.1F, -0.4F, -2.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.9376F, 1.0007F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 15.4525F, -0.8306F, 0.6338F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(111, 43).addBox(0.9F, -2.4F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(66, 114).addBox(-0.1F, -1.6F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, 2.3693F, 0.3041F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(108, 100).addBox(-0.1F, -1.9F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(108, 96).addBox(-0.1F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(110, 121).addBox(-0.1F, -0.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 56).addBox(-0.1F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(120, 12).addBox(-0.1F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(91, 59).addBox(-0.1F, -0.5F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(96, 98).addBox(-0.1F, -1.0F, -1.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 98).addBox(-0.1F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(100, 89).addBox(-0.1F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7282F, 0.8127F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 112).addBox(-0.1F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 3.2079F, 0.3786F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(43, 75).addBox(-1.1F, -7.0F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(92, 110).addBox(-1.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.1471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(31, 97).addBox(-1.1F, -0.0365F, -0.9927F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 4.9718F, 0.5373F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 121).addBox(-1.1F, -0.1725F, -0.457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.1197F, 0.3582F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(88, 83).addBox(-1.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.7658F, -1.6184F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(28, 129).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r112 = rightLeg3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(60, 119).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.9009F, 0.1707F, 0.3229F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(31, 0).addBox(-2.5F, -0.8F, -5.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.0399F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(0, 82).addBox(-2.6F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 1.442F, 2.2793F, 0.1557F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(88, 78).addBox(-2.4F, 0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 13.015F, -1.2005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(113, 10).addBox(3.1F, 0.1099F, 0.5781F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(26, 113).addBox(3.1F, 0.1099F, -0.0219F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 6.9851F, -2.2601F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(19, 123).addBox(3.1F, 0.0099F, -1.9219F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(120, 75).addBox(3.1F, 0.0099F, -1.0219F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 12.0054F, -0.9045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(106, 112).addBox(3.1F, 0.1099F, 0.5781F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 105).addBox(3.1F, -0.4901F, -0.0219F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.6F, 9.9777F, -2.4694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(129, 91).addBox(-1.9F, 0.225F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 6.31F, -0.1391F, -3.0892F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(62, 129).addBox(-1.9F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1F, 6.31F, -0.1391F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(12, 105).addBox(3.1F, -0.0707F, -0.9558F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 3.8214F, 0.4287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(107, 60).addBox(3.1F, -0.9707F, 0.0441F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 4.1851F, -1.4601F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(97, 83).addBox(-0.9F, -0.4F, -2.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 1.9376F, 1.0007F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 15.4525F, -0.8306F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(99, 111).addBox(-2.9F, -2.4F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(115, 37).addBox(-1.9F, -1.6F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, 2.3693F, 0.3041F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(108, 108).addBox(-1.9F, -1.9F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(108, 104).addBox(-1.9F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(117, 121).addBox(-1.9F, -0.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 108).addBox(-1.9F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(120, 23).addBox(-1.9F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(9, 92).addBox(-1.9F, -0.5F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(23, 99).addBox(-1.9F, -1.0F, -1.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(89, 98).addBox(-1.9F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(47, 101).addBox(-1.9F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7282F, 0.8127F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(112, 0).addBox(-1.9F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 3.2079F, 0.3786F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 75).addBox(-0.9F, -7.0F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(111, 32).addBox(0.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.1471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 98).addBox(0.1F, -0.0365F, -0.9927F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 4.9718F, 0.5373F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(43, 121).addBox(0.1F, -0.1725F, -0.457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.1197F, 0.3582F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 89).addBox(-2.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.7658F, -1.6184F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(129, 95).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r138 = leftLeg3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(120, 109).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(65, 6).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.9009F, 0.1707F, 1.021F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(21, 37).addBox(-3.5F, -0.8F, -5.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.6507F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4044F, 8.5708F, -0.2271F, -0.0425F, 0.0098F));

		PartDefinition cube_r139 = tail1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(16, 117).addBox(0.0F, -0.2F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0381F, 7.8381F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(65, 122).addBox(0.5F, -0.1129F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1445F, 5.7132F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(13, 117).addBox(0.5F, -4.0823F, -0.1162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.9052F, 6.9135F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(10, 117).addBox(0.5F, -4.7073F, -0.2162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2576F, 5.0586F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(102, 57).addBox(0.5F, -5.0323F, -0.0162F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0066F, 1.8685F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(101, 72).addBox(0.5F, -5.1823F, -1.2162F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8653F, 0.074F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2516F, 0.0289F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r146 = tail1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 45).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2516F, 0.0289F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r147 = tail1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(27, 14).addBox(0.0F, -1.9F, -0.9F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 0.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.2593F, 8.8273F, 0.2102F, -0.0854F, -0.0182F));

		PartDefinition cube_r148 = tail.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(31, 8).mirror().addBox(-2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 8).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1575F, 0.069F, 0.0109F));

		PartDefinition cube_r149 = tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(31, 8).addBox(0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(31, 8).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1575F, -0.069F, -0.0109F));

		PartDefinition cube_r150 = tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(57, 56).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(48, 121).addBox(0.0F, 0.7F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.548F, 6.0799F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(7, 117).addBox(0.0F, -0.2F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1364F, 3.7429F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(102, 116).addBox(0.0F, -0.7F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(39, 125).addBox(0.5F, -3.1073F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.4867F, 5.7705F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(46, 8).addBox(0.5F, -3.0073F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 3.7753F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(5, 98).addBox(0.5F, -3.4823F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(36, 97).addBox(0.5F, -3.8823F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.2365F, -0.0848F, -0.0204F));

		PartDefinition cube_r158 = tail2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(20, 92).addBox(0.0F, -2.7561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(38, 131).addBox(0.0F, -2.7561F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(101, 130).addBox(0.0F, -2.7061F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(47, 96).addBox(0.0F, -2.7811F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(52, 23).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(121, 52).addBox(0.0F, 0.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3862F, 1.7446F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(36, 124).addBox(0.0F, -0.8F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1005F, 6.0433F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(51, 121).addBox(0.0F, 0.0F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-0.9F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4564F, 0.0304F, 0.0175F, 0.0698F, 0.0012F));

		PartDefinition cube_r167 = tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(65, 12).addBox(-0.1F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4564F, 0.0304F, 0.0175F, -0.0698F, -0.0012F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition cube_r168 = tail8.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(23, 45).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail8.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(67, 131).addBox(0.0F, 0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2907F, 7.9722F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail8.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(131, 63).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0618F, 6.0009F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(101, 124).addBox(0.0F, -0.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0245F, 3.9397F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(57, 75).addBox(0.0F, -0.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0846F, 1.901F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(54, 121).addBox(0.0F, -0.8F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.1152F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail8.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(128, 134).addBox(0.0F, -1.9061F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 6.8984F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail8.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(33, 107).addBox(0.0F, -1.9561F, -0.1316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 4.9984F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail8.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(43, 104).addBox(0.0F, -2.0061F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 2.8984F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail8.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(73, 98).addBox(0.0F, -2.0561F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 0.8984F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(131, 134).addBox(0.0F, -2.1468F, -0.102F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 134).addBox(0.0F, -2.0968F, 1.898F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 135).addBox(0.0F, -2.0968F, 3.898F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 85).addBox(0.0F, -2.0468F, 5.898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 109).addBox(0.0F, -1.9968F, 7.898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r178 = tail3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(98, 131).addBox(0.0F, -0.1F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4364F, 6.8875F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(95, 131).addBox(0.0F, -0.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2488F, 5.1861F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(131, 86).addBox(0.0F, -0.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1036F, 3.2148F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(70, 131).addBox(0.0F, -0.1F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1338F, 0.8613F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(44, 45).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r183 = tail9.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(60, 73).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail9.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(78, 102).addBox(0.0F, -0.85F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 89).addBox(0.0F, -0.925F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 89).addBox(0.0F, -0.975F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2579F, 0.5682F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail9.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(46, 135).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.152F, 4.4886F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail9.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(125, 131).addBox(0.0F, -0.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3096F, 2.4724F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail9.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(131, 117).addBox(0.0F, -0.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5646F, 0.4787F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r188 = tail4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(25, 136).addBox(0.0F, -0.5F, 4.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 136).addBox(0.0F, -0.5F, 2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 135).addBox(0.0F, -0.5F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 37).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(104, 135).addBox(0.0F, 2.4F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 135).addBox(0.0F, 1.5F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 135).addBox(0.0F, 0.6F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5331F, -1.4219F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(77, 64).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F))
				.texOffs(28, 136).addBox(0.0F, -0.9698F, 0.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 136).addBox(0.0F, -0.9698F, 2.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.0968F, 0.1303F, -0.0126F));

		PartDefinition cube_r190 = tail5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(136, 59).addBox(0.0F, 4.7F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 135).addBox(0.0F, 3.1F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.186F, -7.6131F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(19, 56).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(136, 53).addBox(0.0F, -0.375F, -0.0013F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 56).addBox(0.0F, -0.325F, 1.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 4.6774F, -0.0701F, 0.0871F, -0.0061F));

		PartDefinition cube_r191 = tail6.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(65, 136).addBox(0.0F, 8.1F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 136).addBox(0.0F, 7.2F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 136).addBox(0.0F, 6.5F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 136).addBox(0.0F, 5.6F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6917F, -12.2905F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(38, 56).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1506F, 0.1726F, -0.0261F));

		PartDefinition cube_r192 = tail7.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(88, 136).addBox(0.0F, 9.7F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 136).addBox(0.0F, 9.0F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6917F, -20.1905F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.1949F, 0.1713F, -0.0336F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0925F, 7.6858F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(51, 90).addBox(-0.5F, -6.0105F, -1.1178F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.169F, -1.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(68, 98).addBox(-0.5F, -5.9522F, -0.0114F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4213F, -5.8697F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(71, 22).addBox(-1.0F, 0.0F, 2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.9382F, -8.0052F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 16.4778F, -0.8411F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(94, 70).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, -0.0239F, 0.2666F, -1.5186F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(127, 115).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.1322F, 0.2334F, -0.9064F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(129, 99).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.2183F, 0.1561F, -0.4685F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(56, 6).mirror().addBox(-5.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, -0.0294F, 0.118F, -1.6753F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(120, 115).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, 0.0419F, 0.1142F, -1.0778F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(126, 0).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, 0.0863F, 0.0858F, -0.6402F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(94, 70).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, -0.0239F, -0.2666F, 1.5186F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(127, 115).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.1322F, -0.2334F, 0.9064F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(129, 99).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.2183F, -0.1561F, 0.4685F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(56, 6).addBox(2.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, -0.0294F, -0.118F, 1.6753F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(120, 115).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, 0.0419F, -0.1142F, 1.0778F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(126, 0).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, 0.0863F, -0.0858F, 0.6402F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r209 = body2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(77, 92).addBox(0.0F, -5.8122F, -1.0627F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0807F, -1.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r210 = body2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(61, 103).addBox(0.0F, -4.9617F, 0.1386F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -9.195F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r211 = body2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(73, 102).addBox(0.0F, -5.5367F, 0.0386F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0262F, -6.0951F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r212 = body2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(126, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.3598F, 0.1358F, -0.3088F));

		PartDefinition cube_r213 = body2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(127, 84).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.2723F, 0.2735F, -0.7322F));

		PartDefinition cube_r214 = body2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(65, 20).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0685F, 0.3777F, -1.3502F));

		PartDefinition cube_r215 = body2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(126, 15).mirror().addBox(-1.5427F, 0.2016F, -0.5131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.15F, -8.1F, 0.3788F, 0.1355F, -0.3945F));

		PartDefinition cube_r216 = body2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(127, 45).mirror().addBox(-3.4833F, -0.4692F, -0.5131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.15F, -8.1F, 0.2903F, 0.281F, -0.8156F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(124, 107).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.2689F, 0.1321F, -0.3998F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(119, 30).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1892F, 0.2327F, -0.8318F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(75, 33).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0238F, 0.2979F, -1.4438F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(124, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.3437F, 0.1288F, -0.3459F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(127, 12).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.2602F, 0.2606F, -0.7703F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0663F, 0.3603F, -1.3859F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(127, 45).addBox(1.4833F, -0.4692F, -0.5131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.15F, -8.1F, 0.2903F, -0.281F, 0.8156F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(126, 15).addBox(-0.4574F, 0.2016F, -0.5131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.15F, -8.1F, 0.3788F, -0.1355F, 0.3945F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(124, 107).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.2689F, -0.1321F, 0.3998F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(27, 27).addBox(-2.5F, -3.5948F, -4.9985F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 15.7054F, -3.1681F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(119, 30).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1892F, -0.2327F, 0.8318F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(75, 33).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0238F, -0.2979F, 1.4438F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(65, 20).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0685F, -0.3777F, 1.3502F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(127, 84).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.2723F, -0.2735F, 0.7322F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(126, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.3598F, -0.1358F, 0.3088F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(124, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.3437F, -0.1288F, 0.3459F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(127, 12).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.2602F, -0.2606F, 0.7703F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 41).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0663F, -0.3603F, 1.3859F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1394F, -7.9567F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(82, 92).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.0391F, -3.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(103, 96).addBox(0.0F, -4.8525F, -0.1399F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -3.8368F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(78, 121).addBox(0.0F, -4.7967F, -0.0424F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -5.9368F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(74, 60).addBox(-3.4872F, -0.7794F, -1.9816F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 12.4298F, -9.0946F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(126, 17).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -9.3368F, 0.3422F, 0.1185F, -0.4392F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(16, 126).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -9.3368F, 0.2632F, 0.2506F, -0.8627F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(77, 71).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -9.3368F, 0.075F, 0.3539F, -1.476F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(124, 121).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.2973F, 0.0913F, -0.3567F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(124, 119).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.2329F, 0.2074F, -0.7823F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(71, 31).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.0756F, 0.3015F, -1.3886F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(124, 117).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -5.4368F, 0.2789F, 0.0953F, -0.3212F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(115, 124).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -5.4368F, 0.2142F, 0.2035F, -0.749F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(52, 35).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -5.4368F, 0.0622F, 0.2879F, -1.3553F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(52, 33).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -2.9368F, 0.054F, 0.2725F, -1.3037F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(104, 16).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -2.9368F, 0.1986F, 0.1953F, -0.6982F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(82, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -2.9368F, 0.2616F, 0.0942F, -0.269F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-2.2629F, -0.9439F, -3.8708F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4872F, 11.5298F, -10.7946F, -0.7753F, -0.356F, 0.3291F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(88, 19).mirror().addBox(-4.1815F, -0.4397F, -0.4054F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5595F, 11.5187F, -9.3502F, -0.2739F, 0.9047F, 1.1612F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(84, 43).mirror().addBox(-5.5696F, -0.2414F, -0.1276F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3485F, 11.9909F, -8.8921F, 0.1048F, 1.0225F, 0.8601F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-7.5056F, -0.0246F, -0.44F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7096F, 12.3261F, -8.7107F, 0.2513F, 1.143F, 0.4102F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(77, 71).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -9.3368F, 0.075F, -0.3539F, 1.476F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(16, 126).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -9.3368F, 0.2632F, -0.2506F, 0.8627F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(126, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -9.3368F, 0.3422F, -0.1185F, 0.4392F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(57, 117).addBox(0.0F, -4.7927F, -0.2837F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -9.7368F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(124, 121).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.2973F, -0.0913F, 0.3567F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(124, 119).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.2329F, -0.2074F, 0.7823F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(71, 31).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.0756F, -0.3015F, 1.3886F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(124, 117).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -5.4368F, 0.2789F, -0.0953F, 0.3212F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(115, 124).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -5.4368F, 0.2142F, -0.2035F, 0.749F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(52, 35).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -5.4368F, 0.0622F, -0.2879F, 1.3553F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(52, 33).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -2.9368F, 0.054F, -0.2725F, 1.3037F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(104, 16).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -2.9368F, 0.1986F, -0.1953F, 0.6982F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(46, 37).addBox(-3.0F, -1.9F, -5.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.1828F, -2.2135F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(82, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -2.9368F, 0.2616F, -0.0942F, 0.269F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(40, 117).addBox(0.0F, -4.8927F, -0.2837F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -7.7368F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(74, 53).addBox(0.2629F, -0.9439F, -3.8708F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4872F, 11.5298F, -10.7946F, -0.7753F, 0.356F, -0.3291F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(88, 19).addBox(-0.8185F, -0.4397F, -0.4054F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5595F, 11.5187F, -9.3502F, -0.2739F, -0.9047F, -1.1612F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(84, 43).addBox(-0.4304F, -0.2414F, -0.1276F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3485F, 11.9909F, -8.8921F, 0.1048F, -1.0225F, -0.8601F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 43).addBox(-0.4944F, -0.0246F, -0.44F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7096F, 12.3261F, -8.7107F, 0.2513F, -1.143F, -0.4102F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(82, 45).addBox(-1.4872F, -0.9439F, -3.9947F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 11.5298F, -10.7946F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(45, 66).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.0609F, -4.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5377F, 3.8697F, -6.4002F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r276 = bone2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(82, 12).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4028F, -3.53F, 6.0301F, 0.5804F, -0.0171F, -0.0036F));

		PartDefinition cube_r277 = bone2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(109, 128).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4063F, -5.4348F, 5.4204F, 0.3098F, -0.0171F, -0.0036F));

		PartDefinition cube_r278 = bone2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(134, 89).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4081F, -5.647F, 4.4432F, 1.357F, -0.0054F, -0.0166F));

		PartDefinition cube_r279 = bone2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(104, 128).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4221F, -5.07F, 3.6266F, 0.6153F, -0.0054F, -0.0166F));

		PartDefinition cube_r280 = bone2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(15, 77).addBox(-0.9118F, -0.0393F, -0.0503F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9035F, -1.7205F, -0.0094F, 0.7374F, -0.0033F, -0.0171F));

		PartDefinition cube_r281 = bone2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(13, 85).addBox(-0.9118F, 0.1607F, -0.0503F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 1.1178F, -2.8345F, 0.8378F, -0.0009F, -0.0174F));

		PartDefinition cube_r282 = bone2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(120, 83).addBox(-0.425F, -0.05F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0982F, 2.9226F, -2.5249F, 1.0297F, 0.1346F, 0.2175F));

		PartDefinition cube_r283 = bone2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(30, 75).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7819F, 4.2781F, -4.2873F, -0.4706F, 0.6082F, 0.8491F));

		PartDefinition cube_r284 = bone2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(40, 90).addBox(-1.1114F, 1.6187F, -2.8163F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8876F, 3.021F, -2.6742F, -0.6404F, 0.4221F, 0.5083F));

		PartDefinition cube_r285 = bone2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(33, 116).addBox(-1.1114F, -0.7093F, -3.17F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8876F, 3.021F, -2.6742F, 0.1013F, 0.4221F, 0.5083F));

		PartDefinition cube_r286 = bone2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(19, 106).addBox(-1.1114F, -1.2749F, -1.8964F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8876F, 3.021F, -2.6742F, 0.7558F, 0.4221F, 0.5083F));

		PartDefinition cube_r287 = bone2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(33, 111).addBox(-0.8F, -0.1487F, -2.3266F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 1.0178F, -2.3595F, 0.9511F, 0.1346F, 0.2175F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5377F, 3.8697F, -6.4002F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r288 = bone4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4028F, -3.53F, 6.0301F, 0.5804F, 0.0171F, 0.0036F));

		PartDefinition cube_r289 = bone4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(109, 128).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4063F, -5.4348F, 5.4204F, 0.3098F, 0.0171F, 0.0036F));

		PartDefinition cube_r290 = bone4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(134, 89).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4081F, -5.647F, 4.4432F, 1.357F, 0.0054F, 0.0166F));

		PartDefinition cube_r291 = bone4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(104, 128).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4221F, -5.07F, 3.6266F, 0.6153F, 0.0054F, 0.0166F));

		PartDefinition cube_r292 = bone4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.0882F, -0.0393F, -0.0503F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9035F, -1.7205F, -0.0094F, 0.7374F, 0.0033F, 0.0171F));

		PartDefinition cube_r293 = bone4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(13, 85).mirror().addBox(-0.0882F, 0.1607F, -0.0503F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 1.1178F, -2.8345F, 0.8378F, 0.0009F, 0.0174F));

		PartDefinition cube_r294 = bone4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(120, 83).mirror().addBox(-0.575F, -0.05F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0982F, 2.9226F, -2.5249F, 1.0297F, -0.1346F, -0.2175F));

		PartDefinition cube_r295 = bone4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(30, 75).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7819F, 4.2781F, -4.2873F, -0.4706F, -0.6082F, -0.8491F));

		PartDefinition cube_r296 = bone4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(40, 90).mirror().addBox(0.1114F, 1.6187F, -2.8163F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 3.021F, -2.6742F, -0.6404F, -0.4221F, -0.5083F));

		PartDefinition cube_r297 = bone4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(33, 116).mirror().addBox(0.1114F, -0.7093F, -3.17F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 3.021F, -2.6742F, 0.1013F, -0.4221F, -0.5083F));

		PartDefinition cube_r298 = bone4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(19, 106).mirror().addBox(0.1114F, -1.2749F, -1.8964F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 3.021F, -2.6742F, 0.7558F, -0.4221F, -0.5083F));

		PartDefinition cube_r299 = bone4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(33, 111).mirror().addBox(-0.2F, -0.1487F, -2.3266F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 1.0178F, -2.3595F, 0.9511F, -0.1346F, -0.2175F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7262F, 10.1795F, -10.4248F, 0.7156F, 0.2618F, 0.0F));

		PartDefinition cube_r300 = leftArm1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(134, 63).addBox(-0.5F, -1.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 134).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r301 = leftArm1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(52, 128).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r302 = leftArm1.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(5, 125).addBox(6.0F, -1.0842F, 0.0838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r303 = leftArm1.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(132, 40).addBox(-0.5F, 0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(132, 32).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r304 = leftArm1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(47, 132).addBox(-0.5F, 0.55F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 19).addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftArm1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(126, 60).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, 1.8087F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftArm1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(122, 124).addBox(-0.5F, -1.9F, 0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.2943F, 0.6372F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(21, 29).addBox(-0.8F, -1.2307F, -0.4734F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 111).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2581F, 6.5299F, 0.2395F, -1.3991F, 0.0156F, 0.0164F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1429F, 4.9275F, 0.1273F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r307 = leftHand.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(70, 81).addBox(0.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r308 = leftHand.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(78, 105).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7262F, 10.1795F, -10.4248F, -0.2651F, -0.0638F, 0.2699F));

		PartDefinition cube_r309 = rightArm1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(134, 86).addBox(-0.5F, -1.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 83).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r310 = rightArm1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(73, 128).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r311 = rightArm1.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(16, 128).addBox(-7.0F, -1.0842F, 0.0838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r312 = rightArm1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(134, 50).addBox(-0.5F, 0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(134, 43).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightArm1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(41, 134).addBox(-0.5F, 0.55F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 35).addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.0327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightArm1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(127, 127).addBox(-0.5F, 0.1F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, 1.8087F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightArm1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(127, 123).addBox(-0.5F, -1.9F, 0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.2943F, 0.6372F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(107, 88).addBox(-0.2F, -1.2307F, -0.4734F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 112).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2581F, 6.5299F, 0.2395F, -1.3939F, 0.2423F, 0.0292F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1429F, 4.9275F, 0.1273F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r316 = rightHand.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(79, 81).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r317 = rightHand.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(85, 105).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0302F, -9.7672F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r318 = neck1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(10, 125).addBox(0.0F, -4.0459F, -0.016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(101, 68).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0672F, 0.8774F, -1.6901F));

		PartDefinition cube_r320 = neck1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(126, 28).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.6307F, 0.6606F, -0.9055F));

		PartDefinition cube_r321 = neck1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(126, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.8185F, 0.3675F, -0.5311F));

		PartDefinition cube_r322 = neck1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(126, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.8185F, -0.3675F, 0.5311F));

		PartDefinition cube_r323 = neck1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(126, 28).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.6307F, -0.6606F, 0.9055F));

		PartDefinition cube_r324 = neck1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(101, 68).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0672F, -0.8774F, 1.6901F));

		PartDefinition cube_r325 = neck1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(91, 92).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r326 = neck2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(13, 125).addBox(0.0F, -3.2816F, -0.0991F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r327 = neck2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(101, 66).mirror().addBox(-5.737F, -0.79F, -0.4755F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0828F, 0.571F, -1.5421F));

		PartDefinition cube_r328 = neck2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(125, 32).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.1948F, 0.546F, -1.0268F));

		PartDefinition cube_r329 = neck2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(101, 66).addBox(1.737F, -0.79F, -0.4755F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0828F, -0.571F, 1.5421F));

		PartDefinition cube_r330 = neck2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(125, 32).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.1948F, -0.546F, 1.0268F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(95, 12).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.3057F, 0.0416F, -0.0131F));

		PartDefinition cube_r332 = neck5.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(98, 51).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r333 = neck5.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(129, 105).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, 0.531F, 1.0218F, -0.7689F));

		PartDefinition cube_r334 = neck5.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(75, 35).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, -0.2627F, 1.0861F, -1.6669F));

		PartDefinition cube_r335 = neck5.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(78, 130).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, 0.664F, 1.0789F, -0.6534F));

		PartDefinition cube_r336 = neck5.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(118, 45).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, -0.2843F, 1.1728F, -1.6864F));

		PartDefinition cube_r337 = neck5.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(75, 35).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, -0.2627F, -1.0861F, 1.6669F));

		PartDefinition cube_r338 = neck5.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(129, 105).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, 0.531F, -1.0218F, 0.7689F));

		PartDefinition cube_r339 = neck5.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(78, 130).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, 0.664F, -1.0789F, 0.6534F));

		PartDefinition cube_r340 = neck5.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(118, 45).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, -0.2843F, -1.1728F, 1.6864F));

		PartDefinition cube_r341 = neck5.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(119, 135).addBox(0.0F, -2.5566F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r342 = neck5.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(134, 113).addBox(0.0F, -2.7566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.2358F, 0.0424F, -0.0102F));

		PartDefinition cube_r343 = neck4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(126, 30).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.7869F, 1.0553F, -0.5446F));

		PartDefinition cube_r344 = neck4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-4.7663F, -0.3906F, -0.2552F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1463F, 1.2113F, -1.557F));

		PartDefinition cube_r345 = neck4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(125, 41).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1463F, 1.2113F, -1.557F));

		PartDefinition cube_r346 = neck4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(125, 34).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.7869F, 1.0553F, -0.5446F));

		PartDefinition cube_r347 = neck4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(65, 53).addBox(1.7663F, -0.3906F, -0.2552F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1463F, -1.2113F, 1.557F));

		PartDefinition cube_r348 = neck4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(126, 30).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.7869F, -1.0553F, 0.5446F));

		PartDefinition cube_r349 = neck4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(125, 41).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1463F, -1.2113F, 1.557F));

		PartDefinition cube_r350 = neck4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(125, 34).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.7869F, -1.0553F, 0.5446F));

		PartDefinition cube_r351 = neck4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(110, 135).addBox(0.0F, -1.4677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9211F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r352 = neck4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(49, 135).addBox(0.0F, -1.3677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r353 = neck4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(86, 5).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.2043F, 0.2319F, 0.18F));

		PartDefinition cube_r354 = neck3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(125, 109).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r355 = neck3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(57, 125).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r356 = neck3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(127, 23).mirror().addBox(-3.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.0301F, 0.7755F, -1.5857F));

		PartDefinition cube_r357 = neck3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(125, 43).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.416F, 0.6757F, -1.0136F));

		PartDefinition cube_r358 = neck3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(125, 109).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r359 = neck3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(57, 125).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r360 = neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(127, 23).addBox(1.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.0301F, -0.7755F, 1.5857F));

		PartDefinition cube_r361 = neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(125, 43).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.416F, -0.6757F, 1.0136F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(73, 135).addBox(0.5F, -0.9458F, -1.1223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6168F, -1.9379F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(52, 135).addBox(0.5F, -1.169F, -0.9772F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3795F, -0.4528F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(86, 22).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7216F, -3.4653F, -0.5704F, 0.1938F, -0.0215F));

		PartDefinition cube_r365 = neck.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(125, 113).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0612F, 1.1726F, -1.6082F));

		PartDefinition cube_r366 = neck.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(125, 111).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.8154F, 0.9709F, -0.7645F));

		PartDefinition cube_r367 = neck.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(125, 113).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0612F, -1.1726F, 1.6082F));

		PartDefinition cube_r368 = neck.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(76, 135).addBox(0.5F, -1.4207F, -0.1013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r369 = neck.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(95, 33).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r370 = neck.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(125, 111).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.8154F, -0.9709F, 0.7645F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.2702F, 0.1462F, 0.1294F));

		PartDefinition cube_r371 = neck6.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(97, 27).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0756F, 0.9458F, -1.5956F));

		PartDefinition cube_r372 = neck6.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(126, 2).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.5806F, 0.7985F, -0.9472F));

		PartDefinition cube_r373 = neck6.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(97, 27).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0756F, -0.9458F, 1.5956F));

		PartDefinition cube_r374 = neck6.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(105, 117).addBox(0.5F, -0.6207F, 2.7986F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.074F, -4.6685F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r375 = neck6.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(95, 45).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck6.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(126, 2).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5806F, -0.7985F, 0.9472F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5383F, -2.7274F, -0.152F, 0.142F, 0.1256F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(92, 0).addBox(-2.0F, -1.9805F, -0.0278F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.5F, -0.9419F, -7.2839F, -1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(106, 78).addBox(-1.5F, -1.0055F, -0.0278F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.5F, -0.5835F, -8.2175F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(103, 0).addBox(-1.5F, -0.0123F, -0.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.6162F, -8.1944F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(112, 27).addBox(-1.0F, 0.0055F, -0.0239F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.5F, 2.4133F, -13.1836F, -0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(110, 117).addBox(-1.0F, -0.0195F, -0.0239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.5F, 1.8187F, -12.4427F, -0.8945F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(104, 11).addBox(-1.5F, 0.0055F, -0.0239F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.6431F, -10.8246F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(106, 39).addBox(-1.5F, -0.0445F, -0.0239F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.5F, 0.1563F, -10.038F, -1.0167F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(85, 117).addBox(-1.0F, 0.5828F, -0.5079F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 3.4779F, -12.9281F, -0.9817F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(134, 118).addBox(-0.5F, -0.8108F, -0.609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.6481F, -14.313F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(90, 130).addBox(-1.0F, 0.0089F, 0.0455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9029F, -14.5531F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(132, 4).addBox(-0.5F, 0.0171F, -0.039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.7898F, -14.8808F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(78, 117).addBox(-0.5F, -0.7162F, -1.6985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.6271F, -3.3365F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(50, 117).addBox(-0.5F, -0.5134F, -0.9974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.6271F, -3.3365F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(90, 64).addBox(-0.5F, -1.0F, -3.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.1834F, -10.4011F, 0.0516F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(65, 45).addBox(-1.0F, -1.075F, -5.8F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.4514F, -4.8129F, 0.3134F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(77, 0).addBox(-2.0F, -1.075F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.1401F, -1.8291F, 0.1039F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(101, 18).addBox(-2.0F, -1.075F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.9216F, -0.8789F, 0.2261F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(90, 29).addBox(-2.0F, -0.6F, -0.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.2008F, -0.3251F, 0.3657F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(128, 131).addBox(-0.5F, -0.3832F, -0.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.6271F, -3.3365F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(60, 66).addBox(-2.4404F, 0.025F, -3.975F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -1.857F, -1.6163F, 0.1158F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(84, 35).addBox(-1.5F, -0.5629F, -2.2968F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9775F, 0.3132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(95, 39).addBox(-1.5F, -0.427F, -2.0046F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5892F, -0.5886F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(28, 84).addBox(-2.5F, 0.0107F, -1.995F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8257F, -1.6058F, 1.3352F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-1.099F, 1.0098F, -5.7129F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(124, 99).addBox(-0.45F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5052F, -2.5309F, 2.4002F, -0.4542F, 1.4551F, -3.0228F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(78, 112).addBox(0.1866F, 3.7314F, -3.9054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.9395F, 0.4228F, -2.223F, -0.5694F, 0.1383F, 0.2224F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(23, 127).addBox(-0.5F, -0.675F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(1.999F, -1.3336F, -1.8635F, -1.1925F, 0.244F, 0.0957F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(0, 74).addBox(-0.3F, -1.125F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.099F, 3.4416F, 0.9F, 0.3179F, 0.166F, 0.0543F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(120, 79).addBox(0.1866F, 3.615F, -2.8065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9395F, 0.4228F, -2.223F, -0.8312F, 0.1383F, 0.2224F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(57, 127).addBox(0.4F, -1.9805F, -0.0028F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(1.599F, -1.9517F, -1.571F, -1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(112, 66).addBox(-1.703F, -0.2077F, -5.5398F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, -1.7065F, -0.1079F, 0.1366F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(118, 41).addBox(-0.5112F, -7.3869F, -2.2215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4395F, 0.4228F, -4.923F, -1.4318F, 0.0823F, 0.1404F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(118, 32).addBox(-0.5112F, -6.7229F, -0.7279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.4395F, 0.4228F, -4.923F, -1.2049F, 0.0823F, 0.1404F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(54, 112).addBox(-0.8862F, -5.5222F, -3.4131F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4395F, 0.4228F, -4.923F, -1.6749F, 0.1514F, 0.1416F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(47, 112).addBox(-0.8862F, -4.9107F, -0.1954F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.4395F, 0.4228F, -4.923F, -0.9463F, 0.1514F, 0.1416F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(40, 112).addBox(-0.8862F, -3.7176F, -1.0963F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4395F, 0.4228F, -4.923F, -1.243F, 0.1514F, 0.1416F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(26, 118).addBox(-0.8862F, -1.8563F, -0.9337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.4395F, 0.4228F, -4.923F, -1.1557F, 0.1514F, 0.1416F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(117, 117).addBox(-0.8862F, -1.0162F, -0.7805F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4395F, 0.4228F, -4.923F, -0.9986F, 0.1514F, 0.1416F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(7, 112).addBox(-0.2628F, 2.028F, -2.4011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.9395F, 0.4228F, -2.223F, -0.9436F, 0.0477F, 0.1401F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(66, 118).addBox(-1.0145F, -1.4141F, 1.7283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, 0.075F, -0.0349F, -0.0175F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(43, 117).addBox(-1.0145F, -2.954F, 1.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, -0.3875F, -0.0349F, -0.0175F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(129, 101).addBox(-0.5F, -2.0F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4027F, 5.4116F, -7.584F, 0.1359F, 0.1921F, 0.0341F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(42, 130).addBox(-1.1697F, -0.4306F, -9.689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.0661F, 0.1921F, 0.0341F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(68, 122).addBox(-1.1697F, 0.0696F, -8.6331F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, -0.1084F, 0.1921F, 0.0341F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(101, 105).addBox(-1.1697F, -1.6553F, -8.1166F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.1097F, 0.1921F, 0.0341F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(104, 32).addBox(-1.1697F, -3.7378F, -6.2571F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.2843F, 0.1921F, 0.0341F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(113, 82).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.453F, 3.7064F, -7.624F, 0.8602F, 0.1921F, 0.0341F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(57, 88).addBox(-1.1697F, -5.9477F, -7.0476F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.5984F, 0.1921F, 0.0341F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(133, 28).addBox(-1.1697F, -0.1642F, -10.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 91).addBox(-1.1697F, -0.7642F, -9.3692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.2057F, 0.1921F, 0.0341F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(127, 19).addBox(-1.1697F, -0.8338F, -8.3666F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.2581F, 0.1921F, 0.0341F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(120, 128).addBox(-1.1697F, -0.8457F, -7.3619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.3104F, 0.1921F, 0.0341F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(127, 8).addBox(-1.1697F, -0.9354F, -6.3453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.3977F, 0.1921F, 0.0341F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(0, 108).addBox(-1.1697F, -1.3853F, -5.3049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.4588F, 0.1921F, 0.0341F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(73, 124).addBox(-1.1697F, -1.6684F, -4.2349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.5286F, 0.1921F, 0.0341F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(127, 4).addBox(-1.1697F, -1.8307F, -3.2022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(26, 133).addBox(-1.1697F, -0.8307F, -2.2022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.5722F, 0.1921F, 0.0341F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(31, 88).addBox(-1.1697F, -5.1471F, -4.2627F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.3803F, 0.1921F, 0.0341F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(16, 97).addBox(-1.1697F, -4.9027F, -1.8659F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.2494F, 0.1921F, 0.0341F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(126, 64).addBox(-0.9356F, -3.2798F, -6.3432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 0.2531F, 0.0524F, 0.0F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(40, 96).addBox(-0.9356F, -2.2045F, -6.2481F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 0.0785F, 0.0524F, 0.0F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(52, 132).addBox(-0.9399F, -6.1508F, -0.4755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, -0.5236F, -0.0349F, -0.0175F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(119, 0).addBox(-0.9399F, -5.6924F, 0.1737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, 0.2094F, -0.0349F, -0.0175F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(86, 126).addBox(-0.9399F, -6.0616F, -0.7147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(81, 126).addBox(-0.9399F, -6.0616F, 0.0853F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, -0.2705F, -0.0349F, -0.0175F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(36, 104).addBox(-0.9399F, -3.5792F, 2.1765F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, 0.3927F, -0.0349F, -0.0175F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(9, 97).addBox(-0.9399F, -4.2604F, 1.7258F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, 0.48F, -0.0349F, -0.0175F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(91, 126).addBox(-0.8399F, -5.2771F, 0.5985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, -0.0611F, -0.0349F, -0.0175F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(92, 105).addBox(-0.8399F, 2.3424F, 0.4544F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, 2.0071F, -0.0349F, -0.0175F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(114, 130).addBox(-0.8399F, 2.2638F, -0.8497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, 2.3998F, -0.0349F, -0.0175F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(91, 121).addBox(-0.8399F, 0.0967F, -2.3935F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, -2.7053F, -0.0349F, -0.0175F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(73, 132).addBox(-0.8399F, -1.178F, -1.7071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, -1.6144F, -0.0349F, -0.0175F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(132, 71).addBox(-0.8399F, -1.5468F, -1.4628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, -1.0036F, -0.0349F, -0.0175F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(132, 68).addBox(-0.8399F, -2.5277F, -0.2362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, 0.0436F, -0.0349F, -0.0175F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(115, 126).addBox(-0.8399F, -4.3796F, -0.8888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, -0.2182F, -0.0349F, -0.0175F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(109, 132).addBox(-0.8356F, 5.1306F, 2.5677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, -2.2689F, 0.0524F, 0.0F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(132, 107).addBox(-0.8356F, 2.2575F, 5.2895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, -2.8362F, 0.0524F, 0.0F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(119, 63).addBox(-1.0696F, -6.7111F, -7.2487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(119, 132).addBox(-1.0696F, -4.5519F, -3.6214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.738F, 0.1921F, 0.0341F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(132, 122).addBox(-1.0696F, -5.5913F, -1.6038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 1.1307F, 0.1921F, 0.0341F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(119, 59).addBox(-1.0696F, 0.8444F, -4.8181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, -1.3127F, 0.1921F, 0.0341F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(5, 133).addBox(-1.0696F, -3.7827F, -0.5218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.6071F, 0.1921F, 0.0341F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(133, 0).addBox(-1.0696F, -2.3147F, 1.4988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(132, 128).addBox(-1.0696F, -2.3147F, 0.9988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 1.5234F, 0.1921F, 0.0341F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(119, 26).addBox(-1.0696F, -1.504F, 1.5722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 2.1343F, 0.1921F, 0.0341F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(0, 130).addBox(-1.0696F, 1.0472F, 1.9072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, -2.8835F, 0.1921F, 0.0341F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(134, 92).addBox(-1.0696F, 3.019F, -1.6587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, -1.4436F, 0.1921F, 0.0341F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(132, 125).addBox(-1.0696F, -0.9508F, -5.0723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, -0.0474F, 0.1921F, 0.0341F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(97, 5).addBox(-1.0696F, -5.2445F, -2.0304F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 0.8689F, 0.1921F, 0.0341F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(132, 110).addBox(-1.0696F, -2.4234F, 3.751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8439F, 3.3273F, 1.0888F, 1.7852F, 0.1921F, 0.0341F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(133, 14).addBox(-0.8356F, -6.7306F, -0.1817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 1.6144F, 0.0524F, 0.0F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(133, 25).addBox(-0.6105F, -6.0956F, 1.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(104, 132).addBox(-0.7856F, -6.0956F, 1.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 1.7453F, 0.0524F, 0.0F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(19, 119).addBox(-0.8356F, -6.1768F, 0.6799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 2.0508F, 0.0524F, 0.0F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(132, 80).addBox(-0.8356F, -5.7242F, -2.2016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 1.4399F, 0.0524F, 0.0F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(78, 132).addBox(-0.8356F, -5.8723F, -0.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 1.6581F, 0.0524F, 0.0F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(119, 15).addBox(-0.8356F, -5.9023F, -1.6551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 1.3526F, 0.0524F, 0.0F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(132, 77).addBox(-0.8356F, -5.5934F, -2.738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 0.9163F, 0.0524F, 0.0F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(132, 74).addBox(-0.8356F, -1.9534F, -6.3488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.9439F, 0.1273F, 6.9888F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(126, 87).addBox(-0.8399F, -5.0703F, 0.5997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 95).addBox(-0.9399F, -4.8952F, -0.1253F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7439F, 3.1273F, 3.0888F, 0.1309F, -0.0349F, -0.0175F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(1.099F, 1.0098F, -5.7129F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(124, 99).mirror().addBox(-0.55F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5052F, -2.5309F, 2.4002F, -0.4542F, -1.4551F, 3.0228F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(78, 112).mirror().addBox(-1.1866F, 3.7314F, -3.9054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.9395F, 0.4228F, -2.223F, -0.5694F, -0.1383F, -0.2224F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(23, 127).mirror().addBox(-0.5F, -0.675F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0167F)).mirror(false), PartPose.offsetAndRotation(-1.999F, -1.3336F, -1.8635F, -1.1925F, -0.244F, -0.0957F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.7F, -1.125F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.099F, 3.4416F, 0.9F, 0.3179F, -0.166F, -0.0543F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(120, 79).mirror().addBox(-1.1866F, 3.615F, -2.8065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.9395F, 0.4228F, -2.223F, -0.8312F, -0.1383F, -0.2224F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(57, 127).mirror().addBox(-1.4F, -1.9805F, -0.0028F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0167F)).mirror(false), PartPose.offsetAndRotation(-1.599F, -1.9517F, -1.571F, -1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(112, 66).mirror().addBox(0.703F, -0.2077F, -5.5398F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, -1.7065F, 0.1079F, -0.1366F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(118, 41).mirror().addBox(-0.4888F, -7.3869F, -2.2215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4395F, 0.4228F, -4.923F, -1.4318F, -0.0823F, -0.1404F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(118, 32).mirror().addBox(-0.4888F, -6.7229F, -0.7279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.4395F, 0.4228F, -4.923F, -1.2049F, -0.0823F, -0.1404F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(54, 112).mirror().addBox(-0.1138F, -5.5222F, -3.4131F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4395F, 0.4228F, -4.923F, -1.6749F, -0.1514F, -0.1416F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(47, 112).mirror().addBox(-0.1138F, -4.9107F, -0.1954F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.4395F, 0.4228F, -4.923F, -0.9463F, -0.1514F, -0.1416F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(40, 112).mirror().addBox(-0.1138F, -3.7176F, -1.0963F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4395F, 0.4228F, -4.923F, -1.243F, -0.1514F, -0.1416F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(26, 118).mirror().addBox(-0.1138F, -1.8563F, -0.9337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.4395F, 0.4228F, -4.923F, -1.1557F, -0.1514F, -0.1416F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(117, 117).mirror().addBox(-0.1138F, -1.0162F, -0.7805F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4395F, 0.4228F, -4.923F, -0.9986F, -0.1514F, -0.1416F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(7, 112).mirror().addBox(-0.7372F, 2.028F, -2.4011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.9395F, 0.4228F, -2.223F, -0.9436F, -0.0477F, -0.1401F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(66, 118).mirror().addBox(0.0145F, -1.4141F, 1.7283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, 0.075F, 0.0349F, 0.0175F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(43, 117).mirror().addBox(0.0145F, -2.954F, 1.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, -0.3875F, 0.0349F, 0.0175F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(129, 101).mirror().addBox(-0.5F, -2.0F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4027F, 5.4116F, -7.584F, 0.1359F, -0.1921F, -0.0341F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(42, 130).mirror().addBox(0.1696F, -0.4306F, -9.689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.0661F, -0.1921F, -0.0341F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(68, 122).mirror().addBox(0.1696F, 0.0696F, -8.6331F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, -0.1084F, -0.1921F, -0.0341F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(101, 105).mirror().addBox(0.1696F, -1.6553F, -8.1166F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.1097F, -0.1921F, -0.0341F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(104, 32).mirror().addBox(0.1696F, -3.7378F, -6.2571F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.2843F, -0.1921F, -0.0341F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(113, 82).mirror().addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.453F, 3.7064F, -7.624F, 0.8602F, -0.1921F, -0.0341F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(57, 88).mirror().addBox(0.1696F, -5.9477F, -7.0476F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.5984F, -0.1921F, -0.0341F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(133, 28).mirror().addBox(0.1696F, -0.1642F, -10.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 91).mirror().addBox(0.1696F, -0.7642F, -9.3692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.2057F, -0.1921F, -0.0341F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(127, 19).mirror().addBox(0.1696F, -0.8338F, -8.3666F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.2581F, -0.1921F, -0.0341F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(120, 128).mirror().addBox(0.1696F, -0.8457F, -7.3619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.3104F, -0.1921F, -0.0341F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(127, 8).mirror().addBox(0.1696F, -0.9354F, -6.3453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.3977F, -0.1921F, -0.0341F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(0.1696F, -1.3853F, -5.3049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.4588F, -0.1921F, -0.0341F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(73, 124).mirror().addBox(0.1696F, -1.6684F, -4.2349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.5286F, -0.1921F, -0.0341F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(127, 4).mirror().addBox(0.1696F, -1.8307F, -3.2022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(26, 133).mirror().addBox(0.1696F, -0.8307F, -2.2022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.5722F, -0.1921F, -0.0341F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(31, 88).mirror().addBox(0.1696F, -5.1471F, -4.2627F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.3803F, -0.1921F, -0.0341F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(16, 97).mirror().addBox(0.1696F, -4.9027F, -1.8659F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.2494F, -0.1921F, -0.0341F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(126, 64).mirror().addBox(-0.0644F, -3.2798F, -6.3432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 0.2531F, -0.0524F, 0.0F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(40, 96).mirror().addBox(-0.0644F, -2.2045F, -6.2481F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 0.0785F, -0.0524F, 0.0F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(52, 132).mirror().addBox(-0.0601F, -6.1508F, -0.4755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, -0.5236F, 0.0349F, 0.0175F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-0.0601F, -5.6924F, 0.1737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, 0.2094F, 0.0349F, 0.0175F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(86, 126).mirror().addBox(-0.0601F, -6.0616F, -0.7147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(81, 126).mirror().addBox(-0.0601F, -6.0616F, 0.0853F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, -0.2705F, 0.0349F, 0.0175F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(36, 104).mirror().addBox(-0.0601F, -3.5792F, 2.1765F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, 0.3927F, 0.0349F, 0.0175F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(9, 97).mirror().addBox(-0.0601F, -4.2604F, 1.7258F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, 0.48F, 0.0349F, 0.0175F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(91, 126).mirror().addBox(-0.1601F, -5.2771F, 0.5985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, -0.0611F, 0.0349F, 0.0175F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(92, 105).mirror().addBox(-0.1601F, 2.3424F, 0.4544F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, 2.0071F, 0.0349F, 0.0175F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(114, 130).mirror().addBox(-0.1601F, 2.2638F, -0.8497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, 2.3998F, 0.0349F, 0.0175F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(91, 121).mirror().addBox(-0.1601F, 0.0967F, -2.3935F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, -2.7053F, 0.0349F, 0.0175F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(73, 132).mirror().addBox(-0.1601F, -1.178F, -1.7071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, -1.6144F, 0.0349F, 0.0175F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(132, 71).mirror().addBox(-0.1601F, -1.5468F, -1.4628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, -1.0036F, 0.0349F, 0.0175F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(132, 68).mirror().addBox(-0.1601F, -2.5277F, -0.2362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, 0.0436F, 0.0349F, 0.0175F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(115, 126).mirror().addBox(-0.1601F, -4.3796F, -0.8888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, -0.2182F, 0.0349F, 0.0175F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(109, 132).mirror().addBox(-0.1644F, 5.1306F, 2.5677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, -2.2689F, -0.0524F, 0.0F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(132, 107).mirror().addBox(-0.1644F, 2.2575F, 5.2895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, -2.8362F, -0.0524F, 0.0F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(119, 63).mirror().addBox(0.0696F, -6.7111F, -7.2487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 132).mirror().addBox(0.0696F, -4.5519F, -3.6214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.738F, -0.1921F, -0.0341F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(132, 122).mirror().addBox(0.0696F, -5.5913F, -1.6038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 1.1307F, -0.1921F, -0.0341F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(119, 59).mirror().addBox(0.0696F, 0.8444F, -4.8181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, -1.3127F, -0.1921F, -0.0341F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(5, 133).mirror().addBox(0.0696F, -3.7827F, -0.5218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.6071F, -0.1921F, -0.0341F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(133, 0).mirror().addBox(0.0696F, -2.3147F, 1.4988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(132, 128).mirror().addBox(0.0696F, -2.3147F, 0.9988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 1.5234F, -0.1921F, -0.0341F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(119, 26).mirror().addBox(0.0696F, -1.504F, 1.5722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 2.1343F, -0.1921F, -0.0341F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(0.0696F, 1.0472F, 1.9072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, -2.8835F, -0.1921F, -0.0341F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(134, 92).mirror().addBox(0.0696F, 3.019F, -1.6587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, -1.4436F, -0.1921F, -0.0341F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(132, 125).mirror().addBox(0.0696F, -0.9508F, -5.0723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, -0.0474F, -0.1921F, -0.0341F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(97, 5).mirror().addBox(0.0696F, -5.2445F, -2.0304F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 0.8689F, -0.1921F, -0.0341F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(132, 110).mirror().addBox(0.0696F, -2.4234F, 3.751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8439F, 3.3273F, 1.0888F, 1.7852F, -0.1921F, -0.0341F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(133, 14).mirror().addBox(-0.1644F, -6.7306F, -0.1817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 1.6144F, -0.0524F, 0.0F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(133, 25).mirror().addBox(-0.3895F, -6.0956F, 1.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(104, 132).mirror().addBox(-0.2144F, -6.0956F, 1.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 1.7453F, -0.0524F, 0.0F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(19, 119).mirror().addBox(-0.1644F, -6.1768F, 0.6799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 2.0508F, -0.0524F, 0.0F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(132, 80).mirror().addBox(-0.1644F, -5.7242F, -2.2016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 1.4399F, -0.0524F, 0.0F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(78, 132).mirror().addBox(-0.1644F, -5.8723F, -0.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 1.6581F, -0.0524F, 0.0F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(119, 15).mirror().addBox(-0.1644F, -5.9023F, -1.6551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 1.3526F, -0.0524F, 0.0F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(132, 77).mirror().addBox(-0.1644F, -5.5934F, -2.738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 0.9163F, -0.0524F, 0.0F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(132, 74).mirror().addBox(-0.1644F, -1.9534F, -6.3488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9439F, 0.1273F, 6.9888F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(126, 87).mirror().addBox(-0.1601F, -5.0703F, 0.5997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 95).mirror().addBox(-0.0601F, -4.8952F, -0.1253F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7439F, 3.1273F, 3.0888F, 0.1309F, 0.0349F, 0.0175F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5496F, 1.4258F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(117, 101).mirror().addBox(-0.5F, -1.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(117, 101).addBox(3.1407F, -1.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.8203F, 2.0479F, -1.6282F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(113, 71).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.1043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(114, 48).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.1043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(114, 133).mirror().addBox(0.0007F, 1.2241F, -6.3137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.1396F, -0.2051F, 0.0F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(33, 120).mirror().addBox(0.0007F, 1.0373F, -5.4881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(120, 19).mirror().addBox(0.0007F, 1.0373F, -3.5881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.1047F, -0.2051F, 0.0F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(120, 8).mirror().addBox(0.0007F, 1.2663F, -1.706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.2356F, -0.2051F, 0.0F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(113, 112).mirror().addBox(0.0195F, 0.7951F, -1.6758F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.3398F, -0.5004F, -6.2551F, -0.2705F, -0.1396F, 0.0F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(5, 129).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(5, 129).addBox(3.1407F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.8203F, 2.4591F, -5.8077F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(31, 124).mirror().addBox(-0.5F, -3.0F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(31, 124).addBox(3.1407F, -3.0F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-1.8203F, 2.6035F, -4.9447F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(96, 122).mirror().addBox(-0.5F, -3.0F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(96, 122).addBox(3.1407F, -3.0F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.8203F, 2.5512F, -3.9461F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(85, 112).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(85, 112).addBox(3.1407F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-1.8203F, 2.1013F, -1.9973F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(103, 27).mirror().addBox(-0.5F, -0.6F, -2.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(103, 27).addBox(3.1407F, -0.6F, -2.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.8203F, 0.8246F, -0.0135F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(117, 97).mirror().addBox(-0.4805F, -0.6472F, 4.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(117, 97).addBox(3.1602F, -0.6472F, 4.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.8398F, 1.4155F, -4.9567F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(127, 68).mirror().addBox(0.0007F, -0.0681F, -0.9811F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, 0.2923F, -0.2051F, 0.0F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(134, 22).mirror().addBox(0.0007F, 0.1581F, -7.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(88, 133).mirror().addBox(0.0007F, 0.1581F, -7.3469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(119, 87).mirror().addBox(0.0007F, 0.4029F, -3.6026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.0436F, -0.2051F, 0.0F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(31, 134).mirror().addBox(0.0007F, 2.7729F, -6.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(83, 133).mirror().addBox(0.0007F, 2.7729F, -6.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.4014F, -0.2051F, 0.0F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(62, 133).mirror().addBox(0.0007F, 1.1469F, -6.2364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.2007F, -0.2051F, 0.0F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(120, 4).mirror().addBox(0.0007F, 0.5891F, -5.5269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.096F, -0.2051F, 0.0F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(20, 134).mirror().addBox(0.0007F, 0.5857F, -7.5251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 127).mirror().addBox(0.0007F, 0.1857F, -6.5251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(127, 80).mirror().addBox(0.0007F, -0.0143F, -5.5251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.2051F, -0.2051F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(127, 76).mirror().addBox(0.0007F, -0.3226F, -4.5663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.1614F, -0.2051F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(127, 72).mirror().addBox(0.0007F, -0.3023F, -3.6036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.1091F, -0.2051F, 0.0F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(134, 10).mirror().addBox(0.0007F, -0.3707F, -2.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 134).mirror().addBox(0.0007F, -0.3707F, -1.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, -0.0567F, -0.2051F, 0.0F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(133, 47).mirror().addBox(0.0007F, 0.0503F, -1.8447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.5004F, -8.2551F, 0.1614F, -0.2051F, 0.0F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(119, 67).mirror().addBox(0.0195F, -0.0495F, -2.0101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3398F, -0.5004F, -6.2551F, -0.0131F, -0.1396F, 0.0F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(68, 127).mirror().addBox(-0.4805F, -0.0495F, -1.0101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 127).addBox(3.1602F, -0.0495F, -1.0101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8398F, -0.6048F, -5.4619F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(-0.5055F, 1.0505F, -0.2101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(133, 131).mirror().addBox(-0.5055F, 1.0505F, -1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(105, 123).mirror().addBox(-0.4805F, -0.0495F, -1.0101F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 134).addBox(3.1852F, 1.0505F, -0.2101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(133, 131).addBox(3.1852F, 1.0505F, -1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(105, 123).addBox(3.1602F, -0.0495F, -1.0101F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8398F, -0.631F, -4.4623F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(112, 88).mirror().addBox(-0.4805F, -0.0495F, -2.0101F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 88).addBox(3.1602F, -0.0495F, -2.0101F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8398F, -0.5089F, -2.466F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(132, 7).mirror().addBox(-0.4805F, -0.0495F, -1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(132, 7).addBox(3.1602F, -0.0495F, -1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8398F, -0.2754F, -1.4936F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(117, 93).mirror().addBox(-0.4805F, -2.7995F, 2.6399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(117, 93).addBox(3.1602F, -2.7995F, 2.6399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.8398F, 1.4155F, -4.9567F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(113, 71).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.1043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(114, 48).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.1043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(114, 133).addBox(-1.0007F, 1.2241F, -6.3137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.1396F, 0.2051F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(33, 120).addBox(-1.0007F, 1.0373F, -5.4881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F))
				.texOffs(120, 19).addBox(-1.0007F, 1.0373F, -3.5881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.1047F, 0.2051F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(120, 8).addBox(-1.0007F, 1.2663F, -1.706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.2356F, 0.2051F, 0.0F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(113, 112).addBox(-1.0195F, 0.7951F, -1.6758F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.3398F, -0.5004F, -6.2551F, -0.2705F, 0.1396F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(127, 68).addBox(-1.0007F, -0.0681F, -0.9811F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, 0.2923F, 0.2051F, 0.0F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(134, 22).addBox(-1.0007F, 0.1581F, -7.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(88, 133).addBox(-1.0007F, 0.1581F, -7.3469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(119, 87).addBox(-1.0007F, 0.4029F, -3.6026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.0436F, 0.2051F, 0.0F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(31, 134).addBox(-1.0007F, 2.7729F, -6.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(83, 133).addBox(-1.0007F, 2.7729F, -6.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.4014F, 0.2051F, 0.0F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(62, 133).addBox(-1.0007F, 1.1469F, -6.2364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.2007F, 0.2051F, 0.0F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(120, 4).addBox(-1.0007F, 0.5891F, -5.5269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.096F, 0.2051F, 0.0F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(20, 134).addBox(-1.0007F, 0.5857F, -7.5251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 127).addBox(-1.0007F, 0.1857F, -6.5251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(127, 80).addBox(-1.0007F, -0.0143F, -5.5251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.2051F, 0.2051F, 0.0F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(127, 76).addBox(-1.0007F, -0.3226F, -4.5663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.1614F, 0.2051F, 0.0F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(127, 72).addBox(-1.0007F, -0.3023F, -3.6036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.1091F, 0.2051F, 0.0F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(134, 10).addBox(-1.0007F, -0.3707F, -2.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 134).addBox(-1.0007F, -0.3707F, -1.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, -0.0567F, 0.2051F, 0.0F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(133, 47).addBox(-1.0007F, 0.0503F, -1.8447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0398F, -0.5004F, -8.2551F, 0.1614F, 0.2051F, 0.0F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(119, 67).addBox(-1.0195F, -0.0495F, -2.0101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3398F, -0.5004F, -6.2551F, -0.0131F, 0.1396F, 0.0F));

		return LayerDefinition.create(meshdefinition, 140, 140);
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