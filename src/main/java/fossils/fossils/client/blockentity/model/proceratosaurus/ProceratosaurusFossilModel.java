package fossils.fossils.client.blockentity.model.proceratosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProceratosaurusFossilModel extends SkullModelBase {
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

	public ProceratosaurusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(29, 16).addBox(-0.5F, -0.8F, -2.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(37, 89).addBox(0.5F, -0.3F, 4.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 89).mirror().addBox(-1.5F, -0.3F, 4.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.8F, -1.5F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Hips.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(34, 89).addBox(0.0F, -0.9F, -3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0161F, 0.6098F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Hips.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(48, 19).addBox(0.0F, -0.9F, -1.5F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0161F, 1.1098F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Hips.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(83, 88).addBox(0.0F, -1.0F, 5.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7403F, -1.784F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 79).mirror().addBox(0.4499F, 1.1616F, 4.5172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.4777F, 0.7304F, -1.5455F, 0.0196F, -0.085F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(0.4499F, 3.4477F, -0.4615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.4777F, 0.7304F, -0.0968F, 0.0196F, -0.085F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 76).mirror().addBox(0.4499F, 2.9529F, 1.1392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.4777F, 0.7304F, -0.5681F, 0.0196F, -0.085F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 70).mirror().addBox(0.4499F, 0.442F, 3.5813F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.4777F, 0.7304F, -1.144F, 0.0196F, -0.085F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-1.5F, 0.0296F, -1.9889F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(0, 59).addBox(0.5F, 0.0296F, -1.9889F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1F, 2.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 62).mirror().addBox(-1.0F, -1.056F, -1.7268F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2F, 0.1F, 0.1396F, 0.3491F, 0.0F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.5F, -0.5892F, -0.3238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6102F, -0.2444F, -1.3884F, 0.9061F, 0.3367F, 0.0939F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6756F, -1.4987F, -1.6681F, 0.0524F, 0.3491F, 0.0F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.5F, -0.4328F, -0.5051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6102F, -0.2444F, -1.3884F, 0.6268F, 0.3367F, 0.0939F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(47, 54).mirror().addBox(-1.0F, -0.1015F, 0.0641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0F, 2.1F, -0.2373F, -0.2929F, -0.0478F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 54).mirror().addBox(-1.0F, 0.9379F, -0.4148F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0F, 2.1F, 0.1292F, -0.2929F, -0.0478F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 59).mirror().addBox(-1.5F, -0.5798F, -1.7095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(54, 59).addBox(0.5F, -0.5798F, -1.7095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.1F, -0.2725F, -0.5384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5F, 2.3F, 0.6911F, 0.1148F, -0.3864F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(36, 76).mirror().addBox(-0.1F, -0.1215F, -0.6943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5F, 2.3F, 0.8873F, 0.0453F, -0.3334F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-0.1F, -0.358F, -1.693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5F, 2.3F, 0.2024F, 0.1148F, -0.3864F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(52, 64).mirror().addBox(-0.3698F, -1.1052F, -1.5678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.5F, 2.3F, -0.0768F, -0.0147F, -0.3838F));

		PartDefinition cube_r17 = Hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(43, 75).mirror().addBox(-0.5F, -1.8353F, -0.4971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.3617F, 3.6621F, 4.5577F, 0.7614F, 0.0982F, -0.1482F));

		PartDefinition cube_r18 = Hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 75).mirror().addBox(-0.5F, -0.1648F, -0.4883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3617F, 3.6621F, 4.5577F, 0.7439F, 0.0982F, -0.1482F));

		PartDefinition cube_r19 = Hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(59, 64).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(47, 59).mirror().addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(59, 64).addBox(1.7F, -0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 59).addBox(1.7F, -1.8F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1F, 1.7998F, 0.2172F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(61, 59).mirror().addBox(-0.5F, -1.8905F, -0.4146F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(61, 59).addBox(1.7F, -1.8905F, -0.4146F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-1.1F, 1.3998F, -0.3828F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 71).mirror().addBox(-0.15F, -0.2679F, -0.4579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5777F, 0.0304F, -0.0383F, 0.1127F, -0.5124F));

		PartDefinition cube_r22 = Hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 58).mirror().addBox(-0.3447F, -0.2347F, -0.5723F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.7777F, 0.0304F, -0.0616F, 0.0207F, -0.0676F));

		PartDefinition cube_r23 = Hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(78, 26).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.524F, -2.3422F, 0.2184F, 0.0511F, -1.2387F));

		PartDefinition cube_r24 = Hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.524F, -2.3422F, 0.2326F, 0.0131F, -0.8038F));

		PartDefinition cube_r25 = Hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(33, 62).addBox(0.0F, -1.056F, -1.7268F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.2F, 0.1F, 0.1396F, -0.3491F, 0.0F));

		PartDefinition cube_r26 = Hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 3).addBox(-0.5F, -0.5892F, -0.3238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6102F, -0.2444F, -1.3884F, 0.9061F, -0.3367F, -0.0939F));

		PartDefinition cube_r27 = Hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(10, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6756F, -1.4987F, -1.6681F, 0.0524F, -0.3491F, 0.0F));

		PartDefinition cube_r28 = Hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5F, -0.4328F, -0.5051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6102F, -0.2444F, -1.3884F, 0.6268F, -0.3367F, -0.0939F));

		PartDefinition cube_r29 = Hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(47, 54).addBox(0.0F, -0.1015F, 0.0641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -2.0F, 2.1F, -0.2373F, 0.2929F, 0.0478F));

		PartDefinition cube_r30 = Hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(10, 54).addBox(0.0F, 0.9379F, -0.4148F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -2.0F, 2.1F, 0.1292F, 0.2929F, 0.0478F));

		PartDefinition cube_r31 = Hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 80).addBox(-0.9F, -0.2725F, -0.5384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, 1.5F, 2.3F, 0.6911F, -0.1148F, 0.3864F));

		PartDefinition cube_r32 = Hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(36, 76).addBox(-0.9F, -0.1215F, -0.6943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.4F, 1.5F, 2.3F, 0.8873F, -0.0453F, 0.3334F));

		PartDefinition cube_r33 = Hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(64, 37).addBox(-0.9F, -0.358F, -1.693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.4F, 1.5F, 2.3F, 0.2024F, -0.1148F, 0.3864F));

		PartDefinition cube_r34 = Hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 64).addBox(-0.6302F, -1.1052F, -1.5678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 2.5F, 2.3F, -0.0768F, 0.0147F, 0.3838F));

		PartDefinition cube_r35 = Hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(43, 75).addBox(-0.5F, -1.8353F, -0.4971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.3617F, 3.6621F, 4.5577F, 0.7614F, -0.0982F, 0.1482F));

		PartDefinition cube_r36 = Hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(48, 75).addBox(-0.5F, -0.1648F, -0.4883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3617F, 3.6621F, 4.5577F, 0.7439F, -0.0982F, 0.1482F));

		PartDefinition cube_r37 = Hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(73, 71).addBox(-0.85F, -0.2679F, -0.4579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, 1.5777F, 0.0304F, -0.0383F, -0.1127F, 0.5124F));

		PartDefinition cube_r38 = Hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(28, 58).addBox(-0.6553F, -0.2347F, -0.5723F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.5F, 2.7777F, 0.0304F, -0.0616F, -0.0207F, 0.0676F));

		PartDefinition cube_r39 = Hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 67).addBox(-1.4499F, 3.4477F, -0.4615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, 2.4777F, 0.7304F, -0.0968F, -0.0196F, 0.085F));

		PartDefinition cube_r40 = Hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(31, 76).addBox(-1.4499F, 2.9529F, 1.1392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.4F, 2.4777F, 0.7304F, -0.5681F, -0.0196F, 0.085F));

		PartDefinition cube_r41 = Hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(47, 70).addBox(-1.4499F, 0.442F, 3.5813F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.4F, 2.4777F, 0.7304F, -1.144F, -0.0196F, 0.085F));

		PartDefinition cube_r42 = Hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(86, 79).addBox(-1.4499F, 1.1616F, 4.5172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, 2.4777F, 0.7304F, -1.5455F, -0.0196F, 0.085F));

		PartDefinition cube_r43 = Hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 26).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.524F, -2.3422F, 0.2184F, -0.0511F, 1.2387F));

		PartDefinition cube_r44 = Hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(10, 89).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.524F, -2.3422F, 0.2326F, -0.0131F, 0.8038F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.539F, -4.9342F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.247F, -2.8972F, 0.1061F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodymiddle.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(80, 88).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7012F, -1.4083F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodymiddle.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(42, 89).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7361F, -3.408F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodymiddle.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(43, 71).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5838F, -5.3047F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Bodymiddle.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(3, 91).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7435F, -7.3208F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Bodymiddle.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(75, 88).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.263F, -1.3764F, 0.2326F, 0.0131F, -0.7864F));

		PartDefinition cube_r46 = Bodymiddle.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(17, 76).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.263F, -1.3764F, 0.2184F, 0.0511F, -1.2213F));

		PartDefinition cube_r47 = Bodymiddle.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.263F, -3.3764F, 0.2566F, 0.1096F, -1.1309F));

		PartDefinition cube_r48 = Bodymiddle.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(78, 63).mirror().addBox(-4.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.263F, -3.3764F, 0.1783F, 0.2152F, -1.6058F));

		PartDefinition cube_r49 = Bodymiddle.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.263F, -3.3764F, 0.2918F, 0.0501F, -0.6972F));

		PartDefinition cube_r50 = Bodymiddle.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(88, 74).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.163F, -5.3764F, 0.3662F, 0.0961F, -0.622F));

		PartDefinition cube_r51 = Bodymiddle.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.163F, -5.3764F, 0.3052F, 0.1825F, -1.0541F));

		PartDefinition cube_r52 = Bodymiddle.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(48, 6).mirror().addBox(-5.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.163F, -5.3764F, 0.1879F, 0.302F, -1.5335F));

		PartDefinition cube_r53 = Bodymiddle.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(88, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.037F, -7.3764F, 0.4412F, 0.1416F, -0.5433F));

		PartDefinition cube_r54 = Bodymiddle.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(75, 61).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.037F, -7.3764F, 0.3551F, 0.2549F, -0.9734F));

		PartDefinition cube_r55 = Bodymiddle.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(38, 26).mirror().addBox(-5.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.037F, -7.3764F, 0.1979F, 0.3887F, -1.4603F));

		PartDefinition cube_r56 = Bodymiddle.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(75, 88).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.263F, -1.3764F, 0.2326F, -0.0131F, 0.7864F));

		PartDefinition cube_r57 = Bodymiddle.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(17, 76).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.263F, -1.3764F, 0.2184F, -0.0511F, 1.2213F));

		PartDefinition cube_r58 = Bodymiddle.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(78, 65).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.263F, -3.3764F, 0.2566F, -0.1096F, 1.1309F));

		PartDefinition cube_r59 = Bodymiddle.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(78, 63).addBox(2.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.263F, -3.3764F, 0.1783F, -0.2152F, 1.6058F));

		PartDefinition cube_r60 = Bodymiddle.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(89, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.263F, -3.3764F, 0.2918F, -0.0501F, 0.6972F));

		PartDefinition cube_r61 = Bodymiddle.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(88, 74).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.163F, -5.3764F, 0.3662F, -0.0961F, 0.622F));

		PartDefinition cube_r62 = Bodymiddle.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(76, 14).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.163F, -5.3764F, 0.3052F, -0.1825F, 1.0541F));

		PartDefinition cube_r63 = Bodymiddle.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(48, 6).addBox(2.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.163F, -5.3764F, 0.1879F, -0.302F, 1.5335F));

		PartDefinition cube_r64 = Bodymiddle.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(88, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.037F, -7.3764F, 0.4412F, -0.1416F, 0.5433F));

		PartDefinition cube_r65 = Bodymiddle.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(75, 61).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.037F, -7.3764F, 0.3551F, -0.2549F, 0.9734F));

		PartDefinition cube_r66 = Bodymiddle.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(38, 26).addBox(2.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.037F, -7.3764F, 0.1979F, -0.3887F, 1.4603F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(57, 19).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.161F, -8.3342F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.161F, -7.6342F, 0.1416F, 0.0864F, 0.0123F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(66, 8).addBox(0.0F, -1.3832F, -0.0048F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 91).addBox(0.0F, -1.4832F, 1.9952F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 47).addBox(-0.5F, -0.6832F, -0.0048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0771F, -4.1135F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(-2.3F, -0.8933F, -2.9913F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(53, 44).addBox(0.3F, -0.8933F, -2.9913F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 5.5356F, -1.8674F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5F, 0.0203F, 0.0975F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 5.1703F, -1.9036F, 0.2835F, -0.361F, -0.2262F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(13, 42).mirror().addBox(-0.5F, 0.0203F, 0.0975F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 5.1703F, -1.9036F, 0.0572F, -0.0981F, -0.2251F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(48, 14).mirror().addBox(-0.5F, 0.0203F, 0.0975F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 5.1703F, -1.9036F, 0.1443F, -0.2725F, -0.2253F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(42, 60).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.7557F, 0.5325F, 0.1951F, -0.685F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(55, 42).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.7557F, 0.4175F, 0.341F, -1.1122F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(48, 37).mirror().addBox(-4.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.7557F, 0.211F, 0.4928F, -1.6118F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -1.7557F, 0.3961F, 0.1144F, -0.6014F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -1.7557F, 0.325F, 0.2115F, -1.0327F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(29, 26).mirror().addBox(-5.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -1.7557F, 0.1918F, 0.3367F, -1.5148F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(42, 44).mirror().addBox(-0.7507F, -1.2248F, -2.2714F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(42, 44).addBox(4.2493F, -1.2248F, -2.2714F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2493F, 1.9662F, -2.3424F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(59, 33).mirror().addBox(-0.7507F, -1.2036F, -1.9579F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 33).addBox(4.2493F, -1.2036F, -1.9579F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2493F, 1.9662F, -2.3424F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(33, 67).mirror().addBox(-0.7507F, -1.4243F, 1.5654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 67).addBox(4.2493F, -1.4243F, 1.5654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2493F, 1.9662F, -2.3424F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(58, 49).mirror().addBox(-0.1F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4605F, 3.3112F, -3.8374F, 1.9281F, -0.2566F, -0.4616F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, 0.0203F, 0.0975F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 5.1703F, -1.9036F, 0.2835F, 0.361F, 0.2262F));

		PartDefinition cube_r82 = Bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(13, 42).addBox(-0.5F, 0.0203F, 0.0975F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 5.1703F, -1.9036F, 0.0572F, 0.0981F, 0.2251F));

		PartDefinition cube_r83 = Bodyfront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(48, 14).addBox(-0.5F, 0.0203F, 0.0975F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 5.1703F, -1.9036F, 0.1443F, 0.2725F, 0.2253F));

		PartDefinition cube_r84 = Bodyfront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(42, 60).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.7557F, 0.5325F, -0.1951F, 0.685F));

		PartDefinition cube_r85 = Bodyfront.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(55, 42).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.7557F, 0.4175F, -0.341F, 1.1122F));

		PartDefinition cube_r86 = Bodyfront.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(48, 37).addBox(2.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.7557F, 0.211F, -0.4928F, 1.6118F));

		PartDefinition cube_r87 = Bodyfront.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(88, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -1.7557F, 0.3961F, -0.1144F, 0.6014F));

		PartDefinition cube_r88 = Bodyfront.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(74, 44).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -1.7557F, 0.325F, -0.2115F, 1.0327F));

		PartDefinition cube_r89 = Bodyfront.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(29, 26).addBox(2.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -1.7557F, 0.1918F, -0.3367F, 1.5148F));

		PartDefinition cube_r90 = Bodyfront.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(58, 49).addBox(-0.9F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4605F, 3.3112F, -3.8374F, 1.9281F, 0.2566F, 0.4616F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(45, 89).addBox(0.0F, -1.0034F, -1.8204F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0229F, -3.9635F, -0.4505F, -0.1574F, 0.0757F));

		PartDefinition Neckfront_r1 = Neckbase.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(19, 54).mirror().addBox(-0.0493F, -0.7121F, -0.145F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.306F, -1.6346F, -0.4632F, -0.3553F, 0.1223F));

		PartDefinition Neckfront_r2 = Neckbase.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(19, 54).addBox(0.0493F, -0.7121F, -0.145F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.306F, -1.6346F, -0.4632F, 0.3553F, -0.1223F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(24, 53).addBox(-0.5F, -0.2092F, 0.1184F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4786F, -2.9207F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = Neckbase.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1847F, -2.6239F, -0.6919F, -0.1784F, -0.079F));

		PartDefinition Neckfront_r3 = Neckmiddle.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(12, 76).mirror().addBox(-0.0354F, -0.7905F, -0.3497F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6979F, -0.4144F, 0.08F, -0.2709F, 0.0789F));

		PartDefinition Neckfront_r4 = Neckmiddle.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(76, 10).mirror().addBox(-0.0188F, -0.7416F, -0.0397F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7686F, -2.8864F, -0.1482F, -0.2013F, 0.0846F));

		PartDefinition Neckfront_r5 = Neckmiddle.addOrReplaceChild("Neckfront_r5", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.0114F, -0.5988F, -0.0369F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7686F, -4.9864F, -0.1307F, -0.2013F, 0.0846F));

		PartDefinition Neckfront_r6 = Neckmiddle.addOrReplaceChild("Neckfront_r6", CubeListBuilder.create().texOffs(12, 76).addBox(0.0354F, -0.7905F, -0.3497F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6979F, -0.4144F, 0.08F, 0.2709F, -0.0789F));

		PartDefinition Neckfront_r7 = Neckmiddle.addOrReplaceChild("Neckfront_r7", CubeListBuilder.create().texOffs(76, 10).addBox(0.0188F, -0.7416F, -0.0397F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7686F, -2.8864F, -0.1482F, 0.2013F, -0.0846F));

		PartDefinition Neckfront_r8 = Neckmiddle.addOrReplaceChild("Neckfront_r8", CubeListBuilder.create().texOffs(76, 6).addBox(0.0114F, -0.5988F, -0.0369F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7686F, -4.9864F, -0.1307F, 0.2013F, -0.0846F));

		PartDefinition Neckmiddle_r1 = Neckmiddle.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(89, 90).addBox(-0.5F, -1.5116F, -4.8856F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 9).addBox(-1.0F, -0.9116F, -4.8856F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.4756F, -0.0873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckmiddle_r2 = Neckmiddle.addOrReplaceChild("Neckmiddle_r2", CubeListBuilder.create().texOffs(86, 90).addBox(-0.5F, -0.9551F, 0.0893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0756F, -3.0873F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle_r3 = Neckmiddle.addOrReplaceChild("Neckmiddle_r3", CubeListBuilder.create().texOffs(90, 85).addBox(-0.5F, -0.9123F, -0.9118F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0244F, -0.0873F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Neckfront = Neckmiddle.addOrReplaceChild("Neckfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.1756F, -4.9373F, 0.6831F, -0.1621F, -0.2904F));

		PartDefinition Neckfront_r9 = Neckfront.addOrReplaceChild("Neckfront_r9", CubeListBuilder.create().texOffs(76, 90).mirror().addBox(-0.0031F, -0.9043F, 0.1857F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.5852F, -1.8642F, -0.4013F, -0.2013F, 0.0846F));

		PartDefinition Neckfront_r10 = Neckfront.addOrReplaceChild("Neckfront_r10", CubeListBuilder.create().texOffs(76, 90).addBox(0.0031F, -0.9043F, 0.1857F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.5852F, -1.8642F, -0.4013F, 0.2013F, -0.0846F));

		PartDefinition Neckfront_r11 = Neckfront.addOrReplaceChild("Neckfront_r11", CubeListBuilder.create().texOffs(14, 67).addBox(-0.49F, 0.0304F, -1.9906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4664F, -1.8282F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Neckfront_r12 = Neckfront.addOrReplaceChild("Neckfront_r12", CubeListBuilder.create().texOffs(73, 90).addBox(0.01F, -0.7695F, 0.0007F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2664F, -1.8282F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Neckfront_r13 = Neckfront.addOrReplaceChild("Neckfront_r13", CubeListBuilder.create().texOffs(66, 64).addBox(-0.49F, -0.2F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2664F, -2.5282F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head = Neckfront.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(40, 83).addBox(0.44F, -1.0559F, -2.6226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(85, 56).addBox(0.44F, -1.0559F, -2.2226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(85, 56).mirror().addBox(-1.42F, -1.0559F, -2.2226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(40, 83).mirror().addBox(-1.42F, -1.0559F, -2.6226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3163F, -2.7662F, 0.4255F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(19, 58).addBox(-1.69F, -0.0436F, -1.015F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(73, 19).addBox(-1.69F, -0.0436F, 0.385F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(19, 73).addBox(-1.49F, -0.0436F, -0.015F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(57, 29).addBox(-1.49F, -0.0436F, -0.615F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6F, -0.8664F, -2.34F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(66, 33).addBox(-1.09F, -0.2117F, -0.8688F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(66, 0).addBox(-0.49F, -0.2117F, -0.8688F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2F, -0.3664F, 0.46F, -0.4276F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(83, 76).addBox(-1.09F, -0.4286F, 0.6376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(0, 73).addBox(-1.09F, -0.4286F, 0.3376F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(82, 60).addBox(0.51F, -0.4286F, 0.6376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(59, 72).addBox(-0.49F, -0.4286F, 0.3376F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, -1.1664F, -0.44F, -0.8465F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(66, 29).addBox(-1.09F, -0.255F, -0.1847F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(72, 54).addBox(-0.49F, -0.255F, -0.1847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.2F, -1.1664F, -0.44F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(66, 25).addBox(-1.51F, 0.3907F, 0.1204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F))
				.texOffs(66, 4).addBox(0.09F, 0.3907F, 0.2204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.22F, -0.8664F, -0.04F, -1.1432F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(66, 72).addBox(-1.89F, -0.7064F, 1.09F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(52, 72).addBox(-1.29F, -0.7064F, 1.09F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.6F, -0.8664F, -2.34F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(13, 48).addBox(-1.69F, -2.0351F, -2.9828F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.012F))
				.texOffs(48, 0).addBox(-1.49F, -2.0351F, -2.7828F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6F, 1.3336F, -0.34F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(-0.5F, -0.688F, -0.3053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(85, 85).addBox(1.36F, -0.688F, -0.3053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.92F, -0.7555F, -0.8849F, -0.8901F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -0.2846F, -0.3606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(0, 86).addBox(1.36F, -0.2846F, -0.3606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.92F, -0.6555F, -0.2849F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-0.5F, -0.2951F, -0.2604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 6).addBox(1.36F, -0.2951F, -0.2604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.92F, -0.3555F, -0.2849F, -2.0246F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(83, 73).mirror().addBox(-0.5F, -0.6667F, -0.4306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 73).addBox(1.36F, -0.6667F, -0.4306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.92F, 0.6445F, -0.7849F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(83, 70).mirror().addBox(-0.5F, -0.3713F, -0.4458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(83, 70).addBox(1.36F, -0.3713F, -0.4458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.92F, 0.6445F, -0.7849F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(83, 67).mirror().addBox(-0.5F, -0.3655F, -0.3086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 67).addBox(1.36F, -0.3655F, -0.3086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.92F, 0.6445F, -0.7849F, -1.0297F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(22, 78).mirror().addBox(-0.5F, -1.7289F, -0.2958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(22, 78).addBox(1.36F, -1.7289F, -0.2958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.92F, 1.0445F, -1.2849F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(68, 75).mirror().addBox(-0.5F, -1.1879F, -0.6383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(68, 75).addBox(1.36F, -1.1879F, -0.6383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.92F, 0.6445F, -0.7849F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-0.5F, -0.6981F, -0.3481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(80, 85).addBox(1.36F, -0.6981F, -0.3481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.92F, -0.3555F, -0.9849F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(-0.42F, -0.5566F, -0.404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false)
				.texOffs(61, 82).mirror().addBox(-0.55F, -0.5566F, -0.404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(61, 82).addBox(1.25F, -0.5566F, -0.404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(35, 86).addBox(1.12F, -0.5566F, -0.404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(-0.84F, 0.0137F, -2.4091F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(83, 31).mirror().addBox(-0.58F, -0.5836F, -0.0691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(83, 34).addBox(1.28F, -0.6836F, -0.2691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(83, 31).addBox(1.28F, -0.5836F, -0.0691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.84F, 0.0137F, -2.4091F, -2.9496F, 0.0F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(85, 63).mirror().addBox(-0.58F, -0.6835F, -0.7084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(85, 63).addBox(1.28F, -0.6835F, -0.7084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.84F, 0.7137F, -2.7091F, -2.1817F, 0.0F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(30, 83).mirror().addBox(-0.58F, -0.7067F, -0.7381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(30, 83).addBox(1.28F, -0.7067F, -0.7381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.84F, 0.4137F, -3.0091F, -2.426F, 0.0F, 0.0F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-0.58F, -0.57F, -0.1006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(83, 37).addBox(1.28F, -0.57F, -0.1006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.84F, 0.0137F, -2.4091F, 2.7576F, 0.0F, 0.0F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-0.58F, -0.3729F, -0.0966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(35, 83).addBox(1.28F, -0.3729F, -0.0966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.84F, 0.0137F, -2.4091F, 2.4435F, 0.0F, 0.0F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(-0.58F, -0.9583F, -0.2773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(45, 83).addBox(1.28F, -0.9583F, -0.2773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.84F, 0.0137F, -2.4091F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(60, 85).mirror().addBox(-0.58F, -0.2697F, -0.3135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(60, 85).addBox(1.28F, -0.2697F, -0.3135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.84F, -0.7863F, -1.5091F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(75, 85).mirror().addBox(-0.58F, -1.3341F, -0.4529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(70, 85).mirror().addBox(-0.58F, -1.3341F, -0.5529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(66, 21).mirror().addBox(-0.58F, -0.9341F, -0.9529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(66, 68).mirror().addBox(-0.58F, -0.5341F, -0.9529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(66, 68).addBox(1.28F, -0.5341F, -0.9529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(75, 85).addBox(1.28F, -1.3341F, -0.4529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(70, 85).addBox(1.28F, -1.3341F, -0.5529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(66, 21).addBox(1.28F, -0.9341F, -0.9529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.84F, 0.0137F, -2.4091F, -1.3614F, 0.0F, 0.0F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(83, 28).addBox(1.36F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.92F, 0.6999F, -2.011F, -1.3963F, 0.0F, 0.0F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(65, 85).mirror().addBox(-0.58F, -0.723F, -0.7002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(65, 85).addBox(1.28F, -0.723F, -0.7002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.84F, 0.9137F, -2.4091F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.58F, -1.67F, -0.3493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(0, 76).addBox(1.28F, -1.67F, -0.3493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.84F, 0.8137F, -1.9091F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(25, 83).addBox(-1.29F, -0.0869F, -0.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(56, 82).addBox(-0.89F, -0.0869F, -0.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6F, -0.6664F, -2.94F, 0.288F, 0.0F, 0.0F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(66, 82).mirror().addBox(-0.5F, -0.7282F, -0.364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(66, 17).mirror().addBox(-0.5F, -1.1282F, -0.364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(66, 17).addBox(0.56F, -1.1282F, -0.364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F))
				.texOffs(66, 82).addBox(0.56F, -0.7282F, -0.364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.52F, 0.0157F, -4.1291F, -1.405F, 0.0F, 0.0F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(-0.5F, -0.3117F, -0.2654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(20, 85).addBox(0.56F, -0.3117F, -0.2654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.52F, -0.0843F, -4.1291F, -1.1257F, 0.0F, 0.0F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(85, 25).mirror().addBox(-0.5F, -0.2686F, -0.3168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(85, 25).addBox(0.56F, -0.2686F, -0.3168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.52F, 0.1157F, -4.4291F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(71, 79).mirror().addBox(-0.5F, -0.7511F, -0.267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false)
				.texOffs(71, 79).addBox(0.56F, -0.7511F, -0.267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.52F, 0.8157F, -5.1291F, -0.4276F, 0.0F, 0.0F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(76, 79).mirror().addBox(-0.5F, -0.7042F, -0.2831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(76, 79).addBox(0.56F, -0.7042F, -0.2831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.52F, 0.4157F, -4.9291F, -0.9687F, 0.0F, 0.0F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(83, 22).mirror().addBox(-0.5F, -0.4183F, -0.6859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(83, 22).addBox(0.56F, -0.4183F, -0.6859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.52F, 1.4157F, -4.8291F, -1.2217F, 0.0F, 0.0F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(50, 85).mirror().addBox(-0.5F, -0.7344F, -0.2773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(50, 85).addBox(0.56F, -0.7344F, -0.2773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.52F, 1.5157F, -5.1291F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(66, 79).mirror().addBox(-0.5F, -0.6673F, -0.2619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(66, 79).addBox(0.56F, -0.6673F, -0.2619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.52F, 1.1157F, -5.2291F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(86, 82).mirror().addBox(-0.5F, -0.2935F, -0.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(86, 82).addBox(0.56F, -0.2935F, -0.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.52F, 1.4157F, -4.3291F, -1.405F, 0.0F, 0.0F));

		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(17, 78).mirror().addBox(-0.5F, -1.0F, -0.2273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F)).mirror(false)
				.texOffs(73, 75).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(17, 78).addBox(0.56F, -1.0F, -0.2273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F))
				.texOffs(73, 75).addBox(0.56F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.52F, 0.6336F, -4.2304F, -1.2915F, 0.0F, 0.0F));

		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(78, 36).mirror().addBox(-0.5F, -1.7203F, -0.7508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(78, 36).addBox(0.56F, -1.7203F, -0.7508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.52F, 1.5157F, -4.3291F, -1.3526F, 0.0F, 0.0F));

		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(88, 21).mirror().addBox(-0.37F, -0.6489F, -0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(88, 21).addBox(-0.15F, -0.6489F, -0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.24F, -0.7848F, -5.8832F, -2.6093F, 0.0F, 0.0F));

		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.37F, -0.7249F, -0.7009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(15, 88).addBox(-0.15F, -0.7249F, -0.7009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.24F, -0.1848F, -6.3832F, -2.0159F, 0.0F, 0.0F));

		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-0.37F, -0.7165F, -0.6537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(20, 88).addBox(-0.15F, -0.7165F, -0.6537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.24F, -0.5848F, -6.1832F, -2.3649F, 0.0F, 0.0F));

		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(78, 75).mirror().addBox(-0.37F, -1.6484F, -0.5888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 75).addBox(-0.15F, -1.6484F, -0.5888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.24F, 0.5152F, -5.9832F, -0.4625F, 0.0F, 0.0F));

		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.37F, -0.3202F, -0.6632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(5, 88).addBox(-0.15F, -0.3202F, -0.6632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.24F, 0.5152F, -5.9832F, -1.3875F, 0.0F, 0.0F));

		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-0.37F, -0.6589F, -0.6954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(88, 12).addBox(-0.15F, -0.6589F, -0.6954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.24F, 0.2152F, -6.3832F, -1.7366F, 0.0F, 0.0F));

		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.52F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(83, 12).mirror().addBox(-0.52F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(83, 12).addBox(-0.2F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(10, 83).addBox(-0.2F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.14F, 0.0396F, -5.287F, -0.6458F, 0.0F, 0.0F));

		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(50, 88).mirror().addBox(-0.42F, -0.7936F, -0.1772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(50, 88).addBox(-0.4F, -0.7936F, -0.1772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.09F, -1.9459F, -3.6993F, -1.8762F, 0.0F, 0.0F));

		PartDefinition Head_r49 = Head.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(55, 88).mirror().addBox(-0.42F, -0.8257F, -0.1986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 88).addBox(-0.4F, -0.8257F, -0.1986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.09F, -1.746F, -4.2993F, -1.2828F, 0.0F, 0.0F));

		PartDefinition Head_r50 = Head.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.42F, -0.0426F, -0.5356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(40, 86).mirror().addBox(-0.42F, -0.4426F, -0.5356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(45, 86).addBox(-0.4F, -0.0426F, -0.5356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(40, 86).addBox(-0.4F, -0.4426F, -0.5356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.09F, -1.346F, -4.1993F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Head_r51 = Head.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-0.42F, -0.2198F, -0.7858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(78, 22).addBox(-0.4F, -0.2198F, -0.7858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.09F, -1.246F, -3.2993F, -1.0734F, 0.0F, 0.0F));

		PartDefinition Head_r52 = Head.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(55, 85).addBox(-0.5F, -0.3194F, -0.7277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.54F, 0.4952F, -3.0586F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r53 = Head.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.54F, 0.3952F, -3.3586F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Head_r54 = Head.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(81, 82).addBox(-0.48F, 1.5866F, 0.7349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.32F, 0.1157F, -3.5291F, -1.405F, 0.0F, 0.0F));

		PartDefinition Head_r55 = Head.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(85, 15).mirror().addBox(-0.48F, -0.3121F, -0.4126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(85, 15).mirror().addBox(-0.49F, -0.3121F, -0.4126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(85, 15).addBox(0.15F, -0.3121F, -0.4126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.32F, 2.2004F, -6.9562F, -1.8413F, 0.0F, 0.0F));

		PartDefinition Head_r56 = Head.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.49F, -1.6967F, -0.3489F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(5, 78).addBox(0.15F, -1.6967F, -0.3489F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.32F, 2.0004F, -7.5562F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Head_r57 = Head.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-0.49F, -0.6825F, -0.3365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(15, 85).addBox(0.15F, -0.6825F, -0.3365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.32F, 1.0004F, -6.5562F, -1.3177F, 0.0F, 0.0F));

		PartDefinition Head_r58 = Head.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(68, 59).mirror().addBox(-0.49F, -0.2736F, -0.3522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(68, 59).addBox(0.15F, -0.2736F, -0.3522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.32F, 1.3004F, -6.0562F, -2.33F, 0.0F, 0.0F));

		PartDefinition Head_r59 = Head.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(-0.49F, -0.4368F, -0.4794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 82).addBox(0.15F, -0.4368F, -0.4794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.32F, 2.3004F, -7.3562F, -0.7069F, 0.0F, 0.0F));

		PartDefinition Head_r60 = Head.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(5, 85).mirror().addBox(-0.49F, -0.7077F, -0.3163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(5, 85).addBox(0.15F, -0.7077F, -0.3163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.32F, 2.4004F, -7.6562F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r61 = Head.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(85, 18).mirror().addBox(-0.49F, -0.3283F, -0.3284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(85, 18).addBox(0.15F, -0.3283F, -0.3284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.32F, 2.5004F, -7.0562F, -2.8013F, 0.0F, 0.0F));

		PartDefinition Head_r62 = Head.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(71, 82).mirror().addBox(-0.51F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(71, 82).addBox(0.13F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.3F, 1.7262F, -5.6644F, -1.1606F, 0.0F, 0.0F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0964F, -2.84F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r1 = Upperjawbase.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(87, 46).addBox(-0.49F, -0.9542F, -0.9816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.0F, -3.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r2 = Upperjawbase.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(87, 43).addBox(-0.49F, -1.0496F, 0.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 1.9F, -5.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r3 = Upperjawbase.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(82, 47).addBox(-0.69F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 82).addBox(-0.31F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 2.0223F, -1.3951F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r4 = Upperjawbase.addOrReplaceChild("Upperjawbase_r4", CubeListBuilder.create().texOffs(65, 88).addBox(-0.7F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(60, 88).addBox(-0.32F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.02F, 2.1049F, -2.3967F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r5 = Upperjawbase.addOrReplaceChild("Upperjawbase_r5", CubeListBuilder.create().texOffs(26, 65).addBox(-0.39F, -0.9675F, -1.9095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 65).addBox(0.01F, -0.9675F, -1.9095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 2.2F, -1.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r6 = Upperjawbase.addOrReplaceChild("Upperjawbase_r6", CubeListBuilder.create().texOffs(0, 69).addBox(-0.39F, 0.0249F, -1.9819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(84, 50).addBox(0.01F, 0.5249F, -0.9819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(7, 69).addBox(0.01F, 0.0249F, -1.9819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.3F, 0.1F, -1.3F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r7 = Upperjawbase.addOrReplaceChild("Upperjawbase_r7", CubeListBuilder.create().texOffs(82, 44).addBox(-0.39F, 0.0475F, -0.9866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(81, 9).addBox(0.01F, 0.0475F, -0.9866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.3F, 0.2F, -0.3F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r8 = Upperjawbase.addOrReplaceChild("Upperjawbase_r8", CubeListBuilder.create().texOffs(7, 65).addBox(-0.39F, -0.9649F, -1.9225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 62).addBox(0.01F, -1.9649F, -1.9225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 2.5F, -0.1F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r9 = Upperjawbase.addOrReplaceChild("Upperjawbase_r9", CubeListBuilder.create().texOffs(88, 28).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.2346F, -3.4082F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r10 = Upperjawbase.addOrReplaceChild("Upperjawbase_r10", CubeListBuilder.create().texOffs(15, 82).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.9654F, -4.3918F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r11 = Upperjawbase.addOrReplaceChild("Upperjawbase_r11", CubeListBuilder.create().texOffs(5, 82).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.8956F, -5.3894F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r12 = Upperjawbase.addOrReplaceChild("Upperjawbase_r12", CubeListBuilder.create().texOffs(81, 79).addBox(-0.49F, -0.0519F, -0.9187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawbase.addOrReplaceChild("Upperjawfront", CubeListBuilder.create().texOffs(69, 8).addBox(-0.5F, 0.4777F, -0.8693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.1F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(85, 3).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.3654F, 3.5812F, -1.4661F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(59, 68).addBox(-0.605F, -0.1675F, -0.229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.105F, -0.1707F, 4.2274F, -2.042F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r3 = Upperjawfront.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(85, 0).addBox(-0.605F, -0.2712F, -0.2051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.105F, -0.7707F, 4.0274F, -1.4137F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r4 = Upperjawfront.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(77, 46).addBox(-0.605F, -0.2474F, -0.2267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.105F, -0.9707F, 3.5274F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r5 = Upperjawfront.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(63, 75).addBox(-0.605F, -0.1875F, -0.1971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.105F, -1.1707F, 2.9274F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r6 = Upperjawfront.addOrReplaceChild("Upperjawfront_r6", CubeListBuilder.create().texOffs(48, 26).addBox(-0.605F, -1.1348F, -0.9705F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.105F, -0.3707F, 1.0274F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r7 = Upperjawfront.addOrReplaceChild("Upperjawfront_r7", CubeListBuilder.create().texOffs(7, 73).addBox(-0.605F, -0.2421F, -0.7882F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.105F, -1.2707F, -0.2726F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r8 = Upperjawfront.addOrReplaceChild("Upperjawfront_r8", CubeListBuilder.create().texOffs(58, 75).addBox(-0.605F, -0.1947F, -0.7947F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.105F, -1.3707F, 0.3274F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r9 = Upperjawfront.addOrReplaceChild("Upperjawfront_r9", CubeListBuilder.create().texOffs(73, 32).addBox(-0.5F, -0.2089F, -0.8475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -1.1457F, -0.798F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r10 = Upperjawfront.addOrReplaceChild("Upperjawfront_r10", CubeListBuilder.create().texOffs(84, 53).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.616F, -0.9129F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r11 = Upperjawfront.addOrReplaceChild("Upperjawfront_r11", CubeListBuilder.create().texOffs(52, 68).addBox(-0.605F, -0.1819F, -1.8151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.105F, -0.3707F, -1.7726F, 2.042F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r12 = Upperjawfront.addOrReplaceChild("Upperjawfront_r12", CubeListBuilder.create().texOffs(81, 6).addBox(-0.605F, -0.2117F, -0.8091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.105F, -0.8707F, -1.3726F, 0.9425F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r13 = Upperjawfront.addOrReplaceChild("Upperjawfront_r13", CubeListBuilder.create().texOffs(80, 57).addBox(-0.5F, -0.0182F, -0.0221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.7F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Headcrest = Upperjawfront.addOrReplaceChild("Headcrest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -1.75F, 0.1285F, 0.0F, 0.0F));

		PartDefinition Leftupperfrontteeth = Upperjawfront.addOrReplaceChild("Leftupperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.35F, 1.8F, -1.85F, -0.1471F, 0.0424F, 0.0F));

		PartDefinition Upperbackteeth = Upperjawbase.addOrReplaceChild("Upperbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -4.0F, 0.1061F, 0.0F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1336F, 0.06F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r1 = Lowerjawback.addOrReplaceChild("Lowerjawback_r1", CubeListBuilder.create().texOffs(51, 82).mirror().addBox(-1.41F, -0.2149F, 0.2567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(57, 6).mirror().addBox(-1.41F, -0.3149F, -0.5433F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(51, 82).addBox(0.39F, -0.2149F, 0.2567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(57, 6).addBox(0.39F, -0.3149F, -0.5433F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.02F, 0.5F, -2.8F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r2 = Lowerjawback.addOrReplaceChild("Lowerjawback_r2", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-1.41F, -0.29F, -1.806F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(65, 55).addBox(0.39F, -0.29F, -1.806F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.02F, -0.1F, -1.4F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r3 = Lowerjawback.addOrReplaceChild("Lowerjawback_r3", CubeListBuilder.create().texOffs(65, 51).mirror().addBox(-1.41F, -0.2849F, -0.2967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(65, 51).addBox(0.39F, -0.2849F, -0.2967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.02F, -0.1F, -1.5F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawback.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -3.0F, -0.2728F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(61, 79).mirror().addBox(-0.9F, -0.6461F, 2.5151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(88, 37).mirror().addBox(-0.9F, -0.6461F, 1.8151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(61, 79).addBox(-0.12F, -0.6461F, 2.5151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(88, 37).addBox(-0.12F, -0.6461F, 1.8151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.02F, -0.9F, -1.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r2 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(87, 59).mirror().addBox(-0.5F, -0.9051F, 1.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(88, 34).mirror().addBox(-0.5F, -0.9051F, 0.4808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(56, 79).mirror().addBox(-0.5F, -0.9051F, -0.1192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(33, 57).mirror().addBox(-0.5F, -0.6051F, -0.3192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(87, 59).addBox(0.08F, -0.9051F, 1.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(88, 34).addBox(0.08F, -0.9051F, 0.4808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(56, 79).addBox(0.08F, -0.9051F, -0.1192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(33, 57).addBox(0.08F, -0.6051F, -0.3192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.28F, -0.2F, -1.7F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r3 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r3", CubeListBuilder.create().texOffs(51, 79).mirror().addBox(-0.5F, -0.5938F, 0.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(79, 54).addBox(-0.22F, -0.5938F, -0.368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(51, 79).addBox(0.08F, -0.5938F, 0.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.28F, -0.2F, -1.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r4 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r4", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(-0.5F, -0.6948F, -0.4999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(88, 31).addBox(0.08F, -0.6948F, -0.4999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.28F, -0.3F, 0.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r5 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r5", CubeListBuilder.create().texOffs(21, 69).mirror().addBox(-0.5F, -0.4691F, 0.3897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(21, 69).addBox(0.08F, -0.4691F, 0.3897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.28F, -0.2F, -1.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleslope = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddleslope", CubeListBuilder.create().texOffs(55, 37).addBox(0.0F, -0.6104F, 0.5238F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F))
				.texOffs(55, 37).mirror().addBox(-1.0F, -0.6104F, 0.5238F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.01F, 0.1F, -3.0F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleslope_r1 = Lowerjawmiddleslope.addOrReplaceChild("Lowerjawmiddleslope_r1", CubeListBuilder.create().texOffs(65, 47).mirror().addBox(-1.0F, -0.332F, -0.3718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 47).addBox(0.0F, -0.332F, -0.3718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleslope_r2 = Lowerjawmiddleslope.addOrReplaceChild("Lowerjawmiddleslope_r2", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-1.0F, -0.2956F, -0.3685F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(69, 12).addBox(0.0F, -0.2956F, -0.3685F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleslope_r3 = Lowerjawmiddleslope.addOrReplaceChild("Lowerjawmiddleslope_r3", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-1.0F, -0.7528F, -0.3033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(57, 24).addBox(0.0F, -0.7528F, -0.3033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.4F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Rightlowerteeth = Lowerjawmiddle.addOrReplaceChild("Rightlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.22F, 0.0F, -4.8F, -0.2806F, 0.1061F, 0.0F));

		PartDefinition Leftlowerteeth = Lowerjawmiddle.addOrReplaceChild("Leftlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.0F, -4.8F, -0.2806F, -0.1061F, 0.0F));

		PartDefinition Lowerjawchinslope = Lowerjawback.addOrReplaceChild("Lowerjawchinslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.9F, -3.0F, 0.2759F, 0.0F, 0.0F));

		PartDefinition Lowerjawchinslope_r1 = Lowerjawchinslope.addOrReplaceChild("Lowerjawchinslope_r1", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-1.42F, -0.6754F, -1.3968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(10, 86).mirror().addBox(-1.42F, -0.6754F, -1.0968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 9).mirror().addBox(-1.42F, -0.6754F, -0.6968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 86).addBox(0.38F, -0.6754F, -1.3968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(10, 86).addBox(0.38F, -0.6754F, -1.0968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 9).addBox(0.38F, -0.6754F, -0.6968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.04F, 0.5F, 1.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Lowerjawchinslope_r2 = Lowerjawchinslope.addOrReplaceChild("Lowerjawchinslope_r2", CubeListBuilder.create().texOffs(56, 54).mirror().addBox(-1.42F, -0.4016F, -2.7145F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 54).addBox(0.38F, -0.4016F, -2.7145F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.04F, 0.1F, 3.4F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftArm1 = Bodyfront.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(59, 11).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.8744F, 3.9764F, -3.4227F, 0.82F, 0.3187F, -0.1359F));

		PartDefinition cube_r91 = leftArm1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(73, 63).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1146F, 4.7004F, -0.1522F, -1.9377F, 0.0387F, -0.0202F));

		PartDefinition cube_r92 = leftArm2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(79, 40).addBox(-1.75F, 2.3964F, -0.7639F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.55F, 0.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftArm2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(73, 22).addBox(-1.75F, 0.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.55F, 0.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftArm2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(14, 71).addBox(-0.5F, -2.2496F, -0.521F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.2045F, -0.3465F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftArm2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(26, 74).addBox(-0.5F, -0.2523F, -0.5575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.2045F, -0.3465F, 0.0785F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(40, 62).addBox(-1.0064F, -0.0563F, -1.0314F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(64, 11).addBox(-1.0064F, 1.8937F, -1.0314F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(46, 79).addBox(-1.0064F, 1.8937F, -0.0314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2229F, 3.6536F, -0.087F, 0.4365F, -0.5977F, -0.0562F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(28, 69).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.0064F, 0.6654F, -0.5338F, -0.2502F, 0.0779F, 0.2956F));

		PartDefinition rightArm1 = Bodyfront.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(14, 59).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.8744F, 3.9764F, -3.4227F, 0.82F, -0.3187F, 0.1359F));

		PartDefinition cube_r96 = rightArm1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(73, 67).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1146F, 4.7004F, -0.1522F, -1.9813F, -0.0387F, 0.0202F));

		PartDefinition cube_r97 = rightArm2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(41, 79).addBox(0.75F, 2.3964F, -0.7639F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -0.55F, 0.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightArm2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(73, 27).addBox(0.75F, 0.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -0.55F, 0.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightArm2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(33, 71).addBox(-0.5F, -2.2496F, -0.521F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.2045F, -0.3465F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightArm2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(74, 40).addBox(-0.5F, -0.2523F, -0.5575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.2045F, -0.3465F, 0.0785F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(62, 42).addBox(0.0064F, -0.0563F, -1.0314F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(47, 64).addBox(0.0064F, 1.8937F, -1.0314F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(79, 50).addBox(0.0064F, 1.8937F, -0.0314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2229F, 3.6536F, -0.087F, 0.4176F, 0.1415F, -0.213F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(69, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0064F, 0.6654F, -0.5338F, -0.2382F, -0.1096F, -0.4232F));

		PartDefinition Belly = Bodymiddle.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(0, 16).addBox(-2.49F, -2.0F, 0.0F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 5.861F, -8.3342F, -0.2122F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 5.2F, -0.0218F, -0.2181F, 0.0047F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(70, 90).addBox(0.0F, -1.5F, 6.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 62).addBox(0.0F, -1.5F, 4.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 55).addBox(0.0F, -1.5F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 24).addBox(0.0F, -1.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 88).mirror().addBox(-1.1F, 0.0F, 6.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 68).mirror().addBox(-1.2F, 0.0F, 4.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 66).mirror().addBox(-1.3F, 0.0F, 2.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 67).mirror().addBox(-1.4F, 0.0F, 0.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 88).addBox(0.1F, 0.0F, 6.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 68).addBox(0.2F, 0.0F, 4.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 66).addBox(0.3F, 0.0F, 2.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 67).addBox(0.4F, 0.0F, 0.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 28).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1107F, -0.0063F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(31, 89).addBox(0.0F, 4.1097F, 4.6234F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 78).addBox(0.0F, 2.1203F, 2.8738F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 49).addBox(0.0F, 1.1519F, 1.0907F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 53).addBox(0.0F, 0.199F, -0.5436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5918F, 0.4588F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3893F, 8.6937F, 0.1512F, 0.3833F, 0.0976F));

		PartDefinition Tailbase_r3 = Tailmiddlebase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(91, 6).addBox(0.0F, 11.8079F, 14.6963F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 91).addBox(0.0F, 10.6387F, 13.0613F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 9).addBox(0.0F, 9.5447F, 11.3604F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 91).addBox(0.0F, 8.3755F, 9.7255F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 89).addBox(0.0F, 6.2815F, 8.0246F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 89).addBox(0.0F, 5.2626F, 6.2577F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9826F, -8.2103F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailmiddlebase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(90, 18).addBox(0.0F, -0.9F, 18.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 15).addBox(0.0F, -0.9F, 16.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 3).addBox(0.0F, -1.0F, 14.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 0).addBox(0.0F, -1.1F, 12.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 52).addBox(0.0F, -1.2F, 10.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 49).addBox(0.0F, -1.3F, 8.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5015F, -8.6753F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(88, 76).mirror().addBox(-0.8F, 0.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 89).mirror().addBox(-0.9F, 0.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 88).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 76).addBox(-0.2F, 0.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 89).addBox(-0.1F, 0.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 88).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 0.0247F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.49F, -0.6985F, 11.9247F, 0.191F, 0.3432F, 0.065F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(27, 39).addBox(-0.01F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0895F, -0.0261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.5766F, 5.8759F, 0.0174F, 0.3926F, 0.0067F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, -0.4F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0056F, 0.1941F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.097F, 6.5757F, -0.2572F, -0.296F, 0.0766F));

		PartDefinition Tailend_r2 = Tailend2.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.4F, -0.4F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0072F, 0.2941F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.8254F, 1.394F, -0.6037F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(78, 67).addBox(-0.5F, 0.0016F, -0.9506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, 1.359F, 0.6584F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(84, 40).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 3).addBox(-1.5F, -1.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.459F, -0.0416F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(71, 37).addBox(-1.3F, 0.3742F, 0.0169F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(80, 16).addBox(-0.5F, -0.0259F, 0.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, 6.2688F, 0.1608F, 0.637F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(38, 71).addBox(-0.5F, -3.0641F, -0.0755F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, 6.2688F, 0.2608F, 0.2007F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = Rightthigh.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 7.1031F, 1.6361F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(53, 75).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6F, 0.7836F, -0.2993F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(30, 80).addBox(-3.5F, -2.807F, -0.4331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 2.5472F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(5, 49).addBox(-3.5F, -0.0096F, -0.0336F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.6F, 0.6472F, -0.5117F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(37, 47).addBox(-4.8F, -11.4589F, -1.0338F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.0F, 11.5472F, 0.1883F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(59, 0).addBox(-1.0F, -0.1348F, -0.5272F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 8.7724F, -0.4035F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(78, 28).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 3.356F, -0.1071F, 0.559F, 0.0927F, 0.3822F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(48, 33).addBox(-1.5F, -0.3953F, -1.5163F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.1723F, -0.1947F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(42, 39).addBox(-1.5F, -0.5F, -1.9924F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0971F, -1.5163F, -0.258F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.8254F, 1.394F, -0.1237F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(78, 71).addBox(-0.5F, 0.0016F, -0.9506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 1.359F, 0.6584F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(30, 86).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 16).addBox(-0.5F, -1.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.459F, -0.0416F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(72, 51).addBox(-0.7F, 0.3742F, 0.0169F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(80, 19).addBox(-0.5F, -0.0259F, 0.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 6.2688F, 0.1608F, 0.637F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(72, 46).addBox(-0.5F, -3.0641F, -0.0755F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 6.2688F, 0.2608F, 0.2007F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = Leftthigh.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 7.1031F, 1.6361F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(75, 57).addBox(0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 0.7836F, -0.2993F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(35, 80).addBox(2.5F, -2.807F, -0.4331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 2.5472F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(42, 50).addBox(2.5F, -0.0096F, -0.0336F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.6F, 0.6472F, -0.5117F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 49).addBox(3.8F, -11.4589F, -1.0338F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.0F, 11.5472F, 0.1883F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(7, 59).addBox(-1.0F, -0.1348F, -0.5272F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 8.7724F, -0.4035F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(78, 32).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 3.356F, -0.1071F, 0.559F, -0.0927F, -0.3822F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(47, 50).addBox(-1.5F, -0.3953F, -1.5163F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.1723F, -0.1947F, 0.8727F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(44, 9).addBox(-1.5F, -0.5F, -1.9924F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0971F, -1.5163F, -0.6944F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 94, 94);
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