package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VestinautilusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart whole;
	private final ModelPart shell;

	public VestinautilusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.whole = this.fossil.getChild("whole");
		this.shell = this.whole.getChild("shell");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -11.0F, -16.0F, 13.0F, 11.0F, 27.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 39).addBox(-7.0F, -5.0F, -10.0F, 18.0F, 5.0F, 25.0F, new CubeDeformation(0.0F))
				.texOffs(62, 20).addBox(-11.0F, -15.0F, -13.0F, 11.0F, 15.0F, 19.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 92).addBox(-6.0F, -14.0F, 3.5F, 9.0F, 25.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(87, 55).addBox(-3.0F, -4.0F, -6.5F, 6.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, -15.0F, -1.5F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 0).addBox(-2.0F, -1.5F, -4.5F, 4.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7163F, -20.5F, -0.1711F, 0.829F, 0.4363F, 0.0F));

		PartDefinition whole = fossil.addOrReplaceChild("whole", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -13.0F, -4.0F, -1.6144F, 0.0F, 0.0F));

		PartDefinition shell = whole.addOrReplaceChild("shell", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0447F, -0.1511F, -8.6524F, -0.6765F, -0.3391F, 0.3569F));

		PartDefinition shell_r1 = shell.addOrReplaceChild("shell_r1", CubeListBuilder.create().texOffs(9, 52).addBox(-3.6393F, -5.7495F, 6.6307F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4553F, 2.5511F, -5.0476F, 0.8727F, -0.0436F, 0.0F));

		PartDefinition shell_r2 = shell.addOrReplaceChild("shell_r2", CubeListBuilder.create().texOffs(0, 52).addBox(-4.5F, -12.5F, -10.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4553F, 10.5511F, 8.9524F, -0.0873F, -0.0436F, 0.0F));

		PartDefinition shell_r3 = shell.addOrReplaceChild("shell_r3", CubeListBuilder.create().texOffs(102, 5).addBox(-1.75F, 3.2349F, 0.1785F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2947F, 3.5511F, -8.0476F, 0.6109F, 0.0F, 0.0F));

		PartDefinition shell_r4 = shell.addOrReplaceChild("shell_r4", CubeListBuilder.create().texOffs(0, 39).addBox(-2.25F, 3.5322F, -17.2149F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7947F, -8.4489F, -2.0476F, 0.6109F, 0.0F, 0.0F));

		PartDefinition shell_r5 = shell.addOrReplaceChild("shell_r5", CubeListBuilder.create().texOffs(85, 0).addBox(-2.25F, 0.4849F, -1.8215F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2947F, 3.5511F, -8.0476F, -0.0873F, 0.0F, 0.0F));

		PartDefinition shell_r6 = shell.addOrReplaceChild("shell_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-2.75F, 0.2822F, -14.2149F, 7.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7947F, -8.4489F, -2.0476F, 0.1309F, 0.0F, 0.0F));

		PartDefinition shell_r7 = shell.addOrReplaceChild("shell_r7", CubeListBuilder.create().texOffs(31, 95).addBox(-3.25F, -1.9678F, -8.2149F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7947F, -8.4489F, -2.0476F, -0.829F, 0.0F, 0.0F));

		PartDefinition shell_r8 = shell.addOrReplaceChild("shell_r8", CubeListBuilder.create().texOffs(49, 70).addBox(-4.25F, -10.427F, -6.6562F, 10.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7947F, -4.4489F, 6.9524F, 0.5672F, 0.0F, 0.0F));

		PartDefinition shell_r9 = shell.addOrReplaceChild("shell_r9", CubeListBuilder.create().texOffs(80, 83).addBox(-3.75F, -7.2178F, -5.4649F, 9.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7947F, -8.4489F, -2.0476F, -0.0436F, 0.0F, 0.0F));

		PartDefinition shell_r10 = shell.addOrReplaceChild("shell_r10", CubeListBuilder.create().texOffs(0, 70).addBox(-9.5F, -15.75F, -8.25F, 12.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4553F, 10.5511F, 8.9524F, 0.0436F, 0.0F, 0.0F));

		PartDefinition shell_r11 = shell.addOrReplaceChild("shell_r11", CubeListBuilder.create().texOffs(81, 107).addBox(1.0F, -10.25F, -0.95F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(64, 101).addBox(-10.0F, -10.25F, -0.95F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(104, 18).addBox(-8.0F, -10.25F, 3.05F, 9.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4553F, 10.5511F, 8.9524F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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