package fossils.fossils.client.blockentity.model.glossotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GlossotheriumFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
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
	private final ModelPart body6;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart leftArm8;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;
	private final ModelPart rightArm8;
	private final ModelPart tail;
	private final ModelPart tail8;
	private final ModelPart tail2;
	private final ModelPart tail4;
	private final ModelPart tail9;
	private final ModelPart tail3;
	private final ModelPart tail10;

	public GlossotheriumFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
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
		this.body6 = this.body2.getChild("body6");
		this.chest = this.body6.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm3.getChild("leftArm5");
		this.leftArm7 = this.leftArm3.getChild("leftArm7");
		this.leftArm6 = this.leftArm3.getChild("leftArm6");
		this.leftArm8 = this.leftArm3.getChild("leftArm8");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm3.getChild("rightArm5");
		this.rightArm7 = this.rightArm3.getChild("rightArm7");
		this.rightArm6 = this.rightArm3.getChild("rightArm6");
		this.rightArm8 = this.rightArm3.getChild("rightArm8");
		this.tail = this.hips.getChild("tail");
		this.tail8 = this.tail.getChild("tail8");
		this.tail2 = this.tail8.getChild("tail2");
		this.tail4 = this.tail2.getChild("tail4");
		this.tail9 = this.tail4.getChild("tail9");
		this.tail3 = this.tail9.getChild("tail3");
		this.tail10 = this.tail3.getChild("tail10");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -27.0F, 21.0F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(3.6F, -7.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.7F, -21.5F, -17.1F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.6F, -1.5F, -0.5F, 1.0F, 23.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.7F, -21.5F, -17.1F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(2.5F, -7.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -23.0F, 21.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.2233F, 16.8426F, 0.4385F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.875F, 0.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5627F, -1.9442F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5F, 0.7443F, 0.4247F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.977F, 6.3211F, -1.8342F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.977F, 6.3211F, -1.8342F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2846F, 11.498F, -1.6205F, -1.0978F, -0.1659F, -0.0354F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.868F, 12.9712F, 2.1901F, -0.8526F, 0.0425F, 0.1238F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7634F, 0.531F, 6.6516F, -0.8833F, -1.46F, -0.615F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -0.5432F, 2.7821F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2846F, 11.498F, -1.6205F, -0.6583F, 0.2063F, 0.0522F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.868F, 12.9712F, 2.1901F, -0.7653F, -0.0425F, -0.1238F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7657F, 0.5525F, 6.6489F, -3.1403F, 0.9759F, -1.6718F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, -0.5432F, 2.7821F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4323F, -6.9906F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 33).addBox(-0.5F, 0.905F, 0.323F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.612F, -5.2997F, -0.3142F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -3.3176F, -5.237F, -0.0262F, -0.0436F, 0.0011F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 1.0939F, 0.1192F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body5 = body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.2411F, -6.9487F, -0.0087F, -0.0436F, 0.0004F));

		PartDefinition cube_r8 = body5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, 0.05F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0523F, -0.0018F, 0.0349F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, -3.8751F, 0.1136F, -0.0434F, -0.0049F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(34, 42).addBox(-0.5F, -0.95F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1F, 1.2336F, -2.4389F, 0.0522F, 0.0129F, 0.0881F));

		PartDefinition body6 = body2.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.578F, -5.0888F, -0.1962F, -0.0772F, 0.0596F));

		PartDefinition cube_r10 = body6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(70, 77).addBox(-0.5F, 0.9849F, -7.1382F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4366F, 3.9777F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body6.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1669F, -2.5223F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 58).addBox(-0.5F, 0.1F, -5.075F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, 1.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2851F, -2.9861F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = chest2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(69, 33).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(66, 30).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8963F, -0.3893F, 0.4712F, 0.0F, 0.0F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1009F, -3.5656F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(106, 31).addBox(-0.5F, 1.7F, 1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2195F, -2.6473F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(79, 27).addBox(-0.5F, 0.8F, -3.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0626F, -3.542F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 98).addBox(-0.5F, 1.4742F, -0.1591F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5182F, -4.5372F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1191F, -2.6956F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 6.8548F, 0.3631F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 6.8548F, 0.3631F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2093F, -0.9803F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.082F, 3.9151F, -0.5982F, 0.0261F, 0.2438F, -0.0725F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.082F, 3.9151F, -0.5982F, 0.0261F, -0.2438F, 0.0725F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3386F, 8.5112F, -4.4107F, -0.5127F, 0.2682F, -0.1405F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4839F, -0.8967F, 9.9025F, -0.1165F, -0.5421F, -0.257F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.402F, 10.6523F, 1.767F, -1.6215F, 0.9544F, -1.6231F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4923F, 2.6871F, -0.008F, -0.9871F, -1.1507F, 1.2138F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4267F, 2.8885F, 0.0914F, -0.4659F, 0.1198F, -0.0721F));

		PartDefinition leftArm7 = leftArm3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, 0.5236F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0788F, 3.3893F, 1.957F, -0.1544F, 0.1589F, 0.0267F));

		PartDefinition leftArm8 = leftArm3.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1755F, 1.0282F, -0.318F, -0.5512F, 0.0723F, -0.2053F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.3386F, 8.5112F, -4.4107F, -1.2544F, -0.2682F, 0.1405F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4839F, -0.8967F, 9.9025F, 0.3611F, 0.4308F, 0.2468F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.402F, 10.6523F, 1.767F, -1.5247F, -0.7801F, 1.6107F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4923F, 2.6871F, -0.008F, -1.2053F, 1.1507F, -1.2138F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4267F, 2.8885F, 0.0914F, -0.4796F, -0.0201F, 0.2667F));

		PartDefinition rightArm7 = rightArm3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, -0.5236F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0788F, 3.3893F, 1.957F, -0.1946F, -0.1054F, 0.2767F));

		PartDefinition rightArm8 = rightArm3.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1755F, 1.0282F, -0.318F, -0.5512F, -0.0723F, 0.2053F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 77).addBox(-0.5F, 0.7433F, 0.3971F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.4458F, 4.8631F, -0.903F, 0.0813F, -0.1027F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1939F, 3.8622F, -0.1584F, 0.1293F, -0.0206F));

		PartDefinition cube_r16 = tail8.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.075F, 1.5F, 0.5F, 0.0F, 0.0218F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(70, 70).addBox(-0.5F, 0.525F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0444F, 3.9545F, -0.0964F, 0.0869F, -0.0084F));

		PartDefinition tail4 = tail2.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 3).addBox(-0.5F, -1.5F, 3.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.0F, 4.0F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition tail9 = tail4.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0961F, 3.5324F, -0.0088F, 0.0873F, -0.0008F));

		PartDefinition cube_r17 = tail9.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(97, 6).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.05F, 1.1F, 0.6F, 0.0F, 0.0305F, 0.0F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(93, 96).addBox(-0.5F, 0.6F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0006F, 2.756F, 0.1139F, 0.0867F, 0.0099F));

		PartDefinition tail10 = tail3.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(9, 59).addBox(-0.5F, -0.2982F, -0.1829F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8982F, 2.7829F, 0.2628F, 0.0843F, 0.0226F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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