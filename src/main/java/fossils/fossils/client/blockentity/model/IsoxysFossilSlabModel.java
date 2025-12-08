package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IsoxysFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart base;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart bone;
	private final ModelPart rightleg1;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightleg4;
	private final ModelPart rightleg5;
	private final ModelPart rightleg6;
	private final ModelPart rightleg7;
	private final ModelPart rightleg8;
	private final ModelPart rightleg9;
	private final ModelPart rightleg10;
	private final ModelPart bone2;
	private final ModelPart tail1;

	public IsoxysFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.base = this.fossil.getChild("base");
		this.rightarm = this.base.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.bone = this.base.getChild("bone");
		this.rightleg1 = this.bone.getChild("rightleg1");
		this.rightleg2 = this.bone.getChild("rightleg2");
		this.rightleg3 = this.bone.getChild("rightleg3");
		this.rightleg4 = this.bone.getChild("rightleg4");
		this.rightleg5 = this.bone.getChild("rightleg5");
		this.rightleg6 = this.bone.getChild("rightleg6");
		this.rightleg7 = this.bone.getChild("rightleg7");
		this.rightleg8 = this.bone.getChild("rightleg8");
		this.rightleg9 = this.bone.getChild("rightleg9");
		this.rightleg10 = this.bone.getChild("rightleg10");
		this.bone2 = this.base.getChild("bone2");
		this.tail1 = this.base.getChild("tail1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0397F, -2.0F, -8.1234F, 8.0F, 2.0F, 19.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.7F, 0.0F, -1.2F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 22).addBox(-9.7538F, -2.0F, -15.5806F, 4.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.3F, 0.0F, 9.8F, 0.0F, -0.3578F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 33).addBox(3.0123F, -2.0F, 0.0435F, 8.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 0.0F, -14.4F, 0.0F, -0.733F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 22).addBox(-0.1F, -2.0F, 4.2F, 11.0F, 2.0F, 8.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-9.0F, 0.0F, -12.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition base = fossil.addOrReplaceChild("base", CubeListBuilder.create().texOffs(31, 22).addBox(1.5F, -9.25F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 22).addBox(1.5F, -9.25F, -5.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 31).addBox(1.5F, -9.25F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(1.5F, -9.25F, -4.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(10, 22).addBox(1.5F, -9.25F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 4).addBox(1.5F, -9.25F, 2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(1.45F, -7.4F, -6.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 15).addBox(1.45F, -8.5F, -7.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -0.8F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r5 = base.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 7).addBox(0.005F, -0.755F, -0.7197F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.605F, -6.7106F, -0.4278F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = base.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 22).addBox(-0.005F, -0.7448F, -3.2789F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.605F, -6.7106F, -0.4278F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = base.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 15).addBox(-1.0F, 1.5F, -2.9F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 4).addBox(-1.0F, 1.5F, 12.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.25F, -6.1F, 0.0F, 0.0F, -1.5708F));

		PartDefinition rightarm = base.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(28, 26).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-0.1F, 0.25F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -5.5F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(28, 22).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-0.1F, 0.75F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 0).addBox(0.0F, 2.0F, -0.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.5F, 0.25F, -1.0036F, 0.0F, 0.0F));

		PartDefinition bone = base.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -7.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightleg1 = bone.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(16, 30).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 1.4F, -2.7F, 0.0F, 1.5708F, 0.0F));

		PartDefinition rightleg2 = bone.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(16, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 0.4F, -1.95F, -1.5708F, 0.6981F, -1.5708F));

		PartDefinition rightleg3 = bone.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(6, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 0.4F, -1.2F, -1.5708F, 0.9599F, -1.5708F));

		PartDefinition rightleg4 = bone.addOrReplaceChild("rightleg4", CubeListBuilder.create().texOffs(3, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 0.4F, -0.45F, -1.5708F, 1.1781F, -1.5708F));

		PartDefinition rightleg5 = bone.addOrReplaceChild("rightleg5", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 0.4F, 0.3F, -1.5708F, 1.3526F, -1.5708F));

		PartDefinition rightleg6 = bone.addOrReplaceChild("rightleg6", CubeListBuilder.create().texOffs(10, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 0.4F, 1.05F, -1.5708F, 1.4835F, -1.5708F));

		PartDefinition rightleg7 = bone.addOrReplaceChild("rightleg7", CubeListBuilder.create().texOffs(16, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 0.4F, 1.8F, 1.5708F, 1.5272F, 1.5708F));

		PartDefinition rightleg8 = bone.addOrReplaceChild("rightleg8", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 0.4F, 2.55F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition rightleg9 = bone.addOrReplaceChild("rightleg9", CubeListBuilder.create().texOffs(13, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 0.4F, 3.3F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition rightleg10 = bone.addOrReplaceChild("rightleg10", CubeListBuilder.create().texOffs(13, 30).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 0.2F, 4.05F, 1.5708F, 1.0036F, 1.5708F));

		PartDefinition bone2 = base.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.5F, -7.0F, -3.0F));

		PartDefinition tail1 = base.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3333F, -6.2831F, 6.8857F, 0.0F, 0.5672F, 1.5708F));

		PartDefinition cube_r8 = tail1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 0).addBox(-1.0F, -0.375F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3333F, 0.2583F, -0.573F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r9 = tail1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -0.4F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3333F, 0.2583F, -0.573F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r10 = tail1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(0.4F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3333F, 0.2583F, -2.573F, 0.0F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 69, 46);
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