package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SacabambaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart head;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart tail1;

	public SacabambaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.head = this.fossil.getChild("head");
		this.body1 = this.head.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.tail1 = this.body3.getChild("tail1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 30).addBox(-5.0F, -2.0F, -14.0F, 12.0F, 2.0F, 24.0F, new CubeDeformation(-0.004F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(49, 0).addBox(-1.5F, -2.0F, -2.5F, 9.0F, 7.0F, 11.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6537F, -5.0F, 9.6276F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 57).addBox(-2.9F, -5.0F, -11.0F, 4.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -5.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -3.5F, -11.0F, 13.0F, 7.0F, 22.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, -3.5F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 30).addBox(-7.0F, -2.0F, -10.5F, 14.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.0F, 9.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 53).addBox(-1.0F, -0.5F, -12.0F, 5.0F, 1.0F, 24.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(6.0F, -0.5F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition head = fossil.addOrReplaceChild("head", CubeListBuilder.create().texOffs(49, 19).addBox(-1.99F, -5.75F, -7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 69).addBox(-2.5F, -7.0F, 6.25F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(35, 79).addBox(-3.0F, -6.5F, -3.75F, 6.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(-3.5F, -4.85F, -2.75F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -7.0F, -0.1446F, -0.27F, 0.4996F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 62).addBox(-3.51F, -4.35F, -4.1F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 38).addBox(-3.01F, -4.35F, -6.1F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 69).addBox(-3.49F, -5.451F, 0.85F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 70).addBox(-2.49F, -6.7F, -4.3F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 44).addBox(-2.5F, -7.0F, -5.75F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 57).addBox(-2.99F, -4.6F, 1.5F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 63).addBox(1.8F, -5.25F, -3.45F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 10).addBox(-4.71F, -5.4F, -5.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(13, 46).addBox(3.71F, -5.4F, -5.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 5).addBox(2.5F, -6.65F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.3491F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 0).addBox(-4.5F, -6.65F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, -0.3491F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(27, 57).addBox(-3.5F, -6.75F, -3.4F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition mouth_r1 = head.addOrReplaceChild("mouth_r1", CubeListBuilder.create().texOffs(0, 50).addBox(-1.99F, -6.85F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body1 = head.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.01F, -0.75F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 8.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(49, 30).addBox(-1.5F, -1.25F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 4.25F, 0.0F, 0.2618F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(79, 0).addBox(-1.0F, -1.26F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition tail1 = body3.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.3491F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 100);
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