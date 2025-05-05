package fossils.fossils.client.blockentity.model.doedicurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DoedicurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart thagomizer2;
	private final ModelPart thagomizer18;
	private final ModelPart thagomizer8;
	private final ModelPart thagomizer17;
	private final ModelPart thagomizer9;
	private final ModelPart thagomizer10;
	private final ModelPart thagomizer5;
	private final ModelPart thagomizer19;
	private final ModelPart thagomizer6;
	private final ModelPart thagomizer12;
	private final ModelPart thagomizer7;
	private final ModelPart thagomizer13;
	private final ModelPart thagomizer3;
	private final ModelPart thagomizer16;
	private final ModelPart thagomizer11;
	private final ModelPart thagomizer15;
	private final ModelPart thagomizer4;
	private final ModelPart thagomizer14;

	public DoedicurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm7 = this.leftLeg3.getChild("leftArm7");
		this.leftArm6 = this.leftArm7.getChild("leftArm6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm7 = this.rightLeg3.getChild("rightArm7");
		this.rightArm6 = this.rightArm7.getChild("rightArm6");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.thagomizer2 = this.tail5.getChild("thagomizer2");
		this.thagomizer18 = this.tail5.getChild("thagomizer18");
		this.thagomizer8 = this.tail5.getChild("thagomizer8");
		this.thagomizer17 = this.tail5.getChild("thagomizer17");
		this.thagomizer9 = this.tail5.getChild("thagomizer9");
		this.thagomizer10 = this.tail5.getChild("thagomizer10");
		this.thagomizer5 = this.tail5.getChild("thagomizer5");
		this.thagomizer19 = this.tail5.getChild("thagomizer19");
		this.thagomizer6 = this.tail5.getChild("thagomizer6");
		this.thagomizer12 = this.tail5.getChild("thagomizer12");
		this.thagomizer7 = this.tail5.getChild("thagomizer7");
		this.thagomizer13 = this.tail5.getChild("thagomizer13");
		this.thagomizer3 = this.tail5.getChild("thagomizer3");
		this.thagomizer16 = this.tail5.getChild("thagomizer16");
		this.thagomizer11 = this.tail5.getChild("thagomizer11");
		this.thagomizer15 = this.tail5.getChild("thagomizer15");
		this.thagomizer4 = this.tail5.getChild("thagomizer4");
		this.thagomizer14 = this.tail5.getChild("thagomizer14");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -20.0F, 3.6F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-0.5F, -18.0F, -12.4F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(3.9F, -6.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(1.5F, -4.5F, 15.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -17.0F, -11.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.2608F, 7.7124F, 0.3076F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 130).addBox(-0.5F, -1.0478F, -2.6435F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6328F, -2.1033F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(130, 20).addBox(-0.5F, -0.0855F, -2.802F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5328F, 0.2967F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(130, 77).addBox(-0.5F, -1.2025F, -0.3514F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 127).addBox(-0.5F, -1.6908F, 1.5176F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(71, 131).addBox(-0.5F, 0.0989F, 6.3991F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 129).addBox(-0.5F, 0.0989F, 3.6991F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -0.9338F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9506F, 2.762F, -4.6209F, -0.2797F, -0.6363F, 0.033F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.11F, 8.274F, -3.5275F, 0.9071F, -0.2618F, 0.1583F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8667F, 3.5895F, -3.0794F, -1.4705F, 0.2443F, -0.0981F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 1.8182F, 0.0204F, 0.1409F, 0.0167F, -0.1624F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9506F, 2.762F, -4.6209F, -0.3233F, 0.6363F, -0.033F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.11F, 8.274F, -3.5275F, 0.9071F, 0.2618F, -0.1583F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8667F, 3.5895F, -3.0794F, -1.409F, 0.0549F, -0.1018F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 1.8182F, 0.0204F, 0.1416F, 0.008F, -0.0104F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3337F, -5.209F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(81, 17).addBox(-0.5F, -0.27F, -0.5269F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6243F, -5.3348F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -1.33F, -5.2721F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(122, 128).addBox(-0.5F, -0.2061F, 3.7442F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.0965F, -2.8954F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(124, 86).addBox(-0.5F, -0.3F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1186F, -4.083F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(100, 121).addBox(-0.5F, 0.6599F, -4.3382F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -3.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(144, 141).addBox(-0.5F, -0.2F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6909F, 4.6049F, 0.0576F, -2.2062F, 0.3285F, -0.2644F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2096F, -1.3264F, 6.8332F, 0.3416F, 0.1289F, 0.0173F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6054F, 5.3293F, 0.1577F, 0.266F, 0.8539F, 0.1514F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6909F, 4.6049F, 0.0576F, -2.2062F, -0.3285F, 0.2644F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2096F, -1.3264F, 6.8332F, 0.1319F, -0.2335F, 0.1774F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6054F, 5.3293F, 0.1577F, 0.3148F, -0.8034F, -0.5885F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0624F, -1.6347F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(143, 90).addBox(-0.5F, 0.6F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(142, 90).addBox(-0.5F, 0.6F, 2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.328F, -4.5523F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7425F, -1.7394F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(131, 128).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5504F, -0.5541F, 0.3316F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9575F, -2.7695F, -0.3011F, 0.0522F, 0.1666F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 4.719F, 0.9216F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 4.719F, 0.9216F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4431F, -0.707F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(91, 99).addBox(-0.5F, -0.2067F, -0.2029F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 6.64F, 3.1459F, -0.9047F, -0.0904F, 0.0961F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(108, 6).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(113, 11).addBox(-0.5F, -0.3F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, 6.9F, 0.2463F, -0.1658F, -0.0648F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 122).addBox(-0.5F, 0.225F, -0.275F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(3, 125).addBox(-0.5F, 0.225F, 3.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5073F, 5.9866F, 0.134F, -0.2163F, -0.0289F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(122, 93).addBox(-0.5F, 0.25F, -0.275F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(125, 96).addBox(-0.5F, 0.25F, 3.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.038F, 4.0597F, 0.094F, -0.4572F, 0.2212F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, 0.1227F, -0.0539F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0941F, 3.9206F, 0.1957F, -0.3034F, -0.3508F));

		PartDefinition thagomizer2 = tail5.addOrReplaceChild("thagomizer2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6769F, -1.087F, 10.825F, 3.1312F, -0.4654F, -0.6465F));

		PartDefinition thagomizer18 = tail5.addOrReplaceChild("thagomizer18", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6769F, -1.087F, 10.825F, 3.1312F, 0.4654F, 0.6465F));

		PartDefinition thagomizer8 = tail5.addOrReplaceChild("thagomizer8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.125F, 0.6757F, 10.058F, 2.9143F, -0.1417F, 0.6457F));

		PartDefinition thagomizer17 = tail5.addOrReplaceChild("thagomizer17", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.125F, 0.6757F, 10.058F, 2.9143F, 0.1417F, -0.6457F));

		PartDefinition thagomizer9 = tail5.addOrReplaceChild("thagomizer9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4571F, -0.0274F, 7.4887F, 2.9098F, -0.241F, -0.5567F));

		PartDefinition thagomizer10 = tail5.addOrReplaceChild("thagomizer10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4571F, -0.0274F, 7.4887F, 2.9098F, 0.241F, 0.5567F));

		PartDefinition thagomizer5 = tail5.addOrReplaceChild("thagomizer5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3769F, -0.9283F, 8.2804F, 3.0929F, -0.1061F, -0.2989F));

		PartDefinition thagomizer19 = tail5.addOrReplaceChild("thagomizer19", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3769F, -0.9283F, 8.2804F, 3.0929F, 0.1061F, 0.2989F));

		PartDefinition thagomizer6 = tail5.addOrReplaceChild("thagomizer6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1985F, -0.8383F, 7.0437F, 0.0125F, 0.724F, -0.2304F));

		PartDefinition thagomizer12 = tail5.addOrReplaceChild("thagomizer12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1985F, -0.8383F, 7.0437F, 0.0125F, -0.724F, 0.2304F));

		PartDefinition thagomizer7 = tail5.addOrReplaceChild("thagomizer7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1726F, -1.9963F, 7.3007F, 0.0913F, 0.5266F, -1.4403F));

		PartDefinition thagomizer13 = tail5.addOrReplaceChild("thagomizer13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1726F, -1.9963F, 7.3007F, 0.0913F, -0.5266F, 1.4403F));

		PartDefinition thagomizer3 = tail5.addOrReplaceChild("thagomizer3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3769F, 0.5729F, 11.0567F, 3.078F, -0.6803F, 0.8082F));

		PartDefinition thagomizer16 = tail5.addOrReplaceChild("thagomizer16", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3769F, 0.5729F, 11.0567F, 3.078F, 0.6803F, -0.8082F));

		PartDefinition thagomizer11 = tail5.addOrReplaceChild("thagomizer11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4908F, 1.3954F, 14.4431F, 2.0582F, -1.275F, 1.4249F));

		PartDefinition thagomizer15 = tail5.addOrReplaceChild("thagomizer15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4908F, 1.3954F, 14.4431F, 2.0582F, 1.275F, -1.4249F));

		PartDefinition thagomizer4 = tail5.addOrReplaceChild("thagomizer4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5603F, -1.0399F, 12.198F, -2.1944F, -0.8089F, -1.1552F));

		PartDefinition thagomizer14 = tail5.addOrReplaceChild("thagomizer14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5603F, -1.0399F, 12.198F, -2.1944F, 0.8089F, 1.1552F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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