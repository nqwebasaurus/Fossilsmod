package fossils.fossils.client.blockentity.model.kelumapusaura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KelumapusauraFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart leftArm4;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart opposablePinkie3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart opposablePinkie2;
	private final ModelPart chest3;
	private final ModelPart chest2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart bone3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart bone4;
	private final ModelPart tail8;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail9;

	public KelumapusauraFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone6 = this.chest.getChild("bone6");
		this.leftArm4 = this.chest.getChild("leftArm4");
		this.leftArm7 = this.leftArm4.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.opposablePinkie3 = this.leftArm8.getChild("opposablePinkie3");
		this.rightArm4 = this.chest.getChild("rightArm4");
		this.rightArm7 = this.rightArm4.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.opposablePinkie2 = this.rightArm8.getChild("opposablePinkie2");
		this.chest3 = this.chest.getChild("chest3");
		this.chest2 = this.chest3.getChild("chest2");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck = this.neck7.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone = this.hips.getChild("bone");
		this.bone5 = this.hips.getChild("bone5");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.bone3 = this.leftLeg.getChild("bone3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.bone4 = this.rightLeg.getChild("bone4");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -43.0F, 4.1F, 1.0F, 43.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-12.65F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-11.8F, -37.35F, -23.8F, -0.6981F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.275F, 1.35F, -0.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-11.8F, -37.35F, -23.8F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(1.2F, -5.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, -36.5F, 4.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -43.3207F, 1.0785F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 17).addBox(-0.5F, 0.8F, 5.15F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(53, 71).addBox(-0.5F, -1.1F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1854F, -0.2962F, -0.1329F, 0.173F, -0.023F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(63, 28).addBox(-0.5F, -1.1054F, -6.6243F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0153F, -6.0835F, -0.0528F, 0.1307F, -0.0069F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.9956F, -6.9303F, 0.1072F, 0.217F, 0.0232F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 65).addBox(-0.5F, 0.7656F, 0.0369F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6401F, -5.8941F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.4275F, -5.8865F, -0.2539F, 0.1308F, -0.005F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 74).addBox(-0.5F, 0.8552F, -0.0381F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6612F, -4.6119F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 7.4421F, -0.9095F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone6 = chest.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 7.4421F, -0.9095F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm4 = chest.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4985F, 18.8111F, -6.4051F, 0.7274F, 0.0916F, 0.049F));

		PartDefinition leftArm7 = leftArm4.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.316F, 10.2404F, 1.6679F, -1.02F, 0.6849F, -0.6679F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0463F, 12.0626F, -0.0652F, 0.1256F, 0.3685F, 0.2454F));

		PartDefinition opposablePinkie3 = leftArm8.addOrReplaceChild("opposablePinkie3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm4 = chest.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4985F, 18.8111F, -6.4051F, 1.0414F, -0.136F, -0.1246F));

		PartDefinition rightArm7 = rightArm4.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.316F, 10.2404F, 1.6679F, -1.3304F, -0.5132F, 0.8955F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0463F, 12.0626F, -0.0652F, 0.1584F, -0.3562F, -0.3378F));

		PartDefinition opposablePinkie2 = rightArm8.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition chest3 = chest.addOrReplaceChild("chest3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6617F, -4.598F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 70).addBox(-0.5F, 0.8052F, -3.2131F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7243F, 0.0F, 0.0F));

		PartDefinition chest2 = chest3.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 2.5444F, -2.7267F, 0.3054F, 0.0428F, 0.0086F));

		PartDefinition cube_r8 = chest2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 55).addBox(-0.5F, 0.9135F, -1.8546F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 3.543F, -3.4443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 5.4588F, -4.9343F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(97, 55).addBox(-0.5F, -1.0F, 1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -2.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2016F, -1.0737F, 0.5542F, 0.1125F, -0.0671F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(103, 105).addBox(-0.5F, -1.0987F, 6.1911F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(100, 102).addBox(-0.5F, -1.0987F, 2.4911F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.8164F, -6.3763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5735F, -3.3438F, -0.4171F, 0.0797F, -0.1554F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(92, 105).addBox(-0.5F, 0.6232F, 9.1419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 102).addBox(-0.5F, 0.6232F, 5.4419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.2263F, -6.8488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7838F, -2.5662F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 120).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 120).addBox(-0.5F, -3.9F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.25F, -0.9206F, 0.0F, 0.0F, -0.0262F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(127, 106).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.6812F, -0.89F, -0.1469F, 0.0864F, -0.1518F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.0919F, 0.0801F, -0.1036F));

		PartDefinition cube_r13 = neck7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(128, 48).addBox(-0.5F, -2.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.0F, 0.0F, -0.0349F));

		PartDefinition neck = neck7.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6059F, 1.1927F, -0.8635F, 0.1183F, -0.1286F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(62, 114).addBox(-0.5F, -0.2386F, -0.1655F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -2.8451F, -0.2965F, -0.0102F, -0.0334F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1694F, -1.769F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6835F, 4.8227F, -15.9145F, 0.0F, -0.0349F, 0.0436F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6835F, 4.8227F, -15.9145F, 0.0F, 0.0349F, -0.0436F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6459F, -1.7149F, 0.6458F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7829F, 1.7085F, 3.5447F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7829F, 1.7085F, 3.5447F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 4.5322F, 3.2802F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.775F, -1.3637F, 1.0908F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.7146F, -2.3663F, -1.2217F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6945F, 0.0346F, 0.7069F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4266F, -2.7712F, -0.4887F, 0.0F, 0.0F));

		PartDefinition bone3 = leftLeg.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 4.5322F, 3.2802F, -0.6484F, 0.2214F, -0.0263F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.775F, -1.3637F, 1.0472F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.7146F, -2.3663F, -1.2217F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6945F, 0.0346F, 0.7069F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4266F, -2.7712F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone4 = rightLeg.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition tail8 = hips.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5241F, 8.3792F, -0.2024F, -0.1283F, 0.0262F));

		PartDefinition cube_r15 = tail8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(70, 71).addBox(-0.5F, -1.125F, 1.25F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.8911F, -1.0954F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = tail8.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0141F, 5.7948F, 0.1355F, -0.0827F, 0.0272F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 44).addBox(-0.45F, -1.125F, 7.05F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.9401F, -6.9786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2599F, 8.0214F, -0.0701F, 0.0871F, -0.0061F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 13).addBox(-0.5F, 0.2F, 13.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0057F, 8.8748F, -0.0753F, 0.174F, -0.0131F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(40, 61).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, -0.0701F, 0.0871F, -0.0061F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(59, 61).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0094F, 8.0654F, -0.0399F, 0.1744F, -0.0069F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(54, 2).addBox(-0.45F, 0.2F, -0.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 8).addBox(-0.45F, 0.2F, 7.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0132F, 0.1309F, 0.0017F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 63).addBox(-0.45F, 0.2F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0569F, 0.0871F, -0.005F));

		PartDefinition tail9 = tail7.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(31, 2).addBox(-0.425F, 0.2F, -0.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0047F, 8.0006F, -0.0569F, 0.0871F, -0.005F));

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