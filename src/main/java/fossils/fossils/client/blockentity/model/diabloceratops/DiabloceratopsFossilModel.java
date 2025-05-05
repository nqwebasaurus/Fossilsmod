package fossils.fossils.client.blockentity.model.diabloceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DiabloceratopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart browHorn;
	private final ModelPart rightFace;
	private final ModelPart browHorn2;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart leftLowerbeak2;
	private final ModelPart leftLowerbeak3;
	private final ModelPart rightLowerbeak;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public DiabloceratopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.browHorn = this.leftFace.getChild("browHorn");
		this.rightFace = this.head.getChild("rightFace");
		this.browHorn2 = this.rightFace.getChild("browHorn2");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.leftLowerbeak2 = this.jaw.getChild("leftLowerbeak2");
		this.leftLowerbeak3 = this.jaw.getChild("leftLowerbeak3");
		this.rightLowerbeak = this.jaw.getChild("rightLowerbeak");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.5695F, -4.9874F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.1F, 6.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -1.9F, -7.8F, 0.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3574F, 3.046F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(108, 67).mirror().addBox(-0.6454F, -1.6877F, -0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8086F, 1.2037F, 5.2764F, -0.6751F, 0.2316F, -0.0078F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(-0.1121F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 49).mirror().addBox(-0.1121F, -0.1296F, -0.1578F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -4.9154F, -2.414F, -0.0014F, -0.0492F, -0.0211F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 65).mirror().addBox(-0.499F, -0.4002F, -2.5068F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -3.9154F, -5.814F, 0.2177F, 0.3006F, 0.0547F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 87).mirror().addBox(-4.0F, -0.8383F, -0.9482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(38, 87).addBox(3.0F, -0.8383F, -0.9482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -4.0F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 97).mirror().addBox(-0.5653F, 2.1311F, 1.8831F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8086F, 1.2037F, 5.2764F, 0.2705F, 0.2618F, -0.1309F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(-0.5653F, -1.7951F, 0.1174F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8086F, 1.2037F, 5.2764F, -0.9076F, 0.2618F, -0.1309F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 82).mirror().addBox(-0.6196F, -1.7589F, -2.9886F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8086F, 1.2037F, 5.2764F, -0.4624F, 0.2527F, -0.0617F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 90).mirror().addBox(-0.5718F, -0.597F, -5.979F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8086F, 1.2037F, 5.2764F, -0.8317F, 0.2577F, -0.0844F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.6991F, -2.4654F, -5.1441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8086F, 1.2037F, 5.2764F, -0.1383F, 0.2494F, -0.0505F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(80, 21).mirror().addBox(-0.5513F, 0.1098F, 0.8523F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -2.2583F, -0.9967F, -0.2311F, 0.2595F, 0.035F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(82, 6).mirror().addBox(-0.4211F, 1.0393F, -0.8595F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -2.5358F, -0.1347F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(18, 92).mirror().addBox(-0.6F, -0.908F, -3.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -2.2358F, 0.4653F, 0.6372F, 0.0518F, 0.0073F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(96, 52).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7662F, 0.0809F, -4.3363F, 0.6372F, 0.0518F, 0.0073F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(95, 33).mirror().addBox(-0.6F, 0.4325F, -7.3923F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(61, 39).mirror().addBox(-0.6F, 0.4325F, -6.0923F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -2.2358F, 0.4653F, 0.2009F, 0.0518F, 0.0073F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 79).mirror().addBox(-0.2F, -2.0F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4116F, -1.6675F, 0.1841F, -0.3276F, 0.0404F, -0.1367F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-1.0F, 0.6F, -6.0F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 15).addBox(3.0F, 0.6F, -6.0F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.6532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 77).mirror().addBox(-0.5F, -0.379F, -1.9852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(90, 77).addBox(6.5F, -0.379F, -1.9852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.5F, -4.1581F, -1.7218F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(109, 34).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 34).addBox(6.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -3.2994F, 8.4747F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(52, 96).mirror().addBox(-0.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 96).addBox(6.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -4.143F, 6.3942F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-0.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(15, 61).addBox(6.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, -3.0439F, 4.9247F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(57, 57).addBox(-0.8879F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(57, 49).addBox(-0.8879F, -0.1296F, -0.1578F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -4.9154F, -2.414F, -0.0014F, 0.0492F, 0.0211F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(49, 65).addBox(-0.501F, -0.4002F, -2.5068F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -3.9154F, -5.814F, 0.2177F, -0.3006F, -0.0547F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(95, 97).addBox(-0.4347F, 2.1311F, 1.8831F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8086F, 1.2037F, 5.2764F, 0.2705F, -0.2618F, 0.1309F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(91, 22).addBox(-0.4347F, -1.7951F, 0.1174F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8086F, 1.2037F, 5.2764F, -0.9076F, -0.2618F, 0.1309F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(108, 67).addBox(-0.3546F, -1.6877F, -0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8086F, 1.2037F, 5.2764F, -0.6751F, -0.2316F, 0.0078F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(90, 82).addBox(-0.3804F, -1.7589F, -2.9886F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8086F, 1.2037F, 5.2764F, -0.4624F, -0.2527F, 0.0617F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(9, 90).addBox(-0.4282F, -0.597F, -5.979F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8086F, 1.2037F, 5.2764F, -0.8317F, -0.2577F, 0.0844F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 90).addBox(-0.3009F, -2.4654F, -5.1441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8086F, 1.2037F, 5.2764F, -0.1383F, -0.2494F, 0.0505F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(80, 21).addBox(-0.4487F, 0.1098F, 0.8523F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, -2.2583F, -0.9967F, -0.2311F, -0.2595F, -0.035F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(82, 6).addBox(-0.5789F, 1.0393F, -0.8595F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -2.5358F, -0.1347F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(18, 92).addBox(-0.4F, -0.908F, -3.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -2.2358F, 0.4653F, 0.6372F, -0.0518F, -0.0073F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(96, 52).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.7662F, 0.0809F, -4.3363F, 0.6372F, -0.0518F, -0.0073F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(95, 33).addBox(-0.4F, 0.4325F, -7.3923F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(61, 39).addBox(-0.4F, 0.4325F, -6.0923F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4F, -2.2358F, 0.4653F, 0.2009F, -0.0518F, -0.0073F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(72, 79).addBox(-0.8F, -2.0F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4116F, -1.6675F, 0.1841F, -0.3276F, -0.0404F, 0.1367F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(67, 7).addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -2.5335F, 1.0618F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftleg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(82, 0).addBox(0.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftleg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 70).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftleg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(15, 69).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftleg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(54, 73).addBox(-0.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.8006F, -4.8092F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftleg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(45, 94).addBox(-0.1F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(78, 86).addBox(-0.1F, -0.4383F, -0.1279F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftleg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(42, 81).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftleg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(83, 89).addBox(-1.601F, 3.7011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(63, 93).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftleg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(64, 85).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.9327F, 4.191F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftleg3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 85).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(93, 6).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftfoot.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(96, 46).addBox(-1.0F, -2.1328F, 1.6482F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(48, 28).addBox(-1.999F, -0.5853F, -4.8253F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(67, 7).mirror().addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.9F, -2.5335F, 1.0618F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightleg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-3.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightleg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightleg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightleg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(54, 73).mirror().addBox(-1.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.8006F, -4.8092F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightleg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(45, 94).mirror().addBox(-0.9F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(78, 86).mirror().addBox(-0.9F, -0.4383F, -0.1279F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightleg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 81).mirror().addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightleg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(83, 89).mirror().addBox(-0.399F, 3.7011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 93).mirror().addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightleg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.9327F, 4.191F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightleg3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(93, 6).mirror().addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0446F, 0.0083F, 0.004F));

		PartDefinition cube_r55 = rightfoot.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(96, 46).mirror().addBox(-2.0F, -2.1328F, 1.6482F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(48, 28).mirror().addBox(-2.001F, -0.5853F, -4.8253F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9194F, -4.923F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(58, 108).addBox(0.0F, -3.2616F, -4.6978F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 100).addBox(0.0F, -2.6616F, -6.6978F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7184F, 1.8039F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(30, 61).addBox(0.0F, -3.6694F, -0.1443F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3184F, -10.6961F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(15, 52).addBox(0.0F, -3.3694F, -0.1443F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3184F, -8.6961F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(10, 103).addBox(0.0F, -3.2764F, -0.1077F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3816F, -6.6961F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(102, 8).mirror().addBox(-2.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0554F, -0.0092F, -0.3139F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(102, 6).mirror().addBox(-4.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0108F, 0.0177F, -0.8578F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-12.3996F, -3.7378F, -2.5366F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0006F, 0.4222F, -1.3812F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(61, 47).mirror().addBox(-6.8101F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0005F, 0.1778F, -1.3814F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(76, 45).mirror().addBox(-12.0038F, -3.8478F, -1.5367F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0441F, 0.4531F, -1.3663F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(91, 44).mirror().addBox(-6.1529F, -3.869F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0415F, 0.2961F, -1.3735F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(104, 58).mirror().addBox(-3.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.1494F, 0.1755F, -0.8443F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(104, 56).mirror().addBox(-2.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.2547F, 0.0552F, -0.3093F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(29, 22).mirror().addBox(-14.8804F, -3.7351F, -0.4699F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.0849F, 0.4316F, -1.3621F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(101, 88).mirror().addBox(-4.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.2959F, 0.3297F, -0.8075F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(101, 86).mirror().addBox(-2.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.4555F, 0.1174F, -0.2919F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(71, 25).mirror().addBox(-5.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.0609F, -0.0609F, -1.3877F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(29, 84).mirror().addBox(-5.133F, -3.7878F, -3.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.0569F, 0.4438F, -1.4129F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(101, 62).mirror().addBox(-4.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.3089F, -0.3337F, -0.8062F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(61, 101).mirror().addBox(-2.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.4817F, -0.1723F, -0.2638F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(48, 39).mirror().addBox(-10.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0434F, 0.2688F, -1.3976F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(97, 60).mirror().addBox(-5.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0419F, 0.0421F, -1.3878F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(101, 68).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.1386F, -0.1535F, -0.8476F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(100, 3).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.4563F, -2.4056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(100, 14).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -0.7563F, -4.4056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -0.9109F, -6.6714F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(49, 100).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -0.5109F, -8.6714F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, 0.3731F, -10.4594F, 0.429F, -0.1843F, 0.5459F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(91, 103).mirror().addBox(-2.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.2446F, -0.1044F, -0.2967F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(102, 8).addBox(0.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0554F, 0.0092F, 0.3139F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(102, 6).addBox(2.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0108F, -0.0177F, 0.8578F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(82, 12).addBox(6.3996F, -3.7378F, -2.5366F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0006F, -0.4222F, 1.3812F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(61, 47).addBox(2.81F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0005F, -0.1778F, 1.3814F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(76, 45).addBox(6.0038F, -3.8478F, -1.5367F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0441F, -0.4531F, 1.3663F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(91, 44).addBox(2.1529F, -3.869F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0415F, -0.2961F, 1.3735F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(104, 58).addBox(1.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.1494F, -0.1755F, 0.8443F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(104, 56).addBox(0.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.2547F, -0.0552F, 0.3093F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(29, 22).addBox(2.8804F, -3.7351F, -0.4699F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.0849F, -0.4316F, 1.3621F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(101, 88).addBox(2.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.2959F, -0.3297F, 0.8075F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(101, 86).addBox(0.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.4555F, -0.1174F, 0.2919F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(71, 25).addBox(2.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.0609F, 0.0609F, 1.3877F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(29, 84).addBox(4.133F, -3.7878F, -3.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.0569F, -0.4438F, 1.4129F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(101, 62).addBox(2.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.3089F, 0.3337F, 0.8062F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(61, 101).addBox(0.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.4817F, 0.1723F, 0.2638F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(48, 39).addBox(5.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0434F, -0.2688F, 1.3976F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(97, 60).addBox(2.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0419F, -0.0421F, 1.3878F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(101, 68).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.1386F, 0.1535F, 0.8476F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(100, 3).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.4563F, -2.4056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(100, 14).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -0.7563F, -4.4056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(100, 0).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -0.9109F, -6.6714F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(49, 100).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -0.5109F, -8.6714F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 100).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3851F, 0.3731F, -10.4594F, 0.429F, 0.1843F, -0.5459F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(91, 103).addBox(0.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.2446F, 0.1044F, 0.2967F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -0.0745F, -5.9424F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5816F, -5.8961F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(50, 9).addBox(-1.0F, -1.3073F, -7.6534F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.7184F, 1.8039F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5184F, -11.6961F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(53, 103).addBox(0.0F, -6.3823F, 3.3766F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 73).addBox(0.0F, -7.2823F, 5.1766F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 101).addBox(0.0F, -5.5823F, 1.6766F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 44).addBox(0.0F, -4.3823F, -0.0234F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(0.2114F, -3.1838F, -4.0734F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-6.0918F, 3.1355F, -1.8308F, 1.6477F, -0.2129F, 0.0993F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(7, 95).mirror().addBox(0.2114F, -2.2338F, -5.3027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0918F, 3.1355F, -1.8308F, 1.0804F, -0.2129F, 0.0993F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(91, 14).mirror().addBox(-0.5F, -0.175F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.2332F, -0.9212F, 3.0479F, 0.5736F, -0.0515F, 0.0912F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(72, 60).mirror().addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.1471F, -1.6555F, 2.6827F, 0.7045F, -0.0515F, 0.0912F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(100, 97).mirror().addBox(-2.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.625F, 0.2341F, -0.2993F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(100, 17).mirror().addBox(-4.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.393F, 0.513F, -0.8048F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(48, 37).mirror().addBox(-11.7642F, -3.7644F, -0.2185F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0541F, 0.6334F, -1.415F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(98, 103).mirror().addBox(-2.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.5751F, 0.1476F, -0.3105F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(103, 70).mirror().addBox(-4.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.3915F, 0.4136F, -0.8072F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(48, 35).mirror().addBox(-12.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.1194F, 0.5501F, -1.3802F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(102, 36).mirror().addBox(-2.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.5061F, 0.1323F, -0.2856F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(29, 26).mirror().addBox(-14.77F, -3.756F, -0.5341F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.0972F, 0.4828F, -1.3567F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(102, 34).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.3347F, 0.3673F, -0.7943F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(102, 32).mirror().addBox(-1.9111F, 0.0499F, -0.5051F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.0141F, -0.6216F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(29, 24).mirror().addBox(-14.6969F, -2.65F, -0.5391F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.0141F, -0.6216F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(102, 19).mirror().addBox(-3.6202F, -2.443F, 1.1159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.414F, -1.7216F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(11, 81).mirror().addBox(-0.3988F, -2.3469F, -3.3621F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.6446F, 8.0425F, -3.8763F, 1.4632F, -0.3986F, -0.8841F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(90, 56).mirror().addBox(-0.2468F, -2.3469F, -0.4418F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6446F, 8.0425F, -3.8763F, 1.3292F, -0.3372F, -0.5155F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3747F, 2.4476F, -0.1726F, 0.9227F, -0.0515F, 0.0912F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(0.2114F, -0.3767F, -3.8784F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0918F, 3.1355F, -1.8308F, 0.6005F, -0.2129F, 0.0993F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(64, 65).mirror().addBox(-0.4503F, -0.3036F, -2.1659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.3124F, 1.5667F, 0.7943F, -1.1555F, -0.7286F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(67, 27).mirror().addBox(0.0912F, -0.2503F, -0.9112F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.8453F, 1.9216F, 0.3704F, -1.1546F, -0.1895F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(85, 47).mirror().addBox(-0.6822F, -0.1832F, -0.5535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.3929F, 0.3506F, 0.7776F, -1.1098F, -0.5606F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(97, 108).mirror().addBox(0.9737F, 0.6114F, 2.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(67, 0).mirror().addBox(-0.0263F, 0.6114F, -2.4179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(97, 108).addBox(2.3737F, 0.6114F, 2.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(67, 0).addBox(2.3737F, 0.6114F, -2.4179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 11.315F, -0.6548F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-0.0263F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 54).addBox(2.3737F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1737F, 12.7149F, -3.3548F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(7, 100).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 94).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5818F, -2.1266F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(100, 97).addBox(0.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.625F, -0.2341F, 0.2993F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(100, 17).addBox(2.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.393F, -0.513F, 0.8048F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(48, 37).addBox(2.7642F, -3.7644F, -0.2185F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0541F, -0.6334F, 1.415F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(98, 103).addBox(0.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.5751F, -0.1476F, 0.3105F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(103, 70).addBox(2.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.3915F, -0.4136F, 0.8072F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(48, 35).addBox(2.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.1194F, -0.5501F, 1.3802F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(102, 36).addBox(0.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.5061F, -0.1323F, 0.2856F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(29, 26).addBox(2.77F, -3.756F, -0.5341F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.0972F, -0.4828F, 1.3567F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(102, 34).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.3347F, -0.3673F, 0.7943F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(102, 32).addBox(-0.0889F, 0.0499F, -0.5051F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.0141F, -0.6216F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(29, 24).addBox(2.6969F, -2.65F, -0.5391F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.0141F, -0.6216F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(102, 19).addBox(1.6202F, -2.443F, 1.1159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.414F, -1.7216F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(11, 81).addBox(-0.6012F, -2.3469F, -3.3621F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.6446F, 8.0425F, -3.8763F, 1.4632F, 0.3986F, 0.8841F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(90, 56).addBox(-0.7532F, -2.3469F, -0.4418F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6446F, 8.0425F, -3.8763F, 1.3292F, 0.3372F, 0.5155F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(91, 14).addBox(-0.5F, -0.175F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.2332F, -0.9212F, 3.0479F, 0.5736F, 0.0515F, -0.0912F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(72, 60).addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.1471F, -1.6555F, 2.6827F, 0.7045F, 0.0515F, -0.0912F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3747F, 2.4476F, -0.1726F, 0.9227F, 0.0515F, -0.0912F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(93, 0).addBox(-1.0548F, -3.8252F, -3.6251F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(6.0F, 3.5324F, -1.1444F, 1.6477F, 0.2129F, -0.0993F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(7, 95).addBox(-1.0548F, -3.0157F, -5.2693F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.0F, 3.5324F, -1.1444F, 1.0804F, 0.2129F, -0.0993F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(77, 72).addBox(-1.0548F, -1.0857F, -4.2098F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 3.5324F, -1.1444F, 0.6005F, 0.2129F, -0.0993F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(64, 65).addBox(-0.5497F, -0.3036F, -2.1659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.3124F, 1.5667F, 0.7943F, 1.1555F, 0.7286F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(67, 27).addBox(-1.0912F, -0.2503F, -0.9112F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.8453F, 1.9216F, 0.3704F, 1.1546F, 0.1895F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(85, 47).addBox(-0.3178F, -0.1832F, -0.5535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.3929F, 0.3506F, 0.7776F, 1.1098F, 0.5606F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(7, 100).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 94).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5818F, -2.1266F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0F, -0.907F, -0.4667F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.467F, 8.7364F, -2.8903F, -0.3491F, 0.0F, -0.2618F));

		PartDefinition cube_r162 = leftarm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(34, 51).addBox(-0.0544F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r163 = leftarm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(100, 22).addBox(-0.1791F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r164 = leftarm.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(20, 84).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftarm.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(64, 72).addBox(-2.0F, -2.1F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftarm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(29, 86).addBox(-0.9824F, -3.7907F, -0.4712F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6978F, 6.6387F, 3.1719F, -0.5384F, -0.7678F, 1.0283F));

		PartDefinition cube_r167 = leftarm2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(83, 79).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 14).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 7.5086F, -2.6347F, 2.0499F, 0.6267F, -0.3359F));

		PartDefinition cube_r168 = lefthand.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(53, 85).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r169 = lefthand.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(79, 67).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r170 = lefthand.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(92, 87).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r171 = lefthand.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(92, 66).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.467F, 8.7364F, -2.8903F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r172 = rightarm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(34, 51).mirror().addBox(-0.9456F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r173 = rightarm.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(100, 22).mirror().addBox(-0.8209F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r174 = rightarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r175 = rightarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(64, 72).mirror().addBox(-1.0F, -2.1F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r176 = rightarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(29, 86).mirror().addBox(-1.0176F, -3.7907F, -0.4712F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6978F, 6.6387F, 3.1719F, -0.1002F, 0.7649F, -0.5691F));

		PartDefinition cube_r177 = rightarm2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(83, 79).mirror().addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 14).mirror().addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 7.5086F, -2.6347F, 1.0463F, -0.6267F, 0.3359F));

		PartDefinition cube_r178 = righthand.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(53, 85).mirror().addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r179 = righthand.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 67).mirror().addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r180 = righthand.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(92, 87).mirror().addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r181 = righthand.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(92, 66).mirror().addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4859F, -6.1216F, -0.262F, 0.0421F, -0.0113F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(42, 102).addBox(0.0F, -2.6702F, -0.1462F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(105, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.7482F, 0.4455F, -0.4215F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(18, 105).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.3858F, 0.754F, -0.9727F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1539F, 0.8183F, -1.7175F));

		PartDefinition cube_r186 = neck2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(105, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.7482F, -0.4455F, 0.4389F));

		PartDefinition cube_r187 = neck2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(18, 105).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.3858F, -0.754F, 0.9901F));

		PartDefinition cube_r188 = neck2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(92, 70).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1539F, -0.8183F, 1.7349F));

		PartDefinition cube_r189 = neck2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(82, 27).addBox(-1.0F, -1.1F, -1.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -2.6F, 0.0438F, 0.0871F, 0.0057F));

		PartDefinition cube_r190 = neck.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(68, 99).addBox(0.0F, -3.4F, -2.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(-1.0F, -1.4F, -4.7F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r191 = neck.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(105, 23).mirror().addBox(-2.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r192 = neck.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(105, 23).addBox(0.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 52).addBox(-2.0F, -3.7799F, -3.2331F, 4.0F, 6.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6F, -5.6F, -0.3377F, 0.098F, 0.0157F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(30, 68).addBox(-1.5F, -4.0267F, -0.0151F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7817F, -3.2125F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(42, 49).addBox(-1.0F, -5.067F, 1.4406F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7567F, -9.3625F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(106, 93).addBox(-1.2F, -0.0497F, -0.9977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 2.6433F, -10.0375F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(97, 56).addBox(-1.2F, 0.0626F, -2.0078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7F, 3.1183F, -9.2875F, 0.4407F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(24, 69).addBox(-1.2F, -0.2811F, -1.0635F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7F, 1.6933F, -9.8375F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(106, 90).addBox(-1.2F, -0.9061F, -1.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.6933F, -9.8375F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(82, 99).addBox(-1.0F, -0.9454F, 0.0456F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4812F, -7.4189F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(99, 80).addBox(-1.0F, -1.0183F, -0.0198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.4812F, -8.4189F, -1.6362F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(99, 77).addBox(-1.0F, -0.4991F, -0.0148F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2562F, -8.8439F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(85, 52).addBox(-1.5F, -0.65F, -1.35F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5627F, -5.8397F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(61, 78).addBox(-2.5F, -0.0875F, 0.1229F, 4.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -3.2567F, -4.1875F, 0.4232F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(19, 51).addBox(-2.5F, -7.375F, -0.8F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(72, 47).addBox(-2.5F, -6.525F, 3.1F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0433F, -2.4625F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.274F, 0.3833F, -0.1006F, -1.8664F, 0.0318F, 0.2951F));

		PartDefinition cube_r205 = leftCheek.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(97, 10).addBox(-0.3313F, -1.5672F, -0.9374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(75, 96).addBox(-0.3313F, -1.9672F, -0.9374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.926F, 0.2768F, 2.237F, 0.9201F, 0.778F, 0.6183F));

		PartDefinition cube_r206 = leftCheek.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(108, 41).addBox(-0.2626F, -2.3116F, 0.2157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.926F, 0.2768F, 2.237F, 0.5416F, 0.8138F, 0.5863F));

		PartDefinition cube_r207 = leftCheek.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(56, 105).addBox(-0.3204F, -1.0188F, 1.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.926F, 0.2768F, 2.237F, 1.2953F, 0.778F, 0.6183F));

		PartDefinition cube_r208 = leftCheek.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(21, 97).addBox(-0.3204F, -0.8468F, -0.5145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.926F, 0.2768F, 2.237F, 1.4698F, 0.778F, 0.6183F));

		PartDefinition cube_r209 = leftCheek.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(24, 76).addBox(-0.5F, -1.525F, -3.6F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3379F, -0.1427F, 1.0781F, 1.532F, 0.6816F, 0.4262F));

		PartDefinition cube_r210 = leftCheek.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(43, 73).addBox(-0.2875F, -1.5366F, -2.9363F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3779F, 0.4653F, 0.5845F, 0.391F, 0.4822F, 0.3197F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.274F, 0.3833F, -0.1006F, -1.8664F, -0.0318F, -0.2951F));

		PartDefinition cube_r211 = rightCheek.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(97, 10).mirror().addBox(-0.6687F, -1.5672F, -0.9374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(75, 96).mirror().addBox(-0.6687F, -1.9672F, -0.9374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.926F, 0.2768F, 2.237F, 0.9201F, -0.778F, -0.6183F));

		PartDefinition cube_r212 = rightCheek.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(108, 41).mirror().addBox(-0.7374F, -2.3116F, 0.2157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.926F, 0.2768F, 2.237F, 0.5416F, -0.8138F, -0.5863F));

		PartDefinition cube_r213 = rightCheek.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(56, 105).mirror().addBox(-0.6796F, -1.0188F, 1.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.926F, 0.2768F, 2.237F, 1.2953F, -0.778F, -0.6183F));

		PartDefinition cube_r214 = rightCheek.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(21, 97).mirror().addBox(-0.6796F, -0.8468F, -0.5145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.926F, 0.2768F, 2.237F, 1.4698F, -0.778F, -0.6183F));

		PartDefinition cube_r215 = rightCheek.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(24, 76).mirror().addBox(-0.5F, -1.525F, -3.6F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3379F, -0.1427F, 1.0781F, 1.532F, -0.6816F, -0.4262F));

		PartDefinition cube_r216 = rightCheek.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(43, 73).mirror().addBox(-0.7125F, -1.5366F, -2.9363F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3779F, 0.4653F, 0.5845F, 0.391F, -0.4822F, -0.3197F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offset(0.5296F, 4.4904F, -9.6277F));

		PartDefinition cube_r217 = leftBeak.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(102, 105).addBox(-0.5456F, -0.7885F, -0.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(105, 99).addBox(-0.5456F, -1.1885F, -0.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5894F, 3.8413F, -0.0683F, -0.0081F, 0.0579F, 0.0798F));

		PartDefinition cube_r218 = leftBeak.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(97, 105).addBox(-0.5445F, -0.3062F, -0.3175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.5894F, 3.5913F, -0.3933F, 0.8034F, 0.0579F, 0.0798F));

		PartDefinition cube_r219 = leftBeak.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(102, 105).addBox(-0.5456F, -0.7885F, -0.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(105, 99).addBox(-0.5456F, -1.1885F, -0.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2394F, 3.8663F, -0.0683F, -0.0081F, 0.0579F, 0.0798F));

		PartDefinition cube_r220 = leftBeak.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(97, 105).addBox(-0.5445F, -0.3062F, -0.3175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.2394F, 3.6163F, -0.3933F, 0.8034F, 0.0579F, 0.0798F));

		PartDefinition cube_r221 = leftBeak.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(14, 101).addBox(-0.5341F, -2.0258F, -0.1271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4644F, 3.5663F, -0.2933F, 0.6421F, 0.0699F, 0.0695F));

		PartDefinition cube_r222 = leftBeak.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(106, 82).addBox(-0.5431F, 0.0086F, -1.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2709F, 2.3061F, 1.0847F, -0.7803F, 0.0699F, 0.0695F));

		PartDefinition cube_r223 = leftBeak.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(100, 27).addBox(-0.5F, -1.0F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2709F, 1.4561F, 0.8597F, -1.2603F, 0.0699F, 0.0695F));

		PartDefinition cube_r224 = leftBeak.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(76, 109).addBox(-1.125F, -0.775F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5046F, 1.4669F, 2.1664F, 1.0115F, 0.1648F, 0.1964F));

		PartDefinition cube_r225 = leftBeak.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(13, 105).addBox(-1.5494F, -1.9529F, -0.0897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, 2.0066F, -1.6304F, 0.3105F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offset(-0.5296F, 4.4904F, -9.6277F));

		PartDefinition cube_r226 = rightBeak.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(102, 105).mirror().addBox(-0.4544F, -0.7885F, -0.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(105, 99).mirror().addBox(-0.4544F, -1.1885F, -0.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5894F, 3.8413F, -0.0683F, -0.0081F, -0.0579F, -0.0798F));

		PartDefinition cube_r227 = rightBeak.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(97, 105).mirror().addBox(-0.4555F, -0.3062F, -0.3175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.5894F, 3.5913F, -0.3933F, 0.8034F, -0.0579F, -0.0798F));

		PartDefinition cube_r228 = rightBeak.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(102, 105).mirror().addBox(-0.4544F, -0.7885F, -0.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(105, 99).mirror().addBox(-0.4544F, -1.1885F, -0.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2394F, 3.8663F, -0.0683F, -0.0081F, -0.0579F, -0.0798F));

		PartDefinition cube_r229 = rightBeak.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(97, 105).mirror().addBox(-0.4554F, -0.3062F, -0.3175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.2394F, 3.6163F, -0.3933F, 0.8034F, -0.0579F, -0.0798F));

		PartDefinition cube_r230 = rightBeak.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(14, 101).mirror().addBox(-0.4659F, -2.0258F, -0.1271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4644F, 3.5663F, -0.2933F, 0.6421F, -0.0699F, -0.0695F));

		PartDefinition cube_r231 = rightBeak.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(106, 82).mirror().addBox(-0.4569F, 0.0086F, -1.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2709F, 2.3061F, 1.0847F, -0.7803F, -0.0699F, -0.0695F));

		PartDefinition cube_r232 = rightBeak.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(100, 27).mirror().addBox(-0.5F, -1.0F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2709F, 1.4561F, 0.8597F, -1.2603F, -0.0699F, -0.0695F));

		PartDefinition cube_r233 = rightBeak.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(76, 109).mirror().addBox(0.125F, -0.775F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5046F, 1.4669F, 2.1664F, 1.0115F, -0.1648F, -0.1964F));

		PartDefinition cube_r234 = rightBeak.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(13, 105).mirror().addBox(0.5494F, -1.9529F, -0.0897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, 2.0066F, -1.6304F, 0.3105F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 6.0002F, -7.2085F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 77).addBox(-2.3325F, -3.7933F, 0.007F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.425F, 0.55F, 0.3896F, 0.3252F, 0.0935F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(47, 89).addBox(-1.0F, -2.2929F, -0.2555F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(-0.0267F, -5.2669F, 3.0734F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(89, 39).addBox(-1.0F, -0.2734F, -1.6764F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.0267F, -7.2669F, 3.5734F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(88, 72).addBox(-1.0F, -1.125F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0267F, -7.0669F, 2.6734F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(105, 49).addBox(0.38F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 105).addBox(0.155F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3967F, -7.0F, 2.7477F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(107, 0).addBox(0.0F, -1.0093F, -1.0483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, -3.1569F, -0.854F, -1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 107).addBox(0.0F, -0.467F, 3.7406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4F, -6.7569F, -2.154F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(106, 64).addBox(-1.0F, 0.0215F, -0.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, -5.6319F, -3.079F, -0.973F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(106, 79).addBox(-1.0F, -0.015F, -0.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, -2.2819F, -4.829F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(106, 76).addBox(-1.0F, -0.0151F, -0.0067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -3.2819F, -4.829F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(76, 106).addBox(-1.0F, -0.0401F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, -4.1819F, -4.454F, -0.3971F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(103, 42).addBox(-1.2F, -2.0375F, -0.9492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -4.7819F, -2.154F, -1.5664F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(48, 103).addBox(-1.1F, -3.7361F, -2.8338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.5819F, 0.121F, 1.6624F, 0.0873F, 0.0175F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(85, 56).addBox(-1.1F, -1.95F, -1.1112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, -2.5819F, 0.121F, 2.6573F, 0.0873F, 0.0175F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(43, 68).addBox(-1.1F, -2.5117F, -0.3738F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.5819F, 0.121F, 2.6224F, 0.0873F, 0.0175F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(92, 91).addBox(-1.1F, -3.6845F, -2.8989F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, -2.5819F, 0.121F, 1.357F, 0.0873F, 0.0175F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(105, 102).addBox(-1.0F, 0.0234F, 0.0126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -5.1069F, -3.929F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(81, 106).addBox(-1.0F, 0.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, -5.4814F, -1.5354F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(86, 33).addBox(0.2F, -0.9515F, -0.0493F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(79, 60).addBox(-0.5F, -2.3515F, 0.0507F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, -0.4984F, 1.9241F, 0.3665F, 0.2094F, 0.0F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(83, 94).addBox(-0.5011F, -2.082F, 0.0426F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, -0.7984F, 1.9241F, 1.4137F, 0.2094F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(102, 72).addBox(-0.5F, -2.0515F, -1.0493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1735F, -2.2477F, 5.5629F, -0.1134F, 0.2094F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(71, 105).addBox(-1.0F, -0.9785F, -0.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -5.6319F, -3.079F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(80, 14).addBox(-0.275F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1887F, -8.3331F, 6.1263F, 0.1937F, 0.2529F, 0.0701F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(66, 108).addBox(-2.0615F, -0.1867F, 2.3432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7524F, -9.4907F, 4.8468F, 0.3366F, 0.5884F, 0.1639F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(76, 39).addBox(-2.0784F, -0.2007F, -1.0903F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7524F, -9.4907F, 4.8468F, 0.2862F, 0.2397F, 0.0369F));

		PartDefinition browHorn = leftFace.addOrReplaceChild("browHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3748F, -8.6487F, 1.296F, 1.3244F, 0.0389F, -2.9683F));

		PartDefinition cube_r260 = browHorn.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(36, 92).addBox(-0.4897F, -0.1412F, -1.7923F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1361F, -0.2327F, -0.9849F, 2.1287F, 0.0F, 0.0F));

		PartDefinition cube_r261 = browHorn.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(27, 92).addBox(-0.5F, -0.0457F, -2.8743F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1361F, 0.5673F, -0.4849F, 1.7796F, 0.0F, 0.0F));

		PartDefinition cube_r262 = browHorn.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(5, 107).addBox(-0.5F, 0.0355F, -0.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1361F, -1.6077F, -2.3349F, 0.8503F, 0.0F, 0.0F));

		PartDefinition cube_r263 = browHorn.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(18, 107).addBox(-0.5F, -0.0023F, -0.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1361F, -1.9827F, -2.9849F, 1.0161F, 0.0F, 0.0F));

		PartDefinition cube_r264 = browHorn.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(61, 107).addBox(-0.5F, -0.168F, -0.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1361F, -2.2327F, -3.5099F, 1.1033F, 0.0F, 0.0F));

		PartDefinition cube_r265 = browHorn.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(28, 108).addBox(-0.5F, -1.3078F, -0.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(23, 108).addBox(-0.5F, -0.8078F, -0.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.1361F, -2.8827F, -5.1099F, 1.8495F, 0.0F, 0.0F));

		PartDefinition cube_r266 = browHorn.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(38, 108).addBox(-0.5F, -0.302F, -0.6978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(108, 38).addBox(-0.5F, 0.198F, -0.6978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1361F, -2.8327F, -5.0849F, 1.5178F, 0.0F, 0.0F));

		PartDefinition cube_r267 = browHorn.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(107, 105).addBox(-0.5F, -1.2658F, -0.7675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(107, 96).addBox(-0.5F, -0.7658F, -0.7675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.1361F, -3.0077F, -4.1599F, 1.6836F, 0.0F, 0.0F));

		PartDefinition cube_r268 = browHorn.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(86, 107).addBox(-0.5F, -0.8907F, -0.8553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.1361F, -3.0077F, -3.4349F, 1.5877F, 0.0F, 0.0F));

		PartDefinition cube_r269 = browHorn.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(107, 72).addBox(-0.5F, -0.1795F, -0.1922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1361F, -2.3327F, -4.1349F, 1.4306F, 0.0F, 0.0F));

		PartDefinition cube_r270 = browHorn.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(48, 107).addBox(-0.5F, -0.8974F, -0.9045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1361F, -2.9077F, -2.6849F, 1.4393F, 0.0F, 0.0F));

		PartDefinition cube_r271 = browHorn.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(107, 14).addBox(-0.5F, -1.0903F, -1.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1361F, -2.6077F, -1.6599F, 1.2779F, 0.0F, 0.0F));

		PartDefinition cube_r272 = browHorn.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(107, 3).addBox(-0.5F, -1.0624F, -1.0494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1361F, -2.1827F, -0.7849F, 1.0815F, 0.0F, 0.0F));

		PartDefinition cube_r273 = browHorn.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(90, 97).addBox(-0.5F, -1.5099F, -0.9643F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1361F, -1.1327F, 0.2151F, 0.8197F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 6.0002F, -7.2085F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(0.3325F, -3.7933F, 0.007F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.425F, 0.55F, 0.3896F, -0.3252F, -0.0935F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(47, 89).mirror().addBox(-1.0F, -2.2929F, -0.2555F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.252F)).mirror(false), PartPose.offsetAndRotation(0.0267F, -5.2669F, 3.0734F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(89, 39).mirror().addBox(-1.0F, -0.2734F, -1.6764F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(0.0267F, -7.2669F, 3.5734F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(88, 72).mirror().addBox(-1.0F, -1.125F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0267F, -7.0669F, 2.6734F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(105, 49).mirror().addBox(-1.38F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 105).mirror().addBox(-1.155F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3967F, -7.0F, 2.7477F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-1.0F, -1.0093F, -1.0483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4F, -3.1569F, -0.854F, -1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-1.0F, -0.467F, 3.7406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4F, -6.7569F, -2.154F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(106, 64).mirror().addBox(0.0F, 0.0215F, -0.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6F, -5.6319F, -3.079F, -0.973F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(0.0F, -0.015F, -0.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6F, -2.2819F, -4.829F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(106, 76).mirror().addBox(0.0F, -0.0151F, -0.0067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, -3.2819F, -4.829F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(76, 106).mirror().addBox(0.0F, -0.0401F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6F, -4.1819F, -4.454F, -0.3971F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(103, 42).mirror().addBox(0.2F, -2.0375F, -0.9492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -4.7819F, -2.154F, -1.5664F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(48, 103).mirror().addBox(0.1F, -3.7361F, -2.8338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -2.5819F, 0.121F, 1.6624F, -0.0873F, -0.0175F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(85, 56).mirror().addBox(0.1F, -1.95F, -1.1112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3F, -2.5819F, 0.121F, 2.6573F, -0.0873F, -0.0175F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(43, 68).mirror().addBox(0.1F, -2.5117F, -0.3738F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -2.5819F, 0.121F, 2.6224F, -0.0873F, -0.0175F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(92, 91).mirror().addBox(0.1F, -3.6845F, -2.8989F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.3F, -2.5819F, 0.121F, 1.357F, -0.0873F, -0.0175F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(105, 102).mirror().addBox(0.0F, 0.0234F, 0.0126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, -5.1069F, -3.929F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(81, 106).mirror().addBox(0.0F, 0.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -5.4814F, -1.5354F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-0.2F, -0.9515F, -0.0493F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 60).mirror().addBox(-0.5F, -2.3515F, 0.0507F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.4984F, 1.9241F, 0.3665F, -0.2094F, 0.0F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(83, 94).mirror().addBox(-0.4989F, -2.082F, 0.0426F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.7984F, 1.9241F, 1.4137F, -0.2094F, 0.0F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(102, 72).mirror().addBox(-0.5F, -2.0515F, -1.0493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1735F, -2.2477F, 5.5629F, -0.1134F, -0.2094F, 0.0F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(71, 105).mirror().addBox(0.0F, -0.9785F, -0.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6F, -5.6319F, -3.079F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(80, 14).mirror().addBox(-0.725F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1887F, -8.3331F, 6.1263F, 0.1937F, -0.2529F, -0.0701F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(66, 108).mirror().addBox(1.0615F, -0.1867F, 2.3432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7524F, -9.4907F, 4.8468F, 0.3366F, -0.5884F, -0.1639F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(0.0784F, -0.2007F, -1.0903F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7524F, -9.4907F, 4.8468F, 0.2862F, -0.2397F, -0.0369F));

		PartDefinition browHorn2 = rightFace.addOrReplaceChild("browHorn2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3748F, -8.6487F, 1.296F, 1.3244F, -0.0389F, 2.9683F));

		PartDefinition cube_r299 = browHorn2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(36, 92).mirror().addBox(-0.5103F, -0.1412F, -1.7923F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -0.2327F, -0.9849F, 2.1287F, 0.0F, 0.0F));

		PartDefinition cube_r300 = browHorn2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(27, 92).mirror().addBox(-0.5F, -0.0457F, -2.8743F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1361F, 0.5673F, -0.4849F, 1.7796F, 0.0F, 0.0F));

		PartDefinition cube_r301 = browHorn2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(5, 107).mirror().addBox(-0.5F, 0.0355F, -0.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -1.6077F, -2.3349F, 0.8503F, 0.0F, 0.0F));

		PartDefinition cube_r302 = browHorn2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(18, 107).mirror().addBox(-0.5F, -0.0023F, -0.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -1.9827F, -2.9849F, 1.0161F, 0.0F, 0.0F));

		PartDefinition cube_r303 = browHorn2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(61, 107).mirror().addBox(-0.5F, -0.168F, -0.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -2.2327F, -3.5099F, 1.1033F, 0.0F, 0.0F));

		PartDefinition cube_r304 = browHorn2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(28, 108).mirror().addBox(-0.5F, -1.3078F, -0.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(23, 108).mirror().addBox(-0.5F, -0.8078F, -0.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -2.8827F, -5.1099F, 1.8495F, 0.0F, 0.0F));

		PartDefinition cube_r305 = browHorn2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(38, 108).mirror().addBox(-0.5F, -0.302F, -0.6978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(108, 38).mirror().addBox(-0.5F, 0.198F, -0.6978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -2.8327F, -5.0849F, 1.5178F, 0.0F, 0.0F));

		PartDefinition cube_r306 = browHorn2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(107, 105).mirror().addBox(-0.5F, -1.2658F, -0.7675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(107, 96).mirror().addBox(-0.5F, -0.7658F, -0.7675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -3.0077F, -4.1599F, 1.6836F, 0.0F, 0.0F));

		PartDefinition cube_r307 = browHorn2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(86, 107).mirror().addBox(-0.5F, -0.8907F, -0.8553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -3.0077F, -3.4349F, 1.5877F, 0.0F, 0.0F));

		PartDefinition cube_r308 = browHorn2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(107, 72).mirror().addBox(-0.5F, -0.1795F, -0.1922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -2.3327F, -4.1349F, 1.4306F, 0.0F, 0.0F));

		PartDefinition cube_r309 = browHorn2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(48, 107).mirror().addBox(-0.5F, -0.8974F, -0.9045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -2.9077F, -2.6849F, 1.4393F, 0.0F, 0.0F));

		PartDefinition cube_r310 = browHorn2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(107, 14).mirror().addBox(-0.5F, -1.0903F, -1.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -2.6077F, -1.6599F, 1.2779F, 0.0F, 0.0F));

		PartDefinition cube_r311 = browHorn2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(107, 3).mirror().addBox(-0.5F, -1.0624F, -1.0494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -2.1827F, -0.7849F, 1.0815F, 0.0F, 0.0F));

		PartDefinition cube_r312 = browHorn2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(90, 97).mirror().addBox(-0.5F, -1.5099F, -0.9643F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1361F, -1.1327F, 0.2151F, 0.8197F, 0.0F, 0.0F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8567F, -2.0625F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r313 = frill.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(103, 38).addBox(-2.3733F, 1.8311F, -2.4069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8733F, -10.6087F, 5.8108F, -0.1702F, 0.0F, 0.0F));

		PartDefinition cube_r314 = frill.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(5, 103).addBox(-0.5F, -1.9503F, -0.9507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2203F, 3.1566F, -0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r315 = frill.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, -2.0763F, 0.0085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0203F, 1.1566F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r316 = frill.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(81, 102).addBox(-0.5F, -2.0574F, -0.0037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1203F, -0.1434F, -0.973F, 0.0F, 0.0F));

		PartDefinition cube_r317 = frill.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(71, 86).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.1173F, 1.6812F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r318 = frill.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(93, 27).addBox(-1.0F, -3.3096F, -0.971F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5015F, 3.6349F, -0.2094F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(2.017F, -4.8651F, 3.2714F, -0.2277F, -0.8409F, 0.3628F));

		PartDefinition cube_r319 = leftFrill.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(35, 97).addBox(-1.8096F, -0.6651F, -0.5013F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0139F, 1.0742F, -0.3176F, -0.2736F, -0.0317F, 0.4676F));

		PartDefinition cube_r320 = leftFrill.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(71, 34).addBox(-6.0305F, -0.3791F, -0.5013F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0139F, 1.0742F, -0.3176F, -0.1516F, -0.275F, -0.4026F));

		PartDefinition cube_r321 = leftFrill.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(53, 108).addBox(-0.1279F, -0.7596F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(3.9757F, 2.1264F, -0.1817F, -0.171F, 0.2509F, 1.8081F));

		PartDefinition cube_r322 = leftFrill.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(99, 83).addBox(-1.4467F, -0.5796F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.9757F, 2.1264F, -0.1817F, -0.297F, 0.059F, 1.0355F));

		PartDefinition cube_r323 = leftFrill.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(108, 60).addBox(-0.4144F, -0.5551F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(3.9609F, 3.6849F, -0.5466F, 0.1821F, 0.2806F, 2.9338F));

		PartDefinition cube_r324 = leftFrill.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(108, 52).addBox(-0.5811F, -0.5616F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.9609F, 3.6849F, -0.5466F, -0.2093F, 0.2611F, 1.6587F));

		PartDefinition cube_r325 = leftFrill.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(68, 94).addBox(-0.3004F, -1.4192F, -0.4791F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7073F, 2.183F, -0.4813F, -0.2312F, 0.2421F, 1.501F));

		PartDefinition cube_r326 = leftFrill.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(71, 108).addBox(-0.4757F, 1.6056F, -0.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6078F, 1.3133F, -0.9244F, 0.5452F, 0.0338F, 2.0143F));

		PartDefinition cube_r327 = leftFrill.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 95).addBox(-1.5579F, -0.411F, -0.2848F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6078F, 1.3133F, -0.9244F, 0.3258F, 0.4465F, 1.1632F));

		PartDefinition cube_r328 = leftFrill.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(61, 103).addBox(-0.8F, -2.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5164F, 0.348F, -0.3707F, -0.3294F, 0.0298F, 0.4394F));

		PartDefinition cube_r329 = leftFrill.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(28, 97).addBox(-1.0F, -1.0F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.522F, 0.3328F, -0.418F, -0.2739F, 0.238F, 1.0266F));

		PartDefinition cube_r330 = leftFrill.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(14, 97).addBox(-1.5763F, -1.4017F, -0.4468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7073F, 2.183F, -0.4813F, -0.2475F, 0.0276F, 1.0412F));

		PartDefinition cube_r331 = leftFrill.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(96, 49).addBox(-2.7527F, -0.9037F, -0.5873F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2737F, -4.8886F, 1.3715F, -0.4027F, 0.3312F, -1.0772F));

		PartDefinition cube_r332 = leftFrill.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(25, 105).addBox(-0.1739F, -2.7028F, -0.5172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1629F, -6.2919F, 1.6412F, 0.1501F, 0.5506F, 0.0293F));

		PartDefinition cube_r333 = leftFrill.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(34, 101).addBox(0.006F, -1.6667F, -0.5172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1629F, -6.2919F, 1.6412F, 0.1073F, 0.3801F, -0.1459F));

		PartDefinition cube_r334 = leftFrill.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(24, 101).addBox(-0.2622F, -1.9122F, -0.6094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8426F, -11.1671F, -1.5249F, 0.92F, 0.2031F, 1.1221F));

		PartDefinition cube_r335 = leftFrill.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(19, 101).addBox(-0.487F, -1.8926F, -0.6094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8426F, -11.1671F, -1.5249F, 0.932F, 0.0984F, 1.2017F));

		PartDefinition cube_r336 = leftFrill.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(98, 38).addBox(-0.4582F, -0.5683F, -0.536F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8426F, -11.1671F, -1.5249F, 1.0841F, -0.0561F, 1.1228F));

		PartDefinition cube_r337 = leftFrill.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(97, 72).addBox(-0.4787F, -0.5587F, -0.5474F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8426F, -11.1671F, -1.5249F, 1.0871F, -0.1046F, 1.15F));

		PartDefinition cube_r338 = leftFrill.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(105, 28).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8262F, -10.5661F, 0.3701F, 0.4961F, 0.3936F, 0.7232F));

		PartDefinition cube_r339 = leftFrill.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(105, 46).addBox(-0.0631F, -0.7374F, 0.2444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1629F, -10.7419F, 0.1162F, 0.5626F, 0.2831F, 0.9228F));

		PartDefinition cube_r340 = leftFrill.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(104, 10).addBox(-0.1604F, -1.8494F, -0.9431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1629F, -9.1169F, 1.6412F, 0.3534F, 0.4179F, 0.5985F));

		PartDefinition cube_r341 = leftFrill.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(105, 25).addBox(-0.4232F, -2.7728F, -0.5081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1629F, -6.2919F, 1.6412F, 0.1823F, 0.5069F, 0.0783F));

		PartDefinition cube_r342 = leftFrill.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(103, 52).addBox(-0.3221F, -1.7825F, -0.5172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1629F, -6.2919F, 1.6412F, 0.1579F, 0.3628F, -0.0067F));

		PartDefinition cube_r343 = leftFrill.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(43, 108).addBox(0.2343F, -1.2679F, -0.5497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2737F, -4.8886F, 1.3715F, -0.2955F, 0.0517F, -0.564F));

		PartDefinition cube_r344 = leftFrill.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(108, 85).addBox(-0.1853F, -0.9472F, -0.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2737F, -4.8886F, 1.3715F, -0.3232F, -0.0859F, -1.0987F));

		PartDefinition cube_r345 = leftFrill.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(42, 99).addBox(-1.1F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1866F, -2.6225F, 0.4034F, -0.09F, 0.2915F, 0.9771F));

		PartDefinition cube_r346 = leftFrill.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(99, 91).addBox(-0.2885F, -1.4115F, -0.6471F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2737F, -4.8886F, 1.3715F, 0.0182F, 0.3041F, 1.3422F));

		PartDefinition cube_r347 = leftFrill.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(90, 63).addBox(-0.8885F, -1.5115F, -0.6471F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2737F, -4.8886F, 1.3715F, -0.0501F, 0.3006F, 1.1136F));

		PartDefinition cube_r348 = leftFrill.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(10, 109).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.287F, 0.4642F, -0.0304F, -0.2622F, 0.1377F, 1.0761F));

		PartDefinition cube_r349 = leftFrill.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(109, 9).addBox(-1.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(109, 6).addBox(-1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(109, 17).addBox(-0.3F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 31).addBox(0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5968F, -4.5812F, 0.9959F, -0.2919F, 0.2551F, 1.0299F));

		PartDefinition cube_r350 = leftFrill.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(107, 108).addBox(0.5917F, -0.5923F, -0.7016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1253F, -3.549F, 0.8573F, -0.2561F, 0.1489F, 1.1711F));

		PartDefinition cube_r351 = leftFrill.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(102, 108).addBox(1.7548F, -0.9051F, -0.7016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1253F, -3.549F, 0.8573F, -0.227F, 0.1907F, 1.343F));

		PartDefinition cube_r352 = leftFrill.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(91, 19).addBox(-3.8635F, -1.4111F, -0.7068F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0139F, 1.0742F, -0.3176F, -0.227F, 0.1907F, 1.2907F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.017F, -4.8651F, 3.2714F, -0.2277F, 0.8409F, -0.3628F));

		PartDefinition cube_r353 = rightFrill.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(35, 97).mirror().addBox(-0.1904F, -0.6651F, -0.5013F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0139F, 1.0742F, -0.3176F, -0.2736F, 0.0317F, -0.4676F));

		PartDefinition cube_r354 = rightFrill.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(0.0305F, -0.3791F, -0.5013F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0139F, 1.0742F, -0.3176F, -0.1516F, 0.275F, 0.4026F));

		PartDefinition cube_r355 = rightFrill.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(53, 108).mirror().addBox(-0.8721F, -0.7596F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.9757F, 2.1264F, -0.1817F, -0.171F, -0.2509F, -1.8081F));

		PartDefinition cube_r356 = rightFrill.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(99, 83).mirror().addBox(-0.5533F, -0.5796F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9757F, 2.1264F, -0.1817F, -0.297F, -0.059F, -1.0355F));

		PartDefinition cube_r357 = rightFrill.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(108, 60).mirror().addBox(-0.5856F, -0.5551F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.9609F, 3.6849F, -0.5466F, 0.1821F, -0.2806F, -2.9338F));

		PartDefinition cube_r358 = rightFrill.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(108, 52).mirror().addBox(-0.4189F, -0.5616F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9609F, 3.6849F, -0.5466F, -0.2093F, -0.2611F, -1.6587F));

		PartDefinition cube_r359 = rightFrill.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(68, 94).mirror().addBox(-1.6996F, -1.4192F, -0.4791F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7073F, 2.183F, -0.4813F, -0.2312F, -0.2421F, -1.501F));

		PartDefinition cube_r360 = rightFrill.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(71, 108).mirror().addBox(-0.5243F, 1.6056F, -0.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6078F, 1.3133F, -0.9244F, 0.5452F, -0.0338F, -2.0143F));

		PartDefinition cube_r361 = rightFrill.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.4421F, -0.411F, -0.2848F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6078F, 1.3133F, -0.9244F, 0.3258F, -0.4465F, -1.1632F));

		PartDefinition cube_r362 = rightFrill.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(61, 103).mirror().addBox(-0.2F, -2.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5164F, 0.348F, -0.3707F, -0.3294F, -0.0298F, -0.4394F));

		PartDefinition cube_r363 = rightFrill.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(28, 97).mirror().addBox(-1.0F, -1.0F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.522F, 0.3328F, -0.418F, -0.2739F, -0.238F, -1.0266F));

		PartDefinition cube_r364 = rightFrill.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(14, 97).mirror().addBox(-0.4237F, -1.4017F, -0.4468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7073F, 2.183F, -0.4813F, -0.2475F, -0.0276F, -1.0412F));

		PartDefinition cube_r365 = rightFrill.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(96, 49).mirror().addBox(-0.2472F, -0.9037F, -0.5873F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2737F, -4.8886F, 1.3715F, -0.4027F, -0.3312F, 1.0772F));

		PartDefinition cube_r366 = rightFrill.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(25, 105).mirror().addBox(-0.8261F, -2.7028F, -0.5172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1629F, -6.2919F, 1.6412F, 0.1501F, -0.5506F, -0.0293F));

		PartDefinition cube_r367 = rightFrill.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(34, 101).mirror().addBox(-1.006F, -1.6667F, -0.5172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1629F, -6.2919F, 1.6412F, 0.1073F, -0.3801F, 0.1459F));

		PartDefinition cube_r368 = rightFrill.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(24, 101).mirror().addBox(-0.7378F, -1.9122F, -0.6094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8426F, -11.1671F, -1.5249F, 0.92F, -0.2031F, -1.1221F));

		PartDefinition cube_r369 = rightFrill.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(19, 101).mirror().addBox(-0.513F, -1.8926F, -0.6094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8426F, -11.1671F, -1.5249F, 0.932F, -0.0984F, -1.2017F));

		PartDefinition cube_r370 = rightFrill.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(98, 38).mirror().addBox(-0.5418F, -0.5683F, -0.536F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8426F, -11.1671F, -1.5249F, 1.0841F, 0.0561F, -1.1228F));

		PartDefinition cube_r371 = rightFrill.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(97, 72).mirror().addBox(-0.5213F, -0.5587F, -0.5474F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8426F, -11.1671F, -1.5249F, 1.0871F, 0.1046F, -1.15F));

		PartDefinition cube_r372 = rightFrill.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(105, 28).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8262F, -10.5661F, 0.3701F, 0.4961F, -0.3936F, -0.7232F));

		PartDefinition cube_r373 = rightFrill.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(105, 46).mirror().addBox(-0.9369F, -0.7374F, 0.2444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1629F, -10.7419F, 0.1162F, 0.5626F, -0.2831F, -0.9228F));

		PartDefinition cube_r374 = rightFrill.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(104, 10).mirror().addBox(-0.8396F, -1.8494F, -0.9431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1629F, -9.1169F, 1.6412F, 0.3534F, -0.4179F, -0.5985F));

		PartDefinition cube_r375 = rightFrill.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(105, 25).mirror().addBox(-0.5768F, -2.7728F, -0.5081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1629F, -6.2919F, 1.6412F, 0.1823F, -0.5069F, -0.0783F));

		PartDefinition cube_r376 = rightFrill.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(103, 52).mirror().addBox(-0.6779F, -1.7825F, -0.5172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1629F, -6.2919F, 1.6412F, 0.1579F, -0.3628F, 0.0067F));

		PartDefinition cube_r377 = rightFrill.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(43, 108).mirror().addBox(-1.2343F, -1.2679F, -0.5497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2737F, -4.8886F, 1.3715F, -0.2955F, -0.0517F, 0.564F));

		PartDefinition cube_r378 = rightFrill.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(108, 85).mirror().addBox(-0.8147F, -0.9472F, -0.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2737F, -4.8886F, 1.3715F, -0.3232F, 0.0859F, 1.0987F));

		PartDefinition cube_r379 = rightFrill.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(42, 99).mirror().addBox(-0.9F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1866F, -2.6225F, 0.4034F, -0.09F, -0.2915F, -0.9771F));

		PartDefinition cube_r380 = rightFrill.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(99, 91).mirror().addBox(-1.7115F, -1.4115F, -0.6471F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2737F, -4.8886F, 1.3715F, 0.0182F, -0.3041F, -1.3422F));

		PartDefinition cube_r381 = rightFrill.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(90, 63).mirror().addBox(-3.1115F, -1.5115F, -0.6471F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.2737F, -4.8886F, 1.3715F, -0.0501F, -0.3006F, -1.1136F));

		PartDefinition cube_r382 = rightFrill.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(10, 109).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.287F, 0.4642F, -0.0304F, -0.2622F, -0.1377F, -1.0761F));

		PartDefinition cube_r383 = rightFrill.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(109, 9).mirror().addBox(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(109, 6).mirror().addBox(0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(109, 17).mirror().addBox(-0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 31).mirror().addBox(-1.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5968F, -4.5812F, 0.9959F, -0.2919F, -0.2551F, -1.0299F));

		PartDefinition cube_r384 = rightFrill.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(107, 108).mirror().addBox(-1.5917F, -0.5923F, -0.7016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1253F, -3.549F, 0.8573F, -0.2561F, -0.1489F, -1.1711F));

		PartDefinition cube_r385 = rightFrill.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(102, 108).mirror().addBox(-2.7548F, -0.9051F, -0.7016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1253F, -3.549F, 0.8573F, -0.227F, -0.1907F, -1.343F));

		PartDefinition cube_r386 = rightFrill.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-0.1365F, -1.4111F, -0.7068F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0139F, 1.0742F, -0.3176F, -0.227F, -0.1907F, -1.2907F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 3.3586F, 0.2214F, 0.2734F, 0.0F, 0.0F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(45, 102).mirror().addBox(-0.4845F, 0.8655F, -1.5867F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9165F, 1.3547F, -0.8973F, -0.8052F, -0.131F, -0.052F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(49, 60).mirror().addBox(-0.6845F, 3.6416F, 0.2243F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9165F, 1.3547F, -0.8973F, -1.0844F, -0.131F, -0.052F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-0.7748F, -2.8768F, -0.3253F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9165F, 1.3547F, -0.8973F, -0.933F, -0.1847F, -0.0513F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(56, 89).mirror().addBox(-0.7168F, 0.3173F, -1.0622F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9165F, 1.3547F, -0.8973F, -0.7726F, -0.1277F, -0.1116F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(73, 100).mirror().addBox(-0.7168F, -2.158F, -0.9867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9165F, 1.3547F, -0.8973F, 0.7459F, -0.1277F, -0.1116F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(56, 100).mirror().addBox(-0.7168F, -2.1454F, 0.1549F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9165F, 1.3547F, -0.8973F, 1.1124F, -0.1277F, -0.1116F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(45, 102).addBox(0.4845F, 0.8655F, -1.5867F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, -0.8052F, 0.131F, 0.052F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(49, 60).addBox(-0.3155F, 3.6416F, 0.2243F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, -1.0844F, 0.131F, 0.052F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(35, 76).addBox(-0.2252F, -2.8768F, -0.3253F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, -0.933F, 0.1847F, 0.0513F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(56, 89).addBox(-0.2832F, 0.3173F, -1.0622F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, -0.7726F, 0.1277F, 0.1116F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(73, 100).addBox(-0.2832F, -2.158F, -0.9867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, 0.7459F, 0.1277F, 0.1116F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(56, 100).addBox(-0.2832F, -2.1454F, 0.1549F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, 1.1124F, 0.1277F, 0.1116F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 5.0745F, -4.9065F, 0.3713F, 0.2075F, 0.0882F));

		PartDefinition cube_r399 = leftLowerbeak.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(66, 104).addBox(-0.5111F, -1.9611F, -0.3529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2942F, -0.8023F, -3.9776F, -2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r400 = leftLowerbeak.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(50, 18).addBox(-0.5F, -0.8648F, -0.2276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3053F, -0.4386F, -1.0756F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r401 = leftLowerbeak.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(101, 64).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3053F, -0.0386F, -2.2756F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r402 = leftLowerbeak.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(29, 101).addBox(-0.5111F, -1.8234F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2942F, -0.8023F, -3.9776F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r403 = leftLowerbeak.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(86, 103).addBox(-0.5111F, -1.3402F, -2.883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2942F, 2.4977F, -2.9776F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r404 = leftLowerbeak.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(100, 99).addBox(-1.0F, -1.8951F, -0.4059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, 0.4214F, -1.1682F, -1.4641F, -0.0529F, -0.0456F));

		PartDefinition leftLowerbeak2 = jaw.addOrReplaceChild("leftLowerbeak2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 5.0745F, -4.9065F, 0.3713F, -0.2075F, -0.0882F));

		PartDefinition cube_r405 = leftLowerbeak2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(66, 104).mirror().addBox(-0.4889F, -1.9611F, -0.3529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2942F, -0.8023F, -3.9776F, -2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r406 = leftLowerbeak2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-0.5F, -0.8648F, -0.2276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3053F, -0.4386F, -1.0756F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r407 = leftLowerbeak2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(101, 64).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3053F, -0.0386F, -2.2756F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r408 = leftLowerbeak2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(29, 101).mirror().addBox(-0.4889F, -1.8234F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.2942F, -0.8023F, -3.9776F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r409 = leftLowerbeak2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(86, 103).mirror().addBox(-0.4889F, -1.3402F, -2.883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2942F, 2.4977F, -2.9776F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r410 = leftLowerbeak2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(100, 99).mirror().addBox(0.0F, -1.8951F, -0.4059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, 0.4214F, -1.1682F, -1.4641F, 0.0529F, 0.0456F));

		PartDefinition leftLowerbeak3 = jaw.addOrReplaceChild("leftLowerbeak3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, 4.9745F, -4.9065F, 0.366F, -0.1261F, -0.0563F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 7.6745F, -5.4065F, 0.0533F, -0.2018F, -0.2671F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(23, 41).addBox(-1.0F, -0.1961F, 0.0069F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.3611F, 6.9741F, -0.2715F, -0.0841F, 0.0234F));

		PartDefinition cube_r411 = tail.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(110, 25).addBox(0.0F, -2.7783F, -0.3185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7301F, 6.0938F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r412 = tail.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(94, 105).addBox(0.0F, -1.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3972F, 7.4283F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r413 = tail.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(59, 96).addBox(0.0F, -2.5271F, 0.8135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5035F, 4.8703F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r414 = tail.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(91, 105).addBox(0.0F, -2.2473F, -0.0968F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.2394F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r415 = tail.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(35, 105).addBox(0.0F, -4.582F, 1.192F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 77).addBox(0.0F, -4.082F, -0.808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r416 = tail.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(42, 41).mirror().addBox(-3.0F, -1.7319F, -0.4176F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5357F, 0.4245F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r417 = tail.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(42, 41).addBox(1.0F, -1.7319F, -0.4176F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5357F, 0.4245F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(29, 11).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9695F, 7.0283F, -0.0964F, -0.0869F, 0.0084F));

		PartDefinition cube_r418 = tail2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(67, 14).addBox(0.0F, -3.4544F, 5.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 110).addBox(0.0F, -3.3544F, 3.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 110).addBox(0.0F, -3.2544F, 1.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 109).addBox(0.0F, -3.2544F, -0.7492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r419 = tail2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(110, 47).addBox(0.0F, 3.7024F, 8.8767F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 109).addBox(0.0F, 1.7024F, 6.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 110).addBox(0.0F, 0.6024F, 4.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5469F, -2.2129F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r420 = tail2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-2.4F, -1.7487F, 0.5501F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5791F, 0.3414F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r421 = tail2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(0, 44).addBox(0.4F, -1.7487F, 0.5501F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5791F, 0.3414F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(34, 60).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8721F, 7.671F, 0.0616F, -0.1307F, -0.008F));

		PartDefinition cube_r422 = tail3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(33, 110).addBox(0.0F, 6.3423F, 14.1451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 110).addBox(0.0F, 5.144F, 12.3552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4559F, -11.8198F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r423 = tail3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(87, 110).addBox(0.0F, -2.7976F, 1.1233F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 110).addBox(0.0F, -2.4976F, -0.8767F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6881F, 1.6345F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(23, 28).addBox(-0.5F, -0.2532F, -0.1914F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0451F, 5.842F, 0.3853F, -0.0809F, -0.0328F));

		PartDefinition cube_r424 = tail4.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(15, 58).addBox(0.0F, -1.7407F, -1.4848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5011F, 3.0578F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r425 = tail4.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(84, 110).addBox(0.0F, 8.1206F, 15.884F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 44).addBox(0.0F, 10.3574F, 19.2002F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 81).addBox(0.0F, 9.239F, 17.5421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.501F, -17.6618F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r426 = tail4.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(61, 110).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4558F, 0.2694F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 115, 115);
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