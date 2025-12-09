package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GoniocerasFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;

	public GoniocerasFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(44, 24).addBox(-3.0F, -1.975F, -3.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 56).addBox(2.05F, -1.274F, -1.975F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(54, 38).addBox(-5.05F, -1.274F, -1.975F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 51).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 40).addBox(-1.5F, -2.5F, 1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-1.49F, -2.4F, 3.25F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 51).addBox(-2.5F, -2.0F, 1.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(52, 19).addBox(-2.0F, -2.01F, 3.15F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 17).addBox(-1.239F, -0.5419F, 3.645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-1.739F, -0.7919F, 1.645F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(12, 60).addBox(-2.239F, -0.7919F, -4.105F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.729F, -0.9419F, -1.105F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 6).addBox(-1.739F, -1.0919F, -4.105F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.026F, -0.872F, 10.6697F, -0.0361F, -0.1684F, -0.1056F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 17).addBox(-2.7104F, -1.2359F, -4.8489F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 32).addBox(-2.2004F, -1.6259F, -4.8489F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.026F, -0.872F, 10.6697F, 0.0671F, -0.169F, -0.0968F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 13).addBox(-2.4347F, -0.0659F, 3.0102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(59, 7).addBox(-2.7097F, -0.0659F, -0.9898F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 57).addBox(-3.0679F, -0.0679F, -4.5017F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.026F, -0.872F, 10.6697F, -0.0357F, 0.0496F, -0.1134F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 29).addBox(-0.0082F, -0.0669F, 3.3301F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(59, 44).addBox(-0.7332F, -0.0669F, -0.6699F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(53, 31).addBox(-0.375F, -0.0679F, -5.1818F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.026F, -0.872F, 10.6697F, -0.0385F, -0.3864F, -0.0972F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 33).addBox(-5.0F, -1.275F, 4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(27, 57).addBox(-5.0F, -1.275F, 0.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 29).addBox(-3.325F, -1.275F, -4.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.0F, 0.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 29).addBox(0.325F, -1.275F, -4.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 57).addBox(2.0F, -1.275F, 0.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		return LayerDefinition.create(meshdefinition, 75, 70);
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