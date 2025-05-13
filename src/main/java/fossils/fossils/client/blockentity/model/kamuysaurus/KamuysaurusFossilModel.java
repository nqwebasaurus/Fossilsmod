package fossils.fossils.client.blockentity.model.kamuysaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KamuysaurusFossilModel extends SkullModelBase {
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

	public KamuysaurusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -38.1385F, 1.6637F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(106, 57).mirror().addBox(-0.5263F, -1.2086F, -2.324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2338F, 5.0666F, 3.2679F, -0.984F, 0.1877F, -0.0018F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0668F, 5.2547F, 7.8294F, -0.4745F, 0.2406F, -0.0065F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 100).mirror().addBox(-0.8405F, -0.0144F, -3.1627F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.809F, 1.6163F, -7.2701F, 0.4536F, 0.1309F, -0.0023F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(101, 70).mirror().addBox(-0.2245F, -1.7381F, -0.3235F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-4.088F, -0.2374F, -2.3098F, -0.1313F, 0.1308F, -0.0057F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 85).mirror().addBox(-0.3F, 0.8298F, -4.803F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.088F, -1.9374F, -2.8098F, 0.1826F, 0.1305F, -0.0103F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(101, 76).mirror().addBox(-0.2993F, -0.0863F, 0.0141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.088F, -1.9374F, -2.8098F, 0.0084F, 0.1308F, -0.0057F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(75, 84).mirror().addBox(-0.3F, -0.0843F, -4.9811F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.088F, -1.9374F, -2.8098F, 0.3397F, 0.1305F, -0.0103F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(115, 56).mirror().addBox(-0.5F, 1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(121, 112).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5378F, 0.7182F, 9.4407F, -0.6035F, -0.209F, 0.013F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(95, 93).mirror().addBox(-0.285F, -0.3214F, -0.2451F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8829F, -1.2205F, 1.5377F, -0.3664F, -0.2123F, 0.0807F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(-0.145F, -0.0298F, -3.0121F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5829F, -1.1205F, 2.6377F, -0.3067F, -0.0817F, 0.0306F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 94).mirror().addBox(0.0829F, -3.2934F, 0.4771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8829F, 1.2795F, -0.2623F, -0.3973F, -0.4392F, 0.1766F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-0.2171F, -2.2428F, -2.033F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 66).addBox(6.9829F, -2.2428F, -2.033F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8829F, 0.6795F, 1.3377F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(115, 23).mirror().addBox(-0.6054F, 0.0498F, 0.0991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8829F, -0.5205F, 6.9377F, -0.3417F, -0.209F, 0.013F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(115, 66).mirror().addBox(-0.1967F, -0.3324F, 0.0832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8829F, -0.0205F, 4.9377F, 0.0597F, -0.209F, 0.013F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.4548F, -0.6403F, 0.5683F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2338F, 5.0666F, 3.2679F, -0.1778F, 0.2406F, -0.0065F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(93, 70).mirror().addBox(-0.3645F, -0.6403F, -1.4151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2338F, 5.0666F, 3.2679F, -0.1736F, 0.1031F, 0.0182F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(81, 8).mirror().addBox(-0.5898F, -0.597F, -0.5285F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5777F, 3.9057F, -1.4754F, -0.4874F, 0.1915F, 0.0136F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(75, 76).mirror().addBox(-0.5898F, 0.8228F, 3.8107F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5777F, 3.9057F, -1.4754F, -0.1558F, 0.1915F, 0.0136F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(99, 88).mirror().addBox(-0.6832F, -1.7688F, -1.4375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2338F, 5.0666F, 3.2679F, -0.758F, 0.2889F, 0.0687F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(110, 39).mirror().addBox(-0.8405F, 6.2928F, -0.613F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9777F, 2.8057F, -0.9755F, -1.5011F, 0.1309F, -0.0023F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(101, 12).mirror().addBox(-0.8405F, -1.7989F, -6.8796F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9777F, 2.8057F, -0.9755F, 0.2442F, 0.1309F, -0.0023F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(95, 99).mirror().addBox(-0.8405F, 0.1856F, -3.1627F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4168F, 1.7829F, -4.2937F, -0.1223F, 0.1309F, -0.0023F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-1.0803F, -0.823F, -4.868F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9777F, 2.8057F, -0.9755F, -0.0383F, 0.1176F, -0.0576F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(83, 31).mirror().addBox(-4.2F, -0.4F, 9.6F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 49).mirror().addBox(-3.2F, -0.4F, 1.6F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 31).addBox(0.2F, -0.4F, 9.6F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(46, 49).addBox(0.2F, -0.4F, 1.6F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6114F, -5.2615F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(-0.2171F, -1.2919F, -2.8938F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 36).addBox(6.9829F, -1.2919F, -2.8938F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8829F, 0.6795F, 1.3377F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(105, 6).mirror().addBox(0.7033F, 0.7517F, -1.7362F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -0.0205F, 4.9377F, 0.3041F, -0.209F, 0.013F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(94, 6).mirror().addBox(-0.1967F, 0.2801F, -0.2805F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8829F, -0.0205F, 4.9377F, -0.0799F, -0.209F, 0.013F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(101, 70).addBox(-0.7755F, -1.7381F, -0.3235F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.088F, -0.2374F, -2.3098F, -0.1313F, -0.1308F, 0.0057F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(57, 85).addBox(-0.7F, 0.8298F, -4.803F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.088F, -1.9374F, -2.8098F, 0.1826F, -0.1305F, 0.0103F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(101, 76).addBox(-0.7007F, -0.0863F, 0.0141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.088F, -1.9374F, -2.8098F, 0.0084F, -0.1308F, 0.0057F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(75, 84).addBox(-0.7F, -0.0843F, -4.9811F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.088F, -1.9374F, -2.8098F, 0.3397F, -0.1305F, 0.0103F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(115, 56).addBox(-0.5F, 1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(121, 112).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5378F, 0.7182F, 9.4407F, -0.6035F, 0.209F, -0.013F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(95, 93).addBox(-0.715F, -0.3214F, -0.2451F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8829F, -1.2205F, 1.5377F, -0.3664F, 0.2123F, -0.0807F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(101, 37).addBox(-0.855F, -0.0298F, -3.0121F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5829F, -1.1205F, 2.6377F, -0.3067F, 0.0817F, -0.0306F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(22, 94).addBox(-1.0829F, -3.2934F, 0.4771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.8829F, 1.2795F, -0.2623F, -0.3973F, 0.4392F, -0.1766F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(115, 23).addBox(-0.3946F, 0.0498F, 0.0991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8829F, -0.5205F, 6.9377F, -0.3417F, 0.209F, -0.013F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(115, 66).addBox(-0.8033F, -0.3324F, 0.0832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8829F, -0.0205F, 4.9377F, 0.0597F, 0.209F, -0.013F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0668F, 5.2547F, 7.8294F, -0.4745F, -0.2406F, 0.0065F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5452F, -0.6403F, 0.5683F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2338F, 5.0666F, 3.2679F, -0.1778F, -0.2406F, 0.0065F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(93, 70).addBox(-0.6355F, -0.6403F, -1.4151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2338F, 5.0666F, 3.2679F, -0.1736F, -0.1031F, -0.0182F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(81, 8).addBox(-0.4102F, -0.597F, -0.5285F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5777F, 3.9057F, -1.4754F, -0.4874F, -0.1915F, -0.0136F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(75, 76).addBox(-0.4102F, 0.8228F, 3.8107F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5777F, 3.9057F, -1.4754F, -0.1558F, -0.1915F, -0.0136F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(106, 57).addBox(-0.4737F, -1.2086F, -2.324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2338F, 5.0666F, 3.2679F, -0.984F, -0.1877F, 0.0018F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(99, 88).addBox(-0.3168F, -1.7688F, -1.4375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2338F, 5.0666F, 3.2679F, -0.758F, -0.2889F, -0.0687F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(110, 39).addBox(-0.1595F, 6.2928F, -0.613F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.9777F, 2.8057F, -0.9755F, -1.5011F, -0.1309F, 0.0023F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(101, 12).addBox(-0.1595F, -1.7989F, -6.8796F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9777F, 2.8057F, -0.9755F, 0.2442F, -0.1309F, 0.0023F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(22, 100).addBox(-0.1595F, -0.0144F, -3.1627F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.809F, 1.6163F, -7.2701F, 0.4536F, -0.1309F, 0.0023F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(95, 99).addBox(-0.1595F, 0.1856F, -3.1627F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.4168F, 1.7829F, -4.2937F, -0.1223F, -0.1309F, 0.0023F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(79, 0).addBox(0.0803F, -0.823F, -4.868F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9777F, 2.8057F, -0.9755F, -0.0383F, -0.1176F, 0.0576F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(105, 6).addBox(-1.7033F, 0.7517F, -1.7362F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.7829F, -0.0205F, 4.9377F, 0.3041F, 0.209F, -0.013F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(94, 6).addBox(-0.8033F, 0.2801F, -0.2805F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.8829F, -0.0205F, 4.9377F, -0.0799F, 0.209F, -0.013F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.1F, 1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(17, 61).addBox(-0.006F, -0.018F, -0.0892F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7316F, 2.6419F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(60, 18).addBox(0.0F, 0.0342F, -5.9607F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7824F, 2.5399F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 2.682F, 0.773F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(86, 101).addBox(-0.5F, -0.1117F, -3.0811F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.4319F, 1.7103F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(70, 108).addBox(-0.5F, -0.0414F, -2.114F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3858F, 1.7727F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(30, 61).addBox(-1.5F, -2.6619F, -2.4279F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 0.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(39, 79).addBox(-1.0F, -0.092F, -0.1185F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.4319F, -1.2897F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(46, 60).addBox(-1.5F, 9.8855F, -0.0616F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.4319F, -1.2897F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(10, 103).addBox(-1.0F, -2.1F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4491F, 2.2459F, 0.8378F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(9, 74).addBox(-1.9F, -0.6745F, -1.9999F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 17.5051F, 1.898F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(38, 107).addBox(-0.5F, -5.7F, -1.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(85, 107).addBox(0.55F, -1.8931F, -1.1712F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.15F, 14.2605F, -0.5612F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(64, 92).addBox(0.7F, 0.5218F, -1.7671F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2475F, 1.5533F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(90, 35).addBox(-2.05F, -1.5077F, -1.5287F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.15F, 14.2605F, -0.5612F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(42, 93).addBox(-1.9F, -0.4978F, 0.0681F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2885F, -1.7136F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(111, 98).addBox(-1.0F, -0.171F, -1.7357F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 1.5952F, 3.2071F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 70).addBox(-1.9F, -1.4718F, -1.8966F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.2475F, 1.5533F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(88, 42).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.1512F, -1.4354F, -1.2217F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(62, 9).addBox(-3.0F, -0.7696F, -2.3933F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5943F, -0.1564F, 0.7505F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(63, 60).addBox(-3.0F, -1.4F, -2.6F, 6.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5968F, -2.3348F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 2.682F, 0.773F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5F, -0.1117F, -3.0811F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.4319F, 1.7103F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(108, 81).addBox(-0.5F, -0.0414F, -2.114F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3858F, 1.7727F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(45, 69).addBox(-1.5F, -2.6619F, -2.4279F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 0.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(48, 79).addBox(-1.0F, -0.092F, -0.1185F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.4319F, -1.2897F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 61).addBox(-1.5F, 9.8855F, -0.0616F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.4319F, -1.2897F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(103, 18).addBox(-1.0F, -2.1F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4491F, 2.2459F, 0.8378F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(60, 76).addBox(-0.1F, -0.6745F, -1.9999F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 17.5051F, 1.898F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(45, 107).addBox(-0.5F, -5.7F, -1.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(63, 108).addBox(-1.55F, -1.8931F, -1.1712F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.15F, 14.2605F, -0.5612F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 93).addBox(-1.7F, 0.5218F, -1.7671F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2475F, 1.5533F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(90, 74).addBox(0.05F, -1.5077F, -1.5287F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.15F, 14.2605F, -0.5612F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(86, 93).addBox(-0.1F, -0.4978F, 0.0681F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2885F, -1.7136F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(112, 0).addBox(-1.0F, -0.171F, -1.7357F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 1.5952F, 3.2071F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(30, 71).addBox(-0.1F, -1.4718F, -1.8966F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.2475F, 1.5533F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(88, 84).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.1512F, -1.4354F, -1.2217F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(69, 48).addBox(-3.0F, -0.7696F, -2.3933F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5943F, -0.1564F, 0.7505F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(71, 36).addBox(-3.0F, -1.4F, -2.6F, 6.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5968F, -2.3348F, -0.3054F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(35, 0).addBox(-1.0F, -0.7339F, -11.0274F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.694F, -4.2634F, 0.0175F, 0.0436F, 0.0008F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(105, 119).addBox(0.0F, -3.2027F, -1.0571F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4646F, -11.911F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(119, 13).addBox(0.0F, -3.1241F, -0.9381F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0344F, -13.972F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(86, 24).addBox(-1.0F, 0.0022F, -4.0898F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7339F, -10.9274F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 109).addBox(0.0F, -4.5576F, 5.9015F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7339F, -7.9274F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(39, 71).addBox(0.0F, -4.5576F, -1.9985F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3495F, -3.0425F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(26, 106).addBox(0.0F, -4.4576F, -2.0985F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.577F, -5.9336F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(117, 89).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.126F, -4.1334F, -0.1804F, -0.1989F, -0.531F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(122, 72).mirror().addBox(-2.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.126F, -4.1334F, -0.0674F, -0.3182F, -0.9656F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(117, 78).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.126F, -7.1333F, 0.0451F, -0.0624F, -0.5605F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(119, 11).mirror().addBox(-4.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.126F, -7.1333F, 0.1157F, -0.0566F, -1.4323F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(120, 52).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.126F, -7.1333F, 0.0811F, -0.1002F, -0.9967F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(120, 39).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.126F, -10.1334F, 0.2617F, 0.1784F, -0.9896F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(117, 42).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.126F, -10.1334F, 0.3264F, 0.114F, -0.5532F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(88, 22).mirror().addBox(-8.8936F, -2.4262F, -0.2666F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.126F, -10.1334F, 0.1624F, 0.2718F, -1.4272F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(115, 95).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -12.4334F, 0.4091F, 0.164F, -0.4894F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(69, 54).mirror().addBox(-11.8936F, -2.4262F, -0.2666F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -12.4334F, 0.1771F, 0.3668F, -1.3702F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(120, 37).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -12.4334F, 0.3162F, 0.2584F, -0.9254F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(62, 15).mirror().addBox(-3.916F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -1.1333F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(60, 31).mirror().addBox(-12.8936F, -2.4262F, -0.2666F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.726F, -14.4334F, 0.1885F, 0.4358F, -1.3483F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(119, 19).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.726F, -14.4334F, 0.3572F, 0.316F, -0.8963F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(106, 62).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.726F, -14.4334F, 0.4701F, 0.1997F, -0.4609F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(62, 15).addBox(-0.084F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -1.1333F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(122, 72).addBox(1.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.126F, -4.1334F, -0.0674F, 0.3182F, 0.9656F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(117, 89).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.126F, -4.1334F, -0.1804F, 0.1989F, 0.531F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(120, 52).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.126F, -7.1333F, 0.0811F, 0.1002F, 0.9967F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(119, 11).addBox(2.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.126F, -7.1333F, 0.1157F, 0.0566F, 1.4323F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(117, 78).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.126F, -7.1333F, 0.0451F, 0.0624F, 0.5605F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(88, 22).addBox(2.8937F, -2.4262F, -0.2666F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.126F, -10.1334F, 0.1624F, -0.2718F, 1.4272F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(117, 42).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.126F, -10.1334F, 0.3264F, -0.114F, 0.5532F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(120, 39).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.126F, -10.1334F, 0.2617F, -0.1784F, 0.9896F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(120, 37).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -12.4334F, 0.3162F, -0.2584F, 0.9254F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(69, 54).addBox(2.8937F, -2.4262F, -0.2666F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -12.4334F, 0.1771F, -0.3668F, 1.3702F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(115, 95).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -12.4334F, 0.4091F, -0.164F, 0.4894F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(60, 31).addBox(2.8937F, -2.4262F, -0.2666F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.726F, -14.4334F, 0.1885F, -0.4358F, 1.3483F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(119, 19).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.726F, -14.4334F, 0.3572F, -0.316F, 0.8963F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(106, 62).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.726F, -14.4334F, 0.4701F, -0.1997F, 0.4609F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(109, 110).addBox(0.0F, -3.8F, -2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6292F, -9.0302F, 0.1658F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8127F, -14.7881F, -0.0437F, 0.0436F, -0.0019F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(89, 121).addBox(0.0F, -3.3022F, -0.9065F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.025F, -0.941F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(84, 42).addBox(0.0F, -3.6953F, -0.9802F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9821F, -2.615F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(88, 15).addBox(-1.0F, -0.0448F, -0.0381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2579F, -3.5104F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(57, 79).addBox(0.0F, -3.5784F, 0.0244F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0579F, -4.8104F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(47, 121).addBox(0.0F, -3.0339F, 0.0426F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.1579F, -6.3104F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(108, 119).addBox(0.0F, -3.2134F, -0.0864F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8579F, -7.5104F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(62, 0).addBox(-1.0F, -0.0865F, -1.1546F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.8579F, -6.8104F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(95, 51).mirror().addBox(0.3F, -3.6F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.657F, 12.4994F, -4.5118F, 1.5F, -0.4923F, -1.1316F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(102, 106).mirror().addBox(-0.492F, -1.8897F, -1.1565F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1747F, 9.6826F, -5.2691F, 1.1995F, -0.1985F, -0.4687F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(99, 24).mirror().addBox(-0.5F, 0.1586F, 0.0628F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(99, 24).addBox(8.5F, 0.1586F, 0.0628F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.5F, 9.1163F, -7.3767F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.5F, -6.3947F, 9.6235F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 90).addBox(8.5F, -6.3947F, 9.6235F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.5F, 9.1163F, -7.3767F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(63, 66).mirror().addBox(-0.5F, -1.3551F, 2.68F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(63, 66).addBox(8.5F, -1.3551F, 2.68F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.5F, 9.1163F, -7.3767F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(99, 81).mirror().addBox(-0.5F, -3.8583F, 7.9094F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(99, 81).addBox(8.5F, -3.8583F, 7.9094F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.5F, 9.1163F, -7.3767F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(18, 120).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.0149F, -6.566F, 0.7277F, 0.5408F, -0.7349F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(115, 60).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.0149F, -6.566F, 0.8791F, 0.2716F, -0.359F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-6.729F, -1.955F, -0.2993F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.0149F, -6.566F, 0.4372F, 0.7861F, -1.1978F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(110, 30).mirror().addBox(-0.1348F, 0.043F, -0.0577F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 14.1305F, 0.5071F, 0.3826F, -1.2049F, -0.5942F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(108, 87).mirror().addBox(-0.1348F, 0.9334F, 2.7877F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 14.1305F, 0.5071F, 0.6968F, -1.2049F, -0.5942F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(5, 109).mirror().addBox(-0.233F, 0.1471F, -0.0373F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 13.9305F, 0.6071F, 0.1899F, -0.978F, -0.4438F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.233F, 1.0387F, 2.775F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 13.9305F, 0.6071F, 0.504F, -0.978F, -0.4438F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(110, 11).mirror().addBox(-0.3178F, 0.038F, -0.0663F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 14.2305F, 0.7071F, -0.14F, -0.9021F, 0.164F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(69, 98).mirror().addBox(-0.3178F, 0.926F, 2.781F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 14.2305F, 0.7071F, 0.1742F, -0.9021F, 0.164F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(109, 106).mirror().addBox(-0.581F, 0.2059F, -0.2448F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 14.0305F, 1.0071F, -0.0366F, -0.7446F, 0.0371F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(99, 42).mirror().addBox(-0.581F, 1.0304F, 2.5594F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 14.0305F, 1.0071F, 0.2776F, -0.7446F, 0.0371F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(52, 109).mirror().addBox(-0.4976F, -0.006F, -0.3257F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 14.2305F, 1.0071F, 0.391F, -0.5936F, -0.1452F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 42).mirror().addBox(-0.4976F, 0.8039F, 2.548F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 14.2305F, 1.0071F, 0.7051F, -0.5936F, -0.1452F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(106, 93).mirror().addBox(-0.75F, -0.3188F, 2.8708F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 93).addBox(1.65F, -0.3188F, 2.8708F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 12.5177F, -4.1109F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(115, 27).mirror().addBox(-1.4539F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5149F, -5.466F, 0.759F, 0.2516F, -0.354F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(5, 120).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5149F, -5.466F, 0.6134F, 0.4784F, -0.7547F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(46, 58).mirror().addBox(-13.7415F, -1.9518F, -0.3082F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5149F, -5.466F, 0.3544F, 0.6856F, -1.2175F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(114, 9).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0149F, -3.966F, 0.6688F, 0.2376F, -0.3914F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(119, 31).mirror().addBox(-3.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0149F, -3.966F, 0.5302F, 0.4307F, -0.8067F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(56, 34).mirror().addBox(-14.7647F, -1.946F, -0.3188F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0149F, -3.966F, 0.2971F, 0.6097F, -1.2676F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(111, 103).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9149F, -2.666F, 0.6353F, 0.2255F, -0.4161F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(119, 29).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9149F, -2.666F, 0.5028F, 0.4065F, -0.8349F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(35, 16).mirror().addBox(-14.765F, -1.9458F, -0.318F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9149F, -2.666F, 0.283F, 0.5769F, -1.2925F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(119, 21).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9149F, -0.966F, 0.4613F, 0.3589F, -0.868F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(35, 14).mirror().addBox(-14.8936F, -2.4262F, -0.2666F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9149F, -0.966F, 0.2669F, 0.5172F, -1.3185F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9149F, -0.966F, 0.5794F, 0.1978F, -0.4455F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(95, 59).mirror().addBox(-1.25F, -0.619F, -0.0962F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 59).addBox(1.15F, -0.619F, -0.0962F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 12.5177F, -4.1109F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(95, 51).addBox(-1.3F, -3.6F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.657F, 12.4994F, -4.5118F, 1.5F, 0.4923F, 1.1316F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(102, 106).addBox(-0.508F, -1.8897F, -1.1565F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1747F, 9.6826F, -5.2691F, 1.1995F, 0.1985F, 0.4687F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(18, 120).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0149F, -6.566F, 0.7277F, -0.5408F, 0.7349F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(115, 60).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0149F, -6.566F, 0.8791F, -0.2716F, 0.359F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(78, 74).addBox(2.729F, -1.955F, -0.2993F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0149F, -6.566F, 0.4372F, -0.7861F, 1.1978F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(110, 30).addBox(-0.8652F, 0.043F, -0.0577F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 14.1305F, 0.5071F, 0.3826F, 1.2049F, 0.5942F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(108, 87).addBox(-0.8652F, 0.9334F, 2.7877F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 14.1305F, 0.5071F, 0.6968F, 1.2049F, 0.5942F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(5, 109).addBox(-0.767F, 0.1471F, -0.0373F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 13.9305F, 0.6071F, 0.1899F, 0.978F, 0.4438F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 86).addBox(-0.767F, 1.0387F, 2.775F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 13.9305F, 0.6071F, 0.504F, 0.978F, 0.4438F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(110, 11).addBox(-0.6822F, 0.038F, -0.0663F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 14.2305F, 0.7071F, -0.14F, 0.9021F, -0.164F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(69, 98).addBox(-0.6822F, 0.926F, 2.781F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 14.2305F, 0.7071F, 0.1742F, 0.9021F, -0.164F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(109, 106).addBox(-0.419F, 0.2059F, -0.2448F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 14.0305F, 1.0071F, -0.0366F, 0.7446F, -0.0371F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(99, 42).addBox(-0.419F, 1.0304F, 2.5594F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 14.0305F, 1.0071F, 0.2776F, 0.7446F, -0.0371F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(52, 109).addBox(-0.5024F, -0.006F, -0.3257F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 14.2305F, 1.0071F, 0.391F, 0.5936F, 0.1452F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(71, 42).addBox(-0.5024F, 0.8039F, 2.548F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 14.2305F, 1.0071F, 0.7051F, 0.5936F, 0.1452F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(115, 27).addBox(-0.5461F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5149F, -5.466F, 0.759F, -0.2516F, 0.354F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(5, 120).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5149F, -5.466F, 0.6134F, -0.4784F, 0.7547F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(46, 58).addBox(2.7415F, -1.9518F, -0.3082F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5149F, -5.466F, 0.3544F, -0.6856F, 1.2175F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(114, 9).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0149F, -3.966F, 0.6688F, -0.2376F, 0.3914F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(119, 31).addBox(1.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0149F, -3.966F, 0.5302F, -0.4307F, 0.8067F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(56, 34).addBox(2.7647F, -1.946F, -0.3188F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0149F, -3.966F, 0.2971F, -0.6097F, 1.2676F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(111, 103).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9149F, -2.666F, 0.6353F, -0.2255F, 0.4161F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(119, 29).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9149F, -2.666F, 0.5028F, -0.4065F, 0.8349F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(35, 16).addBox(2.765F, -1.9458F, -0.318F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9149F, -2.666F, 0.283F, -0.5769F, 1.2925F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(119, 21).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9149F, -0.966F, 0.4613F, -0.3589F, 0.868F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(35, 14).addBox(2.8937F, -2.4262F, -0.2666F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9149F, -0.966F, 0.2669F, -0.5172F, 1.3185F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(108, 91).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9149F, -0.966F, 0.5794F, -0.1978F, 0.4455F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8258F, 10.4192F, -5.3054F, -0.3108F, 0.0255F, -0.076F));

		PartDefinition cube_r185 = leftArm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(112, 18).addBox(0.0F, -2.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4737F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftArm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(104, 99).addBox(0.0419F, -15.7734F, -8.7275F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8639F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftArm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(118, 120).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r188 = leftArm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(78, 103).addBox(-0.6433F, -0.2928F, -0.5597F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.4317F, -0.3971F, -0.2345F, -0.4743F, -0.0768F));

		PartDefinition cube_r189 = leftArm.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(90, 51).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4283F, 3.6896F, -0.3721F, 0.8127F, -0.4743F, -0.0768F));

		PartDefinition cube_r190 = leftArm.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(110, 69).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(24, 74).addBox(-0.5909F, 0.8921F, -1.4717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8318F, 8.0901F, 1.5259F, -1.3369F, 1.076F, -1.0434F));

		PartDefinition cube_r191 = leftArm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(5, 113).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(57, 92).addBox(-0.6767F, 0.049F, -1.0433F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1197F, 10.6878F, -0.6494F, 0.415F, 0.174F, 0.8492F));

		PartDefinition cube_r192 = leftArm3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(114, 110).addBox(11.0848F, 0.8221F, -11.4975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-11.4616F, 9.1729F, 10.4465F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r193 = leftArm3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(14, 109).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, 0.049F, -0.5433F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(0, 117).addBox(-0.5945F, 0.0179F, -0.5517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1322F, 0.1729F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8258F, 10.4192F, -5.3054F, 0.4309F, -0.0255F, 0.076F));

		PartDefinition cube_r194 = rightArm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(92, 112).addBox(-1.0F, -2.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4737F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r195 = rightArm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(19, 106).addBox(-1.0419F, -15.7734F, -8.7275F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8639F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r196 = rightArm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(121, 4).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r197 = rightArm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(95, 105).addBox(-0.3567F, -0.2928F, -0.5597F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.4317F, -0.3971F, -0.2345F, 0.4743F, 0.0768F));

		PartDefinition cube_r198 = rightArm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(51, 117).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4283F, 3.6896F, -0.3721F, 0.8127F, 0.4743F, 0.0768F));

		PartDefinition cube_r199 = rightArm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(77, 110).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(5, 98).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(81, 91).addBox(-0.4091F, 0.8921F, -1.4717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8318F, 8.0901F, 1.5259F, -1.3686F, -0.9908F, 1.0802F));

		PartDefinition cube_r200 = rightArm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(19, 113).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(35, 93).addBox(-0.3233F, 0.049F, -1.0433F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1197F, 10.6878F, -0.6494F, 0.2109F, -0.3983F, -0.157F));

		PartDefinition cube_r201 = rightArm3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(114, 114).addBox(-12.0848F, 0.8221F, -11.4975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(11.4616F, 9.1729F, 10.4465F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r202 = rightArm3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(31, 110).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, 0.049F, -0.5433F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(29, 117).addBox(-0.4055F, 0.0179F, -0.5517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1322F, 0.1729F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.966F, -6.8882F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r203 = neck4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(92, 124).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5035F, -2.0446F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r204 = neck4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(11, 97).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5772F, -1.8376F, 0.176F, 0.1289F, 0.0229F));

		PartDefinition cube_r205 = neck3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(124, 77).addBox(0.0F, -2.4487F, 3.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 124).addBox(0.0F, -2.4487F, 1.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 15).addBox(-0.5F, -1.9487F, 0.0661F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -5.6F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4F, -4.7F, -0.5273F, 0.1133F, -0.0657F));

		PartDefinition cube_r206 = neck2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(84, 124).addBox(0.0F, -1.0018F, 7.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(19, 103).addBox(0.0F, -1.0018F, 5.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(70, 91).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.6263F, -7.1488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9991F, -2.6096F, -0.0181F, 0.3079F, 0.0777F));

		PartDefinition cube_r207 = neck.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(108, 24).addBox(0.0F, -1.0F, -1.6F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1944F, -1.7822F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r208 = neck.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(82, 56).addBox(-0.5F, -0.8F, -3.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7867F, -1.2451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8201F, -4.2787F, 0.4157F, 0.2878F, 0.1125F));

		PartDefinition cube_r209 = heads.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(90, 81).addBox(-1.5F, -0.8F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.1631F, -10.3172F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r210 = heads.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(71, 122).addBox(-1.4F, 0.019F, 0.5902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9F, 5.6415F, -10.8312F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r211 = heads.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(116, 44).addBox(-0.5F, -0.2557F, -1.7708F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 1.5982F, -8.0646F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r212 = heads.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(113, 52).addBox(-0.5F, -0.752F, -1.7713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.9699F, -8.8527F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r213 = heads.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(122, 26).addBox(-0.5F, -1.0932F, -2.1949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5415F, -8.9312F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r214 = heads.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(122, 23).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.0785F, -9.3674F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r215 = heads.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(121, 8).addBox(-0.5F, 0.0623F, 0.0621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.0415F, -10.8312F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r216 = heads.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(104, 47).addBox(-1.0F, -1.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.165F, -5.5319F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r217 = heads.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(71, 56).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.8542F, -0.5316F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r218 = heads.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(121, 115).addBox(-0.615F, -0.5378F, 0.7085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.615F, 1.2865F, -1.9132F, 0.6261F, 0.0512F, -0.2097F));

		PartDefinition cube_r219 = heads.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(9, 83).addBox(-2.5F, -0.0435F, -0.0992F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.3451F, -2.1418F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r220 = heads.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(11, 90).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(22, 87).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.5125F, -0.6771F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r221 = heads.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(85, 113).addBox(-1.0F, -0.2366F, -1.8074F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.6444F, -6.7432F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r222 = heads.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(69, 103).addBox(-1.5F, -0.05F, 0.016F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.6697F, -6.7625F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r223 = heads.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(104, 64).addBox(-2.0F, -0.0335F, -1.0609F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9297F, -4.4726F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r224 = heads.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(101, 31).addBox(-2.0F, -0.0335F, -1.0609F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4372F, -3.611F, 0.5323F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -2.0417F, 0.306F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(23, 122).addBox(-1.4863F, -0.7286F, 0.3561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.7F, -1.5198F, 0.1724F, -0.1595F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(121, 109).addBox(-1.4863F, -0.0584F, -0.2391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.7F, -0.4726F, 0.1724F, -0.1595F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(110, 76).addBox(-1.1034F, -2.1742F, -0.1951F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.115F, 3.3283F, -2.2192F, -0.1069F, 0.0512F, -0.2097F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(31, 103).addBox(-1.1035F, -2.2041F, -0.834F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, 0.2675F, 0.1366F, -0.1591F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(120, 33).addBox(-1.3301F, 0.0147F, -0.2867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.615F, 4.3283F, -1.0192F, 0.3398F, -0.0117F, -0.126F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(70, 85).addBox(-1.1034F, -3.9156F, -0.9649F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4489F, 4.424F, -0.2988F, -0.0196F, 0.0512F, -0.2097F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(93, 64).addBox(-0.6422F, -0.683F, -2.5773F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4487F, 5.1949F, -4.9096F, 0.026F, 0.1664F, -0.0073F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(42, 101).addBox(0.0F, -0.5F, -1.3F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4613F, 5.4234F, -5.8772F, 0.0344F, 0.1212F, 0.0143F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(56, 102).addBox(-1.1035F, -1.8886F, -1.7409F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.015F, 3.3283F, -2.2192F, -0.3172F, 0.1366F, -0.1591F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(37, 121).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2114F, 4.7614F, -2.4805F, -0.9322F, -0.0686F, -0.2048F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(122, 57).addBox(-0.4259F, 0.4703F, -1.3118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(122, 54).addBox(-0.4259F, 0.4703F, -1.0119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5888F, 2.5119F, -2.1457F, 0.2113F, 0.1527F, -0.1981F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(18, 122).addBox(-0.5741F, 0.1314F, -0.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5888F, 2.5119F, -2.1457F, -0.5566F, 0.1527F, -0.1981F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(122, 16).addBox(-0.5741F, -0.3411F, 0.1883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5888F, 2.5119F, -2.1457F, -0.993F, 0.1527F, -0.1981F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(117, 85).addBox(-0.5741F, -1.1378F, -0.0249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5888F, 2.5119F, -2.1457F, -0.033F, 0.1527F, -0.1981F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(122, 66).addBox(-0.5741F, -1.0348F, -0.2637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 102).addBox(-0.5741F, -0.4348F, -0.2637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5888F, 2.5119F, -2.1457F, -0.1726F, 0.1527F, -0.1981F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(121, 99).addBox(-0.5741F, -0.797F, 0.7297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5888F, 2.5119F, -2.1457F, 0.8484F, 0.1527F, -0.1981F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(122, 13).addBox(-0.5035F, -0.2245F, 0.2113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.879F, 2.5173F, -3.8359F, 2.2929F, 0.1147F, -0.1754F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(84, 121).addBox(-0.5035F, -0.2158F, 0.4219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.879F, 2.5173F, -3.8359F, 1.5686F, 0.1147F, -0.1754F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(61, 122).addBox(-0.5035F, -1.1788F, 0.0602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.879F, 2.5173F, -3.8359F, -0.0197F, 0.1147F, -0.1754F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(5, 122).addBox(-0.5035F, -0.7302F, -0.1644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.879F, 2.5173F, -3.8359F, -0.5956F, 0.1147F, -0.1754F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(56, 121).addBox(-0.59F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 121).addBox(-0.41F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8089F, 2.1837F, -3.6626F, 0.0065F, 0.1147F, -0.1754F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(99, 47).addBox(-0.5035F, -0.0959F, -0.1168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.879F, 2.5173F, -3.8359F, -0.7876F, 0.1147F, -0.1754F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(63, 104).addBox(-0.5035F, -0.7534F, -1.0196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.879F, 2.5173F, -3.8359F, -0.0371F, 0.1147F, -0.1754F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(76, 117).addBox(-1.1035F, -0.0349F, -0.0616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2105F, 4.4569F, -5.1407F, 1.1576F, 0.1366F, -0.1591F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(110, 34).addBox(-1.1995F, -2.0474F, -0.113F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.015F, 4.4283F, -4.6192F, 1.4933F, 0.6146F, -0.255F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(76, 122).addBox(-1.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 6.874F, -11.0343F, 0.0355F, 0.7415F, 0.024F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(115, 70).addBox(-0.3F, -0.9379F, -0.5861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, 7.2832F, -9.9372F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(73, 24).addBox(-0.5F, -0.4F, -2.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.524F, 4.4623F, -7.0992F, 0.755F, -0.0267F, -0.1265F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(9, 70).addBox(-0.9569F, -0.5891F, -1.0972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.598F, 6.0218F, -8.5723F, 0.8954F, -0.1456F, -0.3935F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(114, 5).addBox(-0.9F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-2.2F, 3.834F, -8.2049F, 0.6575F, 0.3168F, 0.2361F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(115, 91).addBox(-0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7052F, 6.4985F, -9.4995F, 0.5021F, 0.569F, 0.6823F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(115, 81).addBox(-0.7762F, -0.5F, -0.8828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.7052F, 6.4985F, -9.4995F, 0.4273F, 0.209F, 0.4889F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -2.0417F, 0.306F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(23, 122).mirror().addBox(0.4863F, -0.7286F, 0.3561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -0.7F, -1.5198F, -0.1724F, 0.1595F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(121, 109).mirror().addBox(0.4863F, -0.0584F, -0.2391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -0.7F, -0.4726F, -0.1724F, 0.1595F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(110, 76).mirror().addBox(0.1034F, -2.1742F, -0.1951F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 3.3283F, -2.2192F, -0.1069F, -0.0512F, 0.2097F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(31, 103).mirror().addBox(0.1035F, -2.2041F, -0.834F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, 0.2675F, -0.1366F, 0.1591F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(120, 33).mirror().addBox(0.3301F, 0.0147F, -0.2867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.615F, 4.3283F, -1.0192F, 0.3398F, 0.0117F, 0.126F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(70, 85).mirror().addBox(0.1034F, -3.9156F, -0.9649F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4489F, 4.424F, -0.2988F, -0.0196F, -0.0512F, 0.2097F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(93, 64).mirror().addBox(-0.3578F, -0.683F, -2.5773F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4487F, 5.1949F, -4.9096F, 0.026F, -0.1664F, 0.0073F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(42, 101).mirror().addBox(0.0F, -0.5F, -1.3F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4613F, 5.4234F, -5.8772F, 0.0344F, -0.1212F, -0.0143F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(56, 102).mirror().addBox(0.1035F, -1.8886F, -1.7409F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 3.3283F, -2.2192F, -0.3172F, -0.1366F, 0.1591F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(37, 121).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2114F, 4.7614F, -2.4805F, -0.9322F, 0.0686F, 0.2048F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(122, 57).mirror().addBox(-0.5741F, 0.4703F, -1.3118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(122, 54).mirror().addBox(-0.5741F, 0.4703F, -1.0119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5888F, 2.5119F, -2.1457F, 0.2113F, -0.1527F, 0.1981F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(18, 122).mirror().addBox(-0.4259F, 0.1314F, -0.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5888F, 2.5119F, -2.1457F, -0.5566F, -0.1527F, 0.1981F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(122, 16).mirror().addBox(-0.4259F, -0.3411F, 0.1883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5888F, 2.5119F, -2.1457F, -0.993F, -0.1527F, 0.1981F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(117, 85).mirror().addBox(-0.4259F, -1.1378F, -0.0249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5888F, 2.5119F, -2.1457F, -0.033F, -0.1527F, 0.1981F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(122, 66).mirror().addBox(-0.4259F, -1.0348F, -0.2637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(121, 102).mirror().addBox(-0.4259F, -0.4348F, -0.2637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5888F, 2.5119F, -2.1457F, -0.1726F, -0.1527F, 0.1981F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(121, 99).mirror().addBox(-0.4259F, -0.797F, 0.7297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5888F, 2.5119F, -2.1457F, 0.8484F, -0.1527F, 0.1981F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(122, 13).mirror().addBox(-0.4965F, -0.2245F, 0.2113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.879F, 2.5173F, -3.8359F, 2.2929F, -0.1147F, 0.1754F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(84, 121).mirror().addBox(-0.4965F, -0.2158F, 0.4219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.879F, 2.5173F, -3.8359F, 1.5686F, -0.1147F, 0.1754F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(61, 122).mirror().addBox(-0.4965F, -1.1788F, 0.0602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.879F, 2.5173F, -3.8359F, -0.0197F, -0.1147F, 0.1754F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(5, 122).mirror().addBox(-0.4965F, -0.7302F, -0.1644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.879F, 2.5173F, -3.8359F, -0.5956F, -0.1147F, 0.1754F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(56, 121).mirror().addBox(-0.41F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 121).mirror().addBox(-0.59F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8089F, 2.1837F, -3.6626F, 0.0065F, -0.1147F, 0.1754F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(99, 47).mirror().addBox(-0.4965F, -0.0959F, -0.1168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.879F, 2.5173F, -3.8359F, -0.7876F, -0.1147F, 0.1754F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(63, 104).mirror().addBox(-0.4965F, -0.7534F, -1.0196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.879F, 2.5173F, -3.8359F, -0.0371F, -0.1147F, 0.1754F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(76, 117).mirror().addBox(0.1035F, -0.0349F, -0.0616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2105F, 4.4569F, -5.1407F, 1.1576F, -0.1366F, 0.1591F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(110, 34).mirror().addBox(0.1995F, -2.0474F, -0.113F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 4.4283F, -4.6192F, 1.4933F, -0.6146F, 0.255F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(76, 122).mirror().addBox(0.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, 6.874F, -11.0343F, 0.0355F, -0.7415F, -0.024F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(115, 70).mirror().addBox(-0.7F, -0.9379F, -0.5861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.0F, 7.2832F, -9.9372F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(73, 24).mirror().addBox(-0.5F, -0.4F, -2.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.524F, 4.4623F, -7.0992F, 0.755F, 0.0267F, 0.1265F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-0.0431F, -0.5891F, -1.0972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.598F, 6.0218F, -8.5723F, 0.8954F, 0.1456F, 0.3935F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(114, 5).mirror().addBox(-0.1F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(2.2F, 3.834F, -8.2049F, 0.6575F, -0.3168F, -0.2361F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(115, 91).mirror().addBox(-0.8F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7052F, 6.4985F, -9.4995F, 0.5021F, -0.569F, -0.6823F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(115, 81).mirror().addBox(-0.2238F, -0.5F, -0.8828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.7052F, 6.4985F, -9.4995F, 0.4273F, -0.209F, -0.4889F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8006F, 0.6661F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(85, 117).mirror().addBox(-1.0F, -0.0294F, 0.0501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(85, 117).addBox(3.2F, -0.0294F, 0.0501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.6F, -0.9988F, -2.1624F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(44, 117).mirror().addBox(-1.0F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(44, 117).addBox(3.2F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6F, 0.0012F, -2.3624F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(122, 91).mirror().addBox(-1.5F, -1.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(122, 91).addBox(2.7F, -1.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, -0.3101F, -3.2604F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(37, 117).mirror().addBox(0.0F, -0.2835F, -0.087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 117).addBox(2.2F, -0.2835F, -0.087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.572F, -7.3798F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(117, 74).mirror().addBox(-1.5F, 0.0055F, -1.9249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(117, 74).addBox(1.1F, 0.0055F, -1.9249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 0.0349F, -3.7022F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(116, 48).mirror().addBox(-1.5F, -1.515F, -1.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(116, 48).addBox(2.7F, -1.515F, -1.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.1F, 1.5868F, -2.8093F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(50, 113).mirror().addBox(-1.5F, -0.9999F, -0.0843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 113).addBox(2.7F, -0.9999F, -0.0843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.3868F, -0.7093F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(66, 120).mirror().addBox(-1.2F, -0.022F, 0.673F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 120).addBox(1.8F, -0.022F, 0.673F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.4132F, -6.0093F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(120, 62).mirror().addBox(0.4F, 0.0287F, -1.8798F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 62).addBox(2.8F, 0.0287F, -1.8798F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -0.3823F, -5.4659F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(122, 80).mirror().addBox(0.0F, -0.0657F, -0.9664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(122, 80).addBox(2.2F, -0.0657F, -0.9664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6F, 0.5187F, -7.4367F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(102, 113).mirror().addBox(0.0F, -1.1452F, -1.9195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(102, 113).addBox(2.2F, -1.1452F, -1.9195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(122, 69).mirror().addBox(0.0F, -2.1875F, -2.6874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(122, 69).addBox(2.2F, -2.1875F, -2.6874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6F, 1.7868F, -5.7093F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(43, 113).mirror().addBox(-0.4F, -0.9712F, 0.0048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(43, 113).addBox(1.2F, -0.9712F, 0.0048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9F, 2.5868F, -10.8093F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(36, 113).mirror().addBox(-0.6F, -0.0783F, 0.0187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(36, 113).addBox(1.4F, -0.0783F, 0.0187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9F, 1.7036F, -10.0171F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(66, 114).mirror().addBox(0.0F, -0.0473F, -1.9721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 114).addBox(2.2F, -0.0473F, -1.9721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 1.0531F, -7.7047F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(113, 62).mirror().addBox(-1.5F, -0.9981F, -1.9843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(113, 62).addBox(2.7F, -0.9981F, -1.9843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, 1.3868F, -0.8093F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(104, 52).mirror().addBox(-1.5F, -1.023F, -2.9745F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(104, 52).addBox(1.1F, -1.023F, -2.9745F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3F, 1.5868F, -2.8093F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(110, 15).addBox(-1.9F, -0.0784F, -0.0813F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9F, 1.7193F, -10.9169F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8886F, 7.3385F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r307 = tail.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(35, 87).addBox(0.0F, -3.7559F, 0.0318F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2901F, 13.9202F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r308 = tail.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(92, 117).addBox(0.0F, -4.0908F, 0.0315F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2901F, 11.9202F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r309 = tail.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(60, 69).addBox(0.0F, -4.4258F, 0.0329F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3901F, 9.9202F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r310 = tail.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(63, 114).addBox(0.0F, -4.5607F, 0.0344F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4901F, 7.9202F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r311 = tail.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(113, 44).addBox(0.0F, -5.1956F, 0.0341F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4901F, 5.9202F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r312 = tail.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(99, 112).addBox(0.0F, -5.1305F, 0.0338F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4901F, 3.9202F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r313 = tail.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(26, 114).addBox(0.0F, -5.0654F, 0.0352F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5901F, 1.9202F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r314 = tail.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(60, 113).addBox(0.0F, -5.7003F, 0.0349F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5901F, -0.0798F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r315 = tail.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(66, 118).mirror().addBox(-2.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 118).mirror().addBox(-2.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 107).mirror().addBox(-2.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 105).mirror().addBox(-2.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 64).mirror().addBox(-2.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 118).mirror().addBox(-2.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 118).mirror().addBox(-3.0F, -1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 117).mirror().addBox(-3.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 118).addBox(0.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 118).addBox(0.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 107).addBox(0.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 105).addBox(0.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 64).addBox(0.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 118).addBox(0.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 118).addBox(1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 117).addBox(1.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4099F, -0.0798F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r316 = tail.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(117, 34).addBox(0.0F, -0.8133F, -0.5652F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5298F, 14.6866F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r317 = tail.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(15, 116).addBox(0.0F, -0.2618F, -0.0769F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6298F, 11.5866F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r318 = tail.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(34, 117).addBox(0.0F, 0.0322F, -0.1986F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6298F, 9.1866F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r319 = tail.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(73, 114).addBox(0.0F, -0.003F, 0.055F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7298F, 6.3866F, 0.8116F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 18).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(118, 97).addBox(0.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 0).addBox(-0.1F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 2).addBox(-0.1F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 12).addBox(-0.2F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 105).addBox(0.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 60).addBox(0.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 97).mirror().addBox(-2.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 0).mirror().addBox(-1.9F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 2).mirror().addBox(-1.9F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 12).mirror().addBox(-1.8F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 105).mirror().addBox(-1.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(122, 60).mirror().addBox(-1.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2099F, 14.9202F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r320 = tail2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(118, 99).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r321 = tail2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(98, 31).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 11.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r322 = tail2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(50, 122).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 9.0F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r323 = tail2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(92, 107).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r324 = tail2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(122, 83).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r325 = tail2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(81, 118).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r326 = tail2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(102, 117).addBox(0.0F, -0.8887F, -0.385F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 12.2858F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r327 = tail2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(12, 116).addBox(0.0F, -1.5578F, -0.4952F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 10.0858F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r328 = tail2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(95, 117).addBox(0.0F, -0.6446F, -0.3556F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 7.3868F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r329 = tail2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(82, 110).addBox(0.0F, -0.5364F, -0.1492F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2199F, 4.2664F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r330 = tail2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(57, 113).addBox(0.0F, -0.4989F, -0.1464F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4199F, 1.8664F, 0.7243F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(29, 34).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, -0.0975F, 0.1737F, -0.0169F));

		PartDefinition cube_r331 = tail3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(123, 120).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r332 = tail3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(123, 48).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r333 = tail3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(123, 44).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r334 = tail3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(31, 123).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r335 = tail3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(28, 123).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r336 = tail3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 123).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r337 = tail3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(38, 103).addBox(0.0F, 5.9F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 120).addBox(0.0F, 4.2F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -2.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r338 = tail3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(53, 122).addBox(0.0F, 0.0F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2212F, 6.2385F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r339 = tail3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(115, 118).addBox(0.0F, -0.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1588F, 4.1586F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r340 = tail3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(112, 118).addBox(0.0F, -0.0477F, -0.1361F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 1.3858F, 0.7592F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0397F, 12.0011F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r341 = tail4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(124, 74).addBox(0.0F, -2.0848F, 3.6797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 88).addBox(0.0F, -1.5924F, 1.7899F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 41).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 8.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r342 = tail4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(66, 124).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r343 = tail4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(56, 124).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r344 = tail4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(43, 124).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r345 = tail4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(40, 124).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r346 = tail4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(31, 100).addBox(0.0F, 12.3373F, 23.3434F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 94).addBox(0.0F, 11.3373F, 21.3434F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 44).addBox(0.0F, 10.3373F, 19.3434F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 124).addBox(0.0F, 8.3373F, 17.3434F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 124).addBox(0.0F, 7.3373F, 15.3434F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 124).addBox(0.0F, 6.5373F, 13.3434F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -14.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(23, 49).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0052F, 14.0608F, 0.0F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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