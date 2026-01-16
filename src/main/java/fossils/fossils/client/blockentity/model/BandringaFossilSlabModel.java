package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BandringaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart pelvicfinL;
	private final ModelPart pelvicfinL2;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart pectoralfinL;
	private final ModelPart pectoralfinL2;
	private final ModelPart lowerjaw;

	public BandringaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.pelvicfinL = this.body3.getChild("pelvicfinL");
		this.pelvicfinL2 = this.body3.getChild("pelvicfinL2");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.pectoralfinL = this.body.getChild("pectoralfinL");
		this.pectoralfinL2 = this.body.getChild("pectoralfinL2");
		this.lowerjaw = this.body.getChild("lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -1.0F, -13.0F, 20.0F, 1.0F, 24.0F, new CubeDeformation(0.002F))
				.texOffs(0, 47).addBox(-6.0F, -1.0F, 11.0F, 14.0F, 1.0F, 15.0F, new CubeDeformation(-0.002F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 58).addBox(-3.0F, -0.5F, -15.3F, 3.0F, 1.0F, 15.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(8.0F, -0.5F, 26.1F, 0.0F, -0.1222F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 26).addBox(-0.2F, -0.5F, -15.6F, 14.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8F, -0.5F, 26.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 26).addBox(-5.6F, -0.5F, -5.7F, 12.0F, 1.0F, 16.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.1296F, -0.5F, -19.4018F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 47).addBox(-0.095F, -0.5F, -0.3045F, 17.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.7F, -0.5F, -13.0F, 0.0F, 1.309F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 64).addBox(-2.0F, -0.83F, 7.0F, 4.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(65, 0).addBox(-1.5F, -0.95F, 7.01F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -0.4F, -11.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 47).addBox(-1.01F, 0.6691F, -7.0533F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 7.1F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(15, 16).addBox(-1.7645F, 0.95F, -2.9575F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, 7.1F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 64).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4439F, -0.775F, 5.82F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 54).addBox(-1.5F, 0.6199F, -2.7888F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.525F, 7.1F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 26).addBox(-1.5F, 1.0F, -6.85F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-1.0F, 0.95F, -13.85F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.5F, 0.95F, -20.85F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, 7.1F, 0.0F, -0.2182F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(7, 31).addBox(-1.0F, 1.1F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(-1.5F, 1.2F, -0.99F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 16.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition pelvicfinL = body3.addOrReplaceChild("pelvicfinL", CubeListBuilder.create().texOffs(0, 54).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.25F, 1.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition pelvicfinL2 = body3.addOrReplaceChild("pelvicfinL2", CubeListBuilder.create().texOffs(0, 41).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.25F, 1.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(44, 58).addBox(-1.0F, 1.7F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 64).addBox(-0.4F, 0.45F, 0.7F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 31).addBox(-0.3F, -0.76F, 0.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 3.0F, 0.1309F, 0.0F, -1.5708F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(44, 47).addBox(-0.4F, 0.4F, -0.6F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(-0.3F, -0.75F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(0, 31).addBox(-0.43F, 0.25F, -1.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(12, 8).addBox(-0.3F, -0.5F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition pectoralfinL = body.addOrReplaceChild("pectoralfinL", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, 0.2F, 0.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.0F, 7.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition pectoralfinL2 = body.addOrReplaceChild("pectoralfinL2", CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, 0.2F, 0.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 7.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition lowerjaw = body.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 3.25F));

		return LayerDefinition.create(meshdefinition, 106, 75);
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