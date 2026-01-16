package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AttercopusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart pedipalpL;
	private final ModelPart pedipalpL2;
	private final ModelPart legL1;
	private final ModelPart legL5;
	private final ModelPart legL2;
	private final ModelPart legL6;
	private final ModelPart legL3;
	private final ModelPart legL7;
	private final ModelPart legL4;
	private final ModelPart legL8;
	private final ModelPart legL9;
	private final ModelPart abdomen;
	private final ModelPart tailattercopus;
	private final ModelPart abdomen2;
	private final ModelPart tailattercopus2;

	public AttercopusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.pedipalpL = this.body.getChild("pedipalpL");
		this.pedipalpL2 = this.body.getChild("pedipalpL2");
		this.legL1 = this.body.getChild("legL1");
		this.legL5 = this.body.getChild("legL5");
		this.legL2 = this.body.getChild("legL2");
		this.legL6 = this.body.getChild("legL6");
		this.legL3 = this.body.getChild("legL3");
		this.legL7 = this.body.getChild("legL7");
		this.legL4 = this.body.getChild("legL4");
		this.legL8 = this.body.getChild("legL8");
		this.legL9 = this.body.getChild("legL9");
		this.abdomen = this.body.getChild("abdomen");
		this.tailattercopus = this.abdomen.getChild("tailattercopus");
		this.abdomen2 = this.body.getChild("abdomen2");
		this.tailattercopus2 = this.abdomen2.getChild("tailattercopus2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 21).addBox(-11.0F, -2.0F, -1.0F, 23.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(49, 0).addBox(5.0F, -2.0F, -4.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -18.0F, 15.0F, 2.0F, 18.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-11.0F, 0.0F, -1.0F, 0.0F, -0.7418F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 0).addBox(-1.0F, -0.6F, -0.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -1.85F, -4.0F));

		PartDefinition headattercopus_r1 = body.addOrReplaceChild("headattercopus_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.8F, -0.5F, 1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -1.35F, -1.0F, 1.8326F, 0.0F, 1.5708F));

		PartDefinition headattercopus_r2 = body.addOrReplaceChild("headattercopus_r2", CubeListBuilder.create().texOffs(3, 0).addBox(0.0F, -0.6F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.5071F, -0.5778F, -1.6144F, 0.0F, 1.5708F));

		PartDefinition pedipalpL = body.addOrReplaceChild("pedipalpL", CubeListBuilder.create().texOffs(0, 0).addBox(-1.25F, 0.0F, -5.75F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.45F, 0.75F, 0.0F, 0.2618F, 0.0F));

		PartDefinition pedipalpL2 = body.addOrReplaceChild("pedipalpL2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.75F, 0.0F, -5.75F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.45F, 0.75F, 0.0F, -0.3491F, 0.0F));

		PartDefinition legL1 = body.addOrReplaceChild("legL1", CubeListBuilder.create().texOffs(27, 34).addBox(0.05F, -0.3F, -5.7F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, 0.75F, 0.0F, 0.3054F, 0.0F));

		PartDefinition legL5 = body.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(27, 34).mirror().addBox(-8.75F, -0.1F, -5.2F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.25F, -0.25F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legL2 = body.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(0, 34).addBox(-0.25F, 0.1F, -8.0F, 9.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, -0.45F, 1.75F, 0.0F, -0.1396F, 0.0F));

		PartDefinition legL6 = body.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-8.75F, 0.1F, -8.0F, 9.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.35F, 1.75F, 0.0F, 0.4451F, 0.0F));

		PartDefinition legL3 = body.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(0, 43).addBox(-0.25F, -0.1F, -0.75F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.25F, 2.5F, 0.0F, -0.513F, 0.0F));

		PartDefinition legL7 = body.addOrReplaceChild("legL7", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-8.75F, -0.1F, -0.75F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.25F, 2.5F, 0.0F, 0.2512F, 0.0F));

		PartDefinition legL4 = body.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(29, 42).addBox(-0.2507F, -0.1F, -0.7495F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.25F, 3.5F, 0.0F, -0.8571F, 0.0085F));

		PartDefinition legL8 = body.addOrReplaceChild("legL8", CubeListBuilder.create().texOffs(29, 42).mirror().addBox(-8.7493F, -0.1F, -0.7495F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.25F, 3.5F, 0.0F, 0.6826F, -0.0085F));

		PartDefinition legL9 = body.addOrReplaceChild("legL9", CubeListBuilder.create().texOffs(29, 42).mirror().addBox(-8.7493F, -0.1F, -0.7495F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -0.25F, 12.9F, -3.1416F, -1.3807F, 3.1331F));

		PartDefinition cube_r2 = legL9.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 45).mirror().addBox(-0.1F, 0.0F, -0.7F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2493F, -0.1F, 7.4505F, 0.0F, 1.0036F, 0.0F));

		PartDefinition abdomen = body.addOrReplaceChild("abdomen", CubeListBuilder.create().texOffs(49, 6).addBox(-2.5F, 0.3F, 0.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(8, 11).addBox(-1.5F, 0.3F, 4.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, 3.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tailattercopus = abdomen.addOrReplaceChild("tailattercopus", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.8F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition abdomen2 = body.addOrReplaceChild("abdomen2", CubeListBuilder.create().texOffs(49, 6).addBox(-2.5F, 0.3F, 0.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(8, 11).addBox(-1.5F, 0.3F, 4.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, -0.75F, 13.0F, 0.0F, 3.098F, 0.0F));

		PartDefinition tailattercopus2 = abdomen2.addOrReplaceChild("tailattercopus2", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.8F, -0.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, 0.0F, 0.6545F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 50);
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