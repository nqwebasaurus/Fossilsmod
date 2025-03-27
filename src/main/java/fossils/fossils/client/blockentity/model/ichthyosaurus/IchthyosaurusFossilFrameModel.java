package fossils.fossils.client.blockentity.model.ichthyosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IchthyosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Ophthalmosaurus;
	private final ModelPart Body1;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart Body6;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart eye;
	private final ModelPart Jaw;

	public IchthyosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Ophthalmosaurus = this.fossil.getChild("Ophthalmosaurus");
		this.Body1 = this.Ophthalmosaurus.getChild("Body1");
		this.ForelimbL = this.Body1.getChild("ForelimbL");
		this.ForelimbL2 = this.Body1.getChild("ForelimbL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body6 = this.Body5.getChild("Body6");
		this.Body7 = this.Body6.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Ophthalmosaurus.getChild("Head");
		this.eye = this.Head.getChild("eye");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(5, 1).addBox(-0.5F, -12.7F, -10.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 67).addBox(-1.2F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, -8.3F, 10.4F, -0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 64).addBox(1.1F, -4.5F, -11.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -6.5F, 1.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6F, -8.3F, 10.4F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Ophthalmosaurus = fossil.addOrReplaceChild("Ophthalmosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -22.75F));

		PartDefinition Body1 = Ophthalmosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offset(0.0F, -11.9183F, 9.1578F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 48).addBox(-0.5F, 0.3F, -3.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body1.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2F, 3.4183F, 4.0422F, 0.1641F, -0.0805F, -0.0568F));

		PartDefinition ForelimbL2 = Body1.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2F, 3.4183F, 4.0422F, 0.4166F, 0.2554F, -0.1642F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.026F, 3.1368F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 1).addBox(-1.5F, 0.8247F, -0.2074F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 2.7054F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 49).addBox(-1.5F, 0.75F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6931F, 9.6655F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r7 = Body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 20).addBox(-1.5F, 0.8F, -0.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4387F, 7.7183F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r8 = Body4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 6).addBox(-1.5F, -0.2354F, -0.1556F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.3988F, 3.7216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(56, 32).addBox(-1.5F, 0.7352F, 0.4356F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 5.0988F, 3.5216F, 0.4974F, -0.3175F, -0.0903F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.0988F, 3.5216F, 0.4041F, 0.4322F, -0.1629F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8617F, 6.7871F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r10 = Body5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 31).addBox(-1.5F, 0.85F, 0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1222F, 6.7884F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r11 = Body6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 12).addBox(-1.5F, 0.25F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body7 = Body6.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0209F, 4.003F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r12 = Body7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 38).addBox(-1.5F, 0.7838F, -0.4096F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1165F, 6.0478F));

		PartDefinition cube_r13 = Body8.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 56).addBox(-1.5F, -0.2367F, 0.0419F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 5.6193F, 3.6953F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 0).addBox(-1.5F, 0.6804F, -1.4574F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.9193F, 2.0953F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Body8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 73).addBox(-1.5F, 0.7261F, -0.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.2807F, -0.1047F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Ophthalmosaurus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, -11.7409F, 8.7822F, 0.0F, 0.0436F, 0.0F));

		PartDefinition eye = Head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2214F, -0.1591F, -4.1822F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.3667F, 0.8161F, 0.1222F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 85, 80);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}