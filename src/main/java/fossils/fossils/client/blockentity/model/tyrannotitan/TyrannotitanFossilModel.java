package fossils.fossils.client.blockentity.model.tyrannotitan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TyrannotitanFossilModel extends SkullModelBase {
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
	private final ModelPart lowerjawmiddleback3;
	private final ModelPart lowerjawmiddle3;
	private final ModelPart lowerjawmiddlefront3;
	private final ModelPart lowerjawend3;
	private final ModelPart chin3;
	private final ModelPart rlowerteethfront3;
	private final ModelPart lowerfrontteeth3;
	private final ModelPart rlowerteethmidfront3;
	private final ModelPart rlowerteethmidback3;
	private final ModelPart rlowerteethback3;
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
	private final ModelPart rightjawflank2;
	private final ModelPart leftjawflank;
	private final ModelPart rightheadflank;
	private final ModelPart rightlacrimalcrest;
	private final ModelPart rightlacrimalfront;
	private final ModelPart rightlacrimalback;
	private final ModelPart rightheadflank2;
	private final ModelPart leftlacrimalcrest;
	private final ModelPart leftlacrimalfront;
	private final ModelPart leftlacrimalback;
	private final ModelPart leftheadflank;
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
	private final ModelPart bone2;
	private final ModelPart bone3;
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

	public TyrannotitanFossilModel(ModelPart root) {
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
		this.lowerjawmiddleback3 = this.lowerjawback.getChild("lowerjawmiddleback3");
		this.lowerjawmiddle3 = this.lowerjawmiddleback3.getChild("lowerjawmiddle3");
		this.lowerjawmiddlefront3 = this.lowerjawmiddle3.getChild("lowerjawmiddlefront3");
		this.lowerjawend3 = this.lowerjawmiddlefront3.getChild("lowerjawend3");
		this.chin3 = this.lowerjawend3.getChild("chin3");
		this.rlowerteethfront3 = this.lowerjawend3.getChild("rlowerteethfront3");
		this.lowerfrontteeth3 = this.lowerjawend3.getChild("lowerfrontteeth3");
		this.rlowerteethmidfront3 = this.lowerjawmiddlefront3.getChild("rlowerteethmidfront3");
		this.rlowerteethmidback3 = this.lowerjawmiddle3.getChild("rlowerteethmidback3");
		this.rlowerteethback3 = this.lowerjawmiddleback3.getChild("rlowerteethback3");
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
		this.rightjawflank2 = this.lowerjawback.getChild("rightjawflank2");
		this.leftjawflank = this.lowerjawback.getChild("leftjawflank");
		this.rightheadflank = this.head.getChild("rightheadflank");
		this.rightlacrimalcrest = this.rightheadflank.getChild("rightlacrimalcrest");
		this.rightlacrimalfront = this.rightlacrimalcrest.getChild("rightlacrimalfront");
		this.rightlacrimalback = this.rightlacrimalcrest.getChild("rightlacrimalback");
		this.rightheadflank2 = this.head.getChild("rightheadflank2");
		this.leftlacrimalcrest = this.rightheadflank2.getChild("leftlacrimalcrest");
		this.leftlacrimalfront = this.leftlacrimalcrest.getChild("leftlacrimalfront");
		this.leftlacrimalback = this.leftlacrimalcrest.getChild("leftlacrimalback");
		this.leftheadflank = this.head.getChild("leftheadflank");
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
		this.bone2 = this.hips.getChild("bone2");
		this.bone3 = this.hips.getChild("bone3");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.16F, 2.0F, 0.3478F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(90, 146).addBox(0.0F, -6.8F, 18.6F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 146).addBox(0.0F, -7.1F, 15.6F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(75, 146).addBox(0.0F, -7.1F, 12.6F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 146).addBox(0.0F, -7.1F, 9.6F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(27, 146).addBox(0.0F, -7.1F, 6.6F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 146).addBox(0.0F, -7.1F, 3.7F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(85, 145).addBox(0.0F, -7.1F, 1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 27).addBox(-1.5F, -0.1F, 0.0F, 3.0F, 3.0F, 20.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -5.1F, -8.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 103).mirror().addBox(-3.0F, -8.7697F, -1.3318F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 103).addBox(0.0F, -8.7697F, -1.3318F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.66F, -2.2F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bodymiddle = hips.addOrReplaceChild("bodymiddle", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.2312F, -23.099F, 3.0F, 3.0F, 23.0F, new CubeDeformation(0.0F))
				.texOffs(145, 52).addBox(0.0F, -8.2312F, -21.799F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 91).addBox(0.0F, -8.5312F, -19.199F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 139).addBox(0.0F, -8.4312F, -16.399F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(65, 141).addBox(0.0F, -8.3312F, -13.399F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 141).addBox(0.0F, -8.3312F, -10.399F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(53, 142).addBox(0.0F, -8.3312F, -7.399F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 142).addBox(0.0F, -8.2312F, -4.399F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(120, 142).addBox(0.0F, -8.2312F, -1.699F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9F, -7.6F, -0.1077F, 0.0868F, -0.0094F));

		PartDefinition bodymiddle_r1 = bodymiddle.addOrReplaceChild("bodymiddle_r1", CubeListBuilder.create().texOffs(132, 156).mirror().addBox(-7.1421F, -4.1421F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -0.599F, 0.0045F, 0.0258F, -1.658F));

		PartDefinition bodymiddle_r2 = bodymiddle.addOrReplaceChild("bodymiddle_r2", CubeListBuilder.create().texOffs(103, 156).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -0.599F, 0.0242F, 0.01F, -0.6544F));

		PartDefinition bodymiddle_r3 = bodymiddle.addOrReplaceChild("bodymiddle_r3", CubeListBuilder.create().texOffs(88, 156).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -0.599F, 0.0177F, 0.0193F, -1.0907F));

		PartDefinition bodymiddle_r4 = bodymiddle.addOrReplaceChild("bodymiddle_r4", CubeListBuilder.create().texOffs(147, 67).mirror().addBox(-8.1421F, -4.1421F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -3.499F, 0.0137F, 0.0773F, -1.5179F));

		PartDefinition bodymiddle_r5 = bodymiddle.addOrReplaceChild("bodymiddle_r5", CubeListBuilder.create().texOffs(73, 156).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -3.499F, 0.0726F, 0.03F, -0.5138F));

		PartDefinition bodymiddle_r6 = bodymiddle.addOrReplaceChild("bodymiddle_r6", CubeListBuilder.create().texOffs(156, 64).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -3.499F, 0.0531F, 0.0579F, -0.9497F));

		PartDefinition bodymiddle_r7 = bodymiddle.addOrReplaceChild("bodymiddle_r7", CubeListBuilder.create().texOffs(156, 62).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -6.499F, 0.1534F, 0.0632F, -0.4577F));

		PartDefinition bodymiddle_r8 = bodymiddle.addOrReplaceChild("bodymiddle_r8", CubeListBuilder.create().texOffs(156, 48).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -6.499F, 0.1126F, 0.122F, -0.892F));

		PartDefinition bodymiddle_r9 = bodymiddle.addOrReplaceChild("bodymiddle_r9", CubeListBuilder.create().texOffs(136, 69).mirror().addBox(-10.1421F, -4.1421F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -6.499F, 0.0291F, 0.1633F, -1.4637F));

		PartDefinition bodymiddle_r10 = bodymiddle.addOrReplaceChild("bodymiddle_r10", CubeListBuilder.create().texOffs(130, 15).mirror().addBox(-11.1421F, -4.1421F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -9.499F, 0.0385F, 0.2148F, -1.4445F));

		PartDefinition bodymiddle_r11 = bodymiddle.addOrReplaceChild("bodymiddle_r11", CubeListBuilder.create().texOffs(156, 46).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -9.499F, 0.202F, 0.0829F, -0.4366F));

		PartDefinition bodymiddle_r12 = bodymiddle.addOrReplaceChild("bodymiddle_r12", CubeListBuilder.create().texOffs(156, 44).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -9.499F, 0.1487F, 0.1603F, -0.8694F));

		PartDefinition bodymiddle_r13 = bodymiddle.addOrReplaceChild("bodymiddle_r13", CubeListBuilder.create().texOffs(130, 11).mirror().addBox(-12.1421F, -4.1421F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -12.499F, 0.0417F, 0.232F, -1.4263F));

		PartDefinition bodymiddle_r14 = bodymiddle.addOrReplaceChild("bodymiddle_r14", CubeListBuilder.create().texOffs(28, 156).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -12.499F, 0.1608F, 0.173F, -0.85F));

		PartDefinition bodymiddle_r15 = bodymiddle.addOrReplaceChild("bodymiddle_r15", CubeListBuilder.create().texOffs(19, 156).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -12.499F, 0.2183F, 0.0895F, -0.4178F));

		PartDefinition bodymiddle_r16 = bodymiddle.addOrReplaceChild("bodymiddle_r16", CubeListBuilder.create().texOffs(121, 30).mirror().addBox(-14.1421F, -4.1421F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -15.499F, 0.0481F, 0.2663F, -1.3898F));

		PartDefinition bodymiddle_r17 = bodymiddle.addOrReplaceChild("bodymiddle_r17", CubeListBuilder.create().texOffs(156, 8).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -15.499F, 0.1852F, 0.1983F, -0.8106F));

		PartDefinition bodymiddle_r18 = bodymiddle.addOrReplaceChild("bodymiddle_r18", CubeListBuilder.create().texOffs(154, 73).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -15.499F, 0.2508F, 0.1024F, -0.3798F));

		PartDefinition bodymiddle_r19 = bodymiddle.addOrReplaceChild("bodymiddle_r19", CubeListBuilder.create().texOffs(117, 60).mirror().addBox(-15.1421F, -4.1421F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -18.199F, 0.0547F, 0.3006F, -1.388F));

		PartDefinition bodymiddle_r20 = bodymiddle.addOrReplaceChild("bodymiddle_r20", CubeListBuilder.create().texOffs(154, 71).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -18.199F, 0.2099F, 0.2236F, -0.8054F));

		PartDefinition bodymiddle_r21 = bodymiddle.addOrReplaceChild("bodymiddle_r21", CubeListBuilder.create().texOffs(154, 25).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0312F, -18.199F, 0.2835F, 0.1153F, -0.3762F));

		PartDefinition bodymiddle_r22 = bodymiddle.addOrReplaceChild("bodymiddle_r22", CubeListBuilder.create().texOffs(94, 72).mirror().addBox(-16.1421F, -4.1421F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2688F, -20.599F, 0.0547F, 0.3006F, -1.388F));

		PartDefinition bodymiddle_r23 = bodymiddle.addOrReplaceChild("bodymiddle_r23", CubeListBuilder.create().texOffs(154, 23).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2688F, -20.599F, 0.2099F, 0.2236F, -0.8054F));

		PartDefinition bodymiddle_r24 = bodymiddle.addOrReplaceChild("bodymiddle_r24", CubeListBuilder.create().texOffs(152, 119).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2688F, -20.599F, 0.2835F, 0.1153F, -0.3762F));

		PartDefinition bodymiddle_r25 = bodymiddle.addOrReplaceChild("bodymiddle_r25", CubeListBuilder.create().texOffs(88, 156).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -0.599F, 0.0177F, -0.0193F, 1.0907F));

		PartDefinition bodymiddle_r26 = bodymiddle.addOrReplaceChild("bodymiddle_r26", CubeListBuilder.create().texOffs(103, 156).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -0.599F, 0.0242F, -0.01F, 0.6544F));

		PartDefinition bodymiddle_r27 = bodymiddle.addOrReplaceChild("bodymiddle_r27", CubeListBuilder.create().texOffs(132, 156).addBox(4.1421F, -4.1421F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -0.599F, 0.0045F, -0.0258F, 1.658F));

		PartDefinition bodymiddle_r28 = bodymiddle.addOrReplaceChild("bodymiddle_r28", CubeListBuilder.create().texOffs(156, 64).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -3.499F, 0.0531F, -0.0579F, 0.9497F));

		PartDefinition bodymiddle_r29 = bodymiddle.addOrReplaceChild("bodymiddle_r29", CubeListBuilder.create().texOffs(73, 156).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -3.499F, 0.0726F, -0.03F, 0.5138F));

		PartDefinition bodymiddle_r30 = bodymiddle.addOrReplaceChild("bodymiddle_r30", CubeListBuilder.create().texOffs(147, 67).addBox(4.1421F, -4.1421F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -3.499F, 0.0137F, -0.0773F, 1.5179F));

		PartDefinition bodymiddle_r31 = bodymiddle.addOrReplaceChild("bodymiddle_r31", CubeListBuilder.create().texOffs(136, 69).addBox(4.1421F, -4.1421F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -6.499F, 0.0291F, -0.1633F, 1.4637F));

		PartDefinition bodymiddle_r32 = bodymiddle.addOrReplaceChild("bodymiddle_r32", CubeListBuilder.create().texOffs(156, 48).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -6.499F, 0.1126F, -0.122F, 0.892F));

		PartDefinition bodymiddle_r33 = bodymiddle.addOrReplaceChild("bodymiddle_r33", CubeListBuilder.create().texOffs(156, 62).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -6.499F, 0.1534F, -0.0632F, 0.4577F));

		PartDefinition bodymiddle_r34 = bodymiddle.addOrReplaceChild("bodymiddle_r34", CubeListBuilder.create().texOffs(156, 44).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -9.499F, 0.1487F, -0.1603F, 0.8694F));

		PartDefinition bodymiddle_r35 = bodymiddle.addOrReplaceChild("bodymiddle_r35", CubeListBuilder.create().texOffs(156, 46).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -9.499F, 0.202F, -0.0829F, 0.4366F));

		PartDefinition bodymiddle_r36 = bodymiddle.addOrReplaceChild("bodymiddle_r36", CubeListBuilder.create().texOffs(130, 15).addBox(4.1421F, -4.1421F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -9.499F, 0.0385F, -0.2148F, 1.4445F));

		PartDefinition bodymiddle_r37 = bodymiddle.addOrReplaceChild("bodymiddle_r37", CubeListBuilder.create().texOffs(19, 156).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -12.499F, 0.2183F, -0.0895F, 0.4178F));

		PartDefinition bodymiddle_r38 = bodymiddle.addOrReplaceChild("bodymiddle_r38", CubeListBuilder.create().texOffs(28, 156).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -12.499F, 0.1608F, -0.173F, 0.85F));

		PartDefinition bodymiddle_r39 = bodymiddle.addOrReplaceChild("bodymiddle_r39", CubeListBuilder.create().texOffs(130, 11).addBox(4.1421F, -4.1421F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -12.499F, 0.0417F, -0.232F, 1.4263F));

		PartDefinition bodymiddle_r40 = bodymiddle.addOrReplaceChild("bodymiddle_r40", CubeListBuilder.create().texOffs(154, 73).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -15.499F, 0.2508F, -0.1024F, 0.3798F));

		PartDefinition bodymiddle_r41 = bodymiddle.addOrReplaceChild("bodymiddle_r41", CubeListBuilder.create().texOffs(156, 8).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -15.499F, 0.1852F, -0.1983F, 0.8106F));

		PartDefinition bodymiddle_r42 = bodymiddle.addOrReplaceChild("bodymiddle_r42", CubeListBuilder.create().texOffs(121, 30).addBox(4.1421F, -4.1421F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -15.499F, 0.0481F, -0.2663F, 1.3898F));

		PartDefinition bodymiddle_r43 = bodymiddle.addOrReplaceChild("bodymiddle_r43", CubeListBuilder.create().texOffs(154, 25).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -18.199F, 0.2835F, -0.1153F, 0.3762F));

		PartDefinition bodymiddle_r44 = bodymiddle.addOrReplaceChild("bodymiddle_r44", CubeListBuilder.create().texOffs(154, 71).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -18.199F, 0.2099F, -0.2236F, 0.8054F));

		PartDefinition bodymiddle_r45 = bodymiddle.addOrReplaceChild("bodymiddle_r45", CubeListBuilder.create().texOffs(117, 60).addBox(4.1421F, -4.1421F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0312F, -18.199F, 0.0547F, -0.3006F, 1.388F));

		PartDefinition bodymiddle_r46 = bodymiddle.addOrReplaceChild("bodymiddle_r46", CubeListBuilder.create().texOffs(94, 72).addBox(4.1421F, -4.1421F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.2688F, -20.599F, 0.0547F, -0.3006F, 1.388F));

		PartDefinition bodymiddle_r47 = bodymiddle.addOrReplaceChild("bodymiddle_r47", CubeListBuilder.create().texOffs(154, 23).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.2688F, -20.599F, 0.2099F, -0.2236F, 0.8054F));

		PartDefinition bodymiddle_r48 = bodymiddle.addOrReplaceChild("bodymiddle_r48", CubeListBuilder.create().texOffs(152, 119).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.2688F, -20.599F, 0.2835F, -0.1153F, 0.3762F));

		PartDefinition bodyfront = bodymiddle.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3688F, -22.999F, -0.0012F, 0.0436F, 0.0F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(100, 144).addBox(0.0F, -6.4741F, -0.1841F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3631F, -0.7602F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bodyfront_r2 = bodyfront.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(42, 148).addBox(0.0F, -0.0918F, -2.3375F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6631F, -1.7602F, 0.1222F, 0.0F, 0.0F));

		PartDefinition bodyfront_r3 = bodyfront.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(47, 150).addBox(0.0F, -5.3543F, -0.2508F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0369F, -5.7602F, 0.1222F, 0.0F, 0.0F));

		PartDefinition bodyfront_r4 = bodyfront.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(97, 156).addBox(0.0F, -4.6078F, 0.1441F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0369F, -7.8602F, 0.0698F, 0.0F, 0.0F));

		PartDefinition bodyfront_r5 = bodyfront.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(82, 156).addBox(0.0F, -4.5543F, -0.061F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0369F, -9.9602F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bodyfront.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 147).mirror().addBox(-0.1471F, -0.0429F, -0.9992F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3072F, 13.6147F, -6.5592F, 1.1015F, -0.3894F, -0.9032F));

		PartDefinition cube_r3 = bodyfront.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(-0.4318F, -2.0536F, -3.9316F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 6.6089F, -2.3817F, 0.8976F, -0.0253F, 0.1016F));

		PartDefinition cube_r4 = bodyfront.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(137, 122).mirror().addBox(-0.1122F, -1.0691F, -3.9438F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 3.0089F, -0.5817F, 1.107F, -0.0253F, 0.1016F));

		PartDefinition cube_r5 = bodyfront.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(132, 52).mirror().addBox(-0.0083F, -0.0084F, -4.7552F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 2.3089F, -1.8817F, 0.9499F, -0.0253F, 0.1016F));

		PartDefinition cube_r6 = bodyfront.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(150, 39).mirror().addBox(0.2225F, 0.5942F, -2.6023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.9F, -0.1911F, -0.9817F, 1.1332F, -0.0253F, 0.1016F));

		PartDefinition cube_r7 = bodyfront.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(121, 28).mirror().addBox(-9.6058F, 0.9684F, -0.4609F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9973F, 14.6598F, -3.503F, 0.4211F, 0.9626F, 0.4444F));

		PartDefinition cube_r8 = bodyfront.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(96, 48).mirror().addBox(-8.2016F, 0.9653F, -0.1034F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9973F, 14.6598F, -3.503F, 0.1286F, 0.7847F, 0.5983F));

		PartDefinition cube_r9 = bodyfront.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(128, 45).mirror().addBox(-6.8229F, 0.688F, -0.8582F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9973F, 14.6598F, -3.503F, -0.2077F, 0.56F, 0.9021F));

		PartDefinition cube_r10 = bodyfront.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(71, 129).mirror().addBox(-0.6339F, 1.0342F, -6.1775F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9973F, 14.6598F, -3.503F, -0.8278F, -0.3386F, 0.347F));

		PartDefinition cube_r11 = bodyfront.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.2225F, -0.0058F, -2.6023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.9F, -0.1911F, -0.9817F, 1.2204F, -0.0253F, 0.1016F));

		PartDefinition cube_r12 = bodyfront.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(109, 126).mirror().addBox(0.0F, -0.5496F, -4.9995F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 8.3089F, -7.4817F, 0.9094F, -0.8214F, -0.5755F));

		PartDefinition cube_r13 = bodyfront.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(149, 11).mirror().addBox(-0.5F, -0.1228F, -2.924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5F, 6.1089F, -4.1817F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bodyfront.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 149).mirror().addBox(-0.5F, -3.8F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5F, 11.1925F, -5.8266F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bodyfront.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(147, 0).mirror().addBox(0.4228F, -0.3282F, -2.4183F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.9F, -2.2911F, -0.4817F, 1.4822F, -0.0253F, 0.1016F));

		PartDefinition bodymiddle_r49 = bodyfront.addOrReplaceChild("bodymiddle_r49", CubeListBuilder.create().texOffs(157, 54).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.3369F, -9.4602F, 0.6509F, 0.2459F, -0.6235F));

		PartDefinition bodymiddle_r50 = bodyfront.addOrReplaceChild("bodymiddle_r50", CubeListBuilder.create().texOffs(157, 52).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.3369F, -9.4602F, 0.5081F, 0.4881F, -1.014F));

		PartDefinition bodymiddle_r51 = bodyfront.addOrReplaceChild("bodymiddle_r51", CubeListBuilder.create().texOffs(158, 66).mirror().addBox(-6.1421F, -4.1421F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.3369F, -9.4602F, 0.1422F, 0.6769F, -1.6603F));

		PartDefinition bodymiddle_r52 = bodyfront.addOrReplaceChild("bodymiddle_r52", CubeListBuilder.create().texOffs(157, 50).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.9369F, -7.1602F, 0.4816F, 0.1896F, -0.4158F));

		PartDefinition bodymiddle_r53 = bodyfront.addOrReplaceChild("bodymiddle_r53", CubeListBuilder.create().texOffs(144, 17).mirror().addBox(-9.1421F, -4.1421F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.9369F, -7.1602F, 0.0979F, 0.5063F, -1.4407F));

		PartDefinition bodymiddle_r54 = bodyfront.addOrReplaceChild("bodymiddle_r54", CubeListBuilder.create().texOffs(37, 157).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.9369F, -7.1602F, 0.3651F, 0.3715F, -0.8295F));

		PartDefinition bodymiddle_r55 = bodyfront.addOrReplaceChild("bodymiddle_r55", CubeListBuilder.create().texOffs(130, 13).mirror().addBox(-12.1421F, -4.1421F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5369F, -5.0602F, 0.0826F, 0.4378F, -1.4128F));

		PartDefinition bodymiddle_r56 = bodyfront.addOrReplaceChild("bodymiddle_r56", CubeListBuilder.create().texOffs(157, 27).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5369F, -5.0602F, 0.3117F, 0.323F, -0.8127F));

		PartDefinition bodymiddle_r57 = bodyfront.addOrReplaceChild("bodymiddle_r57", CubeListBuilder.create().texOffs(157, 16).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5369F, -5.0602F, 0.4151F, 0.1655F, -0.3927F));

		PartDefinition bodymiddle_r58 = bodyfront.addOrReplaceChild("bodymiddle_r58", CubeListBuilder.create().texOffs(121, 32).mirror().addBox(-14.1421F, -4.1421F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1369F, -2.3602F, 0.0683F, 0.3693F, -1.3835F));

		PartDefinition bodymiddle_r59 = bodyfront.addOrReplaceChild("bodymiddle_r59", CubeListBuilder.create().texOffs(156, 156).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1369F, -2.3602F, 0.349F, 0.1407F, -0.3678F));

		PartDefinition bodymiddle_r60 = bodyfront.addOrReplaceChild("bodymiddle_r60", CubeListBuilder.create().texOffs(156, 154).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1369F, -2.3602F, 0.2601F, 0.2736F, -0.793F));

		PartDefinition bodymiddle_r61 = bodyfront.addOrReplaceChild("bodymiddle_r61", CubeListBuilder.create().texOffs(119, 17).mirror().addBox(-15.1421F, -4.1421F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0631F, -0.1602F, 0.058F, 0.3178F, -1.387F));

		PartDefinition bodymiddle_r62 = bodyfront.addOrReplaceChild("bodymiddle_r62", CubeListBuilder.create().texOffs(156, 152).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0631F, -0.1602F, 0.2223F, 0.2361F, -0.8026F));

		PartDefinition bodymiddle_r63 = bodyfront.addOrReplaceChild("bodymiddle_r63", CubeListBuilder.create().texOffs(156, 150).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0631F, -0.1602F, 0.2998F, 0.1217F, -0.3743F));

		PartDefinition cube_r16 = bodyfront.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(147, 0).addBox(-1.4228F, -0.3282F, -2.4183F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9F, -2.2911F, -0.4817F, 1.4822F, 0.0253F, -0.1016F));

		PartDefinition cube_r17 = bodyfront.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(105, 149).addBox(-0.5F, -3.8F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, 11.1925F, -5.8266F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bodyfront.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(149, 11).addBox(-0.5F, -0.1228F, -2.924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, 6.1089F, -4.1817F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bodyfront.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(9, 147).addBox(-0.8529F, -0.0429F, -0.9992F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3072F, 13.6147F, -6.5592F, 1.1015F, 0.3894F, 0.9032F));

		PartDefinition cube_r20 = bodyfront.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(109, 126).addBox(-1.0F, -0.5496F, -4.9995F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 8.3089F, -7.4817F, 0.9094F, 0.8214F, 0.5755F));

		PartDefinition cube_r21 = bodyfront.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(150, 39).addBox(-1.2225F, 0.5942F, -2.6023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.9F, -0.1911F, -0.9817F, 1.1332F, 0.0253F, -0.1016F));

		PartDefinition cube_r22 = bodyfront.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 137).addBox(-0.5682F, -2.0536F, -3.9316F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.9F, 6.6089F, -2.3817F, 0.8976F, 0.0253F, -0.1016F));

		PartDefinition cube_r23 = bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(137, 122).addBox(-0.8878F, -1.0691F, -3.9438F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.9F, 3.0089F, -0.5817F, 1.107F, 0.0253F, -0.1016F));

		PartDefinition cube_r24 = bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(132, 52).addBox(-0.9917F, -0.0084F, -4.7552F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.9F, 2.3089F, -1.8817F, 0.9499F, 0.0253F, -0.1016F));

		PartDefinition cube_r25 = bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 150).addBox(-1.2225F, -0.0058F, -2.6023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.9F, -0.1911F, -0.9817F, 1.2204F, 0.0253F, -0.1016F));

		PartDefinition cube_r26 = bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(71, 129).addBox(-1.3661F, 1.0342F, -6.1775F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9973F, 14.6598F, -3.503F, -0.8278F, 0.3386F, -0.347F));

		PartDefinition cube_r27 = bodyfront.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(41, 133).addBox(-3.9973F, 1.0342F, -5.2886F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9973F, 14.6598F, -3.503F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bodyfront.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(124, 71).addBox(-5.9973F, 0.4325F, -1.9366F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9973F, 14.6598F, -3.503F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bodyfront.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(128, 45).addBox(-1.1771F, 0.688F, -0.8582F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9973F, 14.6598F, -3.503F, -0.2077F, -0.56F, -0.9021F));

		PartDefinition cube_r30 = bodyfront.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(96, 48).addBox(-0.7984F, 0.9653F, -0.1034F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9973F, 14.6598F, -3.503F, 0.1286F, -0.7847F, -0.5983F));

		PartDefinition cube_r31 = bodyfront.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(121, 28).addBox(-0.3942F, 0.9684F, -0.4609F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9973F, 14.6598F, -3.503F, 0.4211F, -0.9626F, -0.4444F));

		PartDefinition bodyfront_r6 = bodyfront.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(45, 74).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1369F, -10.8602F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r64 = bodyfront.addOrReplaceChild("bodymiddle_r64", CubeListBuilder.create().texOffs(158, 66).addBox(4.1421F, -4.1421F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.3369F, -9.4602F, 0.1422F, -0.6769F, 1.6603F));

		PartDefinition bodymiddle_r65 = bodyfront.addOrReplaceChild("bodymiddle_r65", CubeListBuilder.create().texOffs(157, 52).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.3369F, -9.4602F, 0.5081F, -0.4881F, 1.014F));

		PartDefinition bodymiddle_r66 = bodyfront.addOrReplaceChild("bodymiddle_r66", CubeListBuilder.create().texOffs(157, 54).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.3369F, -9.4602F, 0.6509F, -0.2459F, 0.6235F));

		PartDefinition bodymiddle_r67 = bodyfront.addOrReplaceChild("bodymiddle_r67", CubeListBuilder.create().texOffs(37, 157).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.9369F, -7.1602F, 0.3651F, -0.3715F, 0.8295F));

		PartDefinition bodymiddle_r68 = bodyfront.addOrReplaceChild("bodymiddle_r68", CubeListBuilder.create().texOffs(144, 17).addBox(4.1421F, -4.1421F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.9369F, -7.1602F, 0.0979F, -0.5063F, 1.4407F));

		PartDefinition bodymiddle_r69 = bodyfront.addOrReplaceChild("bodymiddle_r69", CubeListBuilder.create().texOffs(157, 50).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.9369F, -7.1602F, 0.4816F, -0.1896F, 0.4158F));

		PartDefinition bodymiddle_r70 = bodyfront.addOrReplaceChild("bodymiddle_r70", CubeListBuilder.create().texOffs(157, 16).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5369F, -5.0602F, 0.4151F, -0.1655F, 0.3927F));

		PartDefinition bodymiddle_r71 = bodyfront.addOrReplaceChild("bodymiddle_r71", CubeListBuilder.create().texOffs(157, 27).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5369F, -5.0602F, 0.3117F, -0.323F, 0.8127F));

		PartDefinition bodymiddle_r72 = bodyfront.addOrReplaceChild("bodymiddle_r72", CubeListBuilder.create().texOffs(130, 13).addBox(4.1421F, -4.1421F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5369F, -5.0602F, 0.0826F, -0.4378F, 1.4128F));

		PartDefinition bodymiddle_r73 = bodyfront.addOrReplaceChild("bodymiddle_r73", CubeListBuilder.create().texOffs(156, 154).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.1369F, -2.3602F, 0.2601F, -0.2736F, 0.793F));

		PartDefinition bodymiddle_r74 = bodyfront.addOrReplaceChild("bodymiddle_r74", CubeListBuilder.create().texOffs(156, 156).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.1369F, -2.3602F, 0.349F, -0.1407F, 0.3678F));

		PartDefinition bodymiddle_r75 = bodyfront.addOrReplaceChild("bodymiddle_r75", CubeListBuilder.create().texOffs(121, 32).addBox(4.1421F, -4.1421F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.1369F, -2.3602F, 0.0683F, -0.3693F, 1.3835F));

		PartDefinition bodymiddle_r76 = bodyfront.addOrReplaceChild("bodymiddle_r76", CubeListBuilder.create().texOffs(156, 150).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0631F, -0.1602F, 0.2998F, -0.1217F, 0.3743F));

		PartDefinition bodymiddle_r77 = bodyfront.addOrReplaceChild("bodymiddle_r77", CubeListBuilder.create().texOffs(156, 152).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0631F, -0.1602F, 0.2223F, -0.2361F, 0.8026F));

		PartDefinition bodymiddle_r78 = bodyfront.addOrReplaceChild("bodymiddle_r78", CubeListBuilder.create().texOffs(119, 17).addBox(4.1421F, -4.1421F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0631F, -0.1602F, 0.058F, -0.3178F, 1.387F));

		PartDefinition neckbase = bodyfront.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1369F, -10.6602F, -0.3436F, 0.1233F, -0.044F));

		PartDefinition neckbase_r1 = neckbase.addOrReplaceChild("neckbase_r1", CubeListBuilder.create().texOffs(37, 141).addBox(0.0F, -4.3747F, 0.2832F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0351F, -2.8657F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neckbase_r2 = neckbase.addOrReplaceChild("neckbase_r2", CubeListBuilder.create().texOffs(108, 158).addBox(0.0F, -3.6794F, 0.0805F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0351F, -4.8657F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neckbase_r3 = neckbase.addOrReplaceChild("neckbase_r3", CubeListBuilder.create().texOffs(93, 158).addBox(0.0F, -4.0003F, 0.0349F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0351F, -7.8657F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neckbase_r4 = neckbase.addOrReplaceChild("neckbase_r4", CubeListBuilder.create().texOffs(75, 98).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9649F, -7.8657F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r79 = neckbase.addOrReplaceChild("bodymiddle_r79", CubeListBuilder.create().texOffs(152, 103).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0649F, -4.4657F, 0.7612F, 0.898F, -0.5521F));

		PartDefinition bodymiddle_r80 = neckbase.addOrReplaceChild("bodymiddle_r80", CubeListBuilder.create().texOffs(157, 60).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0649F, -4.4657F, 0.1302F, 1.0983F, -1.2895F));

		PartDefinition bodymiddle_r81 = neckbase.addOrReplaceChild("bodymiddle_r81", CubeListBuilder.create().texOffs(152, 86).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1649F, -7.4657F, 0.7221F, 0.9872F, -0.6024F));

		PartDefinition bodymiddle_r82 = neckbase.addOrReplaceChild("bodymiddle_r82", CubeListBuilder.create().texOffs(157, 58).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1649F, -7.4657F, -0.0545F, 1.1438F, -1.4747F));

		PartDefinition bodymiddle_r83 = neckbase.addOrReplaceChild("bodymiddle_r83", CubeListBuilder.create().texOffs(151, 69).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0649F, -2.2657F, 0.7895F, 0.868F, -0.5302F));

		PartDefinition bodymiddle_r84 = neckbase.addOrReplaceChild("bodymiddle_r84", CubeListBuilder.create().texOffs(157, 56).mirror().addBox(-5.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0649F, -2.2657F, 0.2024F, 1.0876F, -1.2254F));

		PartDefinition bodymiddle_r85 = neckbase.addOrReplaceChild("bodymiddle_r85", CubeListBuilder.create().texOffs(157, 60).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0649F, -4.4657F, 0.1302F, -1.0983F, 1.2895F));

		PartDefinition bodymiddle_r86 = neckbase.addOrReplaceChild("bodymiddle_r86", CubeListBuilder.create().texOffs(152, 103).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0649F, -4.4657F, 0.7612F, -0.898F, 0.5521F));

		PartDefinition bodymiddle_r87 = neckbase.addOrReplaceChild("bodymiddle_r87", CubeListBuilder.create().texOffs(157, 58).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1649F, -7.4657F, -0.0545F, -1.1438F, 1.4747F));

		PartDefinition bodymiddle_r88 = neckbase.addOrReplaceChild("bodymiddle_r88", CubeListBuilder.create().texOffs(152, 86).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1649F, -7.4657F, 0.7221F, -0.9872F, 0.6024F));

		PartDefinition bodymiddle_r89 = neckbase.addOrReplaceChild("bodymiddle_r89", CubeListBuilder.create().texOffs(157, 56).addBox(2.7189F, -1.2679F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0649F, -2.2657F, 0.2024F, -1.0876F, 1.2254F));

		PartDefinition bodymiddle_r90 = neckbase.addOrReplaceChild("bodymiddle_r90", CubeListBuilder.create().texOffs(151, 69).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0649F, -2.2657F, 0.7895F, -0.868F, 0.5302F));

		PartDefinition neckmiddlebase = neckbase.addOrReplaceChild("neckmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2351F, -7.3657F, -0.2828F, 0.2046F, 0.0751F));

		PartDefinition neckmiddlebase_r1 = neckmiddlebase.addOrReplaceChild("neckmiddlebase_r1", CubeListBuilder.create().texOffs(11, 137).addBox(0.0F, -3.3829F, -0.0247F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.254F, -3.1205F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neckmiddlebase_r2 = neckmiddlebase.addOrReplaceChild("neckmiddlebase_r2", CubeListBuilder.create().texOffs(0, 129).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.554F, -4.9205F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r91 = neckmiddlebase.addOrReplaceChild("bodymiddle_r91", CubeListBuilder.create().texOffs(137, 116).mirror().addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.054F, -2.8205F, 0.5591F, 1.0905F, -0.9002F));

		PartDefinition bodymiddle_r92 = neckmiddlebase.addOrReplaceChild("bodymiddle_r92", CubeListBuilder.create().texOffs(137, 116).addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.054F, -2.8205F, 0.5591F, -1.0905F, 0.9002F));

		PartDefinition neckmiddleend = neckmiddlebase.addOrReplaceChild("neckmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.654F, -5.0205F, 0.0266F, 0.2172F, 0.0484F));

		PartDefinition neckmiddleend_r1 = neckmiddleend.addOrReplaceChild("neckmiddleend_r1", CubeListBuilder.create().texOffs(100, 139).addBox(0.01F, -3.123F, -0.0687F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7164F, -0.171F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neckmiddleend_r2 = neckmiddleend.addOrReplaceChild("neckmiddleend_r2", CubeListBuilder.create().texOffs(45, 68).addBox(0.01F, -3.2F, 3.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 136).addBox(0.01F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 19).addBox(-0.99F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6164F, -5.671F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r93 = neckmiddleend.addOrReplaceChild("bodymiddle_r93", CubeListBuilder.create().texOffs(144, 27).mirror().addBox(-4.9149F, 0.0512F, -0.5121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.99F, -0.5164F, -5.371F, 0.5815F, 1.0198F, -1.0046F));

		PartDefinition bodymiddle_r94 = neckmiddleend.addOrReplaceChild("bodymiddle_r94", CubeListBuilder.create().texOffs(137, 120).mirror().addBox(-5.9149F, 0.0512F, -0.5121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.99F, -0.1164F, -2.471F, 0.4107F, 0.9202F, -1.0556F));

		PartDefinition bodymiddle_r95 = neckmiddleend.addOrReplaceChild("bodymiddle_r95", CubeListBuilder.create().texOffs(137, 118).mirror().addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 0.2836F, -0.271F, 0.3829F, 0.9288F, -1.102F));

		PartDefinition bodymiddle_r96 = neckmiddleend.addOrReplaceChild("bodymiddle_r96", CubeListBuilder.create().texOffs(144, 27).addBox(-0.0851F, 0.0512F, -0.5121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, -0.5164F, -5.371F, 0.5815F, -1.0198F, 1.0046F));

		PartDefinition bodymiddle_r97 = neckmiddleend.addOrReplaceChild("bodymiddle_r97", CubeListBuilder.create().texOffs(137, 120).addBox(-0.0851F, 0.0512F, -0.5121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, -0.1164F, -2.471F, 0.4107F, -0.9202F, 1.0556F));

		PartDefinition bodymiddle_r98 = neckmiddleend.addOrReplaceChild("bodymiddle_r98", CubeListBuilder.create().texOffs(137, 118).addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, 0.2836F, -0.271F, 0.3829F, -0.9288F, 1.102F));

		PartDefinition neckend = neckmiddleend.addOrReplaceChild("neckend", CubeListBuilder.create().texOffs(124, 88).addBox(-0.99F, -1.098F, -4.8684F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5164F, -5.371F, 0.1097F, 0.2125F, 0.0661F));

		PartDefinition neckend_r1 = neckend.addOrReplaceChild("neckend_r1", CubeListBuilder.create().texOffs(71, 124).addBox(0.0F, -2.9953F, 0.0027F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.098F, -1.8684F, -0.192F, 0.0F, 0.0F));

		PartDefinition neckend_r2 = neckend.addOrReplaceChild("neckend_r2", CubeListBuilder.create().texOffs(111, 162).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.098F, -3.8684F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r99 = neckend.addOrReplaceChild("bodymiddle_r99", CubeListBuilder.create().texOffs(150, 88).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 0.002F, -1.6684F, 0.2478F, 0.7699F, -1.1733F));

		PartDefinition bodymiddle_r100 = neckend.addOrReplaceChild("bodymiddle_r100", CubeListBuilder.create().texOffs(150, 88).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, 0.002F, -1.6684F, 0.2478F, -0.7699F, 1.1733F));

		PartDefinition head = neckend.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.302F, -4.3684F, 0.0637F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(29, 158).mirror().addBox(-4.5F, -3.0352F, -0.0731F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(29, 158).addBox(1.68F, -3.0352F, -0.0731F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.92F, 0.1862F, -2.5029F, -0.9425F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(46, 158).mirror().addBox(-4.5F, -1.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 158).addBox(1.68F, -1.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.92F, -0.5471F, -0.7673F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neckendridgeb_r1 = head.addOrReplaceChild("neckendridgeb_r1", CubeListBuilder.create().texOffs(139, 88).addBox(-1.5F, -1.1F, -0.8F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -1.8F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(139, 150).mirror().addBox(-4.5F, -0.0764F, -0.0446F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(139, 150).addBox(1.68F, -0.0764F, -0.0446F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.92F, 3.1862F, -2.0029F, 1.0123F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(146, 148).mirror().addBox(-4.5F, -3.9598F, -1.8463F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(146, 148).addBox(1.68F, -3.9598F, -1.8463F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.92F, 3.1862F, 1.3971F, 0.3665F, 0.0F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(132, 150).mirror().addBox(-4.5F, -2.3F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(132, 150).addBox(1.68F, -2.3F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.92F, 2.1862F, -0.8029F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(147, 45).mirror().addBox(-4.5F, -0.0395F, -0.0274F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(147, 45).addBox(1.48F, -0.0395F, -0.0274F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.02F, -2.3211F, 0.5369F, -0.8029F, 0.0F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(78, 136).mirror().addBox(-4.5F, -7.2F, -2.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 136).addBox(1.48F, -7.2F, -2.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.02F, 4.7789F, 2.8369F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(19, 158).mirror().addBox(-0.5F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(19, 158).addBox(5.48F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.98F, 4.1684F, 2.4108F, 0.5934F, 0.0F, 0.0F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(141, 34).addBox(-1.5F, -0.0716F, -1.9748F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0211F, -15.9631F, 0.6807F, 0.0F, 0.0F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(152, 98).addBox(-0.5F, 0.0764F, -0.1424F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2211F, -15.8631F, 0.4887F, 0.0F, 0.0F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(26, 141).addBox(-1.5F, -0.0968F, -1.9059F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.7211F, -14.1631F, 0.384F, 0.0F, 0.0F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(9, 153).addBox(-0.5F, -0.0685F, -0.0162F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5211F, -9.3631F, 0.0175F, 0.0F, 0.0F));

		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(152, 114).addBox(-0.5F, -0.052F, -0.0238F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9211F, -11.2631F, 0.3142F, 0.0F, 0.0F));

		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(109, 143).addBox(-0.5F, 0.0191F, 0.1075F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0211F, -14.2631F, 0.3142F, 0.0F, 0.0F));

		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(134, 0).addBox(-1.5F, -0.0486F, -6.9938F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(130, 7).addBox(-3.0F, -0.0486F, -1.9938F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(137, 112).addBox(-2.0F, -0.0486F, -3.9938F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7211F, -7.3631F, 0.2793F, 0.0F, 0.0F));

		PartDefinition head_r16 = head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(101, 91).addBox(-3.0F, -0.0399F, -4.0249F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2211F, -3.3631F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head_r17 = head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(54, 20).addBox(-4.0F, -0.3993F, -3.8026F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0211F, 0.2369F, -0.2269F, 0.0F, 0.0F));

		PartDefinition head_r18 = head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(97, 25).addBox(-3.5F, -2.5F, -1.8F, 7.0F, 5.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.7007F, -1.0332F, -0.1222F, 0.0F, 0.0F));

		PartDefinition head_r19 = head.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(95, 63).addBox(-3.5F, -6.9F, -5.0F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.7789F, 2.8369F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head_r20 = head.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(93, 17).addBox(-3.5F, -3.1057F, -3.9685F, 7.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.3789F, 0.7369F, -0.0262F, 0.0F, 0.0F));

		PartDefinition upperjawbase = head.addOrReplaceChild("upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8211F, -7.7631F, 0.2546F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r1 = upperjawbase.addOrReplaceChild("upperjawbase_r1", CubeListBuilder.create().texOffs(159, 4).addBox(1.51F, -1.99F, -0.0588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.975F, 1.5F, -11.7F, -1.2915F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r2 = upperjawbase.addOrReplaceChild("upperjawbase_r2", CubeListBuilder.create().texOffs(161, 87).addBox(1.51F, 3.5923F, -5.0083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 19).addBox(2.575F, -0.9077F, -1.8083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.975F, 3.7F, -6.0F, -0.9948F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r3 = upperjawbase.addOrReplaceChild("upperjawbase_r3", CubeListBuilder.create().texOffs(151, 127).mirror().addBox(-2.9339F, -3.0391F, -0.1137F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.08F, 0.3104F, -1.4071F, -1.6929F, -0.1788F, 0.0041F));

		PartDefinition upperjawbase_r4 = upperjawbase.addOrReplaceChild("upperjawbase_r4", CubeListBuilder.create().texOffs(52, 153).mirror().addBox(-2.9339F, -0.0374F, -0.0991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.08F, 0.3104F, -1.4071F, -1.274F, -0.1788F, 0.0041F));

		PartDefinition upperjawbase_r5 = upperjawbase.addOrReplaceChild("upperjawbase_r5", CubeListBuilder.create().texOffs(30, 132).mirror().addBox(-0.8499F, -1.004F, -2.5952F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.164F, 2.7256F, -0.7643F, -0.3475F, -0.1542F, -0.005F));

		PartDefinition upperjawbase_r6 = upperjawbase.addOrReplaceChild("upperjawbase_r6", CubeListBuilder.create().texOffs(52, 153).addBox(1.9339F, -0.0374F, -0.0991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1F, 0.3104F, -1.4071F, -1.274F, 0.1788F, -0.0041F));

		PartDefinition upperjawbase_r7 = upperjawbase.addOrReplaceChild("upperjawbase_r7", CubeListBuilder.create().texOffs(161, 18).mirror().addBox(0.0358F, -0.0826F, -1.0381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5687F, 3.3678F, -6.7892F, -1.0055F, -0.1392F, 0.0185F));

		PartDefinition upperjawbase_r8 = upperjawbase.addOrReplaceChild("upperjawbase_r8", CubeListBuilder.create().texOffs(161, 18).addBox(-1.0358F, -0.0826F, -1.0381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5887F, 3.3678F, -6.7892F, -1.0055F, 0.1392F, -0.0185F));

		PartDefinition upperjawbase_r9 = upperjawbase.addOrReplaceChild("upperjawbase_r9", CubeListBuilder.create().texOffs(151, 127).addBox(1.9339F, -3.0391F, -0.1137F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3104F, -1.4071F, -1.6929F, 0.1788F, -0.0041F));

		PartDefinition upperjawbase_r10 = upperjawbase.addOrReplaceChild("upperjawbase_r10", CubeListBuilder.create().texOffs(125, 151).addBox(1.5F, 1.9961F, -0.1104F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3104F, -1.4071F, -1.2741F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r11 = upperjawbase.addOrReplaceChild("upperjawbase_r11", CubeListBuilder.create().texOffs(153, 29).addBox(1.6F, -1.8721F, -1.9778F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.5F, -4.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r12 = upperjawbase.addOrReplaceChild("upperjawbase_r12", CubeListBuilder.create().texOffs(30, 132).addBox(-0.1501F, -1.004F, -2.5952F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.184F, 2.7256F, -0.7643F, -0.3475F, 0.1542F, 0.005F));

		PartDefinition upperjawmiddle = upperjawbase.addOrReplaceChild("upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0F, -10.0F, -0.2546F, 0.0F, 0.0F));

		PartDefinition upperjawfront = upperjawmiddle.addOrReplaceChild("upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1061F, 0.0F, 0.0F));

		PartDefinition nose = upperjawfront.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -3.0F, -3.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition nose_r1 = nose.addOrReplaceChild("nose_r1", CubeListBuilder.create().texOffs(65, 136).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.684F, 2.2526F, -0.9948F, 0.0F, 0.0F));

		PartDefinition rupperteethfront = upperjawfront.addOrReplaceChild("rupperteethfront", CubeListBuilder.create().texOffs(158, 10).addBox(-0.5F, -1.7F, 0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.55F, -1.2F, 0.2759F, 0.1061F, 0.0F));

		PartDefinition upperfrontteeth = upperjawfront.addOrReplaceChild("upperfrontteeth", CubeListBuilder.create().texOffs(151, 90).addBox(-0.1F, -0.7F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 90).mirror().addBox(-0.88F, -0.7F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, -2.7F, 0.3821F, 0.0F, 0.0F));

		PartDefinition nasalridgebase = upperjawmiddle.addOrReplaceChild("nasalridgebase", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -6.0F, -4.0F, -0.658F, 0.0F, 0.0F));

		PartDefinition nasalridgebase_r1 = nasalridgebase.addOrReplaceChild("nasalridgebase_r1", CubeListBuilder.create().texOffs(15, 129).addBox(-1.48F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition rupperteethmidfront = upperjawmiddle.addOrReplaceChild("rupperteethmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(2.05F, -0.4F, -1.9F, -0.1698F, 0.1061F, 0.0F));

		PartDefinition rupperteethmidfront_r1 = rupperteethmidfront.addOrReplaceChild("rupperteethmidfront_r1", CubeListBuilder.create().texOffs(150, 56).addBox(-0.4F, -2.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightnasalridgebase = upperjawbase.addOrReplaceChild("rightnasalridgebase", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, -0.6F, -10.1F, 0.1911F, 0.0213F, -0.0424F));

		PartDefinition rightnasalridgeend = rightnasalridgebase.addOrReplaceChild("rightnasalridgeend", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 1.2F, 5.9F, -0.4275F, 0.2587F, 0.0977F));

		PartDefinition rightnasalridgeend_r1 = rightnasalridgeend.addOrReplaceChild("rightnasalridgeend_r1", CubeListBuilder.create().texOffs(91, 139).addBox(0.5F, -0.0335F, 0.6215F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3F, -1.2F, 2.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightnasalridgeend_r2 = rightnasalridgeend.addOrReplaceChild("rightnasalridgeend_r2", CubeListBuilder.create().texOffs(137, 128).addBox(0.5F, 0.2F, 0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.2F, -0.5F, 0.384F, 0.0F, 0.0F));

		PartDefinition rupperteethmidback = upperjawbase.addOrReplaceChild("rupperteethmidback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 8.0F, -7.2F, 0.0F, 0.0424F, 0.0F));

		PartDefinition rupperteethmidback_r1 = rupperteethmidback.addOrReplaceChild("rupperteethmidback_r1", CubeListBuilder.create().texOffs(54, 134).addBox(-0.3F, -2.0F, -5.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition upperjawbase2 = head.addOrReplaceChild("upperjawbase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, -1.8211F, -7.7631F, 0.2546F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r13 = upperjawbase2.addOrReplaceChild("upperjawbase_r13", CubeListBuilder.create().texOffs(125, 83).mirror().addBox(-2.5F, -0.1883F, 0.0562F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.9F, -4.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r14 = upperjawbase2.addOrReplaceChild("upperjawbase_r14", CubeListBuilder.create().texOffs(159, 4).mirror().addBox(-2.51F, -1.99F, -0.0588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.975F, 1.5F, -11.7F, -1.2915F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r15 = upperjawbase2.addOrReplaceChild("upperjawbase_r15", CubeListBuilder.create().texOffs(161, 87).mirror().addBox(-2.51F, 3.5923F, -5.0083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(154, 19).mirror().addBox(-3.575F, -0.9077F, -1.8083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.975F, 3.7F, -6.0F, -0.9948F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r16 = upperjawbase2.addOrReplaceChild("upperjawbase_r16", CubeListBuilder.create().texOffs(125, 151).mirror().addBox(-2.5F, 1.9961F, -0.1104F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3104F, -1.4071F, -1.2741F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r17 = upperjawbase2.addOrReplaceChild("upperjawbase_r17", CubeListBuilder.create().texOffs(153, 29).mirror().addBox(-2.6F, -1.8721F, -1.9778F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5F, -4.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r18 = upperjawbase2.addOrReplaceChild("upperjawbase_r18", CubeListBuilder.create().texOffs(33, 89).addBox(-0.7699F, -1.6459F, -3.021F, 4.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.184F, 2.7256F, -0.7643F, -0.0522F, -0.1788F, 0.0041F));

		PartDefinition upperjawbase_r19 = upperjawbase2.addOrReplaceChild("upperjawbase_r19", CubeListBuilder.create().texOffs(33, 89).mirror().addBox(-3.2301F, -1.6459F, -3.021F, 4.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.164F, 2.7256F, -0.7643F, -0.0522F, 0.1788F, -0.0041F));

		PartDefinition upperjawbase_r20 = upperjawbase2.addOrReplaceChild("upperjawbase_r20", CubeListBuilder.create().texOffs(92, 118).mirror().addBox(-2.5F, -6.0402F, -0.0425F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8F, -7.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition upperjawbase_r21 = upperjawbase2.addOrReplaceChild("upperjawbase_r21", CubeListBuilder.create().texOffs(115, 7).addBox(0.0758F, -2.6342F, -2.6027F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5887F, 3.3678F, -6.7892F, -0.1678F, -0.1392F, 0.0185F));

		PartDefinition upperjawbase_r22 = upperjawbase2.addOrReplaceChild("upperjawbase_r22", CubeListBuilder.create().texOffs(115, 7).mirror().addBox(-3.0758F, -2.6342F, -2.6027F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5687F, 3.3678F, -6.7892F, -0.1678F, 0.1392F, -0.0185F));

		PartDefinition upperjawmiddle2 = upperjawbase2.addOrReplaceChild("upperjawmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0F, -10.0F, -0.2546F, 0.0F, 0.0F));

		PartDefinition upperjawmiddle_r1 = upperjawmiddle2.addOrReplaceChild("upperjawmiddle_r1", CubeListBuilder.create().texOffs(124, 76).mirror().addBox(-2.0F, -3.1F, -3.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6F, -0.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition upperjawfront2 = upperjawmiddle2.addOrReplaceChild("upperjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1061F, 0.0F, 0.0F));

		PartDefinition upperjawfront_r1 = upperjawfront2.addOrReplaceChild("upperjawfront_r1", CubeListBuilder.create().texOffs(133, 47).mirror().addBox(-1.0F, -1.0F, -2.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, 0.5F, 0.384F, 0.0F, 0.0F));

		PartDefinition nose2 = upperjawfront2.addOrReplaceChild("nose2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -3.0F, -3.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition nose_r2 = nose2.addOrReplaceChild("nose_r2", CubeListBuilder.create().texOffs(122, 129).mirror().addBox(-1.52F, -2.0232F, -0.0402F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8F, 0.5F, 0.2094F, 0.0F, 0.0F));

		PartDefinition nose_r3 = nose2.addOrReplaceChild("nose_r3", CubeListBuilder.create().texOffs(12, 143).mirror().addBox(-1.0F, 0.0F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.8F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rupperteethfront2 = upperjawfront2.addOrReplaceChild("rupperteethfront2", CubeListBuilder.create().texOffs(158, 10).mirror().addBox(0.5F, -1.7F, 0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.55F, -1.2F, 0.2759F, -0.1061F, 0.0F));

		PartDefinition upperfrontteeth2 = upperjawfront2.addOrReplaceChild("upperfrontteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -2.7F, 0.3821F, 0.0F, 0.0F));

		PartDefinition nasalridgebase2 = upperjawmiddle2.addOrReplaceChild("nasalridgebase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -6.0F, -4.0F, -0.658F, 0.0F, 0.0F));

		PartDefinition nasalridgebase_r2 = nasalridgebase2.addOrReplaceChild("nasalridgebase_r2", CubeListBuilder.create().texOffs(125, 109).mirror().addBox(-0.725F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.5F, -3.9979F, 4.0305F, -0.7311F, 0.0584F, 0.0649F));

		PartDefinition rupperteethmidfront2 = upperjawmiddle2.addOrReplaceChild("rupperteethmidfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.05F, -0.4F, -1.9F, -0.1698F, -0.1061F, 0.0F));

		PartDefinition rupperteethmidfront_r2 = rupperteethmidfront2.addOrReplaceChild("rupperteethmidfront_r2", CubeListBuilder.create().texOffs(150, 56).mirror().addBox(0.4F, -2.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftnasalridgebase = upperjawbase2.addOrReplaceChild("leftnasalridgebase", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.25F, -0.6F, -10.1F, 0.1911F, -0.0213F, 0.0424F));

		PartDefinition leftnasalridgeend = leftnasalridgebase.addOrReplaceChild("leftnasalridgeend", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 1.2F, 5.9F, -0.4275F, -0.2587F, -0.0977F));

		PartDefinition leftnasalridgeend_r1 = leftnasalridgeend.addOrReplaceChild("leftnasalridgeend_r1", CubeListBuilder.create().texOffs(91, 139).mirror().addBox(-1.5F, -0.0335F, 0.6215F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.2F, 2.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftnasalridgeend_r2 = leftnasalridgeend.addOrReplaceChild("leftnasalridgeend_r2", CubeListBuilder.create().texOffs(137, 128).mirror().addBox(-1.5F, 0.2F, 0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.2F, -0.5F, 0.384F, 0.0F, 0.0F));

		PartDefinition rupperteethmidback2 = upperjawbase2.addOrReplaceChild("rupperteethmidback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 8.0F, -7.2F, 0.0F, -0.0424F, 0.0F));

		PartDefinition rupperteethmidback_r2 = rupperteethmidback2.addOrReplaceChild("rupperteethmidback_r2", CubeListBuilder.create().texOffs(54, 134).mirror().addBox(0.3F, -2.0F, -5.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, 2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition lowerjawback = head.addOrReplaceChild("lowerjawback", CubeListBuilder.create().texOffs(31, 81).addBox(2.4038F, 0.2159F, -7.449F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(31, 81).mirror().addBox(-3.3838F, 0.2159F, -7.449F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.488F, 3.6328F, 0.6894F, 0.0F, 0.0F));

		PartDefinition head_r21 = lowerjawback.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(157, 121).mirror().addBox(-3.4038F, -0.1646F, 0.078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(157, 121).addBox(2.5838F, -0.1646F, 0.078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.08F, 2.1414F, -4.2965F, -1.2566F, 0.0F, 0.0F));

		PartDefinition head_r22 = lowerjawback.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(13, 115).mirror().addBox(-3.4038F, -2.1876F, -0.8151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(13, 115).addBox(2.5838F, -2.1876F, -0.8151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.08F, 4.1414F, -5.3965F, -0.925F, 0.0F, 0.0F));

		PartDefinition head_r23 = lowerjawback.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(157, 108).mirror().addBox(-3.4038F, -1.5041F, -0.0176F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(157, 108).addBox(2.5838F, -1.5041F, -0.0176F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.08F, 3.0732F, -6.5585F, -1.6581F, 0.0F, 0.0F));

		PartDefinition lowerjawback_r1 = lowerjawback.addOrReplaceChild("lowerjawback_r1", CubeListBuilder.create().texOffs(138, 19).mirror().addBox(0.5962F, -3.874F, -2.5084F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(138, 19).addBox(6.3838F, -3.874F, -2.5084F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.98F, 4.4161F, -4.8452F, 0.1396F, 0.0F, 0.0F));

		PartDefinition lowerjawback_r2 = lowerjawback.addOrReplaceChild("lowerjawback_r2", CubeListBuilder.create().texOffs(147, 6).mirror().addBox(0.5962F, 0.1324F, -0.1242F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(147, 6).addBox(6.3838F, 0.1324F, -0.1242F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.98F, 0.1161F, -2.6452F, 0.1745F, 0.0F, 0.0F));

		PartDefinition lowerjawback_r3 = lowerjawback.addOrReplaceChild("lowerjawback_r3", CubeListBuilder.create().texOffs(122, 135).mirror().addBox(0.5962F, -1.5912F, -3.8743F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(122, 135).addBox(6.3838F, -1.5912F, -3.8743F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.98F, 2.1161F, -1.4452F, 0.5585F, 0.0F, 0.0F));

		PartDefinition lowerjawback_r4 = lowerjawback.addOrReplaceChild("lowerjawback_r4", CubeListBuilder.create().texOffs(158, 134).mirror().addBox(0.5962F, -1.8486F, -1.0812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(158, 134).addBox(6.3838F, -1.8486F, -1.0812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.98F, 1.3161F, -0.8452F, 1.1519F, 0.0F, 0.0F));

		PartDefinition lowerjawback_r5 = lowerjawback.addOrReplaceChild("lowerjawback_r5", CubeListBuilder.create().texOffs(144, 29).mirror().addBox(0.5962F, 0.7845F, 0.6199F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(144, 29).addBox(6.3838F, 0.7845F, 0.6199F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.98F, 0.6161F, -2.9452F, 0.5236F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddleback = lowerjawback.addOrReplaceChild("lowerjawmiddleback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4161F, -11.4452F, 0.1061F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddleback_r1 = lowerjawmiddleback.addOrReplaceChild("lowerjawmiddleback_r1", CubeListBuilder.create().texOffs(0, 144).addBox(-0.2075F, -2.6211F, -2.4759F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3887F, 4.5737F, -2.9159F, -0.1657F, 0.0759F, 0.007F));

		PartDefinition lowerjawmiddleback_r2 = lowerjawmiddleback.addOrReplaceChild("lowerjawmiddleback_r2", CubeListBuilder.create().texOffs(143, 99).addBox(-0.2075F, -3.8431F, -1.5229F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3887F, 4.5737F, -2.9159F, 0.131F, 0.0759F, 0.007F));

		PartDefinition lowerjawmiddle = lowerjawmiddleback.addOrReplaceChild("lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.0F, -4.0F, 0.1911F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddle_r1 = lowerjawmiddle.addOrReplaceChild("lowerjawmiddle_r1", CubeListBuilder.create().texOffs(147, 62).addBox(-0.0926F, -1.91F, -5.1509F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3987F, 4.5737F, 1.0841F, -0.1314F, 0.0759F, -0.0076F));

		PartDefinition lowerjawmiddle_r2 = lowerjawmiddle.addOrReplaceChild("lowerjawmiddle_r2", CubeListBuilder.create().texOffs(143, 93).addBox(-0.0926F, -3.9807F, -4.8345F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3987F, 4.5737F, 1.0841F, 0.0781F, 0.0759F, -0.0076F));

		PartDefinition lowerjawmiddlefront = lowerjawmiddle.addOrReplaceChild("lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2546F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront_r1 = lowerjawmiddlefront.addOrReplaceChild("lowerjawmiddlefront_r1", CubeListBuilder.create().texOffs(109, 137).addBox(-0.1068F, -3.7067F, -8.8904F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3987F, 1.5737F, 5.0841F, 0.0265F, 0.0753F, 0.0118F));

		PartDefinition lowerjawend = lowerjawmiddlefront.addOrReplaceChild("lowerjawend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.9F, -0.1274F, 0.0F, 0.0F));

		PartDefinition lowerjawend_r1 = lowerjawend.addOrReplaceChild("lowerjawend_r1", CubeListBuilder.create().texOffs(152, 93).addBox(-0.2151F, -3.7313F, -10.4061F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3987F, 1.5737F, 8.9841F, 0.0268F, 0.0732F, 0.0213F));

		PartDefinition chin = lowerjawend.addOrReplaceChild("chin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.2F, 0.12F, 0.1485F, 0.0F, 0.0F));

		PartDefinition chin_r1 = chin.addOrReplaceChild("chin_r1", CubeListBuilder.create().texOffs(148, 122).addBox(-0.204F, -3.8108F, -9.9683F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4087F, 1.3737F, 8.8641F, 0.166F, 0.0756F, 0.0102F));

		PartDefinition chin_r2 = chin.addOrReplaceChild("chin_r2", CubeListBuilder.create().texOffs(148, 105).addBox(-1.47F, -0.1337F, -0.0175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition chin_r3 = chin.addOrReplaceChild("chin_r3", CubeListBuilder.create().texOffs(143, 82).addBox(-0.1196F, -3.8721F, -7.6144F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4087F, 1.3737F, 8.8641F, 0.0613F, 0.0756F, 0.0102F));

		PartDefinition rlowerteethfront = lowerjawend.addOrReplaceChild("rlowerteethfront", CubeListBuilder.create().texOffs(162, 108).addBox(-0.4F, 0.3F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -3.0F, -2.1F, 0.1698F, 0.1698F, 0.0F));

		PartDefinition lowerfrontteeth = lowerjawend.addOrReplaceChild("lowerfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.4F, 0.0213F, 0.0F, 0.0F));

		PartDefinition rlowerteethmidfront = lowerjawmiddlefront.addOrReplaceChild("rlowerteethmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, -3.1F, -2.4F, -0.1274F, 0.1061F, 0.0F));

		PartDefinition rlowerteethmidfront_r1 = rlowerteethmidfront.addOrReplaceChild("rlowerteethmidfront_r1", CubeListBuilder.create().texOffs(150, 75).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4947F, 0.8784F, 0.7664F, 0.1996F, -0.0127F, 0.0066F));

		PartDefinition rlowerteethmidback = lowerjawmiddle.addOrReplaceChild("rlowerteethmidback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 0.2F, -1.7F, -0.1698F, 0.0848F, 0.0F));

		PartDefinition rlowerteethmidback_r1 = rlowerteethmidback.addOrReplaceChild("rlowerteethmidback_r1", CubeListBuilder.create().texOffs(150, 108).addBox(0.5156F, -4.6615F, -4.2563F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8013F, 4.3737F, 2.7841F, 0.0095F, 0.0756F, 0.0076F));

		PartDefinition rlowerteethback = lowerjawmiddleback.addOrReplaceChild("rlowerteethback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 0.7F, -2.5F, -0.1274F, 0.0637F, 0.0F));

		PartDefinition rlowerteethback_r1 = rlowerteethback.addOrReplaceChild("rlowerteethback_r1", CubeListBuilder.create().texOffs(135, 158).addBox(-1.5415F, -0.4897F, -6.8477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4358F, -0.717F, 5.9432F, 0.0974F, -0.1105F, 0.0519F));

		PartDefinition lowerjawmiddleback3 = lowerjawback.addOrReplaceChild("lowerjawmiddleback3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, 0.4161F, -11.4452F, 0.1061F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddleback_r3 = lowerjawmiddleback3.addOrReplaceChild("lowerjawmiddleback_r3", CubeListBuilder.create().texOffs(0, 144).mirror().addBox(-0.7925F, -2.6211F, -2.4759F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3887F, 4.5737F, -2.9159F, -0.1657F, -0.0759F, -0.007F));

		PartDefinition lowerjawmiddleback_r4 = lowerjawmiddleback3.addOrReplaceChild("lowerjawmiddleback_r4", CubeListBuilder.create().texOffs(143, 99).mirror().addBox(-0.7925F, -3.8431F, -1.5229F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3887F, 4.5737F, -2.9159F, 0.131F, -0.0759F, -0.007F));

		PartDefinition lowerjawmiddle3 = lowerjawmiddleback3.addOrReplaceChild("lowerjawmiddle3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, -4.0F, 0.1911F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddle_r3 = lowerjawmiddle3.addOrReplaceChild("lowerjawmiddle_r3", CubeListBuilder.create().texOffs(147, 62).mirror().addBox(-0.9074F, -1.91F, -5.1509F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 4.5737F, 1.0841F, -0.1314F, -0.0759F, 0.0076F));

		PartDefinition lowerjawmiddle_r4 = lowerjawmiddle3.addOrReplaceChild("lowerjawmiddle_r4", CubeListBuilder.create().texOffs(143, 93).mirror().addBox(-0.9074F, -3.9807F, -4.8345F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 4.5737F, 1.0841F, 0.0781F, -0.0759F, 0.0076F));

		PartDefinition lowerjawmiddlefront3 = lowerjawmiddle3.addOrReplaceChild("lowerjawmiddlefront3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2546F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront_r2 = lowerjawmiddlefront3.addOrReplaceChild("lowerjawmiddlefront_r2", CubeListBuilder.create().texOffs(109, 137).mirror().addBox(-0.8932F, -3.7067F, -8.8904F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 1.5737F, 5.0841F, 0.0265F, -0.0753F, -0.0118F));

		PartDefinition lowerjawend3 = lowerjawmiddlefront3.addOrReplaceChild("lowerjawend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.9F, -0.1274F, 0.0F, 0.0F));

		PartDefinition lowerjawend_r2 = lowerjawend3.addOrReplaceChild("lowerjawend_r2", CubeListBuilder.create().texOffs(152, 93).mirror().addBox(-0.7849F, -3.7313F, -10.4061F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 1.5737F, 8.9841F, 0.0268F, -0.0732F, -0.0213F));

		PartDefinition chin3 = lowerjawend3.addOrReplaceChild("chin3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.2F, 0.12F, 0.1485F, 0.0F, 0.0F));

		PartDefinition chin_r4 = chin3.addOrReplaceChild("chin_r4", CubeListBuilder.create().texOffs(148, 122).mirror().addBox(-0.796F, -3.8108F, -9.9683F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4087F, 1.3737F, 8.8641F, 0.166F, -0.0756F, -0.0102F));

		PartDefinition chin_r5 = chin3.addOrReplaceChild("chin_r5", CubeListBuilder.create().texOffs(143, 82).mirror().addBox(-0.8804F, -3.8721F, -7.6144F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4087F, 1.3737F, 8.8641F, 0.0613F, -0.0756F, -0.0102F));

		PartDefinition rlowerteethfront3 = lowerjawend3.addOrReplaceChild("rlowerteethfront3", CubeListBuilder.create().texOffs(162, 108).mirror().addBox(0.4F, 0.3F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -3.0F, -2.1F, 0.1698F, -0.1698F, 0.0F));

		PartDefinition lowerfrontteeth3 = lowerjawend3.addOrReplaceChild("lowerfrontteeth3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.4F, 0.0213F, 0.0F, 0.0F));

		PartDefinition rlowerteethmidfront3 = lowerjawmiddlefront3.addOrReplaceChild("rlowerteethmidfront3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, -3.1F, -2.4F, -0.1274F, -0.1061F, 0.0F));

		PartDefinition rlowerteethmidfront_r2 = rlowerteethmidfront3.addOrReplaceChild("rlowerteethmidfront_r2", CubeListBuilder.create().texOffs(150, 75).mirror().addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4947F, 0.8784F, 0.7664F, 0.1996F, 0.0127F, -0.0066F));

		PartDefinition rlowerteethmidback3 = lowerjawmiddle3.addOrReplaceChild("rlowerteethmidback3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 0.2F, -1.7F, -0.1698F, -0.0848F, 0.0F));

		PartDefinition rlowerteethmidback_r2 = rlowerteethmidback3.addOrReplaceChild("rlowerteethmidback_r2", CubeListBuilder.create().texOffs(150, 108).mirror().addBox(-0.5156F, -4.6615F, -4.2563F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8013F, 4.3737F, 2.7841F, 0.0095F, -0.0756F, -0.0076F));

		PartDefinition rlowerteethback3 = lowerjawmiddleback3.addOrReplaceChild("rlowerteethback3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.7F, -2.5F, -0.1274F, -0.0637F, 0.0F));

		PartDefinition rlowerteethback_r2 = rlowerteethback3.addOrReplaceChild("rlowerteethback_r2", CubeListBuilder.create().texOffs(135, 158).mirror().addBox(1.5415F, -0.4897F, -6.8477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4358F, -0.717F, 5.9432F, 0.0974F, 0.1105F, -0.0519F));

		PartDefinition lowerjawmiddleback2 = lowerjawback.addOrReplaceChild("lowerjawmiddleback2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, 0.4161F, -11.4452F, 0.1061F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddle2 = lowerjawmiddleback2.addOrReplaceChild("lowerjawmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, -4.0F, 0.1911F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront2 = lowerjawmiddle2.addOrReplaceChild("lowerjawmiddlefront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2546F, 0.0F, 0.0F));

		PartDefinition lowerjawend2 = lowerjawmiddlefront2.addOrReplaceChild("lowerjawend2", CubeListBuilder.create().texOffs(143, 71).mirror().addBox(-1.52F, -2.0F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.9F, -0.1274F, 0.0F, 0.0F));

		PartDefinition chin2 = lowerjawend2.addOrReplaceChild("chin2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.2F, 0.12F, 0.1485F, 0.0F, 0.0F));

		PartDefinition rlowerteethfront2 = lowerjawend2.addOrReplaceChild("rlowerteethfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, -3.0F, -2.1F, 0.1698F, -0.1698F, 0.0F));

		PartDefinition lowerfrontteeth2 = lowerjawend2.addOrReplaceChild("lowerfrontteeth2", CubeListBuilder.create().texOffs(91, 25).mirror().addBox(-1.02F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.7F, -3.4F, 0.0213F, 0.0F, 0.0F));

		PartDefinition rlowerteethmidfront2 = lowerjawmiddlefront2.addOrReplaceChild("rlowerteethmidfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, -3.1F, -2.4F, -0.1274F, -0.1061F, 0.0F));

		PartDefinition rlowerteethmidback2 = lowerjawmiddle2.addOrReplaceChild("rlowerteethmidback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 0.2F, -1.7F, -0.1698F, -0.0848F, 0.0F));

		PartDefinition rlowerteethback2 = lowerjawmiddleback2.addOrReplaceChild("rlowerteethback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.7F, -2.5F, -0.1274F, -0.0637F, 0.0F));

		PartDefinition rightjawflank = lowerjawback.addOrReplaceChild("rightjawflank", CubeListBuilder.create(), PartPose.offsetAndRotation(5.27F, 2.6161F, -7.3452F, 0.0848F, 0.4033F, 0.0F));

		PartDefinition rightjawflank_r1 = rightjawflank.addOrReplaceChild("rightjawflank_r1", CubeListBuilder.create().texOffs(13, 119).addBox(-0.4305F, 2.3917F, -6.9484F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3842F, -2.217F, -0.6568F, -0.1125F, -0.2439F, 0.0635F));

		PartDefinition rightjawflank_r2 = rightjawflank.addOrReplaceChild("rightjawflank_r2", CubeListBuilder.create().texOffs(75, 109).addBox(-0.4305F, -0.2659F, -7.1088F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.3842F, -2.217F, -0.6568F, 0.062F, -0.2439F, 0.0635F));

		PartDefinition rightjawflank2 = lowerjawback.addOrReplaceChild("rightjawflank2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.25F, 2.6161F, -7.3452F, 0.0848F, -0.4033F, 0.0F));

		PartDefinition leftjawflank_r1 = rightjawflank2.addOrReplaceChild("leftjawflank_r1", CubeListBuilder.create().texOffs(13, 119).mirror().addBox(-0.5695F, 2.3917F, -6.9484F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3842F, -2.217F, -0.6568F, -0.1125F, 0.2439F, -0.0635F));

		PartDefinition leftjawflank_r2 = rightjawflank2.addOrReplaceChild("leftjawflank_r2", CubeListBuilder.create().texOffs(75, 109).mirror().addBox(-0.5695F, -0.2659F, -7.1088F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.3842F, -2.217F, -0.6568F, 0.062F, 0.2439F, -0.0635F));

		PartDefinition leftjawflank = lowerjawback.addOrReplaceChild("leftjawflank", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.25F, 2.6161F, -7.3452F, 0.0848F, -0.4033F, 0.0F));

		PartDefinition rightheadflank = head.addOrReplaceChild("rightheadflank", CubeListBuilder.create(), PartPose.offsetAndRotation(5.33F, 1.9789F, -3.4631F, 0.0848F, 0.3821F, 0.0F));

		PartDefinition rightheadflank_r1 = rightheadflank.addOrReplaceChild("rightheadflank_r1", CubeListBuilder.create().texOffs(158, 138).addBox(-1.001F, 0.9476F, 4.6737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(158, 138).addBox(-1.001F, 0.9476F, 4.6737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.151F, 1.9256F, -7.1943F, 0.5492F, -0.2094F, 0.0481F));

		PartDefinition rightheadflank_r2 = rightheadflank.addOrReplaceChild("rightheadflank_r2", CubeListBuilder.create().texOffs(24, 158).addBox(-1.001F, -6.6409F, 2.873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 158).addBox(-1.001F, -6.6409F, 2.873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.151F, 1.9256F, -7.1943F, -0.5853F, -0.2094F, 0.0481F));

		PartDefinition rightheadflank_r3 = rightheadflank.addOrReplaceChild("rightheadflank_r3", CubeListBuilder.create().texOffs(40, 112).addBox(-1.001F, -5.4414F, 5.1457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(59, 99).addBox(-1.0938F, -7.0374F, 1.0086F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(40, 112).addBox(-1.001F, -5.4414F, 5.1457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(59, 99).addBox(-1.0938F, -7.0374F, 1.0086F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.151F, 1.9256F, -7.1943F, -0.1926F, -0.2094F, 0.0481F));

		PartDefinition rightheadflank_r4 = rightheadflank.addOrReplaceChild("rightheadflank_r4", CubeListBuilder.create().texOffs(156, 158).addBox(-1.001F, -9.3633F, 1.9694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(156, 158).addBox(-1.001F, -9.3633F, 1.9694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.151F, 1.9256F, -7.1943F, -0.6988F, -0.2094F, 0.0481F));

		PartDefinition rightheadflank_r5 = rightheadflank.addOrReplaceChild("rightheadflank_r5", CubeListBuilder.create().texOffs(159, 0).addBox(-1.001F, -7.6592F, 4.7563F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 68).addBox(-0.7859F, -7.2592F, 4.9563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 40).addBox(-0.9959F, -7.2592F, 4.9563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 68).addBox(-0.7859F, -7.2592F, 4.9563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 40).addBox(-0.9959F, -7.2592F, 4.9563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 0).addBox(-1.001F, -7.6592F, 4.7563F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.151F, 1.9256F, -7.1943F, -0.2624F, -0.2094F, 0.0481F));

		PartDefinition rightlacrimalcrest = rightheadflank.addOrReplaceChild("rightlacrimalcrest", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2252F, -3.4652F, -2.2159F, -0.2972F, -0.0637F, 0.1061F));

		PartDefinition rightlacrimalcrest_r1 = rightlacrimalcrest.addOrReplaceChild("rightlacrimalcrest_r1", CubeListBuilder.create().texOffs(139, 142).addBox(-0.7F, 0.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4032F, 0.6891F, -0.2846F, -0.2108F, 0.1519F));

		PartDefinition rightlacrimalfront = rightlacrimalcrest.addOrReplaceChild("rightlacrimalfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.05F, -2.9032F, -0.2609F, 0.6369F, 0.0213F, 0.0F));

		PartDefinition rightlacrimalfront_r1 = rightlacrimalfront.addOrReplaceChild("rightlacrimalfront_r1", CubeListBuilder.create().texOffs(136, 62).addBox(-0.6F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4F, -2.0F, 0.0127F, -0.0508F, 0.2091F));

		PartDefinition rightlacrimalback = rightlacrimalcrest.addOrReplaceChild("rightlacrimalback", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -2.3032F, 1.1891F, -0.0213F, -0.3396F, -0.1061F));

		PartDefinition rightlacrimalback_r1 = rightlacrimalback.addOrReplaceChild("rightlacrimalback_r1", CubeListBuilder.create().texOffs(153, 145).addBox(-0.3F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2802F, 1.0099F, 0.5527F, -0.0257F, 0.1774F, 0.2033F));

		PartDefinition rightheadflank2 = head.addOrReplaceChild("rightheadflank2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.31F, 1.9789F, -3.4631F, 0.0848F, -0.3821F, 0.0F));

		PartDefinition leftheadflank_r1 = rightheadflank2.addOrReplaceChild("leftheadflank_r1", CubeListBuilder.create().texOffs(158, 138).mirror().addBox(0.001F, 0.9476F, 4.6737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(158, 138).mirror().addBox(0.001F, 0.9476F, 4.6737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.151F, 1.9256F, -7.1943F, 0.5492F, 0.2094F, -0.0481F));

		PartDefinition leftheadflank_r2 = rightheadflank2.addOrReplaceChild("leftheadflank_r2", CubeListBuilder.create().texOffs(24, 158).mirror().addBox(0.001F, -6.6409F, 2.873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 158).mirror().addBox(0.001F, -6.6409F, 2.873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.151F, 1.9256F, -7.1943F, -0.5853F, 0.2094F, -0.0481F));

		PartDefinition leftheadflank_r3 = rightheadflank2.addOrReplaceChild("leftheadflank_r3", CubeListBuilder.create().texOffs(40, 112).mirror().addBox(0.001F, -5.4414F, 5.1457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 99).mirror().addBox(0.0938F, -7.0374F, 1.0086F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 112).mirror().addBox(0.001F, -5.4414F, 5.1457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 99).mirror().addBox(0.0938F, -7.0374F, 1.0086F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.151F, 1.9256F, -7.1943F, -0.1926F, 0.2094F, -0.0481F));

		PartDefinition leftheadflank_r4 = rightheadflank2.addOrReplaceChild("leftheadflank_r4", CubeListBuilder.create().texOffs(156, 158).mirror().addBox(0.001F, -9.3633F, 1.9694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(156, 158).mirror().addBox(0.001F, -9.3633F, 1.9694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.151F, 1.9256F, -7.1943F, -0.6988F, 0.2094F, -0.0481F));

		PartDefinition leftheadflank_r5 = rightheadflank2.addOrReplaceChild("leftheadflank_r5", CubeListBuilder.create().texOffs(159, 0).mirror().addBox(0.001F, -7.6592F, 4.7563F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 68).mirror().addBox(-0.2141F, -7.2592F, 4.9563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 40).mirror().addBox(-0.0041F, -7.2592F, 4.9563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 68).mirror().addBox(-0.2141F, -7.2592F, 4.9563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 40).mirror().addBox(-0.0041F, -7.2592F, 4.9563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(159, 0).mirror().addBox(0.001F, -7.6592F, 4.7563F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.151F, 1.9256F, -7.1943F, -0.2624F, 0.2094F, -0.0481F));

		PartDefinition leftlacrimalcrest = rightheadflank2.addOrReplaceChild("leftlacrimalcrest", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2252F, -3.4652F, -2.2159F, -0.2972F, 0.0637F, -0.1061F));

		PartDefinition leftlacrimalcrest_r1 = leftlacrimalcrest.addOrReplaceChild("leftlacrimalcrest_r1", CubeListBuilder.create().texOffs(139, 142).mirror().addBox(-0.3F, 0.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4032F, 0.6891F, -0.2846F, 0.2108F, -0.1519F));

		PartDefinition leftlacrimalfront = leftlacrimalcrest.addOrReplaceChild("leftlacrimalfront", CubeListBuilder.create(), PartPose.offsetAndRotation(1.05F, -2.9032F, -0.2609F, 0.6369F, -0.0213F, 0.0F));

		PartDefinition leftlacrimalfront_r1 = leftlacrimalfront.addOrReplaceChild("leftlacrimalfront_r1", CubeListBuilder.create().texOffs(136, 62).mirror().addBox(-0.4F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4F, -2.0F, 0.0127F, 0.0508F, -0.2091F));

		PartDefinition leftlacrimalback = leftlacrimalcrest.addOrReplaceChild("leftlacrimalback", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -2.3032F, 1.1891F, -0.0213F, 0.3396F, 0.1061F));

		PartDefinition leftlacrimalback_r1 = leftlacrimalback.addOrReplaceChild("leftlacrimalback_r1", CubeListBuilder.create().texOffs(153, 145).mirror().addBox(-0.7F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2802F, 1.0099F, 0.5527F, -0.0257F, -0.1774F, -0.2033F));

		PartDefinition leftheadflank = head.addOrReplaceChild("leftheadflank", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.31F, 1.9789F, -3.4631F, 0.0848F, -0.3821F, 0.0F));

		PartDefinition chestslope = bodyfront.addOrReplaceChild("chestslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 16.9369F, -10.6602F, -0.2122F, 0.0F, 0.0F));

		PartDefinition leftArm1 = bodyfront.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(8.4232F, 12.5695F, -4.7148F, 0.0791F, -0.654F, -0.5567F));

		PartDefinition cube_r32 = leftArm1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(130, 158).addBox(-1.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.4893F, 0.2018F, -0.7676F, 0.1498F));

		PartDefinition cube_r33 = leftArm1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(132, 105).addBox(-1.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.4893F, 0.5713F, -0.6678F, 0.2037F));

		PartDefinition cube_r34 = leftArm1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(73, 158).addBox(6.0F, -1.6842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftArm1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(125, 157).addBox(6.0F, 0.7F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.5F, 0.8847F, -0.8107F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(62, 157).addBox(-0.8F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 156).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 5.0347F, 0.6893F, -1.1784F, -0.0167F, 0.0403F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(128, 34).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightArm1 = bodyfront.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.4232F, 12.5695F, -4.7148F, -0.2256F, 0.9301F, 0.7002F));

		PartDefinition cube_r36 = rightArm1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(158, 130).addBox(0.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.4893F, 0.2018F, 0.7676F, -0.1498F));

		PartDefinition cube_r37 = rightArm1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(103, 158).addBox(0.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.4893F, 0.5713F, 0.6678F, -0.2037F));

		PartDefinition cube_r38 = rightArm1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(88, 158).addBox(-7.0F, -1.6842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightArm1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 158).addBox(-7.0F, 0.7F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.5F, 0.8847F, -0.8107F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(157, 75).addBox(-0.2F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 156).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 5.0347F, 0.6893F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(91, 128).addBox(0.0F, 0.0F, -2.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, -0.4363F));

		PartDefinition bellyslope = bodymiddle.addOrReplaceChild("bellyslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.1688F, -23.099F, -0.1274F, 0.0F, 0.0F));

		PartDefinition bellyslope_r1 = bellyslope.addOrReplaceChild("bellyslope_r1", CubeListBuilder.create().texOffs(0, 68).addBox(-6.5F, -3.0159F, -8.9962F, 13.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 10.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition bellyslope_r2 = bellyslope.addOrReplaceChild("bellyslope_r2", CubeListBuilder.create().texOffs(0, 52).addBox(-6.5F, -4.1F, -11.0F, 13.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 21.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 27).addBox(-1.5F, -1.3074F, -0.2935F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 11.9F, -0.1471F, 0.1727F, -0.0254F));

		PartDefinition tail9_r1 = tail1.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(51, 158).addBox(0.0F, -5.7608F, 8.9304F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 158).addBox(0.0F, -5.6608F, 6.9304F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 157).addBox(0.0F, -5.7608F, 4.9304F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 155).addBox(0.0F, -5.8608F, 2.3304F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 155).addBox(0.0F, -5.9608F, -0.0696F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3074F, 9.8065F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail4_r1 = tail1.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(146, 138).addBox(0.0F, -6.4838F, 2.9076F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(146, 128).addBox(0.0F, -6.7838F, -0.0924F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3074F, 3.8065F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail10_r1 = tail1.addOrReplaceChild("tail10_r1", CubeListBuilder.create().texOffs(70, 152).addBox(0.0F, -0.1F, 5.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 147).addBox(0.0F, -1.0F, 3.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 155).addBox(0.0F, -1.8F, 1.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 155).addBox(0.0F, -3.2F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7538F, 14.9708F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail1.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(3, 155).addBox(0.0F, -3.8F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4858F, 12.9823F, 0.6894F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = tail1.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(0, 155).addBox(0.0F, 4.9773F, 3.4506F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 154).addBox(0.0F, 2.9773F, 1.4506F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 158).addBox(0.0F, -1.0227F, -2.5494F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 150).addBox(0.0F, 0.9773F, -0.5494F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6814F, 1.5494F, 0.733F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(95, 146).addBox(0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3074F, 0.7065F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(49, 51).addBox(-1.0F, -1.022F, -0.796F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.005F))
				.texOffs(40, 159).addBox(0.0F, -4.6119F, 7.0307F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 159).addBox(0.0F, -4.6119F, 9.7307F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 90).addBox(0.0F, -4.6119F, 12.2307F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 96).addBox(0.0F, -4.6119F, 14.4307F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 113).addBox(0.0F, -4.6119F, 16.7307F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2074F, 20.6065F, 0.097F, 0.1303F, 0.0126F));

		PartDefinition tail4_r2 = tail2.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(37, 159).addBox(0.0F, -4.0F, 2.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 34).addBox(0.0F, -4.0F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.022F, 1.304F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail18_r1 = tail2.addOrReplaceChild("tail18_r1", CubeListBuilder.create().texOffs(161, 158).addBox(0.0F, 3.9F, 13.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(161, 102).addBox(0.0F, 3.1F, 11.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 158).addBox(0.0F, 1.5F, 9.4F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 156).addBox(0.0F, -0.3F, 7.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 0).addBox(0.0F, -0.8F, 5.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 153).addBox(0.0F, -2.5F, 3.4F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 153).addBox(0.0F, -3.0F, 1.4F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 153).addBox(0.0F, -3.5F, -0.6F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0561F, 3.4495F, 0.4974F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(53, 0).addBox(-1.0F, -1.3429F, -0.2462F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(152, 159).addBox(0.0F, -4.9429F, 0.7538F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 142).addBox(0.0F, -4.9429F, 3.5538F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 161).addBox(0.0F, -4.8429F, 6.0538F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2679F, 18.6857F, -0.0131F, -0.2181F, 0.0028F));

		PartDefinition tail10_r2 = tail3.addOrReplaceChild("tail10_r2", CubeListBuilder.create().texOffs(162, 35).addBox(0.0F, -2.6481F, 2.0018F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 144).addBox(0.0F, -2.6481F, 0.0018F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3487F, 13.172F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail8_r1 = tail3.addOrReplaceChild("tail8_r1", CubeListBuilder.create().texOffs(75, 141).addBox(0.0F, -3.1F, 2.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(161, 81).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3429F, 8.0538F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail25_r1 = tail3.addOrReplaceChild("tail25_r1", CubeListBuilder.create().texOffs(126, 162).addBox(0.0F, 0.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 162).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9404F, 12.5229F, 0.3665F, 0.0F, 0.0F));

		PartDefinition tail23_r1 = tail3.addOrReplaceChild("tail23_r1", CubeListBuilder.create().texOffs(162, 95).addBox(0.0F, -0.7F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 90).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1599F, 8.2566F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail21_r1 = tail3.addOrReplaceChild("tail21_r1", CubeListBuilder.create().texOffs(162, 75).addBox(0.0F, 6.8F, 19.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 162).addBox(0.0F, 5.9F, 17.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 29).addBox(0.0F, 4.4F, 15.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7882F, -15.2362F, 0.4974F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(74, 84).addBox(-1.0F, -0.9289F, -0.1829F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.005F))
				.texOffs(162, 112).addBox(0.0F, -2.9289F, 0.8171F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 162).addBox(0.0F, -2.9289F, 2.8171F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4485F, 16.6649F, -0.1116F, -0.1735F, 0.0193F));

		PartDefinition tail9_r2 = tail4.addOrReplaceChild("tail9_r2", CubeListBuilder.create().texOffs(120, 162).addBox(0.0F, -1.6F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9289F, 8.9171F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail8_r2 = tail4.addOrReplaceChild("tail8_r2", CubeListBuilder.create().texOffs(117, 162).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0289F, 6.9171F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail7_r1 = tail4.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(162, 116).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9289F, 4.8171F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail29_r1 = tail4.addOrReplaceChild("tail29_r1", CubeListBuilder.create().texOffs(138, 162).addBox(0.0F, 3.3F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 162).addBox(0.0F, 1.9F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 162).addBox(0.0F, 1.4F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 162).addBox(0.0F, 1.0F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.389F, -4.142F, 0.3665F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(94, 51).addBox(-0.5F, -0.3787F, 0.0141F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(121, 71).addBox(0.0F, -1.3787F, 2.0141F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 93).addBox(0.0F, -1.1787F, 4.0141F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 59).addBox(0.0F, -0.9787F, 6.0141F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 143).addBox(0.0F, -0.8787F, 8.0141F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 120).addBox(0.0F, -1.5787F, 0.0141F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5083F, 10.7379F, -0.0995F, -0.2606F, 0.0257F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(96, 98).addBox(-0.5F, -0.3043F, 0.1017F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1038F, 9.8236F, -0.1239F, -0.2599F, 0.032F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -0.5561F, -0.0005F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2957F, 8.9017F, -0.2533F, -0.1691F, 0.0435F));

		PartDefinition tailridge2 = tail2.addOrReplaceChild("tailridge2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.522F, -0.296F, -0.2122F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.524F, -6.0164F, 7.5476F, 0.0073F, -0.1045F, -0.0702F));

		PartDefinition cube_r40 = bone2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(80, 20).addBox(-0.5F, -2.0F, 1.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.425F, 0.0964F, -0.4034F));

		PartDefinition cube_r41 = bone2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(141, 76).addBox(0.1841F, -1.8684F, -0.0654F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7357F, 3.6267F, 2.5245F, 0.6745F, 0.0964F, -0.4034F));

		PartDefinition cube_r42 = bone2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(58, 89).addBox(2.2104F, -8.6383F, -0.9761F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9798F, 9.5576F, -0.2815F, 0.1858F, 0.0964F, -0.4034F));

		PartDefinition cube_r43 = bone2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(122, 119).addBox(2.3104F, -8.2059F, -1.8516F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9798F, 10.2576F, 0.0185F, 0.2382F, 0.0964F, -0.4034F));

		PartDefinition cube_r44 = bone2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(57, 113).addBox(-0.8546F, 0.0157F, -7.0309F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 2.0F, -0.0934F, 0.0964F, -0.4034F));

		PartDefinition cube_r45 = bone2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(151, 133).addBox(-0.4935F, -2.2509F, -0.9785F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4901F, 0.1696F, -11.787F, 0.8702F, -0.3588F, -0.2843F));

		PartDefinition cube_r46 = bone2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(151, 139).addBox(-0.4935F, -2.4811F, 0.1483F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4901F, 0.1696F, -11.787F, 0.4862F, -0.3588F, -0.2843F));

		PartDefinition cube_r47 = bone2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(56, 124).addBox(-1.6844F, -0.2664F, -6.0744F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -5.0F, -0.2493F, 0.0118F, -0.3818F));

		PartDefinition cube_r48 = bone2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(132, 96).addBox(-0.4935F, -2.4174F, -3.429F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4901F, 0.1696F, -11.787F, 1.516F, -0.3588F, -0.2843F));

		PartDefinition cube_r49 = bone2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(96, 34).addBox(2.0481F, -10.5957F, -6.7006F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9798F, 9.5576F, -4.9815F, -0.1489F, 0.0863F, -0.4144F));

		PartDefinition cube_r50 = bone2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(37, 148).addBox(-1.0413F, 4.6105F, 0.4558F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3075F, 9.013F, -3.9112F, 0.5276F, -0.0629F, 0.2465F));

		PartDefinition cube_r51 = bone2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(19, 105).addBox(-0.9424F, -0.0191F, 0.001F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3075F, 9.013F, -3.9112F, 0.6195F, -0.0104F, 0.3137F));

		PartDefinition cube_r52 = bone2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(147, 19).addBox(-3.5324F, 10.5304F, -0.7342F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3075F, 9.013F, -3.9112F, 0.5634F, 0.0539F, 0.0621F));

		PartDefinition cube_r53 = bone2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(112, 149).addBox(-2.8827F, 10.3064F, 2.1487F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4872F, 6.7923F, -12.888F, -0.3772F, 0.0925F, 0.1923F));

		PartDefinition cube_r54 = bone2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(152, 34).addBox(-2.7548F, 13.2527F, -10.0391F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4872F, 6.7923F, -12.888F, 0.2773F, 0.0925F, 0.1923F));

		PartDefinition cube_r55 = bone2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(141, 39).addBox(-2.7548F, 5.6277F, -15.3792F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4872F, 6.7923F, -12.888F, 0.9231F, 0.0925F, 0.1923F));

		PartDefinition cube_r56 = bone2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 91).addBox(-2.7548F, 14.097F, -8.1401F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4872F, 6.7923F, -12.888F, 0.225F, 0.0925F, 0.1923F));

		PartDefinition cube_r57 = bone2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(158, 126).addBox(-2.7548F, -13.8792F, -8.6277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4872F, 6.7923F, -12.888F, 2.4939F, 0.0925F, 0.1923F));

		PartDefinition cube_r58 = bone2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(125, 142).addBox(-0.9738F, 4.8547F, 1.6415F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4872F, 6.7923F, -12.888F, -0.3101F, 0.0763F, 0.3667F));

		PartDefinition cube_r59 = bone2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(132, 142).addBox(-0.6557F, -0.4223F, 2.9193F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4872F, 6.7923F, -12.888F, -0.5593F, 0.071F, 0.4189F));

		PartDefinition cube_r60 = bone2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(150, 50).addBox(-1.0F, -5.7018F, -8.5275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4798F, 14.0576F, -7.9815F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(103, 162).addBox(-2.7823F, 17.0926F, -1.9374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4872F, 6.7923F, -12.888F, -0.1939F, 0.0925F, 0.1923F));

		PartDefinition cube_r62 = bone2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(41, 139).addBox(-0.6557F, -0.2383F, -0.1123F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4872F, 6.7923F, -12.888F, 0.0079F, 0.071F, 0.4189F));

		PartDefinition cube_r63 = bone2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(137, 105).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9798F, 9.8404F, -4.3122F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r64 = bone2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -2.6469F, -6.7599F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9798F, 6.0576F, -4.9815F, -0.1484F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.524F, -6.0164F, 7.5476F, 0.0073F, 0.1045F, 0.0702F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-0.5F, -2.0F, 1.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.425F, -0.0964F, 0.4034F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(141, 76).mirror().addBox(-1.1841F, -1.8684F, -0.0654F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7357F, 3.6267F, 2.5245F, 0.6745F, -0.0964F, 0.4034F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(58, 89).mirror().addBox(-3.2104F, -8.6383F, -0.9761F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9798F, 9.5576F, -0.2815F, 0.1858F, -0.0964F, 0.4034F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(122, 119).mirror().addBox(-3.3104F, -8.2059F, -1.8516F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9798F, 10.2576F, 0.0185F, 0.2382F, -0.0964F, 0.4034F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(57, 113).mirror().addBox(-0.1454F, 0.0157F, -7.0309F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4F, 2.0F, -0.0934F, -0.0964F, 0.4034F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(151, 133).mirror().addBox(-0.5065F, -2.2509F, -0.9785F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4901F, 0.1696F, -11.787F, 0.8702F, 0.3588F, 0.2843F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(151, 139).mirror().addBox(-0.5065F, -2.4811F, 0.1483F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4901F, 0.1696F, -11.787F, 0.4862F, 0.3588F, 0.2843F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(56, 124).mirror().addBox(0.6844F, -0.2664F, -6.0744F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8F, -5.0F, -0.2493F, -0.0118F, 0.3818F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(132, 96).mirror().addBox(-0.5065F, -2.4174F, -3.429F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4901F, 0.1696F, -11.787F, 1.516F, 0.3588F, 0.2843F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(96, 34).mirror().addBox(-3.0481F, -10.5957F, -6.7006F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9798F, 9.5576F, -4.9815F, -0.1489F, -0.0863F, 0.4144F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(37, 148).mirror().addBox(0.0413F, 4.6105F, 0.4558F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3075F, 9.013F, -3.9112F, 0.5276F, 0.0629F, -0.2465F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(19, 105).mirror().addBox(-0.0576F, -0.0191F, 0.001F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3075F, 9.013F, -3.9112F, 0.6195F, 0.0104F, -0.3137F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(147, 19).mirror().addBox(2.5324F, 10.5304F, -0.7342F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3075F, 9.013F, -3.9112F, 0.5634F, -0.0539F, -0.0621F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(112, 149).mirror().addBox(1.8827F, 10.3064F, 2.1487F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4872F, 6.7923F, -12.888F, -0.3772F, -0.0925F, -0.1923F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(152, 34).mirror().addBox(1.7548F, 13.2527F, -10.0391F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4872F, 6.7923F, -12.888F, 0.2773F, -0.0925F, -0.1923F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(141, 39).mirror().addBox(1.7548F, 5.6277F, -15.3792F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4872F, 6.7923F, -12.888F, 0.9231F, -0.0925F, -0.1923F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(1.7548F, 14.097F, -8.1401F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4872F, 6.7923F, -12.888F, 0.225F, -0.0925F, -0.1923F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(158, 126).mirror().addBox(1.7548F, -13.8792F, -8.6277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4872F, 6.7923F, -12.888F, 2.4939F, -0.0925F, -0.1923F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(125, 142).mirror().addBox(-0.0262F, 4.8547F, 1.6415F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4872F, 6.7923F, -12.888F, -0.3101F, -0.0763F, -0.3667F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(132, 142).mirror().addBox(-0.3443F, -0.4223F, 2.9193F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4872F, 6.7923F, -12.888F, -0.5593F, -0.071F, -0.4189F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(150, 50).mirror().addBox(0.0F, -5.7018F, -8.5275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4798F, 14.0576F, -7.9815F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(103, 162).mirror().addBox(1.7823F, 17.0926F, -1.9374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4872F, 6.7923F, -12.888F, -0.1939F, -0.0925F, -0.1923F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(41, 139).mirror().addBox(-0.3443F, -0.2383F, -0.1123F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4872F, 6.7923F, -12.888F, 0.0079F, -0.071F, -0.4189F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(137, 105).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9798F, 9.8404F, -4.3122F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.5F, -2.6469F, -6.7599F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9798F, 6.0576F, -4.9815F, -0.1484F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(0, 115).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -0.3305F, 1.4922F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(105, 74).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.6144F, 1.3556F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(30, 119).addBox(-5.5F, -0.1F, 0.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 8.1F, -2.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(133, 135).addBox(-5.0F, -0.9F, -2.8F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.1F, 1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.7052F, 1.2374F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(119, 62).addBox(-3.5F, -2.707F, -2.2331F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 2.5472F, -0.5117F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(46, 103).addBox(-3.5F, -5.0F, -0.6F, 3.0F, 14.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 7.6472F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(63, 152).addBox(-2.5F, -2.6498F, -1.9321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.3472F, 0.9883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(104, 128).addBox(-2.5F, 0.1715F, -0.931F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 2.5472F, 0.9883F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(117, 48).addBox(-2.5F, -0.4447F, -0.8239F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 17.1525F, -1.6529F, -0.6283F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(19, 112).addBox(-3.0F, -0.8216F, -3.098F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1011F, -0.1323F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(74, 74).addBox(-4.0F, -0.5F, -6.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3216F, -3.098F, -0.0835F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(115, 34).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -0.3305F, 1.4922F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(92, 109).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.6144F, 1.3556F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(43, 120).addBox(2.5F, -0.1F, 0.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 8.1F, -2.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(15, 136).addBox(3.0F, -0.9F, -2.8F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.1F, 1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.7052F, 1.2374F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(74, 120).addBox(0.5F, -2.707F, -2.2331F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 2.5472F, -0.5117F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(111, 109).addBox(0.5F, -5.0F, -0.6F, 3.0F, 14.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 7.6472F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(152, 81).addBox(1.5F, -2.6498F, -1.9321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 3.3472F, 0.9883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(86, 129).addBox(1.5F, 0.1715F, -0.931F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 2.5472F, 0.9883F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(117, 97).addBox(-2.5F, -0.4447F, -0.8239F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 17.1525F, -1.6529F, -0.6283F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(113, 0).addBox(-3.0F, -0.8216F, -3.098F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1011F, -0.1323F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 81).addBox(-4.0F, -0.5F, -6.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3216F, -3.098F, -0.3453F, 0.0F, 0.0F));

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