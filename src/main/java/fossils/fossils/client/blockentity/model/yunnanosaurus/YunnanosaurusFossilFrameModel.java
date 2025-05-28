package fossils.fossils.client.blockentity.model.yunnanosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YunnanosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart upperlegL;
	private final ModelPart lowerlegL;
	private final ModelPart feetL;
	private final ModelPart toesL;
	private final ModelPart toesL2;
	private final ModelPart upperlegL2;
	private final ModelPart lowerlegL2;
	private final ModelPart feetL2;
	private final ModelPart toesL3;
	private final ModelPart toesL4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart jaw2;
	private final ModelPart upperarmL;
	private final ModelPart lowerarmL;
	private final ModelPart handL;
	private final ModelPart thumbclawL;
	private final ModelPart upperarmL2;
	private final ModelPart lowerarmL2;
	private final ModelPart handL2;
	private final ModelPart thumbclawL2;

	public YunnanosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.upperlegL = this.basin.getChild("upperlegL");
		this.lowerlegL = this.upperlegL.getChild("lowerlegL");
		this.feetL = this.lowerlegL.getChild("feetL");
		this.toesL = this.feetL.getChild("toesL");
		this.toesL2 = this.toesL.getChild("toesL2");
		this.upperlegL2 = this.basin.getChild("upperlegL2");
		this.lowerlegL2 = this.upperlegL2.getChild("lowerlegL2");
		this.feetL2 = this.lowerlegL2.getChild("feetL2");
		this.toesL3 = this.feetL2.getChild("toesL3");
		this.toesL4 = this.toesL3.getChild("toesL4");
		this.body = this.basin.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head2 = this.neck4.getChild("head2");
		this.bone3 = this.head2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.jaw2 = this.head2.getChild("jaw2");
		this.upperarmL = this.chest.getChild("upperarmL");
		this.lowerarmL = this.upperarmL.getChild("lowerarmL");
		this.handL = this.lowerarmL.getChild("handL");
		this.thumbclawL = this.handL.getChild("thumbclawL");
		this.upperarmL2 = this.chest.getChild("upperarmL2");
		this.lowerarmL2 = this.upperarmL2.getChild("lowerarmL2");
		this.handL2 = this.lowerarmL2.getChild("handL2");
		this.thumbclawL2 = this.handL2.getChild("thumbclawL2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -32.0F, -3.3F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.8F, -9.0F, -0.5F, 1.0F, 43.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-3.9F, -34.0F, -39.1F, 0.0F, 0.3403F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.5F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.9F, -34.0F, -39.1F, 0.3403F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(2.5F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -34.0F, -2.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.1672F, 0.8983F, -0.3074F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(31, 51).addBox(-0.5F, 0.5F, -2.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.5F, -6.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0257F, 5.5875F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6325F, -0.1287F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6983F, 14.7641F, -0.0189F, -0.1755F, -0.0397F));

		PartDefinition tail4_r1 = tail2.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(13, 64).addBox(-0.5F, 0.7845F, 13.3652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 51).addBox(-0.5F, 0.7845F, -0.3348F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1115F, -0.0829F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3051F, 13.6327F, 0.312F, 0.4114F, -0.007F));

		PartDefinition tail5_r1 = tail3.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(73, 61).addBox(-0.5F, 0.8F, 11.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 51).addBox(-0.5F, 0.8F, -0.3F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3765F, 0.122F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 15).addBox(-0.5F, 0.2185F, 0.0755F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.8235F, 11.622F, -0.1263F, 0.1984F, -0.1595F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(66, 32).addBox(-0.5F, 0.4033F, -0.581F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F))
				.texOffs(76, 42).addBox(-0.5F, 0.4033F, 11.119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2418F, 15.2765F, -0.1995F, 0.3661F, -0.2175F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.4033F, -0.181F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.041F, 11.9419F, -0.128F, -0.3031F, 0.0384F));

		PartDefinition upperlegL = basin.addOrReplaceChild("upperlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2F, 0.2722F, -3.0798F, 0.0F, 0.0F, 0.0F));

		PartDefinition lowerlegL = upperlegL.addOrReplaceChild("lowerlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 14.3666F, 2.6101F, 1.0414F, 0.0F, 0.0F));

		PartDefinition feetL = lowerlegL.addOrReplaceChild("feetL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 13.2801F, 1.685F, -0.7664F, 0.0F, 0.0F));

		PartDefinition toesL = feetL.addOrReplaceChild("toesL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.7997F, 0.6996F, 0.5854F, 0.0F, 0.0F));

		PartDefinition toesL2 = toesL.addOrReplaceChild("toesL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.4356F, 0.0F, 0.0F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2F, 0.2722F, -3.0798F, -0.2182F, 0.0F, 0.0F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 14.3666F, 2.6101F, 0.9542F, 0.0F, 0.0F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 13.2801F, 1.685F, -0.7664F, 0.0F, 0.0F));

		PartDefinition toesL3 = feetL2.addOrReplaceChild("toesL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.7997F, 0.6996F, 0.3323F, 0.0F, 0.0F));

		PartDefinition toesL4 = toesL3.addOrReplaceChild("toesL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, 0.0094F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(33, 33).addBox(-0.4F, 0.2434F, -15.0967F, 1.0F, 2.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -2.4086F, -8.1116F, 0.0095F, 0.0868F, 0.0878F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(61, 65).addBox(-0.5F, 1.0F, -11.2F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.7566F, -15.0967F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1122F, -25.967F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, 0.7F, -0.4F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.1838F, -8.5571F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(68, 20).addBox(-0.5F, 0.6904F, -7.9748F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 27).addBox(-0.5F, 0.6904F, -0.3748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.1F, -0.0955F, -8.4221F, -0.281F, 0.1082F, 0.0593F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2894F, -7.3583F, -0.4157F, 0.0531F, 0.1197F));

		PartDefinition neck3_r1 = neck2.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(20, 67).addBox(-0.5F, -1.0F, -8.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3927F, -0.2099F, 0.0F, 0.0175F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0162F, -7.6324F, -0.3962F, 0.1396F, 0.321F));

		PartDefinition neck5_r1 = neck3.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(22, 92).addBox(-0.5F, -1.0F, 2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 87).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2349F, -3.2097F, 0.0F, 0.0349F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4317F, -5.9155F, -0.0843F, 0.0226F, 0.2608F));

		PartDefinition neck5_r2 = neck.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(40, 77).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.812F, -6.7946F, 0.0F, 0.0175F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6655F, -6.8098F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(110, 117).addBox(-0.3F, 0.4F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2F, 0.3391F, -2.2351F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head2 = neck4.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3525F, -2.745F, 0.6981F, 0.0F, 0.0F));

		PartDefinition bone3 = head2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8962F, -2.5616F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -5.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 1.1195F, -0.0612F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperarmL = chest.addOrReplaceChild("upperarmL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5669F, 7.9355F, -6.3857F, -0.8776F, -0.3328F, -0.6064F));

		PartDefinition lowerarmL = upperarmL.addOrReplaceChild("lowerarmL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7226F, 8.0147F, 0.448F, 0.6955F, 0.0337F, 0.3747F));

		PartDefinition handL = lowerarmL.addOrReplaceChild("handL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1409F, -0.397F, -5.4888F, 0.0F, 0.4363F, 0.0F));

		PartDefinition thumbclawL = handL.addOrReplaceChild("thumbclawL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -1.2F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition upperarmL2 = chest.addOrReplaceChild("upperarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3669F, 7.9355F, -6.3857F, 0.5109F, 0.4386F, 0.2007F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7226F, 8.0147F, 0.448F, 0.6716F, -0.1996F, -0.1706F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1409F, -0.397F, -5.4888F, 0.0F, -0.4363F, 0.0F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, -1.2F, -0.9F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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