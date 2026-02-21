package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RostropycnodusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart rostropycnodus;
	private final ModelPart spike;
	private final ModelPart spike2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart frontLeftFin;
	private final ModelPart backspine;
	private final ModelPart backspine2;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart matrix;

	public RostropycnodusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.rostropycnodus = this.fossil.getChild("rostropycnodus");
		this.spike = this.rostropycnodus.getChild("spike");
		this.spike2 = this.rostropycnodus.getChild("spike2");
		this.jaw = this.rostropycnodus.getChild("jaw");
		this.tail = this.rostropycnodus.getChild("tail");
		this.frontLeftFin = this.tail.getChild("frontLeftFin");
		this.backspine = this.tail.getChild("backspine");
		this.backspine2 = this.tail.getChild("backspine2");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(2.5F, 24.0F, 0.0F));

		PartDefinition rostropycnodus = fossil.addOrReplaceChild("rostropycnodus", CubeListBuilder.create().texOffs(16, 31).addBox(0.0F, -1.6F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(2, 19).addBox(0.025F, -5.6F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -1.05F, 3.0F, 1.8762F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = rostropycnodus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -5.675F, -2.075F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = rostropycnodus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 22).addBox(-0.025F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.1604F, -8.1632F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = rostropycnodus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 31).addBox(-0.025F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8525F, -9.6425F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = rostropycnodus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 38).addBox(-0.025F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -7.8241F, -1.5478F, 1.0603F, 0.0F, 0.0F));

		PartDefinition cube_r5 = rostropycnodus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 37).addBox(-0.025F, 0.0F, -0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5859F, -3.1184F, 0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r6 = rostropycnodus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 43).addBox(0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.3553F, -3.2392F, 1.6537F, 0.0F, 0.0F));

		PartDefinition cube_r7 = rostropycnodus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 38).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.9259F, -4.4774F, 0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r8 = rostropycnodus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(37, 14).addBox(0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -6.6642F, -2.881F, 0.3185F, 0.0F, 0.0F));

		PartDefinition cube_r9 = rostropycnodus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 29).addBox(0.5F, 0.0F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.1F, 2.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition spike = rostropycnodus.addOrReplaceChild("spike", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7F, 1.5F, -0.5263F, 0.0F, 0.0F));

		PartDefinition spike2 = rostropycnodus.addOrReplaceChild("spike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.7F, 1.5F, -0.5763F, -0.4063F, 0.4128F));

		PartDefinition jaw = rostropycnodus.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2254F, -5.1863F));

		PartDefinition cube_r10 = jaw.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 38).addBox(-0.025F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 1.0368F, -2.3145F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = jaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 38).addBox(-0.025F, 0.025F, 1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.1639F, -4.0974F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail = rostropycnodus.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -3.9393F, 1.2429F));

		PartDefinition frontLeftFin = tail.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 2.3393F, 1.2321F, 0.5564F, 0.1166F, -0.1848F));

		PartDefinition backspine = tail.addOrReplaceChild("backspine", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2469F, 1.3736F, 1.4006F, -0.3404F, 0.2419F, -0.3565F));

		PartDefinition backspine2 = tail.addOrReplaceChild("backspine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2469F, 1.3736F, 1.4006F, -0.3404F, -0.2419F, 0.3565F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.95F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, -0.05F, 2.5F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -2.0F, -7.0F, 19.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(17, 19).addBox(2.0F, -1.975F, 3.95F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(17, 25).addBox(-12.0F, -1.975F, 3.95F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = matrix.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(23, 14).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.075F, 0.05F, 6.525F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r13 = matrix.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 14).addBox(-7.0F, -2.0F, -2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.375F, 0.075F, 6.7F, 0.0F, -0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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