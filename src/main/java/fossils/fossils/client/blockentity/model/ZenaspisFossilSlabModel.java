package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ZenaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart head;
	private final ModelPart headleft;
	private final ModelPart headright;

	public ZenaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.head = this.fossil.getChild("head");
		this.headleft = this.head.getChild("headleft");
		this.headright = this.head.getChild("headright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 46).addBox(-9.0F, -4.0F, -11.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.0F, -5.0F, -11.0F, 14.0F, 5.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(50, 0).addBox(2.0F, -6.0F, -11.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-9.0F, -5.0F, -3.0F, 4.0F, 5.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(40, 38).addBox(-9.0F, -6.0F, 4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0693F, -3.0F, 0.1538F, 4.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(9.0F, 0.0F, 3.0F, 0.0F, 0.4625F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 32).addBox(0.0F, -5.0F, 0.0F, 2.0F, 5.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(9.0F, 0.0F, -11.0F, 0.0F, -0.1484F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 27).addBox(-9.1F, -1.5F, 1.8F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -4.5F, -6.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 27).addBox(1.7F, -2.5F, -0.5F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(49, 47).addBox(-4.3F, -3.5F, -1.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(25, 52).addBox(-6.3F, -2.5F, -1.5F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -4.5F, -2.5F, 0.0F, 0.3054F, 0.0F));

		PartDefinition head = fossil.addOrReplaceChild("head", CubeListBuilder.create().texOffs(50, 6).addBox(-2.0F, 0.6504F, -1.6578F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(35, 27).addBox(-1.0F, 0.6504F, -4.4578F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -6.5004F, 4.0578F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 27).addBox(-1.0F, -6.7F, -8.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 52).addBox(-1.5F, -6.7F, -7.75F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7004F, 6.3422F, 0.5672F, 0.0F, 0.0F));

		PartDefinition eyes_r1 = head.addOrReplaceChild("eyes_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -3.9706F, -9.2396F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7004F, 8.7422F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -3.7F, -9.15F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7004F, 7.3422F, 0.1222F, 0.0F, 0.0F));

		PartDefinition headleft = head.addOrReplaceChild("headleft", CubeListBuilder.create(), PartPose.offset(0.2F, 1.4504F, 6.6922F));

		PartDefinition cube_r7 = headleft.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 63).addBox(-0.7695F, -0.49F, 5.2874F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.35F, -9.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r8 = headleft.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 60).addBox(5.45F, -1.76F, -6.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.35F, -0.35F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r9 = headleft.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(22, 33).addBox(-2.0037F, -1.26F, 0.3551F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.35F, -11.35F, 0.0F, 0.9948F, 0.0F));

		PartDefinition cube_r10 = headleft.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(35, 58).addBox(-4.0146F, -1.25F, 0.0393F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.35F, -9.0F, 0.0F, 0.4974F, 0.0F));

		PartDefinition cube_r11 = headleft.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(51, 62).addBox(2.255F, -0.48F, 6.4728F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.35F, -9.0F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r12 = headleft.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 59).addBox(-2.9034F, -1.26F, 4.8921F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.35F, -9.0F, 0.0F, 0.288F, 0.0F));

		PartDefinition cube_r13 = headleft.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 59).addBox(-0.6F, -3.05F, -7.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.2F, 0.35F, 0.65F, 0.0F, 0.0F, 0.5672F));

		PartDefinition headright = head.addOrReplaceChild("headright", CubeListBuilder.create(), PartPose.offset(-0.2F, 1.4504F, 6.6922F));

		PartDefinition cube_r14 = headright.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(61, 44).addBox(-1.2305F, -0.49F, 5.2874F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, 0.35F, -9.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r15 = headright.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(57, 59).addBox(-6.45F, -1.76F, -6.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.35F, -0.35F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r16 = headright.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(22, 27).addBox(0.0037F, -1.26F, 0.3551F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.35F, -11.35F, 0.0F, -0.9948F, 0.0F));

		PartDefinition cube_r17 = headright.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(50, 14).addBox(0.0146F, -1.25F, 0.0393F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, 0.35F, -9.0F, 0.0F, -0.4974F, 0.0F));

		PartDefinition cube_r18 = headright.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 62).addBox(-3.255F, -0.48F, 6.4728F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, 0.35F, -9.0F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r19 = headright.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(11, 59).addBox(-1.0966F, -1.26F, 4.8921F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, 0.35F, -9.0F, 0.0F, -0.288F, 0.0F));

		PartDefinition cube_r20 = headright.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(57, 38).addBox(-2.4F, -3.05F, -7.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.2F, 0.35F, 0.65F, 0.0F, 0.0F, -0.5672F));

		return LayerDefinition.create(meshdefinition, 75, 70);
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