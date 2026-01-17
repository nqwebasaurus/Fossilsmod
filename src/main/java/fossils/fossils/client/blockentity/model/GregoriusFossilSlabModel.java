package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GregoriusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart frontLeftFin;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart backRightFin;
	private final ModelPart backLeftFin;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public GregoriusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body2 = this.fossil.getChild("body2");
		this.body = this.body2.getChild("body");
		this.frontLeftFin = this.body.getChild("frontLeftFin");
		this.head = this.body.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.body2.getChild("tail");
		this.backRightFin = this.tail.getChild("backRightFin");
		this.backLeftFin = this.tail.getChild("backLeftFin");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 22.5F, -1.25F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 68).addBox(-15.9655F, -1.0F, -3.9017F, 16.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.7307F, 1.5F, 3.5301F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 41).addBox(-11.3F, -1.0F, -9.0F, 13.0F, 1.0F, 17.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(14.3946F, 1.5F, -3.8302F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 60).addBox(-0.0871F, -1.0F, 0.0449F, 7.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9345F, 1.5F, -17.7788F, 0.0F, -0.9119F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 41).addBox(-3.5F, -1.0F, -9.0F, 7.0F, 1.0F, 25.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-7.9905F, 1.5F, -0.8038F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 0.5F, -17.0F, 14.0F, 1.0F, 39.0F, new CubeDeformation(0.01F))
				.texOffs(24, 15).addBox(-10.0F, 0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.5F, 0.0F, 1.25F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body2 = fossil.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 0).addBox(0.525F, -8.75F, -5.0F, 1.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 1.5F, 1.25F, 0.48F, 0.0F, -1.5708F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 16).addBox(-0.525F, -1.4396F, 0.2263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.9F, -9.4843F, -2.6603F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -3.0896F, -0.3237F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -9.4843F, -2.6603F, -0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 54).addBox(2.5F, 0.0046F, -3.9949F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -9.675F, -1.0F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 0).addBox(2.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.0F, -9.5F, 2.0F, -0.0567F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(20, 22).addBox(0.5F, -8.0F, -8.5F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 48).addBox(1.9F, 0.0F, -4.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -9.25F, -4.75F, 0.3142F, 0.0F, 0.0F));

		PartDefinition frontLeftFin = body.addOrReplaceChild("frontLeftFin", CubeListBuilder.create().texOffs(8, 41).addBox(-1.0F, 0.5F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -2.0F, -6.25F, 0.0017F, -0.3163F, 1.6212F));

		PartDefinition cube_r11 = frontLeftFin.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 0).addBox(-3.5F, 0.0F, -2.5F, 7.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1817F, 0.8004F, 2.0242F, -0.0175F, 0.0F, -0.0436F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(48, 46).addBox(1.25F, -4.5F, -2.25F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 60).addBox(1.0F, -4.35F, -4.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.25F, -1.5F, -9.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(48, 53).addBox(0.5F, -0.0095F, -2.9568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -5.1082F, -3.2961F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(9, 45).addBox(1.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.5F, 0.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -1.1F, -3.925F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -2.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(49, 60).addBox(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.5086F, -2.2994F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r16 = jaw.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(7, 52).addBox(0.5F, -0.9844F, -3.9954F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 1.6015F, -0.1708F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r17 = jaw.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.325F, -0.69F, -3.3631F, -2.4435F, 0.0F, 3.1416F));

		PartDefinition cube_r18 = jaw.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 41).addBox(0.5F, -0.1F, -3.925F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0086F, -0.2006F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail = body2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 20).addBox(1.0F, -0.75F, 0.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.75F, 1.75F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(26, 29).addBox(0.0F, -1.5F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.525F, -2.2968F, 5.3909F, -2.4435F, 0.0F, -3.1416F));

		PartDefinition cube_r20 = tail.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 60).addBox(1.425F, -0.0346F, -0.0024F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.85F, 3.9F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(10, 0).addBox(0.425F, -2.222F, -0.7495F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.797F, 2.349F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 41).addBox(1.95F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.75F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(18, 6).addBox(0.975F, -2.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.3011F, 0.0F, 0.0F));

		PartDefinition backRightFin = tail.addOrReplaceChild("backRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.172F, 3.4077F, 1.5869F, 0.5286F, -0.3263F, 0.8108F));

		PartDefinition backLeftFin = tail.addOrReplaceChild("backLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(2.172F, 3.4077F, 1.5869F, 0.5782F, 0.0086F, -0.0162F));

		PartDefinition cube_r24 = backLeftFin.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.675F, 1.5F, 0.0F, 3.1416F, 0.0F, -3.098F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(10, 29).addBox(0.5F, -1.5883F, -0.8875F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.5F, 1.1883F, 5.5375F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(7, 58).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.025F, 1.8023F, 2.33F, 2.9671F, 0.0F, -3.1416F));

		PartDefinition cube_r26 = tail2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(40, 49).addBox(0.9F, -2.0F, 1.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.4117F, -0.8875F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(27, 6).addBox(1.45F, -0.075F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.0F, -2.1383F, -0.0625F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(31, 22).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5883F, 3.6125F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -0.25F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(11, 10).addBox(0.0F, -4.5F, -3.0F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.5F, 3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r29 = tail4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 55).addBox(-0.6F, -0.25F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -0.25F, 0.0F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 80);
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