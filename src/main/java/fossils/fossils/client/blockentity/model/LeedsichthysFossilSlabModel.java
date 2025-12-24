package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LeedsichthysFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart root;
	private final ModelPart tail6;
	private final ModelPart cube_r9;

	public LeedsichthysFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.cube_r3 = this.fossil.getChild("cube_r3");
		this.cube_r4 = this.fossil.getChild("cube_r4");
		this.cube_r5 = this.fossil.getChild("cube_r5");
		this.cube_r6 = this.fossil.getChild("cube_r6");
		this.cube_r7 = this.fossil.getChild("cube_r7");
		this.cube_r8 = this.fossil.getChild("cube_r8");
		this.root = this.fossil.getChild("root");
		this.tail6 = this.root.getChild("tail6");
		this.cube_r9 = this.tail6.getChild("cube_r9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(110, 15).addBox(-51.2752F, -2.0F, -30.0076F, 31.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -21.2F, -3.1416F, 0.4363F, 3.1416F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(61, 130).addBox(-59.2968F, -2.0F, 3.4198F, 25.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.0F, -21.2F, -3.1416F, 1.021F, 3.1416F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 104).addBox(-38.1985F, -2.0F, -16.2937F, 25.0F, 2.0F, 23.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 0.0F, -21.2F, -3.1416F, 0.829F, 3.1416F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(85, 39).addBox(-14.7321F, -2.0F, -35.4533F, 15.0F, 2.0F, 36.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.0F, -21.2F, -3.1416F, 0.3927F, 3.1416F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(110, 0).addBox(0.2475F, -2.0F, -12.0325F, 31.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-33.0F, 0.0F, 27.7F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r6 = fossil.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 123).addBox(-25.3863F, -2.0F, -0.1882F, 25.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-28.0F, 0.0F, 0.7F, 0.0F, 1.021F, 0.0F));

		PartDefinition cube_r7 = fossil.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(85, 78).addBox(-24.9678F, -2.0F, -0.1125F, 25.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.8F, 0.0F, -16.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r8 = fossil.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(43, 0).addBox(-15.0F, -2.0F, 0.1F, 15.0F, 2.0F, 36.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, 0.0F, -22.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 5.0F));

		PartDefinition tail6 = root.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2927F, -8.0201F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r9 = tail6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, -40.0F, -8.1F, 0.0F, 80.0F, 42.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4073F, -7.9799F, 0.0F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 208, 150);
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