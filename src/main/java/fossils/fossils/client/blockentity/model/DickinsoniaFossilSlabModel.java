package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DickinsoniaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;

	public DickinsoniaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 27).addBox(-8.075F, -1.0F, -0.1F, 17.0F, 1.0F, 11.0F, new CubeDeformation(0.003F))
				.texOffs(0, 0).addBox(-0.075F, -1.0F, -14.1F, 9.0F, 1.0F, 25.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 40).addBox(-8.0F, -1.0F, -14.0F, 9.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, 0.0F, -8.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 2).addBox(-5.0F, 0.0F, -7.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 7).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(34, 40).addBox(-7.0F, 0.0F, -3.0F, 14.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(44, 11).addBox(-6.0F, 0.0F, 3.0F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.0F, 0.0F, 5.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-4.0F, 0.0F, 6.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-3.0F, 0.0F, 7.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-3.0F, -0.1F, -6.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(-4.0F, -0.1F, -5.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 0).addBox(-5.0F, -0.1F, -3.0F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 4).addBox(-4.0F, -0.1F, 3.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-3.0F, -0.1F, 5.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.025F, 0.0F));

		return LayerDefinition.create(meshdefinition, 75, 60);
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