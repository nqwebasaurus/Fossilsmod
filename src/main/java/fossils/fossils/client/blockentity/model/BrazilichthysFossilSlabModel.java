package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BrazilichthysFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart jaw;

	public BrazilichthysFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.head = this.root.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -8.0F, -13.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 17).addBox(-1.5F, -4.0F, -13.0F, 3.0F, 4.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(31, 0).addBox(-0.1F, -4.0F, -12.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(34, 36).addBox(-0.7F, -6.0F, -6.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-3.0F, -7.0F, -7.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-3.0F, -7.0F, -3.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 40).addBox(1.0F, -6.0F, 0.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(17, 29).addBox(0.7F, -4.0F, -5.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 4.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(41, 49).addBox(-1.0F, -1.5F, -1.8F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -6.5F, -14.2F, -0.5236F, 0.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.25F, -7.0F, 5.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.75F, 1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.75F, -7.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 47).addBox(-0.5F, -1.8F, 0.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.5F, 2.3285F, -3.4904F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 32).addBox(-0.75F, -0.575F, -0.275F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 32).addBox(0.75F, -0.575F, -0.275F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7783F, -5.5106F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 7).addBox(-2.9F, -0.5537F, 2.186F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 17).addBox(-0.1F, -0.5537F, 2.186F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 0).addBox(-3.5F, -1.0537F, 0.186F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.5F, 2.8727F, -4.979F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(41, 33).addBox(-1.25F, -1.0F, -0.225F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 43).addBox(1.25F, -1.0F, -0.225F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3376F, -4.5629F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 6).addBox(0.1F, -0.444F, 0.1821F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 32).addBox(1.9F, -0.444F, 0.1821F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 5).addBox(-0.5F, -0.994F, -0.0179F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.3977F, -6.879F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(31, 43).addBox(0.0F, -0.5F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(1.5F, -0.5F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 2.9198F, -6.8187F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 4).addBox(0.1F, -0.4319F, -1.5847F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 17).addBox(1.9F, -0.4319F, -1.5847F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 20).addBox(-0.5F, -0.9819F, -1.9847F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 3.3727F, -6.904F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 0).addBox(-2.5F, -0.0092F, 0.0047F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F))
				.texOffs(31, 11).addBox(-2.5F, -1.6842F, 2.5047F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(47, 33).addBox(-2.5F, -0.7592F, 1.5047F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.0F, 1.45F, -8.45F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 42).addBox(-0.5F, -0.0147F, -5.0047F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.55F, -4.975F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 24).addBox(-1.5F, 0.0F, -5.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(32, 29).addBox(-0.8F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.35F, 1.7F, -6.2F, 0.3927F, 0.0F, 0.0F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create().texOffs(0, 4).addBox(-0.2F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.35F, 1.7F, -6.2F, 0.3927F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 3.7895F, 0.0111F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = jaw.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 17).addBox(-1.75F, -0.1787F, 1.211F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(50, 10).addBox(0.75F, -0.1787F, 1.211F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0669F, -4.9901F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = jaw.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 32).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 40).addBox(2.5F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -0.8723F, -4.6678F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r14 = jaw.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(32, 0).addBox(-1.25F, -0.494F, 0.2321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 33).addBox(0.25F, -0.494F, 0.2321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.5F, 0.006F, -0.2679F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5419F, -6.8901F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r15 = jaw.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(27, 40).addBox(-0.75F, -0.825F, -0.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 40).addBox(0.25F, -0.825F, -0.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.0162F, -7.0179F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r16 = jaw.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 17).addBox(-1.25F, -0.4819F, -1.9847F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(0.25F, -0.4819F, -1.9847F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 17).addBox(-1.5F, 0.0181F, -1.9847F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5669F, -6.9151F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r17 = jaw.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(37, 11).addBox(-0.5F, -1.9734F, 0.0002F, 3.0F, 2.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, 0.9846F, -5.2914F, -0.0262F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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