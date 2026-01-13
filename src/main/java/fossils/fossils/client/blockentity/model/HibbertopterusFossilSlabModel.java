package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HibbertopterusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart carapace;
	private final ModelPart legsR;
	private final ModelPart LegsR2;
	private final ModelPart LegsR3;
	private final ModelPart LegsR4;
	private final ModelPart legsL;
	private final ModelPart legsL2;
	private final ModelPart legsL3;
	private final ModelPart opisthosoma;
	private final ModelPart opisthosoma2;
	private final ModelPart opisthosoma3;
	private final ModelPart opisthosoma4;

	public HibbertopterusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.carapace = this.fossil.getChild("carapace");
		this.legsR = this.carapace.getChild("legsR");
		this.LegsR2 = this.legsR.getChild("LegsR2");
		this.LegsR3 = this.legsR.getChild("LegsR3");
		this.LegsR4 = this.legsR.getChild("LegsR4");
		this.legsL = this.carapace.getChild("legsL");
		this.legsL2 = this.legsL.getChild("legsL2");
		this.legsL3 = this.legsL.getChild("legsL3");
		this.opisthosoma = this.carapace.getChild("opisthosoma");
		this.opisthosoma2 = this.opisthosoma.getChild("opisthosoma2");
		this.opisthosoma3 = this.opisthosoma2.getChild("opisthosoma3");
		this.opisthosoma4 = this.opisthosoma3.getChild("opisthosoma4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -2.0F, -10.0F, 13.0F, 2.0F, 19.0F, new CubeDeformation(0.004F))
				.texOffs(0, 22).addBox(-9.0F, -1.0F, -12.0F, 2.0F, 1.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(33, 61).addBox(-7.0F, -2.0F, -13.0F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(37, 47).addBox(4.0F, -3.0F, -7.0F, 5.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(37, 35).addBox(-3.0F, -1.0F, 3.0F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition carapace = fossil.addOrReplaceChild("carapace", CubeListBuilder.create().texOffs(46, 0).addBox(-6.0F, -6.0F, -4.0F, 12.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(46, 12).addBox(-6.0F, -2.0F, -7.0F, 12.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(26, 22).addBox(-6.5F, -0.9F, -7.5F, 13.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 59).addBox(-6.0F, -6.0F, 1.0F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -2.0F, 0.0F));

		PartDefinition carapace4_r1 = carapace.addOrReplaceChild("carapace4_r1", CubeListBuilder.create().texOffs(58, 47).addBox(-5.5F, -9.0F, 0.9F, 11.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition legsR = carapace.addOrReplaceChild("legsR", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition cube_r1 = legsR.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 39).addBox(-5.9392F, -0.6503F, 0.2642F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.0F, -6.0F, -0.9967F, -0.8564F, -0.1633F));

		PartDefinition LegsR2 = legsR.addOrReplaceChild("LegsR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -4.0F, -5.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r2 = LegsR2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 36).addBox(-0.9396F, -0.0018F, -4.1109F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0873F, 0.0F));

		PartDefinition LegsR3 = legsR.addOrReplaceChild("LegsR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -4.0F, -6.0F, -0.3348F, 0.4149F, -0.1393F));

		PartDefinition cube_r3 = LegsR3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 33).addBox(-1.5F, -5.5F, -10.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(-2.0F, -6.0F, -10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 4.0F, 6.0F, 0.2618F, 0.0873F, 0.0F));

		PartDefinition LegsR4 = legsR.addOrReplaceChild("LegsR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -4.0F, -2.0F, 0.0718F, 0.3864F, 0.1886F));

		PartDefinition cube_r4 = LegsR4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 27).addBox(-0.9915F, -0.617F, -0.7415F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.366F, 2.2679F, 3.7679F, 0.2908F, 1.1025F, -0.0346F));

		PartDefinition cube_r5 = LegsR4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 6).addBox(-6.0F, -7.0F, -3.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 4.0F, 2.0F, 0.0F, 0.5236F, -0.5236F));

		PartDefinition legsL = carapace.addOrReplaceChild("legsL", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition legsL2 = legsL.addOrReplaceChild("legsL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -4.0F, -5.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r6 = legsL2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 22).addBox(-1.0604F, -0.0018F, -4.1109F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, -0.0873F, 0.0F));

		PartDefinition legsL3 = legsL.addOrReplaceChild("legsL3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -4.0F, -6.0F, -0.2679F, -0.2106F, 0.0573F));

		PartDefinition cube_r7 = legsL3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 11).addBox(-0.5F, -5.5F, -10.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(1.0F, -6.0F, -10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 4.0F, 6.0F, 0.2618F, -0.0873F, 0.0F));

		PartDefinition opisthosoma = carapace.addOrReplaceChild("opisthosoma", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition opisthosoma1_r1 = opisthosoma.addOrReplaceChild("opisthosoma1_r1", CubeListBuilder.create().texOffs(0, 45).addBox(-5.0F, -9.0F, -1.0F, 10.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, -2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition opisthosoma2 = opisthosoma.addOrReplaceChild("opisthosoma2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 6.0F));

		PartDefinition opisthosoma3_r1 = opisthosoma2.addOrReplaceChild("opisthosoma3_r1", CubeListBuilder.create().texOffs(26, 33).addBox(-1.0F, -8.0F, 8.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-4.0F, -8.0F, 7.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5F, -8.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition opisthosoma3 = opisthosoma2.addOrReplaceChild("opisthosoma3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 2.0F));

		PartDefinition opisthosoma3_r2 = opisthosoma3.addOrReplaceChild("opisthosoma3_r2", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -8.0F, 9.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition opisthosoma4 = opisthosoma3.addOrReplaceChild("opisthosoma4", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 2.0F));

		PartDefinition opisthosoma5_r1 = opisthosoma4.addOrReplaceChild("opisthosoma5_r1", CubeListBuilder.create().texOffs(26, 22).addBox(-1.0F, -7.0F, 11.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(29, 46).addBox(-0.5F, -7.0F, 11.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -12.0F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 75);
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