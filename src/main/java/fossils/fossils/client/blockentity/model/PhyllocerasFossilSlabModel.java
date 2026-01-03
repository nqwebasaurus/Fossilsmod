package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PhyllocerasFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Shell1;
	private final ModelPart Shell2;
	private final ModelPart Shell3;
	private final ModelPart Shell4;
	private final ModelPart Shell5;
	private final ModelPart Shell6;
	private final ModelPart Shell7;
	private final ModelPart Shell8;
	private final ModelPart Shell9;
	private final ModelPart Shellbase;

	public PhyllocerasFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Shell1 = this.root.getChild("Shell1");
		this.Shell2 = this.Shell1.getChild("Shell2");
		this.Shell3 = this.Shell2.getChild("Shell3");
		this.Shell4 = this.Shell3.getChild("Shell4");
		this.Shell5 = this.Shell4.getChild("Shell5");
		this.Shell6 = this.Shell5.getChild("Shell6");
		this.Shell7 = this.Shell6.getChild("Shell7");
		this.Shell8 = this.Shell7.getChild("Shell8");
		this.Shell9 = this.Shell8.getChild("Shell9");
		this.Shellbase = this.Shell1.getChild("Shellbase");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(14, 27).addBox(-2.5F, -2.0F, -3.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(15, 55).addBox(-3.0F, 1.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-1.5F, -5.0F, -6.0F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.003F))
				.texOffs(16, 0).addBox(-1.5F, -2.0F, 1.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(49, 54).addBox(-3.5F, 1.0F, -7.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(38, 21).addBox(-4.0F, 1.0F, 1.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(46, 30).addBox(-3.5F, -2.0F, 4.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(57, 19).addBox(-3.0F, 1.0F, 6.6F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offset(0.0F, 21.0F, -2.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 9).addBox(-2.6F, -8.0F, -6.0F, 4.0F, 11.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0F, 6.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 0).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 8.0F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(49, 43).addBox(-2.5F, -4.98F, -4.8969F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -7.0F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -9.0F, 3.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 4.0F, -0.8116F, 0.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition Shell1 = root.addOrReplaceChild("Shell1", CubeListBuilder.create().texOffs(32, 48).addBox(-2.5F, -4.0F, -1.5F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-3.0F, 0.388F, 1.1055F, 0.4367F, -0.1128F, 0.2367F));

		PartDefinition Shell2 = Shell1.addOrReplaceChild("Shell2", CubeListBuilder.create().texOffs(38, 0).addBox(-2.49F, -8.0F, -5.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 4.025F, -1.5F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Shell3 = Shell2.addOrReplaceChild("Shell3", CubeListBuilder.create().texOffs(31, 34).addBox(-1.99F, -7.0F, -6.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Shell4 = Shell3.addOrReplaceChild("Shell4", CubeListBuilder.create().texOffs(0, 35).addBox(-1.99F, -7.0F, -5.0F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Shell5 = Shell4.addOrReplaceChild("Shell5", CubeListBuilder.create().texOffs(13, 42).addBox(-1.49F, -6.0F, -6.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Shell6 = Shell5.addOrReplaceChild("Shell6", CubeListBuilder.create().texOffs(0, 51).addBox(-1.49F, -6.0F, -4.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Shell7 = Shell6.addOrReplaceChild("Shell7", CubeListBuilder.create().texOffs(54, 9).addBox(-0.99F, -4.0F, -5.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Shell8 = Shell7.addOrReplaceChild("Shell8", CubeListBuilder.create().texOffs(29, 60).addBox(-0.99F, -4.0F, -3.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Shell9 = Shell8.addOrReplaceChild("Shell9", CubeListBuilder.create().texOffs(59, 40).addBox(-0.99F, -4.0F, -3.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Shellbase = Shell1.addOrReplaceChild("Shellbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 2.135F, -4.5F, -0.1274F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 73, 68);
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