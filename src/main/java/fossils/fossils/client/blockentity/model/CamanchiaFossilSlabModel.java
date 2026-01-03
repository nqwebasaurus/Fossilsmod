package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CamanchiaFossilSlabModel extends SkullModelBase {
	private final ModelPart Everything;
	private final ModelPart Fossil;
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Matrix;

	public CamanchiaFossilSlabModel(ModelPart root) {
		this.Everything = root.getChild("Everything");
		this.Fossil = this.Everything.getChild("Fossil");
		this.bone2 = this.Fossil.getChild("bone2");
		this.bone = this.Fossil.getChild("bone");
		this.bone3 = this.bone.getChild("bone3");
		this.Matrix = this.Everything.getChild("Matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Everything = partdefinition.addOrReplaceChild("Everything", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition Fossil = Everything.addOrReplaceChild("Fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.95F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bone2 = Fossil.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(10, 46).addBox(-0.5F, -0.25F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 41).addBox(-2.5F, -0.25F, -6.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 4).addBox(1.5F, -0.25F, -6.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 8).addBox(-2.5F, -0.25F, -8.1F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone = Fossil.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(36, 40).addBox(-1.5F, -0.3F, -7.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(42, 0).addBox(-3.5F, -0.225F, -6.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(40, 45).addBox(-2.5F, -0.25F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 10).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.45F, -0.225F, 7.5F, 0.0F, -0.144F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 45).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, -0.325F, -6.675F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 26).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, -0.325F, -6.675F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 0.0F, 0.0F, -0.1004F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.0F, -0.175F, 1.0F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 20).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 14).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.025F, 0.3F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 17).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.175F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 23).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.05F, 0.3F, 0.0F, -0.48F, 0.0F));

		PartDefinition Matrix = Everything.addOrReplaceChild("Matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -1.0F, -9.0F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Matrix.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 28).addBox(-7.0F, -1.0F, -8.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.825F, 0.0F, 2.65F, 0.0F, 2.0508F, 0.0F));

		PartDefinition cube_r11 = Matrix.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 14).addBox(-7.0F, -1.0F, -9.0F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.75F, 0.0F, -0.95F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r12 = Matrix.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 28).addBox(-7.0F, -1.0F, -8.0F, 5.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.575F, -0.025F, 4.775F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 50);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Everything.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.Everything.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}