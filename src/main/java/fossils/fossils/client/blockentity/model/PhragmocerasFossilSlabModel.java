package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PhragmocerasFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart shell;

	public PhragmocerasFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.shell = this.body.getChild("shell");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(25, 34).addBox(-4.0F, -8.0F, -5.0F, 7.0F, 8.0F, 14.0F, new CubeDeformation(0.003F))
				.texOffs(29, 57).addBox(-6.0F, -9.0F, -8.0F, 7.0F, 9.0F, 7.0F, new CubeDeformation(0.002F))
				.texOffs(0, 0).addBox(-3.0F, -4.0F, -5.0F, 11.0F, 4.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-11.5F, 0.0F, -5.0F, 11.0F, 4.0F, 14.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(8.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(68, 0).addBox(-3.5F, -4.9496F, -0.4494F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(54, 0).addBox(-3.5F, 1.1004F, -2.4494F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.9303F, -4.1164F, 0.4419F, 0.0924F, -0.7811F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(39, 27).addBox(-3.5F, -2.925F, 0.6F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.1496F, -2.4494F, -0.5236F, 0.0F, 0.0F));

		PartDefinition shell = body.addOrReplaceChild("shell", CubeListBuilder.create(), PartPose.offset(-0.5F, 4.4387F, 1.5996F));

		PartDefinition cube_r3 = shell.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(37, 0).addBox(-2.5F, -2.25F, 0.5F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8384F, -3.549F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r4 = shell.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 47).addBox(-3.5F, -0.0841F, -0.0655F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.5144F, 0.1666F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r5 = shell.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -2.075F, -1.2F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -7.3647F, 14.9799F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r6 = shell.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 6).addBox(-0.5F, -1.8337F, -1.8454F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.38F, 15.3089F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r7 = shell.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.1727F, -1.8533F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.38F, 17.3089F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = shell.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 70).addBox(-1.5F, -1.4F, -1.15F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.18F, 18.1089F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r9 = shell.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 74).addBox(-2.0F, -0.3197F, -0.7642F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -9.8853F, 21.2731F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r10 = shell.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 69).addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -12.1712F, 17.6884F, -0.9643F, 0.0F, 0.0F));

		PartDefinition cube_r11 = shell.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 49).addBox(-2.5F, 0.4F, -7.75F, 6.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7659F, 17.6707F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r12 = shell.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 27).addBox(-3.0F, -3.75F, -4.5F, 7.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.6347F, 6.3047F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r13 = shell.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 8).addBox(-3.5F, -3.85F, -6.825F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -4.1922F, 5.6822F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = shell.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(53, 70).addBox(-2.0F, -2.25F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6638F, 8.4515F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r15 = shell.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(58, 57).addBox(-2.5F, -2.945F, -0.0342F, 6.0F, 3.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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