package fossils.fossils.client.blockentity.model.nesodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NesodonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart chest;
	private final ModelPart neck2;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public NesodonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.chest = this.body7.getChild("chest");
		this.neck2 = this.chest.getChild("neck2");
		this.leftarm = this.neck2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.neck2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.bone2 = this.neck2.getChild("bone2");
		this.bone3 = this.neck2.getChild("bone3");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -28.0F, 20.1F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -3.35F, -0.5F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.4F, -22.65F, -19.2F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-3.35F, -8.5F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4F, -22.65F, -19.2F, 0.1047F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-3.0F, -5.9F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -25.5F, 20.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.2442F, 19.0612F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 35).addBox(-0.5F, 0.6014F, -1.1611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 5.596F, 0.1102F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.7144F, -1.4208F, 0.8988F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 10.1167F, -0.9736F, -1.5795F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.0765F, 1.0456F, -0.48F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 5.596F, 0.1102F, -0.637F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.7144F, -1.4208F, 0.9425F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 10.1167F, -0.9736F, -1.4486F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.0765F, 1.0456F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9869F, 4.5433F, 1.2457F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9869F, 4.5433F, 1.2457F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, 0.5487F, 8.7974F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9395F, -4.5739F, -0.2532F, -0.0872F, 0.0038F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.275F, -3.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6019F, -4.966F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 51).addBox(-0.5F, 0.7148F, -0.6846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 48).addBox(-0.5F, 0.7148F, -4.3846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9506F, -3.8712F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 54).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7688F, -3.7471F, -0.0131F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(44, 58).addBox(-0.5F, 0.2938F, -4.3721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 61).addBox(-0.5F, 0.2938F, -0.6721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, 0.2688F, -4.1471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(55, 60).addBox(-0.5F, 0.2688F, -3.8721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body7.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0536F, -3.8395F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(57, 4).addBox(-0.5F, -1.208F, 6.99F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3104F, -3.4549F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 85).addBox(-0.5F, -0.6463F, -0.1077F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.05F, 0.4596F, -2.7544F, -0.1047F, 0.0174F, -0.0018F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1975F, 4.4288F, -5.5793F, -0.0202F, 0.1296F, -0.0892F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 10.0027F, 2.5598F, -0.733F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 8.3947F, -0.0836F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1722F, -0.2105F, -0.2531F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0765F, 4.2923F, 0.7328F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1975F, 4.4288F, -5.5793F, -0.4928F, -0.041F, 0.1626F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 10.0027F, 2.5598F, -0.8176F, 0.013F, 0.0166F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 8.3947F, -0.0836F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1722F, -0.2105F, -0.2107F, 0.0027F, -0.0102F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0765F, 4.2923F, 0.7328F, 0.2867F, 0.085F, -0.092F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9082F, 3.8271F, -4.0787F, -0.3043F, -0.0262F, -0.0832F));

		PartDefinition bone3 = neck2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9082F, 3.8271F, -4.0787F, -0.3043F, 0.0262F, 0.0832F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1796F, -3.1233F, -0.2548F, -0.128F, 0.0274F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 88).addBox(-0.5F, 0.0834F, 2.1406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(16, 86).addBox(-0.5F, 0.0834F, -0.5594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -2.3993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(43, 86).addBox(-0.5F, 0.075F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 88).addBox(-0.5F, 0.075F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0852F, -2.6688F, -0.3246F, -0.0299F, 0.054F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(39, 35).addBox(-0.5F, 0.1F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0125F, -2.9567F, -0.2705F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2759F, -3.9889F, -0.4302F, -0.1312F, 0.1513F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.425F, 8.7298F, -7.7083F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.425F, 8.7298F, -7.7083F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1989F, 7.9935F, -6.7648F, -0.0525F, 0.1091F, 0.0817F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1989F, 7.9935F, -6.7648F, -0.0525F, -0.1091F, -0.0817F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.7293F, -2.2951F, 1.3963F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(88, 52).addBox(-0.5F, 0.55F, -0.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 54).addBox(-0.5F, 0.55F, 2.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2964F, 0.0845F, -0.6021F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(117, 35).addBox(-0.5F, 0.5F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.031F, 2.9564F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(88, 64).addBox(-0.5F, 0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0513F, 2.0655F, -0.1833F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(89, 12).addBox(-0.5F, 0.3807F, -0.124F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1095F, 2.7879F, -0.3403F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(34, 95).addBox(-0.5F, 0.6057F, -0.024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2316F, 2.8957F, -0.384F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(22, 63).addBox(-0.5F, 0.6807F, -0.174F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 66).addBox(-0.5F, 0.6807F, 3.526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.075F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(34, 90).addBox(-0.5F, 0.6807F, 0.076F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 132, 132);
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