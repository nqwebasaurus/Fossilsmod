package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ForeyiaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart lowerjaw;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart pelvicfinL;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart pectoralfinL;

	public ForeyiaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.lowerjaw = this.body.getChild("lowerjaw");
		this.body1 = this.body.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.pelvicfinL = this.body2.getChild("pelvicfinL");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.pectoralfinL = this.body1.getChild("pectoralfinL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 65).addBox(-6.5F, -0.5F, -20.0F, 19.0F, 1.0F, 26.0F, new CubeDeformation(0.003F)), PartPose.offset(5.5F, 23.5F, 10.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5F, -0.5F, -18.5F, 19.0F, 1.0F, 37.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-9.5F, 0.0F, -1.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 39).addBox(-14.5F, -0.5F, -12.0F, 22.0F, 1.0F, 24.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 15).addBox(-1.0F, -3.9441F, -1.5157F, 1.0F, 7.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 58).addBox(-1.0F, -5.7941F, 1.4843F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(11, 65).addBox(-1.0F, 2.5559F, -0.0407F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-5.0F, -0.5559F, -5.0593F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 57).addBox(-1.5F, -12.475F, -6.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.5559F, 7.9593F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 47).addBox(-1.5F, -7.5F, -14.35F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.5559F, 7.9593F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 47).addBox(-1.0F, -2.25F, -9.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5559F, 7.9593F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 39).addBox(-1.0F, -3.5F, -14.1F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.5559F, 7.9593F, -0.48F, 0.0F, 0.0F));

		PartDefinition lowerjaw = body.addOrReplaceChild("lowerjaw", CubeListBuilder.create().texOffs(13, 20).addBox(-1.0F, 0.0F, -1.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.0559F, -0.7657F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = lowerjaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(69, 53).addBox(-1.5F, -6.1F, -9.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 3.5F, 8.75F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.995F, -3.25F, -1.0F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4441F, 3.4593F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -15.25F, -8.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(20, 28).addBox(-1.002F, -10.25F, -8.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.0F, 4.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 39).addBox(-0.998F, -4.0F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 4.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(9, 24).addBox(-0.997F, -3.0F, -1.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.5F, 5.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -2.5F, -2.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, -5.6357F, 2.7171F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 0).addBox(-1.002F, -10.25F, -3.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5F, -0.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(65, 65).addBox(-1.0F, -4.25F, 0.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5F, -0.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition pelvicfinL = body2.addOrReplaceChild("pelvicfinL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4882F, -1.1836F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r13 = pelvicfinL.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(5, 27).addBox(0.0F, -1.0898F, 0.0405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8203F, -1.0046F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r14 = pelvicfinL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(27, 17).addBox(-0.25F, -0.0347F, 0.3889F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 28).addBox(-0.25F, -1.3103F, 1.5397F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 2.75F, -0.75F, 0.7854F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(69, 39).addBox(-1.0F, -2.7997F, 0.0131F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -0.25F, 2.5F));

		PartDefinition cube_r15 = body3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(19, 0).addBox(0.0F, 0.3454F, -0.7922F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0937F, 2.1189F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 0).addBox(0.25F, -0.0152F, -0.6736F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4772F, 0.9205F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1703F, 1.8658F, 1.309F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(27, 9).addBox(0.0F, -1.75F, -0.25F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.02F))
				.texOffs(15, 49).addBox(0.1F, -1.0F, 3.75F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(28, 24).addBox(0.01F, -1.75F, 6.5F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0502F, 1.9913F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(7, 7).addBox(0.0F, 2.775F, 7.25F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 65).addBox(-0.002F, 0.85F, 7.75F, 0.0F, 2.0F, 5.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 7.0F, -5.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -17.825F, -0.8F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(9, 49).addBox(-0.03F, -12.85F, -0.75F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -5.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 54).addBox(0.25F, -6.1F, 8.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -5.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -8.75F, 2.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.0F, -5.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition pectoralfinL = body1.addOrReplaceChild("pectoralfinL", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, 2.75F, 0.0F, -0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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