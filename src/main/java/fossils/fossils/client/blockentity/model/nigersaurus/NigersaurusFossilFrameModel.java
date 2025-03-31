package fossils.fossils.client.blockentity.model.nigersaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NigersaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bodymiddle;
	private final ModelPart bodyfront;
	private final ModelPart neckbase;
	private final ModelPart neckmiddlebase;
	private final ModelPart neckmiddlefront;
	private final ModelPart neckfront;
	private final ModelPart head;
	private final ModelPart lowerjawbase;
	private final ModelPart lowerjawmiddlebase;
	private final ModelPart lowerjawmiddlefront;
	private final ModelPart lowerjawfront;
	private final ModelPart lowerjawteeth;
	private final ModelPart lowerlip;
	private final ModelPart mouthslope;
	private final ModelPart upperjawbase;
	private final ModelPart upperjawmiddle;
	private final ModelPart upperjawfront;
	private final ModelPart leftupperjawside;
	private final ModelPart leftupperjawside2;
	private final ModelPart leftupperjawside6;
	private final ModelPart rightupperjawside;
	private final ModelPart upperjawteeth;
	private final ModelPart upperjawfront3;
	private final ModelPart leftupperjawside5;
	private final ModelPart rightupperjawside3;
	private final ModelPart upperjawteeth3;
	private final ModelPart upperjawfront2;
	private final ModelPart leftupperjawside3;
	private final ModelPart leftupperjawside4;
	private final ModelPart rightupperjawside2;
	private final ModelPart upperjawteeth2;
	private final ModelPart snoutslope;
	private final ModelPart headslopebase;
	private final ModelPart headslopemiddle;
	private final ModelPart headslopefront;
	private final ModelPart bone;
	private final ModelPart lefteye;
	private final ModelPart righteye;
	private final ModelPart neckflapfront;
	private final ModelPart neckskinfront;
	private final ModelPart neckflapmidfront;
	private final ModelPart neckskinmidfront;
	private final ModelPart neckflapmidbase;
	private final ModelPart neckskinmidbase;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg8;

	public NigersaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bodymiddle = this.hips.getChild("bodymiddle");
		this.bodyfront = this.bodymiddle.getChild("bodyfront");
		this.neckbase = this.bodyfront.getChild("neckbase");
		this.neckmiddlebase = this.neckbase.getChild("neckmiddlebase");
		this.neckmiddlefront = this.neckmiddlebase.getChild("neckmiddlefront");
		this.neckfront = this.neckmiddlefront.getChild("neckfront");
		this.head = this.neckfront.getChild("head");
		this.lowerjawbase = this.head.getChild("lowerjawbase");
		this.lowerjawmiddlebase = this.lowerjawbase.getChild("lowerjawmiddlebase");
		this.lowerjawmiddlefront = this.lowerjawmiddlebase.getChild("lowerjawmiddlefront");
		this.lowerjawfront = this.lowerjawmiddlefront.getChild("lowerjawfront");
		this.lowerjawteeth = this.lowerjawfront.getChild("lowerjawteeth");
		this.lowerlip = this.lowerjawfront.getChild("lowerlip");
		this.mouthslope = this.lowerjawmiddlebase.getChild("mouthslope");
		this.upperjawbase = this.head.getChild("upperjawbase");
		this.upperjawmiddle = this.upperjawbase.getChild("upperjawmiddle");
		this.upperjawfront = this.upperjawmiddle.getChild("upperjawfront");
		this.leftupperjawside = this.upperjawfront.getChild("leftupperjawside");
		this.leftupperjawside2 = this.upperjawfront.getChild("leftupperjawside2");
		this.leftupperjawside6 = this.upperjawfront.getChild("leftupperjawside6");
		this.rightupperjawside = this.upperjawfront.getChild("rightupperjawside");
		this.upperjawteeth = this.upperjawfront.getChild("upperjawteeth");
		this.upperjawfront3 = this.upperjawmiddle.getChild("upperjawfront3");
		this.leftupperjawside5 = this.upperjawfront3.getChild("leftupperjawside5");
		this.rightupperjawside3 = this.upperjawfront3.getChild("rightupperjawside3");
		this.upperjawteeth3 = this.upperjawfront3.getChild("upperjawteeth3");
		this.upperjawfront2 = this.upperjawmiddle.getChild("upperjawfront2");
		this.leftupperjawside3 = this.upperjawfront2.getChild("leftupperjawside3");
		this.leftupperjawside4 = this.upperjawfront2.getChild("leftupperjawside4");
		this.rightupperjawside2 = this.upperjawfront2.getChild("rightupperjawside2");
		this.upperjawteeth2 = this.upperjawfront2.getChild("upperjawteeth2");
		this.snoutslope = this.upperjawmiddle.getChild("snoutslope");
		this.headslopebase = this.head.getChild("headslopebase");
		this.headslopemiddle = this.headslopebase.getChild("headslopemiddle");
		this.headslopefront = this.headslopemiddle.getChild("headslopefront");
		this.bone = this.headslopebase.getChild("bone");
		this.lefteye = this.head.getChild("lefteye");
		this.righteye = this.head.getChild("righteye");
		this.neckflapfront = this.neckfront.getChild("neckflapfront");
		this.neckskinfront = this.neckflapfront.getChild("neckskinfront");
		this.neckflapmidfront = this.neckmiddlefront.getChild("neckflapmidfront");
		this.neckskinmidfront = this.neckflapmidfront.getChild("neckskinmidfront");
		this.neckflapmidbase = this.neckmiddlebase.getChild("neckflapmidbase");
		this.neckskinmidbase = this.neckflapmidbase.getChild("neckskinmidbase");
		this.leftArm = this.bodyfront.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.bodyfront.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg3 = this.leftLeg.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg8 = this.leftLeg4.getChild("leftLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg3 = this.rightLeg.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg8 = this.rightLeg4.getChild("rightLeg8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -34.0F, 13.1F, 1.0F, 34.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-0.5F, -30.0F, -15.6F, 1.0F, 30.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-15.8F, -9.0F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(-0.5F, -8.0F, 28.2F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -33.0F, -15.1F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.2F, 15.0F, -0.0188F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -1.007F, 0.1001F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bodymiddle = hips.addOrReplaceChild("bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -7.7F, 0.2583F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r1 = bodymiddle.addOrReplaceChild("bodymiddle_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.9371F, 0.9492F, 1.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9957F, -18.7643F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bodyfront = bodymiddle.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7957F, -17.7643F, 0.1274F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(79, 11).addBox(-0.5F, -0.5749F, -0.0301F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7111F, -11.8942F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neckbase = bodyfront.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2592F, -11.4602F, -0.0813F, 0.2134F, -0.0418F));

		PartDefinition neckbase_r1 = neckbase.addOrReplaceChild("neckbase_r1", CubeListBuilder.create().texOffs(1, 92).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2505F, -10.5942F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neckmiddlebase = neckbase.addOrReplaceChild("neckmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3505F, -10.6942F, 0.3113F, 0.2179F, 0.0107F));

		PartDefinition neckmiddlebase_r1 = neckmiddlebase.addOrReplaceChild("neckmiddlebase_r1", CubeListBuilder.create().texOffs(88, 83).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.8539F, -10.3082F, 0.0F, -0.0349F, 0.0F));

		PartDefinition neckmiddlefront = neckmiddlebase.addOrReplaceChild("neckmiddlefront", CubeListBuilder.create().texOffs(110, 32).addBox(-0.5F, 0.1546F, -7.013F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3461F, -10.7082F, 0.2412F, 0.4567F, -0.1684F));

		PartDefinition neckfront = neckmiddlefront.addOrReplaceChild("neckfront", CubeListBuilder.create().texOffs(128, 24).addBox(-0.5F, 0.2788F, -4.6931F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3454F, -7.013F, 0.2218F, 0.0511F, -0.0646F));

		PartDefinition neckfront_r1 = neckfront.addOrReplaceChild("neckfront_r1", CubeListBuilder.create().texOffs(131, 107).addBox(-0.5F, 0.2F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0788F, -4.6931F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neckfront.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4988F, -8.869F, -0.2859F, 0.1645F, -0.25F));

		PartDefinition lowerjawbase = head.addOrReplaceChild("lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 2.1827F, 0.0487F, 0.6196F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlebase = lowerjawbase.addOrReplaceChild("lowerjawmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.2F, -1.4F, 0.7217F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront = lowerjawmiddlebase.addOrReplaceChild("lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.3609F, 0.0F, 0.0F));

		PartDefinition lowerjawfront = lowerjawmiddlefront.addOrReplaceChild("lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 1.0F, -1.0F, -0.2972F, 0.0F, 0.0F));

		PartDefinition lowerjawteeth = lowerjawfront.addOrReplaceChild("lowerjawteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, -1.0F, -0.8491F, 0.0F, 0.0F));

		PartDefinition lowerlip = lowerjawfront.addOrReplaceChild("lowerlip", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.02F, -0.58F, -0.0494F, 0.0F, 0.0F));

		PartDefinition mouthslope = lowerjawmiddlebase.addOrReplaceChild("mouthslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.09F, 0.0F, -2.0F, 0.8491F, 0.0F, 0.0F));

		PartDefinition upperjawbase = head.addOrReplaceChild("upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2897F, -2.5512F, 0.743F, 0.0F, 0.0F));

		PartDefinition upperjawmiddle = upperjawbase.addOrReplaceChild("upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition upperjawfront = upperjawmiddle.addOrReplaceChild("upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition leftupperjawside = upperjawfront.addOrReplaceChild("leftupperjawside", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, -0.5F, 0.6F, -0.8067F, 0.0424F, 0.3396F));

		PartDefinition leftupperjawside2 = upperjawfront.addOrReplaceChild("leftupperjawside2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, -0.5F, 0.6F, -0.8067F, 0.0424F, 0.3396F));

		PartDefinition leftupperjawside6 = upperjawfront.addOrReplaceChild("leftupperjawside6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition rightupperjawside = upperjawfront.addOrReplaceChild("rightupperjawside", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition upperjawteeth = upperjawfront.addOrReplaceChild("upperjawteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -0.95F, -0.8067F, 0.0F, 0.0F));

		PartDefinition upperjawfront3 = upperjawmiddle.addOrReplaceChild("upperjawfront3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition leftupperjawside5 = upperjawfront3.addOrReplaceChild("leftupperjawside5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition rightupperjawside3 = upperjawfront3.addOrReplaceChild("rightupperjawside3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, -0.5F, 0.6F, -0.8067F, 0.0424F, 0.3396F));

		PartDefinition upperjawteeth3 = upperjawfront3.addOrReplaceChild("upperjawteeth3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -0.95F, -0.8067F, 0.0F, 0.0F));

		PartDefinition upperjawfront2 = upperjawmiddle.addOrReplaceChild("upperjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition leftupperjawside3 = upperjawfront2.addOrReplaceChild("leftupperjawside3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition leftupperjawside4 = upperjawfront2.addOrReplaceChild("leftupperjawside4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition rightupperjawside2 = upperjawfront2.addOrReplaceChild("rightupperjawside2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, -0.5F, 0.6F, -0.8067F, 0.0424F, 0.3396F));

		PartDefinition upperjawteeth2 = upperjawfront2.addOrReplaceChild("upperjawteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -0.95F, -0.8067F, 0.0F, 0.0F));

		PartDefinition snoutslope = upperjawmiddle.addOrReplaceChild("snoutslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.0F, -2.0F, 0.7217F, 0.0F, 0.0F));

		PartDefinition headslopebase = head.addOrReplaceChild("headslopebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7103F, -2.5512F, 0.743F, 0.0F, 0.0F));

		PartDefinition headslopemiddle = headslopebase.addOrReplaceChild("headslopemiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, -3.0F, 0.2335F, 0.0F, 0.0F));

		PartDefinition headslopefront = headslopemiddle.addOrReplaceChild("headslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.522F, 0.0F, 0.0F));

		PartDefinition bone = headslopebase.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1F, 0.0F));

		PartDefinition lefteye = head.addOrReplaceChild("lefteye", CubeListBuilder.create(), PartPose.offset(2.12F, -0.3103F, -0.9512F));

		PartDefinition righteye = head.addOrReplaceChild("righteye", CubeListBuilder.create(), PartPose.offset(-2.12F, -0.3103F, -0.9512F));

		PartDefinition neckflapfront = neckfront.addOrReplaceChild("neckflapfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1788F, -6.9931F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinfront = neckflapfront.addOrReplaceChild("neckskinfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, 0.5F, -0.0848F, 0.0F, 0.0F));

		PartDefinition neckflapmidfront = neckmiddlefront.addOrReplaceChild("neckflapmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -0.2454F, -7.013F, -0.2335F, 0.0F, 0.0F));

		PartDefinition neckskinmidfront = neckflapmidfront.addOrReplaceChild("neckskinmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -0.5F, -0.0424F, 0.0F, 0.0F));

		PartDefinition neckflapmidbase = neckmiddlebase.addOrReplaceChild("neckflapmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0539F, -11.4082F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinmidbase = neckflapmidbase.addOrReplaceChild("neckskinmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 0.8F, -0.0637F, 0.0F, 0.0F));

		PartDefinition leftArm = bodyfront.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 10.6027F, -9.9017F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 11.6833F, -4.077F, -1.8239F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 7.9632F, -1.8005F, 0.9948F, 0.0F, 0.0F));

		PartDefinition rightArm = bodyfront.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 10.6027F, -9.9017F, 1.0036F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 11.6833F, -4.077F, -1.5184F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 7.9632F, -1.8005F, 0.3403F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(34, 67).addBox(-0.5F, -0.093F, -0.0489F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 6.2F, 0.0774F, -0.087F, -0.0067F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, 0.1226F, 0.0231F, 1.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2652F, 12.7171F, -0.1024F, -0.1736F, 0.0178F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(46, 49).addBox(-0.5F, 0.1188F, -0.1343F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0588F, 18.1182F, -0.0497F, -0.2179F, 0.0108F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(-2, 74).addBox(-0.5F, 0.2411F, -0.352F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3234F, 14.8564F, 0.0648F, -0.392F, -0.0248F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(78, 26).addBox(-0.5F, 0.0836F, 0.171F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1571F, 13.9274F, 0.0375F, -0.5233F, -0.0187F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(64, 67).addBox(-0.5F, 0.2382F, -0.1012F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1796F, 12.8562F, 0.0121F, 0.349F, 0.0041F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(48, 97).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.049F, 13.9722F, -0.1293F, 0.2597F, -0.0334F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(71, 108).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.01F, -0.0679F, 9.657F, -0.3485F, 0.2881F, -0.1029F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(92, 108).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.01F, 0.0128F, 8.9121F, -0.357F, 0.246F, -0.0906F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4F, 0.625F, -1.6625F, 1.1781F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.8525F, -18.1897F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0183F, 2.6466F, -12.0539F, 0.0119F, -0.0163F, 0.0386F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4F, 0.625F, -1.6625F, 1.5272F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.8525F, -18.1897F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0183F, 2.6466F, -12.0539F, -0.2499F, 0.0163F, -0.0386F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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