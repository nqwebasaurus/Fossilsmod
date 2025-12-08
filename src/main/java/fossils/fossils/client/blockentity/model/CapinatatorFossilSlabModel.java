package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CapinatatorFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftTeeth;
	private final ModelPart lefttooth3;
	private final ModelPart lefttooth4;
	private final ModelPart lefttooth5;
	private final ModelPart lefttooth6;
	private final ModelPart rightTeeth;
	private final ModelPart righttooth3;
	private final ModelPart righttooth4;
	private final ModelPart righttooth5;
	private final ModelPart righttooth6;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart body8;

	public CapinatatorFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body = this.root.getChild("body");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftTeeth = this.head.getChild("leftTeeth");
		this.lefttooth3 = this.leftTeeth.getChild("lefttooth3");
		this.lefttooth4 = this.leftTeeth.getChild("lefttooth4");
		this.lefttooth5 = this.leftTeeth.getChild("lefttooth5");
		this.lefttooth6 = this.leftTeeth.getChild("lefttooth6");
		this.rightTeeth = this.head.getChild("rightTeeth");
		this.righttooth3 = this.rightTeeth.getChild("righttooth3");
		this.righttooth4 = this.rightTeeth.getChild("righttooth4");
		this.righttooth5 = this.rightTeeth.getChild("righttooth5");
		this.righttooth6 = this.rightTeeth.getChild("righttooth6");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.body8 = this.body7.getChild("body8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(3.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 23).addBox(-13.8756F, -1.0F, -10.1753F, 7.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-13.8756F, -1.0F, -0.1753F, 14.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -1.0F, 1.7F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-2.9F, -1.0F, -8.0F, 6.0F, 2.0F, 16.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, -1.0F, -7.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -1.6F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -0.7F, -8.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 13).addBox(-1.25F, -0.5F, -8.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 46).addBox(-3.75F, -0.5F, -8.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.0F, -0.1F, 0.0F, -0.3491F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(9, 8).addBox(-1.0F, 0.4F, -3.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.5F, -1.0F, -7.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(11, 17).addBox(-1.0F, 0.125F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(-1.5F, 0.175F, -2.275F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.2F, -2.85F));

		PartDefinition leftTeeth = head.addOrReplaceChild("leftTeeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 0.8F, -0.95F, 0.0F, -0.3054F, 0.0F));

		PartDefinition lefttooth3 = leftTeeth.addOrReplaceChild("lefttooth3", CubeListBuilder.create().texOffs(12, 4).addBox(0.0F, 0.5274F, 0.2653F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -0.8774F, -0.2653F, -1.5708F, 0.0F, 0.0F));

		PartDefinition lefttooth4 = leftTeeth.addOrReplaceChild("lefttooth4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.537F, -1.6427F, -1.5708F, -0.3491F, 0.0F));

		PartDefinition lefttooth5 = leftTeeth.addOrReplaceChild("lefttooth5", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5291F, -0.212F, -0.5232F, -1.5708F, -0.7854F, 0.0F));

		PartDefinition lefttooth6 = leftTeeth.addOrReplaceChild("lefttooth6", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.875F, 0.113F, -0.0177F, 1.5708F, 0.8727F, 3.1416F));

		PartDefinition rightTeeth = head.addOrReplaceChild("rightTeeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 0.8F, -0.95F, 0.0F, 0.3054F, 0.0F));

		PartDefinition righttooth3 = rightTeeth.addOrReplaceChild("righttooth3", CubeListBuilder.create().texOffs(9, 13).addBox(-1.0F, 0.5274F, 0.2653F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.8774F, -0.2653F, -1.5708F, 0.0F, 0.0F));

		PartDefinition righttooth4 = rightTeeth.addOrReplaceChild("righttooth4", CubeListBuilder.create().texOffs(9, 8).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.537F, -1.6427F, -1.5708F, 0.3491F, 0.0F));

		PartDefinition righttooth5 = rightTeeth.addOrReplaceChild("righttooth5", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5291F, -0.212F, -0.5232F, -1.5708F, 0.7854F, 0.0F));

		PartDefinition righttooth6 = rightTeeth.addOrReplaceChild("righttooth6", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.875F, 0.113F, -0.0177F, 1.5708F, -0.8727F, -3.1416F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(26, 42).addBox(-1.475F, 0.4F, 0.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(49, 4).addBox(0.775F, 0.475F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(49, 0).addBox(-2.725F, 0.475F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, -1.0F, -5.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(38, 48).addBox(1.5F, 0.5F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 46).addBox(-3.5F, 0.5F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 42).addBox(-1.5F, 0.3F, 0.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.0F, 2.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 4).addBox(0.025F, 0.475F, 0.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-3.975F, 0.475F, 0.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-1.475F, 0.4F, 0.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.025F, 0.0F, 2.5F, 0.0F, -0.0436F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(30, 47).addBox(1.475F, 0.5F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(36, 43).addBox(-3.425F, 0.5F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-1.475F, 0.3F, 0.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 23).addBox(0.775F, 0.475F, 0.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-2.725F, 0.475F, 0.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-0.975F, 0.4F, 0.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(22, 46).addBox(-0.25F, 0.5F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(44, 44).addBox(-1.75F, 0.5F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(29, 27).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.0F, 3.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(29, 23).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(40, 37).addBox(-2.5F, 0.5F, 0.0F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 72, 55);
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