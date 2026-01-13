package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SantanmantisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart santanmantis;
	private final ModelPart legleft;
	private final ModelPart legleft3;
	private final ModelPart chest;
	private final ModelPart head;
	private final ModelPart antennaleft;
	private final ModelPart antennaright;
	private final ModelPart armleft;
	private final ModelPart armleft2;
	private final ModelPart armleft3;
	private final ModelPart armright;
	private final ModelPart armright2;
	private final ModelPart armright3;
	private final ModelPart forewingleft;
	private final ModelPart forewingright;
	private final ModelPart hindwingright;
	private final ModelPart hindwingright2;
	private final ModelPart abdomen;
	private final ModelPart matrix;

	public SantanmantisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.santanmantis = this.fossil.getChild("santanmantis");
		this.legleft = this.santanmantis.getChild("legleft");
		this.legleft3 = this.santanmantis.getChild("legleft3");
		this.chest = this.santanmantis.getChild("chest");
		this.head = this.chest.getChild("head");
		this.antennaleft = this.head.getChild("antennaleft");
		this.antennaright = this.head.getChild("antennaright");
		this.armleft = this.chest.getChild("armleft");
		this.armleft2 = this.armleft.getChild("armleft2");
		this.armleft3 = this.armleft2.getChild("armleft3");
		this.armright = this.chest.getChild("armright");
		this.armright2 = this.armright.getChild("armright2");
		this.armright3 = this.armright2.getChild("armright3");
		this.forewingleft = this.santanmantis.getChild("forewingleft");
		this.forewingright = this.santanmantis.getChild("forewingright");
		this.hindwingright = this.santanmantis.getChild("hindwingright");
		this.hindwingright2 = this.hindwingright.getChild("hindwingright2");
		this.abdomen = this.santanmantis.getChild("abdomen");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition santanmantis = fossil.addOrReplaceChild("santanmantis", CubeListBuilder.create().texOffs(33, 33).addBox(-1.0F, -1.0F, -0.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.05F, -3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition legleft = santanmantis.addOrReplaceChild("legleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1898F, 0.0F, 0.371F, 0.0F, -0.9669F, 0.0F));

		PartDefinition cube_r1 = legleft.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 23).addBox(-2.0F, 0.05F, -3.625F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legleft3 = santanmantis.addOrReplaceChild("legleft3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0441F, 0.0F, 0.4014F, 0.0F, 1.4905F, 0.0F));

		PartDefinition cube_r2 = legleft3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 36).addBox(0.0F, -0.025F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8125F, 0.05F, -2.6393F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r3 = legleft3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 28).addBox(0.0F, 0.05F, -3.625F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition chest = santanmantis.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(9, 34).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(16, 36).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -0.75F));

		PartDefinition head = chest.addOrReplaceChild("head", CubeListBuilder.create().texOffs(35, 37).addBox(-1.2F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 39).addBox(0.225F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 37).addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.475F, -1.25F));

		PartDefinition antennaleft = head.addOrReplaceChild("antennaleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5475F, 0.5F, -0.807F, -3.1416F, 1.3054F, 0.0F));

		PartDefinition antennaright = head.addOrReplaceChild("antennaright", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5672F, 0.5F, -0.8794F, -3.1416F, -1.3054F, 0.0F));

		PartDefinition armleft = chest.addOrReplaceChild("armleft", CubeListBuilder.create().texOffs(22, 31).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5058F, 0.55F, -0.631F, 0.0F, -1.1036F, 0.0F));

		PartDefinition armleft2 = armleft.addOrReplaceChild("armleft2", CubeListBuilder.create().texOffs(0, 37).addBox(-0.25F, -0.01F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -3.1416F, 0.9599F, 3.1416F));

		PartDefinition armleft3 = armleft2.addOrReplaceChild("armleft3", CubeListBuilder.create().texOffs(0, 31).addBox(-0.25F, 0.01F, -0.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, 0.0F, 0.0F, -3.1416F, -0.9163F, 3.1416F));

		PartDefinition armright = chest.addOrReplaceChild("armright", CubeListBuilder.create().texOffs(16, 34).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5058F, 0.55F, -0.631F, 0.0F, 1.1036F, 0.0F));

		PartDefinition armright2 = armright.addOrReplaceChild("armright2", CubeListBuilder.create().texOffs(7, 37).addBox(-1.75F, -0.01F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -3.1416F, -1.0472F, -3.1416F));

		PartDefinition armright3 = armright2.addOrReplaceChild("armright3", CubeListBuilder.create().texOffs(11, 31).addBox(-2.75F, 0.01F, -0.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 0.0F, 0.0F, -3.1416F, 1.1781F, -3.1416F));

		PartDefinition forewingleft = santanmantis.addOrReplaceChild("forewingleft", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -0.01F, -1.25F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4257F, -0.0375F, -0.8599F, 0.0F, -0.9591F, 0.0F));

		PartDefinition forewingright = santanmantis.addOrReplaceChild("forewingright", CubeListBuilder.create().texOffs(0, 27).addBox(-10.0F, 0.0371F, -1.25F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4003F, -0.0846F, -0.8453F, 0.0F, 0.8715F, 0.0F));

		PartDefinition hindwingright = santanmantis.addOrReplaceChild("hindwingright", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.0F, 0.0F, 1.5708F, 1.5272F, 1.5708F));

		PartDefinition hindwingright2 = hindwingright.addOrReplaceChild("hindwingright2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 1.75F, 3.1416F, 0.0F, 0.0F));

		PartDefinition abdomen = santanmantis.addOrReplaceChild("abdomen", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 1.25F, 0.0436F, 0.0F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -2.0F, -10.0F, 18.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = matrix.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 34).addBox(-2.075F, -0.675F, -0.775F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3655F, -1.6F, 5.9002F, 0.0F, 1.4879F, 0.0F));

		PartDefinition cube_r5 = matrix.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 33).addBox(-3.075F, -0.675F, -0.775F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6905F, -1.6F, 4.1252F, 0.0F, 0.3098F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 45);
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