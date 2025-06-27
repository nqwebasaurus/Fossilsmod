package fossils.fossils.client.blockentity.model.cartorhynchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CartorhynchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body1;
	private final ModelPart chest1;
	private final ModelPart neck1;
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart rostrum1;
	private final ModelPart rostrum2;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart lowerrostrum1;
	private final ModelPart jaw3;
	private final ModelPart gums;
	private final ModelPart FrontFlipperL;
	private final ModelPart flipper2;
	private final ModelPart flipper6;
	private final ModelPart flipper7;
	private final ModelPart FrontFlipperL2;
	private final ModelPart flipper3;
	private final ModelPart flipper4;
	private final ModelPart flipper5;
	private final ModelPart backflipperL;
	private final ModelPart backflipper2;
	private final ModelPart backflipperL2;
	private final ModelPart backflipper3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public CartorhynchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body1 = this.root.getChild("body1");
		this.chest1 = this.body1.getChild("chest1");
		this.neck1 = this.chest1.getChild("neck1");
		this.head1 = this.neck1.getChild("head1");
		this.head2 = this.head1.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.rostrum1 = this.head3.getChild("rostrum1");
		this.rostrum2 = this.rostrum1.getChild("rostrum2");
		this.jaw1 = this.head1.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.lowerrostrum1 = this.jaw2.getChild("lowerrostrum1");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.gums = this.jaw1.getChild("gums");
		this.FrontFlipperL = this.chest1.getChild("FrontFlipperL");
		this.flipper2 = this.FrontFlipperL.getChild("flipper2");
		this.flipper6 = this.flipper2.getChild("flipper6");
		this.flipper7 = this.FrontFlipperL.getChild("flipper7");
		this.FrontFlipperL2 = this.chest1.getChild("FrontFlipperL2");
		this.flipper3 = this.FrontFlipperL2.getChild("flipper3");
		this.flipper4 = this.flipper3.getChild("flipper4");
		this.flipper5 = this.FrontFlipperL2.getChild("flipper5");
		this.backflipperL = this.root.getChild("backflipperL");
		this.backflipper2 = this.backflipperL.getChild("backflipper2");
		this.backflipperL2 = this.root.getChild("backflipperL2");
		this.backflipper3 = this.backflipperL2.getChild("backflipper3");
		this.tail1 = this.root.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(66, 62).addBox(-0.5F, -8.4F, 10.7F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 68).addBox(-1.0F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.4F, 11.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 68).addBox(-1.0F, -4.6F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.8F, -4.6F, -18.6F, 0.1745F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 42).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-2.8F, -4.6F, -18.6F, 0.0F, 0.1745F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.5F, -6.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition basin2_r1 = root.addOrReplaceChild("basin2_r1", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, 0.0062F, -0.1782F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.1F, 8.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body1 = root.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4F, 8.9F, 0.0524F, 0.1309F, 0.0F));

		PartDefinition body1_r1 = body1.addOrReplaceChild("body1_r1", CubeListBuilder.create().texOffs(44, 21).addBox(-0.5F, 0.4007F, -0.0262F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6F, -15.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest1 = body1.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(58, 9).addBox(-0.5F, -3.2998F, -7.9869F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.1F, -15.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -8.2F, -0.2201F, 0.0F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(22, 29).addBox(-0.5F, -1.1988F, -3.3661F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.5F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head1 = neck1.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -6.4F, -0.2162F, 0.3491F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5681F, -4.3007F, 0.6199F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8F, -2.0F, -0.8196F, 0.0F, 0.0F));

		PartDefinition rostrum1 = head3.addOrReplaceChild("rostrum1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -4.1F, 0.3187F, 0.0F, 0.0F));

		PartDefinition rostrum2 = rostrum1.addOrReplaceChild("rostrum2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, 0.8F, 0.2731F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2315F, -0.0493F, 0.5498F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4337F, -4.9997F, -0.182F, 0.0F, 0.0F));

		PartDefinition lowerrostrum1 = jaw2.addOrReplaceChild("lowerrostrum1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -3.7F, 0.3204F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.9F, 0.0F));

		PartDefinition gums = jaw1.addOrReplaceChild("gums", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6337F, -0.9997F, -0.4554F, 0.0F, 0.0F));

		PartDefinition FrontFlipperL = chest1.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1737F, 2.0897F, -6.6F, 0.137F, -0.1085F, -0.9047F));

		PartDefinition flipper2 = FrontFlipperL.addOrReplaceChild("flipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.27F, 5.1976F, -0.0866F, -0.5083F, 0.1452F, -0.3623F));

		PartDefinition flipper6 = flipper2.addOrReplaceChild("flipper6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 2.7F, 0.05F, 0.0F, 0.0F, -0.2618F));

		PartDefinition flipper7 = FrontFlipperL.addOrReplaceChild("flipper7", CubeListBuilder.create(), PartPose.offset(-7.158F, 1.6104F, 1.6F));

		PartDefinition FrontFlipperL2 = chest1.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1737F, 2.0897F, -6.6F, -0.4239F, -0.3172F, 0.9661F));

		PartDefinition flipper3 = FrontFlipperL2.addOrReplaceChild("flipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.27F, 5.1976F, -0.0866F, -0.3337F, -0.1584F, 0.3848F));

		PartDefinition flipper4 = flipper3.addOrReplaceChild("flipper4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 2.7F, 0.05F, 0.0F, 0.0F, 0.2618F));

		PartDefinition flipper5 = FrontFlipperL2.addOrReplaceChild("flipper5", CubeListBuilder.create(), PartPose.offset(7.158F, 1.6104F, 1.6F));

		PartDefinition backflipperL = root.addOrReplaceChild("backflipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7581F, 2.2665F, 17.2087F, 0.8753F, -0.0745F, -1.079F));

		PartDefinition backflipper2 = backflipperL.addOrReplaceChild("backflipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0425F, 4.0683F, 0.5623F, 0.2207F, -0.1301F, -0.1171F));

		PartDefinition backflipperL2 = root.addOrReplaceChild("backflipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7581F, 2.2665F, 17.2087F, 0.94F, 0.1295F, 1.1323F));

		PartDefinition backflipper3 = backflipperL2.addOrReplaceChild("backflipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0425F, 4.0683F, 0.5623F, 0.3545F, 0.1045F, 0.0831F));

		PartDefinition tail1 = root.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.3159F, -0.4252F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.4F, 19.7F, -0.1833F, -0.0873F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.1069F, -0.1825F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2F, 15.0F, 0.1309F, -0.3491F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(39, 3).addBox(-0.5F, -0.9963F, 0.1391F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.1F, 18.3F, 0.0436F, -0.5236F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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