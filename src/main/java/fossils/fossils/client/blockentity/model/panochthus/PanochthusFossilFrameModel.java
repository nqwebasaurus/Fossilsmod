package fossils.fossils.client.blockentity.model.panochthus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PanochthusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body5;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public PanochthusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm7 = this.leftLeg3.getChild("leftArm7");
		this.leftArm6 = this.leftArm7.getChild("leftArm6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm7 = this.rightLeg3.getChild("rightArm7");
		this.rightArm6 = this.rightArm7.getChild("rightArm6");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body5 = this.body2.getChild("body5");
		this.body = this.body5.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.15F, -6.7F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.025F, -12.3F, -10.8F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(2.2F, -8.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.025F, -12.3F, -10.8F, -0.1396F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-2.3F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.025F, -15.8F, 4.2F, -0.0524F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -5.2F, -0.5F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.025F, -15.8F, 4.2F, 0.0F, -0.0524F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.2608F, 7.7124F, 0.4385F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 111).addBox(-0.5F, 1.3F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(63, 110).addBox(-0.5F, 1.3F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.4322F, -5.1098F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(92, 105).addBox(-0.5F, 0.75F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(92, 105).addBox(-0.5F, 0.75F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8366F, -1.407F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 75).addBox(-0.5F, -0.2F, -0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.015F, 0.9344F, -1.696F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, 2.6076F, -7.2164F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0378F, 2.952F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 108).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.2433F, 0.6299F, -0.8814F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.8565F, 4.7946F, -2.9189F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.8565F, 4.7946F, -2.9189F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8696F, 1.306F, -3.1694F, -0.184F, -0.3741F, 0.0838F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9073F, 12.2378F, -3.8723F, 1.4549F, 0.5531F, 0.3419F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5503F, 4.8167F, -3.7678F, -2.3988F, -0.3585F, 0.3504F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 1.8182F, 0.0204F, 0.2725F, -0.008F, 0.0104F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8696F, 1.306F, -3.1694F, -0.664F, 0.3741F, -0.0838F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9073F, 12.2378F, -3.8723F, 1.2803F, -0.5531F, -0.3419F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5503F, 4.8167F, -3.7678F, -2.0061F, 0.3585F, -0.3504F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 1.8182F, 0.0204F, 0.447F, 0.008F, -0.0104F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3337F, -5.209F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, -0.2F, -5.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.577F, -0.6266F, -0.2531F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -1.33F, -5.2721F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 104).addBox(-0.5F, 0.8189F, 3.6442F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.0965F, -2.8954F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(52, 78).addBox(-0.5F, -0.3F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body5 = body2.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -4.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(99, 28).addBox(-0.5F, -0.3F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body5.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1007F, -4.0019F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(29, 96).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.0963F, -2.6021F, 0.5541F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(7, 129).addBox(-0.5F, 0.6599F, -2.1382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5569F, 4.6449F, 0.8843F, -0.219F, -0.0852F, 0.0189F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5569F, 4.6449F, 0.8843F, -0.219F, 0.0852F, -0.0189F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7679F, -3.1309F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(131, 97).addBox(-0.5F, -0.8F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(130, 96).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.8833F, -1.2454F, 0.576F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1676F, 5.4007F, 0.1914F, -1.5954F, 0.3285F, -0.2644F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1397F, -0.9011F, 8.7672F, 0.2184F, 0.5677F, -0.1971F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6054F, 5.3293F, 0.1577F, -0.6666F, 0.4024F, -1.0618F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1676F, 5.4007F, 0.1914F, -2.2062F, -0.3285F, 0.2644F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1397F, -0.9011F, 8.7672F, 0.06F, -0.5766F, 0.2479F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6054F, 5.3293F, 0.1577F, -0.3187F, -0.9427F, 0.4138F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4433F, -1.4657F, -0.4233F, -0.2063F, 0.1841F));

		PartDefinition cube_r17 = neck3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 141).addBox(-0.5F, 0.45F, 4.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 141).addBox(-0.5F, 0.45F, 3.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.128F, -4.7523F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2191F, -1.0418F, -0.6658F, -0.1782F, 0.1265F));

		PartDefinition cube_r18 = neck2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 114).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5504F, -1.3541F, 0.3316F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6848F, -0.6576F, -1.042F, 0.0068F, 0.1392F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 7.4281F, 0.4418F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 7.4281F, 0.4418F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1826F, -1.8015F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 85).addBox(-0.5F, -0.1067F, -0.1029F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 6.64F, 3.1459F, -1.077F, 0.0623F, -0.1152F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(90, 97).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(93, 100).addBox(-0.5F, -0.2F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0616F, 4.7602F, 0.0785F, 0.1708F, 0.0565F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(98, 66).addBox(-0.5F, 0.275F, 0.175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4723F, 3.8774F, 0.0581F, 0.1702F, 0.094F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.038F, 4.0597F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(102, 25).addBox(-0.5F, -0.25F, 3.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(99, 22).addBox(-0.5F, -0.25F, -0.425F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.55F, 0.125F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0941F, 3.9206F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 69).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4227F, 0.1461F, 0.096F, 0.0F, 0.0F));

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