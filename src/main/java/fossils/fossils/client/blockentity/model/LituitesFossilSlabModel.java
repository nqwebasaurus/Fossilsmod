package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LituitesFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart shelldontmove;
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart body2;
	private final ModelPart shelldontmove2;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;

	public LituitesFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.shelldontmove = this.body.getChild("shelldontmove");
		this.bone2 = this.shelldontmove.getChild("bone2");
		this.bone = this.bone2.getChild("bone");
		this.bone3 = this.bone.getChild("bone3");
		this.body2 = this.fossil.getChild("body2");
		this.shelldontmove2 = this.body2.getChild("shelldontmove2");
		this.bone4 = this.shelldontmove2.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 68).addBox(-2.0F, -13.0F, -9.0F, 9.0F, 9.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 88).addBox(7.0F, -10.0F, -9.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(44, 5).addBox(6.0F, -7.0F, -3.0F, 7.0F, 7.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-8.0F, -4.0F, -9.0F, 15.0F, 4.0F, 13.0F, new CubeDeformation(0.003F))
				.texOffs(43, 48).addBox(0.0F, -20.0F, -2.0F, 6.0F, 20.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 48).addBox(-6.0F, -10.0F, 1.0F, 12.0F, 10.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 68).addBox(-0.2F, 0.0F, -9.0F, 4.0F, 13.0F, 10.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 40).addBox(-1.5F, 0.4F, -2.8F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.5F, -11.5F, -11.0F, 0.3452F, -0.346F, -0.3408F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(29, 26).addBox(-3.5F, -7.25F, 4.0F, 7.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(65, 36).addBox(-3.0F, -6.75F, 18.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(58, 35).addBox(-3.5F, -1.2F, 2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7F, -1.5F, -2.4F, 1.1112F, 0.131F, 0.3118F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(25, 93).addBox(-3.5F, -2.925F, 0.6F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.45F, 2.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition shelldontmove = body.addOrReplaceChild("shelldontmove", CubeListBuilder.create().texOffs(75, 16).addBox(-2.5F, -4.5F, -0.05F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 30.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = shelldontmove.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 78).addBox(-2.0F, 0.5F, -1.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -4.5F, 10.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone2 = shelldontmove.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(65, 92).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.55F, 17.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.525F, 8.0833F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 26).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.9167F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.9429F, 0.098F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -6.0F, 8.9167F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 24).addBox(-0.5F, -1.0429F, 0.098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 8.9167F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -2.175F, -0.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.9167F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.5F, 5.6667F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.0462F, 0.1014F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -5.0462F, -0.8986F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.6616F, 0.0F, 0.0F));

		PartDefinition body2 = fossil.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 18).addBox(-3.5F, -4.5872F, -6.462F, 7.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(72, 0).addBox(-3.0F, 0.9128F, 7.538F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(46, 81).addBox(-3.0F, -3.0872F, 7.538F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(90, 32).addBox(2.0F, -3.0872F, 7.538F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(81, 80).addBox(2.0F, -2.0872F, 7.538F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(29, 18).addBox(-2.0F, -3.0872F, 14.538F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 55).addBox(-3.0F, -4.0872F, 7.538F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(15, 40).addBox(-3.0F, 0.9128F, 19.538F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(-2.0F, 0.9128F, 19.538F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 18).addBox(-3.0F, -0.0872F, 19.538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 0).addBox(-3.5F, 1.4628F, -8.462F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0948F, -6.2536F, 4.4297F, -2.9918F, 0.3855F, 2.768F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(83, 67).addBox(-3.5F, -2.925F, 0.6F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.2128F, -8.462F, -0.5236F, 0.0F, 0.0F));

		PartDefinition shelldontmove2 = body2.addOrReplaceChild("shelldontmove2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9128F, 19.538F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = shelldontmove2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.55F, 17.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.525F, 8.0833F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.5F, 5.6667F, -0.0175F, 0.0F, 0.0F));

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