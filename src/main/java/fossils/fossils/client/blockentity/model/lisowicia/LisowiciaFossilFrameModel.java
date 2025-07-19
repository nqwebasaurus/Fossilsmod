package fossils.fossils.client.blockentity.model.lisowicia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LisowiciaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart head4;
	private final ModelPart beak1;
	private final ModelPart tusk1;
	private final ModelPart tusk2;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart beak2;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;

	public LisowiciaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.body = this.basin.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.head1 = this.neck1.getChild("head1");
		this.head2 = this.head1.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.head4 = this.head2.getChild("head4");
		this.beak1 = this.head4.getChild("beak1");
		this.tusk1 = this.head4.getChild("tusk1");
		this.tusk2 = this.head4.getChild("tusk2");
		this.jaw1 = this.head1.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.beak2 = this.jaw3.getChild("beak2");
		this.upperarm1 = this.chest.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(21, 54).addBox(0.5F, -27.0F, -22.0F, 1.0F, 27.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-0.5F, -33.0F, 16.2F, 1.0F, 33.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 103).addBox(12.5F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -13.5F, 16.7F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 92).addBox(3.5F, -7.5F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -13.5F, -21.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.0F, -3.0F, 0.0456F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(38, 31).addBox(-1.0F, -2.3F, -0.9F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.6706F, 11.1275F, -0.3665F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9706F, 11.9275F, 0.0456F, -0.0436F, -0.002F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(43, 8).addBox(-1.0F, -1.8808F, 0.6916F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, -1.534F, -11.2038F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, 0.9147F, -11.0935F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -4.2608F, -10.1935F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6739F, -20.9552F, 0.0F, 0.0436F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(38, 74).addBox(-1.0F, 0.9308F, -0.9509F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.472F, -12.1268F, 0.4712F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(43, 63).addBox(-1.0F, 0.7956F, -7.7262F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, -0.728F, -0.0268F, 0.384F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.872F, -9.5268F, -0.072F, 0.0435F, -0.0031F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(21, 27).addBox(-1.0F, 0.5F, -1.8F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, 3.6339F, -11.0489F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head1 = neck1.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4339F, -10.8489F, -0.0263F, 0.176F, 0.1116F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4954F, -5.2004F, 0.182F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.1F, 1.4F, 0.5463F, 0.0F, 0.0F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -7.4F, 0.182F, 0.0F, 0.0F));

		PartDefinition beak1 = head4.addOrReplaceChild("beak1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -4.4F, -0.4554F, 0.0F, 0.0F));

		PartDefinition tusk1 = head4.addOrReplaceChild("tusk1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, 1.5F, -4.6F, -0.2443F, 0.0524F, -0.4538F));

		PartDefinition tusk2 = head4.addOrReplaceChild("tusk2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, 1.5F, -4.6F, -0.2443F, -0.0524F, 0.4538F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.7046F, 0.1996F, -0.2314F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -3.7F, 0.9372F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0174F, -8.8955F, 0.1367F, 0.0F, 0.0F));

		PartDefinition beak2 = jaw3.addOrReplaceChild("beak2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -0.4F, -0.6829F, 0.0F, 0.0F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2F, 14.8644F, -10.9444F, 0.6724F, 0.0628F, -0.4283F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5113F, 11.5228F, 1.0997F, -1.2386F, -0.0583F, 1.2817F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2371F, 8.7727F, -2.9228F, 1.1369F, 1.0156F, 0.033F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.2F, 14.8644F, -10.9444F, -0.2439F, -0.0628F, 0.4283F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5113F, 11.5228F, 1.0997F, -1.5265F, 0.5719F, -1.4736F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2371F, 8.7727F, -2.9228F, 1.7478F, -1.0156F, -0.033F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6206F, 20.0275F, 0.8458F, 0.137F, -0.2238F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(5, 38).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, -0.1122F, 1.0008F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.0878F, 0.9508F, -0.4587F, -0.0978F, -0.1953F));

		PartDefinition tail3_r1 = tail2.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(21, 110).addBox(-0.5F, -0.1F, -2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5223F, 0.6951F, 0.5061F, 0.0F, 0.0F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 8.6665F, 20.1382F, 0.0518F, -0.1554F, -0.2256F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4801F, 13.0428F, 0.3058F, 0.6694F, -0.0905F, 0.2839F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9206F, 8.511F, 0.2324F, -0.3334F, -0.0204F, -0.0277F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 8.6665F, 20.1382F, -0.4718F, 0.1554F, 0.2256F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4801F, 13.0428F, 0.3058F, 0.6694F, 0.0905F, -0.2839F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9206F, 8.511F, 0.2324F, -0.1153F, 0.0204F, 0.0277F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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