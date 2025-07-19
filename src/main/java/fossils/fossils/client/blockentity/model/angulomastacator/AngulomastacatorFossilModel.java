package fossils.fossils.client.blockentity.model.angulomastacator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AngulomastacatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public AngulomastacatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck = this.neck5.getChild("neck");
		this.heads = this.neck.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -41.8655F, 1.016F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(120, 144).mirror().addBox(-0.5333F, -1.8711F, 5.6798F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4338F, 12.2666F, 15.6679F, -0.9872F, 0.0972F, -0.0989F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(143, 6).mirror().addBox(-0.8547F, -1.8973F, 3.2985F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4338F, 12.2666F, 15.6679F, -1.2944F, 0.0408F, -0.2135F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(113, 96).mirror().addBox(-0.5333F, -0.1478F, -0.1359F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4338F, 12.2666F, 15.6679F, -0.7603F, 0.0972F, -0.0989F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(145, 135).mirror().addBox(-0.5512F, -0.017F, -3.0669F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1229F, 2.4914F, -7.2144F, 0.5402F, 0.1302F, -0.0138F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(138, 13).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.692F, 7.3246F, 7.9774F, -0.7307F, 0.2963F, 0.016F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.8558F, -2.0093F, -0.5748F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 7.0666F, 2.5679F, -0.4363F, 0.1396F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(117, 87).mirror().addBox(-0.1632F, -1.9686F, 0.038F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8338F, 10.4666F, 9.9679F, -0.6169F, 0.3022F, -0.1465F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(154, 146).mirror().addBox(-0.2828F, -0.5475F, -0.5737F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3475F, -0.0697F, 10.2449F, -0.1499F, -0.2906F, 0.0742F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(102, 148).mirror().addBox(-0.5842F, -1.0942F, -0.0151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -2.8374F, -2.3098F, -0.097F, 0.1301F, -0.0149F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(157, 0).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.9319F, -1.3544F, -9.0457F, 0.5837F, 0.1301F, -0.0149F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 115).mirror().addBox(-0.6671F, 0.0408F, -6.0842F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -4.9374F, -2.7098F, 0.3219F, 0.1301F, -0.0149F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(159, 98).mirror().addBox(-3.0F, -1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(159, 98).addBox(1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8899F, 10.2625F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(146, 55).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-4.5648F, -3.3262F, 1.7767F, -0.7596F, 0.1308F, -0.0057F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(147, 155).mirror().addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9319F, -1.3544F, -9.0457F, 0.1125F, 0.1301F, -0.0149F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(146, 49).mirror().addBox(-0.2993F, -0.0863F, 0.0141F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -5.4374F, 0.1902F, 0.0084F, 0.1308F, -0.0057F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(145, 123).mirror().addBox(-0.2999F, 0.0067F, -3.0226F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -5.5374F, 0.1902F, 0.2172F, 0.1301F, -0.0149F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(145, 111).mirror().addBox(-0.2828F, 0.3941F, -0.1442F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.3475F, -0.0697F, 10.2449F, 0.6704F, -0.2906F, 0.0742F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(140, 25).mirror().addBox(0.7419F, 0.0664F, 1.091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4829F, -5.6205F, 3.2377F, -0.6319F, -0.1842F, 0.1333F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(149, 12).mirror().addBox(0.0815F, 0.2017F, -0.4324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4829F, -5.6205F, 3.2377F, -0.569F, -0.071F, 0.0508F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 139).mirror().addBox(1.0346F, 0.0664F, 0.8029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.4829F, -5.6205F, 3.2377F, -0.6751F, -0.3786F, 0.2877F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(17, 113).mirror().addBox(0.4829F, -0.0053F, -0.022F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4829F, -5.6205F, 3.2377F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(9, 145).mirror().addBox(-0.2828F, -1.6158F, -0.6228F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3475F, -0.0697F, 10.2449F, -0.0452F, -0.2906F, 0.0742F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(136, 66).mirror().addBox(-0.1942F, -0.1328F, -0.9292F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -2.1205F, 7.6377F, -0.1897F, -0.1996F, 0.0638F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(157, 113).mirror().addBox(-1.8648F, 3.61F, 2.3902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 7.0666F, 2.4679F, 0.5627F, 0.401F, 0.0166F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(108, 127).mirror().addBox(-0.5898F, -0.6818F, -0.5814F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4777F, 6.1057F, -1.6755F, -0.4696F, 0.1912F, 0.0169F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(118, 18).mirror().addBox(0.0836F, -0.5568F, -0.0631F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4777F, 7.9057F, 2.0245F, -0.33F, 0.1912F, 0.0169F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(134, 123).mirror().addBox(-0.6074F, -0.8645F, -4.0571F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7338F, 7.0666F, 7.0679F, -1.1616F, 0.1845F, -0.0347F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(51, 110).mirror().addBox(-0.6F, -1.5F, -3.4F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.2472F, 7.2933F, -8.4805F, -1.4815F, 0.127F, 0.0318F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 123).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.0205F, 6.5931F, -6.8799F, 0.77F, 0.127F, 0.0318F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(127, 144).mirror().addBox(-0.5F, -0.8F, -0.6F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1229F, 3.3914F, -6.9144F, -0.2801F, 0.1302F, -0.0138F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(93, 107).mirror().addBox(-1.0753F, -3.0177F, -4.8227F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8777F, 4.9057F, -1.8755F, 0.2253F, 0.1285F, -0.0251F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(97, 62).mirror().addBox(-0.2171F, 2.6005F, 0.7544F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 62).addBox(5.7829F, 2.6005F, 0.7544F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7829F, -2.1205F, 6.6377F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(55, 102).mirror().addBox(-4.0F, 2.6F, 1.8F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 102).addBox(1.0F, 2.6F, 1.8F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0114F, -2.0615F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.2171F, -0.2919F, -3.8938F, 1.0F, 10.0F, 8.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(78, 47).addBox(8.7829F, -0.2919F, -3.8938F, 1.0F, 10.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.7829F, -2.8205F, 4.3377F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(149, 17).mirror().addBox(-0.1967F, 0.7517F, -1.7362F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -1.1205F, 3.7377F, 0.3041F, -0.209F, 0.013F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 132).mirror().addBox(-0.9682F, -1.9526F, -3.9496F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, 1.3795F, 10.4377F, 0.0023F, -0.1996F, 0.0638F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(146, 55).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.5648F, -3.3262F, 1.7767F, -0.7596F, -0.1308F, 0.0057F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(157, 0).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.9319F, -1.3544F, -9.0457F, 0.5837F, -0.1301F, 0.0149F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(147, 155).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9319F, -1.3544F, -9.0457F, 0.1125F, -0.1301F, 0.0149F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(146, 49).addBox(-0.7007F, -0.0863F, 0.0141F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.988F, -5.4374F, 0.1902F, 0.0084F, -0.1308F, 0.0057F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(32, 115).addBox(-0.3329F, 0.0408F, -6.0842F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.988F, -4.9374F, -2.7098F, 0.3219F, -0.1301F, 0.0149F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(102, 148).addBox(-0.4158F, -1.0942F, -0.0151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.988F, -2.8374F, -2.3098F, -0.097F, -0.1301F, 0.0149F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(145, 123).addBox(-0.7001F, 0.0067F, -3.0226F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.988F, -5.5374F, 0.1902F, 0.2172F, -0.1301F, 0.0149F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(145, 111).addBox(-0.7172F, 0.3941F, -0.1442F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.3475F, -0.0697F, 10.2449F, 0.6704F, 0.2906F, -0.0742F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(140, 25).addBox(-1.7419F, 0.0664F, 1.091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4829F, -5.6205F, 3.2377F, -0.6319F, 0.1842F, -0.1333F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(149, 12).addBox(-1.0815F, 0.2017F, -0.4324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4829F, -5.6205F, 3.2377F, -0.569F, 0.071F, -0.0508F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(10, 139).addBox(-2.0346F, 0.0664F, 0.8029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.4829F, -5.6205F, 3.2377F, -0.6751F, 0.3786F, -0.2877F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(17, 113).addBox(-1.4829F, -0.0053F, -0.022F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4829F, -5.6205F, 3.2377F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(154, 146).addBox(-0.7172F, -0.5475F, -0.5737F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3475F, -0.0697F, 10.2449F, -0.1499F, 0.2906F, -0.0742F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(9, 145).addBox(-0.7172F, -1.6158F, -0.6228F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3475F, -0.0697F, 10.2449F, -0.0452F, 0.2906F, -0.0742F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(136, 66).addBox(-0.8058F, -0.1328F, -0.9292F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7829F, -2.1205F, 7.6377F, -0.1897F, 0.1996F, -0.0638F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(157, 113).addBox(0.8648F, 3.61F, 2.3902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1338F, 7.0666F, 2.4679F, 0.5627F, -0.401F, -0.0166F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(120, 144).addBox(-0.4667F, -1.8711F, 5.6798F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4338F, 12.2666F, 15.6679F, -0.9872F, -0.0972F, 0.0989F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(143, 6).addBox(-0.1453F, -1.8973F, 3.2985F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4338F, 12.2666F, 15.6679F, -1.2944F, -0.0408F, 0.2135F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(113, 96).addBox(-0.4667F, -0.1478F, -0.1359F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4338F, 12.2666F, 15.6679F, -0.7603F, -0.0972F, 0.0989F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(117, 87).addBox(-0.8368F, -1.9686F, 0.038F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8338F, 10.4666F, 9.9679F, -0.6169F, -0.3022F, 0.1465F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 92).addBox(-0.1442F, -2.0093F, -0.5748F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.1338F, 7.0666F, 2.5679F, -0.4363F, -0.1396F, 0.0F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(108, 127).addBox(-0.4102F, -0.6818F, -0.5814F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.4777F, 6.1057F, -1.6755F, -0.4696F, -0.1912F, -0.0169F));

		PartDefinition cube_r59 = hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(118, 18).addBox(-1.0836F, -0.5568F, -0.0631F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.4777F, 7.9057F, 2.0245F, -0.33F, -0.1912F, -0.0169F));

		PartDefinition cube_r60 = hips.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(134, 123).addBox(-0.3926F, -0.8645F, -4.0571F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7338F, 7.0666F, 7.0679F, -1.1616F, -0.1845F, 0.0347F));

		PartDefinition cube_r61 = hips.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(138, 13).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.692F, 7.3246F, 7.9774F, -0.7307F, -0.2963F, -0.016F));

		PartDefinition cube_r62 = hips.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(51, 110).addBox(-0.4F, -1.5F, -3.4F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.2472F, 7.2933F, -8.4805F, -1.4815F, -0.127F, -0.0318F));

		PartDefinition cube_r63 = hips.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(62, 123).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.0205F, 6.5931F, -6.8799F, 0.77F, -0.127F, -0.0318F));

		PartDefinition cube_r64 = hips.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(145, 135).addBox(-0.4488F, -0.017F, -3.0669F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.1229F, 2.4914F, -7.2144F, 0.5402F, -0.1302F, 0.0138F));

		PartDefinition cube_r65 = hips.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(127, 144).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.1229F, 3.3914F, -6.9144F, -0.2801F, -0.1302F, 0.0138F));

		PartDefinition cube_r66 = hips.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(93, 107).addBox(0.0753F, -3.0177F, -4.8227F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8777F, 4.9057F, -1.8755F, 0.2253F, -0.1285F, 0.0251F));

		PartDefinition cube_r67 = hips.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(149, 17).addBox(-0.8033F, 0.7517F, -1.7362F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.7829F, -1.1205F, 3.7377F, 0.3041F, 0.209F, -0.013F));

		PartDefinition cube_r68 = hips.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(88, 132).addBox(-0.0318F, -1.9526F, -3.9496F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7829F, 1.3795F, 10.4377F, 0.0023F, 0.1996F, -0.0638F));

		PartDefinition cube_r69 = hips.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(39, 48).addBox(-1.0F, -0.1F, 1.0F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r70 = hips.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(78, 26).addBox(-0.002F, -0.1674F, -0.1453F, 0.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.2316F, 5.0419F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r71 = hips.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(21, 131).addBox(-0.02F, 0.2296F, -0.1333F, 0.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.1316F, -2.8581F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r72 = hips.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(75, 68).addBox(0.0F, -0.1183F, -5.8227F, 0.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.1316F, 2.8419F, 0.0611F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 0.8654F, 2.625F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(26, 142).addBox(-0.5F, -0.1117F, -3.0811F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.9318F, 3.1103F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(65, 150).addBox(-0.5F, 1.7586F, 3.486F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6318F, -0.8897F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(76, 102).addBox(-1.5F, -2.7619F, -2.8279F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 0.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(92, 68).addBox(-1.0F, -0.092F, -0.6185F, 2.0F, 15.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(96, 11).addBox(-1.5F, 14.6855F, -1.0616F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.9151F, -0.161F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(104, 141).addBox(-0.5F, -5.7F, -2.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 8.3354F, 0.1996F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(147, 40).addBox(0.55F, -1.3931F, -1.9712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.15F, 19.9674F, -1.4373F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(151, 92).addBox(-0.5F, -0.0911F, -1.9312F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 49).addBox(-0.5F, -0.0911F, -0.9312F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.7354F, 0.6996F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(104, 134).addBox(-1.0F, -1.3F, -1.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 21.1878F, -2.1211F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(97, 40).addBox(-1.0F, -1.4F, -2.5F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 4.0324F, -1.076F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(81, 113).addBox(-1.9F, -0.3535F, -0.1188F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4544F, -3.5228F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(131, 46).addBox(-1.0F, -0.171F, -1.1357F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 4.9021F, 1.431F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(131, 26).addBox(-1.0F, 0.0379F, -1.9739F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 14.0346F, 0.0747F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(99, 118).addBox(-1.0F, -5.0F, -0.8F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9F, 9.0346F, -0.9253F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(46, 128).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 23.1528F, -2.9908F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(94, 88).addBox(-3.0F, -1.4696F, -3.8933F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(84, 0).addBox(-3.0F, -1.4F, -4.9F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1995F, -4.5791F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 0.8654F, 2.625F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 143).addBox(-0.5F, -0.1117F, -3.0811F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.9318F, 3.1103F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(150, 65).addBox(-0.5F, 1.7586F, 3.486F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6318F, -0.8897F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(34, 104).addBox(-1.5F, -2.7619F, -2.8279F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 0.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(21, 93).addBox(-1.0F, -0.092F, -0.6185F, 2.0F, 15.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(94, 96).addBox(-1.5F, 14.6855F, -1.0616F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.9151F, -0.161F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(140, 141).addBox(-0.5F, -5.7F, -2.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 8.3354F, 0.1996F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(147, 72).addBox(-1.55F, -1.3931F, -1.9712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.15F, 19.9674F, -1.4373F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(152, 28).addBox(-0.5F, -0.0911F, -1.9312F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 128).addBox(-0.5F, -0.0911F, -0.9312F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.7354F, 0.6996F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(26, 135).addBox(-1.0F, -1.3F, -1.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 21.1878F, -2.1211F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(97, 51).addBox(-1.0F, -1.4F, -2.5F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 4.0324F, -1.076F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(90, 118).addBox(-0.1F, -0.3535F, -0.1188F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4544F, -3.5228F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(131, 56).addBox(-1.0F, -0.171F, -1.1357F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 4.9021F, 1.431F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(131, 36).addBox(-1.0F, 0.0379F, -1.9739F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 14.0346F, 0.0747F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(122, 68).addBox(-1.0F, -5.0F, -0.8F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9F, 9.0346F, -0.9253F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(128, 96).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 23.1528F, -2.9908F, -0.6981F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(95, 22).addBox(-3.0F, -1.4696F, -3.8933F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.6196F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(25, 84).addBox(-3.0F, -1.4F, -4.9F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1995F, -4.5791F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -0.6554F, -11.0243F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7114F, -4.2632F, -0.0792F, 0.1305F, -0.0103F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(37, 135).addBox(0.0F, -9.8073F, -0.1222F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5554F, -13.9243F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(115, 134).addBox(0.0F, -8.8504F, -0.0117F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5554F, -17.0243F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(140, 130).addBox(0.0F, -7.86F, -0.0868F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8554F, -19.9243F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, -0.0809F, -9.9753F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5554F, -11.0243F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(133, 13).addBox(0.0F, -9.5377F, -1.9741F, 0.0F, 10.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6554F, -0.0243F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(132, 131).addBox(0.0F, -9.33F, 0.0104F, 0.0F, 10.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6554F, -5.0243F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(51, 137).addBox(0.0F, -9.3576F, -0.0985F, 0.0F, 10.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6554F, -7.9243F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(113, 105).mirror().addBox(-3.916F, -0.1946F, 2.4166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 105).mirror().addBox(-3.916F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -1.1303F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-3.416F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -4.1303F, -0.2056F, -0.0503F, -0.2215F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(143, 92).mirror().addBox(-2.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -7.1303F, -0.0828F, -0.2515F, -1.08F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(158, 106).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -7.1303F, -0.1657F, -0.1321F, -0.652F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(155, 59).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -10.1303F, -0.0828F, -0.2515F, -1.08F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(157, 129).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -10.1303F, -0.1657F, -0.1321F, -0.652F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(139, 102).mirror().addBox(-5.8936F, -2.4262F, -0.2666F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -13.2303F, 0.1097F, -0.0998F, -1.4318F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(101, 161).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -13.2303F, 0.0572F, -0.1368F, -0.9939F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(147, 47).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -13.2303F, 0.008F, -0.0855F, -0.5578F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(161, 110).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, -16.3303F, 0.1617F, -0.0035F, -0.5617F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(161, 148).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, -16.3303F, 0.1619F, 0.0025F, -0.9979F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(111, 66).mirror().addBox(-11.8936F, -2.4262F, -0.2666F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, -16.3303F, 0.1459F, 0.0704F, -1.4293F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(84, 9).mirror().addBox(-16.8936F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0044F, -19.2303F, 0.1687F, 0.1899F, -1.3904F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(147, 161).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0044F, -19.2303F, 0.2325F, 0.1016F, -0.9583F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(161, 108).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0044F, -19.2303F, 0.2675F, 0.0566F, -0.5229F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(113, 105).addBox(-0.084F, -0.1946F, 2.4166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 105).addBox(-0.084F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -1.1303F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(27, 65).addBox(-0.584F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -4.1303F, -0.2056F, 0.0503F, 0.2215F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(143, 92).addBox(1.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -7.1303F, -0.0828F, 0.2515F, 1.08F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(158, 106).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -7.1303F, -0.1657F, 0.1321F, 0.652F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(155, 59).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -10.1303F, -0.0828F, 0.2515F, 1.08F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(157, 129).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -10.1303F, -0.1657F, 0.1321F, 0.652F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(139, 102).addBox(2.8936F, -2.4262F, -0.2666F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -13.2303F, 0.1097F, 0.0998F, 1.4318F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(101, 161).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -13.2303F, 0.0572F, 0.1368F, 0.9939F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(147, 47).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -13.2303F, 0.008F, 0.0855F, 0.5578F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(161, 110).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, -16.3303F, 0.1617F, 0.0035F, 0.5617F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(161, 148).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, -16.3303F, 0.1619F, -0.0025F, 0.9979F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(111, 66).addBox(2.8936F, -2.4262F, -0.2666F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, -16.3303F, 0.1459F, -0.0704F, 1.4293F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(84, 9).addBox(2.8936F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0044F, -19.2303F, 0.1687F, -0.1899F, 1.3904F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(147, 161).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0044F, -19.2303F, 0.2325F, -0.1016F, 0.9583F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(161, 108).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0044F, -19.2303F, 0.2675F, -0.0566F, 0.5229F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(82, 134).addBox(0.0F, -9.6F, 0.0F, 0.0F, 10.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6554F, -11.0243F, -0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2879F, -20.8503F, -0.2175F, -0.0945F, -0.0257F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(72, 141).addBox(0.0F, -6.9022F, -0.104F, 0.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2659F, -2.1582F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(56, 143).addBox(0.0F, -6.3781F, -2.1018F, 0.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2341F, -2.9582F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(105, 78).addBox(-1.0F, -0.0448F, -0.0381F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.7341F, -5.6582F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(87, 147).addBox(0.0F, -6.1784F, 0.0244F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.5341F, -6.9582F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(119, 157).addBox(0.0F, -5.5339F, 0.0426F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.6341F, -8.4582F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(26, 158).addBox(0.0F, -4.7134F, -0.0864F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.3341F, -9.6582F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(108, 107).addBox(-1.0F, -0.0865F, -1.1546F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.3341F, -8.9582F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(161, 133).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.2911F, -15.1139F, 1.0329F, 0.6986F, -0.2792F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(161, 131).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.7911F, -13.7139F, 0.9257F, 0.6717F, -0.3471F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(95, 30).mirror().addBox(-0.6504F, 0.8291F, 2.3866F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.2066F, 0.2592F, 0.4993F, -0.5352F, -0.1564F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(119, 153).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.2066F, 0.2592F, 0.1852F, -0.5352F, -0.1564F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.6504F, 0.8291F, 2.3866F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.2066F, 0.2592F, 0.4768F, -0.6439F, -0.1457F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(102, 153).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.2066F, 0.2592F, 0.1627F, -0.6439F, -0.1457F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.6504F, 0.8291F, 2.3866F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.2066F, 0.2592F, 0.4055F, -0.7738F, -0.1023F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(152, 88).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.2066F, 0.2592F, 0.0914F, -0.7738F, -0.1023F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(161, 154).mirror().addBox(-4.8936F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.2911F, -15.1139F, -0.1119F, 1.1114F, -1.6475F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(162, 44).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.2911F, -15.1139F, 0.6484F, 0.985F, -0.7848F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(62, 131).mirror().addBox(-1.1837F, -1.7122F, -5.4426F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 20.0021F, -8.9876F, 1.5077F, -0.144F, -1.1561F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(87, 139).mirror().addBox(0.2156F, -1.7122F, -2.5822F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 20.0021F, -8.9876F, 1.4331F, -0.0759F, -0.5009F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(139, 94).mirror().addBox(-0.5F, 0.0375F, -3.047F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.016F)).mirror(false)
				.texOffs(139, 94).addBox(10.5F, 0.0375F, -3.047F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-5.5F, 18.3818F, -11.2207F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(-0.5F, -0.0509F, 1.0292F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(27, 68).addBox(10.5F, -0.0509F, 1.0292F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.5F, 10.5925F, -7.0246F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(66, 113).mirror().addBox(-0.5F, -0.0286F, -6.0801F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(66, 113).addBox(10.5F, -0.0286F, -6.0801F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.5F, 12.9925F, -8.6246F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(121, 131).mirror().addBox(-0.5F, -0.1624F, 0.0685F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(121, 131).addBox(10.5F, -0.1624F, 0.0685F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.5F, 13.1925F, -8.6246F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(161, 36).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.4911F, -8.7139F, 0.6547F, 0.4812F, -0.7706F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(159, 96).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.4911F, -8.7139F, 0.795F, 0.24F, -0.3803F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(55, 24).mirror().addBox(-19.729F, -1.955F, -0.2993F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.4911F, -8.7139F, 0.3956F, 0.7044F, -1.2261F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(10, 131).mirror().addBox(-0.5F, -2.9111F, -4.0208F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(10, 131).addBox(10.5F, -2.9111F, -4.0208F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.5F, 13.3494F, -2.867F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(152, 84).mirror().addBox(-0.1319F, 0.0563F, 0.0018F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 22.1066F, -0.4408F, 0.2558F, -1.1648F, -0.108F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(125, 112).mirror().addBox(-0.1319F, 0.9644F, 2.8401F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 22.1066F, -0.4408F, 0.57F, -1.1648F, -0.108F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(41, 152).mirror().addBox(-0.1106F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.8066F, -0.4408F, 0.1988F, -1.0098F, -0.1268F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(122, 81).mirror().addBox(-0.1106F, 0.5192F, 3.0667F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.8066F, -0.4408F, 0.513F, -1.0098F, -0.1268F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(152, 36).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.2066F, 0.2592F, 0.2032F, -0.9221F, -0.1822F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(121, 116).mirror().addBox(-0.6504F, 0.8291F, 2.3866F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 22.2066F, 0.2592F, 0.5173F, -0.9221F, -0.1822F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(162, 10).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.7911F, -13.7139F, 0.5464F, 0.9207F, -0.8681F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(151, 100).mirror().addBox(-5.8936F, -2.4262F, -0.2666F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.7911F, -13.7139F, -0.0991F, 1.0243F, -1.6363F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(136, 121).mirror().addBox(-8.7415F, -1.9518F, -0.3082F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.1911F, -12.4139F, 0.0265F, 0.8737F, -1.4682F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(161, 152).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.1911F, -12.4139F, 0.4865F, 0.7583F, -0.8471F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(161, 146).mirror().addBox(-1.4539F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.1911F, -12.4139F, 0.7874F, 0.5486F, -0.3609F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(159, 94).mirror().addBox(-1.4539F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.5911F, -11.2139F, 0.8626F, 0.3258F, -0.4008F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(161, 137).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.5911F, -11.2139F, 0.6864F, 0.5852F, -0.794F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(55, 26).mirror().addBox(-11.7415F, -1.9518F, -0.3082F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.5911F, -11.2139F, 0.3636F, 0.8094F, -1.2876F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-17.7415F, -1.9518F, -0.3082F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.0911F, -9.9139F, 0.3735F, 0.7584F, -1.2732F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(12, 161).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.0911F, -9.9139F, 0.6657F, 0.5368F, -0.7976F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(159, 92).mirror().addBox(-1.4539F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.0911F, -9.9139F, 0.8262F, 0.2878F, -0.4045F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(161, 139).mirror().addBox(-1.4539F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.9911F, -7.6139F, 0.7422F, 0.2455F, -0.3582F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(161, 150).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.9911F, -7.6139F, 0.5992F, 0.4664F, -0.7612F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(55, 22).mirror().addBox(-20.7415F, -1.9518F, -0.3082F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.9911F, -7.6139F, 0.3467F, 0.6693F, -1.2223F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(77, 159).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.1911F, -5.8139F, 0.6688F, 0.2376F, -0.3914F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(157, 160).mirror().addBox(-3.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.1911F, -5.8139F, 0.5302F, 0.4307F, -0.8067F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(55, 18).mirror().addBox(-21.7647F, -1.946F, -0.3188F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.1911F, -5.8139F, 0.2971F, 0.6097F, -1.2676F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(70, 159).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6911F, -3.6139F, 0.6189F, 0.2184F, -0.4197F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(161, 135).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6911F, -3.6139F, 0.4901F, 0.3935F, -0.8398F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(55, 20).mirror().addBox(-21.765F, -1.9458F, -0.318F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6911F, -3.6139F, 0.2774F, 0.5601F, -1.2955F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(160, 100).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1911F, -1.0139F, 0.4493F, 0.3456F, -0.8722F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(55, 16).mirror().addBox(-21.8936F, -2.4262F, -0.2666F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1911F, -1.0139F, 0.262F, 0.5003F, -1.3209F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(158, 144).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1911F, -1.0139F, 0.5634F, 0.1903F, -0.4486F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(130, 7).mirror().addBox(-1.25F, -1.2161F, -1.3273F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 7).addBox(1.15F, -1.2161F, -1.3273F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 23.5939F, -4.7587F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(62, 131).addBox(0.1837F, -1.7122F, -5.4426F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 20.0021F, -8.9876F, 1.5077F, 0.144F, 1.1561F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(87, 139).addBox(-1.2156F, -1.7122F, -2.5822F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 20.0021F, -8.9876F, 1.4331F, 0.0759F, 0.5009F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(161, 36).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.4911F, -8.7139F, 0.6547F, -0.4812F, 0.7706F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(159, 96).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.4911F, -8.7139F, 0.795F, -0.24F, 0.3803F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(55, 24).addBox(2.729F, -1.955F, -0.2993F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.4911F, -8.7139F, 0.3956F, -0.7044F, 1.2261F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(152, 84).addBox(-0.8681F, 0.0563F, 0.0018F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 22.1066F, -0.4408F, 0.2558F, 1.1648F, 0.108F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(125, 112).addBox(-0.8681F, 0.9644F, 2.8401F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 22.1066F, -0.4408F, 0.57F, 1.1648F, 0.108F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(41, 152).addBox(-0.8894F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.8066F, -0.4408F, 0.1988F, 1.0098F, 0.1268F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(122, 81).addBox(-0.8894F, 0.5192F, 3.0667F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.8066F, -0.4408F, 0.513F, 1.0098F, 0.1268F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(119, 153).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.2066F, 0.2592F, 0.1852F, 0.5352F, 0.1564F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(95, 30).addBox(-0.3496F, 0.8291F, 2.3866F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.2066F, 0.2592F, 0.4993F, 0.5352F, 0.1564F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(102, 153).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.2066F, 0.2592F, 0.1627F, 0.6439F, 0.1457F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 104).addBox(-0.3496F, 0.8291F, 2.3866F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.2066F, 0.2592F, 0.4768F, 0.6439F, 0.1457F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(152, 88).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.2066F, 0.2592F, 0.0914F, 0.7738F, 0.1023F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 113).addBox(-0.3496F, 0.8291F, 2.3866F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.2066F, 0.2592F, 0.4055F, 0.7738F, 0.1023F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(152, 36).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.2066F, 0.2592F, 0.2032F, 0.9221F, 0.1822F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(121, 116).addBox(-0.3496F, 0.8291F, 2.3866F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 22.2066F, 0.2592F, 0.5173F, 0.9221F, 0.1822F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(26, 149).addBox(-0.25F, -0.9369F, 2.7034F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 23.5939F, -4.7587F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(161, 133).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 14.2911F, -15.1139F, 1.0329F, -0.6986F, 0.2792F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(162, 44).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 14.2911F, -15.1139F, 0.6484F, -0.985F, 0.7848F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(161, 154).addBox(2.8936F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 14.2911F, -15.1139F, -0.1119F, -1.1114F, 1.6475F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(162, 10).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 12.7911F, -13.7139F, 0.5464F, -0.9207F, 0.8681F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(161, 131).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 12.7911F, -13.7139F, 0.9257F, -0.6717F, 0.3471F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(151, 100).addBox(2.8936F, -2.4262F, -0.2666F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 12.7911F, -13.7139F, -0.0991F, -1.0243F, 1.6363F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(136, 121).addBox(2.7415F, -1.9518F, -0.3082F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.1911F, -12.4139F, 0.0265F, -0.8737F, 1.4682F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(161, 152).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.1911F, -12.4139F, 0.4865F, -0.7583F, 0.8471F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(161, 146).addBox(-0.5461F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.1911F, -12.4139F, 0.7874F, -0.5486F, 0.3609F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(159, 94).addBox(-0.5461F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.5911F, -11.2139F, 0.8626F, -0.3258F, 0.4008F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(161, 137).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.5911F, -11.2139F, 0.6864F, -0.5852F, 0.794F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(55, 26).addBox(2.7415F, -1.9518F, -0.3082F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.5911F, -11.2139F, 0.3636F, -0.8094F, 1.2876F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(78, 66).addBox(2.7415F, -1.9518F, -0.3082F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.0911F, -9.9139F, 0.3735F, -0.7584F, 1.2732F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(12, 161).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.0911F, -9.9139F, 0.6657F, -0.5368F, 0.7976F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(159, 92).addBox(-0.5461F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.0911F, -9.9139F, 0.8262F, -0.2878F, 0.4045F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(161, 139).addBox(-0.5461F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.9911F, -7.6139F, 0.7422F, -0.2455F, 0.3582F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(161, 150).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.9911F, -7.6139F, 0.5992F, -0.4664F, 0.7612F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(55, 22).addBox(2.7415F, -1.9518F, -0.3082F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.9911F, -7.6139F, 0.3467F, -0.6693F, 1.2223F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(77, 159).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.1911F, -5.8139F, 0.6688F, -0.2376F, 0.3914F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(157, 160).addBox(1.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.1911F, -5.8139F, 0.5302F, -0.4307F, 0.8067F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(55, 18).addBox(2.7647F, -1.946F, -0.3188F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.1911F, -5.8139F, 0.2971F, -0.6097F, 1.2676F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(70, 159).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6911F, -3.6139F, 0.6189F, -0.2184F, 0.4197F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(161, 135).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6911F, -3.6139F, 0.4901F, -0.3935F, 0.8398F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(55, 20).addBox(2.765F, -1.9458F, -0.318F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6911F, -3.6139F, 0.2774F, -0.5601F, 1.2955F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(160, 100).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1911F, -1.0139F, 0.4493F, -0.3456F, 0.8722F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(55, 16).addBox(2.8936F, -2.4262F, -0.2666F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1911F, -1.0139F, 0.262F, -0.5003F, 1.3209F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(158, 144).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1911F, -1.0139F, 0.5634F, -0.1903F, 0.4486F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(139, 159).addBox(0.0F, -3.7075F, -0.0369F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7842F, -10.8844F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(46, 164).addBox(0.0F, -1.325F, -1.9006F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 113).addBox(0.0F, -2.125F, -0.0006F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.4812F, -14.5984F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(130, 163).addBox(0.0F, -2.3812F, 0.0595F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.9842F, -13.3844F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(62, 163).addBox(0.0F, -2.9053F, -0.0612F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3842F, -12.0844F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(50, 68).addBox(-1.0F, -0.0631F, -9.9239F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1842F, -9.7844F, 0.925F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2282F, 21.9321F, -7.368F, 1.4526F, 0.0072F, -0.0364F));

		PartDefinition cube_r246 = leftArm.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(154, 131).addBox(0.0F, -0.5F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftArm.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(140, 31).addBox(0.0419F, -15.7734F, -8.7275F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftArm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(154, 40).addBox(-0.3441F, -1.6321F, -0.8097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r249 = leftArm.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(28, 124).addBox(-0.6433F, -0.4928F, -1.5597F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.4317F, -0.3971F, -0.2345F, -0.4743F, -0.0768F));

		PartDefinition cube_r250 = leftArm.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(9, 151).addBox(-0.6F, -2.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4632F, 4.3572F, -0.121F, 1.1181F, -0.4743F, -0.0768F));

		PartDefinition cube_r251 = leftArm.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(54, 153).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(131, 68).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(0, 129).addBox(-0.5909F, 0.8921F, -1.4717F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1956F, 9.7195F, 1.8209F, -1.4219F, 0.9476F, -1.092F));

		PartDefinition cube_r252 = leftArm2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(154, 151).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(21, 145).addBox(-0.6767F, 0.049F, -0.5432F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2276F, 12.7369F, -0.2626F, 0.4074F, 0.2391F, 0.635F));

		PartDefinition cube_r253 = leftArm3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(162, 162).addBox(11.0848F, 0.8221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-11.4616F, 9.1729F, 10.4465F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r254 = leftArm3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(72, 152).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, 0.049F, -0.5432F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(157, 76).addBox(-0.5945F, 0.0179F, -0.9517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1321F, 0.1729F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2282F, 21.9321F, -7.368F, 1.1472F, -0.0072F, 0.0364F));

		PartDefinition cube_r255 = rightArm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(154, 136).addBox(-1.0F, -0.5F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightArm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(140, 40).addBox(-1.0419F, -15.7734F, -8.7275F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r257 = rightArm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(154, 71).addBox(-0.6559F, -1.6321F, -0.8097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r258 = rightArm.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(37, 124).addBox(-0.3567F, -0.4928F, -1.5597F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.4317F, -0.3971F, -0.2345F, 0.4743F, 0.0768F));

		PartDefinition cube_r259 = rightArm.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(151, 22).addBox(-0.4F, -2.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 4.3572F, -0.121F, 1.1181F, 0.4743F, 0.0768F));

		PartDefinition cube_r260 = rightArm.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(30, 154).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(99, 131).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(5, 129).addBox(-0.4091F, 0.8921F, -1.4717F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1956F, 9.7195F, 1.8209F, -1.4219F, -0.9476F, 1.092F));

		PartDefinition cube_r261 = rightArm2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(155, 45).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(147, 31).addBox(-0.3233F, 0.049F, -0.5432F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2276F, 12.7369F, -0.2626F, 0.3746F, -0.2891F, -0.5096F));

		PartDefinition cube_r262 = rightArm3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(70, 163).addBox(-12.0848F, 0.8221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(11.4616F, 9.1729F, 10.4465F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r263 = rightArm3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(128, 152).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, 0.049F, -0.5432F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(108, 157).addBox(-0.4055F, 0.0179F, -0.9517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1321F, 0.1729F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.2416F, -14.9156F, 0.0882F, 0.0331F, 0.1729F));

		PartDefinition cube_r264 = neck4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(115, 18).addBox(0.0F, -1.3999F, -0.0816F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5772F, -3.6376F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(112, 62).addBox(0.0F, -1.3811F, -0.0196F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4772F, -2.0376F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r266 = neck4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 121).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2511F, -3.739F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(164, 112).addBox(0.0F, -2.5487F, 5.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 131).addBox(0.0F, -2.4487F, 3.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 131).addBox(0.0F, -2.4487F, 1.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 68).addBox(-0.5F, -1.9487F, 0.0661F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9164F, -6.5763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6164F, -5.6763F, -0.2711F, -0.1074F, -0.0608F));

		PartDefinition cube_r268 = neck2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(164, 33).addBox(0.0F, -1.0018F, 7.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(154, 76).addBox(0.0F, -1.0018F, 5.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(132, 87).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.6263F, -7.1488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(65, 141).addBox(-0.5F, -6.15F, -0.9206F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(164, 115).addBox(0.0F, -2.15F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(164, 118).addBox(0.0F, -4.15F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(164, 121).addBox(0.0F, -6.15F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0468F, -2.8524F, 0.5735F, 0.0108F, -0.0969F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.5476F, -0.0736F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r269 = neck.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(150, 0).addBox(0.0F, 0.0555F, 0.005F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9867F, -1.9451F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r270 = neck.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(136, 73).addBox(-0.5F, -0.8F, -2.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7867F, -1.2451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8192F, -3.6743F, 0.2408F, -0.1928F, -0.1347F));

		PartDefinition cube_r271 = heads.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(158, 20).mirror().addBox(-1.0F, -0.0148F, -0.1066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.6098F, -12.6211F, 0.5062F, 0.1549F, -0.3335F));

		PartDefinition cube_r272 = heads.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(158, 20).addBox(0.0F, -0.0148F, -0.1066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 11.6098F, -12.6211F, 0.5062F, -0.1549F, 0.3335F));

		PartDefinition cube_r273 = heads.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(19, 158).addBox(-1.4F, -0.1439F, -0.3773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 11.6098F, -12.3211F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r274 = heads.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(148, 79).addBox(-1.4F, -0.181F, -0.1098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9F, 11.5098F, -12.4211F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r275 = heads.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(139, 0).addBox(-1.0F, 0.0074F, 0.0241F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.7902F, -9.5211F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r276 = heads.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(120, 138).addBox(-0.5F, -0.054F, 0.0464F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 8.7098F, -12.6211F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r277 = heads.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(15, 123).addBox(-1.0F, -0.8F, -3.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7333F, -5.5218F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r278 = heads.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(145, 117).addBox(-1.0F, -0.8581F, -1.042F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.5518F, 0.3048F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r279 = heads.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(162, 52).addBox(-0.615F, -0.5378F, 0.7085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.615F, -0.1452F, -1.9031F, 0.6261F, 0.0512F, -0.2097F));

		PartDefinition cube_r280 = heads.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(118, 26).addBox(-2.5F, -0.2535F, -1.7299F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.2735F, 0.3161F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r281 = heads.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(135, 81).addBox(-2.5F, 0.3565F, 0.5008F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -3.1735F, -2.1839F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r282 = heads.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(126, 0).addBox(-2.5F, -0.0435F, -0.0992F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -3.1735F, -2.1839F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r283 = heads.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(84, 11).addBox(-2.5F, 0.0004F, 0.0129F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -2.8735F, -3.1839F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r284 = heads.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(121, 123).addBox(-1.5F, -2.0035F, -0.6281F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -2.3735F, -4.8839F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r285 = heads.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(138, 19).addBox(-1.5F, -1.0811F, -2.0412F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6735F, -5.5839F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r286 = heads.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(158, 141).addBox(-1.0F, -0.008F, 0.0436F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.2735F, 3.8161F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r287 = heads.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(34, 93).addBox(-1.0F, -0.4F, -4.4F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, -6.7185F, -0.8385F, -2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r288 = heads.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(75, 127).addBox(-1.5F, -0.9066F, -1.9458F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -5.4735F, -0.4839F, -2.906F, 0.0F, 0.0F));

		PartDefinition cube_r289 = heads.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(12, 157).addBox(-1.0F, -0.0174F, -0.0328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.3735F, 1.3161F, 3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r290 = heads.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(42, 146).addBox(-1.0F, -0.0028F, 0.0287F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6735F, 2.9161F, -2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r291 = heads.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(116, 39).addBox(-1.0F, 0.0145F, -0.0378F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -10.3735F, 4.4161F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r292 = heads.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(150, 61).addBox(-1.0F, -0.0071F, 0.0361F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -11.8735F, 1.9161F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r293 = heads.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(108, 116).addBox(-0.2F, 0.9827F, -0.0802F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(47, 120).addBox(-1.0F, -0.0173F, -0.0802F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.9735F, -2.8839F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r294 = heads.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(50, 81).addBox(-1.5F, -0.0366F, -0.0069F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.005F))
				.texOffs(73, 89).addBox(-0.7F, 0.9634F, -0.0069F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -3.4735F, -8.0839F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r295 = heads.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(125, 105).addBox(-1.5F, -0.05F, -0.0839F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.0265F, -8.4839F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r296 = heads.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(115, 9).addBox(-2.0F, 0.2665F, -4.0609F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.1735F, -3.0839F, 0.5323F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -3.4735F, 0.3161F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(138, 105).addBox(-1.3531F, 0.1226F, -0.1138F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.8F, 1.0F, -1.4326F, 0.1724F, -0.1595F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(82, 163).addBox(-1.6498F, 0.2409F, -0.0072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4726F, 0.1724F, -0.1595F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(147, 148).addBox(-0.9063F, -2.4893F, -2.0331F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.285F, 3.3283F, -0.3192F, -0.1073F, 0.1033F, -0.2153F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(140, 148).addBox(-1.3119F, -2.1832F, -4.6458F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(136, 112).addBox(-1.3119F, -2.1832F, -2.6458F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, 0.2675F, 0.1366F, -0.1591F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(42, 137).addBox(-0.9F, -6.436F, 2.7596F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3F, 9.3687F, -9.5153F, 0.0611F, 0.0524F, 0.0F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(71, 134).addBox(-0.9F, -1.9941F, -0.0868F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3F, 9.3687F, -9.5153F, 0.48F, 0.0524F, 0.0F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(159, 61).addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2647F, 6.4775F, -0.9705F, 0.8721F, -0.0117F, -0.126F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(122, 157).addBox(-1.511F, -0.1771F, -1.1924F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.615F, 5.4283F, -0.4192F, 0.174F, -0.0117F, -0.126F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(65, 156).addBox(-0.5213F, -1.9055F, -0.4753F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5885F, 3.975F, -0.8005F, -0.1331F, 0.0512F, -0.2097F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(143, 86).addBox(0.1117F, -0.8862F, -3.5469F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4273F, 7.8495F, -6.2119F, 0.5477F, -0.0089F, 0.1344F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 162).addBox(0.1273F, -0.8321F, -0.0204F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4273F, 7.8495F, -6.3119F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(80, 147).addBox(-1.3119F, -0.5047F, -1.4386F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, -0.3172F, 0.1366F, -0.1591F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(155, 55).addBox(-0.3651F, -0.9121F, 0.0123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3739F, 7.3761F, -3.7561F, 0.4051F, 0.0832F, -0.1993F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(29, 161).addBox(-0.5F, -0.4201F, -0.3035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7613F, 4.0703F, -2.7793F, -0.735F, 0.1316F, -0.1656F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(101, 163).addBox(-0.5F, 1.0466F, 0.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(161, 71).addBox(-0.5F, -0.5534F, 0.2309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7613F, 4.0703F, -2.7793F, -1.119F, 0.1316F, -0.1656F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(77, 161).addBox(-0.5F, -1.5597F, 0.2399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7613F, 4.0703F, -2.7793F, -0.2987F, 0.1316F, -0.1656F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(116, 30).addBox(-1.0F, -0.0768F, -5.9034F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 2.7833F, -9.7372F, 1.1968F, 0.0319F, 0.0812F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(34, 163).addBox(-0.5F, -1.7991F, -0.2001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 163).addBox(-0.5F, -1.1991F, -0.2001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7613F, 4.0703F, -2.7793F, -0.4383F, 0.1316F, -0.1656F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(162, 78).addBox(-0.5F, -1.3629F, 0.977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7613F, 4.0703F, -2.7793F, 0.3645F, 0.1316F, -0.1656F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(41, 156).addBox(-0.6239F, -0.8397F, -0.8443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.979F, 2.8372F, -4.1286F, 2.3711F, 0.1084F, -0.154F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(157, 162).addBox(-0.6239F, -0.6088F, 0.0208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.979F, 2.8372F, -4.1286F, 1.7515F, 0.1084F, -0.154F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(162, 75).addBox(-0.6239F, 0.055F, 0.0975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.979F, 2.8372F, -4.1286F, 1.4374F, 0.1084F, -0.154F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(65, 162).addBox(-0.6239F, -0.5954F, 0.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.979F, 2.8372F, -4.1286F, 0.2505F, 0.1084F, -0.154F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(54, 160).addBox(-0.6239F, -0.9186F, 0.1065F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.979F, 2.8372F, -4.1286F, -0.7268F, 0.1084F, -0.154F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(162, 58).addBox(-0.6039F, -0.2944F, -0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 55).addBox(-0.4239F, -0.2944F, -0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.979F, 2.8372F, -4.1286F, -0.3429F, 0.1084F, -0.154F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(35, 159).addBox(-0.6239F, 0.6491F, 0.204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.979F, 2.8372F, -4.1286F, -0.9188F, 0.1084F, -0.154F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(142, 159).addBox(-0.6239F, 0.0784F, -1.42F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.979F, 2.8372F, -4.1286F, -0.1683F, 0.1084F, -0.154F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(152, 6).addBox(-0.8925F, -2.9862F, -0.0497F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2261F, 7.2761F, -3.7561F, 1.1443F, 0.2219F, -0.3043F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(21, 154).addBox(-1.9927F, -0.105F, -0.0679F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1F, 15.4833F, -12.8372F, 0.6257F, 0.4688F, 0.3156F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(125, 163).addBox(0.0F, 0.2113F, 1.502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 15.4833F, -12.8372F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(140, 62).addBox(-0.884F, -0.0054F, 0.073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.798F, 14.7218F, -11.7723F, 1.6102F, -0.0267F, -0.0392F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(109, 0).addBox(-0.9624F, -0.112F, -0.5232F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.798F, 12.7218F, -11.7723F, 1.3659F, -0.0267F, -0.0392F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(55, 93).addBox(-0.884F, -0.8217F, 1.945F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F))
				.texOffs(116, 48).addBox(-0.884F, -1.8217F, 8.245F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.798F, 14.7218F, -11.7723F, 1.2088F, -0.0267F, -0.0392F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(116, 57).addBox(-1.6167F, 0.0577F, 0.0401F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.798F, -0.7782F, -7.0723F, 0.6677F, -0.0267F, -0.0392F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(77, 154).addBox(-0.884F, -6.5031F, 12.8306F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.798F, 14.7218F, -11.7723F, 0.8597F, -0.0267F, -0.0392F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(158, 12).addBox(0.0282F, -0.4633F, -2.0213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5306F, 14.1858F, -10.7819F, 0.686F, 0.3201F, 0.9033F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(158, 102).addBox(-0.9651F, -0.4633F, -1.912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.5306F, 14.1858F, -10.7819F, 0.6451F, 0.0027F, 0.6532F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -3.4735F, 0.3161F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(138, 105).mirror().addBox(0.3531F, 0.1226F, -0.1138F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, 1.0F, -1.4326F, -0.1724F, 0.1595F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(82, 163).mirror().addBox(0.6498F, 0.2409F, -0.0072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4726F, -0.1724F, 0.1595F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(147, 148).mirror().addBox(-0.0937F, -2.4893F, -2.0331F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.285F, 3.3283F, -0.3192F, -0.1073F, -0.1033F, 0.2153F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(140, 148).mirror().addBox(0.3119F, -2.1832F, -4.6458F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(136, 112).mirror().addBox(0.3119F, -2.1832F, -2.6458F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, 0.2675F, -0.1366F, 0.1591F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(42, 137).mirror().addBox(-0.1F, -6.436F, 2.7596F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.3F, 9.3687F, -9.5153F, 0.0611F, -0.0524F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(71, 134).mirror().addBox(-0.1F, -1.9941F, -0.0868F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3F, 9.3687F, -9.5153F, 0.48F, -0.0524F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(159, 61).mirror().addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2647F, 6.4775F, -0.9705F, 0.8721F, 0.0117F, 0.126F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(122, 157).mirror().addBox(0.511F, -0.1771F, -1.1924F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.615F, 5.4283F, -0.4192F, 0.174F, 0.0117F, 0.126F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(65, 156).mirror().addBox(-0.4787F, -1.9055F, -0.4753F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5885F, 3.975F, -0.8005F, -0.1331F, -0.0512F, 0.2097F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(143, 86).mirror().addBox(-0.1117F, -0.8862F, -3.5469F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4273F, 7.8495F, -6.2119F, 0.5477F, 0.0089F, -0.1344F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 162).mirror().addBox(-0.1273F, -0.8321F, -0.0204F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4273F, 7.8495F, -6.3119F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(80, 147).mirror().addBox(0.3119F, -0.5047F, -1.4386F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, -0.3172F, -0.1366F, 0.1591F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(155, 55).mirror().addBox(-0.6349F, -0.9121F, 0.0123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 7.3761F, -3.7561F, 0.4051F, -0.0832F, 0.1993F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(29, 161).mirror().addBox(-0.5F, -0.4201F, -0.3035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7613F, 4.0703F, -2.7793F, -0.735F, -0.1316F, 0.1656F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(101, 163).mirror().addBox(-0.5F, 1.0466F, 0.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(161, 71).mirror().addBox(-0.5F, -0.5534F, 0.2309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7613F, 4.0703F, -2.7793F, -1.119F, -0.1316F, 0.1656F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(77, 161).mirror().addBox(-0.5F, -1.5597F, 0.2399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7613F, 4.0703F, -2.7793F, -0.2987F, -0.1316F, 0.1656F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(116, 30).mirror().addBox(0.0F, -0.0768F, -5.9034F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.5F, 2.7833F, -9.7372F, 1.1968F, -0.0319F, -0.0812F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(34, 163).mirror().addBox(-0.5F, -1.7991F, -0.2001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 163).mirror().addBox(-0.5F, -1.1991F, -0.2001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.7613F, 4.0703F, -2.7793F, -0.4383F, -0.1316F, 0.1656F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(162, 78).mirror().addBox(-0.5F, -1.3629F, 0.977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7613F, 4.0703F, -2.7793F, 0.3645F, -0.1316F, 0.1656F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(41, 156).mirror().addBox(-0.3761F, -0.8397F, -0.8443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.979F, 2.8372F, -4.1286F, 2.3711F, -0.1084F, 0.154F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(157, 162).mirror().addBox(-0.3761F, -0.6088F, 0.0208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.979F, 2.8372F, -4.1286F, 1.7515F, -0.1084F, 0.154F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(162, 75).mirror().addBox(-0.3761F, 0.055F, 0.0975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.979F, 2.8372F, -4.1286F, 1.4374F, -0.1084F, 0.154F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(65, 162).mirror().addBox(-0.3761F, -0.5954F, 0.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.979F, 2.8372F, -4.1286F, 0.2505F, -0.1084F, 0.154F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(54, 160).mirror().addBox(-0.3761F, -0.9186F, 0.1065F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.979F, 2.8372F, -4.1286F, -0.7268F, -0.1084F, 0.154F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(162, 58).mirror().addBox(-0.3961F, -0.2944F, -0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(162, 55).mirror().addBox(-0.5761F, -0.2944F, -0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.979F, 2.8372F, -4.1286F, -0.3429F, -0.1084F, 0.154F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(35, 159).mirror().addBox(-0.3761F, 0.6491F, 0.204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.979F, 2.8372F, -4.1286F, -0.9188F, -0.1084F, 0.154F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(142, 159).mirror().addBox(-0.3761F, 0.0784F, -1.42F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.979F, 2.8372F, -4.1286F, -0.1683F, -0.1084F, 0.154F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(152, 6).mirror().addBox(-0.1075F, -2.9862F, -0.0497F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2261F, 7.2761F, -3.7561F, 1.1443F, -0.2219F, 0.3043F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(21, 154).mirror().addBox(-0.0073F, -0.105F, -0.0679F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.1F, 15.4833F, -12.8372F, 0.6257F, -0.4688F, -0.3156F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(125, 163).mirror().addBox(-1.0F, 0.2113F, 1.502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, 15.4833F, -12.8372F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(140, 62).mirror().addBox(-0.116F, -0.0054F, 0.073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.798F, 14.7218F, -11.7723F, 1.6102F, 0.0267F, 0.0392F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(109, 0).mirror().addBox(-0.0376F, -0.112F, -0.5232F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.798F, 12.7218F, -11.7723F, 1.3659F, 0.0267F, 0.0392F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(55, 93).mirror().addBox(-0.116F, -0.8217F, 1.945F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(116, 48).mirror().addBox(-0.116F, -1.8217F, 8.245F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.798F, 14.7218F, -11.7723F, 1.2088F, 0.0267F, 0.0392F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(116, 57).mirror().addBox(0.6167F, 0.0577F, 0.0401F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.798F, -0.7782F, -7.0723F, 0.6677F, 0.0267F, 0.0392F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(77, 154).mirror().addBox(-0.116F, -6.5031F, 12.8306F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.798F, 14.7218F, -11.7723F, 0.8597F, 0.0267F, 0.0392F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(158, 12).mirror().addBox(-1.0282F, -0.4633F, -2.0213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5306F, 14.1858F, -10.7819F, 0.686F, -0.3201F, -0.9033F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(158, 102).mirror().addBox(-0.0349F, -0.4633F, -1.912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.5306F, 14.1858F, -10.7819F, 0.6451F, -0.0027F, -0.6532F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4989F, 0.1045F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(136, 164).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(136, 164).addBox(2.4F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -0.2755F, -8.4971F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(157, 125).mirror().addBox(0.0F, -1.6091F, -0.1834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(157, 121).mirror().addBox(0.0F, -1.0091F, -0.1834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(157, 125).addBox(2.2F, -1.6091F, -0.1834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(157, 121).addBox(2.2F, -1.0091F, -0.1834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6F, 2.4868F, -8.7093F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(106, 163).mirror().addBox(0.0F, 0.0005F, -2.4312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(157, 28).mirror().addBox(0.0F, 0.0005F, -2.0312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(106, 163).addBox(2.2F, 0.0005F, -2.4312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(157, 28).addBox(2.2F, 0.0005F, -2.0312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.6F, -0.3132F, -8.7093F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(127, 159).mirror().addBox(0.0F, -0.0593F, -0.043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 159).addBox(2.2F, -0.0593F, -0.043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -1.2132F, -5.9093F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(158, 16).mirror().addBox(-1.0F, -0.0294F, 0.0501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(158, 16).addBox(3.2F, -0.0294F, 0.0501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.6F, -1.1988F, -2.8624F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(157, 117).mirror().addBox(-1.0F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(157, 117).addBox(3.2F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6F, -0.1988F, -3.0624F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(142, 163).mirror().addBox(-1.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(142, 163).addBox(2.7F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, -0.3101F, -3.2604F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(155, 50).mirror().addBox(0.0F, -0.0966F, 0.0182F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(155, 50).addBox(2.2F, -0.0966F, 0.0182F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6F, -0.7132F, -7.9093F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(154, 108).mirror().addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(154, 108).addBox(2.1F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3F, 0.1045F, -4.4236F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(157, 65).mirror().addBox(-1.5F, -1.415F, -1.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(157, 65).addBox(2.7F, -1.415F, -1.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.1F, 1.5868F, -2.8093F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(140, 155).mirror().addBox(-1.5F, -0.9999F, -0.0843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(140, 155).addBox(2.7F, -0.9999F, -0.0843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.3868F, -0.7093F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(161, 84).mirror().addBox(0.0F, -0.4F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(161, 84).addBox(3.0F, -0.4F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0544F, -5.4429F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(93, 161).mirror().addBox(0.4F, -2.7713F, -1.6798F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 161).addBox(2.8F, -2.7713F, -1.6798F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 1.1868F, -5.7093F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(75, 123).mirror().addBox(0.0F, 0.0006F, -0.9746F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(75, 123).addBox(2.2F, 0.0006F, -0.9746F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6F, -0.8132F, -7.9093F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(157, 156).mirror().addBox(0.0F, -1.0452F, -1.6195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(157, 156).addBox(2.2F, -1.0452F, -1.6195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 1.1868F, -5.7093F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(149, 103).mirror().addBox(-1.05F, -0.439F, -0.3656F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 3.8533F, -11.3305F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(101, 157).mirror().addBox(-0.95F, -0.1981F, -1.8644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 3.8533F, -11.3305F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(158, 24).mirror().addBox(-0.95F, -0.755F, -1.0046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 3.8533F, -11.3305F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(149, 108).mirror().addBox(-1.05F, -0.0916F, -0.5888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false)
				.texOffs(149, 108).addBox(1.15F, -0.0916F, -0.5888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.55F, 3.8533F, -11.3305F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(149, 141).mirror().addBox(-1.05F, -1.0667F, -0.0207F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(149, 141).addBox(1.15F, -1.0667F, -0.0207F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.55F, 4.6533F, -10.6305F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(157, 32).mirror().addBox(-1.5F, -0.9981F, -1.9843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(157, 32).addBox(2.7F, -0.9981F, -1.9843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, 1.3868F, -0.8093F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(145, 129).mirror().addBox(-1.5F, -2.023F, -2.9745F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(145, 129).addBox(1.1F, -2.023F, -2.9745F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3F, 1.5868F, -2.8093F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(149, 103).addBox(0.05F, -0.439F, -0.3656F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.55F, 3.8533F, -11.3305F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(101, 157).addBox(-0.05F, -0.1981F, -1.8644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.55F, 3.8533F, -11.3305F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(158, 24).addBox(-0.05F, -0.755F, -1.0046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(66, 110).addBox(-2.05F, -0.755F, -2.0046F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.55F, 3.8533F, -11.3305F, 0.6283F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5498F, 12.3411F, 0.0352F, 0.1308F, 0.0046F));

		PartDefinition cube_r396 = tail.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(92, 147).addBox(0.0F, -8.8559F, 0.0318F, 0.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3599F, 11.9214F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r397 = tail.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(99, 144).addBox(0.0F, -9.2908F, 0.0315F, 0.0F, 10.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3599F, 9.9214F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r398 = tail.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(62, 141).addBox(0.0F, -9.5258F, 0.0329F, 0.0F, 11.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4599F, 7.9214F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r399 = tail.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(140, 49).addBox(0.0F, -9.9607F, 0.0344F, 0.0F, 11.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 5.9214F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r400 = tail.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(77, 141).addBox(0.0F, -10.4956F, 0.0341F, 0.0F, 11.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 3.9214F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r401 = tail.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(137, 130).addBox(0.0F, -11.1305F, 0.0338F, 0.0F, 12.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 1.9214F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r402 = tail.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(36, 49).addBox(0.0F, -11.6654F, 0.0352F, 0.0F, 13.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6599F, -0.0786F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r403 = tail.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(147, 159).mirror().addBox(-2.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(161, 40).mirror().addBox(-2.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(161, 38).mirror().addBox(-2.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(157, 69).mirror().addBox(-2.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(161, 88).mirror().addBox(-2.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(161, 90).mirror().addBox(-2.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(157, 82).mirror().addBox(-3.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(147, 159).addBox(0.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(161, 40).addBox(0.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(161, 38).addBox(0.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(157, 69).addBox(0.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(161, 88).addBox(0.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(161, 90).addBox(0.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(157, 82).addBox(1.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 49).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3401F, -2.0786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r404 = tail.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(143, 49).addBox(0.0F, -0.6133F, -0.5652F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.46F, 12.6878F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r405 = tail.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(137, 144).addBox(0.0F, -0.2618F, -0.0768F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.56F, 9.5878F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r406 = tail.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(95, 152).addBox(0.0F, 0.0322F, -0.1986F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.56F, 7.1878F, 0.9163F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 160).addBox(0.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(161, 42).addBox(-0.1F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 94).addBox(-0.1F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 161).addBox(-0.2F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 129).addBox(0.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 146).addBox(0.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 160).mirror().addBox(-2.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(161, 42).mirror().addBox(-1.9F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(132, 94).mirror().addBox(-1.9F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 161).mirror().addBox(-1.8F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 129).mirror().addBox(-1.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(149, 146).mirror().addBox(-1.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1401F, 12.9214F, -0.0968F, 0.1303F, -0.0126F));

		PartDefinition cube_r407 = tail2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(148, 92).addBox(0.0F, -8.6F, 0.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r408 = tail2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(38, 148).addBox(0.0F, -7.5F, 0.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 11.0F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r409 = tail2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(0, 150).addBox(0.0F, -7.9F, 0.0F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 9.0F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r410 = tail2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(3, 150).addBox(0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r411 = tail2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(147, 61).addBox(0.0F, -8.5F, 0.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r412 = tail2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(35, 148).addBox(0.0F, -8.5F, 0.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r413 = tail2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(116, 147).addBox(0.0F, -0.9887F, -0.385F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 12.2858F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r414 = tail2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(134, 144).addBox(0.0F, -1.3578F, -0.4952F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 10.0858F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r415 = tail2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(113, 147).addBox(0.0F, -0.0446F, -0.3556F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 7.3868F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r416 = tail2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(96, 139).addBox(0.0F, -0.2364F, -0.1492F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2199F, 4.2664F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r417 = tail2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(18, 145).addBox(0.0F, -0.1989F, -0.1464F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4199F, 1.8664F, 0.8116F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 18.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, -0.0452F, -0.2615F, 0.0117F));

		PartDefinition cube_r418 = tail3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(9, 157).addBox(0.0F, -4.4606F, -0.15F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 16.2F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r419 = tail3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(154, 156).addBox(0.0F, -4.8558F, 0.0717F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 13.9F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r420 = tail3.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(136, 156).addBox(0.0F, -5.2184F, 0.0367F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 12.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r421 = tail3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(133, 156).addBox(0.0F, -5.5F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r422 = tail3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(98, 156).addBox(0.0F, -5.9F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r423 = tail3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(154, 122).addBox(0.0F, -6.2F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r424 = tail3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(154, 113).addBox(0.0F, -6.5F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r425 = tail3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(84, 154).addBox(0.0F, -6.9F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r426 = tail3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(51, 150).addBox(0.0F, -7.2F, 0.0F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r427 = tail3.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(159, 4).addBox(0.0F, 8.9F, 15.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 92).addBox(0.0F, 6.9F, 13.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 156).addBox(0.0F, 5.6F, 11.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 156).addBox(0.0F, 4.8F, 9.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 154).addBox(0.0F, 3.0F, 7.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 153).addBox(0.0F, 2.0F, 5.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -2.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r428 = tail3.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(6, 150).addBox(0.0F, -0.3477F, -0.1361F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 1.3858F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(39, 28).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0327F, 17.9013F, -0.0709F, -0.1741F, 0.0123F));

		PartDefinition cube_r429 = tail4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(147, 163).addBox(0.0F, -6.0848F, 7.3797F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 162).addBox(0.0F, -5.6848F, 5.5797F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 162).addBox(0.0F, -5.0848F, 3.6797F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 104).addBox(0.0F, -4.4924F, 1.7899F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 162).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 8.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r430 = tail4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(162, 4).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r431 = tail4.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(51, 160).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r432 = tail4.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(116, 158).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r433 = tail4.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(113, 158).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r434 = tail4.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(98, 164).addBox(0.0F, 14.2F, 25.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(164, 28).addBox(0.0F, 12.5F, 23.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 163).addBox(0.0F, 11.5F, 21.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -13.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r435 = tail4.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(47, 115).addBox(0.0F, -0.0863F, -0.0255F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6035F, 9.0108F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r436 = tail4.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(162, 46).addBox(0.0F, 0.0394F, -0.1148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5525F, 6.6858F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r437 = tail4.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(43, 160).addBox(0.0F, -0.0247F, 0.0239F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9525F, 4.3858F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r438 = tail4.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(40, 160).addBox(0.0F, -0.0324F, -0.1146F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1525F, 2.2858F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r439 = tail4.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(90, 158).addBox(0.0F, -0.1325F, -0.2145F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1173F, -0.0161F, 0.7069F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 26.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0052F, 18.0608F, 0.0361F, 0.2616F, 0.0094F));

		PartDefinition cube_r440 = tail5.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(133, 164).addBox(0.0F, 18.6F, 32.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(164, 127).addBox(0.0F, 17.5F, 30.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(164, 81).addBox(0.0F, 16.4F, 28.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 120).addBox(0.0F, 15.3F, 26.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(164, 0).addBox(0.0F, 13.3F, 24.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5577F, -28.175F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r441 = tail5.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(164, 124).addBox(0.0F, -5.8F, 13.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 164).addBox(0.0F, -5.5F, 11.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(164, 65).addBox(0.0F, -5.0F, 9.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(164, 61).addBox(0.0F, -4.7F, 7.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 164).addBox(0.0F, -4.1F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 162).addBox(0.0F, -3.6F, 3.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 162).addBox(0.0F, -3.2F, 1.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 13).addBox(0.0F, -2.8F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3665F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 176);
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