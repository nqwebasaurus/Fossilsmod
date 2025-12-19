package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PriscomyzonFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart mouth;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;

	public PriscomyzonFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.mouth = this.body.getChild("mouth");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0683F, -0.3925F, -12.6873F, 11.0F, 1.0F, 15.0F, new CubeDeformation(0.01F))
				.texOffs(0, 33).addBox(3.9317F, -0.3925F, -3.9373F, 4.0F, 1.0F, 18.0F, new CubeDeformation(0.01F)), PartPose.offset(-1.2817F, 23.8925F, 1.6873F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-2.975F, -1.0F, -0.875F, 11.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9683F, 0.6075F, 2.6627F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 33).addBox(-4.025F, -0.5F, -9.0F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9567F, 0.1075F, -3.9373F, 0.0F, 0.4669F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(45, 44).addBox(-1.4808F, -0.9725F, -7.0331F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4317F, -0.43F, -0.0873F, 0.0F, -0.0436F, -3.1416F));

		PartDefinition mouth = body.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(51, 17).addBox(-2.5F, 1.0375F, -4.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5192F, -2.0F, -6.8831F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(53, 0).addBox(-1.5F, -0.2325F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.5192F, -0.75F, -1.0331F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -0.4925F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.25F, 1.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(45, 52).addBox(-0.5F, -0.4775F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -0.05F, 3.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(51, 24).addBox(-0.5F, -0.4775F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0087F, -0.0873F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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