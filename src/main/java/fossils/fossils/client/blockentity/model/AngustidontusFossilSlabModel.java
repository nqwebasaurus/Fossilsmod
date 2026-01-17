package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AngustidontusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart antennaR2;
	private final ModelPart antennaL2;
	private final ModelPart antennaR3;
	private final ModelPart antennaL3;
	private final ModelPart antennaR1;
	private final ModelPart antennaL1;
	private final ModelPart eyeL;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart legL;
	private final ModelPart body3;
	private final ModelPart legL2;
	private final ModelPart body4;
	private final ModelPart legL3;
	private final ModelPart body5;
	private final ModelPart legL4;
	private final ModelPart body6;
	private final ModelPart legL5;
	private final ModelPart body7;
	private final ModelPart body8;
	private final ModelPart armR;
	private final ModelPart armsR;
	private final ModelPart armL;
	private final ModelPart armsL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart armL7;
	private final ModelPart armL8;


	public AngustidontusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.antennaR2 = this.bone.getChild("antennaR2");
		this.antennaL2 = this.bone.getChild("antennaL2");
		this.antennaR3 = this.bone.getChild("antennaR3");
		this.antennaL3 = this.bone.getChild("antennaL3");
		this.antennaR1 = this.bone.getChild("antennaR1");
		this.antennaL1 = this.bone.getChild("antennaL1");
		this.eyeL = this.bone.getChild("eyeL");
		this.body1 = this.bone.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.legL = this.body2.getChild("legL");
		this.body3 = this.body2.getChild("body3");
		this.legL2 = this.body3.getChild("legL2");
		this.body4 = this.body3.getChild("body4");
		this.legL3 = this.body4.getChild("legL3");
		this.body5 = this.body4.getChild("body5");
		this.legL4 = this.body5.getChild("legL4");
		this.body6 = this.body5.getChild("body6");
		this.legL5 = this.body6.getChild("legL5");
		this.body7 = this.body6.getChild("body7");
		this.body8 = this.body7.getChild("body8");
		this.armR = this.bone.getChild("armR");
		this.armsR = this.armR.getChild("armsR");
		this.armL = this.bone.getChild("armL");
		this.armsL = this.armL.getChild("armsL");
		this.armL2 = this.bone.getChild("armL2");
		this.armL3 = this.bone.getChild("armL3");
		this.armL4 = this.bone.getChild("armL4");
		this.armL5 = this.bone.getChild("armL5");
		this.armL6 = this.bone.getChild("armL6");
		this.armL7 = this.bone.getChild("armL7");
		this.armL8 = this.bone.getChild("armL8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -2.0F, 2.0F, 26.0F, 2.0F, 24.0F, new CubeDeformation(0.003F))
				.texOffs(56, 27).addBox(-8.0F, -2.0F, -26.0F, 14.0F, 2.0F, 28.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 61).addBox(-34.6724F, -1.0F, 0.1557F, 35.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5F, -1.0F, -6.5F, 0.0F, 1.9286F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 73).addBox(-10.0F, -1.0F, -23.5F, 23.0F, 2.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, -1.0F, -2.5F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 27).addBox(-12.0F, -2.0F, -30.5F, 12.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0F, 0.0F, 2.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.15F, 5.7F, -0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(2.8F, -5.9F, -4.65F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 0).addBox(3.0F, -6.35F, -7.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(3.0F, -6.35F, -6.25F, 0.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition antennaR2 = bone.addOrReplaceChild("antennaR2", CubeListBuilder.create().texOffs(9, 32).addBox(0.0F, -2.5F, -8.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.35F, -3.75F, -5.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition antennaL2 = bone.addOrReplaceChild("antennaL2", CubeListBuilder.create().texOffs(0, 27).addBox(1.0F, -2.5F, -8.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, -3.75F, -5.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition antennaR3 = bone.addOrReplaceChild("antennaR3", CubeListBuilder.create().texOffs(56, 27).addBox(-2.0F, 0.0F, -5.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -2.25F, -6.5F, 0.0F, 0.6981F, -1.5708F));

		PartDefinition antennaL3 = bone.addOrReplaceChild("antennaL3", CubeListBuilder.create().texOffs(0, 45).addBox(0.0F, -2.0F, -6.9F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.95F, -5.1F, 0.0F, -0.3491F, 1.5708F));

		PartDefinition antennaR1 = bone.addOrReplaceChild("antennaR1", CubeListBuilder.create().texOffs(55, 85).addBox(-0.25F, 0.0F, -22.0F, 0.0F, 4.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.65F, -3.4F, -5.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition antennaL1 = bone.addOrReplaceChild("antennaL1", CubeListBuilder.create().texOffs(67, 58).addBox(0.25F, 0.0F, -22.0F, 0.0F, 4.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.45F, -3.4F, -5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition eyeL = bone.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8F, -4.25F, -6.2F));

		PartDefinition body1 = bone.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.9F, -1.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(10, 73).addBox(3.11F, 0.0F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition legL = body2.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(72, 32).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 5.0F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(5, 73).addBox(3.11F, 0.0F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legL2 = body3.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 5.0F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 73).addBox(3.11F, 0.0F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legL3 = body4.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(0, 40).addBox(-0.3F, 0.0F, -0.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 5.0F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(67, 73).addBox(3.11F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.25F, 2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legL4 = body5.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(12, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 4.0F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 27).addBox(2.01F, 0.0F, -0.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.05F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legL5 = body6.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(9, 27).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 4.0F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(12, 45).addBox(2.01F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(0, 18).addBox(1.01F, -0.5F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(7, 18).addBox(0.91F, 0.1F, 3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.75F, 3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body8.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 35).addBox(-1.2058F, 0.0937F, -0.0455F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9197F, 1.1537F, 0.2833F, 0.0F, 0.6919F, 1.5708F));

		PartDefinition cube_r7 = body8.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 43).addBox(-1.2288F, -0.1168F, -0.2712F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9197F, 1.1537F, 0.2833F, 0.0F, 0.4323F, 1.5708F));

		PartDefinition cube_r8 = body8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 46).addBox(-0.6656F, 0.0937F, -0.4588F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9309F, 1.1969F, 0.5186F, 0.0F, -0.3491F, -1.5708F));

		PartDefinition cube_r9 = body8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(67, 44).addBox(-0.5468F, -0.1168F, -0.6377F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9309F, 1.1969F, 0.5186F, 0.0F, -0.0873F, -1.5708F));

		PartDefinition armR = bone.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(26, 37).addBox(0.0F, 0.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.35F, -2.5F, -4.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition armsR = armR.addOrReplaceChild("armsR", CubeListBuilder.create().texOffs(23, 27).addBox(0.01F, 0.0F, -0.5F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -0.5F, 1.8762F, 0.0F, 0.0F));

		PartDefinition armL = bone.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(19, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.65F, -2.5F, -4.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition armsL = armL.addOrReplaceChild("armsL", CubeListBuilder.create().texOffs(18, 27).addBox(-0.01F, 0.0F, -0.5F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -0.5F, 0.829F, 0.0F, 0.0F));

		PartDefinition armL2 = bone.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(62, 73).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, -2.5F, -3.5F, -0.6545F, 0.0F, 0.0F));

		PartDefinition armL3 = bone.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(68, 27).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -2.5F, -2.5F, -0.6109F, 0.0F, 0.0F));

		PartDefinition armL4 = bone.addOrReplaceChild("armL4", CubeListBuilder.create().texOffs(56, 35).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -2.75F, -1.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition armL5 = bone.addOrReplaceChild("armL5", CubeListBuilder.create().texOffs(77, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -2.0F, -0.75F, -0.2618F, 0.0F, 0.0F));

		PartDefinition armL6 = bone.addOrReplaceChild("armL6", CubeListBuilder.create().texOffs(76, 27).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -2.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition armL7 = bone.addOrReplaceChild("armL7", CubeListBuilder.create().texOffs(72, 73).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -2.0F, 0.75F, -0.0436F, 0.0F, 0.0F));

		PartDefinition armL8 = bone.addOrReplaceChild("armL8", CubeListBuilder.create().texOffs(56, 27).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -2.0F, 1.5F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 120);
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