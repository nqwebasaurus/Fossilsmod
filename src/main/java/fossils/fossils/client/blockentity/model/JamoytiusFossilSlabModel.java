package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JamoytiusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Bodyfront;
	private final ModelPart Eyeportion;
	private final ModelPart Nose;
	private final ModelPart Mouthtop;
	private final ModelPart Mouthfiller;
	private final ModelPart Mouthunderside;
	private final ModelPart Bodymiddlefront;
	private final ModelPart Bodymiddleback;
	private final ModelPart Bodyback;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailend;
	private final ModelPart Tailfinend;
	private final ModelPart Tailfinbase;
	private final ModelPart Dorsalridgetbase;
	private final ModelPart Leftanalfin;
	private final ModelPart Rightanalfin;
	private final ModelPart Dorsalridgeback;
	private final ModelPart Dorsalridgemback;
	private final ModelPart Dorsalridgemfront;
	private final ModelPart Dorsalridgefront;

	public JamoytiusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Bodyfront = this.root.getChild("Bodyfront");
		this.Eyeportion = this.Bodyfront.getChild("Eyeportion");
		this.Nose = this.Eyeportion.getChild("Nose");
		this.Mouthtop = this.Nose.getChild("Mouthtop");
		this.Mouthfiller = this.Eyeportion.getChild("Mouthfiller");
		this.Mouthunderside = this.Bodyfront.getChild("Mouthunderside");
		this.Bodymiddlefront = this.Bodyfront.getChild("Bodymiddlefront");
		this.Bodymiddleback = this.Bodymiddlefront.getChild("Bodymiddleback");
		this.Bodyback = this.Bodymiddleback.getChild("Bodyback");
		this.Tailbase = this.Bodyback.getChild("Tailbase");
		this.Tailmiddle = this.Tailbase.getChild("Tailmiddle");
		this.Tailend = this.Tailmiddle.getChild("Tailend");
		this.Tailfinend = this.Tailend.getChild("Tailfinend");
		this.Tailfinbase = this.Tailmiddle.getChild("Tailfinbase");
		this.Dorsalridgetbase = this.Tailbase.getChild("Dorsalridgetbase");
		this.Leftanalfin = this.Tailbase.getChild("Leftanalfin");
		this.Rightanalfin = this.Tailbase.getChild("Rightanalfin");
		this.Dorsalridgeback = this.Bodyback.getChild("Dorsalridgeback");
		this.Dorsalridgemback = this.Bodymiddleback.getChild("Dorsalridgemback");
		this.Dorsalridgemfront = this.Bodymiddlefront.getChild("Dorsalridgemfront");
		this.Dorsalridgefront = this.Bodyfront.getChild("Dorsalridgefront");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -2.0F, -26.0F, 26.0F, 2.0F, 53.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -6.0F, -6.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Bodyfront = root.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(16, 15).addBox(-2.0F, -2.0F, -7.0F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -7.3F, -2.0F, -0.3255F, 0.0F, 0.0F));

		PartDefinition Eyeportion = Bodyfront.addOrReplaceChild("Eyeportion", CubeListBuilder.create().texOffs(11, 33).addBox(-2.1F, 0.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -2.0F, -6.7F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Nose = Eyeportion.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(8, 2).addBox(-2.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.3821F, 0.0F, 0.0F));

		PartDefinition Mouthtop = Nose.addOrReplaceChild("Mouthtop", CubeListBuilder.create().texOffs(0, 0).addBox(-2.2F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.62F, -1.8F, 0.6793F, 0.0F, 0.0F));

		PartDefinition Mouthfiller = Eyeportion.addOrReplaceChild("Mouthfiller", CubeListBuilder.create().texOffs(6, 0).addBox(-2.2F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 2.0F, -3.0F, -0.0424F, 0.0F, 0.0F));

		PartDefinition Mouthunderside = Bodyfront.addOrReplaceChild("Mouthunderside", CubeListBuilder.create().texOffs(24, 16).addBox(-2.1F, -2.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, -0.2759F, 0.0F, 0.0F));

		PartDefinition Bodymiddlefront = Bodyfront.addOrReplaceChild("Bodymiddlefront", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, 0.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.51F, 0.1F, -0.7F, 0.2594F, 0.0F, 0.0F));

		PartDefinition Bodymiddleback = Bodymiddlefront.addOrReplaceChild("Bodymiddleback", CubeListBuilder.create().texOffs(24, 6).addBox(-1.5F, -2.0F, 0.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.0F, 4.3F, 0.2606F, 0.0F, 0.0F));

		PartDefinition Bodyback = Bodymiddleback.addOrReplaceChild("Bodyback", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -2.5F, 0.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 4.4F, -0.1545F, 0.0F, 0.0F));

		PartDefinition Tailbase = Bodyback.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(15, 27).addBox(-1.0F, -1.5F, 0.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.1F, 5.4F, -0.2169F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailbase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(19, 0).addBox(-1.1F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 4.4F, -0.625F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddle.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(25, 21).addBox(-1.1F, -0.5F, 0.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.1F, 2.5F, -0.4056F, 0.0F, 0.0F));

		PartDefinition Tailfinend = Tailend.addOrReplaceChild("Tailfinend", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, -6.0F, 0.0F, 0.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.2F, 0.3183F, 0.0F, 0.0F));

		PartDefinition Tailfinbase = Tailmiddle.addOrReplaceChild("Tailfinbase", CubeListBuilder.create().texOffs(32, 18).addBox(-1.3F, -4.0F, 0.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition Dorsalridgetbase = Tailbase.addOrReplaceChild("Dorsalridgetbase", CubeListBuilder.create().texOffs(30, 11).addBox(-1.2F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.52F, -0.1F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Leftanalfin = Tailbase.addOrReplaceChild("Leftanalfin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 1.5F, 0.5F, 0.0F, 0.0F, 0.3609F));

		PartDefinition Rightanalfin = Tailbase.addOrReplaceChild("Rightanalfin", CubeListBuilder.create().texOffs(26, 29).addBox(-1.3F, 0.0F, 0.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, 1.5F, 0.5F));

		PartDefinition Dorsalridgeback = Bodyback.addOrReplaceChild("Dorsalridgeback", CubeListBuilder.create().texOffs(7, 24).addBox(-1.2F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.32F, -0.1F, -0.1274F, 0.0F, 0.0F));

		PartDefinition Dorsalridgemback = Bodymiddleback.addOrReplaceChild("Dorsalridgemback", CubeListBuilder.create().texOffs(30, 0).addBox(-1.7F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 0.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Dorsalridgemfront = Bodymiddlefront.addOrReplaceChild("Dorsalridgemfront", CubeListBuilder.create().texOffs(0, 30).addBox(-1.7F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Dorsalridgefront = Bodyfront.addOrReplaceChild("Dorsalridgefront", CubeListBuilder.create().texOffs(0, 22).addBox(-2.2F, -1.0F, -6.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1698F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 70);
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