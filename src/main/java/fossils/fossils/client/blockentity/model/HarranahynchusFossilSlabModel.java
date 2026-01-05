package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HarranahynchusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart harranhynchus;
	private final ModelPart frontLeftFin;
	private final ModelPart frontRightFin;
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart backLeftFin;
	private final ModelPart backRightFin;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart matrix;

	public HarranahynchusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.harranhynchus = this.fossil.getChild("harranhynchus");
		this.frontLeftFin = this.harranhynchus.getChild("frontLeftFin");
		this.frontRightFin = this.harranhynchus.getChild("frontRightFin");
		this.head = this.harranhynchus.getChild("head");
		this.tail = this.harranhynchus.getChild("tail");
		this.backLeftFin = this.tail.getChild("backLeftFin");
		this.backRightFin = this.tail.getChild("backRightFin");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition harranhynchus = fossil.addOrReplaceChild("harranhynchus", CubeListBuilder.create().texOffs(15, 55).addBox(-0.875F, -1.0F, -6.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.45F, -0.075F, 0.55F, 0.0F, -1.4312F, 0.0F));

		PartDefinition frontLeftFin = harranhynchus.addOrReplaceChild("frontLeftFin", CubeListBuilder.create().texOffs(17, 40).addBox(0.0F, -0.725F, 0.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, -0.25F, -6.0F, 0.0F, -0.654F, 0.0F));

		PartDefinition frontRightFin = harranhynchus.addOrReplaceChild("frontRightFin", CubeListBuilder.create().texOffs(17, 35).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.975F, -0.975F, -6.0F, 0.0F, 1.3079F, 0.0F));

		PartDefinition head = harranhynchus.addOrReplaceChild("head", CubeListBuilder.create().texOffs(33, 20).addBox(0.0F, -1.0F, -8.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(34, 45).addBox(-0.75F, -0.975F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 56).addBox(1.75F, -0.975F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 34).addBox(0.5F, -1.0F, -11.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -6.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(34, 49).addBox(0.0F, -0.025F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.975F, -11.0F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(49, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 47).addBox(-1.0F, -0.025F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -0.975F, -11.0F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(59, 39).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, -0.475F, -3.25F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 57).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.475F, -4.2F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tail = harranhynchus.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(17, 45).addBox(-0.75F, 0.0F, -2.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition backLeftFin = tail.addOrReplaceChild("backLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.75F, 1.0F, -0.0193F, -0.2173F, 0.0894F));

		PartDefinition backRightFin = tail.addOrReplaceChild("backRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.75F, 1.0F, -0.0193F, 0.2173F, -0.0894F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r5 = tail2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 57).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.175F, 0.975F, 2.4F, 0.0F, -0.0698F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.2F, 0.0F, 4.0F));

		PartDefinition cube_r6 = tail3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(49, 56).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.525F, 0.975F, 2.825F, 0.0F, 0.0218F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(56, 20).addBox(-1.0F, -0.025F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r7 = tail4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 43).addBox(-0.975F, -3.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.975F, -0.975F, 1.45F, -1.0908F, 0.0F, -1.5708F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.875F, 1.45F, 4.825F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r8 = tail5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 35).addBox(-0.475F, -0.5F, -0.5F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(56, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.975F, -0.5F, 0.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-25.0F, -1.0F, -6.0F, 41.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(-15.55F, -0.95F, 0.325F, 32.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = matrix.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 20).addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -0.475F, -6.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r10 = matrix.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 40).addBox(-0.0165F, -0.5F, -0.0116F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.9842F, -0.4F, 2.9826F, 0.0F, 1.1781F, 0.0F));

		PartDefinition cube_r11 = matrix.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(33, 31).addBox(0.0F, -0.5F, -7.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.55F, -0.425F, 7.325F, 0.0F, 0.9163F, 0.0F));

		return LayerDefinition.create(meshdefinition, 102, 65);
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