package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EusthenopteronFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart pectoralfinR;
	private final ModelPart dorsalfin1;
	private final ModelPart head;
	private final ModelPart upperjaw;
	private final ModelPart jaw;
	private final ModelPart body2;
	private final ModelPart pelvicfinR;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart dorsalfin2;
	private final ModelPart analfin;
	private final ModelPart body5;

	public EusthenopteronFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.pectoralfinR = this.body.getChild("pectoralfinR");
		this.dorsalfin1 = this.body.getChild("dorsalfin1");
		this.head = this.body.getChild("head");
		this.upperjaw = this.head.getChild("upperjaw");
		this.jaw = this.head.getChild("jaw");
		this.body2 = this.body.getChild("body2");
		this.pelvicfinR = this.body2.getChild("pelvicfinR");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.dorsalfin2 = this.body4.getChild("dorsalfin2");
		this.analfin = this.body4.getChild("analfin");
		this.body5 = this.body4.getChild("body5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 121).addBox(-6.0F, -10.0F, -13.0F, 3.0F, 10.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(124, 33).addBox(-8.0F, -6.0F, -13.0F, 2.0F, 6.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(63, 0).addBox(-5.0F, -10.0F, 5.0F, 2.0F, 10.0F, 22.0F, new CubeDeformation(0.0F))
				.texOffs(124, 0).addBox(-4.0F, -15.0F, 27.0F, 1.0F, 15.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(124, 4).addBox(-4.0F, -25.0F, 27.0F, 1.0F, 10.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(130, 9).addBox(-4.0F, -21.0F, 16.0F, 1.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(121, 87).addBox(-11.0F, -14.0F, -26.0F, 8.0F, 14.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(88, 138).addBox(-8.0F, -17.0F, -31.0F, 8.0F, 17.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-3.0F, -21.0F, -27.0F, 6.0F, 21.0F, 50.0F, new CubeDeformation(0.002F))
				.texOffs(0, 72).addBox(-3.0F, -27.0F, 23.0F, 7.0F, 27.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(57, 87).addBox(1.0F, -19.0F, 28.0F, 9.0F, 19.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(66, 25).addBox(3.0F, -14.0F, -18.0F, 5.0F, 14.0F, 47.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.1F, -17.0F, 6.0F, 18.0F, 17.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -26.9F, 23.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 1).addBox(-3.4432F, 1.3192F, -0.8648F, 4.0F, 11.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-6.7638F, -28.9769F, -41.5602F, 0.8708F, 0.0668F, -0.0562F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 1).addBox(-3.2565F, 0.3821F, -0.9414F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-6.7638F, -29.0769F, -41.5602F, 0.8479F, 0.239F, -0.2059F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 0).addBox(-2.7F, -16.0F, -2.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -19.5F, -28.5F, 0.8618F, 0.16F, -0.1358F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 130).addBox(-1.6F, -10.0F, 9.0F, 3.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -4.0F, 0.0F, -0.0785F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(35, 147).addBox(-2.5F, -9.0F, 8.5F, 5.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -19.0F, -36.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body4_r1 = body.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(90, 102).addBox(-1.5F, -6.5F, 0.5F, 3.0F, 11.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 16.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(87, 33).addBox(-2.0F, -6.6224F, -7.3106F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8305F, 16.0524F, 0.0436F, 0.0F, 0.0F));

		PartDefinition pectoralfinR = body.addOrReplaceChild("pectoralfinR", CubeListBuilder.create().texOffs(8, 72).addBox(-4.0F, 0.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(30, 0).addBox(-6.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 97).addBox(-13.0F, -1.5F, 0.0F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.25F, 9.75F, -0.7174F, 1.1786F, 0.3743F));

		PartDefinition dorsalfin1 = body.addOrReplaceChild("dorsalfin1", CubeListBuilder.create().texOffs(0, 121).addBox(0.0F, -8.5F, 0.3F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, 40.0F, -1.5087F, -0.0602F, 0.1519F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(95, 87).addBox(-4.5F, -4.0F, -5.5F, 7.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 9.0F, -0.3124F, 0.2079F, -0.0666F));

		PartDefinition headlow_r1 = head.addOrReplaceChild("headlow_r1", CubeListBuilder.create().texOffs(123, 115).addBox(-3.5F, 3.2188F, -12.2446F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1695F, 7.0524F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 36).addBox(-3.4F, -4.289F, -17.7845F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 46).addBox(-2.99F, -6.889F, -19.1845F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(43, 126).addBox(-2.99F, -7.289F, -23.6845F, 5.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1695F, 7.0524F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create().texOffs(36, 75).addBox(-3.0F, -4.0F, -12.9F, 5.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(21, 36).addBox(-3.0F, -1.25F, -12.65F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.25F, -5.45F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tooth3_r1 = upperjaw.addOrReplaceChild("tooth3_r1", CubeListBuilder.create().texOffs(71, 128).addBox(-5.9345F, 0.7305F, -24.3526F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(25, 121).addBox(-6.3648F, -1.9295F, -24.5638F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0805F, 12.5024F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tooth2_r1 = upperjaw.addOrReplaceChild("tooth2_r1", CubeListBuilder.create().texOffs(145, 59).addBox(-1.9885F, -1.4695F, -0.7156F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1751F, 0.1195F, -11.8883F, 0.0104F, 0.0838F, -0.0494F));

		PartDefinition head1_r1 = upperjaw.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(90, 0).addBox(-2.8832F, -1.5F, -0.1513F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9611F, -2.51F, -12.1071F, 0.0F, 0.1309F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(10, 4).addBox(-1.5F, -0.75F, -11.35F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(63, 33).addBox(-2.5F, 0.0F, -11.5F, 5.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.65F, -6.5F, 0.1222F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(144, 0).addBox(-1.7309F, -1.0F, -0.9479F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5464F, 0.99F, -10.3439F, 0.0F, 0.0873F, 0.0F));

		PartDefinition jaw1_r1 = jaw.addOrReplaceChild("jaw1_r1", CubeListBuilder.create().texOffs(146, 115).addBox(-5.9127F, 0.4705F, -24.3073F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(108, 0).addBox(-5.6258F, -0.2795F, -24.4065F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4805F, 13.5524F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tooth2_r2 = jaw.addOrReplaceChild("tooth2_r2", CubeListBuilder.create().texOffs(124, 59).addBox(-1.6972F, -2.4795F, -0.7694F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1751F, 1.7195F, -10.8383F, 0.0104F, 0.0757F, -0.0404F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -3.75F, 0.5F, 1.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 37.7F, 0.3873F, -0.0665F, 0.1615F));

		PartDefinition pelvicfinR = body2.addOrReplaceChild("pelvicfinR", CubeListBuilder.create().texOffs(38, 36).addBox(-4.0F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(-6.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 91).addBox(-13.0F, -1.5F, 0.0F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, 3.25F, 0.0F, -1.3796F, 0.895F, -1.6012F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -3.749F, 0.5F, 1.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 7.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(62, 147).addBox(-1.0F, -2.75F, 0.25F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 7.25F));

		PartDefinition dorsalfin2 = body4.addOrReplaceChild("dorsalfin2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -3.0F, -0.25F, -1.7358F, -0.0646F, -0.0196F));

		PartDefinition fin_r1 = dorsalfin2.addOrReplaceChild("fin_r1", CubeListBuilder.create().texOffs(0, 72).addBox(-0.2F, -12.0F, -2.9F, 0.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.25F, 2.0F, 0.0F, 0.0F, 0.0524F));

		PartDefinition analfin = body4.addOrReplaceChild("analfin", CubeListBuilder.create().texOffs(115, 138).addBox(0.0F, 0.25F, -1.5F, 0.0F, 15.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.3F, -0.45F, 0.5452F, -0.0011F, -0.1811F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(131, 124).addBox(-0.01F, -10.0F, 1.0F, 0.0F, 20.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(40, 0).addBox(-0.5F, -0.7F, 7.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(-0.5F, -1.0F, 6.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.4F, -1.25F, 4.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 9.75F, 0.0F, 0.0F, -0.1745F));

		PartDefinition finbase2_r1 = body5.addOrReplaceChild("finbase2_r1", CubeListBuilder.create().texOffs(63, 33).addBox(-0.1F, 12.725F, 59.95F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.75F, -62.0F, 0.3142F, 0.0F, 0.0F));

		PartDefinition finbase1_r1 = body5.addOrReplaceChild("finbase1_r1", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5F, -30.6F, 55.4F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.75F, -62.0F, -0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 176);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}