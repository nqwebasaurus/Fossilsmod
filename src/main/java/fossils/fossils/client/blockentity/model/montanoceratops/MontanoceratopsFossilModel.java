package fossils.fossils.client.blockentity.model.montanoceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MontanoceratopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
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
	private final ModelPart rightLowerbeak;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public MontanoceratopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.4779F, 0.8381F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 54).addBox(-0.003F, -0.0002F, 0.007F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.722F, 2.3782F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, -0.0002F, 0.007F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8616F, -1.6194F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(71, 46).mirror().addBox(-0.5261F, -1.699F, 3.7071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(70, 4).mirror().addBox(-0.5261F, -2.099F, 3.7071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.1986F, 1.9104F, 2.535F, -1.2043F, 0.1396F, -0.1222F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 57).mirror().addBox(-0.8058F, 0.1964F, -1.0854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -2.164F, -2.0223F, 0.1828F, 0.3006F, 0.0547F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-4.0F, 0.7768F, -2.4777F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, -2.7F, 1.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(-4.0F, 0.8868F, -3.2031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.7F, -2.0F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(52, 58).mirror().addBox(-0.5261F, -1.1113F, 2.323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1986F, 1.9104F, 2.535F, -0.9774F, 0.1396F, -0.1222F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 36).mirror().addBox(-0.5261F, -0.5395F, -0.2096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.1986F, 1.9104F, 2.535F, -0.7505F, 0.1396F, -0.1222F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 15).mirror().addBox(-0.4704F, -0.8014F, -2.9911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.1986F, 2.7104F, 2.935F, -0.6981F, 0.1396F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.4704F, -1.0605F, -4.537F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1986F, 2.7104F, 2.935F, -0.4538F, 0.1396F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 25).mirror().addBox(-0.5F, -0.2F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9943F, 0.9649F, 0.1036F, -0.7156F, 0.2618F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 62).mirror().addBox(-0.2F, 0.5617F, -2.1125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.6716F, 0.3434F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(43, 8).mirror().addBox(-0.379F, -2.8305F, -4.7878F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1986F, 2.7104F, 2.935F, -0.3153F, -0.0341F, -0.2183F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(41, 25).mirror().addBox(0.0F, 0.4778F, -1.4466F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.6532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 37).mirror().addBox(-4.0F, -0.0586F, -3.8405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.7F, -0.7F, 2.9F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(75, 5).mirror().addBox(-0.5F, 1.641F, -1.977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(75, 5).addBox(3.1F, 1.641F, -1.977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.8F, -2.043F, 5.8942F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-0.5F, 0.1584F, -2.4653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 49).addBox(3.1F, 0.1584F, -2.4653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -1.543F, 4.8942F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(45, 14).mirror().addBox(-0.5F, 0.012F, -3.6573F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(45, 14).addBox(3.1F, 0.012F, -3.6573F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.8F, -1.0439F, 4.9247F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 57).addBox(-0.1942F, 0.1964F, -1.0854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.164F, -2.0223F, 0.1828F, -0.3006F, -0.0547F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(62, 38).addBox(3.0F, 0.7768F, -2.4777F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -2.7F, 1.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(45, 58).addBox(3.0F, 0.8868F, -3.2031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.7F, -2.0F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(71, 46).addBox(-0.4739F, -1.699F, 3.7071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(70, 4).addBox(-0.4739F, -2.099F, 3.7071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.1986F, 1.9104F, 2.535F, -1.2043F, -0.1396F, 0.1222F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(52, 58).addBox(-0.4739F, -1.1113F, 2.323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1986F, 1.9104F, 2.535F, -0.9774F, -0.1396F, 0.1222F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(44, 36).addBox(-0.4739F, -0.5395F, -0.2096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.1986F, 1.9104F, 2.535F, -0.7505F, -0.1396F, 0.1222F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 15).addBox(-0.5296F, -0.8014F, -2.9911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.1986F, 2.7104F, 2.935F, -0.6981F, -0.1396F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5296F, -1.0605F, -4.537F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1986F, 2.7104F, 2.935F, -0.4538F, -0.1396F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 25).addBox(-0.5F, -0.2F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9943F, 0.9649F, 0.1036F, -0.7156F, -0.2618F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(33, 62).addBox(-0.8F, 0.5617F, -2.1125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8F, -0.6716F, 0.3434F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(43, 8).addBox(-0.621F, -2.8305F, -4.7878F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1986F, 2.7104F, 2.935F, -0.3153F, 0.0341F, 0.2183F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(41, 25).addBox(-2.0F, 0.4778F, -1.4466F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.6532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(24, 37).addBox(3.0F, -0.0586F, -3.8405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.7F, -0.7F, 2.9F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(15, 9).addBox(-0.5F, 0.9F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, -3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(50, 30).addBox(0.0F, 5.0891F, -3.0534F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.9F, -0.2608F, -0.1114F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftleg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(27, 44).addBox(-0.5F, -7.0F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 5.93F, -2.4704F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftleg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(55, 67).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 2.0985F, -0.3563F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftleg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5F, 0.0F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 1.2182F, -0.5187F, -0.48F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 6.3051F, -2.8363F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftleg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6F, 2.4884F, 1.9379F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftleg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(36, 44).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.8315F, 1.2346F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftleg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(61, 19).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftleg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(74, 55).addBox(-0.601F, 4.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 2.0977F, 1.5973F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftleg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(45, 62).addBox(-0.5F, -5.4F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 5.4507F, 3.7989F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftleg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 49).addBox(-0.601F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 1.0861F, 0.1219F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offset(0.0F, 6.2405F, 3.8951F));

		PartDefinition cube_r42 = leftleg3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(33, 53).addBox(-0.602F, -0.5F, 0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7977F, -0.7022F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftfoot.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(15, 24).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.3993F, -1.4813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(52, 19).addBox(-2.0F, 5.0891F, -3.0534F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.9F, -0.2608F, -0.1114F, -0.2306F, -0.0345F, -0.0276F));

		PartDefinition cube_r44 = rightleg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(41, 44).addBox(-1.5F, -7.0F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 5.93F, -2.4704F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightleg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(60, 67).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 2.0985F, -0.3563F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightleg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(12, 48).addBox(-1.5F, 0.0F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 1.2182F, -0.5187F, -0.48F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 6.3051F, -2.8363F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightleg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(5, 55).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.6F, 2.4884F, 1.9379F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightleg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.8315F, 1.2346F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightleg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(26, 61).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightleg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(74, 66).addBox(-0.399F, 4.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 2.0977F, 1.5973F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightleg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(50, 62).addBox(-0.5F, -5.4F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6F, 5.4507F, 3.7989F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightleg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(50, 41).addBox(-0.399F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 1.0861F, 0.1219F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.2405F, 3.8951F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightleg3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 53).addBox(-1.398F, -0.5F, 0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7977F, -0.7022F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightfoot.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 25).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.3993F, -1.4813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7634F, -2.1417F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(23, 75).addBox(0.0F, -1.0853F, -0.0285F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1935F, -0.9435F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(26, 75).addBox(0.0F, -0.9401F, 0.1603F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7935F, -3.0435F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(20, 75).addBox(0.0F, -1.6418F, 2.0276F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4065F, -6.9435F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(68, 9).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1844F, -0.3754F, 0.1878F, 0.1922F, -0.7575F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1844F, -0.3754F, 0.0185F, 0.2583F, -1.3125F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(15, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3156F, -2.3754F, 0.3335F, 0.308F, -0.6514F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(65, 67).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3156F, -2.3754F, 0.0798F, 0.4314F, -1.2218F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(-3.6959F, -2.752F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3156F, -2.3754F, -0.1603F, 0.4097F, -1.7962F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(17, 7).mirror().addBox(-5.6959F, -2.752F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0156F, -4.2754F, 0.0155F, 0.4946F, -1.4834F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(54, 17).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0156F, -4.2754F, 0.2759F, 0.4162F, -0.9051F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0156F, -4.2754F, 0.4828F, 0.2017F, -0.3778F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(68, 9).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1844F, -0.3754F, 0.1878F, -0.1922F, 0.7575F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(66, 31).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1844F, -0.3754F, 0.0185F, -0.2583F, 1.3125F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(15, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3156F, -2.3754F, 0.3335F, -0.308F, 0.6514F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(65, 67).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3156F, -2.3754F, 0.0798F, -0.4314F, 1.2218F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(75, 11).addBox(2.6959F, -2.752F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3156F, -2.3754F, -0.1603F, -0.4097F, 1.7962F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(17, 7).addBox(2.6959F, -2.752F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0156F, -4.2754F, 0.0155F, -0.4946F, 1.4834F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(54, 17).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0156F, -4.2754F, 0.2759F, -0.4162F, 0.9051F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(68, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0156F, -4.2754F, 0.4828F, -0.2017F, 0.3778F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(30, 7).addBox(-0.5F, -0.5F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.2705F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -4.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(40, 75).addBox(0.0F, -3.8238F, 4.7493F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 75).addBox(0.0F, -2.7238F, 3.0493F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 75).addBox(0.0F, -1.5238F, 1.3493F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7412F, -6.5097F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9619F, 4.1026F, -1.8449F, 0.829F, 0.0F, 0.1047F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 74).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.963F, 4.1135F, -3.0111F, 1.5533F, 0.0F, 0.1047F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(69, 41).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.2156F, -4.4754F, 0.7947F, 0.3476F, -0.4474F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(68, 11).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.2156F, -4.4754F, 0.5004F, 0.6906F, -0.9407F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(69, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0156F, -2.8754F, 0.8065F, 0.2364F, -0.4067F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(69, 37).mirror().addBox(-4.6959F, -2.752F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0156F, -2.8754F, 0.1564F, 0.7922F, -1.4977F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(68, 7).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0156F, -2.8754F, 0.5762F, 0.5966F, -0.8579F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(27, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8156F, -1.0754F, 0.6249F, 0.1657F, -0.2679F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(54, 5).mirror().addBox(-5.6959F, -2.752F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8156F, -1.0754F, 0.1286F, 0.602F, -1.3404F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(68, 2).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8156F, -1.0754F, 0.4298F, 0.4529F, -0.7563F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(59, 30).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6728F, 1.3525F, -0.5614F, 1.1694F, 0.0F, 0.1047F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(52, 53).mirror().addBox(-0.3F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0913F, 5.8707F, -3.9271F, 1.2512F, -0.4984F, -0.9652F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(0.7461F, -1.1215F, 0.3489F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, 6.2956F, -4.0725F, 1.0503F, -0.2796F, -0.4487F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(19, 61).mirror().addBox(-0.5F, -0.7F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9098F, 3.6075F, -1.7981F, 0.5498F, 0.0F, 0.1047F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4193F, 6.9656F, -0.3762F, 0.7173F, -0.4633F, -0.42F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(30, 19).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7283F, 6.7744F, -0.211F, 0.8645F, -0.7828F, -0.5445F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(39, 31).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3514F, 6.8772F, -0.293F, 1.4068F, -0.9684F, -1.0286F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(41, 49).mirror().addBox(-1.0F, -4.7701F, 1.1673F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(41, 49).addBox(1.4F, -4.7701F, 1.1673F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2F, 11.497F, -2.9605F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(19, 49).mirror().addBox(-1.0F, -4.5202F, -0.8048F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 49).addBox(1.4F, -4.5202F, -0.8048F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 10.397F, -4.7605F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(69, 41).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.2156F, -4.4754F, 0.7947F, -0.3476F, 0.4474F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(68, 11).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.2156F, -4.4754F, 0.5004F, -0.6906F, 0.9407F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(69, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0156F, -2.8754F, 0.8065F, -0.2364F, 0.4067F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(69, 37).addBox(2.6959F, -2.752F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0156F, -2.8754F, 0.1564F, -0.7922F, 1.4977F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(68, 7).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0156F, -2.8754F, 0.5762F, -0.5966F, 0.8579F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(27, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8156F, -1.0754F, 0.6249F, -0.1657F, 0.2679F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(54, 5).addBox(2.6959F, -2.752F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8156F, -1.0754F, 0.1286F, -0.602F, 1.3404F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(68, 2).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8156F, -1.0754F, 0.4298F, -0.4529F, 0.7563F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(59, 30).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6728F, 1.3525F, -0.5614F, 1.1694F, 0.0F, -0.1047F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(52, 53).addBox(-0.7F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0913F, 5.8707F, -3.9271F, 1.2512F, 0.4984F, 0.9652F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 64).addBox(-1.7461F, -1.1215F, 0.3489F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, 6.2956F, -4.0725F, 1.0503F, 0.2796F, 0.4487F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(54, 74).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.963F, 4.1135F, -3.0111F, 1.5533F, 0.0F, -0.1047F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.9619F, 4.1026F, -1.8449F, 0.829F, 0.0F, -0.1047F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(19, 61).addBox(-0.5F, -0.7F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9098F, 3.6075F, -1.7981F, 0.5498F, 0.0F, -0.1047F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4193F, 6.9656F, -0.3762F, 0.7173F, 0.4633F, 0.42F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(30, 19).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7283F, 6.7744F, -0.211F, 0.8645F, 0.7828F, 0.5445F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(39, 31).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3514F, 6.8772F, -0.293F, 1.4068F, 0.9684F, 1.0286F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.0F, -5.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.5934F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.56F, 5.4262F, -2.7924F, -0.0774F, -0.009F, -0.2616F));

		PartDefinition cube_r113 = leftarm.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7686F, 0.8609F, -0.4498F, 0.4641F, -0.5672F, -0.0056F));

		PartDefinition cube_r114 = leftarm.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(34, 70).addBox(-0.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0831F, 2.1052F, 0.898F, 1.3474F, -0.2288F, -0.099F));

		PartDefinition cube_r115 = leftarm.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(69, 63).addBox(-0.8569F, -2.6154F, 0.1885F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3569F, 2.178F, -0.2063F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftarm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(40, 60).addBox(-0.5F, -2.4F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.8655F, 1.6938F, 0.8116F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3962F, 3.8961F, 2.7698F, -0.5062F, -0.3596F, 0.4729F));

		PartDefinition cube_r117 = leftarm2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 57).addBox(-0.801F, -2.5F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 34).addBox(0.499F, -3.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 1.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2909F, 3.4172F, -1.0175F, 2.5063F, -0.0718F, -0.2279F));

		PartDefinition cube_r118 = lefthand.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(62, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.399F, -0.1486F, -0.3751F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r119 = lefthand.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(52, 23).addBox(-0.7F, -1.2F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.899F, 0.3514F, -1.8751F, -0.8096F, 0.2026F, -0.2301F));

		PartDefinition cube_r120 = lefthand.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(63, 4).addBox(-0.5F, -1.2F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.001F, 0.2514F, -2.0751F, -0.802F, -0.1742F, 0.1964F));

		PartDefinition cube_r121 = lefthand.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(22, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.499F, -0.2486F, -0.5751F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.56F, 5.4262F, -2.7924F, -0.0337F, 0.009F, 0.2616F));

		PartDefinition cube_r122 = rightarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(68, 13).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7686F, 0.8609F, -0.4498F, 0.4641F, 0.5672F, 0.0056F));

		PartDefinition cube_r123 = rightarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(70, 69).addBox(-0.8F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0831F, 2.1052F, 0.898F, 1.3474F, 0.2288F, 0.099F));

		PartDefinition cube_r124 = rightarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(65, 69).addBox(-0.1431F, -2.6154F, 0.1885F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.3569F, 2.178F, -0.2063F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(61, 23).addBox(-0.5F, -2.4F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.8655F, 1.6938F, 0.8116F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3962F, 3.8961F, 2.7698F, 0.1483F, 0.3596F, -0.4729F));

		PartDefinition cube_r126 = rightarm2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(59, 54).addBox(-0.199F, -2.5F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 53).addBox(-1.499F, -3.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 1.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2909F, 3.4172F, -1.0175F, 0.6737F, 0.0718F, 0.2279F));

		PartDefinition cube_r127 = righthand.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(15, 65).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.399F, -0.1486F, -0.3751F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r128 = righthand.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(19, 53).addBox(-1.3F, -1.2F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.899F, 0.3514F, -1.8751F, -0.8096F, -0.2026F, 0.2301F));

		PartDefinition cube_r129 = righthand.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(55, 64).addBox(-1.5F, -1.2F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.001F, 0.2514F, -2.0751F, -0.802F, 0.1742F, -0.1964F));

		PartDefinition cube_r130 = righthand.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(65, 34).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.499F, -0.2486F, -0.5751F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, -4.7F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r131 = neck2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(6, 76).addBox(0.0F, -2.4F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 60).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r132 = neck2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.84F, -1.9105F, -0.3762F, -0.4361F, 0.2933F));

		PartDefinition cube_r133 = neck2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 69).addBox(0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.84F, -1.9105F, -0.3762F, 0.4361F, -0.2933F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.327F, -1.7887F, -0.1443F, -0.4323F, 0.0608F));

		PartDefinition cube_r134 = neck.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(10, 64).addBox(0.0F, -3.2F, -4.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 43).addBox(-0.5F, -1.5F, -4.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 1.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r135 = neck.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(-1.9715F, -0.0337F, -0.4763F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, 0.2211F, -1.8801F, 0.4579F, 0.9377F, -0.9745F));

		PartDefinition cube_r136 = neck.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(68, 17).addBox(-0.0285F, -0.0337F, -0.4763F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5103F, 0.2211F, -1.8801F, 0.4579F, -0.9377F, 0.9745F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.7F, 0.726F, 0.0086F, -0.1534F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(43, 4).addBox(-1.5F, -0.9845F, -0.0223F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.5782F, -2.9045F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(43, 0).addBox(-1.5F, -0.6845F, -0.0223F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(28, 31).addBox(-1.5F, 0.0155F, -0.0223F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.05F, -3.3638F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(52, 8).addBox(-1.0F, -1.0156F, 0.0334F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2639F, -5.7978F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(61, 0).addBox(-1.0F, -1.0156F, -0.0666F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.0635F, -6.4067F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(59, 60).addBox(-1.0F, 2.4844F, 0.1334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.0535F, -5.0619F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(61, 11).addBox(-1.0F, 0.4702F, 0.0305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 7).addBox(-1.0F, -0.0298F, 0.0305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.7041F, -7.37F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(12, 60).addBox(-1.0F, -0.0298F, 0.0305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7478F, -7.0776F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(68, 19).mirror().addBox(-0.0947F, -0.004F, 0.5212F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 50).mirror().addBox(-0.3947F, -0.204F, 0.5212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8724F, 2.9284F, -4.6154F, 0.5449F, -0.2062F, -0.0369F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(33, 58).mirror().addBox(-0.3947F, -0.9802F, -1.9359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0371F, 3.3951F, -3.7465F, 0.1347F, -0.2062F, -0.0369F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(33, 58).addBox(-0.6053F, -0.9802F, -1.9359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0371F, 3.3951F, -3.7465F, 0.1347F, 0.2062F, 0.0369F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(68, 19).addBox(0.0947F, -0.004F, 0.5212F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(59, 50).addBox(-0.6053F, -0.204F, 0.5212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8724F, 2.9284F, -4.6154F, 0.5449F, 0.2062F, 0.0369F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(74, 52).mirror().addBox(-0.7F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 74).mirror().addBox(-0.7F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(74, 52).addBox(2.78F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 74).addBox(2.78F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.54F, -1.0503F, -2.6217F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(74, 43).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(74, 43).addBox(2.58F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.54F, -0.7483F, -3.0326F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(15, 17).addBox(-2.0F, -6.2F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 14).addBox(-2.0F, -6.9F, 2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.0F, -2.4F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.5348F, -0.1352F, -0.7496F, -0.0783F, 0.0577F));

		PartDefinition cube_r151 = leftCheek.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(44, 41).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2031F, 0.3467F, 0.271F, 0.8656F, 0.9574F, 0.5916F));

		PartDefinition cube_r152 = leftCheek.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(69, 43).addBox(-0.5F, -0.4F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(59, 46).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2592F, -0.3448F, 0.0324F, 0.0279F, 0.9574F, 0.5916F));

		PartDefinition cube_r153 = leftCheek.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(12, 55).addBox(-1.0F, -0.3289F, 1.1466F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.733F, 0.0581F, -2.5659F, 0.4499F, 0.6816F, 0.4262F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.5348F, -0.1352F, -0.7496F, 0.0783F, -0.0577F));

		PartDefinition cube_r154 = rightCheek.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(44, 41).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2031F, 0.3467F, 0.271F, 0.8656F, -0.9574F, -0.5916F));

		PartDefinition cube_r155 = rightCheek.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(69, 43).mirror().addBox(-0.5F, -0.4F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(59, 46).mirror().addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2592F, -0.3448F, 0.0324F, 0.0279F, -0.9574F, -0.5916F));

		PartDefinition cube_r156 = rightCheek.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(12, 55).mirror().addBox(0.0F, -0.3289F, 1.1466F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.733F, 0.0581F, -2.5659F, 0.4499F, -0.6816F, -0.4262F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3296F, 2.5364F, -7.2437F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftBeak.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(51, 71).addBox(-0.903F, -0.4536F, -0.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8207F, 0.0655F, 1.4132F, -0.4179F, 0.6299F, -0.0755F));

		PartDefinition cube_r158 = leftBeak.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(73, 13).addBox(-1.1F, -0.2894F, -3.4941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5704F, 1.5066F, 2.8696F, -0.3876F, 0.0699F, 0.0695F));

		PartDefinition cube_r159 = leftBeak.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(75, 16).addBox(-0.5F, -0.5F, -0.448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2481F, 1.8748F, -0.1134F, 0.293F, 0.0699F, 0.0695F));

		PartDefinition cube_r160 = leftBeak.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(75, 8).addBox(-0.4F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3449F, 2.1322F, 0.1938F, 0.8516F, 0.0699F, 0.0695F));

		PartDefinition cube_r161 = leftBeak.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(32, 74).addBox(-0.9429F, -1.2453F, -0.0549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(15, 74).addBox(-0.9429F, -0.9453F, -0.0549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4092F, 1.7691F, 0.3329F, 0.3725F, 0.4302F, -0.0318F));

		PartDefinition cube_r162 = leftBeak.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(73, 73).addBox(-0.9429F, -0.0983F, -0.2406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1787F, 0.956F, -0.2802F, 0.0346F, 0.4038F, 0.0389F));

		PartDefinition cube_r163 = leftBeak.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(10, 73).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0092F, 0.7046F, 0.2275F, -0.3802F, 0.2997F, -0.0609F));

		PartDefinition cube_r164 = leftBeak.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(73, 30).addBox(-0.4F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3119F, 1.0476F, -0.4103F, -0.248F, 0.0699F, 0.0695F));

		PartDefinition cube_r165 = leftBeak.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(5, 73).addBox(-0.4F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2922F, 1.3624F, 0.1818F, -0.0211F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3296F, 2.5364F, -7.2437F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r166 = rightBeak.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(51, 71).mirror().addBox(-0.097F, -0.4536F, -0.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8207F, 0.0655F, 1.4132F, -0.4179F, -0.6299F, 0.0755F));

		PartDefinition cube_r167 = rightBeak.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(73, 13).mirror().addBox(0.1F, -0.2894F, -3.4941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, 1.5066F, 2.8696F, -0.3876F, -0.0699F, -0.0695F));

		PartDefinition cube_r168 = rightBeak.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(75, 16).mirror().addBox(-0.5F, -0.5F, -0.448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.2481F, 1.8748F, -0.1134F, 0.293F, -0.0699F, -0.0695F));

		PartDefinition cube_r169 = rightBeak.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-0.6F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3449F, 2.1322F, 0.1938F, 0.8516F, -0.0699F, -0.0695F));

		PartDefinition cube_r170 = rightBeak.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(32, 74).mirror().addBox(-0.0571F, -1.2453F, -0.0549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(15, 74).mirror().addBox(-0.0571F, -0.9453F, -0.0549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4092F, 1.7691F, 0.3329F, 0.3725F, -0.4302F, 0.0318F));

		PartDefinition cube_r171 = rightBeak.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(73, 73).mirror().addBox(-0.0571F, -0.0983F, -0.2406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1787F, 0.956F, -0.2802F, 0.0346F, -0.4038F, -0.0389F));

		PartDefinition cube_r172 = rightBeak.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0092F, 0.7046F, 0.2275F, -0.3802F, -0.2997F, 0.0609F));

		PartDefinition cube_r173 = rightBeak.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-0.6F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3119F, 1.0476F, -0.4103F, -0.248F, -0.0699F, -0.0695F));

		PartDefinition cube_r174 = rightBeak.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-0.6F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2922F, 1.3624F, 0.1818F, -0.0211F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.3F, -7.3F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(15, 70).addBox(-0.9281F, -1.1789F, -1.0973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1497F, -2.6981F, 1.4695F, 0.0826F, 0.6383F, 0.0891F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(54, 12).addBox(-0.5F, -1.4F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.624F, -2.4593F, 1.2732F, 0.0611F, 0.192F, 0.0F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(18, 43).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.757F, -4.1891F, 3.2098F, 0.576F, 0.192F, 0.0F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(35, 37).addBox(-0.9706F, -2.9526F, -2.9828F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6517F, -3.0755F, 5.2047F, 0.5025F, 0.3403F, 0.1814F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(73, 19).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0345F, -6.0287F, 3.3955F, 0.8079F, 0.3403F, 0.1814F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0977F, -5.6364F, 3.6606F, 1.123F, 0.3861F, 0.2086F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(72, 33).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(20, 72).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0977F, -5.6364F, 3.6606F, 0.5558F, 0.3861F, 0.2086F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(44, 72).addBox(-0.42F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 72).addBox(-0.58F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2285F, -5.5219F, 3.6559F, 0.6431F, 0.3861F, 0.2086F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(56, 71).addBox(-0.5F, -1.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1188F, -4.9235F, 4.0745F, 0.8176F, 0.3861F, 0.2086F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(43, 19).addBox(-1.5F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6814F, -6.0158F, 6.5587F, 0.1991F, 0.3468F, 0.0928F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 37).addBox(-0.1253F, -0.4647F, -1.1622F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2641F, -7.0196F, 4.371F, 1.3765F, -0.9102F, -1.6854F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0877F, -0.4823F, -1.1622F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1556F)), PartPose.offsetAndRotation(0.2641F, -7.0196F, 4.371F, 1.3124F, -1.0889F, -1.6094F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(50, 49).addBox(-1.7011F, -0.5626F, -1.5253F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2641F, -7.0196F, 4.371F, 0.6812F, -0.3458F, -0.7525F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.3F, -7.3F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-0.0719F, -1.1789F, -1.0973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1497F, -2.6981F, 1.4695F, 0.0826F, -0.6383F, -0.0891F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-0.5F, -1.4F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.624F, -2.4593F, 1.2732F, 0.0611F, -0.192F, 0.0F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(18, 43).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.757F, -4.1891F, 3.2098F, 0.576F, -0.192F, 0.0F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(35, 37).mirror().addBox(-0.0294F, -2.9526F, -2.9828F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6517F, -3.0755F, 5.2047F, 0.5025F, -0.3403F, -0.1814F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0345F, -6.0287F, 3.3955F, 0.8079F, -0.3403F, -0.1814F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0977F, -5.6364F, 3.6606F, 1.123F, -0.3861F, -0.2086F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(72, 33).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(20, 72).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0977F, -5.6364F, 3.6606F, 0.5558F, -0.3861F, -0.2086F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(44, 72).mirror().addBox(-0.58F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(39, 72).mirror().addBox(-0.42F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2285F, -5.5219F, 3.6559F, 0.6431F, -0.3861F, -0.2086F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(56, 71).mirror().addBox(-0.5F, -1.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1188F, -4.9235F, 4.0745F, 0.8176F, -0.3861F, -0.2086F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(43, 19).mirror().addBox(-0.5F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6814F, -6.0158F, 6.5587F, 0.1991F, -0.3468F, -0.0928F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-1.8747F, -0.4647F, -1.1622F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2641F, -7.0196F, 4.371F, 1.3765F, 0.9102F, 1.6854F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.9123F, -0.4823F, -1.1622F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1556F)).mirror(false), PartPose.offsetAndRotation(-0.2641F, -7.0196F, 4.371F, 1.3124F, 1.0889F, 1.6094F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(50, 49).mirror().addBox(-0.2989F, -0.5626F, -1.5253F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2641F, -7.0196F, 4.371F, 0.6812F, 0.3458F, 0.7525F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, -2.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r201 = frill.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(11, 31).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1856F, 0.7571F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r202 = frill.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(26, 57).addBox(-1.0F, 1.2031F, 0.0164F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(0, 63).addBox(-0.5F, -0.5969F, 0.0164F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.851F, 1.293F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r203 = frill.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(36, 66).mirror().addBox(-1.1409F, -1.2725F, -0.2772F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1541F, -1.5678F, 2.4176F, -0.1355F, -0.5982F, -2.3662F));

		PartDefinition cube_r204 = frill.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(-0.649F, -1.8326F, -0.519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1724F, 1.5366F, -0.4981F, -0.1934F, -1.0561F));

		PartDefinition cube_r205 = frill.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(66, 46).addBox(-0.351F, -1.8326F, -0.519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1724F, 1.5366F, -0.4981F, 0.1934F, 1.0561F));

		PartDefinition cube_r206 = frill.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(36, 66).addBox(0.1409F, -1.2725F, -0.2772F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1541F, -1.5678F, 2.4176F, -0.1355F, 0.5982F, 2.3662F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.517F, -5.2636F, 3.2365F, 0.0175F, -0.6109F, 0.0F));

		PartDefinition cube_r207 = leftFrill.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(27, 71).addBox(0.3192F, -0.0064F, -0.2714F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8445F, 2.4926F, -0.7639F, 0.5607F, 0.3161F, 1.7665F));

		PartDefinition cube_r208 = leftFrill.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(71, 26).addBox(0.2F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2045F, 4.7564F, -1.3799F, 0.3687F, 0.0836F, 2.7917F));

		PartDefinition cube_r209 = leftFrill.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(71, 26).addBox(-0.0408F, -1.9839F, 0.0665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0523F, 2.6976F, -1.058F, 0.2542F, 0.2824F, 2.1841F));

		PartDefinition cube_r210 = leftFrill.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(55, 41).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3341F, 5.0993F, -1.6451F, 0.4518F, -0.2772F, -2.6709F));

		PartDefinition cube_r211 = leftFrill.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(66, 23).addBox(-1.9238F, -0.9283F, 0.096F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(66, 23).addBox(-3.9238F, -0.9283F, 0.096F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9939F, 4.9702F, -1.6278F, 0.6616F, -0.3635F, -0.8934F));

		PartDefinition cube_r212 = leftFrill.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(66, 23).addBox(-3.9238F, -0.9283F, 0.096F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 23).addBox(-1.9238F, -0.9283F, 0.096F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9939F, 4.9702F, -1.6278F, 0.7199F, -0.1961F, -1.1031F));

		PartDefinition cube_r213 = leftFrill.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(66, 23).addBox(-0.0034F, -0.0742F, -0.0064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6061F, 5.1702F, -3.0278F, 0.5057F, -0.6179F, -0.657F));

		PartDefinition cube_r214 = leftFrill.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(66, 23).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4447F, 5.9527F, -2.7587F, 0.5195F, -0.3553F, -0.6467F));

		PartDefinition cube_r215 = leftFrill.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(52, 27).addBox(-2.3F, -0.2F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5611F, 4.9768F, -1.4894F, -0.6516F, -0.0527F, -0.3909F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.517F, -5.2636F, 3.2365F, 0.0175F, 0.6109F, 0.0F));

		PartDefinition cube_r216 = rightFrill.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(27, 71).mirror().addBox(-1.3192F, -0.0064F, -0.2714F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8445F, 2.4926F, -0.7639F, 0.5607F, -0.3161F, -1.7665F));

		PartDefinition cube_r217 = rightFrill.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(-1.2F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2045F, 4.7564F, -1.3799F, 0.3687F, -0.0836F, -2.7917F));

		PartDefinition cube_r218 = rightFrill.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(-0.9592F, -1.9839F, 0.0665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.0523F, 2.6976F, -1.058F, 0.2542F, -0.2824F, -2.1841F));

		PartDefinition cube_r219 = rightFrill.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(55, 41).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3341F, 5.0993F, -1.6451F, 0.4518F, 0.2772F, 2.6709F));

		PartDefinition cube_r220 = rightFrill.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-0.0762F, -0.9283F, 0.096F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(66, 23).mirror().addBox(1.9238F, -0.9283F, 0.096F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9939F, 4.9702F, -1.6278F, 0.6616F, 0.3635F, 0.8934F));

		PartDefinition cube_r221 = rightFrill.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(1.9238F, -0.9283F, 0.096F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 23).mirror().addBox(-0.0762F, -0.9283F, 0.096F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9939F, 4.9702F, -1.6278F, 0.7199F, 0.1961F, 1.1031F));

		PartDefinition cube_r222 = rightFrill.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-1.9966F, -0.0742F, -0.0064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6061F, 5.1702F, -3.0278F, 0.5057F, 0.6179F, 0.657F));

		PartDefinition cube_r223 = rightFrill.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4447F, 5.9527F, -2.7587F, 0.5195F, 0.3553F, 0.6467F));

		PartDefinition cube_r224 = rightFrill.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(52, 27).mirror().addBox(-0.7F, -0.2F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5611F, 4.9768F, -1.4894F, -0.6516F, 0.0527F, 0.3909F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.5794F, 0.0618F, 0.0722F, 0.0F, 0.0F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(-0.0174F, 1.3808F, -1.1289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.9917F, -1.894F, -1.2741F, -0.3927F, 0.0F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(61, 71).mirror().addBox(0.1826F, -1.6051F, -1.8345F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.9917F, -1.894F, -0.9861F, -0.3927F, 0.0F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(69, 54).mirror().addBox(-0.0174F, -0.1213F, -0.9706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(10, 69).mirror().addBox(-0.0174F, -0.1213F, -1.4706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.9917F, -1.894F, -1.117F, -0.3927F, 0.0F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(66, 50).mirror().addBox(0.7F, -5.1641F, -1.441F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 4.6917F, -2.094F, -0.5877F, -0.4943F, -0.2576F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(46, 68).mirror().addBox(-0.5F, -2.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(22, 68).mirror().addBox(-0.5F, -2.0F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8398F, 3.0824F, -1.4493F, -0.7824F, -0.6124F, 0.0013F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(58, 34).mirror().addBox(0.0F, -4.6F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 4.6917F, -2.094F, -0.0843F, -0.6124F, 0.0013F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(71, 58).addBox(-0.9826F, 1.3808F, -1.1289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 2.9917F, -1.894F, -1.2741F, 0.3927F, 0.0F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(61, 71).addBox(-0.1826F, -1.6051F, -1.8345F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9917F, -1.894F, -0.9861F, 0.3927F, 0.0F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(69, 54).addBox(-0.9826F, -0.1213F, -0.9706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(10, 69).addBox(-0.9826F, -0.1213F, -1.4706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9917F, -1.894F, -1.117F, 0.3927F, 0.0F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(66, 50).addBox(-1.7F, -5.1641F, -1.441F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.6917F, -2.094F, -0.5877F, 0.4943F, 0.2576F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(46, 68).addBox(-0.5F, -2.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(22, 68).addBox(-0.5F, -2.0F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8398F, 3.0824F, -1.4493F, -0.7824F, 0.6124F, -0.0013F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(58, 34).addBox(-1.0F, -4.6F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.6917F, -2.094F, -0.0843F, 0.6124F, -0.0013F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2948F, 3.8016F, -3.5187F, 0.0101F, 0.3654F, 0.0549F));

		PartDefinition cube_r237 = leftLowerbeak.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(66, 59).addBox(-0.5F, -0.3514F, -0.8956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5047F, -0.0599F, -1.0892F, -1.7288F, -0.0045F, 0.0036F));

		PartDefinition cube_r238 = leftLowerbeak.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(41, 68).addBox(-0.5F, -0.9894F, -0.5159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.5F, -0.761F, -1.5876F, -1.4496F, -0.0045F, 0.0036F));

		PartDefinition cube_r239 = leftLowerbeak.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(73, 22).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.4952F, -0.3611F, -1.7279F, 0.0F, 0.0F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2948F, 3.8016F, -3.5187F, 0.0101F, -0.3654F, -0.0549F));

		PartDefinition cube_r240 = rightLowerbeak.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(66, 59).mirror().addBox(-0.5F, -0.3514F, -0.8956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5047F, -0.0599F, -1.0892F, -1.7288F, 0.0045F, -0.0036F));

		PartDefinition cube_r241 = rightLowerbeak.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(41, 68).mirror().addBox(-0.5F, -0.9894F, -0.5159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.761F, -1.5876F, -1.4496F, 0.0045F, -0.0036F));

		PartDefinition cube_r242 = rightLowerbeak.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(73, 22).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4952F, -0.3611F, -1.7279F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7329F, 3.8332F, -0.4456F, 0.1974F, -0.0934F));

		PartDefinition cube_r243 = tail.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(9, 76).addBox(0.0F, -0.8F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 38).addBox(0.0F, -3.5F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 68).addBox(0.0F, -2.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4678F, 4.3457F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r244 = tail.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(67, 73).addBox(0.0F, -2.0F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6152F, 5.6698F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r245 = tail.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(64, 73).addBox(0.0F, -2.7F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 76).addBox(0.0F, -2.0F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.9F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2002F, 6.8895F, 0.0915F, 0.3042F, 0.0275F));

		PartDefinition cube_r246 = tail2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(74, 61).addBox(0.0F, -2.9F, 3.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 73).addBox(0.0F, -2.9F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 75).addBox(0.0F, -2.6F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r247 = tail2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(12, 76).addBox(0.0F, 3.0F, 6.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 69).addBox(0.0F, 1.2F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 75).addBox(0.0F, 0.0F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2678F, -2.5543F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1193F, 5.9522F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition cube_r248 = tail3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(55, 46).addBox(0.0F, 6.4F, 10.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 25).addBox(0.0F, 7.4F, 12.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3678F, -12.5543F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r249 = tail3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(43, 75).addBox(0.0F, -1.8F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 49).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3774F, 1.9047F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r250 = tail3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(75, 0).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4226F, -0.1047F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(13, 37).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2379F, 4.9912F, 0.0366F, -0.3052F, -0.011F));

		PartDefinition cube_r251 = tail4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(76, 36).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5051F, 1.3217F, -0.288F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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