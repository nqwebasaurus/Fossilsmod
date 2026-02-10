package fossils.fossils.client.blockentity.model.olorotitan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OlorotitanFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public OlorotitanFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone5 = this.hips.getChild("bone5");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.heads = this.neck10.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie4 = this.rightArm3.getChild("opposablePinkie4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.5978F, 8.6869F, -0.0937F, -0.0932F, -0.7412F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.5F, 0.0F, -5.5F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 50).addBox(3.5F, 0.0F, -5.5F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.8559F, 4.8185F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(98, 41).mirror().addBox(-2.916F, -0.1946F, 2.4166F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.407F, -5.3935F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1F, 1.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 62).addBox(0.073F, -0.1343F, -0.1726F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(-0.027F, -0.1343F, -0.1726F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.9316F, 4.2419F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(118, 38).addBox(0.094F, 4.0296F, -0.1333F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 78).addBox(-0.006F, 4.0296F, -0.1333F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.5316F, -2.8581F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(98, 41).addBox(-0.084F, -0.1946F, 2.4166F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.407F, -5.3935F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 109).addBox(0.0F, -0.0016F, 0.0398F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.7802F, 10.0398F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(60, 22).addBox(0.0F, -1.0183F, 0.0023F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4802F, -2.7602F, 0.0785F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7829F, -1.8225F, 2.204F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(97, 125).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2557F, 9.8847F, 0.4097F, -0.3659F, -0.1919F, -0.0068F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(120, 120).addBox(-0.3573F, -0.9861F, 3.7501F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3398F, 6.5689F, -5.1693F, -0.5579F, -0.1919F, -0.0068F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(109, 15).addBox(-0.3573F, -0.5041F, 0.1994F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3398F, 6.5689F, -5.1693F, -0.4357F, -0.1919F, -0.0068F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(81, 139).addBox(-1.871F, 2.8793F, -2.3225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7404F, -0.7919F, 2.3193F, 1.4904F, 0.2899F, -0.0768F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(6, 142).addBox(-1.871F, 3.6349F, 2.8093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7404F, -0.7919F, 2.3193F, 0.6526F, 0.2899F, -0.0768F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(127, 0).addBox(-0.5F, -3.1F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1537F, 2.8216F, 1.6444F, -0.0857F, 0.1966F, -0.0726F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(87, 135).addBox(-0.5635F, -1.2766F, -4.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, 0.4815F, 0.1966F, -0.0726F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(33, 105).addBox(-1.4997F, 0.546F, -0.0523F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7404F, -0.7919F, 2.3193F, -0.0066F, 0.199F, -0.0656F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(111, 120).addBox(-0.75F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5751F, -0.8195F, 1.478F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(72, 80).addBox(-1.4997F, -0.3634F, -0.7461F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7404F, -0.7919F, 2.3193F, -0.1985F, 0.199F, -0.0656F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(130, 52).addBox(-1.871F, 0.2917F, 3.2203F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7404F, -0.7919F, 2.3193F, -0.0542F, 0.2899F, -0.0768F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(92, 25).addBox(-0.65F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2829F, 0.1797F, 1.4953F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(120, 98).addBox(-0.3881F, -0.0095F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2169F, -1.7503F, 1.0969F, -0.237F, 0.08F, -0.0349F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(46, 135).addBox(-0.5F, -1.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1808F, -0.4077F, -2.4939F, -0.8193F, -0.1301F, -0.0149F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(131, 83).addBox(-1.1347F, 0.027F, -1.9068F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0988F, -2.3357F, -0.0239F, -0.1666F, -0.1303F, 0.0126F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(130, 31).addBox(-0.8841F, 0.0105F, -1.9997F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0988F, -2.6357F, -1.9239F, 0.0446F, -0.1301F, -0.0149F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(46, 125).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.581F, -1.0621F, -8.5954F, 0.6005F, -0.1283F, 0.0262F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(75, 34).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3698F, -1.8942F, -6.789F, 0.4259F, -0.1283F, 0.0262F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(97, 120).addBox(-0.5939F, -0.0049F, -3.0415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0988F, -2.5357F, -3.8239F, 0.2165F, -0.1283F, 0.0262F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(138, 131).addBox(-0.5939F, -0.9697F, -0.3508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1322F, -0.3984F, -4.5171F, -0.0846F, -0.1283F, 0.0262F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(88, 125).addBox(-0.5939F, 0.8553F, -3.1508F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0988F, -2.5357F, -3.8239F, 0.247F, -0.1283F, 0.0262F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(102, 73).addBox(-0.5939F, -0.9447F, -4.8508F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3495F, -0.0494F, -6.2724F, 0.3168F, -0.1283F, 0.0262F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(48, 130).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0874F, 6.5709F, -7.98F, 0.4729F, -0.1283F, -0.0262F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(130, 41).addBox(-0.5F, -1.05F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.528F, 7.1977F, -10.4862F, -0.0332F, -0.1283F, -0.0262F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(104, 144).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6713F, 7.5336F, -11.5285F, -0.6354F, -0.1283F, -0.0262F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(141, 139).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6872F, 6.5851F, -11.8447F, -1.2462F, -0.1283F, -0.0262F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(141, 62).addBox(-0.3359F, 4.7488F, -0.7915F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3398F, 6.5689F, -5.1693F, -1.5953F, -0.1283F, -0.0262F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(141, 46).addBox(-0.3359F, 4.4127F, 1.2471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3398F, 6.5689F, -5.1693F, -2.0491F, -0.1283F, -0.0262F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(76, 135).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0788F, 5.3379F, -6.9497F, -0.1932F, -0.1295F, 0.0195F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(41, 130).addBox(-0.5F, -1.125F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3863F, 5.3984F, -9.3205F, -0.4114F, -0.1295F, 0.0195F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(127, 144).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(109, 144).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5732F, 4.1022F, -10.5622F, -0.0536F, -0.1295F, 0.0195F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(29, 141).addBox(-0.5F, -1.075F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5394F, 5.3967F, -10.4964F, 0.6445F, -0.1295F, 0.0195F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(98, 100).addBox(-0.3323F, -0.3559F, -2.7314F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F))
				.texOffs(72, 105).addBox(-0.3323F, -1.6559F, -2.7314F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3398F, 6.5689F, -5.1693F, 0.0504F, -0.1273F, 0.0307F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(126, 103).addBox(-0.5F, 0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-2.5617F, 14.8913F, 13.8717F, -0.8249F, -0.036F, 0.0103F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(120, 125).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.5617F, 14.8913F, 13.8717F, -0.6154F, -0.036F, 0.0103F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(130, 36).addBox(-0.5119F, -0.8663F, -1.2501F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.6371F, 16.8528F, 15.5263F, -0.8642F, -0.0336F, 0.0164F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(145, 86).addBox(-0.4869F, -0.2012F, 0.6407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.6371F, 16.8528F, 15.5263F, -1.6496F, -0.0336F, 0.0164F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(141, 22).addBox(-0.4879F, -2.2619F, -0.9358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5771F, 18.6917F, 15.4057F, -0.617F, 0.0146F, -0.0336F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(85, 100).addBox(-0.8269F, -0.0583F, -0.3801F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1667F, 12.0398F, 9.2442F, -0.5464F, -0.0294F, -0.0003F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(49, 108).addBox(-0.8269F, -0.0976F, 0.0361F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1667F, 12.0398F, 9.2442F, -0.4242F, -0.0294F, -0.0003F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(137, 51).addBox(-0.7897F, -1.1308F, -2.0949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.1083F, 11.4415F, 5.4335F, -0.4772F, -0.2919F, 0.0023F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(111, 125).addBox(-0.7897F, -1.1308F, -3.0199F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.1083F, 11.4415F, 5.4335F, -0.6168F, -0.2919F, 0.0023F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(99, 107).addBox(-0.7897F, -1.1308F, -4.0199F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.1667F, 13.0398F, 8.9442F, -0.4117F, -0.2919F, 0.0023F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(133, 93).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6219F, 9.1537F, 1.9959F, -1.788F, -0.1565F, -0.0511F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(98, 66).addBox(-0.226F, -1.2843F, -10.0355F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5851F, 13.3566F, 7.6946F, -0.5663F, -0.1565F, -0.0511F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(98, 34).addBox(-0.5F, -0.675F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6989F, 8.0549F, 2.1272F, -0.7583F, -0.1565F, -0.0511F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(39, 135).addBox(-0.6618F, -3.4073F, -1.4283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0001F, 8.0473F, -1.5088F, -1.1567F, -0.1321F, -0.0532F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(88, 120).addBox(-0.5F, -0.25F, -4.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6674F, 7.665F, 2.0698F, -1.4165F, -0.2615F, -0.0405F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(88, 107).addBox(-0.5F, -0.65F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6674F, 7.665F, 2.0698F, -1.1547F, -0.2615F, -0.0405F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 63).addBox(-0.7829F, -1.9919F, -0.4438F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.8441F, -3.6808F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(26, 73).addBox(-0.7829F, -1.2919F, -2.0938F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7829F, 1.4775F, 2.204F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(97, 125).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2557F, 6.5847F, 0.4097F, -0.3659F, 0.1919F, 0.0068F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(120, 120).mirror().addBox(-0.6427F, -0.9861F, 3.7501F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3398F, 3.2689F, -5.1693F, -0.5579F, 0.1919F, 0.0068F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(109, 15).mirror().addBox(-0.6427F, -0.5041F, 0.1994F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3398F, 3.2689F, -5.1693F, -0.4357F, 0.1919F, 0.0068F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(81, 139).mirror().addBox(0.871F, 2.8793F, -2.3225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -4.0918F, 2.3193F, 1.4904F, -0.2899F, 0.0768F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(6, 142).mirror().addBox(0.871F, 3.6349F, 2.8093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -4.0918F, 2.3193F, 0.6526F, -0.2899F, 0.0768F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(127, 0).mirror().addBox(-0.5F, -3.1F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1537F, -0.4783F, 1.6444F, -0.0857F, -0.1966F, 0.0726F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(87, 135).mirror().addBox(-0.4365F, -1.2766F, -4.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, -2.2908F, 6.5452F, 0.4815F, -0.1966F, 0.0726F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(33, 105).mirror().addBox(0.4997F, 0.546F, -0.0523F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -4.0918F, 2.3193F, -0.0066F, -0.199F, 0.0656F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(111, 120).mirror().addBox(-0.25F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5751F, -4.1195F, 1.478F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(0.4997F, -0.3634F, -0.7461F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -4.0918F, 2.3193F, -0.1985F, -0.199F, 0.0656F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(130, 52).mirror().addBox(0.871F, 0.2917F, 3.2203F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -4.0918F, 2.3193F, -0.0542F, -0.2899F, 0.0768F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(92, 25).mirror().addBox(-0.35F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2829F, -3.1203F, 1.4953F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(120, 98).mirror().addBox(-0.6119F, -0.0095F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2169F, -5.0503F, 1.0969F, -0.237F, -0.08F, 0.0349F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(46, 135).mirror().addBox(-0.5F, -1.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1808F, -3.7077F, -2.4939F, -0.8193F, 0.1301F, 0.0149F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(131, 83).mirror().addBox(0.1347F, 0.027F, -1.9068F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -5.6357F, -0.0239F, -0.1666F, 0.1303F, -0.0126F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(130, 31).mirror().addBox(-0.1159F, 0.0105F, -1.9997F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -5.9357F, -1.9239F, 0.0446F, 0.1301F, 0.0149F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(46, 125).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.581F, -4.3621F, -8.5954F, 0.6005F, 0.1283F, -0.0262F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3698F, -5.1942F, -6.789F, 0.4259F, 0.1283F, -0.0262F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(97, 120).mirror().addBox(-0.4061F, -0.0049F, -3.0415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -5.8357F, -3.8239F, 0.2165F, 0.1283F, -0.0262F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(138, 131).mirror().addBox(-0.4061F, -0.9697F, -0.3508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1322F, -3.6984F, -4.5171F, -0.0846F, 0.1283F, -0.0262F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(88, 125).mirror().addBox(-0.4061F, 0.8553F, -3.1508F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -5.8357F, -3.8239F, 0.247F, 0.1283F, -0.0262F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(102, 73).mirror().addBox(-0.4061F, -0.9447F, -4.8508F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3495F, -3.3494F, -6.2724F, 0.3168F, 0.1283F, -0.0262F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(48, 130).mirror().addBox(-0.5F, -0.9F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0874F, 3.2709F, -7.98F, 0.4729F, 0.1283F, 0.0262F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(130, 41).mirror().addBox(-0.5F, -1.05F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.528F, 3.8978F, -10.4862F, -0.0332F, 0.1283F, 0.0262F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(104, 144).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6713F, 4.2336F, -11.5285F, -0.6354F, 0.1283F, 0.0262F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(141, 139).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6872F, 3.2851F, -11.8447F, -1.2462F, 0.1283F, 0.0262F));

		PartDefinition cube_r86 = bone5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(141, 62).mirror().addBox(-0.6641F, 4.7488F, -0.7915F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3398F, 3.2689F, -5.1693F, -1.5953F, 0.1283F, 0.0262F));

		PartDefinition cube_r87 = bone5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(141, 46).mirror().addBox(-0.6641F, 4.4127F, 1.2471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3398F, 3.2689F, -5.1693F, -2.0491F, 0.1283F, 0.0262F));

		PartDefinition cube_r88 = bone5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(76, 135).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0788F, 2.0379F, -6.9497F, -0.1932F, 0.1295F, -0.0195F));

		PartDefinition cube_r89 = bone5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(41, 130).mirror().addBox(-0.5F, -1.125F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3863F, 2.0984F, -9.3205F, -0.4114F, 0.1295F, -0.0195F));

		PartDefinition cube_r90 = bone5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(127, 144).mirror().addBox(-0.5F, 0.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(109, 144).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5732F, 0.8022F, -10.5622F, -0.0536F, 0.1295F, -0.0195F));

		PartDefinition cube_r91 = bone5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(29, 141).mirror().addBox(-0.5F, -1.075F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5394F, 2.0967F, -10.4964F, 0.6445F, 0.1295F, -0.0195F));

		PartDefinition cube_r92 = bone5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(98, 100).mirror().addBox(-0.6677F, -0.3559F, -2.7314F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(72, 105).mirror().addBox(-0.6677F, -1.6559F, -2.7314F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3398F, 3.2689F, -5.1693F, 0.0504F, 0.1273F, -0.0307F));

		PartDefinition cube_r93 = bone5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(126, 103).mirror().addBox(-0.5F, 0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(2.5617F, 11.5913F, 13.8717F, -0.8249F, 0.036F, -0.0103F));

		PartDefinition cube_r94 = bone5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(120, 125).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.5617F, 11.5913F, 13.8717F, -0.6154F, 0.036F, -0.0103F));

		PartDefinition cube_r95 = bone5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(130, 36).mirror().addBox(-0.4881F, -0.8663F, -1.2501F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.6371F, 13.5528F, 15.5263F, -0.8642F, 0.0336F, -0.0164F));

		PartDefinition cube_r96 = bone5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(145, 86).mirror().addBox(-0.5131F, -0.2012F, 0.6407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.6371F, 13.5528F, 15.5263F, -1.6496F, 0.0336F, -0.0164F));

		PartDefinition cube_r97 = bone5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(141, 22).mirror().addBox(-0.5121F, -2.2619F, -0.9358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5771F, 15.3917F, 15.4057F, -0.617F, -0.0146F, 0.0336F));

		PartDefinition cube_r98 = bone5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(85, 100).mirror().addBox(-0.1731F, -0.0583F, -0.3801F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.1667F, 8.7398F, 9.2442F, -0.5464F, 0.0294F, 0.0003F));

		PartDefinition cube_r99 = bone5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(49, 108).mirror().addBox(-0.1731F, -0.0976F, 0.0361F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.1667F, 8.7398F, 9.2442F, -0.4242F, 0.0294F, 0.0003F));

		PartDefinition cube_r100 = bone5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(137, 51).mirror().addBox(-0.2103F, -1.1308F, -2.0949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.1083F, 8.1415F, 5.4335F, -0.4772F, 0.2919F, -0.0023F));

		PartDefinition cube_r101 = bone5.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(111, 125).mirror().addBox(-0.2103F, -1.1308F, -3.0199F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.1083F, 8.1415F, 5.4335F, -0.6168F, 0.2919F, -0.0023F));

		PartDefinition cube_r102 = bone5.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(99, 107).mirror().addBox(-0.2103F, -1.1308F, -4.0199F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.1667F, 9.7398F, 8.9442F, -0.4117F, 0.2919F, -0.0023F));

		PartDefinition cube_r103 = bone5.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(133, 93).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6219F, 5.8537F, 1.9959F, -1.788F, 0.1565F, 0.0511F));

		PartDefinition cube_r104 = bone5.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(98, 66).mirror().addBox(-0.774F, -1.2843F, -10.0355F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5851F, 10.0566F, 7.6946F, -0.5663F, 0.1565F, 0.0511F));

		PartDefinition cube_r105 = bone5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(98, 34).mirror().addBox(-0.5F, -0.675F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.6989F, 4.7549F, 2.1272F, -0.7583F, 0.1565F, 0.0511F));

		PartDefinition cube_r106 = bone5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(39, 135).mirror().addBox(-0.3382F, -3.4073F, -1.4283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0001F, 4.7473F, -1.5088F, -1.1567F, 0.1321F, 0.0532F));

		PartDefinition cube_r107 = bone5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(88, 120).mirror().addBox(-0.5F, -0.25F, -4.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6674F, 4.365F, 2.0698F, -1.4165F, 0.2615F, 0.0405F));

		PartDefinition cube_r108 = bone5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(88, 107).mirror().addBox(-0.5F, -0.65F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6674F, 4.365F, 2.0698F, -1.1547F, 0.2615F, 0.0405F));

		PartDefinition cube_r109 = bone5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(45, 63).mirror().addBox(-0.2171F, -1.9919F, -0.4438F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5441F, -3.6808F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r110 = bone5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-0.2171F, -1.2919F, -2.0938F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.3F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 2.9352F, 1.9589F, -0.8007F, -0.2496F, -0.3978F));

		PartDefinition cube_r111 = leftLeg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(118, 48).addBox(-0.5F, 0.0303F, -3.024F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.4886F, 2.2073F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(55, 130).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4144F, 2.2034F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(106, 0).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.6448F, 0.6533F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(94, 50).addBox(-1.5F, -2.8619F, -3.3279F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 1.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(39, 80).addBox(-1.0F, -2.1F, -2.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3545F, 1.5387F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 111).addBox(-1.0F, 0.0F, 0.05F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 10.8815F, -1.4993F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(109, 41).addBox(-1.0F, -0.2F, 0.05F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1036F, -1.0393F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(111, 100).addBox(-1.0F, -2.2F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(18, 88).addBox(-1.5F, -3.2145F, -0.5366F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.8715F, 1.3866F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(102, 80).addBox(-1.5F, -1.5F, -1.65F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 16.2902F, 0.0252F, -0.3578F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0832F, 0.862F, 2.0525F, 0.1997F, 0.0243F));

		PartDefinition cube_r121 = leftLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(97, 113).addBox(-0.5F, -5.7F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 6.6354F, -1.5005F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(55, 119).addBox(-0.5F, 8.6695F, 1.1052F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2F, 4.0354F, -1.0005F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(36, 112).addBox(-0.5F, -0.0911F, -0.4311F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 4.0354F, -1.0005F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(88, 113).addBox(-1.0F, 1.9398F, 0.3844F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 14.8319F, -1.6984F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(94, 58).addBox(-1.0F, -1.4F, -2.4F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 2.3324F, -0.076F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(63, 98).addBox(-1.0F, -3.0F, -1.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 5.7159F, -0.3753F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(127, 6).addBox(-1.0F, -0.725F, -0.925F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 2.3602F, 1.5781F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0F, -14.9908F, -1.9261F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 17.1037F, 0.2579F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(22, 104).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 21.4775F, -1.5079F, -1.7453F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(73, 59).addBox(-3.0F, -1.0696F, -3.7933F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5049F, -0.0014F, 1.9236F, -0.0609F, 0.1637F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(52, 50).addBox(-3.0F, -1.4F, -5.7F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4935F, -3.7282F, -0.48F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 2.9352F, 1.9589F, -0.3202F, -0.1624F, -0.4537F));

		PartDefinition cube_r129 = rightLeg.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(79, 120).addBox(-0.5F, 0.0303F, -3.024F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.4886F, 2.2073F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(134, 62).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4144F, 2.2034F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(107, 57).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.6448F, 0.6533F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(39, 97).addBox(-1.5F, -2.8619F, -3.3279F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 1.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(48, 80).addBox(-1.0F, -2.1F, -2.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3545F, 1.5387F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(70, 112).addBox(-1.0F, 0.0F, 0.05F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 10.8815F, -1.4993F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(27, 112).addBox(-1.0F, -0.2F, 0.05F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1036F, -1.0393F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightLeg.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(115, 91).addBox(-1.0F, -2.2F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightLeg.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(91, 0).addBox(-1.5F, -3.2145F, -0.5366F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.8715F, 1.3866F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightLeg.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(104, 8).addBox(-1.5F, -1.5F, -1.65F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 16.2902F, 0.0252F, -0.3578F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0832F, 0.862F, 1.0972F, 0.3853F, -0.1903F));

		PartDefinition cube_r139 = rightLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(117, 113).addBox(-0.5F, -5.7F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 6.6354F, -1.5005F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(79, 126).addBox(-0.5F, 8.6695F, 1.1052F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2F, 4.0354F, -1.0005F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5F, -0.0911F, -0.4311F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 4.0354F, -1.0005F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightLeg2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(116, 21).addBox(-1.0F, 1.9398F, 0.3844F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 14.8319F, -1.6984F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightLeg2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(72, 97).addBox(-1.0F, -1.4F, -2.4F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 2.3324F, -0.076F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightLeg2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(13, 104).addBox(-1.0F, -3.0F, -1.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 5.7159F, -0.3753F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightLeg2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(129, 74).addBox(-1.0F, -0.725F, -0.925F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 2.3602F, 1.5781F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightLeg2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(9, 78).addBox(-1.0F, -14.9908F, -1.9261F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 17.1037F, 0.2579F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(105, 24).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 21.4775F, -1.5079F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(75, 18).addBox(-3.0F, -1.0696F, -3.7933F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5049F, -0.0014F, 1.7104F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(58, 38).addBox(-3.0F, -1.4F, -5.7F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4935F, -3.7282F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(27, 50).addBox(-1.0F, -0.6555F, -10.0243F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7114F, -4.2632F, -0.279F, 0.0053F, 0.0871F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(122, 60).addBox(0.0F, -5.2791F, 0.0071F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2341F, -12.0312F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(122, 0).addBox(0.0F, -5.2437F, -0.0022F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2341F, -15.0312F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(75, 25).addBox(-1.0F, -0.1094F, -0.0631F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0554F, -15.9243F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(121, 103).addBox(0.0F, -5.7901F, -0.9748F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -2.0243F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(65, 121).addBox(0.0F, -5.3647F, -0.0963F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -5.9243F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(60, 121).addBox(0.0F, -5.0576F, -1.0985F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -7.9243F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(135, 103).mirror().addBox(-2.916F, 0.1054F, -1.3834F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -1.1303F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(140, 95).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -5.0303F, 0.0476F, -0.1514F, -0.9925F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(-3.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -5.0303F, 0.1073F, -0.1171F, -1.4315F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(143, 4).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -5.0303F, -0.0069F, -0.0948F, -0.5565F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(64, 4).mirror().addBox(-14.8936F, -2.4262F, -0.2666F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -8.2303F, 0.1314F, 0.0558F, -1.4323F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(142, 113).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -8.2303F, 0.1426F, -0.0048F, -0.9999F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(144, 103).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -8.2303F, 0.1411F, -0.0019F, -0.5636F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(31, 20).mirror().addBox(-22.8937F, -2.4262F, -0.2666F, 20.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -11.0303F, 0.1362F, 0.0904F, -1.4319F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(136, 101).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -11.0303F, 0.1615F, 0.0246F, -0.9998F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(142, 111).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -11.0303F, 0.1706F, 0.0168F, -0.5634F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(11, 142).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5044F, -14.1303F, 0.2356F, 0.043F, -0.5602F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(89, 16).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5044F, -14.1303F, 0.2093F, 0.0758F, -0.9961F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(31, 18).mirror().addBox(-22.8937F, -2.4262F, -0.2666F, 20.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5044F, -14.1303F, 0.1583F, 0.1568F, -1.4279F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(135, 103).addBox(-0.084F, 0.1054F, -1.3834F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -1.1303F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(140, 95).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -5.0303F, 0.0476F, 0.1514F, 0.9925F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(88, 57).addBox(2.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -5.0303F, 0.1073F, 0.1171F, 1.4315F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(143, 4).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -5.0303F, -0.0069F, 0.0948F, 0.5565F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(64, 4).addBox(2.8937F, -2.4262F, -0.2666F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -8.2303F, 0.1314F, -0.0558F, 1.4323F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(142, 113).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -8.2303F, 0.1426F, 0.0048F, 0.9999F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(144, 103).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -8.2303F, 0.1411F, 0.0019F, 0.5636F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(31, 20).addBox(2.8937F, -2.4262F, -0.2666F, 20.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -11.0303F, 0.1362F, -0.0904F, 1.4319F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(136, 101).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -11.0303F, 0.1615F, -0.0246F, 0.9998F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(142, 111).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -11.0303F, 0.1706F, -0.0168F, 0.5634F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(11, 142).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5044F, -14.1303F, 0.2356F, -0.043F, 0.5602F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(89, 16).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5044F, -14.1303F, 0.2093F, -0.0758F, 0.9961F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(31, 18).addBox(2.8937F, -2.4262F, -0.2666F, 20.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5044F, -14.1303F, 0.1583F, -0.1568F, 1.4279F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7319F, -15.9168F, -0.167F, -0.1982F, 0.1237F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(124, 69).addBox(0.0F, -5.7855F, 0.0093F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0671F, -2.0483F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(106, 118).addBox(0.0F, -5.8022F, -1.104F, 0.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.0671F, -3.6483F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(41, 118).addBox(0.0F, -5.8741F, -0.0432F, 0.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.5576F, -6.9134F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(102, 87).addBox(-1.0F, -0.0448F, -3.9381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6612F, -4.6119F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(143, 97).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.4509F, 0.1596F, -0.503F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-21.8937F, -2.4262F, -0.2666F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.2092F, 0.3957F, -1.3786F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(141, 20).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.3569F, 0.2717F, -0.9351F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(102, 94).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5663F, 21.3995F, 0.9724F, 0.2113F, -0.9083F, -0.1339F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(9, 115).mirror().addBox(-0.5F, 1.4047F, 4.3776F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5663F, 21.3995F, 0.9724F, 0.5255F, -0.9083F, -0.1339F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(49, 114).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1388F, 21.6454F, 0.8981F, 0.1599F, -0.7252F, -0.2187F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(94, 43).mirror().addBox(-0.5F, 1.2502F, 3.902F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1388F, 21.6454F, 0.8981F, 0.474F, -0.7252F, -0.2187F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(106, 113).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4391F, 21.6525F, 1.6206F, -0.071F, -0.617F, 0.016F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(87, 93).mirror().addBox(-0.5F, 1.2193F, 3.8069F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4391F, 21.6525F, 1.6206F, 0.2432F, -0.617F, 0.016F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(143, 10).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.8241F, -5.704F, 0.6353F, 0.2255F, -0.4161F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(143, 8).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.8241F, -5.704F, 0.5028F, 0.4065F, -0.8349F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(35, 16).mirror().addBox(-18.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.8241F, -5.704F, 0.283F, 0.5769F, -1.2925F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(140, 109).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.4257F, 0.3187F, -0.8799F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(35, 2).mirror().addBox(-20.8937F, -2.4262F, -0.2666F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.2523F, 0.4665F, -1.3254F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(143, 6).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.5314F, 0.175F, -0.4544F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(143, 97).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.4509F, -0.1596F, 0.503F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(35, 0).addBox(2.8937F, -2.4262F, -0.2666F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.2092F, -0.3957F, 1.3786F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(141, 20).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.3569F, -0.2717F, 0.9351F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(72, 89).addBox(-1.0F, -0.0448F, 2.9619F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0671F, -7.1483F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(102, 94).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5663F, 21.3995F, 0.9724F, 0.2113F, 0.9083F, 0.1339F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(9, 115).addBox(-0.5F, 1.4047F, 4.3776F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5663F, 21.3995F, 0.9724F, 0.5255F, 0.9083F, 0.1339F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(49, 114).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1388F, 21.6454F, 0.8981F, 0.1599F, 0.7252F, 0.2187F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(94, 43).addBox(-0.5F, 1.2502F, 3.902F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1388F, 21.6454F, 0.8981F, 0.474F, 0.7252F, 0.2187F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(106, 113).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4391F, 21.6525F, 1.6206F, -0.071F, 0.617F, -0.016F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(87, 93).addBox(-0.5F, 1.2193F, 3.8069F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4391F, 21.6525F, 1.6206F, 0.2432F, 0.617F, -0.016F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(18, 124).addBox(-3.4039F, 0.5394F, -2.4736F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9039F, 20.726F, 1.9981F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(143, 10).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8241F, -5.704F, 0.6353F, -0.2255F, 0.4161F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(143, 8).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8241F, -5.704F, 0.5028F, -0.4065F, 0.8349F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(35, 16).addBox(2.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8241F, -5.704F, 0.283F, -0.5769F, 1.2925F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(140, 109).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.4257F, -0.3187F, 0.8799F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(35, 2).addBox(2.8937F, -2.4262F, -0.2666F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.2523F, -0.4665F, 1.3254F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(143, 6).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.5314F, -0.175F, 0.4544F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(77, 49).addBox(-3.9039F, 0.7932F, -8.3217F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9039F, 20.726F, 1.9981F, -0.2007F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 4.7444F, -6.939F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r216 = chest2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(143, 101).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.8F, -4.3F, 0.795F, 0.24F, -0.3803F));

		PartDefinition cube_r217 = chest2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-7.729F, -1.955F, -0.2993F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.8F, -4.3F, 0.3956F, 0.7044F, -1.2261F));

		PartDefinition cube_r218 = chest2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(143, 99).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.8F, -4.3F, 0.6547F, 0.4812F, -0.7706F));

		PartDefinition cube_r219 = chest2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(74, 2).mirror().addBox(-9.729F, -1.955F, -0.2993F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.4F, -3.0F, 0.346F, 0.5888F, -1.256F));

		PartDefinition cube_r220 = chest2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(143, 28).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.4F, -3.0F, 0.5599F, 0.3942F, -0.8109F));

		PartDefinition cube_r221 = chest2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(143, 26).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.4F, -3.0F, 0.6794F, 0.1932F, -0.4051F));

		PartDefinition cube_r222 = chest2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(143, 14).mirror().addBox(-1.4539F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.5597F, 0.1746F, -0.3964F));

		PartDefinition cube_r223 = chest2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(141, 18).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.4526F, 0.3298F, -0.8182F));

		PartDefinition cube_r224 = chest2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-14.7415F, -1.9518F, -0.3082F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.2729F, 0.4874F, -1.2628F));

		PartDefinition cube_r225 = chest2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(143, 12).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.4932F, 0.1628F, -0.4264F));

		PartDefinition cube_r226 = chest2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(141, 16).mirror().addBox(-3.3281F, -0.5952F, -0.3189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.395F, 0.292F, -0.8547F));

		PartDefinition cube_r227 = chest2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(58, 47).mirror().addBox(-16.7647F, -1.946F, -0.3189F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.2358F, 0.4297F, -1.2982F));

		PartDefinition cube_r228 = chest2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(143, 99).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8F, -4.3F, 0.6547F, -0.4812F, 0.7706F));

		PartDefinition cube_r229 = chest2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(76, 0).addBox(2.729F, -1.955F, -0.2993F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8F, -4.3F, 0.3956F, -0.7044F, 1.2261F));

		PartDefinition cube_r230 = chest2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(143, 101).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8F, -4.3F, 0.795F, -0.24F, 0.3803F));

		PartDefinition cube_r231 = chest2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(74, 2).addBox(2.729F, -1.955F, -0.2993F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4F, -3.0F, 0.346F, -0.5888F, 1.256F));

		PartDefinition cube_r232 = chest2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(106, 128).addBox(0.0F, -5.4215F, 0.002F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 0.043F, -1.1443F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(105, 137).addBox(0.0F, -4.9777F, 0.1686F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 4.4153F, -5.3777F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(99, 135).addBox(0.0F, -5.6502F, -0.0382F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 3.0153F, -3.8777F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(79, 112).addBox(0.0F, -5.6278F, -0.0698F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.443F, -2.4443F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(26, 63).addBox(-1.0F, -0.0865F, -2.1546F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.943F, -3.7443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(143, 28).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4F, -3.0F, 0.5599F, -0.3942F, 0.8109F));

		PartDefinition cube_r238 = chest2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(143, 26).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4F, -3.0F, 0.6794F, -0.1932F, 0.4051F));

		PartDefinition cube_r239 = chest2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(143, 14).addBox(-0.5461F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.5597F, -0.1746F, 0.3964F));

		PartDefinition cube_r240 = chest2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(141, 18).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.4526F, -0.3298F, 0.8182F));

		PartDefinition cube_r241 = chest2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(64, 6).addBox(2.7415F, -1.9518F, -0.3082F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.2729F, -0.4874F, 1.2628F));

		PartDefinition cube_r242 = chest2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(143, 12).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.4932F, -0.1628F, 0.4264F));

		PartDefinition cube_r243 = chest2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(141, 16).addBox(1.3281F, -0.5952F, -0.3189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.395F, -0.292F, 0.8547F));

		PartDefinition cube_r244 = chest2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(58, 47).addBox(2.7647F, -1.946F, -0.3189F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.2358F, -0.4297F, 1.2982F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.975F, -4.6417F, 0.286F, -0.1856F, 0.0399F));

		PartDefinition cube_r245 = neck4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(117, 11).addBox(0.0F, -1.9173F, -0.0299F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4811F, -3.61F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r246 = neck4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(41, 112).addBox(0.0F, -3.7294F, -0.1633F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2811F, -1.91F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(89, 47).mirror().addBox(-3.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3529F, -3.0163F, 0.2232F, 0.9281F, -1.3687F));

		PartDefinition cube_r248 = neck4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(94, 143).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3529F, -3.0163F, 0.6652F, 0.7334F, -0.7806F));

		PartDefinition cube_r249 = neck4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(72, 143).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3529F, -3.0163F, 0.9098F, 0.4685F, -0.3562F));

		PartDefinition cube_r250 = neck4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(77, 57).mirror().addBox(-6.729F, -1.955F, -0.2993F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0529F, -1.2163F, 0.346F, 0.5888F, -1.256F));

		PartDefinition cube_r251 = neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(143, 68).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0529F, -1.2163F, 0.5599F, 0.3942F, -0.8109F));

		PartDefinition cube_r252 = neck4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(143, 66).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0529F, -1.2163F, 0.6794F, 0.1932F, -0.4051F));

		PartDefinition cube_r253 = neck4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(89, 47).addBox(2.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3529F, -3.0163F, 0.2232F, -0.9281F, 1.3687F));

		PartDefinition cube_r254 = neck4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(94, 143).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3529F, -3.0163F, 0.6652F, -0.7334F, 0.7806F));

		PartDefinition cube_r255 = neck4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(72, 143).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3529F, -3.0163F, 0.9098F, -0.4685F, 0.3562F));

		PartDefinition cube_r256 = neck4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(77, 57).addBox(2.729F, -1.955F, -0.2993F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0529F, -1.2163F, 0.346F, -0.5888F, 1.256F));

		PartDefinition cube_r257 = neck4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(143, 68).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0529F, -1.2163F, 0.5599F, -0.3942F, 0.8109F));

		PartDefinition cube_r258 = neck4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(143, 66).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0529F, -1.2163F, 0.6794F, -0.1932F, 0.4051F));

		PartDefinition cube_r259 = neck4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(89, 8).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.5811F, -3.61F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.155F, -3.7114F, 0.7337F, -0.4916F, 0.0247F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(151, 45).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1716F, -3.0051F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(9, 111).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2637F, -1.223F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, -1.9487F, 2.0661F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9164F, -6.5763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5698F, -3.8805F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r263 = neck2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(117, 146).addBox(0.0F, -0.9018F, 7.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(107, 50).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.6263F, -7.1488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(123, 32).addBox(-0.5F, -3.75F, -0.9206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(83, 136).addBox(0.0F, -2.75F, 0.6794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0363F, -2.8389F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r264 = neck5.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(126, 117).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, 1.0794F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(123, 39).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(111, 70).addBox(0.0F, -3.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2939F, 0.002F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck6.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(49, 105).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.1F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create().texOffs(124, 78).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(151, 0).addBox(0.0F, -1.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 151).addBox(0.0F, -3.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6964F, -0.0483F, -0.1607F, -0.3777F, 0.1102F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create().texOffs(124, 85).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(8, 151).addBox(0.0F, -1.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 151).addBox(0.0F, -3.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create().texOffs(127, 62).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(14, 151).addBox(0.0F, -1.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.775F, 0.0F, 0.3503F, -0.082F, -0.0299F));

		PartDefinition cube_r266 = neck9.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(151, 61).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create().texOffs(129, 10).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.525F, 0.1F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck10.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(150, 95).addBox(0.0F, -1.2F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.3F, 0.3927F, 0.0F, 0.0F));

		PartDefinition heads = neck10.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.647F, 0.6345F, -0.8311F, -0.1813F, 0.1257F));

		PartDefinition cube_r268 = heads.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(148, 130).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 5.1799F, -12.8F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r269 = heads.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(83, 66).addBox(-1.0F, -0.4F, -5.275F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1403F, -0.9215F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r270 = heads.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(116, 28).addBox(-2.5F, -0.175F, -2.175F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.7F, -0.6852F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r271 = heads.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(83, 43).addBox(-1.5F, -0.45F, -0.575F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1286F, -0.8259F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r272 = heads.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(73, 66).addBox(-1.5F, 2.375F, -0.95F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.8459F, 1.326F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r273 = heads.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(145, 136).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 4.4984F, -13.2901F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r274 = heads.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(135, 111).addBox(-0.5F, -0.1F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.663F, -12.9705F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r275 = heads.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(149, 49).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.3763F, -11.528F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r276 = heads.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(137, 55).addBox(-0.5F, -1.85F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.799F, -9.0533F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r277 = heads.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(9, 120).addBox(-0.5F, -1.85F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.0846F, -8.2169F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r278 = heads.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(46, 119).addBox(-1.5F, 0.4356F, -2.3637F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.0F, -1.2609F, -7.9838F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r279 = heads.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 119).addBox(-0.5F, -1.475F, -1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.3632F, -5.5643F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r280 = heads.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(149, 111).addBox(-0.5F, -0.1F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.8771F, -2.9867F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r281 = heads.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(70, 126).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -2.5511F, -2.3903F, -2.2951F, 0.0F, 0.0F));

		PartDefinition cube_r282 = heads.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(149, 58).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.8087F, -1.9618F, -2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r283 = heads.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(129, 123).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, -3.1121F, -0.6977F, -2.906F, 0.0F, 0.0F));

		PartDefinition cube_r284 = heads.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(120, 17).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -3.366F, 0.061F, -2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r285 = heads.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(149, 55).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.0F, -3.2813F, 0.4006F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r286 = heads.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(74, 139).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.8096F, 0.8106F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r287 = heads.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(138, 75).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -2.3494F, 1.006F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r288 = heads.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(54, 149).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.5653F, 2.1166F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r289 = heads.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(27, 126).addBox(-0.5F, -0.9F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -3.7645F, 2.0747F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r290 = heads.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(140, 92).addBox(-1.1337F, -0.9435F, -2.2879F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(126, 113).addBox(-1.1337F, -0.9435F, -1.8879F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.1337F, -6.0495F, 2.6253F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r291 = heads.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(127, 27).addBox(-1.0F, -0.9F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -7.8214F, 3.0108F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r292 = heads.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(137, 59).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -8.6211F, 3.0318F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r293 = heads.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(136, 13).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -9.4102F, 2.8997F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r294 = heads.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(111, 38).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -10.1198F, 2.5303F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r295 = heads.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(37, 145).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -10.6904F, 1.9696F, 2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r296 = heads.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(29, 145).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.0F, -11.1202F, 1.2949F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r297 = heads.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(144, 143).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -11.3011F, 0.5413F, 2.906F, 0.0F, 0.0F));

		PartDefinition cube_r298 = heads.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(3, 133).addBox(-0.5F, -4.9F, -0.875F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.0F, -11.2802F, -0.2584F, -3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r299 = heads.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(94, 137).addBox(-0.5F, -3.9F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -11.1925F, -1.0284F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r300 = heads.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(13, 136).addBox(-0.5F, -3.9F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.0F, -11.0247F, -1.7851F, -2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r301 = heads.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(129, 117).addBox(-1.5F, -0.1176F, -0.12F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.0F, -8.3877F, -3.5689F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r302 = heads.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(52, 98).addBox(-1.5F, -0.1176F, -2.095F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -6.6052F, -3.8194F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r303 = heads.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(32, 132).addBox(-1.5F, -0.1176F, -0.82F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.0F, -5.9354F, -4.0968F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r304 = heads.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(129, 97).addBox(-1.5F, -0.1175F, -0.12F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.0F, -4.5712F, -4.9328F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r305 = heads.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(115, 77).addBox(-1.5F, -0.1176F, -0.12F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.0F, -3.0438F, -6.063F, 0.9338F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -1.4735F, -2.7839F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(138, 135).addBox(-0.5F, -0.7721F, 0.3058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.172F, 0.4899F, 2.4093F, -1.7791F, 0.1079F, -0.2084F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(59, 149).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.2674F, 0.1469F, 2.2026F, -1.7791F, 0.1079F, -0.2084F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(148, 127).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1375F, 0.5293F, 2.6463F, -2.3027F, 0.1079F, -0.2084F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(127, 148).addBox(-0.5F, -0.45F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.2593F, 0.1663F, 2.239F, -1.2119F, 0.1079F, -0.2084F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(150, 9).addBox(-0.525F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2044F, 6.3839F, -10.6128F, -0.2281F, -0.207F, 0.1511F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(19, 150).addBox(-0.4F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0273F, 6.4177F, -10.9999F, -0.9582F, -1.3825F, 1.0454F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(150, 12).addBox(-0.075F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(150, 6).addBox(-0.375F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8486F, 6.2779F, -11.239F, -0.3372F, -0.8381F, 0.3584F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(150, 3).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0404F, 6.2471F, -11.2869F, -0.2638F, 0.5572F, -0.0384F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(109, 148).addBox(-0.45F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5988F, 6.3791F, -10.7963F, -0.2231F, 0.0057F, 0.1021F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(25, 131).addBox(-0.375F, -0.725F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.4148F, 0.7231F, 0.7287F, -0.1004F, 0.0918F, -0.1264F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.6419F, 4.5531F, -6.74F, 0.5539F, 0.0823F, -0.126F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(70, 120).addBox(-0.5027F, -1.6673F, -0.4153F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5974F, 3.9733F, -3.5613F, -0.1521F, 0.2001F, -0.0749F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(138, 79).addBox(-0.4902F, -0.7267F, -2.1168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5974F, 3.9733F, -3.5613F, 0.016F, 0.2043F, -0.0616F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(136, 115).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.8313F, 3.0073F, -4.6454F, 0.3893F, 0.1869F, -0.0256F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(64, 149).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2388F, 4.1751F, -6.9573F, 0.4766F, 0.1869F, -0.0256F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(136, 97).addBox(-1.0358F, -1.4086F, -2.4372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1539F, 4.5596F, -4.1578F, 0.1711F, 0.1869F, -0.0256F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(104, 148).addBox(-0.975F, 0.575F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9828F, -1.0076F, 1.1455F, -0.5218F, 0.0459F, -0.1065F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(27, 120).addBox(-1.8119F, -0.9582F, -3.7958F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.015F, 0.5283F, 0.5808F, 0.1191F, 0.1366F, -0.1591F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(52, 140).addBox(-0.5F, -1.775F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6266F, 4.7545F, 0.9406F, 0.037F, 0.0115F, -0.1655F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(121, 130).addBox(-0.4244F, -0.8359F, -2.5279F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1539F, 4.5596F, -4.1578F, 0.1021F, 0.1525F, 0.127F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(79, 144).addBox(0.275F, -0.775F, -0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 4.4807F, -3.1618F, -0.0962F, 0.0695F, -0.0067F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(52, 145).addBox(-0.4939F, -1.9203F, -0.3439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(148, 16).addBox(-0.5073F, -2.069F, -0.5088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, -0.5431F, 0.1341F, -0.157F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(42, 140).addBox(-0.4939F, -0.9436F, -0.4347F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, -0.7526F, 0.1341F, -0.157F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(94, 148).addBox(-0.4939F, 0.9651F, 0.3395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, -1.1976F, 0.1341F, -0.157F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(82, 148).addBox(-0.4919F, 0.4024F, 0.14F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, -0.9358F, 0.1341F, -0.157F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(99, 149).addBox(-0.5123F, -1.4534F, 0.0699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(77, 148).addBox(-0.5123F, -1.4034F, 0.0699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, -0.4646F, 0.1341F, -0.157F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(110, 107).addBox(-0.4221F, -0.5497F, 0.038F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.3452F, 3.3783F, -6.0185F, 0.6082F, 0.1493F, -0.037F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(136, 67).addBox(-0.5073F, -0.2711F, -1.281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, 0.792F, 0.1341F, -0.157F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(67, 136).addBox(-0.5073F, -0.1031F, -0.8364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, 0.8793F, 0.1341F, -0.157F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(136, 26).addBox(-0.5073F, -0.1454F, -1.2386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, 0.9666F, 0.1341F, -0.157F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(23, 136).addBox(-0.5073F, -0.477F, -0.5174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, 1.0888F, 0.1341F, -0.157F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(69, 149).addBox(-0.5073F, -1.7311F, -0.1957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(87, 149).addBox(-0.5093F, -1.6192F, 0.319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, -0.2202F, 0.1341F, -0.157F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(148, 19).addBox(-0.5073F, -1.078F, 0.9057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, 0.7048F, 0.1341F, -0.157F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(9, 148).addBox(-0.5093F, -1.945F, -0.9698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, -1.0405F, 0.1341F, -0.157F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(144, 147).addBox(-0.5F, 0.106F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(135, 147).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8531F, 1.4981F, -0.005F, 3.0964F, 0.1137F, -0.2066F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(147, 108).addBox(-0.496F, -0.696F, -0.696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.1131F, 0.3869F, -0.1591F, 2.1146F, 0.1137F, -0.2066F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(147, 92).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1942F, 0.1883F, -0.4967F, 2.5858F, 0.1137F, -0.2066F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(144, 58).addBox(-0.5F, -1.7F, -0.7125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2368F, 0.2131F, -0.9062F, -3.1005F, 0.1125F, -0.1759F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(144, 54).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.2513F, 0.3231F, -1.2727F, -2.8551F, 0.1015F, -0.1645F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(144, 50).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.2301F, 0.9243F, -1.7587F, -2.0806F, 0.1548F, -0.1709F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(144, 42).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2598F, 0.5751F, -1.5658F, -2.4646F, 0.1548F, -0.1709F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(144, 38).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1752F, 1.313F, -1.8355F, -1.7664F, 0.1548F, -0.1709F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(144, 34).addBox(-0.5F, -1.525F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1155F, 1.5315F, -1.6964F, -1.7315F, 0.1548F, -0.1709F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(136, 9).addBox(-0.5F, -0.325F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.9909F, 2.2765F, -1.7219F, -1.9235F, 0.1548F, -0.1709F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(24, 147).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8634F, 2.8328F, -1.5227F, -1.5832F, 0.1548F, -0.1709F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(144, 30).addBox(-0.4608F, -0.3973F, -0.7454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.0153F, 1.633F, -0.9205F, -0.6407F, 0.1548F, -0.1709F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(19, 147).addBox(-0.4608F, 0.0712F, 0.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.0153F, 1.633F, -0.9205F, -1.4261F, 0.1548F, -0.1709F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(146, 139).addBox(-0.4608F, 0.2184F, 0.0702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.0153F, 1.633F, -0.9205F, -0.8589F, 0.1548F, -0.1709F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(146, 124).addBox(-0.4608F, -0.9112F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(146, 121).addBox(-0.6358F, -0.9112F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0153F, 1.633F, -0.9205F, 0.0138F, 0.1548F, -0.1709F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(37, 140).addBox(-0.4608F, -1.574F, -0.4463F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.0153F, 1.633F, -0.9205F, -0.5534F, 0.1548F, -0.1709F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(11, 144).addBox(-0.4608F, -0.9779F, -0.0409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.0153F, 1.633F, -0.9205F, -0.6843F, 0.1548F, -0.1709F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(146, 118).addBox(-0.4939F, 0.3331F, -1.6288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, 0.443F, 0.1341F, -0.157F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(146, 115).addBox(-0.4919F, 0.6789F, -1.674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8151F, 2.0861F, 0.1923F, 0.1463F, 0.1341F, -0.157F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(140, 87).addBox(-0.5F, 0.0F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.1798F, 0.946F, 2.4876F, -0.364F, 0.1054F, -0.1958F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(133, 88).addBox(-1.0001F, -2.4037F, 0.1185F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5995F, 4.2273F, -1.9768F, 1.1543F, 0.1923F, -0.1577F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(47, 145).addBox(-0.5F, -2.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9501F, 5.0404F, -1.6317F, 0.4433F, 0.1361F, -0.1513F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(42, 145).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8046F, 4.9952F, -0.5018F, -0.0182F, 0.1323F, -0.1434F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(129, 68).addBox(-0.5F, -1.15F, -1.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0593F, 2.8822F, -0.0377F, 0.3397F, 0.1273F, -0.1479F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(89, 146).addBox(-0.7343F, -0.2501F, -1.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(146, 62).addBox(-0.7343F, -0.6251F, -1.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(89, 146).addBox(-0.7343F, -0.2501F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(146, 62).addBox(-0.7343F, -0.6251F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5802F, 6.3538F, -10.717F, -0.0723F, 0.8147F, -0.0255F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(146, 46).addBox(-1.0555F, -0.4515F, -0.9475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4302F, 6.3538F, -9.892F, 0.0093F, 0.1129F, 0.0114F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(146, 22).addBox(-0.3562F, -0.4594F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1302F, 6.3538F, -9.892F, 0.0337F, -0.0441F, 0.0114F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(146, 0).addBox(-0.3562F, -0.0027F, 0.5592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1302F, 6.3538F, -9.892F, 0.6009F, -0.0441F, 0.0114F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(111, 64).addBox(-0.7F, -0.625F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6452F, 5.9478F, -9.1088F, 0.6147F, -0.0867F, -0.0978F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(111, 32).addBox(-0.6F, -0.275F, -3.225F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5873F, 4.2054F, -7.4692F, 0.6844F, -0.0484F, -0.2234F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(143, 127).addBox(-0.7F, 0.025F, -0.9089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.2154F, -3.3642F, 0.891F, 0.0384F, 0.0475F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(57, 90).addBox(-0.5F, -1.125F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.1176F, 2.3829F, -4.9828F, 0.7052F, 0.1376F, -0.024F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(120, 11).addBox(-0.3163F, -1.975F, 0.0327F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.9605F, 0.4408F, -1.7249F, 0.9974F, 0.0272F, -0.0506F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(87, 84).addBox(-0.9982F, -1.3176F, -0.0348F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.3466F, -2.312F, -0.7125F, 1.2223F, 0.0043F, -0.1295F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(18, 129).addBox(-0.4566F, -0.8955F, -0.0943F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0135F, 0.9237F, -3.6324F, 0.8508F, 0.143F, -0.0056F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(138, 71).addBox(-0.5F, -0.8791F, -1.7174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-2.025F, -8.8533F, 0.2816F, 1.7017F, -0.288F, 0.1222F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(149, 52).addBox(-0.5F, -0.3448F, -0.1382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-2.025F, -8.8533F, 0.2816F, 2.7314F, -0.288F, 0.1222F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(57, 145).addBox(-0.9F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-2.0217F, -8.5955F, 1.5728F, 3.0515F, -0.1679F, 0.0927F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(149, 142).addBox(-0.9F, -1.2F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(119, 149).addBox(-0.9F, -1.7F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.6F, -3.1217F, 4.0691F, 2.8736F, 0.2241F, 0.2439F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(149, 145).addBox(-0.9F, -1.325F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(114, 149).addBox(-0.9F, -1.725F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.6F, -3.1217F, 4.0691F, 2.3849F, 0.2241F, 0.2439F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(67, 145).addBox(-0.9F, -1.775F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6F, -3.2217F, 3.9691F, 1.953F, 0.3291F, 0.0708F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(62, 145).addBox(-0.9F, -1.85F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6F, -3.2217F, 3.9691F, 1.5105F, 0.3257F, -0.0029F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(129, 128).addBox(0.0691F, -2.4996F, -1.8879F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3663F, -4.576F, 5.4092F, 1.1819F, 0.2594F, -0.1047F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(149, 148).addBox(-0.9F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0325F, -8.6503F, 3.3611F, 1.2837F, 0.1353F, 0.0469F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(145, 82).addBox(-0.475F, -1.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2814F, -7.6245F, 4.0798F, 1.2755F, 0.2691F, 0.006F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(145, 78).addBox(-0.5F, -1.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2814F, -7.6245F, 4.0798F, 1.2835F, 0.2958F, 0.0356F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(145, 74).addBox(-0.875F, -1.55F, 0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.6276F, -6.9461F, 5.0167F, 2.1561F, 0.2958F, 0.0356F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(72, 145).addBox(-0.875F, -1.8F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.6276F, -6.9461F, 5.0167F, 1.8245F, 0.2958F, 0.0356F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(145, 70).addBox(-0.875F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6276F, -6.9461F, 5.0167F, 1.3308F, 0.2755F, -0.0492F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(128, 133).addBox(-0.9F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6F, -5.6595F, 4.8067F, 1.326F, 0.2713F, -0.0668F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(3, 126).addBox(-0.5F, -3.1365F, -1.347F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.025F, -8.8533F, 0.2816F, 3.0456F, -0.288F, 0.1222F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(136, 5).addBox(-0.3F, -0.45F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8283F, 6.1906F, -9.9727F, -0.0547F, 1.0182F, -0.1171F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -1.4735F, -2.7839F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(138, 135).mirror().addBox(-0.5F, -0.7721F, 0.3058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.172F, 0.4899F, 2.4093F, -1.7791F, -0.1079F, 0.2084F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(59, 149).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.2674F, 0.1469F, 2.2026F, -1.7791F, -0.1079F, 0.2084F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(148, 127).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.1375F, 0.5293F, 2.6463F, -2.3027F, -0.1079F, 0.2084F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(127, 148).mirror().addBox(-0.5F, -0.45F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.2593F, 0.1663F, 2.239F, -1.2119F, -0.1079F, 0.2084F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(150, 9).mirror().addBox(-0.475F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2044F, 6.3839F, -10.6128F, -0.2281F, 0.207F, -0.1511F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(19, 150).mirror().addBox(-0.6F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0273F, 6.4177F, -10.9999F, -0.9582F, 1.3825F, -1.0454F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(150, 12).mirror().addBox(-0.925F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(150, 6).mirror().addBox(-0.625F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8486F, 6.2779F, -11.239F, -0.3372F, 0.8381F, -0.3584F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(150, 3).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0404F, 6.2471F, -11.2869F, -0.2638F, -0.5572F, 0.0384F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(109, 148).mirror().addBox(-0.55F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5988F, 6.3791F, -10.7963F, -0.2231F, -0.0057F, -0.1021F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(25, 131).mirror().addBox(-0.625F, -0.725F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.4148F, 0.7231F, 0.7287F, -0.1004F, -0.0918F, 0.1264F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.6419F, 4.5531F, -6.74F, 0.5539F, -0.0823F, 0.126F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(70, 120).mirror().addBox(-0.4973F, -1.6673F, -0.4153F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5974F, 3.9733F, -3.5613F, -0.1521F, -0.2001F, 0.0749F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(138, 79).mirror().addBox(-0.5098F, -0.7267F, -2.1168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5974F, 3.9733F, -3.5613F, 0.016F, -0.2043F, 0.0616F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(136, 115).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.8313F, 3.0073F, -4.6454F, 0.3893F, -0.1869F, 0.0256F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(64, 149).mirror().addBox(-0.5F, -0.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.2388F, 4.1751F, -6.9573F, 0.4766F, -0.1869F, 0.0256F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(136, 97).mirror().addBox(0.0358F, -1.4086F, -2.4372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1539F, 4.5596F, -4.1578F, 0.1711F, -0.1869F, 0.0256F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(104, 148).mirror().addBox(-0.025F, 0.575F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.9828F, -1.0076F, 1.1455F, -0.5218F, -0.0459F, 0.1065F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(27, 120).mirror().addBox(0.8119F, -0.9582F, -3.7958F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 0.5283F, 0.5808F, 0.1191F, -0.1366F, 0.1591F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(52, 140).mirror().addBox(-0.5F, -1.775F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6266F, 4.7545F, 0.9406F, 0.037F, -0.0115F, 0.1655F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(121, 130).mirror().addBox(0.4244F, -0.8359F, -2.5279F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1539F, 4.5596F, -4.1578F, 0.1021F, -0.1525F, -0.127F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(79, 144).mirror().addBox(-0.275F, -0.775F, -0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 4.4807F, -3.1618F, -0.0962F, -0.0695F, 0.0067F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(52, 145).mirror().addBox(-0.5061F, -1.9203F, -0.3439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(148, 16).mirror().addBox(-0.4928F, -2.069F, -0.5088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, -0.5431F, -0.1341F, 0.157F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(42, 140).mirror().addBox(-0.5061F, -0.9436F, -0.4347F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, -0.7526F, -0.1341F, 0.157F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(94, 148).mirror().addBox(-0.5061F, 0.9651F, 0.3395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, -1.1976F, -0.1341F, 0.157F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(82, 148).mirror().addBox(-0.5081F, 0.4024F, 0.14F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, -0.9358F, -0.1341F, 0.157F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(99, 149).mirror().addBox(-0.4877F, -1.4534F, 0.0699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(77, 148).mirror().addBox(-0.4877F, -1.4034F, 0.0699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, -0.4646F, -0.1341F, 0.157F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(110, 107).mirror().addBox(-0.5779F, -0.5497F, 0.038F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.3452F, 3.3783F, -6.0185F, 0.6082F, -0.1493F, 0.037F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(136, 67).mirror().addBox(-0.4928F, -0.2711F, -1.281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, 0.792F, -0.1341F, 0.157F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(67, 136).mirror().addBox(-0.4928F, -0.1031F, -0.8364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, 0.8793F, -0.1341F, 0.157F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(136, 26).mirror().addBox(-0.4928F, -0.1454F, -1.2386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, 0.9666F, -0.1341F, 0.157F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(23, 136).mirror().addBox(-0.4928F, -0.477F, -0.5174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, 1.0888F, -0.1341F, 0.157F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(69, 149).mirror().addBox(-0.4928F, -1.7311F, -0.1957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(87, 149).mirror().addBox(-0.4907F, -1.6192F, 0.319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, -0.2202F, -0.1341F, 0.157F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(148, 19).mirror().addBox(-0.4928F, -1.078F, 0.9057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, 0.7048F, -0.1341F, 0.157F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(9, 148).mirror().addBox(-0.4907F, -1.945F, -0.9698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, -1.0405F, -0.1341F, 0.157F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(144, 147).mirror().addBox(-0.5F, 0.106F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(135, 147).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8531F, 1.4981F, -0.005F, 3.0964F, -0.1137F, 0.2066F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(147, 108).mirror().addBox(-0.504F, -0.696F, -0.696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.1131F, 0.3869F, -0.1591F, 2.1146F, -0.1137F, 0.2066F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(147, 92).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1942F, 0.1883F, -0.4967F, 2.5858F, -0.1137F, 0.2066F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(144, 58).mirror().addBox(-0.5F, -1.7F, -0.7125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2368F, 0.2131F, -0.9062F, -3.1005F, -0.1125F, 0.1759F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(144, 54).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.2513F, 0.3231F, -1.2727F, -2.8551F, -0.1015F, 0.1645F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(144, 50).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.2301F, 0.9243F, -1.7587F, -2.0806F, -0.1548F, 0.1709F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(144, 42).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2598F, 0.5751F, -1.5658F, -2.4646F, -0.1548F, 0.1709F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(144, 38).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1752F, 1.313F, -1.8355F, -1.7664F, -0.1548F, 0.1709F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(144, 34).mirror().addBox(-0.5F, -1.525F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1155F, 1.5315F, -1.6964F, -1.7315F, -0.1548F, 0.1709F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(136, 9).mirror().addBox(-0.5F, -0.325F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.9909F, 2.2765F, -1.7219F, -1.9235F, -0.1548F, 0.1709F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(24, 147).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8634F, 2.8328F, -1.5227F, -1.5832F, -0.1548F, 0.1709F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(144, 30).mirror().addBox(-0.5392F, -0.3973F, -0.7454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.0153F, 1.633F, -0.9205F, -0.6407F, -0.1548F, 0.1709F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(19, 147).mirror().addBox(-0.5392F, 0.0712F, 0.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.0153F, 1.633F, -0.9205F, -1.4261F, -0.1548F, 0.1709F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(146, 139).mirror().addBox(-0.5392F, 0.2184F, 0.0702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(1.0153F, 1.633F, -0.9205F, -0.8589F, -0.1548F, 0.1709F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(146, 124).mirror().addBox(-0.5392F, -0.9112F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(146, 121).mirror().addBox(-0.3642F, -0.9112F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0153F, 1.633F, -0.9205F, 0.0138F, -0.1548F, 0.1709F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(37, 140).mirror().addBox(-0.5392F, -1.574F, -0.4463F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.0153F, 1.633F, -0.9205F, -0.5534F, -0.1548F, 0.1709F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(11, 144).mirror().addBox(-0.5392F, -0.9779F, -0.0409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.0153F, 1.633F, -0.9205F, -0.6843F, -0.1548F, 0.1709F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(146, 118).mirror().addBox(-0.5061F, 0.3331F, -1.6288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, 0.443F, -0.1341F, 0.157F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(146, 115).mirror().addBox(-0.5081F, 0.6789F, -1.674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 2.0861F, 0.1923F, 0.1463F, -0.1341F, 0.157F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(140, 87).mirror().addBox(-0.5F, 0.0F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.1798F, 0.946F, 2.4876F, -0.364F, -0.1054F, 0.1958F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(133, 88).mirror().addBox(0.0001F, -2.4037F, 0.1185F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5995F, 4.2273F, -1.9768F, 1.1543F, -0.1923F, 0.1577F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(47, 145).mirror().addBox(-0.5F, -2.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.9501F, 5.0404F, -1.6317F, 0.4433F, -0.1361F, 0.1513F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(42, 145).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8046F, 4.9952F, -0.5018F, -0.0182F, -0.1323F, 0.1434F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(129, 68).mirror().addBox(-0.5F, -1.15F, -1.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.0593F, 2.8822F, -0.0377F, 0.3397F, -0.1273F, 0.1479F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(89, 146).mirror().addBox(-0.2657F, -0.2501F, -1.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(146, 62).mirror().addBox(-0.2657F, -0.6251F, -1.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(89, 146).mirror().addBox(-0.2657F, -0.2501F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(146, 62).mirror().addBox(-0.2657F, -0.6251F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5802F, 6.3538F, -10.717F, -0.0723F, -0.8147F, 0.0255F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(146, 46).mirror().addBox(0.0555F, -0.4515F, -0.9475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4302F, 6.3538F, -9.892F, 0.0093F, -0.1129F, -0.0114F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(146, 22).mirror().addBox(-0.6438F, -0.4594F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1302F, 6.3538F, -9.892F, 0.0337F, 0.0441F, -0.0114F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(146, 0).mirror().addBox(-0.6438F, -0.0027F, 0.5592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1302F, 6.3538F, -9.892F, 0.6009F, 0.0441F, -0.0114F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(111, 64).mirror().addBox(-0.3F, -0.625F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.6452F, 5.9478F, -9.1088F, 0.6147F, 0.0867F, 0.0978F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(111, 32).mirror().addBox(-0.4F, -0.275F, -3.225F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5873F, 4.2054F, -7.4692F, 0.6844F, 0.0484F, 0.2234F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(143, 127).mirror().addBox(-0.3F, 0.025F, -0.9089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -0.2154F, -3.3642F, 0.891F, -0.0384F, -0.0475F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(57, 90).mirror().addBox(-0.5F, -1.125F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.1176F, 2.3829F, -4.9828F, 0.7052F, -0.1376F, 0.024F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(120, 11).mirror().addBox(-0.6837F, -1.975F, 0.0327F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.9605F, 0.4408F, -1.7249F, 0.9974F, -0.0272F, 0.0506F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(87, 84).mirror().addBox(-0.0018F, -1.3176F, -0.0348F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(1.3466F, -2.312F, -0.7125F, 1.2223F, -0.0043F, 0.1295F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(18, 129).mirror().addBox(-0.5434F, -0.8955F, -0.0943F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.0135F, 0.9237F, -3.6324F, 0.8508F, -0.143F, 0.0056F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(138, 71).mirror().addBox(-0.5F, -0.8791F, -1.7174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(2.025F, -8.8533F, 0.2816F, 1.7017F, 0.288F, -0.1222F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(149, 52).mirror().addBox(-0.5F, -0.3448F, -0.1382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(2.025F, -8.8533F, 0.2816F, 2.7314F, 0.288F, -0.1222F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(57, 145).mirror().addBox(-0.1F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(2.0217F, -8.5955F, 1.5728F, 3.0515F, 0.1679F, -0.0927F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(149, 142).mirror().addBox(-0.1F, -1.2F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(119, 149).mirror().addBox(-0.1F, -1.7F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.6F, -3.1217F, 4.0691F, 2.8736F, -0.2241F, -0.2439F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(149, 145).mirror().addBox(-0.1F, -1.325F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(114, 149).mirror().addBox(-0.1F, -1.725F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.6F, -3.1217F, 4.0691F, 2.3849F, -0.2241F, -0.2439F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(67, 145).mirror().addBox(-0.1F, -1.775F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6F, -3.2217F, 3.9691F, 1.953F, -0.3291F, -0.0708F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(62, 145).mirror().addBox(-0.1F, -1.85F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6F, -3.2217F, 3.9691F, 1.5105F, -0.3257F, 0.0029F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(129, 128).mirror().addBox(-1.0691F, -2.4996F, -1.8879F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3663F, -4.576F, 5.4092F, 1.1819F, -0.2594F, 0.1047F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(149, 148).mirror().addBox(-0.1F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.0325F, -8.6503F, 3.3611F, 1.2837F, -0.1353F, -0.0469F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(145, 82).mirror().addBox(-0.525F, -1.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2814F, -7.6245F, 4.0798F, 1.2755F, -0.2691F, -0.006F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(145, 78).mirror().addBox(-0.5F, -1.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2814F, -7.6245F, 4.0798F, 1.2835F, -0.2958F, -0.0356F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(145, 74).mirror().addBox(-0.125F, -1.55F, 0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.6276F, -6.9461F, 5.0167F, 2.1561F, -0.2958F, -0.0356F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(72, 145).mirror().addBox(-0.125F, -1.8F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.6276F, -6.9461F, 5.0167F, 1.8245F, -0.2958F, -0.0356F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(145, 70).mirror().addBox(-0.125F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6276F, -6.9461F, 5.0167F, 1.3308F, -0.2755F, 0.0492F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(128, 133).mirror().addBox(-0.1F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6F, -5.6595F, 4.8067F, 1.326F, -0.2713F, 0.0668F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(3, 126).mirror().addBox(-0.5F, -3.1365F, -1.347F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.025F, -8.8533F, 0.2816F, 3.0456F, 0.288F, -0.1222F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(136, 5).mirror().addBox(-0.7F, -0.45F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8283F, 6.1906F, -9.9727F, -0.0547F, -1.0182F, 0.1171F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.037F, -1.7743F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(150, 65).mirror().addBox(0.0312F, -2.377F, -1.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false)
				.texOffs(150, 25).mirror().addBox(0.0312F, -1.902F, -1.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-1.2773F, -0.722F, -9.0306F, 1.2254F, -0.2358F, 0.1028F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(138, 83).mirror().addBox(-0.2954F, -2.6347F, -0.7927F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.259F)).mirror(false), PartPose.offsetAndRotation(-1.2773F, -0.722F, -9.0306F, 1.4967F, 0.0524F, 0.0007F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(134, 0).mirror().addBox(-0.2954F, -2.6039F, -0.2543F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-1.2773F, -0.722F, -9.0306F, 1.7105F, 0.0524F, 0.0007F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(24, 150).mirror().addBox(0.3477F, -2.4237F, -5.928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, 0.2662F, 0.0524F, 0.0007F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(137, 42).mirror().addBox(-0.4146F, 0.7656F, -1.0862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -0.353F, -0.7769F, -1.626F, -0.2213F, 0.141F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(44, 149).mirror().addBox(-0.4146F, 0.2592F, -2.2626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -0.353F, -0.7769F, -1.1897F, -0.2213F, 0.141F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(149, 42).mirror().addBox(-0.4146F, 0.9768F, -0.6613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -0.353F, -0.7769F, -1.8006F, -0.2213F, 0.141F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(149, 39).mirror().addBox(-0.0783F, -1.2392F, -4.7682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, 0.0347F, -0.0844F, 0.03F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(39, 149).mirror().addBox(0.3727F, -3.3409F, -6.4545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, 0.4495F, 0.0524F, 0.0007F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(149, 36).mirror().addBox(0.3477F, -4.0012F, -5.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, 0.5629F, 0.0524F, 0.0007F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(34, 149).mirror().addBox(0.5462F, -2.5092F, -5.1702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, 0.3231F, 0.0527F, 0.0033F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(149, 33).mirror().addBox(-0.0783F, -0.507F, -3.9439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, -0.1573F, -0.0844F, 0.03F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(149, 30).mirror().addBox(-0.0783F, -0.3518F, -2.9904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, -0.2097F, -0.0844F, 0.03F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(137, 38).mirror().addBox(-0.0783F, -0.144F, -2.023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, -0.3144F, -0.0844F, 0.03F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(125, 22).mirror().addBox(-0.508F, 0.5411F, -2.6086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -0.353F, -0.7769F, -0.4991F, -0.2508F, 0.0611F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(29, 149).mirror().addBox(-0.508F, 0.3592F, -0.6344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -0.353F, -0.7769F, 0.4974F, -0.2967F, 0.0873F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(137, 34).mirror().addBox(-0.1F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3299F, 0.7406F, -0.2081F, 0.6512F, -0.162F, 0.1722F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(69, 131).mirror().addBox(0.2175F, -0.4654F, -2.9558F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, -0.2707F, -0.0857F, 0.0219F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(84, 144).mirror().addBox(0.3175F, -0.9634F, -4.8192F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, -0.0962F, -0.0857F, 0.0219F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(137, 30).mirror().addBox(0.5462F, -0.3559F, -5.6175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, -0.0696F, 0.0527F, 0.0033F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(125, 17).mirror().addBox(-0.0783F, 0.2622F, -4.862F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, -0.2184F, -0.0844F, 0.03F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(30, 137).mirror().addBox(0.4477F, -1.1345F, -6.4789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, 0.1048F, 0.0524F, 0.0007F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(109, 21).mirror().addBox(-0.2954F, -1.8671F, -2.479F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false), PartPose.offsetAndRotation(-1.2773F, -0.722F, -9.0306F, 0.6415F, 0.0524F, 0.0007F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(0, 149).mirror().addBox(0.4227F, -0.2627F, -7.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, -0.0043F, 0.0524F, 0.0007F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(148, 133).mirror().addBox(0.4227F, -1.869F, -6.9329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, 0.2313F, 0.0524F, 0.0007F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(136, 123).mirror().addBox(-0.508F, 0.512F, -0.9286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -0.353F, -0.7769F, -0.0175F, -0.2967F, 0.0873F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(124, 92).mirror().addBox(-0.0783F, 0.6148F, -3.4485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.8198F, -2.5741F, -0.3755F, -0.0844F, 0.03F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(136, 119).mirror().addBox(-0.3391F, 0.7206F, -2.4329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -0.353F, -0.7769F, -0.3316F, -0.1745F, 0.0873F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(137, 42).addBox(-0.5854F, 0.7656F, -1.0862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6313F, -0.353F, -0.7769F, -1.626F, 0.2213F, -0.141F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(44, 149).addBox(-0.5854F, 0.2592F, -2.2626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6313F, -0.353F, -0.7769F, -1.1897F, 0.2213F, -0.141F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(149, 42).addBox(-0.5854F, 0.9768F, -0.6613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.6313F, -0.353F, -0.7769F, -1.8006F, 0.2213F, -0.141F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(149, 39).addBox(-0.9217F, -1.2392F, -4.7682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, 0.0347F, 0.0844F, -0.03F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(39, 149).addBox(-1.3727F, -3.3409F, -6.4545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, 0.4495F, -0.0524F, -0.0007F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(24, 150).addBox(-1.3477F, -2.4237F, -5.928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, 0.2662F, -0.0524F, -0.0007F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(149, 36).addBox(-1.3477F, -4.0012F, -5.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, 0.5629F, -0.0524F, -0.0007F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(34, 149).addBox(-1.5462F, -2.5092F, -5.1702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, 0.3231F, -0.0527F, -0.0033F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(149, 33).addBox(-0.9217F, -0.507F, -3.9439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, -0.1573F, 0.0844F, -0.03F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(149, 30).addBox(-0.9217F, -0.3518F, -2.9904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, -0.2097F, 0.0844F, -0.03F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(137, 38).addBox(-0.9217F, -0.144F, -2.023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, -0.3144F, 0.0844F, -0.03F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(125, 22).addBox(-0.492F, 0.5411F, -2.6086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.6313F, -0.353F, -0.7769F, -0.4991F, 0.2508F, -0.0611F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(29, 149).addBox(-0.492F, 0.3592F, -0.6344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6313F, -0.353F, -0.7769F, 0.4974F, 0.2967F, -0.0873F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(137, 34).addBox(-0.9F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3299F, 0.7406F, -0.2081F, 0.6512F, 0.162F, -0.1722F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(69, 131).addBox(-0.2175F, -0.4654F, -2.9558F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, -0.2707F, 0.0857F, -0.0219F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(84, 144).addBox(-0.3175F, -0.9634F, -4.8192F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, -0.0962F, 0.0857F, -0.0219F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(137, 30).addBox(-1.5462F, -0.3559F, -5.6175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, -0.0696F, -0.0527F, -0.0033F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(125, 17).addBox(-0.9217F, 0.2622F, -4.862F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, -0.2184F, 0.0844F, -0.03F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(30, 137).addBox(-1.4477F, -1.1345F, -6.4789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, 0.1048F, -0.0524F, -0.0007F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(134, 0).addBox(-1.7046F, -2.6039F, -0.2543F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(1.2773F, -0.722F, -9.0306F, 1.7105F, -0.0524F, -0.0007F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(150, 65).addBox(-1.0312F, -2.377F, -1.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F))
				.texOffs(150, 25).addBox(-1.0312F, -1.902F, -1.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(1.2773F, -0.722F, -9.0306F, 1.2254F, 0.2358F, -0.1028F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(138, 83).addBox(-1.7046F, -2.6347F, -0.7927F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(1.2773F, -0.722F, -9.0306F, 1.4967F, -0.0524F, -0.0007F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(109, 21).addBox(-1.7046F, -1.8671F, -2.479F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(1.2773F, -0.722F, -9.0306F, 0.6415F, -0.0524F, -0.0007F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(0, 149).addBox(-1.4227F, -0.2627F, -7.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, -0.0043F, -0.0524F, -0.0007F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(148, 133).addBox(-1.4227F, -1.869F, -6.9329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, 0.2313F, -0.0524F, -0.0007F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(136, 123).addBox(-0.492F, 0.512F, -0.9286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6313F, -0.353F, -0.7769F, -0.0175F, 0.2967F, -0.0873F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(124, 92).addBox(-0.9217F, 0.6148F, -3.4485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.525F, -0.8198F, -2.5741F, -0.3755F, 0.0844F, -0.03F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(136, 119).addBox(-0.6609F, 0.7206F, -2.4329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6313F, -0.353F, -0.7769F, -0.3316F, 0.1745F, -0.0873F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 8.6532F, -1.8449F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r534 = bone2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(131, 78).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4417F, 10.5208F, -2.5413F, 1.2459F, 0.144F, 1.1561F));

		PartDefinition cube_r535 = bone2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(47, 140).addBox(-0.5F, -1.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3555F, 10.2023F, -4.3126F, 1.5514F, 0.144F, 1.1561F));

		PartDefinition cube_r536 = bone2.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(115, 84).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.7929F, 11.8347F, -3.5603F, 3.0349F, 0.144F, 1.1561F));

		PartDefinition cube_r537 = bone2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(130, 57).addBox(-0.5F, -0.075F, -2.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2215F, 9.9572F, -5.4881F, 1.8132F, 0.144F, 1.1561F));

		PartDefinition cube_r538 = bone2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(127, 46).addBox(-1.2157F, -1.2122F, -1.5822F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.1146F, -4.1438F, 1.4331F, 0.0759F, 0.5009F));

		PartDefinition cube_r539 = bone2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(150, 80).addBox(-0.5F, 0.2064F, -0.1542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.275F, 8.8704F, -2.6625F, 2.0508F, 0.0F, 0.192F));

		PartDefinition cube_r540 = bone2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(115, 70).addBox(-0.5F, -1.4F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 7.2112F, -3.6026F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r541 = bone2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(126, 108).addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.6328F, -2.6832F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r542 = bone2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(118, 54).addBox(-0.5F, -3.4151F, -0.96F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r543 = bone2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(13, 96).addBox(-0.5F, -0.0317F, -5.0241F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.5624F, -1.1989F, 1.0341F, 0.0F, 0.0F));

		PartDefinition cube_r544 = bone2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(87, 75).addBox(-0.5F, -1.9556F, -0.6313F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2235F, 2.3472F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r545 = bone2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(83, 34).addBox(-0.5F, -1.9556F, -0.6313F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.0191F, -1.8954F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r546 = bone2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(150, 77).addBox(-0.5F, -0.1551F, 1.5503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r547 = bone2.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(145, 89).addBox(-0.5F, 0.4886F, 1.2976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r548 = bone2.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(18, 142).addBox(-0.5F, -1.1841F, 1.4328F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r549 = bone2.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(57, 80).addBox(-0.5F, -1.7899F, -4.4255F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.9076F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 8.6532F, -1.8449F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r550 = bone3.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(131, 78).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4417F, 10.5208F, -2.5413F, 1.2459F, -0.144F, -1.1561F));

		PartDefinition cube_r551 = bone3.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(47, 140).mirror().addBox(-0.5F, -1.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3555F, 10.2023F, -4.3126F, 1.5514F, -0.144F, -1.1561F));

		PartDefinition cube_r552 = bone3.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(115, 84).mirror().addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.7929F, 11.8347F, -3.5603F, 3.0349F, -0.144F, -1.1561F));

		PartDefinition cube_r553 = bone3.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(130, 57).mirror().addBox(-0.5F, -0.075F, -2.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.2215F, 9.9572F, -5.4881F, 1.8132F, -0.144F, -1.1561F));

		PartDefinition cube_r554 = bone3.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(127, 46).mirror().addBox(0.2157F, -1.2122F, -1.5822F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 9.1146F, -4.1438F, 1.4331F, -0.0759F, -0.5009F));

		PartDefinition cube_r555 = bone3.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(150, 80).mirror().addBox(-0.5F, 0.2064F, -0.1542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.275F, 8.8704F, -2.6625F, 2.0508F, 0.0F, -0.192F));

		PartDefinition cube_r556 = bone3.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(115, 70).mirror().addBox(-0.5F, -1.4F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2112F, -3.6026F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r557 = bone3.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(126, 108).mirror().addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.6328F, -2.6832F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r558 = bone3.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(118, 54).mirror().addBox(-0.5F, -3.4151F, -0.96F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r559 = bone3.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(13, 96).mirror().addBox(-0.5F, -0.0317F, -5.0241F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5624F, -1.1989F, 1.0341F, 0.0F, 0.0F));

		PartDefinition cube_r560 = bone3.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(87, 75).mirror().addBox(-0.5F, -1.9556F, -0.6313F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2235F, 2.3472F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r561 = bone3.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(83, 34).mirror().addBox(-0.5F, -1.9556F, -0.6313F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0191F, -1.8954F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r562 = bone3.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(150, 77).mirror().addBox(-0.5F, -0.1551F, 1.5503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r563 = bone3.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(145, 89).mirror().addBox(-0.5F, 0.4886F, 1.2976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r564 = bone3.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(18, 142).mirror().addBox(-0.5F, -1.1841F, 1.4328F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r565 = bone3.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(57, 80).mirror().addBox(-0.5F, -1.7899F, -4.4255F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.905F, 2.8962F, 0.9076F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5484F, 18.3355F, -5.8512F, 0.9324F, 0.0055F, 0.0275F));

		PartDefinition cube_r566 = leftArm.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(94, 145).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 10.4558F, 0.6378F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r567 = leftArm.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(53, 135).addBox(-0.5F, 0.2429F, -0.713F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0263F, 7.9997F, 0.3661F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r568 = leftArm.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(140, 105).addBox(-0.5F, 0.2429F, 0.037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 7.9997F, 0.3661F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r569 = leftArm.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(94, 130).addBox(-0.5F, -2.4618F, -0.6581F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 6.9997F, -0.234F, 0.4012F, 0.0043F, 0.0036F));

		PartDefinition cube_r570 = leftArm.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(39, 73).addBox(-0.5F, -3.2618F, -0.0581F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0263F, 6.9997F, -0.234F, 0.5059F, 0.0043F, 0.0036F));

		PartDefinition cube_r571 = leftArm.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(96, 16).addBox(-0.5331F, -1.0345F, -4.9974F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1963F, 4.1732F, -2.1486F, -2.1128F, -0.2101F, -0.0393F));

		PartDefinition cube_r572 = leftArm.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(87, 130).addBox(-0.5442F, 0.0446F, -1.2274F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0073F, 3.5855F, -1.8274F, 0.1571F, -0.4157F, -0.2472F));

		PartDefinition cube_r573 = leftArm.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(113, 139).addBox(-0.6442F, 0.1525F, -2.3666F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0073F, 3.5855F, -1.8274F, 1.117F, -0.4157F, -0.2472F));

		PartDefinition cube_r574 = leftArm.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(62, 130).addBox(-0.4872F, -2.9717F, -3.1697F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0095F, 3.1187F, -0.6305F, -1.0488F, 0.0179F, -0.143F));

		PartDefinition cube_r575 = leftArm.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(108, 139).addBox(-0.4872F, -2.7765F, -0.648F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0095F, 3.1187F, -0.6305F, -0.4816F, 0.0179F, -0.143F));

		PartDefinition cube_r576 = leftArm.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(86, 139).addBox(-0.4878F, -2.9992F, -0.5554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 5.8936F, -0.2438F, 0.1293F, 0.0179F, -0.0033F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(60, 109).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(44, 105).addBox(-0.5909F, 0.8921F, -1.4717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.89F, 10.3795F, 0.7985F, -1.9603F, 0.0933F, -0.836F));

		PartDefinition cube_r577 = leftArm2.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(99, 130).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(36, 123).addBox(-0.6767F, 0.049F, -0.5433F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1687F, 11.7783F, -0.4397F, 0.2545F, 0.3983F, 0.157F));

		PartDefinition cube_r578 = leftArm3.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(49, 149).addBox(10.8848F, 1.1221F, -11.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(145, 105).addBox(10.7848F, 1.7221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-11.4616F, 8.1729F, 10.4465F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r579 = leftArm3.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(64, 8).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, -0.951F, -0.5433F, -0.0785F, 0.0F, 0.0F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(135, 105).addBox(-0.5945F, 1.0179F, -0.9517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1322F, -0.8271F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5484F, 18.3355F, -5.8512F, 1.5826F, -0.2952F, -0.3772F));

		PartDefinition cube_r580 = rightArm.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(150, 68).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 10.4558F, 0.6378F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r581 = rightArm.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(60, 135).addBox(-0.5F, 0.2429F, -0.713F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0263F, 7.9997F, 0.3661F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r582 = rightArm.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(141, 0).addBox(-0.5F, 0.2429F, 0.037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 7.9997F, 0.3661F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r583 = rightArm.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(18, 135).addBox(-0.5F, -2.4618F, -0.6581F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 6.9997F, -0.234F, 0.4012F, -0.0043F, -0.0036F));

		PartDefinition cube_r584 = rightArm.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(8, 135).addBox(-0.5F, -3.2618F, -0.0581F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0263F, 6.9997F, -0.234F, 0.5059F, -0.0043F, -0.0036F));

		PartDefinition cube_r585 = rightArm.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(26, 96).addBox(-0.4669F, -1.0345F, -4.9974F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1963F, 4.1732F, -2.1486F, -2.1128F, 0.2101F, 0.0393F));

		PartDefinition cube_r586 = rightArm.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(134, 21).addBox(-0.4558F, 0.0446F, -1.2274F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0073F, 3.5855F, -1.8274F, 0.1571F, 0.4157F, 0.2472F));

		PartDefinition cube_r587 = rightArm.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(67, 140).addBox(-0.3558F, 0.1525F, -2.3666F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0073F, 3.5855F, -1.8274F, 1.117F, 0.4157F, 0.2472F));

		PartDefinition cube_r588 = rightArm.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(134, 16).addBox(-0.5128F, -2.9717F, -3.1697F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0095F, 3.1187F, -0.6305F, -1.0488F, -0.0179F, 0.143F));

		PartDefinition cube_r589 = rightArm.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(62, 140).addBox(-0.5128F, -2.7765F, -0.648F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0095F, 3.1187F, -0.6305F, -0.4816F, -0.0179F, 0.143F));

		PartDefinition cube_r590 = rightArm.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(57, 140).addBox(-0.5122F, -2.9992F, -0.5554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 5.8936F, -0.2438F, 0.1293F, -0.0179F, 0.0033F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(22, 112).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(83, 107).addBox(-0.4091F, 0.8921F, -1.4717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.89F, 10.3795F, 0.7985F, -1.1905F, 0.6988F, 1.7971F));

		PartDefinition cube_r591 = rightArm2.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(134, 46).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(10, 126).addBox(-0.3233F, 0.049F, -0.5433F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1687F, 11.7783F, -0.4397F, 0.2545F, -0.3983F, -0.157F));

		PartDefinition cube_r592 = rightArm3.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(150, 74).addBox(-11.8848F, 1.1221F, -11.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(150, 71).addBox(-11.7848F, 1.7221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(11.4616F, 8.1729F, 10.4465F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r593 = rightArm3.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(33, 88).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, -0.951F, -0.5433F, -0.0785F, 0.0F, 0.0F));

		PartDefinition opposablePinkie4 = rightArm3.addOrReplaceChild("opposablePinkie4", CubeListBuilder.create().texOffs(127, 138).addBox(-0.4055F, 1.0179F, -0.9517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1322F, -0.8271F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7049F, 10.2252F, -0.1762F, 0.0738F, 0.0379F));

		PartDefinition cube_r594 = tail.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(112, 130).addBox(0.0F, -6.5908F, 0.0315F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7717F, 11.0267F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r595 = tail.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(127, 52).addBox(0.0F, -6.8258F, 0.0329F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8717F, 9.0267F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r596 = tail.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(84, 126).addBox(0.0F, -7.1607F, 0.0344F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9717F, 7.0267F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r597 = tail.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(15, 126).addBox(0.0F, -7.3956F, 0.0341F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9717F, 5.0267F, -0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r598 = tail.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(0, 125).addBox(0.0F, -8.1803F, -0.0808F, 0.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9717F, 1.1267F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r599 = tail.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(23, 78).addBox(0.0F, -7.8305F, 0.0338F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9717F, 3.0267F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r600 = tail.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(35, 4).mirror().addBox(-3.0F, -0.1047F, 1.9991F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0681F, -0.957F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition cube_r601 = tail.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(35, 4).addBox(0.0F, -0.1047F, 1.9991F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0681F, -0.957F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition cube_r602 = tail.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9283F, -2.9733F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r603 = tail.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(109, 130).addBox(0.0F, -1.0886F, -0.2887F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1482F, 10.6931F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r604 = tail.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(132, 138).addBox(0.0F, -0.5618F, -0.0769F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1482F, 7.6931F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r605 = tail.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(118, 60).addBox(0.0F, 0.0322F, -0.1986F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1482F, 5.2931F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 22).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2717F, 12.0267F, -0.2427F, 0.3153F, 0.0356F));

		PartDefinition cube_r606 = tail2.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(118, 130).addBox(0.0F, -6.5F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r607 = tail2.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(135, 133).addBox(0.0F, -5.2F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 11.0F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r608 = tail2.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(124, 135).addBox(0.0F, -5.6F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 9.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r609 = tail2.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(121, 135).addBox(0.0F, -5.8F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r610 = tail2.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(102, 135).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r611 = tail2.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(115, 130).addBox(0.0F, -6.2F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r612 = tail2.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(29, 38).mirror().addBox(-3.0F, 0.0F, 0.2F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3721F, 0.4F, 0.7995F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r613 = tail2.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(29, 38).addBox(0.0F, 0.0F, 0.2F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3721F, 0.4F, 0.7995F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r614 = tail2.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(135, 141).addBox(0.0F, -0.5182F, -0.2386F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 11.2858F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r615 = tail2.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(118, 139).addBox(0.0F, -1.3578F, -0.4952F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 9.0858F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r616 = tail2.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(34, 141).addBox(0.0F, 0.1554F, -0.3556F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 6.3868F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r617 = tail2.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(91, 139).addBox(0.0F, 0.2636F, -0.1492F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2199F, 3.2664F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r618 = tail2.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(0, 136).addBox(0.0F, -0.1989F, -0.1464F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4199F, 0.8664F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, -0.242F, 0.2405F, 0.127F));

		PartDefinition cube_r619 = tail3.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(141, 143).addBox(0.0F, -3.5184F, 0.0368F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 12.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r620 = tail3.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(124, 143).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r621 = tail3.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(143, 121).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r622 = tail3.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(26, 140).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r623 = tail3.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(23, 140).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r624 = tail3.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(3, 140).addBox(0.0F, -4.6F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r625 = tail3.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(138, 139).addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r626 = tail3.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(114, 144).addBox(0.0F, -1.2314F, -0.388F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2919F, 12.8423F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r627 = tail3.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(0, 144).addBox(0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2919F, 9.8423F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r628 = tail3.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(83, 75).addBox(0.0F, -0.1F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.34F, 7.5956F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r629 = tail3.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(121, 143).addBox(0.0F, -0.6F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2764F, 5.1551F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r630 = tail3.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(143, 115).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0754F, 3.1034F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r631 = tail3.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(101, 143).addBox(0.0F, -0.0477F, -0.1361F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 0.3858F, 0.8116F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(70, 8).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, -0.1422F, 0.2171F, -0.0194F));

		PartDefinition cube_r632 = tail4.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(16, 146).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r633 = tail4.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(6, 146).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r634 = tail4.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(132, 145).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r635 = tail4.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(145, 131).addBox(0.0F, -3.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r636 = tail4.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(74, 149).addBox(0.0F, -0.4606F, -0.1148F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5525F, 5.6858F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r637 = tail4.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(76, 131).addBox(0.0F, -0.4247F, 0.0239F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9525F, 3.3858F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r638 = tail4.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(18, 120).addBox(0.0F, -0.2324F, -0.1146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1525F, 1.2858F, 0.672F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(45, 70).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0094F, 8.0654F, 0.0869F, 0.1203F, 0.1407F));

		PartDefinition cube_r639 = tail5.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(135, 150).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2992F, 8.0238F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r640 = tail5.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(132, 150).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5692F, 5.8041F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r641 = tail5.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(150, 105).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.589F, 3.4188F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r642 = tail5.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(150, 99).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7756F, 1.1439F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r643 = tail5.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(150, 87).addBox(0.0F, -1.2821F, -0.1145F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r644 = tail5.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(150, 83).addBox(0.0F, -1.4989F, -0.1474F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r645 = tail5.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(140, 149).addBox(0.0F, -1.7156F, -0.0802F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r646 = tail5.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(124, 149).addBox(0.0F, -2.0324F, -0.1131F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.4974F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(64, 70).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0352F, 0.212F, 0.182F));

		PartDefinition cube_r647 = tail6.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(146, 150).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1032F, 1.8723F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r648 = tail6.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(151, 22).addBox(0.0F, -2.0907F, 3.6205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 150).addBox(0.0F, -1.5907F, 1.7205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 136).addBox(0.0F, -0.9907F, -0.0795F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(52, 59).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0244F, -0.1318F, 0.0259F));

		return LayerDefinition.create(meshdefinition, 156, 156);
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