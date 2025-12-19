package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BethesdaichthysFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart backLeftFin;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart frontLeftFin;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public BethesdaichthysFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.backLeftFin = this.root.getChild("backLeftFin");
		this.head = this.root.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.frontLeftFin = this.head.getChild("frontLeftFin");
		this.tail = this.root.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -16.0F, 13.0F, 2.0F, 44.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 70).addBox(-30.0F, -2.0F, -3.0F, 27.0F, 2.0F, 20.0F, new CubeDeformation(0.003F)), PartPose.offset(7.0F, 24.0F, -4.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -2.0F, 0.0F, 29.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.0F, 0.0F, -3.0F, 0.0F, 0.4712F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 0).addBox(0.8F, -2.0F, -15.5F, 9.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 28.0F, 0.0F, 0.6807F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -2.2F, 0.0F, -0.3927F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = root.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 13).addBox(0.0F, -4.5F, -5.0F, 0.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition backLeftFin = root.addOrReplaceChild("backLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 3.8F, -0.5F, 0.2988F, 0.0F, 0.0F));

		PartDefinition cube_r4 = backLeftFin.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -2.5F, -2.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-0.5F, 4.4929F, -4.9778F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 0).addBox(0.3F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.0568F, -5.2393F, 0.5236F, 0.0F, -3.1416F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 57).addBox(0.5F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -4.4473F, -4.1478F, -2.618F, 0.0F, -3.1416F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -2.5F, -2.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8F, -2.8665F, -1.4337F, -2.9234F, 0.0F, -3.1416F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 8).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -4.6505F, -7.5852F, 0.2182F, 0.0F, -3.1416F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(18, 0).addBox(0.1F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -5.112F, -6.6635F, 0.2182F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.05F, -3.9998F, -7.4222F, 0.2182F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -4.2439F, -7.3681F, 0.2182F, 0.0F, -3.1416F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(6, 0).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -4.9588F, -7.9182F, -0.6109F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 36).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -5.977F, -5.1486F, 2.6616F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(21, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5333F, -4.0982F, 0.5236F, 0.0F, -3.1416F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 47).addBox(0.0F, -2.5F, -2.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -6.0072F, -1.1778F, 2.8362F, 0.0F, -3.1416F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2198F, -4.2945F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r16 = jaw.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(22, 5).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.15F, -1.7297F, -3.9872F, 0.3491F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = jaw.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -1.3494F, -3.6733F, 0.3491F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = jaw.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(5, 23).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.05F, -0.779F, -1.8444F, 0.5236F, 0.0F, -3.1416F));

		PartDefinition cube_r19 = jaw.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(26, 15).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3125F, -1.5364F, 0.5236F, 0.0F, -3.1416F));

		PartDefinition frontLeftFin = head.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, -1.4428F, -2.0222F, 0.1129F, 0.0F, 0.0F));

		PartDefinition cube_r20 = frontLeftFin.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(32, 29).addBox(0.0F, -3.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail = root.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, 4.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(25, 0).addBox(0.0F, -3.5F, -2.5F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -3.6311F, 4.6756F, -1.9853F, 0.0F, 3.1416F));

		PartDefinition cube_r22 = tail.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(16, 33).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5796F, 2.378F, 0.4145F, 0.0F, -3.1416F));

		PartDefinition cube_r23 = tail.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -3.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 3.9547F, 4.4224F, 0.9599F, 0.0F, -3.1416F));

		PartDefinition cube_r24 = tail.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6155F, 2.3712F, -0.3927F, 0.0F, -3.1416F));

		PartDefinition cube_r25 = tail.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0F, 2.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.5F));

		PartDefinition cube_r26 = tail2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(30, 7).addBox(0.0F, -2.0F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0F, 3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 6.0F));

		PartDefinition cube_r27 = tail3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.0F, -6.0F, 0.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5266F, 3.6128F, 0.3927F, 0.0F, -3.1416F));

		PartDefinition cube_r28 = tail3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -1.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.6602F, 4.0699F, -0.4058F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 122, 94);
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