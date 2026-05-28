package fossils.fossils.client.blockentity.model.taytalura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TaytaluraFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail9;

	public TaytaluraFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.UpperArmL = this.chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck3 = this.chest.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail9 = this.tail6.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.4142F, 9.6479F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 45).addBox(0.0F, -1.1F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0109F, 0.957F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 89).addBox(0.0F, -1.15F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1106F, -0.9639F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 88).addBox(0.0F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, -2.9602F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 6).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2993F, -3.0262F, -0.0493F, 0.0693F, -0.3529F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 6).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2993F, -3.0262F, -0.0493F, -0.0693F, 0.3529F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 30).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7096F, 1.9341F, -0.8617F, 0.1551F, -0.0803F, 0.5174F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(79, 75).addBox(-0.8933F, -0.8865F, -1.1496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.3061F, 0.7391F, 0.3157F, -2.6848F, -0.0915F, -0.2549F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 17).addBox(-0.5F, -1.75F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.4163F, -0.7289F, -0.4034F, -2.999F, -0.0915F, -0.2549F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 80).addBox(-0.8717F, -0.2275F, -0.6871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(49, 71).addBox(-0.8717F, 0.4725F, -0.6871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.4898F, 1.1237F, -1.1561F, -0.0755F, -0.0915F, 0.4432F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(84, 85).addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(79, 85).addBox(-0.5F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-1.0119F, 3.0987F, -1.2233F, -0.027F, -0.0318F, 1.0524F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(33, 71).addBox(-0.8717F, 0.4825F, -0.2611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(78, 79).addBox(-0.8717F, 0.0575F, -0.2611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.4898F, 1.1237F, -1.1561F, 0.0554F, -0.0915F, 0.4432F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 81).addBox(-0.8568F, -0.6121F, -0.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3061F, 1.1391F, 1.0157F, -0.73F, -0.0915F, 0.2687F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 81).addBox(-0.8568F, 0.9776F, -0.9102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3061F, 1.1391F, 1.0157F, 1.4953F, -0.0915F, 0.2687F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 16).addBox(-0.8568F, 0.3294F, -0.7664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3061F, 1.1391F, 1.0157F, 1.3644F, -0.0915F, 0.2687F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(15, 81).addBox(-0.8568F, 0.2552F, -1.837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.3061F, 1.1391F, 1.0157F, 2.1498F, -0.0915F, 0.2687F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(81, 3).addBox(-0.8568F, -1.6371F, -1.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3061F, 1.1391F, 1.0157F, -2.8681F, -0.0915F, 0.2687F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(81, 26).addBox(-0.8568F, -0.5362F, -0.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(80, 65).addBox(-0.8568F, -0.5362F, 0.5991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.3061F, 1.1391F, 1.0157F, -1.4282F, -0.0915F, 0.2687F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 57).addBox(-0.85F, -1.75F, -0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.1011F, 2.5093F, 1.2559F, -1.2604F, -0.2184F, 0.7552F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(23, 57).addBox(-0.85F, -0.9F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.1011F, 2.5093F, 1.2559F, -1.7475F, -0.052F, 0.8084F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 87).addBox(-0.8568F, 0.5802F, -0.4593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3061F, 1.1391F, 1.0157F, -0.3373F, -0.0915F, 0.2687F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(51, 80).addBox(-0.8568F, 0.1471F, -0.7559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3061F, 1.1391F, 1.0157F, -0.0319F, -0.0915F, 0.2687F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 80).addBox(-0.8568F, -0.6111F, -1.0116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.3061F, 1.1391F, 1.0157F, 0.7099F, -0.0915F, 0.2687F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(66, 4).addBox(-0.8933F, -1.7743F, -0.8223F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3061F, 0.7391F, 0.3157F, 1.4953F, -0.0915F, -0.2549F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(5, 80).addBox(-0.8933F, -1.7755F, 0.5196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(81, 55).addBox(-0.8933F, -1.6754F, 0.5196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.3061F, 0.7391F, 0.3157F, 2.3243F, -0.0915F, -0.2549F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(19, 75).addBox(-0.5F, -1.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 74).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.2832F, -0.263F, -0.5266F, 2.3243F, -0.0915F, -0.2549F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(44, 60).addBox(-0.5F, -1.85F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.4163F, -0.7289F, -0.4034F, 2.8915F, -0.0915F, -0.2549F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(69, 76).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.5921F, -1.2426F, 0.0384F, -2.2572F, -0.0915F, -0.2549F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(68, 79).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7301F, -1.5482F, 0.6529F, -1.0791F, -0.0915F, -0.2549F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(21, 71).addBox(-0.5F, -0.45F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.9828F, -2.0517F, 1.9345F, -1.1664F, -0.0915F, -0.2549F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 73).addBox(-0.9074F, -3.6456F, 0.3899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2177F, -0.0448F, -0.7503F, -0.73F, -0.0915F, -0.2549F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(73, 79).addBox(-0.9074F, -1.818F, 0.2288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(79, 39).addBox(-0.9074F, -1.818F, 0.8288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2177F, -0.0448F, -0.7503F, -0.4682F, -0.0915F, -0.2549F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7096F, 1.9341F, -0.8617F, 0.1551F, 0.0803F, -0.5174F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(79, 75).mirror().addBox(-0.1067F, -0.8865F, -1.1496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 0.7391F, 0.3157F, -2.6848F, 0.0915F, 0.2549F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-0.5F, -1.75F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.4163F, -0.7289F, -0.4034F, -2.999F, 0.0915F, 0.2549F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.1283F, -0.2275F, -0.6871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(49, 71).mirror().addBox(-0.1283F, 0.4725F, -0.6871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.4898F, 1.1237F, -1.1561F, -0.0755F, 0.0915F, -0.4432F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(84, 85).mirror().addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false)
				.texOffs(79, 85).mirror().addBox(-0.5F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(1.0119F, 3.0987F, -1.2233F, -0.027F, 0.0318F, -1.0524F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(33, 71).mirror().addBox(-0.1283F, 0.4825F, -0.2611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(78, 79).mirror().addBox(-0.1283F, 0.0575F, -0.2611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.4898F, 1.1237F, -1.1561F, 0.0554F, 0.0915F, -0.4432F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.1432F, -0.6121F, -0.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 1.1391F, 1.0157F, -0.73F, 0.0915F, -0.2687F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(44, 81).mirror().addBox(-0.1432F, 0.9776F, -0.9102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 1.1391F, 1.0157F, 1.4953F, 0.0915F, -0.2687F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(81, 16).mirror().addBox(-0.1432F, 0.3294F, -0.7664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 1.1391F, 1.0157F, 1.3644F, 0.0915F, -0.2687F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(15, 81).mirror().addBox(-0.1432F, 0.2552F, -1.837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 1.1391F, 1.0157F, 2.1498F, 0.0915F, -0.2687F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(81, 3).mirror().addBox(-0.1432F, -1.6371F, -1.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 1.1391F, 1.0157F, -2.8681F, 0.0915F, -0.2687F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(81, 26).mirror().addBox(-0.1432F, -0.5362F, -0.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(80, 65).mirror().addBox(-0.1432F, -0.5362F, 0.5991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 1.1391F, 1.0157F, -1.4282F, 0.0915F, -0.2687F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(30, 57).mirror().addBox(-0.15F, -1.75F, -0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.1011F, 2.5093F, 1.2559F, -1.2604F, 0.2184F, -0.7552F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(23, 57).mirror().addBox(-0.15F, -0.9F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.1011F, 2.5093F, 1.2559F, -1.7475F, 0.052F, -0.8084F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(-0.1432F, 0.5802F, -0.4593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 1.1391F, 1.0157F, -0.3373F, 0.0915F, -0.2687F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.1432F, 0.1471F, -0.7559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 1.1391F, 1.0157F, -0.0319F, 0.0915F, -0.2687F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.1432F, -0.6111F, -1.0116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 1.1391F, 1.0157F, 0.7099F, 0.0915F, -0.2687F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-0.1067F, -1.7743F, -0.8223F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 0.7391F, 0.3157F, 1.4953F, 0.0915F, 0.2549F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.1067F, -1.7755F, 0.5196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(81, 55).mirror().addBox(-0.1067F, -1.6754F, 0.5196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.3061F, 0.7391F, 0.3157F, 2.3243F, 0.0915F, 0.2549F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(19, 75).mirror().addBox(-0.5F, -1.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(54, 74).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.2832F, -0.263F, -0.5266F, 2.3243F, 0.0915F, 0.2549F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(44, 60).mirror().addBox(-0.5F, -1.85F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.4163F, -0.7289F, -0.4034F, 2.8915F, 0.0915F, 0.2549F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(69, 76).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.5921F, -1.2426F, 0.0384F, -2.2572F, 0.0915F, 0.2549F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(68, 79).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7301F, -1.5482F, 0.6529F, -1.0791F, 0.0915F, 0.2549F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(21, 71).mirror().addBox(-0.5F, -0.45F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.9828F, -2.0517F, 1.9345F, -1.1664F, 0.0915F, 0.2549F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-0.0926F, -3.6456F, 0.3899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.2177F, -0.0448F, -0.7503F, -0.73F, 0.0915F, 0.2549F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(73, 79).mirror().addBox(-0.0926F, -1.818F, 0.2288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(79, 39).mirror().addBox(-0.0926F, -1.818F, 0.8288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2177F, -0.0448F, -0.7503F, -0.4682F, 0.0915F, 0.2549F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1681F, 2.7021F, -0.4567F, -1.0719F, -0.3543F, -1.737F));

		PartDefinition upperleg8_r1 = upperleg2.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(64, 76).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.1155F, 0.1723F, 0.7679F, 0.0F, 0.0F));

		PartDefinition upperleg8_r2 = upperleg2.addOrReplaceChild("upperleg8_r2", CubeListBuilder.create().texOffs(69, 31).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.8867F, -0.8218F, 0.4102F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(76, 56).addBox(0.5F, -0.9031F, -0.328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 0.7754F, -0.5098F, 0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(61, 71).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.1357F, 2.1924F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(69, 39).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 4.1692F, 1.828F, 0.1833F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(69, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.8727F, 0.0061F, 0.4887F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg2.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(56, 65).addBox(0.5F, -2.0686F, -1.3385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6641F, 1.1007F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2737F, 8.1936F, 1.4303F, 2.249F, -1.4251F, 0.303F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(39, 54).addBox(-0.2F, -2.5F, -1.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4465F, 2.5773F, 0.804F, -1.5272F, 1.5184F, -1.5708F));

		PartDefinition leg4_r2 = leg2.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(69, 53).addBox(-0.575F, -0.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.8465F, 0.0786F, -0.0092F, 1.5708F, 1.5446F, 1.5708F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(41, 76).addBox(-0.375F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.0465F, 0.4899F, -0.1802F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition leg5_r1 = leg2.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(0, 73).addBox(-0.45F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.0465F, 2.1365F, 0.1654F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition leg5_r2 = leg2.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(25, 87).addBox(-0.9821F, -0.6095F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(87, 41).addBox(-0.9821F, 0.1905F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0465F, 0.9402F, -0.6918F, 1.5708F, 1.2828F, 1.5708F));

		PartDefinition leg4_r3 = leg2.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(62, 21).addBox(-0.1F, 0.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.0465F, 3.7792F, 0.6775F, -1.5708F, 1.4661F, -1.5708F));

		PartDefinition leg4_r4 = leg2.addOrReplaceChild("leg4_r4", CubeListBuilder.create().texOffs(79, 49).addBox(-0.1F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0465F, 3.2811F, 0.6339F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(69, 85).addBox(-0.1F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.0465F, 2.5837F, 0.5729F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(34, 38).addBox(-2.0487F, -0.9749F, -2.7509F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0021F, 8.2623F, 0.9321F, -0.3436F, -0.0346F, 0.0349F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0487F, -0.9978F, -4.9636F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0229F, -2.7873F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1681F, 2.7021F, -0.4567F, -0.9024F, -0.5501F, 2.3849F));

		PartDefinition upperleg9_r1 = upperleg3.addOrReplaceChild("upperleg9_r1", CubeListBuilder.create().texOffs(64, 76).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1155F, 0.1723F, 0.7679F, 0.0F, 0.0F));

		PartDefinition upperleg9_r2 = upperleg3.addOrReplaceChild("upperleg9_r2", CubeListBuilder.create().texOffs(69, 31).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8867F, -0.8218F, 0.4102F, 0.0F, 0.0F));

		PartDefinition upperleg8_r3 = upperleg3.addOrReplaceChild("upperleg8_r3", CubeListBuilder.create().texOffs(76, 56).mirror().addBox(-1.5F, -0.9031F, -0.328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7754F, -0.5098F, 0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg7_r2 = upperleg3.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(61, 71).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.1357F, 2.1924F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperleg3.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(69, 39).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.1692F, 1.828F, 0.1833F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8727F, 0.0061F, 0.4887F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg3.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(-1.5F, -2.0686F, -1.3385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6641F, 1.1007F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2737F, 8.1936F, 1.4303F, -2.9616F, 0.6288F, 1.8471F));

		PartDefinition leg5_r3 = leg3.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(39, 54).mirror().addBox(-0.8F, -2.5F, -1.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4465F, 2.5773F, 0.804F, -1.5272F, -1.5184F, 1.5708F));

		PartDefinition leg5_r4 = leg3.addOrReplaceChild("leg5_r4", CubeListBuilder.create().texOffs(69, 53).mirror().addBox(-0.425F, -0.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.8465F, 0.0786F, -0.0092F, 1.5708F, -1.5446F, -1.5708F));

		PartDefinition leg4_r5 = leg3.addOrReplaceChild("leg4_r5", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-0.625F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 0.4899F, -0.1802F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition leg6_r1 = leg3.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.55F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 2.1365F, 0.1654F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition leg6_r2 = leg3.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.0179F, -0.6095F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false)
				.texOffs(87, 41).mirror().addBox(-0.0179F, 0.1905F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 0.9402F, -0.6918F, 1.5708F, -1.2828F, -1.5708F));

		PartDefinition leg5_r5 = leg3.addOrReplaceChild("leg5_r5", CubeListBuilder.create().texOffs(62, 21).mirror().addBox(-0.9F, 0.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 3.7792F, 0.6775F, -1.5708F, -1.4661F, 1.5708F));

		PartDefinition leg5_r6 = leg3.addOrReplaceChild("leg5_r6", CubeListBuilder.create().texOffs(79, 49).mirror().addBox(-0.9F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 3.2811F, 0.6339F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leg4_r6 = leg3.addOrReplaceChild("leg4_r6", CubeListBuilder.create().texOffs(69, 85).mirror().addBox(-0.9F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 2.5837F, 0.5729F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(34, 38).mirror().addBox(-2.9513F, -0.9749F, -2.7509F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0021F, 8.2623F, 0.9321F, 0.8423F, -0.2844F, -0.2056F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-2.9513F, -0.9978F, -4.9636F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0229F, -2.7873F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.5001F, -5.0122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3F, -3.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(71, 88).addBox(0.0F, -1.025F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5001F, -2.0122F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 89).addBox(0.0F, -1.15F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4001F, -4.0122F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(-2.8706F, -0.6889F, -0.538F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2001F, -3.5122F, 0.0988F, 0.6504F, -0.9229F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 11).mirror().addBox(-1.9934F, -0.0076F, -0.538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2001F, -3.5122F, 0.3408F, 0.5729F, -0.5058F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(71, 13).mirror().addBox(-1.9143F, 0.1184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.567F, -0.312F, -1.5178F, 0.3237F, 0.448F, -0.4146F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(71, 13).addBox(-0.0857F, 0.1184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.567F, -0.312F, -1.5178F, 0.3237F, -0.448F, 0.4146F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 11).addBox(-0.0066F, -0.0076F, -0.538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2001F, -3.5122F, 0.3408F, -0.5729F, 0.5058F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(88, 67).addBox(1.8706F, -0.6889F, -0.538F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2001F, -3.5122F, 0.0988F, -0.6504F, 0.9229F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, 4.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.2834F, -9.0796F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(30, 43).addBox(-0.5F, -0.4F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1001F, -4.9122F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(3, 89).addBox(0.0F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(63, 88).addBox(0.0F, -1.175F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2953F, -1.1018F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(60, 88).addBox(0.0F, -1.075F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 57).mirror().addBox(-2.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -4.6F, 0.4378F, 0.4443F, -0.2476F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(21, 69).mirror().addBox(-3.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -4.6F, 0.2545F, 0.5643F, -0.6229F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-5.1344F, -2.3955F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -4.6F, -0.0711F, 0.6097F, -1.1994F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(55, 88).mirror().addBox(-4.1344F, -2.3955F, -0.471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0F, -2.6F, -0.084F, 0.6726F, -1.3284F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(72, 51).mirror().addBox(-3.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0F, -2.6F, 0.2863F, 0.6223F, -0.7264F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-2.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0F, -2.6F, 0.4892F, 0.4885F, -0.3457F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(72, 63).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -0.6F, 0.4353F, 0.5211F, -0.4413F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(65, 51).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -0.6F, 0.217F, 0.6346F, -0.8366F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(65, 51).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -0.6F, 0.217F, -0.6346F, 0.8366F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 63).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -0.6F, 0.4353F, -0.5211F, 0.4413F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(14, 70).addBox(0.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0F, -2.6F, 0.4892F, -0.4885F, 0.3457F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(72, 51).addBox(1.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0F, -2.6F, 0.2863F, -0.6223F, 0.7264F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(55, 88).addBox(3.1344F, -2.3955F, -0.471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0F, -2.6F, -0.084F, -0.6726F, 1.3284F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(64, 15).addBox(3.1344F, -2.3955F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -4.6F, -0.0711F, -0.6097F, 1.1994F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(21, 69).addBox(1.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -4.6F, 0.2545F, -0.5643F, 0.6229F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(69, 57).addBox(0.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -4.6F, 0.4378F, -0.4443F, 0.2476F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(21, 0).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.2342F, -4.3876F, 0.1222F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(51, 17).addBox(-0.5F, -0.4F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(89, 18).addBox(0.0F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3234F, -3.1169F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(6, 89).addBox(0.0F, -0.875F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(21, 7).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.1597F, -3.937F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(36, 22).mirror().addBox(-6.121F, -2.399F, -0.5124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, -0.0277F, 0.546F, -1.1463F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, 0.4056F, 0.3772F, -0.231F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, 0.2507F, 0.4911F, -0.5954F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(40, 12).mirror().addBox(-6.121F, -2.399F, -0.5124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -3.6F, -0.078F, 0.4662F, -1.1705F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -3.6F, 0.1623F, 0.4454F, -0.6351F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(70, 43).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -3.6F, 0.3091F, 0.3629F, -0.2658F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 43).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.1F, -3.6F, 0.3091F, -0.3629F, 0.2658F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 69).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.1F, -3.6F, 0.1623F, -0.4454F, 0.6351F));

		PartDefinition cube_r97 = body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(40, 12).addBox(3.121F, -2.399F, -0.5124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.1F, -3.6F, -0.078F, -0.4662F, 1.1705F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(66, 9).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, 0.2507F, -0.4911F, 0.5954F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(42, 70).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, 0.4056F, -0.3772F, 0.231F));

		PartDefinition cube_r100 = body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(36, 22).addBox(3.121F, -2.399F, -0.5124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, -0.0277F, -0.546F, 1.1463F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, -0.4F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0786F, 0.0435F, 0.0034F));

		PartDefinition cube_r101 = body4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(89, 21).addBox(0.0F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3234F, -3.1169F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(20, 89).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, -2.05F, -5.025F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.1983F, -0.4076F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(53, 28).mirror().addBox(-6.121F, -2.399F, -0.5124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, -0.0948F, 0.3952F, -1.189F));

		PartDefinition cube_r105 = body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(70, 45).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, 0.24F, 0.3305F, -0.3008F));

		PartDefinition cube_r106 = body4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 17).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, 0.1087F, 0.3918F, -0.6684F));

		PartDefinition cube_r107 = body4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-5.121F, -2.399F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, -3.6F, -0.1168F, 0.3682F, -1.2509F));

		PartDefinition cube_r108 = body4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, -3.6F, 0.0751F, 0.3784F, -0.7348F));

		PartDefinition cube_r109 = body4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, -3.6F, 0.2042F, 0.3292F, -0.3661F));

		PartDefinition cube_r110 = body4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(71, 0).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0F, -3.6F, 0.2042F, -0.3292F, 0.3661F));

		PartDefinition cube_r111 = body4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(69, 27).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0F, -3.6F, 0.0751F, -0.3784F, 0.7348F));

		PartDefinition cube_r112 = body4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 71).addBox(3.121F, -2.399F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0F, -3.6F, -0.1168F, -0.3682F, 1.2509F));

		PartDefinition cube_r113 = body4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(69, 17).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, 0.1087F, -0.3918F, 0.6684F));

		PartDefinition cube_r114 = body4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(70, 45).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, 0.24F, -0.3305F, 0.3008F));

		PartDefinition cube_r115 = body4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(53, 28).addBox(3.121F, -2.399F, -0.5124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, -0.0948F, -0.3952F, 1.189F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(51, 12).addBox(-1.5F, 4.7667F, -2.8296F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0708F, -0.2057F, -4.9622F, -0.0915F, 0.0257F, -0.0105F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(51, 37).addBox(-0.5648F, 0.1395F, 3.1618F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(89, 31).addBox(0.0F, -0.7663F, -0.0199F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, -0.0767F, -1.1223F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(89, 28).addBox(0.0F, -0.7505F, 0.0138F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.4233F, -3.1223F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(71, 2).mirror().addBox(-1.493F, 0.0479F, -0.4203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6356F, 0.8233F, -2.5223F, 0.5005F, 0.4834F, -0.4396F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(69, 29).mirror().addBox(-3.4193F, -0.4656F, -0.4203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6356F, 0.8233F, -2.5223F, 0.2999F, 0.6213F, -0.8176F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(0.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1415F, 5.8431F, -2.437F, -0.0073F, -1.2773F, -0.0374F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-1.9867F, -0.0324F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4356F, 0.4233F, -0.5223F, 0.4621F, 0.4371F, -0.3591F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(69, 19).mirror().addBox(-3.8558F, -0.71F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4356F, 0.4233F, -0.5223F, 0.2818F, 0.5656F, -0.7302F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(45, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4053F, 2.1864F, 1.3342F, -0.0484F, 0.6234F, -1.3081F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 52).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 5.8431F, -2.437F, -0.0073F, 1.2773F, 0.0374F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 41).addBox(-3.8643F, 0.3353F, -3.4116F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8643F, 4.8016F, -0.7965F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(45, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2637F, 2.1864F, 1.3342F, -0.0484F, -0.6234F, 1.3081F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(69, 19).addBox(1.8558F, -0.71F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2941F, 0.4233F, -0.5223F, 0.2818F, -0.5656F, 0.7302F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(71, 15).addBox(-0.0133F, -0.0324F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2941F, 0.4233F, -0.5223F, 0.4621F, -0.4371F, 0.3591F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(69, 29).addBox(1.4194F, -0.4656F, -0.4203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 0.8233F, -2.5223F, 0.2999F, -0.6213F, 0.8176F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(71, 2).addBox(-0.507F, 0.0479F, -0.4203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 0.8233F, -2.5223F, 0.5005F, -0.4834F, 0.4396F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create().texOffs(65, 43).addBox(-1.0F, -0.0359F, -0.4483F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.4454F, 4.5851F, -1.1724F, 1.119F, 0.07F, -0.7503F));

		PartDefinition cube_r132 = UpperArmL.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(74, 24).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.8038F, -0.6576F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r133 = UpperArmL.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(73, 8).addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 5.7762F, -0.891F, 2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r134 = UpperArmL.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(74, 53).addBox(-0.5F, -0.5952F, -0.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 5.9134F, 0.1182F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r135 = UpperArmL.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(31, 75).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(10, 76).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.6737F, 1.0068F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r136 = UpperArmL.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(74, 34).addBox(-0.5F, 0.2515F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(74, 21).addBox(-0.5F, -0.2735F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 5.9134F, 0.1182F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r137 = UpperArmL.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(44, 65).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r138 = UpperArmL.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(74, 31).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.035F, -0.4531F, 0.7854F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.902F, 6.6501F, 0.0425F, -0.7168F, 0.6649F, 0.3167F));

		PartDefinition cube_r139 = LowerArmL.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(68, 68).addBox(-0.5082F, -2.2519F, -0.5911F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1918F, 2.0606F, -0.343F, 0.0349F, 1.1781F, 0.0F));

		PartDefinition cube_r140 = LowerArmL.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(26, 73).addBox(-0.5082F, -2.2001F, -0.5165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1918F, 2.0606F, -0.343F, 0.2094F, 1.1781F, 0.0F));

		PartDefinition cube_r141 = LowerArmL.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(64, 53).addBox(-0.5082F, -0.6606F, -0.607F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(9, 56).addBox(-0.5082F, -2.6606F, 0.243F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1918F, 2.0606F, -0.343F, 0.0F, 1.1781F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(39, 50).addBox(-2.5F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1189F, 5.8858F, 0.4764F, 0.176F, -0.4098F, 0.0362F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(34, 24).addBox(-3.0F, -1.0F, -3.9F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.0087F, -1.9028F, -0.0087F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(0.0F, -0.0359F, -0.4483F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.5869F, 4.5851F, -1.1724F, 0.3706F, -0.19F, 0.8178F));

		PartDefinition cube_r142 = UpperArmL2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(74, 24).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.8038F, -0.6576F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r143 = UpperArmL2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.7762F, -0.891F, 2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r144 = UpperArmL2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-0.5F, -0.5952F, -0.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.9134F, 0.1182F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r145 = UpperArmL2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(31, 75).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(10, 76).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.6737F, 1.0068F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r146 = UpperArmL2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(74, 34).mirror().addBox(-0.5F, 0.2515F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(74, 21).mirror().addBox(-0.5F, -0.2735F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.9134F, 0.1182F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r147 = UpperArmL2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(44, 65).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r148 = UpperArmL2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(74, 31).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.035F, -0.4531F, 0.7854F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.902F, 6.6501F, 0.0425F, -0.6548F, -0.3967F, -0.4832F));

		PartDefinition cube_r149 = LowerArmL2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(68, 68).mirror().addBox(-0.4918F, -2.2519F, -0.5911F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 2.0606F, -0.343F, 0.0349F, -1.1781F, 0.0F));

		PartDefinition cube_r150 = LowerArmL2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-0.4918F, -2.2001F, -0.5165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 2.0606F, -0.343F, 0.2094F, -1.1781F, 0.0F));

		PartDefinition cube_r151 = LowerArmL2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-0.4918F, -0.6606F, -0.607F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(9, 56).mirror().addBox(-0.4918F, -2.6606F, 0.243F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 2.0606F, -0.343F, 0.0F, -1.1781F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create().texOffs(39, 50).mirror().addBox(-2.5F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1189F, 5.8858F, 0.4764F, 0.6999F, 0.403F, -0.0489F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create().texOffs(34, 24).mirror().addBox(-2.0F, -1.0F, -3.9F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0087F, -1.9028F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.7894F, 6.9489F, -4.4662F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0349F, -1.9161F, 1.9608F, -0.012F, 0.0258F, -0.1343F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(56, 81).addBox(-0.4985F, -0.064F, -0.4698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, 0.3807F, 0.0258F, -0.1343F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(71, 4).addBox(-0.4985F, -2.1132F, -0.5684F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, -0.1255F, 0.0258F, -0.1343F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(10, 82).addBox(-0.4985F, 0.6788F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 71).addBox(-0.4985F, 0.2788F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, -0.1866F, 0.0258F, -0.1343F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(82, 42).addBox(-0.5F, 0.1F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(35, 82).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5375F, -5.3805F, 0.6289F, 0.4642F, 0.0963F, -0.1105F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(30, 82).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4053F, -4.3908F, 0.5733F, -0.0557F, 0.0258F, -0.1343F));

		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(56, 70).addBox(-0.4985F, -1.5212F, -0.6022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, 0.2061F, 0.0258F, -0.1343F));

		PartDefinition cube_r159 = bone2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.425F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8666F, -2.8956F, 0.573F, 1.4758F, 0.1582F, 0.244F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.9309F, 6.9489F, -4.4662F));

		PartDefinition cube_r160 = bone4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0349F, -1.9161F, 1.9608F, -0.012F, -0.0258F, 0.1343F));

		PartDefinition cube_r161 = bone4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(56, 81).mirror().addBox(-0.5015F, -0.064F, -0.4698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, 0.3807F, -0.0258F, 0.1343F));

		PartDefinition cube_r162 = bone4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-0.5015F, -2.1132F, -0.5684F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, -0.1255F, -0.0258F, 0.1343F));

		PartDefinition cube_r163 = bone4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(10, 82).mirror().addBox(-0.5015F, 0.6788F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 71).mirror().addBox(-0.5015F, 0.2788F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, -0.1866F, -0.0258F, 0.1343F));

		PartDefinition cube_r164 = bone4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(82, 42).mirror().addBox(-0.5F, 0.1F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(35, 82).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5375F, -5.3805F, 0.6289F, 0.4642F, -0.0963F, 0.1105F));

		PartDefinition cube_r165 = bone4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4053F, -4.3908F, 0.5733F, -0.0557F, -0.0258F, 0.1343F));

		PartDefinition cube_r166 = bone4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(56, 70).mirror().addBox(-0.5015F, -1.5212F, -0.6022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, 0.2061F, -0.0258F, 0.1343F));

		PartDefinition cube_r167 = bone4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, -0.425F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8666F, -2.8956F, 0.573F, 1.4758F, -0.1582F, -0.244F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.3519F, -3.8154F, 0.1671F, 0.0665F, 0.1408F));

		PartDefinition cube_r168 = neck3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(89, 37).addBox(0.5F, -0.7305F, -0.0119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3701F, -3.1662F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r169 = neck3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(89, 34).addBox(0.5F, -0.7805F, -0.0119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5965F, -1.1791F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r170 = neck3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-1.6552F, 0.0397F, -0.5747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3297F, -0.2286F, -0.5069F, 0.1943F, 0.3517F, -0.3559F));

		PartDefinition cube_r171 = neck3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(66, 88).mirror().addBox(-1.0552F, 0.0397F, -0.5747F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3297F, -0.2286F, -2.5069F, -0.008F, 0.6224F, -0.4636F));

		PartDefinition cube_r172 = neck3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(66, 88).addBox(0.0552F, 0.0397F, -0.5747F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.2286F, -2.5069F, -0.008F, -0.6224F, 0.4636F));

		PartDefinition cube_r173 = neck3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(7, 71).addBox(-0.3448F, 0.0397F, -0.5747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.2286F, -0.5069F, 0.1943F, -0.3517F, 0.3559F));

		PartDefinition cube_r174 = neck3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(53, 23).addBox(-0.0648F, -1.8046F, 1.876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0038F, 0.1301F, -3.088F, 0.3099F, 0.1669F, 0.0523F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(71, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.061F, -2.0887F, -7.3512F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(66, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.061F, -1.6777F, -8.1663F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(61, 82).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.061F, -1.2898F, -8.8659F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(82, 58).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.061F, -0.9808F, -9.3803F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(82, 45).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.061F, -0.7808F, -9.7267F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(79, 62).addBox(-0.567F, 0.375F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0059F, -1.4545F, -9.6781F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(64, 85).addBox(-0.5F, -1.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(68, 65).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.061F, 0.0262F, -7.6439F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(49, 68).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(14, 60).addBox(-1.5F, -1.3F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(53, 58).addBox(-1.5F, -1.9F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.061F, 0.3387F, -5.8713F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(64, 11).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.061F, 0.4015F, -4.0724F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(55, 8).addBox(-2.5154F, -3.0F, 0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 62).addBox(-1.5154F, -4.0F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, 0.2522F, -0.0702F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(43, 43).addBox(-2.0154F, -2.0F, -2.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9544F, -1.7259F, 0.2255F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(55, 5).addBox(-1.9939F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.067F, -1.2887F, 0.3204F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(54, 50).addBox(-1.9939F, -1.0F, -1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(44, 54).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.067F, -2.7306F, 0.7339F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(56, 47).addBox(-2.5154F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9544F, -3.3325F, -0.39F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(21, 66).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.061F, -2.8966F, -6.0107F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(61, 65).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.061F, -3.0874F, -5.0291F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(49, 65).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.061F, -2.6235F, -4.4955F, -3.0718F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(84, 61).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(54, 84).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.939F, -3.2939F, -3.1059F, -1.4807F, 0.1068F, -0.8678F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(23, 62).addBox(-1.0F, -1.0F, -0.475F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.061F, -2.8236F, -3.0398F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(79, 52).addBox(-1.0154F, -0.975F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4544F, -3.7472F, -1.3F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(58, 61).addBox(-1.5154F, 0.0F, 0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, -3.7472F, -1.3F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(44, 57).addBox(-1.5F, 0.6F, 0.55F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(61, 68).addBox(-1.0F, 0.0F, 0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 59).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.067F, -3.6958F, -1.2799F, 0.3578F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1277F, 2.2692F, -9.2683F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(88, 9).addBox(-1.0639F, 0.4948F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7446F, -2.3978F, 0.5182F, -0.8365F, -1.1937F, 2.4635F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2519F, -2.9993F, -0.0303F, 1.5606F, -0.6757F, -0.2866F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(86, 3).addBox(-1.3082F, -0.746F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7446F, -2.3978F, 0.5182F, 1.2645F, -0.6124F, 0.2F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(86, 15).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 86).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4755F, -3.2837F, 0.4565F, 1.6749F, 0.3146F, -0.0627F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 86).addBox(-0.6835F, -1.054F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7446F, -2.3978F, 0.5182F, 1.3083F, 0.3146F, -0.0627F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(84, 38).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7321F, -3.2571F, 0.5407F, 1.6165F, 0.476F, 0.6334F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(84, 29).addBox(-0.6512F, -0.6861F, 0.1378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 0).addBox(-0.6512F, -0.6861F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7446F, -2.3978F, 0.5182F, 1.2998F, 0.3988F, -0.0873F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(77, 43).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8193F, -3.2168F, 0.679F, 0.6998F, 0.4091F, 1.0069F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(24, 77).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9368F, -3.1533F, 0.9476F, 1.7906F, 0.4091F, 1.0069F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(5, 77).addBox(-0.2292F, -1.4176F, 0.0668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 76).addBox(-0.2292F, -1.4176F, -0.1332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(76, 72).addBox(-0.3292F, -0.7176F, -0.0332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7196F, -2.0978F, 1.8182F, 1.3466F, 0.4068F, -0.0278F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 77).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2111F, -3.0053F, 1.5744F, 1.798F, 0.4052F, 1.0254F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(38, 72).addBox(-0.9963F, 0.0301F, -0.974F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2946F, -1.8978F, 3.5182F, -1.7191F, 0.5098F, -0.032F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(59, 85).addBox(-0.375F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 85).addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 85).addBox(-0.375F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.1843F, -1.7196F, 4.8946F, -1.5314F, 0.2046F, -0.035F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(53, 77).addBox(-0.5001F, 0.5455F, -0.3007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 46).addBox(-0.5001F, -0.1545F, -0.2007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 0).addBox(-0.5001F, -0.8545F, -1.0507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6164F, -2.5025F, 0.9515F, -1.8376F, 0.4052F, -0.0304F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(14, 63).addBox(-0.5001F, -1.5597F, -0.9696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6164F, -2.5025F, 0.9515F, -1.7503F, 0.4052F, -0.0304F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(62, 39).addBox(-0.325F, 0.8F, -1.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 35).addBox(-0.325F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 31).addBox(-0.325F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7585F, -1.6539F, 3.6681F, -1.666F, 0.4657F, -0.0427F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0162F, -0.1118F, -1.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5945F, -1.8978F, 4.3182F, -1.5299F, 0.3354F, -0.0296F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(81, 82).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2561F, -1.9048F, 5.1955F, -1.5699F, 0.2133F, -0.0286F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(83, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4696F, -1.7899F, 6.1657F, 3.0203F, 0.2133F, -0.0286F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(56, 43).addBox(-1.8F, -0.5F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0604F, -4.2341F, 2.4008F, 1.0245F, 0.3161F, 0.0329F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(65, 48).addBox(-1.7287F, -2.9989F, 1.677F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7767F, -5.1325F, 5.7351F, 2.4779F, 0.251F, -0.0748F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(7, 68).addBox(-1.7287F, 1.0235F, 1.9651F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7767F, -5.1325F, 5.7351F, -2.4963F, 0.251F, -0.0748F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(67, 24).addBox(-1.7287F, 1.8582F, -1.173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7767F, -5.1325F, 5.7351F, -1.2746F, 0.251F, -0.0748F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(14, 56).addBox(-1.7287F, -0.6071F, -2.4399F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7767F, -5.1325F, 5.7351F, 0.0344F, 0.251F, -0.0748F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(67, 21).addBox(-1.7287F, -0.8729F, -0.4502F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7767F, -5.1325F, 5.7351F, 1.5179F, 0.251F, -0.0748F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(14, 67).addBox(-1.7287F, -0.529F, -0.5499F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7767F, -5.1325F, 5.7351F, 2.6088F, 0.251F, -0.0748F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(49, 83).addBox(-0.5F, -0.8F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4996F, -4.8441F, 6.0825F, -2.9574F, 0.2133F, -0.4038F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(28, 66).addBox(-1.5F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.382F, -5.1296F, 6.1009F, -2.8962F, 0.1381F, -0.0575F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(20, 83).addBox(-0.6759F, 0.6356F, 1.1957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9696F, -2.7899F, 7.7657F, 3.0203F, 0.2133F, -0.4038F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(76, 82).addBox(-0.5F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2441F, -3.085F, 6.0519F, 2.7585F, 0.2133F, -0.4038F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(71, 72).addBox(-0.9508F, -1.8388F, -0.1733F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 72).addBox(-0.9508F, -1.8388F, 0.7017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9696F, -2.7899F, 7.7657F, 1.4977F, 0.0563F, -0.4032F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(7, 64).addBox(-2.2331F, -0.2653F, -0.9758F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9788F, -1.777F, 5.9958F, 2.059F, 0.0974F, -0.1051F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(14, 72).addBox(-1.0331F, 0.0597F, 0.0242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9788F, -1.777F, 5.9958F, 1.6285F, 0.0563F, -0.028F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(43, 72).addBox(-1.0331F, -2.8896F, -1.4458F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9788F, -1.777F, 5.9958F, -1.7574F, 0.0563F, -0.028F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(30, 62).addBox(-0.9301F, 0.5212F, -2.4657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9696F, -2.7899F, 7.7657F, -2.4889F, 0.0199F, -0.4261F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(50, 87).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4116F, -5.9636F, 9.227F, -1.5377F, 0.0199F, -0.4261F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(87, 44).addBox(-1.1F, -0.375F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8629F, -5.3145F, 9.3794F, -1.5481F, -0.0312F, 1.0568F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(10, 85).addBox(-1.0F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(84, 74).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8596F, -5.4683F, 9.0915F, -1.7121F, 0.1815F, 0.3924F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(83, 9).addBox(-0.9301F, -1.136F, -3.1232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(55, 53).addBox(-0.9301F, -1.3359F, -3.1232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9696F, -2.7899F, 7.7657F, -1.7995F, 0.0199F, -0.4261F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(72, 59).addBox(-0.9301F, -1.3564F, -1.632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(72, 47).addBox(-0.9301F, -1.3564F, -1.032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9696F, -2.7899F, 7.7657F, -1.5377F, 0.0199F, -0.4261F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(85, 64).addBox(-0.8801F, -0.4314F, -1.157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9696F, -2.7899F, 7.7657F, -1.5022F, 0.0777F, -0.4651F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(62, 27).addBox(-1.0331F, -3.2395F, -1.252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9788F, -1.777F, 5.9958F, -1.4956F, 0.0563F, -0.028F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(83, 6).addBox(-1.0331F, -0.4112F, 2.4145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9788F, -1.777F, 5.9958F, -0.2302F, 0.0563F, -0.028F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(84, 48).addBox(-0.8F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 84).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6819F, -4.3949F, 1.9908F, 0.4597F, 0.4176F, -0.2181F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(83, 68).addBox(-0.2F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1685F, -3.503F, 2.4506F, 0.5742F, 0.2213F, 0.141F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(84, 32).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, -4.1082F, 1.4737F, 0.4014F, 0.285F, -0.3029F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(83, 78).addBox(-0.3F, 0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1887F, -3.9469F, 1.102F, 0.4747F, 0.1166F, 0.0597F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(84, 35).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4311F, -3.7057F, 0.7185F, 0.403F, 0.3777F, -0.3401F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(15, 84).addBox(-0.35F, -0.075F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1887F, -3.559F, 0.4023F, 0.5127F, 0.1525F, 0.0853F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(84, 51).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3196F, -3.3785F, 0.1505F, 0.4147F, 0.3968F, -0.3906F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(84, 19).addBox(-0.35F, -0.175F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1887F, -3.25F, -0.112F, 0.5478F, 0.1494F, 0.0906F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(35, 68).addBox(-0.7F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3113F, -2.4286F, 2.8756F, 1.3862F, -0.5644F, 0.0697F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(25, 84).addBox(-0.575F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(84, 22).addBox(-0.575F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0613F, -2.9768F, -0.1852F, 0.5585F, 0.3378F, 0.2042F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(76, 17).addBox(-1.0331F, 1.4247F, 1.4612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(5, 83).addBox(-1.0331F, 0.4247F, 1.4612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9788F, -1.777F, 5.9958F, 0.4679F, 0.0563F, -0.028F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(63, 79).addBox(-1.0331F, 0.8417F, 0.4123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9788F, -1.777F, 5.9958F, 1.1922F, 0.0563F, -0.028F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2497F, 2.2692F, -9.2683F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(0.0639F, 0.4948F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7446F, -2.3978F, 0.5182F, -0.8365F, 1.1937F, -2.4635F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2519F, -2.9993F, -0.0303F, 1.5606F, 0.6757F, 0.2866F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(0.3082F, -0.746F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7446F, -2.3978F, 0.5182F, 1.2645F, 0.6124F, -0.2F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 86).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.4755F, -3.2837F, 0.4565F, 1.6749F, -0.3146F, 0.0627F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.3165F, -1.054F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7446F, -2.3978F, 0.5182F, 1.3083F, -0.3146F, 0.0627F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7321F, -3.2571F, 0.5407F, 1.6165F, -0.476F, -0.6334F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(84, 29).mirror().addBox(-0.3488F, -0.6861F, 0.1378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 0).mirror().addBox(-0.3488F, -0.6861F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7446F, -2.3978F, 0.5182F, 1.2998F, -0.3988F, 0.0873F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(77, 43).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8193F, -3.2168F, 0.679F, 0.6998F, -0.4091F, -1.0069F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(24, 77).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9368F, -3.1533F, 0.9476F, 1.7906F, -0.4091F, -1.0069F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.7709F, -1.4176F, 0.0668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(74, 76).mirror().addBox(-0.7709F, -1.4176F, -0.1332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(76, 72).mirror().addBox(-0.6708F, -0.7176F, -0.0332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7196F, -2.0978F, 1.8182F, 1.3466F, -0.4068F, 0.0278F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2111F, -3.0053F, 1.5744F, 1.798F, -0.4052F, -1.0254F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(38, 72).mirror().addBox(-0.0037F, 0.0301F, -0.974F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2946F, -1.8978F, 3.5182F, -1.7191F, -0.5098F, 0.032F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(59, 85).mirror().addBox(-0.625F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 85).mirror().addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 85).mirror().addBox(-0.625F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1843F, -1.7196F, 4.8946F, -1.5314F, -0.2046F, 0.035F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-0.4999F, 0.5455F, -0.3007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 46).mirror().addBox(-0.4999F, -0.1545F, -0.2007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 0).mirror().addBox(-0.4999F, -0.8545F, -1.0507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6164F, -2.5025F, 0.9515F, -1.8376F, -0.4052F, 0.0304F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.4999F, -1.5597F, -0.9696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6164F, -2.5025F, 0.9515F, -1.7503F, -0.4052F, 0.0304F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(62, 39).mirror().addBox(-0.675F, 0.8F, -1.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 35).mirror().addBox(-0.675F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 31).mirror().addBox(-0.675F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7585F, -1.6539F, 3.6681F, -1.666F, -0.4657F, 0.0427F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(0.0162F, -0.1118F, -1.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5945F, -1.8978F, 4.3182F, -1.5299F, -0.3354F, 0.0296F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(81, 82).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2561F, -1.9048F, 5.1955F, -1.5699F, -0.2133F, 0.0286F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4696F, -1.7899F, 6.1657F, 3.0203F, -0.2133F, 0.0286F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-0.2F, -0.5F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0604F, -4.2341F, 2.4008F, 1.0245F, -0.3161F, -0.0329F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-0.2713F, -2.9989F, 1.677F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7767F, -5.1325F, 5.7351F, 2.4779F, -0.251F, 0.0748F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.2713F, 1.0235F, 1.9651F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7767F, -5.1325F, 5.7351F, -2.4963F, -0.251F, 0.0748F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(67, 24).mirror().addBox(-0.2713F, 1.8582F, -1.173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7767F, -5.1325F, 5.7351F, -1.2746F, -0.251F, 0.0748F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-0.2713F, -0.6071F, -2.4399F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7767F, -5.1325F, 5.7351F, 0.0344F, -0.251F, 0.0748F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(67, 21).mirror().addBox(-0.2713F, -0.8729F, -0.4502F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7767F, -5.1325F, 5.7351F, 1.5179F, -0.251F, 0.0748F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.2713F, -0.529F, -0.5499F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7767F, -5.1325F, 5.7351F, 2.6088F, -0.251F, 0.0748F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(49, 83).mirror().addBox(-0.5F, -0.8F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4996F, -4.8441F, 6.0825F, -2.9574F, -0.2133F, 0.4038F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(28, 66).mirror().addBox(-0.5F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.382F, -5.1296F, 6.1009F, -2.8962F, -0.1381F, 0.0575F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.3241F, 0.6356F, 1.1957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9696F, -2.7899F, 7.7657F, 3.0203F, -0.2133F, 0.4038F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(-0.5F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2441F, -3.085F, 6.0519F, 2.7585F, -0.2133F, 0.4038F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(71, 72).mirror().addBox(-0.0492F, -1.8388F, -0.1733F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 72).mirror().addBox(-0.0492F, -1.8388F, 0.7017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9696F, -2.7899F, 7.7657F, 1.4977F, -0.0563F, 0.4032F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(1.2331F, -0.2653F, -0.9758F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9788F, -1.777F, 5.9958F, 2.059F, -0.0974F, 0.1051F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(0.0331F, 0.0597F, 0.0242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9788F, -1.777F, 5.9958F, 1.6285F, -0.0563F, 0.028F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(43, 72).mirror().addBox(0.0331F, -2.8896F, -1.4458F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9788F, -1.777F, 5.9958F, -1.7574F, -0.0563F, 0.028F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(-0.0699F, 0.5212F, -2.4657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9696F, -2.7899F, 7.7657F, -2.4889F, -0.0199F, 0.4261F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4116F, -5.9636F, 9.227F, -1.5377F, -0.0199F, 0.4261F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(87, 44).mirror().addBox(0.1F, -0.375F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8629F, -5.3145F, 9.3794F, -1.5481F, 0.0312F, -1.0568F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(0.0F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(84, 74).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8596F, -5.4683F, 9.0915F, -1.7121F, -0.1815F, -0.3924F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-0.0699F, -1.136F, -3.1232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(55, 53).mirror().addBox(-0.0699F, -1.3359F, -3.1232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9696F, -2.7899F, 7.7657F, -1.7995F, -0.0199F, 0.4261F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-0.0699F, -1.3564F, -1.632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(72, 47).mirror().addBox(-0.0699F, -1.3564F, -1.032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9696F, -2.7899F, 7.7657F, -1.5377F, -0.0199F, 0.4261F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(85, 64).mirror().addBox(-0.1199F, -0.4314F, -1.157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9696F, -2.7899F, 7.7657F, -1.5022F, -0.0777F, 0.4651F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(62, 27).mirror().addBox(0.0331F, -3.2395F, -1.252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9788F, -1.777F, 5.9958F, -1.4956F, -0.0563F, 0.028F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(0.0331F, -0.4112F, 2.4145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9788F, -1.777F, 5.9958F, -0.2302F, -0.0563F, 0.028F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(-0.2F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 84).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6819F, -4.3949F, 1.9908F, 0.4597F, -0.4176F, 0.2181F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(83, 68).mirror().addBox(-0.8F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1685F, -3.503F, 2.4506F, 0.5742F, -0.2213F, -0.141F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(84, 32).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5706F, -4.1082F, 1.4737F, 0.4014F, -0.285F, 0.3029F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(83, 78).mirror().addBox(-0.7F, 0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1887F, -3.9469F, 1.102F, 0.4747F, -0.1166F, -0.0597F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(84, 35).mirror().addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4311F, -3.7057F, 0.7185F, 0.403F, -0.3777F, 0.3401F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-0.65F, -0.075F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1887F, -3.559F, 0.4023F, 0.5127F, -0.1525F, -0.0853F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3196F, -3.3785F, 0.1505F, 0.4147F, -0.3968F, 0.3906F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(84, 19).mirror().addBox(-0.65F, -0.175F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1887F, -3.25F, -0.112F, 0.5478F, -0.1494F, -0.0906F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(-1.3F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3113F, -2.4286F, 2.8756F, 1.3862F, 0.5644F, -0.0697F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-0.425F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(84, 22).mirror().addBox(-0.425F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0613F, -2.9768F, -0.1852F, 0.5585F, -0.3378F, -0.2042F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(76, 17).mirror().addBox(0.0331F, 1.4247F, 1.4612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(5, 83).mirror().addBox(0.0331F, 0.4247F, 1.4612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9788F, -1.777F, 5.9958F, 0.4679F, -0.0563F, 0.028F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(63, 79).mirror().addBox(0.0331F, 0.8417F, 0.4123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9788F, -1.777F, 5.9958F, 1.1922F, -0.0563F, 0.028F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9543F, 1.7664F, -0.1997F, 0.9335F, 0.0035F, -0.0051F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(74, 85).mirror().addBox(-0.4799F, -1.6343F, -0.8912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, -1.9053F, -0.057F, 0.0642F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(86, 25).mirror().addBox(-0.4799F, -1.8787F, 0.3504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(45, 86).mirror().addBox(-0.4799F, -1.8787F, 0.6504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, -1.1199F, -0.057F, 0.0642F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(86, 54).mirror().addBox(-0.4799F, -1.685F, -0.6383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, -1.7308F, -0.057F, 0.0642F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(86, 71).mirror().addBox(-0.4799F, -0.8234F, 0.0306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, -0.3782F, -0.057F, 0.0642F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.4799F, -0.7944F, -1.0714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, -2.1671F, -0.057F, 0.0642F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(86, 81).mirror().addBox(-0.4799F, -0.6712F, -0.1132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, 0.8436F, -0.057F, 0.0642F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(15, 87).mirror().addBox(-0.4799F, 0.018F, -1.0332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, -2.4726F, -0.057F, 0.0642F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-0.4799F, 0.6213F, -0.8515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, -2.7344F, -0.057F, 0.0642F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(87, 57).mirror().addBox(-0.4799F, 1.107F, -0.5199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, -2.9962F, -0.057F, 0.0642F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(51, 61).mirror().addBox(-0.4799F, -0.0679F, 0.341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false)
				.texOffs(77, 59).mirror().addBox(-0.4799F, 0.6321F, 0.941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, 2.5016F, -0.057F, 0.0642F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-0.4799F, 0.6348F, 1.1774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, 2.3707F, -0.057F, 0.0642F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-0.4799F, -1.2336F, 1.6335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, 1.5853F, -0.057F, 0.0642F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(-0.4799F, -3.6052F, 0.5165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, 0.9396F, -0.057F, 0.0642F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(76, 27).mirror().addBox(-0.4799F, -2.9329F, -0.0161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, 0.957F, -0.057F, 0.0642F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(36, 76).mirror().addBox(-0.4799F, -0.2349F, 2.6348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, 2.4493F, -0.057F, 0.0642F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.15F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.397F, -3.297F, -4.4834F, 0.9104F, -0.3411F, 0.1905F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(78, 7).mirror().addBox(-0.1917F, -0.0715F, -0.8657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, -1.592F, -3.6535F, -2.3046F, -0.1925F, 0.1441F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-0.1917F, -0.8113F, -1.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, -1.592F, -3.6535F, -0.8036F, -0.1925F, 0.1441F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(78, 13).mirror().addBox(-0.1649F, -0.8929F, -0.8269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, -0.8472F, -0.3849F, 0.2695F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-0.1649F, -1.2347F, 0.227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, 0.8283F, -0.3849F, 0.2695F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(-0.1649F, -1.0549F, -2.982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, -0.8909F, -0.3849F, 0.2695F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(29, 78).mirror().addBox(-0.1649F, -0.8751F, -1.5278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, -0.8734F, -0.3849F, 0.2695F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(48, 75).mirror().addBox(-0.1649F, -2.2247F, -0.245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, 0.6101F, -0.3849F, 0.2695F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.1649F, -0.3355F, 1.9186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, 2.1373F, -0.3849F, 0.2695F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(46, 78).mirror().addBox(-0.1649F, -0.0863F, -3.1902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(58, 78).mirror().addBox(-0.1649F, -0.0863F, -3.3902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.2812F, -2.917F, -4.9285F, -1.2836F, -0.3849F, 0.2695F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(74, 37).mirror().addBox(-0.1649F, -1.1983F, -3.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.2812F, -2.917F, -4.9285F, -0.9345F, -0.3849F, 0.2695F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(59, 75).mirror().addBox(-0.1649F, 2.0615F, -3.3742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.2812F, -2.917F, -4.9285F, -1.8072F, -0.3849F, 0.2695F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(73, 68).mirror().addBox(-0.1649F, 2.0008F, -0.7104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-4.2812F, -2.917F, -4.9285F, -2.5577F, -0.3849F, 0.2695F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(78, 68).mirror().addBox(-0.4799F, -3.7929F, 0.7395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 20).mirror().addBox(-0.4799F, -3.1929F, 0.7395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, 0.508F, -0.9535F, 0.8697F, -0.057F, 0.0642F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(10, 79).mirror().addBox(-0.1917F, -0.8764F, 0.8616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 23).mirror().addBox(-0.1917F, -1.4764F, 0.8616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 36).mirror().addBox(-0.1917F, -0.8764F, 0.4116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(39, 79).mirror().addBox(-0.1917F, -1.1764F, 0.4116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-4.8312F, -1.592F, -3.6535F, 0.9417F, -0.1925F, 0.1441F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(79, 30).mirror().addBox(-0.1649F, -0.7597F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, 0.8545F, -0.3849F, 0.2695F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(79, 33).mirror().addBox(-0.1649F, -1.4621F, 0.6886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, 0.7673F, -0.3831F, 0.2693F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(34, 79).mirror().addBox(-0.1649F, -2.1222F, 0.6053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, 0.7149F, -0.3831F, 0.2693F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(75, 65).mirror().addBox(-0.1649F, -3.5325F, -0.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 4).mirror().addBox(-0.1649F, -2.9325F, 0.0174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.5312F, -2.492F, -4.6535F, 0.4531F, -0.3831F, 0.2693F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.1649F, -3.6121F, -0.9665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2812F, -2.917F, -4.9285F, 0.4008F, -0.3831F, 0.2693F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.1649F, -3.8092F, 0.3652F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2812F, -2.917F, -4.9285F, 0.7935F, -0.3831F, 0.2693F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(-0.1649F, -3.2448F, 2.5684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2812F, -2.917F, -4.9285F, 1.2734F, -0.3831F, 0.2693F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(-0.15F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.5881F, -6.0555F, -6.9337F, -1.7898F, -0.0447F, 0.1893F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(45, 86).addBox(-0.5201F, -1.8787F, 0.6504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(86, 25).addBox(-0.5201F, -1.8787F, 0.3504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, -1.1199F, 0.057F, -0.0642F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(77, 59).addBox(-0.5201F, 0.6321F, 0.941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(51, 61).addBox(-0.5201F, -0.0679F, 0.341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, 2.5016F, 0.057F, -0.0642F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(86, 81).addBox(-0.5201F, -0.6712F, -0.1132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, 0.8436F, 0.057F, -0.0642F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(86, 71).addBox(-0.5201F, -0.8234F, 0.0306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, -0.3782F, 0.057F, -0.0642F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(86, 54).addBox(-0.5201F, -1.685F, -0.6383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, -1.7308F, 0.057F, -0.0642F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(30, 88).addBox(-0.8351F, -0.3355F, 1.9186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, 2.1373F, 0.3849F, -0.2695F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(48, 75).addBox(-0.8351F, -2.2247F, -0.245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, 0.6101F, 0.3849F, -0.2695F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(29, 78).addBox(-0.8351F, -0.8751F, -1.5278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, -0.8734F, 0.3849F, -0.2695F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(78, 13).addBox(-0.8351F, -0.8929F, -0.8269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, -0.8472F, 0.3849F, -0.2695F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(78, 10).addBox(-0.8083F, -0.8113F, -1.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8006F, -1.592F, -3.6535F, -0.8036F, 0.1925F, -0.1441F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(78, 7).addBox(-0.8083F, -0.0715F, -0.8657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8006F, -1.592F, -3.6535F, -2.3046F, 0.1925F, -0.1441F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(36, 76).addBox(-0.5201F, -0.2349F, 2.6348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, 2.4493F, 0.057F, -0.0642F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(76, 27).addBox(-0.5201F, -2.9329F, -0.0161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, 0.957F, 0.057F, -0.0642F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(73, 68).addBox(-0.8351F, 2.0008F, -0.7104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2506F, -2.917F, -4.9285F, -2.5577F, 0.3849F, -0.2695F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(35, 88).addBox(-0.85F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4424F, -6.0555F, -6.9337F, -1.7898F, 0.0447F, -0.1893F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(59, 75).addBox(-0.8351F, 2.0615F, -3.3742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2506F, -2.917F, -4.9285F, -1.8072F, 0.3849F, -0.2695F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(74, 37).addBox(-0.8351F, -1.1983F, -3.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2506F, -2.917F, -4.9285F, -0.9345F, 0.3849F, -0.2695F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(58, 78).addBox(-0.8351F, -0.0863F, -3.3902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(46, 78).addBox(-0.8351F, -0.0863F, -3.1902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2506F, -2.917F, -4.9285F, -1.2836F, 0.3849F, -0.2695F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(37, 64).addBox(-0.8351F, -1.0549F, -2.982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, -0.8909F, 0.3849F, -0.2695F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(15, 78).addBox(-0.8351F, -1.2347F, 0.227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, 0.8283F, 0.3849F, -0.2695F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(74, 40).addBox(-0.8351F, -3.2448F, 2.5684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2506F, -2.917F, -4.9285F, 1.2734F, 0.3831F, -0.2693F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 65).addBox(-0.8351F, -3.8092F, 0.3652F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2506F, -2.917F, -4.9285F, 0.7935F, 0.3831F, -0.2693F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 61).addBox(-0.8351F, -3.6121F, -0.9665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2506F, -2.917F, -4.9285F, 0.4008F, 0.3831F, -0.2693F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(76, 4).addBox(-0.8351F, -2.9325F, 0.0174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(75, 65).addBox(-0.8351F, -3.5325F, -0.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, 0.4531F, 0.3831F, -0.2693F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(34, 79).addBox(-0.8351F, -2.1222F, 0.6053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, 0.7149F, 0.3831F, -0.2693F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(79, 33).addBox(-0.8351F, -1.4621F, 0.6886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, 0.7673F, 0.3831F, -0.2693F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(79, 30).addBox(-0.8351F, -0.7597F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5006F, -2.492F, -4.6535F, 0.8545F, 0.3849F, -0.2695F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(79, 23).addBox(-0.8083F, -1.4764F, 0.8616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 79).addBox(-0.8083F, -0.8764F, 0.8616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 79).addBox(-0.8083F, -1.1764F, 0.4116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(79, 36).addBox(-0.8083F, -0.8764F, 0.4116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8006F, -1.592F, -3.6535F, 0.9417F, 0.1925F, -0.1441F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(79, 20).addBox(-0.5201F, -3.1929F, 0.7395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(78, 68).addBox(-0.5201F, -3.7929F, 0.7395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, 0.8697F, 0.057F, -0.0642F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(78, 0).addBox(-0.85F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3664F, -3.297F, -4.4834F, 0.9104F, 0.3411F, -0.1905F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(28, 69).addBox(-0.5201F, -3.6052F, 0.5165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, 0.9396F, 0.057F, -0.0642F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(88, 6).addBox(-0.5201F, -1.2336F, 1.6335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, 1.5853F, 0.057F, -0.0642F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(88, 0).addBox(-0.5201F, 0.6348F, 1.1774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, 2.3707F, 0.057F, -0.0642F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(87, 57).addBox(-0.5201F, 1.107F, -0.5199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, -2.9962F, 0.057F, -0.0642F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(88, 12).addBox(-0.5201F, 0.6213F, -0.8515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, -2.7344F, 0.057F, -0.0642F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(15, 87).addBox(-0.5201F, 0.018F, -1.0332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, -2.4726F, 0.057F, -0.0642F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(10, 88).addBox(-0.5201F, -0.7944F, -1.0714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, -2.1671F, 0.057F, -0.0642F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(74, 85).addBox(-0.5201F, -1.6343F, -0.8912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8006F, 0.508F, -0.9535F, -1.9053F, 0.057F, -0.0642F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(49, 30).addBox(-0.5F, -0.4531F, 0.0037F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5808F, 2.9336F, 0.0748F, -0.1305F, -0.0098F));

		PartDefinition cube_r383 = tail.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(89, 84).addBox(0.0F, -1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 74).addBox(0.0F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 3.0037F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r384 = tail.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(74, 88).addBox(0.0F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4234F, 3.9065F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r385 = tail.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(26, 90).addBox(0.0F, 0.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4581F, 1.8452F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r386 = tail.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(89, 60).addBox(0.0F, -0.9544F, -0.9708F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 1.0037F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r387 = tail.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-1.5015F, 0.0F, -0.9651F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0469F, 1.0037F, -0.0239F, 0.0657F, -0.3521F));

		PartDefinition cube_r388 = tail.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(40, 0).addBox(-0.4985F, 0.0F, -0.9651F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0469F, 1.0037F, -0.0239F, -0.0657F, 0.3521F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(13, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4531F, 5.0037F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition cube_r389 = tail7.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(89, 50).addBox(0.0F, -0.7324F, -0.2891F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r390 = tail7.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(89, 47).addBox(0.0F, -0.9804F, 0.9608F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r391 = tail7.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(88, 77).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1607F, 3.6377F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r392 = tail7.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(77, 88).addBox(0.0F, -0.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8418F, 0.9641F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(36, 14).addBox(-0.5F, 0.0143F, 0.0362F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 90).addBox(0.0F, -0.4857F, 2.0362F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 90).addBox(0.0F, -0.3857F, 4.0362F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.9209F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition cube_r393 = tail2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(89, 87).addBox(0.0F, -1.3F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8143F, -0.0638F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r394 = tail2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(10, 73).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0822F, 4.804F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r395 = tail2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(48, 90).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2134F, 2.7686F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r396 = tail2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(40, 90).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4413F, 0.7591F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(17, 42).addBox(-0.5F, -0.4026F, -0.0453F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4143F, 6.0362F, 0.0532F, -0.1743F, -0.0092F));

		PartDefinition cube_r397 = tail8.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(83, 88).addBox(0.0F, 1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 88).addBox(0.0F, 0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6678F, -1.2323F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 23).addBox(-0.4968F, -0.1985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, -0.1936F, 4.7604F, -0.0013F, -0.0356F, -0.1839F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 24).addBox(-0.4968F, -0.6985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 7.0F, -0.0165F, 0.1301F, 0.0149F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.4968F, -0.6985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0393F, 0.3479F, 0.0277F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(17, 33).addBox(-0.4968F, -0.6985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0421F, 0.3052F, 0.0118F));

		PartDefinition tail9 = tail6.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(19, 15).addBox(-0.4968F, -0.6985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0046F, 0.5248F, -0.0239F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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