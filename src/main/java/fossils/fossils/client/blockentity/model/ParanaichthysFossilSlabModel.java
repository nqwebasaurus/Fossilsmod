package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ParanaichthysFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Paranaichthys;
	private final ModelPart Cephalon;
	private final ModelPart PectoralL;
	private final ModelPart Jaw;
	private final ModelPart Body1;
	private final ModelPart VentralL;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart Body5;

	public ParanaichthysFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Paranaichthys = this.fossil.getChild("Paranaichthys");
		this.Cephalon = this.Paranaichthys.getChild("Cephalon");
		this.PectoralL = this.Cephalon.getChild("PectoralL");
		this.Jaw = this.Cephalon.getChild("Jaw");
		this.Body1 = this.Cephalon.getChild("Body1");
		this.VentralL = this.Body1.getChild("VentralL");
		this.Body2 = this.Body1.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.Body5 = this.Body4.getChild("Body5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(1.0F, 24.0F, -5.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(41, 41).addBox(-0.0495F, -1.0F, 0.0017F, 19.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9F, -1.0F, -10.8F, 0.0F, -1.2915F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(49, 22).addBox(-0.007F, -1.0F, 0.0025F, 10.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.8F, -1.0F, -13.4F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.181F, -1.0F, 0.0237F, 15.0F, 2.0F, 19.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-9.3F, -1.0F, 20.4F, 0.0F, 1.4835F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 22).addBox(0.0472F, -1.0F, 0.0061F, 16.0F, 2.0F, 16.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-12.3F, -1.0F, 4.7F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 41).addBox(-2.5F, -1.0F, -7.0F, 10.0F, 2.0F, 20.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.5F, -1.0F, -6.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition Paranaichthys = fossil.addOrReplaceChild("Paranaichthys", CubeListBuilder.create(), PartPose.offset(-0.2F, -2.3F, 0.0F));

		PartDefinition Cephalon = Paranaichthys.addOrReplaceChild("Cephalon", CubeListBuilder.create(), PartPose.offsetAndRotation(0.06F, 1.0F, -3.7F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Mouth_upper_r1 = Cephalon.addOrReplaceChild("Mouth_upper_r1", CubeListBuilder.create().texOffs(50, 8).addBox(0.1F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.14F, 0.6587F, -3.4302F, -2.8885F, 0.0F, 3.1416F));

		PartDefinition Foreheadtop_r1 = Cephalon.addOrReplaceChild("Foreheadtop_r1", CubeListBuilder.create().texOffs(13, 6).addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.84F, -3.9169F, -0.9237F, 1.0297F, 0.0F, -3.1416F));

		PartDefinition Forehead_r1 = Cephalon.addOrReplaceChild("Forehead_r1", CubeListBuilder.create().texOffs(56, 11).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.94F, -1.2718F, -2.9202F, -2.6005F, 0.0F, -3.1416F));

		PartDefinition Belly_start_r1 = Cephalon.addOrReplaceChild("Belly_start_r1", CubeListBuilder.create().texOffs(60, 8).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.94F, 2.5345F, -0.953F, -2.7576F, 0.0F, 3.1416F));

		PartDefinition Eye_r1 = Cephalon.addOrReplaceChild("Eye_r1", CubeListBuilder.create().texOffs(5, 22).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.04F, -0.596F, -3.426F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Gillplate_r1 = Cephalon.addOrReplaceChild("Gillplate_r1", CubeListBuilder.create().texOffs(9, 49).addBox(-0.1F, -3.0F, -1.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.04F, -0.52F, -1.11F, 0.0F, 3.1416F, 0.0F));

		PartDefinition PectoralL = Cephalon.addOrReplaceChild("PectoralL", CubeListBuilder.create(), PartPose.offset(1.117F, 2.55F, -0.3F));

		PartDefinition PectoralL_r1 = PectoralL.addOrReplaceChild("PectoralL_r1", CubeListBuilder.create().texOffs(9, 32).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.06F, 0.4702F, 0.8941F, -2.6377F, 0.0F, -3.1416F));

		PartDefinition Jaw = Cephalon.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.715F, -2.75F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Jaw_r1 = Jaw.addOrReplaceChild("Jaw_r1", CubeListBuilder.create().texOffs(13, 56).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.94F, 0.041F, -1.23F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body1 = Cephalon.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 0.1F));

		PartDefinition Bellyslope_large_r1 = Body1.addOrReplaceChild("Bellyslope_large_r1", CubeListBuilder.create().texOffs(7, 0).addBox(0.1F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.04F, 4.1725F, 2.1466F, -2.8274F, 0.0F, -3.1416F));

		PartDefinition Back_r1 = Body1.addOrReplaceChild("Back_r1", CubeListBuilder.create().texOffs(49, 22).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.94F, -4.9523F, 2.1494F, 2.81F, 0.0F, -3.1416F));

		PartDefinition Body_large_r1 = Body1.addOrReplaceChild("Body_large_r1", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, -4.5F, -2.0F, 0.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.04F, -0.47F, 2.09F, 0.0F, 3.1416F, 0.0F));

		PartDefinition VentralL = Body1.addOrReplaceChild("VentralL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.27F, 4.03F, 3.52F, 0.7854F, 0.0F, 0.0F));

		PartDefinition VentralL_r1 = VentralL.addOrReplaceChild("VentralL_r1", CubeListBuilder.create().texOffs(50, 0).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.06F, 1.92F, -0.46F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offset(0.49F, -0.87F, 4.01F));

		PartDefinition Bellyslope_horizontal_r1 = Body2.addOrReplaceChild("Bellyslope_horizontal_r1", CubeListBuilder.create().texOffs(7, 0).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, 5.5127F, 3.2314F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Backslope_start_r1 = Body2.addOrReplaceChild("Backslope_start_r1", CubeListBuilder.create().texOffs(13, 13).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -5.1303F, 3.765F, -2.1991F, 0.0F, 3.1416F));

		PartDefinition Bellyslope_short_r1 = Body2.addOrReplaceChild("Bellyslope_short_r1", CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 5.3359F, 1.3914F, -3.0194F, 0.0F, -3.1416F));

		PartDefinition Back_horizontal_r1 = Body2.addOrReplaceChild("Back_horizontal_r1", CubeListBuilder.create().texOffs(16, 3).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -5.211F, 3.0618F, -3.0718F, 0.0F, -3.1416F));

		PartDefinition Back_peak_r1 = Body2.addOrReplaceChild("Back_peak_r1", CubeListBuilder.create().texOffs(55, 5).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -4.9646F, 1.3258F, 2.9671F, 0.0F, -3.1416F));

		PartDefinition Bellytail_start_r1 = Body2.addOrReplaceChild("Bellytail_start_r1", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 5.7842F, 3.6948F, 2.2689F, 0.0F, -3.1416F));

		PartDefinition Body_tall_r1 = Body2.addOrReplaceChild("Body_tall_r1", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -5.0F, -2.0F, 0.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, 0.39F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 3.92F));

		PartDefinition Dorsalfin_r1 = Body3.addOrReplaceChild("Dorsalfin_r1", CubeListBuilder.create().texOffs(9, 41).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -4.9454F, 2.2553F, -2.138F, 0.0F, 3.1416F));

		PartDefinition Analfin_r1 = Body3.addOrReplaceChild("Analfin_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.5F, -3.0F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, 8.1784F, 3.9962F, 2.7489F, 0.0F, 3.1416F));

		PartDefinition Backslope_long_r1 = Body3.addOrReplaceChild("Backslope_long_r1", CubeListBuilder.create().texOffs(41, 41).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -2.6946F, 0.4762F, -2.2777F, 0.0F, -3.1416F));

		PartDefinition Body_end_r1 = Body3.addOrReplaceChild("Body_end_r1", CubeListBuilder.create().texOffs(9, 22).addBox(0.0F, -3.0F, -1.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, 0.82F, 1.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Bellytail_long_r1 = Body3.addOrReplaceChild("Bellytail_long_r1", CubeListBuilder.create().texOffs(48, 54).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 4.0782F, 0.9982F, 2.4871F, 0.0F, 3.1416F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.98F, 3.05F));

		PartDefinition Bellytail_end_r1 = Body4.addOrReplaceChild("Bellytail_end_r1", CubeListBuilder.create().texOffs(12, 0).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 1.7507F, 0.0901F, 2.3562F, 0.0F, 3.1416F));

		PartDefinition Backslope_end_r1 = Body4.addOrReplaceChild("Backslope_end_r1", CubeListBuilder.create().texOffs(59, 0).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -1.6401F, 0.0656F, -2.3998F, 0.0F, -3.1416F));

		PartDefinition Tail_start_r1 = Body4.addOrReplaceChild("Tail_start_r1", CubeListBuilder.create().texOffs(41, 54).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.03F, 0.9F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.49F, 2.35F));

		PartDefinition Tailfin_r1 = Body5.addOrReplaceChild("Tailfin_r1", CubeListBuilder.create().texOffs(54, 57).addBox(0.0F, -7.0F, -3.5F, 0.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, 0.84F, 4.47F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Tail_End_r1 = Body5.addOrReplaceChild("Tail_End_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -0.03F, 1.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 80);
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