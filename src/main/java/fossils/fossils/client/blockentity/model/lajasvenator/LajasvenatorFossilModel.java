package fossils.fossils.client.blockentity.model.lajasvenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LajasvenatorFossilModel extends SkullModelBase {
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

	public LajasvenatorFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0419F, -32.9418F, 2.2344F, -0.0602F, 0.0106F, 0.1742F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(106, 112).addBox(0.0F, -6.5672F, 0.0096F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -1.796F, -0.1711F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(86, 81).addBox(0.0F, -3.7F, -1.0F, 0.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.696F, 1.8289F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 116).addBox(0.006F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -8.3451F, -1.8332F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(112, 11).addBox(0.003F, 0.0F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -5.591F, -0.2792F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 4).addBox(0.0F, 0.0128F, -0.0041F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -5.7075F, -2.2877F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(59, 77).addBox(-0.006F, -0.725F, -0.6F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6138F, 4.1979F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.883F, 5.2613F, 0.7254F, -0.1309F, 0.0F, 0.1309F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 58).addBox(-0.5827F, 3.7931F, -7.5175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6795F, -9.3081F, 5.4213F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7065F, -9.5367F, 0.8398F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 24).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0322F, -5.5023F, 3.9963F, 0.513F, -0.0327F, -0.4104F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(76, 57).addBox(-0.5F, -1.1F, -2.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3449F, -6.104F, 5.4246F, 0.1814F, -0.0327F, -0.4104F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(11, 94).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4339F, -8.6697F, 4.7184F, -0.3378F, -0.0391F, -0.4053F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(136, 115).addBox(-0.9758F, 1.6575F, 0.2764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1988F, 1.271F, 7.4744F, 0.2393F, 0.034F, -0.1202F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(95, 64).addBox(-0.9758F, 2.2967F, 0.7606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1988F, 1.271F, 7.4744F, 0.0647F, 0.034F, -0.1202F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(93, 132).addBox(-0.9758F, 2.4964F, 1.0353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1988F, 1.271F, 7.4744F, 0.1956F, 0.034F, -0.1202F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(118, 136).addBox(-0.9787F, 2.9692F, -0.7835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1988F, 1.271F, 7.4744F, 0.8938F, 0.034F, -0.1202F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(118, 124).addBox(-0.9787F, -0.0249F, -0.9642F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1988F, 1.271F, 7.4744F, 0.9461F, 0.034F, -0.1202F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(123, 69).addBox(-1.5139F, 3.4734F, -3.0856F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0988F, -4.179F, 4.1494F, 0.8947F, 0.0074F, -0.1135F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(63, 131).addBox(-0.1591F, 0.517F, -2.6549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0988F, -4.179F, 4.1494F, 0.8597F, -0.0695F, 0.16F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(136, 51).addBox(-0.0465F, 1.5641F, -2.2149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0988F, -4.179F, 4.1494F, 0.2645F, -0.0154F, 0.2146F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 125).addBox(-0.1996F, 1.209F, -1.8842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0988F, -4.179F, 4.1494F, 0.5801F, -0.0751F, 0.1575F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(68, 111).addBox(-0.3054F, -1.7977F, -2.0196F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0988F, -4.179F, 4.1494F, 0.3571F, 0.0661F, 0.018F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 111).addBox(-0.3054F, 0.1014F, -1.9363F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0988F, -4.179F, 4.1494F, 0.0953F, 0.0661F, 0.018F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(5, 127).addBox(-0.5073F, -2.8284F, -1.2892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1818F, 7.8849F, -0.7694F, -1.5295F, 0.0958F, -0.1513F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(123, 79).addBox(-0.5073F, -0.8263F, -0.4504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1818F, 7.8849F, -0.7694F, -0.7878F, 0.0958F, -0.1513F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(91, 99).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4238F, 7.9662F, 1.6686F, -0.8314F, 0.0958F, -0.1513F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(131, 129).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3266F, 9.0862F, -1.0876F, -3.1003F, 0.0958F, -0.1513F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(131, 117).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3867F, 8.8604F, -0.1152F, 1.7866F, 0.0958F, -0.1513F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(53, 125).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4168F, 8.471F, 0.8053F, 0.3903F, 0.0958F, -0.1513F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(130, 126).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4238F, 7.9662F, 1.6686F, -1.0496F, 0.0958F, -0.1513F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(126, 0).addBox(-0.5073F, -1.2547F, -0.2653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1818F, 7.8849F, -0.7694F, -0.0984F, 0.0958F, -0.1513F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(81, 118).addBox(-0.5072F, -3.7687F, 0.0331F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1818F, 7.8849F, -0.7694F, 0.146F, 0.0958F, -0.1513F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(116, 115).addBox(-0.5F, -0.65F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1967F, -3.2088F, -1.7926F, 1.23F, 0.0643F, 0.0237F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(125, 33).addBox(-0.5F, -2.5F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2388F, -0.5966F, -1.4852F, 0.27F, 0.0643F, 0.0237F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(36, 106).addBox(-0.5746F, -2.5221F, -0.4463F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.171F, -0.0013F, -1.3748F, 0.1308F, 0.0542F, 0.0419F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(117, 4).addBox(-0.5F, -1.5F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0179F, -1.7294F, -0.6194F, 0.7413F, 0.0639F, 0.0248F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(46, 77).addBox(-0.3844F, -0.2889F, -0.3767F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0524F, -5.1544F, -1.5189F, -0.1052F, 0.0639F, 0.0248F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(75, 111).addBox(-0.4764F, -1.1821F, -1.5531F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0077F, -6.931F, -3.922F, 1.3479F, -0.5456F, -0.36F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(25, 111).addBox(-0.4764F, -0.9628F, -0.2447F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-0.0077F, -6.931F, -3.922F, 1.7406F, -0.5456F, -0.36F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(113, 124).addBox(-0.4764F, -1.9182F, -1.1777F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(103, 121).addBox(-0.4764F, -1.9182F, -2.1027F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0077F, -6.931F, -3.922F, 2.2119F, -0.5456F, -0.36F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(126, 116).addBox(-0.4764F, -1.7482F, 1.0131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0077F, -6.931F, -3.922F, 1.1821F, -0.5456F, -0.36F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(118, 45).addBox(-0.4764F, -2.684F, -0.0833F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0077F, -6.931F, -3.922F, 0.292F, -0.5456F, -0.36F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(87, 108).addBox(0.1F, 0.15F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.284F, -9.6695F, -2.2537F, 0.2343F, -0.3037F, -0.3808F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(91, 56).addBox(-0.58F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6795F, -10.0081F, -3.1787F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.883F, 5.2613F, 0.7254F, -0.1309F, 0.0F, -0.1309F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-0.4173F, 3.7931F, -7.5175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -9.3081F, 5.4213F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(75, 81).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7065F, -9.5367F, 0.8398F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(88, 24).mirror().addBox(-0.5F, -2.0F, -1.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0322F, -5.5023F, 3.9963F, 0.513F, 0.0327F, 0.4104F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(76, 57).mirror().addBox(-0.5F, -1.1F, -2.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3449F, -6.104F, 5.4246F, 0.1814F, 0.0327F, 0.4104F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(11, 94).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4339F, -8.6697F, 4.7184F, -0.3378F, 0.0391F, 0.4053F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(136, 115).mirror().addBox(-0.0242F, 1.6575F, 0.2764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1988F, 1.271F, 7.4744F, 0.2393F, -0.034F, 0.1202F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(95, 64).mirror().addBox(-0.0242F, 2.2967F, 0.7606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1988F, 1.271F, 7.4744F, 0.0647F, -0.034F, 0.1202F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(93, 132).mirror().addBox(-0.0242F, 2.4964F, 1.0353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1988F, 1.271F, 7.4744F, 0.1956F, -0.034F, 0.1202F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(118, 136).mirror().addBox(-0.0213F, 2.9692F, -0.7835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1988F, 1.271F, 7.4744F, 0.8938F, -0.034F, 0.1202F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(118, 124).mirror().addBox(-0.0213F, -0.0249F, -0.9642F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1988F, 1.271F, 7.4744F, 0.9461F, -0.034F, 0.1202F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(123, 69).mirror().addBox(0.5139F, 3.4734F, -3.0856F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -4.179F, 4.1494F, 0.8947F, -0.0074F, 0.1135F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(63, 131).mirror().addBox(-0.841F, 0.517F, -2.6549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -4.179F, 4.1494F, 0.8597F, 0.0695F, -0.16F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(136, 51).mirror().addBox(-0.9535F, 1.5641F, -2.2149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -4.179F, 4.1494F, 0.2645F, 0.0154F, -0.2146F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(48, 125).mirror().addBox(-0.8004F, 1.209F, -1.8842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -4.179F, 4.1494F, 0.5801F, 0.0751F, -0.1575F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(68, 111).mirror().addBox(-0.6946F, -1.7977F, -2.0196F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -4.179F, 4.1494F, 0.3571F, -0.0661F, -0.018F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(7, 111).mirror().addBox(-0.6946F, 0.1014F, -1.9363F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -4.179F, 4.1494F, 0.0953F, -0.0661F, -0.018F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(5, 127).mirror().addBox(-0.4927F, -2.8284F, -1.2892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1818F, 7.8849F, -0.7694F, -1.5295F, -0.0958F, 0.1513F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(123, 79).mirror().addBox(-0.4927F, -0.8263F, -0.4504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1818F, 7.8849F, -0.7694F, -0.7878F, -0.0958F, 0.1513F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(91, 99).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4238F, 7.9662F, 1.6686F, -0.8314F, -0.0958F, 0.1513F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(131, 129).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3266F, 9.0862F, -1.0876F, -3.1003F, -0.0958F, 0.1513F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(131, 117).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3867F, 8.8604F, -0.1152F, 1.7866F, -0.0958F, 0.1513F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(53, 125).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4168F, 8.471F, 0.8053F, 0.3903F, -0.0958F, 0.1513F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(130, 126).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4238F, 7.9662F, 1.6686F, -1.0496F, -0.0958F, 0.1513F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(126, 0).mirror().addBox(-0.4927F, -1.2547F, -0.2653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1818F, 7.8849F, -0.7694F, -0.0984F, -0.0958F, 0.1513F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(81, 118).mirror().addBox(-0.4928F, -3.7687F, 0.0331F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1818F, 7.8849F, -0.7694F, 0.146F, -0.0958F, 0.1513F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(116, 115).mirror().addBox(-0.5F, -0.65F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1967F, -3.2088F, -1.7926F, 1.23F, -0.0643F, -0.0237F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(125, 33).mirror().addBox(-0.5F, -2.5F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.2388F, -0.5966F, -1.4852F, 0.27F, -0.0643F, -0.0237F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(36, 106).mirror().addBox(-0.4254F, -2.5221F, -0.4463F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.171F, -0.0013F, -1.3748F, 0.1308F, -0.0542F, -0.0419F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(117, 4).mirror().addBox(-0.5F, -1.5F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0179F, -1.7294F, -0.6194F, 0.7413F, -0.0639F, -0.0248F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 77).mirror().addBox(-0.6156F, -0.2889F, -0.3767F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0524F, -5.1544F, -1.5189F, -0.1052F, -0.0639F, -0.0248F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(75, 111).mirror().addBox(-0.5236F, -1.1821F, -1.5531F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0077F, -6.931F, -3.922F, 1.3479F, 0.5456F, 0.36F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(25, 111).mirror().addBox(-0.5236F, -0.9628F, -0.2447F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(0.0077F, -6.931F, -3.922F, 1.7406F, 0.5456F, 0.36F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(113, 124).mirror().addBox(-0.5236F, -1.9182F, -1.1777F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(103, 121).mirror().addBox(-0.5236F, -1.9182F, -2.1027F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0077F, -6.931F, -3.922F, 2.2119F, 0.5456F, 0.36F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(126, 116).mirror().addBox(-0.5236F, -1.7482F, 1.0131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0077F, -6.931F, -3.922F, 1.1821F, 0.5456F, 0.36F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(118, 45).mirror().addBox(-0.5236F, -2.684F, -0.0833F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0077F, -6.931F, -3.922F, 0.292F, 0.5456F, 0.36F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(87, 108).mirror().addBox(-1.1F, 0.15F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.284F, -9.6695F, -2.2537F, 0.2343F, 0.3037F, 0.3808F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(91, 56).mirror().addBox(-0.42F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -10.0081F, -3.1787F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(12, 119).addBox(0.5F, 9.5359F, -3.6184F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4F, 1.3094F, 2.8117F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(87, 76).addBox(-0.6F, 0.8043F, -2.5902F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 11.615F, -1.4005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(109, 56).addBox(-5.1F, -4.0214F, -0.9324F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 9.6882F, -2.0431F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(42, 95).addBox(-5.1F, 0.2943F, -3.743F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(112, 16).addBox(-5.1F, -1.1057F, -1.743F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 10.6054F, -1.1045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(94, 108).addBox(-5.1F, -2.132F, 0.1317F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 10.6777F, -3.0694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(119, 13).addBox(-5.1F, -0.032F, -0.0183F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 11.5687F, -3.6025F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(119, 9).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.504F, 7.5746F, -3.4371F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(73, 125).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 5.5355F, -0.877F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(123, 74).addBox(-0.5F, 0.0135F, -1.0042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 5.4715F, 0.0712F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(100, 103).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 5.6153F, -3.0165F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(99, 24).addBox(-5.1F, -3.8362F, -0.2445F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 5.5302F, -2.7348F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(86, 0).addBox(-1.5F, -1.425F, -1.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1302F, 0.171F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(22, 95).addBox(-1.0F, -1.6F, -1.7F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 1.0127F, -1.0785F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 14.5929F, -1.8106F, 1.4085F, -0.1073F, 0.0778F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(110, 103).addBox(0.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(53, 116).addBox(0.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(92, 12).addBox(-0.1F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(122, 29).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 91).addBox(-0.1F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(93, 49).addBox(-0.1F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(94, 67).addBox(-0.1F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(109, 71).addBox(-0.1F, 1.5F, -0.85F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(31, 97).addBox(-0.1F, -8.4F, -1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 16.4611F, -0.1532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(54, 102).addBox(-0.1F, -6.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(67, 116).addBox(-0.1F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7195F, 0.6129F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(32, 75).addBox(-1.1F, -6.6F, -0.525F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(111, 35).addBox(-1.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.2471F, 0.2883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(26, 80).addBox(-1.1F, -0.209F, -0.1593F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.2197F, -0.3418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(84, 34).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.2185F, -1.0452F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(84, 125).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r109 = rightLeg3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(60, 118).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(63, 34).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 7.9806F, 0.3806F, 1.1694F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(42, 44).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.2144F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(122, 25).addBox(-2.5F, 9.5359F, -3.6184F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.4F, 1.3094F, 2.8117F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(90, 7).addBox(-2.4F, 0.8043F, -2.5902F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 11.615F, -1.4005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(46, 110).addBox(3.1F, -4.0214F, -0.9324F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 9.6882F, -2.0431F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(97, 0).addBox(3.1F, 0.2943F, -3.743F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(21, 116).addBox(3.1F, -1.1057F, -1.743F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 10.6054F, -1.1045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 109).addBox(3.1F, -2.132F, 0.1317F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 10.6777F, -3.0694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(26, 122).addBox(3.1F, -0.032F, -0.0183F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.6F, 11.5687F, -3.6025F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(122, 21).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.504F, 7.5746F, -3.4371F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(89, 125).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 5.5355F, -0.877F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(96, 123).addBox(-0.5F, 0.0135F, -1.0042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 5.4715F, 0.0712F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(9, 106).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 5.6153F, -3.0165F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(82, 99).addBox(3.1F, -3.8362F, -0.2445F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 5.5302F, -2.7348F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(13, 87).addBox(-1.5F, -1.425F, -1.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.1302F, 0.171F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 97).addBox(-1.0F, -1.6F, -1.7F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.0127F, -1.0785F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.5929F, -1.8106F, 0.9277F, -0.016F, 0.0045F));

		PartDefinition cube_r122 = leftLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(110, 109).addBox(-2.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(116, 56).addBox(-2.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(92, 18).addBox(-1.9F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(122, 97).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(31, 91).addBox(-1.9F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(93, 87).addBox(-1.9F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(86, 94).addBox(-1.9F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(53, 110).addBox(-1.9F, 1.5F, -0.85F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(97, 94).addBox(-1.9F, -8.4F, -1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 16.4611F, -0.1532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(71, 103).addBox(-1.9F, -6.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(116, 67).addBox(-1.9F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7195F, 0.6129F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(39, 75).addBox(-0.9F, -6.6F, -0.525F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(111, 46).addBox(0.1F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.2471F, 0.2883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(70, 81).addBox(0.1F, -0.209F, -0.1593F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.2197F, -0.3418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(84, 44).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.2185F, -1.0452F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(125, 91).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r137 = leftLeg3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(118, 77).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(63, 51).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 7.9806F, 0.3806F, 1.3515F, 0.199F, -0.0573F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(40, 51).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.5198F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1626F, 8.8231F, -0.22F, -0.1278F, 0.0285F));

		PartDefinition cube_r138 = tail1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(45, 125).addBox(0.0F, -0.2F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2878F, 8.5295F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(36, 125).addBox(0.5F, 0.5871F, -0.1754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8299F, 3.2583F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(66, 88).addBox(0.5F, 0.2871F, -0.8754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.096F, 5.5805F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(29, 137).addBox(0.5F, -2.5823F, -0.1162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8326F, 4.7848F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(138, 118).addBox(0.5F, -1.9573F, -0.1162F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1588F, 6.7807F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(45, 132).addBox(0.0F, -4.3584F, -0.8256F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4739F, 3.0382F, 2.8449F, 0.0F, -3.1416F));

		PartDefinition cube_r144 = tail1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(82, 139).addBox(0.003F, -1.488F, -0.5529F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 126).addBox(-0.003F, -4.488F, 0.0471F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4739F, 3.0382F, 3.0369F, 0.0F, 3.1416F));

		PartDefinition cube_r145 = tail1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(82, 96).addBox(0.0045F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 72).addBox(-0.0045F, -0.5F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0015F, -4.6948F, 0.0547F, 2.81F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(123, 115).addBox(0.0F, -5.3472F, 0.486F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 122).addBox(-0.003F, -5.7472F, 0.011F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6626F, -0.3677F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-2.3F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0111F, -0.1038F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r148 = tail1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(19, 56).addBox(-0.7F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0111F, -0.1038F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r149 = tail1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.4998F, 8.6946F, 0.1492F, -0.1302F, -0.0138F));

		PartDefinition cube_r150 = tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 64).mirror().addBox(-2.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition cube_r151 = tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(17, 64).addBox(0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition cube_r152 = tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(68, 131).addBox(0.0F, 1.4F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.548F, 6.0799F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(42, 125).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(39, 125).addBox(0.0F, 0.4F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(113, 99).addBox(0.5F, -1.7073F, -0.2162F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 5.9753F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(111, 62).addBox(0.5F, -1.4073F, -0.0162F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 3.7753F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(32, 111).addBox(0.5F, -1.5823F, -0.0162F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(68, 107).addBox(0.5F, -1.7073F, -0.0162F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, 0.0262F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.2633F, -0.1289F, -0.0229F));

		PartDefinition cube_r160 = tail2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(3, 138).addBox(0.0F, -2.1561F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(42, 91).addBox(0.0F, -1.9561F, 0.0684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(50, 137).addBox(0.0F, -1.8061F, -0.1316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(28, 116).addBox(0.0F, -1.5811F, 0.0684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 51).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(71, 131).addBox(0.0F, 1.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.018F, 1.9009F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(84, 131).addBox(0.0F, 1.8F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0009F, 5.4187F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(32, 129).addBox(0.0F, 1.1F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(40, 58).mirror().addBox(-1.6F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, -0.4738F, 1.0278F, 0.0175F, 0.0262F, 0.0005F));

		PartDefinition cube_r169 = tail2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(40, 58).addBox(-0.4F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5302F, -0.4738F, 1.0278F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.1749F, -0.1308F, -0.0057F));

		PartDefinition cube_r170 = tail8.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(65, 40).mirror().addBox(-1.4F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r171 = tail8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(65, 40).addBox(-0.6F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r172 = tail8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(21, 34).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1017F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(129, 138).addBox(0.0F, 4.8F, 3.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 129).addBox(0.0F, 2.4F, 1.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 132).addBox(0.0F, 0.8F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 2.89F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail8.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(20, 132).addBox(0.0F, 0.7F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.837F, 0.6886F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail8.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(15, 138).addBox(0.0F, -1.7811F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 6.8984F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail8.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(12, 138).addBox(0.0F, -1.7561F, -0.1316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 4.9983F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail8.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(9, 138).addBox(0.0F, -1.7061F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 2.8984F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail8.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(6, 138).addBox(0.0F, -1.7561F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 0.8984F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, -0.0792F, -0.1305F, 0.0103F));

		PartDefinition cube_r179 = tail3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(65, 138).addBox(0.0F, -1.7128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 138).addBox(0.0F, -2.1128F, 2.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 5.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(59, 138).addBox(0.0F, -1.6628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 3.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(56, 138).addBox(0.0F, -1.3628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 1.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(53, 138).addBox(0.0F, -1.3128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(38, 138).addBox(0.0F, 3.0F, 3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 138).addBox(0.0F, 1.7F, 1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 138).addBox(0.0F, 0.4F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(42, 34).mirror().addBox(-1.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r185 = tail3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(42, 34).addBox(0.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r186 = tail3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0699F, -0.0435F, 0.003F));

		PartDefinition cube_r187 = tail9.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(17, 72).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail9.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(79, 138).addBox(0.0F, -1.25F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 5.0517F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail9.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(76, 138).addBox(0.0F, -1.325F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 3.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail9.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(27, 102).addBox(0.0F, 7.0F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 138).addBox(0.0F, 5.6F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 138).addBox(0.0F, 4.3F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail9.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(138, 69).addBox(0.0F, -1.325F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 1.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0094F, 0.3927F, 0.0036F));

		PartDefinition cube_r192 = tail4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(52, 10).addBox(0.0F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 5.0293F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(38, 97).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 3.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(111, 138).addBox(0.0F, -1.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(108, 138).addBox(0.0F, 0.05F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 138).addBox(0.0F, -1.45F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(77, 16).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(78, 103).addBox(0.0F, -1.4698F, 0.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 111).addBox(0.0F, -1.4698F, 2.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.0975F, 0.1737F, -0.0169F));

		PartDefinition cube_r197 = tail5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(138, 138).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5698F, 4.7774F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail5.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(100, 78).addBox(0.0F, 4.45F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 138).addBox(0.0F, 2.35F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 138).addBox(0.0F, 1.25F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(54, 24).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 139).addBox(0.0F, -0.75F, 0.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 139).addBox(0.0F, -0.7F, 2.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 139).addBox(0.0F, -0.55F, 4.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5056F, 5.6774F, -0.1523F, 0.3484F, -0.0222F));

		PartDefinition cube_r199 = tail6.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(139, 82).addBox(0.0F, 5.65F, 8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1693F, -8.5969F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(56, 10).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1535F, 0.2589F, -0.0396F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.1506F, 0.1726F, -0.0261F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, 0.0532F, -0.1743F, -0.0092F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(82, 111).addBox(-0.503F, -4.6022F, -1.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7264F, -6.9992F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(68, 125).addBox(-0.5F, -0.0022F, -0.0364F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.9196F, -7.7571F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(99, 130).addBox(-0.5F, -0.0022F, -0.0364F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.5196F, -4.7571F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(41, 114).addBox(-0.503F, -4.6022F, -1.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1264F, -3.9992F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 126).addBox(0.003F, -0.025F, -1.35F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -5.6639F, -0.4934F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(41, 106).addBox(0.0F, -1.9872F, -0.0041F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -3.2522F, -1.6604F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(21, 45).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.6967F, -0.0079F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 14.5755F, -10.2508F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(129, 107).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.0863F, 0.0858F, -0.6402F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(124, 110).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.0419F, 0.1142F, -1.0778F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(17, 130).mirror().addBox(-4.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, -0.0294F, 0.118F, -1.6753F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(130, 33).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, 0.0863F, 0.0858F, -0.6402F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(130, 59).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0294F, 0.118F, -1.6753F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(125, 95).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, 0.0419F, 0.1142F, -1.0778F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(46, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.0933F, 0.092F, -0.484F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(123, 59).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.0456F, 0.1228F, -0.9218F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(101, 54).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, -0.0312F, 0.1272F, -1.52F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(101, 54).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, -0.0312F, -0.1272F, 1.52F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(123, 59).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.0456F, -0.1228F, 0.9218F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(46, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.0933F, -0.092F, 0.484F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(125, 95).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, 0.0419F, -0.1142F, 1.0778F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(130, 59).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0294F, -0.118F, 1.6753F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(130, 33).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, 0.0863F, -0.0858F, 0.6402F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(17, 130).addBox(2.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, -0.0294F, -0.118F, 1.6753F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(124, 110).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.0419F, -0.1142F, 1.0778F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(129, 107).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.0863F, -0.0858F, 0.6402F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4511F, -7.7965F, -0.0177F, -0.1745F, 0.0031F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(101, 112).addBox(0.0F, -2.5122F, -1.0627F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0895F, -1.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(91, 119).addBox(0.0F, -2.5117F, -0.8614F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -8.195F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(86, 119).addBox(0.0F, -2.6367F, -0.9614F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0262F, -5.0951F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0369F, 0.2058F, -1.3942F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(126, 120).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.1464F, 0.1498F, -0.7936F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(10, 127).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.1955F, 0.0743F, -0.3609F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(127, 38).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.2262F, 0.0923F, -0.3241F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(127, 40).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.1669F, 0.1789F, -0.7559F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(73, 32).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0371F, 0.2413F, -1.3598F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0059F, 0.1594F, -1.4479F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(127, 83).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0945F, 0.1287F, -0.8488F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(127, 85).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1399F, 0.0768F, -0.4132F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(127, 85).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1399F, -0.0768F, 0.4132F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(27, 13).addBox(-2.5F, -3.0377F, 0.0037F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.9393F, -9.0279F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(127, 83).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0945F, -0.1287F, 0.8488F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(92, 31).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0059F, -0.1594F, 1.4479F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(73, 32).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0371F, -0.2413F, 1.3598F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(127, 40).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.1669F, -0.1789F, 0.7559F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(127, 38).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.2262F, -0.0923F, 0.3241F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(10, 127).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.1955F, -0.0743F, 0.3609F));

		PartDefinition cube_r246 = body2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(126, 120).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.1464F, -0.1498F, 0.7936F));

		PartDefinition cube_r247 = body2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(65, 48).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0369F, -0.2058F, 1.3942F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0676F, -9.0649F, 0.1402F, -0.0864F, -0.0122F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(112, 51).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.1141F, -1.9868F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(128, 75).addBox(0.0F, -2.6525F, -0.1399F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1141F, -1.8868F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(115, 133).addBox(0.0F, -2.3967F, -0.0424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0859F, -3.9868F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(70, 77).addBox(-4.9595F, 0.1454F, -1.4401F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9595F, 10.5499F, -9.6997F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(56, 20).mirror().addBox(-8.4F, -0.1F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5042F, 11.5832F, -9.5596F, 0.2347F, 1.2344F, 0.3144F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(86, 92).mirror().addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7986F, 11.3905F, -9.6264F, 0.2562F, 1.1069F, 0.8653F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9587F, 11.0177F, -10.384F, -0.203F, 0.983F, 1.1027F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(127, 87).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8641F, -1.4868F, 0.11F, 0.0516F, -0.28F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(127, 89).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8641F, -1.4868F, 0.078F, 0.0932F, -0.7156F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(56, 22).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8641F, -1.4868F, 0.0124F, 0.1208F, -1.3119F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(76, 65).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9141F, -3.4868F, 0.0284F, 0.1343F, -1.3624F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(123, 127).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9141F, -3.4868F, 0.0989F, 0.0954F, -0.7662F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(128, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9141F, -3.4868F, 0.1298F, 0.0448F, -0.3317F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(84, 54).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2141F, -5.3868F, 0.0408F, 0.1126F, -1.3958F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(128, 63).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2141F, -5.3868F, 0.0968F, 0.0706F, -0.8013F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(128, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2141F, -5.3868F, 0.1174F, 0.0232F, -0.367F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(128, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2141F, -7.3868F, 0.1531F, 0.0273F, -0.4182F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(128, 73).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2141F, -7.3868F, 0.1275F, 0.0893F, -0.8509F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(93, 33).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2141F, -7.3868F, 0.0557F, 0.1453F, -1.446F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(93, 33).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2141F, -7.3868F, 0.0557F, -0.1453F, 1.446F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(128, 73).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2141F, -7.3868F, 0.1275F, -0.0893F, 0.8509F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(128, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2141F, -7.3868F, 0.1531F, -0.0273F, 0.4182F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(112, 133).addBox(0.0F, -2.1927F, -0.2837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0141F, -7.7868F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(128, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2141F, -5.3868F, 0.1174F, -0.0232F, 0.367F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(128, 63).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2141F, -5.3868F, 0.0968F, -0.0706F, 0.8013F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(84, 54).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2141F, -5.3868F, 0.0408F, -0.1126F, 1.3958F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(128, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9141F, -3.4868F, 0.1298F, -0.0448F, 0.3317F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(123, 127).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9141F, -3.4868F, 0.0989F, -0.0954F, 0.7662F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(76, 65).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9141F, -3.4868F, 0.0284F, -0.1343F, 1.3624F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(56, 22).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8641F, -1.4868F, 0.0124F, -0.1208F, 1.3119F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(127, 89).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8641F, -1.4868F, 0.078F, -0.0932F, 0.7156F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(27, 24).addBox(-3.0F, -1.8768F, -7.1404F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.9406F, -1.4518F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(127, 87).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8641F, -1.4868F, 0.11F, -0.0516F, 0.28F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(109, 133).addBox(0.0F, -2.4926F, -0.2837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1141F, -5.7868F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(108, 0).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9587F, 11.0177F, -10.384F, -0.203F, -0.983F, -1.1027F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(86, 92).addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7986F, 11.3905F, -9.6264F, 0.2562F, -1.1069F, -0.8653F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(56, 20).addBox(-0.6F, -0.1F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5042F, 11.5832F, -9.5596F, 0.2347F, -1.2344F, -0.3144F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(0.0F, -0.5F, 0.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.0385F, -14.1099F, -0.7841F, -0.3531F, 0.3322F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 85).addBox(-2.0F, -0.5F, 0.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.0385F, -14.1099F, -0.7841F, 0.3531F, -0.3322F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 85).addBox(-2.9595F, -0.9682F, -4.1664F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9595F, 11.1499F, -11.2997F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(70, 68).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0141F, -2.0868F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3431F, 5.7255F, -6.9862F, -0.2077F, 0.0719F, -0.2068F));

		PartDefinition cube_r289 = bone2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(73, 24).addBox(-0.9453F, -1.1885F, 0.2157F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 0.9469F, -0.0148F, -0.0092F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(96, 119).addBox(-0.5F, -0.35F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4331F, -5.9393F, 1.6531F, 0.7898F, -0.0148F, -0.0092F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(119, 51).addBox(-0.5F, -1.025F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(119, 17).addBox(-0.5F, -0.225F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4342F, -5.7598F, 1.1594F, 1.3744F, 0.0027F, -0.0172F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(78, 106).addBox(-0.5F, -0.6F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5211F, -0.2755F, -1.6552F, 1.0166F, 0.0027F, -0.0172F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(13, 80).addBox(-0.9433F, -1.314F, -0.522F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 1.1563F, 0.0027F, -0.0172F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(36, 66).addBox(-0.8861F, -0.9959F, 0.7464F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 2.6178F, -2.4595F, 1.0472F, 0.003F, -0.0172F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(118, 133).addBox(-0.425F, -1.05F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0982F, 2.9226F, -2.5249F, 1.0297F, 0.1346F, 0.2175F));

		PartDefinition cube_r296 = bone2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(38, 100).addBox(-0.1317F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.4194F, 0.6401F, 1.071F));

		PartDefinition cube_r297 = bone2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 104).addBox(-1.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.6093F, 0.4662F, 0.7137F));

		PartDefinition cube_r298 = bone2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(60, 113).addBox(-1.0673F, -0.7729F, -2.7244F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.1325F, 0.4662F, 0.7137F));

		PartDefinition cube_r299 = bone2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(113, 40).addBox(-1.0673F, -0.8336F, -2.1077F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.787F, 0.4662F, 0.7137F));

		PartDefinition cube_r300 = bone2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(15, 132).addBox(-1.1422F, -1.6634F, -0.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 2.6178F, -2.4595F, 0.3967F, 0.0827F, 0.2417F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3431F, 5.7255F, -6.9862F, -0.2077F, -0.0719F, 0.2068F));

		PartDefinition cube_r301 = bone4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(73, 24).mirror().addBox(-0.0547F, -1.1885F, 0.2157F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 0.9469F, 0.0148F, 0.0092F));

		PartDefinition cube_r302 = bone4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(96, 119).mirror().addBox(-0.5F, -0.35F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4331F, -5.9393F, 1.6531F, 0.7898F, 0.0148F, 0.0092F));

		PartDefinition cube_r303 = bone4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(119, 51).mirror().addBox(-0.5F, -1.025F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 17).mirror().addBox(-0.5F, -0.225F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4342F, -5.7598F, 1.1594F, 1.3744F, -0.0027F, 0.0172F));

		PartDefinition cube_r304 = bone4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(78, 106).mirror().addBox(-0.5F, -0.6F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5211F, -0.2755F, -1.6552F, 1.0166F, -0.0027F, 0.0172F));

		PartDefinition cube_r305 = bone4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(13, 80).mirror().addBox(-0.0567F, -1.314F, -0.522F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 1.1563F, -0.0027F, 0.0172F));

		PartDefinition cube_r306 = bone4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(36, 66).mirror().addBox(-0.1139F, -0.9959F, 0.7464F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 2.6178F, -2.4595F, 1.0472F, -0.003F, 0.0172F));

		PartDefinition cube_r307 = bone4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(118, 133).mirror().addBox(-0.575F, -1.05F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0982F, 2.9226F, -2.5249F, 1.0297F, -0.1346F, -0.2175F));

		PartDefinition cube_r308 = bone4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(38, 100).mirror().addBox(-0.8683F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.4194F, -0.6401F, -1.071F));

		PartDefinition cube_r309 = bone4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(0.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.6093F, -0.4662F, -0.7137F));

		PartDefinition cube_r310 = bone4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(60, 113).mirror().addBox(0.0673F, -0.7729F, -2.7244F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.1325F, -0.4662F, -0.7137F));

		PartDefinition cube_r311 = bone4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(113, 40).mirror().addBox(0.0673F, -0.8336F, -2.1077F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.787F, -0.4662F, -0.7137F));

		PartDefinition cube_r312 = bone4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(15, 132).mirror().addBox(0.1422F, -1.6634F, -0.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 2.6178F, -2.4595F, 0.3967F, -0.0827F, -0.2417F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4201F, 7.6662F, -12.5215F, 1.1956F, 0.2618F, 0.0F));

		PartDefinition cube_r313 = leftArm1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(128, 122).addBox(-0.5842F, -2.029F, -0.384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2382F, 2.543F, -0.0163F, -0.6232F, -0.2099F, -0.0731F));

		PartDefinition cube_r314 = leftArm1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(130, 55).addBox(-0.7695F, -2.2221F, -0.308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2382F, 2.543F, -0.0163F, -0.2787F, -0.7771F, -0.0638F));

		PartDefinition cube_r315 = leftArm1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(124, 105).addBox(-0.7695F, -2.2221F, -0.708F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2382F, 2.543F, -0.0163F, -0.0169F, -0.7771F, -0.0638F));

		PartDefinition cube_r316 = leftArm1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(48, 130).addBox(-0.7695F, -0.0244F, -0.6765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2382F, 2.543F, -0.0163F, -0.3224F, -0.7771F, -0.0638F));

		PartDefinition cube_r317 = leftArm1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(94, 128).addBox(-0.465F, -0.3234F, -0.3246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2382F, 2.543F, -0.0163F, -0.2023F, -0.0622F, -0.0824F));

		PartDefinition cube_r318 = leftArm1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(133, 120).addBox(-0.5F, -1.325F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4142F, 7.6897F, -0.4119F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r319 = leftArm1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(123, 122).addBox(-0.5F, -3.9F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4142F, 7.3829F, 0.0503F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(113, 77).addBox(-0.7836F, -0.8109F, 0.4341F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 28).addBox(-0.7836F, -0.0109F, -0.6659F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7286F, 7.2054F, -0.7153F, -1.05F, 0.0156F, 0.0164F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3323F, 4.3662F, 1.122F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r320 = leftHand.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(85, 67).addBox(0.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftHand.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(61, 107).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4201F, 7.6662F, -12.5215F, 0.8029F, -0.2618F, 0.0F));

		PartDefinition cube_r322 = rightArm1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(24, 130).addBox(-0.4158F, -2.029F, -0.384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2382F, 2.543F, -0.0163F, -0.6232F, 0.2099F, 0.0731F));

		PartDefinition cube_r323 = rightArm1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(130, 91).addBox(-0.2305F, -2.2221F, -0.308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2382F, 2.543F, -0.0163F, -0.2787F, 0.7771F, 0.0638F));

		PartDefinition cube_r324 = rightArm1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(108, 124).addBox(-0.2305F, -2.2221F, -0.708F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2382F, 2.543F, -0.0163F, -0.0169F, 0.7771F, 0.0638F));

		PartDefinition cube_r325 = rightArm1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(130, 65).addBox(-0.2305F, -0.0244F, -0.6765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2382F, 2.543F, -0.0163F, -0.3224F, 0.7771F, 0.0638F));

		PartDefinition cube_r326 = rightArm1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 130).addBox(-0.535F, -0.3234F, -0.3246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2382F, 2.543F, -0.0163F, -0.2023F, 0.0622F, 0.0824F));

		PartDefinition cube_r327 = rightArm1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(136, 18).addBox(-0.5F, -1.325F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4142F, 7.6897F, -0.4119F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r328 = rightArm1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(79, 124).addBox(-0.5F, -3.9F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.4142F, 7.3829F, 0.0503F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(7, 116).addBox(-0.2164F, -0.8109F, 0.4341F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 99).addBox(-0.2164F, -0.0109F, -0.6659F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7286F, 7.2054F, -0.7153F, -1.05F, -0.0156F, -0.0164F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3323F, 4.3662F, 1.122F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r329 = rightHand.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(46, 86).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r330 = rightHand.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(18, 108).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0448F, -7.8172F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r331 = neck1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(123, 133).addBox(0.0F, -2.5459F, -0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r332 = neck1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(108, 2).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.1117F, 0.5563F, -1.6605F));

		PartDefinition cube_r333 = neck1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(128, 81).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.4169F, 0.395F, -1.0144F));

		PartDefinition cube_r334 = neck1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(129, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.536F, 0.192F, -0.6098F));

		PartDefinition cube_r335 = neck1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(129, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.536F, -0.192F, 0.6098F));

		PartDefinition cube_r336 = neck1.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(128, 81).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.4169F, -0.395F, 1.0144F));

		PartDefinition cube_r337 = neck1.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(108, 2).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.1117F, -0.5563F, 1.6605F));

		PartDefinition cube_r338 = neck1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(100, 56).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3555F, -0.2874F, -0.1049F));

		PartDefinition cube_r339 = neck2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(135, 69).addBox(0.0F, -2.3816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3348F, -2.7071F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r340 = neck2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(42, 135).addBox(0.0F, -2.1816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r341 = neck2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(129, 6).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.0197F, 0.2557F, -0.7992F));

		PartDefinition cube_r342 = neck2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(117, 113).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -2.9545F, 0.058F, 0.6046F, -1.4128F));

		PartDefinition cube_r343 = neck2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(10, 129).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -2.9545F, 0.3323F, 0.5179F, -0.9058F));

		PartDefinition cube_r344 = neck2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(28, 120).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0924F, 0.2395F, -1.2492F));

		PartDefinition cube_r345 = neck2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(28, 120).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0924F, -0.2395F, 1.2492F));

		PartDefinition cube_r346 = neck2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(10, 129).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1875F, -2.9545F, 0.3323F, -0.5179F, 0.9058F));

		PartDefinition cube_r347 = neck2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(117, 113).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1875F, -2.9545F, 0.058F, -0.6046F, 1.4128F));

		PartDefinition cube_r348 = neck2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(129, 6).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.0197F, -0.2557F, 0.7992F));

		PartDefinition cube_r349 = neck2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(100, 72).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4778F, -2.5803F, -0.2701F, -0.3006F, 0.0547F));

		PartDefinition cube_r350 = neck5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(103, 17).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r351 = neck5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(129, 21).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0903F, -1.9742F, 0.1667F, 0.7142F, -1.0514F));

		PartDefinition cube_r352 = neck5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(129, 23).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0903F, -1.9742F, -0.2156F, 0.7031F, -1.6294F));

		PartDefinition cube_r353 = neck5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(129, 23).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0903F, -1.9742F, -0.2156F, -0.7031F, 1.6294F));

		PartDefinition cube_r354 = neck5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(129, 21).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0903F, -1.9742F, 0.1667F, -0.7142F, 1.0514F));

		PartDefinition cube_r355 = neck5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(89, 136).addBox(0.0F, -2.5566F, -0.0491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9226F, -2.0602F, -0.2094F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.489F, 0.0402F, -0.0171F));

		PartDefinition cube_r356 = neck4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(129, 25).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0153F, -1.8127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r357 = neck4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(129, 27).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0153F, -1.8127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r358 = neck4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(129, 29).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0847F, -3.8127F, 0.508F, 0.9362F, -0.7795F));

		PartDefinition cube_r359 = neck4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(129, 31).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0847F, -3.8127F, -0.1513F, 1.0193F, -1.5615F));

		PartDefinition cube_r360 = neck4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(129, 31).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0847F, -3.8127F, -0.1513F, -1.0193F, 1.5615F));

		PartDefinition cube_r361 = neck4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(129, 29).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0847F, -3.8127F, 0.508F, -0.9362F, 0.7795F));

		PartDefinition cube_r362 = neck4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(129, 27).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0153F, -1.8127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r363 = neck4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(129, 25).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0153F, -1.8127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r364 = neck4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(0, 134).addBox(0.0F, -2.1677F, 0.0418F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r365 = neck4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(126, 133).addBox(0.0F, -2.1677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r366 = neck4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(55, 88).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.0617F, -0.211F, -0.1429F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(53, 129).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5534F, -3.6609F, 0.3929F, 0.6459F, -1.0278F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(130, 35).mirror().addBox(-3.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5534F, -3.6609F, 0.0308F, 0.7406F, -1.5852F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(60, 129).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.376F, 0.6139F, -0.9853F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(67, 129).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0376F, 0.7062F, -1.5282F));

		PartDefinition cube_r371 = neck3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(67, 129).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0376F, -0.7062F, 1.5282F));

		PartDefinition cube_r372 = neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(60, 129).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.376F, -0.6139F, 0.9853F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(130, 35).addBox(1.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5534F, -3.6609F, 0.0308F, -0.7406F, 1.5852F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(53, 129).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5534F, -3.6609F, 0.3929F, -0.6459F, 1.0278F));

		PartDefinition cube_r375 = neck3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(138, 122).addBox(0.5F, -1.8458F, -0.0223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6988F, -3.1055F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(23, 134).addBox(0.5F, -1.769F, 0.0228F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r377 = neck3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(75, 89).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(123, 138).addBox(0.0F, -2.8722F, -1.9904F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.4955F, -0.0946F, 0.1004F));

		PartDefinition cube_r378 = neck.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(74, 129).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.8382F, 0.9828F, -0.7457F));

		PartDefinition cube_r379 = neck.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(81, 129).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0594F, 1.19F, -1.6099F));

		PartDefinition cube_r380 = neck.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(81, 129).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0594F, -1.19F, 1.6099F));

		PartDefinition cube_r381 = neck.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(62, 101).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r382 = neck.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(74, 129).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.8382F, -0.9828F, 0.7457F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.2395F, -0.1376F, 0.0208F));

		PartDefinition cube_r383 = neck6.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(129, 97).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2212F, -0.721F, 0.5254F, 0.741F, -0.9857F));

		PartDefinition cube_r384 = neck6.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(53, 66).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2212F, -0.721F, 0.0783F, 0.876F, -1.5935F));

		PartDefinition cube_r385 = neck6.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(129, 99).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3212F, -2.221F, 0.7131F, 0.9078F, -0.8472F));

		PartDefinition cube_r386 = neck6.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(97, 5).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3212F, -2.221F, 0.0682F, 1.0854F, -1.6019F));

		PartDefinition cube_r387 = neck6.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(129, 101).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0212F, -4.221F, 1.0832F, 1.0773F, -0.5351F));

		PartDefinition cube_r388 = neck6.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(47, 100).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0212F, -4.221F, 0.0319F, 1.3469F, -1.6362F));

		PartDefinition cube_r389 = neck6.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(47, 100).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0212F, -4.221F, 0.0319F, -1.3469F, 1.6362F));

		PartDefinition cube_r390 = neck6.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(129, 101).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0212F, -4.221F, 1.0832F, -1.0773F, 0.5351F));

		PartDefinition cube_r391 = neck6.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(97, 5).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3212F, -2.221F, 0.0682F, -1.0854F, 1.6019F));

		PartDefinition cube_r392 = neck6.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(129, 99).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3212F, -2.221F, 0.7131F, -0.9078F, 0.8472F));

		PartDefinition cube_r393 = neck6.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(53, 66).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2212F, -0.721F, 0.0783F, -0.876F, 1.5935F));

		PartDefinition cube_r394 = neck6.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(134, 37).addBox(0.5F, -2.1207F, -0.2014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.047F, -4.7032F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r395 = neck6.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(26, 134).addBox(0.5F, -2.4056F, -0.0179F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6375F, -2.9498F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r396 = neck6.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(126, 138).addBox(0.5F, -2.1207F, -0.1014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -1.0498F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r397 = neck6.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(18, 102).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.863F, -2.08F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r398 = neck6.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(113, 84).addBox(0.0F, 1.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r399 = neck6.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(129, 97).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2212F, -0.721F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.81F, -4.4471F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(105, 66).addBox(-1.0F, 0.0F, 0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -2.1734F, -4.4174F, -1.2872F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(104, 93).addBox(-1.0F, -0.825F, -1.075F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -0.9736F, -3.2933F, -1.5926F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(104, 88).addBox(-1.0F, -1.9514F, 0.0494F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.1031F, -7.6202F, -1.2435F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(101, 108).addBox(-1.0F, -2.8551F, -0.2024F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, 0.0481F, -10.2211F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(104, 83).addBox(-1.0F, -1.9553F, -0.1191F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0481F, -10.2211F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(44, 121).addBox(-0.5F, -1.0439F, -0.0277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 2.6608F, -14.2238F, -0.877F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(37, 121).addBox(-0.5F, -1.0258F, -0.0459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 2.0608F, -13.4738F, -0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(94, 114).addBox(-0.5F, -2.9851F, -0.1258F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.0608F, -13.4738F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(19, 121).addBox(-0.5F, -0.0686F, 0.2109F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -0.2769F, -10.3211F, -1.1214F, 0.0F, 0.0F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(63, 135).addBox(-0.5F, -1.886F, -0.2216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 3.9458F, -15.517F, -0.8945F, 0.0F, 0.0F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(135, 60).addBox(-0.5F, -0.9114F, -0.065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 3.9458F, -15.517F, -0.7374F, 0.0F, 0.0F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(136, 109).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 4.9373F, -15.8944F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(137, 39).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4586F, -15.4167F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(104, 78).addBox(-0.5F, 0.0588F, -2.9985F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.4207F, -3.066F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(116, 120).addBox(-0.5F, -0.8162F, -1.9985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.0521F, -2.1365F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(109, 120).addBox(-0.5F, -0.5134F, -1.1974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.0521F, -2.1365F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(53, 68).addBox(-0.5F, -0.3687F, -5.2501F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.7589F, -9.6403F, 0.165F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(93, 81).addBox(-0.5F, -0.1F, -1.325F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.1016F, -6.8696F, 0.2697F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, -0.35F, -2.9F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.7196F, -2.0225F, 0.0254F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(58, 135).addBox(-0.5F, 0.2168F, -0.5307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.9521F, -2.1365F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(62, 96).addBox(-1.5F, -1.3F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4651F, -2.0577F, -0.4689F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(93, 43).addBox(-1.5F, 0.9371F, -4.0968F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9775F, 1.3132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(100, 62).addBox(-1.5F, 0.1F, -2.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.7075F, -0.3968F, 0.8639F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5011F, 0.6098F, -1.2129F, 0.0F, -0.0174F, 0.0015F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(101, 126).addBox(0.375F, -1.675F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(126, 51).addBox(0.375F, -1.675F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0846F, -2.5463F, -0.0875F, 2.3727F, 0.9784F, -0.4787F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(75, 8).addBox(-1.7229F, -0.9751F, -6.3285F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0939F, 2.8773F, -3.4112F, 0.2084F, 0.0788F, 0.0537F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(116, 129).addBox(-0.5516F, 2.9106F, -1.9152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5624F, -0.5937F, -6.6765F, -0.8493F, 0.0003F, 0.3179F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(135, 57).addBox(-0.5516F, -1.652F, -3.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5624F, -0.5937F, -6.6765F, 0.6342F, 0.0003F, 0.3179F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(87, 114).addBox(-0.5516F, -1.4234F, -2.2714F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5624F, -0.5937F, -6.6765F, 0.5295F, 0.0003F, 0.3179F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(114, 62).addBox(-0.5278F, -1.3833F, -0.4979F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5624F, -0.5937F, -6.6765F, 0.3752F, 0.0269F, 0.2958F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(111, 129).addBox(-0.4185F, -0.9854F, -4.1094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5624F, -0.5937F, -6.6765F, -2.8734F, 0.0146F, 0.269F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(14, 114).addBox(-0.4768F, 1.3222F, -0.4791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5624F, -0.5937F, -6.6765F, 1.839F, 0.0146F, 0.269F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(106, 129).addBox(-0.4194F, 1.0498F, -2.9355F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5624F, -0.5937F, -6.6765F, 2.8425F, 0.0146F, 0.269F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(135, 54).addBox(-0.5F, -0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4183F, 2.0686F, 2.2772F, 0.9913F, -0.0349F, -0.0175F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(119, 0).addBox(-0.9093F, -2.0133F, -8.9043F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1311F, 3.4773F, -5.5112F, 0.3075F, 0.1049F, 0.0336F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(137, 36).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4714F, 5.3334F, -13.7355F, 0.2376F, 0.1049F, 0.0336F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(131, 113).addBox(-0.5F, -1.075F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2912F, 4.1756F, -12.3939F, 0.0544F, 0.1049F, 0.0336F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(108, 23).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0721F, 4.8845F, -10.0864F, -1.163F, 0.1049F, 0.0336F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(108, 29).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2871F, 5.0817F, -12.065F, 0.1024F, 0.1049F, 0.0336F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(53, 135).addBox(-0.5F, 0.0F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5439F, 4.554F, -14.6729F, 1.5544F, 0.1091F, 0.0148F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(97, 137).addBox(-0.5F, 0.175F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4625F, 3.5605F, -14.217F, 2.4542F, 0.1049F, 0.0336F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(68, 137).addBox(-0.5F, 0.0513F, -0.9836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4663F, 3.5486F, -14.3892F, 2.4549F, 0.0974F, 0.0514F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(45, 137).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5398F, 4.4503F, -14.6668F, 1.2769F, 0.0974F, 0.0514F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(109, 115).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4407F, -1.6625F, -6.0318F, 0.2459F, 0.1074F, 0.0243F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(103, 11).addBox(-0.5198F, -2.9408F, -2.1357F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4508F, 1.3756F, -5.625F, 0.4204F, 0.1074F, 0.0243F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(73, 96).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0795F, 0.9367F, -11.4186F, 0.4645F, 0.1049F, 0.0336F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(103, 5).addBox(-0.5F, -1.05F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.1932F, 2.6561F, -11.9486F, 0.6827F, 0.1049F, 0.0336F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(131, 109).addBox(-0.8593F, -1.0469F, -10.3597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1311F, 3.3773F, -4.6112F, 0.2027F, 0.1049F, 0.0336F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(126, 13).addBox(-0.8593F, -0.7719F, -9.4097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0311F, 3.3773F, -4.6112F, 0.2027F, 0.1049F, 0.0336F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(126, 9).addBox(-0.8593F, -0.8943F, -8.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0311F, 3.3773F, -4.6112F, 0.2551F, 0.1049F, 0.0336F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(24, 126).addBox(-0.9093F, -1.0101F, -7.4485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0311F, 3.3773F, -4.6112F, 0.3075F, 0.1049F, 0.0336F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(136, 112).addBox(-0.5F, 0.1F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 131).addBox(-0.5F, -0.8F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(131, 50).addBox(-0.5F, -0.8F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5756F, 4.1597F, -7.7578F, 0.4384F, 0.1049F, 0.0336F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(131, 16).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8006F, 4.1597F, -7.7578F, 0.4384F, 0.1049F, 0.0336F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(131, 8).addBox(-0.5F, -1.0F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 131).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9968F, 4.9176F, -9.3787F, 0.4384F, 0.1049F, 0.0336F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(126, 17).addBox(-0.9093F, -1.409F, -6.4695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0311F, 3.3773F, -4.6112F, 0.3947F, 0.1049F, 0.0336F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(93, 35).addBox(-0.5F, -4.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5196F, 3.5579F, -5.5854F, 0.1543F, 0.1074F, 0.0243F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(104, 46).addBox(-0.5198F, -1.847F, -0.434F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4508F, 1.3756F, -5.625F, 0.2023F, 0.1074F, 0.0243F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(120, 91).addBox(-0.5056F, -1.904F, 1.4349F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4508F, 1.3756F, -5.625F, 0.1664F, 0.0943F, 0.0247F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(135, 45).addBox(-0.9399F, -5.1508F, -0.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2439F, 3.1273F, -1.4112F, -0.5236F, -0.0349F, -0.0175F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(120, 87).addBox(-0.29F, -0.8222F, -0.8988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.046F, -2.0322F, -1.8687F, -1.1097F, 0.0981F, 0.3921F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(113, 94).addBox(-0.2397F, -1.6995F, -1.1225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.046F, -2.0322F, -1.8687F, -1.9634F, -0.0088F, 0.3673F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(113, 89).addBox(-0.2364F, -0.2311F, -0.8135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.046F, -2.0322F, -1.8687F, -1.4241F, 0.2949F, 0.3623F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(136, 21).addBox(-0.7904F, -0.8222F, -0.5717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.046F, -2.0322F, -1.8687F, -1.1577F, -0.2324F, 1.0706F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(129, 103).addBox(-0.9062F, -1.6995F, -0.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.046F, -2.0322F, -1.8687F, -1.8708F, 0.2573F, 1.077F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(130, 42).addBox(-0.6931F, -0.2311F, -0.5459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.046F, -2.0322F, -1.8687F, -1.2634F, 0.1174F, 1.1091F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(47, 102).addBox(-0.5F, -2.5F, -1.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2052F, 0.3338F, -3.0575F, 0.0376F, 0.1126F, 0.0089F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(102, 35).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3474F, -1.9114F, 0.3971F, -0.096F, -0.0349F, -0.0175F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(88, 129).addBox(-0.5F, -1.225F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3162F, -0.5246F, 0.1952F, -0.672F, -0.0349F, -0.0175F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(124, 4).addBox(-0.5F, -1.5F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3388F, 0.7618F, 1.486F, 0.5672F, -0.0349F, -0.0175F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(53, 95).addBox(-0.5F, -3.675F, -2.225F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2635F, 2.9953F, 0.4447F, 0.0959F, -0.0369F, -0.0127F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(135, 42).addBox(-0.5F, -2.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1931F, 3.0514F, -0.3261F, -0.8858F, -0.0349F, -0.0175F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(37, 135).addBox(-0.5F, -1.0F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(32, 135).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.199F, 2.3686F, -0.4991F, 0.0305F, -0.0349F, -0.0175F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(58, 124).addBox(-0.5F, -3.0F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.182F, 1.7944F, -1.2732F, -0.1527F, -0.0349F, -0.0175F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(13, 135).addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.182F, 1.7944F, -1.2732F, -0.6327F, -0.0349F, -0.0175F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(8, 135).addBox(-0.5F, -1.0F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2156F, -0.1189F, -0.7662F, -0.1091F, -0.0349F, -0.0175F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(120, 83).addBox(-0.5F, 0.15F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2092F, 0.659F, -0.5601F, 1.7017F, -0.0349F, -0.0175F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(3, 135).addBox(-0.5F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2524F, 1.6873F, 0.6888F, 2.5307F, -0.0349F, -0.0175F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(87, 133).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8709F, 2.8836F, -12.4523F, -2.9464F, 0.1398F, 0.0338F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(135, 126).addBox(-0.5F, -0.7F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(135, 92).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.0544F, 2.9767F, -13.7337F, -2.1523F, 0.1398F, 0.0338F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(92, 135).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0075F, 2.6777F, -13.4722F, -0.7211F, 0.1398F, 0.0338F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(135, 89).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9567F, 2.4159F, -13.1741F, 0.7188F, 0.1398F, 0.0338F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(104, 133).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9014F, 2.2257F, -12.8266F, 2.0714F, 0.1398F, 0.0338F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(126, 112).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.8685F, 2.491F, -12.5291F, 2.4205F, 0.1398F, 0.0338F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(131, 132).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9114F, 3.2241F, -12.6581F, -2.1174F, 0.1398F, 0.0338F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(135, 79).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 135).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.013F, 3.7477F, -13.2543F, -0.852F, 0.1398F, 0.0338F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(74, 135).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.0703F, 3.8303F, -13.6415F, 0.2126F, 0.1398F, 0.0338F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(134, 103).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.0921F, 3.6534F, -13.8386F, 1.5653F, 0.1398F, 0.0338F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(136, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4263F, 2.5617F, -5.0327F, 2.5677F, 0.1049F, 0.0336F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(58, 131).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5362F, 2.8939F, -5.9695F, -2.7992F, 0.1049F, 0.0336F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(12, 123).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6455F, 3.1003F, -6.9418F, -1.3593F, 0.1049F, 0.0336F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(136, 30).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7445F, 2.9597F, -7.9269F, -0.1376F, 0.1049F, 0.0336F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(136, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7575F, 2.0496F, -8.3411F, 0.4296F, 0.1049F, 0.0336F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(130, 46).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6974F, 1.0869F, -8.0773F, 1.3023F, 0.1049F, 0.0336F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(5, 123).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6123F, 0.2495F, -7.5374F, 2.5677F, 0.1049F, 0.0336F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5122F, -0.4181F, -6.7996F, -2.4065F, 0.1049F, 0.0336F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(122, 101).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4057F, -0.9465F, -5.9573F, -1.0103F, 0.1049F, 0.0336F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(136, 74).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2973F, -1.3989F, -5.0721F, 0.4733F, 0.1049F, 0.0336F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(27, 106).addBox(-0.5F, -0.875F, -2.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2753F, -0.2961F, -4.5112F, 1.2587F, 0.1049F, 0.0336F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(19, 125).addBox(-0.5F, -1.175F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3555F, 0.48F, -5.0251F, 3.004F, 0.1049F, 0.0336F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(136, 24).addBox(-0.55F, 1.15F, 0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3785F, 1.3937F, -7.8005F, -1.7346F, 0.1049F, 0.0336F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(98, 134).addBox(-0.3692F, -0.5852F, 0.2942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(134, 86).addBox(-0.5942F, -0.5852F, 0.2942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, 1.7429F, -0.0174F, 0.0174F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(136, 12).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0932F, 0.9173F, -2.1203F, 0.1309F, -0.0417F, -0.0267F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(134, 83).addBox(-0.6486F, 0.4374F, -1.3852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, 1.0472F, -0.0417F, -0.0267F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(104, 41).addBox(-0.6486F, -0.6129F, -1.9629F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, 1.7017F, -0.0417F, -0.0267F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(48, 134).addBox(-0.6486F, -1.323F, -1.1677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, 2.2253F, -0.0417F, -0.0267F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(120, 39).addBox(-0.6194F, -0.0515F, -1.0061F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, -1.5121F, -0.0174F, 0.0174F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(136, 9).addBox(-0.6252F, -0.9553F, 0.1837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, 0.3466F, -0.0132F, 0.0208F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(65, 121).addBox(-0.6252F, -0.0157F, -1.2711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, 1.3502F, -0.0132F, 0.0208F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(136, 6).addBox(-0.6252F, -0.979F, 0.4783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, 0.9575F, -0.0132F, 0.0208F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(136, 3).addBox(-0.6194F, -1.7336F, -0.8291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, -0.0024F, -0.0174F, 0.0174F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(133, 123).addBox(-0.6194F, -1.5371F, -1.1654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0547F, 0.1685F, -2.5806F, -0.2206F, -0.0174F, 0.0174F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(136, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2754F, 3.1773F, 0.8277F, 0.2181F, -0.0356F, -0.0159F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(134, 135).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2391F, 3.2203F, -0.1707F, 1.6144F, -0.0356F, -0.0159F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(121, 61).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2092F, 3.1024F, -1.0624F, 3.0107F, -0.0356F, -0.0159F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(51, 121).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.171F, 3.3182F, -2.0381F, -1.3527F, -0.0356F, -0.0159F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(129, 135).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.171F, 3.3182F, -2.0381F, -0.2618F, -0.0356F, -0.0159F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(0, 120).addBox(-0.5F, -2.075F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1932F, 1.1767F, -2.3697F, -0.0437F, -0.0356F, -0.0159F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.501F, 0.6098F, -1.2129F, 0.0F, 0.0174F, -0.0015F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(101, 126).mirror().addBox(-1.375F, -1.675F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(126, 51).mirror().addBox(-1.375F, -1.675F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.0846F, -2.5463F, -0.0875F, 2.3727F, -0.9784F, 0.4787F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(0.7229F, -0.9751F, -6.3285F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.0939F, 2.8773F, -3.4112F, 0.2084F, -0.0788F, -0.0537F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(116, 129).mirror().addBox(-0.4484F, 2.9106F, -1.9152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5624F, -0.5937F, -6.6765F, -0.8493F, -0.0003F, -0.3179F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(135, 57).mirror().addBox(-0.4484F, -1.652F, -3.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5624F, -0.5937F, -6.6765F, 0.6342F, -0.0003F, -0.3179F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(87, 114).mirror().addBox(-0.4484F, -1.4234F, -2.2714F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5624F, -0.5937F, -6.6765F, 0.5295F, -0.0003F, -0.3179F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(114, 62).mirror().addBox(-0.4722F, -1.3833F, -0.4979F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5624F, -0.5937F, -6.6765F, 0.3752F, -0.0269F, -0.2958F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(111, 129).mirror().addBox(-0.5815F, -0.9854F, -4.1094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5624F, -0.5937F, -6.6765F, -2.8734F, -0.0146F, -0.269F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(14, 114).mirror().addBox(-0.5232F, 1.3222F, -0.4791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5624F, -0.5937F, -6.6765F, 1.839F, -0.0146F, -0.269F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(106, 129).mirror().addBox(-0.5806F, 1.0498F, -2.9355F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5624F, -0.5937F, -6.6765F, 2.8425F, -0.0146F, -0.269F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(135, 54).mirror().addBox(-0.5F, -0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4183F, 2.0686F, 2.2772F, 0.9913F, 0.0349F, 0.0175F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-0.0907F, -2.0133F, -8.9043F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1311F, 3.4773F, -5.5112F, 0.3075F, -0.1049F, -0.0336F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(137, 36).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4714F, 5.3334F, -13.7355F, 0.2376F, -0.1049F, -0.0336F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(131, 113).mirror().addBox(-0.5F, -1.075F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2912F, 4.1756F, -12.3939F, 0.0544F, -0.1049F, -0.0336F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(108, 23).mirror().addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.0721F, 4.8845F, -10.0864F, -1.163F, -0.1049F, -0.0336F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(108, 29).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.2871F, 5.0817F, -12.065F, 0.1024F, -0.1049F, -0.0336F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(53, 135).mirror().addBox(-0.5F, 0.0F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.5439F, 4.554F, -14.6729F, 1.5544F, -0.1091F, -0.0148F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(97, 137).mirror().addBox(-0.5F, 0.175F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4625F, 3.5605F, -14.217F, 2.4542F, -0.1049F, -0.0336F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(68, 137).mirror().addBox(-0.5F, 0.0513F, -0.9836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4663F, 3.5486F, -14.3892F, 2.4549F, -0.0974F, -0.0514F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(45, 137).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5398F, 4.4503F, -14.6668F, 1.2769F, -0.0974F, -0.0514F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(109, 115).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4407F, -1.6625F, -6.0318F, 0.2459F, -0.1074F, -0.0243F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(103, 11).mirror().addBox(-0.4802F, -2.9408F, -2.1357F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4508F, 1.3756F, -5.625F, 0.4204F, -0.1074F, -0.0243F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(73, 96).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0795F, 0.9367F, -11.4186F, 0.4645F, -0.1049F, -0.0336F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(103, 5).mirror().addBox(-0.5F, -1.05F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.1932F, 2.6561F, -11.9486F, 0.6827F, -0.1049F, -0.0336F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(131, 109).mirror().addBox(-0.1407F, -1.0469F, -10.3597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1311F, 3.3773F, -4.6112F, 0.2027F, -0.1049F, -0.0336F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(126, 13).mirror().addBox(-0.1407F, -0.7719F, -9.4097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0311F, 3.3773F, -4.6112F, 0.2027F, -0.1049F, -0.0336F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(126, 9).mirror().addBox(-0.1407F, -0.8943F, -8.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0311F, 3.3773F, -4.6112F, 0.2551F, -0.1049F, -0.0336F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(24, 126).mirror().addBox(-0.0907F, -1.0101F, -7.4485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0311F, 3.3773F, -4.6112F, 0.3075F, -0.1049F, -0.0336F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(136, 112).mirror().addBox(-0.5F, 0.1F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(53, 131).mirror().addBox(-0.5F, -0.8F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(131, 50).mirror().addBox(-0.5F, -0.8F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5756F, 4.1597F, -7.7578F, 0.4384F, -0.1049F, -0.0336F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(131, 16).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8006F, 4.1597F, -7.7578F, 0.4384F, -0.1049F, -0.0336F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(131, 8).mirror().addBox(-0.5F, -1.0F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 131).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9968F, 4.9176F, -9.3787F, 0.4384F, -0.1049F, -0.0336F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(126, 17).mirror().addBox(-0.0907F, -1.409F, -6.4695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0311F, 3.3773F, -4.6112F, 0.3947F, -0.1049F, -0.0336F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(93, 35).mirror().addBox(-0.5F, -4.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5195F, 3.5579F, -5.5854F, 0.1543F, -0.1074F, -0.0243F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(104, 46).mirror().addBox(-0.4802F, -1.847F, -0.434F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4508F, 1.3756F, -5.625F, 0.2023F, -0.1074F, -0.0243F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(120, 91).mirror().addBox(-0.4944F, -1.904F, 1.4349F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4508F, 1.3756F, -5.625F, 0.1664F, -0.0943F, -0.0247F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(135, 45).mirror().addBox(-0.0601F, -5.1508F, -0.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2439F, 3.1273F, -1.4112F, -0.5236F, 0.0349F, 0.0175F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(120, 87).mirror().addBox(-0.71F, -0.8222F, -0.8988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.046F, -2.0322F, -1.8687F, -1.1097F, -0.0981F, -0.3921F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(113, 94).mirror().addBox(-0.7603F, -1.6995F, -1.1225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.046F, -2.0322F, -1.8687F, -1.9634F, 0.0088F, -0.3673F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(113, 89).mirror().addBox(-0.7636F, -0.2311F, -0.8135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.046F, -2.0322F, -1.8687F, -1.4241F, -0.2949F, -0.3623F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(136, 21).mirror().addBox(-0.2096F, -0.8222F, -0.5717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.046F, -2.0322F, -1.8687F, -1.1577F, 0.2324F, -1.0706F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(129, 103).mirror().addBox(-0.0938F, -1.6995F, -0.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.046F, -2.0322F, -1.8687F, -1.8708F, -0.2573F, -1.077F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(130, 42).mirror().addBox(-0.3069F, -0.2311F, -0.5459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.046F, -2.0322F, -1.8687F, -1.2634F, -0.1174F, -1.1091F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(47, 102).mirror().addBox(-0.5F, -2.5F, -1.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2051F, 0.3338F, -3.0575F, 0.0376F, -0.1126F, -0.0089F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(102, 35).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3474F, -1.9114F, 0.3971F, -0.096F, 0.0349F, 0.0175F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(88, 129).mirror().addBox(-0.5F, -1.225F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3162F, -0.5246F, 0.1952F, -0.672F, 0.0349F, 0.0175F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(124, 4).mirror().addBox(-0.5F, -1.5F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3388F, 0.7618F, 1.486F, 0.5672F, 0.0349F, 0.0175F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(53, 95).mirror().addBox(-0.5F, -3.675F, -2.225F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2635F, 2.9953F, 0.4447F, 0.0959F, 0.0369F, 0.0127F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(135, 42).mirror().addBox(-0.5F, -2.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1931F, 3.0514F, -0.3261F, -0.8858F, 0.0349F, 0.0175F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(37, 135).mirror().addBox(-0.5F, -1.0F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(32, 135).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.199F, 2.3686F, -0.4991F, 0.0305F, 0.0349F, 0.0175F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(58, 124).mirror().addBox(-0.5F, -3.0F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.182F, 1.7944F, -1.2732F, -0.1527F, 0.0349F, 0.0175F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(13, 135).mirror().addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.182F, 1.7944F, -1.2732F, -0.6327F, 0.0349F, 0.0175F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(8, 135).mirror().addBox(-0.5F, -1.0F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2156F, -0.1189F, -0.7662F, -0.1091F, 0.0349F, 0.0175F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(120, 83).mirror().addBox(-0.5F, 0.15F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2092F, 0.659F, -0.5601F, 1.7017F, 0.0349F, 0.0175F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(3, 135).mirror().addBox(-0.5F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2524F, 1.6873F, 0.6888F, 2.5307F, 0.0349F, 0.0175F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(87, 133).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8709F, 2.8836F, -12.4523F, -2.9464F, -0.1398F, -0.0338F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(135, 126).mirror().addBox(-0.5F, -0.7F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(135, 92).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.0544F, 2.9767F, -13.7337F, -2.1523F, -0.1398F, -0.0338F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0075F, 2.6777F, -13.4722F, -0.7211F, -0.1398F, -0.0338F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(135, 89).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.9567F, 2.4159F, -13.1741F, 0.7188F, -0.1398F, -0.0338F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(104, 133).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9014F, 2.2257F, -12.8266F, 2.0714F, -0.1398F, -0.0338F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(126, 112).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.8685F, 2.491F, -12.5291F, 2.4205F, -0.1398F, -0.0338F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(131, 132).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.9114F, 3.2241F, -12.6581F, -2.1174F, -0.1398F, -0.0338F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(135, 79).mirror().addBox(-0.5F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 135).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.013F, 3.7477F, -13.2543F, -0.852F, -0.1398F, -0.0338F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(74, 135).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(1.0703F, 3.8303F, -13.6415F, 0.2126F, -0.1398F, -0.0338F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(134, 103).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.092F, 3.6534F, -13.8386F, 1.5653F, -0.1398F, -0.0338F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(136, 48).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4263F, 2.5617F, -5.0327F, 2.5677F, -0.1049F, -0.0336F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(58, 131).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5362F, 2.8939F, -5.9695F, -2.7992F, -0.1049F, -0.0336F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(12, 123).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6455F, 3.1003F, -6.9418F, -1.3593F, -0.1049F, -0.0336F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(136, 30).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7445F, 2.9597F, -7.9269F, -0.1376F, -0.1049F, -0.0336F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(136, 27).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.7575F, 2.0496F, -8.3411F, 0.4296F, -0.1049F, -0.0336F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(130, 46).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6974F, 1.0869F, -8.0773F, 1.3023F, -0.1049F, -0.0336F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(5, 123).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6123F, 0.2495F, -7.5374F, 2.5677F, -0.1049F, -0.0336F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(131, 0).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5122F, -0.4181F, -6.7996F, -2.4065F, -0.1049F, -0.0336F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(122, 101).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4057F, -0.9465F, -5.9573F, -1.0103F, -0.1049F, -0.0336F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(136, 74).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2973F, -1.3989F, -5.0721F, 0.4733F, -0.1049F, -0.0336F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(27, 106).mirror().addBox(-0.5F, -0.875F, -2.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2753F, -0.2961F, -4.5112F, 1.2587F, -0.1049F, -0.0336F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(19, 125).mirror().addBox(-0.5F, -1.175F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3555F, 0.48F, -5.0251F, 3.004F, -0.1049F, -0.0336F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(136, 24).mirror().addBox(-0.45F, 1.15F, 0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3785F, 1.3937F, -7.8005F, -1.7346F, -0.1049F, -0.0336F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(98, 134).mirror().addBox(-0.6308F, -0.5852F, 0.2942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(134, 86).mirror().addBox(-0.4058F, -0.5852F, 0.2942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, 1.7429F, 0.0174F, -0.0174F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(136, 12).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0932F, 0.9173F, -2.1203F, 0.1309F, 0.0417F, 0.0267F));

		PartDefinition cube_r594 = rightFace.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(134, 83).mirror().addBox(-0.3514F, 0.4374F, -1.3852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, 1.0472F, 0.0417F, 0.0267F));

		PartDefinition cube_r595 = rightFace.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(104, 41).mirror().addBox(-0.3514F, -0.6129F, -1.9629F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, 1.7017F, 0.0417F, 0.0267F));

		PartDefinition cube_r596 = rightFace.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(48, 134).mirror().addBox(-0.3514F, -1.323F, -1.1677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, 2.2253F, 0.0417F, 0.0267F));

		PartDefinition cube_r597 = rightFace.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(120, 39).mirror().addBox(-0.3806F, -0.0515F, -1.0061F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, -1.5121F, 0.0174F, -0.0174F));

		PartDefinition cube_r598 = rightFace.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(136, 9).mirror().addBox(-0.3748F, -0.9553F, 0.1837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, 0.3466F, 0.0132F, -0.0208F));

		PartDefinition cube_r599 = rightFace.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(65, 121).mirror().addBox(-0.3748F, -0.0157F, -1.2711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, 1.3502F, 0.0132F, -0.0208F));

		PartDefinition cube_r600 = rightFace.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(136, 6).mirror().addBox(-0.3748F, -0.979F, 0.4783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, 0.9575F, 0.0132F, -0.0208F));

		PartDefinition cube_r601 = rightFace.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(136, 3).mirror().addBox(-0.3806F, -1.7336F, -0.8291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, -0.0024F, 0.0174F, -0.0174F));

		PartDefinition cube_r602 = rightFace.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(133, 123).mirror().addBox(-0.3806F, -1.5371F, -1.1654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0547F, 0.1685F, -2.5806F, -0.2206F, 0.0174F, -0.0174F));

		PartDefinition cube_r603 = rightFace.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(136, 0).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2754F, 3.1773F, 0.8277F, 0.2181F, 0.0356F, 0.0159F));

		PartDefinition cube_r604 = rightFace.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(134, 135).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2391F, 3.2203F, -0.1707F, 1.6144F, 0.0356F, 0.0159F));

		PartDefinition cube_r605 = rightFace.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(121, 61).mirror().addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2092F, 3.1024F, -1.0624F, 3.0107F, 0.0356F, 0.0159F));

		PartDefinition cube_r606 = rightFace.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(51, 121).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.1709F, 3.3182F, -2.0381F, -1.3527F, 0.0356F, 0.0159F));

		PartDefinition cube_r607 = rightFace.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(129, 135).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1709F, 3.3182F, -2.0381F, -0.2618F, 0.0356F, 0.0159F));

		PartDefinition cube_r608 = rightFace.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-0.5F, -2.075F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1932F, 1.1767F, -2.3697F, -0.0437F, 0.0356F, 0.0159F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(116, 72).addBox(0.5204F, 1.4045F, -7.2983F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0153F))
				.texOffs(116, 72).mirror().addBox(-1.5204F, 1.4045F, -7.2983F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0515F, 0.8826F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(117, 109).mirror().addBox(0.2F, -0.5653F, -2.2933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(117, 109).addBox(2.2407F, -0.5653F, -2.2933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.7203F, 0.063F, 0.142F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(63, 125).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(63, 125).addBox(1.5407F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0204F, -0.2691F, -6.268F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(9, 100).mirror().addBox(0.2F, -0.0187F, 0.0339F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 100).addBox(2.2407F, -0.0187F, 0.0339F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7203F, -0.455F, -4.3132F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(18, 137).mirror().addBox(-0.5F, -1.0F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 33).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(137, 33).addBox(1.5907F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(18, 137).addBox(1.5907F, -1.0F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0454F, 3.0798F, -5.783F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(123, 43).mirror().addBox(0.175F, -0.5553F, -5.4225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(123, 43).addBox(2.2657F, -0.5553F, -5.4225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.7203F, 1.563F, -0.5581F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 115).addBox(1.5407F, 0.0F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0204F, 0.2568F, -8.0871F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(123, 47).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.72F, 1.1906F, -9.8151F, 0.2145F, -0.1569F, -0.0083F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(84, 136).mirror().addBox(-0.8216F, 0.0529F, -1.8319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(136, 95).mirror().addBox(-0.8161F, -0.3495F, -0.686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(136, 98).mirror().addBox(-0.8161F, -0.4495F, -1.686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.663F, -9.758F, 0.2074F, -0.1306F, -0.0352F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(103, 136).mirror().addBox(-0.5855F, -0.6218F, -1.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 1.113F, -11.408F, 0.1198F, -0.1318F, -0.0306F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(136, 106).mirror().addBox(-0.349F, -0.5069F, -0.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 1.113F, -13.2081F, 0.0675F, -0.1318F, -0.0306F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(94, 72).mirror().addBox(-0.336F, -1.0009F, -1.1535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(121, 129).mirror().addBox(-0.336F, -1.1009F, -2.1535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(126, 129).mirror().addBox(-0.336F, -0.9009F, -3.1535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 1.413F, -13.2081F, -0.1002F, -0.0477F, -0.005F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(123, 55).mirror().addBox(-0.5909F, -0.0366F, -1.9126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 1.113F, -11.408F, 0.1155F, -0.1318F, -0.0306F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(118, 35).mirror().addBox(-0.3229F, -0.1448F, -1.9627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 1.413F, -13.2081F, -0.0429F, -0.0486F, 0.0056F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(35, 132).mirror().addBox(-0.3229F, -0.1053F, -2.8085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 1.413F, -13.2081F, -0.0604F, -0.0486F, 0.0056F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(10, 131).mirror().addBox(-0.8216F, 0.008F, -0.8651F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.663F, -9.758F, 0.251F, -0.1306F, -0.0352F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(117, 105).mirror().addBox(0.2F, -0.6655F, -0.5192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(117, 105).addBox(2.2407F, -0.6655F, -0.5192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.7203F, 0.263F, -0.258F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(74, 131).mirror().addBox(-0.5F, -2.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0156F)).mirror(false)
				.texOffs(74, 131).addBox(1.5407F, -2.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0156F)), PartPose.offsetAndRotation(-1.0204F, 2.8728F, -2.1161F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(91, 103).mirror().addBox(0.2F, -0.3871F, -1.6811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0146F)).mirror(false)
				.texOffs(91, 103).addBox(2.2407F, -0.3871F, -1.6811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0146F)), PartPose.offsetAndRotation(-1.7203F, 0.263F, -0.258F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(131, 75).mirror().addBox(-0.5F, -2.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(131, 75).addBox(1.5407F, -2.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-1.0204F, 3.1267F, -3.0309F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(115, 21).mirror().addBox(-0.5F, -1.075F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(115, 21).addBox(1.5407F, -1.075F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.0204F, 2.4135F, -4.8712F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(131, 12).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(131, 12).addBox(1.5407F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.0204F, 3.4045F, -7.1983F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(74, 116).mirror().addBox(-1.0748F, 0.5645F, -1.5154F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.663F, -8.0581F, -0.1564F, -0.1569F, -0.0083F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(123, 65).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-0.6185F, 2.4345F, -10.2447F, -0.1373F, -0.1306F, -0.0352F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(104, 98).mirror().addBox(-0.5F, -0.425F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4339F, 2.1883F, -11.7501F, -0.0329F, -0.1318F, -0.0306F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(115, 31).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-0.2006F, 2.1874F, -14.1705F, 0.0094F, -0.0486F, 0.0056F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(135, 63).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.1582F, 2.7149F, -15.1049F, -0.2785F, -0.0486F, 0.0056F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(40, 132).mirror().addBox(-0.5F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1158F, 1.9626F, -15.8899F, 0.7076F, -0.0486F, 0.0056F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(135, 66).mirror().addBox(-0.3229F, -1.2882F, -3.4058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 1.413F, -13.2081F, 0.3149F, -0.0486F, 0.0056F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(115, 26).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3278F, -4.8043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(32, 115).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3278F, -4.8043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(72, 121).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(72, 121).addBox(1.5407F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0204F, -0.4428F, -5.2832F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(79, 131).mirror().addBox(-0.5F, -2.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(79, 131).addBox(1.5407F, -2.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.0204F, 2.8728F, -2.1161F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(136, 15).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(136, 15).addBox(1.5407F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.0204F, 1.4961F, -0.6653F, -2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(32, 115).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3278F, -4.8043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(115, 26).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3278F, -4.8043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(135, 66).addBox(-0.6771F, -1.2882F, -3.4058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.4204F, 1.413F, -13.2081F, 0.3149F, 0.0486F, -0.0056F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(40, 132).addBox(-0.5F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1158F, 1.9626F, -15.8899F, 0.7076F, 0.0486F, -0.0056F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(135, 63).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.1582F, 2.7149F, -15.1049F, -0.2785F, 0.0486F, -0.0056F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(115, 31).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(0.2006F, 2.1874F, -14.1705F, 0.0094F, 0.0486F, -0.0056F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(104, 98).addBox(-0.5F, -0.425F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.4339F, 2.1883F, -11.7501F, -0.0329F, 0.1318F, 0.0306F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(123, 65).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(0.6185F, 2.4345F, -10.2447F, -0.1373F, 0.1306F, 0.0352F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(74, 116).addBox(0.0748F, 0.5645F, -1.5154F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.4204F, 0.663F, -8.0581F, -0.1564F, 0.1569F, 0.0083F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(10, 131).addBox(-0.1784F, 0.008F, -0.8651F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4204F, 0.663F, -9.758F, 0.251F, 0.1306F, 0.0352F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(35, 132).addBox(-0.6771F, -0.1053F, -2.8085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4204F, 1.413F, -13.2081F, -0.0604F, 0.0486F, -0.0056F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(118, 35).addBox(-0.6771F, -0.1448F, -1.9627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4204F, 1.413F, -13.2081F, -0.0429F, 0.0486F, -0.0056F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(123, 55).addBox(-0.409F, -0.0366F, -1.9126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4204F, 1.113F, -11.408F, 0.1155F, 0.1318F, 0.0306F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(126, 129).addBox(-0.664F, -0.9009F, -3.1535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(121, 129).addBox(-0.664F, -1.1009F, -2.1535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 72).addBox(-0.664F, -1.0009F, -1.1535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4204F, 1.413F, -13.2081F, -0.1002F, 0.0477F, 0.005F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(136, 106).addBox(-0.651F, -0.5069F, -0.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4204F, 1.113F, -13.2081F, 0.0675F, 0.1318F, 0.0306F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(103, 136).addBox(-0.4145F, -0.6218F, -1.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4204F, 1.113F, -11.408F, 0.1198F, 0.1318F, 0.0306F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(136, 98).addBox(-0.1839F, -0.4495F, -1.686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(136, 95).addBox(-0.1839F, -0.3495F, -0.686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(84, 136).addBox(-0.1784F, 0.0529F, -1.8319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4204F, 0.663F, -9.758F, 0.2074F, 0.1306F, 0.0352F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(123, 47).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.72F, 1.1906F, -9.8151F, 0.2145F, 0.1569F, 0.0083F));

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