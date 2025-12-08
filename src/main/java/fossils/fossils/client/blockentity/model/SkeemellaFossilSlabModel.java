package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SkeemellaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Root;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;

	public SkeemellaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Root = this.fossil.getChild("Root");
		this.Tail = this.Root.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -2.0F, -13.0F, 13.0F, 2.0F, 14.0F, new CubeDeformation(0.007F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-16.0F, -2.0F, -10.8F, 13.0F, 2.0F, 10.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(8.0F, 0.0F, 1.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 44).addBox(0.0F, -2.0F, 3.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, -16.0F, 0.0F, -0.192F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(37, 17).addBox(0.0228F, -2.0F, -6.9274F, 11.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 41).addBox(-18.8224F, -2.0F, 0.0621F, 12.0F, 2.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(13.0F, 0.0F, -1.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 30).addBox(-1.8815F, -2.0F, -0.1822F, 9.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 3.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r6 = fossil.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 30).addBox(-0.0414F, -2.0F, 0.1388F, 15.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7F, 0.0F, 4.6F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r7 = fossil.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(41, 0).addBox(-4.0F, -2.0F, 0.9F, 9.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition Root = fossil.addOrReplaceChild("Root", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8F, -2.01F, -2.4F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -6.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Tail = Root.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(5, 4).addBox(-0.5F, -1.0F, 0.1F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.49F, -0.6F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, 2.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 41).addBox(-0.47F, -0.99F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(37, 17).addBox(-0.47F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 30).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(3, 33).addBox(-0.47F, -0.99F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 4.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 22).addBox(-0.5F, -0.966F, -0.3598F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 30).addBox(-0.47F, -0.8987F, -0.346F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.7F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Tail5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.5186F, -0.7254F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(41, 0).addBox(-0.47F, -0.1402F, -0.0232F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 3.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Tail6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(5, 0).addBox(-0.5F, -0.1841F, -0.1262F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition cube_r12 = Tail7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.3841F, 0.1738F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 60);
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