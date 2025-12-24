package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TitanitesFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart shell;

	public TitanitesFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.shell = this.fossil.getChild("shell");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(109, 16).addBox(6.0F, -2.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 97).addBox(-2.0F, -4.0F, -6.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(33, 9).addBox(-12.6F, -2.0F, -10.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(-0.003F)), PartPose.offset(3.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 106).addBox(-1.0F, -31.0F, -1.0F, 2.0F, 31.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.0F, -2.0F, 3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 106).addBox(-1.0F, -31.0F, -1.0F, 2.0F, 31.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -2.0F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 22).addBox(-0.25F, -0.25F, -1.0F, 23.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 6).addBox(-0.25F, -5.25F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.75F, -1.75F, 11.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -5.25F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(78, 27).addBox(-0.25F, -0.25F, -1.0F, 23.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.75F, -1.75F, -11.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition shell = fossil.addOrReplaceChild("shell", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 7.4609F, -8.5185F, 10.0F, 12.0F, 16.0F, new CubeDeformation(0.004F))
				.texOffs(93, 86).addBox(-4.5F, -16.8391F, -3.5185F, 9.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -21.6609F, -0.4815F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r5 = shell.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 29).addBox(-3.0F, -0.2F, -2.4F, 10.0F, 14.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.0F, 8.1609F, -17.0185F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r6 = shell.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 32).addBox(-3.0F, -7.96F, -0.1456F, 10.0F, 8.0F, 11.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-2.0F, 9.6609F, -18.7185F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = shell.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 66).addBox(-3.0F, -8.1088F, 0.1705F, 9.0F, 8.0F, 11.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, -11.5391F, 14.3815F, 2.6442F, 0.0F, 0.0F));

		PartDefinition cube_r8 = shell.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 55).addBox(-3.0F, -8.7088F, 0.173F, 9.0F, 9.0F, 12.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5F, -0.0391F, 18.4815F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r9 = shell.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(31, 43).addBox(-3.0F, -9.9165F, -0.1241F, 9.0F, 10.0F, 12.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.5F, 10.9609F, 14.4815F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r10 = shell.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 0).addBox(-3.0F, -9.9931F, -11.0599F, 10.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 11.0609F, 14.4815F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r11 = shell.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(97, 44).addBox(-2.0F, -6.9078F, -4.9208F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(-1.5F, 4.6609F, 2.1815F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r12 = shell.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 111).addBox(-1.0F, -0.0614F, -4.4338F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(47, 106).addBox(-1.5F, -3.9614F, -4.4338F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.2391F, 0.0815F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r13 = shell.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(43, 32).addBox(-2.0F, -3.7573F, -5.9732F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1609F, 2.0815F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r14 = shell.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 32).addBox(-2.0F, -4.0883F, -6.7388F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 2.4609F, -0.9185F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r15 = shell.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(101, 0).addBox(-2.0F, -7.1433F, -7.7385F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -1.5391F, -3.9185F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r16 = shell.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 77).addBox(-2.0F, -5.7562F, -1.9769F, 6.0F, 7.0F, 12.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.0F, -1.2391F, -4.7185F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r17 = shell.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(95, 67).addBox(-2.0F, -6.798F, -5.1603F, 7.0F, 7.0F, 8.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.5F, -5.7391F, -0.3185F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r18 = shell.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(95, 67).addBox(-2.0F, -6.7518F, -4.9845F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -3.7391F, 4.1815F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r19 = shell.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(97, 103).addBox(-2.0F, -7.0134F, -5.9776F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5F, 1.2609F, 4.1815F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r20 = shell.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 95).addBox(-2.0F, -6.1515F, -4.9276F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 5.4609F, -2.8185F, -3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r21 = shell.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(62, 75).addBox(-2.0F, -0.2298F, -10.7924F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0F, 0.4609F, -14.5185F, 2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r22 = shell.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 54).addBox(-2.0F, 0.0433F, -12.0678F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.0F, -11.5391F, -11.9185F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r23 = shell.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(27, 87).addBox(-2.0F, 0.0F, -10.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-2.0F, -16.8391F, -3.5185F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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