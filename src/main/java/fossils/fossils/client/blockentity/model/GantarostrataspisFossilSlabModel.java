package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GantarostrataspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Gantarostrataspis;

	public GantarostrataspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Gantarostrataspis = this.fossil.getChild("Gantarostrataspis");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(15, 13).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(33, 33).addBox(-4.0F, -1.0F, 5.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(37, 14).addBox(-4.0F, -1.0F, 7.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 31).addBox(-3.0013F, -2.0F, -0.6822F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 1.0F, -3.5F, 0.0F, 0.637F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 13).addBox(-0.6F, -2.0F, -8.2F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.3F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 26).addBox(0.0013F, -2.0F, -0.6822F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.0F, -3.5F, 0.0F, -0.637F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4F, -2.0F, -8.2F, 2.0F, 1.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.3F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 16).addBox(-4.5F, -2.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(18, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0F, 1.0F, 5.0F, 0.0F, 1.1083F, 0.0F));

		PartDefinition Gantarostrataspis = fossil.addOrReplaceChild("Gantarostrataspis", CubeListBuilder.create().texOffs(28, 0).addBox(-3.5F, -1.4F, -9.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(44, 26).addBox(-3.5F, -1.4F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-0.5F, -0.95F, -19.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F))
				.texOffs(31, 37).addBox(-3.5F, -1.4F, -4.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 20).addBox(0.25F, -0.95F, -19.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(16, 0).addBox(-1.25F, -0.95F, -19.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.2F, 9.0F));

		PartDefinition cube_r6 = Gantarostrataspis.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0282F, 1.091F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(15, 38).addBox(-2.0F, 0.0282F, 0.091F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.95F, -12.2F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Gantarostrataspis.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 20).addBox(-3.5F, -3.7F, -7.75F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-3.5F, -3.7F, -3.75F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(12, 25).addBox(-3.5F, -3.7F, -1.75F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Gantarostrataspis.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 36).addBox(-1.8F, -1.05F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.75F, 0.1F, -8.05F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r9 = Gantarostrataspis.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 7).addBox(-0.2F, -1.05F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.75F, 0.1F, -8.05F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r10 = Gantarostrataspis.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(25, 41).addBox(-1.75F, -2.7F, -19.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.4F, 1.75F, -0.3F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r11 = Gantarostrataspis.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 41).addBox(0.75F, -2.7F, -19.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.4F, 1.75F, -0.3F, 0.0F, -0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 60, 50);
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