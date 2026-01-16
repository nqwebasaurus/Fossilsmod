package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SquatinactisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart finL;
	private final ModelPart finR;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart tailfin;

	public SquatinactisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.finL = this.body.getChild("finL");
		this.finR = this.body.getChild("finR");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.tailfin = this.body7.getChild("tailfin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 52).addBox(3.8482F, -1.0F, -23.7958F, 12.0F, 2.0F, 23.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-22.0F, -1.0F, -0.5F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 52).addBox(-29.9011F, -1.0F, -23.9263F, 14.0F, 2.0F, 15.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 34).addBox(-37.9011F, -1.0F, -15.1263F, 31.0F, 2.0F, 15.0F, new CubeDeformation(0.003F))
				.texOffs(0, 16).addBox(-6.9011F, -1.0F, -5.1263F, 7.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(19.0F, -1.0F, 16.8F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-10.8258F, -1.0F, -0.1008F, 11.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -1.0F, -16.1F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 52).addBox(-2.7258F, -1.0F, 30.5992F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8F, -1.0F, -15.8F, 0.0F, 0.5585F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(54, 25).addBox(-2.5F, -2.85F, -9.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 47).addBox(-1.99F, -2.825F, -9.25F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(-2.99F, -2.75F, -8.6F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 45).addBox(-2.49F, -2.95F, -6.6F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(-7, 8).addBox(-0.5F, -3.1F, -3.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(54, 21).addBox(-2.5F, -3.0F, -6.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.4F, -7.0F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 16).addBox(-3.1F, -2.6F, -6.15F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 40).addBox(2.1F, -2.6F, -6.15F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition finL = body.addOrReplaceChild("finL", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.7F, -1.0F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -1.0F, -2.0F));

		PartDefinition finR = body.addOrReplaceChild("finR", CubeListBuilder.create().texOffs(54, 0).addBox(-10.0F, -1.7F, -1.0F, 10.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -1.0F, -2.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -1.9F, -1.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(-4, 11).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(-4, 11).addBox(-0.5F, -1.4F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(54, 15).addBox(-1.5F, -1.35F, -1.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 4.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(54, 8).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(-5, 10).addBox(-0.5F, -1.75F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 4.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(-5, 10).addBox(-0.5F, -1.4F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(13, 24).addBox(-1.0F, -1.15F, -0.5F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 5.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 34).addBox(-0.9F, -0.8F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(-5, 10).addBox(-0.5F, -0.95F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 5.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r7 = body6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6971F, -1.0F, 1.5556F, -2.3562F, 0.0F, 1.5708F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.0F, 4.4F, 0.48F, 0.0F, -1.5708F));

		PartDefinition cube_r8 = body7.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.21F, 2.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tailfin = body7.addOrReplaceChild("tailfin", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition cube_r9 = tailfin.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(18, 8).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2F, 2.0F, 0.0F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 110, 80);
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