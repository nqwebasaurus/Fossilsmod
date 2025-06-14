package fossils.fossils.client.blockentity.model.centrosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CentrosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart rightFace;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart leftLowerbeak3;
	private final ModelPart rightLowerbeak;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public CentrosaurusFossilModel(ModelPart root) {
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
		this.rightFace = this.head.getChild("rightFace");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.5695F, -4.9874F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -26.3F, 6.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 4).addBox(0.0F, -1.3F, -7.8F, 0.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3574F, 3.046F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(-0.4211F, 1.0393F, -0.8595F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.5347F, -0.2679F, 0.2106F, -0.0573F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 42).mirror().addBox(-0.5513F, 0.1098F, 0.8523F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.2583F, -2.3967F, -0.3665F, 0.2618F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.5F, -1.7F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5683F, 6.8317F, 10.1424F, 0.3609F, 0.2608F, 0.0233F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 44).mirror().addBox(0.0931F, -0.3231F, -0.0422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 3.3248F, 7.5219F, -0.73F, 0.2608F, 0.0233F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.6031F, -0.6897F, -0.0732F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0248F, 3.1219F, -0.5554F, 0.2608F, 0.0233F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 25).mirror().addBox(-0.0513F, -0.3209F, -0.7583F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.2752F, 1.5219F, -0.4538F, 0.2618F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(79, 59).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.449F, -0.6098F, 2.5909F, -1.0123F, 0.2618F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(92, 30).mirror().addBox(-0.6F, -3.6241F, -5.3343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.1347F, 1.0736F, 0.0518F, 0.0073F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 54).mirror().addBox(-0.6F, -3.5303F, -5.1626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.1347F, 0.8118F, 0.0518F, 0.0073F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(-0.6F, -0.5675F, -7.3923F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(55, 65).mirror().addBox(-0.6F, 0.4325F, -5.0923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.1347F, 0.2009F, 0.0518F, 0.0073F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.5513F, -0.5553F, -0.553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.2583F, -2.3967F, -0.8901F, 0.2618F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(86, 65).mirror().addBox(-0.6F, -0.908F, -3.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5358F, -1.1347F, 0.6372F, 0.0518F, 0.0073F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.499F, -0.4002F, -2.5068F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -3.9154F, -5.814F, 0.2177F, 0.3006F, 0.0547F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 88).mirror().addBox(-0.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -4.1581F, -1.7218F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-0.2F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4116F, -1.6675F, 0.1841F, -0.3276F, 0.0404F, -0.1367F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(58, 42).mirror().addBox(-0.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(58, 42).addBox(6.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, -3.0439F, 4.9247F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(92, 5).mirror().addBox(-0.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 5).addBox(6.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -4.143F, 6.3942F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(99, 2).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 2).addBox(6.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -3.2994F, 8.4747F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(11, 55).mirror().addBox(-0.1121F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 23).mirror().addBox(-0.1121F, -0.1296F, -0.1578F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -4.9154F, -2.414F, -0.0014F, -0.0492F, -0.0211F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 86).mirror().addBox(-4.0F, -0.8383F, -0.9482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-1.0F, 0.5781F, -2.7921F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -3.6532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(11, 55).addBox(-0.8879F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(55, 23).addBox(-0.8879F, -0.1296F, -0.1578F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -4.9154F, -2.414F, -0.0014F, 0.0492F, 0.0211F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 59).addBox(-0.501F, -0.4002F, -2.5068F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -3.9154F, -5.814F, 0.2177F, -0.3006F, -0.0547F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 86).addBox(3.0F, -0.8383F, -0.9482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -4.0F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -1.7F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5683F, 6.8317F, 10.1424F, 0.3609F, -0.2608F, -0.0233F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(87, 44).addBox(-1.0931F, -0.3231F, -0.0422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8F, 3.3248F, 7.5219F, -0.73F, -0.2608F, -0.0233F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 67).addBox(-0.3969F, -0.6897F, -0.0732F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.0248F, 3.1219F, -0.5554F, -0.2608F, -0.0233F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(79, 59).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.449F, -0.6098F, 2.5909F, -1.0123F, -0.2618F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(88, 25).addBox(-0.9487F, -0.3209F, -0.7583F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, -0.2752F, 1.5219F, -0.4538F, -0.2618F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(53, 42).addBox(-0.4487F, 0.1098F, 0.8523F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, -1.2583F, -2.3967F, -0.3665F, -0.2618F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(78, 0).addBox(-0.4487F, -0.5553F, -0.553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -1.2583F, -2.3967F, -0.8901F, -0.2618F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(74, 74).addBox(-0.5789F, 1.0393F, -0.8595F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.5347F, -0.2679F, -0.2106F, 0.0573F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(86, 65).addBox(-0.4F, -0.908F, -3.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.1347F, 0.6372F, -0.0518F, -0.0073F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(92, 30).addBox(-0.4F, -3.6241F, -5.3343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.1347F, 1.0736F, -0.0518F, -0.0073F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(95, 54).addBox(-0.4F, -3.5303F, -5.1626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.1347F, 0.8118F, -0.0518F, -0.0073F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(80, 89).addBox(-0.4F, -0.5675F, -7.3923F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(55, 65).addBox(-0.4F, 0.4325F, -5.0923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4F, -1.5358F, -1.1347F, 0.2009F, -0.0518F, -0.0073F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 15).addBox(-0.8F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4116F, -1.6675F, 0.1841F, -0.3276F, -0.0404F, 0.1367F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, 0.5781F, -2.7921F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.6532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(67, 88).addBox(-0.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5F, -4.1581F, -1.7218F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(22, 62).addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -0.4967F, 0.2206F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftleg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(76, 36).addBox(0.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftleg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(64, 31).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftleg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftleg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(13, 71).addBox(-0.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7762F, -4.4099F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftleg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(5, 93).addBox(-0.1F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(15, 84).addBox(-0.1F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftleg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(74, 26).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftleg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(86, 78).addBox(-1.601F, 4.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 89).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftleg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(85, 0).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6865F, 4.6725F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftleg3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(82, 15).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(90, 60).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftfoot.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(78, 65).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(50, 35).addBox(-1.999F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, -0.2793F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(60, 5).addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9F, -0.5967F, 0.2206F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightleg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(41, 75).addBox(-3.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightleg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(64, 22).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightleg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightleg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(25, 69).addBox(-1.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7762F, -4.4099F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightleg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(92, 0).addBox(-0.9F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(56, 81).addBox(-0.9F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightleg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(74, 18).addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightleg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(73, 86).addBox(-0.399F, 4.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 89).addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightleg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6865F, 4.6725F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightleg3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(10, 41).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(88, 20).addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightfoot.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 72).addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(44, 49).addBox(-2.001F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, 0.3752F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9194F, -4.923F, 0.1398F, -0.0432F, -0.0061F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(58, 99).addBox(0.0F, -2.8616F, -4.6978F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 46).addBox(0.0F, -2.2616F, -6.6978F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7184F, 1.8039F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(9, 6).addBox(0.0F, -3.6694F, -0.1443F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3184F, -10.6961F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -3.6694F, -0.1443F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3184F, -8.6961F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(26, 4).addBox(0.0F, -3.6764F, -0.1077F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3816F, -6.6961F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(30, 4).mirror().addBox(-5.133F, -3.7878F, -3.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.0569F, 0.4438F, -1.4129F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(71, 7).mirror().addBox(-5.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.0609F, -0.0609F, -1.3877F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(-4.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.3089F, -0.3337F, -0.8062F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(9, 59).mirror().addBox(-2.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.9816F, -2.5961F, -0.4817F, -0.1723F, -0.2638F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.1386F, -0.1535F, -0.8476F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-2.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.2446F, -0.1044F, -0.2967F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-5.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0419F, 0.0421F, -1.3878F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-10.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0434F, 0.2688F, -1.3976F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-12.3996F, -3.7378F, -2.5366F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0006F, 0.4222F, -1.3812F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(30, 13).mirror().addBox(-6.81F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0005F, 0.1778F, -1.3814F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 38).mirror().addBox(-4.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0108F, 0.0177F, -0.8578F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(8, 67).mirror().addBox(-2.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0554F, -0.0092F, -0.3139F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(97, 5).mirror().addBox(-2.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.2547F, 0.0552F, -0.3093F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-3.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.1494F, 0.1755F, -0.8443F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(44, 29).mirror().addBox(-6.1529F, -3.8689F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0415F, 0.2961F, -1.3735F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-12.0038F, -3.8478F, -1.5367F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0441F, 0.4531F, -1.3663F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(32, 33).mirror().addBox(-14.8804F, -3.7351F, -0.4699F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.0849F, 0.4316F, -1.3621F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(94, 9).mirror().addBox(-4.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.2959F, 0.3297F, -0.8075F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(93, 78).mirror().addBox(-2.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.4555F, 0.1174F, -0.2919F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(8, 67).addBox(0.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0554F, 0.0092F, 0.3139F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(64, 38).addBox(2.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0108F, -0.0177F, 0.8578F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(74, 32).addBox(6.3996F, -3.7378F, -2.5366F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0006F, -0.4222F, 1.3812F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(30, 13).addBox(2.81F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.7961F, 0.0005F, -0.1778F, 1.3814F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(71, 53).addBox(6.0038F, -3.8478F, -1.5367F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0441F, -0.4531F, 1.3663F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(44, 29).addBox(2.1529F, -3.8689F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.0415F, -0.2961F, 1.3735F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(67, 46).addBox(1.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.1494F, -0.1755F, 0.8443F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(97, 5).addBox(0.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0816F, -8.6961F, 0.2547F, -0.0552F, 0.3093F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(32, 33).addBox(2.8804F, -3.7351F, -0.4699F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.0849F, -0.4316F, 1.3621F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(94, 9).addBox(2.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.2959F, -0.3297F, 0.8075F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(93, 78).addBox(0.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4816F, -10.8961F, 0.4555F, -0.1174F, 0.2919F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(71, 7).addBox(2.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.0609F, 0.0609F, 1.3877F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(30, 4).addBox(4.133F, -3.7878F, -3.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.0569F, -0.4438F, 1.4129F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(63, 12).addBox(2.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.3089F, 0.3337F, 0.8062F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(9, 59).addBox(0.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9816F, -2.5961F, -0.4817F, 0.1723F, 0.2638F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 25).addBox(5.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0434F, -0.2688F, 1.3976F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(77, 34).addBox(2.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.0419F, -0.0421F, 1.3878F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(96, 19).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.1386F, 0.1535F, 0.8476F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(12, 95).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, 0.3731F, -10.4594F, 0.429F, -0.1843F, 0.5459F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(48, 95).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -0.5109F, -8.6714F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(6, 74).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -0.9109F, -6.6714F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(95, 34).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -0.7563F, -4.4056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(38, 39).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.4563F, -2.4056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(38, 39).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.4563F, -2.4056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(95, 34).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -0.7563F, -4.4056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(6, 74).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -0.9109F, -6.6714F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(48, 95).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -0.5109F, -8.6714F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(12, 95).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3851F, 0.3731F, -10.4594F, 0.429F, 0.1843F, -0.5459F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(97, 0).addBox(0.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4816F, -4.3961F, -0.2446F, 0.1044F, 0.2967F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(32, 45).addBox(-1.0F, -0.0745F, -5.9424F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5816F, -5.8961F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(11, 46).addBox(-1.0F, -1.3073F, -7.6534F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.7184F, 1.8039F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5184F, -11.6961F, 0.0873F, -0.0435F, -0.0038F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(65, 98).addBox(0.0F, -5.8823F, 3.3766F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 98).addBox(0.0F, -7.2823F, 5.1766F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 99).addBox(0.0F, -4.6823F, 1.6766F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 99).addBox(0.0F, -3.7823F, -0.0234F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(34, 25).mirror().addBox(-14.6969F, -2.65F, -0.5391F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.014F, -0.6216F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(96, 11).mirror().addBox(-3.6202F, -2.443F, 1.1159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.414F, -1.7216F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(95, 88).mirror().addBox(-1.9111F, 0.0499F, -0.505F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.014F, -0.6216F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(34, 23).mirror().addBox(-14.77F, -3.756F, -0.5341F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.0972F, 0.4828F, -1.3567F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(95, 80).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.3347F, 0.3673F, -0.7943F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(95, 68).mirror().addBox(-2.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.5061F, 0.1323F, -0.2856F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(34, 27).mirror().addBox(-12.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.1194F, 0.5501F, -1.3802F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 70).mirror().addBox(-4.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.3915F, 0.4136F, -0.8072F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(96, 90).mirror().addBox(-2.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.5751F, 0.1476F, -0.3105F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(10, 46).mirror().addBox(-4.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.393F, 0.513F, -0.8048F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(97, 92).mirror().addBox(-2.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.625F, 0.2341F, -0.2993F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(44, 31).mirror().addBox(-11.7642F, -3.7644F, -0.2185F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0541F, 0.6334F, -1.415F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(97, 92).addBox(0.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.625F, -0.2341F, 0.2993F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(10, 46).addBox(2.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.393F, -0.513F, 0.8048F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(44, 31).addBox(2.7642F, -3.7644F, -0.2185F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0541F, -0.6334F, 1.415F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(96, 90).addBox(0.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.5751F, -0.1476F, 0.3105F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(96, 70).addBox(2.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.3915F, -0.4136F, 0.8072F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(34, 27).addBox(2.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0952F, -3.5299F, 0.1194F, -0.5501F, 1.3802F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(95, 68).addBox(0.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.5061F, -0.1323F, 0.2856F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(34, 23).addBox(2.77F, -3.756F, -0.5341F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.0972F, -0.4828F, 1.3567F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(95, 80).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.614F, -2.3216F, 0.3347F, -0.3673F, 0.7943F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(95, 88).addBox(-0.0889F, 0.0499F, -0.505F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.014F, -0.6216F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(34, 25).addBox(2.6969F, -2.65F, -0.5391F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.014F, -0.6216F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(96, 11).addBox(1.6202F, -2.443F, 1.1159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.414F, -1.7216F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(62, 50).mirror().addBox(0.0912F, -0.2503F, -0.9112F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.8453F, 1.9216F, 0.3704F, -1.1546F, -0.1895F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(61, 58).mirror().addBox(-0.4503F, -0.3036F, -2.1659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.3124F, 1.5667F, 0.7943F, -1.1555F, -0.7286F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(82, 51).mirror().addBox(-0.6821F, -0.1832F, -0.5535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.3929F, 0.3506F, 0.7776F, -1.1098F, -0.5606F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(10, 64).mirror().addBox(-0.0263F, 0.6114F, -2.4179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(98, 72).addBox(2.3737F, 0.6114F, 2.5821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(10, 64).addBox(2.3737F, 0.6114F, -2.4179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 11.315F, -0.6548F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(67, 38).mirror().addBox(-0.0263F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 38).addBox(2.3737F, -1.1705F, -4.0716F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1737F, 12.715F, -3.3548F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(1.7312F, -2.2843F, -3.4866F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 10.3324F, -5.0444F, 1.4408F, -0.1533F, -0.8627F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(38, 81).mirror().addBox(1.7973F, -2.2843F, 0.1697F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 10.3324F, -5.0444F, 1.3964F, -0.0998F, -0.5149F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(0.0227F, -2.1587F, -0.0543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.8324F, 1.6556F, 0.7922F, -0.0392F, 0.0971F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.0136F, -0.5471F, 0.0262F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 6.6324F, -5.0444F, 0.6177F, -0.0392F, 0.0971F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 74).addBox(-2.7312F, -2.2843F, -3.4866F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.0F, 10.3324F, -5.0444F, 1.4408F, 0.1533F, 0.8627F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(38, 81).addBox(-2.7973F, -2.2843F, 0.1697F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 10.3324F, -5.0444F, 1.3964F, 0.0998F, 0.5149F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(71, 0).addBox(-1.0227F, -2.1587F, -0.0543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 3.8324F, 1.6556F, 0.7922F, 0.0392F, -0.0971F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0136F, -0.5471F, 0.0262F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 6.6324F, -5.0444F, 0.6177F, 0.0392F, -0.0971F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(61, 58).addBox(-0.5497F, -0.3036F, -2.1659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.3124F, 1.5667F, 0.7943F, 1.1555F, 0.7286F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(62, 50).addBox(-1.0912F, -0.2503F, -0.9112F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.8453F, 1.9216F, 0.3704F, 1.1546F, 0.1895F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(82, 51).addBox(-0.3179F, -0.1832F, -0.5535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.3929F, 0.3506F, 0.7776F, 1.1098F, 0.5606F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(63, 65).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(25, 95).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5818F, -2.1266F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(25, 95).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 65).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5818F, -2.1266F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -0.907F, -0.4666F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 9.5518F, -2.9424F, -0.3927F, 0.0F, -0.1745F));

		PartDefinition cube_r159 = leftarm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(7, 85).addBox(-0.0544F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r160 = leftarm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(32, 69).addBox(-0.1791F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r161 = leftarm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(27, 83).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftarm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(68, 65).addBox(-2.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftarm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(78, 42).addBox(-0.9824F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 7.5571F, 4.5001F, -0.352F, -1.1195F, 0.7608F));

		PartDefinition cube_r164 = leftarm2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(20, 79).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 64).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 7.5086F, -2.6347F, 1.2026F, 0.8597F, -0.5376F));

		PartDefinition cube_r165 = lefthand.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(86, 56).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r166 = lefthand.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(22, 46).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r167 = lefthand.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(58, 50).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r168 = lefthand.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(90, 37).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 9.5518F, -2.9424F, 0.3927F, 0.0F, 0.1745F));

		PartDefinition cube_r169 = rightarm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 30).addBox(-0.9456F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r170 = rightarm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(50, 35).addBox(-0.8209F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r171 = rightarm.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(47, 81).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r172 = rightarm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(68, 12).addBox(-1.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r173 = rightarm.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(78, 7).addBox(-1.0176F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 7.5571F, 4.5001F, -0.7167F, 0.8757F, -1.2886F));

		PartDefinition cube_r174 = rightarm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(68, 78).addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 64).addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 7.5086F, -2.6347F, 1.2464F, -0.6356F, 0.6604F));

		PartDefinition cube_r175 = righthand.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(32, 35).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r176 = righthand.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(13, 33).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r177 = righthand.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(43, 45).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r178 = righthand.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(89, 70).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.486F, -6.1216F, 0.0437F, 0.0436F, 0.0019F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(52, 98).addBox(0.0F, -2.0703F, -0.1461F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(100, 54).addBox(0.0F, -2.9F, -2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 14).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1539F, 0.8183F, -1.5953F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(90, 97).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.3858F, 0.754F, -0.8505F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(97, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.7482F, 0.4455F, -0.2993F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(43, 49).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(97, 37).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r186 = neck2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(43, 49).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r187 = neck2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(97, 37).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r188 = neck2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(97, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.7482F, -0.4455F, 0.2993F));

		PartDefinition cube_r189 = neck2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(90, 97).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.3858F, -0.754F, 0.8505F));

		PartDefinition cube_r190 = neck2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(67, 44).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1539F, -0.8183F, 1.5953F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r191 = neck.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(8, 15).addBox(0.0F, -3.4F, -2.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 35).addBox(-1.0F, -1.4F, -6.7F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(97, 21).mirror().addBox(-2.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r193 = neck.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(97, 21).addBox(0.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(46, 10).addBox(-2.5F, -3.7799F, -2.9581F, 5.0F, 5.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6F, -6.6F, 0.5205F, 0.1206F, 0.0689F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(16, 19).addBox(-1.5F, -3.7845F, -0.0223F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5567F, -3.9625F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -6.067F, 0.0406F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7567F, -9.3625F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(75, 92).addBox(-1.0F, -1.0752F, 0.4095F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -3.0567F, -11.0625F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(20, 55).addBox(-1.0F, -0.2422F, -0.2614F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, -3.0567F, -11.0625F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -2.0305F, -0.8676F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.3057F, -10.0366F, 0.7156F, -0.1309F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5F, -1.8938F, -0.1468F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.3057F, -10.0366F, 0.925F, -0.1309F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -2.0305F, -0.8676F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.3057F, -10.0366F, 0.7156F, 0.1309F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -1.8938F, -0.1468F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2F, -1.3057F, -10.0366F, 0.925F, 0.1309F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(80, 70).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7357F, -8.1581F, -2.042F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(80, 70).addBox(-1.0F, -2.267F, -0.0639F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8433F, -10.5625F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(80, 70).addBox(-1.0F, -2.067F, 0.0361F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8433F, -10.5625F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(85, 38).mirror().addBox(-0.2F, -1.5515F, -0.7493F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 79).mirror().addBox(-0.5F, -1.9515F, -0.7493F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.5018F, -5.2844F, 0.3665F, -0.2094F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(85, 93).mirror().addBox(-1.0406F, -0.9023F, 0.1238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.4018F, -2.6844F, 0.2094F, -0.2094F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(85, 38).addBox(0.2F, -1.5515F, -0.7493F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(5, 79).addBox(-0.5F, -1.9515F, -0.7493F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, 5.5018F, -5.2844F, 0.3665F, 0.2094F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(85, 93).addBox(0.0406F, -0.9023F, 0.1238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, 3.4018F, -2.6844F, 0.2094F, 0.2094F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(47, 0).addBox(-2.5F, -7.2F, 0.1F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(26, 54).addBox(-3.0F, -7.2F, 3.1F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0433F, -2.4625F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.274F, 0.3415F, -0.8995F, -1.2654F, 0.0349F, 0.0F));

		PartDefinition cube_r210 = leftCheek.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(92, 93).addBox(-0.1154F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.526F, -0.8982F, 2.637F, 0.2579F, 0.6816F, 0.4262F));

		PartDefinition cube_r211 = leftCheek.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(9, 98).addBox(-0.3284F, -0.7361F, 1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(94, 24).addBox(-0.3284F, -0.7361F, -0.4957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.926F, 0.3018F, 2.237F, 1.0258F, 0.6816F, 0.4262F));

		PartDefinition cube_r212 = leftCheek.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(66, 93).addBox(-0.9604F, -2.0364F, 0.0598F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.426F, 1.8018F, 1.437F, 1.0956F, 0.6816F, 0.4262F));

		PartDefinition cube_r213 = leftCheek.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 15).addBox(-1.642F, -2.1953F, -0.5305F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.726F, 1.3018F, 0.437F, 0.4499F, 0.6816F, 0.4262F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.274F, 0.3415F, -0.8995F, -1.2654F, -0.0349F, 0.0F));

		PartDefinition cube_r214 = rightCheek.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-0.8846F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.526F, -0.8982F, 2.637F, 0.2579F, -0.6816F, -0.4262F));

		PartDefinition cube_r215 = rightCheek.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(9, 98).mirror().addBox(-0.6716F, -0.7361F, 1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(94, 24).mirror().addBox(-0.6716F, -0.7361F, -0.4957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.926F, 0.3018F, 2.237F, 1.0258F, -0.6816F, -0.4262F));

		PartDefinition cube_r216 = rightCheek.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(66, 93).mirror().addBox(-0.0396F, -2.0364F, 0.0598F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.426F, 1.8018F, 1.437F, 1.0956F, -0.6816F, -0.4262F));

		PartDefinition cube_r217 = rightCheek.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(0.642F, -2.1953F, -0.5305F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.726F, 1.3018F, 0.437F, 0.4499F, -0.6816F, -0.4262F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offset(0.5296F, 4.4904F, -9.6277F));

		PartDefinition cube_r218 = leftBeak.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(96, 47).mirror().addBox(-0.6F, -1.7F, 5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 47).addBox(0.3858F, -1.7F, 5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9225F, -2.3443F, -3.9828F, -0.083F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftBeak.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(85, 85).addBox(-1.0849F, 0.1295F, -0.0977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5704F, -3.7934F, -0.7304F, -0.5971F, 0.0699F, 0.0695F));

		PartDefinition cube_r220 = leftBeak.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(93, 42).addBox(-0.5341F, -2.0258F, -0.1271F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4644F, 3.5663F, -0.2933F, 0.6421F, 0.0699F, 0.0695F));

		PartDefinition cube_r221 = leftBeak.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(51, 91).addBox(-0.5551F, -2.3582F, -1.5094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3875F, 3.4212F, 0.3592F, -1.0858F, 0.0699F, 0.0695F));

		PartDefinition cube_r222 = leftBeak.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(54, 74).mirror().addBox(0.0461F, 0.0593F, 0.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 72).mirror().addBox(0.0461F, 0.0593F, 1.1549F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.157F, 0.8747F, -1.5014F, -0.0126F, -0.1485F, 0.0347F));

		PartDefinition cube_r223 = leftBeak.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(54, 74).addBox(-1.0461F, 0.0593F, 0.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 72).addBox(-1.0461F, 0.0593F, 1.1549F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0977F, 0.8747F, -1.5014F, -0.0126F, 0.1485F, -0.0347F));

		PartDefinition cube_r224 = leftBeak.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(84, 23).addBox(-1.4458F, -2.1373F, -0.049F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5704F, 0.1066F, -2.0304F, 0.0662F, 0.0699F, 0.0695F));

		PartDefinition cube_r225 = leftBeak.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(88, 33).addBox(-1.5563F, -1.957F, -0.0977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, 2.0066F, -1.7304F, 0.1185F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offset(-0.5296F, 4.4904F, -9.6277F));

		PartDefinition cube_r226 = rightBeak.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(0.0849F, 0.1295F, -0.0977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -3.7934F, -0.7304F, -0.5971F, -0.0699F, -0.0695F));

		PartDefinition cube_r227 = rightBeak.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(93, 42).mirror().addBox(-0.4659F, -2.0258F, -0.1271F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4644F, 3.5663F, -0.2933F, 0.6421F, -0.0699F, -0.0695F));

		PartDefinition cube_r228 = rightBeak.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(51, 91).mirror().addBox(-0.4449F, -2.3582F, -1.5094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3875F, 3.4212F, 0.3592F, -1.0858F, -0.0699F, -0.0695F));

		PartDefinition cube_r229 = rightBeak.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(84, 23).mirror().addBox(0.4458F, -2.1373F, -0.049F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, 0.1066F, -2.0304F, 0.0662F, -0.0699F, -0.0695F));

		PartDefinition cube_r230 = rightBeak.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(88, 33).mirror().addBox(0.5563F, -1.957F, -0.0977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, 2.0066F, -1.7304F, 0.1185F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(71, 46).addBox(-0.5F, -0.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.507F, -1.0851F, 0.0122F, 1.0036F, 0.192F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(21, 33).addBox(-2.0F, -4.6916F, -0.5829F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.3707F, 0.2408F, 0.0193F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(93, 14).addBox(-0.5F, -1.6013F, -0.9612F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6227F, -8.1919F, 1.98F, -3.1247F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(4, 98).addBox(-0.5F, -1.0975F, 0.0946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6227F, -8.1919F, 1.98F, 1.3608F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(88, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3034F, -0.2035F, -2.7126F, 1.367F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, -0.2578F, -1.79F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.3034F, -0.8035F, -1.7126F, 2.3705F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3034F, -3.5869F, -3.098F, 0.6601F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(-1.3034F, -1.1213F, -3.6481F, 0.6994F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, 0.0903F, -1.7976F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F))
				.texOffs(88, 9).addBox(-0.5F, -1.6097F, -1.7976F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-1.3034F, -1.9213F, -3.1481F, -0.0424F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(87, 9).addBox(-1.37F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 89).addBox(-1.73F, -1.15F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(89, 49).addBox(-1.06F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(53, 57).addBox(-0.5387F, -2.8312F, -3.9078F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -6.8497F, 8.2393F, 0.1892F, 0.1498F, 0.053F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(81, 74).addBox(-1.3F, -0.5F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3662F, -8.4281F, 3.2814F, 0.5576F, 0.3333F, 0.0117F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(46, 56).addBox(-1.0F, -0.3F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -9.2554F, 4.2135F, 0.2294F, 0.1913F, -0.1604F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(71, 46).mirror().addBox(-0.5F, -0.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.507F, -1.0851F, 0.0122F, 1.0036F, -0.192F, 0.0F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(21, 33).mirror().addBox(0.0F, -4.6916F, -0.5829F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.3707F, -0.2408F, -0.0193F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(93, 14).mirror().addBox(-0.5F, -1.6013F, -0.9612F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6227F, -8.1919F, 1.98F, -3.1247F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(4, 98).mirror().addBox(-0.5F, -1.0975F, 0.0946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6227F, -8.1919F, 1.98F, 1.3608F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(87, 9).mirror().addBox(-0.63F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(41, 89).mirror().addBox(-1.27F, -1.15F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(89, 49).mirror().addBox(-0.94F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(53, 57).mirror().addBox(-0.4613F, -2.8312F, -3.9078F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -6.8497F, 8.2393F, 0.1892F, -0.1498F, -0.053F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(81, 74).mirror().addBox(-1.7F, -0.5F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3662F, -8.4281F, 3.2814F, 0.5576F, -0.3333F, -0.0117F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(46, 56).mirror().addBox(-1.0F, -0.3F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -9.2554F, 4.2135F, 0.2294F, -0.1913F, 0.1604F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8567F, -2.0625F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r252 = frill.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(20, 71).addBox(-0.5F, -3.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.1953F, 1.9315F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r253 = frill.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(32, 75).addBox(-1.5F, -5.524F, -0.7971F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(92, 83).addBox(-1.0F, -8.524F, -0.7971F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 0).addBox(-1.5F, -9.524F, -0.7971F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6015F, 1.2349F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.517F, -4.8651F, 3.2714F, -0.28F, -0.8409F, 0.3628F));

		PartDefinition cube_r254 = leftFrill.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(75, 80).addBox(-4.9288F, -1.63F, -0.6236F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, 2.6F, -1.4F, -0.2833F, 0.1781F, 0.4399F));

		PartDefinition cube_r255 = leftFrill.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(67, 71).addBox(1.0355F, -5.1806F, 0.0015F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9051F, 7.6849F, -2.4957F, -0.1531F, -0.1319F, -0.9492F));

		PartDefinition cube_r256 = leftFrill.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(14, 98).addBox(3.5977F, -0.2523F, -0.4421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(70, 57).addBox(-0.4023F, -3.5523F, -0.4421F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3009F, 4.1667F, -2.0319F, -0.3318F, 0.033F, -0.0114F));

		PartDefinition cube_r257 = leftFrill.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(98, 40).addBox(3.5039F, -3.7887F, -0.4421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(92, 64).addBox(2.1039F, -4.1887F, -0.4421F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3009F, 4.1667F, -2.0319F, -0.2619F, 0.2087F, 0.5513F));

		PartDefinition cube_r258 = leftFrill.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(87, 89).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.4447F, 0.53F, -0.8714F, 0.2045F, 0.2652F, 2.1334F));

		PartDefinition cube_r259 = leftFrill.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(41, 3).addBox(0.014F, -0.7953F, 0.3215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(26, 0).addBox(0.014F, -0.0953F, 0.3215F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8379F, -2.6906F, -0.6464F, 0.0289F, 0.3322F, 1.5523F));

		PartDefinition cube_r260 = leftFrill.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(19, 98).addBox(-3.1769F, -0.637F, -0.9939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(24, 98).addBox(-2.1769F, -0.637F, -0.9939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(36, 98).addBox(-1.0769F, -0.637F, -0.9939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(64, 0).addBox(-4.0769F, -0.237F, -0.9939F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.7792F, 3.3282F, -1.3615F, -0.0672F, 0.3268F, 1.2572F));

		PartDefinition cube_r261 = leftFrill.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(20, 63).addBox(-2.9164F, -1.0484F, -1.2545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(98, 13).addBox(-1.3164F, -1.0484F, -1.2545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(25, 91).addBox(-2.8164F, -0.2484F, -1.2545F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.6258F, -2.1385F, 0.8392F, -0.1518F, 0.298F, 0.9836F));

		PartDefinition cube_r262 = leftFrill.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(62, 57).addBox(-0.2101F, -2.3826F, -2.1189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2027F, -3.1201F, -0.2785F, -1.3504F, 0.6461F, -0.0598F));

		PartDefinition cube_r263 = leftFrill.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(80, 95).addBox(0.2076F, -0.2933F, -0.1932F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2027F, -5.2201F, 0.6215F, -0.9633F, 0.6505F, 0.0287F));

		PartDefinition cube_r264 = leftFrill.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(62, 57).addBox(-0.1064F, -2.3522F, -2.1018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2027F, -3.1201F, -0.2785F, -1.6162F, 0.5305F, -0.4699F));

		PartDefinition cube_r265 = leftFrill.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(62, 57).addBox(-0.2816F, 0.556F, -1.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.2027F, -3.1201F, -0.2785F, -0.2772F, 0.675F, -0.2655F));

		PartDefinition cube_r266 = leftFrill.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(62, 57).addBox(-0.2816F, 0.0067F, -1.56F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2027F, -3.1201F, -0.2785F, -0.539F, 0.675F, -0.2655F));

		PartDefinition cube_r267 = leftFrill.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(62, 57).addBox(-0.2816F, -0.3934F, -1.4031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2027F, -3.1201F, -0.2785F, -0.9317F, 0.675F, -0.2655F));

		PartDefinition cube_r268 = leftFrill.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(80, 95).addBox(-0.4852F, -0.2274F, -0.0671F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2027F, -5.2201F, 0.6215F, -1.2103F, 0.4875F, -0.3523F));

		PartDefinition cube_r269 = leftFrill.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(98, 51).addBox(0.5495F, -0.9155F, -0.1478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(92, 74).addBox(0.0495F, -0.1155F, -0.1478F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4542F, -5.7795F, 1.0388F, -0.2671F, 0.2019F, 0.5254F));

		PartDefinition cube_r270 = leftFrill.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(41, 98).addBox(0.3789F, -2.3352F, -0.2734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0168F, -5.3576F, 0.8571F, -0.9528F, 0.3758F, -0.4159F));

		PartDefinition cube_r271 = leftFrill.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(55, 95).addBox(-0.7802F, -2.0254F, -0.2734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0168F, -5.3576F, 0.8571F, -0.6035F, 0.8572F, 0.1604F));

		PartDefinition cube_r272 = leftFrill.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(41, 94).addBox(0.0642F, -0.3081F, -0.0864F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5615F, -5.5945F, 0.9846F, -0.3318F, 0.033F, -0.0114F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.517F, -4.8651F, 3.2714F, -0.28F, 0.8409F, -0.3628F));

		PartDefinition cube_r273 = rightFrill.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(75, 80).mirror().addBox(0.9288F, -1.63F, -0.6236F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.6F, -1.4F, -0.2833F, -0.1781F, -0.4399F));

		PartDefinition cube_r274 = rightFrill.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-5.0355F, -5.1806F, 0.0015F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9051F, 7.6849F, -2.4957F, -0.1531F, 0.1319F, 0.9492F));

		PartDefinition cube_r275 = rightFrill.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(14, 98).mirror().addBox(-4.5977F, -0.2523F, -0.4421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(70, 57).mirror().addBox(-4.5977F, -3.5523F, -0.4421F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3009F, 4.1667F, -2.0319F, -0.3318F, -0.033F, 0.0114F));

		PartDefinition cube_r276 = rightFrill.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(98, 40).mirror().addBox(-4.5039F, -3.7887F, -0.4421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(92, 64).mirror().addBox(-4.1039F, -4.1887F, -0.4421F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3009F, 4.1667F, -2.0319F, -0.2619F, -0.2087F, -0.5513F));

		PartDefinition cube_r277 = rightFrill.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(87, 89).mirror().addBox(-2.0F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4447F, 0.53F, -0.8714F, 0.2045F, -0.2652F, -2.1334F));

		PartDefinition cube_r278 = rightFrill.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(41, 3).mirror().addBox(-1.014F, -0.7953F, 0.3215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(26, 0).mirror().addBox(-3.014F, -0.0953F, 0.3215F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8379F, -2.6906F, -0.6464F, 0.0289F, -0.3322F, -1.5523F));

		PartDefinition cube_r279 = rightFrill.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(19, 98).mirror().addBox(2.1769F, -0.637F, -0.9939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(24, 98).mirror().addBox(1.1769F, -0.637F, -0.9939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(36, 98).mirror().addBox(0.0769F, -0.637F, -0.9939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(64, 0).mirror().addBox(0.0769F, -0.237F, -0.9939F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.7792F, 3.3282F, -1.3615F, -0.0672F, -0.3268F, -1.2572F));

		PartDefinition cube_r280 = rightFrill.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(20, 63).mirror().addBox(1.9164F, -1.0484F, -1.2545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(98, 13).mirror().addBox(0.3164F, -1.0484F, -1.2545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(25, 91).mirror().addBox(-0.1836F, -0.2484F, -1.2545F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.6258F, -2.1385F, 0.8392F, -0.1518F, -0.298F, -0.9836F));

		PartDefinition cube_r281 = rightFrill.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-0.7899F, -2.3826F, -2.1189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.2027F, -3.1201F, -0.2785F, -1.3504F, -0.6461F, 0.0598F));

		PartDefinition cube_r282 = rightFrill.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(80, 95).mirror().addBox(-1.2076F, -0.2933F, -0.1932F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.2027F, -5.2201F, 0.6215F, -0.9633F, -0.6505F, -0.0287F));

		PartDefinition cube_r283 = rightFrill.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-0.8936F, -2.3522F, -2.1018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.2027F, -3.1201F, -0.2785F, -1.6162F, -0.5305F, 0.4699F));

		PartDefinition cube_r284 = rightFrill.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-0.7184F, 0.556F, -1.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.2027F, -3.1201F, -0.2785F, -0.2772F, -0.675F, 0.2655F));

		PartDefinition cube_r285 = rightFrill.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-0.7184F, 0.0067F, -1.56F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.2027F, -3.1201F, -0.2785F, -0.539F, -0.675F, 0.2655F));

		PartDefinition cube_r286 = rightFrill.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-0.7184F, -0.3934F, -1.4031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2027F, -3.1201F, -0.2785F, -0.9317F, -0.675F, 0.2655F));

		PartDefinition cube_r287 = rightFrill.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(80, 95).mirror().addBox(-0.5148F, -0.2274F, -0.0671F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.2027F, -5.2201F, 0.6215F, -1.2103F, -0.4875F, 0.3523F));

		PartDefinition cube_r288 = rightFrill.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(98, 51).mirror().addBox(-1.5495F, -0.9155F, -0.1478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(92, 74).mirror().addBox(-2.0495F, -0.1155F, -0.1478F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4542F, -5.7795F, 1.0388F, -0.2671F, -0.2019F, -0.5254F));

		PartDefinition cube_r289 = rightFrill.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(41, 98).mirror().addBox(-1.3789F, -2.3352F, -0.2734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0168F, -5.3576F, 0.8571F, -0.9528F, -0.3758F, 0.4159F));

		PartDefinition cube_r290 = rightFrill.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(55, 95).mirror().addBox(-0.2198F, -2.0254F, -0.2734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0168F, -5.3576F, 0.8571F, -0.6035F, -0.8572F, -0.1604F));

		PartDefinition cube_r291 = rightFrill.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(41, 94).mirror().addBox(-2.0642F, -0.3081F, -0.0864F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5615F, -5.5945F, 0.9846F, -0.3318F, -0.033F, 0.0114F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 3.0433F, -0.0625F, 0.0116F, -0.0663F, -0.0218F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(59, 91).mirror().addBox(-0.4918F, 1.5237F, -0.1753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2276F, 2.6744F, -2.3876F, -1.1003F, -0.0449F, -0.1376F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.4503F, -1.8138F, -0.7991F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2276F, 2.6744F, -2.3876F, -0.7935F, -0.0427F, -0.1968F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(13, 30).mirror().addBox(-0.2918F, -1.2804F, -1.3871F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2276F, 2.6744F, -2.3876F, -0.821F, -0.0449F, -0.1376F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(55, 64).mirror().addBox(-0.4503F, -2.0068F, 1.1553F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2276F, 2.6744F, -2.3876F, 0.7249F, -0.0427F, -0.1968F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.4503F, -1.2365F, 2.1004F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2276F, 2.6744F, -2.3876F, 1.0914F, -0.0427F, -0.1968F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(61, 76).mirror().addBox(-0.4928F, -5.0206F, -0.4083F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2276F, 2.6744F, -2.3876F, -0.9489F, -0.0986F, -0.1361F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(13, 30).addBox(0.4845F, 0.8656F, -1.5868F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, -0.8029F, 0.1745F, 0.1396F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(59, 91).addBox(-0.3155F, 3.6416F, 0.2243F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, -1.0821F, 0.1745F, 0.1396F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(61, 76).addBox(-0.2252F, -2.8768F, -0.3253F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, -0.9307F, 0.2282F, 0.1391F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 41).addBox(-0.2832F, 0.3173F, -1.0623F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, -0.7676F, 0.171F, 0.1996F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(55, 64).addBox(-0.2832F, -2.158F, -0.9867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, 0.7508F, 0.171F, 0.1996F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 67).addBox(-0.2832F, -2.1454F, 0.1549F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.8973F, 1.1173F, 0.171F, 0.1996F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 5.0745F, -4.9065F, 0.3713F, 0.2075F, 0.0882F));

		PartDefinition cube_r304 = leftLowerbeak.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(97, 28).addBox(-0.5111F, -1.9611F, -0.3529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2942F, -0.8023F, -3.9776F, -2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftLowerbeak.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(53, 19).addBox(-0.5F, -0.8648F, -0.2276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3053F, -0.4385F, -1.0756F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftLowerbeak.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(97, 97).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3053F, -0.0385F, -2.2756F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftLowerbeak.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 97).addBox(-0.5111F, -1.8234F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2942F, -0.8023F, -3.9776F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r308 = leftLowerbeak.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(60, 96).addBox(-0.5111F, -1.3402F, -2.883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2942F, 2.4977F, -2.9776F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftLowerbeak.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(31, 97).addBox(-1.0F, -1.8951F, -0.4059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, 0.4214F, -1.1682F, -1.4641F, -0.0529F, -0.0456F));

		PartDefinition leftLowerbeak3 = jaw.addOrReplaceChild("leftLowerbeak3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, 4.9745F, -4.9065F, 0.366F, -0.1261F, -0.0563F));

		PartDefinition cube_r310 = leftLowerbeak3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(97, 28).mirror().addBox(-0.4889F, -1.9611F, -0.3529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2942F, -0.8023F, -3.9776F, -2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftLowerbeak3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-0.5F, -0.8648F, -0.2276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3053F, -0.4385F, -1.0756F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftLowerbeak3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(97, 97).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3053F, -0.0385F, -2.2756F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftLowerbeak3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(85, 97).mirror().addBox(-0.4889F, -1.8234F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.2942F, -0.8023F, -3.9776F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftLowerbeak3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(60, 96).mirror().addBox(-0.4889F, -1.3402F, -2.883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2942F, 2.4977F, -2.9776F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r315 = leftLowerbeak3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(31, 97).mirror().addBox(0.0F, -1.8951F, -0.4059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, 0.4214F, -1.1682F, -1.4641F, 0.0529F, 0.0456F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 7.6745F, -5.4065F, 0.0533F, -0.2018F, -0.2671F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 13).addBox(-1.0F, -0.1962F, 0.0069F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.3611F, 6.9741F, -0.2831F, -0.2916F, 0.0913F));

		PartDefinition cube_r316 = tail.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(61, 100).addBox(0.0F, -2.4783F, -0.0185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7301F, 6.0938F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r317 = tail.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(46, 98).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3972F, 7.4283F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r318 = tail.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(75, 99).addBox(0.0F, -2.5271F, 0.8135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5035F, 4.8703F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r319 = tail.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(49, 98).addBox(0.0F, -2.0473F, -0.0968F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.2394F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r320 = tail.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(16, 18).addBox(0.0F, -4.282F, 1.192F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 75).addBox(0.0F, -4.082F, -0.808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 20).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9695F, 7.0283F, -0.1243F, -0.1267F, 0.033F));

		PartDefinition cube_r321 = tail2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(101, 7).addBox(0.0F, -4.3544F, 7.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 42).addBox(0.0F, -3.8544F, 5.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 99).addBox(0.0F, -3.4544F, 3.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 100).addBox(0.0F, -3.2544F, 1.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 43).addBox(0.0F, -2.9544F, -0.7492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r322 = tail2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(85, 28).addBox(0.0F, 4.2024F, 10.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 60).addBox(0.0F, 3.4024F, 8.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 64).addBox(0.0F, 2.3024F, 6.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 97).addBox(0.0F, 0.0024F, 4.8767F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5469F, -2.2129F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(37, 56).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9721F, 9.871F, 0.2857F, -0.2096F, -0.061F));

		PartDefinition cube_r323 = tail3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(78, 99).addBox(0.0F, 6.3423F, 14.1451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 82).addBox(0.0F, 5.144F, 12.3552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4559F, -11.8198F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r324 = tail3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(8, 101).addBox(0.0F, -3.1976F, 1.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 99).addBox(0.0F, -2.8976F, -0.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6881F, 1.6345F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.2532F, -0.1914F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0451F, 5.842F, 0.4834F, 0.2423F, 0.1F));

		PartDefinition cube_r325 = tail4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(26, 19).addBox(0.0F, -2.4407F, -1.4848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5011F, 3.0578F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r326 = tail4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(32, 46).addBox(0.0F, -2.582F, 2.592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 51).addBox(0.0F, -2.582F, 0.592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 56).addBox(0.0F, -2.582F, -1.408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8011F, 5.0578F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r327 = tail4.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(16, 30).addBox(0.0F, 8.1206F, 15.884F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 33).addBox(0.0F, 10.3574F, 19.2002F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 46).addBox(0.0F, 9.239F, 17.5421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.501F, -17.6618F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r328 = tail4.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(81, 99).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4558F, 0.2694F, -0.2182F, 0.0F, 0.0F));

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