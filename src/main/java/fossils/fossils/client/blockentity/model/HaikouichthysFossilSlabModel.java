package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HaikouichthysFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;

	public HaikouichthysFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone2 = this.fossil.getChild("bone2");
		this.bone = this.bone2.getChild("bone");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -1.0F, -31.5F, 32.0F, 2.0F, 63.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 23.0F, 0.5F));

		PartDefinition bone2 = fossil.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -2.5F, -4.0F, 0.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(17, 66).addBox(-3.2F, -7.0F, -1.0F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.5F, -19.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4F, -2.0F, -5.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.0F, -3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 0).addBox(-1.5F, -2.0F, -4.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.25F, -1.0F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, 0.0F, -4.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -3.25F, -1.0F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.49F, -0.01F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(12, 0).addBox(-2.5F, 0.0F, -2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -2.0F, -5.0F, 0.5882F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 31).addBox(-2.1F, -9.0F, 0.0F, 0.0F, 15.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(33, 18).addBox(-2.15F, -3.0F, -1.0F, 0.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 6.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(43, 9).addBox(-1.5F, -6.0F, -1.0F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0F, 8.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 14).addBox(-2.9F, -12.5F, -2.0F, 0.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(35, 0).addBox(-1.6F, 0.0F, 0.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, -0.1257F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(9, 47).addBox(-1.0F, -5.0F, -0.75F, 0.0F, 5.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 7.75F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 0).addBox(-1.1F, 0.0F, -1.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.25F, -0.1431F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(41, 35).addBox(-2.3F, -9.5F, -2.3F, 0.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.25F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -3.5F, -1.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(-0.02F))
				.texOffs(24, 31).addBox(-0.6F, -8.5F, -1.0F, 0.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, 7.25F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 51).addBox(-0.5F, 0.0F, -1.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, 0.0F, -0.1431F, 0.0F, 0.0F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(32, 66).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(-0.03F))
				.texOffs(0, 0).addBox(-0.7F, -6.0F, -1.0F, 0.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 7.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 192, 100);
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