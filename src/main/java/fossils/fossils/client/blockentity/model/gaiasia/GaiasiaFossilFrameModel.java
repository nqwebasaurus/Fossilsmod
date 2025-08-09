package fossils.fossils.client.blockentity.model.gaiasia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GaiasiaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart upperjaw;
	private final ModelPart leftHead;
	private final ModelPart rightHead;
	private final ModelPart lowerjaw;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public GaiasiaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.head = this.body.getChild("head");
		this.upperjaw = this.head.getChild("upperjaw");
		this.leftHead = this.upperjaw.getChild("leftHead");
		this.rightHead = this.upperjaw.getChild("rightHead");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.armL = this.body.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.body.getChild("armL3");
		this.armL4 = this.armL3.getChild("armL4");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.legL = this.body3.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.body3.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -7.4F, -6.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 28).addBox(-1.1F, 0.5255F, -7.4076F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, -1.3303F, 0.2378F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, -3).addBox(-0.7F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.6826F, -9.0229F, 1.5708F, -0.0349F, 1.5708F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 2).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.6844F, -9.1276F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, 0.2F, 0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1F, -12.85F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-1, 15).addBox(-0.5F, 0.3F, -1.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2F, -15.25F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -16.5F, -0.0552F, 0.3463F, 0.1828F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4F, 3.0F));

		PartDefinition leftHead = upperjaw.addOrReplaceChild("leftHead", CubeListBuilder.create(), PartPose.offset(1.9139F, -1.6039F, -10.8179F));

		PartDefinition rightHead = upperjaw.addOrReplaceChild("rightHead", CubeListBuilder.create(), PartPose.offset(-1.9139F, -1.6039F, -10.8179F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5F, 2.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition armL = body.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.25F, 3.4F, -9.1F, -0.7366F, 0.9353F, -0.1741F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition armL3 = body.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.25F, 3.4F, -9.1F, 0.0F, -0.6545F, 0.0F));

		PartDefinition armL4 = armL3.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 1.25F, 0.1329F, 0.2174F, 0.0117F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, 0.2F, 0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.35F, -0.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, 9.0F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 3).addBox(-2.4F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.1753F, 8.1509F, -1.5708F, -0.0524F, -1.5708F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 7).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.9921F, 4.6557F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.2F, 0.6F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition legL = body3.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, 3.2F, 7.75F, -0.1616F, 0.3086F, 0.1465F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 0.0F, 3.0F, 0.2618F, -0.2618F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, -0.25F, 2.25F, 0.0F, -0.2182F, 0.0F));

		PartDefinition legL4 = body3.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.25F, 3.2F, 7.75F, -0.072F, -1.0028F, 0.0406F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 0.0F, 3.0F, 0.2618F, 0.2618F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -0.25F, 2.25F, 0.0F, 0.2182F, 0.0F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.45F, 9.0F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, 0.2F, 2.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0198F, -1.9988F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3698F, 9.7012F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r11 = tail2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.3F, 0.0F, -0.0175F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.05F, 11.3F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r12 = tail3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0175F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}