package fossils.fossils.client.blockentity.model.acanthostega;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcanthostegaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest;
	private final ModelPart body;
	private final ModelPart basin;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tailfin3;
	private final ModelPart tailfin2;
	private final ModelPart tailfin1;
	private final ModelPart upperarm1;
	private final ModelPart arm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart arm2;
	private final ModelPart hand2;
	private final ModelPart neck1;
	private final ModelPart head1;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart eyes1;

	public AcanthostegaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest = this.root.getChild("chest");
		this.body = this.chest.getChild("body");
		this.basin = this.body.getChild("basin");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tailfin3 = this.tail3.getChild("tailfin3");
		this.tailfin2 = this.tail2.getChild("tailfin2");
		this.tailfin1 = this.tail1.getChild("tailfin1");
		this.upperarm1 = this.chest.getChild("upperarm1");
		this.arm1 = this.upperarm1.getChild("arm1");
		this.hand1 = this.arm1.getChild("hand1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.arm2 = this.upperarm2.getChild("arm2");
		this.hand2 = this.arm2.getChild("hand2");
		this.neck1 = this.chest.getChild("neck1");
		this.head1 = this.neck1.getChild("head1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.head2 = this.head1.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.eyes1 = this.head2.getChild("eyes1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(61, 52).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1F, -25.4F, -8.4F, 0.1029F, 0.0479F, 1.1369F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(65, 36).addBox(-0.5F, -7.9F, -0.5F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, -19.8F, -8.4F, 0.0F, 0.1134F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 53).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -14.2F, 9.0F, -0.6021F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(61, 41).addBox(-1.2F, -17.6F, 0.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, 0.0F, 9.0F, 0.0F, -0.6021F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(63, 59).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.2F, -8.2F, -0.4678F, 0.0033F, -0.3886F));

		PartDefinition body = chest.addOrReplaceChild("body", CubeListBuilder.create().texOffs(49, 52).addBox(-0.5F, 0.2913F, -0.2002F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.8F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition basin = body.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 12.2F, -0.0915F, -0.3042F, 0.0275F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(55, 55).addBox(-0.6F, 0.3F, -0.8F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0003F, 0.0131F, -0.0175F, 0.0F, 0.0F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 2.8F, 6.3F, 1.0629F, 0.0345F, -1.2827F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0723F, 3.856F, -0.9389F, 0.3201F, 0.3415F, 0.1731F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6284F, 0.3482F, 0.1487F, 0.0031F, -0.0003F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, 2.8F, 6.3F, -0.6824F, -0.0345F, 1.2827F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0723F, 3.856F, -0.9389F, 0.2139F, 0.0329F, -0.0523F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6284F, 0.3482F, 0.1478F, 0.0162F, -0.1292F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 7.9F, 0.0649F, -0.392F, -0.0419F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(61, 58).addBox(-0.6F, 0.3F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(57, 56).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3F, 5.8F, 0.0452F, 0.2615F, 0.0117F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(55, 55).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1F, 7.0F, 0.1412F, 0.6488F, 0.0952F));

		PartDefinition tailfin3 = tail3.addOrReplaceChild("tailfin3", CubeListBuilder.create(), PartPose.offset(0.0F, -2.9F, -0.5F));

		PartDefinition tailfin2 = tail2.addOrReplaceChild("tailfin2", CubeListBuilder.create(), PartPose.offset(0.0F, -3.7F, 0.0F));

		PartDefinition tailfin1 = tail1.addOrReplaceChild("tailfin1", CubeListBuilder.create(), PartPose.offset(0.0F, -2.8F, 3.2F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 1.6F, 0.7F, -0.7104F, 0.3076F, -1.7447F));

		PartDefinition arm1 = upperarm1.addOrReplaceChild("arm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0534F, 4.167F, 0.1378F, -0.3676F, 0.4721F, 0.2383F));

		PartDefinition hand1 = arm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3378F, -0.7481F, 0.0989F, -0.2207F, -0.0392F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 1.6F, 0.7F, 1.0481F, -0.1046F, 0.9599F));

		PartDefinition arm2 = upperarm2.addOrReplaceChild("arm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0534F, 4.167F, 0.1378F, -0.3559F, -0.6413F, -0.1841F));

		PartDefinition hand2 = arm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3378F, -0.7481F, 0.0869F, -0.036F, -0.0284F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, 0.3F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(61, 58).addBox(-0.5F, 0.6835F, -1.3167F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head1 = neck1.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2012F, -4.7433F, -0.0326F, 0.1546F, -0.0548F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7948F, 0.4842F, 0.1745F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.171F, -5.3302F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2052F, -5.0158F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, 0.0F, 0.1367F, 0.0F, 0.0F));

		PartDefinition eyes1 = head2.addOrReplaceChild("eyes1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, -1.7F, 0.7F, -0.182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 75, 65);
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