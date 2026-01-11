package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LungmenshanaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Lungmenshanaspis;
	private final ModelPart Cephalon;
	private final ModelPart CornualPlateL;
	private final ModelPart CornualplateR;
	private final ModelPart bone;

	public LungmenshanaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Lungmenshanaspis = this.fossil.getChild("Lungmenshanaspis");
		this.Cephalon = this.Lungmenshanaspis.getChild("Cephalon");
		this.CornualPlateL = this.Cephalon.getChild("CornualPlateL");
		this.CornualplateR = this.Cephalon.getChild("CornualplateR");
		this.bone = this.fossil.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -2.618F, 0.0F));

		PartDefinition Lungmenshanaspis = fossil.addOrReplaceChild("Lungmenshanaspis", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8F, 0.0F, -3.0646F, 0.6519F, 3.1092F));

		PartDefinition Cephalon = Lungmenshanaspis.addOrReplaceChild("Cephalon", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -1.3F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 37).addBox(-1.5F, -1.3F, -6.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(-2.5F, -1.3F, -3.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 10).addBox(-1.0F, -1.5F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(13, 44).addBox(-2.5F, -1.2F, -5.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.7615F, -0.2614F, 3.75F));

		PartDefinition Rostrum_r1 = Cephalon.addOrReplaceChild("Rostrum_r1", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.25F, -2.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -16.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition CornualPlateL = Cephalon.addOrReplaceChild("CornualPlateL", CubeListBuilder.create().texOffs(17, 3).addBox(0.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition CornualR2_r1 = CornualPlateL.addOrReplaceChild("CornualR2_r1", CubeListBuilder.create().texOffs(13, 17).addBox(-6.2F, 1.1F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(9.7066F, 0.5F, -2.6692F, 0.0914F, 0.3283F, 0.2769F));

		PartDefinition PlateSlatedR_r1 = CornualPlateL.addOrReplaceChild("PlateSlatedR_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-3.224F, -1.0F, -0.8313F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.0F, -0.9425F, 0.0F));

		PartDefinition CornualplateR = Cephalon.addOrReplaceChild("CornualplateR", CubeListBuilder.create().texOffs(17, 0).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -1.0F, -2.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Plateslated_r1 = CornualplateR.addOrReplaceChild("Plateslated_r1", CubeListBuilder.create().texOffs(13, 40).addBox(-3.724F, -1.0F, -5.0313F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.0F, 1.0F, 0.0F, 0.0F, 0.9425F, 0.0F));

		PartDefinition CornualL2_r1 = CornualplateR.addOrReplaceChild("CornualL2_r1", CubeListBuilder.create().texOffs(10, 37).addBox(-6.0161F, -1.0F, -1.0134F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-4.0F, 1.0F, 1.0F, 0.0614F, -0.335F, -0.1849F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(62, 0).addBox(-10.0F, -2.0F, -5.0F, 3.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(57, 52).addBox(-7.0F, -2.0F, -5.0F, 19.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(-13.0F, -2.0F, -11.0F, 25.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-13.0F, -1.0F, -12.0F, 16.0F, 1.0F, 29.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(3.0F, -1.0F, -12.0F, 9.0F, 1.0F, 26.0F, new CubeDeformation(0.0F))
				.texOffs(45, 31).addBox(-7.0F, -3.0F, -10.0F, 18.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0023F, -0.5F, 0.1347F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0848F, -3.5F, -8.822F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 68).addBox(-3.5F, -4.0F, -6.75F, 11.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0F, -3.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0F, -1.0F, 17.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(62, 20).addBox(0.0F, 0.0F, -4.0F, 19.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -2.0F, 13.0F, 0.0F, 0.2618F, 0.0F));

		return LayerDefinition.create(meshdefinition, 126, 90);
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