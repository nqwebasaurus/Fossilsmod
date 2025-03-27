package fossils.fossils.client.blockentity.model.shonisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ShonisaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart tailbase1;
	private final ModelPart tail1;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart Tail6;
	private final ModelPart tail3;
	private final ModelPart tail7;
	private final ModelPart tail4;
	private final ModelPart fluke1;
	private final ModelPart belly3;
	private final ModelPart rearflipper2;
	private final ModelPart rearflipperfingers2;
	private final ModelPart rearflipper3;
	private final ModelPart rearflipperfingers3;
	private final ModelPart lowerbody3;
	private final ModelPart lowerbody2;
	private final ModelPart lowerbody1;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart head1;
	private final ModelPart rostrum1;
	private final ModelPart rostrum2;
	private final ModelPart teeth2;
	private final ModelPart beak1;
	private final ModelPart teeth1;
	private final ModelPart jaw1;
	private final ModelPart lowerrostrum1;
	private final ModelPart lowerrostrum2;
	private final ModelPart teeth4;
	private final ModelPart lowerbeak2;
	private final ModelPart beak3;
	private final ModelPart teeth3;
	private final ModelPart head2;
	private final ModelPart flipper2;
	private final ModelPart flipperfingers2;
	private final ModelPart flipper3;
	private final ModelPart flipperfingers3;
	private final ModelPart body3;
	private final ModelPart underbelly2;
	private final ModelPart body2;
	private final ModelPart underbelly3;
	private final ModelPart body1;
	private final ModelPart hips;

	public ShonisaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.tailbase1 = this.root.getChild("tailbase1");
		this.tail1 = this.tailbase1.getChild("tail1");
		this.tail5 = this.tail1.getChild("tail5");
		this.tail2 = this.tail1.getChild("tail2");
		this.Tail6 = this.tail2.getChild("Tail6");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail7 = this.tail3.getChild("tail7");
		this.tail4 = this.tail3.getChild("tail4");
		this.fluke1 = this.tail4.getChild("fluke1");
		this.belly3 = this.tailbase1.getChild("belly3");
		this.rearflipper2 = this.tailbase1.getChild("rearflipper2");
		this.rearflipperfingers2 = this.rearflipper2.getChild("rearflipperfingers2");
		this.rearflipper3 = this.tailbase1.getChild("rearflipper3");
		this.rearflipperfingers3 = this.rearflipper3.getChild("rearflipperfingers3");
		this.lowerbody3 = this.tailbase1.getChild("lowerbody3");
		this.lowerbody2 = this.lowerbody3.getChild("lowerbody2");
		this.lowerbody1 = this.lowerbody2.getChild("lowerbody1");
		this.neck1 = this.lowerbody1.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.head1 = this.neck2.getChild("head1");
		this.rostrum1 = this.head1.getChild("rostrum1");
		this.rostrum2 = this.rostrum1.getChild("rostrum2");
		this.teeth2 = this.rostrum2.getChild("teeth2");
		this.beak1 = this.rostrum1.getChild("beak1");
		this.teeth1 = this.rostrum1.getChild("teeth1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.lowerrostrum1 = this.jaw1.getChild("lowerrostrum1");
		this.lowerrostrum2 = this.lowerrostrum1.getChild("lowerrostrum2");
		this.teeth4 = this.lowerrostrum2.getChild("teeth4");
		this.lowerbeak2 = this.lowerrostrum1.getChild("lowerbeak2");
		this.beak3 = this.lowerrostrum1.getChild("beak3");
		this.teeth3 = this.lowerrostrum1.getChild("teeth3");
		this.head2 = this.head1.getChild("head2");
		this.flipper2 = this.lowerbody1.getChild("flipper2");
		this.flipperfingers2 = this.flipper2.getChild("flipperfingers2");
		this.flipper3 = this.lowerbody1.getChild("flipper3");
		this.flipperfingers3 = this.flipper3.getChild("flipperfingers3");
		this.body3 = this.lowerbody1.getChild("body3");
		this.underbelly2 = this.lowerbody1.getChild("underbelly2");
		this.body2 = this.lowerbody2.getChild("body2");
		this.underbelly3 = this.lowerbody3.getChild("underbelly3");
		this.body1 = this.lowerbody3.getChild("body1");
		this.hips = this.tailbase1.getChild("hips");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tailbase1 = root.addOrReplaceChild("tailbase1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.8F, 0.9F, -0.3481F, 0.0226F, 0.0843F));

		PartDefinition tail1 = tailbase1.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.054F, 0.2713F, 42.8883F, 0.0903F, 0.2608F, 0.0233F));

		PartDefinition tail5 = tail1.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5826F, -0.7992F, -0.0456F, 0.0F, 0.0F));

		PartDefinition body3_r1 = tail5.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, -0.3F, 0.3F, 2.0F, 2.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1826F, 14.8008F, 0.134F, 0.2163F, 0.0289F));

		PartDefinition Tail6 = tail2.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(82, 58).addBox(-1.0F, -3.1F, -2.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.4F, 1.9F, -0.0456F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 12.7F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tail7 = tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(25, 87).addBox(-0.996F, 1.1F, -1.1F, 2.0F, 2.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.3025F, 1.0093F, -0.0456F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(24, 52).addBox(-0.996F, -0.095F, -0.5092F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2975F, 11.7093F, 0.0F, 0.3491F, 0.0F));

		PartDefinition fluke1 = tail4.addOrReplaceChild("fluke1", CubeListBuilder.create().texOffs(30, 43).addBox(-0.996F, -0.1695F, 0.031F, 2.0F, 2.0F, 21.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.105F, 8.5908F, -0.6472F, 0.1402F, -0.0223F));

		PartDefinition fluke3_r1 = fluke1.addOrReplaceChild("fluke3_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-0.496F, -0.1F, -0.5F, 1.0F, 1.0F, 21.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.7305F, 20.931F, 0.3054F, 0.0F, 0.0F));

		PartDefinition belly3 = tailbase1.addOrReplaceChild("belly3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.054F, 14.6713F, 19.6883F, 0.406F, 0.0F, 0.0F));

		PartDefinition rearflipper2 = tailbase1.addOrReplaceChild("rearflipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.646F, 10.418F, 35.2471F, 0.2997F, 0.3879F, -1.0484F));

		PartDefinition rearflipperfingers2 = rearflipper2.addOrReplaceChild("rearflipperfingers2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -5.1F));

		PartDefinition rearflipper3 = tailbase1.addOrReplaceChild("rearflipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.646F, 10.418F, 35.2471F, 0.2376F, -0.3298F, 1.3529F));

		PartDefinition rearflipperfingers3 = rearflipper3.addOrReplaceChild("rearflipperfingers3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -5.1F));

		PartDefinition lowerbody3 = tailbase1.addOrReplaceChild("lowerbody3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.054F, -0.5287F, 20.8883F, 0.0F, -0.2182F, 0.0F));

		PartDefinition lowerbody2 = lowerbody3.addOrReplaceChild("lowerbody2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3228F, -16.1113F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerbody1 = lowerbody2.addOrReplaceChild("lowerbody1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4009F, -19.8483F, 0.0886F, -0.1739F, -0.0154F));

		PartDefinition neck1 = lowerbody1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.019F, -17.2795F, -0.088F, -0.1304F, 0.0115F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-5.024F, 0.151F, -0.3972F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.024F, 0.549F, -6.6028F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(106, 73).addBox(-0.9F, -0.0417F, -4.9531F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.7F, -6.8F, -0.2085F, -0.6102F, -0.0305F));

		PartDefinition head1 = neck2.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3417F, -4.0531F, -0.0973F, -0.2056F, 0.1871F));

		PartDefinition rostrum1 = head1.addOrReplaceChild("rostrum1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6683F, -10.6954F));

		PartDefinition rostrum2 = rostrum1.addOrReplaceChild("rostrum2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, -7.8F));

		PartDefinition teeth2 = rostrum2.addOrReplaceChild("teeth2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.3F));

		PartDefinition beak1 = rostrum1.addOrReplaceChild("beak1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, 1.7F, 0.0422F, 0.0F, 0.0F));

		PartDefinition teeth1 = rostrum1.addOrReplaceChild("teeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, 1.2F, 0.0911F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2683F, 1.2046F, 0.5236F, 0.0F, 0.0F));

		PartDefinition lowerrostrum1 = jaw1.addOrReplaceChild("lowerrostrum1", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2853F, -11.8586F));

		PartDefinition lowerrostrum2 = lowerrostrum1.addOrReplaceChild("lowerrostrum2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1F, -8.0F));

		PartDefinition teeth4 = lowerrostrum2.addOrReplaceChild("teeth4", CubeListBuilder.create(), PartPose.offset(0.0F, -1.4F, 0.3F));

		PartDefinition lowerbeak2 = lowerrostrum1.addOrReplaceChild("lowerbeak2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -7.3F, -0.0543F, 0.0F, 0.0F));

		PartDefinition beak3 = lowerrostrum1.addOrReplaceChild("beak3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition teeth3 = lowerrostrum1.addOrReplaceChild("teeth3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, 1.2F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0317F, -1.6954F, 0.3187F, 0.0F, 0.0F));

		PartDefinition flipper2 = lowerbody1.addOrReplaceChild("flipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(8.0F, 12.919F, -13.5795F, 0.3992F, 0.239F, -0.8824F));

		PartDefinition flipperfingers2 = flipper2.addOrReplaceChild("flipperfingers2", CubeListBuilder.create(), PartPose.offset(0.1237F, 1.1146F, -7.065F));

		PartDefinition flipper3 = lowerbody1.addOrReplaceChild("flipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.892F, 12.919F, -13.5795F, 0.1186F, -0.1284F, 0.8214F));

		PartDefinition flipperfingers3 = flipper3.addOrReplaceChild("flipperfingers3", CubeListBuilder.create(), PartPose.offset(-0.1237F, 1.1146F, -7.065F));

		PartDefinition body3 = lowerbody1.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offset(0.0F, 6.219F, 3.0205F));

		PartDefinition body6_r1 = body3.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(63, 0).addBox(3.2F, -0.5F, -9.0F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.1F, 2.8762F, -17.319F, 1.5708F, -0.0087F, 1.5708F));

		PartDefinition body5_r1 = body3.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(68, 5).addBox(-0.6F, -6.0F, -12.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.1715F, -11.889F, 1.5795F, 0.0F, 0.0F));

		PartDefinition body4_r1 = body3.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(63, 0).addBox(-1.0F, 0.285F, -0.2856F, 2.0F, 2.0F, 18.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -6.3804F, -20.6143F, 0.0087F, 0.0F, 0.0F));

		PartDefinition underbelly2 = lowerbody1.addOrReplaceChild("underbelly2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.769F, -16.2795F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body2 = lowerbody2.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.4991F, 2.0517F));

		PartDefinition body3_r2 = body2.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(57, 58).addBox(-1.0F, 0.4918F, -0.4112F, 2.0F, 2.0F, 20.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -6.3919F, -21.7934F, -0.0349F, 0.0F, 0.0F));

		PartDefinition underbelly3 = lowerbody3.addOrReplaceChild("underbelly3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.8772F, -12.0113F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body1 = lowerbody3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.1772F, 0.9887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(28, 67).addBox(-1.0F, -0.3106F, -0.1054F, 2.0F, 2.0F, 17.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -5.2892F, -17.905F, -0.0349F, 0.0F, 0.0F));

		PartDefinition hips = tailbase1.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -4.9079F, 0.0402F, 2.0F, 2.0F, 23.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.054F, 4.4713F, 20.0883F, -0.0281F, 0.0F, 0.0F));

		PartDefinition body5_r2 = hips.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(7, 33).addBox(0.0F, -0.1F, -8.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.9106F, 5.0461F, 15.1675F, 1.5904F, -0.4649F, 1.5708F));

		PartDefinition body4_r2 = hips.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(11, 37).addBox(-0.7F, 0.0F, -10.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.9079F, 11.5402F, 1.9643F, -0.0662F, -0.1292F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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