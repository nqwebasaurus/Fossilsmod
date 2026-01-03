package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BirkeniaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Birkenia;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public BirkeniaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Birkenia = this.fossil.getChild("Birkenia");
		this.tail = this.Birkenia.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -2.0F, -25.0F, 27.0F, 2.0F, 48.0F, new CubeDeformation(0.005F))
				.texOffs(0, 93).addBox(17.0F, -2.0F, -23.0F, 14.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 22).addBox(-3.5F, -1.0F, -3.4F, 6.0F, 2.0F, 11.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-12.1735F, -1.0F, 15.0554F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 51).addBox(-8.5F, -1.0F, -16.2F, 35.0F, 2.0F, 39.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.5F, -1.0F, -1.5F, 0.0F, 0.3054F, 0.0F));

		PartDefinition Birkenia = fossil.addOrReplaceChild("Birkenia", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -9.0F, -7.0F, 0.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-2.5F, -2.0F, -2.0F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(15, 11).addBox(-2.6F, -9.25F, -7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-2.6F, -9.25F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 11).addBox(-2.6F, -9.25F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 11).addBox(-2.6F, -9.25F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 11).addBox(-2.7F, -9.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 0).addBox(-2.7F, -9.75F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(-2.6F, -9.75F, 5.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.7F, -10.5F, 1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, -4.8F, -1.0F, 0.5236F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = Birkenia.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, 0.0F, -6.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(30, 9).addBox(-2.0F, 1.0F, -6.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -9.0F, -7.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Birkenia.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.9F, -4.25F, -6.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.6F, -1.75F, -7.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail = Birkenia.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(7, 0).addBox(-2.2F, -2.75F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 11).addBox(-2.2F, -2.5F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 17).addBox(-2.0F, -2.0F, -1.0F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-2.1F, 3.5F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -6.5F, 7.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 22).addBox(-2.1F, -3.25F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.25F, 4.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tail2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 0).addBox(0.1F, -0.5F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 1.25F, 0.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 0).addBox(0.0F, -0.7F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 1.25F, 0.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(23, 24).addBox(-2.2F, -6.5462F, -0.0634F, 0.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7038F, 2.0634F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 0).addBox(-1.9F, -1.75F, -1.8F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4538F, 0.9366F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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