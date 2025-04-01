package fossils.fossils.client.blockentity.model.carcharodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CarcharodontosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart leftToes2;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart rightToes2;
	private final ModelPart tail1;
	private final ModelPart bone;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public CarcharodontosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.leftToes2 = this.leftFoot.getChild("leftToes2");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.rightToes2 = this.rightFoot.getChild("rightToes2");
		this.tail1 = this.hips.getChild("tail1");
		this.bone = this.tail1.getChild("bone");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -45.5743F, 4.5076F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(93, 66).addBox(-0.002F, 3.0285F, 0.2569F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.65F, -2.0F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, -0.9F, -2.5F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2156F, 3.743F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 15).mirror().addBox(1.9751F, 15.8464F, -3.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.0312F, -2.1468F, -0.1586F, 0.0191F, -0.1559F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(150, 7).mirror().addBox(2.022F, 11.2655F, -11.1731F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.0312F, -2.1468F, 0.3127F, 0.0191F, -0.1559F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(125, 144).mirror().addBox(2.022F, 3.3581F, -15.0889F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.0312F, -2.1468F, 0.9584F, 0.0191F, -0.1559F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(157, 104).mirror().addBox(2.022F, -13.5889F, -6.3581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.0312F, -2.1468F, 2.5292F, 0.0191F, -0.1559F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(101, 17).mirror().addBox(2.022F, 12.1718F, -9.3766F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.0312F, -2.1468F, 0.2603F, 0.0191F, -0.1559F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 138).mirror().addBox(0.1424F, -0.1593F, -1.4859F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3468F, 8.8753F, 12.5581F, 0.9809F, 0.0602F, -0.0468F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(134, 144).mirror().addBox(0.1424F, 5.9066F, 1.611F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3468F, 8.8753F, 12.5581F, 0.5795F, 0.0602F, -0.0468F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 138).mirror().addBox(0.1424F, 0.5314F, -1.6356F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3468F, 8.8753F, 12.5581F, 1.1903F, 0.0602F, -0.0468F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(144, 69).mirror().addBox(0.1936F, -0.0809F, -2.0684F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.5312F, 5.2532F, -2.1555F, 0.0F, 0.0524F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(147, 161).mirror().addBox(0.0F, -1.9017F, -2.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.2312F, 6.4532F, -0.6196F, 0.0F, 0.0524F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(19, 108).mirror().addBox(0.0F, -0.1831F, -6.9519F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.2312F, 6.4532F, -1.2305F, 0.0F, 0.0524F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(148, 42).mirror().addBox(0.0091F, -6.8902F, -5.2484F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.3557F, 7.5543F, -1.2661F, -0.3317F, 0.0457F, -0.0672F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(118, 28).mirror().addBox(0.0091F, -6.5819F, -3.4726F, 1.0F, 7.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.3557F, 7.5543F, -1.2661F, -0.9575F, -0.1002F, -0.0424F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(144, 60).mirror().addBox(0.0091F, -5.4133F, -2.5581F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3557F, 7.5543F, -1.2661F, 0.3141F, 0.0457F, -0.0672F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(39, 149).mirror().addBox(-0.7245F, 1.9079F, -8.8087F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2891F, -5.8917F, -0.5709F, 0.4559F, 0.3397F, 0.2774F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(143, 0).mirror().addBox(-0.7245F, 3.2726F, 2.4719F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2891F, -5.8917F, -0.5709F, -1.3068F, 0.3397F, 0.2774F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(142, 81).mirror().addBox(-0.7245F, 5.3196F, -3.4097F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2891F, -5.8917F, -0.5709F, -0.5214F, 0.3397F, 0.2774F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(109, 127).mirror().addBox(-0.7245F, 0.5145F, -5.0307F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2891F, -5.8917F, -0.5709F, -0.1724F, 0.3397F, 0.2774F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(110, 96).mirror().addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.822F, -1.4496F, 9.2558F, -0.2793F, -0.0917F, 0.4142F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(122, 50).mirror().addBox(-0.5431F, 1.7303F, -1.0189F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -5.4688F, 7.9532F, -0.0175F, -0.0917F, 0.4142F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(19, 87).mirror().addBox(-0.5431F, -0.246F, -0.2654F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -5.4688F, 7.9532F, -0.3927F, -0.0917F, 0.4142F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(96, 127).mirror().addBox(-0.7245F, -1.4567F, -4.8938F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2891F, -5.8917F, -0.5709F, 0.2465F, 0.3397F, 0.2774F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 146).mirror().addBox(0.0F, 0.7421F, 1.2925F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.0312F, -2.1468F, -0.5499F, 0.0457F, -0.3814F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(89, 145).mirror().addBox(2.022F, 9.6828F, 1.8055F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.0312F, -2.1468F, -0.4815F, 0.0191F, -0.1559F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(76, 133).mirror().addBox(-0.5F, -0.084F, -2.0125F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 3.5414F, 6.1894F, 0.8772F, 0.3443F, -0.2736F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(118, 144).mirror().addBox(0.272F, 4.5912F, 0.0186F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.0312F, -2.1468F, -0.2946F, 0.0397F, -0.3293F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(25, 146).mirror().addBox(0.0F, 1.0263F, -1.5727F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.0312F, -2.1468F, 0.0174F, 0.0457F, -0.3814F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(83, 138).mirror().addBox(-0.5F, -1.6858F, -0.1372F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 138).addBox(8.5F, -1.6858F, -0.1372F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 4.2312F, 2.3532F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.2F, 3.7F, -4.9F, 1.0F, 9.0F, 7.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(86, 0).addBox(8.2F, 3.7F, -4.9F, 1.0F, 9.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.5F, -6.1688F, 2.3532F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-0.5F, -1.5F, -5.0F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0587F, -5.0642F, 3.797F, -0.192F, 0.0F, 0.4014F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(110, 68).mirror().addBox(-4.0F, -1.2822F, 0.8974F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 68).addBox(1.0F, -1.2822F, 0.8974F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, -2.5F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(110, 96).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.822F, -1.4496F, 9.2558F, -0.2793F, 0.0917F, -0.4142F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(122, 50).addBox(-0.4569F, 1.7303F, -1.0189F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9F, -5.4688F, 7.9532F, -0.0175F, 0.0917F, -0.4142F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(19, 87).addBox(-0.4569F, -0.246F, -0.2654F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -5.4688F, 7.9532F, -0.3927F, 0.0917F, -0.4142F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(143, 0).addBox(-0.2755F, 3.2726F, 2.4719F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2891F, -5.8917F, -0.5709F, -1.3068F, -0.3397F, -0.2774F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(39, 149).addBox(-0.2755F, 1.9079F, -8.8087F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2891F, -5.8917F, -0.5709F, 0.4559F, -0.3397F, -0.2774F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(142, 81).addBox(-0.2755F, 5.3196F, -3.4097F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2891F, -5.8917F, -0.5709F, -0.5214F, -0.3397F, -0.2774F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(109, 127).addBox(-0.2755F, 0.5145F, -5.0307F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2891F, -5.8917F, -0.5709F, -0.1724F, -0.3397F, -0.2774F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(96, 127).addBox(-0.2755F, -1.4567F, -4.8938F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2891F, -5.8917F, -0.5709F, 0.2465F, -0.3397F, -0.2774F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(118, 28).addBox(-1.0091F, -6.5819F, -3.4726F, 1.0F, 7.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.3557F, 7.5543F, -1.2661F, -0.9575F, 0.1002F, 0.0424F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(48, 146).addBox(-1.0F, 0.7421F, 1.2925F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.0F, 6.0312F, -2.1468F, -0.5499F, -0.0457F, 0.3814F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(157, 104).addBox(-3.022F, -13.5889F, -6.3581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 6.0312F, -2.1468F, 2.5292F, -0.0191F, 0.1559F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(45, 15).addBox(-2.9751F, 15.8464F, -3.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.0F, 6.0312F, -2.1468F, -0.1586F, -0.0191F, 0.1559F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(150, 7).addBox(-3.022F, 11.2655F, -11.1731F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 6.0312F, -2.1468F, 0.3127F, -0.0191F, 0.1559F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(125, 144).addBox(-3.022F, 3.3581F, -15.0889F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.0F, 6.0312F, -2.1468F, 0.9584F, -0.0191F, 0.1559F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(101, 17).addBox(-3.022F, 12.1718F, -9.3766F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.0F, 6.0312F, -2.1468F, 0.2603F, -0.0191F, 0.1559F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(89, 145).addBox(-3.022F, 9.6828F, 1.8055F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 6.0312F, -2.1468F, -0.4815F, -0.0191F, 0.1559F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(134, 144).addBox(-1.1424F, 5.9066F, 1.611F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3468F, 8.8753F, 12.5581F, 0.5795F, -0.0602F, 0.0468F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(18, 138).addBox(-1.1424F, 0.5314F, -1.6356F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3468F, 8.8753F, 12.5581F, 1.1903F, -0.0602F, 0.0468F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 138).addBox(-1.1424F, -0.1593F, -1.4859F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3468F, 8.8753F, 12.5581F, 0.9809F, -0.0602F, 0.0468F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(76, 133).addBox(-0.5F, -0.084F, -2.0125F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 3.5414F, 6.1894F, 0.8772F, -0.3443F, 0.2736F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(118, 144).addBox(-1.272F, 4.5912F, 0.0186F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 6.0312F, -2.1468F, -0.2946F, -0.0397F, 0.3293F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(148, 42).addBox(-1.0091F, -6.8902F, -5.2484F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.3557F, 7.5543F, -1.2661F, -0.3317F, -0.0457F, 0.0672F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(144, 60).addBox(-1.0091F, -5.4133F, -2.5581F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3557F, 7.5543F, -1.2661F, 0.3141F, -0.0457F, 0.0672F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(25, 146).addBox(-1.0F, 1.0263F, -1.5727F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 6.0312F, -2.1468F, 0.0174F, -0.0457F, 0.3814F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(147, 161).addBox(-1.0F, -1.9017F, -2.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.0F, 4.2312F, 6.4532F, -0.6196F, 0.0F, -0.0524F));

		PartDefinition cube_r59 = hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(144, 69).addBox(-1.1936F, -0.0809F, -2.0684F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.0F, 0.5312F, 5.2532F, -2.1555F, 0.0F, -0.0524F));

		PartDefinition cube_r60 = hips.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(19, 108).addBox(-1.0F, -0.1831F, -6.9519F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 4.2312F, 6.4532F, -1.2305F, 0.0F, -0.0524F));

		PartDefinition cube_r61 = hips.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 47).addBox(-0.5F, -1.5F, -5.0F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0587F, -5.0642F, 3.797F, -0.192F, 0.0F, -0.4014F));

		PartDefinition cube_r62 = hips.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -1.9822F, -0.6026F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(84, 96).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 1.6698F, 1.509F, -0.183F, -0.0135F, -0.0415F));

		PartDefinition cube_r63 = leftLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 112).addBox(-6.5F, 4.0071F, -0.8306F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 11.9F, -1.9F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(50, 132).addBox(-5.5F, 0.0814F, -0.134F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 11.9F, -1.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(140, 90).addBox(-5.0F, -0.9F, -2.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.1F, 1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0135F, 1.0073F, 0.966F, -0.0212F, -0.0024F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(19, 119).addBox(-3.5F, -2.707F, -2.2331F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 2.5472F, -0.5117F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(133, 135).addBox(-6.7F, -6.3076F, 0.0149F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.0F, 8.4472F, -1.3117F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(122, 135).addBox(-6.7F, -0.0427F, -1.5558F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.0F, 2.7472F, 1.2883F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(149, 104).addBox(-2.5F, -0.0614F, -0.6714F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 2.7472F, 1.2883F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(39, 128).addBox(-6.7F, 0.0601F, -2.0879F, 3.0F, 8.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.0F, 8.6472F, 0.7883F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(149, 118).addBox(-2.5F, -2.6498F, -1.9321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.3472F, 1.5883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(144, 139).addBox(-2.5F, 0.0929F, -1.6136F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 8.6472F, 0.7883F, -0.4189F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(53, 122).addBox(-2.5F, -0.4447F, -0.8239F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 15.9357F, -3.4469F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(106, 84).addBox(-3.0F, -1.0134F, -3.2129F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3553F, 0.6261F, 1.2305F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5134F, -3.2129F, -1.1307F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftToes.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(45, 18).addBox(-4.6F, -1.0F, -3.25F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.5F, -2.75F, 0.0F, -0.0873F, 0.0F));

		PartDefinition leftToes2 = leftFoot.addOrReplaceChild("leftToes2", CubeListBuilder.create().texOffs(118, 41).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3106F, -0.5783F, -3.3157F, -1.1397F, 0.1388F, -0.1209F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(97, 96).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 1.6698F, 1.509F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(57, 114).addBox(1.5F, 4.0071F, -0.8306F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 11.9F, -1.9F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(63, 133).addBox(2.5F, 0.0814F, -0.134F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 11.9F, -1.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(140, 96).addBox(3.0F, -0.9F, -2.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.1F, 1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0135F, 1.0073F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(36, 119).addBox(0.5F, -2.707F, -2.2331F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 2.5472F, -0.5117F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(137, 46).addBox(3.7F, -6.3076F, 0.0149F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-4.0F, 8.4472F, -1.3117F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(26, 137).addBox(3.7F, -0.0427F, -1.5558F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.0F, 2.7472F, 1.2883F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(149, 139).addBox(1.5F, -0.0614F, -0.6714F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 2.7472F, 1.2883F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(131, 28).addBox(3.7F, 0.0601F, -2.0879F, 3.0F, 8.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.0F, 8.6472F, 0.7883F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(143, 149).addBox(1.5F, -2.6498F, -1.9321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 3.3472F, 1.5883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(84, 145).addBox(1.5F, 0.0929F, -1.6136F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 8.6472F, 0.7883F, -0.4189F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(68, 123).addBox(-2.5F, -0.4447F, -0.8239F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 15.9357F, -3.4469F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(110, 61).addBox(-3.0F, -1.0134F, -3.2129F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3553F, 0.6261F, 1.0559F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5134F, -3.2129F, 0.6583F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightToes.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 84).addBox(-0.4F, -1.0F, -3.25F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 0.5F, -2.75F, 0.0F, 0.0873F, 0.0F));

		PartDefinition rightToes2 = rightFoot.addOrReplaceChild("rightToes2", CubeListBuilder.create().texOffs(106, 118).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3106F, -0.5783F, -3.3157F, 0.5204F, -0.1473F, 0.0939F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2389F, 10.5829F, -0.1578F, -0.0855F, 0.0174F));

		PartDefinition cube_r85 = tail1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(10, 159).addBox(0.48F, -3.123F, -0.3546F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9438F, 13.3709F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(159, 0).addBox(0.5F, -3.0786F, -0.4314F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9438F, 13.3709F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(101, 155).addBox(0.5F, -4.3788F, -0.4419F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.9438F, 11.0709F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(84, 155).addBox(0.48F, -4.3234F, -0.3389F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.9438F, 11.0709F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(53, 155).addBox(0.48F, -4.2234F, -0.3389F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8438F, 8.1709F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(147, 154).addBox(0.502F, -4.2769F, -0.3983F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8438F, 8.1709F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(118, 137).addBox(0.502F, -4.0682F, -0.2987F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.9438F, 5.6709F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(118, 50).addBox(0.0F, -2.1F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, -3.9502F, 6.1534F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(90, 158).addBox(0.5F, -3.4473F, -1.0134F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3438F, 4.5709F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(155, 47).addBox(0.48F, 0.2499F, -1.1243F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.2438F, 3.5709F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(87, 158).addBox(0.502F, 1.8608F, -0.0196F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.8438F, 1.8709F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(158, 23).addBox(0.502F, 1.8608F, -0.0196F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.1438F, -0.6291F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(35, 155).addBox(0.48F, 0.8438F, -0.8548F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.9438F, 1.0709F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(112, 145).addBox(0.5F, 8.7871F, 9.4246F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 108).addBox(0.5F, 7.4871F, 7.4246F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 18).addBox(0.5F, 5.8871F, 5.4246F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 150).addBox(0.5F, 3.9871F, 3.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 146).addBox(0.5F, 1.9871F, 1.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 107).addBox(0.5F, -0.2129F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 2.0709F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(157, 146).addBox(0.5F, -5.9F, 1.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 50).addBox(-0.5F, -1.9F, 0.1F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 0.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(160, 47).mirror().addBox(-3.2802F, -0.3052F, 6.8724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 45).mirror().addBox(-2.8593F, -0.1587F, 4.512F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 43).mirror().addBox(-2.3953F, 0.0F, 1.9567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 41).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7495F, 6.3501F, 0.1608F, 0.2154F, 0.0347F));

		PartDefinition cube_r101 = tail1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(157, 65).mirror().addBox(-1.3167F, -1.3609F, -2.9818F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 31).mirror().addBox(-1.9F, -1.5257F, -0.3508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1562F, 4.0709F, 0.1608F, 0.2154F, 0.0347F));

		PartDefinition cube_r102 = tail1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(160, 47).addBox(1.2802F, -0.3052F, 6.8724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 45).addBox(0.8593F, -0.1587F, 4.512F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 43).addBox(0.3953F, 0.0F, 1.9567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 41).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7495F, 6.3501F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition cube_r103 = tail1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(157, 65).addBox(-0.6833F, -1.3609F, -2.9818F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 31).addBox(-0.1F, -1.5257F, -0.3508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.1562F, 4.0709F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0925F, 7.6858F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6938F, 15.7709F, 0.2588F, 0.2581F, 0.0442F));

		PartDefinition cube_r104 = tail2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(51, 162).addBox(0.5F, -2.0276F, -0.5638F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 15.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(162, 14).addBox(0.5F, -1.9435F, -1.0075F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 13.5F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(161, 90).addBox(0.5F, -2.1976F, -0.2199F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 10.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(81, 161).addBox(0.5F, -2.3266F, -0.04F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 7.5F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(78, 161).addBox(0.5F, -2.4632F, -0.1423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.65F, 4.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(162, 7).addBox(0.48F, -2.4336F, -0.0478F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.65F, 4.9F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(161, 74).addBox(0.48F, -3.2336F, -0.0478F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.15F, 2.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(161, 69).addBox(0.5F, -3.1632F, -0.1423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.15F, 2.7F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(104, 155).addBox(0.5F, -0.0874F, -0.0751F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 13.6F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(151, 60).addBox(0.5F, -0.4668F, -0.1421F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 11.5F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(13, 151).addBox(0.5F, -0.0168F, 0.023F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 9.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(10, 151).addBox(0.5F, 0.345F, -0.1749F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 6.8F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(61, 150).addBox(0.5F, 0.4458F, -0.126F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 4.2F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(115, 145).addBox(0.5F, 0.3524F, -0.1196F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 1.5F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 161).addBox(0.48F, -3.2628F, 0.0478F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.35F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(31, 163).mirror().addBox(0.0F, -3.0576F, 8.7963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 163).mirror().addBox(0.0F, -2.552F, 6.1365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(136, 162).mirror().addBox(0.0F, -2.3241F, 4.127F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(152, 161).mirror().addBox(0.0F, -1.9738F, 2.0468F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 61).mirror().addBox(0.0F, -1.5906F, -0.5423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2823F, 0.7502F, -0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r120 = tail2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(31, 163).addBox(0.0F, -3.0576F, 8.7963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 163).addBox(0.0F, -2.552F, 6.1365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 162).addBox(0.0F, -2.3241F, 4.127F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(152, 161).addBox(0.0F, -1.9738F, 2.0468F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 61).addBox(0.0F, -1.5906F, -0.5423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2823F, 0.7502F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r121 = tail2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(13, 159).addBox(0.5F, -3.284F, -0.0444F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.35F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r122 = tail2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(37, 50).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2627F, -0.0616F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0627F, 16.0384F, 0.1354F, 0.4359F, 0.0203F));

		PartDefinition cube_r123 = tail3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(124, 81).addBox(0.0F, -1.6525F, -0.2477F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.059F, 14.4976F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(62, 162).addBox(0.0F, -2.5942F, 10.9025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 51).addBox(0.0F, -2.3942F, 8.4025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 162).addBox(0.0F, -1.9942F, 5.4025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 128).addBox(0.0F, -1.7942F, 2.8025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 114).addBox(0.0F, -1.5942F, -0.2975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.059F, 1.3976F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r125 = tail3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(93, 161).addBox(0.0F, -0.1672F, -0.1912F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2196F, 14.1977F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(56, 159).addBox(0.0F, -0.5755F, -0.3559F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2196F, 12.2977F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(48, 159).addBox(0.5F, 3.2126F, 11.9249F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 159).addBox(0.5F, 2.7126F, 9.9249F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 157).addBox(0.5F, 1.6126F, 7.9249F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 157).addBox(0.5F, 1.4126F, 5.9249F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 157).addBox(0.5F, 0.7126F, 3.9249F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 155).addBox(0.5F, 0.3126F, 1.9249F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2873F, -2.4384F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 69).addBox(-1.0F, 0.1F, 0.2F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.059F, -0.4024F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.109F, 14.6976F, -0.0092F, -0.3054F, 0.0028F));

		PartDefinition cube_r129 = tail4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(74, 163).addBox(0.0F, -0.8F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 162).addBox(0.0F, -0.8F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 162).addBox(0.0F, -0.9F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 163).addBox(0.0F, -0.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 156).addBox(0.0F, -1.0F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 162).addBox(0.0F, -1.1F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 3).addBox(0.0F, -1.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 31).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6459F, 0.1329F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r130 = tail4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(162, 103).addBox(0.0F, 2.6328F, 13.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 162).addBox(0.0F, 2.2328F, 11.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 99).addBox(0.0F, 1.9328F, 9.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 162).addBox(0.0F, 1.6328F, 7.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 162).addBox(0.0F, 1.3328F, 5.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 162).addBox(0.0F, 1.0328F, 3.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 161).addBox(0.0F, -0.1672F, 1.8088F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3287F, -0.4999F, 0.2094F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, -0.4948F, -0.2213F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.005F))
				.texOffs(163, 82).addBox(0.0F, -1.1948F, -0.2213F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(163, 159).addBox(0.0F, -1.1948F, 1.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(161, 163).addBox(0.0F, -1.0948F, 3.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 119).addBox(0.0F, -0.9948F, 5.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 164).addBox(0.0F, -0.9948F, 7.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 164).addBox(0.0F, -0.8948F, 9.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5041F, 15.9329F, -0.0567F, -0.3921F, 0.0217F));

		PartDefinition cube_r131 = tail5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(158, 163).addBox(0.0F, 3.5062F, 10.1585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(163, 123).addBox(0.0F, 2.9062F, 8.1585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 162).addBox(0.0F, 1.4062F, 6.1585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 127).addBox(0.0F, 1.0062F, 4.1585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 162).addBox(0.0F, 0.5062F, 2.1585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 162).addBox(0.0F, 0.0062F, 0.1585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8246F, -0.4329F, 0.3578F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(35, 84).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4448F, 12.8787F, -0.1372F, -0.3027F, 0.0411F));

		PartDefinition cube_r132 = tail6.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(19, 164).addBox(0.0F, 4.6062F, 14.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 164).addBox(0.0F, 4.1062F, 12.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2694F, -13.3115F, 0.3578F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, -0.1614F, -0.0016F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.15F, 10.0F, -0.3289F, -0.3736F, 0.1239F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(64, 69).addBox(-1.0F, -1.669F, -19.9704F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -5.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(40, 96).addBox(-1.5F, 0.0F, -0.1F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -7.8704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(76, 151).addBox(0.0F, -4.9195F, -0.3541F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 151).addBox(0.0F, -4.6515F, 2.0901F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -18.4704F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(115, 155).addBox(-0.02F, -4.9578F, -0.3897F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 155).addBox(-0.02F, -4.9468F, 2.0692F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -18.4704F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(7, 151).addBox(0.0F, -5.3934F, 0.0538F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.569F, -2.0704F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(139, 150).addBox(-0.02F, -5.5007F, 0.3573F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.569F, -2.0704F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(154, 100).addBox(0.0F, -5.4839F, -0.088F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.469F, -4.6704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(70, 154).addBox(-0.02F, -5.5787F, 0.1398F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.469F, -4.6704F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(67, 154).addBox(0.0F, -5.3868F, -0.0515F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.569F, -7.3704F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(121, 153).addBox(-0.02F, -5.4844F, 0.183F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.569F, -7.3704F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(64, 154).addBox(0.0F, -4.8877F, -0.0253F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.669F, -9.6704F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(118, 153).addBox(-0.02F, -4.9884F, 0.2439F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.669F, -9.6704F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(153, 68).addBox(-0.02F, -4.9885F, 0.2439F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.669F, -12.0704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(154, 132).addBox(0.0F, -4.8878F, -0.0253F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.669F, -12.0704F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(25, 157).addBox(0.0F, -4.8931F, -0.32F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -13.9704F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(154, 60).addBox(-0.02F, -4.9732F, -0.0505F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -13.9704F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(150, 12).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.369F, -1.6704F, -0.0503F, -0.1303F, -1.4977F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(160, 145).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.369F, -1.6704F, -0.1375F, -0.0242F, -0.4696F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(158, 97).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.369F, -1.6704F, -0.1146F, -0.0799F, -0.903F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(158, 95).mirror().addBox(-4.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -4.2704F, -0.0239F, -0.0116F, -1.4126F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(160, 116).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -4.2704F, -0.0233F, 0.0018F, -0.3951F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(158, 34).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -4.2704F, -0.0262F, 0.0037F, -0.8194F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(160, 114).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -7.0704F, 0.2066F, 0.0734F, -0.2875F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(158, 29).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -7.0704F, 0.1569F, 0.1535F, -0.7193F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(101, 30).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -7.0704F, 0.0436F, 0.2148F, -1.3201F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(160, 112).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -9.0704F, 0.2173F, 0.0682F, -0.2525F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(157, 154).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -9.0704F, 0.1689F, 0.1533F, -0.6833F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(74, 66).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -9.0704F, 0.0537F, 0.2213F, -1.2837F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(161, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -11.2704F, 0.28F, 0.069F, -0.2161F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(28, 161).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -11.2704F, 0.2263F, 0.18F, -0.6416F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(106, 91).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -11.2704F, 0.0862F, 0.2753F, -1.2436F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-14.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -13.4704F, 0.0975F, 0.2807F, -1.2251F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(157, 152).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -13.4704F, 0.2385F, 0.1783F, -0.624F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(160, 88).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -13.4704F, 0.2903F, 0.0625F, -0.2F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(160, 86).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -15.9704F, 0.3183F, 0.0551F, -0.1657F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(157, 137).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -15.9704F, 0.2675F, 0.183F, -0.5862F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(93, 82).mirror().addBox(-16.6882F, -2.8327F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -15.9704F, 0.1193F, 0.3007F, -1.1862F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(74, 62).mirror().addBox(-17.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -18.4704F, 0.1228F, 0.3088F, -1.1851F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(157, 135).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -18.4704F, 0.2749F, 0.1878F, -0.5848F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(160, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -18.4704F, 0.3269F, 0.0566F, -0.1652F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(150, 12).addBox(2.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.369F, -1.6704F, -0.0503F, 0.1303F, 1.4977F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(160, 145).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.369F, -1.6704F, -0.1375F, 0.0242F, 0.4696F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(158, 97).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.369F, -1.6704F, -0.1146F, 0.0799F, 0.903F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(158, 95).addBox(2.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -4.2704F, -0.0239F, 0.0116F, 1.4126F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(160, 116).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -4.2704F, -0.0233F, -0.0018F, 0.3951F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(158, 34).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -4.2704F, -0.0262F, -0.0037F, 0.8194F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(160, 114).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -7.0704F, 0.2066F, -0.0734F, 0.2875F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(158, 29).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -7.0704F, 0.1569F, -0.1535F, 0.7193F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(101, 30).addBox(2.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -7.0704F, 0.0436F, -0.2148F, 1.3201F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(160, 112).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -9.0704F, 0.2173F, -0.0682F, 0.2525F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(157, 154).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -9.0704F, 0.1689F, -0.1533F, 0.6833F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(74, 66).addBox(2.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -9.0704F, 0.0537F, -0.2213F, 1.2837F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(161, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -11.2704F, 0.28F, -0.069F, 0.2161F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(28, 161).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -11.2704F, 0.2263F, -0.18F, 0.6416F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(106, 91).addBox(2.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -11.2704F, 0.0862F, -0.2753F, 1.2436F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(95, 57).addBox(2.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -13.4704F, 0.0975F, -0.2807F, 1.2251F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(157, 152).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -13.4704F, 0.2385F, -0.1783F, 0.624F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(160, 88).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -13.4704F, 0.2903F, -0.0625F, 0.2F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(160, 86).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -15.9704F, 0.3183F, -0.0551F, 0.1657F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(157, 137).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -15.9704F, 0.2675F, -0.183F, 0.5862F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(93, 82).addBox(2.6882F, -2.8327F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -15.9704F, 0.1193F, -0.3007F, 1.1862F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(74, 62).addBox(2.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -18.4704F, 0.1228F, -0.3088F, 1.1851F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(157, 135).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -18.4704F, 0.2749F, -0.1878F, 0.5848F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(160, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -18.4704F, 0.3269F, -0.0566F, 0.1652F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 15).addBox(-6.5F, -4.9364F, -1.2844F, 12.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 21.031F, -11.7704F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 0).addBox(-8.5F, -4.5445F, -1.2032F, 16.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 17.931F, -20.2704F, -0.3316F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.069F, -19.8704F, 0.1314F, 0.0865F, 0.0114F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(120, 26).mirror().addBox(-12.1216F, 1.4558F, -0.6188F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9173F, 14.5958F, -10.2931F, -0.6034F, 1.1012F, 0.1782F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(149, 116).mirror().addBox(-3.5358F, 0.1741F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9173F, 14.5958F, -10.2931F, -0.9935F, 0.8193F, -0.2906F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(101, 28).mirror().addBox(-10.1216F, 1.4558F, -0.6188F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9173F, 14.5958F, -10.2931F, -0.4369F, 0.9876F, 0.3518F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(149, 114).mirror().addBox(-3.5358F, 0.1741F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9173F, 14.5958F, -10.2931F, -0.8144F, 0.7568F, -0.1339F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(149, 112).mirror().addBox(-3.5358F, 0.1741F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9173F, 14.5958F, -10.2931F, -0.9404F, 0.5973F, 0.2244F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(140, 102).mirror().addBox(-8.1216F, 1.4558F, -0.6188F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9173F, 14.5958F, -10.2931F, -0.6977F, 0.8814F, 0.579F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(148, 21).mirror().addBox(-7.1216F, 1.4558F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9173F, 13.8958F, -10.9931F, -0.1957F, 0.5852F, 1.0792F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(150, 147).mirror().addBox(-0.1956F, -1.9498F, -1.9038F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.0547F, -2.947F, 0.8702F, 1.5556F, 0.0475F, 0.0934F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(150, 55).mirror().addBox(-0.5F, -1.5F, 0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.0547F, -0.647F, -1.0298F, 0.3687F, 0.0475F, 0.0934F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(110, 106).mirror().addBox(0.0F, -2.3496F, -5.9995F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 8.731F, -10.0512F, 0.7184F, -0.7298F, -0.4276F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(138, 117).mirror().addBox(-0.5F, -1.5228F, -3.924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5F, 6.531F, -6.7512F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(7, 138).mirror().addBox(-0.5F, -1.4228F, -3.924F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5F, 6.531F, -6.7512F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(123, 118).mirror().addBox(0.1F, -1.4844F, -0.3452F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.1F, 6.631F, -6.7512F, 0.9076F, 0.0F, 0.0175F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(131, 60).mirror().addBox(-0.0152F, -0.1628F, 0.046F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 1.431F, -4.4512F, 0.7702F, 0.0475F, 0.0934F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(161, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -10.5F, 0.3431F, 0.0654F, -0.1986F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(159, 141).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -10.5F, 0.2863F, 0.2025F, -0.617F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(124, 14).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -10.5F, 0.1237F, 0.3272F, -1.2193F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(161, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -8.2F, 0.2925F, 0.0508F, -0.1671F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(159, 139).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -8.2F, 0.2454F, 0.1685F, -0.59F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(95, 59).mirror().addBox(-14.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -8.2F, 0.1091F, 0.2765F, -1.1891F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(161, 23).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -5.8F, 0.2408F, 0.042F, -0.1694F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(159, 21).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -5.8F, 0.2015F, 0.1392F, -0.5968F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(45, 28).mirror().addBox(-15.6882F, -2.8327F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -5.8F, 0.0891F, 0.2278F, -1.1941F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(160, 149).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.3F, 0.1891F, 0.0331F, -0.1714F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(159, 19).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.3F, 0.1579F, 0.1097F, -0.6022F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(81, 94).mirror().addBox(-16.6882F, -2.8327F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.3F, 0.0695F, 0.1791F, -1.198F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(74, 64).mirror().addBox(-17.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.6F, 0.0599F, 0.1547F, -1.1996F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(159, 12).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.6F, 0.1362F, 0.0948F, -0.6044F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(160, 147).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.6F, 0.1633F, 0.0287F, -0.1722F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(129, 68).mirror().addBox(0.0F, -0.5F, -2.8F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 11.506F, -13.3162F, -1.0647F, -0.2472F, 0.4157F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(148, 19).mirror().addBox(-3.5358F, 0.1741F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9173F, 13.8958F, -10.9931F, -0.4119F, 0.4684F, 0.6548F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(150, 147).addBox(-0.8044F, -1.9498F, -1.9038F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.0547F, -2.947F, 0.8702F, 1.5556F, -0.0475F, -0.0934F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(150, 55).addBox(-0.5F, -1.5F, 0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.0547F, -0.647F, -1.0298F, 0.3687F, -0.0475F, -0.0934F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(110, 106).addBox(-1.0F, -2.3496F, -5.9995F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 8.731F, -10.0512F, 0.7184F, 0.7298F, 0.4276F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(138, 117).addBox(-0.5F, -1.5228F, -3.924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, 6.531F, -6.7512F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(7, 138).addBox(-0.5F, -1.4228F, -3.924F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, 6.531F, -6.7512F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(123, 118).addBox(-1.1F, -1.4844F, -0.3452F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1F, 6.631F, -6.7512F, 0.9076F, 0.0F, -0.0175F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(131, 60).addBox(-0.9848F, -0.1628F, 0.046F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9F, 1.431F, -4.4512F, 0.7702F, -0.0475F, -0.0934F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(138, 111).addBox(-1.0F, -2.2141F, -0.0945F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(127, 155).addBox(-0.02F, -4.5677F, -0.9354F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.2F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(124, 155).addBox(0.0F, -4.5885F, -0.9376F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(121, 161).addBox(-0.02F, -4.5551F, -0.0251F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(161, 118).addBox(0.002F, -4.6887F, -0.567F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.6F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(162, 131).addBox(0.0F, -1.7664F, -0.1422F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(73, 159).addBox(-0.02F, 2.614F, -4.2368F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8738F, -5.4589F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(161, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -10.5F, 0.3431F, -0.0654F, 0.1986F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(159, 141).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -10.5F, 0.2863F, -0.2025F, 0.617F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(124, 14).addBox(2.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -10.5F, 0.1237F, -0.3272F, 1.2193F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(161, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -8.2F, 0.2925F, -0.0508F, 0.1671F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(159, 139).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -8.2F, 0.2454F, -0.1685F, 0.59F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(95, 59).addBox(2.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -8.2F, 0.1091F, -0.2765F, 1.1891F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(161, 23).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -5.8F, 0.2408F, -0.042F, 0.1694F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(159, 21).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -5.8F, 0.2015F, -0.1392F, 0.5968F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(45, 28).addBox(2.6882F, -2.8327F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -5.8F, 0.0891F, -0.2278F, 1.1941F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(160, 149).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.3F, 0.1891F, -0.0331F, 0.1714F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(159, 19).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.3F, 0.1579F, -0.1097F, 0.6022F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(81, 94).addBox(2.6882F, -2.8327F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.3F, 0.0695F, -0.1791F, 1.198F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(74, 64).addBox(2.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.6F, 0.0599F, -0.1547F, 1.1996F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(159, 12).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.6F, 0.1362F, -0.0948F, 0.6044F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(160, 147).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.6F, 0.1633F, -0.0287F, 0.1722F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(158, 123).addBox(0.002F, 3.2456F, -2.1596F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8738F, -5.4589F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(118, 161).addBox(0.0F, -3.0543F, 2.7502F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 159).addBox(0.0F, -3.4543F, 0.3502F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -9.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(110, 161).addBox(0.0F, -2.7326F, 0.0307F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -11.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(129, 68).addBox(-2.0F, -0.5F, -2.8F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 11.506F, -13.3162F, -1.0647F, 0.2472F, -0.4157F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(149, 116).addBox(-0.4642F, 0.1741F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9173F, 14.5958F, -10.2931F, -0.9935F, -0.8193F, 0.2906F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(120, 26).addBox(3.1216F, 1.4558F, -0.6188F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9173F, 14.5958F, -10.2931F, -0.6034F, -1.1012F, -0.1782F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(149, 114).addBox(-0.4642F, 0.1741F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9173F, 14.5958F, -10.2931F, -0.8144F, -0.7568F, 0.1339F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(101, 28).addBox(3.1216F, 1.4558F, -0.6188F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9173F, 14.5958F, -10.2931F, -0.4369F, -0.9876F, -0.3518F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(140, 102).addBox(3.1216F, 1.4558F, -0.6188F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9173F, 14.5958F, -10.2931F, -0.6977F, -0.8814F, -0.579F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(149, 112).addBox(-0.4642F, 0.1741F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9173F, 14.5958F, -10.2931F, -0.9404F, -0.5973F, -0.2244F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(148, 21).addBox(3.1216F, 1.4558F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9173F, 13.8958F, -10.9931F, -0.1957F, -0.5852F, -1.0792F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(148, 19).addBox(-0.4642F, 0.1741F, -0.6188F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9173F, 13.8958F, -10.9931F, -0.4119F, -0.4684F, -0.6548F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(97, 42).addBox(-3.0F, -1.104F, 0.0937F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 13.4427F, -12.8182F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(137, 127).addBox(-1.0F, 2.5F, -3.8F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 11.4427F, -9.8182F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(58, 84).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -12.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(8.5484F, 10.9204F, -8.6532F, 0.6438F, 0.4012F, -0.1159F));

		PartDefinition cube_r273 = leftArm1.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(157, 127).addBox(-1.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.4893F, 0.2018F, -0.7676F, 0.1498F));

		PartDefinition cube_r274 = leftArm1.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(79, 157).addBox(-1.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.4893F, 0.5713F, -0.6678F, 0.2037F));

		PartDefinition cube_r275 = leftArm1.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(40, 155).addBox(6.0F, -1.6842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftArm1.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(157, 7).addBox(6.0F, 0.7F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.5F, 0.8847F, -0.8107F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(0, 155).addBox(-0.8F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 140).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 5.0347F, 0.6893F, -1.0036F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(83, 127).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.5484F, 10.9204F, -8.6532F, 0.1128F, -0.2618F, 0.0047F));

		PartDefinition cube_r277 = rightArm1.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(157, 131).addBox(0.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.4893F, 0.2018F, 0.7676F, -0.1498F));

		PartDefinition cube_r278 = rightArm1.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(157, 100).addBox(0.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.4893F, 0.5713F, 0.6678F, -0.2037F));

		PartDefinition cube_r279 = rightArm1.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(155, 42).addBox(-7.0F, -1.6842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightArm1.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(157, 14).addBox(-7.0F, 0.7F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.5F, 0.8847F, -0.8107F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(30, 155).addBox(-0.2F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 154).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 5.0347F, 0.6893F, -1.0036F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(127, 93).addBox(0.0F, 0.0F, -2.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, -0.4363F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -12.0F, -0.3957F, 0.6088F, 0.2003F));

		PartDefinition cube_r281 = neck1.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(133, 155).addBox(0.0F, -0.1F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2932F, -3.2134F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r282 = neck1.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(130, 155).addBox(0.0F, -3.8385F, 0.7884F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8415F, -5.552F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r283 = neck1.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(76, 114).addBox(-1.0F, -2.0F, 0.1F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.7415F, -5.052F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r284 = neck1.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(157, 63).mirror().addBox(-1.9601F, -0.0556F, -0.5554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.451F, -3.8399F, 1.1548F, 0.686F, -0.5342F));

		PartDefinition cube_r285 = neck1.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(112, 93).mirror().addBox(-6.7529F, -0.8788F, -0.5554F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.451F, -3.8399F, 0.8741F, 1.0618F, -0.8923F));

		PartDefinition cube_r286 = neck1.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(138, 125).mirror().addBox(-7.7157F, -2.8222F, -0.3799F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7474F, -1.8213F, 0.384F, 1.0945F, -1.1988F));

		PartDefinition cube_r287 = neck1.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(157, 59).mirror().addBox(-2.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7474F, -1.8213F, 1.1072F, 0.3157F, -0.2087F));

		PartDefinition cube_r288 = neck1.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(157, 55).mirror().addBox(-3.8295F, -0.8211F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7474F, -1.8213F, 0.984F, 0.6955F, -0.4574F));

		PartDefinition cube_r289 = neck1.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(157, 63).addBox(-0.0399F, -0.0556F, -0.5554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.451F, -3.8399F, 1.1548F, -0.686F, 0.5342F));

		PartDefinition cube_r290 = neck1.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(112, 93).addBox(1.7529F, -0.8788F, -0.5554F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.451F, -3.8399F, 0.8741F, -1.0618F, 0.8923F));

		PartDefinition cube_r291 = neck1.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(138, 125).addBox(2.7157F, -2.8222F, -0.3799F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7474F, -1.8213F, 0.384F, -1.0945F, 1.1988F));

		PartDefinition cube_r292 = neck1.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(157, 59).addBox(0.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7474F, -1.8213F, 1.1072F, -0.3157F, 0.2087F));

		PartDefinition cube_r293 = neck1.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(157, 55).addBox(1.8295F, -0.8211F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7474F, -1.8213F, 0.984F, -0.6955F, 0.4574F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7415F, -4.952F, 0.4112F, 0.7051F, 0.609F));

		PartDefinition cube_r294 = neck2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(155, 159).addBox(0.0F, 0.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3088F, -1.582F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r295 = neck2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(139, 159).addBox(0.0F, 0.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8183F, -3.2832F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r296 = neck2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(127, 104).mirror().addBox(-5.8057F, -0.8639F, -0.554F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6417F, -6.5806F, 0.2024F, 0.9879F, -1.2555F));

		PartDefinition cube_r297 = neck2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(157, 57).mirror().addBox(-2.0016F, -0.0199F, -0.554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6417F, -6.5806F, 0.6988F, 0.7893F, -0.6272F));

		PartDefinition cube_r298 = neck2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(45, 157).mirror().addBox(-1.9767F, -0.0539F, -0.3345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1343F, -3.2954F, 0.6035F, 0.7357F, -0.6931F));

		PartDefinition cube_r299 = neck2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(142, 88).mirror().addBox(-5.7687F, -0.8843F, -0.3345F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1343F, -3.2954F, 0.1587F, 0.9044F, -1.291F));

		PartDefinition cube_r300 = neck2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(138, 123).mirror().addBox(-6.6888F, -0.8865F, -0.5178F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1018F, -1.0753F, 0.2721F, 1.0865F, -1.1955F));

		PartDefinition cube_r301 = neck2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(157, 61).mirror().addBox(-1.9053F, -0.0897F, -0.5178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1018F, -1.0753F, 0.827F, 0.8468F, -0.5336F));

		PartDefinition cube_r302 = neck2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(127, 104).addBox(1.8057F, -0.8639F, -0.554F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6417F, -6.5806F, 0.2024F, -0.9879F, 1.2555F));

		PartDefinition cube_r303 = neck2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(157, 57).addBox(0.0016F, -0.0199F, -0.554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6417F, -6.5806F, 0.6988F, -0.7893F, 0.6272F));

		PartDefinition cube_r304 = neck2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(45, 157).addBox(-0.0233F, -0.0539F, -0.3345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1343F, -3.2954F, 0.6035F, -0.7357F, 0.6931F));

		PartDefinition cube_r305 = neck2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(142, 88).addBox(1.7687F, -0.8843F, -0.3345F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1343F, -3.2954F, 0.1587F, -0.9044F, 1.291F));

		PartDefinition cube_r306 = neck2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(138, 123).addBox(1.6888F, -0.8865F, -0.5178F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1018F, -1.0753F, 0.2721F, -1.0865F, 1.1955F));

		PartDefinition cube_r307 = neck2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(157, 61).addBox(-0.0947F, -0.0897F, -0.5178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1018F, -1.0753F, 0.827F, -0.8468F, 0.5336F));

		PartDefinition cube_r308 = neck2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(89, 152).addBox(0.0F, -2.6903F, -4.6933F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(79, 151).addBox(0.0F, -2.6903F, -1.6933F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -5.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r309 = neck2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(74, 18).addBox(-1.0F, -0.1F, -4.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -6.3F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0092F, -10.2773F, 0.3227F, 0.5454F, 0.3421F));

		PartDefinition cube_r310 = neck3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(156, 78).addBox(-0.02F, 1.7F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4533F, -1.646F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r311 = neck3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(156, 73).addBox(0.5F, -1.72F, -0.0097F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0365F, -2.0325F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r312 = neck3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(151, 80).addBox(0.5F, -2.8857F, -0.1876F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7365F, -4.1325F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r313 = neck3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(156, 68).addBox(0.5F, -1.6101F, -0.5583F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7365F, -6.2325F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r314 = neck3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, -0.1185F, -6.9683F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1365F, 0.3675F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r315 = neck3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(159, 143).mirror().addBox(-3.7622F, -0.8631F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0577F, -2.6289F, 0.1052F, 0.7694F, -1.3309F));

		PartDefinition cube_r316 = neck3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(157, 37).mirror().addBox(-1.9618F, -0.0375F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0577F, -2.6289F, 0.4694F, 0.6419F, -0.7785F));

		PartDefinition cube_r317 = neck3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(151, 32).mirror().addBox(-4.6872F, -0.8836F, -0.5678F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0587F, -0.785F, 0.0886F, 0.7185F, -1.3421F));

		PartDefinition cube_r318 = neck3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(137, 133).mirror().addBox(-1.9025F, -0.0878F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0587F, -0.785F, 0.4241F, 0.6046F, -0.805F));

		PartDefinition cube_r319 = neck3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(129, 90).mirror().addBox(-5.8788F, -0.8475F, -0.612F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0269F, 0.7444F, 0.111F, 0.7864F, -1.3268F));

		PartDefinition cube_r320 = neck3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(157, 39).mirror().addBox(-2.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0269F, 0.7444F, 0.4851F, 0.6541F, -0.7691F));

		PartDefinition cube_r321 = neck3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(159, 143).addBox(1.7622F, -0.8631F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0577F, -2.6289F, 0.1052F, -0.7694F, 1.3309F));

		PartDefinition cube_r322 = neck3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(157, 37).addBox(-0.0382F, -0.0375F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0577F, -2.6289F, 0.4694F, -0.6419F, 0.7785F));

		PartDefinition cube_r323 = neck3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(151, 32).addBox(1.6872F, -0.8836F, -0.5678F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0587F, -0.785F, 0.0886F, -0.7185F, 1.3421F));

		PartDefinition cube_r324 = neck3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(137, 133).addBox(-0.0975F, -0.0878F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0587F, -0.785F, 0.4241F, -0.6046F, 0.805F));

		PartDefinition cube_r325 = neck3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(129, 90).addBox(1.8788F, -0.8475F, -0.612F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0269F, 0.7444F, 0.111F, -0.7864F, 1.3268F));

		PartDefinition cube_r326 = neck3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(157, 39).addBox(0.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0269F, 0.7444F, 0.4851F, -0.6541F, 0.7691F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6518F, -7.368F, 0.626F, 0.5819F, 0.1326F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(95, 47).addBox(-2.0F, -2.0276F, -0.0278F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.708F, -6.3541F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(19, 96).addBox(-1.5F, -3.99F, 0.0109F, 3.0F, 4.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.0218F, -10.2418F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(93, 114).addBox(-1.5F, -3.0F, -0.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.3405F, -11.4932F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(40, 107).addBox(-1.5F, -5.9705F, -0.0472F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0782F, -15.8418F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(137, 55).addBox(-1.5F, 2.4856F, -3.0602F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.2782F, -17.0418F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(0, 128).addBox(-1.5F, -3.3119F, -1.8301F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1782F, -17.5418F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(125, 106).addBox(-1.0F, -5.9961F, 0.0326F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2357F, -20.7125F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(46, 153).addBox(-1.0F, -1.9426F, 0.0181F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7357F, -21.8125F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(97, 32).addBox(-1.5F, -1.9832F, -6.9204F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.8791F, -8.1231F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(142, 160).addBox(-0.5F, -7.6123F, -3.1519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 12.2791F, -16.2231F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(135, 16).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.6707F, -19.0944F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(155, 156).addBox(-1.0F, -1.5396F, -6.097F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(156, 83).addBox(-1.0F, -2.1396F, -6.097F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.6029F, -15.6281F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(37, 145).addBox(-1.5F, -0.9957F, -1.9045F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.5029F, -18.9781F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(144, 76).addBox(-1.5F, -2.1396F, -5.197F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.6029F, -15.6781F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(124, 7).addBox(-2.0F, -1.8986F, -0.0406F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 6.7282F, -16.1551F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(129, 75).addBox(-2.0F, -1.8492F, -0.4239F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 6.4282F, -18.7551F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(61, 105).addBox(-2.0F, -0.8129F, -4.8713F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9282F, -7.5551F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(83, 123).addBox(-1.0F, 0.0155F, -0.3869F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -2.4865F, -2.8188F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(110, 76).addBox(-3.5F, -1.9317F, -1.893F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8718F, 0.3449F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(61, 96).addBox(-4.0F, -0.0118F, -2.895F, 8.0F, 5.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.8718F, 0.2449F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(103, 0).addBox(-4.0F, -3.0657F, 0.0105F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.6282F, -2.1551F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6718F, 0.2449F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(35, 160).addBox(3.0F, 0.0151F, -0.982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.2F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(150, 156).addBox(3.0F, -3.068F, -0.1654F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1F, 1.8F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(110, 156).addBox(3.0F, -2.4859F, 0.7733F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2F, 0.7F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(13, 128).addBox(-1.0F, -3.99F, 0.0109F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.5F, -1.35F, -10.4867F, -1.3946F, 0.1375F, 0.0244F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(152, 4).addBox(-1.77F, -2.4691F, 3.6145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(151, 34).addBox(-2.05F, -2.4691F, 3.6145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.25F, -8.8F, -0.0062F, 0.3107F, -0.0525F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(94, 156).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.03F, 3.835F, -19.2076F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(103, 7).addBox(-3.5413F, 2.8472F, 0.439F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 1.85F, -8.1F, -0.0727F, 0.3021F, 0.0514F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(141, 7).addBox(1.03F, -2.8724F, -0.6192F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 4.6F, -12.2F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 149).addBox(-0.4F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.13F, 3.9627F, -9.0246F, 0.0089F, 0.1745F, 0.0015F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(154, 108).addBox(-0.6F, -0.85F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(153, 86).addBox(-0.6F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1801F, 3.0788F, -13.4215F, 0.4275F, -0.0336F, 0.0286F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(151, 23).addBox(-0.9747F, -2.0055F, -1.9622F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 4.85F, -12.0867F, -0.2757F, 0.0118F, 0.0186F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(142, 30).addBox(-0.5F, -0.5245F, -1.6236F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0947F, 2.1981F, -10.7311F, -0.9795F, -0.0117F, -0.0202F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(7, 145).addBox(-0.5F, -1.9626F, -1.7007F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0947F, 2.1981F, -10.7311F, -1.311F, 0.0389F, -0.0068F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(32, 149).addBox(-0.5034F, -2.3832F, 0.5701F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4485F, 1.9943F, -8.0516F, -2.3724F, 0.2845F, -0.037F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(96, 137).addBox(-0.5034F, -1.2219F, -1.9174F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5485F, 1.9943F, -8.0516F, -1.5589F, 0.2322F, -0.0365F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(161, 108).addBox(-0.5034F, -0.1502F, -2.274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.5485F, 1.9943F, -8.0516F, -2.065F, 0.2322F, -0.0365F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(5, 160).addBox(-0.5034F, -0.9356F, -2.277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.4485F, 1.9943F, -8.0516F, -1.2991F, 0.2845F, -0.037F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(37, 139).addBox(3.0F, -1.0028F, -3.0295F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.02F, 4.2365F, -2.9703F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(125, 150).addBox(3.0F, -1.9393F, -0.0736F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.02F, 5.1365F, -2.8703F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(32, 146).addBox(3.0F, -1.0599F, -1.0284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, 1.2365F, -2.8703F, -2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(161, 79).addBox(3.0F, 0.0468F, -0.9638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, 5.0365F, -0.0703F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(150, 152).addBox(3.0F, 0.0468F, -1.9638F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, 4.0365F, -0.0703F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(103, 150).addBox(3.0F, 0.1993F, -2.0464F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, 2.0365F, -0.8703F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(156, 90).addBox(3.0F, 0.0123F, -0.9563F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.02F, 0.5365F, -0.2703F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(158, 159).addBox(3.0F, -0.074F, 0.0299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, -0.1635F, -0.9703F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(151, 90).addBox(3.0F, -1.8F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.02F, 1.5365F, -1.2703F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(66, 148).addBox(-1.3201F, 0.0091F, 0.2066F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.894F, 1.5117F, -5.6557F, 0.0374F, 0.3107F, -0.0525F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(94, 152).addBox(-1.035F, -0.0313F, -0.9066F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0598F, -0.1257F, -3.9401F, -0.3029F, 0.3107F, -0.0525F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(135, 23).addBox(-1.2946F, 0.1186F, 0.2613F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8205F, -0.3132F, -5.5026F, 0.6047F, 0.3107F, -0.0525F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(96, 145).addBox(-1.87F, -2.5691F, 3.5145F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 2.25F, -8.8F, -0.0062F, 0.3107F, -0.0525F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 120).addBox(-3.9141F, -0.1305F, 0.0004F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4F, -1.95F, -5.4F, -0.1608F, 0.2591F, -0.0437F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(122, 127).addBox(-2.8842F, -2.5392F, 0.5635F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.7F, 1.85F, -8.1F, 0.2556F, 0.3107F, -0.0525F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(74, 32).addBox(-1.8842F, -1.6691F, -2.3855F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 1.85F, -8.1F, -0.0062F, 0.3107F, -0.0525F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(138, 104).addBox(-1.0337F, -0.132F, -0.0447F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9956F, -1.7237F, -4.6771F, -1.5507F, -0.0103F, 0.5492F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(59, 141).addBox(-0.9985F, 4.6931F, -1.1922F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9956F, -1.7237F, -4.6771F, -1.1487F, -0.0018F, 0.547F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(150, 127).addBox(-0.964F, -0.0076F, -0.3022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5547F, -0.6071F, -4.3777F, -0.0308F, 0.1126F, 1.4652F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(40, 160).addBox(0.1F, -0.7F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3326F, -1.1385F, -3.3204F, 0.7275F, 0.5724F, 1.8383F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(148, 49).addBox(-1.0337F, 1.7987F, -0.5299F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9956F, -1.7237F, -4.6771F, -1.2889F, -0.0103F, 0.5492F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6718F, 0.2449F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(35, 160).mirror().addBox(-4.0F, 0.0151F, -0.982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 0.2F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(150, 156).mirror().addBox(-4.0F, -3.068F, -0.1654F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1F, 1.8F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(110, 156).mirror().addBox(-4.0F, -2.4859F, 0.7733F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2F, 0.7F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(13, 128).mirror().addBox(0.0F, -3.99F, 0.0109F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.35F, -10.4867F, -1.3946F, -0.1375F, -0.0244F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(152, 4).mirror().addBox(-0.23F, -2.4691F, 3.6145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(151, 34).mirror().addBox(0.05F, -2.4691F, 3.6145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.25F, -8.8F, -0.0062F, -0.3107F, 0.0525F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(94, 156).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.03F, 3.835F, -19.2076F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(103, 7).mirror().addBox(-0.4587F, 2.8472F, 0.439F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.85F, -8.1F, -0.0727F, -0.3021F, -0.0514F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(141, 7).mirror().addBox(-2.03F, -2.8724F, -0.6192F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 4.6F, -12.2F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 149).mirror().addBox(-0.6F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.13F, 3.9627F, -9.0246F, 0.0089F, -0.1745F, -0.0015F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(154, 108).mirror().addBox(-0.4F, -0.85F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(153, 86).mirror().addBox(-0.4F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1801F, 3.0788F, -13.4215F, 0.4275F, 0.0336F, -0.0286F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(151, 23).mirror().addBox(-0.0253F, -2.0055F, -1.9622F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.85F, -12.0867F, -0.2757F, -0.0118F, -0.0186F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(142, 30).mirror().addBox(-0.5F, -0.5245F, -1.6236F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0947F, 2.1981F, -10.7311F, -0.9795F, 0.0117F, 0.0202F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(7, 145).mirror().addBox(-0.5F, -1.9626F, -1.7007F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0947F, 2.1981F, -10.7311F, -1.311F, -0.0389F, 0.0068F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(32, 149).mirror().addBox(-0.4966F, -2.3832F, 0.5701F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4485F, 1.9943F, -8.0516F, -2.3724F, -0.2845F, 0.037F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(96, 137).mirror().addBox(-0.4966F, -1.2219F, -1.9174F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5485F, 1.9943F, -8.0516F, -1.5589F, -0.2322F, 0.0365F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(161, 108).mirror().addBox(-0.4966F, -0.1502F, -2.274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5485F, 1.9943F, -8.0516F, -2.065F, -0.2322F, 0.0365F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(5, 160).mirror().addBox(-0.4966F, -0.9356F, -2.277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4485F, 1.9943F, -8.0516F, -1.2991F, -0.2845F, 0.037F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(37, 139).mirror().addBox(-4.0F, -1.0028F, -3.0295F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 4.2365F, -2.9703F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(125, 150).mirror().addBox(-4.0F, -1.9393F, -0.0736F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 5.1365F, -2.8703F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(32, 146).mirror().addBox(-4.0F, -1.0599F, -1.0284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 1.2365F, -2.8703F, -2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(161, 79).mirror().addBox(-4.0F, 0.0468F, -0.9638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 5.0365F, -0.0703F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(150, 152).mirror().addBox(-4.0F, 0.0468F, -1.9638F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 4.0365F, -0.0703F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(103, 150).mirror().addBox(-4.0F, 0.1993F, -2.0464F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 2.0365F, -0.8703F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(156, 90).mirror().addBox(-4.0F, 0.0123F, -0.9563F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 0.5365F, -0.2703F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(158, 159).mirror().addBox(-4.0F, -0.074F, 0.0299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, -0.1635F, -0.9703F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(151, 90).mirror().addBox(-4.0F, -1.8F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 1.5365F, -1.2703F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(66, 148).mirror().addBox(-0.6799F, 0.0091F, 0.2066F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.894F, 1.5117F, -5.6557F, 0.0374F, -0.3107F, 0.0525F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(94, 152).mirror().addBox(-0.965F, -0.0313F, -0.9066F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0598F, -0.1257F, -3.9401F, -0.3029F, -0.3107F, 0.0525F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(135, 23).mirror().addBox(-0.7054F, 0.1186F, 0.2613F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8205F, -0.3132F, -5.5026F, 0.6047F, -0.3107F, 0.0525F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(96, 145).mirror().addBox(-0.13F, -2.5691F, 3.5145F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.25F, -8.8F, -0.0062F, -0.3107F, 0.0525F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-0.0859F, -0.1305F, 0.0004F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4F, -1.95F, -5.4F, -0.1608F, -0.2591F, 0.0437F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(122, 127).mirror().addBox(-0.1158F, -2.5392F, 0.5635F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.85F, -8.1F, 0.2556F, -0.3107F, 0.0525F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-0.1158F, -1.6691F, -2.3855F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.85F, -8.1F, -0.0062F, -0.3107F, 0.0525F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(138, 104).mirror().addBox(0.0337F, -0.132F, -0.0447F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9956F, -1.7237F, -4.6771F, -1.5507F, 0.0103F, -0.5492F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(59, 141).mirror().addBox(-0.0015F, 4.6931F, -1.1922F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9956F, -1.7237F, -4.6771F, -1.1487F, 0.0018F, -0.547F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(150, 127).mirror().addBox(-0.036F, -0.0076F, -0.3022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5547F, -0.6071F, -4.3777F, -0.0308F, -0.1126F, -1.4652F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(40, 160).mirror().addBox(-1.1F, -0.7F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3326F, -1.1385F, -3.3204F, 0.7275F, -0.5724F, -1.8383F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(148, 49).mirror().addBox(0.0337F, 1.7987F, -0.5299F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9956F, -1.7237F, -4.6771F, -1.2889F, 0.0103F, -0.5492F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4138F, 2.5387F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(103, 145).mirror().addBox(-4.0F, 0.05F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 1.2F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(132, 150).mirror().addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.0268F, -2.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(107, 137).mirror().addBox(-1.0365F, -0.0816F, 0.2248F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.75F, -6.7F, -0.2356F, -0.2618F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(148, 37).mirror().addBox(-2.0F, -0.9605F, -0.2265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.3F, 2.85F, -15.3F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(23, 153).mirror().addBox(-2.0F, -0.0117F, -0.0183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.65F, -13.4F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(16, 153).mirror().addBox(-2.0F, 0.041F, 0.0426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.15F, -15.4F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(75, 145).mirror().addBox(-2.0F, -2.0609F, 0.1731F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 2.3426F, -18.4914F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(26, 128).mirror().addBox(0.1148F, 0.2427F, -5.9133F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.7634F, 1.4471F, -6.6468F, -0.1822F, -0.1797F, 0.0648F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(16, 148).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.5056F, -2.0499F, 0.7046F, -0.1834F, 0.0263F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(144, 133).mirror().addBox(-1.4506F, -1.8018F, 0.2328F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 4.35F, -5.1F, 0.4538F, -0.2618F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(142, 23).mirror().addBox(-0.6741F, -2.8893F, 0.1921F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 4.45F, -8.1F, 0.0611F, -0.2618F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(156, 118).mirror().addBox(-1.5F, -2.2015F, -0.0137F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.4426F, -21.1914F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(151, 28).mirror().addBox(-1.5F, 0.1954F, -0.1886F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3426F, -23.1914F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(127, 81).mirror().addBox(-2.0F, 0.1823F, 1.762F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.3426F, -23.1914F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(48, 140).mirror().addBox(-2.0F, 0.0201F, -0.28F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.3426F, -18.9914F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(66, 141).mirror().addBox(-2.0F, -0.4F, -12.35F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.25F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(151, 123).mirror().addBox(-1.4666F, -0.5599F, -0.1108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6634F, 2.3471F, -5.4468F, -2.7751F, -0.2531F, 0.0F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(151, 96).mirror().addBox(-1.2066F, -0.2838F, -2.1904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6634F, 3.7471F, -6.4468F, -2.3387F, -0.2531F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(148, 14).mirror().addBox(-0.0448F, -0.8162F, -2.9832F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8634F, 3.7471F, -6.4468F, -0.225F, -0.2191F, -0.008F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(120, 16).mirror().addBox(-0.0154F, -2.2578F, -5.985F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7634F, 1.4471F, -6.6468F, 0.0349F, -0.2007F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(135, 39).mirror().addBox(-4.0F, -0.15F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(26, 128).addBox(-1.1148F, 0.2427F, -5.9133F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.7634F, 1.4471F, -6.6468F, -0.1822F, 0.1797F, -0.0648F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(16, 148).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 1.5056F, -2.0499F, 0.7046F, 0.1834F, -0.0263F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(144, 133).addBox(0.4506F, -1.8018F, 0.2328F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 4.35F, -5.1F, 0.4538F, 0.2618F, 0.0F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(107, 137).addBox(0.0365F, -0.0816F, 0.2248F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7F, -0.75F, -6.7F, -0.2356F, 0.2618F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(142, 23).addBox(-0.3259F, -2.8893F, 0.1921F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7F, 4.45F, -8.1F, 0.0611F, 0.2618F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(156, 118).addBox(0.5F, -2.2015F, -0.0137F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1F, 2.4426F, -21.1914F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(126, 0).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2644F, -17.1805F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(155, 52).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1594F, -21.1644F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(162, 0).addBox(-0.5F, -1.1046F, -0.4386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6426F, -23.1914F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(152, 0).addBox(-1.0F, 0.1997F, -0.9388F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3426F, -23.1914F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(151, 28).addBox(0.5F, 0.1954F, -0.1886F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3426F, -23.1914F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(75, 145).addBox(1.0F, -2.0609F, 0.1731F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 2.3426F, -18.4914F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(127, 81).addBox(1.0F, 0.1823F, 1.762F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3F, 0.3426F, -23.1914F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(48, 140).addBox(1.0F, 0.0201F, -0.28F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3F, 0.3426F, -18.9914F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(23, 153).addBox(1.0F, -0.0117F, -0.0183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3F, -0.65F, -13.4F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(16, 153).addBox(1.0F, 0.041F, 0.0426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.3F, -0.15F, -15.4F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(148, 37).addBox(1.0F, -0.9605F, -0.2265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3F, 2.85F, -15.3F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(66, 141).addBox(1.0F, -0.4F, -12.35F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.3F, -0.25F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(151, 123).addBox(0.4666F, -0.5599F, -0.1108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6634F, 2.3471F, -5.4468F, -2.7751F, 0.2531F, 0.0F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(151, 96).addBox(0.2066F, -0.2838F, -2.1904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6634F, 3.7471F, -6.4468F, -2.3387F, 0.2531F, 0.0F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(148, 14).addBox(-0.9552F, -0.8162F, -2.9832F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8634F, 3.7471F, -6.4468F, -0.225F, 0.2191F, 0.008F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(120, 16).addBox(-0.9846F, -2.2578F, -5.985F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7634F, 1.4471F, -6.6468F, 0.0349F, 0.2007F, 0.0F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(103, 145).addBox(3.0F, 0.05F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.0F, -0.2F, 1.2F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(132, 150).addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.5F, 1.0268F, -2.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(135, 39).addBox(3.0F, -0.15F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, 0.0524F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 168, 168);
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