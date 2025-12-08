package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YawunikFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bodybase;
	private final ModelPart cube_r1;
	private final ModelPart body1;
	private final ModelPart legL4;
	private final ModelPart cube_r2;
	private final ModelPart legL3;
	private final ModelPart cube_r3;
	private final ModelPart legL1;
	private final ModelPart cube_r4;
	private final ModelPart legL2;
	private final ModelPart cube_r5;
	private final ModelPart legL5;
	private final ModelPart cube_r6;
	private final ModelPart legL7;
	private final ModelPart cube_r7;
	private final ModelPart body2;
	private final ModelPart legL9;
	private final ModelPart cube_r8;
	private final ModelPart body3;
	private final ModelPart cube_r9;
	private final ModelPart legL11;
	private final ModelPart cube_r10;
	private final ModelPart tentacle1;
	private final ModelPart tentacle1_1;
	private final ModelPart tentacle1_2;
	private final ModelPart tentacle1_3;

	public YawunikFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bodybase = this.fossil.getChild("bodybase");
		this.cube_r1 = this.bodybase.getChild("cube_r1");
		this.body1 = this.bodybase.getChild("body1");
		this.legL4 = this.body1.getChild("legL4");
		this.cube_r2 = this.legL4.getChild("cube_r2");
		this.legL3 = this.body1.getChild("legL3");
		this.cube_r3 = this.legL3.getChild("cube_r3");
		this.legL1 = this.body1.getChild("legL1");
		this.cube_r4 = this.legL1.getChild("cube_r4");
		this.legL2 = this.body1.getChild("legL2");
		this.cube_r5 = this.legL2.getChild("cube_r5");
		this.legL5 = this.body1.getChild("legL5");
		this.cube_r6 = this.legL5.getChild("cube_r6");
		this.legL7 = this.body1.getChild("legL7");
		this.cube_r7 = this.legL7.getChild("cube_r7");
		this.body2 = this.body1.getChild("body2");
		this.legL9 = this.body2.getChild("legL9");
		this.cube_r8 = this.legL9.getChild("cube_r8");
		this.body3 = this.body2.getChild("body3");
		this.cube_r9 = this.body3.getChild("cube_r9");
		this.legL11 = this.body3.getChild("legL11");
		this.cube_r10 = this.legL11.getChild("cube_r10");
		this.tentacle1 = this.bodybase.getChild("tentacle1");
		this.tentacle1_1 = this.tentacle1.getChild("tentacle1_1");
		this.tentacle1_2 = this.tentacle1.getChild("tentacle1_2");
		this.tentacle1_3 = this.tentacle1.getChild("tentacle1_3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -2.0F, -11.0F, 20.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bodybase = fossil.addOrReplaceChild("bodybase", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -4.3F, 1.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = bodybase.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9F, -9.5F, -7.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body1 = bodybase.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(10, 8).addBox(-1.87F, 0.0F, 0.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -6.0F));

		PartDefinition legL4 = body1.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 2.5F, 2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = legL4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 24).addBox(3.85F, -2.05F, -4.8F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition legL3 = body1.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 2.25F, 1.75F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = legL3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 17).addBox(3.85F, -2.05F, -4.75F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition legL1 = body1.addOrReplaceChild("legL1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 2.25F, 0.25F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = legL1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 17).addBox(3.85F, -2.05F, -4.8F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition legL2 = body1.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 2.25F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r5 = legL2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 7).addBox(3.85F, -2.05F, -4.79F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition legL5 = body1.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 2.5F, 3.25F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = legL5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 13).addBox(3.85F, -2.05F, -4.75F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition legL7 = body1.addOrReplaceChild("legL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 2.25F, 4.75F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = legL7.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 3).addBox(3.85F, -2.05F, -4.749F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(30, 24).addBox(-1.4F, 0.0F, 0.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition legL9 = body2.addOrReplaceChild("legL9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 2.0F, 1.25F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = legL9.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 13).addBox(3.85F, -2.05F, -4.77F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(8, 24).addBox(-0.9F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5F, 0.95F, -0.9F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 11).addBox(0.0F, 0.95F, 1.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.0F, -0.5672F, 1.5708F));

		PartDefinition legL11 = body3.addOrReplaceChild("legL11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 1.25F, -2.25F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r10 = legL11.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 3).addBox(3.85F, -2.05F, -4.8F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition tentacle1 = bodybase.addOrReplaceChild("tentacle1", CubeListBuilder.create().texOffs(18, 0).addBox(0.5F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -7.5F, -6.6F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tentacle1_1 = tentacle1.addOrReplaceChild("tentacle1_1", CubeListBuilder.create().texOffs(15, 24).addBox(0.3F, 0.0F, -0.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 3.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tentacle1_2 = tentacle1.addOrReplaceChild("tentacle1_2", CubeListBuilder.create().texOffs(0, 24).addBox(-0.1F, 0.0F, -0.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 3.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tentacle1_3 = tentacle1.addOrReplaceChild("tentacle1_3", CubeListBuilder.create().texOffs(0, 0).addBox(0.7F, 0.0F, -0.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.3F, 3.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 50);
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