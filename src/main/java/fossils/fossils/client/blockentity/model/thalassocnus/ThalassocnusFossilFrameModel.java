package fossils.fossils.client.blockentity.model.thalassocnus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThalassocnusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
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
	private final ModelPart tail9;
	private final ModelPart tail3;
	private final ModelPart tail10;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public ThalassocnusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.3F, 15.0F, 0.4385F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 7).addBox(-1.9F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 9.0066F, -1.1247F, -1.5708F, 0.5411F, 1.5708F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, -11.2057F, 0.0747F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.7943F, 0.0747F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.277F, 6.3211F, -1.8342F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.277F, 6.3211F, -1.8342F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1349F, 7.0171F, 1.5445F, -0.0756F, -0.1726F, -0.1341F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7591F, 15.4939F, 1.6892F, 0.2383F, 0.0425F, 0.1238F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -3.2F, 12.4F, -1.7396F, -1.0849F, 0.1496F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1349F, 5.3171F, -1.2805F, -0.4683F, 0.1726F, 0.1341F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0202F, 15.1505F, 4.9579F, -0.1981F, -0.0425F, -0.1238F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -3.2F, 12.4F, -1.7396F, 1.0849F, -0.1496F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2544F, -6.6999F, 0.0F, 0.0436F, -0.0019F));

		PartDefinition cube_r4 = body4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(43, 10).addBox(-0.5F, 0.93F, 0.073F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.7243F, -5.3349F, -0.3142F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -2.43F, -5.2721F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, 33).addBox(-0.5F, 1.0939F, 0.1442F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body5 = body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.2411F, -6.9487F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 76).addBox(-0.5F, 0.0F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, -3.8751F, 0.1136F, 0.0434F, 0.0049F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, 0.0F, -8.9F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1989F, -5.0852F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(73, 69).addBox(-0.5F, 0.9599F, -4.1382F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body6 = body.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9F, -3.4F));

		PartDefinition cube_r9 = body6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(96, 57).addBox(-0.5F, 0.9599F, -7.1382F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 3.6F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body6.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2035F, -2.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 67).addBox(-2.5F, -0.5F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.9377F, -4.4146F, 1.5708F, -0.0436F, 1.5708F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(43, 80).addBox(-0.5F, 0.0F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 2.4648F, -5.154F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 77).addBox(-0.5F, 0.1F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, 1.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0851F, -3.6861F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = chest2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(75, 6).addBox(-0.5F, 0.1F, -8.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.9F, 4.8F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0705F, -3.0326F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(1, 94).addBox(-0.5F, 0.9F, 1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2195F, -2.6473F, -0.0732F, 0.3047F, -0.022F));

		PartDefinition cube_r15 = neck2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 21).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 18).addBox(-0.5F, 0.0F, -3.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9626F, -3.942F, -0.2707F, 0.2279F, 0.0319F));

		PartDefinition cube_r16 = neck.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(107, 37).addBox(-0.5F, 0.2742F, -2.0341F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6428F, -2.5474F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(1, 75).addBox(-0.4F, 0.8742F, 0.1409F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.9F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.85F, -3.6397F, -0.8681F, 0.3674F, -0.0235F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 7.3281F, 0.4418F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 7.3281F, 0.4418F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8826F, -1.9015F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9775F, 2.3985F, -0.7656F, -0.0232F, 0.2166F, -0.1339F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9775F, 2.3985F, -0.7656F, -0.0232F, -0.2166F, 0.1339F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.1089F, 5.7158F, -4.6131F, -1.3921F, 0.3328F, -0.3103F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0686F, -0.6775F, 10.6941F, 0.5803F, -0.2518F, 0.1449F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5463F, 14.733F, -0.8162F, -0.0385F, -0.2148F, 0.3968F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4923F, 2.6871F, -0.008F, 0.32F, -1.4315F, 0.32F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5089F, 3.1492F, 0.4F, 0.0F, 0.0F, 0.5236F));

		PartDefinition leftArm7 = leftArm3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, 0.5236F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0268F, 2.7441F, 2.898F, 0.2314F, -0.084F, 0.6939F));

		PartDefinition leftArm8 = leftArm3.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1755F, 1.0282F, -0.318F, -0.5512F, 0.0723F, -0.2053F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.1089F, 5.7158F, -4.6131F, -0.8262F, -0.326F, 0.4631F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0686F, -0.6775F, 10.6941F, 0.1577F, 0.3027F, -0.412F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5463F, 14.733F, -0.8162F, -0.0193F, 0.2173F, -0.3075F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4923F, 2.6871F, -0.008F, 0.32F, 1.4315F, -0.32F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5089F, 3.1492F, 0.4F, 0.0F, 0.0F, -0.5236F));

		PartDefinition rightArm7 = rightArm3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, -0.5236F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0268F, 2.7441F, 2.898F, 0.2314F, 0.084F, -0.6939F));

		PartDefinition rightArm8 = rightArm3.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1755F, 1.0282F, -0.318F, -0.5512F, -0.0723F, 0.2053F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(60, 76).addBox(-0.5F, 0.0933F, -0.0029F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.4153F, 6.252F, -0.637F, 0.0F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(14, 75).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1933F, 3.8971F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(55, 45).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.1456F, 4.0016F, 0.0089F, -0.1745F, -0.0015F));

		PartDefinition tail9 = tail2.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(75, 51).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0532F, -0.1743F, 0.0092F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(87, 6).addBox(-0.5F, -0.15F, -0.35F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 9).addBox(-0.5F, -0.15F, 3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1072F, -0.217F, 0.0232F));

		PartDefinition tail10 = tail3.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(60, 99).addBox(-0.5F, -1.5482F, 3.5421F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 1.3982F, 0.3829F));

		PartDefinition tail4 = tail10.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(62, 61).addBox(-0.5F, 0.4F, -0.125F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 65).addBox(-0.5F, 0.4F, 4.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9949F, 6.3901F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(75, 58).addBox(-0.5F, 0.3F, 0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0138F, 4.9732F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(26, 76).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 80).addBox(-0.5F, 0.3F, 4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.1724F, -0.3051F, 0.0138F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(95, 51).addBox(-0.5F, 0.3F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.2185F, -0.1816F, 0.1359F));

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