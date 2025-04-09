package fossils.fossils.client.blockentity.model.sylviornis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SylviornisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public SylviornisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe = this.leftLeg3.getChild("toe");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.2506F, 4.9398F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(93, 94).addBox(-0.5F, 0.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(88, 94).addBox(-0.5F, 0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -4.0389F, -1.7931F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(83, 94).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.5541F, -0.9185F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.0263F, -2.4329F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2418F, 1.0632F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(0.0F, -1.0532F, -2.9526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.627F, 10.0172F, -1.0394F, 0.1211F, -0.3158F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 100).mirror().addBox(0.0F, -0.9626F, -1.0453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.627F, 10.0172F, -1.1267F, 0.1211F, -0.3158F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-2.6723F, -1.001F, 13.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 35).mirror().addBox(-2.6723F, -1.001F, 10.181F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 9).mirror().addBox(-2.6723F, -1.001F, 6.181F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0581F, -1.5666F, -2.0088F, -0.5776F, -0.0191F, -0.2489F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 75).mirror().addBox(-0.0316F, -0.8626F, -1.7454F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5742F, -1.5696F, -3.7519F, -0.4027F, -0.8136F, -0.6684F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 62).mirror().addBox(-0.7F, -0.5F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9742F, -2.1696F, -1.8518F, -0.2793F, -0.2182F, -0.9066F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 23).mirror().addBox(-5.6573F, -0.1291F, -1.9344F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1461F, -1.9533F, -2.2018F, -1.0399F, 1.2441F, -1.7233F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 67).mirror().addBox(-0.872F, -2.7869F, -0.0666F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-0.872F, -0.7869F, -0.0666F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.2442F, 2.8045F, 1.8873F, -0.9751F, -0.0013F, -0.1446F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 28).mirror().addBox(-0.872F, -7.4227F, 3.7171F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2442F, 2.8045F, 1.8873F, -1.4376F, -0.0013F, -0.1446F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.872F, -10.7679F, 4.7771F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 76).mirror().addBox(-0.872F, -10.7679F, 2.9771F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2442F, 2.8045F, 1.8873F, -1.9001F, -0.0013F, -0.1446F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(-0.872F, -2.3403F, 8.6156F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2442F, 2.8045F, 1.8873F, -1.01F, -0.0013F, -0.1446F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(79, 23).mirror().addBox(-0.872F, -8.5516F, 1.7554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2442F, 2.8045F, 1.8873F, -1.9263F, -0.0013F, -0.1446F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 85).mirror().addBox(-0.872F, 2.5506F, 6.4305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2442F, 2.8045F, 1.8873F, -0.4864F, -0.0013F, -0.1446F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(55, 16).mirror().addBox(-8.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.915F, -2.7408F, -0.052F, -0.3154F, -1.3991F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(88, 14).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.915F, -2.7408F, -0.2055F, -0.2464F, -0.8582F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(23, 22).mirror().addBox(0.0331F, -0.0828F, -0.0506F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0832F, 1.4659F, 3.6135F, -0.754F, 1.1277F, -0.9046F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-2.5495F, -0.4473F, -1.7527F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1185F, -1.8522F, -1.7732F, -0.6192F, 0.8785F, -1.3907F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9742F, -2.1696F, -1.8518F, -0.327F, 0.5771F, -1.1516F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-0.5F, -0.5F, -2.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7025F, 0.5378F, 3.1184F, -1.1887F, -0.7649F, 0.716F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 50).mirror().addBox(-2.0F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 4.5495F, 8.3614F, -1.2245F, -0.9549F, 0.8764F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-5.1651F, -0.7074F, 10.4324F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9915F, 2.5139F, 1.1869F, -1.0292F, 0.1016F, -0.4726F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(15, 37).mirror().addBox(-1.2437F, -0.7074F, 5.5685F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9915F, 2.5139F, 1.1869F, -1.0259F, -0.0802F, -0.1742F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(46, 36).mirror().addBox(-0.9131F, -0.6933F, 2.5875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2442F, 2.8045F, 1.8873F, -0.4216F, -0.021F, -0.2022F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(81, 5).mirror().addBox(-1.2437F, -5.3707F, -12.7757F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 13.8008F, -1.2558F, -1.4981F, -0.0513F, -0.0717F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(68, 63).mirror().addBox(-0.5953F, -0.2612F, 0.007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7311F, -0.8512F, -1.1345F, -0.8217F, -0.3089F, -0.0459F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(19, 64).mirror().addBox(-0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7332F, 2.0046F, 1.1604F, -0.5765F, -0.1274F, -0.1701F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(25, 76).mirror().addBox(-0.5F, -1.6F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2517F, 1.9419F, 0.5832F, -0.2545F, -0.3089F, -0.0459F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(37, 28).mirror().addBox(0.0738F, -0.6775F, -0.1359F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9915F, 2.5139F, 1.1869F, -1.0482F, -0.1879F, 0.0371F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(42, 15).mirror().addBox(0.0F, -1.9973F, 6.0176F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.049F, -4.8424F, -0.3346F, -0.226F, -0.5725F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(23, 22).addBox(-5.0331F, -0.0828F, -0.0506F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0832F, 1.4659F, 3.6135F, -0.754F, -1.1277F, 0.9046F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(42, 23).addBox(1.6573F, -0.1291F, -1.9344F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1461F, -1.9533F, -2.2018F, -1.0399F, -1.2441F, 1.7233F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(44, 0).addBox(-0.4505F, -0.4473F, -1.7527F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1185F, -1.8522F, -1.7732F, -0.6192F, -0.8785F, 1.3907F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(9, 75).addBox(-1.9684F, -0.8626F, -1.7454F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5742F, -1.5696F, -3.7519F, -0.4027F, 0.8136F, 0.6684F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(46, 62).addBox(-1.3F, -0.5F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9742F, -2.1696F, -1.8518F, -0.2793F, 0.2182F, 0.9066F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9742F, -2.1696F, -1.8518F, -0.327F, -0.5771F, 1.1516F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(46, 43).addBox(-0.5F, -0.5F, -2.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7025F, 0.5378F, 3.1184F, -1.1887F, 0.7649F, -0.716F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(43, 50).addBox(-1.0F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 4.5495F, 8.3614F, -1.2245F, 0.9549F, -0.8764F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 99).addBox(1.6723F, -1.001F, 13.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 35).addBox(0.6723F, -1.001F, 10.181F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(29, 9).addBox(-1.3277F, -1.001F, 6.181F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0581F, -1.5666F, -2.0088F, -0.5776F, 0.0191F, 0.2489F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(25, 58).addBox(4.1651F, -0.7074F, 10.4324F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9915F, 2.5139F, 1.1869F, -1.0292F, -0.1016F, 0.4726F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(15, 37).addBox(0.2437F, -0.7074F, 5.5685F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9915F, 2.5139F, 1.1869F, -1.0259F, 0.0802F, 0.1742F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(46, 36).addBox(-0.0869F, -0.6933F, 2.5875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2442F, 2.8045F, 1.8873F, -0.4216F, 0.021F, 0.2022F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(81, 5).addBox(0.2437F, -5.3707F, -12.7757F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 13.8008F, -1.2558F, -1.4981F, 0.0513F, 0.0717F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(68, 63).addBox(-0.4047F, -0.2612F, 0.007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7311F, -0.8512F, -1.1345F, -0.8217F, 0.3089F, 0.0459F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(19, 64).addBox(-0.6F, -1.5F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7332F, 2.0046F, 1.1604F, -0.5765F, 0.1274F, 0.1701F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(25, 76).addBox(-0.5F, -1.6F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2517F, 1.9419F, 0.5832F, -0.2545F, 0.3089F, 0.0459F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(37, 28).addBox(-1.0738F, -0.6775F, -0.1359F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9915F, 2.5139F, 1.1869F, -1.0482F, 0.1879F, -0.0371F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(72, 8).addBox(-0.128F, -10.7679F, 4.7771F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 76).addBox(-0.128F, -10.7679F, 2.9771F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2442F, 2.8045F, 1.8873F, -1.9001F, 0.0013F, 0.1446F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(52, 28).addBox(-0.128F, -7.4227F, 3.7171F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2442F, 2.8045F, 1.8873F, -1.4376F, 0.0013F, 0.1446F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(79, 23).addBox(-0.128F, -8.5516F, 1.7554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2442F, 2.8045F, 1.8873F, -1.9263F, 0.0013F, 0.1446F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(68, 18).addBox(-0.128F, -2.3403F, 8.6156F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2442F, 2.8045F, 1.8873F, -1.01F, 0.0013F, 0.1446F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(21, 85).addBox(-0.128F, 2.5506F, 6.4305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2442F, 2.8045F, 1.8873F, -0.4864F, 0.0013F, 0.1446F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(45, 67).addBox(-0.128F, -2.7869F, -0.0666F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.128F, -0.7869F, -0.0666F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.2442F, 2.8045F, 1.8873F, -0.9751F, 0.0013F, 0.1446F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(20, 100).addBox(-1.0F, -0.9626F, -1.0453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, 7.627F, 10.0172F, -1.1267F, -0.1211F, 0.3158F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(86, 86).addBox(-1.0F, -1.0532F, -2.9526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 7.627F, 10.0172F, -1.0394F, -0.1211F, 0.3158F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(25, 99).addBox(-0.5F, 0.0542F, 0.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.227F, 10.5172F, -1.1606F, -0.1047F, 0.0F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(86, 54).addBox(-0.5F, -0.0135F, 0.0103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.527F, 9.5172F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r59 = hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(86, 82).addBox(-0.5F, -0.0264F, 0.0103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 2.927F, 8.3172F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r60 = hips.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(46, 86).addBox(-0.5F, 0.06F, -0.0117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.527F, 6.9172F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r61 = hips.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -0.0431F, -0.0019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 0.627F, 5.1172F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r62 = hips.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, -0.1F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.373F, 3.6172F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r63 = hips.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(36, 63).addBox(-0.5F, 0.1F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6976F, 3.4602F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r64 = hips.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(42, 15).addBox(-1.0F, -1.9973F, 6.0176F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.049F, -4.8424F, -0.3346F, 0.226F, 0.5725F));

		PartDefinition cube_r65 = hips.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(55, 16).addBox(2.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.915F, -2.7408F, -0.052F, 0.3154F, 1.3991F));

		PartDefinition cube_r66 = hips.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(88, 14).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.915F, -2.7408F, -0.2055F, 0.2464F, 0.8582F));

		PartDefinition cube_r67 = hips.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(15, 28).addBox(-1.0F, -0.0973F, 0.0176F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7F, -4.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 3.253F, 2.3008F, -1.0744F, -0.0841F, 0.0234F));

		PartDefinition cube_r68 = leftLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(58, 79).addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(77, 31).addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.3946F, -0.7553F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(77, 36).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.2922F, -0.6404F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(60, 75).addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 9.3946F, -0.7553F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 68).addBox(-4.5F, -4.4869F, -0.9041F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.5F, 7.7477F, -0.2977F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(28, 64).addBox(-4.5F, 1.0F, -2.4F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 2.3F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(77, 18).addBox(-4.5F, -1.9F, -1.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.5F, 2.3F, 0.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(59, 6).addBox(-1.5F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 1.7426F, -0.8044F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(23, 72).addBox(-4.5F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.5F, -0.0396F, -1.5636F, 1.885F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(15, 24).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.5F, -1.0244F, -1.7373F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(72, 55).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.5F, -1.9114F, -1.2755F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 61).addBox(-4.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -1.0244F, -1.7373F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(14, 53).addBox(-1.5F, -1.0F, -1.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -0.7F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3F, 8.6355F, -0.0285F, 1.8681F, 0.0254F, 0.0458F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(78, 94).addBox(-0.5F, -3.507F, -2.3331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 28).addBox(-2.5F, -3.507F, -2.3331F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(30, 28).addBox(-1.0F, -1.1441F, -0.1964F, 2.0F, 15.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7F, 2.27F, -1.977F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(7, 53).addBox(-1.0F, -5.8F, -1.2F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.7F, 13.0963F, -2.9229F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(57, 63).addBox(-1.5F, -0.3F, -4.4F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, -4.5F, -0.4F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7F, 5.3033F, -1.9296F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(14, 86).addBox(-1.0F, -1.0F, 0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.6684F, -1.302F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(69, 75).addBox(-5.8F, -4.7498F, -0.9321F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(36, 93).addBox(-0.6532F, -2.094F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0963F, 2.8746F, -1.2464F, 0.0264F, 0.0069F, 0.0023F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(93, 20).addBox(-0.6532F, -0.194F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, 1.2636F, -0.4436F, -0.4623F, 0.0072F, -0.0013F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(14, 59).addBox(-0.6532F, 1.4677F, -1.2621F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1F, 1.2636F, -0.4436F, -0.2005F, 0.0072F, -0.0013F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(37, 36).addBox(-1.5F, -0.4447F, -0.8239F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 17.1781F, -5.7949F, -1.117F, 0.0F, 0.0F));

		PartDefinition toe = leftLeg3.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5241F, 6.5154F, 0.3935F, 0.4644F, -0.5576F, -0.1164F));

		PartDefinition cube_r90 = toe.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(93, 39).addBox(-1.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 2.1F, 0.4F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r91 = toe.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(93, 8).addBox(-0.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.5315F, 5.1185F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r92 = toe.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 89).addBox(-1.5F, 0.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1F, 0.4F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(23, 15).addBox(-2.9997F, -1.0001F, -3.8326F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0137F, 1.1925F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 15).addBox(-2.9997F, -0.5001F, -4.9825F, 5.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.4893F, -3.806F, 0.0038F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 3.253F, 2.3008F, -1.3798F, 0.0841F, -0.0234F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(58, 79).mirror().addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 31).mirror().addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.3946F, -0.7553F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.2922F, -0.6404F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.3946F, -0.7553F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(70, 68).mirror().addBox(2.5F, -4.4869F, -0.9041F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 7.7477F, -0.2977F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(28, 64).mirror().addBox(2.5F, 1.0F, -2.4F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.3F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(77, 18).mirror().addBox(2.5F, -1.9F, -1.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.3F, 0.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(59, 6).mirror().addBox(-0.5F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.7426F, -0.8044F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(23, 72).mirror().addBox(2.5F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -0.0396F, -1.5636F, 1.885F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(15, 24).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -1.0244F, -1.7373F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -1.9114F, -1.2755F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(2.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -1.0244F, -1.7373F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.5F, -1.0F, -1.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.7F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 8.6355F, -0.0285F, 2.3917F, -0.0254F, -0.0458F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(78, 94).mirror().addBox(-0.5F, -3.507F, -2.3331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 28).mirror().addBox(0.5F, -3.507F, -2.3331F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 28).mirror().addBox(-1.0F, -1.1441F, -0.1964F, 2.0F, 15.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.27F, -1.977F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(7, 53).mirror().addBox(-1.0F, -5.8F, -1.2F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.7F, 13.0963F, -2.9229F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(57, 63).mirror().addBox(-1.5F, -0.3F, -4.4F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-1.0F, -4.5F, -0.4F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.7F, 5.3033F, -1.9296F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(14, 86).mirror().addBox(-1.0F, -1.0F, 0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 1.6684F, -1.302F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(69, 75).mirror().addBox(2.8F, -4.7498F, -0.9321F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(36, 93).mirror().addBox(-0.3468F, -2.094F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0963F, 2.8746F, -1.2464F, 0.0264F, -0.0069F, -0.0023F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(93, 20).mirror().addBox(-0.3468F, -0.194F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.2636F, -0.4436F, -0.4623F, -0.0072F, 0.0013F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(14, 59).mirror().addBox(-0.3468F, 1.4677F, -1.2621F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.2636F, -0.4436F, -0.2005F, -0.0072F, 0.0013F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(37, 36).mirror().addBox(-0.5F, -0.4447F, -0.8239F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 17.1781F, -5.7949F, -1.1606F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5241F, 6.5154F, 0.3935F, -0.321F, 0.5576F, 0.1164F));

		PartDefinition cube_r115 = toe2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(93, 39).mirror().addBox(0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1F, 0.4F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r116 = toe2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(93, 8).mirror().addBox(-0.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5315F, 5.1185F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r117 = toe2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(21, 89).mirror().addBox(0.5F, 0.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1F, 0.4F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(23, 15).mirror().addBox(-2.0003F, -1.0001F, -3.8326F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.0137F, 1.1925F, 1.3963F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-2.0003F, -0.5001F, -4.9825F, 5.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4893F, -3.806F, -1.1307F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(46, 79).addBox(-0.5F, -0.3205F, 0.0403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.2591F, 10.4571F, -0.9512F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(54, 68).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0188F, 0.8961F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(81, 9).addBox(-0.5F, -0.4415F, -0.1155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0519F, 2.9561F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(41, 95).addBox(0.0F, -1.9822F, 0.6707F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(37, 55).addBox(0.0F, -2.1822F, -3.7293F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.9F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(56, 50).mirror().addBox(-8.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -0.4408F, -0.0443F, -0.3253F, -1.4172F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(86, 58).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -0.4408F, -0.2043F, -0.2587F, -0.8742F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(53, 82).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -0.4408F, -0.2709F, -0.1354F, -0.3326F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(9, 73).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -4.2408F, -0.1454F, -0.0669F, -0.2004F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(72, 41).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -4.2408F, -0.1313F, -0.1355F, -0.7436F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(55, 14).mirror().addBox(-8.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -4.2408F, -0.0456F, -0.1828F, -1.2719F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(23, 70).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, -0.2293F, -0.0929F, -0.2457F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, -0.1904F, -0.2009F, -0.7857F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(26, 49).mirror().addBox(-9.3936F, -1.7918F, -0.5273F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, -0.0631F, -0.2688F, -1.32F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(95, 24).mirror().addBox(0.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 95).mirror().addBox(0.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 95).mirror().addBox(0.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1021F, -2.1333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(56, 50).addBox(2.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -0.4408F, -0.0443F, 0.3253F, 1.4172F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(86, 58).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -0.4408F, -0.2043F, 0.2587F, 0.8742F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(53, 82).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -0.4408F, -0.2709F, 0.1354F, 0.3326F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(9, 73).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -4.2408F, -0.1454F, 0.0669F, 0.2004F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(72, 41).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -4.2408F, -0.1313F, 0.1355F, 0.7436F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(55, 14).addBox(2.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -4.2408F, -0.0456F, 0.1828F, 1.2719F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(23, 70).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, -0.2293F, 0.0929F, 0.2457F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(63, 33).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, -0.1904F, 0.2009F, 0.7857F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(26, 49).addBox(2.3936F, -1.7918F, -0.5273F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, -0.0631F, 0.2688F, 1.32F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(95, 24).addBox(-1.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 95).addBox(-1.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 95).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1021F, -2.1333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0F, -0.0506F, -2.0332F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0702F, -5.8129F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(49, 95).addBox(0.0F, -2.8468F, -1.0375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(95, 100).addBox(0.0F, -2.1008F, -1.0624F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(77, 100).addBox(0.0F, -1.8924F, -0.0881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(100, 23).mirror().addBox(0.0766F, -2.1821F, 2.176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5758F, 4.6132F, -5.5713F, 1.0854F, 0.1186F, -0.0338F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(0.0766F, 0.0492F, 0.0333F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5758F, 4.6132F, -5.5713F, 1.8272F, 0.1186F, -0.0338F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(70, 58).mirror().addBox(-0.1345F, -1.7844F, 1.3218F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3178F, 7.6559F, -2.3079F, 1.9581F, 0.1186F, -0.2083F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(79, 60).mirror().addBox(-5.0689F, 7.2723F, -2.3526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.554F, 11.9607F, 1.8055F, 1.6294F, 0.5306F, 1.3478F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(33, 87).mirror().addBox(-8.7393F, 3.8332F, -2.3526F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.554F, 11.9607F, 1.8055F, 1.6729F, 1.0527F, 1.407F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(72, 79).mirror().addBox(-1.1806F, 6.6914F, -2.3526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.554F, 11.9607F, 1.8055F, 1.6214F, 0.0514F, 1.3208F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(65, 87).mirror().addBox(1.2552F, 6.3929F, -2.0532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.554F, 11.9607F, 1.8055F, 1.591F, -0.3305F, 1.2415F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(48, 90).mirror().addBox(-0.5F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9562F, 11.0144F, 0.0463F, 1.143F, 0.6817F, 1.1801F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-0.5315F, -0.1869F, -1.2152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5498F, 8.799F, -2.138F, -0.5297F, -0.7639F, -0.4741F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(93, 43).mirror().addBox(0.027F, -1.9877F, -0.9789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 16.871F, 8.557F, 1.0567F, 0.3638F, -0.0147F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(84, 68).mirror().addBox(0.027F, -3.9451F, -1.0946F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 16.871F, 8.557F, 1.0044F, 0.3638F, -0.0147F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(79, 55).mirror().addBox(0.027F, -6.7248F, -1.1487F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 16.871F, 8.557F, 0.9869F, 0.3638F, -0.0147F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(96, 14).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 26).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 76).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, -0.1068F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(91, 62).mirror().addBox(-1.7161F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -4.1408F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(91, 60).mirror().addBox(-2.7823F, -0.5106F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -4.1408F, 0.134F, 0.0914F, -0.876F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(100, 76).mirror().addBox(-0.9336F, -0.0313F, -0.4845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -4.1408F, 0.1987F, -0.0094F, -0.3402F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(86, 25).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, -0.0007F, 0.0032F, -1.3988F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(93, 12).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.001F, 0.0031F, -0.8752F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(90, 100).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.0394F, -0.0166F, -0.331F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-7.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -0.1408F, -0.0344F, -0.0964F, -1.293F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(90, 80).mirror().addBox(-2.9689F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -0.1408F, -0.078F, -0.0663F, -0.7684F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -0.1408F, -0.0641F, -0.0351F, -0.224F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(44, 95).mirror().addBox(-1.531F, -1.3448F, 5.6016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0142F, 1.0526F, -5.9035F, -0.1644F, 0.1031F, 0.3605F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.9859F, -1.4918F, -0.8722F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5758F, 4.6132F, -5.5713F, 1.5478F, -0.1016F, 0.2977F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.5151F, 0.0058F, -0.0353F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0142F, 1.0526F, -5.9035F, 0.0717F, -0.0778F, 0.3577F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(35, 100).mirror().addBox(-0.5315F, -0.7198F, -0.6491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5498F, 8.799F, -2.138F, 0.1684F, -0.7639F, -0.4741F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(-0.1345F, -1.5413F, -0.3572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3178F, 7.6559F, -2.3079F, 2.1326F, 0.1186F, -0.2083F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(58, 94).mirror().addBox(-0.0562F, -2.7858F, -0.0701F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6996F, 9.0153F, -0.1645F, -0.5515F, 0.9373F, -1.3258F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(49, 100).mirror().addBox(-0.1928F, -2.8893F, 0.2828F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7794F, 9.8862F, -0.5795F, -0.8964F, 0.5064F, -1.4793F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(41, 74).mirror().addBox(-0.1563F, -3.1858F, -0.0701F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7794F, 9.8862F, 0.3205F, -1.174F, 0.425F, -1.5146F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(80, 87).mirror().addBox(-0.4562F, -4.7858F, -0.0701F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7794F, 9.8862F, 0.3205F, -1.4218F, 0.2514F, -1.576F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(72, 100).mirror().addBox(-0.7812F, -0.3045F, -0.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5498F, 8.799F, -2.138F, 0.4949F, 0.5728F, 0.445F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9754F, 10.3612F, -0.8519F, 0.8421F, 0.8265F, 0.6566F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(28, 87).mirror().addBox(-2.5475F, 1.9899F, -0.3831F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, 8.3346F, -4.1622F, 0.6543F, 0.468F, 0.3331F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(-0.8433F, -1.521F, -0.593F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9198F, 12.2263F, 0.6902F, 1.2367F, 0.5143F, 0.9068F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-1.5325F, 5.1725F, -2.529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3346F, -4.1622F, 1.3171F, 0.5701F, 1.2102F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-2.9829F, 5.2229F, -2.529F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3346F, -4.1622F, 1.2554F, 0.8216F, 1.1147F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(-0.149F, -1.4971F, -0.5611F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9198F, 12.2263F, 0.6902F, 1.0842F, 0.2895F, 0.4949F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(-0.3438F, 0.0566F, -0.5724F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.554F, 11.9607F, 1.8055F, 1.374F, -0.0961F, 1.2608F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(58, 90).mirror().addBox(-0.1F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5175F, 13.095F, 2.8336F, 1.3775F, 0.8317F, 1.1016F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(96, 14).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 26).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 76).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, -0.1068F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(91, 62).addBox(-0.284F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -4.1408F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(91, 60).addBox(0.7823F, -0.5106F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -4.1408F, 0.134F, -0.0914F, 0.876F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(100, 76).addBox(-0.0664F, -0.0313F, -0.4845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -4.1408F, 0.1987F, 0.0094F, 0.3402F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(86, 25).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, -0.0007F, -0.0032F, 1.3988F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(93, 12).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.001F, -0.0031F, 0.8752F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(90, 100).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.0394F, 0.0166F, 0.331F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(59, 48).addBox(2.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -0.1408F, -0.0344F, 0.0964F, 1.293F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(90, 80).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -0.1408F, -0.078F, 0.0663F, 0.7684F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(100, 12).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -0.1408F, -0.0641F, 0.0351F, 0.224F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(44, 95).addBox(0.531F, -1.3448F, 5.6016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0142F, 1.0526F, -5.9035F, -0.1644F, -0.1031F, -0.3605F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(59, 0).addBox(-0.0141F, -1.4918F, -0.8722F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5758F, 4.6132F, -5.5713F, 1.5478F, 0.1016F, -0.2977F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 33).addBox(-0.4849F, 0.0058F, -0.0353F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0142F, 1.0526F, -5.9035F, 0.0717F, 0.0778F, -0.3577F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(86, 39).addBox(-0.4685F, -0.1869F, -1.2152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5498F, 8.799F, -2.138F, -0.5297F, 0.7639F, 0.4741F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(35, 100).addBox(-0.4685F, -0.7198F, -0.6491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5498F, 8.799F, -2.138F, 0.1684F, 0.7639F, 0.4741F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(100, 23).addBox(-1.0766F, -2.1821F, 2.176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.5758F, 4.6132F, -5.5713F, 1.0854F, -0.1186F, 0.0338F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(72, 13).addBox(-1.0766F, 0.0492F, 0.0333F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5758F, 4.6132F, -5.5713F, 1.8272F, -0.1186F, 0.0338F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(70, 58).addBox(-0.8655F, -1.7844F, 1.3218F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3178F, 7.6559F, -2.3079F, 1.9581F, -0.1186F, 0.2083F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(86, 21).addBox(-0.8655F, -1.5413F, -0.3572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3178F, 7.6559F, -2.3079F, 2.1326F, -0.1186F, 0.2083F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(38, 88).addBox(-0.5F, -2.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.8359F, 10.7007F, 1.2636F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(93, 43).addBox(-1.027F, -1.9877F, -0.9789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, 16.871F, 8.557F, 1.0567F, -0.3638F, 0.0147F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(91, 35).addBox(-0.5F, -0.1419F, 0.0677F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.0346F, 6.4378F, 1.1327F, 0.0F, 0.0F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(58, 94).addBox(-0.9438F, -2.7858F, -0.0701F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6996F, 9.0153F, -0.1645F, -0.5515F, -0.9373F, 1.3258F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(49, 100).addBox(-0.8072F, -2.8893F, 0.2828F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7794F, 9.8862F, -0.5795F, -0.8964F, -0.5064F, 1.4793F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(41, 74).addBox(-0.8438F, -3.1858F, -0.0701F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7794F, 9.8862F, 0.3205F, -1.174F, -0.425F, 1.5146F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(80, 87).addBox(-0.5438F, -4.7858F, -0.0701F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7794F, 9.8862F, 0.3205F, -1.4218F, -0.2514F, 1.576F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(48, 90).addBox(-0.5F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9562F, 11.0144F, 0.0463F, 1.143F, -0.6817F, -1.1801F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(72, 100).addBox(-0.2188F, -0.3045F, -0.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5498F, 8.799F, -2.138F, 0.4949F, -0.5728F, -0.445F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9754F, 10.3612F, -0.8519F, 0.8421F, -0.8265F, -0.6566F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(28, 87).addBox(1.5475F, 1.9899F, -0.3831F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 8.3346F, -4.1622F, 0.6543F, -0.468F, -0.3331F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(15, 90).addBox(-0.1567F, -1.521F, -0.593F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9198F, 12.2263F, 0.6902F, 1.2367F, -0.5143F, -0.9068F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(91, 31).addBox(0.5325F, 5.1725F, -2.529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 8.3346F, -4.1622F, 1.3171F, -0.5701F, -1.2102F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 88).addBox(1.9829F, 5.2229F, -2.529F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3346F, -4.1622F, 1.2554F, -0.8216F, -1.1147F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(43, 90).addBox(-0.851F, -1.4971F, -0.5611F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9198F, 12.2263F, 0.6902F, 1.0842F, -0.2895F, -0.4949F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(79, 60).addBox(4.0689F, 7.2723F, -2.3526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.554F, 11.9607F, 1.8055F, 1.6294F, -0.5306F, -1.3478F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(33, 87).addBox(7.7393F, 3.8332F, -2.3526F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.554F, 11.9607F, 1.8055F, 1.6729F, -1.0527F, -1.407F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(72, 79).addBox(0.1806F, 6.6914F, -2.3526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.554F, 11.9607F, 1.8055F, 1.6214F, -0.0514F, -1.3208F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(65, 87).addBox(-2.2552F, 6.3929F, -2.0532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.554F, 11.9607F, 1.8055F, 1.591F, 0.3305F, -1.2415F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(9, 64).addBox(-0.6562F, 0.0566F, -0.5724F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.554F, 11.9607F, 1.8055F, 1.374F, 0.0961F, -1.2608F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(58, 90).addBox(-0.9F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5175F, 13.095F, 2.8336F, 1.3775F, -0.8317F, -1.1016F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(72, 48).addBox(-2.0F, -1.0F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5693F, 13.7559F, 2.53F, 0.9235F, -0.2119F, -0.0539F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(84, 68).addBox(-2.027F, -3.9451F, -1.0946F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, 16.871F, 8.557F, 1.0044F, -0.3638F, 0.0147F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(91, 16).addBox(-0.5F, -2.0082F, -0.0387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 16.8775F, 6.3659F, 1.0804F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(93, 56).addBox(-0.5F, -0.0511F, 0.0394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.1346F, -2.5622F, 1.3945F, 0.0F, 0.0F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(93, 53).addBox(-0.5F, -1.2527F, -0.0389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(53, 93).addBox(-0.5F, -1.0527F, -0.0389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.0346F, -1.7622F, 0.6615F, 0.0F, 0.0F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(32, 74).addBox(-1.5F, -1.0F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.1324F, 1.1454F, 1.0978F, 0.0F, 0.0F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 75).addBox(-1.5F, -1.7806F, 0.376F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.2346F, -0.2622F, 0.7924F, 0.0F, 0.0F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(85, 72).addBox(-1.0F, -4.0163F, -0.1313F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 27).addBox(-1.5F, -2.0163F, -0.1313F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6346F, -1.1622F, 0.6179F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(88, 90).addBox(-0.5F, -1.9806F, -0.024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.2346F, -0.2622F, 0.8797F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(98, 94).addBox(-0.5F, -1.0343F, -0.0462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.7346F, 0.6378F, 1.0367F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(95, 27).addBox(-0.5F, -0.8887F, -0.0468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 14.0346F, 1.4378F, 1.2113F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(83, 90).addBox(-0.5F, -2.0192F, -0.0106F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.0346F, 3.1378F, 1.0455F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(79, 55).addBox(-2.027F, -6.7248F, -1.1487F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 16.871F, 8.557F, 0.9869F, -0.3638F, 0.0147F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(90, 76).addBox(-0.5F, -2.0344F, 0.0217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 16.0346F, 4.6378F, 0.9931F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -1.3F, -4.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(60, 84).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.0897F, 1.9204F, -4.906F, 1.1519F, 0.8237F, -0.0575F));

		PartDefinition cube_r239 = leftArm1.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(67, 99).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F))
				.texOffs(62, 99).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.119F)), PartPose.offsetAndRotation(-0.0059F, -0.4532F, 0.1465F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftArm1.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(5, 93).addBox(-0.5F, 0.4F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.0059F, -1.0265F, -1.154F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftArm1.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(10, 90).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.0059F, 0.5856F, 0.4865F, -0.2725F, 0.0406F, 0.1057F));

		PartDefinition cube_r242 = leftArm1.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(5, 100).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.0059F, 6.7423F, -1.299F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftArm1.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 100).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.0059F, 6.0171F, -1.0662F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftArm1.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(85, 76).addBox(0.0F, -0.0387F, -0.5834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.5059F, 3.2353F, -0.0475F, -0.3229F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4242F, 7.3808F, -1.3811F, -1.6902F, -0.3897F, -0.0257F));

		PartDefinition cube_r245 = leftArm2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(20, 94).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 4.9912F, 0.2069F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftArm2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(88, 4).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.05F, 2.4197F, 0.5912F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftArm2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(93, 91).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 88).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 0.1394F, 0.0913F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftArm2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, -1.4F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 1.1341F, 0.2348F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftArm2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(93, 85).addBox(-0.5F, 2.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(75, 87).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.05F, 2.7405F, -0.5171F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftArm2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(70, 87).addBox(-0.5F, -2.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.55F, -0.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4261F, 5.8606F, -0.4627F, 1.3508F, -0.0692F, 0.0532F));

		PartDefinition cube_r251 = leftHand.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(40, 100).addBox(0.0F, 0.1185F, 0.0697F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.45F, -0.5F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftHand.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(21, 82).addBox(0.0F, -0.7F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.45F, -1.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r253 = leftHand.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(93, 50).addBox(-1.0F, 0.05F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r254 = leftHand.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(93, 47).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.213F, 0.1171F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftHand.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(90, 27).addBox(-1.0F, -0.2231F, -0.8171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.5F, 0.1F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftHand.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(19, 59).addBox(-1.0F, -0.35F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(60, 84).mirror().addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.0897F, 1.9204F, -4.906F, 1.082F, -0.9415F, 0.1478F));

		PartDefinition cube_r257 = rightArm1.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(67, 99).mirror().addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false)
				.texOffs(62, 99).mirror().addBox(-0.5F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.119F)).mirror(false), PartPose.offsetAndRotation(0.0059F, -0.4532F, 0.1465F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightArm1.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(-0.5F, 0.4F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.0059F, -1.0265F, -1.154F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r259 = rightArm1.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.5856F, 0.4865F, -0.2725F, -0.0406F, -0.1057F));

		PartDefinition cube_r260 = rightArm1.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 6.7423F, -1.299F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightArm1.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 6.0171F, -1.0662F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r262 = rightArm1.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(85, 76).mirror().addBox(-1.0F, -0.0387F, -0.5834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 3.2353F, -0.0475F, -0.3229F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4242F, 7.3808F, -1.3811F, -1.3411F, 0.3897F, 0.0257F));

		PartDefinition cube_r263 = rightArm2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(20, 94).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 4.9912F, 0.2069F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r264 = rightArm2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(88, 4).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.05F, 2.4197F, 0.5912F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r265 = rightArm2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(93, 91).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(93, 88).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 0.1394F, 0.0913F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r266 = rightArm2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.5F, -1.4F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.1341F, 0.2348F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r267 = rightArm2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(-0.5F, 2.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(75, 87).mirror().addBox(-0.5F, -0.4F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.7405F, -0.5171F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r268 = rightArm2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(70, 87).mirror().addBox(-0.5F, -2.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.55F, -0.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4261F, 5.8606F, -0.4627F, 1.569F, 0.0692F, -0.0532F));

		PartDefinition cube_r269 = rightHand.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(40, 100).mirror().addBox(0.0F, 0.1185F, 0.0697F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.45F, -0.5F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r270 = rightHand.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(21, 82).mirror().addBox(0.0F, -0.7F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.45F, -1.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r271 = rightHand.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(93, 50).mirror().addBox(0.0F, 0.05F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r272 = rightHand.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(93, 47).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.213F, 0.1171F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r273 = rightHand.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(90, 27).mirror().addBox(0.0F, -0.2231F, -0.8171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5F, 0.1F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r274 = rightHand.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(19, 59).mirror().addBox(0.0F, -0.35F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1464F, -5.2669F, -0.2447F, -0.8422F, -0.0634F));

		PartDefinition cube_r275 = neck6.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(10, 101).addBox(0.0F, -2.4943F, -3.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 51).addBox(-0.5F, -1.9943F, -4.1586F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6F, -0.7F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r276 = neck6.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(83, 87).addBox(0.0F, -1.1113F, -0.9252F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.1F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r277 = neck6.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(80, 100).mirror().addBox(-0.8641F, -0.861F, -5.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3087F, 2.1224F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r278 = neck6.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(80, 100).addBox(-0.1359F, -0.861F, -5.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3087F, 2.1224F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9759F, -3.6379F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r279 = neck5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(13, 101).addBox(0.0F, -1.5F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 79).addBox(0.0F, -1.4F, -4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 41).addBox(-0.5F, -1.1F, -5.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -4.2F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r280 = neck4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(13, 45).addBox(-1.0F, -2.0981F, -0.0287F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, -2.3F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition cube_r281 = neck3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(101, 14).addBox(0.0F, -0.1039F, -0.3449F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.1F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r282 = neck3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(63, 68).addBox(-1.0F, 2.0773F, -1.9318F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4068F, -0.6482F, 0.176F, -0.1289F, -0.0229F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(37, 51).addBox(0.0F, 2.0061F, -0.9437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 49).addBox(0.0F, 0.0061F, -0.9437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -1.5F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r284 = neck2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(44, 73).addBox(-1.0F, 0.9272F, -1.8396F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.2F, -2.3F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7107F, -1.5168F, -0.0206F, -0.1319F, -0.0406F));

		PartDefinition cube_r285 = neck.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(98, 100).addBox(0.0F, -1.3039F, -0.9513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.7F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r286 = neck.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(53, 88).addBox(-0.5F, -1.5384F, -0.5862F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(46, 6).addBox(-1.0F, -0.1384F, -1.2862F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8876F, -4.6461F, 0.2749F, -0.0151F, -0.2172F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(68, 24).addBox(-3.0F, -1.0817F, -1.1647F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2893F, -0.1473F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(46, 55).addBox(-3.0F, -1.5678F, -1.87F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -0.4912F, 0.2326F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(59, 43).addBox(-1.5F, -0.0697F, -2.5624F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.3094F, -6.1158F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(86, 97).addBox(-1.0F, 0.0069F, -0.9505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -3.7842F, -6.8842F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(81, 97).addBox(-1.0F, 0.0048F, -1.0693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -3.6842F, -7.8842F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(97, 79).addBox(-1.0F, -0.9622F, -0.9318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -3.5842F, -7.7842F, 2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(98, 6).addBox(-1.0F, -0.0016F, -1.0327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -3.6842F, -5.8842F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(98, 3).addBox(-1.0F, -1.0226F, -1.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -3.2842F, -5.2842F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(98, 0).addBox(-1.0F, -1.0166F, -0.033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5F, -1.8842F, -5.1842F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(96, 97).addBox(-1.0F, -0.9473F, -0.4287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.7842F, -5.7842F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(91, 97).addBox(-1.0F, -0.9877F, -0.1303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -1.3842F, -6.0842F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, 0.0847F, -1.1478F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -2.0842F, -8.2842F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(76, 97).addBox(-1.0F, 0.0133F, 0.0583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.6842F, -8.3842F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(25, 96).addBox(-1.0F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.2842F, -7.2842F, 2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(70, 5).addBox(-2.5F, -0.0053F, -1.0225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, -1.671F, -5.2468F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(59, 40).addBox(-3.0F, 0.0202F, -0.434F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, -1.771F, -4.8468F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(59, 11).addBox(-3.0F, 0.0034F, -0.0148F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.7533F, -4.8635F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(56, 52).addBox(-3.0F, -0.0552F, -0.0684F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -1.9528F, -3.9152F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(51, 73).addBox(-2.0F, -1.0236F, 0.0008F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.3386F, -4.9723F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(14, 70).addBox(-1.5F, -0.9402F, -0.014F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(57, 22).addBox(-2.0F, -2.9402F, -0.014F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 1.7386F, -2.8723F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(84, 17).addBox(-2.0F, -0.9758F, -0.042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 0.7386F, -4.5723F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(97, 70).addBox(-2.0F, 1.488F, -0.8658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(70, 0).addBox(-2.5F, 0.088F, -0.8658F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.6614F, -3.8723F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(55, 18).addBox(-3.0F, 0.388F, -0.2658F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -2.2F, -2.6F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(69, 52).addBox(-2.5F, -0.0142F, -0.9913F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.0249F, -2.0774F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(26, 45).addBox(-2.5F, -0.5F, -0.8F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, -1.2249F, -1.5774F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(59, 55).addBox(-2.0F, -1.0282F, -0.9673F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, -1.3496F, -0.145F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(46, 59).addBox(-2.0F, -1.0125F, -1.0011F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.4496F, 0.255F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(26, 92).addBox(-0.5F, -0.0145F, -1.0313F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4506F, -11.6122F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(98, 91).addBox(-0.5F, -0.7732F, -0.2821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, 3.5442F, -11.3028F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(98, 9).addBox(-0.5F, -0.1666F, -0.7426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.2442F, -12.0027F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(73, 92).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.8868F, -10.7777F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(96, 17).addBox(-0.5F, -0.139F, -0.9761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.0F, 2.3506F, -11.9122F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(91, 68).addBox(-0.5F, -0.0336F, -1.0002F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.7192F, -11.0496F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(92, 72).addBox(-0.5F, -0.0191F, -2.0438F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(77, 68).addBox(-1.0F, -0.0191F, -1.0438F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.0586F, -8.6315F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(81, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 2.7582F, -8.2704F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(39, 79).addBox(-0.5F, -1.915F, -1.1861F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.002F, -9.0055F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(91, 64).addBox(-0.5F, -0.0578F, -0.9544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.0F, 0.1019F, -10.3055F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -18.1434F, -1.6146F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(81, 46).addBox(-0.6729F, -0.3053F, -2.5559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1218F, 19.9572F, -0.4335F, -0.0806F, 0.1272F, -0.0211F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(93, 82).addBox(-0.3145F, 0.4518F, -2.9006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1218F, 19.9572F, -0.4335F, -0.4202F, 0.2808F, -0.1067F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(65, 79).addBox(-0.3145F, 0.7866F, -4.4285F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1218F, 19.9572F, -0.4335F, -0.5423F, 0.2808F, -0.1067F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(57, 99).addBox(-0.6996F, 0.1252F, 0.2838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1218F, 19.9572F, -0.4335F, 0.6796F, 0.1566F, -0.0092F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(25, 81).addBox(-0.6996F, -0.4F, -1.0087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1218F, 19.9572F, -0.4335F, -0.1058F, 0.1566F, -0.0092F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(31, 92).addBox(-0.5F, -1.1735F, -0.8653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(10, 98).addBox(-0.5F, 0.1265F, -0.8653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0046F, 18.2937F, -0.0775F, -0.3142F, 0.0349F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(7, 79).addBox(-0.9974F, -0.2217F, -0.0636F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7F, 19.6499F, -8.2452F, 0.5488F, 0.3316F, -0.0045F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(79, 41).addBox(-0.9974F, -0.1557F, 0.0882F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7F, 19.6499F, -8.2452F, 1.2819F, 0.3316F, -0.0045F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(59, 58).addBox(-1.8F, -0.0243F, 0.0372F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2F, 16.834F, -7.1011F, 0.018F, 0.253F, 0.0045F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(79, 0).addBox(-1.0F, -3.2815F, -1.6621F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, 21.034F, -4.9012F, -0.0349F, 0.2443F, 0.0F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(84, 31).addBox(-1.0F, -1.3285F, -2.0141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(84, 35).addBox(-1.0F, -1.0285F, -2.0141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, 21.034F, -4.9012F, -0.2967F, 0.2443F, 0.0F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(52, 99).addBox(-0.7F, -2.9285F, -1.7141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 33).addBox(-1.0F, -4.0285F, -2.0141F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.7F, 21.034F, -4.9012F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(88, 48).addBox(-0.5F, -2.6118F, -0.518F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7283F, 19.481F, -0.7684F, 1.946F, 0.0436F, 0.0F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5F, -3.6269F, -0.7152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F)), PartPose.offsetAndRotation(-1.7283F, 19.481F, -0.7684F, 1.8588F, 0.0436F, 0.0F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(0, 93).addBox(-0.5F, -4.8199F, -1.5101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7283F, 19.481F, -0.7684F, 1.6144F, 0.0436F, 0.0F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(63, 92).addBox(-0.5F, -1.8818F, -1.1977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 18.1637F, -0.7923F, 0.3491F, 0.0873F, 0.0F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(68, 92).addBox(-0.5F, -1.6516F, -1.2349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 18.1637F, -0.7923F, -0.0698F, 0.0873F, 0.0F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(88, 43).addBox(-0.5F, -2.0686F, -1.2284F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1F, 18.1637F, -0.7923F, 0.1396F, 0.0873F, 0.0F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(97, 73).addBox(-0.5F, -0.0748F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 18.1637F, -0.7923F, -0.4712F, 0.0873F, 0.0F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(78, 73).addBox(-0.5F, -0.6176F, -1.5412F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0579F, 17.9179F, -0.3107F, -1.3265F, 0.2618F, 0.0F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(53, 84).addBox(-0.6295F, -0.2029F, -0.9105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1218F, 19.9572F, -0.4335F, 3.0892F, 0.1047F, 0.0F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(44, 98).addBox(-0.6295F, -0.6888F, -1.3163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 42).addBox(-0.6295F, -0.0888F, -1.7164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 39).addBox(-0.6295F, -0.0888F, -1.1164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1218F, 19.9572F, -0.4335F, -2.426F, 0.1047F, 0.0F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(39, 84).addBox(-0.6295F, -0.0482F, -1.0649F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1218F, 19.9572F, -0.4335F, -3.0892F, 0.1047F, 0.0F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(98, 20).addBox(-0.6295F, -0.6676F, 0.6655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1218F, 19.9572F, -0.4335F, 2.4435F, 0.1047F, 0.0F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(78, 78).addBox(-0.5F, -1.1959F, -1.1809F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0046F, 18.2937F, -0.0775F, -2.5307F, 0.0349F, 0.0F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(20, 97).addBox(-0.5F, 0.397F, -1.2072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 97).addBox(-0.5F, -0.003F, -1.2072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 18.1637F, -0.7923F, -0.3403F, 0.0873F, 0.0F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(93, 4).addBox(1.5F, -2.6F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.2F, 19.9938F, -0.6304F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(77, 63).addBox(0.53F, 9.6789F, -4.5235F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F))
				.texOffs(51, 77).addBox(0.2533F, 9.6789F, -4.5235F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.41F, 7.0245F, -2.1698F, 0.2679F, 0.2106F, 0.0573F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -18.1434F, -1.6146F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-0.3271F, -0.3053F, -2.5559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1218F, 19.9572F, -0.4335F, -0.0806F, -0.1272F, 0.0211F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(93, 82).mirror().addBox(-0.6855F, 0.4518F, -2.9006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.1218F, 19.9572F, -0.4335F, -0.4202F, -0.2808F, 0.1067F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(65, 79).mirror().addBox(-0.6855F, 0.7866F, -4.4285F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1218F, 19.9572F, -0.4335F, -0.5423F, -0.2808F, 0.1067F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(57, 99).mirror().addBox(-0.3004F, 0.1252F, 0.2838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1218F, 19.9572F, -0.4335F, 0.6796F, -0.1566F, 0.0092F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.3004F, -0.4F, -1.0087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1218F, 19.9572F, -0.4335F, -0.1058F, -0.1566F, 0.0092F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(31, 92).mirror().addBox(-0.5F, -1.1735F, -0.8653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(10, 98).mirror().addBox(-0.5F, 0.1265F, -0.8653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.0046F, 18.2937F, -0.0775F, -0.3142F, -0.0349F, 0.0F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-0.0026F, -0.2217F, -0.0636F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.7F, 19.6499F, -8.2452F, 0.5488F, -0.3316F, 0.0045F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(79, 41).mirror().addBox(-0.0026F, -0.1557F, 0.0882F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.7F, 19.6499F, -8.2452F, 1.2819F, -0.3316F, 0.0045F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-0.2F, -0.0243F, 0.0372F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2F, 16.834F, -7.1011F, 0.018F, -0.253F, -0.0045F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(0.0F, -3.2815F, -1.6621F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, 21.034F, -4.9012F, -0.0349F, -0.2443F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(84, 31).mirror().addBox(0.0F, -1.3285F, -2.0141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(84, 35).mirror().addBox(0.0F, -1.0285F, -2.0141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, 21.034F, -4.9012F, -0.2967F, -0.2443F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(52, 99).mirror().addBox(-0.3F, -2.9285F, -1.7141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 33).mirror().addBox(0.0F, -4.0285F, -2.0141F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.7F, 21.034F, -4.9012F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(88, 48).mirror().addBox(-0.5F, -2.6118F, -0.518F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7283F, 19.481F, -0.7684F, 1.946F, -0.0436F, 0.0F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.5F, -3.6269F, -0.7152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F)).mirror(false), PartPose.offsetAndRotation(1.7283F, 19.481F, -0.7684F, 1.8588F, -0.0436F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.5F, -4.8199F, -1.5101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7283F, 19.481F, -0.7684F, 1.6144F, -0.0436F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(63, 92).mirror().addBox(-0.5F, -1.8818F, -1.1977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 18.1637F, -0.7923F, 0.3491F, -0.0873F, 0.0F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(68, 92).mirror().addBox(-0.5F, -1.6516F, -1.2349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 18.1637F, -0.7923F, -0.0698F, -0.0873F, 0.0F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(88, 43).mirror().addBox(-0.5F, -2.0686F, -1.2284F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.1F, 18.1637F, -0.7923F, 0.1396F, -0.0873F, 0.0F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(97, 73).mirror().addBox(-0.5F, -0.0748F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 18.1637F, -0.7923F, -0.4712F, -0.0873F, 0.0F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(-0.5F, -0.6176F, -1.5412F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 17.9179F, -0.3107F, -1.3265F, -0.2618F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(53, 84).mirror().addBox(-0.3705F, -0.2029F, -0.9105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1218F, 19.9572F, -0.4335F, 3.0892F, -0.1047F, 0.0F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(44, 98).mirror().addBox(-0.3705F, -0.6888F, -1.3163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 42).mirror().addBox(-0.3705F, -0.0888F, -1.7164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 39).mirror().addBox(-0.3705F, -0.0888F, -1.1164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1218F, 19.9572F, -0.4335F, -2.426F, -0.1047F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(39, 84).mirror().addBox(-0.3705F, -0.0482F, -1.0649F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1218F, 19.9572F, -0.4335F, -3.0892F, -0.1047F, 0.0F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(98, 20).mirror().addBox(-0.3705F, -0.6676F, 0.6655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1218F, 19.9572F, -0.4335F, 2.4435F, -0.1047F, 0.0F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(-0.5F, -1.1959F, -1.1809F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0046F, 18.2937F, -0.0775F, -2.5307F, -0.0349F, 0.0F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(20, 97).mirror().addBox(-0.5F, 0.397F, -1.2072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 97).mirror().addBox(-0.5F, -0.003F, -1.2072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 18.1637F, -0.7923F, -0.3403F, -0.0873F, 0.0F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(93, 4).mirror().addBox(-2.5F, -2.6F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.2F, 19.9938F, -0.6304F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-1.53F, 9.6789F, -4.5235F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(51, 77).mirror().addBox(-1.2533F, 9.6789F, -4.5235F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.41F, 7.0245F, -2.1698F, 0.2679F, -0.2106F, -0.0573F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.7451F, -0.0812F, 0.7076F, 0.0F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(98, 54).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.7877F, 0.7417F, -0.4633F, 2.6791F, -0.4189F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(98, 51).mirror().addBox(-0.8254F, -0.9289F, 0.4341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(98, 48).mirror().addBox(-0.8254F, -0.9289F, 0.0341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1509F, 0.7872F, 1.1524F, 2.1555F, -0.4189F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(98, 45).mirror().addBox(-0.622F, -0.904F, 0.0431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.1509F, 1.6872F, 0.6524F, 1.1257F, -0.4189F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1509F, 1.3872F, 0.3524F, 0.8465F, -0.4189F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.3913F, -0.1543F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.3238F, -0.7029F, -0.2007F, -0.4189F, 0.0F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(71, 96).mirror().addBox(0.061F, -1.2265F, -2.1538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.7906F, -1.4686F, -8.6596F, 0.8024F, -0.1127F, 0.0081F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(0.061F, -0.4755F, -2.1076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7906F, -1.4686F, -8.6596F, 0.9246F, -0.1127F, 0.0081F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(96, 67).mirror().addBox(0.0274F, -0.7427F, -2.7322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7906F, -1.4686F, -8.6596F, 0.0635F, -0.1657F, 0.0707F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(98, 88).mirror().addBox(-0.3461F, 1.529F, -2.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(66, 96).mirror().addBox(-0.3461F, 1.529F, -1.514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.7906F, -1.4686F, -8.6596F, -1.0324F, -0.2336F, 0.0907F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(0.061F, 0.0592F, -1.9092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7906F, -1.4686F, -8.6596F, -0.2971F, -0.1127F, 0.0081F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(0.061F, -0.1983F, -1.0374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7906F, -1.4686F, -8.6596F, -0.0615F, -0.1127F, 0.0081F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(32, 78).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.3372F, -0.3227F, -8.688F, -0.384F, -0.0611F, 0.0F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(98, 85).mirror().addBox(-0.255F, -1.0117F, -1.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, 1.0314F, -8.5596F, -0.4887F, -0.0611F, 0.0F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(61, 96).mirror().addBox(-0.3099F, -0.9533F, -1.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, 1.3314F, -7.6596F, -0.384F, -0.0611F, 0.0F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(84, 64).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2632F, 0.7786F, -4.9231F, 0.0244F, -0.0984F, 0.0359F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(79, 83).mirror().addBox(-0.4002F, -1.1092F, -5.2865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.3238F, -0.7029F, -0.1065F, -0.0984F, 0.0359F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4426F, 1.0059F, -3.2642F, -0.1396F, -0.1047F, 0.0F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(84, 60).mirror().addBox(0.1306F, -0.5635F, 0.8171F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 2.1749F, -3.024F, -0.1473F, -0.1699F, 0.1255F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(70, 43).mirror().addBox(-0.2753F, 0.1456F, 2.112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 2.1749F, -3.024F, 0.1472F, 0.0027F, 0.1513F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(0.3513F, -0.8104F, -0.7266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 2.1749F, -3.024F, -0.4067F, -0.3724F, 0.1812F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(32, 83).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.6245F, 1.2673F, -1.534F, -0.3403F, -0.1047F, 0.0F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(83, 27).mirror().addBox(-0.4705F, -0.9903F, -0.165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0906F, -0.0686F, -5.7596F, 2.9466F, -0.36F, 0.0382F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(98, 60).mirror().addBox(-0.62F, 0.0233F, -0.238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5718F, 1.3733F, -6.8589F, 3.1124F, -0.36F, 0.0382F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(52, 96).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7381F, 0.7552F, -6.6954F, -3.1184F, -0.36F, 0.0382F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(98, 82).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5726F, -0.3383F, -7.0236F, -1.8356F, -0.36F, 0.0382F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(96, 36).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9248F, -0.3487F, -6.0877F, -1.5738F, -0.36F, 0.0382F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(96, 33).mirror().addBox(-0.4303F, -1.0341F, 0.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1776F, -0.8818F, -5.8953F, -1.398F, -0.0984F, 0.0359F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(96, 30).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2882F, -0.4739F, -4.2441F, 0.0071F, -0.0999F, 0.0316F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(46, 82).mirror().addBox(-0.4123F, -0.9926F, -3.4488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.3238F, -0.7029F, -0.2531F, -0.1047F, 0.0F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(98, 57).mirror().addBox(-0.4268F, -0.0063F, -0.9981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5514F, -0.7878F, -2.93F, -0.3054F, -0.1047F, 0.0F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(14, 82).mirror().addBox(-0.6045F, -0.0574F, -1.9128F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5514F, 0.1122F, -1.23F, -0.4625F, -0.1047F, 0.0F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(30, 96).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 96).addBox(2.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 0.8331F, -1.6714F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(81, 50).mirror().addBox(-0.3913F, -0.8F, -0.7593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.3238F, -0.7029F, 0.0F, -0.4189F, 0.0F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(98, 54).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.7877F, 0.7417F, -0.4633F, 2.6791F, 0.4189F, 0.0F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(98, 51).addBox(-0.1746F, -0.9289F, 0.4341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(98, 48).addBox(-0.1746F, -0.9289F, 0.0341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1509F, 0.7872F, 1.1524F, 2.1555F, 0.4189F, 0.0F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(98, 45).addBox(-0.378F, -0.904F, 0.0431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.1509F, 1.6872F, 0.6524F, 1.1257F, 0.4189F, 0.0F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(5, 97).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1509F, 1.3872F, 0.3524F, 0.8465F, 0.4189F, 0.0F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(0, 97).addBox(-0.6087F, -0.1543F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 1.3238F, -0.7029F, -0.2007F, 0.4189F, 0.0F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(71, 96).addBox(-1.061F, -1.2265F, -2.1538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2094F, -1.4686F, -8.6596F, 0.8024F, 0.1127F, -0.0081F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(7, 84).addBox(-1.061F, -0.4755F, -2.1076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2094F, -1.4686F, -8.6596F, 0.9246F, 0.1127F, -0.0081F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(96, 67).addBox(-1.0274F, -0.7427F, -2.7322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2094F, -1.4686F, -8.6596F, 0.0635F, 0.1657F, -0.0707F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(98, 88).addBox(-0.6539F, 1.529F, -2.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(66, 96).addBox(-0.6539F, 1.529F, -1.514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.2094F, -1.4686F, -8.6596F, -1.0324F, 0.2336F, -0.0907F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(0, 84).addBox(-1.061F, 0.0592F, -1.9092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2094F, -1.4686F, -8.6596F, -0.2971F, 0.1127F, -0.0081F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(96, 64).addBox(-1.061F, -0.1983F, -1.0374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2094F, -1.4686F, -8.6596F, -0.0615F, 0.1127F, -0.0081F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(32, 78).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.6628F, -0.3227F, -8.688F, -0.384F, 0.0611F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(98, 85).addBox(-0.745F, -1.0117F, -1.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4094F, 1.0314F, -8.5596F, -0.4887F, 0.0611F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(61, 96).addBox(-0.6901F, -0.9533F, -1.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4094F, 1.3314F, -7.6596F, -0.384F, 0.0611F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(84, 64).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2632F, 0.7786F, -4.9231F, 0.0244F, 0.0984F, -0.0359F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(79, 83).addBox(-0.5998F, -1.1092F, -5.2865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8F, 1.3238F, -0.7029F, -0.1065F, 0.0984F, -0.0359F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(72, 83).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4426F, 1.0059F, -3.2642F, -0.1396F, 0.1047F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(84, 60).addBox(-1.1306F, -0.5635F, 0.8171F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 2.1749F, -3.024F, -0.1473F, 0.1699F, -0.1255F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(70, 43).addBox(-0.7247F, 0.1456F, 2.112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 2.1749F, -3.024F, 0.1472F, -0.0027F, -0.1513F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(65, 83).addBox(-1.3514F, -0.8104F, -0.7266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 2.1749F, -3.024F, -0.4067F, 0.3724F, -0.1812F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(32, 83).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6245F, 1.2673F, -1.534F, -0.3403F, 0.1047F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(83, 27).addBox(-0.5295F, -0.9903F, -0.165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0906F, -0.0686F, -5.7596F, 2.9466F, 0.36F, -0.0382F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(98, 60).addBox(-0.38F, 0.0233F, -0.238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.4282F, 1.3733F, -6.8589F, 3.1124F, 0.36F, -0.0382F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(52, 96).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2619F, 0.7552F, -6.6954F, -3.1184F, 0.36F, -0.0382F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(98, 82).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4274F, -0.3383F, -7.0236F, -1.8356F, 0.36F, -0.0382F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(96, 36).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0752F, -0.3487F, -6.0877F, -1.5738F, 0.36F, -0.0382F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(96, 33).addBox(-0.5697F, -1.0341F, 0.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1776F, -0.8818F, -5.8953F, -1.398F, 0.0984F, -0.0359F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(96, 30).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2882F, -0.4739F, -4.2441F, 0.0071F, 0.0999F, -0.0316F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(46, 82).addBox(-0.5877F, -0.9926F, -3.4488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8F, 1.3238F, -0.7029F, -0.2531F, 0.1047F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(98, 57).addBox(-0.5732F, -0.0063F, -0.9981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5514F, -0.7878F, -2.93F, -0.3054F, 0.1047F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(14, 82).addBox(-0.3955F, -0.0574F, -1.9128F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5514F, 0.1122F, -1.23F, -0.4625F, 0.1047F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(81, 50).addBox(-0.6087F, -0.8F, -0.7593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8F, 1.3238F, -0.7029F, 0.0F, 0.4189F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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