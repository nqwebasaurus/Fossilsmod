package fossils.fossils.client.blockentity.model.corythosauruscasuarius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CorythosauruscasuariusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart neck;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public CorythosauruscasuariusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
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
		this.neck = this.neck6.getChild("neck");
		this.heads = this.neck.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -42.4004F, 1.7863F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(92, 54).mirror().addBox(-0.2171F, 2.6005F, 0.7544F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 54).addBox(5.7829F, 2.6005F, 0.7544F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7829F, -2.1205F, 6.6377F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-4.0F, 2.6F, 1.8F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 24).addBox(1.0F, 2.6F, 1.8F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0114F, -2.0615F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(51, 24).mirror().addBox(-3.916F, -0.1946F, 2.4166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.407F, -5.3935F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.1F, 1.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(108, 121).addBox(-0.002F, -6.6674F, -0.3453F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3059F, 6.9411F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(105, 41).addBox(-0.002F, 5.1326F, -1.4453F, 0.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.6316F, 5.0419F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 118).addBox(-0.006F, 4.9296F, -0.1333F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.5316F, -2.8581F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 24).addBox(-0.084F, -0.1946F, 2.4166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.407F, -5.3935F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 73).addBox(0.0F, -0.0183F, 0.0774F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4802F, -2.7602F, 0.0087F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.7829F, -1.6205F, 1.1377F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(100, 16).addBox(-0.4102F, -0.6818F, -0.5815F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3053F, 6.1263F, -4.8131F, -0.4696F, -0.1912F, -0.0169F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(111, 146).addBox(-0.5413F, -0.3005F, 0.5721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, 0.5291F, 0.2871F, -0.0871F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(138, 117).addBox(-0.5F, -2.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9843F, 1.7853F, 7.2246F, 1.4541F, 0.2871F, -0.0871F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(116, 146).addBox(-0.5F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.299F, 1.5381F, 8.3595F, 0.6163F, 0.2871F, -0.0871F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(146, 105).addBox(-0.5413F, -0.0505F, 0.5721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, 0.6163F, 0.2871F, -0.0871F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(107, 137).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1537F, 2.8216F, 1.6444F, -0.0857F, 0.1966F, -0.0726F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(136, 50).addBox(-0.5635F, -1.2766F, -4.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, 0.4815F, 0.1966F, -0.0726F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(104, 8).addBox(-0.5635F, -1.0766F, -4.2466F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, -0.0421F, 0.1966F, -0.0726F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(54, 112).addBox(-1.7419F, 0.0664F, 1.091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8F, -1.1F, -0.4907F, 0.2009F, -0.1062F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(61, 105).addBox(-0.5635F, -1.1558F, -4.173F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, -0.2341F, 0.1966F, -0.0726F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(37, 94).addBox(-0.5412F, -1.1338F, -0.9392F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, -0.0905F, 0.2871F, -0.0871F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(110, 85).addBox(-2.0346F, 0.0664F, 0.8029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7F, -2.8F, -1.1F, -0.454F, 0.4294F, -0.2004F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(13, 77).addBox(-1.4829F, -0.0053F, 0.178F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8F, -1.1F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(121, 41).addBox(-1.0815F, 0.2017F, -0.4324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8F, -1.1F, -0.3592F, 0.08F, -0.0349F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 117).addBox(-0.5F, -1.0F, -1.825F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2182F, -0.5057F, -2.561F, -0.7596F, -0.1308F, 0.0057F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(69, 84).addBox(-0.7007F, -0.0863F, -2.9859F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.186F, -2.6442F, -1.1732F, -0.0789F, -0.1308F, 0.0057F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(132, 32).addBox(-0.5F, -1.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5832F, 0.4199F, -8.9054F, 0.3525F, -0.1301F, 0.0149F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(109, 133).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.774F, 0.5911F, -10.3834F, 0.5837F, -0.1301F, 0.0149F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(121, 85).addBox(-0.3329F, 0.0408F, -3.0092F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.205F, -2.1169F, -7.0475F, 0.3917F, -0.1301F, 0.0149F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(19, 125).addBox(-0.7001F, -0.0183F, -2.9476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2146F, -2.9365F, -4.1956F, 0.3045F, -0.1301F, 0.0149F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(88, 60).addBox(-0.5F, -0.2F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0988F, -1.6607F, -4.9989F, 0.2696F, -0.1301F, 0.0149F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(97, 90).addBox(-0.5F, -0.3F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2691F, 5.5173F, -8.8834F, 0.4635F, -0.1301F, -0.0149F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(129, 62).addBox(-0.5F, -2.15F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.7622F, 6.7194F, -11.7455F, -1.1248F, -0.1301F, -0.0149F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(119, 91).addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5469F, 4.3666F, -10.3669F, -2.0062F, -0.1301F, -0.0149F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(123, 31).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2398F, 3.7978F, -7.4948F, -0.3248F, -0.1273F, 0.0307F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(113, 66).addBox(-0.5F, -1.4F, -1.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5108F, 4.0311F, -9.6679F, -0.5866F, -0.1273F, 0.0307F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 140).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5752F, 3.3351F, -10.0035F, 0.4867F, -0.1273F, 0.0307F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 105).addBox(-0.5F, -0.8F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0451F, 4.9223F, -6.1467F, -0.0375F, -0.1241F, 0.0417F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(40, 121).addBox(-0.525F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.4928F, 14.3855F, 15.8659F, -1.3004F, -0.0361F, 0.0097F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(125, 36).addBox(-0.5F, -0.5F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4928F, 14.3855F, 15.8659F, -0.8641F, -0.0361F, 0.0097F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(63, 93).addBox(-0.4994F, -0.5692F, -0.0756F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.5201F, 13.9411F, 16.7243F, -0.5849F, -0.0361F, 0.0097F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(119, 132).addBox(-0.5F, -1.15F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5207F, 13.8257F, 16.7578F, -0.5822F, 0.0208F, -0.0302F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(146, 102).addBox(-0.4979F, -1.0652F, -0.751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5201F, 13.9411F, 16.7243F, -1.2803F, 0.0208F, -0.0302F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(87, 82).addBox(0.0985F, -0.6587F, -0.0494F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.9992F, 10.6028F, 10.5804F, -0.5115F, -0.0294F, -0.0013F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(89, 8).addBox(0.0985F, -0.7819F, -0.561F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.9992F, 10.6028F, 10.5804F, -0.3893F, -0.0294F, -0.0013F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(87, 74).addBox(-1.3304F, -0.2542F, 0.032F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0001F, 7.9473F, 5.6662F, -0.395F, -0.2918F, 0.0075F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(77, 50).addBox(-1.3304F, -0.5867F, 0.0662F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0001F, 7.9473F, 5.6662F, -0.4299F, -0.2918F, 0.0075F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(137, 25).addBox(-0.5F, 0.1F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.713F, 8.5727F, 4.4034F, -1.0616F, -0.1395F, -0.0876F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(15, 95).addBox(-0.5F, -0.2F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6583F, 7.3322F, 3.2423F, -0.3198F, -0.1395F, -0.0876F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(92, 47).addBox(-0.6838F, -1.7134F, 1.4673F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0001F, 6.4473F, -0.6588F, -0.4071F, -0.1395F, -0.0876F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(11, 111).addBox(-1.0836F, -0.5568F, -0.0631F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1352F, 9.0461F, 3.2706F, -0.3823F, -0.1912F, -0.0169F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(97, 97).addBox(-1.0836F, -0.5568F, -0.0631F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3053F, 7.9263F, -1.1131F, -0.2427F, -0.1912F, -0.0169F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(37, 132).addBox(-0.6618F, -3.4073F, -1.4283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0001F, 6.4473F, -0.6588F, -1.1567F, -0.1321F, -0.0532F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(107, 52).addBox(-0.2355F, -2.9778F, 1.0438F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0001F, 6.4473F, -0.6588F, -0.7284F, -0.2438F, -0.1037F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(95, 125).addBox(-0.7829F, 0.0081F, 0.0062F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.8441F, -2.8808F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(62, 43).addBox(-0.7829F, -0.2919F, -2.0938F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.7829F, -1.6205F, 1.1377F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(100, 16).mirror().addBox(-0.5898F, -0.6818F, -0.5815F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3053F, 6.1263F, -4.8131F, -0.4696F, 0.1912F, 0.0169F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(111, 146).mirror().addBox(-0.4587F, -0.3005F, 0.5721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0091F, 6.5452F, 0.5291F, -0.2871F, 0.0871F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(138, 117).mirror().addBox(-0.5F, -2.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9843F, 1.7853F, 7.2246F, 1.4541F, -0.2871F, 0.0871F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(116, 146).mirror().addBox(-0.5F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.299F, 1.5381F, 8.3595F, 0.6163F, -0.2871F, 0.0871F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(146, 105).mirror().addBox(-0.4587F, -0.0505F, 0.5721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0091F, 6.5452F, 0.6163F, -0.2871F, 0.0871F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(107, 137).mirror().addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1537F, 2.8216F, 1.6444F, -0.0857F, -0.1966F, 0.0726F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(136, 50).mirror().addBox(-0.4365F, -1.2766F, -4.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0091F, 6.5452F, 0.4815F, -0.1966F, 0.0726F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(104, 8).mirror().addBox(-0.4365F, -1.0766F, -4.2466F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0091F, 6.5452F, -0.0421F, -0.1966F, 0.0726F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(54, 112).mirror().addBox(0.7419F, 0.0664F, 1.091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.8F, -1.1F, -0.4907F, -0.2009F, 0.1062F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(61, 105).mirror().addBox(-0.4365F, -1.1558F, -4.173F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0091F, 6.5452F, -0.2341F, -0.1966F, 0.0726F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(37, 94).mirror().addBox(-0.4588F, -1.1338F, -0.9392F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0091F, 6.5452F, -0.0905F, -0.2871F, 0.0871F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(110, 85).mirror().addBox(1.0346F, 0.0664F, 0.8029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.8F, -1.1F, -0.454F, -0.4294F, 0.2004F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(13, 77).mirror().addBox(0.4829F, -0.0053F, 0.178F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.8F, -1.1F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(121, 41).mirror().addBox(0.0815F, 0.2017F, -0.4324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.8F, -1.1F, -0.3592F, -0.08F, 0.0349F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-0.5F, -1.0F, -1.825F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2182F, -0.5057F, -2.561F, -0.7596F, 0.1308F, -0.0057F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(69, 84).mirror().addBox(-0.2993F, -0.0863F, -2.9859F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.186F, -2.6442F, -1.1732F, -0.0789F, 0.1308F, -0.0057F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(132, 32).mirror().addBox(-0.5F, -1.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5832F, 0.4199F, -8.9054F, 0.3525F, 0.1301F, -0.0149F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(109, 133).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.774F, 0.5911F, -10.3834F, 0.5837F, 0.1301F, -0.0149F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(121, 85).mirror().addBox(-0.6671F, 0.0408F, -3.0092F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.205F, -2.1169F, -7.0475F, 0.3917F, 0.1301F, -0.0149F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(19, 125).mirror().addBox(-0.2999F, -0.0183F, -2.9476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2146F, -2.9365F, -4.1956F, 0.3045F, 0.1301F, -0.0149F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(88, 60).mirror().addBox(-0.5F, -0.2F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -1.6607F, -4.9989F, 0.2696F, 0.1301F, -0.0149F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(97, 90).mirror().addBox(-0.5F, -0.3F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2691F, 5.5173F, -8.8834F, 0.4635F, 0.1301F, 0.0149F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(129, 62).mirror().addBox(-0.5F, -2.15F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7622F, 6.7194F, -11.7455F, -1.1248F, 0.1301F, 0.0149F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(119, 91).mirror().addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5469F, 4.3666F, -10.3669F, -2.0062F, 0.1301F, 0.0149F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(123, 31).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2398F, 3.7978F, -7.4948F, -0.3248F, 0.1273F, -0.0307F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(113, 66).mirror().addBox(-0.5F, -1.4F, -1.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5108F, 4.0311F, -9.6679F, -0.5866F, 0.1273F, -0.0307F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5752F, 3.3351F, -10.0035F, 0.4867F, 0.1273F, -0.0307F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 105).mirror().addBox(-0.5F, -0.8F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0451F, 4.9223F, -6.1467F, -0.0375F, 0.1241F, -0.0417F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(40, 121).mirror().addBox(-0.475F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.4928F, 14.3855F, 15.8659F, -1.3004F, 0.0361F, -0.0097F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(125, 36).mirror().addBox(-0.5F, -0.5F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4928F, 14.3855F, 15.8659F, -0.8641F, 0.0361F, -0.0097F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(63, 93).mirror().addBox(-0.5006F, -0.5692F, -0.0756F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.5201F, 13.9411F, 16.7243F, -0.5849F, 0.0361F, -0.0097F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(119, 132).mirror().addBox(-0.5F, -1.15F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5207F, 13.8257F, 16.7578F, -0.5822F, -0.0208F, 0.0302F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(146, 102).mirror().addBox(-0.5021F, -1.0652F, -0.751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.5201F, 13.9411F, 16.7243F, -1.2803F, -0.0208F, 0.0302F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(87, 82).mirror().addBox(-1.0985F, -0.6587F, -0.0494F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.9992F, 10.6028F, 10.5804F, -0.5115F, 0.0294F, 0.0013F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-1.0985F, -0.7819F, -0.561F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.9992F, 10.6028F, 10.5804F, -0.3893F, 0.0294F, 0.0013F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(0.3304F, -0.2542F, 0.032F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0001F, 7.9473F, 5.6662F, -0.395F, 0.2918F, -0.0075F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(0.3304F, -0.5867F, 0.0662F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0001F, 7.9473F, 5.6662F, -0.4299F, 0.2918F, -0.0075F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(137, 25).mirror().addBox(-0.5F, 0.1F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.713F, 8.5727F, 4.4034F, -1.0616F, 0.1395F, 0.0876F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(15, 95).mirror().addBox(-0.5F, -0.2F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6583F, 7.3322F, 3.2423F, -0.3198F, 0.1395F, 0.0876F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(92, 47).mirror().addBox(-0.3162F, -1.7134F, 1.4673F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0001F, 6.4473F, -0.6588F, -0.4071F, 0.1395F, 0.0876F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(11, 111).mirror().addBox(0.0836F, -0.5568F, -0.0631F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1352F, 9.0461F, 3.2706F, -0.3823F, 0.1912F, 0.0169F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(97, 97).mirror().addBox(0.0836F, -0.5568F, -0.0631F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3053F, 7.9263F, -1.1131F, -0.2427F, 0.1912F, 0.0169F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(37, 132).mirror().addBox(-0.3382F, -3.4073F, -1.4283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0001F, 6.4473F, -0.6588F, -1.1567F, 0.1321F, 0.0532F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(107, 52).mirror().addBox(-0.7645F, -2.9778F, 1.0438F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0001F, 6.4473F, -0.6588F, -0.7284F, 0.2438F, 0.1037F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(95, 125).mirror().addBox(-0.2171F, 0.0081F, 0.0062F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8441F, -2.8808F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(62, 43).mirror().addBox(-0.2171F, -0.2919F, -2.0938F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 1.9978F, 0.3569F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(113, 15).addBox(-0.5F, -1.6697F, -2.124F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.8256F, 1.3842F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(89, 98).addBox(-0.5F, -1.0654F, -0.521F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8256F, 1.3842F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(54, 84).addBox(-1.5F, -2.8619F, -3.3279F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 1.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(78, 74).addBox(-1.0F, -0.1F, -1.7F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3597F, 1.3388F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(54, 93).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1036F, -1.0392F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(112, 110).addBox(-1.0F, -2.2F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 96).addBox(-1.5F, -3.0145F, -0.0616F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 18.5295F, 2.3036F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(28, 85).addBox(-1.5F, -4.1F, -4.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 18.6128F, 2.239F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.599F, 2.0181F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(22, 113).addBox(-0.5F, -5.7F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 6.6354F, -0.5004F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(94, 132).addBox(0.55F, -2.0931F, -1.8712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.15F, 18.5674F, -1.1373F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(100, 23).addBox(-0.5F, 0.0089F, -1.0312F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 12.9531F, 0.2108F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(65, 112).addBox(-0.5F, -0.0911F, -0.4312F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 4.0354F, -0.0004F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 103).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 16.2878F, -0.7211F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(15, 87).addBox(-1.0F, -1.4F, -2.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 2.3324F, -0.076F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(98, 104).addBox(-1.9F, -0.3535F, -0.1188F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7544F, -2.5228F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(19, 120).addBox(-1.0F, -0.871F, -2.0357F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 2.0316F, 2.4313F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(110, 99).addBox(-1.0F, -1.571F, -2.4357F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9F, 3.2021F, 2.431F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(133, 0).addBox(-1.0F, -0.0621F, -0.0739F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 13.8648F, -0.9906F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(80, 0).addBox(-1.0F, -4.9621F, -1.2739F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 8.8346F, 0.4747F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(89, 104).addBox(-1.0F, -5.0F, -0.7F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 7.3346F, 0.0747F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(13, 102).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 20.3712F, -2.0239F, -1.4399F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(46, 67).addBox(-3.0F, -1.4696F, -2.8933F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3064F, 1.4923F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(27, 59).addBox(-3.0F, -1.4F, -3.9F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2759F, -3.5378F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 1.9978F, 0.3569F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(114, 29).addBox(-0.5F, -1.6697F, -2.124F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.8256F, 1.3842F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(37, 126).addBox(-0.5F, -1.0654F, -0.521F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8256F, 1.3842F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(85, 20).addBox(-1.5F, -2.8619F, -3.3279F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 1.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(83, 34).addBox(-1.0F, -0.1F, -1.7F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3597F, 1.3388F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(28, 94).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1036F, -1.0392F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(114, 22).addBox(-1.0F, -2.2F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(37, 99).addBox(-1.5F, -3.0145F, -0.0616F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 18.5295F, 2.3036F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 87).addBox(-1.5F, -4.1F, -4.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 18.6128F, 2.239F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.099F, 1.152F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(40, 114).addBox(-0.5F, -5.7F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 6.6354F, -0.5005F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(126, 132).addBox(-1.55F, -2.0931F, -1.8712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.15F, 18.5674F, -1.1373F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(16, 133).addBox(-0.5F, 0.0089F, -1.0312F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 12.9531F, 0.2108F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(70, 112).addBox(-0.5F, -0.0911F, -0.4311F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 4.0354F, -0.0005F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(104, 0).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 16.2878F, -0.7211F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(84, 90).addBox(-1.0F, -1.4F, -2.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 2.3324F, -0.076F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(105, 32).addBox(-0.1F, -0.3535F, -0.1188F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7544F, -2.5228F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(95, 120).addBox(-1.0F, -0.871F, -2.0357F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 2.0316F, 2.4313F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(114, 36).addBox(-1.0F, -1.571F, -2.4357F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9F, 3.2021F, 2.431F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(133, 5).addBox(-1.0F, -0.0621F, -0.0739F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 13.8648F, -0.9906F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(45, 83).addBox(-1.0F, -4.9621F, -1.2739F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 8.8346F, 0.4747F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(105, 23).addBox(-1.0F, -5.0F, -0.7F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 7.3346F, 0.0747F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(102, 68).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 20.3712F, -2.024F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(67, 67).addBox(-3.0F, -1.4696F, -2.8933F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.4451F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(50, 59).addBox(-3.0F, -1.4F, -3.9F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2759F, -3.5378F, -0.7854F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.6554F, -11.0243F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F))
				.texOffs(9, 117).addBox(0.0F, -6.748F, -16.9935F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7114F, -4.2632F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(14, 117).addBox(0.0F, -6.6525F, -0.0021F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2341F, -14.0312F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(46, 74).addBox(-1.0F, -0.1809F, -5.9788F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4554F, -11.0243F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(122, 110).addBox(0.0F, -5.4377F, -1.9741F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6554F, -0.0243F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(104, 122).addBox(0.0F, -5.73F, 0.0104F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6554F, -5.0243F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(90, 122).addBox(0.0F, -5.8576F, -0.0985F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6554F, -7.9243F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(13, 75).mirror().addBox(-3.916F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -1.1303F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(138, 80).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -4.2303F, 0.0282F, -0.1806F, -0.9893F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(80, 22).mirror().addBox(-3.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -4.2303F, 0.1024F, -0.1516F, -1.4309F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(5, 140).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -4.2303F, -0.0367F, -0.1132F, -0.5534F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(140, 4).mirror().addBox(-4.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -7.2303F, 0.1097F, -0.0998F, -1.4318F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(138, 67).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -7.2303F, 0.0572F, -0.1368F, -0.9939F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(140, 2).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -7.2303F, 0.008F, -0.0855F, -0.5578F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(13, 73).mirror().addBox(-6.8937F, -2.4262F, -0.2666F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -10.2303F, 0.1266F, 0.0212F, -1.4325F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(137, 86).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -10.2303F, 0.1237F, -0.0341F, -0.9996F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(140, 0).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -10.2303F, 0.1116F, -0.0205F, -0.5633F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(103, 66).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, -13.3303F, 0.2652F, 0.0615F, -0.5586F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(137, 44).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, -13.3303F, 0.2284F, 0.1051F, -0.9944F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(73, 58).mirror().addBox(-13.8936F, -2.4262F, -0.2666F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, -13.3303F, 0.1634F, 0.1914F, -1.427F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(51, 22).mirror().addBox(-15.8937F, -2.4262F, -0.2666F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7044F, -16.0303F, 0.185F, 0.2757F, -1.3866F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(122, 83).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7044F, -16.0303F, 0.2834F, 0.1728F, -0.9513F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(139, 65).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7044F, -16.0303F, 0.3434F, 0.0999F, -0.5169F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(13, 75).addBox(-0.084F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -1.1303F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(138, 80).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -4.2303F, 0.0282F, 0.1806F, 0.9893F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(80, 22).addBox(2.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -4.2303F, 0.1024F, 0.1516F, 1.4309F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(5, 140).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -4.2303F, -0.0367F, 0.1132F, 0.5534F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(140, 4).addBox(2.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -7.2303F, 0.1097F, 0.0998F, 1.4318F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(138, 67).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -7.2303F, 0.0572F, 0.1368F, 0.9939F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(140, 2).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -7.2303F, 0.008F, 0.0855F, 0.5578F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(13, 73).addBox(2.8937F, -2.4262F, -0.2666F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -10.2303F, 0.1266F, -0.0212F, 1.4325F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(137, 86).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -10.2303F, 0.1237F, 0.0341F, 0.9996F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(140, 0).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -10.2303F, 0.1116F, 0.0205F, 0.5633F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(103, 66).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, -13.3303F, 0.2652F, -0.0615F, 0.5586F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(137, 44).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, -13.3303F, 0.2284F, -0.1051F, 0.9944F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(73, 58).addBox(2.8937F, -2.4262F, -0.2666F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, -13.3303F, 0.1634F, -0.1914F, 1.427F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(51, 22).addBox(2.8937F, -2.4262F, -0.2666F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7044F, -16.0303F, 0.185F, -0.2757F, 1.3866F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(122, 83).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7044F, -16.0303F, 0.2834F, -0.1728F, 0.9513F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(139, 65).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7044F, -16.0303F, 0.3434F, -0.0999F, 0.5169F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(85, 122).addBox(0.0F, -5.9F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6554F, -11.0243F, -0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4204F, -16.8713F, -0.0611F, -0.0436F, 0.0027F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(75, 112).addBox(0.0F, -6.9022F, -0.104F, 0.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9341F, -2.7582F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(117, 117).addBox(0.0F, -6.2781F, -0.1018F, 0.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.7246F, -5.2233F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(76, 98).addBox(-1.0F, -0.0448F, -3.9381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.5282F, -3.7218F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(63, 98).addBox(-1.0F, -0.0448F, 2.9619F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.9341F, -6.2582F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(127, 50).mirror().addBox(-0.1319F, 0.0563F, 0.0018F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 19.1066F, -3.3408F, 0.1393F, -1.1411F, 0.1556F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(137, 29).mirror().addBox(-0.1319F, 0.9644F, 2.8402F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 19.1066F, -3.3408F, 0.4535F, -1.1411F, 0.1556F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(127, 46).mirror().addBox(-0.1106F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.8066F, -3.3408F, 0.1107F, -0.8744F, -0.2398F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(113, 73).mirror().addBox(-0.1106F, 0.5192F, 3.0667F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.8066F, -3.3408F, 0.4249F, -0.8744F, -0.2398F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(9, 127).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -2.6408F, -0.0497F, -0.5295F, -0.0416F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(64, 34).mirror().addBox(-0.6504F, 0.8291F, 2.3866F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -2.6408F, 0.2644F, -0.5295F, -0.0416F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(124, 10).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -2.6408F, -0.176F, -0.6438F, 0.0464F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(28, 77).mirror().addBox(-0.6504F, 0.8291F, 2.3866F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -2.6408F, 0.1382F, -0.6438F, 0.0464F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(86, 16).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -2.6408F, -0.1074F, -0.7384F, -0.0938F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(73, 60).mirror().addBox(-0.6504F, 0.8291F, 2.3866F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -2.6408F, 0.2068F, -0.7384F, -0.0938F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(140, 10).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.8911F, -4.2139F, 0.554F, 0.1895F, -0.4329F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(140, 8).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.8911F, -4.2139F, 0.4407F, 0.3411F, -0.8576F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(51, 18).mirror().addBox(-18.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.8911F, -4.2139F, 0.2558F, 0.4928F, -1.3064F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(139, 32).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3911F, -1.6139F, 0.3796F, 0.2646F, -0.8931F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(51, 16).mirror().addBox(-18.8937F, -2.4262F, -0.2666F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3911F, -1.6139F, 0.2339F, 0.3987F, -1.3331F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(140, 6).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3911F, -1.6139F, 0.4681F, 0.1441F, -0.4645F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(127, 50).addBox(-0.8681F, 0.0563F, 0.0018F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 19.1066F, -3.3408F, 0.1393F, 1.1411F, -0.1556F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(137, 29).addBox(-0.8681F, 0.9644F, 2.8402F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 19.1066F, -3.3408F, 0.4535F, 1.1411F, -0.1556F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(127, 46).addBox(-0.8894F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.8066F, -3.3408F, 0.1107F, 0.8744F, 0.2398F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(113, 73).addBox(-0.8894F, 0.5192F, 3.0667F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.8066F, -3.3408F, 0.4249F, 0.8744F, 0.2398F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(9, 127).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -2.6408F, -0.0497F, 0.5295F, 0.0416F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(64, 34).addBox(-0.3496F, 0.8291F, 2.3866F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -2.6408F, 0.2644F, 0.5295F, 0.0416F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(124, 10).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -2.6408F, -0.176F, 0.6438F, -0.0464F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(28, 77).addBox(-0.3496F, 0.8291F, 2.3866F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -2.6408F, 0.1382F, 0.6438F, -0.0464F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(86, 16).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -2.6408F, -0.1074F, 0.7384F, 0.0938F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(73, 60).addBox(-0.3496F, 0.8291F, 2.3866F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -2.6408F, 0.2068F, 0.7384F, 0.0938F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(121, 97).addBox(-0.25F, -0.6364F, 3.8651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 18.4939F, -8.8587F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(140, 10).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.8911F, -4.2139F, 0.554F, -0.1895F, 0.4329F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(140, 8).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.8911F, -4.2139F, 0.4407F, -0.3411F, 0.8576F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(51, 18).addBox(2.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.8911F, -4.2139F, 0.2558F, -0.4928F, 1.3064F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(139, 32).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3911F, -1.6139F, 0.3796F, -0.2646F, 0.8931F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(51, 16).addBox(2.8937F, -2.4262F, -0.2666F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3911F, -1.6139F, 0.2339F, -0.3987F, 1.3331F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(140, 6).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3911F, -1.6139F, 0.4681F, -0.1441F, 0.4645F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(88, 68).addBox(-0.75F, -1.0388F, -0.1405F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 18.4939F, -8.8587F, -0.288F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 4.6114F, -6.0489F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r218 = chest2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(85, 140).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.2F, -3.8F, 0.3769F, 0.1991F, -0.8647F));

		PartDefinition cube_r219 = chest2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(140, 71).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.2F, -3.8F, 0.4384F, 0.0855F, -0.4388F));

		PartDefinition cube_r220 = chest2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(85, 29).mirror().addBox(-10.729F, -1.955F, -0.2993F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.2F, -3.8F, 0.261F, 0.3382F, -1.2944F));

		PartDefinition cube_r221 = chest2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(140, 69).mirror().addBox(-1.4539F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.6F, -2.4F, 0.3499F, 0.0838F, -0.4235F));

		PartDefinition cube_r222 = chest2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(139, 63).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.6F, -2.4F, 0.2962F, 0.1609F, -0.8564F));

		PartDefinition cube_r223 = chest2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(-14.7415F, -1.9518F, -0.3082F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.6F, -2.4F, 0.2021F, 0.2702F, -1.2892F));

		PartDefinition cube_r224 = chest2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(140, 12).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.2511F, 0.049F, -0.4522F));

		PartDefinition cube_r225 = chest2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(139, 34).mirror().addBox(-3.3281F, -0.5952F, -0.3189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.2208F, 0.0878F, -0.8878F));

		PartDefinition cube_r226 = chest2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-17.7647F, -1.946F, -0.3189F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.1638F, 0.1725F, -1.3197F));

		PartDefinition cube_r227 = chest2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(85, 29).addBox(2.729F, -1.955F, -0.2993F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2F, -3.8F, 0.261F, -0.3382F, 1.2944F));

		PartDefinition cube_r228 = chest2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(112, 117).addBox(0.0F, -6.9784F, -0.1756F, 0.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.143F, -1.7443F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r229 = chest2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(28, 120).addBox(0.0F, -2.6339F, -0.2574F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 3.5153F, -4.4777F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r230 = chest2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(79, 137).addBox(0.0F, -4.2339F, 0.0426F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 2.243F, -3.2443F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r231 = chest2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(27, 67).addBox(-1.0F, -0.0865F, -2.1546F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.943F, -3.7443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(85, 140).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2F, -3.8F, 0.3769F, -0.1991F, 0.8647F));

		PartDefinition cube_r233 = chest2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(140, 71).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2F, -3.8F, 0.4384F, -0.0855F, 0.4388F));

		PartDefinition cube_r234 = chest2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(140, 69).addBox(-0.5461F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -2.4F, 0.3499F, -0.0838F, 0.4235F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(139, 63).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -2.4F, 0.2962F, -0.1609F, 0.8564F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(64, 32).addBox(2.7415F, -1.9518F, -0.3082F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -2.4F, 0.2021F, -0.2702F, 1.2892F));

		PartDefinition cube_r237 = chest2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(140, 12).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.2511F, -0.049F, 0.4522F));

		PartDefinition cube_r238 = chest2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(139, 34).addBox(1.3281F, -0.5952F, -0.3189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.2208F, -0.0878F, 0.8878F));

		PartDefinition cube_r239 = chest2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(51, 20).addBox(2.7647F, -1.946F, -0.3189F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.1638F, -0.1725F, 1.3197F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.6509F, -4.2561F, -0.2365F, -0.0848F, 0.0204F));

		PartDefinition cube_r240 = neck4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(24, 73).addBox(0.0F, -1.4F, -0.0816F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5772F, -3.6376F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r241 = neck4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(54, 145).addBox(0.0F, -1.9811F, -0.0196F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4772F, -2.0376F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(69, 90).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2511F, -3.739F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r243 = neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(3, 147).addBox(0.0F, -2.5487F, 5.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 140).addBox(0.0F, -2.4487F, 3.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 31).addBox(-0.5F, -1.9487F, 2.0661F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9164F, -6.5763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7016F, -3.8589F, -0.4115F, -0.08F, 0.0349F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(147, 10).addBox(0.0F, -1.0018F, 7.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(9, 147).addBox(0.0F, -1.0018F, 5.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(24, 106).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.6263F, -7.1488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(88, 113).addBox(-0.5F, -6.15F, -0.9206F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(147, 4).addBox(0.0F, -2.15F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 147).addBox(0.0F, -4.15F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 7).addBox(0.0F, -6.15F, 0.5794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0468F, -2.8524F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(123, 55).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(60, 147).addBox(0.0F, -2.0F, 0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0261F, 0.0631F, 0.0F, -0.1309F, 0.0F));

		PartDefinition neck = neck6.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8273F, 0.1697F, -0.7931F, -0.1231F, 0.124F));

		PartDefinition cube_r245 = neck.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 128).addBox(0.0F, 0.0555F, -2.595F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4188F, 0.6739F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r246 = neck.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(118, 49).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5566F, -2.5412F, 0.6404F, -0.2875F, 0.0206F));

		PartDefinition cube_r247 = heads.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(124, 5).addBox(-1.1F, -0.0306F, 0.0288F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 2.5571F, -11.9081F, 0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r248 = heads.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(5, 144).addBox(-1.1F, -0.9306F, -0.8712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 3.3536F, -11.4773F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r249 = heads.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(89, 0).addBox(-1.0F, 0.2F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1668F, -5.5218F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r250 = heads.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(137, 40).addBox(0.5F, -0.5F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.8588F, -0.35F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r251 = heads.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(18, 130).addBox(-1.5F, 0.95F, -0.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(129, 67).addBox(-1.5F, 0.275F, -0.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.3459F, 0.226F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r252 = heads.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(128, 129).addBox(-1.5F, -0.025F, -2.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(119, 129).addBox(-1.5F, -0.025F, -1.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.3459F, 0.226F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r253 = heads.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(62, 134).addBox(-0.5F, 1.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -4.9286F, 0.4106F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r254 = heads.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(144, 96).addBox(-0.7F, -0.0644F, -0.9637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2F, -2.6841F, 1.4536F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r255 = heads.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(124, 0).addBox(-0.7F, 0.0356F, -2.9637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, -3.6811F, 1.5321F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r256 = heads.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(63, 123).addBox(-0.7F, 0.0356F, -2.9637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2F, -4.6554F, 1.3072F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r257 = heads.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(122, 119).addBox(-0.7F, 0.0356F, -2.9637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, -5.5921F, 0.9569F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r258 = heads.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 111).addBox(-2.0F, 1.3565F, 1.0008F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -4.0735F, -2.1839F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r259 = heads.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(92, 39).addBox(-1.5F, 1.127F, -0.4559F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5735F, -5.0839F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r260 = heads.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(138, 74).addBox(-0.2F, -0.025F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, -7.1494F, -0.2305F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r261 = heads.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(122, 78).addBox(-0.8F, -1.025F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.3F, -6.465F, 0.4834F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r262 = heads.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(62, 138).addBox(-0.8F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -7.7784F, -1.0305F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r263 = heads.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(57, 134).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -8.2088F, -1.9216F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r264 = heads.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(129, 138).addBox(-1.5F, -0.05F, 0.0124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -6.1565F, -5.933F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r265 = heads.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(37, 137).addBox(-1.5F, 0.0001F, 0.0124F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -7.7355F, -4.722F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r266 = heads.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 134).addBox(-1.5F, 0.0F, 0.0124F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, -7.0535F, -5.4534F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r267 = heads.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(133, 132).addBox(-1.5F, 0.0001F, 0.0124F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -8.2598F, -3.8823F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r268 = heads.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(21, 133).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, -8.377F, -2.8685F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r269 = heads.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(138, 127).addBox(-1.5F, -0.0144F, -0.0137F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -5.274F, -6.273F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r270 = heads.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(138, 122).addBox(-1.5F, -0.0144F, -0.0137F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, -4.3188F, -6.438F, 1.405F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -1.6735F, -2.7839F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(137, 82).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.9403F, 1.8408F, 3.2136F, -1.1246F, 0.1079F, -0.2084F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(69, 135).addBox(-0.5F, -0.7721F, 0.3058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.172F, 0.5899F, 3.5093F, -1.7791F, 0.1079F, -0.2084F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(26, 135).addBox(-0.5F, -0.45F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.2593F, 0.2663F, 3.339F, -1.2119F, 0.1079F, -0.2084F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(20, 146).addBox(-0.4F, -0.0895F, -1.2471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 4.9771F, -8.6934F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(58, 128).addBox(-1.4063F, -1.4893F, -2.0331F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.285F, 0.6283F, 2.7808F, -0.1073F, 0.1033F, -0.2153F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(123, 21).addBox(-0.5F, -0.2F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.7466F, 1.2221F, -2.4751F, 0.8029F, 0.0524F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(144, 137).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5669F, 4.6662F, -0.4327F, 0.0169F, 0.0475F, -0.0221F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(131, 77).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6472F, 3.5591F, -1.6066F, -0.3758F, 0.0475F, -0.0221F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(141, 104).addBox(-0.4358F, -2.0245F, 0.3634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.7925F, 3.8036F, -3.4253F, -0.1576F, 0.0475F, -0.0221F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(134, 113).addBox(-0.4358F, -0.9836F, -1.3872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7925F, 3.8036F, -3.4253F, 0.0431F, 0.0475F, -0.0221F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(103, 58).addBox(-1.8119F, -1.6082F, -3.1458F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.015F, 0.6283F, 0.8808F, 0.2588F, 0.1366F, -0.1591F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(35, 143).addBox(-0.5F, -1.5F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6266F, 4.8544F, 1.6406F, 0.2965F, 0.04F, -0.161F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(141, 100).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6266F, 4.8544F, 1.6406F, 0.0347F, 0.04F, -0.161F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(142, 88).addBox(-1.0213F, -1.1055F, -1.0253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5645F, 1.2326F, 2.9301F, -0.4821F, 0.0512F, -0.2097F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(16, 139).addBox(-1.0213F, -0.2055F, -0.4253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5885F, 1.275F, 2.2995F, -0.261F, 0.0648F, -0.1591F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(92, 141).addBox(0.0F, -0.7F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7007F, 3.9471F, -4.4641F, -0.0159F, 0.0486F, 0.1256F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(130, 54).addBox(0.0F, -0.925F, -0.8F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 4.3212F, -2.7429F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(134, 138).addBox(-0.4776F, -0.9804F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, -0.6016F, 0.1773F, -0.1956F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(142, 143).addBox(-0.4776F, 1.0737F, 0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, -1.1164F, 0.1773F, -0.1956F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(47, 141).addBox(-0.4776F, -0.3445F, 0.0561F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, -0.8546F, 0.1773F, -0.1956F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(141, 36).addBox(-0.4909F, -1.8432F, 0.08F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, -0.4707F, 0.1773F, -0.1956F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(47, 137).addBox(-0.5F, -0.3961F, -0.0237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.3452F, 3.4783F, -5.7185F, 0.6082F, 0.1493F, -0.037F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(134, 109).addBox(-0.5F, -0.3902F, -1.9757F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.3452F, 3.4783F, -5.7185F, 0.39F, 0.1493F, -0.037F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(122, 124).addBox(-0.4909F, -0.5345F, -1.1826F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.293F))
				.texOffs(124, 72).addBox(-0.4909F, -0.3345F, -1.7826F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, 0.8732F, 0.1773F, -0.1956F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(49, 124).addBox(-0.4909F, -0.405F, -1.1944F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F))
				.texOffs(137, 54).addBox(-0.4909F, -0.805F, -0.4944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, 1.0478F, 0.1773F, -0.1956F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(106, 145).addBox(-0.4909F, -1.0903F, 0.7311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, 0.786F, 0.1773F, -0.1956F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(91, 145).addBox(-0.4909F, -1.8763F, 0.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, 0.0006F, 0.1773F, -0.1956F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(137, 143).addBox(-0.4909F, -2.0952F, -0.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, -0.4358F, 0.1773F, -0.1956F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(143, 134).addBox(-0.4776F, -0.5873F, 0.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, -0.6539F, 0.1773F, -0.1956F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(133, 74).addBox(-0.5149F, -0.4131F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(130, 59).addBox(-0.5149F, -0.8131F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1687F, 0.0303F, -0.0627F, 2.9031F, 0.1327F, -0.2146F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(143, 46).addBox(-0.5149F, -0.2204F, -0.9842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(123, 62).addBox(-0.5149F, -0.2204F, -0.8092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(121, 46).addBox(-0.5149F, -0.2204F, -0.4092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1687F, 0.0303F, -0.0627F, 3.1212F, 0.1327F, -0.2146F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(118, 55).addBox(-0.5149F, -0.1744F, -0.1415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.1687F, 0.0303F, -0.0627F, -2.9002F, 0.1327F, -0.2146F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(139, 137).addBox(-0.5F, -1.475F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(67, 139).addBox(-0.5F, -1.475F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(122, 143).addBox(-0.5F, -0.475F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(143, 119).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2704F, 0.466F, -1.0061F, -2.2081F, 0.1757F, -0.1812F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(117, 143).addBox(-0.5F, -0.45F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2074F, 1.0829F, -1.2828F, -1.6147F, 0.1757F, -0.1812F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(143, 116).addBox(-0.4804F, 0.2635F, -0.2058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(143, 76).addBox(-0.4804F, -0.0365F, -0.1558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1313F, 0.9297F, -0.5938F, -1.4401F, 0.1757F, -0.1812F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(112, 143).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(143, 73).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.0629F, 1.6982F, -1.107F, -1.4838F, 0.1757F, -0.1812F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(58, 124).addBox(-0.4804F, -0.9284F, -0.7806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.1313F, 0.9297F, -0.5938F, -0.6984F, 0.1757F, -0.1812F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(72, 143).addBox(-0.4804F, 0.0003F, -0.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.1313F, 0.9297F, -0.5938F, -0.9165F, 0.1757F, -0.1812F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(67, 143).addBox(-0.4375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(143, 49).addBox(-0.6125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2163F, 0.3352F, -0.2158F, -0.0439F, 0.1757F, -0.1812F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(138, 132).addBox(-0.4804F, -1.8074F, -0.5111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.1313F, 0.9297F, -0.5938F, -0.6111F, 0.1757F, -0.1812F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(130, 41).addBox(-0.4804F, -1.2074F, -1.0861F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1313F, 0.9297F, -0.5938F, -0.742F, 0.1757F, -0.1812F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(145, 79).addBox(-0.4776F, 0.5616F, -1.5182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, 0.2624F, 0.1773F, -0.1956F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(132, 143).addBox(-0.4776F, 0.9006F, -1.4047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, -0.0867F, 0.1773F, -0.1956F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(143, 131).addBox(-0.4909F, -1.1549F, 0.9763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.8514F, 1.0911F, 1.1079F, 0.3671F, 0.1773F, -0.1956F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(131, 119).addBox(-0.5F, -1.975F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.8232F, 3.6308F, 1.341F, -0.4457F, 0.1273F, -0.1479F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(102, 131).addBox(-0.5F, -0.85F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0593F, 2.9822F, 0.2623F, 0.3397F, 0.1273F, -0.1479F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(131, 124).addBox(-0.5F, -1.2F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3818F, 1.9712F, -1.0658F, 1.4742F, 0.1273F, -0.1479F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(27, 130).addBox(-1.025F, -1.0F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.7269F, 1.7973F, 0.0596F, 0.9069F, 0.1273F, -0.1479F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(133, 10).addBox(-0.2639F, -0.0938F, -1.0456F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 4.9771F, -8.6934F, -0.2355F, 0.546F, -0.1239F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(143, 128).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 5.4495F, -7.8907F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(134, 105).addBox(-0.2525F, 0.1065F, 0.0553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.9F, 5.0271F, -8.6934F, 0.7351F, -0.0784F, -0.3277F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(107, 104).addBox(-0.5173F, -0.0748F, -0.6844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.9F, 3.8439F, -7.189F, 0.3366F, 0.0734F, -0.1241F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(31, 119).addBox(-0.5F, -0.95F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8537F, 0.085F, -1.6011F, 0.8202F, 0.1395F, -0.0644F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(28, 125).addBox(-0.0234F, -1.3392F, -2.2525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1131F, -1.2373F, -0.623F, 0.7062F, 0.3798F, -0.3152F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(134, 101).addBox(-0.9413F, -0.6848F, -0.185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2474F, 2.095F, -2.6104F, 1.0911F, 0.059F, -0.0519F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(57, 140).addBox(-0.7F, 0.025F, -0.9089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.1154F, -3.0642F, 0.891F, 0.0384F, 0.0475F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(118, 104).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.431F, -2.2155F, 0.2975F, 0.1412F, -0.0383F, -0.0756F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(0, 123).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.876F, -1.9878F, 0.3074F, 0.1449F, 0.0197F, -0.4729F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(54, 118).addBox(-0.7F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.8551F, 1.6119F, -3.4533F, 1.1486F, 0.1176F, 0.012F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(95, 113).addBox(-0.5F, -1.0323F, -0.0729F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0316F, 0.2413F, -2.8652F, 1.4847F, 0.0449F, -0.1472F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(134, 36).addBox(-0.4583F, -0.1548F, -0.9121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 4.9771F, -8.6934F, -0.1715F, 0.5947F, -0.0612F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(127, 143).addBox(-0.9795F, -0.1548F, -0.7009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.9F, 4.9771F, -8.6934F, -0.1447F, 0.1981F, 0.0069F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -1.6735F, -2.7839F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(137, 82).mirror().addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.9403F, 1.8408F, 3.2136F, -1.1246F, -0.1079F, 0.2084F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(69, 135).mirror().addBox(-0.5F, -0.7721F, 0.3058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.172F, 0.5899F, 3.5093F, -1.7791F, -0.1079F, 0.2084F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(26, 135).mirror().addBox(-0.5F, -0.45F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.2593F, 0.2663F, 3.339F, -1.2119F, -0.1079F, 0.2084F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(20, 146).mirror().addBox(-0.6F, -0.0895F, -1.2471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 144).mirror().addBox(0.1F, -0.0895F, -1.2471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.9F, 4.9771F, -8.6934F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(58, 128).mirror().addBox(0.4063F, -1.4893F, -2.0331F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.285F, 0.6283F, 2.7808F, -0.1073F, -0.1033F, 0.2153F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(123, 21).mirror().addBox(-0.5F, -0.2F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.7466F, 1.2221F, -2.4751F, 0.8029F, -0.0524F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(144, 137).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5669F, 4.6662F, -0.4327F, 0.0169F, -0.0475F, 0.0221F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(131, 77).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.6472F, 3.5591F, -1.6066F, -0.3758F, -0.0475F, 0.0221F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(141, 104).mirror().addBox(-0.5642F, -2.0245F, 0.3634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.7925F, 3.8036F, -3.4253F, -0.1576F, -0.0475F, 0.0221F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(134, 113).mirror().addBox(-0.5642F, -0.9836F, -1.3872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7925F, 3.8036F, -3.4253F, 0.0431F, -0.0475F, 0.0221F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(103, 58).mirror().addBox(0.8119F, -1.6082F, -3.1458F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 0.6283F, 0.8808F, 0.2588F, -0.1366F, 0.1591F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(35, 143).mirror().addBox(-0.5F, -1.5F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6266F, 4.8544F, 1.6406F, 0.2965F, -0.04F, 0.161F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(141, 100).mirror().addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6266F, 4.8544F, 1.6406F, 0.0347F, -0.04F, 0.161F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(142, 88).mirror().addBox(0.0213F, -1.1055F, -1.0253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5645F, 1.2326F, 2.9301F, -0.4821F, -0.0512F, 0.2097F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(16, 139).mirror().addBox(0.0213F, -0.2055F, -0.4253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5885F, 1.275F, 2.2995F, -0.261F, -0.0648F, 0.1591F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(92, 141).mirror().addBox(0.0F, -0.7F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7007F, 3.9471F, -4.4641F, -0.0159F, -0.0486F, -0.1256F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(130, 54).mirror().addBox(0.0F, -0.925F, -0.8F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 4.3212F, -2.7429F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(134, 138).mirror().addBox(-0.5224F, -0.9804F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, -0.6016F, -0.1773F, 0.1956F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(142, 143).mirror().addBox(-0.5224F, 1.0737F, 0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, -1.1164F, -0.1773F, 0.1956F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(47, 141).mirror().addBox(-0.5224F, -0.3445F, 0.0561F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, -0.8546F, -0.1773F, 0.1956F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(141, 36).mirror().addBox(-0.5091F, -1.8432F, 0.08F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, -0.4707F, -0.1773F, 0.1956F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(47, 137).mirror().addBox(-0.5F, -0.3961F, -0.0237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.3452F, 3.4783F, -5.7185F, 0.6082F, -0.1493F, 0.037F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(134, 109).mirror().addBox(-0.5F, -0.3902F, -1.9757F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.3452F, 3.4783F, -5.7185F, 0.39F, -0.1493F, 0.037F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(122, 124).mirror().addBox(-0.5091F, -0.5345F, -1.1826F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(124, 72).mirror().addBox(-0.5091F, -0.3345F, -1.7826F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, 0.8732F, -0.1773F, 0.1956F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(49, 124).mirror().addBox(-0.5091F, -0.405F, -1.1944F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(137, 54).mirror().addBox(-0.5091F, -0.805F, -0.4944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, 1.0478F, -0.1773F, 0.1956F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(106, 145).mirror().addBox(-0.5091F, -1.0903F, 0.7311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, 0.786F, -0.1773F, 0.1956F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(91, 145).mirror().addBox(-0.5091F, -1.8763F, 0.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, 0.0006F, -0.1773F, 0.1956F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(137, 143).mirror().addBox(-0.5091F, -2.0952F, -0.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, -0.4358F, -0.1773F, 0.1956F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(143, 134).mirror().addBox(-0.5224F, -0.5873F, 0.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, -0.6539F, -0.1773F, 0.1956F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(133, 74).mirror().addBox(-0.4851F, -0.4131F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(130, 59).mirror().addBox(-0.4851F, -0.8131F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1687F, 0.0303F, -0.0627F, 2.9031F, -0.1327F, 0.2146F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(143, 46).mirror().addBox(-0.4851F, -0.2204F, -0.9842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(123, 62).mirror().addBox(-0.4851F, -0.2204F, -0.8092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(121, 46).mirror().addBox(-0.4851F, -0.2204F, -0.4092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1687F, 0.0303F, -0.0627F, 3.1212F, -0.1327F, 0.2146F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(118, 55).mirror().addBox(-0.4851F, -0.1744F, -0.1415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(1.1687F, 0.0303F, -0.0627F, -2.9002F, -0.1327F, 0.2146F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(139, 137).mirror().addBox(-0.5F, -1.475F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(67, 139).mirror().addBox(-0.5F, -1.475F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(122, 143).mirror().addBox(-0.5F, -0.475F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(143, 119).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2704F, 0.466F, -1.0061F, -2.2081F, -0.1757F, 0.1812F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(117, 143).mirror().addBox(-0.5F, -0.45F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2074F, 1.0829F, -1.2828F, -1.6147F, -0.1757F, 0.1812F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(143, 116).mirror().addBox(-0.5196F, 0.2635F, -0.2058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(143, 76).mirror().addBox(-0.5196F, -0.0365F, -0.1558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1313F, 0.9297F, -0.5938F, -1.4401F, -0.1757F, 0.1812F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(112, 143).mirror().addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(143, 73).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.0629F, 1.6982F, -1.107F, -1.4838F, -0.1757F, 0.1812F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(58, 124).mirror().addBox(-0.5196F, -0.9284F, -0.7806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.1313F, 0.9297F, -0.5938F, -0.6984F, -0.1757F, 0.1812F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(72, 143).mirror().addBox(-0.5196F, 0.0003F, -0.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(1.1313F, 0.9297F, -0.5938F, -0.9165F, -0.1757F, 0.1812F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(67, 143).mirror().addBox(-0.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(143, 49).mirror().addBox(-0.3875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2163F, 0.3352F, -0.2158F, -0.0439F, -0.1757F, 0.1812F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(138, 132).mirror().addBox(-0.5196F, -1.8074F, -0.5111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.1313F, 0.9297F, -0.5938F, -0.6111F, -0.1757F, 0.1812F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(130, 41).mirror().addBox(-0.5196F, -1.2074F, -1.0861F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1313F, 0.9297F, -0.5938F, -0.742F, -0.1757F, 0.1812F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(145, 79).mirror().addBox(-0.5224F, 0.5616F, -1.5182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, 0.2624F, -0.1773F, 0.1956F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(132, 143).mirror().addBox(-0.5224F, 0.9006F, -1.4047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, -0.0867F, -0.1773F, 0.1956F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(143, 131).mirror().addBox(-0.5091F, -1.1549F, 0.9763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.8514F, 1.0911F, 1.1079F, 0.3671F, -0.1773F, 0.1956F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(131, 119).mirror().addBox(-0.5F, -1.975F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.8232F, 3.6308F, 1.341F, -0.4457F, -0.1273F, 0.1479F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(102, 131).mirror().addBox(-0.5F, -0.85F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.0593F, 2.9822F, 0.2623F, 0.3397F, -0.1273F, 0.1479F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(131, 124).mirror().addBox(-0.5F, -1.2F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3818F, 1.9712F, -1.0658F, 1.4742F, -0.1273F, 0.1479F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(27, 130).mirror().addBox(0.025F, -1.0F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.7269F, 1.7973F, 0.0596F, 0.9069F, -0.1273F, 0.1479F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(133, 10).mirror().addBox(-0.7361F, -0.0938F, -1.0456F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4F, 4.9771F, -8.6934F, -0.2355F, -0.546F, 0.1239F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(143, 128).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, 5.4495F, -7.8907F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(134, 105).mirror().addBox(-0.7475F, 0.1065F, 0.0553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.9F, 5.0271F, -8.6934F, 0.7351F, 0.0784F, 0.3277F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(107, 104).mirror().addBox(-0.4827F, -0.0748F, -0.6844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.9F, 3.8439F, -7.189F, 0.3366F, -0.0734F, 0.1241F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(31, 119).mirror().addBox(-0.5F, -0.95F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8537F, 0.085F, -1.6011F, 0.8202F, -0.1395F, 0.0644F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(28, 125).mirror().addBox(-0.9766F, -1.3392F, -2.2525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1131F, -1.2373F, -0.623F, 0.7062F, -0.3798F, 0.3152F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(134, 101).mirror().addBox(-0.0587F, -0.6848F, -0.185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2474F, 2.095F, -2.6104F, 1.0911F, -0.059F, 0.0519F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(57, 140).mirror().addBox(-0.3F, 0.025F, -0.9089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -0.1154F, -3.0642F, 0.891F, -0.0384F, -0.0475F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(118, 104).mirror().addBox(0.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.431F, -2.2155F, 0.2975F, 0.1412F, 0.0383F, 0.0756F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.876F, -1.9878F, 0.3074F, 0.1449F, -0.0197F, 0.4729F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(54, 118).mirror().addBox(-0.3F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.8551F, 1.6119F, -3.4533F, 1.1486F, -0.1176F, -0.012F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(95, 113).mirror().addBox(-0.5F, -1.0323F, -0.0729F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.0316F, 0.2413F, -2.8652F, 1.4847F, -0.0449F, 0.1472F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(134, 36).mirror().addBox(-0.5417F, -0.1548F, -0.9121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 4.9771F, -8.6934F, -0.1715F, -0.5947F, 0.0612F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(127, 143).mirror().addBox(-0.0205F, -0.1548F, -0.7009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.9F, 4.9771F, -8.6934F, -0.1447F, -0.1981F, -0.0069F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9556F, -0.7115F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(123, 26).mirror().addBox(0.0124F, -0.4783F, -2.1723F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3465F, -2.8522F, -1.3127F, -0.227F, -0.0165F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(146, 30).mirror().addBox(0.0124F, -1.3545F, -2.7649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3465F, -2.8522F, -0.8764F, -0.227F, -0.0165F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(136, 46).mirror().addBox(0.0124F, -0.1083F, -1.962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3465F, -2.8522F, -1.4873F, -0.227F, -0.0165F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(62, 144).mirror().addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(62, 144).addBox(1.1F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8F, -0.8403F, -7.3566F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(144, 58).mirror().addBox(-0.9F, 0.0294F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(144, 58).addBox(0.7F, 0.0294F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.4F, -1.2666F, -7.9F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(132, 20).mirror().addBox(-0.3F, -0.0023F, -2.022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(132, 20).addBox(1.3F, -0.0023F, -2.022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -1.1551F, -4.8773F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(130, 96).mirror().addBox(-0.3F, -0.4023F, -0.922F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(130, 96).addBox(1.3F, -0.4023F, -0.922F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -0.5767F, -4.0802F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(136, 14).mirror().addBox(-0.9464F, -2.2674F, 0.1638F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, -0.5061F, -0.2967F, 0.0F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(57, 144).mirror().addBox(-0.9464F, -1.0406F, 3.4271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, -0.0262F, -0.2967F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(25, 146).mirror().addBox(-0.9464F, 0.3988F, 2.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, 0.4974F, -0.2967F, 0.0F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(144, 55).mirror().addBox(-0.9464F, 2.1427F, 3.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, 0.7592F, -0.2967F, 0.0F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(130, 83).mirror().addBox(-0.2F, -0.7456F, -1.5806F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 83).addBox(1.8F, -0.7456F, -1.5806F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -0.5767F, -4.0802F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(107, 141).mirror().addBox(0.0F, -0.4F, -0.35F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 141).addBox(1.8F, -0.4F, -0.35F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -1.302F, -7.1404F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(144, 52).mirror().addBox(-0.8F, -0.3748F, 0.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(144, 52).addBox(0.6F, -0.3748F, 0.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4F, 0.2431F, -8.8594F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(144, 43).mirror().addBox(-0.5F, -0.55F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(144, 43).addBox(0.9F, -0.55F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7F, -0.355F, -8.9206F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(135, 92).mirror().addBox(-1.15F, -0.9614F, -1.9163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(135, 92).addBox(0.45F, -0.9614F, -1.9163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.15F, 0.5362F, -6.0245F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(144, 40).mirror().addBox(-0.8F, -0.1524F, -0.0493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(144, 40).addBox(0.6F, -0.1524F, -0.0493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4F, 0.2431F, -8.8594F, 0.4232F, 0.0F, 0.0F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(146, 33).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(40, 144).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(146, 33).addBox(0.9F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(40, 144).addBox(0.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 0.3164F, -9.163F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(146, 61).mirror().addBox(-0.3F, -0.8565F, -0.1645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(146, 61).addBox(0.05F, -0.8565F, -0.1645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.375F, 0.8794F, -10.9909F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(30, 144).mirror().addBox(-0.3F, -0.3815F, -0.6645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(30, 144).addBox(0.05F, -0.3815F, -0.6645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.375F, 0.3713F, -10.9043F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(143, 14).mirror().addBox(-0.5F, -1.475F, 0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(142, 92).mirror().addBox(-0.5F, -1.875F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(143, 14).addBox(0.3F, -1.475F, 0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(142, 92).addBox(0.3F, -1.875F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.4F, -0.4025F, -10.3069F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(144, 27).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(144, 27).addBox(0.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 0.1526F, -10.315F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(72, 146).mirror().addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false)
				.texOffs(72, 146).addBox(-0.05F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(-0.225F, 0.2588F, -11.4593F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(67, 146).mirror().addBox(-0.5F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(67, 146).addBox(-0.05F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.225F, 0.2588F, -11.4593F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(137, 96).mirror().addBox(-0.7F, -0.5057F, -0.3195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)).mirror(false)
				.texOffs(137, 96).addBox(0.1F, -0.5057F, -0.3195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.2F, 0.3713F, -10.9043F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(144, 24).mirror().addBox(-0.475F, -0.6557F, -0.4445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(144, 24).addBox(-0.125F, -0.6557F, -0.4445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2F, 0.3713F, -10.9043F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(146, 64).mirror().addBox(-0.6F, -1.0792F, -0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(146, 36).mirror().addBox(-0.6F, -0.8792F, -0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(146, 64).addBox(0.4F, -1.0792F, -0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(146, 36).addBox(0.4F, -0.8792F, -0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4F, 1.5014F, -9.7433F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(15, 144).mirror().addBox(-0.6F, -0.8792F, -1.5264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(15, 144).addBox(0.4F, -0.8792F, -1.5264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 0.9432F, -8.4594F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(10, 144).mirror().addBox(-0.6F, -0.8792F, -0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(10, 144).addBox(0.4F, -0.8792F, -0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 1.2223F, -9.1014F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(135, 88).mirror().addBox(-0.9464F, -0.6425F, 1.6153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, 0.0873F, -0.2967F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(94, 137).mirror().addBox(-1.5F, -0.998F, -2.0495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(94, 137).addBox(0.1F, -0.998F, -2.0495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, 1.1271F, -4.4394F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(72, 130).mirror().addBox(-1.0F, -1.9918F, -0.3378F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1535F, -4.1522F, -0.1134F, -0.1745F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(123, 26).addBox(-1.0124F, -0.4783F, -2.1723F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.7F, -0.3465F, -2.8522F, -1.3127F, 0.227F, 0.0165F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(146, 30).addBox(-1.0124F, -1.3545F, -2.7649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.3465F, -2.8522F, -0.8764F, 0.227F, 0.0165F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(136, 46).addBox(-1.0124F, -0.1083F, -1.962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7F, -0.3465F, -2.8522F, -1.4873F, 0.227F, 0.0165F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(136, 14).addBox(-0.0536F, -2.2674F, 0.1638F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, -0.5061F, 0.2967F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(57, 144).addBox(-0.0536F, -1.0406F, 3.4271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, -0.0262F, 0.2967F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(25, 146).addBox(-0.0536F, 0.3988F, 2.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, 0.4974F, 0.2967F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(144, 55).addBox(-0.0536F, 2.1427F, 3.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, 0.7592F, 0.2967F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(135, 88).addBox(-0.0536F, -0.6425F, 1.6153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, 0.0873F, 0.2967F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(72, 130).addBox(0.0F, -1.9918F, -0.3378F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3F, 1.1535F, -4.1522F, -0.1134F, 0.1745F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.0F, 7.6875F, -3.5438F));

		PartDefinition cube_r436 = bone2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(113, 78).addBox(0.8837F, -1.5122F, -4.7426F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.3146F, -4.0438F, 1.5077F, 0.144F, 1.1561F));

		PartDefinition cube_r437 = bone2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(122, 14).addBox(-1.2157F, -1.7122F, -1.5822F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.5146F, -4.0438F, 1.4331F, 0.0759F, 0.5009F));

		PartDefinition cube_r438 = bone2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(40, 106).addBox(-0.5F, -0.1698F, -0.2213F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r439 = bone2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(114, 58).addBox(-0.5F, -3.2651F, -0.96F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r440 = bone2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(72, 105).addBox(-0.5F, -0.3264F, 0.242F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.105F, -3.4807F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r441 = bone2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(102, 77).addBox(-0.5F, -0.3988F, 0.3457F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.105F, -3.4807F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r442 = bone2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(115, 0).addBox(-0.5F, 0.2821F, 0.885F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r443 = bone2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(115, 7).addBox(-0.5F, 1.438F, 2.5714F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r444 = bone2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(143, 122).addBox(-0.5F, -3.0798F, 5.7879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r445 = bone2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(121, 146).addBox(-0.5F, 0.028F, 6.4064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r446 = bone2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(112, 49).addBox(-0.5F, 5.3271F, 1.7499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r447 = bone2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(95, 16).addBox(-0.5F, 0.8435F, 5.8493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r448 = bone2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(63, 74).addBox(-0.5F, -0.0357F, 0.1065F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 0.9425F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.0F, 7.6875F, -3.5438F));

		PartDefinition cube_r449 = bone4.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(113, 78).mirror().addBox(-1.8837F, -1.5122F, -4.7426F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.3146F, -4.0438F, 1.5077F, -0.144F, -1.1561F));

		PartDefinition cube_r450 = bone4.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(122, 14).mirror().addBox(0.2157F, -1.7122F, -1.5822F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.5146F, -4.0438F, 1.4331F, -0.0759F, -0.5009F));

		PartDefinition cube_r451 = bone4.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(40, 106).mirror().addBox(-0.5F, -0.1698F, -0.2213F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r452 = bone4.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(114, 58).mirror().addBox(-0.5F, -3.2651F, -0.96F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r453 = bone4.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(72, 105).mirror().addBox(-0.5F, -0.3264F, 0.242F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.105F, -3.4807F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r454 = bone4.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(102, 77).mirror().addBox(-0.5F, -0.3988F, 0.3457F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.105F, -3.4807F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r455 = bone4.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(115, 0).mirror().addBox(-0.5F, 0.2821F, 0.885F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r456 = bone4.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(115, 7).mirror().addBox(-0.5F, 1.438F, 2.5714F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r457 = bone4.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(143, 122).mirror().addBox(-0.5F, -3.0798F, 5.7879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r458 = bone4.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(121, 146).mirror().addBox(-0.5F, 0.028F, 6.4064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r459 = bone4.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(112, 49).mirror().addBox(-0.5F, 5.3271F, 1.7499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r460 = bone4.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(95, 16).mirror().addBox(-0.5F, 0.8435F, 5.8493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r461 = bone4.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(63, 74).mirror().addBox(-0.5F, -0.0357F, 0.1065F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.795F, -2.0807F, 0.9425F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5399F, 17.5456F, -4.6387F, 0.7529F, 0.0663F, -0.0455F));

		PartDefinition cube_r462 = leftArm.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(122, 65).addBox(-0.5F, -0.0571F, -0.763F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 4.9997F, 0.366F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r463 = leftArm.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(112, 127).addBox(-0.5F, -2.4618F, -0.8581F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 4.9997F, 0.366F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r464 = leftArm.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(127, 108).addBox(-0.3441F, -2.2321F, -1.6097F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.5802F, -0.4892F, 0.1763F));

		PartDefinition cube_r465 = leftArm.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(110, 91).addBox(-0.6433F, -0.4928F, -1.5597F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.4317F, -0.3971F, -0.2345F, -0.4743F, -0.0768F));

		PartDefinition cube_r466 = leftArm.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(127, 102).addBox(-0.6F, -3.2F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4632F, 4.3572F, -0.121F, 1.1181F, -0.4743F, -0.0768F));

		PartDefinition cube_r467 = leftArm.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(77, 43).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(107, 110).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(83, 105).addBox(-0.5909F, 0.8921F, -1.4717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8877F, 8.5232F, 0.1854F, -1.9227F, 1.0435F, -1.6249F));

		PartDefinition cube_r468 = leftArm2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(102, 85).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(47, 129).addBox(-0.6767F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0575F, 12.0329F, -0.2815F, 0.2472F, -0.3222F, -0.0233F));

		PartDefinition cube_r469 = leftArm3.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(143, 125).addBox(-0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.0154F, 5.9502F, -0.051F, 0.0F, 0.0F, -0.829F));

		PartDefinition cube_r470 = leftArm3.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(119, 137).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, -0.951F, -0.5433F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(30, 139).addBox(-0.5945F, 1.0179F, -0.9517F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5399F, 17.5456F, -4.6387F, -0.0325F, -0.0663F, 0.0455F));

		PartDefinition cube_r471 = rightArm.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(72, 123).addBox(-0.5F, -0.0571F, -0.763F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 4.9997F, 0.366F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r472 = rightArm.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(129, 14).addBox(-0.5F, -2.4618F, -0.8581F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 4.9997F, 0.366F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r473 = rightArm.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(128, 90).addBox(-0.6559F, -2.2321F, -1.6097F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.5802F, 0.4892F, -0.1763F));

		PartDefinition cube_r474 = rightArm.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(112, 41).addBox(-0.3567F, -0.4928F, -1.5597F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.4317F, -0.3971F, -0.2345F, 0.4743F, 0.0768F));

		PartDefinition cube_r475 = rightArm.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(65, 128).addBox(-0.4F, -3.2F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 4.3572F, -0.121F, 1.1181F, 0.4743F, 0.0768F));

		PartDefinition cube_r476 = rightArm.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(132, 25).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(49, 112).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.8877F, 8.5232F, 0.1854F, -1.7797F, -0.5805F, 1.4334F));

		PartDefinition cube_r477 = rightArm2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(35, 106).addBox(-0.5F, -5.5F, -0.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0909F, 6.3921F, -0.8717F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r478 = rightArm2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(127, 114).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(52, 129).addBox(-0.3233F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0575F, 12.0329F, -0.2815F, 0.4254F, -0.2038F, -0.7168F));

		PartDefinition cube_r479 = rightArm3.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(146, 99).addBox(-12.0848F, 0.8221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(11.4616F, 8.1729F, 10.4465F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r480 = rightArm3.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(124, 137).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, -0.951F, -0.5433F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(139, 58).addBox(-0.4055F, 1.0179F, -0.9517F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0549F, 9.322F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r481 = tail.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(13, 131).addBox(0.0F, -6.3908F, 0.0315F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3599F, 10.9214F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r482 = tail.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(79, 127).addBox(0.0F, -6.5257F, 0.0329F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4599F, 8.9214F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r483 = tail.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(10, 131).addBox(0.0F, -6.4607F, 0.0344F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 6.9214F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r484 = tail.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(7, 131).addBox(0.0F, -6.4956F, 0.0341F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 4.9214F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r485 = tail.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(34, 130).addBox(0.0F, -6.3305F, 0.0338F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 2.9214F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r486 = tail.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(43, 125).addBox(0.0F, -6.6654F, 0.0352F, 0.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6599F, -0.0786F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r487 = tail.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(5, 142).mirror().addBox(-2.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(139, 141).mirror().addBox(-2.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 114).mirror().addBox(-2.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 112).mirror().addBox(-2.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 141).mirror().addBox(-2.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 110).mirror().addBox(-2.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 108).mirror().addBox(-3.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 142).addBox(0.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 141).addBox(0.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 114).addBox(0.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 112).addBox(0.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 141).addBox(0.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 110).addBox(0.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 108).addBox(1.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3401F, -2.0786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r488 = tail.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(82, 127).addBox(0.0F, -0.6133F, -0.5652F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.46F, 12.6878F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r489 = tail.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(104, 113).addBox(0.0F, -0.2618F, -0.0769F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.56F, 9.5878F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r490 = tail.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(54, 137).addBox(0.0F, -0.4678F, -0.5986F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.249F, 5.0168F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r491 = tail.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(116, 133).addBox(0.0F, 0.0322F, -0.1986F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.56F, 7.1878F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(142, 18).addBox(0.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 20).addBox(-0.1F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 22).addBox(-0.1F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 142).addBox(-0.2F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 58).addBox(0.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 102).addBox(0.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 18).mirror().addBox(-2.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(142, 20).mirror().addBox(-1.9F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(142, 22).mirror().addBox(-1.9F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 142).mirror().addBox(-1.8F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 58).mirror().addBox(-1.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(121, 102).mirror().addBox(-1.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1401F, 12.9214F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r492 = tail2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(104, 136).addBox(0.0F, -5.5F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r493 = tail2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(24, 139).addBox(0.0F, -4.6F, 1.7F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 139).addBox(0.0F, -3.8F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r494 = tail2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(21, 139).addBox(0.0F, -4.1F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r495 = tail2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(139, 18).addBox(0.0F, -4.7F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r496 = tail2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(101, 136).addBox(0.0F, -5.1F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 4.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r497 = tail2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(82, 136).addBox(0.0F, -5.4F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r498 = tail2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(136, 59).addBox(0.0F, -1.3887F, -0.385F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 12.2858F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r499 = tail2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(44, 136).addBox(0.0F, -1.3578F, -0.4952F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 10.0858F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r500 = tail2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(76, 135).addBox(0.0F, -0.4446F, -0.3556F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 7.3868F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r501 = tail2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(91, 131).addBox(0.0F, -0.2364F, -0.1492F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2199F, 4.2664F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r502 = tail2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(88, 131).addBox(0.0F, -0.1989F, -0.1464F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4199F, 1.8664F, 0.7679F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(33, 26).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, 0.0616F, 0.1307F, 0.008F));

		PartDefinition cube_r503 = tail3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(45, 145).addBox(0.0F, -2.4184F, 0.0367F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 13.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r504 = tail3.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(103, 144).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 11.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r505 = tail3.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(100, 144).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 9.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r506 = tail3.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(88, 144).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r507 = tail3.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(85, 144).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 5.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r508 = tail3.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(144, 82).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r509 = tail3.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(31, 113).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r510 = tail3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(82, 144).addBox(0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2919F, 10.8423F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r511 = tail3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(97, 141).addBox(0.0F, -0.1F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.34F, 8.5956F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r512 = tail3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(80, 112).addBox(0.0F, -0.5F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2764F, 6.1551F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r513 = tail3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(50, 99).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0754F, 4.1034F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r514 = tail3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(27, 139).addBox(0.0F, -0.6477F, -0.1361F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 1.3858F, 0.7767F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(31, 43).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition cube_r515 = tail4.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(141, 146).addBox(0.0F, -3.0848F, 3.6797F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 146).addBox(0.0F, -2.3924F, 1.7899F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 146).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 9.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r516 = tail4.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(132, 146).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r517 = tail4.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(129, 146).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 5.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r518 = tail4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(126, 146).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r519 = tail4.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(51, 145).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r520 = tail4.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(96, 146).addBox(0.0F, -0.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6925F, 11.4376F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r521 = tail4.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(12, 140).addBox(0.0F, 0.0137F, -0.0255F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6035F, 9.0108F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r522 = tail4.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(72, 139).addBox(0.0F, 0.0394F, -0.1148F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5525F, 6.6858F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r523 = tail4.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(85, 118).addBox(0.0F, -0.2247F, 0.0239F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9525F, 4.3858F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r524 = tail4.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(24, 102).addBox(0.0F, -0.0324F, -0.1146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1525F, 2.2858F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r525 = tail4.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(48, 145).addBox(0.0F, -0.8325F, -0.2145F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1173F, -0.0161F, 0.7941F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 24.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0094F, 14.0654F, -0.1084F, 0.2603F, -0.028F));

		PartDefinition cube_r526 = tail5.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(57, 147).addBox(0.0F, 18.6F, 32.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 147).addBox(0.0F, 17.4F, 30.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5577F, -28.175F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r527 = tail5.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(39, 147).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.589F, 5.4188F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r528 = tail5.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(19, 117).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7756F, 3.1439F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r529 = tail5.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(147, 0).addBox(0.0F, 0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0708F, -0.3206F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r530 = tail5.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(36, 147).addBox(0.0F, -5.2907F, 12.0205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 147).addBox(0.0F, -4.5907F, 10.1205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 147).addBox(0.0F, -3.9907F, 8.3205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 147).addBox(0.0F, -3.3907F, 6.4205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 147).addBox(0.0F, -2.7907F, 4.5205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 147).addBox(0.0F, -2.3907F, 2.7205F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 146).addBox(0.0F, -1.6907F, 0.8205F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3665F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 153, 153);
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