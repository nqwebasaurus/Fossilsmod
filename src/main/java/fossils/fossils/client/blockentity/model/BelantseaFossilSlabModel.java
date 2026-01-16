package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BelantseaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Bodyfront;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyend;
	private final ModelPart Tailbase;
	private final ModelPart Tailend;
	private final ModelPart Tailfin;
	private final ModelPart Seconddorsalfinend;
	private final ModelPart Tailunderside;
	private final ModelPart Analfin;
	private final ModelPart Seconddorsalfinstart;
	private final ModelPart Bellyend;
	private final ModelPart Firstdorsalfin;
	private final ModelPart Rightpelvicfin;
	private final ModelPart Head;
	private final ModelPart Throat;
	private final ModelPart Headslope;
	private final ModelPart Face;
	private final ModelPart Upperlips;
	private final ModelPart Upperteeth;
	private final ModelPart Lowerjaw;
	private final ModelPart Lowerteeth;
	private final ModelPart Dorsalfinflesh;

	public BelantseaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Bodyfront = this.root.getChild("Bodyfront");
		this.Bodymiddle = this.Bodyfront.getChild("Bodymiddle");
		this.Bodyend = this.Bodymiddle.getChild("Bodyend");
		this.Tailbase = this.Bodyend.getChild("Tailbase");
		this.Tailend = this.Tailbase.getChild("Tailend");
		this.Tailfin = this.Tailend.getChild("Tailfin");
		this.Seconddorsalfinend = this.Tailbase.getChild("Seconddorsalfinend");
		this.Tailunderside = this.Tailbase.getChild("Tailunderside");
		this.Analfin = this.Tailunderside.getChild("Analfin");
		this.Seconddorsalfinstart = this.Bodyend.getChild("Seconddorsalfinstart");
		this.Bellyend = this.Bodyend.getChild("Bellyend");
		this.Firstdorsalfin = this.Bodyfront.getChild("Firstdorsalfin");
		this.Rightpelvicfin = this.Bodyfront.getChild("Rightpelvicfin");
		this.Head = this.Bodyfront.getChild("Head");
		this.Throat = this.Head.getChild("Throat");
		this.Headslope = this.Head.getChild("Headslope");
		this.Face = this.Head.getChild("Face");
		this.Upperlips = this.Face.getChild("Upperlips");
		this.Upperteeth = this.Upperlips.getChild("Upperteeth");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Lowerteeth = this.Lowerjaw.getChild("Lowerteeth");
		this.Dorsalfinflesh = this.Bodyfront.getChild("Dorsalfinflesh");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(5.8321F, -0.5F, -16.0568F, 22.0F, 1.0F, 37.0F, new CubeDeformation(0.0F))
				.texOffs(0, 39).addBox(27.8321F, -0.5F, -16.0568F, 5.0F, 1.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.9945F, -0.5F, -4.1872F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 39).addBox(-6.938F, -0.5F, -0.6767F, 7.0F, 1.0F, 13.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(12.132F, -0.5F, 9.753F, 0.0F, -0.5585F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -24.0F, -3.0F));

		PartDefinition Bodyfront = root.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(0, 39).addBox(-0.07F, -3.0F, -7.0F, 0.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 22.9F, 0.0F, -0.1745F, 0.0F, -1.5708F));

		PartDefinition Bodymiddle = Bodyfront.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(13, 67).addBox(-0.08F, -2.0F, 0.0F, 0.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Bodyend = Bodymiddle.addOrReplaceChild("Bodyend", CubeListBuilder.create().texOffs(22, 67).addBox(-0.06F, -1.5F, 0.0F, 0.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, 0.0213F, 0.0F, 0.0F));

		PartDefinition Tailbase = Bodyend.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 0).addBox(-0.06F, -1.5F, 0.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.01F, 0.5F, 3.0F));

		PartDefinition Tailend = Tailbase.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(14, 0).addBox(-0.07F, -1.0F, 0.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 4.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailfin = Tailend.addOrReplaceChild("Tailfin", CubeListBuilder.create().texOffs(0, 67).addBox(-0.09F, -3.5F, 0.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.01F, 0.5F, 1.5F));

		PartDefinition Seconddorsalfinend = Tailbase.addOrReplaceChild("Seconddorsalfinend", CubeListBuilder.create().texOffs(13, 21).addBox(-0.07F, -7.0F, 1.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.01F, -1.0F, 0.0F));

		PartDefinition Tailunderside = Tailbase.addOrReplaceChild("Tailunderside", CubeListBuilder.create().texOffs(24, 0).addBox(-0.08F, -3.0F, 0.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5F, 1.0F, 0.658F, 0.0F, 0.0F));

		PartDefinition Analfin = Tailunderside.addOrReplaceChild("Analfin", CubeListBuilder.create().texOffs(20, 14).addBox(-0.08F, 0.0F, -3.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition Seconddorsalfinstart = Bodyend.addOrReplaceChild("Seconddorsalfinstart", CubeListBuilder.create().texOffs(30, 9).addBox(-0.09F, -6.0F, 0.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 1.0F));

		PartDefinition Bellyend = Bodyend.addOrReplaceChild("Bellyend", CubeListBuilder.create().texOffs(37, 39).addBox(-0.09F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4F, 0.0F, 0.2335F, 0.0F, 0.0F));

		PartDefinition Firstdorsalfin = Bodyfront.addOrReplaceChild("Firstdorsalfin", CubeListBuilder.create().texOffs(0, 0).addBox(-0.09F, -6.5F, -6.5F, 0.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.3F, -1.5F));

		PartDefinition Rightpelvicfin = Bodyfront.addOrReplaceChild("Rightpelvicfin", CubeListBuilder.create().texOffs(51, 55).addBox(0.0F, 1.95F, -6.0F, 7.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 8.0F, -2.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Head = Bodyfront.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 21).addBox(-0.06F, -2.0F, -6.0F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.05F, 0.2F, -4.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.1F, -0.0035F, 0.0F, 0.0F));

		PartDefinition Throat = Head.addOrReplaceChild("Throat", CubeListBuilder.create().texOffs(17, 43).addBox(-0.08F, -2.0F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -6.0F, -0.5732F, 0.0F, 0.0F));

		PartDefinition Headslope = Head.addOrReplaceChild("Headslope", CubeListBuilder.create().texOffs(11, 39).addBox(-0.08F, 0.0F, -4.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, -2.2F, 0.3396F, 0.0F, 0.0F));

		PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(26, 27).addBox(-0.09F, 0.0F, 0.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, -0.5308F, 0.0F, 0.0F));

		PartDefinition Upperlips = Face.addOrReplaceChild("Upperlips", CubeListBuilder.create().texOffs(7, 21).addBox(-0.07F, 0.0F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7F, -0.2F, 0.2335F, 0.0F, 0.0F));

		PartDefinition Upperteeth = Upperlips.addOrReplaceChild("Upperteeth", CubeListBuilder.create().texOffs(30, 0).addBox(-0.09F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.2F, 0.1911F, 0.0F, 0.0F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create().texOffs(0, 39).addBox(-0.09F, 0.0F, -4.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1F, -4.95F, 0.3136F, 0.0F, 0.0F));

		PartDefinition Lowerteeth = Lowerjaw.addOrReplaceChild("Lowerteeth", CubeListBuilder.create().texOffs(6, 0).addBox(-0.088F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.0F, -3.8F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Dorsalfinflesh = Bodyfront.addOrReplaceChild("Dorsalfinflesh", CubeListBuilder.create().texOffs(14, 0).addBox(-0.08F, -2.0F, -1.0F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.2F, 0.1274F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 120, 85);
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