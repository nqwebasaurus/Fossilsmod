package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class FurcasterFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart core;
	private final ModelPart arm1base;
	private final ModelPart arm1a;
	private final ModelPart arm1b;
	private final ModelPart arm1c;
	private final ModelPart arm1d;
	private final ModelPart arm1e;
	private final ModelPart arm1e_r1;
	private final ModelPart arm2base;
	private final ModelPart arm2a;
	private final ModelPart arm2b;
	private final ModelPart arm2c;
	private final ModelPart arm2d;
	private final ModelPart arm2e;
	private final ModelPart arm5base;
	private final ModelPart arm5a;
	private final ModelPart arm5b;
	private final ModelPart arm5c;
	private final ModelPart arm5d;
	private final ModelPart arm5e;
	private final ModelPart arm3base;
	private final ModelPart arm3a;
	private final ModelPart arm3b;
	private final ModelPart arm3c;
	private final ModelPart arm3d;
	private final ModelPart arm3e;
	private final ModelPart arm4base;
	private final ModelPart arm4a;
	private final ModelPart arm4b;
	private final ModelPart arm4c;
	private final ModelPart arm4d;
	private final ModelPart arm4d_r1;
	private final ModelPart arm4e;
	private final ModelPart arm4e2;
	private final ModelPart arm4e_r1;

	public FurcasterFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.core = this.root.getChild("core");
		this.arm1base = this.core.getChild("arm1base");
		this.arm1a = this.arm1base.getChild("arm1a");
		this.arm1b = this.arm1a.getChild("arm1b");
		this.arm1c = this.arm1b.getChild("arm1c");
		this.arm1d = this.arm1c.getChild("arm1d");
		this.arm1e = this.arm1d.getChild("arm1e");
		this.arm1e_r1 = this.arm1e.getChild("arm1e_r1");
		this.arm2base = this.core.getChild("arm2base");
		this.arm2a = this.arm2base.getChild("arm2a");
		this.arm2b = this.arm2a.getChild("arm2b");
		this.arm2c = this.arm2b.getChild("arm2c");
		this.arm2d = this.arm2c.getChild("arm2d");
		this.arm2e = this.arm2d.getChild("arm2e");
		this.arm5base = this.core.getChild("arm5base");
		this.arm5a = this.arm5base.getChild("arm5a");
		this.arm5b = this.arm5a.getChild("arm5b");
		this.arm5c = this.arm5b.getChild("arm5c");
		this.arm5d = this.arm5c.getChild("arm5d");
		this.arm5e = this.arm5d.getChild("arm5e");
		this.arm3base = this.core.getChild("arm3base");
		this.arm3a = this.arm3base.getChild("arm3a");
		this.arm3b = this.arm3a.getChild("arm3b");
		this.arm3c = this.arm3b.getChild("arm3c");
		this.arm3d = this.arm3c.getChild("arm3d");
		this.arm3e = this.arm3d.getChild("arm3e");
		this.arm4base = this.core.getChild("arm4base");
		this.arm4a = this.arm4base.getChild("arm4a");
		this.arm4b = this.arm4a.getChild("arm4b");
		this.arm4c = this.arm4b.getChild("arm4c");
		this.arm4d = this.arm4c.getChild("arm4d");
		this.arm4d_r1 = this.arm4d.getChild("arm4d_r1");
		this.arm4e = this.arm4d.getChild("arm4e");
		this.arm4e2 = this.arm4e.getChild("arm4e2");
		this.arm4e_r1 = this.arm4e2.getChild("arm4e_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-35.0F, -2.0F, -36.0F, 71.0F, 2.0F, 71.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(18.0F, -24.0F, 11.0F));

		PartDefinition core = root.addOrReplaceChild("core", CubeListBuilder.create(), PartPose.offset(0.0F, 22.8F, 0.0F));

		PartDefinition core_r1 = core.addOrReplaceChild("core_r1", CubeListBuilder.create().texOffs(50, 12).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.17F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition arm1base = core.addOrReplaceChild("arm1base", CubeListBuilder.create().texOffs(60, 85).addBox(-2.0F, -0.6F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -1.5F));

		PartDefinition arm1a = arm1base.addOrReplaceChild("arm1a", CubeListBuilder.create().texOffs(0, 26).addBox(-1.5F, -0.5F, -11.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition arm1b = arm1a.addOrReplaceChild("arm1b", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, -0.5F, -10.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition arm1c = arm1b.addOrReplaceChild("arm1c", CubeListBuilder.create().texOffs(16, 85).addBox(-1.0F, -0.5F, -9.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition arm1d = arm1c.addOrReplaceChild("arm1d", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition arm1e = arm1d.addOrReplaceChild("arm1e", CubeListBuilder.create().texOffs(70, 85).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -12.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition arm1e_r1 = arm1e.addOrReplaceChild("arm1e_r1", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, -0.5F, -7.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.0F, -0.1745F, 0.0F));

		PartDefinition arm2base = core.addOrReplaceChild("arm2base", CubeListBuilder.create().texOffs(45, 85).addBox(-2.0F, -0.58F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.5F, -0.5F, 0.0F, -1.117F, 0.0F));

		PartDefinition arm2a = arm2base.addOrReplaceChild("arm2a", CubeListBuilder.create().texOffs(18, 15).addBox(-1.5F, -0.5F, -11.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition arm2b = arm2a.addOrReplaceChild("arm2b", CubeListBuilder.create().texOffs(42, 58).addBox(-1.0F, -0.5F, -10.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition arm2c = arm2b.addOrReplaceChild("arm2c", CubeListBuilder.create().texOffs(71, 74).addBox(-1.0F, -0.5F, -9.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition arm2d = arm2c.addOrReplaceChild("arm2d", CubeListBuilder.create().texOffs(15, 42).addBox(-0.5F, -0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition arm2e = arm2d.addOrReplaceChild("arm2e", CubeListBuilder.create().texOffs(30, 44).addBox(-0.5F, -0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -12.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition arm5base = core.addOrReplaceChild("arm5base", CubeListBuilder.create().texOffs(39, 74).addBox(-2.0F, -0.62F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.5F, -0.5F, 0.0F, 1.117F, 0.0F));

		PartDefinition arm5a = arm5base.addOrReplaceChild("arm5a", CubeListBuilder.create().texOffs(18, 2).addBox(-1.5F, -0.5F, -11.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition arm5b = arm5a.addOrReplaceChild("arm5b", CubeListBuilder.create().texOffs(17, 58).addBox(-1.0F, -0.5F, -10.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition arm5c = arm5b.addOrReplaceChild("arm5c", CubeListBuilder.create().texOffs(48, 74).addBox(-1.0F, -0.5F, -9.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition arm5d = arm5c.addOrReplaceChild("arm5d", CubeListBuilder.create().texOffs(35, 16).addBox(-0.5F, -0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition arm5e = arm5d.addOrReplaceChild("arm5e", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -12.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition arm3base = core.addOrReplaceChild("arm3base", CubeListBuilder.create().texOffs(30, 85).addBox(-2.0F, -0.62F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 1.2F, 0.0F, -2.4435F, 0.0F));

		PartDefinition arm3a = arm3base.addOrReplaceChild("arm3a", CubeListBuilder.create().texOffs(0, 13).addBox(-1.5F, -0.5F, -11.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, -1.2654F, 0.0F));

		PartDefinition arm3b = arm3a.addOrReplaceChild("arm3b", CubeListBuilder.create().texOffs(45, 44).addBox(-1.0F, -0.5F, -10.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition arm3c = arm3b.addOrReplaceChild("arm3c", CubeListBuilder.create().texOffs(25, 74).addBox(-1.0F, -0.5F, -9.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition arm3d = arm3c.addOrReplaceChild("arm3d", CubeListBuilder.create().texOffs(17, 28).addBox(-0.5F, -0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition arm3e = arm3d.addOrReplaceChild("arm3e", CubeListBuilder.create().texOffs(32, 30).addBox(-0.5F, -0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -12.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition arm4base = core.addOrReplaceChild("arm4base", CubeListBuilder.create().texOffs(62, 74).addBox(-2.0F, -0.6F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 1.2F, 0.0F, 2.4435F, 0.0F));

		PartDefinition arm4a = arm4base.addOrReplaceChild("arm4a", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, -11.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition arm4b = arm4a.addOrReplaceChild("arm4b", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -0.5F, -10.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition arm4c = arm4b.addOrReplaceChild("arm4c", CubeListBuilder.create().texOffs(47, 30).addBox(-1.0F, -0.5F, -9.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition arm4d = arm4c.addOrReplaceChild("arm4d", CubeListBuilder.create().texOffs(15, 74).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 1.0036F, 0.0F));

		PartDefinition arm4d_r1 = arm4d.addOrReplaceChild("arm4d_r1", CubeListBuilder.create().texOffs(50, 20).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition arm4e = arm4d.addOrReplaceChild("arm4e", CubeListBuilder.create().texOffs(57, 56).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.0F, -11.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition arm4e2 = arm4e.addOrReplaceChild("arm4e2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5647F, 0.0F, -4.6289F, 0.0F, -0.3054F, 0.0F));

		PartDefinition arm4e_r1 = arm4e2.addOrReplaceChild("arm4e_r1", CubeListBuilder.create().texOffs(32, 58).addBox(-0.5F, -0.5F, -6.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4647F, 0.0F, 0.1471F, 0.0F, 0.6981F, 0.0F));

		return LayerDefinition.create(meshdefinition, 288, 100);
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