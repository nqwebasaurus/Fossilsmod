package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GemuendinaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart finL2;
	private final ModelPart finL4;
	private final ModelPart jawupper;
	private final ModelPart finL;
	private final ModelPart finL3;

	public GemuendinaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.finL2 = this.body3.getChild("finL2");
		this.finL4 = this.body3.getChild("finL4");
		this.jawupper = this.body.getChild("jawupper");
		this.finL = this.body.getChild("finL");
		this.finL3 = this.body.getChild("finL3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 48).addBox(-12.4F, -0.5F, -11.4F, 19.0F, 1.0F, 29.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-8.1275F, -0.4F, 0.7297F, 0.0F, -2.7053F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(68, 50).addBox(-16.1218F, -0.5F, 0.2117F, 16.0F, 1.0F, 29.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(21.7552F, -0.4F, 3.1403F, 0.0F, -0.7243F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 79).addBox(-9.3F, -0.5F, -11.3F, 16.0F, 1.0F, 24.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(10.2947F, -0.4F, -5.2949F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(11.8321F, -0.5F, -14.0568F, 16.0F, 1.0F, 46.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-17.9945F, -0.4F, -8.1872F, 0.0F, -0.1309F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -9.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.49F, 0.24F, 0.0F, 7.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-2.5F, 0.05F, -0.25F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.25F, 1.25F, 0.0F, -0.0873F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 40).addBox(-2.49F, 0.25F, 0.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(30, 16).addBox(-1.5F, 0.15F, -0.25F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(15, 26).addBox(-1.49F, 0.24F, -0.25F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -0.1F, 1.75F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 36).addBox(-0.99F, 0.25F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.6F, 0.0F, 0.1745F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(19, 16).addBox(-0.49F, 0.75F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.7F, 0.0F, 0.1309F, 0.0F));

		PartDefinition finL2 = body3.addOrReplaceChild("finL2", CubeListBuilder.create().texOffs(28, 26).addBox(0.0869F, 1.11F, -0.0405F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.85F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition finL4 = body3.addOrReplaceChild("finL4", CubeListBuilder.create().texOffs(28, 26).mirror().addBox(-3.0869F, 1.11F, -0.0405F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.85F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition jawupper = body.addOrReplaceChild("jawupper", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.05F, -1.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = jawupper.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 21).addBox(-5.15F, -0.45F, -3.55F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.35F, -2.6F, 0.2618F, 1.2654F, 0.1745F));

		PartDefinition cube_r6 = jawupper.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(23, 0).addBox(0.15F, -0.45F, -3.55F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.35F, -2.6F, 0.2618F, -1.2654F, -0.1745F));

		PartDefinition cube_r7 = jawupper.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 32).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.35F, -5.6F, 0.1309F, -0.6109F, -0.1309F));

		PartDefinition cube_r8 = jawupper.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(13, 48).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.35F, -5.6F, 0.1309F, 0.6109F, 0.1309F));

		PartDefinition cube_r9 = jawupper.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, -1.65F, -0.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.35F, -1.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = jawupper.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(3, 0).addBox(-1.5F, -1.01F, 1.25F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 4).addBox(0.5F, -1.01F, 1.25F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 34).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.35F, -5.6F, 0.1745F, 0.0F, 0.0F));

		PartDefinition finL = body.addOrReplaceChild("finL", CubeListBuilder.create().texOffs(79, 0).addBox(1.0F, 0.0F, 0.0F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -1.0F, -5.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition finL3 = body.addOrReplaceChild("finL3", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-13.0F, 0.0F, 0.0F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.0F, -5.0F, 0.0F, 0.5672F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 110);
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