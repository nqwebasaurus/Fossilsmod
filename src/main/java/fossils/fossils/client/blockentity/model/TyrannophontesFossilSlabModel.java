package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TyrannophontesFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart antennaL2;
	private final ModelPart antennaL1;
	private final ModelPart eyeR;
	private final ModelPart eyeL;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart pleopodL;
	private final ModelPart body6;
	private final ModelPart pleopodL2;
	private final ModelPart body7;
	private final ModelPart pleopodL3;
	private final ModelPart body8;
	private final ModelPart pleopodL4;
	private final ModelPart body9;
	private final ModelPart pleopodL5;
	private final ModelPart body10;
	private final ModelPart talson;
	private final ModelPart talson2;
	private final ModelPart talson4;
	private final ModelPart talson3;
	private final ModelPart talson5;
	private final ModelPart legL3;
	private final ModelPart legL2;
	private final ModelPart legL;
	private final ModelPart armR;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;

	public TyrannophontesFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.antennaL2 = this.bone.getChild("antennaL2");
		this.antennaL1 = this.bone.getChild("antennaL1");
		this.eyeR = this.bone.getChild("eyeR");
		this.eyeL = this.bone.getChild("eyeL");
		this.body1 = this.bone.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.pleopodL = this.body5.getChild("pleopodL");
		this.body6 = this.body5.getChild("body6");
		this.pleopodL2 = this.body6.getChild("pleopodL2");
		this.body7 = this.body6.getChild("body7");
		this.pleopodL3 = this.body7.getChild("pleopodL3");
		this.body8 = this.body7.getChild("body8");
		this.pleopodL4 = this.body8.getChild("pleopodL4");
		this.body9 = this.body8.getChild("body9");
		this.pleopodL5 = this.body9.getChild("pleopodL5");
		this.body10 = this.body9.getChild("body10");
		this.talson = this.body10.getChild("talson");
		this.talson2 = this.body10.getChild("talson2");
		this.talson4 = this.body10.getChild("talson4");
		this.talson3 = this.body10.getChild("talson3");
		this.talson5 = this.body10.getChild("talson5");
		this.legL3 = this.body4.getChild("legL3");
		this.legL2 = this.body3.getChild("legL2");
		this.legL = this.body2.getChild("legL");
		this.armR = this.bone.getChild("armR");
		this.armL = this.bone.getChild("armL");
		this.armL2 = this.bone.getChild("armL2");
		this.armL3 = this.bone.getChild("armL3");
		this.armL4 = this.bone.getChild("armL4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-32.8684F, -1.0F, 8.0131F, 14.0F, 2.0F, 30.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-10.7713F, -1.0F, 26.2236F, 0.0F, -2.9234F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -1.0F, -17.0F, 27.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3713F, -1.0F, 4.4787F, 0.0F, 2.0944F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(59, 27).addBox(-20.1646F, -1.0F, 5.2F, 15.0F, 2.0F, 26.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(20.5F, -1.0F, -19.7F, 0.0F, -0.5498F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.05F, -5.9F, 0.5236F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(2.5F, -6.1F, -6.25F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition antennaL2 = bone.addOrReplaceChild("antennaL2", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -2.5F, -7.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -2.75F, -6.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition antennaL1 = bone.addOrReplaceChild("antennaL1", CubeListBuilder.create().texOffs(14, 35).addBox(0.25F, 0.0F, -6.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.05F, -2.9F, -5.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition eyeR = bone.addOrReplaceChild("eyeR", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -2.5F, -5.5F, 0.0F, 0.2182F, 0.0F));

		PartDefinition eyeL = bone.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(18, 0).addBox(1.0F, -1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.4F, -2.5F, -5.5F));

		PartDefinition body1 = bone.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(27, 60).addBox(2.4F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9F, -1.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(19, 5).addBox(2.41F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 49).addBox(2.4F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(25, 44).addBox(2.41F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 27).addBox(2.4F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition pleopodL = body5.addOrReplaceChild("pleopodL", CubeListBuilder.create().texOffs(21, 35).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 4.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(32, 60).addBox(2.41F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition pleopodL2 = body6.addOrReplaceChild("pleopodL2", CubeListBuilder.create().texOffs(24, 35).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 4.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(0, 41).addBox(2.4F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition pleopodL3 = body7.addOrReplaceChild("pleopodL3", CubeListBuilder.create().texOffs(17, 35).addBox(-0.5F, -1.05F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 4.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(23, 27).addBox(2.41F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition pleopodL4 = body8.addOrReplaceChild("pleopodL4", CubeListBuilder.create().texOffs(5, 27).addBox(-0.5F, -1.65F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 4.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition body9 = body8.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(9, 27).addBox(2.4F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition pleopodL5 = body9.addOrReplaceChild("pleopodL5", CubeListBuilder.create().texOffs(21, 19).addBox(-0.5F, -2.35F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 4.0F, 1.0F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition body10 = body9.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(7, 60).addBox(-1.5F, -0.1F, -0.025F, 3.0F, 0.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 1.5F, 1.8F, 0.0F, 0.1745F, 1.5708F));

		PartDefinition talson = body10.addOrReplaceChild("talson", CubeListBuilder.create().texOffs(9, 5).addBox(-0.5F, -0.25F, 3.75F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-1.0F, -0.35F, -0.25F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.3F, 3.0F));

		PartDefinition talson2 = body10.addOrReplaceChild("talson2", CubeListBuilder.create().texOffs(0, 49).addBox(-2.25F, 0.0F, 0.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition talson4 = body10.addOrReplaceChild("talson4", CubeListBuilder.create().texOffs(9, 27).addBox(-0.75F, 0.0F, 0.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 3.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition talson3 = body10.addOrReplaceChild("talson3", CubeListBuilder.create().texOffs(0, 41).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.7418F, 0.0F));

		PartDefinition talson5 = body10.addOrReplaceChild("talson5", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.0F, 0.0F, 0.7418F, 0.0F));

		PartDefinition legL3 = body4.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(59, 42).addBox(0.0F, 0.0F, -0.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 4.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition legL2 = body3.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(20, 60).addBox(0.0F, 0.0F, -0.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 4.0F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition legL = body2.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(18, 46).addBox(0.0F, 0.0F, -0.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 4.0F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition armR = bone.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(0, 60).addBox(-12.0F, -1.5F, -4.5F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.15F, -3.5F, -1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition armL = bone.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(59, 27).addBox(-13.0F, -1.5F, -4.5F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.45F, -2.5F, -1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition armL2 = bone.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(14, 10).addBox(-8.0F, 0.0F, -0.5F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1F, -2.25F, -3.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition armL3 = bone.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.05F, -2.25F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition armL4 = bone.addOrReplaceChild("armL4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, -2.25F, -1.25F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 80);
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