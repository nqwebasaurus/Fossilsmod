package fossils.fossils.client.blockentity.model.regaliceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RegaliceratopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart rightLowerbeak;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;

	public RegaliceratopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.rightLowerbeak = this.jaw.getChild("rightLowerbeak");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.1928F, -4.6534F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.1894F, 7.6308F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 22).addBox(0.0F, 0.036F, -5.0471F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2808F, 0.98F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, -0.0621F, -0.0662F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1808F, 0.98F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-2.0153F, -0.0181F, -0.7179F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.708F, -2.0985F, -3.7963F, 0.2759F, 0.0414F, 0.0037F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(-1.1957F, -0.0583F, -0.1133F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 0.397F, 0.0752F, -0.7241F, 0.042F, -0.2071F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(106, 84).mirror().addBox(0.3268F, 2.5019F, 0.7752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 6.197F, 4.9752F, -0.5852F, 0.0251F, -0.2725F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 44).mirror().addBox(-1.0731F, -0.5F, -1.3005F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.471F, -1.1424F, -5.1274F, 0.3129F, -0.0468F, -0.0261F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(94, 56).mirror().addBox(-3.9568F, -1.3833F, 0.049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, -1.703F, 2.6752F, -0.7025F, 0.271F, -0.2228F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 90).mirror().addBox(-4.0291F, -0.3828F, -1.3484F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, -1.703F, 2.6752F, -0.0282F, 0.3838F, -0.0106F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 62).mirror().addBox(-1.4439F, -3.5919F, -3.7375F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 1.297F, 0.5752F, 0.051F, -0.0481F, -0.0237F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 25).mirror().addBox(-1.6005F, 0.2595F, -1.1789F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, -1.703F, 2.6752F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(75, 65).mirror().addBox(-2.7005F, -0.3828F, -1.2043F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, -1.703F, 2.6752F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-3.4439F, -3.5919F, -3.4375F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 1.297F, 0.5752F, -0.0537F, -0.0481F, -0.0237F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(61, 57).mirror().addBox(-0.6167F, -0.5F, -2.0466F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.471F, -1.1424F, -5.1274F, 0.327F, 0.2932F, 0.0867F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(57, 91).mirror().addBox(-2.7005F, -1.3833F, 1.2405F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, -1.703F, 2.6752F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(7, 95).mirror().addBox(0.3268F, 0.0588F, -0.8727F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 6.197F, 4.9752F, -0.0267F, 0.0251F, -0.2725F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 87).mirror().addBox(-0.7162F, -0.5587F, 1.5903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 2.397F, 2.3752F, -1.0451F, 0.0063F, -0.2736F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(94, 39).mirror().addBox(-0.7101F, -0.0133F, -0.2353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 2.397F, 2.3752F, -0.7016F, 0.0126F, -0.2289F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(93, 13).mirror().addBox(-1.1957F, -1.4434F, -0.6187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 0.397F, 0.0752F, -2.2077F, 0.042F, -0.2071F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-1.1957F, 1.1959F, -0.3635F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 0.397F, 0.0752F, -0.3053F, 0.042F, -0.2071F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(93, 21).mirror().addBox(-1.4843F, 0.4591F, -1.1373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8995F, 0.397F, -2.1248F, -0.4761F, 0.2406F, 0.1043F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(64, 68).mirror().addBox(-0.7428F, -0.1067F, -4.042F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 2.197F, 0.5752F, -0.1592F, 0.1637F, -0.0262F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(83, 82).mirror().addBox(-1.7408F, -0.5995F, -2.343F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8995F, 0.397F, -2.1248F, 0.7945F, 0.0501F, 0.0153F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3662F, 3.1548F, -5.7564F, 0.7509F, 0.0501F, 0.0153F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3733F, 2.5213F, -6.0908F, 1.7544F, 0.0501F, 0.0153F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(99, 81).mirror().addBox(-1.7408F, 0.1273F, -6.1514F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(85, 53).mirror().addBox(-1.7408F, 0.4273F, -4.3514F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8995F, 0.397F, -2.1248F, 0.3582F, 0.0501F, 0.0153F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.1422F, -1.4801F, -4.0132F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 0.997F, 0.5752F, -0.137F, 0.0656F, -0.1266F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(48, 85).mirror().addBox(-1.6005F, -2.5822F, 0.0698F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(48, 85).addBox(5.1995F, -2.5822F, 0.0698F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2995F, 1.297F, 0.5752F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 62).addBox(0.4439F, -3.5919F, -3.7375F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 1.297F, 0.5752F, 0.051F, 0.0481F, 0.0237F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(25, 0).addBox(0.4439F, -3.5919F, -3.4375F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 1.297F, 0.5752F, -0.0537F, 0.0481F, 0.0237F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(73, 44).addBox(0.0731F, -0.5F, -1.3005F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.471F, -1.1424F, -5.1274F, 0.3129F, 0.0468F, 0.0261F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 90).addBox(0.0153F, -0.0181F, -0.7179F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.708F, -2.0985F, -3.7963F, 0.2759F, -0.0414F, -0.0037F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(61, 57).addBox(-1.3833F, -0.5F, -2.0466F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.471F, -1.1424F, -5.1274F, 0.327F, -0.2932F, -0.0867F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(48, 90).addBox(2.0291F, -0.3828F, -1.3484F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2995F, -1.703F, 2.6752F, -0.0282F, -0.3838F, 0.0106F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(75, 65).addBox(0.7005F, -0.3828F, -1.2043F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2995F, -1.703F, 2.6752F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(94, 56).addBox(2.9568F, -1.3833F, 0.049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2995F, -1.703F, 2.6752F, -0.7025F, -0.271F, 0.2228F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(57, 91).addBox(0.7005F, -1.3833F, 1.2405F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2995F, -1.703F, 2.6752F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(106, 84).addBox(-1.3268F, 2.5019F, 0.7752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2995F, 6.197F, 4.9752F, -0.5852F, -0.0251F, 0.2725F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(7, 95).addBox(-1.3268F, 0.0588F, -0.8727F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 6.197F, 4.9752F, -0.0267F, -0.0251F, 0.2725F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 87).addBox(-0.2838F, -0.5587F, 1.5903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2995F, 2.397F, 2.3752F, -1.0451F, -0.0063F, 0.2736F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(94, 39).addBox(-0.2899F, -0.0133F, -0.2353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 2.397F, 2.3752F, -0.7016F, -0.0126F, 0.2289F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(93, 13).addBox(0.1957F, -1.4434F, -0.6187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2995F, 0.397F, 0.0752F, -2.2077F, -0.042F, 0.2071F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(85, 58).addBox(0.1957F, -0.0583F, -0.1133F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2995F, 0.397F, 0.0752F, -0.7241F, -0.042F, 0.2071F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 85).addBox(0.1957F, 1.1959F, -0.3635F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 0.397F, 0.0752F, -0.3053F, -0.042F, 0.2071F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(93, 21).addBox(0.4843F, 0.4591F, -1.1373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8995F, 0.397F, -2.1248F, -0.4761F, -0.2406F, -0.1043F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(64, 68).addBox(-0.2572F, -0.1067F, -4.042F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 2.197F, 0.5752F, -0.1592F, -0.1637F, 0.0262F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(83, 82).addBox(0.7408F, -0.5995F, -2.343F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8995F, 0.397F, -2.1248F, 0.7945F, -0.0501F, -0.0153F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(93, 9).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3662F, 3.1548F, -5.7564F, 0.7509F, -0.0501F, -0.0153F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3733F, 2.5213F, -6.0908F, 1.7544F, -0.0501F, -0.0153F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(99, 81).addBox(0.7408F, 0.1273F, -6.1514F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(85, 53).addBox(0.7408F, 0.4273F, -4.3514F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8995F, 0.397F, -2.1248F, 0.3582F, -0.0501F, -0.0153F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 60).addBox(0.1422F, -1.4801F, -4.0132F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 0.997F, 0.5752F, -0.137F, -0.0656F, 0.1266F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(19, 33).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 33).mirror().addBox(-1.5F, 0.0F, -5.5F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.786F, -0.1135F, -3.098F, 0.0F, -3.1416F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(19, 33).addBox(-1.5F, 0.0F, -5.5F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(19, 33).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.786F, -0.1135F, -3.098F, 0.0F, 3.1416F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(73, 25).addBox(0.6005F, 0.2595F, -1.1789F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2995F, -1.703F, 2.6752F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 13).addBox(-1.0F, -0.1962F, 0.0069F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(100, 32).addBox(1.0F, 0.8038F, 3.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 61).addBox(1.0F, 0.8038F, 1.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 2).addBox(0.8F, 0.8038F, 5.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 32).mirror().addBox(-3.0F, 0.8038F, 3.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 2).mirror().addBox(-2.8F, 0.8038F, 5.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 61).mirror().addBox(-3.0F, 0.8038F, 1.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9482F, 5.249F, -0.4204F, 0.0781F, -0.039F));

		PartDefinition cube_r54 = tail.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(102, 106).addBox(0.0F, -1.6F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3972F, 6.4283F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(106, 87).addBox(0.0F, -3.0271F, 0.8135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5035F, 3.8703F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(94, 106).addBox(0.0F, -0.8473F, -0.0968F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 5.2394F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(107, 25).addBox(0.0F, -3.582F, 1.192F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 1.4245F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(107, 19).addBox(0.0F, -3.382F, -0.808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 1.4245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(38, 23).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(100, 22).addBox(0.3F, -0.1697F, -0.1085F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 24).addBox(0.1F, -0.1697F, 1.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 65).addBox(1.0F, -0.1697F, 3.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 22).mirror().addBox(-2.3F, -0.1697F, -0.1085F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 24).mirror().addBox(-2.1F, -0.1697F, 1.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 65).mirror().addBox(-2.0F, -0.1697F, 3.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9287F, 6.8862F, 0.3653F, 0.1071F, 0.0871F));

		PartDefinition cube_r59 = tail2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(107, 63).addBox(0.0F, -2.4544F, 1.2508F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 0.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(107, 29).addBox(0.0F, -0.6547F, 0.0262F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, -0.1586F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(13, 107).addBox(0.0F, 1.0F, 4.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 107).addBox(0.0F, 0.5F, 2.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 0).addBox(0.0F, -0.5F, 0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4685F, -0.4579F, 0.5498F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(26, 49).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9157F, 4.5271F, 0.3401F, 0.1368F, 0.1393F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(38, 33).addBox(-0.5F, -0.2498F, 0.0085F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0323F, 4.8382F, -0.1949F, 0.1713F, -0.0336F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(48, 61).addBox(-1.5F, 7.7833F, -4.4553F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, 0.2948F, -1.2628F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftleg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 0).addBox(0.5F, -2.4871F, 0.3264F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 8.7705F, -5.3817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftleg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(44, 0).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftleg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(39, 55).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.7568F, -3.2542F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftleg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(39, 49).addBox(-0.1F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(43, 83).addBox(-0.1F, -0.4383F, -0.1279F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 1.844F, 0.5254F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftleg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(42, 67).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.1944F, -0.842F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftleg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(84, 10).addBox(-1.601F, 2.8011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(89, 35).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 4.8533F, -0.1152F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftleg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(13, 79).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 8.2063F, 2.0864F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.4514F, 3.287F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftleg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(53, 68).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.979F, -1.1583F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2484F, -0.3386F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftfoot.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(57, 12).addBox(-1.0F, -2.7989F, 2.89F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 4.4261F, -0.8059F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(0, 34).addBox(-1.999F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1009F, -0.567F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(61, 51).addBox(-1.5F, 7.7833F, -4.4553F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9F, 0.2948F, -1.2628F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightleg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(75, 5).addBox(-3.5F, -2.4871F, 0.3264F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 8.7705F, -5.3817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightleg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(13, 47).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightleg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(57, 0).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.7568F, -3.2542F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightleg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(36, 91).addBox(-0.9F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(84, 37).addBox(-0.9F, -0.4383F, -0.1279F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 1.844F, 0.5254F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightleg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 3.1944F, -0.842F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightleg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(84, 20).addBox(-0.399F, 2.8011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(66, 89).addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 4.8533F, -0.1152F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightleg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 79).addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 8.2063F, 2.0864F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.4514F, 3.287F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightleg3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(20, 69).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.979F, -1.1583F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1484F, 0.4614F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightfoot.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(9, 92).addBox(-2.0F, -2.7989F, 2.89F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(38, 8).addBox(-2.001F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.274F, -1.4424F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.128F, -4.399F, 0.297F, -0.0411F, -0.0146F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(34, 106).addBox(0.0F, -2.9352F, -1.946F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 106).addBox(0.0F, -2.7512F, -3.8254F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 100).addBox(0.0F, -2.4854F, -5.7314F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3064F, 0.784F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(72, 100).addBox(0.0F, -2.8913F, -1.2728F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9936F, -5.516F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(5, 100).addBox(0.0F, -2.6357F, -0.3345F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2936F, -10.616F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(35, 56).addBox(0.0F, -3.1139F, -0.328F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6936F, -8.516F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(100, 66).mirror().addBox(-0.9904F, -0.103F, -0.3289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0551F, -0.6347F, -0.5624F, -0.4986F, -0.0426F, -0.1254F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(100, 73).mirror().addBox(-3.0641F, 0.0008F, -1.1761F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.4936F, -1.616F, -0.4817F, -0.1723F, -0.1329F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(99, 89).mirror().addBox(-2.9718F, -0.2407F, -0.437F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9936F, -8.816F, -0.0277F, -0.0361F, -0.312F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(95, 71).mirror().addBox(-4.4171F, -1.7467F, -0.5018F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9936F, -8.816F, -0.0463F, -0.0483F, -0.8569F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(36, 81).mirror().addBox(-11.4406F, -3.7297F, -2.549F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9936F, -8.816F, -0.0168F, 0.3364F, -1.3877F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(89, 43).mirror().addBox(-6.8529F, -3.7213F, -0.9267F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9936F, -8.816F, -0.0159F, 0.0921F, -1.3836F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(38, 31).mirror().addBox(-11.5097F, -2.574F, -0.8843F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.0936F, -10.516F, 0.0274F, 0.2277F, -1.3771F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(100, 75).mirror().addBox(-3.504F, -0.9491F, -0.6673F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.0936F, -10.516F, 0.1027F, 0.1231F, -0.8513F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 87).mirror().addBox(-1.781F, -0.0382F, -0.6326F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.0936F, -10.516F, 0.1882F, 0.0338F, -0.3122F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(92, 50).mirror().addBox(-5.4611F, -3.7545F, -1.6186F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.3936F, -4.316F, -0.0705F, -0.1124F, -1.3868F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(100, 68).mirror().addBox(-6.0738F, -3.7593F, -4.0632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.3936F, -4.316F, -0.0658F, 0.392F, -1.4165F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(100, 28).mirror().addBox(-4.3396F, -1.813F, -0.6653F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.3936F, -4.316F, -0.3478F, -0.3713F, -0.7928F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(100, 26).mirror().addBox(-2.9565F, -0.2971F, -0.5441F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.3936F, -4.316F, -0.5331F, -0.1857F, -0.2547F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-10.1759F, -3.7558F, -2.3884F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8936F, -6.516F, -0.0557F, 0.2F, -1.4005F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(93, 4).mirror().addBox(-5.5898F, -3.7533F, -1.1625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8936F, -6.516F, -0.0546F, -0.0266F, -1.3879F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(29, 86).mirror().addBox(-4.2885F, -1.858F, -0.4891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8936F, -6.516F, -0.1858F, -0.2056F, -0.8391F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(66, 19).mirror().addBox(-0.9872F, -0.4555F, -1.4989F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.8683F, -3.4255F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(31, 62).mirror().addBox(-0.9872F, -0.4555F, -1.4989F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -1.1683F, -5.4255F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(95, 63).mirror().addBox(-1.625F, -0.9114F, -2.1688F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 95).mirror().addBox(-1.7874F, -1.2609F, -4.1717F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9936F, -6.816F, 0.2366F, -0.12F, 0.5619F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(99, 85).mirror().addBox(-2.9282F, -0.37F, -0.3722F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8936F, -6.516F, -0.3119F, -0.1245F, -0.289F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(99, 89).addBox(0.9718F, -0.2407F, -0.437F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9936F, -8.816F, -0.0277F, 0.0361F, 0.312F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(95, 71).addBox(2.4171F, -1.7467F, -0.5018F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9936F, -8.816F, -0.0463F, 0.0483F, 0.8569F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(36, 81).addBox(6.4406F, -3.7297F, -2.549F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9936F, -8.816F, -0.0168F, -0.3364F, 1.3877F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(89, 43).addBox(2.8529F, -3.7213F, -0.9267F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9936F, -8.816F, -0.0159F, -0.0921F, 1.3836F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(38, 31).addBox(2.5097F, -2.574F, -0.8843F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -1.0936F, -10.516F, 0.0274F, -0.2277F, 1.3771F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(100, 75).addBox(1.504F, -0.9491F, -0.6673F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -1.0936F, -10.516F, 0.1027F, -0.1231F, 0.8513F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(99, 87).addBox(-0.219F, -0.0382F, -0.6326F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -1.0936F, -10.516F, 0.1882F, -0.0338F, 0.3122F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(92, 50).addBox(2.4611F, -3.7545F, -1.6186F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.3936F, -4.316F, -0.0705F, 0.1124F, 1.3868F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(100, 68).addBox(4.0738F, -3.7593F, -4.0632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.3936F, -4.316F, -0.0658F, -0.392F, 1.4165F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(100, 66).addBox(-1.0096F, -0.103F, -0.3289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0551F, -0.6347F, -0.5624F, -0.4986F, 0.0426F, 0.1254F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(100, 73).addBox(1.0641F, 0.0008F, -1.1761F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.4936F, -1.616F, -0.4817F, 0.1723F, 0.1329F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(100, 28).addBox(2.3396F, -1.813F, -0.6653F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.3936F, -4.316F, -0.3478F, 0.3713F, 0.7928F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(100, 26).addBox(0.9565F, -0.2971F, -0.5441F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.3936F, -4.316F, -0.5331F, 0.1857F, 0.2547F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 79).addBox(5.1759F, -3.7558F, -2.3884F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8936F, -6.516F, -0.0557F, -0.2F, 1.4005F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(93, 4).addBox(2.5898F, -3.7533F, -1.1625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8936F, -6.516F, -0.0546F, 0.0266F, 1.3879F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(29, 86).addBox(2.2885F, -1.858F, -0.4891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8936F, -6.516F, -0.1858F, 0.2056F, 0.8391F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(66, 19).addBox(-1.0128F, -0.4555F, -1.4989F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.8683F, -3.4255F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(31, 62).addBox(-1.0128F, -0.4555F, -1.4989F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -1.1683F, -5.4255F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(95, 63).addBox(-0.375F, -0.9114F, -2.1688F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 95).addBox(-0.2126F, -1.2609F, -4.1717F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9936F, -6.816F, 0.2366F, 0.12F, -0.5619F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(99, 85).addBox(0.9282F, -0.37F, -0.3722F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8936F, -6.516F, -0.3119F, 0.1245F, 0.289F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(47, 41).addBox(-1.0F, -0.1079F, -4.0367F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9936F, -6.816F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(19, 23).addBox(-1.0F, -1.3073F, -7.6534F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.3064F, 0.784F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9682F, -10.4134F, -0.0699F, -0.0435F, 0.003F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(8, 100).addBox(0.0F, -1.7377F, -0.9685F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.147F, -3.119F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(32, 92).addBox(0.0F, -2.0739F, -1.101F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.853F, -1.219F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(99, 105).addBox(0.0F, -1.6359F, -1.1327F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.247F, -4.719F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(99, 45).mirror().addBox(-1.9692F, -0.1293F, -0.9049F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.453F, -1.619F, 0.3716F, 0.0919F, -0.3007F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(99, 47).mirror().addBox(-3.6186F, -1.1132F, -0.9463F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.453F, -1.619F, 0.2334F, 0.2661F, -0.8259F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-10.5772F, -2.7734F, -0.9463F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.453F, -1.619F, 0.0657F, 0.3462F, -1.3694F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.5F, -0.1F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.498F, 3.167F, -3.4738F, 1.2801F, -0.0672F, 0.0803F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(51, 79).mirror().addBox(0.1879F, -0.2653F, -0.2701F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -0.3066F, -2.1417F, 1.5855F, -0.0672F, 0.0803F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(60, 45).mirror().addBox(-0.7021F, 0.0416F, -0.6972F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6737F, 9.2734F, 0.9694F, 1.2916F, -1.2501F, -0.9782F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(100, 20).mirror().addBox(-1.9534F, -0.1441F, -0.5831F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7562F, -4.9273F, 0.5563F, 0.1478F, -0.3652F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(100, 30).mirror().addBox(-3.5965F, -1.131F, -0.6251F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7562F, -4.9273F, 0.3736F, 0.405F, -0.8663F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(86, 7).mirror().addBox(-6.5492F, -2.7777F, -0.6251F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7562F, -4.9273F, 0.1088F, 0.5339F, -1.4376F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-2.9741F, -0.2587F, -0.7362F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.453F, -3.519F, 0.42F, 0.1129F, -0.3479F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(57, 10).mirror().addBox(-9.9443F, -3.7217F, -0.8014F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.453F, -3.519F, 0.0708F, 0.3985F, -1.4197F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(97, 6).mirror().addBox(-4.4107F, -1.751F, -0.8014F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.453F, -3.519F, 0.266F, 0.3083F, -0.8689F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(11, 62).mirror().addBox(1.4098F, -2.2843F, -3.1036F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 7.7934F, -3.7417F, 1.4408F, -0.1533F, -0.8627F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(1.3643F, -2.2843F, 0.4197F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 7.7934F, -3.7417F, 1.3964F, -0.0998F, -0.5149F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(92, 82).mirror().addBox(0.033F, 0.7972F, 6.0965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.8934F, -4.8417F, 1.1056F, -0.0672F, 0.0803F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(0.033F, -0.3852F, -1.0897F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.8934F, -4.8417F, 0.931F, -0.0672F, 0.0803F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(48, 55).mirror().addBox(-0.4503F, -0.3036F, -1.8659F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 9.2734F, 0.4694F, 2.0496F, -1.2033F, -1.7696F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(60, 39).mirror().addBox(0.0879F, -0.0939F, -0.6928F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 9.4063F, 0.8243F, 0.5407F, -1.161F, -0.3333F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(106, 34).mirror().addBox(0.9737F, 0.6114F, 2.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(106, 34).addBox(2.3737F, 0.6114F, 2.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 8.276F, -1.7521F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(74, 60).mirror().addBox(-0.0263F, 0.6114F, -2.4179F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(74, 60).addBox(2.3737F, 0.6114F, -2.4179F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 8.576F, 0.2479F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(53, 33).mirror().addBox(-0.0263F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 33).addBox(2.3737F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1737F, 10.176F, -2.0521F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(76, 95).mirror().addBox(-1.0056F, -0.5228F, 0.5761F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 60).mirror().addBox(-0.7361F, -0.2567F, -1.4463F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5208F, -2.8239F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(100, 20).addBox(-0.0466F, -0.1441F, -0.5831F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7562F, -4.9273F, 0.5563F, -0.1478F, 0.3652F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(100, 30).addBox(1.5965F, -1.131F, -0.6251F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7562F, -4.9273F, 0.3736F, -0.405F, 0.8663F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(86, 7).addBox(2.5492F, -2.7777F, -0.6251F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7562F, -4.9273F, 0.1088F, -0.5339F, 1.4376F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 41).addBox(2.5772F, -2.7734F, -0.9463F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.453F, -1.619F, 0.0657F, -0.3462F, 1.3694F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(99, 47).addBox(1.6186F, -1.1132F, -0.9463F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.453F, -1.619F, 0.2334F, -0.2661F, 0.8259F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(99, 45).addBox(-0.0308F, -0.1293F, -0.9049F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.453F, -1.619F, 0.3716F, -0.0919F, 0.3007F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(100, 0).addBox(0.9741F, -0.2587F, -0.7362F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.453F, -3.519F, 0.42F, -0.1129F, 0.3479F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(57, 10).addBox(2.9443F, -3.7217F, -0.8014F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.453F, -3.519F, 0.0708F, -0.3985F, 1.4197F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(97, 6).addBox(2.4107F, -1.751F, -0.8014F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.453F, -3.519F, 0.266F, -0.3083F, 0.8689F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(11, 62).addBox(-2.4098F, -2.2843F, -3.1036F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.0F, 7.7934F, -3.7417F, 1.4408F, 0.1533F, 0.8627F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(86, 0).addBox(-2.3643F, -2.2843F, 0.4197F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 7.7934F, -3.7417F, 1.3964F, 0.0998F, 0.5149F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(92, 82).addBox(-1.033F, 0.7972F, 6.0965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 3.8934F, -4.8417F, 1.1056F, 0.0672F, -0.0803F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(51, 79).addBox(-1.1879F, -0.2653F, -0.2701F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.0F, -0.3066F, -2.1417F, 1.5855F, 0.0672F, -0.0803F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.498F, 3.167F, -3.4738F, 1.2801F, 0.0672F, -0.0803F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 13).addBox(-1.033F, -0.3852F, -1.0897F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 3.8934F, -4.8417F, 0.931F, 0.0672F, -0.0803F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(60, 45).addBox(-0.2979F, 0.0416F, -0.6972F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6737F, 9.2734F, 0.9694F, 1.2916F, 1.2501F, 0.9782F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(48, 55).addBox(-0.5497F, -0.3036F, -1.8659F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 9.2734F, 0.4694F, 2.0496F, 1.2033F, 1.7696F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(60, 39).addBox(-1.0879F, -0.0939F, -0.6928F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 9.4063F, 0.8243F, 0.5407F, 1.161F, 0.3333F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(76, 95).addBox(-0.9944F, -0.5228F, 0.5761F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 60).addBox(-1.2639F, -0.2567F, -1.4463F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5208F, -2.8239F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -0.907F, 0.5334F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.247F, -6.719F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8972F, 7.4105F, -2.2145F, 0.0899F, -0.0302F, -0.1719F));

		PartDefinition cube_r171 = leftarm.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(77, 10).addBox(-0.0544F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r172 = leftarm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(95, 66).addBox(-0.1791F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r173 = leftarm.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(11, 71).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(74, 50).addBox(-2.0F, -3.1F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(86, 30).addBox(-0.9824F, -3.7907F, -0.4712F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4463F, 5.3164F, 2.2503F, 0.1747F, -0.7052F, 0.2803F));

		PartDefinition cube_r176 = leftarm2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(67, 81).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 22).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1278F, 5.6806F, -1.8235F, 1.4827F, 0.6267F, -0.3359F));

		PartDefinition cube_r177 = lefthand.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(82, 74).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r178 = lefthand.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(25, 8).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1828F, 0.0368F, -0.1793F));

		PartDefinition cube_r179 = lefthand.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(74, 87).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9327F, -0.3374F, 0.2997F));

		PartDefinition cube_r180 = lefthand.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(71, 91).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8972F, 7.4105F, -2.2145F, 0.6138F, -0.0201F, 0.2433F));

		PartDefinition cube_r181 = rightarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(29, 78).addBox(-0.9456F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r182 = rightarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(71, 95).addBox(-0.8209F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r183 = rightarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(42, 73).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r184 = rightarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(51, 74).addBox(-1.0F, -3.1F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightarm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(86, 63).addBox(-1.0176F, -3.7907F, -0.4712F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4463F, 5.3164F, 2.2503F, -1.1774F, 0.719F, -1.6996F));

		PartDefinition cube_r186 = rightarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(36, 83).addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 0).addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1278F, 5.6806F, -1.8235F, 1.6136F, -0.6267F, 0.3359F));

		PartDefinition cube_r187 = righthand.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(83, 78).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r188 = righthand.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(61, 63).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.6582F, -0.0511F, 0.1759F));

		PartDefinition cube_r189 = righthand.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(83, 87).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.6272F, 0.3374F, -0.2997F));

		PartDefinition cube_r190 = righthand.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(80, 91).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, -6.018F, 0.035F, -0.0872F, -0.0031F));

		PartDefinition cube_r191 = neck2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(77, 106).addBox(0.0F, -1.6703F, -0.1461F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8216F, -0.9034F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(105, 106).addBox(0.0F, -1.7066F, -0.1241F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5216F, -2.9034F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r193 = neck2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(43, 92).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.494F, -2.5788F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r194 = neck2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(100, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.494F, -2.5788F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r195 = neck2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(59, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.094F, -0.5788F, 0.4388F, 0.3373F, -0.4183F));

		PartDefinition cube_r196 = neck2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.094F, -0.5788F, 0.1565F, 0.51F, -0.9873F));

		PartDefinition cube_r197 = neck2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(67, 79).mirror().addBox(-3.6959F, -2.752F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.094F, -0.5788F, -0.1454F, 0.513F, -1.59F));

		PartDefinition cube_r198 = neck2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(43, 92).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.494F, -2.5788F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r199 = neck2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(100, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.494F, -2.5788F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r200 = neck2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(59, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.094F, -0.5788F, 0.4388F, -0.3373F, 0.4183F));

		PartDefinition cube_r201 = neck2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(53, 39).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.094F, -0.5788F, 0.1565F, -0.51F, 0.9873F));

		PartDefinition cube_r202 = neck2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(67, 79).addBox(2.6959F, -2.752F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.094F, -0.5788F, -0.1454F, -0.513F, 1.59F));

		PartDefinition cube_r203 = neck2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(73, 38).addBox(-1.0F, -1.1F, -2.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2784F, -0.6034F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4632F, -2.7625F, -0.0004F, -0.218F, 0.0058F));

		PartDefinition cube_r204 = neck.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(95, 29).addBox(0.0F, -3.4F, -2.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(53, 15).addBox(-1.0F, -1.4F, -3.7F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r205 = neck.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(107, 23).mirror().addBox(-1.7792F, 0.2788F, 0.0614F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r206 = neck.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(107, 23).addBox(0.7792F, 0.2788F, 0.0614F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0821F, -3.7095F, 0.6949F, -0.0376F, 0.1705F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(34, 41).addBox(-1.5F, -3.1045F, 0.0552F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3381F, -1.8894F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(35, 96).addBox(-1.0F, -0.8641F, 1.2957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(35, 96).addBox(-1.0F, -1.3641F, 1.2957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.8F, -9.5577F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(85, 46).addBox(-1.0F, -6.067F, 5.0406F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(66, 12).addBox(-1.0F, -6.067F, 2.0406F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.8F, -9.5577F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(31, 65).addBox(-1.0F, -1.2F, -0.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.1821F, -3.8631F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(17, 97).addBox(-0.5F, -0.8108F, -0.8393F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4728F, -9.8972F, -2.1555F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(101, 49).addBox(-0.5F, 0.7564F, -1.6826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.0272F, -9.2972F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(96, 91).addBox(-1.0F, -2.7475F, -0.387F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(101, 38).addBox(-0.5F, -0.7475F, -0.387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -8.9577F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(21, 102).addBox(-0.5F, -0.4F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 4.0879F, -8.1834F, 2.9496F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(101, 34).addBox(-0.5F, -1.29F, -0.3514F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 97).addBox(-0.5F, -1.29F, -0.6514F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 4.1F, -7.8577F, 2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(94, 52).addBox(-0.5F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 3.0114F, -6.8501F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(32, 99).addBox(-0.5F, -0.0242F, -0.9052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0F, 2.1471F, -7.0208F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(16, 102).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.3471F, -7.7208F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 102).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 3.9515F, -8.8549F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(18, 92).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.4426F, -6.3171F, 1.7759F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(18, 92).addBox(-1.0F, -1.5F, -0.7F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0321F, -5.4849F, 1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(92, 45).addBox(-1.0F, -0.9555F, -0.9935F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(92, 45).addBox(-1.0F, -0.0555F, -0.9935F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.4F, -8.0577F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(20, 75).addBox(-1.0F, -1.875F, -1.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0336F, -2.732F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(19, 40).addBox(-2.0F, -0.0782F, 0.0163F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3812F, -4.5434F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(38, 15).addBox(-2.5F, -7.0F, 3.3F, 4.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 4.0F, -2.6577F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.274F, -0.6608F, -0.4237F, -1.6581F, 0.0349F, 0.0F));

		PartDefinition cube_r226 = leftCheek.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(94, 35).addBox(-0.6555F, -1.0115F, -0.8259F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5528F, -0.5735F, 1.5959F, 0.5299F, 0.3892F, 0.4672F));

		PartDefinition cube_r227 = leftCheek.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 94).addBox(-0.7963F, 0.0507F, -0.0911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5528F, -0.5735F, 1.5959F, 1.5535F, 0.422F, 0.8457F));

		PartDefinition cube_r228 = leftCheek.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(89, 105).addBox(-0.6616F, 0.0483F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5528F, -0.5735F, 1.5959F, 1.3865F, 0.3952F, 0.4648F));

		PartDefinition cube_r229 = leftCheek.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(73, 19).addBox(-1.0768F, -0.9559F, -3.9054F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4404F, 3.4975F, 1.5167F, 2.7296F, 0.0388F, 0.4061F));

		PartDefinition cube_r230 = leftCheek.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(77, 31).addBox(-0.032F, -3.0568F, -4.2253F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.424F, -0.0982F, 1.937F, 2.3358F, 0.1087F, 0.4203F));

		PartDefinition cube_r231 = leftCheek.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(77, 31).addBox(-0.0207F, -3.7251F, -3.2878F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(77, 31).addBox(-0.0207F, -1.7251F, -3.2878F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.424F, -0.0982F, 1.937F, 1.4195F, 0.1087F, 0.4203F));

		PartDefinition cube_r232 = leftCheek.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(89, 91).addBox(-0.6616F, -0.829F, -1.8972F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5528F, -0.5735F, 1.5959F, 0.8454F, 0.3952F, 0.4648F));

		PartDefinition cube_r233 = leftCheek.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(37, 99).addBox(-0.757F, -1.1625F, -1.6061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5528F, -0.5735F, 1.5959F, 0.6506F, 0.2398F, 0.3852F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.274F, -0.6608F, -0.4237F, -1.6581F, -0.0349F, 0.0F));

		PartDefinition cube_r234 = rightCheek.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(94, 35).mirror().addBox(-0.3445F, -1.0115F, -0.8259F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5528F, -0.5735F, 1.5959F, 0.5299F, -0.3892F, -0.4672F));

		PartDefinition cube_r235 = rightCheek.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.2037F, 0.0507F, -0.0911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5528F, -0.5735F, 1.5959F, 1.5535F, -0.422F, -0.8457F));

		PartDefinition cube_r236 = rightCheek.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(89, 105).mirror().addBox(-0.3384F, 0.0483F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5528F, -0.5735F, 1.5959F, 1.3865F, -0.3952F, -0.4648F));

		PartDefinition cube_r237 = rightCheek.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(0.0768F, -0.9559F, -3.9054F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4404F, 3.4975F, 1.5167F, 2.7296F, -0.0388F, -0.4061F));

		PartDefinition cube_r238 = rightCheek.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(77, 31).mirror().addBox(-0.968F, -3.0568F, -4.2253F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.424F, -0.0982F, 1.937F, 2.3358F, -0.1087F, -0.4203F));

		PartDefinition cube_r239 = rightCheek.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(77, 31).mirror().addBox(-0.9793F, -3.7251F, -3.2878F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 31).mirror().addBox(-0.9793F, -1.7251F, -3.2878F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.424F, -0.0982F, 1.937F, 1.4195F, -0.1087F, -0.4203F));

		PartDefinition cube_r240 = rightCheek.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(89, 91).mirror().addBox(-0.3384F, -0.829F, -1.8972F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5528F, -0.5735F, 1.5959F, 0.8454F, -0.3952F, -0.4648F));

		PartDefinition cube_r241 = rightCheek.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(37, 99).mirror().addBox(-0.243F, -1.1625F, -1.6061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5528F, -0.5735F, 1.5959F, 0.6506F, -0.2398F, -0.3852F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5157F, 6.1241F, -8.2987F, 0.2418F, 0.0358F, -0.144F));

		PartDefinition cube_r242 = leftBeak.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(67, 106).addBox(-0.36F, -1.0234F, -1.2071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(106, 77).addBox(-0.36F, -1.0234F, -1.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3875F, -1.2788F, -1.6408F, -1.6966F, 0.0699F, 0.0695F));

		PartDefinition cube_r243 = leftBeak.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(106, 57).addBox(-0.4152F, -1.0094F, -1.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3875F, -0.2788F, -1.4408F, -1.3825F, 0.0699F, 0.0695F));

		PartDefinition cube_r244 = leftBeak.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(37, 106).addBox(-0.5072F, -0.0687F, -0.0268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.064F, -3.1915F, -0.9019F, -0.5971F, 0.0699F, 0.0695F));

		PartDefinition cube_r245 = leftBeak.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(57, 106).addBox(-1.2852F, -0.9706F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5704F, -0.1934F, -0.0304F, 1.061F, 0.0699F, 0.0695F));

		PartDefinition cube_r246 = leftBeak.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(106, 40).addBox(-1.3697F, 1.0628F, -0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -1.0934F, -2.1304F, 0.6945F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5157F, 6.1241F, -8.2987F, 0.2418F, -0.0358F, 0.144F));

		PartDefinition cube_r247 = rightBeak.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(67, 106).mirror().addBox(-0.64F, -1.0234F, -1.2071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(106, 77).mirror().addBox(-0.64F, -1.0234F, -1.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3875F, -1.2788F, -1.6408F, -1.6966F, -0.0699F, -0.0695F));

		PartDefinition cube_r248 = rightBeak.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(106, 57).mirror().addBox(-0.5848F, -1.0094F, -1.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3875F, -0.2788F, -1.4408F, -1.3825F, -0.0699F, -0.0695F));

		PartDefinition cube_r249 = rightBeak.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(37, 106).mirror().addBox(-0.4928F, -0.0687F, -0.0268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.064F, -3.1915F, -0.9019F, -0.5971F, -0.0699F, -0.0695F));

		PartDefinition cube_r250 = rightBeak.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(57, 106).mirror().addBox(0.2852F, -0.9706F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.1934F, -0.0304F, 1.061F, -0.0699F, -0.0695F));

		PartDefinition cube_r251 = rightBeak.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(106, 40).mirror().addBox(0.3697F, 1.0628F, -0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.0934F, -2.1304F, 0.6945F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.3588F, -5.5918F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(48, 49).addBox(-2.2219F, -0.0039F, -4.866F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3F, -7.2F, 3.4F, 0.4028F, 0.3035F, 0.1239F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(21, 106).addBox(0.9099F, -0.1143F, -0.1365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(21, 106).addBox(0.9099F, -0.4143F, 0.8635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(21, 106).addBox(0.9099F, -1.1143F, -0.1365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3F, -8.74F, 1.0484F, 0.3396F, -0.0522F, 0.0046F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(52, 106).addBox(0.8557F, -3.211F, 0.5345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 51).addBox(0.8557F, -2.611F, 0.5345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3F, -9.421F, 1.2854F, 1.273F, -0.0475F, 0.0221F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(101, 77).addBox(0.8557F, -3.2697F, 0.1916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.3F, -9.421F, 1.2854F, 1.1682F, -0.0475F, 0.0221F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(101, 57).addBox(0.9579F, -0.069F, -0.9167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.3F, -11.2538F, -0.0149F, 0.9065F, -0.0492F, 0.0179F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(100, 16).addBox(0.9579F, -0.1116F, -0.9268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3F, -11.2538F, -0.0149F, 1.0462F, -0.0492F, 0.0179F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(100, 12).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0361F, -9.2413F, 3.9254F, 1.4654F, -0.0522F, 0.0046F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(100, 12).addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0523F, -9.5758F, 2.2602F, 1.3432F, -0.0522F, 0.0046F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(5, 106).addBox(1.0898F, -0.2937F, 0.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3F, -8.74F, 1.0484F, 0.1215F, -0.0522F, 0.0046F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(93, 17).addBox(1.0898F, -1.2351F, -2.6689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.3F, -8.74F, 1.0484F, 2.4602F, -0.0522F, 0.0046F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(16, 106).addBox(1.0898F, -0.6743F, -1.2064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.3F, -8.74F, 1.0484F, 1.8842F, -0.0522F, 0.0046F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 106).addBox(1.0898F, -0.1172F, -0.6543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.3F, -8.74F, 1.0484F, 0.7847F, -0.0522F, 0.0046F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(84, 25).addBox(0.2654F, 0.3447F, -0.1609F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 74).addBox(-0.0946F, 0.3447F, -0.1609F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(84, 15).addBox(0.5754F, 0.3447F, -0.1609F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.3F, -8.74F, 1.0484F, 0.314F, -0.0522F, 0.0046F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(74, 81).addBox(-0.2428F, -0.5511F, 0.292F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3627F, -1.1067F, -0.3648F, 0.4191F, 0.0868F, -0.0146F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(105, 10).addBox(-0.5028F, -0.9831F, -0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8101F, -1.3242F, -0.7639F, 1.9895F, 0.0337F, -0.009F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(62, 106).addBox(-0.4899F, -0.1552F, -0.5795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(106, 45).addBox(-0.4899F, -0.4552F, -0.5795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8101F, -1.3242F, -0.7639F, 2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(42, 102).addBox(-0.5032F, -1.892F, 0.2093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2109F, -5.2855F, -2.835F, 1.2385F, 0.04F, -0.0113F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(100, 8).addBox(-0.9F, -3.8609F, 0.5179F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.2F, 0.7F, 1.8239F, 0.0175F, -0.0006F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(72, 106).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9221F, -0.2322F, -3.3852F, 1.2723F, 0.0187F, -0.1968F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(26, 102).addBox(-1.0248F, -0.2643F, -0.9497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7335F, -1.9734F, -3.3621F, 0.1378F, 0.0187F, -0.1968F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(93, 25).addBox(-1.1051F, -1.3365F, 3.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3627F, -1.1067F, -0.3648F, 0.279F, 0.0868F, 0.0146F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(31, 72).addBox(-1.1051F, -0.791F, -0.0983F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3627F, -1.1067F, -0.3648F, 0.4361F, 0.0868F, 0.0146F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(47, 102).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8F, -3.9436F, -2.5917F, -0.4607F, 0.1874F, 0.2963F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(57, 102).addBox(-0.2147F, -1.0659F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3F, -3.7635F, -3.1497F, -0.2639F, 0.0602F, 0.2189F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(86, 68).addBox(1.3F, -8.767F, 4.6406F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3F, -6.1588F, -3.9659F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(66, 31).addBox(-0.7563F, 0.0065F, -0.2512F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -9.4497F, 4.1393F, -0.1894F, 0.5331F, -0.0266F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(11, 54).addBox(-0.8572F, -0.4791F, -0.1337F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -9.4497F, 6.0393F, 0.2975F, 0.6979F, -0.115F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(62, 74).addBox(-1.7447F, -0.3487F, -0.2597F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -9.4497F, 4.1393F, -0.0991F, 0.4851F, -0.2659F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.3588F, -5.5918F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(48, 49).mirror().addBox(0.2219F, -0.0039F, -4.866F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -7.2F, 3.4F, 0.4028F, -0.3035F, -0.1239F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(21, 106).mirror().addBox(-1.9099F, -0.1143F, -0.1365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(21, 106).mirror().addBox(-1.9099F, -0.4143F, 0.8635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(21, 106).mirror().addBox(-1.9099F, -1.1143F, -0.1365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3F, -8.74F, 1.0484F, 0.3396F, 0.0522F, -0.0046F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(52, 106).mirror().addBox(-1.8557F, -3.211F, 0.5345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 51).mirror().addBox(-1.8557F, -2.611F, 0.5345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3F, -9.421F, 1.2854F, 1.273F, 0.0475F, -0.0221F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(101, 77).mirror().addBox(-1.8557F, -3.2697F, 0.1916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(1.3F, -9.421F, 1.2854F, 1.1682F, 0.0475F, -0.0221F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(101, 57).mirror().addBox(-1.9579F, -0.069F, -0.9167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(1.3F, -11.2538F, -0.0149F, 0.9065F, 0.0492F, -0.0179F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(100, 16).mirror().addBox(-1.9579F, -0.1116F, -0.9268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3F, -11.2538F, -0.0149F, 1.0462F, 0.0492F, -0.0179F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0361F, -9.2413F, 3.9254F, 1.4654F, 0.0522F, -0.0046F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0523F, -9.5758F, 2.2602F, 1.3432F, 0.0522F, -0.0046F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(5, 106).mirror().addBox(-2.0898F, -0.2937F, 0.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3F, -8.74F, 1.0484F, 0.1215F, 0.0522F, -0.0046F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(93, 17).mirror().addBox(-2.0898F, -1.2351F, -2.6689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.3F, -8.74F, 1.0484F, 2.4602F, 0.0522F, -0.0046F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(16, 106).mirror().addBox(-2.0898F, -0.6743F, -1.2064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.3F, -8.74F, 1.0484F, 1.8842F, 0.0522F, -0.0046F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-2.0898F, -0.1172F, -0.6543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.3F, -8.74F, 1.0484F, 0.7847F, 0.0522F, -0.0046F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-2.2654F, 0.3447F, -0.1609F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 74).mirror().addBox(-2.9054F, 0.3447F, -0.1609F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(84, 15).mirror().addBox(-2.5754F, 0.3447F, -0.1609F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.3F, -8.74F, 1.0484F, 0.314F, 0.0522F, -0.0046F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(74, 81).mirror().addBox(0.2428F, -0.5511F, 0.292F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3627F, -1.1067F, -0.3648F, 0.4191F, -0.0868F, 0.0146F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(105, 10).mirror().addBox(-0.4972F, -0.9831F, -0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8101F, -1.3242F, -0.7639F, 1.9895F, -0.0337F, 0.009F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(62, 106).mirror().addBox(-0.5101F, -0.1552F, -0.5795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(106, 45).mirror().addBox(-0.5101F, -0.4552F, -0.5795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8101F, -1.3242F, -0.7639F, 2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(42, 102).addBox(-0.4956F, -0.4059F, -0.9936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.3891F, -6.3855F, -2.335F, 1.4567F, 0.04F, -0.0113F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(42, 102).mirror().addBox(-0.5044F, -0.4059F, -0.9936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(1.2109F, -6.3855F, -2.335F, 1.4567F, -0.04F, 0.0113F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(42, 102).mirror().addBox(-0.4968F, -1.892F, 0.2093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.2109F, -5.2855F, -2.835F, 1.2385F, -0.04F, 0.0113F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(89, 101).addBox(-0.4488F, -0.7418F, -0.4742F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3F, -5.9098F, -3.6496F, 0.7673F, 0.0409F, -0.007F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(89, 101).mirror().addBox(-0.5512F, -0.7418F, -0.4742F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.3F, -5.9098F, -3.6496F, 0.7673F, -0.0409F, 0.007F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(100, 8).mirror().addBox(-0.1F, -3.8609F, 0.5179F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.2F, 0.7F, 1.8239F, -0.0175F, 0.0006F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(72, 106).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.9221F, -0.2322F, -3.3852F, 1.2723F, -0.0187F, 0.1968F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(26, 102).mirror().addBox(0.0248F, -0.2643F, -0.9497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7335F, -1.9734F, -3.3621F, 0.1378F, -0.0187F, 0.1968F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(93, 25).mirror().addBox(0.1051F, -1.3365F, 3.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3627F, -1.1067F, -0.3648F, 0.279F, -0.0868F, -0.0146F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(31, 72).mirror().addBox(0.1051F, -0.791F, -0.0983F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3627F, -1.1067F, -0.3648F, 0.4361F, -0.0868F, -0.0146F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(47, 102).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.8F, -3.9436F, -2.5917F, -0.4607F, -0.1874F, -0.2963F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(57, 102).mirror().addBox(-0.7853F, -1.0659F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3F, -3.7635F, -3.1497F, -0.2639F, -0.0602F, -0.2189F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(57, 102).addBox(-1.2102F, -0.8996F, -0.1885F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3F, -5.2588F, -3.5659F, 0.2946F, 0.0356F, -0.1169F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(57, 102).mirror().addBox(0.2102F, -0.8996F, -0.1885F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3F, -5.2588F, -3.5659F, 0.2946F, -0.0356F, 0.1169F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(86, 68).mirror().addBox(-2.3F, -8.767F, 4.6406F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3F, -6.1588F, -3.9659F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(-0.2437F, 0.0065F, -0.2512F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -9.4497F, 4.1393F, -0.1894F, -0.5331F, 0.0266F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(11, 54).mirror().addBox(-0.1428F, -0.4791F, -0.1337F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -9.4497F, 6.0393F, 0.2975F, -0.6979F, 0.115F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(62, 74).mirror().addBox(-0.2553F, -0.3487F, -0.2597F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -9.4497F, 4.1393F, -0.0991F, -0.4851F, 0.2659F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.0561F, 1.0098F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(86, 101).mirror().addBox(0.0F, -1.4F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0701F, 2.6732F, -3.2894F, -0.8674F, -0.0881F, -0.138F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(105, 7).mirror().addBox(0.1921F, 0.613F, -0.0414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2164F, 4.2209F, -5.4255F, -0.1723F, -0.0386F, -0.159F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(42, 106).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.373F, 5.3388F, -4.4712F, 0.0982F, -0.0386F, -0.159F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(106, 37).mirror().addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4391F, 4.9946F, -4.1935F, -0.2072F, -0.0386F, -0.159F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(26, 106).mirror().addBox(0.5722F, -2.027F, -1.3919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2164F, 6.7209F, -5.0255F, -0.9926F, -0.0386F, -0.159F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(52, 102).mirror().addBox(-0.2216F, -0.1671F, 0.6743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0164F, 2.8209F, -3.2255F, -0.8704F, -0.0386F, -0.159F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(27, 97).mirror().addBox(-0.2216F, 0.0329F, -0.0257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0164F, 2.8209F, -3.2255F, -0.853F, -0.0386F, -0.159F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(101, 53).mirror().addBox(-0.5F, -0.9314F, -0.7446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3294F, 0.9399F, 0.042F, -1.0324F, -0.0836F, -0.1783F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(12, 95).mirror().addBox(-0.5F, -1.45F, -0.3509F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3294F, 0.9399F, 0.042F, -0.6135F, -0.0836F, -0.1783F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(22, 97).mirror().addBox(-0.3339F, 0.1888F, -1.3683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2811F, 2.6097F, 0.1632F, -0.8561F, -0.116F, -0.1593F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(93, 96).mirror().addBox(-0.2643F, -0.9292F, -0.0735F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2811F, 1.7097F, -2.0368F, -0.7707F, -0.0502F, -0.209F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(47, 106).mirror().addBox(-0.7488F, -0.3961F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 0.7209F, -3.1255F, -0.1392F, -0.0855F, -0.1974F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(88, 96).mirror().addBox(-0.7338F, -3.2252F, -1.0587F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 2.0209F, -0.3255F, 0.7335F, -0.0855F, -0.1974F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(83, 95).mirror().addBox(-0.7338F, -3.234F, 0.1117F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 2.0209F, -0.3255F, 1.1F, -0.0855F, -0.1974F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(86, 101).addBox(0.0F, -1.4F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8702F, 2.6732F, -3.2894F, -0.8674F, 0.0881F, 0.138F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(105, 7).addBox(-1.1921F, 0.613F, -0.0414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0165F, 4.2209F, -5.4255F, -0.1723F, 0.0386F, 0.159F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(42, 106).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1731F, 5.3388F, -4.4712F, 0.0982F, 0.0386F, 0.159F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(106, 37).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2391F, 4.9946F, -4.1935F, -0.2072F, 0.0386F, 0.159F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(26, 106).addBox(-1.5722F, -2.027F, -1.3919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0165F, 6.7209F, -5.0255F, -0.9926F, 0.0386F, 0.159F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(52, 102).addBox(-0.7784F, -0.1671F, 0.6743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8165F, 2.8209F, -3.2255F, -0.8704F, 0.0386F, 0.159F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(27, 97).addBox(-0.7784F, 0.0329F, -0.0257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8165F, 2.8209F, -3.2255F, -0.853F, 0.0386F, 0.159F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(101, 53).addBox(-0.5F, -0.9314F, -0.7446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1295F, 0.9399F, 0.042F, -1.0324F, 0.0836F, 0.1783F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(12, 95).addBox(-0.5F, -1.45F, -0.3509F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1295F, 0.9399F, 0.042F, -0.6135F, 0.0836F, 0.1783F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(22, 97).addBox(-0.6661F, 0.1888F, -1.3683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0811F, 2.6097F, 0.1632F, -0.8561F, 0.116F, 0.1593F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(93, 96).addBox(-0.7357F, -0.9292F, -0.0735F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0811F, 1.7097F, -2.0368F, -0.7707F, 0.0502F, 0.209F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(47, 106).addBox(-0.2512F, -0.3961F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7165F, 0.7209F, -3.1255F, -0.1392F, 0.0855F, 0.1974F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(88, 96).addBox(-0.2662F, -3.2252F, -1.0587F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7165F, 2.0209F, -0.3255F, 0.7335F, 0.0855F, 0.1974F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(83, 95).addBox(-0.2662F, -3.234F, 0.1117F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 2.0209F, -0.3255F, 1.1F, 0.0855F, 0.1974F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0967F, 6.1152F, -5.2639F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r342 = leftLowerbeak.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(103, 97).addBox(-1.0F, -1.0953F, -0.8971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.0123F, 0.0873F, 0.0F));

		PartDefinition cube_r343 = leftLowerbeak.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(98, 98).addBox(-1.0F, 0.8203F, -0.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1947F, -0.7786F, 0.9318F, -1.4661F, 0.0873F, 0.0F));

		PartDefinition cube_r344 = leftLowerbeak.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(75, 102).addBox(-1.3312F, -1.6997F, -0.2256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1947F, -1.3786F, -2.9682F, -2.234F, 0.0873F, 0.0F));

		PartDefinition cube_r345 = leftLowerbeak.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(81, 100).addBox(-1.0F, 2.0724F, 0.5434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, -0.6786F, 0.8318F, -1.9548F, 0.0873F, 0.0F));

		PartDefinition cube_r346 = leftLowerbeak.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(94, 102).addBox(-1.2615F, -1.9541F, -0.898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1947F, -0.0786F, -2.0682F, -1.8675F, 0.0873F, 0.0F));

		PartDefinition cube_r347 = leftLowerbeak.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(106, 54).addBox(-1.09F, -0.7301F, -0.1274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(106, 48).addBox(-1.09F, -1.0301F, -0.1274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.4681F, 0.0343F, -0.0455F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2967F, 6.1152F, -5.2639F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightLowerbeak.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(103, 97).mirror().addBox(0.0F, -1.0953F, -0.8971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.0123F, -0.0873F, 0.0F));

		PartDefinition cube_r349 = rightLowerbeak.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(98, 98).mirror().addBox(0.0F, 0.8203F, -0.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.7786F, 0.9318F, -1.4661F, -0.0873F, 0.0F));

		PartDefinition cube_r350 = rightLowerbeak.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(75, 102).mirror().addBox(0.3312F, -1.6997F, -0.2256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -1.3786F, -2.9682F, -2.234F, -0.0873F, 0.0F));

		PartDefinition cube_r351 = rightLowerbeak.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(81, 100).mirror().addBox(0.0F, 2.0724F, 0.5434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.6786F, 0.8318F, -1.9548F, -0.0873F, 0.0F));

		PartDefinition cube_r352 = rightLowerbeak.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(94, 102).mirror().addBox(0.2615F, -1.9541F, -0.898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.0786F, -2.0682F, -1.8675F, -0.0873F, 0.0F));

		PartDefinition cube_r353 = rightLowerbeak.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(106, 54).mirror().addBox(0.09F, -0.7301F, -0.1274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(106, 48).mirror().addBox(0.09F, -1.0301F, -0.1274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.4681F, -0.0343F, 0.0455F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.2549F, -1.7248F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r354 = frill.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(104, 100).addBox(-0.5244F, 0.9898F, 1.6752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0244F, -6.0017F, 3.8388F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r355 = frill.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(105, 16).addBox(-0.5244F, 3.2235F, -2.1771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.0244F, -6.0017F, 3.8388F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r356 = frill.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(105, 13).addBox(-0.5244F, 2.9721F, 0.468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0244F, -6.0017F, 3.8388F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r357 = frill.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(94, 77).addBox(-1.0244F, -4.9546F, -0.807F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 94).addBox(-1.0244F, -2.9546F, -0.807F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0244F, -4.3017F, 3.8388F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r358 = frill.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(93, 0).addBox(-1.0244F, -1.261F, -1.0006F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0244F, -4.3017F, 3.8388F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r359 = frill.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(99, 102).addBox(3.5171F, -4.4025F, -0.18F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0244F, -4.3017F, 3.8388F, -0.2173F, -0.205F, -0.7775F));

		PartDefinition cube_r360 = frill.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(98, 94).addBox(-1.739F, -5.3918F, -0.18F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0244F, -4.3017F, 3.8388F, -0.2909F, 0.0637F, 0.1769F));

		PartDefinition cube_r361 = frill.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(57, 98).addBox(0.5781F, -5.4276F, -0.18F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0244F, -4.3017F, 3.8388F, -0.2955F, -0.0356F, -0.1489F));

		PartDefinition cube_r362 = frill.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(11, 100).addBox(-0.5244F, 0.8052F, 0.1474F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0244F, -6.0017F, 3.8388F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r363 = frill.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(20, 82).addBox(-1.5244F, -0.6816F, 0.059F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0244F, -2.0017F, 0.5388F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r364 = frill.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(20, 82).addBox(-1.5244F, 1.304F, 0.1069F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0244F, -6.0017F, 3.8388F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r365 = frill.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(26, 47).addBox(-1.0244F, 0.7231F, 1.0959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0244F, -6.0017F, 3.8388F, -1.0821F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5589F, -5.1425F, 4.8103F, -0.1364F, -0.2957F, 0.1731F));

		PartDefinition cube_r366 = leftFrill.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(27, 88).addBox(-2.2F, 1.2F, 0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 88).addBox(-2.2F, 0.2F, 0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0463F, 1.9267F, -2.2083F, -0.4457F, 0.0502F, 0.3268F));

		PartDefinition cube_r367 = leftFrill.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(73, 74).addBox(-2.7F, -2.5F, -0.775F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7954F, 5.246F, -2.6732F, 0.295F, -0.1765F, -1.3474F));

		PartDefinition cube_r368 = leftFrill.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 81).addBox(-2.5F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4317F, 4.0907F, -2.0552F, -0.2992F, -0.2719F, -0.1534F));

		PartDefinition cube_r369 = leftFrill.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(43, 94).addBox(-0.7F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.3792F, 4.1922F, -1.6823F, -0.3885F, 0.0187F, 0.7952F));

		PartDefinition cube_r370 = leftFrill.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(22, 56).addBox(0.1F, -1.6F, -0.5F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.1861F, 1.0823F, -0.7273F, 0.16F, 0.2896F, 2.5574F));

		PartDefinition cube_r371 = leftFrill.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(74, 55).addBox(0.0333F, 1.6699F, -0.0648F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6852F, -1.5822F, 0.2862F, -0.2918F, 0.2666F, 1.2784F));

		PartDefinition cube_r372 = leftFrill.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(25, 92).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.5074F, 3.3181F, -1.3844F, -0.1654F, 0.3248F, 1.7142F));

		PartDefinition cube_r373 = leftFrill.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(57, 87).addBox(1.912F, -0.9086F, -0.1692F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.912F, -3.9225F, 0.0734F, -0.3976F, 0.0955F, 0.7524F));

		PartDefinition cube_r374 = leftFrill.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(93, 73).addBox(0.0786F, -0.0605F, -0.0207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.912F, -3.9225F, 0.0734F, -0.3802F, 0.0047F, 0.3566F));

		PartDefinition cube_r375 = leftFrill.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(104, 4).addBox(-0.4F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.3124F, 5.7313F, -2.0693F, 0.2017F, 0.3311F, 2.7452F));

		PartDefinition cube_r376 = leftFrill.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(103, 91).addBox(-0.4F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3902F, 5.1482F, -1.6238F, -0.2164F, 0.3219F, 1.5766F));

		PartDefinition cube_r377 = leftFrill.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(11, 104).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.8142F, 4.0837F, -1.2312F, -0.2728F, 0.1552F, 0.8967F));

		PartDefinition cube_r378 = leftFrill.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(104, 103).addBox(0.0687F, -0.8961F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.577F, 2.2657F, -0.7607F, -0.2998F, 0.0909F, 0.6774F));

		PartDefinition cube_r379 = leftFrill.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(80, 104).addBox(-0.7184F, -0.5809F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.577F, 2.2657F, -0.7607F, -0.0908F, 0.2998F, 1.6635F));

		PartDefinition cube_r380 = leftFrill.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(104, 81).addBox(-0.0658F, -0.552F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.577F, 2.2657F, -0.7607F, -0.1872F, 0.2521F, 1.3131F));

		PartDefinition cube_r381 = leftFrill.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(31, 103).addBox(0.0687F, -0.8961F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.577F, 0.3657F, -0.1607F, -0.2998F, 0.0909F, 0.5552F));

		PartDefinition cube_r382 = leftFrill.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(102, 63).addBox(-0.7184F, -0.5809F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.577F, 0.3657F, -0.1607F, -0.0908F, 0.2998F, 1.5414F));

		PartDefinition cube_r383 = leftFrill.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(102, 70).addBox(-0.0658F, -0.552F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.577F, 0.3657F, -0.1607F, -0.1872F, 0.2521F, 1.1909F));

		PartDefinition cube_r384 = leftFrill.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(47, 98).addBox(-0.0658F, -0.552F, -0.5584F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.977F, -2.0343F, 0.4393F, -0.2479F, 0.0768F, 0.6139F));

		PartDefinition cube_r385 = leftFrill.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(42, 98).addBox(-0.7184F, -0.5809F, -0.5584F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.977F, -2.0343F, 0.4393F, -0.209F, 0.1546F, 0.9476F));

		PartDefinition cube_r386 = leftFrill.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(36, 78).addBox(0.0687F, -0.8961F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.977F, -2.0343F, 0.4393F, -0.2449F, -0.0861F, -0.0117F));

		PartDefinition cube_r387 = leftFrill.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(36, 103).addBox(-0.049F, -0.8742F, -0.4865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.9828F, -4.018F, 0.8033F, -0.2119F, -0.21F, -0.3989F));

		PartDefinition cube_r388 = leftFrill.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(76, 98).addBox(-0.7651F, -0.4707F, -0.4865F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.9828F, -4.018F, 0.8033F, -0.2919F, 0.0565F, 0.5564F));

		PartDefinition cube_r389 = leftFrill.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(52, 98).addBox(-0.1465F, -0.4636F, -0.4865F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9828F, -4.018F, 0.8033F, -0.2942F, -0.0427F, 0.2307F));

		PartDefinition cube_r390 = leftFrill.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(0, 98).addBox(-0.9611F, -0.8761F, -0.2111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3747F, -4.6006F, 0.5917F, -0.351F, 0.0755F, 0.2425F));

		PartDefinition cube_r391 = leftFrill.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(103, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3676F, -5.4558F, 1.2204F, -0.263F, -0.2468F, -0.6974F));

		PartDefinition cube_r392 = leftFrill.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(13, 43).addBox(-0.196F, -0.9113F, -0.2111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3747F, -4.6006F, 0.5917F, -0.3561F, -0.0434F, -0.0766F));

		PartDefinition cube_r393 = leftFrill.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(18, 88).addBox(-1.5F, -0.6F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9268F, 1.0463F, -1.1305F, 0.2511F, -0.2076F, -2.6177F));

		PartDefinition cube_r394 = leftFrill.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(75, 70).addBox(-5.5F, -1.6F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.1709F, -3.7184F, 0.4404F, -0.0885F, -0.3125F, -1.443F));

		PartDefinition cube_r395 = leftFrill.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(92, 87).addBox(0.0642F, -0.3081F, -0.0864F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1036F, -3.6374F, 0.1191F, -0.3318F, 0.033F, -0.0114F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5589F, -5.1425F, 4.8103F, -0.1364F, 0.2957F, -0.1731F));

		PartDefinition cube_r396 = rightFrill.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(27, 88).mirror().addBox(-0.8F, 1.2F, 0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 88).mirror().addBox(-0.8F, 0.2F, 0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0463F, 1.9267F, -2.2083F, -0.4457F, -0.0502F, -0.3268F));

		PartDefinition cube_r397 = rightFrill.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(73, 74).mirror().addBox(-0.3F, -2.5F, -0.775F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7954F, 5.246F, -2.6732F, 0.295F, 0.1765F, 1.3474F));

		PartDefinition cube_r398 = rightFrill.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-1.5F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4317F, 4.0907F, -2.0552F, -0.2992F, 0.2719F, 0.1534F));

		PartDefinition cube_r399 = rightFrill.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(43, 94).mirror().addBox(-1.3F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3792F, 4.1922F, -1.6823F, -0.3885F, -0.0187F, -0.7952F));

		PartDefinition cube_r400 = rightFrill.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(22, 56).mirror().addBox(-5.1F, -1.6F, -0.5F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.1861F, 1.0823F, -0.7273F, 0.16F, -0.2896F, -2.5574F));

		PartDefinition cube_r401 = rightFrill.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(74, 55).mirror().addBox(-4.0333F, 1.6699F, -0.0648F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6852F, -1.5822F, 0.2862F, -0.2918F, -0.2666F, -1.2784F));

		PartDefinition cube_r402 = rightFrill.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.5074F, 3.3181F, -1.3844F, -0.1654F, -0.3248F, -1.7142F));

		PartDefinition cube_r403 = rightFrill.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(57, 87).mirror().addBox(-4.912F, -0.9086F, -0.1692F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.912F, -3.9225F, 0.0734F, -0.3976F, -0.0955F, -0.7524F));

		PartDefinition cube_r404 = rightFrill.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(93, 73).mirror().addBox(-2.0786F, -0.0605F, -0.0207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.912F, -3.9225F, 0.0734F, -0.3802F, -0.0047F, -0.3566F));

		PartDefinition cube_r405 = rightFrill.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(104, 4).mirror().addBox(-0.6F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.3124F, 5.7313F, -2.0693F, 0.2017F, -0.3311F, -2.7452F));

		PartDefinition cube_r406 = rightFrill.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(103, 91).mirror().addBox(-0.6F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3902F, 5.1482F, -1.6238F, -0.2164F, -0.3219F, -1.5766F));

		PartDefinition cube_r407 = rightFrill.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(11, 104).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.8142F, 4.0837F, -1.2312F, -0.2728F, -0.1552F, -0.8967F));

		PartDefinition cube_r408 = rightFrill.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(104, 103).mirror().addBox(-1.0687F, -0.8961F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.577F, 2.2657F, -0.7607F, -0.2998F, -0.0909F, -0.6774F));

		PartDefinition cube_r409 = rightFrill.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(80, 104).mirror().addBox(-0.2816F, -0.5809F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.577F, 2.2657F, -0.7607F, -0.0908F, -0.2998F, -1.6635F));

		PartDefinition cube_r410 = rightFrill.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(104, 81).mirror().addBox(-0.9342F, -0.552F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.577F, 2.2657F, -0.7607F, -0.1872F, -0.2521F, -1.3131F));

		PartDefinition cube_r411 = rightFrill.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(31, 103).mirror().addBox(-1.0687F, -0.8961F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.577F, 0.3657F, -0.1607F, -0.2998F, -0.0909F, -0.5552F));

		PartDefinition cube_r412 = rightFrill.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(102, 63).mirror().addBox(-0.2816F, -0.5809F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.577F, 0.3657F, -0.1607F, -0.0908F, -0.2998F, -1.5414F));

		PartDefinition cube_r413 = rightFrill.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(102, 70).mirror().addBox(-0.9342F, -0.552F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.577F, 0.3657F, -0.1607F, -0.1872F, -0.2521F, -1.1909F));

		PartDefinition cube_r414 = rightFrill.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(47, 98).mirror().addBox(-0.9342F, -0.552F, -0.5584F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.977F, -2.0343F, 0.4393F, -0.2479F, -0.0768F, -0.6139F));

		PartDefinition cube_r415 = rightFrill.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-0.2816F, -0.5809F, -0.5584F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.977F, -2.0343F, 0.4393F, -0.209F, -0.1546F, -0.9476F));

		PartDefinition cube_r416 = rightFrill.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(36, 78).mirror().addBox(-1.0687F, -0.8961F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.977F, -2.0343F, 0.4393F, -0.2449F, 0.0861F, 0.0117F));

		PartDefinition cube_r417 = rightFrill.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(36, 103).mirror().addBox(-0.951F, -0.8742F, -0.4865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9828F, -4.018F, 0.8033F, -0.2119F, 0.21F, 0.3989F));

		PartDefinition cube_r418 = rightFrill.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(76, 98).mirror().addBox(-0.2349F, -0.4707F, -0.4865F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9828F, -4.018F, 0.8033F, -0.2919F, -0.0565F, -0.5564F));

		PartDefinition cube_r419 = rightFrill.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(52, 98).mirror().addBox(-0.8535F, -0.4636F, -0.4865F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9828F, -4.018F, 0.8033F, -0.2942F, 0.0427F, -0.2307F));

		PartDefinition cube_r420 = rightFrill.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.0389F, -0.8761F, -0.2111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3747F, -4.6006F, 0.5917F, -0.351F, -0.0755F, -0.2425F));

		PartDefinition cube_r421 = rightFrill.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(103, 94).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3676F, -5.4558F, 1.2204F, -0.263F, 0.2468F, 0.6974F));

		PartDefinition cube_r422 = rightFrill.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(13, 43).mirror().addBox(-0.804F, -0.9113F, -0.2111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3747F, -4.6006F, 0.5917F, -0.3561F, 0.0434F, 0.0766F));

		PartDefinition cube_r423 = rightFrill.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(18, 88).mirror().addBox(-1.5F, -0.6F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9268F, 1.0463F, -1.1305F, 0.2511F, 0.2076F, 2.6177F));

		PartDefinition cube_r424 = rightFrill.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(75, 70).mirror().addBox(1.5F, -1.6F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-1.1709F, -3.7184F, 0.4404F, -0.0885F, 0.3125F, 1.443F));

		PartDefinition cube_r425 = rightFrill.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(92, 87).mirror().addBox(-2.0642F, -0.3081F, -0.0864F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1036F, -3.6374F, 0.1191F, -0.3318F, -0.033F, 0.0114F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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