package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ConodontFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart head;
	private final ModelPart eyeR;
	private final ModelPart eyeL;
	private final ModelPart mouth;
	private final ModelPart gill;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart body8;
	private final ModelPart body9;
	private final ModelPart body10;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public ConodontFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.head = this.fossil.getChild("head");
		this.eyeR = this.head.getChild("eyeR");
		this.eyeL = this.head.getChild("eyeL");
		this.mouth = this.head.getChild("mouth");
		this.gill = this.head.getChild("gill");
		this.body = this.gill.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.body8 = this.body7.getChild("body8");
		this.body9 = this.body8.getChild("body9");
		this.body10 = this.body9.getChild("body10");
		this.tail1 = this.body10.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-27.8F, -2.0F, -53.9F, 26.0F, 2.0F, 90.0F, new CubeDeformation(-0.004F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 93).addBox(-7.5F, -1.0F, 0.0F, 25.0F, 2.0F, 89.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.5F, -1.0F, -53.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(140, 93).addBox(0.5301F, -1.0F, -13.2044F, 86.0F, 2.0F, 13.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(32.0266F, -1.0F, 48.1513F, 0.0F, 1.7453F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(140, 109).addBox(-0.5F, -1.0F, 0.0F, 37.0F, 2.0F, 37.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-18.3F, -1.0F, 36.1F, 0.0F, 0.5672F, 0.0F));

		PartDefinition head = fossil.addOrReplaceChild("head", CubeListBuilder.create().texOffs(41, 10).addBox(-1.5F, -1.0F, -7.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -1.5F, -33.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition eyeR = head.addOrReplaceChild("eyeR", CubeListBuilder.create().texOffs(0, 3).addBox(-1.75F, 1.95F, -1.25F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -6.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition eyeL = head.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, 1.95F, -1.25F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -6.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(33, 25).addBox(-1.49F, 1.0F, -1.75F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.9F, -1.65F, -5.25F));

		PartDefinition gill = head.addOrReplaceChild("gill", CubeListBuilder.create().texOffs(11, 0).addBox(-1.5F, 1.39F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -3.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition body = gill.addOrReplaceChild("body", CubeListBuilder.create().texOffs(35, 17).addBox(-1.5F, 1.5F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 9.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(32, 32).addBox(-1.5F, 1.49F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 32).addBox(-1.5F, 1.5F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, 1.49F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(28, 10).addBox(-1.5F, 1.5F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(27, 0).addBox(-1.5F, 1.49F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(20, 25).addBox(-1.5F, 1.5F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(7, 24).addBox(-1.5F, 1.49F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition body9 = body8.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(22, 18).addBox(-1.5F, 1.5F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition body10 = body9.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(26, 39).addBox(1.5F, -1.51F, 0.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.2182F, 0.0F, 1.5708F));

		PartDefinition tail1 = body10.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(13, 39).addBox(1.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 6.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(39, 39).addBox(1.0F, -1.51F, 0.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 10).addBox(1.3F, -4.0F, 0.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 38).addBox(1.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(1.3F, -4.0F, 0.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(40, 1).addBox(0.5F, -1.0F, 0.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(1.3F, -2.5F, 0.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 352, 200);
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