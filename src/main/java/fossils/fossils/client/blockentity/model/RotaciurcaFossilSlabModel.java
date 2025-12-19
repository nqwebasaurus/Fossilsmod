package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RotaciurcaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart squish;
	private final ModelPart cone;
	private final ModelPart uppercap;
	private final ModelPart uppercap3;
	private final ModelPart uppercap2;
	private final ModelPart uppercap4;

	public RotaciurcaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.squish = this.main.getChild("squish");
		this.cone = this.main.getChild("cone");
		this.uppercap = this.cone.getChild("uppercap");
		this.uppercap3 = this.cone.getChild("uppercap3");
		this.uppercap2 = this.cone.getChild("uppercap2");
		this.uppercap4 = this.cone.getChild("uppercap4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 38).addBox(-7.0F, -2.0F, -5.0F, 15.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 21).addBox(4.2302F, -2.0F, -0.0948F, 12.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 0.0F, 1.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -2.0F, 0.0F, 12.0F, 2.0F, 18.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(8.0F, 0.0F, -5.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -4.2F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition squish = main.addOrReplaceChild("squish", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 2.075F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = squish.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.1F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.4F, -0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cone = main.addOrReplaceChild("cone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = cone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 12).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -14.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r5 = cone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 21).addBox(0.0F, -2.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -9.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r6 = cone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 6).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(0, 21).addBox(0.0F, -4.5F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition uppercap = cone.addOrReplaceChild("uppercap", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -2.7F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r7 = uppercap.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition uppercap3 = cone.addOrReplaceChild("uppercap3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r8 = uppercap3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition uppercap2 = cone.addOrReplaceChild("uppercap2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -1.0F, 2.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = uppercap2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 29).addBox(-0.7F, 0.0F, -1.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition uppercap4 = cone.addOrReplaceChild("uppercap4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r10 = uppercap4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 15).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6556F, 0.0F, -0.5248F, 0.0F, -0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 55);
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