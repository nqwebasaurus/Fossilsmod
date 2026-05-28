package fossils.fossils.client.blockentity.model.attenborosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AttenborosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Tail;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart tail6;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck8;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart snout;
	private final ModelPart snout2;
	private final ModelPart forehead;
	private final ModelPart forehead2;
	private final ModelPart forehead3;
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;

	public AttenborosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Tail = this.Hips.getChild("Tail");
		this.BackFlipperR2 = this.Tail.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Tail.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.tail3 = this.Tail.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
		this.tail6 = this.tail2.getChild("tail6");
		this.Body = this.Hips.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck2 = this.Chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck8 = this.Neck6.getChild("Neck8");
		this.Neck7 = this.Neck8.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.snout = this.Head.getChild("snout");
		this.snout2 = this.snout.getChild("snout2");
		this.forehead = this.snout2.getChild("forehead");
		this.forehead2 = this.forehead.getChild("forehead2");
		this.forehead3 = this.forehead.getChild("forehead3");
		this.Jaw = this.Head.getChild("Jaw");
		this.FrontFlipperR2 = this.Chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR3 = this.Chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -35.871F, 10.2507F, -0.2747F, -0.3082F, -0.6546F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 83).addBox(0.0F, -2.9878F, 0.0712F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9936F, 4.7132F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 113).addBox(0.0F, -2.9143F, -0.2076F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.62F, 7.992F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(110, 45).mirror().addBox(-6.6842F, -3.3034F, -0.6037F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0367F, 5.4808F, -0.0527F, 0.074F, -1.1517F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(126, 10).mirror().addBox(-3.021F, 0.0126F, -0.5315F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0367F, 5.4808F, 0.0187F, 0.064F, -0.2774F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 132).mirror().addBox(-1.0109F, 0.1454F, -0.5222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0367F, 5.4808F, 0.0263F, 0.052F, -0.1469F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(121, 12).mirror().addBox(-4.8423F, -1.0187F, -0.6037F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0367F, 5.4808F, -0.0085F, 0.0904F, -0.6265F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 121).mirror().addBox(-5.726F, -3.3943F, -0.6005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.6367F, 8.4808F, -0.1292F, 0.0414F, -1.0808F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 121).mirror().addBox(-4.924F, -1.0766F, -0.6005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.6367F, 8.4808F, -0.0914F, 0.1004F, -0.5591F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 110).mirror().addBox(-1.1098F, 0.1317F, -0.516F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.6367F, 8.4808F, -0.0424F, 0.099F, -0.0767F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(121, 84).mirror().addBox(-3.1173F, -0.0139F, -0.5262F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.6367F, 8.4808F, -0.0556F, 0.1017F, -0.2083F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(126, 18).mirror().addBox(-1.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 11.2808F, 0.1807F, 0.1036F, -0.1559F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(125, 35).mirror().addBox(-3.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 11.2808F, 0.1655F, 0.1352F, -0.2839F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 125).mirror().addBox(-4.1598F, -2.12F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 11.2808F, 0.0111F, 0.232F, -1.0593F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 125).addBox(2.1598F, -2.12F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 11.2808F, 0.0111F, -0.232F, 1.0593F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(125, 35).addBox(1.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 11.2808F, 0.1655F, -0.1352F, 0.2839F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(126, 18).addBox(0.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 11.2808F, 0.1807F, -0.1036F, 0.1559F));

		PartDefinition cube_r17 = Hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(121, 84).addBox(1.1173F, -0.0139F, -0.5262F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.6367F, 8.4808F, -0.0556F, -0.1017F, 0.2083F));

		PartDefinition cube_r18 = Hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(60, 110).addBox(0.1098F, 0.1317F, -0.516F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.6367F, 8.4808F, -0.0424F, -0.099F, 0.0767F));

		PartDefinition cube_r19 = Hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(50, 121).addBox(2.924F, -1.0766F, -0.6005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.6367F, 8.4808F, -0.0914F, -0.1004F, 0.5591F));

		PartDefinition cube_r20 = Hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(29, 121).addBox(3.726F, -3.3943F, -0.6005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.6367F, 8.4808F, -0.1292F, -0.0414F, 1.0808F));

		PartDefinition cube_r21 = Hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(121, 12).addBox(2.8423F, -1.0187F, -0.6037F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0367F, 5.4808F, -0.0085F, -0.0904F, 0.6265F));

		PartDefinition cube_r22 = Hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(21, 132).addBox(0.0109F, 0.1454F, -0.5222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0367F, 5.4808F, 0.0263F, -0.052F, 0.1469F));

		PartDefinition cube_r23 = Hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(126, 10).addBox(1.021F, 0.0126F, -0.5315F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0367F, 5.4808F, 0.0187F, -0.064F, 0.2774F));

		PartDefinition cube_r24 = Hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(110, 45).addBox(3.6842F, -3.3034F, -0.6037F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0367F, 5.4808F, -0.0527F, -0.074F, 1.1517F));

		PartDefinition cube_r25 = Hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(76, 0).addBox(-1.5F, -1.2022F, -0.1149F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(49, 0).addBox(-1.0F, -0.7143F, 0.1281F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7027F, 10.429F, -0.2376F, -0.1273F, 0.0307F));

		PartDefinition cube_r26 = Tail.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(118, 74).addBox(0.0F, -3.6623F, 8.8445F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(118, 68).addBox(0.0F, -3.6623F, 5.8445F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(67, 118).addBox(0.0F, -3.2623F, 2.8445F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(113, 64).addBox(0.0F, -2.7623F, -0.1555F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.507F, 0.1655F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Tail.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(64, 94).addBox(-2.0F, 2.9432F, 15.6272F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(56, 105).mirror().addBox(-2.0F, 2.9432F, 17.6272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(56, 105).addBox(1.0F, 2.9432F, 17.6272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 10.0947F, -17.4239F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Tail.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(128, 12).mirror().addBox(-2.5788F, 4.5339F, 16.8706F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.9167F, -13.7485F, 0.4391F, 0.1663F, -0.3876F));

		PartDefinition cube_r29 = Tail.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(121, 119).mirror().addBox(-5.3052F, 4.1492F, 16.8437F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.9167F, -13.7485F, 0.416F, 0.2288F, -0.5049F));

		PartDefinition cube_r30 = Tail.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(128, 84).mirror().addBox(-8.0228F, -0.9625F, 16.6946F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.9167F, -13.7485F, 0.1282F, 0.4716F, -1.2852F));

		PartDefinition cube_r31 = Tail.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(131, 0).mirror().addBox(-1.7399F, 3.5889F, 17.1429F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9167F, -10.6485F, 0.3738F, 0.1396F, -0.5023F));

		PartDefinition cube_r32 = Tail.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(121, 121).mirror().addBox(-4.3529F, 3.3213F, 17.1242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9167F, -10.6485F, 0.3537F, 0.1947F, -0.6227F));

		PartDefinition cube_r33 = Tail.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(131, 2).mirror().addBox(-1.4737F, 4.8005F, 20.1911F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.3167F, -10.9485F, 0.3738F, 0.1396F, -0.6593F));

		PartDefinition cube_r34 = Tail.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(97, 20).mirror().addBox(-8.8532F, 12.6608F, 6.2375F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1638F, 9.6568F, -13.059F, 1.2733F, 0.422F, 0.3198F));

		PartDefinition cube_r35 = Tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(108, 41).mirror().addBox(1.9066F, 4.1745F, 19.2814F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 12.5236F, -13.4854F, 0.4899F, -0.1932F, -0.102F));

		PartDefinition cube_r36 = Tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(49, 90).mirror().addBox(2.8581F, 4.1745F, 16.3897F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 12.5236F, -13.4854F, 0.5179F, -0.3691F, -0.2028F));

		PartDefinition cube_r37 = Tail.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(45, 101).mirror().addBox(-4.1807F, 3.5402F, 16.3315F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8F, 9.0862F, -15.633F, 0.2229F, 0.2044F, 0.046F));

		PartDefinition cube_r38 = Tail.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(41, 33).mirror().addBox(-11.3628F, 4.3432F, 15.9095F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 9.2473F, -20.0701F, 0.2449F, 0.4677F, 0.1122F));

		PartDefinition cube_r39 = Tail.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(41, 33).addBox(5.3628F, 4.3432F, 15.9095F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9F, 9.2473F, -20.0701F, 0.2449F, -0.4677F, -0.1122F));

		PartDefinition cube_r40 = Tail.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(45, 101).addBox(2.1807F, 3.5402F, 16.3315F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 9.0862F, -15.633F, 0.2229F, -0.2044F, -0.046F));

		PartDefinition cube_r41 = Tail.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(49, 90).addBox(-5.8581F, 4.1745F, 16.3897F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 12.5236F, -13.4854F, 0.5179F, 0.3691F, 0.2028F));

		PartDefinition cube_r42 = Tail.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(49, 94).addBox(-1.6F, 4.1745F, 16.6683F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 12.5236F, -13.4854F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(108, 41).addBox(-3.9066F, 4.1745F, 19.2814F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 12.5236F, -13.4854F, 0.4899F, 0.1932F, 0.102F));

		PartDefinition cube_r44 = Tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(97, 20).addBox(7.8532F, 12.6608F, 6.2375F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.1638F, 9.6568F, -13.059F, 1.2733F, -0.422F, -0.3198F));

		PartDefinition cube_r45 = Tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(131, 2).addBox(0.4737F, 4.8005F, 20.1911F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 4.3167F, -10.9485F, 0.3738F, -0.1396F, 0.6593F));

		PartDefinition cube_r46 = Tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(121, 121).addBox(2.3529F, 3.3213F, 17.1242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9167F, -10.6485F, 0.3537F, -0.1947F, 0.6227F));

		PartDefinition cube_r47 = Tail.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(131, 0).addBox(0.7399F, 3.5889F, 17.1429F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9167F, -10.6485F, 0.3738F, -0.1396F, 0.5023F));

		PartDefinition cube_r48 = Tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(128, 84).addBox(7.0228F, -0.9625F, 16.6946F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 3.9167F, -13.7485F, 0.1282F, -0.4716F, 1.2852F));

		PartDefinition cube_r49 = Tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(121, 119).addBox(3.3052F, 4.1492F, 16.8437F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 3.9167F, -13.7485F, 0.416F, -0.2288F, 0.5049F));

		PartDefinition cube_r50 = Tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(128, 12).addBox(1.5788F, 4.5339F, 16.8706F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 3.9167F, -13.7485F, 0.4391F, -0.1663F, 0.3876F));

		PartDefinition BackFlipperR2 = Tail.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create().texOffs(101, 12).addBox(-0.4971F, -0.4811F, -0.7574F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.9F, 8.5106F, 3.4723F, 0.4233F, -0.3897F, 0.7006F));

		PartDefinition cube_r51 = BackFlipperR2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(108, 28).addBox(8.9061F, 0.9166F, 15.5997F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(23, 82).addBox(9.3061F, 0.9166F, 14.5997F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4487F, -1.3977F, -17.2708F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r52 = BackFlipperR2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(93, 41).addBox(-0.8066F, 0.9166F, -1.4754F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6513F, -1.3977F, 0.9292F, 0.0F, -0.5585F, 0.0F));

		PartDefinition cube_r53 = BackFlipperR2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(96, 80).addBox(-0.3125F, 0.9166F, -0.06F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2487F, -1.3977F, -0.2708F, 0.0F, -0.192F, 0.0F));

		PartDefinition cube_r54 = BackFlipperR2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(101, 15).addBox(-1.3485F, 0.9166F, -0.7866F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(3.7514F, -1.3977F, -0.3708F, 0.0F, 0.4014F, 0.0F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create().texOffs(35, 129).addBox(-0.225F, -0.5307F, -0.1474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 60).addBox(-0.225F, -0.5307F, 1.4526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7288F, 0.0209F, 1.8225F, 0.0F, -0.3403F, 0.0F));

		PartDefinition cube_r55 = BackFlipperMiddleR2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(34, 113).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -0.0307F, -1.1474F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r56 = BackFlipperMiddleR2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(64, 33).addBox(-0.8642F, 1.4166F, 0.5532F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5397F, -1.4473F, -3.7616F, 0.0F, 0.096F, 0.0F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(12.2241F, -0.0158F, -1.8824F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r57 = BackFlipperEndR2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(41, 26).addBox(11.9583F, 1.4315F, -1.0613F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5369F, -1.4464F, 0.8928F, 0.0F, 0.096F, 0.0F));

		PartDefinition BackFlipperR3 = Tail.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create().texOffs(13, 101).addBox(-4.5029F, -0.4811F, -0.7574F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-5.9F, 8.5106F, 3.4723F, 0.4737F, 0.5865F, -0.5937F));

		PartDefinition cube_r58 = BackFlipperR3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(83, 109).addBox(-10.9061F, 0.9166F, 15.5997F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(42, 82).addBox(-12.3061F, 0.9166F, 14.5997F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4487F, -1.3977F, -17.2708F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r59 = BackFlipperR3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(79, 94).addBox(-3.1934F, 0.9166F, -1.4754F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6513F, -1.3977F, 0.9292F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r60 = BackFlipperR3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(94, 98).addBox(-3.6875F, 0.9166F, -0.06F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2487F, -1.3977F, -0.2708F, 0.0F, 0.192F, 0.0F));

		PartDefinition cube_r61 = BackFlipperR3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(95, 102).addBox(-0.6515F, 0.9166F, -0.7866F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-3.7514F, -1.3977F, -0.3708F, 0.0F, -0.4014F, 0.0F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create().texOffs(130, 68).addBox(-0.775F, -0.5307F, -0.1474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 64).addBox(-0.775F, -0.5307F, 1.4526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.7288F, 0.0209F, 1.8225F, -0.1205F, 0.3191F, -0.3685F));

		PartDefinition cube_r62 = BackFlipperMiddleR3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(117, 89).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -0.0307F, -1.1474F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r63 = BackFlipperMiddleR3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(64, 41).addBox(-6.1358F, 1.4166F, 0.5532F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5397F, -1.4473F, -3.7616F, 0.0F, -0.096F, 0.0F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.2241F, -0.0158F, -1.8824F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r64 = BackFlipperEndR3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 56).addBox(-21.9583F, 1.4315F, -1.0613F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.5369F, -1.4464F, 0.8928F, 0.0F, -0.096F, 0.0F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(64, 62).addBox(-0.5F, -0.3113F, 0.8274F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.44F, 10.2261F, 0.0179F, -0.2181F, -0.0039F));

		PartDefinition cube_r65 = tail3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(113, 120).addBox(0.0F, -1.7548F, -0.6097F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2007F, 10.49F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(50, 111).addBox(0.0F, -2.615F, 5.9948F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 112).addBox(0.0F, -2.715F, 2.9948F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(79, 113).addBox(0.0F, -2.515F, -0.0052F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2963F, 1.8326F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(49, 129).addBox(0.0F, 2.0784F, 25.9013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 129).addBox(0.0F, 1.8784F, 23.9013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 71).addBox(0.0F, 1.5784F, 21.9013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 128).addBox(0.0F, 1.2784F, 19.9013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 130).addBox(0.0F, 0.4784F, 17.9013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9382F, -16.5186F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(77, 75).addBox(-0.5F, -0.5259F, -0.135F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2135F, 10.8853F, 0.1409F, -0.2179F, -0.0116F));

		PartDefinition cube_r68 = tail4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(53, 106).addBox(0.0F, 3.2142F, 28.9134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 18).addBox(0.0F, 3.0142F, 26.9134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 33).addBox(0.0F, 1.9142F, 24.9134F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 126).addBox(0.0F, 1.7142F, 22.9134F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.124F, -22.4624F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r69 = tail4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(89, 113).addBox(-0.5F, -0.7583F, 0.0798F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5492F, 6.8078F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(92, 109).addBox(-0.5F, -0.9035F, 0.0892F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6442F, 4.8001F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(131, 14).addBox(-0.5F, -1.2473F, 0.0743F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5395F, 2.8028F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(36, 121).addBox(-0.5F, -1.591F, 0.0594F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4349F, 0.8056F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(61, 85).addBox(-0.5F, -0.6094F, -0.0604F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(115, 70).addBox(0.0F, -1.5098F, 0.9605F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 132).addBox(0.0F, -1.3098F, 2.9605F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 132).addBox(0.0F, -1.2098F, 4.9605F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0517F, 7.8498F, 0.2365F, -0.3054F, -0.0055F));

		PartDefinition cube_r73 = tail5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(131, 26).addBox(0.0F, 3.5188F, 30.9392F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 132).addBox(0.0F, 5.0188F, 34.9392F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 22).addBox(0.0F, 3.8188F, 32.9392F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0723F, -30.3122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(78, 85).addBox(-0.5F, -0.6094F, -0.0604F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(35, 132).addBox(0.0F, -1.0109F, 1.9814F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0175F, 6.9181F, 0.0951F, -0.218F, 0.0077F));

		PartDefinition cube_r74 = tail2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(132, 48).addBox(0.0F, -0.3282F, -1.0518F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5821F, 7.0227F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(6, 133).addBox(0.0F, 5.3101F, 38.8876F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 133).addBox(0.0F, 5.2101F, 36.8876F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0898F, -37.2303F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(132, 45).addBox(0.0F, -0.3817F, -0.8536F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6281F, 4.8141F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(132, 34).addBox(0.0F, -0.5629F, -1.0528F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6467F, 1.0081F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail6 = tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(66, 49).addBox(-0.5F, -0.6094F, -0.0604F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0222F, 7.0007F, 0.1745F, -0.3491F, 0.0F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 10.0366F, -18.8036F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8212F, 3.6925F, 0.0714F, 0.2177F, 0.0097F));

		PartDefinition cube_r78 = Body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 26).addBox(-5.0F, -2.0172F, -9.9992F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.0538F, -18.8043F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 13).addBox(-7.0F, -2.0413F, -0.0117F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.0779F, -8.7919F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(50, 115).addBox(0.0F, -2.3951F, -7.0566F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(116, 119).addBox(0.0F, -3.0951F, -4.1566F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 119).addBox(0.0F, -3.5951F, -1.1566F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(115, 47).addBox(0.0F, -4.2951F, 1.8434F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -19.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(33, 39).addBox(-1.0F, -0.6205F, -12.9815F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -14.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r82 = Body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(101, 118).addBox(0.0F, -2.9593F, -0.2377F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9125F, -7.687F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(96, 118).addBox(0.0F, -2.8407F, -0.7735F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5671F, -1.096F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(23, 71).addBox(0.0F, -2.7191F, -1.793F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6718F, -3.0933F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r85 = Body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(115, 32).addBox(0.0F, -3.55F, -0.9F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4843F, -10.1517F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r86 = Body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(84, 113).addBox(0.0F, -3.05F, 0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2475F, -14.0782F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r87 = Body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(122, 53).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -10.0117F, 0.3607F, -0.0735F, 0.0712F));

		PartDefinition cube_r88 = Body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(120, 51).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -10.0117F, 0.3662F, -0.0184F, -0.0477F));

		PartDefinition cube_r89 = Body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(125, 80).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -10.0117F, 0.3486F, 0.1274F, -0.3656F));

		PartDefinition cube_r90 = Body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(61, 82).mirror().addBox(-10.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -10.0117F, 0.2418F, 0.2833F, -0.877F));

		PartDefinition cube_r91 = Body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(122, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -13.0117F, 0.3777F, -0.0908F, 0.0354F));

		PartDefinition cube_r92 = Body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(60, 120).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -13.0117F, 0.3851F, -0.0336F, -0.0826F));

		PartDefinition cube_r93 = Body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(57, 122).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -13.0117F, 0.3715F, 0.1189F, -0.3972F));

		PartDefinition cube_r94 = Body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(15, 99).mirror().addBox(-10.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -13.0117F, 0.2668F, 0.2868F, -0.9044F));

		PartDefinition cube_r95 = Body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(119, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -15.9117F, 0.4212F, -0.0855F, 0.0141F));

		PartDefinition cube_r96 = Body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(119, 87).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -15.9117F, 0.4275F, -0.0234F, -0.1013F));

		PartDefinition cube_r97 = Body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(72, 122).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -15.9117F, 0.4091F, 0.1416F, -0.4098F));

		PartDefinition cube_r98 = Body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(45, 99).mirror().addBox(-10.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -15.9117F, 0.2894F, 0.3248F, -0.9151F));

		PartDefinition cube_r99 = Body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(89, 122).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -19.1117F, 0.5251F, -0.0903F, -0.0301F));

		PartDefinition cube_r100 = Body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(120, 60).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -19.1117F, 0.5309F, -0.0166F, -0.1384F));

		PartDefinition cube_r101 = Body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(106, 122).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -19.1117F, 0.5071F, 0.1787F, -0.4292F));

		PartDefinition cube_r102 = Body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(89, 58).mirror().addBox(-11.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -19.1117F, 0.3612F, 0.4037F, -0.9245F));

		PartDefinition cube_r103 = Body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(125, 125).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -22.1117F, 0.5251F, -0.0903F, -0.0301F));

		PartDefinition cube_r104 = Body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(125, 82).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -22.1117F, 0.5309F, -0.0166F, -0.1384F));

		PartDefinition cube_r105 = Body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(126, 8).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -22.1117F, 0.5071F, 0.1787F, -0.4292F));

		PartDefinition cube_r106 = Body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(49, 21).mirror().addBox(-12.0942F, -4.2155F, -0.6121F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -22.1117F, 0.3612F, 0.4037F, -0.9245F));

		PartDefinition cube_r107 = Body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(122, 107).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -25.1117F, 0.5682F, -0.0829F, -0.0688F));

		PartDefinition cube_r108 = Body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(120, 62).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -25.1117F, 0.5728F, -0.0046F, -0.1738F));

		PartDefinition cube_r109 = Body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(122, 109).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -25.1117F, 0.5446F, 0.202F, -0.457F));

		PartDefinition cube_r110 = Body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(49, 23).mirror().addBox(-12.0942F, -4.2155F, -0.6121F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -25.1117F, 0.3846F, 0.4418F, -0.9498F));

		PartDefinition cube_r111 = Body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(56, 103).mirror().addBox(-9.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0155F, -6.9117F, 0.2164F, 0.2584F, -0.9362F));

		PartDefinition cube_r112 = Body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(5, 123).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0155F, -6.9117F, 0.3148F, 0.1178F, -0.4221F));

		PartDefinition cube_r113 = Body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(72, 120).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0155F, -6.9117F, 0.3313F, -0.017F, -0.0995F));

		PartDefinition cube_r114 = Body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(29, 123).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0155F, -6.9117F, 0.3261F, -0.0679F, 0.0213F));

		PartDefinition cube_r115 = Body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(108, 87).mirror().addBox(-8.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2845F, -4.2117F, 0.2164F, 0.2584F, -0.9711F));

		PartDefinition cube_r116 = Body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(50, 123).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2845F, -4.2117F, 0.3148F, 0.1178F, -0.457F));

		PartDefinition cube_r117 = Body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(89, 120).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2845F, -4.2117F, 0.3313F, -0.017F, -0.1344F));

		PartDefinition cube_r118 = Body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(123, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2845F, -4.2117F, 0.3261F, -0.0679F, -0.0136F));

		PartDefinition cube_r119 = Body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(106, 58).mirror().addBox(-7.5225F, -3.3953F, -0.6313F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -1.1117F, 0.1851F, 0.2271F, -0.9437F));

		PartDefinition cube_r120 = Body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(123, 70).mirror().addBox(-4.7482F, -1.1791F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -1.1117F, 0.2727F, 0.1055F, -0.4268F));

		PartDefinition cube_r121 = Body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(123, 72).mirror().addBox(-2.9879F, -0.1702F, -0.5608F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -1.1117F, 0.2877F, -0.0153F, -0.0988F));

		PartDefinition cube_r122 = Body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(131, 6).mirror().addBox(-1.0021F, -0.0401F, -0.5517F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -1.1117F, 0.283F, -0.0609F, 0.0241F));

		PartDefinition cube_r123 = Body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(131, 6).addBox(0.0021F, -0.0401F, -0.5517F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -1.1117F, 0.283F, 0.0609F, -0.0241F));

		PartDefinition cube_r124 = Body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(123, 72).addBox(0.9879F, -0.1702F, -0.5608F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -1.1117F, 0.2877F, 0.0153F, 0.0988F));

		PartDefinition cube_r125 = Body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(123, 70).addBox(2.7482F, -1.1791F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -1.1117F, 0.2727F, -0.1055F, 0.4268F));

		PartDefinition cube_r126 = Body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(106, 58).addBox(3.5225F, -3.3953F, -0.6313F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -1.1117F, 0.1851F, -0.2271F, 0.9437F));

		PartDefinition cube_r127 = Body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(123, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2845F, -4.2117F, 0.3261F, 0.0679F, 0.0136F));

		PartDefinition cube_r128 = Body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(89, 120).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2845F, -4.2117F, 0.3313F, 0.017F, 0.1344F));

		PartDefinition cube_r129 = Body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(50, 123).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2845F, -4.2117F, 0.3148F, -0.1178F, 0.457F));

		PartDefinition cube_r130 = Body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(108, 87).addBox(4.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2845F, -4.2117F, 0.2164F, -0.2584F, 0.9711F));

		PartDefinition cube_r131 = Body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(29, 123).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0155F, -6.9117F, 0.3261F, 0.0679F, -0.0213F));

		PartDefinition cube_r132 = Body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(72, 120).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0155F, -6.9117F, 0.3313F, 0.017F, 0.0995F));

		PartDefinition cube_r133 = Body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 123).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0155F, -6.9117F, 0.3148F, -0.1178F, 0.4221F));

		PartDefinition cube_r134 = Body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(56, 103).addBox(4.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0155F, -6.9117F, 0.2164F, -0.2584F, 0.9362F));

		PartDefinition cube_r135 = Body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(49, 23).addBox(4.0942F, -4.2155F, -0.6121F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -25.1117F, 0.3846F, -0.4418F, 0.9498F));

		PartDefinition cube_r136 = Body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(122, 109).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -25.1117F, 0.5446F, -0.202F, 0.457F));

		PartDefinition cube_r137 = Body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(120, 62).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -25.1117F, 0.5728F, 0.0046F, 0.1738F));

		PartDefinition cube_r138 = Body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(122, 107).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -25.1117F, 0.5682F, 0.0829F, 0.0688F));

		PartDefinition cube_r139 = Body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(49, 21).addBox(4.0942F, -4.2155F, -0.6121F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -22.1117F, 0.3612F, -0.4037F, 0.9245F));

		PartDefinition cube_r140 = Body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(126, 8).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -22.1117F, 0.5071F, -0.1787F, 0.4292F));

		PartDefinition cube_r141 = Body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(125, 82).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -22.1117F, 0.5309F, 0.0166F, 0.1384F));

		PartDefinition cube_r142 = Body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(125, 125).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -22.1117F, 0.5251F, 0.0903F, 0.0301F));

		PartDefinition cube_r143 = Body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(89, 58).addBox(4.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -19.1117F, 0.3612F, -0.4037F, 0.9245F));

		PartDefinition cube_r144 = Body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(106, 122).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -19.1117F, 0.5071F, -0.1787F, 0.4292F));

		PartDefinition cube_r145 = Body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(120, 60).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -19.1117F, 0.5309F, 0.0166F, 0.1384F));

		PartDefinition cube_r146 = Body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(89, 122).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -19.1117F, 0.5251F, 0.0903F, 0.0301F));

		PartDefinition cube_r147 = Body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(45, 99).addBox(4.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -15.9117F, 0.2894F, -0.3248F, 0.9151F));

		PartDefinition cube_r148 = Body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(72, 122).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -15.9117F, 0.4091F, -0.1416F, 0.4098F));

		PartDefinition cube_r149 = Body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(119, 87).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -15.9117F, 0.4275F, 0.0234F, 0.1013F));

		PartDefinition cube_r150 = Body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(119, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -15.9117F, 0.4212F, 0.0855F, -0.0141F));

		PartDefinition cube_r151 = Body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(15, 99).addBox(4.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -13.0117F, 0.2668F, -0.2868F, 0.9044F));

		PartDefinition cube_r152 = Body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(57, 122).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -13.0117F, 0.3715F, -0.1189F, 0.3972F));

		PartDefinition cube_r153 = Body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(60, 120).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -13.0117F, 0.3851F, 0.0336F, 0.0826F));

		PartDefinition cube_r154 = Body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(122, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -13.0117F, 0.3777F, 0.0908F, -0.0354F));

		PartDefinition cube_r155 = Body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(61, 82).addBox(4.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -10.0117F, 0.2418F, -0.2833F, 0.877F));

		PartDefinition cube_r156 = Body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(125, 80).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -10.0117F, 0.3486F, -0.1274F, 0.3656F));

		PartDefinition cube_r157 = Body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(120, 51).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -10.0117F, 0.3662F, 0.0184F, 0.0477F));

		PartDefinition cube_r158 = Body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(122, 53).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -10.0117F, 0.3607F, 0.0735F, -0.0712F));

		PartDefinition cube_r159 = Body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, -0.35F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -27.0F, 0.0087F, 0.0436F, -0.0015F));

		PartDefinition cube_r160 = Chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(116, 9).addBox(0.0F, -2.2783F, -1.5024F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0143F, -12.1728F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(93, 33).addBox(-0.5F, -1.1784F, -3.1094F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -10.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(79, 119).addBox(0.0F, -3.0075F, -1.0709F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2424F, -0.7409F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(104, 112).addBox(0.0F, -2.7075F, 0.0291F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0342F, -4.8326F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(115, 101).addBox(0.0F, -3.3075F, -1.0709F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -6.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(60, 99).mirror().addBox(-6.4228F, -0.5226F, 0.0051F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7856F, 10.5216F, -6.8658F, -0.1571F, 0.7618F, -0.1089F));

		PartDefinition cube_r166 = Chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(73, 99).mirror().addBox(-1.879F, -1.31F, -1.423F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0141F, 10.979F, -6.8918F, -2.4733F, 1.0501F, -2.5798F));

		PartDefinition cube_r167 = Chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(0.9022F, -1.31F, -2.2937F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0141F, 11.079F, -6.8918F, -1.0123F, 1.1026F, -0.9599F));

		PartDefinition cube_r168 = Chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(69, 103).mirror().addBox(2.9714F, -1.31F, -4.2807F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0141F, 11.079F, -6.8918F, -0.4957F, 0.6358F, -0.3107F));

		PartDefinition cube_r169 = Chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(36, 108).mirror().addBox(3.8528F, -2.2901F, -1.8501F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2142F, 11.079F, -5.3918F, -0.783F, 0.7737F, -1.3203F));

		PartDefinition cube_r170 = Chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(93, 46).mirror().addBox(-11.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -0.6117F, 0.2944F, 0.4775F, -1.0233F));

		PartDefinition cube_r171 = Chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(123, 74).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -0.6117F, 0.4897F, 0.2725F, -0.5034F));

		PartDefinition cube_r172 = Chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(120, 101).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -0.6117F, 0.5418F, 0.0781F, -0.2084F));

		PartDefinition cube_r173 = Chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(123, 76).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -0.6117F, 0.5461F, 0.0027F, -0.1013F));

		PartDefinition cube_r174 = Chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(123, 78).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8845F, -3.6117F, 0.6662F, 0.0231F, -0.1175F));

		PartDefinition cube_r175 = Chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(95, 85).mirror().addBox(-11.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8845F, -3.6117F, 0.3618F, 0.5846F, -1.0069F));

		PartDefinition cube_r176 = Chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(123, 93).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8845F, -3.6117F, 0.5982F, 0.3367F, -0.4885F));

		PartDefinition cube_r177 = Chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(120, 103).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8845F, -3.6117F, 0.6597F, 0.1107F, -0.215F));

		PartDefinition cube_r178 = Chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(123, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4845F, -6.7117F, 0.6875F, 0.1058F, -0.1645F));

		PartDefinition cube_r179 = Chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(120, 105).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4845F, -6.7117F, 0.673F, 0.1951F, -0.2613F));

		PartDefinition cube_r180 = Chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(123, 111).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4845F, -6.7117F, 0.587F, 0.4215F, -0.541F));

		PartDefinition cube_r181 = Chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(-10.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4845F, -6.7117F, 0.2978F, 0.6523F, -1.0924F));

		PartDefinition cube_r182 = Chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(123, 113).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7845F, -9.7117F, 0.7539F, 0.1287F, -0.3312F));

		PartDefinition cube_r183 = Chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(106, 120).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7845F, -9.7117F, 0.7379F, 0.2241F, -0.4223F));

		PartDefinition cube_r184 = Chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(123, 115).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7845F, -9.7117F, 0.646F, 0.4666F, -0.6902F));

		PartDefinition cube_r185 = Chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(112, 85).mirror().addBox(-7.0942F, -4.2155F, -0.6121F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7845F, -9.7117F, 0.3255F, 0.7187F, -1.2493F));

		PartDefinition cube_r186 = Chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(123, 117).mirror().addBox(-3.0936F, 0.1792F, -0.6439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0845F, -12.7117F, 0.8036F, 0.2523F, -0.4068F));

		PartDefinition cube_r187 = Chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(131, 37).mirror().addBox(-1.0622F, 0.3202F, -0.6341F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0845F, -12.7117F, 0.8207F, 0.1512F, -0.3219F));

		PartDefinition cube_r188 = Chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(121, 123).mirror().addBox(-4.9647F, -0.8864F, -0.7185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0845F, -12.7117F, 0.7077F, 0.5103F, -0.6612F));

		PartDefinition cube_r189 = Chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(124, 0).mirror().addBox(-5.8564F, -3.25F, -0.7185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0845F, -12.7117F, 0.3567F, 0.7847F, -1.228F));

		PartDefinition cube_r190 = Chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(124, 0).addBox(3.8564F, -3.25F, -0.7185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0845F, -12.7117F, 0.3567F, -0.7847F, 1.228F));

		PartDefinition cube_r191 = Chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(121, 123).addBox(2.9647F, -0.8864F, -0.7185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0845F, -12.7117F, 0.7077F, -0.5103F, 0.6612F));

		PartDefinition cube_r192 = Chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(131, 37).addBox(0.0622F, 0.3202F, -0.6341F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0845F, -12.7117F, 0.8207F, -0.1512F, 0.3219F));

		PartDefinition cube_r193 = Chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(123, 117).addBox(1.0936F, 0.1792F, -0.6439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0845F, -12.7117F, 0.8036F, -0.2523F, 0.4068F));

		PartDefinition cube_r194 = Chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(112, 85).addBox(4.0942F, -4.2155F, -0.6121F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7845F, -9.7117F, 0.3255F, -0.7187F, 1.2493F));

		PartDefinition cube_r195 = Chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(123, 115).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7845F, -9.7117F, 0.646F, -0.4666F, 0.6902F));

		PartDefinition cube_r196 = Chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(106, 120).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7845F, -9.7117F, 0.7379F, -0.2241F, 0.4223F));

		PartDefinition cube_r197 = Chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(123, 113).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7845F, -9.7117F, 0.7539F, -0.1287F, 0.3312F));

		PartDefinition cube_r198 = Chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(101, 10).addBox(4.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4845F, -6.7117F, 0.2978F, -0.6523F, 1.0924F));

		PartDefinition cube_r199 = Chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(123, 111).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4845F, -6.7117F, 0.587F, -0.4215F, 0.541F));

		PartDefinition cube_r200 = Chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(120, 105).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4845F, -6.7117F, 0.673F, -0.1951F, 0.2613F));

		PartDefinition cube_r201 = Chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(123, 95).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4845F, -6.7117F, 0.6875F, -0.1058F, 0.1645F));

		PartDefinition cube_r202 = Chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(120, 103).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8845F, -3.6117F, 0.6597F, -0.1107F, 0.215F));

		PartDefinition cube_r203 = Chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(123, 93).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8845F, -3.6117F, 0.5982F, -0.3367F, 0.4885F));

		PartDefinition cube_r204 = Chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(95, 85).addBox(4.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8845F, -3.6117F, 0.3618F, -0.5846F, 1.0069F));

		PartDefinition cube_r205 = Chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(123, 78).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8845F, -3.6117F, 0.6662F, -0.0231F, 0.1175F));

		PartDefinition cube_r206 = Chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(123, 76).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -0.6117F, 0.5461F, -0.0027F, 0.1013F));

		PartDefinition cube_r207 = Chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(120, 101).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -0.6117F, 0.5418F, -0.0781F, 0.2084F));

		PartDefinition cube_r208 = Chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(123, 74).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -0.6117F, 0.4897F, -0.2725F, 0.5034F));

		PartDefinition cube_r209 = Chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(93, 46).addBox(4.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -0.6117F, 0.2944F, -0.4775F, 1.0233F));

		PartDefinition cube_r210 = Chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(55, 115).addBox(0.0F, -2.7589F, -0.0861F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -10.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r211 = Chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(36, 108).addBox(-5.8528F, -2.2901F, -1.8501F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2142F, 11.079F, -5.3918F, -0.783F, -0.7737F, 1.3203F));

		PartDefinition cube_r212 = Chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(69, 103).addBox(-5.9714F, -1.31F, -4.2807F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0141F, 11.079F, -6.8918F, -0.4957F, -0.6358F, 0.3107F));

		PartDefinition cube_r213 = Chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 100).addBox(-4.9022F, -1.31F, -2.2937F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0141F, 11.079F, -6.8918F, -1.0123F, -1.1026F, 0.9599F));

		PartDefinition cube_r214 = Chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(87, 70).addBox(-5.5141F, -1.31F, -5.2127F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5141F, 11.079F, -6.8918F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r215 = Chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(95, 4).addBox(-3.5141F, -1.0939F, -4.1474F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5141F, 11.079F, -6.8918F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r216 = Chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(73, 99).addBox(-2.121F, -1.31F, -1.423F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0141F, 10.979F, -6.8918F, -2.4733F, -1.0501F, 2.5798F));

		PartDefinition cube_r217 = Chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(54, 75).addBox(-4.2856F, -0.5226F, -0.1133F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2856F, 10.5216F, -6.8658F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r218 = Chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(60, 99).addBox(2.4228F, -0.5226F, 0.0051F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7856F, 10.5216F, -6.8658F, -0.1571F, -0.7618F, 0.1089F));

		PartDefinition cube_r219 = Chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(31, 70).addBox(-1.0F, -0.3F, -2.9F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -13.5F, -0.0074F, -0.0541F, 0.003F));

		PartDefinition cube_r220 = Neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(68, 21).addBox(-1.0005F, -2.2498F, -1.0085F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r221 = Neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(91, 131).addBox(-1.0005F, -1.8998F, -0.0084F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1047F, -4.9982F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r222 = Neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(131, 39).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2845F, -2.1117F, 0.5166F, 0.5463F, -0.4173F));

		PartDefinition cube_r223 = Neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(113, 107).mirror().addBox(-3.9678F, -0.1151F, -0.4256F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2845F, -2.1117F, 0.4433F, 0.6148F, -0.5508F));

		PartDefinition cube_r224 = Neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(113, 109).mirror().addBox(-3.9679F, -0.1151F, -0.4256F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3845F, -4.6117F, 0.3966F, 0.6738F, -0.5789F));

		PartDefinition cube_r225 = Neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(131, 41).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3845F, -4.6117F, 0.4821F, 0.6098F, -0.4362F));

		PartDefinition cube_r226 = Neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(131, 41).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3845F, -4.6117F, 0.4821F, -0.6098F, 0.4362F));

		PartDefinition cube_r227 = Neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(113, 109).addBox(0.9678F, -0.1151F, -0.4256F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3845F, -4.6117F, 0.3966F, -0.6738F, 0.5789F));

		PartDefinition cube_r228 = Neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(113, 107).addBox(0.9678F, -0.1151F, -0.4256F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2845F, -2.1117F, 0.4433F, -0.6148F, 0.5508F));

		PartDefinition cube_r229 = Neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(131, 39).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2845F, -2.1117F, 0.5166F, -0.5463F, 0.4173F));

		PartDefinition cube_r230 = Neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 92).addBox(-1.5F, -0.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1105F, -5.9049F, 0.1671F, -0.0637F, 0.1103F));

		PartDefinition cube_r231 = Neck3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(13, 132).addBox(-1.0005F, -2.0F, -1.0032F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -0.1F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r232 = Neck3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(10, 132).addBox(-1.0005F, -2.1F, -1.0032F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.1F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r233 = Neck3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(111, 131).addBox(-1.0005F, -2.1F, -1.0032F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r234 = Neck3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(94, 131).addBox(-1.0005F, -1.1999F, -1.005F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6376F, -6.0393F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r235 = Neck3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(124, 2).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0345F, -2.7117F, 0.328F, 0.3526F, -0.6431F));

		PartDefinition cube_r236 = Neck3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(124, 4).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2345F, -0.7117F, 0.3398F, 0.435F, -0.6122F));

		PartDefinition cube_r237 = Neck3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(124, 6).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1655F, -4.7117F, 0.319F, 0.2698F, -0.6723F));

		PartDefinition cube_r238 = Neck3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(124, 20).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1655F, -6.7117F, 0.319F, 0.2698F, -0.6723F));

		PartDefinition cube_r239 = Neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(124, 22).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2655F, -8.7117F, 0.3231F, 0.3112F, -0.6579F));

		PartDefinition cube_r240 = Neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(124, 22).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2655F, -8.7117F, 0.3231F, -0.3112F, 0.6579F));

		PartDefinition cube_r241 = Neck3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(124, 20).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1655F, -6.7117F, 0.319F, -0.2698F, 0.6723F));

		PartDefinition cube_r242 = Neck3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(124, 6).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1655F, -4.7117F, 0.319F, -0.2698F, 0.6723F));

		PartDefinition cube_r243 = Neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(124, 4).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2345F, -0.7117F, 0.3398F, -0.435F, 0.6122F));

		PartDefinition cube_r244 = Neck3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(124, 2).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0345F, -2.7117F, 0.328F, -0.3526F, 0.6431F));

		PartDefinition cube_r245 = Neck3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(132, 59).addBox(-1.0005F, -1.0749F, -0.805F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.791F, -8.234F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r246 = Neck3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, -0.9F, -6.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.55F, -10.0F, 0.0528F, -0.1742F, -0.0168F));

		PartDefinition cube_r247 = Neck4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(74, 132).addBox(-1.0F, -1.8F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 132).addBox(-1.0F, -1.6F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 132).addBox(-1.0F, -1.6F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 132).addBox(-1.0F, -1.4F, -7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Neck4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(124, 27).mirror().addBox(-1.9358F, -0.0587F, -0.357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2043F, -0.8159F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r249 = Neck4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(124, 29).mirror().addBox(-1.9532F, -0.0086F, -0.4178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0299F, -2.8083F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r250 = Neck4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(124, 37).mirror().addBox(-1.8657F, 0.0366F, -0.3839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1444F, -4.8007F, 0.328F, 0.3526F, -0.6431F));

		PartDefinition cube_r251 = Neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(124, 39).mirror().addBox(-1.5202F, -0.1557F, -0.6814F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0759F, -6.3124F, 0.3231F, 0.3112F, -0.6579F));

		PartDefinition cube_r252 = Neck4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(124, 39).addBox(-0.4798F, -0.1557F, -0.6814F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0759F, -6.3124F, 0.3231F, -0.3112F, 0.6579F));

		PartDefinition cube_r253 = Neck4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(124, 37).addBox(-0.1343F, 0.0366F, -0.3839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1444F, -4.8007F, 0.328F, -0.3526F, 0.6431F));

		PartDefinition cube_r254 = Neck4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(124, 29).addBox(-0.0468F, -0.0086F, -0.4178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0299F, -2.8083F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition cube_r255 = Neck4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(124, 27).addBox(-0.0642F, -0.0587F, -0.357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2043F, -0.8159F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition cube_r256 = Neck4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(87, 61).addBox(-1.5F, -0.9F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5971F, -7.2045F, -0.1111F, -0.1252F, 0.0613F));

		PartDefinition cube_r257 = Neck5.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(132, 80).addBox(-1.0F, -2.0F, -1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(80, 132).addBox(-1.0F, -1.9F, -3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 0.8F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r258 = Neck5.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(77, 132).addBox(-1.0F, -1.0F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -0.4954F, -5.6233F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r259 = Neck5.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(124, 41).mirror().addBox(-1.5186F, -0.3328F, -0.3529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.496F, -1.4058F, 0.347F, 0.4761F, -0.5958F));

		PartDefinition cube_r260 = Neck5.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(124, 43).mirror().addBox(-1.7052F, -0.2551F, -0.1432F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4157F, -3.7044F, 0.347F, 0.4761F, -0.5958F));

		PartDefinition cube_r261 = Neck5.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(57, 124).mirror().addBox(-1.6905F, -0.2752F, -0.1333F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3459F, -5.7032F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r262 = Neck5.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(57, 124).addBox(-0.3095F, -0.2752F, -0.1333F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3459F, -5.7032F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition cube_r263 = Neck5.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(124, 43).addBox(-0.2948F, -0.2551F, -0.1432F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4157F, -3.7044F, 0.347F, -0.4761F, 0.5958F));

		PartDefinition cube_r264 = Neck5.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(124, 41).addBox(-0.4814F, -0.3328F, -0.3529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.496F, -1.4058F, 0.347F, -0.4761F, 0.5958F));

		PartDefinition cube_r265 = Neck5.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(89, 49).addBox(-1.5F, -1.0F, -6.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 0.7F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.7F, -6.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(83, 132).addBox(0.0F, -1.525F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 132).addBox(0.0F, -1.5F, -2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 132).addBox(0.0F, -1.5F, -4.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 101).addBox(0.0F, -1.4F, -6.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -7.0F, -0.1643F, -0.0717F, 0.1038F));

		PartDefinition cube_r266 = Neck6.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(124, 57).mirror().addBox(-1.1005F, -0.5403F, -0.8236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4004F, 0.2812F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r267 = Neck6.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(64, 124).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0912F, -2.4391F, 0.3398F, 0.435F, -0.6122F));

		PartDefinition cube_r268 = Neck6.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(71, 124).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0864F, -4.4416F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r269 = Neck6.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(89, 124).mirror().addBox(-1.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0816F, -6.4441F, 0.3221F, 0.429F, -0.7133F));

		PartDefinition cube_r270 = Neck6.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(89, 124).addBox(-0.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0816F, -6.4441F, 0.3221F, -0.429F, 0.7133F));

		PartDefinition cube_r271 = Neck6.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(71, 124).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0864F, -4.4416F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition cube_r272 = Neck6.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(64, 124).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0912F, -2.4391F, 0.3398F, -0.435F, 0.6122F));

		PartDefinition cube_r273 = Neck6.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(124, 57).addBox(-0.8995F, -0.5403F, -0.8236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4004F, 0.2812F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition Neck8 = Neck6.addOrReplaceChild("Neck8", CubeListBuilder.create().texOffs(82, 10).addBox(-0.5F, -0.7F, -7.8F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(114, 132).addBox(0.0F, -1.4F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 132).addBox(0.0F, -1.4F, -3.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 132).addBox(0.0F, -1.5F, -5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 133).addBox(0.0F, -1.4F, -7.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.003F, -6.9963F, -0.115F, -0.1148F, 0.1289F));

		PartDefinition cube_r274 = Neck8.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(101, 124).mirror().addBox(-1.1005F, -0.5403F, -0.8236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4004F, -0.7188F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r275 = Neck8.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(108, 124).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0912F, -3.4391F, 0.3398F, 0.435F, -0.6122F));

		PartDefinition cube_r276 = Neck8.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0864F, -5.4416F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r277 = Neck8.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(7, 125).mirror().addBox(-1.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0816F, -7.4441F, 0.3221F, 0.429F, -0.7133F));

		PartDefinition cube_r278 = Neck8.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(7, 125).addBox(-0.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0816F, -7.4441F, 0.3221F, -0.429F, 0.7133F));

		PartDefinition cube_r279 = Neck8.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 125).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0864F, -5.4416F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition cube_r280 = Neck8.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(108, 124).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0912F, -3.4391F, 0.3398F, -0.435F, 0.6122F));

		PartDefinition cube_r281 = Neck8.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(101, 124).addBox(-0.8995F, -0.5403F, -0.8236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4004F, -0.7188F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition Neck7 = Neck8.addOrReplaceChild("Neck7", CubeListBuilder.create().texOffs(74, 21).addBox(-0.5F, -0.5F, -10.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(104, 132).addBox(0.0F, -1.2F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 104).addBox(0.0F, -1.2F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 132).addBox(0.0F, -1.1F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2328F, -7.7095F, 0.1617F, -0.2367F, 0.1794F));

		PartDefinition cube_r282 = Neck7.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(131, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, 0.0231F, -1.6431F, 0.3231F, 0.3112F, -0.6579F));

		PartDefinition cube_r283 = Neck7.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(131, 57).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, 0.0406F, -3.6431F, 0.319F, 0.2698F, -0.6723F));

		PartDefinition cube_r284 = Neck7.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(131, 86).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, 0.058F, -5.643F, 0.328F, 0.3526F, -0.6431F));

		PartDefinition cube_r285 = Neck7.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(16, 132).mirror().addBox(-0.7F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, 0.0755F, -7.6429F, 0.319F, 0.2698F, -0.6723F));

		PartDefinition cube_r286 = Neck7.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(16, 132).addBox(-0.3F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, 0.0755F, -7.6429F, 0.319F, -0.2698F, 0.6723F));

		PartDefinition cube_r287 = Neck7.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(131, 86).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, 0.058F, -5.643F, 0.328F, -0.3526F, 0.6431F));

		PartDefinition cube_r288 = Neck7.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(131, 57).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, 0.0406F, -3.6431F, 0.319F, -0.2698F, 0.6723F));

		PartDefinition cube_r289 = Neck7.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(131, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, 0.0231F, -1.6431F, 0.3231F, -0.3112F, 0.6579F));

		PartDefinition cube_r290 = Neck7.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(126, 14).addBox(0.0F, -0.2F, -1.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -7.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0564F, -10.0991F, -0.088F, -0.1304F, 0.0115F));

		PartDefinition cube_r291 = Head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(95, 87).addBox(-1.0F, -1.0989F, -3.7796F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.233F))
				.texOffs(34, 90).addBox(-0.5F, -1.0989F, -8.7796F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(-0.5F, 2.151F, -6.4552F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r292 = Head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(17, 90).addBox(-0.5F, 0.0411F, -3.8485F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.5673F, -3.0979F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r293 = Head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(86, 102).addBox(-0.5F, -1.35F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5F, -0.4228F, -1.7948F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r294 = Head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(127, 48).addBox(-1.0F, 0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(127, 45).addBox(-1.0F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.4553F, -14.5967F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r295 = Head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(44, 127).addBox(-1.0F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 1.2214F, -13.8317F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r296 = Head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(54, 70).addBox(-1.0F, -1.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.7456F, -10.905F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r297 = Head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(97, 27).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5323F, -7.4683F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r298 = Head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(26, 101).addBox(-1.0F, -0.6F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 0).addBox(-0.5F, -0.6F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5955F, -4.9952F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r299 = Head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(86, 99).addBox(-1.0F, -0.4596F, -0.9575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1492F, -3.5382F, 0.2705F, 0.0005F, 0.0013F));

		PartDefinition cube_r300 = Head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(127, 104).addBox(-0.5F, -0.4401F, -1.0265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4141F, -2.5284F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r301 = Head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 127).addBox(0.0F, -0.8925F, -1.1001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -1.3792F, -1.529F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r302 = Head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(130, 71).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.9755F, -1.636F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r303 = Head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(101, 126).addBox(-0.5F, -0.025F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.9755F, -1.636F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r304 = Head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(71, 126).addBox(-0.5F, -0.75F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.641F, -1.4153F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r305 = Head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(66, 126).addBox(0.0F, -0.75F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 24).addBox(0.0F, -0.75F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, -1.3443F, -0.5296F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r306 = Head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(27, 108).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2778F, -0.0906F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r307 = Head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(88, 126).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1304F, -0.6131F, 0.5498F, 0.0F, 0.0F));

		PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7557F, -2.4796F, 0.0436F, 0.0F, 0.0F));

		PartDefinition snout2 = snout.addOrReplaceChild("snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forehead = snout2.addOrReplaceChild("forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition forehead2 = forehead.addOrReplaceChild("forehead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9354F, -1.1362F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r308 = forehead2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(66, 129).addBox(-0.6652F, -2.7154F, -4.4332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, 1.1967F, 0.1159F, 0.0487F));

		PartDefinition cube_r309 = forehead2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(109, 112).addBox(-0.6652F, -0.5294F, -5.0298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, 0.6731F, 0.1159F, 0.0487F));

		PartDefinition cube_r310 = forehead2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(124, 130).addBox(-0.6652F, 0.1674F, -3.3931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, 0.455F, 0.1159F, 0.0487F));

		PartDefinition cube_r311 = forehead2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(129, 107).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(101, 129).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.9322F, 3.6949F, 6.9916F, 2.7313F, 0.0403F, -0.034F));

		PartDefinition cube_r312 = forehead2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(129, 89).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.901F, 3.3867F, 6.4777F, -2.112F, 0.0403F, -0.034F));

		PartDefinition cube_r313 = forehead2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(43, 111).addBox(-0.5F, -1.35F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8635F, 1.9452F, 6.7663F, -1.4575F, 0.0403F, -0.034F));

		PartDefinition cube_r314 = forehead2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(14, 125).addBox(-0.5F, -0.2F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(106, 129).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8275F, 0.8497F, 6.798F, 0.157F, 0.0403F, -0.034F));

		PartDefinition cube_r315 = forehead2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(53, 110).addBox(-0.5F, -0.95F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.8635F, 1.9452F, 6.7663F, -0.8466F, 0.0403F, -0.034F));

		PartDefinition cube_r316 = forehead2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(106, 102).addBox(-0.9333F, 1.6179F, -2.1748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, -0.1915F, 0.0521F, -0.0094F));

		PartDefinition cube_r317 = forehead2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(106, 53).addBox(-0.9333F, 1.2018F, -2.5382F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, -0.0519F, 0.0521F, -0.0094F));

		PartDefinition cube_r318 = forehead2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(23, 78).addBox(-0.7802F, -0.1818F, -4.9531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, 0.4674F, 0.1116F, 0.0018F));

		PartDefinition cube_r319 = forehead2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(106, 48).addBox(-0.7802F, 0.8986F, -5.2917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, 0.0747F, 0.1116F, 0.0018F));

		PartDefinition cube_r320 = forehead2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(5, 130).addBox(-0.225F, -0.6F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(119, 129).addBox(-0.225F, -0.2F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(96, 124).addBox(-0.225F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.501F, 2.7486F, -6.9763F, -0.2738F, 0.1253F, -0.2812F));

		PartDefinition cube_r321 = forehead2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(43, 130).addBox(-0.425F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(130, 31).addBox(-0.425F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1331F, 2.6081F, -5.0607F, -0.3754F, 0.0686F, -0.4284F));

		PartDefinition cube_r322 = forehead2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(130, 77).addBox(-0.5F, 0.0F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(130, 74).addBox(-0.5F, -0.025F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(125, 97).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9742F, 2.7914F, 0.6491F, 0.0718F, 0.1601F, -0.2643F));

		PartDefinition cube_r323 = forehead2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(83, 125).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9741F, 3.0684F, 0.0381F, -0.0557F, 0.1253F, -0.2812F));

		PartDefinition cube_r324 = forehead2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(52, 130).addBox(-0.5F, -0.6889F, 0.4017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 125).addBox(-0.5F, -1.1889F, -0.1983F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5349F, 3.095F, -1.4133F, -0.1901F, 0.3103F, -0.2971F));

		PartDefinition cube_r325 = forehead2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(125, 31).addBox(-0.5F, -1.1018F, -0.8068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5349F, 3.095F, -1.4133F, -0.2317F, 0.276F, -0.2902F));

		PartDefinition cube_r326 = forehead2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(29, 125).addBox(-0.5F, -0.9706F, -1.4208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5349F, 3.095F, -1.4133F, -0.0135F, 0.276F, -0.2902F));

		PartDefinition cube_r327 = forehead2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(120, 32).addBox(-0.625F, -1.1F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1258F, 2.7827F, -3.08F, -0.012F, 0.1253F, -0.2812F));

		PartDefinition cube_r328 = forehead2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(24, 120).addBox(-0.575F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0518F, 2.7966F, -3.6752F, -0.1429F, 0.1253F, -0.2812F));

		PartDefinition cube_r329 = forehead2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(24, 125).addBox(-0.475F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0769F, 2.6546F, -4.3346F, -0.3736F, 0.0782F, -0.404F));

		PartDefinition cube_r330 = forehead2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(19, 125).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2164F, 2.5262F, -5.7158F, -0.1571F, 0.107F, -0.4028F));

		PartDefinition cube_r331 = forehead2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 130).addBox(-0.55F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2419F, 2.3416F, -6.3034F, -0.1429F, 0.1253F, -0.2812F));

		PartDefinition cube_r332 = forehead2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(109, 93).addBox(-0.7104F, 3.1662F, 1.3966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, -1.556F, 0.1133F, 0.0285F));

		PartDefinition cube_r333 = forehead2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(76, 129).addBox(-0.7104F, 4.6852F, 0.9746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, -1.2506F, 0.1133F, 0.0285F));

		PartDefinition cube_r334 = forehead2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(71, 129).addBox(-0.7104F, 4.2141F, -3.6452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(2.307F, -0.105F, 7.3177F, -0.4215F, 0.1133F, 0.0285F));

		PartDefinition cube_r335 = forehead2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(114, 129).addBox(-0.2537F, -1.1724F, -1.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(86, 129).addBox(-0.2537F, -1.1724F, -1.2043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F))
				.texOffs(81, 129).addBox(-0.2537F, -1.1724F, -0.7043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.5893F, 2.8544F, -6.3213F, -0.0044F, 0.0522F, 0.0109F));

		PartDefinition cube_r336 = forehead2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(72, 116).addBox(-0.332F, -1.2647F, -1.5331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.4235F, 2.862F, -5.0165F, 0.0654F, 0.0609F, 0.0109F));

		PartDefinition cube_r337 = forehead2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(108, 4).addBox(-0.8F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2097F, 1.8556F, -3.8467F, 0.0508F, 0.1203F, 0.934F));

		PartDefinition cube_r338 = forehead2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(-0.0901F, 1.9521F, -3.8193F, -0.065F, 0.1133F, 0.0109F));

		PartDefinition cube_r339 = forehead2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(74, 107).addBox(-0.864F, -0.6991F, -0.3892F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.13F, 2.273F, -5.0738F, -0.2395F, 0.1133F, 0.0109F));

		PartDefinition cube_r340 = forehead2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(116, 115).addBox(-1.3F, -0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F))
				.texOffs(116, 111).addBox(-0.8F, -0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4988F, 1.9111F, -2.2117F, 0.2253F, 0.1526F, 0.9067F));

		PartDefinition cube_r341 = forehead2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(109, 116).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.208F, 2.2578F, -2.1235F, 0.0241F, 0.2704F, 0.0113F));

		PartDefinition cube_r342 = forehead2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(60, 116).addBox(-1.213F, 0.1022F, 1.848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.13F, 2.273F, -5.0738F, 0.1113F, 0.2704F, 0.0113F));

		PartDefinition cube_r343 = forehead2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(57, 130).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5F, -0.0551F, 3.6611F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r344 = forehead2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(57, 130).addBox(-0.7201F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(128, 122).addBox(-0.8799F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7314F, 0.5611F, 1.3312F, -1.5194F, 0.4676F, -0.2741F));

		PartDefinition cube_r345 = forehead2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(109, 73).addBox(-1.8F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9709F, 1.9024F, -0.6992F, 0.2483F, 0.2365F, 0.9186F));

		PartDefinition cube_r346 = forehead2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(116, 93).addBox(-1.4709F, -0.7009F, 3.3909F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.213F))
				.texOffs(41, 116).addBox(-1.4709F, -0.4009F, 3.3909F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.13F, 2.273F, -5.0738F, -0.0274F, 0.3402F, 0.0115F));

		PartDefinition cube_r347 = forehead2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(104, 107).addBox(-0.7453F, -0.9331F, 5.0055F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.13F, 2.273F, -5.0738F, -0.0727F, 0.2006F, 0.0111F));

		PartDefinition cube_r348 = forehead2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(93, 128).addBox(-0.4995F, -0.824F, 0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(125, 127).addBox(-0.4995F, -0.824F, 0.1246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(0.1016F, 0.2558F, 1.9358F, -0.3857F, 0.3053F, 0.0114F));

		PartDefinition cube_r349 = forehead2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(130, 95).addBox(-0.4995F, -0.6754F, -0.2815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1016F, 0.2558F, 1.9358F, -0.0366F, 0.3053F, 0.0114F));

		PartDefinition cube_r350 = forehead2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(118, 97).addBox(-0.4995F, -0.6694F, -1.6893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1016F, 0.2558F, 1.9358F, 0.3638F, 0.218F, 0.0111F));

		PartDefinition cube_r351 = forehead2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(89, 116).addBox(-0.7453F, 2.9123F, 5.5076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.13F, 2.273F, -5.0738F, 0.5382F, 0.2006F, 0.0111F));

		PartDefinition cube_r352 = forehead2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(95, 107).addBox(-0.7453F, 1.2632F, 5.0179F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.13F, 2.273F, -5.0738F, 0.2764F, 0.2006F, 0.0111F));

		PartDefinition cube_r353 = forehead2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(44, 106).addBox(-0.7453F, -0.8658F, 4.9477F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.13F, 2.273F, -5.0738F, -0.1163F, 0.2006F, 0.0111F));

		PartDefinition cube_r354 = forehead2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(106, 33).addBox(-0.1F, -0.2F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0329F, 2.4446F, 7.687F, -0.1999F, 1.0664F, -0.0955F));

		PartDefinition cube_r355 = forehead2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(130, 113).addBox(0.59F, -0.9229F, -0.4702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.235F, 1.8031F, 7.6912F, -0.1008F, -0.085F, -0.7235F));

		PartDefinition cube_r356 = forehead2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(130, 127).addBox(1.1844F, -1.3979F, -0.2295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(130, 110).addBox(1.1844F, -1.9979F, -0.2295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.235F, 1.8031F, 7.6912F, 0.3127F, -0.006F, -1.3978F));

		PartDefinition cube_r357 = forehead2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(129, 130).addBox(1.0041F, -1.3164F, -0.3949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.235F, 1.8031F, 7.6912F, 0.1469F, -0.0751F, -1.1815F));

		PartDefinition cube_r358 = forehead2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(130, 98).addBox(0.59F, -1.4536F, -0.3005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.235F, 1.8031F, 7.6912F, 0.1217F, -0.085F, -0.7235F));

		PartDefinition cube_r359 = forehead2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(124, 89).addBox(-0.475F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9428F, 3.6187F, 7.71F, 0.3009F, 0.016F, -0.0777F));

		PartDefinition cube_r360 = forehead2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(61, 126).addBox(0.0745F, -1.2937F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.235F, 1.8031F, 7.6912F, -0.1124F, -0.1191F, 0.0624F));

		PartDefinition cube_r361 = forehead2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(27, 112).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.0179F, 2.5049F, 0.1483F, 0.2418F, 0.0358F));

		PartDefinition cube_r362 = forehead2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(130, 116).addBox(-0.3745F, 0.2194F, -0.6494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9676F, 1.0882F, 3.5351F, 0.5696F, 0.1573F, -0.7259F));

		PartDefinition cube_r363 = forehead2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(128, 119).addBox(-0.5495F, -0.0703F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(5, 127).addBox(-0.5495F, -0.2703F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(106, 126).addBox(-0.5495F, -1.2703F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.9676F, 1.0882F, 3.5351F, 0.046F, 0.1573F, -0.7259F));

		PartDefinition cube_r364 = forehead2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(130, 92).addBox(-0.5495F, 0.013F, -0.7176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9676F, 1.0882F, 3.5351F, -0.3467F, 0.1573F, -0.7259F));

		PartDefinition cube_r365 = forehead2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(104, 65).addBox(-0.9F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.0997F, -3.3104F, 0.0354F, 0.0388F, -0.1033F));

		PartDefinition cube_r366 = forehead2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(104, 60).addBox(-0.9F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 1.0997F, -3.3104F, 0.0393F, 0.0349F, 0.0014F));

		PartDefinition cube_r367 = forehead2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(127, 59).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1294F, 1.5897F, -3.2809F, 0.8446F, -1.2931F, -1.0928F));

		PartDefinition cube_r368 = forehead2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(34, 98).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.269F, 0.5256F, 0.2067F, 0.0549F, -0.2561F));

		PartDefinition cube_r369 = forehead2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(109, 77).addBox(-1.7F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.233F)), PartPose.offsetAndRotation(1.1526F, 2.5256F, 2.215F, -0.0656F, 0.0697F, -0.0046F));

		PartDefinition cube_r370 = forehead2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(96, 74).addBox(-0.3F, -1.0989F, -2.3796F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(-0.5F, 3.0588F, 1.1919F, -0.067F, 0.2177F, -0.0145F));

		PartDefinition forehead3 = forehead.addOrReplaceChild("forehead3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.9354F, -1.1362F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r371 = forehead3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(66, 129).mirror().addBox(-0.3348F, -2.7154F, -4.4332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, 1.1967F, -0.1159F, -0.0487F));

		PartDefinition cube_r372 = forehead3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(109, 112).mirror().addBox(-0.3348F, -0.5294F, -5.0298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, 0.6731F, -0.1159F, -0.0487F));

		PartDefinition cube_r373 = forehead3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(124, 130).mirror().addBox(-0.3348F, 0.1674F, -3.3931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, 0.455F, -0.1159F, -0.0487F));

		PartDefinition cube_r374 = forehead3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(129, 107).mirror().addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(101, 129).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.9322F, 3.6949F, 6.9916F, 2.7313F, -0.0403F, 0.034F));

		PartDefinition cube_r375 = forehead3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(129, 89).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.901F, 3.3867F, 6.4777F, -2.112F, -0.0403F, 0.034F));

		PartDefinition cube_r376 = forehead3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(43, 111).mirror().addBox(-0.5F, -1.35F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8635F, 1.9452F, 6.7663F, -1.4575F, -0.0403F, 0.034F));

		PartDefinition cube_r377 = forehead3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(14, 125).mirror().addBox(-0.5F, -0.2F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(106, 129).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8275F, 0.8497F, 6.798F, 0.157F, -0.0403F, 0.034F));

		PartDefinition cube_r378 = forehead3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(53, 110).mirror().addBox(-0.5F, -0.95F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.8635F, 1.9452F, 6.7663F, -0.8466F, -0.0403F, 0.034F));

		PartDefinition cube_r379 = forehead3.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(106, 102).mirror().addBox(-0.0667F, 1.6179F, -2.1748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, -0.1915F, -0.0521F, 0.0094F));

		PartDefinition cube_r380 = forehead3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(106, 53).mirror().addBox(-0.0667F, 1.2018F, -2.5382F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, -0.0519F, -0.0521F, 0.0094F));

		PartDefinition cube_r381 = forehead3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(23, 78).mirror().addBox(-0.2198F, -0.1818F, -4.9531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, 0.4674F, -0.1116F, -0.0018F));

		PartDefinition cube_r382 = forehead3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(106, 48).mirror().addBox(-0.2198F, 0.8986F, -5.2917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, 0.0747F, -0.1116F, -0.0018F));

		PartDefinition cube_r383 = forehead3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(5, 130).mirror().addBox(-0.775F, -0.6F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(119, 129).mirror().addBox(-0.775F, -0.2F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(96, 124).mirror().addBox(-0.775F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.501F, 2.7486F, -6.9763F, -0.2738F, -0.1253F, 0.2812F));

		PartDefinition cube_r384 = forehead3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(43, 130).mirror().addBox(-0.575F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(130, 31).mirror().addBox(-0.575F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1331F, 2.6081F, -5.0607F, -0.3754F, -0.0686F, 0.4284F));

		PartDefinition cube_r385 = forehead3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(130, 77).mirror().addBox(-0.5F, 0.0F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(130, 74).mirror().addBox(-0.5F, -0.025F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(125, 97).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9742F, 2.7914F, 0.6491F, 0.0718F, -0.1601F, 0.2643F));

		PartDefinition cube_r386 = forehead3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(83, 125).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9741F, 3.0684F, 0.0381F, -0.0557F, -0.1253F, 0.2812F));

		PartDefinition cube_r387 = forehead3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(52, 130).mirror().addBox(-0.5F, -0.6889F, 0.4017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(34, 125).mirror().addBox(-0.5F, -1.1889F, -0.1983F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5349F, 3.095F, -1.4133F, -0.1901F, -0.3103F, 0.2971F));

		PartDefinition cube_r388 = forehead3.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(125, 31).mirror().addBox(-0.5F, -1.1018F, -0.8068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5349F, 3.095F, -1.4133F, -0.2317F, -0.276F, 0.2902F));

		PartDefinition cube_r389 = forehead3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(29, 125).mirror().addBox(-0.5F, -0.9706F, -1.4208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5349F, 3.095F, -1.4133F, -0.0135F, -0.276F, 0.2902F));

		PartDefinition cube_r390 = forehead3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(120, 32).mirror().addBox(-0.375F, -1.1F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1258F, 2.7827F, -3.08F, -0.012F, -0.1253F, 0.2812F));

		PartDefinition cube_r391 = forehead3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(24, 120).mirror().addBox(-0.425F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0518F, 2.7966F, -3.6752F, -0.1429F, -0.1253F, 0.2812F));

		PartDefinition cube_r392 = forehead3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(24, 125).mirror().addBox(-0.525F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0769F, 2.6546F, -4.3346F, -0.3736F, -0.0782F, 0.404F));

		PartDefinition cube_r393 = forehead3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(19, 125).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2164F, 2.5262F, -5.7158F, -0.1571F, -0.107F, 0.4028F));

		PartDefinition cube_r394 = forehead3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-0.45F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2419F, 2.3416F, -6.3034F, -0.1429F, -0.1253F, 0.2812F));

		PartDefinition cube_r395 = forehead3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(109, 93).mirror().addBox(-0.2896F, 3.1662F, 1.3966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, -1.556F, -0.1133F, -0.0285F));

		PartDefinition cube_r396 = forehead3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(76, 129).mirror().addBox(-0.2896F, 4.6852F, 0.9746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, -1.2506F, -0.1133F, -0.0285F));

		PartDefinition cube_r397 = forehead3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(71, 129).mirror().addBox(-0.2896F, 4.2141F, -3.6452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(-2.307F, -0.105F, 7.3177F, -0.4215F, -0.1133F, -0.0285F));

		PartDefinition cube_r398 = forehead3.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(114, 129).mirror().addBox(-0.7463F, -1.1724F, -1.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(86, 129).mirror().addBox(-0.7463F, -1.1724F, -1.2043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false)
				.texOffs(81, 129).mirror().addBox(-0.7463F, -1.1724F, -0.7043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.5893F, 2.8544F, -6.3213F, -0.0044F, -0.0522F, -0.0109F));

		PartDefinition cube_r399 = forehead3.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(72, 116).mirror().addBox(-0.668F, -1.2647F, -1.5331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.4235F, 2.862F, -5.0165F, 0.0654F, -0.0609F, -0.0109F));

		PartDefinition cube_r400 = forehead3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(108, 4).mirror().addBox(-0.2F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.2097F, 1.8556F, -3.8467F, 0.0508F, -0.1203F, -0.934F));

		PartDefinition cube_r401 = forehead3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.0901F, 1.9521F, -3.8193F, -0.065F, -0.1133F, -0.0109F));

		PartDefinition cube_r402 = forehead3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(74, 107).mirror().addBox(-0.136F, -0.6991F, -0.3892F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.13F, 2.273F, -5.0738F, -0.2395F, -0.1133F, -0.0109F));

		PartDefinition cube_r403 = forehead3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(116, 115).mirror().addBox(0.3F, -0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)).mirror(false)
				.texOffs(116, 111).mirror().addBox(-0.2F, -0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.4988F, 1.9111F, -2.2117F, 0.2253F, -0.1526F, -0.9067F));

		PartDefinition cube_r404 = forehead3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(109, 116).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.208F, 2.2578F, -2.1235F, 0.0241F, -0.2704F, -0.0113F));

		PartDefinition cube_r405 = forehead3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(60, 116).mirror().addBox(0.213F, 0.1022F, 1.848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(-0.13F, 2.273F, -5.0738F, 0.1113F, -0.2704F, -0.0113F));

		PartDefinition cube_r406 = forehead3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(57, 130).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.0551F, 3.6611F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r407 = forehead3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(57, 130).mirror().addBox(-0.2799F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(128, 122).mirror().addBox(-0.1201F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7314F, 0.5611F, 1.3312F, -1.5194F, -0.4676F, 0.2741F));

		PartDefinition cube_r408 = forehead3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(109, 73).mirror().addBox(-0.2F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9709F, 1.9024F, -0.6992F, 0.2483F, -0.2365F, -0.9186F));

		PartDefinition cube_r409 = forehead3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(116, 93).mirror().addBox(0.4709F, -0.7009F, 3.3909F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.213F)).mirror(false)
				.texOffs(41, 116).mirror().addBox(0.4709F, -0.4009F, 3.3909F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.13F, 2.273F, -5.0738F, -0.0274F, -0.3402F, -0.0115F));

		PartDefinition cube_r410 = forehead3.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(104, 107).mirror().addBox(-0.2547F, -0.9331F, 5.0055F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.13F, 2.273F, -5.0738F, -0.0727F, -0.2006F, -0.0111F));

		PartDefinition cube_r411 = forehead3.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(93, 128).mirror().addBox(-0.5005F, -0.824F, 0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(125, 127).mirror().addBox(-0.5005F, -0.824F, 0.1246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(-0.1016F, 0.2558F, 1.9358F, -0.3857F, -0.3053F, -0.0114F));

		PartDefinition cube_r412 = forehead3.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(130, 95).mirror().addBox(-0.5005F, -0.6754F, -0.2815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1016F, 0.2558F, 1.9358F, -0.0366F, -0.3053F, -0.0114F));

		PartDefinition cube_r413 = forehead3.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(118, 97).mirror().addBox(-0.5005F, -0.6694F, -1.6893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1016F, 0.2558F, 1.9358F, 0.3638F, -0.218F, -0.0111F));

		PartDefinition cube_r414 = forehead3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(89, 116).mirror().addBox(-0.2547F, 2.9123F, 5.5076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.13F, 2.273F, -5.0738F, 0.5382F, -0.2006F, -0.0111F));

		PartDefinition cube_r415 = forehead3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(95, 107).mirror().addBox(-0.2547F, 1.2632F, 5.0179F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(-0.13F, 2.273F, -5.0738F, 0.2764F, -0.2006F, -0.0111F));

		PartDefinition cube_r416 = forehead3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(44, 106).mirror().addBox(-0.2547F, -0.8658F, 4.9477F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.13F, 2.273F, -5.0738F, -0.1163F, -0.2006F, -0.0111F));

		PartDefinition cube_r417 = forehead3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(106, 33).mirror().addBox(-0.9F, -0.2F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0329F, 2.4446F, 7.687F, -0.1999F, -1.0664F, 0.0955F));

		PartDefinition cube_r418 = forehead3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(130, 113).mirror().addBox(-1.59F, -0.9229F, -0.4702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.235F, 1.8031F, 7.6912F, -0.1008F, 0.085F, 0.7235F));

		PartDefinition cube_r419 = forehead3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(130, 127).mirror().addBox(-2.1844F, -1.3979F, -0.2295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(130, 110).mirror().addBox(-2.1844F, -1.9979F, -0.2295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.235F, 1.8031F, 7.6912F, 0.3127F, 0.006F, 1.3978F));

		PartDefinition cube_r420 = forehead3.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(129, 130).mirror().addBox(-2.0041F, -1.3164F, -0.3949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.235F, 1.8031F, 7.6912F, 0.1469F, 0.0751F, 1.1815F));

		PartDefinition cube_r421 = forehead3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(130, 98).mirror().addBox(-1.59F, -1.4536F, -0.3005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.235F, 1.8031F, 7.6912F, 0.1217F, 0.085F, 0.7235F));

		PartDefinition cube_r422 = forehead3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(124, 89).mirror().addBox(-0.525F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9428F, 3.6187F, 7.71F, 0.3009F, -0.016F, 0.0777F));

		PartDefinition cube_r423 = forehead3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(61, 126).mirror().addBox(-1.0745F, -1.2937F, -0.5554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.235F, 1.8031F, 7.6912F, -0.1124F, 0.1191F, -0.0624F));

		PartDefinition cube_r424 = forehead3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(27, 112).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0179F, 2.5049F, 0.1483F, -0.2418F, -0.0358F));

		PartDefinition cube_r425 = forehead3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(130, 116).mirror().addBox(-0.6255F, 0.2194F, -0.6494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9676F, 1.0882F, 3.5351F, 0.5696F, -0.1573F, 0.7259F));

		PartDefinition cube_r426 = forehead3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(128, 119).mirror().addBox(-0.4505F, -0.0703F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(5, 127).mirror().addBox(-0.4505F, -0.2703F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(106, 126).mirror().addBox(-0.4505F, -1.2703F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9676F, 1.0882F, 3.5351F, 0.046F, -0.1573F, 0.7259F));

		PartDefinition cube_r427 = forehead3.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(130, 92).mirror().addBox(-0.4505F, 0.013F, -0.7176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9676F, 1.0882F, 3.5351F, -0.3467F, -0.1573F, 0.7259F));

		PartDefinition cube_r428 = forehead3.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(104, 65).mirror().addBox(-0.1F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0997F, -3.3104F, 0.0354F, -0.0388F, 0.1033F));

		PartDefinition cube_r429 = forehead3.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(104, 60).mirror().addBox(-0.1F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0997F, -3.3104F, 0.0393F, -0.0349F, -0.0014F));

		PartDefinition cube_r430 = forehead3.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(127, 59).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1294F, 1.5897F, -3.2809F, 0.8446F, 1.2931F, 1.0928F));

		PartDefinition cube_r431 = forehead3.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(34, 98).mirror().addBox(0.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.269F, 0.5256F, 0.2067F, -0.0549F, 0.2561F));

		PartDefinition cube_r432 = forehead3.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(109, 77).mirror().addBox(-0.3F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.233F)).mirror(false), PartPose.offsetAndRotation(-1.1526F, 2.5256F, 2.215F, -0.0656F, -0.0697F, 0.0046F));

		PartDefinition cube_r433 = forehead3.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(96, 74).mirror().addBox(-1.7F, -1.0989F, -2.3796F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.0588F, 1.1919F, -0.067F, -0.2177F, 0.0145F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 2.2556F, 0.4423F, 0.7251F, 0.0F, 0.0F));

		PartDefinition cube_r434 = Jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(65, 107).mirror().addBox(-0.0678F, 0.1863F, -3.8511F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(117, 0).mirror().addBox(-0.0678F, 0.7863F, -3.9511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -0.368F, -0.1055F, 0.0272F));

		PartDefinition cube_r435 = Jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-0.0678F, -0.0436F, -1.5872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -0.1498F, -0.1055F, 0.0272F));

		PartDefinition cube_r436 = Jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(9, 108).mirror().addBox(-0.0678F, 0.4144F, -2.9493F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.192F)).mirror(false)
				.texOffs(18, 108).mirror().addBox(-0.0678F, 0.0144F, -3.9493F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -0.0888F, -0.1055F, 0.0272F));

		PartDefinition cube_r437 = Jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(10, 129).mirror().addBox(-0.0678F, 0.2951F, -0.2542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -0.6734F, -0.1055F, 0.0272F));

		PartDefinition cube_r438 = Jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(108, 20).mirror().addBox(-0.0678F, 0.8295F, -5.3255F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -0.2458F, -0.1055F, 0.0272F));

		PartDefinition cube_r439 = Jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(80, 103).mirror().addBox(-0.0678F, 1.401F, -3.6558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -0.7607F, -0.1055F, 0.0272F));

		PartDefinition cube_r440 = Jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(112, 15).mirror().addBox(-0.0678F, 2.8159F, -3.1261F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.2407F, -0.1055F, 0.0272F));

		PartDefinition cube_r441 = Jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(51, 125).mirror().addBox(-0.0678F, 4.6821F, -1.6026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 64).mirror().addBox(-0.0678F, 4.6821F, -1.0026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.5461F, -0.1055F, 0.0272F));

		PartDefinition cube_r442 = Jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-0.0678F, 4.6469F, 0.1399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.677F, -0.1055F, 0.0272F));

		PartDefinition cube_r443 = Jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(76, 10).mirror().addBox(-0.6341F, 6.3099F, -1.1337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.6183F, -0.1927F, 0.0276F));

		PartDefinition cube_r444 = Jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(121, 8).mirror().addBox(-0.6341F, 6.216F, 0.2661F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(12, 121).mirror().addBox(-0.6341F, 6.216F, -0.3339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.6969F, -0.1927F, 0.0276F));

		PartDefinition cube_r445 = Jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(84, 119).mirror().addBox(-1.3263F, 7.8386F, -1.0822F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.6253F, -0.2796F, 0.0285F));

		PartDefinition cube_r446 = Jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(7, 117).mirror().addBox(-1.3263F, 7.8494F, -0.3269F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.6384F, -0.2796F, 0.0285F));

		PartDefinition cube_r447 = Jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(40, 120).mirror().addBox(-1.3292F, 7.7498F, 0.277F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.6994F, -0.28F, 0.0282F));

		PartDefinition cube_r448 = Jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(67, 112).mirror().addBox(-1.3292F, 7.7618F, -0.4269F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.6557F, -0.28F, 0.0282F));

		PartDefinition cube_r449 = Jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(39, 125).mirror().addBox(1.0998F, 11.2006F, 0.7984F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(115, 125).mirror().addBox(1.0998F, 11.1756F, 0.1984F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.7372F, -0.0702F, 0.0274F));

		PartDefinition cube_r450 = Jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(45, 120).mirror().addBox(1.0998F, 12.4517F, 1.9921F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(78, 125).mirror().addBox(1.0998F, 12.4517F, 2.5922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.8768F, -0.0702F, 0.0274F));

		PartDefinition cube_r451 = Jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(56, 126).mirror().addBox(1.0998F, 10.4881F, 4.6738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -2.1299F, -0.0702F, 0.0274F));

		PartDefinition cube_r452 = Jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(15, 129).mirror().addBox(1.0998F, -1.1771F, 13.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, 2.9316F, -0.0702F, 0.0274F));

		PartDefinition cube_r453 = Jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(126, 86).mirror().addBox(1.0998F, -4.0466F, -14.6857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, 0.0954F, -0.0702F, 0.0274F));

		PartDefinition cube_r454 = Jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(127, 101).mirror().addBox(1.0998F, -14.3681F, 1.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, 1.579F, -0.0702F, 0.0274F));

		PartDefinition cube_r455 = Jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(120, 125).mirror().addBox(1.0998F, 14.272F, 0.4874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.7808F, -0.0702F, 0.0274F));

		PartDefinition cube_r456 = Jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(20, 129).mirror().addBox(1.0998F, 5.5964F, -13.9796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -0.5242F, -0.0702F, 0.0274F));

		PartDefinition cube_r457 = Jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(25, 129).mirror().addBox(1.0998F, -13.2596F, -8.892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, 0.8721F, -0.0702F, 0.0274F));

		PartDefinition cube_r458 = Jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(30, 129).mirror().addBox(1.0998F, -8.892F, 12.8596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, 2.4429F, -0.0702F, 0.0274F));

		PartDefinition cube_r459 = Jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-1.4393F, 10.9386F, -1.8435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(7, 113).mirror().addBox(-1.3893F, 10.2386F, -1.7435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(72, 112).mirror().addBox(-1.4143F, 9.6386F, -1.7435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 112).mirror().addBox(-1.4393F, 9.0386F, -1.7435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.6008F, -1.6051F, -0.2827F, -0.0441F));

		PartDefinition cube_r460 = Jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(117, 4).mirror().addBox(0.692F, 11.554F, -1.9288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.6008F, -1.6012F, -0.1226F, -0.1898F));

		PartDefinition cube_r461 = Jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(12, 117).mirror().addBox(0.4016F, 11.8046F, 1.463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.8812F, -0.164F, -0.3484F));

		PartDefinition cube_r462 = Jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(118, 80).mirror().addBox(0.587F, 12.4757F, 1.7288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.9301F, -0.1533F, -0.3147F));

		PartDefinition cube_r463 = Jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(92, 112).mirror().addBox(0.562F, 13.437F, -1.7943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.6247F, -0.1533F, -0.3147F));

		PartDefinition cube_r464 = Jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(14, 113).mirror().addBox(0.487F, 13.9885F, -2.2276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(117, 20).mirror().addBox(0.487F, 14.5885F, -2.2276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.581F, -0.1533F, -0.3147F));

		PartDefinition cube_r465 = Jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(117, 28).mirror().addBox(0.587F, 14.637F, -4.8832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4841F, 0.0804F, 0.3008F, -1.4065F, -0.1533F, -0.3147F));

		PartDefinition cube_r466 = Jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(10, 129).addBox(-0.9322F, 0.2951F, -0.2542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -0.6734F, 0.1055F, -0.0272F));

		PartDefinition cube_r467 = Jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(18, 108).addBox(-0.9322F, 0.0144F, -3.9493F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F))
				.texOffs(9, 108).addBox(-0.9322F, 0.4144F, -2.9493F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -0.0888F, 0.1055F, -0.0272F));

		PartDefinition cube_r468 = Jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(108, 20).addBox(-0.9322F, 0.8295F, -5.3255F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -0.2458F, 0.1055F, -0.0272F));

		PartDefinition cube_r469 = Jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(0, 117).addBox(-0.9322F, -0.0436F, -1.5872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -0.1498F, 0.1055F, -0.0272F));

		PartDefinition cube_r470 = Jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(117, 0).addBox(-0.9322F, 0.7863F, -3.9511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(65, 107).addBox(-0.9322F, 0.1863F, -3.8511F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -0.368F, 0.1055F, -0.0272F));

		PartDefinition cube_r471 = Jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(12, 121).addBox(-0.3659F, 6.216F, -0.3339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(121, 8).addBox(-0.3659F, 6.216F, 0.2661F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.6969F, 0.1927F, -0.0276F));

		PartDefinition cube_r472 = Jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(67, 112).addBox(0.3292F, 7.7618F, -0.4269F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.6557F, 0.28F, -0.0282F));

		PartDefinition cube_r473 = Jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(40, 120).addBox(0.3292F, 7.7498F, 0.277F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.6994F, 0.28F, -0.0282F));

		PartDefinition cube_r474 = Jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(0, 121).addBox(-0.9322F, 4.6469F, 0.1399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.677F, 0.1055F, -0.0272F));

		PartDefinition cube_r475 = Jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(125, 64).addBox(-0.9322F, 4.6821F, -1.0026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(51, 125).addBox(-0.9322F, 4.6821F, -1.6026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.5461F, 0.1055F, -0.0272F));

		PartDefinition cube_r476 = Jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(30, 129).addBox(-2.0998F, -8.892F, 12.8596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, 2.4429F, 0.0702F, -0.0274F));

		PartDefinition cube_r477 = Jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(25, 129).addBox(-2.0998F, -13.2596F, -8.892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, 0.8721F, 0.0702F, -0.0274F));

		PartDefinition cube_r478 = Jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(20, 129).addBox(-2.0998F, 5.5964F, -13.9796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -0.5242F, 0.0702F, -0.0274F));

		PartDefinition cube_r479 = Jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(78, 125).addBox(-2.0998F, 12.4517F, 2.5922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(45, 120).addBox(-2.0998F, 12.4517F, 1.9921F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.8768F, 0.0702F, -0.0274F));

		PartDefinition cube_r480 = Jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(127, 101).addBox(-2.0998F, -14.3681F, 1.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, 1.579F, 0.0702F, -0.0274F));

		PartDefinition cube_r481 = Jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(120, 125).addBox(-2.0998F, 14.272F, 0.4874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.7808F, 0.0702F, -0.0274F));

		PartDefinition cube_r482 = Jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(126, 86).addBox(-2.0998F, -4.0466F, -14.6857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, 0.0954F, 0.0702F, -0.0274F));

		PartDefinition cube_r483 = Jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(15, 129).addBox(-2.0998F, -1.1771F, 13.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, 2.9316F, 0.0702F, -0.0274F));

		PartDefinition cube_r484 = Jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(56, 126).addBox(-2.0998F, 10.4881F, 4.6738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -2.1299F, 0.0702F, -0.0274F));

		PartDefinition cube_r485 = Jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(115, 125).addBox(-2.0998F, 11.1756F, 0.1984F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 125).addBox(-2.0998F, 11.2006F, 0.7984F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.7372F, 0.0702F, -0.0274F));

		PartDefinition cube_r486 = Jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(7, 117).addBox(0.3263F, 7.8494F, -0.3269F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.6384F, 0.2796F, -0.0285F));

		PartDefinition cube_r487 = Jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(60, 112).addBox(0.4393F, 9.0386F, -1.7435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(72, 112).addBox(0.4143F, 9.6386F, -1.7435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(7, 113).addBox(0.3893F, 10.2386F, -1.7435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 113).addBox(0.4393F, 10.9386F, -1.8435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.6008F, -1.6051F, 0.2827F, 0.0441F));

		PartDefinition cube_r488 = Jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(117, 28).addBox(-1.587F, 14.637F, -4.8832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.4065F, 0.1533F, 0.3147F));

		PartDefinition cube_r489 = Jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(117, 20).addBox(-1.487F, 14.5885F, -2.2276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(14, 113).addBox(-1.487F, 13.9885F, -2.2276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.581F, 0.1533F, 0.3147F));

		PartDefinition cube_r490 = Jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(92, 112).addBox(-1.562F, 13.437F, -1.7943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.6247F, 0.1533F, 0.3147F));

		PartDefinition cube_r491 = Jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(118, 80).addBox(-1.587F, 12.4757F, 1.7288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.9301F, 0.1533F, 0.3147F));

		PartDefinition cube_r492 = Jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(12, 117).addBox(-1.4016F, 11.8046F, 1.463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.8812F, 0.164F, 0.3484F));

		PartDefinition cube_r493 = Jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(117, 4).addBox(-1.692F, 11.554F, -1.9288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.6008F, -1.6012F, 0.1226F, 0.1898F));

		PartDefinition cube_r494 = Jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(84, 119).addBox(0.3263F, 7.8386F, -1.0822F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.6253F, 0.2796F, -0.0285F));

		PartDefinition cube_r495 = Jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(76, 10).addBox(-0.3659F, 6.3099F, -1.1337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.6183F, 0.1927F, -0.0276F));

		PartDefinition cube_r496 = Jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(112, 15).addBox(-0.9322F, 2.8159F, -3.1261F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -1.2407F, 0.1055F, -0.0272F));

		PartDefinition cube_r497 = Jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(80, 103).addBox(-0.9322F, 1.401F, -3.6558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2841F, 0.0804F, 0.3008F, -0.7607F, 0.1055F, -0.0272F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.7853F, 10.1441F, -8.6801F, -0.3566F, 0.0593F, -0.303F));

		PartDefinition cube_r498 = FrontFlipperR2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(119, 15).addBox(-2.0154F, -0.4899F, -0.0344F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2577F, -0.1912F, -1.5936F, 0.0F, 0.0087F, 0.0F));

		PartDefinition cube_r499 = FrontFlipperR2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(106, 38).addBox(-2.0F, -0.5F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(3.2607F, -0.1811F, -1.7777F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r500 = FrontFlipperR2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(117, 57).addBox(-1.0F, -0.5F, 0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.6215F, -0.1811F, 0.8991F, 3.1407F, 0.4363F, -3.1397F));

		PartDefinition cube_r501 = FrontFlipperR2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(104, 70).addBox(-19.1684F, 3.1028F, -2.5567F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.8934F, -3.7839F, -18.3595F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r502 = FrontFlipperR2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(129, 51).addBox(-1.0272F, -0.4737F, -0.9964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2499F, -0.2075F, 0.2735F, 0.0F, -1.5272F, 0.0F));

		PartDefinition cube_r503 = FrontFlipperR2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(117, 42).addBox(-1.9527F, -0.4181F, -0.947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2474F, -0.263F, -0.8021F, 0.0F, -2.4871F, 0.0F));

		PartDefinition cube_r504 = FrontFlipperR2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(108, 89).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1426F, -0.1811F, 0.2569F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r505 = FrontFlipperR2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(94, 94).addBox(-5.6567F, 3.1028F, 15.9684F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4723F, -3.7839F, -17.8396F, 0.0F, 0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(0, 104).addBox(1.1884F, -0.3972F, -3.1294F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(129, 54).addBox(3.1884F, -0.3972F, 1.8706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 116).addBox(-0.2116F, -0.3972F, -2.6294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5701F, -0.2839F, -0.74F, -0.0184F, 0.0395F, -0.4367F));

		PartDefinition cube_r506 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(115, 53).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7884F, 0.1028F, 0.6706F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r507 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(22, 104).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0884F, 0.1028F, 0.1706F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r508 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(33, 62).addBox(-0.7519F, 3.9313F, -2.1709F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.56F, -3.8161F, -1.5147F, -0.0013F, 0.0697F, -0.0037F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(16.1695F, 0.0507F, -1.8509F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r509 = FrontFlipperEndR2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(49, 14).addBox(12.2938F, 3.9479F, -3.4778F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.8264F, -3.8638F, 2.4721F, -0.0018F, 0.0697F, -0.0035F));

		PartDefinition FrontFlipperR3 = Chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.7853F, 10.1441F, -8.6801F, -0.0817F, -0.0159F, 0.2638F));

		PartDefinition cube_r510 = FrontFlipperR3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(120, 48).addBox(0.0154F, -0.4899F, -0.0344F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.2577F, -0.1912F, -1.5936F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r511 = FrontFlipperR3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(108, 25).addBox(-2.0F, -0.5F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-3.2607F, -0.1811F, -1.7777F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r512 = FrontFlipperR3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(120, 45).addBox(-1.0F, -0.5F, 0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.6215F, -0.1811F, 0.8991F, 3.1407F, -0.4363F, 3.1397F));

		PartDefinition cube_r513 = FrontFlipperR3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(107, 98).addBox(15.1684F, 3.1028F, -2.5567F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.8934F, -3.7839F, -18.3595F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r514 = FrontFlipperR3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(130, 62).addBox(0.0272F, -0.4737F, -0.9964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2499F, -0.2075F, 0.2735F, 0.0F, 1.5272F, 0.0F));

		PartDefinition cube_r515 = FrontFlipperR3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(119, 24).addBox(-0.0473F, -0.4181F, -0.947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2474F, -0.263F, -0.8021F, 0.0F, 2.4871F, 0.0F));

		PartDefinition cube_r516 = FrontFlipperR3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(109, 81).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1426F, -0.1811F, 0.2569F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r517 = FrontFlipperR3.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(95, 0).addBox(0.6567F, 3.1028F, 15.9684F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4723F, -3.7839F, -17.8396F, 0.0F, -0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(11, 104).addBox(-4.1884F, -0.3972F, -3.1294F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(130, 65).addBox(-4.1884F, -0.3972F, 1.8706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 38).addBox(-0.7884F, -0.3972F, -2.6294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5701F, -0.2839F, -0.74F, -0.0184F, -0.0395F, 0.4367F));

		PartDefinition cube_r518 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(33, 117).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7884F, 0.1028F, 0.6706F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r519 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(33, 104).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0884F, 0.1028F, 0.1706F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r520 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(0, 63).addBox(-7.2481F, 3.9313F, -2.1709F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.56F, -3.8161F, -1.5147F, -0.0013F, -0.0697F, 0.0037F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.1695F, 0.0507F, -1.8509F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r521 = FrontFlipperEndR3.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(33, 55).addBox(-22.2938F, 3.9479F, -3.4778F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.8264F, -3.8638F, 2.4721F, -0.0018F, -0.0697F, 0.0035F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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