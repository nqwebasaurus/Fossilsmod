package fossils.fossils.client.blockentity.model.pantheratigris;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PantheratigrisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart sternum;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftThumb;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightThumb;
	private final ModelPart rightArm4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftCanine2;
	private final ModelPart rightCanine2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart leftCanine3;
	private final ModelPart rightCanine3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public PantheratigrisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm5 = this.leftLeg3.getChild("leftArm5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm5 = this.rightLeg3.getChild("rightArm5");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.sternum = this.chest.getChild("sternum");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftThumb = this.leftArm3.getChild("leftThumb");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightThumb = this.rightArm3.getChild("rightThumb");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftCanine2 = this.head.getChild("leftCanine2");
		this.rightCanine2 = this.head.getChild("rightCanine2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.leftCanine3 = this.jaw.getChild("leftCanine3");
		this.rightCanine3 = this.jaw.getChild("rightCanine3");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.9075F, 12.1984F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 84).addBox(0.0F, -0.9889F, -0.9992F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.1F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 70).addBox(0.0F, -1.4678F, -0.9129F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -0.8F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 44).addBox(0.0F, -1.376F, -0.8558F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -2.6F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 61).mirror().addBox(-0.3109F, -0.5F, -1.1151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.439F, 3.6068F, 2.8171F, -2.2314F, 0.3997F, -1.5478F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.3037F, -0.9832F, 0.0033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8812F, -0.9396F, -1.1793F, -0.6643F, -0.1018F, -0.0812F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.5F, -0.1F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(80, 0).mirror().addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8812F, -2.2396F, -0.2793F, -1.5719F, -0.1018F, -0.0812F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(69, 57).mirror().addBox(-1.1926F, -0.0074F, -0.4005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1048F, -0.7741F, 0.2724F, -0.3779F, -0.1626F, -0.2665F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(71, 37).mirror().addBox(-0.5418F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 35).mirror().addBox(-1.0763F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.173F, -2.311F, -2.9097F, -0.4016F, -0.3726F, -0.1773F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(49, 79).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8812F, -2.2396F, -0.2793F, -0.9086F, -0.1018F, -0.0812F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(55, 56).mirror().addBox(-0.2833F, -1.3729F, -2.476F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.003F, 0.6684F, 1.0855F, -0.7603F, -0.1018F, -0.0812F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 39).mirror().addBox(-0.6317F, -0.1395F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.003F, 0.6684F, 1.0855F, -1.0946F, -0.1663F, 0.1795F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-0.6317F, -0.8197F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.003F, 0.6684F, 1.0855F, -1.3477F, -0.1663F, 0.1795F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(57, 44).mirror().addBox(-0.5F, -1.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6778F, 0.5744F, -0.2729F, -1.4719F, -0.5251F, -0.8337F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.8429F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3471F, 3.0706F, 2.0402F, -1.192F, -0.7259F, -0.7733F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(44, 32).mirror().addBox(-0.5012F, -0.754F, -2.483F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3085F, 2.1499F, 2.4709F, -0.5786F, -0.1238F, -0.0892F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(18, 44).mirror().addBox(-0.7163F, -0.5F, -1.4527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.439F, 3.6068F, 2.8171F, -2.3085F, 0.185F, -1.8124F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(29, 57).mirror().addBox(-0.8429F, -0.4456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3471F, 3.0706F, 2.0402F, -0.651F, -0.7259F, -0.7733F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(57, 40).mirror().addBox(-0.3637F, -0.9155F, -0.0836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3085F, 2.1499F, 2.4709F, -1.2498F, -0.4234F, -0.1876F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(69, 57).addBox(-0.8074F, -0.0074F, -0.4005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1048F, -0.7741F, 0.2724F, -0.3779F, 0.1626F, 0.2665F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(71, 37).addBox(-1.4582F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 35).addBox(-0.9237F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.173F, -2.311F, -2.9097F, -0.4016F, 0.3726F, 0.1773F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(5, 80).addBox(-0.6964F, -0.9832F, 0.0033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8812F, -0.9396F, -1.1793F, -0.6643F, 0.1018F, 0.0812F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(80, 3).addBox(-0.5F, -0.1F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(80, 0).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8812F, -2.2396F, -0.2793F, -1.5719F, 0.1018F, 0.0812F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(49, 79).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8812F, -2.2396F, -0.2793F, -0.9086F, 0.1018F, 0.0812F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(55, 56).addBox(-0.7166F, -1.3729F, -2.476F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.003F, 0.6684F, 1.0855F, -0.7603F, 0.1018F, 0.0812F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 39).addBox(-0.3683F, -0.1395F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.003F, 0.6684F, 1.0855F, -1.0946F, 0.1663F, -0.1795F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(56, 0).addBox(-0.3683F, -0.8197F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.003F, 0.6684F, 1.0855F, -1.3477F, 0.1663F, -0.1795F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(57, 44).addBox(-0.5F, -1.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6778F, 0.5744F, -0.2729F, -1.4719F, 0.5251F, 0.8337F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(15, 79).addBox(-0.1571F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3471F, 3.0706F, 2.0402F, -1.192F, 0.7259F, 0.7733F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 32).addBox(-0.4988F, -0.754F, -2.483F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3085F, 2.1499F, 2.4709F, -0.5786F, 0.1238F, 0.0892F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(36, 61).addBox(-0.6891F, -0.5F, -1.1151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.439F, 3.6068F, 2.8171F, -2.2314F, -0.3997F, 1.5478F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(18, 44).addBox(-0.2837F, -0.5F, -1.4527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.439F, 3.6068F, 2.8171F, -2.3085F, -0.185F, 1.8124F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(29, 57).addBox(-0.1571F, -0.4456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3471F, 3.0706F, 2.0402F, -0.651F, 0.7259F, 0.7733F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(57, 40).addBox(-0.6363F, -0.9155F, -0.0836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3085F, 2.1499F, 2.4709F, -1.2498F, 0.4234F, 0.1876F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 1.5126F, 2.5223F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 60).addBox(-0.5F, -0.3966F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.1768F, 0.043F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(76, 57).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.0232F, -0.557F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(48, 64).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(59, 74).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -1.1575F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(55, 69).addBox(-0.5F, -2.9664F, -1.0402F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, -0.1575F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(62, 56).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.8721F, -1.8314F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.9404F, -0.9985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(60, 67).addBox(-1.0F, -0.8F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.3641F, 0.0087F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(29, 61).addBox(-1.0F, -0.033F, -0.2653F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.2822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(71, 21).addBox(-0.5F, 1.4697F, -0.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(64, 43).addBox(-0.5F, -0.0303F, 0.0125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(75, 0).addBox(-0.8F, 1.5691F, -0.603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 9.2449F, -0.6572F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(19, 65).addBox(-1.3F, -0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(64, 60).addBox(-1.3F, -0.7F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(33, 65).addBox(-1.3F, -0.0429F, -0.9784F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1255F, -0.4999F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(26, 65).addBox(-1.3F, 0.0072F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4745F, 0.3001F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(31, 38).addBox(-0.5F, -7.8112F, -0.7657F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(52, 47).addBox(-0.5F, -0.1222F, -0.2453F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(64, 80).addBox(-1.4F, 0.1303F, 0.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0528F, -0.2661F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(71, 39).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(48, 20).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 4.5364F, 0.7627F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftArm5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 85).addBox(-1.9F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 85).addBox(-1.1F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 85).addBox(-0.3F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 85).addBox(0.5F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.7637F, -2.192F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftArm5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(41, 43).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 1.5126F, 2.5223F, 0.2833F, -0.1677F, -0.0486F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(10, 77).addBox(-0.5F, -0.3966F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.1768F, 0.043F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(76, 75).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 0.0232F, -0.557F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(60, 64).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -1.1575F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -2.9664F, -1.0402F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, -0.1575F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(63, 0).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.8721F, -1.8314F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(9, 49).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.9404F, -0.9985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(68, 4).addBox(-1.0F, -0.8F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.3641F, 0.0087F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(62, 18).addBox(-1.0F, -0.033F, -0.2653F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.2822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(30, 71).addBox(-0.5F, 1.4697F, -0.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(55, 64).addBox(-0.5F, -0.0303F, 0.0125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(75, 4).addBox(-0.2F, 1.5691F, -0.603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 9.2449F, -0.6572F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(48, 67).addBox(-0.7F, -0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(66, 26).addBox(-0.7F, -0.7F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(67, 29).addBox(-0.7F, -0.0429F, -0.9784F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1255F, -0.4999F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 51).addBox(-0.7F, 0.0072F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4745F, 0.3001F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(36, 38).addBox(-0.5F, -7.8112F, -0.7657F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.1222F, -0.2453F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(81, 10).addBox(0.4F, 0.1303F, 0.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0528F, -0.2661F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(73, 48).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(27, 48).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 4.5364F, 0.7627F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightArm5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(86, 18).addBox(1.9F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 15).addBox(1.1F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 12).addBox(0.3F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 9).addBox(-0.5F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.7637F, -2.192F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightArm5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(9, 44).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(8, 83).addBox(0.0F, -1.4846F, -1.0452F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6985F, -0.7047F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(62, 83).addBox(0.0F, -1.3545F, -1.0037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0985F, -2.6047F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 74).mirror().addBox(-1.7472F, -0.3231F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3619F, 0.08F, -1.3798F, -0.2066F, -0.2489F, -0.2514F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(-0.6072F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, 0.08F, -3.3798F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(52, 74).addBox(-0.2528F, -0.3231F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3619F, 0.08F, -1.3798F, -0.2066F, 0.2489F, 0.2514F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(73, 52).addBox(-1.3928F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, 0.08F, -3.3798F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(24, 32).addBox(-0.5F, -0.1512F, 9.7474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1675F, -13.1658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8028F, -3.6452F, -0.289F, 0.0837F, -0.0248F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(12, 75).mirror().addBox(-6.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0949F, -13.4528F, -0.4543F, 0.1952F, -1.3099F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0949F, -13.4528F, -0.3487F, 0.3541F, -0.9263F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(65, 73).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0949F, -13.4528F, -0.2443F, 0.4311F, -0.6552F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8949F, -11.4528F, -0.229F, 0.4417F, -0.6487F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(62, 11).mirror().addBox(-5.2438F, -0.807F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8949F, -11.4528F, -0.3374F, 0.3681F, -0.9223F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-6.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8949F, -11.4528F, -0.4496F, 0.2121F, -1.309F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, -3.4602F, -0.1969F, 0.4641F, -0.8235F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(55, 54).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, -3.4602F, -0.3141F, 0.3974F, -1.1024F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(57, 26).mirror().addBox(-6.4429F, -1.7043F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, -3.4602F, -0.4406F, 0.2475F, -1.4958F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2703F, -1.4602F, -0.0995F, 0.5518F, -0.7761F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(55, 22).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2703F, -1.4602F, -0.2512F, 0.5057F, -1.0749F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(69, 46).mirror().addBox(-5.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2703F, -1.4602F, -0.4308F, 0.3693F, -1.4928F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(64, 54).mirror().addBox(-0.8222F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -5.5602F, -0.2331F, 0.4473F, -0.7353F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(59, 9).mirror().addBox(-3.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -5.5602F, -0.3429F, 0.3725F, -1.0091F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(49, 5).mirror().addBox(-7.2581F, -1.8721F, -0.3159F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -5.5602F, -0.4562F, 0.2143F, -1.3952F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(19, 63).mirror().addBox(-7.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2949F, -9.4528F, -0.4588F, 0.1784F, -1.3108F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(60, 34).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2949F, -9.4528F, -0.3598F, 0.3401F, -0.9301F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(74, 29).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2949F, -9.4528F, -0.2595F, 0.4204F, -0.6615F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(57, 28).mirror().addBox(-7.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.4894F, 0.1322F, -1.3148F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(55, 24).mirror().addBox(-5.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.4073F, 0.3083F, -0.9444F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-2.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.316F, 0.4015F, -0.6833F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(50, 58).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4703F, -3.4602F, -0.1969F, -0.4641F, 0.8235F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(55, 54).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4703F, -3.4602F, -0.3141F, -0.3974F, 1.1024F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(57, 26).addBox(3.4429F, -1.7043F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4703F, -3.4602F, -0.4406F, -0.2475F, 1.4958F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(29, 55).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2703F, -1.4602F, -0.0995F, -0.5518F, 0.7761F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(55, 22).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2703F, -1.4602F, -0.2512F, -0.5057F, 1.0749F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(69, 46).addBox(3.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2703F, -1.4602F, -0.4308F, -0.3693F, 1.4928F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(64, 54).addBox(-0.1778F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -5.5602F, -0.2331F, -0.4473F, 0.7353F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(59, 9).addBox(0.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -5.5602F, -0.3429F, -0.3725F, 1.0091F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(49, 5).addBox(3.2581F, -1.8721F, -0.3159F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -5.5602F, -0.4562F, -0.2143F, 1.3952F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(65, 73).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0949F, -13.4528F, -0.2443F, -0.4311F, 0.6552F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 52).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0949F, -13.4528F, -0.3487F, -0.3541F, 0.9263F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(12, 75).addBox(4.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0949F, -13.4528F, -0.4543F, -0.1952F, 1.3099F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(75, 8).addBox(4.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8949F, -11.4528F, -0.4496F, -0.2121F, 1.309F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(62, 11).addBox(2.2438F, -0.807F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8949F, -11.4528F, -0.3374F, -0.3681F, 0.9223F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(45, 74).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8949F, -11.4528F, -0.229F, -0.4417F, 0.6487F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(19, 63).addBox(4.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2949F, -9.4528F, -0.4588F, -0.1784F, 1.3108F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(60, 34).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2949F, -9.4528F, -0.3598F, -0.3401F, 0.9301F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(74, 29).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2949F, -9.4528F, -0.2595F, -0.4204F, 0.6615F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(57, 28).addBox(4.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.4894F, -0.1322F, 1.3148F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 24).addBox(2.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.4073F, -0.3083F, 0.9444F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(5, 74).addBox(0.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.316F, -0.4015F, 0.6833F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(50, 82).addBox(0.0F, -1.4205F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -2.1528F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(5, 83).addBox(0.0F, -1.1594F, -0.0811F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -3.9528F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(20, 83).addBox(0.0F, -0.9938F, -0.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0051F, -5.8528F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(61, 78).addBox(0.0F, -2.2205F, -0.0062F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8949F, -9.9528F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(10, 64).addBox(0.0F, -2.4802F, -0.3054F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3949F, -11.6528F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(11, 83).addBox(0.0F, -1.3048F, 0.0129F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0949F, -7.8528F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(65, 83).addBox(-0.001F, -2.1058F, 0.0285F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9949F, -13.7528F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(17, 85).addBox(0.0F, -0.9007F, -0.0552F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7949F, -13.7528F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3759F, -7.9807F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4949F, -5.9528F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(15, 10).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.5909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.203F, -13.7595F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(80, 84).addBox(-1.0F, -0.8037F, -0.074F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4888F, -1.7421F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(18, 39).addBox(-1.001F, -2.7907F, -0.2241F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4112F, -1.7421F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(53, 84).addBox(-0.001F, -3.2727F, -0.2609F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4094F, -3.6777F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(86, 21).addBox(0.0F, -1.2891F, 0.0563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4094F, -3.6777F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(41, 52).mirror().addBox(-0.7949F, -5.4061F, -2.7621F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, -0.7729F, -0.3562F, 0.3868F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(50, 42).mirror().addBox(-0.5741F, -4.1554F, 2.571F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, 0.8751F, -0.4568F, 0.3428F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.4413F, -1.1871F, -0.7393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, 0.9809F, -0.4666F, 0.2893F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-4.4834F, -1.8123F, -0.3655F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.9888F, -3.2421F, -0.4385F, 0.3806F, -1.3535F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(24, 75).mirror().addBox(-1.9184F, 0.179F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.9888F, -3.2421F, -0.0972F, 0.565F, -0.6327F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(64, 75).mirror().addBox(-3.8993F, -0.3237F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.9888F, -3.2421F, -0.2535F, 0.5189F, -0.9339F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(21, 18).mirror().addBox(-5.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0888F, -1.5421F, -0.4287F, 0.3513F, -1.3001F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(55, 16).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0888F, -1.5421F, -0.2574F, 0.4885F, -0.886F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(41, 13).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0888F, -1.5421F, -0.1116F, 0.5369F, -0.5904F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(56, 78).mirror().addBox(-0.4413F, -0.5993F, -0.0994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, 1.5669F, -0.4642F, 0.3102F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(48, 13).mirror().addBox(-0.6585F, -4.6849F, -2.1351F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, -0.6361F, -0.4451F, 0.3737F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(34, 52).mirror().addBox(-0.7949F, -6.0047F, -1.0462F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, -0.1445F, -0.3562F, 0.3868F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(35, 32).mirror().addBox(-0.5741F, -2.5231F, 1.1976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, 1.3463F, -0.4568F, 0.3428F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(50, 37).mirror().addBox(-0.3911F, -0.579F, 0.7882F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, 2.2953F, -0.4662F, 0.2492F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-1.0815F, -0.6096F, 0.4435F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, 1.4646F, -0.0033F, 0.3591F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(78, 48).mirror().addBox(-0.4413F, -0.9718F, 0.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, 2.9582F, -2.6586F, 1.8535F, -0.4666F, 0.2893F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(50, 7).mirror().addBox(-3.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4559F, 6.1056F, 0.6275F, 0.3026F, 0.2571F, 0.5248F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(62, 13).mirror().addBox(-2.7F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4839F, 5.2331F, -1.1674F, 0.2683F, 0.178F, 0.3891F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(24, 75).addBox(-0.0816F, 0.179F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9888F, -3.2421F, -0.0972F, -0.565F, 0.6327F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(64, 75).addBox(1.8993F, -0.3237F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9888F, -3.2421F, -0.2535F, -0.5189F, 0.9339F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(83, 25).addBox(3.4834F, -1.8123F, -0.3655F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9888F, -3.2421F, -0.4385F, -0.3806F, 1.3535F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(21, 18).addBox(4.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0888F, -1.5421F, -0.4287F, -0.3513F, 1.3001F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(55, 16).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0888F, -1.5421F, -0.2574F, -0.4885F, 0.886F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(41, 13).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0888F, -1.5421F, -0.1116F, -0.5369F, 0.5904F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(56, 78).addBox(-0.5587F, -0.5993F, -0.0994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, 1.5669F, 0.4642F, -0.3102F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(48, 13).addBox(-0.3415F, -4.6849F, -2.1351F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, -0.6361F, 0.4451F, -0.3737F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(41, 52).addBox(-0.2051F, -5.4061F, -2.7621F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, -0.7729F, 0.3562F, -0.3868F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(34, 52).addBox(-0.2051F, -6.0047F, -1.0462F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, -0.1445F, 0.3562F, -0.3868F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(50, 42).addBox(-0.4259F, -4.1554F, 2.571F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, 0.8751F, 0.4568F, -0.3428F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(35, 32).addBox(-0.4259F, -2.5231F, 1.1976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, 1.3463F, 0.4568F, -0.3428F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(50, 37).addBox(-0.6089F, -0.579F, 0.7882F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, 2.2953F, 0.4662F, -0.2492F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 27).addBox(0.0815F, -0.6096F, 0.4435F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, 1.4646F, 0.0033F, -0.3591F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5587F, -1.1871F, -0.7393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, 0.9809F, 0.4666F, -0.2893F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(78, 48).addBox(-0.5587F, -0.9718F, 0.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0528F, 2.9582F, -2.6586F, 1.8535F, 0.4666F, -0.2893F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(50, 7).addBox(-0.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4559F, 6.1056F, 0.6275F, 0.3026F, -0.2571F, -0.5248F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(62, 13).addBox(-0.3F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4839F, 5.2331F, -1.1674F, 0.2683F, -0.178F, -0.3891F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5F, -1.0692F, -2.9582F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 6.7581F, 0.8051F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -1.9785F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.0094F, -9.5777F, 0.3403F, 0.0F, 0.0F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offset(0.1359F, 6.2734F, 0.9649F));

		PartDefinition cube_r178 = sternum.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-8.6645F, -0.2138F, 0.029F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8717F, -1.0F, 9.1F, 0.7111F, 0.5812F, 1.2876F));

		PartDefinition cube_r179 = sternum.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-6.2645F, -0.2138F, 0.029F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8717F, -1.0F, 9.1F, 0.6352F, 0.5182F, 1.1504F));

		PartDefinition cube_r180 = sternum.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(32, 2).mirror().addBox(-4.5645F, -0.2138F, -0.371F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8717F, -1.0F, 9.1F, 0.4394F, 0.3714F, 0.8698F));

		PartDefinition cube_r181 = sternum.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-4.9125F, -0.1357F, -0.5174F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8717F, -0.7F, 7.3F, 0.3565F, 0.2873F, 0.6529F));

		PartDefinition cube_r182 = sternum.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(30, 15).mirror().addBox(-5.095F, -0.0176F, -0.1285F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8717F, -0.2F, 4.9F, 0.3542F, 0.3812F, 0.6504F));

		PartDefinition cube_r183 = sternum.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(32, 4).mirror().addBox(-4.7F, -0.1F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8717F, 0.0F, 3.3F, 0.3671F, 0.3689F, 0.6855F));

		PartDefinition cube_r184 = sternum.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-4.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4673F, 0.0038F, 1.3162F, 0.3075F, 0.3952F, 0.5222F));

		PartDefinition cube_r185 = sternum.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 18).addBox(-0.3355F, -0.2138F, 0.029F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.0F, 9.1F, 0.7111F, -0.5812F, -1.2876F));

		PartDefinition cube_r186 = sternum.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(19, 7).addBox(-0.7355F, -0.2138F, 0.029F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.0F, 9.1F, 0.6352F, -0.5182F, -1.1504F));

		PartDefinition cube_r187 = sternum.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(32, 2).addBox(-0.4355F, -0.2138F, -0.371F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.0F, 9.1F, 0.4394F, -0.3714F, -0.8698F));

		PartDefinition cube_r188 = sternum.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0875F, -0.1357F, -0.5174F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.7F, 7.3F, 0.3565F, -0.2873F, -0.6529F));

		PartDefinition cube_r189 = sternum.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(30, 15).addBox(-0.905F, -0.0176F, -0.1285F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2F, 4.9F, 0.3542F, -0.3812F, -0.6504F));

		PartDefinition cube_r190 = sternum.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, -1.0606F, -0.0221F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.6718F, 4.8464F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r191 = sternum.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(32, 4).addBox(-0.3F, -0.1F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0F, 3.3F, 0.3671F, -0.3689F, -0.6855F));

		PartDefinition cube_r192 = sternum.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(36, 6).addBox(-0.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1956F, 0.0038F, 1.3162F, 0.3075F, -0.3952F, -0.5222F));

		PartDefinition cube_r193 = sternum.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(26, 18).addBox(-0.5F, -0.7921F, -3.8146F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.3718F, 3.6464F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 3.7137F, -3.1594F, -0.0212F, 0.1643F, -0.2594F));

		PartDefinition cube_r194 = leftarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(69, 43).addBox(-1.0F, 1.8F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(69, 18).addBox(-1.0F, 1.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8609F, 1.9677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(39, 27).addBox(-0.5F, -0.5F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.2961F, -0.5244F, -0.3404F, 0.0014F, -0.001F));

		PartDefinition cube_r196 = leftarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(64, 77).addBox(-0.0047F, -0.0439F, -0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.9673F, 0.1378F, 0.445F, 0.0015F, -0.0008F));

		PartDefinition cube_r197 = leftarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(20, 71).addBox(-0.0047F, -2.0439F, -0.0015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 4.9673F, 0.1378F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(5, 70).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0097F, 1.3297F, -0.9047F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(36, 75).addBox(-0.5F, -2.0538F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5668F, 1.5408F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(5, 76).addBox(-0.5F, -1.9926F, -0.8121F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7969F, 2.0023F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(19, 75).addBox(0.0F, -0.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.1885F, 0.4014F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(82, 63).addBox(0.0F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.8623F, 1.7487F, -1.7491F, -0.7033F, 0.724F));

		PartDefinition cube_r203 = leftarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(69, 79).addBox(-0.2F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -0.11F, 1.0564F, 1.5708F, 0.1222F, -1.5708F));

		PartDefinition cube_r204 = leftarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(76, 31).addBox(-0.9378F, -0.8741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -1.9461F, 0.8201F, 1.5708F, -0.5149F, -1.5708F));

		PartDefinition cube_r205 = leftarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(76, 22).addBox(0.559F, -1.1779F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.2461F, 0.8201F, 1.5708F, -0.0611F, -1.5708F));

		PartDefinition cube_r206 = leftarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(71, 10).addBox(-0.9598F, 0.0375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, -1.9702F, 1.0549F, -1.5708F, -1.3788F, 1.5708F));

		PartDefinition cube_r207 = leftarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 64).addBox(-0.0335F, 0.0378F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, 3.7584F, 0.2624F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition cube_r208 = leftarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(5, 53).addBox(-0.2399F, -0.1491F, -0.1413F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 2.6954F, -0.4664F, 1.5708F, -1.3614F, -1.6232F));

		PartDefinition cube_r209 = leftarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(67, 68).addBox(-0.6346F, -0.1413F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.1764F, -0.0046F, -0.4664F, 1.5708F, -1.4312F, -1.6232F));

		PartDefinition cube_r210 = leftarm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(43, 62).addBox(-0.0335F, -0.1622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, -0.0046F, -0.2664F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 7.3379F, 1.3658F, 0.2955F, -0.5902F, -0.1678F));

		PartDefinition cube_r211 = leftArm3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(53, 31).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftThumb = leftArm3.addOrReplaceChild("leftThumb", CubeListBuilder.create().texOffs(72, 71).addBox(-0.4F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2383F, 2.1254F, -0.2606F, -0.1021F, 0.2158F, 1.0023F));

		PartDefinition cube_r212 = leftThumb.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(85, 3).addBox(0.0F, -0.5F, -1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.5F, 0.1F, -0.6632F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 3.0605F, 0.0949F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftArm4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(32, 85).addBox(-1.9F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 85).addBox(-1.1F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 85).addBox(-0.3F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 85).addBox(0.5F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.7637F, -2.192F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftArm4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(39, 17).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 3.7137F, -3.1594F, 0.6258F, -0.6203F, 0.1553F));

		PartDefinition cube_r215 = rightarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(69, 54).addBox(-1.0F, 1.8F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(69, 32).addBox(-1.0F, 1.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8609F, 1.9677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightarm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 44).addBox(-1.5F, -0.5F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5118F, -0.2961F, -0.5244F, -0.3404F, -0.0014F, 0.001F));

		PartDefinition cube_r217 = rightarm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(77, 66).addBox(-0.9953F, -0.0439F, -0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.9673F, 0.1378F, 0.445F, -0.0015F, 0.0008F));

		PartDefinition cube_r218 = rightarm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(25, 71).addBox(-0.9953F, -2.0439F, -0.0015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 4.9673F, 0.1378F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r219 = rightarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(47, 70).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0097F, 1.3297F, -0.9047F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r220 = rightarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(71, 75).addBox(-0.5F, -2.0538F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5668F, 1.5408F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(76, 10).addBox(-0.5F, -1.9926F, -0.8121F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7969F, 2.0023F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(31, 75).addBox(-1.0F, -0.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.1885F, 0.4014F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(82, 66).addBox(-1.0F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.8623F, 1.7487F, -1.8689F, 0.5608F, -0.3741F));

		PartDefinition cube_r224 = rightarm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(10, 80).addBox(-0.8F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, -0.11F, 1.0564F, 1.5708F, -0.1222F, 1.5708F));

		PartDefinition cube_r225 = rightarm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(41, 76).addBox(-0.0622F, -0.8741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -1.9461F, 0.8201F, 1.5708F, 0.5149F, 1.5708F));

		PartDefinition cube_r226 = rightarm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(76, 39).addBox(-1.559F, -1.1779F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -0.2461F, 0.8201F, 1.5708F, 0.0611F, 1.5708F));

		PartDefinition cube_r227 = rightarm2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(71, 14).addBox(-0.0402F, 0.0375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.136F, -1.9702F, 1.0549F, -1.5708F, 1.3788F, -1.5708F));

		PartDefinition cube_r228 = rightarm2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(5, 64).addBox(-0.9665F, 0.0378F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3236F, 3.7584F, 0.2624F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition cube_r229 = rightarm2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(10, 53).addBox(-0.7601F, -0.1491F, -0.1413F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, 2.6954F, -0.4664F, 1.5708F, 1.3614F, 1.6232F));

		PartDefinition cube_r230 = rightarm2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(10, 69).addBox(-0.3654F, -0.1413F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1764F, -0.0046F, -0.4664F, 1.5708F, 1.4312F, 1.6232F));

		PartDefinition cube_r231 = rightarm2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(14, 63).addBox(-0.9665F, -0.1622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, -0.0046F, -0.2664F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 7.3379F, 1.3658F, 0.1403F, 1.0746F, 0.4786F));

		PartDefinition cube_r232 = rightArm3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(15, 54).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightThumb = rightArm3.addOrReplaceChild("rightThumb", CubeListBuilder.create().texOffs(73, 25).addBox(-0.6F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2383F, 2.1254F, -0.2606F, -0.0924F, -0.22F, -1.0467F));

		PartDefinition cube_r233 = rightThumb.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(14, 85).addBox(0.0F, -0.5F, -1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.5F, 0.1F, -0.6632F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 3.0605F, 0.0949F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightArm4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(71, 85).addBox(1.9F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 85).addBox(1.1F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 50).addBox(0.3F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 85).addBox(-0.5F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.7637F, -2.192F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightArm4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(39, 22).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3783F, -3.4491F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r236 = neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(59, 83).addBox(0.0F, -1.5076F, -0.8952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7639F, -1.0128F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r237 = neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(61, 4).addBox(-0.5F, -0.2F, 3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9639F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3943F, -1.9248F, 0.4637F, 0.2749F, 0.1349F));

		PartDefinition cube_r238 = neck.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(84, 81).addBox(0.0F, -1.0423F, -1.0693F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4695F, -0.6993F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(67, 63).addBox(0.0F, -0.001F, -0.9564F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1762F, -3.6944F, -0.0387F, -0.0201F, 0.0F));

		PartDefinition cube_r240 = neck.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(0.0F, -0.001F, 0.0436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1762F, -3.6944F, -0.0387F, 0.0201F, 0.4796F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(83, 46).addBox(0.0F, -0.001F, 0.0436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1762F, -3.6944F, -0.0387F, -0.0201F, -0.4796F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -1.1F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -0.5932F, -1.956F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offset(0.0F, -0.6493F, -4.7036F));

		PartDefinition cube_r243 = neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(50, 9).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0932F, -0.456F, -0.733F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.081F, -1.0864F, -0.3981F, 0.1611F, -0.0674F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(57, 60).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3815F, 0.8877F, -1.2582F, 0.5877F, 0.0633F, 0.0942F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(22, 59).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3815F, 0.8877F, -1.2582F, 0.5877F, -0.0633F, -0.0942F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(40, 71).addBox(-0.5F, -0.0263F, -0.0506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5913F, -3.8049F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(43, 48).addBox(-1.0F, -0.9981F, -0.0436F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.1037F, -2.8654F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(19, 68).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.1037F, -3.3654F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(41, 8).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4975F, -3.1001F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(81, 54).addBox(-0.6F, -0.9745F, -0.9079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9685F, -2.4303F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(81, 57).addBox(-0.6F, -0.9734F, -0.0284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9685F, -1.0303F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(43, 58).addBox(-0.6F, 0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.6685F, -2.6303F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(81, 60).addBox(-1.0F, -0.1966F, -0.7773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.3546F, -5.8414F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(33, 68).addBox(-1.5F, -0.046F, -1.4325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(26, 68).addBox(-1.5F, -0.046F, -1.0325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9546F, -5.4414F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(60, 30).addBox(-1.5F, -0.0112F, -0.0467F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.1546F, -4.5414F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(7, 60).addBox(-1.5F, -0.0282F, -0.0172F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 2.0546F, -5.0414F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(57, 48).addBox(-1.5F, -0.0221F, -0.7937F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 2.2546F, -5.1414F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(68, 7).addBox(-1.5F, -0.0472F, -0.0427F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.6198F, -3.8933F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(78, 34).addBox(-1.0F, -1.2252F, 0.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(57, 36).addBox(-1.0F, -0.8252F, -0.1456F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 6.0477F, -4.7385F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(40, 68).addBox(-1.0F, -0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5543F, -4.6838F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(34, 48).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.1768F, -4.2175F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(48, 52).addBox(-1.4F, -1.4604F, -0.4896F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 6.7816F, -4.2445F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(64, 40).addBox(-1.0F, -0.4F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.851F, -5.0668F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(64, 15).addBox(-1.9F, -0.1475F, -0.7615F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 5.2816F, -4.8445F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(64, 48).addBox(-1.9F, -1.6726F, -0.21F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 6.2816F, -5.2445F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 85).addBox(0.002F, -0.1244F, -0.9364F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 43).addBox(-0.5F, -0.1244F, -0.8364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.002F, -2.1732F, -1.0011F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(50, 60).addBox(-0.5F, -0.9171F, -1.8788F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.002F, -1.539F, -0.5032F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(83, 84).addBox(0.995F, -1.0198F, -0.5545F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 81).addBox(0.498F, -0.9198F, -0.4545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -1.0171F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 0).addBox(1.0F, -0.1212F, -0.7527F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 13).addBox(0.498F, -0.1212F, -0.2527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -2.0171F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(18, 49).addBox(0.498F, -0.1095F, -1.9242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -2.0F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(15, 71).addBox(0.498F, -0.0843F, -0.9381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -0.5F, -2.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(77, 63).addBox(-1.9F, 0.6895F, 0.231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(24, 77).addBox(-0.1F, 0.6895F, 0.231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -0.8F, -0.7F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.641F, 5.8486F, -4.6207F, 0.0595F, -0.093F, -0.2528F));

		PartDefinition cube_r273 = leftCanine.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(78, 25).addBox(-0.5281F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0271F, 0.7726F, 0.6671F, 0.7553F, 0.1258F, 0.1264F));

		PartDefinition cube_r274 = leftCanine.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(77, 69).addBox(1.0143F, 2.5061F, -7.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(51, 76).addBox(1.0143F, 2.1061F, -7.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1855F, -5.2565F, 5.7651F, 0.4311F, 0.1853F, 0.0618F));

		PartDefinition cube_r275 = leftCanine.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(81, 40).addBox(-0.5F, -0.6F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0005F, 0.7128F, 0.5055F, 0.9896F, 0.1853F, 0.0618F));

		PartDefinition cube_r276 = leftCanine.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(81, 37).addBox(-0.5F, -0.5249F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0328F, 0.4479F, 0.2413F, 0.7453F, 0.1853F, 0.0618F));

		PartDefinition cube_r277 = leftCanine.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(20, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0543F, 0.1171F, 0.0174F, 0.6057F, 0.1853F, 0.0618F));

		PartDefinition cube_r278 = leftCanine.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(30, 82).addBox(-0.5273F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(25, 82).addBox(-0.5273F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(15, 82).addBox(-0.5273F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0228F, 0.67F, 0.6103F, 0.9828F, 0.055F, 0.1502F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.641F, 5.8486F, -4.6207F, 0.0595F, 0.093F, 0.2528F));

		PartDefinition cube_r279 = rightCanine.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(-0.4719F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0271F, 0.7726F, 0.6671F, 0.7553F, -0.1258F, -0.1264F));

		PartDefinition cube_r280 = rightCanine.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(77, 69).mirror().addBox(-2.0143F, 2.5061F, -7.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 76).mirror().addBox(-2.0143F, 2.1061F, -7.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1855F, -5.2565F, 5.7651F, 0.4311F, -0.1853F, -0.0618F));

		PartDefinition cube_r281 = rightCanine.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(81, 40).mirror().addBox(-0.5F, -0.6F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0005F, 0.7128F, 0.5055F, 0.9896F, -0.1853F, -0.0618F));

		PartDefinition cube_r282 = rightCanine.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(-0.5F, -0.5249F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0328F, 0.4479F, 0.2413F, 0.7453F, -0.1853F, -0.0618F));

		PartDefinition cube_r283 = rightCanine.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0543F, 0.1171F, 0.0174F, 0.6057F, -0.1853F, -0.0618F));

		PartDefinition cube_r284 = rightCanine.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-0.4727F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(25, 82).mirror().addBox(-0.4727F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(15, 82).mirror().addBox(-0.4727F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.0228F, 0.67F, 0.6103F, 0.9828F, -0.055F, -0.1502F));

		PartDefinition leftCanine2 = head.addOrReplaceChild("leftCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5976F, 5.8418F, -5.1098F, -0.3797F, -0.1647F, -0.1461F));

		PartDefinition cube_r285 = leftCanine2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(81, 16).addBox(-0.6273F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0417F, 0.3923F, 0.1949F, 0.9828F, 0.055F, 0.1502F));

		PartDefinition cube_r286 = leftCanine2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(35, 82).addBox(-0.6273F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0228F, 0.67F, 0.6103F, 0.9828F, 0.055F, 0.1502F));

		PartDefinition rightCanine2 = head.addOrReplaceChild("rightCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5976F, 5.8418F, -5.1098F, -0.3797F, 0.1647F, 0.1461F));

		PartDefinition cube_r287 = rightCanine2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(81, 16).mirror().addBox(-0.3727F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0417F, 0.3923F, 0.1949F, 0.9828F, -0.055F, -0.1502F));

		PartDefinition cube_r288 = rightCanine2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-0.3727F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.0228F, 0.67F, 0.6103F, 0.9828F, -0.055F, -0.1502F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.4495F, -5.0505F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(81, 19).addBox(-0.4945F, -0.596F, -0.5273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8183F, 0.1121F, 0.4139F, 0.3299F, 0.311F, 0.147F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(40, 82).addBox(-0.2968F, -0.601F, -0.0548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9838F, 0.0854F, 0.5565F, 0.998F, 0.2842F, 0.1946F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(22, 38).addBox(-0.2F, -0.8F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7687F, -5.107F, 3.5916F, 0.5589F, 0.6003F, -0.5374F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(35, 71).addBox(1.2F, -0.6751F, -1.9876F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -1.3266F, 2.4871F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(36, 57).addBox(0.4F, -1.0347F, -1.9488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4F, -1.3266F, 2.4871F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(45, 82).addBox(-0.2F, -1.0032F, 0.1106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8F, -1.3266F, 2.4871F, 2.1293F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.4495F, -5.0505F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(81, 19).mirror().addBox(-0.5056F, -0.596F, -0.5273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8183F, 0.1121F, 0.4139F, 0.3299F, -0.311F, -0.147F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(40, 82).mirror().addBox(-0.7032F, -0.601F, -0.0548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9838F, 0.0854F, 0.5565F, 0.998F, -0.2842F, -0.1946F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(22, 38).mirror().addBox(-0.8F, -0.8F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.7687F, -5.107F, 3.5916F, 0.5589F, -0.6003F, 0.5374F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(-1.2F, -0.6751F, -1.9876F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, -1.3266F, 2.4871F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(36, 57).mirror().addBox(-1.4F, -1.0347F, -1.9488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4F, -1.3266F, 2.4871F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(45, 82).mirror().addBox(-0.8F, -1.0032F, 0.1106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.8F, -1.3266F, 2.4871F, 2.1293F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(1.4F, 1.4328F, 2.0323F));

		PartDefinition cube_r301 = leftOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(76, 78).addBox(1.3775F, 0.0335F, 0.1358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7118F, -0.2571F, -4.4545F, 1.6676F, -1.0926F, -1.1297F));

		PartDefinition cube_r302 = leftOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(55, 12).addBox(-0.5F, -0.3163F, -0.9811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0086F, -0.383F, -2.9067F, 0.3409F, -0.8407F, -0.2018F));

		PartDefinition cube_r303 = leftOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(48, 54).addBox(-0.5F, -0.6845F, -0.9931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0086F, -0.383F, -2.9067F, 0.4805F, -0.8407F, -0.2018F));

		PartDefinition cube_r304 = leftOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(81, 22).addBox(-0.675F, -0.5317F, -1.121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1118F, 0.9429F, -6.1545F, 2.1133F, -0.0768F, 0.4872F));

		PartDefinition cube_r305 = leftOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(15, 59).addBox(-0.675F, 0.3776F, -1.9609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1118F, 0.9429F, -6.1545F, 1.3628F, -0.0768F, 0.4872F));

		PartDefinition cube_r306 = leftOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(64, 36).addBox(-0.7484F, 0.3659F, -0.0149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1118F, 0.9429F, -6.1545F, 0.8268F, 0.0081F, 0.4174F));

		PartDefinition cube_r307 = leftOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(82, 6).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(1.4457F, -0.2952F, -3.5348F, 0.2247F, 0.0081F, 0.4174F));

		PartDefinition cube_r308 = leftOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(79, 81).addBox(-0.7179F, -0.2441F, 1.7972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.1118F, 0.9429F, -6.1545F, 0.5389F, 0.0081F, 0.4174F));

		PartDefinition cube_r309 = leftOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 82).addBox(-0.7179F, -0.6268F, 2.4235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 78).addBox(-0.7179F, -0.6268F, 1.8235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.1118F, 0.9429F, -6.1545F, 0.4167F, 0.0081F, 0.4174F));

		PartDefinition cube_r310 = leftOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(64, 22).addBox(-0.7179F, 0.1553F, 0.048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1118F, 0.9429F, -6.1545F, 0.8181F, 0.0081F, 0.4174F));

		PartDefinition cube_r311 = leftOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(22, 55).addBox(-1.0402F, -0.182F, -2.9559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2934F, 0.6978F, -7.4904F, 2.1103F, -0.322F, 0.1236F));

		PartDefinition cube_r312 = leftOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(41, 38).addBox(-0.9F, -0.1604F, -0.9896F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.3738F, -6.7007F, 1.0251F, 0.0014F, 0.3757F));

		PartDefinition cube_r313 = leftOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(55, 18).addBox(0.0F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6914F, 0.7044F, -6.6895F, 1.353F, 0.4078F, 0.7404F));

		PartDefinition cube_r314 = leftOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(48, 27).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8789F, 0.6617F, -6.6588F, 0.964F, -0.0492F, -0.6659F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-1.4F, 1.4328F, 2.0323F));

		PartDefinition cube_r315 = rightOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(76, 78).mirror().addBox(-2.3775F, 0.0335F, 0.1358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7118F, -0.2571F, -4.4545F, 1.6676F, 1.0926F, 1.1297F));

		PartDefinition cube_r316 = rightOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(-0.5F, -0.3163F, -0.9811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0086F, -0.383F, -2.9067F, 0.3409F, 0.8407F, 0.2018F));

		PartDefinition cube_r317 = rightOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(48, 54).mirror().addBox(-0.5F, -0.6845F, -0.9931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0086F, -0.383F, -2.9067F, 0.4805F, 0.8407F, 0.2018F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(81, 22).mirror().addBox(-0.325F, -0.5317F, -1.121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1118F, 0.9429F, -6.1545F, 2.1133F, 0.0768F, -0.4872F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(15, 59).mirror().addBox(-0.325F, 0.3776F, -1.9609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1118F, 0.9429F, -6.1545F, 1.3628F, 0.0768F, -0.4872F));

		PartDefinition cube_r320 = rightOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(64, 36).mirror().addBox(-0.2516F, 0.3659F, -0.0149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1118F, 0.9429F, -6.1545F, 0.8268F, -0.0081F, -0.4174F));

		PartDefinition cube_r321 = rightOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(82, 6).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-1.4457F, -0.2952F, -3.5348F, 0.2247F, -0.0081F, -0.4174F));

		PartDefinition cube_r322 = rightOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(79, 81).mirror().addBox(-0.2821F, -0.2441F, 1.7972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-1.1118F, 0.9429F, -6.1545F, 0.5389F, -0.0081F, -0.4174F));

		PartDefinition cube_r323 = rightOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.2821F, -0.6268F, 2.4235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(81, 78).mirror().addBox(-0.2821F, -0.6268F, 1.8235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.1118F, 0.9429F, -6.1545F, 0.4167F, -0.0081F, -0.4174F));

		PartDefinition cube_r324 = rightOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(64, 22).mirror().addBox(-0.2821F, 0.1553F, 0.048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1118F, 0.9429F, -6.1545F, 0.8181F, -0.0081F, -0.4174F));

		PartDefinition cube_r325 = rightOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(22, 55).mirror().addBox(0.0402F, -0.182F, -2.9559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2934F, 0.6978F, -7.4904F, 2.1103F, 0.322F, -0.1236F));

		PartDefinition cube_r326 = rightOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(41, 38).mirror().addBox(-0.1F, -0.1604F, -0.9896F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3738F, -6.7007F, 1.0251F, -0.0014F, -0.3757F));

		PartDefinition cube_r327 = rightOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(55, 18).mirror().addBox(-1.0F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6914F, 0.7044F, -6.6895F, 1.353F, -0.4078F, -0.7404F));

		PartDefinition cube_r328 = rightOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(48, 27).mirror().addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8789F, 0.6617F, -6.6588F, 0.964F, 0.0492F, 0.6659F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.2061F, -0.5724F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(45, 15).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.3547F, -7.0224F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(56, 84).mirror().addBox(0.0409F, 0.0087F, 0.0043F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7323F, 0.5962F, -4.47F, -1.0047F, -0.1334F, -0.1129F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-0.6629F, -0.5149F, -1.0327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(70, 0).mirror().addBox(-0.6629F, -2.1149F, -1.0327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.6066F, -4.6574F, -1.3206F, -0.158F, -0.0744F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-1.0F, -1.0215F, -0.0336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(81, 75).addBox(1.4F, -1.0215F, -0.0336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3F, 0.1354F, -2.7694F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(74, 81).mirror().addBox(-0.5F, 0.0326F, 0.018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(74, 81).addBox(1.9F, 0.0326F, 0.018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8F, -0.7246F, -0.8971F, 2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(40, 65).mirror().addBox(0.0F, -0.7F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7323F, 0.8962F, -4.07F, -1.2682F, -0.158F, -0.0744F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(60, 70).mirror().addBox(-1.0F, -0.419F, -0.8786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.5066F, -3.0574F, -1.2242F, -0.1546F, -0.0812F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(46, 76).mirror().addBox(0.0205F, -0.6192F, -0.7624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7092F, 2.0822F, -5.3172F, -1.4624F, -0.408F, -0.0667F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(76, 45).mirror().addBox(-0.0037F, -0.3335F, -0.4733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.7092F, 2.0822F, -5.3172F, -2.0319F, -0.4206F, 0.0208F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(81, 31).addBox(1.9F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.8F, -0.3246F, -1.3971F, -2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(72, 67).mirror().addBox(-1.0F, -0.7804F, -0.0238F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(72, 67).addBox(1.4F, -0.7804F, -0.0238F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.3F, 0.0354F, -2.6694F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(76, 18).mirror().addBox(-0.5F, -1.7F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 18).addBox(1.9F, -1.7F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 1.7168F, -2.6434F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(72, 63).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(72, 63).addBox(1.9F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8F, 1.1808F, -0.3732F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(81, 28).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 59).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(81, 28).addBox(1.9F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 59).addBox(1.9F, -1.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8F, 0.8201F, -1.3467F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(76, 14).addBox(2.1F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-1.9F, 0.1385F, -0.3115F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(82, 69).mirror().addBox(-1.1F, -1.6179F, -0.4076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(82, 69).addBox(1.5F, -1.6179F, -0.4076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3F, -1.2842F, -2.1642F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(69, 82).mirror().addBox(-1.1F, -0.1598F, -0.0967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(69, 82).addBox(1.5F, -0.1598F, -0.0967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3F, -1.8842F, -1.7642F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(82, 72).addBox(1.9F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.8F, -0.532F, -1.8564F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(56, 84).addBox(-0.0409F, 0.0087F, 0.0043F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5323F, 0.5962F, -4.47F, -1.0047F, 0.1334F, 0.1129F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(40, 65).addBox(0.0F, -0.7F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5323F, 0.8962F, -4.07F, -1.2682F, 0.158F, 0.0744F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(60, 70).addBox(0.0F, -0.419F, -0.8786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.5066F, -3.0574F, -1.2242F, 0.1546F, 0.0812F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(46, 76).addBox(-1.0205F, -0.6192F, -0.7624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5092F, 2.0822F, -5.3172F, -1.4624F, 0.408F, 0.0667F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(76, 45).addBox(-0.9963F, -0.3335F, -0.4733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5092F, 2.0822F, -5.3172F, -2.0319F, 0.4206F, -0.0208F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(76, 42).addBox(-0.3372F, -0.5149F, -1.0327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(70, 0).addBox(-0.3372F, -2.1149F, -1.0327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6066F, -4.6574F, -1.3206F, 0.158F, 0.0744F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(29, 79).addBox(-1.0F, -0.0031F, -0.148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.8106F, -5.3257F, -2.3213F, 0.0F, 0.0F));

		PartDefinition leftCanine3 = jaw.addOrReplaceChild("leftCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2113F, 1.536F, -6.3325F, -1.1202F, 0.0554F, -2.6677F));

		PartDefinition cube_r354 = leftCanine3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(77, 72).addBox(-0.1686F, -0.3758F, -0.6791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.275F, 0.1917F, 0.6381F, 0.7397F, 0.1277F, 0.0092F));

		PartDefinition cube_r355 = leftCanine3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(44, 79).addBox(-0.3104F, 0.106F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(39, 79).addBox(-0.3104F, -0.294F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2259F, 0.6846F, 0.3202F, 1.1838F, 0.1255F, 0.0068F));

		PartDefinition cube_r356 = leftCanine3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(34, 79).addBox(-0.2104F, -0.694F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(80, 51).addBox(-0.2104F, -1.094F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2384F, 0.3192F, 0.6756F, 0.8151F, 0.1853F, 0.0618F));

		PartDefinition cube_r357 = leftCanine3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(76, 54).addBox(-0.2053F, -0.9807F, -0.4411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.275F, 0.4917F, 0.5381F, 0.5533F, 0.1853F, 0.0618F));

		PartDefinition rightCanine3 = jaw.addOrReplaceChild("rightCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9887F, 1.536F, -6.3325F, -1.1202F, -0.0554F, 2.6677F));

		PartDefinition cube_r358 = rightCanine3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(-0.8314F, -0.3758F, -0.6791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.275F, 0.1917F, 0.6381F, 0.7397F, -0.1277F, -0.0092F));

		PartDefinition cube_r359 = rightCanine3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(44, 79).mirror().addBox(-0.6896F, 0.106F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(39, 79).mirror().addBox(-0.6896F, -0.294F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.2259F, 0.6846F, 0.3202F, 1.1838F, -0.1255F, -0.0068F));

		PartDefinition cube_r360 = rightCanine3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(34, 79).mirror().addBox(-0.7896F, -0.694F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(80, 51).mirror().addBox(-0.7896F, -1.094F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2384F, 0.3192F, 0.6756F, 0.8151F, -0.1853F, -0.0618F));

		PartDefinition cube_r361 = rightCanine3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(76, 54).mirror().addBox(-0.7947F, -0.9807F, -0.4411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.275F, 0.4917F, 0.5381F, 0.5533F, -0.1853F, -0.0618F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -0.4103F, -0.214F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.6096F, -0.2163F, 0.1487F));

		PartDefinition cube_r362 = tail.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(83, 34).addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4103F, 2.786F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r363 = tail.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(74, 84).addBox(0.0F, -0.8F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3103F, 0.786F, 0.2269F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.635F, -0.1039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, 0.3981F, -0.1611F, -0.0674F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 20).addBox(-0.5F, -0.5145F, -0.0425F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, 0.1865F, -0.4728F, -0.0857F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.4106F, 0.051F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0132F, 4.6957F, 0.2815F, -0.1258F, -0.0363F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(11, 33).addBox(-0.5F, -0.8759F, 0.0368F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.5578F, 4.9631F, 0.4899F, -0.1932F, -0.102F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(30, 9).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.7505F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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