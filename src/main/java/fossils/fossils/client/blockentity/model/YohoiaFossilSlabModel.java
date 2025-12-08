package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YohoiaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart finfL;
	private final ModelPart finfL2;
	private final ModelPart legL2;
	private final ModelPart armL;
	private final ModelPart armR;
	private final ModelPart body2;
	private final ModelPart finL;
	private final ModelPart finL2;
	private final ModelPart legL4;
	private final ModelPart body3;
	private final ModelPart legL6;
	private final ModelPart finL3;
	private final ModelPart finL4;
	private final ModelPart body4;
	private final ModelPart legL8;
	private final ModelPart finL5;
	private final ModelPart finL6;
	private final ModelPart body5;
	private final ModelPart legL10;
	private final ModelPart finL7;
	private final ModelPart finL8;
	private final ModelPart body6;
	private final ModelPart legL12;
	private final ModelPart finL9;
	private final ModelPart body7;
	private final ModelPart body8;

	public YohoiaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.finfL = this.body.getChild("finfL");
		this.finfL2 = this.body.getChild("finfL2");
		this.legL2 = this.body.getChild("legL2");
		this.armL = this.body.getChild("armL");
		this.armR = this.body.getChild("armR");
		this.body2 = this.body.getChild("body2");
		this.finL = this.body2.getChild("finL");
		this.finL2 = this.body2.getChild("finL2");
		this.legL4 = this.body2.getChild("legL4");
		this.body3 = this.body2.getChild("body3");
		this.legL6 = this.body3.getChild("legL6");
		this.finL3 = this.body3.getChild("finL3");
		this.finL4 = this.body3.getChild("finL4");
		this.body4 = this.body3.getChild("body4");
		this.legL8 = this.body4.getChild("legL8");
		this.finL5 = this.body4.getChild("finL5");
		this.finL6 = this.body4.getChild("finL6");
		this.body5 = this.body4.getChild("body5");
		this.legL10 = this.body5.getChild("legL10");
		this.finL7 = this.body5.getChild("finL7");
		this.finL8 = this.body5.getChild("finL8");
		this.body6 = this.body5.getChild("body6");
		this.legL12 = this.body6.getChild("legL12");
		this.finL9 = this.body6.getChild("finL9");
		this.body7 = this.body6.getChild("body7");
		this.body8 = this.body7.getChild("body8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -2.0F, -14.0F, 16.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 12).addBox(-1.4933F, -1.0F, -0.3937F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(-1.4033F, -0.75F, -1.1437F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9967F, -3.7F, -6.6063F, 0.5672F, 0.0F, -1.5708F));

		PartDefinition finfL = body.addOrReplaceChild("finfL", CubeListBuilder.create().texOffs(23, 7).addBox(0.0F, 0.1F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4033F, 2.0F, 1.1063F, 0.0F, 0.0F, 1.5708F));

		PartDefinition finfL2 = body.addOrReplaceChild("finfL2", CubeListBuilder.create().texOffs(19, 2).addBox(0.0F, -0.03F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5033F, 2.0F, 2.1063F, 0.0F, 0.0F, 1.5708F));

		PartDefinition legL2 = body.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(21, 20).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5533F, 1.25F, 1.1063F, 0.0F, -1.5708F, 0.0F));

		PartDefinition armL = body.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(6, 5).addBox(0.0F, 0.0F, -5.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5033F, 0.25F, 0.3563F, -0.6545F, 0.0F, 0.0F));

		PartDefinition armR = body.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -5.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6033F, 0.25F, 0.3563F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(10, 19).addBox(-1.5F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0033F, 0.25F, 2.6063F, -0.1745F, 0.0F, 0.0F));

		PartDefinition finL = body2.addOrReplaceChild("finL", CubeListBuilder.create().texOffs(15, 18).addBox(0.0F, 3.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, 0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition finL2 = body2.addOrReplaceChild("finL2", CubeListBuilder.create().texOffs(17, 11).addBox(-0.02F, 3.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, 1.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition legL4 = body2.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.55F, 1.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(5, 19).addBox(-1.49F, -1.01F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legL6 = body3.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.55F, 1.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition finL3 = body3.addOrReplaceChild("finL3", CubeListBuilder.create().texOffs(17, 9).addBox(0.0F, 3.02F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, 0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition finL4 = body3.addOrReplaceChild("finL4", CubeListBuilder.create().texOffs(7, 17).addBox(-0.03F, 3.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, 1.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition legL8 = body4.addOrReplaceChild("legL8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.55F, 1.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition finL5 = body4.addOrReplaceChild("finL5", CubeListBuilder.create().texOffs(15, 16).addBox(0.0F, 2.97F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, 0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition finL6 = body4.addOrReplaceChild("finL6", CubeListBuilder.create().texOffs(16, 14).addBox(-0.25F, 2.99F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, 1.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.49F, -1.01F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legL10 = body5.addOrReplaceChild("legL10", CubeListBuilder.create().texOffs(18, 20).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.55F, 1.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition finL7 = body5.addOrReplaceChild("finL7", CubeListBuilder.create().texOffs(16, 4).addBox(-0.5F, 2.98F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, 0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition finL8 = body5.addOrReplaceChild("finL8", CubeListBuilder.create().texOffs(16, 0).addBox(-0.75F, 2.99F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, 1.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition legL12 = body6.addOrReplaceChild("legL12", CubeListBuilder.create().texOffs(15, 20).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.55F, 1.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition finL9 = body6.addOrReplaceChild("finL9", CubeListBuilder.create().texOffs(7, 15).addBox(-1.0F, 3.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, 0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(12, 4).addBox(-1.0F, -0.5F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.35F, 0.9F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(6, 0).addBox(-1.5F, 0.0F, 1.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(19, 6).addBox(-0.6F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.1F, 2.7F, 0.0F, 0.3491F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 96, 50);
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