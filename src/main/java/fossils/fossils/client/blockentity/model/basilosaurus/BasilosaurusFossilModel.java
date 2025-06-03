package fossils.fossils.client.blockentity.model.basilosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BasilosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body7;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public BasilosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body7 = this.body2.getChild("body7");
		this.hips = this.body7.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail4 = this.tail2.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail3 = this.tail6.getChild("tail3");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone = this.chest.getChild("bone");
		this.bone2 = this.chest.getChild("bone2");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.4183F, -111.2768F, 0.0266F, 0.1745F, 0.0046F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 42).addBox(-2.0F, -0.8339F, -0.0052F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 13.2065F, 1.5041F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(98, 35).mirror().addBox(-9.91F, 0.1277F, -0.4759F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8926F, 12.7869F, 5.0291F, 0.3461F, 0.3554F, 0.4861F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 113).mirror().addBox(-7.7976F, -0.0683F, -0.2929F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9898F, 12.2817F, -0.918F, -0.3494F, 0.4077F, 0.2867F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(133, 99).mirror().addBox(-8.4824F, -3.0366F, -0.5667F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 1.4842F, -4.691F, 0.1093F, 0.2369F, -1.5157F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(149, 0).mirror().addBox(-4.5068F, -1.0339F, -0.5667F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 1.4842F, -4.691F, 0.2079F, 0.1581F, -1.0235F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(152, 22).mirror().addBox(-1.8141F, 0.1983F, -0.5669F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 1.4842F, -4.691F, 0.26F, -0.0149F, -0.3264F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(115, 30).mirror().addBox(-9.7447F, -4.0007F, -0.5246F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.8841F, -2.391F, 0.0949F, 0.1864F, -1.4751F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(142, 148).mirror().addBox(-5.191F, -1.762F, -0.5246F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.8841F, -2.391F, 0.1713F, 0.1202F, -0.985F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(148, 120).mirror().addBox(-2.8082F, 0.0977F, -0.5248F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.8841F, -2.391F, 0.208F, -0.0205F, -0.2819F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(148, 118).mirror().addBox(-2.8082F, 0.0977F, -0.5248F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.0842F, -0.491F, 0.3121F, -0.0092F, -0.1438F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(148, 116).mirror().addBox(-5.191F, -1.762F, -0.5245F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.0842F, -0.491F, 0.2448F, 0.1957F, -0.8338F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(-11.7447F, -4.0007F, -1.5245F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.0842F, -0.491F, 0.124F, 0.2873F, -1.3287F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(135, 95).mirror().addBox(-3.3052F, 0.0474F, -0.5038F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.8159F, 1.409F, 0.4422F, 0.005F, -0.1528F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(98, 20).mirror().addBox(-12.8759F, -4.4827F, -1.5035F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.8159F, 1.409F, 0.163F, 0.413F, -1.324F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(143, 23).mirror().addBox(-5.5331F, -2.126F, -0.5035F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.8159F, 1.409F, 0.34F, 0.2885F, -0.8197F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-13.0247F, -4.9267F, -0.722F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -1.5158F, 3.309F, 0.163F, 0.413F, -1.2804F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(84, 148).mirror().addBox(-5.873F, -2.4482F, 0.278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -1.5158F, 3.309F, 0.34F, 0.2885F, -0.776F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(140, 130).mirror().addBox(-3.7731F, 0.0272F, 0.2777F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -1.5158F, 3.309F, 0.4422F, 0.005F, -0.1092F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(98, 40).mirror().addBox(-8.61F, -0.0723F, -0.7759F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0592F, 12.6061F, 2.2507F, 0.3186F, 0.4859F, 0.3943F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(115, 32).mirror().addBox(-5.7976F, 0.1317F, -0.5928F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6823F, 11.8176F, -2.6701F, -0.3237F, 0.3341F, 0.3441F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(133, 97).mirror().addBox(-4.9407F, -0.0923F, -0.5728F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9224F, 11.0859F, -5.7408F, -0.541F, 0.724F, 0.3997F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(98, 35).addBox(-0.09F, 0.1277F, -0.4759F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8926F, 12.7869F, 5.0291F, 0.3461F, -0.3554F, -0.4861F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(98, 40).addBox(-0.39F, -0.0723F, -0.7759F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0592F, 12.6061F, 2.2507F, 0.3186F, -0.4859F, -0.3943F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 113).addBox(-0.2025F, -0.0683F, -0.2929F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9898F, 12.2817F, -0.918F, -0.3494F, -0.4077F, -0.2867F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(115, 32).addBox(-0.2025F, 0.1317F, -0.5928F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6823F, 11.8176F, -2.6701F, -0.3237F, -0.3341F, -0.3441F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(159, 122).addBox(0.0F, -0.3668F, -2.0027F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 149).addBox(0.0F, -3.7668F, -0.0027F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4658F, -3.2771F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(89, 150).addBox(0.0F, -4.4668F, 0.0973F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6681F, -1.3293F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(156, 77).addBox(-0.5F, -0.9124F, 0.516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(78, 156).addBox(-0.5F, -0.9124F, 0.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1258F, 0.7664F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(59, 152).addBox(0.0F, -3.9668F, -0.0027F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9658F, 0.9229F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(27, 129).addBox(0.0F, -3.4668F, -0.0027F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8658F, 3.3229F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(156, 71).addBox(-0.5F, -0.9124F, 0.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(156, 74).addBox(-0.5F, -0.9124F, 0.516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.0258F, 3.1664F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(133, 97).addBox(-0.0594F, -0.0923F, -0.5728F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9224F, 11.0859F, -5.7408F, -0.541F, -0.724F, -0.3997F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(27, 106).addBox(-2.0F, -1.0035F, -5.0435F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 13.3823F, 1.5202F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(84, 112).addBox(-1.0F, -1.0215F, -4.9704F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.2877F, -3.3872F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(152, 22).addBox(-0.1859F, 0.1983F, -0.5669F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 1.4842F, -4.691F, 0.26F, 0.0149F, 0.3264F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(149, 0).addBox(1.5068F, -1.0339F, -0.5667F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 1.4842F, -4.691F, 0.2079F, -0.1581F, 1.0235F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(133, 99).addBox(3.4824F, -3.0366F, -0.5667F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 1.4842F, -4.691F, 0.1093F, -0.2369F, 1.5157F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(148, 120).addBox(-0.1918F, 0.0977F, -0.5248F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.8841F, -2.391F, 0.208F, 0.0205F, 0.2819F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(142, 148).addBox(2.191F, -1.762F, -0.5246F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.8841F, -2.391F, 0.1713F, -0.1202F, 0.985F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(115, 30).addBox(3.7447F, -4.0007F, -0.5246F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.8841F, -2.391F, 0.0949F, -0.1864F, 1.4751F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(98, 37).addBox(3.7447F, -4.0007F, -1.5245F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.0842F, -0.491F, 0.124F, -0.2873F, 1.3287F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(148, 116).addBox(2.191F, -1.762F, -0.5245F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.0842F, -0.491F, 0.2448F, -0.1957F, 0.8338F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(148, 118).addBox(-0.1918F, 0.0977F, -0.5248F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.0842F, -0.491F, 0.3121F, 0.0092F, 0.1438F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(143, 23).addBox(2.5331F, -2.126F, -0.5035F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.8159F, 1.409F, 0.34F, -0.2885F, 0.8197F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(98, 20).addBox(3.8759F, -4.4827F, -1.5035F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.8159F, 1.409F, 0.163F, -0.413F, 1.324F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(135, 95).addBox(-0.6948F, 0.0474F, -0.5038F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.8159F, 1.409F, 0.4422F, -0.005F, 0.1528F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(140, 130).addBox(-0.2269F, 0.0272F, 0.2777F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -1.5158F, 3.309F, 0.4422F, -0.005F, 0.1092F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(84, 148).addBox(2.873F, -2.4482F, 0.278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -1.5158F, 3.309F, 0.34F, -0.2885F, 0.776F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(98, 23).addBox(4.0247F, -4.9267F, -0.722F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -1.5158F, 3.309F, 0.163F, -0.413F, 1.2804F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(84, 97).addBox(-1.0F, -1.908F, 3.84F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4854F, -9.7706F, 0.3403F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(98, 26).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6619F, 4.7281F, 0.2096F, 0.0427F, 0.0091F));

		PartDefinition cube_r51 = body6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(98, 4).mirror().addBox(-14.0247F, -4.9267F, -0.722F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.254F, 0.7808F, 0.1191F, 0.2705F, -1.3126F));

		PartDefinition cube_r52 = body6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(148, 39).mirror().addBox(-5.873F, -2.4482F, 0.278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.254F, 0.7808F, 0.2325F, 0.1832F, -0.8186F));

		PartDefinition cube_r53 = body6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(140, 128).mirror().addBox(-3.7731F, 0.0272F, 0.2777F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.254F, 0.7808F, 0.2947F, -0.0111F, -0.1262F));

		PartDefinition cube_r54 = body6.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 71).mirror().addBox(-15.0247F, -4.9267F, -1.222F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.354F, 3.4808F, 0.129F, 0.3041F, -1.3272F));

		PartDefinition cube_r55 = body6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(148, 37).mirror().addBox(-5.873F, -2.4482F, -0.222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.354F, 3.4808F, 0.2573F, 0.2082F, -0.8313F));

		PartDefinition cube_r56 = body6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(125, 140).mirror().addBox(-3.7731F, 0.0272F, -0.2223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.354F, 3.4808F, 0.3294F, -0.0073F, -0.1439F));

		PartDefinition cube_r57 = body6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(140, 128).addBox(-0.2269F, 0.0272F, 0.2777F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.254F, 0.7808F, 0.2947F, 0.0111F, 0.1262F));

		PartDefinition cube_r58 = body6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(148, 39).addBox(2.873F, -2.4482F, 0.278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.254F, 0.7808F, 0.2325F, -0.1832F, 0.8186F));

		PartDefinition cube_r59 = body6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(98, 4).addBox(4.0247F, -4.9267F, -0.722F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.254F, 0.7808F, 0.1191F, -0.2705F, 1.3126F));

		PartDefinition cube_r60 = body6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(125, 140).addBox(-0.2269F, 0.0272F, -0.2223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.354F, 3.4808F, 0.3294F, 0.0073F, 0.1439F));

		PartDefinition cube_r61 = body6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(148, 37).addBox(2.873F, -2.4482F, -0.222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.354F, 3.4808F, 0.2573F, -0.2082F, 0.8313F));

		PartDefinition cube_r62 = body6.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(94, 71).addBox(4.0247F, -4.9267F, -1.222F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.354F, 3.4808F, 0.129F, -0.3041F, 1.3272F));

		PartDefinition cube_r63 = body6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(92, 154).addBox(-0.5F, -1.3158F, 0.3682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(154, 122).addBox(-0.5F, -1.3158F, -0.1318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.764F, 0.6383F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(70, 156).addBox(0.0F, -3.0674F, -0.2779F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6817F, 1.622F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(142, 159).mirror().addBox(-0.2F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5351F, -2.4322F, 3.0257F, -0.9014F, -0.0756F, -0.8433F));

		PartDefinition cube_r66 = body6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(142, 159).addBox(0.2F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5351F, -2.4322F, 3.0257F, -0.9014F, 0.0756F, 0.8433F));

		PartDefinition cube_r67 = body6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(120, 153).addBox(-0.5F, -1.4341F, 0.3324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(115, 153).addBox(-0.5F, -1.4341F, -0.1676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9405F, 2.9422F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body6.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(67, 156).addBox(0.0F, -2.6944F, -0.9837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.764F, 4.7383F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3905F, 5.8543F, -0.2452F, -0.0847F, 0.0212F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(103, 153).mirror().addBox(0.8466F, -0.5704F, -2.6944F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.65F, 0.988F, -0.707F, 0.2805F, -0.8092F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(153, 93).mirror().addBox(-0.1809F, -0.5295F, -0.7846F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5114F, -2.4612F, 3.0184F, -0.7988F, 0.1848F, -0.8304F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(42, 153).mirror().addBox(1.0594F, -0.2935F, -3.3764F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.523F, 10.1692F, -0.6679F, 0.1848F, -0.8304F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(37, 153).mirror().addBox(1.2584F, 0.1574F, -3.61F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.223F, 16.1692F, -0.8861F, 0.1848F, -0.8304F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(103, 153).addBox(-0.8466F, -0.5704F, -2.6944F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.65F, 0.988F, -0.707F, -0.2805F, 0.8092F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(143, 132).addBox(-0.5F, -1.8462F, -1.3955F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.65F, 0.988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(97, 159).addBox(0.0F, -3.4903F, -0.6795F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.65F, 0.988F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(108, 153).addBox(0.0F, -1.2009F, -0.6235F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.75F, 4.488F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(143, 111).addBox(-0.5F, -1.7705F, -7.105F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 143).addBox(-0.5F, -1.7927F, -2.2884F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(148, 2).addBox(0.0F, -4.2202F, -1.4495F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(47, 153).addBox(-0.5F, -1.7927F, -0.6884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.523F, 10.1692F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(153, 93).addBox(0.1809F, -0.5295F, -0.7846F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5114F, -2.4612F, 3.0184F, -0.7988F, -0.1848F, 0.8304F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(42, 153).addBox(-1.0594F, -0.2935F, -3.3764F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.523F, 10.1692F, -0.6679F, -0.1848F, 0.8304F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(151, 41).addBox(-0.5F, -2.0927F, -0.7884F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(36, 139).addBox(-0.5F, -2.0927F, -2.3884F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.223F, 16.1692F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(127, 149).addBox(0.0F, -4.1202F, -1.6495F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.223F, 16.1692F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(37, 153).addBox(-1.2584F, 0.1574F, -3.61F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.223F, 16.1692F, -0.8861F, -0.1848F, 0.8304F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(98, 9).mirror().addBox(-15.0247F, -4.9267F, -0.722F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -1.5635F, 15.0266F, 0.2762F, 0.7032F, -1.3419F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(148, 18).mirror().addBox(-5.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -1.5635F, 15.0266F, 0.5861F, 0.493F, -0.8035F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(114, 140).mirror().addBox(-3.7731F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -1.5635F, 15.0266F, 0.746F, 0.0376F, -0.2248F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(98, 2).mirror().addBox(-16.0247F, -4.9267F, -0.722F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.9635F, 8.9265F, 0.2965F, 0.744F, -1.3284F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(148, 16).mirror().addBox(-5.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.9635F, 8.9265F, 0.6251F, 0.5202F, -0.7846F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(25, 140).mirror().addBox(-3.7731F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.9635F, 8.9265F, 0.7894F, 0.042F, -0.2231F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(138, 0).mirror().addBox(-3.7731F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.0365F, 0.6265F, 0.6765F, 0.0303F, -0.1748F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(146, 109).mirror().addBox(-5.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.0365F, 0.6265F, 0.5259F, 0.4483F, -0.7785F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(98, 7).mirror().addBox(-15.0247F, -4.9267F, -0.722F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.0365F, 0.6265F, 0.2463F, 0.6374F, -1.3081F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-16.0247F, -4.9267F, -0.722F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.3635F, 4.2266F, 0.2762F, 0.7032F, -1.307F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(146, 99).mirror().addBox(-5.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.3635F, 4.2266F, 0.5861F, 0.493F, -0.7686F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(135, 109).mirror().addBox(-3.7731F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.3635F, 4.2266F, 0.746F, 0.0376F, -0.1899F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(98, 7).addBox(4.0247F, -4.9267F, -0.722F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.0365F, 0.6265F, 0.2463F, -0.6374F, 1.3081F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(146, 109).addBox(2.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.0365F, 0.6265F, 0.5259F, -0.4483F, 0.7785F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(138, 0).addBox(-0.2269F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.0365F, 0.6265F, 0.6765F, -0.0303F, 0.1748F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(114, 140).addBox(-0.2269F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -1.5635F, 15.0266F, 0.746F, -0.0376F, 0.2248F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(148, 18).addBox(2.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -1.5635F, 15.0266F, 0.5861F, -0.493F, 0.8035F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(98, 9).addBox(4.0247F, -4.9267F, -0.722F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -1.5635F, 15.0266F, 0.2762F, -0.7032F, 1.3419F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(25, 140).addBox(-0.2269F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.9635F, 8.9265F, 0.7894F, -0.042F, 0.2231F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(148, 16).addBox(2.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.9635F, 8.9265F, 0.6251F, -0.5202F, 0.7846F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(98, 2).addBox(4.0247F, -4.9267F, -0.722F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.9635F, 8.9265F, 0.2965F, -0.744F, 1.3284F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(135, 109).addBox(-0.2269F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.3635F, 4.2266F, 0.746F, -0.0376F, 0.1899F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(146, 99).addBox(2.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.3635F, 4.2266F, 0.5861F, -0.493F, 0.7686F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(98, 0).addBox(4.0247F, -4.9267F, -0.722F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.3635F, 4.2266F, 0.2762F, -0.7032F, 1.307F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(94, 50).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 8.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(47, 74).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F))
				.texOffs(0, 139).addBox(-0.5F, -2.829F, 1.8429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 151).addBox(-0.5F, -2.829F, 3.4429F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.5867F, 17.8378F, -0.061F, -0.087F, 0.0129F));

		PartDefinition cube_r108 = body5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(32, 153).mirror().addBox(0.0F, -0.5F, -0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4704F, -2.4531F, 1.7124F, -0.7271F, 0.1201F, -0.8394F));

		PartDefinition cube_r109 = body5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(27, 153).mirror().addBox(1.9794F, 0.7138F, -2.7437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -0.782F, 10.0229F, -1.0036F, 0.055F, -0.8445F));

		PartDefinition cube_r110 = body5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(17, 153).mirror().addBox(1.9794F, 0.8138F, -2.7437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -0.782F, 17.2229F, -1.0036F, 0.055F, -0.8445F));

		PartDefinition cube_r111 = body5.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(32, 153).addBox(0.0F, -0.5F, -0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4704F, -2.4531F, 1.7124F, -0.7271F, -0.1201F, 0.8394F));

		PartDefinition cube_r112 = body5.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(152, 51).addBox(0.0F, -3.9289F, -1.8493F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7363F, 4.4313F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body5.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(152, 32).addBox(0.0F, -0.8F, -1.2F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7363F, 10.4313F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body5.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(109, 129).addBox(-1.6365F, -2.0828F, -2.2776F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -0.782F, 10.0229F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body5.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(27, 153).addBox(-1.9794F, 0.7138F, -2.7437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -0.782F, 10.0229F, -1.0036F, -0.055F, 0.8445F));

		PartDefinition cube_r116 = body5.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(17, 153).addBox(-1.9794F, 0.8138F, -2.7437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -0.782F, 17.2229F, -1.0036F, -0.055F, 0.8445F));

		PartDefinition cube_r117 = body5.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(151, 106).mirror().addBox(-1.6917F, 0.1852F, -0.7772F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.1768F, 16.1887F, 0.5637F, 0.0183F, -0.3695F));

		PartDefinition cube_r118 = body5.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(148, 27).mirror().addBox(-4.4058F, -0.9635F, -0.7769F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.1768F, 16.1887F, 0.4335F, 0.3728F, -1.0074F));

		PartDefinition cube_r119 = body5.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(148, 25).mirror().addBox(-6.4263F, -2.927F, -0.7769F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.1768F, 16.1887F, 0.2035F, 0.5297F, -1.5237F));

		PartDefinition cube_r120 = body5.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(115, 18).mirror().addBox(-9.6328F, -4.2318F, -0.6058F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.1232F, 9.1887F, 0.2359F, 0.6126F, -1.4539F));

		PartDefinition cube_r121 = body5.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(149, 88).mirror().addBox(-5.2007F, -2.0186F, -0.6058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.1232F, 9.1887F, 0.504F, 0.4312F, -0.9274F));

		PartDefinition cube_r122 = body5.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(148, 20).mirror().addBox(-2.9838F, -0.0895F, -0.6061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, 0.1232F, 9.1887F, 0.6505F, 0.0276F, -0.3152F));

		PartDefinition cube_r123 = body5.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(135, 14).mirror().addBox(-3.7731F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4971F, -0.2768F, 3.1887F, 0.6939F, 0.0322F, -0.3139F));

		PartDefinition cube_r124 = body5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(142, 93).mirror().addBox(-5.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4971F, -0.2768F, 3.1887F, 0.5407F, 0.4596F, -0.9116F));

		PartDefinition cube_r125 = body5.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(9, 113).mirror().addBox(-12.0247F, -4.9267F, -0.722F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4971F, -0.2768F, 3.1887F, 0.2535F, 0.6539F, -1.4434F));

		PartDefinition cube_r126 = body5.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(148, 25).addBox(3.4263F, -2.927F, -0.7769F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.1768F, 16.1887F, 0.2035F, -0.5297F, 1.5237F));

		PartDefinition cube_r127 = body5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(148, 27).addBox(1.4058F, -0.9635F, -0.7769F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.1768F, 16.1887F, 0.4335F, -0.3728F, 1.0074F));

		PartDefinition cube_r128 = body5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(151, 106).addBox(-0.3083F, 0.1852F, -0.7772F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.1768F, 16.1887F, 0.5637F, -0.0183F, 0.3695F));

		PartDefinition cube_r129 = body5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(148, 20).addBox(-0.0162F, -0.0895F, -0.6061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.1232F, 9.1887F, 0.6505F, -0.0276F, 0.3152F));

		PartDefinition cube_r130 = body5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(149, 88).addBox(2.2007F, -2.0186F, -0.6058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.1232F, 9.1887F, 0.504F, -0.4312F, 0.9274F));

		PartDefinition cube_r131 = body5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(115, 18).addBox(3.6328F, -4.2318F, -0.6058F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, 0.1232F, 9.1887F, 0.2359F, -0.6126F, 1.4539F));

		PartDefinition cube_r132 = body5.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(9, 113).addBox(4.0247F, -4.9267F, -0.722F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4971F, -0.2768F, 3.1887F, 0.2535F, -0.6539F, 1.4434F));

		PartDefinition cube_r133 = body5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(142, 93).addBox(2.873F, -2.4482F, -0.722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4971F, -0.2768F, 3.1887F, 0.5407F, -0.4596F, 0.9116F));

		PartDefinition cube_r134 = body5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(135, 14).addBox(-0.2269F, 0.0272F, -0.7223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4971F, -0.2768F, 3.1887F, 0.6939F, -0.0322F, 0.3139F));

		PartDefinition cube_r135 = body5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(18, 129).addBox(-1.6365F, -2.0828F, -2.1776F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -0.782F, 17.2229F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(149, 122).addBox(0.0F, -1.2F, -0.8F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7363F, 17.6313F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, -1.0F, 0.1F, 2.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0463F, 19.7928F, -0.1394F, -0.0425F, 0.0117F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(22, 149).addBox(0.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6826F, 4.2385F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(31, 128).addBox(-1.6365F, -2.0828F, -2.1776F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -0.7282F, 3.8301F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(151, 81).mirror().addBox(1.9794F, -0.2862F, -2.7437F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -0.7282F, 3.8301F, -1.0036F, 0.055F, -0.8445F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(151, 76).mirror().addBox(1.9682F, -0.7154F, -2.4875F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -0.7282F, 10.1301F, -1.0326F, 0.0223F, -0.8456F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(151, 81).addBox(-1.9794F, -0.2862F, -2.7437F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -0.7282F, 3.8301F, -1.0036F, -0.055F, 0.8445F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(151, 76).addBox(-1.9682F, -0.7154F, -2.4875F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -0.7282F, 10.1301F, -1.0326F, -0.0223F, 0.8456F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(100, 127).addBox(-1.6365F, -2.1481F, -1.6819F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -0.7282F, 10.1301F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(79, 146).addBox(0.0F, -1.4F, -0.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0877F, 10.585F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(146, 77).addBox(0.0F, -1.5F, -0.3F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1877F, 17.785F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(91, 138).addBox(-1.6365F, -2.148F, -1.0819F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -0.8283F, 17.3301F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(134, 71).mirror().addBox(-1.8F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 0.6674F, 16.6654F, -0.0096F, -0.331F, -0.7128F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(134, 34).mirror().addBox(-1.8F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 0.6674F, 9.4654F, -0.0093F, -0.2001F, -0.7141F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(136, 140).mirror().addBox(1.9682F, -1.2154F, -3.3875F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -0.8283F, 17.3301F, -1.0326F, 0.0223F, -0.8456F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(141, 30).mirror().addBox(-1.7F, 0.0F, -1.2F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0603F, 0.4916F, 3.2922F, -0.0096F, -0.331F, -0.7128F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(136, 140).addBox(-1.9682F, -1.2154F, -3.3875F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -0.8283F, 17.3301F, -1.0326F, -0.0223F, 0.8456F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(134, 71).addBox(-1.2F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.6674F, 16.6654F, -0.0096F, 0.331F, 0.7128F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(134, 34).addBox(-1.2F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.6674F, 9.4654F, -0.0093F, 0.2001F, 0.7141F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(141, 30).addBox(-0.3F, 0.0F, -1.2F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0603F, 0.4916F, 3.2922F, -0.0096F, 0.331F, 0.7128F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(49, 25).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1202F, 21.0834F, -0.0606F, -0.0869F, 0.0167F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(135, 67).mirror().addBox(-2.1F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 0.6472F, 17.182F, -0.0098F, -0.3746F, -0.7123F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(135, 64).mirror().addBox(-2.1F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 0.7472F, 10.282F, -0.0094F, -0.2437F, -0.7136F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(135, 61).mirror().addBox(-2.1F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 0.7472F, 3.082F, -0.0093F, -0.2001F, -0.7141F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(98, 140).mirror().addBox(1.5682F, -1.2154F, -3.1875F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -1.2485F, 3.2467F, -0.8145F, 0.0223F, -0.8456F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(50, 139).mirror().addBox(1.5682F, -1.5154F, -2.9875F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -1.2485F, 10.3467F, -0.7561F, -0.0103F, -0.8458F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(33, 121).mirror().addBox(1.5682F, -1.5154F, -3.5875F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -1.3485F, 17.5467F, -0.7561F, -0.0103F, -0.8458F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(98, 140).addBox(-1.5682F, -1.2154F, -3.1875F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -1.2485F, 3.2467F, -0.8145F, -0.0223F, 0.8456F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(84, 138).addBox(-1.6365F, -2.148F, -1.0819F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -1.2485F, 3.2467F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(146, 71).addBox(0.0F, -1.5F, -0.7F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6079F, 3.7017F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(115, 147).addBox(-1.1365F, -4.8071F, -0.254F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -1.2485F, 10.3467F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(135, 54).addBox(-1.6365F, -2.3481F, -1.0819F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -1.2485F, 10.3467F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(50, 139).addBox(-1.5682F, -1.5154F, -2.9875F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -1.2485F, 10.3467F, -0.7561F, 0.0103F, 0.8458F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(135, 67).addBox(-0.9F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.6472F, 17.182F, -0.0098F, 0.3746F, 0.7123F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(135, 64).addBox(-0.9F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.7472F, 10.282F, -0.0094F, 0.2437F, 0.7136F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(135, 61).addBox(-0.9F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.7472F, 3.082F, -0.0093F, 0.2001F, 0.7141F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(135, 47).addBox(-1.1365F, -4.7071F, -0.254F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -1.3485F, 17.5467F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(53, 117).addBox(-1.6365F, -2.3481F, -1.4819F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -1.3485F, 17.5467F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(33, 121).addBox(-1.5682F, -1.5154F, -3.5875F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -1.3485F, 17.5467F, -0.7561F, 0.0103F, 0.8458F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2783F, 22.0169F, 0.0741F, -0.0032F, 0.0435F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(23, 142).addBox(-1.1365F, -2.9612F, -1.5985F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -2.1702F, 4.9298F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(44, 117).addBox(-1.6365F, -1.81F, -2.5069F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -0.6702F, 4.4298F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(133, 101).mirror().addBox(-2.1F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 4.5255F, 16.565F, -0.0935F, -0.4987F, -0.5623F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(135, 77).mirror().addBox(-2.1F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 3.2255F, 10.2651F, -0.0935F, -0.4987F, -0.5623F));

		PartDefinition cube_r177 = body2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(135, 74).mirror().addBox(-2.1F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 1.4254F, 2.6651F, -0.0985F, -0.5856F, -0.5525F));

		PartDefinition cube_r178 = body2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(80, 127).mirror().addBox(1.4676F, -0.9082F, -3.7985F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -0.6702F, 4.4298F, -0.8712F, -0.1261F, -0.9326F));

		PartDefinition cube_r179 = body2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 132).mirror().addBox(1.4676F, -0.9082F, -3.7985F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, 0.9298F, 11.5298F, -0.8712F, -0.1261F, -0.9326F));

		PartDefinition cube_r180 = body2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(9, 131).mirror().addBox(1.4676F, -0.9082F, -3.7985F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, 2.3298F, 18.0298F, -0.8976F, -0.1611F, -0.9288F));

		PartDefinition cube_r181 = body2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(80, 127).addBox(-1.4676F, -0.9082F, -3.7985F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -0.6702F, 4.4298F, -0.8712F, 0.1261F, 0.9326F));

		PartDefinition cube_r182 = body2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 132).addBox(-1.4676F, -0.9082F, -3.7985F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, 0.9298F, 11.5298F, -0.8712F, 0.1261F, 0.9326F));

		PartDefinition cube_r183 = body2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(82, 119).addBox(-1.6365F, -1.81F, -2.5069F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, 0.9298F, 11.5298F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(105, 142).addBox(-1.1365F, -4.5339F, -1.4351F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, 0.9298F, 11.5298F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(9, 131).addBox(-1.4676F, -0.9082F, -3.7985F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, 2.3298F, 18.0298F, -0.8976F, 0.1611F, 0.9288F));

		PartDefinition cube_r186 = body2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(73, 117).addBox(-1.6365F, -1.81F, -2.5069F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, 2.3298F, 18.0298F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(133, 101).addBox(-0.9F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 4.5255F, 16.565F, -0.0935F, 0.4987F, 0.5623F));

		PartDefinition cube_r188 = body2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(135, 77).addBox(-0.9F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 3.2255F, 10.2651F, -0.0935F, 0.4987F, 0.5623F));

		PartDefinition cube_r189 = body2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(135, 74).addBox(-0.9F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 1.4254F, 2.6651F, -0.0985F, 0.5856F, 0.5525F));

		PartDefinition cube_r190 = body2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(142, 52).addBox(-1.1365F, -4.3339F, -1.4351F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, 2.3298F, 18.0298F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r191 = body2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1512F, 8.7474F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5656F, -8.4997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body7 = body2.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(69, 144).addBox(0.0F, -5.473F, 9.4464F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(47, 50).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6344F, 21.3003F, -0.436F, 0.0184F, 0.0395F));

		PartDefinition cube_r192 = body7.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(91, 119).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 0.691F, 16.7648F, 0.0726F, -0.1942F, -0.5374F));

		PartDefinition cube_r193 = body7.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(121, 71).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 0.691F, 10.1648F, 0.0726F, -0.1942F, -0.5374F));

		PartDefinition cube_r194 = body7.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(91, 122).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 0.691F, 3.1648F, 0.0751F, -0.3247F, -0.5474F));

		PartDefinition cube_r195 = body7.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(126, 42).mirror().addBox(1.4676F, -0.9082F, -3.7985F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -1.1046F, 4.0295F, -0.8192F, -0.0559F, -0.9373F));

		PartDefinition cube_r196 = body7.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(126, 9).mirror().addBox(1.601F, -1.5526F, -3.1726F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -1.1046F, 10.0295F, -0.7061F, -0.0207F, -0.9383F));

		PartDefinition cube_r197 = body7.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(22, 122).mirror().addBox(-0.0794F, -0.9665F, -1.9493F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, -3.0046F, 16.4295F, -0.7579F, -0.0911F, -0.9354F));

		PartDefinition cube_r198 = body7.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(126, 42).addBox(-1.4676F, -0.9082F, -3.7985F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -1.1046F, 4.0295F, -0.8192F, 0.0559F, 0.9373F));

		PartDefinition cube_r199 = body7.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(126, 104).addBox(-1.6365F, -1.81F, -2.5069F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -1.1046F, 4.0295F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body7.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(110, 142).addBox(-1.1365F, -4.6339F, -1.4351F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -1.1046F, 4.0295F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r201 = body7.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(125, 111).addBox(-1.6365F, -2.1132F, -1.6046F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1365F, -1.1046F, 10.0295F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body7.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(126, 9).addBox(-1.601F, -1.5526F, -3.1726F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -1.1046F, 10.0295F, -0.7061F, 0.0207F, 0.9383F));

		PartDefinition cube_r203 = body7.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(22, 122).addBox(0.0794F, -0.9665F, -1.9493F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1365F, -3.0046F, 16.4295F, -0.7579F, 0.0911F, 0.9354F));

		PartDefinition cube_r204 = body7.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(91, 125).addBox(-1.0682F, 1.0937F, -1.3708F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5683F, -3.8411F, 17.657F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body7.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(143, 16).addBox(-0.5683F, -1.331F, -1.2174F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5683F, -3.8411F, 17.657F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body7.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(91, 119).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.691F, 16.7648F, 0.0726F, 0.1942F, 0.5374F));

		PartDefinition cube_r207 = body7.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(121, 71).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.691F, 10.1648F, 0.0726F, 0.1942F, 0.5374F));

		PartDefinition cube_r208 = body7.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(91, 122).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.691F, 3.1648F, 0.0751F, 0.3247F, 0.5474F));

		PartDefinition hips = body7.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3079F, 20.9047F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r209 = hips.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(157, 139).addBox(-0.4694F, 2.0103F, 4.559F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3523F, 0.2279F, -0.118F, 0.0F, 0.2094F, 0.8465F));

		PartDefinition cube_r210 = hips.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(150, 29).mirror().addBox(-1.4572F, -0.3097F, -0.5405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.5353F, 10.5179F, 11.7976F, -1.4312F, 0.2948F, -0.7686F));

		PartDefinition cube_r211 = hips.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(157, 50).mirror().addBox(0.75F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(151, 68).mirror().addBox(-0.65F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7796F, 12.8063F, 12.4998F, -1.7552F, 0.6351F, -1.3625F));

		PartDefinition cube_r212 = hips.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(47, 157).mirror().addBox(-0.15F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.6689F, 12.966F, 13.5392F, -2.1516F, 1.2984F, -1.816F));

		PartDefinition cube_r213 = hips.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(144, 9).mirror().addBox(-1.9F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.8698F, 11.6477F, 12.8822F, -1.7447F, 0.5492F, -1.3438F));

		PartDefinition cube_r214 = hips.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(149, 90).mirror().addBox(-1.3572F, -0.5097F, -0.5405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5353F, 10.5179F, 11.7976F, -1.4136F, 0.5538F, -0.7263F));

		PartDefinition cube_r215 = hips.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(5, 159).mirror().addBox(0.0353F, -0.4448F, -0.7295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false), PartPose.offsetAndRotation(-0.5353F, 10.5179F, 11.7976F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r216 = hips.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(157, 50).addBox(-1.75F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(151, 68).addBox(-1.35F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7796F, 12.8063F, 12.4998F, -1.7552F, -0.6351F, 1.3625F));

		PartDefinition cube_r217 = hips.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(47, 157).addBox(-0.85F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.6689F, 12.966F, 13.5392F, -2.1516F, -1.2984F, 1.816F));

		PartDefinition cube_r218 = hips.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(144, 9).addBox(-1.1F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.8698F, 11.6477F, 12.8822F, -1.7447F, -0.5492F, 1.3438F));

		PartDefinition cube_r219 = hips.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(150, 29).addBox(-0.5428F, -0.3097F, -0.5405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.5353F, 10.5179F, 11.7976F, -1.4312F, -0.2948F, 0.7686F));

		PartDefinition cube_r220 = hips.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(149, 90).addBox(-0.6428F, -0.5097F, -0.5405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5353F, 10.5179F, 11.7976F, -1.4136F, -0.5538F, 0.7263F));

		PartDefinition cube_r221 = hips.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(79, 138).addBox(0.0F, -2.3998F, -1.0122F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2221F, 4.3017F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r222 = hips.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(71, 125).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.438F, 4.0243F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r223 = hips.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(9, 121).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 8.4831F, 15.7601F, -0.2844F, -0.6747F, -0.6085F));

		PartDefinition cube_r224 = hips.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(117, 119).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 5.0831F, 9.2601F, -0.2844F, -0.6747F, -0.6085F));

		PartDefinition cube_r225 = hips.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(104, 119).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 1.8831F, 2.7601F, -0.4359F, -0.5973F, -0.3546F));

		PartDefinition cube_r226 = hips.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(60, 130).mirror().addBox(0.181F, -1.5039F, -2.4042F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7365F, -1.894F, 3.2648F, -1.2253F, -0.4014F, -0.8736F));

		PartDefinition cube_r227 = hips.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(40, 132).mirror().addBox(-0.497F, -0.9633F, -2.1458F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4155F, 0.7777F, 10.1534F, -0.789F, -0.4014F, -0.8736F));

		PartDefinition cube_r228 = hips.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(51, 125).mirror().addBox(-0.0903F, -0.912F, -2.4651F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3493F, 4.3407F, 16.957F, -1.0944F, -0.4014F, -0.8736F));

		PartDefinition cube_r229 = hips.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(60, 130).addBox(-0.181F, -1.5039F, -2.4042F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7365F, -1.894F, 3.2648F, -1.2253F, 0.4014F, 0.8736F));

		PartDefinition cube_r230 = hips.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(40, 132).addBox(0.497F, -0.9633F, -2.1458F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4155F, 0.7777F, 10.1534F, -0.789F, 0.4014F, 0.8736F));

		PartDefinition cube_r231 = hips.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(49, 132).addBox(-0.8494F, -1.9073F, -1.9088F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 144).addBox(-0.3493F, -3.6099F, -1.7551F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3493F, 3.5407F, 10.457F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r232 = hips.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(143, 2).addBox(-0.3493F, -1.6265F, -0.2332F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3493F, 4.3407F, 16.957F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r233 = hips.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(9, 121).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 8.4831F, 15.7601F, -0.2844F, 0.6747F, 0.6085F));

		PartDefinition cube_r234 = hips.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(117, 119).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 5.0831F, 9.2601F, -0.2844F, 0.6747F, 0.6085F));

		PartDefinition cube_r235 = hips.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(104, 119).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 1.8831F, 2.7601F, -0.4359F, 0.5973F, 0.3546F));

		PartDefinition cube_r236 = hips.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(142, 122).addBox(-0.8494F, 0.3585F, -0.4522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3493F, 4.3407F, 16.957F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r237 = hips.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(51, 125).addBox(0.0903F, -0.912F, -2.4651F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3493F, 4.3407F, 16.957F, -1.0944F, 0.4014F, 0.8736F));

		PartDefinition cube_r238 = hips.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -0.0986F, 0.0389F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(49, 0).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F))
				.texOffs(16, 160).addBox(0.0F, -2.8319F, 9.9126F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 138).addBox(-0.5F, -2.0319F, 9.2126F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 125).addBox(-0.5F, -2.0319F, 1.7126F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 8.3762F, 19.5943F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r239 = tail.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(157, 39).addBox(-1.1045F, 0.9245F, 1.3841F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 127).addBox(-0.8982F, 0.0975F, -0.3518F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7634F, 1.1092F, 1.2829F, 0.4435F, 0.0363F, 0.7627F));

		PartDefinition cube_r240 = tail.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(65, 138).addBox(-1.0F, -1.81F, -1.8594F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(139, 159).addBox(-0.5F, -2.5106F, -0.9485F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3221F, 18.1785F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r241 = tail.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(121, 34).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1555F, 1.652F, 17.2679F, 0.0286F, 0.0104F, -0.9134F));

		PartDefinition cube_r242 = tail.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(121, 23).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1555F, 1.652F, 10.2679F, 0.0286F, 0.0104F, -0.9134F));

		PartDefinition cube_r243 = tail.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(121, 20).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1555F, 1.852F, 3.0679F, 0.0293F, -0.2076F, -0.9198F));

		PartDefinition cube_r244 = tail.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(0.9433F, -0.9289F, -4.6171F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5221F, 3.7785F, -0.683F, -0.1195F, -0.9973F));

		PartDefinition cube_r245 = tail.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(124, 122).mirror().addBox(0.9433F, -0.9289F, -4.6171F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2221F, 10.7785F, -0.683F, -0.1195F, -0.9973F));

		PartDefinition cube_r246 = tail.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(124, 97).mirror().addBox(1.0486F, -0.5223F, -4.2799F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3221F, 18.1785F, -0.707F, -0.1561F, -0.994F));

		PartDefinition cube_r247 = tail.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(124, 97).addBox(-1.0486F, -0.5223F, -4.2799F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3221F, 18.1785F, -0.707F, 0.1561F, 0.994F));

		PartDefinition cube_r248 = tail.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 125).addBox(-0.9433F, -0.9289F, -4.6171F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5221F, 3.7785F, -0.683F, 0.1195F, 0.9973F));

		PartDefinition cube_r249 = tail.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(147, 150).addBox(0.0F, -0.5F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9319F, 3.9126F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r250 = tail.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(124, 122).addBox(-0.9433F, -0.9289F, -4.6171F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2221F, 10.7785F, -0.683F, 0.1195F, 0.9973F));

		PartDefinition cube_r251 = tail.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(121, 34).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1555F, 1.652F, 17.2679F, 0.0286F, -0.0104F, 0.9134F));

		PartDefinition cube_r252 = tail.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(121, 23).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1555F, 1.652F, 10.2679F, 0.0286F, -0.0104F, 0.9134F));

		PartDefinition cube_r253 = tail.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(121, 20).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1555F, 1.852F, 3.0679F, 0.0293F, 0.2076F, 0.9198F));

		PartDefinition cube_r254 = tail.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(136, 159).addBox(0.0F, 2.6F, 13.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 142).addBox(0.0F, 0.7F, 6.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 136).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, 7.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 21.0F, new CubeDeformation(0.008F))
				.texOffs(134, 3).addBox(-0.5F, -1.9999F, 15.9939F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0439F, 21.584F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r255 = tail2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(9, 138).addBox(-0.5F, -1.5986F, -0.8235F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0F, 2.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r256 = tail2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(130, 16).mirror().addBox(-1.9F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1555F, 1.6741F, 16.9894F, 0.0288F, 0.0977F, -0.9109F));

		PartDefinition cube_r257 = tail2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(128, 26).mirror().addBox(-2.2F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1555F, 1.6741F, 9.9894F, 0.0288F, 0.0977F, -0.9109F));

		PartDefinition cube_r258 = tail2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(-2.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1555F, 1.6741F, 2.7894F, 0.0288F, 0.0977F, -0.9109F));

		PartDefinition cube_r259 = tail2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(9, 124).mirror().addBox(-0.1F, -0.1F, -3.6F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8F, 3.3F, -0.8185F, -0.1927F, -0.9898F));

		PartDefinition cube_r260 = tail2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(58, 137).mirror().addBox(-0.1F, 0.3F, -3.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8F, 10.9F, -0.8185F, -0.1927F, -0.9898F));

		PartDefinition cube_r261 = tail2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(136, 134).mirror().addBox(-0.1F, 0.7F, -3.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8F, 18.5F, -1.1239F, -0.1927F, -0.9898F));

		PartDefinition cube_r262 = tail2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(9, 124).addBox(0.1F, -0.1F, -3.6F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8F, 3.3F, -0.8185F, 0.1927F, 0.9898F));

		PartDefinition cube_r263 = tail2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(58, 137).addBox(0.1F, 0.3F, -3.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8F, 10.9F, -0.8185F, 0.1927F, 0.9898F));

		PartDefinition cube_r264 = tail2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(62, 123).addBox(-0.5F, -1.1986F, -1.3235F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0F, 9.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r265 = tail2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(136, 134).addBox(0.1F, 0.7F, -3.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8F, 18.5F, -1.1239F, 0.1927F, 0.9898F));

		PartDefinition cube_r266 = tail2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(130, 16).addBox(-2.1F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1555F, 1.6741F, 16.9894F, 0.0288F, -0.0977F, 0.9109F));

		PartDefinition cube_r267 = tail2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(124, 159).addBox(0.0F, 1.4F, 12.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 158).addBox(0.0F, 0.1F, 6.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 158).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1907F, 7.1966F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r268 = tail2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(128, 26).addBox(-1.8F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1555F, 1.6741F, 9.9894F, 0.0288F, -0.0977F, 0.9109F));

		PartDefinition cube_r269 = tail2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(125, 0).addBox(-1.5F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1555F, 1.6741F, 2.7894F, 0.0288F, -0.0977F, 0.9109F));

		PartDefinition tail4 = tail2.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(92, 74).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 20.0F, new CubeDeformation(0.008F))
				.texOffs(12, 147).addBox(0.0F, -2.1255F, 15.3001F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(17, 147).addBox(0.0F, -2.3255F, 8.3001F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(147, 52).addBox(0.0F, -2.3255F, 1.8001F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0914F, 20.4248F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r270 = tail4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(143, 140).mirror().addBox(-1.5F, -0.2F, 6.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(135, 80).mirror().addBox(-1.5F, -0.2F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3554F, 1.7074F, 2.9777F, 0.0288F, 0.0977F, -0.9109F));

		PartDefinition cube_r271 = tail4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(127, 142).mirror().addBox(0.8116F, -3.1401F, -0.6773F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4096F, -0.3387F, 2.3001F, 0.652F, -0.0985F, -0.881F));

		PartDefinition cube_r272 = tail4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(28, 147).mirror().addBox(0.8116F, -2.5401F, -1.0773F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4096F, -0.3387F, 8.8001F, 0.3653F, -0.2957F, -0.9763F));

		PartDefinition cube_r273 = tail4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(137, 146).mirror().addBox(0.5116F, -2.5401F, -1.0773F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4096F, -0.3387F, 15.8001F, 0.3653F, -0.2957F, -0.9763F));

		PartDefinition cube_r274 = tail4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(127, 142).addBox(-0.8116F, -3.1401F, -0.6773F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4096F, -0.3387F, 2.3001F, 0.652F, 0.0985F, 0.881F));

		PartDefinition cube_r275 = tail4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(28, 147).addBox(-0.8116F, -2.5401F, -1.0773F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4096F, -0.3387F, 8.8001F, 0.3653F, 0.2957F, 0.9763F));

		PartDefinition cube_r276 = tail4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(143, 140).addBox(-0.5F, -0.2F, 6.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(135, 80).addBox(-1.5F, -0.2F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3554F, 1.7074F, 2.9777F, 0.0288F, -0.0977F, 0.9109F));

		PartDefinition cube_r277 = tail4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(151, 159).addBox(0.0F, 5.4F, 32.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(148, 159).addBox(0.0F, 4.6F, 26.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 159).addBox(0.0F, 2.6F, 19.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.224F, -13.815F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r278 = tail4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(137, 146).addBox(-0.5116F, -2.5401F, -1.0773F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4096F, -0.3387F, 15.8001F, 0.3653F, 0.2957F, 0.9763F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(47, 97).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 17.0F, new CubeDeformation(0.008F))
				.texOffs(142, 150).addBox(0.0F, -1.9F, 12.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(150, 143).addBox(0.0F, -2.1F, 7.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(132, 146).addBox(0.0F, -2.3F, 1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2599F, 19.4295F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r279 = tail5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(86, 159).mirror().addBox(0.4F, -1.6F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4096F, -0.5132F, 1.5F, 0.6816F, -0.2731F, -1.0151F));

		PartDefinition cube_r280 = tail5.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(86, 159).addBox(-0.4F, -1.6F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4096F, -0.5132F, 1.5F, 0.6816F, 0.2731F, 1.0151F));

		PartDefinition cube_r281 = tail5.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(10, 160).addBox(0.0F, 7.9F, 49.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 160).addBox(0.0F, 7.3F, 44.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 159).addBox(0.0F, 6.4F, 38.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1495F, -33.8151F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.008F))
				.texOffs(68, 151).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0813F, 16.7059F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r282 = tail6.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(12, 153).addBox(0.0F, -0.6F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(150, 132).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r283 = tail6.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(13, 160).addBox(0.0F, 8.6F, 53.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1228F, -50.816F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(98, 11).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0837F, 12.2275F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9707F, 11.3428F, 12.0946F, 0.5205F, -0.2186F, -0.3126F));

		PartDefinition cube_r284 = leftLeg.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(125, 155).addBox(-0.5F, -0.575F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.142F, 2.3064F, -0.6999F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftLeg.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(157, 53).addBox(-0.358F, -1.4466F, 11.017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 112).addBox(-0.358F, -3.0466F, 11.017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.1154F, -11.7023F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7879F, -0.2757F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftLeg2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(74, 150).addBox(-0.358F, 7.5289F, 6.1574F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -9.2745F, -4.6999F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2527F, 2.2178F, -0.5534F, 1.8691F, 0.6581F, -1.4535F));

		PartDefinition cube_r287 = leftLeg3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(36, 135).addBox(-11.7739F, -3.0013F, -2.2923F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.8F, 1.3414F, 1.4937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9707F, 11.3428F, 12.0946F, 0.5205F, 0.2186F, 0.3126F));

		PartDefinition cube_r288 = rightLeg.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(125, 155).mirror().addBox(-0.5F, -0.575F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.142F, 2.3064F, -0.6999F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightLeg.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(157, 53).mirror().addBox(-0.642F, -1.4466F, 11.017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 112).mirror().addBox(-0.642F, -3.0466F, 11.017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1154F, -11.7023F, -0.3316F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7879F, -0.2757F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightLeg2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(74, 150).mirror().addBox(-0.642F, 7.5289F, 6.1574F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.2745F, -4.6999F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2527F, 2.2178F, -0.5534F, 1.8691F, -0.6581F, 1.4535F));

		PartDefinition cube_r291 = rightLeg3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(36, 135).mirror().addBox(11.7739F, -3.0013F, -2.2923F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8F, 1.3414F, 1.4937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2641F, 4.3025F, -2.1153F, 0.5264F, 0.5313F, -0.78F));

		PartDefinition cube_r292 = leftarm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(22, 155).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0042F, 4.2812F, 2.2583F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r293 = leftarm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(63, 151).addBox(-0.5F, -2.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0042F, 4.2812F, 2.2583F, 0.7591F, 0.0014F, -0.001F));

		PartDefinition cube_r294 = leftarm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(151, 58).addBox(0.0F, 0.6F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.2961F, -0.0244F, 0.541F, 0.0014F, -0.001F));

		PartDefinition cube_r295 = leftarm.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(42, 145).addBox(0.0F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.2961F, -0.0244F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r296 = leftarm.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(84, 150).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0046F, 4.2775F, 1.9697F, 0.4013F, 0.0014F, -0.001F));

		PartDefinition cube_r297 = leftarm.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(42, 98).addBox(-0.0109F, 0.0254F, 0.0689F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0014F)), PartPose.offsetAndRotation(-0.5014F, 1.0619F, -1.2638F, 0.6631F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2846F, 7.3194F, 3.4896F, -0.3488F, 0.0149F, 0.041F));

		PartDefinition cube_r298 = leftarm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(74, 144).addBox(-0.6F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1764F, 2.1155F, 1.4117F, 1.5708F, -1.2479F, -1.5708F));

		PartDefinition cube_r299 = leftarm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(137, 152).addBox(-0.2F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1764F, 1.1732F, 0.8099F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition cube_r300 = leftarm2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(152, 137).addBox(-0.2F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1764F, -0.617F, 1.4424F, -1.5708F, -0.4276F, 1.5708F));

		PartDefinition cube_r301 = leftarm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(98, 150).addBox(-0.7F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -0.617F, 1.4424F, -1.5708F, -0.8639F, 1.5708F));

		PartDefinition cube_r302 = leftarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(20, 159).addBox(0.0F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1764F, 1.9872F, -0.6943F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition cube_r303 = leftarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(142, 155).addBox(-0.1F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1764F, 1.9872F, -0.6943F, -1.5708F, -1.5621F, 1.5708F));

		PartDefinition cube_r304 = leftarm2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(151, 101).addBox(-0.4F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1764F, 2.8948F, -0.0041F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 4.6294F, 1.1607F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftArm3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 113).addBox(0.0F, -2.0F, -2.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2641F, 4.3025F, -2.1153F, 0.1931F, -0.4164F, 0.4614F));

		PartDefinition cube_r306 = rightarm.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(22, 155).mirror().addBox(-0.5F, 0.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0042F, 4.2812F, 2.2583F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r307 = rightarm.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(63, 151).mirror().addBox(-0.5F, -2.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0042F, 4.2812F, 2.2583F, 0.7591F, -0.0014F, 0.001F));

		PartDefinition cube_r308 = rightarm.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(151, 58).mirror().addBox(-1.0F, 0.6F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5118F, -0.2961F, -0.0244F, 0.541F, -0.0014F, 0.001F));

		PartDefinition cube_r309 = rightarm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(42, 145).mirror().addBox(-1.0F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5118F, -0.2961F, -0.0244F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r310 = rightarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(84, 150).mirror().addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0046F, 4.2775F, 1.9697F, 0.4013F, -0.0014F, 0.001F));

		PartDefinition cube_r311 = rightarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-0.9891F, 0.0254F, 0.0689F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0014F)).mirror(false), PartPose.offsetAndRotation(0.5014F, 1.0619F, -1.2638F, 0.6631F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2846F, 7.3194F, 3.4896F, -0.7268F, 0.103F, 0.288F));

		PartDefinition cube_r312 = rightarm2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(74, 144).mirror().addBox(-0.4F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 2.1155F, 1.4117F, 1.5708F, 1.2479F, 1.5708F));

		PartDefinition cube_r313 = rightarm2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(137, 152).mirror().addBox(-0.8F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 1.1732F, 0.8099F, 1.5708F, 1.4661F, 1.5708F));

		PartDefinition cube_r314 = rightarm2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(152, 137).mirror().addBox(-0.8F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.617F, 1.4424F, -1.5708F, 0.4276F, -1.5708F));

		PartDefinition cube_r315 = rightarm2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(98, 150).mirror().addBox(-0.3F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.617F, 1.4424F, -1.5708F, 0.8639F, -1.5708F));

		PartDefinition cube_r316 = rightarm2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(20, 159).mirror().addBox(-1.0F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 1.9872F, -0.6943F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition cube_r317 = rightarm2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(142, 155).mirror().addBox(-0.9F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 1.9872F, -0.6943F, -1.5708F, 1.5621F, -1.5708F));

		PartDefinition cube_r318 = rightarm2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(151, 101).mirror().addBox(-0.6F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 2.8948F, -0.0041F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 4.6294F, 1.1607F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightArm3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(0.0F, -2.0F, -2.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, -3.1416F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4848F, 1.3397F, -3.1969F, 0.6108F, -0.0858F, 0.0465F));

		PartDefinition cube_r320 = bone.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(115, 122).addBox(-0.348F, -2.5954F, -2.1551F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2942F, 0.1502F, -0.562F));

		PartDefinition cube_r321 = bone.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(151, 63).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2424F, -0.7596F, 3.0146F, -1.6433F, 0.1502F, -0.562F));

		PartDefinition cube_r322 = bone.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(152, 152).addBox(-0.5F, -1.075F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9861F, -0.1101F, 4.8867F, 0.3901F, 0.1502F, -0.562F));

		PartDefinition cube_r323 = bone.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(142, 88).addBox(-0.348F, 0.1921F, 2.3278F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6082F, 0.1502F, -0.562F));

		PartDefinition cube_r324 = bone.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(144, 83).addBox(-0.5F, -0.85F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8712F, -2.2987F, 2.2076F, 0.8788F, 0.1502F, -0.562F));

		PartDefinition cube_r325 = bone.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(135, 42).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.117F, 0.8233F, -3.2611F, 0.1102F, -0.1101F, -0.5908F));

		PartDefinition cube_r326 = bone.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(107, 136).addBox(-0.348F, -2.6052F, -2.1772F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1415F, 1.9446F, -0.4644F, -0.4564F, 0.1502F, -0.562F));

		PartDefinition cube_r327 = bone.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(52, 156).addBox(-0.348F, 1.147F, -2.3771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 56).addBox(-0.348F, 1.147F, -2.7771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2243F, 0.1502F, -0.562F));

		PartDefinition cube_r328 = bone.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(114, 111).addBox(-0.5F, -1.425F, -2.375F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.298F, -2.362F, 0.0431F, 1.1667F, 0.1502F, -0.562F));

		PartDefinition cube_r329 = bone.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(28, 142).addBox(-0.5F, -0.675F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.2852F, -2.8746F, -3.6724F, 1.7776F, 0.1502F, -0.562F));

		PartDefinition cube_r330 = bone.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(16, 142).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1791F, -0.0806F, -1.734F, 2.2139F, 0.1502F, -0.562F));

		PartDefinition cube_r331 = bone.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(142, 47).addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.4803F, -1.7784F, -3.0317F, 2.083F, 0.1502F, -0.562F));

		PartDefinition cube_r332 = bone.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(132, 152).addBox(-0.5F, -0.45F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.981F, -2.3706F, -3.7466F, 1.7776F, 0.1502F, -0.562F));

		PartDefinition cube_r333 = bone.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(115, 11).addBox(-0.5F, -0.95F, -1.925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5942F, -2.2991F, -1.8352F, 1.4722F, 0.1502F, -0.562F));

		PartDefinition cube_r334 = bone.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(119, 37).addBox(-0.9F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.488F, -0.6058F, -1.5046F, 1.5668F, -0.2678F, -0.6318F));

		PartDefinition cube_r335 = bone.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(49, 145).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.71F, 1.4227F, -2.0563F, 0.8526F, 0.1502F, -0.562F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4848F, 1.3397F, -3.1969F, 0.6108F, 0.0858F, -0.0465F));

		PartDefinition cube_r336 = bone2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(115, 122).mirror().addBox(-0.652F, -2.5954F, -2.1551F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2942F, -0.1502F, 0.562F));

		PartDefinition cube_r337 = bone2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(151, 63).mirror().addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2424F, -0.7596F, 3.0146F, -1.6433F, -0.1502F, 0.562F));

		PartDefinition cube_r338 = bone2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(152, 152).mirror().addBox(-0.5F, -1.075F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9861F, -0.1101F, 4.8867F, 0.3901F, -0.1502F, 0.562F));

		PartDefinition cube_r339 = bone2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(142, 88).mirror().addBox(-0.652F, 0.1921F, 2.3278F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6082F, -0.1502F, 0.562F));

		PartDefinition cube_r340 = bone2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(144, 83).mirror().addBox(-0.5F, -0.85F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.8712F, -2.2987F, 2.2076F, 0.8788F, -0.1502F, 0.562F));

		PartDefinition cube_r341 = bone2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(135, 42).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.117F, 0.8233F, -3.2611F, 0.1102F, 0.1101F, 0.5908F));

		PartDefinition cube_r342 = bone2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(107, 136).mirror().addBox(-0.652F, -2.6052F, -2.1772F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1415F, 1.9446F, -0.4644F, -0.4564F, -0.1502F, 0.562F));

		PartDefinition cube_r343 = bone2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(52, 156).mirror().addBox(-0.652F, 1.147F, -2.3771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(156, 56).mirror().addBox(-0.652F, 1.147F, -2.7771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2243F, -0.1502F, 0.562F));

		PartDefinition cube_r344 = bone2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(114, 111).mirror().addBox(-0.5F, -1.425F, -2.375F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.298F, -2.362F, 0.0431F, 1.1667F, -0.1502F, 0.562F));

		PartDefinition cube_r345 = bone2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(28, 142).mirror().addBox(-0.5F, -0.675F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.2852F, -2.8746F, -3.6724F, 1.7776F, -0.1502F, 0.562F));

		PartDefinition cube_r346 = bone2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(16, 142).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1791F, -0.0806F, -1.734F, 2.2139F, -0.1502F, 0.562F));

		PartDefinition cube_r347 = bone2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(142, 47).mirror().addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.4803F, -1.7784F, -3.0317F, 2.083F, -0.1502F, 0.562F));

		PartDefinition cube_r348 = bone2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(132, 152).mirror().addBox(-0.5F, -0.45F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.981F, -2.3706F, -3.7466F, 1.7776F, -0.1502F, 0.562F));

		PartDefinition cube_r349 = bone2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(115, 11).mirror().addBox(-0.5F, -0.95F, -1.925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5942F, -2.2991F, -1.8352F, 1.4722F, -0.1502F, 0.562F));

		PartDefinition cube_r350 = bone2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(119, 37).mirror().addBox(-0.1F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.488F, -0.6058F, -1.5046F, 1.5668F, 0.2678F, 0.6318F));

		PartDefinition cube_r351 = bone2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(49, 145).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.71F, 1.4227F, -2.0563F, 0.8526F, -0.1502F, 0.562F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0884F, -5.8334F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r352 = neck2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(159, 80).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8159F, -2.0207F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r353 = neck2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(89, 132).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.2131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2919F, -2.6204F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r354 = neck.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(151, 86).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0575F, -0.9501F, -0.2358F, 0.615F, -0.1378F));

		PartDefinition cube_r355 = neck.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(151, 86).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0575F, -0.9501F, -0.2358F, -0.615F, 0.1378F));

		PartDefinition cube_r356 = neck.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(145, 159).addBox(0.0F, -1.7F, 2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 132).addBox(-0.5F, -1.1F, 1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(133, 122).addBox(-0.5F, -1.0F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(143, 137).addBox(-2.0F, -1.0F, -1.9F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3695F, -2.7993F, 0.0065F, -0.1718F, -0.0377F));

		PartDefinition cube_r357 = neck3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(43, 139).addBox(0.0F, -2.1F, -0.4F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r358 = neck3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(156, 80).mirror().addBox(-0.3184F, -4.7653F, 0.2015F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4426F, 8.2685F, -2.2172F, -0.3608F, -0.1343F, -0.3652F));

		PartDefinition cube_r359 = neck3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(127, 159).mirror().addBox(0.1874F, -2.1197F, -0.9138F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4426F, 8.2685F, -2.2172F, -0.836F, -0.2271F, -0.633F));

		PartDefinition cube_r360 = neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(83, 159).mirror().addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.0195F, -3.8692F, -1.1214F, -0.3897F, -0.7006F));

		PartDefinition cube_r361 = neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(18, 124).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.0195F, -3.8692F, -0.5413F, -0.3526F, -0.6159F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(130, 159).mirror().addBox(-0.01F, -2.0467F, -1.0293F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3591F, 6.5658F, -1.9986F, -0.2795F, -0.3526F, -0.3104F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(111, 156).mirror().addBox(-0.5909F, -4.8408F, -0.3275F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3591F, 6.5658F, -1.9986F, -0.0444F, -0.3565F, 0.0154F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(156, 80).addBox(0.3184F, -4.7653F, 0.2015F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4426F, 8.2685F, -2.2172F, -0.3608F, 0.1343F, 0.3652F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(127, 159).addBox(-0.1874F, -2.1197F, -0.9138F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4426F, 8.2685F, -2.2172F, -0.836F, 0.2271F, 0.633F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(83, 159).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.0195F, -3.8692F, -1.1214F, 0.3897F, 0.7006F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(111, 156).addBox(0.5909F, -4.8408F, -0.3275F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3591F, 6.5658F, -1.9986F, -0.0444F, 0.3565F, -0.0154F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(130, 159).addBox(0.01F, -2.0467F, -1.0293F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3591F, 6.5658F, -1.9986F, -0.2795F, 0.3526F, 0.3104F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(18, 124).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.0195F, -3.8692F, -0.5413F, 0.3526F, 0.6159F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(25, 160).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0195F, -3.8692F, 0.0F, 0.5672F, 1.5708F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0049F, -3.8256F, -0.4359F, -0.0266F, -0.0346F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(145, 43).addBox(-0.5F, -0.225F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.1338F, -9.4324F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(145, 43).addBox(-0.5F, -0.65F, -1.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.4374F, -8.4701F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(144, 42).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.8772F, -8.5466F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(105, 149).addBox(-0.9F, 0.0325F, -0.2471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 4.9576F, -8.6204F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(129, 129).addBox(-1.0F, 0.375F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F))
				.texOffs(118, 129).addBox(-1.0F, -0.175F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 9.6645F, -11.985F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(123, 4).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 9.7624F, -10.5016F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(130, 37).addBox(-1.4F, -1.3721F, -0.1873F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4F, 9.1569F, -9.2763F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(130, 29).addBox(-1.4F, -0.7971F, -0.1873F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4F, 9.1569F, -9.2763F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(104, 122).addBox(-1.4F, 0.0279F, -6.4873F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4F, 4.2548F, -6.5033F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(98, 146).addBox(-1.0F, -1.5F, -0.475F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.2676F, -8.1456F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(62, 117).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.6224F, -3.9827F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(113, 105).addBox(-1.0F, 0.4F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.5965F, -3.0928F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(99, 112).addBox(-1.5F, -1.7F, -4.3F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.5557F, 1.3852F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(27, 98).addBox(-1.4F, -2.0221F, 0.0127F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 7.3425F, -7.4753F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(143, 143).addBox(-0.5F, 0.0109F, 0.0248F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.4583F, -7.7618F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(113, 97).addBox(-0.5F, -0.1141F, -3.9752F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0334F, -4.2869F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(42, 108).addBox(0.5F, -0.0075F, -1.0172F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7968F, -2.9346F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(141, 117).addBox(0.0F, -0.0075F, -0.0171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.1166F, -4.3302F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(54, 152).addBox(0.0F, -0.6F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.7F, -2.5F, 0.8203F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.2F, 0.4933F, -1.5002F));

		PartDefinition cube_r390 = leftOrbit.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(135, 9).addBox(-0.5F, -0.8847F, -1.5324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1546F, -0.8467F, 2.4566F, 1.5542F, -0.928F, -1.471F));

		PartDefinition cube_r391 = leftOrbit.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(98, 134).addBox(-0.5F, -0.6149F, -1.5281F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1546F, -0.8467F, 2.4566F, 1.7113F, -0.928F, -1.471F));

		PartDefinition cube_r392 = leftOrbit.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(84, 144).addBox(-0.578F, -0.4018F, -0.7815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.2647F, 1.0176F, 1.0267F, 0.6074F, 0.0566F, 0.0846F));

		PartDefinition cube_r393 = leftOrbit.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(156, 47).addBox(-0.578F, -0.2611F, -0.6742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.2647F, 1.0176F, 1.0267F, -0.6231F, 0.0566F, 0.0846F));

		PartDefinition cube_r394 = leftOrbit.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(155, 145).addBox(-0.578F, -0.7355F, -0.6588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.2647F, 1.0176F, 1.0267F, -1.1467F, 0.0566F, 0.0846F));

		PartDefinition cube_r395 = leftOrbit.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(141, 37).addBox(-0.4502F, -1.101F, -0.7796F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.7918F, 5.8337F, -6.9437F, 0.986F, -0.1904F, -0.1807F));

		PartDefinition cube_r396 = leftOrbit.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(120, 149).addBox(-0.6891F, 0.884F, -1.7434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6337F, -1.418F, 2.3571F, 0.5566F, 0.0415F, 0.072F));

		PartDefinition cube_r397 = leftOrbit.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 145).addBox(-0.3F, -2.7435F, -4.8445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8F, 3.0948F, -4.9403F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r398 = leftOrbit.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(145, 33).addBox(-0.5051F, -0.5961F, -0.973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3435F, -0.0783F, 2.2674F, 0.9225F, 0.0215F, 0.0803F));

		PartDefinition cube_r399 = leftOrbit.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(35, 145).addBox(-0.578F, -0.4786F, -0.7548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2647F, 1.0176F, 1.0267F, 0.7121F, 0.0566F, 0.0846F));

		PartDefinition cube_r400 = leftOrbit.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(141, 25).addBox(-0.5F, -0.2F, -1.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3003F, -2.6888F, 1.9974F, -0.0683F, 0.3383F, 0.2685F));

		PartDefinition cube_r401 = leftOrbit.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(144, 101).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3003F, -2.6888F, 1.9974F, 0.4116F, 0.3383F, 0.2685F));

		PartDefinition cube_r402 = leftOrbit.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(91, 144).addBox(0.175F, -0.6F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1657F, -3.1472F, 1.3143F, 0.9352F, 0.3383F, 0.2685F));

		PartDefinition cube_r403 = leftOrbit.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(115, 142).addBox(0.3F, -0.3F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -3.9887F, 0.1694F, 1.9427F, 0.2748F, 0.2432F));

		PartDefinition cube_r404 = leftOrbit.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(18, 136).addBox(-0.1F, 0.0F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.7F, -3.7246F, -0.3178F, 1.1411F, 0.7393F, 0.8444F));

		PartDefinition cube_r405 = leftOrbit.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(157, 119).addBox(0.025F, 2.1936F, -3.2968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0204F, -0.0103F, -0.7757F, -0.2175F, 0.2459F, -0.0606F));

		PartDefinition cube_r406 = leftOrbit.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(28, 160).addBox(-0.0353F, -1.3837F, -3.6821F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2368F, 2.5313F, -1.1252F, 0.977F, 0.2833F, 0.2355F));

		PartDefinition cube_r407 = leftOrbit.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(130, 156).addBox(-0.5F, 0.2589F, -2.059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(156, 129).addBox(-0.5F, -0.0833F, -0.8471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(156, 126).addBox(-0.5F, -0.1833F, -0.8471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.55F, 5.8077F, -4.1311F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r408 = leftOrbit.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(158, 6).addBox(-0.5F, 1.5065F, -1.7395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(158, 9).addBox(-0.5F, 1.4565F, -2.1395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(158, 3).addBox(-0.5F, 0.8244F, -0.7916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(158, 0).addBox(-0.5F, 0.8244F, -1.2916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(157, 157).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.55F, 5.443F, -3.781F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r409 = leftOrbit.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(157, 24).addBox(-0.5F, 0.5858F, -0.5049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(33, 149).addBox(-0.5F, -0.4506F, -1.2078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.55F, 6.2258F, -5.1661F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r410 = leftOrbit.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(27, 157).addBox(-0.5F, -0.6602F, -1.7984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(156, 101).addBox(-0.5F, -0.6026F, -0.4999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.55F, 5.8795F, -4.5278F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r411 = leftOrbit.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(73, 155).addBox(-0.5F, -1.5048F, -0.5498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.55F, 6.3696F, -4.5831F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r412 = leftOrbit.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(5, 156).addBox(-0.5F, -0.3925F, -0.4502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6F, 5.1664F, -4.2654F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r413 = leftOrbit.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(156, 90).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6F, 5.04F, -3.8918F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r414 = leftOrbit.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(113, 42).addBox(-0.3867F, -0.4985F, -4.9716F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1742F, 3.3693F, -2.846F, 0.7074F, 0.3502F, 0.2946F));

		PartDefinition cube_r415 = leftOrbit.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(157, 116).addBox(-0.6991F, -0.5413F, -0.6313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-1.6424F, 12.2783F, -11.6063F, 0.2867F, 0.0305F, -0.0818F));

		PartDefinition cube_r416 = leftOrbit.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(10, 157).addBox(-0.6991F, -1.035F, -0.677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.6424F, 12.2783F, -11.6063F, 0.1122F, 0.0305F, -0.0818F));

		PartDefinition cube_r417 = leftOrbit.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(114, 157).addBox(-0.6988F, -0.2586F, -0.6011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-1.6424F, 11.3906F, -10.4283F, 0.6352F, 0.0566F, -0.0664F));

		PartDefinition cube_r418 = leftOrbit.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(0, 157).addBox(-0.6988F, -0.7618F, -0.5982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.6424F, 11.3906F, -10.4283F, 0.4606F, 0.0566F, -0.0664F));

		PartDefinition cube_r419 = leftOrbit.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(102, 157).addBox(-0.5096F, -0.1273F, -0.5949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-1.6424F, 10.2978F, -9.1858F, 0.8097F, 0.0673F, -0.0556F));

		PartDefinition cube_r420 = leftOrbit.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(152, 156).addBox(-0.5096F, -0.6335F, -0.5693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.6424F, 10.2978F, -9.1858F, 0.6352F, 0.0673F, -0.0556F));

		PartDefinition cube_r421 = leftOrbit.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(135, 156).addBox(-0.5F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-1.6161F, 9.3001F, -7.5138F, 0.6788F, 0.0595F, -0.0639F));

		PartDefinition cube_r422 = leftOrbit.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(62, 156).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.6584F, 8.9345F, -7.8303F, 0.5042F, 0.0595F, -0.0639F));

		PartDefinition cube_r423 = leftOrbit.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(79, 152).addBox(-0.5411F, 0.0231F, -4.432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.7F, 4.5507F, -4.5192F, 0.6788F, 0.0595F, -0.0639F));

		PartDefinition cube_r424 = leftOrbit.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(33, 115).addBox(-0.5F, -0.45F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 11.3074F, -11.6183F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r425 = leftOrbit.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(0, 149).addBox(-1.4F, 0.2779F, -0.1873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F))
				.texOffs(56, 148).addBox(-1.4F, -0.2221F, -0.1873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0F, 10.3145F, -11.6229F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r426 = leftOrbit.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(146, 95).addBox(-1.4F, -1.4221F, -7.9873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0F, 5.8455F, -7.1611F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r427 = leftOrbit.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(62, 159).addBox(-0.488F, -0.6194F, -0.6977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5922F, 2.2963F, -3.0413F, -0.917F, 0.2596F, -0.0239F));

		PartDefinition cube_r428 = leftOrbit.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(78, 159).addBox(-0.504F, -0.4773F, -0.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5922F, 2.2963F, -3.0413F, -0.3345F, 0.3149F, 0.034F));

		PartDefinition cube_r429 = leftOrbit.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(156, 44).addBox(-0.4965F, -0.4892F, -0.6643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0902F, 2.2827F, -3.3025F, -0.4789F, 0.1985F, -0.1581F));

		PartDefinition cube_r430 = leftOrbit.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(157, 154).addBox(-0.4791F, -0.8553F, -1.4581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(157, 151).addBox(-0.4791F, -0.8553F, -0.8581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5922F, 2.2963F, -3.0413F, -0.1636F, 0.2487F, -0.0474F));

		PartDefinition cube_r431 = leftOrbit.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(73, 159).addBox(-0.5103F, -0.6466F, -1.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(156, 41).addBox(-0.5103F, -0.6466F, -1.3351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5922F, 2.2963F, -3.0413F, 0.1607F, 0.2509F, 0.0335F));

		PartDefinition cube_r432 = leftOrbit.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(134, 19).addBox(-0.8729F, -0.0117F, -3.0262F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8051F, -1.0697F, -2.75F, 1.0195F, 0.5059F, -0.2365F));

		PartDefinition cube_r433 = leftOrbit.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(22, 115).addBox(-0.2729F, -2.3117F, -2.1262F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -0.3885F, 0.2751F, 0.5661F, 0.289F, -0.4216F));

		PartDefinition cube_r434 = leftOrbit.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(135, 83).addBox(-0.9F, -0.5F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.226F, 4.1877F, -5.7938F, 0.8826F, -0.1425F, 0.194F));

		PartDefinition cube_r435 = leftOrbit.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(9, 115).addBox(-0.5723F, -0.9193F, -6.8515F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3777F, 1.1172F, -2.3448F, 0.8776F, 0.1096F, 0.496F));

		PartDefinition cube_r436 = leftOrbit.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(115, 26).addBox(-3.4195F, -1.3998F, -1.3172F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.038F, 3.3213F, -4.6556F, 2.9232F, -0.6037F, -0.9717F));

		PartDefinition cube_r437 = leftOrbit.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(130, 118).addBox(-2.8F, -0.5F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4234F, 3.1125F, -4.6829F, 1.5186F, 0.1515F, 0.521F));

		PartDefinition cube_r438 = leftOrbit.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(78, 134).addBox(-1.9084F, -2.1536F, -3.4939F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.222F, 0.7622F, -1.8913F, 1.1662F, 0.0281F, 0.2638F));

		PartDefinition cube_r439 = leftOrbit.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(144, 105).addBox(-0.8487F, -0.1884F, -0.2531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6587F, 3.232F, -3.2679F, 0.3222F, 0.1974F, 0.1178F));

		PartDefinition cube_r440 = leftOrbit.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(27, 135).addBox(-0.8487F, -0.5884F, -0.1531F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9939F, 3.1436F, -1.6555F, 0.625F, 0.1106F, 0.1407F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.2F, 0.4933F, -1.5002F));

		PartDefinition cube_r441 = rightOrbit.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(135, 9).mirror().addBox(-0.5F, -0.8847F, -1.5324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.1546F, -0.8467F, 2.4566F, 1.5542F, 0.928F, 1.471F));

		PartDefinition cube_r442 = rightOrbit.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(98, 134).mirror().addBox(-0.5F, -0.6149F, -1.5281F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1546F, -0.8467F, 2.4566F, 1.7113F, 0.928F, 1.471F));

		PartDefinition cube_r443 = rightOrbit.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(84, 144).mirror().addBox(-0.422F, -0.4018F, -0.7815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.2647F, 1.0176F, 1.0267F, 0.6074F, -0.0566F, -0.0846F));

		PartDefinition cube_r444 = rightOrbit.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(156, 47).mirror().addBox(-0.422F, -0.2611F, -0.6742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.2647F, 1.0176F, 1.0267F, -0.6231F, -0.0566F, -0.0846F));

		PartDefinition cube_r445 = rightOrbit.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.422F, -0.7355F, -0.6588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.2647F, 1.0176F, 1.0267F, -1.1467F, -0.0566F, -0.0846F));

		PartDefinition cube_r446 = rightOrbit.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(141, 37).mirror().addBox(-0.5498F, -1.101F, -0.7796F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.7918F, 5.8337F, -6.9437F, 0.986F, 0.1904F, 0.1807F));

		PartDefinition cube_r447 = rightOrbit.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(120, 149).mirror().addBox(-0.3109F, 0.884F, -1.7434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6337F, -1.418F, 2.3571F, 0.5566F, -0.0415F, -0.072F));

		PartDefinition cube_r448 = rightOrbit.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(0, 145).mirror().addBox(-0.7F, -2.7435F, -4.8445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8F, 3.0948F, -4.9403F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r449 = rightOrbit.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(145, 33).mirror().addBox(-0.4949F, -0.5961F, -0.973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3435F, -0.0783F, 2.2674F, 0.9225F, -0.0215F, -0.0803F));

		PartDefinition cube_r450 = rightOrbit.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(35, 145).mirror().addBox(-0.422F, -0.4786F, -0.7548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2647F, 1.0176F, 1.0267F, 0.7121F, -0.0566F, -0.0846F));

		PartDefinition cube_r451 = rightOrbit.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(141, 25).mirror().addBox(-0.5F, -0.2F, -1.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3003F, -2.6888F, 1.9974F, -0.0683F, -0.3383F, -0.2685F));

		PartDefinition cube_r452 = rightOrbit.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(144, 101).mirror().addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3003F, -2.6888F, 1.9974F, 0.4116F, -0.3383F, -0.2685F));

		PartDefinition cube_r453 = rightOrbit.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(91, 144).mirror().addBox(-1.175F, -0.6F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1657F, -3.1472F, 1.3143F, 0.9352F, -0.3383F, -0.2685F));

		PartDefinition cube_r454 = rightOrbit.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(115, 142).mirror().addBox(-1.3F, -0.3F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, -3.9887F, 0.1694F, 1.9427F, -0.2748F, -0.2432F));

		PartDefinition cube_r455 = rightOrbit.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(18, 136).mirror().addBox(-0.9F, 0.0F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.7F, -3.7246F, -0.3178F, 1.1411F, -0.7393F, -0.8444F));

		PartDefinition cube_r456 = rightOrbit.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(157, 119).mirror().addBox(-1.025F, 2.1936F, -3.2968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0204F, -0.0103F, -0.7757F, -0.2175F, -0.2459F, 0.0606F));

		PartDefinition cube_r457 = rightOrbit.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(28, 160).mirror().addBox(0.0353F, -1.3837F, -3.6821F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2368F, 2.5313F, -1.1252F, 0.977F, -0.2833F, -0.2355F));

		PartDefinition cube_r458 = rightOrbit.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(130, 156).mirror().addBox(-0.5F, 0.2589F, -2.059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(156, 129).mirror().addBox(-0.5F, -0.0833F, -0.8471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(156, 126).mirror().addBox(-0.5F, -0.1833F, -0.8471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.55F, 5.8077F, -4.1311F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r459 = rightOrbit.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(158, 6).mirror().addBox(-0.5F, 1.5065F, -1.7395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(158, 9).mirror().addBox(-0.5F, 1.4565F, -2.1395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(158, 3).mirror().addBox(-0.5F, 0.8244F, -0.7916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(158, 0).mirror().addBox(-0.5F, 0.8244F, -1.2916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(157, 157).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.55F, 5.443F, -3.781F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r460 = rightOrbit.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(157, 24).mirror().addBox(-0.5F, 0.5858F, -0.5049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(33, 149).mirror().addBox(-0.5F, -0.4506F, -1.2078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.55F, 6.2258F, -5.1661F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r461 = rightOrbit.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(27, 157).mirror().addBox(-0.5F, -0.6602F, -1.7984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(156, 101).mirror().addBox(-0.5F, -0.6026F, -0.4999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.55F, 5.8795F, -4.5278F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r462 = rightOrbit.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(73, 155).mirror().addBox(-0.5F, -1.5048F, -0.5498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.55F, 6.3696F, -4.5831F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r463 = rightOrbit.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(5, 156).mirror().addBox(-0.5F, -0.3925F, -0.4502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6F, 5.1664F, -4.2654F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r464 = rightOrbit.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(156, 90).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6F, 5.04F, -3.8918F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r465 = rightOrbit.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(113, 42).mirror().addBox(-0.6133F, -0.4985F, -4.9716F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1742F, 3.3693F, -2.846F, 0.7074F, -0.3502F, -0.2946F));

		PartDefinition cube_r466 = rightOrbit.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(157, 116).mirror().addBox(-0.3009F, -0.5413F, -0.6313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(1.6424F, 12.2783F, -11.6063F, 0.2867F, -0.0305F, 0.0818F));

		PartDefinition cube_r467 = rightOrbit.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(10, 157).mirror().addBox(-0.3009F, -1.035F, -0.677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.6424F, 12.2783F, -11.6063F, 0.1122F, -0.0305F, 0.0818F));

		PartDefinition cube_r468 = rightOrbit.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(114, 157).mirror().addBox(-0.3012F, -0.2586F, -0.6011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(1.6424F, 11.3906F, -10.4283F, 0.6352F, -0.0566F, 0.0664F));

		PartDefinition cube_r469 = rightOrbit.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(0, 157).mirror().addBox(-0.3012F, -0.7618F, -0.5982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.6424F, 11.3906F, -10.4283F, 0.4606F, -0.0566F, 0.0664F));

		PartDefinition cube_r470 = rightOrbit.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(102, 157).mirror().addBox(-0.4904F, -0.1273F, -0.5949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(1.6424F, 10.2978F, -9.1858F, 0.8097F, -0.0673F, 0.0556F));

		PartDefinition cube_r471 = rightOrbit.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(152, 156).mirror().addBox(-0.4904F, -0.6335F, -0.5693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.6424F, 10.2978F, -9.1858F, 0.6352F, -0.0673F, 0.0556F));

		PartDefinition cube_r472 = rightOrbit.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(135, 156).mirror().addBox(-0.5F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(1.6161F, 9.3001F, -7.5138F, 0.6788F, -0.0595F, 0.0639F));

		PartDefinition cube_r473 = rightOrbit.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(62, 156).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.6584F, 8.9345F, -7.8303F, 0.5042F, -0.0595F, 0.0639F));

		PartDefinition cube_r474 = rightOrbit.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(79, 152).mirror().addBox(-0.4589F, 0.0231F, -4.432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.7F, 4.5507F, -4.5192F, 0.6788F, -0.0595F, 0.0639F));

		PartDefinition cube_r475 = rightOrbit.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(33, 115).mirror().addBox(-0.5F, -0.45F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9F, 11.3074F, -11.6183F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r476 = rightOrbit.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(0, 149).mirror().addBox(0.4F, 0.2779F, -0.1873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false)
				.texOffs(56, 148).mirror().addBox(0.4F, -0.2221F, -0.1873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0F, 10.3145F, -11.6229F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r477 = rightOrbit.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(146, 95).mirror().addBox(0.4F, -1.4221F, -7.9873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.8455F, -7.1611F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r478 = rightOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(62, 159).mirror().addBox(-0.512F, -0.6194F, -0.6977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 2.2963F, -3.0413F, -0.917F, -0.2596F, 0.0239F));

		PartDefinition cube_r479 = rightOrbit.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(78, 159).mirror().addBox(-0.496F, -0.4773F, -0.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 2.2963F, -3.0413F, -0.3345F, -0.3149F, -0.034F));

		PartDefinition cube_r480 = rightOrbit.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(156, 44).mirror().addBox(-0.5035F, -0.4892F, -0.6643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0902F, 2.2827F, -3.3025F, -0.4789F, -0.1985F, 0.1581F));

		PartDefinition cube_r481 = rightOrbit.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(157, 154).mirror().addBox(-0.5209F, -0.8553F, -1.4581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(157, 151).mirror().addBox(-0.5209F, -0.8553F, -0.8581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 2.2963F, -3.0413F, -0.1636F, -0.2487F, 0.0474F));

		PartDefinition cube_r482 = rightOrbit.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(73, 159).mirror().addBox(-0.4897F, -0.6466F, -1.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(156, 41).mirror().addBox(-0.4897F, -0.6466F, -1.3351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 2.2963F, -3.0413F, 0.1607F, -0.2509F, -0.0335F));

		PartDefinition cube_r483 = rightOrbit.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(134, 19).mirror().addBox(-0.1271F, -0.0117F, -3.0262F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8051F, -1.0697F, -2.75F, 1.0195F, -0.5059F, 0.2365F));

		PartDefinition cube_r484 = rightOrbit.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(22, 115).mirror().addBox(-0.7271F, -2.3117F, -2.1262F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2F, -0.3885F, 0.2751F, 0.5661F, -0.289F, 0.4216F));

		PartDefinition cube_r485 = rightOrbit.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(135, 83).mirror().addBox(-0.1F, -0.5F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.226F, 4.1877F, -5.7938F, 0.8826F, 0.1425F, -0.194F));

		PartDefinition cube_r486 = rightOrbit.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(9, 115).mirror().addBox(-1.4277F, -0.9193F, -6.8515F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3777F, 1.1172F, -2.3448F, 0.8776F, -0.1096F, -0.496F));

		PartDefinition cube_r487 = rightOrbit.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(115, 26).mirror().addBox(-0.5805F, -1.3998F, -1.3172F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.038F, 3.3213F, -4.6556F, 2.9232F, 0.6037F, 0.9717F));

		PartDefinition cube_r488 = rightOrbit.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(130, 118).mirror().addBox(-0.2F, -0.5F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4234F, 3.1125F, -4.6829F, 1.5186F, -0.1515F, -0.521F));

		PartDefinition cube_r489 = rightOrbit.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(78, 134).mirror().addBox(-1.0916F, -2.1536F, -3.4939F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.222F, 0.7622F, -1.8913F, 1.1662F, -0.0281F, -0.2638F));

		PartDefinition cube_r490 = rightOrbit.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(144, 105).mirror().addBox(-0.1513F, -0.1884F, -0.2531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6587F, 3.232F, -3.2679F, 0.3222F, -0.1974F, -0.1178F));

		PartDefinition cube_r491 = rightOrbit.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(27, 135).mirror().addBox(-0.1513F, -0.5884F, -0.1531F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9939F, 3.1436F, -1.6555F, 0.625F, -0.1106F, -0.1407F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.9809F, 1.4481F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(151, 71).mirror().addBox(-0.0576F, -4.9174F, -1.094F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.105F, -1.4227F, -18.0747F, -1.755F, 0.0006F, -0.0118F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(93, 148).mirror().addBox(-0.575F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5855F, -0.9032F, -14.2345F, -1.8576F, -0.0191F, -0.0446F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(155, 141).mirror().addBox(-0.1077F, -1.9494F, -1.118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.105F, -1.4227F, -18.0747F, -1.75F, 0.0465F, -0.0206F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(155, 132).mirror().addBox(-0.1077F, -1.8609F, -0.9945F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.105F, -1.4227F, -18.0747F, -1.8372F, 0.0465F, -0.0206F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(84, 155).mirror().addBox(-0.2091F, 6.8694F, -2.7931F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 144).mirror().addBox(-0.2091F, 5.4694F, -2.6931F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.7486F, 0.7328F, -1.3293F, -0.1948F, -0.0185F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(151, 128).mirror().addBox(-0.6805F, 2.7239F, -4.8299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4171F, 2.0151F, -1.1364F, -1.1524F, -0.317F, -0.0191F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(122, 142).mirror().addBox(-0.1983F, -4.863F, -1.441F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9287F, -0.1549F, -13.2619F, -1.8009F, -0.1459F, -0.0385F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(64, 144).mirror().addBox(-0.1891F, -4.9357F, -0.9124F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9287F, -0.1549F, -13.2619F, -1.828F, -0.1488F, -0.0275F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(150, 111).mirror().addBox(-0.052F, -0.2954F, -1.7054F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(146, 59).mirror().addBox(-0.052F, -0.2954F, -2.6804F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8171F, 2.0151F, -4.9364F, -1.5003F, -0.2993F, -0.0246F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(146, 65).mirror().addBox(-0.0461F, -0.0604F, -0.8839F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8171F, 2.0151F, -4.9364F, -1.8057F, -0.2993F, -0.0246F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(127, 134).mirror().addBox(0.0171F, -1.1215F, -4.022F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4171F, 2.0151F, -1.1364F, -1.117F, -0.1222F, 0.0F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(135, 88).mirror().addBox(0.0171F, -0.0854F, -1.2535F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4171F, 2.0151F, -1.1364F, -1.7366F, -0.1222F, 0.0F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(135, 104).mirror().addBox(0.0171F, -1.4586F, -3.0264F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.4171F, 2.0151F, -1.1364F, -0.4014F, -0.1222F, 0.0F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(146, 12).mirror().addBox(-0.0829F, -2.0274F, -0.4588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4171F, 2.0151F, -1.1364F, 0.192F, -0.1222F, 0.0F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(159, 20).mirror().addBox(-0.0829F, -4.9136F, 1.3584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(52, 159).mirror().addBox(-0.0829F, -5.3136F, 1.3584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4171F, 2.0151F, -1.1364F, 0.5061F, -0.1222F, 0.0F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(147, 155).mirror().addBox(-0.0829F, -4.5296F, -1.8958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4171F, 2.0151F, -1.1364F, -0.2356F, -0.1222F, 0.0F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(118, 134).mirror().addBox(-0.0829F, -5.44F, -1.2229F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1094F)).mirror(false), PartPose.offsetAndRotation(-3.4171F, 2.0151F, -1.1364F, 0.4363F, -0.1222F, 0.0F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(157, 33).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9081F, -1.956F, -11.6052F, 2.7489F, -0.1309F, 0.0F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(157, 148).mirror().addBox(-0.6782F, -1.1874F, 1.0375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(157, 136).mirror().addBox(-0.6782F, -1.2874F, 1.0375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -1.3292F, -9.9213F, 2.1118F, -0.1309F, 0.0F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(149, 47).mirror().addBox(-0.5F, -0.525F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.2451F, -11.2213F, 1.4137F, -0.1309F, 0.0F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(156, 62).mirror().addBox(-0.6782F, -0.872F, 1.2964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -1.3292F, -9.9213F, 2.8798F, -0.1309F, 0.0F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(119, 157).mirror().addBox(-0.6782F, -1.037F, 0.8561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -1.3292F, -9.9213F, 2.234F, -0.1309F, 0.0F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(89, 158).mirror().addBox(-0.5F, -0.1638F, -0.6247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(158, 93).mirror().addBox(-0.5F, -0.1638F, -0.2247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -1.3292F, -9.9213F, 2.234F, -0.1309F, 0.0F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(157, 27).mirror().addBox(-0.5F, -0.8251F, 0.0077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -1.3292F, -9.9213F, 2.8798F, -0.1309F, 0.0F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(47, 149).mirror().addBox(-0.5F, -0.0896F, -1.6882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -1.3292F, -9.9213F, 1.4573F, -0.1309F, 0.0F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(158, 104).mirror().addBox(-0.5F, -0.2139F, 0.0962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -1.3292F, -9.9213F, 2.1118F, -0.1309F, 0.0F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(157, 30).mirror().addBox(-0.5F, -0.5282F, -0.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(32, 157).mirror().addBox(-0.5F, -0.4282F, -0.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -1.3292F, -9.9213F, 2.5307F, -0.1309F, 0.0F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(155, 97).mirror().addBox(-0.5F, -1.3746F, -0.4011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -1.3292F, -9.9213F, 2.9671F, -0.1309F, 0.0F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(97, 155).mirror().addBox(-0.5F, -1.2315F, -0.3629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.425F, -1.0968F, -8.2013F, 3.0543F, -0.1309F, 0.0F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(157, 14).mirror().addBox(-0.5F, -0.3146F, 0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(15, 157).mirror().addBox(-0.5F, -0.4146F, 0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.425F, -1.0968F, -8.2013F, 2.618F, -0.1309F, 0.0F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(57, 158).mirror().addBox(-0.5F, -0.1488F, 0.2293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.425F, -1.0968F, -8.2013F, 2.1991F, -0.1309F, 0.0F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(40, 149).mirror().addBox(-0.5F, -0.1189F, -1.543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.425F, -1.0968F, -8.2013F, 1.5446F, -0.1309F, 0.0F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(155, 108).mirror().addBox(-0.5F, -1.6858F, 0.0582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.425F, -1.0968F, -8.2013F, 2.9671F, -0.1309F, 0.0F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(158, 85).mirror().addBox(-0.5F, -0.0979F, -0.5387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(158, 68).mirror().addBox(-0.5F, -0.0979F, -0.1387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.425F, -1.0968F, -8.2013F, 2.3213F, -0.1309F, 0.0F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(152, 148).mirror().addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(-0.9826F, -2.9483F, -18.622F, 0.4725F, 0.0023F, -0.1174F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(157, 17).mirror().addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.9826F, -2.9483F, -18.622F, 0.2979F, 0.0023F, -0.1174F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(153, 10).mirror().addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(-1.0326F, -3.0483F, -17.722F, 0.1092F, 0.084F, -0.1564F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(42, 157).mirror().addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.0326F, -3.0483F, -17.722F, -0.0653F, 0.084F, -0.1564F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(153, 6).mirror().addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(-0.9826F, -2.8483F, -16.422F, 0.037F, -0.016F, -0.1627F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(37, 157).mirror().addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.9826F, -2.8483F, -16.422F, -0.1376F, -0.016F, -0.1627F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(153, 2).mirror().addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(-0.9826F, -2.4483F, -14.722F, 0.1724F, -0.0387F, -0.1521F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(157, 36).mirror().addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.9826F, -2.4483F, -14.722F, -0.0022F, -0.0387F, -0.1521F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(156, 65).mirror().addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.0326F, -2.0483F, -12.922F, -0.3015F, -0.0881F, -0.1732F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(0, 153).mirror().addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(-1.0326F, -2.0483F, -12.922F, -0.127F, -0.0881F, -0.1732F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(134, 111).mirror().addBox(0.0171F, -0.1932F, -5.4092F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4171F, 2.0151F, -1.1364F, -0.8901F, -0.1222F, 0.0F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(156, 59).mirror().addBox(-0.15F, 0.1795F, -0.1215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(156, 59).addBox(0.05F, 0.1795F, -0.1215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.05F, -2.2603F, -17.6307F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(151, 71).addBox(-0.9424F, -4.9174F, -1.094F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.095F, -1.4227F, -18.0747F, -1.755F, -0.0006F, 0.0118F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(93, 148).addBox(-0.425F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6145F, -0.9032F, -14.2345F, -1.8576F, 0.0191F, 0.0446F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(155, 141).addBox(-0.8923F, -1.9494F, -1.118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.095F, -1.4227F, -18.0747F, -1.75F, -0.0465F, 0.0206F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(155, 132).addBox(-0.8923F, -1.8609F, -0.9945F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.095F, -1.4227F, -18.0747F, -1.8372F, -0.0465F, 0.0206F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(84, 155).addBox(0.2091F, 6.8694F, -2.7931F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(12, 144).addBox(0.2091F, 5.4694F, -2.6931F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -0.7486F, 0.7328F, -1.3293F, 0.1948F, 0.0185F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(151, 128).addBox(-0.3195F, 2.7239F, -4.8299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2171F, 2.0151F, -1.1364F, -1.1524F, 0.317F, 0.0191F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(122, 142).addBox(-0.8017F, -4.863F, -1.441F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2713F, -0.1549F, -13.2619F, -1.8009F, 0.1459F, 0.0385F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(64, 144).addBox(-0.8109F, -4.9357F, -0.9124F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2713F, -0.1549F, -13.2619F, -1.828F, 0.1488F, 0.0275F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(150, 111).addBox(-0.948F, -0.2954F, -1.7054F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(146, 59).addBox(-0.948F, -0.2954F, -2.6804F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6171F, 2.0151F, -4.9364F, -1.5003F, 0.2993F, 0.0246F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(146, 65).addBox(-0.9539F, -0.0604F, -0.8839F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6171F, 2.0151F, -4.9364F, -1.8057F, 0.2993F, 0.0246F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(127, 134).addBox(-1.0171F, -1.1215F, -4.022F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2171F, 2.0151F, -1.1364F, -1.117F, 0.1222F, 0.0F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(135, 88).addBox(-1.0171F, -0.0854F, -1.2535F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2171F, 2.0151F, -1.1364F, -1.7366F, 0.1222F, 0.0F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(135, 104).addBox(-1.0171F, -1.4586F, -3.0264F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2171F, 2.0151F, -1.1364F, -0.4014F, 0.1222F, 0.0F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(146, 12).addBox(-0.9171F, -2.0274F, -0.4588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2171F, 2.0151F, -1.1364F, 0.192F, 0.1222F, 0.0F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(159, 20).addBox(-0.9171F, -4.9136F, 1.3584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(52, 159).addBox(-0.9171F, -5.3136F, 1.3584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2171F, 2.0151F, -1.1364F, 0.5061F, 0.1222F, 0.0F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(147, 155).addBox(-0.9171F, -4.5296F, -1.8958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2171F, 2.0151F, -1.1364F, -0.2356F, 0.1222F, 0.0F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(118, 134).addBox(-0.9171F, -5.44F, -1.2229F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1094F)), PartPose.offsetAndRotation(2.2171F, 2.0151F, -1.1364F, 0.4363F, 0.1222F, 0.0F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(157, 33).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2919F, -1.956F, -11.6052F, 2.7489F, 0.1309F, 0.0F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(157, 148).addBox(-0.3218F, -1.1874F, 1.0375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(157, 136).addBox(-0.3218F, -1.2874F, 1.0375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.25F, -1.3292F, -9.9213F, 2.1118F, 0.1309F, 0.0F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(149, 47).addBox(-0.5F, -0.525F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2414F, -1.2451F, -11.2213F, 1.4137F, 0.1309F, 0.0F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(156, 62).addBox(-0.3218F, -0.872F, 1.2964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.25F, -1.3292F, -9.9213F, 2.8798F, 0.1309F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(119, 157).addBox(-0.3218F, -1.037F, 0.8561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.25F, -1.3292F, -9.9213F, 2.234F, 0.1309F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(89, 158).addBox(-0.5F, -0.1638F, -0.6247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(158, 93).addBox(-0.5F, -0.1638F, -0.2247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.05F, -1.3292F, -9.9213F, 2.234F, 0.1309F, 0.0F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(157, 27).addBox(-0.5F, -0.8251F, 0.0077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, -1.3292F, -9.9213F, 2.8798F, 0.1309F, 0.0F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(47, 149).addBox(-0.5F, -0.0896F, -1.6882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, -1.3292F, -9.9213F, 1.4573F, 0.1309F, 0.0F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(158, 104).addBox(-0.5F, -0.2139F, 0.0962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.05F, -1.3292F, -9.9213F, 2.1118F, 0.1309F, 0.0F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(157, 30).addBox(-0.5F, -0.5282F, -0.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(32, 157).addBox(-0.5F, -0.4282F, -0.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.05F, -1.3292F, -9.9213F, 2.5307F, 0.1309F, 0.0F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(155, 97).addBox(-0.5F, -1.3746F, -0.4011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.05F, -1.3292F, -9.9213F, 2.9671F, 0.1309F, 0.0F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(97, 155).addBox(-0.5F, -1.2315F, -0.3629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.225F, -1.0968F, -8.2013F, 3.0543F, 0.1309F, 0.0F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(157, 14).addBox(-0.5F, -0.3146F, 0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(15, 157).addBox(-0.5F, -0.4146F, 0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.225F, -1.0968F, -8.2013F, 2.618F, 0.1309F, 0.0F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(57, 158).addBox(-0.5F, -0.1488F, 0.2293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.225F, -1.0968F, -8.2013F, 2.1991F, 0.1309F, 0.0F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(40, 149).addBox(-0.5F, -0.1189F, -1.543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.225F, -1.0968F, -8.2013F, 1.5446F, 0.1309F, 0.0F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(155, 108).addBox(-0.5F, -1.6858F, 0.0582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.225F, -1.0968F, -8.2013F, 2.9671F, 0.1309F, 0.0F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(158, 85).addBox(-0.5F, -0.0979F, -0.5387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(158, 68).addBox(-0.5F, -0.0979F, -0.1387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.225F, -1.0968F, -8.2013F, 2.3213F, 0.1309F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(152, 148).addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-0.2174F, -2.9483F, -18.622F, 0.4725F, -0.0023F, 0.1174F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(157, 17).addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.2174F, -2.9483F, -18.622F, 0.2979F, -0.0023F, 0.1174F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(153, 10).addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-0.1674F, -3.0483F, -17.722F, 0.1092F, -0.084F, 0.1564F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(42, 157).addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.1674F, -3.0483F, -17.722F, -0.0653F, -0.084F, 0.1564F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(153, 6).addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-0.2174F, -2.8483F, -16.422F, 0.037F, 0.016F, 0.1627F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(37, 157).addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.2174F, -2.8483F, -16.422F, -0.1376F, 0.016F, 0.1627F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(153, 2).addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-0.2174F, -2.4483F, -14.722F, 0.1724F, 0.0387F, 0.1521F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(157, 36).addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.2174F, -2.4483F, -14.722F, -0.0022F, 0.0387F, 0.1521F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(156, 65).addBox(-0.5F, -0.7585F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.1674F, -2.0483F, -12.922F, -0.3015F, 0.0881F, 0.1732F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(0, 153).addBox(-0.5F, -0.2419F, -0.5249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-0.1674F, -2.0483F, -12.922F, -0.127F, 0.0881F, 0.1732F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(134, 111).addBox(-1.0171F, -0.1932F, -5.4092F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2171F, 2.0151F, -1.1364F, -0.8901F, 0.1222F, 0.0F));

		return LayerDefinition.create(meshdefinition, 165, 165);
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