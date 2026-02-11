package fossils.fossils.client.blockentity.model.tethyshadros;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TethyshadrosFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart opposablePinkie3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart opposablePinkie4;
	private final ModelPart chest3;
	private final ModelPart chest2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone;
	private final ModelPart bone4;
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
	private final ModelPart tail8;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail9;

	public TethyshadrosFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftArm4 = this.chest.getChild("leftArm4");
		this.leftArm7 = this.leftArm4.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.opposablePinkie3 = this.leftArm8.getChild("opposablePinkie3");
		this.rightArm4 = this.chest.getChild("rightArm4");
		this.rightArm7 = this.rightArm4.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.opposablePinkie4 = this.rightArm8.getChild("opposablePinkie4");
		this.chest3 = this.chest.getChild("chest3");
		this.chest2 = this.chest3.getChild("chest2");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck = this.neck6.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.heads = this.neck7.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
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
		this.tail8 = this.hips.getChild("tail8");
		this.tail = this.tail8.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail9 = this.tail7.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -42.0005F, 0.865F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 44).mirror().addBox(-3.0F, 2.6F, 1.8F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 44).addBox(1.0F, 2.6F, 1.8F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0114F, -2.0615F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 126).addBox(0.0F, -4.2F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0205F, 5.6454F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(99, 125).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.298F, 2.6607F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(94, 125).addBox(0.0F, -4.525F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7156F, -0.3101F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 19).addBox(-1.0F, -0.1F, 5.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(58, 67).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(84, 27).addBox(1.0F, 1.0F, -6.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(84, 27).mirror().addBox(-3.0F, 1.0F, -6.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8146F, -0.2962F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 117).addBox(0.0F, -5.3F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 125).addBox(0.0F, -4.7F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(48, 19).addBox(-1.0F, -1.9555F, -6.9243F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.9848F, -6.0835F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 116).addBox(0.0F, -5.0647F, -0.0963F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.9555F, -2.8243F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(50, 85).addBox(0.0F, -4.5576F, -1.0985F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.9555F, -4.8243F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-2.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -1.9303F, 0.1237F, -0.0341F, -0.9996F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 138).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -1.9303F, 0.1116F, -0.0205F, -0.5633F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(65, 45).mirror().addBox(-3.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -5.1303F, 0.1362F, 0.0904F, -1.4319F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(86, 25).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -5.1303F, 0.1615F, 0.0246F, -0.9998F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(116, 137).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -5.1303F, 0.1706F, 0.0168F, -0.5634F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 10).addBox(1.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -1.9303F, 0.1237F, 0.0341F, 0.9996F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 138).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -1.9303F, 0.1116F, 0.0205F, 0.5633F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(65, 45).addBox(2.8937F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -5.1303F, 0.1362F, -0.0904F, 1.4319F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(86, 25).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -5.1303F, 0.1615F, -0.0246F, 0.9998F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 137).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -5.1303F, 0.1706F, -0.0168F, 0.5634F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.9956F, -6.9303F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r20 = body3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(121, 120).addBox(0.0F, -4.4791F, 0.0071F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4615F, -2.0009F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(107, 120).addBox(0.0F, -3.9437F, -0.0022F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4615F, -5.0009F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(67, 12).addBox(-1.0F, -0.1094F, -0.0631F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6401F, -5.8941F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(109, 137).mirror().addBox(-4.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.0F, 0.1535F, 0.2113F, -1.4293F));

		PartDefinition cube_r24 = body3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.0F, 0.2279F, 0.1273F, -0.9947F));

		PartDefinition cube_r25 = body3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(137, 39).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.0F, 0.2742F, 0.0818F, -0.5583F));

		PartDefinition cube_r26 = body3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(33, 31).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -4.1F, 0.3396F, 0.1076F, -0.5524F));

		PartDefinition cube_r27 = body3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -4.1F, 0.2766F, 0.1781F, -0.9875F));

		PartDefinition cube_r28 = body3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(-8.8936F, -2.4262F, -0.2666F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -4.1F, 0.1764F, 0.2777F, -1.424F));

		PartDefinition cube_r29 = body3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(109, 137).addBox(2.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, 0.1535F, -0.2113F, 1.4293F));

		PartDefinition cube_r30 = body3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(73, 29).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, 0.2279F, -0.1273F, 0.9947F));

		PartDefinition cube_r31 = body3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(137, 39).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, 0.2742F, -0.0818F, 0.5583F));

		PartDefinition cube_r32 = body3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(33, 31).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.3396F, -0.1076F, 0.5524F));

		PartDefinition cube_r33 = body3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(71, 10).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.2766F, -0.1781F, 0.9875F));

		PartDefinition cube_r34 = body3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 12).addBox(2.8937F, -2.4262F, -0.2666F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.1764F, -0.2777F, 1.424F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(56, 76).addBox(-1.0F, 19.9774F, -6.0065F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4275F, -5.8865F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(123, 22).addBox(0.0F, -3.9855F, 0.0093F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0671F, -2.0483F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(122, 97).addBox(0.0F, -3.8022F, -0.104F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.5896F, -4.501F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(90, 68).mirror().addBox(-0.4234F, -0.0182F, -0.5616F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4065F, 19.7373F, 1.7359F, 0.4185F, -0.7372F, -0.0789F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(71, 79).mirror().addBox(-0.4234F, 1.3375F, 4.2294F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4065F, 19.7373F, 1.7359F, 0.7327F, -0.7372F, -0.0789F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(140, 2).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.6729F, 0.2727F, -0.4551F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-12.8936F, -2.4262F, -0.2666F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.2666F, 0.635F, -1.3501F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(113, 106).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.5183F, 0.4645F, -0.8766F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(100, 90).mirror().addBox(-0.448F, 0.0073F, -0.0851F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 20.0673F, 0.3412F, 0.889F, -0.7451F, -0.7854F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-0.448F, 1.2F, 3.7237F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 20.0673F, 0.3412F, 1.2032F, -0.7451F, -0.7854F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(111, 72).mirror().addBox(-0.4234F, -0.0182F, 0.4384F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1065F, 20.0373F, 1.0359F, 0.194F, -0.8508F, 0.0836F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.4234F, 1.3375F, 4.2294F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1065F, 20.0373F, 1.0359F, 0.5081F, -0.8508F, 0.0836F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(109, 95).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4391F, 20.0145F, 0.8033F, 0.6398F, -0.7692F, -0.4601F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 62).mirror().addBox(-0.5F, 1.2193F, 3.8069F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4391F, 20.0145F, 0.8033F, 0.9539F, -0.7692F, -0.4601F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.6024F, 0.5019F, -0.8089F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-17.8937F, -2.4262F, -0.2666F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.3294F, 0.7023F, -1.2826F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(24, 138).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.7594F, 0.2771F, -0.403F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(140, 2).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.6729F, -0.2727F, 0.4551F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(64, 0).addBox(2.8937F, -2.4262F, -0.2666F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.2666F, -0.635F, 1.3501F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(113, 106).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.5183F, -0.4645F, 0.8766F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(100, 90).addBox(-0.552F, 0.0073F, -0.0851F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4463F, 20.0673F, 0.3412F, 0.889F, 0.7451F, 0.7854F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 110).addBox(-0.552F, 1.2F, 3.7237F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4463F, 20.0673F, 0.3412F, 1.2032F, 0.7451F, 0.7854F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(71, 79).addBox(-0.5766F, 1.3375F, 4.2294F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4065F, 19.7373F, 1.7359F, 0.7327F, 0.7372F, 0.0789F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 68).addBox(-0.5766F, -0.0182F, -0.5616F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4065F, 19.7373F, 1.7359F, 0.4185F, 0.7372F, 0.0789F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(111, 72).addBox(-0.5766F, -0.0182F, 0.4384F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1065F, 20.0373F, 1.0359F, 0.194F, 0.8508F, -0.0836F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 82).addBox(-0.5766F, 1.3375F, 4.2294F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1065F, 20.0373F, 1.0359F, 0.5081F, 0.8508F, -0.0836F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(109, 95).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4391F, 20.0145F, 0.8033F, 0.6398F, 0.7692F, 0.4601F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(90, 62).addBox(-0.5F, 1.2193F, 3.8069F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4391F, 20.0145F, 0.8033F, 0.9539F, 0.7692F, 0.4601F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(118, 52).addBox(-3.4039F, 0.4997F, -2.4825F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9039F, 18.8666F, 0.9995F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(87, 0).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.6024F, -0.5019F, 0.8089F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(75, 71).addBox(-1.0F, -0.0448F, -0.0381F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6612F, -4.6119F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 31).addBox(2.8937F, -2.4262F, -0.2666F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.3294F, -0.7023F, 1.2826F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(24, 138).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.7594F, -0.2771F, 0.403F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.0F, 9.3141F, -2.9142F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(86, 16).addBox(0.8837F, -1.1122F, -5.8426F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.3146F, -4.0438F, 1.5077F, 0.144F, 1.1561F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(119, 0).addBox(-1.2157F, -1.3122F, -1.5822F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.5146F, -4.0438F, 1.4331F, 0.0759F, 0.5009F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(124, 128).addBox(-0.5F, 2.3302F, -1.4213F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(110, 0).addBox(-0.5F, 0.3302F, -0.2213F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(80, 109).addBox(-0.5F, -3.3151F, -0.685F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(31, 2).addBox(-0.5F, -0.0191F, 0.002F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.57F, -3.7038F, 0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(70, 45).addBox(-0.5F, 0.7444F, -0.0313F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.605F, -3.5807F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.7F, -3.325F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.5296F, 2.629F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(121, 32).addBox(-0.5F, -1.0053F, -3.0028F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.58F, 5.7462F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(117, 128).addBox(-0.5F, -1.9F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.3108F, 2.9506F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(114, 26).addBox(-0.5F, -2.0153F, -2.965F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -4.18F, 4.9462F, 1.1781F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-5.0F, 9.3141F, -2.9142F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(86, 16).mirror().addBox(-1.8837F, -1.1122F, -5.8426F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.3146F, -4.0438F, 1.5077F, -0.144F, -1.1561F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(0.2157F, -1.3122F, -1.5822F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.5146F, -4.0438F, 1.4331F, -0.0759F, -0.5009F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(124, 128).mirror().addBox(-0.5F, 2.3302F, -1.4213F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(-0.5F, 0.3302F, -0.2213F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(80, 109).mirror().addBox(-0.5F, -3.3151F, -0.685F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(31, 2).mirror().addBox(-0.5F, -0.0191F, 0.002F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.57F, -3.7038F, 0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(70, 45).mirror().addBox(-0.5F, 0.7444F, -0.0313F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.605F, -3.5807F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.5F, -0.7F, -3.325F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5296F, 2.629F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(121, 32).mirror().addBox(-0.5F, -1.0053F, -3.0028F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.58F, 5.7462F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(117, 128).mirror().addBox(-0.5F, -1.9F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.3108F, 2.9506F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(114, 26).mirror().addBox(-0.5F, -2.0153F, -2.965F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.18F, 4.9462F, 1.1781F, 0.0F, 0.0F));

		PartDefinition leftArm4 = chest.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7157F, 17.5256F, -4.7284F, 1.2078F, 0.0694F, 0.0774F));

		PartDefinition cube_r89 = leftArm4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(135, 13).addBox(-0.5F, -0.25F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 10.0381F, 1.4869F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftArm4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(135, 9).addBox(-0.5F, -0.65F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 10.0381F, 1.4869F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftArm4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(79, 137).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 9.371F, 0.759F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftArm4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(141, 53).addBox(-0.5F, -0.0571F, 0.037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 6.9997F, 0.366F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftArm4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(74, 137).addBox(-0.5F, -2.4618F, -0.2581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 6.9997F, 0.366F, 0.4012F, 0.0043F, 0.0036F));

		PartDefinition cube_r94 = leftArm4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(69, 137).addBox(-0.5F, -2.4618F, 0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 6.9997F, 0.366F, 0.2179F, 0.0043F, 0.0036F));

		PartDefinition cube_r95 = leftArm4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 132).addBox(-0.375F, -0.9F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3893F, 0.7872F, 0.0425F, -2.7699F, -0.3577F, -0.0811F));

		PartDefinition cube_r96 = leftArm4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(64, 133).addBox(-0.3621F, -4.5022F, -0.8335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0263F, 5.8936F, 0.3562F, 0.2019F, -0.456F, -0.1553F));

		PartDefinition cube_r97 = leftArm4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 133).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2043F, 2.4085F, -0.788F, 0.071F, -0.456F, -0.1553F));

		PartDefinition cube_r98 = leftArm4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(141, 49).addBox(-0.4621F, -2.1263F, -0.524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 5.8936F, 0.3562F, 0.6382F, -0.456F, -0.1553F));

		PartDefinition cube_r99 = leftArm4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(135, 5).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3803F, 0.231F, 0.6832F, -0.6997F, 0.0179F, -0.143F));

		PartDefinition cube_r100 = leftArm4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(55, 137).addBox(-0.5F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1406F, 1.9281F, 0.4292F, -0.1325F, 0.0179F, -0.143F));

		PartDefinition cube_r101 = leftArm4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(50, 137).addBox(-0.4878F, -2.9992F, -0.2304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 5.8936F, 0.3562F, 0.0595F, 0.0179F, -0.0033F));

		PartDefinition leftArm7 = leftArm4.addOrReplaceChild("leftArm7", CubeListBuilder.create().texOffs(47, 111).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(107, 108).addBox(-0.5909F, 0.8921F, -1.3717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.285F, 10.8218F, 0.8549F, -1.6391F, -0.2477F, -1.0655F));

		PartDefinition cube_r102 = leftArm7.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(126, 109).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create().texOffs(21, 121).addBox(-0.6767F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2666F, 11.075F, -0.192F, 0.2046F, 0.3325F, 0.4746F));

		PartDefinition cube_r103 = leftArm8.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(145, 66).addBox(-0.5F, -0.4F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.0153F, 5.9502F, -0.051F, -0.1745F, 0.0F, -0.3054F));

		PartDefinition cube_r104 = leftArm8.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(145, 63).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.0153F, 5.9502F, -0.051F, 0.1745F, 0.0F, -0.3054F));

		PartDefinition cube_r105 = leftArm8.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(36, 121).addBox(-0.5F, 1.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, -0.951F, -0.5433F, -0.0349F, 0.0F, 0.0F));

		PartDefinition opposablePinkie3 = leftArm8.addOrReplaceChild("opposablePinkie3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1321F, -0.8271F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r106 = opposablePinkie3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(62, 14).addBox(-0.5F, -1.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0945F, 2.5179F, -0.4517F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = chest.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7157F, 17.5256F, -4.7284F, 1.3383F, -0.0916F, -0.049F));

		PartDefinition cube_r107 = rightArm4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(135, 105).addBox(-0.5F, -0.25F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 10.0381F, 1.4869F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightArm4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(135, 27).addBox(-0.5F, -0.65F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 10.0381F, 1.4869F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightArm4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(104, 137).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 9.371F, 0.759F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightArm4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(141, 77).addBox(-0.5F, -0.0571F, 0.037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 6.9997F, 0.366F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightArm4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(99, 137).addBox(-0.5F, -2.4618F, -0.2581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 6.9997F, 0.366F, 0.4012F, -0.0043F, -0.0036F));

		PartDefinition cube_r112 = rightArm4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(94, 137).addBox(-0.5F, -2.4618F, 0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 6.9997F, 0.366F, 0.2179F, -0.0043F, -0.0036F));

		PartDefinition cube_r113 = rightArm4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(77, 132).addBox(-0.625F, -0.9F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3893F, 0.7872F, 0.0425F, -2.7699F, 0.3577F, 0.0811F));

		PartDefinition cube_r114 = rightArm4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(135, 113).addBox(-0.6379F, -4.5022F, -0.8335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0263F, 5.8936F, 0.3562F, 0.2019F, 0.456F, 0.1553F));

		PartDefinition cube_r115 = rightArm4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(135, 21).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2043F, 2.4085F, -0.788F, 0.071F, 0.456F, 0.1553F));

		PartDefinition cube_r116 = rightArm4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(141, 73).addBox(-0.5379F, -2.1263F, -0.524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 5.8936F, 0.3562F, 0.6382F, 0.456F, 0.1553F));

		PartDefinition cube_r117 = rightArm4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(135, 17).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3803F, 0.231F, 0.6832F, -0.6997F, -0.0179F, 0.143F));

		PartDefinition cube_r118 = rightArm4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(89, 137).addBox(-0.5F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1406F, 1.9281F, 0.4292F, -0.1325F, -0.0179F, 0.143F));

		PartDefinition cube_r119 = rightArm4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(84, 137).addBox(-0.5122F, -2.9992F, -0.2304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 5.8936F, 0.3562F, 0.0595F, -0.0179F, 0.0033F));

		PartDefinition rightArm7 = rightArm4.addOrReplaceChild("rightArm7", CubeListBuilder.create().texOffs(52, 111).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(22, 109).addBox(-0.4091F, 0.8921F, -1.3717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.285F, 10.8218F, 0.8549F, -1.7403F, 0.4503F, 1.1521F));

		PartDefinition cube_r120 = rightArm7.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(127, 47).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create().texOffs(41, 121).addBox(-0.3233F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2666F, 11.075F, -0.192F, 0.3421F, -0.1878F, -0.9963F));

		PartDefinition cube_r121 = rightArm8.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(145, 69).addBox(-0.5F, -0.4F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0153F, 5.9502F, -0.051F, -0.1745F, 0.0F, 0.3054F));

		PartDefinition cube_r122 = rightArm8.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(68, 145).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0153F, 5.9502F, -0.051F, 0.1745F, 0.0F, 0.3054F));

		PartDefinition cube_r123 = rightArm8.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(121, 64).addBox(-0.5F, 1.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, -0.951F, -0.5433F, -0.0349F, 0.0F, 0.0F));

		PartDefinition opposablePinkie4 = rightArm8.addOrReplaceChild("opposablePinkie4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1321F, -0.8271F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r124 = opposablePinkie4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(19, 136).addBox(-0.5F, -1.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0945F, 2.5179F, -0.4517F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest3 = chest.addOrReplaceChild("chest3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8612F, -4.6119F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(138, 57).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9629F, -1.0921F, 0.8876F, 0.3236F, -0.3473F));

		PartDefinition cube_r126 = chest3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(43, 138).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9629F, -1.0921F, 0.7138F, 0.5921F, -0.7332F));

		PartDefinition cube_r127 = chest3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(25, 17).mirror().addBox(-18.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9629F, -1.0921F, 0.3881F, 0.8263F, -1.2241F));

		PartDefinition cube_r128 = chest3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(25, 17).addBox(2.765F, -1.9458F, -0.318F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9629F, -1.0921F, 0.3881F, -0.8263F, 1.2241F));

		PartDefinition cube_r129 = chest3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(43, 138).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9629F, -1.0921F, 0.7138F, -0.5921F, 0.7332F));

		PartDefinition cube_r130 = chest3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(138, 57).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9629F, -1.0921F, 0.8876F, -0.3236F, 0.3473F));

		PartDefinition cube_r131 = chest3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(60, 122).addBox(0.0F, -3.8781F, -0.1018F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.5842F, -2.3105F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chest3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(85, 55).addBox(-1.0F, -0.0448F, -3.9381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, 0.7243F, 0.0F, 0.0F));

		PartDefinition chest2 = chest3.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 2.8832F, -2.327F, 0.2254F, 0.0659F, 0.1043F));

		PartDefinition cube_r133 = chest2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(48, 29).mirror().addBox(-13.729F, -1.955F, -0.2993F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3F, -2.8F, 0.3956F, 0.7044F, -1.2261F));

		PartDefinition cube_r134 = chest2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(138, 121).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3F, -2.8F, 0.6547F, 0.4812F, -0.7706F));

		PartDefinition cube_r135 = chest2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(138, 119).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3F, -2.8F, 0.795F, 0.24F, -0.3803F));

		PartDefinition cube_r136 = chest2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(138, 94).mirror().addBox(-1.4539F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.7253F, 0.2393F, -0.3622F));

		PartDefinition cube_r137 = chest2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(103, 72).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.5851F, 0.4543F, -0.7674F));

		PartDefinition cube_r138 = chest2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(31, 15).mirror().addBox(-16.7415F, -1.9518F, -0.3082F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.3392F, 0.6528F, -1.2269F));

		PartDefinition cube_r139 = chest2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(138, 59).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.6772F, 0.2409F, -0.3894F));

		PartDefinition cube_r140 = chest2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(80, 100).mirror().addBox(-3.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.5369F, 0.437F, -0.8039F));

		PartDefinition cube_r141 = chest2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-17.7647F, -1.946F, -0.3188F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.3003F, 0.618F, -1.2657F));

		PartDefinition cube_r142 = chest2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(48, 29).addBox(2.729F, -1.955F, -0.2993F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -2.8F, 0.3956F, -0.7044F, 1.2261F));

		PartDefinition cube_r143 = chest2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(123, 57).addBox(0.0F, -2.7784F, -0.0756F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 0.0452F, -1.0481F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(44, 101).addBox(0.0F, -1.5777F, -0.0314F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 4.4153F, -5.3777F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(24, 91).addBox(0.0F, -2.4502F, -0.0382F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 3.0153F, -3.8777F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(33, 122).addBox(0.0F, -3.0278F, -0.0698F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.443F, -2.4443F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(51, 47).addBox(-1.0F, -0.0865F, -2.1546F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.943F, -3.7443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(138, 121).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -2.8F, 0.6547F, -0.4812F, 0.7706F));

		PartDefinition cube_r149 = chest2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(138, 119).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -2.8F, 0.795F, -0.24F, 0.3803F));

		PartDefinition cube_r150 = chest2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(138, 94).addBox(-0.5461F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.7253F, -0.2393F, 0.3622F));

		PartDefinition cube_r151 = chest2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(103, 72).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.5851F, -0.4543F, 0.7674F));

		PartDefinition cube_r152 = chest2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(31, 15).addBox(2.7415F, -1.9518F, -0.3082F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.3392F, -0.6528F, 1.2269F));

		PartDefinition cube_r153 = chest2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(138, 59).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.6772F, -0.2409F, 0.3894F));

		PartDefinition cube_r154 = chest2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(80, 100).addBox(1.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.5369F, -0.437F, 0.8039F));

		PartDefinition cube_r155 = chest2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(31, 0).addBox(2.7647F, -1.946F, -0.3188F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.3003F, -0.618F, 1.2657F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.6509F, -4.2561F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(110, 26).addBox(0.0F, -1.691F, -0.0268F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9772F, -2.9376F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r157 = neck4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(93, 25).mirror().addBox(-3.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -2.2439F, 0.2232F, 0.9281F, -1.3687F));

		PartDefinition cube_r158 = neck4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(140, 0).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -2.2439F, 0.6652F, 0.7334F, -0.7806F));

		PartDefinition cube_r159 = neck4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(116, 139).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -2.2439F, 0.9098F, 0.4685F, -0.3562F));

		PartDefinition cube_r160 = neck4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(67, 27).mirror().addBox(-9.729F, -1.955F, -0.2993F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, -0.4439F, 0.5328F, 0.9304F, -1.1253F));

		PartDefinition cube_r161 = neck4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(109, 139).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, -0.4439F, 0.8731F, 0.6415F, -0.6536F));

		PartDefinition cube_r162 = neck4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(138, 131).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, -0.4439F, 1.0342F, 0.3235F, -0.3134F));

		PartDefinition cube_r163 = neck4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(93, 25).addBox(2.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -2.2439F, 0.2232F, -0.9281F, 1.3687F));

		PartDefinition cube_r164 = neck4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(140, 0).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -2.2439F, 0.6652F, -0.7334F, 0.7806F));

		PartDefinition cube_r165 = neck4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(116, 139).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -2.2439F, 0.9098F, -0.4685F, 0.3562F));

		PartDefinition cube_r166 = neck4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(67, 27).addBox(2.729F, -1.955F, -0.2993F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, -0.4439F, 0.5328F, -0.9304F, 1.1253F));

		PartDefinition cube_r167 = neck4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(109, 139).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, -0.4439F, 0.8731F, -0.6415F, 0.6536F));

		PartDefinition cube_r168 = neck4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(138, 131).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, -0.4439F, 1.0342F, -0.3235F, 0.3134F));

		PartDefinition cube_r169 = neck4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(102, 102).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2016F, -2.0737F, 0.0792F, 0.1305F, 0.0103F));

		PartDefinition cube_r170 = neck3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(71, 76).addBox(0.0F, -2.4487F, 4.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 102).addBox(-0.5F, -1.9487F, 3.0661F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8164F, -6.3763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5735F, -3.3438F, -0.349F, 0.0013F, 0.0025F));

		PartDefinition cube_r171 = neck2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(146, 40).addBox(0.0F, -0.8018F, 5.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(65, 139).addBox(0.0F, -0.8018F, 7.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(98, 46).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -7.2263F, -6.8488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(9, 117).addBox(-0.5F, -3.75F, -0.9206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(76, 124).addBox(0.0F, -1.75F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 125).addBox(0.0F, -3.75F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7838F, -2.5662F, 0.3665F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(53, 122).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(99, 30).addBox(0.0F, -2.0F, 0.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2939F, 0.002F, -0.288F, 0.0F, 0.0F));

		PartDefinition neck = neck6.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5632F, 0.2188F, -0.8856F, 0.015F, -0.1565F));

		PartDefinition cube_r172 = neck.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(26, 122).addBox(0.0F, -1.4F, -1.65F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.561F, -0.9041F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r173 = neck.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(112, 108).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1035F, -2.1872F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r174 = neck7.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(128, 6).addBox(-0.5F, -0.675F, -0.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck7.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0799F, -1.1963F, -0.3493F, 0.0421F, -0.0113F));

		PartDefinition cube_r175 = heads.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(11, 104).addBox(-0.5F, -0.4089F, -0.3344F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.3622F, -13.597F, 0.7112F, 0.0F, 0.0F));

		PartDefinition cube_r176 = heads.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(23, 144).addBox(-0.7F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(143, 90).addBox(-0.3F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 142).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.6316F, -14.55F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r177 = heads.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(75, 142).addBox(-0.5F, -0.3353F, -1.1657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 3.3622F, -13.597F, 0.4407F, 0.0F, 0.0F));

		PartDefinition cube_r178 = heads.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 120).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 2.0923F, -5.0757F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r179 = heads.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(111, 77).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.4031F, 1.4956F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r180 = heads.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(136, 88).addBox(-1.3504F, -0.1758F, 0.2676F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3504F, 2.6253F, -13.7773F, -1.9556F, 0.0F, 0.0F));

		PartDefinition cube_r181 = heads.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(136, 85).addBox(-1.3504F, -0.2549F, -0.7578F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3504F, 2.6253F, -13.7773F, -0.5157F, 0.0F, 0.0F));

		PartDefinition cube_r182 = heads.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(136, 82).addBox(-1.3504F, -0.7589F, -0.2428F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3504F, 2.6253F, -13.7773F, 0.8806F, 0.0F, 0.0F));

		PartDefinition cube_r183 = heads.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(121, 37).addBox(-1.3504F, -0.8472F, 0.2517F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3504F, 2.6253F, -13.7773F, 0.706F, 0.0F, 0.0F));

		PartDefinition cube_r184 = heads.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(31, 136).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.298F, 1.0495F, 2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r185 = heads.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(129, 94).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9541F, 0.2947F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r186 = heads.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(127, 102).addBox(-2.0F, -0.1F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -2.897F, -0.4101F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r187 = heads.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(111, 92).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -3.3085F, -0.9764F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r188 = heads.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(110, 19).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.5616F, -6.9143F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r189 = heads.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(65, 86).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.2561F, -2.9757F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r190 = heads.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(89, 87).addBox(-1.5F, -1.2F, -1.6F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0984F, -1.3448F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r191 = heads.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(55, 105).addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.4398F, -0.3377F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r192 = heads.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(123, 138).addBox(-0.5F, -0.1436F, -0.0781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 3.0484F, -14.84F, 1.0167F, 0.0F, 0.0F));

		PartDefinition cube_r193 = heads.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(10, 140).addBox(-0.5F, -0.0666F, -0.1033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.696F, -14.0031F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r194 = heads.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(70, 63).addBox(-0.5F, -0.0666F, -0.1033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.3264F, -14.4956F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r195 = heads.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(134, 49).addBox(-0.5F, -0.125F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(134, 45).addBox(-0.5F, -0.125F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -1.4661F, -9.6509F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r196 = heads.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(120, 77).addBox(-0.5F, -0.125F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.539F, -11.1938F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r197 = heads.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(71, 113).addBox(-0.5F, -0.125F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.1655F, -13.4152F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r198 = heads.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(98, 53).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.6113F, -9.776F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2997F, -1.6604F, -2.7839F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(91, 133).addBox(-0.2453F, -0.5226F, -1.0983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.274F, 0.4593F, 3.3577F, -1.2443F, 0.0005F, -0.1296F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(133, 70).addBox(-0.2445F, -1.2218F, -0.3148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.274F, 0.4593F, 3.3577F, -2.2479F, 0.0005F, -0.1296F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(126, 105).addBox(-1.2445F, 0.3849F, -0.2851F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.274F, 0.4593F, 3.3577F, 2.8747F, 0.0005F, -0.1296F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(132, 142).addBox(-0.2445F, -0.0622F, -1.1311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.274F, 0.4593F, 3.3577F, -2.5795F, 0.0005F, -0.1296F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(70, 142).addBox(-0.2445F, -0.487F, -1.0877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.274F, 0.4593F, 3.3577F, -2.7715F, 0.0005F, -0.1296F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(65, 142).addBox(-0.2445F, -1.12F, -0.3553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.274F, 0.4593F, 3.3577F, -1.6806F, 0.0005F, -0.1296F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(57, 117).addBox(-0.1038F, -0.9695F, -3.8429F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.387F, 0.5349F, -4.6482F, 0.5884F, 0.0756F, -0.1316F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(53, 142).addBox(-0.3216F, -0.7001F, 2.035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2067F, 3.0446F, -5.438F, -0.2918F, 0.0939F, -0.0466F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(89, 109).addBox(-0.3902F, -2.2261F, -0.887F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2067F, 3.0446F, -5.438F, -0.0644F, 0.1213F, -0.0443F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(78, 145).addBox(-0.1718F, -2.5714F, 0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 142).addBox(-0.1718F, -2.5714F, -0.545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5689F, 3.7784F, -5.9478F, 1.4474F, -0.0048F, -0.0769F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(143, 81).addBox(-0.0289F, -2.2538F, -0.6799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(128, 26).addBox(-0.0289F, -1.9538F, -1.6799F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5689F, 3.7784F, -5.9478F, 0.1769F, 0.0823F, -0.0771F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 104).addBox(-1.975F, -0.3F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9828F, -1.0076F, 1.1455F, -0.2156F, 0.0546F, -0.0913F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(108, 7).addBox(-1.5F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.1859F, -1.3155F, -4.2237F, 0.6613F, 0.0993F, -0.1475F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(99, 0).addBox(-1.5F, -2.025F, 0.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.9166F, 0.6829F, -4.4968F, -0.037F, 0.1342F, -0.1488F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(98, 95).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0734F, -1.4909F, 0.273F, 0.1188F, 0.1279F, -0.0911F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(48, 142).addBox(-0.5F, -0.625F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.468F, 5.6167F, 1.6463F, 0.6882F, 0.0538F, -0.157F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 139).addBox(-0.5F, -1.475F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6266F, 4.7544F, 1.2406F, -0.0099F, 0.0538F, -0.157F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(26, 128).addBox(-1.0213F, -1.7055F, -1.9253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5645F, 1.1326F, 2.63F, -0.4821F, 0.0512F, -0.2097F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(46, 122).addBox(-1.0213F, -0.3805F, -1.4003F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5885F, 1.175F, 1.9995F, -0.2436F, 0.0648F, -0.1591F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(138, 138).addBox(0.5271F, -0.733F, -1.8252F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5689F, 3.7784F, -5.9478F, 0.1319F, 0.0487F, 0.1082F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(128, 21).addBox(0.1817F, 0.0524F, -0.4666F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2067F, 3.0446F, -5.438F, -0.0567F, 0.0698F, 0.0F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(36, 141).addBox(-0.5036F, 0.4313F, 0.1677F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F))
				.texOffs(15, 141).addBox(-0.5036F, 0.4313F, 0.3677F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(140, 133).addBox(-0.5036F, 0.4313F, 0.7677F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, -1.5991F, 0.1188F, -0.1513F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(5, 132).addBox(-0.5036F, -0.2926F, 0.4716F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, -1.9918F, 0.1188F, -0.1513F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(126, 71).addBox(-0.5036F, -2.0746F, -0.4484F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, -2.9517F, 0.1188F, -0.1513F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(131, 129).addBox(-0.5036F, -1.1963F, -1.8388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F))
				.texOffs(131, 57).addBox(-0.5036F, 0.7334F, -0.9622F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, 2.3715F, 0.1188F, -0.1513F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(131, 124).addBox(-0.5036F, -0.4938F, -1.9075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, 2.8079F, 0.1188F, -0.1513F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(131, 119).addBox(-0.5036F, 0.7005F, -1.7383F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, 2.5897F, 0.1188F, -0.1513F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(120, 82).addBox(-0.5036F, 0.6131F, -0.4997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(114, 58).addBox(-0.5036F, -0.6869F, -0.4997F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, 1.6298F, 0.1188F, -0.1513F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(140, 113).addBox(-0.5036F, -2.4303F, -0.0272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, 0.5389F, 0.1188F, -0.1513F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(140, 109).addBox(-0.5036F, -2.3614F, -0.0973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, 0.696F, 0.1188F, -0.1513F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(140, 69).addBox(-0.5036F, -2.3214F, -0.2476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, 0.8182F, 0.1188F, -0.1513F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(130, 36).addBox(-0.5213F, -1.5262F, -1.9322F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, -0.1532F, 0.1174F, -0.1372F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(128, 16).addBox(-0.5213F, -0.2633F, -1.9003F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9048F, 1.2904F, -0.2708F, -0.5459F, 0.1174F, -0.1372F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(133, 66).addBox(-0.3895F, 0.1977F, -1.6046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F))
				.texOffs(133, 62).addBox(-0.3895F, -0.2023F, -1.6046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, 2.9611F, 0.1137F, -0.2066F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(142, 34).addBox(-0.3895F, 0.2814F, -1.7739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(142, 28).addBox(-0.3895F, 0.2814F, -1.5988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(142, 16).addBox(-0.3895F, 0.2977F, -0.8973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, -3.1039F, 0.1137F, -0.2066F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(142, 25).addBox(-0.3895F, 0.2935F, -1.1851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, -3.1214F, 0.1137F, -0.2066F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(133, 138).addBox(-0.4361F, -0.7326F, -0.433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(128, 138).addBox(-0.4361F, -0.7326F, -0.633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(138, 123).addBox(-0.4361F, -0.7326F, -0.033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, -3.0231F, 0.1548F, -0.1709F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(29, 143).addBox(-0.4361F, -0.315F, 0.5577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, -1.2428F, 0.1548F, -0.1709F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 143).addBox(-0.4361F, 0.5817F, -0.4045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, -0.1956F, 0.1548F, -0.1709F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(142, 142).addBox(-0.4361F, 0.4442F, -0.8871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, 0.1971F, 0.1548F, -0.1709F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(140, 65).addBox(-0.4361F, -1.2953F, -1.243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, 1.2006F, 0.1548F, -0.1709F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(140, 61).addBox(-0.4361F, -1.5847F, -0.7542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 140).addBox(-0.4361F, -1.5847F, -0.3792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, 1.6021F, 0.1548F, -0.1709F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(134, 53).addBox(-0.4361F, -0.774F, -0.4637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, 2.562F, 0.1548F, -0.1709F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(138, 127).addBox(-0.4361F, -0.525F, -0.3085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, -2.4122F, 0.1548F, -0.1709F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(142, 13).addBox(-0.6111F, -0.6078F, -0.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 10).addBox(-0.7861F, -0.6078F, -0.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, 0.1185F, 0.1548F, -0.1709F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(128, 11).addBox(-0.4361F, -1.0372F, -0.6276F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-1.5536F, 0.1733F, -3.3513F, -0.6843F, 0.1548F, -0.1709F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(126, 65).addBox(-1.0541F, -3.9214F, 0.368F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8231F, 3.734F, -3.172F, 1.0406F, 0.0821F, -0.1386F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(130, 31).addBox(-1.0052F, -2.0158F, -0.0676F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8231F, 3.734F, -3.172F, 0.6015F, 0.1273F, -0.1653F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(24, 140).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1334F, 4.4287F, -2.3908F, -0.6639F, 0.1273F, -0.1479F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(140, 21).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.983F, 4.5912F, -1.4156F, -0.1839F, 0.1273F, -0.1479F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(113, 100).addBox(-0.5F, -0.55F, -1.65F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0593F, 2.8822F, -0.0377F, 0.1652F, 0.1273F, -0.1479F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(5, 144).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6394F, 6.2004F, -11.8099F, 1.0928F, 0.8748F, 1.0097F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(143, 137).addBox(-0.55F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7343F, 6.3552F, -12.0379F, 1.2561F, 0.9289F, 1.2176F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(143, 126).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.037F, 6.5177F, -12.2868F, 1.5576F, 0.9651F, 1.5875F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(143, 123).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.3949F, 6.6395F, -12.4794F, 1.8506F, 0.9368F, 1.9461F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(143, 100).addBox(-0.3F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.8539F, 6.6064F, -12.4533F, 1.9595F, 0.9082F, 2.0827F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(10, 144).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.7076F, 6.5145F, -12.8408F, 1.0941F, 0.5442F, 1.0422F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(143, 87).addBox(-0.8F, -0.5F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(143, 84).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.1612F, 6.6092F, -12.4247F, 0.9671F, 0.8072F, 0.8413F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(137, 31).addBox(-1.8F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.4193F, 6.4356F, -12.7132F, 1.0941F, 0.5442F, 1.0422F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(5, 137).addBox(-1.8F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.9319F, 6.2523F, -12.4256F, 0.9059F, 0.4086F, 0.8059F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(58, 143).addBox(-0.8F, -0.8125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.7271F, 6.6451F, -11.9071F, 0.7882F, 0.6386F, 0.5727F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(142, 7).addBox(0.0534F, -0.9913F, -1.4465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.7904F, 5.9259F, -10.5681F, 0.6902F, 0.449F, 0.3441F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(136, 101).addBox(-1.75F, -0.2F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5783F, 5.9075F, -12.1328F, 1.1029F, 0.1456F, 0.3058F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(136, 101).addBox(-1.8F, -0.2F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5783F, 5.9075F, -12.1328F, 1.1275F, 0.1756F, 0.4878F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(142, 4).addBox(-0.5F, -0.25F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.8226F, 5.8449F, -11.9628F, 1.0829F, 0.449F, 0.3441F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(142, 4).addBox(-0.9F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4834F, 5.9664F, -12.1364F, 1.0416F, 0.398F, 0.2438F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(114, 141).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7904F, 5.9259F, -10.5681F, 0.4012F, 0.0777F, 0.1054F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(109, 141).addBox(-0.9651F, -0.9864F, -0.0067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3283F, 5.953F, -10.6159F, 0.6653F, -0.2353F, -0.0777F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(60, 130).addBox(-0.9651F, -0.943F, 0.9918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3283F, 5.953F, -10.6159F, 0.7089F, -0.2353F, -0.0777F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(27, 117).addBox(0.1252F, -2.2891F, -6.1018F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.387F, 0.5349F, -4.6482F, 0.9607F, 0.0865F, -0.0004F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(134, 78).addBox(-0.6519F, -1.6273F, -6.1059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.837F, 0.0349F, -4.6482F, 0.7426F, 0.105F, 0.1062F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(136, 91).addBox(-1.3504F, -1.6305F, 0.1164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.6496F, 4.2988F, -10.9934F, 3.0622F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(134, 74).addBox(-0.75F, -0.325F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.1103F, 4.1551F, -9.8432F, 1.1629F, -0.1121F, -0.2614F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(103, 66).addBox(-0.7974F, -0.7733F, -4.4258F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.837F, 0.0349F, -4.6482F, 0.5334F, 0.0892F, 0.0533F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(120, 87).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.775F, 4.0202F, -10.55F, 0.8029F, -0.0121F, -0.0126F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2997F, -1.6604F, -2.7839F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(91, 133).mirror().addBox(-0.7547F, -0.5226F, -1.0983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.274F, 0.4593F, 3.3577F, -1.2443F, -0.0005F, 0.1296F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(133, 70).mirror().addBox(-0.7555F, -1.2218F, -0.3148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.274F, 0.4593F, 3.3577F, -2.2479F, -0.0005F, 0.1296F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(126, 105).mirror().addBox(-0.7555F, 0.3849F, -0.2851F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.274F, 0.4593F, 3.3577F, 2.8747F, -0.0005F, 0.1296F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(132, 142).mirror().addBox(-0.7555F, -0.0622F, -1.1311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.274F, 0.4593F, 3.3577F, -2.5795F, -0.0005F, 0.1296F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(70, 142).mirror().addBox(-0.7555F, -0.487F, -1.0877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.274F, 0.4593F, 3.3577F, -2.7715F, -0.0005F, 0.1296F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(65, 142).mirror().addBox(-0.7555F, -1.12F, -0.3553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.274F, 0.4593F, 3.3577F, -1.6806F, -0.0005F, 0.1296F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(57, 117).mirror().addBox(-0.8962F, -0.9695F, -3.8429F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.387F, 0.5349F, -4.6482F, 0.5884F, -0.0756F, 0.1316F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(53, 142).mirror().addBox(-0.6784F, -0.7001F, 2.035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.2067F, 3.0446F, -5.438F, -0.2918F, -0.0939F, 0.0466F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(89, 109).mirror().addBox(-0.6098F, -2.2261F, -0.887F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.2067F, 3.0446F, -5.438F, -0.0644F, -0.1213F, 0.0443F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(78, 145).mirror().addBox(-0.8282F, -2.5714F, 0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 142).mirror().addBox(-0.8282F, -2.5714F, -0.545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5689F, 3.7784F, -5.9478F, 1.4474F, 0.0048F, 0.0769F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(143, 81).mirror().addBox(-0.9711F, -2.2538F, -0.6799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(128, 26).mirror().addBox(-0.9711F, -1.9538F, -1.6799F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5689F, 3.7784F, -5.9478F, 0.1769F, -0.0823F, 0.0771F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.025F, -0.3F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.9828F, -1.0076F, 1.1455F, -0.2156F, -0.0546F, 0.0913F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(108, 7).mirror().addBox(-0.5F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.1859F, -1.3155F, -4.2237F, 0.6613F, -0.0993F, 0.1475F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-0.5F, -2.025F, 0.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.9166F, 0.6829F, -4.4968F, -0.037F, -0.1342F, 0.1488F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(98, 95).mirror().addBox(0.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.0734F, -1.4909F, 0.273F, 0.1188F, -0.1279F, 0.0911F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(48, 142).mirror().addBox(-0.5F, -0.625F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.468F, 5.6167F, 1.6463F, 0.6882F, -0.0538F, 0.157F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 139).mirror().addBox(-0.5F, -1.475F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6266F, 4.7544F, 1.2406F, -0.0099F, -0.0538F, 0.157F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(26, 128).mirror().addBox(0.0213F, -1.7055F, -1.9253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5645F, 1.1326F, 2.63F, -0.4821F, -0.0512F, 0.2097F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(46, 122).mirror().addBox(0.0213F, -0.3805F, -1.4003F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5885F, 1.175F, 1.9995F, -0.2436F, -0.0648F, 0.1591F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(138, 138).mirror().addBox(-0.5271F, -0.733F, -1.8252F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5689F, 3.7784F, -5.9478F, 0.1319F, -0.0487F, -0.1082F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(128, 21).mirror().addBox(-0.1817F, 0.0524F, -0.4666F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2067F, 3.0446F, -5.438F, -0.0567F, -0.0698F, 0.0F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(36, 141).mirror().addBox(-0.4964F, 0.4313F, 0.1677F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F)).mirror(false)
				.texOffs(15, 141).mirror().addBox(-0.4964F, 0.4313F, 0.3677F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(140, 133).mirror().addBox(-0.4964F, 0.4313F, 0.7677F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, -1.5991F, -0.1188F, 0.1513F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(5, 132).mirror().addBox(-0.4964F, -0.2926F, 0.4716F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, -1.9918F, -0.1188F, 0.1513F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(126, 71).mirror().addBox(-0.4964F, -2.0746F, -0.4484F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, -2.9517F, -0.1188F, 0.1513F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(131, 129).mirror().addBox(-0.4964F, -1.1963F, -1.8388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(131, 57).mirror().addBox(-0.4964F, 0.7334F, -0.9622F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, 2.3715F, -0.1188F, 0.1513F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(131, 124).mirror().addBox(-0.4964F, -0.4938F, -1.9075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, 2.8079F, -0.1188F, 0.1513F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(131, 119).mirror().addBox(-0.4964F, 0.7005F, -1.7383F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, 2.5897F, -0.1188F, 0.1513F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(120, 82).mirror().addBox(-0.4964F, 0.6131F, -0.4997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(114, 58).mirror().addBox(-0.4964F, -0.6869F, -0.4997F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, 1.6298F, -0.1188F, 0.1513F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(140, 113).mirror().addBox(-0.4964F, -2.4303F, -0.0272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, 0.5389F, -0.1188F, 0.1513F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(140, 109).mirror().addBox(-0.4964F, -2.3614F, -0.0973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, 0.696F, -0.1188F, 0.1513F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(140, 69).mirror().addBox(-0.4964F, -2.3214F, -0.2476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, 0.8182F, -0.1188F, 0.1513F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(130, 36).mirror().addBox(-0.4787F, -1.5262F, -1.9322F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, -0.1532F, -0.1174F, 0.1372F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(128, 16).mirror().addBox(-0.4787F, -0.2633F, -1.9003F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.9048F, 1.2904F, -0.2708F, -0.5459F, -0.1174F, 0.1372F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(133, 66).mirror().addBox(-0.6105F, 0.1977F, -1.6046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(133, 62).mirror().addBox(-0.6105F, -0.2023F, -1.6046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, 2.9611F, -0.1137F, 0.2066F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(142, 34).mirror().addBox(-0.6105F, 0.2814F, -1.7739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(142, 28).mirror().addBox(-0.6105F, 0.2814F, -1.5988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(142, 16).mirror().addBox(-0.6105F, 0.2977F, -0.8973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, -3.1039F, -0.1137F, 0.2066F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(142, 25).mirror().addBox(-0.6105F, 0.2935F, -1.1851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, -3.1214F, -0.1137F, 0.2066F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(133, 138).mirror().addBox(-0.5639F, -0.7326F, -0.433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(128, 138).mirror().addBox(-0.5639F, -0.7326F, -0.633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(138, 123).mirror().addBox(-0.5639F, -0.7326F, -0.033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, -3.0231F, -0.1548F, 0.1709F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(29, 143).mirror().addBox(-0.5639F, -0.315F, 0.5577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, -1.2428F, -0.1548F, 0.1709F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 143).mirror().addBox(-0.5639F, 0.5817F, -0.4045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, -0.1956F, -0.1548F, 0.1709F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(142, 142).mirror().addBox(-0.5639F, 0.4442F, -0.8871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, 0.1971F, -0.1548F, 0.1709F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(140, 65).mirror().addBox(-0.5639F, -1.2953F, -1.243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, 1.2006F, -0.1548F, 0.1709F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(140, 61).mirror().addBox(-0.5639F, -1.5847F, -0.7542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(43, 140).mirror().addBox(-0.5639F, -1.5847F, -0.3792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, 1.6021F, -0.1548F, 0.1709F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(134, 53).mirror().addBox(-0.5639F, -0.774F, -0.4637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, 2.562F, -0.1548F, 0.1709F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(138, 127).mirror().addBox(-0.5639F, -0.525F, -0.3085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, -2.4122F, -0.1548F, 0.1709F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(142, 13).mirror().addBox(-0.3889F, -0.6078F, -0.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(142, 10).mirror().addBox(-0.2139F, -0.6078F, -0.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, 0.1185F, -0.1548F, 0.1709F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(128, 11).mirror().addBox(-0.5639F, -1.0372F, -0.6276F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 0.1733F, -3.3513F, -0.6843F, -0.1548F, 0.1709F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(126, 65).mirror().addBox(0.0541F, -3.9214F, 0.368F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8231F, 3.734F, -3.172F, 1.0406F, -0.0821F, 0.1386F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(130, 31).mirror().addBox(0.0052F, -2.0158F, -0.0676F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8231F, 3.734F, -3.172F, 0.6015F, -0.1273F, 0.1653F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(24, 140).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1334F, 4.4287F, -2.3908F, -0.6639F, -0.1273F, 0.1479F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(140, 21).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.983F, 4.5912F, -1.4156F, -0.1839F, -0.1273F, 0.1479F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(113, 100).mirror().addBox(-0.5F, -0.55F, -1.65F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0593F, 2.8822F, -0.0377F, 0.1652F, -0.1273F, 0.1479F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(5, 144).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6394F, 6.2004F, -11.8099F, 1.0928F, -0.8748F, -1.0097F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(143, 137).mirror().addBox(-0.45F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7343F, 6.3552F, -12.0379F, 1.2561F, -0.9289F, -1.2176F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(143, 126).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.037F, 6.5177F, -12.2868F, 1.5576F, -0.9651F, -1.5875F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(143, 123).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.3949F, 6.6395F, -12.4794F, 1.8506F, -0.9368F, -1.9461F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(143, 100).mirror().addBox(-0.7F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.8539F, 6.6064F, -12.4533F, 1.9595F, -0.9082F, -2.0827F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(10, 144).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.7076F, 6.5145F, -12.8408F, 1.0941F, -0.5442F, -1.0422F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(143, 87).mirror().addBox(-0.2F, -0.5F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(143, 84).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.1612F, 6.6092F, -12.4247F, 0.9671F, -0.8072F, -0.8413F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(137, 31).mirror().addBox(-0.2F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.4193F, 6.4356F, -12.7132F, 1.0941F, -0.5442F, -1.0422F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(5, 137).mirror().addBox(-0.2F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.9319F, 6.2523F, -12.4256F, 0.9059F, -0.4086F, -0.8059F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(58, 143).mirror().addBox(-0.2F, -0.8125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.7271F, 6.6451F, -11.9071F, 0.7882F, -0.6386F, -0.5727F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(142, 7).mirror().addBox(-1.0534F, -0.9913F, -1.4465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.7904F, 5.9259F, -10.5681F, 0.6902F, -0.449F, -0.3441F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(136, 101).mirror().addBox(-0.25F, -0.2F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5783F, 5.9075F, -12.1328F, 1.1029F, -0.1456F, -0.3058F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(136, 101).mirror().addBox(-0.2F, -0.2F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5783F, 5.9075F, -12.1328F, 1.1275F, -0.1756F, -0.4878F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(142, 4).mirror().addBox(-0.5F, -0.25F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.8226F, 5.8449F, -11.9628F, 1.0829F, -0.449F, -0.3441F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(142, 4).mirror().addBox(-0.1F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4834F, 5.9664F, -12.1364F, 1.0416F, -0.398F, -0.2438F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(114, 141).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7904F, 5.9259F, -10.5681F, 0.4012F, -0.0777F, -0.1054F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(109, 141).mirror().addBox(-0.0349F, -0.9864F, -0.0067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3283F, 5.953F, -10.6159F, 0.6653F, 0.2353F, 0.0777F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(60, 130).mirror().addBox(-0.0349F, -0.943F, 0.9918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3283F, 5.953F, -10.6159F, 0.7089F, 0.2353F, 0.0777F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(27, 117).mirror().addBox(-1.1252F, -2.2891F, -6.1018F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.387F, 0.5349F, -4.6482F, 0.9607F, -0.0865F, 0.0004F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(134, 78).mirror().addBox(-0.3481F, -1.6273F, -6.1059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.837F, 0.0349F, -4.6482F, 0.7426F, -0.105F, -0.1062F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(136, 91).mirror().addBox(-0.6495F, -1.6305F, 0.1164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.6496F, 4.2988F, -10.9934F, 3.0622F, 0.0F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(134, 74).mirror().addBox(-0.25F, -0.325F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.1103F, 4.1551F, -9.8432F, 1.1629F, 0.1121F, 0.2614F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(103, 66).mirror().addBox(-0.2026F, -0.7733F, -4.4258F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.837F, 0.0349F, -4.6482F, 0.5334F, -0.0892F, -0.0533F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(120, 87).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.775F, 4.0202F, -10.55F, 0.8029F, 0.0121F, 0.0126F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1483F, -0.6378F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(73, 145).mirror().addBox(-0.848F, -0.8797F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5082F, 0.143F, -13.0298F, 1.0048F, 0.2437F, 0.0172F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(137, 34).mirror().addBox(-0.2F, -2.7612F, -0.3237F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0984F, 1.164F, -3.2011F, -1.5467F, -0.1746F, 0.0069F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(38, 136).mirror().addBox(-0.2F, -2.8097F, -0.7717F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2321F, -5.5567F, -1.7191F, -0.4363F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(63, 145).mirror().addBox(-0.55F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2686F, -0.3809F, -13.5204F, 0.1164F, 1.0193F, -1.2651F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(145, 60).mirror().addBox(-1.15F, -1.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(145, 57).mirror().addBox(-0.825F, -0.925F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 145).mirror().addBox(-0.475F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0717F, -0.3167F, -13.7473F, 0.71F, 0.8145F, -0.5331F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(46, 145).mirror().addBox(-0.9095F, 0.5282F, 0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0344F, 0.0544F, -13.9104F, 0.7945F, 0.1553F, 0.0251F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(34, 145).mirror().addBox(-0.9095F, -0.1341F, -0.066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0344F, 0.0544F, -13.9104F, 1.0563F, 0.1553F, 0.0251F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(146, 46).mirror().addBox(-0.1041F, -2.8415F, -6.408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 0.0262F, -0.1571F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(141, 45).mirror().addBox(1.8269F, -11.005F, 4.2906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 1.9812F, 0.0874F, -0.1023F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(141, 41).mirror().addBox(1.8269F, -10.3441F, 0.4418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 1.5885F, 0.0874F, -0.1023F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(145, 22).mirror().addBox(-0.848F, -0.0994F, -0.4762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5082F, 0.143F, -13.0298F, 0.743F, 0.2437F, 0.0172F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(145, 19).mirror().addBox(1.8269F, -3.0966F, -11.1112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 0.2795F, 0.0874F, -0.1023F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(15, 145).mirror().addBox(0.6438F, -0.3392F, -9.7947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(126, 134).mirror().addBox(0.6438F, 0.4608F, -10.7947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.0698F, -0.0173F, 0.0024F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(133, 134).mirror().addBox(0.6438F, -6.9646F, -8.2711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 0.6719F, -0.0173F, 0.0024F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(113, 144).mirror().addBox(-0.4648F, 1.3869F, -1.2041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -1.1956F, -0.1745F, 0.0F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(108, 144).mirror().addBox(-0.4878F, -0.3563F, -4.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.9637F, -0.227F, -0.0165F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(41, 144).mirror().addBox(-0.4878F, -1.8177F, -4.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.4401F, -0.227F, -0.0165F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(134, 97).mirror().addBox(-0.5029F, -1.4485F, -2.1298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(90, 142).mirror().addBox(-0.5029F, -0.1967F, 0.1962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.0262F, -0.2967F, 0.0F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(144, 37).mirror().addBox(-0.5029F, -1.7334F, -2.1073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -2.2951F, -0.2967F, 0.0F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(144, 31).mirror().addBox(-0.5029F, -1.5773F, 0.3202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -1.0297F, -0.2967F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(112, 133).mirror().addBox(-0.4878F, 1.7647F, -3.757F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(128, 114).mirror().addBox(-0.4878F, 0.7544F, -1.8229F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -1.4873F, -0.227F, -0.0165F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(119, 142).mirror().addBox(-0.4878F, 0.0505F, -4.1878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.8764F, -0.227F, -0.0165F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(142, 104).mirror().addBox(-0.0643F, -3.566F, -7.9424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 0.1918F, -0.1046F, 0.0055F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(100, 142).mirror().addBox(0.6403F, -5.8699F, -7.4054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 0.5149F, -0.0175F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(133, 109).mirror().addBox(-0.0643F, -2.18F, -7.484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.0001F, -0.1046F, 0.0055F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(95, 142).mirror().addBox(-0.3548F, -1.886F, -5.6522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.0528F, -0.157F, 0.0055F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(104, 128).mirror().addBox(-0.3946F, -1.573F, -4.7788F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.1222F, -0.1571F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(53, 128).mirror().addBox(-0.5029F, -0.8627F, -3.1626F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.8552F, -0.2967F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(85, 142).mirror().addBox(-0.5029F, -0.8631F, -0.6711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 0.4974F, -0.2967F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(60, 139).mirror().addBox(-0.2041F, -1.9596F, -5.7343F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.1309F, -0.1571F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(31, 139).mirror().addBox(-0.1041F, -3.3892F, -8.1359F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 0.1134F, -0.1571F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(46, 128).mirror().addBox(0.6403F, -1.7745F, -8.9128F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 0.0698F, -0.0175F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(118, 47).mirror().addBox(-0.3438F, -1.0875F, -7.472F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.0262F, -0.1571F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(105, 133).mirror().addBox(-0.5029F, -0.2703F, -1.6173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.2793F, -0.2967F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(118, 42).mirror().addBox(-0.3284F, -0.6488F, -7.072F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, 0.0555F, -0.1517F, -0.041F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(98, 133).mirror().addBox(-0.4648F, -0.1763F, -4.2495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1641F, 0.2437F, -1.2072F, -0.0611F, -0.1745F, 0.0F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(112, 133).addBox(-0.5122F, 1.7647F, -3.757F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(128, 114).addBox(-0.5122F, 0.7544F, -1.8229F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -1.4873F, 0.227F, 0.0165F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(108, 144).addBox(-0.5122F, -0.3563F, -4.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.9637F, 0.227F, 0.0165F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(41, 144).addBox(-0.5122F, -1.8177F, -4.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.4401F, 0.227F, 0.0165F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(119, 142).addBox(-0.5122F, 0.0505F, -4.1878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.8764F, 0.227F, 0.0165F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(142, 104).addBox(-0.9357F, -3.566F, -7.9424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 0.1918F, 0.1046F, -0.0055F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(100, 142).addBox(-1.6403F, -5.8699F, -7.4054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 0.5149F, 0.0175F, 0.0F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(133, 109).addBox(-0.9357F, -2.18F, -7.484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.0001F, 0.1046F, -0.0055F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(95, 142).addBox(-0.6452F, -1.886F, -5.6522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.0528F, 0.157F, -0.0055F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(104, 128).addBox(-0.6054F, -1.573F, -4.7788F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.1222F, 0.1571F, 0.0F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(53, 128).addBox(-0.4971F, -0.8627F, -3.1626F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.8552F, 0.2967F, 0.0F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(144, 37).addBox(-0.4971F, -1.7334F, -2.1073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -2.2951F, 0.2967F, 0.0F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(144, 31).addBox(-0.4971F, -1.5773F, 0.3202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -1.0297F, 0.2967F, 0.0F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(90, 142).addBox(-0.4971F, -0.1967F, 0.1962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 97).addBox(-0.4971F, -1.4485F, -2.1298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.0262F, 0.2967F, 0.0F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(85, 142).addBox(-0.4971F, -0.8631F, -0.6711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 0.4974F, 0.2967F, 0.0F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(60, 139).addBox(0.2041F, -1.9596F, -5.7343F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.1309F, 0.1571F, 0.0F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(146, 46).addBox(0.1041F, -2.8415F, -6.408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 0.0262F, 0.1571F, 0.0F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(31, 139).addBox(0.1041F, -3.3892F, -8.1359F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 0.1134F, 0.1571F, 0.0F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(133, 134).addBox(-1.6438F, -6.9646F, -8.2711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 0.6719F, 0.0173F, -0.0024F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(15, 145).addBox(-1.6438F, -0.3392F, -9.7947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(126, 134).addBox(-1.6438F, 0.4608F, -10.7947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.0698F, 0.0173F, -0.0024F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(141, 45).addBox(-2.8269F, -11.005F, 4.2906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 1.9812F, -0.0874F, 0.1023F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(141, 41).addBox(-2.8269F, -10.3441F, 0.4418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 1.5885F, -0.0874F, 0.1023F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(34, 145).addBox(-0.0905F, -0.1341F, -0.066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0344F, 0.0544F, -13.9104F, 1.0563F, -0.1553F, -0.0251F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(63, 145).addBox(-0.45F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2686F, -0.3809F, -13.5204F, 0.1164F, -1.0193F, 1.2651F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(145, 60).addBox(0.15F, -1.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(145, 57).addBox(-0.175F, -0.925F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(51, 145).addBox(-0.525F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0717F, -0.3167F, -13.7473F, 0.71F, -0.8145F, 0.5331F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(73, 145).addBox(-0.152F, -0.8797F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5082F, 0.143F, -13.0298F, 1.0048F, -0.2437F, -0.0172F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(46, 145).addBox(-0.0905F, 0.5282F, 0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0344F, 0.0544F, -13.9104F, 0.7945F, -0.1553F, -0.0251F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(145, 22).addBox(-0.152F, -0.0994F, -0.4762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5082F, 0.143F, -13.0298F, 0.743F, -0.2437F, -0.0172F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(145, 19).addBox(-2.8269F, -3.0966F, -11.1112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 0.2795F, -0.0874F, 0.1023F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(46, 128).addBox(-1.6403F, -1.7745F, -8.9128F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 0.0698F, 0.0175F, 0.0F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(118, 47).addBox(-0.6562F, -1.0875F, -7.472F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.0262F, 0.1571F, 0.0F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(105, 133).addBox(-0.4971F, -0.2703F, -1.6173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.2793F, 0.2967F, 0.0F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(118, 42).addBox(-0.6716F, -0.6488F, -7.072F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, 0.0555F, 0.1517F, 0.041F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(137, 34).addBox(-0.8F, -2.7612F, -0.3237F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0984F, 1.164F, -3.2011F, -1.5467F, 0.1746F, -0.0069F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(38, 136).addBox(-0.8F, -2.8097F, -0.7717F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.2321F, -5.5567F, -1.7191F, 0.4363F, 0.0F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(113, 144).addBox(-0.5352F, 1.3869F, -1.2041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -1.1956F, 0.1745F, 0.0F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(98, 133).addBox(-0.5352F, -0.1763F, -4.2495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1641F, 0.2437F, -1.2072F, -0.0611F, 0.1745F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7829F, -0.3988F, 3.3686F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r421 = bone.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(119, 7).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6354F, 8.9672F, 2.763F, -0.7851F, -0.192F, -0.0034F));

		PartDefinition cube_r422 = bone.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(80, 116).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2545F, 7.4971F, 0.7771F, -0.628F, -0.192F, -0.0034F));

		PartDefinition cube_r423 = bone.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(0, 74).addBox(-0.578F, -0.8274F, -0.8642F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2761F, 5.8647F, -3.877F, -0.4535F, -0.192F, -0.0034F));

		PartDefinition cube_r424 = bone.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(65, 83).addBox(-1.871F, 3.2755F, 3.1307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, 0.5653F, 0.2899F, -0.0768F));

		PartDefinition cube_r425 = bone.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(129, 77).addBox(-0.5F, -1.9F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4263F, 3.9691F, 7.4353F, 1.0835F, 0.2935F, -0.1795F));

		PartDefinition cube_r426 = bone.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(103, 36).addBox(-0.3436F, -2.3629F, -1.5438F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0182F, 2.3854F, 7.5825F, 1.1708F, 0.2935F, -0.1795F));

		PartDefinition cube_r427 = bone.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(57, 133).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1537F, 2.8217F, 1.6444F, -0.0857F, 0.1966F, -0.0726F));

		PartDefinition cube_r428 = bone.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(50, 133).addBox(-0.5635F, -1.2766F, -4.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7583F, 1.0092F, 6.5452F, 0.4815F, 0.1966F, -0.0726F));

		PartDefinition cube_r429 = bone.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(80, 102).addBox(-0.5F, -0.85F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3048F, 1.7007F, 4.4105F, -0.312F, 0.199F, -0.0656F));

		PartDefinition cube_r430 = bone.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(36, 116).addBox(-0.75F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5751F, -0.8195F, 1.478F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r431 = bone.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(15, 83).addBox(-1.4997F, -0.3634F, -0.7461F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, -0.1985F, 0.199F, -0.0656F));

		PartDefinition cube_r432 = bone.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(141, 96).addBox(-0.5F, 1.4F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 129).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4503F, 0.8126F, 9.0745F, 0.1483F, 0.2981F, -0.1309F));

		PartDefinition cube_r433 = bone.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(0, 97).addBox(-1.871F, 0.2917F, 3.2203F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, -0.0542F, 0.2899F, -0.0768F));

		PartDefinition cube_r434 = bone.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(43, 76).addBox(-0.65F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2829F, 0.1797F, 1.4953F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r435 = bone.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(0, 115).addBox(-0.3881F, -0.0095F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2169F, -1.7503F, 1.0969F, -0.237F, 0.08F, -0.0349F));

		PartDefinition cube_r436 = bone.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(112, 36).addBox(-0.5F, -1.3F, -2.225F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2182F, -0.5057F, -2.561F, -0.4542F, -0.1308F, 0.0057F));

		PartDefinition cube_r437 = bone.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(129, 84).addBox(-0.3486F, -0.0973F, -0.5173F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.186F, -2.6442F, -3.8732F, 0.1916F, -0.1308F, 0.0057F));

		PartDefinition cube_r438 = bone.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(83, 145).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(76, 127).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5423F, -2.302F, -0.0179F, -0.3058F, -0.1308F, 0.0057F));

		PartDefinition cube_r439 = bone.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(5, 140).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3371F, 0.4348F, -7.1241F, -1.0752F, -0.1278F, 0.0285F));

		PartDefinition cube_r440 = bone.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(127, 142).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4652F, 0.4105F, -8.1155F, -0.028F, -0.1278F, 0.0285F));

		PartDefinition cube_r441 = bone.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(88, 145).addBox(-0.5F, -1.6F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 133).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7262F, -0.0697F, -10.0394F, -0.2462F, -0.1278F, 0.0285F));

		PartDefinition cube_r442 = bone.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(114, 32).addBox(-0.582F, -1.0955F, -6.7992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0988F, -2.7357F, -3.9239F, 0.4258F, -0.1278F, 0.0285F));

		PartDefinition cube_r443 = bone.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(85, 41).addBox(-0.582F, 0.0085F, -4.9486F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0988F, -2.7357F, -3.9239F, 0.1989F, -0.1278F, 0.0285F));

		PartDefinition cube_r444 = bone.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(24, 96).addBox(-0.582F, -0.0366F, -4.5572F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0988F, -2.7357F, -3.9239F, 0.2731F, -0.1278F, 0.0285F));

		PartDefinition cube_r445 = bone.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(12, 134).addBox(-0.5F, -1.05F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(111, 86).addBox(-0.5F, -0.45F, -1.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3255F, 4.7083F, -10.6855F, 0.3914F, -0.095F, 0.0305F));

		PartDefinition cube_r446 = bone.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(87, 121).addBox(-0.5208F, -1.0663F, -0.0812F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5725F, 5.1648F, -12.7771F, -1.2128F, -0.1309F, -0.0034F));

		PartDefinition cube_r447 = bone.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(112, 114).addBox(-0.5F, -0.5F, -1.525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2416F, 3.7249F, -9.5729F, -0.2805F, -0.1295F, 0.0195F));

		PartDefinition cube_r448 = bone.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(129, 89).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8788F, 3.8764F, -14.7076F, 0.0672F, -0.1241F, 0.0417F));

		PartDefinition cube_r449 = bone.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(126, 0).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6788F, 3.1392F, -12.8592F, 0.3727F, -0.1241F, 0.0417F));

		PartDefinition cube_r450 = bone.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(80, 121).addBox(-0.4886F, -2.0171F, 0.2289F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5725F, 5.1648F, -12.7771F, 0.1545F, -0.1241F, 0.0417F));

		PartDefinition cube_r451 = bone.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(70, 54).addBox(-0.8466F, -2.0208F, 0.0235F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1147F, 5.3171F, -6.1549F, -0.253F, -0.0259F, 0.0043F));

		PartDefinition cube_r452 = bone.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(87, 95).addBox(-0.8466F, -0.5208F, -4.7765F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0549F, 3.7223F, -4.4467F, 0.0504F, -0.1273F, 0.0307F));

		PartDefinition cube_r453 = bone.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(119, 12).addBox(-0.488F, -0.7596F, -1.5106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6371F, 18.9422F, 19.286F, -0.7043F, 0.0169F, -0.0325F));

		PartDefinition cube_r454 = bone.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(112, 119).addBox(-0.8261F, 0.007F, 0.0228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.2493F, 15.2276F, 16.6102F, -0.8083F, -0.0284F, 0.0079F));

		PartDefinition cube_r455 = bone.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(98, 120).addBox(-0.8261F, -0.193F, 0.0228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1667F, 13.4398F, 14.1942F, -0.7036F, -0.0284F, 0.0079F));

		PartDefinition cube_r456 = bone.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(44, 105).addBox(-0.5979F, -0.6123F, -4.8055F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8891F, 11.4095F, 9.4559F, -0.3786F, -0.1823F, 0.053F));

		PartDefinition cube_r457 = bone.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(71, 119).addBox(0.051F, -1.2674F, 2.8173F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.2891F, 11.4095F, 8.7559F, -0.551F, -0.1348F, 0.0022F));

		PartDefinition cube_r458 = bone.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(119, 17).addBox(0.051F, -0.8971F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.2891F, 11.4095F, 8.7559F, -0.4288F, -0.1348F, 0.0022F));

		PartDefinition cube_r459 = bone.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(103, 30).addBox(-0.4722F, -0.6491F, -4.5961F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8891F, 11.4095F, 9.4559F, -0.4115F, -0.1872F, 0.0022F));

		PartDefinition cube_r460 = bone.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(134, 41).addBox(-0.5F, -0.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0545F, 9.4327F, 5.1268F, -0.6972F, -0.1565F, -0.0511F));

		PartDefinition cube_r461 = bone.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(127, 52).addBox(-0.5F, -2.7F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6219F, 7.7537F, 1.8459F, -1.788F, -0.1565F, -0.0511F));

		PartDefinition cube_r462 = bone.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(28, 76).addBox(-0.5F, -0.5F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9137F, 8.5238F, 3.9417F, -0.5139F, -0.1565F, -0.0511F));

		PartDefinition cube_r463 = bone.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(90, 74).addBox(-0.5F, -0.675F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8936F, 8.3862F, 3.7701F, -0.5925F, -0.1565F, -0.0511F));

		PartDefinition cube_r464 = bone.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(75, 63).addBox(-0.5F, -0.675F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8936F, 8.3862F, 3.7701F, -0.6361F, -0.1565F, -0.0511F));

		PartDefinition cube_r465 = bone.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(71, 2).addBox(-0.5F, -0.675F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8936F, 8.3862F, 3.7701F, -0.8979F, -0.1565F, -0.0511F));

		PartDefinition cube_r466 = bone.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(57, 111).addBox(-0.5F, -1.3F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4992F, 5.2196F, 0.2938F, -0.8077F, -0.1321F, -0.0532F));

		PartDefinition cube_r467 = bone.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(22, 103).addBox(-0.5F, -0.7F, -4.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6674F, 6.265F, 1.9198F, -1.2419F, -0.2615F, -0.0405F));

		PartDefinition cube_r468 = bone.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(114, 64).addBox(-0.7829F, -1.4919F, -0.0188F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.8441F, -4.4808F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r469 = bone.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(28, 63).addBox(-0.7829F, -0.7919F, -2.8938F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7829F, -0.3988F, 3.3686F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r470 = bone4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(119, 7).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6354F, 8.9672F, 2.763F, -0.7851F, 0.192F, 0.0034F));

		PartDefinition cube_r471 = bone4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(80, 116).mirror().addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2545F, 7.4971F, 0.7771F, -0.628F, 0.192F, 0.0034F));

		PartDefinition cube_r472 = bone4.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.422F, -0.8274F, -0.8642F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2761F, 5.8647F, -3.877F, -0.4535F, 0.192F, 0.0034F));

		PartDefinition cube_r473 = bone4.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(0.871F, 3.2755F, 3.1307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, 0.5653F, -0.2899F, 0.0768F));

		PartDefinition cube_r474 = bone4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(129, 77).mirror().addBox(-0.5F, -1.9F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4263F, 3.9691F, 7.4353F, 1.0835F, -0.2935F, 0.1795F));

		PartDefinition cube_r475 = bone4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(103, 36).mirror().addBox(-0.6564F, -2.3629F, -1.5438F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 2.3854F, 7.5825F, 1.1708F, -0.2935F, 0.1795F));

		PartDefinition cube_r476 = bone4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(57, 133).mirror().addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1537F, 2.8217F, 1.6444F, -0.0857F, -0.1966F, 0.0726F));

		PartDefinition cube_r477 = bone4.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(50, 133).mirror().addBox(-0.4365F, -1.2766F, -4.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0092F, 6.5452F, 0.4815F, -0.1966F, 0.0726F));

		PartDefinition cube_r478 = bone4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(80, 102).mirror().addBox(-0.5F, -0.85F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3048F, 1.7007F, 4.4105F, -0.312F, -0.199F, 0.0656F));

		PartDefinition cube_r479 = bone4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(36, 116).mirror().addBox(-0.25F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5751F, -0.8195F, 1.478F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r480 = bone4.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(0.4997F, -0.3634F, -0.7461F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, -0.1985F, -0.199F, 0.0656F));

		PartDefinition cube_r481 = bone4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(141, 96).mirror().addBox(-0.5F, 1.4F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 129).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4503F, 0.8126F, 9.0745F, 0.1483F, -0.2981F, 0.1309F));

		PartDefinition cube_r482 = bone4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(0.871F, 0.2917F, 3.2203F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, -0.0542F, -0.2899F, 0.0768F));

		PartDefinition cube_r483 = bone4.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(43, 76).mirror().addBox(-0.35F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2829F, 0.1797F, 1.4953F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r484 = bone4.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-0.6119F, -0.0095F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2169F, -1.7503F, 1.0969F, -0.237F, -0.08F, 0.0349F));

		PartDefinition cube_r485 = bone4.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(112, 36).mirror().addBox(-0.5F, -1.3F, -2.225F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2182F, -0.5057F, -2.561F, -0.4542F, 0.1308F, -0.0057F));

		PartDefinition cube_r486 = bone4.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(129, 84).mirror().addBox(-0.6514F, -0.0973F, -0.5173F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.186F, -2.6442F, -3.8732F, 0.1916F, 0.1308F, -0.0057F));

		PartDefinition cube_r487 = bone4.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(83, 145).mirror().addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(76, 127).mirror().addBox(-0.5F, 0.0F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5423F, -2.302F, -0.0179F, -0.3058F, 0.1308F, -0.0057F));

		PartDefinition cube_r488 = bone4.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(5, 140).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3371F, 0.4348F, -7.1241F, -1.0752F, 0.1278F, -0.0285F));

		PartDefinition cube_r489 = bone4.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(127, 142).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4652F, 0.4105F, -8.1155F, -0.028F, 0.1278F, -0.0285F));

		PartDefinition cube_r490 = bone4.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(88, 145).mirror().addBox(-0.5F, -1.6F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 133).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7262F, -0.0697F, -10.0394F, -0.2462F, 0.1278F, -0.0285F));

		PartDefinition cube_r491 = bone4.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(114, 32).mirror().addBox(-0.418F, -1.0955F, -6.7992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -2.7357F, -3.9239F, 0.4258F, 0.1278F, -0.0285F));

		PartDefinition cube_r492 = bone4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(85, 41).mirror().addBox(-0.418F, 0.0085F, -4.9486F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -2.7357F, -3.9239F, 0.1989F, 0.1278F, -0.0285F));

		PartDefinition cube_r493 = bone4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(24, 96).mirror().addBox(-0.418F, -0.0366F, -4.5572F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0988F, -2.7357F, -3.9239F, 0.2731F, 0.1278F, -0.0285F));

		PartDefinition cube_r494 = bone4.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(12, 134).mirror().addBox(-0.5F, -1.05F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(111, 86).mirror().addBox(-0.5F, -0.45F, -1.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3255F, 4.7083F, -10.6855F, 0.3914F, 0.095F, -0.0305F));

		PartDefinition cube_r495 = bone4.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(87, 121).mirror().addBox(-0.4792F, -1.0663F, -0.0812F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5725F, 5.1648F, -12.7771F, -1.2128F, 0.1309F, 0.0034F));

		PartDefinition cube_r496 = bone4.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(112, 114).mirror().addBox(-0.5F, -0.5F, -1.525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2416F, 3.7249F, -9.5729F, -0.2805F, 0.1295F, -0.0195F));

		PartDefinition cube_r497 = bone4.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(129, 89).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8788F, 3.8764F, -14.7076F, 0.0672F, 0.1241F, -0.0417F));

		PartDefinition cube_r498 = bone4.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(126, 0).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6788F, 3.1392F, -12.8592F, 0.3727F, 0.1241F, -0.0417F));

		PartDefinition cube_r499 = bone4.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(80, 121).mirror().addBox(-0.5114F, -2.0171F, 0.2289F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5725F, 5.1648F, -12.7771F, 0.1545F, 0.1241F, -0.0417F));

		PartDefinition cube_r500 = bone4.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(70, 54).mirror().addBox(-0.1534F, -2.0208F, 0.0235F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1147F, 5.3171F, -6.1549F, -0.253F, 0.0259F, -0.0043F));

		PartDefinition cube_r501 = bone4.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(87, 95).mirror().addBox(-0.1534F, -0.5208F, -4.7765F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0549F, 3.7223F, -4.4467F, 0.0504F, 0.1273F, -0.0307F));

		PartDefinition cube_r502 = bone4.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(119, 12).mirror().addBox(-0.512F, -0.7596F, -1.5106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.6371F, 18.9422F, 19.286F, -0.7043F, -0.0169F, 0.0325F));

		PartDefinition cube_r503 = bone4.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(112, 119).mirror().addBox(-0.1739F, 0.007F, 0.0228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.2493F, 15.2276F, 16.6102F, -0.8083F, 0.0284F, -0.0079F));

		PartDefinition cube_r504 = bone4.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(98, 120).mirror().addBox(-0.1739F, -0.193F, 0.0228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.1667F, 13.4398F, 14.1942F, -0.7036F, 0.0284F, -0.0079F));

		PartDefinition cube_r505 = bone4.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(44, 105).mirror().addBox(-0.4021F, -0.6123F, -4.8055F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8891F, 11.4095F, 9.4559F, -0.3786F, 0.1823F, -0.053F));

		PartDefinition cube_r506 = bone4.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(71, 119).mirror().addBox(-1.051F, -1.2674F, 2.8173F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.2891F, 11.4095F, 8.7559F, -0.551F, 0.1348F, -0.0022F));

		PartDefinition cube_r507 = bone4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(119, 17).mirror().addBox(-1.051F, -0.8971F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.2891F, 11.4095F, 8.7559F, -0.4288F, 0.1348F, -0.0022F));

		PartDefinition cube_r508 = bone4.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(103, 30).mirror().addBox(-0.5277F, -0.6491F, -4.5961F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.8891F, 11.4095F, 9.4559F, -0.4115F, 0.1872F, -0.0022F));

		PartDefinition cube_r509 = bone4.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(134, 41).mirror().addBox(-0.5F, -0.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.0545F, 9.4327F, 5.1268F, -0.6972F, 0.1565F, 0.0511F));

		PartDefinition cube_r510 = bone4.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(127, 52).mirror().addBox(-0.5F, -2.7F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6219F, 7.7537F, 1.8459F, -1.788F, 0.1565F, 0.0511F));

		PartDefinition cube_r511 = bone4.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-0.5F, -0.5F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9137F, 8.5238F, 3.9417F, -0.5139F, 0.1565F, 0.0511F));

		PartDefinition cube_r512 = bone4.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(90, 74).mirror().addBox(-0.5F, -0.675F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.8936F, 8.3862F, 3.7701F, -0.5925F, 0.1565F, 0.0511F));

		PartDefinition cube_r513 = bone4.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(75, 63).mirror().addBox(-0.5F, -0.675F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8936F, 8.3862F, 3.7701F, -0.6361F, 0.1565F, 0.0511F));

		PartDefinition cube_r514 = bone4.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(71, 2).mirror().addBox(-0.5F, -0.675F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.8936F, 8.3862F, 3.7701F, -0.8979F, 0.1565F, 0.0511F));

		PartDefinition cube_r515 = bone4.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(57, 111).mirror().addBox(-0.5F, -1.3F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4992F, 5.2196F, 0.2938F, -0.8077F, 0.1321F, 0.0532F));

		PartDefinition cube_r516 = bone4.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(22, 103).mirror().addBox(-0.5F, -0.7F, -4.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6674F, 6.265F, 1.9198F, -1.2419F, 0.2615F, 0.0405F));

		PartDefinition cube_r517 = bone4.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(114, 64).mirror().addBox(-0.2171F, -1.4919F, -0.0188F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8441F, -4.4808F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r518 = bone4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(28, 63).mirror().addBox(-0.2171F, -0.7919F, -2.8938F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 3.3602F, 2.7555F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r519 = leftLeg.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(97, 16).addBox(-0.5F, 0.0302F, -4.024F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5886F, 1.9073F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r520 = leftLeg.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(83, 127).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5144F, 1.9034F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r521 = leftLeg.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(103, 60).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.3448F, 0.5533F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r522 = leftLeg.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(11, 97).addBox(-1.5F, -2.8619F, -2.4279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4508F, 1.1898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r523 = leftLeg.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(11, 110).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 7.9493F, 0.9969F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r524 = leftLeg.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(56, 83).addBox(-1.0F, -8.1F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.0491F, 0.9908F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r525 = leftLeg.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(109, 44).addBox(-1.0F, 0.0F, -0.125F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 8.0951F, -1.3915F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r526 = leftLeg.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(66, 95).addBox(-1.0F, -2.1F, -1.35F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r527 = leftLeg.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(76, 86).addBox(-1.5F, -2.2145F, -0.5366F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.2715F, 1.2866F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r528 = leftLeg.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(85, 48).addBox(-1.5F, -1.5F, -1.65F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 12.6902F, -0.0748F, -0.3578F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.1105F, 0.1079F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r529 = leftLeg2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(121, 114).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 2.8466F, 1.1287F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r530 = leftLeg2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(24, 133).addBox(-0.5F, 5.5931F, -0.8687F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 13.1531F, -0.3892F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r531 = leftLeg2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(121, 106).addBox(-0.5F, 0.0089F, -1.0311F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 13.1531F, -0.3892F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r532 = leftLeg2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(66, 104).addBox(-0.5F, -9.9911F, -0.0311F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 13.1095F, -1.3883F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r533 = leftLeg2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(98, 33).addBox(-0.5F, -10.9911F, -0.0311F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 13.1095F, -1.3883F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r534 = leftLeg2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, -1.8F, -1.7F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 19.4218F, -1.6094F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r535 = leftLeg2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(84, 33).addBox(-1.0F, -1.4F, -2.4F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 2.3324F, -0.076F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r536 = leftLeg2.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(100, 81).addBox(-1.0F, -3.0F, -0.9F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9F, 5.7159F, -0.3753F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r537 = leftLeg2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(89, 116).addBox(-1.0F, -0.471F, -1.9357F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 2.0316F, 2.4313F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r538 = leftLeg2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(109, 81).addBox(-1.0F, -1.646F, -2.0357F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9F, 3.2021F, 2.431F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r539 = leftLeg2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(127, 97).addBox(-1.0F, 11.1617F, 2.8861F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.9F, 3.1346F, 0.0747F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r540 = leftLeg2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(42, 47).addBox(-1.0F, -1.2908F, -0.1761F, 2.0F, 17.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 3.1346F, 0.0747F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r541 = leftLeg2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(48, 95).addBox(-1.0F, -6.1313F, -1.6882F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 8.6509F, 1.0234F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(89, 79).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 21.6301F, -3.4436F, -0.5672F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(65, 39).addBox(-3.0F, -0.9696F, -2.8933F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3637F, -0.0088F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(42, 31).addBox(-3.0F, -1.4F, -4.7F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4766F, -2.7716F, -0.0087F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 3.3602F, 2.7555F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r542 = rightLeg.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(100, 74).addBox(-0.5F, 0.0302F, -4.024F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5886F, 1.9073F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r543 = rightLeg.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(84, 132).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5144F, 1.9034F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r544 = rightLeg.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(108, 13).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.3448F, 0.5533F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r545 = rightLeg.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(99, 23).addBox(-1.5F, -2.8619F, -2.4279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4508F, 1.1898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r546 = rightLeg.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(27, 110).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 7.9493F, 0.9969F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r547 = rightLeg.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(28, 84).addBox(-1.0F, -8.1F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.0491F, 0.9908F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r548 = rightLeg.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(109, 51).addBox(-1.0F, 0.0F, -0.125F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 8.0951F, -1.3915F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r549 = rightLeg.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(99, 7).addBox(-1.0F, -2.1F, -1.35F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r550 = rightLeg.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(11, 91).addBox(-1.5F, -2.2145F, -0.5366F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.2715F, 1.2866F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r551 = rightLeg.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(86, 2).addBox(-1.5F, -1.5F, -1.65F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 12.6902F, -0.0748F, -0.3578F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.1105F, 0.1079F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r552 = rightLeg2.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(127, 41).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 2.8466F, 1.1287F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r553 = rightLeg2.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(43, 133).addBox(-0.5F, 5.5931F, -0.8687F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 13.1531F, -0.3892F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r554 = rightLeg2.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(126, 120).addBox(-0.5F, 0.0089F, -1.0311F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 13.1531F, -0.3892F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r555 = rightLeg2.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(102, 108).addBox(-0.5F, -9.9911F, -0.0311F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 13.1095F, -1.3883F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r556 = rightLeg2.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(75, 100).addBox(-0.5F, -10.9911F, -0.0311F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 13.1095F, -1.3883F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r557 = rightLeg2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(76, 92).addBox(-1.0F, -1.8F, -1.7F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 19.4218F, -1.6094F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r558 = rightLeg2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(37, 85).addBox(-1.0F, -1.4F, -2.4F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 2.3324F, -0.076F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r559 = rightLeg2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(35, 101).addBox(-1.0F, -3.0F, -0.9F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9F, 5.7159F, -0.3753F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r560 = rightLeg2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(120, 92).addBox(-1.0F, -0.471F, -1.9357F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 2.0316F, 2.4313F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r561 = rightLeg2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(36, 111).addBox(-1.0F, -1.646F, -2.0357F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9F, 3.2021F, 2.431F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r562 = rightLeg2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(133, 0).addBox(-1.0F, 11.1617F, 2.8861F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9F, 3.1346F, 0.0747F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r563 = rightLeg2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(19, 63).addBox(-1.0F, -1.2908F, -0.1761F, 2.0F, 17.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 3.1346F, 0.0747F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r564 = rightLeg2.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(57, 95).addBox(-1.0F, -6.1313F, -1.6882F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 8.6509F, 1.0234F, -0.2443F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(37, 93).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 21.6301F, -3.4436F, -1.7017F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(67, 21).addBox(-3.0F, -0.9696F, -2.8933F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3637F, -0.0088F, 2.0595F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(42, 39).addBox(-3.0F, -1.4F, -4.7F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4766F, -2.7716F, -0.4014F, 0.0F, 0.0F));

		PartDefinition tail8 = hips.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(71, 124).addBox(0.0F, -5.3294F, 2.8478F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.5241F, 8.3792F, -0.262F, -0.0421F, 0.0113F));

		PartDefinition cube_r565 = tail8.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(9, 124).addBox(0.0F, -4.0654F, 0.0352F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1089F, -0.0954F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r566 = tail8.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(-2.0F, -0.1047F, -1.0009F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0309F, 0.9208F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition cube_r567 = tail8.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(84, 10).addBox(0.0F, -0.1047F, -1.0009F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0309F, 0.9208F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition cube_r568 = tail8.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(41, 67).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.8911F, -1.0954F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = tail8.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0141F, 5.7948F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r569 = tail.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(126, 57).addBox(0.0F, -3.6507F, 1.0329F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 125).addBox(0.0F, -3.7507F, -1.9671F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8599F, 5.0214F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r570 = tail.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(112, 124).addBox(0.0F, -4.3857F, 0.0344F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8099F, -0.0343F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r571 = tail.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-2.0F, -0.1047F, 4.9991F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0799F, -4.9623F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition cube_r572 = tail.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(0, 45).addBox(0.0F, -0.1047F, 4.9991F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0799F, -4.9623F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition cube_r573 = tail.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(21, 33).addBox(-1.0F, -2.0F, 7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9401F, -6.9786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2599F, 8.0214F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r574 = tail2.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(33, 129).addBox(0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r575 = tail2.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(86, 79).addBox(0.0F, -3.6F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r576 = tail2.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(19, 129).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7092F, 3.9435F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r577 = tail2.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(65, 31).mirror().addBox(-1.9F, 0.0F, 1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r578 = tail2.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(65, 31).addBox(-0.1F, 0.0F, 1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r579 = tail2.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(15, 74).addBox(0.0F, -0.4446F, -0.3556F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 6.3868F, 0.9512F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0057F, 8.8748F, -0.127F, 0.0866F, -0.011F));

		PartDefinition cube_r580 = tail3.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(43, 129).addBox(0.0F, -1.6184F, 0.0367F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 12.0F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r581 = tail3.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(117, 124).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r582 = tail3.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(94, 121).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r583 = tail3.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(119, 22).addBox(0.0F, -1.95F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r584 = tail3.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(105, 142).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r585 = tail3.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(20, 141).addBox(0.0F, -2.75F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r586 = tail3.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(98, 109).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r587 = tail3.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(122, 72).addBox(0.0F, -0.4F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8223F, 12.2814F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r588 = tail3.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(98, 115).addBox(0.0F, -0.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2919F, 9.8423F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r589 = tail3.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(91, 127).addBox(0.0F, -0.4F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.34F, 7.5956F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r590 = tail3.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(5, 125).addBox(0.0F, 0.1F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2764F, 5.1551F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r591 = tail3.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(71, 104).addBox(0.0F, -0.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0754F, 3.1034F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r592 = tail3.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(124, 142).addBox(-0.003F, 0.0F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8974F, 2.4141F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r593 = tail3.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(145, 129).addBox(0.0F, 0.0523F, -0.4361F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2525F, 0.3858F, 0.9948F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(52, 2).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, 0.1408F, 0.1296F, 0.0183F));

		PartDefinition cube_r594 = tail4.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(145, 107).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r595 = tail4.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(102, 145).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r596 = tail4.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(99, 145).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r597 = tail4.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(96, 145).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r598 = tail4.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(127, 145).addBox(0.0F, 1.7676F, 4.8854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 145).addBox(0.0F, 1.0676F, 2.8854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 119).addBox(0.0F, 0.3676F, 0.8854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 145).addBox(0.0F, -0.4324F, -1.1146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1525F, 1.2858F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(21, 53).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0094F, 8.0654F, 0.1188F, 0.13F, 0.0155F));

		PartDefinition cube_r599 = tail5.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(31, 146).addBox(0.0F, 0.3F, 5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 146).addBox(0.0F, 0.1F, 3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 146).addBox(0.0F, 0.0F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 145).addBox(0.0F, -0.2F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3544F, 9.1468F, 0.2367F, 0.0933F, 0.0225F));

		PartDefinition cube_r600 = tail5.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(142, 145).addBox(0.0F, 0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7756F, 1.1439F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r601 = tail5.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(0, 146).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0559F, 7.4029F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r602 = tail5.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(145, 145).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.265F, 5.4138F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r603 = tail5.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(130, 145).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.474F, 3.4248F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r604 = tail5.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(145, 93).addBox(0.0F, -0.9822F, -0.1146F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r605 = tail5.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(118, 145).addBox(0.0F, -1.1989F, -0.1474F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r606 = tail5.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(145, 115).addBox(0.0F, -1.3156F, -0.0802F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r607 = tail5.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(145, 111).addBox(0.0F, -1.3324F, -0.1131F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.1358F, 0.0865F, 0.0118F));

		PartDefinition cube_r608 = tail6.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(146, 43).addBox(0.0F, -2.6657F, 5.5455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 145).addBox(0.0F, -2.2657F, 3.6455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 145).addBox(0.0F, -1.6657F, 1.7205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 133).addBox(0.0F, -0.9907F, -0.1795F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(51, 57).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1007F, 0.0868F, -0.0088F));

		PartDefinition tail9 = tail7.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0047F, 8.0006F, -0.1921F, 0.2143F, -0.0413F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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