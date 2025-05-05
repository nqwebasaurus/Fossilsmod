package fossils.fossils.client.blockentity.model.bothriolepis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BothriolepisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart Shelltop2;
	private final ModelPart Shelltop3;
	private final ModelPart Shelltop1;
	private final ModelPart Head;
	private final ModelPart Gills;
	private final ModelPart Headfront;
	private final ModelPart Lowerjaw;
	private final ModelPart Leftpectoralfin1;
	private final ModelPart Leftpectoralfin2;
	private final ModelPart Rightpectoralfin1;
	private final ModelPart Rightpectoralfin2;

	public BothriolepisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.Shelltop2 = this.Body.getChild("Shelltop2");
		this.Shelltop3 = this.Shelltop2.getChild("Shelltop3");
		this.Shelltop1 = this.Body.getChild("Shelltop1");
		this.Head = this.Body.getChild("Head");
		this.Gills = this.Head.getChild("Gills");
		this.Headfront = this.Head.getChild("Headfront");
		this.Lowerjaw = this.Headfront.getChild("Lowerjaw");
		this.Leftpectoralfin1 = this.Body.getChild("Leftpectoralfin1");
		this.Leftpectoralfin2 = this.Leftpectoralfin1.getChild("Leftpectoralfin2");
		this.Rightpectoralfin1 = this.Body.getChild("Rightpectoralfin1");
		this.Rightpectoralfin2 = this.Rightpectoralfin1.getChild("Rightpectoralfin2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(39, 36).addBox(-5.5F, -5.0F, -8.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-5.5F, -3.0F, -8.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-4.5F, -5.0F, -8.0F, 9.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(32, 16).addBox(-4.5F, -4.0F, -8.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-4.5F, 1.0F, -8.0F, 9.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(42, 28).addBox(-2.5F, 1.0F, 5.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(4.5F, -3.0F, -8.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(39, 36).addBox(4.5F, -5.0F, -8.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition Shelltop2 = Body.addOrReplaceChild("Shelltop2", CubeListBuilder.create().texOffs(0, 31).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9F, -4.2F, -0.0934F, 0.0F, 0.0F));

		PartDefinition Shelltop3 = Shelltop2.addOrReplaceChild("Shelltop3", CubeListBuilder.create().texOffs(63, 52).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -1.0F, 0.0F, 0.3396F, 0.0F, 0.0F));

		PartDefinition Shelltop1 = Body.addOrReplaceChild("Shelltop1", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 27).addBox(-2.0F, 0.0F, -9.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3F, 6.8F, 0.0951F, 0.0F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(27, 52).addBox(-4.5F, 0.0F, -4.0F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(60, 16).addBox(-4.5F, 4.0F, 6.7F, 9.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-1.5F, -0.1F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 5).addBox(0.5F, -0.1F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 7).addBox(-0.5F, -0.1F, -2.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6F, -8.2F, 0.4033F, 0.0F, 0.0F));

		PartDefinition Gills = Head.addOrReplaceChild("Gills", CubeListBuilder.create().texOffs(55, 38).addBox(-4.5F, -3.0F, 0.0F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 4.8F, -5.2F, -0.4245F, 0.0F, 0.0F));

		PartDefinition Headfront = Head.addOrReplaceChild("Headfront", CubeListBuilder.create().texOffs(21, 63).addBox(-3.5F, 0.0F, -4.0F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.743F, 0.0F, 0.0F));

		PartDefinition Lowerjaw = Headfront.addOrReplaceChild("Lowerjaw", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5F, -3.5F, 0.3821F, 0.0F, 0.0F));

		PartDefinition Leftpectoralfin1 = Body.addOrReplaceChild("Leftpectoralfin1", CubeListBuilder.create().texOffs(47, 54).addBox(-2.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2F, 0.5F, -6.6F, -0.1196F, -0.3451F, 0.0098F));

		PartDefinition Leftpectoralfin2 = Leftpectoralfin1.addOrReplaceChild("Leftpectoralfin2", CubeListBuilder.create().texOffs(63, 0).addBox(-0.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 0.0F, 8.0F, 0.1274F, 0.2546F, 0.0637F));

		PartDefinition Rightpectoralfin1 = Body.addOrReplaceChild("Rightpectoralfin1", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 0.5F, -6.6F, -0.1035F, 0.4015F, 0.046F));

		PartDefinition Rightpectoralfin2 = Rightpectoralfin1.addOrReplaceChild("Rightpectoralfin2", CubeListBuilder.create().texOffs(0, 61).addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.0F, 8.0F, 0.1274F, -0.2546F, -0.0637F));

		return LayerDefinition.create(meshdefinition, 90, 76);
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