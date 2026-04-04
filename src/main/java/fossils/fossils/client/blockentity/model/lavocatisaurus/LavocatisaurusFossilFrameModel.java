package fossils.fossils.client.blockentity.model.lavocatisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LavocatisaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bodymiddle;
	private final ModelPart body;
	private final ModelPart bodyfront;
	private final ModelPart chest;
	private final ModelPart neckbase;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neckmiddlebase;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neckmiddlefront;
	private final ModelPart neck5;
	private final ModelPart neckfront;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart tail13;
	private final ModelPart tail14;
	private final ModelPart tail15;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg8;

	public LavocatisaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bodymiddle = this.hips.getChild("bodymiddle");
		this.body = this.bodymiddle.getChild("body");
		this.bodyfront = this.body.getChild("bodyfront");
		this.chest = this.bodyfront.getChild("chest");
		this.neckbase = this.chest.getChild("neckbase");
		this.neck = this.neckbase.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neckmiddlebase = this.neck2.getChild("neckmiddlebase");
		this.neck3 = this.neckmiddlebase.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neckmiddlefront = this.neck4.getChild("neckmiddlefront");
		this.neck5 = this.neckmiddlefront.getChild("neck5");
		this.neckfront = this.neck5.getChild("neckfront");
		this.neck6 = this.neckfront.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftArm = this.bodyfront.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.bodyfront.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.bone = this.bodyfront.getChild("bone");
		this.bone3 = this.bodyfront.getChild("bone3");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.tail13 = this.tail12.getChild("tail13");
		this.tail14 = this.tail13.getChild("tail14");
		this.tail15 = this.tail14.getChild("tail15");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg3 = this.leftLeg.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg8 = this.leftLeg4.getChild("leftLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg3 = this.rightLeg.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg8 = this.rightLeg4.getChild("rightLeg8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.6F, -31.0F, 8.9F, 1.0F, 31.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-4.75F, -8.9F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4F, -26.25F, -13.5F, 0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -5.75F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.4F, -26.25F, -13.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-2.1F, -7.5F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -30.5F, 9.4F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -23.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0499F, 11.6579F, -0.2632F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 35).addBox(-0.5F, -1.007F, 0.1001F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bodymiddle = hips.addOrReplaceChild("bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -7.7F, 0.2155F, -0.0853F, -0.0186F));

		PartDefinition cube_r5 = bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 84).addBox(-0.5F, 0.9372F, 12.9492F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9957F, -18.7643F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body = bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0339F, -5.9274F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, 0.9372F, 4.9492F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6928F, -10.735F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0376F, -5.8204F, 0.1725F, -0.129F, -0.0224F));

		PartDefinition cube_r7 = bodyfront.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.5749F, 5.9699F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7111F, -11.8942F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1664F, -5.8252F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(72, 84).addBox(-0.5F, -0.5749F, -0.2301F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4552F, -6.0689F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neckbase = chest.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1995F, -6.0205F, -0.1581F, -0.1283F, 0.0262F));

		PartDefinition cube_r9 = neckbase.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(118, 14).addBox(-0.5F, 0.0F, 7.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2505F, -10.7942F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck = neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, 1.1248F, -2.8694F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(101, 106).addBox(-0.5F, 0.0F, 3.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8768F, -7.9446F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.0F, -0.0421F, -0.2559F, 0.0557F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(118, 20).addBox(-0.5F, 0.0F, 0.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7768F, -3.9446F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neckmiddlebase = neck2.addOrReplaceChild("neckmiddlebase", CubeListBuilder.create().texOffs(78, 110).addBox(-0.5F, -0.9461F, -4.0082F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1562F, -3.0466F, -0.1262F, 0.0F, 0.0F));

		PartDefinition neck3 = neckmiddlebase.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(107, 47).addBox(-0.5152F, -0.6532F, -4.1887F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(110, 50).addBox(-0.5152F, -0.6532F, -0.5887F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0152F, -0.3428F, -4.1945F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(109, 26).addBox(-0.801F, -0.6896F, -4.331F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1858F, 0.0613F, -3.7827F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neckmiddlefront = neck4.addOrReplaceChild("neckmiddlefront", CubeListBuilder.create().texOffs(106, 80).addBox(-0.5F, -0.9454F, -3.913F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.201F, 0.263F, -4.1052F, -0.2819F, 0.0F, 0.0F));

		PartDefinition neck5 = neckmiddlefront.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(111, 35).addBox(-0.5152F, -1.3013F, -4.701F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(109, 33).addBox(-0.5152F, -1.1513F, -3.701F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0152F, 0.1578F, -3.8992F, -0.3054F, 0.0F, 0.0F));

		PartDefinition neckfront = neck5.addOrReplaceChild("neckfront", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5F, 0.7538F, -4.3931F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0152F, -2.0813F, -4.0382F, -0.0108F, 0.0F, 0.0F));

		PartDefinition neck6 = neckfront.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0788F, -3.8931F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 117).addBox(-0.5F, -0.3118F, -0.2099F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.075F, 1.3366F, -4.0142F, 0.1047F, -0.0174F, -0.0018F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0282F, 0.3037F, -4.1032F, 0.0595F, -0.1698F, -0.0961F));

		PartDefinition cube_r13 = neck7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(125, 107).addBox(-0.5F, -0.3641F, -0.2071F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0282F, 1.3674F, -2.5935F, 0.1047F, -0.0087F, -0.0009F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0282F, 0.3713F, -2.8968F, 0.1139F, -0.0867F, -0.0099F));

		PartDefinition cube_r14 = neck8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(128, 0).addBox(-0.5F, 0.2F, -9.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.275F, 7.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6696F, -2.9711F, 0.4342F, -0.0829F, -0.1337F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 2.1914F, -0.9513F, 0.1833F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.6354F, -0.3301F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.6354F, -0.3301F));

		PartDefinition leftArm = bodyfront.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 9.0647F, -8.6888F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0921F, 10.6791F, -5.4788F, -0.5149F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 8.2253F, -1.2163F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm = bodyfront.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 9.0647F, -8.6888F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0921F, 10.6791F, -5.4788F, -0.9076F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 8.2253F, -1.2163F, 0.384F, 0.0F, 0.0F));

		PartDefinition bone = bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7F, -0.0199F, -6.1909F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone3 = bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7F, -0.0199F, -6.1909F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(55, 11).addBox(-0.5F, -0.118F, -0.1489F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6992F, 2.0273F, 0.2237F, 0.0536F, -0.0305F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(37, 0).addBox(-0.5F, 0.8226F, 0.0231F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9523F, 7.9957F, -0.1449F, 0.0868F, -0.0088F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(52, 35).addBox(-0.5F, 0.8226F, 0.0231F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.0704F, 0.1306F, -0.0092F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition cube_r15 = tail4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(45, 67).addBox(-0.5F, -0.1F, 7.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 60).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8226F, -0.0769F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, 0.6226F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(57, 68).addBox(-0.5F, 0.6226F, -0.2769F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 75).addBox(-0.5F, 0.6226F, 7.4231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.0352F, -0.1308F, 0.0046F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, 0.6226F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0177F, -0.1745F, -0.0031F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(38, 71).addBox(-0.5F, 0.6226F, -0.2769F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 78).addBox(-0.5F, 0.6226F, 7.4231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0054F, 7.8751F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(73, 31).addBox(-0.5F, 0.0226F, -0.1769F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(80, 38).addBox(-0.5F, 0.0226F, 7.5231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 8.0F, 0.2711F, -0.0864F, -0.0122F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(73, 41).addBox(-0.5F, 0.0226F, -0.1769F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(80, 48).addBox(-0.5F, 0.0226F, 7.5231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.29F, -0.1643F, 0.0276F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(75, 9).addBox(-0.5F, 0.0226F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.1132F, 0.1745F, -0.0031F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(19, 76).addBox(-0.5F, 0.5226F, -0.1769F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 8.0F, -0.1144F, 0.1301F, -0.0149F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(76, 68).addBox(-0.5F, 0.5226F, -0.3769F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(83, 75).addBox(-0.5F, 0.5226F, 7.0231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.1772F, 0.1719F, -0.0306F));

		PartDefinition tail14 = tail13.addOrReplaceChild("tail14", CubeListBuilder.create().texOffs(77, 19).addBox(-0.5F, 0.5226F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.2679F, 0.2106F, -0.0573F));

		PartDefinition tail15 = tail14.addOrReplaceChild("tail15", CubeListBuilder.create().texOffs(34, 90).addBox(-0.5F, 0.5226F, -0.0769F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.3079F, 0.1248F, -0.0396F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.9814F, 6.4456F, -5.795F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.9814F, 6.4456F, -5.795F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, 2.331F, -2.8155F, 1.309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 7.302F, -13.865F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0067F, 1.795F, -10.7521F, -0.2062F, -0.0163F, 0.0386F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9F, 2.331F, -2.8155F, 1.5272F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 7.302F, -13.865F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0067F, 1.795F, -10.7521F, 0.1865F, 0.0163F, -0.0386F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

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