package fossils.fossils.client.blockentity.model.ouranosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OuranosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone5;
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
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie4;
	private final ModelPart chest2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck6;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;

	public OuranosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone5 = this.hips.getChild("bone5");
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
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie4 = this.rightArm3.getChild("opposablePinkie4");
		this.chest2 = this.chest.getChild("chest2");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone3 = this.chest2.getChild("bone3");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.neck7 = this.neck5.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck6 = this.neck9.getChild("neck6");
		this.heads = this.neck6.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -40.0F, 4.3F, 1.0F, 40.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.9F, -5.0F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-3.0F, -27.0F, -29.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(3.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.0F, -27.0F, -29.0F, 0.2182F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-7.5F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -31.0F, 4.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -38.4752F, 6.0094F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, 1.0F, -1.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(4.0058F, -2.5266F, 3.7692F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-4.0058F, -2.5266F, 3.7692F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -0.1749F, -1.0735F, -0.6196F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.7901F, 1.3604F, 0.8203F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.6953F, -2.0653F, -0.9163F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.0377F, -0.7796F, 0.7679F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -0.1749F, -1.0735F, 0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.7901F, 1.3604F, 0.8639F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.6953F, -2.0653F, -0.9163F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.0377F, -0.7796F, 0.4189F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1528F, -3.283F, -0.4189F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(52, 33).addBox(-0.5F, 0.3683F, -8.0364F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.8687F, -6.0023F, -0.0613F, 0.0871F, -0.0053F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0088F, -7.8319F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 64).addBox(-0.5F, 1.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6229F, -0.2045F, 0.3316F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4771F, -5.8045F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(55, 90).addBox(-0.5F, -1.6511F, -3.891F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3956F, 0.687F, 0.3317F, -0.0165F, -0.0057F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7998F, -3.5913F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 69).addBox(-0.5F, 1.0855F, 0.0911F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0199F, -4.8724F, 0.6807F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1336F, 20.3924F, -7.1308F, 0.8229F, 0.1298F, -0.0329F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0173F, 10.4107F, 2.5231F, -0.5947F, 0.2472F, -0.0435F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3232F, 10.7932F, -0.252F, 0.0113F, 0.3165F, 0.1985F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0365F, 0.3564F, 0.6637F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1336F, 20.3924F, -7.1308F, 0.3001F, -0.1303F, 0.0287F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0173F, 10.4107F, 2.5231F, -1.0484F, -0.2041F, 0.1214F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3232F, 10.7932F, -0.252F, 0.1349F, -0.2874F, -0.609F));

		PartDefinition opposablePinkie4 = rightArm3.addOrReplaceChild("opposablePinkie4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0365F, 0.3564F, 0.6637F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7092F, -4.1814F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 66).addBox(-0.5F, -0.1F, -9.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0894F, 2.309F, 0.8029F, 0.0F, 0.0F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0002F, 9.7011F, -3.5042F, 0.1299F, 0.0151F, -0.1737F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0002F, 9.7011F, -3.5042F, 0.1299F, -0.0151F, 0.1737F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2986F, -3.9226F, 0.4192F, 0.0399F, 0.0178F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 68).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.6F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9573F, -5.0679F, 0.5969F, 0.1212F, -0.0228F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(106, 9).addBox(-0.5F, -1.8072F, 3.6353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 7).addBox(-0.5F, -1.8072F, -0.0647F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0477F, -4.5023F, -0.2094F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2389F, -3.5283F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(28, 111).addBox(-0.5F, 0.8781F, 2.8599F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.2F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4752F, -1.9536F, -0.6913F, 0.0673F, -0.0556F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(127, 51).addBox(-0.5F, 1.1F, 2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(126, 50).addBox(-0.5F, 1.1F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5432F, -1.7319F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(114, 32).addBox(-0.475F, -1.075F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(112, 30).addBox(-0.475F, -1.075F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.484F, -2.2F, -0.2971F, 0.0501F, -0.0153F));

		PartDefinition neck7 = neck5.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8017F, -2.59F, -0.3099F, 0.1664F, -0.053F));

		PartDefinition cube_r14 = neck7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(102, 112).addBox(-0.55F, 1.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7805F, -2.5587F, -0.132F, 0.1298F, -0.0172F));

		PartDefinition cube_r15 = neck8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(111, 112).addBox(-0.525F, 1.2F, 0.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8391F, -2.701F, 0.1329F, 0.173F, 0.023F));

		PartDefinition cube_r16 = neck9.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(113, 16).addBox(-0.55F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7471F, -1.3393F, -0.2969F, 0.0334F, -0.0102F));

		PartDefinition neck6 = neck9.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8193F, -2.3991F, 0.394F, 0.0806F, 0.0335F));

		PartDefinition cube_r17 = neck6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(112, 72).addBox(-0.5F, 1.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck6.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7427F, -1.8268F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.0F, -0.7735F, -2.7839F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.0F, -0.7735F, -2.7839F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.987F, 0.1048F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(1, 33).addBox(-0.5F, 0.1791F, 0.0402F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.88F, 8.6205F, -0.1136F, -0.0434F, 0.0049F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(23, 47).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1686F, 11.0409F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(27, 33).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 43).addBox(-0.5F, 0.2F, 10.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0192F, 8.7567F, -0.0968F, -0.1303F, 0.0126F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0096F, 10.9005F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(32, 82).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 87).addBox(-0.5F, 0.2F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.0616F, 0.1307F, -0.008F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(78, 56).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0071F, 6.0019F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 65).addBox(-0.5F, 0.2F, 7.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0125F, 5.9135F, 0.0797F, 0.174F, 0.0138F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(19, 59).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0051F, 7.7751F, 0.2166F, 0.2559F, 0.0557F));

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