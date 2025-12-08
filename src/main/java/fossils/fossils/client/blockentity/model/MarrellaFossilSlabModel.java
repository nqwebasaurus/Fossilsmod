package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MarrellaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart legL6;
	private final ModelPart legL5;
	private final ModelPart legL4;
	private final ModelPart legL3;
	private final ModelPart legL2;
	private final ModelPart legL1;
	private final ModelPart frontlegL;
	private final ModelPart frontlegR;
	private final ModelPart antennaL2;
	private final ModelPart antennaL;

	public MarrellaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.legL6 = this.body.getChild("legL6");
		this.legL5 = this.body.getChild("legL5");
		this.legL4 = this.body.getChild("legL4");
		this.legL3 = this.body.getChild("legL3");
		this.legL2 = this.body.getChild("legL2");
		this.legL1 = this.body.getChild("legL1");
		this.frontlegL = this.body.getChild("frontlegL");
		this.frontlegR = this.body.getChild("frontlegR");
		this.antennaL2 = this.body.getChild("antennaL2");
		this.antennaL = this.body.getChild("antennaL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -1.0F, -10.5F, 20.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, -0.5F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(23, 34).addBox(1.0F, -2.9F, -8.5F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(-1.0F, -2.9F, -8.75F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -2.95F, -6.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-2.0F, -3.0F, -5.75F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(34, 24).addBox(-6.0F, -2.9F, -8.5F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.525F, 6.4F));

		PartDefinition legL6 = body.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offset(0.5F, -3.25F, -2.25F));

		PartDefinition legL5 = body.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offset(0.5F, -3.25F, -3.0F));

		PartDefinition legL4 = body.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offset(0.5F, -3.25F, -3.75F));

		PartDefinition legL3 = body.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offset(0.5F, -3.25F, -4.4F));

		PartDefinition legL2 = body.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offset(0.5F, -3.25F, -5.0F));

		PartDefinition legL1 = body.addOrReplaceChild("legL1", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, 0.4F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 14).addBox(2.0F, 0.4F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 4).addBox(0.0F, 0.4F, 3.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(0.0F, 0.4F, 5.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 15).addBox(1.0F, 0.4F, 4.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, 0.4F, 0.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 14).addBox(2.0F, 0.4F, 1.7F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 2).addBox(0.0F, 0.4F, -0.6F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 5).addBox(2.0F, 0.4F, 0.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 2).mirror().addBox(-3.0F, 0.4F, -0.6F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 5).mirror().addBox(-4.0F, 0.4F, 0.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-3.0F, 0.4F, 0.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 14).mirror().addBox(-4.0F, 0.4F, 1.7F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 4).mirror().addBox(-3.0F, 0.4F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 14).mirror().addBox(-4.0F, 0.4F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 4).mirror().addBox(-2.0F, 0.4F, 3.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 15).mirror().addBox(-3.0F, 0.4F, 4.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 14).mirror().addBox(-2.0F, 0.4F, 5.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5F, -3.25F, -5.5F));

		PartDefinition frontlegL = body.addOrReplaceChild("frontlegL", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, 0.8F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.5F, -7.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition frontlegR = body.addOrReplaceChild("frontlegR", CubeListBuilder.create().texOffs(0, 11).addBox(-6.5F, 0.8F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.5F, -7.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition antennaL2 = body.addOrReplaceChild("antennaL2", CubeListBuilder.create().texOffs(0, 24).addBox(-3.25F, 0.3F, -8.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -3.0F, -7.0F));

		PartDefinition antennaL = body.addOrReplaceChild("antennaL", CubeListBuilder.create().texOffs(17, 25).addBox(-0.75F, 0.3F, -8.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -7.0F, 0.0F, -0.1309F, 0.0F));

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