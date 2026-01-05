package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StenoprotomeFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart stenoprotome;
	private final ModelPart matrix;
	private final ModelPart matrix2;
	private final ModelPart matrix3;

	public StenoprotomeFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.stenoprotome = this.fossil.getChild("stenoprotome");
		this.matrix = this.fossil.getChild("matrix");
		this.matrix2 = this.fossil.getChild("matrix2");
		this.matrix3 = this.fossil.getChild("matrix3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition stenoprotome = fossil.addOrReplaceChild("stenoprotome", CubeListBuilder.create().texOffs(34, 45).addBox(-1.5F, -0.5031F, -0.8845F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(54, 56).addBox(-1.0F, -0.5031F, -1.6595F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(58, 48).addBox(-1.9964F, -0.5281F, 1.6901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 59).addBox(0.9964F, -0.5281F, 1.6901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6627F, -0.5797F, 3.1896F, -0.0131F, -0.2618F, 0.0F));

		PartDefinition cube_r1 = stenoprotome.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 56).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4281F, 2.9155F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = stenoprotome.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 59).addBox(0.35F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(27, 55).addBox(0.0F, -0.525F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5825F, -0.0031F, 0.7405F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r3 = stenoprotome.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 59).addBox(-1.35F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(0, 54).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5825F, -0.0281F, 0.7405F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r4 = stenoprotome.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 56).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7165F, -0.0281F, 1.2405F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r5 = stenoprotome.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 59).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.8911F, -0.0281F, 1.668F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r6 = stenoprotome.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 54).addBox(-1.25F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, -0.0281F, 1.3655F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r7 = stenoprotome.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 59).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8911F, -0.0281F, 1.668F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r8 = stenoprotome.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 54).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7165F, -0.0281F, 1.2405F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r9 = stenoprotome.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -1.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0619F, 0.6018F, -4.3071F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r10 = stenoprotome.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 45).addBox(0.0F, -1.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0619F, 0.6018F, -4.3071F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r11 = stenoprotome.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(43, 51).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2165F, -0.5281F, -1.3576F, 0.0436F, -0.0524F, 0.0F));

		PartDefinition cube_r12 = stenoprotome.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(52, 51).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2165F, -0.5281F, -1.3576F, 0.0436F, 0.0524F, 0.0F));

		PartDefinition cube_r13 = stenoprotome.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 50).addBox(0.25F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -0.0281F, 1.3655F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r14 = stenoprotome.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(58, 45).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5031F, 2.1155F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r15 = stenoprotome.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(47, 45).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5031F, -1.6595F, 0.0436F, 0.0F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -2.0F, -12.0F, 14.0F, 1.0F, 25.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition matrix2 = fossil.addOrReplaceChild("matrix2", CubeListBuilder.create().texOffs(0, 28).addBox(-3.5F, -1.0F, -9.0F, 6.0F, 1.0F, 14.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(6.6609F, 0.0F, -2.3958F, 0.0F, -0.3054F, 0.0F));

		PartDefinition matrix3 = fossil.addOrReplaceChild("matrix3", CubeListBuilder.create().texOffs(41, 28).addBox(-3.5F, -1.0F, -9.0F, 6.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.3607F, 0.0F, 7.3506F, 0.0F, 0.2182F, 0.0F));

		return LayerDefinition.create(meshdefinition, 82, 65);
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