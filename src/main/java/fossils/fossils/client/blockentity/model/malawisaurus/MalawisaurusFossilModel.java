package fossils.fossils.client.blockentity.model.malawisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MalawisaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg8;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart eyes;
	private final ModelPart jaws;
	private final ModelPart throat;

	public MalawisaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg8 = this.leftLeg3.getChild("leftLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg8 = this.rightLeg3.getChild("rightLeg8");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.eyes = this.head.getChild("eyes");
		this.jaws = this.head.getChild("jaws");
		this.throat = this.jaws.getChild("throat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 1.75F, 8.75F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Basin_r1 = hips.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(111, 86).mirror().addBox(-0.7F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3816F, 8.313F, -1.5671F, -1.7246F, 0.0815F, -0.1893F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(102, 20).mirror().addBox(-3.5F, 0.4F, 3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(102, 20).addBox(0.5F, 0.4F, 3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(62, 13).addBox(-1.5F, -0.1F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.3985F, -3.4374F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Basin_r2 = hips.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(113, 54).mirror().addBox(-1.0F, -1.9978F, 0.0751F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(113, 54).addBox(5.8F, -1.9978F, 0.0751F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, -1.6949F, -1.1021F, -2.1031F, 0.0F, 0.0F));

		PartDefinition Basin_r3 = hips.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(101, 102).mirror().addBox(-0.5F, -1.4F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.6037F, -2.8023F, -3.5739F, -0.1745F, 0.3491F, 0.1658F));

		PartDefinition Basin_r4 = hips.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(113, 26).mirror().addBox(-1.0F, -0.1573F, -3.1902F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5214F, -5.6484F, -3.3936F, 0.9076F, 0.3491F, 0.1658F));

		PartDefinition Basin_r5 = hips.addOrReplaceChild("Basin_r5", CubeListBuilder.create().texOffs(115, 20).mirror().addBox(-1.0F, -0.022F, -3.38F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4499F, -5.4295F, -0.3909F, -0.0069F, 0.3665F, 0.1205F));

		PartDefinition Basin_r6 = hips.addOrReplaceChild("Basin_r6", CubeListBuilder.create().texOffs(123, 97).mirror().addBox(-1.0F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(123, 97).addBox(5.8F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9F, -1.899F, 4.6003F, 0.384F, 0.0F, 0.0F));

		PartDefinition Basin_r7 = hips.addOrReplaceChild("Basin_r7", CubeListBuilder.create().texOffs(111, 37).mirror().addBox(-1.0F, 0.0853F, -0.071F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(111, 37).addBox(5.8F, 0.0853F, -0.071F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.9F, -4.1633F, 2.5011F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Basin_r8 = hips.addOrReplaceChild("Basin_r8", CubeListBuilder.create().texOffs(70, 111).mirror().addBox(-1.0F, -0.1638F, -3.0504F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -3.95F, 2.35F, -0.4728F, -0.0777F, 0.0397F));

		PartDefinition Basin_r9 = hips.addOrReplaceChild("Basin_r9", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(0.0352F, -0.2363F, -0.367F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 3.6086F, 0.8072F, -1.9981F, 0.0537F, -0.362F));

		PartDefinition Basin_r10 = hips.addOrReplaceChild("Basin_r10", CubeListBuilder.create().texOffs(101, 68).mirror().addBox(0.7F, -0.7849F, -2.9763F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 3.3086F, 0.4072F, -1.2566F, 0.0F, -0.4363F));

		PartDefinition Basin_r11 = hips.addOrReplaceChild("Basin_r11", CubeListBuilder.create().texOffs(13, 101).mirror().addBox(-1.0F, -5.6978F, -1.8249F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(13, 101).addBox(5.8F, -5.6978F, -1.8249F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.9F, -0.05F, -3.05F, -1.7104F, 0.0F, 0.0F));

		PartDefinition Basin_r12 = hips.addOrReplaceChild("Basin_r12", CubeListBuilder.create().texOffs(102, 26).mirror().addBox(0.0403F, -1.4073F, -0.3925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(118, 120).mirror().addBox(0.0403F, -1.4073F, 3.4075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6222F, 2.5943F, 0.7115F, -0.8559F, 0.0308F, -0.4787F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(112, 104).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2648F, -4.9125F, 7.2597F, -0.0542F, -0.9119F, -0.4607F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(113, 45).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.2648F, -4.9125F, 7.2597F, -0.0404F, -0.6068F, -0.4805F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(113, 45).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.2648F, -4.9125F, 7.2597F, -0.0404F, 0.6068F, 0.4805F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 104).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2648F, -4.9125F, 7.2597F, -0.0542F, 0.9119F, 0.4607F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 117).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -3.9125F, 1.8626F, -0.6199F, 0.8432F, 0.0439F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 117).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.0F, -3.9125F, 1.8626F, -0.6199F, -0.8432F, -0.0439F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 69).addBox(0.0F, -0.1F, 0.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.7838F, -1.6624F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Basin_r13 = hips.addOrReplaceChild("Basin_r13", CubeListBuilder.create().texOffs(118, 120).addBox(-1.0403F, -1.4073F, 3.4075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(102, 26).addBox(-1.0403F, -1.4073F, -0.3925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.6222F, 2.5943F, 0.7115F, -0.8559F, -0.0308F, 0.4787F));

		PartDefinition Basin_r14 = hips.addOrReplaceChild("Basin_r14", CubeListBuilder.create().texOffs(101, 68).addBox(-1.7F, -0.7849F, -2.9763F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 3.3086F, 0.4072F, -1.2566F, 0.0F, 0.4363F));

		PartDefinition Basin_r15 = hips.addOrReplaceChild("Basin_r15", CubeListBuilder.create().texOffs(98, 37).addBox(-1.0352F, -0.2363F, -0.367F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6F, 3.6086F, 0.8072F, -1.9981F, -0.0537F, 0.362F));

		PartDefinition Basin_r16 = hips.addOrReplaceChild("Basin_r16", CubeListBuilder.create().texOffs(111, 86).addBox(-0.3F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3816F, 8.313F, -1.5671F, -1.7246F, -0.0815F, 0.1893F));

		PartDefinition Basin_r17 = hips.addOrReplaceChild("Basin_r17", CubeListBuilder.create().texOffs(70, 111).addBox(0.0F, -0.1638F, -3.0504F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -3.95F, 2.35F, -0.4728F, 0.0777F, -0.0397F));

		PartDefinition Basin_r18 = hips.addOrReplaceChild("Basin_r18", CubeListBuilder.create().texOffs(115, 20).addBox(0.0F, -0.022F, -3.38F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4499F, -5.4295F, -0.3909F, -0.0069F, -0.3665F, -0.1205F));

		PartDefinition Basin_r19 = hips.addOrReplaceChild("Basin_r19", CubeListBuilder.create().texOffs(113, 26).addBox(0.0F, -0.1573F, -3.1902F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5214F, -5.6484F, -3.3936F, 0.9076F, -0.3491F, -0.1658F));

		PartDefinition Basin_r20 = hips.addOrReplaceChild("Basin_r20", CubeListBuilder.create().texOffs(101, 102).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.6037F, -2.8023F, -3.5739F, -0.1745F, -0.3491F, -0.1658F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(31, 33).addBox(-0.6F, -1.3013F, -10.7282F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 0.2425F, 0.5151F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(104, 120).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4987F, -3.0282F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(94, 109).addBox(-2.5F, 0.5337F, 0.4027F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.6851F, -13.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.5092F, -12.6231F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 102).addBox(-1.5F, -8.0721F, -5.8503F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.5893F, 4.2702F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(83, 57).addBox(-1.5F, -8.1F, -6.8923F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 7.9357F, -0.0836F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(19, 74).addBox(0.5F, -5.6869F, -5.604F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.4F, 6.4175F, -1.6699F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(99, 0).addBox(-3.0F, -2.3172F, -2.7411F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3078F, -8.0265F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(71, 106).addBox(-2.7F, -12.0202F, -6.5051F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0023F, 11.1031F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg3.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2365F, 10.5139F));

		PartDefinition cube_r15 = leftLeg8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(98, 45).addBox(2.4004F, -0.5267F, -12.3543F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-5.1F, 0.2651F, -0.9006F, 0.0F, 0.0F, 0.192F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(31, 48).addBox(-1.4F, -1.3013F, -10.7282F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 0.2425F, 0.5151F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r16 = rightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(111, 120).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.4987F, -3.0282F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r17 = rightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(11, 110).addBox(-0.5F, 0.5337F, 0.4027F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6851F, -13.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.5092F, -12.6231F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r18 = rightLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 102).addBox(-0.5F, -8.0721F, -5.8503F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.5893F, 4.2702F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r19 = rightLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(15, 84).addBox(-0.5F, -8.1F, -6.8923F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 7.9357F, -0.0836F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 0).addBox(-1.5F, -5.6869F, -5.604F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.4F, 6.4175F, -1.6699F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(45, 99).addBox(-2.0F, -2.3172F, -2.7411F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3078F, -8.0265F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r21 = rightLeg3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(57, 109).addBox(-1.3F, -12.0202F, -6.5051F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0023F, 11.1031F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg3.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2365F, 10.5139F));

		PartDefinition cube_r22 = rightLeg8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(100, 61).addBox(-7.4004F, -0.5267F, -12.3543F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.1F, 0.2651F, -0.9006F, 0.0F, 0.0F, -0.192F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, -0.6F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3834F, 4.951F, -0.1646F, -0.3016F, 0.0493F));

		PartDefinition cube_r23 = tail1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(37, 129).addBox(-0.5F, -1.8F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 5.0F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(129, 35).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(60, 126).addBox(-0.5F, -2.4F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(104, 50).addBox(-2.7524F, -0.4232F, 0.2544F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.4148F, -3.8125F, 7.7597F, 0.0015F, -0.3253F, -0.49F));

		PartDefinition cube_r27 = tail1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(102, 33).addBox(-2.6411F, -0.4232F, 0.4689F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4148F, -3.8125F, 7.7597F, 0.0018F, -0.6307F, -0.4906F));

		PartDefinition cube_r28 = tail1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(104, 50).mirror().addBox(0.7524F, -0.4232F, 0.2544F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.4148F, -3.8125F, 7.7597F, 0.0015F, 0.3253F, 0.49F));

		PartDefinition cube_r29 = tail1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(102, 33).mirror().addBox(0.6411F, -0.4232F, 0.4689F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4148F, -3.8125F, 7.7597F, 0.0018F, 0.6307F, 0.4906F));

		PartDefinition cube_r30 = tail1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(72, 131).addBox(0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0671F, 0.5802F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail1.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(38, 74).addBox(0.0F, 0.0F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5535F, 2.5743F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(27, 55).addBox(0.0F, -0.1F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7004F, 5.0699F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(55, 0).addBox(-1.0F, -0.6F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(77, 94).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 105).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 133).addBox(0.0F, -2.0F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 133).addBox(0.0F, -1.9F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 30).addBox(0.0F, -2.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0207F, 6.8775F, -0.3001F, -0.504F, 0.1483F));

		PartDefinition cube_r33 = tail2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(99, 6).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.6648F, -4.0625F, 6.5097F, -0.031F, -0.299F, -0.5722F));

		PartDefinition cube_r34 = tail2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(102, 10).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6648F, -4.0625F, 6.5097F, -0.0349F, -0.5607F, -0.5627F));

		PartDefinition cube_r35 = tail2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(102, 10).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6648F, -4.0625F, 6.5097F, -0.0349F, 0.5607F, 0.5627F));

		PartDefinition cube_r36 = tail2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(99, 6).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.6648F, -4.0625F, 6.5097F, -0.031F, 0.299F, 0.5722F));

		PartDefinition cube_r37 = tail2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(39, 133).addBox(0.0F, 6.3F, 6.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 121).addBox(0.0F, 3.8F, 4.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 39).addBox(0.0F, 1.5F, 2.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 49).addBox(0.0F, 0.3F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -0.1F, 0.7592F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 63).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(48, 133).addBox(0.0F, -1.5F, 5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 61).addBox(0.0F, -1.6F, 3.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2258F, 9.9945F, 0.2875F, 0.4205F, 0.1201F));

		PartDefinition cube_r38 = tail3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(85, 50).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.5648F, -3.2125F, 3.7097F, -0.006F, -0.3354F, -0.6711F));

		PartDefinition cube_r39 = tail3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(62, 90).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5648F, -3.2125F, 3.7097F, -0.0066F, -0.5536F, -0.6696F));

		PartDefinition cube_r40 = tail3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(62, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5648F, -3.2125F, 3.7097F, -0.0066F, 0.5536F, 0.6696F));

		PartDefinition cube_r41 = tail3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(85, 50).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.5648F, -3.2125F, 3.7097F, -0.006F, 0.3354F, 0.6711F));

		PartDefinition cube_r42 = tail3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(98, 133).addBox(0.0F, 0.9F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 133).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4481F, 4.1842F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r43 = tail3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(42, 133).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7367F, 1.7009F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(109, 99).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 2.3F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(36, 133).addBox(0.0F, -2.2F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(60, 31).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.01F))
				.texOffs(133, 72).addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 133).addBox(0.0F, -0.8F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 75).addBox(0.0F, -0.8F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 133).addBox(0.0F, -0.7F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 133).addBox(0.0F, -0.7F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 133).addBox(0.0F, -0.6F, 9.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4303F, 7.6892F, 0.1718F, 0.4016F, -0.0139F));

		PartDefinition cube_r46 = tail4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(117, 133).addBox(0.0F, 0.9F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 133).addBox(0.0F, 2.5F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 133).addBox(0.0F, 2.0F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 133).addBox(0.0F, 1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 133).addBox(0.0F, 0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8381F, 0.6032F, 0.3665F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(85, 10).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1609F, 10.8678F, -0.2846F, 0.5421F, -0.0896F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(85, 19).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0014F, 6.7695F, -0.3783F, 0.6194F, -0.2268F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1438F, 6.6625F, -0.257F, 0.5522F, -0.137F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.25F, -3.5F, 0.0035F, 0.2173F, 0.0198F));

		PartDefinition chest15_r1 = body.addOrReplaceChild("chest15_r1", CubeListBuilder.create().texOffs(124, 22).mirror().addBox(-8.7493F, -5.159F, -0.3569F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3885F, -2.5954F, -0.0799F, -0.1772F, -1.5856F));

		PartDefinition chest14_r1 = body.addOrReplaceChild("chest14_r1", CubeListBuilder.create().texOffs(114, 8).mirror().addBox(-7.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3885F, -2.5954F, -0.1626F, -0.1067F, -1.0168F));

		PartDefinition chest13_r1 = body.addOrReplaceChild("chest13_r1", CubeListBuilder.create().texOffs(124, 20).mirror().addBox(-2.9063F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3885F, -2.5954F, -0.1921F, -0.0285F, -0.5864F));

		PartDefinition chest14_r2 = body.addOrReplaceChild("chest14_r2", CubeListBuilder.create().texOffs(115, 49).mirror().addBox(-10.7493F, -5.159F, -0.3569F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0885F, -4.4954F, -0.0526F, -0.0942F, -1.5195F));

		PartDefinition chest13_r2 = body.addOrReplaceChild("chest13_r2", CubeListBuilder.create().texOffs(114, 6).mirror().addBox(-7.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0885F, -4.4954F, -0.095F, -0.0512F, -0.9523F));

		PartDefinition chest12_r1 = body.addOrReplaceChild("chest12_r1", CubeListBuilder.create().texOffs(123, 105).mirror().addBox(-2.9063F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0885F, -4.4954F, -0.1077F, -0.0064F, -0.5181F));

		PartDefinition chest12_r2 = body.addOrReplaceChild("chest12_r2", CubeListBuilder.create().texOffs(114, 4).mirror().addBox(-7.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.8885F, -6.3954F, -0.0412F, -0.0067F, -0.8666F));

		PartDefinition chest13_r3 = body.addOrReplaceChild("chest13_r3", CubeListBuilder.create().texOffs(85, 54).mirror().addBox(-11.7493F, -5.159F, -0.3569F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.8885F, -6.3954F, -0.0311F, -0.0278F, -1.4335F));

		PartDefinition chest11_r1 = body.addOrReplaceChild("chest11_r1", CubeListBuilder.create().texOffs(123, 80).mirror().addBox(-2.9063F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.8885F, -6.3954F, -0.0402F, 0.0113F, -0.4306F));

		PartDefinition chest10_r1 = body.addOrReplaceChild("chest10_r1", CubeListBuilder.create().texOffs(122, 30).mirror().addBox(-2.9063F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.5885F, -8.0954F, 0.0105F, 0.0245F, -0.3948F));

		PartDefinition chest12_r3 = body.addOrReplaceChild("chest12_r3", CubeListBuilder.create().texOffs(101, 76).mirror().addBox(-12.7493F, -5.159F, -0.3569F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.5885F, -8.0954F, -0.0151F, 0.022F, -1.3987F));

		PartDefinition chest11_r2 = body.addOrReplaceChild("chest11_r2", CubeListBuilder.create().texOffs(114, 2).mirror().addBox(-7.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.5885F, -8.0954F, -0.0009F, 0.0267F, -0.8313F));

		PartDefinition chest9_r1 = body.addOrReplaceChild("chest9_r1", CubeListBuilder.create().texOffs(103, 78).mirror().addBox(-2.9063F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.2885F, -10.0954F, 0.0781F, 0.0421F, -0.3228F));

		PartDefinition chest11_r3 = body.addOrReplaceChild("chest11_r3", CubeListBuilder.create().texOffs(62, 29).mirror().addBox(-14.7493F, -5.159F, -0.3569F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.2885F, -10.0954F, 0.0064F, 0.0885F, -1.3277F));

		PartDefinition chest10_r2 = body.addOrReplaceChild("chest10_r2", CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-7.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.2885F, -10.0954F, 0.053F, 0.0712F, -0.7589F));

		PartDefinition chest10_r3 = body.addOrReplaceChild("chest10_r3", CubeListBuilder.create().texOffs(33, 31).mirror().addBox(-15.7493F, -5.159F, -0.3569F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.5885F, -12.0954F, 0.0172F, 0.1217F, -1.2567F));

		PartDefinition chest9_r2 = body.addOrReplaceChild("chest9_r2", CubeListBuilder.create().texOffs(112, 83).mirror().addBox(-7.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.5885F, -12.0954F, 0.0801F, 0.0933F, -0.6868F));

		PartDefinition chest8_r1 = body.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(102, 66).mirror().addBox(-2.9063F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.5885F, -12.0954F, 0.112F, 0.0508F, -0.2514F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(19, 117).mirror().addBox(0.3289F, -1.9382F, 0.1635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.25F, -2.4125F, 1.3626F, -0.6199F, 0.8432F, 0.0439F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(116, 108).mirror().addBox(0.3289F, -1.9382F, 0.1635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.25F, -3.9125F, -2.8874F, -0.6199F, 0.8432F, 0.0439F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(55, 116).mirror().addBox(0.3289F, -1.9382F, 0.1635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.25F, -5.6625F, -6.3874F, -0.6199F, 0.8432F, 0.0439F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(10, 116).mirror().addBox(0.3289F, -1.9382F, 0.1635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.25F, -7.4125F, -10.1374F, -0.6199F, 0.8432F, 0.0439F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(19, 117).addBox(-2.3289F, -1.9382F, 0.1635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.25F, -2.4125F, 1.3626F, -0.6199F, -0.8432F, -0.0439F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(116, 108).addBox(-2.3289F, -1.9382F, 0.1635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.25F, -3.9125F, -2.8874F, -0.6199F, -0.8432F, -0.0439F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(55, 116).addBox(-2.3289F, -1.9382F, 0.1635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.25F, -5.6625F, -6.3874F, -0.6199F, -0.8432F, -0.0439F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(10, 116).addBox(-2.3289F, -1.9382F, 0.1635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.25F, -7.4125F, -10.1374F, -0.6199F, -0.8432F, -0.0439F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -2.9F, -11.9F, 15.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.3076F, -1.7972F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(123, 125).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6096F, -0.7574F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(127, 53).addBox(-1.0F, -2.7F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.31F, -2.6308F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(125, 119).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.0104F, -4.5041F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(118, 125).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.7108F, -6.3775F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(94, 125).addBox(-1.0F, -3.3F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.4112F, -8.2508F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(71, 125).addBox(-1.0F, -3.8F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.1117F, -10.1242F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(122, 53).addBox(-1.0F, -4.5F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.8121F, -11.9975F, -0.7069F, 0.0F, 0.0F));

		PartDefinition chest12_r4 = body.addOrReplaceChild("chest12_r4", CubeListBuilder.create().texOffs(124, 20).addBox(-0.0937F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3885F, -2.5954F, -0.1921F, 0.0285F, 0.5864F));

		PartDefinition chest13_r4 = body.addOrReplaceChild("chest13_r4", CubeListBuilder.create().texOffs(114, 8).addBox(2.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3885F, -2.5954F, -0.1626F, 0.1067F, 1.0168F));

		PartDefinition chest14_r3 = body.addOrReplaceChild("chest14_r3", CubeListBuilder.create().texOffs(124, 22).addBox(5.7493F, -5.159F, -0.3569F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3885F, -2.5954F, -0.0799F, 0.1772F, 1.5856F));

		PartDefinition chest11_r4 = body.addOrReplaceChild("chest11_r4", CubeListBuilder.create().texOffs(123, 105).addBox(-0.0937F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0885F, -4.4954F, -0.1077F, 0.0064F, 0.5181F));

		PartDefinition chest12_r5 = body.addOrReplaceChild("chest12_r5", CubeListBuilder.create().texOffs(114, 6).addBox(2.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0885F, -4.4954F, -0.095F, 0.0512F, 0.9523F));

		PartDefinition chest13_r5 = body.addOrReplaceChild("chest13_r5", CubeListBuilder.create().texOffs(115, 49).addBox(5.7493F, -5.159F, -0.3569F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0885F, -4.4954F, -0.0526F, 0.0942F, 1.5195F));

		PartDefinition chest10_r4 = body.addOrReplaceChild("chest10_r4", CubeListBuilder.create().texOffs(123, 80).addBox(-0.0937F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8885F, -6.3954F, -0.0402F, -0.0113F, 0.4306F));

		PartDefinition chest12_r6 = body.addOrReplaceChild("chest12_r6", CubeListBuilder.create().texOffs(85, 54).addBox(5.7493F, -5.159F, -0.3569F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8885F, -6.3954F, -0.0311F, 0.0278F, 1.4335F));

		PartDefinition chest11_r5 = body.addOrReplaceChild("chest11_r5", CubeListBuilder.create().texOffs(114, 4).addBox(2.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8885F, -6.3954F, -0.0412F, 0.0067F, 0.8666F));

		PartDefinition chest10_r5 = body.addOrReplaceChild("chest10_r5", CubeListBuilder.create().texOffs(114, 2).addBox(2.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.5885F, -8.0954F, -0.0009F, -0.0267F, 0.8313F));

		PartDefinition chest11_r6 = body.addOrReplaceChild("chest11_r6", CubeListBuilder.create().texOffs(101, 76).addBox(5.7493F, -5.159F, -0.3569F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.5885F, -8.0954F, -0.0151F, -0.022F, 1.3987F));

		PartDefinition chest9_r3 = body.addOrReplaceChild("chest9_r3", CubeListBuilder.create().texOffs(122, 30).addBox(-0.0937F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.5885F, -8.0954F, 0.0105F, -0.0245F, 0.3948F));

		PartDefinition chest9_r4 = body.addOrReplaceChild("chest9_r4", CubeListBuilder.create().texOffs(114, 0).addBox(2.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.2885F, -10.0954F, 0.053F, -0.0712F, 0.7589F));

		PartDefinition chest10_r6 = body.addOrReplaceChild("chest10_r6", CubeListBuilder.create().texOffs(62, 29).addBox(5.7493F, -5.159F, -0.3569F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.2885F, -10.0954F, 0.0064F, -0.0885F, 1.3277F));

		PartDefinition chest8_r2 = body.addOrReplaceChild("chest8_r2", CubeListBuilder.create().texOffs(103, 78).addBox(-0.0937F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.2885F, -10.0954F, 0.0781F, -0.0421F, 0.3228F));

		PartDefinition chest7_r1 = body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(102, 66).addBox(-0.0937F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.5885F, -12.0954F, 0.112F, -0.0508F, 0.2514F));

		PartDefinition chest8_r3 = body.addOrReplaceChild("chest8_r3", CubeListBuilder.create().texOffs(112, 83).addBox(2.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.5885F, -12.0954F, 0.0801F, -0.0933F, 0.6868F));

		PartDefinition chest9_r5 = body.addOrReplaceChild("chest9_r5", CubeListBuilder.create().texOffs(33, 31).addBox(5.7493F, -5.159F, -0.3569F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.5885F, -12.0954F, 0.0172F, -0.1217F, 1.2567F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, 0.0F, 0.1F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.8471F, -12.0912F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.9F, -12.1F, 0.0516F, 0.0438F, -0.0068F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(102, 14).mirror().addBox(0.1671F, 2.6677F, 2.5077F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8958F, 12.0611F, -3.7997F, -0.4306F, -1.1492F, 0.767F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(112, 99).mirror().addBox(-1.1205F, 0.2548F, -0.2199F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8958F, 12.0611F, -3.7997F, -0.6579F, -0.9368F, 0.1821F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(33, 112).mirror().addBox(0.1671F, 2.6677F, 2.5077F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8958F, 12.0611F, -3.7997F, 0.1315F, -1.485F, 0.3458F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(112, 78).mirror().addBox(-1.1205F, 0.2548F, -0.2199F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8958F, 12.0611F, -3.7997F, -0.0794F, -1.1435F, -0.1919F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(112, 71).mirror().addBox(0.0162F, -0.1324F, -0.0288F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 12.3997F, -4.9676F, -0.2319F, -1.3865F, 0.1965F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(120, 85).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5958F, 12.4611F, -3.7997F, -2.0791F, -1.3851F, 2.7917F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(96, 86).mirror().addBox(-0.4632F, -0.9991F, -4.4136F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 98).mirror().addBox(-0.5368F, -1.0009F, -0.0864F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5773F, 11.3047F, -8.0024F, -2.6556F, 0.2106F, -3.0843F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(19, 122).mirror().addBox(-2.6058F, 0.2825F, -1.8289F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9303F, 4.0367F, -11.3563F, -2.1087F, 0.5348F, 0.2671F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(85, 37).mirror().addBox(3.2408F, 9.5722F, -11.6294F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4083F, -4.5803F, -21.1475F, 1.6053F, -0.7428F, -0.2304F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.5F, -3.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.36F, 7.48F, -9.6754F, 2.2448F, -0.7548F, -0.2258F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(96, 93).mirror().addBox(-1.0F, -3.2F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5316F, 4.1494F, -4.1352F, 1.0034F, -0.0057F, 0.0433F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-1.0F, 0.0F, -5.2F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5678F, -2.8024F, -1.7062F, 0.7264F, 0.1172F, 0.3295F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(77, 98).mirror().addBox(-1.0F, -0.1F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0165F, -0.213F, -5.1521F, 1.1084F, 0.1119F, 0.3726F));

		PartDefinition chest15_r2 = chest.addOrReplaceChild("chest15_r2", CubeListBuilder.create().texOffs(115, 51).mirror().addBox(-10.7493F, -5.159F, -0.3569F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4885F, -9.5954F, 0.1031F, 0.37F, -1.48F));

		PartDefinition chest13_r6 = chest.addOrReplaceChild("chest13_r6", CubeListBuilder.create().texOffs(124, 64).mirror().addBox(-2.9063F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4885F, -9.5954F, 0.367F, 0.1136F, -0.4747F));

		PartDefinition chest14_r4 = chest.addOrReplaceChild("chest14_r4", CubeListBuilder.create().texOffs(115, 60).mirror().addBox(-7.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4885F, -9.5954F, 0.2885F, 0.2562F, -0.8947F));

		PartDefinition chest14_r5 = chest.addOrReplaceChild("chest14_r5", CubeListBuilder.create().texOffs(83, 66).mirror().addBox(-13.7493F, -5.159F, -0.3569F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4885F, -7.5954F, 0.0674F, 0.2709F, -1.3866F));

		PartDefinition chest13_r7 = chest.addOrReplaceChild("chest13_r7", CubeListBuilder.create().texOffs(115, 18).mirror().addBox(-7.623F, -1.2519F, -0.3356F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4885F, -7.5954F, 0.2036F, 0.192F, -0.8088F));

		PartDefinition chest12_r7 = chest.addOrReplaceChild("chest12_r7", CubeListBuilder.create().texOffs(124, 62).mirror().addBox(-2.9063F, -0.0261F, -0.3356F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4885F, -7.5954F, 0.2647F, 0.0891F, -0.3803F));

		PartDefinition chest13_r8 = chest.addOrReplaceChild("chest13_r8", CubeListBuilder.create().texOffs(82, 78).mirror().addBox(-14.7493F, -5.159F, -0.3569F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0885F, -5.5954F, 0.0504F, 0.2212F, -1.3209F));

		PartDefinition chest12_r8 = chest.addOrReplaceChild("chest12_r8", CubeListBuilder.create().texOffs(115, 16).mirror().addBox(-7.623F, -1.2519F, -0.3356F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0885F, -5.5954F, 0.1621F, 0.1593F, -0.7463F));

		PartDefinition chest11_r7 = chest.addOrReplaceChild("chest11_r7", CubeListBuilder.create().texOffs(124, 47).mirror().addBox(-2.9063F, -0.0261F, -0.3356F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0885F, -5.5954F, 0.2137F, 0.0765F, -0.3147F));

		PartDefinition chest12_r9 = chest.addOrReplaceChild("chest12_r9", CubeListBuilder.create().texOffs(62, 27).mirror().addBox(-15.7493F, -5.159F, -0.3569F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6885F, -3.5954F, 0.0337F, 0.1715F, -1.2892F));

		PartDefinition chest10_r7 = chest.addOrReplaceChild("chest10_r7", CubeListBuilder.create().texOffs(124, 45).mirror().addBox(-2.9063F, -0.0261F, -0.3356F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6885F, -3.5954F, 0.1628F, 0.0638F, -0.2834F));

		PartDefinition chest11_r8 = chest.addOrReplaceChild("chest11_r8", CubeListBuilder.create().texOffs(115, 14).mirror().addBox(-7.623F, -1.2519F, -0.3356F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6885F, -3.5954F, 0.1209F, 0.1264F, -0.7172F));

		PartDefinition chest9_r6 = chest.addOrReplaceChild("chest9_r6", CubeListBuilder.create().texOffs(124, 24).mirror().addBox(-2.9063F, -0.0261F, -0.3356F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1885F, -1.6954F, 0.1289F, 0.0551F, -0.2505F));

		PartDefinition chest10_r8 = chest.addOrReplaceChild("chest10_r8", CubeListBuilder.create().texOffs(55, 114).mirror().addBox(-7.623F, -1.2519F, -0.3356F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1885F, -1.6954F, 0.0937F, 0.1044F, -0.6855F));

		PartDefinition chest11_r9 = chest.addOrReplaceChild("chest11_r9", CubeListBuilder.create().texOffs(62, 25).mirror().addBox(-15.7493F, -5.159F, -0.3569F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1885F, -1.6954F, 0.0227F, 0.1383F, -1.256F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(120, 36).mirror().addBox(-0.2691F, -1.516F, -0.3601F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.25F, -4.5125F, -2.7874F, -0.6199F, 0.8432F, 0.0439F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(37, 117).mirror().addBox(0.2713F, -1.7196F, 0.366F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -5.4125F, -6.5374F, -0.6515F, 0.8751F, -0.1284F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(120, 36).addBox(-1.7309F, -1.516F, -0.3601F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.25F, -4.5125F, -2.7874F, -0.6199F, -0.8432F, -0.0439F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(37, 117).addBox(-2.2713F, -1.7196F, 0.366F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(5.0F, -5.4125F, -6.5374F, -0.6515F, -0.8751F, 0.1284F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(123, 66).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2182F, -1.7834F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(89, 122).addBox(-0.5F, -5.1F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4586F, -3.7101F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 121).addBox(-0.5F, -5.0F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9477F, -5.652F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(7, 124).addBox(-0.5F, -4.3F, -3.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 49).addBox(-1.0F, -0.3F, -6.6F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(32, 84).addBox(-0.5F, -3.3F, -5.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3918F, -4.2268F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest13_r9 = chest.addOrReplaceChild("chest13_r9", CubeListBuilder.create().texOffs(115, 60).addBox(2.623F, -1.2519F, -0.3357F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4885F, -9.5954F, 0.2885F, -0.2562F, 0.8947F));

		PartDefinition chest12_r10 = chest.addOrReplaceChild("chest12_r10", CubeListBuilder.create().texOffs(124, 64).addBox(-0.0937F, -0.0261F, -0.3357F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4885F, -9.5954F, 0.367F, -0.1136F, 0.4747F));

		PartDefinition chest14_r6 = chest.addOrReplaceChild("chest14_r6", CubeListBuilder.create().texOffs(115, 51).addBox(5.7493F, -5.159F, -0.3569F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4885F, -9.5954F, 0.1031F, -0.37F, 1.48F));

		PartDefinition chest11_r10 = chest.addOrReplaceChild("chest11_r10", CubeListBuilder.create().texOffs(124, 62).addBox(-0.0937F, -0.0261F, -0.3356F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4885F, -7.5954F, 0.2647F, -0.0891F, 0.3803F));

		PartDefinition chest12_r11 = chest.addOrReplaceChild("chest12_r11", CubeListBuilder.create().texOffs(115, 18).addBox(2.623F, -1.2519F, -0.3356F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4885F, -7.5954F, 0.2036F, -0.192F, 0.8088F));

		PartDefinition chest13_r10 = chest.addOrReplaceChild("chest13_r10", CubeListBuilder.create().texOffs(83, 66).addBox(5.7493F, -5.159F, -0.3569F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4885F, -7.5954F, 0.0674F, -0.2709F, 1.3866F));

		PartDefinition chest10_r9 = chest.addOrReplaceChild("chest10_r9", CubeListBuilder.create().texOffs(124, 47).addBox(-0.0937F, -0.0261F, -0.3356F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0885F, -5.5954F, 0.2137F, -0.0765F, 0.3147F));

		PartDefinition chest11_r11 = chest.addOrReplaceChild("chest11_r11", CubeListBuilder.create().texOffs(115, 16).addBox(2.623F, -1.2519F, -0.3356F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0885F, -5.5954F, 0.1621F, -0.1593F, 0.7463F));

		PartDefinition chest12_r12 = chest.addOrReplaceChild("chest12_r12", CubeListBuilder.create().texOffs(82, 78).addBox(5.7493F, -5.159F, -0.3569F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0885F, -5.5954F, 0.0504F, -0.2212F, 1.3209F));

		PartDefinition chest10_r10 = chest.addOrReplaceChild("chest10_r10", CubeListBuilder.create().texOffs(115, 14).addBox(2.623F, -1.2519F, -0.3356F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6885F, -3.5954F, 0.1209F, -0.1264F, 0.7172F));

		PartDefinition chest9_r7 = chest.addOrReplaceChild("chest9_r7", CubeListBuilder.create().texOffs(124, 45).addBox(-0.0937F, -0.0261F, -0.3356F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6885F, -3.5954F, 0.1628F, -0.0638F, 0.2834F));

		PartDefinition chest11_r12 = chest.addOrReplaceChild("chest11_r12", CubeListBuilder.create().texOffs(62, 27).addBox(5.7493F, -5.159F, -0.3569F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6885F, -3.5954F, 0.0337F, -0.1715F, 1.2892F));

		PartDefinition chest8_r4 = chest.addOrReplaceChild("chest8_r4", CubeListBuilder.create().texOffs(124, 24).addBox(-0.0937F, -0.0261F, -0.3356F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1885F, -1.6954F, 0.1289F, -0.0551F, 0.2505F));

		PartDefinition chest9_r8 = chest.addOrReplaceChild("chest9_r8", CubeListBuilder.create().texOffs(55, 114).addBox(2.623F, -1.2519F, -0.3356F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1885F, -1.6954F, 0.0937F, -0.1044F, 0.6855F));

		PartDefinition chest10_r11 = chest.addOrReplaceChild("chest10_r11", CubeListBuilder.create().texOffs(62, 25).addBox(5.7493F, -5.159F, -0.3569F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1885F, -1.6954F, 0.0227F, -0.1383F, 1.256F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(77, 98).addBox(0.0F, -0.1F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0165F, -0.213F, -5.1521F, 1.1084F, -0.1119F, -0.3726F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 97).addBox(0.0F, 0.0F, -5.2F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5678F, -2.8024F, -1.7062F, 0.7264F, -0.1172F, -0.3295F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(96, 93).addBox(0.0F, -3.2F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5316F, 4.1494F, -4.1352F, 1.0034F, 0.0057F, -0.0433F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -3.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.36F, 7.48F, -9.6754F, 2.2448F, 0.7548F, 0.2258F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(85, 37).addBox(-4.2408F, 9.5722F, -11.6294F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4083F, -4.5803F, -21.1475F, 1.6053F, 0.7428F, 0.2304F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(19, 122).addBox(-0.3942F, 0.2825F, -1.8289F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9303F, 4.0367F, -11.3563F, -2.1087F, -0.5348F, -0.2671F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(109, 93).addBox(-1.4303F, 0.1873F, -1.0976F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9303F, 4.0367F, -11.3563F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(30, 98).addBox(-2.4632F, -1.0009F, -0.0864F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(96, 86).addBox(-1.5368F, -0.9991F, -4.4136F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5773F, 11.3047F, -8.0024F, -2.6556F, -0.2106F, 3.0843F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(112, 99).addBox(0.1205F, 0.2548F, -0.2199F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8958F, 12.0611F, -3.7997F, -0.6579F, 0.9368F, -0.1821F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(102, 14).addBox(-1.1671F, 2.6677F, 2.5077F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8958F, 12.0611F, -3.7997F, -0.4306F, 1.1492F, -0.767F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(112, 78).addBox(0.1205F, 0.2548F, -0.2199F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8958F, 12.0611F, -3.7997F, -0.0794F, 1.1435F, 0.1919F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(33, 112).addBox(-1.1671F, 2.6677F, 2.5077F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8958F, 12.0611F, -3.7997F, 0.1315F, 1.485F, -0.3458F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(120, 85).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5958F, 12.4611F, -3.7997F, -2.0791F, 1.3851F, -2.7917F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(112, 71).addBox(-1.0162F, -0.1324F, -0.0288F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 12.3997F, -4.9676F, -0.2319F, 1.3865F, -0.1965F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.8412F, 9.3692F, -8.4198F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftArm.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(38, 80).addBox(-1.0F, -2.0532F, -0.503F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6412F, 3.9952F, 0.0881F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftArm.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(24, 104).addBox(-0.9078F, 0.6633F, 1.2414F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9149F, 2.7702F, -3.2593F, 1.1346F, -0.2085F, 0.2274F));

		PartDefinition cube_r101 = leftArm.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(32, 89).addBox(-0.5F, -0.6F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5999F, 5.0549F, -1.6085F, 1.5796F, -0.2085F, 0.2274F));

		PartDefinition cube_r102 = leftArm.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(76, 81).addBox(-1.0F, -1.9F, 1.9F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6412F, 11.606F, -0.5234F, 1.5184F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 10.0292F, -0.9229F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftArm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(115, 62).addBox(-1.4F, -1.6333F, 1.8991F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(15, 93).addBox(-0.9F, -1.6333F, -3.9009F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.12F))
				.texOffs(21, 63).addBox(-1.6F, -0.1333F, -4.0008F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0333F, 4.0296F, -1.2954F, 1.5708F, 1.4835F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 8.0381F, -1.0502F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftArm3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(99, 115).addBox(-0.7F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.2918F, 1.8175F, 0.7474F, 1.5708F, 0.0F, 0.6545F));

		PartDefinition cube_r105 = leftArm3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(35, 105).addBox(-3.9041F, -18.3838F, -86.8862F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 63).addBox(-7.4041F, -19.3838F, -86.8862F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.577F, -82.8476F, 18.6202F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftArm3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(105, 109).addBox(-8.4041F, -17.3838F, -86.8862F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.077F, -82.8476F, 17.6202F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8412F, 9.3692F, -8.4198F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightArm.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(57, 81).addBox(-2.0F, -2.0532F, -0.503F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6412F, 3.9952F, 0.0881F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightArm.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(46, 105).addBox(-0.0922F, 0.6633F, 1.2414F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9149F, 2.7702F, -3.2593F, 1.1346F, 0.2085F, -0.2274F));

		PartDefinition cube_r109 = rightArm.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(47, 90).addBox(-0.5F, -0.6F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5999F, 5.0549F, -1.6085F, 1.5796F, 0.2085F, -0.2274F));

		PartDefinition cube_r110 = rightArm.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(82, 69).addBox(-2.0F, -1.9F, 1.9F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6412F, 11.606F, -0.5234F, 1.5184F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 10.0292F, -0.9229F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightArm2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(117, 10).addBox(-0.6F, -1.6333F, 1.8991F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(62, 94).addBox(-0.1F, -1.6333F, -3.9009F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.12F))
				.texOffs(42, 69).addBox(-0.4F, -0.1333F, -4.0008F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, 4.0296F, -1.2954F, 1.5708F, -1.4835F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 8.0381F, -1.0502F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightArm3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(108, 115).addBox(-0.3F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2918F, 1.8175F, 0.7474F, 1.5708F, 0.0F, -0.6545F));

		PartDefinition cube_r113 = rightArm3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 106).addBox(2.9041F, -18.3838F, -86.8862F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(95, 80).addBox(3.4041F, -19.3838F, -86.8862F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.577F, -82.8476F, 18.6202F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightArm3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(22, 111).addBox(7.4041F, -17.3838F, -86.8862F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.077F, -82.8476F, 17.6202F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(60, 57).addBox(-1.0F, -1.0F, -8.8F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.883F, -10.6892F, -0.523F, 0.6368F, -0.1191F));

		PartDefinition cube_r115 = neck1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(127, 5).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2235F, -1.3491F, -1.0765F, 1.5693F, -0.0278F, 0.606F));

		PartDefinition cube_r116 = neck1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(133, 19).mirror().addBox(-1.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0656F, -1.6766F, 1.5106F, -0.0354F, -0.5313F));

		PartDefinition cube_r117 = neck1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(20, 131).mirror().addBox(-1.1909F, -1.0245F, 0.3251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0656F, -1.6766F, 1.5771F, -0.0754F, -1.1903F));

		PartDefinition cube_r118 = neck1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(125, 107).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5352F, 0.0627F, -2.3012F, 1.501F, 0.0006F, 0.0087F));

		PartDefinition cube_r119 = neck1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(133, 22).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(129, 89).mirror().addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2417F, 1.5035F, -1.9264F, 0.7997F, -0.1375F, -0.0392F));

		PartDefinition cube_r120 = neck1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(104, 125).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5352F, 0.0627F, -7.6012F, 1.501F, 0.0006F, 0.0087F));

		PartDefinition cube_r121 = neck1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(15, 131).mirror().addBox(-1.1909F, -1.0245F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0656F, -6.9766F, 1.5771F, -0.0754F, -1.1903F));

		PartDefinition cube_r122 = neck1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(10, 133).mirror().addBox(-1.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0656F, -6.9766F, 1.5106F, -0.0354F, -0.5313F));

		PartDefinition cube_r123 = neck1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 122).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2235F, -1.3491F, -6.3765F, 1.5693F, -0.0278F, 0.606F));

		PartDefinition cube_r124 = neck1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 123).mirror().addBox(-1.8629F, -1.9156F, -2.4152F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.1214F, -0.447F, -2.3785F, 1.6026F, -0.1375F, -0.0392F));

		PartDefinition cube_r125 = neck1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(99, 128).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.7022F, 2.2819F, -3.6812F, 1.559F, -0.1375F, -0.0392F));

		PartDefinition cube_r126 = neck1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(99, 120).mirror().addBox(-1.8629F, -1.0156F, -1.6152F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1214F, -0.447F, -7.6785F, 1.2972F, -0.1375F, -0.0392F));

		PartDefinition cube_r127 = neck1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(99, 128).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.7022F, 2.2819F, -3.6812F, 1.559F, 0.1375F, 0.0392F));

		PartDefinition cube_r128 = neck1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(25, 133).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(133, 22).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(129, 89).addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2417F, 1.5035F, -1.9264F, 0.7997F, 0.1375F, 0.0392F));

		PartDefinition cube_r129 = neck1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(78, 123).addBox(0.8629F, -1.9156F, -2.4152F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.1214F, -0.447F, -2.3785F, 1.6026F, 0.1375F, 0.0392F));

		PartDefinition cube_r130 = neck1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(20, 131).addBox(0.1909F, -1.0245F, 0.3251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -1.6766F, 1.5771F, 0.0754F, 1.1903F));

		PartDefinition cube_r131 = neck1.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(125, 107).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5352F, 0.0627F, -2.3012F, 1.501F, -0.0006F, -0.0087F));

		PartDefinition cube_r132 = neck1.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(133, 19).addBox(0.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -1.6766F, 1.5106F, 0.0354F, 0.5313F));

		PartDefinition cube_r133 = neck1.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(127, 5).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2235F, -1.3491F, -1.0765F, 1.5693F, 0.0278F, -0.606F));

		PartDefinition cube_r134 = neck1.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(47, 129).addBox(-0.5F, -2.1996F, -1.5262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -1.6766F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r135 = neck1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(99, 120).addBox(0.8629F, -1.0156F, -1.6152F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1214F, -0.447F, -7.6785F, 1.2972F, 0.1375F, 0.0392F));

		PartDefinition cube_r136 = neck1.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(104, 125).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5352F, 0.0627F, -7.6012F, 1.501F, -0.0006F, -0.0087F));

		PartDefinition cube_r137 = neck1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(15, 131).addBox(0.1909F, -1.0245F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -6.9766F, 1.5771F, 0.0754F, 1.1903F));

		PartDefinition cube_r138 = neck1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(10, 133).addBox(0.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -6.9766F, 1.5106F, 0.0354F, 0.5313F));

		PartDefinition cube_r139 = neck1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(48, 122).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2235F, -1.3491F, -6.3765F, 1.5693F, 0.0278F, -0.606F));

		PartDefinition cube_r140 = neck1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(22, 125).addBox(0.0F, -2.9996F, -0.5262F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -6.9766F, -0.096F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6924F, -8.5348F, 0.0067F, 0.4444F, 0.2003F));

		PartDefinition cube_r141 = neck2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(33, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2019F, -12.1278F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r142 = neck2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(17, 125).addBox(0.0F, -2.9997F, -0.5262F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9656F, -4.7766F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r143 = neck2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(43, 122).mirror().addBox(-0.8805F, -1.933F, -0.3447F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9656F, -4.7766F, 1.4821F, 0.0593F, 0.6096F));

		PartDefinition cube_r144 = neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(133, 9).mirror().addBox(-1.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9656F, -4.7766F, 1.5106F, -0.0354F, -0.5313F));

		PartDefinition cube_r145 = neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(128, 69).mirror().addBox(-1.7208F, -1.0057F, -1.2647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9656F, -4.7766F, 1.5019F, -0.0115F, -0.1654F));

		PartDefinition cube_r146 = neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(121, 130).mirror().addBox(-1.1909F, -1.0245F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9656F, -4.7766F, 1.5771F, -0.0754F, -1.1903F));

		PartDefinition cube_r147 = neck2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(128, 66).mirror().addBox(-1.7208F, -1.0057F, -1.2647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8656F, -10.1766F, 1.5019F, -0.0115F, -0.1654F));

		PartDefinition cube_r148 = neck2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(5, 133).mirror().addBox(-1.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8656F, -10.1766F, 1.5106F, -0.0354F, -0.5313F));

		PartDefinition cube_r149 = neck2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(130, 120).mirror().addBox(-1.1909F, -1.0245F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8656F, -10.1766F, 1.5771F, -0.0754F, -1.1903F));

		PartDefinition cube_r150 = neck2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(38, 122).mirror().addBox(-0.8805F, -1.933F, -0.3447F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8656F, -10.1766F, 1.4821F, 0.0593F, 0.6096F));

		PartDefinition cube_r151 = neck2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(89, 109).mirror().addBox(-1.8629F, -1.0156F, -0.6152F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1214F, -0.347F, -5.4785F, 1.2972F, -0.1375F, -0.0392F));

		PartDefinition cube_r152 = neck2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(84, 106).mirror().addBox(-1.8629F, -1.0156F, -0.6152F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1214F, -1.247F, -10.8785F, 1.2972F, -0.1375F, -0.0392F));

		PartDefinition cube_r153 = neck2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(43, 122).addBox(-0.1195F, -1.933F, -0.3447F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9656F, -4.7766F, 1.4821F, -0.0593F, -0.6096F));

		PartDefinition cube_r154 = neck2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(133, 9).addBox(0.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.9656F, -4.7766F, 1.5106F, 0.0354F, 0.5313F));

		PartDefinition cube_r155 = neck2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(121, 130).addBox(0.1909F, -1.0245F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -0.9656F, -4.7766F, 1.5771F, 0.0754F, 1.1903F));

		PartDefinition cube_r156 = neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(89, 109).addBox(0.8629F, -1.0156F, -0.6152F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1214F, -0.347F, -5.4785F, 1.2972F, 0.1375F, 0.0392F));

		PartDefinition cube_r157 = neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(128, 69).addBox(-0.2792F, -1.0057F, -1.2647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.9656F, -4.7766F, 1.5019F, 0.0115F, 0.1654F));

		PartDefinition cube_r158 = neck2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(64, 119).addBox(0.0F, -2.2996F, -0.8262F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8656F, -10.1766F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r159 = neck2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(38, 122).addBox(-0.1195F, -1.933F, -0.3447F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8656F, -10.1766F, 1.4821F, -0.0593F, -0.6096F));

		PartDefinition cube_r160 = neck2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(5, 133).addBox(0.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.8656F, -10.1766F, 1.5106F, 0.0354F, 0.5313F));

		PartDefinition cube_r161 = neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(128, 66).addBox(-0.2792F, -1.0057F, -1.2647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.8656F, -10.1766F, 1.5019F, 0.0115F, 0.1654F));

		PartDefinition cube_r162 = neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(130, 120).addBox(0.1909F, -1.0245F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -1.8656F, -10.1766F, 1.5771F, 0.0754F, 1.1903F));

		PartDefinition cube_r163 = neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(84, 106).addBox(0.8629F, -1.0156F, -0.6152F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1214F, -1.247F, -10.8785F, 1.2972F, 0.1375F, 0.0392F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -12.0F, 0.1646F, 0.6364F, 0.2725F));

		PartDefinition cube_r164 = neck3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(60, 44).addBox(0.0F, -0.05F, 0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.15F, -10.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r165 = neck3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(117, 113).addBox(0.0F, -2.2996F, -1.4262F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -3.5766F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r166 = neck3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(128, 58).mirror().addBox(-1.7208F, -1.0057F, -1.2647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0656F, -3.5766F, 1.5019F, -0.0115F, -0.1654F));

		PartDefinition cube_r167 = neck3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(33, 122).mirror().addBox(-0.8805F, -1.933F, -0.3447F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0656F, -3.5766F, 1.4821F, 0.0593F, 0.6096F));

		PartDefinition cube_r168 = neck3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 133).mirror().addBox(-1.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0656F, -3.5766F, 1.5106F, -0.0354F, -0.5313F));

		PartDefinition cube_r169 = neck3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(130, 117).mirror().addBox(-1.1909F, -1.0245F, 0.3251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0656F, -3.5766F, 1.5771F, -0.0754F, -1.1903F));

		PartDefinition cube_r170 = neck3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(53, 128).mirror().addBox(-1.7208F, -1.0057F, -1.2647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9656F, -8.7766F, 1.5019F, -0.0115F, -0.1654F));

		PartDefinition cube_r171 = neck3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(131, 132).mirror().addBox(-1.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9656F, -8.7766F, 1.5106F, -0.0354F, -0.5313F));

		PartDefinition cube_r172 = neck3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(116, 130).mirror().addBox(-1.1909F, -1.0245F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9656F, -8.7766F, 1.5771F, -0.0754F, -1.1903F));

		PartDefinition cube_r173 = neck3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(28, 122).mirror().addBox(-0.8805F, -1.933F, -0.3447F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9656F, -8.7766F, 1.4821F, 0.0593F, 0.6096F));

		PartDefinition cube_r174 = neck3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(79, 111).mirror().addBox(-1.8629F, -0.7156F, -0.6152F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1214F, -0.447F, -4.2784F, 1.2972F, -0.1375F, -0.0392F));

		PartDefinition cube_r175 = neck3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(5, 113).mirror().addBox(-1.8629F, -0.7156F, -0.6152F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1214F, -1.347F, -9.4785F, 1.3321F, -0.1375F, -0.0392F));

		PartDefinition cube_r176 = neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(33, 122).addBox(-0.1195F, -1.933F, -0.3447F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -3.5766F, 1.4821F, -0.0593F, -0.6096F));

		PartDefinition cube_r177 = neck3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 133).addBox(0.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -3.5766F, 1.5106F, 0.0354F, 0.5313F));

		PartDefinition cube_r178 = neck3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(128, 58).addBox(-0.2792F, -1.0057F, -1.2647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -3.5766F, 1.5019F, 0.0115F, 0.1654F));

		PartDefinition cube_r179 = neck3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 111).addBox(0.8629F, -0.7156F, -0.6152F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1214F, -0.447F, -4.2784F, 1.2972F, 0.1375F, 0.0392F));

		PartDefinition cube_r180 = neck3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(130, 117).addBox(0.1909F, -1.0245F, 0.3251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -1.0656F, -3.5766F, 1.5771F, 0.0754F, 1.1903F));

		PartDefinition cube_r181 = neck3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(5, 113).addBox(0.8629F, -0.7156F, -0.6152F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1214F, -1.347F, -9.4785F, 1.3321F, 0.1375F, 0.0392F));

		PartDefinition cube_r182 = neck3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(131, 132).addBox(0.1932F, -1.1127F, -0.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.9656F, -8.7766F, 1.5106F, 0.0354F, 0.5313F));

		PartDefinition cube_r183 = neck3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(53, 128).addBox(-0.2792F, -1.0057F, -1.2647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.9656F, -8.7766F, 1.5019F, 0.0115F, 0.1654F));

		PartDefinition cube_r184 = neck3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(28, 122).addBox(-0.1195F, -1.933F, -0.3447F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9656F, -8.7766F, 1.4821F, -0.0593F, -0.6096F));

		PartDefinition cube_r185 = neck3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(116, 130).addBox(0.1909F, -1.0245F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -1.9656F, -8.7766F, 1.5771F, 0.0754F, 1.1903F));

		PartDefinition cube_r186 = neck3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(124, 113).addBox(0.0F, -1.9997F, -0.3262F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9656F, -8.7766F, -0.096F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.783F, -10.8451F, 0.322F, 0.5279F, 0.3073F));

		PartDefinition cube_r187 = neck4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(100, 54).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.85F, -4.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r188 = neck4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(12, 124).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, -0.2264F, -3.2405F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r189 = neck4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(126, 132).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, -0.2264F, -3.2405F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r190 = neck4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(128, 49).mirror().addBox(-1.0595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, -0.2264F, -3.2405F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r191 = neck4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(130, 102).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, -0.2264F, -3.2405F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r192 = neck4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-1.1961F, -0.8468F, -0.5769F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5591F, 0.0521F, -3.4827F, 1.3501F, -0.1345F, -0.0487F));

		PartDefinition cube_r193 = neck4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 113).addBox(0.1961F, -0.8468F, -0.5769F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5591F, 0.0521F, -3.4827F, 1.3501F, 0.1345F, 0.0487F));

		PartDefinition cube_r194 = neck4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(128, 49).addBox(-0.9405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, -0.2264F, -3.2405F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r195 = neck4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(130, 102).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6054F, -0.2264F, -3.2405F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r196 = neck4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(126, 132).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, -0.2264F, -3.2405F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r197 = neck4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(12, 124).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6054F, -0.2264F, -3.2405F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r198 = neck4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(127, 0).addBox(0.0F, -0.7F, -0.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6156F, -2.8766F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4766F, -4.8099F, 0.3373F, 0.3013F, 0.0885F));

		PartDefinition cube_r199 = neck5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(85, 28).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.75F, -7.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r200 = neck5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 128).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.1236F, -2.7405F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r201 = neck5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(132, 108).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.1236F, -2.7405F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r202 = neck5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(128, 16).mirror().addBox(-1.0595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.1236F, -2.7405F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r203 = neck5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(94, 115).mirror().addBox(-1.1961F, -0.8468F, -0.5769F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5591F, 0.4021F, -2.9827F, 1.385F, -0.1345F, -0.0487F));

		PartDefinition cube_r204 = neck5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(109, 132).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.1236F, -2.7405F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r205 = neck5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(128, 13).mirror().addBox(-1.0595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.1236F, -6.1405F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r206 = neck5.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(104, 132).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.1236F, -6.1405F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r207 = neck5.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(132, 105).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.1236F, -6.1405F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r208 = neck5.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(83, 127).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.1236F, -6.1405F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r209 = neck5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(84, 119).mirror().addBox(-1.1961F, -1.0468F, -0.5769F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, 0.4196F, -6.1852F, 1.4897F, -0.1345F, -0.0487F));

		PartDefinition cube_r210 = neck5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(128, 16).addBox(-0.9405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.1236F, -2.7405F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r211 = neck5.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(71, 119).addBox(0.0F, -0.7F, -1.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2656F, -2.3766F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r212 = neck5.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 128).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6054F, 0.1236F, -2.7405F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r213 = neck5.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(132, 108).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.1236F, -2.7405F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r214 = neck5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(109, 132).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6054F, 0.1236F, -2.7405F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r215 = neck5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(94, 115).addBox(0.1961F, -0.8468F, -0.5769F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5591F, 0.4021F, -2.9827F, 1.385F, 0.1345F, 0.0487F));

		PartDefinition cube_r216 = neck5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(128, 13).addBox(-0.9405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.1236F, -6.1405F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r217 = neck5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(84, 119).addBox(0.1961F, -1.0468F, -0.5769F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5849F, 0.4196F, -6.1852F, 1.4897F, 0.1345F, 0.0487F));

		PartDefinition cube_r218 = neck5.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(104, 132).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6054F, 0.1236F, -6.1405F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r219 = neck5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(132, 105).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.1236F, -6.1405F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r220 = neck5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(65, 126).addBox(0.0F, -0.5F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2656F, -5.7766F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(83, 127).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6054F, 0.1236F, -6.1405F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3011F, -7.0438F, 0.5223F, 0.2333F, 0.0092F));

		PartDefinition cube_r222 = neck6.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(88, 129).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -2.0405F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r223 = neck6.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(126, 32).mirror().addBox(-1.0595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -2.0405F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r224 = neck6.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(81, 132).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -2.0405F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r225 = neck6.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(132, 80).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -2.0405F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r226 = neck6.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(126, 10).mirror().addBox(-1.0595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -4.4405F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r227 = neck6.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(129, 85).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -4.4405F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r228 = neck6.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(132, 55).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -4.4405F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r229 = neck6.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(132, 52).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -4.4405F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r230 = neck6.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(123, 73).mirror().addBox(-1.1961F, -0.8468F, -0.8769F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -2.0405F, 1.4199F, -0.1345F, -0.0487F));

		PartDefinition cube_r231 = neck6.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(128, 72).mirror().addBox(-1.1961F, -0.8468F, -0.8769F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.3236F, -4.4405F, 1.4199F, -0.1345F, -0.0487F));

		PartDefinition cube_r232 = neck6.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(126, 32).addBox(-0.9405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -2.0405F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r233 = neck6.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(42, 129).addBox(0.0F, -0.6865F, -1.1987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8192F, -1.56F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r234 = neck6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(88, 129).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -2.0405F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r235 = neck6.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(132, 80).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -2.0405F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r236 = neck6.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(81, 132).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -2.0405F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r237 = neck6.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(123, 73).addBox(0.1961F, -0.8468F, -0.8769F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -2.0405F, 1.4199F, 0.1345F, 0.0487F));

		PartDefinition cube_r238 = neck6.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(133, 45).addBox(0.0F, -0.6865F, -0.9988F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8192F, -3.96F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(129, 85).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -4.4405F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r240 = neck6.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(132, 52).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -4.4405F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r241 = neck6.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(132, 55).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -4.4405F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r242 = neck6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(128, 72).addBox(0.1961F, -0.8468F, -0.8769F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -4.4405F, 1.4199F, 0.1345F, 0.0487F));

		PartDefinition cube_r243 = neck6.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(126, 10).addBox(-0.9405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6054F, 0.3236F, -4.4405F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r244 = neck6.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(81, 90).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -5.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0276F, -5.8885F, 0.2492F, 0.1441F, -0.0157F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(128, 124).mirror().addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7677F, 1.3916F, -3.93F, 0.3871F, -0.1893F, -0.1104F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(128, 124).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7677F, 1.3916F, -3.93F, 0.3871F, 0.1893F, 0.1104F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(56, 31).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8438F, -4.7761F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(125, 82).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.392F, -4.4776F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(111, 125).addBox(-0.5F, -0.7F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -1.5359F, -0.1212F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(10, 121).addBox(-0.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, -1.623F, -1.1173F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(120, 93).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.5881F, -2.1167F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(112, 66).addBox(-1.5F, -1.4F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5931F, -1.5403F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(115, 32).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.623F, -1.1173F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(129, 111).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.2122F, -3.1808F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(32, 129).mirror().addBox(-1.0F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(32, 129).addBox(0.4F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.2F, 0.0423F, -2.7827F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(27, 129).mirror().addBox(-1.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(27, 129).addBox(0.4F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, -0.1775F, -2.8237F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(71, 102).mirror().addBox(-1.5F, -1.9F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(71, 102).addBox(0.5F, -1.9F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.3372F, 0.4392F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(128, 128).mirror().addBox(-1.5F, -1.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 128).addBox(0.5F, -1.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2218F, 0.0793F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(104, 129).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.0245F, -3.534F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(129, 93).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(128, 77).addBox(-0.5F, -1.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.0345F, -4.5239F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(129, 26).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.4588F, -4.0997F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(129, 114).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.3627F, -4.3875F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(64, 116).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5795F, -3.9214F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(44, 112).addBox(-0.5F, -1.0F, -0.05F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.7395F, -3.8457F, 0.3752F, 0.0F, 0.0F));

		PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, -0.7F, -1.45F));

		PartDefinition cube_r265 = eyes.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(57, 131).mirror().addBox(-0.52F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(57, 131).addBox(1.72F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.1F, 0.1245F, -0.2956F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r266 = eyes.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(62, 131).mirror().addBox(-0.52F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(130, 96).mirror().addBox(-0.66F, -1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 42).mirror().addBox(-0.53F, -1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(130, 96).addBox(1.86F, -1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 42).addBox(1.73F, -1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F))
				.texOffs(62, 131).addBox(1.72F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.1F, 0.6871F, -0.3547F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r267 = eyes.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(67, 131).mirror().addBox(-0.52F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(67, 131).addBox(1.72F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1F, 0.0654F, -0.8581F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r268 = eyes.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(52, 131).mirror().addBox(-0.52F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false)
				.texOffs(52, 131).addBox(1.72F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-1.1F, -0.2597F, 0.032F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r269 = eyes.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(93, 131).mirror().addBox(-0.52F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(132, 0).mirror().addBox(-0.52F, 0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(132, 0).addBox(1.72F, 0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F))
				.texOffs(93, 131).addBox(1.72F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.1F, -0.7925F, 0.2688F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r270 = eyes.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(123, 101).mirror().addBox(-0.5F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(123, 101).addBox(2.14F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.32F, 0.5794F, 1.3122F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r271 = eyes.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(10, 130).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 130).mirror().addBox(-0.5F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 130).addBox(2.14F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 130).addBox(2.14F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.32F, 0.0772F, 0.915F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r272 = eyes.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(5, 130).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 130).addBox(2.14F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.32F, 0.5794F, 1.3122F, 2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r273 = eyes.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(132, 39).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(132, 39).addBox(1.74F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.12F, 0.8827F, 0.1817F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r274 = eyes.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(132, 6).mirror().addBox(-0.5F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(132, 3).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(132, 6).addBox(1.74F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F))
				.texOffs(132, 3).addBox(1.74F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.12F, 1.207F, 0.8708F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r275 = eyes.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.5F, -0.7F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(0, 124).addBox(2.14F, -0.7F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.32F, 0.5794F, 1.3122F, 1.4661F, 0.0F, 0.0F));

		PartDefinition jaws = head.addOrReplaceChild("jaws", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4799F, 0.0642F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r276 = jaws.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(111, 128).mirror().addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8288F, -4.0953F, 0.6204F, -0.164F, -0.1162F));

		PartDefinition cube_r277 = jaws.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(111, 128).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8288F, -4.0953F, 0.6204F, 0.164F, 0.1162F));

		PartDefinition cube_r278 = jaws.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(27, 61).addBox(0.0F, -1.1094F, -1.9423F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(55, 13).addBox(-0.5F, -0.8594F, -2.1923F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 89).addBox(-0.5F, -0.8594F, -1.2423F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 1.2139F, -2.1548F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r279 = jaws.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(24, 101).addBox(0.0F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.5F, 0.2965F, -1.0147F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r280 = jaws.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(130, 99).addBox(0.5F, -0.05F, 0.092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F))
				.texOffs(80, 10).mirror().addBox(-1.5F, -0.05F, 0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(80, 10).addBox(0.5F, -0.05F, 0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.3177F, -2.242F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r281 = jaws.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(46, 117).mirror().addBox(-1.5F, -4.2F, -1.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(46, 117).addBox(0.5F, -4.2F, -1.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.15F, -0.15F, 0.0873F, 0.0F, 0.0F));

		PartDefinition throat = jaws.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2922F, -1.9058F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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