package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CalvapilosaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart back;
	private final ModelPart head;
	private final ModelPart bone;

	public CalvapilosaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.back = this.body.getChild("back");
		this.head = this.body.getChild("head");
		this.bone = this.head.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 23.5F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 40).addBox(-5.7F, -1.0F, -13.9F, 19.0F, 1.0F, 31.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 0.5F, -5.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 0).addBox(-3.1828F, -0.5F, -15.3067F, 8.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.9511F, 0.0F, 17.2718F, 0.0F, -1.1956F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0299F, -0.5F, -29.4628F, 10.0F, 1.0F, 38.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-12.9511F, 0.0F, 7.2718F, 0.0F, -0.192F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 8).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(-2.5F, -0.15F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.01F))
				.texOffs(0, 54).addBox(-1.5F, -0.15F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-4.5F, 0.1F, -4.0F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-3.5F, -0.05F, -4.0F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.8F, 0.1F));

		PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(59, 21).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(-4.0F, 0.1F, 0.0F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(59, 6).addBox(-2.0F, -0.15F, 0.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 40).addBox(-3.0F, -0.1F, -0.5F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(59, 12).addBox(-3.0F, 0.1F, 4.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 16).addBox(-2.5F, 0.0F, 5.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, 2.75F, 0.0F, -0.0873F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 47).addBox(-3.0F, -0.05F, -5.5F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(22, 19).addBox(-2.5F, 0.0F, -6.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 0).addBox(-2.0F, -0.15F, -5.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 0).addBox(-0.5F, 0.26F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 27).addBox(-3.5F, 0.0F, -5.0F, 7.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(-4.0F, 0.1F, -5.0F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(59, 16).addBox(-3.0F, 0.1F, -6.5F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, -3.75F, 0.0F, 0.0873F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -1.75F, -3.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 8).addBox(-1.0F, 1.6F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 85);
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