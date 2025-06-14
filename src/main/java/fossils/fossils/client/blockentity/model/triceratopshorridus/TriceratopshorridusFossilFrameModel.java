package fossils.fossils.client.blockentity.model.triceratopshorridus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TriceratopshorridusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart leftHand3;
	private final ModelPart leftHand2;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart rightHand3;
	private final ModelPart rightHand2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart rightLowerbeak;
	private final ModelPart frill;
	private final ModelPart frillInside;
	private final ModelPart frillInside2;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;

	public TriceratopshorridusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.leftHand3 = this.lefthand.getChild("leftHand3");
		this.leftHand2 = this.lefthand.getChild("leftHand2");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.rightHand3 = this.righthand.getChild("rightHand3");
		this.rightHand2 = this.righthand.getChild("rightHand2");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.rightLowerbeak = this.jaw.getChild("rightLowerbeak");
		this.frill = this.head.getChild("frill");
		this.frillInside = this.frill.getChild("frillInside");
		this.frillInside2 = this.frill.getChild("frillInside2");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-4.5F, -35.0F, 0.0F, 1.0F, 35.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.0F, -24.6F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(4.5F, -5.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -28.5F, -24.1F, 0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-5.0F, -8.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -33.0F, 12.5F, 0.1309F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.1F, -7.0F, -0.5F, 1.0F, 40.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -33.0F, 12.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(59, 26).addBox(-0.5F, -0.1928F, 0.3466F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -40.5666F, 13.0442F, -0.5186F, 0.1138F, -0.0647F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(55, 40).addBox(-0.5F, 1.0364F, -9.9709F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2292F, 0.3175F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 26).addBox(-0.5F, 0.8038F, 0.0069F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9527F, 9.274F, -0.2552F, 0.1267F, -0.033F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(45, 80).addBox(-0.5F, -0.1697F, -0.1085F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.038F, 10.8772F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5F, 0.597F, -0.5166F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 7).addBox(-0.5F, 0.597F, 7.1834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9193F, 7.6894F, 0.1929F, 0.1302F, 0.0138F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(99, 94).addBox(-0.5F, 0.5502F, -0.3915F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0884F, 7.6065F, 0.2443F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5F, 0.5502F, -0.6915F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(108, 6).addBox(-0.5F, 0.5502F, 6.0085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0179F, 6.8998F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(141, 8).addBox(-0.5F, 0.5502F, -0.1915F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0167F, 7.0028F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(157, 80).addBox(-0.5F, 0.5502F, -0.3915F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0254F, 5.0249F, -0.192F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9F, 1.7447F, 0.5979F, 0.6283F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0278F, -6.1546F, -0.0749F, -0.0623F, 0.1632F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.4746F, 4.142F, 0.0173F, 0.0023F, -0.1309F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2271F, -0.625F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.066F, -2.5667F, 0.1134F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9F, 1.7447F, 0.5979F, 0.7156F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0278F, -6.1546F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.4746F, 4.142F, -0.1613F, 0.1947F, -0.0915F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2271F, -0.625F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.066F, -2.5667F, 0.4625F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.2995F, 4.197F, 6.9752F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.2995F, 4.197F, 6.9752F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.1554F, -8.7886F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(80, 38).addBox(-0.5F, -0.3073F, -8.6534F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.3064F, 0.784F, -0.0087F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3934F, -7.8073F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(102, 85).addBox(-0.5F, 0.8921F, -7.0367F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8393F, 0.9991F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3344F, -5.6743F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 56).addBox(-0.5F, 0.8921F, -8.0367F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9197F, 0.946F, 0.2182F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5039F, -6.6829F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 65).addBox(-0.5F, 0.093F, 0.5333F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7206F, -8.2449F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.7231F, 16.643F, -7.4654F, 0.6079F, 0.0774F, -0.4019F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7272F, 10.9543F, 3.6173F, -0.556F, -0.5958F, 1.607F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.311F, 9.5155F, -2.2489F, 1.855F, 0.9821F, -0.5813F));

		PartDefinition leftHand3 = lefthand.addOrReplaceChild("leftHand3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -2.5899F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftHand2 = lefthand.addOrReplaceChild("leftHand2", CubeListBuilder.create(), PartPose.offset(-0.5013F, 0.5347F, -2.5899F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.7231F, 16.643F, -7.4654F, 0.0882F, 0.0227F, 0.2588F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7272F, 10.9543F, 3.6173F, -0.1788F, 0.8434F, -0.7877F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.311F, 9.5155F, -2.2489F, 0.8514F, -0.9821F, 0.5813F));

		PartDefinition rightHand3 = righthand.addOrReplaceChild("rightHand3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5013F, 0.5347F, -2.5899F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightHand2 = righthand.addOrReplaceChild("rightHand2", CubeListBuilder.create(), PartPose.offset(0.5013F, 0.5347F, -2.5899F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 9.6298F, -11.4532F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 9.6298F, -11.4532F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3164F, -7.3877F, 0.0268F, -0.2181F, -0.0058F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 88).addBox(-0.5F, -0.1F, -6.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2784F, -0.6034F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9881F, -6.7892F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(104, 56).addBox(-0.5F, -0.4F, -5.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6244F, -5.8352F, -0.132F, -0.1298F, 0.0172F));

		PartDefinition cube_r12 = neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, 66).addBox(-0.5F, -0.4F, -8.3F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.6468F, -6.0301F, 0.6405F, 0.1457F, 0.5255F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0325F, -2.1434F, -6.491F, -0.9894F, -0.4609F, -0.5684F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0325F, -2.1434F, -6.491F, -0.9894F, 0.4609F, 0.5684F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.041F, 7.113F, -24.3223F, 0.0503F, 0.1188F, -0.0879F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.041F, 7.113F, -24.3223F, 0.0503F, -0.1188F, 0.0879F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(4.3F, 0.487F, -8.6F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-4.3F, 0.487F, -8.6F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 2.6071F, -1.8145F, -0.48F, 0.0F, 0.0F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4028F, 14.5349F, -11.1504F, 0.4796F, -0.0201F, 0.0387F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7971F, 14.5349F, -11.1504F, 0.4796F, 0.0201F, -0.0387F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offset(0.0F, -9.09F, -0.6378F));

		PartDefinition frillInside = frill.addOrReplaceChild("frillInside", CubeListBuilder.create(), PartPose.offset(7.0985F, -1.9616F, 5.6114F));

		PartDefinition frillInside2 = frill.addOrReplaceChild("frillInside2", CubeListBuilder.create(), PartPose.offset(-7.0985F, -1.9616F, 5.6114F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4918F, 0.2295F, 8.3538F, -0.2641F, -0.2268F, 0.1616F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4918F, 0.2295F, 8.3538F, -0.2641F, 0.2268F, -0.1616F));

		return LayerDefinition.create(meshdefinition, 184, 184);
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