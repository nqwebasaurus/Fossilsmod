package fossils.fossils.client.blockentity.model.yangchuanosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YangchuanosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbaseflesh;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Noseslope;
	private final ModelPart Foreheadslope;
	private final ModelPart Lowerjaw;
	private final ModelPart Lowerjawmiddleback;
	private final ModelPart Lowerjawmiddlefront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawfrontslope;
	private final ModelPart Lowerteethfront;
	private final ModelPart Lowerteethmiddle;
	private final ModelPart Lowerteethback;
	private final ModelPart Lowerjawmiddleback2;
	private final ModelPart Lowerjawmiddlefront2;
	private final ModelPart Lowerjawfront2;
	private final ModelPart Lowerjawfrontslope2;
	private final ModelPart Lowerteethfront2;
	private final ModelPart Lowerteethmiddle2;
	private final ModelPart Lowerteethback2;
	private final ModelPart Lowerjawmidbaseslope;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;

	public YangchuanosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neckbaseflesh = this.Bodyfront.getChild("Neckbaseflesh");
		this.Neck1 = this.Neckbaseflesh.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.Upperjawbase = this.Head.getChild("Upperjawbase");
		this.Upperjawmiddle = this.Upperjawbase.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Noseslope = this.Upperjawfront.getChild("Noseslope");
		this.Foreheadslope = this.Noseslope.getChild("Foreheadslope");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Lowerjawmiddleback = this.Lowerjaw.getChild("Lowerjawmiddleback");
		this.Lowerjawmiddlefront = this.Lowerjawmiddleback.getChild("Lowerjawmiddlefront");
		this.Lowerjawfront = this.Lowerjawmiddlefront.getChild("Lowerjawfront");
		this.Lowerjawfrontslope = this.Lowerjawfront.getChild("Lowerjawfrontslope");
		this.Lowerteethfront = this.Lowerjawfront.getChild("Lowerteethfront");
		this.Lowerteethmiddle = this.Lowerjawmiddlefront.getChild("Lowerteethmiddle");
		this.Lowerteethback = this.Lowerjawmiddleback.getChild("Lowerteethback");
		this.Lowerjawmiddleback2 = this.Lowerjaw.getChild("Lowerjawmiddleback2");
		this.Lowerjawmiddlefront2 = this.Lowerjawmiddleback2.getChild("Lowerjawmiddlefront2");
		this.Lowerjawfront2 = this.Lowerjawmiddlefront2.getChild("Lowerjawfront2");
		this.Lowerjawfrontslope2 = this.Lowerjawfront2.getChild("Lowerjawfrontslope2");
		this.Lowerteethfront2 = this.Lowerjawfront2.getChild("Lowerteethfront2");
		this.Lowerteethmiddle2 = this.Lowerjawmiddlefront2.getChild("Lowerteethmiddle2");
		this.Lowerteethback2 = this.Lowerjawmiddleback2.getChild("Lowerteethback2");
		this.Lowerjawmidbaseslope = this.Lowerjaw.getChild("Lowerjawmidbaseslope");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone = this.Neck2.getChild("bone");
		this.Leftarm1 = this.Bodyfront.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.Bodyfront.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Leftleg1 = this.Hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.Hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -36.0F, 2.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -8.0F, -0.5F, 1.0F, 37.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(6.5F, -29.0F, -27.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -7.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.5F, -28.8F, -27.0F, -0.3478F, -0.0298F, 1.4888F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -35.0F, 2.5F, 0.0F, 0.0F, 1.4399F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.4945F, 3.074F, -0.1485F, 0.0F, -0.0863F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(38, 37).addBox(-0.5F, 0.1F, -6.5F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3F, 1.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9306F, -5.2316F, 0.13F, -0.2132F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(48, 78).addBox(-0.5F, 1.9714F, -7.217F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.9484F, -8.3905F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(68, 37).addBox(-0.5F, 0.9F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.9F, -8.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5657F, -15.5012F, 0.1055F, -0.1285F, -0.025F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(55, 88).addBox(-0.5F, 0.8173F, -4.2328F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3828F, -1.8672F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(73, 20).addBox(-0.5F, 1.9209F, -7.7454F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0172F, -6.0672F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neckbaseflesh = Bodyfront.addOrReplaceChild("Neckbaseflesh", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.8838F, -12.6609F, -0.6577F, -0.16F, 0.4449F));

		PartDefinition Neckbaseflesh_r1 = Neckbaseflesh.addOrReplaceChild("Neckbaseflesh_r1", CubeListBuilder.create().texOffs(109, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.01F, 1.0982F, -3.7576F, 0.0F, 0.1047F, 0.0F));

		PartDefinition Neck1 = Neckbaseflesh.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.9166F, -3.9756F, -0.3974F, 0.0F, 0.0F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(98, 56).addBox(-0.5F, 1.6777F, -5.2582F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4558F, 0.0898F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.7588F, -4.7931F, -0.4118F, -0.4486F, -0.1852F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(39, 88).addBox(-0.475F, -1.0F, -2.65F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.7458F, -3.0514F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, -0.9215F, -5.76F, 0.2016F, -0.4573F, -0.1513F));

		PartDefinition Neckmiddlefront_r1 = Neck3.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(119, 15).addBox(-0.51F, 1.2609F, 1.3952F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1818F, -4.043F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.9437F, -3.3084F, 0.3417F, -0.1143F, -0.0463F));

		PartDefinition Neckfront_r1 = Neck4.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(46, 97).addBox(-0.5F, 0.1999F, -1.5076F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9888F, -4.1054F, -0.2621F, -0.0506F, 0.0136F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8355F, -5.211F, -0.3551F, -0.3211F, -0.3969F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.5F, -5.3F, 0.3396F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawbase.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0F, -8.0F, -0.3609F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.8F, -0.1274F, 0.0F, 0.0F));

		PartDefinition Noseslope = Upperjawfront.addOrReplaceChild("Noseslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -6.0F, -3.0F, 0.8702F, 0.0F, 0.0F));

		PartDefinition Foreheadslope = Noseslope.addOrReplaceChild("Foreheadslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, 4.0F, -0.5095F, 0.0F, 0.0F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9122F, 1.2071F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback = Lowerjaw.addOrReplaceChild("Lowerjawmiddleback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.49F, -6.46F, 0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddlefront = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, 1.3394F, -4.8321F, -0.3623F, 0.0847F, -0.0227F));

		PartDefinition Lowerjawfront = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.35F, -0.1138F, -4.7785F, -0.1278F, 0.0843F, -0.0284F));

		PartDefinition Lowerjawfrontslope = Lowerjawfront.addOrReplaceChild("Lowerjawfrontslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.49F, 1.2F, -3.7F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Lowerteethfront = Lowerjawfront.addOrReplaceChild("Lowerteethfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -0.8F, -1.3F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Lowerteethmiddle = Lowerjawmiddlefront.addOrReplaceChild("Lowerteethmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -1.0F, -2.8F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerteethback = Lowerjawmiddleback.addOrReplaceChild("Lowerteethback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -3.7F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback2 = Lowerjaw.addOrReplaceChild("Lowerjawmiddleback2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.49F, -6.46F, 0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddlefront2 = Lowerjawmiddleback2.addOrReplaceChild("Lowerjawmiddlefront2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 1.3394F, -4.8321F, -0.3623F, -0.0847F, 0.0227F));

		PartDefinition Lowerjawfront2 = Lowerjawmiddlefront2.addOrReplaceChild("Lowerjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.35F, -0.1138F, -4.7785F, -0.1278F, -0.0843F, 0.0284F));

		PartDefinition Lowerjawfrontslope2 = Lowerjawfront2.addOrReplaceChild("Lowerjawfrontslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.49F, 1.2F, -3.7F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Lowerteethfront2 = Lowerjawfront2.addOrReplaceChild("Lowerteethfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -0.8F, -1.3F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Lowerteethmiddle2 = Lowerjawmiddlefront2.addOrReplaceChild("Lowerteethmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, -1.0F, -2.8F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerteethback2 = Lowerjawmiddleback2.addOrReplaceChild("Lowerteethback2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -3.7F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbaseslope = Lowerjaw.addOrReplaceChild("Lowerjawmidbaseslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 5.0F, -4.2F, 0.0283F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.7F, 1.6206F, -15.7724F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.7F, 1.6206F, -15.7724F));

		PartDefinition bone = Neck2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.01F, -1.3238F, -2.9455F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9632F, 10.0744F, -10.536F, 1.0616F, 0.0745F, -0.0818F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.523F, 6.2489F, -0.6839F, -1.1781F, 0.0F, 0.0F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4567F, 4.3953F, 0.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9632F, 10.0744F, -10.536F, 1.0616F, -0.0745F, 0.0818F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.523F, 6.2489F, -0.6839F, -1.1781F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4567F, 4.3953F, 0.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.8638F, 7.9496F, -0.0027F, 0.3515F, -0.1239F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(1, 20).addBox(-0.5F, 0.5F, -3.6F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.594F, 15.8016F, 0.0798F, 0.134F, -0.0327F));

		PartDefinition Tail3_r2 = Tail2.addOrReplaceChild("Tail3_r2", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(26, 53).addBox(-0.5F, 0.0943F, -0.3361F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5851F, 17.0004F, 0.0424F, 0.1813F, -0.1214F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, 3.7022F, -1.3F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F))
				.texOffs(50, 11).addBox(-0.5F, 3.7022F, 11.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.7472F, 12.8649F, -0.0215F, -0.1309F, 0.0028F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(54, 53).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.5F, 13.0F, -0.0848F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, 0.1901F, 0.1332F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9F, 10.7F, -0.2515F, -0.2228F, 0.1911F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, 0.2197F, -0.0233F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0099F, 11.0332F, -0.3584F, -0.2871F, 0.1057F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 6.397F, 0.7988F, -0.896F, -0.1847F, -0.2398F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 15.1524F, -2.2584F, 1.4493F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, 13.9347F, 2.1486F, -1.427F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 7.5077F, -1.0845F, 1.6085F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 6.397F, 0.7988F, 0.263F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 15.1524F, -2.2584F, 0.4398F, 0.0749F, -0.1578F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 13.9347F, 2.1486F, -0.5107F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 7.5077F, -1.0845F, 0.2073F, -0.0456F, 0.2134F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5F));

		return LayerDefinition.create(meshdefinition, 152, 152);
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