package fossils.fossils.client.blockentity.model.einiosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EiniosaurusFossilModel extends SkullModelBase {
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

	public EiniosaurusFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -3.5695F, -4.9874F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -26.3F, 6.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 34).addBox(0.0F, -1.3F, -7.8F, 0.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3574F, 3.046F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(115, 26).mirror().addBox(-0.5F, -1.7F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5683F, 6.8317F, 10.1424F, 0.3609F, 0.2608F, 0.0233F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 61).mirror().addBox(-0.1121F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 67).mirror().addBox(-0.1121F, -0.1296F, -0.1578F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -4.9154F, -2.414F, -0.0014F, -0.0492F, -0.0211F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 69).mirror().addBox(-0.499F, -0.4002F, -2.5068F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -3.9154F, -5.814F, 0.2177F, 0.3006F, 0.0547F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 102).mirror().addBox(-4.0F, -0.8383F, -0.9482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 104).mirror().addBox(0.0931F, -0.3231F, -0.0422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 3.3248F, 7.5219F, -0.73F, 0.2608F, 0.0233F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(83, 57).mirror().addBox(-0.6031F, -0.6897F, -0.0732F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0248F, 3.1219F, -0.5554F, 0.2608F, 0.0233F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(91, 13).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.449F, -0.6098F, 2.5909F, -1.0123F, 0.2618F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 104).mirror().addBox(-0.0513F, -0.3209F, -0.7583F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.2752F, 1.5219F, -0.4538F, 0.2618F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(87, 84).mirror().addBox(-0.5513F, 0.1098F, 0.8523F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.2583F, -2.3967F, -0.3665F, 0.2618F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 110).mirror().addBox(-0.5513F, -0.5553F, -0.553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.2583F, -2.3967F, -0.8901F, 0.2618F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(87, 90).mirror().addBox(-0.4211F, 1.0393F, -0.8595F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.5347F, -0.2679F, 0.2106F, -0.0573F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.6F, -0.908F, -3.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.1347F, 0.6372F, 0.0518F, 0.0073F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(111, 34).mirror().addBox(-0.6F, -3.6241F, -5.3343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.1347F, 1.0736F, 0.0518F, 0.0073F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(116, 58).mirror().addBox(-0.6F, -3.5303F, -5.1626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.1347F, 0.8118F, 0.0518F, 0.0073F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-0.6F, -0.5675F, -7.3923F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(82, 77).mirror().addBox(-0.6F, 0.4325F, -5.0923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.1347F, 0.2009F, 0.0518F, 0.0073F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-0.2F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4116F, -1.6675F, 0.1841F, -0.3276F, 0.0404F, -0.1367F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-1.0F, -1.3781F, -3.2079F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -3.6532F, 0.5342F, 3.0718F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -4.1581F, -1.7218F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(120, 113).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 113).addBox(6.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -3.2994F, 8.4747F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(109, 109).mirror().addBox(-0.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 109).addBox(6.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -4.143F, 6.3942F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(30, 69).mirror().addBox(-0.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(30, 69).addBox(6.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, -3.0439F, 4.9247F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 61).addBox(-0.8879F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 67).addBox(-0.8879F, -0.1296F, -0.1578F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -4.9154F, -2.414F, -0.0014F, 0.0492F, 0.0211F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(68, 69).addBox(-0.501F, -0.4002F, -2.5068F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -3.9154F, -5.814F, 0.2177F, -0.3006F, -0.0547F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(54, 102).addBox(3.0F, -0.8383F, -0.9482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -4.0F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(115, 26).addBox(-0.5F, -1.7F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5683F, 6.8317F, 10.1424F, 0.3609F, -0.2608F, -0.0233F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(43, 104).addBox(-1.0931F, -0.3231F, -0.0422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8F, 3.3248F, 7.5219F, -0.73F, -0.2608F, -0.0233F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 57).addBox(-0.3969F, -0.6897F, -0.0732F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.0248F, 3.1219F, -0.5554F, -0.2608F, -0.0233F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(91, 13).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.449F, -0.6098F, 2.5909F, -1.0123F, -0.2618F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 104).addBox(-0.9487F, -0.3209F, -0.7583F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, -0.2752F, 1.5219F, -0.4538F, -0.2618F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(87, 84).addBox(-0.4487F, 0.1098F, 0.8523F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, -1.2583F, -2.3967F, -0.3665F, -0.2618F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(61, 110).addBox(-0.4487F, -0.5553F, -0.553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -1.2583F, -2.3967F, -0.8901F, -0.2618F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(87, 90).addBox(-0.5789F, 1.0393F, -0.8595F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.5347F, -0.2679F, -0.2106F, 0.0573F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(103, 0).addBox(-0.4F, -0.908F, -3.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.1347F, 0.6372F, -0.0518F, -0.0073F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(111, 34).addBox(-0.4F, -3.6241F, -5.3343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.1347F, 1.0736F, -0.0518F, -0.0073F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(116, 58).addBox(-0.4F, -3.5303F, -5.1626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.1347F, 0.8118F, -0.0518F, -0.0073F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(60, 71).addBox(-0.4F, -0.5675F, -7.3923F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(82, 77).addBox(-0.4F, 0.4325F, -5.0923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.1347F, 0.2009F, -0.0518F, -0.0073F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(71, 10).addBox(-0.8F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4116F, -1.6675F, 0.1841F, -0.3276F, -0.0404F, 0.1367F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -1.3781F, -3.2079F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.6532F, 0.5342F, 3.0718F, 0.0F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5F, -4.1581F, -1.7218F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -0.1962F, 0.0069F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.004F))
				.texOffs(87, 118).addBox(1.0F, 0.8038F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 117).addBox(0.8F, 0.8038F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 117).addBox(0.6F, 0.8038F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 117).addBox(0.5F, 0.8038F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 118).mirror().addBox(-3.0F, 0.8038F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 117).mirror().addBox(-2.8F, 0.8038F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 117).mirror().addBox(-2.6F, 0.8038F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 117).mirror().addBox(-2.5F, 0.8038F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.4075F, 6.9014F, -0.5039F, 0.1532F, -0.0839F));

		PartDefinition cube_r41 = tail.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(48, 120).addBox(0.0F, -4.0783F, 1.4815F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 120).addBox(0.0F, -3.4783F, -0.4185F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7301F, 6.0938F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r42 = tail.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(116, 119).addBox(0.0F, -0.1F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 119).addBox(0.0F, -1.1F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3972F, 7.4283F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r43 = tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(20, 121).addBox(0.0F, -2.5271F, 0.8135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5035F, 4.8703F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(56, 78).addBox(0.0F, -2.4473F, -0.0968F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.2394F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(91, 120).addBox(0.0F, -4.582F, 1.192F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(36, 120).addBox(0.0F, -3.882F, -0.808F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(29, 21).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(118, 4).addBox(0.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 6).addBox(0.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 47).addBox(1.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 41).addBox(0.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 4).mirror().addBox(-2.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 6).mirror().addBox(-2.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 47).mirror().addBox(-2.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 41).mirror().addBox(-1.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9361F, 8.8961F, -0.0804F, 0.2175F, -0.0174F));

		PartDefinition cube_r47 = tail2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 122).addBox(0.0F, -4.7544F, 7.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 64).addBox(0.0F, -4.5544F, 5.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 109).addBox(0.0F, -4.4544F, 3.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 120).addBox(0.0F, -4.2544F, 1.2508F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(42, 121).addBox(0.0F, 4.2024F, 10.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 121).addBox(0.0F, 3.4024F, 8.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 121).addBox(0.0F, 2.3024F, 6.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 119).addBox(0.0F, 0.0024F, 4.8767F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5469F, -2.2129F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(30, 120).addBox(0.0F, -2.5547F, 0.0262F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9272F, 9.6761F, 0.2449F, 0.3821F, 0.0929F));

		PartDefinition cube_r50 = tail3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(102, 122).addBox(0.0F, 9.0423F, 17.0451F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 122).addBox(0.0F, 7.3423F, 15.4451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 122).addBox(0.0F, 6.1423F, 13.8451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 58).addBox(0.0F, 5.144F, 12.3552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4559F, -11.8198F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(69, 122).addBox(0.0F, -3.6976F, 5.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 122).addBox(0.0F, -3.3976F, 3.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 122).addBox(0.0F, -3.1976F, 1.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 86).addBox(0.0F, -3.0976F, -0.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6881F, 1.6345F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2532F, -0.1914F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0741F, 8.8502F, 0.3284F, -0.29F, -0.0971F));

		PartDefinition cube_r52 = tail4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(122, 20).addBox(0.0F, -2.2407F, -1.4848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5011F, 3.0578F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(81, 122).addBox(0.0F, -2.282F, -1.408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8011F, 5.0578F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(27, 82).addBox(0.0F, 8.1206F, 15.884F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 122).addBox(0.0F, 10.3574F, 19.2002F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 81).addBox(0.0F, 9.239F, 17.5421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.501F, -17.6618F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(122, 31).addBox(0.0F, -0.7F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4558F, 0.2694F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(72, 50).addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -1.3967F, 0.2206F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftleg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(47, 90).addBox(0.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftleg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(69, 77).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftleg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftleg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(84, 7).addBox(-0.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7762F, -4.4099F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftleg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 107).addBox(-0.1F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(23, 36).addBox(-0.1F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftleg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(88, 19).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftleg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(103, 95).addBox(-1.601F, 4.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 103).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftleg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(69, 96).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6865F, 4.6725F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftleg3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 96).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(106, 105).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftfoot.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(108, 23).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(54, 26).addBox(-1.999F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(73, 20).addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9F, -1.3967F, 0.2206F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightleg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(91, 7).addBox(-3.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightleg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(43, 78).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightleg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(60, 77).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightleg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 84).addBox(-1.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7762F, -4.4099F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightleg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(107, 81).addBox(-0.9F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(16, 98).addBox(-0.9F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightleg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(89, 37).addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightleg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(103, 100).addBox(-0.399F, 4.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(83, 105).addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightleg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(85, 96).addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6865F, 4.6725F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightleg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(54, 97).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(107, 60).addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightfoot.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(14, 109).addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(55, 43).addBox(-2.001F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9194F, -4.923F, 0.1408F, 0.1296F, 0.0183F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(27, 120).addBox(0.0F, -2.8616F, -4.6978F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 107).addBox(0.0F, -2.2616F, -6.6978F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7184F, 1.8039F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(34, 59).addBox(0.0F, -3.6694F, -0.1443F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3184F, -10.6961F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(52, 43).addBox(0.0F, -3.6694F, -0.1443F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3184F, -8.6961F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(68, 10).addBox(0.0F, -3.6764F, -0.1077F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3816F, -6.6961F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(116, 70).mirror().addBox(-2.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0554F, -0.0092F, -0.3139F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(68, 116).mirror().addBox(-4.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0108F, 0.0177F, -0.8578F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(87, 55).mirror().addBox(-12.3996F, -3.7378F, -2.5366F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0006F, 0.4222F, -1.3812F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(72, 57).mirror().addBox(-6.81F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0005F, 0.1778F, -1.3814F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(87, 53).mirror().addBox(-12.0038F, -3.8478F, -1.5367F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0441F, 0.4531F, -1.3663F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(88, 25).mirror().addBox(-6.1529F, -3.8689F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0415F, 0.2961F, -1.3735F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(33, 118).mirror().addBox(-3.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.1494F, 0.1755F, -0.8443F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(118, 12).mirror().addBox(-2.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.2547F, 0.0552F, -0.3093F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(41, 11).mirror().addBox(-14.8804F, -3.7351F, -0.4699F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.0849F, 0.4316F, -1.3621F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(116, 62).mirror().addBox(-4.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.2959F, 0.3297F, -0.8075F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(115, 107).mirror().addBox(-2.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.4555F, 0.1174F, -0.2919F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(107, 74).mirror().addBox(-5.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.0609F, -0.0609F, -1.3877F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(63, 103).mirror().addBox(-5.133F, -3.7878F, -3.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.0569F, 0.4438F, -1.4129F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(114, 89).mirror().addBox(-4.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.3089F, -0.3337F, -0.8062F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-2.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.4817F, -0.1723F, -0.2638F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(-10.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0434F, 0.2688F, -1.3976F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(111, 14).mirror().addBox(-5.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0419F, 0.0421F, -1.3878F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(115, 21).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.1386F, -0.1535F, -0.8476F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(61, 114).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.4563F, -2.4056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(114, 67).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -0.7563F, -4.4056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(40, 114).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -0.9109F, -6.6714F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(114, 86).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -0.5109F, -8.6714F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(21, 114).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, 0.3731F, -10.4594F, 0.429F, -0.1843F, 0.5459F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(117, 98).mirror().addBox(-2.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.2446F, -0.1044F, -0.2967F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(116, 70).addBox(0.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0554F, 0.0092F, 0.3139F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(68, 116).addBox(2.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0108F, -0.0177F, 0.8578F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(87, 55).addBox(6.3996F, -3.7378F, -2.5366F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0006F, -0.4222F, 1.3812F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(72, 57).addBox(2.81F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0005F, -0.1778F, 1.3814F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(87, 53).addBox(6.0038F, -3.8478F, -1.5367F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0441F, -0.4531F, 1.3663F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(88, 25).addBox(2.1529F, -3.8689F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0415F, -0.2961F, 1.3735F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(33, 118).addBox(1.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.1494F, -0.1755F, 0.8443F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(118, 12).addBox(0.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.2547F, -0.0552F, 0.3093F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(41, 11).addBox(2.8804F, -3.7351F, -0.4699F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.0849F, -0.4316F, 1.3621F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(116, 62).addBox(2.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.2959F, -0.3297F, 0.8075F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(115, 107).addBox(0.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.4555F, -0.1174F, 0.2919F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(107, 74).addBox(2.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.0609F, 0.0609F, 1.3877F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(63, 103).addBox(4.133F, -3.7878F, -3.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.0569F, -0.4438F, 1.4129F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(114, 89).addBox(2.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.3089F, 0.3337F, 0.8062F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(76, 59).addBox(0.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.4817F, 0.1723F, 0.2638F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 48).addBox(5.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0434F, -0.2688F, 1.3976F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(111, 14).addBox(2.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0419F, -0.0421F, 1.3878F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(115, 21).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.1386F, 0.1535F, 0.8476F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(61, 114).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.4563F, -2.4056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(114, 67).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -0.7563F, -4.4056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(40, 114).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -0.9109F, -6.6714F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(114, 86).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -0.5109F, -8.6714F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(21, 114).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3851F, 0.3731F, -10.4594F, 0.429F, 0.1843F, -0.5459F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(117, 98).addBox(0.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.2446F, 0.1044F, 0.2967F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(54, 17).addBox(-1.0F, -0.0745F, -5.9424F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5816F, -5.8961F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(55, 50).addBox(-1.0F, -1.3073F, -7.6534F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7184F, 1.8039F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5184F, -11.6961F, 0.0873F, 0.0435F, 0.0038F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(60, 119).addBox(0.0F, -5.8823F, 3.3766F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 119).addBox(0.0F, -7.2823F, 5.1766F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 118).addBox(0.0F, -4.6823F, 1.6766F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 98).addBox(0.0F, -3.7823F, -0.0234F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(120, 17).mirror().addBox(0.9737F, 0.6114F, 2.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(74, 41).mirror().addBox(-0.0263F, 0.6114F, -2.4179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(120, 17).addBox(2.3737F, 0.6114F, 2.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(74, 41).addBox(2.3737F, 0.6114F, -2.4179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 11.315F, -0.6548F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(-2.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.625F, 0.2341F, -0.2993F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(-4.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.393F, 0.513F, -0.8048F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-11.7642F, -3.7644F, -0.2185F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0541F, 0.6334F, -1.415F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(117, 100).mirror().addBox(-2.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.5751F, 0.1476F, -0.3105F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(117, 23).mirror().addBox(-4.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.3915F, 0.4136F, -0.8072F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-12.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.1194F, 0.5501F, -1.3802F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(116, 93).mirror().addBox(-2.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.5061F, 0.1323F, -0.2856F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(41, 15).mirror().addBox(-14.77F, -3.756F, -0.5341F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.0972F, 0.4828F, -1.3567F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(116, 91).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.3347F, 0.3673F, -0.7943F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(116, 74).mirror().addBox(-1.9111F, 0.0499F, -0.505F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.014F, -0.6216F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(41, 13).mirror().addBox(-14.6969F, -2.65F, -0.5391F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.014F, -0.6216F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(116, 72).mirror().addBox(-3.6202F, -2.443F, 1.1159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.414F, -1.7216F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(27, 85).mirror().addBox(1.7312F, -2.2843F, -3.4866F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 10.3324F, -5.0444F, 1.4408F, -0.1533F, -0.8627F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(1.7973F, -2.2843F, 0.1697F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 10.3324F, -5.0444F, 1.3964F, -0.0998F, -0.5149F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(76, 84).mirror().addBox(0.0227F, -2.1587F, -0.0543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.8324F, 1.6556F, 0.7922F, -0.0392F, 0.0971F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(0.0136F, -0.5471F, 0.0262F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 6.6324F, -5.0444F, 0.6177F, -0.0392F, 0.0971F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(45, 71).mirror().addBox(-0.4503F, -0.3036F, -2.1659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.3124F, 1.5667F, 0.7943F, -1.1555F, -0.7286F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(0.0912F, -0.2503F, -0.9112F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.8453F, 1.9216F, 0.3704F, -1.1546F, -0.1895F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(96, 62).mirror().addBox(-0.6821F, -0.1832F, -0.5535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.3929F, 0.3506F, 0.7776F, -1.1098F, -0.5606F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(73, 27).mirror().addBox(-0.0263F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 27).addBox(2.3737F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1737F, 12.715F, -3.3548F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(114, 64).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 114).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5818F, -2.1266F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(45, 69).addBox(0.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.625F, -0.2341F, 0.2993F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(30, 67).addBox(2.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.393F, -0.513F, 0.8048F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(62, 8).addBox(2.7642F, -3.7644F, -0.2185F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0541F, -0.6334F, 1.415F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(117, 100).addBox(0.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.5751F, -0.1476F, 0.3105F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(117, 23).addBox(2.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.3915F, -0.4136F, 0.8072F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(53, 59).addBox(2.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.1194F, -0.5501F, 1.3802F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(116, 93).addBox(0.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.5061F, -0.1323F, 0.2856F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(41, 15).addBox(2.77F, -3.756F, -0.5341F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.0972F, -0.4828F, 1.3567F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(116, 91).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.3347F, -0.3673F, 0.7943F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(116, 74).addBox(-0.0889F, 0.0499F, -0.505F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.014F, -0.6216F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(41, 13).addBox(2.6969F, -2.65F, -0.5391F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.014F, -0.6216F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(116, 72).addBox(1.6202F, -2.443F, 1.1159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.414F, -1.7216F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(27, 85).addBox(-2.7312F, -2.2843F, -3.4866F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.0F, 10.3324F, -5.0444F, 1.4408F, 0.1533F, 0.8627F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 88).addBox(-2.7973F, -2.2843F, 0.1697F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 10.3324F, -5.0444F, 1.3964F, 0.0998F, 0.5149F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(76, 84).addBox(-1.0227F, -2.1587F, -0.0543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 3.8324F, 1.6556F, 0.7922F, 0.0392F, -0.0971F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(21, 49).addBox(-1.0136F, -0.5471F, 0.0262F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 6.6324F, -5.0444F, 0.6177F, 0.0392F, -0.0971F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(45, 71).addBox(-0.5497F, -0.3036F, -2.1659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.3124F, 1.5667F, 0.7943F, 1.1555F, 0.7286F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(15, 75).addBox(-1.0912F, -0.2503F, -0.9112F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.8453F, 1.9216F, 0.3704F, 1.1546F, 0.1895F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(96, 62).addBox(-0.3179F, -0.1832F, -0.5535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.3929F, 0.3506F, 0.7776F, 1.1098F, 0.5606F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(114, 64).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 114).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5818F, -2.1266F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, -0.907F, -0.4666F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 9.5518F, -2.9424F, -0.5672F, 0.0F, -0.1745F));

		PartDefinition cube_r174 = leftarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(99, 26).addBox(-0.0544F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r175 = leftarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(114, 81).addBox(-0.1791F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r176 = leftarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(95, 76).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(83, 64).addBox(-2.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(76, 91).addBox(-0.9824F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 7.5571F, 4.5001F, 0.3322F, -1.2608F, 0.0482F));

		PartDefinition cube_r179 = leftarm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(9, 93).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(9, 82).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 7.5086F, -2.6347F, 1.0463F, 0.6267F, -0.3359F));

		PartDefinition cube_r180 = lefthand.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(98, 91).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r181 = lefthand.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(47, 85).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r182 = lefthand.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(88, 105).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r183 = lefthand.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(106, 26).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 9.5518F, -2.9424F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r184 = rightarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(76, 99).addBox(-0.9456F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r185 = rightarm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(82, 114).addBox(-0.8209F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r186 = rightarm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightarm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(83, 70).addBox(-1.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightarm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(36, 92).addBox(-1.0176F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 7.5571F, 4.5001F, -0.4806F, 1.2395F, -0.8996F));

		PartDefinition cube_r189 = rightarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(29, 94).addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 82).addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 7.5086F, -2.6347F, 0.869F, -0.5719F, 0.4181F));

		PartDefinition cube_r190 = righthand.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(100, 34).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r191 = righthand.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(86, 27).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r192 = righthand.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(97, 105).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r193 = righthand.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(106, 30).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.486F, -6.1216F, -0.1274F, 0.1462F, 0.2625F));

		PartDefinition cube_r194 = neck2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(63, 119).addBox(0.0F, -2.0703F, -0.1461F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r195 = neck2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(121, 54).addBox(0.0F, -2.9F, -2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 33).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r196 = neck2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(111, 54).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r197 = neck2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(118, 46).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r198 = neck2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(118, 44).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.7482F, 0.4455F, -0.2993F));

		PartDefinition cube_r199 = neck2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(118, 42).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.3858F, 0.754F, -0.8505F));

		PartDefinition cube_r200 = neck2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(102, 16).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1539F, 0.8183F, -1.5953F));

		PartDefinition cube_r201 = neck2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(111, 54).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r202 = neck2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r203 = neck2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(118, 44).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.7482F, -0.4455F, 0.2993F));

		PartDefinition cube_r204 = neck2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(118, 42).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.3858F, -0.754F, 0.8505F));

		PartDefinition cube_r205 = neck2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(102, 16).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1539F, -0.8183F, 1.5953F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, 0.1543F, 0.6319F, 0.3651F));

		PartDefinition cube_r206 = neck.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(113, 76).addBox(0.0F, -3.4F, -2.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(79, 0).addBox(-1.0F, -1.4F, -3.7F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(118, 48).mirror().addBox(-2.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r208 = neck.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(118, 48).addBox(0.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(52, 34).addBox(-2.5F, -3.7799F, -2.9581F, 5.0F, 5.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.3821F, -4.1095F, 0.1329F, 0.1215F, 0.0246F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(30, 77).addBox(-1.5F, -3.7845F, 0.6777F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5567F, -3.9625F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(98, 113).addBox(-1.0F, -1.067F, 1.0406F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(38, 58).addBox(-1.0F, -6.067F, 1.0406F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7567F, -9.3625F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(93, 113).addBox(-0.5F, -2.8341F, -0.6993F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.0705F, -12.202F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(88, 113).addBox(-0.5F, -0.9045F, -0.698F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.8705F, -11.802F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(116, 109).mirror().addBox(-0.4886F, -1.2547F, -1.664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1891F, 0.1166F, -8.2316F, 0.6626F, -0.0408F, 0.0077F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(42, 109).mirror().addBox(-0.44F, -1.7302F, 1.4452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1891F, 0.1166F, -8.2316F, 2.5034F, -0.0362F, -0.0087F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(102, 10).mirror().addBox(-0.4886F, -2.0943F, -0.2829F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1891F, 0.1166F, -8.2316F, 1.7622F, -0.0408F, 0.0077F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-0.4886F, -1.6577F, -0.8505F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1891F, 0.1166F, -8.2316F, 1.1338F, -0.0408F, 0.0077F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(116, 109).addBox(-0.5114F, -1.2547F, -1.664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1891F, 0.1166F, -8.2316F, 0.6626F, 0.0408F, -0.0077F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(103, 118).addBox(-0.56F, -3.2794F, 0.9171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1891F, 0.1166F, -8.2316F, 2.2765F, 0.0362F, 0.0087F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(118, 8).addBox(-0.693F, -1.7355F, -0.9085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(120, 25).addBox(-0.693F, -0.9355F, -1.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.1891F, -0.3834F, -12.0316F, 2.9223F, 0.0362F, 0.0087F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(42, 109).addBox(-0.56F, -1.7302F, 1.4452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1891F, 0.1166F, -8.2316F, 2.5034F, 0.0362F, 0.0087F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(102, 10).addBox(-0.5114F, -2.0943F, -0.2829F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1891F, 0.1166F, -8.2316F, 1.7622F, 0.0408F, -0.0077F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(45, 96).addBox(-0.5114F, -1.6577F, -0.8505F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1891F, 0.1166F, -8.2316F, 1.1338F, 0.0408F, -0.0077F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(49, 111).addBox(-1.0F, -0.0771F, -0.1182F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.1433F, -9.6625F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(105, 113).addBox(-0.5F, -2.2475F, -0.987F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4433F, -8.7625F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(14, 112).addBox(-0.5F, -0.0874F, -0.222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4103F, -6.9921F, 1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(110, 113).addBox(-0.5F, -1.09F, -1.0514F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1433F, -7.6625F, 2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(22, 117).addBox(-0.5F, -1.9865F, -0.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2433F, -7.6625F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(17, 117).addBox(-0.5F, -0.1252F, 0.8483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.8433F, -10.5625F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(111, 46).addBox(-1.0F, -0.1045F, -0.0404F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2433F, -8.7625F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(99, 19).addBox(-1.0F, -0.0448F, -1.9543F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3567F, -5.6625F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(62, 0).addBox(-1.5F, -7.6F, 0.9F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.005F))
				.texOffs(38, 49).addBox(-2.5F, -7.2F, 0.1F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(17, 59).addBox(-3.0F, -7.2F, 3.1F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0433F, -2.4625F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.274F, -0.7211F, -0.6148F, -1.2654F, 0.0349F, 0.0F));

		PartDefinition cube_r232 = leftCheek.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(111, 50).addBox(-0.1154F, 0.6465F, -2.6507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(102, 109).addBox(-0.1154F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.526F, -0.8982F, 2.637F, 0.2579F, 0.6816F, 0.4262F));

		PartDefinition cube_r233 = leftCheek.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(119, 80).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0263F, -0.8398F, 2.6179F, 0.764F, 0.6816F, 0.4262F));

		PartDefinition cube_r234 = leftCheek.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(111, 38).addBox(-0.8737F, -0.9717F, -1.9541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.326F, -0.2982F, 2.637F, 1.3306F, 0.6867F, 0.4214F));

		PartDefinition cube_r235 = leftCheek.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(107, 86).addBox(-0.8737F, -1.4468F, -3.8576F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.326F, -0.2982F, 2.637F, 1.0513F, 0.6867F, 0.4214F));

		PartDefinition cube_r236 = leftCheek.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(115, 16).addBox(-1.642F, -2.1953F, -0.5305F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.726F, 1.3018F, 0.437F, 0.4499F, 0.6816F, 0.4262F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.274F, -0.7211F, -0.6148F, -1.2654F, -0.0349F, 0.0F));

		PartDefinition cube_r237 = rightCheek.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(111, 50).mirror().addBox(-0.8846F, 0.6465F, -2.6507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(102, 109).mirror().addBox(-0.8846F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.526F, -0.8982F, 2.637F, 0.2579F, -0.6816F, -0.4262F));

		PartDefinition cube_r238 = rightCheek.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(119, 80).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0263F, -0.8398F, 2.6179F, 0.764F, -0.6816F, -0.4262F));

		PartDefinition cube_r239 = rightCheek.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(111, 38).mirror().addBox(-0.1263F, -0.9717F, -1.9541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.326F, -0.2982F, 2.637F, 1.3306F, -0.6867F, -0.4214F));

		PartDefinition cube_r240 = rightCheek.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(107, 86).mirror().addBox(-0.1263F, -1.4468F, -3.8576F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.326F, -0.2982F, 2.637F, 1.0513F, -0.6867F, -0.4214F));

		PartDefinition cube_r241 = rightCheek.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(115, 16).mirror().addBox(0.642F, -2.1953F, -0.5305F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.726F, 1.3018F, 0.437F, 0.4499F, -0.6816F, -0.4262F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offset(0.4296F, 6.8558F, -8.2316F));

		PartDefinition cube_r242 = leftBeak.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(84, 37).addBox(-0.2434F, -0.0002F, -0.9978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3875F, -0.8788F, 0.5592F, -1.3476F, 0.0699F, 0.0695F));

		PartDefinition cube_r243 = leftBeak.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(81, 119).addBox(-0.2315F, -0.0006F, -0.9965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1023F, -1.4253F, 1.2986F, -0.8681F, 0.2532F, -0.0361F));

		PartDefinition cube_r244 = leftBeak.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(104, 76).addBox(-1.4458F, -2.1373F, -0.049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5704F, 0.1066F, -2.0304F, 0.0662F, 0.0699F, 0.0695F));

		PartDefinition cube_r245 = leftBeak.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(12, 116).addBox(-1.2852F, -1.9706F, -0.0906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -0.1934F, -0.0304F, 1.061F, 0.0699F, 0.0695F));

		PartDefinition cube_r246 = leftBeak.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(98, 116).addBox(-1.3697F, 0.0628F, -0.0522F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -1.0934F, -2.1304F, 0.6945F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offset(-0.4296F, 6.8558F, -8.2316F));

		PartDefinition cube_r247 = rightBeak.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(84, 37).mirror().addBox(-0.7566F, -0.0002F, -0.9978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3875F, -0.8788F, 0.5592F, -1.3476F, -0.0699F, -0.0695F));

		PartDefinition cube_r248 = rightBeak.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(81, 119).mirror().addBox(-0.7685F, -0.0006F, -0.9965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1023F, -1.4253F, 1.2986F, -0.8681F, -0.2532F, 0.0361F));

		PartDefinition cube_r249 = rightBeak.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(104, 76).mirror().addBox(0.4458F, -2.1373F, -0.049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, 0.1066F, -2.0304F, 0.0662F, -0.0699F, -0.0695F));

		PartDefinition cube_r250 = rightBeak.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(12, 116).mirror().addBox(0.2852F, -1.9706F, -0.0906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.1934F, -0.0304F, 1.061F, -0.0699F, -0.0695F));

		PartDefinition cube_r251 = rightBeak.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(98, 116).mirror().addBox(0.3697F, 0.0628F, -0.0522F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.0934F, -2.1304F, 0.6945F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(53, 61).addBox(-2.0F, -3.6916F, 0.4171F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.3707F, 0.2408F, 0.0193F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(107, 70).addBox(-2.0F, -1.0082F, -1.9769F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1227F, -8.2919F, 0.88F, 2.9665F, 0.2598F, -0.2667F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(68, 112).addBox(-1.0F, -1.0082F, -1.9769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1227F, -8.2919F, 0.88F, -3.1247F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(109, 91).addBox(-2.0F, 0.0035F, -0.984F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1227F, -9.0919F, 2.58F, 0.1978F, 0.0676F, -0.3249F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(7, 116).addBox(-1.0F, -0.0172F, -1.0818F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1227F, -9.0919F, 2.68F, 0.2088F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(111, 10).addBox(-2.0F, -0.0591F, -0.8974F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1227F, -8.7919F, 1.58F, 0.7047F, 0.2195F, -0.2506F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(116, 54).addBox(-1.0F, -0.5716F, -1.9159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1227F, -9.0919F, 2.68F, 0.7324F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(102, 42).addBox(-1.37F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(96, 57).addBox(-1.73F, -1.15F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(102, 51).addBox(-1.06F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(108, 18).addBox(0.3455F, -0.7699F, 0.0172F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.7415F, 1.7781F, 0.4887F, 0.2094F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(120, 28).addBox(-0.9F, -0.8841F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.2F, 0.7F, 2.2515F, 0.0349F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(15, 121).addBox(-0.9F, -2.2625F, -0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 121).addBox(-0.9F, -1.6625F, -0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4F, -0.2F, 0.7F, 1.5708F, 0.0349F, 0.0F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(118, 50).addBox(-0.5F, -0.9805F, -0.0262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -1.2F, 1.0F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(56, 111).addBox(-0.9F, -3.9609F, -0.1821F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.2F, 0.7F, 1.6057F, 0.0175F, -0.0006F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(119, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9335F, -0.5734F, -3.3621F, 1.0644F, 0.2276F, -0.0766F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(40, 117).addBox(-1.0F, -0.0016F, 0.0346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -2.4F, -4.4F, 0.1219F, 0.2276F, -0.0766F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(111, 42).addBox(-0.5F, -0.6492F, 0.5199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2627F, -2.3067F, 3.2352F, 0.3521F, 0.2074F, 0.0296F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -0.5904F, -3.2246F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2627F, -2.3067F, 3.2352F, 0.5092F, 0.2074F, 0.0296F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(36, 85).addBox(-1.1906F, -0.4483F, 0.0051F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -8.8497F, 3.8393F, -0.0933F, 0.1585F, 0.0093F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(41, 17).addBox(-3.9567F, 0.0011F, -0.0314F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4338F, -9.8281F, 3.2814F, 0.0281F, 0.1221F, -0.1751F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(96, 72).addBox(-2.9159F, -0.1184F, -2.1516F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4338F, -9.6281F, 3.5814F, 0.6633F, 0.1179F, -0.1826F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(88, 109).addBox(0.7286F, -0.5924F, -0.6146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3662F, -8.4281F, 3.2814F, 0.7845F, 0.3333F, 0.0117F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 67).addBox(-0.8752F, -0.0886F, -0.0391F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -9.8497F, 6.4393F, -0.3473F, 0.7059F, -0.1749F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(96, 67).addBox(-2.0736F, -0.8217F, 0.0997F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -8.8497F, 3.8393F, 0.0819F, 0.1401F, -0.2066F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(53, 61).mirror().addBox(0.0F, -3.6916F, 0.4171F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.3707F, -0.2408F, -0.0193F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(107, 70).mirror().addBox(0.0F, -1.0082F, -1.9769F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1227F, -8.2919F, 0.88F, 2.9665F, -0.2598F, 0.2667F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(68, 112).mirror().addBox(0.0F, -1.0082F, -1.9769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1227F, -8.2919F, 0.88F, -3.1247F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(109, 91).mirror().addBox(0.0F, 0.0035F, -0.984F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1227F, -9.0919F, 2.58F, 0.1978F, -0.0676F, 0.3249F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(7, 116).mirror().addBox(0.0F, -0.0172F, -1.0818F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1227F, -9.0919F, 2.68F, 0.2088F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(111, 10).mirror().addBox(0.0F, -0.0591F, -0.8974F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1227F, -8.7919F, 1.58F, 0.7047F, -0.2195F, 0.2506F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(116, 54).mirror().addBox(0.0F, -0.5716F, -1.9159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1227F, -9.0919F, 2.68F, 0.7324F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(102, 42).mirror().addBox(-0.63F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(96, 57).mirror().addBox(-1.27F, -1.15F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(102, 51).mirror().addBox(-0.94F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(108, 18).mirror().addBox(-0.3455F, -0.7699F, 0.0172F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.7415F, 1.7781F, 0.4887F, -0.2094F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(120, 28).mirror().addBox(-0.1F, -0.8841F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.2F, 0.7F, 2.2515F, -0.0349F, 0.0F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(15, 121).mirror().addBox(-0.1F, -2.2625F, -0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 121).mirror().addBox(-0.1F, -1.6625F, -0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.2F, 0.7F, 1.5708F, -0.0349F, 0.0F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(118, 50).mirror().addBox(-0.5F, -0.9805F, -0.0262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -1.2F, 1.0F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(56, 111).mirror().addBox(-0.1F, -3.9609F, -0.1821F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.2F, 0.7F, 1.6057F, -0.0175F, 0.0006F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(119, 83).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.9335F, -0.5734F, -3.3621F, 1.0644F, -0.2276F, 0.0766F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(40, 117).mirror().addBox(0.0F, -0.0016F, 0.0346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -2.4F, -4.4F, 0.1219F, -0.2276F, 0.0766F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(111, 42).mirror().addBox(-0.5F, -0.6492F, 0.5199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2627F, -2.3067F, 3.2352F, 0.3521F, -0.2074F, -0.0296F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.5F, -0.5904F, -3.2246F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2627F, -2.3067F, 3.2352F, 0.5092F, -0.2074F, -0.0296F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(36, 85).mirror().addBox(0.1906F, -0.4483F, 0.0051F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -8.8497F, 3.8393F, -0.0933F, -0.1585F, -0.0093F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(41, 17).mirror().addBox(-0.0433F, 0.0011F, -0.0314F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4338F, -9.8281F, 3.2814F, 0.0281F, -0.1221F, 0.1751F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(96, 72).mirror().addBox(-0.0841F, -0.1184F, -2.1516F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4338F, -9.6281F, 3.5814F, 0.6633F, -0.1179F, 0.1826F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(88, 109).mirror().addBox(-1.7286F, -0.5924F, -0.6146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3662F, -8.4281F, 3.2814F, 0.7845F, -0.3333F, -0.0117F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.1248F, -0.0886F, -0.0391F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -9.8497F, 6.4393F, -0.3473F, -0.7059F, 0.1749F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(96, 67).mirror().addBox(0.0736F, -0.8217F, 0.0997F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -8.8497F, 3.8393F, 0.0819F, -0.1401F, 0.2066F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.1994F, -0.995F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(65, 97).mirror().addBox(0.0F, -1.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0701F, 2.107F, -1.1612F, -0.8674F, -0.0881F, -0.138F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(118, 34).mirror().addBox(0.1921F, 0.113F, -0.0414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2164F, 3.6547F, -2.4973F, -0.1723F, -0.0386F, -0.159F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(97, 120).mirror().addBox(0.5722F, -1.527F, -1.3919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(118, 38).mirror().addBox(0.5722F, -2.027F, -0.9919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2164F, 6.1547F, -2.0973F, -0.9926F, -0.0386F, -0.159F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.2216F, -0.1671F, 0.1743F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0164F, 2.2547F, -1.0973F, -0.6086F, -0.0386F, -0.159F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(35, 108).mirror().addBox(-0.2216F, 0.0329F, -0.0257F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0164F, 2.2547F, -1.0973F, -0.7657F, -0.0386F, -0.159F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(76, 118).mirror().addBox(-0.5534F, -2.6758F, -0.8738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9811F, 1.5435F, 0.7915F, -1.2226F, -0.116F, -0.1593F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-0.5534F, -2.5629F, 0.426F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9811F, 1.5435F, 0.7915F, -0.7514F, -0.116F, -0.1593F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(23, 109).mirror().addBox(-0.3339F, 0.1888F, -1.9683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2811F, 2.0435F, 2.2915F, -0.8561F, -0.116F, -0.1593F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(107, 64).mirror().addBox(-0.2643F, -0.9292F, -0.0735F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2811F, 1.1435F, 0.0915F, -0.7707F, -0.0502F, -0.209F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(120, 102).mirror().addBox(-0.7488F, -0.3961F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 0.1547F, -0.9973F, -0.1392F, -0.0855F, -0.1974F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(47, 115).mirror().addBox(-0.7338F, -3.2252F, -1.0587F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.4547F, 1.8027F, 0.7335F, -0.0855F, -0.1974F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(28, 115).mirror().addBox(-0.7338F, -3.234F, 0.1117F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.4547F, 1.8027F, 1.1F, -0.0855F, -0.1974F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(65, 97).addBox(0.0F, -1.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8702F, 2.107F, -1.1612F, -0.8674F, 0.0881F, 0.138F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(118, 34).addBox(-1.1921F, 0.113F, -0.0414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0165F, 3.6547F, -2.4973F, -0.1723F, 0.0386F, 0.159F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(97, 120).addBox(-1.5722F, -1.527F, -1.3919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(118, 38).addBox(-1.5722F, -2.027F, -0.9919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0165F, 6.1547F, -2.0973F, -0.9926F, 0.0386F, 0.159F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 109).addBox(-0.7784F, -0.1671F, 0.1743F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8165F, 2.2547F, -1.0973F, -0.6086F, 0.0386F, 0.159F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(35, 108).addBox(-0.7784F, 0.0329F, -0.0257F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8165F, 2.2547F, -1.0973F, -0.7657F, 0.0386F, 0.159F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(76, 118).addBox(-0.4466F, -2.6758F, -0.8738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7811F, 1.5435F, 0.7915F, -1.2226F, 0.116F, 0.1593F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 117).addBox(-0.4466F, -2.5629F, 0.426F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7811F, 1.5435F, 0.7915F, -0.7514F, 0.116F, 0.1593F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(23, 109).addBox(-0.6661F, 0.1888F, -1.9683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0811F, 2.0435F, 2.2915F, -0.8561F, 0.116F, 0.1593F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(107, 64).addBox(-0.7357F, -0.9292F, -0.0735F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0811F, 1.1435F, 0.0915F, -0.7707F, 0.0502F, 0.209F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(120, 102).addBox(-0.2512F, -0.3961F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7165F, 0.1547F, -0.9973F, -0.1392F, 0.0855F, 0.1974F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(47, 115).addBox(-0.2662F, -3.2252F, -1.0587F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7165F, 1.4547F, 1.8027F, 0.7335F, 0.0855F, 0.1974F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(28, 115).addBox(-0.2662F, -3.234F, 0.1117F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.4547F, 1.8027F, 1.1F, 0.0855F, 0.1974F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0967F, 5.2221F, -2.2912F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r322 = leftLowerbeak.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(112, 98).addBox(-1.0F, -1.0953F, -0.8971F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.0123F, 0.0873F, 0.0F));

		PartDefinition cube_r323 = leftLowerbeak.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(115, 103).addBox(-1.0F, 0.8203F, -0.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.4661F, 0.0873F, 0.0F));

		PartDefinition cube_r324 = leftLowerbeak.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(118, 76).addBox(-1.3312F, -1.6997F, -0.2256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, -0.9786F, -3.8682F, -2.234F, 0.0873F, 0.0F));

		PartDefinition cube_r325 = leftLowerbeak.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(66, 118).addBox(-1.0F, 2.0724F, 0.5434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.9548F, 0.0873F, 0.0F));

		PartDefinition cube_r326 = leftLowerbeak.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(108, 118).addBox(-1.0F, 0.7515F, 0.4517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.8326F, 0.0873F, 0.0F));

		PartDefinition cube_r327 = leftLowerbeak.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(115, 113).addBox(-1.09F, -0.7301F, 0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.4681F, 0.0343F, -0.0455F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2967F, 5.2221F, -2.2912F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r328 = rightLowerbeak.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(112, 98).mirror().addBox(0.0F, -1.0953F, -0.8971F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.0123F, -0.0873F, 0.0F));

		PartDefinition cube_r329 = rightLowerbeak.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(115, 103).mirror().addBox(0.0F, 0.8203F, -0.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.4661F, -0.0873F, 0.0F));

		PartDefinition cube_r330 = rightLowerbeak.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(118, 76).mirror().addBox(0.3312F, -1.6997F, -0.2256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.9786F, -3.8682F, -2.234F, -0.0873F, 0.0F));

		PartDefinition cube_r331 = rightLowerbeak.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(66, 118).mirror().addBox(0.0F, 2.0724F, 0.5434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.9548F, -0.0873F, 0.0F));

		PartDefinition cube_r332 = rightLowerbeak.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(108, 118).mirror().addBox(0.0F, 0.7515F, 0.4517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.8326F, -0.0873F, 0.0F));

		PartDefinition cube_r333 = rightLowerbeak.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(115, 113).mirror().addBox(0.09F, -0.7301F, 0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.4681F, -0.0343F, 0.0455F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8567F, -2.0625F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r334 = frill.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(120, 14).addBox(-0.5F, -1.9F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(10, 120).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(5, 120).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.55F, 1.6115F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r335 = frill.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(21, 98).addBox(-0.5F, -8.7425F, 0.0464F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6953F, 1.0315F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r336 = frill.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(60, 89).addBox(-1.5F, -5.4264F, -2.5807F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6015F, 1.5349F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r337 = frill.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(36, 100).addBox(-4.9F, 0.3384F, -2.5544F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, -9.8885F, 8.7572F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r338 = frill.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(119, 95).mirror().addBox(-0.6F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, -11.1903F, 7.1673F, -0.5191F, -0.4333F, -0.6337F));

		PartDefinition cube_r339 = frill.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(119, 95).addBox(-0.4F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7564F, -11.1903F, 7.1673F, -0.5191F, 0.4333F, 0.6337F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2589F, -6.4283F, 4.8516F, -0.2906F, -0.4787F, 0.2378F));

		PartDefinition cube_r340 = leftFrill.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(63, 105).addBox(-2.2F, -0.5F, -0.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9885F, 2.0697F, -1.9428F, -0.4457F, 0.0502F, 0.3268F));

		PartDefinition cube_r341 = leftFrill.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(98, 84).addBox(-2.0F, -2.5F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7459F, 3.7253F, -1.64F, -0.0075F, -0.2318F, -0.9756F));

		PartDefinition cube_r342 = leftFrill.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(87, 48).addBox(-4.9413F, -2.864F, 0.0376F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4273F, 5.4607F, -2.4483F, -0.3462F, -0.1492F, 0.1747F));

		PartDefinition cube_r343 = leftFrill.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(71, 118).addBox(2.6026F, 2.4409F, 0.0056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(7, 112).addBox(1.0026F, 2.3409F, 0.0056F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.5273F, 1.1607F, -0.5483F, -0.3719F, 0.1163F, 1.0388F));

		PartDefinition cube_r344 = leftFrill.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(16, 94).addBox(-2.5F, -1.5F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.3297F, 0.6914F, -0.3908F, -0.074F, 0.3412F, 1.8235F));

		PartDefinition cube_r345 = leftFrill.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(52, 119).addBox(1.3333F, -0.4301F, -0.3648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(112, 95).addBox(-0.6667F, -0.4301F, -0.3648F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(92, 101).addBox(-1.1667F, -0.0301F, -0.3648F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6273F, -1.4393F, 0.5517F, -0.2918F, 0.2666F, 1.2784F));

		PartDefinition cube_r346 = leftFrill.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(75, 115).addBox(-0.2433F, -0.4174F, 0.0056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(115, 31).addBox(1.7567F, -0.5174F, 0.0056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(100, 47).addBox(-0.1433F, -0.0174F, 0.0056F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.5273F, 1.1607F, -0.5483F, -0.2177F, 0.3248F, 1.7142F));

		PartDefinition cube_r347 = leftFrill.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(119, 0).addBox(2.0068F, -1.2899F, -0.3024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(75, 112).addBox(3.3068F, -1.2899F, -0.3024F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4542F, -5.8795F, 0.9388F, -0.4838F, 0.0634F, 0.7659F));

		PartDefinition cube_r348 = leftFrill.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(102, 6).addBox(1.912F, -0.9086F, -0.1692F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4542F, -5.8795F, 0.9388F, -0.3976F, 0.0955F, 0.7524F));

		PartDefinition cube_r349 = leftFrill.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(86, 120).addBox(0.5786F, -0.4605F, -0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(112, 0).addBox(0.0786F, -0.0605F, -0.0207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4542F, -5.8795F, 0.9388F, -0.3802F, 0.0047F, 0.3566F));

		PartDefinition cube_r350 = leftFrill.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(30, 109).addBox(-0.8611F, -3.3761F, -0.2111F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9168F, -5.9576F, 1.2571F, -0.351F, 0.0755F, 0.2425F));

		PartDefinition cube_r351 = leftFrill.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(113, 4).addBox(-0.4139F, -6.3942F, -0.2111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9168F, -5.9576F, 1.2571F, -0.3575F, 0.03F, 0.1196F));

		PartDefinition cube_r352 = leftFrill.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(35, 113).addBox(0.6174F, -6.2351F, -0.2111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9168F, -5.9576F, 1.2571F, -0.3574F, -0.0312F, -0.0439F));

		PartDefinition cube_r353 = leftFrill.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(9, 76).addBox(-0.296F, -3.6113F, -0.2111F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9168F, -5.9576F, 1.2571F, -0.3532F, 0.0634F, 0.2097F));

		PartDefinition cube_r354 = leftFrill.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(107, 56).addBox(-3.5F, 1.2F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.772F, -0.8215F, -0.3458F, -0.1895F, -0.363F, -0.7284F));

		PartDefinition cube_r355 = leftFrill.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(84, 33).addBox(-3.5F, -0.1F, -0.3F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(2.772F, -0.8215F, -0.3458F, 0.0831F, -0.3994F, -1.4346F));

		PartDefinition cube_r356 = leftFrill.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(52, 107).addBox(-4.0F, -2.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7971F, -1.1815F, -0.043F, 0.1264F, -0.2996F, -2.1305F));

		PartDefinition cube_r357 = leftFrill.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(89, 43).addBox(-5.1F, -1.6F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.113F, -3.5754F, 0.7059F, -0.0885F, -0.3125F, -1.443F));

		PartDefinition cube_r358 = leftFrill.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(100, 38).addBox(-2.2F, -1.4F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5165F, -3.3995F, 0.6267F, -0.2842F, -0.1586F, -0.6488F));

		PartDefinition cube_r359 = leftFrill.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(95, 109).addBox(0.0642F, -0.3081F, -0.0864F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5615F, -5.5945F, 0.9846F, -0.3318F, 0.033F, -0.0114F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2589F, -6.4283F, 4.8516F, -0.2906F, 0.4787F, -0.2378F));

		PartDefinition cube_r360 = rightFrill.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(63, 105).mirror().addBox(-0.8F, -0.5F, -0.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9885F, 2.0697F, -1.9428F, -0.4457F, -0.0502F, -0.3268F));

		PartDefinition cube_r361 = rightFrill.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(98, 84).mirror().addBox(-1.0F, -2.5F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7459F, 3.7253F, -1.64F, -0.0075F, 0.2318F, 0.9756F));

		PartDefinition cube_r362 = rightFrill.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(87, 48).mirror().addBox(-0.0587F, -2.864F, 0.0376F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4273F, 5.4607F, -2.4483F, -0.3462F, 0.1492F, -0.1747F));

		PartDefinition cube_r363 = rightFrill.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(71, 118).mirror().addBox(-3.6026F, 2.4409F, 0.0056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(7, 112).mirror().addBox(-3.0026F, 2.3409F, 0.0056F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.5273F, 1.1607F, -0.5483F, -0.3719F, -0.1163F, -1.0388F));

		PartDefinition cube_r364 = rightFrill.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(16, 94).mirror().addBox(-2.5F, -1.5F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.3297F, 0.6914F, -0.3908F, -0.074F, -0.3412F, -1.8235F));

		PartDefinition cube_r365 = rightFrill.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(52, 119).mirror().addBox(-2.3333F, -0.4301F, -0.3648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(112, 95).mirror().addBox(-1.3333F, -0.4301F, -0.3648F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(92, 101).mirror().addBox(-2.8333F, -0.0301F, -0.3648F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6273F, -1.4393F, 0.5517F, -0.2918F, -0.2666F, -1.2784F));

		PartDefinition cube_r366 = rightFrill.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(75, 115).mirror().addBox(-1.7567F, -0.4174F, 0.0056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(115, 31).mirror().addBox(-3.7567F, -0.5174F, 0.0056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(100, 47).mirror().addBox(-3.8567F, -0.0174F, 0.0056F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.5273F, 1.1607F, -0.5483F, -0.2177F, -0.3248F, -1.7142F));

		PartDefinition cube_r367 = rightFrill.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-3.0068F, -1.2899F, -0.3024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(75, 112).mirror().addBox(-5.3068F, -1.2899F, -0.3024F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4542F, -5.8795F, 0.9388F, -0.4838F, -0.0634F, -0.7659F));

		PartDefinition cube_r368 = rightFrill.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(102, 6).mirror().addBox(-5.912F, -0.9086F, -0.1692F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4542F, -5.8795F, 0.9388F, -0.3976F, -0.0955F, -0.7524F));

		PartDefinition cube_r369 = rightFrill.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(86, 120).mirror().addBox(-1.5786F, -0.4605F, -0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(112, 0).mirror().addBox(-2.0786F, -0.0605F, -0.0207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4542F, -5.8795F, 0.9388F, -0.3802F, -0.0047F, -0.3566F));

		PartDefinition cube_r370 = rightFrill.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(30, 109).mirror().addBox(-0.1389F, -3.3761F, -0.2111F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9168F, -5.9576F, 1.2571F, -0.351F, -0.0755F, -0.2425F));

		PartDefinition cube_r371 = rightFrill.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(113, 4).mirror().addBox(-0.5861F, -6.3942F, -0.2111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9168F, -5.9576F, 1.2571F, -0.3575F, -0.03F, -0.1196F));

		PartDefinition cube_r372 = rightFrill.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(35, 113).mirror().addBox(-1.6174F, -6.2351F, -0.2111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9168F, -5.9576F, 1.2571F, -0.3574F, 0.0312F, 0.0439F));

		PartDefinition cube_r373 = rightFrill.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(9, 76).mirror().addBox(-0.704F, -3.6113F, -0.2111F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9168F, -5.9576F, 1.2571F, -0.3532F, -0.0634F, -0.2097F));

		PartDefinition cube_r374 = rightFrill.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(107, 56).mirror().addBox(0.5F, 1.2F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.772F, -0.8215F, -0.3458F, -0.1895F, 0.363F, 0.7284F));

		PartDefinition cube_r375 = rightFrill.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(84, 33).mirror().addBox(-2.5F, -0.1F, -0.3F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-2.772F, -0.8215F, -0.3458F, 0.0831F, 0.3994F, 1.4346F));

		PartDefinition cube_r376 = rightFrill.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(52, 107).mirror().addBox(1.0F, -2.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7971F, -1.1815F, -0.043F, 0.1264F, 0.2996F, 2.1305F));

		PartDefinition cube_r377 = rightFrill.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(89, 43).mirror().addBox(0.1F, -1.6F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.113F, -3.5754F, 0.7059F, -0.0885F, 0.3125F, 1.443F));

		PartDefinition cube_r378 = rightFrill.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(100, 38).mirror().addBox(-1.8F, -1.4F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5165F, -3.3995F, 0.6267F, -0.2842F, 0.1586F, 0.6488F));

		PartDefinition cube_r379 = rightFrill.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(95, 109).mirror().addBox(-2.0642F, -0.3081F, -0.0864F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5615F, -5.5945F, 0.9846F, -0.3318F, -0.033F, 0.0114F));

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