package fossils.fossils.client.blockentity.model.guanlong;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GuanlongFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart Neckmiddle;
	private final ModelPart Neckfront;
	private final ModelPart Head;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawfront;
	private final ModelPart Headcrest;
	private final ModelPart Leftupperfrontteeth;
	private final ModelPart Upperbackteeth;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawmiddleslope;
	private final ModelPart Rightlowerteeth;
	private final ModelPart Leftlowerteeth;
	private final ModelPart Lowerjawchinslope;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart Belly;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart Rightthigh;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart Leftthigh;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;

	public GuanlongFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.Neckmiddle = this.Neckbase.getChild("Neckmiddle");
		this.Neckfront = this.Neckmiddle.getChild("Neckfront");
		this.Head = this.Neckfront.getChild("Head");
		this.Upperjawbase = this.Head.getChild("Upperjawbase");
		this.Upperjawfront = this.Upperjawbase.getChild("Upperjawfront");
		this.Headcrest = this.Upperjawfront.getChild("Headcrest");
		this.Leftupperfrontteeth = this.Upperjawfront.getChild("Leftupperfrontteeth");
		this.Upperbackteeth = this.Upperjawbase.getChild("Upperbackteeth");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddle = this.Lowerjawback.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerjawmiddleslope = this.Lowerjawmiddle.getChild("Lowerjawmiddleslope");
		this.Rightlowerteeth = this.Lowerjawmiddle.getChild("Rightlowerteeth");
		this.Leftlowerteeth = this.Lowerjawmiddle.getChild("Leftlowerteeth");
		this.Lowerjawchinslope = this.Lowerjawback.getChild("Lowerjawchinslope");
		this.leftArm1 = this.Bodyfront.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.Bodyfront.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.Belly = this.Bodymiddle.getChild("Belly");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddleend = this.Tailmiddlebase.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.leftLeg2 = this.Rightthigh.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.rightLeg2 = this.Leftthigh.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -18.0F, -0.7F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(0.0F, -1.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-3.4F, -15.0F, -13.3F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-3.2F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.4F, -15.0F, -13.3F, -0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(1.3F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -15.0F, -0.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.2F, -2.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.8F, -1.5F, -0.1057F, -0.0092F, -0.0868F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(34, 39).addBox(-0.5F, 0.161F, -5.1342F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 43).addBox(-0.5F, 0.161F, -0.4342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -0.247F, -2.8972F, 0.2481F, 0.2966F, 0.0739F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(49, 56).addBox(-0.5F, 0.2F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.161F, -8.3342F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.161F, -7.6342F, 0.1422F, 0.1296F, 0.0185F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(48, 49).addBox(-0.5F, 0.0168F, 3.2952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(45, 46).addBox(-0.5F, 0.0168F, -0.2048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0771F, -4.1135F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, -3.9635F, -0.0978F, 0.2172F, -0.0211F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(28, 56).addBox(-0.5F, 0.4908F, 0.1184F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4786F, -2.9207F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = Neckbase.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1847F, -2.6239F, -0.5673F, 0.1476F, -0.0935F));

		PartDefinition Neckmiddle_r1 = Neckmiddle.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(35, 13).addBox(-1.0F, -0.2116F, -0.2856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(31, 9).addBox(-1.0F, -0.2116F, -4.8856F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.4756F, -0.0873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckfront = Neckmiddle.addOrReplaceChild("Neckfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.1756F, -4.9373F, 0.2274F, 0.31F, 0.2383F));

		PartDefinition Neckfront_r1 = Neckfront.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(66, 0).addBox(-0.49F, 0.7304F, -1.9906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4664F, -1.8282F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Neckfront_r2 = Neckfront.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(63, 65).addBox(-0.49F, 0.5F, 0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2664F, -2.5282F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head = Neckfront.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3163F, -2.7662F, 0.4255F, 0.0F, 0.0F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0964F, -2.84F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawbase.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -4.1F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Headcrest = Upperjawfront.addOrReplaceChild("Headcrest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -1.75F, 0.1285F, 0.0F, 0.0F));

		PartDefinition Leftupperfrontteeth = Upperjawfront.addOrReplaceChild("Leftupperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.35F, 1.8F, -1.85F, -0.1471F, 0.0424F, 0.0F));

		PartDefinition Upperbackteeth = Upperjawbase.addOrReplaceChild("Upperbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -4.0F, 0.1061F, 0.0F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1336F, 0.06F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawback.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -3.0F, -0.2728F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleslope = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddleslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.1F, -3.0F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Rightlowerteeth = Lowerjawmiddle.addOrReplaceChild("Rightlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.22F, 0.0F, -4.8F, -0.2806F, 0.1061F, 0.0F));

		PartDefinition Leftlowerteeth = Lowerjawmiddle.addOrReplaceChild("Leftlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.0F, -4.8F, -0.2806F, -0.1061F, 0.0F));

		PartDefinition Lowerjawchinslope = Lowerjawback.addOrReplaceChild("Lowerjawchinslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.9F, -3.0F, 0.2759F, 0.0F, 0.0F));

		PartDefinition leftArm1 = Bodyfront.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8744F, 3.9764F, -3.4227F, -0.0527F, 0.3187F, -0.1359F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1146F, 4.7004F, -0.1522F, -1.79F, -0.8215F, 0.1473F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2229F, 3.6536F, -0.087F, 0.4345F, -0.0692F, 0.0532F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0064F, 0.6654F, -0.5338F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = Bodyfront.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8744F, 3.9764F, -3.4227F, 0.2964F, -0.3187F, 0.1359F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1146F, 4.7004F, -0.1522F, -1.5223F, 0.9487F, -0.196F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2229F, 3.6536F, -0.087F, 0.4345F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0064F, 0.6654F, -0.5338F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Belly = Bodymiddle.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 5.861F, -8.3342F, -0.2122F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 5.2F, -0.0216F, -0.1745F, 0.0038F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(27, 28).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1107F, -0.0063F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3893F, 8.6937F, 0.1279F, -0.2598F, -0.033F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(11, 27).addBox(-0.5F, 0.1F, 11.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(0, 16).addBox(-0.5F, 0.1F, -0.4F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 0.0247F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.49F, -0.6985F, 11.9247F, 0.1979F, 0.4288F, 0.0832F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(19, 39).addBox(0.0F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0895F, -0.0261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.5766F, 5.8759F, 0.0168F, 0.3054F, 0.0051F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, 0.2F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0056F, 0.1941F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.097F, 6.5757F, -0.2572F, 0.296F, -0.0766F));

		PartDefinition Tailend_r2 = Tailend2.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.2F, -0.4F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0072F, 0.2941F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.8254F, 1.394F, 0.0072F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = Rightthigh.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 7.1031F, 1.6361F, 1.3439F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 8.7724F, -0.4035F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1723F, -0.1947F, 0.8727F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0972F, -1.5163F, -0.258F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.8254F, 1.394F, -0.6894F, 0.0397F, 0.0777F));

		PartDefinition rightLeg2 = Leftthigh.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 7.1031F, 1.6361F, 1.5184F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 8.7724F, -0.4035F, -1.3079F, -0.0055F, 0.0162F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1723F, -0.1947F, 0.6545F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0972F, -1.5163F, -0.0835F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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