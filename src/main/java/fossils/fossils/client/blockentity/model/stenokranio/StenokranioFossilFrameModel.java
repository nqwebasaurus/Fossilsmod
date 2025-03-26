package fossils.fossils.client.blockentity.model.stenokranio;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StenokranioFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart eyeright;
	private final ModelPart eyeleft;
	private final ModelPart armleft;
	private final ModelPart armleft2;
	private final ModelPart handleft;
	private final ModelPart armright;
	private final ModelPart armright2;
	private final ModelPart handright;
	private final ModelPart legleft;
	private final ModelPart legleft2;
	private final ModelPart footleft;
	private final ModelPart legright;
	private final ModelPart legright2;
	private final ModelPart footright;

	public StenokranioFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hip.getChild("body");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.eyeright = this.head.getChild("eyeright");
		this.eyeleft = this.head.getChild("eyeleft");
		this.armleft = this.body.getChild("armleft");
		this.armleft2 = this.armleft.getChild("armleft2");
		this.handleft = this.armleft2.getChild("handleft");
		this.armright = this.body.getChild("armright");
		this.armright2 = this.armright.getChild("armright2");
		this.handright = this.armright2.getChild("handright");
		this.legleft = this.hip.getChild("legleft");
		this.legleft2 = this.legleft.getChild("legleft2");
		this.footleft = this.legleft2.getChild("footleft");
		this.legright = this.hip.getChild("legright");
		this.legright2 = this.legright.getChild("legright2");
		this.footright = this.legright2.getChild("footright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.7F, -5.75F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9074F, -4.8F, -6.1235F, -0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.75F, -1.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.9074F, -4.8F, -6.1235F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(3.4F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8F, -7.5F, 4.9F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.8F, -7.5F, 4.9F, 0.0F, -0.2618F, 0.0F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body4_r1 = hip.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.7384F, -0.2503F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -8.9847F, 1.8393F, -0.144F, 0.0F, 0.0F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(25, 11).addBox(-0.5F, -0.3007F, -0.9289F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -6.75F, 9.0F, -0.3981F, -0.1611F, 0.0674F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(20, 24).addBox(-0.5F, 0.45F, 0.0517F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.75F, 3.4F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.4892F, -0.4338F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1492F, 3.8629F, 0.1795F, -0.2979F, -0.0761F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, 2.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition body3_r1 = body.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(11, 10).addBox(-0.5F, 0.6903F, -0.1095F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.75F, -6.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(34, 15).addBox(-0.5F, -0.2F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.55F, -9.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(32, 33).addBox(-0.5F, -1.29F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -10.0F, -0.0421F, 0.002F, 0.0227F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.75F, 0.0F, -0.0436F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition eyeright = head.addOrReplaceChild("eyeright", CubeListBuilder.create(), PartPose.offset(-1.3F, -2.05F, -2.75F));

		PartDefinition eyeleft = head.addOrReplaceChild("eyeleft", CubeListBuilder.create(), PartPose.offset(1.3F, -2.05F, -2.75F));

		PartDefinition armleft = body.addOrReplaceChild("armleft", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, 2.0F, -7.75F, 0.0115F, 0.1304F, 0.088F));

		PartDefinition armleft2 = armleft.addOrReplaceChild("armleft2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, -0.25F, 0.0F, -0.3254F, -0.2834F, -0.0878F));

		PartDefinition handleft = armleft2.addOrReplaceChild("handleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2239F, -0.4309F, 0.348F, -0.0018F, -0.0094F));

		PartDefinition armright = body.addOrReplaceChild("armright", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.25F, 2.0F, -7.75F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armright2 = armright.addOrReplaceChild("armright2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.25F, -0.25F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition handright = armright2.addOrReplaceChild("handright", CubeListBuilder.create(), PartPose.offset(0.0F, 3.2239F, -0.4309F));

		PartDefinition legleft = hip.addOrReplaceChild("legleft", CubeListBuilder.create(), PartPose.offsetAndRotation(1.45F, -5.05F, 6.0F, -0.2024F, 0.4256F, -0.3282F));

		PartDefinition legleft2 = legleft.addOrReplaceChild("legleft2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3F, 0.6F, -0.55F, -0.0786F, 0.3405F, 0.0737F));

		PartDefinition footleft = legleft2.addOrReplaceChild("footleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4578F, 4.0467F, -0.172F, 0.0F, -1.5708F, 0.2182F));

		PartDefinition legright = hip.addOrReplaceChild("legright", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.45F, -5.05F, 6.0F, -0.0049F, 0.085F, 0.3119F));

		PartDefinition legright2 = legright.addOrReplaceChild("legright2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, 0.6F, -0.55F, -0.0786F, -0.3405F, -0.0737F));

		PartDefinition footright = legright2.addOrReplaceChild("footright", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4578F, 4.0467F, -0.172F, 0.0F, 1.5708F, -0.2182F));

		return LayerDefinition.create(meshdefinition, 50, 50);
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