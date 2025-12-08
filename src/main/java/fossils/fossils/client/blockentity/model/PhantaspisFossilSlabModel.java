package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PhantaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart Group;
	private final ModelPart Cephalon;
	private final ModelPart AntennaL;
	private final ModelPart AntennaL_r1;
	private final ModelPart AntennaL2;
	private final ModelPart Thorax;

	public PhantaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.cube_r3 = this.fossil.getChild("cube_r3");
		this.Group = this.fossil.getChild("Group");
		this.Cephalon = this.Group.getChild("Cephalon");
		this.AntennaL = this.Cephalon.getChild("AntennaL");
		this.AntennaL_r1 = this.AntennaL.getChild("AntennaL_r1");
		this.AntennaL2 = this.Cephalon.getChild("AntennaL2");
		this.Thorax = this.Group.getChild("Thorax");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 52).addBox(-10.0F, -2.0F, -11.0F, 18.0F, 2.0F, 22.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 5.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-29.0F, -2.0F, -21.0F, 30.0F, 2.0F, 22.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(16.0F, 0.0F, -11.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 72).addBox(-30.0F, -2.0F, -3.0F, 30.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 11.0F, 0.0F, -1.2654F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 25).addBox(-18.0F, -2.0F, -24.0F, 18.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 0.0F, 11.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition Group = fossil.addOrReplaceChild("Group", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, -2.1F, -1.8F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Cephalon = Group.addOrReplaceChild("Cephalon", CubeListBuilder.create().texOffs(0, 77).addBox(-0.7F, -0.1F, -12.0F, 7.0F, 0.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(45, 77).addBox(-6.3F, -0.1F, -10.0F, 7.0F, 0.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 25).addBox(3.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 25).addBox(-4.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 0).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-1.0F, -1.5F, -3.01F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-3.0F, -1.4F, -2.01F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition AntennaL = Cephalon.addOrReplaceChild("AntennaL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.1372F, 0.3027F, -0.0583F));

		PartDefinition AntennaL_r1 = AntennaL.addOrReplaceChild("AntennaL_r1", CubeListBuilder.create().texOffs(61, 25).addBox(-1.0F, 0.1F, -19.0F, 16.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition AntennaL2 = Cephalon.addOrReplaceChild("AntennaL2", CubeListBuilder.create().texOffs(59, 52).addBox(-15.0F, 0.1F, -17.0F, 16.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, -0.0005F, -0.1316F, 0.0F));

		PartDefinition Thorax = Group.addOrReplaceChild("Thorax", CubeListBuilder.create().texOffs(75, 80).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(11, 3).addBox(-2.0F, -1.0F, 6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-1.0F, -1.0F, 7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(30, 77).addBox(-4.0F, -0.1F, -2.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-3.0F, -0.1F, 6.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 150, 100);
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