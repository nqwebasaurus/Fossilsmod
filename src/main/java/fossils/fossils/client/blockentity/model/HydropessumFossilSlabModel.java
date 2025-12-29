package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HydropessumFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart frontLeftFin;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart jaw;

	public HydropessumFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.frontLeftFin = this.main.getChild("frontLeftFin");
		this.head = this.main.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(3.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 32).addBox(-0.1207F, -2.0F, -0.1544F, 9.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.7F, 0.0F, 16.0F, 0.0F, 1.4661F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 32).addBox(0.0414F, -2.0F, -0.06F, 14.0F, 2.0F, 21.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-16.7F, 0.0F, -5.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-29.0F, -2.0F, -11.0F, 22.0F, 2.0F, 29.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(13.0F, 0.0F, -14.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5F, -2.7F, -4.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 32).addBox(0.0F, -3.5F, -2.5F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2874F, 7.5002F, -2.4478F, 0.0F, 3.1416F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 43).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -3.3361F, 5.8145F, -2.5787F, 0.0F, -3.1416F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.2855F, 4.3341F, -2.3562F, 0.0F, 3.1416F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, 56).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.5142F, 2.4465F, 0.4363F, 0.0F, 3.1416F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -2.0F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.413F, -1.1625F, 0.6545F, 0.0F, -3.1416F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -2.5F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -2.0F, 2.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 56).addBox(0.0F, -1.5F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -13.6155F, 5.3454F, 0.781F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -2.5F, -4.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -18.0253F, 5.8129F, 0.6807F, 0.0F, -3.1416F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(9, 22).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -16.6319F, 2.3992F, 0.5498F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -17.9012F, 1.1639F, 0.781F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = main.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -16.3982F, 1.0821F, 0.781F, 0.0F, -3.1416F));

		PartDefinition cube_r15 = main.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 19).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -13.8785F, -1.22F, -2.4173F, 0.0F, 3.1416F));

		PartDefinition cube_r16 = main.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(11, 56).addBox(-0.1F, -1.5F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -14.5F, 1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = main.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.5F, -6.0F, 0.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -8.5F, 2.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-0.5F, -8.5564F, 7.3916F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.0115F, 0.6737F, 2.4435F, 0.0F, 3.1416F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0564F, 1.6084F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r20 = tail.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(42, 56).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.0331F, 0.6553F, -2.4653F, 0.0F, -3.1416F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0564F, 2.6084F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(49, 56).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5F));

		PartDefinition cube_r22 = tail3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, -6.0F, -2.5F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition frontLeftFin = main.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.025F, -4.9F, -3.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r23 = frontLeftFin.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-0.5F, -13.0F, -4.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 56).addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 4.5958F, -1.636F, 2.0769F, 0.0F, 3.1416F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 32).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4648F, -0.4182F, -0.7592F, 0.0F, -3.1416F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 46).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 7.2231F, -0.4784F, 0.9207F, 0.0F, -3.1416F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 5.0F, -0.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 4.024F, -1.882F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r28 = eye.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 4.024F, -1.882F, -0.5236F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9483F, -1.2497F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r29 = jaw.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.017F, -1.5992F, 2.3387F, 0.0F, 3.1416F));

		PartDefinition cube_r30 = jaw.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(6, 0).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.283F, -1.5508F, 2.0769F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 112, 75);
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