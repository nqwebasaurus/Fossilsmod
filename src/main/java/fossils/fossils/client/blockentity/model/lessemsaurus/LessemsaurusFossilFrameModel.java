package fossils.fossils.client.blockentity.model.lessemsaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LessemsaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart upperarmL;
	private final ModelPart lowerarmL;
	private final ModelPart handL;
	private final ModelPart thumbclawL;
	private final ModelPart upperarmL2;
	private final ModelPart lowerarmL2;
	private final ModelPart handL2;
	private final ModelPart thumbclawL2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart head4;
	private final ModelPart head3;
	private final ModelPart head5;
	private final ModelPart jaw1;
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
	private final ModelPart bone;
	private final ModelPart bone4;

	public LessemsaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.basin.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.upperarmL = this.body3.getChild("upperarmL");
		this.lowerarmL = this.upperarmL.getChild("lowerarmL");
		this.handL = this.lowerarmL.getChild("handL");
		this.thumbclawL = this.handL.getChild("thumbclawL");
		this.upperarmL2 = this.body3.getChild("upperarmL2");
		this.lowerarmL2 = this.upperarmL2.getChild("lowerarmL2");
		this.handL2 = this.lowerarmL2.getChild("handL2");
		this.thumbclawL2 = this.handL2.getChild("thumbclawL2");
		this.bone2 = this.body3.getChild("bone2");
		this.bone3 = this.body3.getChild("bone3");
		this.chest = this.body3.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck4 = this.neck3.getChild("neck4");
		this.head1 = this.neck4.getChild("head1");
		this.head2 = this.head1.getChild("head2");
		this.head4 = this.head2.getChild("head4");
		this.head3 = this.head1.getChild("head3");
		this.head5 = this.head3.getChild("head5");
		this.jaw1 = this.head1.getChild("jaw1");
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
		this.bone = this.basin.getChild("bone");
		this.bone4 = this.basin.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -35.0F, 17.2F, 1.0F, 35.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -6.8F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(7.3F, -25.2F, -19.4F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-5.3F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.3F, -25.2F, -19.4F, 0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(1.5F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -30.0F, 17.7F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.1F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.1663F, 16.0759F, -0.0368F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(75, 72).addBox(-0.6F, -0.5F, 0.4F, 1.0F, 3.0F, 14.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5818F, -3.9697F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.206F, 9.9555F, 0.1051F, 0.2128F, 0.0651F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(52, 0).addBox(-0.425F, -0.5F, 0.3F, 1.0F, 3.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.2913F, -0.2089F, -0.0698F, 0.0087F, -0.0006F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7349F, 22.6944F, -0.1375F, 0.3331F, -0.1317F));

		PartDefinition tail3_r1 = tail2.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(1, 0).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 3.0F, 23.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.5F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1408F, 23.9488F, 0.1988F, 0.2404F, 0.0789F));

		PartDefinition tail5_r1 = tail3.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(23, 50).addBox(-0.5F, 0.0F, 22.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 27).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 24.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.1988F, -0.0681F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1327F, 22.915F, 0.1192F, -0.4293F, -0.0263F));

		PartDefinition tail6_r1 = tail4.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(15, 84).addBox(-0.5F, 0.3F, 15.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 69).addBox(-0.5F, 0.3F, -0.3F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1083F, 0.0094F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3088F, 15.7447F, 0.2027F, -0.8079F, -0.6606F));

		PartDefinition tail6_r2 = tail5.addOrReplaceChild("tail6_r2", CubeListBuilder.create().texOffs(51, 50).addBox(-0.5F, 0.3F, -0.1F, 1.0F, 1.0F, 20.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1083F, 0.0094F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(1, 87).addBox(-0.6F, -0.0771F, -11.8964F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9497F, -3.6642F, 0.0039F, -0.1309F, -0.0005F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5141F, -11.9968F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition body_r1 = body2.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(98, 90).addBox(-0.6F, -0.5F, -9.9F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.0175F, 0.0131F, -0.0002F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(102, 12).addBox(-0.6F, -0.6F, -6.8F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0261F, -11.1017F, 0.132F, -0.1298F, -0.0172F));

		PartDefinition upperarmL = body3.addOrReplaceChild("upperarmL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3669F, 11.58F, -12.7846F, -0.0682F, 0.253F, -0.1442F));

		PartDefinition lowerarmL = upperarmL.addOrReplaceChild("lowerarmL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.645F, 11.8743F, -0.4736F, 0.7993F, 0.663F, -0.6544F));

		PartDefinition handL = lowerarmL.addOrReplaceChild("handL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6893F, -1.397F, -8.2722F, -0.1418F, -1.083F, 0.0591F));

		PartDefinition thumbclawL = handL.addOrReplaceChild("thumbclawL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -1.2F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition upperarmL2 = body3.addOrReplaceChild("upperarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5669F, 11.58F, -12.7846F, 0.9354F, -0.253F, 0.1442F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.645F, 11.8743F, -0.4736F, 0.305F, 0.0136F, 1.1685F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6893F, -1.397F, -8.2722F, -0.0338F, -0.6133F, 0.1062F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, -1.2F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone2 = body3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.4974F, 9.5044F, -16.8928F));

		PartDefinition bone3 = body3.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.6974F, 9.5044F, -16.8928F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(100, 39).addBox(-0.6F, -2.0168F, -6.0452F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3484F, -7.5556F, -0.1344F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9218F, -6.2014F, -0.4996F, -0.1948F, 0.0079F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(29, 99).addBox(-0.6F, -0.2544F, 0.4209F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 3.5513F, -9.0044F, 0.3491F, 0.0082F, 0.003F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 3.3934F, -8.1425F, -0.0502F, -0.1707F, 0.0045F));

		PartDefinition neck3_r1 = neck2.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5F, 0.5334F, -8.718F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.8507F, -0.3256F, 0.131F, -0.0346F, -0.0046F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6184F, -9.0276F, 0.4706F, -0.3496F, -0.2803F));

		PartDefinition neck6_r1 = neck3.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(109, 104).addBox(-0.5F, 0.3202F, 3.7211F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7514F, -9.7039F, -0.3578F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1149F, -6.1983F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck6_r2 = neck.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(123, 12).addBox(-0.5F, 0.3202F, -1.2789F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -3.4F, -0.3578F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.034F, -10.8657F, 0.3292F, -0.29F, -0.0974F));

		PartDefinition neck6_r3 = neck4.addOrReplaceChild("neck6_r3", CubeListBuilder.create().texOffs(122, 89).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3194F, -4.7201F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head1 = neck4.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5194F, -5.2201F, 0.056F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.5F, -3.0F, 0.0456F, 0.0F, 0.0F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -3.4F, 0.3187F, 0.0F, 0.0F));

		PartDefinition head3 = head1.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -3.4F, 0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.0911F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0923F, 3.0946F, 0.7223F, 0.6547F, -0.0069F, 0.0049F));

		PartDefinition upperlegL = basin.addOrReplaceChild("upperlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 1.691F, 1.9855F, -0.5672F, 0.0F, 0.0F));

		PartDefinition lowerlegL = upperlegL.addOrReplaceChild("lowerlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 15.3419F, 4.0705F, 1.0414F, 0.0F, 0.0F));

		PartDefinition feetL = lowerlegL.addOrReplaceChild("feetL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 13.0297F, 1.1947F, -0.6355F, 0.0F, 0.0F));

		PartDefinition toesL = feetL.addOrReplaceChild("toesL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 5.163F, -0.2699F, 0.245F, 0.0F, 0.0F));

		PartDefinition toesL2 = toesL.addOrReplaceChild("toesL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, 0.0094F, 0.0F, 0.0F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create(), PartPose.offset(-4.8F, 1.691F, 1.9855F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 15.3419F, 4.0705F, 0.6051F, 0.0F, 0.0F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 13.0297F, 1.1947F, -0.7664F, 0.0F, 0.0F));

		PartDefinition toesL3 = feetL2.addOrReplaceChild("toesL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 5.163F, -0.2699F, 0.3759F, 0.0F, 0.0F));

		PartDefinition toesL4 = toesL3.addOrReplaceChild("toesL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.1215F, 0.0F, 0.0F));

		PartDefinition bone = basin.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(4.0F, -2.4435F, 4.8978F));

		PartDefinition bone4 = basin.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-4.2F, -2.4435F, 4.8978F));

		return LayerDefinition.create(meshdefinition, 168, 168);
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