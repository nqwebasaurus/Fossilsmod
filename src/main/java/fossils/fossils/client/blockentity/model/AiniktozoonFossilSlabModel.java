package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AiniktozoonFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bones;
	private final ModelPart bodybase;
	private final ModelPart legL;
	private final ModelPart legR;
	private final ModelPart legL2;
	private final ModelPart legR2;
	private final ModelPart legL3;
	private final ModelPart legR3;
	private final ModelPart body1;
	private final ModelPart finL;
	private final ModelPart body2;
	private final ModelPart finL2;
	private final ModelPart body3;
	private final ModelPart finL3;
	private final ModelPart body4;
	private final ModelPart finL4;
	private final ModelPart body5;
	private final ModelPart finL5;
	private final ModelPart body6;
	private final ModelPart finL6;
	private final ModelPart body7;
	private final ModelPart finL7;
	private final ModelPart body8;
	private final ModelPart finL8;
	private final ModelPart body9;
	private final ModelPart finL9;
	private final ModelPart body10;
	private final ModelPart finL10;
	private final ModelPart body11;
	private final ModelPart finR11;
	private final ModelPart finL11;
	private final ModelPart body12;
	private final ModelPart finR12;
	private final ModelPart finL12;
	private final ModelPart tail;
	private final ModelPart eye;
	private final ModelPart carapace;

	public AiniktozoonFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bones = this.fossil.getChild("bones");
		this.bodybase = this.bones.getChild("bodybase");
		this.legL = this.bodybase.getChild("legL");
		this.legR = this.bodybase.getChild("legR");
		this.legL2 = this.bodybase.getChild("legL2");
		this.legR2 = this.bodybase.getChild("legR2");
		this.legL3 = this.bodybase.getChild("legL3");
		this.legR3 = this.bodybase.getChild("legR3");
		this.body1 = this.bodybase.getChild("body1");
		this.finL = this.body1.getChild("finL");
		this.body2 = this.body1.getChild("body2");
		this.finL2 = this.body2.getChild("finL2");
		this.body3 = this.body2.getChild("body3");
		this.finL3 = this.body3.getChild("finL3");
		this.body4 = this.body3.getChild("body4");
		this.finL4 = this.body4.getChild("finL4");
		this.body5 = this.body4.getChild("body5");
		this.finL5 = this.body5.getChild("finL5");
		this.body6 = this.body5.getChild("body6");
		this.finL6 = this.body6.getChild("finL6");
		this.body7 = this.body6.getChild("body7");
		this.finL7 = this.body7.getChild("finL7");
		this.body8 = this.body7.getChild("body8");
		this.finL8 = this.body8.getChild("finL8");
		this.body9 = this.body8.getChild("body9");
		this.finL9 = this.body9.getChild("finL9");
		this.body10 = this.body9.getChild("body10");
		this.finL10 = this.body10.getChild("finL10");
		this.body11 = this.body10.getChild("body11");
		this.finR11 = this.body11.getChild("finR11");
		this.finL11 = this.body11.getChild("finL11");
		this.body12 = this.body11.getChild("body12");
		this.finR12 = this.body12.getChild("finR12");
		this.finL12 = this.body12.getChild("finL12");
		this.tail = this.body12.getChild("tail");
		this.eye = this.bones.getChild("eye");
		this.carapace = this.bones.getChild("carapace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 31).addBox(-11.0F, -1.0F, -12.0F, 16.0F, 1.0F, 23.0F, new CubeDeformation(0.0F))
				.texOffs(0, 56).addBox(5.0F, -1.0F, -2.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 56).addBox(-4.4F, -1.0F, -11.0F, 4.0F, 1.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(9.4F, 0.0F, -2.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(1.3F, 0.0F, -16.7F, 16.0F, 1.0F, 29.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-12.0F, -1.0F, 13.5F, 0.0F, 0.7418F, 0.0F));

		PartDefinition bones = fossil.addOrReplaceChild("bones", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -2.2F, 2.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bodybase = bones.addOrReplaceChild("bodybase", CubeListBuilder.create().texOffs(0, 0).addBox(-1.01F, -2.75F, -8.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, 0.0F));

		PartDefinition legL = bodybase.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(5, 17).addBox(0.0F, 0.0F, -2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -1.0F, -6.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition legR = bodybase.addOrReplaceChild("legR", CubeListBuilder.create().texOffs(15, 8).addBox(-0.1F, 0.0F, -2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.05F, -1.0F, -6.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition legL2 = bodybase.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -0.5F, -2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -1.0F, -5.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legR2 = bodybase.addOrReplaceChild("legR2", CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -0.5F, -2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.05F, -1.0F, -5.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition legL3 = bodybase.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, -0.25F, -3.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.55F, -1.0F, -4.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition legR3 = bodybase.addOrReplaceChild("legR3", CubeListBuilder.create().texOffs(6, 4).addBox(0.0F, -0.25F, -3.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, -1.0F, -4.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body1 = bodybase.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(25, 4).addBox(-1.0F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.05F, -4.0F));

		PartDefinition finL = body1.addOrReplaceChild("finL", CubeListBuilder.create().texOffs(22, 17).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(26, 8).addBox(-0.99F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL2 = body2.addOrReplaceChild("finL2", CubeListBuilder.create().texOffs(12, 22).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL3 = body3.addOrReplaceChild("finL3", CubeListBuilder.create().texOffs(9, 22).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(25, 24).addBox(-0.99F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL4 = body4.addOrReplaceChild("finL4", CubeListBuilder.create().texOffs(22, 4).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(23, 21).addBox(-1.0F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition finL5 = body5.addOrReplaceChild("finL5", CubeListBuilder.create().texOffs(22, 0).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(22, 25).addBox(-0.99F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition finL6 = body6.addOrReplaceChild("finL6", CubeListBuilder.create().texOffs(17, 21).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(23, 8).addBox(-1.0F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition finL7 = body7.addOrReplaceChild("finL7", CubeListBuilder.create().texOffs(20, 20).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(25, 17).addBox(-0.99F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition finL8 = body8.addOrReplaceChild("finL8", CubeListBuilder.create().texOffs(20, 8).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body9 = body8.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(4, 23).addBox(-1.0F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition finL9 = body9.addOrReplaceChild("finL9", CubeListBuilder.create().texOffs(18, 17).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body10 = body9.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(7, 25).addBox(-0.99F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition finL10 = body10.addOrReplaceChild("finL10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body11 = body10.addOrReplaceChild("body11", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finR11 = body11.addOrReplaceChild("finR11", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.15F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition finL11 = body11.addOrReplaceChild("finL11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 0.15F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = finL11.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 17).addBox(0.04F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body12 = body11.addOrReplaceChild("body12", CubeListBuilder.create().texOffs(15, 0).addBox(-0.49F, -0.51F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 0.0F, 1.0F));

		PartDefinition finR12 = body12.addOrReplaceChild("finR12", CubeListBuilder.create().texOffs(19, 24).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.15F, 0.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition finL12 = body12.addOrReplaceChild("finL12", CubeListBuilder.create().texOffs(15, 24).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.15F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition tail = body12.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(5, 0).addBox(-0.5F, 0.05F, -0.5F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition eye = bones.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(10, 17).addBox(-1.1F, -2.1F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -0.75F, -7.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition carapace = bones.addOrReplaceChild("carapace", CubeListBuilder.create().texOffs(0, 0).addBox(-0.7F, -4.0F, 0.25F, 0.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(56, 31).addBox(-0.55F, -2.85F, 1.25F, 0.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(53, 56).addBox(-0.4F, -1.1F, 1.25F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -8.2F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 80);
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