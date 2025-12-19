package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThelodusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart stone;
	private final ModelPart body;
	private final ModelPart finL;
	private final ModelPart finL2;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;

	public ThelodusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.stone = this.fossil.getChild("stone");
		this.body = this.stone.getChild("body");
		this.finL = this.body.getChild("finL");
		this.finL2 = this.body.getChild("finL2");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -3.0543F, 0.0F));

		PartDefinition stone = fossil.addOrReplaceChild("stone", CubeListBuilder.create().texOffs(0, 47).addBox(-7.0F, -2.0F, -1.0F, 13.0F, 2.0F, 20.0F, new CubeDeformation(-0.003F)), PartPose.offset(4.0F, 0.0F, -11.0F));

		PartDefinition cube_r1 = stone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -1.0F, 0.3F, 13.0F, 2.0F, 20.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-6.9F, -1.0F, -3.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r2 = stone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -2.0F, 0.0F, 13.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, 19.0F, 0.0F, -1.2217F, 0.0F));

		PartDefinition body = stone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(47, 24).addBox(-3.0F, -5.0F, 2.0F, 6.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(7, 6).addBox(-3.25F, -5.05F, 0.75F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 8).addBox(2.25F, -5.05F, 0.75F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-2.5F, -5.0F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1F, 2.6F, 21.0F, 0.0F, -2.7925F, 0.0F));

		PartDefinition finL = body.addOrReplaceChild("finL", CubeListBuilder.create().texOffs(47, 47).addBox(0.0F, 1.6F, 0.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -6.5F, 3.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition finL2 = body.addOrReplaceChild("finL2", CubeListBuilder.create().texOffs(47, 33).addBox(-6.0F, 1.6F, 0.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -6.5F, 3.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 1.51F, -1.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, 10.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(9, 24).addBox(0.0057F, -1.6307F, -1.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 4.0F, -0.5672F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = body3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.1F, -0.5F, -7.95F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1057F, 4.3693F, 8.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -6.15F, -5.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1057F, 0.3693F, 8.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 6).addBox(1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8943F, -0.1307F, 3.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, 4.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 13).addBox(0.51F, -2.0714F, 0.133F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.4021F, 0.1846F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 24).addBox(1.2F, -1.0F, 1.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4021F, 0.1846F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 6).addBox(0.5F, -0.9413F, 0.2119F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.4021F, 0.1846F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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