package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PrionolepisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart prionolepis;
	private final ModelPart backLeftFin;
	private final ModelPart backRightFin;
	private final ModelPart frontLeftFin;
	private final ModelPart frontRightFin;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart matrix;

	public PrionolepisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.prionolepis = this.fossil.getChild("prionolepis");
		this.backLeftFin = this.prionolepis.getChild("backLeftFin");
		this.backRightFin = this.prionolepis.getChild("backRightFin");
		this.frontLeftFin = this.prionolepis.getChild("frontLeftFin");
		this.frontRightFin = this.prionolepis.getChild("frontRightFin");
		this.head = this.prionolepis.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.prionolepis.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition prionolepis = fossil.addOrReplaceChild("prionolepis", CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -0.9636F, -0.3681F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(20, 24).addBox(0.5F, -0.9636F, -4.3681F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7613F, 0.3709F, -0.5011F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = prionolepis.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 18).addBox(1.5F, -2.0F, -3.75F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 2.0364F, -0.3681F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backLeftFin = prionolepis.addOrReplaceChild("backLeftFin", CubeListBuilder.create().texOffs(34, 29).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5364F, 4.3819F, 0.3654F, 0.0F, 0.0F));

		PartDefinition backRightFin = prionolepis.addOrReplaceChild("backRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, 1.5364F, 4.3819F, -0.5509F, -0.3007F, 0.18F));

		PartDefinition frontLeftFin = prionolepis.addOrReplaceChild("frontLeftFin", CubeListBuilder.create().texOffs(16, 32).addBox(-0.1F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.625F, 1.5364F, -3.6181F, 0.1434F, 0.0F, 0.0F));

		PartDefinition frontRightFin = prionolepis.addOrReplaceChild("frontRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 1.5364F, -3.6181F, -0.4674F, -0.3542F, 0.1733F));

		PartDefinition head = prionolepis.addOrReplaceChild("head", CubeListBuilder.create().texOffs(6, 32).addBox(1.0F, -1.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.5364F, -3.8681F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 11).addBox(0.45F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.5267F, -7.7352F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 25).addBox(0.45F, 0.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(20, 30).addBox(0.475F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 32).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2376F, -5.1283F, -0.0894F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 32).addBox(1.5F, -3.0F, -5.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(28, 30).addBox(1.525F, -3.0F, -4.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5F, 3.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.2247F, -2.4796F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = jaw.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 11).addBox(0.45F, -0.4F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.698F, -5.2556F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail = prionolepis.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6223F, 4.2962F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 27).addBox(0.975F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.414F, 0.0857F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 26).addBox(0.975F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.586F, 0.0857F, -0.0305F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(28, 11).addBox(0.45F, -1.2166F, -0.2043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2194F, 3.7899F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 32).addBox(1.925F, -0.2F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6572F, 0.7878F, 0.4756F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 16).addBox(0.45F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7834F, -0.2043F, 0.1265F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 21).addBox(0.45F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offset(0.0F, -0.6166F, 3.2957F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(12, 18).addBox(1.425F, -2.5F, -0.25F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.5F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -1.0F, -6.0F, 35.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 95, 40);
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