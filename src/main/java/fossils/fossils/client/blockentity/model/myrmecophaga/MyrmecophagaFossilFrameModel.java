package fossils.fossils.client.blockentity.model.myrmecophaga;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MyrmecophagaFossilFrameModel extends SkullModelBase {
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
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart Hyoid;
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
	private final ModelPart tail10;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public MyrmecophagaFossilFrameModel(ModelPart root) {
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
		this.chest = this.body.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.Hyoid = this.neck3.getChild("Hyoid");
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
		this.tail10 = this.tail3.getChild("tail10");
		this.tail4 = this.tail10.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -34.0F, 16.0F, 1.0F, 34.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-0.5F, -32.6F, -19.7F, 1.0F, 33.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(0.9F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(5.0F, -6.5F, 35.2F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -24.5F, -19.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.0258F, 15.2747F, 0.325F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.4943F, -0.3253F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.777F, 6.3211F, -1.8342F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.777F, 6.3211F, -1.8342F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0123F, 4.8795F, -1.0744F, -0.8335F, -0.0254F, 0.0279F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8106F, 16.7832F, 2.0167F, -0.7205F, 0.0194F, -0.0085F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3445F, -0.3242F, 14.1706F, -1.7275F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4216F, -1.6F, 1.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0123F, 4.8795F, -1.0744F, -0.4408F, 0.0254F, -0.0279F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8106F, 16.7832F, 2.0167F, -0.8514F, -0.0194F, 0.0085F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3445F, -0.3242F, 14.1706F, -1.6839F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4216F, -1.6F, 1.9F, -0.48F, 0.0F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5544F, -6.3999F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body4.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 41).addBox(-0.5F, 0.63F, -0.1269F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.4115F, -5.6215F, -0.3142F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -2.1172F, -5.5588F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 41).addBox(-0.5F, 0.7939F, -0.0558F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body5 = body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offset(-0.9233F, -0.2411F, -6.9487F));

		PartDefinition cube_r5 = body5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(93, 72).addBox(-0.5F, -0.9051F, 3.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 69).addBox(-0.5F, -0.9051F, -0.1763F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8253F, -4.1862F, 0.048F, 0.0F, 0.0F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, -3.8751F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 62).addBox(-0.5F, -0.3F, -9.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1989F, -5.0852F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 92).addBox(-0.5F, 0.6599F, -4.1882F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7517F, -3.3312F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(72, 35).addBox(-0.5F, -0.779F, 4.5109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 31).addBox(-0.5F, -0.779F, -0.1891F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.6048F, -4.6294F, 0.4189F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9885F, -4.5641F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chest2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 97).addBox(-0.5F, -0.2F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.5F, 5.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4705F, -2.3326F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(51, 103).addBox(-0.5F, -0.9013F, 2.4758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 101).addBox(-0.5F, -0.9013F, -0.2242F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7324F, -2.8908F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Hyoid = neck3.addOrReplaceChild("Hyoid", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6504F, 3.3564F, 0.3612F, 0.2184F, 0.0426F, 0.0094F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2195F, -2.6473F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(84, 91).addBox(-0.5F, -0.3F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1626F, -4.242F, -0.0086F, 0.043F, 0.0072F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(77, 79).addBox(-0.5F, 0.4F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7058F, -2.4026F, 0.5236F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.475F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r13 = neck4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 50).addBox(-0.5F, 0.4F, -2.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7058F, -2.4026F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.807F, -5.0724F, -0.3097F, 0.0537F, 0.1662F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 7.5262F, 1.6254F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 7.5262F, 1.6254F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 3.7807F, -0.218F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6566F, 1.5832F, 0.1906F, 0.3489F, -0.1085F, 0.0335F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6566F, 1.5832F, 0.1906F, 0.3489F, 0.1085F, -0.0335F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2206F, 6.9587F, -2.5575F, -0.3141F, 0.251F, -0.2035F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3202F, -0.8877F, 10.1423F, 0.385F, 0.0706F, 0.3709F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2185F, 15.3578F, -1.2133F, 0.1319F, 1.0152F, 0.0303F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0551F, 7.9965F, -0.7F, 0.0F, 0.0F, 1.4835F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2206F, 6.9587F, -2.5575F, -1.0995F, -0.251F, 0.2035F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3202F, -0.8877F, 10.1423F, 0.4132F, -0.1151F, -0.2017F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2185F, 15.3578F, -1.2133F, 0.7149F, -0.8061F, -0.7527F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0551F, 7.9965F, -0.7F, 0.0F, 0.0436F, -1.7453F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 89).addBox(-0.5F, -0.2067F, -0.7029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 92).addBox(-0.5F, -0.2067F, 2.9971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.3614F, 4.4707F, -0.6196F, 0.0F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(88, 79).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(91, 82).addBox(-0.5F, -0.4F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1933F, 3.8971F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.3F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.122F, 3.9753F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail2.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(81, 22).addBox(-0.5F, 0.6986F, -0.1477F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0079F, 4.9003F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(82, 51).addBox(-0.5F, 0.6945F, -0.3955F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(85, 54).addBox(-0.5F, 0.6945F, 3.3045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0014F, 4.0523F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail10 = tail3.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(97, 39).addBox(-0.5F, 0.7018F, 0.1171F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, -0.0073F, 3.8874F));

		PartDefinition tail4 = tail10.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(65, 17).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4051F, 2.9901F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(68, 24).addBox(-0.5F, 0.3F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(72, 28).addBox(-0.5F, 0.3F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0138F, 4.9732F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(67, 49).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(26, 65).addBox(-0.5F, 0.3F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 140, 140);
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