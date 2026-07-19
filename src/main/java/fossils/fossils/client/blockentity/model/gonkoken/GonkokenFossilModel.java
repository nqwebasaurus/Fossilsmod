package fossils.fossils.client.blockentity.model.gonkoken;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GonkokenFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
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
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone;
	private final ModelPart bone3;
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

	public GonkokenFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
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
		this.neck = this.neck6.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.6998F, 0.8126F, -0.1377F, 0.2175F, 0.0174F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-3.0F, 2.6F, 1.8F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 34).addBox(1.0F, 2.6F, 1.8F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0114F, -2.0615F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(123, 19).addBox(0.0F, -4.2F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0205F, 5.6454F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(88, 122).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.298F, 2.6607F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(83, 122).addBox(0.0F, -4.425F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7156F, -0.3101F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -0.1F, 5.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(67, 51).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(84, 51).addBox(1.0F, 1.0F, -6.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(84, 51).mirror().addBox(-3.0F, 1.0F, -6.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8146F, -0.2962F, 0.0872F, -0.1309F, 0.0011F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 115).addBox(0.0F, -4.8F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(123, 27).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -1.9554F, -6.9243F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.9847F, -6.0835F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(119, 119).addBox(0.0F, -4.9647F, -0.0963F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.9554F, -2.8243F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 119).addBox(0.0F, -4.8576F, -1.0985F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.9554F, -4.8243F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(143, 18).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -5.1303F, 0.0229F, -0.0763F, -0.559F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(102, 140).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -5.1303F, 0.0668F, -0.1221F, -0.9951F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(143, 20).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -1.9303F, 0.1116F, -0.0205F, -0.5633F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(110, 54).mirror().addBox(-2.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -1.9303F, 0.1237F, -0.0341F, -0.9996F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(110, 54).addBox(1.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -1.9303F, 0.1237F, 0.0341F, 0.9996F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(143, 20).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -1.9303F, 0.1116F, 0.0205F, 0.5633F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(102, 140).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -5.1303F, 0.0668F, 0.1221F, 0.9951F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(143, 18).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -5.1303F, 0.0229F, 0.0763F, 0.559F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.9956F, -6.9303F, 0.0612F, -0.0432F, -0.0065F));

		PartDefinition cube_r18 = body3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(123, 60).addBox(0.0F, -5.0791F, 0.0071F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4615F, -2.0009F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(10, 122).addBox(0.0F, -4.7437F, -0.0022F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4615F, -5.0009F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(73, 0).addBox(-1.0F, -0.1094F, -0.0631F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6401F, -5.8941F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(84, 57).mirror().addBox(-9.8936F, -2.4262F, -0.2666F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -4.1F, 0.1508F, 0.105F, -1.4289F));

		PartDefinition cube_r22 = body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(98, 15).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -4.1F, 0.1808F, 0.0318F, -0.9976F));

		PartDefinition cube_r23 = body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -4.1F, 0.1912F, 0.0151F, -0.5615F));

		PartDefinition cube_r24 = body3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(140, 109).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.0F, 0.0229F, -0.0763F, -0.559F));

		PartDefinition cube_r25 = body3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(46, 99).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.0F, 0.0668F, -0.1221F, -0.9951F));

		PartDefinition cube_r26 = body3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(140, 111).mirror().addBox(-4.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.0F, 0.1121F, -0.0825F, -1.432F));

		PartDefinition cube_r27 = body3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(140, 111).addBox(2.8937F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, 0.1121F, 0.0825F, 1.432F));

		PartDefinition cube_r28 = body3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(46, 99).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, 0.0668F, 0.1221F, 0.9951F));

		PartDefinition cube_r29 = body3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(140, 109).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, 0.0229F, 0.0763F, 0.559F));

		PartDefinition cube_r30 = body3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(73, 9).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.1912F, -0.0151F, 0.5615F));

		PartDefinition cube_r31 = body3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(98, 15).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.1808F, -0.0318F, 0.9976F));

		PartDefinition cube_r32 = body3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(84, 57).addBox(2.8937F, -2.4262F, -0.2666F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.1508F, -0.105F, 1.4289F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.4275F, -5.8865F, -0.3509F, -0.1278F, 0.0285F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(30, 124).addBox(0.0F, -4.3855F, 0.0093F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0671F, -2.0483F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(25, 124).addBox(0.0F, -3.9022F, -0.104F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.5896F, -4.501F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(140, 123).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.5394F, 0.1789F, -0.453F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(31, 12).mirror().addBox(-15.8937F, -2.4262F, -0.2666F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.2547F, 0.4749F, -1.3244F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(115, 60).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.4315F, 0.3255F, -0.878F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(110, 94).mirror().addBox(-1.012F, 0.9573F, 3.9057F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1039F, 20.0228F, -1.7719F, 1.0525F, -0.8921F, -0.6029F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(110, 49).mirror().addBox(-1.012F, -0.2797F, 0.013F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1039F, 20.0228F, -1.7719F, 0.7384F, -0.8921F, -0.6029F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(112, 21).mirror().addBox(-0.6443F, 0.9006F, 3.6569F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9039F, 19.7228F, -1.0719F, 0.6698F, -0.9049F, -0.0528F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.6443F, -0.2567F, -1.2411F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9039F, 19.7228F, -1.0719F, 0.3557F, -0.9049F, -0.0528F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(13, 91).mirror().addBox(-0.7939F, -0.101F, -0.8011F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3039F, 19.6228F, -0.8719F, 0.4514F, -0.8052F, -0.1F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(91, 59).mirror().addBox(-0.7939F, 1.1847F, 4.0272F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3039F, 19.6228F, -0.8719F, 0.7656F, -0.8052F, -0.1F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(112, 67).mirror().addBox(-0.2779F, 0.9936F, 3.3279F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5539F, 20.2228F, -2.3469F, 1.3113F, -0.8164F, -0.9314F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(76, 68).mirror().addBox(-0.2779F, -0.0666F, -0.5253F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5539F, 20.2228F, -2.3469F, 0.9972F, -0.8164F, -0.9314F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(140, 12).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.3569F, 0.2717F, -0.9351F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(60, 11).mirror().addBox(-13.8936F, -2.4262F, -0.2666F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.2092F, 0.3957F, -1.3786F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(140, 125).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.4509F, 0.1596F, -0.503F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(140, 125).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.4509F, -0.1596F, 0.503F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(60, 11).addBox(2.8937F, -2.4262F, -0.2666F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.2092F, -0.3957F, 1.3786F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(140, 12).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.3569F, -0.2717F, 0.9351F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(76, 68).addBox(-0.7221F, -0.0666F, -0.5253F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5539F, 20.2228F, -2.3469F, 0.9972F, 0.8164F, 0.9314F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(112, 67).addBox(-0.7221F, 0.9936F, 3.3279F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5539F, 20.2228F, -2.3469F, 1.3113F, 0.8164F, 0.9314F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(91, 59).addBox(-0.2061F, 1.1847F, 4.0272F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3039F, 19.6228F, -0.8719F, 0.7656F, 0.8052F, 0.1F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(13, 91).addBox(-0.2061F, -0.101F, -0.8011F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3039F, 19.6228F, -0.8719F, 0.4514F, 0.8052F, 0.1F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(90, 0).addBox(-0.3557F, -0.2567F, -1.2411F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9039F, 19.7228F, -1.0719F, 0.3557F, 0.9049F, 0.0528F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(112, 21).addBox(-0.3557F, 0.9006F, 3.6569F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9039F, 19.7228F, -1.0719F, 0.6698F, 0.9049F, 0.0528F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(110, 49).addBox(0.0121F, -0.2797F, 0.013F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1039F, 20.0228F, -1.7719F, 0.7384F, 0.8921F, 0.6029F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(110, 94).addBox(0.0121F, 0.9573F, 3.9057F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1039F, 20.0228F, -1.7719F, 1.0525F, 0.8921F, 0.6029F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(65, 118).addBox(-3.4039F, 0.4172F, 4.6895F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9039F, 18.9228F, -8.8719F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(115, 60).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.4315F, -0.3255F, 0.878F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 73).addBox(-1.0F, -0.0448F, -0.0381F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6612F, -4.6119F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(31, 12).addBox(2.8937F, -2.4262F, -0.2666F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.2547F, -0.4749F, 1.3244F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(140, 123).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.5394F, -0.1789F, 0.453F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 79).addBox(-3.9039F, -0.9454F, -0.1346F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9039F, 18.9228F, -8.8719F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 6.2418F, -2.3653F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(55, 93).addBox(3.5837F, -1.1122F, -5.8426F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.3146F, -4.0438F, 1.5077F, 0.144F, 1.1561F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(132, 41).addBox(-0.5F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4329F, -2.7771F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(147, 107).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.5886F, -3.59F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(147, 96).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 11.6945F, -3.754F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(88, 147).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.825F, -4.7454F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(80, 139).addBox(-0.5F, 0.2F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 9.356F, -2.5582F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(143, 49).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 9.356F, -2.5582F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(124, 119).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 7.3452F, -4.6479F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(107, 126).addBox(-0.5F, 0.7302F, 0.8787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(98, 129).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7585F, -2.3894F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(40, 129).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.5926F, -3.1869F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(76, 114).addBox(-0.5F, -1.3F, -2.125F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3291F, -1.8882F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(110, 114).addBox(-0.5F, -2.8901F, -0.685F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(147, 85).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0272F, 2.455F, -0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(143, 45).addBox(-0.5F, -2.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.2806F, 3.5282F, 0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(90, 95).addBox(-0.5F, -1.575F, -1.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.8069F, 0.5519F, 0.9032F, 0.0F, 0.0F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4521F, -0.3362F, 0.9599F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 6.2418F, -2.3653F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 93).mirror().addBox(-4.5837F, -1.1122F, -5.8426F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.3146F, -4.0438F, 1.5077F, -0.144F, -1.1561F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(132, 41).mirror().addBox(-0.5F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.4329F, -2.7771F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(147, 107).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.5886F, -3.59F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(147, 96).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.6945F, -3.754F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(88, 147).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.825F, -4.7454F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(80, 139).mirror().addBox(-0.5F, 0.2F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.356F, -2.5582F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(143, 49).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.356F, -2.5582F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(124, 119).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.3452F, -4.6479F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(107, 126).mirror().addBox(-0.5F, 0.7302F, 0.8787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.005F, -5.5807F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(98, 129).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7585F, -2.3894F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r93 = bone4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(40, 129).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5926F, -3.1869F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(76, 114).mirror().addBox(-0.5F, -1.3F, -2.125F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.3291F, -1.8882F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r95 = bone4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(110, 114).mirror().addBox(-0.5F, -2.8901F, -0.685F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.705F, -1.1807F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(147, 85).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0272F, 2.455F, -0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(143, 45).mirror().addBox(-0.5F, -2.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2806F, 3.5282F, 0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(90, 95).mirror().addBox(-0.5F, -1.575F, -1.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8069F, 0.5519F, 0.9032F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4521F, -0.3362F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftArm4 = chest.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4921F, 17.9588F, -6.928F, 0.8838F, 0.0663F, -0.0455F));

		PartDefinition cube_r100 = leftArm4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(132, 65).addBox(-0.5F, -0.625F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0264F, 9.8253F, 1.2186F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftArm4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(43, 145).addBox(-0.5F, -1.553F, 1.409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 7.2997F, 0.266F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftArm4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(59, 141).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0264F, 8.8124F, 0.9076F, 0.0441F, -0.0009F, -0.009F));

		PartDefinition cube_r103 = leftArm4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(13, 81).addBox(-0.5F, -0.3082F, 0.2292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0264F, 7.2997F, 0.266F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftArm4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(138, 50).addBox(-0.5F, -2.4618F, -0.2581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 6.9997F, 0.3661F, 0.4012F, 0.0043F, 0.0036F));

		PartDefinition cube_r105 = leftArm4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(138, 45).addBox(-0.5F, -2.4618F, 0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0264F, 6.9997F, 0.3661F, 0.2179F, 0.0043F, 0.0036F));

		PartDefinition cube_r106 = leftArm4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(126, 108).addBox(-0.375F, -0.9F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3893F, 0.7872F, 0.0425F, -2.7699F, -0.3577F, -0.0811F));

		PartDefinition cube_r107 = leftArm4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(54, 132).addBox(-0.3621F, -4.5022F, -0.8335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0264F, 5.8936F, 0.3562F, 0.2019F, -0.456F, -0.1553F));

		PartDefinition cube_r108 = leftArm4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(72, 131).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2043F, 2.4085F, -0.913F, 0.071F, -0.456F, -0.1553F));

		PartDefinition cube_r109 = leftArm4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(9, 141).addBox(-0.4621F, -2.1263F, -0.524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 5.8936F, 0.2312F, 0.6382F, -0.456F, -0.1553F));

		PartDefinition cube_r110 = leftArm4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(47, 132).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3802F, 0.231F, 0.6832F, -0.6997F, 0.0179F, -0.143F));

		PartDefinition cube_r111 = leftArm4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(121, 48).addBox(-0.5F, -1.75F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1406F, 1.9281F, 0.4292F, -0.3071F, 0.0179F, -0.143F));

		PartDefinition cube_r112 = leftArm4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(40, 138).addBox(-0.4878F, -2.9992F, -0.2304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 5.8936F, 0.3562F, 0.0595F, 0.0179F, -0.0033F));

		PartDefinition leftArm7 = leftArm4.addOrReplaceChild("leftArm7", CubeListBuilder.create().texOffs(96, 109).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(101, 102).addBox(-0.5909F, 0.8921F, -1.3717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.316F, 10.2404F, 1.6679F, -1.6156F, -0.4953F, -1.6017F));

		PartDefinition cube_r113 = leftArm7.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 127).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create().texOffs(65, 123).addBox(-0.6767F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2666F, 11.075F, -0.192F, 0.0276F, 0.0337F, 0.1753F));

		PartDefinition cube_r114 = leftArm8.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(145, 53).addBox(-0.5F, -0.4F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.0153F, 5.9502F, -0.051F, -0.1745F, 0.0F, -0.3054F));

		PartDefinition cube_r115 = leftArm8.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(138, 148).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.0153F, 5.9502F, -0.051F, 0.1745F, 0.0F, -0.3054F));

		PartDefinition cube_r116 = leftArm8.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(15, 124).addBox(-0.5F, 1.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, -0.951F, -0.5433F, -0.0349F, 0.0F, 0.0F));

		PartDefinition opposablePinkie3 = leftArm8.addOrReplaceChild("opposablePinkie3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r117 = opposablePinkie3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(54, 138).addBox(-0.5F, -1.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0945F, 2.5179F, -0.4517F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = chest.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4921F, 17.9588F, -6.928F, 1.471F, -0.3533F, -0.057F));

		PartDefinition cube_r118 = rightArm4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(115, 137).addBox(-0.5F, -0.625F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0264F, 9.8253F, 1.2186F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightArm4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(148, 132).addBox(-0.5F, -1.553F, 1.409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 7.2997F, 0.266F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightArm4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(144, 92).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0264F, 8.8124F, 0.9076F, 0.0441F, 0.0009F, 0.009F));

		PartDefinition cube_r121 = rightArm4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 140).addBox(-0.5F, -0.3082F, 0.2292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0264F, 7.2997F, 0.266F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightArm4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(27, 140).addBox(-0.5F, -2.4618F, -0.2581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 6.9997F, 0.3661F, 0.4012F, -0.0043F, -0.0036F));

		PartDefinition cube_r123 = rightArm4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(22, 140).addBox(-0.5F, -2.4618F, 0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0264F, 6.9997F, 0.3661F, 0.2179F, -0.0043F, -0.0036F));

		PartDefinition cube_r124 = rightArm4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(65, 131).addBox(-0.625F, -0.9F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3893F, 0.7872F, 0.0425F, -2.7699F, 0.3577F, 0.0811F));

		PartDefinition cube_r125 = rightArm4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(110, 137).addBox(-0.6379F, -4.5022F, -0.8335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0264F, 5.8936F, 0.3562F, 0.2019F, 0.456F, 0.1553F));

		PartDefinition cube_r126 = rightArm4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(72, 137).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2043F, 2.4085F, -0.913F, 0.071F, 0.456F, 0.1553F));

		PartDefinition cube_r127 = rightArm4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(144, 88).addBox(-0.5379F, -2.1263F, -0.524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 5.8936F, 0.2312F, 0.6382F, 0.456F, 0.1553F));

		PartDefinition cube_r128 = rightArm4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(137, 93).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3802F, 0.231F, 0.6832F, -0.6997F, -0.0179F, 0.143F));

		PartDefinition cube_r129 = rightArm4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(70, 125).addBox(-0.5F, -1.75F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1406F, 1.9281F, 0.4292F, -0.3071F, -0.0179F, 0.143F));

		PartDefinition cube_r130 = rightArm4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(17, 140).addBox(-0.5122F, -2.9992F, -0.2304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 5.8936F, 0.3562F, 0.0595F, -0.0179F, 0.0033F));

		PartDefinition rightArm7 = rightArm4.addOrReplaceChild("rightArm7", CubeListBuilder.create().texOffs(110, 38).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(62, 103).addBox(-0.4091F, 0.8921F, -1.3717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.316F, 10.2404F, 1.6679F, -1.8633F, 0.6928F, 1.251F));

		PartDefinition cube_r131 = rightArm7.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(105, 131).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create().texOffs(77, 125).addBox(-0.3233F, 0.049F, -0.5433F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2666F, 11.075F, -0.192F, 0.0677F, -0.1614F, -0.1343F));

		PartDefinition cube_r132 = rightArm8.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(148, 135).addBox(-0.5F, -0.4F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0153F, 5.9502F, -0.051F, -0.1745F, 0.0F, 0.3054F));

		PartDefinition cube_r133 = rightArm8.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(149, 0).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0153F, 5.9502F, -0.051F, 0.1745F, 0.0F, 0.3054F));

		PartDefinition cube_r134 = rightArm8.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(93, 125).addBox(-0.5F, 1.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, -0.951F, -0.5433F, -0.0349F, 0.0F, 0.0F));

		PartDefinition opposablePinkie2 = rightArm8.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r135 = opposablePinkie2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(45, 140).addBox(-0.5F, -1.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0945F, 2.5179F, -0.4517F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest3 = chest.addOrReplaceChild("chest3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8612F, -4.6119F, -0.0646F, -0.1335F, -0.0347F));

		PartDefinition cube_r136 = chest3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(85, 141).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9629F, -1.0921F, 0.7178F, 0.26F, -0.3962F));

		PartDefinition cube_r137 = chest3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(115, 141).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9629F, -1.0921F, 0.5685F, 0.4704F, -0.807F));

		PartDefinition cube_r138 = chest3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(31, 14).mirror().addBox(-15.765F, -1.9458F, -0.318F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9629F, -1.0921F, 0.3134F, 0.6606F, -1.2749F));

		PartDefinition cube_r139 = chest3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(31, 14).addBox(2.765F, -1.9458F, -0.318F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9629F, -1.0921F, 0.3134F, -0.6606F, 1.2749F));

		PartDefinition cube_r140 = chest3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(115, 141).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9629F, -1.0921F, 0.5685F, -0.4704F, 0.807F));

		PartDefinition cube_r141 = chest3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(85, 141).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9629F, -1.0921F, 0.7178F, -0.26F, 0.3962F));

		PartDefinition cube_r142 = chest3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(20, 124).addBox(0.0F, -3.6781F, -0.1018F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.5842F, -2.3105F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(69, 88).addBox(-1.0F, -0.0448F, -3.9381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, 0.7243F, 0.0F, 0.0F));

		PartDefinition chest2 = chest3.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 2.8832F, -2.327F, 0.1747F, -0.043F, -0.0076F));

		PartDefinition cube_r144 = chest2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-15.7647F, -1.946F, -0.3189F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.2476F, 0.4675F, -1.293F));

		PartDefinition cube_r145 = chest2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(140, 97).mirror().addBox(-3.3281F, -0.5952F, -0.3189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.4222F, 0.3215F, -0.8465F));

		PartDefinition cube_r146 = chest2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(141, 132).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.2F, 0.5295F, 0.1789F, -0.4202F));

		PartDefinition cube_r147 = chest2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(19, 55).mirror().addBox(-14.7415F, -1.9518F, -0.3082F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.2851F, 0.5207F, -1.257F));

		PartDefinition cube_r148 = chest2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(140, 99).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.4781F, 0.3551F, -0.8096F));

		PartDefinition cube_r149 = chest2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(141, 134).mirror().addBox(-1.4539F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.8F, -1.6F, 0.5925F, 0.1879F, -0.3905F));

		PartDefinition cube_r150 = chest2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(141, 136).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3F, -2.8F, 0.6631F, 0.1863F, -0.4082F));

		PartDefinition cube_r151 = chest2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(142, 30).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3F, -2.8F, 0.5469F, 0.3816F, -0.8158F));

		PartDefinition cube_r152 = chest2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(60, 13).mirror().addBox(-12.729F, -1.955F, -0.2993F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3F, -2.8F, 0.3396F, 0.5722F, -1.2595F));

		PartDefinition cube_r153 = chest2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(60, 13).addBox(2.729F, -1.955F, -0.2993F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -2.8F, 0.3396F, -0.5722F, 1.2595F));

		PartDefinition cube_r154 = chest2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(29, 113).addBox(0.0F, -2.9784F, -0.0756F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 0.0452F, -1.0481F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(97, 24).addBox(0.0F, -1.4777F, -0.0314F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 4.4153F, -5.3777F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(87, 68).addBox(0.0F, -2.4502F, -0.0382F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 3.0153F, -3.8777F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(97, 103).addBox(0.0F, -2.6278F, -0.0698F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.443F, -2.4443F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(19, 57).addBox(-1.0F, -0.0865F, -2.1546F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.943F, -3.7443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(142, 30).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -2.8F, 0.5469F, -0.3816F, 0.8158F));

		PartDefinition cube_r160 = chest2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(141, 136).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -2.8F, 0.6631F, -0.1863F, 0.4082F));

		PartDefinition cube_r161 = chest2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(141, 134).addBox(-0.5461F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.5925F, -0.1879F, 0.3905F));

		PartDefinition cube_r162 = chest2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(140, 99).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.4781F, -0.3551F, 0.8096F));

		PartDefinition cube_r163 = chest2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(19, 55).addBox(2.7415F, -1.9518F, -0.3082F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.6F, 0.2851F, -0.5207F, 1.257F));

		PartDefinition cube_r164 = chest2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(141, 132).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.5295F, -0.1789F, 0.4202F));

		PartDefinition cube_r165 = chest2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(140, 97).addBox(1.3281F, -0.5952F, -0.3189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.4222F, -0.3215F, 0.8465F));

		PartDefinition cube_r166 = chest2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(52, 16).addBox(2.7647F, -1.946F, -0.3189F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, 0.2476F, -0.4675F, 1.293F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.6509F, -4.2561F, 0.2112F, -0.128F, -0.0274F));

		PartDefinition cube_r167 = neck4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(20, 109).addBox(0.0F, -1.191F, -0.0268F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9772F, -2.9376F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r168 = neck4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(142, 40).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, -0.4439F, 0.6306F, 0.1724F, -0.414F));

		PartDefinition cube_r169 = neck4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(142, 62).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, -0.4439F, 0.5214F, 0.356F, -0.825F));

		PartDefinition cube_r170 = neck4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-9.729F, -1.955F, -0.2993F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, -0.4439F, 0.3271F, 0.5389F, -1.2661F));

		PartDefinition cube_r171 = neck4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(143, 14).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -2.2439F, 0.7754F, 0.4192F, -0.414F));

		PartDefinition cube_r172 = neck4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(143, 16).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -2.2439F, 0.5495F, 0.6378F, -0.854F));

		PartDefinition cube_r173 = neck4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-3.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -2.2439F, 0.1856F, 0.7995F, -1.3974F));

		PartDefinition cube_r174 = neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(80, 9).addBox(2.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -2.2439F, 0.1856F, -0.7995F, 1.3974F));

		PartDefinition cube_r175 = neck4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(143, 16).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -2.2439F, 0.5495F, -0.6378F, 0.854F));

		PartDefinition cube_r176 = neck4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(143, 14).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -2.2439F, 0.7754F, -0.4192F, 0.414F));

		PartDefinition cube_r177 = neck4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(90, 6).addBox(2.729F, -1.955F, -0.2993F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, -0.4439F, 0.3271F, -0.5389F, 1.2661F));

		PartDefinition cube_r178 = neck4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(142, 62).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, -0.4439F, 0.5214F, -0.356F, 0.825F));

		PartDefinition cube_r179 = neck4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(142, 40).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, -0.4439F, 0.6306F, -0.1724F, 0.414F));

		PartDefinition cube_r180 = neck4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(103, 0).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2016F, -2.0737F, 0.7437F, -0.3923F, -0.199F));

		PartDefinition cube_r181 = neck3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(81, 15).addBox(0.0F, -2.5487F, 5.0661F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 31).addBox(-0.5F, -1.9487F, 3.0661F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8164F, -6.3763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5735F, -3.3438F, -0.4497F, -0.0213F, 0.1557F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(89, 130).addBox(0.0F, -0.8018F, 6.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(47, 129).addBox(0.0F, -0.8018F, 8.8419F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(99, 76).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -7.2263F, -6.8488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(119, 12).addBox(-0.5F, -3.75F, -0.9206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(116, 12).addBox(0.0F, -1.75F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 65).addBox(0.0F, -3.75F, 0.4794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7838F, -2.5662F, 0.4762F, -0.2129F, 0.0394F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(108, 21).addBox(0.0F, -2.0F, 0.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2939F, 0.002F, -0.0519F, -0.1216F, 0.1811F));

		PartDefinition neck = neck6.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5632F, 0.2188F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r183 = neck.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(94, 138).addBox(0.0F, -1.4F, -0.65F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.561F, -0.9041F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r184 = neck.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(128, 17).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1694F, -1.769F, 0.1212F, -0.3395F, -0.1081F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(106, 102).addBox(-0.25F, 0.7539F, -1.9202F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4092F, -13.1362F, 0.5629F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(147, 11).addBox(-0.5F, -0.775F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.1083F, -14.2333F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(112, 26).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.3827F, -4.7064F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(101, 72).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -2.1127F, 1.865F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(110, 99).addBox(-1.0F, -0.3971F, 1.777F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4092F, -13.1362F, -2.1039F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(109, 12).addBox(-1.0F, 1.2127F, -0.3414F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4092F, -13.1362F, -0.664F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(104, 62).addBox(-1.0F, -0.0939F, -1.6158F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -0.4092F, -13.1362F, 0.7322F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(101, 38).addBox(-1.0F, 0.0211F, -0.9849F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4092F, -13.1362F, 0.5751F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(89, 133).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.0076F, 1.4188F, 2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(110, 79).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.0076F, 1.4188F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(91, 65).addBox(-1.5F, -0.45F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.162F, -0.4173F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(75, 30).addBox(-1.5F, -0.775F, -1.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.8957F, 0.1162F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(67, 111).addBox(-0.5F, 0.0058F, -1.9896F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -3.5842F, -6.6112F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(71, 81).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -3.8764F, -4.6267F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0F, 0.3F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -3.9657F, -2.6063F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(66, 95).addBox(-1.5F, -0.05F, -2.3F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.6182F, -0.5965F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(86, 103).addBox(-1.5F, -2.0F, -1.725F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.2698F, 0.0316F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(142, 68).addBox(-0.5F, -0.105F, -0.9088F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.4092F, -13.1362F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(133, 11).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0772F, -13.778F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(142, 58).addBox(-0.5F, -0.2818F, -2.8334F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(142, 36).addBox(-0.5F, -0.2818F, -3.0334F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.5842F, -6.6112F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(128, 22).addBox(-0.5F, -0.0677F, -1.9062F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.0F, -2.6841F, -9.4112F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(130, 0).addBox(-0.5F, -0.094F, -1.9129F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.4841F, -11.7112F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(142, 32).addBox(-0.5F, -0.2726F, -2.701F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.6841F, -9.4112F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(101, 24).addBox(-0.5F, 1.0574F, -2.0595F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -2.6841F, -9.4112F, 0.1134F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2997F, -2.37F, -2.4145F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(40, 134).addBox(-0.2453F, -0.5226F, -0.5983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.574F, 0.4593F, 3.3577F, -1.157F, 0.0005F, -0.1296F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(133, 123).addBox(-0.2445F, -0.4468F, -0.3148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5008F, 1.0184F, 4.0592F, -1.8115F, 0.0005F, -0.1296F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(121, 93).addBox(-1.2445F, 0.385F, -0.2851F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.574F, 0.4593F, 3.3577F, 2.8747F, 0.0005F, -0.1296F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(147, 8).addBox(-0.2445F, -0.0622F, -1.1311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.574F, 0.4593F, 3.3577F, -2.5795F, 0.0005F, -0.1296F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(143, 146).addBox(-0.2445F, -0.487F, -1.0877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.574F, 0.4593F, 3.3577F, -2.7715F, 0.0005F, -0.1296F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(142, 113).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.3271F, 0.3731F, 4.289F, -1.5061F, 0.0005F, -0.1296F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(119, 72).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.2402F, 0.8207F, -5.9748F, 0.5137F, 0.2165F, -0.052F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(27, 119).addBox(-0.3216F, -0.7001F, 2.035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.4067F, 2.6446F, -6.438F, -0.2918F, 0.0939F, -0.0466F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 115).addBox(-0.3902F, -1.2261F, -0.787F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.4067F, 2.6446F, -6.438F, -0.0644F, 0.1213F, -0.0443F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(148, 48).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.9578F, 3.1641F, -8.7554F, 0.4395F, 0.1253F, -0.0694F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(47, 136).addBox(-0.0289F, -0.9538F, -1.6799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(100, 146).addBox(-0.0289F, -1.9538F, -0.6799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.7689F, 3.3784F, -6.9478F, 0.1769F, 0.0823F, -0.0771F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(117, 109).addBox(-1.975F, -0.225F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2828F, -1.0076F, 1.1455F, -0.0411F, 0.0546F, -0.0913F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(139, 65).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.1267F, 1.4302F, -5.2764F, 0.4293F, -1.0885F, -0.4368F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(139, 42).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.4607F, -0.3202F, -6.1844F, 0.8243F, -0.904F, -0.8927F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(33, 106).addBox(-1.9462F, 0.0841F, -2.8918F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9109F, -1.3155F, -3.5237F, 0.3099F, 0.2437F, -0.0575F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(110, 72).addBox(-1.05F, -1.525F, -0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.5477F, 0.2657F, -2.7271F, 0.0572F, 0.1313F, -0.096F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(67, 103).addBox(-1.0F, -2.825F, -0.9F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2391F, 1.5585F, -0.7475F, -0.0994F, 0.1279F, -0.0911F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(148, 138).addBox(-0.5F, -0.625F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.232F, 6.6167F, 1.8463F, 0.6882F, 0.0538F, -0.157F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(138, 139).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1567F, 4.0024F, 2.3069F, -0.1791F, 0.0696F, -0.071F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(110, 143).addBox(-0.5F, -1.775F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0734F, 5.7545F, 1.4406F, 0.7319F, 0.0538F, -0.157F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(122, 138).addBox(-0.5F, -2.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0734F, 5.7545F, 1.4406F, -0.0099F, 0.0538F, -0.157F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(128, 72).addBox(-1.0213F, -1.7055F, -1.7253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1355F, 1.1326F, 2.63F, -0.4821F, 0.0512F, -0.2097F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(24, 105).addBox(-1.0213F, -0.3805F, -2.4003F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1115F, 1.175F, 1.9995F, -0.2385F, 0.1227F, -0.0876F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(128, 60).addBox(0.5271F, -0.733F, -2.8252F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4689F, 3.3784F, -6.6478F, 0.1319F, 0.0487F, 0.1082F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(128, 48).addBox(0.1817F, 0.0524F, -0.4666F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1067F, 2.6446F, -6.138F, -0.0567F, 0.0698F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(64, 144).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.0998F, 1.5482F, 1.1781F, -0.1156F, 0.1188F, -0.1513F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(144, 0).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.1467F, 0.9523F, 1.5425F, -0.5519F, 0.1188F, -0.1513F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(143, 142).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.0616F, 0.9433F, 2.2586F, -0.9882F, 0.1188F, -0.1513F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(143, 138).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F))
				.texOffs(143, 127).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.3277F, -0.5106F, 1.8907F, -0.1592F, 0.1188F, -0.1513F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(125, 143).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3709F, -0.4801F, 1.4942F, 0.059F, 0.1188F, -0.1513F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(120, 143).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.3964F, -0.3487F, 1.1173F, 0.3208F, 0.1188F, -0.1513F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(102, 142).addBox(-0.5036F, -2.4303F, -0.0272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0048F, 1.7904F, 1.6292F, 0.5389F, 0.1188F, -0.1513F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(142, 84).addBox(-0.5036F, -2.3614F, -0.0973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0048F, 1.7904F, 1.6292F, 0.696F, 0.1188F, -0.1513F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(142, 80).addBox(-0.5036F, -2.3213F, -0.2476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0048F, 1.7904F, 1.6292F, 0.8182F, 0.1188F, -0.1513F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(135, 69).addBox(-0.5F, 0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.307F))
				.texOffs(148, 22).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(148, 4).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.307F)), PartPose.offsetAndRotation(0.124F, 3.7575F, 0.6123F, -1.6804F, 0.1174F, -0.1372F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(115, 143).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.1225F, 2.9064F, -0.4715F, -2.2476F, 0.1174F, -0.1372F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(125, 147).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.188F, 2.5277F, -0.5825F, -1.2877F, 0.1174F, -0.1372F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(115, 54).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.169F, 2.0088F, 0.1793F, -0.7641F, 0.1174F, -0.1372F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(128, 32).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3911F, 0.3689F, 0.2155F, -0.4587F, 0.1174F, -0.1372F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(112, 133).addBox(-0.4361F, -0.774F, -0.4637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7536F, 0.1733F, -2.5513F, 2.562F, 0.1548F, -0.1709F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(142, 76).addBox(-0.4361F, -0.525F, -0.3085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.7536F, 0.1733F, -2.5513F, -2.4122F, 0.1548F, -0.1709F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(24, 136).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.287F))
				.texOffs(17, 136).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8174F, 0.7334F, -3.9791F, -0.1433F, 0.1548F, -0.1709F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(136, 5).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2973F)), PartPose.offsetAndRotation(-0.7427F, 1.1236F, -3.9324F, 0.1185F, 0.1548F, -0.1709F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(135, 113).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.6556F, 1.4785F, -3.7698F, 0.424F, 0.1548F, -0.1709F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(80, 144).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2973F)), PartPose.offsetAndRotation(-0.5658F, 1.7141F, -3.4593F, -0.6669F, 0.1548F, -0.1709F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(130, 92).addBox(-0.5F, -0.3F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.3043F, 1.9936F, -2.1126F, -1.8013F, 0.1548F, -0.1709F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(82, 130).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.1951F, 1.4474F, -0.8282F, -2.7613F, 0.1548F, -0.1709F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(3, 130).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.3896F, 0.085F, -0.5712F, 2.9547F, 0.1548F, -0.1709F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(135, 85).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.4686F, -0.2987F, -0.6519F, -2.9358F, 0.1548F, -0.1709F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(135, 81).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-0.559F, -0.6185F, -0.8746F, -2.5431F, 0.1548F, -0.1709F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(80, 135).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.646F, -0.8108F, -1.2144F, -2.1068F, 0.1548F, -0.1709F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(135, 77).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.725F, -0.924F, -1.5898F, -1.8886F, 0.1548F, -0.1709F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(135, 73).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.7997F, -1.0038F, -1.9746F, -1.8013F, 0.1548F, -0.1709F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(121, 77).addBox(-0.5F, -2.7F, -1.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-0.9593F, -0.686F, -3.3286F, -2.9358F, 0.1548F, -0.1709F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(146, 64).addBox(-0.5111F, -0.2828F, -0.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(48, 146).addBox(-0.7861F, -0.2828F, -0.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-0.7536F, 0.1733F, -2.5513F, 0.1185F, 0.1548F, -0.1709F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(140, 105).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4427F, 1.3039F, -4.5577F, 1.038F, 0.3931F, -0.1497F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(27, 145).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2011F, 1.3741F, -4.0067F, 0.7516F, 0.3918F, -0.2164F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(140, 101).addBox(-0.5F, -0.6068F, -0.9482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4427F, 1.3039F, -4.5577F, 0.7762F, 0.3931F, -0.1497F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(131, 53).addBox(-1.0052F, -0.7158F, 0.5574F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1231F, 3.734F, -3.172F, 0.8633F, 0.1273F, -0.1653F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 136).addBox(-1.0052F, -0.6158F, 0.0324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1782F, 3.2685F, -2.998F, 1.2647F, 0.1273F, -0.1653F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(133, 109).addBox(-1.1278F, 0.4221F, -4.235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9109F, -1.3155F, -3.5237F, 1.2348F, 0.2993F, -0.1717F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(133, 105).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4334F, 4.9287F, -1.5908F, -1.1875F, 0.1273F, -0.1479F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(142, 72).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.283F, 5.0912F, -0.6156F, -0.1839F, 0.1273F, -0.1479F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(128, 27).addBox(-0.5F, -0.55F, -1.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3593F, 3.3822F, 0.7623F, 0.1652F, 0.1273F, -0.1479F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(138, 120).addBox(-1.3223F, -0.5768F, -1.1193F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3623F, 4.3136F, -11.7934F, 0.119F, 1.1667F, 0.2317F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(146, 42).addBox(-0.2636F, -0.3126F, -1.1166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3623F, 4.3136F, -11.7934F, -0.6481F, 1.0559F, -0.424F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(138, 117).addBox(-1.1603F, -0.5503F, -0.7081F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3623F, 4.3136F, -11.7934F, 0.3389F, 1.4392F, 0.5107F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(0, 146).addBox(-0.0846F, -0.3417F, -0.7081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3623F, 4.3136F, -11.7934F, -1.1214F, 1.282F, -0.9687F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(138, 55).addBox(-1.2097F, -0.5056F, -0.5198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3623F, 4.3136F, -11.7934F, -0.0555F, 0.8673F, 0.1885F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(130, 145).addBox(-0.1451F, -0.314F, -0.5198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3623F, 4.3136F, -11.7934F, -0.3874F, 0.7988F, -0.2565F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(43, 148).addBox(-0.7666F, -0.3758F, 0.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.7623F, 4.3136F, -12.0934F, 0.043F, 0.5374F, -0.1603F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(27, 148).addBox(-0.7666F, -0.3758F, 0.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(145, 120).addBox(-0.7666F, -0.3758F, -0.1871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.7623F, 4.3136F, -12.0934F, -0.306F, 0.5374F, -0.1603F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(138, 27).addBox(-1.6912F, -0.3616F, 0.1321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7623F, 4.3136F, -12.0934F, 0.2218F, 0.3273F, 0.0849F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(135, 62).addBox(-1.8169F, -0.3645F, -0.165F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7623F, 4.3136F, -12.0934F, 0.2569F, 0.4846F, 0.185F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(145, 117).addBox(-0.7666F, -0.3619F, -0.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.7623F, 4.3136F, -12.0934F, 0.0867F, 0.5374F, -0.1603F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(145, 104).addBox(-0.7271F, -0.3619F, 0.119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7623F, 4.3136F, -12.0934F, 0.082F, 0.433F, -0.1703F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(145, 101).addBox(-0.0255F, 0.0181F, -0.9642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3774F, 3.7492F, -10.7054F, 0.1261F, -0.242F, 0.0528F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(95, 145).addBox(-0.0255F, 0.0187F, -0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3774F, 3.7492F, -10.7054F, 0.1697F, -0.242F, 0.0528F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(58, 145).addBox(-0.65F, -0.8F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.3419F, 2.7667F, -8.6066F, 0.4866F, 0.0648F, -0.0667F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(137, 0).addBox(-1.0F, 0.0058F, -1.9896F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.6458F, 0.6267F, -8.6945F, 0.6162F, 0.1011F, -0.0429F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(148, 45).addBox(0.0F, 0.0058F, -0.9896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.5662F, 0.2463F, -7.6905F, 0.4329F, 0.1011F, -0.0429F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(103, 136).addBox(-1.0F, 0.0058F, -1.9896F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2599F, -0.5779F, -6.0737F, 0.4207F, 0.1802F, -0.0057F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(50, 120).addBox(-1.0F, 0.0058F, -1.9896F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.851F, -1.1345F, -4.1967F, 0.2839F, 0.212F, 0.0088F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(133, 101).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.766F, 1.7638F, -8.8917F, 0.5763F, 0.1254F, 0.081F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(145, 26).addBox(-0.1F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0F, 3.8834F, -11.9284F, 2.5606F, -0.1714F, -0.2541F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(18, 119).addBox(-0.2703F, 0.2599F, -0.4025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.3774F, 3.3492F, -10.4054F, 0.8743F, -0.1577F, -0.0726F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(104, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.3842F, 0.6712F, -6.7483F, 0.4485F, 0.1407F, 0.0681F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(133, 97).addBox(-0.8878F, -0.4252F, -0.2328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3774F, 3.3492F, -10.7054F, 0.5848F, -0.0146F, -0.0096F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2997F, -2.37F, -2.4145F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(40, 134).mirror().addBox(-0.7547F, -0.5226F, -0.5983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.574F, 0.4593F, 3.3577F, -1.157F, -0.0005F, 0.1296F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(133, 123).mirror().addBox(-0.7555F, -0.4468F, -0.3148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5008F, 1.0184F, 4.0592F, -1.8115F, -0.0005F, 0.1296F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(121, 93).mirror().addBox(-0.7555F, 0.385F, -0.2851F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.574F, 0.4593F, 3.3577F, 2.8747F, -0.0005F, 0.1296F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(147, 8).mirror().addBox(-0.7555F, -0.0622F, -1.1311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.574F, 0.4593F, 3.3577F, -2.5795F, -0.0005F, 0.1296F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(143, 146).mirror().addBox(-0.7555F, -0.487F, -1.0877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.574F, 0.4593F, 3.3577F, -2.7715F, -0.0005F, 0.1296F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(142, 113).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.3271F, 0.3731F, 4.289F, -1.5061F, -0.0005F, 0.1296F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(119, 72).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.2402F, 0.8207F, -5.9748F, 0.5137F, -0.2165F, 0.052F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(27, 119).mirror().addBox(-0.6784F, -0.7001F, 2.035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.4067F, 2.6446F, -6.438F, -0.2918F, -0.0939F, 0.0466F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-0.6098F, -1.2261F, -0.787F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.4067F, 2.6446F, -6.438F, -0.0644F, -0.1213F, 0.0443F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(148, 48).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.9578F, 3.1641F, -8.7554F, 0.4395F, -0.1253F, 0.0694F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(47, 136).mirror().addBox(-0.9711F, -0.9538F, -1.6799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(100, 146).mirror().addBox(-0.9711F, -1.9538F, -0.6799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.7689F, 3.3784F, -6.9478F, 0.1769F, -0.0823F, 0.0771F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(117, 109).mirror().addBox(-0.025F, -0.225F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.2828F, -1.0076F, 1.1455F, -0.0411F, -0.0546F, 0.0913F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(139, 65).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.1267F, 1.4302F, -5.2764F, 0.4293F, 1.0885F, 0.4368F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(139, 42).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.4607F, -0.3202F, -6.1844F, 0.8243F, 0.904F, 0.8927F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(-0.0538F, 0.0841F, -2.8918F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.9109F, -1.3155F, -3.5237F, 0.3099F, -0.2437F, 0.0575F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(110, 72).mirror().addBox(-0.95F, -1.525F, -0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.5477F, 0.2657F, -2.7271F, 0.0572F, -0.1313F, 0.096F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(67, 103).mirror().addBox(-1.0F, -2.825F, -0.9F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.2391F, 1.5585F, -0.7475F, -0.0994F, -0.1279F, 0.0911F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(148, 138).mirror().addBox(-0.5F, -0.625F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.232F, 6.6167F, 1.8463F, 0.6882F, -0.0538F, 0.157F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(138, 139).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1567F, 4.0024F, 2.3069F, -0.1791F, -0.0696F, 0.071F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(110, 143).mirror().addBox(-0.5F, -1.775F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0734F, 5.7545F, 1.4406F, 0.7319F, -0.0538F, 0.157F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(122, 138).mirror().addBox(-0.5F, -2.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0734F, 5.7545F, 1.4406F, -0.0099F, -0.0538F, 0.157F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(128, 72).mirror().addBox(0.0213F, -1.7055F, -1.7253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1355F, 1.1326F, 2.63F, -0.4821F, -0.0512F, 0.2097F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(24, 105).mirror().addBox(0.0213F, -0.3805F, -2.4003F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1115F, 1.175F, 1.9995F, -0.2385F, -0.1227F, 0.0876F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(128, 60).mirror().addBox(-0.5271F, -0.733F, -2.8252F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4689F, 3.3784F, -6.6478F, 0.1319F, -0.0487F, -0.1082F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(128, 48).mirror().addBox(-0.1817F, 0.0524F, -0.4666F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1067F, 2.6446F, -6.138F, -0.0567F, -0.0698F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(64, 144).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(0.0998F, 1.5482F, 1.1781F, -0.1156F, -0.1188F, 0.1513F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(144, 0).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(0.1467F, 0.9523F, 1.5425F, -0.5519F, -0.1188F, 0.1513F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(143, 142).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(0.0616F, 0.9433F, 2.2586F, -0.9882F, -0.1188F, 0.1513F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(143, 138).mirror().addBox(-0.5F, -0.3F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)).mirror(false)
				.texOffs(143, 127).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(0.3277F, -0.5106F, 1.8907F, -0.1592F, -0.1188F, 0.1513F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(125, 143).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.3709F, -0.4801F, 1.4942F, 0.059F, -0.1188F, 0.1513F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(120, 143).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(0.3964F, -0.3487F, 1.1173F, 0.3208F, -0.1188F, 0.1513F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(102, 142).mirror().addBox(-0.4964F, -2.4303F, -0.0272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0048F, 1.7904F, 1.6292F, 0.5389F, -0.1188F, 0.1513F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(142, 84).mirror().addBox(-0.4964F, -2.3614F, -0.0973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0048F, 1.7904F, 1.6292F, 0.696F, -0.1188F, 0.1513F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(142, 80).mirror().addBox(-0.4964F, -2.3213F, -0.2476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0048F, 1.7904F, 1.6292F, 0.8182F, -0.1188F, 0.1513F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(135, 69).mirror().addBox(-0.5F, 0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.307F)).mirror(false)
				.texOffs(148, 22).mirror().addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(148, 4).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.307F)).mirror(false), PartPose.offsetAndRotation(-0.124F, 3.7575F, 0.6123F, -1.6804F, -0.1174F, 0.1372F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(115, 143).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.1225F, 2.9064F, -0.4715F, -2.2476F, -0.1174F, 0.1372F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(125, 147).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.188F, 2.5277F, -0.5825F, -1.2877F, -0.1174F, 0.1372F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(115, 54).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.169F, 2.0088F, 0.1793F, -0.7641F, -0.1174F, 0.1372F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(128, 32).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3911F, 0.3689F, 0.2155F, -0.4587F, -0.1174F, 0.1372F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(112, 133).mirror().addBox(-0.5639F, -0.774F, -0.4637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7536F, 0.1733F, -2.5513F, 2.562F, -0.1548F, 0.1709F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(142, 76).mirror().addBox(-0.5639F, -0.525F, -0.3085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.7536F, 0.1733F, -2.5513F, -2.4122F, -0.1548F, 0.1709F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(24, 136).mirror().addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.287F)).mirror(false)
				.texOffs(17, 136).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8174F, 0.7334F, -3.9791F, -0.1433F, -0.1548F, 0.1709F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(136, 5).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2973F)).mirror(false), PartPose.offsetAndRotation(0.7427F, 1.1236F, -3.9324F, 0.1185F, -0.1548F, 0.1709F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(135, 113).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.6556F, 1.4785F, -3.7698F, 0.424F, -0.1548F, 0.1709F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(80, 144).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2973F)).mirror(false), PartPose.offsetAndRotation(0.5658F, 1.7141F, -3.4593F, -0.6669F, -0.1548F, 0.1709F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(130, 92).mirror().addBox(-0.5F, -0.3F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(0.3043F, 1.9936F, -2.1126F, -1.8013F, -0.1548F, 0.1709F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(82, 130).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.1951F, 1.4474F, -0.8282F, -2.7613F, -0.1548F, 0.1709F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(3, 130).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.3896F, 0.085F, -0.5712F, 2.9547F, -0.1548F, 0.1709F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(135, 85).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.4686F, -0.2987F, -0.6519F, -2.9358F, -0.1548F, 0.1709F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(135, 81).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(0.559F, -0.6185F, -0.8746F, -2.5431F, -0.1548F, 0.1709F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(80, 135).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.646F, -0.8108F, -1.2144F, -2.1068F, -0.1548F, 0.1709F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(135, 77).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(0.725F, -0.924F, -1.5898F, -1.8886F, -0.1548F, 0.1709F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(135, 73).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.7997F, -1.0038F, -1.9746F, -1.8013F, -0.1548F, 0.1709F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(121, 77).mirror().addBox(-0.5F, -2.7F, -1.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(0.9593F, -0.686F, -3.3286F, -2.9358F, -0.1548F, 0.1709F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(146, 64).mirror().addBox(-0.4889F, -0.2828F, -0.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(48, 146).mirror().addBox(-0.2139F, -0.2828F, -0.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(0.7536F, 0.1733F, -2.5513F, 0.1185F, -0.1548F, 0.1709F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(140, 105).mirror().addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.4427F, 1.3039F, -4.5577F, 1.038F, -0.3931F, 0.1497F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(27, 145).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.2011F, 1.3741F, -4.0067F, 0.7516F, -0.3918F, 0.2164F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(140, 101).mirror().addBox(-0.5F, -0.6068F, -0.9482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4427F, 1.3039F, -4.5577F, 0.7762F, -0.3931F, 0.1497F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(131, 53).mirror().addBox(0.0052F, -0.7158F, 0.5574F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1231F, 3.734F, -3.172F, 0.8633F, -0.1273F, 0.1653F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(65, 136).mirror().addBox(0.0052F, -0.6158F, 0.0324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1782F, 3.2685F, -2.998F, 1.2647F, -0.1273F, 0.1653F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(133, 109).mirror().addBox(0.1278F, 0.4221F, -4.235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.9109F, -1.3155F, -3.5237F, 1.2348F, -0.2993F, 0.1717F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(133, 105).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4334F, 4.9287F, -1.5908F, -1.1875F, -0.1273F, 0.1479F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(142, 72).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.283F, 5.0912F, -0.6156F, -0.1839F, -0.1273F, 0.1479F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(128, 27).mirror().addBox(-0.5F, -0.55F, -1.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3593F, 3.3822F, 0.7623F, 0.1652F, -0.1273F, 0.1479F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(138, 120).mirror().addBox(-0.6777F, -0.5768F, -1.1193F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3623F, 4.3136F, -11.7934F, 0.119F, -1.1667F, -0.2317F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(146, 42).mirror().addBox(-0.7364F, -0.3126F, -1.1166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3623F, 4.3136F, -11.7934F, -0.6481F, -1.0559F, 0.424F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(138, 117).mirror().addBox(-0.8397F, -0.5503F, -0.7081F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3623F, 4.3136F, -11.7934F, 0.3389F, -1.4392F, -0.5107F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(0, 146).mirror().addBox(-0.9154F, -0.3417F, -0.7081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3623F, 4.3136F, -11.7934F, -1.1214F, -1.282F, 0.9687F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(138, 55).mirror().addBox(-0.7903F, -0.5056F, -0.5198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3623F, 4.3136F, -11.7934F, -0.0555F, -0.8673F, -0.1885F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(130, 145).mirror().addBox(-0.8549F, -0.314F, -0.5198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3623F, 4.3136F, -11.7934F, -0.3874F, -0.7988F, 0.2565F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(43, 148).mirror().addBox(-0.2334F, -0.3758F, 0.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.7623F, 4.3136F, -12.0934F, 0.043F, -0.5374F, 0.1603F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(27, 148).mirror().addBox(-0.2334F, -0.3758F, 0.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(145, 120).mirror().addBox(-0.2334F, -0.3758F, -0.1871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.7623F, 4.3136F, -12.0934F, -0.306F, -0.5374F, 0.1603F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(138, 27).mirror().addBox(-0.3088F, -0.3616F, 0.1321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.7623F, 4.3136F, -12.0934F, 0.2218F, -0.3273F, -0.0849F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(135, 62).mirror().addBox(-0.1831F, -0.3645F, -0.165F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.7623F, 4.3136F, -12.0934F, 0.2569F, -0.4846F, -0.185F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(145, 117).mirror().addBox(-0.2334F, -0.3619F, -0.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.7623F, 4.3136F, -12.0934F, 0.0867F, -0.5374F, 0.1603F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(145, 104).mirror().addBox(-0.2729F, -0.3619F, 0.119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.7623F, 4.3136F, -12.0934F, 0.082F, -0.433F, 0.1703F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(145, 101).mirror().addBox(-0.9745F, 0.0181F, -0.9642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3774F, 3.7492F, -10.7054F, 0.1261F, 0.242F, -0.0528F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(95, 145).mirror().addBox(-0.9745F, 0.0187F, -0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3774F, 3.7492F, -10.7054F, 0.1697F, 0.242F, -0.0528F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(58, 145).mirror().addBox(-0.35F, -0.8F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.3419F, 2.7667F, -8.6066F, 0.4866F, -0.0648F, 0.0667F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(137, 0).mirror().addBox(0.0F, 0.0058F, -1.9896F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.6458F, 0.6267F, -8.6945F, 0.6162F, -0.1011F, 0.0429F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(148, 45).mirror().addBox(-1.0F, 0.0058F, -0.9896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(3.5662F, 0.2463F, -7.6905F, 0.4329F, -0.1011F, 0.0429F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(103, 136).mirror().addBox(0.0F, 0.0058F, -1.9896F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.2599F, -0.5779F, -6.0737F, 0.4207F, -0.1802F, 0.0057F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(50, 120).mirror().addBox(0.0F, 0.0058F, -1.9896F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.851F, -1.1345F, -4.1967F, 0.2839F, -0.212F, -0.0088F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(133, 101).mirror().addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.766F, 1.7638F, -8.8917F, 0.5763F, -0.1254F, -0.081F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(145, 26).mirror().addBox(-0.9F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.0F, 3.8834F, -11.9284F, 2.5606F, 0.1714F, 0.2541F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(18, 119).mirror().addBox(-0.7297F, 0.2599F, -0.4025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.3774F, 3.3492F, -10.4054F, 0.8743F, 0.1577F, 0.0726F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(104, 56).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.3842F, 0.6712F, -6.7483F, 0.4485F, -0.1407F, -0.0681F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(133, 97).mirror().addBox(-0.1122F, -0.4252F, -0.2328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3774F, 3.3492F, -10.7054F, 0.5848F, 0.0146F, 0.0096F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3814F, -0.3747F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(128, 77).mirror().addBox(-0.5086F, -0.5777F, 3.6699F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7525F, -4.1375F, -8.9601F, -0.4151F, -0.1639F, 0.0602F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(127, 138).mirror().addBox(-0.6839F, -0.0954F, -1.3769F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6582F, 1.2337F, -3.0613F, -2.1943F, -0.3931F, 0.1946F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(138, 127).mirror().addBox(-0.6757F, -2.6669F, -1.391F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6582F, 1.2337F, -3.0613F, -1.9887F, -0.1552F, 0.0806F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(119, 83).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9336F, -3.3363F, -8.4396F, -0.3676F, -0.1565F, 0.0138F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(119, 88).mirror().addBox(-0.4699F, 0.8505F, -1.451F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(120, 43).mirror().addBox(-0.4699F, 0.4711F, -2.2575F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, -0.4625F, -0.2967F, 0.0873F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(119, 114).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0782F, -3.3364F, -7.2346F, -0.3705F, -0.1475F, 0.0541F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(96, 134).mirror().addBox(-0.6357F, 0.6471F, -1.2168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7525F, -4.1375F, -8.9601F, -0.2793F, -0.0164F, 0.006F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(32, 147).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8595F, -3.2052F, -10.0438F, -0.1135F, -0.0174F, 0.0009F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(147, 32).mirror().addBox(-0.5F, -0.6838F, -0.5604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(93, 148).mirror().addBox(-0.5F, -1.2838F, -0.5604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7751F, -3.8038F, -11.1971F, 1.6806F, 0.0439F, 0.0108F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(147, 35).mirror().addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8588F, -4.0008F, -10.0417F, -0.6807F, -0.0174F, 0.0009F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(124, 134).mirror().addBox(-0.5F, -0.175F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8452F, -3.6638F, -10.838F, 0.1047F, -0.0174F, 0.0009F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(143, 4).mirror().addBox(0.05F, -0.6638F, -2.4477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3839F, -3.8689F, -7.8247F, -0.1956F, -0.1498F, 0.0476F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(101, 56).mirror().addBox(0.05F, -0.6223F, -0.5038F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3839F, -3.8689F, -7.8247F, -0.2828F, -0.1498F, 0.0476F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(128, 82).mirror().addBox(-0.05F, -0.6413F, 0.4443F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3839F, -3.8689F, -7.8247F, -0.3526F, -0.1498F, 0.0476F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(148, 141).mirror().addBox(-0.4699F, 0.8785F, -0.96F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, 0.4974F, -0.2967F, 0.0873F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(148, 144).mirror().addBox(-0.4699F, 1.3328F, 0.6302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, -0.0262F, -0.2967F, 0.0873F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(148, 147).mirror().addBox(-0.4699F, -1.1215F, 1.8433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, -1.0297F, -0.2967F, 0.0873F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(0, 149).mirror().addBox(-0.4699F, -3.049F, -1.2146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, -2.2951F, -0.2967F, 0.0873F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(128, 87).mirror().addBox(-0.5F, -0.85F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4747F, -2.4169F, -5.2512F, -0.2134F, -0.1475F, 0.0541F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(53, 147).mirror().addBox(-0.6357F, -1.2736F, -1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.7525F, -3.3375F, -9.2602F, -0.0088F, -0.0151F, 0.0087F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(147, 56).mirror().addBox(-0.6536F, -1.1952F, -0.3986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7525F, -3.3375F, -9.2602F, -0.334F, -0.0878F, 0.0572F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(131, 134).mirror().addBox(-0.3365F, 1.447F, -0.1697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, -2.0109F, -0.227F, 0.0708F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(147, 59).mirror().addBox(-0.3237F, 0.5724F, -3.006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, -0.9637F, -0.227F, 0.0708F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(58, 148).mirror().addBox(-0.5F, -0.85F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.8595F, -3.2052F, -10.0438F, 0.4974F, -0.0174F, 0.0009F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(63, 148).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8452F, -2.5724F, -10.8949F, 1.3701F, -0.0174F, 0.0009F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(80, 148).mirror().addBox(-0.5F, 0.2727F, -0.6445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7751F, -3.8038F, -11.1971F, 1.9424F, 0.0439F, 0.0108F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(105, 148).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 148).mirror().addBox(0.075F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3369F, -3.4842F, -12.1016F, 2.5923F, -0.0903F, 0.0195F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(10, 137).mirror().addBox(-0.4699F, 0.2523F, -1.4661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, -1.1606F, -0.2967F, 0.0873F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(87, 137).mirror().addBox(-0.4699F, 0.9167F, -2.4827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, -1.7715F, -0.2967F, 0.0873F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(137, 89).mirror().addBox(-0.4699F, 1.9958F, -1.6486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5305F, -1.2966F, -1.5934F, -2.2078F, -0.2967F, 0.0873F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(148, 126).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4765F, -4.0902F, -13.0463F, 1.6011F, 1.0237F, -1.571F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(140, 9).mirror().addBox(-2.45F, -0.725F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4765F, -4.0902F, -13.0463F, 1.6508F, 1.3724F, -1.5184F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(148, 129).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2499F, -4.0046F, -12.9511F, 2.592F, 0.096F, -0.0943F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(147, 59).addBox(-0.6763F, 0.5724F, -3.006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, -0.9637F, 0.227F, -0.0708F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(131, 134).addBox(-0.6635F, 1.447F, -0.1697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, -2.0109F, 0.227F, -0.0708F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(147, 56).addBox(-0.3464F, -1.1952F, -0.3986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7525F, -3.3375F, -9.2602F, -0.334F, 0.0878F, -0.0572F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(53, 147).addBox(-0.3643F, -1.2736F, -1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.7525F, -3.3375F, -9.2602F, -0.0088F, 0.0151F, -0.0087F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(128, 87).addBox(-0.5F, -0.85F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4747F, -2.4169F, -5.2512F, -0.2134F, 0.1475F, -0.0541F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(0, 149).addBox(-0.5301F, -3.049F, -1.2146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, -2.2951F, 0.2967F, -0.0873F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(148, 147).addBox(-0.5301F, -1.1215F, 1.8433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, -1.0297F, 0.2967F, -0.0873F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(148, 144).addBox(-0.5301F, 1.3328F, 0.6302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, -0.0262F, 0.2967F, -0.0873F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(137, 89).addBox(-0.5301F, 1.9958F, -1.6486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, -2.2078F, 0.2967F, -0.0873F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(87, 137).addBox(-0.5301F, 0.9167F, -2.4827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, -1.7715F, 0.2967F, -0.0873F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(10, 137).addBox(-0.5301F, 0.2523F, -1.4661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, -1.1606F, 0.2967F, -0.0873F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(120, 43).addBox(-0.5301F, 0.4711F, -2.2575F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(119, 88).addBox(-0.5301F, 0.8505F, -1.451F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, -0.4625F, 0.2967F, -0.0873F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(148, 141).addBox(-0.5301F, 0.8785F, -0.96F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5305F, -1.2966F, -1.5934F, 0.4974F, 0.2967F, -0.0873F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(128, 82).addBox(0.05F, -0.6413F, 0.4443F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3839F, -3.8689F, -7.8247F, -0.3526F, 0.1498F, -0.0476F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(101, 56).addBox(-0.05F, -0.6223F, -0.5038F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3839F, -3.8689F, -7.8247F, -0.2828F, 0.1498F, -0.0476F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(143, 4).addBox(-0.05F, -0.6638F, -2.4477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3839F, -3.8689F, -7.8247F, -0.1956F, 0.1498F, -0.0476F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(124, 134).addBox(-0.5F, -0.175F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8452F, -3.6638F, -10.838F, 0.1047F, 0.0174F, -0.0009F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(147, 35).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8588F, -4.0008F, -10.0417F, -0.6807F, 0.0174F, -0.0009F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(80, 148).addBox(-0.5F, 0.2727F, -0.6445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7751F, -3.8038F, -11.1971F, 1.9424F, -0.0439F, -0.0108F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(140, 9).addBox(0.45F, -0.725F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4765F, -4.0902F, -13.0463F, 1.6508F, -1.3724F, 1.5184F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(148, 126).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4765F, -4.0902F, -13.0463F, 1.6011F, -1.0237F, 1.571F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(148, 129).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2499F, -4.0046F, -12.9511F, 2.592F, -0.096F, 0.0943F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(130, 148).addBox(-1.075F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 148).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3369F, -3.4842F, -12.1016F, 2.5923F, 0.0903F, -0.0195F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(93, 148).addBox(-0.5F, -1.2838F, -0.5604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 32).addBox(-0.5F, -0.6838F, -0.5604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7751F, -3.8038F, -11.1971F, 1.6806F, -0.0439F, -0.0108F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(63, 148).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8452F, -2.5724F, -10.8949F, 1.3701F, 0.0174F, -0.0009F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(58, 148).addBox(-0.5F, -0.85F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.8595F, -3.2052F, -10.0438F, 0.4974F, 0.0174F, -0.0009F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(32, 147).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8595F, -3.2052F, -10.0438F, -0.1135F, 0.0174F, -0.0009F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(96, 134).addBox(-0.3643F, 0.6471F, -1.2168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7525F, -4.1375F, -8.9601F, -0.2793F, 0.0164F, -0.006F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(119, 114).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0782F, -3.3364F, -7.2346F, -0.3705F, 0.1475F, -0.0541F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(119, 83).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9336F, -3.3363F, -8.4396F, -0.3676F, 0.1565F, -0.0138F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(138, 127).addBox(-0.3243F, -2.6669F, -1.391F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6582F, 1.2337F, -3.0613F, -1.9887F, 0.1552F, -0.0806F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(127, 138).addBox(-0.3161F, -0.0954F, -1.3769F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6582F, 1.2337F, -3.0613F, -2.1943F, 0.3931F, -0.1946F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(128, 77).addBox(-0.4914F, -0.5777F, 3.6699F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7525F, -4.1375F, -8.9601F, -0.4151F, 0.1639F, -0.0602F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7829F, 0.6012F, 4.4686F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r451 = bone.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(46, 43).addBox(-0.278F, -0.8274F, -0.8642F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2761F, 4.6647F, -5.777F, -0.4709F, -0.192F, -0.0034F));

		PartDefinition cube_r452 = bone.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(35, 128).addBox(-0.5F, -1.5F, -0.15F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3043F, 0.7338F, 1.6505F, -0.4348F, 0.1966F, -0.0726F));

		PartDefinition cube_r453 = bone.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(120, 38).addBox(-0.5635F, -2.5766F, -5.2466F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, 0.4815F, 0.1966F, -0.0726F));

		PartDefinition cube_r454 = bone.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(109, 6).addBox(-0.5F, -1.55F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3048F, 1.7007F, 4.4105F, -0.1811F, 0.199F, -0.0656F));

		PartDefinition cube_r455 = bone.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(120, 6).addBox(-0.75F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5751F, -0.8195F, 1.478F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r456 = bone.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(82, 88).addBox(-1.4997F, -0.3634F, -0.7461F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7404F, -0.7919F, 2.3193F, -0.1985F, 0.199F, -0.0656F));

		PartDefinition cube_r457 = bone.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(147, 113).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7824F, 1.4405F, 6.6812F, 1.9092F, 0.2899F, -0.0768F));

		PartDefinition cube_r458 = bone.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(147, 110).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8739F, 0.5934F, 7.2046F, 0.9929F, 0.2899F, -0.0768F));

		PartDefinition cube_r459 = bone.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(69, 147).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6671F, -0.2646F, 6.7343F, 0.513F, 0.2899F, -0.0768F));

		PartDefinition cube_r460 = bone.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(33, 112).addBox(-0.65F, -1.5F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2829F, 0.1797F, 1.4953F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r461 = bone.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(74, 120).addBox(-0.3881F, -0.0095F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2169F, -1.7503F, 1.0969F, -0.237F, 0.08F, -0.0349F));

		PartDefinition cube_r462 = bone.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(90, 76).addBox(-0.5F, -0.65F, -1.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.173F, -1.3483F, -2.8261F, -0.3247F, -0.1278F, 0.0285F));

		PartDefinition cube_r463 = bone.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(99, 83).addBox(-0.4924F, -2.4279F, 1.3498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2609F, -1.4577F, -6.2376F, -0.6301F, -0.1278F, 0.0285F));

		PartDefinition cube_r464 = bone.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(17, 132).addBox(-0.4924F, -1.1945F, 2.1441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2609F, -1.4577F, -6.2376F, 0.0156F, -0.1278F, 0.0285F));

		PartDefinition cube_r465 = bone.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(10, 132).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5423F, -2.302F, -0.0179F, -0.2185F, -0.1308F, 0.0057F));

		PartDefinition cube_r466 = bone.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(115, 38).addBox(-0.5F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8727F, -0.557F, -11.6013F, -1.4342F, -0.1209F, 0.0503F));

		PartDefinition cube_r467 = bone.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(53, 143).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7473F, -2.0582F, -9.9488F, -1.3033F, -0.1209F, 0.0503F));

		PartDefinition cube_r468 = bone.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(110, 147).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6349F, -2.2002F, -8.9654F, 0.1366F, -0.1209F, 0.0503F));

		PartDefinition cube_r469 = bone.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(86, 81).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0586F, -2.6939F, -4.0233F, 0.0929F, -0.1209F, 0.0503F));

		PartDefinition cube_r470 = bone.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(3, 135).addBox(-0.5229F, -1.4249F, -1.3089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(101, 114).addBox(-0.5229F, -0.8249F, -1.3089F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3197F, 3.6324F, -7.4867F, 0.5229F, -0.0982F, 0.0178F));

		PartDefinition cube_r471 = bone.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(124, 54).addBox(-0.5695F, 1.2881F, -0.7636F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3197F, 3.6324F, -7.4867F, -1.0808F, -0.1293F, -0.0206F));

		PartDefinition cube_r472 = bone.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(147, 67).addBox(-0.4846F, -2.0093F, 0.9971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3197F, 3.6324F, -7.4867F, -0.1485F, -0.1309F, 0.0023F));

		PartDefinition cube_r473 = bone.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(114, 128).addBox(-0.516F, -1.4613F, -4.3628F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3197F, 3.6324F, -7.4867F, 0.1991F, -0.1285F, 0.0251F));

		PartDefinition cube_r474 = bone.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(128, 113).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6781F, 3.5994F, -10.3789F, 0.4173F, -0.1285F, 0.0251F));

		PartDefinition cube_r475 = bone.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(70, 143).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3197F, 1.3695F, -7.172F, 1.1503F, -0.1285F, 0.0251F));

		PartDefinition cube_r476 = bone.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(85, 116).addBox(-0.5F, -1.05F, -1.45F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4283F, 2.8584F, -8.3018F, 0.3213F, -0.1285F, 0.0251F));

		PartDefinition cube_r477 = bone.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(85, 9).addBox(-0.5F, -0.8F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3157F, 4.0187F, -2.7069F, -0.4712F, -0.0243F, 0.0098F));

		PartDefinition cube_r478 = bone.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(41, 120).addBox(-0.4913F, -0.9127F, 1.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3197F, 3.6324F, -7.4867F, 0.3133F, -0.1302F, 0.0138F));

		PartDefinition cube_r479 = bone.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(97, 17).addBox(-0.4913F, -1.5127F, 1.325F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3197F, 3.6324F, -7.4867F, -0.1231F, -0.1302F, 0.0138F));

		PartDefinition cube_r480 = bone.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(19, 77).addBox(-0.5F, -0.575F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7273F, 6.9876F, 1.3511F, -0.7239F, -0.1586F, -0.0442F));

		PartDefinition cube_r481 = bone.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(115, 147).addBox(-0.9932F, -11.8026F, 2.6333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4303F, 9.3019F, 3.2582F, -2.1352F, -0.2109F, 0.0077F));

		PartDefinition cube_r482 = bone.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(147, 123).addBox(-0.9932F, 2.8988F, -11.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4303F, 9.3019F, 3.2582F, 2.0972F, -0.2109F, 0.0077F));

		PartDefinition cube_r483 = bone.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(120, 147).addBox(-0.9932F, -6.7137F, -10.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4303F, 9.3019F, 3.2582F, 2.9262F, -0.2109F, 0.0077F));

		PartDefinition cube_r484 = bone.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(123, 35).addBox(-0.9932F, -12.2946F, -2.1599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4303F, 9.3019F, 3.2582F, -2.5279F, -0.2109F, 0.0077F));

		PartDefinition cube_r485 = bone.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(135, 58).addBox(-0.9932F, -6.0694F, 8.2078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4303F, 9.3019F, 3.2582F, -1.3498F, -0.2109F, 0.0077F));

		PartDefinition cube_r486 = bone.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(135, 31).addBox(-0.9932F, -2.4665F, 7.9057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4303F, 9.3019F, 3.2582F, -0.9571F, -0.2109F, 0.0077F));

		PartDefinition cube_r487 = bone.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(0, 31).addBox(-0.9932F, -1.0714F, 0.0402F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4303F, 9.3019F, 3.2582F, -0.7826F, -0.2109F, 0.0077F));

		PartDefinition cube_r488 = bone.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(76, 60).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7778F, 6.2583F, 1.4656F, -0.8897F, -0.1586F, -0.0442F));

		PartDefinition cube_r489 = bone.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(9, 116).addBox(-0.5F, -0.625F, -1.425F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5387F, 4.8791F, -0.3334F, -0.5462F, -0.1343F, -0.0473F));

		PartDefinition cube_r490 = bone.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(0, 109).addBox(-1.5188F, 5.3914F, -11.7453F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5839F, 11.5654F, 8.9189F, -1.2871F, -0.263F, -0.0288F));

		PartDefinition cube_r491 = bone.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(126, 103).addBox(-0.7829F, -1.4919F, 0.0062F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.8441F, -4.4808F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r492 = bone.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(75, 18).addBox(-0.7829F, -0.7919F, -2.8938F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7829F, 0.6012F, 4.4686F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r493 = bone3.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-0.722F, -0.8274F, -0.8642F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2761F, 4.6647F, -5.777F, -0.4709F, 0.192F, 0.0034F));

		PartDefinition cube_r494 = bone3.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(35, 128).mirror().addBox(-0.5F, -1.5F, -0.15F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3043F, 0.7338F, 1.6505F, -0.4348F, -0.1966F, 0.0726F));

		PartDefinition cube_r495 = bone3.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(120, 38).mirror().addBox(-0.4365F, -2.5766F, -5.2466F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0091F, 6.5452F, 0.4815F, -0.1966F, 0.0726F));

		PartDefinition cube_r496 = bone3.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(109, 6).mirror().addBox(-0.5F, -1.55F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3048F, 1.7007F, 4.4105F, -0.1811F, -0.199F, 0.0656F));

		PartDefinition cube_r497 = bone3.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(120, 6).mirror().addBox(-0.25F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5751F, -0.8195F, 1.478F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r498 = bone3.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(82, 88).mirror().addBox(0.4997F, -0.3634F, -0.7461F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7919F, 2.3193F, -0.1985F, -0.199F, 0.0656F));

		PartDefinition cube_r499 = bone3.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(147, 113).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7824F, 1.4405F, 6.6812F, 1.9092F, -0.2899F, 0.0768F));

		PartDefinition cube_r500 = bone3.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(147, 110).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8739F, 0.5934F, 7.2046F, 0.9929F, -0.2899F, 0.0768F));

		PartDefinition cube_r501 = bone3.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(69, 147).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6671F, -0.2646F, 6.7343F, 0.513F, -0.2899F, 0.0768F));

		PartDefinition cube_r502 = bone3.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(33, 112).mirror().addBox(-0.35F, -1.5F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2829F, 0.1797F, 1.4953F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r503 = bone3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(74, 120).mirror().addBox(-0.6119F, -0.0095F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2169F, -1.7503F, 1.0969F, -0.237F, -0.08F, 0.0349F));

		PartDefinition cube_r504 = bone3.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(90, 76).mirror().addBox(-0.5F, -0.65F, -1.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.173F, -1.3483F, -2.8261F, -0.3247F, 0.1278F, -0.0285F));

		PartDefinition cube_r505 = bone3.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(99, 83).mirror().addBox(-0.5076F, -2.4279F, 1.3498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2609F, -1.4577F, -6.2376F, -0.6301F, 0.1278F, -0.0285F));

		PartDefinition cube_r506 = bone3.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(17, 132).mirror().addBox(-0.5076F, -1.1945F, 2.1441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2609F, -1.4577F, -6.2376F, 0.0156F, 0.1278F, -0.0285F));

		PartDefinition cube_r507 = bone3.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(10, 132).mirror().addBox(-0.5F, 0.0F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5423F, -2.302F, -0.0179F, -0.2185F, 0.1308F, -0.0057F));

		PartDefinition cube_r508 = bone3.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(115, 38).mirror().addBox(-0.5F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8727F, -0.557F, -11.6013F, -1.4342F, 0.1209F, -0.0503F));

		PartDefinition cube_r509 = bone3.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(53, 143).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7473F, -2.0582F, -9.9488F, -1.3033F, 0.1209F, -0.0503F));

		PartDefinition cube_r510 = bone3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(110, 147).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6349F, -2.2002F, -8.9654F, 0.1366F, 0.1209F, -0.0503F));

		PartDefinition cube_r511 = bone3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(86, 81).mirror().addBox(-0.5F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0586F, -2.6939F, -4.0233F, 0.0929F, 0.1209F, -0.0503F));

		PartDefinition cube_r512 = bone3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(3, 135).mirror().addBox(-0.4771F, -1.4249F, -1.3089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(101, 114).mirror().addBox(-0.4771F, -0.8249F, -1.3089F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3197F, 3.6324F, -7.4867F, 0.5229F, 0.0982F, -0.0178F));

		PartDefinition cube_r513 = bone3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(124, 54).mirror().addBox(-0.4305F, 1.2881F, -0.7636F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3197F, 3.6324F, -7.4867F, -1.0808F, 0.1293F, 0.0206F));

		PartDefinition cube_r514 = bone3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(147, 67).mirror().addBox(-0.5154F, -2.0093F, 0.9971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3197F, 3.6324F, -7.4867F, -0.1485F, 0.1309F, -0.0023F));

		PartDefinition cube_r515 = bone3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(114, 128).mirror().addBox(-0.484F, -1.4613F, -4.3628F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3197F, 3.6324F, -7.4867F, 0.1991F, 0.1285F, -0.0251F));

		PartDefinition cube_r516 = bone3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(128, 113).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6781F, 3.5994F, -10.3789F, 0.4173F, 0.1285F, -0.0251F));

		PartDefinition cube_r517 = bone3.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(70, 143).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3197F, 1.3695F, -7.172F, 1.1503F, 0.1285F, -0.0251F));

		PartDefinition cube_r518 = bone3.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(85, 116).mirror().addBox(-0.5F, -1.05F, -1.45F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4283F, 2.8584F, -8.3018F, 0.3213F, 0.1285F, -0.0251F));

		PartDefinition cube_r519 = bone3.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.5F, -0.8F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3157F, 4.0187F, -2.7069F, -0.4712F, 0.0243F, -0.0098F));

		PartDefinition cube_r520 = bone3.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(41, 120).mirror().addBox(-0.5087F, -0.9127F, 1.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3197F, 3.6324F, -7.4867F, 0.3133F, 0.1302F, -0.0138F));

		PartDefinition cube_r521 = bone3.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(97, 17).mirror().addBox(-0.5087F, -1.5127F, 1.325F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3197F, 3.6324F, -7.4867F, -0.1231F, 0.1302F, -0.0138F));

		PartDefinition cube_r522 = bone3.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(19, 77).mirror().addBox(-0.5F, -0.575F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7273F, 6.9876F, 1.3511F, -0.7239F, 0.1586F, 0.0442F));

		PartDefinition cube_r523 = bone3.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(115, 147).mirror().addBox(-0.0068F, -11.8026F, 2.6333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4303F, 9.3019F, 3.2582F, -2.1352F, 0.2109F, -0.0077F));

		PartDefinition cube_r524 = bone3.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(147, 123).mirror().addBox(-0.0068F, 2.8988F, -11.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4303F, 9.3019F, 3.2582F, 2.0972F, 0.2109F, -0.0077F));

		PartDefinition cube_r525 = bone3.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(120, 147).mirror().addBox(-0.0068F, -6.7137F, -10.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4303F, 9.3019F, 3.2582F, 2.9262F, 0.2109F, -0.0077F));

		PartDefinition cube_r526 = bone3.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(123, 35).mirror().addBox(-0.0068F, -12.2946F, -2.1599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4303F, 9.3019F, 3.2582F, -2.5279F, 0.2109F, -0.0077F));

		PartDefinition cube_r527 = bone3.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(135, 58).mirror().addBox(-0.0068F, -6.0694F, 8.2078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4303F, 9.3019F, 3.2582F, -1.3498F, 0.2109F, -0.0077F));

		PartDefinition cube_r528 = bone3.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(135, 31).mirror().addBox(-0.0068F, -2.4665F, 7.9057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4303F, 9.3019F, 3.2582F, -0.9571F, 0.2109F, -0.0077F));

		PartDefinition cube_r529 = bone3.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.0068F, -1.0714F, 0.0402F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4303F, 9.3019F, 3.2582F, -0.7826F, 0.2109F, -0.0077F));

		PartDefinition cube_r530 = bone3.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(76, 60).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7778F, 6.2583F, 1.4656F, -0.8897F, 0.1586F, 0.0442F));

		PartDefinition cube_r531 = bone3.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(9, 116).mirror().addBox(-0.5F, -0.625F, -1.425F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5387F, 4.8791F, -0.3334F, -0.5462F, 0.1343F, 0.0473F));

		PartDefinition cube_r532 = bone3.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(0.5188F, 5.3914F, -11.7453F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5839F, 11.5654F, 8.9189F, -1.2871F, 0.263F, 0.0288F));

		PartDefinition cube_r533 = bone3.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(126, 103).mirror().addBox(-0.2171F, -1.4919F, 0.0062F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8441F, -4.4808F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r534 = bone3.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(75, 18).mirror().addBox(-0.2171F, -0.7919F, -2.8938F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 2.746F, 3.2778F, -1.625F, -0.2614F, 0.014F));

		PartDefinition cube_r535 = leftLeg.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(124, 129).addBox(-0.5F, 0.0303F, -0.024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.208F, 2.129F, -2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r536 = leftLeg.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(129, 6).addBox(-0.5F, 0.0302F, -2.024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.1886F, 2.4073F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r537 = leftLeg.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1144F, 2.4034F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r538 = leftLeg.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(108, 15).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.3448F, 0.5533F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r539 = leftLeg.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(24, 132).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.6205F, -2.1612F, -2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r540 = leftLeg.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(77, 95).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6398F, -2.5008F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r541 = leftLeg.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(108, 89).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.1178F, -1.5465F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r542 = leftLeg.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(98, 8).addBox(-1.5F, -2.8619F, -2.4279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.4508F, 1.1898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r543 = leftLeg.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(77, 101).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 12.1493F, 0.4969F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r544 = leftLeg.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(38, 73).addBox(-1.0F, -8.1F, -2.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.0491F, 0.9908F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r545 = leftLeg.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(28, 85).addBox(-1.0F, -4.0F, 0.075F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 12.2951F, -1.8915F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r546 = leftLeg.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(26, 96).addBox(-1.0F, -1.8F, -1.45F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r547 = leftLeg.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(67, 60).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 19.1175F, 0.8535F, 2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r548 = leftLeg.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(41, 125).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 18.0283F, 2.5308F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r549 = leftLeg.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(123, 68).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.072F, 2.8232F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r550 = leftLeg.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(112, 33).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.3946F, 1.7339F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r551 = leftLeg.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(88, 28).addBox(-1.5F, -1.4F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 17.3857F, 1.2384F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r552 = leftLeg.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(86, 43).addBox(-1.5F, -1.5F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.0F, 17.1679F, -0.9482F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(42, 114).addBox(-1.9F, 15.5313F, -2.3654F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 20.2036F, -0.4077F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r553 = leftLeg2.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(117, 99).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 0.6454F, 0.4203F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r554 = leftLeg2.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(138, 15).addBox(-0.5F, -1.2F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2F, 1.7588F, 1.7011F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r555 = leftLeg2.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(90, 143).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(32, 143).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2F, 1.7588F, 1.7011F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r556 = leftLeg2.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(85, 143).addBox(-0.5F, -1.45F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2F, 18.6093F, -0.2173F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r557 = leftLeg2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(143, 22).addBox(-0.5F, -2.7F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 19.9486F, -0.1369F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r558 = leftLeg2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(0, 121).addBox(-0.5F, 2.1577F, -0.6958F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 10.9802F, -0.6792F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r559 = leftLeg2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(19, 97).addBox(-0.5F, -10.0F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 13.188F, -1.4308F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r560 = leftLeg2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, -8.7155F, -0.4578F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 10.9802F, -0.6792F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r561 = leftLeg2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(35, 99).addBox(-1.0F, -1.5F, -0.875F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 19.4218F, -1.6094F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r562 = leftLeg2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(44, 108).addBox(-1.0F, -1.4F, -1.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 2.3324F, -0.076F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r563 = leftLeg2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(11, 109).addBox(-1.0F, -3.0F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9F, 5.7159F, -0.3753F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r564 = leftLeg2.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(94, 120).addBox(-1.0F, -0.471F, -1.9357F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 2.0316F, 2.4313F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r565 = leftLeg2.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(46, 101).addBox(-1.0F, -1.646F, -2.0357F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9F, 3.2021F, 2.431F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r566 = leftLeg2.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(126, 11).addBox(-1.0F, -1.5F, 0.55F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.9F, 16.1283F, -1.6424F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r567 = leftLeg2.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(27, 17).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 12.557F, -1.9739F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r568 = leftLeg2.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(20, 113).addBox(-1.0F, 9.6092F, -0.8011F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9F, 3.1346F, 0.0747F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r569 = leftLeg2.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(37, 89).addBox(-1.0F, -0.1313F, -1.9882F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 3.1784F, 3.5015F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(90, 34).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 21.4887F, -2.3122F, -1.7017F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(56, 73).addBox(-3.0F, -0.9696F, -2.8933F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7201F, -0.1904F, 1.3609F, 0.0866F, -0.0107F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(52, 18).addBox(-3.0F, -1.4F, -4.7F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4765F, -2.7717F, -0.1403F, -0.0254F, 0.0137F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 2.746F, 3.2778F, -1.4916F, 0.1305F, 0.0103F));

		PartDefinition cube_r570 = rightLeg.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(131, 129).addBox(-0.5F, 0.0303F, -0.024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.208F, 2.129F, -2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r571 = rightLeg.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(131, 118).addBox(-0.5F, 0.0302F, -2.024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.1886F, 2.4073F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r572 = rightLeg.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(112, 120).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1144F, 2.4034F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r573 = rightLeg.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(108, 83).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.3448F, 0.5533F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r574 = rightLeg.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(132, 37).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.6205F, -2.1612F, -2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r575 = rightLeg.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(95, 88).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6398F, -2.5008F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r576 = rightLeg.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(76, 109).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.1178F, -1.5465F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r577 = rightLeg.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(99, 42).addBox(-1.5F, -2.8619F, -2.4279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.4508F, 1.1898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r578 = rightLeg.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(101, 94).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 12.1493F, 0.4969F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r579 = rightLeg.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(47, 73).addBox(-1.0F, -8.1F, -2.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.0491F, 0.9908F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r580 = rightLeg.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(88, 17).addBox(-1.0F, -4.0F, 0.075F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 12.2951F, -1.8915F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r581 = rightLeg.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(10, 97).addBox(-1.0F, -1.8F, -1.45F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.333F, 0.1075F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r582 = rightLeg.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(10, 106).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 19.1175F, 0.8535F, 2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r583 = rightLeg.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(124, 125).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 18.0283F, 2.5308F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r584 = rightLeg.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(98, 125).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.072F, 2.8232F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r585 = rightLeg.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(112, 62).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.3946F, 1.7339F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r586 = rightLeg.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(0, 90).addBox(-1.5F, -1.4F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 17.3857F, 1.2384F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r587 = rightLeg.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(56, 86).addBox(-1.5F, -1.5F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.0F, 17.1679F, -0.9482F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(51, 114).addBox(-0.1F, 15.5313F, -2.3654F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 20.2036F, -0.4077F, 2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r588 = rightLeg2.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(117, 104).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 0.6454F, 0.4203F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r589 = rightLeg2.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(138, 21).addBox(-0.5F, -1.2F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2F, 1.7588F, 1.7011F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r590 = rightLeg2.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(22, 145).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(17, 145).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2F, 1.7588F, 1.7011F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r591 = rightLeg2.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(9, 145).addBox(-0.5F, -1.45F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2F, 18.6093F, -0.2173F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r592 = rightLeg2.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(138, 144).addBox(-0.5F, -2.7F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 19.9486F, -0.1369F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r593 = rightLeg2.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(5, 122).addBox(-0.5F, 2.1577F, -0.6958F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 10.9802F, -0.6792F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r594 = rightLeg2.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(57, 101).addBox(-0.5F, -10.0F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 13.188F, -1.4308F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r595 = rightLeg2.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(5, 96).addBox(-0.5F, -8.7155F, -0.4578F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 10.9802F, -0.6792F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r596 = rightLeg2.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(99, 49).addBox(-1.0F, -1.5F, -0.875F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 19.4218F, -1.6094F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r597 = rightLeg2.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(106, 108).addBox(-1.0F, -1.4F, -1.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 2.3324F, -0.076F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r598 = rightLeg2.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(87, 109).addBox(-1.0F, -3.0F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9F, 5.7159F, -0.3753F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r599 = rightLeg2.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(103, 120).addBox(-1.0F, -0.471F, -1.9357F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 2.0316F, 2.4313F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r600 = rightLeg2.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(101, 65).addBox(-1.0F, -1.646F, -2.0357F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9F, 3.2021F, 2.431F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r601 = rightLeg2.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(126, 97).addBox(-1.0F, -1.5F, 0.55F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9F, 16.1283F, -1.6424F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r602 = rightLeg2.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(27, 30).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 12.557F, -1.9739F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r603 = rightLeg2.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(114, 0).addBox(-1.0F, 9.6092F, -0.8011F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 3.1346F, 0.0747F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r604 = rightLeg2.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(46, 89).addBox(-1.0F, -0.1313F, -1.9882F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1784F, 3.5015F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(90, 68).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 21.4887F, -2.3122F, -1.6144F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 75).addBox(-3.0F, -0.9696F, -2.8933F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7201F, -0.1904F, 0.7941F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(52, 26).addBox(-3.0F, -1.4F, -4.7F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.4765F, -2.7717F));

		PartDefinition tail8 = hips.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5241F, 8.3792F, -0.2629F, 0.0832F, -0.0266F));

		PartDefinition cube_r605 = tail8.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(57, 124).addBox(0.0F, -4.0654F, 0.0352F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1089F, -0.0954F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r606 = tail8.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(13, 85).mirror().addBox(-2.0F, -0.1047F, -1.0009F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 86).mirror().addBox(-2.0F, -0.1047F, 0.9991F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0309F, 0.9208F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition cube_r607 = tail8.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(19, 86).addBox(0.0F, -0.1047F, 0.9991F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(13, 85).addBox(0.0F, -0.1047F, -1.0009F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0309F, 0.9208F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition cube_r608 = tail8.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(99, 138).addBox(0.0F, -4.6305F, 0.0338F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1989F, 2.814F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r609 = tail8.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(73, 34).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.8911F, -1.0954F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = tail8.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0141F, 5.7948F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r610 = tail.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(0, 129).addBox(0.0F, -9.542F, 4.889F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(121, 128).addBox(0.0F, -8.642F, 3.289F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(62, 124).addBox(0.0F, -7.642F, 1.589F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(21, 44).addBox(0.0F, -6.542F, -0.011F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8599F, 1.0214F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r611 = tail.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(129, 37).addBox(0.0F, -0.244F, -0.0724F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1019F, -2.131F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r612 = tail.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(135, 45).addBox(0.0F, -0.0495F, -0.4684F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1019F, 0.869F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r613 = tail.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(37, 135).addBox(0.0F, -0.0093F, -0.1644F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1019F, 2.869F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r614 = tail.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(34, 135).addBox(0.0F, -1.0977F, -2.2631F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 23).addBox(0.0F, -0.0977F, -0.2631F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1019F, 7.469F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r615 = tail.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(31, 132).addBox(0.0F, -5.9875F, 0.0286F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8099F, -0.9343F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r616 = tail.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(46, 54).mirror().addBox(-2.0F, -0.1047F, 4.9991F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0799F, -4.9624F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition cube_r617 = tail.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(46, 54).addBox(0.0F, -0.1047F, 4.9991F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0799F, -4.9624F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition cube_r618 = tail.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -2.0F, 7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9401F, -6.9786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(25, 43).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2599F, 8.0214F, 0.0077F, 0.1744F, 0.0443F));

		PartDefinition cube_r619 = tail2.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(3, 139).addBox(0.0F, -6.5414F, 1.3457F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 133).addBox(0.0F, -5.7414F, -0.0543F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r620 = tail2.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(62, 133).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r621 = tail2.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(59, 132).addBox(0.0F, -4.7F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r622 = tail2.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-1.9F, 0.0F, 1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r623 = tail2.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(67, 43).addBox(-0.1F, 0.0F, 1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r624 = tail2.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(0, 138).addBox(0.0F, 0.3554F, 1.6444F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 35).addBox(0.0F, -0.9446F, -2.3556F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 138).addBox(0.0F, -0.4446F, -0.3556F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 6.3868F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r625 = tail2.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(135, 15).addBox(0.0F, -0.1825F, -0.0038F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 1.3868F, 0.4712F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0057F, 8.8748F, 0.0564F, 0.172F, 0.0527F));

		PartDefinition cube_r626 = tail3.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(107, 142).addBox(0.0F, -3.3184F, 0.0367F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 12.0F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r627 = tail3.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(77, 141).addBox(0.0F, -3.4F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r628 = tail3.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(14, 141).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r629 = tail3.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(50, 140).addBox(0.0F, -3.65F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r630 = tail3.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(135, 138).addBox(0.0F, -4.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r631 = tail3.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(138, 132).addBox(0.0F, -4.35F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r632 = tail3.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(34, 77).addBox(0.0F, -4.5F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r633 = tail3.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(17, 149).addBox(0.0F, 7.7554F, 13.6444F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 149).addBox(0.0F, 6.9554F, 11.6444F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 147).addBox(0.0F, 5.1554F, 9.6444F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 143).addBox(0.0F, 3.4554F, 7.6444F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 143).addBox(0.0F, 2.5554F, 5.6444F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 139).addBox(0.0F, 0.8554F, 3.6444F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4185F, -2.4942F, 0.5105F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(38, 63).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, 0.033F, 0.1723F, 0.0916F));

		PartDefinition cube_r634 = tail4.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(147, 70).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r635 = tail4.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(14, 147).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r636 = tail4.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(5, 146).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r637 = tail4.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(23, 149).addBox(0.0F, 8.5554F, 15.6444F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 149).addBox(0.0F, 10.4554F, 21.6444F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 38).addBox(0.0F, 9.6554F, 19.6444F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 149).addBox(0.0F, 9.1554F, 17.6444F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1692F, -16.419F, 0.4931F, 0.0F, 0.0F));

		PartDefinition cube_r638 = tail4.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(135, 145).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.7505F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(57, 63).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0094F, 8.0654F, 0.0365F, 0.1294F, 0.048F));

		PartDefinition cube_r639 = tail5.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(147, 80).addBox(0.0F, -2.4822F, -0.1146F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r640 = tail5.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(77, 147).addBox(0.0F, -2.8989F, -0.1474F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r641 = tail5.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(147, 75).addBox(0.0F, -2.9156F, -0.0802F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r642 = tail5.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(48, 149).addBox(0.0F, 13.8554F, 27.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 149).addBox(0.0F, 13.0554F, 25.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 29).addBox(0.0F, 12.1554F, 23.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4116F, -24.5084F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r643 = tail5.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(74, 147).addBox(0.0F, -2.8324F, -0.1131F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.8029F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0753F, 0.2617F, 0.0082F));

		PartDefinition cube_r644 = tail6.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(132, 69).addBox(0.0F, -2.6657F, 5.5455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 45).addBox(0.0F, -2.2657F, 3.6455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r645 = tail6.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(8, 149).addBox(0.0F, -1.749F, -0.1467F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r646 = tail6.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(57, 120).addBox(0.0F, -1.9907F, -0.1795F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r647 = tail6.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(101, 149).addBox(0.0F, 17.1554F, 35.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 149).addBox(0.0F, 16.4554F, 33.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 91).addBox(0.0F, 15.7554F, 31.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 88).addBox(0.0F, 14.9554F, 29.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9913F, -32.3498F, 0.3883F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(19, 67).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0297F, 0.1742F, -0.01F));

		PartDefinition tail9 = tail7.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0047F, 8.0006F, -0.0167F, 0.3485F, -0.0206F));

		return LayerDefinition.create(meshdefinition, 155, 155);
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