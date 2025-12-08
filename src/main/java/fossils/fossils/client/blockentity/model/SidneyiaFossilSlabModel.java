package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SidneyiaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart antennaeL;
	private final ModelPart antennaeR;
	private final ModelPart tail;
	private final ModelPart tail2;

	public SidneyiaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.antennaeL = this.body.getChild("antennaeL");
		this.antennaeR = this.body.getChild("antennaeR");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-23.9F, -0.5F, -8.0F, 28.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4926F, -0.5F, 8.7689F, 0.0F, -1.3614F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.01F, 1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 9).addBox(-4.0F, -1.01F, -6.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-3.5F, -1.01F, -7.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(-4.5F, -1.01F, -5.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(-3.0F, -1.02F, 3.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.1F, 4.7F, 0.0F, 1.0036F, 0.0F));

		PartDefinition antennaeL = body.addOrReplaceChild("antennaeL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -1.0F, -5.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = antennaeL.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 6).addBox(-0.7F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.5F, 0.0F, 0.3491F, 0.0F));

		PartDefinition antennaeR = body.addOrReplaceChild("antennaeR", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -1.0F, -5.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r3 = antennaeR.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 3).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5652F, 0.0F, 1.9254F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r4 = antennaeR.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 5).addBox(0.9F, 0.0F, -0.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 11).addBox(-1.5F, 0.0F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8888F, 0.0F, 2.0845F, 0.0F, 1.4399F, 0.0F));

		PartDefinition cube_r5 = antennaeR.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 17).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, 0.0F, 0.48F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 5.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(16, 17).addBox(-1.5F, -0.01F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.8F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 16).addBox(-1.8F, 0.0F, -0.15F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 3).addBox(-1.3F, 0.0F, -2.15F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.75F, 0.0F, 0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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