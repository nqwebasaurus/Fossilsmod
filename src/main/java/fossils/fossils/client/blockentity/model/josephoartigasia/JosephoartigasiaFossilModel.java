package fossils.fossils.client.blockentity.model.josephoartigasia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JosephoartigasiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body6;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart tail;
	private final ModelPart tail8;
	private final ModelPart tail2;
	private final ModelPart tail9;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public JosephoartigasiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body5 = this.body3.getChild("body5");
		this.body2 = this.body5.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body6 = this.body.getChild("body6");
		this.chest = this.body6.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.tail = this.hips.getChild("tail");
		this.tail8 = this.tail.getChild("tail8");
		this.tail2 = this.tail8.getChild("tail2");
		this.tail9 = this.tail2.getChild("tail9");
		this.tail3 = this.tail9.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.2F, 15.317F, -0.3033F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(119, 87).addBox(0.0F, -2.3756F, 0.6824F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0032F, -2.7858F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(61, 118).addBox(0.0F, -2.2904F, 0.5831F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0479F, -4.5376F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 118).addBox(0.0F, -2.1189F, 0.3236F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8904F, -6.0965F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(125, 96).addBox(0.0F, -1.2755F, -1.0946F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6086F, 0.9515F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 64).mirror().addBox(0.6692F, 0.0902F, -1.7624F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5058F, -1.1438F, -4.3598F, -0.0746F, 0.5214F, 1.4184F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(94, 128).mirror().addBox(0.4329F, 0.1679F, 0.6857F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4657F, 0.8189F, -1.4918F, -0.2576F, 0.7519F, 1.1522F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(94, 128).addBox(-0.4329F, 0.1679F, 0.6857F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4657F, 0.8189F, -1.4918F, -0.2576F, -0.7519F, -1.1522F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 64).addBox(-0.6692F, 0.0902F, -1.7624F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5058F, -1.1438F, -4.3598F, -0.0746F, -0.5214F, -1.4184F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 107).addBox(-0.5F, 0.5094F, 0.8605F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5627F, -1.9442F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 55).addBox(-0.5F, 0.4585F, 0.8222F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.977F, 7.5211F, -1.5342F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(23, 123).addBox(-0.3835F, 0.9411F, -0.6825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2559F, 1.8373F, 5.0585F, -0.0279F, -0.0716F, 0.1001F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(122, 114).addBox(-0.3835F, -0.1492F, 0.9819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.1466F, 0.854F, 4.9127F, -1.4241F, -0.0716F, 0.1001F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(35, 109).addBox(-0.3835F, -0.6164F, -2.7788F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0638F, 1.7367F, 2.5326F, 2.5377F, -0.0716F, 0.1001F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 121).addBox(-0.3835F, -2.988F, -0.8986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8243F, -0.0909F, 1.7563F, -2.7419F, -0.0716F, 0.1001F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(64, 101).addBox(-0.3835F, -0.8526F, 0.9094F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(26, 56).addBox(-0.3835F, -0.8526F, 0.5094F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1466F, 0.854F, 4.9127F, -2.3055F, -0.0716F, 0.1001F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(69, 99).addBox(-0.9413F, -3.2267F, -0.571F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2413F, -8.2747F, -1.6184F, 0.0204F, -0.7571F, 0.182F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(71, 83).addBox(-0.254F, -6.9685F, 0.0614F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0027F, -10.1321F, -1.0975F, -2.9924F, -0.7127F, 0.0703F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(115, 35).addBox(0.2072F, -1.026F, 1.6798F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.6757F, -10.2647F, -3.546F, -0.1392F, -1.4632F, -0.8312F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(119, 103).addBox(0.2072F, 0.9068F, 0.5746F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6757F, -10.2647F, -3.546F, 0.2971F, -1.4632F, -0.8312F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 10).addBox(0.1418F, 0.7516F, 0.7837F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2225F, -11.6303F, -3.6987F, 0.5347F, -1.4204F, -1.3462F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(19, 88).addBox(-0.1879F, -1.2458F, -3.5746F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0978F, -7.7381F, -2.4976F, -1.1863F, -1.2065F, 0.0973F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 89).addBox(-0.1879F, -0.8936F, -1.6193F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0978F, -7.7381F, -2.4976F, -1.4481F, -1.2065F, 0.0973F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(105, 80).addBox(-0.1879F, -2.919F, -0.4881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0978F, -7.7381F, -2.4976F, -2.6698F, -1.2065F, 0.0973F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(14, 110).addBox(-0.1879F, -6.952F, -0.2611F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0978F, -7.7381F, -2.4976F, -2.9316F, -1.2065F, 0.0973F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 118).addBox(-0.3835F, 1.1474F, 0.4094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 28).addBox(-0.3835F, -0.8526F, 0.4094F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4596F, -3.4388F, 1.362F, -2.3055F, -0.0716F, 0.1001F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(105, 0).addBox(-0.3835F, -2.3663F, -1.0768F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2571F, -2.7107F, -2.4641F, -1.651F, -0.0716F, 0.1001F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 69).addBox(-0.3835F, -1.4865F, -0.1149F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6315F, -1.9915F, 1.7303F, -2.96F, -0.0716F, 0.1001F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(35, 104).addBox(0.137F, -3.4352F, 1.9791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, -0.2606F, 0.088F, 0.298F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(103, 99).addBox(0.137F, -4.4408F, 1.0774F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, -0.7406F, 0.088F, 0.298F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(120, 56).addBox(-0.3038F, -0.4985F, 0.0687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6685F, -0.3878F, -0.6357F, -0.4687F, -0.081F, 0.2356F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(120, 100).addBox(-0.7651F, -5.4524F, -0.091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(119, 111).addBox(-0.7651F, -5.4524F, -0.391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8182F, 5.1667F, 0.0737F, 0.2774F, 0.0518F, 0.3054F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(89, 110).addBox(-0.7651F, -4.4315F, 0.582F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8182F, 5.1667F, 0.0737F, 0.4955F, 0.0518F, 0.3054F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(98, 118).addBox(-0.7651F, -1.0596F, 0.2514F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8182F, 5.1667F, 0.0737F, 0.0592F, 0.0518F, 0.3054F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(64, 122).addBox(0.1868F, -0.9856F, 0.7759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, -0.533F, 0.0744F, 0.2905F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(55, 122).addBox(0.1868F, -0.3977F, 0.8148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, -0.6202F, 0.0744F, 0.2905F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(33, 113).addBox(0.1868F, -2.159F, -2.327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, -2.2434F, 0.0744F, 0.2905F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(91, 94).addBox(0.1868F, -2.3454F, -3.8147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, -2.5052F, 0.0744F, 0.2905F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(94, 122).addBox(0.1868F, -3.2626F, -3.5866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, -2.4615F, 0.0744F, 0.2905F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(87, 67).addBox(0.1868F, 4.2673F, 0.9124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(90, 80).addBox(0.1868F, 4.2673F, 0.7124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, 1.5527F, 0.0744F, 0.2905F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(122, 89).addBox(0.1868F, 1.8717F, -4.4727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, 2.6872F, 0.0744F, 0.2905F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(112, 89).addBox(0.1868F, -2.1872F, -3.5123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, -2.8106F, 0.0744F, 0.2905F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(121, 93).addBox(0.1868F, -2.1604F, 0.5192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.7708F, 5.0096F, 0.1005F, -1.5802F, 0.0744F, 0.2905F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.977F, 7.5211F, -1.5342F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(23, 123).mirror().addBox(-0.6165F, 0.9411F, -0.6825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2559F, 1.8373F, 5.0585F, -0.0279F, 0.0716F, -0.1001F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(122, 114).mirror().addBox(-0.6165F, -0.1492F, 0.9819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.1466F, 0.854F, 4.9127F, -1.4241F, 0.0716F, -0.1001F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(35, 109).mirror().addBox(-0.6165F, -0.6164F, -2.7788F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0638F, 1.7367F, 2.5326F, 2.5377F, 0.0716F, -0.1001F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(13, 121).mirror().addBox(-0.6165F, -2.988F, -0.8986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.8243F, -0.0909F, 1.7563F, -2.7419F, 0.0716F, -0.1001F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(64, 101).mirror().addBox(-0.6165F, -0.8526F, 0.9094F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(26, 56).mirror().addBox(-0.6165F, -0.8526F, 0.5094F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1466F, 0.854F, 4.9127F, -2.3055F, 0.0716F, -0.1001F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(69, 99).mirror().addBox(-0.0587F, -3.2267F, -0.571F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2413F, -8.2747F, -1.6184F, 0.0204F, 0.7571F, -0.182F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 83).mirror().addBox(-0.746F, -6.9685F, 0.0614F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0027F, -10.1321F, -1.0975F, -2.9924F, 0.7127F, -0.0703F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(115, 35).mirror().addBox(-1.2072F, -1.026F, 1.6798F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6757F, -10.2647F, -3.546F, -0.1392F, 1.4632F, 0.8312F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(119, 103).mirror().addBox(-1.2072F, 0.9068F, 0.5746F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6757F, -10.2647F, -3.546F, 0.2971F, 1.4632F, 0.8312F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 10).mirror().addBox(-1.1418F, 0.7516F, 0.7837F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2225F, -11.6303F, -3.6987F, 0.5347F, 1.4204F, 1.3462F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(19, 88).mirror().addBox(-0.8121F, -1.2458F, -3.5746F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0978F, -7.7381F, -2.4976F, -1.1863F, 1.2065F, -0.0973F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 89).mirror().addBox(-0.8121F, -0.8936F, -1.6193F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0978F, -7.7381F, -2.4976F, -1.4481F, 1.2065F, -0.0973F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(105, 80).mirror().addBox(-0.8121F, -2.919F, -0.4881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0978F, -7.7381F, -2.4976F, -2.6698F, 1.2065F, -0.0973F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(14, 110).mirror().addBox(-0.8121F, -6.952F, -0.2611F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0978F, -7.7381F, -2.4976F, -2.9316F, 1.2065F, -0.0973F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(-0.6165F, 1.1474F, 0.4094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 28).mirror().addBox(-0.6165F, -0.8526F, 0.4094F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4596F, -3.4388F, 1.362F, -2.3055F, 0.0716F, -0.1001F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-0.6165F, -2.3663F, -1.0768F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2571F, -2.7107F, -2.4641F, -1.651F, 0.0716F, -0.1001F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.6165F, -1.4865F, -0.1149F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6315F, -1.9915F, 1.7303F, -2.96F, 0.0716F, -0.1001F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(35, 104).mirror().addBox(-1.137F, -3.4352F, 1.9791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, -0.2606F, -0.088F, -0.298F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(103, 99).mirror().addBox(-1.137F, -4.4408F, 1.0774F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, -0.7406F, -0.088F, -0.298F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(120, 56).mirror().addBox(-0.6962F, -0.4985F, 0.0687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6685F, -0.3878F, -0.6357F, -0.4687F, 0.081F, -0.2356F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(120, 100).mirror().addBox(-0.2349F, -5.4524F, -0.091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(119, 111).mirror().addBox(-0.2349F, -5.4524F, -0.391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.8182F, 5.1667F, 0.0737F, 0.2774F, -0.0518F, -0.3054F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(89, 110).mirror().addBox(-0.2349F, -4.4315F, 0.582F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8182F, 5.1667F, 0.0737F, 0.4955F, -0.0518F, -0.3054F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(98, 118).mirror().addBox(-0.2349F, -1.0596F, 0.2514F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.8182F, 5.1667F, 0.0737F, 0.0592F, -0.0518F, -0.3054F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(64, 122).mirror().addBox(-1.1868F, -0.9856F, 0.7759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, -0.533F, -0.0744F, -0.2905F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(55, 122).mirror().addBox(-1.1868F, -0.3977F, 0.8148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, -0.6202F, -0.0744F, -0.2905F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(33, 113).mirror().addBox(-1.1868F, -2.159F, -2.327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, -2.2434F, -0.0744F, -0.2905F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(91, 94).mirror().addBox(-1.1868F, -2.3454F, -3.8147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, -2.5052F, -0.0744F, -0.2905F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(94, 122).mirror().addBox(-1.1868F, -3.2626F, -3.5866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, -2.4615F, -0.0744F, -0.2905F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(87, 67).mirror().addBox(-1.1868F, 4.2673F, 0.9124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(90, 80).mirror().addBox(-1.1868F, 4.2673F, 0.7124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, 1.5527F, -0.0744F, -0.2905F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(122, 89).mirror().addBox(-1.1868F, 1.8717F, -4.4727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, 2.6872F, -0.0744F, -0.2905F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(112, 89).mirror().addBox(-1.1868F, -2.1872F, -3.5123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, -2.8106F, -0.0744F, -0.2905F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(121, 93).mirror().addBox(-1.1868F, -2.1604F, 0.5192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.7708F, 5.0096F, 0.1005F, -1.5802F, -0.0744F, -0.2905F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3735F, 5.4619F, -1.1003F, -1.8314F, -0.0801F, -0.006F));

		PartDefinition cube_r75 = leftLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(101, 76).addBox(-1.5817F, -1.2405F, 0.2718F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6F, 15.0365F, 0.4525F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(64, 42).addBox(-1.9817F, -1.1605F, -0.2965F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4F, 12.1937F, 1.1436F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(86, 46).addBox(-1.9817F, -0.1041F, -0.045F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 13.35F, 2.7665F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(85, 83).addBox(-1.4818F, -2.2958F, 1.2524F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2F, 2.3133F, -0.5557F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(92, 27).addBox(-1.9818F, -0.0592F, -1.6616F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -1.1472F, 1.2469F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(90, 76).addBox(-1.9818F, 0.5032F, -1.136F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7F, -1.79F, 0.4809F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(76, 107).addBox(-1.9818F, -0.9551F, -0.0333F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -1.0927F, 0.5419F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(104, 31).addBox(-2.9818F, -0.2859F, -0.3874F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 9.0156F, 1.6161F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(107, 93).addBox(-0.9818F, -0.0137F, -0.0003F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7F, 9.989F, 1.891F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(57, 83).addBox(-0.9818F, -2.6871F, -0.2178F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.7F, 6.5008F, 1.541F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(75, 92).addBox(-0.9818F, -2.8548F, 0.4348F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7F, 3.1682F, 0.7244F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(97, 43).addBox(-0.9818F, -4.272F, 0.8621F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7F, 4.1488F, -0.3928F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(106, 109).addBox(-0.9818F, -0.1441F, 0.9894F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7F, 8.1344F, -0.0394F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(14, 99).addBox(-0.9818F, -1.7298F, 0.4731F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 5.5939F, 0.1744F, 0.1134F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0637F, -0.3739F, 1.7387F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9217F, 14.6375F, 3.6342F, 0.98F, 0.0425F, 0.1238F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 0).addBox(-0.7892F, -0.8584F, 3.6607F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.785F, -1.1F, 1.394F, -0.0349F, -0.0087F, 0.0F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 76).addBox(-0.7892F, -0.5194F, 0.1034F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.785F, -1.1F, 1.394F, 0.0524F, -0.0087F, 0.0F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(96, 85).addBox(-1.0681F, 0.2055F, 0.2599F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.7339F, 0.5632F, 0.8291F, 0.0043F, -0.0012F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(96, 23).addBox(-1.0637F, 0.9959F, 0.0636F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 0.555F, -0.7743F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(85, 103).addBox(-1.5637F, -0.9242F, 0.8785F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 2.191F, 0.0763F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(97, 49).addBox(-1.0637F, 0.067F, -1.0043F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, -0.7371F, 2.8092F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(99, 38).addBox(-1.0637F, -0.4897F, -1.0082F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0003F, 16.8486F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(63, 2).addBox(-1.0637F, -0.6776F, 0.9445F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, -0.1748F, 12.8524F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0637F, -0.5185F, 0.8741F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -0.0443F, 11.861F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(49, 34).addBox(-1.0637F, 0.4194F, 0.9056F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, -0.7371F, 6.8092F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(27, 16).addBox(-1.0637F, -0.5192F, -7.8523F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.2891F, 3.8123F, -2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(93, 54).addBox(-1.0637F, -2.8741F, -1.5185F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.5502F, 1.8294F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(92, 67).addBox(-1.0637F, -1.4111F, 0.044F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.0629F, 0.8092F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(30, 34).addBox(-2.0303F, -1.5217F, 0.1753F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0844F, -0.9524F, 17.3759F, -1.8675F, -0.0348F, 0.0027F));

		PartDefinition cube_r102 = leftLeg3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(11, 83).addBox(-1.0303F, -1.099F, -1.4682F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, -0.5532F, -1.0204F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -0.5068F, 5.0179F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5303F, -1.2482F, -0.5279F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.2F, 0.2F, 0.2F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3735F, 5.4619F, -1.1003F, -1.8314F, 0.0801F, 0.006F));

		PartDefinition cube_r104 = rightLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(102, 53).addBox(-0.4183F, -1.2405F, 0.2718F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6F, 15.0365F, 0.4525F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(59, 64).addBox(-1.0183F, -1.1605F, -0.2965F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.4F, 12.1937F, 1.1436F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(86, 50).addBox(-1.0183F, -0.1041F, -0.045F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 13.35F, 2.7665F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(86, 34).addBox(-1.5182F, -2.2958F, 1.2524F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2F, 2.3133F, -0.5557F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(64, 92).addBox(-1.0182F, -0.0592F, -1.6616F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -1.1472F, 1.2469F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(53, 92).addBox(-1.0182F, 0.5032F, -1.136F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7F, -1.79F, 0.4809F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(85, 107).addBox(-1.0182F, -0.9551F, -0.0333F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -1.0927F, 0.5419F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(104, 42).addBox(0.9818F, -0.2859F, -0.3874F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7F, 9.0156F, 1.6161F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(94, 107).addBox(-1.0182F, -0.0137F, -0.0003F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7F, 9.989F, 1.891F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(64, 83).addBox(-1.0182F, -2.6871F, -0.2178F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.7F, 6.5008F, 1.541F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(94, 6).addBox(-1.0182F, -2.8548F, 0.4348F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.7F, 3.1682F, 0.7244F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 99).addBox(-1.0182F, -4.272F, 0.8621F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7F, 4.1488F, -0.3928F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 110).addBox(-1.0182F, -0.1441F, 0.9894F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.7F, 8.1344F, -0.0394F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(28, 101).addBox(-1.0182F, -1.7298F, 0.4731F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 5.5939F, 0.1744F, 0.1134F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 46).addBox(0.0637F, -0.3739F, 1.7387F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9217F, 14.6375F, 3.6342F, 0.98F, -0.0425F, -0.1238F));

		PartDefinition cube_r118 = rightLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 14).addBox(-0.2108F, -0.8584F, 3.6607F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.785F, -1.1F, 1.394F, -0.0349F, 0.0087F, 0.0F));

		PartDefinition cube_r119 = rightLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(76, 0).addBox(-0.2108F, -0.5194F, 0.1034F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.785F, -1.1F, 1.394F, 0.0524F, 0.0087F, 0.0F));

		PartDefinition cube_r120 = rightLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(114, 93).addBox(-0.9319F, 0.2055F, 0.2599F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.7339F, 0.5632F, 0.8291F, -0.0043F, 0.0012F));

		PartDefinition cube_r121 = rightLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(55, 101).addBox(-0.9363F, 0.9959F, 0.0636F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 0.555F, -0.7743F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(94, 103).addBox(-0.4363F, -0.9242F, 0.8785F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 2.191F, 0.0763F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(46, 101).addBox(-0.9363F, 0.067F, -1.0043F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, -0.7371F, 2.8092F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(101, 9).addBox(-0.9363F, -0.4897F, -1.0082F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0003F, 16.8486F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(24, 63).addBox(-0.9363F, -0.6776F, 0.9445F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, -0.1748F, 12.8524F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(47, 48).addBox(-0.9363F, -0.5185F, 0.8741F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.0443F, 11.861F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(49, 41).addBox(-0.9363F, 0.4194F, 0.9056F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, -0.7371F, 6.8092F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(27, 25).addBox(-0.9363F, -0.5192F, -7.8523F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 1.2891F, 3.8123F, -2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(19, 94).addBox(-0.9363F, -2.8741F, -1.5185F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 1.5502F, 1.8294F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(10, 94).addBox(-0.9363F, -1.4111F, 0.044F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 1.0629F, 0.8092F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(30, 41).addBox(-1.9697F, -1.5217F, 0.1753F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0844F, -0.9524F, 17.3759F, -1.8675F, 0.0348F, -0.0027F));

		PartDefinition cube_r131 = rightLeg3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(83, 12).addBox(-0.9697F, -1.099F, -1.4682F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, -0.5532F, -1.0204F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, -0.5068F, 5.0179F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(27, 8).addBox(-3.4697F, -1.2482F, -0.5279F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2F, 0.2F, 0.2F, 0.5236F, 0.0F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(65, 125).addBox(0.0F, -2.4122F, -1.5316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0544F, -6.3999F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(23, 126).addBox(-0.5F, -1.0992F, 0.3129F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9119F, -5.5997F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(69, 122).addBox(-0.5F, -1.521F, 0.3883F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1952F, -3.7325F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(122, 67).mirror().addBox(0.9362F, 0.133F, 0.0156F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5662F, -0.816F, -3.2993F, -0.2036F, 0.2414F, 1.209F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(128, 52).mirror().addBox(1.1395F, -1.1559F, -0.0315F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0513F, -0.0884F, -1.4709F, -0.2438F, 0.2468F, 1.3915F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(127, 112).mirror().addBox(1.0375F, -0.245F, -0.6745F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7233F, -1.2144F, -5.0979F, -0.164F, -0.2121F, 1.3634F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(127, 112).addBox(-1.0375F, -0.245F, -0.6745F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7233F, -1.2144F, -5.0979F, -0.164F, 0.2121F, -1.3634F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(46, 25).addBox(-0.5F, 0.7454F, 0.652F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.9119F, -5.5997F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(128, 52).addBox(-1.1395F, -1.1559F, -0.0315F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0513F, -0.0884F, -1.4709F, -0.2438F, -0.2468F, -1.3915F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(122, 67).addBox(-0.9362F, 0.133F, 0.0156F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5662F, -0.816F, -3.2993F, -0.2036F, -0.2414F, -1.209F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -1.6176F, -5.537F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(79, 118).addBox(-0.5F, -1.4411F, -0.2219F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.4413F, -3.7432F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(109, 121).addBox(-0.5F, -1.6133F, -0.136F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.163F, -1.7627F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(20, 125).addBox(-0.5F, -0.707F, -0.0143F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -1.0943F, -5.8627F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(106, 121).mirror().addBox(1.0467F, -0.7306F, -0.6665F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, 0.0032F, -1.461F, -0.287F, -0.2806F, 1.3959F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(78, 124).mirror().addBox(1.3304F, -0.5243F, -0.6233F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3467F, -0.4968F, -3.561F, -0.2369F, -0.315F, 1.394F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(120, 124).mirror().addBox(1.239F, -0.3688F, -0.7305F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1783F, -0.7843F, -5.2533F, -0.255F, -0.2809F, 1.4426F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(120, 124).addBox(-1.239F, -0.3688F, -0.7305F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6684F, -0.7843F, -5.2533F, -0.255F, 0.2809F, -1.4426F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(78, 124).addBox(-1.3304F, -0.5243F, -0.6233F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4968F, -3.561F, -0.2369F, 0.315F, -1.394F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(106, 121).addBox(-1.0467F, -0.7306F, -0.6665F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0032F, -1.461F, -0.287F, 0.2806F, -1.3959F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 1.0282F, 0.3006F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body5 = body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.2411F, -6.9487F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(1.4417F, -0.7099F, -0.7211F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.6557F, -0.3123F, -0.2185F, -0.1852F, 1.6582F));

		PartDefinition cube_r153 = body5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(41, 128).mirror().addBox(1.3417F, -1.0155F, -0.5184F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5557F, -2.4123F, -0.0876F, -0.1852F, 1.6582F));

		PartDefinition cube_r154 = body5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(41, 128).addBox(-1.3417F, -1.0155F, -0.5184F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5557F, -2.4123F, -0.0876F, 0.1852F, -1.6582F));

		PartDefinition cube_r155 = body5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(24, 69).addBox(-0.5F, -0.0196F, -3.7027F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(38, 128).addBox(-0.5F, -0.405F, 0.1528F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8407F, -2.9843F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(128, 28).addBox(-0.5F, -0.7022F, 0.0093F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8896F, -0.8308F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(80, 6).addBox(-1.4417F, -0.7099F, -0.7211F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.6557F, -0.3123F, -0.2185F, 0.1852F, -1.6582F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, -3.8751F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(50, 128).addBox(-0.5F, -0.698F, -0.1965F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5071F, -4.6216F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(128, 48).addBox(-0.5F, -0.59F, -0.3141F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5212F, -2.8724F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(112, 121).addBox(-0.5F, -0.4886F, -0.092F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -0.9027F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(72, 122).mirror().addBox(0.8752F, -0.6742F, -0.6165F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6233F, -0.2539F, -4.4372F, -0.0082F, -0.2721F, 1.4157F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(106, 113).mirror().addBox(-1.3096F, 2.0987F, -0.6603F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6233F, -0.2539F, -4.4372F, 0.2203F, -0.1481F, 0.4794F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(49, 114).mirror().addBox(-4.9584F, 6.5359F, -0.6603F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6233F, -0.2539F, -4.4372F, 0.2632F, -0.0288F, 0.0033F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(44, 128).mirror().addBox(0.8619F, 0.3097F, -0.6854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0767F, -0.4539F, -2.4372F, -0.0043F, -0.3414F, 1.4318F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(113, 106).mirror().addBox(-1.3033F, 2.0778F, -0.729F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0767F, -0.4539F, -2.4372F, 0.2793F, -0.1859F, 0.487F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(117, 96).mirror().addBox(-4.943F, 6.5204F, -0.729F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0767F, -0.4539F, -2.4372F, 0.3323F, -0.0361F, 0.0184F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(47, 128).mirror().addBox(1.2417F, -1.1117F, -0.45F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.4539F, -0.5372F, 0.0058F, -0.1156F, 1.6573F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(47, 128).addBox(-1.2417F, -1.1117F, -0.45F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.4539F, -0.5372F, 0.0058F, 0.1156F, -1.6573F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(117, 96).addBox(4.943F, 6.5204F, -0.729F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0767F, -0.4539F, -2.4372F, 0.3323F, 0.0361F, -0.0184F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(113, 106).addBox(1.3033F, 2.0778F, -0.729F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0767F, -0.4539F, -2.4372F, 0.2793F, 0.1859F, -0.487F));

		PartDefinition cube_r172 = body2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(44, 128).addBox(-0.8619F, 0.3097F, -0.6854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0767F, -0.4539F, -2.4372F, -0.0043F, 0.3414F, -1.4318F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 114).addBox(4.9584F, 6.5359F, -0.6603F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6233F, -0.2539F, -4.4372F, 0.2632F, 0.0288F, -0.0033F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(106, 113).addBox(1.3096F, 2.0987F, -0.6603F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6233F, -0.2539F, -4.4372F, 0.2203F, 0.1481F, -0.4794F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(72, 122).addBox(-0.8752F, -0.6742F, -0.6165F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6233F, -0.2539F, -4.4372F, -0.0082F, 0.2721F, -1.4157F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.0083F, -8.7716F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1989F, -5.0852F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(15, 128).addBox(-0.5F, -1.8836F, 0.1407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8395F, -3.4547F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(91, 122).addBox(-0.5F, -1.1422F, 0.3753F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2136F, -1.8212F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(126, 38).mirror().addBox(0.8815F, -0.7795F, -0.568F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.945F, -3.252F, -0.0123F, -0.3156F, 1.5216F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(82, 114).mirror().addBox(-1.223F, 2.0404F, -0.6095F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.945F, -3.252F, 0.2535F, -0.1769F, 0.5788F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(85, 114).mirror().addBox(-4.8546F, 6.525F, -0.6095F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.945F, -3.252F, 0.3056F, -0.0395F, 0.1066F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(122, 72).mirror().addBox(0.8724F, -0.6962F, -0.5915F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8233F, 0.345F, -1.352F, -0.0148F, -0.3416F, 1.4351F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(19, 114).mirror().addBox(-1.2943F, 2.0833F, -0.6348F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8233F, 0.345F, -1.352F, 0.2736F, -0.1941F, 0.4878F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(52, 114).mirror().addBox(-4.9377F, 6.5295F, -0.6348F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8233F, 0.345F, -1.352F, 0.331F, -0.0458F, 0.0183F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(52, 114).addBox(4.9377F, 6.5295F, -0.6348F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8233F, 0.345F, -1.352F, 0.331F, 0.0458F, -0.0183F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(19, 114).addBox(1.2943F, 2.0833F, -0.6348F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8233F, 0.345F, -1.352F, 0.2736F, 0.1941F, -0.4878F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(122, 72).addBox(-0.8724F, -0.6962F, -0.5915F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8233F, 0.345F, -1.352F, -0.0148F, 0.3416F, -1.4351F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(85, 114).addBox(4.8546F, 6.525F, -0.6095F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.945F, -3.252F, 0.3056F, 0.0395F, -0.1066F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(82, 114).addBox(1.223F, 2.0404F, -0.6095F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.945F, -3.252F, 0.2535F, 0.1769F, -0.5788F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(126, 38).addBox(-0.8815F, -0.7795F, -0.568F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.945F, -3.252F, -0.0123F, 0.3156F, -1.5216F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(35, 72).addBox(-0.5F, 0.9573F, -4.2101F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body6 = body.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -3.7F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r192 = body6.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(75, 122).mirror().addBox(0.8359F, -1.2116F, -0.5311F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.7084F, -1.2743F, -0.011F, -0.2109F, 1.556F));

		PartDefinition cube_r193 = body6.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(40, 114).mirror().addBox(-0.9073F, 1.7431F, -0.5635F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.7084F, -1.2743F, 0.1691F, -0.1139F, 0.6258F));

		PartDefinition cube_r194 = body6.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(43, 114).mirror().addBox(-4.4362F, 6.4108F, -0.5635F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.7084F, -1.2743F, 0.2024F, -0.0218F, 0.1446F));

		PartDefinition cube_r195 = body6.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(43, 114).addBox(4.4362F, 6.4108F, -0.5635F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.7084F, -1.2743F, 0.2024F, 0.0218F, -0.1446F));

		PartDefinition cube_r196 = body6.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(40, 114).addBox(0.9073F, 1.7431F, -0.5635F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.7084F, -1.2743F, 0.1691F, 0.1139F, -0.6258F));

		PartDefinition cube_r197 = body6.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(75, 122).addBox(-0.8359F, -1.2116F, -0.5311F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.7084F, -1.2743F, -0.011F, 0.2109F, -1.556F));

		PartDefinition cube_r198 = body6.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, 0.9486F, -7.2881F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4366F, 3.9777F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body6.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(118, 40).addBox(-0.5F, -2.5232F, 0.3468F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6938F, -1.7671F, -0.1484F, 0.0F, 0.0F));

		PartDefinition chest = body6.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7999F, -2.2917F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(112, 114).addBox(-0.5F, -3.4374F, -0.2143F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5936F, -2.7457F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(118, 46).addBox(-0.5F, -3.2374F, 0.2857F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1662F, -1.3738F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(92, 72).addBox(-1.0F, -0.2228F, -1.2642F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3563F, -8.0266F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(82, 54).addBox(-0.5F, 0.0767F, 0.2144F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.3819F, 0.7077F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(75, 48).addBox(-0.5F, 0.0072F, 0.4207F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.8598F, -3.258F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(53, 128).mirror().addBox(0.8168F, -0.7027F, -0.4764F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, -0.3585F, -2.852F, -0.0074F, -0.2634F, 1.5463F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(55, 114).mirror().addBox(-0.529F, 1.4314F, -0.4982F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, -0.3585F, -2.852F, 0.2137F, -0.1423F, 0.6113F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(115, 117).mirror().addBox(-3.9559F, 6.3132F, -0.4982F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, -0.3585F, -2.852F, 0.2548F, -0.0267F, 0.1345F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(122, 81).mirror().addBox(0.7859F, -1.7273F, -0.5311F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -1.2585F, -1.052F, -0.0131F, -0.3242F, 1.5742F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(46, 114).mirror().addBox(-0.5268F, 1.3915F, -0.5527F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -1.2585F, -1.052F, 0.2602F, -0.1826F, 0.63F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(109, 113).mirror().addBox(-3.9352F, 6.279F, -0.5527F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -1.2585F, -1.052F, 0.314F, -0.0416F, 0.1586F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(83, 65).mirror().addBox(-4.349F, 0.9778F, -0.3529F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.6166F, -6.5359F, 0.1159F, 0.479F, -0.0134F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-5.8729F, 0.9545F, -0.2571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1529F, 9.1565F, -4.6496F, 0.0081F, 0.4085F, -0.062F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(48, 10).mirror().addBox(-7.6821F, 0.9971F, -0.4259F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2768F, 9.7634F, -0.8525F, 0.2666F, 0.414F, 0.1587F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(63, 8).mirror().addBox(-6.4957F, 0.9973F, -0.4264F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3462F, 9.6972F, -2.7208F, 0.2539F, 0.3679F, 0.1258F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(48, 12).mirror().addBox(-7.7024F, 0.989F, -0.4874F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2634F, 10.0226F, 1.011F, 0.3877F, 0.3964F, 0.3033F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(48, 14).mirror().addBox(-7.8185F, 0.9832F, -0.4822F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2838F, 9.713F, 2.6862F, 0.4079F, 0.415F, 0.3531F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(-7.5419F, 0.9861F, -0.4494F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1445F, 9.5927F, 3.8804F, 0.4391F, 0.5893F, 0.4208F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-9.1949F, 0.9904F, -0.4102F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1445F, 9.5927F, 3.8804F, 0.512F, 0.8383F, 0.5383F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(63, 8).addBox(-0.5043F, 0.9973F, -0.4264F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3462F, 9.6972F, -2.7208F, 0.2539F, -0.3679F, -0.1258F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(48, 0).addBox(0.1949F, 0.9904F, -0.4102F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1445F, 9.5927F, 3.8804F, 0.512F, -0.8383F, -0.5383F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(45, 55).addBox(-0.4581F, 0.9861F, -0.4494F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1445F, 9.5927F, 3.8804F, 0.4391F, -0.5893F, -0.4208F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(48, 14).addBox(-0.1815F, 0.9832F, -0.4822F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2838F, 9.713F, 2.6862F, 0.4079F, -0.415F, -0.3531F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(48, 12).addBox(-0.2976F, 0.989F, -0.4874F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2634F, 10.0226F, 1.011F, 0.3877F, -0.3964F, -0.3033F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(48, 10).addBox(-0.3179F, 0.9971F, -0.4259F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2768F, 9.7634F, -0.8525F, 0.2666F, -0.414F, -0.1587F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(72, 68).addBox(-0.1271F, 0.9545F, -0.2571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1529F, 9.1565F, -4.6496F, 0.0081F, -0.4085F, 0.062F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(83, 65).addBox(-0.651F, 0.9778F, -0.3529F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.6166F, -6.5359F, 0.1159F, -0.479F, 0.0134F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -0.0796F, -0.8282F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.7773F, -6.6914F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(109, 113).addBox(3.9352F, 6.279F, -0.5527F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -1.2585F, -1.052F, 0.314F, 0.0416F, -0.1586F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(46, 114).addBox(0.5268F, 1.3915F, -0.5527F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -1.2585F, -1.052F, 0.2602F, 0.1826F, -0.63F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(122, 81).addBox(-0.7859F, -1.7273F, -0.5311F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -1.2585F, -1.052F, -0.0131F, 0.3242F, -1.5742F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(115, 117).addBox(3.9559F, 6.3132F, -0.4982F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, -0.3585F, -2.852F, 0.2548F, 0.0267F, -0.1345F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(55, 114).addBox(0.529F, 1.4314F, -0.4982F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, -0.3585F, -2.852F, 0.2137F, 0.1423F, -0.6113F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(53, 128).addBox(-0.8168F, -0.7027F, -0.4764F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, -0.3585F, -2.852F, -0.0074F, 0.2634F, -1.5463F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, 0.0912F, -5.1326F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.4F, 0.7F, 0.4363F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6851F, -3.3861F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(37, 117).addBox(-0.5F, -3.2724F, -0.1273F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7507F, -2.9815F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(116, 106).addBox(-0.5F, -3.5536F, 0.3333F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4546F, -1.5657F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(56, 128).mirror().addBox(0.8845F, -0.609F, -0.4762F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.1436F, -1.1659F, -0.008F, -0.246F, 1.4505F));

		PartDefinition cube_r238 = chest2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(58, 114).mirror().addBox(-0.5627F, 1.5421F, -0.4996F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.1436F, -1.1659F, 0.1992F, -0.1324F, 0.5173F));

		PartDefinition cube_r239 = chest2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(103, 118).mirror().addBox(-4.0376F, 6.3951F, -0.4996F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.1436F, -1.1659F, 0.2374F, -0.0245F, 0.0389F));

		PartDefinition cube_r240 = chest2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(59, 128).mirror().addBox(0.9582F, -0.466F, -0.5387F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5436F, -2.9659F, -0.0169F, -0.2809F, 1.3135F));

		PartDefinition cube_r241 = chest2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(22, 114).mirror().addBox(-0.6306F, 1.6868F, -0.5646F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5436F, -2.9659F, 0.2225F, -0.1601F, 0.3745F));

		PartDefinition cube_r242 = chest2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(128, 95).mirror().addBox(-4.1655F, 6.4909F, -0.5646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5436F, -2.9659F, 0.2706F, -0.0385F, -0.1015F));

		PartDefinition cube_r243 = chest2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(128, 95).addBox(4.1655F, 6.4909F, -0.5646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5436F, -2.9659F, 0.2706F, 0.0385F, 0.1015F));

		PartDefinition cube_r244 = chest2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(22, 114).addBox(0.6306F, 1.6868F, -0.5646F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5436F, -2.9659F, 0.2225F, 0.1601F, -0.3745F));

		PartDefinition cube_r245 = chest2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(59, 128).addBox(-0.9582F, -0.466F, -0.5387F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5436F, -2.9659F, -0.0169F, 0.2809F, -1.3135F));

		PartDefinition cube_r246 = chest2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(103, 118).addBox(4.0376F, 6.3951F, -0.4996F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.1436F, -1.1659F, 0.2374F, 0.0245F, -0.0389F));

		PartDefinition cube_r247 = chest2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(58, 114).addBox(0.5627F, 1.5421F, -0.4996F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.1436F, -1.1659F, 0.1992F, 0.1324F, -0.5173F));

		PartDefinition cube_r248 = chest2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(56, 128).addBox(-0.8845F, -0.609F, -0.4762F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.1436F, -1.1659F, -0.008F, 0.246F, -1.4505F));

		PartDefinition cube_r249 = chest2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(70, 70).addBox(-0.5F, 0.0912F, -9.1326F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.1F, 4.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1009F, -3.5656F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r250 = neck3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(126, 43).addBox(0.0F, -1.8185F, 0.5506F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6588F, -2.116F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r251 = neck3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(60, 96).addBox(-0.5F, 1.7445F, 2.3355F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1913F, -2.5833F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r252 = neck2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(86, 126).addBox(0.0F, -1.7107F, -0.6543F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1267F, -0.3439F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(62, 128).addBox(0.0F, -0.3614F, 0.4445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6761F, -3.1188F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r254 = neck2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(75, 34).addBox(-0.5F, 0.7561F, -2.6456F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0626F, -3.542F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(113, 45).addBox(0.0F, -1.2583F, -1.6707F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0628F, -3.0355F, 2.33F, 0.0F, 0.0F));

		PartDefinition cube_r256 = neck.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(128, 99).addBox(0.0F, -0.8105F, 0.3078F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5062F, -1.2519F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r257 = neck.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(46, 72).addBox(-0.5F, 1.2532F, 1.0187F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5182F, -4.5372F, 0.5236F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4316F, -3.8441F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r258 = neck4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(94, 59).addBox(-0.5F, 0.7504F, -2.339F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3134F, -0.184F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(97, 80).addBox(0.0F, -0.3101F, -0.9761F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.1F, 0.829F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2658F, -1.0196F, 0.3897F, -0.05F, 0.121F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(33, 85).addBox(-1.0F, -0.2242F, -2.331F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.8581F, -3.9475F, 1.885F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(77, 40).addBox(-1.0F, -0.3564F, -2.0657F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.3718F, -2.6093F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(17, 34).addBox(-1.0F, -4.6986F, -1.2205F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 8.0172F, -3.8729F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(82, 94).addBox(-1.0F, -0.6209F, -1.2161F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.4815F, -1.2889F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(123, 29).addBox(0.0F, 0.739F, -0.544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5F, 11.6653F, -7.4024F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(82, 122).addBox(1.491F, 4.4834F, -3.9593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.991F, 6.0407F, -5.9719F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(125, 32).addBox(-1.9449F, -0.1244F, -0.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8987F, 10.6359F, -7.0479F, -2.009F, 1.4264F, -0.4342F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(123, 50).addBox(0.0F, -1.9531F, 0.3027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 10.1164F, -7.3525F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(49, 110).addBox(-0.5F, -0.7674F, -1.6412F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 15.1024F, -4.6999F, -2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(78, 83).addBox(-0.5F, -0.2185F, -1.9758F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 14.9546F, -5.6889F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(25, 116).addBox(-0.5F, -1.6772F, -1.7358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 14.0242F, -6.0554F, -2.7663F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(115, 114).addBox(-0.5F, -0.9171F, 3.1105F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 10.4198F, -6.2105F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(11, 72).addBox(-1.5F, -1.1171F, 0.1105F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6948F, -6.0855F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(124, 0).addBox(-1.976F, 0.1757F, -0.8715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8987F, 9.1988F, -6.8321F, -0.9795F, 1.3389F, -0.9668F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(42, 95).addBox(0.0F, 0.1757F, 0.9844F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 9.1348F, -7.1617F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(115, 56).addBox(-1.9869F, -2.8934F, -0.8788F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8987F, 9.2217F, -6.8374F, -1.1439F, 1.2825F, -1.1278F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(83, 27).addBox(0.0F, -2.8934F, 0.9943F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 9.1348F, -7.1617F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(82, 110).addBox(-0.5F, -1.0967F, -0.9194F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.0522F, -2.6744F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5F, -2.2185F, -2.9758F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.491F, 4.3598F, -6.1131F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(88, 39).addBox(-1.0F, -1.999F, 0.0457F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.491F, 2.4632F, -5.4785F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(72, 22).addBox(-1.0F, -0.0589F, 0.9983F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.491F, 1.5532F, -5.0638F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(72, 17).addBox(-1.0F, -0.1198F, 0.9928F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.491F, 0.6703F, -4.5943F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(69, 105).addBox(-0.5F, -0.1716F, 1.3602F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.009F, -1.2372F, -3.8857F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(105, 23).addBox(-1.5F, -0.1999F, -0.6001F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(88, 43).addBox(-1.5F, -0.7999F, -0.6001F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.4766F, -1.9728F, -2.5831F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(101, 68).addBox(-1.5F, -0.9952F, 0.098F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.1024F, -0.6237F, -1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(28, 90).addBox(-1.5F, -1.7599F, 0.688F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2832F, -1.1335F, -0.8465F, 0.0F, 0.0F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(3.0479F, 7.8548F, -0.2369F));

		PartDefinition cube_r286 = leftSygomaticarch.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(19, 110).addBox(-0.7183F, -2.533F, -3.4965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, -2.2406F, 0.0208F, 0.1891F));

		PartDefinition cube_r287 = leftSygomaticarch.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(96, 18).addBox(1.2154F, -1.3498F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, -2.5008F, -1.0531F, 1.0596F));

		PartDefinition cube_r288 = leftSygomaticarch.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(85, 22).addBox(-1.8195F, -1.0047F, 0.3619F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 17).addBox(-1.8195F, -0.5297F, 0.2869F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.2527F, 4.5766F, -4.7477F, -1.1465F, 0.038F, 0.163F));

		PartDefinition cube_r289 = leftSygomaticarch.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(61, 115).addBox(-1.8195F, 0.0226F, 0.7506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(123, 117).addBox(-0.8195F, 0.0226F, 0.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2527F, 4.5766F, -4.7477F, -1.0592F, 0.038F, 0.163F));

		PartDefinition cube_r290 = leftSygomaticarch.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(21, 105).addBox(-0.8252F, -0.3741F, -1.8747F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9427F, 0.5567F, -5.1645F, 1.3494F, 0.0518F, 0.0988F));

		PartDefinition cube_r291 = leftSygomaticarch.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(11, 77).addBox(-1.7666F, 0.7291F, -0.3205F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, 1.3464F, 0.0346F, 0.1772F));

		PartDefinition cube_r292 = leftSygomaticarch.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(105, 18).addBox(-0.8252F, 1.3974F, -0.7325F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.9427F, 0.5567F, -5.1645F, -0.0032F, 0.0518F, 0.0988F));

		PartDefinition cube_r293 = leftSygomaticarch.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(14, 105).addBox(-0.8374F, -0.06F, -0.7077F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2527F, 3.4766F, -5.2477F, 0.2585F, 0.038F, 0.0408F));

		PartDefinition cube_r294 = leftSygomaticarch.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(76, 99).addBox(-1.8195F, 0.2794F, 1.1842F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.2527F, 4.5766F, -4.7477F, -0.8847F, 0.038F, 0.163F));

		PartDefinition cube_r295 = leftSygomaticarch.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(46, 84).addBox(-1.795F, -1.7759F, -0.0019F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9427F, 0.5567F, -5.1645F, -1.7573F, 0.038F, 0.1106F));

		PartDefinition cube_r296 = leftSygomaticarch.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(94, 99).addBox(-1.66F, 0.7834F, -0.2104F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1013F, -5.3398F, -5.0264F, 1.0759F, -0.1188F, -0.0029F));

		PartDefinition cube_r297 = leftSygomaticarch.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(85, 99).addBox(-1.7183F, 0.586F, 3.9224F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 100).addBox(-1.7183F, 0.7297F, 1.7682F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, 1.3373F, 0.0208F, 0.1891F));

		PartDefinition cube_r298 = leftSygomaticarch.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(99, 115).addBox(-1.7183F, 1.6262F, 2.9784F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, 1.5991F, 0.0208F, 0.1891F));

		PartDefinition cube_r299 = leftSygomaticarch.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(124, 9).addBox(-0.7183F, 2.8961F, 1.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(124, 12).addBox(-0.7183F, 2.8961F, 0.6027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(124, 6).addBox(-0.7183F, 2.5961F, 0.6027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, 2.0791F, 0.0208F, 0.1891F));

		PartDefinition cube_r300 = leftSygomaticarch.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(69, 118).addBox(-0.7183F, 2.0315F, -0.3559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, 2.2536F, 0.0208F, 0.1891F));

		PartDefinition cube_r301 = leftSygomaticarch.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(64, 118).addBox(-0.7183F, 1.8155F, -2.069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, 2.6027F, 0.0208F, 0.1891F));

		PartDefinition cube_r302 = leftSygomaticarch.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(124, 3).addBox(-0.7183F, 1.2341F, -3.7098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, -3.1133F, 0.0208F, 0.1891F));

		PartDefinition cube_r303 = leftSygomaticarch.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(83, 60).addBox(-1.7183F, -2.8875F, -2.975F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.9987F, 0.2602F, -6.2264F, -1.9788F, 0.0208F, 0.1891F));

		PartDefinition cube_r304 = leftSygomaticarch.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(5, 125).addBox(0.0257F, -0.2586F, 0.3309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.247F, -1.7759F, -2.2244F, -1.6622F, 0.0897F, 0.1635F));

		PartDefinition cube_r305 = leftSygomaticarch.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 125).addBox(0.0257F, -0.0247F, 0.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(115, 124).addBox(0.0257F, -0.6247F, 0.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.247F, -1.7759F, -2.2244F, -0.8768F, 0.0897F, 0.1635F));

		PartDefinition cube_r306 = leftSygomaticarch.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(124, 109).addBox(-0.1745F, -1.7438F, -0.3318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.247F, -1.7759F, -2.2244F, -2.5173F, 0.0834F, 0.1671F));

		PartDefinition cube_r307 = leftSygomaticarch.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(118, 30).addBox(0.8189F, 2.0536F, 0.8907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.247F, -1.7759F, -2.2244F, -0.183F, 0.0699F, 0.6518F));

		PartDefinition cube_r308 = leftSygomaticarch.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(123, 53).addBox(0.5547F, 1.4964F, 0.5657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.247F, -1.7759F, -2.2244F, -0.0201F, 0.0986F, 0.5612F));

		PartDefinition cube_r309 = leftSygomaticarch.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(26, 128).addBox(-1.0753F, -0.9358F, -0.6501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1013F, -4.4398F, -1.7264F, -2.7119F, 0.0756F, 0.0021F));

		PartDefinition cube_r310 = leftSygomaticarch.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(124, 25).addBox(0.4315F, -1.3844F, -0.6775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4486F, -5.931F, -3.991F, -2.1663F, -0.3832F, 0.2504F));

		PartDefinition cube_r311 = leftSygomaticarch.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(124, 18).addBox(-2.0863F, -1.8723F, -0.8081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1013F, -6.0398F, -4.4264F, -2.1181F, 0.0229F, -0.0117F));

		PartDefinition cube_r312 = leftSygomaticarch.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(117, 83).addBox(-1.0703F, 0.2655F, -0.7514F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1013F, -4.4398F, -1.7264F, -2.1014F, 0.0929F, -0.0101F));

		PartDefinition cube_r313 = leftSygomaticarch.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(124, 15).addBox(-1.0753F, -0.6833F, -0.838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1013F, -4.4398F, -1.7264F, -1.7956F, 0.0756F, 0.0021F));

		PartDefinition cube_r314 = leftSygomaticarch.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(50, 125).addBox(-1.1009F, -0.6075F, -0.4871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(45, 125).addBox(-1.1009F, -0.6075F, -0.1871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1309F, -4.3518F, -1.2206F, -1.0263F, 0.1382F, 0.0773F));

		PartDefinition cube_r315 = leftSygomaticarch.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(40, 125).addBox(-0.1745F, -2.4183F, 0.9948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 35).addBox(-0.1745F, -1.8182F, 0.9948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.247F, -1.7759F, -2.2244F, -0.0128F, 0.0834F, 0.1671F));

		PartDefinition cube_r316 = leftSygomaticarch.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(14, 116).addBox(-0.1745F, -1.1522F, 0.8225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.247F, -1.7759F, -2.2244F, -0.1873F, 0.0834F, 0.1671F));

		PartDefinition cube_r317 = leftSygomaticarch.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(10, 125).addBox(-0.1745F, -1.1826F, 0.5256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.247F, -1.7759F, -2.2244F, -0.4055F, 0.0834F, 0.1671F));

		PartDefinition cube_r318 = leftSygomaticarch.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(118, 117).addBox(-0.1745F, 0.0082F, 0.5564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.247F, -1.7759F, -2.2244F, -0.0564F, 0.0834F, 0.1671F));

		PartDefinition cube_r319 = leftSygomaticarch.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(100, 93).addBox(-0.5115F, -1.407F, -0.5055F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3521F, -2.0418F, -1.3833F, 0.0352F, 0.0118F, -0.0013F));

		PartDefinition cube_r320 = leftSygomaticarch.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(7, 105).addBox(-0.5115F, -1.0727F, -0.4262F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.3479F, -0.3028F, -1.2233F, -0.1393F, 0.0118F, -0.0013F));

		PartDefinition cube_r321 = leftSygomaticarch.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(112, 0).addBox(-0.8332F, -0.9918F, -0.1561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.385F, 7.0191F, -3.6201F, -0.8833F, 0.0426F, 0.015F));

		PartDefinition cube_r322 = leftSygomaticarch.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(75, 110).addBox(-0.1584F, -0.9918F, -0.1303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(111, 52).addBox(-0.4584F, -0.9918F, -0.1303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.385F, 7.0191F, -3.6201F, -0.8823F, -0.0128F, 0.0824F));

		PartDefinition cube_r323 = leftSygomaticarch.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(111, 41).addBox(-0.4523F, -0.9142F, -0.141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(110, 71).addBox(-0.1522F, -0.9142F, -0.141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3886F, 7.4547F, -3.8851F, -0.7954F, -0.02F, 0.081F));

		PartDefinition cube_r324 = leftSygomaticarch.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(112, 79).addBox(-0.4935F, -0.5363F, -0.4417F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.6726F, 8.452F, -2.3193F, -0.5304F, 0.0192F, 0.081F));

		PartDefinition cube_r325 = leftSygomaticarch.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(94, 125).addBox(-0.4935F, -0.3612F, 1.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.6726F, 8.452F, -2.3193F, -0.3995F, 0.0192F, 0.081F));

		PartDefinition cube_r326 = leftSygomaticarch.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(112, 26).addBox(-0.4935F, -0.9826F, -0.6769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.6726F, 8.452F, -2.3193F, -0.6613F, 0.0192F, 0.081F));

		PartDefinition cube_r327 = leftSygomaticarch.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(50, 122).addBox(-0.4935F, -1.3039F, 0.524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.6726F, 8.452F, -2.3193F, -1.0103F, 0.0192F, 0.081F));

		PartDefinition cube_r328 = leftSygomaticarch.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(45, 122).addBox(-0.4935F, -1.3039F, 0.524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1726F, 8.477F, -2.2943F, -1.0103F, 0.0192F, 0.081F));

		PartDefinition cube_r329 = leftSygomaticarch.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(125, 83).addBox(-0.4935F, -0.3612F, 1.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.1726F, 8.477F, -2.2943F, -0.3995F, 0.0192F, 0.081F));

		PartDefinition cube_r330 = leftSygomaticarch.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(118, 52).addBox(-0.3348F, 0.4411F, -0.7178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.8479F, 3.5158F, -6.8603F, 1.5547F, 0.0241F, 0.3924F));

		PartDefinition cube_r331 = leftSygomaticarch.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(42, 110).addBox(-0.4129F, 0.2634F, 0.0752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9479F, 3.8915F, -6.749F, 0.5883F, -0.044F, 0.1281F));

		PartDefinition cube_r332 = leftSygomaticarch.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(28, 125).addBox(-1.8638F, -1.4028F, -0.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0555F, 2.7554F, -7.2328F, -1.7145F, 1.1305F, -0.1302F));

		PartDefinition cube_r333 = leftSygomaticarch.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(15, 125).addBox(-0.6655F, -1.9386F, -0.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5479F, 2.7607F, -7.1461F, -1.6328F, 0.1742F, -0.0108F));

		PartDefinition cube_r334 = leftSygomaticarch.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(123, 123).addBox(-1.8922F, 0.1757F, 0.416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0555F, 1.2634F, -7.01F, -0.4311F, 1.0966F, -0.3884F));

		PartDefinition cube_r335 = leftSygomaticarch.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(123, 120).addBox(-0.6709F, 0.1757F, 0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5479F, 1.28F, -6.9248F, -0.1949F, 0.1713F, -0.0336F));

		PartDefinition cube_r336 = leftSygomaticarch.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(105, 13).addBox(-2.9011F, -2.8934F, 0.4202F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0555F, 1.2575F, -7.0087F, -0.5651F, 1.0663F, -0.5067F));

		PartDefinition cube_r337 = leftSygomaticarch.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(88, 116).addBox(-0.6727F, -2.8934F, 0.9792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5479F, 1.28F, -6.9248F, -0.2657F, 0.1685F, -0.0456F));

		PartDefinition cube_r338 = leftSygomaticarch.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(125, 56).addBox(-0.976F, -1.6579F, -1.6828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 125).addBox(-0.976F, -1.6579F, -1.2828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5199F, -3.4052F, -6.0357F, -2.0619F, 0.545F, 1.6297F));

		PartDefinition cube_r339 = leftSygomaticarch.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(119, 13).addBox(-1.8422F, -1.24F, -1.4828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7944F, -2.4501F, -6.1473F, 2.8715F, 1.1391F, 0.0335F));

		PartDefinition cube_r340 = leftSygomaticarch.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(25, 119).addBox(-1.776F, -0.014F, -1.6305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5199F, -3.4052F, -6.0357F, 2.609F, 0.8178F, -0.3976F));

		PartDefinition cube_r341 = leftSygomaticarch.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(119, 17).addBox(-1.1891F, -0.014F, -1.9819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5199F, -3.4052F, -6.0357F, 2.7808F, 0.1812F, -0.0594F));

		PartDefinition cube_r342 = leftSygomaticarch.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(119, 0).addBox(-0.8965F, -1.24F, -1.9055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0389F, -2.5059F, -6.024F, 3.0252F, 0.2785F, 0.2477F));

		PartDefinition cube_r343 = leftSygomaticarch.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(56, 110).addBox(-1.9054F, -1.4222F, 0.0457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5389F, -5.3916F, -5.2416F, -2.2405F, 1.0342F, -0.5975F));

		PartDefinition cube_r344 = leftSygomaticarch.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(35, 124).addBox(-1.9642F, -0.0589F, 0.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5389F, -6.3016F, -4.8269F, -1.0543F, 1.0737F, -0.9971F));

		PartDefinition cube_r345 = leftSygomaticarch.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(124, 60).addBox(-1.9609F, -0.103F, 0.257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5389F, -6.743F, -4.5921F, -1.1049F, 1.0371F, -1.0371F));

		PartDefinition cube_r346 = leftSygomaticarch.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(120, 96).addBox(-0.8683F, 0.0871F, 0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5401F, -7.2186F, -4.3369F, -0.1458F, -0.4251F, -0.8797F));

		PartDefinition cube_r347 = leftSygomaticarch.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(108, 36).addBox(-0.9177F, -2.1455F, 0.9859F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5401F, -7.2186F, -4.3369F, -0.4702F, -0.2687F, -0.4958F));

		PartDefinition cube_r348 = leftSygomaticarch.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(103, 57).addBox(-1.4926F, -1.9716F, 0.8532F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5389F, -7.7842F, -3.4138F, -0.6066F, 0.4429F, -0.289F));

		PartDefinition cube_r349 = leftSygomaticarch.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(117, 10).addBox(-2.9975F, 0.0697F, -0.991F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7235F, -8.7405F, -2.5459F, 3.0109F, 1.2085F, -1.7671F));

		PartDefinition cube_r350 = leftSygomaticarch.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(81, 125).addBox(-1.7969F, 0.0697F, -1.1001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8106F, -9.8503F, -2.6498F, 3.0872F, 0.5561F, -1.6736F));

		PartDefinition cube_r351 = leftSygomaticarch.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(125, 80).addBox(-1.5898F, -1.5404F, -1.1001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5479F, -10.4233F, -3.0078F, -2.7421F, 0.4014F, -0.7467F));

		PartDefinition cube_r352 = leftSygomaticarch.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(32, 117).addBox(-0.7194F, -0.9111F, 0.855F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0876F, -7.8324F, -1.6581F, -0.7945F, -0.0953F, 0.5642F));

		PartDefinition cube_r353 = leftSygomaticarch.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(110, 57).addBox(-0.1459F, -0.4111F, 0.388F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.56F, -8.6107F, -0.0238F, -0.8201F, 0.2399F, 0.2182F));

		PartDefinition cube_r354 = leftSygomaticarch.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(112, 17).addBox(-0.4935F, -0.9826F, -0.6769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.1726F, 8.477F, -2.2943F, -0.6613F, 0.0192F, 0.081F));

		PartDefinition cube_r355 = leftSygomaticarch.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(112, 13).addBox(-0.4935F, -0.5363F, -0.4417F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.1726F, 8.477F, -2.2943F, -0.5304F, 0.0192F, 0.081F));

		PartDefinition cube_r356 = leftSygomaticarch.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(111, 31).addBox(-0.5316F, -0.9141F, -0.0903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.684F, 7.3949F, -3.9261F, -0.796F, 0.0411F, 0.0186F));

		PartDefinition cube_r357 = leftSygomaticarch.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(96, 13).addBox(-0.3865F, -0.0553F, -2.1327F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4714F, 2.2547F, -0.6198F, 0.4715F, 0.0118F, -0.0013F));

		PartDefinition cube_r358 = leftSygomaticarch.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(21, 99).addBox(-0.5115F, 0.2327F, -0.4985F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3479F, -0.3028F, -1.2233F, 0.0788F, 0.0118F, -0.0013F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-3.0479F, 7.8548F, -0.2369F));

		PartDefinition cube_r359 = rightSygomaticarch.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(19, 110).mirror().addBox(-0.2817F, -2.533F, -3.4965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, -2.2406F, -0.0208F, -0.1891F));

		PartDefinition cube_r360 = rightSygomaticarch.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(96, 18).mirror().addBox(-2.2154F, -1.3498F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, -2.5008F, 1.0531F, -1.0596F));

		PartDefinition cube_r361 = rightSygomaticarch.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(85, 22).mirror().addBox(-0.1805F, -1.0047F, 0.3619F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 17).mirror().addBox(-0.1805F, -0.5297F, 0.2869F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.2527F, 4.5766F, -4.7477F, -1.1465F, -0.038F, -0.163F));

		PartDefinition cube_r362 = rightSygomaticarch.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(61, 115).mirror().addBox(-0.1805F, 0.0226F, 0.7506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(123, 117).mirror().addBox(-0.1805F, 0.0226F, 0.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2527F, 4.5766F, -4.7477F, -1.0592F, -0.038F, -0.163F));

		PartDefinition cube_r363 = rightSygomaticarch.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(21, 105).mirror().addBox(-0.1748F, -0.3741F, -1.8747F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9427F, 0.5567F, -5.1645F, 1.3494F, -0.0518F, -0.0988F));

		PartDefinition cube_r364 = rightSygomaticarch.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(11, 77).mirror().addBox(-0.2334F, 0.7291F, -0.3205F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, 1.3464F, -0.0346F, -0.1772F));

		PartDefinition cube_r365 = rightSygomaticarch.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(105, 18).mirror().addBox(-0.1748F, 1.3974F, -0.7325F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.9427F, 0.5567F, -5.1645F, -0.0032F, -0.0518F, -0.0988F));

		PartDefinition cube_r366 = rightSygomaticarch.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(14, 105).mirror().addBox(-0.1626F, -0.06F, -0.7077F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2527F, 3.4766F, -5.2477F, 0.2585F, -0.038F, -0.0408F));

		PartDefinition cube_r367 = rightSygomaticarch.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(76, 99).mirror().addBox(-0.1805F, 0.2794F, 1.1842F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.2527F, 4.5766F, -4.7477F, -0.8847F, -0.038F, -0.163F));

		PartDefinition cube_r368 = rightSygomaticarch.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(46, 84).mirror().addBox(-0.205F, -1.7759F, -0.0019F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9427F, 0.5567F, -5.1645F, -1.7573F, -0.038F, -0.1106F));

		PartDefinition cube_r369 = rightSygomaticarch.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(94, 99).mirror().addBox(-0.34F, 0.7834F, -0.2104F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, -5.3398F, -5.0264F, 1.0759F, 0.1188F, 0.0029F));

		PartDefinition cube_r370 = rightSygomaticarch.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(85, 99).mirror().addBox(-0.2817F, 0.586F, 3.9224F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 100).mirror().addBox(-0.2817F, 0.7297F, 1.7682F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, 1.3373F, -0.0208F, -0.1891F));

		PartDefinition cube_r371 = rightSygomaticarch.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(99, 115).mirror().addBox(-0.2817F, 1.6262F, 2.9784F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, 1.5991F, -0.0208F, -0.1891F));

		PartDefinition cube_r372 = rightSygomaticarch.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(124, 9).mirror().addBox(-0.2817F, 2.8961F, 1.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(124, 12).mirror().addBox(-0.2817F, 2.8961F, 0.6027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(124, 6).mirror().addBox(-0.2817F, 2.5961F, 0.6027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, 2.0791F, -0.0208F, -0.1891F));

		PartDefinition cube_r373 = rightSygomaticarch.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(69, 118).mirror().addBox(-0.2817F, 2.0315F, -0.3559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, 2.2536F, -0.0208F, -0.1891F));

		PartDefinition cube_r374 = rightSygomaticarch.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(64, 118).mirror().addBox(-0.2817F, 1.8155F, -2.069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, 2.6027F, -0.0208F, -0.1891F));

		PartDefinition cube_r375 = rightSygomaticarch.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(124, 3).mirror().addBox(-0.2817F, 1.2341F, -3.7098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, -3.1133F, -0.0208F, -0.1891F));

		PartDefinition cube_r376 = rightSygomaticarch.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(83, 60).mirror().addBox(-0.2817F, -2.8875F, -2.975F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.9987F, 0.2602F, -6.2264F, -1.9788F, -0.0208F, -0.1891F));

		PartDefinition cube_r377 = rightSygomaticarch.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(5, 125).mirror().addBox(-1.0257F, -0.2586F, 0.3309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.247F, -1.7759F, -2.2244F, -1.6622F, -0.0897F, -0.1635F));

		PartDefinition cube_r378 = rightSygomaticarch.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-1.0257F, -0.0247F, 0.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(115, 124).mirror().addBox(-1.0257F, -0.6247F, 0.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.247F, -1.7759F, -2.2244F, -0.8768F, -0.0897F, -0.1635F));

		PartDefinition cube_r379 = rightSygomaticarch.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(124, 109).mirror().addBox(-0.8255F, -1.7438F, -0.3318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.247F, -1.7759F, -2.2244F, -2.5173F, -0.0834F, -0.1671F));

		PartDefinition cube_r380 = rightSygomaticarch.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(118, 30).mirror().addBox(-1.8189F, 2.0536F, 0.8907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.247F, -1.7759F, -2.2244F, -0.183F, -0.0699F, -0.6518F));

		PartDefinition cube_r381 = rightSygomaticarch.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(123, 53).mirror().addBox(-1.5547F, 1.4964F, 0.5657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.247F, -1.7759F, -2.2244F, -0.0201F, -0.0986F, -0.5612F));

		PartDefinition cube_r382 = rightSygomaticarch.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(26, 128).mirror().addBox(0.0753F, -0.9358F, -0.6501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, -4.4398F, -1.7264F, -2.7119F, -0.0756F, -0.0021F));

		PartDefinition cube_r383 = rightSygomaticarch.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(124, 25).mirror().addBox(-1.4315F, -1.3844F, -0.6775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4486F, -5.931F, -3.991F, -2.1663F, 0.3832F, -0.2504F));

		PartDefinition cube_r384 = rightSygomaticarch.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(124, 18).mirror().addBox(1.0863F, -1.8723F, -0.8081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, -6.0398F, -4.4264F, -2.1181F, -0.0229F, 0.0117F));

		PartDefinition cube_r385 = rightSygomaticarch.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(117, 83).mirror().addBox(0.0703F, 0.2655F, -0.7514F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, -4.4398F, -1.7264F, -2.1014F, -0.0929F, 0.0101F));

		PartDefinition cube_r386 = rightSygomaticarch.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(124, 15).mirror().addBox(0.0753F, -0.6833F, -0.838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, -4.4398F, -1.7264F, -1.7956F, -0.0756F, -0.0021F));

		PartDefinition cube_r387 = rightSygomaticarch.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(50, 125).mirror().addBox(0.1009F, -0.6075F, -0.4871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(45, 125).mirror().addBox(0.1009F, -0.6075F, -0.1871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1309F, -4.3518F, -1.2206F, -1.0263F, -0.1382F, -0.0773F));

		PartDefinition cube_r388 = rightSygomaticarch.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(40, 125).mirror().addBox(-0.8255F, -2.4183F, 0.9948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(125, 35).mirror().addBox(-0.8255F, -1.8182F, 0.9948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.247F, -1.7759F, -2.2244F, -0.0128F, -0.0834F, -0.1671F));

		PartDefinition cube_r389 = rightSygomaticarch.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(14, 116).mirror().addBox(-0.8255F, -1.1522F, 0.8225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.247F, -1.7759F, -2.2244F, -0.1873F, -0.0834F, -0.1671F));

		PartDefinition cube_r390 = rightSygomaticarch.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(10, 125).mirror().addBox(-0.8255F, -1.1826F, 0.5256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.247F, -1.7759F, -2.2244F, -0.4055F, -0.0834F, -0.1671F));

		PartDefinition cube_r391 = rightSygomaticarch.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(118, 117).mirror().addBox(-0.8255F, 0.0082F, 0.5564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.247F, -1.7759F, -2.2244F, -0.0564F, -0.0834F, -0.1671F));

		PartDefinition cube_r392 = rightSygomaticarch.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(100, 93).mirror().addBox(-0.4885F, -1.407F, -0.5055F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3521F, -2.0418F, -1.3833F, 0.0352F, -0.0118F, 0.0013F));

		PartDefinition cube_r393 = rightSygomaticarch.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(7, 105).mirror().addBox(-0.4885F, -1.0727F, -0.4262F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.3479F, -0.3028F, -1.2233F, -0.1393F, -0.0118F, 0.0013F));

		PartDefinition cube_r394 = rightSygomaticarch.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-0.1668F, -0.9918F, -0.1561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.385F, 7.0191F, -3.6201F, -0.8833F, -0.0426F, -0.015F));

		PartDefinition cube_r395 = rightSygomaticarch.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(75, 110).mirror().addBox(-0.8416F, -0.9918F, -0.1303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(111, 52).mirror().addBox(-0.5416F, -0.9918F, -0.1303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.385F, 7.0191F, -3.6201F, -0.8823F, 0.0128F, -0.0824F));

		PartDefinition cube_r396 = rightSygomaticarch.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(111, 41).mirror().addBox(-0.5477F, -0.9142F, -0.141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(110, 71).mirror().addBox(-0.8478F, -0.9142F, -0.141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3886F, 7.4547F, -3.8851F, -0.7954F, 0.02F, -0.081F));

		PartDefinition cube_r397 = rightSygomaticarch.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(112, 79).mirror().addBox(-0.5065F, -0.5363F, -0.4417F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.6726F, 8.452F, -2.3193F, -0.5304F, -0.0192F, -0.081F));

		PartDefinition cube_r398 = rightSygomaticarch.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(94, 125).mirror().addBox(-0.5065F, -0.3612F, 1.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.6726F, 8.452F, -2.3193F, -0.3995F, -0.0192F, -0.081F));

		PartDefinition cube_r399 = rightSygomaticarch.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(112, 26).mirror().addBox(-0.5065F, -0.9826F, -0.6769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.6726F, 8.452F, -2.3193F, -0.6613F, -0.0192F, -0.081F));

		PartDefinition cube_r400 = rightSygomaticarch.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(50, 122).mirror().addBox(-0.5065F, -1.3039F, 0.524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.6726F, 8.452F, -2.3193F, -1.0103F, -0.0192F, -0.081F));

		PartDefinition cube_r401 = rightSygomaticarch.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(45, 122).mirror().addBox(-0.5065F, -1.3039F, 0.524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1726F, 8.477F, -2.2943F, -1.0103F, -0.0192F, -0.081F));

		PartDefinition cube_r402 = rightSygomaticarch.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(125, 83).mirror().addBox(-0.5065F, -0.3612F, 1.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.1726F, 8.477F, -2.2943F, -0.3995F, -0.0192F, -0.081F));

		PartDefinition cube_r403 = rightSygomaticarch.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(118, 52).mirror().addBox(-0.6652F, 0.4411F, -0.7178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.8479F, 3.5158F, -6.8603F, 1.5547F, -0.0241F, -0.3924F));

		PartDefinition cube_r404 = rightSygomaticarch.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(42, 110).mirror().addBox(-0.5871F, 0.2634F, 0.0752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9479F, 3.8915F, -6.749F, 0.5883F, 0.044F, -0.1281F));

		PartDefinition cube_r405 = rightSygomaticarch.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(28, 125).mirror().addBox(0.8638F, -1.4028F, -0.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0555F, 2.7554F, -7.2328F, -1.7145F, -1.1305F, 0.1302F));

		PartDefinition cube_r406 = rightSygomaticarch.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(15, 125).mirror().addBox(-0.3345F, -1.9386F, -0.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5479F, 2.7607F, -7.1461F, -1.6328F, -0.1742F, 0.0108F));

		PartDefinition cube_r407 = rightSygomaticarch.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(123, 123).mirror().addBox(0.8922F, 0.1757F, 0.416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0555F, 1.2634F, -7.01F, -0.4311F, -1.0966F, 0.3884F));

		PartDefinition cube_r408 = rightSygomaticarch.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(123, 120).mirror().addBox(-0.329F, 0.1757F, 0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5479F, 1.28F, -6.9248F, -0.1949F, -0.1713F, 0.0336F));

		PartDefinition cube_r409 = rightSygomaticarch.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(105, 13).mirror().addBox(0.9011F, -2.8934F, 0.4202F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0555F, 1.2575F, -7.0087F, -0.5651F, -1.0663F, 0.5067F));

		PartDefinition cube_r410 = rightSygomaticarch.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(88, 116).mirror().addBox(-0.3273F, -2.8934F, 0.9792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5479F, 1.28F, -6.9248F, -0.2657F, -0.1685F, 0.0456F));

		PartDefinition cube_r411 = rightSygomaticarch.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(125, 56).mirror().addBox(-0.024F, -1.6579F, -1.6828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 125).mirror().addBox(-0.024F, -1.6579F, -1.2828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5199F, -3.4052F, -6.0357F, -2.0619F, -0.545F, -1.6297F));

		PartDefinition cube_r412 = rightSygomaticarch.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(119, 13).mirror().addBox(0.8422F, -1.24F, -1.4828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7944F, -2.4501F, -6.1473F, 2.8715F, -1.1391F, -0.0335F));

		PartDefinition cube_r413 = rightSygomaticarch.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(25, 119).mirror().addBox(0.776F, -0.014F, -1.6305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5199F, -3.4052F, -6.0357F, 2.609F, -0.8178F, 0.3976F));

		PartDefinition cube_r414 = rightSygomaticarch.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(119, 17).mirror().addBox(0.1891F, -0.014F, -1.9819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5199F, -3.4052F, -6.0357F, 2.7808F, -0.1812F, 0.0594F));

		PartDefinition cube_r415 = rightSygomaticarch.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-0.1035F, -1.24F, -1.9055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0389F, -2.5059F, -6.024F, 3.0252F, -0.2785F, -0.2477F));

		PartDefinition cube_r416 = rightSygomaticarch.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(56, 110).mirror().addBox(0.9054F, -1.4222F, 0.0457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5389F, -5.3916F, -5.2416F, -2.2405F, -1.0342F, 0.5975F));

		PartDefinition cube_r417 = rightSygomaticarch.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(35, 124).mirror().addBox(0.9642F, -0.0589F, 0.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5389F, -6.3016F, -4.8269F, -1.0543F, -1.0737F, 0.9971F));

		PartDefinition cube_r418 = rightSygomaticarch.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(124, 60).mirror().addBox(0.9609F, -0.103F, 0.257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5389F, -6.743F, -4.5921F, -1.1049F, -1.0371F, 1.0371F));

		PartDefinition cube_r419 = rightSygomaticarch.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(120, 96).mirror().addBox(-0.1317F, 0.0871F, 0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5401F, -7.2186F, -4.3369F, -0.1458F, 0.4251F, 0.8797F));

		PartDefinition cube_r420 = rightSygomaticarch.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(108, 36).mirror().addBox(-0.0823F, -2.1455F, 0.9859F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5401F, -7.2186F, -4.3369F, -0.4702F, 0.2687F, 0.4958F));

		PartDefinition cube_r421 = rightSygomaticarch.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(103, 57).mirror().addBox(0.4926F, -1.9716F, 0.8532F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5389F, -7.7842F, -3.4138F, -0.6066F, -0.4429F, 0.289F));

		PartDefinition cube_r422 = rightSygomaticarch.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(117, 10).mirror().addBox(0.9975F, 0.0697F, -0.991F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.7235F, -8.7405F, -2.5459F, 3.0109F, -1.2085F, 1.7671F));

		PartDefinition cube_r423 = rightSygomaticarch.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(81, 125).mirror().addBox(0.7969F, 0.0697F, -1.1001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8106F, -9.8503F, -2.6498F, 3.0872F, -0.5561F, 1.6736F));

		PartDefinition cube_r424 = rightSygomaticarch.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(125, 80).mirror().addBox(0.5898F, -1.5404F, -1.1001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.5479F, -10.4233F, -3.0078F, -2.7421F, -0.4014F, 0.7467F));

		PartDefinition cube_r425 = rightSygomaticarch.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(32, 117).mirror().addBox(-0.2806F, -0.9111F, 0.855F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.0876F, -7.8324F, -1.6581F, -0.7945F, 0.0953F, -0.5642F));

		PartDefinition cube_r426 = rightSygomaticarch.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(110, 57).mirror().addBox(-0.8541F, -0.4111F, 0.388F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.56F, -8.6107F, -0.0238F, -0.8201F, -0.2399F, -0.2182F));

		PartDefinition cube_r427 = rightSygomaticarch.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(112, 17).mirror().addBox(-0.5065F, -0.9826F, -0.6769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.1726F, 8.477F, -2.2943F, -0.6613F, -0.0192F, -0.081F));

		PartDefinition cube_r428 = rightSygomaticarch.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(112, 13).mirror().addBox(-0.5065F, -0.5363F, -0.4417F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.1726F, 8.477F, -2.2943F, -0.5304F, -0.0192F, -0.081F));

		PartDefinition cube_r429 = rightSygomaticarch.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(111, 31).mirror().addBox(-0.4684F, -0.9141F, -0.0903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.684F, 7.3949F, -3.9261F, -0.796F, -0.0411F, -0.0186F));

		PartDefinition cube_r430 = rightSygomaticarch.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(96, 13).mirror().addBox(-0.6135F, -0.0553F, -2.1327F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4714F, 2.2547F, -0.6198F, 0.4715F, -0.0118F, 0.0013F));

		PartDefinition cube_r431 = rightSygomaticarch.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(21, 99).mirror().addBox(-0.4885F, 0.2327F, -0.4985F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3479F, -0.3028F, -1.2233F, 0.0788F, -0.0118F, 0.0013F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9093F, -1.8803F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(24, 76).mirror().addBox(-0.0377F, -0.131F, -1.1732F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.1F, 3.3F, -0.5236F, 0.0F, -0.1047F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(122, 86).mirror().addBox(-0.0377F, -0.0848F, -0.2234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.1F, 3.3F, 0.2356F, 0.0F, -0.1047F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(125, 72).mirror().addBox(-0.5377F, -0.9297F, -0.6335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5517F, 1.8329F, 4.6474F, -1.5621F, 0.0F, -0.1047F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.051F, -1.0352F, 0.1487F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(28, 96).mirror().addBox(-0.051F, -0.2352F, 0.1487F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9039F, 3.3425F, 4.2115F, -1.637F, -0.0171F, -0.2095F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(94, 88).mirror().addBox(-0.5377F, -1.3883F, -1.852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6276F, 1.1108F, 3.5349F, -1.789F, 0.0F, -0.1047F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(62, 48).mirror().addBox(0.1251F, -0.3863F, -0.4214F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1039F, 7.1425F, 4.2115F, -1.7613F, -0.0168F, 0.0085F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(85, 88).mirror().addBox(-0.5407F, -1.8937F, -0.0748F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9981F, 4.5692F, 1.9417F, -1.565F, -0.0135F, -0.1486F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(58, 57).mirror().addBox(0.1251F, -1.2231F, 0.1305F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1039F, 7.1425F, 4.2115F, -1.7963F, -0.0168F, 0.0085F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(124, 63).mirror().addBox(-0.5377F, -0.0694F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7134F, -0.0049F, 1.4166F, -0.4363F, 0.0F, -0.1047F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(124, 77).mirror().addBox(-0.5377F, -0.7819F, 0.6223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7575F, -0.4252F, 0.5103F, -1.2654F, 0.0F, -0.1047F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(99, 124).mirror().addBox(-0.5377F, -1.9809F, 0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7261F, -0.1261F, -0.4434F, -1.7453F, 0.0F, -0.1047F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(74, 118).mirror().addBox(-0.5377F, -2.9299F, -1.366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6232F, 0.8533F, -0.6171F, -2.3126F, 0.0F, -0.1047F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(93, 118).mirror().addBox(-0.5377F, -0.4461F, -0.8942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6563F, 0.8385F, 4.6386F, -3.0456F, 0.0F, -0.1047F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(124, 103).mirror().addBox(-0.5377F, -0.4487F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8644F, -1.1414F, 4.4469F, 2.1904F, 0.0F, -0.1047F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(110, 63).mirror().addBox(-0.5377F, -1.2578F, -0.7416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6911F, 0.5067F, 3.5672F, -1.5708F, 0.0F, -0.1047F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(57, 77).mirror().addBox(-0.5377F, 0.1134F, -2.0072F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5517F, 1.8329F, 4.6474F, -0.2531F, 0.0F, -0.1047F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(5, 118).mirror().addBox(-0.5377F, -2.7486F, -1.6619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5102F, 1.9283F, 0.5626F, -2.6616F, 0.0F, -0.1047F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(51, 96).mirror().addBox(-0.051F, -3.7158F, 0.188F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 105).mirror().addBox(-0.051F, -3.9158F, 0.188F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9039F, 3.3425F, 4.2115F, -2.9896F, -0.0171F, -0.2095F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(49, 105).mirror().addBox(-0.051F, -4.3925F, -1.0907F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9039F, 3.3425F, 4.2115F, 2.9881F, -0.0171F, -0.2095F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(56, 105).mirror().addBox(-0.051F, 2.1487F, -0.9648F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9039F, 3.3425F, 4.2115F, -0.0662F, -0.0171F, -0.2095F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(60, 125).mirror().addBox(-0.1983F, -4.4591F, 0.7299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9039F, 3.3425F, 4.2115F, -2.7183F, -0.0169F, -0.2531F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(0.1334F, -4.8054F, 1.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(96, 64).mirror().addBox(0.1334F, -5.0054F, 1.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 96).mirror().addBox(0.1334F, -5.0054F, 1.198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1039F, 7.1425F, 4.2115F, -2.8958F, -0.0168F, 0.0085F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(119, 25).mirror().addBox(-0.5407F, -1.9042F, -0.6834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(119, 77).mirror().addBox(-0.5407F, -1.9042F, -1.2834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9981F, 4.5692F, 1.9417F, -1.6522F, -0.0135F, -0.1486F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(26, 112).mirror().addBox(0.0883F, -4.1617F, 4.703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 7.1425F, 4.2115F, -2.3719F, -0.0216F, 0.0257F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(101, 5).mirror().addBox(0.0883F, -3.0569F, 3.884F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 7.1425F, 4.2115F, -2.1624F, -0.0216F, 0.0257F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(124, 106).mirror().addBox(0.0883F, -1.2373F, 6.2866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 7.1425F, 4.2115F, -1.9443F, -0.0216F, 0.0257F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(114, 21).mirror().addBox(0.0883F, 4.3793F, 1.9064F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 7.1425F, 4.2115F, -0.6353F, -0.0216F, 0.0257F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(110, 75).mirror().addBox(-0.0572F, 0.2572F, -0.1854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1039F, 7.1425F, 4.2115F, -1.4109F, -0.0158F, -0.0788F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(125, 66).mirror().addBox(0.7473F, -1.2175F, 6.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2289F, 7.1425F, 4.2115F, -1.9449F, -0.0219F, 0.0606F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(110, 67).mirror().addBox(0.7473F, -4.1267F, 4.6739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2289F, 7.1425F, 4.2115F, -2.3725F, -0.0219F, 0.0606F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(60, 125).addBox(-0.8017F, -4.4591F, 0.7299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9039F, 3.3425F, 4.2115F, -2.7183F, 0.0169F, 0.2531F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(58, 57).addBox(-1.1251F, -1.2231F, 0.1305F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1039F, 7.1425F, 4.2115F, -1.7963F, 0.0168F, -0.0085F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(119, 77).addBox(-0.4593F, -1.9042F, -1.2834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(119, 25).addBox(-0.4593F, -1.9042F, -0.6834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9981F, 4.5692F, 1.9417F, -1.6522F, 0.0135F, 0.1486F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(110, 67).addBox(-1.7473F, -4.1267F, 4.6739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2289F, 7.1425F, 4.2115F, -2.3725F, 0.0219F, -0.0606F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(125, 66).addBox(-1.7473F, -1.2175F, 6.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2289F, 7.1425F, 4.2115F, -1.9449F, 0.0219F, -0.0606F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(101, 5).addBox(-2.0883F, -3.0569F, 3.884F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1289F, 7.1425F, 4.2115F, -2.1624F, 0.0216F, -0.0257F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(114, 21).addBox(-2.0883F, 4.3793F, 1.9064F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1289F, 7.1425F, 4.2115F, -0.6353F, 0.0216F, -0.0257F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(124, 106).addBox(-1.0883F, -1.2373F, 6.2866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1289F, 7.1425F, 4.2115F, -1.9443F, 0.0216F, -0.0257F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(26, 112).addBox(-1.0883F, -4.1617F, 4.703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1289F, 7.1425F, 4.2115F, -2.3719F, 0.0216F, -0.0257F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(85, 88).addBox(-0.4593F, -1.8937F, -0.0748F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9981F, 4.5692F, 1.9417F, -1.565F, 0.0135F, 0.1486F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(69, 96).addBox(-1.1334F, -5.0054F, 1.198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(96, 64).addBox(-1.1334F, -5.0054F, 1.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 31).addBox(-1.1334F, -4.8054F, 1.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1039F, 7.1425F, 4.2115F, -2.8958F, 0.0168F, -0.0085F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(110, 75).addBox(-0.9428F, 0.2572F, -0.1854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1039F, 7.1425F, 4.2115F, -1.4109F, 0.0158F, 0.0788F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(62, 48).addBox(-1.1251F, -0.3863F, -0.4214F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1039F, 7.1425F, 4.2115F, -1.7613F, 0.0168F, -0.0085F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(110, 63).addBox(-0.4623F, -1.2578F, -0.7416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6911F, 0.5067F, 3.5672F, -1.5708F, 0.0F, 0.1047F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(94, 88).addBox(-0.4623F, -1.3883F, -1.852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6276F, 1.1108F, 3.5349F, -1.789F, 0.0F, 0.1047F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(49, 105).addBox(-0.949F, -4.3925F, -1.0907F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9039F, 3.3425F, 4.2115F, 2.9881F, 0.0171F, 0.2095F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(42, 105).addBox(-0.949F, -3.9158F, 0.188F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(51, 96).addBox(-1.949F, -3.7158F, 0.188F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9039F, 3.3425F, 4.2115F, -2.9896F, 0.0171F, 0.2095F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(28, 96).addBox(-1.949F, -0.2352F, 0.1487F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(0, 105).addBox(-0.949F, -1.0352F, 0.1487F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9039F, 3.3425F, 4.2115F, -1.637F, 0.0171F, 0.2095F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(56, 105).addBox(-0.949F, 2.1487F, -0.9648F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9039F, 3.3425F, 4.2115F, -0.0662F, 0.0171F, 0.2095F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(124, 103).addBox(-0.4623F, -0.4487F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8644F, -1.1414F, 4.4469F, 2.1904F, 0.0F, 0.1047F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(93, 118).addBox(-0.4623F, -0.4461F, -0.8942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6563F, 0.8385F, 4.6386F, -3.0456F, 0.0F, 0.1047F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(57, 77).addBox(-1.4623F, 0.1134F, -2.0072F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5517F, 1.8329F, 4.6474F, -0.2531F, 0.0F, 0.1047F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(125, 72).addBox(-0.4623F, -0.9297F, -0.6335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5517F, 1.8329F, 4.6474F, -1.5621F, 0.0F, 0.1047F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(122, 86).addBox(-0.9623F, -0.0848F, -0.2234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1F, 1.1F, 3.3F, 0.2356F, 0.0F, 0.1047F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(5, 118).addBox(-0.4623F, -2.7486F, -1.6619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5102F, 1.9283F, 0.5626F, -2.6616F, 0.0F, 0.1047F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(74, 118).addBox(-0.4623F, -2.9299F, -1.366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6232F, 0.8533F, -0.6171F, -2.3126F, 0.0F, 0.1047F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(99, 124).addBox(-0.4623F, -1.9809F, 0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7261F, -0.1261F, -0.4434F, -1.7453F, 0.0F, 0.1047F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(124, 77).addBox(-0.4623F, -0.7819F, 0.6223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7575F, -0.4252F, 0.5103F, -1.2654F, 0.0F, 0.1047F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(124, 63).addBox(-0.4623F, -0.0694F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7134F, -0.0049F, 1.4166F, -0.4363F, 0.0F, 0.1047F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(24, 76).addBox(-1.9623F, -0.131F, -1.1732F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1F, 1.1F, 3.3F, -0.5236F, 0.0F, 0.1047F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3425F, 2.5021F, -5.0285F, 0.235F, 0.0099F, 0.1021F));

		PartDefinition cube_r492 = bone2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(103, 104).addBox(-0.8035F, 0.5803F, -2.7557F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.7081F, -4.4427F, -2.9328F, 0.9122F, 0.2457F, -0.3953F));

		PartDefinition cube_r493 = bone2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(125, 69).addBox(-0.8035F, -2.1739F, 0.9986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.421F, 2.5512F, -2.1556F, -2.3603F, 0.2457F, -0.3953F));

		PartDefinition cube_r494 = bone2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(120, 34).addBox(-0.8035F, -1.5977F, -0.2061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2255F, 3.5787F, -4.4531F, -0.7459F, 0.2457F, -0.3953F));

		PartDefinition cube_r495 = bone2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(119, 107).addBox(-0.8035F, -0.7941F, 0.0803F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2255F, 3.5787F, -4.4531F, -1.3568F, 0.2457F, -0.3953F));

		PartDefinition cube_r496 = bone2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(72, 27).addBox(-0.8035F, -1.794F, 0.9303F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.7216F, -1.0267F, -4.5477F, -1.3568F, 0.2457F, -0.3953F));

		PartDefinition cube_r497 = bone2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(106, 47).addBox(-0.8035F, 0.9302F, 0.2065F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3738F, -2.8683F, -4.1201F, -0.2223F, 0.2457F, -0.3953F));

		PartDefinition cube_r498 = bone2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(46, 16).addBox(-0.8035F, -2.4762F, -6.8253F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.7007F, -5.5216F, -1.2487F, 2.0903F, 0.2457F, -0.3953F));

		PartDefinition cube_r499 = bone2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(7, 99).addBox(-0.8035F, -3.9492F, -0.0833F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.1834F, -5.5397F, 0.6831F, 3.0502F, 0.2457F, -0.3953F));

		PartDefinition cube_r500 = bone2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(71, 55).addBox(-0.8035F, -0.2469F, 0.9203F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5479F, -5.2353F, 2.5549F, -1.8367F, 0.2457F, -0.3953F));

		PartDefinition cube_r501 = bone2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(83, 6).addBox(-0.8035F, -1.8038F, 0.5117F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7077F, -4.186F, 4.0358F, -2.5785F, 0.2457F, -0.3953F));

		PartDefinition cube_r502 = bone2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(10, 88).addBox(-0.8035F, -2.6127F, 0.7297F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5479F, -5.2353F, 2.5549F, -2.2731F, 0.2457F, -0.3953F));

		PartDefinition cube_r503 = bone2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(63, 108).addBox(-0.8035F, 0.5117F, 0.3038F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2841F, -3.4499F, 4.4646F, -1.0077F, 0.2457F, -0.3953F));

		PartDefinition cube_r504 = bone2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(37, 90).addBox(-1.6172F, -4.3718F, 0.9739F, 2.0F, 9.0F, 0.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2919F, -0.6084F, -1.7748F, -0.8947F, 0.4127F, -0.7952F));

		PartDefinition cube_r505 = bone2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(13, 63).addBox(-0.8035F, -3.3265F, -2.5261F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0417F, 1.6637F, -2.1891F, -0.7895F, 0.2457F, -0.3953F));

		PartDefinition cube_r506 = bone2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(97, 31).addBox(-0.8035F, -1.0914F, 1.7868F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7296F, 1.4369F, -4.6798F, -0.3096F, 0.2457F, -0.3953F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3425F, 2.5021F, -5.0285F, 0.235F, -0.0099F, -0.1021F));

		PartDefinition cube_r507 = bone4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(103, 104).mirror().addBox(-0.1965F, 0.5803F, -2.7557F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.7081F, -4.4427F, -2.9328F, 0.9122F, -0.2457F, 0.3953F));

		PartDefinition cube_r508 = bone4.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(125, 69).mirror().addBox(-0.1965F, -2.1739F, 0.9986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.421F, 2.5512F, -2.1556F, -2.3603F, -0.2457F, 0.3953F));

		PartDefinition cube_r509 = bone4.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(120, 34).mirror().addBox(-0.1965F, -1.5977F, -0.2061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2255F, 3.5787F, -4.4531F, -0.7459F, -0.2457F, 0.3953F));

		PartDefinition cube_r510 = bone4.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(119, 107).mirror().addBox(-0.1965F, -0.7941F, 0.0803F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2255F, 3.5787F, -4.4531F, -1.3568F, -0.2457F, 0.3953F));

		PartDefinition cube_r511 = bone4.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(72, 27).mirror().addBox(-0.1965F, -1.794F, 0.9303F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.7216F, -1.0267F, -4.5477F, -1.3568F, -0.2457F, 0.3953F));

		PartDefinition cube_r512 = bone4.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(106, 47).mirror().addBox(-0.1965F, 0.9302F, 0.2065F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.3738F, -2.8683F, -4.1201F, -0.2223F, -0.2457F, 0.3953F));

		PartDefinition cube_r513 = bone4.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(46, 16).mirror().addBox(-0.1965F, -2.4762F, -6.8253F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.7007F, -5.5216F, -1.2487F, 2.0903F, -0.2457F, 0.3953F));

		PartDefinition cube_r514 = bone4.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(7, 99).mirror().addBox(-0.1965F, -3.9492F, -0.0833F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.1834F, -5.5397F, 0.6831F, 3.0502F, -0.2457F, 0.3953F));

		PartDefinition cube_r515 = bone4.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(71, 55).mirror().addBox(-0.1965F, -0.2469F, 0.9203F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5479F, -5.2353F, 2.5549F, -1.8367F, -0.2457F, 0.3953F));

		PartDefinition cube_r516 = bone4.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-0.1965F, -1.8038F, 0.5117F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7077F, -4.186F, 4.0358F, -2.5785F, -0.2457F, 0.3953F));

		PartDefinition cube_r517 = bone4.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.1965F, -2.6127F, 0.7297F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.5479F, -5.2353F, 2.5549F, -2.2731F, -0.2457F, 0.3953F));

		PartDefinition cube_r518 = bone4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(63, 108).mirror().addBox(-0.1965F, 0.5117F, 0.3038F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2841F, -3.4499F, 4.4646F, -1.0077F, -0.2457F, 0.3953F));

		PartDefinition cube_r519 = bone4.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(37, 90).mirror().addBox(-0.3829F, -4.3718F, 0.9739F, 2.0F, 9.0F, 0.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2919F, -0.6084F, -1.7748F, -0.8947F, -0.4127F, 0.7952F));

		PartDefinition cube_r520 = bone4.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(13, 63).mirror().addBox(-0.1965F, -3.3265F, -2.5261F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0417F, 1.6637F, -2.1891F, -0.7895F, -0.2457F, 0.3953F));

		PartDefinition cube_r521 = bone4.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(97, 31).mirror().addBox(-0.1965F, -1.0914F, 1.7868F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7296F, 1.4369F, -4.6798F, -0.3096F, -0.2457F, 0.3953F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4074F, 8.0861F, -6.7069F, -0.8486F, 0.2003F, -0.084F));

		PartDefinition cube_r522 = leftArm.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(103, 85).addBox(-1.1379F, -1.6009F, 0.7873F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -1.1494F, -0.5646F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r523 = leftArm.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(117, 7).addBox(-1.1379F, 0.6009F, -0.7873F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.6093F, 0.7312F, 2.138F, 0.0F, 0.0F));

		PartDefinition cube_r524 = leftArm.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(117, 4).addBox(-1.1379F, -0.2169F, -1.9664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.4787F, -0.2602F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r525 = leftArm.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(101, 64).addBox(-1.1379F, -1.916F, -2.3766F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8032F, -0.9975F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r526 = leftArm.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(103, 27).addBox(-1.1379F, -1.1816F, -0.5681F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 0.0649F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r527 = leftArm.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(0, 114).addBox(-0.6887F, -0.0469F, -1.0191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0175F, -0.1722F, 2.3745F, -0.4015F, 0.052F, -0.0076F));

		PartDefinition cube_r528 = leftArm.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(110, 5).addBox(-0.6887F, 0.0914F, -1.0622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0969F, 0.1056F, 3.8599F, -0.0524F, 0.052F, -0.0076F));

		PartDefinition cube_r529 = leftArm.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(0, 82).addBox(-0.6887F, 0.265F, 0.865F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2507F, -0.1308F, 6.8466F, 0.1396F, 0.052F, -0.0076F));

		PartDefinition cube_r530 = leftArm.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(13, 56).addBox(-0.6887F, 0.2113F, -3.1082F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2507F, -0.1308F, 6.8466F, 0.0785F, 0.052F, -0.0076F));

		PartDefinition cube_r531 = leftArm.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(5, 122).addBox(-0.6887F, 0.5169F, 0.835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.399F, -0.7298F, 9.7825F, 0.2006F, 0.052F, -0.0076F));

		PartDefinition cube_r532 = leftArm.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(0, 122).addBox(-0.6887F, 0.982F, -0.9873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4484F, -0.9295F, 10.7611F, 1.2042F, 0.052F, -0.0076F));

		PartDefinition cube_r533 = leftArm.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(118, 121).addBox(-0.6887F, 0.2002F, 0.9614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.399F, -0.7298F, 9.7825F, -0.1484F, 0.052F, -0.0076F));

		PartDefinition cube_r534 = leftArm.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(48, 2).addBox(-0.6887F, -0.4831F, 0.835F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1201F, 1.4481F, 4.1098F, 0.2006F, 0.052F, -0.0076F));

		PartDefinition cube_r535 = leftArm.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(68, 77).addBox(-0.6901F, 0.7299F, -3.1364F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1215F, -0.0105F, 4.3214F, -0.0873F, 0.052F, -0.0076F));

		PartDefinition cube_r536 = leftArm.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(68, 114).addBox(-0.6379F, -0.0325F, -0.0882F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 0.5608F, 11.4645F, 1.0036F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6393F, 0.0338F, 11.8885F, 1.063F, -0.5207F, -0.3443F));

		PartDefinition cube_r537 = leftArm2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(0, 128).addBox(-0.7189F, -0.3354F, -1.6923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3918F, -0.878F, 1.6438F, 1.2043F, 0.0F, 0.0349F));

		PartDefinition cube_r538 = leftArm2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(114, 127).addBox(-1.7189F, 0.4784F, -0.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4F, -1.0965F, 0.6528F, 0.288F, 0.0F, 0.0349F));

		PartDefinition cube_r539 = leftArm2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(121, 21).addBox(-0.2189F, -1.6559F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.65F, 3.1908F, -0.7901F, 0.2182F, 0.0F, 0.0349F));

		PartDefinition cube_r540 = leftArm2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(126, 21).addBox(-0.2189F, -0.4994F, 0.7721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.9199F, 10.9194F, -1.3383F, -0.7418F, 0.0F, 0.0349F));

		PartDefinition cube_r541 = leftArm2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(121, 38).addBox(-0.2189F, 0.8255F, 0.1537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8576F, 9.1359F, -1.5733F, 0.1309F, 0.0F, 0.0349F));

		PartDefinition cube_r542 = leftArm2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(0, 88).addBox(0.2811F, -7.2717F, -0.0154F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.3315F, 8.378F, -1.0723F, -0.1309F, 0.0F, 0.0349F));

		PartDefinition cube_r543 = leftArm2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(67, 10).addBox(-0.2189F, -2.9186F, -0.3797F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1322F, 2.6709F, 0.7916F, -0.1745F, 0.0F, 0.0349F));

		PartDefinition cube_r544 = leftArm2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(110, 9).addBox(-0.2189F, 0.348F, -0.9487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.4093F, 10.6061F, -0.448F, 1.4835F, 0.0F, 0.0349F));

		PartDefinition cube_r545 = leftArm2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(33, 127).addBox(-0.2189F, 0.2334F, -0.9999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4372F, 11.4048F, -0.4131F, 1.6144F, 0.0F, 0.0349F));

		PartDefinition cube_r546 = leftArm2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(123, 126).addBox(-0.2189F, -0.2175F, -2.3747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F))
				.texOffs(109, 126).addBox(-0.2189F, -0.2175F, -1.5747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.3963F, 10.2335F, 0.9383F, 1.1781F, 0.0F, 0.0349F));

		PartDefinition cube_r547 = leftArm2.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(104, 126).addBox(-0.2189F, 1.3585F, -0.0526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(126, 92).addBox(-0.2189F, 0.8585F, -0.0526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.3632F, 9.2861F, -0.2581F, 0.3491F, 0.0F, 0.0349F));

		PartDefinition cube_r548 = leftArm2.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(112, 83).addBox(-0.2189F, 0.7845F, 0.2723F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2306F, 5.4884F, -0.2581F, 0.0F, 0.0F, 0.0349F));

		PartDefinition cube_r549 = leftArm2.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(117, 67).addBox(-0.2189F, -2.2513F, -0.852F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2412F, 5.792F, 0.9199F, -0.0873F, 0.0F, 0.0349F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(61, 16).addBox(-1.612F, 0.2369F, -1.4665F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0203F, 11.2981F, 0.421F, -1.7463F, 0.4359F, -1.8313F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5627F, 3.9673F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r550 = leftArm4.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(64, 34).addBox(-1.5791F, 0.7346F, -1.4665F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4074F, 8.0861F, -6.7069F, -0.8486F, -0.2003F, 0.084F));

		PartDefinition cube_r551 = rightArm.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(103, 89).addBox(-0.8621F, -1.6009F, 0.7873F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.1494F, -0.5646F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r552 = rightArm.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(117, 64).addBox(-0.8621F, 0.6009F, -0.7873F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.6093F, 0.7312F, 2.138F, 0.0F, 0.0F));

		PartDefinition cube_r553 = rightArm.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(117, 61).addBox(-0.8621F, -0.2169F, -1.9664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 1.4787F, -0.2602F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r554 = rightArm.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(101, 72).addBox(-0.8621F, -1.916F, -2.3766F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8032F, -0.9975F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r555 = rightArm.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(76, 103).addBox(-0.8621F, -1.1816F, -0.5681F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 0.0649F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r556 = rightArm.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(7, 114).addBox(-0.3113F, -0.0469F, -1.0191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0175F, -0.1722F, 2.3745F, -0.4015F, -0.052F, 0.0076F));

		PartDefinition cube_r557 = rightArm.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(7, 110).addBox(-0.3113F, 0.0914F, -1.0622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0969F, 0.1056F, 3.8599F, -0.0524F, -0.052F, 0.0076F));

		PartDefinition cube_r558 = rightArm.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(22, 82).addBox(-0.3113F, 0.265F, 0.865F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2507F, -0.1308F, 6.8466F, 0.1396F, -0.052F, 0.0076F));

		PartDefinition cube_r559 = rightArm.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(45, 57).addBox(-0.3113F, 0.2113F, -3.1082F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2507F, -0.1308F, 6.8466F, 0.0785F, -0.052F, 0.0076F));

		PartDefinition cube_r560 = rightArm.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(40, 122).addBox(-0.3113F, 0.5169F, 0.835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.399F, -0.7298F, 9.7825F, 0.2006F, -0.052F, 0.0076F));

		PartDefinition cube_r561 = rightArm.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(30, 122).addBox(-0.3113F, 0.982F, -0.9873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4484F, -0.9295F, 10.7611F, 1.2042F, -0.052F, 0.0076F));

		PartDefinition cube_r562 = rightArm.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(18, 122).addBox(-0.3113F, 0.2002F, 0.9614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.399F, -0.7298F, 9.7825F, -0.1484F, -0.052F, 0.0076F));

		PartDefinition cube_r563 = rightArm.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(17, 48).addBox(-0.3113F, -0.4831F, 0.835F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1201F, 1.4481F, 4.1098F, 0.2006F, -0.052F, 0.0076F));

		PartDefinition cube_r564 = rightArm.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(81, 70).addBox(-0.3099F, 0.7299F, -3.1364F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1215F, -0.0105F, 4.3214F, -0.0873F, -0.052F, 0.0076F));

		PartDefinition cube_r565 = rightArm.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(75, 114).addBox(-1.3621F, -0.0325F, -0.0882F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, 0.5608F, 11.4645F, 1.0036F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6393F, 0.0338F, 11.8885F, 1.063F, 0.5207F, 0.3443F));

		PartDefinition cube_r566 = rightArm2.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(10, 128).addBox(-0.2811F, -0.3354F, -1.6923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3918F, -0.878F, 1.6438F, 1.2043F, 0.0F, -0.0349F));

		PartDefinition cube_r567 = rightArm2.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(5, 128).addBox(0.7189F, 0.4784F, -0.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.4F, -1.0965F, 0.6528F, 0.288F, 0.0F, -0.0349F));

		PartDefinition cube_r568 = rightArm2.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(121, 46).addBox(-0.7811F, -1.6559F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.65F, 3.1908F, -0.7901F, 0.2182F, 0.0F, -0.0349F));

		PartDefinition cube_r569 = rightArm2.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(99, 127).addBox(-0.7811F, -0.4994F, 0.7721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.9199F, 10.9194F, -1.3383F, -0.7418F, 0.0F, -0.0349F));

		PartDefinition cube_r570 = rightArm2.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(121, 42).addBox(-0.7811F, 0.8255F, 0.1537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.8576F, 9.1359F, -1.5733F, 0.1309F, 0.0F, -0.0349F));

		PartDefinition cube_r571 = rightArm2.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(5, 88).addBox(-1.2811F, -7.2717F, -0.0154F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.3315F, 8.378F, -1.0723F, -0.1309F, 0.0F, -0.0349F));

		PartDefinition cube_r572 = rightArm2.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(101, 109).addBox(-0.7811F, -2.9186F, -0.3797F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.1322F, 2.6709F, 0.7916F, -0.1745F, 0.0F, -0.0349F));

		PartDefinition cube_r573 = rightArm2.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(68, 110).addBox(-0.7811F, 0.348F, -0.9487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.4093F, 10.6061F, -0.448F, 1.4835F, 0.0F, -0.0349F));

		PartDefinition cube_r574 = rightArm2.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(127, 89).addBox(-0.7811F, 0.2334F, -0.9999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4372F, 11.4048F, -0.4131F, 1.6144F, 0.0F, -0.0349F));

		PartDefinition cube_r575 = rightArm2.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(89, 127).addBox(-0.7811F, -0.2175F, -2.3747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F))
				.texOffs(127, 86).addBox(-0.7811F, -0.2175F, -1.5747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.3963F, 10.2335F, 0.9383F, 1.1781F, 0.0F, -0.0349F));

		PartDefinition cube_r576 = rightArm2.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(73, 127).addBox(-0.7811F, 1.3585F, -0.0526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 127).addBox(-0.7811F, 0.8585F, -0.0526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.3632F, 9.2861F, -0.2581F, 0.3491F, 0.0F, -0.0349F));

		PartDefinition cube_r577 = rightArm2.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(94, 112).addBox(-0.7811F, 0.7845F, 0.2723F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2306F, 5.4884F, -0.2581F, 0.0F, 0.0F, -0.0349F));

		PartDefinition cube_r578 = rightArm2.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(117, 72).addBox(-0.7811F, -2.2513F, -0.852F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2412F, 5.792F, 0.9199F, -0.0873F, 0.0F, -0.0349F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(61, 25).addBox(0.612F, 0.2369F, -1.4665F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0203F, 11.2981F, 0.421F, -1.7463F, -0.4359F, 1.8313F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5627F, 3.9673F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r579 = rightArm4.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(37, 64).addBox(0.5791F, 0.7346F, -1.4665F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(72, 62).addBox(-0.5F, 0.6828F, 0.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8457F, -0.4369F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r580 = tail.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(81, 128).addBox(-0.1F, -1.0493F, 0.9162F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1805F, 2.8952F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r581 = tail.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(88, 121).addBox(-0.1F, -2.221F, 0.8778F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0933F, 0.8971F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(110, 98).addBox(-0.5F, 0.2927F, 0.9197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1939F, 3.8622F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r582 = tail8.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(110, 106).addBox(0.0F, -1.039F, 3.9504F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0128F, -2.0019F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(110, 102).addBox(-0.5F, 0.2603F, 0.9328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0056F, 1.9545F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r583 = tail2.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(53, 89).addBox(0.0F, -0.6395F, 1.9719F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail9 = tail2.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(46, 78).addBox(-0.5F, 0.3927F, 0.9197F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.09F, 1.9483F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r584 = tail9.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(128, 120).addBox(0.0F, 0.0435F, 3.9296F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 117).addBox(0.0F, -0.1315F, 1.9296F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.037F, 0.0177F, -0.0262F, 0.0F, 0.0F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(35, 79).addBox(-0.5F, -0.3164F, 0.7299F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 4.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(79, 77).addBox(-0.5F, -0.1747F, 0.5647F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.2182F, 0.0F, 0.0F));

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