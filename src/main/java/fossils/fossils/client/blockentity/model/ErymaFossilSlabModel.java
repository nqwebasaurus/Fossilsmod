package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ErymaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart eyeR;
	private final ModelPart eyeL;
	private final ModelPart antennaR2;
	private final ModelPart antennaL2;
	private final ModelPart armR;
	private final ModelPart armR2;
	private final ModelPart armR3;
	private final ModelPart clawR;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart clawL;
	private final ModelPart armL4;
	private final ModelPart clawL2;
	private final ModelPart legR;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body6;
	private final ModelPart tail2;
	private final ModelPart tailfanR;
	private final ModelPart tailfanL;
	private final ModelPart tailfanR2;
	private final ModelPart tailfanL2;

	public ErymaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.eyeR = this.bone.getChild("eyeR");
		this.eyeL = this.bone.getChild("eyeL");
		this.antennaR2 = this.bone.getChild("antennaR2");
		this.antennaL2 = this.bone.getChild("antennaL2");
		this.armR = this.bone.getChild("armR");
		this.armR2 = this.armR.getChild("armR2");
		this.armR3 = this.armR2.getChild("armR3");
		this.clawR = this.armR3.getChild("clawR");
		this.armL = this.bone.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.clawL = this.armL3.getChild("clawL");
		this.armL4 = this.armL2.getChild("armL4");
		this.clawL2 = this.armL4.getChild("clawL2");
		this.legR = this.bone.getChild("legR");
		this.legL = this.bone.getChild("legL");
		this.legL2 = this.bone.getChild("legL2");
		this.legL3 = this.bone.getChild("legL3");
		this.legL4 = this.bone.getChild("legL4");
		this.body1 = this.bone.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body6 = this.body4.getChild("body6");
		this.tail2 = this.body6.getChild("tail2");
		this.tailfanR = this.tail2.getChild("tailfanR");
		this.tailfanL = this.tail2.getChild("tailfanL");
		this.tailfanR2 = this.tail2.getChild("tailfanR2");
		this.tailfanL2 = this.tail2.getChild("tailfanL2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 21).addBox(-8.0F, -5.0F, -10.0F, 17.0F, 5.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.2F, 0.5F, -9.8F, 27.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5F, -2.5F, 3.5F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 49).addBox(-1.2F, -1.5F, -8.1F, 17.0F, 4.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5F, 1.0F, 0.0F, 0.7418F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.35F, 4.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 66).addBox(-0.5F, -0.65F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 21).addBox(-1.5F, -0.65F, -1.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-2.0F, -0.65F, -0.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -4.75F, -5.5F, 0.0F, 0.0F, 0.1222F));

		PartDefinition eyeR = bone.addOrReplaceChild("eyeR", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -4.9F, -7.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition eyeL = bone.addOrReplaceChild("eyeL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -4.9F, -7.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition antennaR2 = bone.addOrReplaceChild("antennaR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.025F, -5.25F, -7.0F, 0.1745F, 0.1309F, 0.0F));

		PartDefinition antennaL2 = bone.addOrReplaceChild("antennaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.025F, -5.25F, -7.0F, 0.1745F, -0.1309F, 0.0F));

		PartDefinition armR = bone.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(7, 62).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -4.95F, -5.0F, 0.01F, 0.7514F, 0.3401F));

		PartDefinition cube_r4 = armR.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 21).addBox(-0.65F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition armR2 = armR.addOrReplaceChild("armR2", CubeListBuilder.create().texOffs(7, 0).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.75F, 0.0F, -1.55F, 0.0F, -0.7854F, 0.0F));

		PartDefinition armR3 = armR2.addOrReplaceChild("armR3", CubeListBuilder.create().texOffs(57, 37).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F))
				.texOffs(0, 38).addBox(-1.0F, -0.5F, -5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.75F, 0.0F, -0.6109F, 0.0F));

		PartDefinition clawR = armR3.addOrReplaceChild("clawR", CubeListBuilder.create().texOffs(8, 13).addBox(-0.25F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.25F, 0.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition armL = bone.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(0, 63).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, -4.25F, -5.0F, 0.0F, -0.1745F, 0.3927F));

		PartDefinition cube_r5 = armL.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 62).addBox(-0.35F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(57, 53).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.75F, 0.0F, -1.55F, 0.0F, -0.2618F, 0.0F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F))
				.texOffs(9, 54).addBox(0.0F, -0.5F, -5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.75F, 0.0F, 0.3927F, 0.0F));

		PartDefinition clawL = armL3.addOrReplaceChild("clawL", CubeListBuilder.create().texOffs(0, 54).addBox(-0.75F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.25F, 0.0F, -2.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition armL4 = armL2.addOrReplaceChild("armL4", CubeListBuilder.create().texOffs(57, 57).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F))
				.texOffs(9, 49).addBox(0.0F, -0.5F, -5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.0F, 3.0F, -12.75F, -3.0753F, 0.0843F, -2.8788F));

		PartDefinition clawL2 = armL4.addOrReplaceChild("clawL2", CubeListBuilder.create().texOffs(0, 49).addBox(-0.75F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.25F, 0.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legR = bone.addOrReplaceChild("legR", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -3.25F, -3.75F, 0.0F, 1.1781F, 0.0F));

		PartDefinition legL = bone.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, -0.75F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(57, 64).addBox(0.0F, 0.25F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -3.25F, -3.75F, 0.0F, -1.2654F, 0.0F));

		PartDefinition legL2 = bone.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, -0.75F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(0.0F, 0.25F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -3.25F, -3.15F, 0.0F, -1.4399F, 0.0F));

		PartDefinition legL3 = bone.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(7, 4).addBox(0.0F, -0.75F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(17, 53).addBox(0.0F, 0.25F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -3.25F, -2.6F, 0.0F, -1.8326F, 0.0F));

		PartDefinition legL4 = bone.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(62, 64).addBox(0.0F, 0.15F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -0.75F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -3.25F, -1.95F, 0.0F, -2.2253F, 0.0F));

		PartDefinition body1 = bone.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(57, 25).addBox(-1.5F, 0.25F, 0.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -5.5F, -1.5F, 0.1307F, -0.0038F, 0.0872F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(11, 35).addBox(-1.5F, -0.25F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(11, 30).addBox(-1.5F, 0.0F, -0.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2F, 1.9F, -0.1917F, 0.2066F, -0.0825F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(9, 40).addBox(-1.5F, 0.0F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.1F, 1.75F, 0.0485F, 0.1699F, 0.0136F));

		PartDefinition body6 = body4.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(15, 49).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.75F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = body6.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(57, 49).addBox(-0.99F, 0.25F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tailfanR = tail2.addOrReplaceChild("tailfanR", CubeListBuilder.create().texOffs(57, 61).addBox(-1.01F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.25F, 0.0F, -0.1309F, -0.6545F, -0.1309F));

		PartDefinition tailfanL = tail2.addOrReplaceChild("tailfanL", CubeListBuilder.create().texOffs(57, 33).addBox(-0.99F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.25F, 0.0F, -0.1309F, 0.6545F, 0.1309F));

		PartDefinition tailfanR2 = tail2.addOrReplaceChild("tailfanR2", CubeListBuilder.create().texOffs(9, 59).addBox(-1.01F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.25F, 0.0F, -0.2618F, -1.2217F, -0.2618F));

		PartDefinition tailfanL2 = tail2.addOrReplaceChild("tailfanL2", CubeListBuilder.create().texOffs(57, 29).addBox(-0.99F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.25F, 0.0F, -0.2618F, 1.2217F, 0.2618F));

		return LayerDefinition.create(meshdefinition, 93, 80);
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