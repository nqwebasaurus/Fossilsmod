package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BobasatraniaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Bobasatrania;
	private final ModelPart Cephalon;
	private final ModelPart jaw;
	private final ModelPart Body1;
	private final ModelPart PectoralL;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart Body5;

	public BobasatraniaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Bobasatrania = this.fossil.getChild("Bobasatrania");
		this.Cephalon = this.Bobasatrania.getChild("Cephalon");
		this.jaw = this.Cephalon.getChild("jaw");
		this.Body1 = this.Bobasatrania.getChild("Body1");
		this.PectoralL = this.Body1.getChild("PectoralL");
		this.Body2 = this.Body1.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.Body5 = this.Body4.getChild("Body5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 90).addBox(-10.933F, -0.5F, -0.9828F, 11.0F, 1.0F, 30.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(20.3889F, -0.4F, -20.7441F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 43).addBox(-17.2F, -0.5F, -26.0F, 30.0F, 1.0F, 42.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.4395F, -0.4F, -2.6456F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 3).addBox(-17.4F, -0.5F, -12.5F, 38.0F, 1.0F, 34.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-2.3853F, -0.4F, 9.0297F, 0.0F, 0.4538F, 0.0F));

		PartDefinition Bobasatrania = fossil.addOrReplaceChild("Bobasatrania", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.0F, -10.0F, -0.1309F, 0.0F, -1.5708F));

		PartDefinition Cephalon = Bobasatrania.addOrReplaceChild("Cephalon", CubeListBuilder.create().texOffs(0, 87).addBox(-0.05F, -3.0F, -4.0F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(93, 87).addBox(-0.05F, -2.0F, -6.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 0).addBox(-0.02F, -0.5F, -5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 0).addBox(-0.05F, -1.0F, -7.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.8F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Cephalon.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 39).addBox(-0.07F, -1.3F, 0.2F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2F, -4.6F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Cephalon.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 0).addBox(-0.08F, -1.3F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 0).addBox(-0.07F, -1.3F, -1.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.0F, -5.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Cephalon.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 22).addBox(-0.04F, -7.0F, 0.0F, 0.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -7.0F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Cephalon.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 87).addBox(-0.03F, -2.0F, 3.2F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = Cephalon.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(5, 10).addBox(-0.08F, -0.4521F, -2.1821F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 10).addBox(-0.08F, -0.4521F, -3.1821F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6F, -3.6F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Body1 = Bobasatrania.addOrReplaceChild("Body1", CubeListBuilder.create().texOffs(0, 39).addBox(-0.07F, -5.0F, 0.0F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -3.3F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(23, 29).addBox(-0.085F, 0.4F, 1.7F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(31, 39).addBox(-0.075F, -2.2F, -0.1F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 87).addBox(-0.085F, -2.0F, 0.7F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-0.08F, -1.5F, -0.3F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.4538F, 0.0F, 0.0F));

		PartDefinition PectoralL = Body1.addOrReplaceChild("PectoralL", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, -1.0F, 0.0F, 0.0F, 7.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 2.0F, 1.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(35, 53).addBox(-0.04F, -7.0F, 0.0F, 0.0F, 12.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, 5.6F));

		PartDefinition cube_r10 = Body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 64).addBox(-0.085F, -0.0685F, -0.1884F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(83, 87).addBox(0.21F, -0.0685F, -2.1884F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.3F, 1.4F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 10).addBox(-0.088F, -0.7F, 0.093F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(88, 87).addBox(-0.05F, -0.272F, 0.093F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, -0.6F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 64).addBox(-0.085F, -0.0054F, -0.0304F, 0.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7F, 1.5F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(35, 71).addBox(-0.072F, -3.1054F, -0.0304F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7F, 1.5F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 39).addBox(-0.08F, -2.3F, 6.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -6.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(29, 10).addBox(-0.035F, -5.0F, -0.2F, 0.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.8F));

		PartDefinition cube_r15 = Body3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 39).addBox(-0.087F, -0.0658F, -0.0253F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3F, 0.4F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Body3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(66, 87).addBox(-0.045F, -0.1658F, -3.0253F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3F, 0.4F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Body3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 64).addBox(-0.087F, -0.331F, -0.1222F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2F, 0.2F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Body3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(13, 64).addBox(-0.038F, -2.931F, -0.0222F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2F, 0.2F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(73, 87).addBox(-0.02F, -3.0F, -0.1F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 0).addBox(-0.025F, -2.0F, 1.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-0.017F, -1.1F, 2.9F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 2.7F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Body4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(-0.085F, -0.6311F, -0.0382F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(28, 76).addBox(-0.05F, -1.9311F, -0.0382F, 0.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.2F, 0.6F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Body4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(22, 87).addBox(-0.088F, 0.3268F, -0.1517F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3F, 0.4F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Body4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 0).addBox(-0.041F, 0.1268F, -3.1517F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3F, 0.4F, 1.0734F, 0.0F, 0.0F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.02F, -1.0F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 5.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Body5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-0.025F, -10.0F, 0.0F, 0.0F, 20.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(18, 39).addBox(-0.024F, -0.7F, 0.8F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.3F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 125);
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