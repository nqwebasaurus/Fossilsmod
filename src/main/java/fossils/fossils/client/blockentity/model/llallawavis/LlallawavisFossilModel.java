package fossils.fossils.client.blockentity.model.llallawavis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LlallawavisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone3;
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
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public LlallawavisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone3 = this.hips.getChild("bone3");
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
		this.bone = this.chest.getChild("bone");
		this.bone4 = this.chest.getChild("bone4");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.1F, 0.3F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 60).addBox(-0.5F, 0.9F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.6418F, 1.4632F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(79, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4735F, -2.0775F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 39).addBox(-1.0F, 1.4F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8159F, -1.6798F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 82).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.04F, -2.7408F, -0.303F, -0.174F, -0.4115F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 54).mirror().addBox(-6.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.04F, -2.7408F, -0.0235F, -0.3712F, -1.5081F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 74).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.04F, -2.7408F, -0.2118F, -0.3081F, -0.9559F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(67, 74).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.04F, -2.7408F, -0.2118F, 0.3081F, 0.9559F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 54).addBox(2.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.04F, -2.7408F, -0.0235F, 0.3712F, 1.5081F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(34, 82).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.04F, -2.7408F, -0.303F, 0.174F, 0.4115F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.0973F, 0.0176F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7F, -4.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.049F, -4.8424F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 42).addBox(-1.1F, -0.0199F, -1.6978F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9475F, -0.624F, 6.4217F, -0.7659F, -1.0691F, 0.9772F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 32).addBox(-4.6739F, 0.0283F, -1.1443F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9475F, -0.624F, 6.4217F, -1.5962F, -1.1903F, 1.892F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -0.25F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.181F, -2.0857F, 2.3499F, -1.8408F, -1.0625F, 2.2545F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 53).addBox(-0.502F, -0.4512F, -1.2225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2884F, -2.4722F, 1.2346F, -1.1032F, -0.2125F, 1.0949F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(23, 8).addBox(-1.5026F, -0.4738F, -1.2158F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2884F, -2.4722F, 1.2346F, -1.116F, 0.3002F, 0.4255F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(16, 45).addBox(-2.4909F, 0.1143F, -2.4949F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5319F, -2.5483F, 4.4889F, -0.4031F, -0.1886F, 0.1104F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(63, 50).addBox(-0.825F, -0.5F, 0.033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0524F, 0.6741F, 8.0599F, -1.6271F, 0.9919F, -1.2797F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(27, 50).addBox(0.6F, 0.025F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5145F, -1.7164F, 6.0077F, -0.4137F, 0.1766F, 0.2417F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(45, 10).addBox(-0.7351F, -0.5F, -2.5571F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0524F, 0.6741F, 8.0599F, -0.6839F, 0.6918F, -0.2124F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(42, 20).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2391F, 2.1506F, 9.3431F, -0.5186F, -0.0263F, 0.2668F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(63, 8).addBox(0.2205F, -4.5088F, 6.6124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8396F, 1.2227F, 3.3041F, -1.0698F, 0.1842F, 0.2347F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 31).addBox(-0.4838F, -0.7042F, 4.3224F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8396F, 1.2227F, 3.3041F, -0.5908F, 0.2366F, 0.1481F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(60, 30).addBox(-0.5189F, 0.9683F, -2.145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8396F, 2.697F, 8.0774F, -1.6191F, 0.2392F, 0.045F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(27, 25).addBox(-0.9077F, -0.6507F, -0.1691F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8396F, 1.2227F, 3.3041F, -0.5939F, 0.3135F, 0.101F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 71).addBox(-0.898F, -5.1026F, 0.955F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8396F, 2.697F, 6.4774F, -1.3962F, 0.152F, 0.0443F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(10, 74).addBox(-0.898F, -0.7071F, 3.2814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8396F, 2.697F, 6.4774F, -0.3054F, 0.152F, 0.0443F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 42).addBox(-0.5F, -1.5F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2056F, -0.1732F, 1.9348F, -0.5323F, 0.152F, 0.0443F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(44, 42).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2056F, -0.1732F, 1.9348F, -1.0122F, 0.152F, 0.0443F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(40, 25).addBox(-0.5189F, -0.3787F, -4.8301F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8396F, 2.697F, 8.0774F, -0.441F, 0.2392F, 0.045F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(23, 0).addBox(-0.898F, -2.1632F, -0.925F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8396F, 2.697F, 6.4774F, -0.6544F, 0.152F, 0.0443F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, -0.5F, 0.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(0, 12).addBox(-1.5F, -0.5F, -3.75F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.793F, 1.7788F, 9.7803F, -0.5385F, 0.2607F, 0.099F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 20).addBox(-1.0F, -1.9973F, 3.0176F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3346F, 0.226F, 0.5725F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.049F, -4.8424F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.9F, -0.0199F, -1.6978F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9475F, -0.624F, 6.4217F, -0.7659F, 1.0691F, -0.9772F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(0.6739F, 0.0283F, -1.1443F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9475F, -0.624F, 6.4217F, -1.5962F, 1.1903F, -1.892F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-1.5F, -0.25F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.181F, -2.0857F, 2.3499F, -1.8408F, 1.0625F, -2.2545F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(16, 53).mirror().addBox(-1.4979F, -0.4512F, -1.2225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2884F, -2.4722F, 1.2346F, -1.1032F, 0.2125F, -1.0949F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(23, 8).mirror().addBox(-0.4974F, -0.4738F, -1.2158F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2884F, -2.4722F, 1.2346F, -1.116F, -0.3002F, -0.4255F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(16, 45).mirror().addBox(1.4909F, 0.1143F, -2.4949F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5319F, -2.5483F, 4.4889F, -0.4031F, 0.1886F, -0.1104F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(63, 50).mirror().addBox(-0.175F, -0.5F, 0.033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0524F, 0.6741F, 8.0599F, -1.6271F, -0.9919F, 1.2797F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(27, 50).mirror().addBox(-1.6F, 0.025F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5145F, -1.7164F, 6.0077F, -0.4137F, -0.1766F, -0.2417F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 10).mirror().addBox(-0.265F, -0.5F, -2.5571F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0524F, 0.6741F, 8.0599F, -0.6839F, -0.6918F, 0.2124F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(42, 20).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2391F, 2.1506F, 9.3431F, -0.5186F, 0.0263F, -0.2668F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(63, 8).mirror().addBox(-1.2205F, -4.5088F, 6.6124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8396F, 1.2227F, 3.3041F, -1.0698F, -0.1842F, -0.2347F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(40, 31).mirror().addBox(-0.5162F, -0.7042F, 4.3224F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8396F, 1.2227F, 3.3041F, -0.5908F, -0.2366F, -0.1481F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(60, 30).mirror().addBox(-0.4811F, 0.9683F, -2.145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8396F, 2.697F, 8.0774F, -1.6191F, -0.2392F, -0.045F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(27, 25).mirror().addBox(-0.0923F, -0.6507F, -0.1691F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8396F, 1.2227F, 3.3041F, -0.5939F, -0.3135F, -0.101F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(62, 71).mirror().addBox(-0.102F, -5.1026F, 0.955F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8396F, 2.697F, 6.4774F, -1.3962F, -0.152F, -0.0443F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(10, 74).mirror().addBox(-0.102F, -0.7071F, 3.2814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8396F, 2.697F, 6.4774F, -0.3054F, -0.152F, -0.0443F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(62, 42).mirror().addBox(-0.5F, -1.5F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2056F, -0.1732F, 1.9348F, -0.5323F, -0.152F, -0.0443F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(44, 42).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2056F, -0.1732F, 1.9348F, -1.0122F, -0.152F, -0.0443F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 25).mirror().addBox(-0.4811F, -0.3787F, -4.8301F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8396F, 2.697F, 8.0774F, -0.441F, -0.2392F, -0.045F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-0.102F, -2.1632F, -0.925F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8396F, 2.697F, 6.4774F, -0.6544F, -0.152F, -0.0443F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-1.5F, -0.5F, 0.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(0, 12).mirror().addBox(-2.5F, -0.5F, -3.75F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.793F, 1.7788F, 9.7803F, -0.5385F, -0.2607F, -0.099F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(7, 20).mirror().addBox(0.0F, -1.9973F, 3.0176F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3346F, -0.226F, -0.5725F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(60, 20).addBox(0.7F, 0.3F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(40, 68).addBox(0.7F, 4.9004F, -0.5358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3F, -0.0079F, -1.3402F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(77, 9).addBox(-1.5F, -0.9301F, -1.0618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 78).addBox(0.5F, -0.9301F, -1.0618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7F, 5.7449F, 0.861F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(77, 45).addBox(-0.5F, -1.1708F, -0.788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 5.7449F, 0.861F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(25, 79).addBox(0.5F, -0.9551F, -0.0868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 5.7449F, 0.861F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(39, 55).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 2.1611F, 0.2122F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(32, 55).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2F, 2.1611F, 0.2122F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(70, 9).addBox(-5.4435F, -1.1691F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 75).addBox(-3.5F, -2.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2F, 0.4F, -0.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(67, 16).addBox(-1.0F, -0.025F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7F, -0.3052F, -1.1401F, 1.7671F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(25, 76).addBox(-3.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.2F, -1.3208F, -1.0147F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(81, 42).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -1.0365F, -0.392F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 5.563F, -0.3095F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(32, 8).addBox(-1.0F, -1.3F, -1.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.7774F, -0.8672F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 18).addBox(-2.5F, -12.9F, 0.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 15.8547F, -1.8158F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(54, 50).addBox(-1.5F, -1.2F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 16.0169F, -1.2296F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(54, 11).addBox(-1.5F, -1.3F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, 16.0169F, -1.2296F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(20, 20).addBox(-2.5F, -0.2F, -1.1F, 2.0F, 12.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 3.3497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(46, 55).addBox(-5.8F, -3.6498F, -0.1321F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(11, 44).addBox(-0.7F, -0.2285F, -0.131F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 2.0636F, 0.3564F, -0.1744F, 0.0064F, 0.052F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(15, 34).addBox(-1.5F, -0.4447F, -0.8239F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 17.3316F, -1.3077F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(53, 18).addBox(-5.5F, 0.0F, -0.95F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0F, 7.5553F, 0.1261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition toe = leftLeg3.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0469F, 10.6598F, -0.4178F, -0.0436F, -0.3927F, 0.0F));

		PartDefinition cube_r72 = toe.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(81, 39).addBox(-1.5F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r73 = toe.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 36).addBox(-1.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(32, 15).addBox(-2.5F, 0.0F, -2.85F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.8367F, -0.4416F, 1.213F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(27, 20).addBox(-2.5F, -0.5F, -3.1F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.543F, -2.4824F, -0.258F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(-2.7F, 0.3F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(40, 68).mirror().addBox(-2.7F, 4.9004F, -0.5358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.0079F, -1.3402F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(0.5F, -0.9301F, -1.0618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 78).mirror().addBox(-1.5F, -0.9301F, -1.0618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 5.7449F, 0.861F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(77, 45).mirror().addBox(-0.5F, -1.1708F, -0.788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 5.7449F, 0.861F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(-1.5F, -0.9551F, -0.0868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 5.7449F, 0.861F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(39, 55).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 2.1611F, 0.2122F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 2.1611F, 0.2122F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(70, 9).mirror().addBox(3.4435F, -1.1691F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 75).mirror().addBox(2.5F, -2.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 0.4F, -0.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(67, 16).mirror().addBox(0.0F, -0.025F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -0.3052F, -1.1401F, 1.7671F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(25, 76).mirror().addBox(2.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -1.3208F, -1.0147F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(81, 42).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -1.0365F, -0.392F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 5.563F, -0.3095F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(32, 8).mirror().addBox(-1.0F, -1.3F, -1.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 1.7774F, -0.8672F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(0.5F, -12.9F, 0.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 15.8547F, -1.8158F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(54, 50).mirror().addBox(-1.5F, -1.2F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 16.0169F, -1.2296F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(54, 11).mirror().addBox(-1.5F, -1.3F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, 16.0169F, -1.2296F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(0.5F, -0.2F, -1.1F, 2.0F, 12.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.3497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(46, 55).mirror().addBox(3.8F, -3.6498F, -0.1321F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(11, 44).mirror().addBox(-0.3F, -0.2285F, -0.131F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0636F, 0.3564F, -0.1744F, -0.0064F, -0.052F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(15, 34).mirror().addBox(-0.5F, -0.4447F, -0.8239F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 17.3316F, -1.3077F, -2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(53, 18).mirror().addBox(3.5F, 0.0F, -0.95F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 7.5553F, 0.1261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0469F, 10.6598F, -0.4178F, -0.0436F, 0.3927F, 0.0F));

		PartDefinition cube_r91 = toe2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(81, 39).mirror().addBox(0.5F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r92 = toe2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(81, 36).mirror().addBox(0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(32, 15).mirror().addBox(-1.5F, 0.0F, -2.85F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.8367F, -0.4416F, 2.2602F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(27, 20).mirror().addBox(-1.5F, -0.5F, -3.1F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.543F, -2.4824F, -0.1271F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(36, 50).addBox(-0.5F, -0.5104F, -0.0756F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(77, 82).addBox(0.0F, -1.1104F, 0.9244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5026F, 5.1355F, -0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(44, 60).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 82).addBox(0.0F, -0.894F, 0.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0711F, 2.6803F, 0.2007F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(60, 59).addBox(-0.5F, -0.4415F, -0.1155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0578F, 2.0666F, 0.5509F, 0.3007F, 0.18F));

		PartDefinition cube_r93 = tail3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(76, 36).addBox(-0.5F, -0.9591F, -0.0106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8585F, -0.1155F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(30, 76).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.3415F, -0.1155F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(14, 62).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -0.3415F, -0.1155F, -0.3054F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(28, 82).addBox(0.0F, -1.8025F, -0.0576F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.9F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(31, 82).addBox(0.0F, -1.3535F, -0.0164F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.8F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(7, 30).mirror().addBox(-6.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.94F, -0.4408F, -0.0235F, -0.3712F, -1.5081F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.94F, -0.4408F, -0.2118F, -0.3081F, -0.9559F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(45, 82).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.94F, -0.4408F, -0.303F, -0.174F, -0.4115F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(15, 32).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.3408F, -0.347F, -0.1591F, -0.3314F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 26).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.3408F, -0.259F, -0.3176F, -0.8686F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(34, 45).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.3408F, -0.0593F, -0.4029F, -1.4217F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(0.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 12).mirror().addBox(0.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.102F, -2.1332F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(7, 30).addBox(2.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.94F, -0.4408F, -0.0235F, 0.3712F, 1.5081F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(74, 74).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.94F, -0.4408F, -0.2118F, 0.3081F, 0.9559F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(45, 82).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.94F, -0.4408F, -0.303F, 0.174F, 0.4115F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(15, 32).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.3408F, -0.347F, 0.1591F, 0.3314F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(72, 26).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.3408F, -0.259F, 0.3176F, 0.8686F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(34, 45).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.3408F, -0.0593F, 0.4029F, 1.4217F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(20, 81).addBox(-1.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 12).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.102F, -2.1332F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(22, 39).addBox(-1.0F, -0.0506F, -0.0332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -4.0F, -0.219F, -0.0852F, 0.0189F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(25, 82).addBox(0.0F, -2.0468F, -1.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(15, 82).addBox(0.0F, -1.1982F, 0.0683F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(82, 6).addBox(0.0F, -1.7924F, -0.0881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.7F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(79, 18).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 15).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 79).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, -0.1068F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(81, 74).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.2547F, 0.0552F, -0.3878F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(72, 56).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.1494F, 0.1755F, -0.9229F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(60, 81).mirror().addBox(-3.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.0407F, 0.2264F, -1.455F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(-3.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.0083F, 0.0548F, -1.3985F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.0346F, 0.0433F, -0.8744F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(75, 72).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.089F, 0.0004F, -0.3314F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(72, 24).mirror().addBox(-4.77F, -3.756F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.0176F, -0.0735F, -1.381F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.052F, -0.0549F, -0.8566F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(47, 18).mirror().addBox(-2.9152F, -0.4179F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.036F, -0.0388F, -0.3117F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(79, 18).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 15).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 79).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, -0.1068F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(81, 74).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.2547F, -0.0552F, 0.3878F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(72, 56).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.1494F, -0.1755F, 0.9229F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(60, 81).addBox(2.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.0407F, -0.2264F, 1.455F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(80, 51).addBox(2.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.0083F, -0.0548F, 1.3985F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(72, 54).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.0346F, -0.0433F, 0.8744F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(75, 72).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.089F, -0.0004F, 0.3314F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(72, 24).addBox(2.77F, -3.756F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.0176F, 0.0735F, 1.381F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(20, 72).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.052F, 0.0549F, 0.8566F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(47, 18).addBox(1.9152F, -0.4179F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.036F, 0.0388F, 0.3117F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(5, 69).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.4183F, -0.1228F, 0.8797F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(45, 73).addBox(-1.1727F, 0.5918F, -1.5461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 6.987F, -2.6936F, 1.1065F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(49, 64).addBox(-1.6727F, 1.0258F, -1.2834F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 6.987F, -2.6936F, 1.0193F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(73, 2).addBox(-1.1727F, -2.0312F, -0.0252F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 8.6869F, -2.7936F, 0.8448F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(53, 43).addBox(-2.1727F, -0.7087F, -1.0059F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 6.987F, -2.6936F, 0.7924F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(79, 21).addBox(-1.1727F, -1.0621F, 0.0145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 7.3869F, -4.2936F, 0.6528F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(53, 35).addBox(-2.1727F, -1.9941F, -0.0198F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 7.1869F, -3.8936F, 0.6179F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(36, 5).addBox(-2.1727F, -2.8888F, -0.6371F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 7.1869F, -3.8936F, 0.2862F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(75, 76).addBox(-1.1727F, -1.3328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 76).addBox(-1.1727F, -0.9328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 5.5624F, -5.3746F, 0.1728F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(65, 76).addBox(-1.1727F, -0.9328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 6.487F, -4.9936F, 0.391F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(27, 32).addBox(-1.0F, -1.3F, -3.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(70, 70).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(3.8365F, -0.6569F, -4.7223F, 1.1952F, 0.3187F, -0.1359F));

		PartDefinition cube_r147 = leftArm1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(70, 66).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftArm1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(55, 75).addBox(-0.5F, 0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(75, 50).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 4.4503F, 1.3665F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftArm1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(10, 70).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0059F, 2.9983F, 0.093F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftArm1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(70, 50).addBox(-0.5F, -1.075F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 2.2353F, -0.1475F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1088F, 6.275F, 1.0032F, -1.9639F, 0.0387F, -0.0202F));

		PartDefinition cube_r151 = leftArm2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(22, 34).addBox(-1.75F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 2.05F, 0.6F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftArm2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(75, 69).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 76).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 0.7553F, 0.278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftArm2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(75, 66).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(60, 75).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 0.7553F, 0.278F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftArm2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(57, 71).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.05F, 2.15F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftArm2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(40, 71).addBox(-0.5F, -2.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(60, 24).addBox(-0.5F, -1.45F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.1509F, -0.4869F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.479F, 4.4134F, -0.0401F, 1.2199F, -0.0692F, 0.0532F));

		PartDefinition cube_r156 = leftHand.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(71, 82).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8045F, -0.4564F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftHand.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(57, 81).addBox(0.0F, -1.0F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.15F, -0.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftHand.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(52, 71).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.452F, 0.8948F, 0.7182F, 0.3577F, 0.0495F, 0.0529F));

		PartDefinition cube_r159 = leftHand.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.5F, 1.7935F, 0.7102F, -0.0089F, 0.0495F, 0.0529F));

		PartDefinition cube_r160 = leftHand.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(74, 62).addBox(-0.5F, -0.4F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.3036F, 0.4274F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftHand.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(47, 68).addBox(-1.0F, -0.35F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-3.8365F, -0.6569F, -4.7223F, 1.1952F, -0.3187F, 0.1359F));

		PartDefinition cube_r162 = rightArm1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r163 = rightArm1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(55, 75).mirror().addBox(-0.5F, 0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(75, 50).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 4.4503F, 1.3665F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r164 = rightArm1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-0.5F, -0.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 2.9983F, 0.093F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r165 = rightArm1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(70, 50).mirror().addBox(-0.5F, -1.075F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 2.2353F, -0.1475F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1088F, 6.275F, 1.0032F, -1.9639F, -0.0387F, 0.0202F));

		PartDefinition cube_r166 = rightArm2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(22, 34).mirror().addBox(0.75F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.05F, 0.6F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r167 = rightArm2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 76).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.05F, 0.7553F, 0.278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r168 = rightArm2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(60, 75).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.05F, 0.7553F, 0.278F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r169 = rightArm2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(57, 71).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.05F, 2.15F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightArm2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-0.5F, -2.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(60, 24).mirror().addBox(-0.5F, -1.45F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.1509F, -0.4869F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.479F, 4.4134F, -0.0401F, 1.2199F, 0.0692F, -0.0532F));

		PartDefinition cube_r171 = rightHand.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(71, 82).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.8045F, -0.4564F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r172 = rightHand.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(57, 81).mirror().addBox(0.0F, -1.0F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.15F, -0.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r173 = rightHand.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(52, 71).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.452F, 0.8948F, 0.7182F, 0.3577F, -0.0495F, -0.0529F));

		PartDefinition cube_r174 = rightHand.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.5F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.7935F, 0.7102F, -0.0089F, -0.0495F, -0.0529F));

		PartDefinition cube_r175 = rightHand.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(74, 62).mirror().addBox(-0.5F, -0.4F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.3036F, 0.4274F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r176 = rightHand.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(47, 68).mirror().addBox(0.0F, -0.35F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.8F, 2.2036F, -3.0961F));

		PartDefinition cube_r177 = bone.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(25, 45).addBox(-0.3709F, -0.6659F, 0.06F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1458F, -3.5763F, 1.9933F, -0.0483F, -0.3245F, -0.3498F));

		PartDefinition cube_r178 = bone.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(33, 39).addBox(-0.3942F, -0.636F, -3.5696F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1458F, -3.5763F, 1.9933F, 0.1405F, -0.1443F, -0.3338F));

		PartDefinition cube_r179 = bone.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(42, 64).addBox(-0.3796F, -0.7087F, -1.2202F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.1273F, 4.7833F, 0.4025F, 1.0836F, -0.6338F, -0.8409F));

		PartDefinition cube_r180 = bone.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(42, 77).addBox(-0.1364F, 0.3955F, -0.634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1287F, 6.0365F, 2.1885F, -3.061F, -1.452F, -2.7507F));

		PartDefinition cube_r181 = bone.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(77, 6).addBox(-0.3678F, -0.2618F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1287F, 6.0365F, 2.1885F, 1.9011F, -1.1972F, -1.5395F));

		PartDefinition cube_r182 = bone.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(15, 72).addBox(-0.3918F, -1.9648F, -0.5979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1287F, 6.0365F, 2.1885F, 1.6225F, -1.0666F, -1.364F));

		PartDefinition cube_r183 = bone.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(7, 28).addBox(-0.3F, -0.4F, -0.1F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1351F, 5.6022F, 2.2633F, 1.6854F, -1.275F, -1.0375F));

		PartDefinition cube_r184 = bone.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(60, 0).addBox(-0.1F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5949F, 4.7117F, 1.8569F, 1.3015F, -1.2152F, -1.2337F));

		PartDefinition cube_r185 = bone.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(7, 18).addBox(-0.8F, -0.2F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5466F, 3.2688F, 1.1672F, 1.296F, -1.0857F, -1.0749F));

		PartDefinition cube_r186 = bone.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(69, 32).addBox(-0.1F, -1.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-3.8F, 7.2147F, 2.9732F, 0.8714F, -0.1409F, 0.1176F));

		PartDefinition cube_r187 = bone.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(69, 0).addBox(-0.4F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5466F, 2.4537F, 0.5879F, 1.1805F, -0.8939F, -1.0852F));

		PartDefinition cube_r188 = bone.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(49, 3).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5596F, 1.4899F, -0.1873F, 1.2976F, -0.6016F, -1.197F));

		PartDefinition cube_r189 = bone.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(5, 74).addBox(-0.2918F, -0.65F, -0.5682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3773F, 5.8849F, 1.6924F, 1.1489F, -0.9743F, -0.7402F));

		PartDefinition cube_r190 = bone.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 74).addBox(-0.8801F, -0.85F, -0.5836F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3773F, 5.8849F, 1.6924F, 1.0176F, -0.5219F, -0.4652F));

		PartDefinition cube_r191 = bone.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 63).addBox(-0.9F, -2.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.38F, 2.7898F, 0.573F, 1.3312F, -0.9319F, -1.2753F));

		PartDefinition cube_r192 = bone.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(62, 38).addBox(-0.7F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.186F, 2.7075F, -1.0375F, 0.5559F, -1.0291F, -0.2739F));

		PartDefinition cube_r193 = bone.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(62, 34).addBox(0.4527F, -1.9941F, -0.6907F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.1273F, 4.9833F, -0.7975F, 0.9234F, -0.758F, -0.7379F));

		PartDefinition cube_r194 = bone.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(17, 12).addBox(-0.7F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0163F, -0.4179F, -1.2093F, 1.7634F, 0.1548F, 0.2611F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.8F, 2.2036F, -3.0961F));

		PartDefinition cube_r195 = bone4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(25, 45).mirror().addBox(-0.6291F, -0.6659F, 0.06F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.1458F, -3.5763F, 1.9933F, -0.0483F, 0.3245F, 0.3498F));

		PartDefinition cube_r196 = bone4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(33, 39).mirror().addBox(-0.6058F, -0.636F, -3.5696F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1458F, -3.5763F, 1.9933F, 0.1405F, 0.1443F, 0.3338F));

		PartDefinition cube_r197 = bone4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(42, 64).mirror().addBox(-1.6204F, -0.7087F, -1.2202F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.1273F, 4.7833F, 0.4025F, 1.0836F, 0.6338F, 0.8409F));

		PartDefinition cube_r198 = bone4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(42, 77).mirror().addBox(-0.8636F, 0.3955F, -0.634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1287F, 6.0365F, 2.1885F, -3.061F, 1.452F, 2.7507F));

		PartDefinition cube_r199 = bone4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-0.6322F, -0.2618F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1287F, 6.0365F, 2.1885F, 1.9011F, 1.1972F, 1.5395F));

		PartDefinition cube_r200 = bone4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(15, 72).mirror().addBox(-0.6082F, -1.9648F, -0.5979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1287F, 6.0365F, 2.1885F, 1.6225F, 1.0666F, 1.364F));

		PartDefinition cube_r201 = bone4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(7, 28).mirror().addBox(-5.7F, -0.4F, -0.1F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1351F, 5.6022F, 2.2633F, 1.6854F, 1.275F, 1.0375F));

		PartDefinition cube_r202 = bone4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-3.9F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5949F, 4.7117F, 1.8569F, 1.3015F, 1.2152F, 1.2337F));

		PartDefinition cube_r203 = bone4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(7, 18).mirror().addBox(-3.2F, -0.2F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5466F, 3.2688F, 1.1672F, 1.296F, 1.0857F, 1.0749F));

		PartDefinition cube_r204 = bone4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-0.9F, -1.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(3.8F, 7.2147F, 2.9732F, 0.8714F, 0.1409F, -0.1176F));

		PartDefinition cube_r205 = bone4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-2.6F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5466F, 2.4537F, 0.5879F, 1.1805F, 0.8939F, 1.0852F));

		PartDefinition cube_r206 = bone4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(49, 3).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5596F, 1.4899F, -0.1873F, 1.2976F, 0.6016F, 1.197F));

		PartDefinition cube_r207 = bone4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-0.7082F, -0.65F, -0.5682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3773F, 5.8849F, 1.6924F, 1.1489F, 0.9743F, 0.7402F));

		PartDefinition cube_r208 = bone4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.1199F, -0.85F, -0.5836F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3773F, 5.8849F, 1.6924F, 1.0176F, 0.5219F, 0.4652F));

		PartDefinition cube_r209 = bone4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.1F, -2.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.38F, 2.7898F, 0.573F, 1.3312F, 0.9319F, 1.2753F));

		PartDefinition cube_r210 = bone4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-1.3F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.186F, 2.7075F, -1.0375F, 0.5559F, 1.0291F, 0.2739F));

		PartDefinition cube_r211 = bone4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(62, 34).mirror().addBox(-2.4527F, -1.9941F, -0.6907F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.1273F, 4.9833F, -0.7975F, 0.9234F, 0.758F, 0.7379F));

		PartDefinition cube_r212 = bone4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(17, 12).mirror().addBox(-0.3F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0163F, -0.4179F, -1.2093F, 1.7634F, -0.1548F, -0.2611F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -4.6F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r213 = neck6.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(62, 56).addBox(0.0F, -2.8943F, -2.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 64).addBox(-0.5F, -1.9943F, -2.1586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8F, -0.2F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r214 = neck6.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -1.3408F, 0.4069F, 0.1421F, -0.7393F));

		PartDefinition cube_r215 = neck6.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(82, 10).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -1.3408F, 0.4069F, -0.1421F, 0.7393F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -1.6F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r216 = neck5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(63, 12).addBox(0.0F, -1.8F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 37).addBox(-0.5F, -1.1F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -2.8F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r217 = neck4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(59, 8).addBox(0.0F, -2.5981F, 2.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 50).addBox(-0.5F, -2.0981F, 1.9713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6F, -1.4F, 0.1936F, -0.2814F, 0.1919F));

		PartDefinition cube_r218 = neck3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(67, 71).addBox(0.0F, 0.0065F, -0.1463F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.1F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r219 = neck3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(52, 68).addBox(0.0F, 1.9374F, -0.2567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 64).addBox(0.0F, -0.0626F, -0.5567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r220 = neck3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(54, 3).addBox(-1.0F, 0.0773F, -0.9318F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.6555F, -1.3607F, -0.3503F, -0.0817F, 0.0306F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(82, 45).addBox(0.0F, 2.0061F, 0.0563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 72).addBox(0.0F, 0.0061F, -0.3437F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -1.5F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 69).addBox(-1.0F, 0.9272F, -0.8396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.2F, -2.3F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2905F, -1.5975F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r223 = neck.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(65, 82).addBox(0.0F, -0.8039F, -0.0513F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.8F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r224 = neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(28, 64).addBox(-1.0F, -0.1384F, 2.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.1F, -4.6F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3133F, -1.9265F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r225 = neck7.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(68, 82).addBox(0.0F, -1.2039F, -0.0513F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.6F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r226 = neck7.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(35, 64).addBox(-1.0F, -0.1384F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9F, -3.4F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck7.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.258F, -1.8926F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(70, 6).addBox(-1.0F, -1.5329F, -1.213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.7954F, 0.1375F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(49, 0).addBox(-2.0F, -0.9079F, -0.888F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.5355F, 0.1134F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(12, 66).addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0184F, -2.4863F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(20, 74).addBox(-0.5F, -1.975F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8115F, -4.2854F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(80, 76).addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.3191F, -3.415F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(74, 16).addBox(-0.5F, -0.7F, -1.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.6028F, -2.3849F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(16, 57).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.6028F, -2.3849F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(76, 39).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.1496F, -1.7677F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(69, 43).addBox(-1.0F, -0.9065F, -0.8828F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -2.987F, -2.8849F, 1.8893F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(69, 40).addBox(-1.0F, -0.9065F, -0.8828F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.0324F, -2.0861F, 1.6275F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(69, 37).addBox(-1.0F, -0.1065F, -0.8828F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -3.0324F, -2.0861F, 1.5577F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, -1.3002F, -0.9038F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(45, 47).addBox(-2.0F, -0.9002F, -0.9038F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.7035F, 0.948F, 0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(16, 50).addBox(-2.0F, -0.925F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -1.6493F, -0.7168F, -2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(34, 47).addBox(-2.0F, -0.625F, -0.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.2742F, -0.2704F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(47, 15).addBox(-2.0F, -0.093F, -0.8155F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -0.9943F, 0.8142F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(53, 56).addBox(-1.5F, -0.925F, -1.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 0.0981F, -0.7996F, -2.3955F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(56, 47).addBox(-1.5F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.3107F, 0.0665F, -1.5664F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, 0.4731F, -0.4983F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -1.6027F, 0.9088F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(5, 65).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.9822F, -2.5707F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(65, 54).addBox(-0.5F, -0.2553F, -0.2325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -3.6002F, -3.6842F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(40, 80).addBox(-0.5F, -0.2553F, -0.2325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -3.8941F, -4.0887F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(75, 79).addBox(-0.5F, -0.0303F, 1.2925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(47, 79).addBox(-0.5F, -0.0303F, 0.7925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -4.8298F, -5.8986F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(23, 60).addBox(-0.5F, -0.2553F, -1.7575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -4.2458F, -5.004F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(80, 65).addBox(-0.5F, -0.4212F, -1.0006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(80, 48).addBox(-0.5F, -0.4212F, -0.8006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(35, 79).addBox(-0.5F, -0.4212F, -0.6006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -3.4081F, -9.7487F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(66, 2).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.0F, -3.0878F, -9.5898F, 0.624F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(80, 68).addBox(-0.5F, -0.7115F, -0.303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -3.1609F, -9.4382F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(80, 71).addBox(-0.5F, -0.3115F, -0.303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.7193F, -9.5292F, 0.7374F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(79, 33).addBox(-0.5F, -0.3115F, -0.703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -3.7193F, -9.5292F, 0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(79, 30).addBox(-0.5F, -0.2454F, -0.7251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -4.1592F, -9.0253F, 0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(30, 79).addBox(-0.5F, -0.8455F, 0.2074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -3.4443F, -9.2292F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(79, 27).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -4.4341F, -8.0422F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(56, 67).addBox(-0.5F, -0.45F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -4.1959F, -7.6615F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(52, 81).addBox(-0.5F, -0.2553F, -0.7075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -4.337F, -6.5284F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -10.3781F, -2.6971F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(79, 62).addBox(-0.7538F, -0.3895F, -0.2503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(79, 59).addBox(-0.7538F, -0.3895F, -0.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.1336F, 10.3523F, 1.7963F, -0.4697F, 0.2599F, -0.0112F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(79, 56).addBox(-0.7538F, -0.2442F, -0.2219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F))
				.texOffs(79, 53).addBox(-0.7538F, -0.2442F, -0.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1336F, 10.3523F, 1.7963F, -0.7664F, 0.2599F, -0.0112F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(10, 81).addBox(-0.975F, -0.225F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.9F, 7.8568F, 1.6098F, 0.4918F, 1.1319F, -1.0364F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(5, 81).addBox(-0.975F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9F, 7.8568F, 1.6098F, 0.9849F, 0.8265F, -0.4542F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(10, 78).addBox(-1.0606F, 1.2433F, -0.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(20, 78).addBox(-1.0606F, 0.8433F, -0.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1619F, 7.797F, -0.5903F, 1.4259F, 0.7248F, -0.1716F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(74, 58).addBox(-0.925F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.3F, 8.0072F, -0.8338F, 1.8916F, 0.116F, 0.0384F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(78, 3).addBox(-0.3904F, 1.3946F, -0.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(78, 0).addBox(-0.3904F, 0.9946F, -0.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.1619F, 7.797F, -0.5903F, 1.452F, 0.4219F, -0.124F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(32, 72).addBox(-0.6974F, -0.438F, -0.5292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.1619F, 7.797F, -0.5903F, 1.6472F, 0.4025F, -0.0923F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(27, 72).addBox(-0.6971F, -0.4644F, -0.5292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1619F, 7.797F, -0.5903F, 1.6589F, 0.646F, -0.0692F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(65, 24).addBox(-0.7601F, -0.0301F, -2.0763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.1336F, 9.9523F, 1.7963F, -0.4437F, 0.2774F, -0.0112F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(51, 30).addBox(-0.789F, -0.2868F, -2.9938F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.53F, 9.4614F, 0.326F, -0.3346F, 0.3085F, -0.0888F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(67, 12).addBox(-0.4625F, -0.3168F, -1.1796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5625F, 9.9772F, 2.1495F, -0.838F, 0.0685F, -0.1924F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(74, 12).addBox(-0.5375F, -1.1492F, -0.2913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5625F, 9.9772F, 2.1495F, -0.6635F, 0.0685F, -0.1924F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(26, 68).addBox(-0.49F, -0.9703F, -0.8852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1781F, 7.0544F, -5.5388F, -0.3817F, 0.097F, -0.1197F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(63, 67).addBox(-0.49F, -0.5816F, -1.0113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.1781F, 7.0544F, -5.5388F, -0.5998F, 0.097F, -0.1197F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(60, 63).addBox(-0.394F, -0.9669F, -1.6363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F))
				.texOffs(60, 63).addBox(-0.394F, -0.7669F, -1.9363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(60, 63).addBox(-0.394F, -0.7669F, -1.6363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-2.1228F, 8.1072F, -5.4026F, -0.6529F, 0.117F, -0.1131F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(50, 75).addBox(-0.3058F, -1.7885F, -1.0817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.058F, 7.6267F, -3.4014F, 0.0241F, 0.0457F, -0.1746F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(67, 58).addBox(-0.3351F, -1.6748F, -2.3464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.058F, 7.6267F, -3.4014F, -0.124F, 0.0692F, -0.1228F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 62).addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.0432F, 6.7633F, -4.6939F, -0.1276F, 0.0816F, -0.1696F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(9, 55).addBox(-0.2781F, -1.7307F, -0.7494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.058F, 7.6267F, -3.4014F, -0.0625F, 0.0122F, -0.2088F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(74, 32).addBox(-0.187F, -1.9557F, 0.2343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.058F, 7.6267F, -3.4014F, -0.3511F, -0.101F, -0.1851F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(74, 28).addBox(-0.1722F, -1.9507F, 0.7343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.058F, 7.6267F, -3.4014F, -0.3503F, -0.104F, -0.1933F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(74, 20).addBox(-0.056F, -2.2265F, 0.7218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.058F, 7.6267F, -3.4014F, -0.5992F, -0.1929F, -0.1471F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 58).addBox(0.0613F, -2.4559F, 0.7522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.058F, 7.6267F, -3.4014F, -0.8029F, -0.2603F, -0.1004F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(60, 15).addBox(-0.7949F, -1.7245F, -1.7375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.658F, 8.6267F, -3.9014F, -0.3684F, 0.0576F, -0.0602F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(53, 59).addBox(-0.7913F, -1.6891F, -0.5259F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4184F, 8.5666F, -2.1859F, -0.2962F, -0.0311F, -0.4101F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(59, 3).addBox(-0.7913F, -1.814F, -0.3259F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6507F, 8.1814F, -3.6168F, -0.2893F, 0.0965F, -0.2298F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(51, 25).addBox(-0.3913F, 0.386F, -0.3259F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.058F, 7.6267F, -3.4014F, -0.2689F, 0.1447F, -0.0608F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(45, 5).addBox(-1.0075F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(25, 55).addBox(-0.3425F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7824F, 8.5085F, 0.8286F, -0.2956F, 0.3663F, -0.1F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -10.3781F, -2.6971F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(79, 62).mirror().addBox(-0.2462F, -0.3895F, -0.2503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(79, 59).mirror().addBox(-0.2462F, -0.3895F, -0.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.1336F, 10.3523F, 1.7963F, -0.4697F, -0.2599F, 0.0112F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(-0.2462F, -0.2442F, -0.2219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false)
				.texOffs(79, 53).mirror().addBox(-0.2462F, -0.2442F, -0.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1336F, 10.3523F, 1.7963F, -0.7664F, -0.2599F, 0.0112F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.025F, -0.225F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.9F, 7.8568F, 1.6098F, 0.4918F, -1.1319F, 1.0364F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.025F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9F, 7.8568F, 1.6098F, 0.9849F, -0.8265F, 0.4542F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(0.0606F, 1.2433F, -0.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(20, 78).mirror().addBox(0.0606F, 0.8433F, -0.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1619F, 7.797F, -0.5903F, 1.4259F, -0.7248F, 0.1716F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(74, 58).mirror().addBox(-0.075F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.3F, 8.0072F, -0.8338F, 1.8916F, -0.116F, -0.0384F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(78, 3).mirror().addBox(-0.6096F, 1.3946F, -0.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(78, 0).mirror().addBox(-0.6096F, 0.9946F, -0.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.1619F, 7.797F, -0.5903F, 1.452F, -0.4219F, 0.124F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(32, 72).mirror().addBox(-0.3026F, -0.438F, -0.5292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.1619F, 7.797F, -0.5903F, 1.6472F, -0.4025F, 0.0923F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-0.3029F, -0.4644F, -0.5292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1619F, 7.797F, -0.5903F, 1.6589F, -0.646F, 0.0692F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-0.2399F, -0.0301F, -2.0763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.1336F, 9.9523F, 1.7963F, -0.4437F, -0.2774F, 0.0112F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(51, 30).mirror().addBox(-0.211F, -0.2868F, -2.9938F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.53F, 9.4614F, 0.326F, -0.3346F, -0.3085F, 0.0888F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(67, 12).mirror().addBox(-0.5375F, -0.3168F, -1.1796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5625F, 9.9772F, 2.1495F, -0.838F, -0.0685F, 0.1924F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(-0.4625F, -1.1492F, -0.2913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5625F, 9.9772F, 2.1495F, -0.6635F, -0.0685F, 0.1924F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(26, 68).mirror().addBox(-0.51F, -0.9703F, -0.8852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1781F, 7.0544F, -5.5388F, -0.3817F, -0.097F, 0.1197F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(63, 67).mirror().addBox(-0.51F, -0.5816F, -1.0113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.1781F, 7.0544F, -5.5388F, -0.5998F, -0.097F, 0.1197F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(60, 63).mirror().addBox(-0.606F, -0.9669F, -1.6363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(60, 63).mirror().addBox(-0.606F, -0.7669F, -1.9363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(60, 63).mirror().addBox(-0.606F, -0.7669F, -1.6363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(2.1228F, 8.1072F, -5.4026F, -0.6529F, -0.117F, 0.1131F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(-0.6942F, -1.7885F, -1.0817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.058F, 7.6267F, -3.4014F, 0.0241F, -0.0457F, 0.1746F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(67, 58).mirror().addBox(-0.6649F, -1.6748F, -2.3464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.058F, 7.6267F, -3.4014F, -0.124F, -0.0692F, 0.1228F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(67, 62).mirror().addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.0432F, 6.7633F, -4.6939F, -0.1276F, -0.0816F, 0.1696F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(-0.7219F, -1.7307F, -0.7494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.058F, 7.6267F, -3.4014F, -0.0625F, -0.0122F, 0.2088F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-0.813F, -1.9557F, 0.2343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.058F, 7.6267F, -3.4014F, -0.3511F, 0.101F, 0.1851F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(74, 28).mirror().addBox(-0.8278F, -1.9507F, 0.7343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.058F, 7.6267F, -3.4014F, -0.3503F, 0.104F, 0.1933F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(74, 20).mirror().addBox(-0.944F, -2.2265F, 0.7218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.058F, 7.6267F, -3.4014F, -0.5992F, 0.1929F, 0.1471F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.0613F, -2.4559F, 0.7522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.058F, 7.6267F, -3.4014F, -0.8029F, 0.2603F, 0.1004F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(60, 15).mirror().addBox(-0.2051F, -1.7245F, -1.7375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.658F, 8.6267F, -3.9014F, -0.3684F, -0.0576F, 0.0602F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-0.2087F, -1.6891F, -0.5259F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4184F, 8.5666F, -2.1859F, -0.2962F, 0.0311F, 0.4101F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(59, 3).mirror().addBox(-0.2087F, -1.814F, -0.3259F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6507F, 8.1814F, -3.6168F, -0.2893F, -0.0965F, 0.2298F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(51, 25).mirror().addBox(-0.6087F, 0.386F, -0.3259F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.058F, 7.6267F, -3.4014F, -0.2689F, -0.1447F, 0.0608F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(45, 5).mirror().addBox(-0.9925F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(25, 55).mirror().addBox(-0.6575F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7824F, 8.5085F, 0.8286F, -0.2956F, -0.3663F, 0.1F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.5706F, -0.5267F, 0.5679F, 0.0F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.5387F, 0.6583F, -1.1686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.9946F, -0.0225F, -1.7253F, 2.0252F, -0.1835F, 0.0295F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(72, 46).mirror().addBox(-0.5387F, -1.2596F, -0.3006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9946F, -0.0225F, -1.7253F, -1.592F, -0.1835F, 0.0295F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5033F, -0.5258F, -0.9408F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.265F)).mirror(false), PartPose.offsetAndRotation(-1.0796F, -1.7162F, -8.0159F, -0.2386F, -0.0964F, 0.0345F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-0.4957F, -0.4342F, -1.093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.0796F, -1.7162F, -8.0159F, -0.4439F, -0.0926F, 0.0389F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.4957F, -0.3152F, -0.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.0796F, -1.7162F, -8.0159F, -0.2432F, -0.0926F, 0.0389F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(55, 78).mirror().addBox(-0.4957F, -0.3559F, -0.4598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.0796F, -1.7162F, -8.0159F, -0.4177F, -0.0926F, 0.0389F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(80, 79).mirror().addBox(-0.4957F, -0.3312F, -0.8768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.0796F, -1.7162F, -8.0159F, -0.5574F, -0.0926F, 0.0389F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(33, 68).mirror().addBox(-0.5033F, -0.369F, 0.1145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.0796F, -1.7162F, -8.0159F, -0.3346F, -0.0964F, 0.0345F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(30, 60).mirror().addBox(0.046F, -0.0851F, -3.5885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3568F, -0.1794F, -2.1322F, -0.3403F, -0.1833F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(19, 68).mirror().addBox(0.1813F, -0.6041F, -4.5065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3568F, -0.1794F, -2.1322F, -0.2119F, -0.126F, 0.0317F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-0.122F, -0.8392F, -3.111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3568F, -0.1794F, -2.1322F, -0.1378F, -0.248F, 0.0404F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(67, 20).mirror().addBox(-0.115F, -0.9894F, -1.5637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3568F, -0.1794F, -2.1322F, -0.001F, -0.253F, 0.0056F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(37, 60).mirror().addBox(-0.5951F, -0.1715F, -2.2936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9946F, -0.0225F, -1.7253F, -0.3177F, -0.2838F, 0.029F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(65, 46).mirror().addBox(-0.5475F, -0.8468F, -0.7252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9946F, -0.0225F, -1.7253F, -0.4479F, -0.1874F, 0.0166F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(5, 78).addBox(-0.4613F, 0.6583F, -1.1686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0054F, -0.0225F, -1.7253F, 2.0252F, 0.1835F, -0.0295F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(72, 46).addBox(-0.4613F, -1.2596F, -0.3006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0054F, -0.0225F, -1.7253F, -1.592F, 0.1835F, -0.0295F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 53).addBox(-0.4967F, -0.5258F, -0.9408F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.265F)), PartPose.offsetAndRotation(-0.9204F, -1.7162F, -8.0159F, -0.2386F, 0.0964F, -0.0345F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(76, 42).addBox(-0.5043F, -0.4342F, -1.093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.9204F, -1.7162F, -8.0159F, -0.4439F, 0.0926F, -0.0389F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(70, 79).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F))
				.texOffs(65, 79).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)), PartPose.offsetAndRotation(-1.0176F, -2.11F, -8.8497F, -0.7494F, 0.0F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5043F, -0.3152F, -0.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.9204F, -1.7162F, -8.0159F, -0.2432F, 0.0926F, -0.0389F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(55, 78).addBox(-0.5043F, -0.3559F, -0.4598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.9204F, -1.7162F, -8.0159F, -0.4177F, 0.0926F, -0.0389F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(80, 79).addBox(-0.5043F, -0.3312F, -0.8768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.9204F, -1.7162F, -8.0159F, -0.5574F, 0.0926F, -0.0389F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(33, 68).addBox(-0.4967F, -0.369F, 0.1145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.9204F, -1.7162F, -8.0159F, -0.3346F, 0.0964F, -0.0345F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(30, 60).addBox(-1.046F, -0.0851F, -3.5885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3568F, -0.1794F, -2.1322F, -0.3403F, 0.1833F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(19, 68).addBox(-1.1813F, -0.6041F, -4.5065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3568F, -0.1794F, -2.1322F, -0.2119F, 0.126F, -0.0317F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(67, 28).addBox(-0.878F, -0.8392F, -3.111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3568F, -0.1794F, -2.1322F, -0.1378F, 0.248F, -0.0404F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(67, 20).addBox(-0.885F, -0.9894F, -1.5637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3568F, -0.1794F, -2.1322F, -0.001F, 0.253F, -0.0056F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(37, 60).addBox(-0.4049F, -0.1715F, -2.2936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0054F, -0.0225F, -1.7253F, -0.3177F, 0.2838F, -0.029F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(65, 46).addBox(-0.4525F, -0.8468F, -0.7252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0054F, -0.0225F, -1.7253F, -0.4479F, 0.1874F, -0.0166F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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