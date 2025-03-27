package fossils.fossils.client.blockentity.model.placerias;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlaceriasFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body1;
	private final ModelPart chest1;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart neck1;
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart beak1;
	private final ModelPart beak2;
	private final ModelPart beak3;
	private final ModelPart beak4;
	private final ModelPart tusk1;
	private final ModelPart fronttusk1;
	private final ModelPart tusk3;
	private final ModelPart fronttusk3;
	private final ModelPart tusk2;
	private final ModelPart fronttusk2;
	private final ModelPart jaw1;
	private final ModelPart lowerbeak1;
	private final ModelPart lowerbeak2;
	private final ModelPart basin1;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail1;
	private final ModelPart tail2;

	public PlaceriasFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body1 = this.root.getChild("body1");
		this.chest1 = this.body1.getChild("chest1");
		this.upperarm1 = this.chest1.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.chest1.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.neck1 = this.chest1.getChild("neck1");
		this.head1 = this.neck1.getChild("head1");
		this.head2 = this.head1.getChild("head2");
		this.beak1 = this.head2.getChild("beak1");
		this.beak2 = this.beak1.getChild("beak2");
		this.beak3 = this.beak2.getChild("beak3");
		this.beak4 = this.beak3.getChild("beak4");
		this.tusk1 = this.beak1.getChild("tusk1");
		this.fronttusk1 = this.tusk1.getChild("fronttusk1");
		this.tusk3 = this.beak1.getChild("tusk3");
		this.fronttusk3 = this.tusk3.getChild("fronttusk3");
		this.tusk2 = this.beak1.getChild("tusk2");
		this.fronttusk2 = this.tusk2.getChild("fronttusk2");
		this.jaw1 = this.head2.getChild("jaw1");
		this.lowerbeak1 = this.jaw1.getChild("lowerbeak1");
		this.lowerbeak2 = this.lowerbeak1.getChild("lowerbeak2");
		this.basin1 = this.body1.getChild("basin1");
		this.upperleg1 = this.basin1.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.basin1.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail1 = this.basin1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -25.0F, -18.0F, 1.0F, 25.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 41).addBox(-0.5F, -26.0F, 9.5F, 1.0F, 26.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 6.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 77).addBox(8.5F, -7.5F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(67, 88).addBox(4.5F, -5.5F, -28.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -12.5F, 10.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition body1 = root.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.9F, -1.7F, -0.0456F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9F, 0.8069F, -0.0895F, 2.0F, 2.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6769F, -4.8245F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest1 = body1.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1512F, -4.7511F, 0.2182F, 0.0F, 0.0F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(5, 58).addBox(-0.9F, 1.1316F, -5.7115F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.9039F, -0.0922F, -0.0698F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(26, 29).addBox(-0.9F, 0.8462F, -9.0051F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0039F, -5.7922F, 0.2007F, 0.0F, 0.0F));

		PartDefinition upperarm1 = chest1.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 9.9124F, -14.521F, 0.7531F, 0.0F, -0.6374F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1698F, 8.7583F, 0.8645F, -0.747F, 0.1776F, 0.6672F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5421F, 8.0269F, -1.4569F, 1.2216F, -0.0234F, 0.0077F));

		PartDefinition upperarm2 = chest1.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 9.9124F, -14.521F, -0.3377F, 0.0F, 0.6374F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1698F, 8.7583F, 0.8645F, -0.451F, -0.1179F, -0.6028F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5421F, 8.0269F, -1.4569F, 0.873F, -0.0383F, -0.0694F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3101F, -14.483F, -0.0873F, -0.3054F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.4787F, -1.4445F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 0.5006F, -8.8397F, 0.0785F, 0.0F, 0.0F));

		PartDefinition head1 = neck1.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4948F, -8.3845F, 0.0457F, -0.3051F, -0.0138F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3197F, -2.4504F, 0.0822F, 0.0F, 0.0F));

		PartDefinition beak1 = head2.addOrReplaceChild("beak1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -6.0F, -0.0897F, 0.0F, 0.0F));

		PartDefinition beak2 = beak1.addOrReplaceChild("beak2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.1F, 2.7F, 0.3142F, 0.0F, 0.0F));

		PartDefinition beak3 = beak2.addOrReplaceChild("beak3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -4.5F, 0.7629F, 0.0F, 0.0F));

		PartDefinition beak4 = beak3.addOrReplaceChild("beak4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -4.4F, -0.8196F, 0.0F, 0.0F));

		PartDefinition tusk1 = beak1.addOrReplaceChild("tusk1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.0F, 0.9F, -1.0846F, 0.0458F, 2.907F));

		PartDefinition fronttusk1 = tusk1.addOrReplaceChild("fronttusk1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0085F, 0.6345F, -3.1366F, 0.4508F, 0.1848F, -0.1952F));

		PartDefinition tusk3 = beak1.addOrReplaceChild("tusk3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 1.0F, 0.9F, -1.0846F, -0.0458F, -2.907F));

		PartDefinition fronttusk3 = tusk3.addOrReplaceChild("fronttusk3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0085F, 0.6345F, -3.1366F, 0.4508F, -0.1848F, 0.1952F));

		PartDefinition tusk2 = beak1.addOrReplaceChild("tusk2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -0.7F, 0.9F, -1.0221F, 0.0822F, -2.5756F));

		PartDefinition fronttusk2 = tusk2.addOrReplaceChild("fronttusk2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -0.4F, -5.1F, 0.3336F, -0.253F, -0.0157F));

		PartDefinition jaw1 = head2.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4F, -1.3F, 0.2182F, 0.0F, 0.0F));

		PartDefinition lowerbeak1 = jaw1.addOrReplaceChild("lowerbeak1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1531F, -5.2725F, 0.0848F, 0.0F, 0.0F));

		PartDefinition lowerbeak2 = lowerbeak1.addOrReplaceChild("lowerbeak2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -2.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition basin1 = body1.addOrReplaceChild("basin1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8027F, 9.7707F, -0.0911F, 0.0F, 0.0F));

		PartDefinition basin2_r1 = basin1.addOrReplaceChild("basin2_r1", CubeListBuilder.create().texOffs(41, 35).addBox(-0.9F, 0.8274F, 0.0373F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.8259F, 0.0176F, -0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg1 = basin1.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 4.8638F, 3.3675F, -0.131F, -0.0699F, -0.2643F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2839F, 11.1184F, -0.9447F, 0.4068F, -0.083F, 0.3154F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0885F, 8.9576F, 0.4756F, -0.1153F, -0.0204F, -0.0277F));

		PartDefinition upperleg2 = basin1.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 4.8638F, 3.3675F, 0.1308F, 0.0699F, 0.2643F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2839F, 11.1184F, -0.9447F, 1.0177F, 0.083F, -0.3154F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0885F, 8.9576F, 0.4756F, 0.6701F, 0.0204F, 0.0277F));

		PartDefinition tail1 = basin1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5F, 0.2306F, -0.4012F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.5174F, 7.4848F, -0.5654F, 0.1478F, -0.0932F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(22, 87).addBox(-0.5F, 0.2375F, 0.9228F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2369F, 5.3875F, -0.2589F, 0.2111F, -0.0555F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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