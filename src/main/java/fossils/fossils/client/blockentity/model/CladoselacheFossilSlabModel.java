package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CladoselacheFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart jaw;
	private final ModelPart head;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart pectoralfinL;
	private final ModelPart pectoralfinR;
	private final ModelPart body3;
	private final ModelPart pelvicfinL;
	private final ModelPart pelvicfinR;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart caudalfin;

	public CladoselacheFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.jaw = this.body.getChild("jaw");
		this.head = this.body.getChild("head");
		this.body1 = this.body.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.pectoralfinL = this.body2.getChild("pectoralfinL");
		this.pectoralfinR = this.body2.getChild("pectoralfinR");
		this.body3 = this.body2.getChild("body3");
		this.pelvicfinL = this.body3.getChild("pelvicfinL");
		this.pelvicfinR = this.body3.getChild("pelvicfinR");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.caudalfin = this.body6.getChild("caudalfin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 59).addBox(-10.9F, -0.5F, -8.0F, 13.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4926F, -0.5F, 31.7689F, 0.0F, -1.3614F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-9.2F, -0.5F, -2.2F, 13.0F, 1.0F, 13.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.1835F, -0.5F, 23.8802F, 0.0F, -0.7069F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0579F, -0.5F, -3.6865F, 25.0F, 1.0F, 57.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-14.0836F, -0.5F, -27.229F, 0.0F, 0.0524F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3F, -8.1F, -7.0F, 0.0F, -0.4363F, -3.1416F));

		PartDefinition jaw = body.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(74, 60).addBox(-2.0F, -1.8F, -5.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, -18.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(53, 59).addBox(-2.5F, -1.0F, -6.0F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(60, 66).addBox(-1.5F, -1.05F, -6.9F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, -18.0F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, 0.1F, 0.0F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, -18.0F));

		PartDefinition gillR_r1 = body1.addOrReplaceChild("gillR_r1", CubeListBuilder.create().texOffs(40, 5).addBox(-2.75F, -7.001F, -1.75F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1F, 2.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition body1_2_r1 = body1.addOrReplaceChild("body1_2_r1", CubeListBuilder.create().texOffs(57, 74).addBox(-2.0F, -7.95F, -2.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition gillL_r1 = body1.addOrReplaceChild("gillL_r1", CubeListBuilder.create().texOffs(42, 25).addBox(1.75F, -7.001F, -1.75F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1F, 2.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 0.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-2.5F, -0.75F, 0.5F, 5.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition pectoralfinL = body2.addOrReplaceChild("pectoralfinL", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, -2.0F, -3.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 2.0F, 2.0F));

		PartDefinition pectoralfinR = body2.addOrReplaceChild("pectoralfinR", CubeListBuilder.create().texOffs(27, 38).addBox(-7.0F, -2.0F, -3.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 2.0F, 2.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(25, 15).addBox(-3.0F, -0.01F, -1.0F, 6.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition pelvicfinL = body3.addOrReplaceChild("pelvicfinL", CubeListBuilder.create().texOffs(38, 45).addBox(-0.5F, -2.03F, -1.5F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 2.0F, 7.0F));

		PartDefinition pelvicfinR = body3.addOrReplaceChild("pelvicfinR", CubeListBuilder.create().texOffs(42, 32).addBox(-2.5F, -2.04F, -1.5F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 2.0F, 7.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(22, 28).addBox(-2.5F, 0.0F, -1.0F, 5.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(20, 45).addBox(-2.5F, -0.01F, -1.0F, 5.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(40, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(72, 74).addBox(-2.5F, -0.03F, 0.0F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.2F, 0.0F, 0.2182F, 0.0F));

		PartDefinition caudalfin = body6.addOrReplaceChild("caudalfin", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition caudalfinD_r1 = caudalfin.addOrReplaceChild("caudalfinD_r1", CubeListBuilder.create().texOffs(45, 59).addBox(-0.02F, 16.0F, 39.0F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -42.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition caudalfinU_r1 = caudalfin.addOrReplaceChild("caudalfinU_r1", CubeListBuilder.create().texOffs(0, 59).addBox(-0.001F, -37.0F, 32.0F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -42.0F, -0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 165, 85);
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