package fossils.fossils.client.blockentity.model.stellasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StellasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
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

	public StellasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.5695F, -4.9874F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -23.1311F, 5.5546F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 114).addBox(0.0F, -2.2889F, -0.1442F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4574F, 5.146F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -1.5F, -7.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3574F, 3.046F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 94).mirror().addBox(0.1168F, -0.044F, -2.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8F, -4.9581F, -2.3218F, 0.3874F, -0.1223F, -0.0469F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 94).mirror().addBox(-0.0482F, 0.0207F, -2.9627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6923F, -4.9154F, 0.286F, -0.0015F, -0.3547F, -0.0207F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 105).mirror().addBox(-0.1F, -0.028F, 0.1866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -4.143F, 5.8942F, -0.3348F, 0.4149F, -0.1393F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 82).mirror().addBox(0.0F, -0.3254F, 0.048F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.9F, -4.0F, 3.2F, -0.0766F, 0.3024F, -0.0401F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 107).mirror().addBox(-0.2F, -2.0F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 70).mirror().addBox(-0.2F, -2.0F, -2.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4116F, -1.6675F, 0.1841F, -0.3276F, 0.0404F, -0.1367F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(73, 65).mirror().addBox(-2.2499F, -0.0258F, 0.0456F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -4.9154F, 0.386F, -0.2198F, -0.0526F, -0.01F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.1121F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 7).mirror().addBox(-1.1121F, -0.0296F, -0.1578F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -4.9154F, -2.414F, -0.0014F, -0.0492F, -0.0211F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 63).mirror().addBox(-0.0344F, 0.0344F, -4.9635F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -4.9581F, -2.5218F, 0.401F, 0.2815F, 0.1201F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(47, 92).mirror().addBox(-4.0F, -0.2383F, -0.9482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(47, 92).addBox(3.0F, -0.2383F, -0.9482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -4.0F, 4.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 105).mirror().addBox(-0.0619F, 5.3269F, 3.2994F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.375F, -1.0752F, 2.0219F, 0.3803F, 0.1756F, -0.2168F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(90, 93).mirror().addBox(-0.0619F, -1.3916F, 3.6259F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.375F, -1.0752F, 2.0219F, -0.7106F, 0.1756F, -0.2168F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.089F, -0.7448F, 0.8694F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.375F, -1.0752F, 2.0219F, -0.536F, 0.1756F, -0.2168F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(102, 55).mirror().addBox(-0.0822F, -1.1448F, -0.4258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.375F, -1.0752F, 2.0219F, -0.7703F, 0.1697F, -0.183F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(90, 104).mirror().addBox(-0.0822F, -0.223F, -0.2716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.375F, -1.0752F, 2.0219F, -0.2118F, 0.1697F, -0.183F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(11, 79).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0761F, -0.7666F, -0.2486F, -0.1314F, 0.0865F, -0.0114F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(81, 93).mirror().addBox(-0.6F, -0.908F, -3.0168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, -2.4358F, -0.7347F, 0.7683F, 0.0505F, 0.014F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(23, 104).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4662F, 0.1878F, -4.2928F, 0.5938F, 0.0505F, 0.014F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(95, 109).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4733F, -0.4542F, -4.6105F, 1.641F, 0.0505F, 0.014F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(71, 102).mirror().addBox(-0.6F, -0.0675F, -7.3923F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1F, -2.7358F, 0.1653F, 0.332F, 0.0505F, 0.014F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(77, 70).mirror().addBox(-0.6F, 0.4325F, -4.0923F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1F, -2.4358F, -0.7347F, 0.332F, 0.0505F, 0.014F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-1.0F, 0.0F, -5.0F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.7418F, 0.9796F, -3.0718F, 0.0F, -3.1416F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(-0.5F, -0.8794F, -0.2632F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(94, 12).addBox(6.5F, -0.8794F, -0.2632F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.5F, -3.6581F, -3.2218F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(34, 103).mirror().addBox(-0.5F, 0.1223F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 103).addBox(6.5F, 0.1223F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -4.143F, 6.3942F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-0.5F, -0.4157F, -3.2006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(30, 50).addBox(6.5F, -0.4157F, -3.2006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, -3.0439F, 4.9247F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 49).addBox(-0.8879F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(85, 7).addBox(-0.8879F, -0.0296F, -0.1578F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -4.9154F, -2.414F, -0.0014F, 0.0492F, 0.0211F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(73, 65).addBox(-0.7501F, -0.0258F, 0.0456F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -4.9154F, 0.386F, -0.2198F, 0.0526F, 0.01F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(9, 94).addBox(-0.9518F, 0.0207F, -2.9627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6923F, -4.9154F, 0.286F, -0.0015F, 0.3547F, 0.0207F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(29, 94).addBox(-1.1168F, -0.044F, -2.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, -4.9581F, -2.3218F, 0.3874F, 0.1223F, 0.0469F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(60, 63).addBox(-0.9656F, 0.0344F, -4.9635F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -4.9581F, -2.5218F, 0.401F, -0.2815F, -0.1201F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(22, 82).addBox(-2.0F, -0.3254F, 0.048F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.9F, -4.0F, 3.2F, -0.0766F, -0.3024F, 0.0401F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(41, 105).addBox(-0.9381F, 5.3269F, 3.2994F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.375F, -1.0752F, 2.0219F, 0.3803F, -0.1756F, 0.2168F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(90, 93).addBox(-0.9381F, -1.3916F, 3.6259F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.375F, -1.0752F, 2.0219F, -0.7106F, -0.1756F, 0.2168F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 95).addBox(-0.911F, -0.7448F, 0.8694F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.375F, -1.0752F, 2.0219F, -0.536F, -0.1756F, 0.2168F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(102, 55).addBox(-0.9178F, -1.1448F, -0.4258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.375F, -1.0752F, 2.0219F, -0.7703F, -0.1697F, 0.183F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(90, 104).addBox(-0.9178F, -0.223F, -0.2716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.375F, -1.0752F, 2.0219F, -0.2118F, -0.1697F, 0.183F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(11, 79).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0761F, -0.7666F, -0.2486F, -0.1314F, -0.0865F, 0.0114F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(81, 93).addBox(-0.4F, -0.908F, -3.0168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, -2.4358F, -0.7347F, 0.7683F, -0.0505F, -0.014F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(23, 104).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.4662F, 0.1878F, -4.2928F, 0.5938F, -0.0505F, -0.014F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(95, 109).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4733F, -0.4542F, -4.6105F, 1.641F, -0.0505F, -0.014F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(71, 102).addBox(-0.4F, -0.0675F, -7.3923F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.1F, -2.7358F, 0.1653F, 0.332F, -0.0505F, -0.014F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(77, 70).addBox(-0.4F, 0.4325F, -4.0923F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.1F, -2.4358F, -0.7347F, 0.332F, -0.0505F, -0.014F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(30, 107).addBox(-0.8F, -2.0F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(-0.8F, -2.0F, -2.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4116F, -1.6675F, 0.1841F, -0.3276F, -0.0404F, 0.1367F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.7418F, 0.9796F, -3.0718F, 0.0F, 3.1416F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(14, 105).addBox(-0.9F, -0.028F, 0.1866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -4.143F, 5.8942F, -0.3348F, -0.4149F, 0.1393F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(25, 15).addBox(-1.0F, -0.1961F, 0.0069F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.004F))
				.texOffs(113, 43).addBox(1.0F, 0.8039F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 113).addBox(1.0F, 0.8039F, 0.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 50).addBox(0.8F, 0.8039F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 65).addBox(0.6F, 0.8039F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 106).addBox(0.5F, 0.8039F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 43).mirror().addBox(-3.0F, 0.8039F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 50).mirror().addBox(-2.8F, 0.8039F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 65).mirror().addBox(-2.6F, 0.8039F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 106).mirror().addBox(-2.5F, 0.8039F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 113).mirror().addBox(-3.0F, 0.8039F, 0.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.4075F, 6.9014F, -0.5121F, 0.2295F, -0.1272F));

		PartDefinition cube_r47 = tail.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(34, 99).addBox(0.0F, -1.4827F, 0.0039F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1699F, 7.9938F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(82, 61).addBox(0.0F, -2.5783F, -0.4185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7301F, 6.0938F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(33, 75).addBox(0.0F, -0.2646F, -0.0732F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7972F, 8.3283F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(49, 117).addBox(0.0F, 0.1275F, -0.0597F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8972F, 6.1283F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(56, 92).addBox(0.0F, -1.7473F, -0.0968F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.2394F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r52 = tail.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(38, 117).addBox(0.0F, -4.082F, 1.192F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(6, 115).addBox(0.0F, -3.482F, -0.808F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 37).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(112, 19).addBox(0.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 112).addBox(0.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 54).addBox(1.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 19).mirror().addBox(-2.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 112).mirror().addBox(-2.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 54).mirror().addBox(-2.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9361F, 8.8961F, 0.1418F, 0.1728F, 0.0245F));

		PartDefinition cube_r54 = tail2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(52, 117).addBox(0.0F, -3.1544F, 3.2508F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 117).addBox(0.0F, -3.0544F, 1.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(30, 46).addBox(0.0F, 1.4024F, 6.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5469F, -2.2129F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(117, 10).addBox(0.0F, -0.5424F, -0.0864F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8469F, 1.9871F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(23, 100).addBox(0.0F, -1.3547F, 0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(60, 56).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8069F, 5.5986F, 0.1463F, 0.3024F, 0.0439F));

		PartDefinition cube_r58 = tail3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(118, 23).addBox(0.0F, 6.9424F, 13.8451F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 117).addBox(0.0F, 4.944F, 11.8552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4559F, -11.8198F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(118, 37).addBox(0.0F, -2.6976F, 1.1233F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 117).addBox(0.0F, -2.3976F, -0.8767F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6881F, 1.6345F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(53, 24).addBox(-0.5F, -0.2532F, -0.1914F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0255F, 4.983F, 0.2494F, 0.4244F, 0.1045F));

		PartDefinition cube_r60 = tail4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(30, 104).addBox(0.0F, -1.9407F, -1.4849F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5011F, 3.0578F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(84, 117).addBox(0.0F, -2.182F, -1.408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8011F, 5.0578F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r62 = tail4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(60, 85).addBox(0.0F, 8.5206F, 16.384F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 117).addBox(0.0F, 10.7574F, 19.7002F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 117).addBox(0.0F, 9.639F, 18.0421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.501F, -17.6618F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(118, 31).addBox(0.0F, -0.4F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4558F, 0.2694F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(53, 32).addBox(-0.5F, -0.2532F, -0.1914F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0463F, 5.9395F, -0.128F, -0.3031F, 0.0384F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(15, 55).addBox(-1.5F, 9.0833F, -4.9553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -2.371F, -0.0261F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftleg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 83).addBox(0.5F, -0.3379F, -2.3535F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, 7.9705F, -1.4817F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftleg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(64, 77).addBox(0.5F, -4.3871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftleg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(15, 62).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftleg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(68, 34).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.3596F, -3.452F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftleg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(99, 38).addBox(-0.1F, -1.465F, -0.8998F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(60, 88).addBox(-0.1F, -0.465F, -0.3998F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.3988F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftleg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(104, 63).addBox(-1.5F, 0.0551F, 0.0019F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1F, -1.2993F, 2.0313F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftleg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(77, 28).addBox(-1.5F, -1.9773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftleg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 92).addBox(-1.601F, 4.3011F, 0.5208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftleg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(105, 4).addBox(-1.0F, -1.6F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.6F, 1.5422F, 2.3207F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftleg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(28, 65).addBox(-1.5F, -5.8767F, 0.2508F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftleg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 106).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 2.4093F, 1.5559F, 0.637F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4869F, 4.6603F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftleg3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(86, 76).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(97, 75).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftfoot.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(97, 83).addBox(-1.0F, -2.1328F, 1.6482F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(34, 27).addBox(-1.999F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, 0.2443F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, 9.0833F, -4.9553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9F, -2.371F, -0.0261F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightleg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(75, 83).addBox(-3.5F, -0.3379F, -2.3535F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, 7.9705F, -1.4817F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightleg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 78).addBox(-3.5F, -4.3871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightleg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(63, 14).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightleg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(46, 69).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.3596F, -3.452F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightleg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(99, 47).addBox(-0.9F, -1.465F, -0.8998F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(76, 88).addBox(-0.9F, -0.465F, -0.3998F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.3988F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightleg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(83, 104).addBox(-0.5F, 0.0551F, 0.0019F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1F, -1.2993F, 2.0313F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightleg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(77, 34).addBox(-0.5F, -1.9773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightleg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(93, 54).addBox(-0.399F, 4.3011F, 0.5208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(7, 105).addBox(-1.0F, -1.6F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6F, 1.5422F, 2.3207F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(68, 24).addBox(-0.5F, -5.8767F, 0.2508F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightleg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(51, 106).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 2.4093F, 1.5559F, 0.637F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4869F, 4.6603F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightleg3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(86, 81).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(97, 79).addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3596F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightfoot.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(102, 52).addBox(-2.0F, -2.1328F, 1.6482F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(34, 34).addBox(-2.001F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9194F, -4.923F, 0.2768F, -0.2101F, -0.0592F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(3, 115).addBox(0.0F, -2.6553F, -0.0678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5816F, -0.7961F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 115).addBox(0.0F, -3.0449F, -0.1105F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5816F, -2.5961F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(51, 79).addBox(0.0F, -3.281F, -0.1776F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6816F, -4.6961F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(26, 108).addBox(0.0F, -3.797F, -0.0834F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5184F, -10.5961F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(91, 112).addBox(0.0F, -3.8881F, 0.0608F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1184F, -8.7961F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(81, 112).addBox(0.0F, -3.5671F, -0.1071F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2816F, -6.7961F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(40, 111).mirror().addBox(-2.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, -0.0443F, -0.0415F, -0.3113F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(68, 110).mirror().addBox(-4.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, -0.0577F, -0.0615F, -0.8562F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(97, 36).mirror().addBox(-10.3996F, -3.7378F, -2.5366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, -0.0202F, 0.3193F, -1.3887F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(96, 9).mirror().addBox(-6.8101F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, -0.0192F, 0.075F, -1.3838F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(86, 48).mirror().addBox(-11.62F, -3.719F, -1.8427F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7816F, -8.4961F, 0.0144F, 0.3162F, -1.3775F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(93, 59).mirror().addBox(-6.8095F, -3.7401F, -0.7907F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7816F, -8.4961F, 0.0138F, 0.1591F, -1.3797F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(112, 108).mirror().addBox(-4.3404F, -1.8128F, -0.553F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7816F, -8.4961F, 0.0566F, 0.0705F, -0.8557F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(110, 17).mirror().addBox(-2.9414F, -0.3387F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7816F, -8.4961F, 0.1218F, 0.0123F, -0.3137F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(29, 9).mirror().addBox(-12.8804F, -3.7351F, -0.4699F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.6961F, 0.2274F, 0.2396F, -1.285F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(110, 15).mirror().addBox(-4.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.6961F, 0.315F, 0.0962F, -0.7736F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(110, 13).mirror().addBox(-2.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.6961F, 0.3573F, -0.0954F, -0.2631F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(87, 5).mirror().addBox(-5.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.0689F, -0.1038F, -1.387F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(84, 112).mirror().addBox(-6.133F, -3.7878F, -3.7682F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.0644F, 0.4007F, -1.416F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(105, 109).mirror().addBox(-4.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.3412F, -0.365F, -0.7952F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(109, 88).mirror().addBox(-2.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.5245F, -0.1835F, -0.2562F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(90, 25).mirror().addBox(-9.1153F, -3.7578F, -2.4801F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0557F, 0.2F, -1.4005F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(103, 19).mirror().addBox(-5.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0546F, -0.0266F, -1.3879F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(106, 100).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.1858F, -0.2056F, -0.8391F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(56, 106).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.4563F, -2.4056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(104, 106).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -0.7563F, -4.4056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(97, 106).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -0.9109F, -6.6715F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -0.5109F, -8.4714F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(106, 94).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, 0.3731F, -10.2594F, 0.429F, -0.1843F, 0.5459F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(110, 11).mirror().addBox(-2.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.3119F, -0.1245F, -0.289F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(40, 111).addBox(0.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, -0.0443F, 0.0415F, 0.3113F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(68, 110).addBox(2.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, -0.0577F, 0.0615F, 0.8562F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(97, 36).addBox(6.3996F, -3.7378F, -2.5366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, -0.0202F, -0.3193F, 1.3887F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 9).addBox(2.81F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, -0.0192F, -0.075F, 1.3838F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(86, 48).addBox(6.62F, -3.719F, -1.8427F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7816F, -8.4961F, 0.0144F, -0.3162F, 1.3775F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(93, 59).addBox(2.8095F, -3.7401F, -0.7907F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7816F, -8.4961F, 0.0138F, -0.1591F, 1.3797F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(112, 108).addBox(2.3405F, -1.8128F, -0.553F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7816F, -8.4961F, 0.0566F, -0.0705F, 0.8557F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(110, 17).addBox(0.9414F, -0.3387F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7816F, -8.4961F, 0.1218F, -0.0123F, 0.3137F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(29, 9).addBox(2.8804F, -3.7351F, -0.4699F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.6961F, 0.0512F, -0.2777F, 1.3738F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(110, 15).addBox(2.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.6961F, 0.185F, -0.2145F, 0.8374F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(110, 13).addBox(0.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.6961F, 0.3047F, -0.071F, 0.3061F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(87, 5).addBox(2.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.0689F, 0.1038F, 1.387F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(84, 112).addBox(4.133F, -3.7878F, -3.7682F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.0644F, -0.4007F, 1.416F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(105, 109).addBox(2.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.3412F, 0.365F, 0.7952F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(109, 88).addBox(0.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.5245F, 0.1835F, 0.2562F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(90, 25).addBox(5.1153F, -3.7578F, -2.4801F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0557F, -0.2F, 1.4005F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(103, 19).addBox(2.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0546F, 0.0266F, 1.3879F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(106, 100).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.1858F, 0.2056F, 0.8391F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(56, 106).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.4563F, -2.4056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(104, 106).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -0.7563F, -4.4056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(97, 106).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -0.9109F, -6.6715F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(107, 0).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -0.5109F, -8.4714F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(106, 94).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3851F, 0.3731F, -10.2594F, 0.429F, 0.1843F, -0.5459F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(110, 11).addBox(0.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.3119F, 0.1245F, 0.289F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(46, 0).addBox(-1.0F, -0.0745F, -5.9424F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5816F, -5.8961F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(34, 41).addBox(-1.0F, -1.3073F, -7.6534F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7184F, 1.8039F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0489F, -11.3553F, -0.2214F, -0.1704F, 0.0381F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(61, 111).addBox(0.0F, -3.698F, -0.0615F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2902F, -3.0125F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(111, 59).addBox(0.0F, -3.6053F, -0.0015F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8099F, -1.2125F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(9, 115).addBox(0.0F, -2.7858F, -0.1109F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1901F, -4.7125F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(84, 114).mirror().addBox(0.9737F, 0.6114F, 2.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(45, 58).mirror().addBox(-0.0263F, 0.6114F, -2.4179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(84, 114).addBox(2.3737F, 0.6114F, 2.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(45, 58).addBox(2.3737F, 0.6114F, -2.4179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 8.7191F, 1.7543F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.0263F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 64).addBox(2.3737F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1737F, 10.1191F, -0.9457F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(97, 61).mirror().addBox(-0.6097F, -3.2071F, -1.7393F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.3453F, 6.3847F, 0.4906F, 0.611F, -0.0998F, -0.5149F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(112, 3).mirror().addBox(1.7973F, 0.7157F, 0.1697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 86).mirror().addBox(1.7973F, -2.2843F, 0.1697F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 7.7366F, -2.6353F, 1.3964F, -0.0998F, -0.5149F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(75, 77).mirror().addBox(-0.6617F, -1.0306F, -1.0033F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.1922F, -0.1845F, 2.4715F, 0.6175F, -0.0434F, 0.0954F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(48, 13).mirror().addBox(-0.5F, -1.4F, -4.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.3955F, 0.9169F, 0.9888F, 0.8793F, -0.0434F, 0.0954F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(113, 29).mirror().addBox(-2.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1994F, -4.1208F, 0.7019F, 0.1863F, -0.2893F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(113, 27).mirror().addBox(-4.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1994F, -4.1208F, 0.4948F, 0.5062F, -0.7612F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(29, 13).mirror().addBox(-8.9613F, -3.7227F, -0.5728F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1994F, -4.1208F, 0.1512F, 0.6784F, -1.3618F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(111, 52).mirror().addBox(-2.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5099F, -2.9125F, 0.5909F, 0.1564F, -0.2734F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(-11.77F, -3.756F, -0.5341F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5099F, -2.9125F, 0.1191F, 0.568F, -1.3457F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(111, 47).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5099F, -2.9125F, 0.4019F, 0.4288F, -0.7682F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(47, 111).mirror().addBox(-1.8999F, 0.0077F, -0.595F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.9099F, -1.2125F, 0.523F, 0.1372F, -0.2833F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(29, 11).mirror().addBox(-12.6566F, -2.6574F, -0.6303F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.9099F, -1.2125F, 0.1014F, 0.4999F, -1.3547F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(111, 45).mirror().addBox(-3.6294F, -0.9731F, -0.6303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.9099F, -1.2125F, 0.3478F, 0.3797F, -0.7895F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(76, 7).mirror().addBox(1.7312F, -2.2843F, -3.4866F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 7.7366F, -2.6353F, 1.4408F, -0.1533F, -0.8627F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(66, 70).mirror().addBox(-0.5F, -1.0F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1922F, -1.8845F, 2.4715F, 0.9666F, -0.0434F, 0.0954F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(55, 70).mirror().addBox(0.037F, -0.3273F, -0.0083F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.8366F, -3.9353F, 0.6612F, -0.0434F, 0.0954F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(30, 58).mirror().addBox(-0.4503F, -0.0036F, -1.8659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 9.7166F, 3.9759F, 1.2222F, -1.1983F, -0.9272F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(60, 49).mirror().addBox(0.0912F, -0.2503F, -0.4112F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4493F, 10.4054F, 4.0293F, 0.8846F, -1.2568F, -0.4591F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.6822F, -0.1832F, -0.0535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 9.7971F, 2.7597F, 1.1564F, -1.1775F, -0.8326F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(106, 97).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4776F, -2.8175F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(106, 91).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4776F, -2.9175F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(113, 29).addBox(0.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1994F, -4.1208F, 0.7019F, -0.1863F, 0.2893F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(113, 27).addBox(2.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1994F, -4.1208F, 0.4948F, -0.5062F, 0.7612F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(29, 13).addBox(2.9613F, -3.7227F, -0.5728F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1994F, -4.1208F, 0.1512F, -0.6784F, 1.3618F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(111, 52).addBox(0.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5099F, -2.9125F, 0.5909F, -0.1564F, 0.2734F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(48, 22).addBox(2.77F, -3.756F, -0.5341F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5099F, -2.9125F, 0.1191F, -0.568F, 1.3457F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(111, 47).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5099F, -2.9125F, 0.4019F, -0.4288F, 0.7682F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(47, 111).addBox(-0.1001F, 0.0077F, -0.595F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.9099F, -1.2125F, 0.523F, -0.1372F, 0.2833F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(29, 11).addBox(2.6566F, -2.6574F, -0.6303F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.9099F, -1.2125F, 0.1014F, -0.4999F, 1.3547F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(111, 45).addBox(1.6294F, -0.9731F, -0.6303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.9099F, -1.2125F, 0.3478F, -0.3797F, 0.7895F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(76, 7).addBox(-2.7312F, -2.2843F, -3.4866F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.0F, 7.7366F, -2.6353F, 1.4408F, 0.1533F, 0.8627F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(97, 61).addBox(-0.3903F, -3.2071F, -1.7393F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.3453F, 6.3847F, 0.4906F, 0.611F, 0.0998F, 0.5149F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(112, 3).addBox(-2.7973F, 0.7157F, 0.1697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 86).addBox(-2.7973F, -2.2843F, 0.1697F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 7.7366F, -2.6353F, 1.3964F, 0.0998F, 0.5149F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(75, 77).addBox(-0.3383F, -1.0306F, -1.0033F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.1922F, -0.1845F, 2.4715F, 0.6175F, 0.0434F, -0.0954F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(66, 70).addBox(-0.5F, -1.0F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1922F, -1.8845F, 2.4715F, 0.9666F, 0.0434F, -0.0954F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(48, 13).addBox(-0.5F, -1.4F, -4.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3955F, 0.9169F, 0.9888F, 0.8793F, 0.0434F, -0.0954F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(55, 70).addBox(-1.037F, -0.3273F, -0.0083F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.0F, 3.8366F, -3.9353F, 0.6612F, 0.0434F, -0.0954F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(30, 58).addBox(-0.5497F, -0.0036F, -1.8659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 9.7166F, 3.9759F, 1.2222F, 1.1983F, 0.9272F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(60, 49).addBox(-1.0912F, -0.2503F, -0.4112F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4493F, 10.4054F, 4.0293F, 0.8846F, 1.2568F, 0.4591F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 84).addBox(-0.3178F, -0.1832F, -0.0535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 9.7971F, 2.7597F, 1.1564F, 1.1775F, 0.8326F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(106, 97).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4776F, -2.8175F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(106, 91).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4776F, -2.9175F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0F, -0.907F, 1.5334F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2902F, -6.6125F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9227F, 6.3821F, -0.9967F, 0.1745F, 0.0F, -0.1745F));

		PartDefinition cube_r194 = leftarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(83, 98).addBox(0.4873F, 0.0838F, -0.8085F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, -0.1753F, -1.413F, 0.3088F, -0.5387F, -0.0885F));

		PartDefinition cube_r195 = leftarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(101, 21).addBox(-0.0423F, -0.2098F, -1.9415F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0289F, 4.3523F, -0.797F, 2.8465F, -0.5672F, -0.0056F));

		PartDefinition cube_r196 = leftarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(99, 92).addBox(-0.4231F, -0.8591F, -0.9762F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0289F, 3.3523F, -0.0969F, 1.712F, -0.5672F, -0.0056F));

		PartDefinition cube_r197 = leftarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(97, 67).addBox(-1.5F, 0.0947F, -1.8851F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 0.4521F, 2.0065F, -0.7276F, -0.0695F, 0.0286F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(88, 70).addBox(-1.5F, -2.737F, -2.5417F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 3.3521F, 1.8065F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(86, 43).addBox(-2.0F, 0.2021F, -1.3021F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 5.4432F, 3.4116F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(33, 79).addBox(-0.9824F, -4.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8211F, 7.4783F, 3.8686F, -1.2243F, -0.5562F, 1.7781F));

		PartDefinition cube_r201 = leftarm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(87, 12).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(13, 69).addBox(0.0067F, -5.4546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4157F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1366F, 6.686F, -2.2697F, 1.1637F, 0.8832F, -1.3116F));

		PartDefinition cube_r202 = lefthand.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(88, 50).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r203 = lefthand.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(75, 51).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r204 = lefthand.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(98, 0).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r205 = lefthand.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(18, 96).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9227F, 6.3821F, -0.9967F, 0.1745F, 0.0F, 0.1745F));

		PartDefinition cube_r206 = rightarm.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(90, 98).addBox(-1.4873F, 0.0838F, -0.8085F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, -0.1753F, -1.413F, 0.3088F, 0.5387F, 0.0885F));

		PartDefinition cube_r207 = rightarm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(64, 101).addBox(-0.9577F, -0.2098F, -1.9415F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0289F, 4.3523F, -0.797F, 2.8465F, 0.5672F, 0.0056F));

		PartDefinition cube_r208 = rightarm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(57, 101).addBox(-0.5769F, -0.8591F, -0.9762F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0289F, 3.3523F, -0.0969F, 1.712F, 0.5672F, 0.0056F));

		PartDefinition cube_r209 = rightarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(97, 71).addBox(-0.5F, 0.0947F, -1.8851F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 0.4521F, 2.0065F, -0.7276F, 0.0695F, -0.0286F));

		PartDefinition cube_r210 = rightarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, -2.737F, -2.5417F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 3.3521F, 1.8065F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(86, 61).addBox(-1.0F, 0.2021F, -1.3021F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 5.4432F, 3.4116F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(42, 79).addBox(-1.0176F, -4.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8211F, 7.4783F, 3.8686F, -0.6779F, 1.1915F, -1.1098F));

		PartDefinition cube_r213 = rightarm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(22, 87).addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 69).addBox(-2.0067F, -5.4546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4157F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1366F, 6.686F, -2.2697F, 1.0463F, -0.6267F, 0.3359F));

		PartDefinition cube_r214 = righthand.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(65, 88).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r215 = righthand.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(77, 23).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r216 = righthand.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(74, 98).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r217 = righthand.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(97, 32).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5901F, -5.0125F, -0.0911F, -0.3942F, -0.1125F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(113, 74).addBox(0.0F, -2.4703F, -0.1461F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(117, 14).addBox(0.0F, -2.1058F, -0.111F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(113, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2156F, -1.4754F, 0.6537F, 0.6766F, -0.64F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(114, 63).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2156F, -1.4754F, 0.0887F, 0.8935F, -1.3598F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.6447F, 0.6713F, -0.6456F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(114, 63).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2156F, -1.4754F, 0.0887F, -0.8935F, 1.3598F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(113, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2156F, -1.4754F, 0.6537F, -0.6766F, 0.64F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 113).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.6447F, -0.6713F, 0.6456F));

		PartDefinition cube_r226 = neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(45, 50).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, -0.2222F, -0.3896F, 0.0952F));

		PartDefinition cube_r227 = neck.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(63, 106).addBox(0.0F, -3.4F, -2.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(63, 0).addBox(-1.0F, -1.4F, -3.7F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r228 = neck.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(7, 113).mirror().addBox(-2.0492F, 0.0172F, -0.57F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -1.7754F, 0.4333F, 0.8983F, -1.0055F));

		PartDefinition cube_r229 = neck.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(7, 113).addBox(0.0492F, 0.0172F, -0.57F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -1.7754F, 0.4333F, -0.8983F, 1.0055F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(17, 27).addBox(-2.5F, -3.6799F, -2.9581F, 5.0F, 6.0F, 3.0F, new CubeDeformation(-0.004F))
				.texOffs(63, 7).addBox(-2.5F, -2.6799F, -3.9581F, 5.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.3821F, -4.1095F, 0.0775F, 0.0289F, -0.3165F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(75, 44).addBox(-1.5F, -4.0345F, 1.1107F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5567F, -3.9625F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -1.45F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.3373F, -8.1386F, -1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -6.067F, 1.2406F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7567F, -9.3625F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(81, 88).mirror().addBox(-0.1109F, 1.4776F, -7.2757F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.9834F, -6.1316F, 0.0175F, 0.0524F, 3.1416F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(105, 111).mirror().addBox(-0.1109F, 1.0943F, -7.9162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.9834F, -6.1316F, 0.1833F, 0.0524F, -3.1416F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(34, 112).mirror().addBox(-0.3642F, -3.5468F, 5.644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(76, 112).mirror().addBox(-0.3642F, -3.5468F, 5.244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.9834F, -6.1316F, 2.834F, 0.0232F, 3.1184F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(71, 112).mirror().addBox(-0.3642F, -3.2669F, 6.2899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.9834F, -6.1316F, 3.0871F, 0.0232F, 3.1184F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(35, 107).mirror().addBox(-0.3642F, -6.0635F, 3.4616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.9834F, -6.1316F, 2.4937F, 0.0232F, 3.1184F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(102, 86).mirror().addBox(-0.0083F, -5.5055F, 2.0684F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.9834F, -6.1316F, 2.1558F, 0.0814F, -3.1183F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(51, 85).mirror().addBox(-1.0185F, -3.3175F, -3.0736F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.9834F, -6.1316F, 1.5711F, -0.0926F, -0.0103F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(16, 100).mirror().addBox(0.0242F, -3.4881F, 2.2169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.9834F, -6.1316F, 2.1994F, 0.0926F, -3.1313F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(50, 101).mirror().addBox(0.0242F, -4.1023F, 0.6971F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.9834F, -6.1316F, 1.8067F, 0.0926F, -3.1313F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(81, 88).addBox(-0.8891F, 1.4776F, -7.2757F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0109F, -0.9834F, -6.1316F, 0.0175F, -0.0524F, -3.1416F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(105, 111).addBox(-0.8891F, 1.0943F, -7.9162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0109F, -0.9834F, -6.1316F, 0.1833F, -0.0524F, 3.1416F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(102, 86).addBox(-0.9917F, -5.5055F, 2.0684F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0109F, -0.9834F, -6.1316F, 2.1558F, -0.0814F, 3.1183F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(50, 101).addBox(-1.0242F, -4.1023F, 0.6971F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0109F, -0.9834F, -6.1316F, 1.8067F, -0.0926F, 3.1313F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(114, 82).addBox(-0.8566F, 0.0359F, -1.0218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3109F, 1.1166F, -10.8316F, 2.0679F, -0.0402F, 3.1314F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(114, 7).addBox(-0.8294F, -0.1059F, -0.9691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3109F, 0.4166F, -11.3316F, 2.4606F, -0.0402F, 3.1314F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(16, 100).addBox(-1.0242F, -3.4881F, 2.2169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0109F, -0.9834F, -6.1316F, 2.1994F, -0.0926F, 3.1313F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(111, 102).addBox(-0.4729F, -1.9546F, -0.0014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1535F, 2.8872F, -8.3045F, 1.012F, 0.0402F, 0.0102F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(35, 107).addBox(-0.6358F, -6.0635F, 3.4616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.0109F, -0.9834F, -6.1316F, 2.4937F, -0.0232F, -3.1184F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(71, 112).addBox(-0.6358F, -3.2669F, 6.2899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0109F, -0.9834F, -6.1316F, 3.0871F, -0.0232F, -3.1184F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(76, 112).addBox(-0.6358F, -3.5468F, 5.244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(34, 112).addBox(-0.6358F, -3.5468F, 5.644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.0109F, -0.9834F, -6.1316F, 2.834F, -0.0232F, -3.1184F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(51, 85).addBox(0.0185F, -3.3175F, -3.0736F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0109F, -0.9834F, -6.1316F, 1.5711F, 0.0926F, 0.0103F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(106, 78).addBox(-1.0F, -0.0607F, 0.0327F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0433F, -10.0625F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(106, 75).addBox(-1.0F, -0.0771F, -0.0182F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.1433F, -9.6625F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(106, 70).addBox(-0.5F, -2.2475F, -0.987F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4433F, -8.7625F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(106, 38).addBox(-0.5F, -0.0874F, -0.222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4103F, -6.9921F, 1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(20, 112).addBox(-0.5F, -2.0586F, -0.1166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.5433F, -6.0625F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(94, 113).addBox(-0.5F, -0.5455F, -0.2301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1433F, -5.7625F, 2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(109, 84).addBox(-0.5F, -1.9865F, -0.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2433F, -7.6625F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(56, 109).addBox(-0.5F, -0.1946F, -1.0247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.9472F, -8.3176F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(106, 81).addBox(-1.0F, -0.0326F, -0.0709F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 67).addBox(-1.0F, 0.3674F, -0.0709F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.1433F, -8.7625F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(29, 87).addBox(-1.0F, -0.0035F, -1.9197F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5567F, -4.9625F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(76, 0).addBox(-2.0F, -7.2F, 0.8F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 40).addBox(-2.5F, -7.2F, 1.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0433F, -2.4625F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(51, 41).addBox(-2.5F, -0.0622F, -0.2502F, 5.0F, 5.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -3.6567F, -2.9625F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.274F, -0.5076F, -0.9054F, -1.3963F, 0.0349F, 0.0F));

		PartDefinition cube_r266 = leftCheek.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(103, 15).addBox(-0.1154F, 0.6465F, -2.6508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.526F, -0.8982F, 2.637F, 0.2579F, 0.6816F, 0.4262F));

		PartDefinition cube_r267 = leftCheek.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(97, 102).addBox(-0.1154F, -0.0535F, -2.1508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.526F, -0.8982F, 2.637F, 0.3888F, 0.6816F, 0.4262F));

		PartDefinition cube_r268 = leftCheek.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(113, 67).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0263F, -0.8398F, 2.6179F, 0.764F, 0.6816F, 0.4262F));

		PartDefinition cube_r269 = leftCheek.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(104, 102).addBox(-0.8737F, -0.9717F, -1.9542F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.326F, -0.2982F, 2.637F, 1.3306F, 0.6867F, 0.4214F));

		PartDefinition cube_r270 = leftCheek.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(99, 27).addBox(-0.8737F, -1.4469F, -3.8576F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.326F, -0.2982F, 2.637F, 1.0513F, 0.6867F, 0.4214F));

		PartDefinition cube_r271 = leftCheek.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 100).addBox(-1.642F, -1.8953F, -1.5305F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.726F, 1.3018F, 0.437F, -0.161F, 0.6816F, 0.4262F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.274F, -0.5076F, -0.9054F, -1.3963F, -0.0349F, 0.0F));

		PartDefinition cube_r272 = rightCheek.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(103, 15).mirror().addBox(-0.8846F, 0.6465F, -2.6508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.526F, -0.8982F, 2.637F, 0.2579F, -0.6816F, -0.4262F));

		PartDefinition cube_r273 = rightCheek.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(97, 102).mirror().addBox(-0.8846F, -0.0535F, -2.1508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.526F, -0.8982F, 2.637F, 0.3888F, -0.6816F, -0.4262F));

		PartDefinition cube_r274 = rightCheek.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(113, 67).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0263F, -0.8398F, 2.6179F, 0.764F, -0.6816F, -0.4262F));

		PartDefinition cube_r275 = rightCheek.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(104, 102).mirror().addBox(-0.1263F, -0.9717F, -1.9542F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.326F, -0.2982F, 2.637F, 1.3306F, -0.6867F, -0.4214F));

		PartDefinition cube_r276 = rightCheek.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(99, 27).mirror().addBox(-0.1263F, -1.4469F, -3.8576F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.326F, -0.2982F, 2.637F, 1.0513F, -0.6867F, -0.4214F));

		PartDefinition cube_r277 = rightCheek.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(0.642F, -1.8953F, -1.5305F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.726F, 1.3018F, 0.437F, -0.161F, -0.6816F, -0.4262F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4296F, 7.0862F, -9.0603F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftBeak.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(29, 112).addBox(-0.2434F, -0.0002F, -1.2978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3874F, -0.8788F, 0.5592F, -1.2603F, 0.0636F, 0.0753F));

		PartDefinition cube_r279 = leftBeak.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(59, 98).addBox(-0.7506F, -0.822F, -1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1525F, -1.3101F, 0.1944F, -2.216F, 0.1224F, -0.0352F));

		PartDefinition cube_r280 = leftBeak.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(113, 49).addBox(-0.7506F, -1.022F, -0.7297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1525F, -1.3101F, 0.1944F, -1.2561F, 0.1224F, -0.0352F));

		PartDefinition cube_r281 = leftBeak.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(56, 113).addBox(-1.3695F, -1.0543F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5704F, -0.7934F, -1.8304F, 0.1971F, 0.0699F, 0.0695F));

		PartDefinition cube_r282 = leftBeak.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(114, 57).addBox(-1.2852F, -1.2706F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5704F, -0.1934F, -0.0304F, 1.061F, 0.0699F, 0.0695F));

		PartDefinition cube_r283 = leftBeak.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(114, 54).addBox(-1.376F, 0.0185F, -0.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5704F, -0.0934F, -1.2304F, 0.8254F, 0.0699F, 0.0695F));

		PartDefinition cube_r284 = leftBeak.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(113, 79).addBox(-1.3697F, 0.3628F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -1.0934F, -2.1304F, 0.6945F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4296F, 7.0862F, -9.0603F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightBeak.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(29, 112).mirror().addBox(-0.7566F, -0.0002F, -1.2978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3874F, -0.8788F, 0.5592F, -1.2603F, -0.0636F, -0.0753F));

		PartDefinition cube_r286 = rightBeak.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(59, 98).mirror().addBox(-0.2494F, -0.822F, -1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1525F, -1.3101F, 0.1944F, -2.216F, -0.1224F, 0.0352F));

		PartDefinition cube_r287 = rightBeak.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(113, 49).mirror().addBox(-0.2494F, -1.022F, -0.7297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1525F, -1.3101F, 0.1944F, -1.2561F, -0.1224F, 0.0352F));

		PartDefinition cube_r288 = rightBeak.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(56, 113).mirror().addBox(0.3695F, -1.0543F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.7934F, -1.8304F, 0.1971F, -0.0699F, -0.0695F));

		PartDefinition cube_r289 = rightBeak.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(114, 57).mirror().addBox(0.2852F, -1.2706F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.1934F, -0.0304F, 1.061F, -0.0699F, -0.0695F));

		PartDefinition cube_r290 = rightBeak.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(114, 54).mirror().addBox(0.376F, 0.0185F, -0.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.0934F, -1.2304F, 0.8254F, -0.0699F, -0.0695F));

		PartDefinition cube_r291 = rightBeak.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(113, 79).mirror().addBox(0.3697F, 0.3628F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.0934F, -2.1304F, 0.6945F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(22, 75).addBox(-1.2453F, -4.325F, -3.6722F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7F, -2.4F, 4.5F, 0.4147F, 0.4259F, 0.1502F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(38, 91).addBox(-1.3F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2567F, -6.8494F, 2.4968F, 2.9559F, 0.0734F, 0.0627F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(9, 99).addBox(-0.111F, -2.8217F, 0.1847F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4337F, -7.9419F, 3.6444F, -3.1247F, 0.0F, 0.1309F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(103, 11).addBox(-1.771F, -1.0024F, -1.2413F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4337F, -7.9419F, 3.6444F, 0.1978F, 0.0676F, -0.194F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(10, 109).addBox(-0.111F, -1.0221F, -1.2413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4337F, -7.9419F, 3.6444F, 0.2088F, 0.0F, 0.1309F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(106, 30).addBox(-1.6288F, -1.4782F, -1.5515F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4337F, -7.9419F, 3.6444F, 0.7047F, 0.2195F, -0.1197F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(51, 113).addBox(-0.111F, -1.5217F, -1.5515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4337F, -7.9419F, 3.6444F, 0.7324F, 0.0F, 0.1309F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(66, 44).addBox(-1.37F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 56).addBox(-1.73F, -1.15F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(90, 38).addBox(-1.06F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7683F, -6.2837F, 2.8222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(27, 99).addBox(0.3455F, -0.7699F, 0.0172F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.5415F, 1.8781F, 0.4887F, 0.2094F, 0.0F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(94, 116).addBox(-0.9F, 0.1159F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.2F, 0.7F, 2.6878F, 0.0349F, 0.0F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(116, 76).addBox(-0.9F, -0.8841F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.2F, 0.7F, 2.5133F, 0.0349F, 0.0F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(74, 116).addBox(-0.9524F, -0.7634F, 0.0845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.7F, -0.8F, 1.3963F, 0.0349F, 0.0F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(116, 73).addBox(-0.9F, -1.4625F, -0.8155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4F, -0.2F, 0.7F, 1.5708F, 0.0349F, 0.0F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(116, 102).addBox(-0.5F, -0.9908F, -0.0342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -1.5F, 1.4F, 2.7663F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(99, 116).addBox(-0.5F, 0.3195F, -0.4262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -1.2F, 1.0F, 3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(117, 3).addBox(-0.9537F, 0.0027F, 0.0267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 0.5F, -2.4F, 1.5621F, 0.0175F, -0.0006F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(114, 116).addBox(-0.9696F, -0.05F, -0.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.2F, -3.3F, 1.3003F, 0.0175F, -0.0006F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(115, 113).addBox(-0.643F, 0.0027F, 0.0068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9336F, -0.3734F, -4.0621F, 0.8899F, 0.2276F, -0.0766F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(114, 60).addBox(-0.8578F, -1.0147F, 0.0739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -1.4F, -4.1F, -0.2708F, 0.2276F, -0.0766F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(113, 93).addBox(-0.7758F, -1.111F, 0.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8F, -0.3F, -4.1F, -0.0526F, 0.2276F, -0.0766F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(111, 70).addBox(-0.5F, -1.6492F, 0.5199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2627F, -2.1067F, 3.3352F, 0.3521F, 0.2074F, 0.0296F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(88, 32).addBox(-0.5F, -1.5904F, -2.2246F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(113, 90).addBox(-0.5F, -0.5904F, -3.2246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2627F, -2.1067F, 3.3352F, 0.5092F, 0.2074F, 0.0296F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(73, 56).addBox(-1.1906F, -0.4483F, 0.0051F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -8.8497F, 3.8393F, -0.0933F, 0.1585F, 0.0093F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(94, 17).addBox(-1.9762F, -0.04F, -0.1719F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8506F, -9.4563F, 4.044F, -0.3062F, 0.1688F, -0.177F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(95, 86).addBox(-1.0602F, 0.0F, 0.0072F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8506F, -9.3563F, 3.744F, -0.2784F, -0.0068F, 0.3229F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(52, 9).addBox(-2.9962F, -0.0828F, -1.9452F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8506F, -9.4563F, 3.944F, 0.6419F, 0.128F, -0.1663F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(52, 65).addBox(-0.55F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9725F, -8.4336F, 3.4031F, 0.7774F, -0.0672F, 0.3508F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(15, 46).addBox(-0.8752F, -0.0886F, -0.0391F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -9.8497F, 6.4393F, -0.3473F, 0.7059F, -0.1749F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(11, 85).addBox(-2.0736F, -0.8217F, 0.0997F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -8.8497F, 3.8393F, 0.0819F, 0.1401F, -0.2066F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(22, 75).mirror().addBox(-0.7546F, -4.325F, -3.6722F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.4F, 4.5F, 0.4147F, -0.4259F, -0.1502F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-0.7F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -6.8494F, 2.4968F, 2.9559F, -0.0734F, -0.0627F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(9, 99).mirror().addBox(-0.889F, -2.8217F, 0.1847F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.9419F, 3.6444F, -3.1247F, 0.0F, -0.1309F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(103, 11).mirror().addBox(-0.229F, -1.0024F, -1.2413F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.9419F, 3.6444F, 0.1978F, -0.0676F, 0.194F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(10, 109).mirror().addBox(-0.889F, -1.0221F, -1.2413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.9419F, 3.6444F, 0.2088F, 0.0F, -0.1309F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(106, 30).mirror().addBox(-0.3712F, -1.4782F, -1.5515F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.9419F, 3.6444F, 0.7047F, -0.2195F, 0.1197F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(51, 113).mirror().addBox(-0.889F, -1.5217F, -1.5515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.9419F, 3.6444F, 0.7324F, 0.0F, -0.1309F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(66, 44).mirror().addBox(-0.63F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(82, 56).mirror().addBox(-1.27F, -1.15F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(90, 38).mirror().addBox(-0.94F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7683F, -6.2837F, 2.8222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(27, 99).mirror().addBox(-0.3455F, -0.7699F, 0.0172F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.5415F, 1.8781F, 0.4887F, -0.2094F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(94, 116).mirror().addBox(-0.1F, 0.1159F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.2F, 0.7F, 2.6878F, -0.0349F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(116, 76).mirror().addBox(-0.1F, -0.8841F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.2F, 0.7F, 2.5133F, -0.0349F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(74, 116).mirror().addBox(-0.0476F, -0.7634F, 0.0845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.7F, -0.8F, 1.3963F, -0.0349F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(116, 73).mirror().addBox(-0.1F, -1.4625F, -0.8155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.2F, 0.7F, 1.5708F, -0.0349F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(116, 102).mirror().addBox(-0.5F, -0.9908F, -0.0342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -1.5F, 1.4F, 2.7663F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(99, 116).mirror().addBox(-0.5F, 0.3195F, -0.4262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -1.2F, 1.0F, 3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(117, 3).mirror().addBox(-0.0463F, 0.0027F, 0.0267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, -2.4F, 1.5621F, -0.0175F, 0.0006F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(114, 116).mirror().addBox(-0.0304F, -0.05F, -0.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.2F, -3.3F, 1.3003F, -0.0175F, 0.0006F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(115, 113).mirror().addBox(-0.357F, 0.0027F, 0.0068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.9336F, -0.3734F, -4.0621F, 0.8899F, -0.2276F, 0.0766F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(114, 60).mirror().addBox(-0.1422F, -1.0147F, 0.0739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -1.4F, -4.1F, -0.2708F, -0.2276F, 0.0766F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(113, 93).mirror().addBox(-0.2242F, -1.111F, 0.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8F, -0.3F, -4.1F, -0.0526F, -0.2276F, 0.0766F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(111, 70).mirror().addBox(-0.5F, -1.6492F, 0.5199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2627F, -2.1067F, 3.3352F, 0.3521F, -0.2074F, -0.0296F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(88, 32).mirror().addBox(-0.5F, -1.5904F, -2.2246F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(113, 90).mirror().addBox(-0.5F, -0.5904F, -3.2246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2627F, -2.1067F, 3.3352F, 0.5092F, -0.2074F, -0.0296F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(0.1906F, -0.4483F, 0.0051F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -8.8497F, 3.8393F, -0.0933F, -0.1585F, -0.0093F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(94, 17).mirror().addBox(-0.0238F, -0.04F, -0.1719F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8506F, -9.4563F, 4.044F, -0.3062F, -0.1688F, 0.177F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(95, 86).mirror().addBox(0.0602F, 0.0F, 0.0072F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8506F, -9.3563F, 3.744F, -0.2784F, 0.0068F, -0.3229F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(52, 9).mirror().addBox(-0.0038F, -0.0828F, -1.9452F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8506F, -9.4563F, 3.944F, 0.6419F, -0.128F, 0.1663F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(52, 65).mirror().addBox(-0.45F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9725F, -8.4336F, 3.4031F, 0.7774F, 0.0672F, -0.3508F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(15, 46).mirror().addBox(-0.1248F, -0.0886F, -0.0391F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -9.8497F, 6.4393F, -0.3473F, -0.7059F, 0.1749F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(11, 85).mirror().addBox(0.0736F, -0.8217F, 0.0997F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -8.8497F, 3.8393F, 0.0819F, -0.1401F, 0.2066F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.5456F, -1.6276F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(118, 34).mirror().addBox(0.0F, 0.025F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0568F, 2.2368F, -1.108F, -0.6492F, -0.0881F, -0.138F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(41, 117).mirror().addBox(0.0F, -1.075F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2062F, 1.7808F, -0.1438F, -0.7365F, -0.0881F, -0.138F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(115, 110).mirror().addBox(-0.5F, -0.825F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.239F, 4.9364F, -2.3806F, -0.2508F, -0.0386F, -0.159F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(109, 115).mirror().addBox(-0.5F, 0.475F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 115).mirror().addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2663F, 5.0917F, -1.0445F, -0.9489F, -0.0386F, -0.159F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(44, 115).mirror().addBox(-0.425F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4154F, 4.5353F, -1.4326F, -0.469F, -0.0386F, -0.159F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(64, 114).mirror().addBox(0.6472F, 0.048F, -0.8919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6382F, 4.0235F, -0.0528F, -0.9402F, -0.0386F, -0.159F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(113, 96).mirror().addBox(-0.2216F, -0.0671F, -1.0508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9071F, 3.3701F, 0.6815F, -0.7395F, -0.0386F, -0.159F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(15, 109).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5164F, 3.6125F, -1.1F, -0.7221F, -0.0386F, -0.159F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(113, 39).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3453F, 0.667F, 2.2233F, -1.5717F, -0.116F, -0.1593F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(110, 111).mirror().addBox(-0.5534F, -2.5379F, 0.3259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.981F, 1.5435F, 0.7915F, -0.7514F, -0.116F, -0.1593F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(109, 55).mirror().addBox(-0.3338F, -2.1112F, -1.0683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8435F, 3.4999F, 0.566F, -0.8474F, -0.116F, -0.1593F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(106, 45).mirror().addBox(-0.2643F, -0.9292F, 0.2265F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2811F, 1.1435F, 0.0915F, -0.6835F, -0.0502F, -0.209F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(19, 116).mirror().addBox(-0.6399F, -1.4205F, -1.6994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 0.9547F, 1.0027F, -0.2683F, -0.1104F, -0.1847F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(113, 35).mirror().addBox(-0.6399F, -1.8915F, -0.2446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 0.9547F, 1.0027F, 0.6043F, -0.1104F, -0.1847F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(113, 31).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, 0.4706F, 1.3508F, 1.2327F, -0.1104F, -0.1847F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(118, 34).addBox(0.0F, 0.025F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8569F, 2.2368F, -1.108F, -0.6492F, 0.0881F, 0.138F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(41, 117).addBox(0.0F, -1.075F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0062F, 1.7808F, -0.1438F, -0.7365F, 0.0881F, 0.138F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(115, 110).addBox(-0.5F, -0.825F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0391F, 4.9364F, -2.3806F, -0.2508F, 0.0386F, 0.159F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(109, 115).addBox(-0.5F, 0.475F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 115).addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0664F, 5.0917F, -1.0445F, -0.9489F, 0.0386F, 0.159F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(44, 115).addBox(-0.575F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2155F, 4.5353F, -1.4326F, -0.469F, 0.0386F, 0.159F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(64, 114).addBox(-1.6472F, 0.048F, -0.8919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4382F, 4.0235F, -0.0528F, -0.9402F, 0.0386F, 0.159F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(113, 96).addBox(-0.7784F, -0.0671F, -1.0508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7071F, 3.3701F, 0.6815F, -0.7395F, 0.0386F, 0.159F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(15, 109).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3165F, 3.6125F, -1.1F, -0.7221F, 0.0386F, 0.159F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(113, 39).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1453F, 0.667F, 2.2233F, -1.5717F, 0.116F, 0.1593F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(110, 111).addBox(-0.4466F, -2.5379F, 0.3259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7811F, 1.5435F, 0.7915F, -0.7514F, 0.116F, 0.1593F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(109, 55).addBox(-0.6661F, -2.1112F, -1.0683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6436F, 3.4999F, 0.566F, -0.8474F, 0.116F, 0.1593F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(106, 45).addBox(-0.7357F, -0.9292F, 0.2265F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0811F, 1.1435F, 0.0915F, -0.6835F, 0.0502F, 0.209F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(19, 116).addBox(-0.3601F, -1.4205F, -1.6994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7165F, 0.9547F, 1.0027F, -0.2683F, 0.1104F, 0.1847F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(113, 35).addBox(-0.3601F, -1.8915F, -0.2446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7165F, 0.9547F, 1.0027F, 0.6043F, 0.1104F, 0.1847F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(113, 31).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9894F, 0.4706F, 1.3508F, 1.2327F, 0.1104F, 0.1847F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0967F, 5.9318F, -1.9218F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r380 = leftLowerbeak.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(108, 21).addBox(-1.0F, -1.0953F, -0.4971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -1.0786F, -0.0682F, -1.0559F, 0.0873F, 0.0F));

		PartDefinition cube_r381 = leftLowerbeak.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(114, 85).addBox(-1.0F, 0.8203F, -0.192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1947F, -1.0786F, -0.0682F, -1.4661F, 0.0873F, 0.0F));

		PartDefinition cube_r382 = leftLowerbeak.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(100, 109).addBox(-1.3312F, -1.6997F, -0.2256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, -1.7786F, -3.8682F, -2.1642F, 0.0873F, 0.0F));

		PartDefinition cube_r383 = leftLowerbeak.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(116, 70).addBox(-1.0F, -0.8276F, -0.7816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0117F, -0.2059F, -2.4281F, -2.042F, 0.0873F, 0.0F));

		PartDefinition cube_r384 = leftLowerbeak.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(69, 116).addBox(-1.0F, -0.7276F, -0.7816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0497F, -0.4521F, -2.8616F, -2.0857F, 0.0873F, 0.0F));

		PartDefinition cube_r385 = leftLowerbeak.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(39, 113).addBox(-1.0F, -1.7776F, -0.7566F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.216F)), PartPose.offsetAndRotation(-0.0466F, -0.5747F, -2.827F, -1.6493F, 0.0873F, 0.0F));

		PartDefinition cube_r386 = leftLowerbeak.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(14, 113).addBox(-1.0F, -1.8276F, -0.2566F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.215F)), PartPose.offsetAndRotation(-0.1465F, -1.7978F, -3.969F, -2.0857F, 0.0873F, 0.0F));

		PartDefinition cube_r387 = leftLowerbeak.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(56, 116).addBox(-1.0F, 0.7515F, 0.5517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1947F, -1.0786F, -0.0682F, -1.8326F, 0.0873F, 0.0F));

		PartDefinition cube_r388 = leftLowerbeak.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(33, 116).addBox(-1.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2403F, 0.0286F, -0.2091F, -0.8136F, 0.0343F, -0.0455F));

		PartDefinition cube_r389 = leftLowerbeak.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(28, 116).addBox(-1.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2153F, 0.2188F, -1.1905F, -1.3808F, 0.0343F, -0.0455F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2967F, 5.9318F, -1.9218F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r390 = rightLowerbeak.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(108, 21).mirror().addBox(0.0F, -1.0953F, -0.4971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -1.0786F, -0.0682F, -1.0559F, -0.0873F, 0.0F));

		PartDefinition cube_r391 = rightLowerbeak.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(114, 85).mirror().addBox(0.0F, 0.8203F, -0.192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -1.0786F, -0.0682F, -1.4661F, -0.0873F, 0.0F));

		PartDefinition cube_r392 = rightLowerbeak.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(100, 109).mirror().addBox(0.3312F, -1.6997F, -0.2256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -1.7786F, -3.8682F, -2.1642F, -0.0873F, 0.0F));

		PartDefinition cube_r393 = rightLowerbeak.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(116, 70).mirror().addBox(0.0F, -0.8276F, -0.7816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0117F, -0.2059F, -2.4281F, -2.042F, -0.0873F, 0.0F));

		PartDefinition cube_r394 = rightLowerbeak.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(69, 116).mirror().addBox(0.0F, -0.7276F, -0.7816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0497F, -0.4521F, -2.8616F, -2.0857F, -0.0873F, 0.0F));

		PartDefinition cube_r395 = rightLowerbeak.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(39, 113).mirror().addBox(0.0F, -1.7776F, -0.7566F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.216F)).mirror(false), PartPose.offsetAndRotation(0.0466F, -0.5747F, -2.827F, -1.6493F, -0.0873F, 0.0F));

		PartDefinition cube_r396 = rightLowerbeak.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(14, 113).mirror().addBox(0.0F, -1.8276F, -0.2566F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.215F)).mirror(false), PartPose.offsetAndRotation(0.1465F, -1.7978F, -3.969F, -2.0857F, -0.0873F, 0.0F));

		PartDefinition cube_r397 = rightLowerbeak.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(56, 116).mirror().addBox(0.0F, 0.7515F, 0.5517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -1.0786F, -0.0682F, -1.8326F, -0.0873F, 0.0F));

		PartDefinition cube_r398 = rightLowerbeak.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(33, 116).mirror().addBox(0.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2403F, 0.0286F, -0.2091F, -0.8136F, -0.0343F, 0.0455F));

		PartDefinition cube_r399 = rightLowerbeak.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(28, 116).mirror().addBox(0.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2153F, 0.2188F, -1.1905F, -1.3808F, -0.0343F, 0.0455F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6857F, -1.5926F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r400 = frill.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5F, -1.9F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(113, 99).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(99, 113).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.55F, 1.6115F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r401 = frill.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(45, 97).addBox(-0.5F, -5.7425F, 0.0464F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6953F, 1.0315F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r402 = frill.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(55, 77).addBox(-1.5F, -5.4264F, -2.5807F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6015F, 1.5349F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r403 = frill.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(38, 97).addBox(-4.9F, 2.3384F, -2.5544F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, -9.8885F, 8.7572F, -0.6632F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3573F, -5.7079F, 4.3759F, -0.247F, -0.4787F, 0.2378F));

		PartDefinition cube_r404 = leftFrill.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(50, 97).addBox(-2.2F, -0.5F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9885F, 2.0697F, -1.9428F, -0.4457F, 0.0502F, 0.3268F));

		PartDefinition cube_r405 = leftFrill.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(76, 16).addBox(-3.0F, -2.5F, -0.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7459F, 3.7253F, -1.64F, -0.0075F, -0.2318F, -0.9756F));

		PartDefinition cube_r406 = leftFrill.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(87, 0).addBox(-3.8F, -1.1F, 0.05F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4483F, 3.6741F, -1.91F, -0.1806F, -0.0943F, -0.0703F));

		PartDefinition cube_r407 = leftFrill.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(106, 26).addBox(-1.5127F, 0.0746F, -0.5831F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.9507F, 5.7482F, -1.5362F, -0.1899F, 0.3279F, 1.7369F));

		PartDefinition cube_r408 = leftFrill.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(88, 28).addBox(-1.5F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.3297F, 0.6914F, -0.3908F, -0.128F, 0.3759F, 1.8187F));

		PartDefinition cube_r409 = leftFrill.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(48, 24).addBox(1.9111F, 0.0085F, 0.1122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(90, 21).addBox(0.1111F, 0.4085F, 0.1122F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4345F, -1.8796F, 0.3435F, -0.2589F, 0.2889F, 1.3662F));

		PartDefinition cube_r410 = leftFrill.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(106, 42).addBox(-1.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.0429F, -0.5763F, 0.4694F, -0.3044F, 0.2403F, 1.1925F));

		PartDefinition cube_r411 = leftFrill.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(68, 107).addBox(-2.9447F, -0.9979F, -0.5831F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(107, 8).addBox(-0.9447F, -1.0979F, -0.5831F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(9, 90).addBox(-2.8448F, -0.5979F, -0.5831F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.4902F, 4.5528F, -1.2933F, -0.163F, 0.3417F, 1.8188F));

		PartDefinition cube_r412 = leftFrill.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(69, 21).addBox(-2.1133F, -0.3891F, -0.3691F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.6541F, -2.1795F, 0.9389F, -0.459F, 0.1771F, 0.9404F));

		PartDefinition cube_r413 = leftFrill.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(97, 98).addBox(3.3359F, -3.4309F, -0.5619F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5615F, -4.6945F, 0.5846F, -0.4239F, 0.1727F, 0.918F));

		PartDefinition cube_r414 = leftFrill.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(96, 5).addBox(1.6603F, -0.9638F, -0.4157F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5615F, -4.6945F, 0.5846F, -0.402F, -0.0491F, 0.3652F));

		PartDefinition cube_r415 = leftFrill.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(0, 109).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1833F, -4.3298F, 1.3186F, -0.2398F, 0.1014F, 0.7855F));

		PartDefinition cube_r416 = leftFrill.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(80, 108).addBox(1.7159F, -3.8267F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5615F, -4.6945F, 0.5846F, -0.2302F, 0.1217F, 0.8709F));

		PartDefinition cube_r417 = leftFrill.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(75, 108).addBox(-0.1084F, -1.9004F, -0.6459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5176F, -5.5022F, 1.8065F, -0.2302F, 0.1217F, 1.0891F));

		PartDefinition cube_r418 = leftFrill.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(5, 109).addBox(0.1567F, -1.813F, -0.6459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.5176F, -5.5022F, 1.8065F, -0.2398F, 0.1014F, 1.0037F));

		PartDefinition cube_r419 = leftFrill.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(108, 34).addBox(-0.6591F, -1.0479F, -0.6504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.454F, -4.8664F, 0.8564F, -0.0971F, -0.0363F, 0.3109F));

		PartDefinition cube_r420 = leftFrill.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(21, 108).addBox(-0.1228F, -1.2975F, -0.6504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.454F, -4.8664F, 0.8564F, -0.095F, -0.0413F, 0.2587F));

		PartDefinition cube_r421 = leftFrill.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(90, 108).addBox(-0.6392F, -2.7751F, -0.9812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.454F, -4.8664F, 0.8564F, -0.3977F, 0.0112F, 0.2895F));

		PartDefinition cube_r422 = leftFrill.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(22, 69).addBox(-0.2727F, -6.4934F, -1.7299F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.454F, -4.8664F, 0.8564F, -0.6575F, -0.0311F, 0.1674F));

		PartDefinition cube_r423 = leftFrill.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(78, 102).addBox(0.1776F, -6.2591F, -1.7299F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.454F, -4.8664F, 0.8564F, -0.6546F, -0.0737F, 0.112F));

		PartDefinition cube_r424 = leftFrill.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(85, 108).addBox(-0.0081F, -2.9147F, -0.9812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.454F, -4.8664F, 0.8564F, -0.3963F, -0.0361F, 0.1768F));

		PartDefinition cube_r425 = leftFrill.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(97, 43).addBox(-3.5F, 1.2F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.772F, -0.8215F, -0.3458F, -0.1895F, -0.363F, -0.7284F));

		PartDefinition cube_r426 = leftFrill.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(37, 65).addBox(-3.5F, -0.1F, -0.3F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(2.772F, -0.8215F, -0.3458F, 0.0831F, -0.3994F, -1.4346F));

		PartDefinition cube_r427 = leftFrill.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(65, 97).addBox(-4.0F, -2.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7971F, -1.1815F, -0.043F, 0.1264F, -0.2996F, -2.1305F));

		PartDefinition cube_r428 = leftFrill.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(38, 87).addBox(-5.1F, -1.6F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.113F, -3.5754F, 0.7059F, -0.0885F, -0.3125F, -1.443F));

		PartDefinition cube_r429 = leftFrill.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(86, 66).addBox(-2.718F, 0.9824F, -0.0953F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5615F, -4.6945F, 0.5846F, -0.2465F, -0.2071F, -0.6557F));

		PartDefinition cube_r430 = leftFrill.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(113, 23).addBox(-1.0358F, -0.0081F, 0.0136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.456F, -4.8738F, 0.2085F, -0.1571F, 0.2832F, -0.154F));

		PartDefinition cube_r431 = leftFrill.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(104, 59).addBox(-1.9358F, -0.0081F, -0.4864F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4316F, -5.0009F, 0.7382F, -0.1508F, -0.0187F, -0.1069F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3573F, -5.7079F, 4.3759F, -0.247F, 0.4787F, -0.2378F));

		PartDefinition cube_r432 = rightFrill.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(50, 97).mirror().addBox(-0.8F, -0.5F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9885F, 2.0697F, -1.9428F, -0.4457F, -0.0502F, -0.3268F));

		PartDefinition cube_r433 = rightFrill.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-1.0F, -2.5F, -0.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7459F, 3.7253F, -1.64F, -0.0075F, 0.2318F, 0.9756F));

		PartDefinition cube_r434 = rightFrill.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-0.2F, -1.1F, 0.05F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4483F, 3.6741F, -1.91F, -0.1806F, 0.0943F, 0.0703F));

		PartDefinition cube_r435 = rightFrill.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(106, 26).mirror().addBox(-0.4873F, 0.0746F, -0.5831F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.9507F, 5.7482F, -1.5362F, -0.1899F, -0.3279F, -1.7369F));

		PartDefinition cube_r436 = rightFrill.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(88, 28).mirror().addBox(-2.5F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.3297F, 0.6914F, -0.3908F, -0.128F, -0.3759F, -1.8187F));

		PartDefinition cube_r437 = rightFrill.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(48, 24).mirror().addBox(-2.9111F, 0.0085F, 0.1122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(90, 21).mirror().addBox(-4.1111F, 0.4085F, 0.1122F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4345F, -1.8796F, 0.3435F, -0.2589F, -0.2889F, -1.3662F));

		PartDefinition cube_r438 = rightFrill.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(106, 42).mirror().addBox(-0.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.0429F, -0.5763F, 0.4694F, -0.3044F, -0.2403F, -1.1925F));

		PartDefinition cube_r439 = rightFrill.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(68, 107).mirror().addBox(0.9447F, -0.9979F, -0.5831F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(107, 8).mirror().addBox(-1.0553F, -1.0979F, -0.5831F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(9, 90).mirror().addBox(-1.1552F, -0.5979F, -0.5831F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.4902F, 4.5528F, -1.2933F, -0.163F, -0.3417F, -1.8188F));

		PartDefinition cube_r440 = rightFrill.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(69, 21).mirror().addBox(0.1133F, -0.3891F, -0.3691F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.6541F, -2.1795F, 0.9389F, -0.459F, -0.1771F, -0.9404F));

		PartDefinition cube_r441 = rightFrill.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(97, 98).mirror().addBox(-6.3359F, -3.4309F, -0.5619F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5615F, -4.6945F, 0.5846F, -0.4239F, -0.1727F, -0.918F));

		PartDefinition cube_r442 = rightFrill.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(96, 5).mirror().addBox(-4.6603F, -0.9638F, -0.4157F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5615F, -4.6945F, 0.5846F, -0.402F, 0.0491F, -0.3652F));

		PartDefinition cube_r443 = rightFrill.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1833F, -4.3298F, 1.3186F, -0.2398F, -0.1014F, -0.7855F));

		PartDefinition cube_r444 = rightFrill.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(80, 108).mirror().addBox(-2.7159F, -3.8267F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5615F, -4.6945F, 0.5846F, -0.2302F, -0.1217F, -0.8709F));

		PartDefinition cube_r445 = rightFrill.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(75, 108).mirror().addBox(-0.8916F, -1.9004F, -0.6459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5176F, -5.5022F, 1.8065F, -0.2302F, -0.1217F, -1.0891F));

		PartDefinition cube_r446 = rightFrill.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(5, 109).mirror().addBox(-1.1567F, -1.813F, -0.6459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5176F, -5.5022F, 1.8065F, -0.2398F, -0.1014F, -1.0037F));

		PartDefinition cube_r447 = rightFrill.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(108, 34).mirror().addBox(-0.3409F, -1.0479F, -0.6504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.454F, -4.8664F, 0.8564F, -0.0971F, 0.0363F, -0.3109F));

		PartDefinition cube_r448 = rightFrill.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(21, 108).mirror().addBox(-0.8772F, -1.2975F, -0.6504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.454F, -4.8664F, 0.8564F, -0.095F, 0.0413F, -0.2587F));

		PartDefinition cube_r449 = rightFrill.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(90, 108).mirror().addBox(-0.3608F, -2.7751F, -0.9812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.454F, -4.8664F, 0.8564F, -0.3977F, -0.0112F, -0.2895F));

		PartDefinition cube_r450 = rightFrill.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(22, 69).mirror().addBox(-0.7273F, -6.4934F, -1.7299F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.454F, -4.8664F, 0.8564F, -0.6575F, 0.0311F, -0.1674F));

		PartDefinition cube_r451 = rightFrill.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(78, 102).mirror().addBox(-1.1775F, -6.2591F, -1.7299F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.454F, -4.8664F, 0.8564F, -0.6546F, 0.0737F, -0.112F));

		PartDefinition cube_r452 = rightFrill.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(85, 108).mirror().addBox(-0.9919F, -2.9147F, -0.9812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.454F, -4.8664F, 0.8564F, -0.3963F, 0.0361F, -0.1768F));

		PartDefinition cube_r453 = rightFrill.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(97, 43).mirror().addBox(0.5F, 1.2F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.772F, -0.8215F, -0.3458F, -0.1895F, 0.363F, 0.7284F));

		PartDefinition cube_r454 = rightFrill.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(37, 65).mirror().addBox(-2.5F, -0.1F, -0.3F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-2.772F, -0.8215F, -0.3458F, 0.0831F, 0.3994F, 1.4346F));

		PartDefinition cube_r455 = rightFrill.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(65, 97).mirror().addBox(1.0F, -2.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7971F, -1.1815F, -0.043F, 0.1264F, 0.2996F, 2.1305F));

		PartDefinition cube_r456 = rightFrill.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(38, 87).mirror().addBox(1.1F, -1.6F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.113F, -3.5754F, 0.7059F, -0.0885F, 0.3125F, 1.443F));

		PartDefinition cube_r457 = rightFrill.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(86, 66).mirror().addBox(-1.282F, 0.9824F, -0.0953F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5615F, -4.6945F, 0.5846F, -0.2465F, 0.2071F, 0.6557F));

		PartDefinition cube_r458 = rightFrill.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(113, 23).mirror().addBox(0.0358F, -0.0081F, 0.0136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.456F, -4.8738F, 0.2085F, -0.1571F, -0.2832F, 0.154F));

		PartDefinition cube_r459 = rightFrill.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(104, 59).mirror().addBox(-0.0642F, -0.0081F, -0.4864F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4316F, -5.0009F, 0.7382F, -0.1508F, 0.0187F, 0.1069F));

		return LayerDefinition.create(meshdefinition, 122, 122);
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