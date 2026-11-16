package fossils.fossils.client.blockentity.model.muttaburrasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MuttaburrasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
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
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest2;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;

	public MuttaburrasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
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
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest2 = this.body2.getChild("chest2");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone5 = this.chest2.getChild("bone5");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.heads = this.neck8.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.leftArm = this.chest2.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest2.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -35.0F, 5.4F, 1.0F, 35.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -8.75F, -0.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.0F, -27.25F, -22.825F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.75F, -6.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -27.25F, -22.825F, 0.1309F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-6.9F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -26.0F, 5.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.6088F, 5.4168F, -0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, 1.05F, -0.85F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.7508F, -1.1884F, 4.1703F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.7508F, -1.1884F, 4.1703F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -0.7965F, -0.0865F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.8494F, 1.0183F, 1.021F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.1812F, -1.3335F, -1.0036F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.3086F, 0.0969F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -0.7965F, -0.0865F, 0.1658F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.8494F, 1.0183F, 0.8465F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.1812F, -1.3335F, -1.0036F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.3086F, 0.0969F, 0.2532F, -0.0037F, 0.0031F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(40, 59).addBox(-0.5F, 0.4183F, -5.9364F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.8687F, -6.0023F, -0.0172F, 0.0426F, 0.0096F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6479F, -6.0202F, -0.0961F, 0.0434F, -0.0042F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 20).addBox(-0.5F, 1.05F, -5.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6771F, -1.9045F, 0.3316F, 0.0F, 0.0F));

		PartDefinition chest2 = body2.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3205F, -6.6796F, -0.2271F, 0.0425F, -0.0098F));

		PartDefinition cube_r6 = chest2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.1F, -9.3F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6894F, 2.209F, 0.8029F, 0.0F, 0.0F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7929F, 10.9559F, -5.3376F, 0.41F, 0.0038F, -0.0872F));

		PartDefinition bone5 = chest2.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7929F, 10.9559F, -5.3376F, 0.41F, -0.0038F, 0.0872F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6986F, -4.0226F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(50, 79).addBox(-0.5F, -1.0F, 1.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.6F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9591F, -3.3577F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(109, 1).addBox(-0.5F, -1.8F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(108, 0).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5115F, -2.3071F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0111F, -1.4784F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(95, 42).addBox(-0.5F, 0.8781F, 2.4599F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.2F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4752F, -1.9536F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 86).addBox(-0.6F, 1.2F, -0.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0148F, -3.4133F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(49, 95).addBox(-0.5F, -0.875F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4681F, -1.5678F, -0.2901F, 0.0633F, 0.2089F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8352F, -2.7326F, -0.3698F, 0.1757F, 0.1293F));

		PartDefinition cube_r12 = neck6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(2, 95).addBox(-0.375F, -1.0F, 2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 93).addBox(-0.375F, -1.0F, -0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3081F, 0.3454F, -2.4705F, -0.1966F, 0.1255F, 0.1163F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8436F, -2.6404F, 0.1765F, 0.4083F, 0.1747F));

		PartDefinition cube_r13 = neck7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(97, 48).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7617F, -1.3915F, -0.2956F, -0.0255F, -0.0835F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.664F, -2.6721F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(80, 86).addBox(-0.5F, 1.2F, -1.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2F, -3.1F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck8.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6395F, -4.464F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.8F, -1.6735F, -1.8839F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.8F, -1.6735F, -1.8839F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.1565F, 0.9336F));

		PartDefinition leftArm = chest2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.552F, 15.2239F, -3.1186F, 1.3029F, 0.1298F, -0.0329F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0815F, 9.2296F, 3.225F, -1.6221F, 0.2408F, 0.0074F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2524F, 9.2921F, -0.8428F, 0.0113F, 0.3165F, 0.1985F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0365F, 0.2495F, 1.7355F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightArm = chest2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.552F, 15.2239F, -3.1186F, 1.5588F, -0.1181F, 0.0474F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0815F, 9.2296F, 3.225F, -1.3603F, -0.2408F, -0.0074F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2524F, 9.2921F, -0.8428F, 0.0113F, -0.3165F, -0.1985F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0365F, 0.2495F, 1.7355F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(1, 29).addBox(-0.5F, 0.1791F, 0.1652F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.1211F, 6.7085F, -0.2024F, -0.1283F, 0.0262F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2246F, 10.9433F, 0.0088F, -0.1309F, -0.0011F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 18).addBox(-0.5F, -1.825F, 8.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(31, 10).addBox(-0.5F, -1.825F, -0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.1F, 0.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(48, 49).addBox(-0.5F, 0.1F, 0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0558F, 8.7567F, 0.0616F, -0.1307F, -0.008F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(21, 50).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0144F, 7.985F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition cube_r16 = tail4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(28, 57).addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, 0.95F, 7.75F, 0.1056F, 0.1302F, 0.0138F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(52, 10).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0165F, 7.9934F, 0.1761F, 0.2615F, 0.0117F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 72).addBox(-0.45F, 0.05F, -0.55F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 77).addBox(-0.45F, 0.05F, 5.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0062F, 7.9295F, 0.1745F, 0.1745F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(54, 0).addBox(-0.475F, 0.075F, -0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0125F, 5.9135F, 0.165F, 0.1743F, -0.0092F));

		PartDefinition cube_r17 = tail7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 6).addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.325F, 0.925F, 7.6F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(27, 39).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0273F, 7.9174F, 0.1733F, 0.3896F, -0.0504F));

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