package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArandaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Bodyhead;
	private final ModelPart Head1;
	private final ModelPart Headunderside1;
	private final ModelPart Head2;
	private final ModelPart Headunderside2;
	private final ModelPart Headslope2;
	private final ModelPart Headslope1;

	public ArandaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Bodyhead = this.root.getChild("Bodyhead");
		this.Head1 = this.Bodyhead.getChild("Head1");
		this.Headunderside1 = this.Head1.getChild("Headunderside1");
		this.Head2 = this.Head1.getChild("Head2");
		this.Headunderside2 = this.Head2.getChild("Headunderside2");
		this.Headslope2 = this.Head2.getChild("Headslope2");
		this.Headslope1 = this.Head1.getChild("Headslope1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(26, 20).addBox(-7.0F, -2.0F, 6.0F, 12.0F, 3.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(0, 0).addBox(-3.2F, -4.0F, -6.0F, 12.0F, 5.0F, 14.0F, new CubeDeformation(0.002F))
				.texOffs(0, 40).addBox(-7.9209F, -6.0F, -0.6145F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(28, 31).addBox(-2.9209F, -5.0F, -11.6145F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 0).addBox(-5.0F, -1.0F, -4.5F, 10.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9347F, -2.5F, 4.3637F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 20).addBox(-2.6F, -2.5F, -5.5F, 7.0F, 8.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.5F, -4.5F, -3.5F, 0.0F, -0.3491F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-2.0F, -24.0F, 9.0F));

		PartDefinition Bodyhead = root.addOrReplaceChild("Bodyhead", CubeListBuilder.create().texOffs(61, 24).addBox(-3.5F, -1.5F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.5F, -1.5F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 67).addBox(-3.5F, 0.5F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 35).addBox(-3.5F, 4.5F, -2.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(59, 60).addBox(-3.5F, 3.5F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 29).addBox(-3.5F, 5.5F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(63, 64).addBox(-3.5F, -1.5F, -2.0F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 47).addBox(-3.5F, -1.5F, -6.0F, 7.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 47).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1F, 17.5F, -9.2F, 0.3912F, -0.4637F, -1.0856F));

		PartDefinition Bodyhead_r1 = Bodyhead.addOrReplaceChild("Bodyhead_r1", CubeListBuilder.create().texOffs(56, 13).addBox(-4.0F, -3.0F, -1.5F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1F, 2.5F, 3.2F, 0.0F, -0.6981F, 0.0F));

		PartDefinition Head1 = Bodyhead.addOrReplaceChild("Head1", CubeListBuilder.create().texOffs(0, 55).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.9F));

		PartDefinition Headunderside1 = Head1.addOrReplaceChild("Headunderside1", CubeListBuilder.create().texOffs(42, 60).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 6.5F, -0.1F, -0.3821F, 0.0F, 0.0F));

		PartDefinition Head2 = Head1.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(66, 46).addBox(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.5F, -3.9F));

		PartDefinition Headunderside2 = Head2.addOrReplaceChild("Headunderside2", CubeListBuilder.create().texOffs(65, 40).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 2.5F, 0.2F, -0.4245F, 0.0F, 0.0F));

		PartDefinition Headslope2 = Head2.addOrReplaceChild("Headslope2", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, 0.4426F, 0.0F, 0.0F));

		PartDefinition Headslope1 = Head1.addOrReplaceChild("Headslope1", CubeListBuilder.create().texOffs(21, 60).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.5F, -0.1F, 0.3821F, 0.0F, 0.0F));

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