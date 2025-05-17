package fossils.fossils.client.blockentity.model.shunosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ShunosaurusFossilModel extends SkullModelBase {
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

	public ShunosaurusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hip = root.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.9536F, 14.403F, -0.2347F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hip.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(25, 67).mirror().addBox(-3.0F, 0.0F, 2.0F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 67).addBox(1.0F, 0.0F, 2.0F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(37, 36).addBox(-1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5871F, -7.1777F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neckfront_r1 = Hip.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(71, 106).addBox(0.0F, -5.2F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5599F, 4.8015F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Neckfront_r2 = Hip.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(110, 95).addBox(-0.003F, 0.0F, 0.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4721F, 0.7457F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neckfront_r3 = Hip.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(0, 110).addBox(0.0F, -0.1F, 0.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9814F, -3.2391F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Neckfront_r4 = Hip.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(83, 100).addBox(0.0F, -4.4535F, -0.07F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9007F, -5.0682F, -0.1833F, 0.0F, 0.0F));

		PartDefinition body = Hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5907F, -7.147F, 0.0218F, 0.2181F, 0.0047F));

		PartDefinition Bodymiddle_r1 = body.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 21).addBox(-6.0F, -2.5524F, 7.8333F, 11.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 18.9832F, -13.4781F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(0, 36).addBox(-5.5F, -3.9427F, -0.0625F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 18.9832F, -13.4781F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, 0.1F, 2.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7168F, -15.9781F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neckfront_r5 = body.addOrReplaceChild("Neckfront_r5", CubeListBuilder.create().texOffs(61, 130).addBox(0.0F, -4.3535F, -1.97F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4125F, 1.1071F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neckfront_r6 = body.addOrReplaceChild("Neckfront_r6", CubeListBuilder.create().texOffs(130, 47).addBox(0.0F, -4.4615F, -1.9978F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4014F, -1.9078F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neckfront_r7 = body.addOrReplaceChild("Neckfront_r7", CubeListBuilder.create().texOffs(130, 39).addBox(0.0F, -4.7529F, -0.0001F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.383F, -6.9327F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neckfront_r8 = body.addOrReplaceChild("Neckfront_r8", CubeListBuilder.create().texOffs(79, 124).addBox(0.0F, -4.949F, -0.1108F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3426F, -9.8074F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Neckfront_r9 = body.addOrReplaceChild("Neckfront_r9", CubeListBuilder.create().texOffs(22, 124).addBox(0.0F, -4.9747F, -0.2557F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.193F, -12.7156F, -0.2967F, 0.0F, 0.0F));

		PartDefinition chest14_r1 = body.addOrReplaceChild("chest14_r1", CubeListBuilder.create().texOffs(125, 30).mirror().addBox(-8.889F, -1.5781F, -0.549F, 4.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2115F, -0.0988F, 0.0092F, -0.0948F, -1.1272F));

		PartDefinition chest13_r1 = body.addOrReplaceChild("chest13_r1", CubeListBuilder.create().texOffs(120, 117).mirror().addBox(-5.0979F, 0.6359F, -0.549F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2115F, -0.0988F, -0.0318F, -0.0898F, -0.689F));

		PartDefinition chest12_r1 = body.addOrReplaceChild("chest12_r1", CubeListBuilder.create().texOffs(119, 103).mirror().addBox(-5.1292F, 0.5134F, -0.5517F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3663F, -3.0545F, 0.0749F, -0.0161F, -0.5974F));

		PartDefinition chest13_r2 = body.addOrReplaceChild("chest13_r2", CubeListBuilder.create().texOffs(102, 75).mirror().addBox(-12.8656F, -1.7024F, -0.5517F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3663F, -3.0545F, 0.0747F, 0.0171F, -1.0325F));

		PartDefinition chest13_r3 = body.addOrReplaceChild("chest13_r3", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-11.9415F, -8.4401F, -0.3533F, 2.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.3888F, -6.1905F, 0.0572F, 0.1764F, -1.5894F));

		PartDefinition chest12_r2 = body.addOrReplaceChild("chest12_r2", CubeListBuilder.create().texOffs(72, 28).mirror().addBox(-12.9194F, -1.7768F, -0.3533F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.3888F, -6.1905F, 0.1432F, 0.118F, -1.0188F));

		PartDefinition chest11_r1 = body.addOrReplaceChild("chest11_r1", CubeListBuilder.create().texOffs(119, 101).mirror().addBox(-5.2094F, 0.4687F, -0.3533F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.3888F, -6.1905F, 0.1794F, 0.0468F, -0.5867F));

		PartDefinition chest12_r3 = body.addOrReplaceChild("chest12_r3", CubeListBuilder.create().texOffs(136, 29).mirror().addBox(-12.8744F, -8.2496F, -0.5564F, 3.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3802F, -8.7153F, 0.0613F, 0.2722F, -1.5536F));

		PartDefinition chest11_r2 = body.addOrReplaceChild("chest11_r2", CubeListBuilder.create().texOffs(72, 26).mirror().addBox(-12.7605F, -1.6522F, -0.5564F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3802F, -8.7153F, 0.1993F, 0.1963F, -0.9751F));

		PartDefinition chest10_r1 = body.addOrReplaceChild("chest10_r1", CubeListBuilder.create().texOffs(119, 99).mirror().addBox(-5.0127F, 0.5145F, -0.5564F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3802F, -8.7153F, 0.2626F, 0.0948F, -0.5459F));

		PartDefinition chest11_r3 = body.addOrReplaceChild("chest11_r3", CubeListBuilder.create().texOffs(119, 95).mirror().addBox(-14.9564F, -8.3357F, -0.4681F, 5.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2462F, -11.889F, 0.0765F, 0.3849F, -1.5055F));

		PartDefinition chest10_r2 = body.addOrReplaceChild("chest10_r2", CubeListBuilder.create().texOffs(43, 33).mirror().addBox(-12.8759F, -1.6807F, -0.4681F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2462F, -11.889F, 0.2757F, 0.2823F, -0.9137F));

		PartDefinition chest9_r1 = body.addOrReplaceChild("chest9_r1", CubeListBuilder.create().texOffs(119, 97).mirror().addBox(-5.1294F, 0.5374F, -0.4681F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2462F, -11.889F, 0.3665F, 0.1425F, -0.4903F));

		PartDefinition chest8_r1 = body.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(119, 62).mirror().addBox(-4.0676F, 0.6438F, -0.6072F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.1298F, -14.6825F, 0.4391F, 0.1747F, -0.4353F));

		PartDefinition chest9_r2 = body.addOrReplaceChild("chest9_r2", CubeListBuilder.create().texOffs(43, 31).mirror().addBox(-11.9585F, -1.1356F, -0.6072F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.1298F, -14.6825F, 0.3307F, 0.341F, -0.8533F));

		PartDefinition chest10_r3 = body.addOrReplaceChild("chest10_r3", CubeListBuilder.create().texOffs(108, 21).mirror().addBox(-16.4756F, -7.3831F, -0.6072F, 7.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.1298F, -14.6825F, 0.0877F, 0.4628F, -1.4573F));

		PartDefinition chest12_r4 = body.addOrReplaceChild("chest12_r4", CubeListBuilder.create().texOffs(120, 117).addBox(0.0979F, 0.6359F, -0.549F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2115F, -0.0988F, -0.0318F, 0.0898F, 0.689F));

		PartDefinition chest13_r4 = body.addOrReplaceChild("chest13_r4", CubeListBuilder.create().texOffs(125, 30).addBox(4.789F, -1.5781F, -0.549F, 4.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2115F, -0.0988F, 0.0092F, 0.0948F, 1.1272F));

		PartDefinition chest12_r5 = body.addOrReplaceChild("chest12_r5", CubeListBuilder.create().texOffs(102, 75).addBox(4.7656F, -1.7024F, -0.5517F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3663F, -3.0545F, 0.0747F, -0.0171F, 1.0325F));

		PartDefinition chest11_r4 = body.addOrReplaceChild("chest11_r4", CubeListBuilder.create().texOffs(119, 103).addBox(0.1293F, 0.5134F, -0.5517F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3663F, -3.0545F, 0.0749F, 0.0161F, 0.5974F));

		PartDefinition chest10_r4 = body.addOrReplaceChild("chest10_r4", CubeListBuilder.create().texOffs(119, 101).addBox(0.2094F, 0.4687F, -0.3533F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.3888F, -6.1905F, 0.1794F, -0.0468F, 0.5867F));

		PartDefinition chest11_r5 = body.addOrReplaceChild("chest11_r5", CubeListBuilder.create().texOffs(72, 28).addBox(4.8194F, -1.7768F, -0.3533F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.3888F, -6.1905F, 0.1432F, -0.118F, 1.0188F));

		PartDefinition chest12_r6 = body.addOrReplaceChild("chest12_r6", CubeListBuilder.create().texOffs(38, 91).addBox(9.8415F, -8.4401F, -0.3533F, 2.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.3888F, -6.1905F, 0.0572F, -0.1764F, 1.5894F));

		PartDefinition chest9_r3 = body.addOrReplaceChild("chest9_r3", CubeListBuilder.create().texOffs(119, 99).addBox(0.0127F, 0.5145F, -0.5564F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3802F, -8.7153F, 0.2626F, -0.0948F, 0.5459F));

		PartDefinition chest10_r5 = body.addOrReplaceChild("chest10_r5", CubeListBuilder.create().texOffs(72, 26).addBox(4.6605F, -1.6522F, -0.5564F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3802F, -8.7153F, 0.1993F, -0.1963F, 0.9751F));

		PartDefinition chest11_r6 = body.addOrReplaceChild("chest11_r6", CubeListBuilder.create().texOffs(136, 29).addBox(9.7744F, -8.2496F, -0.5564F, 3.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3802F, -8.7153F, 0.0613F, -0.2722F, 1.5536F));

		PartDefinition chest8_r2 = body.addOrReplaceChild("chest8_r2", CubeListBuilder.create().texOffs(119, 97).addBox(0.1294F, 0.5374F, -0.4681F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2462F, -11.889F, 0.3665F, -0.1425F, 0.4903F));

		PartDefinition chest9_r4 = body.addOrReplaceChild("chest9_r4", CubeListBuilder.create().texOffs(43, 33).addBox(4.7759F, -1.6807F, -0.4681F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2462F, -11.889F, 0.2757F, -0.2823F, 0.9137F));

		PartDefinition chest10_r6 = body.addOrReplaceChild("chest10_r6", CubeListBuilder.create().texOffs(119, 95).addBox(9.8564F, -8.3357F, -0.4681F, 5.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2462F, -11.889F, 0.0765F, -0.3849F, 1.5055F));

		PartDefinition chest7_r1 = body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(119, 62).addBox(-0.9324F, 0.6438F, -0.6072F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.1298F, -14.6825F, 0.4391F, -0.1747F, 0.4353F));

		PartDefinition chest9_r5 = body.addOrReplaceChild("chest9_r5", CubeListBuilder.create().texOffs(108, 21).addBox(9.3756F, -7.3831F, -0.6072F, 7.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.1298F, -14.6825F, 0.0877F, -0.4628F, 1.4573F));

		PartDefinition chest8_r3 = body.addOrReplaceChild("chest8_r3", CubeListBuilder.create().texOffs(43, 31).addBox(3.8585F, -1.1356F, -0.6072F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.1298F, -14.6825F, 0.3307F, -0.341F, 0.8533F));

		PartDefinition Neckfront_r10 = body.addOrReplaceChild("Neckfront_r10", CubeListBuilder.create().texOffs(56, 123).addBox(0.0F, -4.8F, -0.3F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2382F, -15.5788F, -0.4014F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1914F, -15.2497F, 0.1623F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = chest.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(68, 44).mirror().addBox(-2.3314F, -1.3659F, -5.7838F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7236F, 7.3898F, -6.3961F, 1.7445F, -0.1742F, 0.0058F));

		PartDefinition Bodyfront_r2 = chest.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(75, 133).mirror().addBox(-1.5846F, 2.0796F, 6.2852F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.7491F, 5.9027F, -6.202F, 1.5009F, -0.0395F, 0.2613F));

		PartDefinition Bodyfront_r3 = chest.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-1.5846F, -2.3223F, 3.4603F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.7491F, 5.9027F, -6.202F, 0.7155F, -0.0395F, 0.2613F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(129, 32).mirror().addBox(1.0792F, 10.1192F, 6.377F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.5579F, -2.4475F, 1.2247F, -1.0499F, 0.0132F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-0.5173F, -0.1546F, -1.8189F, 1.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.5579F, -2.4475F, 0.1884F, -0.9117F, 0.0326F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(47, 121).mirror().addBox(1.2037F, 9.9959F, 5.8936F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 17.958F, -3.3475F, 0.9705F, -1.111F, 0.2582F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 53).mirror().addBox(-0.3506F, 0.6084F, -0.1709F, 1.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 17.958F, -3.3475F, 0.0209F, -0.9739F, 0.2171F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(67, 80).mirror().addBox(-0.4948F, -0.3684F, -0.6593F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.758F, -3.2475F, 0.0118F, -1.0525F, 0.1484F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 133).mirror().addBox(1.5053F, 7.3847F, 5.1521F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.758F, -3.2475F, 0.9576F, -1.2767F, 0.2091F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(83, 55).mirror().addBox(-0.5226F, -0.17F, -1.3147F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.458F, -4.0475F, -0.0314F, -1.0779F, 0.1703F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(110, 105).mirror().addBox(2.0807F, 5.9612F, 3.8674F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 18.458F, -4.0475F, 0.7976F, -1.4304F, 0.3664F));

		PartDefinition Bodyfront_r4 = chest.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(95, 13).mirror().addBox(-0.5F, -2.2F, -4.3F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6251F, 13.0149F, -10.2831F, 1.474F, -0.2966F, -0.5562F));

		PartDefinition Bodyfront_r5 = chest.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(49, 106).mirror().addBox(-1.783F, -1.6074F, -5.4313F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.7491F, 5.9027F, -6.202F, 0.3873F, -0.1289F, 0.176F));

		PartDefinition Bodyfront_r6 = chest.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-2.3314F, -5.3659F, -7.2838F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.7491F, 5.9027F, -6.202F, 1.439F, -0.1742F, 0.0058F));

		PartDefinition Bodyfront_r7 = chest.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(86, 97).mirror().addBox(-1.5846F, -1.6548F, -2.1301F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(46, 80).mirror().addBox(-1.5846F, -2.0628F, -1.085F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7491F, 5.9027F, -6.202F, 0.8901F, -0.0395F, 0.2613F));

		PartDefinition chest9_r6 = chest.addOrReplaceChild("chest9_r6", CubeListBuilder.create().texOffs(108, 4).mirror().addBox(-17.8578F, -7.3273F, -0.1515F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.3274F, -2.8796F, 0.0761F, 0.3674F, -1.462F));

		PartDefinition chest7_r2 = chest.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(9, 124).mirror().addBox(-4.2259F, 0.9961F, -0.1515F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.3274F, -2.8796F, 0.3513F, 0.1336F, -0.4488F));

		PartDefinition chest8_r4 = chest.addOrReplaceChild("chest8_r4", CubeListBuilder.create().texOffs(108, 6).mirror().addBox(-12.251F, -0.8832F, -0.1515F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.3274F, -2.8796F, 0.2653F, 0.268F, -0.8729F));

		PartDefinition chest8_r5 = chest.addOrReplaceChild("chest8_r5", CubeListBuilder.create().texOffs(108, 23).mirror().addBox(-16.6867F, -7.363F, -0.6209F, 7.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1002F, -5.277F, 0.0857F, 0.4805F, -1.5017F));

		PartDefinition chest7_r3 = chest.addOrReplaceChild("chest7_r3", CubeListBuilder.create().texOffs(108, 2).mirror().addBox(-12.1258F, -1.0052F, -0.6209F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1002F, -5.277F, 0.3398F, 0.3566F, -0.8937F));

		PartDefinition chest6_r1 = chest.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(123, 18).mirror().addBox(-4.1641F, 0.8326F, -0.6209F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1002F, -5.277F, 0.4535F, 0.1854F, -0.4763F));

		PartDefinition chest6_r2 = chest.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-12.4334F, -0.744F, -0.1553F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.073F, -8.5743F, 0.4145F, 0.4352F, -0.9089F));

		PartDefinition chest7_r4 = chest.addOrReplaceChild("chest7_r4", CubeListBuilder.create().texOffs(117, 73).mirror().addBox(-16.0865F, -7.3079F, -0.1553F, 6.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.073F, -8.5743F, 0.0979F, 0.5845F, -1.5396F));

		PartDefinition chest5_r1 = chest.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(123, 16).mirror().addBox(-4.3325F, 1.1994F, -0.1553F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.073F, -8.5743F, 0.5503F, 0.2298F, -0.5004F));

		PartDefinition chest6_r3 = chest.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(141, 128).mirror().addBox(-12.1122F, -7.3403F, -0.6107F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.333F, -10.172F, 0.1067F, 0.7144F, -1.6573F));

		PartDefinition chest5_r2 = chest.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(15, 107).mirror().addBox(-12.4724F, -0.7574F, -0.6107F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.333F, -10.172F, 0.5098F, 0.5344F, -0.9876F));

		PartDefinition chest4_r1 = chest.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(121, 75).mirror().addBox(-4.3735F, 1.2036F, -0.6107F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.333F, -10.172F, 0.6706F, 0.2881F, -0.5926F));

		PartDefinition chest7_r5 = chest.addOrReplaceChild("chest7_r5", CubeListBuilder.create().texOffs(108, 6).addBox(4.151F, -0.8832F, -0.1515F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.3274F, -2.8796F, 0.2653F, -0.268F, 0.8729F));

		PartDefinition chest6_r4 = chest.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(9, 124).addBox(-0.7741F, 0.9961F, -0.1515F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.3274F, -2.8796F, 0.3513F, -0.1336F, 0.4488F));

		PartDefinition chest8_r6 = chest.addOrReplaceChild("chest8_r6", CubeListBuilder.create().texOffs(108, 4).addBox(9.7578F, -7.3273F, -0.1515F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.3274F, -2.8796F, 0.0761F, -0.3674F, 1.462F));

		PartDefinition chest5_r3 = chest.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(123, 18).addBox(-0.8359F, 0.8326F, -0.6209F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.1002F, -5.277F, 0.4535F, -0.1854F, 0.4763F));

		PartDefinition chest6_r5 = chest.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(108, 2).addBox(4.0258F, -1.0052F, -0.6209F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.1002F, -5.277F, 0.3398F, -0.3566F, 0.8937F));

		PartDefinition chest7_r6 = chest.addOrReplaceChild("chest7_r6", CubeListBuilder.create().texOffs(108, 23).addBox(9.5867F, -7.363F, -0.6209F, 7.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.1002F, -5.277F, 0.0857F, -0.4805F, 1.5017F));

		PartDefinition chest4_r2 = chest.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(123, 16).addBox(-0.6675F, 1.1994F, -0.1553F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.073F, -8.5743F, 0.5503F, -0.2298F, 0.5004F));

		PartDefinition chest6_r6 = chest.addOrReplaceChild("chest6_r6", CubeListBuilder.create().texOffs(117, 73).addBox(9.9865F, -7.3079F, -0.1553F, 6.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.073F, -8.5743F, 0.0979F, -0.5845F, 1.5396F));

		PartDefinition chest5_r4 = chest.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(108, 0).addBox(4.3334F, -0.744F, -0.1553F, 8.1F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.073F, -8.5743F, 0.4145F, -0.4352F, 0.9089F));

		PartDefinition chest3_r1 = chest.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(121, 75).addBox(-0.6265F, 1.2036F, -0.6107F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.333F, -10.172F, 0.6706F, -0.2881F, 0.5926F));

		PartDefinition chest4_r3 = chest.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(15, 107).addBox(4.4724F, -0.7574F, -0.6107F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.333F, -10.172F, 0.5098F, -0.5344F, 0.9876F));

		PartDefinition chest5_r5 = chest.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(141, 128).addBox(10.1122F, -7.3403F, -0.6107F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.333F, -10.172F, 0.1067F, -0.7144F, 1.6573F));

		PartDefinition Bodyfront_r8 = chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(75, 133).addBox(0.5846F, 2.0796F, 6.2852F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.7491F, 5.9027F, -6.202F, 1.5009F, 0.0395F, -0.2613F));

		PartDefinition Bodyfront_r9 = chest.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(0, 100).addBox(0.5846F, -2.3223F, 3.4603F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.7491F, 5.9027F, -6.202F, 0.7155F, 0.0395F, -0.2613F));

		PartDefinition Bodyfront_r10 = chest.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(86, 97).addBox(0.5846F, -1.6548F, -2.1301F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.008F))
				.texOffs(46, 80).addBox(0.5846F, -2.0628F, -1.085F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7491F, 5.9027F, -6.202F, 0.8901F, 0.0395F, -0.2613F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 0).addBox(-0.4827F, -0.1546F, -1.8189F, 1.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.5579F, -2.4475F, 0.1884F, 0.9117F, -0.0326F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(129, 32).addBox(-2.0792F, 10.1192F, 6.377F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.5579F, -2.4475F, 1.2247F, 1.0499F, -0.0132F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(56, 53).addBox(-0.6494F, 0.6084F, -0.1709F, 1.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 17.958F, -3.3475F, 0.0209F, 0.9739F, -0.2171F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(47, 121).addBox(-2.2037F, 9.9959F, 5.8936F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 17.958F, -3.3475F, 0.9705F, 1.111F, -0.2582F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(66, 133).addBox(-2.5053F, 7.3847F, 5.1521F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.758F, -3.2475F, 0.9576F, 1.2767F, -0.2091F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(67, 80).addBox(-0.5052F, -0.3684F, -0.6593F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.758F, -3.2475F, 0.0118F, 1.0525F, -0.1484F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(110, 105).addBox(-3.0807F, 5.9612F, 3.8674F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.458F, -4.0475F, 0.7976F, 1.4304F, -0.3664F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(83, 55).addBox(-0.4774F, -0.17F, -1.3147F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 18.458F, -4.0475F, -0.0314F, 1.0779F, -0.1703F));

		PartDefinition Bodyfront_r11 = chest.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(95, 13).addBox(-0.5F, -2.2F, -4.3F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6251F, 13.0149F, -10.2831F, 1.474F, 0.2966F, 0.5562F));

		PartDefinition Bodyfront_r12 = chest.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(68, 44).addBox(1.3314F, -1.3659F, -5.7838F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7236F, 7.3898F, -6.3961F, 1.7445F, 0.1742F, -0.0058F));

		PartDefinition Bodyfront_r13 = chest.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(93, 0).addBox(1.3314F, -5.3659F, -7.2838F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.7491F, 5.9027F, -6.202F, 1.439F, 0.1742F, -0.0058F));

		PartDefinition Bodyfront_r14 = chest.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(49, 106).addBox(0.783F, -1.6074F, -5.4313F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.7491F, 5.9027F, -6.202F, 0.3873F, 0.1289F, -0.176F));

		PartDefinition Bodyfront_r15 = chest.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(43, 15).addBox(-1.0F, -1.5F, 0.9F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5582F, -13.1299F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Neckfront_r11 = chest.addOrReplaceChild("Neckfront_r11", CubeListBuilder.create().texOffs(121, 130).addBox(0.0F, -4.4604F, -0.2748F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3536F, -3.0829F, -0.4887F, 0.0F, 0.0F));

		PartDefinition Neckfront_r12 = chest.addOrReplaceChild("Neckfront_r12", CubeListBuilder.create().texOffs(110, 140).addBox(0.0F, -4.3F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2859F, -5.7625F, -0.4887F, 0.0F, 0.0F));

		PartDefinition Neckfront_r13 = chest.addOrReplaceChild("Neckfront_r13", CubeListBuilder.create().texOffs(62, 138).addBox(0.0F, -4.2F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0795F, -8.659F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Neckfront_r14 = chest.addOrReplaceChild("Neckfront_r14", CubeListBuilder.create().texOffs(116, 130).addBox(0.0F, -4.3908F, 8.3083F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2819F, -19.3529F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6604F, -12.0576F, -0.1048F, 0.5415F, 0.0974F));

		PartDefinition Neckbase_r1 = neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(72, 13).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0644F, -8.1973F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Neckfront_r15 = neck1.addOrReplaceChild("Neckfront_r15", CubeListBuilder.create().texOffs(126, 130).addBox(0.0F, -4.3908F, -1.8917F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7281F, -0.7458F, 0.2356F, 0.0F, 0.0F));

		PartDefinition chest5_r6 = neck1.addOrReplaceChild("chest5_r6", CubeListBuilder.create().texOffs(120, 119).mirror().addBox(-4.4513F, 1.2504F, -0.8854F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4775F, -1.81F, 1.1468F, 0.5063F, -0.5587F));

		PartDefinition chest6_r7 = neck1.addOrReplaceChild("chest6_r7", CubeListBuilder.create().texOffs(114, 32).mirror().addBox(-10.5627F, -0.748F, -0.8854F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4775F, -1.81F, 0.9633F, 0.8889F, -0.8382F));

		PartDefinition cube_r17 = neck1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(130, 55).mirror().addBox(-0.6593F, -1.4881F, 0.9628F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.772F, -0.712F, -4.9654F, 1.5843F, 0.0793F, 0.6077F));

		PartDefinition neck15_r1 = neck1.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(81, 66).mirror().addBox(-0.0873F, -0.5992F, -0.9021F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8063F, 0.4315F, -5.7811F, -0.2994F, -0.1513F, 0.0909F));

		PartDefinition cube_r18 = neck1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(84, 124).mirror().addBox(-0.3947F, -0.4692F, -1.4787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.772F, -0.712F, -4.9654F, 1.6159F, 0.0342F, 0.4329F));

		PartDefinition cube_r19 = neck1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(84, 124).addBox(-0.6053F, -0.4692F, -1.4787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.772F, -0.712F, -4.9654F, 1.6159F, -0.0342F, -0.4329F));

		PartDefinition neck14_r1 = neck1.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(81, 66).addBox(-0.9127F, -0.5992F, -0.9021F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8063F, 0.4315F, -5.7811F, -0.2994F, 0.1513F, -0.0909F));

		PartDefinition cube_r20 = neck1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(130, 55).addBox(-0.3407F, -1.4881F, 0.9628F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.772F, -0.712F, -4.9654F, 1.5843F, -0.0793F, -0.6077F));

		PartDefinition Neckfront_r16 = neck1.addOrReplaceChild("Neckfront_r16", CubeListBuilder.create().texOffs(135, 67).addBox(0.0F, -2.0F, -1.2F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7358F, -4.838F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest5_r7 = neck1.addOrReplaceChild("chest5_r7", CubeListBuilder.create().texOffs(114, 32).addBox(4.5627F, -0.748F, -0.8854F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4775F, -1.81F, 0.9633F, -0.8889F, 0.8382F));

		PartDefinition chest4_r4 = neck1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(120, 119).addBox(-0.5487F, 1.2504F, -0.8854F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4775F, -1.81F, 1.1468F, -0.5063F, 0.5587F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5304F, -7.2736F, -0.1394F, 0.3459F, -0.0475F));

		PartDefinition Neckmiddlebase_r1 = neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(70, 0).addBox(-1.0F, -1.0F, -0.1F, 2.0F, 3.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6628F, -9.0898F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neckfront_r17 = neck2.addOrReplaceChild("Neckfront_r17", CubeListBuilder.create().texOffs(34, 136).addBox(0.0F, -3.7908F, -0.8917F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9029F, -1.4127F, -0.0087F, 0.0F, 0.0F));

		PartDefinition neck14_r2 = neck2.addOrReplaceChild("neck14_r2", CubeListBuilder.create().texOffs(90, 77).mirror().addBox(-1.1259F, 0.8239F, -1.3642F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.772F, 0.6897F, -0.8579F, -0.1598F, -0.1513F, 0.0909F));

		PartDefinition cube_r21 = neck2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(125, 25).mirror().addBox(-0.3947F, -0.8692F, -1.3787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.772F, 0.6897F, -0.8579F, 1.5286F, 0.0342F, 0.4329F));

		PartDefinition cube_r22 = neck2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(9, 131).mirror().addBox(-0.6593F, -1.7881F, 0.9628F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.772F, 0.6897F, -0.8579F, 1.5843F, 0.0793F, 0.6077F));

		PartDefinition cube_r23 = neck2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(93, 124).mirror().addBox(-0.6637F, -2.5529F, 0.5728F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5486F, 0.0689F, -4.0818F, 1.5411F, 0.1091F, 0.6036F));

		PartDefinition cube_r24 = neck2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(125, 20).mirror().addBox(-0.465F, -1.9655F, -1.2498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5486F, 0.0689F, -4.0818F, 1.6119F, 0.0561F, 0.4308F));

		PartDefinition neck13_r1 = neck2.addOrReplaceChild("neck13_r1", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.2714F, -0.5212F, -2.8594F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7333F, 1.6571F, -4.2745F, -0.2998F, -0.1463F, 0.0987F));

		PartDefinition cube_r25 = neck2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 131).addBox(-0.3407F, -1.7881F, 0.9628F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.772F, 0.6897F, -0.8579F, 1.5843F, -0.0793F, -0.6077F));

		PartDefinition cube_r26 = neck2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(125, 25).addBox(-0.6053F, -0.8692F, -1.3787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.772F, 0.6897F, -0.8579F, 1.5286F, -0.0342F, -0.4329F));

		PartDefinition neck13_r2 = neck2.addOrReplaceChild("neck13_r2", CubeListBuilder.create().texOffs(90, 77).addBox(0.1259F, 0.8239F, -1.3642F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.772F, 0.6897F, -0.8579F, -0.1598F, 0.1513F, -0.0909F));

		PartDefinition neck12_r1 = neck2.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(0, 90).addBox(-0.7286F, -0.5212F, -2.8594F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7333F, 1.6571F, -4.2745F, -0.2998F, 0.1463F, -0.0987F));

		PartDefinition cube_r27 = neck2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(125, 20).addBox(-0.535F, -1.9655F, -1.2498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5486F, 0.0689F, -4.0818F, 1.6119F, -0.0561F, -0.4308F));

		PartDefinition cube_r28 = neck2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(93, 124).addBox(-0.3363F, -2.5529F, 0.5728F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5486F, 0.0689F, -4.0818F, 1.5411F, -0.1091F, -0.6036F));

		PartDefinition Neckfront_r18 = neck2.addOrReplaceChild("Neckfront_r18", CubeListBuilder.create().texOffs(136, 13).addBox(0.0F, -3.8863F, 2.6912F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5766F, -8.363F, -0.096F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2481F, -8.0364F, -0.0797F, 0.1679F, -0.0996F));

		PartDefinition Neckmiddle_r1 = neck3.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(19, 91).addBox(-1.0F, -0.4F, 1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3264F, -8.1798F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckfront_r19 = neck3.addOrReplaceChild("Neckfront_r19", CubeListBuilder.create().texOffs(7, 137).addBox(0.0F, -3.3863F, -1.2088F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3402F, -0.653F, -0.096F, 0.0F, 0.0F));

		PartDefinition neck12_r2 = neck3.addOrReplaceChild("neck12_r2", CubeListBuilder.create().texOffs(83, 44).mirror().addBox(-0.5F, -0.6F, -3.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3198F, 1.2094F, 0.1254F, -0.23F, -0.1463F, 0.0987F));

		PartDefinition cube_r29 = neck3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(138, 89).mirror().addBox(-0.465F, -1.2655F, -0.7498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5486F, 0.0053F, -0.7717F, 1.481F, 0.0561F, 0.4308F));

		PartDefinition cube_r30 = neck3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(36, 125).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7784F, -1.3792F, -0.6539F, 1.4974F, 0.1091F, 0.6036F));

		PartDefinition neck11_r1 = neck3.addOrReplaceChild("neck11_r1", CubeListBuilder.create().texOffs(90, 87).mirror().addBox(-0.5F, -0.4F, -3.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3198F, 0.4094F, -3.5746F, -0.3173F, -0.1463F, 0.0987F));

		PartDefinition cube_r31 = neck3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(29, 49).mirror().addBox(-0.465F, -1.6655F, -0.7498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5486F, -0.7947F, -4.4717F, 1.3501F, 0.0561F, 0.4308F));

		PartDefinition cube_r32 = neck3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(100, 124).mirror().addBox(-0.6637F, -2.4529F, 0.5728F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5486F, -0.7947F, -4.4717F, 1.4102F, 0.1091F, 0.6036F));

		PartDefinition cube_r33 = neck3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(36, 125).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7784F, -1.3792F, -0.6539F, 1.4974F, -0.1091F, -0.6036F));

		PartDefinition cube_r34 = neck3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(138, 89).addBox(-0.535F, -1.2655F, -0.7498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5486F, 0.0053F, -0.7717F, 1.481F, -0.0561F, -0.4308F));

		PartDefinition neck11_r2 = neck3.addOrReplaceChild("neck11_r2", CubeListBuilder.create().texOffs(83, 44).addBox(-0.5F, -0.6F, -3.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3198F, 1.2094F, 0.1254F, -0.23F, 0.1463F, -0.0987F));

		PartDefinition cube_r35 = neck3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(100, 124).addBox(-0.3363F, -2.4529F, 0.5728F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5486F, -0.7947F, -4.4717F, 1.4102F, -0.1091F, -0.6036F));

		PartDefinition cube_r36 = neck3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(29, 49).addBox(-0.535F, -1.6655F, -0.7498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5486F, -0.7947F, -4.4717F, 1.3501F, -0.0561F, -0.4308F));

		PartDefinition neck10_r1 = neck3.addOrReplaceChild("neck10_r1", CubeListBuilder.create().texOffs(90, 87).addBox(-0.5F, -0.4F, -3.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3198F, 0.4094F, -3.5746F, -0.3173F, 0.1463F, -0.0987F));

		PartDefinition Neckfront_r20 = neck3.addOrReplaceChild("Neckfront_r20", CubeListBuilder.create().texOffs(96, 107).addBox(0.0F, -1.6F, -0.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2171F, -5.0545F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8823F, -7.2989F, 0.0996F, 0.4649F, 0.3196F));

		PartDefinition Neckmiddlefront_r1 = neck4.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0F, -0.7F, 0.8F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2732F, -9.1078F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Neckfront_r21 = neck4.addOrReplaceChild("Neckfront_r21", CubeListBuilder.create().texOffs(12, 139).addBox(0.0F, -1.3F, 5.6F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(138, 134).addBox(0.0F, -1.3F, 2.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 110).addBox(0.0F, -1.2F, -1.2F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9599F, -6.4983F, -0.3054F, 0.0F, 0.0F));

		PartDefinition neck10_r2 = neck4.addOrReplaceChild("neck10_r2", CubeListBuilder.create().texOffs(38, 93).mirror().addBox(-0.5F, -0.4F, -2.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1793F, 1.2164F, -0.5194F, -0.4923F, -0.1322F, 0.117F));

		PartDefinition cube_r37 = neck4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(121, 138).mirror().addBox(-0.5F, -1.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3843F, -0.0698F, -1.144F, 1.2305F, 0.1102F, 0.4208F));

		PartDefinition cube_r38 = neck4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(93, 131).mirror().addBox(-0.5114F, -1.6737F, 0.2115F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4645F, -0.1577F, -0.9314F, 1.3007F, 0.1826F, 0.5876F));

		PartDefinition cube_r39 = neck4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(131, 87).mirror().addBox(-0.5114F, -1.6737F, 0.2115F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4645F, -1.1577F, -3.9314F, 1.3007F, 0.1826F, 0.5876F));

		PartDefinition cube_r40 = neck4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(36, 118).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3843F, -1.0698F, -4.144F, 1.2305F, 0.1102F, 0.4208F));

		PartDefinition neck9_r1 = neck4.addOrReplaceChild("neck9_r1", CubeListBuilder.create().texOffs(104, 57).mirror().addBox(-0.5F, -0.7F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1793F, 0.2164F, -3.5194F, -0.5359F, -0.1322F, 0.117F));

		PartDefinition neck8_r1 = neck4.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(104, 49).mirror().addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1793F, -0.9836F, -7.2194F, -0.4487F, -0.1322F, 0.117F));

		PartDefinition cube_r41 = neck4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 109).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3843F, -2.2698F, -7.844F, 1.2305F, 0.1102F, 0.4208F));

		PartDefinition cube_r42 = neck4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(27, 131).mirror().addBox(-0.5114F, -1.7737F, 0.2115F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4645F, -2.0577F, -6.9314F, 1.3007F, 0.1826F, 0.5876F));

		PartDefinition cube_r43 = neck4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(93, 131).addBox(-0.4886F, -1.6737F, 0.2115F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4645F, -0.1577F, -0.9314F, 1.3007F, -0.1826F, -0.5876F));

		PartDefinition cube_r44 = neck4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(121, 138).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3843F, -0.0698F, -1.144F, 1.2305F, -0.1102F, -0.4208F));

		PartDefinition neck9_r2 = neck4.addOrReplaceChild("neck9_r2", CubeListBuilder.create().texOffs(38, 93).addBox(-0.5F, -0.4F, -2.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1793F, 1.2164F, -0.5194F, -0.4923F, 0.1322F, -0.117F));

		PartDefinition neck8_r2 = neck4.addOrReplaceChild("neck8_r2", CubeListBuilder.create().texOffs(104, 57).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1793F, 0.2164F, -3.5194F, -0.5359F, 0.1322F, -0.117F));

		PartDefinition cube_r45 = neck4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(36, 118).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3843F, -1.0698F, -4.144F, 1.2305F, -0.1102F, -0.4208F));

		PartDefinition cube_r46 = neck4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(131, 87).addBox(-0.4886F, -1.6737F, 0.2115F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4645F, -1.1577F, -3.9314F, 1.3007F, -0.1826F, -0.5876F));

		PartDefinition cube_r47 = neck4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 131).addBox(-0.4886F, -1.7737F, 0.2115F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4645F, -2.0577F, -6.9314F, 1.3007F, -0.1826F, -0.5876F));

		PartDefinition cube_r48 = neck4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(28, 109).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3843F, -2.2698F, -7.844F, 1.2305F, -0.1102F, -0.4208F));

		PartDefinition neck7_r1 = neck4.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(104, 49).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1793F, -0.9836F, -7.2194F, -0.4487F, 0.1322F, -0.117F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1104F, -8.1092F, 0.2932F, 0.2818F, 0.1271F));

		PartDefinition Neckfront_r22 = neck5.addOrReplaceChild("Neckfront_r22", CubeListBuilder.create().texOffs(17, 141).addBox(0.0F, -0.7369F, -1.2933F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0603F, -0.664F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Neckfront_r23 = neck5.addOrReplaceChild("Neckfront_r23", CubeListBuilder.create().texOffs(42, 142).addBox(0.0F, -1.0848F, -0.9736F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7018F, -3.4737F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck7_r2 = neck5.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(41, 115).mirror().addBox(-0.4818F, -0.1954F, -0.9414F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1458F, -0.0872F, -1.9184F, -0.6328F, -0.1878F, 0.1887F));

		PartDefinition cube_r49 = neck5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(62, 31).mirror().addBox(-0.5114F, -1.6737F, 0.9115F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4645F, 0.3229F, -1.3218F, 1.3007F, 0.1826F, 0.5876F));

		PartDefinition cube_r50 = neck5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(77, 148).mirror().addBox(-0.395F, -0.6737F, -0.6348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4645F, -0.4771F, -2.0218F, 1.2503F, 0.0537F, 0.1675F));

		PartDefinition neck6_r1 = neck5.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(27, 126).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1498F, -0.0602F, -3.9032F, -0.4559F, -0.2301F, 0.1336F));

		PartDefinition cube_r51 = neck5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 148).mirror().addBox(-1.2394F, 0.3629F, -2.0191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3886F, -2.2551F, -5.0774F, 1.5084F, 0.0088F, 0.1756F));

		PartDefinition cube_r52 = neck5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(144, 55).mirror().addBox(-0.6917F, -0.2371F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3886F, -1.5551F, -4.4774F, 1.5179F, 0.0343F, 0.6113F));

		PartDefinition cube_r53 = neck5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(77, 148).addBox(-0.605F, -0.6737F, -0.6348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4645F, -0.4771F, -2.0218F, 1.2503F, -0.0537F, -0.1675F));

		PartDefinition cube_r54 = neck5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(62, 31).addBox(-0.4886F, -1.6737F, 0.9115F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4645F, 0.3229F, -1.3218F, 1.3007F, -0.1826F, -0.5876F));

		PartDefinition neck6_r2 = neck5.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(41, 115).addBox(-0.5182F, -0.1954F, -0.9414F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1458F, -0.0872F, -1.9184F, -0.6328F, 0.1878F, -0.1887F));

		PartDefinition cube_r55 = neck5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(144, 55).addBox(-0.3084F, -0.2371F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3886F, -1.5551F, -4.4774F, 1.5179F, -0.0343F, -0.6113F));

		PartDefinition cube_r56 = neck5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(72, 148).addBox(0.2394F, 0.3629F, -2.0191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3886F, -2.2551F, -5.0774F, 1.5084F, -0.0088F, -0.1756F));

		PartDefinition neck5_r1 = neck5.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(27, 126).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1498F, -0.0602F, -3.9032F, -0.4559F, 0.2301F, -0.1336F));

		PartDefinition Neckfront_r24 = neck5.addOrReplaceChild("Neckfront_r24", CubeListBuilder.create().texOffs(0, 120).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9581F, -2.6678F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Neckfront_r25 = neck5.addOrReplaceChild("Neckfront_r25", CubeListBuilder.create().texOffs(11, 126).addBox(-1.0F, -0.4F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.9927F, -5.2982F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Throatpouch = neck5.addOrReplaceChild("Throatpouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2073F, 1.2018F, 0.1911F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create().texOffs(47, 148).addBox(1.055F, -1.3111F, -2.828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 148).addBox(1.265F, -1.3111F, -2.828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 148).mirror().addBox(-2.265F, -1.3111F, -2.828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 148).mirror().addBox(-2.055F, -1.3111F, -2.828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1988F, -5.7982F, 0.3004F, 0.419F, 0.1254F));

		PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(120, 121).addBox(-2.5F, 0.0052F, -1.0342F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -1.6483F, -0.0169F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(36, 121).addBox(-2.5F, 0.0052F, -0.6342F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.3173F, 0.4877F, -0.576F, 0.0F, 0.0F));

		PartDefinition Head_r3 = head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(57, 148).mirror().addBox(-1.5F, 0.0052F, -0.0342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(57, 148).addBox(1.5F, 0.0052F, -0.0342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -1.0739F, 0.7912F, -1.2654F, 0.0F, 0.0F));

		PartDefinition Head_r4 = head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(141, 13).mirror().addBox(-1.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(141, 13).addBox(1.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.621F, -0.3519F, -0.829F, 0.0F, 0.0F));

		PartDefinition Head_r5 = head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(148, 15).mirror().addBox(-2.0F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(148, 15).addBox(1.05F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.5639F, -0.1752F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r6 = head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(148, 24).mirror().addBox(-2.0F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(148, 24).addBox(1.05F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.025F, 0.0971F, -1.2519F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Head_r7 = head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(148, 18).mirror().addBox(-2.0F, -0.95F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(148, 21).mirror().addBox(-2.0F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(148, 21).addBox(1.05F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F))
				.texOffs(148, 18).addBox(1.05F, -0.95F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 1.3751F, -1.3337F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Head_r8 = head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(142, 143).mirror().addBox(-2.0F, -0.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(142, 143).addBox(1.05F, -0.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.025F, 0.3435F, 0.0837F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Head_r9 = head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(32, 148).mirror().addBox(-1.6F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 148).addBox(1.45F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.425F, -0.1888F, -1.3896F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Head_r10 = head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(148, 30).mirror().addBox(-1.6F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(148, 30).addBox(1.45F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.425F, -1.5977F, -1.5129F, 0.8727F, 0.0F, 0.0F));

		PartDefinition Head_r11 = head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(148, 27).mirror().addBox(-1.6F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(148, 27).addBox(1.45F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.425F, -1.6413F, -2.5119F, 1.5272F, 0.0F, 0.0F));

		PartDefinition Head_r12 = head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(27, 148).mirror().addBox(-1.6F, 0.4F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 148).addBox(1.45F, 0.4F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.425F, -1.1979F, -3.8436F, 1.9635F, 0.0F, 0.0F));

		PartDefinition Head_r13 = head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(143, 25).mirror().addBox(-1.6F, 0.6F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(143, 25).addBox(1.45F, 0.6F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(121, 8).addBox(-1.575F, 0.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.425F, -2.1534F, -1.8797F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r14 = head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(0, 144).mirror().addBox(-0.5F, -1.5848F, -0.3165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.1425F, -3.4213F, 0.3054F, 0.0F, 0.0873F));

		PartDefinition Head_r15 = head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(5, 144).mirror().addBox(-0.5F, -0.4018F, -0.3665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.1425F, -3.4213F, -0.2182F, 0.0F, 0.0873F));

		PartDefinition Head_r16 = head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(119, 52).addBox(-2.5F, -2.9948F, -0.8342F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7564F, -0.18F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Head_r17 = head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(0, 126).addBox(-2.5F, -0.9698F, 0.9658F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(121, 12).addBox(-2.5F, -1.9698F, -0.0342F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.081F, -2.7365F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r18 = head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(134, 26).addBox(-2.0F, -0.9948F, -0.0092F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.1218F, -2.7613F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Head_r19 = head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(96, 113).addBox(-2.5F, 2.0052F, -0.5342F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, -2.2239F, -1.0389F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r20 = head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(118, 83).addBox(-2.5F, -0.9F, -0.6F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1239F, -1.5389F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r21 = head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(5, 144).addBox(-0.5F, -0.4018F, -0.3665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8F, -0.1425F, -3.4213F, -0.2182F, 0.0F, -0.0873F));

		PartDefinition Head_r22 = head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(0, 144).addBox(-0.5F, -1.5848F, -0.3165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.1425F, -3.4213F, 0.3054F, 0.0F, -0.0873F));

		PartDefinition Head_r23 = head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(132, 9).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9798F, -2.8645F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Upperjawbase = head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3539F, -4.0389F, 0.2972F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r1 = Upperjawbase.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(131, 130).addBox(-3.5F, -2.0249F, -0.9952F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0F, 2.5661F, -1.3235F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r2 = Upperjawbase.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(133, 117).addBox(-2.0F, -0.4499F, -0.0452F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.6354F, -1.6181F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r3 = Upperjawbase.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(81, 77).addBox(-2.0F, -0.0499F, -0.0452F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.6354F, -1.6181F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r4 = Upperjawbase.addOrReplaceChild("Upperjawbase_r4", CubeListBuilder.create().texOffs(131, 121).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.653F, -4.1052F, -0.624F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r5 = Upperjawbase.addOrReplaceChild("Upperjawbase_r5", CubeListBuilder.create().texOffs(139, 105).addBox(-0.5F, -1.783F, -1.9533F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 2.4653F, -2.3156F, -0.5367F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r6 = Upperjawbase.addOrReplaceChild("Upperjawbase_r6", CubeListBuilder.create().texOffs(65, 142).addBox(-0.5F, -0.3275F, 1.384F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.5F, 2.4153F, -3.5406F, 0.1265F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r7 = Upperjawbase.addOrReplaceChild("Upperjawbase_r7", CubeListBuilder.create().texOffs(142, 63).addBox(-0.5F, -0.7408F, 0.6751F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 2.4153F, -3.5406F, -0.1353F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r8 = Upperjawbase.addOrReplaceChild("Upperjawbase_r8", CubeListBuilder.create().texOffs(142, 60).addBox(-0.5F, -0.8979F, -0.1091F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.5F, 2.4153F, -3.5406F, -0.3534F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r9 = Upperjawbase.addOrReplaceChild("Upperjawbase_r9", CubeListBuilder.create().texOffs(139, 101).addBox(-0.5F, -1.9956F, -0.9775F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 2.4653F, -2.3156F, -0.3185F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r10 = Upperjawbase.addOrReplaceChild("Upperjawbase_r10", CubeListBuilder.create().texOffs(93, 40).addBox(-2.0F, -0.45F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7328F, -0.2819F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawbase.addOrReplaceChild("Upperjawfront", CubeListBuilder.create().texOffs(73, 139).addBox(-0.5F, -2.4F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.3821F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(126, 69).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -3.2191F, -1.2264F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(140, 71).addBox(-2.0F, -1.2F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 97).addBox(-1.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.4F, -1.8F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r3 = Upperjawfront.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(137, 114).addBox(-1.5F, -0.45F, -0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.9F, -1.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.5F, -3.7F, 0.1911F, 0.0F, 0.0F));

		PartDefinition Upperbackteeth = Upperjawbase.addOrReplaceChild("Upperbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8F, -4.0F, 0.2546F, 0.0F, 0.0F));

		PartDefinition Nosebase = head.addOrReplaceChild("Nosebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -2.1239F, -4.0389F, 0.1485F, 0.0F, 0.0F));

		PartDefinition Nosebase_r1 = Nosebase.addOrReplaceChild("Nosebase_r1", CubeListBuilder.create().texOffs(108, 147).addBox(-0.885F, -0.2F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.3685F, -1.1856F, 0.2723F, 0.2104F, 0.0582F));

		PartDefinition Nosebase_r2 = Nosebase.addOrReplaceChild("Nosebase_r2", CubeListBuilder.create().texOffs(147, 69).addBox(-1.01F, -0.2F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5F, 0.3685F, -1.1856F, 0.2662F, 0.0F, 0.0F));

		PartDefinition Nosebase_r3 = Nosebase.addOrReplaceChild("Nosebase_r3", CubeListBuilder.create().texOffs(134, 125).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8713F, 2.3958F, -2.5327F, 0.1294F, -0.2452F, 0.0262F));

		PartDefinition Nosebase_r4 = Nosebase.addOrReplaceChild("Nosebase_r4", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-0.3F, -0.75F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1247F, 2.5911F, -1.282F, 0.9692F, -0.0189F, 0.0582F));

		PartDefinition Nosebase_r5 = Nosebase.addOrReplaceChild("Nosebase_r5", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(-0.5F, 0.3953F, -0.0555F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.81F, 1.7202F, -1.2349F, 1.6636F, -0.274F, 0.6583F));

		PartDefinition Nosebase_r6 = Nosebase.addOrReplaceChild("Nosebase_r6", CubeListBuilder.create().texOffs(127, 5).mirror().addBox(-0.5F, 0.0162F, 0.0559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.81F, 1.7202F, -1.2349F, 1.0963F, -0.274F, 0.6583F));

		PartDefinition Nosebase_r7 = Nosebase.addOrReplaceChild("Nosebase_r7", CubeListBuilder.create().texOffs(114, 34).mirror().addBox(-0.5F, -0.1697F, -1.5663F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.81F, 1.7202F, -1.2349F, 0.4855F, -0.274F, 0.6583F));

		PartDefinition Nosebase_r8 = Nosebase.addOrReplaceChild("Nosebase_r8", CubeListBuilder.create().texOffs(132, 5).mirror().addBox(-1.3F, -0.2F, 0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 5).addBox(-0.1F, -0.2F, 0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 34).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.31F, 0.3684F, -1.1606F, 0.0044F, 0.0F, 0.0F));

		PartDefinition Nosebase_r9 = Nosebase.addOrReplaceChild("Nosebase_r9", CubeListBuilder.create().texOffs(87, 142).mirror().addBox(-0.2F, -0.2F, 0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(145, 90).mirror().addBox(-0.2F, -0.2F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4437F, 0.3684F, -1.1447F, 0.0055F, -0.6545F, -0.0033F));

		PartDefinition Nosebase_r10 = Nosebase.addOrReplaceChild("Nosebase_r10", CubeListBuilder.create().texOffs(147, 66).mirror().addBox(-0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.31F, 1.1268F, -2.4043F, 0.5693F, 0.1846F, 0.1169F));

		PartDefinition Nosebase_r11 = Nosebase.addOrReplaceChild("Nosebase_r11", CubeListBuilder.create().texOffs(80, 140).mirror().addBox(-0.315F, -0.2F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.32F, 1.0446F, -2.8389F, 0.8062F, 0.2404F, 0.2433F));

		PartDefinition Nosebase_r12 = Nosebase.addOrReplaceChild("Nosebase_r12", CubeListBuilder.create().texOffs(80, 140).addBox(-0.685F, -0.2F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 1.0446F, -2.8389F, 0.8062F, -0.2404F, -0.2433F));

		PartDefinition Nosebase_r13 = Nosebase.addOrReplaceChild("Nosebase_r13", CubeListBuilder.create().texOffs(140, 67).addBox(-0.51F, -0.2F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 1.0446F, -2.8389F, 0.7767F, 0.0F, 0.0F));

		PartDefinition Nosebase_r14 = Nosebase.addOrReplaceChild("Nosebase_r14", CubeListBuilder.create().texOffs(147, 66).addBox(-0.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.29F, 1.1268F, -2.4043F, 0.5693F, -0.1846F, -0.1169F));

		PartDefinition Nosebase_r15 = Nosebase.addOrReplaceChild("Nosebase_r15", CubeListBuilder.create().texOffs(42, 147).addBox(-1.01F, -0.2F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.7266F, -2.3301F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Nosebase_r16 = Nosebase.addOrReplaceChild("Nosebase_r16", CubeListBuilder.create().texOffs(15, 147).addBox(-1.01F, -0.2F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.5F, 0.5264F, -1.7645F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Nosebase_r17 = Nosebase.addOrReplaceChild("Nosebase_r17", CubeListBuilder.create().texOffs(87, 142).addBox(-1.8F, -0.2F, 0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(145, 90).addBox(-0.8F, -0.2F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4237F, 0.3684F, -1.1447F, 0.0055F, 0.6545F, 0.0033F));

		PartDefinition Nosebase_r18 = Nosebase.addOrReplaceChild("Nosebase_r18", CubeListBuilder.create().texOffs(134, 125).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8513F, 2.3958F, -2.5327F, 0.1294F, 0.2452F, -0.0262F));

		PartDefinition Nosebase_r19 = Nosebase.addOrReplaceChild("Nosebase_r19", CubeListBuilder.create().texOffs(49, 102).addBox(-0.5F, 0.3953F, -0.0555F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.79F, 1.7202F, -1.2349F, 1.6636F, 0.274F, -0.6583F));

		PartDefinition Nosebase_r20 = Nosebase.addOrReplaceChild("Nosebase_r20", CubeListBuilder.create().texOffs(127, 5).addBox(-0.5F, 0.0162F, 0.0559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.79F, 1.7202F, -1.2349F, 1.0963F, 0.274F, -0.6583F));

		PartDefinition Nosebase_r21 = Nosebase.addOrReplaceChild("Nosebase_r21", CubeListBuilder.create().texOffs(0, 140).addBox(-0.7F, -0.75F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1047F, 2.5911F, -1.282F, 0.9692F, 0.0189F, -0.0582F));

		PartDefinition Nosebase_r22 = Nosebase.addOrReplaceChild("Nosebase_r22", CubeListBuilder.create().texOffs(114, 34).addBox(-0.5F, -0.1697F, -1.5663F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.79F, 1.7202F, -1.2349F, 0.4855F, 0.274F, -0.6583F));

		PartDefinition Nosefront = Nosebase.addOrReplaceChild("Nosefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.4033F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(148, 3).addBox(1.125F, -0.4818F, -2.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(148, 3).mirror().addBox(-2.125F, -0.4818F, -2.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7311F, 0.2209F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = jaw.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(148, 6).mirror().addBox(-0.225F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(148, 6).addBox(3.025F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9F, 0.3673F, -1.1768F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r2 = jaw.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(148, 9).mirror().addBox(-0.225F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(148, 9).addBox(3.025F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.9F, -0.1325F, -1.2924F, -0.2923F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r3 = jaw.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(148, 12).mirror().addBox(0.275F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(148, 12).addBox(2.525F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9F, -0.136F, -3.3458F, 0.3447F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r4 = jaw.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(125, 125).mirror().addBox(0.275F, -0.5F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(125, 125).addBox(2.525F, -0.5F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.9F, 0.7503F, -3.3729F, 0.1702F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r5 = jaw.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(141, 9).mirror().addBox(-0.5F, -0.625F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(141, 9).addBox(2.75F, -0.625F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.625F, 0.7182F, -1.8136F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r6 = jaw.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(5, 148).mirror().addBox(0.275F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(5, 148).addBox(2.525F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.9F, -0.3318F, -2.6636F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = jaw.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.2972F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r1 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(141, 5).mirror().addBox(0.0F, -0.575F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(141, 5).addBox(2.0F, -0.575F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, 0.7436F, 0.2393F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.0F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(0, 148).mirror().addBox(-0.5F, -0.825F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 148).addBox(0.2F, -0.825F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, -1.4405F, -1.0388F, 0.4887F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r2 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(147, 143).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(147, 143).addBox(0.2F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, -1.517F, -0.312F, 0.5498F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r3 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r3", CubeListBuilder.create().texOffs(146, 147).mirror().addBox(-0.5F, -0.825F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(146, 147).addBox(0.2F, -0.825F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.35F, -1.044F, -0.4619F, 0.9687F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r4 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r4", CubeListBuilder.create().texOffs(103, 140).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)).mirror(false)
				.texOffs(103, 140).addBox(0.7F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.6F, -2.1473F, 1.6315F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r5 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r5", CubeListBuilder.create().texOffs(141, 147).mirror().addBox(-0.5F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(141, 147).addBox(0.7F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.6F, -2.0514F, 0.2598F, 0.288F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r6 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r6", CubeListBuilder.create().texOffs(147, 130).mirror().addBox(-0.5F, -0.225F, 1.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 140).mirror().addBox(-0.5F, -0.225F, -0.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(147, 130).addBox(0.7F, -0.225F, 1.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 140).addBox(0.7F, -0.225F, -0.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -2.5497F, 0.6067F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r7 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r7", CubeListBuilder.create().texOffs(147, 120).mirror().addBox(-0.5F, -0.325F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(147, 120).addBox(0.1F, -0.325F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -2.5637F, -0.9932F, 0.5149F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r8 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r8", CubeListBuilder.create().texOffs(140, 120).mirror().addBox(-0.5F, -0.225F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(140, 120).addBox(0.7F, -0.225F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.6F, -2.5637F, -0.9932F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r9 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r9", CubeListBuilder.create().texOffs(61, 125).mirror().addBox(-0.5F, -0.175F, -1.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(61, 125).addBox(0.7F, -0.175F, -1.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.6F, -2.2033F, -0.0766F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawtruefront = Lowerjawfront.addOrReplaceChild("Lowerjawtruefront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.0F, -3.7F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Lowerjawteeth = Lowerjawfront.addOrReplaceChild("Lowerjawteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -4.3F, -0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope = Lowerjawmiddle.addOrReplaceChild("Lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 2.0F, -2.8F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r1 = Lowerjawslope.addOrReplaceChild("Lowerjawslope_r1", CubeListBuilder.create().texOffs(135, 140).addBox(-0.875F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -1.096F, 4.9659F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r2 = Lowerjawslope.addOrReplaceChild("Lowerjawslope_r2", CubeListBuilder.create().texOffs(140, 130).addBox(-1.0F, -0.825F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -1.0838F, 3.2879F, -0.1004F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r3 = Lowerjawslope.addOrReplaceChild("Lowerjawslope_r3", CubeListBuilder.create().texOffs(116, 125).addBox(-0.775F, -0.8797F, -0.3469F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.9F, -1.0885F, 5.1647F, 0.1876F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope2 = Lowerjawmiddle.addOrReplaceChild("Lowerjawslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 2.0F, -2.8F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r4 = Lowerjawslope2.addOrReplaceChild("Lowerjawslope_r4", CubeListBuilder.create().texOffs(135, 140).mirror().addBox(-0.125F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.096F, 4.9659F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r5 = Lowerjawslope2.addOrReplaceChild("Lowerjawslope_r5", CubeListBuilder.create().texOffs(140, 130).mirror().addBox(0.0F, -0.825F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.0838F, 3.2879F, -0.1004F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r6 = Lowerjawslope2.addOrReplaceChild("Lowerjawslope_r6", CubeListBuilder.create().texOffs(116, 125).mirror().addBox(-0.225F, -0.8797F, -0.3469F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -1.0885F, 5.1647F, 0.1876F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope = chest.addOrReplaceChild("Bodyfrontslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.5582F, -13.1299F, -0.4458F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r1 = Bodyfrontslope.addOrReplaceChild("Bodyfrontslope_r1", CubeListBuilder.create().texOffs(67, 91).addBox(-4.5F, 1.7706F, 0.3977F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 3.9F, 6.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r2 = Bodyfrontslope.addOrReplaceChild("Bodyfrontslope_r2", CubeListBuilder.create().texOffs(83, 115).addBox(-2.0F, -0.9F, -2.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0412F, 4.39F, -0.48F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r3 = Bodyfrontslope.addOrReplaceChild("Bodyfrontslope_r3", CubeListBuilder.create().texOffs(108, 16).addBox(-2.0F, 1.6F, 0.9F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.5F, 3.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r4 = Bodyfrontslope.addOrReplaceChild("Bodyfrontslope_r4", CubeListBuilder.create().texOffs(141, 21).mirror().addBox(-0.2809F, -0.4223F, -1.8808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5816F, 2.0172F, 0.4538F, -1.2766F, 0.6783F, -0.7427F));

		PartDefinition Bodyfrontslope_r5 = Bodyfrontslope.addOrReplaceChild("Bodyfrontslope_r5", CubeListBuilder.create().texOffs(141, 21).addBox(-0.7191F, -0.4223F, -1.8808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5816F, 2.0172F, 0.4538F, -1.2766F, -0.6783F, 0.7427F));

		PartDefinition Bodyfrontslope_r6 = Bodyfrontslope.addOrReplaceChild("Bodyfrontslope_r6", CubeListBuilder.create().texOffs(141, 17).addBox(-1.0816F, -0.3093F, -0.3252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5816F, 2.0172F, 0.4538F, -0.6981F, 0.0F, 0.0F));

		PartDefinition upperarmleft = chest.addOrReplaceChild("upperarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9F, 12.5239F, -7.7711F, 0.1061F, 0.0F, 0.0F));

		PartDefinition cube_r57 = upperarmleft.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(96, 137).addBox(-0.5F, -0.975F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.9123F, 3.9646F, -0.6256F, 2.0274F, -0.4042F, 0.0118F));

		PartDefinition cube_r58 = upperarmleft.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 148).addBox(-0.5F, -0.075F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7155F, -0.7589F, -0.0351F, 0.6573F, -0.4042F, 0.0118F));

		PartDefinition cube_r59 = upperarmleft.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(55, 93).addBox(-0.5F, -0.8F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8238F, 1.736F, -0.3571F, 1.3118F, -0.4042F, 0.0118F));

		PartDefinition Leftupperarm_r1 = upperarmleft.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(18, 116).addBox(-0.5F, -4.6194F, -1.9761F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 7.7664F, 0.977F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = upperarmleft.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(126, 64).addBox(-0.5F, -2.1194F, -1.7761F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 9.9642F, 1.2005F, 0.192F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = upperarmleft.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(71, 116).addBox(-0.5F, 3.8806F, -2.5761F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 5.9861F, 0.7824F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = upperarmleft.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(47, 123).addBox(-0.5F, 0.051F, -2.0145F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 1.6402F, 0.978F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = upperarmleft.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(122, 88).addBox(-0.5F, -0.349F, -0.7145F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.4741F, 0.6467F, -0.4974F, 0.0F, 0.0F));

		PartDefinition lowerarmleft = upperarmleft.addOrReplaceChild("lowerarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.3226F, 0.4916F, -0.1934F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r1 = lowerarmleft.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(16, 131).addBox(-0.55F, -2.1415F, -0.9066F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 31).addBox(-0.55F, 3.8585F, -1.9066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(144, 109).addBox(-0.55F, 2.0585F, -1.9066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 0).addBox(-0.95F, -4.661F, -0.0965F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 131).addBox(-0.95F, -4.661F, -0.6965F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.05F, 4.3695F, 0.2965F, 0.0436F, 0.7854F, 0.0F));

		PartDefinition Leftlowerarm_r2 = lowerarmleft.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(103, 144).addBox(-0.55F, 0.2898F, -1.6216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(137, 55).addBox(-0.95F, -1.747F, -0.9485F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 137).addBox(-0.95F, -1.747F, -0.1485F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.05F, 4.3695F, 0.2965F, -0.0873F, 0.7854F, 0.0F));

		PartDefinition Leftlowerarm_r3 = lowerarmleft.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(82, 144).addBox(-0.55F, -1.3812F, -1.6384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.05F, 4.3695F, 0.2965F, 0.2182F, 0.7854F, 0.0F));

		PartDefinition Leftlowerarm_r4 = lowerarmleft.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(52, 132).addBox(-0.55F, -4.2789F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.05F, 4.3695F, 0.2965F, 0.3054F, 0.7854F, 0.0F));

		PartDefinition Leftlowerarm_r5 = lowerarmleft.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(89, 137).addBox(-0.95F, 0.8766F, -0.5152F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 137).addBox(-0.95F, 0.8766F, -1.3152F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(34, 132).addBox(-0.95F, -4.559F, 0.8285F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.05F, 4.3695F, 0.2965F, 0.2618F, 0.7854F, 0.0F));

		PartDefinition Leftlowerarm_r6 = lowerarmleft.addOrReplaceChild("Leftlowerarm_r6", CubeListBuilder.create().texOffs(135, 50).addBox(-0.95F, -4.7366F, -0.412F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.05F, 4.3695F, 0.2965F, -0.2618F, 0.7854F, 0.0F));

		PartDefinition handleft = lowerarmleft.addOrReplaceChild("handleft", CubeListBuilder.create().texOffs(52, 115).addBox(1.0F, 1.1337F, 0.6258F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 116).addBox(-2.0F, 1.1337F, 0.6258F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(70, 122).addBox(-1.5F, 1.1337F, -0.3742F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 8.4811F, -1.6829F, 0.1733F, 0.0F, 0.0F));

		PartDefinition Leftclaw = handleft.addOrReplaceChild("Leftclaw", CubeListBuilder.create().texOffs(77, 144).addBox(0.9983F, 1.0255F, -0.8204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.28F, 1.4337F, 1.3758F, 0.3183F, 0.2122F, 0.5732F));

		PartDefinition upperarmright = chest.addOrReplaceChild("upperarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9F, 12.5239F, -7.7711F, 0.6297F, 0.0F, 0.0F));

		PartDefinition cube_r60 = upperarmright.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(114, 138).addBox(-0.5F, -0.975F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.9123F, 3.9646F, -0.6256F, 2.0274F, 0.4042F, -0.0118F));

		PartDefinition cube_r61 = upperarmright.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(148, 93).addBox(-0.5F, -0.075F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7155F, -0.7589F, -0.0351F, 0.6573F, 0.4042F, -0.0118F));

		PartDefinition cube_r62 = upperarmright.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(114, 25).addBox(-0.5F, -0.8F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8238F, 1.736F, -0.3571F, 1.3118F, 0.4042F, -0.0118F));

		PartDefinition Rightupperarm_r1 = upperarmright.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(27, 118).addBox(-1.5F, -4.6194F, -1.9761F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 7.7664F, 0.977F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = upperarmright.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(127, 0).addBox(-1.5F, -2.1194F, -1.7761F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 9.9642F, 1.2005F, 0.192F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = upperarmright.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(109, 117).addBox(-1.5F, 3.8806F, -2.5761F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 5.9861F, 0.7824F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = upperarmright.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(123, 111).addBox(-1.5F, 0.051F, -2.0145F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 1.6402F, 0.978F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = upperarmright.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(107, 123).addBox(-1.5F, -0.349F, -0.7145F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4741F, 0.6467F, -0.4974F, 0.0F, 0.0F));

		PartDefinition lowerarmright = upperarmright.addOrReplaceChild("lowerarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.3226F, 0.4916F, -0.8479F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r1 = lowerarmright.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(132, 109).addBox(-0.45F, -2.1415F, -0.9066F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 93).addBox(-0.45F, 3.8585F, -1.9066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(10, 145).addBox(-0.45F, 2.0585F, -1.9066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 138).addBox(-1.05F, -4.661F, -0.0965F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 97).addBox(-1.05F, -4.661F, -0.6965F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.05F, 4.3695F, 0.2965F, 0.0436F, -0.7854F, 0.0F));

		PartDefinition Rightlowerarm_r2 = lowerarmright.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(133, 144).addBox(-0.45F, 0.2898F, -1.6216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(138, 74).addBox(-1.05F, -1.747F, -0.9485F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 138).addBox(-1.05F, -1.747F, -0.1485F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.05F, 4.3695F, 0.2965F, -0.0873F, -0.7854F, 0.0F));

		PartDefinition Rightlowerarm_r3 = lowerarmright.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(128, 144).addBox(-0.45F, -1.3812F, -1.6384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.05F, 4.3695F, 0.2965F, 0.2182F, -0.7854F, 0.0F));

		PartDefinition Rightlowerarm_r4 = lowerarmright.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(132, 103).addBox(-0.45F, -4.2789F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.05F, 4.3695F, 0.2965F, 0.3054F, -0.7854F, 0.0F));

		PartDefinition Rightlowerarm_r5 = lowerarmright.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(138, 84).addBox(-1.05F, 0.8766F, -0.5152F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 79).addBox(-1.05F, 0.8766F, -1.3152F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(132, 93).addBox(-1.05F, -4.559F, 0.8285F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.05F, 4.3695F, 0.2965F, 0.2618F, -0.7854F, 0.0F));

		PartDefinition Rightlowerarm_r6 = lowerarmright.addOrReplaceChild("Rightlowerarm_r6", CubeListBuilder.create().texOffs(137, 109).addBox(-1.05F, -4.7366F, -0.412F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.05F, 4.3695F, 0.2965F, -0.2618F, -0.7854F, 0.0F));

		PartDefinition handright = lowerarmright.addOrReplaceChild("handright", CubeListBuilder.create().texOffs(61, 117).addBox(-2.0F, 1.1337F, 0.6258F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(117, 65).addBox(1.0F, 1.1337F, 0.6258F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(123, 105).addBox(-1.5F, 1.1337F, -0.3742F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 8.4811F, -1.6829F, 1.046F, 0.0F, 0.0F));

		PartDefinition Rightclaw = handright.addOrReplaceChild("Rightclaw", CubeListBuilder.create().texOffs(144, 113).addBox(-1.9983F, 1.0255F, -0.8204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.28F, 1.4337F, 1.3758F, 0.3183F, -0.2122F, -0.5732F));

		PartDefinition Tail1 = Hip.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.435F, 6.5883F, 0.1064F, -0.5297F, 0.0324F));

		PartDefinition Tail5_r1 = Tail1.addOrReplaceChild("Tail5_r1", CubeListBuilder.create().texOffs(68, 149).addBox(0.0F, -1.4322F, -0.4265F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8642F, 9.2274F, 0.8727F, 0.0F, 0.0F));

		PartDefinition Tail4_r1 = Tail1.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(65, 149).addBox(0.0F, 1.1835F, 3.2814F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 149).addBox(0.0F, -0.2769F, 1.8824F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 58).addBox(0.0F, -1.5F, 0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8947F, 2.6722F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Tail1_r1 = Tail1.addOrReplaceChild("Tail1_r1", CubeListBuilder.create().texOffs(56, 66).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2931F, 0.0306F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Neckfront_r26 = Tail1.addOrReplaceChild("Neckfront_r26", CubeListBuilder.create().texOffs(100, 142).addBox(0.0F, -4.5F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1136F, 8.0495F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neckfront_r27 = Tail1.addOrReplaceChild("Neckfront_r27", CubeListBuilder.create().texOffs(97, 142).addBox(0.0F, -4.7F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9806F, 5.9882F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neckfront_r28 = Tail1.addOrReplaceChild("Neckfront_r28", CubeListBuilder.create().texOffs(94, 142).addBox(0.0F, -5.0384F, 0.0083F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9871F, 4.0575F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neckfront_r29 = Tail1.addOrReplaceChild("Neckfront_r29", CubeListBuilder.create().texOffs(39, 136).addBox(0.0F, -5.2384F, 0.0083F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8693F, 2.0213F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Neckfront_r30 = Tail1.addOrReplaceChild("Neckfront_r30", CubeListBuilder.create().texOffs(52, 67).addBox(0.0F, -5.8F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7516F, -0.0149F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3444F, 10.0623F, -0.2823F, -0.4211F, 0.118F));

		PartDefinition Tail2_r1 = Tail2.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.547F, 0.2856F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Neckfront_r31 = Tail2.addOrReplaceChild("Neckfront_r31", CubeListBuilder.create().texOffs(129, 148).addBox(0.0F, -2.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0094F, 10.19F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neckfront_r32 = Tail2.addOrReplaceChild("Neckfront_r32", CubeListBuilder.create().texOffs(126, 148).addBox(0.0F, -2.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6867F, 8.1754F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neckfront_r33 = Tail2.addOrReplaceChild("Neckfront_r33", CubeListBuilder.create().texOffs(138, 144).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4052F, 5.6871F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Neckfront_r34 = Tail2.addOrReplaceChild("Neckfront_r34", CubeListBuilder.create().texOffs(39, 144).addBox(0.0F, -4.5384F, 18.6583F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8737F, -14.9174F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neckfront_r35 = Tail2.addOrReplaceChild("Neckfront_r35", CubeListBuilder.create().texOffs(118, 143).addBox(0.0F, -3.7F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.111F, 2.2123F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tail10_r1 = Tail2.addOrReplaceChild("Tail10_r1", CubeListBuilder.create().texOffs(148, 123).addBox(0.0F, 9.0797F, 14.6131F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 148).addBox(0.0F, 8.0533F, 12.8936F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 148).addBox(0.0F, 6.8504F, 11.268F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 119).addBox(0.0F, 5.9124F, 9.5016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 91).addBox(0.0F, 3.9743F, 7.7352F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8408F, -7.5728F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Neckfront_r36 = Tail2.addOrReplaceChild("Neckfront_r36", CubeListBuilder.create().texOffs(39, 15).addBox(0.0F, -4.0384F, -0.0917F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.701F, -0.1763F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3732F, 11.739F, -0.0047F, -0.6109F, 0.0027F));

		PartDefinition Tail9_r1 = Tail3.addOrReplaceChild("Tail9_r1", CubeListBuilder.create().texOffs(122, 149).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6531F, 9.6165F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail8_r1 = Tail3.addOrReplaceChild("Tail8_r1", CubeListBuilder.create().texOffs(119, 149).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2714F, 7.6533F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail7_r1 = Tail3.addOrReplaceChild("Tail7_r1", CubeListBuilder.create().texOffs(149, 116).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8898F, 5.69F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Tail6_r1 = Tail3.addOrReplaceChild("Tail6_r1", CubeListBuilder.create().texOffs(116, 149).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5082F, 3.7268F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail5_r2 = Tail3.addOrReplaceChild("Tail5_r2", CubeListBuilder.create().texOffs(149, 112).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1266F, 1.7635F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Tail4_r2 = Tail3.addOrReplaceChild("Tail4_r2", CubeListBuilder.create().texOffs(149, 53).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.745F, -0.1997F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tail3_r1 = Tail3.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(29, 53).addBox(-1.0F, -0.3F, -0.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4696F, -0.0443F, 0.192F, 0.0F, 0.0F));

		PartDefinition Tail16_r1 = Tail3.addOrReplaceChild("Tail16_r1", CubeListBuilder.create().texOffs(52, 76).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.038F, 10.4872F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tail15_r1 = Tail3.addOrReplaceChild("Tail15_r1", CubeListBuilder.create().texOffs(149, 33).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4117F, 8.5878F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail14_r1 = Tail3.addOrReplaceChild("Tail14_r1", CubeListBuilder.create().texOffs(10, 149).addBox(0.0F, -1.4754F, -0.4031F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2146F, 6.6884F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail13_r1 = Tail3.addOrReplaceChild("Tail13_r1", CubeListBuilder.create().texOffs(135, 148).addBox(0.0F, 12.351F, 19.6757F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(148, 133).addBox(0.0F, 11.2722F, 17.9798F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 148).addBox(0.0F, 10.2827F, 16.2388F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2183F, -19.3028F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9193F, 10.7802F, 0.1458F, -0.4323F, -0.0614F));

		PartDefinition Tail9_r2 = Tail4.addOrReplaceChild("Tail9_r2", CubeListBuilder.create().texOffs(144, 150).addBox(0.0F, -0.725F, 8.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 150).addBox(0.0F, -0.775F, 6.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 150).addBox(0.0F, -0.85F, 4.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 64).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6326F, -0.0324F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Tail6_r2 = Tail4.addOrReplaceChild("Tail6_r2", CubeListBuilder.create().texOffs(109, 150).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1845F, 2.8216F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail5_r3 = Tail4.addOrReplaceChild("Tail5_r3", CubeListBuilder.create().texOffs(106, 150).addBox(0.0F, -1.2F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7666F, 1.0594F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Tail21_r1 = Tail4.addOrReplaceChild("Tail21_r1", CubeListBuilder.create().texOffs(66, 130).addBox(0.0F, -0.2272F, 5.4957F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 129).addBox(0.0F, -0.1515F, 3.4971F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 64).addBox(0.0F, -0.0757F, 1.4986F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 134).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6887F, 3.7011F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Tail17_r1 = Tail4.addOrReplaceChild("Tail17_r1", CubeListBuilder.create().texOffs(43, 125).addBox(0.0F, -0.7477F, -1.0257F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5161F, 2.1294F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1236F, 10.7552F, -0.3321F, -0.4356F, -0.0256F));

		PartDefinition Tail11_r1 = Tail5.addOrReplaceChild("Tail11_r1", CubeListBuilder.create().texOffs(150, 90).addBox(0.0F, -0.9F, 9.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 87).addBox(0.0F, -0.9F, 7.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 84).addBox(0.0F, -0.9F, 5.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 81).addBox(0.0F, -0.9F, 3.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 78).addBox(0.0F, -0.9F, 1.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 75).addBox(0.0F, -0.9F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 31).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.371F, 0.2185F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Tail26_r1 = Tail5.addOrReplaceChild("Tail26_r1", CubeListBuilder.create().texOffs(103, 137).addBox(0.0F, 0.0038F, 15.4878F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 134).addBox(0.0F, -0.0479F, 13.4885F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 74).addBox(0.0F, -0.0995F, 11.4891F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 61).addBox(0.0F, -0.0512F, 9.4898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 13).addBox(0.0F, -0.1028F, 7.4905F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6922F, -6.798F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6888F, 10.9103F, -0.2844F, -0.5605F, 0.0688F));

		PartDefinition Tail11_r2 = Tail6.addOrReplaceChild("Tail11_r2", CubeListBuilder.create().texOffs(150, 72).addBox(0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 150).addBox(0.0F, -1.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 150).addBox(0.0F, -0.9F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 150).addBox(0.0F, -0.9F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 150).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 79).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1454F, -0.0325F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail31_r1 = Tail6.addOrReplaceChild("Tail31_r1", CubeListBuilder.create().texOffs(19, 150).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0448F, 8.0764F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Tail30_r1 = Tail6.addOrReplaceChild("Tail30_r1", CubeListBuilder.create().texOffs(16, 150).addBox(0.0F, 0.5038F, 23.4878F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 150).addBox(0.0F, 0.3038F, 21.4878F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 0).addBox(0.0F, 0.2038F, 19.4878F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 138).addBox(0.0F, 0.2038F, 17.4878F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.381F, -17.7083F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Tailclub5 = Tail6.addOrReplaceChild("Tailclub5", CubeListBuilder.create().texOffs(41, 112).addBox(-1.0F, -0.7F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5239F, 10.0392F, -0.2608F, 0.0422F, -0.0112F));

		PartDefinition Tailclub_r1 = Tailclub5.addOrReplaceChild("Tailclub_r1", CubeListBuilder.create().texOffs(149, 50).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5894F, 1.0895F, 1.9635F, 0.0F, 0.0F));

		PartDefinition Tailclub_r2 = Tailclub5.addOrReplaceChild("Tailclub_r2", CubeListBuilder.create().texOffs(149, 47).addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.689F, 1.0982F, 1.6144F, 0.0F, 0.0F));

		PartDefinition Tailclub_r3 = Tailclub5.addOrReplaceChild("Tailclub_r3", CubeListBuilder.create().texOffs(149, 44).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9085F, 0.8407F, 2.138F, 0.0F, 0.0F));

		PartDefinition Tailclub_r4 = Tailclub5.addOrReplaceChild("Tailclub_r4", CubeListBuilder.create().texOffs(149, 41).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5665F, 1.7804F, 1.2217F, 0.0F, 0.0F));

		PartDefinition Tailclub_r5 = Tailclub5.addOrReplaceChild("Tailclub_r5", CubeListBuilder.create().texOffs(143, 0).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.4122F, 2.5235F, 2.0071F, 0.0F, 0.0F));

		PartDefinition Tailclub_r6 = Tailclub5.addOrReplaceChild("Tailclub_r6", CubeListBuilder.create().texOffs(142, 140).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4122F, 3.5235F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Tailclub_r7 = Tailclub5.addOrReplaceChild("Tailclub_r7", CubeListBuilder.create().texOffs(121, 142).addBox(-1.5F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(149, 38).addBox(-1.0F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4677F, 3.9331F, 0.9163F, 0.0F, 0.0F));

		PartDefinition Tailclub_r8 = Tailclub5.addOrReplaceChild("Tailclub_r8", CubeListBuilder.create().texOffs(142, 117).addBox(-1.5F, -1.0F, -0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.3F, 3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperlegleft = Hip.addOrReplaceChild("upperlegleft", CubeListBuilder.create().texOffs(74, 100).addBox(-1.0F, 1.2188F, -0.75F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(110, 111).addBox(-1.5F, -0.7812F, -1.25F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 2.0692F, 0.8294F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = upperlegleft.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(119, 57).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 17.0009F, 1.0224F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = upperlegleft.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(15, 109).addBox(-1.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 15.2188F, 0.75F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerlegleft = upperlegleft.addOrReplaceChild("lowerlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 17.9106F, -0.8253F, 0.4517F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = lowerlegleft.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(87, 149).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F))
				.texOffs(149, 63).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.2899F, 2.0305F, -1.5272F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = lowerlegleft.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(47, 143).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.7F, 3.0583F, 0.7711F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = lowerlegleft.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(34, 143).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 3.0583F, 0.7711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftshin_r4 = lowerlegleft.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(145, 74).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 9.0962F, 1.5084F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftshin_r5 = lowerlegleft.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(67, 145).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 9.0962F, 1.5084F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Leftshin_r6 = lowerlegleft.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(21, 133).addBox(-0.5F, -3.9F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7F, 6.9982F, 1.6F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftshin_r7 = lowerlegleft.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(62, 145).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5415F, -0.6891F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Leftshin_r8 = lowerlegleft.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(141, 124).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3563F, 0.0874F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftshin_r9 = lowerlegleft.addOrReplaceChild("Leftshin_r9", CubeListBuilder.create().texOffs(0, 134).addBox(0.0F, -2.8F, -2.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.0213F, 1.8741F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Leftshin_r10 = lowerlegleft.addOrReplaceChild("Leftshin_r10", CubeListBuilder.create().texOffs(96, 118).addBox(-2.0F, -2.8F, -1.9F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.0213F, 1.8741F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Leftshin_r11 = lowerlegleft.addOrReplaceChild("Leftshin_r11", CubeListBuilder.create().texOffs(0, 129).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 11.7656F, 0.1982F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Leftshin_r12 = lowerlegleft.addOrReplaceChild("Leftshin_r12", CubeListBuilder.create().texOffs(70, 128).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, 10.7744F, 0.526F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Leftshin_r13 = lowerlegleft.addOrReplaceChild("Leftshin_r13", CubeListBuilder.create().texOffs(62, 106).addBox(-1.5F, -4.0F, -1.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(118, 77).addBox(-2.0F, -7.0F, -1.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 7.0F, 1.3F, -0.0436F, 0.0F, 0.0F));

		PartDefinition footleft = lowerlegleft.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(93, 26).addBox(-2.5F, -0.7346F, -3.5986F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 11.2122F, -0.0985F, 0.263F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot_r1 = footleft.addOrReplaceChild("Lefthindfoot_r1", CubeListBuilder.create().texOffs(55, 100).addBox(-3.5F, -1.7F, -1.2F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.2654F, -5.0986F, -0.4363F, 0.0F, 0.0F));

		PartDefinition upperlegright = Hip.addOrReplaceChild("upperlegright", CubeListBuilder.create().texOffs(101, 97).addBox(-1.0F, 1.2188F, -0.75F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 112).addBox(-1.5F, -0.7812F, -1.25F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0692F, 0.8294F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r1 = upperlegright.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(82, 119).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 17.0009F, 1.0224F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = upperlegright.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(109, 88).addBox(-2.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 15.2188F, 0.75F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerlegright = upperlegright.addOrReplaceChild("lowerlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 17.9106F, -0.8253F, 0.3208F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = lowerlegright.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(97, 149).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F))
				.texOffs(92, 149).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 0.2899F, 2.0305F, -1.5272F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = lowerlegright.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(57, 143).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.7F, 3.0583F, 0.7711F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = lowerlegright.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(52, 143).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 3.0583F, 0.7711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightshin_r4 = lowerlegright.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(145, 86).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 9.0962F, 1.5084F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Rightshin_r5 = lowerlegright.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(145, 82).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 9.0962F, 1.5084F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Rightshin_r6 = lowerlegright.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(43, 134).addBox(-0.5F, -3.9F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7F, 6.9982F, 1.6F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightshin_r7 = lowerlegright.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(145, 78).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5415F, -0.6891F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Rightshin_r8 = lowerlegright.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(22, 142).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3563F, 0.0874F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightshin_r9 = lowerlegright.addOrReplaceChild("Rightshin_r9", CubeListBuilder.create().texOffs(134, 20).addBox(-1.0F, -2.8F, -2.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.0213F, 1.8741F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Rightshin_r10 = lowerlegright.addOrReplaceChild("Rightshin_r10", CubeListBuilder.create().texOffs(119, 46).addBox(-1.0F, -2.8F, -1.9F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.0213F, 1.8741F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Rightshin_r11 = lowerlegright.addOrReplaceChild("Rightshin_r11", CubeListBuilder.create().texOffs(129, 77).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 11.7656F, 0.1982F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Rightshin_r12 = lowerlegright.addOrReplaceChild("Rightshin_r12", CubeListBuilder.create().texOffs(43, 129).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 10.7744F, 0.526F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Rightshin_r13 = lowerlegright.addOrReplaceChild("Rightshin_r13", CubeListBuilder.create().texOffs(109, 77).addBox(-0.5F, -4.0F, -1.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(119, 40).addBox(-1.0F, -7.0F, -1.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 7.0F, 1.3F, -0.0436F, 0.0F, 0.0F));

		PartDefinition footright = lowerlegright.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(93, 33).addBox(-3.5F, -0.7346F, -3.5986F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 11.2122F, -0.0985F, -0.1297F, 0.0F, 0.0F));

		PartDefinition Righthindfoot_r1 = footright.addOrReplaceChild("Righthindfoot_r1", CubeListBuilder.create().texOffs(15, 101).addBox(-2.5F, -1.7F, -1.2F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 0.2654F, -5.0986F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone = Hip.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.8F, 4.6359F, 3.5126F));

		PartDefinition Hips_r2 = bone.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(146, 105).mirror().addBox(-1.0F, -1.8F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(142, 35).mirror().addBox(-1.0F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9107F, 1.6732F, 5.6526F, -0.4985F, 0.3527F, -0.0625F));

		PartDefinition Hips_r3 = bone.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(149, 109).mirror().addBox(-1.0F, -1.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6687F, 7.094F, -3.1604F, 0.733F, 0.0F, -0.4363F));

		PartDefinition Hips_r4 = bone.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(142, 47).mirror().addBox(-1.0F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5071F, 7.4405F, -5.4372F, 0.2531F, 0.0F, -0.4363F));

		PartDefinition Hips_r5 = bone.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(102, 65).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-7.3F, -0.0242F, -1.8665F, 0.4574F, 0.1178F, -0.2344F));

		PartDefinition Hips_r6 = bone.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(142, 51).mirror().addBox(-0.8F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.453F, 3.2675F, -2.3216F, -1.9691F, 0.051F, -0.3157F));

		PartDefinition Hips_r7 = bone.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(143, 134).mirror().addBox(-1.0F, -3.0F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6687F, 7.094F, -3.1604F, -0.1833F, 0.0F, -0.4363F));

		PartDefinition Hips_r8 = bone.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(142, 39).mirror().addBox(-1.0F, -0.8F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.2433F, 1.215F, 4.8283F, 0.0687F, 0.3527F, -0.0625F));

		PartDefinition Hips_r9 = bone.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(84, 129).mirror().addBox(-1.0F, -1.2F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6596F, 0.6077F, 1.0912F, -0.5091F, 0.3347F, 0.1295F));

		PartDefinition Hips_r10 = bone.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(108, 8).mirror().addBox(-5.0F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 8).addBox(1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, -2.3764F, -5.5082F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = bone.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(146, 101).mirror().addBox(-1.0F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(146, 101).addBox(5.0F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.3F, -4.8101F, 0.7571F, -0.8116F, 0.0F, 0.0F));

		PartDefinition Hips_r12 = bone.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(29, 142).mirror().addBox(-5.0F, 0.0047F, -0.9973F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 142).addBox(1.0F, 0.0047F, -0.9973F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, -4.4651F, -9.0186F, 1.5621F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = bone.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(87, 145).mirror().addBox(-5.0F, 0.0047F, -0.9973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(87, 145).addBox(1.0F, 0.0047F, -0.9973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.3F, -5.4162F, -8.7095F, 1.2566F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = bone.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(82, 134).mirror().addBox(-5.0F, 0.0047F, -1.9973F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(82, 134).addBox(1.0F, 0.0047F, -1.9973F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3F, -6.937F, -7.4106F, 0.8639F, 0.0F, 0.0F));

		PartDefinition Hips_r15 = bone.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(107, 134).mirror().addBox(-5.0F, -0.0108F, -2.0268F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(107, 134).addBox(1.0F, -0.0108F, -2.0268F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3F, -8.2178F, -3.7008F, 0.192F, 0.0F, 0.0F));

		PartDefinition Hips_r16 = bone.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(135, 38).mirror().addBox(-5.0F, 0.0505F, -2.0378F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(135, 38).addBox(1.0F, 0.0505F, -2.0378F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3F, -7.8524F, -0.7261F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Hips_r17 = bone.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(146, 97).mirror().addBox(-5.0F, -0.0495F, 0.3622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(22, 146).mirror().addBox(-5.0F, -0.0495F, -0.0378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(146, 97).addBox(1.0F, -0.0495F, 0.3622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(22, 146).addBox(1.0F, -0.0495F, -0.0378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.3F, -5.569F, 2.2643F, -1.6406F, 0.0F, 0.0F));

		PartDefinition Hips_r18 = bone.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(121, 145).mirror().addBox(-5.0F, -0.0495F, -0.0378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(121, 145).addBox(1.0F, -0.0495F, -0.0378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.3F, -6.4678F, 1.8259F, -1.117F, 0.0F, 0.0F));

		PartDefinition Hips_r19 = bone.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(113, 143).mirror().addBox(-5.0F, 0.0505F, -0.0378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(113, 143).addBox(1.0F, 0.0505F, -0.0378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3F, -7.2344F, 1.176F, -0.7679F, 0.0F, 0.0F));

		PartDefinition Hips_r20 = bone.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(107, 129).mirror().addBox(-1.0F, -0.7564F, 2.279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1F, 0.0F, 0.0F, -0.2367F, 0.3527F, -0.0625F));

		PartDefinition Hips_r21 = bone.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(135, 61).mirror().addBox(-1.0F, 0.0469F, -0.4157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.9F, 2.3089F, -3.5582F, -0.4014F, 0.0F, -0.4363F));

		PartDefinition Hips_r22 = bone.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(142, 43).mirror().addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.6596F, 0.6077F, 1.0912F, 0.2326F, 0.3347F, 0.1295F));

		PartDefinition Hips_r23 = bone.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(129, 82).mirror().addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7771F, 0.7504F, 3.4599F, -0.1495F, 0.3527F, -0.0625F));

		PartDefinition Hips_r24 = bone.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(135, 44).mirror().addBox(-1.0F, 2.9469F, -0.7157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.9F, 2.3089F, -3.5582F, -0.3142F, 0.0F, -0.4363F));

		PartDefinition Hips_r25 = bone.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(131, 134).mirror().addBox(-5.0F, 0.0505F, -2.0378F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(131, 134).addBox(1.0F, 0.0505F, -2.0378F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.3F, -7.2344F, 1.176F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Hips_r26 = bone.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(104, 40).mirror().addBox(-1.0F, 0.5518F, -0.341F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(104, 40).addBox(5.0F, 0.5518F, -0.341F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-6.3F, -1.0907F, -5.3941F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Hips_r27 = bone.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(83, 107).mirror().addBox(-5.0F, -1.0F, 0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(83, 107).addBox(1.0F, -1.0F, 0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3F, -3.4633F, -5.7704F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Hips_r28 = bone.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(72, 143).mirror().addBox(-5.0F, 0.0892F, -1.0268F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 143).addBox(1.0F, 0.0892F, -1.0268F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, -8.2916F, -2.6985F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Hips_r29 = bone.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(134, 32).mirror().addBox(-5.0F, 0.0047F, -1.8973F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(134, 32).addBox(1.0F, 0.0047F, -1.8973F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.3F, -7.7995F, -5.7177F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Hips_r30 = bone.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(34, 102).mirror().addBox(-5.0F, -1.6F, 5.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(34, 102).addBox(1.0F, -1.6F, 5.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.3F, -5.123F, -10.6903F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r31 = bone.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(107, 129).addBox(0.0F, -0.7564F, 2.279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -0.2367F, -0.3527F, 0.0625F));

		PartDefinition Hips_r32 = bone.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(135, 61).addBox(0.0F, 0.0469F, -0.4157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.7F, 2.3089F, -3.5582F, -0.4014F, 0.0F, 0.4363F));

		PartDefinition Hips_r33 = bone.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(142, 51).addBox(-0.2F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.147F, 3.2675F, -2.3216F, -1.9691F, -0.051F, 0.3157F));

		PartDefinition Hips_r34 = bone.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(143, 134).addBox(0.0F, -3.0F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9313F, 7.094F, -3.1604F, -0.1833F, 0.0F, 0.4363F));

		PartDefinition Hips_r35 = bone.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(149, 109).addBox(0.0F, -1.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.9313F, 7.094F, -3.1604F, 0.733F, 0.0F, 0.4363F));

		PartDefinition Hips_r36 = bone.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(142, 47).addBox(0.0F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0929F, 7.4405F, -5.4372F, 0.2531F, 0.0F, 0.4363F));

		PartDefinition Hips_r37 = bone.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(84, 129).addBox(0.0F, -1.2F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9404F, 0.6077F, 1.0912F, -0.5091F, -0.3347F, -0.1295F));

		PartDefinition Hips_r38 = bone.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(142, 43).addBox(0.0F, -0.2F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9404F, 0.6077F, 1.0912F, 0.2326F, -0.3347F, -0.1295F));

		PartDefinition Hips_r39 = bone.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(142, 39).addBox(0.0F, -0.8F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-3.3567F, 1.215F, 4.8283F, 0.0687F, -0.3527F, 0.0625F));

		PartDefinition Hips_r40 = bone.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(146, 105).addBox(0.0F, -1.8F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 35).addBox(0.0F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.6893F, 1.6732F, 5.6526F, -0.4985F, -0.3527F, 0.0625F));

		PartDefinition Hips_r41 = bone.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(129, 82).addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.8229F, 0.7504F, 3.4599F, -0.1495F, -0.3527F, 0.0625F));

		PartDefinition Hips_r42 = bone.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(135, 44).addBox(0.0F, 2.9469F, -0.7157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.7F, 2.3089F, -3.5582F, -0.3142F, 0.0F, 0.4363F));

		PartDefinition Hips_r43 = bone.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(102, 65).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, -0.0242F, -1.8665F, 0.4574F, -0.1178F, 0.2344F));

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