package fossils.fossils.client.blockentity.model.shunosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ShunosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hip;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart Throatpouch;
	private final ModelPart head;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Upperbackteeth;
	private final ModelPart Nosebase;
	private final ModelPart Nosefront;
	private final ModelPart jaw;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawtruefront;
	private final ModelPart Lowerjawteeth;
	private final ModelPart Lowerjawslope;
	private final ModelPart Lowerjawslope2;
	private final ModelPart Bodyfrontslope;
	private final ModelPart upperarmleft;
	private final ModelPart lowerarmleft;
	private final ModelPart handleft;
	private final ModelPart Leftclaw;
	private final ModelPart upperarmright;
	private final ModelPart lowerarmright;
	private final ModelPart handright;
	private final ModelPart Rightclaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tailclub5;
	private final ModelPart upperlegleft;
	private final ModelPart lowerlegleft;
	private final ModelPart footleft;
	private final ModelPart upperlegright;
	private final ModelPart lowerlegright;
	private final ModelPart footright;
	private final ModelPart bone;

	public ShunosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hip = this.root.getChild("Hip");
		this.body = this.Hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.Throatpouch = this.neck5.getChild("Throatpouch");
		this.head = this.neck5.getChild("head");
		this.Upperjawbase = this.head.getChild("Upperjawbase");
		this.Upperjawfront = this.Upperjawbase.getChild("Upperjawfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Upperbackteeth = this.Upperjawbase.getChild("Upperbackteeth");
		this.Nosebase = this.head.getChild("Nosebase");
		this.Nosefront = this.Nosebase.getChild("Nosefront");
		this.jaw = this.head.getChild("jaw");
		this.Lowerjawmiddle = this.jaw.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerjawtruefront = this.Lowerjawfront.getChild("Lowerjawtruefront");
		this.Lowerjawteeth = this.Lowerjawfront.getChild("Lowerjawteeth");
		this.Lowerjawslope = this.Lowerjawmiddle.getChild("Lowerjawslope");
		this.Lowerjawslope2 = this.Lowerjawmiddle.getChild("Lowerjawslope2");
		this.Bodyfrontslope = this.chest.getChild("Bodyfrontslope");
		this.upperarmleft = this.chest.getChild("upperarmleft");
		this.lowerarmleft = this.upperarmleft.getChild("lowerarmleft");
		this.handleft = this.lowerarmleft.getChild("handleft");
		this.Leftclaw = this.handleft.getChild("Leftclaw");
		this.upperarmright = this.chest.getChild("upperarmright");
		this.lowerarmright = this.upperarmright.getChild("lowerarmright");
		this.handright = this.lowerarmright.getChild("handright");
		this.Rightclaw = this.handright.getChild("Rightclaw");
		this.Tail1 = this.Hip.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tailclub5 = this.Tail6.getChild("Tailclub5");
		this.upperlegleft = this.Hip.getChild("upperlegleft");
		this.lowerlegleft = this.upperlegleft.getChild("lowerlegleft");
		this.footleft = this.lowerlegleft.getChild("footleft");
		this.upperlegright = this.Hip.getChild("upperlegright");
		this.lowerlegright = this.upperlegright.getChild("lowerlegright");
		this.footright = this.lowerlegright.getChild("footright");
		this.bone = this.Hip.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -30.0F, 14.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-1.5F, -11.5F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -23.5F, -15.5F, -0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-5.1F, -12.5F, -0.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -23.5F, -15.5F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(4.5F, -5.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -24.5F, 15.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hip = root.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.9536F, 14.403F, -0.2347F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hip.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(38, 36).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 0.4691F, -6.1315F, -0.0524F, -0.0174F, 0.0009F));

		PartDefinition body = Hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5907F, -7.147F, 0.0218F, 0.2181F, 0.0047F));

		PartDefinition Bodymiddle_r1 = body.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, 0.5F, 0.1F, 1.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7168F, -15.9781F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1914F, -15.2497F, 0.1623F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = chest.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(43, 15).addBox(-0.5F, -0.5F, 0.9F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5582F, -13.1299F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6604F, -12.0576F, -0.1048F, 0.5415F, 0.0974F));

		PartDefinition Neckbase_r1 = neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(73, 13).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0644F, -8.1973F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5304F, -7.2736F, -0.1394F, 0.3459F, -0.0475F));

		PartDefinition Neckmiddlebase_r1 = neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 3.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6628F, -9.0898F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2481F, -8.0364F, -0.0797F, 0.1679F, -0.0996F));

		PartDefinition Neckmiddle_r1 = neck3.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(19, 91).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -1.5618F, -7.2992F, -0.168F, 0.1383F, 0.2865F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8823F, -7.2989F, 0.0996F, 0.4649F, 0.3196F));

		PartDefinition Neckmiddlefront_r1 = neck4.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, 0.3F, 1.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2732F, -9.1078F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1104F, -8.1092F, 0.2932F, 0.2818F, 0.1271F));

		PartDefinition Neckfront_r1 = neck5.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(0, 120).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.9581F, -2.6678F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Neckfront_r2 = neck5.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(11, 126).addBox(-1.0F, 0.3F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.9927F, -5.2982F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Throatpouch = neck5.addOrReplaceChild("Throatpouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2073F, 1.2018F, 0.1911F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1988F, -5.7982F, 0.3004F, 0.419F, 0.1254F));

		PartDefinition Upperjawbase = head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3539F, -4.0389F, 0.2972F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawbase.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.3821F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.5F, -3.7F, 0.1911F, 0.0F, 0.0F));

		PartDefinition Upperbackteeth = Upperjawbase.addOrReplaceChild("Upperbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8F, -4.0F, 0.2546F, 0.0F, 0.0F));

		PartDefinition Nosebase = head.addOrReplaceChild("Nosebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -2.1239F, -4.0389F, 0.1485F, 0.0F, 0.0F));

		PartDefinition Nosefront = Nosebase.addOrReplaceChild("Nosefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.4033F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7311F, 0.2209F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = jaw.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.2972F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.0F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawtruefront = Lowerjawfront.addOrReplaceChild("Lowerjawtruefront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.0F, -3.7F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Lowerjawteeth = Lowerjawfront.addOrReplaceChild("Lowerjawteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -4.3F, -0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope = Lowerjawmiddle.addOrReplaceChild("Lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 2.0F, -2.8F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope2 = Lowerjawmiddle.addOrReplaceChild("Lowerjawslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 2.0F, -2.8F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope = chest.addOrReplaceChild("Bodyfrontslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.5582F, -13.1299F, -0.4458F, 0.0F, 0.0F));

		PartDefinition upperarmleft = chest.addOrReplaceChild("upperarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9F, 12.5239F, -7.7711F, 0.1061F, 0.0F, 0.0F));

		PartDefinition lowerarmleft = upperarmleft.addOrReplaceChild("lowerarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.3226F, 0.4916F, -0.1934F, 0.0F, 0.0F));

		PartDefinition handleft = lowerarmleft.addOrReplaceChild("handleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 8.4811F, -1.6829F, 0.1733F, 0.0F, 0.0F));

		PartDefinition Leftclaw = handleft.addOrReplaceChild("Leftclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.28F, 1.4337F, 1.3758F, 0.3183F, 0.2122F, 0.5732F));

		PartDefinition upperarmright = chest.addOrReplaceChild("upperarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9F, 12.5239F, -7.7711F, 0.6297F, 0.0F, 0.0F));

		PartDefinition lowerarmright = upperarmright.addOrReplaceChild("lowerarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.3226F, 0.4916F, -0.8479F, 0.0F, 0.0F));

		PartDefinition handright = lowerarmright.addOrReplaceChild("handright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 8.4811F, -1.6829F, 1.046F, 0.0F, 0.0F));

		PartDefinition Rightclaw = handright.addOrReplaceChild("Rightclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(2.28F, 1.4337F, 1.3758F, 0.3183F, -0.2122F, -0.5732F));

		PartDefinition Tail1 = Hip.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.435F, 6.5883F, 0.1064F, -0.5297F, 0.0324F));

		PartDefinition Tail2_r1 = Tail1.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(57, 66).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2931F, 0.0306F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3444F, 10.0623F, -0.2823F, -0.4211F, 0.118F));

		PartDefinition Tail3_r1 = Tail2.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, 0.6F, -1.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.547F, 0.2856F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3732F, 11.739F, -0.0047F, -0.6109F, 0.0027F));

		PartDefinition Tail4_r1 = Tail3.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(30, 53).addBox(-0.5F, 0.7F, -0.1F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4696F, -0.0443F, 0.192F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9193F, 10.7802F, 0.1458F, -0.4323F, -0.0614F));

		PartDefinition Tail4_r2 = Tail4.addOrReplaceChild("Tail4_r2", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6326F, -0.0324F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1236F, 10.7552F, -0.3321F, -0.4356F, -0.0256F));

		PartDefinition Tail6_r1 = Tail5.addOrReplaceChild("Tail6_r1", CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.371F, 0.2185F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6888F, 10.9103F, -0.2844F, -0.5605F, 0.0688F));

		PartDefinition Tail7_r1 = Tail6.addOrReplaceChild("Tail7_r1", CubeListBuilder.create().texOffs(23, 79).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1454F, -0.0325F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailclub5 = Tail6.addOrReplaceChild("Tailclub5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5239F, 10.0392F, -0.2608F, 0.0422F, -0.0112F));

		PartDefinition upperlegleft = Hip.addOrReplaceChild("upperlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 2.0692F, 0.8294F, -0.1309F, 0.0F, 0.0F));

		PartDefinition lowerlegleft = upperlegleft.addOrReplaceChild("lowerlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 17.9106F, -0.8253F, 0.4517F, 0.0F, 0.0F));

		PartDefinition footleft = lowerlegleft.addOrReplaceChild("footleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 11.2122F, -0.0985F, 0.263F, 0.0F, 0.0F));

		PartDefinition upperlegright = Hip.addOrReplaceChild("upperlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 2.0692F, 0.8294F, 0.3927F, 0.0F, 0.0F));

		PartDefinition lowerlegright = upperlegright.addOrReplaceChild("lowerlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 17.9106F, -0.8253F, 0.3208F, 0.0F, 0.0F));

		PartDefinition footright = lowerlegright.addOrReplaceChild("footright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 11.2122F, -0.0985F, -0.1297F, 0.0F, 0.0F));

		PartDefinition bone = Hip.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.8F, 4.6359F, 3.5126F));

		return LayerDefinition.create(meshdefinition, 155, 155);
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