package fossils.fossils.client.blockentity.model.tethyshadros;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TethyshadrosFossilFrameModel extends SkullModelBase {
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

	public TethyshadrosFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -41.0F, 3.1F, 1.0F, 41.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(1.25F, -6.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.8F, -27.05F, -25.7F, 0.2182F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.1F, -9.95F, -0.5F, 1.0F, 37.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-4.8F, -27.05F, -25.7F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-9.1F, -5.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -29.5F, 3.6F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -42.0005F, 0.865F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 19).addBox(-0.5F, 0.9F, 5.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(58, 67).addBox(-0.5F, 1.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8146F, -0.2962F, 0.0F, 0.0436F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(48, 19).addBox(-0.5F, -0.9554F, -6.8243F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.9847F, -6.0835F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.9956F, -6.9303F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(67, 12).addBox(-0.5F, 0.8906F, -0.0631F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6401F, -5.8941F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.4275F, -5.8865F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(75, 71).addBox(-0.5F, 0.9552F, -0.0381F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6612F, -4.6119F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.0F, 9.3141F, -2.9142F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-5.0F, 9.3141F, -2.9142F));

		PartDefinition leftArm4 = chest.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7157F, 17.5256F, -4.7284F, 1.2078F, 0.0694F, 0.0774F));

		PartDefinition leftArm7 = leftArm4.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.285F, 10.8218F, 0.8549F, -1.6391F, -0.2477F, -1.0655F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2666F, 11.075F, -0.192F, 0.2046F, 0.3325F, 0.4746F));

		PartDefinition opposablePinkie3 = leftArm8.addOrReplaceChild("opposablePinkie3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1321F, -0.8271F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm4 = chest.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7157F, 17.5256F, -4.7284F, 1.3383F, -0.0916F, -0.049F));

		PartDefinition rightArm7 = rightArm4.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.285F, 10.8218F, 0.8549F, -1.7403F, 0.4503F, 1.1521F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2666F, 11.075F, -0.192F, 0.3421F, -0.1878F, -0.9963F));

		PartDefinition opposablePinkie4 = rightArm8.addOrReplaceChild("opposablePinkie4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1321F, -0.8271F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition chest3 = chest.addOrReplaceChild("chest3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8612F, -4.6119F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(85, 55).addBox(-0.5F, 0.9552F, -3.9381F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, 0.7243F, 0.0F, 0.0F));

		PartDefinition chest2 = chest3.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 2.8832F, -2.327F, 0.2254F, 0.0659F, 0.1043F));

		PartDefinition cube_r8 = chest2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 47).addBox(-0.5F, 0.9135F, -2.1546F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.943F, -3.7443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.6509F, -4.2561F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(102, 102).addBox(-0.5F, -1.1F, 1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2016F, -2.0737F, 0.0792F, 0.1305F, 0.0103F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(94, 105).addBox(-0.5F, -1.9F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(94, 105).addBox(-0.5F, -1.9F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 1.2505F, -0.4899F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(94, 105).addBox(-0.5F, -0.9487F, 6.2661F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(91, 102).addBox(-0.5F, -0.9487F, 2.5661F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.8164F, -6.3763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5735F, -3.3438F, -0.349F, 0.0013F, 0.0025F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(101, 49).addBox(-0.5F, 0.7482F, 9.2419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(98, 46).addBox(-0.5F, 0.7482F, 5.5419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.2263F, -6.8488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(9, 117).addBox(-0.5F, -3.95F, -1.9206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 117).addBox(-0.5F, -0.25F, -1.9206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.7838F, -2.5662F, 0.3665F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(53, 122).addBox(-0.5F, -2.8F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.2939F, 0.002F, -0.288F, 0.0F, 0.0F));

		PartDefinition neck = neck6.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5632F, 0.2188F, -0.8856F, 0.015F, -0.1565F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(112, 108).addBox(-0.5F, 0.2F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1035F, -2.1872F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(128, 6).addBox(-0.5F, 0.025F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck7.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0799F, -1.1963F, -0.3493F, 0.0421F, -0.0113F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2997F, -1.6604F, -2.7839F, 0.0F, 0.0F, 0.0436F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2997F, -1.6604F, -2.7839F, 0.0F, 0.0F, -0.0436F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1483F, -0.6378F, 0.4276F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7829F, -0.3988F, 3.3686F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7829F, -0.3988F, 3.3686F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 3.3602F, 2.7555F, -0.5672F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.1105F, 0.1079F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 21.6301F, -3.4436F, -0.5672F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3637F, -0.0088F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4765F, -2.7717F, -0.0087F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 3.3602F, 2.7555F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.1105F, 0.1079F, 1.2217F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 21.6301F, -3.4436F, -1.7017F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3637F, -0.0088F, 2.0595F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4765F, -2.7717F, -0.4014F, 0.0F, 0.0F));

		PartDefinition tail8 = hips.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5241F, 8.3792F, -0.262F, -0.0421F, 0.0113F));

		PartDefinition cube_r15 = tail8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 67).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.8911F, -1.0954F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = tail8.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0141F, 5.7948F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(29, 40).addBox(-0.5F, -1.0F, 14.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(22, 33).addBox(-0.5F, -1.0F, 6.975F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9401F, -6.9786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2599F, 8.0214F, 0.0F, 0.0436F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0057F, 8.8748F, -0.127F, 0.0866F, -0.011F));

		PartDefinition cube_r17 = tail3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(13, 13).addBox(-0.5F, -0.3F, 13.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.5F, -0.3F, -0.125F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(52, 2).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, 0.1408F, 0.1296F, 0.0183F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(21, 53).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(28, 60).addBox(-0.5F, 0.1F, 7.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0094F, 8.0654F, 0.1188F, 0.13F, 0.0155F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.1358F, 0.0865F, 0.0118F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(51, 57).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 64).addBox(-0.5F, 0.1F, 7.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1007F, 0.0868F, -0.0088F));

		PartDefinition tail9 = tail7.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0047F, 8.0006F, -0.1921F, 0.2143F, -0.0413F));

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