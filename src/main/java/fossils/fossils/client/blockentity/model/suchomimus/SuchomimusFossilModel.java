package fossils.fossils.client.blockentity.model.suchomimus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SuchomimusFossilModel extends SkullModelBase {
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
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public SuchomimusFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -29.3697F, 4.4984F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 35).addBox(-0.003F, 0.0037F, -6.8779F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.7758F, 1.776F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, 0.1072F, -0.0906F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.8787F, 1.9856F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-0.6005F, 0.3005F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2318F, -3.2726F, 0.1712F, 0.1479F, -0.6302F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 20).addBox(-0.3995F, 0.3005F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2318F, -3.2726F, 0.1712F, -0.1479F, 0.6302F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -1.9822F, 0.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5438F, -2.9952F, 3.53F, 0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(100, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2691F, -2.7149F, 0.2572F, -0.7061F, -0.0116F, -0.4027F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(98, 59).addBox(-1.2232F, -0.337F, 1.9624F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.703F, -3.6575F, -3.6492F, -0.261F, -0.0116F, -0.4027F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5827F, 4.0931F, -6.8175F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9836F, 0.9136F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(7, 101).addBox(-1.2232F, -0.1647F, -0.0157F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.703F, -3.6575F, -3.6492F, -0.1738F, -0.0116F, -0.4027F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 75).addBox(-0.5F, -1.7F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0184F, 1.6096F, -0.1506F, -0.2011F, -0.0295F, -0.3607F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(117, 114).addBox(-0.5F, -2.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8848F, 1.4663F, 2.0547F, 0.0476F, -0.0351F, -0.3548F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(112, 118).addBox(-0.5F, -1.05F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.301F, -0.1544F, 1.6077F, -0.8687F, -0.0351F, -0.3548F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(79, 106).addBox(-0.6838F, -0.0435F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6679F, 0.6588F, 5.0944F, -0.5196F, -0.0351F, -0.3548F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(117, 48).addBox(-0.5F, -2.6F, -2.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6456F, 6.8657F, -7.0359F, -1.2833F, 0.0639F, 0.0248F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(45, 122).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7463F, 6.3612F, -2.2891F, 1.5206F, -0.0199F, 0.0571F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 117).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7967F, 5.4539F, -2.2162F, 0.5171F, -0.0199F, 0.0571F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(117, 127).addBox(-0.1176F, 0.4359F, -0.823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1644F, 9.0998F, 2.4776F, 0.0458F, -0.0199F, -0.0476F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(31, 120).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5809F, 9.4672F, 1.676F, 0.3949F, -0.0199F, -0.0476F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(33, 112).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5574F, 8.9819F, 1.6949F, -0.6436F, -0.0199F, -0.0476F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(104, 131).addBox(-0.1176F, 0.2413F, -0.7465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1644F, 9.0998F, 2.4776F, 0.7003F, -0.0199F, -0.0476F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(110, 71).addBox(-0.478F, -4.0908F, 0.0924F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5644F, 8.3998F, -0.1224F, 0.9447F, -0.0199F, 0.0571F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(117, 53).addBox(-0.5F, -3.075F, -1.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5027F, 8.4773F, -8.6458F, -0.4193F, 0.0639F, 0.0248F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 132).addBox(-0.5F, -2.375F, 3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4652F, 17.0981F, -14.2026F, 0.558F, 0.0639F, -0.1672F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(61, 129).addBox(-0.5F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9305F, 13.6494F, -12.1558F, 1.9105F, 0.0521F, -0.184F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(94, 127).addBox(-0.5F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9465F, 13.0067F, -11.5543F, 0.2962F, 0.0639F, -0.1672F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(132, 3).addBox(-0.5F, -2.075F, -1.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2243F, 15.1906F, -12.9528F, -0.8339F, 0.0639F, -0.1672F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(47, 117).addBox(-0.0049F, -0.0704F, -1.084F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2027F, 11.0773F, -10.2458F, -0.5066F, 0.0639F, -0.1672F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(80, 120).addBox(-0.1137F, -3.3179F, -1.508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1027F, 8.4773F, -8.8458F, -0.8118F, 0.06F, -0.103F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(52, 118).addBox(-0.1137F, -0.1179F, -0.958F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1027F, 8.4773F, -8.8458F, -0.5502F, 0.0639F, -0.1148F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 125).addBox(-0.5F, -3.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5911F, 6.5882F, -7.9951F, -0.5066F, 0.0639F, 0.0248F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(110, 50).addBox(-0.5F, 0.1F, 0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6196F, 2.8899F, -7.7032F, -0.1052F, 0.0639F, 0.0248F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 108).addBox(-0.5F, -1.275F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7012F, 2.6041F, -6.5384F, -0.2797F, 0.0639F, 0.0248F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(26, 103).addBox(-0.5F, 0.0F, -2.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0198F, 3.4136F, -1.2446F, -0.3234F, 0.0639F, 0.0248F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(111, 16).addBox(-0.5F, -1.4F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9774F, 2.5914F, -2.2255F, 0.0257F, 0.0639F, 0.0248F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 32).addBox(-0.3844F, -0.1139F, -1.8767F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7319F, 1.3702F, -4.7266F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(108, 6).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8808F, 0.9259F, -7.4613F, 1.7059F, -0.2702F, -0.4046F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1884F, 0.2001F, -9.5134F, 2.0899F, -0.2702F, -0.4046F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(86, 107).addBox(-0.5F, 1.0F, -2.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5945F, 0.0555F, -11.0666F, 2.0026F, -0.2702F, -0.4046F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(14, 120).addBox(-0.5F, 0.0F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8676F, -0.7697F, -9.9778F, 1.3087F, -0.2932F, -0.41F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(6, 121).addBox(-0.5F, -0.825F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4566F, -0.9383F, -8.9518F, 1.0905F, -0.2932F, -0.41F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(89, 118).addBox(-1.0314F, -0.0108F, -1.0778F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3812F, -2.557F, -9.0211F, 1.1603F, -0.2932F, -0.41F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(19, 99).addBox(-0.2F, 0.3371F, -2.1201F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2578F, -3.3205F, -6.5201F, 0.2396F, -0.1105F, -0.3573F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(118, 37).addBox(-0.55F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0415F, -1.3687F, -7.9367F, 0.5714F, -0.2702F, -0.4046F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(57, 86).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0241F, -3.5203F, -3.5984F, 0.1624F, 0.0089F, -0.4028F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5438F, -5.9788F, 3.8436F, 0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(100, 28).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2691F, 0.2687F, -0.0564F, -0.7061F, 0.0116F, 0.4027F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(98, 59).mirror().addBox(0.2232F, -0.337F, 1.9624F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -0.6739F, -3.9628F, -0.261F, 0.0116F, 0.4027F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.4173F, 4.0931F, -6.8175F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(7, 101).mirror().addBox(0.2232F, -0.1647F, -0.0157F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -0.6739F, -3.9628F, -0.1738F, 0.0116F, 0.4027F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(13, 75).mirror().addBox(-0.5F, -1.7F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0184F, 4.5932F, -0.4642F, -0.2011F, 0.0295F, 0.3607F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(117, 114).mirror().addBox(-0.5F, -2.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8848F, 4.4499F, 1.7412F, 0.0476F, 0.0351F, 0.3548F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(112, 118).mirror().addBox(-0.5F, -1.05F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.301F, 2.8291F, 1.2941F, -0.8687F, 0.0351F, 0.3548F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(79, 106).mirror().addBox(-0.3162F, -0.0435F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6679F, 3.6424F, 4.7808F, -0.5196F, 0.0351F, 0.3548F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(117, 48).mirror().addBox(-0.5F, -2.6F, -2.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6456F, 9.8493F, -7.3495F, -1.2833F, -0.0639F, -0.0248F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(45, 122).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7463F, 9.3448F, -2.6027F, 1.5206F, 0.0199F, -0.0571F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(21, 117).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7967F, 8.4375F, -2.5298F, 0.5171F, 0.0199F, -0.0571F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(117, 127).mirror().addBox(-0.8824F, 0.4359F, -0.823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1644F, 12.0833F, 2.164F, 0.0458F, 0.0199F, 0.0476F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(31, 120).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5809F, 12.4508F, 1.3624F, 0.3949F, 0.0199F, 0.0476F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(33, 112).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5574F, 11.9655F, 1.3813F, -0.6436F, 0.0199F, 0.0476F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(104, 131).mirror().addBox(-0.8824F, 0.2413F, -0.7465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1644F, 12.0833F, 2.164F, 0.7003F, 0.0199F, 0.0476F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(110, 71).mirror().addBox(-0.522F, -4.0908F, 0.0924F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 11.3833F, -0.436F, 0.9447F, 0.0199F, -0.0571F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(117, 53).mirror().addBox(-0.5F, -3.075F, -1.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5027F, 11.4609F, -8.9594F, -0.4193F, -0.0639F, -0.0248F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 132).mirror().addBox(-0.5F, -2.375F, 3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4652F, 20.0816F, -14.5161F, 0.558F, -0.0639F, 0.1672F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(61, 129).mirror().addBox(-0.5F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9305F, 16.633F, -12.4694F, 1.9105F, -0.0521F, 0.184F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(94, 127).mirror().addBox(-0.5F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9465F, 15.9903F, -11.8679F, 0.2962F, -0.0639F, 0.1672F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(132, 3).mirror().addBox(-0.5F, -2.075F, -1.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2243F, 18.1741F, -13.2664F, -0.8339F, -0.0639F, 0.1672F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(47, 117).mirror().addBox(-0.9951F, -0.0704F, -1.084F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2027F, 14.0609F, -10.5594F, -0.5066F, -0.0639F, 0.1672F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(80, 120).mirror().addBox(-0.8863F, -3.3179F, -1.508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1027F, 11.4609F, -9.1594F, -0.8118F, -0.06F, 0.103F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(52, 118).mirror().addBox(-0.8863F, -0.1179F, -0.958F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1027F, 11.4609F, -9.1594F, -0.5502F, -0.0639F, 0.1148F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(5, 125).mirror().addBox(-0.5F, -3.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5911F, 9.5718F, -8.3087F, -0.5066F, -0.0639F, -0.0248F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(110, 50).mirror().addBox(-0.5F, 0.1F, 0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6196F, 5.8735F, -8.0168F, -0.1052F, -0.0639F, -0.0248F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(7, 108).mirror().addBox(-0.5F, -1.275F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7012F, 5.5877F, -6.852F, -0.2797F, -0.0639F, -0.0248F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(26, 103).mirror().addBox(-0.5F, 0.0F, -2.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0198F, 6.3972F, -1.5582F, -0.3234F, -0.0639F, -0.0248F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(111, 16).mirror().addBox(-0.5F, -1.4F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9774F, 5.575F, -2.5391F, 0.0257F, -0.0639F, -0.0248F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(78, 32).mirror().addBox(-0.6156F, -0.1139F, -1.8767F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 4.3537F, -5.0402F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(108, 6).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8808F, 3.9095F, -7.7749F, 1.7059F, 0.2702F, 0.4046F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1884F, 3.1836F, -9.827F, 2.0899F, 0.2702F, 0.4046F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(86, 107).mirror().addBox(-0.5F, 1.0F, -2.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5945F, 3.0391F, -11.3801F, 2.0026F, 0.2702F, 0.4046F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(14, 120).mirror().addBox(-0.5F, 0.0F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8676F, 2.2138F, -10.2914F, 1.3087F, 0.2932F, 0.41F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(6, 121).mirror().addBox(-0.5F, -0.825F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4566F, 2.0453F, -9.2654F, 1.0905F, 0.2932F, 0.41F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(89, 118).mirror().addBox(0.0314F, -0.0108F, -1.0778F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3812F, 0.4266F, -9.3346F, 1.1603F, 0.2932F, 0.41F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(19, 99).mirror().addBox(-0.8F, 0.3371F, -2.1201F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2578F, -0.337F, -6.8337F, 0.2396F, 0.1105F, 0.3573F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(118, 37).mirror().addBox(-0.45F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0415F, 1.6149F, -8.2503F, 0.5714F, 0.2702F, 0.4046F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(57, 86).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0241F, -0.5367F, -3.9119F, 0.1624F, -0.0089F, 0.4028F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.9707F, -0.6263F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(46, 90).addBox(-1.5F, -2.3F, -0.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 13.3966F, 1.7691F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(94, 102).addBox(-1.0F, -6.0F, -0.9F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 12.907F, 1.1734F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(82, 116).addBox(-5.1F, 0.0534F, -0.0182F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.6F, 11.1782F, -0.4422F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(121, 110).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 5.3358F, 1.4835F, -2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(121, 106).addBox(-0.5F, 0.075F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 5.319F, 1.5118F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(7, 93).addBox(-1.0F, -3.5F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, 7.0649F, 0.4332F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(115, 73).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 1.9723F, -1.1085F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(116, 29).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, 3.5654F, 0.4605F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(96, 66).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 5.5888F, 0.0659F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(72, 105).addBox(-1.0F, -2.0F, -0.775F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 9.3123F, 0.3801F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(89, 36).addBox(-1.5F, -1.7F, -0.85F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.75F, -0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(104, 20).addBox(-1.0F, -3.5F, -0.175F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 3.2271F, 0.3004F, 0.0611F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 13.9401F, 1.4396F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(90, 77).addBox(-1.0F, -0.5F, -1.45F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, 0.7808F, -0.6378F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(104, 84).addBox(-1.0F, -1.45F, -1.175F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 0.5374F, -1.3651F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(99, 8).addBox(-0.1F, -1.0F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(26, 75).addBox(-1.0F, -2.2F, -0.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 12.3329F, -0.8588F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(40, 115).addBox(-1.0F, -1.6F, -0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 9.8455F, -0.6038F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(75, 97).addBox(-0.1F, 0.0F, -1.15F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.2F, 4.7282F, 0.8127F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(82, 98).addBox(-0.1F, -2.5F, -0.325F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 3.2079F, 0.3786F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(39, 79).addBox(-1.1F, -7.0F, -0.225F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(110, 55).addBox(-1.1F, -0.2726F, -1.3625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.4F, 0.1471F, 0.7883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(36, 91).addBox(-0.5F, -9.0F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8F, 10.3536F, -0.3089F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(66, 86).addBox(-1.0F, 0.0553F, -0.5239F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6856F, -0.5911F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(120, 81).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 3.5425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r107 = rightLeg3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(118, 16).addBox(0.2966F, -1.5522F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 2.0553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(69, 22).addBox(-1.5F, -0.0746F, -2.9368F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 5.7545F, 0.1648F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(57, 32).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7216F, -2.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.9707F, -0.6263F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg1.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(92, 13).addBox(-1.5F, -2.3F, -0.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 13.3966F, 1.7691F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg1.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(101, 102).addBox(-1.0F, -6.0F, -0.9F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 12.907F, 1.1734F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(116, 94).addBox(3.1F, 0.0534F, -0.0182F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.6F, 11.1782F, -0.4422F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(19, 122).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 5.3358F, 1.4835F, -2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(122, 4).addBox(-0.5F, 0.075F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 5.319F, 1.5118F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -3.5F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.5F, 7.0649F, 0.4332F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(75, 115).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 1.9723F, -1.1085F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(116, 33).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.5F, 3.5654F, 0.4605F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(97, 20).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 5.5888F, 0.0659F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(106, 0).addBox(-1.0F, -2.0F, -0.775F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 9.3123F, 0.3801F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(89, 54).addBox(-1.5F, -1.7F, -0.85F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.75F, -0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(65, 105).addBox(-1.0F, -3.5F, -0.175F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 3.2271F, 0.3004F, 0.0611F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 13.9401F, 1.4396F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(75, 92).addBox(-1.0F, -0.5F, -1.45F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 0.7808F, -0.6378F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(105, 61).addBox(-1.0F, -1.45F, -1.175F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 0.5374F, -1.3651F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(33, 102).addBox(-1.9F, -1.0F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(104, 88).addBox(-1.0F, -2.2F, -0.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 12.3329F, -0.8588F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(115, 69).addBox(-1.0F, -1.6F, -0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 9.8455F, -0.6038F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(97, 84).addBox(-1.9F, 0.0F, -1.15F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.2F, 4.7282F, 0.8127F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(99, 0).addBox(-1.9F, -2.5F, -0.325F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 3.2079F, 0.3786F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 83).addBox(-0.9F, -7.0F, -0.225F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(14, 111).addBox(0.1F, -0.2726F, -1.3625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-2.4F, 0.1471F, 0.7883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(41, 91).addBox(-0.5F, -9.0F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8F, 10.3536F, -0.3089F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(88, 22).addBox(-2.0F, 0.0553F, -0.5239F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6856F, -0.5911F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(120, 102).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 3.5425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r131 = leftLeg3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(26, 118).addBox(-1.2966F, -1.5522F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 2.0553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(69, 27).addBox(-4.5F, -0.0746F, -2.9368F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 5.7545F, 0.1648F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(19, 60).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7216F, -2.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2862F, 7.5002F, -0.2646F, -0.0194F, 0.0956F));

		PartDefinition cube_r132 = tail1.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(122, 120).addBox(0.0F, 0.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4381F, 8.8381F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r133 = tail1.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(57, 118).addBox(0.0F, 0.036F, -0.483F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7706F, 1.1245F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail1.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(33, 93).addBox(0.5F, -0.2129F, -0.6754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2937F, 4.2236F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r135 = tail1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(3, 119).addBox(0.5F, 0.1871F, -0.5754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2555F, 6.7132F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail1.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(100, 47).addBox(0.5F, -5.8073F, -0.1162F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6524F, 5.9587F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(89, 98).addBox(0.5F, -6.1323F, -0.0162F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4066F, 2.8685F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(14, 93).addBox(0.5F, -6.3823F, -1.2162F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2653F, 1.074F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(34, 51).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1484F, 1.0289F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r140 = tail1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(34, 51).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1484F, 1.0289F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r141 = tail1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(27, 23).addBox(0.0F, -1.9F, -0.9F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.7562F, 1.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5126F, 8.8379F, 0.0175F, -0.0436F, -0.0008F));

		PartDefinition cube_r142 = tail.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(48, 23).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2382F, 1.9544F, 0.1575F, 0.069F, 0.0109F));

		PartDefinition cube_r143 = tail.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(48, 23).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.2382F, 1.9544F, 0.1575F, -0.069F, -0.0109F));

		PartDefinition cube_r144 = tail.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(15, 46).addBox(0.0F, -1.9F, 8.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.2308F, -7.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(11, 121).addBox(0.0F, 0.8F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.748F, 7.0799F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(85, 120).addBox(0.0F, 0.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0636F, 4.7429F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(36, 120).addBox(0.0F, 0.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.703F, 2.7675F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(108, 102).addBox(0.5F, -3.7205F, -0.0226F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6867F, 5.7705F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(105, 45).addBox(0.5F, -4.0823F, -0.0162F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.4832F, 2.8025F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(14, 103).addBox(0.5F, -5.0823F, -0.1162F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.7285F, -0.136F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.6624F, 7.8232F, 0.1048F, -0.0434F, -0.0046F));

		PartDefinition cube_r151 = tail2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(114, 122).addBox(0.0F, -3.3295F, 0.0466F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 6.946F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(111, 122).addBox(0.0F, -3.3134F, 0.0872F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 4.946F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(108, 122).addBox(0.0F, -3.1553F, -0.9425F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 3.946F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(105, 122).addBox(0.0F, -3.2811F, 0.0684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(55, 51).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(102, 122).addBox(0.0F, 0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3862F, 1.7446F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(122, 68).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1005F, 6.0433F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(122, 48).addBox(0.0F, 0.2F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.9F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4564F, 0.0304F, 0.0175F, 0.0698F, 0.0012F));

		PartDefinition cube_r160 = tail2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 67).addBox(-0.1F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4564F, 0.0304F, 0.0175F, -0.0698F, -0.0012F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.073F, 0.0838F, 0.0495F));

		PartDefinition cube_r161 = tail8.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail8.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(125, 129).addBox(0.0F, -0.0727F, -0.1208F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7093F, 8.2722F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail8.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(122, 129).addBox(0.0F, 0.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0617F, 6.0009F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail8.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(129, 72).addBox(0.0F, 0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0245F, 3.9397F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail8.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 119).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0846F, 1.901F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail8.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(122, 114).addBox(0.0F, -0.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.1152F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail8.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(66, 129).addBox(0.0F, -3.1039F, -0.1697F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 6.8984F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail8.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(20, 129).addBox(0.0F, -3.088F, -0.0904F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 4.8984F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail8.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(114, 128).addBox(0.0F, -3.172F, -0.111F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 2.8984F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail8.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(80, 128).addBox(0.0F, -3.2561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 0.8984F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0613F, 0.0871F, 0.0053F));

		PartDefinition cube_r171 = tail3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(80, 133).addBox(0.0F, 0.9F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4364F, 6.8875F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(42, 102).addBox(0.0F, 0.7F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2488F, 5.1861F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(34, 130).addBox(0.0F, -0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1036F, 3.2148F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(36, 86).addBox(0.0F, -0.1F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5866F, 1.2549F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(130, 27).addBox(0.0F, -2.7191F, -0.0835F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9252F, 7.9853F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(26, 130).addBox(0.0F, -2.6628F, -0.0984F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9252F, 5.9853F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(23, 130).addBox(0.0F, -2.7628F, -0.1984F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8613F, 4.0447F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(130, 16).addBox(0.0F, -2.8628F, -0.1984F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6769F, 2.0283F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(128, 129).addBox(0.0F, -2.7128F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(21, 35).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, 0.0354F, -0.1744F, -0.0062F));

		PartDefinition cube_r181 = tail9.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail9.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(20, 134).addBox(0.0F, 0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.152F, 4.4886F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail9.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(10, 134).addBox(0.0F, 0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3096F, 2.4724F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail9.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(119, 133).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5646F, 0.4787F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail9.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(69, 130).addBox(0.0F, -2.625F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4878F, 2.979F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail9.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(130, 39).addBox(0.0F, -2.375F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4878F, 2.979F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail9.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(37, 130).addBox(0.0F, -2.575F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2754F, 0.9678F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.124F, -0.1732F, -0.0215F));

		PartDefinition cube_r188 = tail4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(75, 134).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3366F, 5.4774F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(35, 135).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3471F, 3.2842F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(65, 134).addBox(0.0F, 0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3407F, 0.6883F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(134, 51).addBox(0.0F, -2.15F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0251F, 5.0092F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(36, 66).addBox(0.0F, -2.025F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.184F, 3.0202F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(29, 134).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.393F, 1.0311F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(74, 58).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(26, 79).addBox(-0.5F, -0.5698F, -0.0226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3107F, 5.9946F, -0.0088F, -0.1309F, 0.0011F));

		PartDefinition cube_r195 = tail5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(108, 134).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6799F, 3.8014F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(105, 134).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8815F, 1.6667F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(102, 134).addBox(0.0F, -1.925F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 134).addBox(0.0F, -1.725F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4872F, 1.0777F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 4.8774F, -0.0268F, -0.2181F, 0.0058F));

		PartDefinition cube_r198 = tail6.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(134, 55).addBox(0.0F, -1.4F, 1.925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 9).addBox(0.0F, -1.2F, -0.075F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1417F, 4.0393F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail6.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(125, 134).addBox(0.0F, -1.6F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3585F, 1.9891F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail6.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(122, 134).addBox(0.0F, -1.6F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1842F, -0.0033F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail6.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(41, 135).addBox(0.0F, 2.2F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 135).addBox(0.0F, 1.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 134).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9931F, 1.0342F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(52, 10).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0613F, -0.0871F, 0.0053F));

		PartDefinition cube_r202 = tail7.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(135, 21).addBox(0.0F, -1.125F, 0.15F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5157F, -0.3105F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(19, 66).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0107F, 8.0156F, -0.1584F, -0.1293F, 0.0206F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4925F, 8.6858F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(28, 93).addBox(-0.5F, -6.5105F, -1.1178F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.169F, -1.7704F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(95, 92).addBox(-0.5F, -6.0522F, -0.0114F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4213F, -5.8697F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(70, 70).addBox(-1.0F, 0.0F, 2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(57, 38).addBox(-3.5F, -2.5F, -2.0F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.2711F, -4.4395F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(90, 82).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, -0.033F, 0.0923F, -1.5202F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.0244F, 0.095F, -0.9241F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(124, 66).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.0623F, 0.0757F, -0.4866F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(91, 68).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, -0.0258F, 0.0833F, -1.675F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(103, 71).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, 0.0253F, 0.0834F, -1.0794F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(90, 84).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, 0.0583F, 0.0649F, -0.6423F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(90, 82).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, -0.033F, -0.0923F, 1.5202F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(125, 0).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.0244F, -0.095F, 0.9241F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(124, 66).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.0623F, -0.0757F, 0.4866F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(91, 68).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, -0.0258F, -0.0833F, 1.675F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(103, 71).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, 0.0253F, -0.0834F, 1.0794F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(90, 84).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, 0.0583F, -0.0649F, 0.6423F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(60, 100).addBox(0.0F, -5.8122F, -1.0627F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0807F, -1.9945F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(105, 53).addBox(0.0F, -4.7617F, 0.1386F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -9.195F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(55, 100).addBox(0.0F, -5.2867F, 0.0386F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -6.0951F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(123, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1079F, 0.0627F, -0.4155F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(122, 74).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0713F, 0.1024F, -0.8515F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(75, 20).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0016F, 0.1247F, -1.4485F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(31, 11).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0485F, 0.2924F, -1.3568F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(122, 56).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.2059F, 0.2147F, -0.7483F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(122, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.2762F, 0.1089F, -0.3191F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(121, 62).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.1955F, 0.0743F, -0.3609F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(118, 42).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.1464F, 0.1498F, -0.7936F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0369F, 0.2058F, -1.3942F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(123, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1079F, -0.0627F, 0.4155F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.042F, -8.0086F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.2721F, -0.2559F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(122, 74).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0713F, -0.1024F, 0.8515F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(75, 20).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0016F, -0.1247F, 1.4485F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(31, 11).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0485F, -0.2924F, 1.3568F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(122, 56).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.2059F, -0.2147F, 0.7483F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(122, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.2762F, -0.1089F, 0.3191F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(121, 62).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.1955F, -0.0743F, 0.3609F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(118, 42).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.1464F, -0.1498F, 0.7936F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(71, 18).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0369F, -0.2058F, 1.3942F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0088F, -8.9481F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(19, 93).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.0391F, -2.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(94, 118).addBox(0.0F, -4.5525F, -1.1399F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7172F, -0.8517F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(123, 33).addBox(0.0F, -3.7967F, -0.0424F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -3.9368F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(51, 70).addBox(-3.4872F, -0.5232F, -1.3076F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 10.4298F, -11.2946F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.0502F, 0.234F, -1.3785F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(123, 31).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.1734F, 0.1657F, -0.7766F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(123, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.2265F, 0.0777F, -0.3458F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(24, 123).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -5.3368F, 0.2135F, 0.0657F, -0.3109F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(123, 22).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -5.3368F, 0.1665F, 0.1494F, -0.7418F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(57, 46).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -5.3368F, 0.0539F, 0.2168F, -1.3418F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(123, 20).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.196F, 0.0675F, -0.3279F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(123, 18).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.1497F, 0.1437F, -0.7601F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.0432F, 0.2026F, -1.3599F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(57, 48).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3109F, -1.4368F, 0.0282F, 0.1798F, -1.3095F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(24, 125).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3109F, -1.4368F, 0.1245F, 0.1331F, -0.7103F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(125, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3109F, -1.4368F, 0.1688F, 0.0684F, -0.2765F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(71, 16).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.0502F, -0.234F, 1.3785F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(123, 31).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.1734F, -0.1657F, 0.7766F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(123, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.2265F, -0.0777F, 0.3458F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(130, 77).addBox(0.0F, -2.8927F, -0.1837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -7.7368F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(24, 123).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -5.3368F, 0.2135F, -0.0657F, 0.3109F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(123, 22).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -5.3368F, 0.1665F, -0.1494F, 0.7418F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(57, 46).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -5.3368F, 0.0539F, -0.2168F, 1.3418F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(123, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.196F, -0.0675F, 0.3279F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(123, 18).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.1497F, -0.1437F, 0.7601F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(52, 20).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.0432F, -0.2026F, 1.3599F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(57, 48).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3109F, -1.4368F, 0.0282F, -0.1798F, 1.3095F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(24, 125).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3109F, -1.4368F, 0.1245F, -0.1331F, 0.7103F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(27, 13).addBox(-3.0F, -2.944F, -6.2059F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.5313F, -1.1387F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(125, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3109F, -1.4368F, 0.1688F, -0.0684F, 0.2765F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(72, 130).addBox(0.0F, -3.3927F, -0.1837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -5.7368F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(90, 18).mirror().addBox(-4.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0666F, 10.3734F, -11.2355F, -1.2584F, 1.2062F, 0.0719F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(74, 68).mirror().addBox(-6.7F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7307F, 10.5961F, -10.9579F, -0.8513F, 1.1939F, -0.1615F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(71, 14).mirror().addBox(-9.0F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.47F, 10.8722F, -10.8509F, -0.2295F, 1.2049F, -0.1577F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(90, 18).addBox(-0.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0666F, 10.3734F, -11.2355F, -1.2584F, -1.2062F, -0.0719F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(74, 68).addBox(-0.3F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7307F, 10.5961F, -10.9579F, -0.8513F, -1.1939F, 0.1615F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(71, 14).addBox(0.0F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.47F, 10.8722F, -10.8509F, -0.2295F, -1.2049F, 0.1577F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(71, 8).addBox(-2.4872F, -1.0174F, -3.8727F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 10.2994F, -12.7204F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(36, 70).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.0609F, -3.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6102F, 5.4062F, -7.7163F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r280 = bone2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(102, 40).addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1954F, -2.4726F, -1.2297F, 0.7985F, -0.0172F, -0.0029F));

		PartDefinition cube_r281 = bone2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(0, 115).addBox(-0.5F, -0.65F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1559F, -3.7822F, 0.846F, 0.624F, -0.0172F, -0.0029F));

		PartDefinition cube_r282 = bone2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(131, 107).addBox(-0.5F, -0.225F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1493F, -4.3077F, 1.1389F, -0.6937F, -0.0172F, -0.0029F));

		PartDefinition cube_r283 = bone2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(131, 104).addBox(-0.1914F, -4.0124F, 2.1071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, -0.1701F, -0.0172F, -0.0029F));

		PartDefinition cube_r284 = bone2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(75, 86).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1368F, -4.5338F, 0.6144F, 0.7811F, -0.0041F, -0.017F));

		PartDefinition cube_r285 = bone2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(65, 125).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5891F, 1.7612F, -4.1827F, 0.0145F, 0.2395F, 0.2828F));

		PartDefinition cube_r286 = bone2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(97, 118).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8225F, 1.2917F, -5.6372F, 1.0181F, 0.2395F, 0.2828F));

		PartDefinition cube_r287 = bone2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(116, 90).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4766F, 0.5862F, -5.0833F, -0.0291F, 0.2395F, 0.2828F));

		PartDefinition cube_r288 = bone2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(126, 24).addBox(0.3984F, 1.4402F, -3.8562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(131, 129).addBox(0.3984F, 0.7402F, -3.1812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, 0.32F, 0.2395F, 0.2828F));

		PartDefinition cube_r289 = bone2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(89, 127).addBox(-0.5F, 0.025F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8007F, 0.7363F, -6.1861F, 1.3672F, 0.2395F, 0.2828F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(68, 115).addBox(-0.2047F, -0.2524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, 0.925F, -0.0017F, -0.0174F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(61, 115).addBox(-0.2047F, 0.1726F, -2.054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.106F, -2.1396F, -2.5886F, 0.8901F, -0.0017F, -0.0174F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(7, 117).addBox(-0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0804F, 0.3256F, -3.8229F, 0.9745F, 0.2395F, 0.2828F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(116, 98).addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0804F, 0.3256F, -3.8229F, 0.669F, 0.2395F, 0.2828F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(26, 109).addBox(-1.0F, -0.275F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7819F, 3.2781F, -4.2873F, -0.8597F, 0.4723F, 0.7887F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(89, 59).addBox(-1.0F, -0.675F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7819F, 3.2781F, -4.2873F, -0.3935F, 0.5549F, 0.6721F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6102F, 5.4062F, -7.7163F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r296 = bone4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(102, 40).mirror().addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1954F, -2.4726F, -1.2297F, 0.7985F, 0.0172F, 0.0029F));

		PartDefinition cube_r297 = bone4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-0.5F, -0.65F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1559F, -3.7822F, 0.846F, 0.624F, 0.0172F, 0.0029F));

		PartDefinition cube_r298 = bone4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(131, 107).mirror().addBox(-0.5F, -0.225F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1493F, -4.3077F, 1.1389F, -0.6937F, 0.0172F, 0.0029F));

		PartDefinition cube_r299 = bone4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(131, 104).mirror().addBox(-0.8086F, -4.0124F, 2.1071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, -0.1701F, 0.0172F, 0.0029F));

		PartDefinition cube_r300 = bone4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(75, 86).mirror().addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, -4.5338F, 0.6144F, 0.7811F, 0.0041F, 0.017F));

		PartDefinition cube_r301 = bone4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(65, 125).mirror().addBox(-0.5F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5891F, 1.7612F, -4.1827F, 0.0145F, -0.2395F, -0.2828F));

		PartDefinition cube_r302 = bone4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(97, 118).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8225F, 1.2917F, -5.6372F, 1.0181F, -0.2395F, -0.2828F));

		PartDefinition cube_r303 = bone4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(116, 90).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4766F, 0.5862F, -5.0833F, -0.0291F, -0.2395F, -0.2828F));

		PartDefinition cube_r304 = bone4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(126, 24).mirror().addBox(-1.3984F, 1.4402F, -3.8562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(131, 129).mirror().addBox(-1.3984F, 0.7402F, -3.1812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, 0.32F, -0.2395F, -0.2828F));

		PartDefinition cube_r305 = bone4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(89, 127).mirror().addBox(-0.5F, 0.025F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 0.7363F, -6.1861F, 1.3672F, -0.2395F, -0.2828F));

		PartDefinition cube_r306 = bone4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(68, 115).mirror().addBox(-0.7953F, -0.2524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, 0.925F, 0.0017F, 0.0174F));

		PartDefinition cube_r307 = bone4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(61, 115).mirror().addBox(-0.7953F, 0.1726F, -2.054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.106F, -2.1396F, -2.5886F, 0.8901F, 0.0017F, 0.0174F));

		PartDefinition cube_r308 = bone4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(7, 117).mirror().addBox(-0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0804F, 0.3256F, -3.8229F, 0.9745F, -0.2395F, -0.2828F));

		PartDefinition cube_r309 = bone4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(116, 98).mirror().addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0804F, 0.3256F, -3.8229F, 0.669F, -0.2395F, -0.2828F));

		PartDefinition cube_r310 = bone4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(26, 109).mirror().addBox(0.0F, -0.275F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7819F, 3.2781F, -4.2873F, -0.8597F, -0.4723F, -0.7887F));

		PartDefinition cube_r311 = bone4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(0.0F, -0.675F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7819F, 3.2781F, -4.2873F, -0.3935F, -0.5549F, -0.6721F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9223F, 8.9307F, -11.0473F, -0.2447F, 0.009F, -0.7184F));

		PartDefinition cube_r312 = leftArm1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(107, 26).addBox(-0.5F, -0.7F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0477F, -0.3832F, 1.0677F, -0.889F, -0.7676F, 0.1498F));

		PartDefinition cube_r313 = leftArm1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(121, 25).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 129).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9305F, -1.1073F, 0.2752F, 0.036F, -0.7676F, 0.1498F));

		PartDefinition cube_r314 = leftArm1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(10, 128).addBox(-0.5F, -0.7F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8641F, -0.2374F, 0.2086F, -0.7494F, -0.7676F, 0.1498F));

		PartDefinition cube_r315 = leftArm1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(19, 106).addBox(-0.5F, -0.7F, -1.475F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.2782F, -0.7676F, 0.1498F));

		PartDefinition cube_r316 = leftArm1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(102, 118).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(126, 36).addBox(-0.5F, 1.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r317 = leftArm1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(111, 40).addBox(-0.5F, -0.45F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 5.5736F, 0.2189F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r318 = leftArm1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(126, 111).addBox(-0.5F, -0.575F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1559F, 0.7108F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r319 = leftArm1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(119, 64).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.3104F, 1.0406F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r320 = leftArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(65, 119).addBox(-0.5F, -0.9F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.0954F, 0.8866F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftArm1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(60, 119).addBox(-0.5F, -1.0F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 4.0954F, 0.8866F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r322 = leftArm1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(40, 119).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.2587F, 1.1502F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(21, 28).addBox(-0.8F, -0.4307F, 0.1266F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 40).addBox(-0.8F, 0.3693F, -1.1734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2671F, 6.7296F, 1.0221F, -1.0946F, -0.1699F, 0.5465F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.072F, 4.6427F, 0.416F, 0.0869F, -0.0076F, 0.2615F));

		PartDefinition cube_r323 = leftHand.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(7, 83).addBox(0.0F, -2.5F, -0.2F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r324 = leftHand.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(0, 103).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2031F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9223F, 8.9307F, -11.0473F, 0.2481F, -0.0884F, 0.7512F));

		PartDefinition cube_r325 = rightArm1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(33, 107).addBox(-0.5F, -0.7F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0477F, -0.3832F, 1.0677F, -0.889F, 0.7676F, -0.1498F));

		PartDefinition cube_r326 = rightArm1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(121, 58).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 129).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9305F, -1.1073F, 0.2752F, 0.036F, 0.7676F, -0.1498F));

		PartDefinition cube_r327 = rightArm1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(15, 129).addBox(-0.5F, -0.7F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8641F, -0.2374F, 0.2086F, -0.7494F, 0.7676F, -0.1498F));

		PartDefinition cube_r328 = rightArm1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(42, 106).addBox(-0.5F, -0.7F, -1.475F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.2782F, 0.7676F, -0.1498F));

		PartDefinition cube_r329 = rightArm1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(107, 118).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(126, 58).addBox(-0.5F, 1.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r330 = rightArm1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(68, 111).addBox(-0.5F, -0.45F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 5.5736F, 0.2189F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightArm1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(127, 4).addBox(-0.5F, -0.575F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1559F, 0.7108F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightArm1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(117, 119).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.3104F, 1.0406F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightArm1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(119, 77).addBox(-0.5F, -0.9F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.0954F, 0.8866F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightArm1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(75, 119).addBox(-0.5F, -1.0F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 4.0954F, 0.8866F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightArm1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(70, 119).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.2587F, 1.1502F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(49, 106).addBox(-0.2F, -0.4307F, 0.1266F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 111).addBox(-0.2F, 0.3693F, -1.1734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2671F, 6.7296F, 1.0221F, -1.6628F, 0.5579F, -0.8074F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.072F, 4.6427F, 0.416F, 0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r336 = rightHand.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(16, 83).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightHand.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(103, 13).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2031F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0302F, -8.7672F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r338 = neck1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(130, 82).addBox(0.0F, -2.3459F, -0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3256F, -2.8971F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r339 = neck1.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(128, 134).addBox(0.0F, -2.5459F, -0.016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -0.8666F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r340 = neck1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(19, 57).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.0743F, 0.7203F, -1.5282F));

		PartDefinition cube_r341 = neck1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(67, 123).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.5058F, 0.5418F, -0.8195F));

		PartDefinition cube_r342 = neck1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(60, 123).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.6703F, 0.2962F, -0.4226F));

		PartDefinition cube_r343 = neck1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(50, 123).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.5712F, 0.2155F, -0.3528F));

		PartDefinition cube_r344 = neck1.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(123, 39).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.4414F, 0.4302F, -0.7547F));

		PartDefinition cube_r345 = neck1.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(74, 66).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.1075F, 0.5979F, -1.4129F));

		PartDefinition cube_r346 = neck1.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(19, 57).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.0743F, -0.7203F, 1.5282F));

		PartDefinition cube_r347 = neck1.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(67, 123).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.5058F, -0.5418F, 0.8195F));

		PartDefinition cube_r348 = neck1.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(60, 123).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.6703F, -0.2962F, 0.4226F));

		PartDefinition cube_r349 = neck1.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(50, 123).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.5712F, -0.2155F, 0.3528F));

		PartDefinition cube_r350 = neck1.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(123, 39).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.4414F, -0.4302F, 0.7547F));

		PartDefinition cube_r351 = neck1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(74, 66).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.1075F, -0.5979F, 1.4129F));

		PartDefinition cube_r352 = neck1.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(86, 92).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.219F, 0.0852F, 0.0189F));

		PartDefinition cube_r353 = neck2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(131, 7).addBox(0.0F, -2.1816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -1.7163F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r354 = neck2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(80, 48).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -1.5629F, -0.0877F, 0.414F, -1.5444F));

		PartDefinition cube_r355 = neck2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(123, 89).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -1.5629F, 0.1064F, 0.4098F, -1.0675F));

		PartDefinition cube_r356 = neck2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(80, 48).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -1.5629F, -0.0877F, -0.414F, 1.5444F));

		PartDefinition cube_r357 = neck2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(123, 89).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -1.5629F, 0.1064F, -0.4098F, 1.0675F));

		PartDefinition cube_r358 = neck2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(93, 41).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3605F, -2.3471F, -0.297F, 0.0405F, -0.0164F));

		PartDefinition cube_r359 = neck5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(57, 94).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r360 = neck5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(123, 97).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, -0.2198F, 0.7554F, -1.6322F));

		PartDefinition cube_r361 = neck5.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(123, 95).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, 0.2025F, 0.7593F, -1.0274F));

		PartDefinition cube_r362 = neck5.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(123, 93).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1653F, -0.9742F, 0.2025F, 0.7593F, -1.0274F));

		PartDefinition cube_r363 = neck5.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(123, 91).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1653F, -0.9742F, -0.2198F, 0.7554F, -1.6322F));

		PartDefinition cube_r364 = neck5.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(123, 97).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, -0.2198F, -0.7554F, 1.6322F));

		PartDefinition cube_r365 = neck5.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(123, 95).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, 0.2025F, -0.7593F, 1.0274F));

		PartDefinition cube_r366 = neck5.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(123, 93).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1653F, -0.9742F, 0.2025F, -0.7593F, 1.0274F));

		PartDefinition cube_r367 = neck5.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(123, 91).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1653F, -0.9742F, -0.2198F, -0.7554F, 1.6322F));

		PartDefinition cube_r368 = neck5.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(86, 130).addBox(0.0F, -2.4566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r369 = neck5.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(83, 130).addBox(0.0F, -1.9566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.2366F, -0.0839F, 0.0241F));

		PartDefinition cube_r370 = neck4.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(133, 30).mirror().addBox(-2.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1499F, 1.0891F, -1.5603F));

		PartDefinition cube_r371 = neck4.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(123, 99).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.5977F, 0.9835F, -0.706F));

		PartDefinition cube_r372 = neck4.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(85, 77).mirror().addBox(-2.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1503F, 1.0717F, -1.5606F));

		PartDefinition cube_r373 = neck4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.5741F, 0.972F, -0.7256F));

		PartDefinition cube_r374 = neck4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(133, 30).addBox(1.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1499F, -1.0891F, 1.5603F));

		PartDefinition cube_r375 = neck4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(123, 99).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.5977F, -0.9835F, 0.706F));

		PartDefinition cube_r376 = neck4.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(85, 77).addBox(1.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1503F, -1.0717F, 1.5606F));

		PartDefinition cube_r377 = neck4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(57, 83).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.5741F, -0.972F, 0.7256F));

		PartDefinition cube_r378 = neck4.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 135).addBox(0.0F, -1.4677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r379 = neck4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(76, 41).addBox(0.0F, -1.4677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r380 = neck4.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(46, 83).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7757F, 0.1428F, -0.1178F, -0.1043F));

		PartDefinition cube_r381 = neck3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(124, 10).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r382 = neck3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(124, 8).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.416F, 0.6757F, -1.0136F));

		PartDefinition cube_r383 = neck3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(124, 10).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r384 = neck3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(124, 8).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.416F, -0.6757F, 1.0136F));

		PartDefinition cube_r385 = neck3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(6, 135).addBox(0.5F, -0.8458F, -1.1223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6168F, -1.9379F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r386 = neck3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(3, 135).addBox(0.5F, -1.469F, -0.9772F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3795F, -0.4528F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r387 = neck3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(85, 70).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7216F, -3.4653F, -0.4168F, -0.1346F, -0.1192F));

		PartDefinition cube_r388 = neck.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(13, 135).addBox(0.5F, -1.4207F, -0.1014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r389 = neck.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(66, 94).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r390 = neck.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(124, 12).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.8154F, 0.9709F, -0.7645F));

		PartDefinition cube_r391 = neck.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(124, 12).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.8154F, -0.9709F, 0.7645F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.3391F, 0.0291F, -0.0823F));

		PartDefinition cube_r392 = neck6.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(16, 135).addBox(0.5F, -1.4207F, -0.3013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7433F, -2.7066F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r393 = neck6.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(130, 87).addBox(0.5F, -0.9207F, 3.7987F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.074F, -4.6685F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r394 = neck6.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(46, 95).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r395 = neck6.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(124, 14).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.6767F, 0.8813F, -0.8756F));

		PartDefinition cube_r396 = neck6.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(124, 14).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.6767F, -0.8813F, 0.8756F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1684F, -2.5598F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r397 = neck7.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(23, 135).addBox(0.5F, -0.5207F, 2.7987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.074F, -4.6686F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r398 = neck7.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(109, 31).addBox(0.0F, 1.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r399 = neck7.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(124, 44).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.6594F, 0.8679F, -0.8888F));

		PartDefinition cube_r400 = neck7.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(124, 44).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.6594F, -0.8679F, 0.8888F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7926F, -1.9497F, 0.1947F, 0.0177F, 0.0959F));

		PartDefinition cube_r401 = neck8.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(26, 135).addBox(0.5F, -0.5207F, 2.7987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.074F, -4.6686F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r402 = neck8.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(54, 109).addBox(0.0F, 1.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r403 = neck8.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(124, 46).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5212F, -1.221F, 0.6594F, 0.8679F, -0.8888F));

		PartDefinition cube_r404 = neck8.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(124, 46).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5212F, -1.221F, 0.6594F, -0.8679F, 0.8888F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2236F, -2.0078F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r405 = neck9.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(32, 135).addBox(0.5F, -0.5207F, 2.7987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.074F, -4.6686F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r406 = neck9.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(25, 86).addBox(0.0F, 1.3815F, -4.2683F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r407 = neck9.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(124, 64).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5212F, -1.221F, 0.6594F, 0.8679F, -0.8888F));

		PartDefinition cube_r408 = neck9.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(124, 64).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5212F, -1.221F, 0.6594F, -0.8679F, 0.8888F));

		PartDefinition head = neck9.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0878F, -2.4251F, -0.1979F, -0.13F, 0.0463F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(133, 15).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0004F, 8.7424F, -14.5874F, 0.6807F, 0.0017F, -0.0023F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(97, 123).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -2.4823F, -0.1782F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(130, 123).addBox(-0.5F, -0.6F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7785F, -0.5977F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(57, 61).addBox(-0.5F, -0.925F, -7.45F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.6514F, -5.4129F, 0.501F, 0.0F, 0.0F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(80, 41).addBox(-0.5F, 0.325F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.9189F, -3.9849F, 0.3221F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(113, 86).addBox(-0.5F, -0.1F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.4261F, 0.4398F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(5, 132).addBox(-1.4404F, -0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9404F, 3.8638F, -10.8638F, 0.4649F, 0.0F, 0.0F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(125, 41).addBox(-0.5F, -0.212F, -0.8004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 8.4196F, -15.1105F, 2.4633F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(100, 56).addBox(-0.5F, -0.812F, -0.8004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 7.8309F, -15.2263F, -2.9473F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(125, 114).addBox(-0.5F, -0.7894F, -0.1946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 7.2809F, -15.0013F, -1.935F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(133, 77).addBox(-0.5F, -0.184F, -0.2043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 6.8059F, -14.6263F, -0.6696F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(134, 6).addBox(-0.5F, -0.2186F, -0.8088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 5.5059F, -13.4013F, 0.7441F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(133, 80).addBox(-0.5F, -0.261F, -1.4061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 5.5059F, -13.4013F, 0.8139F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(131, 132).addBox(-0.5F, -0.3867F, -1.9931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 5.5059F, -13.4013F, 0.9186F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(103, 79).addBox(-1.4404F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 3.8016F, -11.4482F, 0.7136F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(29, 131).addBox(-1.4404F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 3.4295F, -10.9702F, 0.6612F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(131, 24).addBox(-1.4404F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 3.1126F, -10.4607F, 0.5565F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(113, 82).addBox(-1.4404F, -0.225F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 2.4113F, -9.0223F, 0.4692F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.1314F, -3.2408F, 3.1352F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(130, 95).addBox(-0.5F, 0.5795F, -0.7408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7165F, -3.6807F, -3.0694F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(103, 114).addBox(-0.5F, -0.7742F, -1.178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.7165F, -3.6807F, 1.0757F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(107, 109).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -2.0821F, -3.8526F, 1.4161F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(47, 113).addBox(-0.5F, -0.7342F, -1.6493F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7165F, -3.6807F, 0.8968F, 0.0F, 0.0F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(96, 114).addBox(-0.5F, -0.475F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 0.2117F, -5.1213F, 0.5827F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(110, 114).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 0.5872F, -6.4009F, 0.4256F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(100, 97).addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 0.5872F, -6.4009F, 0.6176F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(7, 113).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.2609F, -8.2689F, 0.5478F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(89, 30).addBox(-1.4404F, 0.275F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9404F, 1.9404F, -7.4935F, 0.443F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(77, 79).addBox(-0.9404F, 0.25F, -3.95F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, 0.7188F, -5.9499F, 0.5347F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(113, 0).addBox(-0.5F, -0.0923F, -2.1358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.7165F, -3.6807F, 0.7965F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(88, 123).addBox(-0.5F, -1.8028F, -1.3447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -0.5274F, -0.6494F, 0.4823F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(48, 32).addBox(-1.5F, -1.3905F, 0.3608F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5274F, -0.6494F, -0.7918F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(82, 112).addBox(-1.0F, -1.1349F, -0.1058F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5274F, -0.6494F, -0.3991F, 0.0F, 0.0F));

		PartDefinition cube_r442 = head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(100, 109).addBox(-0.5F, -1.1185F, -1.4913F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5274F, -0.6494F, -0.5038F, 0.0F, 0.0F));

		PartDefinition cube_r443 = head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(14, 124).addBox(-0.5F, -1.8575F, -0.7724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5274F, -0.6494F, 0.5521F, 0.0F, 0.0F));

		PartDefinition cube_r444 = head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(100, 92).addBox(-1.0F, -0.2654F, -1.1797F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.5274F, -0.6494F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.626F, 0.4098F, -0.6129F, 0.0F, -0.0087F, -0.001F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(65, 100).addBox(-1.5F, -1.075F, -1.075F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5043F, -0.9766F, -0.5993F, -1.7919F, 0.2288F, -0.1235F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(109, 97).addBox(-0.5F, -0.675F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2685F, -0.6098F, 0.2115F, -1.6174F, 0.2288F, -0.1235F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(51, 75).addBox(-1.4369F, -1.4101F, 0.5757F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.5651F, 0.1454F, -0.1065F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(114, 110).addBox(-1.422F, -2.9107F, -5.2075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.7152F, 0.119F, -0.0848F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(114, 106).addBox(-1.422F, -2.0445F, -3.846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.4709F, 0.119F, -0.0848F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(64, 79).addBox(-1.397F, -2.2429F, -4.1324F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.593F, 0.119F, -0.0848F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(31, 124).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2234F, 1.5582F, -0.9374F, 1.5921F, 0.2325F, -0.1456F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(74, 123).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0875F, 0.96F, -0.0027F, 1.6444F, 0.2325F, -0.1456F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(112, 78).addBox(-0.5F, -0.5F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9123F, -0.2046F, -2.7359F, 2.2553F, 0.2325F, -0.1456F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(110, 45).addBox(-0.5F, -1.05F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.949F, -1.5072F, -2.0911F, 2.7789F, 0.2325F, -0.1456F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(93, 109).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0539F, -2.4612F, -1.9451F, 2.3513F, 0.2325F, -0.1456F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(10, 131).addBox(-0.5F, -0.2013F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1757F, -1.2838F, 0.9369F, -2.033F, 0.2584F, -0.0911F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(94, 130).addBox(-0.5F, -0.7987F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1757F, -1.2838F, 0.9369F, -2.2948F, 0.2584F, -0.0911F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(131, 110).addBox(-0.6805F, 0.0677F, -0.3376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8122F, -1.9918F, -1.1192F, -1.5269F, 0.2384F, 1.1259F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(131, 44).addBox(-0.3602F, 0.0677F, -0.6608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8122F, -1.9918F, -1.1192F, -1.7108F, 0.1984F, 0.3213F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(0, 125).addBox(-0.6213F, -1.5677F, -0.3319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8122F, -1.9918F, -1.1192F, -1.594F, 0.4777F, 1.1061F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(79, 124).addBox(-0.3298F, -1.5677F, -0.608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8122F, -1.9918F, -1.1192F, -1.9214F, 0.2952F, 0.3147F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(109, 92).addBox(-1.4849F, -3.0748F, 3.2262F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.0736F, 0.2325F, -0.1456F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(56, 129).addBox(-0.5695F, -0.9756F, -0.9535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4677F, -0.8763F, -1.6709F, -1.2333F, 0.248F, -0.1543F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(130, 92).addBox(-0.5695F, -0.8429F, -0.4423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.4677F, -0.8763F, -1.6709F, -0.5527F, 0.248F, -0.1543F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(89, 130).addBox(-0.5695F, 0.3179F, -0.438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(130, 68).addBox(-0.5695F, -0.1821F, -0.438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.4677F, -0.8763F, -1.6709F, -0.4654F, 0.248F, -0.1543F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(39, 123).addBox(-0.5F, -1.075F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.5336F, -0.4539F, -1.9013F, -0.0291F, 0.248F, -0.1543F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(55, 132).addBox(-0.5F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7522F, -1.4858F, -2.1279F, 2.109F, 0.248F, -0.1543F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(60, 132).addBox(-0.5F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.7141F, -1.5174F, -1.9601F, 1.7163F, 0.248F, -0.1543F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(131, 32).addBox(-0.5695F, 0.3033F, -0.2835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(130, 48).addBox(-0.5695F, 0.3033F, -0.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.4677F, -0.8763F, -1.6709F, 2.8071F, 0.248F, -0.1543F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(126, 33).addBox(-0.5442F, -1.273F, -0.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1534F, -0.1993F, -0.4235F, -2.927F, 0.2368F, -0.1465F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(125, 48).addBox(-0.5229F, -1.2724F, -0.6718F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1534F, -0.1993F, -0.4235F, -2.8895F, 0.231F, -0.1362F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(40, 111).addBox(-0.5249F, -0.3061F, -0.2628F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1534F, -0.1993F, -0.4235F, 1.4744F, 0.2303F, -0.1343F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(129, 55).addBox(-0.5249F, -0.8173F, 0.2623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1534F, -0.1993F, -0.4235F, 0.9769F, 0.2303F, -0.1343F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(129, 52).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(51, 129).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.1511F, -3.331F, -0.0413F, -0.2444F, -0.742F, 0.4918F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(46, 129).addBox(0.0F, 0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.1511F, -3.331F, -0.0413F, 0.1521F, -0.7273F, -0.1016F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(99, 128).addBox(-0.5249F, -0.6966F, -0.2706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.1534F, -0.1993F, -0.4235F, 1.2126F, 0.2303F, -0.1343F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(75, 128).addBox(-0.5249F, -0.7046F, -0.8717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1534F, -0.1993F, -0.4235F, 1.3696F, 0.2303F, -0.1343F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(127, 126).addBox(-0.5249F, -0.7467F, -1.3167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1534F, -0.1993F, -0.4235F, 1.422F, 0.2303F, -0.1343F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(109, 128).addBox(-0.5271F, -0.0658F, 0.1597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.9744F, 0.6835F, -4.8718F, -1.1266F, 0.1845F, -0.1549F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(104, 128).addBox(-0.5271F, -1.0045F, -0.347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.9744F, 0.6835F, -4.8718F, -2.261F, 0.1845F, -0.1549F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(5, 129).addBox(-0.5271F, -0.9808F, -2.663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(112, 65).addBox(-0.5271F, -0.9808F, -2.038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.9744F, 0.6835F, -4.8718F, -2.2959F, 0.1845F, -0.1549F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(130, 21).addBox(-0.5271F, 0.4064F, 0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.9744F, 0.6835F, -4.8718F, -1.0829F, 0.1845F, -0.1549F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(115, 4).addBox(-0.5271F, 0.3987F, -2.8319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.9744F, 0.6835F, -4.8718F, 0.2522F, 0.1845F, -0.1549F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(109, 131).addBox(-0.5271F, -0.707F, -2.6502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.9744F, 0.6835F, -4.8718F, 0.6886F, 0.1845F, -0.1549F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(125, 84).addBox(-0.5271F, -2.0092F, -0.541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.9744F, 0.6835F, -4.8718F, 2.1285F, 0.1845F, -0.1549F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(50, 132).addBox(-0.5271F, -0.525F, -0.6308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(-0.9744F, 0.6835F, -4.8718F, -2.4617F, 0.1845F, -0.1549F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(124, 76).addBox(-0.5271F, -2.3031F, -0.4804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.9744F, 0.6835F, -4.8718F, -0.9346F, 0.1845F, -0.1549F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(125, 68).addBox(-0.9274F, -4.0517F, 2.6112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 2.5341F, 0.1516F, -0.1676F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(133, 38).addBox(-0.9274F, 1.0733F, 4.2458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(133, 18).addBox(-0.9274F, 1.0733F, 4.6208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, -2.5448F, 0.1516F, -0.1676F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(117, 44).addBox(-0.9274F, 0.4177F, 5.1237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, -2.6669F, 0.1516F, -0.1676F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(45, 132).addBox(-0.9274F, 0.9857F, 2.5929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(40, 132).addBox(-0.9274F, 0.9857F, 2.9679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, -2.7106F, 0.1516F, -0.1676F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(89, 48).addBox(-0.9274F, 1.8776F, 2.8066F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.309F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, -2.4488F, 0.1516F, -0.1676F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(128, 61).addBox(-0.3695F, -1.0974F, -0.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(29, 128).addBox(-0.5445F, -1.0974F, -0.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4677F, -0.8763F, -1.6709F, 0.4334F, 0.248F, -0.1543F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(88, 7).addBox(-1.1866F, -1.999F, -3.5651F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.4872F, 0.1716F, -0.1602F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(86, 86).addBox(-0.525F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1963F, 0.7409F, -4.9533F, 0.5908F, 0.1645F, -0.1442F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(103, 66).addBox(-1.1908F, -2.5135F, -6.198F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.6335F, 0.1667F, -0.1783F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(133, 86).addBox(-1.1908F, -7.1846F, 1.4286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 2.1868F, 0.1667F, -0.1783F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(75, 111).addBox(-0.5F, -0.6561F, -0.1306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6048F, 6.9709F, -13.5871F, 0.8201F, 0.1328F, -0.1105F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(133, 27).addBox(-0.5F, -0.6559F, -0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6048F, 6.9709F, -13.5871F, 1.0121F, 0.1328F, -0.1105F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(132, 71).addBox(-0.5F, -0.9525F, -1.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.6048F, 6.9709F, -13.5871F, 1.5357F, 0.1328F, -0.1105F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(15, 132).addBox(-1.1908F, -5.4191F, -6.3689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 1.0872F, 0.1667F, -0.1783F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(132, 0).addBox(-1.1908F, 2.9046F, -6.6967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, -0.0472F, 0.1667F, -0.1783F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(125, 101).addBox(-0.55F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4554F, 7.2238F, -13.5394F, 0.7496F, 0.2215F, -0.1794F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(60, 125).addBox(-1.3547F, 1.9768F, -7.6301F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1041F, 2.9042F, -5.7654F, 0.0763F, 0.1375F, -0.0893F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(84, 127).addBox(-0.5217F, -0.6379F, 1.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 127).addBox(-0.5217F, -0.5879F, 0.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9155F, 3.8465F, -7.0803F, 0.4617F, 0.1845F, -0.1549F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(36, 127).addBox(-0.5035F, -0.538F, -0.501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(19, 126).addBox(-0.5035F, -0.463F, -1.301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(24, 127).addBox(-0.5035F, -0.563F, -2.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9155F, 3.8465F, -7.0803F, 0.4619F, 0.1672F, -0.1566F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(118, 21).addBox(-0.525F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.097F, 4.9142F, -9.4706F, 0.8124F, 0.1756F, -0.1256F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(120, 85).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0838F, 5.6603F, -9.8564F, 0.762F, 0.1616F, -0.1147F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(55, 125).addBox(-1.3547F, -0.7673F, -6.2667F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1041F, 2.9042F, -5.7654F, 0.5563F, 0.1375F, -0.0893F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(50, 125).addBox(-1.3547F, 0.084F, -7.0158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1041F, 2.9042F, -5.7654F, 0.469F, 0.1375F, -0.0893F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(125, 80).addBox(-1.436F, 0.6859F, -7.5577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1041F, 2.9042F, -5.7654F, 0.337F, 0.1342F, -0.1028F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(33, 116).addBox(-1.1908F, -2.488F, -4.7784F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.8254F, 0.1667F, -0.1783F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(99, 131).addBox(-1.1908F, -1.9824F, -5.8684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.7207F, 0.1667F, -0.1783F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(131, 35).addBox(-1.1908F, -1.0507F, -6.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.5636F, 0.1667F, -0.1783F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(40, 61).addBox(-1.1908F, -1.5795F, -6.5965F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.5898F, 0.1667F, -0.1783F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(74, 50).addBox(-1.1866F, -1.1241F, -5.9562F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2959F, 2.9042F, -5.7654F, 0.4435F, 0.1716F, -0.1602F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(100, 35).addBox(-1.2839F, -0.4298F, -3.1733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.114F, 1.1219F, -3.5097F, 0.3888F, 0.1541F, -0.1523F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(86, 0).addBox(-1.4849F, -1.6778F, -3.6285F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5468F, 0.6356F, -1.4283F, 0.2831F, 0.2325F, -0.1456F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.626F, 0.4098F, -0.6129F, 0.0F, 0.0087F, 0.001F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(65, 100).mirror().addBox(-0.5F, -1.075F, -1.075F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5043F, -0.9766F, -0.5993F, -1.7919F, -0.2288F, 0.1235F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(109, 97).mirror().addBox(-0.5F, -0.675F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2685F, -0.6098F, 0.2115F, -1.6174F, -0.2288F, 0.1235F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(51, 75).mirror().addBox(0.4369F, -1.4101F, 0.5757F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.5651F, -0.1454F, 0.1065F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(114, 110).mirror().addBox(0.422F, -2.9107F, -5.2075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.7152F, -0.119F, 0.0848F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(114, 106).mirror().addBox(0.422F, -2.0445F, -3.846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.4709F, -0.119F, 0.0848F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(64, 79).mirror().addBox(0.397F, -2.2429F, -4.1324F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.593F, -0.119F, 0.0848F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(31, 124).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2234F, 1.5582F, -0.9374F, 1.5921F, -0.2325F, 0.1456F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(74, 123).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0875F, 0.96F, -0.0027F, 1.6444F, -0.2325F, 0.1456F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(112, 78).mirror().addBox(-0.5F, -0.5F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9123F, -0.2046F, -2.7359F, 2.2553F, -0.2325F, 0.1456F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(110, 45).mirror().addBox(-0.5F, -1.05F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.949F, -1.5072F, -2.0911F, 2.7789F, -0.2325F, 0.1456F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(93, 109).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0539F, -2.4612F, -1.9451F, 2.3513F, -0.2325F, 0.1456F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(10, 131).mirror().addBox(-0.5F, -0.2013F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1757F, -1.2838F, 0.9369F, -2.033F, -0.2584F, 0.0911F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(94, 130).mirror().addBox(-0.5F, -0.7987F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1757F, -1.2838F, 0.9369F, -2.2948F, -0.2584F, 0.0911F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(131, 110).mirror().addBox(-0.3195F, 0.0677F, -0.3376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.8122F, -1.9918F, -1.1192F, -1.5269F, -0.2384F, -1.1259F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(131, 44).mirror().addBox(-0.6398F, 0.0677F, -0.6608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.8122F, -1.9918F, -1.1192F, -1.7108F, -0.1984F, -0.3213F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-0.3787F, -1.5677F, -0.3319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.8122F, -1.9918F, -1.1192F, -1.594F, -0.4777F, -1.1061F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(79, 124).mirror().addBox(-0.6702F, -1.5677F, -0.608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.8122F, -1.9918F, -1.1192F, -1.9214F, -0.2952F, -0.3147F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(109, 92).mirror().addBox(0.485F, -3.0748F, 3.2262F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.0736F, -0.2325F, 0.1456F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(56, 129).mirror().addBox(-0.4305F, -0.9756F, -0.9535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4677F, -0.8763F, -1.6709F, -1.2333F, -0.248F, 0.1543F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(130, 92).mirror().addBox(-0.4305F, -0.8429F, -0.4423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.4677F, -0.8763F, -1.6709F, -0.5527F, -0.248F, 0.1543F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(89, 130).mirror().addBox(-0.4305F, 0.3179F, -0.438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(130, 68).mirror().addBox(-0.4305F, -0.1821F, -0.438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.4677F, -0.8763F, -1.6709F, -0.4654F, -0.248F, 0.1543F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(39, 123).mirror().addBox(-0.5F, -1.075F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.5336F, -0.4539F, -1.9013F, -0.0291F, -0.248F, 0.1543F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(55, 132).mirror().addBox(-0.5F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7522F, -1.4858F, -2.1279F, 2.109F, -0.248F, 0.1543F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(60, 132).mirror().addBox(-0.5F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.7141F, -1.5174F, -1.9601F, 1.7163F, -0.248F, 0.1543F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(131, 32).mirror().addBox(-0.4305F, 0.3033F, -0.2835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(130, 48).mirror().addBox(-0.4305F, 0.3033F, -0.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.4677F, -0.8763F, -1.6709F, 2.8071F, -0.248F, 0.1543F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(126, 33).mirror().addBox(-0.4558F, -1.273F, -0.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1534F, -0.1993F, -0.4235F, -2.927F, -0.2368F, 0.1465F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(125, 48).mirror().addBox(-0.4771F, -1.2724F, -0.6718F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1534F, -0.1993F, -0.4235F, -2.8895F, -0.231F, 0.1362F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(40, 111).mirror().addBox(-0.4751F, -0.3061F, -0.2628F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1534F, -0.1993F, -0.4235F, 1.4744F, -0.2303F, 0.1343F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(129, 55).mirror().addBox(-0.4751F, -0.8173F, 0.2623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1534F, -0.1993F, -0.4235F, 0.9769F, -0.2303F, 0.1343F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(129, 52).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(51, 129).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(1.1511F, -3.331F, -0.0413F, -0.2444F, 0.742F, -0.4918F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(46, 129).mirror().addBox(-1.0F, 0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(1.1511F, -3.331F, -0.0413F, 0.1521F, 0.7273F, 0.1016F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(99, 128).mirror().addBox(-0.4751F, -0.6966F, -0.2706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.1534F, -0.1993F, -0.4235F, 1.2126F, -0.2303F, 0.1343F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(75, 128).mirror().addBox(-0.4751F, -0.7046F, -0.8717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1534F, -0.1993F, -0.4235F, 1.3696F, -0.2303F, 0.1343F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(127, 126).mirror().addBox(-0.4751F, -0.7467F, -1.3167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1534F, -0.1993F, -0.4235F, 1.422F, -0.2303F, 0.1343F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(109, 128).mirror().addBox(-0.4729F, -0.0658F, 0.1597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.9744F, 0.6835F, -4.8718F, -1.1266F, -0.1845F, 0.1549F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(104, 128).mirror().addBox(-0.4729F, -1.0045F, -0.347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.9744F, 0.6835F, -4.8718F, -2.261F, -0.1845F, 0.1549F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(5, 129).mirror().addBox(-0.4729F, -0.9808F, -2.663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(112, 65).mirror().addBox(-0.4729F, -0.9808F, -2.038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.9744F, 0.6835F, -4.8718F, -2.2959F, -0.1845F, 0.1549F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(130, 21).mirror().addBox(-0.4729F, 0.4064F, 0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.9744F, 0.6835F, -4.8718F, -1.0829F, -0.1845F, 0.1549F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(115, 4).mirror().addBox(-0.4729F, 0.3987F, -2.8319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.9744F, 0.6835F, -4.8718F, 0.2522F, -0.1845F, 0.1549F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(109, 131).mirror().addBox(-0.4729F, -0.707F, -2.6502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.9744F, 0.6835F, -4.8718F, 0.6886F, -0.1845F, 0.1549F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(125, 84).mirror().addBox(-0.4729F, -2.0092F, -0.541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.9744F, 0.6835F, -4.8718F, 2.1285F, -0.1845F, 0.1549F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(50, 132).mirror().addBox(-0.4729F, -0.525F, -0.6308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(0.9744F, 0.6835F, -4.8718F, -2.4617F, -0.1845F, 0.1549F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(124, 76).mirror().addBox(-0.4729F, -2.3031F, -0.4804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.9744F, 0.6835F, -4.8718F, -0.9346F, -0.1845F, 0.1549F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(125, 68).mirror().addBox(-0.0726F, -4.0517F, 2.6112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 2.5341F, -0.1516F, 0.1676F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(133, 38).mirror().addBox(-0.0726F, 1.0733F, 4.2458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(133, 18).mirror().addBox(-0.0726F, 1.0733F, 4.6208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, -2.5448F, -0.1516F, 0.1676F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(117, 44).mirror().addBox(-0.0726F, 0.4177F, 5.1237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, -2.6669F, -0.1516F, 0.1676F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(45, 132).mirror().addBox(-0.0726F, 0.9857F, 2.5929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(40, 132).mirror().addBox(-0.0726F, 0.9857F, 2.9679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, -2.7106F, -0.1516F, 0.1676F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(89, 48).mirror().addBox(-0.0726F, 1.8776F, 2.8066F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.309F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, -2.4488F, -0.1516F, 0.1676F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(128, 61).mirror().addBox(-0.6305F, -1.0974F, -0.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(29, 128).mirror().addBox(-0.4555F, -1.0974F, -0.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4677F, -0.8763F, -1.6709F, 0.4334F, -0.248F, 0.1543F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(88, 7).mirror().addBox(0.1866F, -1.999F, -3.5651F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.4872F, -0.1716F, 0.1602F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(-0.475F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.1963F, 0.7409F, -4.9533F, 0.5908F, -0.1645F, 0.1442F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(103, 66).mirror().addBox(0.1908F, -2.5135F, -6.198F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.6335F, -0.1667F, 0.1783F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(133, 86).mirror().addBox(0.1908F, -7.1846F, 1.4286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 2.1868F, -0.1667F, 0.1783F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(75, 111).mirror().addBox(-0.5F, -0.6561F, -0.1306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6048F, 6.9709F, -13.5871F, 0.8201F, -0.1328F, 0.1105F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(133, 27).mirror().addBox(-0.5F, -0.6559F, -0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6048F, 6.9709F, -13.5871F, 1.0121F, -0.1328F, 0.1105F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(132, 71).mirror().addBox(-0.5F, -0.9525F, -1.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.6048F, 6.9709F, -13.5871F, 1.5357F, -0.1328F, 0.1105F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(15, 132).mirror().addBox(0.1908F, -5.4191F, -6.3689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 1.0872F, -0.1667F, 0.1783F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(132, 0).mirror().addBox(0.1908F, 2.9046F, -6.6967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, -0.0472F, -0.1667F, 0.1783F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(125, 101).mirror().addBox(-0.45F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4554F, 7.2238F, -13.5394F, 0.7496F, -0.2215F, 0.1794F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(60, 125).mirror().addBox(0.3547F, 1.9768F, -7.6301F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1041F, 2.9042F, -5.7654F, 0.0763F, -0.1375F, 0.0893F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(84, 127).mirror().addBox(-0.4783F, -0.6379F, 1.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 127).mirror().addBox(-0.4783F, -0.5879F, 0.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9155F, 3.8465F, -7.0803F, 0.4617F, -0.1845F, 0.1549F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(36, 127).mirror().addBox(-0.4965F, -0.538F, -0.501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(19, 126).mirror().addBox(-0.4965F, -0.463F, -1.301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(24, 127).mirror().addBox(-0.4965F, -0.563F, -2.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9155F, 3.8465F, -7.0803F, 0.4619F, -0.1672F, 0.1566F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(118, 21).mirror().addBox(-0.475F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.097F, 4.9142F, -9.4706F, 0.8124F, -0.1756F, 0.1256F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(120, 85).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0838F, 5.6603F, -9.8564F, 0.762F, -0.1616F, 0.1147F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(55, 125).mirror().addBox(0.3547F, -0.7673F, -6.2667F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1041F, 2.9042F, -5.7654F, 0.5563F, -0.1375F, 0.0893F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(50, 125).mirror().addBox(0.3547F, 0.084F, -7.0158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1041F, 2.9042F, -5.7654F, 0.469F, -0.1375F, 0.0893F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(125, 80).mirror().addBox(0.436F, 0.6859F, -7.5577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1041F, 2.9042F, -5.7654F, 0.337F, -0.1342F, 0.1028F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(33, 116).mirror().addBox(0.1908F, -2.488F, -4.7784F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.8254F, -0.1667F, 0.1783F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(99, 131).mirror().addBox(0.1908F, -1.9824F, -5.8684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.7207F, -0.1667F, 0.1783F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(131, 35).mirror().addBox(0.1908F, -1.0507F, -6.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.5636F, -0.1667F, 0.1783F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(0.1908F, -1.5795F, -6.5965F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.5898F, -0.1667F, 0.1783F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(0.1866F, -1.1241F, -5.9562F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2959F, 2.9042F, -5.7654F, 0.4435F, -0.1716F, 0.1602F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(100, 35).mirror().addBox(0.2839F, -0.4298F, -3.1733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.114F, 1.1219F, -3.5097F, 0.3888F, -0.1541F, 0.1523F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(0.4849F, -1.6778F, -3.6285F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5468F, 0.6356F, -1.4283F, 0.2831F, -0.2325F, 0.1456F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6413F, -0.1307F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(101, 74).mirror().addBox(0.2295F, 0.6763F, -1.675F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(46, 101).mirror().addBox(0.2295F, 1.0763F, -1.675F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -7.5274F, 0.0705F, -0.0811F, -0.0173F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(131, 12).mirror().addBox(0.1912F, -0.2272F, -1.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(130, 117).mirror().addBox(0.1912F, -0.2272F, -1.9094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -7.5274F, 0.2005F, -0.0829F, 0.0055F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(126, 108).mirror().addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.2579F, 1.6892F, -1.1982F, 1.7366F, -0.1745F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(89, 114).mirror().addBox(-0.5697F, -0.196F, -2.6415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.1178F, -0.1745F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(117, 12).mirror().addBox(-0.6745F, 0.6253F, 1.6245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, 0.6631F, -0.2156F, 0.1725F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(14, 116).mirror().addBox(-0.1505F, -0.5485F, 0.4973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, 0.1292F, -0.4399F, 0.0993F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(122, 126).mirror().addBox(-0.1505F, -0.8503F, -0.136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, -0.3072F, -0.4399F, 0.0993F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(114, 60).mirror().addBox(0.5053F, 0.1048F, -2.0945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 0.3056F, -0.0495F, 0.0093F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(111, 21).mirror().addBox(0.2962F, 0.9736F, -3.6793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -7.5274F, 0.1223F, -0.0476F, -0.0059F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(109, 36).mirror().addBox(-0.0973F, 1.6012F, -3.6525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, -0.5201F, -3.6274F, 0.0223F, -0.0821F, -0.0116F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(46, 79).mirror().addBox(-0.0973F, 0.4586F, -2.0193F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, -0.5201F, -3.6274F, 0.1052F, -0.0821F, -0.0116F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(34, 46).mirror().addBox(-0.1189F, 0.4185F, -1.4701F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, -0.5201F, -3.6274F, 0.133F, -0.1728F, -0.0245F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(117, 123).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.1007F, 1.8496F, -2.1035F, 0.0611F, -0.1745F, 0.0F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(126, 105).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.424F, 1.3968F, -0.2564F, 0.2967F, -0.1745F, 0.0F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(130, 120).mirror().addBox(-0.5697F, -1.173F, 0.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, -1.6057F, -0.1745F, 0.0F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(125, 123).mirror().addBox(-0.5697F, 0.0838F, -0.8382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.4014F, -0.1745F, 0.0F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(133, 61).mirror().addBox(0.5031F, 0.5228F, -3.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 0.1442F, -0.0495F, 0.0093F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(89, 133).mirror().addBox(0.4961F, 0.1373F, -2.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 0.2839F, -0.0501F, 0.0049F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(133, 41).mirror().addBox(0.5031F, -2.3883F, 3.0371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 3.024F, -0.0495F, 0.0093F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(125, 120).mirror().addBox(0.5031F, 1.7867F, 3.3232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, -2.3342F, -0.0495F, 0.0093F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(44, 126).mirror().addBox(0.5031F, 3.1662F, 1.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, -1.7495F, -0.0495F, 0.0093F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(94, 133).mirror().addBox(0.5031F, 1.476F, -3.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, -0.2485F, -0.0495F, 0.0093F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(133, 89).mirror().addBox(0.4965F, 0.2041F, -2.858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 0.2228F, -0.0501F, 0.0049F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(117, 8).mirror().addBox(0.5053F, -0.128F, -2.1047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 0.3711F, -0.0495F, 0.0093F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(54, 114).mirror().addBox(0.2903F, -0.0626F, -3.8053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -7.5274F, 0.3449F, -0.0469F, -0.01F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(96, 74).mirror().addBox(0.5008F, -1.071F, -5.3196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 0.2795F, -0.0495F, 0.0093F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(64, 75).mirror().addBox(0.5008F, -0.1995F, -4.6964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 0.0089F, -0.0495F, 0.0093F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(133, 83).mirror().addBox(0.5008F, 0.8458F, -3.5697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, -0.2529F, -0.0495F, 0.0093F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(114, 133).mirror().addBox(0.5008F, 0.5433F, -2.9868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, -0.1132F, -0.0495F, 0.0093F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(75, 131).mirror().addBox(0.2518F, -0.1789F, -2.6643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(131, 64).mirror().addBox(0.2518F, -0.1539F, -3.4643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -7.5274F, 0.2008F, -0.0487F, 0.0127F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(131, 58).mirror().addBox(0.5008F, -0.6023F, -0.681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 126).mirror().addBox(0.5008F, -0.4773F, -1.481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 0.2707F, -0.0495F, 0.0093F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(132, 74).mirror().addBox(0.5008F, -0.1314F, -2.2953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 1.3799F, -10.9274F, 0.1486F, -0.0495F, 0.0093F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(26, 114).mirror().addBox(0.2295F, 0.0221F, -1.9377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -7.5274F, 0.3061F, -0.0811F, -0.0173F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(110, 11).mirror().addBox(-0.0973F, 0.0247F, -3.9505F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, -0.5201F, -3.6274F, 0.1576F, -0.0821F, -0.0116F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(117, 130).mirror().addBox(-0.6947F, -3.0043F, -3.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.4609F, -0.0201F, 0.4726F, 0.8988F, -0.1745F, 0.0F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(114, 25).mirror().addBox(-0.2261F, 0.761F, -1.8781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, -0.5201F, -3.6274F, 0.2536F, -0.0863F, -0.0127F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(125, 117).mirror().addBox(-0.1976F, 1.1823F, -0.8524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, -0.5201F, -3.6274F, -0.113F, -0.0821F, -0.0116F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(130, 114).mirror().addBox(-0.229F, 1.0481F, -0.9155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, -0.5201F, -3.6274F, 0.2552F, -0.1728F, -0.0245F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(130, 101).mirror().addBox(-0.1242F, 0.0156F, -1.0361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, -0.5201F, -3.6274F, 0.1548F, -0.1728F, -0.0245F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(130, 98).mirror().addBox(-0.0973F, 0.0034F, -1.9926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, -0.5201F, -3.6274F, 0.1663F, -0.0821F, -0.0116F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(113, 102).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1709F, -0.2979F, -1.661F, -0.1124F, -0.1742F, -0.0077F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(61, 111).mirror().addBox(-0.5697F, -0.007F, -1.803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, -0.2094F, -0.1745F, 0.0F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(89, 114).addBox(-0.4303F, -0.196F, -2.6415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.1178F, 0.1745F, 0.0F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(117, 12).addBox(-0.3255F, 0.6253F, 1.6245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, 0.6631F, 0.2156F, -0.1725F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(14, 116).addBox(-0.8495F, -0.5485F, 0.4973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, 0.1292F, 0.4399F, -0.0993F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(122, 126).addBox(-0.8495F, -0.8503F, -0.136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, -0.3072F, 0.4399F, -0.0993F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(114, 60).addBox(-1.5053F, 0.1048F, -2.0945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 0.3056F, 0.0495F, -0.0093F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(111, 21).addBox(-1.2962F, 0.9736F, -3.6793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -7.5274F, 0.1223F, 0.0476F, 0.0059F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(101, 74).addBox(-1.2295F, 0.6763F, -1.675F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F))
				.texOffs(46, 101).addBox(-1.2295F, 1.0763F, -1.675F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -7.5274F, 0.0705F, 0.0811F, 0.0173F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(109, 36).addBox(-0.9027F, 1.6012F, -3.6525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2109F, -0.5201F, -3.6274F, 0.0223F, 0.0821F, 0.0116F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(46, 79).addBox(-0.9027F, 0.4586F, -2.0193F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2109F, -0.5201F, -3.6274F, 0.1052F, 0.0821F, 0.0116F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(34, 46).addBox(-0.8811F, 0.4185F, -1.4701F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.2109F, -0.5201F, -3.6274F, 0.133F, 0.1728F, 0.0245F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(117, 123).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.1007F, 1.8496F, -2.1035F, 0.0611F, 0.1745F, 0.0F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(126, 108).addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.2579F, 1.6892F, -1.1982F, 1.7366F, 0.1745F, 0.0F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(126, 105).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.424F, 1.3968F, -0.2564F, 0.2967F, 0.1745F, 0.0F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(130, 120).addBox(-0.4303F, -1.173F, 0.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, -1.6057F, 0.1745F, 0.0F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(125, 123).addBox(-0.4303F, 0.0838F, -0.8382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.4014F, 0.1745F, 0.0F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(133, 61).addBox(-1.5031F, 0.5228F, -3.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 0.1442F, 0.0495F, -0.0093F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(89, 133).addBox(-1.4961F, 0.1373F, -2.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 0.2839F, 0.0501F, -0.0049F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(133, 41).addBox(-1.5031F, -2.3883F, 3.0371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 3.024F, 0.0495F, -0.0093F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(125, 120).addBox(-1.5031F, 1.7867F, 3.3232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, -2.3342F, 0.0495F, -0.0093F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(44, 126).addBox(-1.5031F, 3.1662F, 1.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, -1.7495F, 0.0495F, -0.0093F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(94, 133).addBox(-1.5031F, 1.476F, -3.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, -0.2485F, 0.0495F, -0.0093F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(133, 89).addBox(-1.4965F, 0.2041F, -2.858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 0.2228F, 0.0501F, -0.0049F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(117, 8).addBox(-1.5053F, -0.128F, -2.1047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 0.3711F, 0.0495F, -0.0093F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(54, 114).addBox(-1.2903F, -0.0626F, -3.8053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -7.5274F, 0.3449F, 0.0469F, 0.01F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(96, 74).addBox(-1.5008F, -1.071F, -5.3196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 0.2795F, 0.0495F, -0.0093F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(64, 75).addBox(-1.5008F, -0.1995F, -4.6964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 0.0089F, 0.0495F, -0.0093F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(133, 83).addBox(-1.5008F, 0.8458F, -3.5697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, -0.2529F, 0.0495F, -0.0093F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(114, 133).addBox(-1.5008F, 0.5433F, -2.9868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, -0.1132F, 0.0495F, -0.0093F));

		PartDefinition cube_r663 = jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(131, 12).addBox(-1.1912F, -0.2272F, -1.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(130, 117).addBox(-1.1912F, -0.2272F, -1.9094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -7.5274F, 0.2005F, 0.0829F, -0.0055F));

		PartDefinition cube_r664 = jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(75, 131).addBox(-1.2518F, -0.1789F, -2.6643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(131, 64).addBox(-1.2518F, -0.1539F, -3.4643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -7.5274F, 0.2008F, 0.0487F, -0.0127F));

		PartDefinition cube_r665 = jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(131, 58).addBox(-1.5008F, -0.6023F, -0.681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 126).addBox(-1.5008F, -0.4773F, -1.481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 0.2707F, 0.0495F, -0.0093F));

		PartDefinition cube_r666 = jaw.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(132, 74).addBox(-1.5008F, -0.1314F, -2.2953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2109F, 1.3799F, -10.9274F, 0.1486F, 0.0495F, -0.0093F));

		PartDefinition cube_r667 = jaw.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(26, 114).addBox(-1.2295F, 0.0221F, -1.9377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -7.5274F, 0.3061F, 0.0811F, 0.0173F));

		PartDefinition cube_r668 = jaw.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(110, 11).addBox(-0.9027F, 0.0247F, -3.9505F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2109F, -0.5201F, -3.6274F, 0.1576F, 0.0821F, 0.0116F));

		PartDefinition cube_r669 = jaw.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(117, 130).addBox(-0.3053F, -3.0043F, -3.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.4609F, -0.0201F, 0.4726F, 0.8988F, 0.1745F, 0.0F));

		PartDefinition cube_r670 = jaw.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(114, 25).addBox(-0.7739F, 0.761F, -1.8781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.2109F, -0.5201F, -3.6274F, 0.2536F, 0.0863F, 0.0127F));

		PartDefinition cube_r671 = jaw.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(125, 117).addBox(-0.8024F, 1.1823F, -0.8524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.2109F, -0.5201F, -3.6274F, -0.113F, 0.0821F, 0.0116F));

		PartDefinition cube_r672 = jaw.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(130, 114).addBox(-0.771F, 1.0481F, -0.9155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2109F, -0.5201F, -3.6274F, 0.2552F, 0.1728F, 0.0245F));

		PartDefinition cube_r673 = jaw.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(130, 101).addBox(-0.8758F, 0.0156F, -1.0361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2109F, -0.5201F, -3.6274F, 0.1548F, 0.1728F, 0.0245F));

		PartDefinition cube_r674 = jaw.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(130, 98).addBox(-0.9027F, 0.0034F, -1.9926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2109F, -0.5201F, -3.6274F, 0.1663F, 0.0821F, 0.0116F));

		PartDefinition cube_r675 = jaw.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(113, 102).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1709F, -0.2979F, -1.661F, -0.1124F, 0.1742F, 0.0077F));

		PartDefinition cube_r676 = jaw.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(61, 111).addBox(-0.4303F, -0.007F, -1.803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, -0.2094F, 0.1745F, 0.0F));

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