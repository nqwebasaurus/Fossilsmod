package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CanadaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body5;
	private final ModelPart antennaL;
	private final ModelPart antennaR2;
	private final ModelPart shell2;
	private final ModelPart body;
	private final ModelPart antennaR;
	private final ModelPart shell;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart legL7;

	public CanadaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body5 = this.fossil.getChild("body5");
		this.antennaL = this.body5.getChild("antennaL");
		this.antennaR2 = this.body5.getChild("antennaR2");
		this.shell2 = this.body5.getChild("shell2");
		this.body = this.fossil.getChild("body");
		this.antennaR = this.body.getChild("antennaR");
		this.shell = this.body.getChild("shell");
		this.body1 = this.body.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.legL = this.body1.getChild("legL");
		this.legL2 = this.body1.getChild("legL2");
		this.legL3 = this.body1.getChild("legL3");
		this.legL4 = this.body1.getChild("legL4");
		this.legL5 = this.body1.getChild("legL5");
		this.legL6 = this.body1.getChild("legL6");
		this.legL7 = this.body1.getChild("legL7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 26).addBox(-8.0F, -2.0F, -10.0F, 16.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.7F, -1.0F, -12.1F, 15.0F, 2.0F, 23.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2228F, -1.0F, 18.6538F, 0.0F, 1.1345F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 51).addBox(-1.2F, -1.0F, -7.0F, 11.0F, 2.0F, 22.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.0F, -1.0F, 1.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition body5 = fossil.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -4.5833F, 12.1667F, 0.0F, 1.9635F, 0.0F));

		PartDefinition antennaL = body5.addOrReplaceChild("antennaL", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.0F, 0.8333F, -10.9167F, 0.0F, -0.3054F, 0.0F));

		PartDefinition antennaR2 = body5.addOrReplaceChild("antennaR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.0F, 0.8333F, -10.9167F, 0.0F, 0.3054F, 0.0F));

		PartDefinition shell2 = body5.addOrReplaceChild("shell2", CubeListBuilder.create().texOffs(0, 51).addBox(10.5F, 0.4587F, 9.5581F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, 1.9833F, -11.4167F));

		PartDefinition cube_r3 = shell2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -7.0F, -4.5F, 0.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.4026F, 0.4721F, 15.2081F, 0.0F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.0F, -5.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.35F, -2.5F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.55F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition antennaR = body.addOrReplaceChild("antennaR", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -0.5F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -2.8F, -4.95F, -0.1309F, 0.0F, 0.0F));

		PartDefinition shell = body.addOrReplaceChild("shell", CubeListBuilder.create().texOffs(0, 26).addBox(-1.3F, -0.55F, -0.25F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.25F, -5.25F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -2.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 41).addBox(-1.4F, -1.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(17, 39).addBox(-1.39F, -1.01F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(10, 0).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(17, 19).addBox(-1.45F, -0.05F, 0.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 0).addBox(0.1F, -0.7F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.55F, 1.05F, 0.9F, -0.6283F, 0.0F, 0.0F));

		PartDefinition legL = body1.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(5, 41).addBox(0.1F, 0.0F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, 1.75F, 0.1F, -0.3491F, 0.0F, 0.0F));

		PartDefinition legL2 = body1.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(19, 33).addBox(0.1F, 0.0F, -1.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, 1.75F, 0.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition legL3 = body1.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(19, 26).addBox(-1.6F, 0.0F, -1.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 1.75F, 1.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition legL4 = body1.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(16, 26).addBox(0.1F, 0.0F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, 1.75F, 1.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition legL5 = body1.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(10, 26).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.35F, 1.75F, 2.8F, 0.1309F, 0.0F, 0.0F));

		PartDefinition legL6 = body1.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(19, 14).addBox(0.1F, 0.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.55F, 1.55F, 3.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition legL7 = body1.addOrReplaceChild("legL7", CubeListBuilder.create().texOffs(19, 9).addBox(0.1F, 0.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.55F, 1.15F, 4.0F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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