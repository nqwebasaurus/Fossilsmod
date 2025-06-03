package fossils.fossils.client.blockentity.model.sinoceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SinoceratopsFossilModel extends SkullModelBase {
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
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SinoceratopsFossilModel(ModelPart root) {
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
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -1.2889F, -5.6091F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -28.1081F, 3.1982F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 34).addBox(0.0F, -2.4F, -6.8F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0769F, 2.4243F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(126, 32).mirror().addBox(-1.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 64).mirror().addBox(-0.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(126, 32).addBox(7.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 64).addBox(6.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -1.8624F, 5.7725F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 100).mirror().addBox(0.0116F, -0.4569F, 0.1245F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.9F, -2.3434F, 2.5568F, -0.2468F, 0.1348F, -0.0364F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(116, 68).mirror().addBox(-0.0493F, -0.6464F, -0.1243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2187F, -1.2038F, 6.457F, -0.3905F, 0.6599F, -0.2472F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 100).mirror().addBox(-0.5868F, -0.8549F, -3.7078F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0547F, -1.8624F, -3.2261F, 0.2133F, 0.2511F, 0.0284F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(49, 69).mirror().addBox(-1.511F, -0.8612F, -6.2545F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0547F, -1.8624F, -3.2261F, 0.207F, 0.0633F, -0.0121F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 73).mirror().addBox(-0.1121F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 61).mirror().addBox(-2.1121F, -0.1296F, -0.1578F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -2.6349F, -3.0357F, -0.0014F, -0.0492F, -0.0211F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-0.499F, -0.4002F, -3.2068F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -1.6349F, -6.4357F, 0.2177F, 0.3006F, 0.0547F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-5.0F, -0.8383F, -0.9482F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7195F, 3.5783F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(122, 41).mirror().addBox(-0.5F, -1.7F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5683F, 9.1122F, 9.5208F, 0.3609F, 0.2608F, 0.0233F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(110, 10).mirror().addBox(0.0931F, -0.3231F, -0.0422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 5.6054F, 6.9002F, -0.73F, 0.2608F, 0.0233F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.6031F, -0.6897F, -0.0732F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.3054F, 2.5002F, -0.5554F, 0.2608F, 0.0233F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(100, 73).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.449F, 1.6707F, 1.9692F, -1.0123F, 0.2618F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(110, 5).mirror().addBox(-0.0513F, -0.3209F, -0.7583F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.0054F, 0.9002F, -0.4538F, 0.2618F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(95, 43).mirror().addBox(-0.5513F, 0.1098F, 0.8523F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.0222F, -3.0184F, -0.3665F, 0.2618F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(30, 116).mirror().addBox(-0.5513F, -0.5553F, -0.553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.0222F, -3.0184F, -0.8901F, 0.2618F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(91, 98).mirror().addBox(-0.4211F, 1.0393F, -0.8595F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.7448F, -2.1564F, -0.2679F, 0.2106F, -0.0573F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 109).mirror().addBox(-0.6F, -0.908F, -3.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.7448F, -1.7564F, 0.6372F, 0.0518F, 0.0073F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 79).mirror().addBox(-0.6F, -3.6241F, -5.3343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.7448F, -1.7564F, 1.0736F, 0.0518F, 0.0073F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(45, 123).mirror().addBox(-0.6F, -3.5303F, -5.1626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.7448F, -1.7564F, 0.8118F, 0.0518F, 0.0073F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(101, 112).mirror().addBox(-0.6F, -0.5675F, -7.3923F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(86, 86).mirror().addBox(-0.6F, 0.4325F, -5.0923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.7448F, -1.7564F, 0.2009F, 0.0518F, 0.0073F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 79).mirror().addBox(-0.2F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4116F, 0.613F, -0.4376F, -0.3276F, 0.0404F, -0.1367F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(75, 39).mirror().addBox(-1.0F, -0.4F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.3727F, -0.0875F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 108).mirror().addBox(-0.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.8775F, -2.3435F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(30, 129).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 129).addBox(6.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -1.0188F, 7.853F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(0, 79).addBox(6.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, -0.7634F, 4.3031F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(34, 73).addBox(-0.8879F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(49, 61).addBox(-0.8879F, -0.1296F, -0.1578F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -2.6349F, -3.0357F, -0.0014F, 0.0492F, 0.0211F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(11, 100).addBox(-0.4132F, -0.8549F, -3.7078F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0547F, -1.8624F, -3.2261F, 0.2133F, -0.2511F, -0.0284F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(49, 69).addBox(0.511F, -0.8612F, -6.2545F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0547F, -1.8624F, -3.2261F, 0.207F, -0.0633F, 0.0121F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 54).addBox(-0.501F, -0.4002F, -3.2068F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -1.6349F, -6.4357F, 0.2177F, -0.3006F, -0.0547F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(35, 100).addBox(-1.0116F, -0.4569F, 0.1245F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.9F, -2.3434F, 2.5568F, -0.2468F, -0.1348F, 0.0364F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(103, 0).addBox(3.0F, -0.8383F, -0.9482F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.7195F, 3.5783F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(122, 41).addBox(-0.5F, -1.7F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5683F, 9.1122F, 9.5208F, 0.3609F, -0.2608F, -0.0233F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(110, 10).addBox(-1.0931F, -0.3231F, -0.0422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8F, 5.6054F, 6.9002F, -0.73F, -0.2608F, -0.0233F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 87).addBox(-0.3969F, -0.6897F, -0.0732F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 3.3054F, 2.5002F, -0.5554F, -0.2608F, -0.0233F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(100, 73).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.449F, 1.6707F, 1.9692F, -1.0123F, -0.2618F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(110, 5).addBox(-0.9487F, -0.3209F, -0.7583F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 2.0054F, 0.9002F, -0.4538F, -0.2618F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(95, 43).addBox(-0.4487F, 0.1098F, 0.8523F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, 1.0222F, -3.0184F, -0.3665F, -0.2618F, 0.0F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(30, 116).addBox(-0.4487F, -0.5553F, -0.553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.0222F, -3.0184F, -0.8901F, -0.2618F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(91, 98).addBox(-0.5789F, 1.0393F, -0.8595F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 0.7448F, -2.1564F, -0.2679F, -0.2106F, 0.0573F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(16, 109).addBox(-0.4F, -0.908F, -3.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 0.7448F, -1.7564F, 0.6372F, -0.0518F, -0.0073F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(116, 79).addBox(-0.4F, -3.6241F, -5.3343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.4F, 0.7448F, -1.7564F, 1.0736F, -0.0518F, -0.0073F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(45, 123).addBox(-0.4F, -3.5303F, -5.1626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 0.7448F, -1.7564F, 0.8118F, -0.0518F, -0.0073F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(101, 112).addBox(-0.4F, -0.5675F, -7.3923F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(86, 86).addBox(-0.4F, 0.4325F, -5.0923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4F, 0.7448F, -1.7564F, 0.2009F, -0.0518F, -0.0073F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(64, 79).addBox(-0.8F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4116F, 0.613F, -0.4376F, -0.3276F, -0.0404F, 0.1367F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(75, 39).addBox(-1.0F, -0.4F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.3727F, -0.0875F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(40, 108).addBox(-0.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5F, -1.8775F, -2.3435F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(116, 68).addBox(-0.9507F, -0.6464F, -0.1243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2187F, -1.2038F, 6.457F, -0.3905F, -0.6599F, 0.2472F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(77, 24).addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, 0.5838F, 0.4989F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftleg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(46, 97).addBox(0.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftleg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(82, 47).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftleg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(30, 81).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftleg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(57, 86).addBox(-0.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7762F, -4.4099F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftleg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(14, 114).addBox(-0.1F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(23, 36).addBox(-0.1F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftleg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(11, 94).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftleg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(49, 108).addBox(-1.601F, 4.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 108).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftleg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(80, 104).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6865F, 4.6725F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftleg3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(102, 96).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(46, 113).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftfoot.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(87, 67).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(63, 47).addBox(-1.999F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(77, 79).addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9F, 0.5838F, 0.4989F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightleg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(80, 98).addBox(-3.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightleg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(83, 70).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightleg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(39, 81).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightleg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(64, 89).addBox(-1.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7762F, -4.4099F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightleg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(114, 34).addBox(-0.9F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(64, 101).addBox(-0.9F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightleg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(96, 67).addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightleg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 109).addBox(-0.399F, 4.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 109).addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightleg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(87, 104).addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6865F, 4.6725F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightleg3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(102, 101).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(81, 113).addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightfoot.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(111, 76).addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(68, 63).addBox(-2.001F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, 0.288F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5213F, -5.4155F, 0.1402F, 0.0864F, 0.0122F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(75, 121).addBox(0.0F, -5.6616F, -0.9978F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 121).addBox(0.0F, -5.4616F, -2.8978F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 118).addBox(0.0F, -5.1616F, -4.6978F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4123F, -0.3747F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(55, 113).addBox(0.0F, -5.1908F, -0.3637F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9877F, -6.5747F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(122, 86).mirror().addBox(-1.8257F, -1.6761F, -4.8973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -9.6747F, 0.3537F, -0.1385F, 0.558F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(125, 27).mirror().addBox(-4.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -14.5747F, 0.209F, 0.2403F, -0.832F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(124, 89).mirror().addBox(-2.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -14.5747F, 0.3381F, 0.0815F, -0.3036F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-17.8266F, -3.7453F, -0.5175F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -14.5747F, 0.0584F, 0.312F, -1.3718F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(122, 109).mirror().addBox(-2.8704F, -0.5454F, -0.334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, -0.0609F, -0.0468F, -0.3106F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(122, 111).mirror().addBox(-4.1722F, -1.9589F, -0.4082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, -0.0692F, -0.0747F, -0.8555F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-7.9253F, -4.8375F, -0.7237F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.9123F, -8.9747F, -0.0235F, 0.3021F, -1.3898F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-6.5532F, -3.7826F, -0.7844F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, -0.0224F, 0.0578F, -1.3841F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(73, 22).mirror().addBox(-9.9557F, -4.8427F, -0.3243F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.6123F, -10.2747F, 0.0211F, 0.2981F, -1.3763F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-6.5257F, -3.7911F, -0.9802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.5747F, 0.0206F, 0.1934F, -1.3786F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(123, 62).mirror().addBox(-4.1323F, -1.9919F, -0.7619F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.5747F, 0.0796F, 0.0968F, -0.8538F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(123, 60).mirror().addBox(-2.8599F, -0.6073F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.5747F, 0.155F, 0.0231F, -0.3132F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(41, 15).mirror().addBox(-16.8266F, -3.7453F, -0.5175F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.0548F, 0.2949F, -1.3728F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(123, 58).mirror().addBox(-4.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.197F, 0.2274F, -0.8348F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(123, 56).mirror().addBox(-2.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.3214F, 0.0763F, -0.3049F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(94, 22).mirror().addBox(-5.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.0641F, -0.078F, -1.3874F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-5.133F, -3.7878F, -3.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.0599F, 0.4265F, -1.4142F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(14, 124).mirror().addBox(-4.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.3217F, -0.3463F, -0.8019F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(7, 124).mirror().addBox(-2.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.4988F, -0.1768F, -0.2608F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(41, 19).mirror().addBox(-10.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0526F, 0.2172F, -1.3998F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(116, 28).mirror().addBox(-5.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0514F, -0.0094F, -1.388F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(123, 21).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.1739F, -0.1926F, -0.8415F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(68, 121).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.7624F, -4.5842F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(119, 8).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -1.0624F, -6.5842F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(103, 5).mirror().addBox(-1.6633F, -0.9132F, -0.9878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(121, 35).mirror().addBox(-1.8257F, -1.2627F, -2.9906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2664F, -0.1385F, 0.558F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(122, 38).mirror().addBox(-1.8257F, -1.6761F, -4.8973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.3537F, -0.1385F, 0.558F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(123, 19).mirror().addBox(-2.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.2951F, -0.1195F, -0.291F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(41, 0).addBox(2.8266F, -3.7453F, -0.5175F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -14.5747F, 0.0584F, -0.312F, 1.3718F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(124, 89).addBox(0.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -14.5747F, 0.3381F, -0.0815F, 0.3036F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(125, 27).addBox(2.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -14.5747F, 0.209F, -0.2403F, 0.832F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(122, 86).addBox(-0.1743F, -1.6761F, -4.8973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -9.6747F, 0.3537F, 0.1385F, -0.558F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(42, 119).addBox(0.0F, -5.5679F, 0.0877F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7123F, -14.8747F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(51, 117).addBox(0.0F, -5.6749F, -0.1539F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2123F, -12.8747F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(21, 114).addBox(0.0F, -5.4105F, -0.1351F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3877F, -10.8747F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(76, 105).addBox(0.0F, -5.4762F, -0.8887F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(122, 109).addBox(0.8704F, -0.5454F, -0.334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, -0.0609F, 0.0468F, 0.3106F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(122, 111).addBox(2.1722F, -1.9589F, -0.4082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, -0.0692F, 0.0747F, 0.8555F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(83, 77).addBox(0.9253F, -4.8375F, -0.7237F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9123F, -8.9747F, -0.0235F, -0.3021F, 1.3898F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(62, 12).addBox(2.5532F, -3.7826F, -0.7844F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, -0.0224F, -0.0578F, 1.3841F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(73, 22).addBox(0.9557F, -4.8427F, -0.3243F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6123F, -10.2747F, 0.0211F, -0.2981F, 1.3763F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(50, 47).addBox(2.5257F, -3.7911F, -0.9802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.5747F, 0.0206F, -0.1934F, 1.3786F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(123, 62).addBox(2.1323F, -1.9919F, -0.7619F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.5747F, 0.0796F, -0.0968F, 0.8538F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(123, 60).addBox(0.8599F, -0.6073F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.5747F, 0.155F, -0.0231F, 0.3132F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(41, 15).addBox(2.8266F, -3.7453F, -0.5175F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.0548F, -0.2949F, 1.3728F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(123, 58).addBox(2.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.197F, -0.2274F, 0.8348F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(123, 56).addBox(0.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.3214F, -0.0763F, 0.3049F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(94, 22).addBox(2.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.0641F, 0.078F, 1.3874F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(74, 0).addBox(4.133F, -3.7878F, -3.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.0599F, -0.4265F, 1.4142F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(14, 124).addBox(2.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.3217F, 0.3463F, 0.8019F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(7, 124).addBox(0.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.4988F, 0.1768F, 0.2608F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(41, 19).addBox(5.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0526F, -0.2172F, 1.3998F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(116, 28).addBox(2.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0514F, 0.0094F, 1.388F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(123, 21).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.1739F, 0.1926F, 0.8415F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(68, 121).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.7624F, -4.5842F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(119, 8).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -1.0624F, -6.5842F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(103, 5).addBox(-0.3367F, -0.9132F, -0.9878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 35).addBox(-0.1743F, -1.2627F, -2.9906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2664F, 0.1385F, -0.558F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(122, 38).addBox(-0.1743F, -1.6761F, -4.8973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.3537F, 0.1385F, -0.558F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(123, 19).addBox(0.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.2951F, 0.1195F, 0.291F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(21, 50).addBox(-1.0F, -0.3573F, -7.8423F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(50, 34).addBox(-1.0F, -1.3073F, -7.6534F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4123F, -0.3747F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3866F, -15.8671F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(58, 117).addBox(0.0F, -8.7823F, 3.3766F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 94).addBox(0.0F, -7.6823F, 1.6713F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 118).addBox(0.0F, -5.7823F, -0.0234F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(27, 118).addBox(0.0F, -5.4054F, 0.0064F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.914F, -0.6216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(126, 29).mirror().addBox(0.9737F, 1.6076F, 2.6693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(15, 80).mirror().addBox(-0.0263F, 1.6076F, -2.3307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(126, 29).addBox(2.3737F, 1.6076F, 2.6693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(15, 80).addBox(2.3737F, 1.6076F, -2.3307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 11.315F, -0.6548F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(46, 103).mirror().addBox(-0.7117F, 0.0189F, 0.11F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 13.1929F, -1.3494F, 1.0539F, -1.0061F, -0.2766F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(101, 106).mirror().addBox(-0.1773F, -0.0555F, -2.9334F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3446F, 9.8924F, -10.0313F, 2.511F, -0.2409F, -0.8051F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(62, 2).mirror().addBox(0.0227F, -1.1587F, 1.9457F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.0324F, -2.7444F, 1.1413F, -0.0392F, 0.0971F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(0.2093F, -0.2735F, -5.8066F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.6324F, -4.0444F, 0.8969F, -0.0392F, 0.0971F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-2.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.5228F, 0.2021F, -0.3214F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(21, 48).mirror().addBox(-4.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.313F, 0.4361F, -0.8414F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(54, 31).mirror().addBox(-9.7642F, -3.7644F, -0.2185F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0353F, 0.5298F, -1.4253F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(122, 46).mirror().addBox(-2.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.4914F, 0.1205F, -0.3216F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(120, 77).mirror().addBox(-4.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.3273F, 0.3499F, -0.8311F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-12.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.101F, 0.4643F, -1.3892F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(123, 68).mirror().addBox(-2.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.4051F, 0.1022F, -0.2974F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(50, 45).mirror().addBox(-13.77F, -3.756F, -0.5341F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.0732F, 0.3804F, -1.3667F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(123, 66).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.2581F, 0.2917F, -0.8191F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(124, 91).mirror().addBox(-2.8886F, -0.5014F, -0.4794F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.3549F, 0.0867F, -0.3021F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(41, 17).mirror().addBox(-15.6845F, -3.7724F, -0.5521F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.062F, 0.3291F, -1.3706F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(123, 64).mirror().addBox(-4.211F, -1.9247F, -0.5521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.2212F, 0.2532F, -0.829F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(22, 102).mirror().addBox(-0.3493F, -2.7F, -1.285F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9446F, 8.8924F, -7.7313F, 1.7693F, -0.2409F, -0.8051F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(26, 93).mirror().addBox(-0.7394F, -3.2F, -0.1133F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9446F, 8.8924F, -7.7313F, 1.1232F, -0.2448F, -0.4676F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(41, 2).mirror().addBox(0.0227F, -2.1587F, -0.0543F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.0324F, -2.7444F, 0.7922F, -0.0392F, 0.0971F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(17, 61).mirror().addBox(0.0136F, -0.5471F, 0.0262F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 5.8324F, -9.4444F, 0.6177F, -0.0392F, 0.0971F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(88, 14).mirror().addBox(-0.49F, 0.083F, -0.1781F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 13.3124F, 1.5667F, 0.8584F, -1.1232F, -0.4371F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(71, 31).mirror().addBox(-0.3532F, -0.0103F, -0.7415F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1737F, 13.7453F, 1.9216F, 0.4577F, -1.1546F, -0.1895F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(88, 8).mirror().addBox(-0.9575F, 0.7399F, -1.3219F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.3929F, 0.3506F, 0.7963F, -1.0319F, -0.3635F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(87, 61).mirror().addBox(-0.0263F, -0.2194F, -3.7626F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 61).addBox(2.3737F, -0.2194F, -3.7626F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1737F, 12.715F, -3.3548F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(61, 121).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 102).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5818F, -2.1266F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(92, 84).addBox(0.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.5228F, -0.2021F, 0.3214F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(21, 48).addBox(2.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.313F, -0.4361F, 0.8414F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(54, 31).addBox(2.7642F, -3.7644F, -0.2185F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0353F, -0.5298F, 1.4253F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(122, 46).addBox(0.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.4914F, -0.1205F, 0.3216F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(120, 77).addBox(2.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.3273F, -0.3499F, 0.8311F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(54, 29).addBox(2.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.101F, -0.4643F, 1.3892F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(123, 68).addBox(0.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.4051F, -0.1022F, 0.2974F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(50, 45).addBox(2.77F, -3.756F, -0.5341F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.0732F, -0.3804F, 1.3667F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(123, 66).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.2581F, -0.2917F, 0.8191F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(124, 91).addBox(0.8886F, -0.5014F, -0.4794F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.3549F, -0.0867F, 0.3021F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(41, 17).addBox(2.6845F, -3.7724F, -0.5521F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.062F, -0.3291F, 1.3706F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(123, 64).addBox(2.211F, -1.9247F, -0.5521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.2212F, -0.2532F, 0.829F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(101, 106).addBox(-0.8227F, -0.0555F, -2.9334F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3446F, 9.8924F, -10.0313F, 2.511F, 0.2409F, 0.8051F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(22, 102).addBox(-0.6507F, -2.7F, -1.285F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.9446F, 8.8924F, -7.7313F, 1.7693F, 0.2409F, 0.8051F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(26, 93).addBox(-0.2606F, -3.2F, -0.1133F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9446F, 8.8924F, -7.7313F, 1.1232F, 0.2448F, 0.4676F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(62, 2).addBox(-1.0227F, -1.1587F, 1.9457F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.0F, 3.0324F, -2.7444F, 1.1413F, 0.0392F, -0.0971F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(41, 2).addBox(-1.0227F, -2.1587F, -0.0543F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 3.0324F, -2.7444F, 0.7922F, 0.0392F, -0.0971F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(73, 12).addBox(-1.2093F, -0.2735F, -5.8066F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.0F, 1.6324F, -4.0444F, 0.8969F, 0.0392F, -0.0971F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(17, 61).addBox(-1.0136F, -0.5471F, 0.0262F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 5.8324F, -9.4444F, 0.6177F, 0.0392F, -0.0971F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(88, 14).addBox(-0.51F, 0.083F, -0.1781F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 13.3124F, 1.5667F, 0.8584F, 1.1232F, 0.4371F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(71, 31).addBox(-0.6468F, -0.0103F, -0.7415F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1737F, 13.7453F, 1.9216F, 0.4577F, 1.1546F, 0.1895F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(46, 103).addBox(-0.2883F, 0.0189F, 0.11F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 13.1929F, -1.3494F, 1.0539F, 1.0061F, 0.2766F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(88, 8).addBox(-0.0425F, 0.7399F, -1.3219F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.3929F, 0.3506F, 0.7963F, 1.0319F, 0.3635F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(61, 121).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 102).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5818F, -2.1266F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -0.907F, -0.4666F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 9.5518F, -5.9424F, -0.4363F, 0.0F, -0.1745F));

		PartDefinition cube_r184 = leftarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(69, 105).addBox(-0.0544F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r185 = leftarm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(114, 118).addBox(-0.1791F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r186 = leftarm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 101).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftarm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(88, 31).addBox(-2.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftarm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(71, 97).addBox(-0.9824F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 7.5571F, 4.5001F, 0.3322F, -1.2608F, 0.0482F));

		PartDefinition cube_r189 = leftarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(57, 98).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 86).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 7.5086F, -2.6347F, 1.0463F, 0.6267F, -0.3359F));

		PartDefinition cube_r190 = lefthand.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(107, 48).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r191 = lefthand.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(92, 79).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r192 = lefthand.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(110, 90).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r193 = lefthand.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(63, 113).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 9.5518F, -5.9424F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r194 = rightarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(9, 106).addBox(-0.9456F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r195 = rightarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 119).addBox(-0.8209F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r196 = rightarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(101, 8).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r197 = rightarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(92, 24).addBox(-1.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r198 = rightarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(98, 49).addBox(-1.0176F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 7.5571F, 4.5001F, -0.4806F, 1.2395F, -0.8996F));

		PartDefinition cube_r199 = rightarm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(100, 57).addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 86).addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 7.5086F, -2.6347F, 1.0463F, -0.6267F, 0.3359F));

		PartDefinition cube_r200 = righthand.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(107, 52).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r201 = righthand.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(86, 93).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r202 = righthand.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(111, 72).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r203 = righthand.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(72, 113).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.486F, -6.1216F, -0.0436F, 0.1309F, 0.0F));

		PartDefinition cube_r204 = neck2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(71, 39).addBox(0.0F, -3.0703F, -0.1461F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r205 = neck2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(86, 129).addBox(0.0F, -2.9F, -2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 78).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r206 = neck2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(126, 123).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r207 = neck2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(124, 121).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r208 = neck2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(124, 119).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.6033F, 0.4003F, -0.3589F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(124, 117).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.2706F, 0.6456F, -0.9248F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(88, 20).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1495F, 0.6787F, -1.5923F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(126, 123).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(124, 121).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(124, 119).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.6033F, -0.4003F, 0.3589F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(124, 117).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.2706F, -0.6456F, 0.9248F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(88, 20).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1495F, -0.6787F, 1.5923F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, 0.0058F, 0.1744F, 0.0443F));

		PartDefinition cube_r216 = neck.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(10, 119).addBox(0.0F, -3.4F, -2.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 19).addBox(-1.0F, -1.4F, -6.7F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r217 = neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(125, 48).mirror().addBox(-2.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r218 = neck.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(125, 48).addBox(0.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(66, 70).addBox(-2.5F, -3.7799F, -2.9581F, 5.0F, 5.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2262F, -5.5794F, -0.2504F, 0.1486F, 0.0807F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(101, 16).addBox(-1.5F, -1.9828F, -0.0309F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1567F, -1.6625F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(85, 54).addBox(-1.5F, -2.7845F, -0.0223F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5567F, -3.9625F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(34, 61).addBox(-1.0F, -6.067F, 0.1406F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7567F, -9.3625F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(30, 120).addBox(-0.7F, -0.138F, -0.8255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2F, -5.0057F, -11.0366F, 2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(120, 72).addBox(-0.7F, -0.5123F, -1.282F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.217F)), PartPose.offsetAndRotation(0.2F, -5.0057F, -11.0366F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(119, 118).addBox(-0.7F, -0.424F, -0.6939F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -2.7057F, -10.8366F, -3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(121, 0).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(0.0F, -3.5212F, -10.3239F, -3.0805F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(119, 89).addBox(-0.7F, -0.8031F, -1.565F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2F, -2.7057F, -10.8366F, -2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(37, 119).addBox(-0.9211F, -3.1989F, -0.0296F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1943F, -10.0366F, 0.276F, -0.1186F, 0.0556F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(117, 83).addBox(-0.3425F, 0.0001F, -0.6721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2F, -3.1057F, -10.0366F, 0.5556F, -0.1222F, 0.0471F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(15, 119).addBox(-0.4755F, -3.2332F, -0.069F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1943F, -10.0366F, 0.276F, 0.1186F, -0.0556F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(82, 117).addBox(-0.2609F, 0.0418F, -0.6406F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2F, -3.1057F, -10.0366F, 0.5556F, 0.1222F, -0.0471F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(104, 126).addBox(0.0F, -1.0576F, -0.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5433F, -11.9625F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(86, 126).addBox(0.0F, -1.0294F, 0.1031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2433F, -12.6625F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(127, 41).addBox(0.0F, 0.0056F, 0.0233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.6433F, -14.0625F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(5, 119).addBox(-0.5F, -0.0438F, -1.0206F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9433F, -9.8625F, 2.522F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(43, 127).addBox(-0.5F, 0.9636F, -1.446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(121, 30).addBox(-0.5F, 0.0636F, -0.946F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2433F, -12.0625F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(94, 117).addBox(-0.5F, -0.975F, -0.9633F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5433F, -12.3625F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(94, 123).addBox(-0.5F, 0.0161F, 0.0192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.3433F, -12.6625F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(81, 123).addBox(0.0F, -0.0839F, 0.0192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 1.3433F, -12.6625F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(115, 113).addBox(-1.0F, -2.9489F, -1.0215F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0433F, -9.3625F, -2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(119, 11).addBox(-1.0F, -0.9194F, -1.0205F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9433F, -8.8625F, 2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(87, 117).addBox(-1.0F, -2.0287F, -1.2314F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.0433F, -10.4625F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(75, 117).addBox(-1.0F, 0.0337F, -0.1592F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6567F, -9.0625F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 70).addBox(-2.5F, -7.2F, 0.1F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(17, 72).addBox(-3.0F, -7.2F, 3.1F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0433F, -2.4625F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2423F, -0.0934F, -1.8267F, -1.3701F, 0.0349F, 0.0F));

		PartDefinition cube_r244 = leftCheek.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(114, 127).addBox(-1.0056F, -3.2175F, 1.9192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.174F, 1.2717F, 0.3417F, -0.0835F, 0.4192F, 0.0217F));

		PartDefinition cube_r245 = leftCheek.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(118, 52).addBox(-1.0056F, -1.2942F, 1.5326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.174F, 1.2717F, 0.3417F, 0.5972F, 0.4192F, 0.0217F));

		PartDefinition cube_r246 = leftCheek.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(127, 113).addBox(-1.0056F, -2.4317F, 0.5803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.174F, 1.2717F, 0.3417F, 0.0561F, 0.4192F, 0.0217F));

		PartDefinition cube_r247 = leftCheek.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(116, 24).addBox(-1.0056F, 0.247F, 1.5105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.174F, 1.2717F, 0.3417F, 0.9113F, 0.4192F, 0.0217F));

		PartDefinition cube_r248 = leftCheek.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(99, 90).addBox(-0.9145F, -0.9903F, -3.5486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.174F, 4.1717F, 0.8417F, 2.3925F, 0.5192F, 0.6417F));

		PartDefinition cube_r249 = leftCheek.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(113, 102).addBox(-0.5935F, -1.0121F, -0.9954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.174F, 3.1717F, 0.8417F, 1.8723F, 0.6816F, 0.4262F));

		PartDefinition cube_r250 = leftCheek.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5142F, -1.9475F, -1.413F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.474F, 1.9717F, 1.1417F, 1.2964F, 0.6816F, 0.4262F));

		PartDefinition cube_r251 = leftCheek.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0056F, -0.9948F, -0.2791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.174F, 1.2717F, 0.3417F, 0.763F, 0.4192F, 0.0217F));

		PartDefinition cube_r252 = leftCheek.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(74, 128).addBox(-1.0056F, -2.3058F, 0.0962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.174F, 1.2717F, 0.3417F, 0.2481F, 0.4192F, 0.0217F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2423F, -0.0934F, -1.8267F, -1.3701F, -0.0349F, 0.0F));

		PartDefinition cube_r253 = rightCheek.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(114, 127).mirror().addBox(0.0056F, -3.2175F, 1.9192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.174F, 1.2717F, 0.3417F, -0.0835F, -0.4192F, -0.0217F));

		PartDefinition cube_r254 = rightCheek.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(118, 52).mirror().addBox(0.0056F, -1.2942F, 1.5326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.174F, 1.2717F, 0.3417F, 0.5972F, -0.4192F, -0.0217F));

		PartDefinition cube_r255 = rightCheek.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(127, 113).mirror().addBox(0.0056F, -2.4317F, 0.5803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.174F, 1.2717F, 0.3417F, 0.0561F, -0.4192F, -0.0217F));

		PartDefinition cube_r256 = rightCheek.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(116, 24).mirror().addBox(0.0056F, 0.247F, 1.5105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.174F, 1.2717F, 0.3417F, 0.9113F, -0.4192F, -0.0217F));

		PartDefinition cube_r257 = rightCheek.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(99, 90).mirror().addBox(-0.0855F, -0.9903F, -3.5486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.174F, 4.1717F, 0.8417F, 2.3925F, -0.5192F, -0.6417F));

		PartDefinition cube_r258 = rightCheek.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(113, 102).mirror().addBox(-0.4065F, -1.0121F, -0.9954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.174F, 3.1717F, 0.8417F, 1.8723F, -0.6816F, -0.4262F));

		PartDefinition cube_r259 = rightCheek.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-0.4858F, -1.9475F, -1.413F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.474F, 1.9717F, 1.1417F, 1.2964F, -0.6816F, -0.4262F));

		PartDefinition cube_r260 = rightCheek.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(0.0056F, -0.9948F, -0.2791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.174F, 1.2717F, 0.3417F, 0.763F, -0.4192F, -0.0217F));

		PartDefinition cube_r261 = rightCheek.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(74, 128).mirror().addBox(0.0056F, -2.3058F, 0.0962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.174F, 1.2717F, 0.3417F, 0.2481F, -0.4192F, -0.0217F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3297F, 7.266F, -13.544F, 0.0F, 0.0F, 0.0349F));

		PartDefinition cube_r262 = leftBeak.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(115, 39).addBox(-1.2584F, -1.8578F, -0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5704F, -1.8934F, -1.3304F, -0.2213F, 0.036F, -0.0841F));

		PartDefinition cube_r263 = leftBeak.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(122, 98).addBox(-0.3399F, -0.0761F, 0.0333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4644F, 0.1663F, -0.9933F, 0.7294F, 0.0699F, 0.0695F));

		PartDefinition cube_r264 = leftBeak.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(108, 113).addBox(-0.8039F, -1.7112F, -2.087F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1115F, 0.2916F, 0.694F, -0.9112F, 0.0699F, 0.0695F));

		PartDefinition cube_r265 = leftBeak.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(68, 117).addBox(-1.2653F, 0.0084F, -0.0619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5704F, -1.7934F, -1.3304F, 0.0312F, 0.0699F, 0.0695F));

		PartDefinition cube_r266 = leftBeak.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(61, 117).addBox(-1.3345F, -0.029F, -0.0107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -0.7934F, -1.3304F, 0.293F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3297F, 7.266F, -13.544F, 0.0F, 0.0F, -0.0349F));

		PartDefinition cube_r267 = rightBeak.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(115, 39).mirror().addBox(0.2584F, -1.8578F, -0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.8934F, -1.3304F, -0.2213F, -0.036F, 0.0841F));

		PartDefinition cube_r268 = rightBeak.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(122, 98).mirror().addBox(-0.6601F, -0.0761F, 0.0333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4644F, 0.1663F, -0.9933F, 0.7294F, -0.0699F, -0.0695F));

		PartDefinition cube_r269 = rightBeak.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(108, 113).mirror().addBox(-0.1961F, -1.7112F, -2.087F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1115F, 0.2916F, 0.694F, -0.9112F, -0.0699F, -0.0695F));

		PartDefinition cube_r270 = rightBeak.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(68, 117).mirror().addBox(0.2653F, 0.0084F, -0.0619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.7934F, -1.3304F, 0.0312F, -0.0699F, -0.0695F));

		PartDefinition cube_r271 = rightBeak.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(61, 117).mirror().addBox(0.3345F, -0.029F, -0.0107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.7934F, -1.3304F, 0.293F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.108F, -6.8808F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 59).addBox(-2.0F, -4.6916F, -0.5829F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.3707F, 0.2408F, 0.0193F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(30, 112).addBox(-1.0F, -0.3594F, -0.9624F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1227F, -7.7322F, 2.0811F, 2.504F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(7, 114).addBox(-0.5F, -1.997F, -1.9165F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6227F, -6.1919F, 0.78F, -2.3306F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(115, 44).addBox(-0.5F, -1.0167F, -1.9315F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6227F, -7.1919F, 0.58F, -2.9589F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(112, 15).addBox(-1.0F, -1.2623F, -0.9346F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1227F, -7.7322F, 2.0811F, 2.5912F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(127, 76).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6227F, -9.0648F, 2.8449F, 2.4167F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(99, 84).addBox(-1.0F, -0.6245F, -3.6981F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.4353F, -5.4816F, -1.0496F, 0.0523F, -0.0908F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(116, 56).addBox(-1.0F, -0.3898F, -0.0385F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1227F, -7.7322F, 2.0811F, 1.8582F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(66, 126).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -4.6307F, -4.1425F, -1.6058F, -0.0872F, 0.0031F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(123, 79).addBox(-1.0F, -2.1383F, -0.0646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -3.6647F, -5.7816F, -0.9789F, 0.2188F, 0.1449F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(107, 62).addBox(-1.37F, -1.55F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(101, 30).addBox(-1.73F, -1.55F, -1.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(107, 67).addBox(-1.06F, -1.55F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(31, 106).addBox(-0.5033F, -1.7538F, -2.4452F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(81, 127).addBox(-0.5033F, -0.7538F, -3.4452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(0, 94).addBox(0.1967F, -0.3538F, -3.4452F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1627F, -1.6904F, 2.3377F, 0.42F, 0.2091F, 0.0111F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(116, 19).addBox(-0.5033F, -1.8231F, 0.2727F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1627F, -1.6904F, 2.3377F, 0.263F, 0.2091F, 0.0111F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(35, 93).addBox(-0.5387F, -2.8312F, -3.9078F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -6.8497F, 8.2393F, 0.1892F, 0.1498F, 0.053F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(105, 79).addBox(-1.3F, -0.5F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3662F, -8.4281F, 3.2814F, 0.5576F, 0.3333F, 0.0117F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(13, 87).addBox(-0.9656F, 0.1816F, -4.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9F, -9.2554F, 10.2135F, -0.3322F, 0.9014F, -0.0829F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(79, 0).addBox(-0.5924F, -0.7075F, -0.8439F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -9.2554F, 7.2135F, -0.5556F, 0.8183F, -0.5169F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(71, 89).addBox(-1.1F, -0.1313F, -0.4534F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.4353F, -6.2816F, 1.7285F, 0.0862F, 0.0137F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(121, 14).addBox(0.3F, -3.0457F, -0.5155F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -1.9647F, -0.2816F, 2.5831F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(90, 113).addBox(-0.4485F, -0.9474F, -0.3725F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7F, -9.2554F, 7.1135F, -0.1895F, 0.1913F, -0.1604F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(105, 21).addBox(-1.0F, -0.3F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -9.2554F, 4.2135F, 0.2294F, 0.1913F, -0.1604F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.108F, -6.8808F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(0.0F, -4.6916F, -0.5829F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.3707F, -0.2408F, -0.0193F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(30, 112).mirror().addBox(-1.0F, -0.3594F, -0.9624F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1227F, -7.7322F, 2.0811F, 2.504F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(7, 114).mirror().addBox(-0.5F, -1.997F, -1.9165F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6227F, -6.1919F, 0.78F, -2.3306F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(115, 44).mirror().addBox(-0.5F, -1.0167F, -1.9315F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6227F, -7.1919F, 0.58F, -2.9589F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(112, 15).mirror().addBox(-1.0F, -1.2623F, -0.9346F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1227F, -7.7322F, 2.0811F, 2.5912F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(127, 76).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6227F, -9.0648F, 2.8449F, 2.4167F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(99, 84).mirror().addBox(0.0F, -0.6245F, -3.6981F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 1.4353F, -5.4816F, -1.0496F, -0.0523F, 0.0908F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(116, 56).mirror().addBox(-1.0F, -0.3898F, -0.0385F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1227F, -7.7322F, 2.0811F, 1.8582F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(66, 126).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -4.6307F, -4.1425F, -1.6058F, 0.0872F, -0.0031F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(123, 79).mirror().addBox(0.0F, -2.1383F, -0.0646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -3.6647F, -5.7816F, -0.9789F, -0.2188F, -0.1449F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(107, 62).mirror().addBox(-0.63F, -1.55F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(101, 30).mirror().addBox(-1.27F, -1.55F, -1.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(107, 67).mirror().addBox(-0.94F, -1.55F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(31, 106).mirror().addBox(-0.4967F, -1.7538F, -2.4452F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(81, 127).mirror().addBox(-0.4967F, -0.7538F, -3.4452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 94).mirror().addBox(-0.1967F, -0.3538F, -3.4452F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1627F, -1.6904F, 2.3377F, 0.42F, -0.2091F, -0.0111F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(116, 19).mirror().addBox(-0.4967F, -1.8231F, 0.2727F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1627F, -1.6904F, 2.3377F, 0.263F, -0.2091F, -0.0111F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(35, 93).mirror().addBox(-0.4613F, -2.8312F, -3.9078F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -6.8497F, 8.2393F, 0.1892F, -0.1498F, -0.053F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(105, 79).mirror().addBox(-1.7F, -0.5F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3662F, -8.4281F, 3.2814F, 0.5576F, -0.3333F, -0.0117F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(13, 87).mirror().addBox(-0.0344F, 0.1816F, -4.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9F, -9.2554F, 10.2135F, -0.3322F, -0.9014F, 0.0829F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.4076F, -0.7075F, -0.8439F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -9.2554F, 7.2135F, -0.5556F, -0.8183F, 0.5169F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(71, 89).mirror().addBox(0.1F, -0.1313F, -0.4534F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 1.4353F, -6.2816F, 1.7285F, -0.0862F, -0.0137F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(121, 14).mirror().addBox(-1.3F, -3.0457F, -0.5155F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3F, -1.9647F, -0.2816F, 2.5831F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(90, 113).mirror().addBox(-1.5515F, -0.9474F, -0.3725F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -9.2554F, 7.1135F, -0.1895F, -0.1913F, 0.1604F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(105, 21).mirror().addBox(-1.0F, -0.3F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -9.2554F, 4.2135F, 0.2294F, -0.1913F, 0.1604F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8567F, -2.0625F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r314 = frill.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(63, 54).addBox(-0.5F, -3.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7692F, 2.8429F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r315 = frill.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(94, 0).addBox(-1.5F, -5.524F, -0.7971F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(127, 96).addBox(-0.5F, -7.824F, -0.9971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(127, 93).addBox(-0.5F, -8.824F, -1.0971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(91, 127).addBox(-0.5F, -9.824F, -1.1971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(110, 83).addBox(-1.0F, -10.524F, -0.7971F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6015F, 1.2349F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.471F, -5.1075F, 3.5343F, 0.1F, -0.3365F, 0.1941F));

		PartDefinition cube_r316 = leftFrill.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(105, 35).addBox(1.0355F, -5.1806F, -1.5985F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9051F, 7.6849F, -2.4957F, -0.1531F, -0.1319F, -0.9492F));

		PartDefinition cube_r317 = leftFrill.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(92, 37).addBox(-5.546F, -1.4094F, -0.5419F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9994F, 1.845F, -1.1002F, -0.4061F, -0.3739F, -0.0735F));

		PartDefinition cube_r318 = leftFrill.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(87, 121).addBox(1.0852F, 0.1645F, -0.3846F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.9994F, 1.845F, -1.1002F, -0.5776F, 0.0282F, 0.7914F));

		PartDefinition cube_r319 = leftFrill.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(128, 79).addBox(0.9769F, 1.6064F, -0.3846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.9994F, 1.845F, -1.1002F, -0.5098F, -0.2857F, 0.2813F));

		PartDefinition cube_r320 = leftFrill.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(104, 118).addBox(0.6628F, -0.9093F, -0.4121F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.9994F, 1.845F, -1.1002F, -0.5137F, 0.4352F, 1.4579F));

		PartDefinition cube_r321 = leftFrill.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(106, 42).addBox(-2.1947F, 0.4335F, -0.0627F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, -0.1959F, 0.3225F, 1.1399F));

		PartDefinition cube_r322 = leftFrill.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(117, 106).addBox(0.2496F, 1.5383F, -0.1722F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0884F, 0.2166F, -0.8986F, 0.4756F, -0.2393F, -2.9113F));

		PartDefinition cube_r323 = leftFrill.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(107, 56).addBox(-2.3864F, -2.977F, 0.1227F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0884F, 0.2166F, -0.8986F, 0.3051F, 0.1601F, 2.1525F));

		PartDefinition cube_r324 = leftFrill.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(79, 8).addBox(-2.2859F, -0.3528F, -0.1177F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, -0.0119F, 0.3586F, 1.6758F));

		PartDefinition cube_r325 = leftFrill.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(66, 129).addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.2503F, 2.358F, -0.8851F, 0.0235F, 0.4024F, 1.5356F));

		PartDefinition cube_r326 = leftFrill.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(116, 60).addBox(-1.2928F, -0.9847F, -0.5339F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.9994F, 1.845F, -1.1002F, -0.2896F, 0.3779F, 1.6204F));

		PartDefinition cube_r327 = leftFrill.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(25, 126).addBox(-2.4454F, -7.2206F, 3.2017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0884F, -0.1834F, -0.5986F, 0.5534F, 0.4216F, 1.7346F));

		PartDefinition cube_r328 = leftFrill.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(16, 106).addBox(-2.6388F, -1.3602F, 0.2749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(6.0116F, -0.1834F, -0.7986F, 0.431F, 0.2645F, 1.4045F));

		PartDefinition cube_r329 = leftFrill.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(112, 30).addBox(-4.7426F, -1.452F, -0.0025F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, 0.0204F, 0.3102F, 1.137F));

		PartDefinition cube_r330 = leftFrill.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(105, 26).addBox(-7.583F, -3.3732F, -0.0025F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, -0.1216F, 0.2868F, 0.6625F));

		PartDefinition cube_r331 = leftFrill.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(129, 38).addBox(-0.6406F, 0.0588F, -0.324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0133F, 1.0326F, -0.4001F, -0.2045F, 0.3633F, 1.8859F));

		PartDefinition cube_r332 = leftFrill.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(25, 129).addBox(-0.1944F, 0.1738F, -0.4104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0133F, 1.0326F, -0.4001F, -0.2617F, 0.2273F, 1.5137F));

		PartDefinition cube_r333 = leftFrill.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(126, 12).addBox(-0.3188F, -1.428F, -0.3822F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0133F, 1.0326F, -0.4001F, -0.0586F, 0.3421F, 1.1042F));

		PartDefinition cube_r334 = leftFrill.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(30, 125).addBox(-0.7499F, -1.6487F, -0.3822F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(7.0133F, 1.0326F, -0.4001F, 0.0419F, 0.3445F, 1.4009F));

		PartDefinition cube_r335 = leftFrill.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(15, 126).addBox(-4.4707F, -3.5785F, 1.0672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, 0.6009F, 0.2904F, 1.0646F));

		PartDefinition cube_r336 = leftFrill.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(20, 126).addBox(-3.5544F, -4.2853F, 1.0672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, 0.5368F, 0.4035F, 0.877F));

		PartDefinition cube_r337 = leftFrill.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(129, 82).addBox(-3.865F, -2.315F, 0.8362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, 0.1855F, 0.1561F, 1.0439F));

		PartDefinition cube_r338 = leftFrill.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(127, 102).addBox(-4.7212F, -1.7543F, 0.6168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, 0.1677F, 0.1809F, 1.2128F));

		PartDefinition cube_r339 = leftFrill.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(129, 85).addBox(-5.601F, -3.9529F, 1.021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, 0.1393F, 0.2575F, 0.6363F));

		PartDefinition cube_r340 = leftFrill.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(129, 44).addBox(-4.3606F, -4.6017F, 1.381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, 0.1445F, 0.227F, 0.4658F));

		PartDefinition cube_r341 = leftFrill.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(10, 126).addBox(-3.698F, -6.2684F, 2.4155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, 0.4795F, 0.4663F, 0.2825F));

		PartDefinition cube_r342 = leftFrill.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(126, 8).addBox(-5.0234F, -5.4884F, 2.4155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, 0.5597F, 0.3619F, 0.4811F));

		PartDefinition cube_r343 = leftFrill.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(126, 16).addBox(-7.543F, -1.4316F, 6.6254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8116F, 0.2166F, -0.8986F, 1.4297F, 0.2276F, 0.441F));

		PartDefinition cube_r344 = leftFrill.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(126, 0).addBox(-1.3912F, -7.6914F, 6.5775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, 0.5692F, 0.0554F, 0.4914F));

		PartDefinition cube_r345 = leftFrill.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(126, 4).addBox(0.313F, -7.6681F, 6.5775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, 0.5493F, 0.1668F, 0.3129F));

		PartDefinition cube_r346 = leftFrill.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(5, 126).addBox(2.4061F, -8.334F, 2.896F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, 0.0161F, 0.1406F, 0.0892F));

		PartDefinition cube_r347 = leftFrill.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(109, 125).addBox(0.3286F, -8.7663F, 2.6861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, -0.0031F, 0.1932F, 0.2513F));

		PartDefinition cube_r348 = leftFrill.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(119, 125).addBox(0.9118F, -6.623F, 7.1966F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, 0.6024F, 0.078F, -0.1807F));

		PartDefinition cube_r349 = leftFrill.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(125, 72).addBox(0.8501F, 1.3594F, 9.0205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, 1.5674F, 0.2518F, -0.2255F));

		PartDefinition cube_r350 = leftFrill.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(0, 126).addBox(2.3435F, -6.1442F, 7.1966F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, 0.5785F, 0.1949F, -0.3563F));

		PartDefinition cube_r351 = leftFrill.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(124, 125).addBox(2.1F, -8.316F, 3.0953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, -0.0386F, 0.1483F, -0.2988F));

		PartDefinition cube_r352 = leftFrill.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(125, 50).addBox(0.0183F, -8.7079F, 2.8706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, -0.0564F, 0.2096F, -0.1394F));

		PartDefinition cube_r353 = leftFrill.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(122, 83).addBox(0.8044F, -7.4517F, 0.71F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, -0.3721F, 0.1724F, -0.2391F));

		PartDefinition cube_r354 = leftFrill.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(113, 94).addBox(1.2139F, -5.8313F, 1.0776F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, -0.3378F, 0.0049F, -0.5758F));

		PartDefinition cube_r355 = leftFrill.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(128, 35).addBox(-6.1878F, -2.6569F, -0.5498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, -0.0738F, 0.33F, 0.7043F));

		PartDefinition cube_r356 = leftFrill.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(35, 128).addBox(-5.2839F, -5.7948F, -0.6498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.1116F, 0.2166F, -0.8986F, -0.2315F, 0.2483F, 0.164F));

		PartDefinition cube_r357 = leftFrill.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(119, 5).addBox(1.8916F, -5.6772F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, -0.3443F, -0.2347F, -0.3615F));

		PartDefinition cube_r358 = leftFrill.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(99, 128).addBox(3.0904F, -6.1575F, 0.4776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0884F, 0.2166F, -0.8986F, -0.3172F, 0.1183F, -0.2448F));

		PartDefinition cube_r359 = leftFrill.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(113, 98).addBox(1.5904F, -6.8575F, 1.0776F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.3884F, 0.2166F, -0.8986F, -0.3172F, 0.1183F, -0.2448F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.471F, -5.1075F, 3.5343F, 0.1F, 0.3365F, -0.1941F));

		PartDefinition cube_r360 = rightFrill.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(105, 35).mirror().addBox(-4.0355F, -5.1806F, -1.5985F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9051F, 7.6849F, -2.4957F, -0.1531F, 0.1319F, 0.9492F));

		PartDefinition cube_r361 = rightFrill.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(92, 37).mirror().addBox(0.546F, -1.4094F, -0.5419F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9994F, 1.845F, -1.1002F, -0.4061F, 0.3739F, 0.0735F));

		PartDefinition cube_r362 = rightFrill.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(87, 121).mirror().addBox(-3.0852F, 0.1645F, -0.3846F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.9994F, 1.845F, -1.1002F, -0.5776F, -0.0282F, -0.7914F));

		PartDefinition cube_r363 = rightFrill.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(128, 79).mirror().addBox(-1.9769F, 1.6064F, -0.3846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.9994F, 1.845F, -1.1002F, -0.5098F, 0.2857F, -0.2813F));

		PartDefinition cube_r364 = rightFrill.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(104, 118).mirror().addBox(-2.6628F, -0.9093F, -0.4121F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.9994F, 1.845F, -1.1002F, -0.5137F, -0.4352F, -1.4579F));

		PartDefinition cube_r365 = rightFrill.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(106, 42).mirror().addBox(-0.8053F, 0.4335F, -0.0627F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, -0.1959F, -0.3225F, -1.1399F));

		PartDefinition cube_r366 = rightFrill.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(117, 106).mirror().addBox(-1.2496F, 1.5383F, -0.1722F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.0884F, 0.2166F, -0.8986F, 0.4756F, 0.2393F, 2.9113F));

		PartDefinition cube_r367 = rightFrill.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(107, 56).mirror().addBox(-0.6136F, -2.977F, 0.1227F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.0884F, 0.2166F, -0.8986F, 0.3051F, -0.1601F, -2.1525F));

		PartDefinition cube_r368 = rightFrill.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(79, 8).mirror().addBox(-0.7141F, -0.3528F, -0.1177F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, -0.0119F, -0.3586F, -1.6758F));

		PartDefinition cube_r369 = rightFrill.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(66, 129).mirror().addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.2503F, 2.358F, -0.8851F, 0.0235F, -0.4024F, -1.5356F));

		PartDefinition cube_r370 = rightFrill.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(116, 60).mirror().addBox(-0.7072F, -0.9847F, -0.5339F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.9994F, 1.845F, -1.1002F, -0.2896F, -0.3779F, -1.6204F));

		PartDefinition cube_r371 = rightFrill.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(25, 126).mirror().addBox(1.4454F, -7.2206F, 3.2017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0884F, -0.1834F, -0.5986F, 0.5534F, -0.4216F, -1.7346F));

		PartDefinition cube_r372 = rightFrill.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(16, 106).mirror().addBox(1.6388F, -1.3602F, 0.2749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-6.0116F, -0.1834F, -0.7986F, 0.431F, -0.2645F, -1.4045F));

		PartDefinition cube_r373 = rightFrill.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(112, 30).mirror().addBox(1.7426F, -1.452F, -0.0025F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, 0.0204F, -0.3102F, -1.137F));

		PartDefinition cube_r374 = rightFrill.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(105, 26).mirror().addBox(3.583F, -3.3732F, -0.0025F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, -0.1216F, -0.2868F, -0.6625F));

		PartDefinition cube_r375 = rightFrill.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(129, 38).mirror().addBox(-0.3594F, 0.0588F, -0.324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0133F, 1.0326F, -0.4001F, -0.2045F, -0.3633F, -1.8859F));

		PartDefinition cube_r376 = rightFrill.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(25, 129).mirror().addBox(-0.8056F, 0.1738F, -0.4104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0133F, 1.0326F, -0.4001F, -0.2617F, -0.2273F, -1.5137F));

		PartDefinition cube_r377 = rightFrill.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(126, 12).mirror().addBox(-0.6812F, -1.428F, -0.3822F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0133F, 1.0326F, -0.4001F, -0.0586F, -0.3421F, -1.1042F));

		PartDefinition cube_r378 = rightFrill.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(30, 125).mirror().addBox(-0.2501F, -1.6487F, -0.3822F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.0133F, 1.0326F, -0.4001F, 0.0419F, -0.3445F, -1.4009F));

		PartDefinition cube_r379 = rightFrill.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(15, 126).mirror().addBox(3.4707F, -3.5785F, 1.0672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, 0.6009F, -0.2904F, -1.0646F));

		PartDefinition cube_r380 = rightFrill.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(20, 126).mirror().addBox(2.5544F, -4.2853F, 1.0672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, 0.5368F, -0.4035F, -0.877F));

		PartDefinition cube_r381 = rightFrill.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(129, 82).mirror().addBox(2.865F, -2.315F, 0.8362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, 0.1855F, -0.1561F, -1.0439F));

		PartDefinition cube_r382 = rightFrill.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(127, 102).mirror().addBox(3.7212F, -1.7543F, 0.6168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, 0.1677F, -0.1809F, -1.2128F));

		PartDefinition cube_r383 = rightFrill.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(129, 85).mirror().addBox(4.601F, -3.9529F, 1.021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, 0.1393F, -0.2575F, -0.6363F));

		PartDefinition cube_r384 = rightFrill.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(129, 44).mirror().addBox(3.3606F, -4.6017F, 1.381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, 0.1445F, -0.227F, -0.4658F));

		PartDefinition cube_r385 = rightFrill.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(10, 126).mirror().addBox(2.698F, -6.2684F, 2.4155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, 0.4795F, -0.4663F, -0.2825F));

		PartDefinition cube_r386 = rightFrill.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(126, 8).mirror().addBox(4.0234F, -5.4884F, 2.4155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, 0.5597F, -0.3619F, -0.4811F));

		PartDefinition cube_r387 = rightFrill.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(126, 16).mirror().addBox(6.543F, -1.4316F, 6.6254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8116F, 0.2166F, -0.8986F, 1.4297F, -0.2276F, -0.441F));

		PartDefinition cube_r388 = rightFrill.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(126, 0).mirror().addBox(0.3912F, -7.6914F, 6.5775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, 0.5692F, -0.0554F, -0.4914F));

		PartDefinition cube_r389 = rightFrill.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(126, 4).mirror().addBox(-1.313F, -7.6681F, 6.5775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, 0.5493F, -0.1668F, -0.3129F));

		PartDefinition cube_r390 = rightFrill.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(5, 126).mirror().addBox(-3.4061F, -8.334F, 2.896F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, 0.0161F, -0.1406F, -0.0892F));

		PartDefinition cube_r391 = rightFrill.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(109, 125).mirror().addBox(-1.3286F, -8.7663F, 2.6861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, -0.0031F, -0.1932F, -0.2513F));

		PartDefinition cube_r392 = rightFrill.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(119, 125).mirror().addBox(-1.9118F, -6.623F, 7.1966F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, 0.6024F, -0.078F, 0.1807F));

		PartDefinition cube_r393 = rightFrill.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(125, 72).mirror().addBox(-1.8501F, 1.3594F, 9.0205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, 1.5674F, -0.2518F, 0.2255F));

		PartDefinition cube_r394 = rightFrill.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 126).mirror().addBox(-3.3435F, -6.1442F, 7.1966F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, 0.5785F, -0.1949F, 0.3563F));

		PartDefinition cube_r395 = rightFrill.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(124, 125).mirror().addBox(-3.1F, -8.316F, 3.0953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, -0.0386F, -0.1483F, 0.2988F));

		PartDefinition cube_r396 = rightFrill.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(125, 50).mirror().addBox(-1.0183F, -8.7079F, 2.8706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, -0.0564F, -0.2096F, 0.1394F));

		PartDefinition cube_r397 = rightFrill.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(122, 83).mirror().addBox(-2.8044F, -7.4517F, 0.71F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, -0.3721F, -0.1724F, 0.2391F));

		PartDefinition cube_r398 = rightFrill.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(113, 94).mirror().addBox(-4.2139F, -5.8313F, 1.0776F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, -0.3378F, -0.0049F, 0.5758F));

		PartDefinition cube_r399 = rightFrill.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(128, 35).mirror().addBox(5.1878F, -2.6569F, -0.5498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, -0.0738F, -0.33F, -0.7043F));

		PartDefinition cube_r400 = rightFrill.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(35, 128).mirror().addBox(4.2839F, -5.7948F, -0.6498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-6.1116F, 0.2166F, -0.8986F, -0.2315F, -0.2483F, -0.164F));

		PartDefinition cube_r401 = rightFrill.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(119, 5).mirror().addBox(-3.8916F, -5.6772F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, -0.3443F, 0.2347F, 0.3615F));

		PartDefinition cube_r402 = rightFrill.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(99, 128).mirror().addBox(-4.0904F, -6.1575F, 0.4776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0884F, 0.2166F, -0.8986F, -0.3172F, -0.1183F, 0.2448F));

		PartDefinition cube_r403 = rightFrill.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(113, 98).mirror().addBox(-4.5904F, -6.8575F, 1.0776F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.3884F, 0.2166F, -0.8986F, -0.3172F, -0.1183F, 0.2448F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.4675F, -0.2504F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(118, 48).mirror().addBox(-0.7061F, 6.9101F, -4.89F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, -0.5701F, -0.1153F, -0.0907F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(127, 105).mirror().addBox(-0.7916F, 7.4497F, 0.3037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, -1.217F, -0.13F, -0.0812F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(127, 99).mirror().addBox(-0.7019F, 6.231F, -2.9662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(123, 23).mirror().addBox(-0.7019F, 6.331F, -2.1662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, -0.7801F, -0.0881F, -0.138F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(128, 23).mirror().addBox(-0.7974F, -2.6877F, -0.7746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, -1.3967F, -0.1418F, -0.1368F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(114, 123).mirror().addBox(-0.7974F, -3.285F, 1.0174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, -0.9254F, -0.1418F, -0.1368F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(78, 121).mirror().addBox(-0.5019F, 1.3459F, -1.4394F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, -1.0419F, -0.0881F, -0.138F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(39, 113).mirror().addBox(-0.7019F, 3.9285F, -0.922F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, -1.0943F, -0.0881F, -0.138F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(94, 104).mirror().addBox(-0.7974F, -1.7863F, -0.4613F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, -1.2047F, -0.1418F, -0.1368F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(110, 106).mirror().addBox(-0.7338F, 0.4018F, -1.113F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, -1.0468F, -0.0855F, -0.1974F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(46, 117).mirror().addBox(-0.7338F, -3.2252F, -1.0587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, 0.7335F, -0.0855F, -0.1974F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(99, 118).mirror().addBox(-0.7338F, -3.234F, 0.1117F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.3547F, -0.7973F, 1.1F, -0.0855F, -0.1974F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(78, 121).addBox(0.5019F, 1.3459F, -1.4394F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, -1.0419F, 0.0881F, 0.138F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(118, 48).addBox(-0.2939F, 6.9101F, -4.89F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, -0.5701F, 0.1153F, 0.0907F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(127, 105).addBox(-0.2084F, 7.4497F, 0.3037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, -1.217F, 0.13F, 0.0812F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(127, 99).addBox(-0.2981F, 6.231F, -2.9662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(123, 23).addBox(-0.2981F, 6.331F, -2.1662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, -0.7801F, 0.0881F, 0.138F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(39, 113).addBox(-0.2981F, 3.9285F, -0.922F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, -1.0943F, 0.0881F, 0.138F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(128, 23).addBox(-0.2026F, -2.6877F, -0.7746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, -1.3967F, 0.1418F, 0.1368F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(114, 123).addBox(-0.2026F, -3.285F, 1.0174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, -0.9254F, 0.1418F, 0.1368F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(94, 104).addBox(-0.2026F, -1.7863F, -0.4613F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, -1.2047F, 0.1418F, 0.1368F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(110, 106).addBox(-0.2662F, 0.4018F, -1.113F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, -1.0468F, 0.0855F, 0.1974F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(46, 117).addBox(-0.2662F, -3.2252F, -1.0587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, 0.7335F, 0.0855F, 0.1974F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(99, 118).addBox(-0.2662F, -3.234F, 0.1117F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 1.3547F, -0.7973F, 1.1F, 0.0855F, 0.1974F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offset(-0.0033F, 5.7221F, -8.2912F));

		PartDefinition cube_r426 = leftLowerbeak.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(35, 124).mirror().addBox(0.0F, 1.5325F, 1.5449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -2.2515F, -0.0873F, 0.0F));

		PartDefinition cube_r427 = leftLowerbeak.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(122, 94).mirror().addBox(0.0F, -0.0953F, -0.8971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.0123F, -0.0873F, 0.0F));

		PartDefinition cube_r428 = leftLowerbeak.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(122, 105).mirror().addBox(0.0F, 0.8203F, -0.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.4661F, -0.0873F, 0.0F));

		PartDefinition cube_r429 = leftLowerbeak.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(122, 113).mirror().addBox(0.0F, 2.0724F, 0.5434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.9548F, -0.0873F, 0.0F));

		PartDefinition cube_r430 = leftLowerbeak.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(99, 124).mirror().addBox(0.0F, 0.7515F, 0.4517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.8326F, -0.0873F, 0.0F));

		PartDefinition cube_r431 = leftLowerbeak.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(104, 122).mirror().addBox(0.09F, -0.7301F, 0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.4681F, -0.0343F, 0.0455F));

		PartDefinition cube_r432 = leftLowerbeak.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(35, 124).addBox(-1.0F, 1.5325F, 1.5449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -2.2515F, 0.0873F, 0.0F));

		PartDefinition cube_r433 = leftLowerbeak.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(122, 94).addBox(-1.0F, -0.0953F, -0.8971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.0123F, 0.0873F, 0.0F));

		PartDefinition cube_r434 = leftLowerbeak.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(122, 105).addBox(-1.0F, 0.8203F, -0.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.4661F, 0.0873F, 0.0F));

		PartDefinition cube_r435 = leftLowerbeak.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(122, 113).addBox(-1.0F, 2.0724F, 0.5434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.9548F, 0.0873F, 0.0F));

		PartDefinition cube_r436 = leftLowerbeak.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(99, 124).addBox(-1.0F, 0.7515F, 0.4517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.8326F, 0.0873F, 0.0F));

		PartDefinition cube_r437 = leftLowerbeak.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(104, 122).addBox(-1.09F, -0.7301F, 0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.4681F, 0.0343F, -0.0455F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -0.1962F, 0.0069F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.004F))
				.texOffs(123, 70).addBox(1.0F, 0.8038F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 123).addBox(0.8F, 0.8038F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 124).addBox(0.6F, 0.8038F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 124).addBox(0.5F, 0.8038F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 70).mirror().addBox(-3.0F, 0.8038F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 123).mirror().addBox(-2.8F, 0.8038F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 124).mirror().addBox(-2.6F, 0.8038F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 124).mirror().addBox(-2.5F, 0.8038F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0994F, 6.3032F, -0.1921F, -0.0873F, 0.0015F));

		PartDefinition cube_r438 = tail.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(95, 49).addBox(0.0F, -4.0783F, 1.4815F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 126).addBox(0.0F, -3.4783F, -0.4185F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7301F, 6.0938F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r439 = tail.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(71, 126).addBox(0.0F, -0.1F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 125).addBox(0.0F, -1.1F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3972F, 7.4283F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r440 = tail.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(96, 73).addBox(0.0F, -2.5271F, 0.8135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5035F, 4.8703F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r441 = tail.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(26, 87).addBox(0.0F, -2.4473F, -0.0968F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.2394F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r442 = tail.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(50, 125).addBox(0.0F, -4.582F, 1.192F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r443 = tail.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(96, 127).addBox(0.0F, -3.882F, -0.808F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(29, 21).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(68, 124).addBox(0.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 124).addBox(0.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 106).addBox(1.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 54).addBox(0.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 124).mirror().addBox(-2.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 124).mirror().addBox(-2.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 106).mirror().addBox(-2.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(125, 54).mirror().addBox(-1.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9361F, 8.8961F, -0.0813F, -0.261F, 0.021F));

		PartDefinition cube_r444 = tail2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(110, 129).addBox(0.0F, -4.7544F, 7.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 43).addBox(0.0F, -4.5544F, 5.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 129).addBox(0.0F, -4.4544F, 3.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 126).addBox(0.0F, -4.2544F, 1.2508F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r445 = tail2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(53, 128).addBox(0.0F, 4.2024F, 10.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 122).addBox(0.0F, 3.4024F, 8.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 102).addBox(0.0F, 2.3024F, 6.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 126).addBox(0.0F, 0.0024F, 4.8767F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5469F, -2.2129F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r446 = tail2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(73, 24).addBox(0.0F, -2.5547F, 0.0262F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(42, 50).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9272F, 9.6761F, 0.2322F, -0.2125F, -0.0498F));

		PartDefinition cube_r447 = tail3.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(129, 108).addBox(0.0F, 9.0423F, 17.0451F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 108).addBox(0.0F, 7.3423F, 15.4451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 108).addBox(0.0F, 6.1423F, 13.8451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 129).addBox(0.0F, 5.144F, 12.3552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4559F, -11.8198F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r448 = tail3.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(122, 129).addBox(0.0F, -3.6976F, 5.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 125).addBox(0.0F, -3.3976F, 3.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 129).addBox(0.0F, -3.1976F, 1.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 129).addBox(0.0F, -3.0976F, -0.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6881F, 1.6345F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2532F, -0.1914F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0741F, 8.8502F, 0.3187F, -0.1659F, -0.0544F));

		PartDefinition cube_r449 = tail4.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(3, 130).addBox(0.0F, -2.2407F, -1.4848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5011F, 3.0578F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r450 = tail4.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(12, 130).addBox(0.0F, -2.282F, -1.408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8011F, 5.0578F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r451 = tail4.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(0, 130).addBox(0.0F, 8.1206F, 15.884F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 130).addBox(0.0F, 10.3574F, 19.2002F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 129).addBox(0.0F, 9.239F, 17.5421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.501F, -17.6618F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r452 = tail4.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(6, 130).addBox(0.0F, -0.7F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4558F, 0.2694F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 135, 135);
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