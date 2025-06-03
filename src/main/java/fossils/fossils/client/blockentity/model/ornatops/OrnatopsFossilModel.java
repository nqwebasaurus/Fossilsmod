package fossils.fossils.client.blockentity.model.ornatops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OrnatopsFossilModel extends SkullModelBase {
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

	public OrnatopsFossilModel(ModelPart root) {
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
		this.neck = this.neck2.getChild("neck");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -39.1666F, 3.3439F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-5.0F, -0.4F, 9.6F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 70).mirror().addBox(-4.0F, -0.4F, 2.6F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 106).addBox(1.0F, -0.4F, 9.6F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(21, 70).addBox(1.0F, -0.4F, 2.6F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6114F, -5.2615F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 118).mirror().addBox(-0.145F, -0.0298F, -3.0121F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4829F, -2.2205F, 1.4377F, -0.3067F, -0.0817F, 0.0306F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(112, 71).mirror().addBox(-0.285F, -0.3214F, -0.2451F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -2.3205F, 0.3377F, -0.3664F, -0.2123F, 0.0807F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 110).mirror().addBox(0.0829F, -3.2934F, 0.4771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, 0.1795F, -1.4623F, -0.3973F, -0.4392F, 0.1766F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(113, 61).mirror().addBox(-1.575F, 0.7854F, -0.5504F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(108, 113).mirror().addBox(-1.575F, 0.7854F, -1.1504F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8777F, 3.6057F, -8.6755F, -1.2372F, 0.127F, 0.0318F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(115, 41).mirror().addBox(-1.575F, 0.2039F, -1.6403F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8777F, 3.6057F, -8.6755F, 0.5082F, 0.127F, 0.0318F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.2913F, -0.4022F, -0.0693F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 4.8666F, 2.7679F, -0.3574F, 0.2358F, -0.049F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(115, 127).mirror().addBox(-0.5F, 1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(135, 128).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4378F, -0.3818F, 8.2407F, -0.6035F, -0.209F, 0.013F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(128, 105).mirror().addBox(-0.6054F, 0.0498F, 0.0991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -1.6205F, 5.7377F, -0.3417F, -0.209F, 0.013F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-0.2244F, -1.7381F, -0.3235F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -1.3374F, -3.5098F, -0.1313F, 0.1308F, -0.0057F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(99, 27).mirror().addBox(-0.2999F, 0.9262F, -5.8297F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -3.1374F, -4.0098F, 0.2706F, 0.1309F, 0.0011F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-0.2993F, -0.0863F, 0.0141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -3.0374F, -4.0098F, 0.0084F, 0.1308F, -0.0057F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(87, 65).mirror().addBox(-0.2999F, 0.0067F, -7.0226F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -3.1374F, -4.0098F, 0.4277F, 0.1309F, 0.0011F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-0.2171F, -2.2428F, -2.0329F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 99).addBox(8.7829F, -2.2428F, -2.0329F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7829F, -0.4205F, 0.1377F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(128, 128).mirror().addBox(-0.1967F, -0.3324F, 0.0832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -1.1205F, 3.7377F, 0.0597F, -0.209F, 0.013F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(129, 48).mirror().addBox(-2.0648F, 3.61F, 2.3902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 3.5666F, -2.7321F, 0.5627F, 0.401F, 0.0166F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.8662F, -1.0514F, -0.4847F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 3.5666F, -2.7321F, -0.3491F, 0.1047F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(60, 100).mirror().addBox(-0.5898F, -0.6818F, -0.5814F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4777F, 3.8057F, -2.6755F, -0.5585F, 0.192F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(73, 96).mirror().addBox(-0.5898F, 0.7253F, 3.7882F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4777F, 3.8057F, -2.6755F, -0.2269F, 0.192F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(117, 89).mirror().addBox(-0.6074F, -0.8645F, -2.4571F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 3.5666F, 1.8679F, -1.1616F, 0.1845F, -0.0347F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(128, 101).mirror().addBox(-0.7217F, -0.7616F, 0.4286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 3.5666F, 1.8679F, -0.9401F, 0.2963F, 0.016F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(115, 35).mirror().addBox(-1.575F, -0.7961F, -1.1403F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8777F, 3.6057F, -8.6755F, -0.0329F, 0.127F, 0.0318F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(47, 89).mirror().addBox(-1.0753F, -1.0177F, -4.8227F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8777F, 3.0057F, -3.0755F, 0.2253F, 0.1285F, -0.0251F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 74).mirror().addBox(-0.2171F, -1.2919F, -2.8938F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 74).addBox(8.7829F, -1.2919F, -2.8938F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7829F, -0.4205F, 0.1377F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(120, 56).mirror().addBox(-0.1967F, 0.7517F, -1.7362F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -1.1205F, 3.7377F, 0.3041F, -0.209F, 0.013F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(14, 109).mirror().addBox(-0.1967F, 0.2801F, -0.2805F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -1.1205F, 3.7377F, -0.0799F, -0.209F, 0.013F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 117).addBox(-0.7756F, -1.7381F, -0.3235F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.988F, -1.3374F, -3.5098F, -0.1313F, -0.1308F, 0.0057F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(99, 27).addBox(-0.7001F, 0.9262F, -5.8297F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.988F, -3.1374F, -4.0098F, 0.2706F, -0.1309F, -0.0011F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(119, 0).addBox(-0.7007F, -0.0863F, 0.0141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.988F, -3.0374F, -4.0098F, 0.0084F, -0.1308F, 0.0057F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(87, 65).addBox(-0.7001F, 0.0067F, -7.0226F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.988F, -3.1374F, -4.0098F, 0.4277F, -0.1309F, -0.0011F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(115, 127).addBox(-0.5F, 1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(135, 128).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4378F, -0.3818F, 8.2407F, -0.6035F, 0.209F, -0.013F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(112, 71).addBox(-0.715F, -0.3214F, -0.2451F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7829F, -2.3205F, 0.3377F, -0.3664F, 0.2123F, -0.0807F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(50, 118).addBox(-0.855F, -0.0298F, -3.0121F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4829F, -2.2205F, 1.4377F, -0.3067F, 0.0817F, -0.0306F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(39, 110).addBox(-1.0829F, -3.2934F, 0.4771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.7829F, 0.1795F, -1.4623F, -0.3973F, 0.4392F, -0.1766F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(128, 105).addBox(-0.3946F, 0.0498F, 0.0991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7829F, -1.6205F, 5.7377F, -0.3417F, 0.209F, -0.013F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(128, 128).addBox(-0.8033F, -0.3324F, 0.0832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7829F, -1.1205F, 3.7377F, 0.0597F, 0.209F, -0.013F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(129, 48).addBox(1.0648F, 3.61F, 2.3902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1338F, 3.5666F, -2.7321F, 0.5627F, -0.401F, -0.0166F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 37).addBox(-0.7087F, -0.4022F, -0.0693F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.1338F, 4.8666F, 2.7679F, -0.3574F, -0.2358F, 0.049F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 99).addBox(-0.1338F, -1.0514F, -0.4847F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.1338F, 3.5666F, -2.7321F, -0.3491F, -0.1047F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(60, 100).addBox(-0.4102F, -0.6818F, -0.5814F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.4777F, 3.8057F, -2.6755F, -0.5585F, -0.192F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(73, 96).addBox(-0.4102F, 0.7253F, 3.7882F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.4777F, 3.8057F, -2.6755F, -0.2269F, -0.192F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(117, 89).addBox(-0.3926F, -0.8645F, -2.4571F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1338F, 3.5666F, 1.8679F, -1.1616F, -0.1845F, 0.0347F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(128, 101).addBox(-0.2783F, -0.7616F, 0.4286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.1338F, 3.5666F, 1.8679F, -0.9401F, -0.2963F, -0.016F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(113, 61).addBox(0.575F, 0.7854F, -0.5504F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F))
				.texOffs(108, 113).addBox(0.575F, 0.7854F, -1.1504F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8777F, 3.6057F, -8.6755F, -1.2372F, -0.127F, -0.0318F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(115, 41).addBox(0.575F, 0.2039F, -1.6403F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.8777F, 3.6057F, -8.6755F, 0.5082F, -0.127F, -0.0318F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(115, 35).addBox(0.575F, -0.7961F, -1.1403F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.8777F, 3.6057F, -8.6755F, -0.0329F, -0.127F, -0.0318F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(47, 89).addBox(0.0753F, -1.0177F, -4.8227F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8777F, 3.0057F, -3.0755F, 0.2253F, -0.1285F, 0.0251F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(120, 56).addBox(-0.8033F, 0.7517F, -1.7362F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.7829F, -1.1205F, 3.7377F, 0.3041F, 0.209F, -0.013F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(14, 109).addBox(-0.8033F, 0.2801F, -0.2805F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7829F, -1.1205F, 3.7377F, -0.0799F, 0.209F, -0.013F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(33, 53).addBox(-1.0F, -0.1F, 1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(60, 87).addBox(-0.002F, -0.018F, -0.0892F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7316F, 2.9419F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(86, 74).addBox(0.0F, 0.0342F, -0.2607F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9316F, -2.8581F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 1.4219F, 0.131F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(25, 114).addBox(-0.5F, -0.1117F, -3.0811F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.7318F, 2.7103F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(101, 121).addBox(-0.5F, 1.7586F, 3.486F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 89).addBox(-1.5F, -2.6619F, -2.4279F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 0.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(75, 74).addBox(-1.0F, -0.092F, -0.2185F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 80).addBox(-1.5F, 11.8855F, -0.0616F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(78, 104).addBox(-1.0F, 5.6267F, -1.4609F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(93, 9).addBox(-1.9F, -0.6745F, -1.7999F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 19.4952F, 0.4663F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(82, 119).addBox(-0.5F, -5.7F, -1.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(25, 121).addBox(0.55F, -1.6931F, -1.1712F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.15F, 17.0605F, -1.0612F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(103, 82).addBox(-0.5F, -0.1609F, -0.3336F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.8285F, 0.0756F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(108, 82).addBox(-2.05F, -1.5077F, -1.5286F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.15F, 17.0605F, -1.0612F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(108, 14).addBox(-1.9F, -15.0978F, 3.6681F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(32, 78).addBox(-1.0F, -0.171F, -1.9357F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 1.5952F, 3.2071F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(42, 70).addBox(-1.9F, -12.735F, 0.6314F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(102, 52).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 19.2315F, -1.3948F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(70, 0).addBox(-3.0F, -1.4696F, -3.8933F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(62, 65).addBox(-3.0F, -1.4F, -4.9F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1995F, -4.5791F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 1.4219F, 0.131F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(114, 28).addBox(-0.5F, -0.1117F, -3.0811F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.7318F, 2.7103F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(117, 121).addBox(-0.5F, 1.7586F, 3.486F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(32, 89).addBox(-1.5F, -2.6619F, -2.4279F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 0.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(21, 78).addBox(-1.0F, -0.092F, -0.2185F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(85, 51).addBox(-1.5F, 11.8855F, -0.0616F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(87, 104).addBox(-1.0F, 5.6267F, -1.4609F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2897F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(93, 18).addBox(-0.1F, -0.6745F, -1.7999F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 19.4952F, 0.4663F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(18, 121).addBox(-0.5F, -5.7F, -1.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(59, 121).addBox(-1.55F, -1.6931F, -1.1712F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.15F, 17.0605F, -1.0612F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(103, 97).addBox(-0.5F, -0.1609F, -0.3336F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 2.8285F, 0.0756F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(108, 98).addBox(0.05F, -1.5077F, -1.5286F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.15F, 17.0605F, -1.0612F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(108, 89).addBox(-0.1F, -15.0978F, 3.6681F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(104, 61).addBox(-1.0F, -0.171F, -1.9357F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 1.5952F, 3.2071F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(51, 70).addBox(-0.1F, -12.735F, 0.6314F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(104, 35).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 19.2315F, -1.3948F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(70, 8).addBox(-3.0F, -1.4696F, -3.8933F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.4451F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(68, 19).addBox(-3.0F, -1.4F, -4.9F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1995F, -4.5791F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(62, 37).addBox(-1.0F, -0.7339F, -10.0274F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F))
				.texOffs(39, 130).addBox(0.0F, -4.558F, -13.9655F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7114F, -5.2632F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(19, 131).addBox(0.0F, -4.4375F, -0.0626F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4339F, -11.9274F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(114, 131).addBox(0.0F, -4.4053F, -0.01F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2661F, -15.9274F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(35, 134).addBox(0.0F, -3.8877F, 0.0094F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4661F, -17.9274F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 69).addBox(-1.0F, -0.0966F, -8.0741F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6339F, -9.9274F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 123).addBox(0.0F, -5.1576F, 5.9015F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 123).addBox(0.0F, -4.5576F, 2.9015F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(37, 122).addBox(0.0F, -4.4576F, -0.0985F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7339F, -6.9274F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(119, 87).mirror().addBox(-3.916F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -0.1333F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(117, 20).mirror().addBox(-3.416F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -3.1333F, -0.2056F, -0.0503F, -0.2215F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(133, 14).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -6.1333F, -0.1657F, -0.1321F, -0.652F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(93, 34).mirror().addBox(-2.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -6.1333F, -0.0828F, -0.2515F, -1.08F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(130, 87).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -9.1333F, -0.0828F, -0.2515F, -1.08F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(64, 132).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -9.1333F, -0.1657F, -0.1321F, -0.652F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(132, 29).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.426F, -11.4333F, 0.1183F, 0.0037F, -0.6348F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(135, 4).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.426F, -11.4333F, 0.1196F, -0.0094F, -1.0709F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(137, 87).mirror().addBox(-3.8936F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.426F, -11.4333F, 0.1124F, 0.0419F, -1.5043F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(47, 97).mirror().addBox(-7.8936F, -2.4262F, -0.2666F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.726F, -13.4333F, 0.1485F, 0.1768F, -1.4303F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(135, 2).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.726F, -13.4333F, 0.2088F, 0.098F, -0.9969F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(131, 112).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.726F, -13.4333F, 0.2445F, 0.0633F, -0.5604F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(25, 135).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.226F, -15.4333F, 0.3247F, 0.0984F, -0.5539F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(135, 95).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.226F, -15.4333F, 0.2669F, 0.1635F, -0.9892F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(-10.8936F, -2.4262F, -0.2666F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.226F, -15.4333F, 0.1737F, 0.2605F, -1.4247F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(68, 32).mirror().addBox(-14.8936F, -2.4262F, -0.2666F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.426F, -17.3333F, 0.1951F, 0.3272F, -1.3836F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(135, 103).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.426F, -17.3333F, 0.3145F, 0.2153F, -0.9453F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(135, 93).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.426F, -17.3333F, 0.3893F, 0.1257F, -0.5118F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(119, 87).addBox(-0.084F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -0.1333F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(117, 20).addBox(-0.584F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -3.1333F, -0.2056F, 0.0503F, 0.2215F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(93, 34).addBox(1.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -6.1333F, -0.0828F, 0.2515F, 1.08F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(133, 14).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -6.1333F, -0.1657F, 0.1321F, 0.652F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(130, 87).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -9.1333F, -0.0828F, 0.2515F, 1.08F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(64, 132).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -9.1333F, -0.1657F, 0.1321F, 0.652F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(132, 29).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.426F, -11.4333F, 0.1183F, -0.0037F, 0.6348F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(135, 4).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.426F, -11.4333F, 0.1196F, 0.0094F, 1.0709F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(137, 87).addBox(2.8936F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.426F, -11.4333F, 0.1124F, -0.0419F, 1.5043F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(47, 97).addBox(2.8936F, -2.4262F, -0.2666F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.726F, -13.4333F, 0.1485F, -0.1768F, 1.4303F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(135, 2).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.726F, -13.4333F, 0.2088F, -0.098F, 0.9969F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(131, 112).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.726F, -13.4333F, 0.2445F, -0.0633F, 0.5604F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(25, 135).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.226F, -15.4333F, 0.3247F, -0.0984F, 0.5539F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(135, 95).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.226F, -15.4333F, 0.2669F, -0.1635F, 0.9892F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 16).addBox(2.8936F, -2.4262F, -0.2666F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.226F, -15.4333F, 0.1737F, -0.2605F, 1.4247F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(68, 32).addBox(2.8936F, -2.4262F, -0.2666F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.426F, -17.3333F, 0.1951F, -0.3272F, 1.3836F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(135, 103).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.426F, -17.3333F, 0.3145F, -0.2153F, 0.9453F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(135, 93).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.426F, -17.3333F, 0.3893F, -0.1257F, 0.5118F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(32, 122).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7339F, -10.0274F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2161F, -17.9746F, -0.219F, -0.0852F, 0.0189F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(133, 37).addBox(0.0F, -3.9022F, -0.0065F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2579F, -1.8104F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(133, 31).addBox(0.0F, -3.2953F, 0.0198F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7579F, -3.7104F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(102, 45).addBox(-1.0F, -0.0448F, -0.0381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2579F, -3.5104F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(98, 132).addBox(0.0F, -4.1784F, 0.0244F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0579F, -4.8104F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(95, 132).addBox(0.0F, -3.7339F, 0.0426F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.1579F, -6.3104F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(80, 132).addBox(0.0F, -3.2134F, -0.0864F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8579F, -7.5104F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(86, 87).addBox(-1.0F, -0.0865F, -1.1546F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.8579F, -6.8104F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(108, 120).mirror().addBox(-0.75F, -1.2559F, 1.9697F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 20.7177F, -1.1109F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(104, 71).mirror().addBox(-0.1106F, 0.5192F, 3.0667F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 18.6305F, 2.2071F, 2.9068F, -1.5052F, -2.3129F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(66, 124).mirror().addBox(-0.1106F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 18.6305F, 2.2071F, 2.5926F, -1.5052F, -2.3129F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(123, 28).mirror().addBox(-0.1106F, 0.5192F, 3.0667F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 18.5305F, 2.2071F, 0.6381F, -1.3205F, -0.1727F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(124, 40).mirror().addBox(-0.1106F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 18.5305F, 2.2071F, 0.324F, -1.3205F, -0.1727F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(78, 114).mirror().addBox(-0.1106F, 0.5192F, 3.0667F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.7305F, 2.2071F, 0.5631F, -1.1651F, -0.1189F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(124, 36).mirror().addBox(-0.1106F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.7305F, 2.2071F, 0.249F, -1.1651F, -0.1189F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(89, 45).mirror().addBox(-0.1106F, 0.5192F, 3.0667F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.7305F, 2.2071F, 0.513F, -1.0098F, -0.1268F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(124, 32).mirror().addBox(-0.1106F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.7305F, 2.2071F, 0.1988F, -1.0098F, -0.1268F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(14, 115).mirror().addBox(-0.5F, -0.1097F, -2.979F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(14, 115).addBox(10.5F, -0.1097F, -2.979F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-5.5F, 6.5163F, -1.8767F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.5F, -0.0286F, -6.0801F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(93, 0).addBox(10.5F, -0.0286F, -6.0801F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.5F, 8.6163F, -3.8767F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(138, 112).mirror().addBox(-3.8936F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.0149F, -9.666F, -0.135F, 1.2157F, -1.6687F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.0149F, -9.666F, 1.1674F, 0.7231F, -0.1915F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(135, 101).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.0149F, -9.666F, 0.7987F, 1.0543F, -0.6566F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(133, 134).mirror().addBox(-1.4539F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.1149F, -8.866F, 0.9048F, 0.5825F, -0.298F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(135, 99).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.1149F, -8.866F, 0.5897F, 0.8342F, -0.7732F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(128, 12).mirror().addBox(-5.7415F, -1.9518F, -0.3082F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.1149F, -8.866F, 0.0457F, 0.9778F, -1.4528F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-1.1837F, -1.7122F, -5.4426F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 17.1259F, -4.7398F, 1.5077F, -0.144F, -1.1561F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(50, 110).mirror().addBox(0.2156F, -1.7122F, -2.5822F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 17.1259F, -4.7398F, 1.4331F, -0.0759F, -0.5009F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(59, 114).mirror().addBox(-0.5F, 0.0375F, -3.047F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(59, 114).addBox(10.5F, 0.0375F, -3.047F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-5.5F, 14.0056F, -6.4728F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(28, 107).mirror().addBox(0.0F, -0.9061F, 0.8234F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 107).addBox(11.0F, -0.9061F, 0.8234F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 19.0259F, -6.0398F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(60, 107).mirror().addBox(-0.5F, -1.3922F, -3.883F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(60, 107).addBox(10.5F, -1.3922F, -3.883F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.5F, 5.4163F, 2.0233F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(135, 18).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.0149F, -6.566F, 0.7277F, 0.5408F, -0.7349F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(128, 132).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.0149F, -6.566F, 0.8791F, 0.2716F, -0.359F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(68, 30).mirror().addBox(-15.729F, -1.955F, -0.2993F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.0149F, -6.566F, 0.4372F, 0.7861F, -1.1978F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.5F, -1.6262F, -11.9162F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 54).addBox(10.5F, -1.6262F, -11.9162F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.5F, 6.1163F, 2.6233F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(123, 75).mirror().addBox(-0.1106F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.7305F, 2.2071F, 0.1894F, -0.8528F, -0.0319F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(45, 99).mirror().addBox(-0.1106F, 0.5192F, 3.0667F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.7305F, 2.2071F, 0.5036F, -0.8528F, -0.0319F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(134, 122).mirror().addBox(-1.4539F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.4149F, -8.166F, 0.9833F, 0.3712F, -0.3596F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(135, 97).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.4149F, -8.166F, 0.7956F, 0.6697F, -0.7298F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(85, 60).mirror().addBox(-9.7415F, -1.9518F, -0.3082F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.4149F, -8.166F, 0.4203F, 0.926F, -1.2443F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(68, 34).mirror().addBox(-13.7415F, -1.9518F, -0.3082F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.4149F, -7.366F, 0.4037F, 0.8249F, -1.2517F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(134, 54).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.4149F, -7.366F, 0.7242F, 0.586F, -0.7664F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(88, 132).mirror().addBox(-1.4539F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.4149F, -7.366F, 0.8937F, 0.3146F, -0.3844F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(132, 77).mirror().addBox(-1.4539F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5149F, -5.466F, 0.793F, 0.2635F, -0.3454F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(11, 135).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5149F, -5.466F, 0.6424F, 0.5021F, -0.741F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(68, 28).mirror().addBox(-16.7415F, -1.9518F, -0.3082F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5149F, -5.466F, 0.3705F, 0.7183F, -1.2071F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(132, 75).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0149F, -3.966F, 0.7189F, 0.2572F, -0.3791F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(135, 10).mirror().addBox(-3.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0149F, -3.966F, 0.5708F, 0.4682F, -0.7891F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-17.7647F, -1.946F, -0.3188F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0149F, -3.966F, 0.3169F, 0.6596F, -1.2559F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(132, 73).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9149F, -2.666F, 0.6846F, 0.2464F, -0.4046F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(135, 8).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9149F, -2.666F, 0.5418F, 0.445F, -0.8188F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(37, 17).mirror().addBox(-17.765F, -1.9458F, -0.318F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9149F, -2.666F, 0.3008F, 0.6271F, -1.2824F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(135, 6).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9149F, -0.966F, 0.5105F, 0.4118F, -0.8495F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(-16.8936F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9149F, -0.966F, 0.2878F, 0.5847F, -1.3076F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(132, 71).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9149F, -0.966F, 0.6441F, 0.2275F, -0.4318F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(112, 77).mirror().addBox(-1.25F, -1.4567F, -1.0903F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 77).addBox(1.15F, -1.4567F, -1.0903F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 20.7177F, -1.1109F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 107).addBox(0.1837F, -1.7122F, -5.4426F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 17.1259F, -4.7398F, 1.5077F, 0.144F, 1.1561F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(50, 110).addBox(-1.2156F, -1.7122F, -2.5822F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 17.1259F, -4.7398F, 1.4331F, 0.0759F, 0.5009F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(135, 18).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0149F, -6.566F, 0.7277F, -0.5408F, 0.7349F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(128, 132).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0149F, -6.566F, 0.8791F, -0.2716F, 0.359F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(68, 30).addBox(2.729F, -1.955F, -0.2993F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0149F, -6.566F, 0.4372F, -0.7861F, 1.1978F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(66, 124).addBox(-0.8894F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 18.6305F, 2.2071F, 2.5926F, 1.5052F, 2.3129F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(104, 71).addBox(-0.8894F, 0.5192F, 3.0667F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 18.6305F, 2.2071F, 2.9068F, 1.5052F, 2.3129F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(124, 40).addBox(-0.8894F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 18.5305F, 2.2071F, 0.324F, 1.3205F, 0.1727F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(123, 28).addBox(-0.8894F, 0.5192F, 3.0667F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 18.5305F, 2.2071F, 0.6381F, 1.3205F, 0.1727F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(124, 36).addBox(-0.8894F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.7305F, 2.2071F, 0.249F, 1.1651F, 0.1189F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(78, 114).addBox(-0.8894F, 0.5192F, 3.0667F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.7305F, 2.2071F, 0.5631F, 1.1651F, 0.1189F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(124, 32).addBox(-0.8894F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.7305F, 2.2071F, 0.1988F, 1.0098F, 0.1268F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(89, 45).addBox(-0.8894F, 0.5192F, 3.0667F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.7305F, 2.2071F, 0.513F, 1.0098F, 0.1268F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(123, 75).addBox(-0.8894F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.7305F, 2.2071F, 0.1894F, 0.8528F, 0.0319F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(45, 99).addBox(-0.8894F, 0.5192F, 3.0667F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.7305F, 2.2071F, 0.5036F, 0.8528F, 0.0319F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(108, 120).addBox(-0.25F, -1.2559F, 1.9697F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 20.7177F, -1.1109F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(135, 101).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.0149F, -9.666F, 0.7987F, -1.0543F, 0.6566F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(135, 0).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.0149F, -9.666F, 1.1674F, -0.7231F, 0.1915F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(138, 112).addBox(2.8936F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.0149F, -9.666F, -0.135F, -1.2157F, 1.6687F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(128, 12).addBox(2.7415F, -1.9518F, -0.3082F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.1149F, -8.866F, 0.0457F, -0.9778F, 1.4528F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(135, 99).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.1149F, -8.866F, 0.5897F, -0.8342F, 0.7732F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(133, 134).addBox(-0.5461F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.1149F, -8.866F, 0.9048F, -0.5825F, 0.298F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(134, 122).addBox(-0.5461F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.4149F, -8.166F, 0.9833F, -0.3712F, 0.3596F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(135, 97).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.4149F, -8.166F, 0.7956F, -0.6697F, 0.7298F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(85, 60).addBox(2.7415F, -1.9518F, -0.3082F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.4149F, -8.166F, 0.4203F, -0.926F, 1.2443F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(68, 34).addBox(2.7415F, -1.9518F, -0.3082F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.4149F, -7.366F, 0.4037F, -0.8249F, 1.2517F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(134, 54).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.4149F, -7.366F, 0.7242F, -0.586F, 0.7664F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(88, 132).addBox(-0.5461F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.4149F, -7.366F, 0.8937F, -0.3146F, 0.3844F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(132, 77).addBox(-0.5461F, -0.0044F, -0.3988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5149F, -5.466F, 0.793F, -0.2635F, 0.3454F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(11, 135).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5149F, -5.466F, 0.6424F, -0.5021F, 0.741F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(68, 28).addBox(2.7415F, -1.9518F, -0.3082F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5149F, -5.466F, 0.3705F, -0.7183F, 1.2071F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(132, 75).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0149F, -3.966F, 0.7189F, -0.2572F, 0.3791F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(135, 10).addBox(1.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0149F, -3.966F, 0.5708F, -0.4682F, 0.7891F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(62, 63).addBox(2.7647F, -1.946F, -0.3188F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0149F, -3.966F, 0.3169F, -0.6596F, 1.2559F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(132, 73).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9149F, -2.666F, 0.6846F, -0.2464F, 0.4046F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(135, 8).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9149F, -2.666F, 0.5418F, -0.445F, 0.8188F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(37, 17).addBox(2.765F, -1.9458F, -0.318F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9149F, -2.666F, 0.3008F, -0.6271F, 1.2824F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(135, 6).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9149F, -0.966F, 0.5105F, -0.4118F, 0.8495F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(27, 68).addBox(2.8936F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9149F, -0.966F, 0.2878F, -0.5847F, 1.3076F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(132, 71).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9149F, -0.966F, 0.6441F, -0.2275F, 0.4318F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(99, 82).addBox(0.0F, -2.6097F, 0.0828F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5081F, -8.4365F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(126, 118).addBox(0.0F, 2.0034F, -7.5129F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7081F, -7.6365F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(126, 48).addBox(0.0F, -0.8936F, -0.0472F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.2187F, -9.7808F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(114, 138).addBox(0.0F, -2.0248F, 0.1038F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3943F, -9.2135F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 51).addBox(-1.0F, -0.0631F, -8.9239F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7081F, -7.6365F, 1.1868F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1591F, 19.2059F, -3.4503F, 1.1734F, 0.0072F, -0.0364F));

		PartDefinition cube_r220 = leftArm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(88, 128).addBox(0.0F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftArm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(101, 112).addBox(0.0419F, -15.7734F, -8.7275F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftArm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(56, 135).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r223 = leftArm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(89, 114).addBox(-0.6433F, -0.2928F, -0.5597F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.4317F, -0.3971F, -0.2345F, -0.4743F, -0.0768F));

		PartDefinition cube_r224 = leftArm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(15, 89).addBox(-0.6F, -2.0F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4632F, 4.3572F, -0.121F, 1.1181F, -0.4743F, -0.0768F));

		PartDefinition cube_r225 = leftArm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(124, 121).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(96, 104).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(27, 54).addBox(-0.5909F, 0.8921F, -1.4717F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6294F, 8.6365F, 1.5062F, -1.4303F, 0.9045F, -1.1025F));

		PartDefinition cube_r226 = leftArm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(125, 22).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(68, 114).addBox(-0.6767F, 0.049F, -0.5432F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2276F, 12.7369F, -0.2626F, 0.4074F, 0.2391F, 0.635F));

		PartDefinition cube_r227 = leftArm3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(135, 131).addBox(11.0848F, 0.8221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-11.4616F, 9.1729F, 10.4465F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r228 = leftArm3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(42, 124).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, 0.049F, -0.5432F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(129, 52).addBox(-0.5945F, 0.0179F, -0.9517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1321F, 0.1729F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1591F, 19.2059F, -3.4503F, 0.5189F, -0.0072F, 0.0364F));

		PartDefinition cube_r229 = rightArm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(128, 93).addBox(-1.0F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightArm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(113, 52).addBox(-1.0419F, -15.7734F, -8.7275F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightArm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(135, 83).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r232 = rightArm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(43, 116).addBox(-0.3567F, -0.2928F, -0.5597F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.4317F, -0.3971F, -0.2345F, 0.4743F, 0.0768F));

		PartDefinition cube_r233 = rightArm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 131).addBox(-0.4F, -2.0F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 4.3572F, -0.121F, 1.1181F, 0.4743F, 0.0768F));

		PartDefinition cube_r234 = rightArm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(80, 125).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(9, 107).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(73, 104).addBox(-0.4091F, 0.8921F, -1.4717F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6294F, 8.6365F, 1.5062F, -1.4375F, -0.8612F, 1.1119F));

		PartDefinition cube_r235 = rightArm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(108, 125).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(96, 117).addBox(-0.3233F, 0.049F, -0.5432F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2276F, 12.7369F, -0.2626F, 0.3863F, -0.2729F, -0.5518F));

		PartDefinition cube_r236 = rightArm3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(136, 63).addBox(-12.0848F, 0.8221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(11.4616F, 9.1729F, 10.4465F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r237 = rightArm3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(75, 124).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, 0.049F, -0.5432F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(129, 118).addBox(-0.4055F, 0.0179F, -0.9517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1321F, 0.1729F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.4779F, -9.7815F, 0.1891F, 0.3588F, 0.2717F));

		PartDefinition cube_r238 = neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(89, 16).addBox(0.0F, -2.4F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 73).addBox(0.0F, -2.4F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 96).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5772F, -3.4376F, 0.3529F, 0.346F, 0.1392F));

		PartDefinition cube_r239 = neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(139, 70).addBox(0.0F, -2.4487F, 3.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 58).addBox(0.0F, -2.4487F, 1.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 36).addBox(-0.5F, -1.9487F, 0.0661F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -5.6F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4F, -4.7F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(56, 139).addBox(0.0F, -1.0018F, 7.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(139, 47).addBox(0.0F, -1.0018F, 5.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(108, 0).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.6263F, -7.1488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9991F, -2.6096F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(89, 122).addBox(0.0F, 0.0555F, 0.005F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9867F, -1.9451F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(108, 7).addBox(-0.5F, -0.8F, -2.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7867F, -1.2451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0366F, -3.3024F, -0.048F, 0.329F, -0.0296F));

		PartDefinition cube_r243 = heads.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(117, 105).addBox(-2.4F, -0.1439F, -0.3773F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 7.4415F, -11.7312F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r244 = heads.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(126, 14).addBox(-1.4F, 0.019F, -0.4098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9F, 7.3415F, -11.8312F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r245 = heads.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(129, 62).addBox(-0.5F, 0.0002F, 0.0292F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3415F, -9.7312F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r246 = heads.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(32, 130).addBox(-0.5F, -0.1444F, -0.1067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 0.0415F, -7.3312F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r247 = heads.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(9, 121).addBox(-0.5F, -0.1551F, -0.1321F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.7415F, -9.5312F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r248 = heads.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(12, 127).addBox(-0.5F, -0.0131F, -0.268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 2.8415F, -10.7312F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r249 = heads.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(106, 136).addBox(-0.5F, -0.1567F, -0.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.8415F, -10.7312F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r250 = heads.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(128, 4).addBox(-0.5F, 0.048F, 0.0286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.9415F, -10.9312F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r251 = heads.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(128, 8).addBox(-0.5F, -0.9932F, -1.8949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2415F, -9.9312F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r252 = heads.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(119, 95).addBox(-0.5F, -0.0164F, -1.7565F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.1415F, -11.1312F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r253 = heads.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(39, 107).addBox(-0.5F, 0.0623F, 0.0621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 5.7415F, -11.8312F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r254 = heads.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(114, 23).addBox(-1.5F, -1.8408F, 0.3493F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.0583F, -4.994F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r255 = heads.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(117, 14).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.165F, -5.5319F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r256 = heads.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(119, 10).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.8542F, -0.5316F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r257 = heads.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 136).addBox(-0.615F, -0.5378F, 0.7085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.615F, 1.2865F, -1.9132F, 0.6261F, 0.0512F, -0.2097F));

		PartDefinition cube_r258 = heads.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(113, 68).addBox(-2.5F, -0.0435F, 1.5008F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(15, 102).addBox(-2.5F, -0.0435F, -0.0992F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.7417F, -2.194F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r259 = heads.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(115, 47).addBox(-2.5F, 0.0004F, 0.0129F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.4417F, -3.194F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r260 = heads.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(73, 119).addBox(-1.0F, 0.0563F, 0.0554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4417F, -3.894F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r261 = heads.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(123, 71).addBox(-1.5F, -0.0035F, -0.0281F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9417F, -4.894F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r262 = heads.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(131, 109).addBox(-1.5F, -0.0811F, -0.0412F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2417F, -5.594F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r263 = heads.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(128, 0).addBox(-1.0F, -0.0366F, -2.0074F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5583F, -6.794F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r264 = heads.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(119, 5).addBox(-1.5F, -0.05F, 1.9161F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.4583F, -8.494F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r265 = heads.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(99, 74).addBox(-2.0F, 0.2665F, -3.0609F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7417F, -3.094F, 0.5323F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -2.0417F, 0.306F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(19, 127).addBox(-1.4863F, -0.7286F, 0.3561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5198F, 0.1724F, -0.1595F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(133, 136).addBox(-1.4863F, -0.0584F, -0.2391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4726F, 0.1724F, -0.1595F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(122, 61).addBox(-1.1034F, -3.1742F, -0.1951F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.115F, 3.3283F, -2.2192F, -0.1069F, 0.0512F, -0.2097F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(108, 105).addBox(-1.1035F, -2.5041F, -2.134F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, 0.2675F, 0.1366F, -0.1591F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(135, 24).addBox(-1.3301F, 0.0147F, -0.0867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.615F, 4.3283F, -1.0192F, 0.6453F, -0.0117F, -0.126F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(96, 126).addBox(-1.1034F, -3.0156F, 0.9351F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.115F, 3.3283F, -2.2192F, -0.072F, 0.0512F, -0.2097F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(73, 90).addBox(0.0961F, -0.6915F, -2.6352F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 5.8833F, -5.4372F, 0.4625F, -0.2793F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(124, 109).addBox(0.8961F, -0.2979F, -2.2968F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 5.8833F, -5.4372F, 0.3752F, -0.2793F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(101, 135).addBox(0.0F, -0.5F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 5.8428F, -4.172F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(117, 109).addBox(-1.1035F, -1.8886F, -1.7409F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, -0.3172F, 0.1366F, -0.1591F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(119, 82).addBox(-1.9511F, 0.0542F, -0.3536F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -4.2F, 0.7405F, 0.2354F, 0.21F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(123, 79).addBox(-1.1034F, 0.8653F, -0.5178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.115F, 3.3283F, -2.2192F, -0.2029F, 0.0512F, -0.2097F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(133, 66).addBox(-1.0734F, -0.8483F, -0.6369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.115F, 3.3283F, -2.2192F, -0.4472F, 0.0512F, -0.2097F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(45, 132).addBox(-1.0734F, -1.062F, -0.1837F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.115F, 3.3283F, -2.2192F, -0.8836F, 0.0512F, -0.2097F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(128, 134).addBox(-1.0734F, -2.0886F, 0.3187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.115F, 3.3283F, -2.2192F, -0.0109F, 0.0512F, -0.2097F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(122, 136).addBox(-1.0734F, -2.3061F, -0.3938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 136).addBox(-1.0734F, -1.7061F, -0.3938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.115F, 3.3283F, -2.2192F, -0.1505F, 0.0512F, -0.2097F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(89, 136).addBox(-1.0734F, -1.8544F, 1.3072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.115F, 3.3283F, -2.2192F, 0.6523F, 0.0512F, -0.2097F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(136, 37).addBox(-1.0735F, -0.5825F, 1.902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, 2.423F, 0.1366F, -0.1591F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(136, 34).addBox(-1.0735F, -1.6043F, 1.4509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, 1.6987F, 0.1366F, -0.1591F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(136, 124).addBox(-1.0735F, -2.1834F, -1.346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, 0.1104F, 0.1366F, -0.1591F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(136, 31).addBox(-1.0735F, -0.8069F, -1.8909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, -0.4655F, 0.1366F, -0.1591F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(136, 40).addBox(-1.0535F, -1.5663F, -1.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 136).addBox(-0.8735F, -1.5663F, -1.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, -0.0816F, 0.1366F, -0.1591F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(108, 23).addBox(-1.0735F, 0.1583F, -1.8262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, -0.6575F, 0.1366F, -0.1591F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(133, 43).addBox(-1.0735F, -1.7334F, -2.4432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, 0.093F, 0.1366F, -0.1591F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(117, 131).addBox(-1.1035F, -1.9349F, -2.5616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, 1.0005F, 0.1366F, -0.1591F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(34, 116).addBox(-1.1995F, -2.0474F, -0.113F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.015F, 4.4283F, -4.6192F, 1.4933F, 0.6146F, -0.255F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(124, 67).addBox(-1.8F, -1.0091F, -2.1589F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 9.5833F, -10.2372F, 0.5171F, 0.5139F, 0.2726F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(11, 137).addBox(-0.3F, -0.9379F, 0.8139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(128, 79).addBox(-0.3F, -0.9379F, -0.5861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 9.5833F, -10.2372F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(15, 94).addBox(-1.388F, -0.9794F, -0.3061F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.198F, 7.6218F, -8.1723F, 0.8423F, -0.0267F, -0.1265F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(5, 126).addBox(-0.9569F, -0.4891F, -0.6972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.198F, 8.3218F, -8.8723F, 1.2881F, -0.1456F, -0.3935F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(128, 97).addBox(0.0282F, -0.4633F, -2.0213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1306F, 8.2858F, -9.0819F, 0.6451F, 0.4237F, 0.8903F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(128, 83).addBox(-0.9651F, -0.4633F, -1.912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1306F, 8.2858F, -9.0819F, 0.583F, 0.094F, 0.6521F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -2.0417F, 0.306F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(19, 127).mirror().addBox(0.4863F, -0.7286F, 0.3561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5198F, -0.1724F, 0.1595F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(133, 136).mirror().addBox(0.4863F, -0.0584F, -0.2391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4726F, -0.1724F, 0.1595F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(122, 61).mirror().addBox(0.1034F, -3.1742F, -0.1951F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 3.3283F, -2.2192F, -0.1069F, -0.0512F, 0.2097F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(108, 105).mirror().addBox(0.1035F, -2.5041F, -2.134F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, 0.2675F, -0.1366F, 0.1591F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(135, 24).mirror().addBox(0.3301F, 0.0147F, -0.0867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.615F, 4.3283F, -1.0192F, 0.6453F, 0.0117F, 0.126F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(96, 126).mirror().addBox(0.1034F, -3.0156F, 0.9351F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 3.3283F, -2.2192F, -0.072F, -0.0512F, 0.2097F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(73, 90).mirror().addBox(-1.0961F, -0.6915F, -2.6352F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5F, 5.8833F, -5.4372F, 0.4625F, 0.2793F, 0.0F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(124, 109).mirror().addBox(-0.8961F, -0.2979F, -2.2968F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, 5.8833F, -5.4372F, 0.3752F, 0.2793F, 0.0F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(101, 135).mirror().addBox(0.0F, -0.5F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, 5.8428F, -4.172F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(117, 109).mirror().addBox(0.1035F, -1.8886F, -1.7409F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, -0.3172F, -0.1366F, 0.1591F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(119, 82).mirror().addBox(0.9511F, 0.0542F, -0.3536F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.6F, -4.2F, 0.7405F, -0.2354F, -0.21F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(123, 79).mirror().addBox(0.1034F, 0.8653F, -0.5178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 3.3283F, -2.2192F, -0.2029F, -0.0512F, 0.2097F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(133, 66).mirror().addBox(0.0734F, -0.8483F, -0.6369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 3.3283F, -2.2192F, -0.4472F, -0.0512F, 0.2097F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(45, 132).mirror().addBox(0.0734F, -1.062F, -0.1837F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 3.3283F, -2.2192F, -0.8836F, -0.0512F, 0.2097F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(128, 134).mirror().addBox(0.0734F, -2.0886F, 0.3187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 3.3283F, -2.2192F, -0.0109F, -0.0512F, 0.2097F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(122, 136).mirror().addBox(0.0734F, -2.3061F, -0.3938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 136).mirror().addBox(0.0734F, -1.7061F, -0.3938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 3.3283F, -2.2192F, -0.1505F, -0.0512F, 0.2097F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(89, 136).mirror().addBox(0.0734F, -1.8544F, 1.3072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 3.3283F, -2.2192F, 0.6523F, -0.0512F, 0.2097F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(136, 37).mirror().addBox(0.0735F, -0.5825F, 1.902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, 2.423F, -0.1366F, 0.1591F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(136, 34).mirror().addBox(0.0735F, -1.6043F, 1.4509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, 1.6987F, -0.1366F, 0.1591F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(136, 124).mirror().addBox(0.0735F, -2.1834F, -1.346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, 0.1104F, -0.1366F, 0.1591F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(136, 31).mirror().addBox(0.0735F, -0.8069F, -1.8909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, -0.4655F, -0.1366F, 0.1591F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(136, 40).mirror().addBox(0.0535F, -1.5663F, -1.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 136).mirror().addBox(-0.1265F, -1.5663F, -1.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, -0.0816F, -0.1366F, 0.1591F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(108, 23).mirror().addBox(0.0735F, 0.1583F, -1.8262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, -0.6575F, -0.1366F, 0.1591F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(133, 43).mirror().addBox(0.0735F, -1.7334F, -2.4432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, 0.093F, -0.1366F, 0.1591F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(117, 131).mirror().addBox(0.1035F, -1.9349F, -2.5616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, 1.0005F, -0.1366F, 0.1591F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(34, 116).mirror().addBox(0.1995F, -2.0474F, -0.113F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 4.4283F, -4.6192F, 1.4933F, -0.6146F, 0.255F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(124, 67).mirror().addBox(-0.2F, -1.0091F, -2.1589F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.5833F, -10.2372F, 0.5171F, -0.5139F, -0.2726F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(11, 137).mirror().addBox(-0.7F, -0.9379F, 0.8139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(128, 79).mirror().addBox(-0.7F, -0.9379F, -0.5861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 9.5833F, -10.2372F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(0.388F, -0.9794F, -0.3061F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.198F, 7.6218F, -8.1723F, 0.8423F, 0.0267F, 0.1265F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(5, 126).mirror().addBox(-0.0431F, -0.4891F, -0.6972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.198F, 8.3218F, -8.8723F, 1.2881F, 0.1456F, 0.3935F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(128, 97).mirror().addBox(-1.0282F, -0.4633F, -2.0213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1306F, 8.2858F, -9.0819F, 0.6451F, -0.4237F, -0.8903F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(128, 83).mirror().addBox(-0.0349F, -0.4633F, -1.912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.1306F, 8.2858F, -9.0819F, 0.583F, -0.094F, -0.6521F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7006F, 0.6661F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(126, 89).mirror().addBox(0.1F, -1.4581F, -5.6469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(135, 105).mirror().addBox(0.0F, 0.9156F, -5.1747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(135, 105).addBox(2.2F, 0.9156F, -5.1747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(126, 44).mirror().addBox(-0.4F, -0.9712F, 0.0048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.7868F, -12.3093F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(12, 131).mirror().addBox(-1.0F, -0.0294F, 0.0501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(12, 131).addBox(3.2F, -0.0294F, 0.0501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.6F, -1.1988F, -2.4624F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(5, 130).mirror().addBox(0.0F, -1.8835F, -1.487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 130).addBox(2.2F, -1.8835F, -1.487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(107, 130).mirror().addBox(-1.0F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(107, 130).addBox(3.2F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6F, -0.1988F, -2.6624F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(16, 138).mirror().addBox(-1.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(16, 138).addBox(2.7F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, -0.3101F, -3.2604F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(129, 124).mirror().addBox(-1.5F, 0.0055F, -1.8249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(129, 124).addBox(1.1F, 0.0055F, -1.8249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 0.0868F, -3.8093F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(129, 58).mirror().addBox(-1.5F, -1.415F, -1.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(129, 58).addBox(2.7F, -1.415F, -1.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.1F, 1.5868F, -2.8093F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(126, 114).mirror().addBox(-1.5F, -0.9999F, -0.0843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(126, 114).addBox(2.7F, -0.9999F, -0.0843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.3868F, -0.7093F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(135, 20).mirror().addBox(-1.2F, -0.122F, 0.073F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(135, 20).addBox(1.8F, -0.122F, 0.073F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.4132F, -5.7093F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(135, 79).mirror().addBox(0.4F, -2.1713F, -1.4798F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(135, 79).addBox(2.8F, -2.1713F, -1.4798F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(25, 137).mirror().addBox(0.0F, -2.0657F, -2.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(25, 137).addBox(2.2F, -2.0657F, -2.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(64, 128).mirror().addBox(0.0F, -1.0452F, -1.9195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(64, 128).addBox(2.2F, -1.0452F, -1.9195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(120, 51).mirror().addBox(0.0F, -2.4875F, -4.6874F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(117, 116).mirror().addBox(0.0F, -1.3473F, -4.5721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 116).addBox(2.2F, -1.3473F, -4.5721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(128, 18).mirror().addBox(-1.5F, -0.9981F, -1.9843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(128, 18).addBox(2.7F, -0.9981F, -1.9843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, 1.3868F, -0.8093F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(119, 100).mirror().addBox(-1.5F, -1.023F, -2.9745F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(119, 100).addBox(1.1F, -1.023F, -2.9745F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3F, 1.5868F, -2.8093F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(120, 51).addBox(-1.0F, -2.4875F, -4.6874F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, 1.7868F, -5.7093F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(126, 44).addBox(-0.6F, -0.9712F, 0.0048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9F, 2.7868F, -12.3093F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(126, 89).addBox(-1.1F, -1.4581F, -5.6469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6F, 1.7868F, -5.7093F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(95, 62).addBox(-2.4F, -0.0783F, 0.2187F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9F, 1.9868F, -12.7093F, 0.2269F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8886F, 7.3385F, -0.0886F, -0.1739F, 0.0154F));

		PartDefinition cube_r352 = tail.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(42, 131).addBox(0.0F, -4.7559F, 0.0318F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2901F, 13.9202F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r353 = tail.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(61, 127).addBox(0.0F, -5.0908F, 0.0315F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2901F, 11.9202F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r354 = tail.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(58, 127).addBox(0.0F, -5.1258F, 0.0329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3901F, 9.9202F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r355 = tail.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(29, 127).addBox(0.0F, -5.0607F, 0.0344F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4901F, 7.9202F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r356 = tail.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(26, 127).addBox(0.0F, -5.1956F, 0.0341F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4901F, 5.9202F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r357 = tail.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(55, 123).addBox(0.0F, -5.1305F, 0.0338F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4901F, 3.9202F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r358 = tail.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(85, 125).addBox(0.0F, -5.0654F, 0.0352F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5901F, 1.9202F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r359 = tail.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(47, 124).addBox(0.0F, -5.3003F, 0.0349F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5901F, -0.0798F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r360 = tail.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(133, 116).mirror().addBox(-3.0F, -1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 114).mirror().addBox(-2.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 134).mirror().addBox(-2.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 134).mirror().addBox(-2.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 56).mirror().addBox(-2.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 91).mirror().addBox(-2.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 89).mirror().addBox(-2.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 16).mirror().addBox(-3.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 114).addBox(0.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 134).addBox(0.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 134).addBox(0.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 56).addBox(0.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 91).addBox(0.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 89).addBox(0.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 116).addBox(1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 16).addBox(1.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4099F, -0.0798F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r361 = tail.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(122, 128).addBox(0.0F, -0.6133F, -0.5652F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5298F, 14.6866F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r362 = tail.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(104, 127).addBox(0.0F, -0.2618F, -0.0768F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6298F, 11.5866F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r363 = tail.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(71, 128).addBox(0.0F, 0.0322F, -0.1986F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6298F, 9.1866F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r364 = tail.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(22, 131).addBox(0.0F, -0.003F, 0.055F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7298F, 6.3866F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r365 = tail.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(83, 133).addBox(0.0F, -0.0042F, -0.0896F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9933F, 3.4185F, 0.9076F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 37).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(134, 52).addBox(0.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 134).addBox(-0.1F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 118).addBox(-0.1F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 120).addBox(-0.2F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 114).addBox(0.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 12).addBox(0.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 52).mirror().addBox(-2.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 134).mirror().addBox(-1.9F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 118).mirror().addBox(-1.9F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 120).mirror().addBox(-1.8F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 114).mirror().addBox(-1.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 12).mirror().addBox(-1.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2099F, 14.9202F, 0.0542F, -0.2614F, -0.014F));

		PartDefinition cube_r366 = tail2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(77, 131).addBox(0.0F, -4.6F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r367 = tail2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(32, 134).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 11.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r368 = tail2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(8, 134).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 9.0F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r369 = tail2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(5, 134).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r370 = tail2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(132, 22).addBox(0.0F, -4.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r371 = tail2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(74, 131).addBox(0.0F, -4.3F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r372 = tail2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(53, 131).addBox(0.0F, -0.9887F, -0.385F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 12.2858F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r373 = tail2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(101, 127).addBox(0.0F, -1.3578F, -0.4952F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 10.0858F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r374 = tail2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(50, 131).addBox(0.0F, -0.0446F, -0.3556F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 7.3868F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r375 = tail2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(17, 80).addBox(0.0F, -0.2364F, -0.1492F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2199F, 4.2664F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r376 = tail2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(125, 128).addBox(0.0F, -0.1989F, -0.1464F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4199F, 1.8664F, 0.7767F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(35, 19).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, -0.0452F, -0.2615F, 0.0117F));

		PartDefinition cube_r377 = tail3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(94, 138).addBox(0.0F, -2.2F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(79, 138).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(21, 138).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r378 = tail3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(38, 137).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r379 = tail3.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(86, 136).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r380 = tail3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(70, 136).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r381 = tail3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(67, 136).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r382 = tail3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(64, 136).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r383 = tail3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(97, 138).addBox(0.0F, 7.2F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 136).addBox(0.0F, 6.1F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 109).addBox(0.0F, 4.2F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 58).addBox(0.0F, 2.8F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 47).addBox(0.0F, 2.0F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -2.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r384 = tail3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(61, 135).addBox(0.0F, 0.2523F, -0.1361F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 1.3858F, 0.637F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(37, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0397F, 15.0011F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r385 = tail4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(138, 136).addBox(0.0F, -2.3848F, 3.6797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 138).addBox(0.0F, -1.6924F, 1.7899F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 123).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 9.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r386 = tail4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(127, 138).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r387 = tail4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(76, 138).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 5.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r388 = tail4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(73, 138).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r389 = tail4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(138, 66).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r390 = tail4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(0, 139).addBox(0.0F, 12.5F, 22.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 108).addBox(0.0F, 10.5F, 20.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 138).addBox(0.0F, 9.3F, 18.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 138).addBox(0.0F, 8.3F, 16.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 43).addBox(0.0F, 7.3F, 14.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 138).addBox(0.0F, 6.0F, 12.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -13.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0052F, 15.0608F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r391 = tail5.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(47, 139).addBox(0.0F, 16.0F, 28.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 139).addBox(0.0F, 14.8F, 26.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 28).addBox(0.0F, 13.5F, 24.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5577F, -28.175F, 0.5847F, 0.0F, 0.0F));

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