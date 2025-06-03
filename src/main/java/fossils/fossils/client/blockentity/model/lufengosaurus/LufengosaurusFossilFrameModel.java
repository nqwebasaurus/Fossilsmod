package fossils.fossils.client.blockentity.model.lufengosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LufengosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart upperlegL;
	private final ModelPart lowerlegL;
	private final ModelPart feetL;
	private final ModelPart toesL;
	private final ModelPart upperlegL2;
	private final ModelPart lowerlegL2;
	private final ModelPart feetL2;
	private final ModelPart toesL2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
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

	public LufengosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.upperlegL = this.basin.getChild("upperlegL");
		this.lowerlegL = this.upperlegL.getChild("lowerlegL");
		this.feetL = this.lowerlegL.getChild("feetL");
		this.toesL = this.feetL.getChild("toesL");
		this.upperlegL2 = this.basin.getChild("upperlegL2");
		this.lowerlegL2 = this.upperlegL2.getChild("lowerlegL2");
		this.feetL2 = this.lowerlegL2.getChild("feetL2");
		this.toesL2 = this.feetL2.getChild("toesL2");
		this.body = this.basin.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -25.9F, 1.25F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(1, 1).addBox(-2.8F, -25.9F, -22.9F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition crossbeam2_r1 = fossil.addOrReplaceChild("crossbeam2_r1", CubeListBuilder.create().texOffs(-3, 1).addBox(-5.0F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.75F, -20.5F, -22.4F, 0.0038F, 0.0872F, 0.0438F));

		PartDefinition crossbeam1_r1 = fossil.addOrReplaceChild("crossbeam1_r1", CubeListBuilder.create().texOffs(-3, 1).addBox(-5.0F, -0.5F, -0.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -24.0F, 1.75F, -0.0019F, -0.0436F, 0.0437F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, 6.6F, -0.0456F, 0.0F, 0.0F));

		PartDefinition frame7_r1 = basin.addOrReplaceChild("frame7_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.5F, -6.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, 1.6F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition frame8_r1 = tail1.addOrReplaceChild("frame8_r1", CubeListBuilder.create().texOffs(31, 24).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.1677F, -0.1374F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7323F, 12.3626F, 0.0435F, 0.0872F, -0.0038F));

		PartDefinition frame9_r1 = tail2.addOrReplaceChild("frame9_r1", CubeListBuilder.create().texOffs(21, -1).addBox(-0.5F, -0.2155F, -0.0348F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.8137F, -1.1388F, 0.0087F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 12.7F, 0.0437F, -0.1308F, -0.0133F));

		PartDefinition frame10_r1 = tail3.addOrReplaceChild("frame10_r1", CubeListBuilder.create().texOffs(15, 38).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.0244F, 6.5149F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, 0.4185F, 0.1755F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.6F, 12.2F, -0.219F, -0.0852F, 0.0189F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.7033F, -0.181F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2815F, 11.2755F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition upperlegL = basin.addOrReplaceChild("upperlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 1.1F, -4.2F, -0.0436F, 0.0F, 0.0F));

		PartDefinition lowerlegL = upperlegL.addOrReplaceChild("lowerlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 12.8F, 1.0321F, 1.216F, 0.0F, 0.0F));

		PartDefinition feetL = lowerlegL.addOrReplaceChild("feetL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 8.375F, 3.2011F, -0.81F, 0.0F, 0.0F));

		PartDefinition toesL = feetL.addOrReplaceChild("toesL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4F, -2.5F, 0.2276F, 0.0F, 0.0F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 1.1F, -4.2F, -0.5236F, 0.0F, 0.0F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 12.8F, 1.0321F, 1.1723F, 0.0F, 0.0F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 8.375F, 3.2011F, -0.81F, 0.0F, 0.0F));

		PartDefinition toesL2 = feetL2.addOrReplaceChild("toesL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4F, -2.5F, 0.2276F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -0.1F, -5.1F, 0.0457F, 0.0872F, 0.004F));

		PartDefinition frame6_r1 = body.addOrReplaceChild("frame6_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -9.5F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, -0.4F, -10.4F, 0.0F, 0.007F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -19.0F, 0.0437F, 0.0436F, 0.0019F));

		PartDefinition frame5_r1 = chest.addOrReplaceChild("frame5_r1", CubeListBuilder.create().texOffs(46, 23).addBox(-0.5F, -0.3F, 0.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 0.5F, -8.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -1.5F, -8.1F, -0.2903F, 0.1255F, -0.0374F));

		PartDefinition frame4_r1 = neck1.addOrReplaceChild("frame4_r1", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.9622F, -3.6253F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3404F, -7.0748F, -0.1797F, 0.1016F, 0.0702F));

		PartDefinition frame3_r1 = neck2.addOrReplaceChild("frame3_r1", CubeListBuilder.create().texOffs(29, 52).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.2427F, -3.5099F, -0.1135F, 0.0348F, -0.0027F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(12, 52).addBox(-0.5F, 0.6769F, -6.98F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.3073F, -6.5599F, 0.1138F, 0.1688F, 0.0624F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0231F, -6.98F, 0.1834F, 0.1698F, 0.0595F));

		PartDefinition frame1_r1 = neck4.addOrReplaceChild("frame1_r1", CubeListBuilder.create().texOffs(59, 36).addBox(-0.3F, -0.4F, -0.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 1.416F, -4.1983F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head2 = neck4.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.366F, -4.3983F, 0.1311F, 0.043F, 0.0076F));

		PartDefinition bone3 = head2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8962F, -2.5616F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -5.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 1.1038F, 0.2384F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperarmL = chest.addOrReplaceChild("upperarmL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.05F, 5.85F, -6.2F, 0.5863F, 0.253F, -0.1442F));

		PartDefinition lowerarmL = upperarmL.addOrReplaceChild("lowerarmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4981F, 8.0666F, 1.272F, 0.3662F, 0.1996F, 0.1706F));

		PartDefinition handL = lowerarmL.addOrReplaceChild("handL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3F, -1.3106F, -5.1785F, 0.0F, 0.4363F, 0.0F));

		PartDefinition thumbclawL = handL.addOrReplaceChild("thumbclawL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -0.3F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition upperarmL2 = chest.addOrReplaceChild("upperarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.85F, 5.85F, -6.2F, 0.9887F, -0.3938F, 0.2524F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4981F, 8.0666F, 1.272F, 0.5407F, -0.1996F, -0.1706F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, -1.3106F, -5.1785F, 0.0F, -0.3054F, 0.0F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.3F, -0.9F, -0.3927F, 0.0F, 0.0F));

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