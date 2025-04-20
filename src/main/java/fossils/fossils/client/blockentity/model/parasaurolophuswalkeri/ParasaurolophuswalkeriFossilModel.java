package fossils.fossils.client.blockentity.model.parasaurolophuswalkeri;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ParasaurolophuswalkeriFossilModel extends SkullModelBase {
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

	public ParasaurolophuswalkeriFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.8978F, 1.6869F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(111, 22).mirror().addBox(1.521F, -10.1914F, 9.1261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.783F, 5.3268F, 1.8789F, -1.3617F, 0.0248F, -0.028F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(136, 16).mirror().addBox(1.521F, -8.1088F, 11.503F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.783F, 5.3268F, 1.8789F, -1.1697F, 0.0248F, -0.028F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 139).mirror().addBox(2.3041F, -14.1697F, 3.1724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(96, 135).mirror().addBox(2.3041F, -14.1697F, 2.8224F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.783F, 5.3268F, 1.8789F, -1.8647F, -0.0007F, 0.0366F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(130, 89).mirror().addBox(0.9666F, -4.3821F, 11.1228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(130, 93).mirror().addBox(0.9666F, -3.6821F, 11.1228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.783F, 5.3268F, 1.8789F, -0.8616F, 0.0768F, -0.0282F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(127, 12).mirror().addBox(-0.5F, -2.05F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5452F, 6.5989F, -9.1078F, -1.1248F, 0.1301F, 0.0149F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(85, 46).mirror().addBox(-1.5163F, -2.5255F, 5.5115F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.783F, 5.3268F, 1.8789F, -0.7759F, 0.2692F, -0.1142F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(139, 38).mirror().addBox(-0.5F, -1.175F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(139, 35).mirror().addBox(-0.5F, -0.975F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7158F, 0.352F, 9.3319F, 0.6654F, -0.2959F, 0.0479F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(139, 32).mirror().addBox(-0.5F, -0.975F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.6592F, 1.3936F, 8.9828F, 1.2326F, -0.2959F, 0.0479F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(120, 20).mirror().addBox(-3.916F, -0.1946F, 2.4166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.407F, -5.3935F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(115, 66).mirror().addBox(-0.4627F, 0.1206F, -2.9995F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2285F, 2.1266F, -5.7982F, 0.4867F, 0.1273F, -0.0307F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(106, 27).mirror().addBox(-0.7645F, -2.9778F, 1.4438F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.783F, 5.3268F, 1.8789F, -0.7284F, 0.2438F, 0.1037F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(86, 69).mirror().addBox(-0.3162F, -1.7134F, 1.4673F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.783F, 5.3268F, 1.8789F, -0.4507F, 0.1395F, 0.0876F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(86, 54).mirror().addBox(-1.5163F, -3.6474F, 5.4422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.783F, 5.3268F, 1.8789F, -0.8108F, 0.2692F, -0.1142F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(132, 36).mirror().addBox(-0.4694F, -0.0285F, -1.4043F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.3213F, 1.0938F, 7.8181F, -0.0589F, -0.2959F, 0.0479F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-0.5F, -0.2F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8818F, -1.7813F, -2.3612F, 0.2696F, 0.1301F, -0.0149F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(132, 74).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5569F, 0.4706F, -7.7457F, 0.5837F, 0.1301F, -0.0149F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-0.6671F, 0.0408F, -3.0092F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.988F, -2.2374F, -4.4098F, 0.3917F, 0.1301F, -0.0149F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 117).mirror().addBox(-0.5F, -1.0F, -1.825F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5648F, -0.6262F, 0.0767F, -0.7596F, 0.1308F, -0.0057F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(132, 78).mirror().addBox(-0.5F, -1.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3662F, 0.2993F, -6.2677F, 0.3525F, 0.1301F, -0.0149F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(117, 22).mirror().addBox(-0.2993F, -0.0863F, -2.9859F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5969F, -2.7647F, 1.4645F, -0.0789F, 0.1308F, -0.0057F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(117, 28).mirror().addBox(-0.2999F, -0.0183F, -2.9476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9975F, -3.057F, -1.5579F, 0.3045F, 0.1301F, -0.0149F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(129, 138).mirror().addBox(-0.4694F, 0.0872F, -0.2931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.3213F, 1.0938F, 7.8181F, 0.7614F, -0.2959F, 0.0479F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(109, 83).mirror().addBox(0.7419F, 0.0664F, 1.091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4829F, -2.9205F, 1.5377F, -0.4907F, -0.2009F, 0.1062F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(115, 72).mirror().addBox(0.0815F, 0.2017F, -0.4324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4829F, -2.9205F, 1.5377F, -0.4292F, -0.0774F, 0.0404F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(107, 98).mirror().addBox(1.0346F, 0.0664F, 0.8029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4829F, -2.9205F, 1.5377F, -0.5288F, -0.4145F, 0.2311F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(0.4829F, -0.0053F, -0.022F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 0).addBox(5.4829F, -0.0053F, -0.022F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4829F, -2.9205F, 1.5377F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(125, 79).mirror().addBox(-0.4694F, -1.553F, -1.163F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3213F, 1.0938F, 7.8181F, 0.0458F, -0.2959F, 0.0479F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(128, 59).mirror().addBox(-0.4241F, -1.5377F, -2.4556F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3213F, 1.0938F, 7.8181F, -0.1007F, -0.2044F, 0.046F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.5898F, -0.6818F, -0.5815F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4777F, 5.5057F, -2.1755F, -0.4696F, 0.1912F, 0.0169F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(13, 94).mirror().addBox(0.0836F, -0.5568F, -0.0631F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4777F, 7.3057F, 1.5246F, -0.1991F, 0.1912F, 0.0169F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(75, 128).mirror().addBox(-0.3382F, -3.4073F, -1.4283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.783F, 5.3268F, 1.8789F, -1.1567F, 0.1321F, 0.0532F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(115, 104).mirror().addBox(-0.5F, -0.75F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.321F, 5.4175F, -7.5286F, -1.788F, 0.1301F, 0.0149F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-0.5F, -1.25F, -3.275F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9509F, 6.1971F, -5.3813F, 0.5944F, 0.1301F, 0.0149F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(72, 114).mirror().addBox(-0.4627F, -2.751F, -1.397F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1017F, 5.2616F, -5.5599F, -0.4121F, 0.1273F, -0.0307F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(82, 100).mirror().addBox(-0.4635F, -2.4529F, 0.1041F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1017F, 5.2616F, -5.5599F, 0.0934F, 0.1241F, -0.0417F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(100, 46).mirror().addBox(-0.2171F, 2.6005F, 0.7544F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 46).addBox(5.7829F, 2.6005F, 0.7544F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7829F, -2.1205F, 6.6377F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(27, 70).mirror().addBox(-4.0F, 2.6F, 1.8F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 70).addBox(1.0F, 2.6F, 1.8F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0114F, -2.0615F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(50, 59).mirror().addBox(-0.2171F, -0.2919F, -3.8938F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(50, 59).addBox(4.7829F, -0.2919F, -3.8938F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.7829F, -0.1205F, 2.6377F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(68, 128).mirror().addBox(-0.4241F, -1.2054F, -2.4512F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3213F, 1.0938F, 7.8181F, 0.0913F, -0.2044F, 0.046F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 117).addBox(-0.5F, -1.0F, -1.825F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.5648F, -0.6262F, 0.0767F, -0.7596F, -0.1308F, 0.0057F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(132, 74).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5569F, 0.4706F, -7.7457F, 0.5837F, -0.1301F, 0.0149F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(132, 78).addBox(-0.5F, -1.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3662F, 0.2993F, -6.2677F, 0.3525F, -0.1301F, 0.0149F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(117, 22).addBox(-0.7007F, -0.0863F, -2.9859F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5969F, -2.7647F, 1.4645F, -0.0789F, -0.1308F, 0.0057F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(119, 0).addBox(-0.3329F, 0.0408F, -3.0092F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.988F, -2.2374F, -4.4098F, 0.3917F, -0.1301F, 0.0149F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(30, 85).addBox(-0.5F, -0.2F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8818F, -1.7813F, -2.3612F, 0.2696F, -0.1301F, 0.0149F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(117, 28).addBox(-0.7001F, -0.0183F, -2.9476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9975F, -3.057F, -1.5579F, 0.3045F, -0.1301F, 0.0149F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(139, 38).addBox(-0.5F, -1.175F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(139, 35).addBox(-0.5F, -0.975F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7158F, 0.352F, 9.3319F, 0.6654F, 0.2959F, -0.0479F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(139, 32).addBox(-0.5F, -0.975F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.6592F, 1.3936F, 8.9828F, 1.2326F, 0.2959F, -0.0479F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(129, 138).addBox(-0.5306F, 0.0872F, -0.2931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.3213F, 1.0938F, 7.8181F, 0.7614F, 0.2959F, -0.0479F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(109, 83).addBox(-1.7419F, 0.0664F, 1.091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4829F, -2.9205F, 1.5377F, -0.4907F, 0.2009F, -0.1062F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(115, 72).addBox(-1.0815F, 0.2017F, -0.4324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4829F, -2.9205F, 1.5377F, -0.4292F, 0.0774F, -0.0404F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(107, 98).addBox(-2.0346F, 0.0664F, 0.8029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.4829F, -2.9205F, 1.5377F, -0.5288F, 0.4145F, -0.2311F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(132, 36).addBox(-0.5306F, -0.0285F, -1.4043F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.3213F, 1.0938F, 7.8181F, -0.0589F, 0.2959F, -0.0479F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(125, 79).addBox(-0.5306F, -1.553F, -1.163F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3213F, 1.0938F, 7.8181F, 0.0458F, 0.2959F, -0.0479F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(128, 59).addBox(-0.5759F, -1.5377F, -2.4556F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3213F, 1.0938F, 7.8181F, -0.1007F, 0.2044F, -0.046F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(111, 22).addBox(-2.521F, -10.1914F, 9.1261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.783F, 5.3268F, 1.8789F, -1.3617F, -0.0248F, 0.028F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(136, 16).addBox(-2.521F, -8.1088F, 11.503F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.783F, 5.3268F, 1.8789F, -1.1697F, -0.0248F, 0.028F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(96, 135).addBox(-3.3041F, -14.1697F, 2.8224F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(5, 139).addBox(-3.3041F, -14.1697F, 3.1724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.783F, 5.3268F, 1.8789F, -1.8647F, 0.0007F, -0.0366F));

		PartDefinition cube_r59 = hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(130, 93).addBox(-1.9666F, -3.6821F, 11.1228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(130, 89).addBox(-1.9666F, -4.3821F, 11.1228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.783F, 5.3268F, 1.8789F, -0.8616F, -0.0768F, 0.0282F));

		PartDefinition cube_r60 = hips.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(85, 46).addBox(0.5163F, -2.5255F, 5.5115F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.783F, 5.3268F, 1.8789F, -0.7759F, -0.2692F, 0.1142F));

		PartDefinition cube_r61 = hips.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(86, 54).addBox(0.5163F, -3.6474F, 5.4422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.783F, 5.3268F, 1.8789F, -0.8108F, -0.2692F, 0.1142F));

		PartDefinition cube_r62 = hips.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(86, 69).addBox(-0.6838F, -1.7134F, 1.4673F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.783F, 5.3268F, 1.8789F, -0.4507F, -0.1395F, -0.0876F));

		PartDefinition cube_r63 = hips.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 98).addBox(-0.4102F, -0.6818F, -0.5815F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4777F, 5.5057F, -2.1755F, -0.4696F, -0.1912F, -0.0169F));

		PartDefinition cube_r64 = hips.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(13, 94).addBox(-1.0836F, -0.5568F, -0.0631F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4777F, 7.3057F, 1.5246F, -0.1991F, -0.1912F, -0.0169F));

		PartDefinition cube_r65 = hips.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(75, 128).addBox(-0.6618F, -3.4073F, -1.4283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.783F, 5.3268F, 1.8789F, -1.1567F, -0.1321F, -0.0532F));

		PartDefinition cube_r66 = hips.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(106, 27).addBox(-0.2355F, -2.9778F, 1.4438F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.783F, 5.3268F, 1.8789F, -0.7284F, -0.2438F, -0.1037F));

		PartDefinition cube_r67 = hips.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(127, 12).addBox(-0.5F, -2.05F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5452F, 6.5989F, -9.1078F, -1.1248F, -0.1301F, -0.0149F));

		PartDefinition cube_r68 = hips.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(115, 104).addBox(-0.5F, -0.75F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.321F, 5.4175F, -7.5286F, -1.788F, -0.1301F, -0.0149F));

		PartDefinition cube_r69 = hips.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(15, 85).addBox(-0.5F, -1.25F, -3.275F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9509F, 6.1971F, -5.3813F, 0.5944F, -0.1301F, -0.0149F));

		PartDefinition cube_r70 = hips.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(115, 66).addBox(-0.5373F, 0.1206F, -2.9995F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2285F, 2.1266F, -5.7982F, 0.4867F, -0.1273F, 0.0307F));

		PartDefinition cube_r71 = hips.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(72, 114).addBox(-0.5373F, -2.751F, -1.397F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1017F, 5.2616F, -5.5599F, -0.4121F, -0.1273F, 0.0307F));

		PartDefinition cube_r72 = hips.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(82, 100).addBox(-0.5365F, -2.4529F, 0.1041F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1017F, 5.2616F, -5.5599F, 0.0934F, -0.1241F, 0.0417F));

		PartDefinition cube_r73 = hips.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(68, 128).addBox(-0.5759F, -1.2054F, -2.4512F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3213F, 1.0938F, 7.8181F, 0.0913F, 0.2044F, -0.046F));

		PartDefinition cube_r74 = hips.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.1F, 1.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r75 = hips.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(56, 121).addBox(-0.002F, -6.6674F, -0.0453F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3059F, 6.9411F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r76 = hips.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(71, 88).addBox(-0.002F, 5.1326F, -1.4453F, 0.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.2316F, 5.0419F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r77 = hips.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(117, 110).addBox(-0.006F, 4.9296F, -0.1333F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.1316F, -2.8581F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r78 = hips.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(120, 20).addBox(-0.084F, -0.1946F, 2.4166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.407F, -5.3935F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r79 = hips.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(48, 74).addBox(0.0F, -0.0183F, 0.0774F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0802F, -2.7602F, 0.0087F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 3.5384F, 1.2631F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(111, 15).addBox(-0.5F, -1.6697F, -2.124F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.0256F, -0.0158F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(21, 123).addBox(-0.5F, -1.0654F, -0.521F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0256F, -0.0158F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 90).addBox(-1.5F, -2.7619F, -2.8279F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 0.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(78, 87).addBox(-1.0F, -0.1F, -1.9F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3597F, 0.3388F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(39, 110).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1036F, -2.0393F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(119, 46).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.0961F, -1.7951F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(21, 110).addBox(-1.0F, -2.2F, -1.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, -0.8925F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(43, 96).addBox(-1.5F, -3.0145F, -0.0616F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.1295F, 1.3036F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(95, 0).addBox(-1.5F, 8.5855F, -0.0616F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2898F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.9637F, 0.525F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(80, 10).addBox(-0.5F, -5.7F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 6.9354F, 0.4995F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(12, 125).addBox(0.55F, -5.5931F, -1.9712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.15F, 18.5674F, -1.1373F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 110).addBox(-0.5F, -0.0911F, -0.9311F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 4.3354F, 0.9995F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 69).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 16.2878F, -0.7211F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(45, 88).addBox(-1.0F, -1.4F, -2.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 2.6324F, 0.924F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(31, 101).addBox(-1.9F, -0.3535F, -0.1188F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0544F, -1.5228F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(123, 37).addBox(-1.0F, -0.471F, -2.0357F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 2.3316F, 3.4313F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(123, 33).addBox(-1.0F, -1.571F, -2.4357F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9F, 3.5021F, 3.431F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(72, 106).addBox(-1.0F, 0.0379F, -1.9739F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 9.1346F, 1.4747F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(13, 101).addBox(-1.0F, -5.0F, -1.7F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 7.6346F, 1.0747F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(96, 98).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 17.7562F, -1.5534F, -0.5236F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(0, 73).addBox(-3.0F, -1.4696F, -2.8933F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 1.1432F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(62, 43).addBox(-3.0F, -1.4F, -3.9F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2759F, -3.5378F, -1.0472F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 3.5384F, 1.2631F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(111, 33).addBox(-0.5F, -1.6697F, -2.124F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.0256F, -0.0158F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(28, 123).addBox(-0.5F, -1.0654F, -0.521F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0256F, -0.0158F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(93, 30).addBox(-1.5F, -2.7619F, -2.8279F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, 0.2898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(87, 87).addBox(-1.0F, -0.1F, -1.9F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3597F, 0.3388F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(48, 110).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1036F, -2.0393F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(119, 51).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.0961F, -1.7951F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(30, 110).addBox(-1.0F, -2.2F, -1.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, -0.8925F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(96, 91).addBox(-1.5F, -3.0145F, -0.0616F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.1295F, 1.3036F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(96, 84).addBox(-1.5F, 8.5855F, -0.0616F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 3.4318F, -1.2898F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.9637F, 0.525F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(85, 30).addBox(-0.5F, -5.7F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 6.9354F, 0.4995F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(125, 74).addBox(-1.55F, -5.5931F, -1.9712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.15F, 18.5674F, -1.1373F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(110, 66).addBox(-0.5F, -0.0911F, -0.9311F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 4.3354F, 0.9995F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(100, 38).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 16.2878F, -0.7211F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(58, 88).addBox(-1.0F, -1.4F, -2.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 2.6324F, 0.924F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(101, 50).addBox(-0.1F, -0.3535F, -0.1188F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0544F, -1.5228F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(123, 116).addBox(-1.0F, -0.471F, -2.0357F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 2.3316F, 3.4313F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(123, 41).addBox(-1.0F, -1.571F, -2.4357F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9F, 3.5021F, 3.431F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(81, 108).addBox(-1.0F, 0.0379F, -1.9739F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 9.1346F, 1.4747F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(22, 101).addBox(-1.0F, -5.0F, -1.7F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 7.6346F, 1.0747F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(100, 18).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 17.7562F, -1.5534F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(21, 78).addBox(-3.0F, -1.4696F, -2.8933F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 1.0025F, -0.0649F, -0.012F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(62, 51).addBox(-3.0F, -1.4F, -3.9F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2759F, -3.5378F, -0.6545F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.6555F, -11.0243F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7114F, -4.2632F, -0.0975F, -0.1737F, 0.0169F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(120, 77).addBox(0.0F, -5.0525F, -0.0021F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2341F, -14.0312F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(103, 120).addBox(0.0F, -4.227F, -0.9976F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2373F, -16.0196F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(61, 79).addBox(-1.0F, -0.1809F, -5.9788F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4554F, -11.0243F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(98, 120).addBox(0.0F, -4.9377F, -1.9741F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -0.0243F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(39, 117).addBox(0.0F, -5.23F, 0.0104F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -5.0243F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(65, 118).addBox(0.0F, -5.3576F, -0.0985F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -7.9243F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(132, 82).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -7.2303F, 0.0377F, -0.067F, -0.5601F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(133, 70).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -7.2303F, 0.0763F, -0.1075F, -0.9962F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(86, 18).mirror().addBox(-6.8937F, -2.4262F, -0.2666F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -7.2303F, 0.1145F, -0.0652F, -1.4322F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 40).mirror().addBox(-9.8936F, -2.4262F, -0.2666F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -10.2303F, 0.1387F, 0.1076F, -1.4317F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(133, 68).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -10.2303F, 0.1709F, 0.0393F, -0.9995F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(112, 13).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -10.2303F, 0.1854F, 0.0261F, -0.5631F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(136, 84).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, -13.3303F, 0.3396F, 0.1076F, -0.5524F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(136, 111).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, -13.3303F, 0.2766F, 0.1781F, -0.9875F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(51, 24).mirror().addBox(-16.8937F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, -13.3303F, 0.1764F, 0.2777F, -1.424F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-18.8937F, -2.4262F, -0.2666F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7044F, -16.0303F, 0.1883F, 0.2929F, -1.3857F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(136, 109).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7044F, -16.0303F, 0.2937F, 0.187F, -0.9495F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(24, 136).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7044F, -16.0303F, 0.3587F, 0.1086F, -0.5153F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(86, 20).mirror().addBox(-3.916F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3044F, -1.1303F, -0.1715F, 0.049F, -0.1533F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(68, 133).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -4.2303F, -0.0367F, -0.1132F, -0.5534F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(128, 64).mirror().addBox(-3.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -4.2303F, 0.1024F, -0.1516F, -1.4309F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(133, 72).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, -4.2303F, 0.0282F, -0.1806F, -0.9893F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(86, 20).addBox(-0.084F, -0.1946F, -0.3834F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3044F, -1.1303F, -0.1715F, -0.049F, 0.1533F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(133, 72).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -4.2303F, 0.0282F, 0.1806F, 0.9893F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(128, 64).addBox(2.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -4.2303F, 0.1024F, 0.1516F, 1.4309F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(68, 133).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -4.2303F, -0.0367F, 0.1132F, 0.5534F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(86, 18).addBox(2.8937F, -2.4262F, -0.2666F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -7.2303F, 0.1145F, 0.0652F, 1.4322F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(133, 70).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -7.2303F, 0.0763F, 0.1075F, 0.9962F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(132, 82).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -7.2303F, 0.0377F, 0.067F, 0.5601F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(64, 40).addBox(2.8937F, -2.4262F, -0.2666F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -10.2303F, 0.1387F, -0.1076F, 1.4317F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(133, 68).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -10.2303F, 0.1709F, -0.0393F, 0.9995F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(112, 13).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, -10.2303F, 0.1854F, -0.0261F, 0.5631F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(136, 84).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, -13.3303F, 0.3396F, -0.1076F, 0.5524F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(136, 111).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, -13.3303F, 0.2766F, -0.1781F, 0.9875F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(51, 24).addBox(2.8937F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, -13.3303F, 0.1764F, -0.2777F, 1.424F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 20).addBox(2.8937F, -2.4262F, -0.2666F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7044F, -16.0303F, 0.1593F, -0.3865F, 1.3973F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(136, 109).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7044F, -16.0303F, 0.3096F, -0.2833F, 0.9477F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(24, 136).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7044F, -16.0303F, 0.414F, -0.1893F, 0.509F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(44, 117).addBox(0.0F, -5.3F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6555F, -11.0243F, -0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4204F, -16.8713F, 0.0464F, -0.3487F, -0.0159F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(121, 5).addBox(0.0F, -3.9022F, -0.104F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9341F, -2.7582F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(43, 126).addBox(0.0F, -3.3781F, -0.1018F, 0.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.3421F, -5.3402F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(67, 69).addBox(-1.0F, -0.0448F, -0.0381F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.9341F, -6.2582F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(38, 126).addBox(0.0F, -3.7784F, 0.0244F, 0.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.7341F, -7.5582F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(35, 139).addBox(0.0F, -2.6339F, -0.2574F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 7.1064F, -10.2916F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(62, 135).addBox(0.0F, -3.2339F, 0.0426F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8341F, -9.0582F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(67, 59).addBox(-1.0F, -0.0865F, -2.1546F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.5341F, -9.5582F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(30, 139).mirror().addBox(-0.5F, -0.9648F, -0.9494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(30, 139).addBox(9.5F, -0.9648F, -0.9494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, 3.9488F, 0.012F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(134, 99).mirror().addBox(-0.5F, -1.9648F, -0.9494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(134, 99).addBox(9.5F, -1.9648F, -0.9494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.0F, 5.4467F, 1.3372F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(139, 13).mirror().addBox(-0.5F, -0.9648F, -0.9494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(139, 13).addBox(9.5F, -0.9648F, -0.9494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, 6.3922F, 1.6628F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(139, 10).mirror().addBox(-0.5F, -0.9648F, -0.9494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(139, 10).addBox(9.5F, -0.9648F, -0.9494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-5.0F, 7.3646F, 1.4294F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(112, 6).mirror().addBox(-0.5F, -2.8648F, -0.0494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(112, 6).addBox(9.5F, -2.8648F, -0.0494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, 9.2501F, -0.7763F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-0.5F, -2.8648F, -0.0494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 112).addBox(9.5F, -2.8648F, -0.0494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, 10.3981F, -3.548F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(27, 59).mirror().addBox(-0.6504F, 0.8292F, 2.3866F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -4.6408F, 0.1053F, -0.4606F, 0.0287F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(124, 104).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -4.6408F, -0.2088F, -0.4606F, 0.0287F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(64, 26).mirror().addBox(-0.6504F, 0.8292F, 2.3866F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -4.6408F, 0.1752F, -0.5052F, 0.0256F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(124, 70).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -4.6408F, -0.1389F, -0.5052F, 0.0256F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(108, 113).mirror().addBox(-1.8837F, -1.5122F, -4.7426F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 15.0021F, -9.5876F, 1.5077F, -0.144F, -1.1561F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(120, 13).mirror().addBox(0.2157F, -1.7122F, -1.5822F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 16.2021F, -9.5876F, 1.4331F, -0.0759F, -0.5009F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(109, 89).mirror().addBox(-0.5F, -0.1698F, -0.2213F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(109, 89).addBox(9.5F, -0.1698F, -0.2213F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-5.0F, 15.6925F, -11.1245F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, 0.0469F, -0.049F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(0, 80).addBox(9.5F, 0.0469F, -0.049F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.0F, 7.6875F, -5.5438F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(110, 50).mirror().addBox(-0.5F, -0.1048F, 0.3902F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(110, 50).addBox(9.5F, -0.1048F, 0.3902F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.0F, 13.3925F, -10.2246F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.5F, -2.81F, 0.2496F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 105).addBox(9.5F, -2.81F, 0.2496F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.0F, 12.6925F, -6.8246F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(31, 137).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.6911F, -9.3139F, 0.6689F, 0.4933F, -0.7639F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(136, 136).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.6911F, -9.3139F, 0.8117F, 0.2465F, -0.3762F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(64, 38).mirror().addBox(-10.729F, -1.955F, -0.2993F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.6911F, -9.3139F, 0.4034F, 0.7208F, -1.221F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(101, 7).mirror().addBox(-0.5F, -2.8648F, 0.0506F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(101, 7).addBox(9.5F, -2.8648F, 0.0506F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, 12.6925F, -6.8246F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(124, 66).mirror().addBox(-0.1319F, 0.0563F, 0.0018F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 19.1066F, -5.3408F, 0.1375F, -1.1436F, 0.454F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(120, 85).mirror().addBox(-0.1319F, 0.9644F, 2.8401F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 19.1066F, -5.3408F, 0.4516F, -1.1436F, 0.454F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.1106F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.8066F, -5.3408F, 0.0884F, -0.7018F, -0.0828F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-0.1106F, 0.5192F, 3.0667F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.8066F, -5.3408F, 0.4026F, -0.7018F, -0.0828F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(123, 120).mirror().addBox(-0.6504F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -4.6408F, -0.1055F, -0.6082F, -0.0067F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(78, 79).mirror().addBox(-0.6504F, 0.8292F, 2.3866F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 19.2066F, -4.6408F, 0.2086F, -0.6082F, -0.0067F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(119, 56).mirror().addBox(-0.75F, -0.6364F, 3.8651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 56).addBox(1.65F, -0.6364F, 3.8651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 18.4939F, -10.8587F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(136, 107).mirror().addBox(-1.4539F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.1911F, -8.2139F, 0.7422F, 0.2455F, -0.3582F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.1911F, -8.2139F, 0.5992F, 0.4664F, -0.7612F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(64, 36).mirror().addBox(-15.7415F, -1.9518F, -0.3082F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.1911F, -8.2139F, 0.3467F, 0.6693F, -1.2223F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(12, 134).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.3911F, -6.4139F, 0.6523F, 0.2309F, -0.3952F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(135, 2).mirror().addBox(-3.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.3911F, -6.4139F, 0.517F, 0.4181F, -0.8122F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(51, 22).mirror().addBox(-17.7647F, -1.946F, -0.3188F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.3911F, -6.4139F, 0.2908F, 0.593F, -1.2711F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(133, 105).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.8911F, -4.2139F, 0.5701F, 0.1968F, -0.4298F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(136, 86).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.8911F, -4.2139F, 0.4529F, 0.3543F, -0.8534F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(51, 18).mirror().addBox(-18.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.8911F, -4.2139F, 0.2611F, 0.5096F, -1.3039F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3911F, -1.6139F, 0.2548F, 0.3244F, -0.8841F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(51, 16).mirror().addBox(-19.8937F, -2.4262F, -0.2666F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3911F, -1.6139F, 0.089F, 0.4004F, -1.3442F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(133, 103).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3911F, -1.6139F, 0.3837F, 0.2488F, -0.4356F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(69, 100).mirror().addBox(-1.25F, -1.0388F, -0.1405F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 100).addBox(1.15F, -1.0388F, -0.1405F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 18.4939F, -10.8587F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(108, 113).addBox(0.8837F, -1.5122F, -4.7426F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5F, 15.0021F, -9.5876F, 1.5077F, 0.144F, 1.1561F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(120, 13).addBox(-1.2157F, -1.7122F, -1.5822F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 16.2021F, -9.5876F, 1.4331F, 0.0759F, 0.5009F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(31, 137).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.6911F, -9.3139F, 0.6689F, -0.4933F, 0.7639F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(136, 136).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.6911F, -9.3139F, 0.8117F, -0.2465F, 0.3762F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(64, 38).addBox(2.729F, -1.955F, -0.2993F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.6911F, -9.3139F, 0.4034F, -0.7208F, 1.221F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(124, 66).addBox(-0.8681F, 0.0563F, 0.0018F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 19.1066F, -5.3408F, 0.1375F, 1.1436F, -0.454F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(120, 85).addBox(-0.8681F, 0.9644F, 2.8401F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 19.1066F, -5.3408F, 0.4516F, 1.1436F, -0.454F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 124).addBox(-0.8894F, -0.4371F, 0.0797F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.8066F, -5.3408F, 0.0884F, 0.7018F, 0.0828F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(86, 62).addBox(-0.8894F, 0.5192F, 3.0667F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.8066F, -5.3408F, 0.4026F, 0.7018F, 0.0828F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(124, 104).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -4.6408F, -0.2088F, 0.4606F, -0.0287F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(27, 59).addBox(-0.3496F, 0.8292F, 2.3866F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -4.6408F, 0.1053F, 0.4606F, -0.0287F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(124, 70).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -4.6408F, -0.1389F, 0.5052F, -0.0256F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(64, 26).addBox(-0.3496F, 0.8292F, 2.3866F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -4.6408F, 0.1752F, 0.5052F, -0.0256F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(123, 120).addBox(-0.3496F, 0.0679F, -0.4714F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -4.6408F, -0.1055F, 0.6082F, 0.0067F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(78, 79).addBox(-0.3496F, 0.8292F, 2.3866F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 19.2066F, -4.6408F, 0.2086F, 0.6082F, 0.0067F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(136, 107).addBox(-0.5461F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.1911F, -8.2139F, 0.7422F, -0.2455F, 0.3582F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 137).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.1911F, -8.2139F, 0.5992F, -0.4664F, 0.7612F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(64, 36).addBox(2.7415F, -1.9518F, -0.3082F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.1911F, -8.2139F, 0.3467F, -0.6693F, 1.2223F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(12, 134).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.3911F, -6.4139F, 0.6523F, -0.2309F, 0.3952F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(135, 2).addBox(1.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.3911F, -6.4139F, 0.517F, -0.4181F, 0.8122F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(51, 22).addBox(2.7647F, -1.946F, -0.3188F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.3911F, -6.4139F, 0.2908F, -0.593F, 1.2711F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(133, 105).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.8911F, -4.2139F, 0.5701F, -0.1968F, 0.4298F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(136, 86).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.8911F, -4.2139F, 0.4529F, -0.3543F, 0.8534F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(51, 18).addBox(2.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.8911F, -4.2139F, 0.2611F, -0.5096F, 1.3039F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(135, 0).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3911F, -1.6139F, 0.4605F, -0.2227F, 0.8729F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(51, 16).addBox(2.8937F, -2.4262F, -0.2666F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3911F, -1.6139F, 0.3302F, -0.3934F, 1.2952F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(133, 103).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3911F, -1.6139F, 0.5228F, -0.0737F, 0.4577F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5149F, 17.3652F, -8.4484F, -0.1622F, 0.0078F, -0.08F));

		PartDefinition cube_r231 = leftArm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(127, 98).addBox(-0.5F, -0.0571F, -0.763F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 4.9997F, 0.3661F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftArm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(70, 122).addBox(-0.5F, -2.4618F, -0.8581F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 4.9997F, 0.3661F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftArm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(129, 84).addBox(-0.3441F, -1.6321F, -0.8097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r234 = leftArm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(90, 113).addBox(-0.6433F, -0.4928F, -1.5597F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.4317F, -0.3971F, -0.2345F, -0.4743F, -0.0768F));

		PartDefinition cube_r235 = leftArm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(49, 124).addBox(-0.6F, -3.4F, 0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4632F, 4.3572F, -0.121F, 1.1181F, -0.4743F, -0.0768F));

		PartDefinition cube_r236 = leftArm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(126, 5).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(11, 110).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(62, 103).addBox(-0.5909F, 0.8921F, -1.4717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.322F, 6.7803F, 1.5172F, -1.3028F, 1.2067F, -1.0051F));

		PartDefinition cube_r237 = leftArm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(96, 128).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(88, 120).addBox(-0.6767F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0811F, 11.2777F, -0.5061F, 0.2874F, 0.2891F, 0.5096F));

		PartDefinition cube_r238 = leftArm3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(65, 137).addBox(11.0848F, 0.8221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-11.4616F, 8.1729F, 10.4465F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r239 = leftArm3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(103, 128).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, -0.951F, -0.5433F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(61, 74).addBox(-0.5945F, 1.0179F, -0.9517F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5149F, 17.3652F, -8.4484F, 0.7978F, -0.0078F, 0.08F));

		PartDefinition cube_r240 = rightArm.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(128, 54).addBox(-0.5F, -0.0571F, -0.763F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 4.9997F, 0.3661F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightArm.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(77, 122).addBox(-0.5F, -2.4618F, -0.8581F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 4.9997F, 0.3661F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightArm.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(129, 108).addBox(-0.6559F, -1.6321F, -0.8097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r243 = rightArm.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(99, 113).addBox(-0.3567F, -0.4928F, -1.5597F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.4317F, -0.3971F, -0.2345F, 0.4743F, 0.0768F));

		PartDefinition cube_r244 = rightArm.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(123, 124).addBox(-0.4F, -3.4F, 0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 4.3572F, -0.121F, 1.1181F, 0.4743F, 0.0768F));

		PartDefinition cube_r245 = rightArm.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(126, 22).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(16, 110).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(67, 106).addBox(-0.4091F, 0.8921F, -1.4717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.322F, 6.7803F, 1.5172F, -1.6028F, -0.3009F, 1.2269F));

		PartDefinition cube_r246 = rightArm2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(19, 129).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(93, 120).addBox(-0.3233F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0811F, 11.2777F, -0.5061F, 0.468F, -0.0324F, -1.073F));

		PartDefinition cube_r247 = rightArm3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(70, 137).addBox(-12.0848F, 0.8221F, -10.9975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(11.4616F, 8.1729F, 10.4465F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r248 = rightArm3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(48, 130).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, -0.951F, -0.5433F, -0.1222F, 0.0F, 0.0F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(15, 80).addBox(-0.4055F, 1.0179F, -0.9517F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.242F, -10.07F, -0.318F, -0.3809F, -0.1262F));

		PartDefinition cube_r249 = neck4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(49, 140).addBox(0.0F, -1.4F, -0.0816F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5772F, -3.6376F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r250 = neck4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(115, 46).addBox(0.0F, -1.3811F, -0.0196F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4772F, -2.0376F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r251 = neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(85, 38).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2511F, -3.739F, 0.5605F, -0.1856F, -0.1153F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(16, 141).addBox(0.0F, -2.5487F, 5.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 141).addBox(0.0F, -2.4487F, 3.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 10).addBox(-0.5F, -1.9487F, 2.0661F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9164F, -6.5763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7016F, -3.8589F, -0.3421F, -0.3303F, 0.115F));

		PartDefinition cube_r253 = neck2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(140, 71).addBox(0.0F, -1.0018F, 7.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(71, 140).addBox(0.0F, -1.0018F, 5.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(51, 103).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.6263F, -7.1488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(112, 57).addBox(-0.5F, -6.15F, -0.9206F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(141, 16).addBox(0.0F, -2.15F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 141).addBox(0.0F, -4.15F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 140).addBox(0.0F, -6.15F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0468F, -2.8524F, 0.596F, -0.0112F, 0.1002F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.5476F, -0.0737F, -0.7733F, -0.3221F, 0.2997F));

		PartDefinition cube_r254 = neck.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(108, 120).addBox(0.0F, 0.0555F, 0.805F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9867F, -1.9451F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(79, 116).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7867F, -1.2451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1655F, -2.1122F, -0.2588F, -0.05F, -0.121F));

		PartDefinition cube_r256 = heads.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(12, 130).addBox(-0.5F, -0.0832F, -1.8854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.2633F, -8.5375F, 0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r257 = heads.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(85, 22).addBox(-1.0F, 0.2F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7332F, -5.5218F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r258 = heads.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(130, 128).addBox(-0.5F, 0.4419F, -2.042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.5518F, 0.3049F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r259 = heads.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(101, 66).addBox(-1.5F, 0.95F, -0.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(101, 15).addBox(-1.5F, -0.025F, -0.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.4459F, 0.226F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r260 = heads.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(127, 17).addBox(-1.5F, -0.025F, -2.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(126, 29).addBox(-1.5F, -0.025F, -1.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.4459F, 0.226F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r261 = heads.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(104, 107).addBox(-2.0F, 1.3565F, 1.0007F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -3.1735F, -2.1839F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r262 = heads.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(30, 93).addBox(-1.5F, 1.127F, -0.4559F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6735F, -5.0839F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r263 = heads.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(107, 104).mirror().addBox(0.0F, 0.05F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(107, 104).addBox(0.6F, 0.05F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -8.1325F, 10.9447F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r264 = heads.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(132, 121).mirror().addBox(0.5F, -0.0115F, 0.0245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(132, 121).addBox(1.1F, -0.0115F, 0.0245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -6.3141F, 10.7863F, -3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r265 = heads.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(131, 9).mirror().addBox(0.5F, -0.0115F, -0.0755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(131, 9).addBox(1.1F, -0.0115F, -0.0755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.3F, -7.0774F, 11.2633F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r266 = heads.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(131, 49).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -7.0811F, 9.1791F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r267 = heads.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(131, 24).addBox(-1.5F, -9.3492F, -11.5646F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -1.6735F, -3.5839F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r268 = heads.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(12, 121).addBox(-1.5F, -0.0377F, -0.0356F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -8.7338F, 9.0372F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r269 = heads.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(108, 131).addBox(-1.5F, -0.0499F, -0.9876F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -7.9966F, 3.0638F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r270 = heads.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(118, 99).addBox(-1.5F, -0.05F, -1.9876F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -8.5311F, 4.9911F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r271 = heads.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(118, 94).addBox(-1.5F, -0.05F, -1.9876F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -8.8094F, 6.9716F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r272 = heads.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(118, 89).addBox(-1.5F, -7.55F, 10.3124F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -1.6735F, -3.5839F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r273 = heads.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(56, 96).addBox(-1.5F, -0.0144F, -0.0137F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -5.9849F, -0.9003F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r274 = heads.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(95, 77).addBox(-1.5F, -0.3144F, 1.9863F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -1.6735F, -5.0839F, 0.7505F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -0.7735F, -2.7839F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(123, 130).addBox(-0.5F, -0.4971F, -0.6942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.172F, 0.5899F, 3.5093F, -1.7791F, 0.1079F, -0.2084F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(75, 139).addBox(-0.5F, -0.8034F, -0.8614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.172F, 0.5899F, 3.5093F, -0.8192F, 0.1079F, -0.2084F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(100, 27).addBox(-0.3F, -0.275F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 5.3874F, -6.2722F, 0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(122, 110).addBox(-1.4063F, -1.4893F, -2.0331F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.285F, 0.6283F, 2.7808F, -0.1073F, 0.1033F, -0.2153F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(132, 32).addBox(-0.5F, 0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.7466F, 1.2221F, -2.4751F, 0.8029F, 0.0524F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(21, 117).addBox(-0.9F, -3.4359F, 2.7596F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 5.2687F, -5.4153F, 0.0611F, 0.0524F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(131, 45).addBox(-0.9F, -0.9941F, 1.9132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 5.2687F, -5.4153F, 0.48F, 0.0524F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(128, 0).addBox(-1.8119F, -0.0832F, -2.0458F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.4468F, -0.681F, -0.9282F, 0.7038F, 0.1366F, -0.1591F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(49, 117).addBox(-1.8119F, -1.8832F, -1.4458F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.015F, 0.6283F, 0.8808F, 0.2675F, 0.1366F, -0.1591F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(106, 33).addBox(-2.011F, -1.0771F, -0.6924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.615F, 2.7283F, 2.6808F, 0.2613F, -0.0117F, -0.126F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(21, 73).addBox(-1.0213F, -0.9055F, -0.4753F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5885F, 1.275F, 2.2995F, -0.1331F, 0.0512F, -0.2097F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(47, 136).addBox(-0.3883F, -0.8862F, -1.5469F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5273F, 3.7495F, -2.1119F, 0.5477F, -0.0089F, 0.1344F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(38, 137).addBox(-0.3727F, -0.8321F, -0.0204F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5273F, 3.7495F, -2.2119F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(135, 28).addBox(-1.0131F, -0.1356F, -0.4559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3521F, 0.8145F, 1.4222F, -0.7231F, 0.1258F, -0.2291F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(139, 77).addBox(-1.0131F, -0.3657F, -0.0616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(75, 135).addBox(-1.0131F, -0.3907F, 0.0634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.3521F, 0.8145F, 1.4222F, -1.1071F, 0.1258F, -0.2291F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(80, 135).addBox(-1.0131F, -1.1948F, -0.1201F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3521F, 0.8145F, 1.4222F, -0.2868F, 0.1258F, -0.2291F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(108, 0).addBox(-1.0566F, 0.0178F, 0.0897F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.0013F, 4.0307F, -5.8423F, 1.0059F, 0.1005F, 0.0257F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(139, 41).addBox(-1.0131F, -1.2488F, -0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(134, 138).addBox(-1.0131F, -0.8738F, -0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.3521F, 0.8145F, 1.4222F, -0.4264F, 0.1258F, -0.2291F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(138, 47).addBox(-0.9935F, -0.1107F, -1.3098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(138, 44).addBox(-0.9935F, 0.1893F, -1.3098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(138, 23).addBox(-0.9935F, 0.1893F, -0.9098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5326F, 0.7353F, 0.3306F, -3.0324F, 0.1594F, -0.1957F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(22, 138).addBox(-0.9935F, 0.0983F, -0.7319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.5326F, 0.7353F, 0.3306F, -2.7706F, 0.1594F, -0.1957F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(138, 50).addBox(-0.9935F, 0.0121F, -0.6338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(138, 20).addBox(-0.9935F, 0.0121F, -0.2338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.5326F, 0.7353F, 0.3306F, -2.3823F, 0.1594F, -0.1957F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(17, 138).addBox(-0.9935F, 0.1299F, -0.1616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5326F, 0.7353F, 0.3306F, -1.9634F, 0.1594F, -0.1957F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(12, 138).addBox(-0.9935F, 0.2691F, -0.1604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(138, 7).addBox(-0.9935F, 0.2691F, 0.2396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(138, 53).addBox(-0.9935F, -0.0309F, -0.1604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(138, 4).addBox(-0.9935F, -0.0309F, 0.2396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.5326F, 0.7353F, 0.3306F, -1.5271F, 0.1594F, -0.1957F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(134, 12).addBox(-0.9935F, -0.9274F, -0.7878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5326F, 0.7353F, 0.3306F, -0.7853F, 0.1594F, -0.1957F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(137, 133).addBox(-0.9935F, 0.0029F, -0.0209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.5326F, 0.7353F, 0.3306F, -1.0035F, 0.1594F, -0.1957F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(138, 56).addBox(-0.9935F, -0.8069F, -0.5434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(139, 74).addBox(-1.1185F, -0.8069F, -0.5434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 131).addBox(-0.9935F, -1.1069F, -0.5184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(56, 131).addBox(-0.9935F, -1.2069F, -0.1434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5326F, 0.7353F, 0.3306F, -0.698F, 0.1594F, -0.1957F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(137, 124).addBox(-1.0131F, -0.4981F, -0.4787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.3521F, 0.8145F, 1.4222F, -0.5573F, 0.1258F, -0.2291F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(118, 137).addBox(-1.0131F, -1.0528F, 0.2804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.3521F, 0.8145F, 1.4222F, 0.3764F, 0.1258F, -0.2291F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(108, 126).addBox(-1.025F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7269F, 1.7973F, 0.0596F, 0.9069F, 0.1273F, -0.1479F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(40, 133).addBox(-0.1517F, -0.4606F, -1.5573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.724F, 5.5053F, -5.4239F, 0.0823F, 0.557F, 0.0436F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(95, 139).addBox(-0.076F, -0.3638F, -0.1075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.724F, 5.5053F, -5.4239F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(85, 137).addBox(-0.4F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.766F, 5.0708F, -5.349F, 1.0238F, 0.0218F, -0.3359F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(108, 77).addBox(-1.0058F, -0.6522F, -3.9936F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.146F, 1.7331F, -2.5103F, 0.8608F, 0.1313F, -0.0596F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(93, 107).addBox(-0.8565F, -1.0692F, 0.9027F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2474F, 2.095F, -2.6104F, 0.8341F, 0.0046F, -0.0867F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(137, 91).addBox(-0.9413F, -0.6848F, 0.215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2474F, 2.095F, -2.6104F, 1.1784F, 0.059F, -0.0519F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(19, 134).addBox(-0.7F, 0.025F, -0.9089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.1154F, -3.0642F, 0.891F, 0.0384F, 0.0475F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(101, 59).addBox(-0.7F, 0.6856F, 1.9863F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0F, -0.9F, -2.3F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(40, 103).addBox(-0.7F, -2.0144F, -4.0137F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, -4.8819F, 6.589F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 119).addBox(-0.7F, -1.0144F, -0.2137F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, -4.8819F, 6.589F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(111, 40).addBox(-1.0F, -0.0612F, -3.0074F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.5F, -2.4321F, -1.0144F, 0.8739F, 0.0449F, 0.0535F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(130, 132).addBox(-0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0763F, 5.4822F, -5.6822F, 0.1545F, 0.5864F, 0.1214F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(33, 133).addBox(-0.7762F, -0.5F, -0.8828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0763F, 5.4822F, -5.6822F, 0.1309F, 0.189F, 0.0602F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.7735F, -2.7839F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(123, 130).mirror().addBox(-0.5F, -0.4971F, -0.6942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.172F, 0.5899F, 3.5093F, -1.7791F, -0.1079F, 0.2084F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(75, 139).mirror().addBox(-0.5F, -0.8034F, -0.8614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.172F, 0.5899F, 3.5093F, -0.8192F, -0.1079F, 0.2084F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(100, 27).mirror().addBox(-0.7F, -0.275F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, 5.3874F, -6.2722F, 0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(122, 110).mirror().addBox(0.4063F, -1.4893F, -2.0331F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.285F, 0.6283F, 2.7808F, -0.1073F, -0.1033F, 0.2153F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(132, 32).mirror().addBox(-0.5F, 0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.7466F, 1.2221F, -2.4751F, 0.8029F, -0.0524F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(21, 117).mirror().addBox(-0.1F, -3.4359F, 2.7596F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5F, 5.2687F, -5.4153F, 0.0611F, -0.0524F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(131, 45).mirror().addBox(-0.1F, -0.9941F, 1.9132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5F, 5.2687F, -5.4153F, 0.48F, -0.0524F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(0.8119F, -0.0832F, -2.0458F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.4468F, -0.681F, -0.9282F, 0.7038F, -0.1366F, 0.1591F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(49, 117).mirror().addBox(0.8119F, -1.8832F, -1.4458F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.015F, 0.6283F, 0.8808F, 0.2675F, -0.1366F, 0.1591F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(106, 33).mirror().addBox(1.011F, -1.0771F, -0.6924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.615F, 2.7283F, 2.6808F, 0.2613F, 0.0117F, 0.126F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(0.0213F, -0.9055F, -0.4753F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5885F, 1.275F, 2.2995F, -0.1331F, -0.0512F, 0.2097F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(47, 136).mirror().addBox(0.3883F, -0.8862F, -1.5469F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5273F, 3.7495F, -2.1119F, 0.5477F, 0.0089F, -0.1344F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(38, 137).mirror().addBox(0.3727F, -0.8321F, -0.0204F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5273F, 3.7495F, -2.2119F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(135, 28).mirror().addBox(0.0131F, -0.1356F, -0.4559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3521F, 0.8145F, 1.4222F, -0.7231F, -0.1258F, 0.2291F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(139, 77).mirror().addBox(0.0131F, -0.3657F, -0.0616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(75, 135).mirror().addBox(0.0131F, -0.3907F, 0.0634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.3521F, 0.8145F, 1.4222F, -1.1071F, -0.1258F, 0.2291F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(80, 135).mirror().addBox(0.0131F, -1.1948F, -0.1201F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3521F, 0.8145F, 1.4222F, -0.2868F, -0.1258F, 0.2291F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(0.0566F, 0.0178F, 0.0897F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.0013F, 4.0307F, -5.8423F, 1.0059F, -0.1005F, -0.0257F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(139, 41).mirror().addBox(0.0131F, -1.2488F, -0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(134, 138).mirror().addBox(0.0131F, -0.8738F, -0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.3521F, 0.8145F, 1.4222F, -0.4264F, -0.1258F, 0.2291F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(138, 47).mirror().addBox(-0.0065F, -0.1107F, -1.3098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(138, 44).mirror().addBox(-0.0065F, 0.1893F, -1.3098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(138, 23).mirror().addBox(-0.0065F, 0.1893F, -0.9098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5326F, 0.7353F, 0.3306F, -3.0324F, -0.1594F, 0.1957F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(22, 138).mirror().addBox(-0.0065F, 0.0983F, -0.7319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.5326F, 0.7353F, 0.3306F, -2.7706F, -0.1594F, 0.1957F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(138, 50).mirror().addBox(-0.0065F, 0.0121F, -0.6338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(138, 20).mirror().addBox(-0.0065F, 0.0121F, -0.2338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.5326F, 0.7353F, 0.3306F, -2.3823F, -0.1594F, 0.1957F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(17, 138).mirror().addBox(-0.0065F, 0.1299F, -0.1616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5326F, 0.7353F, 0.3306F, -1.9634F, -0.1594F, 0.1957F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(12, 138).mirror().addBox(-0.0065F, 0.2691F, -0.1604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(138, 7).mirror().addBox(-0.0065F, 0.2691F, 0.2396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(138, 53).mirror().addBox(-0.0065F, -0.0309F, -0.1604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(138, 4).mirror().addBox(-0.0065F, -0.0309F, 0.2396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.5326F, 0.7353F, 0.3306F, -1.5271F, -0.1594F, 0.1957F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(134, 12).mirror().addBox(-0.0065F, -0.9274F, -0.7878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5326F, 0.7353F, 0.3306F, -0.7853F, -0.1594F, 0.1957F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(137, 133).mirror().addBox(-0.0065F, 0.0029F, -0.0209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.5326F, 0.7353F, 0.3306F, -1.0035F, -0.1594F, 0.1957F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(138, 56).mirror().addBox(-0.0065F, -0.8069F, -0.5434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(139, 74).mirror().addBox(0.1185F, -0.8069F, -0.5434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(82, 131).mirror().addBox(-0.0065F, -1.1069F, -0.5184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(56, 131).mirror().addBox(-0.0065F, -1.2069F, -0.1434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5326F, 0.7353F, 0.3306F, -0.698F, -0.1594F, 0.1957F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(137, 124).mirror().addBox(0.0131F, -0.4981F, -0.4787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.3521F, 0.8145F, 1.4222F, -0.5573F, -0.1258F, 0.2291F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(118, 137).mirror().addBox(0.0131F, -1.0528F, 0.2804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.3521F, 0.8145F, 1.4222F, 0.3764F, -0.1258F, 0.2291F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(108, 126).mirror().addBox(0.025F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.7269F, 1.7973F, 0.0596F, 0.9069F, -0.1273F, 0.1479F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(40, 133).mirror().addBox(-0.8483F, -0.4606F, -1.5573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.724F, 5.5053F, -5.4239F, 0.0823F, -0.557F, -0.0436F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(95, 139).mirror().addBox(-0.924F, -0.3638F, -0.1075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.724F, 5.5053F, -5.4239F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(85, 137).mirror().addBox(-0.6F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.766F, 5.0708F, -5.349F, 1.0238F, -0.0218F, 0.3359F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(108, 77).mirror().addBox(0.0058F, -0.6522F, -3.9936F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.146F, 1.7331F, -2.5103F, 0.8608F, -0.1313F, 0.0596F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(93, 107).mirror().addBox(-0.1435F, -1.0692F, 0.9027F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2474F, 2.095F, -2.6104F, 0.8341F, -0.0046F, 0.0867F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(137, 91).mirror().addBox(-0.0587F, -0.6848F, 0.215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2474F, 2.095F, -2.6104F, 1.1784F, -0.059F, 0.0519F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(19, 134).mirror().addBox(-0.3F, 0.025F, -0.9089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, -0.1154F, -3.0642F, 0.891F, -0.0384F, -0.0475F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(101, 59).mirror().addBox(-0.3F, 0.6856F, 1.9863F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.0F, -0.9F, -2.3F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(40, 103).mirror().addBox(-0.3F, -2.0144F, -4.0137F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, -4.8819F, 6.589F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(-0.3F, -1.0144F, -0.2137F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, -4.8819F, 6.589F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(111, 40).mirror().addBox(0.0F, -0.0612F, -3.0074F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.5F, -2.4321F, -1.0144F, 0.8739F, -0.0449F, -0.0535F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(130, 132).mirror().addBox(-0.8F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0763F, 5.4822F, -5.6822F, 0.1545F, -0.5864F, -0.1214F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(33, 133).mirror().addBox(-0.2238F, -0.5F, -0.8828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.0763F, 5.4822F, -5.6822F, 0.1309F, -0.189F, -0.0602F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5717F, 0.2308F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(119, 61).mirror().addBox(-1.0F, -0.3294F, -0.5499F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(119, 61).addBox(1.6F, -0.3294F, -0.5499F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8F, -1.1988F, -2.8624F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(130, 124).mirror().addBox(-1.0F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(130, 124).addBox(1.6F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8F, -0.1988F, -3.0624F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(139, 99).mirror().addBox(-1.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(139, 99).addBox(1.1F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3F, -0.31F, -3.2604F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(111, 138).mirror().addBox(0.0F, 0.0034F, 0.0182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(111, 138).addBox(1.6F, 0.0034F, 0.0182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.3F, -0.3654F, -6.1052F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(137, 127).mirror().addBox(0.0F, 0.0034F, -0.9818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(137, 127).addBox(1.6F, 0.0034F, -0.9818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.3F, -0.3654F, -6.1052F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(131, 20).mirror().addBox(-0.5F, -0.15F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(131, 20).addBox(1.1F, -0.15F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8F, -0.0593F, -3.585F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(132, 113).mirror().addBox(-1.5F, -1.415F, -1.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(132, 113).addBox(1.1F, -1.415F, -1.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.3F, 1.5868F, -2.8093F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(106, 137).mirror().addBox(-1.5F, -0.9999F, -0.9843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 137).addBox(1.1F, -0.9999F, -0.9843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.89F, 0.0412F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(137, 94).mirror().addBox(-1.5F, -0.9999F, 0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 94).addBox(1.1F, -0.9999F, 0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.3868F, -0.7093F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(26, 129).mirror().addBox(0.0F, 0.475F, -0.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 129).addBox(2.4F, 0.475F, -0.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -1.0544F, -5.4429F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(81, 40).mirror().addBox(0.0F, 0.8F, 1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 40).addBox(2.2F, 0.8F, 1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.2755F, -8.4971F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(137, 130).mirror().addBox(0.0F, -1.0091F, -0.8834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(137, 130).addBox(1.4F, -1.0091F, -0.8834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 1.3022F, -6.7378F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(95, 7).mirror().addBox(0.0F, 1.1506F, -0.6746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(95, 7).addBox(1.4F, 1.1506F, -0.6746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, -0.8132F, -7.9093F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(132, 117).mirror().addBox(0.0F, -0.9952F, -1.0195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(132, 117).addBox(1.6F, -0.9952F, -1.0195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3F, 1.1868F, -5.7093F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(139, 80).mirror().addBox(-1.05F, -0.9332F, -0.1151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(139, 80).addBox(0.35F, -0.9332F, -0.1151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.15F, 1.5782F, -7.4266F, 0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(80, 139).mirror().addBox(-1.05F, -0.1582F, -0.3401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(80, 139).addBox(0.35F, -0.1582F, -0.3401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.15F, 1.0362F, -8.0245F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(0, 139).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 139).addBox(0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, 1.2672F, -8.5446F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(139, 113).mirror().addBox(-0.425F, -0.6566F, -1.5562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(139, 113).addBox(-0.075F, -0.6566F, -1.5562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.25F, 1.0362F, -8.0245F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(132, 40).mirror().addBox(-1.5F, -1.1981F, -2.0593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(132, 40).addBox(1.1F, -1.1981F, -2.0593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3F, 1.3868F, -0.8093F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(131, 5).mirror().addBox(-1.5F, -0.998F, -2.0495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(131, 5).addBox(0.1F, -0.998F, -2.0495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, 1.3535F, -2.8522F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(133, 64).addBox(-0.65F, -0.2407F, -1.6703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.15F, 1.0362F, -8.0245F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(137, 88).mirror().addBox(-0.85F, -0.2438F, -0.2901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(90, 137).mirror().addBox(-0.85F, -0.2438F, -0.9901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(90, 137).addBox(0.15F, -0.2438F, -0.9901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(137, 88).addBox(0.15F, -0.2438F, -0.2901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.15F, 1.0362F, -8.0245F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0549F, 9.322F, 0.0352F, 0.1308F, 0.0046F));

		PartDefinition cube_r381 = tail.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(127, 89).addBox(0.0F, -6.5559F, 0.0318F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3599F, 11.9214F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r382 = tail.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(65, 127).addBox(0.0F, -6.6908F, 0.0315F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3599F, 9.9214F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r383 = tail.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(120, 119).addBox(0.0F, -6.5258F, 0.0329F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4599F, 7.9214F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r384 = tail.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(35, 123).addBox(0.0F, -6.4607F, 0.0344F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 5.9214F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r385 = tail.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(87, 128).addBox(0.0F, -6.4956F, 0.0341F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 3.9214F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r386 = tail.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(93, 128).addBox(0.0F, -6.3305F, 0.0338F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5599F, 1.9214F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r387 = tail.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(45, 78).addBox(0.0F, -6.6654F, 0.0352F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6599F, -0.0786F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r388 = tail.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(24, 134).mirror().addBox(-2.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(135, 61).mirror().addBox(-2.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 134).addBox(0.3F, -1.0F, 14.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 61).addBox(0.4F, -1.0F, 12.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 59).mirror().addBox(-2.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 133).mirror().addBox(-2.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 135).mirror().addBox(-2.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(129, 136).mirror().addBox(-2.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 133).mirror().addBox(-3.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(135, 59).addBox(0.5F, -1.0F, 10.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 133).addBox(0.6F, -1.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 135).addBox(0.7F, -1.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 136).addBox(0.8F, -1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 133).addBox(1.0F, -1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 43).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3401F, -2.0786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r389 = tail.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(117, 119).addBox(0.0F, -0.6134F, -0.5652F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.46F, 12.6878F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r390 = tail.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(59, 121).addBox(0.0F, -0.2618F, -0.0769F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.56F, 9.5878F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r391 = tail.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(128, 45).addBox(0.0F, -1.9678F, -2.1986F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 126).addBox(0.0F, 0.0322F, -0.1986F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.56F, 7.1878F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(134, 97).addBox(0.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 135).addBox(-0.1F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 77).addBox(-0.1F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 136).addBox(-0.2F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 108).addBox(0.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 26).addBox(0.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 97).mirror().addBox(-2.1F, 0.4F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 135).mirror().addBox(-1.9F, 0.4F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 77).mirror().addBox(-1.9F, 0.4F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 136).mirror().addBox(-1.8F, 0.4F, 7.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(124, 108).mirror().addBox(-1.5F, 0.4F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(138, 26).mirror().addBox(-1.3F, 0.4F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1401F, 12.9214F, -0.1445F, 0.2592F, -0.0373F));

		PartDefinition cube_r392 = tail2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(6, 128).addBox(0.0F, -6.4F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r393 = tail2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(53, 130).addBox(0.0F, -4.8F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 11.0F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r394 = tail2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(120, 129).addBox(0.0F, -5.4F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 9.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r395 = tail2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(9, 131).addBox(0.0F, -5.8F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r396 = tail2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(84, 122).addBox(0.0F, -6.1F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r397 = tail2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(3, 128).addBox(0.0F, -6.4F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r398 = tail2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 128).addBox(0.0F, -0.9887F, -0.385F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 12.2858F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r399 = tail2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(9, 121).addBox(0.0F, -1.3578F, -0.4952F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 10.0858F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r400 = tail2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(90, 128).addBox(0.0F, -0.0446F, -0.3556F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 7.3868F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r401 = tail2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(62, 115).addBox(0.0F, -0.2364F, -0.1492F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2199F, 4.2664F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r402 = tail2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(120, 33).addBox(0.0F, -0.1989F, -0.1464F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4199F, 1.8664F, 0.7243F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(33, 26).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, -0.1372F, 0.3027F, -0.0411F));

		PartDefinition cube_r403 = tail3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(43, 137).addBox(0.0F, -2.5184F, 0.0367F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 12.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r404 = tail3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(90, 108).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r405 = tail3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(59, 135).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r406 = tail3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(56, 135).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r407 = tail3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(135, 53).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r408 = tail3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(126, 134).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r409 = tail3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(93, 100).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r410 = tail3.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(123, 134).addBox(0.0F, 5.6F, 11.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 134).addBox(0.0F, 4.8F, 9.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 94).addBox(0.0F, 3.0F, 7.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 78).addBox(0.0F, 2.0F, 5.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -2.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r411 = tail3.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(115, 130).addBox(0.0F, -0.3477F, -0.1361F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 1.3858F, 0.6458F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r412 = tail4.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(22, 141).addBox(0.0F, -2.6848F, 3.6797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 18).addBox(0.0F, -2.0924F, 1.7899F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 63).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 8.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r413 = tail4.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(68, 140).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r414 = tail4.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(140, 28).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r415 = tail4.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(139, 138).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r416 = tail4.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(139, 120).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r417 = tail4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(65, 140).addBox(0.0F, 11.9F, 21.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -13.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r418 = tail4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(139, 116).addBox(0.0F, 0.3137F, -0.0255F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6035F, 9.0108F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r419 = tail4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(140, 67).addBox(0.0F, 0.5394F, -0.1148F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5525F, 6.6858F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r420 = tail4.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(100, 139).addBox(0.0F, 0.4753F, 0.0239F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9525F, 4.3858F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r421 = tail4.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(52, 138).addBox(0.0F, -0.0324F, -0.1146F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1525F, 2.2858F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r422 = tail4.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(27, 138).addBox(0.0F, -0.1325F, -0.2145F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1173F, -0.0161F, 0.7069F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 24.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1344F, 14.0632F, 0.0366F, -0.3052F, -0.011F));

		PartDefinition cube_r423 = tail5.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(10, 141).addBox(0.0F, 18.6F, 32.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 140).addBox(0.0F, 17.5F, 30.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 140).addBox(0.0F, 16.4F, 28.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 113).addBox(0.0F, 15.3F, 26.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 140).addBox(0.0F, 13.3F, 24.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5577F, -28.175F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r424 = tail5.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(122, 140).addBox(0.0F, -4.6F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 140).addBox(0.0F, -4.0F, 9.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 140).addBox(0.0F, -3.3F, 7.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 140).addBox(0.0F, -2.7F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 140).addBox(0.0F, -2.1F, 3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 102).addBox(0.0F, -1.6F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 140).addBox(0.0F, -1.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3665F, 0.0F, 0.0F));

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