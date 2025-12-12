package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BohemoharpesFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart main;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;

	public BohemoharpesFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.cube_r3 = this.fossil.getChild("cube_r3");
		this.cube_r4 = this.fossil.getChild("cube_r4");
		this.main = this.fossil.getChild("main");
		this.cube_r5 = this.main.getChild("cube_r5");
		this.cube_r6 = this.main.getChild("cube_r6");
		this.cube_r7 = this.main.getChild("cube_r7");
		this.cube_r8 = this.main.getChild("cube_r8");
		this.cube_r9 = this.main.getChild("cube_r9");
		this.cube_r10 = this.main.getChild("cube_r10");
		this.cube_r11 = this.main.getChild("cube_r11");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 42).addBox(-8.0F, -2.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2173F, -0.5F, -19.0846F, 18.0F, 1.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(11.7244F, -0.5F, 7.3835F, 0.0F, 1.6144F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 21).addBox(-0.1191F, -0.5F, -0.2495F, 18.0F, 1.0F, 19.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-14.3439F, -0.5F, 5.7238F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 46).addBox(0.0264F, -1.0F, -15.0704F, 7.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.4F, 0.0F, 5.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 21).addBox(-2.0F, -0.5F, -4.0F, 6.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.5F, 1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 6).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 24).addBox(-1.0F, -1.4F, 0.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, 3.4F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 33).addBox(-0.5F, -0.2625F, -2.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-1.0F, 0.0625F, 0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(-1.5F, 0.0125F, -1.225F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6125F, 4.025F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -1.1614F, -3.747F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9112F, 0.1723F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 11).addBox(-1.5F, -0.5888F, -3.0223F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 28).addBox(-2.5F, -0.2388F, 0.8277F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(2.5F, -0.2388F, 0.8277F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(56, 0).addBox(-5.5F, 0.7612F, -7.1723F, 11.0F, 0.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.5F, -0.0888F, -4.1723F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9112F, 0.1723F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 8).addBox(-1.916F, -0.2388F, -1.1933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9112F, 0.1723F, 0.1922F, -0.4293F, -0.0808F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 21).addBox(-1.0F, 0.525F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -0.95F, 2.0F, 0.1745F, -0.4363F, 0.0F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 28).addBox(0.0F, 0.525F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.95F, 2.0F, 0.1745F, 0.4363F, 0.0F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 13).addBox(1.916F, -0.2388F, -1.1933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9112F, 0.1723F, 0.1922F, 0.4293F, 0.0808F));

		return LayerDefinition.create(meshdefinition, 100, 70);
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