package fossils.fossils.client.blockentity.model.tyrannotitan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TyrannotitanFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bodymiddle;
	private final ModelPart bodyfront;
	private final ModelPart neckbase;
	private final ModelPart neckmiddlebase;
	private final ModelPart neckmiddleend;
	private final ModelPart neckend;
	private final ModelPart head;
	private final ModelPart upperjawbase;
	private final ModelPart upperjawmiddle;
	private final ModelPart upperjawfront;
	private final ModelPart nose;
	private final ModelPart rupperteethfront;
	private final ModelPart upperfrontteeth;
	private final ModelPart nasalridgebase;
	private final ModelPart rupperteethmidfront;
	private final ModelPart rightnasalridgebase;
	private final ModelPart rightnasalridgeend;
	private final ModelPart rupperteethmidback;
	private final ModelPart upperjawbase2;
	private final ModelPart upperjawmiddle2;
	private final ModelPart upperjawfront2;
	private final ModelPart nose2;
	private final ModelPart rupperteethfront2;
	private final ModelPart upperfrontteeth2;
	private final ModelPart nasalridgebase2;
	private final ModelPart rupperteethmidfront2;
	private final ModelPart leftnasalridgebase;
	private final ModelPart leftnasalridgeend;
	private final ModelPart rupperteethmidback2;
	private final ModelPart lowerjawback;
	private final ModelPart lowerjawmiddleback;
	private final ModelPart lowerjawmiddle;
	private final ModelPart lowerjawmiddlefront;
	private final ModelPart lowerjawend;
	private final ModelPart chin;
	private final ModelPart rlowerteethfront;
	private final ModelPart lowerfrontteeth;
	private final ModelPart rlowerteethmidfront;
	private final ModelPart rlowerteethmidback;
	private final ModelPart rlowerteethback;
	private final ModelPart lowerjawmiddleback2;
	private final ModelPart lowerjawmiddle2;
	private final ModelPart lowerjawmiddlefront2;
	private final ModelPart lowerjawend2;
	private final ModelPart chin2;
	private final ModelPart rlowerteethfront2;
	private final ModelPart lowerfrontteeth2;
	private final ModelPart rlowerteethmidfront2;
	private final ModelPart rlowerteethmidback2;
	private final ModelPart rlowerteethback2;
	private final ModelPart rightjawflank;
	private final ModelPart leftjawflank;
	private final ModelPart rightheadflank;
	private final ModelPart rightlacrimalcrest;
	private final ModelPart rightlacrimalfront;
	private final ModelPart rightlacrimalback;
	private final ModelPart leftheadflank;
	private final ModelPart leftlacrimalcrest;
	private final ModelPart leftlacrimalfront;
	private final ModelPart leftlacrimalback;
	private final ModelPart chestslope;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bellyslope;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tailridge2;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;

	public TyrannotitanFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bodymiddle = this.hips.getChild("bodymiddle");
		this.bodyfront = this.bodymiddle.getChild("bodyfront");
		this.neckbase = this.bodyfront.getChild("neckbase");
		this.neckmiddlebase = this.neckbase.getChild("neckmiddlebase");
		this.neckmiddleend = this.neckmiddlebase.getChild("neckmiddleend");
		this.neckend = this.neckmiddleend.getChild("neckend");
		this.head = this.neckend.getChild("head");
		this.upperjawbase = this.head.getChild("upperjawbase");
		this.upperjawmiddle = this.upperjawbase.getChild("upperjawmiddle");
		this.upperjawfront = this.upperjawmiddle.getChild("upperjawfront");
		this.nose = this.upperjawfront.getChild("nose");
		this.rupperteethfront = this.upperjawfront.getChild("rupperteethfront");
		this.upperfrontteeth = this.upperjawfront.getChild("upperfrontteeth");
		this.nasalridgebase = this.upperjawmiddle.getChild("nasalridgebase");
		this.rupperteethmidfront = this.upperjawmiddle.getChild("rupperteethmidfront");
		this.rightnasalridgebase = this.upperjawbase.getChild("rightnasalridgebase");
		this.rightnasalridgeend = this.rightnasalridgebase.getChild("rightnasalridgeend");
		this.rupperteethmidback = this.upperjawbase.getChild("rupperteethmidback");
		this.upperjawbase2 = this.head.getChild("upperjawbase2");
		this.upperjawmiddle2 = this.upperjawbase2.getChild("upperjawmiddle2");
		this.upperjawfront2 = this.upperjawmiddle2.getChild("upperjawfront2");
		this.nose2 = this.upperjawfront2.getChild("nose2");
		this.rupperteethfront2 = this.upperjawfront2.getChild("rupperteethfront2");
		this.upperfrontteeth2 = this.upperjawfront2.getChild("upperfrontteeth2");
		this.nasalridgebase2 = this.upperjawmiddle2.getChild("nasalridgebase2");
		this.rupperteethmidfront2 = this.upperjawmiddle2.getChild("rupperteethmidfront2");
		this.leftnasalridgebase = this.upperjawbase2.getChild("leftnasalridgebase");
		this.leftnasalridgeend = this.leftnasalridgebase.getChild("leftnasalridgeend");
		this.rupperteethmidback2 = this.upperjawbase2.getChild("rupperteethmidback2");
		this.lowerjawback = this.head.getChild("lowerjawback");
		this.lowerjawmiddleback = this.lowerjawback.getChild("lowerjawmiddleback");
		this.lowerjawmiddle = this.lowerjawmiddleback.getChild("lowerjawmiddle");
		this.lowerjawmiddlefront = this.lowerjawmiddle.getChild("lowerjawmiddlefront");
		this.lowerjawend = this.lowerjawmiddlefront.getChild("lowerjawend");
		this.chin = this.lowerjawend.getChild("chin");
		this.rlowerteethfront = this.lowerjawend.getChild("rlowerteethfront");
		this.lowerfrontteeth = this.lowerjawend.getChild("lowerfrontteeth");
		this.rlowerteethmidfront = this.lowerjawmiddlefront.getChild("rlowerteethmidfront");
		this.rlowerteethmidback = this.lowerjawmiddle.getChild("rlowerteethmidback");
		this.rlowerteethback = this.lowerjawmiddleback.getChild("rlowerteethback");
		this.lowerjawmiddleback2 = this.lowerjawback.getChild("lowerjawmiddleback2");
		this.lowerjawmiddle2 = this.lowerjawmiddleback2.getChild("lowerjawmiddle2");
		this.lowerjawmiddlefront2 = this.lowerjawmiddle2.getChild("lowerjawmiddlefront2");
		this.lowerjawend2 = this.lowerjawmiddlefront2.getChild("lowerjawend2");
		this.chin2 = this.lowerjawend2.getChild("chin2");
		this.rlowerteethfront2 = this.lowerjawend2.getChild("rlowerteethfront2");
		this.lowerfrontteeth2 = this.lowerjawend2.getChild("lowerfrontteeth2");
		this.rlowerteethmidfront2 = this.lowerjawmiddlefront2.getChild("rlowerteethmidfront2");
		this.rlowerteethmidback2 = this.lowerjawmiddle2.getChild("rlowerteethmidback2");
		this.rlowerteethback2 = this.lowerjawmiddleback2.getChild("rlowerteethback2");
		this.rightjawflank = this.lowerjawback.getChild("rightjawflank");
		this.leftjawflank = this.lowerjawback.getChild("leftjawflank");
		this.rightheadflank = this.head.getChild("rightheadflank");
		this.rightlacrimalcrest = this.rightheadflank.getChild("rightlacrimalcrest");
		this.rightlacrimalfront = this.rightlacrimalcrest.getChild("rightlacrimalfront");
		this.rightlacrimalback = this.rightlacrimalcrest.getChild("rightlacrimalback");
		this.leftheadflank = this.head.getChild("leftheadflank");
		this.leftlacrimalcrest = this.leftheadflank.getChild("leftlacrimalcrest");
		this.leftlacrimalfront = this.leftlacrimalcrest.getChild("leftlacrimalfront");
		this.leftlacrimalback = this.leftlacrimalcrest.getChild("leftlacrimalback");
		this.chestslope = this.bodyfront.getChild("chestslope");
		this.leftArm1 = this.bodyfront.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.bodyfront.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bellyslope = this.bodymiddle.getChild("bellyslope");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tailridge2 = this.tail2.getChild("tailridge2");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -48.0F, 2.3F, 1.0F, 48.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-2.2F, -8.95F, -0.5F, 1.0F, 40.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -31.05F, -30.3F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(3.45F, -6.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -31.05F, -30.3F, 0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-11.5F, -6.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -35.0F, 2.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.16F, 2.0F, 0.3478F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(50, 27).addBox(-0.5F, 0.9F, 0.0F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -5.1F, -8.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bodymiddle = hips.addOrReplaceChild("bodymiddle", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, -0.2312F, -23.099F, 1.0F, 3.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9F, -7.6F, -0.1077F, 0.0868F, -0.0094F));

		PartDefinition bodyfront = bodymiddle.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3688F, -22.999F, -0.0012F, 0.0436F, 0.0F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(46, 74).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1369F, -10.8602F, 0.1571F, 0.0F, 0.0F));

		PartDefinition neckbase = bodyfront.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1369F, -10.6602F, -0.3436F, 0.1233F, -0.044F));

		PartDefinition neckbase_r1 = neckbase.addOrReplaceChild("neckbase_r1", CubeListBuilder.create().texOffs(75, 97).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9649F, -7.8657F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neckmiddlebase = neckbase.addOrReplaceChild("neckmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2351F, -7.3657F, -0.2828F, 0.2046F, 0.0751F));

		PartDefinition neckmiddlebase_r1 = neckmiddlebase.addOrReplaceChild("neckmiddlebase_r1", CubeListBuilder.create().texOffs(0, 129).addBox(-0.5F, 1.0F, 0.7F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.554F, -4.9205F, -0.1397F, 0.0344F, -0.0061F));

		PartDefinition neckmiddleend = neckmiddlebase.addOrReplaceChild("neckmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.654F, -5.0205F, 0.0266F, 0.2172F, 0.0484F));

		PartDefinition neckmiddleend_r1 = neckmiddleend.addOrReplaceChild("neckmiddleend_r1", CubeListBuilder.create().texOffs(121, 19).addBox(-0.49F, 1.0F, 0.7F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6164F, -5.671F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neckend = neckmiddleend.addOrReplaceChild("neckend", CubeListBuilder.create().texOffs(124, 88).addBox(-0.49F, -0.098F, -4.8684F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5164F, -5.371F, 0.1097F, 0.2125F, 0.0661F));

		PartDefinition head = neckend.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.302F, -4.3684F, 0.0637F, 0.0F, 0.0F));

		PartDefinition upperjawbase = head.addOrReplaceChild("upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8211F, -7.7631F, 0.2546F, 0.0F, 0.0F));

		PartDefinition upperjawmiddle = upperjawbase.addOrReplaceChild("upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0F, -10.0F, -0.2546F, 0.0F, 0.0F));

		PartDefinition upperjawfront = upperjawmiddle.addOrReplaceChild("upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1061F, 0.0F, 0.0F));

		PartDefinition nose = upperjawfront.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -3.0F, -3.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition rupperteethfront = upperjawfront.addOrReplaceChild("rupperteethfront", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, -0.55F, -1.2F, 0.2759F, 0.1061F, 0.0F));

		PartDefinition upperfrontteeth = upperjawfront.addOrReplaceChild("upperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -2.7F, 0.3821F, 0.0F, 0.0F));

		PartDefinition nasalridgebase = upperjawmiddle.addOrReplaceChild("nasalridgebase", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -6.0F, -4.0F, -0.658F, 0.0F, 0.0F));

		PartDefinition rupperteethmidfront = upperjawmiddle.addOrReplaceChild("rupperteethmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(2.05F, -0.4F, -1.9F, -0.1698F, 0.1061F, 0.0F));

		PartDefinition rightnasalridgebase = upperjawbase.addOrReplaceChild("rightnasalridgebase", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, -0.6F, -10.1F, 0.1911F, 0.0213F, -0.0424F));

		PartDefinition rightnasalridgeend = rightnasalridgebase.addOrReplaceChild("rightnasalridgeend", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 1.2F, 5.9F, -0.4387F, 0.3379F, 0.0594F));

		PartDefinition rupperteethmidback = upperjawbase.addOrReplaceChild("rupperteethmidback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 8.0F, -7.2F, 0.0F, 0.0424F, 0.0F));

		PartDefinition upperjawbase2 = head.addOrReplaceChild("upperjawbase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, -1.8211F, -7.7631F, 0.2546F, 0.0F, 0.0F));

		PartDefinition upperjawmiddle2 = upperjawbase2.addOrReplaceChild("upperjawmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0F, -10.0F, -0.2546F, 0.0F, 0.0F));

		PartDefinition upperjawfront2 = upperjawmiddle2.addOrReplaceChild("upperjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1061F, 0.0F, 0.0F));

		PartDefinition nose2 = upperjawfront2.addOrReplaceChild("nose2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -3.0F, -3.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition rupperteethfront2 = upperjawfront2.addOrReplaceChild("rupperteethfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, -0.55F, -1.2F, 0.2759F, -0.1061F, 0.0F));

		PartDefinition upperfrontteeth2 = upperjawfront2.addOrReplaceChild("upperfrontteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -2.7F, 0.3821F, 0.0F, 0.0F));

		PartDefinition nasalridgebase2 = upperjawmiddle2.addOrReplaceChild("nasalridgebase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -6.0F, -4.0F, -0.658F, 0.0F, 0.0F));

		PartDefinition rupperteethmidfront2 = upperjawmiddle2.addOrReplaceChild("rupperteethmidfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.05F, -0.4F, -1.9F, -0.1698F, -0.1061F, 0.0F));

		PartDefinition leftnasalridgebase = upperjawbase2.addOrReplaceChild("leftnasalridgebase", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.25F, -0.6F, -10.1F, 0.1911F, -0.0213F, 0.0424F));

		PartDefinition leftnasalridgeend = leftnasalridgebase.addOrReplaceChild("leftnasalridgeend", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 1.2F, 5.9F, -0.4387F, -0.3379F, -0.0594F));

		PartDefinition rupperteethmidback2 = upperjawbase2.addOrReplaceChild("rupperteethmidback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 8.0F, -7.2F, 0.0F, -0.0424F, 0.0F));

		PartDefinition lowerjawback = head.addOrReplaceChild("lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.488F, 3.6328F, 0.6894F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddleback = lowerjawback.addOrReplaceChild("lowerjawmiddleback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4161F, -11.4452F, 0.1061F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddle = lowerjawmiddleback.addOrReplaceChild("lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.0F, -4.0F, 0.1911F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront = lowerjawmiddle.addOrReplaceChild("lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2546F, 0.0F, 0.0F));

		PartDefinition lowerjawend = lowerjawmiddlefront.addOrReplaceChild("lowerjawend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.9F, -0.1274F, 0.0F, 0.0F));

		PartDefinition chin = lowerjawend.addOrReplaceChild("chin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.2F, 0.12F, 0.1485F, 0.0F, 0.0F));

		PartDefinition rlowerteethfront = lowerjawend.addOrReplaceChild("rlowerteethfront", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3F, -3.0F, -2.1F, 0.1698F, 0.1698F, 0.0F));

		PartDefinition lowerfrontteeth = lowerjawend.addOrReplaceChild("lowerfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.4F, 0.0213F, 0.0F, 0.0F));

		PartDefinition rlowerteethmidfront = lowerjawmiddlefront.addOrReplaceChild("rlowerteethmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, -3.1F, -2.4F, -0.1274F, 0.1061F, 0.0F));

		PartDefinition rlowerteethmidback = lowerjawmiddle.addOrReplaceChild("rlowerteethmidback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 0.2F, -1.7F, -0.1698F, 0.0848F, 0.0F));

		PartDefinition rlowerteethback = lowerjawmiddleback.addOrReplaceChild("rlowerteethback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 0.7F, -2.5F, -0.1274F, 0.0637F, 0.0F));

		PartDefinition lowerjawmiddleback2 = lowerjawback.addOrReplaceChild("lowerjawmiddleback2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, 0.4161F, -11.4452F, 0.1061F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddle2 = lowerjawmiddleback2.addOrReplaceChild("lowerjawmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, -4.0F, 0.1911F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront2 = lowerjawmiddle2.addOrReplaceChild("lowerjawmiddlefront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2546F, 0.0F, 0.0F));

		PartDefinition lowerjawend2 = lowerjawmiddlefront2.addOrReplaceChild("lowerjawend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.9F, -0.1274F, 0.0F, 0.0F));

		PartDefinition chin2 = lowerjawend2.addOrReplaceChild("chin2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.2F, 0.12F, 0.1485F, 0.0F, 0.0F));

		PartDefinition rlowerteethfront2 = lowerjawend2.addOrReplaceChild("rlowerteethfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, -3.0F, -2.1F, 0.1698F, -0.1698F, 0.0F));

		PartDefinition lowerfrontteeth2 = lowerjawend2.addOrReplaceChild("lowerfrontteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.4F, 0.0213F, 0.0F, 0.0F));

		PartDefinition rlowerteethmidfront2 = lowerjawmiddlefront2.addOrReplaceChild("rlowerteethmidfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, -3.1F, -2.4F, -0.1274F, -0.1061F, 0.0F));

		PartDefinition rlowerteethmidback2 = lowerjawmiddle2.addOrReplaceChild("rlowerteethmidback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 0.2F, -1.7F, -0.1698F, -0.0848F, 0.0F));

		PartDefinition rlowerteethback2 = lowerjawmiddleback2.addOrReplaceChild("rlowerteethback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.7F, -2.5F, -0.1274F, -0.0637F, 0.0F));

		PartDefinition rightjawflank = lowerjawback.addOrReplaceChild("rightjawflank", CubeListBuilder.create(), PartPose.offsetAndRotation(5.27F, 2.6161F, -7.3452F, 0.0848F, 0.4033F, 0.0F));

		PartDefinition leftjawflank = lowerjawback.addOrReplaceChild("leftjawflank", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.25F, 2.6161F, -7.3452F, 0.0848F, -0.4033F, 0.0F));

		PartDefinition rightheadflank = head.addOrReplaceChild("rightheadflank", CubeListBuilder.create(), PartPose.offsetAndRotation(5.33F, 1.9789F, -3.4631F, 0.0848F, 0.3821F, 0.0F));

		PartDefinition rightlacrimalcrest = rightheadflank.addOrReplaceChild("rightlacrimalcrest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7291F, -3.4123F, -2.184F, -0.2972F, -0.0637F, 0.1061F));

		PartDefinition rightlacrimalfront = rightlacrimalcrest.addOrReplaceChild("rightlacrimalfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.05F, -2.9032F, -0.2609F, 0.6369F, 0.0213F, 0.0F));

		PartDefinition rightlacrimalback = rightlacrimalcrest.addOrReplaceChild("rightlacrimalback", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -2.3032F, 1.1891F, -0.0213F, -0.3396F, -0.1061F));

		PartDefinition leftheadflank = head.addOrReplaceChild("leftheadflank", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.31F, 1.9789F, -3.4631F, 0.0848F, -0.3821F, 0.0F));

		PartDefinition leftlacrimalcrest = leftheadflank.addOrReplaceChild("leftlacrimalcrest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7291F, -3.4123F, -2.184F, -0.2972F, 0.0637F, -0.1061F));

		PartDefinition leftlacrimalfront = leftlacrimalcrest.addOrReplaceChild("leftlacrimalfront", CubeListBuilder.create(), PartPose.offsetAndRotation(1.05F, -2.9032F, -0.2609F, 0.6369F, -0.0213F, 0.0F));

		PartDefinition leftlacrimalback = leftlacrimalcrest.addOrReplaceChild("leftlacrimalback", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -2.3032F, 1.1891F, -0.0213F, 0.3396F, 0.1061F));

		PartDefinition chestslope = bodyfront.addOrReplaceChild("chestslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 16.9369F, -10.6602F, -0.2122F, 0.0F, 0.0F));

		PartDefinition leftArm1 = bodyfront.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(8.4232F, 12.5695F, -4.7148F, 0.0791F, -0.654F, -0.5567F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 5.0347F, 0.6893F, -1.1784F, -0.0167F, 0.0403F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightArm1 = bodyfront.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.4232F, 12.5695F, -4.7148F, -0.2256F, 0.9301F, 0.7002F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 5.0347F, 0.6893F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, -0.4363F));

		PartDefinition bellyslope = bodymiddle.addOrReplaceChild("bellyslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.1688F, -23.099F, -0.1274F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(1, 27).addBox(-0.5F, -0.3074F, -0.2935F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 11.9F, -0.1471F, 0.1727F, -0.0254F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(49, 51).addBox(-0.5F, -0.022F, -0.796F, 1.0F, 2.0F, 20.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2074F, 20.6065F, 0.097F, 0.1303F, 0.0126F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.3429F, -0.2462F, 1.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2679F, 18.6857F, -0.0131F, -0.2181F, 0.0028F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(74, 84).addBox(-0.5F, 0.0711F, -0.1829F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4485F, 16.6649F, -0.1116F, -0.1735F, 0.0193F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(94, 51).addBox(-0.5F, 0.3213F, 0.0141F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5083F, 10.7379F, -0.0995F, -0.2606F, 0.0257F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(96, 98).addBox(-0.5F, 0.3957F, -0.0983F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1038F, 9.8236F, -0.1239F, -0.2599F, 0.032F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, 0.1439F, -0.1005F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.2957F, 8.9017F, -0.2533F, -0.1691F, 0.0435F));

		PartDefinition tailridge2 = tail2.addOrReplaceChild("tailridge2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.522F, -0.296F, -0.2122F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, -0.3305F, 1.4922F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.7052F, 1.2374F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 17.1525F, -1.6529F, -0.6283F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.1011F, -0.1323F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3216F, -3.098F, -0.0835F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, -0.3305F, 1.4922F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.7052F, 1.2374F, 0.9163F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 17.1525F, -1.6529F, -0.6283F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.1011F, -0.1323F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3216F, -3.098F, -0.3453F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 176);
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